package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UserIO;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class misc_kb_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.misc_kb_utilities";
    public static final String myFingerPrint = "599eb351bb1f978dc76cf1357048a2f21e22db8f2bc5456936832c1781d618b7";
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3174L)
    public static SubLSymbol $kb_handle_internal_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3898L)
    private static SubLSymbol $find_object_by_kb_handle_methods$;
    private static final SubLSymbol $sym0$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const1$EverythingPSC;
    private static final SubLString $str2$__Collecting_proprietary_constant;
    private static final SubLString $str3$_____s_____;
    private static final SubLString $str4$_s_found_;
    private static final SubLString $str5$__Preparing_to_kill__s_proprietar;
    private static final SubLObject $const6$Microtheory;
    private static final SubLString $str7$___s_terms_killed_;
    private static final SubLString $str8$__Done_;
    private static final SubLString $str9$__Returning_to_Lisp_Interactor_;
    private static final SubLSymbol $sym10$DONE;
    private static final SubLSymbol $sym11$ASSERTION_P;
    private static final SubLSymbol $sym12$NART_P;
    private static final SubLInteger $int13$256;
    private static final SubLString $str14$_S_is_not_a_KB_datastructure_obje;
    private static final SubLSymbol $kw15$CONSTANT;
    private static final SubLSymbol $sym16$KB_HANDLE_INTERNAL_CONSTANT_METHOD;
    private static final SubLSymbol $sym17$KB_HANDLE_INTERNAL_NART_METHOD;
    private static final SubLSymbol $kw18$NART;
    private static final SubLSymbol $kw19$VARIABLE;
    private static final SubLSymbol $sym20$KB_HANDLE_INTERNAL_VARIABLE_METHOD;
    private static final SubLSymbol $kw21$ASSERTION;
    private static final SubLSymbol $sym22$KB_HANDLE_INTERNAL_ASSERTION_METHOD;
    private static final SubLSymbol $kw23$DEDUCTION;
    private static final SubLSymbol $sym24$KB_HANDLE_INTERNAL_DEDUCTION_METHOD;
    private static final SubLSymbol $sym25$FIRST;
    private static final SubLSymbol $sym26$FIND_CONSTANT_BY_INTERNAL_ID;
    private static final SubLSymbol $sym27$FIND_NART_BY_ID;
    private static final SubLSymbol $sym28$FIND_VARIABLE_BY_ID;
    private static final SubLSymbol $sym29$FIND_ASSERTION_BY_ID;
    private static final SubLSymbol $sym30$FIND_DEDUCTION_BY_ID;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$INTEGERP;
    private static final SubLSymbol $sym33$KEYWORDP;
    private static final SubLSymbol $sym34$CONSTANT_OR_NAT_;
    private static final SubLSymbol $kw35$MT;
    private static final SubLSymbol $kw36$BROAD_MT;
    private static final SubLSymbol $kw37$MAPPING_DONE;
    private static final SubLString $str38$do_broad_mt_index;
    private static final SubLSymbol $sym39$STRINGP;
    private static final SubLSymbol $kw40$SKIP;
    private static final SubLString $str41$_a;
    private static final SubLString $str42$;
    private static final SubLSymbol $sym43$STRING_;
    private static final SubLSymbol $sym44$COERCE_NAME;
    private static final SubLString $str45$_s_is_not_a_microtheory_;
    private static final SubLSymbol $kw46$DEFAULT;
    private static final SubLObject $const47$SpeechPart;
    private static final SubLSymbol $kw48$CHECKED;
    private static final SubLString $str49$____a__does_not_refer_to_a_valid_;
    private static final SubLSymbol $kw50$EOF;
    private static final SubLObject $const51$DeadTerm;
    private static final SubLSymbol $sym52$VALID_CONSTANT_;
    private static final SubLObject $const53$InstanceNamedFn;
    private static final SubLObject $const54$InstanceNamedFn_Ternary;
    private static final SubLSymbol $sym55$GET_CYC_TERM_EXTERNAL_IDENTIFIERS;
    private static final SubLString $str56$_;
    private static final SubLSymbol $sym57$GET_CYC_TERM_EXTERNAL_IDENITIFIERS_FOR_LIST;
    private static final SubLSymbol $kw58$NEW;
    private static final SubLSymbol $sym59$SERIALIZE_EXTERNAL_XML_TAG_FOR_CYCL_TERM;
    private static final SubLString $str60$concept;
    private static final SubLString $str61$nl;
    private static final SubLString $str62$cycl;
    private static final SubLString $str63$uri;
    private static final SubLString $str64$urn_cyc__cycapi_concept_;
    private static final SubLSymbol $kw65$UNINITIALIZED;
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 811L)
    public static SubLObject kill_proprietary_constants(final SubLObject collections) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kill_these = (SubLObject)misc_kb_utilities.NIL;
        SubLObject count = (SubLObject)misc_kb_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)misc_kb_utilities.$sym0$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(misc_kb_utilities.$const1$EverythingPSC, thread);
            PrintLow.format((SubLObject)misc_kb_utilities.T, (SubLObject)misc_kb_utilities.$str2$__Collecting_proprietary_constant);
            SubLObject cdolist_list_var = collections;
            SubLObject c = (SubLObject)misc_kb_utilities.NIL;
            c = cdolist_list_var.first();
            while (misc_kb_utilities.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)misc_kb_utilities.T, (SubLObject)misc_kb_utilities.$str3$_____s_____, c);
                final SubLObject units = isa.all_fort_instances(c, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED);
                final SubLObject len = Sequences.length(units);
                kill_these = conses_high.union(kill_these, units, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED);
                PrintLow.format((SubLObject)misc_kb_utilities.T, (SubLObject)misc_kb_utilities.$str4$_s_found_, len);
                cdolist_list_var = cdolist_list_var.rest();
                c = cdolist_list_var.first();
            }
            if (misc_kb_utilities.NIL != UserIO.user_confirm(PrintLow.format((SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.$str5$__Preparing_to_kill__s_proprietar, Sequences.length(kill_these)))) {
                cdolist_list_var = kill_these;
                SubLObject k = (SubLObject)misc_kb_utilities.NIL;
                k = cdolist_list_var.first();
                while (misc_kb_utilities.NIL != cdolist_list_var) {
                    if ((misc_kb_utilities.NIL != forts.fort_p(k) || (misc_kb_utilities.NIL != term.hl_ground_nautP(k) && misc_kb_utilities.NIL != narts_high.find_nart(k))) && misc_kb_utilities.NIL == isa.isa_in_any_mtP(k, misc_kb_utilities.$const6$Microtheory)) {
                        fi.fi_kill_int(k);
                        count = Numbers.add(count, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                        if (Numbers.mod(count, (SubLObject)misc_kb_utilities.TEN_INTEGER).numE((SubLObject)misc_kb_utilities.ZERO_INTEGER)) {
                            PrintLow.format((SubLObject)misc_kb_utilities.T, (SubLObject)misc_kb_utilities.$str7$___s_terms_killed_, count);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    k = cdolist_list_var.first();
                }
                cdolist_list_var = kill_these;
                k = (SubLObject)misc_kb_utilities.NIL;
                k = cdolist_list_var.first();
                while (misc_kb_utilities.NIL != cdolist_list_var) {
                    if ((misc_kb_utilities.NIL != forts.fort_p(k) || (misc_kb_utilities.NIL != term.hl_ground_nautP(k) && misc_kb_utilities.NIL != narts_high.find_nart(k))) && misc_kb_utilities.NIL != isa.isa_in_any_mtP(k, misc_kb_utilities.$const6$Microtheory)) {
                        fi.fi_kill_int(k);
                        count = Numbers.add(count, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                        if (Numbers.mod(count, (SubLObject)misc_kb_utilities.TEN_INTEGER).numE((SubLObject)misc_kb_utilities.ZERO_INTEGER)) {
                            PrintLow.format((SubLObject)misc_kb_utilities.T, (SubLObject)misc_kb_utilities.$str7$___s_terms_killed_, count);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    k = cdolist_list_var.first();
                }
                PrintLow.format((SubLObject)misc_kb_utilities.T, (SubLObject)misc_kb_utilities.$str8$__Done_);
            }
            else {
                PrintLow.format((SubLObject)misc_kb_utilities.T, (SubLObject)misc_kb_utilities.$str9$__Returning_to_Lisp_Interactor_);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)misc_kb_utilities.$sym10$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 2018L)
    public static SubLObject make_lispy_form(final SubLObject form) {
        if (misc_kb_utilities.NIL != assertion_handles.assertion_p(form)) {
            return make_lispy_form(fi.assertion_fi_formula(form, (SubLObject)misc_kb_utilities.UNPROVIDED));
        }
        if (form.isCons()) {
            final SubLObject assertion = list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym11$ASSERTION_P), form, (SubLObject)misc_kb_utilities.UNPROVIDED);
            if (misc_kb_utilities.NIL != assertion) {
                return make_lispy_form(conses_high.subst(fi.assertion_fi_formula(assertion, (SubLObject)misc_kb_utilities.UNPROVIDED), assertion, form, Symbols.symbol_function((SubLObject)misc_kb_utilities.EQUAL), (SubLObject)misc_kb_utilities.UNPROVIDED));
            }
            final SubLObject nart = list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym12$NART_P), form, (SubLObject)misc_kb_utilities.UNPROVIDED);
            if (misc_kb_utilities.NIL != nart) {
                return make_lispy_form(conses_high.subst(narts_high.nart_hl_formula(nart), nart, form, Symbols.symbol_function((SubLObject)misc_kb_utilities.EQUAL), (SubLObject)misc_kb_utilities.UNPROVIDED));
            }
            return form;
        }
        else {
            if (misc_kb_utilities.NIL != nart_handles.nart_p(form)) {
                return make_lispy_form(narts_high.nart_hl_formula(form));
            }
            return form;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 2590L)
    public static SubLObject cycl_from_id(final SubLObject assertion_id) {
        final SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
        if (misc_kb_utilities.NIL != assertion) {
            return make_lispy_form(assertion);
        }
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 2755L)
    public static SubLObject name_of_car(final SubLObject form) {
        return constants_high.constant_name(form.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 2820L)
    public static SubLObject kb_handle(final SubLObject v_object) {
        return kb_handle_internal(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3174L)
    public static SubLObject kb_handle_internal(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, misc_kb_utilities.$kb_handle_internal_method_table$.getGlobalValue());
        if (misc_kb_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        Errors.error((SubLObject)misc_kb_utilities.$str14$_S_is_not_a_KB_datastructure_obje, v_object);
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3287L)
    public static SubLObject kb_handle_internal_constant_method(final SubLObject v_object) {
        return Values.values((SubLObject)misc_kb_utilities.$kw15$CONSTANT, constants_high.constant_internal_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3400L)
    public static SubLObject kb_handle_internal_nart_method(final SubLObject v_object) {
        return kb_handle_internal_nart(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3493L)
    public static SubLObject kb_handle_internal_nart(final SubLObject nart) {
        return Values.values((SubLObject)misc_kb_utilities.$kw18$NART, nart_handles.nart_id(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3580L)
    public static SubLObject kb_handle_internal_variable_method(final SubLObject v_object) {
        return Values.values((SubLObject)misc_kb_utilities.$kw19$VARIABLE, variables.variable_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3684L)
    public static SubLObject kb_handle_internal_assertion_method(final SubLObject v_object) {
        return Values.values((SubLObject)misc_kb_utilities.$kw21$ASSERTION, assertion_handles.assertion_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3791L)
    public static SubLObject kb_handle_internal_deduction_method(final SubLObject v_object) {
        return Values.values((SubLObject)misc_kb_utilities.$kw23$DEDUCTION, deduction_handles.deduction_id(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 3990L)
    public static SubLObject find_object_by_kb_handle(final SubLObject type, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject method = conses_high.second(conses_high.assoc(type, misc_kb_utilities.$find_object_by_kb_handle_methods$.getDynamicValue(thread), (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED));
        if (misc_kb_utilities.NIL != method) {
            return Functions.funcall(method, id);
        }
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 4233L)
    public static SubLObject register_find_object_by_kb_handle_method(final SubLObject type, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        misc_kb_utilities.$find_object_by_kb_handle_methods$.setDynamicValue(Sequences.delete(type, misc_kb_utilities.$find_object_by_kb_handle_methods$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)misc_kb_utilities.EQL), Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym25$FIRST), (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED), thread);
        misc_kb_utilities.$find_object_by_kb_handle_methods$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(type, method), misc_kb_utilities.$find_object_by_kb_handle_methods$.getDynamicValue(thread)), thread);
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 4981L)
    public static SubLObject list_kb_handle(SubLObject v_object) {
        v_object = function_terms.naut_to_nart(v_object);
        SubLObject kb_datastructure_objectP = (SubLObject)misc_kb_utilities.NIL;
        if (misc_kb_utilities.NIL == kb_datastructure_objectP) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = (SubLObject)misc_kb_utilities.$list31, pred = (SubLObject)misc_kb_utilities.NIL, pred = csome_list_var.first(); misc_kb_utilities.NIL == kb_datastructure_objectP && misc_kb_utilities.NIL != csome_list_var; kb_datastructure_objectP = Functions.funcall(pred, v_object), csome_list_var = csome_list_var.rest(), pred = csome_list_var.first()) {}
        }
        return (SubLObject)((misc_kb_utilities.NIL != kb_datastructure_objectP) ? Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(kb_handle(v_object))) : misc_kb_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 5488L)
    public static SubLObject fi_object_from_handle(final SubLObject id, SubLObject type) {
        if (type == misc_kb_utilities.UNPROVIDED) {
            type = (SubLObject)misc_kb_utilities.$kw15$CONSTANT;
        }
        assert misc_kb_utilities.NIL != Types.integerp(id) : id;
        assert misc_kb_utilities.NIL != Types.keywordp(type) : type;
        return make_lispy_form(find_object_by_kb_handle(type, id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 5816L)
    public static SubLObject get_term_id(SubLObject v_term) {
        v_term = function_terms.naut_to_nart(v_term);
        if (misc_kb_utilities.NIL == forts.valid_fortP(v_term)) {
            return (SubLObject)misc_kb_utilities.NIL;
        }
        if (misc_kb_utilities.NIL != nart_handles.nart_p(v_term)) {
            return Numbers.minus(nart_handles.nart_id(v_term));
        }
        if (misc_kb_utilities.NIL != constant_handles.constant_p(v_term)) {
            return constants_high.constant_internal_id(v_term);
        }
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 6244L)
    public static SubLObject term_from_id(final SubLObject id) {
        if (!id.isInteger()) {
            return (SubLObject)misc_kb_utilities.NIL;
        }
        SubLObject v_term = (SubLObject)misc_kb_utilities.NIL;
        if (id.isNegative()) {
            v_term = nart_handles.find_nart_by_id(Numbers.minus(id));
        }
        else {
            v_term = constants_high.find_constant_by_internal_id(id);
        }
        return make_lispy_form(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 6494L)
    public static SubLObject not_a_cyc_constantP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL == constant_handles.constant_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 6562L)
    public static SubLObject gather_constants(final SubLObject form) {
        if (misc_kb_utilities.NIL != constant_or_natP(form)) {
            return (SubLObject)ConsesLow.list(form);
        }
        return list_utilities.cons_tree_gather(form, Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym34$CONSTANT_OR_NAT_), Symbols.symbol_function((SubLObject)misc_kb_utilities.EQUAL), (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 6714L)
    public static SubLObject constant_or_natP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL != forts.valid_fortP(obj) || (misc_kb_utilities.NIL != term.hl_ground_nautP(obj) && misc_kb_utilities.NIL != forts.valid_fortP(narts_high.find_nart(obj))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 6847L)
    public static SubLObject nat_objectP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL != term.hl_ground_nautP(obj) || misc_kb_utilities.NIL != term.hl_ground_nautP(function_terms.nart_to_naut(obj)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 6953L)
    public static SubLObject remove_mt_assertions(final SubLObject mt) {
        tms.tms_remove_mt_arguments(mt, (SubLObject)misc_kb_utilities.UNPROVIDED);
        return empty_mt_p(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 7157L)
    public static SubLObject empty_mt_p(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found = (SubLObject)misc_kb_utilities.NIL;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql((SubLObject)misc_kb_utilities.$kw35$MT)) {
            if (misc_kb_utilities.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)misc_kb_utilities.NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = (SubLObject)misc_kb_utilities.NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL);
                    SubLObject done_var = found;
                    final SubLObject token_var = (SubLObject)misc_kb_utilities.NIL;
                    while (misc_kb_utilities.NIL == done_var) {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(ass));
                        if (misc_kb_utilities.NIL != valid) {
                            found = (SubLObject)misc_kb_utilities.T;
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL == valid || misc_kb_utilities.NIL != found);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)misc_kb_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (misc_kb_utilities.NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)misc_kb_utilities.$kw36$BROAD_MT) && misc_kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)misc_kb_utilities.NIL)) {
            SubLObject catch_var = (SubLObject)misc_kb_utilities.NIL;
            try {
                thread.throwStack.push(misc_kb_utilities.$kw37$MAPPING_DONE);
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = (SubLObject)misc_kb_utilities.$str38$do_broad_mt_index;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)misc_kb_utilities.ZERO_INTEGER;
                assert misc_kb_utilities.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)misc_kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)misc_kb_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$1 = idx;
                        if (misc_kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$1, (SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                            final SubLObject idx_$2 = idx_$1;
                            if (misc_kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$2, (SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$2);
                                final SubLObject backwardP_var = (SubLObject)misc_kb_utilities.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject ass2;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)misc_kb_utilities.NIL, v_iteration = (SubLObject)misc_kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)misc_kb_utilities.ONE_INTEGER)) {
                                    a_id = ((misc_kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)misc_kb_utilities.ONE_INTEGER) : v_iteration);
                                    a_handle = Vectors.aref(vector_var, a_id);
                                    if (misc_kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || misc_kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                                        if (misc_kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                            a_handle = (SubLObject)misc_kb_utilities.$kw40$SKIP;
                                        }
                                        ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (misc_kb_utilities.NIL != found) {
                                            utilities_macros.mapping_finished();
                                        }
                                        if (misc_kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL)) {
                                            found = (SubLObject)misc_kb_utilities.T;
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$3 = idx_$1;
                            if (misc_kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$3) || misc_kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$3);
                                SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$3);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$3);
                                final SubLObject v_default = (SubLObject)((misc_kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP)) ? misc_kb_utilities.NIL : misc_kb_utilities.$kw40$SKIP);
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                    if (misc_kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP) || misc_kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                        final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (misc_kb_utilities.NIL != found) {
                                            utilities_macros.mapping_finished();
                                        }
                                        if (misc_kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL)) {
                                            found = (SubLObject)misc_kb_utilities.T;
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    a_id2 = Numbers.add(a_id2, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)misc_kb_utilities.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)misc_kb_utilities.$kw37$MAPPING_DONE);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL == found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 7306L)
    public static SubLObject coerce_name(final SubLObject obj) {
        if (misc_kb_utilities.NIL != constant_handles.constant_p(obj)) {
            final SubLObject name = constants_high.constant_name(obj);
            if (name.isString()) {
                return name;
            }
            if (misc_kb_utilities.NIL != nart_handles.nart_p(obj)) {
                return string_utilities.string_remove_constant_reader_prefixes(PrintLow.format((SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.$str41$_a, narts_high.nart_hl_formula(obj)));
            }
            return string_utilities.string_remove_constant_reader_prefixes(PrintLow.format((SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.$str41$_a, obj));
        }
        else {
            if (misc_kb_utilities.NIL != term.hl_ground_nautP(obj)) {
                return string_utilities.string_remove_constant_reader_prefixes(PrintLow.format((SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.$str41$_a, obj));
            }
            if (misc_kb_utilities.NIL != string_utilities.non_empty_stringP(obj)) {
                return obj;
            }
            if (misc_kb_utilities.NIL == obj) {
                return (SubLObject)misc_kb_utilities.$str42$;
            }
            return PrintLow.format((SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.$str41$_a, obj);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 7850L)
    public static SubLObject terms_in_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = (SubLObject)misc_kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)misc_kb_utilities.$sym0$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(misc_kb_utilities.$const1$EverythingPSC, thread);
            v_boolean = isa.isaP(mt, misc_kb_utilities.$const6$Microtheory, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (misc_kb_utilities.NIL != forts.valid_fortP(mt) && misc_kb_utilities.NIL != v_boolean) {
            SubLObject terms = (SubLObject)misc_kb_utilities.NIL;
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql((SubLObject)misc_kb_utilities.$kw35$MT)) {
                if (misc_kb_utilities.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)misc_kb_utilities.NIL)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = (SubLObject)misc_kb_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL);
                        SubLObject done_var = (SubLObject)misc_kb_utilities.NIL;
                        final SubLObject token_var = (SubLObject)misc_kb_utilities.NIL;
                        while (misc_kb_utilities.NIL == done_var) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(ass));
                            if (misc_kb_utilities.NIL != valid) {
                                final SubLObject form = make_lispy_form(ass);
                                terms = conses_high.union(terms, list_utilities.tree_gather(form, Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym34$CONSTANT_OR_NAT_), (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED), (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED);
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL == valid);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)misc_kb_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (misc_kb_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)misc_kb_utilities.$kw36$BROAD_MT) && misc_kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)misc_kb_utilities.NIL)) {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = (SubLObject)misc_kb_utilities.$str38$do_broad_mt_index;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)misc_kb_utilities.ZERO_INTEGER;
                assert misc_kb_utilities.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_4 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)misc_kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)misc_kb_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$5 = idx;
                        if (misc_kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$5, (SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                            final SubLObject idx_$6 = idx_$5;
                            if (misc_kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$6, (SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$6);
                                final SubLObject backwardP_var = (SubLObject)misc_kb_utilities.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject ass2;
                                SubLObject form2;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)misc_kb_utilities.NIL, v_iteration = (SubLObject)misc_kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)misc_kb_utilities.ONE_INTEGER)) {
                                    a_id = ((misc_kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)misc_kb_utilities.ONE_INTEGER) : v_iteration);
                                    a_handle = Vectors.aref(vector_var, a_id);
                                    if (misc_kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || misc_kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                                        if (misc_kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                            a_handle = (SubLObject)misc_kb_utilities.$kw40$SKIP;
                                        }
                                        ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (misc_kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL)) {
                                            form2 = make_lispy_form(ass2);
                                            terms = conses_high.union(terms, list_utilities.tree_gather(form2, Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym34$CONSTANT_OR_NAT_), (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED), (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED);
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$7 = idx_$5;
                            if (misc_kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$7) || misc_kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$7);
                                SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$7);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$7);
                                final SubLObject v_default = (SubLObject)((misc_kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP)) ? misc_kb_utilities.NIL : misc_kb_utilities.$kw40$SKIP);
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                    if (misc_kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP) || misc_kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                        final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (misc_kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL)) {
                                            final SubLObject form3 = make_lispy_form(ass3);
                                            terms = conses_high.union(terms, list_utilities.tree_gather(form3, Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym34$CONSTANT_OR_NAT_), (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED), (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED);
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    a_id2 = Numbers.add(a_id2, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)misc_kb_utilities.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_7, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_5, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_4, thread);
                }
            }
            return Sort.sort(conses_high.copy_list(terms), Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym43$STRING_), Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym44$COERCE_NAME));
        }
        Errors.warn((SubLObject)misc_kb_utilities.$str45$_s_is_not_a_microtheory_, mt);
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 8331L)
    public static SubLObject assertion_ids_in_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ids = (SubLObject)misc_kb_utilities.NIL;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql((SubLObject)misc_kb_utilities.$kw35$MT)) {
            if (misc_kb_utilities.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)misc_kb_utilities.NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = (SubLObject)misc_kb_utilities.NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL);
                    SubLObject done_var = (SubLObject)misc_kb_utilities.NIL;
                    final SubLObject token_var = (SubLObject)misc_kb_utilities.NIL;
                    while (misc_kb_utilities.NIL == done_var) {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(ass));
                        if (misc_kb_utilities.NIL != valid) {
                            ids = (SubLObject)ConsesLow.cons(assertion_handles.assertion_id(ass), ids);
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL == valid);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)misc_kb_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (misc_kb_utilities.NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)misc_kb_utilities.$kw36$BROAD_MT) && misc_kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, (SubLObject)misc_kb_utilities.NIL)) {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)misc_kb_utilities.$str38$do_broad_mt_index;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)misc_kb_utilities.ZERO_INTEGER;
            assert misc_kb_utilities.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)misc_kb_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)misc_kb_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$9 = idx;
                    if (misc_kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$9, (SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                        final SubLObject idx_$10 = idx_$9;
                        if (misc_kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$10, (SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                            final SubLObject backwardP_var = (SubLObject)misc_kb_utilities.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject ass2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)misc_kb_utilities.NIL, v_iteration = (SubLObject)misc_kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)misc_kb_utilities.ONE_INTEGER)) {
                                a_id = ((misc_kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)misc_kb_utilities.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (misc_kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || misc_kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                                    if (misc_kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)misc_kb_utilities.$kw40$SKIP;
                                    }
                                    ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (misc_kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL)) {
                                        ids = (SubLObject)ConsesLow.cons(assertion_handles.assertion_id(ass2), ids);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$11 = idx_$9;
                        if (misc_kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$11) || misc_kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$11);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$11);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$11);
                            final SubLObject v_default = (SubLObject)((misc_kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP)) ? misc_kb_utilities.NIL : misc_kb_utilities.$kw40$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (misc_kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)misc_kb_utilities.$kw40$SKIP) || misc_kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (misc_kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL)) {
                                        ids = (SubLObject)ConsesLow.cons(assertion_handles.assertion_id(ass3), ids);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)misc_kb_utilities.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)misc_kb_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        return Sequences.nreverse(ids);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 8473L)
    public static SubLObject try_unassert(final SubLObject sentence, final SubLObject mt) {
        if (misc_kb_utilities.NIL != fi.sentence_assertions(sentence, mt)) {
            return ke.ke_unassert(sentence, mt);
        }
        return (SubLObject)misc_kb_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 8737L)
    public static SubLObject try_assert(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == misc_kb_utilities.UNPROVIDED) {
            strength = (SubLObject)misc_kb_utilities.$kw46$DEFAULT;
        }
        if (direction == misc_kb_utilities.UNPROVIDED) {
            direction = (SubLObject)misc_kb_utilities.NIL;
        }
        if (misc_kb_utilities.NIL == fi.sentence_assertions(sentence, mt)) {
            return ke.ke_assert(sentence, mt, strength, direction);
        }
        return (SubLObject)misc_kb_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 9063L)
    public static SubLObject try_unassert_now(final SubLObject sentence, final SubLObject mt) {
        if (misc_kb_utilities.NIL != fi.sentence_assertions(sentence, mt)) {
            return ke.ke_unassert_now(sentence, mt);
        }
        return (SubLObject)misc_kb_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 9339L)
    public static SubLObject try_assert_now(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == misc_kb_utilities.UNPROVIDED) {
            strength = (SubLObject)misc_kb_utilities.$kw46$DEFAULT;
        }
        if (direction == misc_kb_utilities.UNPROVIDED) {
            direction = (SubLObject)misc_kb_utilities.NIL;
        }
        if (misc_kb_utilities.NIL == fi.sentence_assertions(sentence, mt)) {
            return ke.ke_assert_now(sentence, mt, strength, direction);
        }
        return (SubLObject)misc_kb_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 9677L)
    public static SubLObject fast_assert_int(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction, SubLObject forward_inference_enabledP, SubLObject sbhl_type_checkingP, SubLObject semantic_wff_checkingP) {
        if (strength == misc_kb_utilities.UNPROVIDED) {
            strength = (SubLObject)misc_kb_utilities.$kw46$DEFAULT;
        }
        if (direction == misc_kb_utilities.UNPROVIDED) {
            direction = (SubLObject)misc_kb_utilities.NIL;
        }
        if (forward_inference_enabledP == misc_kb_utilities.UNPROVIDED) {
            forward_inference_enabledP = (SubLObject)misc_kb_utilities.T;
        }
        if (sbhl_type_checkingP == misc_kb_utilities.UNPROVIDED) {
            sbhl_type_checkingP = (SubLObject)misc_kb_utilities.NIL;
        }
        if (semantic_wff_checkingP == misc_kb_utilities.UNPROVIDED) {
            semantic_wff_checkingP = (SubLObject)misc_kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)misc_kb_utilities.NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(forward_inference_enabledP, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL == sbhl_type_checkingP), thread);
            if (misc_kb_utilities.NIL != semantic_wff_checkingP) {
                result = fi.fi_assert_int(sentence, mt, strength, direction);
            }
            else {
                final SubLObject _prev_bind_0_$13 = control_vars.$within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_1_$14 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                try {
                    control_vars.$within_assert$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    wff_utilities.$check_var_typesP$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    czer_vars.$simplify_literalP$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    wff_vars.$validate_constantsP$.bind((SubLObject)misc_kb_utilities.NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)misc_kb_utilities.T, thread);
                    result = fi.fi_assert_int(sentence, mt, strength, direction);
                }
                finally {
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1_$14, thread);
                    control_vars.$within_assert$.rebind(_prev_bind_0_$13, thread);
                }
            }
        }
        finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 10216L)
    public static SubLObject possibly_clear_genl_pos(final SubLObject assertion) {
        if (misc_kb_utilities.NIL != isa.isaP(assertions_high.gaf_arg2(assertion), misc_kb_utilities.$const47$SpeechPart, assertions_high.assertion_mt(assertion), (SubLObject)misc_kb_utilities.UNPROVIDED)) {
            lexicon_accessors.clear_genl_posP();
        }
        return (SubLObject)misc_kb_utilities.$kw48$CHECKED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 10613L)
    public static SubLObject guess_fort(final SubLObject fort_spec) {
        return cb_utilities.cb_guess_fort(fort_spec, (SubLObject)misc_kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 11481L)
    public static SubLObject fort_for_string(final SubLObject fort_spec) {
        return guess_fort(fort_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 11588L)
    public static SubLObject read_terms_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms_names = file_utilities.read_text_file(filename);
        SubLObject term_list = (SubLObject)misc_kb_utilities.NIL;
        SubLObject cdolist_list_var = terms_names;
        SubLObject name = (SubLObject)misc_kb_utilities.NIL;
        name = cdolist_list_var.first();
        while (misc_kb_utilities.NIL != cdolist_list_var) {
            final SubLObject v_term = fort_for_string(name);
            if (misc_kb_utilities.NIL != v_term) {
                term_list = (SubLObject)ConsesLow.cons(v_term, term_list);
            }
            else {
                PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)misc_kb_utilities.$str49$____a__does_not_refer_to_a_valid_, name);
            }
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        return Sequences.nreverse(term_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 12210L)
    public static SubLObject read_from_string_ignoring_all_errors(final SubLObject string, SubLObject eof_value, SubLObject start, SubLObject end) {
        if (eof_value == misc_kb_utilities.UNPROVIDED) {
            eof_value = (SubLObject)misc_kb_utilities.$kw50$EOF;
        }
        if (start == misc_kb_utilities.UNPROVIDED) {
            start = (SubLObject)misc_kb_utilities.ZERO_INTEGER;
        }
        if (end == misc_kb_utilities.UNPROVIDED) {
            end = (SubLObject)misc_kb_utilities.NIL;
        }
        return reader.read_from_string_ignoring_errors(string, (SubLObject)misc_kb_utilities.NIL, eof_value, start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 12417L)
    public static SubLObject string_to_formula(final SubLObject formula_text) {
        return reader.read_from_string_ignoring_errors(string_utilities.cyclify_string(formula_text), (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 12760L)
    public static SubLObject find_or_create_nart_from_text(final SubLObject nart_text) {
        assert misc_kb_utilities.NIL != Types.stringp(nart_text) : nart_text;
        SubLObject fort = fort_for_string(nart_text);
        if (misc_kb_utilities.NIL == forts.fort_p(fort)) {
            czer_main.cyc_find_or_create_nart(string_to_formula(nart_text), (SubLObject)misc_kb_utilities.UNPROVIDED);
            fort = fort_for_string(nart_text);
        }
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 13461L)
    public static SubLObject resolve_constant(final SubLObject name, SubLObject v_default) {
        if (v_default == misc_kb_utilities.UNPROVIDED) {
            v_default = misc_kb_utilities.$const51$DeadTerm;
        }
        assert misc_kb_utilities.NIL != constant_handles.valid_constantP(v_default, (SubLObject)misc_kb_utilities.UNPROVIDED) : v_default;
        SubLObject constant = constants_high.find_constant(name);
        if (misc_kb_utilities.NIL == constant_handles.valid_constantP(constant, (SubLObject)misc_kb_utilities.UNPROVIDED)) {
            constant = v_default;
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 14103L)
    public static SubLObject instance_named_fn_expression_p(final SubLObject expression) {
        return (SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL != el_utilities.el_formula_with_operator_p(expression, misc_kb_utilities.$const53$InstanceNamedFn) || misc_kb_utilities.NIL != el_utilities.el_formula_with_operator_p(expression, misc_kb_utilities.$const54$InstanceNamedFn_Ternary));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 14372L)
    public static SubLObject instance_named_fn_term_p(final SubLObject expression) {
        return (SubLObject)SubLObjectFactory.makeBoolean(misc_kb_utilities.NIL != el_utilities.el_formula_with_operator_p(cycl_utilities.hl_to_el(expression), misc_kb_utilities.$const53$InstanceNamedFn) || misc_kb_utilities.NIL != el_utilities.el_formula_with_operator_p(cycl_utilities.hl_to_el(expression), misc_kb_utilities.$const54$InstanceNamedFn_Ternary));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 14592L)
    public static SubLObject get_cyc_term_external_identifiers(final SubLObject cycl_term) {
        final SubLObject generation_term = cycl_term.isString() ? Sequences.cconcatenate((SubLObject)misc_kb_utilities.$str56$_, new SubLObject[] { cycl_term, misc_kb_utilities.$str56$_ }) : cycl_term;
        final SubLObject el_term = cycl_utilities.hl_to_el(cycl_term);
        SubLObject result = (SubLObject)misc_kb_utilities.NIL;
        if (generation_term.isNumber() || generation_term.isString()) {
            result = (SubLObject)ConsesLow.cons(string_utilities.to_string(generation_term), result);
        }
        else {
            result = (SubLObject)ConsesLow.cons(pph_main.generate_phrase(cycl_term, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED, (SubLObject)misc_kb_utilities.UNPROVIDED), result);
        }
        result = (SubLObject)ConsesLow.cons(kb_utilities.compact_hl_external_id_string(el_term), result);
        result = (SubLObject)ConsesLow.cons(el_term, result);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 14592L)
    public static SubLObject get_cyc_term_external_idenitifiers_for_list(final SubLObject list_of_cycl_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)misc_kb_utilities.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)misc_kb_utilities.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$15 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$16 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$17 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$18 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    result = Mapping.mapcar((SubLObject)misc_kb_utilities.$sym55$GET_CYC_TERM_EXTERNAL_IDENTIFIERS, list_of_cycl_terms);
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)misc_kb_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$17, thread);
                        }
                        if (new_or_reused == misc_kb_utilities.$kw58$NEW && misc_kb_utilities.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$16, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)misc_kb_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (misc_kb_utilities.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$15, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/misc-kb-utilities.lisp", position = 14592L)
    public static SubLObject serialize_external_xml_tag_for_cycl_term(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ids = get_cyc_term_external_identifiers(cycl_term);
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal((SubLObject)misc_kb_utilities.$str60$concept, (SubLObject)ConsesLow.list((SubLObject)misc_kb_utilities.$str61$nl, conses_high.third(ids), (SubLObject)misc_kb_utilities.$str62$cycl, string_utilities.to_string(ids.first()), (SubLObject)misc_kb_utilities.$str63$uri, Sequences.cconcatenate((SubLObject)misc_kb_utilities.$str64$urn_cyc__cycapi_concept_, web_utilities.html_url_encode(conses_high.second(ids), (SubLObject)misc_kb_utilities.T))), (SubLObject)misc_kb_utilities.T, (SubLObject)misc_kb_utilities.NIL, (SubLObject)misc_kb_utilities.$kw65$UNINITIALIZED);
            final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind((SubLObject)misc_kb_utilities.$kw65$UNINITIALIZED, thread);
            }
            finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
            }
        }
        finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    public static SubLObject declare_misc_kb_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "kill_proprietary_constants", "KILL-PROPRIETARY-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "make_lispy_form", "MAKE-LISPY-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "cycl_from_id", "CYCL-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "name_of_car", "NAME-OF-CAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "kb_handle", "KB-HANDLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "kb_handle_internal", "KB-HANDLE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "kb_handle_internal_constant_method", "KB-HANDLE-INTERNAL-CONSTANT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "kb_handle_internal_nart_method", "KB-HANDLE-INTERNAL-NART-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "kb_handle_internal_nart", "KB-HANDLE-INTERNAL-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "kb_handle_internal_variable_method", "KB-HANDLE-INTERNAL-VARIABLE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "kb_handle_internal_assertion_method", "KB-HANDLE-INTERNAL-ASSERTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "kb_handle_internal_deduction_method", "KB-HANDLE-INTERNAL-DEDUCTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "find_object_by_kb_handle", "FIND-OBJECT-BY-KB-HANDLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "register_find_object_by_kb_handle_method", "REGISTER-FIND-OBJECT-BY-KB-HANDLE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "list_kb_handle", "LIST-KB-HANDLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "fi_object_from_handle", "FI-OBJECT-FROM-HANDLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "get_term_id", "GET-TERM-ID", 1, 0, false);
        new $get_term_id$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "term_from_id", "TERM-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "not_a_cyc_constantP", "NOT-A-CYC-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "gather_constants", "GATHER-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "constant_or_natP", "CONSTANT-OR-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "nat_objectP", "NAT-OBJECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "remove_mt_assertions", "REMOVE-MT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "empty_mt_p", "EMPTY-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "coerce_name", "COERCE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "terms_in_mt", "TERMS-IN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "assertion_ids_in_mt", "ASSERTION-IDS-IN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "try_unassert", "TRY-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "try_assert", "TRY-ASSERT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "try_unassert_now", "TRY-UNASSERT-NOW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "try_assert_now", "TRY-ASSERT-NOW", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "fast_assert_int", "FAST-ASSERT-INT", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "possibly_clear_genl_pos", "POSSIBLY-CLEAR-GENL-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "guess_fort", "GUESS-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "fort_for_string", "FORT-FOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "read_terms_from_file", "READ-TERMS-FROM-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "read_from_string_ignoring_all_errors", "READ-FROM-STRING-IGNORING-ALL-ERRORS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "string_to_formula", "STRING-TO-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "find_or_create_nart_from_text", "FIND-OR-CREATE-NART-FROM-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "resolve_constant", "RESOLVE-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "instance_named_fn_expression_p", "INSTANCE-NAMED-FN-EXPRESSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "instance_named_fn_term_p", "INSTANCE-NAMED-FN-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "get_cyc_term_external_identifiers", "GET-CYC-TERM-EXTERNAL-IDENTIFIERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "get_cyc_term_external_idenitifiers_for_list", "GET-CYC-TERM-EXTERNAL-IDENITIFIERS-FOR-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.misc_kb_utilities", "serialize_external_xml_tag_for_cycl_term", "SERIALIZE-EXTERNAL-XML-TAG-FOR-CYCL-TERM", 1, 0, false);
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    public static SubLObject init_misc_kb_utilities_file() {
        misc_kb_utilities.$kb_handle_internal_method_table$ = SubLFiles.deflexical("*KB-HANDLE-INTERNAL-METHOD-TABLE*", Vectors.make_vector((SubLObject)misc_kb_utilities.$int13$256, (SubLObject)misc_kb_utilities.NIL));
        misc_kb_utilities.$find_object_by_kb_handle_methods$ = SubLFiles.defparameter("*FIND-OBJECT-BY-KB-HANDLE-METHODS*", (SubLObject)misc_kb_utilities.NIL);
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    public static SubLObject setup_misc_kb_utilities_file() {
        Structures.register_method(misc_kb_utilities.$kb_handle_internal_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym16$KB_HANDLE_INTERNAL_CONSTANT_METHOD));
        Structures.register_method(misc_kb_utilities.$kb_handle_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym17$KB_HANDLE_INTERNAL_NART_METHOD));
        Structures.register_method(misc_kb_utilities.$kb_handle_internal_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym20$KB_HANDLE_INTERNAL_VARIABLE_METHOD));
        Structures.register_method(misc_kb_utilities.$kb_handle_internal_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym22$KB_HANDLE_INTERNAL_ASSERTION_METHOD));
        Structures.register_method(misc_kb_utilities.$kb_handle_internal_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function((SubLObject)misc_kb_utilities.$sym24$KB_HANDLE_INTERNAL_DEDUCTION_METHOD));
        register_find_object_by_kb_handle_method((SubLObject)misc_kb_utilities.$kw15$CONSTANT, (SubLObject)misc_kb_utilities.$sym26$FIND_CONSTANT_BY_INTERNAL_ID);
        register_find_object_by_kb_handle_method((SubLObject)misc_kb_utilities.$kw18$NART, (SubLObject)misc_kb_utilities.$sym27$FIND_NART_BY_ID);
        register_find_object_by_kb_handle_method((SubLObject)misc_kb_utilities.$kw19$VARIABLE, (SubLObject)misc_kb_utilities.$sym28$FIND_VARIABLE_BY_ID);
        register_find_object_by_kb_handle_method((SubLObject)misc_kb_utilities.$kw21$ASSERTION, (SubLObject)misc_kb_utilities.$sym29$FIND_ASSERTION_BY_ID);
        register_find_object_by_kb_handle_method((SubLObject)misc_kb_utilities.$kw23$DEDUCTION, (SubLObject)misc_kb_utilities.$sym30$FIND_DEDUCTION_BY_ID);
        access_macros.register_external_symbol((SubLObject)misc_kb_utilities.$sym55$GET_CYC_TERM_EXTERNAL_IDENTIFIERS);
        access_macros.register_external_symbol((SubLObject)misc_kb_utilities.$sym57$GET_CYC_TERM_EXTERNAL_IDENITIFIERS_FOR_LIST);
        access_macros.register_external_symbol((SubLObject)misc_kb_utilities.$sym59$SERIALIZE_EXTERNAL_XML_TAG_FOR_CYCL_TERM);
        return (SubLObject)misc_kb_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_misc_kb_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_misc_kb_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_misc_kb_utilities_file();
    }
    
    static {
        me = (SubLFile)new misc_kb_utilities();
        misc_kb_utilities.$kb_handle_internal_method_table$ = null;
        misc_kb_utilities.$find_object_by_kb_handle_methods$ = null;
        $sym0$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const1$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str2$__Collecting_proprietary_constant = SubLObjectFactory.makeString("~%Collecting proprietary constants ... ");
        $str3$_____s_____ = SubLObjectFactory.makeString("~%  ~s ... ");
        $str4$_s_found_ = SubLObjectFactory.makeString("~s found.");
        $str5$__Preparing_to_kill__s_proprietar = SubLObjectFactory.makeString("~%Preparing to kill ~s proprietary constants.  Go ahead? ");
        $const6$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $str7$___s_terms_killed_ = SubLObjectFactory.makeString("~%~s terms killed.");
        $str8$__Done_ = SubLObjectFactory.makeString("~%Done.");
        $str9$__Returning_to_Lisp_Interactor_ = SubLObjectFactory.makeString("~%Returning to Lisp Interactor.");
        $sym10$DONE = SubLObjectFactory.makeSymbol("DONE");
        $sym11$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym12$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $int13$256 = SubLObjectFactory.makeInteger(256);
        $str14$_S_is_not_a_KB_datastructure_obje = SubLObjectFactory.makeString("~S is not a KB datastructure object");
        $kw15$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $sym16$KB_HANDLE_INTERNAL_CONSTANT_METHOD = SubLObjectFactory.makeSymbol("KB-HANDLE-INTERNAL-CONSTANT-METHOD");
        $sym17$KB_HANDLE_INTERNAL_NART_METHOD = SubLObjectFactory.makeSymbol("KB-HANDLE-INTERNAL-NART-METHOD");
        $kw18$NART = SubLObjectFactory.makeKeyword("NART");
        $kw19$VARIABLE = SubLObjectFactory.makeKeyword("VARIABLE");
        $sym20$KB_HANDLE_INTERNAL_VARIABLE_METHOD = SubLObjectFactory.makeSymbol("KB-HANDLE-INTERNAL-VARIABLE-METHOD");
        $kw21$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $sym22$KB_HANDLE_INTERNAL_ASSERTION_METHOD = SubLObjectFactory.makeSymbol("KB-HANDLE-INTERNAL-ASSERTION-METHOD");
        $kw23$DEDUCTION = SubLObjectFactory.makeKeyword("DEDUCTION");
        $sym24$KB_HANDLE_INTERNAL_DEDUCTION_METHOD = SubLObjectFactory.makeSymbol("KB-HANDLE-INTERNAL-DEDUCTION-METHOD");
        $sym25$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym26$FIND_CONSTANT_BY_INTERNAL_ID = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $sym27$FIND_NART_BY_ID = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
        $sym28$FIND_VARIABLE_BY_ID = SubLObjectFactory.makeSymbol("FIND-VARIABLE-BY-ID");
        $sym29$FIND_ASSERTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $sym30$FIND_DEDUCTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-DEDUCTION-BY-ID");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-P"));
        $sym32$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym33$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym34$CONSTANT_OR_NAT_ = SubLObjectFactory.makeSymbol("CONSTANT-OR-NAT?");
        $kw35$MT = SubLObjectFactory.makeKeyword("MT");
        $kw36$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $kw37$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $str38$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym39$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw40$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str41$_a = SubLObjectFactory.makeString("~a");
        $str42$ = SubLObjectFactory.makeString("");
        $sym43$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym44$COERCE_NAME = SubLObjectFactory.makeSymbol("COERCE-NAME");
        $str45$_s_is_not_a_microtheory_ = SubLObjectFactory.makeString("~s is not a microtheory.");
        $kw46$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const47$SpeechPart = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SpeechPart"));
        $kw48$CHECKED = SubLObjectFactory.makeKeyword("CHECKED");
        $str49$____a__does_not_refer_to_a_valid_ = SubLObjectFactory.makeString("~&'~a' does not refer to a valid term~%");
        $kw50$EOF = SubLObjectFactory.makeKeyword("EOF");
        $const51$DeadTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DeadTerm"));
        $sym52$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $const53$InstanceNamedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn"));
        $const54$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary"));
        $sym55$GET_CYC_TERM_EXTERNAL_IDENTIFIERS = SubLObjectFactory.makeSymbol("GET-CYC-TERM-EXTERNAL-IDENTIFIERS");
        $str56$_ = SubLObjectFactory.makeString("\"");
        $sym57$GET_CYC_TERM_EXTERNAL_IDENITIFIERS_FOR_LIST = SubLObjectFactory.makeSymbol("GET-CYC-TERM-EXTERNAL-IDENITIFIERS-FOR-LIST");
        $kw58$NEW = SubLObjectFactory.makeKeyword("NEW");
        $sym59$SERIALIZE_EXTERNAL_XML_TAG_FOR_CYCL_TERM = SubLObjectFactory.makeSymbol("SERIALIZE-EXTERNAL-XML-TAG-FOR-CYCL-TERM");
        $str60$concept = SubLObjectFactory.makeString("concept");
        $str61$nl = SubLObjectFactory.makeString("nl");
        $str62$cycl = SubLObjectFactory.makeString("cycl");
        $str63$uri = SubLObjectFactory.makeString("uri");
        $str64$urn_cyc__cycapi_concept_ = SubLObjectFactory.makeString("urn:cyc:/cycapi/concept/");
        $kw65$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
    }
    
    public static final class $get_term_id$UnaryFunction extends UnaryFunction
    {
        public $get_term_id$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GET-TERM-ID"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return misc_kb_utilities.get_term_id(arg1);
        }
    }
}

/*

	Total time: 601 ms
	
*/