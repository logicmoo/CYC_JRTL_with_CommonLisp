/**
 *
 */
/**
 * //
 */
/**
 *
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.collection_defns.cyc_real_0_1;
import static com.cyc.cycjava.cycl.collection_defns.cyc_real_0_100;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.extended_numbers.extended_number_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.subl_promotions.negative_integer_p;
import static com.cyc.cycjava.cycl.subl_promotions.non_negative_integer_p;
import static com.cyc.cycjava.cycl.subl_promotions.non_positive_integer_p;
import static com.cyc.cycjava.cycl.subl_promotions.positive_integer_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_A;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_B;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_C;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_D;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_E;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_F;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_a;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_b;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_c;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_d;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_e;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_f;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$exp1$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_negative_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.exp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integer_decode_float;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.invert;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.isqrt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.scale_float;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.sqrt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.sublisp_float;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NUMBER-UTILITIES
 * source file: /cyc/top/cycl/number-utilities.lisp
 * created:     2019/07/03 17:37:12
 */
public final class number_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_lcm_gcd_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_lcm_gcd_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_extended_numbers_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_extended_numbers_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject lcm_gcd_test_case_p(SubLObject lcm_gcd_test_case) {
        return classes.subloop_instanceof_class(lcm_gcd_test_case, LCM_GCD_TEST_CASE);
    }

    // Definitions
    public static final SubLObject fib(SubLObject n) {
        return n.numL(TWO_INTEGER) ? ((SubLObject) (ONE_INTEGER)) : add(com.cyc.cycjava.cycl.number_utilities.fib(subtract(n, ONE_INTEGER)), com.cyc.cycjava.cycl.number_utilities.fib(subtract(n, TWO_INTEGER)));
    }

    public static final SubLObject extended_numbers_test_case_p(SubLObject extended_numbers_test_case) {
        return classes.subloop_instanceof_class(extended_numbers_test_case, EXTENDED_NUMBERS_TEST_CASE);
    }

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_126_initializer() {
        return list(list(list(list(ONE_INTEGER, FOUR_INTEGER, SEVEN_INTEGER, TEN_INTEGER), TWELVE_INTEGER), makeKeyword("SUCCESS")), list(list(list(new SubLObject[]{ ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), makeInteger(365), makeInteger(366), makeInteger(367), makeInteger(368), makeInteger(369), makeInteger(374), makeInteger(375), makeInteger(378), makeInteger(429), makeInteger(430), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), makeInteger(538), makeInteger(539), makeInteger(555), makeInteger(614), makeInteger(623), makeInteger(624), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), makeInteger(1146), makeInteger(1147), makeInteger(1150), makeInteger(1251), makeInteger(1252), makeInteger(1471), makeInteger(1475), makeInteger(1485) }), makeInteger(1460)), makeKeyword("SUCCESS")), list(list(list(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), makeInteger(32), makeInteger(33), makeInteger(34), makeInteger(35), makeInteger(36), makeInteger(37), makeInteger(38), makeInteger(39), makeInteger(40), makeInteger(41), makeInteger(42), makeInteger(43), makeInteger(44), makeInteger(45), makeInteger(46), makeInteger(47), makeInteger(48), makeInteger(49), makeInteger(50), makeInteger(51), makeInteger(52), makeInteger(53), makeInteger(54), makeInteger(55), makeInteger(56), makeInteger(57), makeInteger(58), makeInteger(59), makeInteger(60), makeInteger(61), makeInteger(62), makeInteger(63), makeInteger(64), makeInteger(65), makeInteger(66), makeInteger(67), makeInteger(68), makeInteger(69), makeInteger(70), makeInteger(71), makeInteger(72), makeInteger(73), makeInteger(80), makeInteger(82), makeInteger(83), makeInteger(301), makeInteger(302), makeInteger(309), makeInteger(316), makeInteger(317), makeInteger(351), makeInteger(352), makeInteger(353), makeInteger(884), makeInteger(885), makeInteger(886), makeInteger(887), makeInteger(888), makeInteger(889), makeInteger(890), makeInteger(891), makeInteger(892), makeInteger(893), makeInteger(894), makeInteger(895), makeInteger(896), makeInteger(897), makeInteger(898), makeInteger(899), makeInteger(900), makeInteger(901), makeInteger(902), makeInteger(903), makeInteger(904), makeInteger(905), makeInteger(906), makeInteger(907), makeInteger(908), makeInteger(909), makeInteger(910), makeInteger(911), makeInteger(912), makeInteger(913), makeInteger(914), makeInteger(915), makeInteger(916), makeInteger(917), makeInteger(918), makeInteger(919), makeInteger(920), makeInteger(921), makeInteger(922), makeInteger(923), makeInteger(924), makeInteger(925), makeInteger(926), makeInteger(927), makeInteger(928), makeInteger(929), makeInteger(930), makeInteger(931), makeInteger(932), makeInteger(933), makeInteger(934), makeInteger(935), makeInteger(936), makeInteger(937), makeInteger(938), makeInteger(939), makeInteger(940), makeInteger(941), makeInteger(942), makeInteger(943), makeInteger(944), makeInteger(945), makeInteger(946), makeInteger(947), makeInteger(948), makeInteger(949), makeInteger(950), makeInteger(951), makeInteger(952), makeInteger(953), makeInteger(954), makeInteger(955), makeInteger(956), makeInteger(957), makeInteger(958), makeInteger(959), makeInteger(960), makeInteger(961), makeInteger(962), makeInteger(963), makeInteger(964), makeInteger(965), makeInteger(966), makeInteger(967), makeInteger(968), makeInteger(969), makeInteger(970), makeInteger(971), makeInteger(972), makeInteger(973), makeInteger(974), makeInteger(984), makeInteger(985), makeInteger(986), makeInteger(1324), makeInteger(1325), makeInteger(1326), makeInteger(1327), makeInteger(1619), makeInteger(1629), makeInteger(1630), makeInteger(1631), makeInteger(1632), makeInteger(1641), makeInteger(1642), makeInteger(1643), makeInteger(1645), makeInteger(1646), makeInteger(1647), makeInteger(1649), makeInteger(1650), makeInteger(1651), makeInteger(1653), makeInteger(1655), makeInteger(1656), makeInteger(1657), makeInteger(1658), makeInteger(1723), makeInteger(1729), makeInteger(1733), makeInteger(1740), makeInteger(1741), makeInteger(1742), makeInteger(1743), makeInteger(1745), makeInteger(1756), makeInteger(1757), makeInteger(1758), makeInteger(1759), makeInteger(1760), makeInteger(1810), makeInteger(1834), makeInteger(1835), makeInteger(1868), makeInteger(2084), makeInteger(2145), makeInteger(2146), makeInteger(2170), makeInteger(2185), makeInteger(2186), makeInteger(2187), makeInteger(2194), makeInteger(2198), makeInteger(2201), makeInteger(2202), makeInteger(2203), makeInteger(2204), makeInteger(2205), makeInteger(2207), makeInteger(2211), makeInteger(2215), makeInteger(2216), makeInteger(2218), makeInteger(2223), makeInteger(2226), makeInteger(2227), makeInteger(2228), makeInteger(2256), makeInteger(2263), makeInteger(2269), makeInteger(2270), makeInteger(2271), makeInteger(2273), makeInteger(2277), makeInteger(2278), makeInteger(2283), makeInteger(2287), makeInteger(2289), makeInteger(2291), makeInteger(2292), makeInteger(2293), makeInteger(2295), makeInteger(2296), makeInteger(2297), makeInteger(2299), makeInteger(2316), makeInteger(2319), makeInteger(2321), makeInteger(2323), makeInteger(2324), makeInteger(2325), makeInteger(2330), makeInteger(2332), makeInteger(2337), makeInteger(2351), makeInteger(2364), makeInteger(2365), makeInteger(2367), makeInteger(2368), makeInteger(2372), makeInteger(2375), makeInteger(2378), makeInteger(2385), makeInteger(2386), makeInteger(2390), makeInteger(2391), makeInteger(2395), makeInteger(2402), makeInteger(2409), makeInteger(2410), makeInteger(2415), makeInteger(2418), makeInteger(2422), makeInteger(2429), makeInteger(2435), makeInteger(2437), makeInteger(2439), makeInteger(2445), makeInteger(2446), makeInteger(2450), makeInteger(2452), makeInteger(2453), makeInteger(2454), makeInteger(2455), makeInteger(2457), makeInteger(2458), makeInteger(2462), makeInteger(2463), makeInteger(2470), makeInteger(2471), makeInteger(2474), makeInteger(2475), makeInteger(2477), makeInteger(2479), makeInteger(2484), makeInteger(2487), makeInteger(2488), makeInteger(2491), makeInteger(2494), makeInteger(2497), makeInteger(2500), makeInteger(2502), makeInteger(2505), makeInteger(2506), makeInteger(2507), makeInteger(2509), makeInteger(2512), makeInteger(2513), makeInteger(2515), makeInteger(2516), makeInteger(2517), makeInteger(2518), makeInteger(2531), makeInteger(2532), makeInteger(2548), makeInteger(2549), makeInteger(2556), makeInteger(2559), makeInteger(3315), makeInteger(3317), makeInteger(3318), makeInteger(3319), makeInteger(3339), makeInteger(3342), makeInteger(3344), makeInteger(3372), makeInteger(3373), makeInteger(3374), makeInteger(3375), makeInteger(3376), makeInteger(3377), makeInteger(3378), makeInteger(3379), makeInteger(3380), makeInteger(3381), makeInteger(3382), makeInteger(3383), makeInteger(3384), makeInteger(3385), makeInteger(3386), makeInteger(3387), makeInteger(3388), makeInteger(3389), makeInteger(3390), makeInteger(3391), makeInteger(3392), makeInteger(3393), makeInteger(3394), makeInteger(3395), makeInteger(3396), makeInteger(3397), makeInteger(3398), makeInteger(3399), makeInteger(3400), makeInteger(3401), makeInteger(3402), makeInteger(3403), makeInteger(3404), makeInteger(3405), makeInteger(3406), makeInteger(3407), makeInteger(3408), makeInteger(3409), makeInteger(3410), makeInteger(3411), makeInteger(3412), makeInteger(3413), makeInteger(3414), makeInteger(3415), makeInteger(3416), makeInteger(3417), makeInteger(3418), makeInteger(3419), makeInteger(3420), makeInteger(3421), makeInteger(3422), makeInteger(3423), makeInteger(3424), makeInteger(3425), makeInteger(3426), makeInteger(3427), makeInteger(3428), makeInteger(3429), makeInteger(3430), makeInteger(3431), makeInteger(3432), makeInteger(3433), makeInteger(3434), makeInteger(3435), makeInteger(3437), makeInteger(3438), makeInteger(3439), makeInteger(3440), makeInteger(3441), makeInteger(3442), makeInteger(3443), makeInteger(3444), makeInteger(3445), makeInteger(3446), makeInteger(3447), makeInteger(3448), makeInteger(3449), makeInteger(3450), makeInteger(3451), makeInteger(3452), makeInteger(3461), makeInteger(3463), makeInteger(3464), makeInteger(3465), makeInteger(3466), makeInteger(3467), makeInteger(3476), makeInteger(3477), makeInteger(3482), makeInteger(3485), makeInteger(3486), makeInteger(3490), makeInteger(3491), makeInteger(3493), makeInteger(3496), makeInteger(3506), makeInteger(3507), makeInteger(3514), makeInteger(3598), makeInteger(3600), makeInteger(3607), makeInteger(3608), makeInteger(3609), makeInteger(3610), makeInteger(3611), makeInteger(3612), makeInteger(3613), makeInteger(3614), makeInteger(3615), makeInteger(3616), makeInteger(3617), makeInteger(3618), makeInteger(3632), makeInteger(3637), makeInteger(3638), makeInteger(3639), makeInteger(3640), makeInteger(3641), makeInteger(3642), makeInteger(3647), makeInteger(3648), makeInteger(3652), makeInteger(3653), makeInteger(3654), makeInteger(3657), makeInteger(3658), makeInteger(3727), makeInteger(3739), makeInteger(3750), makeInteger(3753), makeInteger(3756), makeInteger(3764), makeInteger(3769), makeInteger(3770), makeInteger(3793), makeInteger(3796), makeInteger(3810), makeInteger(3827), makeInteger(3829), makeInteger(3830), makeInteger(3833), makeInteger(3834), makeInteger(3835), makeInteger(3859), makeInteger(3860), makeInteger(3877), makeInteger(3878), makeInteger(3879), makeInteger(3880), makeInteger(3881), makeInteger(3882), makeInteger(3885), makeInteger(3886), makeInteger(4013), makeInteger(4038), makeInteger(4039), makeInteger(4040), makeInteger(4100), makeInteger(4149), makeInteger(4150) }), makeInteger(4160)), makeKeyword("SUCCESS")));
    }

    public static final SubLFile me = new number_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.number_utilities";


    // deflexical
    // A large positive integer guaranteed to be stored immediately
    /**
     * A large positive integer guaranteed to be stored immediately
     */
    @LispMethod(comment = "A large positive integer guaranteed to be stored immediately\ndeflexical")
    public static final SubLSymbol $large_immediate_positive_integer$ = makeSymbol("*LARGE-IMMEDIATE-POSITIVE-INTEGER*");

    // defconstant
    // exp1, what a silly name for e.
    /**
     * exp1, what a silly name for e.
     */
    @LispMethod(comment = "exp1, what a silly name for e.\ndefconstant")
    public static final SubLSymbol $e$ = makeSymbol("*E*");

    // deflexical
    /**
     * The maximum possible number of significant digits for a floating-point
     * number.
     */
    @LispMethod(comment = "The maximum possible number of significant digits for a floating-point\r\nnumber.\ndeflexical\nThe maximum possible number of significant digits for a floating-point\nnumber.")
    private static final SubLSymbol $maximum_float_significant_digits$ = makeSymbol("*MAXIMUM-FLOAT-SIGNIFICANT-DIGITS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $valid_number_string_characters$ = makeSymbol("*VALID-NUMBER-STRING-CHARACTERS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $valid_exponent_markers$ = makeSymbol("*VALID-EXPONENT-MARKERS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $valid_sign$ = makeSymbol("*VALID-SIGN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $largest_prime_by_binary_width$ = makeSymbol("*LARGEST-PRIME-BY-BINARY-WIDTH*");

    // defconstant
    // How many bits the high and the low part represent.
    /**
     * How many bits the high and the low part represent.
     */
    @LispMethod(comment = "How many bits the high and the low part represent.\ndefconstant")
    private static final SubLSymbol $checksum_implementation_width$ = makeSymbol("*CHECKSUM-IMPLEMENTATION-WIDTH*");

    // defconstant
    // Largest prime smaller then 2^implementation-width.
    /**
     * Largest prime smaller then 2^implementation-width.
     */
    @LispMethod(comment = "Largest prime smaller then 2^implementation-width.\ndefconstant")
    private static final SubLSymbol $checksum_base$ = makeSymbol("*CHECKSUM-BASE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $checksum_initial_value_sum$ = makeSymbol("*CHECKSUM-INITIAL-VALUE-SUM*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $checksum_initial_value_length$ = makeSymbol("*CHECKSUM-INITIAL-VALUE-LENGTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $hex_to_dec_table$ = makeSymbol("*HEX-TO-DEC-TABLE*");

    private static final SubLList $list0 = list(makeSymbol("INLINE"), makeSymbol("ENCODE-BOOLEAN"), makeSymbol("DECODE-BOOLEAN"));

    private static final SubLList $list1 = list(makeSymbol("INLINE"), makeSymbol("GET-BIT"), makeSymbol("SET-BIT"), makeSymbol("CLEAR-BIT"));



    private static final SubLSymbol NIL_OR_INTEGER_P = makeSymbol("NIL-OR-INTEGER-P");

    static private final SubLList $list6 = list(makeSymbol("OBJECT"));

    private static final SubLString $str7$Return_T_iff_OBJECT_is_either_an_ = makeString("Return T iff OBJECT is either an integer or NIL");

    private static final SubLList $list8 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol EXTENDED_POTENTIALLY_INFINITE_NUMBER_P = makeSymbol("EXTENDED-POTENTIALLY-INFINITE-NUMBER-P");

    private static final SubLList $list14 = list(ZERO_INTEGER, MINUS_ONE_INTEGER, ONE_INTEGER, makeInteger(-2), TWO_INTEGER);

    private static final SubLString $$$NEW_must_be_larger_than_OLD = makeString("NEW must be larger than OLD");

    private static final SubLString $$$NEW_must_be_smaller_than_OLD = makeString("NEW must be smaller than OLD");

    private static final SubLSymbol POTENTIALLY_INFINITE_NUMBER_P = makeSymbol("POTENTIALLY-INFINITE-NUMBER-P");

    private static final SubLString $str21$Can_t_divide_zero_by_zero = makeString("Can't divide zero by zero");

    private static final SubLSymbol NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P = makeSymbol("NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P");

    private static final SubLString $str23$Can_t_add_positive_infinity_and_n = makeString("Can't add positive infinity and negative infinity");

    private static final SubLString $str24$Can_t_subtract_negative_infinity_ = makeString("Can't subtract negative infinity from itself");

    private static final SubLString $str25$Can_t_subtract_positive_infinity_ = makeString("Can't subtract positive infinity from itself");

    private static final SubLString $str26$Can_t_multiply_infinity_and_zero = makeString("Can't multiply infinity and zero");

    private static final SubLString $str27$Can_t_divide_negative_infinity_by = makeString("Can't divide negative infinity by itself");

    private static final SubLString $str28$Can_t_divide_negative_infinity_by = makeString("Can't divide negative infinity by positive infinity");

    private static final SubLString $str29$Can_t_divide_positive_infinity_by = makeString("Can't divide positive infinity by negative infinity");

    private static final SubLString $str30$Can_t_divide_positive_infinity_by = makeString("Can't divide positive infinity by itself");

    private static final SubLSymbol POTENTIALLY_INFINITE_INTEGER_P = makeSymbol("POTENTIALLY-INFINITE-INTEGER-P");

    private static final SubLSymbol POTENTIALLY_UNDEFINED_NUMBER_P = makeSymbol("POTENTIALLY-UNDEFINED-NUMBER-P");

    private static final SubLString $str34$Cannot_compute_the_maximum_of_an_ = makeString("Cannot compute the maximum of an atom or empty list");

    static private final SubLSymbol $sym35$_ = makeSymbol(">");

    private static final SubLString $str36$Cannot_compute_the_minimum_of_an_ = makeString("Cannot compute the minimum of an atom or empty list");

    private static final SubLSymbol $sym37$_ = makeSymbol("<");

    private static final SubLString $str38$Cannot_compute_the_mean_of_an_ato = makeString("Cannot compute the mean of an atom or empty list");

    private static final SubLString $str39$Cannot_compute_the_geometric_mean = makeString("Cannot compute the geometric mean of an atom or empty list");

    private static final SubLString $str41$Cannot_compute_the_median_of_an_a = makeString("Cannot compute the median of an atom or empty list");

    private static final SubLString $str43$Can_t_return_middle_item_from_an_ = makeString("Can't return middle item from an even-length list.");

    private static final SubLString $str44$Unrecognized_RETURN_type__S = makeString("Unrecognized RETURN type ~S");

    private static final SubLSymbol PERCENTILE_P = makeSymbol("PERCENTILE-P");

    private static final SubLString $str46$Cannot_compute_the_percentile_of_ = makeString("Cannot compute the percentile of an atom or empty list");

    private static final SubLString $str47$Cannot_compute_frequencies_of_an_ = makeString("Cannot compute frequencies of an atom or empty list");

    private static final SubLString $str49$Cannot_compute_the_mode_of_an_ato = makeString("Cannot compute the mode of an atom or empty list");

    private static final SubLString $str50$Cannot_compute_the_variance_of_an = makeString("Cannot compute the variance of an atom or empty list");

    private static final SubLString $str51$Cannot_compute_the_standard_devia = makeString("Cannot compute the standard deviation of an atom or empty list");

    private static final SubLString $str52$Standard_deviation_must_not_be_ze = makeString("Standard deviation must not be zero.");

    private static final SubLSymbol $sym53$__ = makeSymbol(">=");

    private static final SubLString $str55$__Standard_Statistical_Analysis = makeString("~%Standard Statistical Analysis");

    private static final SubLString $str56$_______________________________ = makeString("~%=============================");

    private static final SubLString $str57$__Count______6D = makeString("~%Count   : ~6D");

    private static final SubLString $str58$__Min________6D = makeString("~%Min     : ~6D");

    private static final SubLString $str59$__Median_____6D = makeString("~%Median  : ~6D");

    private static final SubLString $str60$__Mean_______6D = makeString("~%Mean    : ~6D");

    private static final SubLString $str61$__Max________6D = makeString("~%Max     : ~6D");

    private static final SubLString $str62$__Std_Dev____6D = makeString("~%Std Dev : ~6D");

    private static final SubLString $str63$X_Values_and_Y_Values_must_be_of_ = makeString("X-Values and Y-Values must be of the same length ~A.");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLString $str66$length_must_be_at_least_2_ = makeString("length must be at least 2.");

    private static final SubLString $str67$Cannot_start_at_1_ = makeString("Cannot start at 1.");

    private static final SubLString $str68$Cannot_end_at_1_ = makeString("Cannot end at 1.");

    private static final SubLString $str69$Cannot_start_at_or_below_0_ = makeString("Cannot start at or below 0.");

    private static final SubLString $str70$Cannot_end_at_or_below_0_ = makeString("Cannot end at or below 0.");

    private static final SubLString $str71$Length_must_be_at_least_1_ = makeString("Length must be at least 1.");

    private static final SubLString $str72$Length_must_be_at_least_2_ = makeString("Length must be at least 2.");

    private static final SubLString $str75$This_integer_is_too_large_to_be_c = makeString("This integer is too large to be converted to a double-float");

    private static final SubLString $str76$_A = makeString("~A");

    private static final SubLSymbol VALID_NUMBER_STRING_CHAR = makeSymbol("VALID-NUMBER-STRING-CHAR");

    private static final SubLString $str79$0123456789___deDE = makeString("0123456789.-+deDE");

    private static final SubLSymbol VALID_EXPONENT_MARKER = makeSymbol("VALID-EXPONENT-MARKER");

    private static final SubLString $$$deDE = makeString("deDE");

    private static final SubLString $str82$__ = makeString("+-");

    private static final SubLList $list83 = list(new SubLObject[]{ cons(TWO_INTEGER, THREE_INTEGER), cons(THREE_INTEGER, SEVEN_INTEGER), cons(FOUR_INTEGER, THIRTEEN_INTEGER), cons(FIVE_INTEGER, makeInteger(31)), cons(SIX_INTEGER, makeInteger(61)), cons(SEVEN_INTEGER, makeInteger(127)), cons(EIGHT_INTEGER, makeInteger(251)), cons(NINE_INTEGER, makeInteger(509)), cons(TEN_INTEGER, makeInteger(1021)), cons(ELEVEN_INTEGER, makeInteger(2039)), cons(TWELVE_INTEGER, makeInteger(4093)), cons(THIRTEEN_INTEGER, makeInteger(8191)), cons(FOURTEEN_INTEGER, makeInteger(16381)), cons(FIFTEEN_INTEGER, makeInteger(32749)), cons(SIXTEEN_INTEGER, makeInteger(65521)), cons(SEVENTEEN_INTEGER, makeInteger(131071)), cons(EIGHTEEN_INTEGER, makeInteger(262139)), cons(NINETEEN_INTEGER, makeInteger(524287)), cons(TWENTY_INTEGER, makeInteger(1048573)), cons(makeInteger(21), makeInteger(2097143)), cons(makeInteger(22), makeInteger(4194301)), cons(makeInteger(23), makeInteger(8388593)), cons(makeInteger(24), makeInteger(16777213)), cons(makeInteger(25), makeInteger(33554393)), cons(makeInteger(26), makeInteger(67108859)), cons(makeInteger(27), makeInteger(134217689)), cons(makeInteger(28), makeInteger(268435399)), cons(makeInteger(29), makeInteger(536870909)), cons(makeInteger(30), makeInteger(1073741789)), cons(makeInteger(31), makeInteger(Integer.MAX_VALUE)), cons(makeInteger(32), makeInteger("4294967291")), cons(makeInteger(33), makeInteger("8589934583")), cons(makeInteger(34), makeInteger("17179869143")), cons(makeInteger(35), makeInteger("34359738337")), cons(makeInteger(36), makeInteger("68719476731")), cons(makeInteger(37), makeInteger("137438953447")), cons(makeInteger(38), makeInteger("274877906899")), cons(makeInteger(39), makeInteger("549755813881")), cons(makeInteger(40), makeInteger("1099511627689")), cons(makeInteger(41), makeInteger("2199023255531")), cons(makeInteger(42), makeInteger("4398046511093")), cons(makeInteger(43), makeInteger("8796093022151")), cons(makeInteger(44), makeInteger("17592186044399")), cons(makeInteger(45), makeInteger("35184372088777")), cons(makeInteger(46), makeInteger("70368744177643")), cons(makeInteger(47), makeInteger("140737488355213")), cons(makeInteger(48), makeInteger("281474976710597")), cons(makeInteger(49), makeInteger("562949953421231")), cons(makeInteger(50), makeInteger("1125899906842597")), cons(makeInteger(51), makeInteger("2251799813685119")), cons(makeInteger(52), makeInteger("4503599627370449")), cons(makeInteger(53), makeInteger("9007199254740881")), cons(makeInteger(54), makeInteger("18014398509481951")), cons(makeInteger(55), makeInteger("36028797018963913")), cons(makeInteger(56), makeInteger("72057594037927931")), cons(makeInteger(57), makeInteger("144115188075855859")), cons(makeInteger(58), makeInteger("288230376151711717")), cons(makeInteger(59), makeInteger("576460752303423433")), cons(makeInteger(60), makeInteger("1152921504606846883")), cons(makeInteger(61), makeInteger("2305843009213693951")), cons(makeInteger(62), makeInteger("4611686018427387847")), cons(makeInteger(63), makeInteger("9223372036854775783")), cons(makeInteger(64), makeInteger("18446744073709551557")) });

    private static final SubLSymbol CHECKSUM_SANITY_CHECK = makeSymbol("CHECKSUM-SANITY-CHECK");

    static private final SubLList $list91 = list(list(NIL, T));

    private static final SubLSymbol CHECKSUM_SETUP = makeSymbol("CHECKSUM-SETUP");

    private static final SubLList $list93 = list(makeSymbol("CHECKSUM-START"), makeSymbol("CHECKSUM-RESUME"), makeSymbol("WITH-CHECKSUM"));

    private static final SubLList $list94 = list(list(makeSymbol("SUM-INIT"), makeSymbol("LENGTH-INIT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $checksum_sum$ = makeSymbol("*CHECKSUM-SUM*");

    public static final SubLSymbol $checksum_length$ = makeSymbol("*CHECKSUM-LENGTH*");

    static private final SubLList $list98 = list(makeSymbol("*CHECKSUM-INITIAL-VALUE-SUM*"), makeSymbol("*CHECKSUM-INITIAL-VALUE-LENGTH*"));

    static private final SubLList $list99 = list(list(makeSymbol("ACCUMULATORS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list101 = list(list(makeSymbol("CHECKSUM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CHECKSUM_START = makeSymbol("CHECKSUM-START");

    private static final SubLList $list104 = list(list(makeSymbol("CHECKSUM-FINALIZE")));

    private static final SubLString $str106$_X = makeString("~X");

    private static final SubLString $str107$_A_is_not_a_positive_integer_grea = makeString("~A is not a positive integer greater than 1.");

    private static final SubLSymbol FIND_SMALLEST_DIVISOR = makeSymbol("FIND-SMALLEST-DIVISOR");

    private static final SubLList $list109 = list(new SubLObject[]{ list(list(TWO_INTEGER), TWO_INTEGER), list(list(THREE_INTEGER), THREE_INTEGER), list(list(FOUR_INTEGER), TWO_INTEGER), list(list(FIVE_INTEGER), FIVE_INTEGER), list(list(SIX_INTEGER), TWO_INTEGER), list(list(SEVEN_INTEGER), SEVEN_INTEGER), list(list(EIGHT_INTEGER), TWO_INTEGER), list(list(NINE_INTEGER), THREE_INTEGER), list(list(TEN_INTEGER), TWO_INTEGER), list(list(ELEVEN_INTEGER), ELEVEN_INTEGER), list(list(TWELVE_INTEGER), TWO_INTEGER), list(list(THIRTEEN_INTEGER), THIRTEEN_INTEGER), list(list(FOURTEEN_INTEGER), TWO_INTEGER), list(list(FIFTEEN_INTEGER), THREE_INTEGER), list(list(SIXTEEN_INTEGER), TWO_INTEGER), list(list(SEVENTEEN_INTEGER), SEVENTEEN_INTEGER), list(list(EIGHTEEN_INTEGER), TWO_INTEGER), list(list(NINETEEN_INTEGER), NINETEEN_INTEGER), list(list(TWENTY_INTEGER), TWO_INTEGER), list(list(makeInteger(21)), THREE_INTEGER), list(list(makeInteger(22)), TWO_INTEGER), list(list(makeInteger(23)), makeInteger(23)), list(list(makeInteger(24)), TWO_INTEGER), list(list(makeInteger(25)), FIVE_INTEGER), list(list(makeInteger(26)), TWO_INTEGER), list(list(makeInteger(27)), THREE_INTEGER), list(list(makeInteger(28)), TWO_INTEGER), list(list(makeInteger(29)), makeInteger(29)), list(list(makeInteger(30)), TWO_INTEGER), list(list(makeInteger(31)), makeInteger(31)), list(list(makeInteger(32)), TWO_INTEGER), list(list(makeInteger(33)), THREE_INTEGER), list(list(makeInteger(34)), TWO_INTEGER), list(list(makeInteger(35)), FIVE_INTEGER), list(list(makeInteger(36)), TWO_INTEGER), list(list(makeInteger(37)), makeInteger(37)), list(list(makeInteger(38)), TWO_INTEGER), list(list(makeInteger(39)), THREE_INTEGER), list(list(makeInteger(40)), TWO_INTEGER), list(list(makeInteger(41)), makeInteger(41)), list(list(makeInteger(42)), TWO_INTEGER), list(list(makeInteger(43)), makeInteger(43)), list(list(makeInteger(44)), TWO_INTEGER), list(list(makeInteger(45)), THREE_INTEGER), list(list(makeInteger(46)), TWO_INTEGER), list(list(makeInteger(47)), makeInteger(47)), list(list(makeInteger(48)), TWO_INTEGER), list(list(makeInteger(49)), SEVEN_INTEGER), list(list(makeInteger(50)), TWO_INTEGER), list(list(makeInteger(1225)), FIVE_INTEGER) });

    private static final SubLSymbol ABS = makeSymbol("ABS");

    private static final SubLSymbol LCM2_INTERNAL = makeSymbol("LCM2-INTERNAL");

    private static final SubLSymbol GCD2_INTERNAL = makeSymbol("GCD2-INTERNAL");

    static private final SubLList $list115 = list(new SubLObject[]{ list(CHAR_a, TEN_INTEGER), list(CHAR_A, TEN_INTEGER), list(CHAR_b, ELEVEN_INTEGER), list(CHAR_B, ELEVEN_INTEGER), list(CHAR_c, TWELVE_INTEGER), list(CHAR_C, TWELVE_INTEGER), list(CHAR_d, THIRTEEN_INTEGER), list(CHAR_D, THIRTEEN_INTEGER), list(CHAR_e, FOURTEEN_INTEGER), list(CHAR_E, FOURTEEN_INTEGER), list(CHAR_f, FIFTEEN_INTEGER), list(CHAR_F, FIFTEEN_INTEGER) });

    private static final SubLList $list116 = list(makeSymbol("PROBABILITY"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym117$PROB = makeUninternedSymbol("PROB");

    private static final SubLList $list119 = list(makeSymbol("PROBABILITY-P"));

    private static final SubLSymbol TRUE_WITH_PROBABILITY = makeSymbol("TRUE-WITH-PROBABILITY");

    private static final SubLSymbol PROBABILITY_P = makeSymbol("PROBABILITY-P");

    private static final SubLFloat $float$1_0e_5 = makeDouble(1.0E-5);

    private static final SubLSymbol PROBABILITY_DISTRIBUTION_P = makeSymbol("PROBABILITY-DISTRIBUTION-P");

    private static final SubLString $str126$Error_sampling_from__s____s__s_ = makeString("Error sampling from ~s: (~s ~s)");

    private static final SubLSymbol FIBONACCI_MEMOIZED = makeSymbol("FIBONACCI-MEMOIZED");

    static private final SubLList $list130 = cons(makeSymbol("FIRST"), makeSymbol("REST"));

    private static final SubLString $str131$_s_must_be_____s = makeString("~s must be <= ~s");

    private static final SubLList $list132 = list(makeSymbol("PREV-X"), makeSymbol("PREV-Y"));

    private static final SubLList $list133 = list(makeSymbol("CURR-X"), makeSymbol("CURR-Y"));



    private static final SubLSymbol AVERAGE_NEIGHBORS = makeSymbol("AVERAGE-NEIGHBORS");

    private static final SubLList $list137 = list(list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER), THREE_INTEGER), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER)), list(list(list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER }), FIVE_INTEGER), list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })));

    private static final SubLSymbol TEST_RENUMBER_ID_USING_TABLE = makeSymbol("TEST-RENUMBER-ID-USING-TABLE");

    public static final SubLObject $list140 = _constant_140_initializer();

    private static final SubLString $str141$Original_id__A_was_supposed_to_ma = makeString("Original id ~A was supposed to map to ~A, but was renumbered to ~A.");

    private static final SubLSymbol TRANSFORM_DELETE_LIST_TO_GAP_LIST = makeSymbol("TRANSFORM-DELETE-LIST-TO-GAP-LIST");

    private static final SubLList $list144 = list(list(list(list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER)), list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER)), list(list(list(new SubLObject[]{ TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER })), list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER, cons(ELEVEN_INTEGER, TWO_INTEGER), cons(FOURTEEN_INTEGER, THREE_INTEGER))), list(list(list(new SubLObject[]{ ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), makeInteger(365), makeInteger(366), makeInteger(367), makeInteger(368), makeInteger(369), makeInteger(374), makeInteger(375), makeInteger(378), makeInteger(429), makeInteger(430), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), makeInteger(538), makeInteger(539), makeInteger(555), makeInteger(614), makeInteger(623), makeInteger(624), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), makeInteger(1146), makeInteger(1147), makeInteger(1150), makeInteger(1251), makeInteger(1252), makeInteger(1471), makeInteger(1475), makeInteger(1485) })), list(new SubLObject[]{ ZERO_INTEGER, cons(TWO_INTEGER, TWO_INTEGER), ELEVEN_INTEGER, cons(THIRTEEN_INTEGER, FOUR_INTEGER), makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), cons(makeInteger(365), FIVE_INTEGER), cons(makeInteger(374), TWO_INTEGER), makeInteger(378), cons(makeInteger(429), TWO_INTEGER), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), cons(makeInteger(538), TWO_INTEGER), makeInteger(555), makeInteger(614), cons(makeInteger(623), TWO_INTEGER), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), cons(makeInteger(1146), TWO_INTEGER), makeInteger(1150), cons(makeInteger(1251), TWO_INTEGER), makeInteger(1471), makeInteger(1475), makeInteger(1485) })));

    static private final SubLList $list145 = cons(makeSymbol("START"), makeSymbol("WIDTH"));

    private static final SubLString $str146$Invalid_gap_list_format__Unclear_ = makeString("Invalid gap list format: Unclear what to do with element ~A.");

    private static final SubLSymbol TRANSFORM_GAP_LIST_TO_DELTA_LIST = makeSymbol("TRANSFORM-GAP-LIST-TO-DELTA-LIST");

    static private final SubLList $list148 = list(list(list(list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER, cons(ELEVEN_INTEGER, TWO_INTEGER))), list(cons(TWO_INTEGER, FOUR_INTEGER), cons(EIGHT_INTEGER, FIVE_INTEGER), cons(ELEVEN_INTEGER, SEVEN_INTEGER))), list(list(list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER, cons(ELEVEN_INTEGER, TWO_INTEGER), cons(FOURTEEN_INTEGER, THREE_INTEGER))), list(cons(TWO_INTEGER, FOUR_INTEGER), cons(EIGHT_INTEGER, FIVE_INTEGER), cons(ELEVEN_INTEGER, SEVEN_INTEGER), cons(FOURTEEN_INTEGER, TEN_INTEGER))), list(list(list(new SubLObject[]{ ZERO_INTEGER, cons(TWO_INTEGER, TWO_INTEGER), ELEVEN_INTEGER, cons(THIRTEEN_INTEGER, FOUR_INTEGER), makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), cons(makeInteger(365), FIVE_INTEGER), cons(makeInteger(374), TWO_INTEGER), makeInteger(378), cons(makeInteger(429), TWO_INTEGER), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), cons(makeInteger(538), TWO_INTEGER), makeInteger(555), makeInteger(614), cons(makeInteger(623), TWO_INTEGER), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), cons(makeInteger(1146), TWO_INTEGER), makeInteger(1150), cons(makeInteger(1251), TWO_INTEGER), makeInteger(1471), makeInteger(1475), makeInteger(1485) })), list(new SubLObject[]{ cons(ZERO_INTEGER, ONE_INTEGER), cons(TWO_INTEGER, THREE_INTEGER), cons(ELEVEN_INTEGER, FOUR_INTEGER), cons(THIRTEEN_INTEGER, EIGHT_INTEGER), cons(makeInteger(27), NINE_INTEGER), cons(makeInteger(57), TEN_INTEGER), cons(makeInteger(59), ELEVEN_INTEGER), cons(makeInteger(64), TWELVE_INTEGER), cons(makeInteger(250), THIRTEEN_INTEGER), cons(makeInteger(361), FOURTEEN_INTEGER), cons(makeInteger(365), NINETEEN_INTEGER), cons(makeInteger(374), makeInteger(21)), cons(makeInteger(378), makeInteger(22)), cons(makeInteger(429), makeInteger(24)), cons(makeInteger(436), makeInteger(25)), cons(makeInteger(442), makeInteger(26)), cons(makeInteger(473), makeInteger(27)), cons(makeInteger(510), makeInteger(28)), cons(makeInteger(538), makeInteger(30)), cons(makeInteger(555), makeInteger(31)), cons(makeInteger(614), makeInteger(32)), cons(makeInteger(623), makeInteger(34)), cons(makeInteger(643), makeInteger(35)), cons(makeInteger(1041), makeInteger(36)), cons(makeInteger(1062), makeInteger(37)), cons(makeInteger(1064), makeInteger(38)), cons(makeInteger(1092), makeInteger(39)), cons(makeInteger(1096), makeInteger(40)), cons(makeInteger(1098), makeInteger(41)), cons(makeInteger(1102), makeInteger(42)), cons(makeInteger(1146), makeInteger(44)), cons(makeInteger(1150), makeInteger(45)), cons(makeInteger(1251), makeInteger(47)), cons(makeInteger(1471), makeInteger(48)), cons(makeInteger(1475), makeInteger(49)), cons(makeInteger(1485), makeInteger(50)) })));

    private static final SubLSymbol TEST_RENUMBER_ID_USING_DELTA_TABLE = makeSymbol("TEST-RENUMBER-ID-USING-DELTA-TABLE");

    private static final SubLString $str150$ID__A_should_have_been_deleted_bu = makeString("ID ~A should have been deleted but was renumbered to ~A.");

    private static final SubLSymbol $sym151$PRIME_NUMBER_ = makeSymbol("PRIME-NUMBER?");

    private static final SubLList $list152 = list(new SubLObject[]{ list(list(makeString("foo")), NIL), list(list(MINUS_ONE_INTEGER), NIL), list(list(ZERO_INTEGER), NIL), list(list(ONE_INTEGER), NIL), list(list(TWO_INTEGER), T), list(list(THREE_INTEGER), T), list(list(FOUR_INTEGER), NIL), list(list(makeInteger(4001)), T), list(list(makeInteger(4003)), T), list(list(makeInteger(4007)), T), list(list(makeInteger(4013)), T), list(list(makeInteger(4019)), T), list(list(makeInteger(4021)), T), list(list(makeInteger(4027)), T), list(list(makeInteger(4049)), T), list(list(makeInteger(4051)), T), list(list(makeInteger(4057)), T), list(list(makeInteger(4073)), T), list(list(makeInteger(4079)), T), list(list(makeInteger(4091)), T), list(list(makeInteger(4093)), T), list(list(makeInteger(4099)), T), list(list(makeInteger(4111)), T), list(list(makeInteger(4127)), T), list(list(makeInteger(4129)), T), list(list(makeInteger(4133)), T), list(list(makeInteger(4139)), T), list(list(makeInteger(4153)), T), list(list(makeInteger(4157)), T), list(list(makeInteger(4159)), T), list(list(makeInteger(4177)), T), list(list(makeInteger(4201)), T), list(list(makeInteger(4211)), T), list(list(makeInteger(4217)), T), list(list(makeInteger(4219)), T), list(list(makeInteger(4229)), T), list(list(makeInteger(4231)), T), list(list(makeInteger(4241)), T), list(list(makeInteger(5861)), T), list(list(makeInteger(5867)), T), list(list(makeInteger(5869)), T), list(list(makeInteger(5879)), T), list(list(makeInteger(5881)), T) });

    private static final SubLList $list153 = list(list(list(makeInteger(175)), FIVE_INTEGER));

    private static final SubLSymbol MEDIAN = makeSymbol("MEDIAN");

    private static final SubLList $list155 = list(list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), TWO_INTEGER), list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER)), makeDouble(2.5)), list(list(list(CHAR_a, CHAR_b, CHAR_c), makeSymbol("CHAR-CODE"), $ITEM), CHAR_b));

    private static final SubLSymbol COMPUTE_DELTAS = makeSymbol("COMPUTE-DELTAS");

    private static final SubLList $list157 = list(list(list(list(TEN_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER)), list(ONE_INTEGER, TWO_INTEGER)), list(list(list(TEN_INTEGER, ELEVEN_INTEGER)), list(ONE_INTEGER)), list(list(list(TEN_INTEGER)), NIL), list(list(list(TEN_INTEGER, EIGHT_INTEGER, ELEVEN_INTEGER)), list(makeInteger(-2), THREE_INTEGER)), list(list(list(TEN_INTEGER, EIGHT_INTEGER), ELEVEN_INTEGER), list(makeInteger(-2), THREE_INTEGER)));

    /**
     * Return (+ NUMBER 1)
     */
    @LispMethod(comment = "Return (+ NUMBER 1)")
    public static final SubLObject f_1X_alt(SubLObject number) {
        return add(number, ONE_INTEGER);
    }

    /**
     * Return (+ NUMBER 1)
     */
    @LispMethod(comment = "Return (+ NUMBER 1)")
    public static SubLObject f_1X(final SubLObject number) {
        return add(number, ONE_INTEGER);
    }

    /**
     * Return (- NUMBER 1)
     */
    @LispMethod(comment = "Return (- NUMBER 1)")
    public static final SubLObject f_1__alt(SubLObject number) {
        return subtract(number, ONE_INTEGER);
    }

    /**
     * Return (- NUMBER 1)
     */
    @LispMethod(comment = "Return (- NUMBER 1)")
    public static SubLObject f_1_(final SubLObject number) {
        return subtract(number, ONE_INTEGER);
    }

    /**
     * Return (* NUMBER 2)
     */
    @LispMethod(comment = "Return (* NUMBER 2)")
    public static final SubLObject f_2X_alt(SubLObject number) {
        return add(number, number);
    }

    /**
     * Return (* NUMBER 2)
     */
    @LispMethod(comment = "Return (* NUMBER 2)")
    public static SubLObject f_2X(final SubLObject number) {
        return add(number, number);
    }

    /**
     * Return T iff OBJECT is 1
     */
    @LispMethod(comment = "Return T iff OBJECT is 1")
    public static final SubLObject onep_alt(SubLObject v_object) {
        return eql(ONE_INTEGER, v_object);
    }

    /**
     * Return T iff OBJECT is 1
     */
    @LispMethod(comment = "Return T iff OBJECT is 1")
    public static SubLObject onep(final SubLObject v_object) {
        return eql(ONE_INTEGER, v_object);
    }

    /**
     * Convert any object to either 1 or 0
     */
    @LispMethod(comment = "Convert any object to either 1 or 0")
    public static final SubLObject encode_boolean_alt(SubLObject v_object) {
        return NIL != v_object ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
    }

    /**
     * Convert any object to either 1 or 0
     */
    @LispMethod(comment = "Convert any object to either 1 or 0")
    public static SubLObject encode_boolean(final SubLObject v_object) {
        return NIL != v_object ? ONE_INTEGER : ZERO_INTEGER;
    }

    /**
     * Convert 1 or 0 to T or NIL.
     */
    @LispMethod(comment = "Convert 1 or 0 to T or NIL.")
    public static final SubLObject decode_boolean_alt(SubLObject integer) {
        return makeBoolean(!integer.isZero());
    }

    /**
     * Convert 1 or 0 to T or NIL.
     */
    @LispMethod(comment = "Convert 1 or 0 to T or NIL.")
    public static SubLObject decode_boolean(final SubLObject integer) {
        return makeBoolean(!integer.isZero());
    }

    /**
     * Return the boolean value encoded in BIT-NUMBER of BITS.
     */
    @LispMethod(comment = "Return the boolean value encoded in BIT-NUMBER of BITS.")
    public static final SubLObject get_bit_alt(SubLObject bits, SubLObject bit_number) {
        return com.cyc.cycjava.cycl.number_utilities.decode_boolean(bytes.ldb(bytes.sublisp_byte(ONE_INTEGER, bit_number), bits));
    }

    /**
     * Return the boolean value encoded in BIT-NUMBER of BITS.
     */
    @LispMethod(comment = "Return the boolean value encoded in BIT-NUMBER of BITS.")
    public static SubLObject get_bit(final SubLObject bits, final SubLObject bit_number) {
        return decode_boolean(bytes.ldb(bytes.sublisp_byte(ONE_INTEGER, bit_number), bits));
    }

    /**
     * Set BIT-NUMBER bit in BITS (an integer) to BOOLEAN.
     */
    @LispMethod(comment = "Set BIT-NUMBER bit in BITS (an integer) to BOOLEAN.")
    public static final SubLObject set_bit_alt(SubLObject bits, SubLObject bit_number, SubLObject v_boolean) {
        if (v_boolean == UNPROVIDED) {
            v_boolean = T;
        }
        return bytes.dpb(com.cyc.cycjava.cycl.number_utilities.encode_boolean(v_boolean), bytes.sublisp_byte(ONE_INTEGER, bit_number), bits);
    }

    /**
     * Set BIT-NUMBER bit in BITS (an integer) to BOOLEAN.
     */
    @LispMethod(comment = "Set BIT-NUMBER bit in BITS (an integer) to BOOLEAN.")
    public static SubLObject set_bit(final SubLObject bits, final SubLObject bit_number, SubLObject v_boolean) {
        if (v_boolean == UNPROVIDED) {
            v_boolean = T;
        }
        return bytes.dpb(encode_boolean(v_boolean), bytes.sublisp_byte(ONE_INTEGER, bit_number), bits);
    }

    /**
     * Set BIT-NUMBER bit in BITS (an integer) to FALSE.
     */
    @LispMethod(comment = "Set BIT-NUMBER bit in BITS (an integer) to FALSE.")
    public static final SubLObject clear_bit_alt(SubLObject bits, SubLObject bit_number) {
        return com.cyc.cycjava.cycl.number_utilities.set_bit(bits, bit_number, NIL);
    }

    /**
     * Set BIT-NUMBER bit in BITS (an integer) to FALSE.
     */
    @LispMethod(comment = "Set BIT-NUMBER bit in BITS (an integer) to FALSE.")
    public static SubLObject clear_bit(final SubLObject bits, final SubLObject bit_number) {
        return set_bit(bits, bit_number, NIL);
    }

    public static final SubLObject div_alt(SubLObject number, SubLObject divisor) {
        SubLTrampolineFile.checkType(number, NUMBERP);
        SubLTrampolineFile.checkType(divisor, NUMBERP);
        return integerDivide(number, divisor);
    }

    public static SubLObject div(final SubLObject number, final SubLObject divisor) {
        assert NIL != numberp(number) : "! numberp(number) " + ("Types.numberp(number) " + "CommonSymbols.NIL != Types.numberp(number) ") + number;
        assert NIL != numberp(divisor) : "! numberp(divisor) " + ("Types.numberp(divisor) " + "CommonSymbols.NIL != Types.numberp(divisor) ") + divisor;
        return integerDivide(number, divisor);
    }

    public static SubLObject safe_X(final SubLObject number, final SubLObject divisor) {
        return NIL == non_zero_number_p(divisor) ? ZERO_INTEGER : number.isNumber() ? divide(number, divisor) : ZERO_INTEGER;
    }

    /**
     *
     *
     * @param number;
    numberp
     * 		
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param number;\nnumberp\r\n\t\t\r\n@return numberp\r\n@unknown yogman")
    public static final SubLObject square_alt(SubLObject number) {
        SubLTrampolineFile.checkType(number, NUMBERP);
        return multiply(number, number);
    }

    /**
     *
     *
     * @param number;
    numberp
     * 		
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param number;\nnumberp\r\n\t\t\r\n@return numberp\r\n@unknown yogman")
    public static SubLObject square(final SubLObject number) {
        assert NIL != numberp(number) : "! numberp(number) " + ("Types.numberp(number) " + "CommonSymbols.NIL != Types.numberp(number) ") + number;
        return multiply(number, number);
    }

    /**
     *
     *
     * @param number;
    numberp
     * 		
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param number;\nnumberp\r\n\t\t\r\n@return numberp\r\n@unknown yogman")
    public static final SubLObject cube_alt(SubLObject number) {
        SubLTrampolineFile.checkType(number, NUMBERP);
        return expt(number, THREE_INTEGER);
    }

    /**
     *
     *
     * @param number;
    numberp
     * 		
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param number;\nnumberp\r\n\t\t\r\n@return numberp\r\n@unknown yogman")
    public static SubLObject cube(final SubLObject number) {
        assert NIL != numberp(number) : "! numberp(number) " + ("Types.numberp(number) " + "CommonSymbols.NIL != Types.numberp(number) ") + number;
        return expt(number, THREE_INTEGER);
    }

    /**
     * Returns the cube root of NUMBER
     */
    @LispMethod(comment = "Returns the cube root of NUMBER")
    public static final SubLObject cubert_alt(SubLObject number) {
        SubLTrampolineFile.checkType(number, NUMBERP);
        return expt(number, divide(ONE_INTEGER, THREE_INTEGER));
    }

    /**
     * Returns the cube root of NUMBER
     */
    @LispMethod(comment = "Returns the cube root of NUMBER")
    public static SubLObject cubert(final SubLObject number) {
        assert NIL != numberp(number) : "! numberp(number) " + ("Types.numberp(number) " + "CommonSymbols.NIL != Types.numberp(number) ") + number;
        return expt(number, divide(ONE_INTEGER, THREE_INTEGER));
    }

    /**
     * Return T iff OBJECT is an integer from 0-255
     */
    @LispMethod(comment = "Return T iff OBJECT is an integer from 0-255")
    public static final SubLObject bytep_alt(SubLObject v_object) {
        return makeBoolean((v_object.isInteger() && ZERO_INTEGER.numLE(v_object)) && v_object.numL($int$256));
    }

    /**
     * Return T iff OBJECT is an integer from 0-255
     */
    @LispMethod(comment = "Return T iff OBJECT is an integer from 0-255")
    public static SubLObject bytep(final SubLObject v_object) {
        return makeBoolean((v_object.isInteger() && ZERO_INTEGER.numLE(v_object)) && v_object.numL($int$256));
    }

    /**
     * Return T iff OBJECT is either an integer or NIL
     */
    @LispMethod(comment = "Return T iff OBJECT is either an integer or NIL")
    public static final SubLObject nil_or_integer_p_alt(SubLObject v_object) {
        return makeBoolean((NIL == v_object) || v_object.isInteger());
    }

    /**
     * Return T iff OBJECT is either an integer or NIL
     */
    @LispMethod(comment = "Return T iff OBJECT is either an integer or NIL")
    public static SubLObject nil_or_integer_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || v_object.isInteger());
    }

    public static SubLObject possibly_positive_integer_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (NIL != subl_promotions.positive_integer_p(v_object)));
    }

    public static final SubLObject list_of_integer_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject subobject = NIL;
                for (subobject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subobject = cdolist_list_var.first()) {
                    if (!subobject.isInteger()) {
                        return NIL;
                    }
                }
                return T;
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject list_of_integer_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (!subobject.isInteger()) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject list_of_positive_integer_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject subobject = NIL;
                for (subobject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subobject = cdolist_list_var.first()) {
                    if (NIL == positive_integer_p(subobject)) {
                        return NIL;
                    }
                }
                return T;
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject list_of_positive_integer_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_promotions.positive_integer_p(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject list_of_negative_integer_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject subobject = NIL;
                for (subobject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subobject = cdolist_list_var.first()) {
                    if (NIL == negative_integer_p(subobject)) {
                        return NIL;
                    }
                }
                return T;
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject list_of_negative_integer_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_promotions.negative_integer_p(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject list_of_non_negative_integer_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject subobject = NIL;
                for (subobject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subobject = cdolist_list_var.first()) {
                    if (NIL == non_negative_integer_p(subobject)) {
                        return NIL;
                    }
                }
                return T;
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject list_of_non_negative_integer_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_promotions.non_negative_integer_p(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject list_of_non_positive_integer_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject subobject = NIL;
                for (subobject = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subobject = cdolist_list_var.first()) {
                    if (NIL == non_positive_integer_p(subobject)) {
                        return NIL;
                    }
                }
                return T;
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject list_of_non_positive_integer_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject subobject = NIL;
            subobject = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == subl_promotions.non_positive_integer_p(subobject)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                subobject = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    /**
     * Return T iff OBJECT is a number > 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number > 0")
    public static final SubLObject positive_number_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && v_object.isPositive());
    }

    /**
     * Return T iff OBJECT is a number > 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number > 0")
    public static SubLObject positive_number_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && v_object.isPositive());
    }

    /**
     * Return T iff OBJECT is a number >= 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number >= 0")
    public static final SubLObject non_negative_number_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (!v_object.isNegative()));
    }

    /**
     * Return T iff OBJECT is a number >= 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number >= 0")
    public static SubLObject non_negative_number_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (!v_object.isNegative()));
    }

    /**
     * Return T iff OBJECT is a number <= 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number <= 0")
    public static final SubLObject non_positive_number_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (!v_object.isPositive()));
    }

    /**
     * Return T iff OBJECT is a number <= 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number <= 0")
    public static SubLObject non_positive_number_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (!v_object.isPositive()));
    }

    /**
     * Return T iff OBJECT is a number < 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number < 0")
    public static final SubLObject negative_number_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && v_object.isNegative());
    }

    /**
     * Return T iff OBJECT is a number < 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number < 0")
    public static SubLObject negative_number_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && v_object.isNegative());
    }

    /**
     * Like @xref ZEROP, but doesn't error on non-numbers.
     */
    @LispMethod(comment = "Like @xref ZEROP, but doesn\'t error on non-numbers.")
    public static final SubLObject zero_number_p_alt(SubLObject v_object) {
        {
            SubLObject result = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            result = zerop(v_object);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            return result;
        }
    }

    /**
     * Like @xref ZEROP, but doesn't error on non-numbers.
     */
    @LispMethod(comment = "Like @xref ZEROP, but doesn\'t error on non-numbers.")
    public static SubLObject zero_number_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = zerop(v_object);
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
        return result;
    }

    /**
     * Return T iff OBJECT is a number not equal to 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number not equal to 0")
    public static final SubLObject non_zero_number_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (!v_object.isZero()));
    }

    /**
     * Return T iff OBJECT is a number not equal to 0
     */
    @LispMethod(comment = "Return T iff OBJECT is a number not equal to 0")
    public static SubLObject non_zero_number_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() && (!v_object.isZero()));
    }

    /**
     * Return T iff OBJECT is a number between 0 and 1
     */
    @LispMethod(comment = "Return T iff OBJECT is a number between 0 and 1")
    public static final SubLObject probability_number_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isNumber() && ZERO_INTEGER.numLE(v_object)) && v_object.numLE(ONE_INTEGER));
    }

    /**
     * Return T iff OBJECT is a number between 0 and 1
     */
    @LispMethod(comment = "Return T iff OBJECT is a number between 0 and 1")
    public static SubLObject probability_number_p(final SubLObject v_object) {
        return makeBoolean((v_object.isNumber() && ZERO_INTEGER.numLE(v_object)) && v_object.numLE(ONE_INTEGER));
    }

    /**
     * Return T iff OBJECT is a number between 0 (inclusive) and 1 (exclusive)
     */
    @LispMethod(comment = "Return T iff OBJECT is a number between 0 (inclusive) and 1 (exclusive)")
    public static final SubLObject percentile_p_alt(SubLObject v_object) {
        return makeBoolean((v_object.isNumber() && ZERO_INTEGER.numLE(v_object)) && v_object.numL(ONE_INTEGER));
    }

    /**
     * Return T iff OBJECT is a number between 0 (inclusive) and 1 (exclusive)
     */
    @LispMethod(comment = "Return T iff OBJECT is a number between 0 (inclusive) and 1 (exclusive)")
    public static SubLObject percentile_p(final SubLObject v_object) {
        return makeBoolean((v_object.isNumber() && ZERO_INTEGER.numLE(v_object)) && v_object.numL(ONE_INTEGER));
    }

    /**
     * decimal version of INTEGER-LENGTH
     */
    @LispMethod(comment = "decimal version of INTEGER-LENGTH")
    public static final SubLObject decimal_integer_length_alt(SubLObject integer) {
        SubLTrampolineFile.checkType(integer, INTEGERP);
        {
            SubLObject length = ZERO_INTEGER;
            while (!integer.isZero()) {
                integer = integerDivide(integer, TEN_INTEGER);
                length = add(length, ONE_INTEGER);
            } 
            return length;
        }
    }

    /**
     * decimal version of INTEGER-LENGTH
     */
    @LispMethod(comment = "decimal version of INTEGER-LENGTH")
    public static SubLObject decimal_integer_length(SubLObject integer) {
        assert NIL != integerp(integer) : "! integerp(integer) " + ("Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) ") + integer;
        SubLObject length;
        for (length = ZERO_INTEGER; !integer.isZero(); integer = integerDivide(integer, TEN_INTEGER) , length = add(length, ONE_INTEGER)) {
        }
        return length;
    }

    public static final SubLObject significant_digits_alt(SubLObject number, SubLObject digits) {
        SubLTrampolineFile.checkType(number, EXTENDED_POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(digits, POSITIVE_INTEGER_P);
        if (NIL != com.cyc.cycjava.cycl.number_utilities.infinite_number_p(number)) {
            return number;
        } else {
            if (NIL != scientific_numbers.scientific_number_p(number)) {
                return scientific_number_utilities.scientific_number_significant_digits(number, digits);
            } else {
                if (number.isZero()) {
                    return ZERO_INTEGER;
                } else {
                    if (number.isNegative()) {
                        return minus(com.cyc.cycjava.cycl.number_utilities.significant_digits(minus(number), digits));
                    } else {
                        if (number.isInteger() && digits.numGE(com.cyc.cycjava.cycl.number_utilities.decimal_integer_length(number))) {
                            return number;
                        } else {
                            if (number.isDouble() && digits.numGE($maximum_float_significant_digits$.getGlobalValue())) {
                                return number;
                            } else {
                                {
                                    SubLObject normalization_power = floor(log(number, TEN_INTEGER), UNPROVIDED);
                                    SubLObject normalization_ratio = expt(TEN_INTEGER, normalization_power);
                                    SubLObject normalized_number = divide(number, normalization_ratio);
                                    SubLObject significant_ratio = expt(TEN_INTEGER, subtract(digits, ONE_INTEGER));
                                    SubLObject scaled_normalized = multiply(normalized_number, significant_ratio);
                                    SubLObject scaled_significant = round(scaled_normalized, UNPROVIDED);
                                    SubLObject normalized_significant = divide(scaled_significant, significant_ratio);
                                    SubLObject significant = multiply(normalized_significant, normalization_ratio);
                                    if (number.isInteger()) {
                                        {
                                            SubLObject unnormalization_power = subtract(normalization_power, subtract(digits, ONE_INTEGER));
                                            SubLObject unnormalization_ratio = expt(TEN_INTEGER, unnormalization_power);
                                            significant = multiply(scaled_significant, unnormalization_ratio);
                                        }
                                    }
                                    if ((significant.isDouble() && number.numGE($most_negative_fixnum$.getGlobalValue())) && number.numLE($most_positive_fixnum$.getGlobalValue())) {
                                        {
                                            SubLObject nearest_integer = round(significant, UNPROVIDED);
                                            if (nearest_integer.numE(significant)) {
                                                significant = nearest_integer;
                                            }
                                        }
                                    }
                                    if (significant.isDouble()) {
                                        significant = com.cyc.cycjava.cycl.number_utilities.significant_digits_optimize_float(significant);
                                    }
                                    return significant;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject significant_digits(final SubLObject number, final SubLObject digits) {
        assert NIL != extended_potentially_infinite_number_p(number) : "! number_utilities.extended_potentially_infinite_number_p(number) " + ("number_utilities.extended_potentially_infinite_number_p(number) " + "CommonSymbols.NIL != number_utilities.extended_potentially_infinite_number_p(number) ") + number;
        SubLTrampolineFile.enforceType(digits, POSITIVE_INTEGER_P);
        if (NIL != infinite_number_p(number)) {
            return number;
        }
        if (NIL != scientific_numbers.scientific_number_p(number)) {
            return scientific_number_utilities.scientific_number_significant_digits(number, digits);
        }
        if (number.isZero()) {
            return ZERO_INTEGER;
        }
        if (number.isNegative()) {
            return minus(significant_digits(minus(number), digits));
        }
        if (number.isInteger() && digits.numGE(decimal_integer_length(number))) {
            return number;
        }
        if (number.isDouble() && digits.numGE($maximum_float_significant_digits$.getGlobalValue())) {
            return number;
        }
        if ((NIL != extended_numbers.include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(number, UNPROVIDED))) {
            return significant_digits(math_expression_utilities.fraction_from_el(number), digits);
        }
        if ((NIL != extended_numbers.include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(number))) {
            return significant_digits(fraction_utilities.defractionify(number), digits);
        }
        final SubLObject normalization_power = floor(log(number, TEN_INTEGER), UNPROVIDED);
        final SubLObject normalization_ratio = expt(TEN_INTEGER, normalization_power);
        final SubLObject normalized_number = divide(number, normalization_ratio);
        final SubLObject significant_ratio = expt(TEN_INTEGER, subtract(digits, ONE_INTEGER));
        final SubLObject scaled_normalized = multiply(normalized_number, significant_ratio);
        final SubLObject scaled_significant = round(scaled_normalized, UNPROVIDED);
        final SubLObject normalized_significant = divide(scaled_significant, significant_ratio);
        SubLObject significant = multiply(normalized_significant, normalization_ratio);
        if (number.isInteger()) {
            final SubLObject unnormalization_power = subtract(normalization_power, subtract(digits, ONE_INTEGER));
            final SubLObject unnormalization_ratio = expt(TEN_INTEGER, unnormalization_power);
            significant = multiply(scaled_significant, unnormalization_ratio);
        }
        if ((significant.isDouble() && number.numGE($most_negative_fixnum$.getGlobalValue())) && number.numLE($most_positive_fixnum$.getGlobalValue())) {
            final SubLObject nearest_integer = round(significant, UNPROVIDED);
            if (nearest_integer.numE(significant)) {
                significant = nearest_integer;
            }
        }
        if (significant.isDouble()) {
            significant = significant_digits_optimize_float(significant);
        }
        return significant;
    }

    /**
     * a lambda
     */
    @LispMethod(comment = "a lambda")
    public static final SubLObject four_significant_digits_alt(SubLObject number) {
        return com.cyc.cycjava.cycl.number_utilities.significant_digits(number, FOUR_INTEGER);
    }

    /**
     * a lambda
     */
    @LispMethod(comment = "a lambda")
    public static SubLObject four_significant_digits(final SubLObject number) {
        return significant_digits(number, FOUR_INTEGER);
    }

    public static final SubLObject significant_digits_optimize_float_alt(SubLObject v_float) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject significand = integer_decode_float(v_float);
                SubLObject exponent = thread.secondMultipleValue();
                SubLObject sign = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject tersest_length = $most_positive_fixnum$.getGlobalValue();
                    SubLObject tersest_float = NIL;
                    SubLObject end_var = THREE_INTEGER;
                    SubLObject delta = NIL;
                    for (delta = $int$_2; !delta.numGE(end_var); delta = com.cyc.cycjava.cycl.number_utilities.f_1X(delta)) {
                        {
                            SubLObject candidate_significand = add(significand, delta);
                            SubLObject candidate_float = multiply(sign, scale_float(sublisp_float(candidate_significand, v_float), exponent));
                            SubLObject candidate_length = length(prin1_to_string(candidate_float));
                            if (candidate_length.numL(tersest_length)) {
                                tersest_length = candidate_length;
                                tersest_float = candidate_float;
                            }
                        }
                    }
                    return tersest_float;
                }
            }
        }
    }

    public static SubLObject significant_digits_optimize_float(final SubLObject v_float) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject significand = integer_decode_float(v_float);
        final SubLObject exponent = thread.secondMultipleValue();
        final SubLObject sign = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject tersest_length = $most_positive_fixnum$.getGlobalValue();
        SubLObject tersest_float = NIL;
        SubLObject cdolist_list_var = $list14;
        SubLObject delta = NIL;
        delta = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject candidate_significand = add(significand, delta);
            final SubLObject candidate_float = multiply(sign, scale_float(sublisp_float(candidate_significand, v_float), exponent));
            final SubLObject candidate_length = length(prin1_to_string(candidate_float));
            if (candidate_length.numL(tersest_length)) {
                tersest_length = candidate_length;
                tersest_float = candidate_float;
            }
            cdolist_list_var = cdolist_list_var.rest();
            delta = cdolist_list_var.first();
        } 
        return tersest_float;
    }

    public static final SubLObject float_n_alt(SubLObject num, SubLObject n) {
        if (n == UNPROVIDED) {
            n = FOUR_INTEGER;
        }
        {
            SubLObject base = expt(TEN_INTEGER, n);
            return sublisp_float(divide(round(multiply(num, base), UNPROVIDED), base), UNPROVIDED);
        }
    }

    public static SubLObject float_n(final SubLObject num, SubLObject n) {
        if (n == UNPROVIDED) {
            n = FOUR_INTEGER;
        }
        final SubLObject base = expt(TEN_INTEGER, n);
        return sublisp_float(divide(round(multiply(num, base), UNPROVIDED), base), UNPROVIDED);
    }

    public static final SubLObject round_up_to_the_nearest_alt(SubLObject x, SubLObject n) {
        return multiply(ceiling(divide(x, n), UNPROVIDED), n);
    }

    public static SubLObject round_up_to_the_nearest(final SubLObject x, final SubLObject n) {
        return multiply(ceiling(divide(x, n), UNPROVIDED), n);
    }

    public static final SubLObject round_to_the_nearest_alt(SubLObject x, SubLObject n) {
        return multiply(round(divide(x, n), UNPROVIDED), n);
    }

    public static SubLObject round_to_the_nearest(final SubLObject x, final SubLObject n) {
        return multiply(round(divide(x, n), UNPROVIDED), n);
    }

    public static final SubLObject round_down_to_the_nearest_alt(SubLObject x, SubLObject n) {
        return multiply(floor(divide(x, n), UNPROVIDED), n);
    }

    public static SubLObject round_down_to_the_nearest(final SubLObject x, final SubLObject n) {
        return multiply(floor(divide(x, n), UNPROVIDED), n);
    }

    public static final SubLObject greater_absP_alt(SubLObject num1, SubLObject num2) {
        return numG(abs(num1), abs(num2));
    }

    public static SubLObject greater_absP(final SubLObject num1, final SubLObject num2) {
        return numG(abs(num1), abs(num2));
    }

    public static final SubLObject divides_evenly_alt(SubLObject number, SubLObject divisor) {
        SubLTrampolineFile.checkType(number, NUMBERP);
        SubLTrampolineFile.checkType(divisor, NUMBERP);
        return numE(mod(number, divisor), ZERO_INTEGER);
    }

    public static SubLObject divides_evenly(final SubLObject number, final SubLObject divisor) {
        assert NIL != numberp(number) : "! numberp(number) " + ("Types.numberp(number) " + "CommonSymbols.NIL != Types.numberp(number) ") + number;
        assert NIL != numberp(divisor) : "! numberp(divisor) " + ("Types.numberp(divisor) " + "CommonSymbols.NIL != Types.numberp(divisor) ") + divisor;
        return numE(mod(number, divisor), ZERO_INTEGER);
    }

    /**
     * Express NUMERATOR/DENOMINATOR as an integer percent.
     *
     * @param ROUND?
     * 		If non-NIL, round to nearest percent, else always round down.
     */
    @LispMethod(comment = "Express NUMERATOR/DENOMINATOR as an integer percent.\r\n\r\n@param ROUND?\r\n\t\tIf non-NIL, round to nearest percent, else always round down.")
    public static final SubLObject integer_percent_alt(SubLObject numerator, SubLObject denominator, SubLObject roundP) {
        if (denominator == UNPROVIDED) {
            denominator = ONE_INTEGER;
        }
        if (roundP == UNPROVIDED) {
            roundP = NIL;
        }
        {
            SubLObject raw = multiply(numerator, $int$100);
            return values(NIL != roundP ? ((SubLObject) (round(raw, denominator))) : truncate(raw, denominator));
        }
    }

    /**
     * Express NUMERATOR/DENOMINATOR as an integer percent.
     *
     * @param ROUND?
     * 		If non-NIL, round to nearest percent, else always round down.
     */
    @LispMethod(comment = "Express NUMERATOR/DENOMINATOR as an integer percent.\r\n\r\n@param ROUND?\r\n\t\tIf non-NIL, round to nearest percent, else always round down.")
    public static SubLObject integer_percent(final SubLObject numerator, SubLObject denominator, SubLObject roundP) {
        if (denominator == UNPROVIDED) {
            denominator = ONE_INTEGER;
        }
        if (roundP == UNPROVIDED) {
            roundP = NIL;
        }
        final SubLObject raw = multiply(numerator, $int$100);
        return values(NIL != roundP ? round(raw, denominator) : truncate(raw, denominator));
    }

    public static SubLObject safe_percent(final SubLObject numerator, SubLObject denominator, SubLObject significant_digits) {
        if (denominator == UNPROVIDED) {
            denominator = ONE_INTEGER;
        }
        if (significant_digits == UNPROVIDED) {
            significant_digits = NIL;
        }
        if ((denominator.isZero() || (NIL == denominator)) || (NIL == numerator)) {
            return ZERO_INTEGER;
        }
        return percent(numerator, denominator, significant_digits);
    }

    /**
     * Express NUMERATOR/DENOMINATOR as a percent.
     * The answer is limited to SIGNIFICANT-DIGITS, when non-nil.
     */
    @LispMethod(comment = "Express NUMERATOR/DENOMINATOR as a percent.\r\nThe answer is limited to SIGNIFICANT-DIGITS, when non-nil.\nExpress NUMERATOR/DENOMINATOR as a percent.\nThe answer is limited to SIGNIFICANT-DIGITS, when non-nil.")
    public static final SubLObject percent_alt(SubLObject numerator, SubLObject denominator, SubLObject significant_digits) {
        if (denominator == UNPROVIDED) {
            denominator = ONE_INTEGER;
        }
        if (significant_digits == UNPROVIDED) {
            significant_digits = NIL;
        }
        {
            SubLObject result = multiply($int$100, divide(numerator, denominator));
            if (NIL != significant_digits) {
                result = com.cyc.cycjava.cycl.number_utilities.significant_digits(result, significant_digits);
            }
            return result;
        }
    }

    /**
     * Express NUMERATOR/DENOMINATOR as a percent.
     * The answer is limited to SIGNIFICANT-DIGITS, when non-nil.
     */
    @LispMethod(comment = "Express NUMERATOR/DENOMINATOR as a percent.\r\nThe answer is limited to SIGNIFICANT-DIGITS, when non-nil.\nExpress NUMERATOR/DENOMINATOR as a percent.\nThe answer is limited to SIGNIFICANT-DIGITS, when non-nil.")
    public static SubLObject percent(final SubLObject numerator, SubLObject denominator, SubLObject significant_digits) {
        if (denominator == UNPROVIDED) {
            denominator = ONE_INTEGER;
        }
        if (significant_digits == UNPROVIDED) {
            significant_digits = NIL;
        }
        SubLObject result = multiply($int$100, divide(numerator, denominator));
        if (NIL != significant_digits) {
            result = significant_digits(result, significant_digits);
        }
        return result;
    }

    public static final SubLObject percentage_p_alt(SubLObject v_object) {
        return cyc_real_0_100(v_object);
    }

    public static SubLObject percentage_p(final SubLObject v_object) {
        return collection_defns.cyc_real_0_100(v_object);
    }

    public static final SubLObject percentage_to_probability_alt(SubLObject percentage) {
        return divide(percentage, $int$100);
    }

    public static SubLObject percentage_to_probability(final SubLObject percentage) {
        return divide(percentage, $int$100);
    }

    public static final SubLObject percent_increase_alt(SubLObject old, SubLObject v_new) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!v_new.numGE(old)) {
                    Errors.error($$$NEW_must_be_larger_than_OLD);
                }
            }
            return com.cyc.cycjava.cycl.number_utilities.percent(com.cyc.cycjava.cycl.number_utilities.f_1_(divide(v_new, old)), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject percent_increase(final SubLObject old, final SubLObject v_new) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!v_new.numGE(old))) {
            Errors.error($$$NEW_must_be_larger_than_OLD);
        }
        return percent(f_1_(divide(v_new, old)), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject percent_decrease_alt(SubLObject old, SubLObject v_new) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!v_new.numLE(old)) {
                    Errors.error($$$NEW_must_be_smaller_than_OLD);
                }
            }
            return com.cyc.cycjava.cycl.number_utilities.percent(minus(com.cyc.cycjava.cycl.number_utilities.f_1_(divide(v_new, old))), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject percent_decrease(final SubLObject old, final SubLObject v_new) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!v_new.numLE(old))) {
            Errors.error($$$NEW_must_be_smaller_than_OLD);
        }
        return percent(minus(f_1_(divide(v_new, old))), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject percent_faster_alt(SubLObject old_time, SubLObject new_time) {
        return com.cyc.cycjava.cycl.number_utilities.percent_decrease(old_time, new_time);
    }

    public static SubLObject percent_faster(final SubLObject old_time, final SubLObject new_time) {
        return percent_decrease(old_time, new_time);
    }

    public static final SubLObject percent_slower_alt(SubLObject old_time, SubLObject new_time) {
        return com.cyc.cycjava.cycl.number_utilities.percent_increase(old_time, new_time);
    }

    public static SubLObject percent_slower(final SubLObject old_time, final SubLObject new_time) {
        return percent_increase(old_time, new_time);
    }

    /**
     *
     *
     * @return numberp; log base 10 of NUMBER
     */
    @LispMethod(comment = "@return numberp; log base 10 of NUMBER")
    public static final SubLObject log10_alt(SubLObject number) {
        return log(number, TEN_INTEGER);
    }

    /**
     *
     *
     * @return numberp; log base 10 of NUMBER
     */
    @LispMethod(comment = "@return numberp; log base 10 of NUMBER")
    public static SubLObject log10(final SubLObject number) {
        return log(number, TEN_INTEGER);
    }

    /**
     *
     *
     * @return numberp; log base 2 of NUMBER
     */
    @LispMethod(comment = "@return numberp; log base 2 of NUMBER")
    public static final SubLObject log2_alt(SubLObject number) {
        return log(number, TWO_INTEGER);
    }

    /**
     *
     *
     * @return numberp; log base 2 of NUMBER
     */
    @LispMethod(comment = "@return numberp; log base 2 of NUMBER")
    public static SubLObject log2(final SubLObject number) {
        return log(number, TWO_INTEGER);
    }

    /**
     *
     *
     * @return positive-number-p; 10^NUMBER
     */
    @LispMethod(comment = "@return positive-number-p; 10^NUMBER")
    public static final SubLObject expt10_alt(SubLObject number) {
        return expt(TEN_INTEGER, number);
    }

    /**
     *
     *
     * @return positive-number-p; 10^NUMBER
     */
    @LispMethod(comment = "@return positive-number-p; 10^NUMBER")
    public static SubLObject expt10(final SubLObject number) {
        return expt(TEN_INTEGER, number);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_number_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() || (NIL != com.cyc.cycjava.cycl.number_utilities.infinite_number_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_number_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() || (NIL != infinite_number_p(v_object)));
    }

    public static final SubLObject negative_infinity_alt() {
        return $NEGATIVE_INFINITY;
    }

    public static SubLObject negative_infinity() {
        return $NEGATIVE_INFINITY;
    }

    public static final SubLObject positive_infinity_alt() {
        return $POSITIVE_INFINITY;
    }

    public static SubLObject positive_infinity() {
        return $POSITIVE_INFINITY;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject negative_infinity_p_alt(SubLObject v_object) {
        return eq(v_object, $NEGATIVE_INFINITY);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject negative_infinity_p(final SubLObject v_object) {
        return eq(v_object, $NEGATIVE_INFINITY);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject positive_infinity_p_alt(SubLObject v_object) {
        return eq(v_object, $POSITIVE_INFINITY);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject positive_infinity_p(final SubLObject v_object) {
        return eq(v_object, $POSITIVE_INFINITY);
    }

    public static final SubLObject infinite_number_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(v_object)) || (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(v_object)));
    }

    public static SubLObject infinite_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != negative_infinity_p(v_object)) || (NIL != positive_infinity_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject negative_potentially_infinite_number_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(v_object)) || (NIL != com.cyc.cycjava.cycl.number_utilities.negative_number_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject negative_potentially_infinite_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != negative_infinity_p(v_object)) || (NIL != negative_number_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject positive_potentially_infinite_number_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(v_object)) || (NIL != com.cyc.cycjava.cycl.number_utilities.positive_number_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject positive_potentially_infinite_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != positive_infinity_p(v_object)) || (NIL != positive_number_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject non_negative_potentially_infinite_number_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(v_object)) || (NIL != com.cyc.cycjava.cycl.number_utilities.non_negative_number_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject non_negative_potentially_infinite_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != positive_infinity_p(v_object)) || (NIL != non_negative_number_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_number_E_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        return eql(num1, num2);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_number_E(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_infinite_number_p(num1) : "! number_utilities.potentially_infinite_number_p(num1) " + ("number_utilities.potentially_infinite_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num1) ") + num1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        return eql(num1, num2);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_number_L_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num1)) {
            return makeBoolean(NIL == com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num2));
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num2)) {
                return NIL;
            } else {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num2)) {
                    return makeBoolean(NIL == com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num1));
                } else {
                    if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num1)) {
                        return NIL;
                    } else {
                        return numL(num1, num2);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_number_L(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_infinite_number_p(num1) : "! number_utilities.potentially_infinite_number_p(num1) " + ("number_utilities.potentially_infinite_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num1) ") + num1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        if (NIL != negative_infinity_p(num1)) {
            return makeBoolean(NIL == negative_infinity_p(num2));
        }
        if (NIL != negative_infinity_p(num2)) {
            return NIL;
        }
        if (NIL != positive_infinity_p(num2)) {
            return makeBoolean(NIL == positive_infinity_p(num1));
        }
        if (NIL != positive_infinity_p(num1)) {
            return NIL;
        }
        return numL(num1, num2);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_number_G_alt(SubLObject num1, SubLObject num2) {
        return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_L(num2, num1);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_number_G(final SubLObject num1, final SubLObject num2) {
        return potentially_infinite_number_L(num2, num1);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_number_LE_alt(SubLObject num1, SubLObject num2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_E(num1, num2)) || (NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_L(num1, num2)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_number_LE(final SubLObject num1, final SubLObject num2) {
        return makeBoolean((NIL != potentially_infinite_number_E(num1, num2)) || (NIL != potentially_infinite_number_L(num1, num2)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_number_GE_alt(SubLObject num1, SubLObject num2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_E(num1, num2)) || (NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_G(num1, num2)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_number_GE(final SubLObject num1, final SubLObject num2) {
        return makeBoolean((NIL != potentially_infinite_number_E(num1, num2)) || (NIL != potentially_infinite_number_G(num1, num2)));
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static final SubLObject potentially_infinite_number_plus_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num1)) {
            return com.cyc.cycjava.cycl.number_utilities.negative_infinity_plus(num2);
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num2)) {
                return com.cyc.cycjava.cycl.number_utilities.negative_infinity_plus(num1);
            } else {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num1)) {
                    return com.cyc.cycjava.cycl.number_utilities.positive_infinity_plus(num2);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num2)) {
                        return com.cyc.cycjava.cycl.number_utilities.positive_infinity_plus(num1);
                    } else {
                        return add(num1, num2);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static SubLObject potentially_infinite_number_plus(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_infinite_number_p(num1) : "! number_utilities.potentially_infinite_number_p(num1) " + ("number_utilities.potentially_infinite_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num1) ") + num1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        if (NIL != negative_infinity_p(num1)) {
            return negative_infinity_plus(num2);
        }
        if (NIL != negative_infinity_p(num2)) {
            return negative_infinity_plus(num1);
        }
        if (NIL != positive_infinity_p(num1)) {
            return positive_infinity_plus(num2);
        }
        if (NIL != positive_infinity_p(num2)) {
            return positive_infinity_plus(num1);
        }
        return add(num1, num2);
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static final SubLObject potentially_infinite_number_minus_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num1)) {
            return com.cyc.cycjava.cycl.number_utilities.negative_infinity_minus(num2);
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num2)) {
                return com.cyc.cycjava.cycl.number_utilities.negative_infinity_minus(num1);
            } else {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num1)) {
                    return com.cyc.cycjava.cycl.number_utilities.positive_infinity_minus(num2);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num2)) {
                        return com.cyc.cycjava.cycl.number_utilities.positive_infinity_minus(num1);
                    } else {
                        return subtract(num1, num2);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static SubLObject potentially_infinite_number_minus(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_infinite_number_p(num1) : "! number_utilities.potentially_infinite_number_p(num1) " + ("number_utilities.potentially_infinite_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num1) ") + num1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        if (NIL != negative_infinity_p(num1)) {
            return negative_infinity_minus(num2);
        }
        if (NIL != negative_infinity_p(num2)) {
            return negative_infinity_minus(num1);
        }
        if (NIL != positive_infinity_p(num1)) {
            return positive_infinity_minus(num2);
        }
        if (NIL != positive_infinity_p(num2)) {
            return positive_infinity_minus(num1);
        }
        return subtract(num1, num2);
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static final SubLObject potentially_infinite_number_times_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num1)) {
            return com.cyc.cycjava.cycl.number_utilities.negative_infinity_times(num2);
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num2)) {
                return com.cyc.cycjava.cycl.number_utilities.negative_infinity_times(num1);
            } else {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num1)) {
                    return com.cyc.cycjava.cycl.number_utilities.positive_infinity_times(num2);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num2)) {
                        return com.cyc.cycjava.cycl.number_utilities.positive_infinity_times(num1);
                    } else {
                        return multiply(num1, num2);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static SubLObject potentially_infinite_number_times(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_infinite_number_p(num1) : "! number_utilities.potentially_infinite_number_p(num1) " + ("number_utilities.potentially_infinite_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num1) ") + num1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        if (NIL != negative_infinity_p(num1)) {
            return negative_infinity_times(num2);
        }
        if (NIL != negative_infinity_p(num2)) {
            return negative_infinity_times(num1);
        }
        if (NIL != positive_infinity_p(num1)) {
            return positive_infinity_times(num2);
        }
        if (NIL != positive_infinity_p(num2)) {
            return positive_infinity_times(num1);
        }
        return multiply(num1, num2);
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static final SubLObject potentially_infinite_number_divided_by_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        if (NIL != com.cyc.cycjava.cycl.number_utilities.zero_number_p(num2)) {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_potentially_infinite_number_p(num1)) {
                return $NEGATIVE_INFINITY;
            } else {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_potentially_infinite_number_p(num1)) {
                    return $POSITIVE_INFINITY;
                } else {
                    if (ZERO_INTEGER.eql(num1)) {
                        Errors.error($str_alt19$Can_t_divide_zero_by_zero);
                    }
                }
            }
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num1)) {
                return com.cyc.cycjava.cycl.number_utilities.negative_infinity_X(num2);
            } else {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num2)) {
                    return com.cyc.cycjava.cycl.number_utilities.divided_by_negative_infinity(num1);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num1)) {
                        return com.cyc.cycjava.cycl.number_utilities.positive_infinity_X(num2);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num2)) {
                            return com.cyc.cycjava.cycl.number_utilities.divided_by_positive_infinity(num1);
                        } else {
                            return divide(num1, num2);
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
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static SubLObject potentially_infinite_number_divided_by(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_infinite_number_p(num1) : "! number_utilities.potentially_infinite_number_p(num1) " + ("number_utilities.potentially_infinite_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num1) ") + num1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        if (NIL != zero_number_p(num2)) {
            if (NIL != negative_potentially_infinite_number_p(num1)) {
                return $NEGATIVE_INFINITY;
            }
            if (NIL != positive_potentially_infinite_number_p(num1)) {
                return $POSITIVE_INFINITY;
            }
            if (ZERO_INTEGER.eql(num1)) {
                Errors.error($str21$Can_t_divide_zero_by_zero);
            }
            return NIL;
        } else {
            if (NIL != negative_infinity_p(num1)) {
                return negative_infinity_X(num2);
            }
            if (NIL != negative_infinity_p(num2)) {
                return divided_by_negative_infinity(num1);
            }
            if (NIL != positive_infinity_p(num1)) {
                return positive_infinity_X(num2);
            }
            if (NIL != positive_infinity_p(num2)) {
                return divided_by_positive_infinity(num1);
            }
            return divide(num1, num2);
        }
    }

    /**
     *
     *
     * @param NUM1
    potentially-infinite-number-p
     * 		
     * @param NUM2
    potentially-infinite-number-p
     * 		
     * @return potentially-infinite-number-p.  Returns the max value between NUM1 and NUM2
     */
    @LispMethod(comment = "@param NUM1\npotentially-infinite-number-p\r\n\t\t\r\n@param NUM2\npotentially-infinite-number-p\r\n\t\t\r\n@return potentially-infinite-number-p.  Returns the max value between NUM1 and NUM2")
    public static final SubLObject potentially_infinite_number_max_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        if (NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_G(num1, num2)) {
            return num1;
        } else {
            return num2;
        }
    }

    /**
     *
     *
     * @param NUM1
    potentially-infinite-number-p
     * 		
     * @param NUM2
    potentially-infinite-number-p
     * 		
     * @return potentially-infinite-number-p.  Returns the max value between NUM1 and NUM2
     */
    @LispMethod(comment = "@param NUM1\npotentially-infinite-number-p\r\n\t\t\r\n@param NUM2\npotentially-infinite-number-p\r\n\t\t\r\n@return potentially-infinite-number-p.  Returns the max value between NUM1 and NUM2")
    public static SubLObject potentially_infinite_number_max(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_infinite_number_p(num1) : "! number_utilities.potentially_infinite_number_p(num1) " + ("number_utilities.potentially_infinite_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num1) ") + num1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        if (NIL != potentially_infinite_number_G(num1, num2)) {
            return num1;
        }
        return num2;
    }

    /**
     *
     *
     * @param NUM1
    potentially-infinite-number-p
     * 		
     * @param NUM2
    potentially-infinite-number-p
     * 		
     * @return potentially-infinite-number-p.  Returns the min value between NUM1 and NUM2
     */
    @LispMethod(comment = "@param NUM1\npotentially-infinite-number-p\r\n\t\t\r\n@param NUM2\npotentially-infinite-number-p\r\n\t\t\r\n@return potentially-infinite-number-p.  Returns the min value between NUM1 and NUM2")
    public static final SubLObject potentially_infinite_number_min_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_INFINITE_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        if (NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_L(num1, num2)) {
            return num1;
        } else {
            return num2;
        }
    }

    /**
     *
     *
     * @param NUM1
    potentially-infinite-number-p
     * 		
     * @param NUM2
    potentially-infinite-number-p
     * 		
     * @return potentially-infinite-number-p.  Returns the min value between NUM1 and NUM2
     */
    @LispMethod(comment = "@param NUM1\npotentially-infinite-number-p\r\n\t\t\r\n@param NUM2\npotentially-infinite-number-p\r\n\t\t\r\n@return potentially-infinite-number-p.  Returns the min value between NUM1 and NUM2")
    public static SubLObject potentially_infinite_number_min(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_infinite_number_p(num1) : "! number_utilities.potentially_infinite_number_p(num1) " + ("number_utilities.potentially_infinite_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num1) ") + num1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        if (NIL != potentially_infinite_number_L(num1, num2)) {
            return num1;
        }
        return num2;
    }

    /**
     *
     *
     * @param NUM
    non-negative-potentially-infinite-number-p
     * 		
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@param NUM\nnon-negative-potentially-infinite-number-p\r\n\t\t\r\n@return potentially-infinite-number-p")
    public static final SubLObject potentially_infinite_number_log_alt(SubLObject num, SubLObject base) {
        if (base == UNPROVIDED) {
            base = $e$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(num, NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P);
        if (ZERO_INTEGER.eql(num)) {
            return com.cyc.cycjava.cycl.number_utilities.negative_infinity();
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num)) {
                return com.cyc.cycjava.cycl.number_utilities.positive_infinity();
            } else {
                return log(num, base);
            }
        }
    }

    /**
     *
     *
     * @param NUM
    non-negative-potentially-infinite-number-p
     * 		
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@param NUM\nnon-negative-potentially-infinite-number-p\r\n\t\t\r\n@return potentially-infinite-number-p")
    public static SubLObject potentially_infinite_number_log(final SubLObject num, SubLObject base) {
        if (base == UNPROVIDED) {
            base = $e$.getGlobalValue();
        }
        assert NIL != non_negative_potentially_infinite_number_p(num) : "! number_utilities.non_negative_potentially_infinite_number_p(num) " + ("number_utilities.non_negative_potentially_infinite_number_p(num) " + "CommonSymbols.NIL != number_utilities.non_negative_potentially_infinite_number_p(num) ") + num;
        if (ZERO_INTEGER.eql(num)) {
            return negative_infinity();
        }
        if (NIL != positive_infinity_p(num)) {
            return positive_infinity();
        }
        return log(num, base);
    }

    /**
     *
     *
     * @param NUM
    potentially-infinite-number-p
     * 		
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@param NUM\npotentially-infinite-number-p\r\n\t\t\r\n@return potentially-infinite-number-p")
    public static final SubLObject potentially_infinite_number_exp_alt(SubLObject num) {
        SubLTrampolineFile.checkType(num, POTENTIALLY_INFINITE_NUMBER_P);
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num)) {
            return ZERO_INTEGER;
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num)) {
                return com.cyc.cycjava.cycl.number_utilities.positive_infinity();
            } else {
                return exp(num);
            }
        }
    }

    /**
     *
     *
     * @param NUM
    potentially-infinite-number-p
     * 		
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@param NUM\npotentially-infinite-number-p\r\n\t\t\r\n@return potentially-infinite-number-p")
    public static SubLObject potentially_infinite_number_exp(final SubLObject num) {
        assert NIL != potentially_infinite_number_p(num) : "! number_utilities.potentially_infinite_number_p(num) " + ("number_utilities.potentially_infinite_number_p(num) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num) ") + num;
        if (NIL != negative_infinity_p(num)) {
            return ZERO_INTEGER;
        }
        if (NIL != positive_infinity_p(num)) {
            return positive_infinity();
        }
        return exp(num);
    }

    /**
     * -INF + X = -INF by definition, unless X = +INF
     */
    @LispMethod(comment = "-INF + X = -INF by definition, unless X = +INF")
    public static final SubLObject negative_infinity_plus_alt(SubLObject num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num)) {
                    Errors.error($str_alt21$Can_t_add_positive_infinity_and_n);
                }
            }
            return $NEGATIVE_INFINITY;
        }
    }

    /**
     * -INF + X = -INF by definition, unless X = +INF
     */
    @LispMethod(comment = "-INF + X = -INF by definition, unless X = +INF")
    public static SubLObject negative_infinity_plus(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != positive_infinity_p(num))) {
            Errors.error($str23$Can_t_add_positive_infinity_and_n);
        }
        return $NEGATIVE_INFINITY;
    }

    /**
     * +INF + X = +INF by definition, unless X = -INF
     */
    @LispMethod(comment = "+INF + X = +INF by definition, unless X = -INF")
    public static final SubLObject positive_infinity_plus_alt(SubLObject num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num)) {
                    Errors.error($str_alt21$Can_t_add_positive_infinity_and_n);
                }
            }
            return $POSITIVE_INFINITY;
        }
    }

    /**
     * +INF + X = +INF by definition, unless X = -INF
     */
    @LispMethod(comment = "+INF + X = +INF by definition, unless X = -INF")
    public static SubLObject positive_infinity_plus(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != negative_infinity_p(num))) {
            Errors.error($str23$Can_t_add_positive_infinity_and_n);
        }
        return $POSITIVE_INFINITY;
    }

    /**
     * -INF - X = -INF by definition, unless X = -INF
     */
    @LispMethod(comment = "-INF - X = -INF by definition, unless X = -INF")
    public static final SubLObject negative_infinity_minus_alt(SubLObject num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num)) {
                    Errors.error($str_alt22$Can_t_subtract_negative_infinity_);
                }
            }
            return $NEGATIVE_INFINITY;
        }
    }

    /**
     * -INF - X = -INF by definition, unless X = -INF
     */
    @LispMethod(comment = "-INF - X = -INF by definition, unless X = -INF")
    public static SubLObject negative_infinity_minus(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != negative_infinity_p(num))) {
            Errors.error($str24$Can_t_subtract_negative_infinity_);
        }
        return $NEGATIVE_INFINITY;
    }

    /**
     * +INF - X = +INF by definition, unless X = +INF
     */
    @LispMethod(comment = "+INF - X = +INF by definition, unless X = +INF")
    public static final SubLObject positive_infinity_minus_alt(SubLObject num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num)) {
                    Errors.error($str_alt23$Can_t_subtract_positive_infinity_);
                }
            }
            return $POSITIVE_INFINITY;
        }
    }

    /**
     * +INF - X = +INF by definition, unless X = +INF
     */
    @LispMethod(comment = "+INF - X = +INF by definition, unless X = +INF")
    public static SubLObject positive_infinity_minus(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != positive_infinity_p(num))) {
            Errors.error($str25$Can_t_subtract_positive_infinity_);
        }
        return $POSITIVE_INFINITY;
    }

    /**
     * -INF * X = (+/-)INF depending on sign of X, unless X = 0
     */
    @LispMethod(comment = "-INF * X = (+/-)INF depending on sign of X, unless X = 0")
    public static final SubLObject negative_infinity_times_alt(SubLObject num) {
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_potentially_infinite_number_p(num)) {
            return $POSITIVE_INFINITY;
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.zero_number_p(num)) {
                Errors.error($str_alt24$Can_t_multiply_infinity_and_zero);
            } else {
                return $NEGATIVE_INFINITY;
            }
        }
        return NIL;
    }

    /**
     * -INF * X = (+/-)INF depending on sign of X, unless X = 0
     */
    @LispMethod(comment = "-INF * X = (+/-)INF depending on sign of X, unless X = 0")
    public static SubLObject negative_infinity_times(final SubLObject num) {
        if (NIL != negative_potentially_infinite_number_p(num)) {
            return $POSITIVE_INFINITY;
        }
        if (NIL != zero_number_p(num)) {
            Errors.error($str26$Can_t_multiply_infinity_and_zero);
            return NIL;
        }
        return $NEGATIVE_INFINITY;
    }

    /**
     * +INF * X = (+/-)INF depending on sign of X, unless X = 0
     */
    @LispMethod(comment = "+INF * X = (+/-)INF depending on sign of X, unless X = 0")
    public static final SubLObject positive_infinity_times_alt(SubLObject num) {
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_potentially_infinite_number_p(num)) {
            return $NEGATIVE_INFINITY;
        } else {
            if (ZERO_INTEGER.eql(num)) {
                Errors.error($str_alt24$Can_t_multiply_infinity_and_zero);
            } else {
                return $POSITIVE_INFINITY;
            }
        }
        return NIL;
    }

    /**
     * +INF * X = (+/-)INF depending on sign of X, unless X = 0
     */
    @LispMethod(comment = "+INF * X = (+/-)INF depending on sign of X, unless X = 0")
    public static SubLObject positive_infinity_times(final SubLObject num) {
        if (NIL != negative_potentially_infinite_number_p(num)) {
            return $NEGATIVE_INFINITY;
        }
        if (ZERO_INTEGER.eql(num)) {
            Errors.error($str26$Can_t_multiply_infinity_and_zero);
            return NIL;
        }
        return $POSITIVE_INFINITY;
    }

    /**
     * -INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF
     * Assumes that X != 0
     */
    @LispMethod(comment = "-INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF\r\nAssumes that X != 0\n-INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF\nAssumes that X != 0")
    public static final SubLObject negative_infinity_X_alt(SubLObject num) {
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num)) {
            Errors.error($str_alt25$Can_t_divide_negative_infinity_by);
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num)) {
                Errors.error($str_alt26$Can_t_divide_negative_infinity_by);
            } else {
                return com.cyc.cycjava.cycl.number_utilities.negative_infinity_times(num);
            }
        }
        return NIL;
    }

    /**
     * -INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF
     * Assumes that X != 0
     */
    @LispMethod(comment = "-INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF\r\nAssumes that X != 0\n-INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF\nAssumes that X != 0")
    public static SubLObject negative_infinity_X(final SubLObject num) {
        if (NIL != negative_infinity_p(num)) {
            Errors.error($str27$Can_t_divide_negative_infinity_by);
        } else {
            if (NIL == positive_infinity_p(num)) {
                return negative_infinity_times(num);
            }
            Errors.error($str28$Can_t_divide_negative_infinity_by);
        }
        return NIL;
    }

    /**
     * +INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF
     * Assumes that X != 0
     */
    @LispMethod(comment = "+INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF\r\nAssumes that X != 0\n+INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF\nAssumes that X != 0")
    public static final SubLObject positive_infinity_X_alt(SubLObject num) {
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num)) {
            Errors.error($str_alt27$Can_t_divide_positive_infinity_by);
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num)) {
                Errors.error($str_alt28$Can_t_divide_positive_infinity_by);
            } else {
                return com.cyc.cycjava.cycl.number_utilities.positive_infinity_times(num);
            }
        }
        return NIL;
    }

    /**
     * +INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF
     * Assumes that X != 0
     */
    @LispMethod(comment = "+INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF\r\nAssumes that X != 0\n+INF / X = (+/-)INF depending on sign of X, unless X = (+/-)INF\nAssumes that X != 0")
    public static SubLObject positive_infinity_X(final SubLObject num) {
        if (NIL != negative_infinity_p(num)) {
            Errors.error($str29$Can_t_divide_positive_infinity_by);
        } else {
            if (NIL == positive_infinity_p(num)) {
                return positive_infinity_times(num);
            }
            Errors.error($str30$Can_t_divide_positive_infinity_by);
        }
        return NIL;
    }

    public static final SubLObject divided_by_negative_infinity_alt(SubLObject num) {
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num)) {
            Errors.error($str_alt25$Can_t_divide_negative_infinity_by);
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num)) {
                Errors.error($str_alt27$Can_t_divide_positive_infinity_by);
            } else {
                return ZERO_INTEGER;
            }
        }
        return NIL;
    }

    public static SubLObject divided_by_negative_infinity(final SubLObject num) {
        if (NIL != negative_infinity_p(num)) {
            Errors.error($str27$Can_t_divide_negative_infinity_by);
        } else {
            if (NIL == positive_infinity_p(num)) {
                return ZERO_INTEGER;
            }
            Errors.error($str29$Can_t_divide_positive_infinity_by);
        }
        return NIL;
    }

    public static final SubLObject divided_by_positive_infinity_alt(SubLObject num) {
        if (NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(num)) {
            Errors.error($str_alt26$Can_t_divide_negative_infinity_by);
        } else {
            if (NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(num)) {
                Errors.error($str_alt28$Can_t_divide_positive_infinity_by);
            } else {
                return ZERO_INTEGER;
            }
        }
        return NIL;
    }

    public static SubLObject divided_by_positive_infinity(final SubLObject num) {
        if (NIL != negative_infinity_p(num)) {
            Errors.error($str28$Can_t_divide_negative_infinity_by);
        } else {
            if (NIL == positive_infinity_p(num)) {
                return ZERO_INTEGER;
            }
            Errors.error($str30$Can_t_divide_positive_infinity_by);
        }
        return NIL;
    }

    public static final SubLObject extended_potentially_infinite_number_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != extended_number_p(v_object)) || (NIL != com.cyc.cycjava.cycl.number_utilities.infinite_number_p(v_object)));
    }

    public static SubLObject extended_potentially_infinite_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != extended_numbers.extended_number_p(v_object)) || (NIL != infinite_number_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_integer_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isInteger() || (NIL != com.cyc.cycjava.cycl.number_utilities.infinite_integer_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_integer_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() || (NIL != infinite_integer_p(v_object)));
    }

    public static final SubLObject infinite_integer_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.number_utilities.infinite_number_p(v_object);
    }

    public static SubLObject infinite_integer_p(final SubLObject v_object) {
        return infinite_number_p(v_object);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject negative_potentially_infinite_integer_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.negative_infinity_p(v_object)) || (NIL != negative_integer_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject negative_potentially_infinite_integer_p(final SubLObject v_object) {
        return makeBoolean((NIL != negative_infinity_p(v_object)) || (NIL != subl_promotions.negative_integer_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject positive_potentially_infinite_integer_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.positive_infinity_p(v_object)) || (NIL != positive_integer_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject positive_potentially_infinite_integer_p(final SubLObject v_object) {
        return makeBoolean((NIL != positive_infinity_p(v_object)) || (NIL != subl_promotions.positive_integer_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_integer_E_alt(SubLObject int1, SubLObject int2) {
        SubLTrampolineFile.checkType(int1, POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(int2, POTENTIALLY_INFINITE_INTEGER_P);
        return eql(int1, int2);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_integer_E(final SubLObject int1, final SubLObject int2) {
        assert NIL != potentially_infinite_integer_p(int1) : "! number_utilities.potentially_infinite_integer_p(int1) " + ("number_utilities.potentially_infinite_integer_p(int1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int1) ") + int1;
        assert NIL != potentially_infinite_integer_p(int2) : "! number_utilities.potentially_infinite_integer_p(int2) " + ("number_utilities.potentially_infinite_integer_p(int2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int2) ") + int2;
        return eql(int1, int2);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_integer_L_alt(SubLObject int1, SubLObject int2) {
        SubLTrampolineFile.checkType(int1, POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(int2, POTENTIALLY_INFINITE_INTEGER_P);
        return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_L(int1, int2);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_integer_L(final SubLObject int1, final SubLObject int2) {
        assert NIL != potentially_infinite_integer_p(int1) : "! number_utilities.potentially_infinite_integer_p(int1) " + ("number_utilities.potentially_infinite_integer_p(int1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int1) ") + int1;
        assert NIL != potentially_infinite_integer_p(int2) : "! number_utilities.potentially_infinite_integer_p(int2) " + ("number_utilities.potentially_infinite_integer_p(int2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int2) ") + int2;
        return potentially_infinite_number_L(int1, int2);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_integer_G_alt(SubLObject int1, SubLObject int2) {
        return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_integer_L(int2, int1);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_integer_G(final SubLObject int1, final SubLObject int2) {
        return potentially_infinite_integer_L(int2, int1);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_integer_LE_alt(SubLObject int1, SubLObject int2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_integer_E(int1, int2)) || (NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_integer_L(int1, int2)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_integer_LE(final SubLObject int1, final SubLObject int2) {
        return makeBoolean((NIL != potentially_infinite_integer_E(int1, int2)) || (NIL != potentially_infinite_integer_L(int1, int2)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_infinite_integer_GE_alt(SubLObject int1, SubLObject int2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_integer_E(int1, int2)) || (NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_integer_G(int1, int2)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_infinite_integer_GE(final SubLObject int1, final SubLObject int2) {
        return makeBoolean((NIL != potentially_infinite_integer_E(int1, int2)) || (NIL != potentially_infinite_integer_G(int1, int2)));
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p")
    public static final SubLObject potentially_infinite_integer_plus_alt(SubLObject int1, SubLObject int2) {
        SubLTrampolineFile.checkType(int1, POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(int2, POTENTIALLY_INFINITE_INTEGER_P);
        return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_plus(int1, int2);
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p")
    public static SubLObject potentially_infinite_integer_plus(final SubLObject int1, final SubLObject int2) {
        assert NIL != potentially_infinite_integer_p(int1) : "! number_utilities.potentially_infinite_integer_p(int1) " + ("number_utilities.potentially_infinite_integer_p(int1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int1) ") + int1;
        assert NIL != potentially_infinite_integer_p(int2) : "! number_utilities.potentially_infinite_integer_p(int2) " + ("number_utilities.potentially_infinite_integer_p(int2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int2) ") + int2;
        return potentially_infinite_number_plus(int1, int2);
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p")
    public static final SubLObject potentially_infinite_integer_minus_alt(SubLObject int1, SubLObject int2) {
        SubLTrampolineFile.checkType(int1, POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(int2, POTENTIALLY_INFINITE_INTEGER_P);
        return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_minus(int1, int2);
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p")
    public static SubLObject potentially_infinite_integer_minus(final SubLObject int1, final SubLObject int2) {
        assert NIL != potentially_infinite_integer_p(int1) : "! number_utilities.potentially_infinite_integer_p(int1) " + ("number_utilities.potentially_infinite_integer_p(int1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int1) ") + int1;
        assert NIL != potentially_infinite_integer_p(int2) : "! number_utilities.potentially_infinite_integer_p(int2) " + ("number_utilities.potentially_infinite_integer_p(int2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int2) ") + int2;
        return potentially_infinite_number_minus(int1, int2);
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p")
    public static final SubLObject potentially_infinite_integer_times_alt(SubLObject int1, SubLObject int2) {
        SubLTrampolineFile.checkType(int1, POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(int2, POTENTIALLY_INFINITE_INTEGER_P);
        return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_times(int1, int2);
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p")
    public static SubLObject potentially_infinite_integer_times(final SubLObject int1, final SubLObject int2) {
        assert NIL != potentially_infinite_integer_p(int1) : "! number_utilities.potentially_infinite_integer_p(int1) " + ("number_utilities.potentially_infinite_integer_p(int1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int1) ") + int1;
        assert NIL != potentially_infinite_integer_p(int2) : "! number_utilities.potentially_infinite_integer_p(int2) " + ("number_utilities.potentially_infinite_integer_p(int2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int2) ") + int2;
        return potentially_infinite_number_times(int1, int2);
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p; a truncated version of (INT1 * NUM2)
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p; a truncated version of (INT1 * NUM2)")
    public static final SubLObject potentially_infinite_integer_times_number_rounded_alt(SubLObject int1, SubLObject num2) {
        SubLTrampolineFile.checkType(int1, POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        {
            SubLObject raw_product = com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_times(int1, num2);
            if (NIL != com.cyc.cycjava.cycl.number_utilities.infinite_number_p(raw_product)) {
                return raw_product;
            } else {
                return truncate(raw_product, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p; a truncated version of (INT1 * NUM2)
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p; a truncated version of (INT1 * NUM2)")
    public static SubLObject potentially_infinite_integer_times_number_rounded(final SubLObject int1, final SubLObject num2) {
        assert NIL != potentially_infinite_integer_p(int1) : "! number_utilities.potentially_infinite_integer_p(int1) " + ("number_utilities.potentially_infinite_integer_p(int1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int1) ") + int1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        final SubLObject raw_product = potentially_infinite_number_times(int1, num2);
        if (NIL != infinite_number_p(raw_product)) {
            return raw_product;
        }
        return truncate(raw_product, UNPROVIDED);
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static final SubLObject potentially_infinite_integer_divided_by_alt(SubLObject int1, SubLObject int2) {
        SubLTrampolineFile.checkType(int1, POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(int2, POTENTIALLY_INFINITE_INTEGER_P);
        return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_divided_by(int1, int2);
    }

    /**
     *
     *
     * @return potentially-infinite-number-p
     */
    @LispMethod(comment = "@return potentially-infinite-number-p")
    public static SubLObject potentially_infinite_integer_divided_by(final SubLObject int1, final SubLObject int2) {
        assert NIL != potentially_infinite_integer_p(int1) : "! number_utilities.potentially_infinite_integer_p(int1) " + ("number_utilities.potentially_infinite_integer_p(int1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int1) ") + int1;
        assert NIL != potentially_infinite_integer_p(int2) : "! number_utilities.potentially_infinite_integer_p(int2) " + ("number_utilities.potentially_infinite_integer_p(int2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int2) ") + int2;
        return potentially_infinite_number_divided_by(int1, int2);
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p; a truncated version of (INT1 / NUM2)
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p; a truncated version of (INT1 / NUM2)")
    public static final SubLObject potentially_infinite_integer_divided_by_number_rounded_alt(SubLObject int1, SubLObject num2) {
        SubLTrampolineFile.checkType(int1, POTENTIALLY_INFINITE_INTEGER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_INFINITE_NUMBER_P);
        {
            SubLObject raw_product = com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_divided_by(int1, num2);
            if (NIL != com.cyc.cycjava.cycl.number_utilities.infinite_number_p(raw_product)) {
                return raw_product;
            } else {
                return truncate(raw_product, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @return potentially-infinite-integer-p; a truncated version of (INT1 / NUM2)
     */
    @LispMethod(comment = "@return potentially-infinite-integer-p; a truncated version of (INT1 / NUM2)")
    public static SubLObject potentially_infinite_integer_divided_by_number_rounded(final SubLObject int1, final SubLObject num2) {
        assert NIL != potentially_infinite_integer_p(int1) : "! number_utilities.potentially_infinite_integer_p(int1) " + ("number_utilities.potentially_infinite_integer_p(int1) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_integer_p(int1) ") + int1;
        assert NIL != potentially_infinite_number_p(num2) : "! number_utilities.potentially_infinite_number_p(num2) " + ("number_utilities.potentially_infinite_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_infinite_number_p(num2) ") + num2;
        final SubLObject raw_product = potentially_infinite_number_divided_by(int1, num2);
        if (NIL != infinite_number_p(raw_product)) {
            return raw_product;
        }
        return truncate(raw_product, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject potentially_undefined_number_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_p(v_object)) || (NIL != com.cyc.cycjava.cycl.number_utilities.undefined(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject potentially_undefined_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != potentially_infinite_number_p(v_object)) || (NIL != undefined(v_object)));
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject undefined_alt(SubLObject v_object) {
        return eq(v_object, $UNDEFINED);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject undefined(final SubLObject v_object) {
        return eq(v_object, $UNDEFINED);
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static final SubLObject potentially_undefined_number_E_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_UNDEFINED_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_UNDEFINED_NUMBER_P);
        if ((NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num1)) || (NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num2))) {
            return $UNDEFINED;
        } else {
            return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_E(num1, num2);
        }
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static SubLObject potentially_undefined_number_E(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_undefined_number_p(num1) : "! number_utilities.potentially_undefined_number_p(num1) " + ("number_utilities.potentially_undefined_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num1) ") + num1;
        assert NIL != potentially_undefined_number_p(num2) : "! number_utilities.potentially_undefined_number_p(num2) " + ("number_utilities.potentially_undefined_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num2) ") + num2;
        if ((NIL != undefined(num1)) || (NIL != undefined(num2))) {
            return $UNDEFINED;
        }
        return potentially_infinite_number_E(num1, num2);
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static final SubLObject potentially_undefined_number_L_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_UNDEFINED_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_UNDEFINED_NUMBER_P);
        if ((NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num1)) || (NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num2))) {
            return $UNDEFINED;
        } else {
            return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_L(num1, num2);
        }
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static SubLObject potentially_undefined_number_L(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_undefined_number_p(num1) : "! number_utilities.potentially_undefined_number_p(num1) " + ("number_utilities.potentially_undefined_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num1) ") + num1;
        assert NIL != potentially_undefined_number_p(num2) : "! number_utilities.potentially_undefined_number_p(num2) " + ("number_utilities.potentially_undefined_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num2) ") + num2;
        if ((NIL != undefined(num1)) || (NIL != undefined(num2))) {
            return $UNDEFINED;
        }
        return potentially_infinite_number_L(num1, num2);
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static final SubLObject potentially_undefined_number_G_alt(SubLObject num1, SubLObject num2) {
        return com.cyc.cycjava.cycl.number_utilities.potentially_undefined_number_L(num2, num1);
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static SubLObject potentially_undefined_number_G(final SubLObject num1, final SubLObject num2) {
        return potentially_undefined_number_L(num2, num1);
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static final SubLObject potentially_undefined_number_LE_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_UNDEFINED_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_UNDEFINED_NUMBER_P);
        if ((NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num1)) || (NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num2))) {
            return $UNDEFINED;
        } else {
            return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_LE(num1, num2);
        }
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static SubLObject potentially_undefined_number_LE(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_undefined_number_p(num1) : "! number_utilities.potentially_undefined_number_p(num1) " + ("number_utilities.potentially_undefined_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num1) ") + num1;
        assert NIL != potentially_undefined_number_p(num2) : "! number_utilities.potentially_undefined_number_p(num2) " + ("number_utilities.potentially_undefined_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num2) ") + num2;
        if ((NIL != undefined(num1)) || (NIL != undefined(num2))) {
            return $UNDEFINED;
        }
        return potentially_infinite_number_LE(num1, num2);
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static final SubLObject potentially_undefined_number_GE_alt(SubLObject num1, SubLObject num2) {
        return com.cyc.cycjava.cycl.number_utilities.potentially_undefined_number_LE(num2, num1);
    }

    /**
     *
     *
     * @return booleanp or undefined
     */
    @LispMethod(comment = "@return booleanp or undefined")
    public static SubLObject potentially_undefined_number_GE(final SubLObject num1, final SubLObject num2) {
        return potentially_undefined_number_LE(num2, num1);
    }

    /**
     *
     *
     * @return potentially-undefined-number-p
     */
    @LispMethod(comment = "@return potentially-undefined-number-p")
    public static final SubLObject potentially_undefined_number_plus_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_UNDEFINED_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_UNDEFINED_NUMBER_P);
        if ((NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num1)) || (NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num2))) {
            return $UNDEFINED;
        } else {
            return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_plus(num1, num2);
        }
    }

    /**
     *
     *
     * @return potentially-undefined-number-p
     */
    @LispMethod(comment = "@return potentially-undefined-number-p")
    public static SubLObject potentially_undefined_number_plus(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_undefined_number_p(num1) : "! number_utilities.potentially_undefined_number_p(num1) " + ("number_utilities.potentially_undefined_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num1) ") + num1;
        assert NIL != potentially_undefined_number_p(num2) : "! number_utilities.potentially_undefined_number_p(num2) " + ("number_utilities.potentially_undefined_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num2) ") + num2;
        if ((NIL != undefined(num1)) || (NIL != undefined(num2))) {
            return $UNDEFINED;
        }
        return potentially_infinite_number_plus(num1, num2);
    }

    /**
     *
     *
     * @return potentially-undefined-number-p
     */
    @LispMethod(comment = "@return potentially-undefined-number-p")
    public static final SubLObject potentially_undefined_number_minus_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_UNDEFINED_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_UNDEFINED_NUMBER_P);
        if ((NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num1)) || (NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num2))) {
            return $UNDEFINED;
        } else {
            return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_minus(num1, num2);
        }
    }

    /**
     *
     *
     * @return potentially-undefined-number-p
     */
    @LispMethod(comment = "@return potentially-undefined-number-p")
    public static SubLObject potentially_undefined_number_minus(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_undefined_number_p(num1) : "! number_utilities.potentially_undefined_number_p(num1) " + ("number_utilities.potentially_undefined_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num1) ") + num1;
        assert NIL != potentially_undefined_number_p(num2) : "! number_utilities.potentially_undefined_number_p(num2) " + ("number_utilities.potentially_undefined_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num2) ") + num2;
        if ((NIL != undefined(num1)) || (NIL != undefined(num2))) {
            return $UNDEFINED;
        }
        return potentially_infinite_number_minus(num1, num2);
    }

    /**
     *
     *
     * @return potentially-undefined-number-p
     */
    @LispMethod(comment = "@return potentially-undefined-number-p")
    public static final SubLObject potentially_undefined_number_times_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_UNDEFINED_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_UNDEFINED_NUMBER_P);
        if ((NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num1)) || (NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num2))) {
            return $UNDEFINED;
        } else {
            return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_times(num1, num2);
        }
    }

    /**
     *
     *
     * @return potentially-undefined-number-p
     */
    @LispMethod(comment = "@return potentially-undefined-number-p")
    public static SubLObject potentially_undefined_number_times(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_undefined_number_p(num1) : "! number_utilities.potentially_undefined_number_p(num1) " + ("number_utilities.potentially_undefined_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num1) ") + num1;
        assert NIL != potentially_undefined_number_p(num2) : "! number_utilities.potentially_undefined_number_p(num2) " + ("number_utilities.potentially_undefined_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num2) ") + num2;
        if ((NIL != undefined(num1)) || (NIL != undefined(num2))) {
            return $UNDEFINED;
        }
        return potentially_infinite_number_times(num1, num2);
    }

    /**
     *
     *
     * @return potentially-undefined-number-p
     */
    @LispMethod(comment = "@return potentially-undefined-number-p")
    public static final SubLObject potentially_undefined_number_divided_by_alt(SubLObject num1, SubLObject num2) {
        SubLTrampolineFile.checkType(num1, POTENTIALLY_UNDEFINED_NUMBER_P);
        SubLTrampolineFile.checkType(num2, POTENTIALLY_UNDEFINED_NUMBER_P);
        if ((NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num1)) || (NIL != com.cyc.cycjava.cycl.number_utilities.undefined(num2))) {
            return $UNDEFINED;
        } else {
            if ((NIL != com.cyc.cycjava.cycl.number_utilities.zero_number_p(num1)) && (NIL != com.cyc.cycjava.cycl.number_utilities.zero_number_p(num2))) {
                return $UNDEFINED;
            } else {
                return com.cyc.cycjava.cycl.number_utilities.potentially_infinite_number_divided_by(num1, num2);
            }
        }
    }

    /**
     *
     *
     * @return potentially-undefined-number-p
     */
    @LispMethod(comment = "@return potentially-undefined-number-p")
    public static SubLObject potentially_undefined_number_divided_by(final SubLObject num1, final SubLObject num2) {
        assert NIL != potentially_undefined_number_p(num1) : "! number_utilities.potentially_undefined_number_p(num1) " + ("number_utilities.potentially_undefined_number_p(num1) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num1) ") + num1;
        assert NIL != potentially_undefined_number_p(num2) : "! number_utilities.potentially_undefined_number_p(num2) " + ("number_utilities.potentially_undefined_number_p(num2) " + "CommonSymbols.NIL != number_utilities.potentially_undefined_number_p(num2) ") + num2;
        if ((NIL != undefined(num1)) || (NIL != undefined(num2))) {
            return $UNDEFINED;
        }
        if ((NIL != zero_number_p(num1)) && (NIL != zero_number_p(num2))) {
            return $UNDEFINED;
        }
        return potentially_infinite_number_divided_by(num1, num2);
    }

    /**
     *
     *
     * @param ITEMS
    listp
     * 		
     * @param KEY
     * 		fboundp; a unary function that will return a numberp when applied to any item in ITEMS
     * 		Returns the maximal element of ITEMS
     */
    @LispMethod(comment = "@param ITEMS\nlistp\r\n\t\t\r\n@param KEY\r\n\t\tfboundp; a unary function that will return a numberp when applied to any item in ITEMS\r\n\t\tReturns the maximal element of ITEMS")
    public static final SubLObject maximum_alt(SubLObject items, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt32$Cannot_compute_the_maximum_of_an_);
                }
            }
            if ((key == symbol_function(IDENTITY)) || (key == IDENTITY)) {
                {
                    SubLObject maximum = items.first();
                    SubLObject cdolist_list_var = items.rest();
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        if (item.numG(maximum)) {
                            maximum = item;
                        }
                    }
                    return maximum;
                }
            } else {
                return list_utilities.extremal(items, symbol_function($sym33$_), key);
            }
        }
    }

    /**
     *
     *
     * @param ITEMS
    listp
     * 		
     * @param KEY
     * 		fboundp; a unary function that will return a numberp when applied to any item in ITEMS
     * 		Returns the maximal element of ITEMS
     */
    @LispMethod(comment = "@param ITEMS\nlistp\r\n\t\t\r\n@param KEY\r\n\t\tfboundp; a unary function that will return a numberp when applied to any item in ITEMS\r\n\t\tReturns the maximal element of ITEMS")
    public static SubLObject maximum(final SubLObject items, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str34$Cannot_compute_the_maximum_of_an_);
        }
        if (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) {
            SubLObject maximum = items.first();
            SubLObject cdolist_list_var = items.rest();
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (item.numG(maximum)) {
                    maximum = item;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            return maximum;
        }
        return list_utilities.extremal(items, symbol_function($sym35$_), key);
    }

    /**
     *
     *
     * @param ITEMS
    listp
     * 		
     * @param KEY
     * 		fboundp; a unary function that will return a numberp when applied to any item in ITEMS
     * 		Returns the minimal element of ITEMS
     */
    @LispMethod(comment = "@param ITEMS\nlistp\r\n\t\t\r\n@param KEY\r\n\t\tfboundp; a unary function that will return a numberp when applied to any item in ITEMS\r\n\t\tReturns the minimal element of ITEMS")
    public static final SubLObject minimum_alt(SubLObject items, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt34$Cannot_compute_the_minimum_of_an_);
                }
            }
            if ((key == symbol_function(IDENTITY)) || (key == IDENTITY)) {
                {
                    SubLObject minimum = items.first();
                    SubLObject cdolist_list_var = items.rest();
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        if (item.numL(minimum)) {
                            minimum = item;
                        }
                    }
                    return minimum;
                }
            } else {
                return list_utilities.extremal(items, symbol_function($sym35$_), key);
            }
        }
    }

    /**
     *
     *
     * @param ITEMS
    listp
     * 		
     * @param KEY
     * 		fboundp; a unary function that will return a numberp when applied to any item in ITEMS
     * 		Returns the minimal element of ITEMS
     */
    @LispMethod(comment = "@param ITEMS\nlistp\r\n\t\t\r\n@param KEY\r\n\t\tfboundp; a unary function that will return a numberp when applied to any item in ITEMS\r\n\t\tReturns the minimal element of ITEMS")
    public static SubLObject minimum(final SubLObject items, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str36$Cannot_compute_the_minimum_of_an_);
        }
        if (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) {
            SubLObject minimum = items.first();
            SubLObject cdolist_list_var = items.rest();
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (item.numL(minimum)) {
                    minimum = item;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            return minimum;
        }
        return list_utilities.extremal(items, symbol_function($sym37$_), key);
    }

    public static final SubLObject average_alt(SubLObject items, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (items.isCons()) {
            {
                SubLObject sum = ZERO_INTEGER;
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    sum = add(sum, funcall(key, item));
                }
                return sublisp_float(divide(sum, length(items)), UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject average(final SubLObject items, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (items.isCons()) {
            SubLObject sum = ZERO_INTEGER;
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sum = add(sum, funcall(key, item));
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            return sublisp_float(divide(sum, length(items)), UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return numberp\r\n@unknown yogman")
    public static final SubLObject mean_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt36$Cannot_compute_the_mean_of_an_ato);
                }
            }
            {
                SubLObject total = ZERO_INTEGER;
                SubLObject num_items = ZERO_INTEGER;
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    total = add(total, item);
                    num_items = add(num_items, ONE_INTEGER);
                }
                return divide(total, num_items);
            }
        }
    }

    /**
     *
     *
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return numberp\r\n@unknown yogman")
    public static SubLObject mean(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str38$Cannot_compute_the_mean_of_an_ato);
        }
        SubLObject total = ZERO_INTEGER;
        SubLObject num_items = ZERO_INTEGER;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total = add(total, item);
            num_items = add(num_items, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return divide(total, num_items);
    }

    /**
     *
     *
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return numberp
     * @unknown pace
     */
    @LispMethod(comment = "@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return numberp\r\n@unknown pace")
    public static final SubLObject summation_alt(SubLObject items) {
        {
            SubLObject sum = ZERO_INTEGER;
            SubLObject cdolist_list_var = items;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                sum = add(sum, item);
            }
            return sum;
        }
    }

    /**
     *
     *
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return numberp
     * @unknown pace
     */
    @LispMethod(comment = "@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return numberp\r\n@unknown pace")
    public static SubLObject summation(final SubLObject items) {
        SubLObject sum = ZERO_INTEGER;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sum = add(sum, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return sum;
    }

    public static SubLObject product(final SubLObject items) {
        SubLObject product = ONE_INTEGER;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            product = multiply(product, item);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return product;
    }

    /**
     *
     *
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return numberp\r\n@unknown yogman")
    public static final SubLObject geometric_mean_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt37$Cannot_compute_the_geometric_mean);
                }
            }
            {
                SubLObject v_answer = ONE_INTEGER;
                SubLObject length = ZERO_INTEGER;
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    v_answer = multiply(v_answer, item);
                    length = add(length, ONE_INTEGER);
                }
                return expt(v_answer, invert(length));
            }
        }
    }

    /**
     *
     *
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return numberp\r\n@unknown yogman")
    public static SubLObject geometric_mean(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str39$Cannot_compute_the_geometric_mean);
        }
        final SubLObject product = product(items);
        final SubLObject total = length(items);
        return expt(product, invert(total));
    }

    /**
     *
     *
     * @param ITEMS
     * 		listp; a list of numbers (numberp)
     * @param KEY;
     * 		a key to apply to items before sorting.
     * 		If KEY is provided, and ITEMS are non-numeric, then ITEMS must be of odd length.
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param ITEMS\r\n\t\tlistp; a list of numbers (numberp)\r\n@param KEY;\r\n\t\ta key to apply to items before sorting.\r\n\t\tIf KEY is provided, and ITEMS are non-numeric, then ITEMS must be of odd length.\r\n@return numberp\r\n@unknown yogman")
    public static final SubLObject median(SubLObject items, SubLObject key) {
        if (key == UNPROVIDED) {
            key = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt38$Cannot_compute_the_median_of_an_a);
                }
            }
            {
                SubLObject sorted_items = (NIL != key) ? ((SubLObject) (Sort.sort(copy_list(items), symbol_function($sym35$_), key))) : Sort.sort(copy_list(items), symbol_function($sym35$_), UNPROVIDED);
                return com.cyc.cycjava.cycl.number_utilities.median_sorted(sorted_items, UNPROVIDED);
            }
        }
    }

    public static SubLObject median(final SubLObject items, SubLObject key, SubLObject v_return) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (v_return == UNPROVIDED) {
            v_return = $VALUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str41$Cannot_compute_the_median_of_an_a);
        }
        final SubLObject sorted_items = Sort.sort(copy_list(items), symbol_function($sym37$_), key);
        return median_sorted(sorted_items, length(sorted_items), key, v_return);
    }

    /**
     * This will simply access the middle of the list of items
     * or average the two middle items in the case of an evenp length
     *
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "This will simply access the middle of the list of items\r\nor average the two middle items in the case of an evenp length\r\n\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return numberp\r\n@unknown yogman\nThis will simply access the middle of the list of items\nor average the two middle items in the case of an evenp length")
    public static final SubLObject median_sorted(SubLObject items, SubLObject length) {
        if (length == UNPROVIDED) {
            length = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt38$Cannot_compute_the_median_of_an_a);
                }
            }
            if (NIL == length) {
                length = length(items);
            }
            {
                SubLObject middle_position = integerDivide(length, TWO_INTEGER);
                return NIL != oddp(length) ? ((SubLObject) (nth(middle_position, items))) : divide(add(nth(middle_position, items), nth(subtract(middle_position, ONE_INTEGER), items)), TWO_INTEGER);
            }
        }
    }

    public static SubLObject median_sorted(final SubLObject items, SubLObject length, SubLObject key, SubLObject v_return) {
        if (length == UNPROVIDED) {
            length = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (v_return == UNPROVIDED) {
            v_return = $VALUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str41$Cannot_compute_the_median_of_an_a);
        }
        if (NIL == length) {
            length = length(items);
        }
        final SubLObject middle_position = integerDivide(length, TWO_INTEGER);
        final SubLObject middle_item = nth(middle_position, items);
        final SubLObject pcase_var = v_return;
        if (pcase_var.eql($ITEM)) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == oddp(length))) {
                Errors.error($str43$Can_t_return_middle_item_from_an_);
            }
            return middle_item;
        }
        if (pcase_var.eql($VALUE)) {
            return NIL != oddp(length) ? funcall(key, middle_item) : mean(list(funcall(key, middle_item), funcall(key, nth(subtract(middle_position, ONE_INTEGER), items))));
        }
        Errors.error($str44$Unrecognized_RETURN_type__S, v_return);
        return NIL;
    }

    /**
     * Return the first item in ITEMS known to better than PERCENT
     * of the others in ITEMS
     *
     * @param items
     * 		list; a list of numbers (numberp)
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "Return the first item in ITEMS known to better than PERCENT\r\nof the others in ITEMS\r\n\r\n@param items\r\n\t\tlist; a list of numbers (numberp)\r\n@return numberp\r\n@unknown yogman\nReturn the first item in ITEMS known to better than PERCENT\nof the others in ITEMS")
    public static final SubLObject percentile(SubLObject items, SubLObject percent, SubLObject sort_method) {
        if (sort_method == UNPROVIDED) {
            sort_method = $sym35$_;
        }
        return com.cyc.cycjava.cycl.number_utilities.percentile_sorted(Sort.sort(copy_list(items), sort_method, UNPROVIDED), percent);
    }

    public static SubLObject percentile(final SubLObject items, final SubLObject percent, SubLObject sort_method, SubLObject key) {
        if (sort_method == UNPROVIDED) {
            sort_method = $sym37$_;
        }
        if (key == UNPROVIDED) {
            key = IDENTITY;
        }
        return percentile_sorted(Sort.sort(copy_list(items), sort_method, key), percent);
    }

    /**
     * This returns the item which is known to be past PERCENT of the items in ITEMS.
     *
     * @param items
     * 		list; a sorted list of numbers (numberp)
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "This returns the item which is known to be past PERCENT of the items in ITEMS.\r\n\r\n@param items\r\n\t\tlist; a sorted list of numbers (numberp)\r\n@return numberp\r\n@unknown yogman")
    public static final SubLObject percentile_sorted_alt(SubLObject items, SubLObject percent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(percent, PERCENTILE_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt40$Cannot_compute_the_percentile_of_);
                }
            }
            {
                SubLObject total = length(items);
                SubLObject index = truncate(multiply(total, percent), UNPROVIDED);
                return nth(index, items);
            }
        }
    }

    @LispMethod(comment = "This returns the item which is known to be past PERCENT of the items in ITEMS.\r\n\r\n@param items\r\n\t\tlist; a sorted list of numbers (numberp)\r\n@return numberp\r\n@unknown yogman")
    public static SubLObject percentile_sorted(final SubLObject items, final SubLObject percent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != percentile_p(percent) : "! number_utilities.percentile_p(percent) " + ("number_utilities.percentile_p(percent) " + "CommonSymbols.NIL != number_utilities.percentile_p(percent) ") + percent;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str46$Cannot_compute_the_percentile_of_);
        }
        final SubLObject total = length(items);
        final SubLObject index = truncate(multiply(total, percent), UNPROVIDED);
        return nth(index, items);
    }

    public static final SubLObject max_key_from_hash_alt(SubLObject hashtable) {
        {
            SubLObject max_count = ZERO_INTEGER;
            SubLObject best_key = NIL;
            SubLObject key = NIL;
            SubLObject val = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        val = getEntryValue(cdohash_entry);
                        if (val.numG(max_count)) {
                            max_count = val;
                            best_key = key;
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
            return best_key;
        }
    }

    public static SubLObject max_key_from_hash(final SubLObject hashtable) {
        SubLObject max_count = ZERO_INTEGER;
        SubLObject best_key = NIL;
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hashtable);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if (val.numG(max_count)) {
                    max_count = val;
                    best_key = key;
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return best_key;
    }

    /**
     *
     *
     * @param items
    listp
     * 		
     * @return an a-list representing the frequency of occurrences of the elements in items.
    Specifically, each key is some element of items, and each datum is the number of occurrences
     * @unknown jfriedman
     */
    @LispMethod(comment = "@param items\nlistp\r\n\t\t\r\n@return an a-list representing the frequency of occurrences of the elements in items.\r\nSpecifically, each key is some element of items, and each datum is the number of occurrences\r\n@unknown jfriedman")
    public static final SubLObject get_frequency_list_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt41$Cannot_compute_frequencies_of_an_);
                }
            }
            {
                SubLObject hash = make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    hash_table_utilities.cinc_hash(item, hash, UNPROVIDED, UNPROVIDED);
                }
                return hash_table_utilities.hash_table_to_alist(hash);
            }
        }
    }

    /**
     *
     *
     * @param items
    listp
     * 		
     * @return an a-list representing the frequency of occurrences of the elements in items.
    Specifically, each key is some element of items, and each datum is the number of occurrences
     * @unknown jfriedman
     */
    @LispMethod(comment = "@param items\nlistp\r\n\t\t\r\n@return an a-list representing the frequency of occurrences of the elements in items.\r\nSpecifically, each key is some element of items, and each datum is the number of occurrences\r\n@unknown jfriedman")
    public static SubLObject get_frequency_list(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str47$Cannot_compute_frequencies_of_an_);
        }
        final SubLObject hash = make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hash_table_utilities.cinc_hash(item, hash, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return hash_table_utilities.hash_table_to_alist(hash);
    }

    /**
     *
     *
     * @param items
    listp
     * 		
     * @return an a-list representing the frequency of occurrences of the elements in items,
    sorted by frequency in descending order.
    Specifically, each key is some element of items, and each datum is the number of occurrences
     * @unknown jfriedman
     */
    @LispMethod(comment = "@param items\nlistp\r\n\t\t\r\n@return an a-list representing the frequency of occurrences of the elements in items,\r\nsorted by frequency in descending order.\r\nSpecifically, each key is some element of items, and each datum is the number of occurrences\r\n@unknown jfriedman")
    public static final SubLObject get_sorted_frequency_list_alt(SubLObject items) {
        {
            SubLObject unsorted = com.cyc.cycjava.cycl.number_utilities.get_frequency_list(items);
            return Sort.sort(unsorted, $sym33$_, CDR);
        }
    }

    /**
     *
     *
     * @param items
    listp
     * 		
     * @return an a-list representing the frequency of occurrences of the elements in items,
    sorted by frequency in descending order.
    Specifically, each key is some element of items, and each datum is the number of occurrences
     * @unknown jfriedman
     */
    @LispMethod(comment = "@param items\nlistp\r\n\t\t\r\n@return an a-list representing the frequency of occurrences of the elements in items,\r\nsorted by frequency in descending order.\r\nSpecifically, each key is some element of items, and each datum is the number of occurrences\r\n@unknown jfriedman")
    public static SubLObject get_sorted_frequency_list(final SubLObject items) {
        final SubLObject unsorted = get_frequency_list(items);
        return Sort.sort(unsorted, $sym35$_, CDR);
    }

    /**
     *
     *
     * @param items
    listp;
     * 		
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param items\nlistp;\r\n\t\t\r\n@return numberp\r\n@unknown yogman")
    public static final SubLObject mode_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt43$Cannot_compute_the_mode_of_an_ato);
                }
            }
            {
                SubLObject hash = make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    hash_table_utilities.cinc_hash(item, hash, UNPROVIDED, UNPROVIDED);
                }
                return com.cyc.cycjava.cycl.number_utilities.max_key_from_hash(hash);
            }
        }
    }

    /**
     *
     *
     * @param items
    listp;
     * 		
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param items\nlistp;\r\n\t\t\r\n@return numberp\r\n@unknown yogman")
    public static SubLObject mode(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str49$Cannot_compute_the_mode_of_an_ato);
        }
        final SubLObject hash = make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hash_table_utilities.cinc_hash(item, hash, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return max_key_from_hash(hash);
    }

    /**
     *
     *
     * @param items
    listp;
     * 		
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param items\nlistp;\r\n\t\t\r\n@return numberp\r\n@unknown yogman")
    public static final SubLObject mode_sorted_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt43$Cannot_compute_the_mode_of_an_ato);
                }
            }
            {
                SubLObject items_left = NIL;
                SubLObject last_item = NIL;
                SubLObject current_item = NIL;
                SubLObject current_count = NIL;
                SubLObject best_item = NIL;
                SubLObject best_count = NIL;
                for (items_left = items, last_item = gensym(UNPROVIDED), current_item = items_left.first(), current_count = ONE_INTEGER, best_item = items.first(), best_count = ONE_INTEGER; NIL != items_left; items_left = items_left.rest() , last_item = current_item , current_item = items_left.first() , current_count = (current_item == last_item) ? ((SubLObject) (add(current_count, ONE_INTEGER))) : ONE_INTEGER , best_item = (current_count.numG(best_count)) ? ((SubLObject) (current_item)) : best_item , best_count = (current_count.numG(best_count)) ? ((SubLObject) (current_count)) : best_count) {
                }
                return best_item;
            }
        }
    }

    /**
     *
     *
     * @param items
    listp;
     * 		
     * @return numberp
     * @unknown yogman
     */
    @LispMethod(comment = "@param items\nlistp;\r\n\t\t\r\n@return numberp\r\n@unknown yogman")
    public static SubLObject mode_sorted(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str49$Cannot_compute_the_mode_of_an_ato);
        }
        SubLObject items_left;
        SubLObject last_item;
        SubLObject current_item;
        SubLObject current_count;
        SubLObject best_item;
        SubLObject best_count;
        for (items_left = NIL, last_item = NIL, current_item = NIL, current_count = NIL, best_item = NIL, best_count = NIL, items_left = items, last_item = gensym(UNPROVIDED), current_item = items_left.first(), current_count = ONE_INTEGER, best_item = items.first(), best_count = ONE_INTEGER; NIL != items_left; items_left = items_left.rest() , last_item = current_item , current_item = items_left.first() , current_count = (current_item.eql(last_item)) ? add(current_count, ONE_INTEGER) : ONE_INTEGER , best_item = (current_count.numG(best_count)) ? current_item : best_item , best_count = (current_count.numG(best_count)) ? current_count : best_count) {
        }
        return best_item;
    }

    /**
     * For the math nerds out there, the being th SAMPLE variance means
     * that it ESTIMATES the variance in the population from which items
     * were taken as a sample.  As the mean is computed along the way, it
     * is returned as a piece of bonus information.
     *
     * @unknown A case of this is when you take a sample of 1000 norwegian
    women and use them to *estimate* the variance in alcohol consumption in
    the *entire population* of norwegian women -- several million of them.
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the variance
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "For the math nerds out there, the being th SAMPLE variance means\r\nthat it ESTIMATES the variance in the population from which items\r\nwere taken as a sample.  As the mean is computed along the way, it\r\nis returned as a piece of bonus information.\r\n\r\n@unknown A case of this is when you take a sample of 1000 norwegian\r\nwomen and use them to *estimate* the variance in alcohol consumption in\r\nthe *entire population* of norwegian women -- several million of them.\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the variance\r\n@return 1 numberp; the mean\r\n@unknown yogman\nFor the math nerds out there, the being th SAMPLE variance means\nthat it ESTIMATES the variance in the population from which items\nwere taken as a sample.  As the mean is computed along the way, it\nis returned as a piece of bonus information.")
    public static final SubLObject variance_from_sample_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt44$Cannot_compute_the_variance_of_an);
                }
            }
            if (NIL != list_utilities.singletonP(items)) {
                Errors.warn($str_alt45$Cannot_make_reasonable_estimate_o);
                return $most_positive_fixnum$.getGlobalValue();
            }
            {
                SubLObject item_squares_total = ZERO_INTEGER;
                SubLObject item_total = ZERO_INTEGER;
                SubLObject length = ZERO_INTEGER;
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    item_squares_total = add(item_squares_total, com.cyc.cycjava.cycl.number_utilities.square(item));
                    item_total = add(item_total, item);
                    length = add(length, ONE_INTEGER);
                }
                {
                    SubLObject mean = divide(item_total, length);
                    return values(subtract(divide(item_squares_total, subtract(length, ONE_INTEGER)), multiply(divide(length, subtract(length, ONE_INTEGER)), com.cyc.cycjava.cycl.number_utilities.square(mean))), mean);
                }
            }
        }
    }

    @LispMethod(comment = "For the math nerds out there, the being th SAMPLE variance means\r\nthat it ESTIMATES the variance in the population from which items\r\nwere taken as a sample.  As the mean is computed along the way, it\r\nis returned as a piece of bonus information.\r\n\r\n@unknown A case of this is when you take a sample of 1000 norwegian\r\nwomen and use them to *estimate* the variance in alcohol consumption in\r\nthe *entire population* of norwegian women -- several million of them.\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the variance\r\n@return 1 numberp; the mean\r\n@unknown yogman\nFor the math nerds out there, the being th SAMPLE variance means\nthat it ESTIMATES the variance in the population from which items\nwere taken as a sample.  As the mean is computed along the way, it\nis returned as a piece of bonus information.")
    public static SubLObject variance_from_sample(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str50$Cannot_compute_the_variance_of_an);
        }
        if (NIL != list_utilities.singletonP(items)) {
            return variance_from_population(items);
        }
        SubLObject item_squares_total = ZERO_INTEGER;
        SubLObject item_total = ZERO_INTEGER;
        SubLObject length = ZERO_INTEGER;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            item_squares_total = add(item_squares_total, square(item));
            item_total = add(item_total, item);
            length = add(length, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        final SubLObject mean = divide(item_total, length);
        return values(subtract(divide(item_squares_total, subtract(length, ONE_INTEGER)), multiply(divide(length, subtract(length, ONE_INTEGER)), square(mean))), mean);
    }

    /**
     * For the math nerds out there, this being the POPULATION variance means
     * that it COMPUTES the variance among items.  As the mean is computed along
     * the way, it is returned as a piece of bonus information.
     *
     * @unknown A case of this is when you know *all* the scores in a class of 100
    and you wish to report score variance as an aggregate property of the population.
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the variance
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "For the math nerds out there, this being the POPULATION variance means\r\nthat it COMPUTES the variance among items.  As the mean is computed along\r\nthe way, it is returned as a piece of bonus information.\r\n\r\n@unknown A case of this is when you know *all* the scores in a class of 100\r\nand you wish to report score variance as an aggregate property of the population.\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the variance\r\n@return 1 numberp; the mean\r\n@unknown yogman\nFor the math nerds out there, this being the POPULATION variance means\nthat it COMPUTES the variance among items.  As the mean is computed along\nthe way, it is returned as a piece of bonus information.")
    public static final SubLObject variance_from_population_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt44$Cannot_compute_the_variance_of_an);
                }
            }
            {
                SubLObject item_squares_total = ZERO_INTEGER;
                SubLObject item_total = ZERO_INTEGER;
                SubLObject length = ZERO_INTEGER;
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    item_squares_total = add(item_squares_total, com.cyc.cycjava.cycl.number_utilities.square(item));
                    item_total = add(item_total, item);
                    length = add(length, ONE_INTEGER);
                }
                {
                    SubLObject mean = divide(item_total, length);
                    return values(subtract(divide(item_squares_total, length), com.cyc.cycjava.cycl.number_utilities.square(mean)), mean);
                }
            }
        }
    }

    @LispMethod(comment = "For the math nerds out there, this being the POPULATION variance means\r\nthat it COMPUTES the variance among items.  As the mean is computed along\r\nthe way, it is returned as a piece of bonus information.\r\n\r\n@unknown A case of this is when you know *all* the scores in a class of 100\r\nand you wish to report score variance as an aggregate property of the population.\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the variance\r\n@return 1 numberp; the mean\r\n@unknown yogman\nFor the math nerds out there, this being the POPULATION variance means\nthat it COMPUTES the variance among items.  As the mean is computed along\nthe way, it is returned as a piece of bonus information.")
    public static SubLObject variance_from_population(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str50$Cannot_compute_the_variance_of_an);
        }
        SubLObject item_squares_total = ZERO_INTEGER;
        SubLObject item_total = ZERO_INTEGER;
        SubLObject length = ZERO_INTEGER;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            item_squares_total = add(item_squares_total, square(item));
            item_total = add(item_total, item);
            length = add(length, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        final SubLObject mean = divide(item_total, length);
        return values(subtract(divide(item_squares_total, length), square(mean)), mean);
    }

    /**
     *
     *
     * @see variance-from-population
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the variance
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "@see variance-from-population\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the variance\r\n@return 1 numberp; the mean\r\n@unknown yogman")
    public static final SubLObject variance_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt44$Cannot_compute_the_variance_of_an);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject variance = com.cyc.cycjava.cycl.number_utilities.variance_from_population(items);
                SubLObject mean = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(variance, mean);
            }
        }
    }

    /**
     *
     *
     * @see variance-from-population
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the variance
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "@see variance-from-population\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the variance\r\n@return 1 numberp; the mean\r\n@unknown yogman")
    public static SubLObject variance(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str50$Cannot_compute_the_variance_of_an);
        }
        thread.resetMultipleValues();
        final SubLObject variance = variance_from_population(items);
        final SubLObject mean = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(variance, mean);
    }

    /**
     *
     *
     * @see variance-from-population
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the standard deviation
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "@see variance-from-population\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the standard deviation\r\n@return 1 numberp; the mean\r\n@unknown yogman")
    public static final SubLObject standard_deviation_from_population_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt46$Cannot_compute_the_standard_devia);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject variance = com.cyc.cycjava.cycl.number_utilities.variance_from_population(items);
                SubLObject mean = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(sqrt(variance), mean);
            }
        }
    }

    /**
     *
     *
     * @see variance-from-population
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the standard deviation
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "@see variance-from-population\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the standard deviation\r\n@return 1 numberp; the mean\r\n@unknown yogman")
    public static SubLObject standard_deviation_from_population(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str51$Cannot_compute_the_standard_devia);
        }
        thread.resetMultipleValues();
        final SubLObject variance = variance_from_population(items);
        final SubLObject mean = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(sqrt(variance), mean);
    }

    public static SubLObject safe_standard_deviation_from_sample(final SubLObject items) {
        return items.isCons() ? standard_deviation_from_sample(items) : ZERO_INTEGER;
    }

    /**
     *
     *
     * @see variance-from-sample
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the standard deviation
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "@see variance-from-sample\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the standard deviation\r\n@return 1 numberp; the mean\r\n@unknown yogman")
    public static final SubLObject standard_deviation_from_sample_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt46$Cannot_compute_the_standard_devia);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject variance = com.cyc.cycjava.cycl.number_utilities.variance_from_sample(items);
                SubLObject mean = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(sqrt(variance), mean);
            }
        }
    }

    /**
     *
     *
     * @see variance-from-sample
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the standard deviation
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "@see variance-from-sample\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the standard deviation\r\n@return 1 numberp; the mean\r\n@unknown yogman")
    public static SubLObject standard_deviation_from_sample(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str51$Cannot_compute_the_standard_devia);
        }
        thread.resetMultipleValues();
        final SubLObject variance = variance_from_sample(items);
        final SubLObject mean = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(sqrt(variance), mean);
    }

    /**
     *
     *
     * @see variance-from-population
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the standard deviation
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "@see variance-from-population\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the standard deviation\r\n@return 1 numberp; the mean\r\n@unknown yogman")
    public static final SubLObject standard_deviation_alt(SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!items.isCons()) {
                    Errors.error($str_alt46$Cannot_compute_the_standard_devia);
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject variance = com.cyc.cycjava.cycl.number_utilities.variance(items);
                SubLObject mean = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(sqrt(variance), mean);
            }
        }
    }

    /**
     *
     *
     * @see variance-from-population
     * @param items
     * 		listp; a list of numbers (numberp)
     * @return 0 numberp; the standard deviation
     * @return 1 numberp; the mean
     * @unknown yogman
     */
    @LispMethod(comment = "@see variance-from-population\r\n@param items\r\n\t\tlistp; a list of numbers (numberp)\r\n@return 0 numberp; the standard deviation\r\n@return 1 numberp; the mean\r\n@unknown yogman")
    public static SubLObject standard_deviation(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!items.isCons())) {
            Errors.error($str51$Cannot_compute_the_standard_devia);
        }
        thread.resetMultipleValues();
        final SubLObject variance = variance(items);
        final SubLObject mean = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(sqrt(variance), mean);
    }

    /**
     * Return the number of STANDARD-DEVIATIONs that VALUE is above MEAN.
     */
    @LispMethod(comment = "Return the number of STANDARD-DEVIATIONs that VALUE is above MEAN.")
    public static final SubLObject standard_deviations_above_mean_alt(SubLObject value, SubLObject mean, SubLObject standard_deviation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (value.numE(mean)) {
                return ZERO_INTEGER;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (standard_deviation.isZero()) {
                    Errors.error($str_alt47$Standard_deviation_must_not_be_ze);
                }
            }
            return divide(subtract(value, mean), standard_deviation);
        }
    }

    @LispMethod(comment = "Return the number of STANDARD-DEVIATIONs that VALUE is above MEAN.")
    public static SubLObject standard_deviations_above_mean(final SubLObject value, final SubLObject mean, final SubLObject standard_deviation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (value.numE(mean)) {
            return ZERO_INTEGER;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && standard_deviation.isZero()) {
            Errors.error($str52$Standard_deviation_must_not_be_ze);
        }
        return divide(subtract(value, mean), standard_deviation);
    }

    public static SubLObject simple_outliers(final SubLObject data, SubLObject key) {
        if (key == UNPROVIDED) {
            key = IDENTITY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_numbers = Mapping.mapcar(key, data);
        thread.resetMultipleValues();
        final SubLObject stdev = standard_deviation(raw_numbers);
        final SubLObject mean = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject simple_outlier_cutoff = add(mean, multiply(stdev, TWO_INTEGER));
        SubLObject outlier_data = remove(simple_outlier_cutoff, data, symbol_function($sym53$__), key, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        outlier_data = Sort.sort(outlier_data, symbol_function($sym35$_), key);
        return values(outlier_data, simple_outlier_cutoff);
    }

    public static final SubLObject perform_standard_statistical_analysis_alt(SubLObject values, SubLObject should_print_resultsP) {
        if (should_print_resultsP == UNPROVIDED) {
            should_print_resultsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject n = length(values);
                SubLObject min = com.cyc.cycjava.cycl.number_utilities.minimum(values, UNPROVIDED);
                SubLObject max = com.cyc.cycjava.cycl.number_utilities.maximum(values, UNPROVIDED);
                SubLObject median = com.cyc.cycjava.cycl.number_utilities.median(values, UNPROVIDED);
                SubLObject mean = com.cyc.cycjava.cycl.number_utilities.mean(values);
                SubLObject sd = com.cyc.cycjava.cycl.number_utilities.standard_deviation(values);
                if (NIL != should_print_resultsP) {
                    {
                        SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                        try {
                            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                            format(T, $str_alt49$__Standard_Statistical_Analysis);
                            format(T, $str_alt50$_______________________________);
                            format(T, $str_alt51$__N____S, n);
                            format(T, $str_alt52$__Min____S, com.cyc.cycjava.cycl.number_utilities.four_significant_digits(min));
                            format(T, $str_alt53$__Max____S, com.cyc.cycjava.cycl.number_utilities.four_significant_digits(max));
                            format(T, $str_alt54$__Median____S, com.cyc.cycjava.cycl.number_utilities.four_significant_digits(median));
                            format(T, $str_alt55$__Mean____S, com.cyc.cycjava.cycl.number_utilities.four_significant_digits(mean));
                            format(T, $str_alt56$__Standard_Deviation____S, com.cyc.cycjava.cycl.number_utilities.four_significant_digits(sd));
                            terpri(T);
                            force_output(T);
                        } finally {
                            $read_default_float_format$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return list(n, min, max, median, mean, sd);
            }
        }
    }

    public static SubLObject perform_standard_statistical_analysis(final SubLObject values, SubLObject should_print_resultsP) {
        if (should_print_resultsP == UNPROVIDED) {
            should_print_resultsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject n = length(values);
        final SubLObject min = minimum(values, UNPROVIDED);
        final SubLObject max = maximum(values, UNPROVIDED);
        final SubLObject median = median(values, UNPROVIDED, UNPROVIDED);
        final SubLObject mean = mean(values);
        final SubLObject sd = standard_deviation(values);
        if (NIL != should_print_resultsP) {
            final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
            try {
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                format(T, $str55$__Standard_Statistical_Analysis);
                format(T, $str56$_______________________________);
                format(T, $str57$__Count______6D, n);
                format(T, $str58$__Min________6D, four_significant_digits(min));
                format(T, $str59$__Median_____6D, four_significant_digits(median));
                format(T, $str60$__Mean_______6D, four_significant_digits(mean));
                format(T, $str61$__Max________6D, four_significant_digits(max));
                format(T, $str62$__Std_Dev____6D, four_significant_digits(sd));
                terpri(T);
                force_output(T);
            } finally {
                $read_default_float_format$.rebind(_prev_bind_0, thread);
            }
        }
        return list(n, min, median, mean, max, sd);
    }

    public static final SubLObject correlation_alt(SubLObject x_values, SubLObject y_values) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.same_length_p(x_values, y_values)) {
                    Errors.error($str_alt57$X_Values_and_Y_Values_must_be_of_, length(x_values));
                }
            }
            {
                SubLObject sum_sq_x = ZERO_INTEGER;
                SubLObject sum_sq_y = ZERO_INTEGER;
                SubLObject sum_coproduct = ZERO_INTEGER;
                SubLObject mean_x = NIL;
                SubLObject mean_y = NIL;
                SubLObject n = NIL;
                SubLObject counter = ZERO_INTEGER;
                SubLObject x = NIL;
                SubLObject x_1 = NIL;
                SubLObject y = NIL;
                SubLObject y_2 = NIL;
                for (x = x_values, x_1 = x.first(), y = y_values, y_2 = y.first(); !((NIL == y) && (NIL == x)); x = x.rest() , x_1 = x.first() , y = y.rest() , y_2 = y.first()) {
                    if (counter.isZero()) {
                        mean_x = x_1;
                        mean_y = y_2;
                    } else {
                        {
                            SubLObject index = add(counter, ONE_INTEGER);
                            SubLObject sweep = divide(subtract(index, $float$1_0), index);
                            SubLObject delta_x = subtract(x_1, mean_x);
                            SubLObject delta_y = subtract(y_2, mean_y);
                            sum_sq_x = add(sum_sq_x, multiply(delta_x, delta_x, sweep));
                            sum_sq_y = add(sum_sq_y, multiply(delta_y, delta_y, sweep));
                            sum_coproduct = add(sum_coproduct, multiply(delta_x, delta_y, sweep));
                            mean_x = add(mean_x, divide(delta_x, index));
                            mean_y = add(mean_y, divide(delta_y, index));
                            n = index;
                        }
                    }
                    counter = add(counter, ONE_INTEGER);
                }
                {
                    SubLObject pop_sd_x = sqrt(divide(sum_sq_x, n));
                    SubLObject pop_sd_y = sqrt(divide(sum_sq_y, n));
                    SubLObject cov_x_y = divide(sum_coproduct, n);
                    if (pop_sd_x.isZero() || pop_sd_y.isZero()) {
                        return ZERO_INTEGER;
                    }
                    return divide(cov_x_y, multiply(pop_sd_x, pop_sd_y));
                }
            }
        }
    }

    public static SubLObject correlation(final SubLObject x_values, final SubLObject y_values) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.same_length_p(x_values, y_values))) {
            Errors.error($str63$X_Values_and_Y_Values_must_be_of_, length(x_values));
        }
        SubLObject sum_sq_x = ZERO_INTEGER;
        SubLObject sum_sq_y = ZERO_INTEGER;
        SubLObject sum_coproduct = ZERO_INTEGER;
        SubLObject mean_x = NIL;
        SubLObject mean_y = NIL;
        SubLObject n = NIL;
        SubLObject counter = ZERO_INTEGER;
        SubLObject x = NIL;
        SubLObject x_$1 = NIL;
        SubLObject y = NIL;
        SubLObject y_$2 = NIL;
        x = x_values;
        x_$1 = x.first();
        y = y_values;
        y_$2 = y.first();
        while ((NIL != y) || (NIL != x)) {
            if (counter.isZero()) {
                mean_x = x_$1;
                mean_y = y_$2;
            } else {
                final SubLObject index = add(counter, ONE_INTEGER);
                final SubLObject sweep = divide(subtract(index, $float$1_0), index);
                final SubLObject delta_x = subtract(x_$1, mean_x);
                final SubLObject delta_y = subtract(y_$2, mean_y);
                sum_sq_x = add(sum_sq_x, multiply(delta_x, delta_x, sweep));
                sum_sq_y = add(sum_sq_y, multiply(delta_y, delta_y, sweep));
                sum_coproduct = add(sum_coproduct, multiply(delta_x, delta_y, sweep));
                mean_x = add(mean_x, divide(delta_x, index));
                mean_y = add(mean_y, divide(delta_y, index));
                n = index;
            }
            counter = add(counter, ONE_INTEGER);
            x = x.rest();
            x_$1 = x.first();
            y = y.rest();
            y_$2 = y.first();
        } 
        final SubLObject pop_sd_x = sqrt(divide(sum_sq_x, n));
        final SubLObject pop_sd_y = sqrt(divide(sum_sq_y, n));
        final SubLObject cov_x_y = divide(sum_coproduct, n);
        if (pop_sd_x.isZero() || pop_sd_y.isZero()) {
            return ZERO_INTEGER;
        }
        return divide(cov_x_y, multiply(pop_sd_x, pop_sd_y));
    }

    /**
     * Given a list of integer MULTIPLES, from least to most significant value, return INTEGER
     * correspondingly split into a list of multiples.  For example :
     * 123 (10 10 10) => (3 2 1)
     * 15 (2 2 2 2 2) => (1 1 1 1)
     */
    @LispMethod(comment = "Given a list of integer MULTIPLES, from least to most significant value, return INTEGER\r\ncorrespondingly split into a list of multiples.  For example :\r\n123 (10 10 10) => (3 2 1)\r\n15 (2 2 2 2 2) => (1 1 1 1)\nGiven a list of integer MULTIPLES, from least to most significant value, return INTEGER\ncorrespondingly split into a list of multiples.  For example :\n123 (10 10 10) => (3 2 1)\n15 (2 2 2 2 2) => (1 1 1 1)")
    public static final SubLObject decode_integer_multiples_alt(SubLObject integer, SubLObject multiples) {
        SubLTrampolineFile.checkType(integer, INTEGERP);
        SubLTrampolineFile.checkType(multiples, LISTP);
        {
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = multiples;
            SubLObject multiple = NIL;
            for (multiple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , multiple = cdolist_list_var.first()) {
                if (integer.numE(ZERO_INTEGER)) {
                    if (NIL == v_answer) {
                        v_answer = cons(integer, v_answer);
                    }
                    return nreverse(v_answer);
                }
                {
                    SubLObject value = mod(integer, multiple);
                    integer = integerDivide(integer, multiple);
                    v_answer = cons(value, v_answer);
                }
            }
            v_answer = cons(integer, v_answer);
            return nreverse(v_answer);
        }
    }

    @LispMethod(comment = "Given a list of integer MULTIPLES, from least to most significant value, return INTEGER\r\ncorrespondingly split into a list of multiples.  For example :\r\n123 (10 10 10) => (3 2 1)\r\n15 (2 2 2 2 2) => (1 1 1 1)\nGiven a list of integer MULTIPLES, from least to most significant value, return INTEGER\ncorrespondingly split into a list of multiples.  For example :\n123 (10 10 10) => (3 2 1)\n15 (2 2 2 2 2) => (1 1 1 1)")
    public static SubLObject decode_integer_multiples(SubLObject integer, final SubLObject multiples) {
        assert NIL != integerp(integer) : "! integerp(integer) " + ("Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) ") + integer;
        assert NIL != listp(multiples) : "! listp(multiples) " + ("Types.listp(multiples) " + "CommonSymbols.NIL != Types.listp(multiples) ") + multiples;
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = multiples;
        SubLObject multiple = NIL;
        multiple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (integer.numE(ZERO_INTEGER)) {
                if (NIL == v_answer) {
                    v_answer = cons(integer, v_answer);
                }
                return nreverse(v_answer);
            }
            final SubLObject value = mod(integer, multiple);
            integer = integerDivide(integer, multiple);
            v_answer = cons(value, v_answer);
            cdolist_list_var = cdolist_list_var.rest();
            multiple = cdolist_list_var.first();
        } 
        v_answer = cons(integer, v_answer);
        return nreverse(v_answer);
    }

    /**
     * Given a list of VALUES, and scaling MULTIPLES, from least to most significant value, return
     * an encoded integer.
     */
    @LispMethod(comment = "Given a list of VALUES, and scaling MULTIPLES, from least to most significant value, return\r\nan encoded integer.\nGiven a list of VALUES, and scaling MULTIPLES, from least to most significant value, return\nan encoded integer.")
    public static final SubLObject encode_integer_multiples_alt(SubLObject values, SubLObject multiples) {
        if (NIL == values) {
            return ZERO_INTEGER;
        } else {
            if (NIL == multiples) {
                return values.first();
            } else {
                {
                    SubLObject v_answer = com.cyc.cycjava.cycl.number_utilities.encode_integer_multiples(values.rest(), multiples.rest());
                    v_answer = multiply(v_answer, multiples.first());
                    v_answer = add(v_answer, values.first());
                    return v_answer;
                }
            }
        }
    }

    @LispMethod(comment = "Given a list of VALUES, and scaling MULTIPLES, from least to most significant value, return\r\nan encoded integer.\nGiven a list of VALUES, and scaling MULTIPLES, from least to most significant value, return\nan encoded integer.")
    public static SubLObject encode_integer_multiples(final SubLObject values, final SubLObject multiples) {
        if (NIL == values) {
            return ZERO_INTEGER;
        }
        if (NIL == multiples) {
            return values.first();
        }
        SubLObject v_answer = encode_integer_multiples(values.rest(), multiples.rest());
        v_answer = multiply(v_answer, multiples.first());
        v_answer = add(v_answer, values.first());
        return v_answer;
    }

    public static SubLObject arithmetic_progression(final SubLObject start, final SubLObject end, final SubLObject length) {
        if (length.numL(TWO_INTEGER)) {
            Errors.error($str66$length_must_be_at_least_2_);
        }
        final SubLObject difference = subtract(end, start);
        final SubLObject interval = divide(difference, subtract(length, ONE_INTEGER));
        SubLObject result = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            result = cons(add(start, multiply(i, interval)), result);
        }
        result = nreverse(result);
        return result;
    }

    public static SubLObject geometric_progression(final SubLObject start, final SubLObject end, final SubLObject length) {
        if (start.numE(ONE_INTEGER)) {
            return Errors.error($str67$Cannot_start_at_1_);
        }
        if (end.numE(ONE_INTEGER)) {
            return Errors.error($str68$Cannot_end_at_1_);
        }
        if (start.numLE(ZERO_INTEGER)) {
            return Errors.error($str69$Cannot_start_at_or_below_0_);
        }
        if (end.numLE(ZERO_INTEGER)) {
            return Errors.error($str70$Cannot_end_at_or_below_0_);
        }
        if (length.numLE(ZERO_INTEGER)) {
            return Errors.error($str71$Length_must_be_at_least_1_);
        }
        if (!length.numE(ONE_INTEGER)) {
            final SubLObject step_ratio = geometric_progression_ratio(start, end, length);
            final SubLObject steps = f_1_(length);
            SubLObject sofar = $UNINITIALIZED;
            SubLObject result = NIL;
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                if (i.isZero()) {
                    sofar = start;
                } else
                    if (i.numL(steps)) {
                        sofar = multiply(sofar, step_ratio);
                    } else {
                        sofar = end;
                    }

                result = cons(sofar, result);
            }
            return nreverse(result);
        }
        if (start.numE(end)) {
            return list(start);
        }
        return Errors.error($str72$Length_must_be_at_least_2_);
    }

    public static SubLObject geometric_progression_ratio(final SubLObject start, final SubLObject end, final SubLObject length) {
        final SubLObject full_ratio = divide(end, start);
        final SubLObject steps = f_1_(length);
        SubLObject step_ratio = expt(full_ratio, invert(steps));
        if (start.isInteger() && end.isInteger()) {
            final SubLObject sanitized_ratio = arithmetic.possibly_sanitize_float(step_ratio);
            final SubLObject integer_ratio = round(sanitized_ratio, UNPROVIDED);
            if (integer_ratio.numE(sanitized_ratio) && end.numE(multiply(start, expt(integer_ratio, steps)))) {
                step_ratio = integer_ratio;
            }
        }
        return step_ratio;
    }

    /**
     * Return T iff TEXT is a string that could be read into a valid NUMBERP
     */
    @LispMethod(comment = "Return T iff TEXT is a string that could be read into a valid NUMBERP")
    public static final SubLObject number_string_p_alt(SubLObject text) {
        {
            SubLObject num = NIL;
            SubLObject err_msg = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            num = com.cyc.cycjava.cycl.number_utilities.number_string_value(text);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != err_msg) {
                if (NIL == string_utilities.substringP($str_alt61$This_integer_is_too_large_to_be_c, err_msg, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt62$_A, err_msg);
                }
            }
            return list_utilities.sublisp_boolean(num);
        }
    }

    @LispMethod(comment = "Return T iff TEXT is a string that could be read into a valid NUMBERP")
    public static SubLObject number_string_p(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num = NIL;
        SubLObject err_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    num = number_string_value(text);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if ((NIL != err_msg) && (NIL == string_utilities.substringP($str75$This_integer_is_too_large_to_be_c, err_msg, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str76$_A, err_msg);
        }
        return list_utilities.sublisp_boolean(num);
    }

    /**
     * Return a number iff TEXT is a string that could be read into a valid NUMBERP
     */
    @LispMethod(comment = "Return a number iff TEXT is a string that could be read into a valid NUMBERP")
    public static final SubLObject number_string_value_alt(SubLObject text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (text.isString()) {
                if (NIL != find_if(symbol_function(DIGIT_CHAR_P), text, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    if (NIL == list_utilities.find_if_not(symbol_function(VALID_NUMBER_STRING_CHAR), text, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject number = read_from_string_ignoring_errors(text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject next_position = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (number.isNumber() && next_position.eql(length(text))) {
                                return number;
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Return a number iff TEXT is a string that could be read into a valid NUMBERP")
    public static SubLObject number_string_value(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((text.isString() && (NIL != find_if(symbol_function(DIGIT_CHAR_P), text, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == list_utilities.find_if_not(symbol_function(VALID_NUMBER_STRING_CHAR), text, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject number = read_from_string_ignoring_errors(text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject next_position = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (number.isNumber() && next_position.eql(length(text))) {
                return number;
            }
        }
        return NIL;
    }

    public static final SubLObject valid_number_string_char_alt(SubLObject obj) {
        return find(obj, $valid_number_string_characters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject valid_number_string_char(final SubLObject obj) {
        return find(obj, $valid_number_string_characters$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff TEXT is a string which represents a number in some standard
     * form of decimal notation (including, e.g., engineering and scientific
     * notation).  Note that this need not be a valid NUMBERP.
     */
    @LispMethod(comment = "Return T iff TEXT is a string which represents a number in some standard\r\nform of decimal notation (including, e.g., engineering and scientific\r\nnotation).  Note that this need not be a valid NUMBERP.\nReturn T iff TEXT is a string which represents a number in some standard\nform of decimal notation (including, e.g., engineering and scientific\nnotation).  Note that this need not be a valid NUMBERP.")
    public static final SubLObject extended_number_string_p_alt(SubLObject string) {
        if (NIL == string_utilities.partially_numeric_stringP(string)) {
            return NIL;
        }
        {
            SubLObject exponent_marker_position = position_if(VALID_EXPONENT_MARKER, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject significand = (NIL != exponent_marker_position) ? ((SubLObject) (string_utilities.substring(string, ZERO_INTEGER, exponent_marker_position))) : string;
            SubLObject exponent = (NIL != exponent_marker_position) ? ((SubLObject) (string_utilities.substring(string, add(ONE_INTEGER, exponent_marker_position), UNPROVIDED))) : NIL;
            SubLObject failedP = NIL;
            if (NIL != string_utilities.empty_string_p(significand)) {
                failedP = T;
            } else {
                {
                    SubLObject decimal_foundP = NIL;
                    SubLObject leading_elt = elt(significand, ZERO_INTEGER);
                    if (CHAR_period == leading_elt) {
                        decimal_foundP = T;
                    } else {
                        if (!((NIL != digit_char_p(leading_elt, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.number_utilities.valid_sign(leading_elt)))) {
                            failedP = T;
                        }
                    }
                    {
                        SubLObject string_var = significand;
                        SubLObject end_var = length(string_var);
                        if (NIL == failedP) {
                            {
                                SubLObject end_var_3 = end_var;
                                SubLObject char_num = NIL;
                                for (char_num = ONE_INTEGER; !((NIL != failedP) || char_num.numGE(end_var_3)); char_num = com.cyc.cycjava.cycl.number_utilities.f_1X(char_num)) {
                                    {
                                        SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                                        if (NIL == digit_char_p(v_char, UNPROVIDED)) {
                                            if (CHAR_period == v_char) {
                                                if (NIL != decimal_foundP) {
                                                    failedP = T;
                                                } else {
                                                    decimal_foundP = T;
                                                }
                                            } else {
                                                failedP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!((NIL != failedP) || (NIL == exponent))) {
                if (NIL != string_utilities.empty_string_p(exponent)) {
                    failedP = T;
                } else {
                    {
                        SubLObject leading_elt = elt(exponent, ZERO_INTEGER);
                        if (!((NIL != digit_char_p(leading_elt, UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.number_utilities.valid_sign(leading_elt)))) {
                            failedP = T;
                        }
                        {
                            SubLObject string_var = exponent;
                            SubLObject end_var = length(string_var);
                            if (NIL == failedP) {
                                {
                                    SubLObject end_var_4 = end_var;
                                    SubLObject char_num = NIL;
                                    for (char_num = ONE_INTEGER; !((NIL != failedP) || char_num.numGE(end_var_4)); char_num = com.cyc.cycjava.cycl.number_utilities.f_1X(char_num)) {
                                        {
                                            SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                                            if (NIL == digit_char_p(v_char, UNPROVIDED)) {
                                                failedP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == failedP);
        }
    }

    @LispMethod(comment = "Return T iff TEXT is a string which represents a number in some standard\r\nform of decimal notation (including, e.g., engineering and scientific\r\nnotation).  Note that this need not be a valid NUMBERP.\nReturn T iff TEXT is a string which represents a number in some standard\nform of decimal notation (including, e.g., engineering and scientific\nnotation).  Note that this need not be a valid NUMBERP.")
    public static SubLObject extended_number_string_p(final SubLObject string) {
        if (NIL == string_utilities.partially_numeric_stringP(string)) {
            return NIL;
        }
        final SubLObject exponent_marker_position = position_if(VALID_EXPONENT_MARKER, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject significand = (NIL != exponent_marker_position) ? string_utilities.substring(string, ZERO_INTEGER, exponent_marker_position) : string;
        final SubLObject exponent = (NIL != exponent_marker_position) ? string_utilities.substring(string, add(ONE_INTEGER, exponent_marker_position), UNPROVIDED) : NIL;
        SubLObject failedP = NIL;
        if (NIL != string_utilities.empty_string_p(significand)) {
            failedP = T;
        } else {
            SubLObject decimal_foundP = NIL;
            final SubLObject leading_elt = elt(significand, ZERO_INTEGER);
            if (CHAR_period.eql(leading_elt)) {
                decimal_foundP = T;
            } else
                if ((NIL == digit_char_p(leading_elt, UNPROVIDED)) && (NIL == valid_sign(leading_elt))) {
                    failedP = T;
                }

            final SubLObject string_var = significand;
            final SubLObject end_var = length(string_var);
            if (NIL == failedP) {
                SubLObject end_var_$3;
                SubLObject char_num;
                SubLObject v_char;
                for (end_var_$3 = end_var, char_num = NIL, char_num = ONE_INTEGER; (NIL == failedP) && (!char_num.numGE(end_var_$3)); char_num = f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string_var, char_num);
                    if (NIL == digit_char_p(v_char, UNPROVIDED)) {
                        if (CHAR_period.eql(v_char)) {
                            if (NIL != decimal_foundP) {
                                failedP = T;
                            } else {
                                decimal_foundP = T;
                            }
                        } else {
                            failedP = T;
                        }
                    }
                }
            }
        }
        if ((NIL == failedP) && (NIL != exponent)) {
            if (NIL != string_utilities.empty_string_p(exponent)) {
                failedP = T;
            } else {
                final SubLObject leading_elt2 = elt(exponent, ZERO_INTEGER);
                if ((NIL == digit_char_p(leading_elt2, UNPROVIDED)) && (NIL == valid_sign(leading_elt2))) {
                    failedP = T;
                }
                final SubLObject string_var2 = exponent;
                final SubLObject end_var2 = length(string_var2);
                if (NIL == failedP) {
                    SubLObject end_var_$4;
                    SubLObject char_num2;
                    SubLObject v_char2;
                    for (end_var_$4 = end_var2, char_num2 = NIL, char_num2 = ONE_INTEGER; (NIL == failedP) && (!char_num2.numGE(end_var_$4)); char_num2 = f_1X(char_num2)) {
                        v_char2 = Strings.sublisp_char(string_var2, char_num2);
                        if (NIL == digit_char_p(v_char2, UNPROVIDED)) {
                            failedP = T;
                        }
                    }
                }
            }
        }
        return makeBoolean(NIL == failedP);
    }

    public static final SubLObject valid_exponent_marker_alt(SubLObject obj) {
        return find(obj, $valid_exponent_markers$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject valid_exponent_marker(final SubLObject obj) {
        return find(obj, $valid_exponent_markers$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject valid_sign_alt(SubLObject obj) {
        return find(obj, $valid_sign$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject valid_sign(final SubLObject obj) {
        return find(obj, $valid_sign$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject find_smallest_prime_for_binary_width_alt(SubLObject power) {
        {
            SubLObject candidate = com.cyc.cycjava.cycl.number_utilities.f_1_(expt(TWO_INTEGER, power));
            SubLObject prime = NIL;
            while (NIL == prime) {
                if (NIL != com.cyc.cycjava.cycl.number_utilities.prime_numberP(candidate)) {
                    prime = candidate;
                } else {
                    candidate = subtract(candidate, ONE_INTEGER);
                }
            } 
            return prime;
        }
    }

    public static SubLObject find_smallest_prime_for_binary_width(final SubLObject power) {
        SubLObject candidate = f_1_(expt(TWO_INTEGER, power));
        SubLObject prime = NIL;
        while (NIL == prime) {
            if (NIL != prime_numberP(candidate)) {
                prime = candidate;
            } else {
                candidate = subtract(candidate, ONE_INTEGER);
            }
        } 
        return prime;
    }

    public static final SubLObject checksum_sanity_check_alt() {
        return makeBoolean((NIL != positive_integer_p($checksum_implementation_width$.getGlobalValue())) && (NIL != positive_integer_p($checksum_base$.getGlobalValue())));
    }

    public static SubLObject checksum_sanity_check() {
        return makeBoolean((NIL != subl_promotions.positive_integer_p($checksum_implementation_width$.getGlobalValue())) && (NIL != subl_promotions.positive_integer_p($checksum_base$.getGlobalValue())));
    }

    /**
     * Perform the increment of the checksum only. This form
     * is the one that needs to be called from within the
     * loop of the data accumulation. The looping ensures
     * that MOD can be replaced by subtraction.
     */
    @LispMethod(comment = "Perform the increment of the checksum only. This form\r\nis the one that needs to be called from within the\r\nloop of the data accumulation. The looping ensures\r\nthat MOD can be replaced by subtraction.\nPerform the increment of the checksum only. This form\nis the one that needs to be called from within the\nloop of the data accumulation. The looping ensures\nthat MOD can be replaced by subtraction.")
    public static final SubLObject checksum_update_alt(SubLObject v_byte) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $checksum_sum$.setDynamicValue(add($checksum_sum$.getDynamicValue(thread), v_byte), thread);
            if ($checksum_base$.getGlobalValue().numL($checksum_sum$.getDynamicValue(thread))) {
                $checksum_sum$.setDynamicValue(subtract($checksum_sum$.getDynamicValue(thread), $checksum_base$.getGlobalValue()), thread);
            }
            $checksum_length$.setDynamicValue(add($checksum_length$.getDynamicValue(thread), $checksum_sum$.getDynamicValue(thread)), thread);
            if ($checksum_base$.getGlobalValue().numL($checksum_length$.getDynamicValue(thread))) {
                $checksum_length$.setDynamicValue(subtract($checksum_length$.getDynamicValue(thread), $checksum_base$.getGlobalValue()), thread);
            }
            return v_byte;
        }
    }

    @LispMethod(comment = "Perform the increment of the checksum only. This form\r\nis the one that needs to be called from within the\r\nloop of the data accumulation. The looping ensures\r\nthat MOD can be replaced by subtraction.\nPerform the increment of the checksum only. This form\nis the one that needs to be called from within the\nloop of the data accumulation. The looping ensures\nthat MOD can be replaced by subtraction.")
    public static SubLObject checksum_update(final SubLObject v_byte) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $checksum_sum$.setDynamicValue(add($checksum_sum$.getDynamicValue(thread), v_byte), thread);
        if ($checksum_base$.getGlobalValue().numL($checksum_sum$.getDynamicValue(thread))) {
            $checksum_sum$.setDynamicValue(subtract($checksum_sum$.getDynamicValue(thread), $checksum_base$.getGlobalValue()), thread);
        }
        $checksum_length$.setDynamicValue(add($checksum_length$.getDynamicValue(thread), $checksum_sum$.getDynamicValue(thread)), thread);
        if ($checksum_base$.getGlobalValue().numL($checksum_length$.getDynamicValue(thread))) {
            $checksum_length$.setDynamicValue(subtract($checksum_length$.getDynamicValue(thread), $checksum_base$.getGlobalValue()), thread);
        }
        return v_byte;
    }

    /**
     * Compute the end checksum from the subcomponents high and low.
     * Set the variable to the final checksum of the whole block.
     * On 64bit arithmetic, this could be computed
     * (high << *adler-implementation-width* + low), but we make it
     * simply a tuple.
     */
    @LispMethod(comment = "Compute the end checksum from the subcomponents high and low.\r\nSet the variable to the final checksum of the whole block.\r\nOn 64bit arithmetic, this could be computed\r\n(high << *adler-implementation-width* + low), but we make it\r\nsimply a tuple.\nCompute the end checksum from the subcomponents high and low.\nSet the variable to the final checksum of the whole block.\nOn 64bit arithmetic, this could be computed\n(high << *adler-implementation-width* + low), but we make it\nsimply a tuple.")
    public static final SubLObject checksum_finalize_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cons($checksum_length$.getDynamicValue(thread), $checksum_sum$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Compute the end checksum from the subcomponents high and low.\r\nSet the variable to the final checksum of the whole block.\r\nOn 64bit arithmetic, this could be computed\r\n(high << *adler-implementation-width* + low), but we make it\r\nsimply a tuple.\nCompute the end checksum from the subcomponents high and low.\nSet the variable to the final checksum of the whole block.\nOn 64bit arithmetic, this could be computed\n(high << *adler-implementation-width* + low), but we make it\nsimply a tuple.")
    public static SubLObject checksum_finalize() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cons($checksum_length$.getDynamicValue(thread), $checksum_sum$.getDynamicValue(thread));
    }

    public static final SubLObject checksum_setup_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt81);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject sum_init = NIL;
                    SubLObject length_init = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    sum_init = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt81);
                    length_init = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($checksum_sum$, sum_init), list($checksum_length$, length_init)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt81);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject checksum_setup(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sum_init = NIL;
        SubLObject length_init = NIL;
        destructuring_bind_must_consp(current, datum, $list94);
        sum_init = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        length_init = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($checksum_sum$, sum_init), list($checksum_length$, length_init)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list94);
        return NIL;
    }

    /**
     * Initialize the needed components to the mathematically correct
     * values. This macro assumes that there previously was no checksum,
     * i.e. this is the start of the checksum computation.
     */
    @LispMethod(comment = "Initialize the needed components to the mathematically correct\r\nvalues. This macro assumes that there previously was no checksum,\r\ni.e. this is the start of the checksum computation.\nInitialize the needed components to the mathematically correct\nvalues. This macro assumes that there previously was no checksum,\ni.e. this is the start of the checksum computation.")
    public static final SubLObject checksum_start_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CHECKSUM_SETUP, $list_alt85, append(body, NIL));
        }
    }

    @LispMethod(comment = "Initialize the needed components to the mathematically correct\r\nvalues. This macro assumes that there previously was no checksum,\r\ni.e. this is the start of the checksum computation.\nInitialize the needed components to the mathematically correct\nvalues. This macro assumes that there previously was no checksum,\ni.e. this is the start of the checksum computation.")
    public static SubLObject checksum_start(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CHECKSUM_SETUP, $list98, append(body, NIL));
    }

    /**
     * Initialize the components based on a previously computed checksum.
     * Use this construct to set up a checksum loop that continues a checksum
     * computation.
     *
     * @unknown The length, being the high part, comes first in the accumulator,
    but second in the call to setup.
     */
    @LispMethod(comment = "Initialize the components based on a previously computed checksum.\r\nUse this construct to set up a checksum loop that continues a checksum\r\ncomputation.\r\n\r\n@unknown The length, being the high part, comes first in the accumulator,\r\nbut second in the call to setup.\nInitialize the components based on a previously computed checksum.\nUse this construct to set up a checksum loop that continues a checksum\ncomputation.")
    public static final SubLObject checksum_resume_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt86);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject accumulators = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt86);
                    accumulators = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CHECKSUM_SETUP, list(list(CDR, accumulators), list(CAR, accumulators)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt86);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Initialize the components based on a previously computed checksum.\r\nUse this construct to set up a checksum loop that continues a checksum\r\ncomputation.\r\n\r\n@unknown The length, being the high part, comes first in the accumulator,\r\nbut second in the call to setup.\nInitialize the components based on a previously computed checksum.\nUse this construct to set up a checksum loop that continues a checksum\ncomputation.")
    public static SubLObject checksum_resume(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list99);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject accumulators = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        accumulators = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CHECKSUM_SETUP, list(list(CDR, accumulators), list(CAR, accumulators)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list99);
        return NIL;
    }

    /**
     * This macro wraps entire loops of code for check sum computation.
     * Within the loop, checksum-update must be called on
     * each of the bytes that go into the checksum. The final
     * result is made available in checksum.
     *
     * @unknown cons of the upper and lower part of the checksum.
     */
    @LispMethod(comment = "This macro wraps entire loops of code for check sum computation.\r\nWithin the loop, checksum-update must be called on\r\neach of the bytes that go into the checksum. The final\r\nresult is made available in checksum.\r\n\r\n@unknown cons of the upper and lower part of the checksum.\nThis macro wraps entire loops of code for check sum computation.\nWithin the loop, checksum-update must be called on\neach of the bytes that go into the checksum. The final\nresult is made available in checksum.")
    public static final SubLObject with_checksum_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt88);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject checksum = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt88);
                    checksum = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return bq_cons(CHECKSUM_START, append(body, list(listS(CSETQ, checksum, $list_alt91))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt88);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "This macro wraps entire loops of code for check sum computation.\r\nWithin the loop, checksum-update must be called on\r\neach of the bytes that go into the checksum. The final\r\nresult is made available in checksum.\r\n\r\n@unknown cons of the upper and lower part of the checksum.\nThis macro wraps entire loops of code for check sum computation.\nWithin the loop, checksum-update must be called on\neach of the bytes that go into the checksum. The final\nresult is made available in checksum.")
    public static SubLObject with_checksum(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list101);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject checksum = NIL;
        destructuring_bind_must_consp(current, datum, $list101);
        checksum = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return bq_cons(CHECKSUM_START, append(body, list(listS(CSETQ, checksum, $list104))));
        }
        cdestructuring_bind_error(datum, $list101);
        return NIL;
    }

    /**
     *
     *
     * @param NUMBER;
    integerp
     * 		
     * @param EXPONENT;
    integerp
     * 		
     * @param MODULUS;
    integerp
     * 		
     * @return integerp; the result of NUMBER to the power EXPONENT under MODULUS
    Performs exponentiation under modulus. The constant application of the
    modulus operation to intermediate results prevents one from having to deal
    with any number larger than the square of the modulus at any time.
     */
    @LispMethod(comment = "@param NUMBER;\nintegerp\r\n\t\t\r\n@param EXPONENT;\nintegerp\r\n\t\t\r\n@param MODULUS;\nintegerp\r\n\t\t\r\n@return integerp; the result of NUMBER to the power EXPONENT under MODULUS\r\nPerforms exponentiation under modulus. The constant application of the\r\nmodulus operation to intermediate results prevents one from having to deal\r\nwith any number larger than the square of the modulus at any time.")
    public static final SubLObject expt_mod_alt(SubLObject number, SubLObject exponent, SubLObject modulus) {
        {
            SubLObject result = mod(number, modulus);
            SubLObject cdotimes_end_var = subtract(exponent, ONE_INTEGER);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                result = mod(multiply(result, number), modulus);
            }
            return result;
        }
    }

    /**
     *
     *
     * @param NUMBER;
    integerp
     * 		
     * @param EXPONENT;
    integerp
     * 		
     * @param MODULUS;
    integerp
     * 		
     * @return integerp; the result of NUMBER to the power EXPONENT under MODULUS
    Performs exponentiation under modulus. The constant application of the
    modulus operation to intermediate results prevents one from having to deal
    with any number larger than the square of the modulus at any time.
     */
    @LispMethod(comment = "@param NUMBER;\nintegerp\r\n\t\t\r\n@param EXPONENT;\nintegerp\r\n\t\t\r\n@param MODULUS;\nintegerp\r\n\t\t\r\n@return integerp; the result of NUMBER to the power EXPONENT under MODULUS\r\nPerforms exponentiation under modulus. The constant application of the\r\nmodulus operation to intermediate results prevents one from having to deal\r\nwith any number larger than the square of the modulus at any time.")
    public static SubLObject expt_mod(final SubLObject number, final SubLObject exponent, final SubLObject modulus) {
        SubLObject result = mod(number, modulus);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = subtract(exponent, ONE_INTEGER), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            result = mod(multiply(result, number), modulus);
        }
        return result;
    }

    /**
     *
     *
     * @param NUMBER;
    integerp
     * 		
     * @param EXPONENT;
    integerp
     * 		
     * @param MODULUS;
    integerp
     * 		
     * @return integerp; the result of NUMBER to the power EXPONENT under MODULUS
    Performs left-to-right binary exponentiation under modulus:
    1. Converts EXPONENT to binary and removes the most significant digit.
    2. Sets the result to NUMBER. Proceeding from left-to-right, for each 0, takes
    the square of the result, and for each 1, first takes the square of the result,
    and then multiplies the result by NUMBER. Each square/multiplication operation
    is followed by a modulus operation.
     */
    @LispMethod(comment = "@param NUMBER;\nintegerp\r\n\t\t\r\n@param EXPONENT;\nintegerp\r\n\t\t\r\n@param MODULUS;\nintegerp\r\n\t\t\r\n@return integerp; the result of NUMBER to the power EXPONENT under MODULUS\r\nPerforms left-to-right binary exponentiation under modulus:\r\n1. Converts EXPONENT to binary and removes the most significant digit.\r\n2. Sets the result to NUMBER. Proceeding from left-to-right, for each 0, takes\r\nthe square of the result, and for each 1, first takes the square of the result,\r\nand then multiplies the result by NUMBER. Each square/multiplication operation\r\nis followed by a modulus operation.")
    public static final SubLObject binary_expt_mod_alt(SubLObject number, SubLObject exponent, SubLObject modulus) {
        {
            SubLObject binary_exponent = subseq(com.cyc.cycjava.cycl.number_utilities.convert_to_binary(exponent), ONE_INTEGER, UNPROVIDED);
            SubLObject result = mod(number, modulus);
            SubLObject string_var = binary_exponent;
            SubLObject end_var = length(string_var);
            SubLObject end_var_5 = end_var;
            SubLObject char_num = NIL;
            for (char_num = ZERO_INTEGER; !char_num.numGE(end_var_5); char_num = com.cyc.cycjava.cycl.number_utilities.f_1X(char_num)) {
                {
                    SubLObject v_char = Strings.sublisp_char(string_var, char_num);
                    if (v_char == CHAR_0) {
                        result = mod(com.cyc.cycjava.cycl.number_utilities.square(result), modulus);
                    } else {
                        result = mod(com.cyc.cycjava.cycl.number_utilities.square(result), modulus);
                        result = mod(multiply(result, number), modulus);
                    }
                }
            }
            return result;
        }
    }

    /**
     *
     *
     * @param NUMBER;
    integerp
     * 		
     * @param EXPONENT;
    integerp
     * 		
     * @param MODULUS;
    integerp
     * 		
     * @return integerp; the result of NUMBER to the power EXPONENT under MODULUS
    Performs left-to-right binary exponentiation under modulus:
    1. Converts EXPONENT to binary and removes the most significant digit.
    2. Sets the result to NUMBER. Proceeding from left-to-right, for each 0, takes
    the square of the result, and for each 1, first takes the square of the result,
    and then multiplies the result by NUMBER. Each square/multiplication operation
    is followed by a modulus operation.
     */
    @LispMethod(comment = "@param NUMBER;\nintegerp\r\n\t\t\r\n@param EXPONENT;\nintegerp\r\n\t\t\r\n@param MODULUS;\nintegerp\r\n\t\t\r\n@return integerp; the result of NUMBER to the power EXPONENT under MODULUS\r\nPerforms left-to-right binary exponentiation under modulus:\r\n1. Converts EXPONENT to binary and removes the most significant digit.\r\n2. Sets the result to NUMBER. Proceeding from left-to-right, for each 0, takes\r\nthe square of the result, and for each 1, first takes the square of the result,\r\nand then multiplies the result by NUMBER. Each square/multiplication operation\r\nis followed by a modulus operation.")
    public static SubLObject binary_expt_mod(final SubLObject number, final SubLObject exponent, final SubLObject modulus) {
        final SubLObject binary_exponent = subseq(convert_to_binary(exponent), ONE_INTEGER, UNPROVIDED);
        SubLObject result = mod(number, modulus);
        final SubLObject string_var = binary_exponent;
        SubLObject end_var_$5;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        for (end_var = end_var_$5 = length(string_var), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$5); char_num = f_1X(char_num)) {
            v_char = Strings.sublisp_char(string_var, char_num);
            if (v_char.eql(CHAR_0)) {
                result = mod(square(result), modulus);
            } else {
                result = mod(square(result), modulus);
                result = mod(multiply(result, number), modulus);
            }
        }
        return result;
    }

    /**
     *
     *
     * @param N;
    integerp
     * 		
     * @return stringp; string that represents the binary equivalent of N
     */
    @LispMethod(comment = "@param N;\nintegerp\r\n\t\t\r\n@return stringp; string that represents the binary equivalent of N")
    public static final SubLObject convert_to_binary_alt(SubLObject n) {
        return write_to_string(n, new SubLObject[]{ $BASE, TWO_INTEGER });
    }

    /**
     *
     *
     * @param N;
    integerp
     * 		
     * @return stringp; string that represents the binary equivalent of N
     */
    @LispMethod(comment = "@param N;\nintegerp\r\n\t\t\r\n@return stringp; string that represents the binary equivalent of N")
    public static SubLObject convert_to_binary(final SubLObject n) {
        return write_to_string(n, new SubLObject[]{ $BASE, TWO_INTEGER });
    }

    /**
     *
     *
     * @param N;
    integerp
     * 		
     * @return stringp; string that represents the hexadecimal equivalent of N
     */
    @LispMethod(comment = "@param N;\nintegerp\r\n\t\t\r\n@return stringp; string that represents the hexadecimal equivalent of N")
    public static final SubLObject convert_to_hexadecimal_alt(SubLObject n) {
        return format(NIL, $str_alt93$_X, n);
    }

    /**
     *
     *
     * @param N;
    integerp
     * 		
     * @return stringp; string that represents the hexadecimal equivalent of N
     */
    @LispMethod(comment = "@param N;\nintegerp\r\n\t\t\r\n@return stringp; string that represents the hexadecimal equivalent of N")
    public static SubLObject convert_to_hexadecimal(final SubLObject n) {
        return format(NIL, $str106$_X, n);
    }

    /**
     *
     *
     * @param A;
    integerp
     * 		
     * @param B;
    integerp
     * 		
     * @param MODULUS;
    integerp
     * 		
     * @return integerp; the positive equivalent of A minus B in mod MODULUS
     */
    @LispMethod(comment = "@param A;\nintegerp\r\n\t\t\r\n@param B;\nintegerp\r\n\t\t\r\n@param MODULUS;\nintegerp\r\n\t\t\r\n@return integerp; the positive equivalent of A minus B in mod MODULUS")
    public static final SubLObject modular_subtraction_alt(SubLObject a, SubLObject b, SubLObject modulus) {
        return mod(subtract(a, b), modulus);
    }

    /**
     *
     *
     * @param A;
    integerp
     * 		
     * @param B;
    integerp
     * 		
     * @param MODULUS;
    integerp
     * 		
     * @return integerp; the positive equivalent of A minus B in mod MODULUS
     */
    @LispMethod(comment = "@param A;\nintegerp\r\n\t\t\r\n@param B;\nintegerp\r\n\t\t\r\n@param MODULUS;\nintegerp\r\n\t\t\r\n@return integerp; the positive equivalent of A minus B in mod MODULUS")
    public static SubLObject modular_subtraction(final SubLObject a, final SubLObject b, final SubLObject modulus) {
        return mod(subtract(a, b), modulus);
    }

    /**
     *
     *
     * @param A;
    integerp
     * 		
     * @param B;
    integerp
     * 		
     * @param MODULUS;
    integerp
     * 		
     * @return integerp; A + B in mod MODULUS
     */
    @LispMethod(comment = "@param A;\nintegerp\r\n\t\t\r\n@param B;\nintegerp\r\n\t\t\r\n@param MODULUS;\nintegerp\r\n\t\t\r\n@return integerp; A + B in mod MODULUS")
    public static final SubLObject modular_addition_alt(SubLObject a, SubLObject b, SubLObject modulus) {
        return mod(add(a, b), modulus);
    }

    /**
     *
     *
     * @param A;
    integerp
     * 		
     * @param B;
    integerp
     * 		
     * @param MODULUS;
    integerp
     * 		
     * @return integerp; A + B in mod MODULUS
     */
    @LispMethod(comment = "@param A;\nintegerp\r\n\t\t\r\n@param B;\nintegerp\r\n\t\t\r\n@param MODULUS;\nintegerp\r\n\t\t\r\n@return integerp; A + B in mod MODULUS")
    public static SubLObject modular_addition(final SubLObject a, final SubLObject b, final SubLObject modulus) {
        return mod(add(a, b), modulus);
    }

    /**
     *
     *
     * @param A;
    integerp
     * 		
     * @param B;
    integerp
     * 		
     * @param N;
    integerp
     * 		
     * @return boolean; T iff A equals B in mod N
     */
    @LispMethod(comment = "@param A;\nintegerp\r\n\t\t\r\n@param B;\nintegerp\r\n\t\t\r\n@param N;\nintegerp\r\n\t\t\r\n@return boolean; T iff A equals B in mod N")
    public static final SubLObject modularE_alt(SubLObject a, SubLObject b, SubLObject n) {
        return eq(mod(a, n), mod(b, n));
    }

    /**
     *
     *
     * @param A;
    integerp
     * 		
     * @param B;
    integerp
     * 		
     * @param N;
    integerp
     * 		
     * @return boolean; T iff A equals B in mod N
     */
    @LispMethod(comment = "@param A;\nintegerp\r\n\t\t\r\n@param B;\nintegerp\r\n\t\t\r\n@param N;\nintegerp\r\n\t\t\r\n@return boolean; T iff A equals B in mod N")
    public static SubLObject modularE(final SubLObject a, final SubLObject b, final SubLObject n) {
        return eq(mod(a, n), mod(b, n));
    }

    /**
     *
     *
     * @param N;
    integerp
     * 		
     * @return integerp; the number of digits in N
     */
    @LispMethod(comment = "@param N;\nintegerp\r\n\t\t\r\n@return integerp; the number of digits in N")
    public static final SubLObject number_of_digits_alt(SubLObject n) {
        if (n.isNumber()) {
            return n.isNegative() ? ((SubLObject) (subtract(length(write_to_string(n, EMPTY_SUBL_OBJECT_ARRAY)), ONE_INTEGER))) : length(write_to_string(n, EMPTY_SUBL_OBJECT_ARRAY));
        }
        return NIL;
    }

    /**
     *
     *
     * @param N;
    integerp
     * 		
     * @return integerp; the number of digits in N
     */
    @LispMethod(comment = "@param N;\nintegerp\r\n\t\t\r\n@return integerp; the number of digits in N")
    public static SubLObject number_of_digits(final SubLObject n) {
        if (n.isNumber()) {
            return n.isNegative() ? subtract(length(write_to_string(n, EMPTY_SUBL_OBJECT_ARRAY)), ONE_INTEGER) : length(write_to_string(n, EMPTY_SUBL_OBJECT_ARRAY));
        }
        return NIL;
    }

    /**
     *
     *
     * @param SMALL-INT;
    integerp
     * 		
     * @param LARGE-INT;
    integerp
     * 		
     * @return booleanp: T iff LARGE-INT is a multiple of SMALL-INT.
     */
    @LispMethod(comment = "@param SMALL-INT;\nintegerp\r\n\t\t\r\n@param LARGE-INT;\nintegerp\r\n\t\t\r\n@return booleanp: T iff LARGE-INT is a multiple of SMALL-INT.")
    public static final SubLObject multiple_ofP_alt(SubLObject small_int, SubLObject large_int) {
        if ((small_int.isInteger() && large_int.isInteger()) && (!small_int.isZero())) {
            return integerp(divide(large_int, small_int));
        }
        return NIL;
    }

    /**
     *
     *
     * @param SMALL-INT;
    integerp
     * 		
     * @param LARGE-INT;
    integerp
     * 		
     * @return booleanp: T iff LARGE-INT is a multiple of SMALL-INT.
     */
    @LispMethod(comment = "@param SMALL-INT;\nintegerp\r\n\t\t\r\n@param LARGE-INT;\nintegerp\r\n\t\t\r\n@return booleanp: T iff LARGE-INT is a multiple of SMALL-INT.")
    public static SubLObject multiple_ofP(final SubLObject small_int, final SubLObject large_int) {
        if ((small_int.isInteger() && large_int.isInteger()) && (!small_int.isZero())) {
            return integerp(divide(large_int, small_int));
        }
        return NIL;
    }

    /**
     *
     *
     * @param LIST;
     * 		listp of integerp
     * @param LARGE-INT;
    integerp
     * 		
     * @return booleanp: T iff LARGE-INT is a multiple of each and every element of LIST
     */
    @LispMethod(comment = "@param LIST;\r\n\t\tlistp of integerp\r\n@param LARGE-INT;\nintegerp\r\n\t\t\r\n@return booleanp: T iff LARGE-INT is a multiple of each and every element of LIST")
    public static final SubLObject multiple_of_allP_alt(SubLObject list, SubLObject large_int) {
        {
            SubLObject cdolist_list_var = list;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                if (NIL == com.cyc.cycjava.cycl.number_utilities.multiple_ofP(item, large_int)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    /**
     *
     *
     * @param LIST;
     * 		listp of integerp
     * @param LARGE-INT;
    integerp
     * 		
     * @return booleanp: T iff LARGE-INT is a multiple of each and every element of LIST
     */
    @LispMethod(comment = "@param LIST;\r\n\t\tlistp of integerp\r\n@param LARGE-INT;\nintegerp\r\n\t\t\r\n@return booleanp: T iff LARGE-INT is a multiple of each and every element of LIST")
    public static SubLObject multiple_of_allP(final SubLObject list, final SubLObject large_int) {
        SubLObject cdolist_list_var = list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == multiple_ofP(item, large_int)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT a prime number?
     * @unknown baxter
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT a prime number?\r\n@unknown baxter")
    public static final SubLObject prime_numberP_alt(SubLObject v_object) {
        if (NIL == positive_integer_p(v_object)) {
            return NIL;
        } else {
            if (v_object.eql(ONE_INTEGER)) {
                return NIL;
            } else {
                return eql(v_object, com.cyc.cycjava.cycl.number_utilities.find_smallest_divisor(v_object));
            }
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is OBJECT a prime number?
     * @unknown baxter
     */
    @LispMethod(comment = "@return BOOLEANP; Is OBJECT a prime number?\r\n@unknown baxter")
    public static SubLObject prime_numberP(final SubLObject v_object) {
        if (NIL == subl_promotions.positive_integer_p(v_object)) {
            return NIL;
        }
        if (v_object.eql(ONE_INTEGER)) {
            return NIL;
        }
        return eql(v_object, find_smallest_divisor(v_object));
    }

    /**
     *
     *
     * @return LISTP; the unique list of prime numbers, sorted from smallest to largest,
    that multiply together to equal POSITIVE-INTEGER.
     * @unknown -- since we don't consider 1 to be a prime number, 1 is the only positive
    integer that lacks a prime factorization, and we return NIL.
     */
    @LispMethod(comment = "@return LISTP; the unique list of prime numbers, sorted from smallest to largest,\r\nthat multiply together to equal POSITIVE-INTEGER.\r\n@unknown -- since we don\'t consider 1 to be a prime number, 1 is the only positive\r\ninteger that lacks a prime factorization, and we return NIL.")
    public static final SubLObject prime_factorization_alt(SubLObject positive_integer) {
        SubLTrampolineFile.checkType(positive_integer, POSITIVE_INTEGER_P);
        if (positive_integer.eql(ONE_INTEGER)) {
            return NIL;
        }
        {
            SubLObject factorization = NIL;
            while (!ONE_INTEGER.eql(positive_integer)) {
                {
                    SubLObject smallest_divisor = com.cyc.cycjava.cycl.number_utilities.find_smallest_divisor(positive_integer);
                    factorization = cons(smallest_divisor, factorization);
                    positive_integer = divide(positive_integer, smallest_divisor);
                }
            } 
            return Sort.sort(factorization, symbol_function($sym35$_), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return LISTP; the unique list of prime numbers, sorted from smallest to largest,
    that multiply together to equal POSITIVE-INTEGER.
     * @unknown -- since we don't consider 1 to be a prime number, 1 is the only positive
    integer that lacks a prime factorization, and we return NIL.
     */
    @LispMethod(comment = "@return LISTP; the unique list of prime numbers, sorted from smallest to largest,\r\nthat multiply together to equal POSITIVE-INTEGER.\r\n@unknown -- since we don\'t consider 1 to be a prime number, 1 is the only positive\r\ninteger that lacks a prime factorization, and we return NIL.")
    public static SubLObject prime_factorization(SubLObject positive_integer) {
        assert NIL != subl_promotions.positive_integer_p(positive_integer) : "! subl_promotions.positive_integer_p(positive_integer) " + ("subl_promotions.positive_integer_p(positive_integer) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(positive_integer) ") + positive_integer;
        if (positive_integer.eql(ONE_INTEGER)) {
            return NIL;
        }
        SubLObject factorization = NIL;
        while (!ONE_INTEGER.eql(positive_integer)) {
            final SubLObject smallest_divisor = find_smallest_divisor(positive_integer);
            factorization = cons(smallest_divisor, factorization);
            positive_integer = divide(positive_integer, smallest_divisor);
        } 
        return Sort.sort(factorization, symbol_function($sym37$_), UNPROVIDED);
    }

    public static SubLObject common_prime_factors(final SubLObject positive_integer_list) {
        SubLObject prime_factors_list = NIL;
        SubLObject cdolist_list_var = positive_integer_list;
        SubLObject positive_integer = NIL;
        positive_integer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            prime_factors_list = cons(Sort.sort(prime_factorization(abs(positive_integer)), $sym37$_, UNPROVIDED), prime_factors_list);
            cdolist_list_var = cdolist_list_var.rest();
            positive_integer = cdolist_list_var.first();
        } 
        return list_utilities.intersect_sorted_all(prime_factors_list, $sym37$_, UNPROVIDED);
    }

    /**
     *
     *
     * @param POSITIVE-INTEGER;
     * 		a positive integer greater than 1.
     * @return POSITIVE-INTEGER-P; the smallest divisor greater than 1 of POSITIVE-INTEGER.
     * @unknown baxter
     */
    @LispMethod(comment = "@param POSITIVE-INTEGER;\r\n\t\ta positive integer greater than 1.\r\n@return POSITIVE-INTEGER-P; the smallest divisor greater than 1 of POSITIVE-INTEGER.\r\n@unknown baxter")
    public static final SubLObject find_smallest_divisor_alt(SubLObject positive_integer) {
        {
            SubLObject divisor = NIL;
            if (NIL != evenp(positive_integer)) {
                divisor = TWO_INTEGER;
            } else {
                if (mod(positive_integer, THREE_INTEGER).isZero()) {
                    divisor = THREE_INTEGER;
                } else {
                    {
                        SubLObject sqrt = sqrt(positive_integer);
                        SubLObject start = SIX_INTEGER;
                        SubLObject end = com.cyc.cycjava.cycl.number_utilities.f_1X(sqrt);
                        SubLObject squareP = integerp(sqrt);
                        if (NIL != squareP) {
                            divisor = sqrt;
                        }
                        if (NIL == divisor) {
                            {
                                SubLObject end_var = end;
                                SubLObject i = NIL;
                                for (i = start; !((NIL != divisor) || i.numGE(end_var)); i = add(i, SIX_INTEGER)) {
                                    if (mod(positive_integer, com.cyc.cycjava.cycl.number_utilities.f_1_(i)).isZero()) {
                                        divisor = com.cyc.cycjava.cycl.number_utilities.f_1_(i);
                                    } else {
                                        if (mod(positive_integer, com.cyc.cycjava.cycl.number_utilities.f_1X(i)).isZero()) {
                                            divisor = com.cyc.cycjava.cycl.number_utilities.f_1X(i);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL != divisor ? ((SubLObject) (divisor)) : positive_integer;
        }
    }

    /**
     *
     *
     * @param POSITIVE-INTEGER;
     * 		a positive integer greater than 1.
     * @return POSITIVE-INTEGER-P; the smallest divisor greater than 1 of POSITIVE-INTEGER.
     * @unknown baxter
     */
    @LispMethod(comment = "@param POSITIVE-INTEGER;\r\n\t\ta positive integer greater than 1.\r\n@return POSITIVE-INTEGER-P; the smallest divisor greater than 1 of POSITIVE-INTEGER.\r\n@unknown baxter")
    public static SubLObject find_smallest_divisor(final SubLObject positive_integer) {
        SubLObject divisor = NIL;
        if ((NIL == subl_promotions.positive_integer_p(positive_integer)) || (!positive_integer.numG(ONE_INTEGER))) {
            Errors.error($str107$_A_is_not_a_positive_integer_grea, positive_integer);
        } else
            if (NIL != evenp(positive_integer)) {
                divisor = TWO_INTEGER;
            } else
                if (mod(positive_integer, THREE_INTEGER).isZero()) {
                    divisor = THREE_INTEGER;
                } else {
                    final SubLObject isqrt = isqrt(positive_integer);
                    final SubLObject start = SIX_INTEGER;
                    final SubLObject end = add(TWO_INTEGER, isqrt);
                    final SubLObject squareP = numE(positive_integer, multiply(isqrt, isqrt));
                    if (NIL != squareP) {
                        divisor = find_smallest_divisor(isqrt);
                    }
                    if (NIL == divisor) {
                        SubLObject end_var;
                        SubLObject i;
                        for (end_var = end, i = NIL, i = start; (NIL == divisor) && (!i.numGE(end_var)); i = add(i, SIX_INTEGER)) {
                            if (mod(positive_integer, f_1_(i)).isZero()) {
                                divisor = f_1_(i);
                            } else
                                if (mod(positive_integer, f_1X(i)).isZero()) {
                                    divisor = f_1X(i);
                                }

                        }
                    }
                }


        return NIL != divisor ? divisor : positive_integer;
    }

    public static SubLObject divisors(final SubLObject positive_integer) {
        assert NIL != subl_promotions.positive_integer_p(positive_integer) : "! subl_promotions.positive_integer_p(positive_integer) " + ("subl_promotions.positive_integer_p(positive_integer) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(positive_integer) ") + positive_integer;
        final SubLObject factorization = prime_factorization(positive_integer);
        final SubLObject factor_lists = delete_duplicates(list_utilities.powerset(factorization), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject divisors = delete_duplicates(list_utilities.nmapcar(symbol_function(PRODUCT), factor_lists), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return Sort.sort(divisors, symbol_function($sym37$_), UNPROVIDED);
    }

    /**
     *
     *
     * @param INTS;
     * 		listp of integerp
     * @return integerp
    Given an empty list, returns 1.
    If INTS has exactly one distinct element, returns the absolute value of it, otherwise:
    If any element of INTS is 0, returns 0, otherwise:
    Returns the positive-integer-p that is the least common multiple of the elements of INTS.
     */
    @LispMethod(comment = "@param INTS;\r\n\t\tlistp of integerp\r\n@return integerp\r\nGiven an empty list, returns 1.\r\nIf INTS has exactly one distinct element, returns the absolute value of it, otherwise:\r\nIf any element of INTS is 0, returns 0, otherwise:\r\nReturns the positive-integer-p that is the least common multiple of the elements of INTS.")
    public static final SubLObject lcm_alt(SubLObject ints) {
        {
            SubLObject list_var = ints;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, INTEGERP);
                }
            }
        }
        if (NIL == ints) {
            return ONE_INTEGER;
        }
        {
            SubLObject pos_ints = copy_list(ints);
            pos_ints = list_utilities.nmapcar(symbol_function(ABS), pos_ints);
            pos_ints = list_utilities.fast_delete_duplicates(pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.singletonP(pos_ints)) {
                return pos_ints.first();
            }
            if (NIL != memberP(ZERO_INTEGER, pos_ints, UNPROVIDED, UNPROVIDED)) {
                return ZERO_INTEGER;
            }
            return creduce(symbol_function(LCM2_INTERNAL), pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param INTS;
     * 		listp of integerp
     * @return integerp
    Given an empty list, returns 1.
    If INTS has exactly one distinct element, returns the absolute value of it, otherwise:
    If any element of INTS is 0, returns 0, otherwise:
    Returns the positive-integer-p that is the least common multiple of the elements of INTS.
     */
    @LispMethod(comment = "@param INTS;\r\n\t\tlistp of integerp\r\n@return integerp\r\nGiven an empty list, returns 1.\r\nIf INTS has exactly one distinct element, returns the absolute value of it, otherwise:\r\nIf any element of INTS is 0, returns 0, otherwise:\r\nReturns the positive-integer-p that is the least common multiple of the elements of INTS.")
    public static SubLObject lcm(final SubLObject ints) {
        assert NIL != list_utilities.non_dotted_list_p(ints) : "! list_utilities.non_dotted_list_p(ints) " + ("list_utilities.non_dotted_list_p(ints) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(ints) ") + ints;
        SubLObject cdolist_list_var = ints;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != integerp(elem) : "! integerp(elem) " + ("Types.integerp(elem) " + "CommonSymbols.NIL != Types.integerp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL == ints) {
            return ONE_INTEGER;
        }
        SubLObject pos_ints = copy_list(ints);
        pos_ints = list_utilities.nmapcar(symbol_function(ABS), pos_ints);
        pos_ints = list_utilities.fast_delete_duplicates(pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(pos_ints)) {
            return pos_ints.first();
        }
        if (NIL != subl_promotions.memberP(ZERO_INTEGER, pos_ints, UNPROVIDED, UNPROVIDED)) {
            return ZERO_INTEGER;
        }
        return creduce(symbol_function(LCM2_INTERNAL), pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param INT1;
    integerp
     * 		
     * @param INT2;
    integerp
     * 		
     * @return integerp
    If either arg is 0, returns 0, otherwise:
    returns the positive-integer-p that is the least common multiple of the args.
     */
    @LispMethod(comment = "@param INT1;\nintegerp\r\n\t\t\r\n@param INT2;\nintegerp\r\n\t\t\r\n@return integerp\r\nIf either arg is 0, returns 0, otherwise:\r\nreturns the positive-integer-p that is the least common multiple of the args.")
    public static final SubLObject lcm2_alt(SubLObject int1, SubLObject int2) {
        SubLTrampolineFile.checkType(int1, INTEGERP);
        SubLTrampolineFile.checkType(int2, INTEGERP);
        if (int1.isZero() || int2.isZero()) {
            return ZERO_INTEGER;
        }
        return com.cyc.cycjava.cycl.number_utilities.lcm2_internal(abs(int1), abs(int2));
    }

    /**
     *
     *
     * @param INT1;
    integerp
     * 		
     * @param INT2;
    integerp
     * 		
     * @return integerp
    If either arg is 0, returns 0, otherwise:
    returns the positive-integer-p that is the least common multiple of the args.
     */
    @LispMethod(comment = "@param INT1;\nintegerp\r\n\t\t\r\n@param INT2;\nintegerp\r\n\t\t\r\n@return integerp\r\nIf either arg is 0, returns 0, otherwise:\r\nreturns the positive-integer-p that is the least common multiple of the args.")
    public static SubLObject lcm2(final SubLObject int1, final SubLObject int2) {
        assert NIL != integerp(int1) : "! integerp(int1) " + ("Types.integerp(int1) " + "CommonSymbols.NIL != Types.integerp(int1) ") + int1;
        assert NIL != integerp(int2) : "! integerp(int2) " + ("Types.integerp(int2) " + "CommonSymbols.NIL != Types.integerp(int2) ") + int2;
        if (int1.isZero() || int2.isZero()) {
            return ZERO_INTEGER;
        }
        return lcm2_internal(abs(int1), abs(int2));
    }

    public static final SubLObject lcm2_internal_alt(SubLObject int1, SubLObject int2) {
        {
            SubLObject gcd = com.cyc.cycjava.cycl.number_utilities.gcd2_internal(int1, int2);
            return multiply(int2, divide(int1, gcd));
        }
    }

    public static SubLObject lcm2_internal(final SubLObject int1, final SubLObject int2) {
        final SubLObject gcd = gcd2_internal(int1, int2);
        return multiply(int2, integerDivide(int1, gcd));
    }

    /**
     *
     *
     * @param INTS;
     * 		listp of integerp's
     * @return integerp
    Given an empty list, returns 0.  (This is the same as the CL version of gcd.)
    If INTS has exactly one distinct non-zero element, returns the absolute value of it, otherwise:
    Returns the positive-integer-p that is the greatest common divisor of the non-zero elements of INTS.
     */
    @LispMethod(comment = "@param INTS;\r\n\t\tlistp of integerp\'s\r\n@return integerp\r\nGiven an empty list, returns 0.  (This is the same as the CL version of gcd.)\r\nIf INTS has exactly one distinct non-zero element, returns the absolute value of it, otherwise:\r\nReturns the positive-integer-p that is the greatest common divisor of the non-zero elements of INTS.")
    public static final SubLObject gcd_alt(SubLObject ints) {
        {
            SubLObject list_var = ints;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, INTEGERP);
                }
            }
        }
        if (NIL == ints) {
            return ZERO_INTEGER;
        }
        {
            SubLObject pos_ints = copy_list(ints);
            pos_ints = list_utilities.nmapcar(symbol_function(ABS), pos_ints);
            pos_ints = list_utilities.fast_delete_duplicates(pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.singletonP(pos_ints)) {
                return pos_ints.first();
            }
            return creduce(symbol_function(GCD2_INTERNAL), pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param INTS;
     * 		listp of integerp's
     * @return integerp
    Given an empty list, returns 0.  (This is the same as the CL version of gcd.)
    If INTS has exactly one distinct non-zero element, returns the absolute value of it, otherwise:
    Returns the positive-integer-p that is the greatest common divisor of the non-zero elements of INTS.
     */
    @LispMethod(comment = "@param INTS;\r\n\t\tlistp of integerp\'s\r\n@return integerp\r\nGiven an empty list, returns 0.  (This is the same as the CL version of gcd.)\r\nIf INTS has exactly one distinct non-zero element, returns the absolute value of it, otherwise:\r\nReturns the positive-integer-p that is the greatest common divisor of the non-zero elements of INTS.")
    public static SubLObject gcd(final SubLObject ints) {
        assert NIL != list_utilities.non_dotted_list_p(ints) : "! list_utilities.non_dotted_list_p(ints) " + ("list_utilities.non_dotted_list_p(ints) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(ints) ") + ints;
        SubLObject cdolist_list_var = ints;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != integerp(elem) : "! integerp(elem) " + ("Types.integerp(elem) " + "CommonSymbols.NIL != Types.integerp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL == ints) {
            return ZERO_INTEGER;
        }
        SubLObject pos_ints = copy_list(ints);
        pos_ints = list_utilities.nmapcar(symbol_function(ABS), pos_ints);
        pos_ints = list_utilities.fast_delete_duplicates(pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(pos_ints)) {
            return pos_ints.first();
        }
        return creduce(symbol_function(GCD2_INTERNAL), pos_ints, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param INT1;
    integerp
     * 		
     * @param INT2;
    integerp
     * 		
     * @return integerp; the greatest common divisor of INT1 and INT2.
     */
    @LispMethod(comment = "@param INT1;\nintegerp\r\n\t\t\r\n@param INT2;\nintegerp\r\n\t\t\r\n@return integerp; the greatest common divisor of INT1 and INT2.")
    public static final SubLObject gcd2_alt(SubLObject int1, SubLObject int2) {
        SubLTrampolineFile.checkType(int1, INTEGERP);
        SubLTrampolineFile.checkType(int2, INTEGERP);
        return com.cyc.cycjava.cycl.number_utilities.gcd2_internal(abs(int1), abs(int2));
    }

    /**
     *
     *
     * @param INT1;
    integerp
     * 		
     * @param INT2;
    integerp
     * 		
     * @return integerp; the greatest common divisor of INT1 and INT2.
     */
    @LispMethod(comment = "@param INT1;\nintegerp\r\n\t\t\r\n@param INT2;\nintegerp\r\n\t\t\r\n@return integerp; the greatest common divisor of INT1 and INT2.")
    public static SubLObject gcd2(final SubLObject int1, final SubLObject int2) {
        assert NIL != integerp(int1) : "! integerp(int1) " + ("Types.integerp(int1) " + "CommonSymbols.NIL != Types.integerp(int1) ") + int1;
        assert NIL != integerp(int2) : "! integerp(int2) " + ("Types.integerp(int2) " + "CommonSymbols.NIL != Types.integerp(int2) ") + int2;
        return gcd2_internal(abs(int1), abs(int2));
    }

    public static final SubLObject gcd2_internal_alt(SubLObject int1, SubLObject int2) {
        if (int1.numG(int2)) {
            return com.cyc.cycjava.cycl.number_utilities.gcd2_sorted_internal(int1, int2);
        } else {
            return com.cyc.cycjava.cycl.number_utilities.gcd2_sorted_internal(int2, int1);
        }
    }

    public static SubLObject gcd2_internal(final SubLObject int1, final SubLObject int2) {
        if (int1.numG(int2)) {
            return gcd2_sorted_internal(int1, int2);
        }
        return gcd2_sorted_internal(int2, int1);
    }

    public static final SubLObject gcd2_sorted_internal_alt(SubLObject greater, SubLObject lesser) {
        if (lesser.isZero()) {
            return greater;
        }
        return com.cyc.cycjava.cycl.number_utilities.gcd2_sorted_internal(lesser, mod(greater, lesser));
    }

    public static SubLObject gcd2_sorted_internal(final SubLObject greater, final SubLObject lesser) {
        if (lesser.isZero()) {
            return greater;
        }
        return gcd2_sorted_internal(lesser, mod(greater, lesser));
    }

    /**
     *
     *
     * @param NUMBER-STRING;
     * 		a string representing a number in base 16
     * @return integerp; the decimal integer equivalent of the hexadecimal NUMBER-STRING
     */
    @LispMethod(comment = "@param NUMBER-STRING;\r\n\t\ta string representing a number in base 16\r\n@return integerp; the decimal integer equivalent of the hexadecimal NUMBER-STRING")
    public static final SubLObject convert_hexadecimal_to_decimal_alt(SubLObject number_string) {
        {
            SubLObject rev_number = reverse(number_string);
            SubLObject length_number = length(rev_number);
            SubLObject result = ZERO_INTEGER;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(length_number); i = add(i, ONE_INTEGER)) {
                result = add(result, multiply(expt(SIXTEEN_INTEGER, i), com.cyc.cycjava.cycl.number_utilities.decimal_code_for_hex_digit(aref(rev_number, i))));
            }
            return result;
        }
    }

    /**
     *
     *
     * @param NUMBER-STRING;
     * 		a string representing a number in base 16
     * @return integerp; the decimal integer equivalent of the hexadecimal NUMBER-STRING
     */
    @LispMethod(comment = "@param NUMBER-STRING;\r\n\t\ta string representing a number in base 16\r\n@return integerp; the decimal integer equivalent of the hexadecimal NUMBER-STRING")
    public static SubLObject convert_hexadecimal_to_decimal(final SubLObject number_string) {
        final SubLObject rev_number = reverse(number_string);
        final SubLObject length_number = length(rev_number);
        SubLObject result = ZERO_INTEGER;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length_number); i = add(i, ONE_INTEGER)) {
            result = add(result, multiply(expt(SIXTEEN_INTEGER, i), decimal_code_for_hex_digit(aref(rev_number, i))));
        }
        return result;
    }

    public static final SubLObject decimal_code_for_hex_digit_alt(SubLObject v_char) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject code = digit_char_p(v_char, UNPROVIDED);
                if (NIL == code) {
                    code = second(assoc(v_char, $hex_to_dec_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                }
                return code;
            }
        }
    }

    public static SubLObject decimal_code_for_hex_digit(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject code = digit_char_p(v_char, UNPROVIDED);
        if (NIL == code) {
            code = second(assoc(v_char, $hex_to_dec_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
        return code;
    }

    /**
     *
     *
     * @param PROBABILITY
     * 		probability-p
     * 		Executes BODY with probability PROBABILITY.
     */
    @LispMethod(comment = "@param PROBABILITY\r\n\t\tprobability-p\r\n\t\tExecutes BODY with probability PROBABILITY.")
    public static final SubLObject with_probability_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject probability = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt99);
            probability = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject prob = $sym100$PROB;
                return list(CLET, list(list(prob, probability)), listS(CHECK_TYPE, prob, $list_alt102), listS(PWHEN, list(TRUE_WITH_PROBABILITY, prob), append(body, NIL)));
            }
        }
    }

    /**
     *
     *
     * @param PROBABILITY
     * 		probability-p
     * 		Executes BODY with probability PROBABILITY.
     */
    @LispMethod(comment = "@param PROBABILITY\r\n\t\tprobability-p\r\n\t\tExecutes BODY with probability PROBABILITY.")
    public static SubLObject with_probability(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject probability = NIL;
        destructuring_bind_must_consp(current, datum, $list116);
        probability = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject prob = $sym117$PROB;
        return list(CLET, list(list(prob, probability)), listS(CHECK_TYPE, prob, $list119), listS(PWHEN, list(TRUE_WITH_PROBABILITY, prob), append(body, NIL)));
    }

    public static final SubLObject probability_p_alt(SubLObject v_object) {
        return cyc_real_0_1(v_object);
    }

    public static SubLObject probability_p(final SubLObject v_object) {
        return collection_defns.cyc_real_0_1(v_object);
    }

    /**
     *
     *
     * @unknown T with probability P and NIL otherwise.
     * @param P
    probability-p
     * 		
     */
    @LispMethod(comment = "@unknown T with probability P and NIL otherwise.\r\n@param P\nprobability-p")
    public static final SubLObject true_with_probability_alt(SubLObject p) {
        SubLTrampolineFile.checkType(p, PROBABILITY_P);
        if (ONE_INTEGER.numE(p)) {
            return T;
        } else {
            if (ZERO_INTEGER.numE(p)) {
                return NIL;
            } else {
                return com.cyc.cycjava.cycl.number_utilities.true_with_probability_int(p, ONE_INTEGER);
            }
        }
    }

    /**
     *
     *
     * @unknown T with probability P and NIL otherwise.
     * @param P
    probability-p
     * 		
     */
    @LispMethod(comment = "@unknown T with probability P and NIL otherwise.\r\n@param P\nprobability-p")
    public static SubLObject true_with_probability(final SubLObject p) {
        assert NIL != probability_p(p) : "! number_utilities.probability_p(p) " + ("number_utilities.probability_p(p) " + "CommonSymbols.NIL != number_utilities.probability_p(p) ") + p;
        if (ONE_INTEGER.numE(p)) {
            return T;
        }
        if (ZERO_INTEGER.numE(p)) {
            return NIL;
        }
        return true_with_probability_int(p, ONE_INTEGER);
    }

    public static final SubLObject true_with_probability_int_alt(SubLObject p, SubLObject scaling_factor) {
        {
            SubLObject reciprocal = round(divide(ONE_INTEGER, p), UNPROVIDED);
            if (reciprocal.numG(scaling_factor)) {
                return numL(random.random(reciprocal), scaling_factor);
            } else {
                {
                    SubLObject new_scaling_factor = multiply($int$1000, scaling_factor);
                    SubLObject new_p = divide(p, $int$1000);
                    return com.cyc.cycjava.cycl.number_utilities.true_with_probability_int(new_p, new_scaling_factor);
                }
            }
        }
    }

    public static SubLObject true_with_probability_int(final SubLObject p, final SubLObject scaling_factor) {
        final SubLObject reciprocal = round(divide(ONE_INTEGER, p), UNPROVIDED);
        if (reciprocal.numG(scaling_factor)) {
            return numL(random.random(reciprocal), scaling_factor);
        }
        final SubLObject new_scaling_factor = multiply($int$1000, scaling_factor);
        final SubLObject new_p = divide(p, $int$1000);
        return true_with_probability_int(new_p, new_scaling_factor);
    }

    public static SubLObject logistic(final SubLObject num) {
        return divide(ONE_INTEGER, add(ONE_INTEGER, expt($e$.getGlobalValue(), minus(num))));
    }

    public static final SubLObject coin_flip_alt() {
        return zerop(random.random(TWO_INTEGER));
    }

    public static SubLObject coin_flip() {
        return zerop(random.random(TWO_INTEGER));
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a property list whose values are non-negative numbers that sum to 1.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a property list whose values are non-negative numbers that sum to 1.")
    public static final SubLObject probability_distribution_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.property_list_p(v_object)) {
            {
                SubLObject sum = ZERO_INTEGER;
                SubLObject remainder = NIL;
                for (remainder = v_object; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        if (NIL != com.cyc.cycjava.cycl.number_utilities.non_negative_number_p(value)) {
                            sum = add(sum, value);
                        } else {
                            return NIL;
                        }
                    }
                }
                if (abs(com.cyc.cycjava.cycl.number_utilities.f_1_(sum)).numL($float$1_0e_5)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a property list whose values are non-negative numbers that sum to 1.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a property list whose values are non-negative numbers that sum to 1.")
    public static SubLObject probability_distribution_p(final SubLObject v_object) {
        if (NIL != list_utilities.property_list_p(v_object)) {
            SubLObject sum = ZERO_INTEGER;
            SubLObject remainder;
            SubLObject property;
            SubLObject value;
            for (remainder = NIL, remainder = v_object; NIL != remainder; remainder = cddr(remainder)) {
                property = remainder.first();
                value = cadr(remainder);
                if (NIL == non_negative_number_p(value)) {
                    return NIL;
                }
                sum = add(sum, value);
            }
            if (abs(f_1_(sum)).numL($float$1_0e_5)) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject probability_distribution_sample_alt(SubLObject dist) {
        SubLTrampolineFile.checkType(dist, PROBABILITY_DISTRIBUTION_P);
        {
            SubLObject p = com.cyc.cycjava.cycl.number_utilities.random_probability();
            SubLObject sum_so_far = ZERO_INTEGER;
            SubLObject remainder = NIL;
            for (remainder = dist; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject item = remainder.first();
                    SubLObject probability = cadr(remainder);
                    sum_so_far = add(sum_so_far, probability);
                    if (p.numL(sum_so_far)) {
                        return item;
                    }
                }
            }
            return Errors.error($str_alt109$Error_sampling_from__s____s__s_, dist, p, sum_so_far);
        }
    }

    public static SubLObject probability_distribution_sample(final SubLObject dist) {
        assert NIL != probability_distribution_p(dist) : "! number_utilities.probability_distribution_p(dist) " + ("number_utilities.probability_distribution_p(dist) " + "CommonSymbols.NIL != number_utilities.probability_distribution_p(dist) ") + dist;
        final SubLObject p = random_probability();
        SubLObject sum_so_far = ZERO_INTEGER;
        SubLObject remainder;
        SubLObject item;
        SubLObject probability;
        for (remainder = NIL, remainder = dist; NIL != remainder; remainder = cddr(remainder)) {
            item = remainder.first();
            probability = cadr(remainder);
            sum_so_far = add(sum_so_far, probability);
            if (p.numL(sum_so_far)) {
                return item;
            }
        }
        return Errors.error($str126$Error_sampling_from__s____s__s_, dist, p, sum_so_far);
    }

    public static final SubLObject fibonacci_alt(SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
            {
                SubLObject fib = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt111$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                fib = com.cyc.cycjava.cycl.number_utilities.fibonacci_memoized(n);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return fib;
            }
        }
    }

    public static SubLObject fibonacci(final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        SubLObject fib = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                fib = fibonacci_memoized(n);
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return fib;
    }

    public static final SubLObject fibonacci_memoized_internal_alt(SubLObject n) {
        {
            SubLObject pcase_var = n;
            if (pcase_var.eql(ZERO_INTEGER)) {
                return ONE_INTEGER;
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return ONE_INTEGER;
                } else {
                    return add(com.cyc.cycjava.cycl.number_utilities.fibonacci_memoized(subtract(n, ONE_INTEGER)), com.cyc.cycjava.cycl.number_utilities.fibonacci_memoized(subtract(n, TWO_INTEGER)));
                }
            }
        }
    }

    public static SubLObject fibonacci_memoized_internal(final SubLObject n) {
        if (n.eql(ZERO_INTEGER)) {
            return ONE_INTEGER;
        }
        if (n.eql(ONE_INTEGER)) {
            return ONE_INTEGER;
        }
        return add(fibonacci_memoized(subtract(n, ONE_INTEGER)), fibonacci_memoized(subtract(n, TWO_INTEGER)));
    }

    public static final SubLObject fibonacci_memoized_alt(SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.number_utilities.fibonacci_memoized_internal(n);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIBONACCI_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIBONACCI_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, FIBONACCI_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, n, $kw113$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw113$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.number_utilities.fibonacci_memoized_internal(n)));
                        memoization_state.caching_state_put(caching_state, n, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject fibonacci_memoized(final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return fibonacci_memoized_internal(n);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FIBONACCI_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FIBONACCI_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FIBONACCI_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, n, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(fibonacci_memoized_internal(n)));
            memoization_state.caching_state_put(caching_state, n, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return non-negative-number-p; a random number in the range [0,1)
     */
    @LispMethod(comment = "@return non-negative-number-p; a random number in the range [0,1)")
    public static final SubLObject random_0_1_alt() {
        return divide(random.random(random.$rand_max$.getGlobalValue()), random.$rand_max$.getGlobalValue());
    }

    /**
     *
     *
     * @return non-negative-number-p; a random number in the range [0,1)
     */
    @LispMethod(comment = "@return non-negative-number-p; a random number in the range [0,1)")
    public static SubLObject random_0_1() {
        return divide(random.random(random.$rand_max$.getGlobalValue()), random.$rand_max$.getGlobalValue());
    }

    /**
     *
     *
     * @unknown this will never generate a probability of 1.
     */
    @LispMethod(comment = "@unknown this will never generate a probability of 1.")
    public static final SubLObject random_probability_alt() {
        return com.cyc.cycjava.cycl.number_utilities.random_0_1();
    }

    /**
     *
     *
     * @unknown this will never generate a probability of 1.
     */
    @LispMethod(comment = "@unknown this will never generate a probability of 1.")
    public static SubLObject random_probability() {
        return random_0_1();
    }

    /**
     * Returns a list of N distinct random non-negative integers less than LIMIT.
     * If N is greater than or equal to LIMIT, then it returns a randomized list of
     * all non-negative integers less than LIMIT.
     * If SORT-FUNCTION is non-nil, then the result will be sorted by SORT-FUNCTION.
     */
    @LispMethod(comment = "Returns a list of N distinct random non-negative integers less than LIMIT.\r\nIf N is greater than or equal to LIMIT, then it returns a randomized list of\r\nall non-negative integers less than LIMIT.\r\nIf SORT-FUNCTION is non-nil, then the result will be sorted by SORT-FUNCTION.\nReturns a list of N distinct random non-negative integers less than LIMIT.\nIf N is greater than or equal to LIMIT, then it returns a randomized list of\nall non-negative integers less than LIMIT.\nIf SORT-FUNCTION is non-nil, then the result will be sorted by SORT-FUNCTION.")
    public static final SubLObject n_random_integers_alt(SubLObject n, SubLObject limit, SubLObject sort_function) {
        if (sort_function == UNPROVIDED) {
            sort_function = NIL;
        }
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(limit, POSITIVE_INTEGER_P);
        if (NIL != sort_function) {
            SubLTrampolineFile.checkType(sort_function, FUNCTION_SPEC_P);
        }
        {
            SubLObject list = com.cyc.cycjava.cycl.number_utilities.non_negative_integers_less_than(limit);
            SubLObject result = list_utilities.random_n(n, list);
            return NIL != sort_function ? ((SubLObject) (Sort.sort(result, sort_function, UNPROVIDED))) : result;
        }
    }

    @LispMethod(comment = "Returns a list of N distinct random non-negative integers less than LIMIT.\r\nIf N is greater than or equal to LIMIT, then it returns a randomized list of\r\nall non-negative integers less than LIMIT.\r\nIf SORT-FUNCTION is non-nil, then the result will be sorted by SORT-FUNCTION.\nReturns a list of N distinct random non-negative integers less than LIMIT.\nIf N is greater than or equal to LIMIT, then it returns a randomized list of\nall non-negative integers less than LIMIT.\nIf SORT-FUNCTION is non-nil, then the result will be sorted by SORT-FUNCTION.")
    public static SubLObject n_random_integers(final SubLObject n, final SubLObject limit, SubLObject sort_function) {
        if (sort_function == UNPROVIDED) {
            sort_function = NIL;
        }
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        assert NIL != subl_promotions.positive_integer_p(limit) : "! subl_promotions.positive_integer_p(limit) " + ("subl_promotions.positive_integer_p(limit) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(limit) ") + limit;
        if (((NIL != sort_function) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == function_spec_p(sort_function))) {
            throw new AssertionError(sort_function);
        }
        final SubLObject list = non_negative_integers_less_than(limit);
        final SubLObject result = list_utilities.random_n(n, list);
        return NIL != sort_function ? Sort.sort(result, sort_function, UNPROVIDED) : result;
    }

    /**
     * Returns a list of all non-negative integers less than LIMIT, from zero ascending.
     */
    @LispMethod(comment = "Returns a list of all non-negative integers less than LIMIT, from zero ascending.")
    public static final SubLObject non_negative_integers_less_than_alt(SubLObject limit) {
        SubLTrampolineFile.checkType(limit, POSITIVE_INTEGER_P);
        {
            SubLObject list = make_list(limit, UNPROVIDED);
            SubLObject cursor = list;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(limit); i = add(i, ONE_INTEGER)) {
                rplaca(cursor, i);
                cursor = cursor.rest();
            }
            return list;
        }
    }

    @LispMethod(comment = "Returns a list of all non-negative integers less than LIMIT, from zero ascending.")
    public static SubLObject non_negative_integers_less_than(final SubLObject limit) {
        assert NIL != subl_promotions.positive_integer_p(limit) : "! subl_promotions.positive_integer_p(limit) " + ("subl_promotions.positive_integer_p(limit) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(limit) ") + limit;
        SubLObject cursor;
        final SubLObject list = cursor = make_list(limit, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(limit); i = add(i, ONE_INTEGER)) {
            rplaca(cursor, i);
            cursor = cursor.rest();
        }
        return list;
    }

    /**
     *
     *
     * @return listp; the differences between each successive pair of numbers in NUMBERS.
    If LAST is provided, it acts as the N+1'th number, otherwise only N-1 numbers will be returned.
     */
    @LispMethod(comment = "@return listp; the differences between each successive pair of numbers in NUMBERS.\r\nIf LAST is provided, it acts as the N+1\'th number, otherwise only N-1 numbers will be returned.")
    public static final SubLObject compute_deltas_alt(SubLObject numbers, SubLObject last) {
        if (last == UNPROVIDED) {
            last = NIL;
        }
        {
            SubLObject deltas = NIL;
            if (NIL != numbers) {
                {
                    SubLObject datum = numbers;
                    SubLObject current = datum;
                    SubLObject first = NIL;
                    SubLObject rest = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt115);
                    first = current.first();
                    current = current.rest();
                    rest = current;
                    {
                        SubLObject previous = first;
                        SubLObject cdolist_list_var = rest;
                        SubLObject next = NIL;
                        for (next = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , next = cdolist_list_var.first()) {
                            {
                                SubLObject delta = subtract(next, previous);
                                deltas = cons(delta, deltas);
                                previous = next;
                            }
                        }
                        if (NIL != last) {
                            {
                                SubLObject last_delta = subtract(last, previous);
                                deltas = cons(last_delta, deltas);
                            }
                        }
                    }
                }
            }
            return nreverse(deltas);
        }
    }

    /**
     *
     *
     * @return listp; the differences between each successive pair of numbers in NUMBERS.
    If LAST is provided, it acts as the N+1'th number, otherwise only N-1 numbers will be returned.
     */
    @LispMethod(comment = "@return listp; the differences between each successive pair of numbers in NUMBERS.\r\nIf LAST is provided, it acts as the N+1\'th number, otherwise only N-1 numbers will be returned.")
    public static SubLObject compute_deltas(final SubLObject numbers, SubLObject last) {
        if (last == UNPROVIDED) {
            last = NIL;
        }
        SubLObject deltas = NIL;
        if (NIL != numbers) {
            SubLObject first = NIL;
            SubLObject rest = NIL;
            destructuring_bind_must_consp(numbers, numbers, $list130);
            first = numbers.first();
            final SubLObject current = rest = numbers.rest();
            SubLObject previous = first;
            SubLObject cdolist_list_var = rest;
            SubLObject next = NIL;
            next = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject delta = subtract(next, previous);
                deltas = cons(delta, deltas);
                previous = next;
                cdolist_list_var = cdolist_list_var.rest();
                next = cdolist_list_var.first();
            } 
            if (NIL != last) {
                final SubLObject last_delta = subtract(last, previous);
                deltas = cons(last_delta, deltas);
            }
        }
        return nreverse(deltas);
    }

    public static final SubLObject factorial_alt(SubLObject n) {
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject accumulator = ONE_INTEGER;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                accumulator = multiply(accumulator, com.cyc.cycjava.cycl.number_utilities.f_1X(i));
            }
            return accumulator;
        }
    }

    public static SubLObject factorial(final SubLObject n) {
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        SubLObject accumulator = ONE_INTEGER;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            accumulator = multiply(accumulator, f_1X(i));
        }
        return accumulator;
    }

    /**
     * n choose k
     *
     * @see http://mathworld.wolfram.com/BinomialCoefficient.html
     */
    @LispMethod(comment = "n choose k\r\n\r\n@see http://mathworld.wolfram.com/BinomialCoefficient.html")
    public static final SubLObject choose_alt(SubLObject n, SubLObject k) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
            SubLTrampolineFile.checkType(k, NON_NEGATIVE_INTEGER_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!k.numLE(n)) {
                    Errors.error($str_alt116$_s_must_be_____s, n, k);
                }
            }
            {
                SubLObject accumulator = ONE_INTEGER;
                SubLObject end_var = subtract(n, k);
                SubLObject i = NIL;
                for (i = n; !i.numLE(end_var); i = add(i, MINUS_ONE_INTEGER)) {
                    SubLTrampolineFile.checkType(i, POSITIVE_INTEGER_P);
                    accumulator = multiply(accumulator, i);
                }
                return integerDivide(accumulator, com.cyc.cycjava.cycl.number_utilities.factorial(k));
            }
        }
    }

    @LispMethod(comment = "n choose k\r\n\r\n@see http://mathworld.wolfram.com/BinomialCoefficient.html")
    public static SubLObject choose(final SubLObject n, final SubLObject k) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        assert NIL != subl_promotions.non_negative_integer_p(k) : "! subl_promotions.non_negative_integer_p(k) " + ("subl_promotions.non_negative_integer_p(k) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(k) ") + k;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!k.numLE(n))) {
            Errors.error($str131$_s_must_be_____s, n, k);
        }
        SubLObject accumulator = ONE_INTEGER;
        SubLObject end_var;
        SubLObject i;
        for (end_var = subtract(n, k), i = NIL, i = n; !i.numLE(end_var); i = add(i, MINUS_ONE_INTEGER)) {
            assert NIL != subl_promotions.positive_integer_p(i) : "! subl_promotions.positive_integer_p(i) " + ("subl_promotions.positive_integer_p(i) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(i) ") + i;
            accumulator = multiply(accumulator, i);
        }
        return integerDivide(accumulator, factorial(k));
    }

    public static final SubLObject strictly_between_0_and_1_p_alt(SubLObject x) {
        return makeBoolean((x.isNumber() && x.numG(ZERO_INTEGER)) && x.numL(ONE_INTEGER));
    }

    public static SubLObject strictly_between_0_and_1_p(final SubLObject x) {
        return makeBoolean((x.isNumber() && x.numG(ZERO_INTEGER)) && x.numL(ONE_INTEGER));
    }

    public static final SubLObject strictly_between_0_and_minus_1_p_alt(SubLObject x) {
        return makeBoolean((x.isNumber() && x.numL(ZERO_INTEGER)) && x.numG(MINUS_ONE_INTEGER));
    }

    public static SubLObject strictly_between_0_and_minus_1_p(final SubLObject x) {
        return makeBoolean((x.isNumber() && x.numL(ZERO_INTEGER)) && x.numG(MINUS_ONE_INTEGER));
    }

    public static final SubLObject tolerance_E_alt(SubLObject num1, SubLObject num2, SubLObject tolerance) {
        if (tolerance == UNPROVIDED) {
            tolerance = ZERO_INTEGER;
        }
        return numLE(abs(subtract(num1, num2)), tolerance);
    }

    public static SubLObject tolerance_E(final SubLObject num1, final SubLObject num2, SubLObject tolerance) {
        if (tolerance == UNPROVIDED) {
            tolerance = ZERO_INTEGER;
        }
        return numLE(abs(subtract(num1, num2)), tolerance);
    }

    public static final SubLObject zero_alt(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject zero(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return ZERO_INTEGER;
    }

    public static final SubLObject one_alt(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return ONE_INTEGER;
    }

    public static SubLObject one(SubLObject dummy) {
        if (dummy == UNPROVIDED) {
            dummy = NIL;
        }
        return ONE_INTEGER;
    }

    /**
     * Given a list of N points, generate a list of the pairwise slope of these points.
     * The points are assumed to be encoded in a (x y) format.
     *
     * @return LISTP (dy/dx dy2/dx2 ... dyn-1/dxn-1)
     */
    @LispMethod(comment = "Given a list of N points, generate a list of the pairwise slope of these points.\r\nThe points are assumed to be encoded in a (x y) format.\r\n\r\n@return LISTP (dy/dx dy2/dx2 ... dyn-1/dxn-1)\nGiven a list of N points, generate a list of the pairwise slope of these points.\nThe points are assumed to be encoded in a (x y) format.")
    public static final SubLObject pairwise_slope_alt(SubLObject points) {
        {
            SubLObject slopes = NIL;
            SubLObject point_list = points.rest();
            SubLObject prev_point = points.first();
            SubLObject cdolist_list_var = point_list;
            SubLObject point = NIL;
            for (point = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , point = cdolist_list_var.first()) {
                {
                    SubLObject datum = prev_point;
                    SubLObject current = datum;
                    SubLObject prev_x = NIL;
                    SubLObject prev_y = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    prev_x = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    prev_y = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject datum_7 = point;
                            SubLObject current_8 = datum_7;
                            SubLObject curr_x = NIL;
                            SubLObject curr_y = NIL;
                            destructuring_bind_must_consp(current_8, datum_7, $list_alt118);
                            curr_x = current_8.first();
                            current_8 = current_8.rest();
                            destructuring_bind_must_consp(current_8, datum_7, $list_alt118);
                            curr_y = current_8.first();
                            current_8 = current_8.rest();
                            if (NIL == current_8) {
                                {
                                    SubLObject slope = divide(subtract(curr_y, prev_y), subtract(curr_x, prev_x));
                                    slopes = cons(slope, slopes);
                                }
                            } else {
                                cdestructuring_bind_error(datum_7, $list_alt118);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt117);
                    }
                }
                prev_point = point;
            }
            return nreverse(slopes);
        }
    }

    @LispMethod(comment = "Given a list of N points, generate a list of the pairwise slope of these points.\r\nThe points are assumed to be encoded in a (x y) format.\r\n\r\n@return LISTP (dy/dx dy2/dx2 ... dyn-1/dxn-1)\nGiven a list of N points, generate a list of the pairwise slope of these points.\nThe points are assumed to be encoded in a (x y) format.")
    public static SubLObject pairwise_slope(final SubLObject points) {
        SubLObject slopes = NIL;
        final SubLObject point_list = points.rest();
        SubLObject prev_point = points.first();
        SubLObject cdolist_list_var = point_list;
        SubLObject point = NIL;
        point = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = prev_point;
            SubLObject prev_x = NIL;
            SubLObject prev_y = NIL;
            destructuring_bind_must_consp(current, datum, $list132);
            prev_x = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list132);
            prev_y = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject current_$8;
                final SubLObject datum_$7 = current_$8 = point;
                SubLObject curr_x = NIL;
                SubLObject curr_y = NIL;
                destructuring_bind_must_consp(current_$8, datum_$7, $list133);
                curr_x = current_$8.first();
                current_$8 = current_$8.rest();
                destructuring_bind_must_consp(current_$8, datum_$7, $list133);
                curr_y = current_$8.first();
                current_$8 = current_$8.rest();
                if (NIL == current_$8) {
                    final SubLObject slope = divide(subtract(curr_y, prev_y), subtract(curr_x, prev_x));
                    slopes = cons(slope, slopes);
                } else {
                    cdestructuring_bind_error(datum_$7, $list133);
                }
            } else {
                cdestructuring_bind_error(datum, $list132);
            }
            prev_point = point;
            cdolist_list_var = cdolist_list_var.rest();
            point = cdolist_list_var.first();
        } 
        return nreverse(slopes);
    }

    /**
     * Given a list of values, turn them into coordinates by using their
     * position in the list as the X value and their value as the Y coordinate.
     *
     * @return LISTP of coordinates
     */
    @LispMethod(comment = "Given a list of values, turn them into coordinates by using their\r\nposition in the list as the X value and their value as the Y coordinate.\r\n\r\n@return LISTP of coordinates\nGiven a list of values, turn them into coordinates by using their\nposition in the list as the X value and their value as the Y coordinate.")
    public static final SubLObject values_to_coordinates_alt(SubLObject values) {
        {
            SubLObject coordinates = NIL;
            SubLObject list_var = NIL;
            SubLObject value = NIL;
            SubLObject position = NIL;
            for (list_var = values, value = list_var.first(), position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , position = add(ONE_INTEGER, position)) {
                coordinates = cons(list(position, value), coordinates);
            }
            return nreverse(coordinates);
        }
    }

    @LispMethod(comment = "Given a list of values, turn them into coordinates by using their\r\nposition in the list as the X value and their value as the Y coordinate.\r\n\r\n@return LISTP of coordinates\nGiven a list of values, turn them into coordinates by using their\nposition in the list as the X value and their value as the Y coordinate.")
    public static SubLObject values_to_coordinates(final SubLObject values) {
        SubLObject coordinates = NIL;
        SubLObject list_var = NIL;
        SubLObject value = NIL;
        SubLObject position = NIL;
        list_var = values;
        value = list_var.first();
        for (position = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , position = add(ONE_INTEGER, position)) {
            coordinates = cons(list(position, value), coordinates);
        }
        return nreverse(coordinates);
    }

    /**
     * Extracts the Y axis from a pair of coordinates.
     *
     * @return LISTP of y values
     */
    @LispMethod(comment = "Extracts the Y axis from a pair of coordinates.\r\n\r\n@return LISTP of y values")
    public static final SubLObject coordinates_to_values_alt(SubLObject coordinates) {
        return Mapping.mapcar(SECOND, coordinates);
    }

    @LispMethod(comment = "Extracts the Y axis from a pair of coordinates.\r\n\r\n@return LISTP of y values")
    public static SubLObject coordinates_to_values(final SubLObject coordinates) {
        return Mapping.mapcar(SECOND, coordinates);
    }

    /**
     * Compute the pairwise slope for the points passed in, then turn the
     * results back into points by giving each slope the position in the
     * list of slopes as its X coordinate.
     *
     * @see PAIRWISE-SLOPE
     * @see VALUES-TO-COORDINATES
     * @return LISTP slopes for the points turned into coordinates
     */
    @LispMethod(comment = "Compute the pairwise slope for the points passed in, then turn the\r\nresults back into points by giving each slope the position in the\r\nlist of slopes as its X coordinate.\r\n\r\n@see PAIRWISE-SLOPE\r\n@see VALUES-TO-COORDINATES\r\n@return LISTP slopes for the points turned into coordinates\nCompute the pairwise slope for the points passed in, then turn the\nresults back into points by giving each slope the position in the\nlist of slopes as its X coordinate.")
    public static final SubLObject pairwise_slope_points_alt(SubLObject points) {
        {
            SubLObject slopes = com.cyc.cycjava.cycl.number_utilities.pairwise_slope(points);
            return com.cyc.cycjava.cycl.number_utilities.values_to_coordinates(slopes);
        }
    }

    @LispMethod(comment = "Compute the pairwise slope for the points passed in, then turn the\r\nresults back into points by giving each slope the position in the\r\nlist of slopes as its X coordinate.\r\n\r\n@see PAIRWISE-SLOPE\r\n@see VALUES-TO-COORDINATES\r\n@return LISTP slopes for the points turned into coordinates\nCompute the pairwise slope for the points passed in, then turn the\nresults back into points by giving each slope the position in the\nlist of slopes as its X coordinate.")
    public static SubLObject pairwise_slope_points(final SubLObject points) {
        final SubLObject slopes = pairwise_slope(points);
        return values_to_coordinates(slopes);
    }

    /**
     * Implements a low-pass filter/smoothing function that takes a set of numeric
     * items and a number of neighbors over which to average and replaces the
     * value in items with the average over these neighbors.
     *
     * @param NUM-OF-NEIGHBORS
     * 		the width of the neighbor window; (N-1)/2
     * 		neighbors and (n-1)/2 neighbors to the right are used to drive the
     * 		average. If N is even, then N/2 is used.
     * @return LISTP of smoothed values; the leftmost and rightmost neighbors
    will be left intact
     */
    @LispMethod(comment = "Implements a low-pass filter/smoothing function that takes a set of numeric\r\nitems and a number of neighbors over which to average and replaces the\r\nvalue in items with the average over these neighbors.\r\n\r\n@param NUM-OF-NEIGHBORS\r\n\t\tthe width of the neighbor window; (N-1)/2\r\n\t\tneighbors and (n-1)/2 neighbors to the right are used to drive the\r\n\t\taverage. If N is even, then N/2 is used.\r\n@return LISTP of smoothed values; the leftmost and rightmost neighbors\r\nwill be left intact\nImplements a low-pass filter/smoothing function that takes a set of numeric\nitems and a number of neighbors over which to average and replaces the\nvalue in items with the average over these neighbors.")
    public static final SubLObject average_neighbors_alt(SubLObject items, SubLObject num_of_neighbors) {
        if (num_of_neighbors == UNPROVIDED) {
            num_of_neighbors = $int$25;
        }
        SubLTrampolineFile.checkType(num_of_neighbors, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject width = (NIL != oddp(num_of_neighbors)) ? ((SubLObject) (integerDivide(subtract(num_of_neighbors, ONE_INTEGER), TWO_INTEGER))) : integerDivide(num_of_neighbors, TWO_INTEGER);
            SubLObject window_size = add(width, width, ONE_INTEGER);
            SubLObject window = queues.create_queue();
            SubLObject window_sum = ZERO_INTEGER;
            SubLObject cursor = items;
            SubLObject smoothed_values = NIL;
            {
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(window_size); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject item = cursor.first();
                        queues.enqueue(item, window);
                        window_sum = add(window_sum, item);
                        if (i.numL(width)) {
                            smoothed_values = cons(item, smoothed_values);
                        }
                    }
                    cursor = cursor.rest();
                }
            }
            {
                SubLObject cdolist_list_var = cursor;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(item, NUMBERP);
                    smoothed_values = cons(floor(window_sum, window_size), smoothed_values);
                    queues.enqueue(item, window);
                    window_sum = add(window_sum, item);
                    {
                        SubLObject tossed = queues.dequeue(window);
                        window_sum = subtract(window_sum, tossed);
                    }
                }
            }
            smoothed_values = cons(divide(window_sum, window_size), smoothed_values);
            {
                SubLObject cdotimes_end_var = add(width, ONE_INTEGER);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    queues.dequeue(window);
                }
            }
            while (NIL == queues.queue_empty_p(window)) {
                {
                    SubLObject item = queues.dequeue(window);
                    smoothed_values = cons(item, smoothed_values);
                }
            } 
            return nreverse(smoothed_values);
        }
    }

    @LispMethod(comment = "Implements a low-pass filter/smoothing function that takes a set of numeric\r\nitems and a number of neighbors over which to average and replaces the\r\nvalue in items with the average over these neighbors.\r\n\r\n@param NUM-OF-NEIGHBORS\r\n\t\tthe width of the neighbor window; (N-1)/2\r\n\t\tneighbors and (n-1)/2 neighbors to the right are used to drive the\r\n\t\taverage. If N is even, then N/2 is used.\r\n@return LISTP of smoothed values; the leftmost and rightmost neighbors\r\nwill be left intact\nImplements a low-pass filter/smoothing function that takes a set of numeric\nitems and a number of neighbors over which to average and replaces the\nvalue in items with the average over these neighbors.")
    public static SubLObject average_neighbors(final SubLObject items, SubLObject num_of_neighbors) {
        if (num_of_neighbors == UNPROVIDED) {
            num_of_neighbors = $int$25;
        }
        assert NIL != subl_promotions.non_negative_integer_p(num_of_neighbors) : "! subl_promotions.non_negative_integer_p(num_of_neighbors) " + ("subl_promotions.non_negative_integer_p(num_of_neighbors) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(num_of_neighbors) ") + num_of_neighbors;
        final SubLObject width = (NIL != oddp(num_of_neighbors)) ? integerDivide(subtract(num_of_neighbors, ONE_INTEGER), TWO_INTEGER) : integerDivide(num_of_neighbors, TWO_INTEGER);
        final SubLObject window_size = add(width, width, ONE_INTEGER);
        final SubLObject window = queues.create_queue(UNPROVIDED);
        SubLObject window_sum = ZERO_INTEGER;
        SubLObject cursor = items;
        SubLObject smoothed_values = NIL;
        SubLObject i;
        SubLObject item;
        for (i = NIL, i = ZERO_INTEGER; i.numL(window_size); i = add(i, ONE_INTEGER)) {
            item = cursor.first();
            queues.enqueue(item, window);
            window_sum = add(window_sum, item);
            if (i.numL(width)) {
                smoothed_values = cons(item, smoothed_values);
            }
            cursor = cursor.rest();
        }
        SubLObject cdolist_list_var = cursor;
        item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != numberp(item) : "! numberp(item) " + ("Types.numberp(item) " + "CommonSymbols.NIL != Types.numberp(item) ") + item;
            smoothed_values = cons(floor(window_sum, window_size), smoothed_values);
            queues.enqueue(item, window);
            window_sum = add(window_sum, item);
            final SubLObject tossed = queues.dequeue(window);
            window_sum = subtract(window_sum, tossed);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        smoothed_values = cons(divide(window_sum, window_size), smoothed_values);
        SubLObject cdotimes_end_var;
        SubLObject j;
        for (cdotimes_end_var = add(width, ONE_INTEGER), j = NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER)) {
            queues.dequeue(window);
        }
        while (NIL == queues.queue_empty_p(window)) {
            final SubLObject item2 = queues.dequeue(window);
            smoothed_values = cons(item2, smoothed_values);
        } 
        return nreverse(smoothed_values);
    }

    /**
     * Given an ID and a VECTORP of ids that were deleted from an ID range
     * (in ascending order) give the number the ID would have if the ID space
     * were compacted.
     * The method computes this by determining the gap count and subtracting
     * them from the ID provided. Since the gap count is equal to the table
     * index of the smallest deleted number larger than the id, binary search
     * can be used to quickly hunt down the index.
     * If ID is in TABLE-OF-DELETES, then :DELETED is returned instead.
     *
     * @return a renumbered id <= ID or :DELETED
     */
    @LispMethod(comment = "Given an ID and a VECTORP of ids that were deleted from an ID range\r\n(in ascending order) give the number the ID would have if the ID space\r\nwere compacted.\r\nThe method computes this by determining the gap count and subtracting\r\nthem from the ID provided. Since the gap count is equal to the table\r\nindex of the smallest deleted number larger than the id, binary search\r\ncan be used to quickly hunt down the index.\r\nIf ID is in TABLE-OF-DELETES, then :DELETED is returned instead.\r\n\r\n@return a renumbered id <= ID or :DELETED\nGiven an ID and a VECTORP of ids that were deleted from an ID range\n(in ascending order) give the number the ID would have if the ID space\nwere compacted.\nThe method computes this by determining the gap count and subtracting\nthem from the ID provided. Since the gap count is equal to the table\nindex of the smallest deleted number larger than the id, binary search\ncan be used to quickly hunt down the index.\nIf ID is in TABLE-OF-DELETES, then :DELETED is returned instead.")
    public static final SubLObject renumber_id_using_table_alt(SubLObject id, SubLObject table_of_deletes) {
        {
            SubLObject left = ZERO_INTEGER;
            SubLObject right = subtract(length(table_of_deletes), ONE_INTEGER);
            while (left.numLE(right)) {
                {
                    SubLObject index = integerDivide(add(left, right), TWO_INTEGER);
                    SubLObject deleted_id = aref(table_of_deletes, index);
                    if (deleted_id.numE(id)) {
                        return $DELETED;
                    } else {
                        if (deleted_id.numL(id)) {
                            left = add(index, ONE_INTEGER);
                        } else {
                            if (deleted_id.numG(id)) {
                                right = subtract(index, ONE_INTEGER);
                            }
                        }
                    }
                }
            } 
            {
                SubLObject num_of_gaps = left;
                return subtract(id, num_of_gaps);
            }
        }
    }

    @LispMethod(comment = "Given an ID and a VECTORP of ids that were deleted from an ID range\r\n(in ascending order) give the number the ID would have if the ID space\r\nwere compacted.\r\nThe method computes this by determining the gap count and subtracting\r\nthem from the ID provided. Since the gap count is equal to the table\r\nindex of the smallest deleted number larger than the id, binary search\r\ncan be used to quickly hunt down the index.\r\nIf ID is in TABLE-OF-DELETES, then :DELETED is returned instead.\r\n\r\n@return a renumbered id <= ID or :DELETED\nGiven an ID and a VECTORP of ids that were deleted from an ID range\n(in ascending order) give the number the ID would have if the ID space\nwere compacted.\nThe method computes this by determining the gap count and subtracting\nthem from the ID provided. Since the gap count is equal to the table\nindex of the smallest deleted number larger than the id, binary search\ncan be used to quickly hunt down the index.\nIf ID is in TABLE-OF-DELETES, then :DELETED is returned instead.")
    public static SubLObject renumber_id_using_table(final SubLObject id, final SubLObject table_of_deletes) {
        SubLObject left = ZERO_INTEGER;
        SubLObject right = subtract(length(table_of_deletes), ONE_INTEGER);
        while (left.numLE(right)) {
            final SubLObject index = integerDivide(add(left, right), TWO_INTEGER);
            final SubLObject deleted_id = aref(table_of_deletes, index);
            if (deleted_id.numE(id)) {
                return $DELETED;
            }
            if (deleted_id.numL(id)) {
                left = add(index, ONE_INTEGER);
            } else {
                if (!deleted_id.numG(id)) {
                    continue;
                }
                right = subtract(index, ONE_INTEGER);
            }
        } 
        final SubLObject num_of_gaps = left;
        return subtract(id, num_of_gaps);
    }

    public static final SubLObject test_renumber_id_using_table_alt(SubLObject deleted_ids, SubLObject max_id) {
        {
            SubLObject renumbered_ids = com.cyc.cycjava.cycl.number_utilities.test_build_translation_map_for_id_renumbering(deleted_ids, max_id);
            SubLObject table_of_deletes = list_utilities.list2vector(deleted_ids);
            SubLObject id = NIL;
            for (id = ZERO_INTEGER; id.numL(max_id); id = add(id, ONE_INTEGER)) {
                {
                    SubLObject mapped_id = gethash(id, renumbered_ids, UNPROVIDED);
                    SubLObject renumbered_id = com.cyc.cycjava.cycl.number_utilities.renumber_id_using_table(id, table_of_deletes);
                    if (mapped_id == renumbered_id) {
                    } else {
                        if (mapped_id.numE(renumbered_id)) {
                        } else {
                            Errors.error($str_alt127$Original_id__A_was_supposed_to_ma, id, mapped_id, renumbered_id);
                        }
                    }
                }
            }
            return $SUCCESS;
        }
    }

    public static SubLObject test_renumber_id_using_table(final SubLObject deleted_ids, final SubLObject max_id) {
        final SubLObject renumbered_ids = test_build_translation_map_for_id_renumbering(deleted_ids, max_id);
        final SubLObject table_of_deletes = list_utilities.list2vector(deleted_ids);
        SubLObject id;
        SubLObject mapped_id;
        SubLObject renumbered_id;
        for (id = NIL, id = ZERO_INTEGER; id.numL(max_id); id = add(id, ONE_INTEGER)) {
            mapped_id = gethash(id, renumbered_ids, UNPROVIDED);
            renumbered_id = renumber_id_using_table(id, table_of_deletes);
            if (!mapped_id.eql(renumbered_id)) {
                if (!mapped_id.numE(renumbered_id)) {
                    Errors.error($str141$Original_id__A_was_supposed_to_ma, id, mapped_id, renumbered_id);
                }
            }
        }
        return $SUCCESS;
    }

    /**
     * Given a list of deleted IDs, identify runs in the IDs and find a more
     * terse representation called a gap-list. A gap list stores runs of
     * missing IDs as cons-pairs of (ID . WIDTH); if the WIDTH is one, then
     * only the ID is stored. For example, if the list read (2 3 4 5 8), this
     * would be stored as ((2 . 4) 8).
     *
     * @param DELETED-IDS
     * 		a list of IDs sorted in ascending order
     * @return a gap list of ID - count pairs, or ids (with an implied count of 1)
     */
    @LispMethod(comment = "Given a list of deleted IDs, identify runs in the IDs and find a more\r\nterse representation called a gap-list. A gap list stores runs of\r\nmissing IDs as cons-pairs of (ID . WIDTH); if the WIDTH is one, then\r\nonly the ID is stored. For example, if the list read (2 3 4 5 8), this\r\nwould be stored as ((2 . 4) 8).\r\n\r\n@param DELETED-IDS\r\n\t\ta list of IDs sorted in ascending order\r\n@return a gap list of ID - count pairs, or ids (with an implied count of 1)\nGiven a list of deleted IDs, identify runs in the IDs and find a more\nterse representation called a gap-list. A gap list stores runs of\nmissing IDs as cons-pairs of (ID . WIDTH); if the WIDTH is one, then\nonly the ID is stored. For example, if the list read (2 3 4 5 8), this\nwould be stored as ((2 . 4) 8).")
    public static final SubLObject transform_delete_list_to_gap_list_alt(SubLObject deleted_ids) {
        {
            SubLObject gap_list = NIL;
            SubLObject prev_id = deleted_ids.first();
            SubLObject cursor_id = prev_id;
            SubLObject width = ONE_INTEGER;
            SubLObject cdolist_list_var = deleted_ids.rest();
            SubLObject id = NIL;
            for (id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , id = cdolist_list_var.first()) {
                cursor_id = add(cursor_id, ONE_INTEGER);
                if (cursor_id.numE(id)) {
                    width = add(width, ONE_INTEGER);
                } else {
                    if (width.numE(ONE_INTEGER)) {
                        gap_list = cons(prev_id, gap_list);
                    } else {
                        gap_list = cons(cons(prev_id, width), gap_list);
                    }
                    prev_id = id;
                    cursor_id = id;
                    width = ONE_INTEGER;
                }
            }
            if (width.numE(ONE_INTEGER)) {
                gap_list = cons(prev_id, gap_list);
            } else {
                gap_list = cons(cons(prev_id, width), gap_list);
            }
            return nreverse(gap_list);
        }
    }

    @LispMethod(comment = "Given a list of deleted IDs, identify runs in the IDs and find a more\r\nterse representation called a gap-list. A gap list stores runs of\r\nmissing IDs as cons-pairs of (ID . WIDTH); if the WIDTH is one, then\r\nonly the ID is stored. For example, if the list read (2 3 4 5 8), this\r\nwould be stored as ((2 . 4) 8).\r\n\r\n@param DELETED-IDS\r\n\t\ta list of IDs sorted in ascending order\r\n@return a gap list of ID - count pairs, or ids (with an implied count of 1)\nGiven a list of deleted IDs, identify runs in the IDs and find a more\nterse representation called a gap-list. A gap list stores runs of\nmissing IDs as cons-pairs of (ID . WIDTH); if the WIDTH is one, then\nonly the ID is stored. For example, if the list read (2 3 4 5 8), this\nwould be stored as ((2 . 4) 8).")
    public static SubLObject transform_delete_list_to_gap_list(final SubLObject deleted_ids) {
        SubLObject gap_list = NIL;
        SubLObject cursor_id;
        SubLObject prev_id = cursor_id = deleted_ids.first();
        SubLObject width = ONE_INTEGER;
        SubLObject cdolist_list_var = deleted_ids.rest();
        SubLObject id = NIL;
        id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cursor_id = add(cursor_id, ONE_INTEGER);
            if (cursor_id.numE(id)) {
                width = add(width, ONE_INTEGER);
            } else {
                if (width.numE(ONE_INTEGER)) {
                    gap_list = cons(prev_id, gap_list);
                } else {
                    gap_list = cons(cons(prev_id, width), gap_list);
                }
                prev_id = id;
                cursor_id = id;
                width = ONE_INTEGER;
            }
            cdolist_list_var = cdolist_list_var.rest();
            id = cdolist_list_var.first();
        } 
        if (width.numE(ONE_INTEGER)) {
            gap_list = cons(prev_id, gap_list);
        } else {
            gap_list = cons(cons(prev_id, width), gap_list);
        }
        return nreverse(gap_list);
    }

    /**
     * Take a gap list and turn it into a delta list, a list of tuples of gap
     * start and sum of all gap-widths up to this point. This expresses the
     * cummulative shift in an ID range incurred by the deletion of the
     * enumerated IDs.
     * For example the gap list ((2 . 4) 8 (11 . 2)) world become the
     * delta list ((2 . 4) (8 . 5) (11 . 7)). This means that any ID x
     * 2 < x < 8 would have to have 4 subtracted, and any ID 8 < x < 11
     * would be renumbered by subtracting 7.
     *
     * @return LISTP of tuples of gap start and cummulative gap width
     */
    @LispMethod(comment = "Take a gap list and turn it into a delta list, a list of tuples of gap\r\nstart and sum of all gap-widths up to this point. This expresses the\r\ncummulative shift in an ID range incurred by the deletion of the\r\nenumerated IDs.\r\nFor example the gap list ((2 . 4) 8 (11 . 2)) world become the\r\ndelta list ((2 . 4) (8 . 5) (11 . 7)). This means that any ID x\r\n2 < x < 8 would have to have 4 subtracted, and any ID 8 < x < 11\r\nwould be renumbered by subtracting 7.\r\n\r\n@return LISTP of tuples of gap start and cummulative gap width\nTake a gap list and turn it into a delta list, a list of tuples of gap\nstart and sum of all gap-widths up to this point. This expresses the\ncummulative shift in an ID range incurred by the deletion of the\nenumerated IDs.\nFor example the gap list ((2 . 4) 8 (11 . 2)) world become the\ndelta list ((2 . 4) (8 . 5) (11 . 7)). This means that any ID x\n2 < x < 8 would have to have 4 subtracted, and any ID 8 < x < 11\nwould be renumbered by subtracting 7.")
    public static final SubLObject transform_gap_list_to_delta_list_alt(SubLObject gap_list) {
        {
            SubLObject cummulative = ZERO_INTEGER;
            SubLObject delta_list = NIL;
            SubLObject cdolist_list_var = gap_list;
            SubLObject gap_info = NIL;
            for (gap_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gap_info = cdolist_list_var.first()) {
                {
                    SubLObject gap_start = NIL;
                    SubLObject gap_width = NIL;
                    if (gap_info.isCons()) {
                        {
                            SubLObject datum = gap_info;
                            SubLObject current = datum;
                            SubLObject start = NIL;
                            SubLObject width = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt131);
                            start = current.first();
                            current = current.rest();
                            width = current;
                            gap_start = start;
                            gap_width = width;
                        }
                    } else {
                        if (gap_info.isNumber()) {
                            gap_start = gap_info;
                            gap_width = ONE_INTEGER;
                        } else {
                            Errors.error($str_alt132$Invalid_gap_list_format__Unclear_, gap_info);
                        }
                    }
                    cummulative = add(cummulative, gap_width);
                    delta_list = cons(cons(gap_start, cummulative), delta_list);
                }
            }
            return nreverse(delta_list);
        }
    }

    @LispMethod(comment = "Take a gap list and turn it into a delta list, a list of tuples of gap\r\nstart and sum of all gap-widths up to this point. This expresses the\r\ncummulative shift in an ID range incurred by the deletion of the\r\nenumerated IDs.\r\nFor example the gap list ((2 . 4) 8 (11 . 2)) world become the\r\ndelta list ((2 . 4) (8 . 5) (11 . 7)). This means that any ID x\r\n2 < x < 8 would have to have 4 subtracted, and any ID 8 < x < 11\r\nwould be renumbered by subtracting 7.\r\n\r\n@return LISTP of tuples of gap start and cummulative gap width\nTake a gap list and turn it into a delta list, a list of tuples of gap\nstart and sum of all gap-widths up to this point. This expresses the\ncummulative shift in an ID range incurred by the deletion of the\nenumerated IDs.\nFor example the gap list ((2 . 4) 8 (11 . 2)) world become the\ndelta list ((2 . 4) (8 . 5) (11 . 7)). This means that any ID x\n2 < x < 8 would have to have 4 subtracted, and any ID 8 < x < 11\nwould be renumbered by subtracting 7.")
    public static SubLObject transform_gap_list_to_delta_list(final SubLObject gap_list) {
        SubLObject cummulative = ZERO_INTEGER;
        SubLObject delta_list = NIL;
        SubLObject cdolist_list_var = gap_list;
        SubLObject gap_info = NIL;
        gap_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject gap_start = NIL;
            SubLObject gap_width = NIL;
            if (gap_info.isCons()) {
                SubLObject current;
                final SubLObject datum = current = gap_info;
                SubLObject start = NIL;
                SubLObject width = NIL;
                destructuring_bind_must_consp(current, datum, $list145);
                start = current.first();
                current = width = current.rest();
                gap_start = start;
                gap_width = width;
            } else
                if (gap_info.isNumber()) {
                    gap_start = gap_info;
                    gap_width = ONE_INTEGER;
                } else {
                    Errors.error($str146$Invalid_gap_list_format__Unclear_, gap_info);
                }

            cummulative = add(cummulative, gap_width);
            delta_list = cons(cons(gap_start, cummulative), delta_list);
            cdolist_list_var = cdolist_list_var.rest();
            gap_info = cdolist_list_var.first();
        } 
        return nreverse(delta_list);
    }

    /**
     * Given an ID and a VECTORP of (DELETED-ID . DELTA) tuples, where
     * DELETED-ID marks the beginning of a gap (potentially of width 1)
     * and DELTA the cummulative reduction in the ID, (the table sorted
     * in ascending order of DELETED-ID), return the number the ID would
     * have if the ID space were compacted.
     * The method computes this by finding the largest DELETED-ID smaller
     * than ID, using binary search, and then subtracting its DELTA from
     * that. Unlike RENUMBER-ID-USING-TABLE, the delta-table representation
     * does not know the gap width anymore, and can therefore not detect
     * deleted IDs from the middle of a gap.
     *
     * @return a renumbered id <= ID, :DELETED if ID starts a gap
     */
    @LispMethod(comment = "Given an ID and a VECTORP of (DELETED-ID . DELTA) tuples, where\r\nDELETED-ID marks the beginning of a gap (potentially of width 1)\r\nand DELTA the cummulative reduction in the ID, (the table sorted\r\nin ascending order of DELETED-ID), return the number the ID would\r\nhave if the ID space were compacted.\r\nThe method computes this by finding the largest DELETED-ID smaller\r\nthan ID, using binary search, and then subtracting its DELTA from\r\nthat. Unlike RENUMBER-ID-USING-TABLE, the delta-table representation\r\ndoes not know the gap width anymore, and can therefore not detect\r\ndeleted IDs from the middle of a gap.\r\n\r\n@return a renumbered id <= ID, :DELETED if ID starts a gap\nGiven an ID and a VECTORP of (DELETED-ID . DELTA) tuples, where\nDELETED-ID marks the beginning of a gap (potentially of width 1)\nand DELTA the cummulative reduction in the ID, (the table sorted\nin ascending order of DELETED-ID), return the number the ID would\nhave if the ID space were compacted.\nThe method computes this by finding the largest DELETED-ID smaller\nthan ID, using binary search, and then subtracting its DELTA from\nthat. Unlike RENUMBER-ID-USING-TABLE, the delta-table representation\ndoes not know the gap width anymore, and can therefore not detect\ndeleted IDs from the middle of a gap.")
    public static final SubLObject renumber_id_using_delta_table_alt(SubLObject id, SubLObject delta_table) {
        {
            SubLObject left = ZERO_INTEGER;
            SubLObject right = subtract(length(delta_table), ONE_INTEGER);
            while (left.numLE(right)) {
                {
                    SubLObject index = integerDivide(add(left, right), TWO_INTEGER);
                    SubLObject deletion_info = aref(delta_table, index);
                    SubLObject deleted_id = deletion_info.first();
                    if (deleted_id.numE(id)) {
                        return $DELETED;
                    } else {
                        if (deleted_id.numL(id)) {
                            left = add(index, ONE_INTEGER);
                        } else {
                            if (deleted_id.numG(id)) {
                                right = subtract(index, ONE_INTEGER);
                            }
                        }
                    }
                }
            } 
            if (NIL != non_negative_integer_p(right)) {
                {
                    SubLObject delete_info = aref(delta_table, right);
                    SubLObject delta = delete_info.rest();
                    SubLObject renumbered_id = subtract(id, delta);
                    return renumbered_id;
                }
            }
            return id;
        }
    }

    @LispMethod(comment = "Given an ID and a VECTORP of (DELETED-ID . DELTA) tuples, where\r\nDELETED-ID marks the beginning of a gap (potentially of width 1)\r\nand DELTA the cummulative reduction in the ID, (the table sorted\r\nin ascending order of DELETED-ID), return the number the ID would\r\nhave if the ID space were compacted.\r\nThe method computes this by finding the largest DELETED-ID smaller\r\nthan ID, using binary search, and then subtracting its DELTA from\r\nthat. Unlike RENUMBER-ID-USING-TABLE, the delta-table representation\r\ndoes not know the gap width anymore, and can therefore not detect\r\ndeleted IDs from the middle of a gap.\r\n\r\n@return a renumbered id <= ID, :DELETED if ID starts a gap\nGiven an ID and a VECTORP of (DELETED-ID . DELTA) tuples, where\nDELETED-ID marks the beginning of a gap (potentially of width 1)\nand DELTA the cummulative reduction in the ID, (the table sorted\nin ascending order of DELETED-ID), return the number the ID would\nhave if the ID space were compacted.\nThe method computes this by finding the largest DELETED-ID smaller\nthan ID, using binary search, and then subtracting its DELTA from\nthat. Unlike RENUMBER-ID-USING-TABLE, the delta-table representation\ndoes not know the gap width anymore, and can therefore not detect\ndeleted IDs from the middle of a gap.")
    public static SubLObject renumber_id_using_delta_table(final SubLObject id, final SubLObject delta_table) {
        SubLObject left = ZERO_INTEGER;
        SubLObject right = subtract(length(delta_table), ONE_INTEGER);
        while (left.numLE(right)) {
            final SubLObject index = integerDivide(add(left, right), TWO_INTEGER);
            final SubLObject deletion_info = aref(delta_table, index);
            final SubLObject deleted_id = deletion_info.first();
            if (deleted_id.numE(id)) {
                return $DELETED;
            }
            if (deleted_id.numL(id)) {
                left = add(index, ONE_INTEGER);
            } else {
                if (!deleted_id.numG(id)) {
                    continue;
                }
                right = subtract(index, ONE_INTEGER);
            }
        } 
        if (NIL != subl_promotions.non_negative_integer_p(right)) {
            final SubLObject delete_info = aref(delta_table, right);
            final SubLObject delta = delete_info.rest();
            final SubLObject renumbered_id = subtract(id, delta);
            return renumbered_id;
        }
        return id;
    }

    public static final SubLObject test_renumber_id_using_delta_table_alt(SubLObject deleted_ids, SubLObject max_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject renumbered_ids = com.cyc.cycjava.cycl.number_utilities.test_build_translation_map_for_id_renumbering(deleted_ids, max_id);
                SubLObject delta_list = com.cyc.cycjava.cycl.number_utilities.transform_gap_list_to_delta_list(com.cyc.cycjava.cycl.number_utilities.transform_delete_list_to_gap_list(deleted_ids));
                SubLObject delta_table = list_utilities.list2vector(delta_list);
                SubLObject id = NIL;
                for (id = ZERO_INTEGER; id.numL(max_id); id = add(id, ONE_INTEGER)) {
                    {
                        SubLObject mapped_id = gethash(id, renumbered_ids, UNPROVIDED);
                        SubLObject renumbered_id = NIL;
                        if ($DELETED != mapped_id) {
                            renumbered_id = com.cyc.cycjava.cycl.number_utilities.renumber_id_using_delta_table(id, delta_table);
                            if (mapped_id == renumbered_id) {
                            } else {
                                if (renumbered_id.isNumber() && mapped_id.numE(renumbered_id)) {
                                } else {
                                    Errors.error($str_alt127$Original_id__A_was_supposed_to_ma, id, mapped_id, renumbered_id);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = delta_list;
                    SubLObject delta_info = NIL;
                    for (delta_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , delta_info = cdolist_list_var.first()) {
                        {
                            SubLObject deleted_id = delta_info.first();
                            SubLObject renumbered_id = com.cyc.cycjava.cycl.number_utilities.renumber_id_using_delta_table(deleted_id, delta_table);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if ($DELETED != renumbered_id) {
                                    Errors.error($str_alt136$ID__A_should_have_been_deleted_bu, renumbered_id);
                                }
                            }
                        }
                    }
                }
                return $SUCCESS;
            }
        }
    }

    public static SubLObject test_renumber_id_using_delta_table(final SubLObject deleted_ids, final SubLObject max_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject renumbered_ids = test_build_translation_map_for_id_renumbering(deleted_ids, max_id);
        final SubLObject delta_list = transform_gap_list_to_delta_list(transform_delete_list_to_gap_list(deleted_ids));
        final SubLObject delta_table = list_utilities.list2vector(delta_list);
        SubLObject id;
        SubLObject mapped_id;
        SubLObject renumbered_id;
        for (id = NIL, id = ZERO_INTEGER; id.numL(max_id); id = add(id, ONE_INTEGER)) {
            mapped_id = gethash(id, renumbered_ids, UNPROVIDED);
            renumbered_id = NIL;
            if ($DELETED != mapped_id) {
                renumbered_id = renumber_id_using_delta_table(id, delta_table);
                if (!mapped_id.eql(renumbered_id)) {
                    if ((!renumbered_id.isNumber()) || (!mapped_id.numE(renumbered_id))) {
                        Errors.error($str141$Original_id__A_was_supposed_to_ma, id, mapped_id, renumbered_id);
                    }
                }
            }
        }
        SubLObject cdolist_list_var = delta_list;
        SubLObject delta_info = NIL;
        delta_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject deleted_id = delta_info.first();
            final SubLObject renumbered_id2 = renumber_id_using_delta_table(deleted_id, delta_table);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ($DELETED != renumbered_id2)) {
                Errors.error($str150$ID__A_should_have_been_deleted_bu, renumbered_id2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            delta_info = cdolist_list_var.first();
        } 
        return $SUCCESS;
    }

    public static final SubLObject test_build_translation_map_for_id_renumbering_alt(SubLObject deleted_ids, SubLObject max_id) {
        {
            SubLObject renumbered_ids = make_hash_table(max_id, EQL, UNPROVIDED);
            SubLObject current = ZERO_INTEGER;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(max_id); i = add(i, ONE_INTEGER)) {
                if (find(i, deleted_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
                    sethash(i, renumbered_ids, $DELETED);
                } else {
                    sethash(i, renumbered_ids, current);
                    current = add(current, ONE_INTEGER);
                }
            }
            return renumbered_ids;
        }
    }

    public static SubLObject test_build_translation_map_for_id_renumbering(final SubLObject deleted_ids, final SubLObject max_id) {
        final SubLObject renumbered_ids = make_hash_table(max_id, EQL, UNPROVIDED);
        SubLObject current = ZERO_INTEGER;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(max_id); i = add(i, ONE_INTEGER)) {
            if (find(i, deleted_ids, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isNumber()) {
                sethash(i, renumbered_ids, $DELETED);
            } else {
                sethash(i, renumbered_ids, current);
                current = add(current, ONE_INTEGER);
            }
        }
        return renumbered_ids;
    }

    public static final SubLObject declare_number_utilities_file_alt() {
        declareFunction("fib", "FIB", 1, 0, false);
        declareFunction("f_1X", "1+", 1, 0, false);
        declareFunction("f_1_", "1-", 1, 0, false);
        declareFunction("f_2X", "2*", 1, 0, false);
        declareFunction("onep", "ONEP", 1, 0, false);
        declareFunction("encode_boolean", "ENCODE-BOOLEAN", 1, 0, false);
        declareFunction("decode_boolean", "DECODE-BOOLEAN", 1, 0, false);
        declareFunction("get_bit", "GET-BIT", 2, 0, false);
        declareFunction("set_bit", "SET-BIT", 2, 1, false);
        declareFunction("clear_bit", "CLEAR-BIT", 2, 0, false);
        declareFunction("div", "DIV", 2, 0, false);
        declareFunction("square", "SQUARE", 1, 0, false);
        declareFunction("cube", "CUBE", 1, 0, false);
        declareFunction("cubert", "CUBERT", 1, 0, false);
        declareFunction("bytep", "BYTEP", 1, 0, false);
        declareFunction("nil_or_integer_p", "NIL-OR-INTEGER-P", 1, 0, false);
        declareFunction("list_of_integer_p", "LIST-OF-INTEGER-P", 1, 0, false);
        declareFunction("list_of_positive_integer_p", "LIST-OF-POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction("list_of_negative_integer_p", "LIST-OF-NEGATIVE-INTEGER-P", 1, 0, false);
        declareFunction("list_of_non_negative_integer_p", "LIST-OF-NON-NEGATIVE-INTEGER-P", 1, 0, false);
        declareFunction("list_of_non_positive_integer_p", "LIST-OF-NON-POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction("positive_number_p", "POSITIVE-NUMBER-P", 1, 0, false);
        declareFunction("non_negative_number_p", "NON-NEGATIVE-NUMBER-P", 1, 0, false);
        declareFunction("non_positive_number_p", "NON-POSITIVE-NUMBER-P", 1, 0, false);
        declareFunction("negative_number_p", "NEGATIVE-NUMBER-P", 1, 0, false);
        declareFunction("zero_number_p", "ZERO-NUMBER-P", 1, 0, false);
        declareFunction("non_zero_number_p", "NON-ZERO-NUMBER-P", 1, 0, false);
        declareFunction("probability_number_p", "PROBABILITY-NUMBER-P", 1, 0, false);
        declareFunction("percentile_p", "PERCENTILE-P", 1, 0, false);
        declareFunction("decimal_integer_length", "DECIMAL-INTEGER-LENGTH", 1, 0, false);
        declareFunction("significant_digits", "SIGNIFICANT-DIGITS", 2, 0, false);
        declareFunction("four_significant_digits", "FOUR-SIGNIFICANT-DIGITS", 1, 0, false);
        declareFunction("significant_digits_optimize_float", "SIGNIFICANT-DIGITS-OPTIMIZE-FLOAT", 1, 0, false);
        declareFunction("float_n", "FLOAT-N", 1, 1, false);
        declareFunction("round_up_to_the_nearest", "ROUND-UP-TO-THE-NEAREST", 2, 0, false);
        declareFunction("round_to_the_nearest", "ROUND-TO-THE-NEAREST", 2, 0, false);
        declareFunction("round_down_to_the_nearest", "ROUND-DOWN-TO-THE-NEAREST", 2, 0, false);
        declareFunction("greater_absP", "GREATER-ABS?", 2, 0, false);
        declareFunction("divides_evenly", "DIVIDES-EVENLY", 2, 0, false);
        declareFunction("integer_percent", "INTEGER-PERCENT", 1, 2, false);
        declareFunction("percent", "PERCENT", 1, 2, false);
        declareFunction("percentage_p", "PERCENTAGE-P", 1, 0, false);
        declareFunction("percentage_to_probability", "PERCENTAGE-TO-PROBABILITY", 1, 0, false);
        declareFunction("percent_increase", "PERCENT-INCREASE", 2, 0, false);
        declareFunction("percent_decrease", "PERCENT-DECREASE", 2, 0, false);
        declareFunction("percent_faster", "PERCENT-FASTER", 2, 0, false);
        declareFunction("percent_slower", "PERCENT-SLOWER", 2, 0, false);
        declareFunction("log10", "LOG10", 1, 0, false);
        declareFunction("log2", "LOG2", 1, 0, false);
        declareFunction("expt10", "EXPT10", 1, 0, false);
        declareFunction("potentially_infinite_number_p", "POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("negative_infinity", "NEGATIVE-INFINITY", 0, 0, false);
        declareFunction("positive_infinity", "POSITIVE-INFINITY", 0, 0, false);
        declareFunction("negative_infinity_p", "NEGATIVE-INFINITY-P", 1, 0, false);
        declareFunction("positive_infinity_p", "POSITIVE-INFINITY-P", 1, 0, false);
        declareFunction("infinite_number_p", "INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("negative_potentially_infinite_number_p", "NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("positive_potentially_infinite_number_p", "POSITIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("non_negative_potentially_infinite_number_p", "NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("potentially_infinite_number_E", "POTENTIALLY-INFINITE-NUMBER-=", 2, 0, false);
        declareFunction("potentially_infinite_number_L", "POTENTIALLY-INFINITE-NUMBER-<", 2, 0, false);
        declareFunction("potentially_infinite_number_G", "POTENTIALLY-INFINITE-NUMBER->", 2, 0, false);
        declareFunction("potentially_infinite_number_LE", "POTENTIALLY-INFINITE-NUMBER-<=", 2, 0, false);
        declareFunction("potentially_infinite_number_GE", "POTENTIALLY-INFINITE-NUMBER->=", 2, 0, false);
        declareFunction("potentially_infinite_number_plus", "POTENTIALLY-INFINITE-NUMBER-PLUS", 2, 0, false);
        declareFunction("potentially_infinite_number_minus", "POTENTIALLY-INFINITE-NUMBER-MINUS", 2, 0, false);
        declareFunction("potentially_infinite_number_times", "POTENTIALLY-INFINITE-NUMBER-TIMES", 2, 0, false);
        declareFunction("potentially_infinite_number_divided_by", "POTENTIALLY-INFINITE-NUMBER-DIVIDED-BY", 2, 0, false);
        declareFunction("potentially_infinite_number_max", "POTENTIALLY-INFINITE-NUMBER-MAX", 2, 0, false);
        declareFunction("potentially_infinite_number_min", "POTENTIALLY-INFINITE-NUMBER-MIN", 2, 0, false);
        declareFunction("potentially_infinite_number_log", "POTENTIALLY-INFINITE-NUMBER-LOG", 1, 1, false);
        declareFunction("potentially_infinite_number_exp", "POTENTIALLY-INFINITE-NUMBER-EXP", 1, 0, false);
        declareFunction("negative_infinity_plus", "NEGATIVE-INFINITY-PLUS", 1, 0, false);
        declareFunction("positive_infinity_plus", "POSITIVE-INFINITY-PLUS", 1, 0, false);
        declareFunction("negative_infinity_minus", "NEGATIVE-INFINITY-MINUS", 1, 0, false);
        declareFunction("positive_infinity_minus", "POSITIVE-INFINITY-MINUS", 1, 0, false);
        declareFunction("negative_infinity_times", "NEGATIVE-INFINITY-TIMES", 1, 0, false);
        declareFunction("positive_infinity_times", "POSITIVE-INFINITY-TIMES", 1, 0, false);
        declareFunction("negative_infinity_X", "NEGATIVE-INFINITY-/", 1, 0, false);
        declareFunction("positive_infinity_X", "POSITIVE-INFINITY-/", 1, 0, false);
        declareFunction("divided_by_negative_infinity", "DIVIDED-BY-NEGATIVE-INFINITY", 1, 0, false);
        declareFunction("divided_by_positive_infinity", "DIVIDED-BY-POSITIVE-INFINITY", 1, 0, false);
        declareFunction("extended_potentially_infinite_number_p", "EXTENDED-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("potentially_infinite_integer_p", "POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
        declareFunction("infinite_integer_p", "INFINITE-INTEGER-P", 1, 0, false);
        declareFunction("negative_potentially_infinite_integer_p", "NEGATIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
        declareFunction("positive_potentially_infinite_integer_p", "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
        declareFunction("potentially_infinite_integer_E", "POTENTIALLY-INFINITE-INTEGER-=", 2, 0, false);
        declareFunction("potentially_infinite_integer_L", "POTENTIALLY-INFINITE-INTEGER-<", 2, 0, false);
        declareFunction("potentially_infinite_integer_G", "POTENTIALLY-INFINITE-INTEGER->", 2, 0, false);
        declareFunction("potentially_infinite_integer_LE", "POTENTIALLY-INFINITE-INTEGER-<=", 2, 0, false);
        declareFunction("potentially_infinite_integer_GE", "POTENTIALLY-INFINITE-INTEGER->=", 2, 0, false);
        declareFunction("potentially_infinite_integer_plus", "POTENTIALLY-INFINITE-INTEGER-PLUS", 2, 0, false);
        declareFunction("potentially_infinite_integer_minus", "POTENTIALLY-INFINITE-INTEGER-MINUS", 2, 0, false);
        declareFunction("potentially_infinite_integer_times", "POTENTIALLY-INFINITE-INTEGER-TIMES", 2, 0, false);
        declareFunction("potentially_infinite_integer_times_number_rounded", "POTENTIALLY-INFINITE-INTEGER-TIMES-NUMBER-ROUNDED", 2, 0, false);
        declareFunction("potentially_infinite_integer_divided_by", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY", 2, 0, false);
        declareFunction("potentially_infinite_integer_divided_by_number_rounded", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY-NUMBER-ROUNDED", 2, 0, false);
        declareFunction("potentially_undefined_number_p", "POTENTIALLY-UNDEFINED-NUMBER-P", 1, 0, false);
        declareFunction("undefined", "UNDEFINED", 1, 0, false);
        declareFunction("potentially_undefined_number_E", "POTENTIALLY-UNDEFINED-NUMBER-=", 2, 0, false);
        declareFunction("potentially_undefined_number_L", "POTENTIALLY-UNDEFINED-NUMBER-<", 2, 0, false);
        declareFunction("potentially_undefined_number_G", "POTENTIALLY-UNDEFINED-NUMBER->", 2, 0, false);
        declareFunction("potentially_undefined_number_LE", "POTENTIALLY-UNDEFINED-NUMBER-<=", 2, 0, false);
        declareFunction("potentially_undefined_number_GE", "POTENTIALLY-UNDEFINED-NUMBER->=", 2, 0, false);
        declareFunction("potentially_undefined_number_plus", "POTENTIALLY-UNDEFINED-NUMBER-PLUS", 2, 0, false);
        declareFunction("potentially_undefined_number_minus", "POTENTIALLY-UNDEFINED-NUMBER-MINUS", 2, 0, false);
        declareFunction("potentially_undefined_number_times", "POTENTIALLY-UNDEFINED-NUMBER-TIMES", 2, 0, false);
        declareFunction("potentially_undefined_number_divided_by", "POTENTIALLY-UNDEFINED-NUMBER-DIVIDED-BY", 2, 0, false);
        declareFunction("maximum", "MAXIMUM", 1, 1, false);
        declareFunction("minimum", "MINIMUM", 1, 1, false);
        declareFunction("average", "AVERAGE", 1, 1, false);
        declareFunction("mean", "MEAN", 1, 0, false);
        declareFunction("summation", "SUMMATION", 1, 0, false);
        declareFunction("geometric_mean", "GEOMETRIC-MEAN", 1, 0, false);
        declareFunction("median", "MEDIAN", 1, 1, false);
        declareFunction("median_sorted", "MEDIAN-SORTED", 1, 1, false);
        declareFunction("percentile", "PERCENTILE", 2, 1, false);
        declareFunction("percentile_sorted", "PERCENTILE-SORTED", 2, 0, false);
        declareFunction("max_key_from_hash", "MAX-KEY-FROM-HASH", 1, 0, false);
        declareFunction("get_frequency_list", "GET-FREQUENCY-LIST", 1, 0, false);
        declareFunction("get_sorted_frequency_list", "GET-SORTED-FREQUENCY-LIST", 1, 0, false);
        declareFunction("mode", "MODE", 1, 0, false);
        declareFunction("mode_sorted", "MODE-SORTED", 1, 0, false);
        declareFunction("variance_from_sample", "VARIANCE-FROM-SAMPLE", 1, 0, false);
        declareFunction("variance_from_population", "VARIANCE-FROM-POPULATION", 1, 0, false);
        declareFunction("variance", "VARIANCE", 1, 0, false);
        declareFunction("standard_deviation_from_population", "STANDARD-DEVIATION-FROM-POPULATION", 1, 0, false);
        declareFunction("standard_deviation_from_sample", "STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false);
        declareFunction("standard_deviation", "STANDARD-DEVIATION", 1, 0, false);
        declareFunction("standard_deviations_above_mean", "STANDARD-DEVIATIONS-ABOVE-MEAN", 3, 0, false);
        declareFunction("perform_standard_statistical_analysis", "PERFORM-STANDARD-STATISTICAL-ANALYSIS", 1, 1, false);
        declareFunction("correlation", "CORRELATION", 2, 0, false);
        declareFunction("decode_integer_multiples", "DECODE-INTEGER-MULTIPLES", 2, 0, false);
        declareFunction("encode_integer_multiples", "ENCODE-INTEGER-MULTIPLES", 2, 0, false);
        declareFunction("number_string_p", "NUMBER-STRING-P", 1, 0, false);
        declareFunction("number_string_value", "NUMBER-STRING-VALUE", 1, 0, false);
        declareFunction("valid_number_string_char", "VALID-NUMBER-STRING-CHAR", 1, 0, false);
        declareFunction("extended_number_string_p", "EXTENDED-NUMBER-STRING-P", 1, 0, false);
        declareFunction("valid_exponent_marker", "VALID-EXPONENT-MARKER", 1, 0, false);
        declareFunction("valid_sign", "VALID-SIGN", 1, 0, false);
        declareFunction("find_smallest_prime_for_binary_width", "FIND-SMALLEST-PRIME-FOR-BINARY-WIDTH", 1, 0, false);
        declareFunction("checksum_sanity_check", "CHECKSUM-SANITY-CHECK", 0, 0, false);
        declareFunction("checksum_update", "CHECKSUM-UPDATE", 1, 0, false);
        declareFunction("checksum_finalize", "CHECKSUM-FINALIZE", 0, 0, false);
        declareMacro("checksum_setup", "CHECKSUM-SETUP");
        declareMacro("checksum_start", "CHECKSUM-START");
        declareMacro("checksum_resume", "CHECKSUM-RESUME");
        declareMacro("with_checksum", "WITH-CHECKSUM");
        declareFunction("expt_mod", "EXPT-MOD", 3, 0, false);
        declareFunction("binary_expt_mod", "BINARY-EXPT-MOD", 3, 0, false);
        declareFunction("convert_to_binary", "CONVERT-TO-BINARY", 1, 0, false);
        declareFunction("convert_to_hexadecimal", "CONVERT-TO-HEXADECIMAL", 1, 0, false);
        declareFunction("modular_subtraction", "MODULAR-SUBTRACTION", 3, 0, false);
        declareFunction("modular_addition", "MODULAR-ADDITION", 3, 0, false);
        declareFunction("modularE", "MODULAR=", 3, 0, false);
        declareFunction("number_of_digits", "NUMBER-OF-DIGITS", 1, 0, false);
        declareFunction("multiple_ofP", "MULTIPLE-OF?", 2, 0, false);
        declareFunction("multiple_of_allP", "MULTIPLE-OF-ALL?", 2, 0, false);
        declareFunction("prime_numberP", "PRIME-NUMBER?", 1, 0, false);
        declareFunction("prime_factorization", "PRIME-FACTORIZATION", 1, 0, false);
        declareFunction("find_smallest_divisor", "FIND-SMALLEST-DIVISOR", 1, 0, false);
        declareFunction("lcm", "LCM", 1, 0, false);
        declareFunction("lcm2", "LCM2", 2, 0, false);
        declareFunction("lcm2_internal", "LCM2-INTERNAL", 2, 0, false);
        declareFunction("gcd", "GCD", 1, 0, false);
        declareFunction("gcd2", "GCD2", 2, 0, false);
        declareFunction("gcd2_internal", "GCD2-INTERNAL", 2, 0, false);
        declareFunction("gcd2_sorted_internal", "GCD2-SORTED-INTERNAL", 2, 0, false);
        declareFunction("convert_hexadecimal_to_decimal", "CONVERT-HEXADECIMAL-TO-DECIMAL", 1, 0, false);
        declareFunction("decimal_code_for_hex_digit", "DECIMAL-CODE-FOR-HEX-DIGIT", 1, 0, false);
        declareMacro("with_probability", "WITH-PROBABILITY");
        declareFunction("probability_p", "PROBABILITY-P", 1, 0, false);
        declareFunction("true_with_probability", "TRUE-WITH-PROBABILITY", 1, 0, false);
        declareFunction("true_with_probability_int", "TRUE-WITH-PROBABILITY-INT", 2, 0, false);
        declareFunction("coin_flip", "COIN-FLIP", 0, 0, false);
        declareFunction("probability_distribution_p", "PROBABILITY-DISTRIBUTION-P", 1, 0, false);
        declareFunction("probability_distribution_sample", "PROBABILITY-DISTRIBUTION-SAMPLE", 1, 0, false);
        declareFunction("fibonacci", "FIBONACCI", 1, 0, false);
        declareFunction("fibonacci_memoized_internal", "FIBONACCI-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("fibonacci_memoized", "FIBONACCI-MEMOIZED", 1, 0, false);
        declareFunction("random_0_1", "RANDOM-0-1", 0, 0, false);
        declareFunction("random_probability", "RANDOM-PROBABILITY", 0, 0, false);
        declareFunction("n_random_integers", "N-RANDOM-INTEGERS", 2, 1, false);
        declareFunction("non_negative_integers_less_than", "NON-NEGATIVE-INTEGERS-LESS-THAN", 1, 0, false);
        declareFunction("compute_deltas", "COMPUTE-DELTAS", 1, 1, false);
        declareFunction("factorial", "FACTORIAL", 1, 0, false);
        declareFunction("choose", "CHOOSE", 2, 0, false);
        declareFunction("strictly_between_0_and_1_p", "STRICTLY-BETWEEN-0-AND-1-P", 1, 0, false);
        declareFunction("strictly_between_0_and_minus_1_p", "STRICTLY-BETWEEN-0-AND-MINUS-1-P", 1, 0, false);
        declareFunction("tolerance_E", "TOLERANCE-=", 2, 1, false);
        declareFunction("zero", "ZERO", 0, 1, false);
        declareFunction("one", "ONE", 0, 1, false);
        declareFunction("pairwise_slope", "PAIRWISE-SLOPE", 1, 0, false);
        declareFunction("values_to_coordinates", "VALUES-TO-COORDINATES", 1, 0, false);
        declareFunction("coordinates_to_values", "COORDINATES-TO-VALUES", 1, 0, false);
        declareFunction("pairwise_slope_points", "PAIRWISE-SLOPE-POINTS", 1, 0, false);
        declareFunction("average_neighbors", "AVERAGE-NEIGHBORS", 1, 1, false);
        declareFunction("renumber_id_using_table", "RENUMBER-ID-USING-TABLE", 2, 0, false);
        declareFunction("test_renumber_id_using_table", "TEST-RENUMBER-ID-USING-TABLE", 2, 0, false);
        declareFunction("transform_delete_list_to_gap_list", "TRANSFORM-DELETE-LIST-TO-GAP-LIST", 1, 0, false);
        declareFunction("transform_gap_list_to_delta_list", "TRANSFORM-GAP-LIST-TO-DELTA-LIST", 1, 0, false);
        declareFunction("renumber_id_using_delta_table", "RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
        declareFunction("test_renumber_id_using_delta_table", "TEST-RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
        declareFunction("test_build_translation_map_for_id_renumbering", "TEST-BUILD-TRANSLATION-MAP-FOR-ID-RENUMBERING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_lcm_gcd_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-LCM-GCD-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_lcm_gcd_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-LCM-GCD-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("lcm_gcd_test_case_p", "LCM-GCD-TEST-CASE-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_extended_numbers_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-EXTENDED-NUMBERS-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_extended_numbers_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-EXTENDED-NUMBERS-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("extended_numbers_test_case_p", "EXTENDED-NUMBERS-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_number_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("f_1X", "1+", 1, 0, false);
            declareFunction("f_1_", "1-", 1, 0, false);
            declareFunction("f_2X", "2*", 1, 0, false);
            declareFunction("onep", "ONEP", 1, 0, false);
            declareFunction("encode_boolean", "ENCODE-BOOLEAN", 1, 0, false);
            declareFunction("decode_boolean", "DECODE-BOOLEAN", 1, 0, false);
            declareFunction("get_bit", "GET-BIT", 2, 0, false);
            declareFunction("set_bit", "SET-BIT", 2, 1, false);
            declareFunction("clear_bit", "CLEAR-BIT", 2, 0, false);
            declareFunction("div", "DIV", 2, 0, false);
            declareFunction("safe_X", "SAFE-/", 2, 0, false);
            declareFunction("square", "SQUARE", 1, 0, false);
            declareFunction("cube", "CUBE", 1, 0, false);
            declareFunction("cubert", "CUBERT", 1, 0, false);
            declareFunction("bytep", "BYTEP", 1, 0, false);
            declareFunction("nil_or_integer_p", "NIL-OR-INTEGER-P", 1, 0, false);
            declareFunction("possibly_positive_integer_p", "POSSIBLY-POSITIVE-INTEGER-P", 1, 0, false);
            declareFunction("list_of_integer_p", "LIST-OF-INTEGER-P", 1, 0, false);
            declareFunction("list_of_positive_integer_p", "LIST-OF-POSITIVE-INTEGER-P", 1, 0, false);
            declareFunction("list_of_negative_integer_p", "LIST-OF-NEGATIVE-INTEGER-P", 1, 0, false);
            declareFunction("list_of_non_negative_integer_p", "LIST-OF-NON-NEGATIVE-INTEGER-P", 1, 0, false);
            declareFunction("list_of_non_positive_integer_p", "LIST-OF-NON-POSITIVE-INTEGER-P", 1, 0, false);
            declareFunction("positive_number_p", "POSITIVE-NUMBER-P", 1, 0, false);
            declareFunction("non_negative_number_p", "NON-NEGATIVE-NUMBER-P", 1, 0, false);
            declareFunction("non_positive_number_p", "NON-POSITIVE-NUMBER-P", 1, 0, false);
            declareFunction("negative_number_p", "NEGATIVE-NUMBER-P", 1, 0, false);
            declareFunction("zero_number_p", "ZERO-NUMBER-P", 1, 0, false);
            declareFunction("non_zero_number_p", "NON-ZERO-NUMBER-P", 1, 0, false);
            declareFunction("probability_number_p", "PROBABILITY-NUMBER-P", 1, 0, false);
            declareFunction("percentile_p", "PERCENTILE-P", 1, 0, false);
            declareFunction("decimal_integer_length", "DECIMAL-INTEGER-LENGTH", 1, 0, false);
            declareFunction("significant_digits", "SIGNIFICANT-DIGITS", 2, 0, false);
            declareFunction("four_significant_digits", "FOUR-SIGNIFICANT-DIGITS", 1, 0, false);
            declareFunction("significant_digits_optimize_float", "SIGNIFICANT-DIGITS-OPTIMIZE-FLOAT", 1, 0, false);
            declareFunction("float_n", "FLOAT-N", 1, 1, false);
            declareFunction("round_up_to_the_nearest", "ROUND-UP-TO-THE-NEAREST", 2, 0, false);
            declareFunction("round_to_the_nearest", "ROUND-TO-THE-NEAREST", 2, 0, false);
            declareFunction("round_down_to_the_nearest", "ROUND-DOWN-TO-THE-NEAREST", 2, 0, false);
            declareFunction("greater_absP", "GREATER-ABS?", 2, 0, false);
            declareFunction("divides_evenly", "DIVIDES-EVENLY", 2, 0, false);
            declareFunction("integer_percent", "INTEGER-PERCENT", 1, 2, false);
            declareFunction("safe_percent", "SAFE-PERCENT", 1, 2, false);
            declareFunction("percent", "PERCENT", 1, 2, false);
            declareFunction("percentage_p", "PERCENTAGE-P", 1, 0, false);
            declareFunction("percentage_to_probability", "PERCENTAGE-TO-PROBABILITY", 1, 0, false);
            declareFunction("percent_increase", "PERCENT-INCREASE", 2, 0, false);
            declareFunction("percent_decrease", "PERCENT-DECREASE", 2, 0, false);
            declareFunction("percent_faster", "PERCENT-FASTER", 2, 0, false);
            declareFunction("percent_slower", "PERCENT-SLOWER", 2, 0, false);
            declareFunction("log10", "LOG10", 1, 0, false);
            declareFunction("log2", "LOG2", 1, 0, false);
            declareFunction("expt10", "EXPT10", 1, 0, false);
            declareFunction("potentially_infinite_number_p", "POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
            declareFunction("negative_infinity", "NEGATIVE-INFINITY", 0, 0, false);
            declareFunction("positive_infinity", "POSITIVE-INFINITY", 0, 0, false);
            declareFunction("negative_infinity_p", "NEGATIVE-INFINITY-P", 1, 0, false);
            declareFunction("positive_infinity_p", "POSITIVE-INFINITY-P", 1, 0, false);
            declareFunction("infinite_number_p", "INFINITE-NUMBER-P", 1, 0, false);
            declareFunction("negative_potentially_infinite_number_p", "NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
            declareFunction("positive_potentially_infinite_number_p", "POSITIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
            declareFunction("non_negative_potentially_infinite_number_p", "NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
            declareFunction("potentially_infinite_number_E", "POTENTIALLY-INFINITE-NUMBER-=", 2, 0, false);
            declareFunction("potentially_infinite_number_L", "POTENTIALLY-INFINITE-NUMBER-<", 2, 0, false);
            declareFunction("potentially_infinite_number_G", "POTENTIALLY-INFINITE-NUMBER->", 2, 0, false);
            declareFunction("potentially_infinite_number_LE", "POTENTIALLY-INFINITE-NUMBER-<=", 2, 0, false);
            declareFunction("potentially_infinite_number_GE", "POTENTIALLY-INFINITE-NUMBER->=", 2, 0, false);
            declareFunction("potentially_infinite_number_plus", "POTENTIALLY-INFINITE-NUMBER-PLUS", 2, 0, false);
            declareFunction("potentially_infinite_number_minus", "POTENTIALLY-INFINITE-NUMBER-MINUS", 2, 0, false);
            declareFunction("potentially_infinite_number_times", "POTENTIALLY-INFINITE-NUMBER-TIMES", 2, 0, false);
            declareFunction("potentially_infinite_number_divided_by", "POTENTIALLY-INFINITE-NUMBER-DIVIDED-BY", 2, 0, false);
            declareFunction("potentially_infinite_number_max", "POTENTIALLY-INFINITE-NUMBER-MAX", 2, 0, false);
            declareFunction("potentially_infinite_number_min", "POTENTIALLY-INFINITE-NUMBER-MIN", 2, 0, false);
            declareFunction("potentially_infinite_number_log", "POTENTIALLY-INFINITE-NUMBER-LOG", 1, 1, false);
            declareFunction("potentially_infinite_number_exp", "POTENTIALLY-INFINITE-NUMBER-EXP", 1, 0, false);
            declareFunction("negative_infinity_plus", "NEGATIVE-INFINITY-PLUS", 1, 0, false);
            declareFunction("positive_infinity_plus", "POSITIVE-INFINITY-PLUS", 1, 0, false);
            declareFunction("negative_infinity_minus", "NEGATIVE-INFINITY-MINUS", 1, 0, false);
            declareFunction("positive_infinity_minus", "POSITIVE-INFINITY-MINUS", 1, 0, false);
            declareFunction("negative_infinity_times", "NEGATIVE-INFINITY-TIMES", 1, 0, false);
            declareFunction("positive_infinity_times", "POSITIVE-INFINITY-TIMES", 1, 0, false);
            declareFunction("negative_infinity_X", "NEGATIVE-INFINITY-/", 1, 0, false);
            declareFunction("positive_infinity_X", "POSITIVE-INFINITY-/", 1, 0, false);
            declareFunction("divided_by_negative_infinity", "DIVIDED-BY-NEGATIVE-INFINITY", 1, 0, false);
            declareFunction("divided_by_positive_infinity", "DIVIDED-BY-POSITIVE-INFINITY", 1, 0, false);
            declareFunction("extended_potentially_infinite_number_p", "EXTENDED-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
            declareFunction("potentially_infinite_integer_p", "POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
            declareFunction("infinite_integer_p", "INFINITE-INTEGER-P", 1, 0, false);
            declareFunction("negative_potentially_infinite_integer_p", "NEGATIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
            declareFunction("positive_potentially_infinite_integer_p", "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
            declareFunction("potentially_infinite_integer_E", "POTENTIALLY-INFINITE-INTEGER-=", 2, 0, false);
            declareFunction("potentially_infinite_integer_L", "POTENTIALLY-INFINITE-INTEGER-<", 2, 0, false);
            declareFunction("potentially_infinite_integer_G", "POTENTIALLY-INFINITE-INTEGER->", 2, 0, false);
            declareFunction("potentially_infinite_integer_LE", "POTENTIALLY-INFINITE-INTEGER-<=", 2, 0, false);
            declareFunction("potentially_infinite_integer_GE", "POTENTIALLY-INFINITE-INTEGER->=", 2, 0, false);
            declareFunction("potentially_infinite_integer_plus", "POTENTIALLY-INFINITE-INTEGER-PLUS", 2, 0, false);
            declareFunction("potentially_infinite_integer_minus", "POTENTIALLY-INFINITE-INTEGER-MINUS", 2, 0, false);
            declareFunction("potentially_infinite_integer_times", "POTENTIALLY-INFINITE-INTEGER-TIMES", 2, 0, false);
            declareFunction("potentially_infinite_integer_times_number_rounded", "POTENTIALLY-INFINITE-INTEGER-TIMES-NUMBER-ROUNDED", 2, 0, false);
            declareFunction("potentially_infinite_integer_divided_by", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY", 2, 0, false);
            declareFunction("potentially_infinite_integer_divided_by_number_rounded", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY-NUMBER-ROUNDED", 2, 0, false);
            declareFunction("potentially_undefined_number_p", "POTENTIALLY-UNDEFINED-NUMBER-P", 1, 0, false);
            declareFunction("undefined", "UNDEFINED", 1, 0, false);
            declareFunction("potentially_undefined_number_E", "POTENTIALLY-UNDEFINED-NUMBER-=", 2, 0, false);
            declareFunction("potentially_undefined_number_L", "POTENTIALLY-UNDEFINED-NUMBER-<", 2, 0, false);
            declareFunction("potentially_undefined_number_G", "POTENTIALLY-UNDEFINED-NUMBER->", 2, 0, false);
            declareFunction("potentially_undefined_number_LE", "POTENTIALLY-UNDEFINED-NUMBER-<=", 2, 0, false);
            declareFunction("potentially_undefined_number_GE", "POTENTIALLY-UNDEFINED-NUMBER->=", 2, 0, false);
            declareFunction("potentially_undefined_number_plus", "POTENTIALLY-UNDEFINED-NUMBER-PLUS", 2, 0, false);
            declareFunction("potentially_undefined_number_minus", "POTENTIALLY-UNDEFINED-NUMBER-MINUS", 2, 0, false);
            declareFunction("potentially_undefined_number_times", "POTENTIALLY-UNDEFINED-NUMBER-TIMES", 2, 0, false);
            declareFunction("potentially_undefined_number_divided_by", "POTENTIALLY-UNDEFINED-NUMBER-DIVIDED-BY", 2, 0, false);
            declareFunction("maximum", "MAXIMUM", 1, 1, false);
            declareFunction("minimum", "MINIMUM", 1, 1, false);
            declareFunction("average", "AVERAGE", 1, 1, false);
            declareFunction("mean", "MEAN", 1, 0, false);
            declareFunction("summation", "SUMMATION", 1, 0, false);
            declareFunction("product", "PRODUCT", 1, 0, false);
            declareFunction("geometric_mean", "GEOMETRIC-MEAN", 1, 0, false);
            declareFunction("median", "MEDIAN", 1, 2, false);
            declareFunction("median_sorted", "MEDIAN-SORTED", 1, 3, false);
            declareFunction("percentile", "PERCENTILE", 2, 2, false);
            declareFunction("percentile_sorted", "PERCENTILE-SORTED", 2, 0, false);
            declareFunction("max_key_from_hash", "MAX-KEY-FROM-HASH", 1, 0, false);
            declareFunction("get_frequency_list", "GET-FREQUENCY-LIST", 1, 0, false);
            declareFunction("get_sorted_frequency_list", "GET-SORTED-FREQUENCY-LIST", 1, 0, false);
            declareFunction("mode", "MODE", 1, 0, false);
            declareFunction("mode_sorted", "MODE-SORTED", 1, 0, false);
            declareFunction("variance_from_sample", "VARIANCE-FROM-SAMPLE", 1, 0, false);
            declareFunction("variance_from_population", "VARIANCE-FROM-POPULATION", 1, 0, false);
            declareFunction("variance", "VARIANCE", 1, 0, false);
            declareFunction("standard_deviation_from_population", "STANDARD-DEVIATION-FROM-POPULATION", 1, 0, false);
            declareFunction("safe_standard_deviation_from_sample", "SAFE-STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false);
            declareFunction("standard_deviation_from_sample", "STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false);
            declareFunction("standard_deviation", "STANDARD-DEVIATION", 1, 0, false);
            declareFunction("standard_deviations_above_mean", "STANDARD-DEVIATIONS-ABOVE-MEAN", 3, 0, false);
            declareFunction("simple_outliers", "SIMPLE-OUTLIERS", 1, 1, false);
            declareFunction("perform_standard_statistical_analysis", "PERFORM-STANDARD-STATISTICAL-ANALYSIS", 1, 1, false);
            declareFunction("correlation", "CORRELATION", 2, 0, false);
            declareFunction("decode_integer_multiples", "DECODE-INTEGER-MULTIPLES", 2, 0, false);
            declareFunction("encode_integer_multiples", "ENCODE-INTEGER-MULTIPLES", 2, 0, false);
            declareFunction("arithmetic_progression", "ARITHMETIC-PROGRESSION", 3, 0, false);
            declareFunction("geometric_progression", "GEOMETRIC-PROGRESSION", 3, 0, false);
            declareFunction("geometric_progression_ratio", "GEOMETRIC-PROGRESSION-RATIO", 3, 0, false);
            declareFunction("number_string_p", "NUMBER-STRING-P", 1, 0, false);
            declareFunction("number_string_value", "NUMBER-STRING-VALUE", 1, 0, false);
            declareFunction("valid_number_string_char", "VALID-NUMBER-STRING-CHAR", 1, 0, false);
            declareFunction("extended_number_string_p", "EXTENDED-NUMBER-STRING-P", 1, 0, false);
            declareFunction("valid_exponent_marker", "VALID-EXPONENT-MARKER", 1, 0, false);
            declareFunction("valid_sign", "VALID-SIGN", 1, 0, false);
            declareFunction("find_smallest_prime_for_binary_width", "FIND-SMALLEST-PRIME-FOR-BINARY-WIDTH", 1, 0, false);
            declareFunction("checksum_sanity_check", "CHECKSUM-SANITY-CHECK", 0, 0, false);
            declareFunction("checksum_update", "CHECKSUM-UPDATE", 1, 0, false);
            declareFunction("checksum_finalize", "CHECKSUM-FINALIZE", 0, 0, false);
            declareMacro("checksum_setup", "CHECKSUM-SETUP");
            declareMacro("checksum_start", "CHECKSUM-START");
            declareMacro("checksum_resume", "CHECKSUM-RESUME");
            declareMacro("with_checksum", "WITH-CHECKSUM");
            declareFunction("expt_mod", "EXPT-MOD", 3, 0, false);
            declareFunction("binary_expt_mod", "BINARY-EXPT-MOD", 3, 0, false);
            declareFunction("convert_to_binary", "CONVERT-TO-BINARY", 1, 0, false);
            declareFunction("convert_to_hexadecimal", "CONVERT-TO-HEXADECIMAL", 1, 0, false);
            declareFunction("modular_subtraction", "MODULAR-SUBTRACTION", 3, 0, false);
            declareFunction("modular_addition", "MODULAR-ADDITION", 3, 0, false);
            declareFunction("modularE", "MODULAR=", 3, 0, false);
            declareFunction("number_of_digits", "NUMBER-OF-DIGITS", 1, 0, false);
            declareFunction("multiple_ofP", "MULTIPLE-OF?", 2, 0, false);
            declareFunction("multiple_of_allP", "MULTIPLE-OF-ALL?", 2, 0, false);
            declareFunction("prime_numberP", "PRIME-NUMBER?", 1, 0, false);
            declareFunction("prime_factorization", "PRIME-FACTORIZATION", 1, 0, false);
            declareFunction("common_prime_factors", "COMMON-PRIME-FACTORS", 1, 0, false);
            declareFunction("find_smallest_divisor", "FIND-SMALLEST-DIVISOR", 1, 0, false);
            declareFunction("divisors", "DIVISORS", 1, 0, false);
            declareFunction("lcm", "LCM", 1, 0, false);
            declareFunction("lcm2", "LCM2", 2, 0, false);
            declareFunction("lcm2_internal", "LCM2-INTERNAL", 2, 0, false);
            declareFunction("gcd", "GCD", 1, 0, false);
            declareFunction("gcd2", "GCD2", 2, 0, false);
            declareFunction("gcd2_internal", "GCD2-INTERNAL", 2, 0, false);
            declareFunction("gcd2_sorted_internal", "GCD2-SORTED-INTERNAL", 2, 0, false);
            declareFunction("convert_hexadecimal_to_decimal", "CONVERT-HEXADECIMAL-TO-DECIMAL", 1, 0, false);
            declareFunction("decimal_code_for_hex_digit", "DECIMAL-CODE-FOR-HEX-DIGIT", 1, 0, false);
            declareMacro("with_probability", "WITH-PROBABILITY");
            declareFunction("probability_p", "PROBABILITY-P", 1, 0, false);
            declareFunction("true_with_probability", "TRUE-WITH-PROBABILITY", 1, 0, false);
            declareFunction("true_with_probability_int", "TRUE-WITH-PROBABILITY-INT", 2, 0, false);
            declareFunction("logistic", "LOGISTIC", 1, 0, false);
            declareFunction("coin_flip", "COIN-FLIP", 0, 0, false);
            declareFunction("probability_distribution_p", "PROBABILITY-DISTRIBUTION-P", 1, 0, false);
            declareFunction("probability_distribution_sample", "PROBABILITY-DISTRIBUTION-SAMPLE", 1, 0, false);
            declareFunction("fibonacci", "FIBONACCI", 1, 0, false);
            declareFunction("fibonacci_memoized_internal", "FIBONACCI-MEMOIZED-INTERNAL", 1, 0, false);
            declareFunction("fibonacci_memoized", "FIBONACCI-MEMOIZED", 1, 0, false);
            declareFunction("random_0_1", "RANDOM-0-1", 0, 0, false);
            declareFunction("random_probability", "RANDOM-PROBABILITY", 0, 0, false);
            declareFunction("n_random_integers", "N-RANDOM-INTEGERS", 2, 1, false);
            declareFunction("non_negative_integers_less_than", "NON-NEGATIVE-INTEGERS-LESS-THAN", 1, 0, false);
            declareFunction("compute_deltas", "COMPUTE-DELTAS", 1, 1, false);
            declareFunction("factorial", "FACTORIAL", 1, 0, false);
            declareFunction("choose", "CHOOSE", 2, 0, false);
            declareFunction("strictly_between_0_and_1_p", "STRICTLY-BETWEEN-0-AND-1-P", 1, 0, false);
            declareFunction("strictly_between_0_and_minus_1_p", "STRICTLY-BETWEEN-0-AND-MINUS-1-P", 1, 0, false);
            declareFunction("tolerance_E", "TOLERANCE-=", 2, 1, false);
            declareFunction("zero", "ZERO", 0, 1, false);
            declareFunction("one", "ONE", 0, 1, false);
            declareFunction("pairwise_slope", "PAIRWISE-SLOPE", 1, 0, false);
            declareFunction("values_to_coordinates", "VALUES-TO-COORDINATES", 1, 0, false);
            declareFunction("coordinates_to_values", "COORDINATES-TO-VALUES", 1, 0, false);
            declareFunction("pairwise_slope_points", "PAIRWISE-SLOPE-POINTS", 1, 0, false);
            declareFunction("average_neighbors", "AVERAGE-NEIGHBORS", 1, 1, false);
            declareFunction("renumber_id_using_table", "RENUMBER-ID-USING-TABLE", 2, 0, false);
            declareFunction("test_renumber_id_using_table", "TEST-RENUMBER-ID-USING-TABLE", 2, 0, false);
            declareFunction("transform_delete_list_to_gap_list", "TRANSFORM-DELETE-LIST-TO-GAP-LIST", 1, 0, false);
            declareFunction("transform_gap_list_to_delta_list", "TRANSFORM-GAP-LIST-TO-DELTA-LIST", 1, 0, false);
            declareFunction("renumber_id_using_delta_table", "RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
            declareFunction("test_renumber_id_using_delta_table", "TEST-RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
            declareFunction("test_build_translation_map_for_id_renumbering", "TEST-BUILD-TRANSLATION-MAP-FOR-ID-RENUMBERING", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("fib", "FIB", 1, 0, false);
            declareFunction("median", "MEDIAN", 1, 1, false);
            declareFunction("median_sorted", "MEDIAN-SORTED", 1, 1, false);
            declareFunction("percentile", "PERCENTILE", 2, 1, false);
            declareFunction("subloop_reserved_initialize_lcm_gcd_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-LCM-GCD-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_lcm_gcd_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-LCM-GCD-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("lcm_gcd_test_case_p", "LCM-GCD-TEST-CASE-P", 1, 0, false);
            declareFunction("subloop_reserved_initialize_extended_numbers_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-EXTENDED-NUMBERS-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_extended_numbers_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-EXTENDED-NUMBERS-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("extended_numbers_test_case_p", "EXTENDED-NUMBERS-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_number_utilities_file_Previous() {
        declareFunction("f_1X", "1+", 1, 0, false);
        declareFunction("f_1_", "1-", 1, 0, false);
        declareFunction("f_2X", "2*", 1, 0, false);
        declareFunction("onep", "ONEP", 1, 0, false);
        declareFunction("encode_boolean", "ENCODE-BOOLEAN", 1, 0, false);
        declareFunction("decode_boolean", "DECODE-BOOLEAN", 1, 0, false);
        declareFunction("get_bit", "GET-BIT", 2, 0, false);
        declareFunction("set_bit", "SET-BIT", 2, 1, false);
        declareFunction("clear_bit", "CLEAR-BIT", 2, 0, false);
        declareFunction("div", "DIV", 2, 0, false);
        declareFunction("safe_X", "SAFE-/", 2, 0, false);
        declareFunction("square", "SQUARE", 1, 0, false);
        declareFunction("cube", "CUBE", 1, 0, false);
        declareFunction("cubert", "CUBERT", 1, 0, false);
        declareFunction("bytep", "BYTEP", 1, 0, false);
        declareFunction("nil_or_integer_p", "NIL-OR-INTEGER-P", 1, 0, false);
        declareFunction("possibly_positive_integer_p", "POSSIBLY-POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction("list_of_integer_p", "LIST-OF-INTEGER-P", 1, 0, false);
        declareFunction("list_of_positive_integer_p", "LIST-OF-POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction("list_of_negative_integer_p", "LIST-OF-NEGATIVE-INTEGER-P", 1, 0, false);
        declareFunction("list_of_non_negative_integer_p", "LIST-OF-NON-NEGATIVE-INTEGER-P", 1, 0, false);
        declareFunction("list_of_non_positive_integer_p", "LIST-OF-NON-POSITIVE-INTEGER-P", 1, 0, false);
        declareFunction("positive_number_p", "POSITIVE-NUMBER-P", 1, 0, false);
        declareFunction("non_negative_number_p", "NON-NEGATIVE-NUMBER-P", 1, 0, false);
        declareFunction("non_positive_number_p", "NON-POSITIVE-NUMBER-P", 1, 0, false);
        declareFunction("negative_number_p", "NEGATIVE-NUMBER-P", 1, 0, false);
        declareFunction("zero_number_p", "ZERO-NUMBER-P", 1, 0, false);
        declareFunction("non_zero_number_p", "NON-ZERO-NUMBER-P", 1, 0, false);
        declareFunction("probability_number_p", "PROBABILITY-NUMBER-P", 1, 0, false);
        declareFunction("percentile_p", "PERCENTILE-P", 1, 0, false);
        declareFunction("decimal_integer_length", "DECIMAL-INTEGER-LENGTH", 1, 0, false);
        declareFunction("significant_digits", "SIGNIFICANT-DIGITS", 2, 0, false);
        declareFunction("four_significant_digits", "FOUR-SIGNIFICANT-DIGITS", 1, 0, false);
        declareFunction("significant_digits_optimize_float", "SIGNIFICANT-DIGITS-OPTIMIZE-FLOAT", 1, 0, false);
        declareFunction("float_n", "FLOAT-N", 1, 1, false);
        declareFunction("round_up_to_the_nearest", "ROUND-UP-TO-THE-NEAREST", 2, 0, false);
        declareFunction("round_to_the_nearest", "ROUND-TO-THE-NEAREST", 2, 0, false);
        declareFunction("round_down_to_the_nearest", "ROUND-DOWN-TO-THE-NEAREST", 2, 0, false);
        declareFunction("greater_absP", "GREATER-ABS?", 2, 0, false);
        declareFunction("divides_evenly", "DIVIDES-EVENLY", 2, 0, false);
        declareFunction("integer_percent", "INTEGER-PERCENT", 1, 2, false);
        declareFunction("safe_percent", "SAFE-PERCENT", 1, 2, false);
        declareFunction("percent", "PERCENT", 1, 2, false);
        declareFunction("percentage_p", "PERCENTAGE-P", 1, 0, false);
        declareFunction("percentage_to_probability", "PERCENTAGE-TO-PROBABILITY", 1, 0, false);
        declareFunction("percent_increase", "PERCENT-INCREASE", 2, 0, false);
        declareFunction("percent_decrease", "PERCENT-DECREASE", 2, 0, false);
        declareFunction("percent_faster", "PERCENT-FASTER", 2, 0, false);
        declareFunction("percent_slower", "PERCENT-SLOWER", 2, 0, false);
        declareFunction("log10", "LOG10", 1, 0, false);
        declareFunction("log2", "LOG2", 1, 0, false);
        declareFunction("expt10", "EXPT10", 1, 0, false);
        declareFunction("potentially_infinite_number_p", "POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("negative_infinity", "NEGATIVE-INFINITY", 0, 0, false);
        declareFunction("positive_infinity", "POSITIVE-INFINITY", 0, 0, false);
        declareFunction("negative_infinity_p", "NEGATIVE-INFINITY-P", 1, 0, false);
        declareFunction("positive_infinity_p", "POSITIVE-INFINITY-P", 1, 0, false);
        declareFunction("infinite_number_p", "INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("negative_potentially_infinite_number_p", "NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("positive_potentially_infinite_number_p", "POSITIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("non_negative_potentially_infinite_number_p", "NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("potentially_infinite_number_E", "POTENTIALLY-INFINITE-NUMBER-=", 2, 0, false);
        declareFunction("potentially_infinite_number_L", "POTENTIALLY-INFINITE-NUMBER-<", 2, 0, false);
        declareFunction("potentially_infinite_number_G", "POTENTIALLY-INFINITE-NUMBER->", 2, 0, false);
        declareFunction("potentially_infinite_number_LE", "POTENTIALLY-INFINITE-NUMBER-<=", 2, 0, false);
        declareFunction("potentially_infinite_number_GE", "POTENTIALLY-INFINITE-NUMBER->=", 2, 0, false);
        declareFunction("potentially_infinite_number_plus", "POTENTIALLY-INFINITE-NUMBER-PLUS", 2, 0, false);
        declareFunction("potentially_infinite_number_minus", "POTENTIALLY-INFINITE-NUMBER-MINUS", 2, 0, false);
        declareFunction("potentially_infinite_number_times", "POTENTIALLY-INFINITE-NUMBER-TIMES", 2, 0, false);
        declareFunction("potentially_infinite_number_divided_by", "POTENTIALLY-INFINITE-NUMBER-DIVIDED-BY", 2, 0, false);
        declareFunction("potentially_infinite_number_max", "POTENTIALLY-INFINITE-NUMBER-MAX", 2, 0, false);
        declareFunction("potentially_infinite_number_min", "POTENTIALLY-INFINITE-NUMBER-MIN", 2, 0, false);
        declareFunction("potentially_infinite_number_log", "POTENTIALLY-INFINITE-NUMBER-LOG", 1, 1, false);
        declareFunction("potentially_infinite_number_exp", "POTENTIALLY-INFINITE-NUMBER-EXP", 1, 0, false);
        declareFunction("negative_infinity_plus", "NEGATIVE-INFINITY-PLUS", 1, 0, false);
        declareFunction("positive_infinity_plus", "POSITIVE-INFINITY-PLUS", 1, 0, false);
        declareFunction("negative_infinity_minus", "NEGATIVE-INFINITY-MINUS", 1, 0, false);
        declareFunction("positive_infinity_minus", "POSITIVE-INFINITY-MINUS", 1, 0, false);
        declareFunction("negative_infinity_times", "NEGATIVE-INFINITY-TIMES", 1, 0, false);
        declareFunction("positive_infinity_times", "POSITIVE-INFINITY-TIMES", 1, 0, false);
        declareFunction("negative_infinity_X", "NEGATIVE-INFINITY-/", 1, 0, false);
        declareFunction("positive_infinity_X", "POSITIVE-INFINITY-/", 1, 0, false);
        declareFunction("divided_by_negative_infinity", "DIVIDED-BY-NEGATIVE-INFINITY", 1, 0, false);
        declareFunction("divided_by_positive_infinity", "DIVIDED-BY-POSITIVE-INFINITY", 1, 0, false);
        declareFunction("extended_potentially_infinite_number_p", "EXTENDED-POTENTIALLY-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("potentially_infinite_integer_p", "POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
        declareFunction("infinite_integer_p", "INFINITE-INTEGER-P", 1, 0, false);
        declareFunction("negative_potentially_infinite_integer_p", "NEGATIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
        declareFunction("positive_potentially_infinite_integer_p", "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P", 1, 0, false);
        declareFunction("potentially_infinite_integer_E", "POTENTIALLY-INFINITE-INTEGER-=", 2, 0, false);
        declareFunction("potentially_infinite_integer_L", "POTENTIALLY-INFINITE-INTEGER-<", 2, 0, false);
        declareFunction("potentially_infinite_integer_G", "POTENTIALLY-INFINITE-INTEGER->", 2, 0, false);
        declareFunction("potentially_infinite_integer_LE", "POTENTIALLY-INFINITE-INTEGER-<=", 2, 0, false);
        declareFunction("potentially_infinite_integer_GE", "POTENTIALLY-INFINITE-INTEGER->=", 2, 0, false);
        declareFunction("potentially_infinite_integer_plus", "POTENTIALLY-INFINITE-INTEGER-PLUS", 2, 0, false);
        declareFunction("potentially_infinite_integer_minus", "POTENTIALLY-INFINITE-INTEGER-MINUS", 2, 0, false);
        declareFunction("potentially_infinite_integer_times", "POTENTIALLY-INFINITE-INTEGER-TIMES", 2, 0, false);
        declareFunction("potentially_infinite_integer_times_number_rounded", "POTENTIALLY-INFINITE-INTEGER-TIMES-NUMBER-ROUNDED", 2, 0, false);
        declareFunction("potentially_infinite_integer_divided_by", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY", 2, 0, false);
        declareFunction("potentially_infinite_integer_divided_by_number_rounded", "POTENTIALLY-INFINITE-INTEGER-DIVIDED-BY-NUMBER-ROUNDED", 2, 0, false);
        declareFunction("potentially_undefined_number_p", "POTENTIALLY-UNDEFINED-NUMBER-P", 1, 0, false);
        declareFunction("undefined", "UNDEFINED", 1, 0, false);
        declareFunction("potentially_undefined_number_E", "POTENTIALLY-UNDEFINED-NUMBER-=", 2, 0, false);
        declareFunction("potentially_undefined_number_L", "POTENTIALLY-UNDEFINED-NUMBER-<", 2, 0, false);
        declareFunction("potentially_undefined_number_G", "POTENTIALLY-UNDEFINED-NUMBER->", 2, 0, false);
        declareFunction("potentially_undefined_number_LE", "POTENTIALLY-UNDEFINED-NUMBER-<=", 2, 0, false);
        declareFunction("potentially_undefined_number_GE", "POTENTIALLY-UNDEFINED-NUMBER->=", 2, 0, false);
        declareFunction("potentially_undefined_number_plus", "POTENTIALLY-UNDEFINED-NUMBER-PLUS", 2, 0, false);
        declareFunction("potentially_undefined_number_minus", "POTENTIALLY-UNDEFINED-NUMBER-MINUS", 2, 0, false);
        declareFunction("potentially_undefined_number_times", "POTENTIALLY-UNDEFINED-NUMBER-TIMES", 2, 0, false);
        declareFunction("potentially_undefined_number_divided_by", "POTENTIALLY-UNDEFINED-NUMBER-DIVIDED-BY", 2, 0, false);
        declareFunction("maximum", "MAXIMUM", 1, 1, false);
        declareFunction("minimum", "MINIMUM", 1, 1, false);
        declareFunction("average", "AVERAGE", 1, 1, false);
        declareFunction("mean", "MEAN", 1, 0, false);
        declareFunction("summation", "SUMMATION", 1, 0, false);
        declareFunction("product", "PRODUCT", 1, 0, false);
        declareFunction("geometric_mean", "GEOMETRIC-MEAN", 1, 0, false);
        declareFunction("median", "MEDIAN", 1, 2, false);
        declareFunction("median_sorted", "MEDIAN-SORTED", 1, 3, false);
        declareFunction("percentile", "PERCENTILE", 2, 2, false);
        declareFunction("percentile_sorted", "PERCENTILE-SORTED", 2, 0, false);
        declareFunction("max_key_from_hash", "MAX-KEY-FROM-HASH", 1, 0, false);
        declareFunction("get_frequency_list", "GET-FREQUENCY-LIST", 1, 0, false);
        declareFunction("get_sorted_frequency_list", "GET-SORTED-FREQUENCY-LIST", 1, 0, false);
        declareFunction("mode", "MODE", 1, 0, false);
        declareFunction("mode_sorted", "MODE-SORTED", 1, 0, false);
        declareFunction("variance_from_sample", "VARIANCE-FROM-SAMPLE", 1, 0, false);
        declareFunction("variance_from_population", "VARIANCE-FROM-POPULATION", 1, 0, false);
        declareFunction("variance", "VARIANCE", 1, 0, false);
        declareFunction("standard_deviation_from_population", "STANDARD-DEVIATION-FROM-POPULATION", 1, 0, false);
        declareFunction("safe_standard_deviation_from_sample", "SAFE-STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false);
        declareFunction("standard_deviation_from_sample", "STANDARD-DEVIATION-FROM-SAMPLE", 1, 0, false);
        declareFunction("standard_deviation", "STANDARD-DEVIATION", 1, 0, false);
        declareFunction("standard_deviations_above_mean", "STANDARD-DEVIATIONS-ABOVE-MEAN", 3, 0, false);
        declareFunction("simple_outliers", "SIMPLE-OUTLIERS", 1, 1, false);
        declareFunction("perform_standard_statistical_analysis", "PERFORM-STANDARD-STATISTICAL-ANALYSIS", 1, 1, false);
        declareFunction("correlation", "CORRELATION", 2, 0, false);
        declareFunction("decode_integer_multiples", "DECODE-INTEGER-MULTIPLES", 2, 0, false);
        declareFunction("encode_integer_multiples", "ENCODE-INTEGER-MULTIPLES", 2, 0, false);
        declareFunction("arithmetic_progression", "ARITHMETIC-PROGRESSION", 3, 0, false);
        declareFunction("geometric_progression", "GEOMETRIC-PROGRESSION", 3, 0, false);
        declareFunction("geometric_progression_ratio", "GEOMETRIC-PROGRESSION-RATIO", 3, 0, false);
        declareFunction("number_string_p", "NUMBER-STRING-P", 1, 0, false);
        declareFunction("number_string_value", "NUMBER-STRING-VALUE", 1, 0, false);
        declareFunction("valid_number_string_char", "VALID-NUMBER-STRING-CHAR", 1, 0, false);
        declareFunction("extended_number_string_p", "EXTENDED-NUMBER-STRING-P", 1, 0, false);
        declareFunction("valid_exponent_marker", "VALID-EXPONENT-MARKER", 1, 0, false);
        declareFunction("valid_sign", "VALID-SIGN", 1, 0, false);
        declareFunction("find_smallest_prime_for_binary_width", "FIND-SMALLEST-PRIME-FOR-BINARY-WIDTH", 1, 0, false);
        declareFunction("checksum_sanity_check", "CHECKSUM-SANITY-CHECK", 0, 0, false);
        declareFunction("checksum_update", "CHECKSUM-UPDATE", 1, 0, false);
        declareFunction("checksum_finalize", "CHECKSUM-FINALIZE", 0, 0, false);
        declareMacro("checksum_setup", "CHECKSUM-SETUP");
        declareMacro("checksum_start", "CHECKSUM-START");
        declareMacro("checksum_resume", "CHECKSUM-RESUME");
        declareMacro("with_checksum", "WITH-CHECKSUM");
        declareFunction("expt_mod", "EXPT-MOD", 3, 0, false);
        declareFunction("binary_expt_mod", "BINARY-EXPT-MOD", 3, 0, false);
        declareFunction("convert_to_binary", "CONVERT-TO-BINARY", 1, 0, false);
        declareFunction("convert_to_hexadecimal", "CONVERT-TO-HEXADECIMAL", 1, 0, false);
        declareFunction("modular_subtraction", "MODULAR-SUBTRACTION", 3, 0, false);
        declareFunction("modular_addition", "MODULAR-ADDITION", 3, 0, false);
        declareFunction("modularE", "MODULAR=", 3, 0, false);
        declareFunction("number_of_digits", "NUMBER-OF-DIGITS", 1, 0, false);
        declareFunction("multiple_ofP", "MULTIPLE-OF?", 2, 0, false);
        declareFunction("multiple_of_allP", "MULTIPLE-OF-ALL?", 2, 0, false);
        declareFunction("prime_numberP", "PRIME-NUMBER?", 1, 0, false);
        declareFunction("prime_factorization", "PRIME-FACTORIZATION", 1, 0, false);
        declareFunction("common_prime_factors", "COMMON-PRIME-FACTORS", 1, 0, false);
        declareFunction("find_smallest_divisor", "FIND-SMALLEST-DIVISOR", 1, 0, false);
        declareFunction("divisors", "DIVISORS", 1, 0, false);
        declareFunction("lcm", "LCM", 1, 0, false);
        declareFunction("lcm2", "LCM2", 2, 0, false);
        declareFunction("lcm2_internal", "LCM2-INTERNAL", 2, 0, false);
        declareFunction("gcd", "GCD", 1, 0, false);
        declareFunction("gcd2", "GCD2", 2, 0, false);
        declareFunction("gcd2_internal", "GCD2-INTERNAL", 2, 0, false);
        declareFunction("gcd2_sorted_internal", "GCD2-SORTED-INTERNAL", 2, 0, false);
        declareFunction("convert_hexadecimal_to_decimal", "CONVERT-HEXADECIMAL-TO-DECIMAL", 1, 0, false);
        declareFunction("decimal_code_for_hex_digit", "DECIMAL-CODE-FOR-HEX-DIGIT", 1, 0, false);
        declareMacro("with_probability", "WITH-PROBABILITY");
        declareFunction("probability_p", "PROBABILITY-P", 1, 0, false);
        declareFunction("true_with_probability", "TRUE-WITH-PROBABILITY", 1, 0, false);
        declareFunction("true_with_probability_int", "TRUE-WITH-PROBABILITY-INT", 2, 0, false);
        declareFunction("logistic", "LOGISTIC", 1, 0, false);
        declareFunction("coin_flip", "COIN-FLIP", 0, 0, false);
        declareFunction("probability_distribution_p", "PROBABILITY-DISTRIBUTION-P", 1, 0, false);
        declareFunction("probability_distribution_sample", "PROBABILITY-DISTRIBUTION-SAMPLE", 1, 0, false);
        declareFunction("fibonacci", "FIBONACCI", 1, 0, false);
        declareFunction("fibonacci_memoized_internal", "FIBONACCI-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("fibonacci_memoized", "FIBONACCI-MEMOIZED", 1, 0, false);
        declareFunction("random_0_1", "RANDOM-0-1", 0, 0, false);
        declareFunction("random_probability", "RANDOM-PROBABILITY", 0, 0, false);
        declareFunction("n_random_integers", "N-RANDOM-INTEGERS", 2, 1, false);
        declareFunction("non_negative_integers_less_than", "NON-NEGATIVE-INTEGERS-LESS-THAN", 1, 0, false);
        declareFunction("compute_deltas", "COMPUTE-DELTAS", 1, 1, false);
        declareFunction("factorial", "FACTORIAL", 1, 0, false);
        declareFunction("choose", "CHOOSE", 2, 0, false);
        declareFunction("strictly_between_0_and_1_p", "STRICTLY-BETWEEN-0-AND-1-P", 1, 0, false);
        declareFunction("strictly_between_0_and_minus_1_p", "STRICTLY-BETWEEN-0-AND-MINUS-1-P", 1, 0, false);
        declareFunction("tolerance_E", "TOLERANCE-=", 2, 1, false);
        declareFunction("zero", "ZERO", 0, 1, false);
        declareFunction("one", "ONE", 0, 1, false);
        declareFunction("pairwise_slope", "PAIRWISE-SLOPE", 1, 0, false);
        declareFunction("values_to_coordinates", "VALUES-TO-COORDINATES", 1, 0, false);
        declareFunction("coordinates_to_values", "COORDINATES-TO-VALUES", 1, 0, false);
        declareFunction("pairwise_slope_points", "PAIRWISE-SLOPE-POINTS", 1, 0, false);
        declareFunction("average_neighbors", "AVERAGE-NEIGHBORS", 1, 1, false);
        declareFunction("renumber_id_using_table", "RENUMBER-ID-USING-TABLE", 2, 0, false);
        declareFunction("test_renumber_id_using_table", "TEST-RENUMBER-ID-USING-TABLE", 2, 0, false);
        declareFunction("transform_delete_list_to_gap_list", "TRANSFORM-DELETE-LIST-TO-GAP-LIST", 1, 0, false);
        declareFunction("transform_gap_list_to_delta_list", "TRANSFORM-GAP-LIST-TO-DELTA-LIST", 1, 0, false);
        declareFunction("renumber_id_using_delta_table", "RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
        declareFunction("test_renumber_id_using_delta_table", "TEST-RENUMBER-ID-USING-DELTA-TABLE", 2, 0, false);
        declareFunction("test_build_translation_map_for_id_renumbering", "TEST-BUILD-TRANSLATION-MAP-FOR-ID-RENUMBERING", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_number_utilities_file_alt() {
        deflexical("*LARGE-IMMEDIATE-POSITIVE-INTEGER*", expt(TWO_INTEGER, $int$26));
        defconstant("*E*", $exp1$.getGlobalValue());
        deflexical("*MAXIMUM-FLOAT-SIGNIFICANT-DIGITS*", SIXTEEN_INTEGER);
        deflexical("*VALID-NUMBER-STRING-CHARACTERS*", $str_alt65$0123456789___deDE);
        deflexical("*VALID-EXPONENT-MARKERS*", $$$deDE);
        deflexical("*VALID-SIGN*", $str_alt68$__);
        defconstant("*LARGEST-PRIME-BY-BINARY-WIDTH*", $list_alt69);
        defconstant("*CHECKSUM-IMPLEMENTATION-WIDTH*", truncate(log(abs($most_negative_fixnum$.getGlobalValue()), TWO_INTEGER), UNPROVIDED));
        defconstant("*CHECKSUM-BASE*", assoc($checksum_implementation_width$.getGlobalValue(), $largest_prime_by_binary_width$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest());
        defconstant("*CHECKSUM-INITIAL-VALUE-SUM*", ONE_INTEGER);
        defconstant("*CHECKSUM-INITIAL-VALUE-LENGTH*", ZERO_INTEGER);
        defparameter("*CHECKSUM-SUM*", ONE_INTEGER);
        defparameter("*CHECKSUM-LENGTH*", ZERO_INTEGER);
        defparameter("*HEX-TO-DEC-TABLE*", $list_alt98);
        return NIL;
    }

    public static SubLObject init_number_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*LARGE-IMMEDIATE-POSITIVE-INTEGER*", expt(TWO_INTEGER, $int$26));
            defconstant("*E*", $exp1$.getGlobalValue());
            deflexical("*MAXIMUM-FLOAT-SIGNIFICANT-DIGITS*", SIXTEEN_INTEGER);
            deflexical("*VALID-NUMBER-STRING-CHARACTERS*", $str79$0123456789___deDE);
            deflexical("*VALID-EXPONENT-MARKERS*", $$$deDE);
            deflexical("*VALID-SIGN*", $str82$__);
            defconstant("*LARGEST-PRIME-BY-BINARY-WIDTH*", $list83);
            defconstant("*CHECKSUM-IMPLEMENTATION-WIDTH*", truncate(log(abs($most_negative_fixnum$.getGlobalValue()), TWO_INTEGER), UNPROVIDED));
            defconstant("*CHECKSUM-BASE*", assoc($checksum_implementation_width$.getGlobalValue(), $largest_prime_by_binary_width$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest());
            defconstant("*CHECKSUM-INITIAL-VALUE-SUM*", ONE_INTEGER);
            defconstant("*CHECKSUM-INITIAL-VALUE-LENGTH*", ZERO_INTEGER);
            defparameter("*CHECKSUM-SUM*", ONE_INTEGER);
            defparameter("*CHECKSUM-LENGTH*", ZERO_INTEGER);
            defparameter("*HEX-TO-DEC-TABLE*", $list115);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*VALID-NUMBER-STRING-CHARACTERS*", $str_alt65$0123456789___deDE);
            deflexical("*VALID-SIGN*", $str_alt68$__);
            defconstant("*LARGEST-PRIME-BY-BINARY-WIDTH*", $list_alt69);
            defparameter("*HEX-TO-DEC-TABLE*", $list_alt98);
        }
        return NIL;
    }

    public static SubLObject init_number_utilities_file_Previous() {
        deflexical("*LARGE-IMMEDIATE-POSITIVE-INTEGER*", expt(TWO_INTEGER, $int$26));
        defconstant("*E*", $exp1$.getGlobalValue());
        deflexical("*MAXIMUM-FLOAT-SIGNIFICANT-DIGITS*", SIXTEEN_INTEGER);
        deflexical("*VALID-NUMBER-STRING-CHARACTERS*", $str79$0123456789___deDE);
        deflexical("*VALID-EXPONENT-MARKERS*", $$$deDE);
        deflexical("*VALID-SIGN*", $str82$__);
        defconstant("*LARGEST-PRIME-BY-BINARY-WIDTH*", $list83);
        defconstant("*CHECKSUM-IMPLEMENTATION-WIDTH*", truncate(log(abs($most_negative_fixnum$.getGlobalValue()), TWO_INTEGER), UNPROVIDED));
        defconstant("*CHECKSUM-BASE*", assoc($checksum_implementation_width$.getGlobalValue(), $largest_prime_by_binary_width$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest());
        defconstant("*CHECKSUM-INITIAL-VALUE-SUM*", ONE_INTEGER);
        defconstant("*CHECKSUM-INITIAL-VALUE-LENGTH*", ZERO_INTEGER);
        defparameter("*CHECKSUM-SUM*", ONE_INTEGER);
        defparameter("*CHECKSUM-LENGTH*", ZERO_INTEGER);
        defparameter("*HEX-TO-DEC-TABLE*", $list115);
        return NIL;
    }

    public static final SubLObject setup_number_utilities_file_alt() {
        register_cyc_api_function(NIL_OR_INTEGER_P, $list_alt4, $str_alt5$Return_T_iff_OBJECT_is_either_an_, NIL, $list_alt6);
        define_test_case_table_int(CHECKSUM_SANITY_CHECK, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt78);
        register_macro_helper(CHECKSUM_SETUP, $list_alt80);
        memoization_state.note_memoized_function(FIBONACCI_MEMOIZED);
        define_test_case_table_int(AVERAGE_NEIGHBORS, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt123);
        define_test_case_table_int(TEST_RENUMBER_ID_USING_TABLE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt126);
        define_test_case_table_int(TRANSFORM_DELETE_LIST_TO_GAP_LIST, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt130);
        define_test_case_table_int(TRANSFORM_GAP_LIST_TO_DELTA_LIST, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt134);
        define_test_case_table_int(TEST_RENUMBER_ID_USING_DELTA_TABLE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt126);
        define_test_case_table_int($sym137$PRIME_NUMBER_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt138);
        define_test_case_table_int(FIND_SMALLEST_DIVISOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt140);
        define_test_case_table_int(MEDIAN, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt143);
        define_test_case_table_int(COMPUTE_DELTAS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt145);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(LCM_GCD_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(LCM_GCD_TEST_CASE);
        classes.subloop_new_class(LCM_GCD_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt148);
        classes.class_set_implements_slot_listeners(LCM_GCD_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(LCM_GCD_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_LCM_GCD_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(LCM_GCD_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_LCM_GCD_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.number_utilities.subloop_reserved_initialize_lcm_gcd_test_case_class(LCM_GCD_TEST_CASE);
        sunit_macros.define_test_case_postamble(LCM_GCD_TEST_CASE, $str_alt163$number_utilities, $$$cycl, NIL);
        sunit_macros.def_test_method_register(LCM_GCD_TEST_CASE, LCM_TEST);
        sunit_macros.def_test_method_register(LCM_GCD_TEST_CASE, GCD_TEST);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(EXTENDED_NUMBERS_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(EXTENDED_NUMBERS_TEST_CASE);
        classes.subloop_new_class(EXTENDED_NUMBERS_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt168);
        classes.class_set_implements_slot_listeners(EXTENDED_NUMBERS_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(EXTENDED_NUMBERS_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_EXTENDED_NUMBERS_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(EXTENDED_NUMBERS_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_EXTENDED_NUMBERS_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.number_utilities.subloop_reserved_initialize_extended_numbers_test_case_class(EXTENDED_NUMBERS_TEST_CASE);
        sunit_macros.define_test_case_postamble(EXTENDED_NUMBERS_TEST_CASE, $str_alt163$number_utilities, $$$cycl, NIL);
        sunit_macros.def_test_method_register(EXTENDED_NUMBERS_TEST_CASE, POTENTIALLY_INFINITE_NUMBER_TEST);
        sunit_macros.def_test_method_register(EXTENDED_NUMBERS_TEST_CASE, POTENTIALLY_UNDEFINED_NUMBER_TEST);
        return NIL;
    }

    public static SubLObject setup_number_utilities_file() {
        if (SubLFiles.USE_V1) {
            SubLSpecialOperatorDeclarations.proclaim($list0);
            SubLSpecialOperatorDeclarations.proclaim($list1);
            register_cyc_api_function(NIL_OR_INTEGER_P, $list6, $str7$Return_T_iff_OBJECT_is_either_an_, NIL, $list8);
            define_test_case_table_int(CHECKSUM_SANITY_CHECK, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list91);
            register_macro_helper(CHECKSUM_SETUP, $list93);
            define_test_case_table_int(FIND_SMALLEST_DIVISOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list109);
            memoization_state.note_memoized_function(FIBONACCI_MEMOIZED);
            define_test_case_table_int(AVERAGE_NEIGHBORS, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list137);
            define_test_case_table_int(TEST_RENUMBER_ID_USING_TABLE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list140);
            define_test_case_table_int(TRANSFORM_DELETE_LIST_TO_GAP_LIST, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list144);
            define_test_case_table_int(TRANSFORM_GAP_LIST_TO_DELTA_LIST, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list148);
            define_test_case_table_int(TEST_RENUMBER_ID_USING_DELTA_TABLE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list140);
            define_test_case_table_int($sym151$PRIME_NUMBER_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list152);
            define_test_case_table_int(FIND_SMALLEST_DIVISOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list153);
            define_test_case_table_int(MEDIAN, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list155);
            define_test_case_table_int(COMPUTE_DELTAS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list157);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(NIL_OR_INTEGER_P, $list_alt4, $str_alt5$Return_T_iff_OBJECT_is_either_an_, NIL, $list_alt6);
            define_test_case_table_int(CHECKSUM_SANITY_CHECK, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt78);
            register_macro_helper(CHECKSUM_SETUP, $list_alt80);
            define_test_case_table_int(AVERAGE_NEIGHBORS, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt123);
            define_test_case_table_int(TEST_RENUMBER_ID_USING_TABLE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt126);
            define_test_case_table_int(TRANSFORM_DELETE_LIST_TO_GAP_LIST, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt130);
            define_test_case_table_int(TRANSFORM_GAP_LIST_TO_DELTA_LIST, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt134);
            define_test_case_table_int(TEST_RENUMBER_ID_USING_DELTA_TABLE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt126);
            define_test_case_table_int($sym137$PRIME_NUMBER_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt138);
            define_test_case_table_int(FIND_SMALLEST_DIVISOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$baxter, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt140);
            define_test_case_table_int(MEDIAN, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt143);
            define_test_case_table_int(COMPUTE_DELTAS, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt145);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(LCM_GCD_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(LCM_GCD_TEST_CASE);
            classes.subloop_new_class(LCM_GCD_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt148);
            classes.class_set_implements_slot_listeners(LCM_GCD_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(LCM_GCD_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_LCM_GCD_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(LCM_GCD_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_LCM_GCD_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.number_utilities.subloop_reserved_initialize_lcm_gcd_test_case_class(LCM_GCD_TEST_CASE);
            sunit_macros.define_test_case_postamble(LCM_GCD_TEST_CASE, $str_alt163$number_utilities, $$$cycl, NIL);
            sunit_macros.def_test_method_register(LCM_GCD_TEST_CASE, LCM_TEST);
            sunit_macros.def_test_method_register(LCM_GCD_TEST_CASE, GCD_TEST);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(EXTENDED_NUMBERS_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(EXTENDED_NUMBERS_TEST_CASE);
            classes.subloop_new_class(EXTENDED_NUMBERS_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt168);
            classes.class_set_implements_slot_listeners(EXTENDED_NUMBERS_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(EXTENDED_NUMBERS_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_EXTENDED_NUMBERS_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(EXTENDED_NUMBERS_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_EXTENDED_NUMBERS_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.number_utilities.subloop_reserved_initialize_extended_numbers_test_case_class(EXTENDED_NUMBERS_TEST_CASE);
            sunit_macros.define_test_case_postamble(EXTENDED_NUMBERS_TEST_CASE, $str_alt163$number_utilities, $$$cycl, NIL);
            sunit_macros.def_test_method_register(EXTENDED_NUMBERS_TEST_CASE, POTENTIALLY_INFINITE_NUMBER_TEST);
            sunit_macros.def_test_method_register(EXTENDED_NUMBERS_TEST_CASE, POTENTIALLY_UNDEFINED_NUMBER_TEST);
        }
        return NIL;
    }

    public static SubLObject setup_number_utilities_file_Previous() {
        SubLSpecialOperatorDeclarations.proclaim($list0);
        SubLSpecialOperatorDeclarations.proclaim($list1);
        register_cyc_api_function(NIL_OR_INTEGER_P, $list6, $str7$Return_T_iff_OBJECT_is_either_an_, NIL, $list8);
        define_test_case_table_int(CHECKSUM_SANITY_CHECK, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list91);
        register_macro_helper(CHECKSUM_SETUP, $list93);
        define_test_case_table_int(FIND_SMALLEST_DIVISOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list109);
        memoization_state.note_memoized_function(FIBONACCI_MEMOIZED);
        define_test_case_table_int(AVERAGE_NEIGHBORS, list(new SubLObject[]{ $TEST, EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list137);
        define_test_case_table_int(TEST_RENUMBER_ID_USING_TABLE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list140);
        define_test_case_table_int(TRANSFORM_DELETE_LIST_TO_GAP_LIST, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list144);
        define_test_case_table_int(TRANSFORM_GAP_LIST_TO_DELTA_LIST, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list148);
        define_test_case_table_int(TEST_RENUMBER_ID_USING_DELTA_TABLE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list140);
        define_test_case_table_int($sym151$PRIME_NUMBER_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list152);
        define_test_case_table_int(FIND_SMALLEST_DIVISOR, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list153);
        define_test_case_table_int(MEDIAN, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list155);
        define_test_case_table_int(COMPUTE_DELTAS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list157);
        return NIL;
    }

    private static SubLObject _constant_140_initializer() {
        return list(list(list(list(ONE_INTEGER, FOUR_INTEGER, SEVEN_INTEGER, TEN_INTEGER), TWELVE_INTEGER), makeKeyword("SUCCESS")), list(list(list(new SubLObject[]{ ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), makeInteger(365), makeInteger(366), makeInteger(367), makeInteger(368), makeInteger(369), makeInteger(374), makeInteger(375), makeInteger(378), makeInteger(429), makeInteger(430), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), makeInteger(538), makeInteger(539), makeInteger(555), makeInteger(614), makeInteger(623), makeInteger(624), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), makeInteger(1146), makeInteger(1147), makeInteger(1150), makeInteger(1251), makeInteger(1252), makeInteger(1471), makeInteger(1475), makeInteger(1485) }), makeInteger(1460)), makeKeyword("SUCCESS")), list(list(list(new SubLObject[]{ ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), makeInteger(32), makeInteger(33), makeInteger(34), makeInteger(35), makeInteger(36), makeInteger(37), makeInteger(38), makeInteger(39), makeInteger(40), makeInteger(41), makeInteger(42), makeInteger(43), makeInteger(44), makeInteger(45), makeInteger(46), makeInteger(47), makeInteger(48), makeInteger(49), makeInteger(50), makeInteger(51), makeInteger(52), makeInteger(53), makeInteger(54), makeInteger(55), makeInteger(56), makeInteger(57), makeInteger(58), makeInteger(59), makeInteger(60), makeInteger(61), makeInteger(62), makeInteger(63), makeInteger(64), makeInteger(65), makeInteger(66), makeInteger(67), makeInteger(68), makeInteger(69), makeInteger(70), makeInteger(71), makeInteger(72), makeInteger(73), makeInteger(80), makeInteger(82), makeInteger(83), makeInteger(301), makeInteger(302), makeInteger(309), makeInteger(316), makeInteger(317), makeInteger(351), makeInteger(352), makeInteger(353), makeInteger(884), makeInteger(885), makeInteger(886), makeInteger(887), makeInteger(888), makeInteger(889), makeInteger(890), makeInteger(891), makeInteger(892), makeInteger(893), makeInteger(894), makeInteger(895), makeInteger(896), makeInteger(897), makeInteger(898), makeInteger(899), makeInteger(900), makeInteger(901), makeInteger(902), makeInteger(903), makeInteger(904), makeInteger(905), makeInteger(906), makeInteger(907), makeInteger(908), makeInteger(909), makeInteger(910), makeInteger(911), makeInteger(912), makeInteger(913), makeInteger(914), makeInteger(915), makeInteger(916), makeInteger(917), makeInteger(918), makeInteger(919), makeInteger(920), makeInteger(921), makeInteger(922), makeInteger(923), makeInteger(924), makeInteger(925), makeInteger(926), makeInteger(927), makeInteger(928), makeInteger(929), makeInteger(930), makeInteger(931), makeInteger(932), makeInteger(933), makeInteger(934), makeInteger(935), makeInteger(936), makeInteger(937), makeInteger(938), makeInteger(939), makeInteger(940), makeInteger(941), makeInteger(942), makeInteger(943), makeInteger(944), makeInteger(945), makeInteger(946), makeInteger(947), makeInteger(948), makeInteger(949), makeInteger(950), makeInteger(951), makeInteger(952), makeInteger(953), makeInteger(954), makeInteger(955), makeInteger(956), makeInteger(957), makeInteger(958), makeInteger(959), makeInteger(960), makeInteger(961), makeInteger(962), makeInteger(963), makeInteger(964), makeInteger(965), makeInteger(966), makeInteger(967), makeInteger(968), makeInteger(969), makeInteger(970), makeInteger(971), makeInteger(972), makeInteger(973), makeInteger(974), makeInteger(984), makeInteger(985), makeInteger(986), makeInteger(1324), makeInteger(1325), makeInteger(1326), makeInteger(1327), makeInteger(1619), makeInteger(1629), makeInteger(1630), makeInteger(1631), makeInteger(1632), makeInteger(1641), makeInteger(1642), makeInteger(1643), makeInteger(1645), makeInteger(1646), makeInteger(1647), makeInteger(1649), makeInteger(1650), makeInteger(1651), makeInteger(1653), makeInteger(1655), makeInteger(1656), makeInteger(1657), makeInteger(1658), makeInteger(1723), makeInteger(1729), makeInteger(1733), makeInteger(1740), makeInteger(1741), makeInteger(1742), makeInteger(1743), makeInteger(1745), makeInteger(1756), makeInteger(1757), makeInteger(1758), makeInteger(1759), makeInteger(1760), makeInteger(1810), makeInteger(1834), makeInteger(1835), makeInteger(1868), makeInteger(2084), makeInteger(2145), makeInteger(2146), makeInteger(2170), makeInteger(2185), makeInteger(2186), makeInteger(2187), makeInteger(2194), makeInteger(2198), makeInteger(2201), makeInteger(2202), makeInteger(2203), makeInteger(2204), makeInteger(2205), makeInteger(2207), makeInteger(2211), makeInteger(2215), makeInteger(2216), makeInteger(2218), makeInteger(2223), makeInteger(2226), makeInteger(2227), makeInteger(2228), makeInteger(2256), makeInteger(2263), makeInteger(2269), makeInteger(2270), makeInteger(2271), makeInteger(2273), makeInteger(2277), makeInteger(2278), makeInteger(2283), makeInteger(2287), makeInteger(2289), makeInteger(2291), makeInteger(2292), makeInteger(2293), makeInteger(2295), makeInteger(2296), makeInteger(2297), makeInteger(2299), makeInteger(2316), makeInteger(2319), makeInteger(2321), makeInteger(2323), makeInteger(2324), makeInteger(2325), makeInteger(2330), makeInteger(2332), makeInteger(2337), makeInteger(2351), makeInteger(2364), makeInteger(2365), makeInteger(2367), makeInteger(2368), makeInteger(2372), makeInteger(2375), makeInteger(2378), makeInteger(2385), makeInteger(2386), makeInteger(2390), makeInteger(2391), makeInteger(2395), makeInteger(2402), makeInteger(2409), makeInteger(2410), makeInteger(2415), makeInteger(2418), makeInteger(2422), makeInteger(2429), makeInteger(2435), makeInteger(2437), makeInteger(2439), makeInteger(2445), makeInteger(2446), makeInteger(2450), makeInteger(2452), makeInteger(2453), makeInteger(2454), makeInteger(2455), makeInteger(2457), makeInteger(2458), makeInteger(2462), makeInteger(2463), makeInteger(2470), makeInteger(2471), makeInteger(2474), makeInteger(2475), makeInteger(2477), makeInteger(2479), makeInteger(2484), makeInteger(2487), makeInteger(2488), makeInteger(2491), makeInteger(2494), makeInteger(2497), makeInteger(2500), makeInteger(2502), makeInteger(2505), makeInteger(2506), makeInteger(2507), makeInteger(2509), makeInteger(2512), makeInteger(2513), makeInteger(2515), makeInteger(2516), makeInteger(2517), makeInteger(2518), makeInteger(2531), makeInteger(2532), makeInteger(2548), makeInteger(2549), makeInteger(2556), makeInteger(2559), makeInteger(3315), makeInteger(3317), makeInteger(3318), makeInteger(3319), makeInteger(3339), makeInteger(3342), makeInteger(3344), makeInteger(3372), makeInteger(3373), makeInteger(3374), makeInteger(3375), makeInteger(3376), makeInteger(3377), makeInteger(3378), makeInteger(3379), makeInteger(3380), makeInteger(3381), makeInteger(3382), makeInteger(3383), makeInteger(3384), makeInteger(3385), makeInteger(3386), makeInteger(3387), makeInteger(3388), makeInteger(3389), makeInteger(3390), makeInteger(3391), makeInteger(3392), makeInteger(3393), makeInteger(3394), makeInteger(3395), makeInteger(3396), makeInteger(3397), makeInteger(3398), makeInteger(3399), makeInteger(3400), makeInteger(3401), makeInteger(3402), makeInteger(3403), makeInteger(3404), makeInteger(3405), makeInteger(3406), makeInteger(3407), makeInteger(3408), makeInteger(3409), makeInteger(3410), makeInteger(3411), makeInteger(3412), makeInteger(3413), makeInteger(3414), makeInteger(3415), makeInteger(3416), makeInteger(3417), makeInteger(3418), makeInteger(3419), makeInteger(3420), makeInteger(3421), makeInteger(3422), makeInteger(3423), makeInteger(3424), makeInteger(3425), makeInteger(3426), makeInteger(3427), makeInteger(3428), makeInteger(3429), makeInteger(3430), makeInteger(3431), makeInteger(3432), makeInteger(3433), makeInteger(3434), makeInteger(3435), makeInteger(3437), makeInteger(3438), makeInteger(3439), makeInteger(3440), makeInteger(3441), makeInteger(3442), makeInteger(3443), makeInteger(3444), makeInteger(3445), makeInteger(3446), makeInteger(3447), makeInteger(3448), makeInteger(3449), makeInteger(3450), makeInteger(3451), makeInteger(3452), makeInteger(3461), makeInteger(3463), makeInteger(3464), makeInteger(3465), makeInteger(3466), makeInteger(3467), makeInteger(3476), makeInteger(3477), makeInteger(3482), makeInteger(3485), makeInteger(3486), makeInteger(3490), makeInteger(3491), makeInteger(3493), makeInteger(3496), makeInteger(3506), makeInteger(3507), makeInteger(3514), makeInteger(3598), makeInteger(3600), makeInteger(3607), makeInteger(3608), makeInteger(3609), makeInteger(3610), makeInteger(3611), makeInteger(3612), makeInteger(3613), makeInteger(3614), makeInteger(3615), makeInteger(3616), makeInteger(3617), makeInteger(3618), makeInteger(3632), makeInteger(3637), makeInteger(3638), makeInteger(3639), makeInteger(3640), makeInteger(3641), makeInteger(3642), makeInteger(3647), makeInteger(3648), makeInteger(3652), makeInteger(3653), makeInteger(3654), makeInteger(3657), makeInteger(3658), makeInteger(3727), makeInteger(3739), makeInteger(3750), makeInteger(3753), makeInteger(3756), makeInteger(3764), makeInteger(3769), makeInteger(3770), makeInteger(3793), makeInteger(3796), makeInteger(3810), makeInteger(3827), makeInteger(3829), makeInteger(3830), makeInteger(3833), makeInteger(3834), makeInteger(3835), makeInteger(3859), makeInteger(3860), makeInteger(3877), makeInteger(3878), makeInteger(3879), makeInteger(3880), makeInteger(3881), makeInteger(3882), makeInteger(3885), makeInteger(3886), makeInteger(4013), makeInteger(4038), makeInteger(4039), makeInteger(4040), makeInteger(4100), makeInteger(4149), makeInteger(4150) }), makeInteger(4160)), makeKeyword("SUCCESS")));
    }

    static private final SubLList $list_alt4 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt5$Return_T_iff_OBJECT_is_either_an_ = makeString("Return T iff OBJECT is either an integer or NIL");

    static private final SubLList $list_alt6 = list(makeSymbol("BOOLEANP"));

    static private final SubLString $str_alt19$Can_t_divide_zero_by_zero = makeString("Can't divide zero by zero");

    static private final SubLString $str_alt21$Can_t_add_positive_infinity_and_n = makeString("Can't add positive infinity and negative infinity");

    static private final SubLString $str_alt22$Can_t_subtract_negative_infinity_ = makeString("Can't subtract negative infinity from itself");

    static private final SubLString $str_alt23$Can_t_subtract_positive_infinity_ = makeString("Can't subtract positive infinity from itself");

    static private final SubLString $str_alt24$Can_t_multiply_infinity_and_zero = makeString("Can't multiply infinity and zero");

    static private final SubLString $str_alt25$Can_t_divide_negative_infinity_by = makeString("Can't divide negative infinity by itself");

    static private final SubLString $str_alt26$Can_t_divide_negative_infinity_by = makeString("Can't divide negative infinity by positive infinity");

    static private final SubLString $str_alt27$Can_t_divide_positive_infinity_by = makeString("Can't divide positive infinity by negative infinity");

    static private final SubLString $str_alt28$Can_t_divide_positive_infinity_by = makeString("Can't divide positive infinity by itself");

    static private final SubLString $str_alt32$Cannot_compute_the_maximum_of_an_ = makeString("Cannot compute the maximum of an atom or empty list");

    static private final SubLSymbol $sym33$_ = makeSymbol(">");

    static private final SubLString $str_alt34$Cannot_compute_the_minimum_of_an_ = makeString("Cannot compute the minimum of an atom or empty list");

    static private final SubLString $str_alt36$Cannot_compute_the_mean_of_an_ato = makeString("Cannot compute the mean of an atom or empty list");

    static private final SubLString $str_alt37$Cannot_compute_the_geometric_mean = makeString("Cannot compute the geometric mean of an atom or empty list");

    static private final SubLString $str_alt38$Cannot_compute_the_median_of_an_a = makeString("Cannot compute the median of an atom or empty list");

    static private final SubLString $str_alt40$Cannot_compute_the_percentile_of_ = makeString("Cannot compute the percentile of an atom or empty list");

    static private final SubLString $str_alt41$Cannot_compute_frequencies_of_an_ = makeString("Cannot compute frequencies of an atom or empty list");

    static private final SubLString $str_alt43$Cannot_compute_the_mode_of_an_ato = makeString("Cannot compute the mode of an atom or empty list");

    static private final SubLString $str_alt44$Cannot_compute_the_variance_of_an = makeString("Cannot compute the variance of an atom or empty list");

    static private final SubLString $str_alt45$Cannot_make_reasonable_estimate_o = makeString("Cannot make reasonable estimate of variance from only one element");

    static private final SubLString $str_alt46$Cannot_compute_the_standard_devia = makeString("Cannot compute the standard deviation of an atom or empty list");

    static private final SubLString $str_alt47$Standard_deviation_must_not_be_ze = makeString("Standard deviation must not be zero.");

    static private final SubLString $str_alt49$__Standard_Statistical_Analysis = makeString("~%Standard Statistical Analysis");

    static private final SubLString $str_alt50$_______________________________ = makeString("~%=============================");

    static private final SubLString $str_alt51$__N____S = makeString("~%N : ~S");

    static private final SubLString $str_alt52$__Min____S = makeString("~%Min : ~S");

    static private final SubLString $str_alt53$__Max____S = makeString("~%Max : ~S");

    static private final SubLString $str_alt54$__Median____S = makeString("~%Median : ~S");

    static private final SubLString $str_alt55$__Mean____S = makeString("~%Mean : ~S");

    static private final SubLString $str_alt56$__Standard_Deviation____S = makeString("~%Standard Deviation : ~S");

    static private final SubLString $str_alt57$X_Values_and_Y_Values_must_be_of_ = makeString("X-Values and Y-Values must be of the same length ~A.");

    static private final SubLString $str_alt61$This_integer_is_too_large_to_be_c = makeString("This integer is too large to be converted to a double-float");

    static private final SubLString $str_alt62$_A = makeString("~A");

    static private final SubLString $str_alt65$0123456789___deDE = makeString("0123456789.-+deDE");

    static private final SubLString $str_alt68$__ = makeString("+-");

    static private final SubLList $list_alt69 = list(new SubLObject[]{ cons(TWO_INTEGER, THREE_INTEGER), cons(THREE_INTEGER, SEVEN_INTEGER), cons(FOUR_INTEGER, THIRTEEN_INTEGER), cons(FIVE_INTEGER, makeInteger(31)), cons(SIX_INTEGER, makeInteger(61)), cons(SEVEN_INTEGER, makeInteger(127)), cons(EIGHT_INTEGER, makeInteger(251)), cons(NINE_INTEGER, makeInteger(509)), cons(TEN_INTEGER, makeInteger(1021)), cons(ELEVEN_INTEGER, makeInteger(2039)), cons(TWELVE_INTEGER, makeInteger(4093)), cons(THIRTEEN_INTEGER, makeInteger(8191)), cons(FOURTEEN_INTEGER, makeInteger(16381)), cons(FIFTEEN_INTEGER, makeInteger(32749)), cons(SIXTEEN_INTEGER, makeInteger(65521)), cons(SEVENTEEN_INTEGER, makeInteger(131071)), cons(EIGHTEEN_INTEGER, makeInteger(262139)), cons(NINETEEN_INTEGER, makeInteger(524287)), cons(TWENTY_INTEGER, makeInteger(1048573)), cons(makeInteger(21), makeInteger(2097143)), cons(makeInteger(22), makeInteger(4194301)), cons(makeInteger(23), makeInteger(8388593)), cons(makeInteger(24), makeInteger(16777213)), cons(makeInteger(25), makeInteger(33554393)), cons(makeInteger(26), makeInteger(67108859)), cons(makeInteger(27), makeInteger(134217689)), cons(makeInteger(28), makeInteger(268435399)), cons(makeInteger(29), makeInteger("536870909")), cons(makeInteger(30), makeInteger("1073741789")), cons(makeInteger(31), makeInteger("2147483647")), cons(makeInteger(32), makeInteger("4294967291")), cons(makeInteger(33), makeInteger("8589934583")), cons(makeInteger(34), makeInteger("17179869143")), cons(makeInteger(35), makeInteger("34359738337")), cons(makeInteger(36), makeInteger("68719476731")), cons(makeInteger(37), makeInteger("137438953447")), cons(makeInteger(38), makeInteger("274877906899")), cons(makeInteger(39), makeInteger("549755813881")), cons(makeInteger(40), makeInteger("1099511627689")), cons(makeInteger(41), makeInteger("2199023255531")), cons(makeInteger(42), makeInteger("4398046511093")), cons(makeInteger(43), makeInteger("8796093022151")), cons(makeInteger(44), makeInteger("17592186044399")), cons(makeInteger(45), makeInteger("35184372088777")), cons(makeInteger(46), makeInteger("70368744177643")), cons(makeInteger(47), makeInteger("140737488355213")), cons(makeInteger(48), makeInteger("281474976710597")), cons(makeInteger(49), makeInteger("562949953421231")), cons(makeInteger(50), makeInteger("1125899906842597")), cons(makeInteger(51), makeInteger("2251799813685119")), cons(makeInteger(52), makeInteger("4503599627370449")), cons(makeInteger(53), makeInteger("9007199254740881")), cons(makeInteger(54), makeInteger("18014398509481951")), cons(makeInteger(55), makeInteger("36028797018963913")), cons(makeInteger(56), makeInteger("72057594037927931")), cons(makeInteger(57), makeInteger("144115188075855859")), cons(makeInteger(58), makeInteger("288230376151711717")), cons(makeInteger(59), makeInteger("576460752303423433")), cons(makeInteger(60), makeInteger("1152921504606846883")), cons(makeInteger(61), makeInteger("2305843009213693951")), cons(makeInteger(62), makeInteger("4611686018427387847")), cons(makeInteger(63), makeInteger("9223372036854775783")), cons(makeInteger(64), makeInteger("18446744073709551557")) });

    @Override
    public void declareFunctions() {
        declare_number_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_number_utilities_file();
    }

    static private final SubLString $$$baxter = makeString("baxter");

    @Override
    public void runTopLevelForms() {
        setup_number_utilities_file();
    }

    static private final SubLList $list_alt78 = list(list(NIL, T));

    static {
    }

    static private final SubLList $list_alt80 = list(makeSymbol("CHECKSUM-START"), makeSymbol("CHECKSUM-RESUME"), makeSymbol("WITH-CHECKSUM"));

    static private final SubLList $list_alt81 = list(list(makeSymbol("SUM-INIT"), makeSymbol("LENGTH-INIT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt85 = list(makeSymbol("*CHECKSUM-INITIAL-VALUE-SUM*"), makeSymbol("*CHECKSUM-INITIAL-VALUE-LENGTH*"));

    static private final SubLList $list_alt86 = list(list(makeSymbol("ACCUMULATORS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt88 = list(list(makeSymbol("CHECKSUM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt91 = list(list(makeSymbol("CHECKSUM-FINALIZE")));

    static private final SubLString $str_alt93$_X = makeString("~X");

    static private final SubLList $list_alt98 = list(new SubLObject[]{ list(CHAR_a, TEN_INTEGER), list(CHAR_A, TEN_INTEGER), list(CHAR_b, ELEVEN_INTEGER), list(CHAR_B, ELEVEN_INTEGER), list(CHAR_c, TWELVE_INTEGER), list(CHAR_C, TWELVE_INTEGER), list(CHAR_d, THIRTEEN_INTEGER), list(CHAR_D, THIRTEEN_INTEGER), list(CHAR_e, FOURTEEN_INTEGER), list(CHAR_E, FOURTEEN_INTEGER), list(CHAR_f, FIFTEEN_INTEGER), list(CHAR_F, FIFTEEN_INTEGER) });

    static private final SubLList $list_alt99 = list(makeSymbol("PROBABILITY"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym100$PROB = makeUninternedSymbol("PROB");

    static private final SubLList $list_alt102 = list(makeSymbol("PROBABILITY-P"));

    static private final SubLString $str_alt109$Error_sampling_from__s____s__s_ = makeString("Error sampling from ~s: (~s ~s)");

    static private final SubLString $str_alt111$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLSymbol $kw113$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt115 = cons(makeSymbol("FIRST"), makeSymbol("REST"));

    static private final SubLString $str_alt116$_s_must_be_____s = makeString("~s must be <= ~s");

    static private final SubLList $list_alt117 = list(makeSymbol("PREV-X"), makeSymbol("PREV-Y"));

    static private final SubLList $list_alt118 = list(makeSymbol("CURR-X"), makeSymbol("CURR-Y"));

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt123 = list(list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER), THREE_INTEGER), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER)), list(list(list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER }), FIVE_INTEGER), list(new SubLObject[]{ ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER })));

    public static final SubLObject $list_alt126 = com.cyc.cycjava.cycl.number_utilities._constant_126_initializer();

    static private final SubLString $str_alt127$Original_id__A_was_supposed_to_ma = makeString("Original id ~A was supposed to map to ~A, but was renumbered to ~A.");

    static private final SubLList $list_alt130 = list(list(list(list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER)), list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER)), list(list(list(new SubLObject[]{ TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER })), list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER, cons(ELEVEN_INTEGER, TWO_INTEGER), cons(FOURTEEN_INTEGER, THREE_INTEGER))), list(list(list(new SubLObject[]{ ZERO_INTEGER, TWO_INTEGER, THREE_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), makeInteger(365), makeInteger(366), makeInteger(367), makeInteger(368), makeInteger(369), makeInteger(374), makeInteger(375), makeInteger(378), makeInteger(429), makeInteger(430), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), makeInteger(538), makeInteger(539), makeInteger(555), makeInteger(614), makeInteger(623), makeInteger(624), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), makeInteger(1146), makeInteger(1147), makeInteger(1150), makeInteger(1251), makeInteger(1252), makeInteger(1471), makeInteger(1475), makeInteger(1485) })), list(new SubLObject[]{ ZERO_INTEGER, cons(TWO_INTEGER, TWO_INTEGER), ELEVEN_INTEGER, cons(THIRTEEN_INTEGER, FOUR_INTEGER), makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), cons(makeInteger(365), FIVE_INTEGER), cons(makeInteger(374), TWO_INTEGER), makeInteger(378), cons(makeInteger(429), TWO_INTEGER), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), cons(makeInteger(538), TWO_INTEGER), makeInteger(555), makeInteger(614), cons(makeInteger(623), TWO_INTEGER), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), cons(makeInteger(1146), TWO_INTEGER), makeInteger(1150), cons(makeInteger(1251), TWO_INTEGER), makeInteger(1471), makeInteger(1475), makeInteger(1485) })));

    static private final SubLList $list_alt131 = cons(makeSymbol("START"), makeSymbol("WIDTH"));

    static private final SubLString $str_alt132$Invalid_gap_list_format__Unclear_ = makeString("Invalid gap list format: Unclear what to do with element ~A.");

    static private final SubLList $list_alt134 = list(list(list(list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER, cons(ELEVEN_INTEGER, TWO_INTEGER))), list(cons(TWO_INTEGER, FOUR_INTEGER), cons(EIGHT_INTEGER, FIVE_INTEGER), cons(ELEVEN_INTEGER, SEVEN_INTEGER))), list(list(list(cons(TWO_INTEGER, FOUR_INTEGER), EIGHT_INTEGER, cons(ELEVEN_INTEGER, TWO_INTEGER), cons(FOURTEEN_INTEGER, THREE_INTEGER))), list(cons(TWO_INTEGER, FOUR_INTEGER), cons(EIGHT_INTEGER, FIVE_INTEGER), cons(ELEVEN_INTEGER, SEVEN_INTEGER), cons(FOURTEEN_INTEGER, TEN_INTEGER))), list(list(list(new SubLObject[]{ ZERO_INTEGER, cons(TWO_INTEGER, TWO_INTEGER), ELEVEN_INTEGER, cons(THIRTEEN_INTEGER, FOUR_INTEGER), makeInteger(27), makeInteger(57), makeInteger(59), makeInteger(64), makeInteger(250), makeInteger(361), cons(makeInteger(365), FIVE_INTEGER), cons(makeInteger(374), TWO_INTEGER), makeInteger(378), cons(makeInteger(429), TWO_INTEGER), makeInteger(436), makeInteger(442), makeInteger(473), makeInteger(510), cons(makeInteger(538), TWO_INTEGER), makeInteger(555), makeInteger(614), cons(makeInteger(623), TWO_INTEGER), makeInteger(643), makeInteger(1041), makeInteger(1062), makeInteger(1064), makeInteger(1092), makeInteger(1096), makeInteger(1098), makeInteger(1102), cons(makeInteger(1146), TWO_INTEGER), makeInteger(1150), cons(makeInteger(1251), TWO_INTEGER), makeInteger(1471), makeInteger(1475), makeInteger(1485) })), list(new SubLObject[]{ cons(ZERO_INTEGER, ONE_INTEGER), cons(TWO_INTEGER, THREE_INTEGER), cons(ELEVEN_INTEGER, FOUR_INTEGER), cons(THIRTEEN_INTEGER, EIGHT_INTEGER), cons(makeInteger(27), NINE_INTEGER), cons(makeInteger(57), TEN_INTEGER), cons(makeInteger(59), ELEVEN_INTEGER), cons(makeInteger(64), TWELVE_INTEGER), cons(makeInteger(250), THIRTEEN_INTEGER), cons(makeInteger(361), FOURTEEN_INTEGER), cons(makeInteger(365), NINETEEN_INTEGER), cons(makeInteger(374), makeInteger(21)), cons(makeInteger(378), makeInteger(22)), cons(makeInteger(429), makeInteger(24)), cons(makeInteger(436), makeInteger(25)), cons(makeInteger(442), makeInteger(26)), cons(makeInteger(473), makeInteger(27)), cons(makeInteger(510), makeInteger(28)), cons(makeInteger(538), makeInteger(30)), cons(makeInteger(555), makeInteger(31)), cons(makeInteger(614), makeInteger(32)), cons(makeInteger(623), makeInteger(34)), cons(makeInteger(643), makeInteger(35)), cons(makeInteger(1041), makeInteger(36)), cons(makeInteger(1062), makeInteger(37)), cons(makeInteger(1064), makeInteger(38)), cons(makeInteger(1092), makeInteger(39)), cons(makeInteger(1096), makeInteger(40)), cons(makeInteger(1098), makeInteger(41)), cons(makeInteger(1102), makeInteger(42)), cons(makeInteger(1146), makeInteger(44)), cons(makeInteger(1150), makeInteger(45)), cons(makeInteger(1251), makeInteger(47)), cons(makeInteger(1471), makeInteger(48)), cons(makeInteger(1475), makeInteger(49)), cons(makeInteger(1485), makeInteger(50)) })));

    static private final SubLString $str_alt136$ID__A_should_have_been_deleted_bu = makeString("ID ~A should have been deleted but was renumbered to ~A.");

    static private final SubLSymbol $sym137$PRIME_NUMBER_ = makeSymbol("PRIME-NUMBER?");

    static private final SubLList $list_alt138 = list(new SubLObject[]{ list(list(makeString("foo")), NIL), list(list(MINUS_ONE_INTEGER), NIL), list(list(ZERO_INTEGER), NIL), list(list(ONE_INTEGER), NIL), list(list(TWO_INTEGER), T), list(list(THREE_INTEGER), T), list(list(FOUR_INTEGER), NIL), list(list(makeInteger(4001)), T), list(list(makeInteger(4003)), T), list(list(makeInteger(4007)), T), list(list(makeInteger(4013)), T), list(list(makeInteger(4019)), T), list(list(makeInteger(4021)), T), list(list(makeInteger(4027)), T), list(list(makeInteger(4049)), T), list(list(makeInteger(4051)), T), list(list(makeInteger(4057)), T), list(list(makeInteger(4073)), T), list(list(makeInteger(4079)), T), list(list(makeInteger(4091)), T), list(list(makeInteger(4093)), T), list(list(makeInteger(4099)), T), list(list(makeInteger(4111)), T), list(list(makeInteger(4127)), T), list(list(makeInteger(4129)), T), list(list(makeInteger(4133)), T), list(list(makeInteger(4139)), T), list(list(makeInteger(4153)), T), list(list(makeInteger(4157)), T), list(list(makeInteger(4159)), T), list(list(makeInteger(4177)), T), list(list(makeInteger(4201)), T), list(list(makeInteger(4211)), T), list(list(makeInteger(4217)), T), list(list(makeInteger(4219)), T), list(list(makeInteger(4229)), T), list(list(makeInteger(4231)), T), list(list(makeInteger(4241)), T), list(list(makeInteger(5861)), T), list(list(makeInteger(5867)), T), list(list(makeInteger(5869)), T), list(list(makeInteger(5879)), T), list(list(makeInteger(5881)), T) });

    static private final SubLList $list_alt140 = list(list(list(makeInteger(175)), FIVE_INTEGER));

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt143 = list(list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), TWO_INTEGER), list(list(list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER)), makeDouble(2.5)), list(list(list(CHAR_a, CHAR_b, CHAR_c), makeSymbol("CHAR-CODE")), CHAR_b));

    static private final SubLList $list_alt145 = list(list(list(list(TEN_INTEGER, ELEVEN_INTEGER, THIRTEEN_INTEGER)), list(ONE_INTEGER, TWO_INTEGER)), list(list(list(TEN_INTEGER, ELEVEN_INTEGER)), list(ONE_INTEGER)), list(list(list(TEN_INTEGER)), NIL), list(list(list(TEN_INTEGER, EIGHT_INTEGER, ELEVEN_INTEGER)), list(makeInteger(-2), THREE_INTEGER)), list(list(list(TEN_INTEGER, EIGHT_INTEGER), ELEVEN_INTEGER), list(makeInteger(-2), THREE_INTEGER)));

    private static final SubLSymbol LCM_GCD_TEST_CASE = makeSymbol("LCM-GCD-TEST-CASE");

    static private final SubLList $list_alt148 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LCM-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GCD-TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LCM_GCD_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LCM-GCD-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LCM_GCD_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LCM-GCD-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt163$number_utilities = makeString("number-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol LCM_TEST = makeSymbol("LCM-TEST");

    private static final SubLSymbol GCD_TEST = makeSymbol("GCD-TEST");

    private static final SubLSymbol EXTENDED_NUMBERS_TEST_CASE = makeSymbol("EXTENDED-NUMBERS-TEST-CASE");

    static private final SubLList $list_alt168 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POTENTIALLY-INFINITE-NUMBER-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POTENTIALLY-UNDEFINED-NUMBER-TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EXTENDED_NUMBERS_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EXTENDED-NUMBERS-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EXTENDED_NUMBERS_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EXTENDED-NUMBERS-TEST-CASE-INSTANCE");

    private static final SubLSymbol POTENTIALLY_INFINITE_NUMBER_TEST = makeSymbol("POTENTIALLY-INFINITE-NUMBER-TEST");

    private static final SubLSymbol POTENTIALLY_UNDEFINED_NUMBER_TEST = makeSymbol("POTENTIALLY-UNDEFINED-NUMBER-TEST");
}

