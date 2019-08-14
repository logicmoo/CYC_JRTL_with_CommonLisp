/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SIMPLE-LRU-CACHE-STRATEGY
 * source file: /cyc/top/cycl/simple-lru-cache-strategy.lisp
 * created:     2019/07/03 17:37:15
 */
public final class simple_lru_cache_strategy extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final class $simple_lru_cache_strategy_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$capacity;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$index;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$payload;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$head;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$tail;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$freelist_head;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$metrics;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$capacity = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$index = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$payload = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$head = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$tail = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$freelist_head = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.this.$metrics = value;
        }

        public SubLObject $capacity = Lisp.NIL;

        public SubLObject $index = Lisp.NIL;

        public SubLObject $payload = Lisp.NIL;

        public SubLObject $head = Lisp.NIL;

        public SubLObject $tail = Lisp.NIL;

        public SubLObject $freelist_head = Lisp.NIL;

        public SubLObject $metrics = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.class, SIMPLE_LRU_CACHE_STRATEGY, SIMPLE_LRU_CACHE_STRATEGY_P, $list_alt2, $list_alt3, new String[]{ "$capacity", "$index", "$payload", "$head", "$tail", "$freelist_head", "$metrics" }, $list_alt4, $list_alt5, PRINT_SIMPLE_LRU_CACHE_STRATEGY);
    }

    public static final SubLFile me = new simple_lru_cache_strategy();

 public static final String myName = "com.cyc.cycjava.cycl.simple_lru_cache_strategy";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_simple_lru_cache_strategy$ = makeSymbol("*DTP-SIMPLE-LRU-CACHE-STRATEGY*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SIMPLE_LRU_CACHE_STRATEGY = makeSymbol("SIMPLE-LRU-CACHE-STRATEGY");

    private static final SubLSymbol SIMPLE_LRU_CACHE_STRATEGY_P = makeSymbol("SIMPLE-LRU-CACHE-STRATEGY-P");

    static private final SubLList $list2 = list(makeSymbol("CAPACITY"), makeSymbol("INDEX"), makeSymbol("PAYLOAD"), makeSymbol("HEAD"), makeSymbol("TAIL"), makeSymbol("FREELIST-HEAD"), makeSymbol("METRICS"));

    static private final SubLList $list3 = list(makeKeyword("CAPACITY"), makeKeyword("INDEX"), makeKeyword("PAYLOAD"), $HEAD, $TAIL, makeKeyword("FREELIST-HEAD"), makeKeyword("METRICS"));

    static private final SubLList $list4 = list(makeSymbol("SLRU-CACHESTRAT-CAPACITY"), makeSymbol("SLRU-CACHESTRAT-INDEX"), makeSymbol("SLRU-CACHESTRAT-PAYLOAD"), makeSymbol("SLRU-CACHESTRAT-HEAD"), makeSymbol("SLRU-CACHESTRAT-TAIL"), makeSymbol("SLRU-CACHESTRAT-FREELIST-HEAD"), makeSymbol("SLRU-CACHESTRAT-METRICS"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-SLRU-CACHESTRAT-CAPACITY"), makeSymbol("_CSETF-SLRU-CACHESTRAT-INDEX"), makeSymbol("_CSETF-SLRU-CACHESTRAT-PAYLOAD"), makeSymbol("_CSETF-SLRU-CACHESTRAT-HEAD"), makeSymbol("_CSETF-SLRU-CACHESTRAT-TAIL"), makeSymbol("_CSETF-SLRU-CACHESTRAT-FREELIST-HEAD"), makeSymbol("_CSETF-SLRU-CACHESTRAT-METRICS"));

    private static final SubLSymbol PRINT_SIMPLE_LRU_CACHE_STRATEGY = makeSymbol("PRINT-SIMPLE-LRU-CACHE-STRATEGY");

    private static final SubLSymbol SIMPLE_LRU_CACHE_STRATEGY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SIMPLE-LRU-CACHE-STRATEGY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SIMPLE-LRU-CACHE-STRATEGY-P"));

    private static final SubLSymbol SLRU_CACHESTRAT_CAPACITY = makeSymbol("SLRU-CACHESTRAT-CAPACITY");

    private static final SubLSymbol _CSETF_SLRU_CACHESTRAT_CAPACITY = makeSymbol("_CSETF-SLRU-CACHESTRAT-CAPACITY");

    private static final SubLSymbol SLRU_CACHESTRAT_INDEX = makeSymbol("SLRU-CACHESTRAT-INDEX");

    private static final SubLSymbol _CSETF_SLRU_CACHESTRAT_INDEX = makeSymbol("_CSETF-SLRU-CACHESTRAT-INDEX");

    private static final SubLSymbol SLRU_CACHESTRAT_PAYLOAD = makeSymbol("SLRU-CACHESTRAT-PAYLOAD");

    private static final SubLSymbol _CSETF_SLRU_CACHESTRAT_PAYLOAD = makeSymbol("_CSETF-SLRU-CACHESTRAT-PAYLOAD");

    private static final SubLSymbol SLRU_CACHESTRAT_HEAD = makeSymbol("SLRU-CACHESTRAT-HEAD");

    private static final SubLSymbol _CSETF_SLRU_CACHESTRAT_HEAD = makeSymbol("_CSETF-SLRU-CACHESTRAT-HEAD");

    private static final SubLSymbol SLRU_CACHESTRAT_TAIL = makeSymbol("SLRU-CACHESTRAT-TAIL");

    private static final SubLSymbol _CSETF_SLRU_CACHESTRAT_TAIL = makeSymbol("_CSETF-SLRU-CACHESTRAT-TAIL");

    private static final SubLSymbol SLRU_CACHESTRAT_FREELIST_HEAD = makeSymbol("SLRU-CACHESTRAT-FREELIST-HEAD");

    private static final SubLSymbol _CSETF_SLRU_CACHESTRAT_FREELIST_HEAD = makeSymbol("_CSETF-SLRU-CACHESTRAT-FREELIST-HEAD");

    private static final SubLSymbol SLRU_CACHESTRAT_METRICS = makeSymbol("SLRU-CACHESTRAT-METRICS");

    private static final SubLSymbol _CSETF_SLRU_CACHESTRAT_METRICS = makeSymbol("_CSETF-SLRU-CACHESTRAT-METRICS");

    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SIMPLE_LRU_CACHE_STRATEGY = makeSymbol("MAKE-SIMPLE-LRU-CACHE-STRATEGY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str37$_ = makeString("/");

    private static final SubLString $$$Invalid_state_transition_in_TRACK = makeString("Invalid state transition in TRACK");

    private static final SubLString $str39$There_is_a_situation_where_RECYCL = makeString("There is a situation where RECYCLE introduces a new spot--investigate!");

    private static final SubLString $str44$Wow__MOD_is_broken_____ = makeString("Wow, MOD is broken ...!");

    private static final SubLString $str46$Head__ = makeString("Head: ");

    private static final SubLString $str47$__ = makeString(" [");

    private static final SubLString $str48$___ = makeString("| #");

    private static final SubLString $str49$__v_ = makeString(": v=");

    private static final SubLString $str50$___M_ = makeString(" <-M ");

    private static final SubLString $str51$_L___ = makeString(" L-> ");

    private static final SubLString $str52$___Tail__ = makeString("|] Tail: ");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_P_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_RESET_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym55$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_SIMPLE_LRU_CACHE_STRATEGY_ME = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_CACHE_SIZE_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-SIZE-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_TRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACK-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym58$CACHE_STRATEGY_OBJECT_TRACKED__SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACKED?-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_UNTRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym60$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_SIMPLE_LRU_CACHE_STRAT = makeSymbol("CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym61$CACHE_STRATEGY_OBJECT_GET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET = makeSymbol("CACHE-STRATEGY-OBJECT-GET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym62$CACHE_STRATEGY_OBJECT_SET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET = makeSymbol("CACHE-STRATEGY-OBJECT-SET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym63$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_SIMPLE_LRU_CACHE_STRATEGY_ME = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym64$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_SIMPLE_LRU_CACHE_S = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym65$CACHE_STRATEGY_OBJECT_GET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-GET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym66$CACHE_STRATEGY_OBJECT_RESET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_MET = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym67$CACHE_STRATEGY_OBJECT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATEGY_ME = makeSymbol("CACHE-STRATEGY-OBJECT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym68$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATE = makeSymbol("CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym69$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_SIMPLE_LRU_CACHE_STRATEGY_M = makeSymbol("CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym70$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_SIMPLE_LRU_CAC = makeSymbol("NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym71$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_SIMPLE_LRU_CACHE_STRATE = makeSymbol("MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol $sym72$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_SIMPLE_LRU_CACHE_STRATEGY_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-ALL-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    private static final SubLSymbol TEST_BASIC_SLRU_CACHE_STRATEGY = makeSymbol("TEST-BASIC-SLRU-CACHE-STRATEGY");

    private static final SubLList $list80 = list(list(list(TEN_INTEGER), makeKeyword("SUCCESS")), list(list(TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(50)), makeKeyword("SUCCESS")));

    private static final SubLString $str81$The_freshly_allocated_cache_strat = makeString("The freshly allocated cache strategy is not empty.");

    private static final SubLString $str82$There_are_not__A__but__A_items_in = makeString("There are not ~A, but ~A items in the cache.");

    private static final SubLString $str83$The_item__A_is_being_tracked_befo = makeString("The item ~A is being tracked before we added it.");

    private static final SubLString $str84$The_addition_of_the_item__A_to_th = makeString("The addition of the item ~A to the cache did not result in that item being returned.");

    private static final SubLString $str85$The_newly_added_item__A_is_not_th = makeString("The newly added item ~A is not the most recent item ~A.");

    private static final SubLString $str86$The_item__A_is_not_tracked_despit = makeString("The item ~A is not tracked despite the fact that we just added it.");

    private static final SubLString $str87$The_just_touched_item__A_is_not_t = makeString("The just-touched item ~A is not the most recent item ~A.");

    private static final SubLString $str88$The_most_recent_nth__A_is_not_eve = makeString("The most-recent nth ~A is not even but ~A.");

    private static final SubLString $str89$The_least_recent_nth__A_is_not_od = makeString("The least-recent nth ~A is not odd but ~A.");

    private static final SubLString $str90$At__A__the_previous_most_recent__ = makeString("At ~A, the previous most-recent ~A is not larger than the current ~A.");

    private static final SubLString $str91$At__A__the_previous_least_recent_ = makeString("At ~A, the previous least-recent ~A is not smaller than the current ~A.");

    private static final SubLSymbol COMPARE_SLRU_CACHE_STRATEGY_WITH_CACHE = makeSymbol("COMPARE-SLRU-CACHE-STRATEGY-WITH-CACHE");

    private static final SubLList $list94 = list(list(list(TEN_INTEGER, TWO_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(100), TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(1000), makeInteger(50)), makeKeyword("SUCCESS")));

    private static final SubLString $str95$The_CACHE_P_and_the_SLRU_CACHE_ar = makeString("The CACHE-P and the SLRU-CACHE are out of sync. ~%Upon adding item ~A, CACHE-P returned ~A and SLRU-CACHE ~A~%Prior State: ~A~%");

    private static final SubLSymbol COMPARE_SLRU_CACHE_STRATEGY_SPEED_WITH_CACHE = makeSymbol("COMPARE-SLRU-CACHE-STRATEGY-SPEED-WITH-CACHE");

    private static final SubLList $list97 = list(list(list(makeInteger(1000), makeInteger(50)), makeKeyword("SUCCESS")), list(list(makeInteger(2000), makeInteger(80)), makeKeyword("SUCCESS")));

    private static final SubLString $str98$Sorry__but_on_run___A_CACHE_P_too = makeString("Sorry, but on run #~A CACHE-P took ~As and SLRU took ~As");

    private static final SubLString $str99$The_most_recent_item_list_is__A__ = makeString("The most recent item list is ~A, but the least recent item list is ~A.");

    private static final SubLString $str100$At__A__the_most_recent_value_shou = makeString("At ~A, the most recent value should have been a NON-NEGATIVE-INTEGER-P but is ~A instead.");

    private static final SubLString $str101$At__A__the_least_recent_value_sho = makeString("At ~A, the least recent value should have been a NON-NEGATIVE-INTEGER-P but is ~A instead.");

    private static final SubLString $str102$The_most_recent_nth_of__A_was_sup = makeString("The most-recent nth of ~A was supposed to be ~A but was ~A instead.");

    private static final SubLString $str103$The_least_recent_nth_of__A_was_su = makeString("The least-recent nth of ~A was supposed to be ~A but was ~A instead.");

    public static final SubLObject simple_lru_cache_strategy_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_simple_lru_cache_strategy(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject simple_lru_cache_strategy_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_simple_lru_cache_strategy(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject simple_lru_cache_strategy_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject simple_lru_cache_strategy_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native.class ? T : NIL;
    }

    public static final SubLObject slru_cachestrat_capacity_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.getField2();
    }

    public static SubLObject slru_cachestrat_capacity(final SubLObject v_object) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject slru_cachestrat_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.getField3();
    }

    public static SubLObject slru_cachestrat_index(final SubLObject v_object) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject slru_cachestrat_payload_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.getField4();
    }

    public static SubLObject slru_cachestrat_payload(final SubLObject v_object) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject slru_cachestrat_head_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.getField5();
    }

    public static SubLObject slru_cachestrat_head(final SubLObject v_object) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject slru_cachestrat_tail_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.getField6();
    }

    public static SubLObject slru_cachestrat_tail(final SubLObject v_object) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject slru_cachestrat_freelist_head_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.getField7();
    }

    public static SubLObject slru_cachestrat_freelist_head(final SubLObject v_object) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject slru_cachestrat_metrics_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.getField8();
    }

    public static SubLObject slru_cachestrat_metrics(final SubLObject v_object) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_slru_cachestrat_capacity_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_slru_cachestrat_capacity(final SubLObject v_object, final SubLObject value) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_slru_cachestrat_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_slru_cachestrat_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_slru_cachestrat_payload_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_slru_cachestrat_payload(final SubLObject v_object, final SubLObject value) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_slru_cachestrat_head_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_slru_cachestrat_head(final SubLObject v_object, final SubLObject value) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_slru_cachestrat_tail_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_slru_cachestrat_tail(final SubLObject v_object, final SubLObject value) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_slru_cachestrat_freelist_head_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_slru_cachestrat_freelist_head(final SubLObject v_object, final SubLObject value) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_slru_cachestrat_metrics_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SIMPLE_LRU_CACHE_STRATEGY_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_slru_cachestrat_metrics(final SubLObject v_object, final SubLObject value) {
        assert NIL != simple_lru_cache_strategy_p(v_object) : "! simple_lru_cache_strategy.simple_lru_cache_strategy_p(v_object) " + "simple_lru_cache_strategy.simple_lru_cache_strategy_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_simple_lru_cache_strategy_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CAPACITY)) {
                        _csetf_slru_cachestrat_capacity(v_new, current_value);
                    } else {
                        if (pcase_var.eql($INDEX)) {
                            _csetf_slru_cachestrat_index(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PAYLOAD)) {
                                _csetf_slru_cachestrat_payload(v_new, current_value);
                            } else {
                                if (pcase_var.eql($HEAD)) {
                                    _csetf_slru_cachestrat_head(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($TAIL)) {
                                        _csetf_slru_cachestrat_tail(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($FREELIST_HEAD)) {
                                            _csetf_slru_cachestrat_freelist_head(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($METRICS)) {
                                                _csetf_slru_cachestrat_metrics(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_simple_lru_cache_strategy(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.simple_lru_cache_strategy.$simple_lru_cache_strategy_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CAPACITY)) {
                _csetf_slru_cachestrat_capacity(v_new, current_value);
            } else
                if (pcase_var.eql($INDEX)) {
                    _csetf_slru_cachestrat_index(v_new, current_value);
                } else
                    if (pcase_var.eql($PAYLOAD)) {
                        _csetf_slru_cachestrat_payload(v_new, current_value);
                    } else
                        if (pcase_var.eql($HEAD)) {
                            _csetf_slru_cachestrat_head(v_new, current_value);
                        } else
                            if (pcase_var.eql($TAIL)) {
                                _csetf_slru_cachestrat_tail(v_new, current_value);
                            } else
                                if (pcase_var.eql($FREELIST_HEAD)) {
                                    _csetf_slru_cachestrat_freelist_head(v_new, current_value);
                                } else
                                    if (pcase_var.eql($METRICS)) {
                                        _csetf_slru_cachestrat_metrics(v_new, current_value);
                                    } else {
                                        Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_simple_lru_cache_strategy(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SIMPLE_LRU_CACHE_STRATEGY, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CAPACITY, slru_cachestrat_capacity(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, slru_cachestrat_index(obj));
        funcall(visitor_fn, obj, $SLOT, $PAYLOAD, slru_cachestrat_payload(obj));
        funcall(visitor_fn, obj, $SLOT, $HEAD, slru_cachestrat_head(obj));
        funcall(visitor_fn, obj, $SLOT, $TAIL, slru_cachestrat_tail(obj));
        funcall(visitor_fn, obj, $SLOT, $FREELIST_HEAD, slru_cachestrat_freelist_head(obj));
        funcall(visitor_fn, obj, $SLOT, $METRICS, slru_cachestrat_metrics(obj));
        funcall(visitor_fn, obj, $END, MAKE_SIMPLE_LRU_CACHE_STRATEGY, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_simple_lru_cache_strategy_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_simple_lru_cache_strategy(obj, visitor_fn);
    }

    public static final SubLObject print_simple_lru_cache_strategy_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt30$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    write_string($str_alt32$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(simple_lru_cache_strategy_size(v_object), stream);
                    write_string($str_alt33$_, stream, UNPROVIDED, UNPROVIDED);
                    princ(simple_lru_cache_strategy_capacity(v_object), stream);
                    if (NIL != cache_utilities.cache_metrics_p(slru_cachestrat_metrics(v_object))) {
                        write_string($str_alt32$_, stream, UNPROVIDED, UNPROVIDED);
                        princ(slru_cachestrat_metrics(v_object), stream);
                        write_string($str_alt32$_, stream, UNPROVIDED, UNPROVIDED);
                    }
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_simple_lru_cache_strategy(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            princ(simple_lru_cache_strategy_size(v_object), stream);
            write_string($str37$_, stream, UNPROVIDED, UNPROVIDED);
            princ(simple_lru_cache_strategy_capacity(v_object), stream);
            if (NIL != cache_utilities.cache_metrics_p(slru_cachestrat_metrics(v_object))) {
                write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                princ(slru_cachestrat_metrics(v_object), stream);
                write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            }
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    /**
     * Allocate a new implementation of the CACHE-STRATEGY-P of CAPACITY
     * size and return it to the caller.
     */
    @LispMethod(comment = "Allocate a new implementation of the CACHE-STRATEGY-P of CAPACITY\r\nsize and return it to the caller.\nAllocate a new implementation of the CACHE-STRATEGY-P of CAPACITY\nsize and return it to the caller.")
    public static final SubLObject new_simple_lru_cache_strategy_alt(SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        {
            SubLObject slru_cache = make_simple_lru_cache_strategy(UNPROVIDED);
            _csetf_slru_cachestrat_capacity(slru_cache, capacity);
            _csetf_slru_cachestrat_index(slru_cache, make_hash_table(capacity, test, UNPROVIDED));
            _csetf_slru_cachestrat_payload(slru_cache, make_vector(multiply(THREE_INTEGER, capacity), UNPROVIDED));
            slru_cache_reset_linked_list(slru_cache);
            slru_cache_reset_freelist(slru_cache);
            _csetf_slru_cachestrat_metrics(slru_cache, NIL);
            return slru_cache;
        }
    }

    /**
     * Allocate a new implementation of the CACHE-STRATEGY-P of CAPACITY
     * size and return it to the caller.
     */
    @LispMethod(comment = "Allocate a new implementation of the CACHE-STRATEGY-P of CAPACITY\r\nsize and return it to the caller.\nAllocate a new implementation of the CACHE-STRATEGY-P of CAPACITY\nsize and return it to the caller.")
    public static SubLObject new_simple_lru_cache_strategy(final SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQL;
        }
        final SubLObject slru_cache = make_simple_lru_cache_strategy(UNPROVIDED);
        _csetf_slru_cachestrat_capacity(slru_cache, capacity);
        _csetf_slru_cachestrat_index(slru_cache, make_hash_table(capacity, test, UNPROVIDED));
        _csetf_slru_cachestrat_payload(slru_cache, make_vector(multiply(THREE_INTEGER, capacity), UNPROVIDED));
        slru_cache_reset_linked_list(slru_cache);
        slru_cache_reset_freelist(slru_cache);
        _csetf_slru_cachestrat_metrics(slru_cache, NIL);
        return slru_cache;
    }

    /**
     * Reset the simple LRU cache strategy.
     *
     * @return SLRU-CACHE
     */
    @LispMethod(comment = "Reset the simple LRU cache strategy.\r\n\r\n@return SLRU-CACHE")
    public static final SubLObject clear_simple_lru_cache_strategy_alt(SubLObject slru_cache) {
        slru_cache_reset_linked_list(slru_cache);
        slru_cache_reset_freelist(slru_cache);
        clrhash(slru_cachestrat_index(slru_cache));
        return slru_cache;
    }

    /**
     * Reset the simple LRU cache strategy.
     *
     * @return SLRU-CACHE
     */
    @LispMethod(comment = "Reset the simple LRU cache strategy.\r\n\r\n@return SLRU-CACHE")
    public static SubLObject clear_simple_lru_cache_strategy(final SubLObject slru_cache) {
        slru_cache_reset_linked_list(slru_cache);
        slru_cache_reset_freelist(slru_cache);
        clrhash(slru_cachestrat_index(slru_cache));
        return slru_cache;
    }

    /**
     * Determine the current size of the simple LRU cache strategy.
     *
     * @return NON-NEGATIVE-INTEGER-P
     */
    @LispMethod(comment = "Determine the current size of the simple LRU cache strategy.\r\n\r\n@return NON-NEGATIVE-INTEGER-P")
    public static final SubLObject simple_lru_cache_strategy_size_alt(SubLObject slru_cache) {
        return hash_table_count(slru_cachestrat_index(slru_cache));
    }

    /**
     * Determine the current size of the simple LRU cache strategy.
     *
     * @return NON-NEGATIVE-INTEGER-P
     */
    @LispMethod(comment = "Determine the current size of the simple LRU cache strategy.\r\n\r\n@return NON-NEGATIVE-INTEGER-P")
    public static SubLObject simple_lru_cache_strategy_size(final SubLObject slru_cache) {
        return hash_table_count(slru_cachestrat_index(slru_cache));
    }

    /**
     * Determine the capacity of the simple LRU cache strategy.
     *
     * @return PLUSP
     */
    @LispMethod(comment = "Determine the capacity of the simple LRU cache strategy.\r\n\r\n@return PLUSP")
    public static final SubLObject simple_lru_cache_strategy_capacity_alt(SubLObject slru_cache) {
        return slru_cachestrat_capacity(slru_cache);
    }

    /**
     * Determine the capacity of the simple LRU cache strategy.
     *
     * @return PLUSP
     */
    @LispMethod(comment = "Determine the capacity of the simple LRU cache strategy.\r\n\r\n@return PLUSP")
    public static SubLObject simple_lru_cache_strategy_capacity(final SubLObject slru_cache) {
        return slru_cachestrat_capacity(slru_cache);
    }

    /**
     * Determine if the item is being tracked by the current system.
     *
     * @return BOOLEANP
     */
    @LispMethod(comment = "Determine if the item is being tracked by the current system.\r\n\r\n@return BOOLEANP")
    public static final SubLObject simple_lru_cache_strategy_trackedP_alt(SubLObject slru_cache, SubLObject item) {
        return list_utilities.sublisp_boolean(gethash_without_values(item, slru_cachestrat_index(slru_cache), NIL));
    }

    /**
     * Determine if the item is being tracked by the current system.
     *
     * @return BOOLEANP
     */
    @LispMethod(comment = "Determine if the item is being tracked by the current system.\r\n\r\n@return BOOLEANP")
    public static SubLObject simple_lru_cache_strategy_trackedP(final SubLObject slru_cache, final SubLObject item) {
        return list_utilities.sublisp_boolean(gethash_without_values(item, slru_cachestrat_index(slru_cache), NIL));
    }

    /**
     * Track this item. Potentially eliminate the least recently used and return
     * that oldest item, otherwise return the new item.
     *
     * @return ITEM if the cache has room or the item was already present,
    OLDEST-ITEM otherwise.
     */
    @LispMethod(comment = "Track this item. Potentially eliminate the least recently used and return\r\nthat oldest item, otherwise return the new item.\r\n\r\n@return ITEM if the cache has room or the item was already present,\r\nOLDEST-ITEM otherwise.\nTrack this item. Potentially eliminate the least recently used and return\nthat oldest item, otherwise return the new item.")
    public static final SubLObject simple_lru_cache_strategy_track_alt(SubLObject slru_cache, SubLObject item) {
        if (NIL != simple_lru_cache_strategy_trackedP(slru_cache, item)) {
            simple_lru_cache_strategy_note_reference(slru_cache, item);
            return item;
        }
        if (NIL != slru_cache_freelist_empty_p(slru_cache)) {
            {
                SubLObject old_item = slru_cache_linked_list_insert_recycling_at_head(slru_cache, item);
                SubLObject index = slru_cachestrat_index(slru_cache);
                SubLObject head = slru_cachestrat_head(slru_cache);
                remhash(old_item, index);
                sethash(item, index, head);
                return old_item;
            }
        } else {
            {
                SubLObject index = slru_cache_linked_list_insert_new_at_head(slru_cache, item);
                sethash(item, slru_cachestrat_index(slru_cache), index);
            }
            return item;
        }
    }

    /**
     * Track this item. Potentially eliminate the least recently used and return
     * that oldest item, otherwise return the new item.
     *
     * @return ITEM if the cache has room or the item was already present,
    OLDEST-ITEM otherwise.
     */
    @LispMethod(comment = "Track this item. Potentially eliminate the least recently used and return\r\nthat oldest item, otherwise return the new item.\r\n\r\n@return ITEM if the cache has room or the item was already present,\r\nOLDEST-ITEM otherwise.\nTrack this item. Potentially eliminate the least recently used and return\nthat oldest item, otherwise return the new item.")
    public static SubLObject simple_lru_cache_strategy_track(final SubLObject slru_cache, final SubLObject item) {
        if (NIL != simple_lru_cache_strategy_trackedP(slru_cache, item)) {
            simple_lru_cache_strategy_note_reference(slru_cache, item);
            return item;
        }
        if (NIL != slru_cache_freelist_empty_p(slru_cache)) {
            final SubLObject old_item = slru_cache_linked_list_insert_recycling_at_head(slru_cache, item);
            final SubLObject index = slru_cachestrat_index(slru_cache);
            final SubLObject head = slru_cachestrat_head(slru_cache);
            remhash(old_item, index);
            sethash(item, index, head);
            return old_item;
        }
        final SubLObject index2 = slru_cache_linked_list_insert_new_at_head(slru_cache, item);
        sethash(item, slru_cachestrat_index(slru_cache), index2);
        return item;
    }

    /**
     * Shuffle this item from which-ever position it is at to the front.
     *
     * @return slru-cache
     */
    @LispMethod(comment = "Shuffle this item from which-ever position it is at to the front.\r\n\r\n@return slru-cache")
    public static final SubLObject simple_lru_cache_strategy_note_reference_alt(SubLObject slru_cache, SubLObject item) {
        {
            SubLObject curr_spot = gethash_without_values(item, slru_cachestrat_index(slru_cache), UNPROVIDED);
            if (NIL != curr_spot) {
                if (curr_spot.numE(slru_cachestrat_head(slru_cache))) {
                } else {
                    if (curr_spot.numE(slru_cachestrat_tail(slru_cache))) {
                        slru_cache_linked_list_recycle_tail_as_head(slru_cache);
                        if (!curr_spot.numE(slru_cachestrat_head(slru_cache))) {
                            Errors.warn($str_alt36$There_is_a_situation_where_RECYCL);
                            {
                                SubLObject index = slru_cachestrat_index(slru_cache);
                                SubLObject head = slru_cachestrat_head(slru_cache);
                                sethash(item, index, head);
                            }
                        }
                    } else {
                        {
                            SubLObject old_item = slru_cache_linked_list_dequeue(slru_cache, curr_spot);
                            slru_cache_linked_list_insert_known_at_head(slru_cache, curr_spot, old_item);
                        }
                    }
                }
            }
        }
        return slru_cache;
    }

    /**
     * Shuffle this item from which-ever position it is at to the front.
     *
     * @return slru-cache
     */
    @LispMethod(comment = "Shuffle this item from which-ever position it is at to the front.\r\n\r\n@return slru-cache")
    public static SubLObject simple_lru_cache_strategy_note_reference(final SubLObject slru_cache, final SubLObject item) {
        final SubLObject curr_spot = gethash_without_values(item, slru_cachestrat_index(slru_cache), UNPROVIDED);
        if (NIL != curr_spot) {
            if (!curr_spot.numE(slru_cachestrat_head(slru_cache))) {
                if (curr_spot.numE(slru_cachestrat_tail(slru_cache))) {
                    slru_cache_linked_list_recycle_tail_as_head(slru_cache);
                    if (!curr_spot.numE(slru_cachestrat_head(slru_cache))) {
                        Errors.warn($str39$There_is_a_situation_where_RECYCL);
                        final SubLObject index = slru_cachestrat_index(slru_cache);
                        final SubLObject head = slru_cachestrat_head(slru_cache);
                        sethash(item, index, head);
                    }
                } else {
                    final SubLObject old_item = slru_cache_linked_list_dequeue(slru_cache, curr_spot);
                    slru_cache_linked_list_insert_known_at_head(slru_cache, curr_spot, old_item);
                }
            }
        }
        return slru_cache;
    }

    /**
     * Dequeue the index for the item from the linked list, put the index
     * onto the free list, and return the object to the caller.
     *
     * @return ITEM
     */
    @LispMethod(comment = "Dequeue the index for the item from the linked list, put the index\r\nonto the free list, and return the object to the caller.\r\n\r\n@return ITEM\nDequeue the index for the item from the linked list, put the index\nonto the free list, and return the object to the caller.")
    public static final SubLObject simple_lru_cache_strategy_untrack_alt(SubLObject slru_cache, SubLObject item) {
        {
            SubLObject index = slru_cachestrat_index(slru_cache);
            SubLObject curr_spot = gethash_without_values(item, index, UNPROVIDED);
            if (NIL != curr_spot) {
                remhash(item, index);
                slru_cache_linked_list_dequeue_and_resource(slru_cache, curr_spot);
            }
        }
        return item;
    }

    /**
     * Dequeue the index for the item from the linked list, put the index
     * onto the free list, and return the object to the caller.
     *
     * @return ITEM
     */
    @LispMethod(comment = "Dequeue the index for the item from the linked list, put the index\r\nonto the free list, and return the object to the caller.\r\n\r\n@return ITEM\nDequeue the index for the item from the linked list, put the index\nonto the free list, and return the object to the caller.")
    public static SubLObject simple_lru_cache_strategy_untrack(final SubLObject slru_cache, final SubLObject item) {
        final SubLObject index = slru_cachestrat_index(slru_cache);
        final SubLObject curr_spot = gethash_without_values(item, index, UNPROVIDED);
        if (NIL != curr_spot) {
            remhash(item, index);
            slru_cache_linked_list_dequeue_and_resource(slru_cache, curr_spot);
        }
        return item;
    }

    /**
     * Return the nth most recent cache entry without updating the LRU ordering.
     *
     * @param the
     * 		0-based index into the cache, with SIZE-1 as the last position.
     * @return the VALUE at that position, or NIL if the cache is empty or N > size
     */
    @LispMethod(comment = "Return the nth most recent cache entry without updating the LRU ordering.\r\n\r\n@param the\r\n\t\t0-based index into the cache, with SIZE-1 as the last position.\r\n@return the VALUE at that position, or NIL if the cache is empty or N > size")
    public static final SubLObject simple_lru_cache_strategy_peek_most_recent_nth_alt(SubLObject slru_cache, SubLObject n) {
        {
            SubLObject size = simple_lru_cache_strategy_size(slru_cache);
            if (size.isZero()) {
                return NIL;
            }
            if (!n.numL(size)) {
                return NIL;
            }
        }
        {
            SubLObject current = slru_cachestrat_head(slru_cache);
            SubLObject counter = ZERO_INTEGER;
            while (counter.numL(n)) {
                current = get_slru_cache_index_fwdref(slru_cache, current);
                counter = add(counter, ONE_INTEGER);
            } 
            return get_slru_cache_index_datum(slru_cache, current);
        }
    }

    /**
     * Return the nth most recent cache entry without updating the LRU ordering.
     *
     * @param the
     * 		0-based index into the cache, with SIZE-1 as the last position.
     * @return the VALUE at that position, or NIL if the cache is empty or N > size
     */
    @LispMethod(comment = "Return the nth most recent cache entry without updating the LRU ordering.\r\n\r\n@param the\r\n\t\t0-based index into the cache, with SIZE-1 as the last position.\r\n@return the VALUE at that position, or NIL if the cache is empty or N > size")
    public static SubLObject simple_lru_cache_strategy_peek_most_recent_nth(final SubLObject slru_cache, final SubLObject n) {
        final SubLObject size = simple_lru_cache_strategy_size(slru_cache);
        if (size.isZero()) {
            return NIL;
        }
        if (!n.numL(size)) {
            return NIL;
        }
        SubLObject current = slru_cachestrat_head(slru_cache);
        for (SubLObject counter = ZERO_INTEGER; counter.numL(n); counter = add(counter, ONE_INTEGER)) {
            current = get_slru_cache_index_fwdref(slru_cache, current);
        }
        return get_slru_cache_index_datum(slru_cache, current);
    }

    /**
     *
     *
     * @return the most recently referenced or inserted value.
     */
    @LispMethod(comment = "@return the most recently referenced or inserted value.")
    public static final SubLObject simple_lru_cache_strategy_peek_most_recent_alt(SubLObject slru_cache) {
        return simple_lru_cache_strategy_peek_most_recent_nth(slru_cache, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return the most recently referenced or inserted value.
     */
    @LispMethod(comment = "@return the most recently referenced or inserted value.")
    public static SubLObject simple_lru_cache_strategy_peek_most_recent(final SubLObject slru_cache) {
        return simple_lru_cache_strategy_peek_most_recent_nth(slru_cache, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return the least recently referenced or inserted value.
     */
    @LispMethod(comment = "@return the least recently referenced or inserted value.")
    public static final SubLObject simple_lru_cache_strategy_peek_least_recent_alt(SubLObject slru_cache) {
        return simple_lru_cache_strategy_peek_least_recent_nth(slru_cache, ZERO_INTEGER);
    }

    /**
     *
     *
     * @return the least recently referenced or inserted value.
     */
    @LispMethod(comment = "@return the least recently referenced or inserted value.")
    public static SubLObject simple_lru_cache_strategy_peek_least_recent(final SubLObject slru_cache) {
        return simple_lru_cache_strategy_peek_least_recent_nth(slru_cache, ZERO_INTEGER);
    }

    /**
     * Return the nth least recent cache entry without updating the LRU ordering.
     *
     * @param the
     * 		0-based index into the cache, with SIZE-1 as the last position.
     * @return the VALUE at that position, or NIL if the cache is empty or N > size
     */
    @LispMethod(comment = "Return the nth least recent cache entry without updating the LRU ordering.\r\n\r\n@param the\r\n\t\t0-based index into the cache, with SIZE-1 as the last position.\r\n@return the VALUE at that position, or NIL if the cache is empty or N > size")
    public static final SubLObject simple_lru_cache_strategy_peek_least_recent_nth_alt(SubLObject slru_cache, SubLObject n) {
        {
            SubLObject size = simple_lru_cache_strategy_size(slru_cache);
            if (size.isZero()) {
                return NIL;
            }
            if (!n.numL(size)) {
                return NIL;
            }
        }
        {
            SubLObject current = slru_cachestrat_tail(slru_cache);
            SubLObject counter = ZERO_INTEGER;
            while (counter.numL(n)) {
                current = get_slru_cache_index_backref(slru_cache, current);
                counter = add(counter, ONE_INTEGER);
            } 
            return get_slru_cache_index_datum(slru_cache, current);
        }
    }

    /**
     * Return the nth least recent cache entry without updating the LRU ordering.
     *
     * @param the
     * 		0-based index into the cache, with SIZE-1 as the last position.
     * @return the VALUE at that position, or NIL if the cache is empty or N > size
     */
    @LispMethod(comment = "Return the nth least recent cache entry without updating the LRU ordering.\r\n\r\n@param the\r\n\t\t0-based index into the cache, with SIZE-1 as the last position.\r\n@return the VALUE at that position, or NIL if the cache is empty or N > size")
    public static SubLObject simple_lru_cache_strategy_peek_least_recent_nth(final SubLObject slru_cache, final SubLObject n) {
        final SubLObject size = simple_lru_cache_strategy_size(slru_cache);
        if (size.isZero()) {
            return NIL;
        }
        if (!n.numL(size)) {
            return NIL;
        }
        SubLObject current = slru_cachestrat_tail(slru_cache);
        for (SubLObject counter = ZERO_INTEGER; counter.numL(n); counter = add(counter, ONE_INTEGER)) {
            current = get_slru_cache_index_backref(slru_cache, current);
        }
        return get_slru_cache_index_datum(slru_cache, current);
    }

    /**
     * Gather up the most recent items and put them into a LIST and
     * return that to the caller.
     *
     * @return LISTP
     */
    @LispMethod(comment = "Gather up the most recent items and put them into a LIST and\r\nreturn that to the caller.\r\n\r\n@return LISTP\nGather up the most recent items and put them into a LIST and\nreturn that to the caller.")
    public static final SubLObject simple_lru_cache_strategy_most_recent_items_alt(SubLObject slru_cache) {
        {
            SubLObject size = simple_lru_cache_strategy_size(slru_cache);
            SubLObject items = make_list(size, UNPROVIDED);
            SubLObject curr_item = items;
            SubLObject current = slru_cachestrat_head(slru_cache);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                rplaca(curr_item, get_slru_cache_index_datum(slru_cache, current));
                current = get_slru_cache_index_fwdref(slru_cache, current);
                curr_item = curr_item.rest();
            }
            return items;
        }
    }

    /**
     * Gather up the most recent items and put them into a LIST and
     * return that to the caller.
     *
     * @return LISTP
     */
    @LispMethod(comment = "Gather up the most recent items and put them into a LIST and\r\nreturn that to the caller.\r\n\r\n@return LISTP\nGather up the most recent items and put them into a LIST and\nreturn that to the caller.")
    public static SubLObject simple_lru_cache_strategy_most_recent_items(final SubLObject slru_cache) {
        final SubLObject size = simple_lru_cache_strategy_size(slru_cache);
        SubLObject curr_item;
        final SubLObject items = curr_item = make_list(size, UNPROVIDED);
        SubLObject current = slru_cachestrat_head(slru_cache);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            rplaca(curr_item, get_slru_cache_index_datum(slru_cache, current));
            current = get_slru_cache_index_fwdref(slru_cache, current);
            curr_item = curr_item.rest();
        }
        return items;
    }

    /**
     * Gather up the least recent items and put them into a LIST and
     * return that to the caller.
     *
     * @return LISTP
     */
    @LispMethod(comment = "Gather up the least recent items and put them into a LIST and\r\nreturn that to the caller.\r\n\r\n@return LISTP\nGather up the least recent items and put them into a LIST and\nreturn that to the caller.")
    public static final SubLObject simple_lru_cache_strategy_least_recent_items_alt(SubLObject slru_cache) {
        {
            SubLObject size = simple_lru_cache_strategy_size(slru_cache);
            SubLObject items = make_list(size, UNPROVIDED);
            SubLObject curr_item = items;
            SubLObject current = slru_cachestrat_tail(slru_cache);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                rplaca(curr_item, get_slru_cache_index_datum(slru_cache, current));
                current = get_slru_cache_index_backref(slru_cache, current);
                curr_item = curr_item.rest();
            }
            return items;
        }
    }

    /**
     * Gather up the least recent items and put them into a LIST and
     * return that to the caller.
     *
     * @return LISTP
     */
    @LispMethod(comment = "Gather up the least recent items and put them into a LIST and\r\nreturn that to the caller.\r\n\r\n@return LISTP\nGather up the least recent items and put them into a LIST and\nreturn that to the caller.")
    public static SubLObject simple_lru_cache_strategy_least_recent_items(final SubLObject slru_cache) {
        final SubLObject size = simple_lru_cache_strategy_size(slru_cache);
        SubLObject curr_item;
        final SubLObject items = curr_item = make_list(size, UNPROVIDED);
        SubLObject current = slru_cachestrat_tail(slru_cache);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            rplaca(curr_item, get_slru_cache_index_datum(slru_cache, current));
            current = get_slru_cache_index_backref(slru_cache, current);
            curr_item = curr_item.rest();
        }
        return items;
    }

    /**
     * Return an iterator that iterates over the content as of the time of the invocation.
     * The implementations snap-shots the most/least recent items, depending on the value of
     * the DIRECTION variable, and then moves through them. No attempt is made to accomodate
     * items added or removed since the creation of the iterator.
     *
     * @return ITERATOR-P
     */
    @LispMethod(comment = "Return an iterator that iterates over the content as of the time of the invocation.\r\nThe implementations snap-shots the most/least recent items, depending on the value of\r\nthe DIRECTION variable, and then moves through them. No attempt is made to accomodate\r\nitems added or removed since the creation of the iterator.\r\n\r\n@return ITERATOR-P\nReturn an iterator that iterates over the content as of the time of the invocation.\nThe implementations snap-shots the most/least recent items, depending on the value of\nthe DIRECTION variable, and then moves through them. No attempt is made to accomodate\nitems added or removed since the creation of the iterator.")
    public static final SubLObject new_simple_lru_cache_current_content_iterator_alt(SubLObject slru_cache, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        {
            SubLObject items = ($FORWARD == direction) ? ((SubLObject) (simple_lru_cache_strategy_most_recent_items(slru_cache))) : simple_lru_cache_strategy_least_recent_items(slru_cache);
            return iteration.new_list_iterator(items);
        }
    }

    /**
     * Return an iterator that iterates over the content as of the time of the invocation.
     * The implementations snap-shots the most/least recent items, depending on the value of
     * the DIRECTION variable, and then moves through them. No attempt is made to accomodate
     * items added or removed since the creation of the iterator.
     *
     * @return ITERATOR-P
     */
    @LispMethod(comment = "Return an iterator that iterates over the content as of the time of the invocation.\r\nThe implementations snap-shots the most/least recent items, depending on the value of\r\nthe DIRECTION variable, and then moves through them. No attempt is made to accomodate\r\nitems added or removed since the creation of the iterator.\r\n\r\n@return ITERATOR-P\nReturn an iterator that iterates over the content as of the time of the invocation.\nThe implementations snap-shots the most/least recent items, depending on the value of\nthe DIRECTION variable, and then moves through them. No attempt is made to accomodate\nitems added or removed since the creation of the iterator.")
    public static SubLObject new_simple_lru_cache_current_content_iterator(final SubLObject slru_cache, SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = $FORWARD;
        }
        final SubLObject items = ($FORWARD == direction) ? simple_lru_cache_strategy_most_recent_items(slru_cache) : simple_lru_cache_strategy_least_recent_items(slru_cache);
        return iteration.new_list_iterator(items);
    }

    public static final SubLObject slru_cache_index_datum_alt(SubLObject index) {
        return multiply(index, THREE_INTEGER);
    }

    public static SubLObject slru_cache_index_datum(final SubLObject index) {
        return multiply(index, THREE_INTEGER);
    }

    public static final SubLObject slru_cache_index_backref_alt(SubLObject index) {
        return add(ONE_INTEGER, multiply(index, THREE_INTEGER));
    }

    public static SubLObject slru_cache_index_backref(final SubLObject index) {
        return add(ONE_INTEGER, multiply(index, THREE_INTEGER));
    }

    public static final SubLObject slru_cache_index_fwdref_alt(SubLObject index) {
        return add(TWO_INTEGER, multiply(index, THREE_INTEGER));
    }

    public static SubLObject slru_cache_index_fwdref(final SubLObject index) {
        return add(TWO_INTEGER, multiply(index, THREE_INTEGER));
    }

    public static final SubLObject slru_cache_payload_size_alt(SubLObject slru_cache) {
        return length(slru_cachestrat_payload(slru_cache));
    }

    public static SubLObject slru_cache_payload_size(final SubLObject slru_cache) {
        return length(slru_cachestrat_payload(slru_cache));
    }

    public static final SubLObject get_slru_cache_index_datum_alt(SubLObject slru_cache, SubLObject index) {
        {
            SubLObject payload = slru_cachestrat_payload(slru_cache);
            return aref(payload, slru_cache_index_datum(index));
        }
    }

    public static SubLObject get_slru_cache_index_datum(final SubLObject slru_cache, final SubLObject index) {
        final SubLObject payload = slru_cachestrat_payload(slru_cache);
        return aref(payload, slru_cache_index_datum(index));
    }

    public static final SubLObject get_slru_cache_index_backref_alt(SubLObject slru_cache, SubLObject index) {
        {
            SubLObject payload = slru_cachestrat_payload(slru_cache);
            return aref(payload, slru_cache_index_backref(index));
        }
    }

    public static SubLObject get_slru_cache_index_backref(final SubLObject slru_cache, final SubLObject index) {
        final SubLObject payload = slru_cachestrat_payload(slru_cache);
        return aref(payload, slru_cache_index_backref(index));
    }

    public static final SubLObject get_slru_cache_index_fwdref_alt(SubLObject slru_cache, SubLObject index) {
        {
            SubLObject payload = slru_cachestrat_payload(slru_cache);
            return aref(payload, slru_cache_index_fwdref(index));
        }
    }

    public static SubLObject get_slru_cache_index_fwdref(final SubLObject slru_cache, final SubLObject index) {
        final SubLObject payload = slru_cachestrat_payload(slru_cache);
        return aref(payload, slru_cache_index_fwdref(index));
    }

    public static final SubLObject get_slru_cache_index_type_alt(SubLObject index) {
        {
            SubLObject sub_index = mod(index, THREE_INTEGER);
            SubLObject pcase_var = sub_index;
            if (pcase_var.eql(ZERO_INTEGER)) {
                return $DATUM;
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    return $BACKREF;
                } else {
                    if (pcase_var.eql(TWO_INTEGER)) {
                        return $FWDREF;
                    } else {
                        Errors.error($str_alt41$Wow__MOD_is_broken_____);
                    }
                }
            }
        }
        return $ERROR;
    }

    public static SubLObject get_slru_cache_index_type(final SubLObject index) {
        final SubLObject pcase_var;
        final SubLObject sub_index = pcase_var = mod(index, THREE_INTEGER);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return $DATUM;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return $BACKREF;
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return $FWDREF;
        }
        Errors.error($str44$Wow__MOD_is_broken_____);
        return $ERROR;
    }

    public static final SubLObject set_slru_cache_payload_index_datum_alt(SubLObject payload, SubLObject index, SubLObject value) {
        return set_aref(payload, slru_cache_index_datum(index), value);
    }

    public static SubLObject set_slru_cache_payload_index_datum(final SubLObject payload, final SubLObject index, final SubLObject value) {
        return set_aref(payload, slru_cache_index_datum(index), value);
    }

    public static final SubLObject set_slru_cache_payload_index_backref_alt(SubLObject payload, SubLObject index, SubLObject value) {
        return set_aref(payload, slru_cache_index_backref(index), value);
    }

    public static SubLObject set_slru_cache_payload_index_backref(final SubLObject payload, final SubLObject index, final SubLObject value) {
        return set_aref(payload, slru_cache_index_backref(index), value);
    }

    public static final SubLObject set_slru_cache_payload_index_fwdref_alt(SubLObject payload, SubLObject index, SubLObject value) {
        return set_aref(payload, slru_cache_index_fwdref(index), value);
    }

    public static SubLObject set_slru_cache_payload_index_fwdref(final SubLObject payload, final SubLObject index, final SubLObject value) {
        return set_aref(payload, slru_cache_index_fwdref(index), value);
    }

    public static final SubLObject set_slru_cache_index_datum_alt(SubLObject slru_cache, SubLObject index, SubLObject value) {
        {
            SubLObject payload = slru_cachestrat_payload(slru_cache);
            return set_slru_cache_payload_index_datum(payload, index, value);
        }
    }

    public static SubLObject set_slru_cache_index_datum(final SubLObject slru_cache, final SubLObject index, final SubLObject value) {
        final SubLObject payload = slru_cachestrat_payload(slru_cache);
        return set_slru_cache_payload_index_datum(payload, index, value);
    }

    public static final SubLObject set_slru_cache_index_backref_alt(SubLObject slru_cache, SubLObject index, SubLObject value) {
        {
            SubLObject payload = slru_cachestrat_payload(slru_cache);
            return set_slru_cache_payload_index_backref(payload, index, value);
        }
    }

    public static SubLObject set_slru_cache_index_backref(final SubLObject slru_cache, final SubLObject index, final SubLObject value) {
        final SubLObject payload = slru_cachestrat_payload(slru_cache);
        return set_slru_cache_payload_index_backref(payload, index, value);
    }

    public static final SubLObject set_slru_cache_index_fwdref_alt(SubLObject slru_cache, SubLObject index, SubLObject value) {
        {
            SubLObject payload = slru_cachestrat_payload(slru_cache);
            return set_slru_cache_payload_index_fwdref(payload, index, value);
        }
    }

    public static SubLObject set_slru_cache_index_fwdref(final SubLObject slru_cache, final SubLObject index, final SubLObject value) {
        final SubLObject payload = slru_cachestrat_payload(slru_cache);
        return set_slru_cache_payload_index_fwdref(payload, index, value);
    }

    /**
     * Reset just where the head and the tail point.
     */
    @LispMethod(comment = "Reset just where the head and the tail point.")
    public static final SubLObject slru_cache_reset_linked_list_alt(SubLObject slru_cache) {
        _csetf_slru_cachestrat_head(slru_cache, NIL);
        _csetf_slru_cachestrat_tail(slru_cache, NIL);
        return slru_cache;
    }

    @LispMethod(comment = "Reset just where the head and the tail point.")
    public static SubLObject slru_cache_reset_linked_list(final SubLObject slru_cache) {
        _csetf_slru_cachestrat_head(slru_cache, NIL);
        _csetf_slru_cachestrat_tail(slru_cache, NIL);
        return slru_cache;
    }

    /**
     * Dequeue the index from the list, potentially updating head or
     * tail and return the value that was stored there.
     * This is the generic remove operation, not optimized for the
     * case of cache overflow, where the tail gets recycled to become
     * the new head
     *
     * @return the VALUE stored at INDEX
     */
    @LispMethod(comment = "Dequeue the index from the list, potentially updating head or\r\ntail and return the value that was stored there.\r\nThis is the generic remove operation, not optimized for the\r\ncase of cache overflow, where the tail gets recycled to become\r\nthe new head\r\n\r\n@return the VALUE stored at INDEX\nDequeue the index from the list, potentially updating head or\ntail and return the value that was stored there.\nThis is the generic remove operation, not optimized for the\ncase of cache overflow, where the tail gets recycled to become\nthe new head")
    public static final SubLObject slru_cache_linked_list_dequeue_alt(SubLObject slru_cache, SubLObject index) {
        {
            SubLObject value = get_slru_cache_index_datum(slru_cache, index);
            SubLObject fwd_index = get_slru_cache_index_fwdref(slru_cache, index);
            SubLObject back_index = get_slru_cache_index_backref(slru_cache, index);
            if (NIL == fwd_index) {
                _csetf_slru_cachestrat_tail(slru_cache, back_index);
            } else {
                set_slru_cache_index_backref(slru_cache, fwd_index, back_index);
            }
            if (NIL == back_index) {
                _csetf_slru_cachestrat_head(slru_cache, fwd_index);
            } else {
                set_slru_cache_index_fwdref(slru_cache, back_index, fwd_index);
            }
            return value;
        }
    }

    @LispMethod(comment = "Dequeue the index from the list, potentially updating head or\r\ntail and return the value that was stored there.\r\nThis is the generic remove operation, not optimized for the\r\ncase of cache overflow, where the tail gets recycled to become\r\nthe new head\r\n\r\n@return the VALUE stored at INDEX\nDequeue the index from the list, potentially updating head or\ntail and return the value that was stored there.\nThis is the generic remove operation, not optimized for the\ncase of cache overflow, where the tail gets recycled to become\nthe new head")
    public static SubLObject slru_cache_linked_list_dequeue(final SubLObject slru_cache, final SubLObject index) {
        final SubLObject value = get_slru_cache_index_datum(slru_cache, index);
        final SubLObject fwd_index = get_slru_cache_index_fwdref(slru_cache, index);
        final SubLObject back_index = get_slru_cache_index_backref(slru_cache, index);
        if (NIL == fwd_index) {
            _csetf_slru_cachestrat_tail(slru_cache, back_index);
        } else {
            set_slru_cache_index_backref(slru_cache, fwd_index, back_index);
        }
        if (NIL == back_index) {
            _csetf_slru_cachestrat_head(slru_cache, fwd_index);
        } else {
            set_slru_cache_index_fwdref(slru_cache, back_index, fwd_index);
        }
        return value;
    }

    /**
     * Dequeue an index from the middle and put it onto the free list; this
     * effectively implements REMOVE
     *
     * @return the VALUE stored at INDEX
     */
    @LispMethod(comment = "Dequeue an index from the middle and put it onto the free list; this\r\neffectively implements REMOVE\r\n\r\n@return the VALUE stored at INDEX\nDequeue an index from the middle and put it onto the free list; this\neffectively implements REMOVE")
    public static final SubLObject slru_cache_linked_list_dequeue_and_resource_alt(SubLObject slru_cache, SubLObject index) {
        {
            SubLObject value = NIL;
            value = slru_cache_linked_list_dequeue(slru_cache, index);
            slru_cache_freelist_enqueue(slru_cache, index);
            return value;
        }
    }

    @LispMethod(comment = "Dequeue an index from the middle and put it onto the free list; this\r\neffectively implements REMOVE\r\n\r\n@return the VALUE stored at INDEX\nDequeue an index from the middle and put it onto the free list; this\neffectively implements REMOVE")
    public static SubLObject slru_cache_linked_list_dequeue_and_resource(final SubLObject slru_cache, final SubLObject index) {
        SubLObject value = NIL;
        value = slru_cache_linked_list_dequeue(slru_cache, index);
        slru_cache_freelist_enqueue(slru_cache, index);
        return value;
    }

    /**
     * This is for the case of a new entry being to the front in the case
     * of a non-empty cache. For the PUT case when the list is full, see
     *
     * @see SLRU-CACHE-RECYCLE-TAIL-AS-HEAD
     * @return the new INDEX
     */
    @LispMethod(comment = "This is for the case of a new entry being to the front in the case\r\nof a non-empty cache. For the PUT case when the list is full, see\r\n\r\n@see SLRU-CACHE-RECYCLE-TAIL-AS-HEAD\r\n@return the new INDEX\nThis is for the case of a new entry being to the front in the case\nof a non-empty cache. For the PUT case when the list is full, see")
    public static final SubLObject slru_cache_linked_list_insert_new_at_head_alt(SubLObject slru_cache, SubLObject value) {
        {
            SubLObject new_index = slru_cache_freelist_dequeue(slru_cache);
            return slru_cache_linked_list_insert_known_at_head(slru_cache, new_index, value);
        }
    }

    @LispMethod(comment = "This is for the case of a new entry being to the front in the case\r\nof a non-empty cache. For the PUT case when the list is full, see\r\n\r\n@see SLRU-CACHE-RECYCLE-TAIL-AS-HEAD\r\n@return the new INDEX\nThis is for the case of a new entry being to the front in the case\nof a non-empty cache. For the PUT case when the list is full, see")
    public static SubLObject slru_cache_linked_list_insert_new_at_head(final SubLObject slru_cache, final SubLObject value) {
        final SubLObject new_index = slru_cache_freelist_dequeue(slru_cache);
        return slru_cache_linked_list_insert_known_at_head(slru_cache, new_index, value);
    }

    /**
     * This is the case of a index slot being moved to the front of the linked list.
     * The slot can either be taken from the free list or is indicated by dequeue
     *
     * @return the INDEX
     */
    @LispMethod(comment = "This is the case of a index slot being moved to the front of the linked list.\r\nThe slot can either be taken from the free list or is indicated by dequeue\r\n\r\n@return the INDEX\nThis is the case of a index slot being moved to the front of the linked list.\nThe slot can either be taken from the free list or is indicated by dequeue")
    public static final SubLObject slru_cache_linked_list_insert_known_at_head_alt(SubLObject slru_cache, SubLObject index, SubLObject value) {
        slru_cache_linked_list_insert_index_at_front(slru_cache, index);
        set_slru_cache_index_datum(slru_cache, index, value);
        return index;
    }

    @LispMethod(comment = "This is the case of a index slot being moved to the front of the linked list.\r\nThe slot can either be taken from the free list or is indicated by dequeue\r\n\r\n@return the INDEX\nThis is the case of a index slot being moved to the front of the linked list.\nThe slot can either be taken from the free list or is indicated by dequeue")
    public static SubLObject slru_cache_linked_list_insert_known_at_head(final SubLObject slru_cache, final SubLObject index, final SubLObject value) {
        slru_cache_linked_list_insert_index_at_front(slru_cache, index);
        set_slru_cache_index_datum(slru_cache, index, value);
        return index;
    }

    /**
     * Insert a new value that replaces the current tail. The tail is made into the
     * head. Upon return, HEAD will point to VALUE and the deleted OLD-VALUE will be
     * returned
     */
    @LispMethod(comment = "Insert a new value that replaces the current tail. The tail is made into the\r\nhead. Upon return, HEAD will point to VALUE and the deleted OLD-VALUE will be\r\nreturned\nInsert a new value that replaces the current tail. The tail is made into the\nhead. Upon return, HEAD will point to VALUE and the deleted OLD-VALUE will be\nreturned")
    public static final SubLObject slru_cache_linked_list_insert_recycling_at_head_alt(SubLObject slru_cache, SubLObject value) {
        {
            SubLObject old_value = slru_cache_linked_list_recycle_tail_as_head(slru_cache);
            SubLObject head_index = slru_cachestrat_head(slru_cache);
            set_slru_cache_index_datum(slru_cache, head_index, value);
            return old_value;
        }
    }

    @LispMethod(comment = "Insert a new value that replaces the current tail. The tail is made into the\r\nhead. Upon return, HEAD will point to VALUE and the deleted OLD-VALUE will be\r\nreturned\nInsert a new value that replaces the current tail. The tail is made into the\nhead. Upon return, HEAD will point to VALUE and the deleted OLD-VALUE will be\nreturned")
    public static SubLObject slru_cache_linked_list_insert_recycling_at_head(final SubLObject slru_cache, final SubLObject value) {
        final SubLObject old_value = slru_cache_linked_list_recycle_tail_as_head(slru_cache);
        final SubLObject head_index = slru_cachestrat_head(slru_cache);
        set_slru_cache_index_datum(slru_cache, head_index, value);
        return old_value;
    }

    /**
     * Intended for the case of PUT when the list is full, this operation
     * bends the pointers so that the current tail becomes the new head
     * of the linked list. Notice that this bypasses the free list.
     * Upon return, HEAD will point to the new entry.
     *
     * @return the old VALUE being removed
     */
    @LispMethod(comment = "Intended for the case of PUT when the list is full, this operation\r\nbends the pointers so that the current tail becomes the new head\r\nof the linked list. Notice that this bypasses the free list.\r\nUpon return, HEAD will point to the new entry.\r\n\r\n@return the old VALUE being removed\nIntended for the case of PUT when the list is full, this operation\nbends the pointers so that the current tail becomes the new head\nof the linked list. Notice that this bypasses the free list.\nUpon return, HEAD will point to the new entry.")
    public static final SubLObject slru_cache_linked_list_recycle_tail_as_head_alt(SubLObject slru_cache) {
        {
            SubLObject tail_index = slru_cachestrat_tail(slru_cache);
            SubLObject tail_back_index = get_slru_cache_index_backref(slru_cache, tail_index);
            SubLObject value = get_slru_cache_index_datum(slru_cache, tail_index);
            set_slru_cache_index_backref(slru_cache, tail_index, NIL);
            set_slru_cache_index_fwdref(slru_cache, tail_back_index, NIL);
            _csetf_slru_cachestrat_tail(slru_cache, tail_back_index);
            slru_cache_linked_list_insert_index_at_front(slru_cache, tail_index);
            return value;
        }
    }

    @LispMethod(comment = "Intended for the case of PUT when the list is full, this operation\r\nbends the pointers so that the current tail becomes the new head\r\nof the linked list. Notice that this bypasses the free list.\r\nUpon return, HEAD will point to the new entry.\r\n\r\n@return the old VALUE being removed\nIntended for the case of PUT when the list is full, this operation\nbends the pointers so that the current tail becomes the new head\nof the linked list. Notice that this bypasses the free list.\nUpon return, HEAD will point to the new entry.")
    public static SubLObject slru_cache_linked_list_recycle_tail_as_head(final SubLObject slru_cache) {
        final SubLObject tail_index = slru_cachestrat_tail(slru_cache);
        final SubLObject tail_back_index = get_slru_cache_index_backref(slru_cache, tail_index);
        final SubLObject value = get_slru_cache_index_datum(slru_cache, tail_index);
        set_slru_cache_index_backref(slru_cache, tail_index, NIL);
        set_slru_cache_index_fwdref(slru_cache, tail_back_index, NIL);
        _csetf_slru_cachestrat_tail(slru_cache, tail_back_index);
        slru_cache_linked_list_insert_index_at_front(slru_cache, tail_index);
        return value;
    }

    /**
     * Inserts an empty index at the front of the queue.
     */
    @LispMethod(comment = "Inserts an empty index at the front of the queue.")
    public static final SubLObject slru_cache_linked_list_insert_index_at_front_alt(SubLObject slru_cache, SubLObject new_index) {
        {
            SubLObject head_index = slru_cachestrat_head(slru_cache);
            set_slru_cache_index_backref(slru_cache, new_index, NIL);
            set_slru_cache_index_fwdref(slru_cache, new_index, head_index);
            if (NIL == head_index) {
                _csetf_slru_cachestrat_tail(slru_cache, new_index);
            } else {
                set_slru_cache_index_backref(slru_cache, head_index, new_index);
            }
            _csetf_slru_cachestrat_head(slru_cache, new_index);
        }
        return slru_cache;
    }

    @LispMethod(comment = "Inserts an empty index at the front of the queue.")
    public static SubLObject slru_cache_linked_list_insert_index_at_front(final SubLObject slru_cache, final SubLObject new_index) {
        final SubLObject head_index = slru_cachestrat_head(slru_cache);
        set_slru_cache_index_backref(slru_cache, new_index, NIL);
        set_slru_cache_index_fwdref(slru_cache, new_index, head_index);
        if (NIL == head_index) {
            _csetf_slru_cachestrat_tail(slru_cache, new_index);
        } else {
            set_slru_cache_index_backref(slru_cache, head_index, new_index);
        }
        _csetf_slru_cachestrat_head(slru_cache, new_index);
        return slru_cache;
    }

    public static final SubLObject print_slru_cache_linked_list_status_alt(SubLObject slru_cache) {
        write_string($str_alt43$Head__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        princ(slru_cachestrat_head(slru_cache), UNPROVIDED);
        write_string($str_alt44$__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        {
            SubLObject payload = slru_cachestrat_payload(slru_cache);
            SubLObject cdotimes_end_var = length(payload);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject type = get_slru_cache_index_type(i);
                    SubLObject pcase_var = type;
                    if (pcase_var.eql($DATUM)) {
                        write_string($str_alt45$___, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        princ(integerDivide(i, THREE_INTEGER), UNPROVIDED);
                        write_string($str_alt46$__v_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        if (pcase_var.eql($BACKREF)) {
                            write_string($str_alt47$___M_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($FWDREF)) {
                                write_string($str_alt48$_L___, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                    princ(aref(payload, i), UNPROVIDED);
                }
                write_string($str_alt32$_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        write_string($str_alt49$___Tail__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        princ(slru_cachestrat_tail(slru_cache), UNPROVIDED);
        terpri(UNPROVIDED);
        return slru_cache;
    }

    public static SubLObject print_slru_cache_linked_list_status(final SubLObject slru_cache) {
        write_string($str46$Head__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        princ(slru_cachestrat_head(slru_cache), UNPROVIDED);
        write_string($str47$__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject payload = slru_cachestrat_payload(slru_cache);
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject pcase_var;
        SubLObject type;
        for (cdotimes_end_var = length(payload), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            type = pcase_var = get_slru_cache_index_type(i);
            if (pcase_var.eql($DATUM)) {
                write_string($str48$___, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                princ(integerDivide(i, THREE_INTEGER), UNPROVIDED);
                write_string($str49$__v_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($BACKREF)) {
                    write_string($str50$___M_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($FWDREF)) {
                        write_string($str51$_L___, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }


            princ(aref(payload, i), UNPROVIDED);
            write_string($$$_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        write_string($str52$___Tail__, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        princ(slru_cachestrat_tail(slru_cache), UNPROVIDED);
        terpri(UNPROVIDED);
        return slru_cache;
    }

    /**
     * A fast test for a full cache is the empty free list test.
     */
    @LispMethod(comment = "A fast test for a full cache is the empty free list test.")
    public static final SubLObject slru_cache_freelist_empty_p_alt(SubLObject slru_cache) {
        return sublisp_null(slru_cachestrat_freelist_head(slru_cache));
    }

    @LispMethod(comment = "A fast test for a full cache is the empty free list test.")
    public static SubLObject slru_cache_freelist_empty_p(final SubLObject slru_cache) {
        return sublisp_null(slru_cachestrat_freelist_head(slru_cache));
    }

    /**
     * Redo the linked list to ensure that there is no loitering and that
     * the entries are optimally adjacent.
     */
    @LispMethod(comment = "Redo the linked list to ensure that there is no loitering and that\r\nthe entries are optimally adjacent.\nRedo the linked list to ensure that there is no loitering and that\nthe entries are optimally adjacent.")
    public static final SubLObject slru_cache_reset_freelist_alt(SubLObject slru_cache) {
        _csetf_slru_cachestrat_freelist_head(slru_cache, ZERO_INTEGER);
        {
            SubLObject cdotimes_end_var = slru_cachestrat_capacity(slru_cache);
            SubLObject index = NIL;
            for (index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                set_slru_cache_index_backref(slru_cache, index, subtract(index, ONE_INTEGER));
                set_slru_cache_index_fwdref(slru_cache, index, add(index, ONE_INTEGER));
                set_slru_cache_index_datum(slru_cache, index, NIL);
            }
        }
        set_slru_cache_index_backref(slru_cache, ZERO_INTEGER, NIL);
        {
            SubLObject final_slot = subtract(slru_cachestrat_capacity(slru_cache), ONE_INTEGER);
            set_slru_cache_index_fwdref(slru_cache, final_slot, NIL);
        }
        return slru_cache;
    }

    @LispMethod(comment = "Redo the linked list to ensure that there is no loitering and that\r\nthe entries are optimally adjacent.\nRedo the linked list to ensure that there is no loitering and that\nthe entries are optimally adjacent.")
    public static SubLObject slru_cache_reset_freelist(final SubLObject slru_cache) {
        _csetf_slru_cachestrat_freelist_head(slru_cache, ZERO_INTEGER);
        SubLObject cdotimes_end_var;
        SubLObject index;
        for (cdotimes_end_var = slru_cachestrat_capacity(slru_cache), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
            set_slru_cache_index_backref(slru_cache, index, subtract(index, ONE_INTEGER));
            set_slru_cache_index_fwdref(slru_cache, index, add(index, ONE_INTEGER));
            set_slru_cache_index_datum(slru_cache, index, NIL);
        }
        set_slru_cache_index_backref(slru_cache, ZERO_INTEGER, NIL);
        final SubLObject final_slot = subtract(slru_cachestrat_capacity(slru_cache), ONE_INTEGER);
        set_slru_cache_index_fwdref(slru_cache, final_slot, NIL);
        return slru_cache;
    }

    public static final SubLObject slru_cache_freelist_dequeue_alt(SubLObject slru_cache) {
        {
            SubLObject next_index = slru_cachestrat_freelist_head(slru_cache);
            if (next_index.isFixnum()) {
                _csetf_slru_cachestrat_freelist_head(slru_cache, get_slru_cache_index_fwdref(slru_cache, next_index));
            }
            return next_index;
        }
    }

    public static SubLObject slru_cache_freelist_dequeue(final SubLObject slru_cache) {
        final SubLObject next_index = slru_cachestrat_freelist_head(slru_cache);
        if (next_index.isFixnum()) {
            _csetf_slru_cachestrat_freelist_head(slru_cache, get_slru_cache_index_fwdref(slru_cache, next_index));
        }
        return next_index;
    }

    public static final SubLObject slru_cache_freelist_enqueue_alt(SubLObject slru_cache, SubLObject index) {
        set_slru_cache_index_datum(slru_cache, index, NIL);
        set_slru_cache_index_backref(slru_cache, index, NIL);
        {
            SubLObject prev_index = slru_cachestrat_freelist_head(slru_cache);
            _csetf_slru_cachestrat_freelist_head(slru_cache, index);
            set_slru_cache_index_fwdref(slru_cache, index, prev_index);
        }
        return slru_cache;
    }

    public static SubLObject slru_cache_freelist_enqueue(final SubLObject slru_cache, final SubLObject index) {
        set_slru_cache_index_datum(slru_cache, index, NIL);
        set_slru_cache_index_backref(slru_cache, index, NIL);
        final SubLObject prev_index = slru_cachestrat_freelist_head(slru_cache);
        _csetf_slru_cachestrat_freelist_head(slru_cache, index);
        set_slru_cache_index_fwdref(slru_cache, index, prev_index);
        return slru_cache;
    }

    public static final SubLObject cache_strategy_object_p_simple_lru_cache_strategy_method_alt(SubLObject strategy) {
        return T;
    }

    public static SubLObject cache_strategy_object_p_simple_lru_cache_strategy_method(final SubLObject strategy) {
        return T;
    }

    public static final SubLObject cache_strategy_object_reset_simple_lru_cache_strategy_method_alt(SubLObject strategy) {
        return cache_strategy_slru_cache_object_reset(strategy);
    }

    public static SubLObject cache_strategy_object_reset_simple_lru_cache_strategy_method(final SubLObject strategy) {
        return cache_strategy_slru_cache_object_reset(strategy);
    }

    public static final SubLObject cache_strategy_object_cache_capacity_simple_lru_cache_strategy_method_alt(SubLObject strategy) {
        return cache_strategy_slru_cache_object_cache_capacity(strategy);
    }

    public static SubLObject cache_strategy_object_cache_capacity_simple_lru_cache_strategy_method(final SubLObject strategy) {
        return cache_strategy_slru_cache_object_cache_capacity(strategy);
    }

    public static final SubLObject cache_strategy_object_cache_size_simple_lru_cache_strategy_method_alt(SubLObject strategy) {
        return cache_strategy_slru_cache_object_cache_size(strategy);
    }

    public static SubLObject cache_strategy_object_cache_size_simple_lru_cache_strategy_method(final SubLObject strategy) {
        return cache_strategy_slru_cache_object_cache_size(strategy);
    }

    public static final SubLObject cache_strategy_object_track_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_slru_cache_object_track(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_track_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_slru_cache_object_track(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_trackedP_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_slru_cache_object_trackedP(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_trackedP_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_slru_cache_object_trackedP(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_untrack_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_slru_cache_object_untrack(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_untrack_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_slru_cache_object_untrack(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_supports_parameter_p_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject parameter) {
        return cache_strategy_slru_cache_object_supports_parameter_p(strategy, parameter);
    }

    public static SubLObject cache_strategy_object_supports_parameter_p_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject parameter) {
        return cache_strategy_slru_cache_object_supports_parameter_p(strategy, parameter);
    }

    public static final SubLObject cache_strategy_object_get_parameter_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        return cache_strategy_slru_cache_object_get_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_get_parameter_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_slru_cache_object_get_parameter(strategy, parameter, v_default);
    }

    public static final SubLObject cache_strategy_object_set_parameter_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        return cache_strategy_slru_cache_object_set_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_set_parameter_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_slru_cache_object_set_parameter(strategy, parameter, v_default);
    }

    public static final SubLObject cache_strategy_object_note_reference_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_slru_cache_object_note_reference(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_note_reference_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_slru_cache_object_note_reference(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_note_references_in_order_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject objects) {
        return cache_strategy_slru_cache_object_note_references_in_order(strategy, objects);
    }

    public static SubLObject cache_strategy_object_note_references_in_order_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject objects) {
        return cache_strategy_slru_cache_object_note_references_in_order(strategy, objects);
    }

    public static final SubLObject cache_strategy_object_get_metrics_simple_lru_cache_strategy_method_alt(SubLObject strategy) {
        return cache_strategy_slru_cache_object_get_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_get_metrics_simple_lru_cache_strategy_method(final SubLObject strategy) {
        return cache_strategy_slru_cache_object_get_metrics(strategy);
    }

    public static final SubLObject cache_strategy_object_reset_metrics_simple_lru_cache_strategy_method_alt(SubLObject strategy) {
        return cache_strategy_slru_cache_object_reset_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_reset_metrics_simple_lru_cache_strategy_method(final SubLObject strategy) {
        return cache_strategy_slru_cache_object_reset_metrics(strategy);
    }

    public static final SubLObject cache_strategy_object_gather_metrics_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject metrics) {
        return cache_strategy_slru_cache_object_gather_metrics(strategy, metrics);
    }

    public static SubLObject cache_strategy_object_gather_metrics_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject metrics) {
        return cache_strategy_slru_cache_object_gather_metrics(strategy, metrics);
    }

    public static final SubLObject cache_strategy_object_dont_gather_metrics_simple_lru_cache_strategy_method_alt(SubLObject strategy) {
        return cache_strategy_slru_cache_object_dont_gather_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_dont_gather_metrics_simple_lru_cache_strategy_method(final SubLObject strategy) {
        return cache_strategy_slru_cache_object_dont_gather_metrics(strategy);
    }

    public static final SubLObject cache_strategy_object_keeps_metrics_p_simple_lru_cache_strategy_method_alt(SubLObject strategy) {
        return cache_strategy_slru_cache_object_keeps_metrics_p(strategy);
    }

    public static SubLObject cache_strategy_object_keeps_metrics_p_simple_lru_cache_strategy_method(final SubLObject strategy) {
        return cache_strategy_slru_cache_object_keeps_metrics_p(strategy);
    }

    public static final SubLObject new_cache_strategy_object_tracked_content_iterator_simple_lru_cache_strategy_method_alt(SubLObject strategy) {
        return new_cache_strategy_slru_cache_object_tracked_content_iterator(strategy);
    }

    public static SubLObject new_cache_strategy_object_tracked_content_iterator_simple_lru_cache_strategy_method(final SubLObject strategy) {
        return new_cache_strategy_slru_cache_object_tracked_content_iterator(strategy);
    }

    public static final SubLObject map_cache_strategy_object_tracked_content_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject functor) {
        return map_cache_strategy_slru_cache_object_tracked_content(strategy, functor);
    }

    public static SubLObject map_cache_strategy_object_tracked_content_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject functor) {
        return map_cache_strategy_slru_cache_object_tracked_content(strategy, functor);
    }

    public static final SubLObject cache_strategy_object_untrack_all_simple_lru_cache_strategy_method_alt(SubLObject strategy, SubLObject functor) {
        return cache_strategy_slru_cache_object_untrack_all(strategy, functor);
    }

    public static SubLObject cache_strategy_object_untrack_all_simple_lru_cache_strategy_method(final SubLObject strategy, final SubLObject functor) {
        return cache_strategy_slru_cache_object_untrack_all(strategy, functor);
    }

    public static final SubLObject cache_strategy_slru_cache_object_cache_capacity_alt(SubLObject strategy) {
        return simple_lru_cache_strategy_capacity(strategy);
    }

    public static SubLObject cache_strategy_slru_cache_object_cache_capacity(final SubLObject strategy) {
        return simple_lru_cache_strategy_capacity(strategy);
    }

    public static final SubLObject cache_strategy_slru_cache_object_cache_size_alt(SubLObject strategy) {
        return simple_lru_cache_strategy_size(strategy);
    }

    public static SubLObject cache_strategy_slru_cache_object_cache_size(final SubLObject strategy) {
        return simple_lru_cache_strategy_size(strategy);
    }

    public static final SubLObject cache_strategy_slru_cache_object_dont_gather_metrics_alt(SubLObject strategy) {
        {
            SubLObject metrics = slru_cachestrat_metrics(strategy);
            _csetf_slru_cachestrat_metrics(strategy, NIL);
            return metrics;
        }
    }

    public static SubLObject cache_strategy_slru_cache_object_dont_gather_metrics(final SubLObject strategy) {
        final SubLObject metrics = slru_cachestrat_metrics(strategy);
        _csetf_slru_cachestrat_metrics(strategy, NIL);
        return metrics;
    }

    public static final SubLObject cache_strategy_slru_cache_object_gather_metrics_alt(SubLObject strategy, SubLObject metrics) {
        _csetf_slru_cachestrat_metrics(strategy, metrics);
        return strategy;
    }

    public static SubLObject cache_strategy_slru_cache_object_gather_metrics(final SubLObject strategy, final SubLObject metrics) {
        _csetf_slru_cachestrat_metrics(strategy, metrics);
        return strategy;
    }

    public static final SubLObject cache_strategy_slru_cache_object_get_metrics_alt(SubLObject strategy) {
        return slru_cachestrat_metrics(strategy);
    }

    public static SubLObject cache_strategy_slru_cache_object_get_metrics(final SubLObject strategy) {
        return slru_cachestrat_metrics(strategy);
    }

    public static final SubLObject cache_strategy_slru_cache_object_get_parameter_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        return v_default;
    }

    public static SubLObject cache_strategy_slru_cache_object_get_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return v_default;
    }

    public static final SubLObject cache_strategy_slru_cache_object_keeps_metrics_p_alt(SubLObject strategy) {
        return cache_utilities.cache_metrics_p(slru_cachestrat_metrics(strategy));
    }

    public static SubLObject cache_strategy_slru_cache_object_keeps_metrics_p(final SubLObject strategy) {
        return cache_utilities.cache_metrics_p(slru_cachestrat_metrics(strategy));
    }

    public static final SubLObject cache_strategy_slru_cache_object_note_reference_alt(SubLObject strategy, SubLObject v_object) {
        return simple_lru_cache_strategy_note_reference(strategy, v_object);
    }

    public static SubLObject cache_strategy_slru_cache_object_note_reference(final SubLObject strategy, final SubLObject v_object) {
        return simple_lru_cache_strategy_note_reference(strategy, v_object);
    }

    public static final SubLObject cache_strategy_slru_cache_object_note_references_in_order_alt(SubLObject strategy, SubLObject objects) {
        return cache_utilities.default_cache_strategy_object_note_references_in_order(strategy, objects);
    }

    public static SubLObject cache_strategy_slru_cache_object_note_references_in_order(final SubLObject strategy, final SubLObject objects) {
        return cache_utilities.default_cache_strategy_object_note_references_in_order(strategy, objects);
    }

    public static final SubLObject cache_strategy_slru_cache_object_reset_alt(SubLObject strategy) {
        return clear_simple_lru_cache_strategy(strategy);
    }

    public static SubLObject cache_strategy_slru_cache_object_reset(final SubLObject strategy) {
        return clear_simple_lru_cache_strategy(strategy);
    }

    public static final SubLObject cache_strategy_slru_cache_object_reset_metrics_alt(SubLObject strategy) {
        return cache_utilities.cache_metrics_reset(slru_cachestrat_metrics(strategy));
    }

    public static SubLObject cache_strategy_slru_cache_object_reset_metrics(final SubLObject strategy) {
        return cache_utilities.cache_metrics_reset(slru_cachestrat_metrics(strategy));
    }

    public static final SubLObject cache_strategy_slru_cache_object_set_parameter_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        return v_default;
    }

    public static SubLObject cache_strategy_slru_cache_object_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return v_default;
    }

    public static final SubLObject cache_strategy_slru_cache_object_supports_parameter_p_alt(SubLObject strategy, SubLObject parameter) {
        return NIL;
    }

    public static SubLObject cache_strategy_slru_cache_object_supports_parameter_p(final SubLObject strategy, final SubLObject parameter) {
        return NIL;
    }

    public static final SubLObject cache_strategy_slru_cache_object_track_alt(SubLObject strategy, SubLObject v_object) {
        return simple_lru_cache_strategy_track(strategy, v_object);
    }

    public static SubLObject cache_strategy_slru_cache_object_track(final SubLObject strategy, final SubLObject v_object) {
        return simple_lru_cache_strategy_track(strategy, v_object);
    }

    public static final SubLObject cache_strategy_slru_cache_object_trackedP_alt(SubLObject strategy, SubLObject v_object) {
        return simple_lru_cache_strategy_trackedP(strategy, v_object);
    }

    public static SubLObject cache_strategy_slru_cache_object_trackedP(final SubLObject strategy, final SubLObject v_object) {
        return simple_lru_cache_strategy_trackedP(strategy, v_object);
    }

    public static final SubLObject cache_strategy_slru_cache_object_untrack_alt(SubLObject strategy, SubLObject v_object) {
        return simple_lru_cache_strategy_untrack(strategy, v_object);
    }

    public static SubLObject cache_strategy_slru_cache_object_untrack(final SubLObject strategy, final SubLObject v_object) {
        return simple_lru_cache_strategy_untrack(strategy, v_object);
    }

    public static final SubLObject cache_strategy_slru_cache_object_untrack_all_alt(SubLObject strategy, SubLObject functor) {
        return cache_utilities.default_cache_strategy_object_untrack_all(strategy, functor);
    }

    public static SubLObject cache_strategy_slru_cache_object_untrack_all(final SubLObject strategy, final SubLObject functor) {
        return cache_utilities.default_cache_strategy_object_untrack_all(strategy, functor);
    }

    public static final SubLObject map_cache_strategy_slru_cache_object_tracked_content_alt(SubLObject strategy, SubLObject functor) {
        return cache_utilities.default_map_cache_strategy_object_tracked_content(strategy, functor);
    }

    public static SubLObject map_cache_strategy_slru_cache_object_tracked_content(final SubLObject strategy, final SubLObject functor) {
        return cache_utilities.default_map_cache_strategy_object_tracked_content(strategy, functor);
    }

    public static final SubLObject new_cache_strategy_slru_cache_object_tracked_content_iterator_alt(SubLObject strategy) {
        return new_simple_lru_cache_current_content_iterator(strategy, $FORWARD);
    }

    public static SubLObject new_cache_strategy_slru_cache_object_tracked_content_iterator(final SubLObject strategy) {
        return new_simple_lru_cache_current_content_iterator(strategy, $FORWARD);
    }

    public static final SubLObject test_basic_slru_cache_strategy_alt(SubLObject capacity) {
        if (capacity == UNPROVIDED) {
            capacity = TEN_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject slru_cache = new_simple_lru_cache_strategy(capacity, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!simple_lru_cache_strategy_size(slru_cache).isZero()) {
                        Errors.error($str_alt79$The_freshly_allocated_cache_strat);
                    }
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!i.numE(simple_lru_cache_strategy_size(slru_cache))) {
                                Errors.error($str_alt80$There_are_not__A__but__A_items_in, i, simple_lru_cache_strategy_size(slru_cache));
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL != simple_lru_cache_strategy_trackedP(slru_cache, i)) {
                                Errors.error($str_alt81$The_item__A_is_being_tracked_befo, i);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!i.numE(simple_lru_cache_strategy_track(slru_cache, i))) {
                                Errors.error($str_alt82$The_addition_of_the_item__A_to_th, i);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!i.numE(simple_lru_cache_strategy_peek_most_recent(slru_cache))) {
                                Errors.error($str_alt83$The_newly_added_item__A_is_not_th, i, simple_lru_cache_strategy_peek_most_recent(slru_cache));
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == simple_lru_cache_strategy_trackedP(slru_cache, i)) {
                                Errors.error($str_alt84$The_item__A_is_not_tracked_despit, i);
                            }
                        }
                    }
                }
                test_slru_cache_strategy_compare_directions(slru_cache);
                test_slru_cache_strategy_peek_operators(slru_cache);
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == simple_lru_cache_strategy_trackedP(slru_cache, i)) {
                                Errors.error($str_alt84$The_item__A_is_not_tracked_despit, i);
                            }
                        }
                        simple_lru_cache_strategy_note_reference(slru_cache, i);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!i.numE(simple_lru_cache_strategy_peek_most_recent(slru_cache))) {
                                Errors.error($str_alt85$The_just_touched_item__A_is_not_t, i, simple_lru_cache_strategy_peek_most_recent(slru_cache));
                            }
                        }
                        test_slru_cache_strategy_compare_directions(slru_cache);
                    }
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                        if (NIL != evenp(i)) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == simple_lru_cache_strategy_trackedP(slru_cache, i)) {
                                    Errors.error($str_alt84$The_item__A_is_not_tracked_despit, i);
                                }
                            }
                            simple_lru_cache_strategy_note_reference(slru_cache, i);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!i.numE(simple_lru_cache_strategy_peek_most_recent(slru_cache))) {
                                    Errors.error($str_alt85$The_just_touched_item__A_is_not_t, i, simple_lru_cache_strategy_peek_most_recent(slru_cache));
                                }
                            }
                            test_slru_cache_strategy_compare_directions(slru_cache);
                        }
                    }
                }
                {
                    SubLObject prev_mr_val = add(capacity, capacity);
                    SubLObject prev_lr_val = minus(ONE_INTEGER);
                    SubLObject cdotimes_end_var = integerDivide(capacity, TWO_INTEGER);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject mr_val = simple_lru_cache_strategy_peek_most_recent_nth(slru_cache, i);
                            SubLObject lr_val = simple_lru_cache_strategy_peek_least_recent_nth(slru_cache, i);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == evenp(mr_val)) {
                                    Errors.error($str_alt86$The_most_recent_nth__A_is_not_eve, i, mr_val);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == oddp(lr_val)) {
                                    Errors.error($str_alt87$The_least_recent_nth__A_is_not_od, i, lr_val);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!prev_mr_val.numG(mr_val)) {
                                    Errors.error($str_alt88$At__A__the_previous_most_recent__, i, prev_mr_val, mr_val);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!lr_val.numG(prev_lr_val)) {
                                    Errors.error($str_alt89$At__A__the_previous_least_recent_, i, prev_lr_val, lr_val);
                                }
                            }
                            prev_mr_val = mr_val;
                            prev_lr_val = lr_val;
                        }
                    }
                }
                clear_simple_lru_cache_strategy(slru_cache);
                cache_utilities.test_cache_strategy_implementation_conformance(slru_cache);
            }
            return $SUCCESS;
        }
    }

    public static SubLObject test_basic_slru_cache_strategy(SubLObject capacity) {
        if (capacity == UNPROVIDED) {
            capacity = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject slru_cache = new_simple_lru_cache_strategy(capacity, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!simple_lru_cache_strategy_size(slru_cache).isZero())) {
            Errors.error($str81$The_freshly_allocated_cache_strat);
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!i.numE(simple_lru_cache_strategy_size(slru_cache)))) {
                Errors.error($str82$There_are_not__A__but__A_items_in, i, simple_lru_cache_strategy_size(slru_cache));
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != simple_lru_cache_strategy_trackedP(slru_cache, i))) {
                Errors.error($str83$The_item__A_is_being_tracked_befo, i);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!i.numE(simple_lru_cache_strategy_track(slru_cache, i)))) {
                Errors.error($str84$The_addition_of_the_item__A_to_th, i);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!i.numE(simple_lru_cache_strategy_peek_most_recent(slru_cache)))) {
                Errors.error($str85$The_newly_added_item__A_is_not_th, i, simple_lru_cache_strategy_peek_most_recent(slru_cache));
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == simple_lru_cache_strategy_trackedP(slru_cache, i))) {
                Errors.error($str86$The_item__A_is_not_tracked_despit, i);
            }
        }
        test_slru_cache_strategy_compare_directions(slru_cache);
        test_slru_cache_strategy_peek_operators(slru_cache);
        for (i = NIL, i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == simple_lru_cache_strategy_trackedP(slru_cache, i))) {
                Errors.error($str86$The_item__A_is_not_tracked_despit, i);
            }
            simple_lru_cache_strategy_note_reference(slru_cache, i);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!i.numE(simple_lru_cache_strategy_peek_most_recent(slru_cache)))) {
                Errors.error($str87$The_just_touched_item__A_is_not_t, i, simple_lru_cache_strategy_peek_most_recent(slru_cache));
            }
            test_slru_cache_strategy_compare_directions(slru_cache);
        }
        for (i = NIL, i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
            if (NIL != evenp(i)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == simple_lru_cache_strategy_trackedP(slru_cache, i))) {
                    Errors.error($str86$The_item__A_is_not_tracked_despit, i);
                }
                simple_lru_cache_strategy_note_reference(slru_cache, i);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!i.numE(simple_lru_cache_strategy_peek_most_recent(slru_cache)))) {
                    Errors.error($str87$The_just_touched_item__A_is_not_t, i, simple_lru_cache_strategy_peek_most_recent(slru_cache));
                }
                test_slru_cache_strategy_compare_directions(slru_cache);
            }
        }
        SubLObject prev_mr_val = add(capacity, capacity);
        SubLObject prev_lr_val = minus(ONE_INTEGER);
        SubLObject cdotimes_end_var;
        SubLObject j;
        SubLObject mr_val;
        SubLObject lr_val;
        for (cdotimes_end_var = integerDivide(capacity, TWO_INTEGER), j = NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var); j = add(j, ONE_INTEGER)) {
            mr_val = simple_lru_cache_strategy_peek_most_recent_nth(slru_cache, j);
            lr_val = simple_lru_cache_strategy_peek_least_recent_nth(slru_cache, j);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == evenp(mr_val))) {
                Errors.error($str88$The_most_recent_nth__A_is_not_eve, j, mr_val);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == oddp(lr_val))) {
                Errors.error($str89$The_least_recent_nth__A_is_not_od, j, lr_val);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!prev_mr_val.numG(mr_val))) {
                Errors.error($str90$At__A__the_previous_most_recent__, j, prev_mr_val, mr_val);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!lr_val.numG(prev_lr_val))) {
                Errors.error($str91$At__A__the_previous_least_recent_, j, prev_lr_val, lr_val);
            }
            prev_mr_val = mr_val;
            prev_lr_val = lr_val;
        }
        clear_simple_lru_cache_strategy(slru_cache);
        cache_utilities.test_cache_strategy_implementation_conformance(slru_cache);
        return $SUCCESS;
    }

    /**
     * Run a stream of random numbers against an SLRU cache and a CACHE-P and make
     * sure that the SLRU-cache behaves as the CACHE-P would.
     *
     * @return :success
     */
    @LispMethod(comment = "Run a stream of random numbers against an SLRU cache and a CACHE-P and make\r\nsure that the SLRU-cache behaves as the CACHE-P would.\r\n\r\n@return :success\nRun a stream of random numbers against an SLRU cache and a CACHE-P and make\nsure that the SLRU-cache behaves as the CACHE-P would.")
    public static final SubLObject compare_slru_cache_strategy_with_cache_alt(SubLObject capacity, SubLObject over_capacity_factor) {
        if (over_capacity_factor == UNPROVIDED) {
            over_capacity_factor = TEN_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject slru_cache = new_simple_lru_cache_strategy(capacity, UNPROVIDED);
                SubLObject v_cache = cache.new_preallocated_cache(capacity, UNPROVIDED);
                SubLObject items = cache_utilities.random_integers_for_testing_caches(capacity, over_capacity_factor);
                SubLObject cdolist_list_var = items;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    {
                        SubLObject prev_state = simple_lru_cache_strategy_most_recent_items(slru_cache);
                        SubLObject cache_addition = cache.cache_set_return_dropped(v_cache, item, item);
                        SubLObject slru_cache_addition = simple_lru_cache_strategy_track(slru_cache, item);
                        if (NIL == cache_addition) {
                            cache_addition = item;
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!cache_addition.numE(slru_cache_addition)) {
                                Errors.error($str_alt93$The_CACHE_P_and_the_SLRU_CACHE_ar, new SubLObject[]{ item, cache_addition, slru_cache_addition, prev_state });
                            }
                        }
                    }
                }
            }
            return $SUCCESS;
        }
    }

    @LispMethod(comment = "Run a stream of random numbers against an SLRU cache and a CACHE-P and make\r\nsure that the SLRU-cache behaves as the CACHE-P would.\r\n\r\n@return :success\nRun a stream of random numbers against an SLRU cache and a CACHE-P and make\nsure that the SLRU-cache behaves as the CACHE-P would.")
    public static SubLObject compare_slru_cache_strategy_with_cache(final SubLObject capacity, SubLObject over_capacity_factor) {
        if (over_capacity_factor == UNPROVIDED) {
            over_capacity_factor = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject slru_cache = new_simple_lru_cache_strategy(capacity, UNPROVIDED);
        final SubLObject v_cache = cache.new_preallocated_cache(capacity, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject items = cdolist_list_var = cache_utilities.random_integers_for_testing_caches(capacity, over_capacity_factor);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject prev_state = simple_lru_cache_strategy_most_recent_items(slru_cache);
            SubLObject cache_addition = cache.cache_set_return_dropped(v_cache, item, item);
            final SubLObject slru_cache_addition = simple_lru_cache_strategy_track(slru_cache, item);
            if (NIL == cache_addition) {
                cache_addition = item;
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!cache_addition.numE(slru_cache_addition))) {
                Errors.error($str95$The_CACHE_P_and_the_SLRU_CACHE_ar, new SubLObject[]{ item, cache_addition, slru_cache_addition, prev_state });
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return $SUCCESS;
    }

    /**
     * Run a stream of random numbers first against the CACHE-P and then
     * against the SLRU cache and make sure that the SLRU is faster than
     * the CACHE-P.
     * This assumes that (a) COMPARE-SLRU-CACHE-STRATEGY-WITH-CACHE has
     * already ensured that they behave the same and (b) that the CAPACITY
     * and OVER-CAPACITY-FACTOR are sufficient to exhibit differences in speed.
     *
     * @return :success
     */
    @LispMethod(comment = "Run a stream of random numbers first against the CACHE-P and then\r\nagainst the SLRU cache and make sure that the SLRU is faster than\r\nthe CACHE-P.\r\nThis assumes that (a) COMPARE-SLRU-CACHE-STRATEGY-WITH-CACHE has\r\nalready ensured that they behave the same and (b) that the CAPACITY\r\nand OVER-CAPACITY-FACTOR are sufficient to exhibit differences in speed.\r\n\r\n@return :success\nRun a stream of random numbers first against the CACHE-P and then\nagainst the SLRU cache and make sure that the SLRU is faster than\nthe CACHE-P.\nThis assumes that (a) COMPARE-SLRU-CACHE-STRATEGY-WITH-CACHE has\nalready ensured that they behave the same and (b) that the CAPACITY\nand OVER-CAPACITY-FACTOR are sufficient to exhibit differences in speed.")
    public static final SubLObject compare_slru_cache_strategy_speed_with_cache_alt(SubLObject capacity, SubLObject over_capacity_factor, SubLObject runs) {
        if (over_capacity_factor == UNPROVIDED) {
            over_capacity_factor = TEN_INTEGER;
        }
        if (runs == UNPROVIDED) {
            runs = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject slru_cache = new_simple_lru_cache_strategy(capacity, UNPROVIDED);
                SubLObject v_cache = cache.new_preallocated_cache(capacity, UNPROVIDED);
                SubLObject items = cache_utilities.random_integers_for_testing_caches(capacity, over_capacity_factor);
                SubLObject time_slru = NIL;
                SubLObject time_cache = NIL;
                SubLObject run = NIL;
                for (run = ZERO_INTEGER; run.numL(runs); run = add(run, ONE_INTEGER)) {
                    Storage.gc(UNPROVIDED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject cdolist_list_var = items;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                simple_lru_cache_strategy_track(slru_cache, item);
                            }
                        }
                        time_slru = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    Storage.gc(UNPROVIDED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject cdolist_list_var = items;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                cache.cache_set_return_dropped(v_cache, item, item);
                            }
                        }
                        time_cache = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!time_slru.numL(time_cache)) {
                            Errors.error($str_alt96$Sorry__but_on_run___A_CACHE_P_too, add(ONE_INTEGER, run), time_cache, time_slru);
                        }
                    }
                }
                return values($SUCCESS, time_slru, time_cache);
            }
        }
    }

    @LispMethod(comment = "Run a stream of random numbers first against the CACHE-P and then\r\nagainst the SLRU cache and make sure that the SLRU is faster than\r\nthe CACHE-P.\r\nThis assumes that (a) COMPARE-SLRU-CACHE-STRATEGY-WITH-CACHE has\r\nalready ensured that they behave the same and (b) that the CAPACITY\r\nand OVER-CAPACITY-FACTOR are sufficient to exhibit differences in speed.\r\n\r\n@return :success\nRun a stream of random numbers first against the CACHE-P and then\nagainst the SLRU cache and make sure that the SLRU is faster than\nthe CACHE-P.\nThis assumes that (a) COMPARE-SLRU-CACHE-STRATEGY-WITH-CACHE has\nalready ensured that they behave the same and (b) that the CAPACITY\nand OVER-CAPACITY-FACTOR are sufficient to exhibit differences in speed.")
    public static SubLObject compare_slru_cache_strategy_speed_with_cache(final SubLObject capacity, SubLObject over_capacity_factor, SubLObject runs) {
        if (over_capacity_factor == UNPROVIDED) {
            over_capacity_factor = TEN_INTEGER;
        }
        if (runs == UNPROVIDED) {
            runs = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject slru_cache = new_simple_lru_cache_strategy(capacity, UNPROVIDED);
        final SubLObject v_cache = cache.new_preallocated_cache(capacity, UNPROVIDED);
        final SubLObject items = cache_utilities.random_integers_for_testing_caches(capacity, over_capacity_factor);
        SubLObject time_slru = NIL;
        SubLObject time_cache = NIL;
        SubLObject run;
        SubLObject time_var;
        SubLObject cdolist_list_var;
        SubLObject item;
        for (run = NIL, run = ZERO_INTEGER; run.numL(runs); run = add(run, ONE_INTEGER)) {
            Storage.gc(UNPROVIDED);
            time_var = get_internal_real_time();
            cdolist_list_var = items;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                simple_lru_cache_strategy_track(slru_cache, item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            time_slru = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            Storage.gc(UNPROVIDED);
            time_var = get_internal_real_time();
            cdolist_list_var = items;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cache.cache_set_return_dropped(v_cache, item, item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            time_cache = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!time_slru.numL(time_cache))) {
                Errors.error($str98$Sorry__but_on_run___A_CACHE_P_too, add(ONE_INTEGER, run), time_cache, time_slru);
            }
        }
        return values($SUCCESS, time_slru, time_cache);
    }

    /**
     * Ensures that the two directions always match.
     */
    @LispMethod(comment = "Ensures that the two directions always match.")
    public static final SubLObject test_slru_cache_strategy_compare_directions_alt(SubLObject slru_cache) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject most_recent_items = simple_lru_cache_strategy_most_recent_items(slru_cache);
                SubLObject least_recent_items = simple_lru_cache_strategy_least_recent_items(slru_cache);
                if (!most_recent_items.equalp(reverse(least_recent_items))) {
                    print_slru_cache_linked_list_status(slru_cache);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        Errors.error($str_alt97$The_most_recent_item_list_is__A__, most_recent_items, least_recent_items);
                    }
                }
            }
            return slru_cache;
        }
    }

    @LispMethod(comment = "Ensures that the two directions always match.")
    public static SubLObject test_slru_cache_strategy_compare_directions(final SubLObject slru_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject most_recent_items = simple_lru_cache_strategy_most_recent_items(slru_cache);
        final SubLObject least_recent_items = simple_lru_cache_strategy_least_recent_items(slru_cache);
        if (!most_recent_items.equalp(reverse(least_recent_items))) {
            print_slru_cache_linked_list_status(slru_cache);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                Errors.error($str99$The_most_recent_item_list_is__A__, most_recent_items, least_recent_items);
            }
        }
        return slru_cache;
    }

    public static final SubLObject test_slru_cache_strategy_peek_operators_alt(SubLObject slru_cache) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject capacity = simple_lru_cache_strategy_capacity(slru_cache);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject mr_nth = subtract(subtract(capacity, ONE_INTEGER), i);
                        SubLObject lr_nth = i;
                        SubLObject mr_val = simple_lru_cache_strategy_peek_most_recent_nth(slru_cache, i);
                        SubLObject lr_val = simple_lru_cache_strategy_peek_least_recent_nth(slru_cache, i);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == subl_promotions.non_negative_integer_p(mr_val)) {
                                Errors.error($str_alt98$At__A__the_most_recent_value_shou, i, mr_val);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == subl_promotions.non_negative_integer_p(mr_val)) {
                                Errors.error($str_alt99$At__A__the_least_recent_value_sho, i, lr_val);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!mr_nth.numE(mr_val)) {
                                Errors.error($str_alt100$The_most_recent_nth_of__A_was_sup, i, mr_nth, mr_val);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!lr_nth.numE(lr_val)) {
                                Errors.error($str_alt101$The_least_recent_nth_of__A_was_su, i, lr_nth, lr_val);
                            }
                        }
                    }
                }
            }
            return slru_cache;
        }
    }

    public static SubLObject test_slru_cache_strategy_peek_operators(final SubLObject slru_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject capacity;
        SubLObject i;
        SubLObject mr_nth;
        SubLObject lr_nth;
        SubLObject mr_val;
        SubLObject lr_val;
        for (capacity = simple_lru_cache_strategy_capacity(slru_cache), i = NIL, i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
            mr_nth = subtract(subtract(capacity, ONE_INTEGER), i);
            lr_nth = i;
            mr_val = simple_lru_cache_strategy_peek_most_recent_nth(slru_cache, i);
            lr_val = simple_lru_cache_strategy_peek_least_recent_nth(slru_cache, i);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(mr_val))) {
                Errors.error($str100$At__A__the_most_recent_value_shou, i, mr_val);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(mr_val))) {
                Errors.error($str101$At__A__the_least_recent_value_sho, i, lr_val);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!mr_nth.numE(mr_val))) {
                Errors.error($str102$The_most_recent_nth_of__A_was_sup, i, mr_nth, mr_val);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!lr_nth.numE(lr_val))) {
                Errors.error($str103$The_least_recent_nth_of__A_was_su, i, lr_nth, lr_val);
            }
        }
        return slru_cache;
    }

    public static SubLObject declare_simple_lru_cache_strategy_file() {
        declareFunction("simple_lru_cache_strategy_print_function_trampoline", "SIMPLE-LRU-CACHE-STRATEGY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("simple_lru_cache_strategy_p", "SIMPLE-LRU-CACHE-STRATEGY-P", 1, 0, false);
        new simple_lru_cache_strategy.$simple_lru_cache_strategy_p$UnaryFunction();
        declareFunction("slru_cachestrat_capacity", "SLRU-CACHESTRAT-CAPACITY", 1, 0, false);
        declareFunction("slru_cachestrat_index", "SLRU-CACHESTRAT-INDEX", 1, 0, false);
        declareFunction("slru_cachestrat_payload", "SLRU-CACHESTRAT-PAYLOAD", 1, 0, false);
        declareFunction("slru_cachestrat_head", "SLRU-CACHESTRAT-HEAD", 1, 0, false);
        declareFunction("slru_cachestrat_tail", "SLRU-CACHESTRAT-TAIL", 1, 0, false);
        declareFunction("slru_cachestrat_freelist_head", "SLRU-CACHESTRAT-FREELIST-HEAD", 1, 0, false);
        declareFunction("slru_cachestrat_metrics", "SLRU-CACHESTRAT-METRICS", 1, 0, false);
        declareFunction("_csetf_slru_cachestrat_capacity", "_CSETF-SLRU-CACHESTRAT-CAPACITY", 2, 0, false);
        declareFunction("_csetf_slru_cachestrat_index", "_CSETF-SLRU-CACHESTRAT-INDEX", 2, 0, false);
        declareFunction("_csetf_slru_cachestrat_payload", "_CSETF-SLRU-CACHESTRAT-PAYLOAD", 2, 0, false);
        declareFunction("_csetf_slru_cachestrat_head", "_CSETF-SLRU-CACHESTRAT-HEAD", 2, 0, false);
        declareFunction("_csetf_slru_cachestrat_tail", "_CSETF-SLRU-CACHESTRAT-TAIL", 2, 0, false);
        declareFunction("_csetf_slru_cachestrat_freelist_head", "_CSETF-SLRU-CACHESTRAT-FREELIST-HEAD", 2, 0, false);
        declareFunction("_csetf_slru_cachestrat_metrics", "_CSETF-SLRU-CACHESTRAT-METRICS", 2, 0, false);
        declareFunction("make_simple_lru_cache_strategy", "MAKE-SIMPLE-LRU-CACHE-STRATEGY", 0, 1, false);
        declareFunction("visit_defstruct_simple_lru_cache_strategy", "VISIT-DEFSTRUCT-SIMPLE-LRU-CACHE-STRATEGY", 2, 0, false);
        declareFunction("visit_defstruct_object_simple_lru_cache_strategy_method", "VISIT-DEFSTRUCT-OBJECT-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("print_simple_lru_cache_strategy", "PRINT-SIMPLE-LRU-CACHE-STRATEGY", 3, 0, false);
        declareFunction("new_simple_lru_cache_strategy", "NEW-SIMPLE-LRU-CACHE-STRATEGY", 1, 1, false);
        declareFunction("clear_simple_lru_cache_strategy", "CLEAR-SIMPLE-LRU-CACHE-STRATEGY", 1, 0, false);
        declareFunction("simple_lru_cache_strategy_size", "SIMPLE-LRU-CACHE-STRATEGY-SIZE", 1, 0, false);
        declareFunction("simple_lru_cache_strategy_capacity", "SIMPLE-LRU-CACHE-STRATEGY-CAPACITY", 1, 0, false);
        declareFunction("simple_lru_cache_strategy_trackedP", "SIMPLE-LRU-CACHE-STRATEGY-TRACKED?", 2, 0, false);
        declareFunction("simple_lru_cache_strategy_track", "SIMPLE-LRU-CACHE-STRATEGY-TRACK", 2, 0, false);
        declareFunction("simple_lru_cache_strategy_note_reference", "SIMPLE-LRU-CACHE-STRATEGY-NOTE-REFERENCE", 2, 0, false);
        declareFunction("simple_lru_cache_strategy_untrack", "SIMPLE-LRU-CACHE-STRATEGY-UNTRACK", 2, 0, false);
        declareFunction("simple_lru_cache_strategy_peek_most_recent_nth", "SIMPLE-LRU-CACHE-STRATEGY-PEEK-MOST-RECENT-NTH", 2, 0, false);
        declareFunction("simple_lru_cache_strategy_peek_most_recent", "SIMPLE-LRU-CACHE-STRATEGY-PEEK-MOST-RECENT", 1, 0, false);
        declareFunction("simple_lru_cache_strategy_peek_least_recent", "SIMPLE-LRU-CACHE-STRATEGY-PEEK-LEAST-RECENT", 1, 0, false);
        declareFunction("simple_lru_cache_strategy_peek_least_recent_nth", "SIMPLE-LRU-CACHE-STRATEGY-PEEK-LEAST-RECENT-NTH", 2, 0, false);
        declareFunction("simple_lru_cache_strategy_most_recent_items", "SIMPLE-LRU-CACHE-STRATEGY-MOST-RECENT-ITEMS", 1, 0, false);
        declareFunction("simple_lru_cache_strategy_least_recent_items", "SIMPLE-LRU-CACHE-STRATEGY-LEAST-RECENT-ITEMS", 1, 0, false);
        declareFunction("new_simple_lru_cache_current_content_iterator", "NEW-SIMPLE-LRU-CACHE-CURRENT-CONTENT-ITERATOR", 1, 1, false);
        declareFunction("slru_cache_index_datum", "SLRU-CACHE-INDEX-DATUM", 1, 0, false);
        declareFunction("slru_cache_index_backref", "SLRU-CACHE-INDEX-BACKREF", 1, 0, false);
        declareFunction("slru_cache_index_fwdref", "SLRU-CACHE-INDEX-FWDREF", 1, 0, false);
        declareFunction("slru_cache_payload_size", "SLRU-CACHE-PAYLOAD-SIZE", 1, 0, false);
        declareFunction("get_slru_cache_index_datum", "GET-SLRU-CACHE-INDEX-DATUM", 2, 0, false);
        declareFunction("get_slru_cache_index_backref", "GET-SLRU-CACHE-INDEX-BACKREF", 2, 0, false);
        declareFunction("get_slru_cache_index_fwdref", "GET-SLRU-CACHE-INDEX-FWDREF", 2, 0, false);
        declareFunction("get_slru_cache_index_type", "GET-SLRU-CACHE-INDEX-TYPE", 1, 0, false);
        declareFunction("set_slru_cache_payload_index_datum", "SET-SLRU-CACHE-PAYLOAD-INDEX-DATUM", 3, 0, false);
        declareFunction("set_slru_cache_payload_index_backref", "SET-SLRU-CACHE-PAYLOAD-INDEX-BACKREF", 3, 0, false);
        declareFunction("set_slru_cache_payload_index_fwdref", "SET-SLRU-CACHE-PAYLOAD-INDEX-FWDREF", 3, 0, false);
        declareFunction("set_slru_cache_index_datum", "SET-SLRU-CACHE-INDEX-DATUM", 3, 0, false);
        declareFunction("set_slru_cache_index_backref", "SET-SLRU-CACHE-INDEX-BACKREF", 3, 0, false);
        declareFunction("set_slru_cache_index_fwdref", "SET-SLRU-CACHE-INDEX-FWDREF", 3, 0, false);
        declareFunction("slru_cache_reset_linked_list", "SLRU-CACHE-RESET-LINKED-LIST", 1, 0, false);
        declareFunction("slru_cache_linked_list_dequeue", "SLRU-CACHE-LINKED-LIST-DEQUEUE", 2, 0, false);
        declareFunction("slru_cache_linked_list_dequeue_and_resource", "SLRU-CACHE-LINKED-LIST-DEQUEUE-AND-RESOURCE", 2, 0, false);
        declareFunction("slru_cache_linked_list_insert_new_at_head", "SLRU-CACHE-LINKED-LIST-INSERT-NEW-AT-HEAD", 2, 0, false);
        declareFunction("slru_cache_linked_list_insert_known_at_head", "SLRU-CACHE-LINKED-LIST-INSERT-KNOWN-AT-HEAD", 3, 0, false);
        declareFunction("slru_cache_linked_list_insert_recycling_at_head", "SLRU-CACHE-LINKED-LIST-INSERT-RECYCLING-AT-HEAD", 2, 0, false);
        declareFunction("slru_cache_linked_list_recycle_tail_as_head", "SLRU-CACHE-LINKED-LIST-RECYCLE-TAIL-AS-HEAD", 1, 0, false);
        declareFunction("slru_cache_linked_list_insert_index_at_front", "SLRU-CACHE-LINKED-LIST-INSERT-INDEX-AT-FRONT", 2, 0, false);
        declareFunction("print_slru_cache_linked_list_status", "PRINT-SLRU-CACHE-LINKED-LIST-STATUS", 1, 0, false);
        declareFunction("slru_cache_freelist_empty_p", "SLRU-CACHE-FREELIST-EMPTY-P", 1, 0, false);
        declareFunction("slru_cache_reset_freelist", "SLRU-CACHE-RESET-FREELIST", 1, 0, false);
        declareFunction("slru_cache_freelist_dequeue", "SLRU-CACHE-FREELIST-DEQUEUE", 1, 0, false);
        declareFunction("slru_cache_freelist_enqueue", "SLRU-CACHE-FREELIST-ENQUEUE", 2, 0, false);
        declareFunction("cache_strategy_object_p_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_reset_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-RESET-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_cache_capacity_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_cache_size_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_track_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-TRACK-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_trackedP_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-TRACKED?-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_untrack_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-UNTRACK-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_supports_parameter_p_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_get_parameter_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 3, 0, false);
        declareFunction("cache_strategy_object_set_parameter_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 3, 0, false);
        declareFunction("cache_strategy_object_note_reference_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_note_references_in_order_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_get_metrics_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_reset_metrics_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_gather_metrics_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_dont_gather_metrics_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_keeps_metrics_p_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
        declareFunction("new_cache_strategy_object_tracked_content_iterator_simple_lru_cache_strategy_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 1, 0, false);
        declareFunction("map_cache_strategy_object_tracked_content_simple_lru_cache_strategy_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_untrack_all_simple_lru_cache_strategy_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-SIMPLE-LRU-CACHE-STRATEGY-METHOD", 2, 0, false);
        declareFunction("cache_strategy_slru_cache_object_cache_capacity", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-CACHE-CAPACITY", 1, 0, false);
        declareFunction("cache_strategy_slru_cache_object_cache_size", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-CACHE-SIZE", 1, 0, false);
        declareFunction("cache_strategy_slru_cache_object_dont_gather_metrics", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
        declareFunction("cache_strategy_slru_cache_object_gather_metrics", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-GATHER-METRICS", 2, 0, false);
        declareFunction("cache_strategy_slru_cache_object_get_metrics", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-GET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_slru_cache_object_get_parameter", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-GET-PARAMETER", 3, 0, false);
        declareFunction("cache_strategy_slru_cache_object_keeps_metrics_p", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false);
        declareFunction("cache_strategy_slru_cache_object_note_reference", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-NOTE-REFERENCE", 2, 0, false);
        declareFunction("cache_strategy_slru_cache_object_note_references_in_order", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction("cache_strategy_slru_cache_object_reset", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-RESET", 1, 0, false);
        declareFunction("cache_strategy_slru_cache_object_reset_metrics", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-RESET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_slru_cache_object_set_parameter", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-SET-PARAMETER", 3, 0, false);
        declareFunction("cache_strategy_slru_cache_object_supports_parameter_p", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
        declareFunction("cache_strategy_slru_cache_object_track", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-TRACK", 2, 0, false);
        declareFunction("cache_strategy_slru_cache_object_trackedP", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-TRACKED?", 2, 0, false);
        declareFunction("cache_strategy_slru_cache_object_untrack", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-UNTRACK", 2, 0, false);
        declareFunction("cache_strategy_slru_cache_object_untrack_all", "CACHE-STRATEGY-SLRU-CACHE-OBJECT-UNTRACK-ALL", 2, 0, false);
        declareFunction("map_cache_strategy_slru_cache_object_tracked_content", "MAP-CACHE-STRATEGY-SLRU-CACHE-OBJECT-TRACKED-CONTENT", 2, 0, false);
        declareFunction("new_cache_strategy_slru_cache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-SLRU-CACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
        declareFunction("test_basic_slru_cache_strategy", "TEST-BASIC-SLRU-CACHE-STRATEGY", 0, 1, false);
        declareFunction("compare_slru_cache_strategy_with_cache", "COMPARE-SLRU-CACHE-STRATEGY-WITH-CACHE", 1, 1, false);
        declareFunction("compare_slru_cache_strategy_speed_with_cache", "COMPARE-SLRU-CACHE-STRATEGY-SPEED-WITH-CACHE", 1, 2, false);
        declareFunction("test_slru_cache_strategy_compare_directions", "TEST-SLRU-CACHE-STRATEGY-COMPARE-DIRECTIONS", 1, 0, false);
        declareFunction("test_slru_cache_strategy_peek_operators", "TEST-SLRU-CACHE-STRATEGY-PEEK-OPERATORS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_simple_lru_cache_strategy_file() {
        defconstant("*DTP-SIMPLE-LRU-CACHE-STRATEGY*", SIMPLE_LRU_CACHE_STRATEGY);
        return NIL;
    }

    public static final SubLObject setup_simple_lru_cache_strategy_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(SIMPLE_LRU_CACHE_STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SLRU_CACHESTRAT_CAPACITY, _CSETF_SLRU_CACHESTRAT_CAPACITY);
        def_csetf(SLRU_CACHESTRAT_INDEX, _CSETF_SLRU_CACHESTRAT_INDEX);
        def_csetf(SLRU_CACHESTRAT_PAYLOAD, _CSETF_SLRU_CACHESTRAT_PAYLOAD);
        def_csetf(SLRU_CACHESTRAT_HEAD, _CSETF_SLRU_CACHESTRAT_HEAD);
        def_csetf(SLRU_CACHESTRAT_TAIL, _CSETF_SLRU_CACHESTRAT_TAIL);
        def_csetf(SLRU_CACHESTRAT_FREELIST_HEAD, _CSETF_SLRU_CACHESTRAT_FREELIST_HEAD);
        def_csetf(SLRU_CACHESTRAT_METRICS, _CSETF_SLRU_CACHESTRAT_METRICS);
        identity(SIMPLE_LRU_CACHE_STRATEGY);
        register_method(cache_utilities.$cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_P_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_RESET_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym52$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_SIMPLE_LRU_CACHE_STRATEGY_ME));
        register_method(cache_utilities.$cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_CACHE_SIZE_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_TRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym55$CACHE_STRATEGY_OBJECT_TRACKED__SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_UNTRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym57$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_SIMPLE_LRU_CACHE_STRAT));
        register_method(cache_utilities.$cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym58$CACHE_STRATEGY_OBJECT_GET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
        register_method(cache_utilities.$cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym59$CACHE_STRATEGY_OBJECT_SET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
        register_method(cache_utilities.$cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym60$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_SIMPLE_LRU_CACHE_STRATEGY_ME));
        register_method(cache_utilities.$cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym61$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_SIMPLE_LRU_CACHE_S));
        register_method(cache_utilities.$cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym62$CACHE_STRATEGY_OBJECT_GET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_METHO));
        register_method(cache_utilities.$cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym63$CACHE_STRATEGY_OBJECT_RESET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_MET));
        register_method(cache_utilities.$cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym64$CACHE_STRATEGY_OBJECT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATEGY_ME));
        register_method(cache_utilities.$cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym65$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATE));
        register_method(cache_utilities.$cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym66$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_SIMPLE_LRU_CACHE_STRATEGY_M));
        register_method(cache_utilities.$new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym67$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_SIMPLE_LRU_CAC));
        register_method(cache_utilities.$map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym68$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_SIMPLE_LRU_CACHE_STRATE));
        register_method(cache_utilities.$cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym69$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_SIMPLE_LRU_CACHE_STRATEGY_METHO));
        define_test_case_table_int(TEST_BASIC_SLRU_CACHE_STRATEGY, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt78);
        define_test_case_table_int(COMPARE_SLRU_CACHE_STRATEGY_WITH_CACHE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, NIL }), $list_alt92);
        define_test_case_table_int(COMPARE_SLRU_CACHE_STRATEGY_SPEED_WITH_CACHE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, NIL }), $list_alt95);
        return NIL;
    }

    public static SubLObject setup_simple_lru_cache_strategy_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(SIMPLE_LRU_CACHE_STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(SLRU_CACHESTRAT_CAPACITY, _CSETF_SLRU_CACHESTRAT_CAPACITY);
            def_csetf(SLRU_CACHESTRAT_INDEX, _CSETF_SLRU_CACHESTRAT_INDEX);
            def_csetf(SLRU_CACHESTRAT_PAYLOAD, _CSETF_SLRU_CACHESTRAT_PAYLOAD);
            def_csetf(SLRU_CACHESTRAT_HEAD, _CSETF_SLRU_CACHESTRAT_HEAD);
            def_csetf(SLRU_CACHESTRAT_TAIL, _CSETF_SLRU_CACHESTRAT_TAIL);
            def_csetf(SLRU_CACHESTRAT_FREELIST_HEAD, _CSETF_SLRU_CACHESTRAT_FREELIST_HEAD);
            def_csetf(SLRU_CACHESTRAT_METRICS, _CSETF_SLRU_CACHESTRAT_METRICS);
            identity(SIMPLE_LRU_CACHE_STRATEGY);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
            register_method(cache_utilities.$cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_P_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
            register_method(cache_utilities.$cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_RESET_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
            register_method(cache_utilities.$cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym55$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_SIMPLE_LRU_CACHE_STRATEGY_ME));
            register_method(cache_utilities.$cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_CACHE_SIZE_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
            register_method(cache_utilities.$cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_TRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
            register_method(cache_utilities.$cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym58$CACHE_STRATEGY_OBJECT_TRACKED__SIMPLE_LRU_CACHE_STRATEGY_METHOD));
            register_method(cache_utilities.$cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_UNTRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
            register_method(cache_utilities.$cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym60$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_SIMPLE_LRU_CACHE_STRAT));
            register_method(cache_utilities.$cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym61$CACHE_STRATEGY_OBJECT_GET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
            register_method(cache_utilities.$cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym62$CACHE_STRATEGY_OBJECT_SET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
            register_method(cache_utilities.$cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym63$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_SIMPLE_LRU_CACHE_STRATEGY_ME));
            register_method(cache_utilities.$cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym64$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_SIMPLE_LRU_CACHE_S));
            register_method(cache_utilities.$cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym65$CACHE_STRATEGY_OBJECT_GET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_METHO));
            register_method(cache_utilities.$cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym66$CACHE_STRATEGY_OBJECT_RESET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_MET));
            register_method(cache_utilities.$cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym67$CACHE_STRATEGY_OBJECT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATEGY_ME));
            register_method(cache_utilities.$cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym68$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATE));
            register_method(cache_utilities.$cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym69$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_SIMPLE_LRU_CACHE_STRATEGY_M));
            register_method(cache_utilities.$new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym70$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_SIMPLE_LRU_CAC));
            register_method(cache_utilities.$map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym71$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_SIMPLE_LRU_CACHE_STRATE));
            register_method(cache_utilities.$cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym72$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_SIMPLE_LRU_CACHE_STRATEGY_METHO));
            define_test_case_table_int(TEST_BASIC_SLRU_CACHE_STRATEGY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list80);
            define_test_case_table_int(COMPARE_SLRU_CACHE_STRATEGY_WITH_CACHE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, NIL }), $list94);
            define_test_case_table_int(COMPARE_SLRU_CACHE_STRATEGY_SPEED_WITH_CACHE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, NIL }), $list97);
        }
        if (SubLFiles.USE_V2) {
            register_method(cache_utilities.$cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym52$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_SIMPLE_LRU_CACHE_STRATEGY_ME));
            register_method(cache_utilities.$cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym55$CACHE_STRATEGY_OBJECT_TRACKED__SIMPLE_LRU_CACHE_STRATEGY_METHOD));
            register_method(cache_utilities.$cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym57$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_SIMPLE_LRU_CACHE_STRAT));
            register_method(cache_utilities.$cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym58$CACHE_STRATEGY_OBJECT_GET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
            register_method(cache_utilities.$cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym59$CACHE_STRATEGY_OBJECT_SET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
            register_method(cache_utilities.$cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym60$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_SIMPLE_LRU_CACHE_STRATEGY_ME));
            register_method(cache_utilities.$cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym61$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_SIMPLE_LRU_CACHE_S));
            register_method(cache_utilities.$cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym62$CACHE_STRATEGY_OBJECT_GET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_METHO));
            register_method(cache_utilities.$cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym63$CACHE_STRATEGY_OBJECT_RESET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_MET));
            register_method(cache_utilities.$cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym64$CACHE_STRATEGY_OBJECT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATEGY_ME));
            register_method(cache_utilities.$cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym65$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATE));
            register_method(cache_utilities.$cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym66$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_SIMPLE_LRU_CACHE_STRATEGY_M));
            register_method(cache_utilities.$new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym67$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_SIMPLE_LRU_CAC));
            register_method(cache_utilities.$map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym68$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_SIMPLE_LRU_CACHE_STRATE));
            register_method(cache_utilities.$cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym69$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_SIMPLE_LRU_CACHE_STRATEGY_METHO));
            define_test_case_table_int(TEST_BASIC_SLRU_CACHE_STRATEGY, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt78);
            define_test_case_table_int(COMPARE_SLRU_CACHE_STRATEGY_WITH_CACHE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, NIL }), $list_alt92);
            define_test_case_table_int(COMPARE_SLRU_CACHE_STRATEGY_SPEED_WITH_CACHE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, NIL }), $list_alt95);
        }
        return NIL;
    }

    public static SubLObject setup_simple_lru_cache_strategy_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(SIMPLE_LRU_CACHE_STRATEGY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(SLRU_CACHESTRAT_CAPACITY, _CSETF_SLRU_CACHESTRAT_CAPACITY);
        def_csetf(SLRU_CACHESTRAT_INDEX, _CSETF_SLRU_CACHESTRAT_INDEX);
        def_csetf(SLRU_CACHESTRAT_PAYLOAD, _CSETF_SLRU_CACHESTRAT_PAYLOAD);
        def_csetf(SLRU_CACHESTRAT_HEAD, _CSETF_SLRU_CACHESTRAT_HEAD);
        def_csetf(SLRU_CACHESTRAT_TAIL, _CSETF_SLRU_CACHESTRAT_TAIL);
        def_csetf(SLRU_CACHESTRAT_FREELIST_HEAD, _CSETF_SLRU_CACHESTRAT_FREELIST_HEAD);
        def_csetf(SLRU_CACHESTRAT_METRICS, _CSETF_SLRU_CACHESTRAT_METRICS);
        identity(SIMPLE_LRU_CACHE_STRATEGY);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_P_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_RESET_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym55$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_SIMPLE_LRU_CACHE_STRATEGY_ME));
        register_method(cache_utilities.$cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_CACHE_SIZE_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_TRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym58$CACHE_STRATEGY_OBJECT_TRACKED__SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_UNTRACK_SIMPLE_LRU_CACHE_STRATEGY_METHOD));
        register_method(cache_utilities.$cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym60$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_SIMPLE_LRU_CACHE_STRAT));
        register_method(cache_utilities.$cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym61$CACHE_STRATEGY_OBJECT_GET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
        register_method(cache_utilities.$cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym62$CACHE_STRATEGY_OBJECT_SET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET));
        register_method(cache_utilities.$cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym63$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_SIMPLE_LRU_CACHE_STRATEGY_ME));
        register_method(cache_utilities.$cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym64$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_SIMPLE_LRU_CACHE_S));
        register_method(cache_utilities.$cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym65$CACHE_STRATEGY_OBJECT_GET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_METHO));
        register_method(cache_utilities.$cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym66$CACHE_STRATEGY_OBJECT_RESET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_MET));
        register_method(cache_utilities.$cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym67$CACHE_STRATEGY_OBJECT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATEGY_ME));
        register_method(cache_utilities.$cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym68$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATE));
        register_method(cache_utilities.$cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym69$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_SIMPLE_LRU_CACHE_STRATEGY_M));
        register_method(cache_utilities.$new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym70$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_SIMPLE_LRU_CAC));
        register_method(cache_utilities.$map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym71$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_SIMPLE_LRU_CACHE_STRATE));
        register_method(cache_utilities.$cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_simple_lru_cache_strategy$.getGlobalValue(), symbol_function($sym72$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_SIMPLE_LRU_CACHE_STRATEGY_METHO));
        define_test_case_table_int(TEST_BASIC_SLRU_CACHE_STRATEGY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list80);
        define_test_case_table_int(COMPARE_SLRU_CACHE_STRATEGY_WITH_CACHE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, NIL }), $list94);
        define_test_case_table_int(COMPARE_SLRU_CACHE_STRATEGY_SPEED_WITH_CACHE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, NIL }), $list97);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("CAPACITY"), makeSymbol("INDEX"), makeSymbol("PAYLOAD"), makeSymbol("HEAD"), makeSymbol("TAIL"), makeSymbol("FREELIST-HEAD"), makeSymbol("METRICS"));

    static private final SubLList $list_alt3 = list(makeKeyword("CAPACITY"), makeKeyword("INDEX"), makeKeyword("PAYLOAD"), $HEAD, $TAIL, makeKeyword("FREELIST-HEAD"), makeKeyword("METRICS"));

    static private final SubLList $list_alt4 = list(makeSymbol("SLRU-CACHESTRAT-CAPACITY"), makeSymbol("SLRU-CACHESTRAT-INDEX"), makeSymbol("SLRU-CACHESTRAT-PAYLOAD"), makeSymbol("SLRU-CACHESTRAT-HEAD"), makeSymbol("SLRU-CACHESTRAT-TAIL"), makeSymbol("SLRU-CACHESTRAT-FREELIST-HEAD"), makeSymbol("SLRU-CACHESTRAT-METRICS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-SLRU-CACHESTRAT-CAPACITY"), makeSymbol("_CSETF-SLRU-CACHESTRAT-INDEX"), makeSymbol("_CSETF-SLRU-CACHESTRAT-PAYLOAD"), makeSymbol("_CSETF-SLRU-CACHESTRAT-HEAD"), makeSymbol("_CSETF-SLRU-CACHESTRAT-TAIL"), makeSymbol("_CSETF-SLRU-CACHESTRAT-FREELIST-HEAD"), makeSymbol("_CSETF-SLRU-CACHESTRAT-METRICS"));

    @Override
    public void declareFunctions() {
        declare_simple_lru_cache_strategy_file();
    }

    @Override
    public void initializeVariables() {
        init_simple_lru_cache_strategy_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_simple_lru_cache_strategy_file();
    }

    static {
    }

    static private final SubLString $str_alt29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt30$__ = makeString("#<");

    static private final SubLString $str_alt32$_ = makeString(" ");

    static private final SubLString $str_alt33$_ = makeString("/");

    static private final SubLString $str_alt36$There_is_a_situation_where_RECYCL = makeString("There is a situation where RECYCLE introduces a new spot--investigate!");

    static private final SubLString $str_alt41$Wow__MOD_is_broken_____ = makeString("Wow, MOD is broken ...!");

    static private final SubLString $str_alt43$Head__ = makeString("Head: ");

    static private final SubLString $str_alt44$__ = makeString(" [");

    static private final SubLString $str_alt45$___ = makeString("| #");

    static private final SubLString $str_alt46$__v_ = makeString(": v=");

    static private final SubLString $str_alt47$___M_ = makeString(" <-M ");

    static private final SubLString $str_alt48$_L___ = makeString(" L-> ");

    static private final SubLString $str_alt49$___Tail__ = makeString("|] Tail: ");

    public static final class $simple_lru_cache_strategy_p$UnaryFunction extends UnaryFunction {
        public $simple_lru_cache_strategy_p$UnaryFunction() {
            super(extractFunctionNamed("SIMPLE-LRU-CACHE-STRATEGY-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return simple_lru_cache_strategy_p(arg1);
        }
    }

    static private final SubLSymbol $sym52$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_SIMPLE_LRU_CACHE_STRATEGY_ME = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym55$CACHE_STRATEGY_OBJECT_TRACKED__SIMPLE_LRU_CACHE_STRATEGY_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACKED?-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym57$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_SIMPLE_LRU_CACHE_STRAT = makeSymbol("CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym58$CACHE_STRATEGY_OBJECT_GET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET = makeSymbol("CACHE-STRATEGY-OBJECT-GET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym59$CACHE_STRATEGY_OBJECT_SET_PARAMETER_SIMPLE_LRU_CACHE_STRATEGY_MET = makeSymbol("CACHE-STRATEGY-OBJECT-SET-PARAMETER-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym60$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_SIMPLE_LRU_CACHE_STRATEGY_ME = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym61$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_SIMPLE_LRU_CACHE_S = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym62$CACHE_STRATEGY_OBJECT_GET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-GET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym63$CACHE_STRATEGY_OBJECT_RESET_METRICS_SIMPLE_LRU_CACHE_STRATEGY_MET = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym64$CACHE_STRATEGY_OBJECT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATEGY_ME = makeSymbol("CACHE-STRATEGY-OBJECT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym65$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_SIMPLE_LRU_CACHE_STRATE = makeSymbol("CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym66$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_SIMPLE_LRU_CACHE_STRATEGY_M = makeSymbol("CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym67$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_SIMPLE_LRU_CAC = makeSymbol("NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym68$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_SIMPLE_LRU_CACHE_STRATE = makeSymbol("MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLSymbol $sym69$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_SIMPLE_LRU_CACHE_STRATEGY_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-ALL-SIMPLE-LRU-CACHE-STRATEGY-METHOD");

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt78 = list(list(list(TEN_INTEGER), makeKeyword("SUCCESS")), list(list(TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(50)), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt79$The_freshly_allocated_cache_strat = makeString("The freshly allocated cache strategy is not empty.");

    static private final SubLString $str_alt80$There_are_not__A__but__A_items_in = makeString("There are not ~A, but ~A items in the cache.");

    static private final SubLString $str_alt81$The_item__A_is_being_tracked_befo = makeString("The item ~A is being tracked before we added it.");

    static private final SubLString $str_alt82$The_addition_of_the_item__A_to_th = makeString("The addition of the item ~A to the cache did not result in that item being returned.");

    static private final SubLString $str_alt83$The_newly_added_item__A_is_not_th = makeString("The newly added item ~A is not the most recent item ~A.");

    static private final SubLString $str_alt84$The_item__A_is_not_tracked_despit = makeString("The item ~A is not tracked despite the fact that we just added it.");

    static private final SubLString $str_alt85$The_just_touched_item__A_is_not_t = makeString("The just-touched item ~A is not the most recent item ~A.");

    static private final SubLString $str_alt86$The_most_recent_nth__A_is_not_eve = makeString("The most-recent nth ~A is not even but ~A.");

    static private final SubLString $str_alt87$The_least_recent_nth__A_is_not_od = makeString("The least-recent nth ~A is not odd but ~A.");

    static private final SubLString $str_alt88$At__A__the_previous_most_recent__ = makeString("At ~A, the previous most-recent ~A is not larger than the current ~A.");

    static private final SubLString $str_alt89$At__A__the_previous_least_recent_ = makeString("At ~A, the previous least-recent ~A is not smaller than the current ~A.");

    static private final SubLList $list_alt92 = list(list(list(TEN_INTEGER, TWO_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(100), TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(1000), makeInteger(50)), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt93$The_CACHE_P_and_the_SLRU_CACHE_ar = makeString("The CACHE-P and the SLRU-CACHE are out of sync. ~%Upon adding item ~A, CACHE-P returned ~A and SLRU-CACHE ~A~%Prior State: ~A~%");

    static private final SubLList $list_alt95 = list(list(list(makeInteger(1000), makeInteger(50)), makeKeyword("SUCCESS")), list(list(makeInteger(2000), makeInteger(80)), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt96$Sorry__but_on_run___A_CACHE_P_too = makeString("Sorry, but on run #~A CACHE-P took ~As and SLRU took ~As");

    static private final SubLString $str_alt97$The_most_recent_item_list_is__A__ = makeString("The most recent item list is ~A, but the least recent item list is ~A.");

    static private final SubLString $str_alt98$At__A__the_most_recent_value_shou = makeString("At ~A, the most recent value should have been a NON-NEGATIVE-INTEGER-P but is ~A instead.");

    static private final SubLString $str_alt99$At__A__the_least_recent_value_sho = makeString("At ~A, the least recent value should have been a NON-NEGATIVE-INTEGER-P but is ~A instead.");

    static private final SubLString $str_alt100$The_most_recent_nth_of__A_was_sup = makeString("The most-recent nth of ~A was supposed to be ~A but was ~A instead.");

    static private final SubLString $str_alt101$The_least_recent_nth_of__A_was_su = makeString("The least-recent nth of ~A was supposed to be ~A but was ~A instead.");
}

/**
 * Total time: 318 ms
 */
