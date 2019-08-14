/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.misc_utilities.uninitialized_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_9;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_x;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_code;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.floatp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.file_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class xml_utilities extends SubLTranslatedFile implements V12 {
    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_36_initializer() {
        return list(new SubLObject[]{ list(makeInteger(65), makeInteger(90)), list(makeInteger(97), makeInteger(122)), list(makeInteger(192), makeInteger(214)), list(makeInteger(216), makeInteger(246)), list(makeInteger(248), makeInteger(255)), list(makeInteger(256), makeInteger(305)), list(makeInteger(308), makeInteger(318)), list(makeInteger(321), makeInteger(328)), list(makeInteger(330), makeInteger(382)), list(makeInteger(384), makeInteger(451)), list(makeInteger(461), makeInteger(496)), list(makeInteger(500), makeInteger(501)), list(makeInteger(506), makeInteger(535)), list(makeInteger(592), makeInteger(680)), list(makeInteger(699), makeInteger(705)), list(makeInteger(902), makeInteger(902)), list(makeInteger(904), makeInteger(906)), list(makeInteger(908), makeInteger(908)), list(makeInteger(910), makeInteger(929)), list(makeInteger(931), makeInteger(974)), list(makeInteger(976), makeInteger(982)), list(makeInteger(986), makeInteger(986)), list(makeInteger(988), makeInteger(988)), list(makeInteger(990), makeInteger(990)), list(makeInteger(992), makeInteger(992)), list(makeInteger(994), makeInteger(1011)), list(makeInteger(1025), makeInteger(1036)), list(makeInteger(1038), makeInteger(1103)), list(makeInteger(1105), makeInteger(1116)), list(makeInteger(1118), makeInteger(1153)), list(makeInteger(1168), makeInteger(1220)), list(makeInteger(1223), makeInteger(1224)), list(makeInteger(1227), makeInteger(1228)), list(makeInteger(1232), makeInteger(1259)), list(makeInteger(1262), makeInteger(1269)), list(makeInteger(1272), makeInteger(1273)), list(makeInteger(1329), makeInteger(1366)), list(makeInteger(1369), makeInteger(1369)), list(makeInteger(1377), makeInteger(1414)), list(makeInteger(1488), makeInteger(1514)), list(makeInteger(1520), makeInteger(1522)), list(makeInteger(1569), makeInteger(1594)), list(makeInteger(1601), makeInteger(1610)), list(makeInteger(1649), makeInteger(1719)), list(makeInteger(1722), makeInteger(1726)), list(makeInteger(1728), makeInteger(1742)), list(makeInteger(1744), makeInteger(1747)), list(makeInteger(1749), makeInteger(1749)), list(makeInteger(1765), makeInteger(1766)), list(makeInteger(2309), makeInteger(2361)), list(makeInteger(2365), makeInteger(2365)), list(makeInteger(2392), makeInteger(2401)), list(makeInteger(2437), makeInteger(2444)), list(makeInteger(2447), makeInteger(2448)), list(makeInteger(2451), makeInteger(2472)), list(makeInteger(2474), makeInteger(2480)), list(makeInteger(2482), makeInteger(2482)), list(makeInteger(2486), makeInteger(2489)), list(makeInteger(2524), makeInteger(2525)), list(makeInteger(2527), makeInteger(2529)), list(makeInteger(2544), makeInteger(2545)), list(makeInteger(2565), makeInteger(2570)), list(makeInteger(2575), makeInteger(2576)), list(makeInteger(2579), makeInteger(2600)), list(makeInteger(2602), makeInteger(2608)), list(makeInteger(2610), makeInteger(2611)), list(makeInteger(2613), makeInteger(2614)), list(makeInteger(2616), makeInteger(2617)), list(makeInteger(2649), makeInteger(2652)), list(makeInteger(2654), makeInteger(2654)), list(makeInteger(2674), makeInteger(2676)), list(makeInteger(2693), makeInteger(2699)), list(makeInteger(2701), makeInteger(2701)), list(makeInteger(2703), makeInteger(2705)), list(makeInteger(2707), makeInteger(2728)), list(makeInteger(2730), makeInteger(2736)), list(makeInteger(2738), makeInteger(2739)), list(makeInteger(2741), makeInteger(2745)), list(makeInteger(2749), makeInteger(2749)), list(makeInteger(2784), makeInteger(2784)), list(makeInteger(2821), makeInteger(2828)), list(makeInteger(2831), makeInteger(2832)), list(makeInteger(2835), makeInteger(2856)), list(makeInteger(2858), makeInteger(2864)), list(makeInteger(2866), makeInteger(2867)), list(makeInteger(2870), makeInteger(2873)), list(makeInteger(2877), makeInteger(2877)), list(makeInteger(2908), makeInteger(2909)), list(makeInteger(2911), makeInteger(2913)), list(makeInteger(2949), makeInteger(2954)), list(makeInteger(2958), makeInteger(2960)), list(makeInteger(2962), makeInteger(2965)), list(makeInteger(2969), makeInteger(2970)), list(makeInteger(2972), makeInteger(2972)), list(makeInteger(2974), makeInteger(2975)), list(makeInteger(2979), makeInteger(2980)), list(makeInteger(2984), makeInteger(2986)), list(makeInteger(2990), makeInteger(2997)), list(makeInteger(2999), makeInteger(3001)), list(makeInteger(3077), makeInteger(3084)), list(makeInteger(3086), makeInteger(3088)), list(makeInteger(3090), makeInteger(3112)), list(makeInteger(3114), makeInteger(3123)), list(makeInteger(3125), makeInteger(3129)), list(makeInteger(3168), makeInteger(3169)), list(makeInteger(3205), makeInteger(3212)), list(makeInteger(3214), makeInteger(3216)), list(makeInteger(3218), makeInteger(3240)), list(makeInteger(3242), makeInteger(3251)), list(makeInteger(3253), makeInteger(3257)), list(makeInteger(3294), makeInteger(3294)), list(makeInteger(3296), makeInteger(3297)), list(makeInteger(3333), makeInteger(3340)), list(makeInteger(3342), makeInteger(3344)), list(makeInteger(3346), makeInteger(3368)), list(makeInteger(3370), makeInteger(3385)), list(makeInteger(3424), makeInteger(3425)), list(makeInteger(3585), makeInteger(3630)), list(makeInteger(3632), makeInteger(3632)), list(makeInteger(3634), makeInteger(3635)), list(makeInteger(3648), makeInteger(3653)), list(makeInteger(3713), makeInteger(3714)), list(makeInteger(3716), makeInteger(3716)), list(makeInteger(3719), makeInteger(3720)), list(makeInteger(3722), makeInteger(3722)), list(makeInteger(3725), makeInteger(3725)), list(makeInteger(3732), makeInteger(3735)), list(makeInteger(3737), makeInteger(3743)), list(makeInteger(3745), makeInteger(3747)), list(makeInteger(3749), makeInteger(3749)), list(makeInteger(3751), makeInteger(3751)), list(makeInteger(3754), makeInteger(3755)), list(makeInteger(3757), makeInteger(3758)), list(makeInteger(3760), makeInteger(3760)), list(makeInteger(3762), makeInteger(3763)), list(makeInteger(3773), makeInteger(3773)), list(makeInteger(3776), makeInteger(3780)), list(makeInteger(3904), makeInteger(3911)), list(makeInteger(3913), makeInteger(3945)), list(makeInteger(4256), makeInteger(4293)), list(makeInteger(4304), makeInteger(4342)), list(makeInteger(4352), makeInteger(4352)), list(makeInteger(4354), makeInteger(4355)), list(makeInteger(4357), makeInteger(4359)), list(makeInteger(4361), makeInteger(4361)), list(makeInteger(4363), makeInteger(4364)), list(makeInteger(4366), makeInteger(4370)), list(makeInteger(4412), makeInteger(4412)), list(makeInteger(4414), makeInteger(4414)), list(makeInteger(4416), makeInteger(4416)), list(makeInteger(4428), makeInteger(4428)), list(makeInteger(4430), makeInteger(4430)), list(makeInteger(4432), makeInteger(4432)), list(makeInteger(4436), makeInteger(4437)), list(makeInteger(4441), makeInteger(4441)), list(makeInteger(4447), makeInteger(4449)), list(makeInteger(4451), makeInteger(4451)), list(makeInteger(4453), makeInteger(4453)), list(makeInteger(4455), makeInteger(4455)), list(makeInteger(4457), makeInteger(4457)), list(makeInteger(4461), makeInteger(4462)), list(makeInteger(4466), makeInteger(4467)), list(makeInteger(4469), makeInteger(4469)), list(makeInteger(4510), makeInteger(4510)), list(makeInteger(4520), makeInteger(4520)), list(makeInteger(4523), makeInteger(4523)), list(makeInteger(4526), makeInteger(4527)), list(makeInteger(4535), makeInteger(4536)), list(makeInteger(4538), makeInteger(4538)), list(makeInteger(4540), makeInteger(4546)), list(makeInteger(4587), makeInteger(4587)), list(makeInteger(4592), makeInteger(4592)), list(makeInteger(4601), makeInteger(4601)), list(makeInteger(7680), makeInteger(7835)), list(makeInteger(7840), makeInteger(7929)), list(makeInteger(7936), makeInteger(7957)), list(makeInteger(7960), makeInteger(7965)), list(makeInteger(7968), makeInteger(8005)), list(makeInteger(8008), makeInteger(8013)), list(makeInteger(8016), makeInteger(8023)), list(makeInteger(8025), makeInteger(8025)), list(makeInteger(8027), makeInteger(8027)), list(makeInteger(8029), makeInteger(8029)), list(makeInteger(8031), makeInteger(8061)), list(makeInteger(8064), makeInteger(8116)), list(makeInteger(8118), makeInteger(8124)), list(makeInteger(8126), makeInteger(8126)), list(makeInteger(8130), makeInteger(8132)), list(makeInteger(8134), makeInteger(8140)), list(makeInteger(8144), makeInteger(8147)), list(makeInteger(8150), makeInteger(8155)), list(makeInteger(8160), makeInteger(8172)), list(makeInteger(8178), makeInteger(8180)), list(makeInteger(8182), makeInteger(8188)), list(makeInteger(8486), makeInteger(8486)), list(makeInteger(8490), makeInteger(8491)), list(makeInteger(8494), makeInteger(8494)), list(makeInteger(8576), makeInteger(8578)), list(makeInteger(12353), makeInteger(12436)), list(makeInteger(12449), makeInteger(12538)), list(makeInteger(12549), makeInteger(12588)), list(makeInteger(44032), makeInteger(55203)) });
    }

    public static final SubLFile me = new xml_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.xml_utilities";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $xml_version$ = makeSymbol("*XML-VERSION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $xml_indentation_level$ = makeSymbol("*XML-INDENTATION-LEVEL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $xml_indentation_amount$ = makeSymbol("*XML-INDENTATION-AMOUNT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cycml_indent_level$ = makeSymbol("*CYCML-INDENT-LEVEL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $xml_cdata_prefix$ = makeSymbol("*XML-CDATA-PREFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $xml_cdata_suffix$ = makeSymbol("*XML-CDATA-SUFFIX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $xml_base_char_code_ranges$ = makeSymbol("*XML-BASE-CHAR-CODE-RANGES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $xml_ideographic_char_code_ranges$ = makeSymbol("*XML-IDEOGRAPHIC-CHAR-CODE-RANGES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $xml_special_chars$ = makeSymbol("*XML-SPECIAL-CHARS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $alists_sort_key$ = makeSymbol("*ALISTS-SORT-KEY*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    static private final SubLList $list2 = list(list(makeSymbol("*XML-INDENTATION-LEVEL*"), list(makeSymbol("+"), makeSymbol("*XML-INDENTATION-AMOUNT*"), makeSymbol("*XML-INDENTATION-LEVEL*"))), list(makeSymbol("*CYCML-INDENT-LEVEL*"), makeSymbol("*XML-INDENTATION-LEVEL*")));

    private static final SubLSymbol VALID_XML_CHAR_P = makeSymbol("VALID-XML-CHAR-P");

    static private final SubLString $str4$Skipping_invalid_xml_character__S = makeString("Skipping invalid xml character ~S in ~S");

    static private final SubLSymbol $sym5$CHAR_ = makeSymbol("CHAR=");

    static private final SubLString $str6$US_ASCII = makeString("US-ASCII");

    static private final SubLString $str10$__xml_version_ = makeString("<?xml version=");

    static private final SubLString $str12$_encoding_ = makeString(" encoding=");

    static private final SubLString $str13$_standalone_ = makeString(" standalone=");

    static private final SubLString $$$yes = makeString("yes");

    static private final SubLString $$$no = makeString("no");

    private static final SubLString $str16$___ = makeString(" ?>");

    static private final SubLString $str17$___CDATA_ = makeString("<![CDATA[");

    static private final SubLString $str18$___ = makeString("]]>");

    static private final SubLString $str19$____ = makeString("<!--");

    static private final SubLString $str20$___ = makeString("-->");

    static private final SubLList $list21 = list(list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("ATTRIBUTES"), makeSymbol("ATOMIC?"), makeSymbol("NO-NESTED-ELEMENTS?"), makeSymbol("MULTIPLE-LINE-ATTRIBUTES?"), list(makeSymbol("DEFAULT-NAMESPACE"), makeSymbol("*XML-DEFAULT-NAMESPACE*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_XML_INDENTATION = makeSymbol("WITH-XML-INDENTATION");

    private static final SubLSymbol XML_START_TAG_INTERNAL = makeSymbol("XML-START-TAG-INTERNAL");

    private static final SubLSymbol $xml_default_namespace$ = makeSymbol("*XML-DEFAULT-NAMESPACE*");

    private static final SubLList $list27 = list(list(makeSymbol("XML-TERPRI")));

    private static final SubLSymbol XML_END_TAG_INTERNAL = makeSymbol("XML-END-TAG-INTERNAL");

    private static final SubLString $$$xmlns = makeString("xmlns");

    static private final SubLString $str30$__ = makeString("=\"");

    private static final SubLString $str31$__ = makeString("/>");

    private static final SubLString $str32$__ = makeString("</");

    private static final SubLString $str33$_ = makeString("&");

    private static final SubLString $str34$_ = makeString(";");

    private static final SubLSymbol VALID_XML_NAME_CHAR_P = makeSymbol("VALID-XML-NAME-CHAR-P");

    private static final SubLSymbol VALID_XML_NAME_CHAR_CODE_P = makeSymbol("VALID-XML-NAME-CHAR-CODE-P");

    static private final SubLList $list37 = list(makeInteger(46), makeInteger(45), makeInteger(95), makeInteger(58));

    public static final SubLObject $list38 = _constant_38_initializer();

    static private final SubLList $list39 = list(list(makeInteger(19968), makeInteger(40869)), list(makeInteger(12295), makeInteger(12295)), list(makeInteger(12321), makeInteger(12329)));

    private static final SubLList $list40 = list(makeSymbol("LOW"), makeSymbol("HIGH"));

    private static final SubLList $list41 = list(CHAR_ampersand, CHAR_quotation, CHAR_quote, CHAR_greater, CHAR_less, CHAR_newline);

    private static final SubLString $$$_ = makeString(" ");



    private static final SubLString $str44$_quot_ = makeString("&quot;");



    private static final SubLString $str46$_amp_ = makeString("&amp;");



    private static final SubLString $str48$_apos_ = makeString("&apos;");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $str50$_lt_ = makeString("&lt;");

    private static final SubLInteger $int$62 = makeInteger(62);

    private static final SubLString $str52$_gt_ = makeString("&gt;");

    static private final SubLList $list53 = list(cons(makeString("&gt;"), makeString(">")), cons(makeString("&lt;"), makeString("<")), cons(makeString("&amp;"), makeString("&")), cons(makeString("&quot;"), makeString("\"")), cons(makeString("&apos;"), makeString("'")));

    private static final SubLSymbol HEX_CHAR_P = makeSymbol("HEX-CHAR-P");

    private static final SubLList $list56 = list(makeSymbol("STREAM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $xml_stream$ = makeSymbol("*XML-STREAM*");

    private static final SubLList $list58 = list(makeSymbol("STRING-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym60$STREAM = makeUninternedSymbol("STREAM");

    private static final SubLSymbol WITH_XML_OUTPUT_TO_STREAM = makeSymbol("WITH-XML-OUTPUT-TO-STREAM");

    private static final SubLSymbol GENERATE_VALID_XML_HEADER = makeSymbol("GENERATE-VALID-XML-HEADER");

    private static final SubLList $list64 = list(makeSymbol("XML-HEADER"));

    private static final SubLString $str65$__DOCTYPE__A_SYSTEM__S_ = makeString("<!DOCTYPE ~A SYSTEM ~S>");

    static private final SubLList $list66 = cons(makeSymbol("ELEMENT-NAME"), makeSymbol("ATTRIBUTES"));

    private static final SubLString $str67$xmlns_ = makeString("xmlns:");

    private static final SubLList $list68 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    private static final SubLList $list69 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLString $str70$xml_ = makeString("xml:");

    private static final SubLString $str71$http_ = makeString("http:");

    private static final SubLString $str72$Couldn_t_resolve__S_based_on__S_a = makeString("Couldn't resolve ~S based on ~S and ~S.");

    private static final SubLSymbol $sym75$TERM___WITH_CONSTANT_BY_NAME = makeSymbol("TERM-<-WITH-CONSTANT-BY-NAME");

    private static final SubLSymbol ALISTS_SORT_KEY = makeSymbol("ALISTS-SORT-KEY");

    private static final SubLList $list81 = cons(makeSymbol("GROUPING-KEY-TUPLES"), makeSymbol("OTHER-BINDINGS"));

    private static final SubLString $str82$__A = makeString("<~A");

    private static final SubLString $str83$__ = makeString("#$");

    private static final SubLString $str84$__A__A = makeString(" ~A=~A");

    private static final SubLString $str85$___ = makeString(">~%");

    private static final SubLString $str86$_A__ = makeString("~A~%");

    private static final SubLString $str87$___A___ = makeString("</~A>~%");

    private static final SubLString $str88$____ = makeString("/>~%");

    private static final SubLString $str91$__name__binding___elements__ = makeString("(:name \"binding\" :elements (");

    private static final SubLString $str92$__name__ = makeString("(:name \"");

    private static final SubLString $str93$___text_ = makeString("\" :text ");

    private static final SubLString $str94$__ = makeString(") ");

    private static final SubLString $str95$__ = makeString("))");

    private static final SubLString $$$root = makeString("root");

    private static final SubLSymbol QUERY_RESULTS_TO_XML_STREAM = makeSymbol("QUERY-RESULTS-TO-XML-STREAM");

    private static final SubLList $list99 = list(makeString("application/xml"), makeString("*/*;q=0.5"));

    private static final SubLSymbol URL_P = makeSymbol("URL-P");

    private static final SubLString $str102$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLString $$$404 = makeString("404");

    private static final SubLString $$$Not_Found = makeString("Not Found");

    private static final SubLString $str106$Url_not_found_ = makeString("Url not found.");

    private static final SubLString $str107$503_Service_Temporarily_Unavailab = makeString("503 Service Temporarily Unavailable");

    private static final SubLString $$$Server_not_available = makeString("Server not available");

    private static final SubLString $str109$__xml = makeString("<?xml");

    private static final SubLString $str110$Not_XML_document__Starts_with_ = makeString("Not XML document. Starts with ");

    private static final SubLString $str111$Encountered_error_trying_to_downl = makeString("Encountered error trying to download ~S:~% ~S");

    private static final SubLSymbol QUERY_RESULTS_TO_XML_FILE = makeSymbol("QUERY-RESULTS-TO-XML-FILE");

    private static final SubLSymbol QUERY_RESULTS_TO_XML_STRING = makeSymbol("QUERY-RESULTS-TO-XML-STRING");

    private static final SubLString $$$true = makeString("true");

    private static final SubLString $$$false = makeString("false");

    public static final SubLObject xml_version_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $xml_version$.getDynamicValue(thread);
        }
    }

    public static SubLObject xml_version() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $xml_version$.getDynamicValue(thread);
    }

    public static final SubLObject xml_add_indentation_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return string_utilities.indent(stream, $xml_indentation_level$.getDynamicValue(thread));
        }
    }

    public static SubLObject xml_add_indentation(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return string_utilities.indent(stream, $xml_indentation_level$.getDynamicValue(thread));
    }

    public static final SubLObject with_xml_indentation_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt2, append(body, NIL));
        }
    }

    public static SubLObject with_xml_indentation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    public static final SubLObject xml_terpri_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
            com.cyc.cycjava.cycl.xml_utilities.xml_add_indentation(UNPROVIDED);
            return NIL;
        }
    }

    public static SubLObject xml_terpri() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
        xml_add_indentation(UNPROVIDED);
        return NIL;
    }

    /**
     * Write the part of STRING from START to END to the XML stream.
     *
     * @unknown Non-whitespace control characters and other invalid XML characters will be omitted.
     */
    @LispMethod(comment = "Write the part of STRING from START to END to the XML stream.\r\n\r\n@unknown Non-whitespace control characters and other invalid XML characters will be omitted.")
    public static final SubLObject xml_write_string_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.find_if_not(VALID_XML_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject string_var = string;
                    SubLObject end_var = (NIL != end) ? ((SubLObject) (end)) : length(string_var);
                    SubLObject end_var_1 = end_var;
                    SubLObject char_num = NIL;
                    for (char_num = start; !char_num.numGE(end_var_1); char_num = number_utilities.f_1X(char_num)) {
                        {
                            SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                            if (NIL != com.cyc.cycjava.cycl.xml_utilities.valid_xml_char_p(v_char)) {
                                write_char(v_char, xml_vars.$xml_stream$.getDynamicValue(thread));
                            } else {
                                Errors.warn($str_alt4$Skipping_invalid_xml_character__S, v_char, string);
                            }
                        }
                    }
                }
            } else {
                write_string(string, xml_vars.$xml_stream$.getDynamicValue(thread), start, end);
            }
            return NIL;
        }
    }

    /**
     * Write the part of STRING from START to END to the XML stream.
     *
     * @unknown Non-whitespace control characters and other invalid XML characters will be omitted.
     */
    @LispMethod(comment = "Write the part of STRING from START to END to the XML stream.\r\n\r\n@unknown Non-whitespace control characters and other invalid XML characters will be omitted.")
    public static SubLObject xml_write_string(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.find_if_not(VALID_XML_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            SubLObject end_var_$1;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var = end_var_$1 = (NIL != end) ? end : length(string), char_num = NIL, char_num = start; !char_num.numGE(end_var_$1); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (NIL != valid_xml_char_p(v_char)) {
                    write_char(v_char, xml_vars.$xml_stream$.getDynamicValue(thread));
                } else {
                    Errors.warn($str4$Skipping_invalid_xml_character__S, v_char, string);
                }
            }
        } else {
            write_string(string, xml_vars.$xml_stream$.getDynamicValue(thread), start, end);
        }
        return NIL;
    }

    /**
     * Write CHAR to the XML stream.
     */
    @LispMethod(comment = "Write CHAR to the XML stream.")
    public static final SubLObject xml_write_char_alt(SubLObject v_char) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_char, VALID_XML_CHAR_P);
            write_char(v_char, xml_vars.$xml_stream$.getDynamicValue(thread));
            return NIL;
        }
    }

    /**
     * Write CHAR to the XML stream.
     */
    @LispMethod(comment = "Write CHAR to the XML stream.")
    public static SubLObject xml_write_char(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != valid_xml_char_p(v_char) : "! xml_utilities.valid_xml_char_p(v_char) " + ("xml_utilities.valid_xml_char_p(v_char) " + "CommonSymbols.NIL != xml_utilities.valid_xml_char_p(v_char) ") + v_char;
        write_char(v_char, xml_vars.$xml_stream$.getDynamicValue(thread));
        return NIL;
    }

    /**
     * Write the part of STRING from START to END to the XML stream.
     * Instead of emitting #Newlines, call XML-TERPRI instead.
     */
    @LispMethod(comment = "Write the part of STRING from START to END to the XML stream.\r\nInstead of emitting #Newlines, call XML-TERPRI instead.\nWrite the part of STRING from START to END to the XML stream.\nInstead of emitting #Newlines, call XML-TERPRI instead.")
    public static final SubLObject xml_write_string_indented_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (NIL == end) {
            end = length(string);
        }
        while (start.numL(end)) {
            {
                SubLObject end_of_line = position(CHAR_newline, string, symbol_function($sym5$CHAR_), symbol_function(IDENTITY), start, end);
                SubLObject fragment_end = (end_of_line.isFixnum()) ? ((SubLObject) (end_of_line)) : end;
                com.cyc.cycjava.cycl.xml_utilities.xml_write_string(string, start, fragment_end);
                if (end_of_line.isFixnum()) {
                    com.cyc.cycjava.cycl.xml_utilities.xml_terpri();
                }
                start = add(fragment_end, ONE_INTEGER);
            }
        } 
        return string;
    }

    /**
     * Write the part of STRING from START to END to the XML stream.
     * Instead of emitting #Newlines, call XML-TERPRI instead.
     */
    @LispMethod(comment = "Write the part of STRING from START to END to the XML stream.\r\nInstead of emitting #Newlines, call XML-TERPRI instead.\nWrite the part of STRING from START to END to the XML stream.\nInstead of emitting #Newlines, call XML-TERPRI instead.")
    public static SubLObject xml_write_string_indented(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (NIL == end) {
            end = length(string);
        }
        while (start.numL(end)) {
            final SubLObject end_of_line = position(CHAR_newline, string, symbol_function($sym5$CHAR_), symbol_function(IDENTITY), start, end);
            final SubLObject fragment_end = (end_of_line.isFixnum()) ? end_of_line : end;
            xml_write_string(string, start, fragment_end);
            if (end_of_line.isFixnum()) {
                xml_terpri();
            }
            start = add(fragment_end, ONE_INTEGER);
        } 
        return string;
    }

    /**
     * Outputs an xml header with the current version
     */
    @LispMethod(comment = "Outputs an xml header with the current version")
    public static final SubLObject xml_header_alt(SubLObject version, SubLObject encoding, SubLObject standalone) {
        if (version == UNPROVIDED) {
            version = $xml_version$.getDynamicValue();
        }
        if (encoding == UNPROVIDED) {
            encoding = $str_alt6$US_ASCII;
        }
        if (standalone == UNPROVIDED) {
            standalone = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(version, FLOATP);
            SubLTrampolineFile.checkType(encoding, STRINGP);
            SubLTrampolineFile.checkType(standalone, BOOLEANP);
            com.cyc.cycjava.cycl.xml_utilities.xml_write_string($str_alt10$__xml_version_, UNPROVIDED, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                try {
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    prin1(prin1_to_string(version), xml_vars.$xml_stream$.getDynamicValue(thread));
                } finally {
                    $read_default_float_format$.rebind(_prev_bind_0, thread);
                }
            }
            com.cyc.cycjava.cycl.xml_utilities.xml_write_string($str_alt12$_encoding_, UNPROVIDED, UNPROVIDED);
            prin1(encoding, xml_vars.$xml_stream$.getDynamicValue(thread));
            com.cyc.cycjava.cycl.xml_utilities.xml_write_string($str_alt13$_standalone_, UNPROVIDED, UNPROVIDED);
            prin1(NIL != standalone ? ((SubLObject) ($$$yes)) : $$$no, xml_vars.$xml_stream$.getDynamicValue(thread));
            com.cyc.cycjava.cycl.xml_utilities.xml_write_string($str_alt16$__, UNPROVIDED, UNPROVIDED);
            terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
            return NIL;
        }
    }

    /**
     * Outputs an xml header with the current version
     */
    @LispMethod(comment = "Outputs an xml header with the current version")
    public static SubLObject xml_header(SubLObject version, SubLObject encoding, SubLObject standalone) {
        if (version == UNPROVIDED) {
            version = $xml_version$.getDynamicValue();
        }
        if (encoding == UNPROVIDED) {
            encoding = $str6$US_ASCII;
        }
        if (standalone == UNPROVIDED) {
            standalone = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != floatp(version) : "! floatp(version) " + ("Types.floatp(version) " + "CommonSymbols.NIL != Types.floatp(version) ") + version;
        assert NIL != stringp(encoding) : "! stringp(encoding) " + ("Types.stringp(encoding) " + "CommonSymbols.NIL != Types.stringp(encoding) ") + encoding;
        assert NIL != booleanp(standalone) : "! booleanp(standalone) " + ("Types.booleanp(standalone) " + "CommonSymbols.NIL != Types.booleanp(standalone) ") + standalone;
        xml_write_string($str10$__xml_version_, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            prin1(prin1_to_string(version), xml_vars.$xml_stream$.getDynamicValue(thread));
        } finally {
            $read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        xml_write_string($str12$_encoding_, UNPROVIDED, UNPROVIDED);
        prin1(encoding, xml_vars.$xml_stream$.getDynamicValue(thread));
        xml_write_string($str13$_standalone_, UNPROVIDED, UNPROVIDED);
        prin1(NIL != standalone ? $$$yes : $$$no, xml_vars.$xml_stream$.getDynamicValue(thread));
        xml_write_string($str16$___, UNPROVIDED, UNPROVIDED);
        terpri(xml_vars.$xml_stream$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject xml_cdata_prefix_alt() {
        return $xml_cdata_prefix$.getGlobalValue();
    }

    public static SubLObject xml_cdata_prefix() {
        return $xml_cdata_prefix$.getGlobalValue();
    }

    public static final SubLObject xml_cdata_suffix_alt() {
        return $xml_cdata_suffix$.getGlobalValue();
    }

    public static SubLObject xml_cdata_suffix() {
        return $xml_cdata_suffix$.getGlobalValue();
    }

    /**
     *
     *
     * @param string
    Text
     * 		
     * @unknown Writes STRING to a CDATA section of the XML document to
     * @unknown :variable *xml-stream*
     * @unknown STRING should not contain ']]>', which is used to end the entire
    CDATA section.  Other characters (e.g., quotes, left angle brackets)
    need not be escaped.
     * @return NIL.
     */
    @LispMethod(comment = "@param string\nText\r\n\t\t\r\n@unknown Writes STRING to a CDATA section of the XML document to\r\n@unknown :variable *xml-stream*\r\n@unknown STRING should not contain \']]>\', which is used to end the entire\r\nCDATA section.  Other characters (e.g., quotes, left angle brackets)\r\nneed not be escaped.\r\n@return NIL.")
    public static final SubLObject xml_cdata_alt(SubLObject string) {
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string(com.cyc.cycjava.cycl.xml_utilities.xml_cdata_prefix(), UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string(string, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string(com.cyc.cycjava.cycl.xml_utilities.xml_cdata_suffix(), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param string
    Text
     * 		
     * @unknown Writes STRING to a CDATA section of the XML document to
     * @unknown :variable *xml-stream*
     * @unknown STRING should not contain ']]>', which is used to end the entire
    CDATA section.  Other characters (e.g., quotes, left angle brackets)
    need not be escaped.
     * @return NIL.
     */
    @LispMethod(comment = "@param string\nText\r\n\t\t\r\n@unknown Writes STRING to a CDATA section of the XML document to\r\n@unknown :variable *xml-stream*\r\n@unknown STRING should not contain \']]>\', which is used to end the entire\r\nCDATA section.  Other characters (e.g., quotes, left angle brackets)\r\nneed not be escaped.\r\n@return NIL.")
    public static SubLObject xml_cdata(final SubLObject string) {
        xml_write_string(xml_cdata_prefix(), UNPROVIDED, UNPROVIDED);
        xml_write_string(string, UNPROVIDED, UNPROVIDED);
        xml_write_string(xml_cdata_suffix(), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param string
     * 		
     * @unknown Writes STRING verbatim to @xref :variable *xml-stream*
     * @unknown No characters in STRING will be escaped
     * @see XML-CDATA @see XML-COMMENT
     * @return NIL
     */
    @LispMethod(comment = "@param string\r\n\t\t\r\n@unknown Writes STRING verbatim to @xref :variable *xml-stream*\r\n@unknown No characters in STRING will be escaped\r\n@see XML-CDATA @see XML-COMMENT\r\n@return NIL")
    public static final SubLObject xml_markup_alt(SubLObject string) {
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string(string, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param string
     * 		
     * @unknown Writes STRING verbatim to @xref :variable *xml-stream*
     * @unknown No characters in STRING will be escaped
     * @see XML-CDATA @see XML-COMMENT
     * @return NIL
     */
    @LispMethod(comment = "@param string\r\n\t\t\r\n@unknown Writes STRING verbatim to @xref :variable *xml-stream*\r\n@unknown No characters in STRING will be escaped\r\n@see XML-CDATA @see XML-COMMENT\r\n@return NIL")
    public static SubLObject xml_markup(final SubLObject string) {
        xml_write_string(string, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param string
     * 		Text of comment
     * @unknown Writes STRING  as a comment to @xref :variable *xml-stream*.
     * @unknown STRING must not contain a double-hyphen '--'.  (This sequence is
    prohibited within XML comments.)
     * @return nil
     */
    @LispMethod(comment = "@param string\r\n\t\tText of comment\r\n@unknown Writes STRING  as a comment to @xref :variable *xml-stream*.\r\n@unknown STRING must not contain a double-hyphen \'--\'.  (This sequence is\r\nprohibited within XML comments.)\r\n@return nil")
    public static final SubLObject xml_comment_alt(SubLObject string) {
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string($str_alt19$____, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string(string, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string($str_alt20$___, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param string
     * 		Text of comment
     * @unknown Writes STRING  as a comment to @xref :variable *xml-stream*.
     * @unknown STRING must not contain a double-hyphen '--'.  (This sequence is
    prohibited within XML comments.)
     * @return nil
     */
    @LispMethod(comment = "@param string\r\n\t\tText of comment\r\n@unknown Writes STRING  as a comment to @xref :variable *xml-stream*.\r\n@unknown STRING must not contain a double-hyphen \'--\'.  (This sequence is\r\nprohibited within XML comments.)\r\n@return nil")
    public static SubLObject xml_comment(final SubLObject string) {
        xml_write_string($str19$____, UNPROVIDED, UNPROVIDED);
        xml_write_string(string, UNPROVIDED, UNPROVIDED);
        xml_write_string($str20$___, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     *
     *
     * @param name
     * 		Tag name.
     * @param attributes
     * 		List of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)
     * @param atomic?
     * 		If true, element will be atomic (i.e., end with />). Otherwise,
     * 		the element will output an end tag.
     * @param no-nested-elements?
     * 		If non-NIL, no newline will be added before the end tag.
     * @unknown Outputs an start and end tag of type NAME to @xref :variable *xml-stream*
    with attributes ATTRIBUTES.
     */
    @LispMethod(comment = "@param name\r\n\t\tTag name.\r\n@param attributes\r\n\t\tList of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)\r\n@param atomic?\r\n\t\tIf true, element will be atomic (i.e., end with />). Otherwise,\r\n\t\tthe element will output an end tag.\r\n@param no-nested-elements?\r\n\t\tIf non-NIL, no newline will be added before the end tag.\r\n@unknown Outputs an start and end tag of type NAME to @xref :variable *xml-stream*\r\nwith attributes ATTRIBUTES.")
    public static final SubLObject xml_tag_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    name = current.first();
                    current = current.rest();
                    {
                        SubLObject attributes = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt21);
                        current = current.rest();
                        {
                            SubLObject atomicP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt21);
                            current = current.rest();
                            {
                                SubLObject no_nested_elementsP = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                                destructuring_bind_must_listp(current, datum, $list_alt21);
                                current = current.rest();
                                if (NIL == current) {
                                    current = temp;
                                    {
                                        SubLObject body = current;
                                        return list(PROGN, listS(WITH_XML_INDENTATION, list(XML_START_TAG_INTERNAL, name, attributes, atomicP), append(body, NIL)), list(PUNLESS, atomicP, listS(PUNLESS, no_nested_elementsP, $list_alt26), list(XML_END_TAG_INTERNAL, name)));
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt21);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param name
     * 		Tag name.
     * @param attributes
     * 		List of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)
     * @param atomic?
     * 		If true, element will be atomic (i.e., end with />). Otherwise,
     * 		the element will output an end tag.
     * @param no-nested-elements?
     * 		If non-NIL, no newline will be added before the end tag.
     * @unknown Outputs an start and end tag of type NAME to @xref :variable *xml-stream*
    with attributes ATTRIBUTES.
     */
    @LispMethod(comment = "@param name\r\n\t\tTag name.\r\n@param attributes\r\n\t\tList of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)\r\n@param atomic?\r\n\t\tIf true, element will be atomic (i.e., end with />). Otherwise,\r\n\t\tthe element will output an end tag.\r\n@param no-nested-elements?\r\n\t\tIf non-NIL, no newline will be added before the end tag.\r\n@unknown Outputs an start and end tag of type NAME to @xref :variable *xml-stream*\r\nwith attributes ATTRIBUTES.")
    public static SubLObject xml_tag(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list21);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        name = current.first();
        current = current.rest();
        final SubLObject attributes = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list21);
        current = current.rest();
        final SubLObject atomicP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list21);
        current = current.rest();
        final SubLObject no_nested_elementsP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list21);
        current = current.rest();
        final SubLObject multiple_line_attributesP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list21);
        current = current.rest();
        final SubLObject default_namespace = (current.isCons()) ? current.first() : xml_vars.$xml_default_namespace$.getDynamicValue(thread);
        destructuring_bind_must_listp(current, datum, $list21);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CUNWIND_PROTECT, list(WITH_XML_INDENTATION, list(XML_START_TAG_INTERNAL, name, attributes, atomicP, multiple_line_attributesP, default_namespace), listS(CLET, list(list($xml_default_namespace$, default_namespace)), append(body, NIL))), list(PUNLESS, atomicP, listS(PUNLESS, no_nested_elementsP, $list27), list(XML_END_TAG_INTERNAL, name)));
        }
        cdestructuring_bind_error(datum, $list21);
        return NIL;
    }

    /**
     *
     *
     * @param name
     * 		Tag name.
     * @param attributes
     * 		List of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)
     * @param atomic?
     * 		If true, element will be atomic (i.e., end with />). Otherwise,
     * 		the element will require an end-tag @see XML-END-TAG-INTERNAL.
     * @unknown Outputs an start tag of type NAME to @xref :variable *xml-stream*
    with attributes ATTRIBUTES.
     */
    @LispMethod(comment = "@param name\r\n\t\tTag name.\r\n@param attributes\r\n\t\tList of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)\r\n@param atomic?\r\n\t\tIf true, element will be atomic (i.e., end with />). Otherwise,\r\n\t\tthe element will require an end-tag @see XML-END-TAG-INTERNAL.\r\n@unknown Outputs an start tag of type NAME to @xref :variable *xml-stream*\r\nwith attributes ATTRIBUTES.")
    public static final SubLObject xml_start_tag_internal(SubLObject name, SubLObject attributes, SubLObject atomicP) {
        com.cyc.cycjava.cycl.xml_utilities.xml_write_char(CHAR_less);
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string(name, UNPROVIDED, UNPROVIDED);
        {
            SubLObject att_list = NIL;
            SubLObject att_name = NIL;
            SubLObject att_value = NIL;
            for (att_list = attributes, att_name = att_list.first(), att_value = second(att_list); NIL != att_name; att_list = cddr(att_list) , att_name = att_list.first() , att_value = second(att_list)) {
                com.cyc.cycjava.cycl.xml_utilities.xml_write_char(CHAR_space);
                com.cyc.cycjava.cycl.xml_utilities.xml_write_string(att_name, UNPROVIDED, UNPROVIDED);
                com.cyc.cycjava.cycl.xml_utilities.xml_write_string($str_alt28$__, UNPROVIDED, UNPROVIDED);
                com.cyc.cycjava.cycl.xml_utilities.xml_write_wXescaped_special_chars(att_value.isString() ? ((SubLObject) (att_value)) : prin1_to_string(att_value));
                com.cyc.cycjava.cycl.xml_utilities.xml_write_char(CHAR_quotation);
            }
        }
        if (NIL != atomicP) {
            com.cyc.cycjava.cycl.xml_utilities.xml_write_string($str_alt29$__, UNPROVIDED, UNPROVIDED);
        } else {
            com.cyc.cycjava.cycl.xml_utilities.xml_write_char(CHAR_greater);
        }
        return NIL;
    }

    public static SubLObject xml_start_tag_internal(final SubLObject name, SubLObject attributes, final SubLObject atomicP, SubLObject multiple_line_attributesP, SubLObject default_namespace) {
        if (multiple_line_attributesP == UNPROVIDED) {
            multiple_line_attributesP = NIL;
        }
        if (default_namespace == UNPROVIDED) {
            default_namespace = xml_vars.$xml_default_namespace$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        xml_write_char(CHAR_less);
        xml_write_string(name, UNPROVIDED, UNPROVIDED);
        if (NIL != misc_utilities.initialized_p(default_namespace)) {
            assert NIL != stringp(default_namespace) : "! stringp(default_namespace) " + ("Types.stringp(default_namespace) " + "CommonSymbols.NIL != Types.stringp(default_namespace) ") + default_namespace;
            if (!default_namespace.equal(xml_vars.$xml_default_namespace$.getDynamicValue(thread))) {
                attributes = putf(attributes, $$$xmlns, default_namespace);
            }
        }
        SubLObject att_list = NIL;
        SubLObject att_name = NIL;
        SubLObject att_value = NIL;
        att_list = attributes;
        att_name = att_list.first();
        att_value = second(att_list);
        while (NIL != att_name) {
            xml_write_char(CHAR_space);
            xml_write_string(att_name, UNPROVIDED, UNPROVIDED);
            xml_write_string($str30$__, UNPROVIDED, UNPROVIDED);
            xml_write_wXescaped_special_chars(att_value.isString() ? att_value : prin1_to_string(att_value));
            xml_write_char(CHAR_quotation);
            if (NIL != multiple_line_attributesP) {
                xml_terpri();
            }
            att_list = cddr(att_list);
            att_name = att_list.first();
            att_value = second(att_list);
        } 
        if (NIL != atomicP) {
            xml_write_string($str31$__, UNPROVIDED, UNPROVIDED);
        } else {
            xml_write_char(CHAR_greater);
        }
        return NIL;
    }

    /**
     *
     *
     * @param name
     * 		tag name
     * @unknown Writes an XML end tag with name NAME to @xref :variable *xml-stream*.
     * @return nil
     */
    @LispMethod(comment = "@param name\r\n\t\ttag name\r\n@unknown Writes an XML end tag with name NAME to @xref :variable *xml-stream*.\r\n@return nil")
    public static final SubLObject xml_end_tag_internal_alt(SubLObject name) {
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string($str_alt30$__, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.xml_utilities.xml_write_string(name, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.xml_utilities.xml_write_char(CHAR_greater);
        return NIL;
    }

    /**
     *
     *
     * @param name
     * 		tag name
     * @unknown Writes an XML end tag with name NAME to @xref :variable *xml-stream*.
     * @return nil
     */
    @LispMethod(comment = "@param name\r\n\t\ttag name\r\n@unknown Writes an XML end tag with name NAME to @xref :variable *xml-stream*.\r\n@return nil")
    public static SubLObject xml_end_tag_internal(final SubLObject name) {
        xml_write_string($str32$__, UNPROVIDED, UNPROVIDED);
        xml_write_string(name, UNPROVIDED, UNPROVIDED);
        xml_write_char(CHAR_greater);
        return NIL;
    }

    public static final SubLObject xml_print_alt(SubLObject v_object, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.xml_utilities.xml_write(string_utilities.to_string(v_object), entity_table);
        return NIL;
    }

    public static SubLObject xml_print(final SubLObject v_object, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        xml_write(string_utilities.to_string(v_object), entity_table);
        return NIL;
    }

    public static final SubLObject xml_prin1_alt(SubLObject v_object, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.xml_utilities.xml_write(prin1_to_string(v_object), entity_table);
        return NIL;
    }

    public static SubLObject xml_prin1(final SubLObject v_object, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        xml_write(prin1_to_string(v_object), entity_table);
        return NIL;
    }

    public static final SubLObject xml_print_line_alt(SubLObject v_object, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.xml_utilities.xml_write_line(string_utilities.to_string(v_object), entity_table);
        return NIL;
    }

    public static SubLObject xml_print_line(final SubLObject v_object, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        xml_write_line(string_utilities.to_string(v_object), entity_table);
        return NIL;
    }

    public static final SubLObject xml_prin1_line_alt(SubLObject v_object, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        com.cyc.cycjava.cycl.xml_utilities.xml_write_line(prin1_to_string(v_object), entity_table);
        return NIL;
    }

    public static SubLObject xml_prin1_line(final SubLObject v_object, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        xml_write_line(prin1_to_string(v_object), entity_table);
        return NIL;
    }

    public static final SubLObject xml_write_alt(SubLObject string, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject cdotimes_end_var = length(string);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject ch = Strings.sublisp_char(string, i);
                    SubLObject ent = assoc(ch, entity_table, UNPROVIDED, UNPROVIDED);
                    if (NIL != ent) {
                        com.cyc.cycjava.cycl.xml_utilities.xml_write_string(cconcatenate($str_alt31$_, new SubLObject[]{ ent.rest(), $str_alt32$_ }), UNPROVIDED, UNPROVIDED);
                    } else {
                        com.cyc.cycjava.cycl.xml_utilities.xml_write_char(ch);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject xml_write(final SubLObject string, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject ch;
        SubLObject ent;
        for (cdotimes_end_var = length(string), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, i);
            ent = assoc(ch, entity_table, UNPROVIDED, UNPROVIDED);
            if (NIL != ent) {
                xml_write_string(cconcatenate($str33$_, new SubLObject[]{ ent.rest(), $str34$_ }), UNPROVIDED, UNPROVIDED);
            } else {
                xml_write_char(ch);
            }
        }
        return NIL;
    }

    public static final SubLObject xml_write_line_alt(SubLObject string, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        com.cyc.cycjava.cycl.xml_utilities.xml_write(string, entity_table);
        com.cyc.cycjava.cycl.xml_utilities.xml_write_char(CHAR_newline);
        return NIL;
    }

    public static SubLObject xml_write_line(final SubLObject string, SubLObject entity_table) {
        if (entity_table == UNPROVIDED) {
            entity_table = xml_vars.$xml_entity_table$.getDynamicValue();
        }
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        xml_write(string, entity_table);
        xml_write_char(CHAR_newline);
        return NIL;
    }

    public static final SubLObject valid_xml_name_p_alt(SubLObject name) {
        return makeBoolean(name.isString() && (NIL != (NIL != unicode_strings.ascii_string_p(name) ? ((SubLObject) (com.cyc.cycjava.cycl.xml_utilities.valid_ascii_xml_name_p(name))) : com.cyc.cycjava.cycl.xml_utilities.valid_non_ascii_xml_name_p(name))));
    }

    public static SubLObject valid_xml_name_p(final SubLObject name) {
        return makeBoolean((NIL != string_utilities.non_empty_string_p(name)) && (NIL != (NIL != unicode_strings.ascii_string_p(name) ? valid_ascii_xml_name_p(name) : valid_non_ascii_xml_name_p(name))));
    }

    /**
     *
     *
     * @return STRINGP NAME with any invalid XML name characters removed.
     */
    @LispMethod(comment = "@return STRINGP NAME with any invalid XML name characters removed.")
    public static final SubLObject remove_invalid_xml_name_chars_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, STRINGP);
        return NIL != unicode_strings.ascii_string_p(name) ? ((SubLObject) (com.cyc.cycjava.cycl.xml_utilities.remove_invalid_xml_name_chars_from_ascii_string(name))) : com.cyc.cycjava.cycl.xml_utilities.remove_invalid_xml_name_chars_from_non_ascii_string(name);
    }

    /**
     *
     *
     * @return STRINGP NAME with any invalid XML name characters removed.
     */
    @LispMethod(comment = "@return STRINGP NAME with any invalid XML name characters removed.")
    public static SubLObject remove_invalid_xml_name_chars(final SubLObject name) {
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        return NIL != unicode_strings.ascii_string_p(name) ? remove_invalid_xml_name_chars_from_ascii_string(name) : remove_invalid_xml_name_chars_from_non_ascii_string(name);
    }

    public static final SubLObject valid_ascii_xml_name_p_alt(SubLObject name) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.xml_utilities.valid_xml_name_initial_char_p(string_utilities.first_char(name))) && (NIL == list_utilities.find_if_not(VALID_XML_NAME_CHAR_P, name, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject valid_ascii_xml_name_p(final SubLObject name) {
        return makeBoolean((NIL != valid_xml_name_initial_char_p(string_utilities.first_char(name))) && (NIL == list_utilities.find_if_not(VALID_XML_NAME_CHAR_P, name, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject valid_xml_name_initial_char_p_alt(SubLObject v_char) {
        return makeBoolean(((v_char == CHAR_underbar) || (v_char == CHAR_colon)) || (NIL != com.cyc.cycjava.cycl.xml_utilities.xml_letter_char_p(v_char)));
    }

    public static SubLObject valid_xml_name_initial_char_p(final SubLObject v_char) {
        return makeBoolean((v_char.eql(CHAR_underbar) || v_char.eql(CHAR_colon)) || (NIL != xml_letter_char_p(v_char)));
    }

    public static final SubLObject valid_xml_name_initial_char_code_p_alt(SubLObject code) {
        return makeBoolean((code.eql(char_code(CHAR_underbar)) || code.eql(char_code(CHAR_colon))) || (NIL != com.cyc.cycjava.cycl.xml_utilities.xml_letter_char_code_p(code)));
    }

    public static SubLObject valid_xml_name_initial_char_code_p(final SubLObject code) {
        return makeBoolean((code.eql(char_code(CHAR_underbar)) || code.eql(char_code(CHAR_colon))) || (NIL != xml_letter_char_code_p(code)));
    }

    public static final SubLObject valid_non_ascii_xml_name_p_alt(SubLObject name) {
        {
            SubLObject char_codes = unicode_strings.utf8_string_to_unicode_vector(name);
            return makeBoolean((((string_utilities.first_char(name) == CHAR_underbar) || (string_utilities.first_char(name) == CHAR_colon)) || (NIL != com.cyc.cycjava.cycl.xml_utilities.xml_letter_char_code_p(aref(char_codes, ZERO_INTEGER)))) && (NIL == list_utilities.find_if_not(VALID_XML_NAME_CHAR_CODE_P, char_codes, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject valid_non_ascii_xml_name_p(final SubLObject name) {
        final SubLObject char_codes = unicode_strings.utf8_string_to_unicode_vector(name);
        return makeBoolean(((string_utilities.first_char(name).eql(CHAR_underbar) || string_utilities.first_char(name).eql(CHAR_colon)) || (NIL != xml_letter_char_code_p(aref(char_codes, ZERO_INTEGER)))) && (NIL == list_utilities.find_if_not(VALID_XML_NAME_CHAR_CODE_P, char_codes, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject valid_xml_name_char_p_alt(SubLObject v_char) {
        return com.cyc.cycjava.cycl.xml_utilities.valid_xml_name_char_code_p(char_code(v_char));
    }

    public static SubLObject valid_xml_name_char_p(final SubLObject v_char) {
        return valid_xml_name_char_code_p(char_code(v_char));
    }

    public static final SubLObject remove_invalid_xml_name_chars_from_ascii_string_alt(SubLObject name) {
        {
            SubLObject new_name = name;
            while (!((NIL != string_utilities.empty_string_p(new_name)) || (NIL != com.cyc.cycjava.cycl.xml_utilities.valid_xml_name_initial_char_p(string_utilities.first_char(new_name))))) {
                new_name = string_utilities.substring(new_name, ONE_INTEGER, UNPROVIDED);
            } 
            return list_utilities.remove_if_not(VALID_XML_NAME_CHAR_P, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject remove_invalid_xml_name_chars_from_ascii_string(final SubLObject name) {
        SubLObject new_name;
        for (new_name = name; (NIL == string_utilities.empty_string_p(new_name)) && (NIL == valid_xml_name_initial_char_p(string_utilities.first_char(new_name))); new_name = string_utilities.substring(new_name, ONE_INTEGER, UNPROVIDED)) {
        }
        return list_utilities.remove_if_not(VALID_XML_NAME_CHAR_P, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject remove_invalid_xml_name_chars_from_non_ascii_string_alt(SubLObject name) {
        {
            SubLObject char_codes = unicode_strings.utf8_string_to_unicode_vector(name);
            SubLObject found_invalidP = NIL;
            while (!((NIL != list_utilities.lengthE(char_codes, ZERO_INTEGER, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.xml_utilities.valid_xml_name_initial_char_code_p(aref(char_codes, ZERO_INTEGER))))) {
                found_invalidP = T;
                char_codes = subseq(char_codes, ONE_INTEGER, UNPROVIDED);
            } 
            if ((NIL != found_invalidP) || (NIL != list_utilities.find_if_not(VALID_XML_NAME_CHAR_CODE_P, char_codes, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(list_utilities.delete_if_not(VALID_XML_NAME_CHAR_CODE_P, char_codes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED));
            } else {
                return name;
            }
        }
    }

    public static SubLObject remove_invalid_xml_name_chars_from_non_ascii_string(final SubLObject name) {
        SubLObject char_codes = unicode_strings.utf8_string_to_unicode_vector(name);
        SubLObject found_invalidP = NIL;
        while ((NIL == list_utilities.lengthE(char_codes, ZERO_INTEGER, UNPROVIDED)) && (NIL == valid_xml_name_initial_char_code_p(aref(char_codes, ZERO_INTEGER)))) {
            found_invalidP = T;
            char_codes = subseq(char_codes, ONE_INTEGER, UNPROVIDED);
        } 
        if ((NIL != found_invalidP) || (NIL != list_utilities.find_if_not(VALID_XML_NAME_CHAR_CODE_P, char_codes, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(list_utilities.delete_if_not(VALID_XML_NAME_CHAR_CODE_P, char_codes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED));
        }
        return name;
    }

    /**
     * Cf. http://www.w3.org/TR/REC-xml/#dt-name
     */
    @LispMethod(comment = "Cf. http://www.w3.org/TR/REC-xml/#dt-name")
    public static final SubLObject valid_xml_name_char_code_p_alt(SubLObject code) {
        return makeBoolean((NIL != subl_promotions.non_negative_integer_p(code)) && (((NIL != com.cyc.cycjava.cycl.xml_utilities.xml_letter_char_code_p(code)) || (NIL != com.cyc.cycjava.cycl.xml_utilities.digit_char_code_p(code))) || (NIL != member(code, $list_alt35, UNPROVIDED, UNPROVIDED))));
    }

    /**
     * Cf. http://www.w3.org/TR/REC-xml/#dt-name
     */
    @LispMethod(comment = "Cf. http://www.w3.org/TR/REC-xml/#dt-name")
    public static SubLObject valid_xml_name_char_code_p(final SubLObject code) {
        return makeBoolean((NIL != subl_promotions.non_negative_integer_p(code)) && (((NIL != xml_letter_char_code_p(code)) || (NIL != digit_char_code_p(code))) || (NIL != member(code, $list37, UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject digit_char_code_p_alt(SubLObject code) {
        return makeBoolean(code.numGE(char_code(CHAR_0)) && code.numLE(char_code(CHAR_9)));
    }

    public static SubLObject digit_char_code_p(final SubLObject code) {
        return makeBoolean(code.numGE(char_code(CHAR_0)) && code.numLE(char_code(CHAR_9)));
    }

    public static final SubLObject xml_letter_char_p_alt(SubLObject v_char) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.xml_utilities.xml_base_char_p(v_char)) || (NIL != com.cyc.cycjava.cycl.xml_utilities.xml_ideographic_char_p(v_char)));
    }

    public static SubLObject xml_letter_char_p(final SubLObject v_char) {
        return makeBoolean((NIL != xml_base_char_p(v_char)) || (NIL != xml_ideographic_char_p(v_char)));
    }

    public static final SubLObject xml_letter_char_code_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.xml_utilities.xml_base_char_code_p(v_object)) || (NIL != com.cyc.cycjava.cycl.xml_utilities.xml_ideographic_char_code_p(v_object)));
    }

    public static SubLObject xml_letter_char_code_p(final SubLObject v_object) {
        return makeBoolean((NIL != xml_base_char_code_p(v_object)) || (NIL != xml_ideographic_char_code_p(v_object)));
    }

    public static final SubLObject xml_base_char_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != com.cyc.cycjava.cycl.xml_utilities.char_in_ranges_p(v_object, $xml_base_char_code_ranges$.getGlobalValue())));
    }

    public static SubLObject xml_base_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != char_in_ranges_p(v_object, $xml_base_char_code_ranges$.getGlobalValue())));
    }

    public static final SubLObject xml_base_char_code_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (NIL != com.cyc.cycjava.cycl.xml_utilities.char_code_in_ranges_p(v_object, $xml_base_char_code_ranges$.getGlobalValue())));
    }

    public static SubLObject xml_base_char_code_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (NIL != char_code_in_ranges_p(v_object, $xml_base_char_code_ranges$.getGlobalValue())));
    }

    public static final SubLObject xml_ideographic_char_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != com.cyc.cycjava.cycl.xml_utilities.char_in_ranges_p(v_object, $xml_ideographic_char_code_ranges$.getGlobalValue())));
    }

    public static SubLObject xml_ideographic_char_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() && (NIL != char_in_ranges_p(v_object, $xml_ideographic_char_code_ranges$.getGlobalValue())));
    }

    public static final SubLObject xml_ideographic_char_code_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (NIL != com.cyc.cycjava.cycl.xml_utilities.char_code_in_ranges_p(v_object, $xml_ideographic_char_code_ranges$.getGlobalValue())));
    }

    public static SubLObject xml_ideographic_char_code_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (NIL != char_code_in_ranges_p(v_object, $xml_ideographic_char_code_ranges$.getGlobalValue())));
    }

    public static final SubLObject valid_xml_char_p_alt(SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (NIL != com.cyc.cycjava.cycl.xml_utilities.char_code_in_ranges_p(char_code(v_char), xml_vars.$xml_valid_char_code_ranges$.getGlobalValue())));
    }

    public static SubLObject valid_xml_char_p(final SubLObject v_char) {
        return makeBoolean(v_char.isChar() && (NIL != char_code_in_ranges_p(char_code(v_char), xml_vars.$xml_valid_char_code_ranges$.getGlobalValue())));
    }

    public static final SubLObject valid_xml_char_code_p_alt(SubLObject char_code) {
        return makeBoolean(char_code.isNumber() && (NIL != com.cyc.cycjava.cycl.xml_utilities.char_code_in_ranges_p(char_code, xml_vars.$xml_valid_char_code_ranges$.getGlobalValue())));
    }

    public static SubLObject valid_xml_char_code_p(final SubLObject char_code) {
        return makeBoolean(char_code.isNumber() && (NIL != char_code_in_ranges_p(char_code, xml_vars.$xml_valid_char_code_ranges$.getGlobalValue())));
    }

    public static final SubLObject char_in_ranges_p_alt(SubLObject v_char, SubLObject v_ranges) {
        return com.cyc.cycjava.cycl.xml_utilities.char_code_in_ranges_p(char_code(v_char), v_ranges);
    }

    public static SubLObject char_in_ranges_p(final SubLObject v_char, final SubLObject v_ranges) {
        return char_code_in_ranges_p(char_code(v_char), v_ranges);
    }

    public static final SubLObject char_code_in_ranges_p_alt(SubLObject char_code, SubLObject v_ranges) {
        {
            SubLObject okP = NIL;
            if (NIL == okP) {
                {
                    SubLObject csome_list_var = v_ranges;
                    SubLObject range = NIL;
                    for (range = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , range = csome_list_var.first()) {
                        {
                            SubLObject datum = range;
                            SubLObject current = datum;
                            SubLObject low = NIL;
                            SubLObject high = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt38);
                            low = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt38);
                            high = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (char_code.numGE(low) && char_code.numLE(high)) {
                                    okP = T;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt38);
                            }
                        }
                    }
                }
            }
            return okP;
        }
    }

    public static SubLObject char_code_in_ranges_p(final SubLObject char_code, final SubLObject v_ranges) {
        SubLObject okP = NIL;
        if (NIL == okP) {
            SubLObject csome_list_var = v_ranges;
            SubLObject range = NIL;
            range = csome_list_var.first();
            while ((NIL == okP) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = range;
                SubLObject low = NIL;
                SubLObject high = NIL;
                destructuring_bind_must_consp(current, datum, $list40);
                low = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list40);
                high = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (char_code.numGE(low) && char_code.numLE(high)) {
                        okP = T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list40);
                }
                csome_list_var = csome_list_var.rest();
                range = csome_list_var.first();
            } 
        }
        return okP;
    }

    public static final SubLObject xml_special_charP_alt(SubLObject v_char) {
        return makeBoolean((NIL != string_utilities.control_char_p(v_char)) || (NIL != member(v_char, $xml_special_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject xml_special_charP(final SubLObject v_char) {
        return makeBoolean((NIL != string_utilities.control_char_p(v_char)) || (NIL != member(v_char, $xml_special_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject xml_char_escaped_version_alt(SubLObject v_char) {
        if (NIL != string_utilities.control_char_p(v_char)) {
            return $str_alt40$_;
        }
        {
            SubLObject pcase_var = char_code(v_char);
            if (pcase_var.eql($int$34)) {
                return $str_alt42$_quot_;
            } else {
                if (pcase_var.eql($int$38)) {
                    return $str_alt44$_amp_;
                } else {
                    if (pcase_var.eql($int$39)) {
                        return $str_alt46$_apos_;
                    } else {
                        if (pcase_var.eql($int$60)) {
                            return $str_alt48$_lt_;
                        } else {
                            if (pcase_var.eql($int$62)) {
                                return $str_alt50$_gt_;
                            } else {
                                if (pcase_var.eql(TEN_INTEGER)) {
                                    return $str_alt40$_;
                                } else {
                                    return write_to_string(v_char, EMPTY_SUBL_OBJECT_ARRAY);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject xml_char_escaped_version(final SubLObject v_char) {
        if (NIL != string_utilities.control_char_p(v_char)) {
            return $$$_;
        }
        final SubLObject pcase_var = char_code(v_char);
        if (pcase_var.eql($int$34)) {
            return $str44$_quot_;
        }
        if (pcase_var.eql($int$38)) {
            return $str46$_amp_;
        }
        if (pcase_var.eql($int$39)) {
            return $str48$_apos_;
        }
        if (pcase_var.eql($int$60)) {
            return $str50$_lt_;
        }
        if (pcase_var.eql($int$62)) {
            return $str52$_gt_;
        }
        if (pcase_var.eql(TEN_INTEGER)) {
            return $$$_;
        }
        return write_to_string(v_char, EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static SubLObject xml_unescape_string(final SubLObject str) {
        return string_utilities.do_string_substitutions_robust(str, $list53, UNPROVIDED);
    }

    public static final SubLObject xml_write_wXescaped_special_chars_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject string_var = string;
            SubLObject end_var = length(string_var);
            SubLObject end_var_2 = end_var;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; !i.numGE(end_var_2); i = number_utilities.f_1X(i)) {
                {
                    SubLObject v_char = Strings.sublisp_char(string_var, i);
                    if ((v_char == CHAR_ampersand) && (NIL != com.cyc.cycjava.cycl.xml_utilities.possible_xml_entity_reference_p(string, i, UNPROVIDED))) {
                        com.cyc.cycjava.cycl.xml_utilities.xml_write_char(v_char);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.xml_utilities.xml_special_charP(v_char)) {
                            com.cyc.cycjava.cycl.xml_utilities.xml_write_string(com.cyc.cycjava.cycl.xml_utilities.xml_char_escaped_version(v_char), UNPROVIDED, UNPROVIDED);
                        } else {
                            if (NIL == com.cyc.cycjava.cycl.xml_utilities.valid_xml_char_p(v_char)) {
                                com.cyc.cycjava.cycl.xml_utilities.xml_write_char(CHAR_space);
                            } else {
                                com.cyc.cycjava.cycl.xml_utilities.xml_write_char(v_char);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject xml_write_wXescaped_special_chars(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        SubLObject end_var_$2;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        for (end_var = end_var_$2 = length(string), i = NIL, i = ZERO_INTEGER; !i.numGE(end_var_$2); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            if (v_char.eql(CHAR_newline)) {
                xml_write_char(v_char);
            } else
                if (v_char.eql(CHAR_ampersand) && (NIL != possible_xml_entity_reference_p(string, i, UNPROVIDED))) {
                    xml_write_char(v_char);
                } else
                    if (NIL != xml_special_charP(v_char)) {
                        xml_write_string(xml_char_escaped_version(v_char), UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL == valid_xml_char_p(v_char)) {
                            xml_write_char(CHAR_space);
                        } else {
                            xml_write_char(v_char);
                        }



        }
        return NIL;
    }

    public static final SubLObject possible_xml_entity_reference_p_alt(SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (((Strings.sublisp_char(string, start) == CHAR_ampersand) && (NIL != list_utilities.lengthG(string, add(start, TWO_INTEGER), UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.xml_utilities.valid_xml_entity_name_first_char_p(Strings.sublisp_char(string, number_utilities.f_1X(start))))) {
            {
                SubLObject name_stream = make_private_string_output_stream();
                princ(Strings.sublisp_char(string, number_utilities.f_1X(start)), name_stream);
                {
                    SubLObject string_var = string;
                    SubLObject end_var = length(string_var);
                    SubLObject end_var_3 = end_var;
                    SubLObject i = NIL;
                    for (i = add(start, TWO_INTEGER); !i.numGE(end_var_3); i = number_utilities.f_1X(i)) {
                        {
                            SubLObject v_char = Strings.sublisp_char(string_var, i);
                            if (v_char == CHAR_semicolon) {
                                return com.cyc.cycjava.cycl.xml_utilities.possible_xml_entity_name_p(get_output_stream_string(name_stream));
                            } else {
                                if (end.isInteger() && i.numG(end)) {
                                    return NIL;
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.xml_utilities.valid_xml_entity_name_char_p(v_char)) {
                                        princ(v_char, name_stream);
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject possible_xml_entity_reference_p(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if ((Strings.sublisp_char(string, start).eql(CHAR_ampersand) && (NIL != list_utilities.lengthG(string, add(start, TWO_INTEGER), UNPROVIDED))) && (NIL != valid_xml_entity_name_first_char_p(Strings.sublisp_char(string, number_utilities.f_1X(start))))) {
            final SubLObject name_stream = make_private_string_output_stream();
            princ(Strings.sublisp_char(string, number_utilities.f_1X(start)), name_stream);
            SubLObject end_var_$3;
            SubLObject end_var;
            SubLObject i;
            SubLObject v_char;
            for (end_var = end_var_$3 = length(string), i = NIL, i = add(start, TWO_INTEGER); !i.numGE(end_var_$3); i = number_utilities.f_1X(i)) {
                v_char = Strings.sublisp_char(string, i);
                if (v_char.eql(CHAR_semicolon)) {
                    return possible_xml_entity_name_p(get_output_stream_string(name_stream));
                }
                if (end.isInteger() && i.numG(end)) {
                    return NIL;
                }
                if (NIL == valid_xml_entity_name_char_p(v_char)) {
                    return NIL;
                }
                princ(v_char, name_stream);
            }
        }
        return NIL;
    }

    public static final SubLObject possible_xml_entity_name_p_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != uninitialized_p(xml_vars.$xml_document_entity_names$.getDynamicValue(thread))) {
                return T;
            } else {
                if (NIL != com.cyc.cycjava.cycl.xml_utilities.possible_xml_numeric_character_reference_p(string)) {
                    return T;
                } else {
                    if (NIL != list_utilities.alist_has_keyP(xml_vars.$xml_predefined_entities$.getGlobalValue(), string, UNPROVIDED)) {
                        return T;
                    } else {
                        return subl_promotions.memberP(string, xml_vars.$xml_document_entity_names$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED);
                    }
                }
            }
        }
    }

    public static SubLObject possible_xml_entity_name_p(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.uninitialized_p(xml_vars.$xml_document_entity_names$.getDynamicValue(thread))) {
            return T;
        }
        if (NIL != possible_xml_numeric_character_reference_p(string)) {
            return T;
        }
        if (NIL != list_utilities.alist_has_keyP(xml_vars.$xml_predefined_entities$.getGlobalValue(), string, UNPROVIDED)) {
            return T;
        }
        return subl_promotions.memberP(string, xml_vars.$xml_document_entity_names$.getDynamicValue(thread), symbol_function(EQUALP), UNPROVIDED);
    }

    public static final SubLObject possible_xml_numeric_character_reference_p_alt(SubLObject string) {
        {
            SubLObject possibleP = NIL;
            if (string_utilities.first_char(string).eql(CHAR_hash)) {
                if (NIL == list_utilities.find_if_not(DIGIT_CHAR_P, string, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED)) {
                    possibleP = T;
                } else {
                    if (Strings.sublisp_char(string, ONE_INTEGER).eql(CHAR_x) && (NIL == list_utilities.find_if_not(HEX_CHAR_P, string, symbol_function(IDENTITY), TWO_INTEGER, UNPROVIDED))) {
                        possibleP = T;
                    }
                }
            }
            return possibleP;
        }
    }

    public static SubLObject possible_xml_numeric_character_reference_p(final SubLObject string) {
        SubLObject possibleP = NIL;
        if (string_utilities.first_char(string).eql(CHAR_hash)) {
            if (NIL == list_utilities.find_if_not(DIGIT_CHAR_P, string, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED)) {
                possibleP = T;
            } else
                if (Strings.sublisp_char(string, ONE_INTEGER).eql(CHAR_x) && (NIL == list_utilities.find_if_not(HEX_CHAR_P, string, symbol_function(IDENTITY), TWO_INTEGER, UNPROVIDED))) {
                    possibleP = T;
                }

        }
        return possibleP;
    }

    public static final SubLObject valid_xml_entity_name_first_char_p_alt(SubLObject v_char) {
        return makeBoolean(((NIL != alpha_char_p(v_char)) || (v_char == CHAR_underbar)) || (v_char == CHAR_colon));
    }

    public static SubLObject valid_xml_entity_name_first_char_p(final SubLObject v_char) {
        return makeBoolean(((NIL != alpha_char_p(v_char)) || v_char.eql(CHAR_underbar)) || v_char.eql(CHAR_colon));
    }

    public static final SubLObject valid_xml_entity_name_char_p_alt(SubLObject v_char) {
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.xml_utilities.valid_xml_entity_name_first_char_p(v_char)) || (NIL != digit_char_p(v_char, UNPROVIDED))) || (v_char == CHAR_period)) || (v_char == CHAR_hyphen));
    }

    public static SubLObject valid_xml_entity_name_char_p(final SubLObject v_char) {
        return makeBoolean((((NIL != valid_xml_entity_name_first_char_p(v_char)) || (NIL != digit_char_p(v_char, UNPROVIDED))) || v_char.eql(CHAR_period)) || v_char.eql(CHAR_hyphen));
    }

    /**
     * Evaluate BODY with all XML output redirected to STREAM.
     */
    @LispMethod(comment = "Evaluate BODY with all XML output redirected to STREAM.")
    public static final SubLObject with_xml_output_to_stream_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject stream = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            stream = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($xml_stream$, stream)), append(body, NIL));
            }
        }
    }

    /**
     * Evaluate BODY with all XML output redirected to STREAM.
     */
    @LispMethod(comment = "Evaluate BODY with all XML output redirected to STREAM.")
    public static SubLObject with_xml_output_to_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        stream = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($xml_stream$, stream)), append(body, NIL));
    }

    /**
     * Evaluate BODY with all XML output redirected to a string.
     * On completion of BODY, the variable STRING-VAR is set to the resulting string.
     */
    @LispMethod(comment = "Evaluate BODY with all XML output redirected to a string.\r\nOn completion of BODY, the variable STRING-VAR is set to the resulting string.\nEvaluate BODY with all XML output redirected to a string.\nOn completion of BODY, the variable STRING-VAR is set to the resulting string.")
    public static final SubLObject with_xml_output_to_string_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject string_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt55);
            string_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLTrampolineFile.checkType(string_var, SYMBOLP);
                {
                    SubLObject stream = $sym57$STREAM;
                    return list(CWITH_OUTPUT_TO_STRING, list(stream, string_var), listS(WITH_XML_OUTPUT_TO_STREAM, stream, append(body, NIL)));
                }
            }
        }
    }

    /**
     * Evaluate BODY with all XML output redirected to a string.
     * On completion of BODY, the variable STRING-VAR is set to the resulting string.
     */
    @LispMethod(comment = "Evaluate BODY with all XML output redirected to a string.\r\nOn completion of BODY, the variable STRING-VAR is set to the resulting string.\nEvaluate BODY with all XML output redirected to a string.\nOn completion of BODY, the variable STRING-VAR is set to the resulting string.")
    public static SubLObject with_xml_output_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string_var = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        string_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        assert NIL != symbolp(string_var) : "! symbolp(string_var) " + ("Types.symbolp(string_var) " + "CommonSymbols.NIL != Types.symbolp(string_var) ") + string_var;
        final SubLObject stream = $sym60$STREAM;
        return list(CWITH_OUTPUT_TO_STRING, list(stream, string_var), listS(WITH_XML_OUTPUT_TO_STREAM, stream, append(body, NIL)));
    }

    public static final SubLObject generate_valid_xml_header_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    com.cyc.cycjava.cycl.xml_utilities.xml_header(com.cyc.cycjava.cycl.xml_utilities.xml_version(), $str_alt6$US_ASCII, NIL);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return stream;
        }
    }

    public static SubLObject generate_valid_xml_header(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            xml_header(xml_version(), $str6$US_ASCII, NIL);
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }

    public static final SubLObject generate_xml_header_entry_for_dtd_alt(SubLObject sysid, SubLObject dtd, SubLObject stream) {
        format(stream, $str_alt62$__DOCTYPE__A_SYSTEM__S_, sysid, dtd);
        com.cyc.cycjava.cycl.xml_utilities.xml_terpri();
        return stream;
    }

    public static SubLObject generate_xml_header_entry_for_dtd(final SubLObject sysid, final SubLObject dtd, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = xml_vars.$xml_stream$.getDynamicValue();
        }
        format(stream, $str65$__DOCTYPE__A_SYSTEM__S_, sysid, dtd);
        xml_terpri();
        return stream;
    }

    public static final SubLObject resolve_xml_namespaces_alt(SubLObject token, SubLObject stack) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject resolved = string_utilities.copy_string(token);
                SubLObject new_bindings = NIL;
                SubLObject datum = web_utilities.parse_xml_token(token);
                SubLObject current = datum;
                SubLObject element_name = NIL;
                SubLObject attributes = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt63);
                element_name = current.first();
                current = current.rest();
                attributes = current;
                if (NIL != string_utilities.substringP($str_alt64$xmlns_, token, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject cdolist_list_var = attributes;
                        SubLObject cons = NIL;
                        for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                            {
                                SubLObject datum_4 = cons;
                                SubLObject current_5 = datum_4;
                                SubLObject attribute = NIL;
                                SubLObject value = NIL;
                                destructuring_bind_must_consp(current_5, datum_4, $list_alt65);
                                attribute = current_5.first();
                                current_5 = current_5.rest();
                                value = current_5;
                                if (NIL != string_utilities.starts_with(attribute, $str_alt64$xmlns_)) {
                                    new_bindings = cons(cons(string_utilities.substring(attribute, SIX_INTEGER, position(CHAR_equal, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), value), new_bindings);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject resolved_element_name = com.cyc.cycjava.cycl.xml_utilities.maybe_resolve_xml_namespace(element_name, new_bindings, stack);
                    SubLObject something_changedP = string_utilities.non_empty_string_p(resolved_element_name);
                    SubLObject new_element_name = (NIL != resolved_element_name) ? ((SubLObject) (resolved_element_name)) : element_name;
                    SubLObject new_attributes = attributes;
                    SubLObject cdolist_list_var = attributes;
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum_6 = cons;
                            SubLObject current_7 = datum_6;
                            SubLObject key = NIL;
                            SubLObject value = NIL;
                            destructuring_bind_must_consp(current_7, datum_6, $list_alt66);
                            key = current_7.first();
                            current_7 = current_7.rest();
                            value = current_7;
                            {
                                SubLObject new_value = com.cyc.cycjava.cycl.xml_utilities.maybe_resolve_xml_namespace(value, new_bindings, stack);
                                if (NIL != new_value) {
                                    new_attributes = list_utilities.alist_enter(new_attributes, key, new_value, symbol_function(EQUAL));
                                    something_changedP = T;
                                }
                            }
                        }
                    }
                    if (NIL != something_changedP) {
                        {
                            SubLObject stream = NIL;
                            try {
                                stream = make_private_string_output_stream();
                                {
                                    SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_stream$.bind(stream, thread);
                                        if ((NIL != web_utilities.xml_opening_tag_p(token)) || (NIL != web_utilities.xml_empty_tagP(token))) {
                                            com.cyc.cycjava.cycl.xml_utilities.xml_start_tag_internal(new_element_name, list_utilities.alist_to_plist(new_attributes), web_utilities.xml_empty_tagP(token));
                                        } else {
                                            com.cyc.cycjava.cycl.xml_utilities.xml_end_tag_internal(new_element_name);
                                        }
                                    } finally {
                                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                resolved = get_output_stream_string(stream);
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        close(stream, UNPROVIDED);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return values(resolved, new_bindings);
            }
        }
    }

    public static SubLObject resolve_xml_namespaces(final SubLObject token, final SubLObject stack) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resolved = string_utilities.copy_string(token);
        SubLObject new_bindings = NIL;
        SubLObject current;
        final SubLObject datum = current = xml_parsing_utilities.parse_xml_token(token);
        SubLObject element_name = NIL;
        SubLObject attributes = NIL;
        destructuring_bind_must_consp(current, datum, $list66);
        element_name = current.first();
        current = attributes = current.rest();
        if (NIL != string_utilities.substringP($str67$xmlns_, token, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = attributes;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current_$5;
                final SubLObject datum_$4 = current_$5 = cons;
                SubLObject attribute = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current_$5, datum_$4, $list68);
                attribute = current_$5.first();
                current_$5 = value = current_$5.rest();
                if (NIL != string_utilities.starts_with(attribute, $str67$xmlns_)) {
                    new_bindings = cons(cons(string_utilities.substring(attribute, SIX_INTEGER, position(CHAR_equal, attribute, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), value), new_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        }
        final SubLObject resolved_element_name = maybe_resolve_xml_namespace(element_name, new_bindings, stack);
        SubLObject something_changedP = string_utilities.non_empty_string_p(resolved_element_name);
        final SubLObject new_element_name = (NIL != resolved_element_name) ? resolved_element_name : element_name;
        SubLObject new_attributes = attributes;
        SubLObject cdolist_list_var2 = attributes;
        SubLObject cons2 = NIL;
        cons2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current_$6;
            final SubLObject datum_$5 = current_$6 = cons2;
            SubLObject key = NIL;
            SubLObject value2 = NIL;
            destructuring_bind_must_consp(current_$6, datum_$5, $list69);
            key = current_$6.first();
            current_$6 = value2 = current_$6.rest();
            final SubLObject new_value = maybe_resolve_xml_namespace(value2, new_bindings, stack);
            if (NIL != new_value) {
                new_attributes = list_utilities.alist_enter(new_attributes, key, new_value, symbol_function(EQUAL));
                something_changedP = T;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons2 = cdolist_list_var2.first();
        } 
        if (NIL != something_changedP) {
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    if ((NIL != xml_parsing_utilities.xml_opening_tag_p(token)) || (NIL != xml_parsing_utilities.xml_empty_tagP(token))) {
                        xml_start_tag_internal(new_element_name, list_utilities.alist_to_plist(new_attributes), xml_parsing_utilities.xml_empty_tagP(token), UNPROVIDED, UNPROVIDED);
                    } else {
                        xml_end_tag_internal(new_element_name);
                    }
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
                resolved = get_output_stream_string(stream);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    close(stream, UNPROVIDED);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return values(resolved, new_bindings);
    }

    public static final SubLObject maybe_resolve_xml_namespace_alt(SubLObject name, SubLObject new_bindings, SubLObject stack) {
        return (((NIL != find(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == string_utilities.starts_with(name, $str_alt64$xmlns_))) && (NIL == string_utilities.starts_with(name, $str_alt67$xml_))) && (NIL == string_utilities.starts_with(name, $str_alt68$http_)) ? ((SubLObject) (com.cyc.cycjava.cycl.xml_utilities.resolve_xml_namespace(name, new_bindings, stack))) : NIL;
    }

    public static SubLObject maybe_resolve_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack) {
        return (((NIL != find(CHAR_colon, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == string_utilities.starts_with(name, $str67$xmlns_))) && (NIL == string_utilities.starts_with(name, $str70$xml_))) && (NIL == string_utilities.starts_with(name, $str71$http_)) ? resolve_xml_namespace(name, new_bindings, stack) : NIL;
    }

    /**
     * Return the expanded version of NAME based on NEW-BINDINGS and STACK.
     */
    @LispMethod(comment = "Return the expanded version of NAME based on NEW-BINDINGS and STACK.")
    public static final SubLObject resolve_xml_namespace_alt(SubLObject name, SubLObject new_bindings, SubLObject stack) {
        {
            SubLObject namespace = web_utilities.xml_prefixed_name_namespace(name);
            SubLObject expanded = list_utilities.alist_lookup_without_values(new_bindings, namespace, symbol_function(EQUAL), NIL);
            if (NIL == expanded) {
                {
                    SubLObject csome_list_var = stack;
                    SubLObject binding = NIL;
                    for (binding = csome_list_var.first(); !((NIL != expanded) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , binding = csome_list_var.first()) {
                        if (binding.isCons() && namespace.equal(binding.first())) {
                            expanded = binding.rest();
                        }
                    }
                }
            }
            if (NIL == expanded) {
                Errors.error($str_alt69$Couldn_t_resolve__S_based_on__S_a, name, new_bindings, stack);
            }
            return cconcatenate(expanded, web_utilities.xml_prefixed_name_local_name(name));
        }
    }

    /**
     * Return the expanded version of NAME based on NEW-BINDINGS and STACK.
     */
    @LispMethod(comment = "Return the expanded version of NAME based on NEW-BINDINGS and STACK.")
    public static SubLObject resolve_xml_namespace(final SubLObject name, final SubLObject new_bindings, final SubLObject stack) {
        final SubLObject namespace = xml_parsing_utilities.xml_prefixed_name_namespace(name);
        SubLObject expanded = list_utilities.alist_lookup_without_values(new_bindings, namespace, symbol_function(EQUAL), NIL);
        if (NIL == expanded) {
            SubLObject csome_list_var = stack;
            SubLObject binding = NIL;
            binding = csome_list_var.first();
            while ((NIL == expanded) && (NIL != csome_list_var)) {
                if (binding.isCons() && namespace.equal(binding.first())) {
                    expanded = binding.rest();
                }
                csome_list_var = csome_list_var.rest();
                binding = csome_list_var.first();
            } 
        }
        if (NIL == expanded) {
            Errors.error($str72$Couldn_t_resolve__S_based_on__S_a, name, new_bindings, stack);
        }
        return cconcatenate(expanded, xml_parsing_utilities.xml_prefixed_name_local_name(name));
    }

    /**
     * Output SEXPR back to *XML-STREAM* as XML
     */
    @LispMethod(comment = "Output SEXPR back to *XML-STREAM* as XML")
    public static final SubLObject xml_sexpr_output_as_xml_alt(SubLObject sexpr) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (sexpr.isString()) {
                com.cyc.cycjava.cycl.xml_utilities.xml_write_string(sexpr, UNPROVIDED, UNPROVIDED);
            } else {
                {
                    SubLObject atomicP = NIL;
                    SubLObject no_nested_elementsP = sublisp_null(find_if(LISTP, web_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    {
                        SubLObject _prev_bind_0 = $xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $cycml_indent_level$.currentBinding(thread);
                        try {
                            $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                            $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                            com.cyc.cycjava.cycl.xml_utilities.xml_start_tag_internal(web_utilities.xml_sexpr_type(sexpr), com.cyc.cycjava.cycl.xml_utilities.xml_tag_attributes_from_sexpr(sexpr), atomicP);
                            com.cyc.cycjava.cycl.xml_utilities.xml_sexpr_output_daughters(sexpr, UNPROVIDED);
                        } finally {
                            $cycml_indent_level$.rebind(_prev_bind_1, thread);
                            $xml_indentation_level$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL == atomicP) {
                        if (NIL == no_nested_elementsP) {
                            com.cyc.cycjava.cycl.xml_utilities.xml_terpri();
                        }
                        com.cyc.cycjava.cycl.xml_utilities.xml_end_tag_internal(web_utilities.xml_sexpr_type(sexpr));
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Output SEXPR back to *XML-STREAM* as XML
     */
    @LispMethod(comment = "Output SEXPR back to *XML-STREAM* as XML")
    public static SubLObject xml_sexpr_output_as_xml(final SubLObject sexpr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sexpr.isString()) {
            xml_write_string(sexpr, UNPROVIDED, UNPROVIDED);
        } else {
            final SubLObject atomicP = NIL;
            final SubLObject no_nested_elementsP = sublisp_null(find_if(LISTP, xml_parsing_utilities.xml_sexpr_daughters(sexpr, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            try {
                final SubLObject _prev_bind_0 = $xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $cycml_indent_level$.currentBinding(thread);
                try {
                    $xml_indentation_level$.bind(add($xml_indentation_amount$.getDynamicValue(thread), $xml_indentation_level$.getDynamicValue(thread)), thread);
                    $cycml_indent_level$.bind($xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_start_tag_internal(xml_parsing_utilities.xml_sexpr_type(sexpr), xml_tag_attributes_from_sexpr(sexpr), atomicP, NIL, $UNINITIALIZED);
                    final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                        xml_sexpr_output_daughters(sexpr, UNPROVIDED);
                    } finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                    }
                } finally {
                    $cycml_indent_level$.rebind(_prev_bind_2, thread);
                    $xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL == atomicP) {
                        if (NIL == no_nested_elementsP) {
                            xml_terpri();
                        }
                        xml_end_tag_internal(xml_parsing_utilities.xml_sexpr_type(sexpr));
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        return NIL;
    }

    /**
     * Output the daughters of SEXPR back to *XML-STREAM* as XML
     */
    @LispMethod(comment = "Output the daughters of SEXPR back to *XML-STREAM* as XML")
    public static final SubLObject xml_sexpr_output_daughters_alt(SubLObject sexpr, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = NIL;
        }
        {
            SubLObject dtrs = web_utilities.xml_sexpr_daughters(sexpr, tag);
            SubLObject list_var = NIL;
            SubLObject dtr_sexpr = NIL;
            SubLObject dtr_num = NIL;
            for (list_var = dtrs, dtr_sexpr = list_var.first(), dtr_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , dtr_sexpr = list_var.first() , dtr_num = add(ONE_INTEGER, dtr_num)) {
                com.cyc.cycjava.cycl.xml_utilities.xml_sexpr_output_as_xml(dtr_sexpr);
                if (!(dtr_sexpr.isString() || (NIL != list_utilities.lengthE(dtrs, number_utilities.f_1X(dtr_num), UNPROVIDED)))) {
                    com.cyc.cycjava.cycl.xml_utilities.xml_terpri();
                }
            }
        }
        return NIL;
    }

    /**
     * Output the daughters of SEXPR back to *XML-STREAM* as XML
     */
    @LispMethod(comment = "Output the daughters of SEXPR back to *XML-STREAM* as XML")
    public static SubLObject xml_sexpr_output_daughters(final SubLObject sexpr, SubLObject tag) {
        if (tag == UNPROVIDED) {
            tag = NIL;
        }
        final SubLObject dtrs = xml_parsing_utilities.xml_sexpr_daughters(sexpr, tag);
        SubLObject list_var = NIL;
        SubLObject dtr_sexpr = NIL;
        SubLObject dtr_num = NIL;
        list_var = dtrs;
        dtr_sexpr = list_var.first();
        for (dtr_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , dtr_sexpr = list_var.first() , dtr_num = add(ONE_INTEGER, dtr_num)) {
            xml_sexpr_output_as_xml(dtr_sexpr);
            if ((!dtr_sexpr.isString()) && (NIL == list_utilities.lengthE(dtrs, number_utilities.f_1X(dtr_num), UNPROVIDED))) {
                xml_terpri();
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP; the attributes from SEXPR in the format required by @xref XML-TAG
     */
    @LispMethod(comment = "@return LISTP; the attributes from SEXPR in the format required by @xref XML-TAG")
    public static final SubLObject xml_tag_attributes_from_sexpr_alt(SubLObject sexpr) {
        return list_utilities.alist_to_plist(web_utilities.xml_sexpr_attributes(sexpr));
    }

    /**
     *
     *
     * @return LISTP; the attributes from SEXPR in the format required by @xref XML-TAG
     */
    @LispMethod(comment = "@return LISTP; the attributes from SEXPR in the format required by @xref XML-TAG")
    public static SubLObject xml_tag_attributes_from_sexpr(final SubLObject sexpr) {
        return list_utilities.alist_to_plist(xml_parsing_utilities.xml_sexpr_attributes(sexpr));
    }

    public static final SubLObject alists_sort_key_alt(SubLObject alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.alist_lookup(alist, $alists_sort_key$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject alists_sort_key(final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.alist_lookup(alist, $alists_sort_key$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject attribute_vars_alt(SubLObject attributes) {
        {
            SubLObject attribute_vars = NIL;
            SubLObject grouping_key_pairs = NIL;
            SubLObject remainder = NIL;
            for (remainder = attributes; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject attribute_name = remainder.first();
                    SubLObject attribute_var = cadr(remainder);
                    if (attribute_var.isString()) {
                        grouping_key_pairs = cons(cons(attribute_var, attribute_var), grouping_key_pairs);
                    }
                    attribute_vars = cons(attribute_var, attribute_vars);
                }
            }
            return values(attribute_vars, grouping_key_pairs);
        }
    }

    public static SubLObject attribute_vars(final SubLObject attributes) {
        SubLObject attribute_vars = NIL;
        SubLObject grouping_key_pairs = NIL;
        SubLObject remainder;
        SubLObject attribute_name;
        SubLObject attribute_var;
        for (remainder = NIL, remainder = attributes; NIL != remainder; remainder = cddr(remainder)) {
            attribute_name = remainder.first();
            attribute_var = cadr(remainder);
            if (attribute_var.isString()) {
                grouping_key_pairs = cons(cons(attribute_var, attribute_var), grouping_key_pairs);
            }
            attribute_vars = cons(attribute_var, attribute_vars);
        }
        return values(attribute_vars, grouping_key_pairs);
    }

    public static final SubLObject sort_query_results_on_el_var_alt(SubLObject alists, SubLObject sort_key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = $alists_sort_key$.currentBinding(thread);
                    try {
                        $alists_sort_key$.bind(sort_key, thread);
                        results = Sort.sort(copy_list(alists), symbol_function($sym71$TERM___WITH_CONSTANT_BY_NAME), ALISTS_SORT_KEY);
                    } finally {
                        $alists_sort_key$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject sort_query_results_on_el_var(final SubLObject alists, final SubLObject sort_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = $alists_sort_key$.currentBinding(thread);
        try {
            $alists_sort_key$.bind(sort_key, thread);
            results = Sort.sort(copy_list(alists), symbol_function($sym75$TERM___WITH_CONSTANT_BY_NAME), ALISTS_SORT_KEY);
        } finally {
            $alists_sort_key$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject write_xml_from_grouped_bindings_alt(SubLObject grouped_bindings, SubLObject xml_spec, SubLObject indent_num, SubLObject output_stream, SubLObject cycl_prefixP) {
        {
            SubLObject name = getf(xml_spec, $NAME, UNPROVIDED);
            SubLObject attributes = getf(xml_spec, $ATTRIBUTES, UNPROVIDED);
            SubLObject elements = getf(xml_spec, $ELEMENTS, UNPROVIDED);
            SubLObject text = getf(xml_spec, $TEXT, UNPROVIDED);
            SubLObject attribute_vars = com.cyc.cycjava.cycl.xml_utilities.attribute_vars(attributes);
            SubLObject cdolist_list_var = grouped_bindings;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject grouping_key_tuples = NIL;
                    SubLObject other_bindings = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt77);
                    grouping_key_tuples = current.first();
                    current = current.rest();
                    other_bindings = current;
                    string_utilities.indent(output_stream, indent_num);
                    format(output_stream, $str_alt78$__A, name);
                    if (grouping_key_tuples.isList()) {
                        {
                            SubLObject cdolist_list_var_8 = attribute_vars;
                            SubLObject attribute_var = NIL;
                            for (attribute_var = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , attribute_var = cdolist_list_var_8.first()) {
                                {
                                    SubLObject value = format_nil.format_nil_a(list_utilities.alist_lookup(grouping_key_tuples, attribute_var, UNPROVIDED, UNPROVIDED));
                                    if (NIL == cycl_prefixP) {
                                        value = string_utilities.remove_substring(value, $str_alt79$__);
                                    }
                                    format(output_stream, $str_alt80$__A__A, getf(reverse(attributes), attribute_var, UNPROVIDED), string_utilities.quote_string(value, UNPROVIDED));
                                }
                            }
                        }
                    }
                    if ((NIL != elements) || (NIL != text)) {
                        format(output_stream, $str_alt81$___);
                        if (NIL != text) {
                            string_utilities.indent(output_stream, indent_num);
                            {
                                SubLObject value = format_nil.format_nil_a(list_utilities.alist_lookup(grouping_key_tuples, text, UNPROVIDED, UNPROVIDED));
                                if (NIL == cycl_prefixP) {
                                    value = string_utilities.remove_substring(value, $str_alt79$__);
                                }
                                format(output_stream, $str_alt82$_A__, value);
                            }
                        }
                        if (NIL != other_bindings) {
                            {
                                SubLObject cdolist_list_var_9 = elements;
                                SubLObject element = NIL;
                                for (element = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , element = cdolist_list_var_9.first()) {
                                    com.cyc.cycjava.cycl.xml_utilities.query_bindings_to_xml(other_bindings, element, add(indent_num, TWO_INTEGER), output_stream, cycl_prefixP);
                                }
                            }
                        }
                        string_utilities.indent(output_stream, indent_num);
                        format(output_stream, $str_alt83$___A___, name);
                    } else {
                        format(output_stream, $str_alt84$____);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject write_xml_from_grouped_bindings(final SubLObject grouped_bindings, final SubLObject xml_spec, final SubLObject indent_num, final SubLObject output_stream, final SubLObject cycl_prefixP) {
        final SubLObject name = getf(xml_spec, $NAME, UNPROVIDED);
        final SubLObject attributes = getf(xml_spec, $ATTRIBUTES, UNPROVIDED);
        final SubLObject elements = getf(xml_spec, $ELEMENTS, UNPROVIDED);
        final SubLObject text = getf(xml_spec, $TEXT, UNPROVIDED);
        final SubLObject attribute_vars = attribute_vars(attributes);
        SubLObject cdolist_list_var = grouped_bindings;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject grouping_key_tuples = NIL;
            SubLObject other_bindings = NIL;
            destructuring_bind_must_consp(current, datum, $list81);
            grouping_key_tuples = current.first();
            current = other_bindings = current.rest();
            string_utilities.indent(output_stream, indent_num);
            format(output_stream, $str82$__A, name);
            if (grouping_key_tuples.isList()) {
                SubLObject cdolist_list_var_$9 = attribute_vars;
                SubLObject attribute_var = NIL;
                attribute_var = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    SubLObject value = format_nil.format_nil_a(list_utilities.alist_lookup(grouping_key_tuples, attribute_var, UNPROVIDED, UNPROVIDED));
                    if (NIL == cycl_prefixP) {
                        value = string_utilities.remove_substring(value, $str83$__);
                    }
                    format(output_stream, $str84$__A__A, getf(reverse(attributes), attribute_var, UNPROVIDED), string_utilities.quote_string(value, UNPROVIDED));
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    attribute_var = cdolist_list_var_$9.first();
                } 
            }
            if ((NIL != elements) || (NIL != text)) {
                format(output_stream, $str85$___);
                if (NIL != text) {
                    string_utilities.indent(output_stream, indent_num);
                    SubLObject value2 = format_nil.format_nil_a(list_utilities.alist_lookup(grouping_key_tuples, text, UNPROVIDED, UNPROVIDED));
                    if (NIL == cycl_prefixP) {
                        value2 = string_utilities.remove_substring(value2, $str83$__);
                    }
                    format(output_stream, $str86$_A__, value2);
                }
                if (NIL != other_bindings) {
                    SubLObject cdolist_list_var_$10 = elements;
                    SubLObject element = NIL;
                    element = cdolist_list_var_$10.first();
                    while (NIL != cdolist_list_var_$10) {
                        query_bindings_to_xml(other_bindings, element, add(indent_num, TWO_INTEGER), output_stream, cycl_prefixP);
                        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                        element = cdolist_list_var_$10.first();
                    } 
                }
                string_utilities.indent(output_stream, indent_num);
                format(output_stream, $str87$___A___, name);
            } else {
                format(output_stream, $str88$____);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject query_bindings_to_xml_alt(SubLObject query_bindings, SubLObject query_result_xml_spec, SubLObject indent_num, SubLObject output_stream, SubLObject cycl_prefixP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject query_results = query_bindings;
                SubLObject attributes = getf(query_result_xml_spec, $ATTRIBUTES, UNPROVIDED);
                SubLObject text = getf(query_result_xml_spec, $TEXT, UNPROVIDED);
                SubLObject sort_asc = getf(query_result_xml_spec, $SORT_ASC, UNPROVIDED);
                SubLObject sort_desc = getf(query_result_xml_spec, $SORT_DESC, UNPROVIDED);
                SubLObject count = ZERO_INTEGER;
                SubLObject attribute_vars = NIL;
                SubLObject initial_grouping_key_tuples = NIL;
                SubLObject grouping_keys = NIL;
                SubLObject other_bindings_by_el_value_tuples = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject attribute_vars_10 = com.cyc.cycjava.cycl.xml_utilities.attribute_vars(attributes);
                    SubLObject initial_grouping_key_tuples_11 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    attribute_vars = attribute_vars_10;
                    initial_grouping_key_tuples = initial_grouping_key_tuples_11;
                }
                grouping_keys = attribute_vars;
                if (NIL != sort_asc) {
                    query_results = reverse(com.cyc.cycjava.cycl.xml_utilities.sort_query_results_on_el_var(query_bindings, sort_asc));
                } else {
                    if (NIL != sort_desc) {
                        query_results = com.cyc.cycjava.cycl.xml_utilities.sort_query_results_on_el_var(query_bindings, sort_desc);
                    }
                }
                if (NIL != text) {
                    if (text.isString()) {
                        initial_grouping_key_tuples = cons(cons(text, text), initial_grouping_key_tuples);
                    }
                    grouping_keys = cons(text, grouping_keys);
                }
                {
                    SubLObject cdolist_list_var = query_results;
                    SubLObject query_result = NIL;
                    for (query_result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , query_result = cdolist_list_var.first()) {
                        if (NIL != grouping_keys) {
                            {
                                SubLObject grouping_key_tuples = initial_grouping_key_tuples;
                                SubLObject cdolist_list_var_12 = query_result;
                                SubLObject binding = NIL;
                                for (binding = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , binding = cdolist_list_var_12.first()) {
                                    {
                                        SubLObject el_var = binding.first();
                                        if (NIL != list_utilities.member_eqP(el_var, grouping_keys)) {
                                            grouping_key_tuples = cons(binding, grouping_key_tuples);
                                        }
                                    }
                                }
                                other_bindings_by_el_value_tuples = list_utilities.alist_push(other_bindings_by_el_value_tuples, grouping_key_tuples, query_result, symbol_function(EQUAL));
                            }
                        } else {
                            other_bindings_by_el_value_tuples = list_utilities.alist_push(other_bindings_by_el_value_tuples, count, query_result, symbol_function(EQUAL));
                            count = number_utilities.f_1X(count);
                        }
                    }
                }
                com.cyc.cycjava.cycl.xml_utilities.write_xml_from_grouped_bindings(other_bindings_by_el_value_tuples, query_result_xml_spec, indent_num, output_stream, cycl_prefixP);
            }
            return T;
        }
    }

    public static SubLObject query_bindings_to_xml(final SubLObject query_bindings, final SubLObject query_result_xml_spec, final SubLObject indent_num, final SubLObject output_stream, final SubLObject cycl_prefixP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_results = query_bindings;
        final SubLObject attributes = getf(query_result_xml_spec, $ATTRIBUTES, UNPROVIDED);
        final SubLObject text = getf(query_result_xml_spec, $TEXT, UNPROVIDED);
        final SubLObject sort_asc = getf(query_result_xml_spec, $SORT_ASC, UNPROVIDED);
        final SubLObject sort_desc = getf(query_result_xml_spec, $SORT_DESC, UNPROVIDED);
        SubLObject count = ZERO_INTEGER;
        SubLObject attribute_vars = NIL;
        SubLObject initial_grouping_key_tuples = NIL;
        SubLObject grouping_keys = NIL;
        SubLObject other_bindings_by_el_value_tuples = NIL;
        thread.resetMultipleValues();
        final SubLObject attribute_vars_$11 = attribute_vars(attributes);
        final SubLObject initial_grouping_key_tuples_$12 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        attribute_vars = attribute_vars_$11;
        initial_grouping_key_tuples = initial_grouping_key_tuples_$12;
        grouping_keys = attribute_vars;
        if (NIL != sort_asc) {
            query_results = reverse(sort_query_results_on_el_var(query_bindings, sort_asc));
        } else
            if (NIL != sort_desc) {
                query_results = sort_query_results_on_el_var(query_bindings, sort_desc);
            }

        if (NIL != text) {
            if (text.isString()) {
                initial_grouping_key_tuples = cons(cons(text, text), initial_grouping_key_tuples);
            }
            grouping_keys = cons(text, grouping_keys);
        }
        SubLObject cdolist_list_var = query_results;
        SubLObject query_result = NIL;
        query_result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != grouping_keys) {
                SubLObject grouping_key_tuples = initial_grouping_key_tuples;
                SubLObject cdolist_list_var_$13 = query_result;
                SubLObject binding = NIL;
                binding = cdolist_list_var_$13.first();
                while (NIL != cdolist_list_var_$13) {
                    final SubLObject el_var = binding.first();
                    if (NIL != list_utilities.member_eqP(el_var, grouping_keys)) {
                        grouping_key_tuples = cons(binding, grouping_key_tuples);
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    binding = cdolist_list_var_$13.first();
                } 
                other_bindings_by_el_value_tuples = list_utilities.alist_push(other_bindings_by_el_value_tuples, grouping_key_tuples, query_result, symbol_function(EQUAL));
            } else {
                other_bindings_by_el_value_tuples = list_utilities.alist_push(other_bindings_by_el_value_tuples, count, query_result, symbol_function(EQUAL));
                count = number_utilities.f_1X(count);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_result = cdolist_list_var.first();
        } 
        write_xml_from_grouped_bindings(other_bindings_by_el_value_tuples, query_result_xml_spec, indent_num, output_stream, cycl_prefixP);
        return T;
    }

    public static final SubLObject get_default_xml_spec_for_el_vars_alt(SubLObject el_vars) {
        {
            SubLObject xml_spec = copy_seq($str_alt87$__name__binding___elements__);
            SubLObject cdolist_list_var = el_vars;
            SubLObject el_var = NIL;
            for (el_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , el_var = cdolist_list_var.first()) {
                xml_spec = cconcatenate(format_nil.format_nil_a_no_copy(xml_spec), new SubLObject[]{ $str_alt88$__name__, format_nil.format_nil_a_no_copy(Strings.string_downcase(cycl_variables.el_var_name_without_prefix(el_var), UNPROVIDED, UNPROVIDED)), $str_alt89$___text_, format_nil.format_nil_a_no_copy(el_var), $str_alt90$__ });
            }
            xml_spec = cconcatenate(format_nil.format_nil_a_no_copy(xml_spec), $str_alt91$__);
            return read_from_string(xml_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject get_default_xml_spec_for_el_vars(final SubLObject el_vars) {
        SubLObject xml_spec = copy_seq($str91$__name__binding___elements__);
        SubLObject cdolist_list_var = el_vars;
        SubLObject el_var = NIL;
        el_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            xml_spec = cconcatenate(format_nil.format_nil_a_no_copy(xml_spec), new SubLObject[]{ $str92$__name__, format_nil.format_nil_a_no_copy(Strings.string_downcase(cycl_variables.el_var_name_without_prefix(el_var), UNPROVIDED, UNPROVIDED)), $str93$___text_, format_nil.format_nil_a_no_copy(el_var), $str94$__ });
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        } 
        xml_spec = cconcatenate(format_nil.format_nil_a_no_copy(xml_spec), $str95$__);
        return read_from_string(xml_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject query_bindings_to_xml_stream_alt(SubLObject el_bindings, SubLObject xml_spec, SubLObject indent_num, SubLObject stream, SubLObject cycl_prefixP) {
        if (cycl_prefixP == UNPROVIDED) {
            cycl_prefixP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                try {
                    xml_vars.$xml_stream$.bind(stream, thread);
                    com.cyc.cycjava.cycl.xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    com.cyc.cycjava.cycl.xml_utilities.xml_start_tag_internal($$$root, NIL, NIL);
                    com.cyc.cycjava.cycl.xml_utilities.xml_terpri();
                    com.cyc.cycjava.cycl.xml_utilities.query_bindings_to_xml(el_bindings, xml_spec, indent_num, stream, cycl_prefixP);
                    com.cyc.cycjava.cycl.xml_utilities.xml_end_tag_internal($$$root);
                } finally {
                    xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                }
            }
            return stream;
        }
    }

    public static SubLObject query_bindings_to_xml_stream(final SubLObject el_bindings, final SubLObject xml_spec, final SubLObject indent_num, final SubLObject stream, SubLObject cycl_prefixP) {
        if (cycl_prefixP == UNPROVIDED) {
            cycl_prefixP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(stream, thread);
            xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            xml_start_tag_internal($$$root, NIL, NIL, UNPROVIDED, UNPROVIDED);
            xml_terpri();
            query_bindings_to_xml(el_bindings, xml_spec, indent_num, stream, cycl_prefixP);
            xml_end_tag_internal($$$root);
        } finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }

    public static final SubLObject query_results_to_xml_stream_alt(SubLObject query_sent, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec, SubLObject stream) {
        if (query_mt == UNPROVIDED) {
            query_mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = $DEFAULT;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (xml_spec.equal($DEFAULT)) {
            {
                SubLObject free_el_vars = sentence_free_variables(query_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                xml_spec = com.cyc.cycjava.cycl.xml_utilities.get_default_xml_spec_for_el_vars(free_el_vars);
            }
        }
        {
            SubLObject el_bindings = inference_kernel.new_cyc_query(query_sent, query_mt, query_properties);
            com.cyc.cycjava.cycl.xml_utilities.query_bindings_to_xml_stream(el_bindings, xml_spec, TWO_INTEGER, stream, UNPROVIDED);
        }
        return stream;
    }

    public static SubLObject query_results_to_xml_stream(final SubLObject query_sent, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec, SubLObject stream) {
        if (query_mt == UNPROVIDED) {
            query_mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = $DEFAULT;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (xml_spec.equal($DEFAULT)) {
            final SubLObject free_el_vars = sentence_free_variables(query_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            xml_spec = get_default_xml_spec_for_el_vars(free_el_vars);
        }
        final SubLObject el_bindings = inference_kernel.new_cyc_query(query_sent, query_mt, query_properties);
        query_bindings_to_xml_stream(el_bindings, xml_spec, TWO_INTEGER, stream, UNPROVIDED);
        return stream;
    }

    public static SubLObject download_xml_url(final SubLObject url, SubLObject source_file, SubLObject accept_types, SubLObject follow_redirectsP) {
        if (source_file == UNPROVIDED) {
            source_file = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $list99;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != web_utilities.url_p(url) : "! web_utilities.url_p(url) " + ("web_utilities.url_p(url) " + "CommonSymbols.NIL != web_utilities.url_p(url) ") + url;
        if (NIL == source_file) {
            source_file = file_utilities.make_unused_temp_filename(UNPROVIDED);
        }
        SubLObject error_message = web_utilities.save_url_to_file(url, source_file, accept_types, follow_redirectsP);
        if (NIL == error_message) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text(source_file, $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str102$Unable_to_open__S, source_file);
                }
                final SubLObject s = stream;
                if (file_length(s).numL($int$2000)) {
                    final SubLObject contents = string_utilities.read_string_from_file(source_file, UNPROVIDED, UNPROVIDED);
                    if ((NIL != search($$$404, contents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != search($$$Not_Found, contents, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        error_message = $str106$Url_not_found_;
                    } else
                        if (NIL != search($str107$503_Service_Temporarily_Unavailab, contents, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            error_message = $$$Server_not_available;
                        } else
                            if (NIL == string_utilities.starts_with_by_test(contents, $str109$__xml, symbol_function(EQUALP))) {
                                final SubLObject snippet_end = min(FIFTEEN_INTEGER, length(contents));
                                final SubLObject snippet = string_utilities.substring(contents, ZERO_INTEGER, snippet_end);
                                error_message = cconcatenate($str110$Not_XML_document__Starts_with_, format_nil.format_nil_s_no_copy(snippet));
                            }


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
        }
        if (NIL != error_message) {
            Errors.error($str111$Encountered_error_trying_to_downl, url, error_message);
        }
        return source_file;
    }

    public static final SubLObject query_results_to_xml_file_alt(SubLObject query_sent, SubLObject file, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec) {
        if (query_mt == UNPROVIDED) {
            query_mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = $DEFAULT;
        }
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(file, $OUTPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt97$Unable_to_open__S, file);
                }
                {
                    SubLObject s_out = stream;
                    com.cyc.cycjava.cycl.xml_utilities.query_results_to_xml_stream(query_sent, query_mt, query_properties, xml_spec, s_out);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return file;
    }

    public static SubLObject query_results_to_xml_file(final SubLObject query_sent, final SubLObject file, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec) {
        if (query_mt == UNPROVIDED) {
            query_mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = $DEFAULT;
        }
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(file, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str102$Unable_to_open__S, file);
            }
            final SubLObject s_out = stream;
            query_results_to_xml_stream(query_sent, query_mt, query_properties, xml_spec, s_out);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return file;
    }

    public static final SubLObject query_results_to_xml_string_alt(SubLObject query_sent, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec) {
        if (query_mt == UNPROVIDED) {
            query_mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = $DEFAULT;
        }
        if (xml_spec.equal($DEFAULT)) {
            {
                SubLObject free_el_vars = sentence_free_variables(query_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                xml_spec = com.cyc.cycjava.cycl.xml_utilities.get_default_xml_spec_for_el_vars(free_el_vars);
            }
        }
        {
            SubLObject el_bindings = inference_kernel.new_cyc_query(query_sent, query_mt, query_properties);
            SubLObject xml_string = NIL;
            SubLObject stream = NIL;
            try {
                stream = make_private_string_output_stream();
                com.cyc.cycjava.cycl.xml_utilities.query_bindings_to_xml_stream(el_bindings, xml_spec, TWO_INTEGER, stream, UNPROVIDED);
                xml_string = get_output_stream_string(stream);
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        close(stream, UNPROVIDED);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return xml_string;
        }
    }

    public static SubLObject query_results_to_xml_string(final SubLObject query_sent, SubLObject query_mt, SubLObject query_properties, SubLObject xml_spec) {
        if (query_mt == UNPROVIDED) {
            query_mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        if (xml_spec == UNPROVIDED) {
            xml_spec = $DEFAULT;
        }
        if (xml_spec.equal($DEFAULT)) {
            final SubLObject free_el_vars = sentence_free_variables(query_sent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            xml_spec = get_default_xml_spec_for_el_vars(free_el_vars);
        }
        final SubLObject el_bindings = inference_kernel.new_cyc_query(query_sent, query_mt, query_properties);
        SubLObject xml_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            query_bindings_to_xml_stream(el_bindings, xml_spec, TWO_INTEGER, stream, UNPROVIDED);
            xml_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return xml_string;
    }

    public static final SubLObject boolean_to_trueXfalse_string_alt(SubLObject v_boolean) {
        return NIL != v_boolean ? ((SubLObject) ($$$true)) : $$$false;
    }

    public static SubLObject boolean_to_trueXfalse_string(final SubLObject v_boolean) {
        return NIL != v_boolean ? $$$true : $$$false;
    }

    public static final SubLObject declare_xml_utilities_file_alt() {
        declareFunction("xml_version", "XML-VERSION", 0, 0, false);
        declareFunction("xml_add_indentation", "XML-ADD-INDENTATION", 0, 1, false);
        declareMacro("with_xml_indentation", "WITH-XML-INDENTATION");
        declareFunction("xml_terpri", "XML-TERPRI", 0, 0, false);
        declareFunction("xml_write_string", "XML-WRITE-STRING", 1, 2, false);
        declareFunction("xml_write_char", "XML-WRITE-CHAR", 1, 0, false);
        declareFunction("xml_write_string_indented", "XML-WRITE-STRING-INDENTED", 1, 2, false);
        declareFunction("xml_header", "XML-HEADER", 0, 3, false);
        declareFunction("xml_cdata_prefix", "XML-CDATA-PREFIX", 0, 0, false);
        declareFunction("xml_cdata_suffix", "XML-CDATA-SUFFIX", 0, 0, false);
        declareFunction("xml_cdata", "XML-CDATA", 1, 0, false);
        declareFunction("xml_markup", "XML-MARKUP", 1, 0, false);
        declareFunction("xml_comment", "XML-COMMENT", 1, 0, false);
        declareMacro("xml_tag", "XML-TAG");
        declareFunction("xml_start_tag_internal", "XML-START-TAG-INTERNAL", 3, 0, false);
        declareFunction("xml_end_tag_internal", "XML-END-TAG-INTERNAL", 1, 0, false);
        declareFunction("xml_print", "XML-PRINT", 1, 1, false);
        declareFunction("xml_prin1", "XML-PRIN1", 1, 1, false);
        declareFunction("xml_print_line", "XML-PRINT-LINE", 1, 1, false);
        declareFunction("xml_prin1_line", "XML-PRIN1-LINE", 1, 1, false);
        declareFunction("xml_write", "XML-WRITE", 1, 1, false);
        declareFunction("xml_write_line", "XML-WRITE-LINE", 1, 1, false);
        declareFunction("valid_xml_name_p", "VALID-XML-NAME-P", 1, 0, false);
        declareFunction("remove_invalid_xml_name_chars", "REMOVE-INVALID-XML-NAME-CHARS", 1, 0, false);
        declareFunction("valid_ascii_xml_name_p", "VALID-ASCII-XML-NAME-P", 1, 0, false);
        declareFunction("valid_xml_name_initial_char_p", "VALID-XML-NAME-INITIAL-CHAR-P", 1, 0, false);
        declareFunction("valid_xml_name_initial_char_code_p", "VALID-XML-NAME-INITIAL-CHAR-CODE-P", 1, 0, false);
        declareFunction("valid_non_ascii_xml_name_p", "VALID-NON-ASCII-XML-NAME-P", 1, 0, false);
        declareFunction("valid_xml_name_char_p", "VALID-XML-NAME-CHAR-P", 1, 0, false);
        declareFunction("remove_invalid_xml_name_chars_from_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-ASCII-STRING", 1, 0, false);
        declareFunction("remove_invalid_xml_name_chars_from_non_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-NON-ASCII-STRING", 1, 0, false);
        declareFunction("valid_xml_name_char_code_p", "VALID-XML-NAME-CHAR-CODE-P", 1, 0, false);
        declareFunction("digit_char_code_p", "DIGIT-CHAR-CODE-P", 1, 0, false);
        declareFunction("xml_letter_char_p", "XML-LETTER-CHAR-P", 1, 0, false);
        declareFunction("xml_letter_char_code_p", "XML-LETTER-CHAR-CODE-P", 1, 0, false);
        declareFunction("xml_base_char_p", "XML-BASE-CHAR-P", 1, 0, false);
        declareFunction("xml_base_char_code_p", "XML-BASE-CHAR-CODE-P", 1, 0, false);
        declareFunction("xml_ideographic_char_p", "XML-IDEOGRAPHIC-CHAR-P", 1, 0, false);
        declareFunction("xml_ideographic_char_code_p", "XML-IDEOGRAPHIC-CHAR-CODE-P", 1, 0, false);
        declareFunction("valid_xml_char_p", "VALID-XML-CHAR-P", 1, 0, false);
        declareFunction("valid_xml_char_code_p", "VALID-XML-CHAR-CODE-P", 1, 0, false);
        declareFunction("char_in_ranges_p", "CHAR-IN-RANGES-P", 2, 0, false);
        declareFunction("char_code_in_ranges_p", "CHAR-CODE-IN-RANGES-P", 2, 0, false);
        declareFunction("xml_special_charP", "XML-SPECIAL-CHAR?", 1, 0, false);
        declareFunction("xml_char_escaped_version", "XML-CHAR-ESCAPED-VERSION", 1, 0, false);
        declareFunction("xml_write_wXescaped_special_chars", "XML-WRITE-W/ESCAPED-SPECIAL-CHARS", 1, 0, false);
        declareFunction("possible_xml_entity_reference_p", "POSSIBLE-XML-ENTITY-REFERENCE-P", 1, 2, false);
        declareFunction("possible_xml_entity_name_p", "POSSIBLE-XML-ENTITY-NAME-P", 1, 0, false);
        declareFunction("possible_xml_numeric_character_reference_p", "POSSIBLE-XML-NUMERIC-CHARACTER-REFERENCE-P", 1, 0, false);
        declareFunction("valid_xml_entity_name_first_char_p", "VALID-XML-ENTITY-NAME-FIRST-CHAR-P", 1, 0, false);
        declareFunction("valid_xml_entity_name_char_p", "VALID-XML-ENTITY-NAME-CHAR-P", 1, 0, false);
        declareMacro("with_xml_output_to_stream", "WITH-XML-OUTPUT-TO-STREAM");
        declareMacro("with_xml_output_to_string", "WITH-XML-OUTPUT-TO-STRING");
        declareFunction("generate_valid_xml_header", "GENERATE-VALID-XML-HEADER", 1, 0, false);
        declareFunction("generate_xml_header_entry_for_dtd", "GENERATE-XML-HEADER-ENTRY-FOR-DTD", 3, 0, false);
        declareFunction("resolve_xml_namespaces", "RESOLVE-XML-NAMESPACES", 2, 0, false);
        declareFunction("maybe_resolve_xml_namespace", "MAYBE-RESOLVE-XML-NAMESPACE", 3, 0, false);
        declareFunction("resolve_xml_namespace", "RESOLVE-XML-NAMESPACE", 3, 0, false);
        declareFunction("xml_sexpr_output_as_xml", "XML-SEXPR-OUTPUT-AS-XML", 1, 0, false);
        declareFunction("xml_sexpr_output_daughters", "XML-SEXPR-OUTPUT-DAUGHTERS", 1, 1, false);
        declareFunction("xml_tag_attributes_from_sexpr", "XML-TAG-ATTRIBUTES-FROM-SEXPR", 1, 0, false);
        declareFunction("alists_sort_key", "ALISTS-SORT-KEY", 1, 0, false);
        declareFunction("attribute_vars", "ATTRIBUTE-VARS", 1, 0, false);
        declareFunction("sort_query_results_on_el_var", "SORT-QUERY-RESULTS-ON-EL-VAR", 2, 0, false);
        declareFunction("write_xml_from_grouped_bindings", "WRITE-XML-FROM-GROUPED-BINDINGS", 5, 0, false);
        declareFunction("query_bindings_to_xml", "QUERY-BINDINGS-TO-XML", 5, 0, false);
        declareFunction("get_default_xml_spec_for_el_vars", "GET-DEFAULT-XML-SPEC-FOR-EL-VARS", 1, 0, false);
        declareFunction("query_bindings_to_xml_stream", "QUERY-BINDINGS-TO-XML-STREAM", 4, 1, false);
        declareFunction("query_results_to_xml_stream", "QUERY-RESULTS-TO-XML-STREAM", 1, 4, false);
        declareFunction("query_results_to_xml_file", "QUERY-RESULTS-TO-XML-FILE", 2, 3, false);
        declareFunction("query_results_to_xml_string", "QUERY-RESULTS-TO-XML-STRING", 1, 3, false);
        declareFunction("boolean_to_trueXfalse_string", "BOOLEAN-TO-TRUE/FALSE-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_xml_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("xml_version", "XML-VERSION", 0, 0, false);
            declareFunction("xml_add_indentation", "XML-ADD-INDENTATION", 0, 1, false);
            declareMacro("with_xml_indentation", "WITH-XML-INDENTATION");
            declareFunction("xml_terpri", "XML-TERPRI", 0, 0, false);
            declareFunction("xml_write_string", "XML-WRITE-STRING", 1, 2, false);
            declareFunction("xml_write_char", "XML-WRITE-CHAR", 1, 0, false);
            declareFunction("xml_write_string_indented", "XML-WRITE-STRING-INDENTED", 1, 2, false);
            declareFunction("xml_header", "XML-HEADER", 0, 3, false);
            declareFunction("xml_cdata_prefix", "XML-CDATA-PREFIX", 0, 0, false);
            declareFunction("xml_cdata_suffix", "XML-CDATA-SUFFIX", 0, 0, false);
            declareFunction("xml_cdata", "XML-CDATA", 1, 0, false);
            declareFunction("xml_markup", "XML-MARKUP", 1, 0, false);
            declareFunction("xml_comment", "XML-COMMENT", 1, 0, false);
            declareMacro("xml_tag", "XML-TAG");
            declareFunction("xml_start_tag_internal", "XML-START-TAG-INTERNAL", 3, 2, false);
            declareFunction("xml_end_tag_internal", "XML-END-TAG-INTERNAL", 1, 0, false);
            declareFunction("xml_print", "XML-PRINT", 1, 1, false);
            declareFunction("xml_prin1", "XML-PRIN1", 1, 1, false);
            declareFunction("xml_print_line", "XML-PRINT-LINE", 1, 1, false);
            declareFunction("xml_prin1_line", "XML-PRIN1-LINE", 1, 1, false);
            declareFunction("xml_write", "XML-WRITE", 1, 1, false);
            declareFunction("xml_write_line", "XML-WRITE-LINE", 1, 1, false);
            declareFunction("valid_xml_name_p", "VALID-XML-NAME-P", 1, 0, false);
            declareFunction("remove_invalid_xml_name_chars", "REMOVE-INVALID-XML-NAME-CHARS", 1, 0, false);
            declareFunction("valid_ascii_xml_name_p", "VALID-ASCII-XML-NAME-P", 1, 0, false);
            declareFunction("valid_xml_name_initial_char_p", "VALID-XML-NAME-INITIAL-CHAR-P", 1, 0, false);
            declareFunction("valid_xml_name_initial_char_code_p", "VALID-XML-NAME-INITIAL-CHAR-CODE-P", 1, 0, false);
            declareFunction("valid_non_ascii_xml_name_p", "VALID-NON-ASCII-XML-NAME-P", 1, 0, false);
            declareFunction("valid_xml_name_char_p", "VALID-XML-NAME-CHAR-P", 1, 0, false);
            declareFunction("remove_invalid_xml_name_chars_from_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-ASCII-STRING", 1, 0, false);
            declareFunction("remove_invalid_xml_name_chars_from_non_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-NON-ASCII-STRING", 1, 0, false);
            declareFunction("valid_xml_name_char_code_p", "VALID-XML-NAME-CHAR-CODE-P", 1, 0, false);
            declareFunction("digit_char_code_p", "DIGIT-CHAR-CODE-P", 1, 0, false);
            declareFunction("xml_letter_char_p", "XML-LETTER-CHAR-P", 1, 0, false);
            declareFunction("xml_letter_char_code_p", "XML-LETTER-CHAR-CODE-P", 1, 0, false);
            declareFunction("xml_base_char_p", "XML-BASE-CHAR-P", 1, 0, false);
            declareFunction("xml_base_char_code_p", "XML-BASE-CHAR-CODE-P", 1, 0, false);
            declareFunction("xml_ideographic_char_p", "XML-IDEOGRAPHIC-CHAR-P", 1, 0, false);
            declareFunction("xml_ideographic_char_code_p", "XML-IDEOGRAPHIC-CHAR-CODE-P", 1, 0, false);
            declareFunction("valid_xml_char_p", "VALID-XML-CHAR-P", 1, 0, false);
            declareFunction("valid_xml_char_code_p", "VALID-XML-CHAR-CODE-P", 1, 0, false);
            declareFunction("char_in_ranges_p", "CHAR-IN-RANGES-P", 2, 0, false);
            declareFunction("char_code_in_ranges_p", "CHAR-CODE-IN-RANGES-P", 2, 0, false);
            declareFunction("xml_special_charP", "XML-SPECIAL-CHAR?", 1, 0, false);
            declareFunction("xml_char_escaped_version", "XML-CHAR-ESCAPED-VERSION", 1, 0, false);
            declareFunction("xml_unescape_string", "XML-UNESCAPE-STRING", 1, 0, false);
            declareFunction("xml_write_wXescaped_special_chars", "XML-WRITE-W/ESCAPED-SPECIAL-CHARS", 1, 0, false);
            declareFunction("possible_xml_entity_reference_p", "POSSIBLE-XML-ENTITY-REFERENCE-P", 1, 2, false);
            declareFunction("possible_xml_entity_name_p", "POSSIBLE-XML-ENTITY-NAME-P", 1, 0, false);
            declareFunction("possible_xml_numeric_character_reference_p", "POSSIBLE-XML-NUMERIC-CHARACTER-REFERENCE-P", 1, 0, false);
            declareFunction("valid_xml_entity_name_first_char_p", "VALID-XML-ENTITY-NAME-FIRST-CHAR-P", 1, 0, false);
            declareFunction("valid_xml_entity_name_char_p", "VALID-XML-ENTITY-NAME-CHAR-P", 1, 0, false);
            declareMacro("with_xml_output_to_stream", "WITH-XML-OUTPUT-TO-STREAM");
            declareMacro("with_xml_output_to_string", "WITH-XML-OUTPUT-TO-STRING");
            declareFunction("generate_valid_xml_header", "GENERATE-VALID-XML-HEADER", 1, 0, false);
            declareFunction("generate_xml_header_entry_for_dtd", "GENERATE-XML-HEADER-ENTRY-FOR-DTD", 2, 1, false);
            declareFunction("resolve_xml_namespaces", "RESOLVE-XML-NAMESPACES", 2, 0, false);
            declareFunction("maybe_resolve_xml_namespace", "MAYBE-RESOLVE-XML-NAMESPACE", 3, 0, false);
            declareFunction("resolve_xml_namespace", "RESOLVE-XML-NAMESPACE", 3, 0, false);
            declareFunction("xml_sexpr_output_as_xml", "XML-SEXPR-OUTPUT-AS-XML", 1, 0, false);
            declareFunction("xml_sexpr_output_daughters", "XML-SEXPR-OUTPUT-DAUGHTERS", 1, 1, false);
            declareFunction("xml_tag_attributes_from_sexpr", "XML-TAG-ATTRIBUTES-FROM-SEXPR", 1, 0, false);
            declareFunction("alists_sort_key", "ALISTS-SORT-KEY", 1, 0, false);
            declareFunction("attribute_vars", "ATTRIBUTE-VARS", 1, 0, false);
            declareFunction("sort_query_results_on_el_var", "SORT-QUERY-RESULTS-ON-EL-VAR", 2, 0, false);
            declareFunction("write_xml_from_grouped_bindings", "WRITE-XML-FROM-GROUPED-BINDINGS", 5, 0, false);
            declareFunction("query_bindings_to_xml", "QUERY-BINDINGS-TO-XML", 5, 0, false);
            declareFunction("get_default_xml_spec_for_el_vars", "GET-DEFAULT-XML-SPEC-FOR-EL-VARS", 1, 0, false);
            declareFunction("query_bindings_to_xml_stream", "QUERY-BINDINGS-TO-XML-STREAM", 4, 1, false);
            declareFunction("query_results_to_xml_stream", "QUERY-RESULTS-TO-XML-STREAM", 1, 4, false);
            declareFunction("download_xml_url", "DOWNLOAD-XML-URL", 1, 3, false);
            declareFunction("query_results_to_xml_file", "QUERY-RESULTS-TO-XML-FILE", 2, 3, false);
            declareFunction("query_results_to_xml_string", "QUERY-RESULTS-TO-XML-STRING", 1, 3, false);
            declareFunction("boolean_to_trueXfalse_string", "BOOLEAN-TO-TRUE/FALSE-STRING", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("xml_start_tag_internal", "XML-START-TAG-INTERNAL", 3, 0, false);
            declareFunction("generate_xml_header_entry_for_dtd", "GENERATE-XML-HEADER-ENTRY-FOR-DTD", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_xml_utilities_file_Previous() {
        declareFunction("xml_version", "XML-VERSION", 0, 0, false);
        declareFunction("xml_add_indentation", "XML-ADD-INDENTATION", 0, 1, false);
        declareMacro("with_xml_indentation", "WITH-XML-INDENTATION");
        declareFunction("xml_terpri", "XML-TERPRI", 0, 0, false);
        declareFunction("xml_write_string", "XML-WRITE-STRING", 1, 2, false);
        declareFunction("xml_write_char", "XML-WRITE-CHAR", 1, 0, false);
        declareFunction("xml_write_string_indented", "XML-WRITE-STRING-INDENTED", 1, 2, false);
        declareFunction("xml_header", "XML-HEADER", 0, 3, false);
        declareFunction("xml_cdata_prefix", "XML-CDATA-PREFIX", 0, 0, false);
        declareFunction("xml_cdata_suffix", "XML-CDATA-SUFFIX", 0, 0, false);
        declareFunction("xml_cdata", "XML-CDATA", 1, 0, false);
        declareFunction("xml_markup", "XML-MARKUP", 1, 0, false);
        declareFunction("xml_comment", "XML-COMMENT", 1, 0, false);
        declareMacro("xml_tag", "XML-TAG");
        declareFunction("xml_start_tag_internal", "XML-START-TAG-INTERNAL", 3, 2, false);
        declareFunction("xml_end_tag_internal", "XML-END-TAG-INTERNAL", 1, 0, false);
        declareFunction("xml_print", "XML-PRINT", 1, 1, false);
        declareFunction("xml_prin1", "XML-PRIN1", 1, 1, false);
        declareFunction("xml_print_line", "XML-PRINT-LINE", 1, 1, false);
        declareFunction("xml_prin1_line", "XML-PRIN1-LINE", 1, 1, false);
        declareFunction("xml_write", "XML-WRITE", 1, 1, false);
        declareFunction("xml_write_line", "XML-WRITE-LINE", 1, 1, false);
        declareFunction("valid_xml_name_p", "VALID-XML-NAME-P", 1, 0, false);
        declareFunction("remove_invalid_xml_name_chars", "REMOVE-INVALID-XML-NAME-CHARS", 1, 0, false);
        declareFunction("valid_ascii_xml_name_p", "VALID-ASCII-XML-NAME-P", 1, 0, false);
        declareFunction("valid_xml_name_initial_char_p", "VALID-XML-NAME-INITIAL-CHAR-P", 1, 0, false);
        declareFunction("valid_xml_name_initial_char_code_p", "VALID-XML-NAME-INITIAL-CHAR-CODE-P", 1, 0, false);
        declareFunction("valid_non_ascii_xml_name_p", "VALID-NON-ASCII-XML-NAME-P", 1, 0, false);
        declareFunction("valid_xml_name_char_p", "VALID-XML-NAME-CHAR-P", 1, 0, false);
        declareFunction("remove_invalid_xml_name_chars_from_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-ASCII-STRING", 1, 0, false);
        declareFunction("remove_invalid_xml_name_chars_from_non_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-NON-ASCII-STRING", 1, 0, false);
        declareFunction("valid_xml_name_char_code_p", "VALID-XML-NAME-CHAR-CODE-P", 1, 0, false);
        declareFunction("digit_char_code_p", "DIGIT-CHAR-CODE-P", 1, 0, false);
        declareFunction("xml_letter_char_p", "XML-LETTER-CHAR-P", 1, 0, false);
        declareFunction("xml_letter_char_code_p", "XML-LETTER-CHAR-CODE-P", 1, 0, false);
        declareFunction("xml_base_char_p", "XML-BASE-CHAR-P", 1, 0, false);
        declareFunction("xml_base_char_code_p", "XML-BASE-CHAR-CODE-P", 1, 0, false);
        declareFunction("xml_ideographic_char_p", "XML-IDEOGRAPHIC-CHAR-P", 1, 0, false);
        declareFunction("xml_ideographic_char_code_p", "XML-IDEOGRAPHIC-CHAR-CODE-P", 1, 0, false);
        declareFunction("valid_xml_char_p", "VALID-XML-CHAR-P", 1, 0, false);
        declareFunction("valid_xml_char_code_p", "VALID-XML-CHAR-CODE-P", 1, 0, false);
        declareFunction("char_in_ranges_p", "CHAR-IN-RANGES-P", 2, 0, false);
        declareFunction("char_code_in_ranges_p", "CHAR-CODE-IN-RANGES-P", 2, 0, false);
        declareFunction("xml_special_charP", "XML-SPECIAL-CHAR?", 1, 0, false);
        declareFunction("xml_char_escaped_version", "XML-CHAR-ESCAPED-VERSION", 1, 0, false);
        declareFunction("xml_unescape_string", "XML-UNESCAPE-STRING", 1, 0, false);
        declareFunction("xml_write_wXescaped_special_chars", "XML-WRITE-W/ESCAPED-SPECIAL-CHARS", 1, 0, false);
        declareFunction("possible_xml_entity_reference_p", "POSSIBLE-XML-ENTITY-REFERENCE-P", 1, 2, false);
        declareFunction("possible_xml_entity_name_p", "POSSIBLE-XML-ENTITY-NAME-P", 1, 0, false);
        declareFunction("possible_xml_numeric_character_reference_p", "POSSIBLE-XML-NUMERIC-CHARACTER-REFERENCE-P", 1, 0, false);
        declareFunction("valid_xml_entity_name_first_char_p", "VALID-XML-ENTITY-NAME-FIRST-CHAR-P", 1, 0, false);
        declareFunction("valid_xml_entity_name_char_p", "VALID-XML-ENTITY-NAME-CHAR-P", 1, 0, false);
        declareMacro("with_xml_output_to_stream", "WITH-XML-OUTPUT-TO-STREAM");
        declareMacro("with_xml_output_to_string", "WITH-XML-OUTPUT-TO-STRING");
        declareFunction("generate_valid_xml_header", "GENERATE-VALID-XML-HEADER", 1, 0, false);
        declareFunction("generate_xml_header_entry_for_dtd", "GENERATE-XML-HEADER-ENTRY-FOR-DTD", 2, 1, false);
        declareFunction("resolve_xml_namespaces", "RESOLVE-XML-NAMESPACES", 2, 0, false);
        declareFunction("maybe_resolve_xml_namespace", "MAYBE-RESOLVE-XML-NAMESPACE", 3, 0, false);
        declareFunction("resolve_xml_namespace", "RESOLVE-XML-NAMESPACE", 3, 0, false);
        declareFunction("xml_sexpr_output_as_xml", "XML-SEXPR-OUTPUT-AS-XML", 1, 0, false);
        declareFunction("xml_sexpr_output_daughters", "XML-SEXPR-OUTPUT-DAUGHTERS", 1, 1, false);
        declareFunction("xml_tag_attributes_from_sexpr", "XML-TAG-ATTRIBUTES-FROM-SEXPR", 1, 0, false);
        declareFunction("alists_sort_key", "ALISTS-SORT-KEY", 1, 0, false);
        declareFunction("attribute_vars", "ATTRIBUTE-VARS", 1, 0, false);
        declareFunction("sort_query_results_on_el_var", "SORT-QUERY-RESULTS-ON-EL-VAR", 2, 0, false);
        declareFunction("write_xml_from_grouped_bindings", "WRITE-XML-FROM-GROUPED-BINDINGS", 5, 0, false);
        declareFunction("query_bindings_to_xml", "QUERY-BINDINGS-TO-XML", 5, 0, false);
        declareFunction("get_default_xml_spec_for_el_vars", "GET-DEFAULT-XML-SPEC-FOR-EL-VARS", 1, 0, false);
        declareFunction("query_bindings_to_xml_stream", "QUERY-BINDINGS-TO-XML-STREAM", 4, 1, false);
        declareFunction("query_results_to_xml_stream", "QUERY-RESULTS-TO-XML-STREAM", 1, 4, false);
        declareFunction("download_xml_url", "DOWNLOAD-XML-URL", 1, 3, false);
        declareFunction("query_results_to_xml_file", "QUERY-RESULTS-TO-XML-FILE", 2, 3, false);
        declareFunction("query_results_to_xml_string", "QUERY-RESULTS-TO-XML-STRING", 1, 3, false);
        declareFunction("boolean_to_trueXfalse_string", "BOOLEAN-TO-TRUE/FALSE-STRING", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("*XML-INDENTATION-LEVEL*"), list(makeSymbol("+"), makeSymbol("*XML-INDENTATION-AMOUNT*"), makeSymbol("*XML-INDENTATION-LEVEL*"))), list(makeSymbol("*CYCML-INDENT-LEVEL*"), makeSymbol("*XML-INDENTATION-LEVEL*")));

    static private final SubLString $str_alt4$Skipping_invalid_xml_character__S = makeString("Skipping invalid xml character ~S in ~S");

    static private final SubLString $str_alt6$US_ASCII = makeString("US-ASCII");

    static private final SubLString $str_alt10$__xml_version_ = makeString("<?xml version=");

    static private final SubLString $str_alt12$_encoding_ = makeString(" encoding=");

    static private final SubLString $str_alt13$_standalone_ = makeString(" standalone=");

    static private final SubLString $str_alt16$__ = makeString("?>");

    static private final SubLString $str_alt17$___CDATA_ = makeString("<![CDATA[");

    static private final SubLString $str_alt18$___ = makeString("]]>");

    static private final SubLString $str_alt19$____ = makeString("<!--");

    static private final SubLString $str_alt20$___ = makeString("-->");

    static private final SubLList $list_alt21 = list(list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("ATTRIBUTES"), makeSymbol("ATOMIC?"), makeSymbol("NO-NESTED-ELEMENTS?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("XML-TERPRI")));

    static private final SubLString $str_alt28$__ = makeString("=\"");

    static private final SubLString $str_alt29$__ = makeString("/>");

    static private final SubLString $str_alt30$__ = makeString("</");

    static private final SubLString $str_alt31$_ = makeString("&");

    static private final SubLString $str_alt32$_ = makeString(";");

    static private final SubLList $list_alt35 = list(makeInteger(46), makeInteger(45), makeInteger(95), makeInteger(58));

    public static final SubLObject $list_alt36 = com.cyc.cycjava.cycl.xml_utilities._constant_36_initializer();

    static private final SubLList $list_alt37 = list(list(makeInteger(19968), makeInteger(40869)), list(makeInteger(12295), makeInteger(12295)), list(makeInteger(12321), makeInteger(12329)));

    static private final SubLList $list_alt38 = list(makeSymbol("LOW"), makeSymbol("HIGH"));

    static private final SubLList $list_alt39 = list(CHAR_ampersand, CHAR_quotation, CHAR_quote, CHAR_greater, CHAR_less, CHAR_newline);

    static private final SubLString $str_alt40$_ = makeString(" ");

    static private final SubLString $str_alt42$_quot_ = makeString("&quot;");

    static private final SubLString $str_alt44$_amp_ = makeString("&amp;");

    static private final SubLString $str_alt46$_apos_ = makeString("&apos;");

    static private final SubLString $str_alt48$_lt_ = makeString("&lt;");

    static private final SubLString $str_alt50$_gt_ = makeString("&gt;");

    static private final SubLList $list_alt53 = list(makeSymbol("STREAM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt55 = list(makeSymbol("STRING-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym57$STREAM = makeUninternedSymbol("STREAM");

    public static final SubLObject init_xml_utilities_file_alt() {
        defparameter("*XML-VERSION*", $float$1_0);
        defparameter("*XML-INDENTATION-LEVEL*", ZERO_INTEGER);
        defparameter("*XML-INDENTATION-AMOUNT*", ONE_INTEGER);
        defparameter("*CYCML-INDENT-LEVEL*", ZERO_INTEGER);
        deflexical("*XML-CDATA-PREFIX*", $str_alt17$___CDATA_);
        deflexical("*XML-CDATA-SUFFIX*", $str_alt18$___);
        deflexical("*XML-BASE-CHAR-CODE-RANGES*", $list_alt36);
        deflexical("*XML-IDEOGRAPHIC-CHAR-CODE-RANGES*", $list_alt37);
        defconstant("*XML-SPECIAL-CHARS*", $list_alt39);
        defparameter("*ALISTS-SORT-KEY*", NIL);
        return NIL;
    }

    public static SubLObject init_xml_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*XML-VERSION*", $float$1_0);
            defparameter("*XML-INDENTATION-LEVEL*", ZERO_INTEGER);
            defparameter("*XML-INDENTATION-AMOUNT*", ONE_INTEGER);
            defparameter("*CYCML-INDENT-LEVEL*", ZERO_INTEGER);
            deflexical("*XML-CDATA-PREFIX*", $str17$___CDATA_);
            deflexical("*XML-CDATA-SUFFIX*", $str18$___);
            deflexical("*XML-BASE-CHAR-CODE-RANGES*", $list38);
            deflexical("*XML-IDEOGRAPHIC-CHAR-CODE-RANGES*", $list39);
            defconstant("*XML-SPECIAL-CHARS*", $list41);
            defparameter("*ALISTS-SORT-KEY*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*XML-BASE-CHAR-CODE-RANGES*", $list_alt36);
            deflexical("*XML-IDEOGRAPHIC-CHAR-CODE-RANGES*", $list_alt37);
            defconstant("*XML-SPECIAL-CHARS*", $list_alt39);
        }
        return NIL;
    }

    public static SubLObject init_xml_utilities_file_Previous() {
        defparameter("*XML-VERSION*", $float$1_0);
        defparameter("*XML-INDENTATION-LEVEL*", ZERO_INTEGER);
        defparameter("*XML-INDENTATION-AMOUNT*", ONE_INTEGER);
        defparameter("*CYCML-INDENT-LEVEL*", ZERO_INTEGER);
        deflexical("*XML-CDATA-PREFIX*", $str17$___CDATA_);
        deflexical("*XML-CDATA-SUFFIX*", $str18$___);
        deflexical("*XML-BASE-CHAR-CODE-RANGES*", $list38);
        deflexical("*XML-IDEOGRAPHIC-CHAR-CODE-RANGES*", $list39);
        defconstant("*XML-SPECIAL-CHARS*", $list41);
        defparameter("*ALISTS-SORT-KEY*", NIL);
        return NIL;
    }

    static private final SubLList $list_alt61 = list(makeSymbol("XML-HEADER"));

    static private final SubLString $str_alt62$__DOCTYPE__A_SYSTEM__S_ = makeString("<!DOCTYPE ~A SYSTEM ~S>");

    static private final SubLList $list_alt63 = cons(makeSymbol("ELEMENT-NAME"), makeSymbol("ATTRIBUTES"));

    static private final SubLString $str_alt64$xmlns_ = makeString("xmlns:");

    static private final SubLList $list_alt65 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    static private final SubLList $list_alt66 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str_alt67$xml_ = makeString("xml:");

    public static final SubLObject setup_xml_utilities_file_alt() {
        define_obsolete_register(GENERATE_VALID_XML_HEADER, $list_alt61);
        register_external_symbol(QUERY_RESULTS_TO_XML_STREAM);
        register_external_symbol(QUERY_RESULTS_TO_XML_FILE);
        register_external_symbol(QUERY_RESULTS_TO_XML_STRING);
        return NIL;
    }

    public static SubLObject setup_xml_utilities_file() {
        if (SubLFiles.USE_V1) {
            define_obsolete_register(GENERATE_VALID_XML_HEADER, $list64);
            register_external_symbol(QUERY_RESULTS_TO_XML_STREAM);
            register_external_symbol(QUERY_RESULTS_TO_XML_FILE);
            register_external_symbol(QUERY_RESULTS_TO_XML_STRING);
        }
        if (SubLFiles.USE_V2) {
            define_obsolete_register(GENERATE_VALID_XML_HEADER, $list_alt61);
        }
        return NIL;
    }

    public static SubLObject setup_xml_utilities_file_Previous() {
        define_obsolete_register(GENERATE_VALID_XML_HEADER, $list64);
        register_external_symbol(QUERY_RESULTS_TO_XML_STREAM);
        register_external_symbol(QUERY_RESULTS_TO_XML_FILE);
        register_external_symbol(QUERY_RESULTS_TO_XML_STRING);
        return NIL;
    }

    static private final SubLString $str_alt68$http_ = makeString("http:");

    static private final SubLString $str_alt69$Couldn_t_resolve__S_based_on__S_a = makeString("Couldn't resolve ~S based on ~S and ~S.");

    static private final SubLSymbol $sym71$TERM___WITH_CONSTANT_BY_NAME = makeSymbol("TERM-<-WITH-CONSTANT-BY-NAME");

    private static SubLObject _constant_38_initializer() {
        return list(new SubLObject[]{ list(makeInteger(65), makeInteger(90)), list(makeInteger(97), makeInteger(122)), list(makeInteger(192), makeInteger(214)), list(makeInteger(216), makeInteger(246)), list(makeInteger(248), makeInteger(255)), list(makeInteger(256), makeInteger(305)), list(makeInteger(308), makeInteger(318)), list(makeInteger(321), makeInteger(328)), list(makeInteger(330), makeInteger(382)), list(makeInteger(384), makeInteger(451)), list(makeInteger(461), makeInteger(496)), list(makeInteger(500), makeInteger(501)), list(makeInteger(506), makeInteger(535)), list(makeInteger(592), makeInteger(680)), list(makeInteger(699), makeInteger(705)), list(makeInteger(902), makeInteger(902)), list(makeInteger(904), makeInteger(906)), list(makeInteger(908), makeInteger(908)), list(makeInteger(910), makeInteger(929)), list(makeInteger(931), makeInteger(974)), list(makeInteger(976), makeInteger(982)), list(makeInteger(986), makeInteger(986)), list(makeInteger(988), makeInteger(988)), list(makeInteger(990), makeInteger(990)), list(makeInteger(992), makeInteger(992)), list(makeInteger(994), makeInteger(1011)), list(makeInteger(1025), makeInteger(1036)), list(makeInteger(1038), makeInteger(1103)), list(makeInteger(1105), makeInteger(1116)), list(makeInteger(1118), makeInteger(1153)), list(makeInteger(1168), makeInteger(1220)), list(makeInteger(1223), makeInteger(1224)), list(makeInteger(1227), makeInteger(1228)), list(makeInteger(1232), makeInteger(1259)), list(makeInteger(1262), makeInteger(1269)), list(makeInteger(1272), makeInteger(1273)), list(makeInteger(1329), makeInteger(1366)), list(makeInteger(1369), makeInteger(1369)), list(makeInteger(1377), makeInteger(1414)), list(makeInteger(1488), makeInteger(1514)), list(makeInteger(1520), makeInteger(1522)), list(makeInteger(1569), makeInteger(1594)), list(makeInteger(1601), makeInteger(1610)), list(makeInteger(1649), makeInteger(1719)), list(makeInteger(1722), makeInteger(1726)), list(makeInteger(1728), makeInteger(1742)), list(makeInteger(1744), makeInteger(1747)), list(makeInteger(1749), makeInteger(1749)), list(makeInteger(1765), makeInteger(1766)), list(makeInteger(2309), makeInteger(2361)), list(makeInteger(2365), makeInteger(2365)), list(makeInteger(2392), makeInteger(2401)), list(makeInteger(2437), makeInteger(2444)), list(makeInteger(2447), makeInteger(2448)), list(makeInteger(2451), makeInteger(2472)), list(makeInteger(2474), makeInteger(2480)), list(makeInteger(2482), makeInteger(2482)), list(makeInteger(2486), makeInteger(2489)), list(makeInteger(2524), makeInteger(2525)), list(makeInteger(2527), makeInteger(2529)), list(makeInteger(2544), makeInteger(2545)), list(makeInteger(2565), makeInteger(2570)), list(makeInteger(2575), makeInteger(2576)), list(makeInteger(2579), makeInteger(2600)), list(makeInteger(2602), makeInteger(2608)), list(makeInteger(2610), makeInteger(2611)), list(makeInteger(2613), makeInteger(2614)), list(makeInteger(2616), makeInteger(2617)), list(makeInteger(2649), makeInteger(2652)), list(makeInteger(2654), makeInteger(2654)), list(makeInteger(2674), makeInteger(2676)), list(makeInteger(2693), makeInteger(2699)), list(makeInteger(2701), makeInteger(2701)), list(makeInteger(2703), makeInteger(2705)), list(makeInteger(2707), makeInteger(2728)), list(makeInteger(2730), makeInteger(2736)), list(makeInteger(2738), makeInteger(2739)), list(makeInteger(2741), makeInteger(2745)), list(makeInteger(2749), makeInteger(2749)), list(makeInteger(2784), makeInteger(2784)), list(makeInteger(2821), makeInteger(2828)), list(makeInteger(2831), makeInteger(2832)), list(makeInteger(2835), makeInteger(2856)), list(makeInteger(2858), makeInteger(2864)), list(makeInteger(2866), makeInteger(2867)), list(makeInteger(2870), makeInteger(2873)), list(makeInteger(2877), makeInteger(2877)), list(makeInteger(2908), makeInteger(2909)), list(makeInteger(2911), makeInteger(2913)), list(makeInteger(2949), makeInteger(2954)), list(makeInteger(2958), makeInteger(2960)), list(makeInteger(2962), makeInteger(2965)), list(makeInteger(2969), makeInteger(2970)), list(makeInteger(2972), makeInteger(2972)), list(makeInteger(2974), makeInteger(2975)), list(makeInteger(2979), makeInteger(2980)), list(makeInteger(2984), makeInteger(2986)), list(makeInteger(2990), makeInteger(2997)), list(makeInteger(2999), makeInteger(3001)), list(makeInteger(3077), makeInteger(3084)), list(makeInteger(3086), makeInteger(3088)), list(makeInteger(3090), makeInteger(3112)), list(makeInteger(3114), makeInteger(3123)), list(makeInteger(3125), makeInteger(3129)), list(makeInteger(3168), makeInteger(3169)), list(makeInteger(3205), makeInteger(3212)), list(makeInteger(3214), makeInteger(3216)), list(makeInteger(3218), makeInteger(3240)), list(makeInteger(3242), makeInteger(3251)), list(makeInteger(3253), makeInteger(3257)), list(makeInteger(3294), makeInteger(3294)), list(makeInteger(3296), makeInteger(3297)), list(makeInteger(3333), makeInteger(3340)), list(makeInteger(3342), makeInteger(3344)), list(makeInteger(3346), makeInteger(3368)), list(makeInteger(3370), makeInteger(3385)), list(makeInteger(3424), makeInteger(3425)), list(makeInteger(3585), makeInteger(3630)), list(makeInteger(3632), makeInteger(3632)), list(makeInteger(3634), makeInteger(3635)), list(makeInteger(3648), makeInteger(3653)), list(makeInteger(3713), makeInteger(3714)), list(makeInteger(3716), makeInteger(3716)), list(makeInteger(3719), makeInteger(3720)), list(makeInteger(3722), makeInteger(3722)), list(makeInteger(3725), makeInteger(3725)), list(makeInteger(3732), makeInteger(3735)), list(makeInteger(3737), makeInteger(3743)), list(makeInteger(3745), makeInteger(3747)), list(makeInteger(3749), makeInteger(3749)), list(makeInteger(3751), makeInteger(3751)), list(makeInteger(3754), makeInteger(3755)), list(makeInteger(3757), makeInteger(3758)), list(makeInteger(3760), makeInteger(3760)), list(makeInteger(3762), makeInteger(3763)), list(makeInteger(3773), makeInteger(3773)), list(makeInteger(3776), makeInteger(3780)), list(makeInteger(3904), makeInteger(3911)), list(makeInteger(3913), makeInteger(3945)), list(makeInteger(4256), makeInteger(4293)), list(makeInteger(4304), makeInteger(4342)), list(makeInteger(4352), makeInteger(4352)), list(makeInteger(4354), makeInteger(4355)), list(makeInteger(4357), makeInteger(4359)), list(makeInteger(4361), makeInteger(4361)), list(makeInteger(4363), makeInteger(4364)), list(makeInteger(4366), makeInteger(4370)), list(makeInteger(4412), makeInteger(4412)), list(makeInteger(4414), makeInteger(4414)), list(makeInteger(4416), makeInteger(4416)), list(makeInteger(4428), makeInteger(4428)), list(makeInteger(4430), makeInteger(4430)), list(makeInteger(4432), makeInteger(4432)), list(makeInteger(4436), makeInteger(4437)), list(makeInteger(4441), makeInteger(4441)), list(makeInteger(4447), makeInteger(4449)), list(makeInteger(4451), makeInteger(4451)), list(makeInteger(4453), makeInteger(4453)), list(makeInteger(4455), makeInteger(4455)), list(makeInteger(4457), makeInteger(4457)), list(makeInteger(4461), makeInteger(4462)), list(makeInteger(4466), makeInteger(4467)), list(makeInteger(4469), makeInteger(4469)), list(makeInteger(4510), makeInteger(4510)), list(makeInteger(4520), makeInteger(4520)), list(makeInteger(4523), makeInteger(4523)), list(makeInteger(4526), makeInteger(4527)), list(makeInteger(4535), makeInteger(4536)), list(makeInteger(4538), makeInteger(4538)), list(makeInteger(4540), makeInteger(4546)), list(makeInteger(4587), makeInteger(4587)), list(makeInteger(4592), makeInteger(4592)), list(makeInteger(4601), makeInteger(4601)), list(makeInteger(7680), makeInteger(7835)), list(makeInteger(7840), makeInteger(7929)), list(makeInteger(7936), makeInteger(7957)), list(makeInteger(7960), makeInteger(7965)), list(makeInteger(7968), makeInteger(8005)), list(makeInteger(8008), makeInteger(8013)), list(makeInteger(8016), makeInteger(8023)), list(makeInteger(8025), makeInteger(8025)), list(makeInteger(8027), makeInteger(8027)), list(makeInteger(8029), makeInteger(8029)), list(makeInteger(8031), makeInteger(8061)), list(makeInteger(8064), makeInteger(8116)), list(makeInteger(8118), makeInteger(8124)), list(makeInteger(8126), makeInteger(8126)), list(makeInteger(8130), makeInteger(8132)), list(makeInteger(8134), makeInteger(8140)), list(makeInteger(8144), makeInteger(8147)), list(makeInteger(8150), makeInteger(8155)), list(makeInteger(8160), makeInteger(8172)), list(makeInteger(8178), makeInteger(8180)), list(makeInteger(8182), makeInteger(8188)), list(makeInteger(8486), makeInteger(8486)), list(makeInteger(8490), makeInteger(8491)), list(makeInteger(8494), makeInteger(8494)), list(makeInteger(8576), makeInteger(8578)), list(makeInteger(12353), makeInteger(12436)), list(makeInteger(12449), makeInteger(12538)), list(makeInteger(12549), makeInteger(12588)), list(makeInteger(44032), makeInteger(55203)) });
    }

    static private final SubLList $list_alt77 = cons(makeSymbol("GROUPING-KEY-TUPLES"), makeSymbol("OTHER-BINDINGS"));

    static private final SubLString $str_alt78$__A = makeString("<~A");

    static private final SubLString $str_alt79$__ = makeString("#$");

    static private final SubLString $str_alt80$__A__A = makeString(" ~A=~A");

    static private final SubLString $str_alt81$___ = makeString(">~%");

    static private final SubLString $str_alt82$_A__ = makeString("~A~%");

    static private final SubLString $str_alt83$___A___ = makeString("</~A>~%");

    static private final SubLString $str_alt84$____ = makeString("/>~%");

    static private final SubLString $str_alt87$__name__binding___elements__ = makeString("(:name \"binding\" :elements (");

    static private final SubLString $str_alt88$__name__ = makeString("(:name \"");

    static private final SubLString $str_alt89$___text_ = makeString("\" :text ");

    static private final SubLString $str_alt90$__ = makeString(") ");

    static private final SubLString $str_alt91$__ = makeString("))");

    static private final SubLString $str_alt97$Unable_to_open__S = makeString("Unable to open ~S");

    @Override
    public void declareFunctions() {
        declare_xml_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_xml_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_xml_utilities_file();
    }

    static {
    }
}

/**
 * Total time: 398 ms
 */
