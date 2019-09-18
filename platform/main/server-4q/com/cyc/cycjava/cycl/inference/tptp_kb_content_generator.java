/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.vector_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      TPTP-KB-CONTENT-GENERATOR
 *  source file: /cyc/top/cycl/inference/tptp-kb-content-generator.lisp
 *  created:     2019/07/03 17:38:28
 */
public final class tptp_kb_content_generator extends SubLTranslatedFile implements V02 {
    // // Constructor
    private tptp_kb_content_generator() {
    }

    public static final SubLFile me = new tptp_kb_content_generator();

    public static final String myName = "com.cyc.cycjava.cycl.inference.tptp_kb_content_generator";

    // // Definitions
    // defparameter
    private static final SubLSymbol $tptp_high_mt$ = makeSymbol("*TPTP-HIGH-MT*");

    // defparameter
    private static final SubLSymbol $tptp_medium_mt$ = makeSymbol("*TPTP-MEDIUM-MT*");

    // defparameter
    private static final SubLSymbol $tptp_low_mt$ = makeSymbol("*TPTP-LOW-MT*");

    // defparameter
    private static final SubLSymbol $tptp_collection_depth$ = makeSymbol("*TPTP-COLLECTION-DEPTH*");

    // defparameter
    private static final SubLSymbol $tptp_predicate_depth$ = makeSymbol("*TPTP-PREDICATE-DEPTH*");

    // defparameter
    private static final SubLSymbol $tptp_mt_spindle_member_count$ = makeSymbol("*TPTP-MT-SPINDLE-MEMBER-COUNT*");

    // defparameter
    private static final SubLSymbol $tptp_part_types_assertion_count$ = makeSymbol("*TPTP-PART-TYPES-ASSERTION-COUNT*");

    // defparameter
    private static final SubLSymbol $tptp_synthetic_instance_count$ = makeSymbol("*TPTP-SYNTHETIC-INSTANCE-COUNT*");

    // defparameter
    private static final SubLSymbol $tptp_unary_function_count$ = makeSymbol("*TPTP-UNARY-FUNCTION-COUNT*");

    // defparameter
    private static final SubLSymbol $tptp_object_quantity_col$ = makeSymbol("*TPTP-OBJECT-QUANTITY-COL*");

    // defparameter
    private static final SubLSymbol $tptp_type_level_object_quantity_assertion_count$ = makeSymbol("*TPTP-TYPE-LEVEL-OBJECT-QUANTITY-ASSERTION-COUNT*");

    // defparameter
    private static final SubLSymbol $tptp_instance_level_object_quantity_assertion_count$ = makeSymbol("*TPTP-INSTANCE-LEVEL-OBJECT-QUANTITY-ASSERTION-COUNT*");

    // defparameter
    private static final SubLSymbol $tptp_geo_mt$ = makeSymbol("*TPTP-GEO-MT*");

    // defparameter
    private static final SubLSymbol $tptp_geo_x_width$ = makeSymbol("*TPTP-GEO-X-WIDTH*");

    // defparameter
    private static final SubLSymbol $tptp_geo_y_width$ = makeSymbol("*TPTP-GEO-Y-WIDTH*");

    // defparameter
    private static final SubLSymbol $tptp_geo_levels$ = makeSymbol("*TPTP-GEO-LEVELS*");

    /**
     * Set this to T if you expect more than 20% of the KB to be synthetic,
     * and it'll select synthetic content by random sampling and testing
     * rather than by constructing a huge set of all the synthetic gafs.
     */
    // defparameter
    private static final SubLSymbol $more_than_20_percent_of_the_kb_is_syntheticP$ = makeSymbol("*MORE-THAN-20-PERCENT-OF-THE-KB-IS-SYNTHETIC?*");

