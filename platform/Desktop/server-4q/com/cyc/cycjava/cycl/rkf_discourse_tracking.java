package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_discourse_tracking extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_discourse_tracking";
    public static final String myFingerPrint = "fd5af7eed034a86f808e1f9b5466f08c23b89ca9e5459345b6e0624b8205c7d3";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1767L)
    public static SubLSymbol $rkf_discourse_context$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLSymbol $dtp_rkf_discourse_context$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLSymbol $dtp_rkf_discourse_mapping$;
    private static final SubLObject $const0$TheResultOfParsing;
    private static final SubLSymbol $sym1$RKF_DISC_DISCOURSE_ENTITY_;
    private static final SubLSymbol $sym2$RKF_DISCOURSE_CONTEXT;
    private static final SubLSymbol $sym3$RKF_DISCOURSE_CONTEXT_P;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym9$RKF_DISCOURSE_CONTEXT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$RKF_DC_EXPLICIT_MAPPINGS;
    private static final SubLSymbol $sym12$_CSETF_RKF_DC_EXPLICIT_MAPPINGS;
    private static final SubLSymbol $sym13$RKF_DC_DISCOURSE_MT;
    private static final SubLSymbol $sym14$_CSETF_RKF_DC_DISCOURSE_MT;
    private static final SubLSymbol $sym15$RKF_DC_PARENT_CONTEXT;
    private static final SubLSymbol $sym16$_CSETF_RKF_DC_PARENT_CONTEXT;
    private static final SubLSymbol $sym17$RKF_DC_PHRASE_INDEX;
    private static final SubLSymbol $sym18$_CSETF_RKF_DC_PHRASE_INDEX;
    private static final SubLSymbol $sym19$RKF_DC_INDEXICAL_INDEX;
    private static final SubLSymbol $sym20$_CSETF_RKF_DC_INDEXICAL_INDEX;
    private static final SubLSymbol $kw21$EXPLICIT_MAPPINGS;
    private static final SubLSymbol $kw22$DISCOURSE_MT;
    private static final SubLSymbol $kw23$PARENT_CONTEXT;
    private static final SubLSymbol $kw24$PHRASE_INDEX;
    private static final SubLSymbol $kw25$INDEXICAL_INDEX;
    private static final SubLString $str26$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw27$BEGIN;
    private static final SubLSymbol $sym28$MAKE_RKF_DISCOURSE_CONTEXT;
    private static final SubLSymbol $kw29$SLOT;
    private static final SubLSymbol $kw30$END;
    private static final SubLSymbol $sym31$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_CONTEXT_METHOD;
    private static final SubLSymbol $sym32$RKF_DISCOURSE_MAPPING;
    private static final SubLSymbol $sym33$RKF_DISCOURSE_MAPPING_P;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$RKF_DISCOURSE_MAPPING_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$RKF_DM_INTERPRETATION;
    private static final SubLSymbol $sym41$_CSETF_RKF_DM_INTERPRETATION;
    private static final SubLSymbol $sym42$RKF_DM_INDEXICALS;
    private static final SubLSymbol $sym43$_CSETF_RKF_DM_INDEXICALS;
    private static final SubLSymbol $sym44$RKF_DM_PHRASES;
    private static final SubLSymbol $sym45$_CSETF_RKF_DM_PHRASES;
    private static final SubLSymbol $kw46$INTERPRETATION;
    private static final SubLSymbol $kw47$INDEXICALS;
    private static final SubLSymbol $kw48$PHRASES;
    private static final SubLSymbol $sym49$MAKE_RKF_DISCOURSE_MAPPING;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_MAPPING_METHOD;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $kw53$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $sym54$NEW_RKF_DISCOURSE_MAPPING;
    private static final SubLString $str55$mapping_indexicals___S__;
    private static final SubLObject $const56$CourseOfAction;
    private static final SubLSymbol $sym57$_X;
    private static final SubLObject $const58$coaDescribingSpecification;
    private static final SubLList $list59;
    private static final SubLObject $const60$implies;
    private static final SubLObject $const61$TheSalientInstance;
    private static final SubLObject $const62$SomeFn;
    private static final SubLObject $const63$isa;
    private static final SubLString $str64$_S_is_not_a_valid_indexical;
    private static final SubLObject $const65$genls;
    private static final SubLObject $const66$and;
    private static final SubLObject $const67$TheSalientFn;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 806L)
    public static SubLObject rkf_disc_resolve_sentence_entities(final SubLObject sentence, final SubLObject v_context) {
        final SubLObject entities = rkf_disc_find_discourse_entities(sentence);
        SubLObject in_queue = (SubLObject)ConsesLow.list(sentence);
        SubLObject out_queue = (SubLObject)rkf_discourse_tracking.NIL;
        SubLObject cdolist_list_var = entities;
        SubLObject entity = (SubLObject)rkf_discourse_tracking.NIL;
        entity = cdolist_list_var.first();
        while (rkf_discourse_tracking.NIL != cdolist_list_var) {
            final SubLObject resolutions = rkf_disc_resolve_entity(entity, sentence, v_context);
            SubLObject cdolist_list_var_$1 = in_queue;
            SubLObject sentence_$2 = (SubLObject)rkf_discourse_tracking.NIL;
            sentence_$2 = cdolist_list_var_$1.first();
            while (rkf_discourse_tracking.NIL != cdolist_list_var_$1) {
                SubLObject cdolist_list_var_$2 = resolutions;
                SubLObject resolution = (SubLObject)rkf_discourse_tracking.NIL;
                resolution = cdolist_list_var_$2.first();
                while (rkf_discourse_tracking.NIL != cdolist_list_var_$2) {
                    out_queue = (SubLObject)ConsesLow.cons(cycl_utilities.expression_subst(resolution, entity, sentence_$2, (SubLObject)rkf_discourse_tracking.EQUAL, (SubLObject)rkf_discourse_tracking.UNPROVIDED), out_queue);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    resolution = cdolist_list_var_$2.first();
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                sentence_$2 = cdolist_list_var_$1.first();
            }
            in_queue = out_queue;
            out_queue = (SubLObject)rkf_discourse_tracking.NIL;
            cdolist_list_var = cdolist_list_var.rest();
            entity = cdolist_list_var.first();
        }
        return in_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1320L)
    public static SubLObject rkf_disc_resolve_entity(final SubLObject entity, final SubLObject sentence, final SubLObject v_context) {
        if ((rkf_discourse_tracking.NIL != narts_high.naut_p(entity) && cycl_utilities.formula_arg0(entity).eql(rkf_discourse_tracking.$const0$TheResultOfParsing)) || entity.isString()) {
            return rkf_disc_resolve_phrase(v_context, entity);
        }
        return rkf_disc_resolve_indexical(v_context, entity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1640L)
    public static SubLObject rkf_disc_find_discourse_entities(final SubLObject sentence) {
        return cycl_utilities.expression_gather(sentence, (SubLObject)rkf_discourse_tracking.$sym1$RKF_DISC_DISCOURSE_ENTITY_, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject rkf_discourse_context_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_discourse_tracking.ZERO_INTEGER);
        return (SubLObject)rkf_discourse_tracking.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject rkf_discourse_context_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rkf_discourse_context_native.class) ? rkf_discourse_tracking.T : rkf_discourse_tracking.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject rkf_dc_explicit_mappings(final SubLObject v_object) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject rkf_dc_discourse_mt(final SubLObject v_object) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject rkf_dc_parent_context(final SubLObject v_object) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject rkf_dc_phrase_index(final SubLObject v_object) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject rkf_dc_indexical_index(final SubLObject v_object) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject _csetf_rkf_dc_explicit_mappings(final SubLObject v_object, final SubLObject value) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject _csetf_rkf_dc_discourse_mt(final SubLObject v_object, final SubLObject value) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject _csetf_rkf_dc_parent_context(final SubLObject v_object, final SubLObject value) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject _csetf_rkf_dc_phrase_index(final SubLObject v_object, final SubLObject value) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject _csetf_rkf_dc_indexical_index(final SubLObject v_object, final SubLObject value) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_context_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject make_rkf_discourse_context(SubLObject arglist) {
        if (arglist == rkf_discourse_tracking.UNPROVIDED) {
            arglist = (SubLObject)rkf_discourse_tracking.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rkf_discourse_context_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_discourse_tracking.NIL, next = arglist; rkf_discourse_tracking.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_discourse_tracking.$kw21$EXPLICIT_MAPPINGS)) {
                _csetf_rkf_dc_explicit_mappings(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_discourse_tracking.$kw22$DISCOURSE_MT)) {
                _csetf_rkf_dc_discourse_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_discourse_tracking.$kw23$PARENT_CONTEXT)) {
                _csetf_rkf_dc_parent_context(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_discourse_tracking.$kw24$PHRASE_INDEX)) {
                _csetf_rkf_dc_phrase_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_discourse_tracking.$kw25$INDEXICAL_INDEX)) {
                _csetf_rkf_dc_indexical_index(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_discourse_tracking.$str26$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject visit_defstruct_rkf_discourse_context(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw27$BEGIN, (SubLObject)rkf_discourse_tracking.$sym28$MAKE_RKF_DISCOURSE_CONTEXT, (SubLObject)rkf_discourse_tracking.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw29$SLOT, (SubLObject)rkf_discourse_tracking.$kw21$EXPLICIT_MAPPINGS, rkf_dc_explicit_mappings(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw29$SLOT, (SubLObject)rkf_discourse_tracking.$kw22$DISCOURSE_MT, rkf_dc_discourse_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw29$SLOT, (SubLObject)rkf_discourse_tracking.$kw23$PARENT_CONTEXT, rkf_dc_parent_context(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw29$SLOT, (SubLObject)rkf_discourse_tracking.$kw24$PHRASE_INDEX, rkf_dc_phrase_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw29$SLOT, (SubLObject)rkf_discourse_tracking.$kw25$INDEXICAL_INDEX, rkf_dc_indexical_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw30$END, (SubLObject)rkf_discourse_tracking.$sym28$MAKE_RKF_DISCOURSE_CONTEXT, (SubLObject)rkf_discourse_tracking.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 1895L)
    public static SubLObject visit_defstruct_object_rkf_discourse_context_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_discourse_context(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2142L)
    public static SubLObject new_rkf_discourse_context(final SubLObject mt) {
        final SubLObject obj = make_rkf_discourse_context((SubLObject)rkf_discourse_tracking.UNPROVIDED);
        _csetf_rkf_dc_discourse_mt(obj, mt);
        _csetf_rkf_dc_parent_context(obj, (SubLObject)rkf_discourse_tracking.NIL);
        _csetf_rkf_dc_explicit_mappings(obj, dictionary.new_dictionary((SubLObject)rkf_discourse_tracking.EQUAL, (SubLObject)rkf_discourse_tracking.UNPROVIDED));
        _csetf_rkf_dc_phrase_index(obj, dictionary.new_dictionary((SubLObject)rkf_discourse_tracking.EQUAL, (SubLObject)rkf_discourse_tracking.UNPROVIDED));
        _csetf_rkf_dc_indexical_index(obj, dictionary.new_dictionary((SubLObject)rkf_discourse_tracking.EQUAL, (SubLObject)rkf_discourse_tracking.UNPROVIDED));
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2529L)
    public static SubLObject rkf_dc_link_parent_child_discourse(final SubLObject parent_disc, final SubLObject child_disc) {
        _csetf_rkf_dc_parent_context(child_disc, parent_disc);
        return parent_disc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2685L)
    public static SubLObject rkf_dc_unlink_parent_child_discourse(final SubLObject parent_disc, final SubLObject child_disc) {
        _csetf_rkf_dc_parent_context(child_disc, (SubLObject)rkf_discourse_tracking.NIL);
        return parent_disc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject rkf_discourse_mapping_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_discourse_tracking.ZERO_INTEGER);
        return (SubLObject)rkf_discourse_tracking.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject rkf_discourse_mapping_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rkf_discourse_mapping_native.class) ? rkf_discourse_tracking.T : rkf_discourse_tracking.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject rkf_dm_interpretation(final SubLObject v_object) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_mapping_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject rkf_dm_indexicals(final SubLObject v_object) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_mapping_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject rkf_dm_phrases(final SubLObject v_object) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_mapping_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject _csetf_rkf_dm_interpretation(final SubLObject v_object, final SubLObject value) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_mapping_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject _csetf_rkf_dm_indexicals(final SubLObject v_object, final SubLObject value) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_mapping_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject _csetf_rkf_dm_phrases(final SubLObject v_object, final SubLObject value) {
        assert rkf_discourse_tracking.NIL != rkf_discourse_mapping_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject make_rkf_discourse_mapping(SubLObject arglist) {
        if (arglist == rkf_discourse_tracking.UNPROVIDED) {
            arglist = (SubLObject)rkf_discourse_tracking.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rkf_discourse_mapping_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_discourse_tracking.NIL, next = arglist; rkf_discourse_tracking.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_discourse_tracking.$kw46$INTERPRETATION)) {
                _csetf_rkf_dm_interpretation(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_discourse_tracking.$kw47$INDEXICALS)) {
                _csetf_rkf_dm_indexicals(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_discourse_tracking.$kw48$PHRASES)) {
                _csetf_rkf_dm_phrases(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_discourse_tracking.$str26$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject visit_defstruct_rkf_discourse_mapping(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw27$BEGIN, (SubLObject)rkf_discourse_tracking.$sym49$MAKE_RKF_DISCOURSE_MAPPING, (SubLObject)rkf_discourse_tracking.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw29$SLOT, (SubLObject)rkf_discourse_tracking.$kw46$INTERPRETATION, rkf_dm_interpretation(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw29$SLOT, (SubLObject)rkf_discourse_tracking.$kw47$INDEXICALS, rkf_dm_indexicals(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw29$SLOT, (SubLObject)rkf_discourse_tracking.$kw48$PHRASES, rkf_dm_phrases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_discourse_tracking.$kw30$END, (SubLObject)rkf_discourse_tracking.$sym49$MAKE_RKF_DISCOURSE_MAPPING, (SubLObject)rkf_discourse_tracking.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 2833L)
    public static SubLObject visit_defstruct_object_rkf_discourse_mapping_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rkf_discourse_mapping(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3069L)
    public static SubLObject new_rkf_discourse_mapping(final SubLObject interp, final SubLObject indexicals, final SubLObject phrases) {
        final SubLObject mapping = make_rkf_discourse_mapping((SubLObject)rkf_discourse_tracking.UNPROVIDED);
        _csetf_rkf_dm_interpretation(mapping, interp);
        _csetf_rkf_dm_indexicals(mapping, indexicals);
        _csetf_rkf_dm_phrases(mapping, phrases);
        return mapping;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3358L)
    public static SubLObject create_rkf_discourse_indexicals_mapping(final SubLObject interp, final SubLObject indexicals) {
        return new_rkf_discourse_mapping(interp, indexicals, (SubLObject)rkf_discourse_tracking.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3493L)
    public static SubLObject create_rkf_discourse_phrases_mapping(final SubLObject interp, final SubLObject phrases) {
        return new_rkf_discourse_mapping(interp, (SubLObject)rkf_discourse_tracking.NIL, phrases);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3619L)
    public static SubLObject create_rkf_discourse_mapping(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject interp = (SubLObject)rkf_discourse_tracking.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_discourse_tracking.$list51);
        interp = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)rkf_discourse_tracking.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)rkf_discourse_tracking.NIL;
        SubLObject current_$4 = (SubLObject)rkf_discourse_tracking.NIL;
        while (rkf_discourse_tracking.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_discourse_tracking.$list51);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rkf_discourse_tracking.$list51);
            if (rkf_discourse_tracking.NIL == conses_high.member(current_$4, (SubLObject)rkf_discourse_tracking.$list52, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED)) {
                bad = (SubLObject)rkf_discourse_tracking.T;
            }
            if (current_$4 == rkf_discourse_tracking.$kw53$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (rkf_discourse_tracking.NIL != bad && rkf_discourse_tracking.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_discourse_tracking.$list51);
        }
        final SubLObject indexicals_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_discourse_tracking.$kw47$INDEXICALS, current);
        final SubLObject indexicals = (SubLObject)((rkf_discourse_tracking.NIL != indexicals_tail) ? conses_high.cadr(indexicals_tail) : rkf_discourse_tracking.NIL);
        final SubLObject phrases_tail = cdestructuring_bind.property_list_member((SubLObject)rkf_discourse_tracking.$kw48$PHRASES, current);
        final SubLObject phrases = (SubLObject)((rkf_discourse_tracking.NIL != phrases_tail) ? conses_high.cadr(phrases_tail) : rkf_discourse_tracking.NIL);
        return (SubLObject)ConsesLow.list((SubLObject)rkf_discourse_tracking.$sym54$NEW_RKF_DISCOURSE_MAPPING, interp, indexicals, phrases);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 3766L)
    public static SubLObject rkf_dc_add_mapping(final SubLObject v_context, final SubLObject mapping) {
        final SubLObject mappings = rkf_dc_explicit_mappings(v_context);
        final SubLObject phrase_index = rkf_dc_phrase_index(v_context);
        final SubLObject phrases = rkf_dm_phrases(mapping);
        final SubLObject indexical_index = rkf_dc_indexical_index(v_context);
        final SubLObject indexicals = rkf_dm_indexicals(mapping);
        Errors.warn((SubLObject)rkf_discourse_tracking.$str55$mapping_indexicals___S__, indexicals);
        SubLObject cdolist_list_var = phrases;
        SubLObject phrase = (SubLObject)rkf_discourse_tracking.NIL;
        phrase = cdolist_list_var.first();
        while (rkf_discourse_tracking.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_pushnew(phrase_index, phrase, mapping, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        cdolist_list_var = indexicals;
        SubLObject indexical = (SubLObject)rkf_discourse_tracking.NIL;
        indexical = cdolist_list_var.first();
        while (rkf_discourse_tracking.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_pushnew(indexical_index, indexical, mapping, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        }
        return dictionary_utilities.dictionary_pushnew(mappings, rkf_dm_interpretation(mapping), mapping, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 4562L)
    public static SubLObject rkf_dc_remove_mapping(final SubLObject v_context, final SubLObject mapping) {
        final SubLObject mappings = rkf_dc_explicit_mappings(v_context);
        final SubLObject phrase_index = rkf_dc_phrase_index(v_context);
        final SubLObject phrases = rkf_dm_phrases(mapping);
        final SubLObject indexical_index = rkf_dc_indexical_index(v_context);
        SubLObject cdolist_list_var;
        final SubLObject indexicals = cdolist_list_var = rkf_dm_indexicals(mapping);
        SubLObject indexical = (SubLObject)rkf_discourse_tracking.NIL;
        indexical = cdolist_list_var.first();
        while (rkf_discourse_tracking.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_remove_from_value(indexical_index, indexical, mapping, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        }
        cdolist_list_var = phrases;
        SubLObject phrase = (SubLObject)rkf_discourse_tracking.NIL;
        phrase = cdolist_list_var.first();
        while (rkf_discourse_tracking.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_remove_from_value(phrase_index, phrase, mapping, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        return dictionary_utilities.dictionary_remove_from_value(mappings, rkf_dm_interpretation(mapping), mapping, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 5153L)
    public static SubLObject rkf_disc_resolve_phrase_local(final SubLObject v_context, final SubLObject phrase) {
        final SubLObject phrase_index = rkf_dc_phrase_index(v_context);
        SubLObject result = (SubLObject)rkf_discourse_tracking.NIL;
        result = rkf_disc_interp_for_phrase(phrase_index, phrase);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 5371L)
    public static SubLObject rkf_disc_interp_for_phrase(final SubLObject index, final SubLObject entity) {
        final SubLObject phrase = rkf_disc_phrase_from_phrase_entity(entity);
        final SubLObject mappings = dictionary.dictionary_lookup(index, phrase, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
        SubLObject result = (SubLObject)rkf_discourse_tracking.NIL;
        SubLObject cdolist_list_var = mappings;
        SubLObject mapping = (SubLObject)rkf_discourse_tracking.NIL;
        mapping = cdolist_list_var.first();
        while (rkf_discourse_tracking.NIL != cdolist_list_var) {
            final SubLObject item_var = rkf_dm_interpretation(mapping);
            if (rkf_discourse_tracking.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)rkf_discourse_tracking.EQL), Symbols.symbol_function((SubLObject)rkf_discourse_tracking.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapping = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 5656L)
    public static SubLObject rkf_disc_phrase_from_phrase_entity(final SubLObject entity) {
        if (entity.isString()) {
            return entity;
        }
        if (rkf_discourse_tracking.NIL != parsing_utilities.result_of_parsing_formulaP(entity)) {
            return parsing_utilities.result_of_parsing_words(entity);
        }
        return (SubLObject)rkf_discourse_tracking.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 5861L)
    public static SubLObject rkf_disc_resolve_indexical_local(final SubLObject v_context, final SubLObject indexical) {
        SubLObject result = rkf_disc_resolve_indexical_wXlocal_mappings(v_context, indexical);
        if (rkf_discourse_tracking.NIL == result) {
            result = rkf_disc_resolve_coa(v_context, indexical);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 6120L)
    public static SubLObject rkf_disc_resolve_coa(final SubLObject v_context, final SubLObject indexical) {
        if (rkf_discourse_tracking.NIL != rkf_disc_salient_individual_of_type_formulaP(indexical, rkf_discourse_tracking.$const56$CourseOfAction)) {
            final SubLObject mt = rkf_dc_discourse_mt(v_context);
            SubLObject result = backward.removal_ask_variable((SubLObject)rkf_discourse_tracking.$sym57$_X, (SubLObject)ConsesLow.list(rkf_discourse_tracking.$const58$coaDescribingSpecification, (SubLObject)rkf_discourse_tracking.$sym57$_X, mt), mt, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
            if (rkf_discourse_tracking.NIL == result) {
                result = (SubLObject)rkf_discourse_tracking.$list59;
            }
            return result;
        }
        return (SubLObject)rkf_discourse_tracking.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 6491L)
    public static SubLObject rkf_disc_resolve_indexical_wXlocal_mappings(final SubLObject v_context, final SubLObject indexical) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index = rkf_dc_indexical_index(v_context);
        final SubLObject mt = rkf_dc_discourse_mt(v_context);
        SubLObject result = (SubLObject)rkf_discourse_tracking.NIL;
        dictionary_utilities.print_dictionary_contents(index, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index)); rkf_discourse_tracking.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject known_indexical = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mappings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject query = rkf_disc_easily_testable_formula(known_indexical, indexical);
            if (rkf_discourse_tracking.NIL == query) {
                final SubLObject var = cycl_utilities.formula_arg1(known_indexical, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
                final SubLObject antecedent = cycl_utilities.formula_arg2(known_indexical, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
                final SubLObject consequent = rkf_disc_consequent_from_indexical(var, indexical);
                query = (SubLObject)ConsesLow.list(rkf_discourse_tracking.$const60$implies, antecedent, consequent);
            }
            if (rkf_discourse_tracking.NIL != rkf_query_utilities.rkf_query(query, mt, (SubLObject)rkf_discourse_tracking.ZERO_INTEGER, (SubLObject)rkf_discourse_tracking.ONE_INTEGER, (SubLObject)rkf_discourse_tracking.UNPROVIDED, (SubLObject)rkf_discourse_tracking.UNPROVIDED)) {
                SubLObject cdolist_list_var = mappings;
                SubLObject mapping = (SubLObject)rkf_discourse_tracking.NIL;
                mapping = cdolist_list_var.first();
                while (rkf_discourse_tracking.NIL != cdolist_list_var) {
                    final SubLObject item_var = rkf_dm_interpretation(mapping);
                    if (rkf_discourse_tracking.NIL == conses_high.member(item_var, result, (SubLObject)rkf_discourse_tracking.EQUAL, Symbols.symbol_function((SubLObject)rkf_discourse_tracking.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mapping = cdolist_list_var.first();
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 7405L)
    public static SubLObject rkf_disc_consequent_from_indexical(final SubLObject var, final SubLObject indexical) {
        if (cycl_utilities.formula_arg0(indexical).eql(rkf_discourse_tracking.$const61$TheSalientInstance) || cycl_utilities.formula_arg0(indexical).eql(rkf_discourse_tracking.$const62$SomeFn)) {
            return (SubLObject)ConsesLow.list(rkf_discourse_tracking.$const63$isa, var, cycl_utilities.formula_arg1(indexical, (SubLObject)rkf_discourse_tracking.UNPROVIDED));
        }
        return Errors.error((SubLObject)rkf_discourse_tracking.$str64$_S_is_not_a_valid_indexical, indexical);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 7693L)
    public static SubLObject rkf_disc_easily_testable_formula(final SubLObject known_indexical, final SubLObject indexical) {
        final SubLObject var = cycl_utilities.formula_arg1(known_indexical, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
        final SubLObject indexical_constraint_sentence = cycl_utilities.formula_arg2(known_indexical, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
        final SubLObject indexical_constraint_list = indexical_constraint_sentence.rest();
        final SubLObject isa_to_resolve = cycl_utilities.formula_arg1(indexical, (SubLObject)rkf_discourse_tracking.UNPROVIDED);
        if (rkf_discourse_tracking.NIL != list_utilities.lengthE(indexical_constraint_list, (SubLObject)rkf_discourse_tracking.ONE_INTEGER, (SubLObject)rkf_discourse_tracking.UNPROVIDED) && cycl_utilities.formula_arg0(indexical_constraint_list.first()).eql(rkf_discourse_tracking.$const63$isa)) {
            return (SubLObject)ConsesLow.list(rkf_discourse_tracking.$const65$genls, isa_to_resolve, cycl_utilities.formula_arg2(indexical_constraint_list.first(), (SubLObject)rkf_discourse_tracking.UNPROVIDED));
        }
        return (SubLObject)rkf_discourse_tracking.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 8415L)
    public static SubLObject rkf_disc_resolve_phrase(final SubLObject v_context, final SubLObject phrase) {
        final SubLObject result = rkf_disc_resolve_phrase_local(v_context, phrase);
        if (rkf_discourse_tracking.NIL != result) {
            return result;
        }
        if (rkf_discourse_tracking.NIL != rkf_dc_parent_context(v_context)) {
            return rkf_disc_resolve_phrase(rkf_dc_parent_context(v_context), phrase);
        }
        return (SubLObject)ConsesLow.list(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 8827L)
    public static SubLObject rkf_disc_resolve_indexical(final SubLObject v_context, final SubLObject indexical) {
        final SubLObject local_result = rkf_disc_resolve_indexical_local(v_context, indexical);
        if (rkf_discourse_tracking.NIL != local_result) {
            return local_result;
        }
        if (rkf_discourse_tracking.NIL != rkf_dc_parent_context(v_context)) {
            return rkf_disc_resolve_indexical(rkf_dc_parent_context(v_context), indexical);
        }
        return (SubLObject)ConsesLow.list(indexical);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9347L)
    public static SubLObject rkf_disc_potentially_resolvable_entityP(final SubLObject entity, final SubLObject v_context) {
        if (rkf_discourse_tracking.NIL != parsing_utilities.result_of_parsing_formulaP(entity)) {
            return list_utilities.sublisp_boolean(rkf_disc_resolve_phrase(v_context, entity));
        }
        return (SubLObject)rkf_discourse_tracking.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9547L)
    public static SubLObject rkf_disc_salient_individual_of_type_formulaP(final SubLObject formula, final SubLObject type) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_discourse_tracking.NIL != rkf_disc_salient_individual_formulaP(formula) && cycl_utilities.formula_arg1(formula, (SubLObject)rkf_discourse_tracking.UNPROVIDED).equal(type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9730L)
    public static SubLObject rkf_disc_salient_individual_formulaP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_discourse_tracking.NIL != rkf_disc_salient_instance_formulaP(obj) || rkf_discourse_tracking.NIL != rkf_disc_somefn_formulaP(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9882L)
    public static SubLObject rkf_disc_somefn_formulaP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_discourse_tracking.NIL != narts_high.naut_p(obj) && cycl_utilities.formula_arg0(obj).eql(rkf_discourse_tracking.$const62$SomeFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 9998L)
    public static SubLObject rkf_disc_salient_instance_formulaP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_discourse_tracking.NIL != narts_high.naut_p(obj) && cycl_utilities.formula_arg0(obj).eql(rkf_discourse_tracking.$const61$TheSalientInstance));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10136L)
    public static SubLObject rkf_disc_discourse_entityP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_discourse_tracking.NIL != rkf_disc_salient_instance_formulaP(obj) || rkf_discourse_tracking.NIL != parsing_utilities.result_of_parsing_formulaP(obj) || (rkf_discourse_tracking.NIL != narts_high.naut_p(obj) && rkf_discourse_tracking.$const62$SomeFn.eql(cycl_utilities.formula_arg0(obj))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10342L)
    public static SubLObject rkf_disc_implied_indexicals_formulaP(final SubLObject obj) {
        return rkf_disc_salient_instance_formulaP(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10457L)
    public static SubLObject rkf_make_discourse_formula_from_constraints(final SubLObject isas, final SubLObject v_genls) {
        final SubLObject variable = (SubLObject)rkf_discourse_tracking.$sym57$_X;
        SubLObject formula = (SubLObject)rkf_discourse_tracking.NIL;
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = (SubLObject)rkf_discourse_tracking.NIL;
        v_isa = cdolist_list_var.first();
        while (rkf_discourse_tracking.NIL != cdolist_list_var) {
            formula = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(rkf_discourse_tracking.$const63$isa, variable, v_isa), formula);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        }
        cdolist_list_var = v_genls;
        SubLObject genl = (SubLObject)rkf_discourse_tracking.NIL;
        genl = cdolist_list_var.first();
        while (rkf_discourse_tracking.NIL != cdolist_list_var) {
            formula = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(rkf_discourse_tracking.$const65$genls, variable, genl), formula);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        formula = (SubLObject)ConsesLow.cons(rkf_discourse_tracking.$const66$and, formula);
        return el_utilities.make_binary_formula(rkf_discourse_tracking.$const67$TheSalientFn, variable, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10841L)
    public static SubLObject rkf_discourse_bundle_ar_concept(final SubLObject obj) {
        return obj.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10920L)
    public static SubLObject rkf_discourse_bundle_original(final SubLObject obj) {
        return conses_high.second(obj);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-discourse-tracking.lisp", position = 10997L)
    public static SubLObject rkf_discourse_bundle_options(final SubLObject obj) {
        return conses_high.third(obj);
    }
    
    public static SubLObject declare_rkf_discourse_tracking_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_resolve_sentence_entities", "RKF-DISC-RESOLVE-SENTENCE-ENTITIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_resolve_entity", "RKF-DISC-RESOLVE-ENTITY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_find_discourse_entities", "RKF-DISC-FIND-DISCOURSE-ENTITIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_discourse_context_print_function_trampoline", "RKF-DISCOURSE-CONTEXT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_discourse_context_p", "RKF-DISCOURSE-CONTEXT-P", 1, 0, false);
        new $rkf_discourse_context_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dc_explicit_mappings", "RKF-DC-EXPLICIT-MAPPINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dc_discourse_mt", "RKF-DC-DISCOURSE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dc_parent_context", "RKF-DC-PARENT-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dc_phrase_index", "RKF-DC-PHRASE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dc_indexical_index", "RKF-DC-INDEXICAL-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "_csetf_rkf_dc_explicit_mappings", "_CSETF-RKF-DC-EXPLICIT-MAPPINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "_csetf_rkf_dc_discourse_mt", "_CSETF-RKF-DC-DISCOURSE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "_csetf_rkf_dc_parent_context", "_CSETF-RKF-DC-PARENT-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "_csetf_rkf_dc_phrase_index", "_CSETF-RKF-DC-PHRASE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "_csetf_rkf_dc_indexical_index", "_CSETF-RKF-DC-INDEXICAL-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "make_rkf_discourse_context", "MAKE-RKF-DISCOURSE-CONTEXT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "visit_defstruct_rkf_discourse_context", "VISIT-DEFSTRUCT-RKF-DISCOURSE-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "visit_defstruct_object_rkf_discourse_context_method", "VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-CONTEXT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "new_rkf_discourse_context", "NEW-RKF-DISCOURSE-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dc_link_parent_child_discourse", "RKF-DC-LINK-PARENT-CHILD-DISCOURSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dc_unlink_parent_child_discourse", "RKF-DC-UNLINK-PARENT-CHILD-DISCOURSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_discourse_mapping_print_function_trampoline", "RKF-DISCOURSE-MAPPING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_discourse_mapping_p", "RKF-DISCOURSE-MAPPING-P", 1, 0, false);
        new $rkf_discourse_mapping_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dm_interpretation", "RKF-DM-INTERPRETATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dm_indexicals", "RKF-DM-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dm_phrases", "RKF-DM-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "_csetf_rkf_dm_interpretation", "_CSETF-RKF-DM-INTERPRETATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "_csetf_rkf_dm_indexicals", "_CSETF-RKF-DM-INDEXICALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "_csetf_rkf_dm_phrases", "_CSETF-RKF-DM-PHRASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "make_rkf_discourse_mapping", "MAKE-RKF-DISCOURSE-MAPPING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "visit_defstruct_rkf_discourse_mapping", "VISIT-DEFSTRUCT-RKF-DISCOURSE-MAPPING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "visit_defstruct_object_rkf_discourse_mapping_method", "VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-MAPPING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "new_rkf_discourse_mapping", "NEW-RKF-DISCOURSE-MAPPING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "create_rkf_discourse_indexicals_mapping", "CREATE-RKF-DISCOURSE-INDEXICALS-MAPPING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "create_rkf_discourse_phrases_mapping", "CREATE-RKF-DISCOURSE-PHRASES-MAPPING", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_discourse_tracking", "create_rkf_discourse_mapping", "CREATE-RKF-DISCOURSE-MAPPING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dc_add_mapping", "RKF-DC-ADD-MAPPING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_dc_remove_mapping", "RKF-DC-REMOVE-MAPPING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_resolve_phrase_local", "RKF-DISC-RESOLVE-PHRASE-LOCAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_interp_for_phrase", "RKF-DISC-INTERP-FOR-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_phrase_from_phrase_entity", "RKF-DISC-PHRASE-FROM-PHRASE-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_resolve_indexical_local", "RKF-DISC-RESOLVE-INDEXICAL-LOCAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_resolve_coa", "RKF-DISC-RESOLVE-COA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_resolve_indexical_wXlocal_mappings", "RKF-DISC-RESOLVE-INDEXICAL-W/LOCAL-MAPPINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_consequent_from_indexical", "RKF-DISC-CONSEQUENT-FROM-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_easily_testable_formula", "RKF-DISC-EASILY-TESTABLE-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_resolve_phrase", "RKF-DISC-RESOLVE-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_resolve_indexical", "RKF-DISC-RESOLVE-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_potentially_resolvable_entityP", "RKF-DISC-POTENTIALLY-RESOLVABLE-ENTITY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_salient_individual_of_type_formulaP", "RKF-DISC-SALIENT-INDIVIDUAL-OF-TYPE-FORMULA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_salient_individual_formulaP", "RKF-DISC-SALIENT-INDIVIDUAL-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_somefn_formulaP", "RKF-DISC-SOMEFN-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_salient_instance_formulaP", "RKF-DISC-SALIENT-INSTANCE-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_discourse_entityP", "RKF-DISC-DISCOURSE-ENTITY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_disc_implied_indexicals_formulaP", "RKF-DISC-IMPLIED-INDEXICALS-FORMULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_make_discourse_formula_from_constraints", "RKF-MAKE-DISCOURSE-FORMULA-FROM-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_discourse_bundle_ar_concept", "RKF-DISCOURSE-BUNDLE-AR-CONCEPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_discourse_bundle_original", "RKF-DISCOURSE-BUNDLE-ORIGINAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_discourse_tracking", "rkf_discourse_bundle_options", "RKF-DISCOURSE-BUNDLE-OPTIONS", 1, 0, false);
        return (SubLObject)rkf_discourse_tracking.NIL;
    }
    
    public static SubLObject init_rkf_discourse_tracking_file() {
        rkf_discourse_tracking.$rkf_discourse_context$ = SubLFiles.defparameter("*RKF-DISCOURSE-CONTEXT*", (SubLObject)rkf_discourse_tracking.NIL);
        rkf_discourse_tracking.$dtp_rkf_discourse_context$ = SubLFiles.defconstant("*DTP-RKF-DISCOURSE-CONTEXT*", (SubLObject)rkf_discourse_tracking.$sym2$RKF_DISCOURSE_CONTEXT);
        rkf_discourse_tracking.$dtp_rkf_discourse_mapping$ = SubLFiles.defconstant("*DTP-RKF-DISCOURSE-MAPPING*", (SubLObject)rkf_discourse_tracking.$sym32$RKF_DISCOURSE_MAPPING);
        return (SubLObject)rkf_discourse_tracking.NIL;
    }
    
    public static SubLObject setup_rkf_discourse_tracking_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_discourse_tracking.$dtp_rkf_discourse_context$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_discourse_tracking.$sym9$RKF_DISCOURSE_CONTEXT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_discourse_tracking.$list10);
        Structures.def_csetf((SubLObject)rkf_discourse_tracking.$sym11$RKF_DC_EXPLICIT_MAPPINGS, (SubLObject)rkf_discourse_tracking.$sym12$_CSETF_RKF_DC_EXPLICIT_MAPPINGS);
        Structures.def_csetf((SubLObject)rkf_discourse_tracking.$sym13$RKF_DC_DISCOURSE_MT, (SubLObject)rkf_discourse_tracking.$sym14$_CSETF_RKF_DC_DISCOURSE_MT);
        Structures.def_csetf((SubLObject)rkf_discourse_tracking.$sym15$RKF_DC_PARENT_CONTEXT, (SubLObject)rkf_discourse_tracking.$sym16$_CSETF_RKF_DC_PARENT_CONTEXT);
        Structures.def_csetf((SubLObject)rkf_discourse_tracking.$sym17$RKF_DC_PHRASE_INDEX, (SubLObject)rkf_discourse_tracking.$sym18$_CSETF_RKF_DC_PHRASE_INDEX);
        Structures.def_csetf((SubLObject)rkf_discourse_tracking.$sym19$RKF_DC_INDEXICAL_INDEX, (SubLObject)rkf_discourse_tracking.$sym20$_CSETF_RKF_DC_INDEXICAL_INDEX);
        Equality.identity((SubLObject)rkf_discourse_tracking.$sym2$RKF_DISCOURSE_CONTEXT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_discourse_tracking.$dtp_rkf_discourse_context$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_discourse_tracking.$sym31$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_CONTEXT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_discourse_tracking.$dtp_rkf_discourse_mapping$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_discourse_tracking.$sym38$RKF_DISCOURSE_MAPPING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_discourse_tracking.$list39);
        Structures.def_csetf((SubLObject)rkf_discourse_tracking.$sym40$RKF_DM_INTERPRETATION, (SubLObject)rkf_discourse_tracking.$sym41$_CSETF_RKF_DM_INTERPRETATION);
        Structures.def_csetf((SubLObject)rkf_discourse_tracking.$sym42$RKF_DM_INDEXICALS, (SubLObject)rkf_discourse_tracking.$sym43$_CSETF_RKF_DM_INDEXICALS);
        Structures.def_csetf((SubLObject)rkf_discourse_tracking.$sym44$RKF_DM_PHRASES, (SubLObject)rkf_discourse_tracking.$sym45$_CSETF_RKF_DM_PHRASES);
        Equality.identity((SubLObject)rkf_discourse_tracking.$sym32$RKF_DISCOURSE_MAPPING);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_discourse_tracking.$dtp_rkf_discourse_mapping$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_discourse_tracking.$sym50$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_MAPPING_METHOD));
        return (SubLObject)rkf_discourse_tracking.NIL;
    }
    
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
        me = (SubLFile)new rkf_discourse_tracking();
        rkf_discourse_tracking.$rkf_discourse_context$ = null;
        rkf_discourse_tracking.$dtp_rkf_discourse_context$ = null;
        rkf_discourse_tracking.$dtp_rkf_discourse_mapping$ = null;
        $const0$TheResultOfParsing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing"));
        $sym1$RKF_DISC_DISCOURSE_ENTITY_ = SubLObjectFactory.makeSymbol("RKF-DISC-DISCOURSE-ENTITY?");
        $sym2$RKF_DISCOURSE_CONTEXT = SubLObjectFactory.makeSymbol("RKF-DISCOURSE-CONTEXT");
        $sym3$RKF_DISCOURSE_CONTEXT_P = SubLObjectFactory.makeSymbol("RKF-DISCOURSE-CONTEXT-P");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPLICIT-MAPPINGS"), (SubLObject)SubLObjectFactory.makeSymbol("DISCOURSE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-CONTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICAL-INDEX"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPLICIT-MAPPINGS"), (SubLObject)SubLObjectFactory.makeKeyword("DISCOURSE-MT"), (SubLObject)SubLObjectFactory.makeKeyword("PARENT-CONTEXT"), (SubLObject)SubLObjectFactory.makeKeyword("PHRASE-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INDEXICAL-INDEX"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-DC-EXPLICIT-MAPPINGS"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-DC-DISCOURSE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-DC-PARENT-CONTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-DC-PHRASE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-DC-INDEXICAL-INDEX"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-EXPLICIT-MAPPINGS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-DISCOURSE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-PARENT-CONTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-PHRASE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-INDEXICAL-INDEX"));
        $sym8$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym9$RKF_DISCOURSE_CONTEXT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RKF-DISCOURSE-CONTEXT-PRINT-FUNCTION-TRAMPOLINE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-DISCOURSE-CONTEXT-P"));
        $sym11$RKF_DC_EXPLICIT_MAPPINGS = SubLObjectFactory.makeSymbol("RKF-DC-EXPLICIT-MAPPINGS");
        $sym12$_CSETF_RKF_DC_EXPLICIT_MAPPINGS = SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-EXPLICIT-MAPPINGS");
        $sym13$RKF_DC_DISCOURSE_MT = SubLObjectFactory.makeSymbol("RKF-DC-DISCOURSE-MT");
        $sym14$_CSETF_RKF_DC_DISCOURSE_MT = SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-DISCOURSE-MT");
        $sym15$RKF_DC_PARENT_CONTEXT = SubLObjectFactory.makeSymbol("RKF-DC-PARENT-CONTEXT");
        $sym16$_CSETF_RKF_DC_PARENT_CONTEXT = SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-PARENT-CONTEXT");
        $sym17$RKF_DC_PHRASE_INDEX = SubLObjectFactory.makeSymbol("RKF-DC-PHRASE-INDEX");
        $sym18$_CSETF_RKF_DC_PHRASE_INDEX = SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-PHRASE-INDEX");
        $sym19$RKF_DC_INDEXICAL_INDEX = SubLObjectFactory.makeSymbol("RKF-DC-INDEXICAL-INDEX");
        $sym20$_CSETF_RKF_DC_INDEXICAL_INDEX = SubLObjectFactory.makeSymbol("_CSETF-RKF-DC-INDEXICAL-INDEX");
        $kw21$EXPLICIT_MAPPINGS = SubLObjectFactory.makeKeyword("EXPLICIT-MAPPINGS");
        $kw22$DISCOURSE_MT = SubLObjectFactory.makeKeyword("DISCOURSE-MT");
        $kw23$PARENT_CONTEXT = SubLObjectFactory.makeKeyword("PARENT-CONTEXT");
        $kw24$PHRASE_INDEX = SubLObjectFactory.makeKeyword("PHRASE-INDEX");
        $kw25$INDEXICAL_INDEX = SubLObjectFactory.makeKeyword("INDEXICAL-INDEX");
        $str26$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw27$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym28$MAKE_RKF_DISCOURSE_CONTEXT = SubLObjectFactory.makeSymbol("MAKE-RKF-DISCOURSE-CONTEXT");
        $kw29$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw30$END = SubLObjectFactory.makeKeyword("END");
        $sym31$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_CONTEXT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-CONTEXT-METHOD");
        $sym32$RKF_DISCOURSE_MAPPING = SubLObjectFactory.makeSymbol("RKF-DISCOURSE-MAPPING");
        $sym33$RKF_DISCOURSE_MAPPING_P = SubLObjectFactory.makeSymbol("RKF-DISCOURSE-MAPPING-P");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERPRETATION"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICALS"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASES"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERPRETATION"), (SubLObject)SubLObjectFactory.makeKeyword("INDEXICALS"), (SubLObject)SubLObjectFactory.makeKeyword("PHRASES"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-DM-INTERPRETATION"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-DM-INDEXICALS"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-DM-PHRASES"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-DM-INTERPRETATION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-DM-INDEXICALS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RKF-DM-PHRASES"));
        $sym38$RKF_DISCOURSE_MAPPING_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RKF-DISCOURSE-MAPPING-PRINT-FUNCTION-TRAMPOLINE");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-DISCOURSE-MAPPING-P"));
        $sym40$RKF_DM_INTERPRETATION = SubLObjectFactory.makeSymbol("RKF-DM-INTERPRETATION");
        $sym41$_CSETF_RKF_DM_INTERPRETATION = SubLObjectFactory.makeSymbol("_CSETF-RKF-DM-INTERPRETATION");
        $sym42$RKF_DM_INDEXICALS = SubLObjectFactory.makeSymbol("RKF-DM-INDEXICALS");
        $sym43$_CSETF_RKF_DM_INDEXICALS = SubLObjectFactory.makeSymbol("_CSETF-RKF-DM-INDEXICALS");
        $sym44$RKF_DM_PHRASES = SubLObjectFactory.makeSymbol("RKF-DM-PHRASES");
        $sym45$_CSETF_RKF_DM_PHRASES = SubLObjectFactory.makeSymbol("_CSETF-RKF-DM-PHRASES");
        $kw46$INTERPRETATION = SubLObjectFactory.makeKeyword("INTERPRETATION");
        $kw47$INDEXICALS = SubLObjectFactory.makeKeyword("INDEXICALS");
        $kw48$PHRASES = SubLObjectFactory.makeKeyword("PHRASES");
        $sym49$MAKE_RKF_DISCOURSE_MAPPING = SubLObjectFactory.makeSymbol("MAKE-RKF-DISCOURSE-MAPPING");
        $sym50$VISIT_DEFSTRUCT_OBJECT_RKF_DISCOURSE_MAPPING_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RKF-DISCOURSE-MAPPING-METHOD");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERP"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXICALS"), (SubLObject)SubLObjectFactory.makeSymbol("PHRASES"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEXICALS"), (SubLObject)SubLObjectFactory.makeKeyword("PHRASES"));
        $kw53$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $sym54$NEW_RKF_DISCOURSE_MAPPING = SubLObjectFactory.makeSymbol("NEW-RKF-DISCOURSE-MAPPING");
        $str55$mapping_indexicals___S__ = SubLObjectFactory.makeString("mapping-indexicals: ~S~%");
        $const56$CourseOfAction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CourseOfAction"));
        $sym57$_X = SubLObjectFactory.makeSymbol("?X");
        $const58$coaDescribingSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("coaDescribingSpecification"));
        $list59 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSalientInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CourseOfAction")));
        $const60$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const61$TheSalientInstance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSalientInstance"));
        $const62$SomeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $const63$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str64$_S_is_not_a_valid_indexical = SubLObjectFactory.makeString("~S is not a valid indexical");
        $const65$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const66$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const67$TheSalientFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSalientFn"));
    }
    
    public static final class $rkf_discourse_context_native extends SubLStructNative
    {
        public SubLObject $explicit_mappings;
        public SubLObject $discourse_mt;
        public SubLObject $parent_context;
        public SubLObject $phrase_index;
        public SubLObject $indexical_index;
        private static final SubLStructDeclNative structDecl;
        
        public $rkf_discourse_context_native() {
            this.$explicit_mappings = (SubLObject)CommonSymbols.NIL;
            this.$discourse_mt = (SubLObject)CommonSymbols.NIL;
            this.$parent_context = (SubLObject)CommonSymbols.NIL;
            this.$phrase_index = (SubLObject)CommonSymbols.NIL;
            this.$indexical_index = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rkf_discourse_context_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$explicit_mappings;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$discourse_mt;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$parent_context;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$phrase_index;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$indexical_index;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$explicit_mappings = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$discourse_mt = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$parent_context = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$phrase_index = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$indexical_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rkf_discourse_context_native.class, rkf_discourse_tracking.$sym2$RKF_DISCOURSE_CONTEXT, rkf_discourse_tracking.$sym3$RKF_DISCOURSE_CONTEXT_P, rkf_discourse_tracking.$list4, rkf_discourse_tracking.$list5, new String[] { "$explicit_mappings", "$discourse_mt", "$parent_context", "$phrase_index", "$indexical_index" }, rkf_discourse_tracking.$list6, rkf_discourse_tracking.$list7, rkf_discourse_tracking.$sym8$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $rkf_discourse_context_p$UnaryFunction extends UnaryFunction
    {
        public $rkf_discourse_context_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RKF-DISCOURSE-CONTEXT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_discourse_tracking.rkf_discourse_context_p(arg1);
        }
    }
    
    public static final class $rkf_discourse_mapping_native extends SubLStructNative
    {
        public SubLObject $interpretation;
        public SubLObject $indexicals;
        public SubLObject $phrases;
        private static final SubLStructDeclNative structDecl;
        
        public $rkf_discourse_mapping_native() {
            this.$interpretation = (SubLObject)CommonSymbols.NIL;
            this.$indexicals = (SubLObject)CommonSymbols.NIL;
            this.$phrases = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rkf_discourse_mapping_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$interpretation;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$indexicals;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$phrases;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$interpretation = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$indexicals = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$phrases = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rkf_discourse_mapping_native.class, rkf_discourse_tracking.$sym32$RKF_DISCOURSE_MAPPING, rkf_discourse_tracking.$sym33$RKF_DISCOURSE_MAPPING_P, rkf_discourse_tracking.$list34, rkf_discourse_tracking.$list35, new String[] { "$interpretation", "$indexicals", "$phrases" }, rkf_discourse_tracking.$list36, rkf_discourse_tracking.$list37, rkf_discourse_tracking.$sym8$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $rkf_discourse_mapping_p$UnaryFunction extends UnaryFunction
    {
        public $rkf_discourse_mapping_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RKF-DISCOURSE-MAPPING-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_discourse_tracking.rkf_discourse_mapping_p(arg1);
        }
    }
}

/*

	Total time: 156 ms
	
*/