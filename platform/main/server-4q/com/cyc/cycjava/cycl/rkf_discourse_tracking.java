/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-DISCOURSE-TRACKING
 * source file: /cyc/top/cycl/rkf-discourse-tracking.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_discourse_tracking extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_discourse_tracking();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_discourse_tracking";


    // defparameter
    // the object containing pointers to the most relevant discourse context
    /**
     * the object containing pointers to the most relevant discourse context
     */
    @LispMethod(comment = "the object containing pointers to the most relevant discourse context\ndefparameter")
    public static final SubLSymbol $rkf_discourse_context$ = makeSymbol("*RKF-DISCOURSE-CONTEXT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rkf_discourse_context$ = makeSymbol("*DTP-RKF-DISCOURSE-CONTEXT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rkf_discourse_mapping$ = makeSymbol("*DTP-RKF-DISCOURSE-MAPPING*");



    static private final SubLSymbol $sym1$RKF_DISC_DISCOURSE_ENTITY_ = makeSymbol("RKF-DISC-DISCOURSE-ENTITY?");

    private static final SubLSymbol RKF_DISCOURSE_CONTEXT = makeSymbol("RKF-DISCOURSE-CONTEXT");

    private static final SubLSymbol RKF_DISCOURSE_CONTEXT_P = makeSymbol("RKF-DISCOURSE-CONTEXT-P");

    static private final SubLList $list4 = list(makeSymbol("EXPLICIT-MAPPINGS"), makeSymbol("DISCOURSE-MT"), makeSymbol("PARENT-CONTEXT"), makeSymbol("PHRASE-INDEX"), makeSymbol("INDEXICAL-INDEX"));

    static private final SubLList $list5 = list(makeKeyword("EXPLICIT-MAPPINGS"), makeKeyword("DISCOURSE-MT"), makeKeyword("PARENT-CONTEXT"), makeKeyword("PHRASE-INDEX"), makeKeyword("INDEXICAL-INDEX"));

    static private final SubLList $list6 = list(makeSymbol("RKF-DC-EXPLICIT-MAPPINGS"), makeSymbol("RKF-DC-DISCOURSE-MT"), makeSymbol("RKF-DC-PARENT-CONTEXT"), makeSymbol("RKF-DC-PHRASE-INDEX"), makeSymbol("RKF-DC-INDEXICAL-INDEX"));

    static private final SubLList $list7 = list(makeSymbol("_CSETF-RKF-DC-EXPLICIT-MAPPINGS"), makeSymbol("_CSETF-RKF-DC-DISCOURSE-MT"), makeSymbol("_CSETF-RKF-DC-PARENT-CONTEXT"), makeSymbol("_CSETF-RKF-DC-PHRASE-INDEX"), makeSymbol("_CSETF-RKF-DC-INDEXICAL-INDEX"));

    private static final SubLSymbol RKF_DISCOURSE_CONTEXT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RKF-DISCOURSE-CONTEXT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list10 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RKF-DISCOURSE-CONTEXT-P"));

    private static final SubLSymbol RKF_DC_EXPLICIT_MAPPINGS = makeSymbol("RKF-DC-EXPLICIT-MAPPINGS");

    private static final SubLSymbol _CSETF_RKF_DC_EXPLICIT_MAPPINGS = makeSymbol("_CSETF-RKF-DC-EXPLICIT-MAPPINGS");

    private static final SubLSymbol RKF_DC_DISCOURSE_MT = makeSymbol("RKF-DC-DISCOURSE-MT");

    private static final SubLSymbol _CSETF_RKF_DC_DISCOURSE_MT = makeSymbol("_CSETF-RKF-DC-DISCOURSE-MT");

    private static final SubLSymbol RKF_DC_PARENT_CONTEXT = makeSymbol("RKF-DC-PARENT-CONTEXT");

    private static final SubLSymbol _CSETF_RKF_DC_PARENT_CONTEXT = makeSymbol("_CSETF-RKF-DC-PARENT-CONTEXT");

    private static final SubLSymbol RKF_DC_PHRASE_INDEX = makeSymbol("RKF-DC-PHRASE-INDEX");

    private static final SubLSymbol _CSETF_RKF_DC_PHRASE_INDEX = makeSymbol("_CSETF-RKF-DC-PHRASE-INDEX");

    private static final SubLSymbol RKF_DC_INDEXICAL_INDEX = makeSymbol("RKF-DC-INDEXICAL-INDEX");

    private static final SubLSymbol _CSETF_RKF_DC_INDEXICAL_INDEX = makeSymbol("_CSETF-RKF-DC-INDEXICAL-INDEX");

    private static final SubLString $str26$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_RKF_DISCOURSE_CONTEXT = makeSymbol("MAKE-RKF-DISCOURSE-CONTEXT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_CONTEXT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-CONTEXT-METHOD");

    private static final SubLSymbol RKF_DISCOURSE_MAPPING = makeSymbol("RKF-DISCOURSE-MAPPING");

    private static final SubLSymbol RKF_DISCOURSE_MAPPING_P = makeSymbol("RKF-DISCOURSE-MAPPING-P");

    private static final SubLList $list34 = list(makeSymbol("INTERPRETATION"), makeSymbol("INDEXICALS"), makeSymbol("PHRASES"));

    private static final SubLList $list35 = list(makeKeyword("INTERPRETATION"), makeKeyword("INDEXICALS"), makeKeyword("PHRASES"));

    private static final SubLList $list36 = list(makeSymbol("RKF-DM-INTERPRETATION"), makeSymbol("RKF-DM-INDEXICALS"), makeSymbol("RKF-DM-PHRASES"));

    private static final SubLList $list37 = list(makeSymbol("_CSETF-RKF-DM-INTERPRETATION"), makeSymbol("_CSETF-RKF-DM-INDEXICALS"), makeSymbol("_CSETF-RKF-DM-PHRASES"));

    private static final SubLSymbol RKF_DISCOURSE_MAPPING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RKF-DISCOURSE-MAPPING-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list39 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RKF-DISCOURSE-MAPPING-P"));

    private static final SubLSymbol RKF_DM_INTERPRETATION = makeSymbol("RKF-DM-INTERPRETATION");

    private static final SubLSymbol _CSETF_RKF_DM_INTERPRETATION = makeSymbol("_CSETF-RKF-DM-INTERPRETATION");

    private static final SubLSymbol RKF_DM_INDEXICALS = makeSymbol("RKF-DM-INDEXICALS");

    private static final SubLSymbol _CSETF_RKF_DM_INDEXICALS = makeSymbol("_CSETF-RKF-DM-INDEXICALS");

    private static final SubLSymbol RKF_DM_PHRASES = makeSymbol("RKF-DM-PHRASES");

    private static final SubLSymbol _CSETF_RKF_DM_PHRASES = makeSymbol("_CSETF-RKF-DM-PHRASES");

    private static final SubLSymbol MAKE_RKF_DISCOURSE_MAPPING = makeSymbol("MAKE-RKF-DISCOURSE-MAPPING");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_MAPPING_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-MAPPING-METHOD");

    private static final SubLList $list51 = list(makeSymbol("INTERP"), makeSymbol("&KEY"), makeSymbol("INDEXICALS"), makeSymbol("PHRASES"));

    private static final SubLList $list52 = list(makeKeyword("INDEXICALS"), makeKeyword("PHRASES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol NEW_RKF_DISCOURSE_MAPPING = makeSymbol("NEW-RKF-DISCOURSE-MAPPING");

    private static final SubLString $str55$mapping_indexicals___S__ = makeString("mapping-indexicals: ~S~%");



    private static final SubLSymbol $sym57$_X = makeSymbol("?X");



    private static final SubLList $list59 = list(reader_make_constant_shell("TheSalientInstance"), reader_make_constant_shell("CourseOfAction"));









    private static final SubLString $str64$_S_is_not_a_valid_indexical = makeString("~S is not a valid indexical");







    // Definitions
    public static final SubLObject rkf_disc_resolve_sentence_entities_alt(SubLObject sentence, SubLObject v_context) {
        {
            SubLObject entities = rkf_disc_find_discourse_entities(sentence);
            SubLObject in_queue = list(sentence);
            SubLObject out_queue = NIL;
            SubLObject cdolist_list_var = entities;
            SubLObject entity = NIL;
            for (entity = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entity = cdolist_list_var.first()) {
                {
                    SubLObject resolutions = rkf_disc_resolve_entity(entity, sentence, v_context);
                    SubLObject cdolist_list_var_1 = in_queue;
                    SubLObject sentence_2 = NIL;
                    for (sentence_2 = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , sentence_2 = cdolist_list_var_1.first()) {
                        {
                            SubLObject cdolist_list_var_3 = resolutions;
                            SubLObject resolution = NIL;
                            for (resolution = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , resolution = cdolist_list_var_3.first()) {
                                out_queue = cons(cycl_utilities.expression_subst(resolution, entity, sentence_2, EQUAL, UNPROVIDED), out_queue);
                            }
                        }
                    }
                }
                in_queue = out_queue;
                out_queue = NIL;
            }
            return in_queue;
        }
    }

    // Definitions
    public static SubLObject rkf_disc_resolve_sentence_entities(final SubLObject sentence, final SubLObject v_context) {
        final SubLObject entities = rkf_disc_find_discourse_entities(sentence);
        SubLObject in_queue = list(sentence);
        SubLObject out_queue = NIL;
        SubLObject cdolist_list_var = entities;
        SubLObject entity = NIL;
        entity = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject resolutions = rkf_disc_resolve_entity(entity, sentence, v_context);
            SubLObject cdolist_list_var_$1 = in_queue;
            SubLObject sentence_$2 = NIL;
            sentence_$2 = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                SubLObject cdolist_list_var_$2 = resolutions;
                SubLObject resolution = NIL;
                resolution = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    out_queue = cons(cycl_utilities.expression_subst(resolution, entity, sentence_$2, EQUAL, UNPROVIDED), out_queue);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    resolution = cdolist_list_var_$2.first();
                } 
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                sentence_$2 = cdolist_list_var_$1.first();
            } 
            in_queue = out_queue;
            out_queue = NIL;
            cdolist_list_var = cdolist_list_var.rest();
            entity = cdolist_list_var.first();
        } 
        return in_queue;
    }

    public static final SubLObject rkf_disc_resolve_entity_alt(SubLObject entity, SubLObject sentence, SubLObject v_context) {
        if (((NIL != narts_high.naut_p(entity)) && (cycl_utilities.formula_arg0(entity) == $$TheResultOfParsing)) || entity.isString()) {
            return rkf_disc_resolve_phrase(v_context, entity);
        } else {
            return rkf_disc_resolve_indexical(v_context, entity);
        }
    }

    public static SubLObject rkf_disc_resolve_entity(final SubLObject entity, final SubLObject sentence, final SubLObject v_context) {
        if (((NIL != narts_high.naut_p(entity)) && cycl_utilities.formula_arg0(entity).eql($$TheResultOfParsing)) || entity.isString()) {
            return rkf_disc_resolve_phrase(v_context, entity);
        }
        return rkf_disc_resolve_indexical(v_context, entity);
    }

    public static final SubLObject rkf_disc_find_discourse_entities_alt(SubLObject sentence) {
        return cycl_utilities.expression_gather(sentence, $sym1$RKF_DISC_DISCOURSE_ENTITY_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_disc_find_discourse_entities(final SubLObject sentence) {
        return cycl_utilities.expression_gather(sentence, $sym1$RKF_DISC_DISCOURSE_ENTITY_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_discourse_context_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rkf_discourse_context_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rkf_discourse_context_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_context_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rkf_discourse_context_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_context_native.class ? T : NIL;
    }

    public static final SubLObject rkf_dc_explicit_mappings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.getField2();
    }

    public static SubLObject rkf_dc_explicit_mappings(final SubLObject v_object) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rkf_dc_discourse_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.getField3();
    }

    public static SubLObject rkf_dc_discourse_mt(final SubLObject v_object) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rkf_dc_parent_context_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.getField4();
    }

    public static SubLObject rkf_dc_parent_context(final SubLObject v_object) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rkf_dc_phrase_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.getField5();
    }

    public static SubLObject rkf_dc_phrase_index(final SubLObject v_object) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rkf_dc_indexical_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.getField6();
    }

    public static SubLObject rkf_dc_indexical_index(final SubLObject v_object) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_rkf_dc_explicit_mappings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rkf_dc_explicit_mappings(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rkf_dc_discourse_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rkf_dc_discourse_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rkf_dc_parent_context_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rkf_dc_parent_context(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rkf_dc_phrase_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rkf_dc_phrase_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rkf_dc_indexical_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_CONTEXT_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rkf_dc_indexical_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_discourse_context_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_context_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_context_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_rkf_discourse_context_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_context_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($EXPLICIT_MAPPINGS)) {
                        _csetf_rkf_dc_explicit_mappings(v_new, current_value);
                    } else {
                        if (pcase_var.eql($DISCOURSE_MT)) {
                            _csetf_rkf_dc_discourse_mt(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PARENT_CONTEXT)) {
                                _csetf_rkf_dc_parent_context(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PHRASE_INDEX)) {
                                    _csetf_rkf_dc_phrase_index(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($INDEXICAL_INDEX)) {
                                        _csetf_rkf_dc_indexical_index(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt25$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_rkf_discourse_context(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_context_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($EXPLICIT_MAPPINGS)) {
                _csetf_rkf_dc_explicit_mappings(v_new, current_value);
            } else
                if (pcase_var.eql($DISCOURSE_MT)) {
                    _csetf_rkf_dc_discourse_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($PARENT_CONTEXT)) {
                        _csetf_rkf_dc_parent_context(v_new, current_value);
                    } else
                        if (pcase_var.eql($PHRASE_INDEX)) {
                            _csetf_rkf_dc_phrase_index(v_new, current_value);
                        } else
                            if (pcase_var.eql($INDEXICAL_INDEX)) {
                                _csetf_rkf_dc_indexical_index(v_new, current_value);
                            } else {
                                Errors.error($str26$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rkf_discourse_context(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RKF_DISCOURSE_CONTEXT, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $EXPLICIT_MAPPINGS, rkf_dc_explicit_mappings(obj));
        funcall(visitor_fn, obj, $SLOT, $DISCOURSE_MT, rkf_dc_discourse_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $PARENT_CONTEXT, rkf_dc_parent_context(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASE_INDEX, rkf_dc_phrase_index(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEXICAL_INDEX, rkf_dc_indexical_index(obj));
        funcall(visitor_fn, obj, $END, MAKE_RKF_DISCOURSE_CONTEXT, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rkf_discourse_context_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_discourse_context(obj, visitor_fn);
    }

    public static final SubLObject new_rkf_discourse_context_alt(SubLObject mt) {
        {
            SubLObject obj = make_rkf_discourse_context(UNPROVIDED);
            _csetf_rkf_dc_discourse_mt(obj, mt);
            _csetf_rkf_dc_parent_context(obj, NIL);
            _csetf_rkf_dc_explicit_mappings(obj, dictionary.new_dictionary(EQUAL, UNPROVIDED));
            _csetf_rkf_dc_phrase_index(obj, dictionary.new_dictionary(EQUAL, UNPROVIDED));
            _csetf_rkf_dc_indexical_index(obj, dictionary.new_dictionary(EQUAL, UNPROVIDED));
            return obj;
        }
    }

    public static SubLObject new_rkf_discourse_context(final SubLObject mt) {
        final SubLObject obj = make_rkf_discourse_context(UNPROVIDED);
        _csetf_rkf_dc_discourse_mt(obj, mt);
        _csetf_rkf_dc_parent_context(obj, NIL);
        _csetf_rkf_dc_explicit_mappings(obj, dictionary.new_dictionary(EQUAL, UNPROVIDED));
        _csetf_rkf_dc_phrase_index(obj, dictionary.new_dictionary(EQUAL, UNPROVIDED));
        _csetf_rkf_dc_indexical_index(obj, dictionary.new_dictionary(EQUAL, UNPROVIDED));
        return obj;
    }

    public static final SubLObject rkf_dc_link_parent_child_discourse_alt(SubLObject parent_disc, SubLObject child_disc) {
        _csetf_rkf_dc_parent_context(child_disc, parent_disc);
        return parent_disc;
    }

    public static SubLObject rkf_dc_link_parent_child_discourse(final SubLObject parent_disc, final SubLObject child_disc) {
        _csetf_rkf_dc_parent_context(child_disc, parent_disc);
        return parent_disc;
    }

    public static final SubLObject rkf_dc_unlink_parent_child_discourse_alt(SubLObject parent_disc, SubLObject child_disc) {
        _csetf_rkf_dc_parent_context(child_disc, NIL);
        return parent_disc;
    }

    public static SubLObject rkf_dc_unlink_parent_child_discourse(final SubLObject parent_disc, final SubLObject child_disc) {
        _csetf_rkf_dc_parent_context(child_disc, NIL);
        return parent_disc;
    }

    public static final SubLObject rkf_discourse_mapping_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rkf_discourse_mapping_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rkf_discourse_mapping_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_mapping_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rkf_discourse_mapping_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_mapping_native.class ? T : NIL;
    }

    public static final SubLObject rkf_dm_interpretation_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_MAPPING_P);
        return v_object.getField2();
    }

    public static SubLObject rkf_dm_interpretation(final SubLObject v_object) {
        assert NIL != rkf_discourse_mapping_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_mapping_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_mapping_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rkf_dm_indexicals_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_MAPPING_P);
        return v_object.getField3();
    }

    public static SubLObject rkf_dm_indexicals(final SubLObject v_object) {
        assert NIL != rkf_discourse_mapping_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_mapping_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_mapping_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rkf_dm_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_MAPPING_P);
        return v_object.getField4();
    }

    public static SubLObject rkf_dm_phrases(final SubLObject v_object) {
        assert NIL != rkf_discourse_mapping_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_mapping_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_mapping_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_rkf_dm_interpretation_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_MAPPING_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rkf_dm_interpretation(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_discourse_mapping_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_mapping_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_mapping_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rkf_dm_indexicals_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_MAPPING_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rkf_dm_indexicals(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_discourse_mapping_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_mapping_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_mapping_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rkf_dm_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RKF_DISCOURSE_MAPPING_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rkf_dm_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != rkf_discourse_mapping_p(v_object) : "! rkf_discourse_tracking.rkf_discourse_mapping_p(v_object) " + "rkf_discourse_tracking.rkf_discourse_mapping_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_rkf_discourse_mapping_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_mapping_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INTERPRETATION)) {
                        _csetf_rkf_dm_interpretation(v_new, current_value);
                    } else {
                        if (pcase_var.eql($INDEXICALS)) {
                            _csetf_rkf_dm_indexicals(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PHRASES)) {
                                _csetf_rkf_dm_phrases(v_new, current_value);
                            } else {
                                Errors.error($str_alt25$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_rkf_discourse_mapping(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_mapping_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INTERPRETATION)) {
                _csetf_rkf_dm_interpretation(v_new, current_value);
            } else
                if (pcase_var.eql($INDEXICALS)) {
                    _csetf_rkf_dm_indexicals(v_new, current_value);
                } else
                    if (pcase_var.eql($PHRASES)) {
                        _csetf_rkf_dm_phrases(v_new, current_value);
                    } else {
                        Errors.error($str26$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rkf_discourse_mapping(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RKF_DISCOURSE_MAPPING, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INTERPRETATION, rkf_dm_interpretation(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEXICALS, rkf_dm_indexicals(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASES, rkf_dm_phrases(obj));
        funcall(visitor_fn, obj, $END, MAKE_RKF_DISCOURSE_MAPPING, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rkf_discourse_mapping_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_discourse_mapping(obj, visitor_fn);
    }

    public static final SubLObject new_rkf_discourse_mapping_alt(SubLObject interp, SubLObject indexicals, SubLObject phrases) {
        {
            SubLObject mapping = make_rkf_discourse_mapping(UNPROVIDED);
            _csetf_rkf_dm_interpretation(mapping, interp);
            _csetf_rkf_dm_indexicals(mapping, indexicals);
            _csetf_rkf_dm_phrases(mapping, phrases);
            return mapping;
        }
    }

    public static SubLObject new_rkf_discourse_mapping(final SubLObject interp, final SubLObject indexicals, final SubLObject phrases) {
        final SubLObject mapping = make_rkf_discourse_mapping(UNPROVIDED);
        _csetf_rkf_dm_interpretation(mapping, interp);
        _csetf_rkf_dm_indexicals(mapping, indexicals);
        _csetf_rkf_dm_phrases(mapping, phrases);
        return mapping;
    }

    public static final SubLObject create_rkf_discourse_indexicals_mapping_alt(SubLObject interp, SubLObject indexicals) {
        return new_rkf_discourse_mapping(interp, indexicals, NIL);
    }

    public static SubLObject create_rkf_discourse_indexicals_mapping(final SubLObject interp, final SubLObject indexicals) {
        return new_rkf_discourse_mapping(interp, indexicals, NIL);
    }

    public static final SubLObject create_rkf_discourse_phrases_mapping_alt(SubLObject interp, SubLObject phrases) {
        return new_rkf_discourse_mapping(interp, NIL, phrases);
    }

    public static SubLObject create_rkf_discourse_phrases_mapping(final SubLObject interp, final SubLObject phrases) {
        return new_rkf_discourse_mapping(interp, NIL, phrases);
    }

    public static final SubLObject create_rkf_discourse_mapping_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject interp = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            interp = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_4 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt42);
                    current_4 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt42);
                    if (NIL == member(current_4, $list_alt43, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_4 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt42);
                }
                {
                    SubLObject indexicals_tail = property_list_member($INDEXICALS, current);
                    SubLObject indexicals = (NIL != indexicals_tail) ? ((SubLObject) (cadr(indexicals_tail))) : NIL;
                    SubLObject phrases_tail = property_list_member($PHRASES, current);
                    SubLObject phrases = (NIL != phrases_tail) ? ((SubLObject) (cadr(phrases_tail))) : NIL;
                    return list(NEW_RKF_DISCOURSE_MAPPING, interp, indexicals, phrases);
                }
            }
        }
    }

    public static SubLObject create_rkf_discourse_mapping(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        interp = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list51);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list51);
            if (NIL == member(current_$4, $list52, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list51);
        }
        final SubLObject indexicals_tail = property_list_member($INDEXICALS, current);
        final SubLObject indexicals = (NIL != indexicals_tail) ? cadr(indexicals_tail) : NIL;
        final SubLObject phrases_tail = property_list_member($PHRASES, current);
        final SubLObject phrases = (NIL != phrases_tail) ? cadr(phrases_tail) : NIL;
        return list(NEW_RKF_DISCOURSE_MAPPING, interp, indexicals, phrases);
    }

    public static final SubLObject rkf_dc_add_mapping_alt(SubLObject v_context, SubLObject mapping) {
        {
            SubLObject mappings = rkf_dc_explicit_mappings(v_context);
            SubLObject phrase_index = rkf_dc_phrase_index(v_context);
            SubLObject phrases = rkf_dm_phrases(mapping);
            SubLObject indexical_index = rkf_dc_indexical_index(v_context);
            SubLObject indexicals = rkf_dm_indexicals(mapping);
            Errors.warn($str_alt46$mapping_indexicals___S__, indexicals);
            {
                SubLObject cdolist_list_var = phrases;
                SubLObject phrase = NIL;
                for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                    dictionary_utilities.dictionary_pushnew(phrase_index, phrase, mapping, UNPROVIDED, UNPROVIDED);
                }
            }
            {
                SubLObject cdolist_list_var = indexicals;
                SubLObject indexical = NIL;
                for (indexical = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical = cdolist_list_var.first()) {
                    dictionary_utilities.dictionary_pushnew(indexical_index, indexical, mapping, UNPROVIDED, UNPROVIDED);
                }
            }
            return dictionary_utilities.dictionary_pushnew(mappings, rkf_dm_interpretation(mapping), mapping, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject rkf_dc_add_mapping(final SubLObject v_context, final SubLObject mapping) {
        final SubLObject mappings = rkf_dc_explicit_mappings(v_context);
        final SubLObject phrase_index = rkf_dc_phrase_index(v_context);
        final SubLObject phrases = rkf_dm_phrases(mapping);
        final SubLObject indexical_index = rkf_dc_indexical_index(v_context);
        final SubLObject indexicals = rkf_dm_indexicals(mapping);
        Errors.warn($str55$mapping_indexicals___S__, indexicals);
        SubLObject cdolist_list_var = phrases;
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_pushnew(phrase_index, phrase, mapping, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        cdolist_list_var = indexicals;
        SubLObject indexical = NIL;
        indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_pushnew(indexical_index, indexical, mapping, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        } 
        return dictionary_utilities.dictionary_pushnew(mappings, rkf_dm_interpretation(mapping), mapping, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_dc_remove_mapping_alt(SubLObject v_context, SubLObject mapping) {
        {
            SubLObject mappings = rkf_dc_explicit_mappings(v_context);
            SubLObject phrase_index = rkf_dc_phrase_index(v_context);
            SubLObject phrases = rkf_dm_phrases(mapping);
            SubLObject indexical_index = rkf_dc_indexical_index(v_context);
            SubLObject indexicals = rkf_dm_indexicals(mapping);
            {
                SubLObject cdolist_list_var = indexicals;
                SubLObject indexical = NIL;
                for (indexical = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indexical = cdolist_list_var.first()) {
                    dictionary_utilities.dictionary_remove_from_value(indexical_index, indexical, mapping, UNPROVIDED, UNPROVIDED);
                }
            }
            {
                SubLObject cdolist_list_var = phrases;
                SubLObject phrase = NIL;
                for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                    dictionary_utilities.dictionary_remove_from_value(phrase_index, phrase, mapping, UNPROVIDED, UNPROVIDED);
                }
            }
            return dictionary_utilities.dictionary_remove_from_value(mappings, rkf_dm_interpretation(mapping), mapping, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject rkf_dc_remove_mapping(final SubLObject v_context, final SubLObject mapping) {
        final SubLObject mappings = rkf_dc_explicit_mappings(v_context);
        final SubLObject phrase_index = rkf_dc_phrase_index(v_context);
        final SubLObject phrases = rkf_dm_phrases(mapping);
        final SubLObject indexical_index = rkf_dc_indexical_index(v_context);
        SubLObject cdolist_list_var;
        final SubLObject indexicals = cdolist_list_var = rkf_dm_indexicals(mapping);
        SubLObject indexical = NIL;
        indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_remove_from_value(indexical_index, indexical, mapping, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        } 
        cdolist_list_var = phrases;
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_remove_from_value(phrase_index, phrase, mapping, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        return dictionary_utilities.dictionary_remove_from_value(mappings, rkf_dm_interpretation(mapping), mapping, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_disc_resolve_phrase_local_alt(SubLObject v_context, SubLObject phrase) {
        {
            SubLObject phrase_index = rkf_dc_phrase_index(v_context);
            SubLObject result = NIL;
            result = rkf_disc_interp_for_phrase(phrase_index, phrase);
            return result;
        }
    }

    public static SubLObject rkf_disc_resolve_phrase_local(final SubLObject v_context, final SubLObject phrase) {
        final SubLObject phrase_index = rkf_dc_phrase_index(v_context);
        SubLObject result = NIL;
        result = rkf_disc_interp_for_phrase(phrase_index, phrase);
        return result;
    }

    public static final SubLObject rkf_disc_interp_for_phrase_alt(SubLObject index, SubLObject entity) {
        {
            SubLObject phrase = rkf_disc_phrase_from_phrase_entity(entity);
            SubLObject mappings = dictionary.dictionary_lookup(index, phrase, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = mappings;
            SubLObject mapping = NIL;
            for (mapping = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapping = cdolist_list_var.first()) {
                {
                    SubLObject item_var = rkf_dm_interpretation(mapping);
                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject rkf_disc_interp_for_phrase(final SubLObject index, final SubLObject entity) {
        final SubLObject phrase = rkf_disc_phrase_from_phrase_entity(entity);
        final SubLObject mappings = dictionary.dictionary_lookup(index, phrase, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = mappings;
        SubLObject mapping = NIL;
        mapping = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = rkf_dm_interpretation(mapping);
            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                result = cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapping = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject rkf_disc_phrase_from_phrase_entity_alt(SubLObject entity) {
        if (entity.isString()) {
            return entity;
        } else {
            if (NIL != parsing_utilities.result_of_parsing_formulaP(entity)) {
                return parsing_utilities.result_of_parsing_words(entity);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject rkf_disc_phrase_from_phrase_entity(final SubLObject entity) {
        if (entity.isString()) {
            return entity;
        }
        if (NIL != parsing_utilities.result_of_parsing_formulaP(entity)) {
            return parsing_utilities.result_of_parsing_words(entity);
        }
        return NIL;
    }

    public static final SubLObject rkf_disc_resolve_indexical_local_alt(SubLObject v_context, SubLObject indexical) {
        {
            SubLObject result = rkf_disc_resolve_indexical_wXlocal_mappings(v_context, indexical);
            if (NIL == result) {
                result = rkf_disc_resolve_coa(v_context, indexical);
            }
            return result;
        }
    }

    public static SubLObject rkf_disc_resolve_indexical_local(final SubLObject v_context, final SubLObject indexical) {
        SubLObject result = rkf_disc_resolve_indexical_wXlocal_mappings(v_context, indexical);
        if (NIL == result) {
            result = rkf_disc_resolve_coa(v_context, indexical);
        }
        return result;
    }

    public static final SubLObject rkf_disc_resolve_coa_alt(SubLObject v_context, SubLObject indexical) {
        if (NIL != rkf_disc_salient_individual_of_type_formulaP(indexical, $$CourseOfAction)) {
            {
                SubLObject mt = rkf_dc_discourse_mt(v_context);
                SubLObject result = backward.removal_ask_variable($sym48$_X, list($$coaDescribingSpecification, $sym48$_X, mt), mt, UNPROVIDED, UNPROVIDED);
                if (NIL == result) {
                    result = $list_alt50;
                }
                return result;
            }
        }
        return NIL;
    }

    public static SubLObject rkf_disc_resolve_coa(final SubLObject v_context, final SubLObject indexical) {
        if (NIL != rkf_disc_salient_individual_of_type_formulaP(indexical, $$CourseOfAction)) {
            final SubLObject mt = rkf_dc_discourse_mt(v_context);
            SubLObject result = backward.removal_ask_variable($sym57$_X, list($$coaDescribingSpecification, $sym57$_X, mt), mt, UNPROVIDED, UNPROVIDED);
            if (NIL == result) {
                result = $list59;
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject rkf_disc_resolve_indexical_wXlocal_mappings_alt(SubLObject v_context, SubLObject indexical) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject index = rkf_dc_indexical_index(v_context);
                SubLObject mt = rkf_dc_discourse_mt(v_context);
                SubLObject result = NIL;
                dictionary_utilities.print_dictionary_contents(index, UNPROVIDED);
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject known_indexical = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject mappings = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject query = rkf_disc_easily_testable_formula(known_indexical, indexical);
                                if (NIL == query) {
                                    {
                                        SubLObject var = cycl_utilities.formula_arg1(known_indexical, UNPROVIDED);
                                        SubLObject antecedent = cycl_utilities.formula_arg2(known_indexical, UNPROVIDED);
                                        SubLObject consequent = rkf_disc_consequent_from_indexical(var, indexical);
                                        query = list($$implies, antecedent, consequent);
                                    }
                                }
                                if (NIL != rkf_query_utilities.rkf_query(query, mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED)) {
                                    {
                                        SubLObject cdolist_list_var = mappings;
                                        SubLObject mapping = NIL;
                                        for (mapping = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapping = cdolist_list_var.first()) {
                                            {
                                                SubLObject item_var = rkf_dm_interpretation(mapping);
                                                if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                                                    result = cons(item_var, result);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return result;
            }
        }
    }

    public static SubLObject rkf_disc_resolve_indexical_wXlocal_mappings(final SubLObject v_context, final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index = rkf_dc_indexical_index(v_context);
        final SubLObject mt = rkf_dc_discourse_mt(v_context);
        SubLObject result = NIL;
        dictionary_utilities.print_dictionary_contents(index, UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject known_indexical = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mappings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject query = rkf_disc_easily_testable_formula(known_indexical, indexical);
            if (NIL == query) {
                final SubLObject var = cycl_utilities.formula_arg1(known_indexical, UNPROVIDED);
                final SubLObject antecedent = cycl_utilities.formula_arg2(known_indexical, UNPROVIDED);
                final SubLObject consequent = rkf_disc_consequent_from_indexical(var, indexical);
                query = list($$implies, antecedent, consequent);
            }
            if (NIL != rkf_query_utilities.rkf_query(query, mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED)) {
                SubLObject cdolist_list_var = mappings;
                SubLObject mapping = NIL;
                mapping = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = rkf_dm_interpretation(mapping);
                    if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mapping = cdolist_list_var.first();
                } 
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static final SubLObject rkf_disc_consequent_from_indexical_alt(SubLObject var, SubLObject indexical) {
        if ((cycl_utilities.formula_arg0(indexical) == $$TheSalientInstance) || (cycl_utilities.formula_arg0(indexical) == $$SomeFn)) {
            return list($$isa, var, cycl_utilities.formula_arg1(indexical, UNPROVIDED));
        }
        return Errors.error($str_alt55$_S_is_not_a_valid_indexical, indexical);
    }

    public static SubLObject rkf_disc_consequent_from_indexical(final SubLObject var, final SubLObject indexical) {
        if (cycl_utilities.formula_arg0(indexical).eql($$TheSalientInstance) || cycl_utilities.formula_arg0(indexical).eql($$SomeFn)) {
            return list($$isa, var, cycl_utilities.formula_arg1(indexical, UNPROVIDED));
        }
        return Errors.error($str64$_S_is_not_a_valid_indexical, indexical);
    }

    /**
     * this should be improved to try to get all of the terms into genls relations,
     * in case there's more than one thing known about the known-indexical 26Sept2002
     */
    @LispMethod(comment = "this should be improved to try to get all of the terms into genls relations,\r\nin case there\'s more than one thing known about the known-indexical 26Sept2002\nthis should be improved to try to get all of the terms into genls relations,\nin case there\'s more than one thing known about the known-indexical 26Sept2002")
    public static final SubLObject rkf_disc_easily_testable_formula_alt(SubLObject known_indexical, SubLObject indexical) {
        {
            SubLObject var = cycl_utilities.formula_arg1(known_indexical, UNPROVIDED);
            SubLObject indexical_constraint_sentence = cycl_utilities.formula_arg2(known_indexical, UNPROVIDED);
            SubLObject indexical_constraint_list = indexical_constraint_sentence.rest();
            SubLObject isa_to_resolve = cycl_utilities.formula_arg1(indexical, UNPROVIDED);
            if ((NIL != list_utilities.lengthE(indexical_constraint_list, ONE_INTEGER, UNPROVIDED)) && (cycl_utilities.formula_arg0(indexical_constraint_list.first()) == $$isa)) {
                return list($$genls, isa_to_resolve, cycl_utilities.formula_arg2(indexical_constraint_list.first(), UNPROVIDED));
            }
            return NIL;
        }
    }

    /**
     * this should be improved to try to get all of the terms into genls relations,
     * in case there's more than one thing known about the known-indexical 26Sept2002
     */
    @LispMethod(comment = "this should be improved to try to get all of the terms into genls relations,\r\nin case there\'s more than one thing known about the known-indexical 26Sept2002\nthis should be improved to try to get all of the terms into genls relations,\nin case there\'s more than one thing known about the known-indexical 26Sept2002")
    public static SubLObject rkf_disc_easily_testable_formula(final SubLObject known_indexical, final SubLObject indexical) {
        final SubLObject var = cycl_utilities.formula_arg1(known_indexical, UNPROVIDED);
        final SubLObject indexical_constraint_sentence = cycl_utilities.formula_arg2(known_indexical, UNPROVIDED);
        final SubLObject indexical_constraint_list = indexical_constraint_sentence.rest();
        final SubLObject isa_to_resolve = cycl_utilities.formula_arg1(indexical, UNPROVIDED);
        if ((NIL != list_utilities.lengthE(indexical_constraint_list, ONE_INTEGER, UNPROVIDED)) && cycl_utilities.formula_arg0(indexical_constraint_list.first()).eql($$isa)) {
            return list($$genls, isa_to_resolve, cycl_utilities.formula_arg2(indexical_constraint_list.first(), UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject rkf_disc_resolve_phrase_alt(SubLObject v_context, SubLObject phrase) {
        {
            SubLObject result = rkf_disc_resolve_phrase_local(v_context, phrase);
            if (NIL != result) {
                return result;
            } else {
                if (NIL != rkf_dc_parent_context(v_context)) {
                    return rkf_disc_resolve_phrase(rkf_dc_parent_context(v_context), phrase);
                } else {
                    return list(phrase);
                }
            }
        }
    }

    public static SubLObject rkf_disc_resolve_phrase(final SubLObject v_context, final SubLObject phrase) {
        final SubLObject result = rkf_disc_resolve_phrase_local(v_context, phrase);
        if (NIL != result) {
            return result;
        }
        if (NIL != rkf_dc_parent_context(v_context)) {
            return rkf_disc_resolve_phrase(rkf_dc_parent_context(v_context), phrase);
        }
        return list(phrase);
    }

    /**
     *
     *
     * @return LISTP of possible resolutions of INDEXICAL from CONTEXT.
     */
    @LispMethod(comment = "@return LISTP of possible resolutions of INDEXICAL from CONTEXT.")
    public static final SubLObject rkf_disc_resolve_indexical_alt(SubLObject v_context, SubLObject indexical) {
        {
            SubLObject local_result = rkf_disc_resolve_indexical_local(v_context, indexical);
            if (NIL != local_result) {
                return local_result;
            } else {
                if (NIL != rkf_dc_parent_context(v_context)) {
                    return rkf_disc_resolve_indexical(rkf_dc_parent_context(v_context), indexical);
                } else {
                    return list(indexical);
                }
            }
        }
    }

    /**
     *
     *
     * @return LISTP of possible resolutions of INDEXICAL from CONTEXT.
     */
    @LispMethod(comment = "@return LISTP of possible resolutions of INDEXICAL from CONTEXT.")
    public static SubLObject rkf_disc_resolve_indexical(final SubLObject v_context, final SubLObject indexical) {
        final SubLObject local_result = rkf_disc_resolve_indexical_local(v_context, indexical);
        if (NIL != local_result) {
            return local_result;
        }
        if (NIL != rkf_dc_parent_context(v_context)) {
            return rkf_disc_resolve_indexical(rkf_dc_parent_context(v_context), indexical);
        }
        return list(indexical);
    }

    public static final SubLObject rkf_disc_potentially_resolvable_entityP_alt(SubLObject entity, SubLObject v_context) {
        if (NIL != parsing_utilities.result_of_parsing_formulaP(entity)) {
            return list_utilities.sublisp_boolean(rkf_disc_resolve_phrase(v_context, entity));
        } else {
            return T;
        }
    }

    public static SubLObject rkf_disc_potentially_resolvable_entityP(final SubLObject entity, final SubLObject v_context) {
        if (NIL != parsing_utilities.result_of_parsing_formulaP(entity)) {
            return list_utilities.sublisp_boolean(rkf_disc_resolve_phrase(v_context, entity));
        }
        return T;
    }

    public static final SubLObject rkf_disc_salient_individual_of_type_formulaP_alt(SubLObject formula, SubLObject type) {
        return makeBoolean((NIL != rkf_disc_salient_individual_formulaP(formula)) && cycl_utilities.formula_arg1(formula, UNPROVIDED).equal(type));
    }

    public static SubLObject rkf_disc_salient_individual_of_type_formulaP(final SubLObject formula, final SubLObject type) {
        return makeBoolean((NIL != rkf_disc_salient_individual_formulaP(formula)) && cycl_utilities.formula_arg1(formula, UNPROVIDED).equal(type));
    }

    public static final SubLObject rkf_disc_salient_individual_formulaP_alt(SubLObject obj) {
        return makeBoolean((NIL != rkf_disc_salient_instance_formulaP(obj)) || (NIL != rkf_disc_somefn_formulaP(obj)));
    }

    public static SubLObject rkf_disc_salient_individual_formulaP(final SubLObject obj) {
        return makeBoolean((NIL != rkf_disc_salient_instance_formulaP(obj)) || (NIL != rkf_disc_somefn_formulaP(obj)));
    }

    public static final SubLObject rkf_disc_somefn_formulaP_alt(SubLObject obj) {
        return makeBoolean((NIL != narts_high.naut_p(obj)) && (cycl_utilities.formula_arg0(obj) == $$SomeFn));
    }

    public static SubLObject rkf_disc_somefn_formulaP(final SubLObject obj) {
        return makeBoolean((NIL != narts_high.naut_p(obj)) && cycl_utilities.formula_arg0(obj).eql($$SomeFn));
    }

    public static final SubLObject rkf_disc_salient_instance_formulaP_alt(SubLObject obj) {
        return makeBoolean((NIL != narts_high.naut_p(obj)) && (cycl_utilities.formula_arg0(obj) == $$TheSalientInstance));
    }

    public static SubLObject rkf_disc_salient_instance_formulaP(final SubLObject obj) {
        return makeBoolean((NIL != narts_high.naut_p(obj)) && cycl_utilities.formula_arg0(obj).eql($$TheSalientInstance));
    }

    public static final SubLObject rkf_disc_discourse_entityP_alt(SubLObject obj) {
        return makeBoolean(((NIL != rkf_disc_salient_instance_formulaP(obj)) || (NIL != parsing_utilities.result_of_parsing_formulaP(obj))) || ((NIL != narts_high.naut_p(obj)) && ($$SomeFn == cycl_utilities.formula_arg0(obj))));
    }

    public static SubLObject rkf_disc_discourse_entityP(final SubLObject obj) {
        return makeBoolean(((NIL != rkf_disc_salient_instance_formulaP(obj)) || (NIL != parsing_utilities.result_of_parsing_formulaP(obj))) || ((NIL != narts_high.naut_p(obj)) && $$SomeFn.eql(cycl_utilities.formula_arg0(obj))));
    }

    public static final SubLObject rkf_disc_implied_indexicals_formulaP_alt(SubLObject obj) {
        return rkf_disc_salient_instance_formulaP(obj);
    }

    public static SubLObject rkf_disc_implied_indexicals_formulaP(final SubLObject obj) {
        return rkf_disc_salient_instance_formulaP(obj);
    }

    public static final SubLObject rkf_make_discourse_formula_from_constraints_alt(SubLObject isas, SubLObject v_genls) {
        {
            SubLObject variable = $sym48$_X;
            SubLObject formula = NIL;
            {
                SubLObject cdolist_list_var = isas;
                SubLObject v_isa = NIL;
                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                    formula = cons(make_binary_formula($$isa, variable, v_isa), formula);
                }
            }
            {
                SubLObject cdolist_list_var = v_genls;
                SubLObject genl = NIL;
                for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                    formula = cons(make_binary_formula($$genls, variable, genl), formula);
                }
            }
            formula = cons($$and, formula);
            return make_binary_formula($$TheSalientFn, variable, formula);
        }
    }

    public static SubLObject rkf_make_discourse_formula_from_constraints(final SubLObject isas, final SubLObject v_genls) {
        final SubLObject variable = $sym57$_X;
        SubLObject formula = NIL;
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            formula = cons(make_binary_formula($$isa, variable, v_isa), formula);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            formula = cons(make_binary_formula($$genls, variable, genl), formula);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        formula = cons($$and, formula);
        return make_binary_formula($$TheSalientFn, variable, formula);
    }

    public static final SubLObject rkf_discourse_bundle_ar_concept_alt(SubLObject obj) {
        return obj.first();
    }

    public static SubLObject rkf_discourse_bundle_ar_concept(final SubLObject obj) {
        return obj.first();
    }

    public static final SubLObject rkf_discourse_bundle_original_alt(SubLObject obj) {
        return second(obj);
    }

    public static SubLObject rkf_discourse_bundle_original(final SubLObject obj) {
        return second(obj);
    }

    public static final SubLObject rkf_discourse_bundle_options_alt(SubLObject obj) {
        return third(obj);
    }

    public static SubLObject rkf_discourse_bundle_options(final SubLObject obj) {
        return third(obj);
    }

    public static SubLObject declare_rkf_discourse_tracking_file() {
        declareFunction("rkf_disc_resolve_sentence_entities", "RKF-DISC-RESOLVE-SENTENCE-ENTITIES", 2, 0, false);
        declareFunction("rkf_disc_resolve_entity", "RKF-DISC-RESOLVE-ENTITY", 3, 0, false);
        declareFunction("rkf_disc_find_discourse_entities", "RKF-DISC-FIND-DISCOURSE-ENTITIES", 1, 0, false);
        declareFunction("rkf_discourse_context_print_function_trampoline", "RKF-DISCOURSE-CONTEXT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rkf_discourse_context_p", "RKF-DISCOURSE-CONTEXT-P", 1, 0, false);
        new rkf_discourse_tracking.$rkf_discourse_context_p$UnaryFunction();
        declareFunction("rkf_dc_explicit_mappings", "RKF-DC-EXPLICIT-MAPPINGS", 1, 0, false);
        declareFunction("rkf_dc_discourse_mt", "RKF-DC-DISCOURSE-MT", 1, 0, false);
        declareFunction("rkf_dc_parent_context", "RKF-DC-PARENT-CONTEXT", 1, 0, false);
        declareFunction("rkf_dc_phrase_index", "RKF-DC-PHRASE-INDEX", 1, 0, false);
        declareFunction("rkf_dc_indexical_index", "RKF-DC-INDEXICAL-INDEX", 1, 0, false);
        declareFunction("_csetf_rkf_dc_explicit_mappings", "_CSETF-RKF-DC-EXPLICIT-MAPPINGS", 2, 0, false);
        declareFunction("_csetf_rkf_dc_discourse_mt", "_CSETF-RKF-DC-DISCOURSE-MT", 2, 0, false);
        declareFunction("_csetf_rkf_dc_parent_context", "_CSETF-RKF-DC-PARENT-CONTEXT", 2, 0, false);
        declareFunction("_csetf_rkf_dc_phrase_index", "_CSETF-RKF-DC-PHRASE-INDEX", 2, 0, false);
        declareFunction("_csetf_rkf_dc_indexical_index", "_CSETF-RKF-DC-INDEXICAL-INDEX", 2, 0, false);
        declareFunction("make_rkf_discourse_context", "MAKE-RKF-DISCOURSE-CONTEXT", 0, 1, false);
        declareFunction("visit_defstruct_rkf_discourse_context", "VISIT-DEFSTRUCT-RKF-DISCOURSE-CONTEXT", 2, 0, false);
        declareFunction("visit_defstruct_object_rkf_discourse_context_method", "VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-CONTEXT-METHOD", 2, 0, false);
        declareFunction("new_rkf_discourse_context", "NEW-RKF-DISCOURSE-CONTEXT", 1, 0, false);
        declareFunction("rkf_dc_link_parent_child_discourse", "RKF-DC-LINK-PARENT-CHILD-DISCOURSE", 2, 0, false);
        declareFunction("rkf_dc_unlink_parent_child_discourse", "RKF-DC-UNLINK-PARENT-CHILD-DISCOURSE", 2, 0, false);
        declareFunction("rkf_discourse_mapping_print_function_trampoline", "RKF-DISCOURSE-MAPPING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rkf_discourse_mapping_p", "RKF-DISCOURSE-MAPPING-P", 1, 0, false);
        new rkf_discourse_tracking.$rkf_discourse_mapping_p$UnaryFunction();
        declareFunction("rkf_dm_interpretation", "RKF-DM-INTERPRETATION", 1, 0, false);
        declareFunction("rkf_dm_indexicals", "RKF-DM-INDEXICALS", 1, 0, false);
        declareFunction("rkf_dm_phrases", "RKF-DM-PHRASES", 1, 0, false);
        declareFunction("_csetf_rkf_dm_interpretation", "_CSETF-RKF-DM-INTERPRETATION", 2, 0, false);
        declareFunction("_csetf_rkf_dm_indexicals", "_CSETF-RKF-DM-INDEXICALS", 2, 0, false);
        declareFunction("_csetf_rkf_dm_phrases", "_CSETF-RKF-DM-PHRASES", 2, 0, false);
        declareFunction("make_rkf_discourse_mapping", "MAKE-RKF-DISCOURSE-MAPPING", 0, 1, false);
        declareFunction("visit_defstruct_rkf_discourse_mapping", "VISIT-DEFSTRUCT-RKF-DISCOURSE-MAPPING", 2, 0, false);
        declareFunction("visit_defstruct_object_rkf_discourse_mapping_method", "VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-MAPPING-METHOD", 2, 0, false);
        declareFunction("new_rkf_discourse_mapping", "NEW-RKF-DISCOURSE-MAPPING", 3, 0, false);
        declareFunction("create_rkf_discourse_indexicals_mapping", "CREATE-RKF-DISCOURSE-INDEXICALS-MAPPING", 2, 0, false);
        declareFunction("create_rkf_discourse_phrases_mapping", "CREATE-RKF-DISCOURSE-PHRASES-MAPPING", 2, 0, false);
        declareMacro("create_rkf_discourse_mapping", "CREATE-RKF-DISCOURSE-MAPPING");
        declareFunction("rkf_dc_add_mapping", "RKF-DC-ADD-MAPPING", 2, 0, false);
        declareFunction("rkf_dc_remove_mapping", "RKF-DC-REMOVE-MAPPING", 2, 0, false);
        declareFunction("rkf_disc_resolve_phrase_local", "RKF-DISC-RESOLVE-PHRASE-LOCAL", 2, 0, false);
        declareFunction("rkf_disc_interp_for_phrase", "RKF-DISC-INTERP-FOR-PHRASE", 2, 0, false);
        declareFunction("rkf_disc_phrase_from_phrase_entity", "RKF-DISC-PHRASE-FROM-PHRASE-ENTITY", 1, 0, false);
        declareFunction("rkf_disc_resolve_indexical_local", "RKF-DISC-RESOLVE-INDEXICAL-LOCAL", 2, 0, false);
        declareFunction("rkf_disc_resolve_coa", "RKF-DISC-RESOLVE-COA", 2, 0, false);
        declareFunction("rkf_disc_resolve_indexical_wXlocal_mappings", "RKF-DISC-RESOLVE-INDEXICAL-W/LOCAL-MAPPINGS", 2, 0, false);
        declareFunction("rkf_disc_consequent_from_indexical", "RKF-DISC-CONSEQUENT-FROM-INDEXICAL", 2, 0, false);
        declareFunction("rkf_disc_easily_testable_formula", "RKF-DISC-EASILY-TESTABLE-FORMULA", 2, 0, false);
        declareFunction("rkf_disc_resolve_phrase", "RKF-DISC-RESOLVE-PHRASE", 2, 0, false);
        declareFunction("rkf_disc_resolve_indexical", "RKF-DISC-RESOLVE-INDEXICAL", 2, 0, false);
        declareFunction("rkf_disc_potentially_resolvable_entityP", "RKF-DISC-POTENTIALLY-RESOLVABLE-ENTITY?", 2, 0, false);
        declareFunction("rkf_disc_salient_individual_of_type_formulaP", "RKF-DISC-SALIENT-INDIVIDUAL-OF-TYPE-FORMULA?", 2, 0, false);
        declareFunction("rkf_disc_salient_individual_formulaP", "RKF-DISC-SALIENT-INDIVIDUAL-FORMULA?", 1, 0, false);
        declareFunction("rkf_disc_somefn_formulaP", "RKF-DISC-SOMEFN-FORMULA?", 1, 0, false);
        declareFunction("rkf_disc_salient_instance_formulaP", "RKF-DISC-SALIENT-INSTANCE-FORMULA?", 1, 0, false);
        declareFunction("rkf_disc_discourse_entityP", "RKF-DISC-DISCOURSE-ENTITY?", 1, 0, false);
        declareFunction("rkf_disc_implied_indexicals_formulaP", "RKF-DISC-IMPLIED-INDEXICALS-FORMULA?", 1, 0, false);
        declareFunction("rkf_make_discourse_formula_from_constraints", "RKF-MAKE-DISCOURSE-FORMULA-FROM-CONSTRAINTS", 2, 0, false);
        declareFunction("rkf_discourse_bundle_ar_concept", "RKF-DISCOURSE-BUNDLE-AR-CONCEPT", 1, 0, false);
        declareFunction("rkf_discourse_bundle_original", "RKF-DISCOURSE-BUNDLE-ORIGINAL", 1, 0, false);
        declareFunction("rkf_discourse_bundle_options", "RKF-DISCOURSE-BUNDLE-OPTIONS", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt4 = list(makeSymbol("EXPLICIT-MAPPINGS"), makeSymbol("DISCOURSE-MT"), makeSymbol("PARENT-CONTEXT"), makeSymbol("PHRASE-INDEX"), makeSymbol("INDEXICAL-INDEX"));

    static private final SubLList $list_alt5 = list(makeKeyword("EXPLICIT-MAPPINGS"), makeKeyword("DISCOURSE-MT"), makeKeyword("PARENT-CONTEXT"), makeKeyword("PHRASE-INDEX"), makeKeyword("INDEXICAL-INDEX"));

    static private final SubLList $list_alt6 = list(makeSymbol("RKF-DC-EXPLICIT-MAPPINGS"), makeSymbol("RKF-DC-DISCOURSE-MT"), makeSymbol("RKF-DC-PARENT-CONTEXT"), makeSymbol("RKF-DC-PHRASE-INDEX"), makeSymbol("RKF-DC-INDEXICAL-INDEX"));

    static private final SubLList $list_alt7 = list(makeSymbol("_CSETF-RKF-DC-EXPLICIT-MAPPINGS"), makeSymbol("_CSETF-RKF-DC-DISCOURSE-MT"), makeSymbol("_CSETF-RKF-DC-PARENT-CONTEXT"), makeSymbol("_CSETF-RKF-DC-PHRASE-INDEX"), makeSymbol("_CSETF-RKF-DC-INDEXICAL-INDEX"));

    public static SubLObject init_rkf_discourse_tracking_file() {
        defparameter("*RKF-DISCOURSE-CONTEXT*", NIL);
        defconstant("*DTP-RKF-DISCOURSE-CONTEXT*", RKF_DISCOURSE_CONTEXT);
        defconstant("*DTP-RKF-DISCOURSE-MAPPING*", RKF_DISCOURSE_MAPPING);
        return NIL;
    }

    public static SubLObject setup_rkf_discourse_tracking_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rkf_discourse_context$.getGlobalValue(), symbol_function(RKF_DISCOURSE_CONTEXT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list10);
        def_csetf(RKF_DC_EXPLICIT_MAPPINGS, _CSETF_RKF_DC_EXPLICIT_MAPPINGS);
        def_csetf(RKF_DC_DISCOURSE_MT, _CSETF_RKF_DC_DISCOURSE_MT);
        def_csetf(RKF_DC_PARENT_CONTEXT, _CSETF_RKF_DC_PARENT_CONTEXT);
        def_csetf(RKF_DC_PHRASE_INDEX, _CSETF_RKF_DC_PHRASE_INDEX);
        def_csetf(RKF_DC_INDEXICAL_INDEX, _CSETF_RKF_DC_INDEXICAL_INDEX);
        identity(RKF_DISCOURSE_CONTEXT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_discourse_context$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_CONTEXT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rkf_discourse_mapping$.getGlobalValue(), symbol_function(RKF_DISCOURSE_MAPPING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list39);
        def_csetf(RKF_DM_INTERPRETATION, _CSETF_RKF_DM_INTERPRETATION);
        def_csetf(RKF_DM_INDEXICALS, _CSETF_RKF_DM_INDEXICALS);
        def_csetf(RKF_DM_PHRASES, _CSETF_RKF_DM_PHRASES);
        identity(RKF_DISCOURSE_MAPPING);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rkf_discourse_mapping$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_MAPPING_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt25$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt28 = list(makeSymbol("INTERPRETATION"), makeSymbol("INDEXICALS"), makeSymbol("PHRASES"));

    static private final SubLList $list_alt29 = list(makeKeyword("INTERPRETATION"), makeKeyword("INDEXICALS"), makeKeyword("PHRASES"));

    static private final SubLList $list_alt30 = list(makeSymbol("RKF-DM-INTERPRETATION"), makeSymbol("RKF-DM-INDEXICALS"), makeSymbol("RKF-DM-PHRASES"));

    static private final SubLList $list_alt31 = list(makeSymbol("_CSETF-RKF-DM-INTERPRETATION"), makeSymbol("_CSETF-RKF-DM-INDEXICALS"), makeSymbol("_CSETF-RKF-DM-PHRASES"));

    @Override
    public void declareFunctions() {
        declare_rkf_discourse_tracking_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_discourse_tracking_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_discourse_tracking_file();
    }

    static {
    }

    static private final SubLList $list_alt42 = list(makeSymbol("INTERP"), makeSymbol("&KEY"), makeSymbol("INDEXICALS"), makeSymbol("PHRASES"));

    public static final class $rkf_discourse_context_native extends SubLStructNative {
        public SubLObject $explicit_mappings;

        public SubLObject $discourse_mt;

        public SubLObject $parent_context;

        public SubLObject $phrase_index;

        public SubLObject $indexical_index;

        private static final SubLStructDeclNative structDecl;

        public $rkf_discourse_context_native() {
            rkf_discourse_tracking.$rkf_discourse_context_native.this.$explicit_mappings = Lisp.NIL;
            rkf_discourse_tracking.$rkf_discourse_context_native.this.$discourse_mt = Lisp.NIL;
            rkf_discourse_tracking.$rkf_discourse_context_native.this.$parent_context = Lisp.NIL;
            rkf_discourse_tracking.$rkf_discourse_context_native.this.$phrase_index = Lisp.NIL;
            rkf_discourse_tracking.$rkf_discourse_context_native.this.$indexical_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$explicit_mappings;
        }

        @Override
        public SubLObject getField3() {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$discourse_mt;
        }

        @Override
        public SubLObject getField4() {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$parent_context;
        }

        @Override
        public SubLObject getField5() {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$phrase_index;
        }

        @Override
        public SubLObject getField6() {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$indexical_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$explicit_mappings = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$discourse_mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$parent_context = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$phrase_index = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rkf_discourse_tracking.$rkf_discourse_context_native.this.$indexical_index = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_context_native.class, RKF_DISCOURSE_CONTEXT, RKF_DISCOURSE_CONTEXT_P, $list4, $list5, new String[]{ "$explicit_mappings", "$discourse_mt", "$parent_context", "$phrase_index", "$indexical_index" }, $list6, $list7, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLList $list_alt43 = list(makeKeyword("INDEXICALS"), makeKeyword("PHRASES"));

    static private final SubLString $str_alt46$mapping_indexicals___S__ = makeString("mapping-indexicals: ~S~%");

    static private final SubLSymbol $sym48$_X = makeSymbol("?X");

    static private final SubLList $list_alt50 = list(reader_make_constant_shell("TheSalientInstance"), reader_make_constant_shell("CourseOfAction"));

    static private final SubLString $str_alt55$_S_is_not_a_valid_indexical = makeString("~S is not a valid indexical");

    public static final class $rkf_discourse_context_p$UnaryFunction extends UnaryFunction {
        public $rkf_discourse_context_p$UnaryFunction() {
            super(extractFunctionNamed("RKF-DISCOURSE-CONTEXT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_discourse_context_p(arg1);
        }
    }

    public static final class $rkf_discourse_mapping_native extends SubLStructNative {
        public SubLObject $interpretation;

        public SubLObject $indexicals;

        public SubLObject $phrases;

        private static final SubLStructDeclNative structDecl;

        public $rkf_discourse_mapping_native() {
            rkf_discourse_tracking.$rkf_discourse_mapping_native.this.$interpretation = Lisp.NIL;
            rkf_discourse_tracking.$rkf_discourse_mapping_native.this.$indexicals = Lisp.NIL;
            rkf_discourse_tracking.$rkf_discourse_mapping_native.this.$phrases = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_discourse_tracking.$rkf_discourse_mapping_native.this.$interpretation;
        }

        @Override
        public SubLObject getField3() {
            return rkf_discourse_tracking.$rkf_discourse_mapping_native.this.$indexicals;
        }

        @Override
        public SubLObject getField4() {
            return rkf_discourse_tracking.$rkf_discourse_mapping_native.this.$phrases;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_discourse_tracking.$rkf_discourse_mapping_native.this.$interpretation = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_discourse_tracking.$rkf_discourse_mapping_native.this.$indexicals = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rkf_discourse_tracking.$rkf_discourse_mapping_native.this.$phrases = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_discourse_tracking.$rkf_discourse_mapping_native.class, RKF_DISCOURSE_MAPPING, RKF_DISCOURSE_MAPPING_P, $list34, $list35, new String[]{ "$interpretation", "$indexicals", "$phrases" }, $list36, $list37, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $rkf_discourse_mapping_p$UnaryFunction extends UnaryFunction {
        public $rkf_discourse_mapping_p$UnaryFunction() {
            super(extractFunctionNamed("RKF-DISCOURSE-MAPPING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_discourse_mapping_p(arg1);
        }
    }
}

/**
 * Total time: 156 ms
 */