    public static final class $tptp_kb_content_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return tptp_kb_content_generator.$tptp_kb_content_native.structDecl;
        }

        public SubLObject getField2() {
            return $col;
        }

        public SubLObject getField3() {
            return $part_types_pred;
        }

        public SubLObject getField4() {
            return $parts_pred;
        }

        public SubLObject getField5() {
            return $spindle_head_mt;
        }

        public SubLObject getField6() {
            return $spindle_member_mts;
        }

        public SubLObject getField7() {
            return $spindle_collector_mt;
        }

        public SubLObject getField8() {
            return $object_pred;
        }

        public SubLObject getField9() {
            return $unary_functions;
        }

        public SubLObject getField10() {
            return $geo_spindle_head_mt;
        }

        public SubLObject getField11() {
            return $geo_spindle_member_mts;
        }

        public SubLObject getField12() {
            return $geo_spindle_collector_mt;
        }

        public SubLObject getField13() {
            return $geo_collections;
        }

        public SubLObject getField14() {
            return $geo_regions;
        }

        public SubLObject getField15() {
            return $geo_locations;
        }

        public SubLObject getField16() {
            return $instances;
        }

        public SubLObject setField2(SubLObject value) {
            return $col = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $part_types_pred = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $parts_pred = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $spindle_head_mt = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $spindle_member_mts = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $spindle_collector_mt = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $object_pred = value;
        }

        public SubLObject setField9(SubLObject value) {
            return $unary_functions = value;
        }

        public SubLObject setField10(SubLObject value) {
            return $geo_spindle_head_mt = value;
        }

        public SubLObject setField11(SubLObject value) {
            return $geo_spindle_member_mts = value;
        }

        public SubLObject setField12(SubLObject value) {
            return $geo_spindle_collector_mt = value;
        }

        public SubLObject setField13(SubLObject value) {
            return $geo_collections = value;
        }

        public SubLObject setField14(SubLObject value) {
            return $geo_regions = value;
        }

        public SubLObject setField15(SubLObject value) {
            return $geo_locations = value;
        }

        public SubLObject setField16(SubLObject value) {
            return $instances = value;
        }

        public SubLObject $col = Lisp.NIL;

        public SubLObject $part_types_pred = Lisp.NIL;

        public SubLObject $parts_pred = Lisp.NIL;

        public SubLObject $spindle_head_mt = Lisp.NIL;

        public SubLObject $spindle_member_mts = Lisp.NIL;

        public SubLObject $spindle_collector_mt = Lisp.NIL;

        public SubLObject $object_pred = Lisp.NIL;

        public SubLObject $unary_functions = Lisp.NIL;

        public SubLObject $geo_spindle_head_mt = Lisp.NIL;

        public SubLObject $geo_spindle_member_mts = Lisp.NIL;

        public SubLObject $geo_spindle_collector_mt = Lisp.NIL;

        public SubLObject $geo_collections = Lisp.NIL;

        public SubLObject $geo_regions = Lisp.NIL;

        public SubLObject $geo_locations = Lisp.NIL;

        public SubLObject $instances = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(tptp_kb_content_generator.$tptp_kb_content_native.class, TPTP_KB_CONTENT, TPTP_KB_CONTENT_P, $list_alt13, $list_alt14, new String[]{ "$col", "$part_types_pred", "$parts_pred", "$spindle_head_mt", "$spindle_member_mts", "$spindle_collector_mt", "$object_pred", "$unary_functions", "$geo_spindle_head_mt", "$geo_spindle_member_mts", "$geo_spindle_collector_mt", "$geo_collections", "$geo_regions", "$geo_locations", "$instances" }, $list_alt15, $list_alt16, PRINT_TPTP_KB_CONTENT);
    }

    // defconstant
    public static final SubLSymbol $dtp_tptp_kb_content$ = makeSymbol("*DTP-TPTP-KB-CONTENT*");

    public static final SubLObject tptp_kb_content_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_tptp_kb_content(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject tptp_kb_content_p(SubLObject v_object) {
        return v_object.getJavaClass() ==tptp_kb_content_generator.$tptp_kb_content_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $tptp_kb_content_p$UnaryFunction extends UnaryFunction {
        public $tptp_kb_content_p$UnaryFunction() {
            super(extractFunctionNamed("TPTP-KB-CONTENT-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return tptp_kb_content_p(arg1);
        }
    }

    public static final SubLObject tptp_kbc_col(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField2();
    }

    public static final SubLObject tptp_kbc_part_types_pred(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField3();
    }

    public static final SubLObject tptp_kbc_parts_pred(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField4();
    }

    public static final SubLObject tptp_kbc_spindle_head_mt(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField5();
    }

    public static final SubLObject tptp_kbc_spindle_member_mts(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField6();
    }

    public static final SubLObject tptp_kbc_spindle_collector_mt(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField7();
    }

    public static final SubLObject tptp_kbc_object_pred(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField8();
    }

    public static final SubLObject tptp_kbc_unary_functions(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField9();
    }

    public static final SubLObject tptp_kbc_geo_spindle_head_mt(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField10();
    }

    public static final SubLObject tptp_kbc_geo_spindle_member_mts(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField11();
    }

    public static final SubLObject tptp_kbc_geo_spindle_collector_mt(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField12();
    }

    public static final SubLObject tptp_kbc_geo_collections(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField13();
    }

    public static final SubLObject tptp_kbc_geo_regions(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField14();
    }

    public static final SubLObject tptp_kbc_geo_locations(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField15();
    }

    public static final SubLObject tptp_kbc_instances(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.getField16();
    }

    public static final SubLObject _csetf_tptp_kbc_col(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tptp_kbc_part_types_pred(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tptp_kbc_parts_pred(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tptp_kbc_spindle_head_mt(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tptp_kbc_spindle_member_mts(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tptp_kbc_spindle_collector_mt(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tptp_kbc_object_pred(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_tptp_kbc_unary_functions(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_tptp_kbc_geo_spindle_head_mt(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_tptp_kbc_geo_spindle_member_mts(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_tptp_kbc_geo_spindle_collector_mt(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_tptp_kbc_geo_collections(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_tptp_kbc_geo_regions(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_tptp_kbc_geo_locations(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_tptp_kbc_instances(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, TPTP_KB_CONTENT_P);
        return v_object.setField16(value);
    }

    public static final SubLObject make_tptp_kb_content(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new tptp_kb_content_generator.$tptp_kb_content_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($COL)) {
                        _csetf_tptp_kbc_col(v_new, current_value);
                    } else
                        if (pcase_var.eql($PART_TYPES_PRED)) {
                            _csetf_tptp_kbc_part_types_pred(v_new, current_value);
                        } else
                            if (pcase_var.eql($PARTS_PRED)) {
                                _csetf_tptp_kbc_parts_pred(v_new, current_value);
                            } else
                                if (pcase_var.eql($SPINDLE_HEAD_MT)) {
                                    _csetf_tptp_kbc_spindle_head_mt(v_new, current_value);
                                } else
                                    if (pcase_var.eql($SPINDLE_MEMBER_MTS)) {
                                        _csetf_tptp_kbc_spindle_member_mts(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($SPINDLE_COLLECTOR_MT)) {
                                            _csetf_tptp_kbc_spindle_collector_mt(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($OBJECT_PRED)) {
                                                _csetf_tptp_kbc_object_pred(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($UNARY_FUNCTIONS)) {
                                                    _csetf_tptp_kbc_unary_functions(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($GEO_SPINDLE_HEAD_MT)) {
                                                        _csetf_tptp_kbc_geo_spindle_head_mt(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($GEO_SPINDLE_MEMBER_MTS)) {
                                                            _csetf_tptp_kbc_geo_spindle_member_mts(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($GEO_SPINDLE_COLLECTOR_MT)) {
                                                                _csetf_tptp_kbc_geo_spindle_collector_mt(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($GEO_COLLECTIONS)) {
                                                                    _csetf_tptp_kbc_geo_collections(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($GEO_REGIONS)) {
                                                                        _csetf_tptp_kbc_geo_regions(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($GEO_LOCATIONS)) {
                                                                            _csetf_tptp_kbc_geo_locations(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($INSTANCES)) {
                                                                                _csetf_tptp_kbc_instances(v_new, current_value);
                                                                            } else {
                                                                                Errors.error($str_alt64$Invalid_slot__S_for_construction_, current_arg);
                                                                            }














                }
            }
            return v_new;
        }
    }

    public static final SubLObject print_tptp_kb_content(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt65$_TPTP_KB_CONTENT___a__a__a__a____, new SubLObject[]{ tptp_kbc_col(v_object), tptp_kbc_part_types_pred(v_object), tptp_kbc_parts_pred(v_object), tptp_kbc_spindle_head_mt(v_object), tptp_kbc_object_pred(v_object), tptp_kbc_geo_spindle_head_mt(v_object), vector_utilities.first_aref(tptp_kbc_geo_collections(v_object)) });
        return v_object;
    }

    public static final SubLObject new_tptp_kb_content(SubLObject root_col, SubLObject part_types_pred, SubLObject parts_pred, SubLObject mt_plist, SubLObject object_pred, SubLObject unary_functions, SubLObject geo_mt_plist, SubLObject geo_plist, SubLObject v_instances) {
        {
            SubLObject head = getf(mt_plist, $HEAD, UNPROVIDED);
            SubLObject members = getf(mt_plist, $MEMBERS, UNPROVIDED);
            SubLObject collector = getf(mt_plist, $COLLECTOR, UNPROVIDED);
            SubLObject geo_head = getf(geo_mt_plist, $HEAD, UNPROVIDED);
            SubLObject geo_members = getf(geo_mt_plist, $MEMBERS, UNPROVIDED);
            SubLObject geo_collector = getf(geo_mt_plist, $COLLECTOR, UNPROVIDED);
            SubLObject geo_collections = getf(geo_plist, $COLLECTIONS, UNPROVIDED);
            SubLObject geo_regions = getf(geo_plist, $REGIONS, UNPROVIDED);
            SubLObject geo_locations = getf(geo_plist, $LOCATIONS, UNPROVIDED);
            SubLObject kb_content = make_tptp_kb_content(UNPROVIDED);
            _csetf_tptp_kbc_col(kb_content, root_col);
            _csetf_tptp_kbc_part_types_pred(kb_content, part_types_pred);
            _csetf_tptp_kbc_parts_pred(kb_content, parts_pred);
            _csetf_tptp_kbc_spindle_head_mt(kb_content, head);
            _csetf_tptp_kbc_spindle_member_mts(kb_content, members);
            _csetf_tptp_kbc_spindle_collector_mt(kb_content, collector);
            _csetf_tptp_kbc_object_pred(kb_content, object_pred);
            _csetf_tptp_kbc_unary_functions(kb_content, unary_functions);
            _csetf_tptp_kbc_geo_spindle_head_mt(kb_content, geo_head);
            _csetf_tptp_kbc_geo_spindle_member_mts(kb_content, geo_members);
            _csetf_tptp_kbc_geo_spindle_collector_mt(kb_content, geo_collector);
            _csetf_tptp_kbc_geo_collections(kb_content, geo_collections);
            _csetf_tptp_kbc_geo_regions(kb_content, geo_regions);
            _csetf_tptp_kbc_geo_locations(kb_content, geo_locations);
            _csetf_tptp_kbc_instances(kb_content, v_instances);
            return kb_content;
        }
    }

    public static final SubLObject tptp_kb_content_col(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_col(kb_content);
    }

    public static final SubLObject tptp_kb_content_part_types_pred(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_part_types_pred(kb_content);
    }

    public static final SubLObject tptp_kb_content_parts_pred(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_parts_pred(kb_content);
    }

    public static final SubLObject tptp_kb_content_spindle_head_mt(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_spindle_head_mt(kb_content);
    }

    public static final SubLObject tptp_kb_content_spindle_member_mts(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_spindle_member_mts(kb_content);
    }

    public static final SubLObject tptp_kb_content_spindle_collector_mt(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_spindle_collector_mt(kb_content);
    }

    public static final SubLObject tptp_kb_content_object_pred(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_object_pred(kb_content);
    }

    public static final SubLObject tptp_kb_content_unary_functions(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_unary_functions(kb_content);
    }

    public static final SubLObject tptp_kb_content_geo_spindle_head_mt(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_geo_spindle_head_mt(kb_content);
    }

    public static final SubLObject tptp_kb_content_geo_spindle_member_mts(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_geo_spindle_member_mts(kb_content);
    }

    public static final SubLObject tptp_kb_content_geo_spindle_collector_mt(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_geo_spindle_collector_mt(kb_content);
    }

    public static final SubLObject tptp_kb_content_geo_collections(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_geo_collections(kb_content);
    }

    public static final SubLObject tptp_kb_content_geo_regions(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_geo_regions(kb_content);
    }

    public static final SubLObject tptp_kb_content_geo_locations(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_geo_locations(kb_content);
    }

    public static final SubLObject tptp_kb_content_instances(SubLObject kb_content) {
        SubLSystemTrampolineFile.checkType(kb_content, TPTP_KB_CONTENT_P);
        return tptp_kbc_instances(kb_content);
    }

    public static final SubLObject tptp_kb_content_geo_regions_list(SubLObject kb_content) {
        return vector_utilities.f_3d_array_elements(tptp_kb_content_geo_regions(kb_content));
    }

    public static final SubLObject tptp_kb_content_geo_locations_list(SubLObject kb_content) {
        return vector_utilities.f_2d_array_elements(tptp_kb_content_geo_locations(kb_content));
    }





    public static final SubLObject ensure_all_synthetic_terms_initialized(SubLObject kb_content) {
        if ($all_synthetic_terms_kb_content$.getGlobalValue() == kb_content) {
            return NIL;
        } else {
            initialize_all_synthetic_terms(kb_content);
            return T;
        }
    }

    public static final SubLObject initialize_all_synthetic_terms(SubLObject kb_content) {
        {
            SubLObject list = all_synthetic_terms_list(kb_content);
            $all_synthetic_terms$.setGlobalValue(set_utilities.construct_set_from_list(list, symbol_function(EQ), UNPROVIDED));
            $all_synthetic_terms_kb_content$.setGlobalValue(kb_content);
            return $all_synthetic_terms$.getGlobalValue();
        }
    }

    public static final SubLObject all_synthetic_terms_set(SubLObject kb_content) {
        ensure_all_synthetic_terms_initialized(kb_content);
        return $all_synthetic_terms$.getGlobalValue();
    }

    public static final SubLObject synthetic_termP(SubLObject v_object) {
        return set.set_memberP(v_object, $all_synthetic_terms$.getGlobalValue());
    }

    public static final SubLObject all_synthetic_terms_list(SubLObject kb_content) {
        {
            SubLObject terms = NIL;
            {
                SubLObject items_var = genls.all_specs(tptp_kb_content_col(kb_content), UNPROVIDED, UNPROVIDED);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = genls.all_specs(tptp_kb_content_col(kb_content), UNPROVIDED, UNPROVIDED);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = genls.all_specs(tptp_kb_content_col(kb_content), UNPROVIDED, UNPROVIDED);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            {
                SubLObject items_var = genl_predicates.all_spec_predicates_and_inverses(tptp_kb_content_part_types_pred(kb_content), UNPROVIDED, UNPROVIDED);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = genl_predicates.all_spec_predicates_and_inverses(tptp_kb_content_part_types_pred(kb_content), UNPROVIDED, UNPROVIDED);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = genl_predicates.all_spec_predicates_and_inverses(tptp_kb_content_part_types_pred(kb_content), UNPROVIDED, UNPROVIDED);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            {
                SubLObject items_var = genl_predicates.all_spec_predicates_and_inverses(tptp_kb_content_parts_pred(kb_content), UNPROVIDED, UNPROVIDED);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = genl_predicates.all_spec_predicates_and_inverses(tptp_kb_content_parts_pred(kb_content), UNPROVIDED, UNPROVIDED);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = genl_predicates.all_spec_predicates_and_inverses(tptp_kb_content_parts_pred(kb_content), UNPROVIDED, UNPROVIDED);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            terms = cons(tptp_kb_content_spindle_head_mt(kb_content), terms);
            {
                SubLObject items_var = tptp_kb_content_spindle_member_mts(kb_content);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = tptp_kb_content_spindle_member_mts(kb_content);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = tptp_kb_content_spindle_member_mts(kb_content);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            terms = cons(tptp_kb_content_spindle_collector_mt(kb_content), terms);
            terms = cons(tptp_kb_content_object_pred(kb_content), terms);
            {
                SubLObject items_var = tptp_kb_content_unary_functions(kb_content);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = tptp_kb_content_unary_functions(kb_content);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = tptp_kb_content_unary_functions(kb_content);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            terms = cons(tptp_kb_content_geo_spindle_head_mt(kb_content), terms);
            {
                SubLObject items_var = tptp_kb_content_geo_spindle_member_mts(kb_content);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = tptp_kb_content_geo_spindle_member_mts(kb_content);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = tptp_kb_content_geo_spindle_member_mts(kb_content);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            terms = cons(tptp_kb_content_geo_spindle_collector_mt(kb_content), terms);
            {
                SubLObject items_var = tptp_kb_content_geo_collections(kb_content);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = tptp_kb_content_geo_collections(kb_content);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = tptp_kb_content_geo_collections(kb_content);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            {
                SubLObject items_var = tptp_kb_content_geo_regions_list(kb_content);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = tptp_kb_content_geo_regions_list(kb_content);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = tptp_kb_content_geo_regions_list(kb_content);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            {
                SubLObject items_var = tptp_kb_content_geo_locations_list(kb_content);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = tptp_kb_content_geo_locations_list(kb_content);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = tptp_kb_content_geo_locations_list(kb_content);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            {
                SubLObject items_var = tptp_kb_content_instances(kb_content);
                if (items_var.isVector()) {
                    {
                        SubLObject vector_var = tptp_kb_content_instances(kb_content);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject item = aref(vector_var, element_num);
                                terms = cons(item, terms);
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = tptp_kb_content_instances(kb_content);
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            terms = cons(item, terms);
                        }
                    }
                }
            }
            return nreverse(terms);
        }
    }

    public static final SubLObject kill_all_synthetic_terms(SubLObject kb_content) {
        {
            SubLObject set_contents_var = set.do_set_internal(all_synthetic_terms_set(kb_content));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                        cyc_kernel.cyc_kill(v_term);
                    }
                }
            }
        }
        return kb_content;
    }



    public static final SubLObject ensure_all_synthetic_gafs_initialized(SubLObject kb_content) {
        if (NIL != $all_synthetic_gafs$.getGlobalValue()) {
            return NIL;
        } else {
            initialize_all_synthetic_gafs(kb_content);
            return T;
        }
    }

    public static final SubLObject initialize_all_synthetic_gafs(SubLObject kb_content) {
        $all_synthetic_gafs$.setGlobalValue(set.new_set(symbol_function(EQ), UNPROVIDED));
        {
            SubLObject set_contents_var = set.do_set_internal(all_synthetic_terms_set(kb_content));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject v_term = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, v_term)) {
                        if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                        if (NIL != valid) {
                                            {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                    {
                                                        SubLObject done_var_1 = NIL;
                                                        SubLObject token_var_2 = NIL;
                                                        while (NIL == done_var_1) {
                                                            {
                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                SubLObject valid_3 = makeBoolean(token_var_2 != ass);
                                                                if (NIL != valid_3) {
                                                                    if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                                                        if (NIL != assertions_high.gaf_assertionP(ass)) {
                                                                            set.set_add(ass, $all_synthetic_gafs$.getGlobalValue());
                                                                        }
                                                                    }
                                                                }
                                                                done_var_1 = makeBoolean(NIL == valid_3);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                        try {
                                                            bind($is_thread_performing_cleanupP$, T);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        }
                    }
                }
            }
        }
        return $all_synthetic_gafs$.getGlobalValue();
    }

    public static final SubLObject all_synthetic_gafs(SubLObject kb_content) {
        ensure_all_synthetic_gafs_initialized(kb_content);
        return $all_synthetic_gafs$.getGlobalValue();
    }

    public static final SubLObject random_non_sbhl_synthetic_gaf(SubLObject kb_content) {
        {
            SubLObject result = NIL;
            while (NIL == result) {
                {
                    SubLObject gaf = random_synthetic_gaf(kb_content);
                    if (NIL != kb_utilities.non_sbhl_gafP(gaf)) {
                        result = gaf;
                    }
                }
            } 
            return result;
        }
    }

    public static final SubLObject random_synthetic_gaf(SubLObject kb_content) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $more_than_20_percent_of_the_kb_is_syntheticP$.getDynamicValue(thread)) {
                {
                    SubLObject synthetic_gaf = NIL;
                    while (NIL == synthetic_gaf) {
                        {
                            SubLObject gaf = assertions_high.random_gaf();
                            if (NIL != cycl_utilities.assertion_find_if($sym75$SYNTHETIC_TERM_, gaf, UNPROVIDED, UNPROVIDED)) {
                                synthetic_gaf = gaf;
                            }
                        }
                    } 
                    return synthetic_gaf;
                }
            } else {
                ensure_all_synthetic_gafs_initialized(kb_content);
                return set.set_random_element($all_synthetic_gafs$.getGlobalValue());
            }
        }
    }

    public static final SubLObject all_synthetic_chaff_forts(SubLObject kb_content, SubLObject justification_index) {
        return some_synthetic_chaff_forts(kb_content, justification_index, ONE_INTEGER);
    }

    /**
     *
     *
     * @param P
     * 		the probability that any given synthetic chaff fort will be returned
     */
    public static final SubLObject some_synthetic_chaff_forts(SubLObject kb_content, SubLObject justification_index, SubLObject p) {
        {
            SubLObject chaff = NIL;
            SubLObject set_contents_var = set.do_set_internal(all_synthetic_terms_set(kb_content));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject fort = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, fort)) {
                        if (NIL == dictionary.dictionary_lookup_without_values(justification_index, fort, UNPROVIDED)) {
                            if (NIL != number_utilities.true_with_probability(p)) {
                                chaff = cons(fort, chaff);
                            }
                        }
                    }
                }
            }
            return nreverse(chaff);
        }
    }

    public static final SubLObject all_synthetic_chaff_gafs(SubLObject kb_content, SubLObject justification_index) {
        return some_synthetic_chaff_gafs(kb_content, justification_index, ONE_INTEGER);
    }

    /**
     *
     *
     * @param P
     * 		the probability that any given chaff gaf will be returned
     */
    public static final SubLObject some_synthetic_chaff_gafs(SubLObject kb_content, SubLObject justification_index, SubLObject p) {
        return some_synthetic_chaff_gafs_not_mentioning(kb_content, justification_index, p, NIL);
    }

    public static final SubLObject some_synthetic_chaff_gafs_not_mentioning(SubLObject kb_content, SubLObject justification_index, SubLObject p, SubLObject fort_blacklist) {
        {
            SubLObject chaff = NIL;
            SubLObject fort_blacklist_set = set_utilities.construct_set_from_list(fort_blacklist, symbol_function(EQ), UNPROVIDED);
            SubLObject set_contents_var = set.do_set_internal(all_synthetic_gafs(kb_content));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject gaf = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, gaf)) {
                        if (NIL == dictionary.dictionary_lookup_without_values(justification_index, gaf, UNPROVIDED)) {
                            if (NIL == assertion_utilities.assertion_mentions_any_of_terms_in_setP(gaf, fort_blacklist_set)) {
                                if (NIL == assertion_utilities.assertion_mentions_any_of_terms_in_dictionary_keysP(gaf, justification_index)) {
                                    if (NIL != number_utilities.true_with_probability(p)) {
                                        chaff = cons(gaf, chaff);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(chaff);
        }
    }

    public static final SubLObject tptp_kb_content_as_plist(SubLObject kb_content) {
        {
            SubLObject plist = NIL;
            plist = putf(plist, $COL, tptp_kbc_col(kb_content));
            plist = putf(plist, $PART_TYPES_PRED, tptp_kbc_part_types_pred(kb_content));
            plist = putf(plist, $PARTS_PRED, tptp_kbc_parts_pred(kb_content));
            plist = putf(plist, $SPINDLE_HEAD_MT, tptp_kbc_spindle_head_mt(kb_content));
            plist = putf(plist, $SPINDLE_MEMBER_MTS, tptp_kbc_spindle_member_mts(kb_content));
            plist = putf(plist, $SPINDLE_COLLECTOR_MT, tptp_kbc_spindle_collector_mt(kb_content));
            plist = putf(plist, $OBJECT_PRED, tptp_kbc_object_pred(kb_content));
            plist = putf(plist, $UNARY_FUNCTIONS, tptp_kbc_unary_functions(kb_content));
            plist = putf(plist, $GEO_SPINDLE_HEAD_MT, tptp_kbc_geo_spindle_head_mt(kb_content));
            plist = putf(plist, $GEO_SPINDLE_MEMBER_MTS, tptp_kbc_geo_spindle_member_mts(kb_content));
            plist = putf(plist, $GEO_SPINDLE_COLLECTOR_MT, tptp_kbc_geo_spindle_collector_mt(kb_content));
            plist = putf(plist, $GEO_COLLECTIONS, tptp_kbc_geo_collections(kb_content));
            plist = putf(plist, $GEO_REGIONS, tptp_kbc_geo_regions(kb_content));
            plist = putf(plist, $GEO_LOCATIONS, tptp_kbc_geo_locations(kb_content));
            plist = putf(plist, $INSTANCES, tptp_kbc_instances(kb_content));
            return plist;
        }
    }

    public static final SubLObject tptp_kb_content_from_plist(SubLObject plist) {
        {
            SubLObject kb_content = make_tptp_kb_content(UNPROVIDED);
            _csetf_tptp_kbc_col(kb_content, getf(plist, $COL, UNPROVIDED));
            _csetf_tptp_kbc_part_types_pred(kb_content, getf(plist, $PART_TYPES_PRED, UNPROVIDED));
            _csetf_tptp_kbc_parts_pred(kb_content, getf(plist, $PARTS_PRED, UNPROVIDED));
            _csetf_tptp_kbc_spindle_head_mt(kb_content, getf(plist, $SPINDLE_HEAD_MT, UNPROVIDED));
            _csetf_tptp_kbc_spindle_member_mts(kb_content, getf(plist, $SPINDLE_MEMBER_MTS, UNPROVIDED));
            _csetf_tptp_kbc_spindle_collector_mt(kb_content, getf(plist, $SPINDLE_COLLECTOR_MT, UNPROVIDED));
            _csetf_tptp_kbc_object_pred(kb_content, getf(plist, $OBJECT_PRED, UNPROVIDED));
            _csetf_tptp_kbc_unary_functions(kb_content, getf(plist, $UNARY_FUNCTIONS, UNPROVIDED));
            _csetf_tptp_kbc_geo_spindle_head_mt(kb_content, getf(plist, $GEO_SPINDLE_HEAD_MT, UNPROVIDED));
            _csetf_tptp_kbc_geo_spindle_member_mts(kb_content, getf(plist, $GEO_SPINDLE_MEMBER_MTS, UNPROVIDED));
            _csetf_tptp_kbc_geo_spindle_collector_mt(kb_content, getf(plist, $GEO_SPINDLE_COLLECTOR_MT, UNPROVIDED));
            _csetf_tptp_kbc_geo_collections(kb_content, getf(plist, $GEO_COLLECTIONS, UNPROVIDED));
            _csetf_tptp_kbc_geo_regions(kb_content, getf(plist, $GEO_REGIONS, UNPROVIDED));
            _csetf_tptp_kbc_geo_locations(kb_content, getf(plist, $GEO_LOCATIONS, UNPROVIDED));
            _csetf_tptp_kbc_instances(kb_content, getf(plist, $INSTANCES, UNPROVIDED));
            return kb_content;
        }
    }

    public static final SubLObject tptp_generate_synthetic_kb_content() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject root_col = generate_synthetic_collection_hierarchy($$Individual, $str_alt77$TPTPCol_, TWO_INTEGER, $tptp_collection_depth$.getDynamicValue(thread), T, $$FirstOrderCollection, $tptp_high_mt$.getDynamicValue(thread));
                SubLObject part_types_pred = generate_synthetic_predicate_hierarchy($$partTypes, $str_alt80$tptpTypes_, TWO_INTEGER, $tptp_predicate_depth$.getDynamicValue(thread), $float$0_15, TWO_INTEGER, $list_alt82, $tptp_high_mt$.getDynamicValue(thread));
                add_synthetic_arg_genls(part_types_pred, ONE_INTEGER, $$Individual, $tptp_high_mt$.getDynamicValue(thread));
                add_synthetic_arg_genls(part_types_pred, TWO_INTEGER, root_col, $tptp_high_mt$.getDynamicValue(thread));
                {
                    SubLObject parts_pred = generate_instance_level_analogue_preds(part_types_pred, $$parts, $str_alt84$tptp_, $tptp_high_mt$.getDynamicValue(thread));
                    SubLObject mt_plist = tptp_generate_mt_spindle($tptp_low_mt$.getDynamicValue(thread), $tptp_mt_spindle_member_count$.getDynamicValue(thread), $$$TPTP);
                    SubLObject part_types_assertion_mt_distribution = construct_part_types_proxy_assertion_mt_probability_distribution(mt_plist);
                    generate_part_types_proxy_assertions(part_types_pred, part_types_assertion_mt_distribution, $tptp_part_types_assertion_count$.getDynamicValue(thread));
                    {
                        SubLObject synthetic_instances = generate_synthetic_instances(part_types_pred, part_types_assertion_mt_distribution, $tptp_synthetic_instance_count$.getDynamicValue(thread));
                        thread.resetMultipleValues();
                        {
                            SubLObject object_pred = tptp_generate_object_quantity_kb_content(mt_plist);
                            SubLObject unary_functions = thread.secondMultipleValue();
                            SubLObject more_synthetic_instances = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject items_var = more_synthetic_instances;
                                if (items_var.isVector()) {
                                    {
                                        SubLObject vector_var = more_synthetic_instances;
                                        SubLObject backwardP_var = NIL;
                                        SubLObject length = length(vector_var);
                                        SubLObject v_iteration = NIL;
                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            {
                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                SubLObject item = aref(vector_var, element_num);
                                                synthetic_instances = cons(item, synthetic_instances);
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject cdolist_list_var = more_synthetic_instances;
                                        SubLObject item = NIL;
                                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                            synthetic_instances = cons(item, synthetic_instances);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject tptp_geo_continent_count = multiply($tptp_geo_x_width$.getDynamicValue(thread), $tptp_geo_y_width$.getDynamicValue(thread));
                                thread.resetMultipleValues();
                                {
                                    SubLObject geo_mt_plist = tptp_generate_mt_spindle_and_geo_proxy($tptp_geo_mt$.getDynamicValue(thread), tptp_geo_continent_count, $$$TPTPGeo, $tptp_geo_levels$.getDynamicValue(thread));
                                    SubLObject geo_plist = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject kb_content = new_tptp_kb_content(root_col, part_types_pred, parts_pred, mt_plist, object_pred, unary_functions, geo_mt_plist, geo_plist, synthetic_instances);
                                        initialize_all_synthetic_terms(kb_content);
                                        return kb_content;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject tptp_generate_object_quantity_kb_content(SubLObject mt_plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject object_quantity_assertion_mt_distribution = construct_object_quantity_assertion_mt_probability_distribution(mt_plist);
                SubLObject quantity_col = tptp_create_quantity_col($$$TPTPQuantity, $tptp_high_mt$.getDynamicValue(thread));
                SubLObject object_pred = tptp_create_object_pred($$$tptpOfObject, $tptp_object_quantity_col$.getDynamicValue(thread), quantity_col, $tptp_high_mt$.getDynamicValue(thread));
                SubLObject unary_functions = tptp_generate_unary_functions($$$TPTPQuantityFn, quantity_col, $tptp_unary_function_count$.getDynamicValue(thread), $tptp_high_mt$.getDynamicValue(thread));
                SubLObject v_instances = NIL;
                generate_relation_all_instance_object_quantity_assertions(object_pred, unary_functions, object_quantity_assertion_mt_distribution, $tptp_type_level_object_quantity_assertion_count$.getDynamicValue(thread));
                if (isa.count_all_instances($tptp_object_quantity_col$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).numL(multiply(TEN_INTEGER, $tptp_instance_level_object_quantity_assertion_count$.getDynamicValue(thread)))) {
                    v_instances = tptp_generate_instances($tptp_object_quantity_col$.getDynamicValue(thread), $$$TPTP, object_quantity_assertion_mt_distribution, $tptp_instance_level_object_quantity_assertion_count$.getDynamicValue(thread));
                }
                generate_instance_level_object_quantity_assertions(object_pred, unary_functions, object_quantity_assertion_mt_distribution, $tptp_instance_level_object_quantity_assertion_count$.getDynamicValue(thread));
                return values(object_pred, unary_functions, v_instances);
            }
        }
    }

    public static final SubLObject tptp_generate_mt_spindle_and_geo_proxy(SubLObject genl_mt, SubLObject n, SubLObject prefix, SubLObject levels) {
        {
            SubLObject mt_plist = tptp_generate_mt_spindle(genl_mt, n, prefix);
            SubLObject head = getf(mt_plist, $HEAD, UNPROVIDED);
            SubLObject members = getf(mt_plist, $MEMBERS, UNPROVIDED);
            return values(mt_plist, tptp_generate_geo_proxy(list($LEVELS, levels, $HIGH_MT, genl_mt, $MEDIUM_MT, head, $LOW_MTS, members)));
        }
    }

    // defparameter
    private static final SubLSymbol $generate_synthetic_collection_hierarchy_counter$ = makeSymbol("*GENERATE-SYNTHETIC-COLLECTION-HIERARCHY-COUNTER*");

    public static final SubLObject generate_synthetic_collection_hierarchy(SubLObject root_col, SubLObject prefix, SubLObject branching_factor, SubLObject depth, SubLObject disjoint_specsP, SubLObject type, SubLObject mt) {
        if (prefix == UNPROVIDED) {
            prefix = $str_alt94$Col_;
        }
        if (branching_factor == UNPROVIDED) {
            branching_factor = TWO_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = EIGHT_INTEGER;
        }
        if (disjoint_specsP == UNPROVIDED) {
            disjoint_specsP = T;
        }
        if (type == UNPROVIDED) {
            type = $$Collection;
        }
        if (mt == UNPROVIDED) {
            mt = $tptp_high_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $generate_synthetic_collection_hierarchy_counter$.currentBinding(thread);
                    try {
                        $generate_synthetic_collection_hierarchy_counter$.bind(ZERO_INTEGER, thread);
                        {
                            SubLObject total = number_utilities.f_1_(expt(branching_factor, number_utilities.f_1X(depth)));
                            {
                                SubLObject _prev_bind_0_4 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble($$$Generating_synthetic_collections);
                                    result = generate_synthetic_collection_hierarchy_recursive(root_col, prefix, branching_factor, depth, depth, total, disjoint_specsP, type, mt);
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                        }
                    } finally {
                        $generate_synthetic_collection_hierarchy_counter$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject generate_synthetic_collection_hierarchy_recursive(SubLObject genl, SubLObject prefix, SubLObject branching_factor, SubLObject depth, SubLObject max_depth, SubLObject total, SubLObject disjoint_specsP, SubLObject type, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject name = cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.str(subtract(max_depth, depth))), $str_alt97$_, format_nil.format_nil_a_no_copy(string_utilities.str($generate_synthetic_collection_hierarchy_counter$.getDynamicValue(thread))) });
                SubLObject col = cyc_kernel.cyc_create_new_ephemeral(name);
                utilities_macros.note_percent_progress($generate_synthetic_collection_hierarchy_counter$.getDynamicValue(thread), total);
                $generate_synthetic_collection_hierarchy_counter$.setDynamicValue(add($generate_synthetic_collection_hierarchy_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
                tptp_assert_naked_wff(list($$isa, col, type), mt, UNPROVIDED);
                tptp_assert_naked_wff(list($$genls, col, genl), mt, UNPROVIDED);
                if (depth.isPositive()) {
                    {
                        SubLObject specs = NIL;
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(branching_factor); i = add(i, ONE_INTEGER)) {
                            specs = cons(generate_synthetic_collection_hierarchy_recursive(col, prefix, branching_factor, number_utilities.f_1_(depth), max_depth, total, disjoint_specsP, type, mt), specs);
                        }
                        specs = nreverse(specs);
                        if (NIL != disjoint_specsP) {
                            {
                                SubLObject rest_of_specs = NIL;
                                for (rest_of_specs = specs; !rest_of_specs.isAtom(); rest_of_specs = rest_of_specs.rest()) {
                                    {
                                        SubLObject spec_1 = rest_of_specs.first();
                                        SubLObject cdolist_list_var = rest_of_specs.rest();
                                        SubLObject spec_2 = NIL;
                                        for (spec_2 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_2 = cdolist_list_var.first()) {
                                            tptp_assert_naked_wff(list($$disjointWith, spec_1, spec_2), mt, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return col;
            }
        }
    }

    // defparameter
    private static final SubLSymbol $generate_synthetic_predicate_hierarchy_counter$ = makeSymbol("*GENERATE-SYNTHETIC-PREDICATE-HIERARCHY-COUNTER*");

    public static final SubLObject generate_synthetic_predicate_hierarchy(SubLObject root_pred, SubLObject prefix, SubLObject branching_factor, SubLObject depth, SubLObject genl_inverse_probability, SubLObject v_arity, SubLObject arg_isas, SubLObject mt) {
        if (prefix == UNPROVIDED) {
            prefix = $str_alt101$pred_;
        }
        if (branching_factor == UNPROVIDED) {
            branching_factor = TWO_INTEGER;
        }
        if (depth == UNPROVIDED) {
            depth = THREE_INTEGER;
        }
        if (genl_inverse_probability == UNPROVIDED) {
            genl_inverse_probability = ZERO_INTEGER;
        }
        if (v_arity == UNPROVIDED) {
            v_arity = TWO_INTEGER;
        }
        if (arg_isas == UNPROVIDED) {
            arg_isas = $list_alt102;
        }
        if (mt == UNPROVIDED) {
            mt = $tptp_high_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == list_utilities.lengthE(arg_isas, v_arity, UNPROVIDED)) {
                    Errors.error($str_alt103$Arity__a_predicate_must_have__a_a, v_arity, v_arity, arg_isas);
                }
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $generate_synthetic_predicate_hierarchy_counter$.currentBinding(thread);
                    try {
                        $generate_synthetic_predicate_hierarchy_counter$.bind(ZERO_INTEGER, thread);
                        {
                            SubLObject total = number_utilities.f_1_(expt(branching_factor, number_utilities.f_1X(depth)));
                            {
                                SubLObject _prev_bind_0_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble($$$Generating_synthetic_predicates);
                                    result = generate_synthetic_predicate_hierarchy_recursive(root_pred, prefix, branching_factor, depth, depth, total, genl_inverse_probability, v_arity, arg_isas, mt);
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                        }
                    } finally {
                        $generate_synthetic_predicate_hierarchy_counter$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject generate_synthetic_predicate_hierarchy_recursive(SubLObject genl_pred, SubLObject prefix, SubLObject branching_factor, SubLObject depth, SubLObject max_depth, SubLObject total, SubLObject genl_inverse_probability, SubLObject v_arity, SubLObject arg_isas, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject name = cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[]{ format_nil.format_nil_a_no_copy(string_utilities.str(subtract(max_depth, depth))), $str_alt97$_, format_nil.format_nil_a_no_copy(string_utilities.str($generate_synthetic_predicate_hierarchy_counter$.getDynamicValue(thread))) });
                SubLObject pred = cyc_kernel.cyc_create_new_ephemeral(name);
                utilities_macros.note_percent_progress($generate_synthetic_predicate_hierarchy_counter$.getDynamicValue(thread), total);
                $generate_synthetic_predicate_hierarchy_counter$.setDynamicValue(add($generate_synthetic_predicate_hierarchy_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
                {
                    SubLObject predicate_type = kb_utilities.predicate_type_for_arity(v_arity);
                    tptp_assert_wff(list($$isa, pred, predicate_type), mt, UNPROVIDED);
                }
                {
                    SubLObject genl_inverseP = makeBoolean(TWO_INTEGER.numE(v_arity) && ($generate_synthetic_predicate_hierarchy_counter$.getDynamicValue(thread).numE(number_utilities.f_1_(expt(branching_factor, number_utilities.f_1X(max_depth)))) || (NIL != number_utilities.true_with_probability(genl_inverse_probability))));
                    if (NIL != genl_inverseP) {
                        arg_isas = reverse(arg_isas);
                        tptp_assert_naked_wff(list($$genlInverse, pred, genl_pred), mt, UNPROVIDED);
                    } else {
                        tptp_assert_naked_wff(list($$genlPreds, pred, genl_pred), mt, UNPROVIDED);
                    }
                }
                {
                    SubLObject list_var = NIL;
                    SubLObject col = NIL;
                    SubLObject i = NIL;
                    for (list_var = arg_isas, col = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , col = list_var.first() , i = add(ONE_INTEGER, i)) {
                        tptp_assert_wff(list($$argIsa, pred, number_utilities.f_1X(i), col), mt, UNPROVIDED);
                    }
                }
                if (depth.isPositive()) {
                    {
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(branching_factor); i = add(i, ONE_INTEGER)) {
                            generate_synthetic_predicate_hierarchy_recursive(pred, prefix, branching_factor, number_utilities.f_1_(depth), max_depth, total, genl_inverse_probability, v_arity, arg_isas, mt);
                        }
                    }
                }
                return pred;
            }
        }
    }

    // defparameter
    private static final SubLSymbol $tptp_synthetic_arg_genls_counter$ = makeSymbol("*TPTP-SYNTHETIC-ARG-GENLS-COUNTER*");

    public static final SubLObject add_synthetic_arg_genls(SubLObject root_pred, SubLObject argnum, SubLObject root_col, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $tptp_synthetic_arg_genls_counter$.currentBinding(thread);
                    try {
                        $tptp_synthetic_arg_genls_counter$.bind(ZERO_INTEGER, thread);
                        {
                            SubLObject total = genl_predicates.count_all_spec_predicates_and_inverses(root_pred, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_6 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble(cconcatenate($str_alt108$Adding_synthetic_argGenl_assertio, format_nil.format_nil_a_no_copy(argnum)));
                                    result = add_synthetic_arg_genls_recursive(root_pred, argnum, root_col, mt, total);
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_6, thread);
                                }
                            }
                        }
                    } finally {
                        $tptp_synthetic_arg_genls_counter$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject add_synthetic_arg_genls_recursive(SubLObject pred, SubLObject argnum, SubLObject col, SubLObject mt, SubLObject total) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            utilities_macros.note_percent_progress($tptp_synthetic_arg_genls_counter$.getDynamicValue(thread), total);
            $tptp_synthetic_arg_genls_counter$.setDynamicValue(add($tptp_synthetic_arg_genls_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
            tptp_assert_wff(list($$argGenl, pred, argnum, col), mt, UNPROVIDED);
            {
                SubLObject cdolist_list_var = genl_predicates.spec_predicates(pred, UNPROVIDED, UNPROVIDED);
                SubLObject spec_pred = NIL;
                for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                    add_synthetic_arg_genls_recursive_int(pred, spec_pred, NIL, argnum, col, mt, total);
                }
            }
            {
                SubLObject cdolist_list_var = genl_predicates.spec_inverses(pred, UNPROVIDED, UNPROVIDED);
                SubLObject spec_inverse = NIL;
                for (spec_inverse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_inverse = cdolist_list_var.first()) {
                    add_synthetic_arg_genls_recursive_int(pred, spec_inverse, T, argnum, col, mt, total);
                }
            }
            return pred;
        }
    }

    public static final SubLObject add_synthetic_arg_genls_recursive_int(SubLObject pred, SubLObject spec_pred, SubLObject inverseP, SubLObject argnum, SubLObject col, SubLObject mt, SubLObject total) {
        {
            SubLObject new_argnum = (NIL != inverseP) ? ((SubLObject) (kb_accessors.inverse_argnum(argnum))) : argnum;
            SubLObject new_col = select_a_spec_for_synthetic_arg_genl(col);
            add_synthetic_arg_genls_recursive(spec_pred, new_argnum, new_col, mt, total);
        }
        return pred;
    }

    public static final SubLObject select_a_spec_for_synthetic_arg_genl(SubLObject col) {
        {
            SubLObject candidate_specs = cons(col, list_utilities.first_n(FIVE_INTEGER, Sort.sort(copy_list(genls.specs(col, UNPROVIDED, UNPROVIDED)), symbol_function($sym110$_), SPEC_CARDINALITY)));
            return list_utilities.random_element(candidate_specs);
        }
    }

    // defparameter
    private static final SubLSymbol $tptp_instance_level_analogue_counter$ = makeSymbol("*TPTP-INSTANCE-LEVEL-ANALOGUE-COUNTER*");

    public static final SubLObject generate_instance_level_analogue_preds(SubLObject part_types_pred, SubLObject root_instance_level_pred, SubLObject prefix, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject top_level_pred = NIL;
                {
                    SubLObject _prev_bind_0 = $tptp_instance_level_analogue_counter$.currentBinding(thread);
                    try {
                        $tptp_instance_level_analogue_counter$.bind(ZERO_INTEGER, thread);
                        {
                            SubLObject total = genl_predicates.count_all_spec_predicates_and_inverses(part_types_pred, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_7 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                try {
                                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                    utilities_macros.noting_percent_progress_preamble($str_alt112$Generating_instance_level_analogu);
                                    top_level_pred = generate_instance_level_analogue_preds_recursive(part_types_pred, prefix, ZERO_INTEGER, NIL, mt, total);
                                    utilities_macros.noting_percent_progress_postamble();
                                } finally {
                                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                        }
                    } finally {
                        $tptp_instance_level_analogue_counter$.rebind(_prev_bind_0, thread);
                    }
                }
                tptp_assert_naked_wff(list($$genlPreds, top_level_pred, root_instance_level_pred), mt, UNPROVIDED);
                return top_level_pred;
            }
        }
    }

    public static final SubLObject generate_instance_level_analogue_preds_recursive(SubLObject type_pred, SubLObject prefix, SubLObject depth, SubLObject inverseP, SubLObject mt, SubLObject total) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            utilities_macros.note_percent_progress($tptp_instance_level_analogue_counter$.getDynamicValue(thread), total);
            $tptp_instance_level_analogue_counter$.setDynamicValue(add($tptp_instance_level_analogue_counter$.getDynamicValue(thread), ONE_INTEGER), thread);
            {
                SubLObject name = cconcatenate(format_nil.format_nil_a_no_copy(prefix), format_nil.format_nil_a_no_copy(depth));
                SubLObject pred = cyc_kernel.cyc_create_new_ephemeral(name);
                {
                    SubLObject cdolist_list_var = isa.isa(type_pred, UNPROVIDED, UNPROVIDED);
                    SubLObject col = NIL;
                    for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                        tptp_assert_wff(list($$isa, pred, col), mt, UNPROVIDED);
                    }
                }
                {
                    SubLObject cdotimes_end_var = arity.arity(type_pred);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject argnum = number_utilities.f_1X(i);
                            SubLObject cdolist_list_var = kb_accessors.argn_genl(type_pred, argnum, UNPROVIDED);
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                tptp_assert_wff(list($$argIsa, pred, argnum, col), mt, UNPROVIDED);
                            }
                        }
                    }
                }
                if (TWO_INTEGER.numE(arity.arity(type_pred))) {
                    {
                        SubLObject rule = (NIL != inverseP) ? ((SubLObject) (list($$implies, bq_cons(type_pred, $list_alt114), listS($$relationExistsAll, pred, $list_alt114)))) : list($$implies, bq_cons(type_pred, $list_alt114), listS($$relationAllExists, pred, $list_alt114));
                        tptp_assert_wff(rule, mt, UNPROVIDED);
                        tptp_assert_wff(list($$pragmaticRequirement, list($$assertedSentence, bq_cons(type_pred, $list_alt114)), rule), mt, UNPROVIDED);
                        tptp_assert_wff(rule, mt, $list_alt119);
                    }
                }
                {
                    SubLObject cdolist_list_var = genl_predicates.spec_predicates(type_pred, UNPROVIDED, UNPROVIDED);
                    SubLObject spec_type_pred = NIL;
                    for (spec_type_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_type_pred = cdolist_list_var.first()) {
                        {
                            SubLObject spec_pred = generate_instance_level_analogue_preds_recursive(spec_type_pred, prefix, number_utilities.f_1X(depth), inverseP, mt, total);
                            tptp_assert_naked_wff(list($$genlPreds, spec_pred, pred), mt, UNPROVIDED);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = genl_predicates.spec_inverses(type_pred, UNPROVIDED, UNPROVIDED);
                    SubLObject spec_type_inverse = NIL;
                    for (spec_type_inverse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_type_inverse = cdolist_list_var.first()) {
                        {
                            SubLObject spec_inverse = generate_instance_level_analogue_preds_recursive(spec_type_inverse, prefix, number_utilities.f_1X(depth), makeBoolean(NIL == inverseP), mt, total);
                            tptp_assert_naked_wff(list($$genlInverse, spec_inverse, pred), mt, UNPROVIDED);
                        }
                    }
                }
                return pred;
            }
        }
    }

    /**
     * Create a microtheory spindle with SIZE members under MT.
     * PREFIX is the constant name prefix that will will be used for all created mts.
     *
     * @return plist-p where
    :HEAD      = the spindle head mt
    :MEMBERS   = a list of the spindle member mts
    :COLLECTOR = the spindle collector mt
     */
    public static final SubLObject tptp_generate_mt_spindle(SubLObject mt, SubLObject size, SubLObject prefix) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(mt, HLMT_P);
            SubLSystemTrampolineFile.checkType(size, POSITIVE_INTEGER_P);
            SubLSystemTrampolineFile.checkType(prefix, VALID_CONSTANT_NAME_P);
            {
                SubLObject head_name = cconcatenate(format_nil.format_nil_a_no_copy(prefix), $str_alt123$_SpindleHeadMt);
                SubLObject collector_name = cconcatenate(format_nil.format_nil_a_no_copy(prefix), $str_alt124$_SpindleCollectorMt);
                SubLObject head_mt = tptp_create_mt(head_name);
                SubLObject collector_mt = tptp_create_mt(collector_name);
                SubLObject spindle_members = NIL;
                tptp_assert_naked_wff(list($$genlMt, head_mt, mt), $$UniversalVocabularyMt, $list_alt126);
                utilities_macros.$progress_note$.setDynamicValue($$$Generating_mt_spindle, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(size, thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject member_name = cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[]{ $str_alt128$_Member, format_nil.format_nil_a_no_copy(i), $str_alt129$_Mt });
                                    SubLObject spindle_member = tptp_create_mt(member_name);
                                    tptp_assert_naked_wff(list($$genlMt, spindle_member, head_mt), $$UniversalVocabularyMt, $list_alt126);
                                    tptp_assert_naked_wff(list($$genlMt, collector_mt, spindle_member), $$UniversalVocabularyMt, $list_alt126);
                                    spindle_members = cons(spindle_member, spindle_members);
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                spindle_members = nreverse(spindle_members);
                return list($HEAD, head_mt, $MEMBERS, spindle_members, $COLLECTOR, collector_mt);
            }
        }
    }

    public static final SubLObject tptp_create_mt(SubLObject name) {
        {
            SubLObject mt = cyc_kernel.cyc_create_new_ephemeral(name);
            tptp_assert_wff(listS($$isa, mt, $list_alt130), $$UniversalVocabularyMt, $list_alt126);
            return mt;
        }
    }

    public static final SubLObject construct_part_types_proxy_assertion_mt_probability_distribution(SubLObject mt_plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_spindle_head = getf(mt_plist, $HEAD, UNPROVIDED);
                SubLObject mt_spindle_members = getf(mt_plist, $MEMBERS, UNPROVIDED);
                SubLObject spindle_member_probability = divide($float$0_3, length(mt_spindle_members));
                SubLObject spindle_member_distribution = NIL;
                SubLObject cdolist_list_var = mt_spindle_members;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    spindle_member_distribution = cons(mt, spindle_member_distribution);
                    spindle_member_distribution = cons(spindle_member_probability, spindle_member_distribution);
                }
                spindle_member_distribution = nreverse(spindle_member_distribution);
                return append(list($tptp_high_mt$.getDynamicValue(thread), $float$0_3, $tptp_medium_mt$.getDynamicValue(thread), $float$0_15, $tptp_low_mt$.getDynamicValue(thread), $float$0_15, mt_spindle_head, $float$0_1), spindle_member_distribution);
            }
        }
    }

    public static final SubLObject generate_part_types_proxy_assertions(SubLObject part_types_pred, SubLObject mt_distribution, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt133$Generating_partTypes_proxy_assert);
                        {
                            SubLObject spec_type_preds = genl_predicates.all_spec_predicates_and_inverses(part_types_pred, UNPROVIDED, UNPROVIDED);
                            while (!count.numE(n)) {
                                {
                                    SubLObject spec_type_pred = list_utilities.random_element(spec_type_preds);
                                    SubLObject arg1 = genls.random_spec_of(kb_accessors.arg1_genl(spec_type_pred, UNPROVIDED).first(), UNPROVIDED);
                                    if (NIL != arg1) {
                                        {
                                            SubLObject arg2 = genls.random_spec_of(kb_accessors.arg2_genl(spec_type_pred, UNPROVIDED).first(), UNPROVIDED);
                                            if (NIL != arg2) {
                                                {
                                                    SubLObject sentence = list(spec_type_pred, arg1, arg2);
                                                    SubLObject mt = number_utilities.probability_distribution_sample(mt_distribution);
                                                    if (NIL != tptp_assert(sentence, mt, UNPROVIDED)) {
                                                        count = add(count, ONE_INTEGER);
                                                        utilities_macros.note_percent_progress(count, n);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } 
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    /**
     * Generates synthetic instances, about half of which are instances of the argGenl of some specPred/Inverse of PART-TYPES-PRED,
     * and about half of which are instances of some random collection.  #$isa assertions are asserted
     */
    public static final SubLObject generate_synthetic_instances(SubLObject part_types_pred, SubLObject mt_distribution, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject v_instances = NIL;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($$$Generating_synthetic_instances);
                        while (!count.numE(n)) {
                            {
                                SubLObject col = (NIL != number_utilities.coin_flip()) ? ((SubLObject) (fort_types_interface.random_collection())) : random_arg_genl_of_spec_pred_or_inverse_of(part_types_pred);
                                if (NIL == term.fast_skolem_nartP(col)) {
                                    {
                                        SubLObject anects = at_utilities.min_anects(col, UNPROVIDED);
                                        SubLObject ins = tptp_generate_instance(col, anects, $$$TPTP, mt_distribution);
                                        if (NIL != ins) {
                                            v_instances = cons(ins, v_instances);
                                            count = add(count, ONE_INTEGER);
                                            utilities_macros.note_percent_progress(count, n);
                                        }
                                    }
                                }
                            }
                        } 
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(v_instances);
            }
        }
    }

    public static final SubLObject random_arg_genl_of_spec_pred_or_inverse_of(SubLObject part_types_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject spec_pred = genl_predicates.random_spec_predicate_or_inverse_of(part_types_pred, UNPROVIDED, UNPROVIDED);
                            SubLObject argnum = (NIL != number_utilities.coin_flip()) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
                            SubLObject col = list_utilities.random_element(kb_accessors.argn_genl(spec_pred, argnum, UNPROVIDED));
                            result = col;
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject tptp_generate_instances(SubLObject col, SubLObject prefix, SubLObject mt_distribution, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject v_instances = NIL;
                SubLObject anects = at_utilities.min_anects(col, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(cconcatenate($str_alt137$Generating_instances_of_, format_nil.format_nil_a_no_copy(col)));
                        while (!count.numE(n)) {
                            {
                                SubLObject ins = tptp_generate_instance(col, anects, prefix, mt_distribution);
                                if (NIL != ins) {
                                    v_instances = cons(ins, v_instances);
                                    count = add(count, ONE_INTEGER);
                                    utilities_macros.note_percent_progress(count, n);
                                }
                            }
                        } 
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(v_instances);
            }
        }
    }

    public static final SubLObject tptp_generate_instance(SubLObject col, SubLObject anects, SubLObject prefix, SubLObject mt_distribution) {
        {
            SubLObject spec = genls.random_spec_of(col, UNPROVIDED);
            SubLObject mt = number_utilities.probability_distribution_sample(mt_distribution);
            SubLObject name = cconcatenate(format_nil.format_nil_a_no_copy(prefix), format_nil.format_nil_a_no_copy(string_utilities.make_valid_constant_name(string_utilities.str(spec), UNPROVIDED)));
            SubLObject ins = cyc_kernel.cyc_create_new_ephemeral(name);
            SubLObject anect_successP = T;
            if (mt != mt_vars.$anect_mt$.getGlobalValue()) {
                {
                    SubLObject cdolist_list_var = anects;
                    SubLObject anect = NIL;
                    for (anect = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , anect = cdolist_list_var.first()) {
                        if (NIL == tptp_assert(list($$isa, ins, anect), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED)) {
                            anect_successP = NIL;
                        }
                    }
                }
            }
            if (NIL != anect_successP) {
                if (NIL != tptp_assert(list($$isa, ins, spec), mt, UNPROVIDED)) {
                    return ins;
                }
            }
        }
        return NIL;
    }

    /**
     * This one is weighted lower than the type/instance pred distribution.
     */
    public static final SubLObject construct_object_quantity_assertion_mt_probability_distribution(SubLObject mt_plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mt_spindle_head = getf(mt_plist, $HEAD, UNPROVIDED);
                SubLObject mt_spindle_members = getf(mt_plist, $MEMBERS, UNPROVIDED);
                SubLObject spindle_member_probability = divide($float$0_5, length(mt_spindle_members));
                SubLObject spindle_member_distribution = NIL;
                SubLObject cdolist_list_var = mt_spindle_members;
                SubLObject mt = NIL;
                for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                    spindle_member_distribution = cons(mt, spindle_member_distribution);
                    spindle_member_distribution = cons(spindle_member_probability, spindle_member_distribution);
                }
                spindle_member_distribution = nreverse(spindle_member_distribution);
                return append(list($tptp_medium_mt$.getDynamicValue(thread), $float$0_2, $tptp_low_mt$.getDynamicValue(thread), $float$0_2, mt_spindle_head, $float$0_1), spindle_member_distribution);
            }
        }
    }

    public static final SubLObject tptp_create_object_pred(SubLObject name, SubLObject arg1_isa, SubLObject arg2_isa, SubLObject mt) {
        {
            SubLObject pred = cyc_kernel.cyc_create_new_ephemeral(name);
            tptp_assert_wff(listS($$isa, pred, $list_alt140), mt, UNPROVIDED);
            tptp_assert_wff(list($$arg1Isa, pred, arg1_isa), mt, UNPROVIDED);
            tptp_assert_wff(list($$arg2Isa, pred, arg2_isa), mt, UNPROVIDED);
            return pred;
        }
    }

    public static final SubLObject tptp_create_quantity_col(SubLObject name, SubLObject mt) {
        {
            SubLObject col = cyc_kernel.cyc_create_new_ephemeral(name);
            tptp_assert_wff(listS($$isa, col, $list_alt143), mt, UNPROVIDED);
            tptp_assert_wff(listS($$genls, col, $list_alt144), mt, UNPROVIDED);
            return col;
        }
    }

    public static final SubLObject tptp_generate_unary_functions(SubLObject prefix, SubLObject result_isa, SubLObject n, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                utilities_macros.$progress_note$.setDynamicValue($$$Generating_unary_functions, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(n, thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject name = cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[]{ $str_alt97$_, format_nil.format_nil_a_no_copy(i) });
                                    SubLObject func = cyc_kernel.cyc_create_new_ephemeral(name);
                                    tptp_assert_wff(listS($$isa, func, $list_alt146), mt, UNPROVIDED);
                                    tptp_assert_wff(listS($$arg1QuotedIsa, func, $list_alt148), mt, UNPROVIDED);
                                    if (NIL != result_isa) {
                                        tptp_assert_wff(list($$resultIsa, func, result_isa), mt, UNPROVIDED);
                                    }
                                    result = cons(func, result);
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject generate_relation_all_instance_object_quantity_assertions(SubLObject object_pred, SubLObject unary_functions, SubLObject mt_distribution, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(cconcatenate($str_alt150$Generating___relationAllInstance_, new SubLObject[]{ format_nil.format_nil_a_no_copy(object_pred), $str_alt151$_assertions }));
                        {
                            SubLObject arg1_isa = kb_accessors.arg1_isa(object_pred, UNPROVIDED).first();
                            while (!count.numE(n)) {
                                {
                                    SubLObject arg1 = genls.random_spec_of(arg1_isa, UNPROVIDED);
                                    SubLObject v_int = random.random($int$1000);
                                    SubLObject func = list_utilities.random_element(unary_functions);
                                    SubLObject arg2 = list(func, v_int);
                                    SubLObject mt = number_utilities.probability_distribution_sample(mt_distribution);
                                    if (NIL != tptp_assert(list($$relationAllInstance, object_pred, arg1, arg2), mt, UNPROVIDED)) {
                                        count = add(count, ONE_INTEGER);
                                        utilities_macros.note_percent_progress(count, n);
                                    }
                                }
                            } 
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static final SubLObject generate_instance_level_object_quantity_assertions(SubLObject object_pred, SubLObject unary_functions, SubLObject mt_distribution, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(cconcatenate($str_alt154$Generating_instance_level_, new SubLObject[]{ format_nil.format_nil_a_no_copy(object_pred), $str_alt151$_assertions }));
                        {
                            SubLObject arg1_isa = kb_accessors.arg1_isa(object_pred, UNPROVIDED).first();
                            while (!count.numE(n)) {
                                {
                                    SubLObject arg1 = random_non_skolem_instance_of(arg1_isa);
                                    SubLObject v_int = random.random($int$1000);
                                    SubLObject func = list_utilities.random_element(unary_functions);
                                    SubLObject arg2 = list(func, v_int);
                                    SubLObject mt = number_utilities.probability_distribution_sample(mt_distribution);
                                    if (NIL != tptp_assert(list(object_pred, arg1, arg2), mt, UNPROVIDED)) {
                                        count = add(count, ONE_INTEGER);
                                        utilities_macros.note_percent_progress(count, n);
                                    }
                                }
                            } 
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static final SubLObject random_non_skolem_instance_of(SubLObject col) {
        {
            SubLObject result = NIL;
            SubLObject candidate = isa.random_instance_of(col, UNPROVIDED);
            if (NIL == term.skolem_nartP(candidate)) {
                result = candidate;
            }
            return result;
        }
    }

    public static final SubLObject tptp_generate_geo_proxy(SubLObject v_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = v_properties;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_8 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt155);
                    current_8 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt155);
                    if (NIL == member(current_8, $list_alt156, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_8 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt155);
                }
                {
                    SubLObject levels_tail = property_list_member($LEVELS, current);
                    SubLObject levels = (NIL != levels_tail) ? ((SubLObject) (cadr(levels_tail))) : FIVE_INTEGER;
                    SubLObject x_width_tail = property_list_member($X_WIDTH, current);
                    SubLObject x_width = (NIL != x_width_tail) ? ((SubLObject) (cadr(x_width_tail))) : THREE_INTEGER;
                    SubLObject y_width_tail = property_list_member($Y_WIDTH, current);
                    SubLObject y_width = (NIL != y_width_tail) ? ((SubLObject) (cadr(y_width_tail))) : THREE_INTEGER;
                    SubLObject top_mt_tail = property_list_member($TOP_MT, current);
                    SubLObject top_mt = (NIL != top_mt_tail) ? ((SubLObject) (cadr(top_mt_tail))) : $$UniversalVocabularyMt;
                    SubLObject high_mt_tail = property_list_member($HIGH_MT, current);
                    SubLObject high_mt = (NIL != high_mt_tail) ? ((SubLObject) (cadr(high_mt_tail))) : NIL;
                    SubLObject medium_mt_tail = property_list_member($MEDIUM_MT, current);
                    SubLObject medium_mt = (NIL != medium_mt_tail) ? ((SubLObject) (cadr(medium_mt_tail))) : NIL;
                    SubLObject low_mts_tail = property_list_member($LOW_MTS, current);
                    SubLObject low_mts = (NIL != low_mts_tail) ? ((SubLObject) (cadr(low_mts_tail))) : NIL;
                    SubLSystemTrampolineFile.checkType(levels, POSITIVE_INTEGER_P);
                    SubLSystemTrampolineFile.checkType(x_width, POSITIVE_INTEGER_P);
                    SubLSystemTrampolineFile.checkType(y_width, POSITIVE_INTEGER_P);
                    {
                        SubLObject level_collections_vector = NIL;
                        SubLObject level_regions_vector = NIL;
                        SubLObject locations_array = NIL;
                        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                level_collections_vector = tptp_generate_geo_level_collections(levels, top_mt);
                                level_regions_vector = tptp_generate_geo_regions(levels, x_width, y_width, top_mt);
                                locations_array = tptp_generate_geo_locations(levels, x_width, y_width, top_mt);
                                tptp_classify_geo_regions(levels, level_regions_vector, level_collections_vector, high_mt);
                                tptp_classify_geo_locations(locations_array, high_mt);
                                tptp_assert_geo_superiors(levels, level_regions_vector, x_width, y_width, medium_mt, low_mts);
                                tptp_assert_geo_locations(levels, locations_array, level_regions_vector, x_width, y_width, medium_mt, low_mts);
                                tptp_assert_geo_intra_level_borders(levels, level_regions_vector, x_width, y_width, medium_mt, low_mts);
                                sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            } finally {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
                            }
                        }
                        return list($COLLECTIONS, level_collections_vector, $REGIONS, level_regions_vector, $LOCATIONS, locations_array);
                    }
                }
            }
        }
    }

    public static final SubLObject tptp_kill_geo_proxy() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = ZERO_INTEGER;
                {
                    SubLObject list_var = constant_completion_high.constant_complete($str_alt161$GeoLocation_X, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    utilities_macros.$progress_note$.setDynamicValue($$$Killing_locations, thread);
                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject v_term = NIL;
                                for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    cyc_kernel.cyc_kill(v_term);
                                    total = add(total, ONE_INTEGER);
                                }
                            }
                            utilities_macros.noting_percent_progress_postamble();
                        } finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject list_var = constant_completion_high.constant_complete($str_alt163$GeoRegion_L, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    utilities_macros.$progress_note$.setDynamicValue($$$Killing_regions, thread);
                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject v_term = NIL;
                                for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    cyc_kernel.cyc_kill(v_term);
                                    total = add(total, ONE_INTEGER);
                                }
                            }
                            utilities_macros.noting_percent_progress_postamble();
                        } finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject list_var = constant_completion_high.constant_complete($str_alt165$GeoLevel_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    utilities_macros.$progress_note$.setDynamicValue($$$Killing_levels, thread);
                    utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    utilities_macros.$progress_total$.setDynamicValue(length(list_var), thread);
                    utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                        try {
                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject v_term = NIL;
                                for (v_term = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    cyc_kernel.cyc_kill(v_term);
                                    total = add(total, ONE_INTEGER);
                                }
                            }
                            utilities_macros.noting_percent_progress_postamble();
                        } finally {
                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return total;
            }
        }
    }

    public static final SubLObject tptp_generate_geo_level_collections(SubLObject levels, SubLObject top_mt) {
        {
            SubLObject level_collections_vector = make_vector(levels, UNPROVIDED);
            SubLObject level = NIL;
            for (level = ZERO_INTEGER; level.numL(levels); level = add(level, ONE_INTEGER)) {
                {
                    SubLObject name = cconcatenate($str_alt165$GeoLevel_, format_nil.format_nil_s_no_copy(level));
                    SubLObject level_collection = cyc_kernel.cyc_create_new_ephemeral(name);
                    tptp_assert_wff(listS($$isa, level_collection, $list_alt167), top_mt, $list_alt126);
                    tptp_assert_wff(listS($$genls, level_collection, $list_alt168), top_mt, $list_alt126);
                    set_aref(level_collections_vector, level, level_collection);
                }
            }
            return level_collections_vector;
        }
    }

    public static final SubLObject tptp_generate_geo_regions(SubLObject levels, SubLObject x_width, SubLObject y_width, SubLObject top_mt) {
        {
            SubLObject level_regions_vector = make_vector(levels, UNPROVIDED);
            SubLObject level = NIL;
            for (level = ZERO_INTEGER; level.numL(levels); level = add(level, ONE_INTEGER)) {
                {
                    SubLObject region_array = tptp_generate_geo_regions_for_level(level, x_width, y_width, top_mt);
                    set_aref(level_regions_vector, level, region_array);
                }
            }
            return level_regions_vector;
        }
    }

    public static final SubLObject tptp_generate_geo_regions_for_level(SubLObject level, SubLObject x_width, SubLObject y_width, SubLObject top_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject x_total = expt(x_width, level);
                SubLObject y_total = expt(y_width, level);
                SubLObject region_array = make_vector(x_total, UNPROVIDED);
                SubLObject message = cconcatenate($str_alt169$Generating_regions_for_level_, format_nil.format_nil_s_no_copy(level));
                utilities_macros.$progress_note$.setDynamicValue(message, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(x_total, thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject x = NIL;
                            for (x = ZERO_INTEGER; x.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); x = add(x, ONE_INTEGER)) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject y_vector = make_vector(y_total, UNPROVIDED);
                                    set_aref(region_array, x, y_vector);
                                    {
                                        SubLObject y = NIL;
                                        for (y = ZERO_INTEGER; y.numL(y_total); y = add(y, ONE_INTEGER)) {
                                            {
                                                SubLObject region = tptp_generate_geo_region(level, x, y, top_mt);
                                                set_aref(y_vector, y, region);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return region_array;
            }
        }
    }

    public static final SubLObject tptp_generate_geo_region(SubLObject level, SubLObject x, SubLObject y, SubLObject top_mt) {
        {
            SubLObject name = cconcatenate($str_alt163$GeoRegion_L, new SubLObject[]{ format_nil.format_nil_s_no_copy(level), $str_alt170$_X, format_nil.format_nil_s_no_copy(x), $str_alt171$_Y, format_nil.format_nil_s_no_copy(y) });
            SubLObject region = cyc_kernel.cyc_create_new_ephemeral(name);
            tptp_assert_naked_wff(listS($$isa, region, $list_alt172), top_mt, $list_alt126);
            return region;
        }
    }

    public static final SubLObject tptp_generate_geo_locations(SubLObject levels, SubLObject x_width, SubLObject y_width, SubLObject top_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject level = number_utilities.f_1_(levels);
                SubLObject x_total = expt(x_width, level);
                SubLObject y_total = expt(y_width, level);
                SubLObject location_array = make_vector(x_total, UNPROVIDED);
                utilities_macros.$progress_note$.setDynamicValue($$$Generating_locations, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(x_total, thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject x = NIL;
                            for (x = ZERO_INTEGER; x.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); x = add(x, ONE_INTEGER)) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject y_vector = make_vector(y_total, UNPROVIDED);
                                    set_aref(location_array, x, y_vector);
                                    {
                                        SubLObject y = NIL;
                                        for (y = ZERO_INTEGER; y.numL(y_total); y = add(y, ONE_INTEGER)) {
                                            {
                                                SubLObject location = tptp_generate_geo_location(x, y, top_mt);
                                                set_aref(y_vector, y, location);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return location_array;
            }
        }
    }

    public static final SubLObject tptp_generate_geo_location(SubLObject x, SubLObject y, SubLObject top_mt) {
        {
            SubLObject name = cconcatenate($str_alt161$GeoLocation_X, new SubLObject[]{ format_nil.format_nil_s_no_copy(x), $str_alt171$_Y, format_nil.format_nil_s_no_copy(y) });
            SubLObject location = cyc_kernel.cyc_create_new_ephemeral(name);
            tptp_assert_naked_wff(listS($$isa, location, $list_alt172), top_mt, $list_alt126);
            return location;
        }
    }

    public static final SubLObject tptp_classify_geo_regions(SubLObject levels, SubLObject level_regions_vector, SubLObject level_collections_vector, SubLObject high_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject level = NIL;
                for (level = ZERO_INTEGER; level.numL(levels); level = add(level, ONE_INTEGER)) {
                    {
                        SubLObject level_collection = aref(level_collections_vector, level);
                        SubLObject region_array = aref(level_regions_vector, level);
                        SubLObject message = cconcatenate($str_alt174$Classifying_regions_at_level_, format_nil.format_nil_s_no_copy(level));
                        utilities_macros.$progress_note$.setDynamicValue(message, thread);
                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        utilities_macros.$progress_total$.setDynamicValue(length(region_array), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject x = NIL;
                                    for (x = ZERO_INTEGER; x.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); x = add(x, ONE_INTEGER)) {
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject y_vector = aref(region_array, x);
                                            SubLObject cdotimes_end_var = length(y_vector);
                                            SubLObject y = NIL;
                                            for (y = ZERO_INTEGER; y.numL(cdotimes_end_var); y = add(y, ONE_INTEGER)) {
                                                {
                                                    SubLObject region = aref(y_vector, y);
                                                    tptp_assert_naked_wff(list($$isa, region, level_collection), high_mt, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tptp_classify_geo_locations(SubLObject locations_array, SubLObject high_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            utilities_macros.$progress_note$.setDynamicValue($$$Classifying_locations, thread);
            utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
            utilities_macros.$progress_total$.setDynamicValue(length(locations_array), thread);
            utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
            {
                SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    {
                        SubLObject x = NIL;
                        for (x = ZERO_INTEGER; x.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); x = add(x, ONE_INTEGER)) {
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            {
                                SubLObject y_vector = aref(locations_array, x);
                                SubLObject cdotimes_end_var = length(y_vector);
                                SubLObject y = NIL;
                                for (y = ZERO_INTEGER; y.numL(cdotimes_end_var); y = add(y, ONE_INTEGER)) {
                                    {
                                        SubLObject location = aref(y_vector, y);
                                        tptp_assert_naked_wff(listS($$isa, location, $list_alt168), high_mt, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                    utilities_macros.noting_percent_progress_postamble();
                } finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tptp_assert_geo_superiors(SubLObject levels, SubLObject level_regions_vector, SubLObject x_width, SubLObject y_width, SubLObject medium_mt, SubLObject low_mts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inferior_level = NIL;
                for (inferior_level = ZERO_INTEGER; inferior_level.numL(levels); inferior_level = add(inferior_level, ONE_INTEGER)) {
                    {
                        SubLObject superior_level = number_utilities.f_1_(inferior_level);
                        SubLObject pcase_var = inferior_level;
                        if (pcase_var.eql(ZERO_INTEGER)) {
                            {
                                SubLObject root_region = aref(aref(aref(level_regions_vector, ZERO_INTEGER), ZERO_INTEGER), ZERO_INTEGER);
                                tptp_assert_naked_wff(list($$geographicalSubRegions, $$PlanetEarth, root_region), medium_mt, UNPROVIDED);
                            }
                        } else {
                            {
                                SubLObject superior_array = aref(level_regions_vector, superior_level);
                                SubLObject inferior_array = aref(level_regions_vector, inferior_level);
                                SubLObject x_total = expt(x_width, inferior_level);
                                SubLObject y_total = expt(y_width, inferior_level);
                                SubLObject message = cconcatenate($str_alt178$Asserting_geo_superiors_at_level_, format_nil.format_nil_s_no_copy(inferior_level));
                                utilities_macros.$progress_note$.setDynamicValue(message, thread);
                                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                utilities_macros.$progress_total$.setDynamicValue(x_total, thread);
                                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject x = NIL;
                                            for (x = ZERO_INTEGER; x.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); x = add(x, ONE_INTEGER)) {
                                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                {
                                                    SubLObject super_x = integerDivide(x, x_width);
                                                    SubLObject superior_y_vector = aref(superior_array, super_x);
                                                    SubLObject inferior_y_vector = aref(inferior_array, x);
                                                    SubLObject y = NIL;
                                                    for (y = ZERO_INTEGER; y.numL(y_total); y = add(y, ONE_INTEGER)) {
                                                        {
                                                            SubLObject super_y = integerDivide(y, y_width);
                                                            SubLObject superior_region = aref(superior_y_vector, super_y);
                                                            SubLObject inferior_region = aref(inferior_y_vector, y);
                                                            SubLObject mt = tptp_compute_geo_assert_mt(inferior_level, x, y, x_width, y_width, medium_mt, low_mts);
                                                            tptp_assert_naked_wff(list($$geographicalSubRegions, superior_region, inferior_region), mt, UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        utilities_macros.noting_percent_progress_postamble();
                                    } finally {
                                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tptp_assert_geo_locations(SubLObject levels, SubLObject locations_array, SubLObject level_regions_vector, SubLObject x_width, SubLObject y_width, SubLObject medium_mt, SubLObject low_mts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject level = number_utilities.f_1_(levels);
                SubLObject regions_array = aref(level_regions_vector, level);
                utilities_macros.$progress_note$.setDynamicValue($$$Asserting_locations, thread);
                utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                utilities_macros.$progress_total$.setDynamicValue(length(regions_array), thread);
                utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        {
                            SubLObject x = NIL;
                            for (x = ZERO_INTEGER; x.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); x = add(x, ONE_INTEGER)) {
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject region_y_vector = aref(regions_array, x);
                                    SubLObject location_y_vector = aref(locations_array, x);
                                    SubLObject cdotimes_end_var = length(region_y_vector);
                                    SubLObject y = NIL;
                                    for (y = ZERO_INTEGER; y.numL(cdotimes_end_var); y = add(y, ONE_INTEGER)) {
                                        {
                                            SubLObject region = aref(region_y_vector, y);
                                            SubLObject location = aref(location_y_vector, y);
                                            SubLObject mt = tptp_compute_geo_assert_mt(level, x, y, x_width, y_width, medium_mt, low_mts);
                                            tptp_assert_naked_wff(list($$inRegion, location, region), mt, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tptp_assert_geo_intra_level_borders(SubLObject levels, SubLObject level_regions_vector, SubLObject x_width, SubLObject y_width, SubLObject medium_mt, SubLObject low_mts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject level = NIL;
                for (level = ZERO_INTEGER; level.numL(levels); level = add(level, ONE_INTEGER)) {
                    {
                        SubLObject regions_array = aref(level_regions_vector, level);
                        SubLObject message = cconcatenate($str_alt181$Asserting_borders_for_level_, format_nil.format_nil_s_no_copy(level));
                        utilities_macros.$progress_note$.setDynamicValue(message, thread);
                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        utilities_macros.$progress_total$.setDynamicValue(length(regions_array), thread);
                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject x = NIL;
                                    for (x = ZERO_INTEGER; x.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); x = add(x, ONE_INTEGER)) {
                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject region_y_vector = aref(regions_array, x);
                                            SubLObject cdotimes_end_var = length(region_y_vector);
                                            SubLObject y = NIL;
                                            for (y = ZERO_INTEGER; y.numL(cdotimes_end_var); y = add(y, ONE_INTEGER)) {
                                                {
                                                    SubLObject region = aref(region_y_vector, y);
                                                    SubLObject mt = tptp_compute_geo_assert_mt(level, x, y, x_width, y_width, medium_mt, low_mts);
                                                    if (!y.isZero()) {
                                                        {
                                                            SubLObject south_region = aref(region_y_vector, number_utilities.f_1_(y));
                                                            SubLObject south_mt = tptp_compute_geo_assert_mt(level, x, number_utilities.f_1_(y), x_width, y_width, medium_mt, low_mts);
                                                            if (south_mt == mt) {
                                                                tptp_assert_naked_wff(list($$bordersOn, south_region, region), mt, UNPROVIDED);
                                                            }
                                                        }
                                                    }
                                                    if (!x.isZero()) {
                                                        {
                                                            SubLObject east_region = aref(aref(regions_array, number_utilities.f_1_(x)), y);
                                                            SubLObject east_mt = tptp_compute_geo_assert_mt(level, number_utilities.f_1_(x), y, x_width, y_width, medium_mt, low_mts);
                                                            if (east_mt == mt) {
                                                                tptp_assert_naked_wff(list($$bordersOn, east_region, region), mt, UNPROVIDED);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject tptp_compute_geo_assert_mt(SubLObject level, SubLObject x, SubLObject y, SubLObject x_width, SubLObject y_width, SubLObject medium_mt, SubLObject low_mts) {
        if (level.numLE(ONE_INTEGER)) {
            return medium_mt;
        }
        {
            SubLObject x_total = expt(x_width, level);
            SubLObject y_total = expt(y_width, level);
            SubLObject x_medium_width = integerDivide(x_total, x_width);
            SubLObject y_medium_width = integerDivide(y_total, y_width);
            SubLObject medium_x = integerDivide(x, x_medium_width);
            SubLObject medium_y = integerDivide(y, y_medium_width);
            SubLObject low_mt_index = add(multiply(x_width, medium_y), medium_x);
            return elt(low_mts, low_mt_index);
        }
    }

    public static final SubLObject tptp_assert(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != cyc_kernel.cyc_assert(sentence, mt, v_properties)) {
            return T;
        }
        Errors.warn($str_alt183$Assert_failed_____ist__s__s_, mt, sentence);
        return NIL;
    }

    public static final SubLObject tptp_assert_wff(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != cyc_kernel.cyc_assert_wff(sentence, mt, v_properties)) {
            return T;
        }
        Errors.warn($str_alt183$Assert_failed_____ist__s__s_, mt, sentence);
        return NIL;
    }

    /**
     * Asserts SENTENCE in MT with no forward rules allowed.
     */
    public static final SubLObject tptp_assert_naked(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                        if (NIL != cyc_kernel.cyc_assert(sentence, mt, v_properties)) {
                            successP = T;
                        } else {
                            Errors.warn($str_alt183$Assert_failed_____ist__s__s_, mt, sentence);
                        }
                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    /**
     * Asserts wff SENTENCE in MT with no forward rules allowed.
     */
    public static final SubLObject tptp_assert_naked_wff(SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_allowed_rules$.bind(NIL, thread);
                        if (NIL != cyc_kernel.cyc_assert_wff(sentence, mt, v_properties)) {
                            successP = T;
                        } else {
                            Errors.warn($str_alt183$Assert_failed_____ist__s__s_, mt, sentence);
                        }
                    } finally {
                        kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    public static final SubLObject declare_tptp_kb_content_generator_file() {
        declareFunction("tptp_kb_content_print_function_trampoline", "TPTP-KB-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tptp_kb_content_p", "TPTP-KB-CONTENT-P", 1, 0, false);
        new tptp_kb_content_generator.$tptp_kb_content_p$UnaryFunction();
        declareFunction("tptp_kbc_col", "TPTP-KBC-COL", 1, 0, false);
        declareFunction("tptp_kbc_part_types_pred", "TPTP-KBC-PART-TYPES-PRED", 1, 0, false);
        declareFunction("tptp_kbc_parts_pred", "TPTP-KBC-PARTS-PRED", 1, 0, false);
        declareFunction("tptp_kbc_spindle_head_mt", "TPTP-KBC-SPINDLE-HEAD-MT", 1, 0, false);
        declareFunction("tptp_kbc_spindle_member_mts", "TPTP-KBC-SPINDLE-MEMBER-MTS", 1, 0, false);
        declareFunction("tptp_kbc_spindle_collector_mt", "TPTP-KBC-SPINDLE-COLLECTOR-MT", 1, 0, false);
        declareFunction("tptp_kbc_object_pred", "TPTP-KBC-OBJECT-PRED", 1, 0, false);
        declareFunction("tptp_kbc_unary_functions", "TPTP-KBC-UNARY-FUNCTIONS", 1, 0, false);
        declareFunction("tptp_kbc_geo_spindle_head_mt", "TPTP-KBC-GEO-SPINDLE-HEAD-MT", 1, 0, false);
        declareFunction("tptp_kbc_geo_spindle_member_mts", "TPTP-KBC-GEO-SPINDLE-MEMBER-MTS", 1, 0, false);
        declareFunction("tptp_kbc_geo_spindle_collector_mt", "TPTP-KBC-GEO-SPINDLE-COLLECTOR-MT", 1, 0, false);
        declareFunction("tptp_kbc_geo_collections", "TPTP-KBC-GEO-COLLECTIONS", 1, 0, false);
        declareFunction("tptp_kbc_geo_regions", "TPTP-KBC-GEO-REGIONS", 1, 0, false);
        declareFunction("tptp_kbc_geo_locations", "TPTP-KBC-GEO-LOCATIONS", 1, 0, false);
        declareFunction("tptp_kbc_instances", "TPTP-KBC-INSTANCES", 1, 0, false);
        declareFunction("_csetf_tptp_kbc_col", "_CSETF-TPTP-KBC-COL", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_part_types_pred", "_CSETF-TPTP-KBC-PART-TYPES-PRED", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_parts_pred", "_CSETF-TPTP-KBC-PARTS-PRED", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_spindle_head_mt", "_CSETF-TPTP-KBC-SPINDLE-HEAD-MT", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_spindle_member_mts", "_CSETF-TPTP-KBC-SPINDLE-MEMBER-MTS", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_spindle_collector_mt", "_CSETF-TPTP-KBC-SPINDLE-COLLECTOR-MT", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_object_pred", "_CSETF-TPTP-KBC-OBJECT-PRED", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_unary_functions", "_CSETF-TPTP-KBC-UNARY-FUNCTIONS", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_geo_spindle_head_mt", "_CSETF-TPTP-KBC-GEO-SPINDLE-HEAD-MT", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_geo_spindle_member_mts", "_CSETF-TPTP-KBC-GEO-SPINDLE-MEMBER-MTS", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_geo_spindle_collector_mt", "_CSETF-TPTP-KBC-GEO-SPINDLE-COLLECTOR-MT", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_geo_collections", "_CSETF-TPTP-KBC-GEO-COLLECTIONS", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_geo_regions", "_CSETF-TPTP-KBC-GEO-REGIONS", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_geo_locations", "_CSETF-TPTP-KBC-GEO-LOCATIONS", 2, 0, false);
        declareFunction("_csetf_tptp_kbc_instances", "_CSETF-TPTP-KBC-INSTANCES", 2, 0, false);
        declareFunction("make_tptp_kb_content", "MAKE-TPTP-KB-CONTENT", 0, 1, false);
        declareFunction("print_tptp_kb_content", "PRINT-TPTP-KB-CONTENT", 3, 0, false);
        declareFunction("new_tptp_kb_content", "NEW-TPTP-KB-CONTENT", 9, 0, false);
        declareFunction("tptp_kb_content_col", "TPTP-KB-CONTENT-COL", 1, 0, false);
        declareFunction("tptp_kb_content_part_types_pred", "TPTP-KB-CONTENT-PART-TYPES-PRED", 1, 0, false);
        declareFunction("tptp_kb_content_parts_pred", "TPTP-KB-CONTENT-PARTS-PRED", 1, 0, false);
        declareFunction("tptp_kb_content_spindle_head_mt", "TPTP-KB-CONTENT-SPINDLE-HEAD-MT", 1, 0, false);
        declareFunction("tptp_kb_content_spindle_member_mts", "TPTP-KB-CONTENT-SPINDLE-MEMBER-MTS", 1, 0, false);
        declareFunction("tptp_kb_content_spindle_collector_mt", "TPTP-KB-CONTENT-SPINDLE-COLLECTOR-MT", 1, 0, false);
        declareFunction("tptp_kb_content_object_pred", "TPTP-KB-CONTENT-OBJECT-PRED", 1, 0, false);
        declareFunction("tptp_kb_content_unary_functions", "TPTP-KB-CONTENT-UNARY-FUNCTIONS", 1, 0, false);
        declareFunction("tptp_kb_content_geo_spindle_head_mt", "TPTP-KB-CONTENT-GEO-SPINDLE-HEAD-MT", 1, 0, false);
        declareFunction("tptp_kb_content_geo_spindle_member_mts", "TPTP-KB-CONTENT-GEO-SPINDLE-MEMBER-MTS", 1, 0, false);
        declareFunction("tptp_kb_content_geo_spindle_collector_mt", "TPTP-KB-CONTENT-GEO-SPINDLE-COLLECTOR-MT", 1, 0, false);
        declareFunction("tptp_kb_content_geo_collections", "TPTP-KB-CONTENT-GEO-COLLECTIONS", 1, 0, false);
        declareFunction("tptp_kb_content_geo_regions", "TPTP-KB-CONTENT-GEO-REGIONS", 1, 0, false);
        declareFunction("tptp_kb_content_geo_locations", "TPTP-KB-CONTENT-GEO-LOCATIONS", 1, 0, false);
        declareFunction("tptp_kb_content_instances", "TPTP-KB-CONTENT-INSTANCES", 1, 0, false);
        declareFunction("tptp_kb_content_geo_regions_list", "TPTP-KB-CONTENT-GEO-REGIONS-LIST", 1, 0, false);
        declareFunction("tptp_kb_content_geo_locations_list", "TPTP-KB-CONTENT-GEO-LOCATIONS-LIST", 1, 0, false);
        declareFunction("ensure_all_synthetic_terms_initialized", "ENSURE-ALL-SYNTHETIC-TERMS-INITIALIZED", 1, 0, false);
        declareFunction("initialize_all_synthetic_terms", "INITIALIZE-ALL-SYNTHETIC-TERMS", 1, 0, false);
        declareFunction("all_synthetic_terms_set", "ALL-SYNTHETIC-TERMS-SET", 1, 0, false);
        declareFunction("synthetic_termP", "SYNTHETIC-TERM?", 1, 0, false);
        declareFunction("all_synthetic_terms_list", "ALL-SYNTHETIC-TERMS-LIST", 1, 0, false);
        declareFunction("kill_all_synthetic_terms", "KILL-ALL-SYNTHETIC-TERMS", 1, 0, false);
        declareFunction("ensure_all_synthetic_gafs_initialized", "ENSURE-ALL-SYNTHETIC-GAFS-INITIALIZED", 1, 0, false);
        declareFunction("initialize_all_synthetic_gafs", "INITIALIZE-ALL-SYNTHETIC-GAFS", 1, 0, false);
        declareFunction("all_synthetic_gafs", "ALL-SYNTHETIC-GAFS", 1, 0, false);
        declareFunction("random_non_sbhl_synthetic_gaf", "RANDOM-NON-SBHL-SYNTHETIC-GAF", 1, 0, false);
        declareFunction("random_synthetic_gaf", "RANDOM-SYNTHETIC-GAF", 1, 0, false);
        declareFunction("all_synthetic_chaff_forts", "ALL-SYNTHETIC-CHAFF-FORTS", 2, 0, false);
        declareFunction("some_synthetic_chaff_forts", "SOME-SYNTHETIC-CHAFF-FORTS", 3, 0, false);
        declareFunction("all_synthetic_chaff_gafs", "ALL-SYNTHETIC-CHAFF-GAFS", 2, 0, false);
        declareFunction("some_synthetic_chaff_gafs", "SOME-SYNTHETIC-CHAFF-GAFS", 3, 0, false);
        declareFunction("some_synthetic_chaff_gafs_not_mentioning", "SOME-SYNTHETIC-CHAFF-GAFS-NOT-MENTIONING", 4, 0, false);
        declareFunction("tptp_kb_content_as_plist", "TPTP-KB-CONTENT-AS-PLIST", 1, 0, false);
        declareFunction("tptp_kb_content_from_plist", "TPTP-KB-CONTENT-FROM-PLIST", 1, 0, false);
        declareFunction("tptp_generate_synthetic_kb_content", "TPTP-GENERATE-SYNTHETIC-KB-CONTENT", 0, 0, false);
        declareFunction("tptp_generate_object_quantity_kb_content", "TPTP-GENERATE-OBJECT-QUANTITY-KB-CONTENT", 1, 0, false);
        declareFunction("tptp_generate_mt_spindle_and_geo_proxy", "TPTP-GENERATE-MT-SPINDLE-AND-GEO-PROXY", 4, 0, false);
        declareFunction("generate_synthetic_collection_hierarchy", "GENERATE-SYNTHETIC-COLLECTION-HIERARCHY", 1, 6, false);
        declareFunction("generate_synthetic_collection_hierarchy_recursive", "GENERATE-SYNTHETIC-COLLECTION-HIERARCHY-RECURSIVE", 9, 0, false);
        declareFunction("generate_synthetic_predicate_hierarchy", "GENERATE-SYNTHETIC-PREDICATE-HIERARCHY", 1, 7, false);
        declareFunction("generate_synthetic_predicate_hierarchy_recursive", "GENERATE-SYNTHETIC-PREDICATE-HIERARCHY-RECURSIVE", 10, 0, false);
        declareFunction("add_synthetic_arg_genls", "ADD-SYNTHETIC-ARG-GENLS", 4, 0, false);
        declareFunction("add_synthetic_arg_genls_recursive", "ADD-SYNTHETIC-ARG-GENLS-RECURSIVE", 5, 0, false);
        declareFunction("add_synthetic_arg_genls_recursive_int", "ADD-SYNTHETIC-ARG-GENLS-RECURSIVE-INT", 7, 0, false);
        declareFunction("select_a_spec_for_synthetic_arg_genl", "SELECT-A-SPEC-FOR-SYNTHETIC-ARG-GENL", 1, 0, false);
        declareFunction("generate_instance_level_analogue_preds", "GENERATE-INSTANCE-LEVEL-ANALOGUE-PREDS", 4, 0, false);
        declareFunction("generate_instance_level_analogue_preds_recursive", "GENERATE-INSTANCE-LEVEL-ANALOGUE-PREDS-RECURSIVE", 6, 0, false);
        declareFunction("tptp_generate_mt_spindle", "TPTP-GENERATE-MT-SPINDLE", 3, 0, false);
        declareFunction("tptp_create_mt", "TPTP-CREATE-MT", 1, 0, false);
        declareFunction("construct_part_types_proxy_assertion_mt_probability_distribution", "CONSTRUCT-PART-TYPES-PROXY-ASSERTION-MT-PROBABILITY-DISTRIBUTION", 1, 0, false);
        declareFunction("generate_part_types_proxy_assertions", "GENERATE-PART-TYPES-PROXY-ASSERTIONS", 3, 0, false);
        declareFunction("generate_synthetic_instances", "GENERATE-SYNTHETIC-INSTANCES", 3, 0, false);
        declareFunction("random_arg_genl_of_spec_pred_or_inverse_of", "RANDOM-ARG-GENL-OF-SPEC-PRED-OR-INVERSE-OF", 1, 0, false);
        declareFunction("tptp_generate_instances", "TPTP-GENERATE-INSTANCES", 4, 0, false);
        declareFunction("tptp_generate_instance", "TPTP-GENERATE-INSTANCE", 4, 0, false);
        declareFunction("construct_object_quantity_assertion_mt_probability_distribution", "CONSTRUCT-OBJECT-QUANTITY-ASSERTION-MT-PROBABILITY-DISTRIBUTION", 1, 0, false);
        declareFunction("tptp_create_object_pred", "TPTP-CREATE-OBJECT-PRED", 4, 0, false);
        declareFunction("tptp_create_quantity_col", "TPTP-CREATE-QUANTITY-COL", 2, 0, false);
        declareFunction("tptp_generate_unary_functions", "TPTP-GENERATE-UNARY-FUNCTIONS", 4, 0, false);
        declareFunction("generate_relation_all_instance_object_quantity_assertions", "GENERATE-RELATION-ALL-INSTANCE-OBJECT-QUANTITY-ASSERTIONS", 4, 0, false);
        declareFunction("generate_instance_level_object_quantity_assertions", "GENERATE-INSTANCE-LEVEL-OBJECT-QUANTITY-ASSERTIONS", 4, 0, false);
        declareFunction("random_non_skolem_instance_of", "RANDOM-NON-SKOLEM-INSTANCE-OF", 1, 0, false);
        declareFunction("tptp_generate_geo_proxy", "TPTP-GENERATE-GEO-PROXY", 1, 0, false);
        declareFunction("tptp_kill_geo_proxy", "TPTP-KILL-GEO-PROXY", 0, 0, false);
        declareFunction("tptp_generate_geo_level_collections", "TPTP-GENERATE-GEO-LEVEL-COLLECTIONS", 2, 0, false);
        declareFunction("tptp_generate_geo_regions", "TPTP-GENERATE-GEO-REGIONS", 4, 0, false);
        declareFunction("tptp_generate_geo_regions_for_level", "TPTP-GENERATE-GEO-REGIONS-FOR-LEVEL", 4, 0, false);
        declareFunction("tptp_generate_geo_region", "TPTP-GENERATE-GEO-REGION", 4, 0, false);
        declareFunction("tptp_generate_geo_locations", "TPTP-GENERATE-GEO-LOCATIONS", 4, 0, false);
        declareFunction("tptp_generate_geo_location", "TPTP-GENERATE-GEO-LOCATION", 3, 0, false);
        declareFunction("tptp_classify_geo_regions", "TPTP-CLASSIFY-GEO-REGIONS", 4, 0, false);
        declareFunction("tptp_classify_geo_locations", "TPTP-CLASSIFY-GEO-LOCATIONS", 2, 0, false);
        declareFunction("tptp_assert_geo_superiors", "TPTP-ASSERT-GEO-SUPERIORS", 6, 0, false);
        declareFunction("tptp_assert_geo_locations", "TPTP-ASSERT-GEO-LOCATIONS", 7, 0, false);
        declareFunction("tptp_assert_geo_intra_level_borders", "TPTP-ASSERT-GEO-INTRA-LEVEL-BORDERS", 6, 0, false);
        declareFunction("tptp_compute_geo_assert_mt", "TPTP-COMPUTE-GEO-ASSERT-MT", 7, 0, false);
        declareFunction("tptp_assert", "TPTP-ASSERT", 2, 1, false);
        declareFunction("tptp_assert_wff", "TPTP-ASSERT-WFF", 2, 1, false);
        declareFunction("tptp_assert_naked", "TPTP-ASSERT-NAKED", 2, 1, false);
        declareFunction("tptp_assert_naked_wff", "TPTP-ASSERT-NAKED-WFF", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_tptp_kb_content_generator_file() {
        defparameter("*TPTP-HIGH-MT*", $$UniversalVocabularyMt);
        defparameter("*TPTP-MEDIUM-MT*", $const1$CurrentWorldDataCollectorMt_NonHo);
        defparameter("*TPTP-LOW-MT*", $$CyclistsMt);
        defparameter("*TPTP-COLLECTION-DEPTH*", SIXTEEN_INTEGER);
        defparameter("*TPTP-PREDICATE-DEPTH*", NINE_INTEGER);
        defparameter("*TPTP-MT-SPINDLE-MEMBER-COUNT*", $int$3994);
        defparameter("*TPTP-PART-TYPES-ASSERTION-COUNT*", $int$5861);
        defparameter("*TPTP-SYNTHETIC-INSTANCE-COUNT*", $int$65536);
        defparameter("*TPTP-UNARY-FUNCTION-COUNT*", $int$22);
        defparameter("*TPTP-OBJECT-QUANTITY-COL*", $$PartiallyTangible);
        defparameter("*TPTP-TYPE-LEVEL-OBJECT-QUANTITY-ASSERTION-COUNT*", $int$8555);
        defparameter("*TPTP-INSTANCE-LEVEL-OBJECT-QUANTITY-ASSERTION-COUNT*", $int$32267);
        defparameter("*TPTP-GEO-MT*", $$WorldGeographyMt);
        defparameter("*TPTP-GEO-X-WIDTH*", THREE_INTEGER);
        defparameter("*TPTP-GEO-Y-WIDTH*", THREE_INTEGER);
        defparameter("*TPTP-GEO-LEVELS*", FIVE_INTEGER);
        defparameter("*MORE-THAN-20-PERCENT-OF-THE-KB-IS-SYNTHETIC?*", T);
        defconstant("*DTP-TPTP-KB-CONTENT*", TPTP_KB_CONTENT);
        deflexical("*ALL-SYNTHETIC-TERMS*", NIL != boundp($all_synthetic_terms$) ? ((SubLObject) ($all_synthetic_terms$.getGlobalValue())) : NIL);
        deflexical("*ALL-SYNTHETIC-TERMS-KB-CONTENT*", NIL != boundp($all_synthetic_terms_kb_content$) ? ((SubLObject) ($all_synthetic_terms_kb_content$.getGlobalValue())) : NIL);
        deflexical("*ALL-SYNTHETIC-GAFS*", NIL != boundp($all_synthetic_gafs$) ? ((SubLObject) ($all_synthetic_gafs$.getGlobalValue())) : NIL);
        defparameter("*GENERATE-SYNTHETIC-COLLECTION-HIERARCHY-COUNTER*", NIL);
        defparameter("*GENERATE-SYNTHETIC-PREDICATE-HIERARCHY-COUNTER*", NIL);
        defparameter("*TPTP-SYNTHETIC-ARG-GENLS-COUNTER*", NIL);
        defparameter("*TPTP-INSTANCE-LEVEL-ANALOGUE-COUNTER*", NIL);
        return NIL;
    }

    public static final SubLObject setup_tptp_kb_content_generator_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_tptp_kb_content$.getGlobalValue(), symbol_function(TPTP_KB_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TPTP_KBC_COL, _CSETF_TPTP_KBC_COL);
        def_csetf(TPTP_KBC_PART_TYPES_PRED, _CSETF_TPTP_KBC_PART_TYPES_PRED);
        def_csetf(TPTP_KBC_PARTS_PRED, _CSETF_TPTP_KBC_PARTS_PRED);
        def_csetf(TPTP_KBC_SPINDLE_HEAD_MT, _CSETF_TPTP_KBC_SPINDLE_HEAD_MT);
        def_csetf(TPTP_KBC_SPINDLE_MEMBER_MTS, _CSETF_TPTP_KBC_SPINDLE_MEMBER_MTS);
        def_csetf(TPTP_KBC_SPINDLE_COLLECTOR_MT, _CSETF_TPTP_KBC_SPINDLE_COLLECTOR_MT);
        def_csetf(TPTP_KBC_OBJECT_PRED, _CSETF_TPTP_KBC_OBJECT_PRED);
        def_csetf(TPTP_KBC_UNARY_FUNCTIONS, _CSETF_TPTP_KBC_UNARY_FUNCTIONS);
        def_csetf(TPTP_KBC_GEO_SPINDLE_HEAD_MT, _CSETF_TPTP_KBC_GEO_SPINDLE_HEAD_MT);
        def_csetf(TPTP_KBC_GEO_SPINDLE_MEMBER_MTS, _CSETF_TPTP_KBC_GEO_SPINDLE_MEMBER_MTS);
        def_csetf(TPTP_KBC_GEO_SPINDLE_COLLECTOR_MT, _CSETF_TPTP_KBC_GEO_SPINDLE_COLLECTOR_MT);
        def_csetf(TPTP_KBC_GEO_COLLECTIONS, _CSETF_TPTP_KBC_GEO_COLLECTIONS);
        def_csetf(TPTP_KBC_GEO_REGIONS, _CSETF_TPTP_KBC_GEO_REGIONS);
        def_csetf(TPTP_KBC_GEO_LOCATIONS, _CSETF_TPTP_KBC_GEO_LOCATIONS);
        def_csetf(TPTP_KBC_INSTANCES, _CSETF_TPTP_KBC_INSTANCES);
        identity(TPTP_KB_CONTENT);
        utilities_macros.note_funcall_helper_function(PRINT_TPTP_KB_CONTENT);
        subl_macro_promotions.declare_defglobal($all_synthetic_terms$);
        subl_macro_promotions.declare_defglobal($all_synthetic_terms_kb_content$);
        subl_macro_promotions.declare_defglobal($all_synthetic_gafs$);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLObject $const1$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"));

    public static final SubLObject $$CyclistsMt = constant_handles.reader_make_constant_shell(makeString("CyclistsMt"));

    public static final SubLInteger $int$3994 = makeInteger(3994);

    public static final SubLInteger $int$5861 = makeInteger(5861);

    public static final SubLInteger $int$65536 = makeInteger(65536);

    public static final SubLInteger $int$22 = makeInteger(22);

    public static final SubLObject $$PartiallyTangible = constant_handles.reader_make_constant_shell(makeString("PartiallyTangible"));

    public static final SubLInteger $int$8555 = makeInteger(8555);

    public static final SubLInteger $int$32267 = makeInteger(32267);

    public static final SubLObject $$WorldGeographyMt = constant_handles.reader_make_constant_shell(makeString("WorldGeographyMt"));

    private static final SubLSymbol TPTP_KB_CONTENT = makeSymbol("TPTP-KB-CONTENT");

    private static final SubLSymbol TPTP_KB_CONTENT_P = makeSymbol("TPTP-KB-CONTENT-P");

    static private final SubLList $list_alt13 = list(new SubLObject[]{ makeSymbol("COL"), makeSymbol("PART-TYPES-PRED"), makeSymbol("PARTS-PRED"), makeSymbol("SPINDLE-HEAD-MT"), makeSymbol("SPINDLE-MEMBER-MTS"), makeSymbol("SPINDLE-COLLECTOR-MT"), makeSymbol("OBJECT-PRED"), makeSymbol("UNARY-FUNCTIONS"), makeSymbol("GEO-SPINDLE-HEAD-MT"), makeSymbol("GEO-SPINDLE-MEMBER-MTS"), makeSymbol("GEO-SPINDLE-COLLECTOR-MT"), makeSymbol("GEO-COLLECTIONS"), makeSymbol("GEO-REGIONS"), makeSymbol("GEO-LOCATIONS"), makeSymbol("INSTANCES") });

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeKeyword("COL"), makeKeyword("PART-TYPES-PRED"), makeKeyword("PARTS-PRED"), makeKeyword("SPINDLE-HEAD-MT"), makeKeyword("SPINDLE-MEMBER-MTS"), makeKeyword("SPINDLE-COLLECTOR-MT"), makeKeyword("OBJECT-PRED"), makeKeyword("UNARY-FUNCTIONS"), makeKeyword("GEO-SPINDLE-HEAD-MT"), makeKeyword("GEO-SPINDLE-MEMBER-MTS"), makeKeyword("GEO-SPINDLE-COLLECTOR-MT"), makeKeyword("GEO-COLLECTIONS"), makeKeyword("GEO-REGIONS"), makeKeyword("GEO-LOCATIONS"), makeKeyword("INSTANCES") });

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeSymbol("TPTP-KBC-COL"), makeSymbol("TPTP-KBC-PART-TYPES-PRED"), makeSymbol("TPTP-KBC-PARTS-PRED"), makeSymbol("TPTP-KBC-SPINDLE-HEAD-MT"), makeSymbol("TPTP-KBC-SPINDLE-MEMBER-MTS"), makeSymbol("TPTP-KBC-SPINDLE-COLLECTOR-MT"), makeSymbol("TPTP-KBC-OBJECT-PRED"), makeSymbol("TPTP-KBC-UNARY-FUNCTIONS"), makeSymbol("TPTP-KBC-GEO-SPINDLE-HEAD-MT"), makeSymbol("TPTP-KBC-GEO-SPINDLE-MEMBER-MTS"), makeSymbol("TPTP-KBC-GEO-SPINDLE-COLLECTOR-MT"), makeSymbol("TPTP-KBC-GEO-COLLECTIONS"), makeSymbol("TPTP-KBC-GEO-REGIONS"), makeSymbol("TPTP-KBC-GEO-LOCATIONS"), makeSymbol("TPTP-KBC-INSTANCES") });

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeSymbol("_CSETF-TPTP-KBC-COL"), makeSymbol("_CSETF-TPTP-KBC-PART-TYPES-PRED"), makeSymbol("_CSETF-TPTP-KBC-PARTS-PRED"), makeSymbol("_CSETF-TPTP-KBC-SPINDLE-HEAD-MT"), makeSymbol("_CSETF-TPTP-KBC-SPINDLE-MEMBER-MTS"), makeSymbol("_CSETF-TPTP-KBC-SPINDLE-COLLECTOR-MT"), makeSymbol("_CSETF-TPTP-KBC-OBJECT-PRED"), makeSymbol("_CSETF-TPTP-KBC-UNARY-FUNCTIONS"), makeSymbol("_CSETF-TPTP-KBC-GEO-SPINDLE-HEAD-MT"), makeSymbol("_CSETF-TPTP-KBC-GEO-SPINDLE-MEMBER-MTS"), makeSymbol("_CSETF-TPTP-KBC-GEO-SPINDLE-COLLECTOR-MT"), makeSymbol("_CSETF-TPTP-KBC-GEO-COLLECTIONS"), makeSymbol("_CSETF-TPTP-KBC-GEO-REGIONS"), makeSymbol("_CSETF-TPTP-KBC-GEO-LOCATIONS"), makeSymbol("_CSETF-TPTP-KBC-INSTANCES") });

    private static final SubLSymbol PRINT_TPTP_KB_CONTENT = makeSymbol("PRINT-TPTP-KB-CONTENT");

    private static final SubLSymbol TPTP_KB_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TPTP-KB-CONTENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol TPTP_KBC_COL = makeSymbol("TPTP-KBC-COL");

    public static final SubLSymbol _CSETF_TPTP_KBC_COL = makeSymbol("_CSETF-TPTP-KBC-COL");

    private static final SubLSymbol TPTP_KBC_PART_TYPES_PRED = makeSymbol("TPTP-KBC-PART-TYPES-PRED");

    public static final SubLSymbol _CSETF_TPTP_KBC_PART_TYPES_PRED = makeSymbol("_CSETF-TPTP-KBC-PART-TYPES-PRED");

    private static final SubLSymbol TPTP_KBC_PARTS_PRED = makeSymbol("TPTP-KBC-PARTS-PRED");

    public static final SubLSymbol _CSETF_TPTP_KBC_PARTS_PRED = makeSymbol("_CSETF-TPTP-KBC-PARTS-PRED");

    private static final SubLSymbol TPTP_KBC_SPINDLE_HEAD_MT = makeSymbol("TPTP-KBC-SPINDLE-HEAD-MT");

    public static final SubLSymbol _CSETF_TPTP_KBC_SPINDLE_HEAD_MT = makeSymbol("_CSETF-TPTP-KBC-SPINDLE-HEAD-MT");

    private static final SubLSymbol TPTP_KBC_SPINDLE_MEMBER_MTS = makeSymbol("TPTP-KBC-SPINDLE-MEMBER-MTS");

    public static final SubLSymbol _CSETF_TPTP_KBC_SPINDLE_MEMBER_MTS = makeSymbol("_CSETF-TPTP-KBC-SPINDLE-MEMBER-MTS");

    private static final SubLSymbol TPTP_KBC_SPINDLE_COLLECTOR_MT = makeSymbol("TPTP-KBC-SPINDLE-COLLECTOR-MT");

    public static final SubLSymbol _CSETF_TPTP_KBC_SPINDLE_COLLECTOR_MT = makeSymbol("_CSETF-TPTP-KBC-SPINDLE-COLLECTOR-MT");

    private static final SubLSymbol TPTP_KBC_OBJECT_PRED = makeSymbol("TPTP-KBC-OBJECT-PRED");

    public static final SubLSymbol _CSETF_TPTP_KBC_OBJECT_PRED = makeSymbol("_CSETF-TPTP-KBC-OBJECT-PRED");

    private static final SubLSymbol TPTP_KBC_UNARY_FUNCTIONS = makeSymbol("TPTP-KBC-UNARY-FUNCTIONS");

    public static final SubLSymbol _CSETF_TPTP_KBC_UNARY_FUNCTIONS = makeSymbol("_CSETF-TPTP-KBC-UNARY-FUNCTIONS");

    private static final SubLSymbol TPTP_KBC_GEO_SPINDLE_HEAD_MT = makeSymbol("TPTP-KBC-GEO-SPINDLE-HEAD-MT");

    public static final SubLSymbol _CSETF_TPTP_KBC_GEO_SPINDLE_HEAD_MT = makeSymbol("_CSETF-TPTP-KBC-GEO-SPINDLE-HEAD-MT");

    private static final SubLSymbol TPTP_KBC_GEO_SPINDLE_MEMBER_MTS = makeSymbol("TPTP-KBC-GEO-SPINDLE-MEMBER-MTS");

    public static final SubLSymbol _CSETF_TPTP_KBC_GEO_SPINDLE_MEMBER_MTS = makeSymbol("_CSETF-TPTP-KBC-GEO-SPINDLE-MEMBER-MTS");

    private static final SubLSymbol TPTP_KBC_GEO_SPINDLE_COLLECTOR_MT = makeSymbol("TPTP-KBC-GEO-SPINDLE-COLLECTOR-MT");

    public static final SubLSymbol _CSETF_TPTP_KBC_GEO_SPINDLE_COLLECTOR_MT = makeSymbol("_CSETF-TPTP-KBC-GEO-SPINDLE-COLLECTOR-MT");

    private static final SubLSymbol TPTP_KBC_GEO_COLLECTIONS = makeSymbol("TPTP-KBC-GEO-COLLECTIONS");

    public static final SubLSymbol _CSETF_TPTP_KBC_GEO_COLLECTIONS = makeSymbol("_CSETF-TPTP-KBC-GEO-COLLECTIONS");

    private static final SubLSymbol TPTP_KBC_GEO_REGIONS = makeSymbol("TPTP-KBC-GEO-REGIONS");

    public static final SubLSymbol _CSETF_TPTP_KBC_GEO_REGIONS = makeSymbol("_CSETF-TPTP-KBC-GEO-REGIONS");

    private static final SubLSymbol TPTP_KBC_GEO_LOCATIONS = makeSymbol("TPTP-KBC-GEO-LOCATIONS");

    public static final SubLSymbol _CSETF_TPTP_KBC_GEO_LOCATIONS = makeSymbol("_CSETF-TPTP-KBC-GEO-LOCATIONS");

    private static final SubLSymbol TPTP_KBC_INSTANCES = makeSymbol("TPTP-KBC-INSTANCES");

    public static final SubLSymbol _CSETF_TPTP_KBC_INSTANCES = makeSymbol("_CSETF-TPTP-KBC-INSTANCES");



    private static final SubLSymbol $PART_TYPES_PRED = makeKeyword("PART-TYPES-PRED");

    private static final SubLSymbol $PARTS_PRED = makeKeyword("PARTS-PRED");

    private static final SubLSymbol $SPINDLE_HEAD_MT = makeKeyword("SPINDLE-HEAD-MT");

    private static final SubLSymbol $SPINDLE_MEMBER_MTS = makeKeyword("SPINDLE-MEMBER-MTS");

    private static final SubLSymbol $SPINDLE_COLLECTOR_MT = makeKeyword("SPINDLE-COLLECTOR-MT");

    private static final SubLSymbol $OBJECT_PRED = makeKeyword("OBJECT-PRED");

    private static final SubLSymbol $UNARY_FUNCTIONS = makeKeyword("UNARY-FUNCTIONS");

    private static final SubLSymbol $GEO_SPINDLE_HEAD_MT = makeKeyword("GEO-SPINDLE-HEAD-MT");

    private static final SubLSymbol $GEO_SPINDLE_MEMBER_MTS = makeKeyword("GEO-SPINDLE-MEMBER-MTS");

    private static final SubLSymbol $GEO_SPINDLE_COLLECTOR_MT = makeKeyword("GEO-SPINDLE-COLLECTOR-MT");

    private static final SubLSymbol $GEO_COLLECTIONS = makeKeyword("GEO-COLLECTIONS");

    private static final SubLSymbol $GEO_REGIONS = makeKeyword("GEO-REGIONS");

    private static final SubLSymbol $GEO_LOCATIONS = makeKeyword("GEO-LOCATIONS");

    private static final SubLSymbol $INSTANCES = makeKeyword("INSTANCES");

    static private final SubLString $str_alt64$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt65$_TPTP_KB_CONTENT___a__a__a__a____ = makeString("<TPTP-KB-CONTENT: ~a ~a ~a ~a ... ~a ~a ~a ...>");





    private static final SubLSymbol $COLLECTOR = makeKeyword("COLLECTOR");



    private static final SubLSymbol $REGIONS = makeKeyword("REGIONS");

    private static final SubLSymbol $LOCATIONS = makeKeyword("LOCATIONS");

    public static final SubLSymbol $all_synthetic_terms$ = makeSymbol("*ALL-SYNTHETIC-TERMS*");

    public static final SubLSymbol $all_synthetic_terms_kb_content$ = makeSymbol("*ALL-SYNTHETIC-TERMS-KB-CONTENT*");

    public static final SubLSymbol $all_synthetic_gafs$ = makeSymbol("*ALL-SYNTHETIC-GAFS*");

    static private final SubLSymbol $sym75$SYNTHETIC_TERM_ = makeSymbol("SYNTHETIC-TERM?");

    public static final SubLObject $$Individual = constant_handles.reader_make_constant_shell(makeString("Individual"));

    static private final SubLString $str_alt77$TPTPCol_ = makeString("TPTPCol-");

    public static final SubLObject $$FirstOrderCollection = constant_handles.reader_make_constant_shell(makeString("FirstOrderCollection"));

    public static final SubLObject $$partTypes = constant_handles.reader_make_constant_shell(makeString("partTypes"));

    static private final SubLString $str_alt80$tptpTypes_ = makeString("tptpTypes-");

    public static final SubLFloat $float$0_15 = makeDouble(0.15);

    static private final SubLList $list_alt82 = list(constant_handles.reader_make_constant_shell(makeString("FirstOrderCollection")), constant_handles.reader_make_constant_shell(makeString("FirstOrderCollection")));

    public static final SubLObject $$parts = constant_handles.reader_make_constant_shell(makeString("parts"));

    static private final SubLString $str_alt84$tptp_ = makeString("tptp-");

    static private final SubLString $$$TPTP = makeString("TPTP");

    static private final SubLString $$$TPTPGeo = makeString("TPTPGeo");

    static private final SubLString $$$TPTPQuantity = makeString("TPTPQuantity");

    static private final SubLString $$$tptpOfObject = makeString("tptpOfObject");

    static private final SubLString $$$TPTPQuantityFn = makeString("TPTPQuantityFn");

    private static final SubLSymbol $LEVELS = makeKeyword("LEVELS");

    private static final SubLSymbol $HIGH_MT = makeKeyword("HIGH-MT");

    private static final SubLSymbol $MEDIUM_MT = makeKeyword("MEDIUM-MT");

    private static final SubLSymbol $LOW_MTS = makeKeyword("LOW-MTS");

    static private final SubLString $str_alt94$Col_ = makeString("Col-");

    public static final SubLObject $$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));

    static private final SubLString $$$Generating_synthetic_collections = makeString("Generating synthetic collections");

    static private final SubLString $str_alt97$_ = makeString("-");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    public static final SubLObject $$genls = constant_handles.reader_make_constant_shell(makeString("genls"));

    public static final SubLObject $$disjointWith = constant_handles.reader_make_constant_shell(makeString("disjointWith"));

    static private final SubLString $str_alt101$pred_ = makeString("pred-");

    static private final SubLList $list_alt102 = list(constant_handles.reader_make_constant_shell(makeString("Thing")), constant_handles.reader_make_constant_shell(makeString("Thing")));

    static private final SubLString $str_alt103$Arity__a_predicate_must_have__a_a = makeString("Arity ~a predicate must have ~a arg types, but got ~a");

    static private final SubLString $$$Generating_synthetic_predicates = makeString("Generating synthetic predicates");

    public static final SubLObject $$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));

    public static final SubLObject $$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLObject $$argIsa = constant_handles.reader_make_constant_shell(makeString("argIsa"));

    static private final SubLString $str_alt108$Adding_synthetic_argGenl_assertio = makeString("Adding synthetic argGenl assertions for arg ");

    public static final SubLObject $$argGenl = constant_handles.reader_make_constant_shell(makeString("argGenl"));

    static private final SubLSymbol $sym110$_ = makeSymbol(">");

    private static final SubLSymbol SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");

    static private final SubLString $str_alt112$Generating_instance_level_analogu = makeString("Generating instance-level analogue predicates");

    public static final SubLObject $$implies = constant_handles.reader_make_constant_shell(makeString("implies"));

    static private final SubLList $list_alt114 = list(makeSymbol("?ARG1"), makeSymbol("?ARG2"));

    public static final SubLObject $$relationExistsAll = constant_handles.reader_make_constant_shell(makeString("relationExistsAll"));

    public static final SubLObject $$relationAllExists = constant_handles.reader_make_constant_shell(makeString("relationAllExists"));

    public static final SubLObject $$pragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("pragmaticRequirement"));

    public static final SubLObject $$assertedSentence = constant_handles.reader_make_constant_shell(makeString("assertedSentence"));

    static private final SubLList $list_alt119 = list(makeKeyword("DIRECTION"), makeKeyword("FORWARD"));







    static private final SubLString $str_alt123$_SpindleHeadMt = makeString("-SpindleHeadMt");

    static private final SubLString $str_alt124$_SpindleCollectorMt = makeString("-SpindleCollectorMt");

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    static private final SubLList $list_alt126 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"));

    static private final SubLString $$$Generating_mt_spindle = makeString("Generating mt spindle");

    static private final SubLString $str_alt128$_Member = makeString("-Member");

    static private final SubLString $str_alt129$_Mt = makeString("-Mt");

    static private final SubLList $list_alt130 = list(constant_handles.reader_make_constant_shell(makeString("Microtheory")));

    public static final SubLFloat $float$0_3 = makeDouble(0.3);

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    static private final SubLString $str_alt133$Generating_partTypes_proxy_assert = makeString("Generating partTypes proxy assertions");

    static private final SubLString $$$Generating_synthetic_instances = makeString("Generating synthetic instances");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLString $str_alt137$Generating_instances_of_ = makeString("Generating instances of ");

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    public static final SubLFloat $float$0_2 = makeDouble(0.2);

    static private final SubLList $list_alt140 = list(constant_handles.reader_make_constant_shell(makeString("BinaryPredicate")));

    public static final SubLObject $$arg1Isa = constant_handles.reader_make_constant_shell(makeString("arg1Isa"));

    public static final SubLObject $$arg2Isa = constant_handles.reader_make_constant_shell(makeString("arg2Isa"));

    static private final SubLList $list_alt143 = list(constant_handles.reader_make_constant_shell(makeString("Collection")));

    static private final SubLList $list_alt144 = list(constant_handles.reader_make_constant_shell(makeString("ScalarInterval")));

    static private final SubLString $$$Generating_unary_functions = makeString("Generating unary functions");

    static private final SubLList $list_alt146 = list(constant_handles.reader_make_constant_shell(makeString("UnaryFunction")));

    public static final SubLObject $$arg1QuotedIsa = constant_handles.reader_make_constant_shell(makeString("arg1QuotedIsa"));

    static private final SubLList $list_alt148 = list(constant_handles.reader_make_constant_shell(makeString("SubLInteger")));

    public static final SubLObject $$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));

    static private final SubLString $str_alt150$Generating___relationAllInstance_ = makeString("Generating #$relationAllInstance ");

    static private final SubLString $str_alt151$_assertions = makeString(" assertions");



    public static final SubLObject $$relationAllInstance = constant_handles.reader_make_constant_shell(makeString("relationAllInstance"));

    static private final SubLString $str_alt154$Generating_instance_level_ = makeString("Generating instance-level ");

    static private final SubLList $list_alt155 = list(makeSymbol("&KEY"), list(makeSymbol("LEVELS"), FIVE_INTEGER), list(makeSymbol("X-WIDTH"), THREE_INTEGER), list(makeSymbol("Y-WIDTH"), THREE_INTEGER), list(makeSymbol("TOP-MT"), constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"))), makeSymbol("HIGH-MT"), makeSymbol("MEDIUM-MT"), makeSymbol("LOW-MTS"));

    static private final SubLList $list_alt156 = list(makeKeyword("LEVELS"), makeKeyword("X-WIDTH"), makeKeyword("Y-WIDTH"), makeKeyword("TOP-MT"), makeKeyword("HIGH-MT"), makeKeyword("MEDIUM-MT"), makeKeyword("LOW-MTS"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $X_WIDTH = makeKeyword("X-WIDTH");

    private static final SubLSymbol $Y_WIDTH = makeKeyword("Y-WIDTH");

    private static final SubLSymbol $TOP_MT = makeKeyword("TOP-MT");

    static private final SubLString $str_alt161$GeoLocation_X = makeString("GeoLocation-X");

    static private final SubLString $$$Killing_locations = makeString("Killing locations");

    static private final SubLString $str_alt163$GeoRegion_L = makeString("GeoRegion-L");

    static private final SubLString $$$Killing_regions = makeString("Killing regions");

    static private final SubLString $str_alt165$GeoLevel_ = makeString("GeoLevel-");

    static private final SubLString $$$Killing_levels = makeString("Killing levels");

    static private final SubLList $list_alt167 = list(constant_handles.reader_make_constant_shell(makeString("ExistingObjectType")));

    static private final SubLList $list_alt168 = list(constant_handles.reader_make_constant_shell(makeString("GeographicalRegion")));

    static private final SubLString $str_alt169$Generating_regions_for_level_ = makeString("Generating regions for level ");

    static private final SubLString $str_alt170$_X = makeString("-X");

    static private final SubLString $str_alt171$_Y = makeString("-Y");

    static private final SubLList $list_alt172 = list(constant_handles.reader_make_constant_shell(makeString("Individual")));

    static private final SubLString $$$Generating_locations = makeString("Generating locations");

    static private final SubLString $str_alt174$Classifying_regions_at_level_ = makeString("Classifying regions at level ");

    static private final SubLString $$$Classifying_locations = makeString("Classifying locations");

    public static final SubLObject $$geographicalSubRegions = constant_handles.reader_make_constant_shell(makeString("geographicalSubRegions"));

    public static final SubLObject $$PlanetEarth = constant_handles.reader_make_constant_shell(makeString("PlanetEarth"));

    static private final SubLString $str_alt178$Asserting_geo_superiors_at_level_ = makeString("Asserting geo superiors at level ");

    static private final SubLString $$$Asserting_locations = makeString("Asserting locations");

    public static final SubLObject $$inRegion = constant_handles.reader_make_constant_shell(makeString("inRegion"));

    static private final SubLString $str_alt181$Asserting_borders_for_level_ = makeString("Asserting borders for level ");

    public static final SubLObject $$bordersOn = constant_handles.reader_make_constant_shell(makeString("bordersOn"));

    static private final SubLString $str_alt183$Assert_failed_____ist__s__s_ = makeString("Assert failed: (#$ist ~s ~s)");

    // // Initializers
    public void declareFunctions() {
        declare_tptp_kb_content_generator_file();
    }

    public void initializeVariables() {
        init_tptp_kb_content_generator_file();
    }

    public void runTopLevelForms() {
        setup_tptp_kb_content_generator_file();
    }
}

