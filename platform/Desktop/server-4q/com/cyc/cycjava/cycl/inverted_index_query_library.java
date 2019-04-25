package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inverted_index_query_library extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inverted_index_query_library";
    public static final String myFingerPrint = "4b88b00461aee3a12e5af9a66ce5b6d665d116e9bd387c78558b00c615945054";
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    private static SubLSymbol $query_index_index_generationP$;
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLSymbol $ql_search_weight_factor$;
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    private static SubLSymbol $min_query_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9190L)
    private static SubLSymbol $query_template_index$;
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9269L)
    private static SubLSymbol $ql_ir_search_disabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9322L)
    private static SubLSymbol $ql_build_index_in_memory$;
    private static final SubLSymbol $sym0$QUERY_TEMPLATE_INVERTED_INDEX;
    private static final SubLSymbol $sym1$INVERTED_INDEX;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$OBJECT;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_CLASS;
    private static final SubLSymbol $sym6$ISOLATED_P;
    private static final SubLSymbol $sym7$INSTANCE_NUMBER;
    private static final SubLSymbol $sym8$PHYSICAL_INDEX;
    private static final SubLSymbol $sym9$INDEX_ENTRY_COMPUTER;
    private static final SubLSymbol $sym10$VALUE_TEST;
    private static final SubLSymbol $sym11$INDEXED_ITEMS;
    private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_INSTANC;
    private static final SubLSymbol $sym13$INITIALIZE;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER;
    private static final SubLSymbol $sym17$SET_INDEX;
    private static final SubLSymbol $sym18$IN_MEMORY_EQUALP_INDEX;
    private static final SubLSymbol $sym19$QUERY_TEMPLATE_INVERTED_INDEX_INITIALIZE_METHOD;
    private static final SubLSymbol $sym20$LOOKUP;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD;
    private static final SubLSymbol $sym25$QUERY_TEMPLATE_INVERTED_INDEX_STOP_WORD_;
    private static final SubLSymbol $sym26$_;
    private static final SubLSymbol $sym27$SECOND;
    private static final SubLSymbol $sym28$QUERY_TEMPLATE_INVERTED_INDEX_LOOKUP_METHOD;
    private static final SubLFloat $float29$0_5;
    private static final SubLSymbol $sym30$NORMALIZED_WEIGHT_TOO_LOW_;
    private static final SubLSymbol $sym31$REMOVE_KEY;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD;
    private static final SubLSymbol $sym35$COMPUTE_INDEX_ENTRIES;
    private static final SubLSymbol $sym36$REMOVE_VALUE;
    private static final SubLSymbol $sym37$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_KEY_METHOD;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD;
    private static final SubLSymbol $sym41$REMOVE;
    private static final SubLSymbol $sym42$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_VALUE_METHOD;
    private static final SubLSymbol $sym43$INDEX_ALL_QUERIES_IN_FOLDER;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLObject $const46$InferencePSC;
    private static final SubLSymbol $sym47$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym48$INDEX_AN_ITEM;
    private static final SubLSymbol $kw49$NEW;
    private static final SubLSymbol $sym50$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_ALL_QUERIES_IN_FOLDER_METHOD;
    private static final SubLSymbol $sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $kw54$TEMPLATE;
    private static final SubLSymbol $kw55$QUERY_GLOSS;
    private static final SubLSymbol $kw56$FORMULA;
    private static final SubLSymbol $sym57$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_QUERY_WITH_FORMULA_AND_GLOSS_;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$PARENT_INDEX;
    private static final SubLSymbol $sym60$GENERATION_DOMAIN_MT;
    private static final SubLSymbol $sym61$GENERATION_MT;
    private static final SubLSymbol $sym62$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C;
    private static final SubLSymbol $sym63$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH;
    private static final SubLSymbol $sym68$INVERTED_INDEX_P;
    private static final SubLSymbol $sym69$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD;
    private static final SubLSymbol $sym70$SET_GENERATION_MT;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH;
    private static final SubLSymbol $sym74$HLMT_P;
    private static final SubLSymbol $sym75$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_ME;
    private static final SubLSymbol $sym76$SET_GENERATION_DOMAIN_MT;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH;
    private static final SubLSymbol $sym79$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAI;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH;
    private static final SubLString $str83$;
    private static final SubLSymbol $sym84$FORT_P;
    private static final SubLSymbol $sym85$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIE;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$_QL_BUILD_INDEX_IN_MEMORY_;
    private static final SubLSymbol $kw88$PARAMETER;
    private static final SubLSymbol $sym89$BOOLEANP;
    private static final SubLSymbol $kw90$INDEXED;
    private static final SubLSymbol $kw91$INDEX_UNINITIALIZED;
    private static final SubLSymbol $sym92$FIRST;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$DISABLE_QL_IR_SEARCH;
    private static final SubLSymbol $sym95$ENABLE_QL_IR_SEARCH;
    private static final SubLObject $const96$TemplateFromTestQueryFn;
    private static final SubLObject $const97$querySpecificationForFormulaTempl;
    private static final SubLSymbol $kw98$ALLOWED_MODULES;
    private static final SubLSymbol $kw99$REMOVAL_LOOKUP_POS;
    private static final SubLSymbol $kw100$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw101$HL;
    private static final SubLSymbol $kw102$RETURN;
    private static final SubLSymbol $kw103$TRUE;
    private static final SubLList $list104;
    private static final SubLSymbol $kw105$X;
    private static final SubLObject $const106$assertedSentence;
    private static final SubLObject $const107$comment;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLObject $const110$EverythingPSC;
    private static final SubLObject $const111$formulaTemplateGloss;
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject subloop_reserved_initialize_query_template_inverted_index_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym3$OBJECT, (SubLObject)inverted_index_query_library.$sym4$INSTANCE_COUNT, (SubLObject)inverted_index_query_library.ZERO_INTEGER);
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject subloop_reserved_initialize_query_template_inverted_index_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym3$OBJECT, (SubLObject)inverted_index_query_library.$sym6$ISOLATED_P, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym3$OBJECT, (SubLObject)inverted_index_query_library.$sym7$INSTANCE_NUMBER, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym1$INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym8$PHYSICAL_INDEX, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym1$INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym9$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym1$INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym10$VALUE_TEST, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym1$INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym11$INDEXED_ITEMS, (SubLObject)inverted_index_query_library.NIL);
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_p(final SubLObject query_template_inverted_index) {
        return classes.subloop_instanceof_class(query_template_inverted_index, (SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_initialize_method(final SubLObject self) {
        instances.set_slot(self, (SubLObject)inverted_index_query_library.$sym10$VALUE_TEST, Symbols.symbol_function((SubLObject)inverted_index_query_library.EQUALP));
        instances.set_slot(self, (SubLObject)inverted_index_query_library.$sym11$INDEXED_ITEMS, inverted_index.new_indexed_items());
        instances.set_slot(self, (SubLObject)inverted_index_query_library.$sym9$INDEX_ENTRY_COMPUTER, object.new_class_instance((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER));
        methods.funcall_instance_method_with_1_args(instances.get_slot(self, (SubLObject)inverted_index_query_library.$sym9$INDEX_ENTRY_COMPUTER), (SubLObject)inverted_index_query_library.$sym17$SET_INDEX, self);
        instances.set_slot(self, (SubLObject)inverted_index_query_library.$sym8$PHYSICAL_INDEX, object.new_class_instance((SubLObject)inverted_index_query_library.$sym18$IN_MEMORY_EQUALP_INDEX));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_lookup_method(final SubLObject self, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_query_template_inverted_index_method = (SubLObject)inverted_index_query_library.NIL;
        final SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items(self);
        final SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_index_query_library.$sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD);
            try {
                final SubLObject lookup_items = (SubLObject)(key.isString() ? document.string_tokenize_via_wordify(key) : ConsesLow.list(key));
                final SubLObject lookup_item_count = Sequences.length(Sequences.remove_if((SubLObject)inverted_index_query_library.$sym25$QUERY_TEMPLATE_INVERTED_INDEX_STOP_WORD_, lookup_items, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED));
                final SubLObject dict = dictionary.new_dictionary((SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED);
                SubLObject scored = (SubLObject)inverted_index_query_library.NIL;
                SubLObject cdolist_list_var = lookup_items;
                SubLObject key_$1 = (SubLObject)inverted_index_query_library.NIL;
                key_$1 = cdolist_list_var.first();
                while (inverted_index_query_library.NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_1_args(physical_index, (SubLObject)inverted_index_query_library.$sym20$LOOKUP, key_$1);
                    SubLObject suid = (SubLObject)inverted_index_query_library.NIL;
                    suid = cdolist_list_var_$2.first();
                    while (inverted_index_query_library.NIL != cdolist_list_var_$2) {
                        final SubLObject existing_count = dictionary.dictionary_lookup(dict, suid, (SubLObject)inverted_index_query_library.ZERO_INTEGER);
                        dictionary.dictionary_enter(dict, suid, number_utilities.f_1X(existing_count));
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        suid = cdolist_list_var_$2.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    key_$1 = cdolist_list_var.first();
                }
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); inverted_index_query_library.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject suid2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject score = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    scored = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inverted_index.get_item_from_index_suid(indexed_items, suid2), score), scored);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                SubLObject normalized = (SubLObject)inverted_index_query_library.NIL;
                SubLObject highest_weight = (SubLObject)inverted_index_query_library.ZERO_INTEGER;
                SubLObject cdolist_list_var2 = scored;
                SubLObject item = (SubLObject)inverted_index_query_library.NIL;
                item = cdolist_list_var2.first();
                while (inverted_index_query_library.NIL != cdolist_list_var2) {
                    final SubLObject raw_weight = conses_high.second(item);
                    final SubLObject normalized_weight = Numbers.divide(raw_weight, lookup_item_count);
                    if (raw_weight.numG(highest_weight)) {
                        highest_weight = raw_weight;
                    }
                    normalized = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(item.first(), normalized_weight), normalized);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    item = cdolist_list_var2.first();
                }
                normalized = remove_low_weighted_items(normalized, highest_weight, lookup_item_count);
                normalized = Sort.sort(normalized, (SubLObject)inverted_index_query_library.$sym26$_, (SubLObject)inverted_index_query_library.$sym27$SECOND);
                Dynamic.sublisp_throw((SubLObject)inverted_index_query_library.$sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD, normalized);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index_query_library.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inverted_index.set_inverted_index_indexed_items(self, indexed_items);
                    inverted_index.set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_query_template_inverted_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index_query_library.$sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_query_template_inverted_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject remove_low_weighted_items(final SubLObject items, final SubLObject max_weight, final SubLObject max_weight_possible) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inverted_index_query_library.NIL;
        final SubLObject _prev_bind_0 = inverted_index_query_library.$min_query_weight$.currentBinding(thread);
        try {
            inverted_index_query_library.$min_query_weight$.bind(Numbers.divide(Numbers.multiply(max_weight, inverted_index_query_library.$ql_search_weight_factor$.getDynamicValue(thread)), max_weight_possible), thread);
            result = Sequences.remove_if((SubLObject)inverted_index_query_library.$sym30$NORMALIZED_WEIGHT_TOO_LOW_, items, (SubLObject)inverted_index_query_library.$sym27$SECOND, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED);
        }
        finally {
            inverted_index_query_library.$min_query_weight$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject normalized_weight_too_lowP(final SubLObject weight) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.numL(weight, inverted_index_query_library.$min_query_weight$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_remove_key_method(final SubLObject self, final SubLObject index_key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_query_template_inverted_index_method = (SubLObject)inverted_index_query_library.NIL;
        final SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer(self);
        try {
            thread.throwStack.push(inverted_index_query_library.$sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD);
            try {
                SubLObject cdolist_list_var;
                final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args(index_entry_computer, (SubLObject)inverted_index_query_library.$sym35$COMPUTE_INDEX_ENTRIES, index_key);
                SubLObject entry = (SubLObject)inverted_index_query_library.NIL;
                entry = cdolist_list_var.first();
                while (inverted_index_query_library.NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_1_args(self, (SubLObject)inverted_index_query_library.$sym36$REMOVE_VALUE, entry);
                    cdolist_list_var = cdolist_list_var.rest();
                    entry = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)inverted_index_query_library.$sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index_query_library.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inverted_index.set_inverted_index_index_entry_computer(self, index_entry_computer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_query_template_inverted_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index_query_library.$sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_query_template_inverted_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_remove_value_method(final SubLObject self, final SubLObject index_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_query_template_inverted_index_method = (SubLObject)inverted_index_query_library.NIL;
        final SubLObject physical_index = inverted_index.get_inverted_index_physical_index(self);
        try {
            thread.throwStack.push(inverted_index_query_library.$sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(physical_index, (SubLObject)inverted_index_query_library.$sym41$REMOVE, index_entry);
                Dynamic.sublisp_throw((SubLObject)inverted_index_query_library.$sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index_query_library.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    inverted_index.set_inverted_index_physical_index(self, physical_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_query_template_inverted_index_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index_query_library.$sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_query_template_inverted_index_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_index_all_queries_in_folder_method(final SubLObject self, final SubLObject root_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject templates = ke_interaction_folder.templates_in_folder(root_node, inverted_index_query_library.$const46$InferencePSC, (SubLObject)inverted_index_query_library.T);
        SubLObject error = (SubLObject)inverted_index_query_library.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)inverted_index_query_library.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$3 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$4 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$5 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$6 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    SubLObject cdolist_list_var = templates;
                                    SubLObject template = (SubLObject)inverted_index_query_library.NIL;
                                    template = cdolist_list_var.first();
                                    while (inverted_index_query_library.NIL != cdolist_list_var) {
                                        try {
                                            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind((SubLObject)inverted_index_query_library.$sym47$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    methods.funcall_instance_method_with_1_args(self, (SubLObject)inverted_index_query_library.$sym48$INDEX_AN_ITEM, template);
                                                }
                                                catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, (SubLObject)inverted_index_query_library.NIL);
                                                }
                                            }
                                            finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var) {
                                            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                        if (inverted_index_query_library.NIL != error) {
                                            report_ql_index_initialization_error(template, error);
                                            error = (SubLObject)inverted_index_query_library.NIL;
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        template = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index_query_library.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$5, thread);
                        }
                        if (new_or_reused == inverted_index_query_library.$kw49$NEW && inverted_index_query_library.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index_query_library.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (inverted_index_query_library.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_index_query_with_formula_and_gloss_method(final SubLObject self, final SubLObject template, final SubLObject formula, final SubLObject gloss) {
        final SubLObject query_formula_encapsulated = (SubLObject)ConsesLow.list((SubLObject)inverted_index_query_library.$kw54$TEMPLATE, template, (SubLObject)inverted_index_query_library.$kw55$QUERY_GLOSS, gloss, (SubLObject)inverted_index_query_library.$kw56$FORMULA, formula);
        methods.funcall_instance_method_with_1_args(self, (SubLObject)inverted_index_query_library.$sym48$INDEX_AN_ITEM, query_formula_encapsulated);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject get_query_template_inverted_index_entry_computer_parent_index(final SubLObject query_template_inverted_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(query_template_inverted_index_entry_computer, (SubLObject)inverted_index_query_library.THREE_INTEGER, (SubLObject)inverted_index_query_library.$sym59$PARENT_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject set_query_template_inverted_index_entry_computer_parent_index(final SubLObject query_template_inverted_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(query_template_inverted_index_entry_computer, value, (SubLObject)inverted_index_query_library.THREE_INTEGER, (SubLObject)inverted_index_query_library.$sym59$PARENT_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject get_query_template_inverted_index_entry_computer_generation_domain_mt(final SubLObject query_template_inverted_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(query_template_inverted_index_entry_computer, (SubLObject)inverted_index_query_library.TWO_INTEGER, (SubLObject)inverted_index_query_library.$sym60$GENERATION_DOMAIN_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject set_query_template_inverted_index_entry_computer_generation_domain_mt(final SubLObject query_template_inverted_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(query_template_inverted_index_entry_computer, value, (SubLObject)inverted_index_query_library.TWO_INTEGER, (SubLObject)inverted_index_query_library.$sym60$GENERATION_DOMAIN_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject get_query_template_inverted_index_entry_computer_generation_mt(final SubLObject query_template_inverted_index_entry_computer) {
        return classes.subloop_get_access_protected_instance_slot(query_template_inverted_index_entry_computer, (SubLObject)inverted_index_query_library.ONE_INTEGER, (SubLObject)inverted_index_query_library.$sym61$GENERATION_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject set_query_template_inverted_index_entry_computer_generation_mt(final SubLObject query_template_inverted_index_entry_computer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(query_template_inverted_index_entry_computer, value, (SubLObject)inverted_index_query_library.ONE_INTEGER, (SubLObject)inverted_index_query_library.$sym61$GENERATION_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject subloop_reserved_initialize_query_template_inverted_index_entry_computer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym3$OBJECT, (SubLObject)inverted_index_query_library.$sym4$INSTANCE_COUNT, (SubLObject)inverted_index_query_library.ZERO_INTEGER);
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject subloop_reserved_initialize_query_template_inverted_index_entry_computer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym3$OBJECT, (SubLObject)inverted_index_query_library.$sym6$ISOLATED_P, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym3$OBJECT, (SubLObject)inverted_index_query_library.$sym7$INSTANCE_NUMBER, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym61$GENERATION_MT, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym60$GENERATION_DOMAIN_MT, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym59$PARENT_INDEX, (SubLObject)inverted_index_query_library.NIL);
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_entry_computer_p(final SubLObject query_template_inverted_index_entry_computer) {
        return classes.subloop_instanceof_class(query_template_inverted_index_entry_computer, (SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_entry_computer_set_index_method(final SubLObject self, final SubLObject v_inverted_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_query_template_inverted_index_entry_computer_method = (SubLObject)inverted_index_query_library.NIL;
        SubLObject parent_index = get_query_template_inverted_index_entry_computer_parent_index(self);
        try {
            thread.throwStack.push(inverted_index_query_library.$sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH);
            try {
                assert inverted_index_query_library.NIL != inverted_index.inverted_index_p(v_inverted_index) : v_inverted_index;
                parent_index = v_inverted_index;
                Dynamic.sublisp_throw((SubLObject)inverted_index_query_library.$sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index_query_library.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_query_template_inverted_index_entry_computer_parent_index(self, parent_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_query_template_inverted_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index_query_library.$sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_query_template_inverted_index_entry_computer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_entry_computer_set_generation_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_query_template_inverted_index_entry_computer_method = (SubLObject)inverted_index_query_library.NIL;
        SubLObject generation_mt = get_query_template_inverted_index_entry_computer_generation_mt(self);
        try {
            thread.throwStack.push(inverted_index_query_library.$sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH);
            try {
                assert inverted_index_query_library.NIL != hlmt.hlmt_p(mt) : mt;
                generation_mt = mt;
                Dynamic.sublisp_throw((SubLObject)inverted_index_query_library.$sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index_query_library.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_query_template_inverted_index_entry_computer_generation_mt(self, generation_mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_query_template_inverted_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index_query_library.$sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_query_template_inverted_index_entry_computer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_entry_computer_set_generation_domain_mt_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_query_template_inverted_index_entry_computer_method = (SubLObject)inverted_index_query_library.NIL;
        SubLObject generation_domain_mt = get_query_template_inverted_index_entry_computer_generation_domain_mt(self);
        try {
            thread.throwStack.push(inverted_index_query_library.$sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH);
            try {
                assert inverted_index_query_library.NIL != hlmt.hlmt_p(mt) : mt;
                generation_domain_mt = mt;
                Dynamic.sublisp_throw((SubLObject)inverted_index_query_library.$sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index_query_library.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_query_template_inverted_index_entry_computer_generation_domain_mt(self, generation_domain_mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_query_template_inverted_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index_query_library.$sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_query_template_inverted_index_entry_computer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject query_template_inverted_index_entry_computer_compute_index_entries_method(final SubLObject self, SubLObject query_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_query_template_inverted_index_entry_computer_method = (SubLObject)inverted_index_query_library.NIL;
        final SubLObject parent_index = get_query_template_inverted_index_entry_computer_parent_index(self);
        try {
            thread.throwStack.push(inverted_index_query_library.$sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH);
            try {
                final SubLObject indexed_items = instances.get_slot(parent_index, (SubLObject)inverted_index_query_library.$sym11$INDEXED_ITEMS);
                SubLObject query_template_query = (SubLObject)inverted_index_query_library.NIL;
                SubLObject comment = (SubLObject)inverted_index_query_library.NIL;
                SubLObject result = (SubLObject)inverted_index_query_library.NIL;
                if (inverted_index_query_library.NIL != query_template_encapsulated_p(query_template)) {
                    query_template_query = conses_high.getf(query_template, (SubLObject)inverted_index_query_library.$kw56$FORMULA, (SubLObject)inverted_index_query_library.UNPROVIDED);
                    comment = conses_high.getf(query_template, (SubLObject)inverted_index_query_library.$kw55$QUERY_GLOSS, (SubLObject)inverted_index_query_library.$str83$);
                    query_template = conses_high.getf(query_template, (SubLObject)inverted_index_query_library.$kw54$TEMPLATE, (SubLObject)inverted_index_query_library.UNPROVIDED);
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject query_template_query_$10 = query_and_gloss_for_formula_template(query_template, (SubLObject)inverted_index_query_library.UNPROVIDED);
                    final SubLObject comment_$11 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    query_template_query = query_template_query_$10;
                    comment = comment_$11;
                }
                final SubLObject my_index = inverted_index.maybe_add_new_indexed_item(indexed_items, query_template);
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(query_template_query, (SubLObject)inverted_index_query_library.$sym84$FORT_P, (SubLObject)inverted_index_query_library.T, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED);
                SubLObject fort = (SubLObject)inverted_index_query_library.NIL;
                fort = cdolist_list_var.first();
                while (inverted_index_query_library.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(inverted_index.new_inverted_index_entry(fort, my_index), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    fort = cdolist_list_var.first();
                }
                if (inverted_index_query_library.NIL != inverted_index_query_library.$query_index_index_generationP$.getDynamicValue(thread)) {
                    cdolist_list_var = compute_inverted_index_entries_for_string(pph_question.generate_question(query_template_query, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED), my_index);
                    SubLObject entry = (SubLObject)inverted_index_query_library.NIL;
                    entry = cdolist_list_var.first();
                    while (inverted_index_query_library.NIL != cdolist_list_var) {
                        result = (SubLObject)ConsesLow.cons(entry, result);
                        cdolist_list_var = cdolist_list_var.rest();
                        entry = cdolist_list_var.first();
                    }
                }
                if (inverted_index_query_library.NIL != comment) {
                    cdolist_list_var = compute_inverted_index_entries_for_string(comment, my_index);
                    SubLObject entry = (SubLObject)inverted_index_query_library.NIL;
                    entry = cdolist_list_var.first();
                    while (inverted_index_query_library.NIL != cdolist_list_var) {
                        result = (SubLObject)ConsesLow.cons(entry, result);
                        cdolist_list_var = cdolist_list_var.rest();
                        entry = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)inverted_index_query_library.$sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)inverted_index_query_library.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_query_template_inverted_index_entry_computer_parent_index(self, parent_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_query_template_inverted_index_entry_computer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)inverted_index_query_library.$sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_query_template_inverted_index_entry_computer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
    public static SubLObject report_ql_index_initialization_error(final SubLObject template, final SubLObject error) {
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 8609L)
    public static SubLObject compute_inverted_index_entries_for_string(final SubLObject string, final SubLObject my_index) {
        SubLObject result = (SubLObject)inverted_index_query_library.NIL;
        SubLObject cdolist_list_var = document.string_tokenize_via_wordify(string);
        SubLObject word = (SubLObject)inverted_index_query_library.NIL;
        word = cdolist_list_var.first();
        while (inverted_index_query_library.NIL != cdolist_list_var) {
            if (inverted_index_query_library.NIL == query_template_inverted_index_stop_wordP(word)) {
                result = (SubLObject)ConsesLow.cons(inverted_index.new_inverted_index_entry(word, my_index), result);
                final SubLObject stem = morphology.find_stem_memoized(word, (SubLObject)inverted_index_query_library.UNPROVIDED);
                if (!stem.equal(word)) {
                    result = (SubLObject)ConsesLow.cons(inverted_index.new_inverted_index_entry(stem, my_index), result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9041L)
    public static SubLObject query_template_inverted_index_stop_wordP(final SubLObject string) {
        return (SubLObject)(string.isString() ? lexicon_utilities.denots_of_string_stop_word(string) : inverted_index_query_library.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9890L)
    public static SubLObject set_ql_build_index_in_memory(final SubLObject t_or_nil) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert inverted_index_query_library.NIL != Types.booleanp(t_or_nil) : t_or_nil;
        if (inverted_index_query_library.NIL != t_or_nil) {
            inverted_index_query_library.$ql_build_index_in_memory$.setDynamicValue((SubLObject)inverted_index_query_library.ONE_INTEGER, thread);
        }
        else {
            inverted_index_query_library.$ql_build_index_in_memory$.setDynamicValue((SubLObject)inverted_index_query_library.ZERO_INTEGER, thread);
        }
        return Equality.eql(inverted_index_query_library.$ql_build_index_in_memory$.getDynamicValue(thread), (SubLObject)inverted_index_query_library.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10130L)
    public static SubLObject get_ql_build_index_in_memory() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eql(inverted_index_query_library.$ql_build_index_in_memory$.getDynamicValue(thread), (SubLObject)inverted_index_query_library.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10222L)
    public static SubLObject clear_inverted_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inverted_index_query_library.NIL != inverted_index_query_library.$query_template_index$.getDynamicValue(thread)) {
            methods.funcall_instance_method_with_0_args(inverted_index_query_library.$query_template_index$.getDynamicValue(thread), (SubLObject)inverted_index_query_library.$sym13$INITIALIZE);
        }
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10371L)
    public static SubLObject index_queries_from_node_in_memory(final SubLObject root_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inverted_index_query_library.NIL == inverted_index_query_library.$query_template_index$.getDynamicValue(thread)) {
            inverted_index_query_library.$query_template_index$.setDynamicValue(object.new_class_instance((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX), thread);
        }
        methods.funcall_instance_method_with_1_args(inverted_index_query_library.$query_template_index$.getDynamicValue(thread), (SubLObject)inverted_index_query_library.$sym43$INDEX_ALL_QUERIES_IN_FOLDER, root_node);
        return (SubLObject)inverted_index_query_library.$kw90$INDEXED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10663L)
    public static SubLObject add_template_with_formula_and_gloss_in_memory(final SubLObject template, final SubLObject formula, final SubLObject gloss) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inverted_index_query_library.NIL != query_template_inverted_index_p(inverted_index_query_library.$query_template_index$.getDynamicValue(thread))) {
            methods.funcall_instance_method_with_3_args(inverted_index_query_library.$query_template_index$.getDynamicValue(thread), (SubLObject)inverted_index_query_library.$sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS, template, formula, gloss);
            return (SubLObject)inverted_index_query_library.$kw90$INDEXED;
        }
        return (SubLObject)inverted_index_query_library.$kw91$INDEX_UNINITIALIZED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10978L)
    public static SubLObject indexed_queries_from_string_in_memory(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inverted_index_query_library.NIL == ql_ir_search_allowedP()) {
            return (SubLObject)inverted_index_query_library.NIL;
        }
        return Mapping.mapcar((SubLObject)inverted_index_query_library.$sym92$FIRST, methods.funcall_instance_method_with_1_args(inverted_index_query_library.$query_template_index$.getDynamicValue(thread), (SubLObject)inverted_index_query_library.$sym20$LOOKUP, string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 11180L)
    public static SubLObject indexed_queries_from_string_with_confidences_in_memory(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inverted_index_query_library.NIL == ql_ir_search_allowedP()) {
            return (SubLObject)inverted_index_query_library.NIL;
        }
        SubLObject result = (SubLObject)inverted_index_query_library.NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(inverted_index_query_library.$query_template_index$.getDynamicValue(thread), (SubLObject)inverted_index_query_library.$sym20$LOOKUP, string);
        SubLObject pair = (SubLObject)inverted_index_query_library.NIL;
        pair = cdolist_list_var.first();
        while (inverted_index_query_library.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject cycl = (SubLObject)inverted_index_query_library.NIL;
            SubLObject weight = (SubLObject)inverted_index_query_library.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inverted_index_query_library.$list93);
            cycl = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inverted_index_query_library.$list93);
            weight = current.first();
            current = current.rest();
            if (inverted_index_query_library.NIL == current) {
                result = (SubLObject)ConsesLow.cons(query_library_utils.new_ql_parse(cycl, weight, (SubLObject)inverted_index_query_library.UNPROVIDED), result);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inverted_index_query_library.$list93);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 11605L)
    public static SubLObject disable_ql_ir_search() {
        inverted_index_query_library.$ql_ir_search_disabledP$.setDynamicValue((SubLObject)inverted_index_query_library.T);
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 11845L)
    public static SubLObject enable_ql_ir_search() {
        inverted_index_query_library.$ql_ir_search_disabledP$.setDynamicValue((SubLObject)inverted_index_query_library.NIL);
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 12080L)
    public static SubLObject ql_ir_search_allowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inverted_index_query_library.NIL != ql_ir_search_disabledP()) {
            return (SubLObject)inverted_index_query_library.NIL;
        }
        if ((inverted_index_query_library.NIL != get_ql_build_index_in_memory() && inverted_index_query_library.NIL != inverted_index.inverted_index_p(inverted_index_query_library.$query_template_index$.getDynamicValue(thread))) || inverted_index_query_library.NIL == get_ql_build_index_in_memory()) {
            return (SubLObject)inverted_index_query_library.T;
        }
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 12342L)
    public static SubLObject ql_ir_search_disabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inverted_index_query_library.$ql_ir_search_disabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 12418L)
    public static SubLObject test_query_for_template(final SubLObject template, final SubLObject mt) {
        if (inverted_index_query_library.NIL != nart_handles.nart_p(template) && cycl_utilities.nat_functor(template).eql(inverted_index_query_library.$const96$TemplateFromTestQueryFn)) {
            return cycl_utilities.nat_arg1(template, (SubLObject)inverted_index_query_library.UNPROVIDED);
        }
        final SubLObject var = variables.get_variable((SubLObject)inverted_index_query_library.ZERO_INTEGER);
        return backward.removal_ask_variable(var, (SubLObject)ConsesLow.list(inverted_index_query_library.$const97$querySpecificationForFormulaTempl, template, var), mt, (SubLObject)inverted_index_query_library.UNPROVIDED, (SubLObject)inverted_index_query_library.UNPROVIDED).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 12763L)
    public static SubLObject cycl_for_test_query_new(final SubLObject test_query, final SubLObject mt) {
        final SubLObject var = variables.get_variable((SubLObject)inverted_index_query_library.ZERO_INTEGER);
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)inverted_index_query_library.$kw98$ALLOWED_MODULES, (SubLObject)inverted_index_query_library.$kw99$REMOVAL_LOOKUP_POS, (SubLObject)inverted_index_query_library.$kw100$ANSWER_LANGUAGE, (SubLObject)inverted_index_query_library.$kw101$HL, (SubLObject)inverted_index_query_library.$kw102$RETURN, (SubLObject)ConsesLow.list((SubLObject)inverted_index_query_library.$kw54$TEMPLATE, var));
        final SubLObject dnf = (SubLObject)ConsesLow.list((SubLObject)inverted_index_query_library.NIL, (SubLObject)ConsesLow.list(kb_query.kbq_askable_query_spec_sentence(var, test_query, (SubLObject)inverted_index_query_library.T)));
        return inference_kernel.new_cyc_query_from_dnf(dnf, mt, (SubLObject)inverted_index_query_library.NIL, v_properties).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 13114L)
    public static SubLObject cycl_for_test_query(final SubLObject test_query, final SubLObject mt) {
        final SubLObject var = variables.get_variable((SubLObject)inverted_index_query_library.ZERO_INTEGER);
        return backward.removal_ask_variable(var, kb_query.kbq_askable_query_spec_sentence(var, test_query, (SubLObject)inverted_index_query_library.T), mt, (SubLObject)inverted_index_query_library.$kw103$TRUE, (SubLObject)inverted_index_query_library.$list104).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 13567L)
    public static SubLObject comment_for_test_query(final SubLObject test_query, final SubLObject mt) {
        return ask_utilities.query_variable((SubLObject)inverted_index_query_library.$kw105$X, (SubLObject)ConsesLow.list(inverted_index_query_library.$const106$assertedSentence, (SubLObject)ConsesLow.listS(inverted_index_query_library.$const107$comment, test_query, (SubLObject)inverted_index_query_library.$list108)), mt, (SubLObject)inverted_index_query_library.$list109).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 13889L)
    public static SubLObject query_and_gloss_for_formula_template(final SubLObject formula_template, SubLObject mt) {
        if (mt == inverted_index_query_library.UNPROVIDED) {
            mt = inverted_index_query_library.$const110$EverythingPSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nartified_template = czer_main.canonicalize_term(formula_template, (SubLObject)inverted_index_query_library.UNPROVIDED);
        final SubLObject test_query = test_query_for_template(nartified_template, mt);
        SubLObject comment = (SubLObject)inverted_index_query_library.NIL;
        SubLObject query = (SubLObject)inverted_index_query_library.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            comment = kb_mapping_utilities.fpred_value(nartified_template, inverted_index_query_library.$const111$formulaTemplateGloss, (SubLObject)inverted_index_query_library.ONE_INTEGER, (SubLObject)inverted_index_query_library.TWO_INTEGER, (SubLObject)inverted_index_query_library.$kw103$TRUE);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (inverted_index_query_library.NIL != test_query) {
            query = cycl_for_test_query(test_query, mt);
        }
        return Values.values(query, comment);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 14678L)
    public static SubLObject query_template_encapsulated_p(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inverted_index_query_library.NIL != list_utilities.property_list_p(obj) && inverted_index_query_library.NIL != conses_high.getf(obj, (SubLObject)inverted_index_query_library.$kw56$FORMULA, (SubLObject)inverted_index_query_library.UNPROVIDED) && inverted_index_query_library.NIL != conses_high.getf(obj, (SubLObject)inverted_index_query_library.$kw54$TEMPLATE, (SubLObject)inverted_index_query_library.UNPROVIDED));
    }
    
    public static SubLObject declare_inverted_index_query_library_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "subloop_reserved_initialize_query_template_inverted_index_class", "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "subloop_reserved_initialize_query_template_inverted_index_instance", "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_p", "QUERY-TEMPLATE-INVERTED-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_initialize_method", "QUERY-TEMPLATE-INVERTED-INDEX-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_lookup_method", "QUERY-TEMPLATE-INVERTED-INDEX-LOOKUP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "remove_low_weighted_items", "REMOVE-LOW-WEIGHTED-ITEMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "normalized_weight_too_lowP", "NORMALIZED-WEIGHT-TOO-LOW?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_remove_key_method", "QUERY-TEMPLATE-INVERTED-INDEX-REMOVE-KEY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_remove_value_method", "QUERY-TEMPLATE-INVERTED-INDEX-REMOVE-VALUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_index_all_queries_in_folder_method", "QUERY-TEMPLATE-INVERTED-INDEX-INDEX-ALL-QUERIES-IN-FOLDER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_index_query_with_formula_and_gloss_method", "QUERY-TEMPLATE-INVERTED-INDEX-INDEX-QUERY-WITH-FORMULA-AND-GLOSS-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "get_query_template_inverted_index_entry_computer_parent_index", "GET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "set_query_template_inverted_index_entry_computer_parent_index", "SET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "get_query_template_inverted_index_entry_computer_generation_domain_mt", "GET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "set_query_template_inverted_index_entry_computer_generation_domain_mt", "SET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "get_query_template_inverted_index_entry_computer_generation_mt", "GET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-GENERATION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "set_query_template_inverted_index_entry_computer_generation_mt", "SET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-GENERATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "subloop_reserved_initialize_query_template_inverted_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "subloop_reserved_initialize_query_template_inverted_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_entry_computer_p", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_entry_computer_set_index_method", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_entry_computer_set_generation_mt_method", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_entry_computer_set_generation_domain_mt_method", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_entry_computer_compute_index_entries_method", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "report_ql_index_initialization_error", "REPORT-QL-INDEX-INITIALIZATION-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "compute_inverted_index_entries_for_string", "COMPUTE-INVERTED-INDEX-ENTRIES-FOR-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_inverted_index_stop_wordP", "QUERY-TEMPLATE-INVERTED-INDEX-STOP-WORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "set_ql_build_index_in_memory", "SET-QL-BUILD-INDEX-IN-MEMORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "get_ql_build_index_in_memory", "GET-QL-BUILD-INDEX-IN-MEMORY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "clear_inverted_index", "CLEAR-INVERTED-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "index_queries_from_node_in_memory", "INDEX-QUERIES-FROM-NODE-IN-MEMORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "add_template_with_formula_and_gloss_in_memory", "ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS-IN-MEMORY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "indexed_queries_from_string_in_memory", "INDEXED-QUERIES-FROM-STRING-IN-MEMORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "indexed_queries_from_string_with_confidences_in_memory", "INDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES-IN-MEMORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "disable_ql_ir_search", "DISABLE-QL-IR-SEARCH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "enable_ql_ir_search", "ENABLE-QL-IR-SEARCH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "ql_ir_search_allowedP", "QL-IR-SEARCH-ALLOWED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "ql_ir_search_disabledP", "QL-IR-SEARCH-DISABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "test_query_for_template", "TEST-QUERY-FOR-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "cycl_for_test_query_new", "CYCL-FOR-TEST-QUERY-NEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "cycl_for_test_query", "CYCL-FOR-TEST-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "comment_for_test_query", "COMMENT-FOR-TEST-QUERY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_and_gloss_for_formula_template", "QUERY-AND-GLOSS-FOR-FORMULA-TEMPLATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inverted_index_query_library", "query_template_encapsulated_p", "QUERY-TEMPLATE-ENCAPSULATED-P", 1, 0, false);
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    public static SubLObject init_inverted_index_query_library_file() {
        inverted_index_query_library.$query_index_index_generationP$ = SubLFiles.defparameter("*QUERY-INDEX-INDEX-GENERATION?*", (SubLObject)inverted_index_query_library.NIL);
        inverted_index_query_library.$ql_search_weight_factor$ = SubLFiles.defparameter("*QL-SEARCH-WEIGHT-FACTOR*", (SubLObject)inverted_index_query_library.$float29$0_5);
        inverted_index_query_library.$min_query_weight$ = SubLFiles.defparameter("*MIN-QUERY-WEIGHT*", (SubLObject)inverted_index_query_library.ZERO_INTEGER);
        inverted_index_query_library.$query_template_index$ = SubLFiles.defparameter("*QUERY-TEMPLATE-INDEX*", (SubLObject)inverted_index_query_library.NIL);
        inverted_index_query_library.$ql_ir_search_disabledP$ = SubLFiles.defparameter("*QL-IR-SEARCH-DISABLED?*", (SubLObject)inverted_index_query_library.NIL);
        inverted_index_query_library.$ql_build_index_in_memory$ = SubLFiles.defparameter("*QL-BUILD-INDEX-IN-MEMORY*", red_infrastructure_macros.red_def_helper((SubLObject)(inverted_index_query_library.$list86.isSymbol() ? Symbols.symbol_value((SubLObject)inverted_index_query_library.$list86) : inverted_index_query_library.$list86), (SubLObject)inverted_index_query_library.$sym87$_QL_BUILD_INDEX_IN_MEMORY_, (SubLObject)(inverted_index_query_library.ZERO_INTEGER.isSymbol() ? Symbols.symbol_value((SubLObject)inverted_index_query_library.ZERO_INTEGER) : inverted_index_query_library.ZERO_INTEGER), (SubLObject)inverted_index_query_library.$kw88$PARAMETER, (SubLObject)inverted_index_query_library.UNPROVIDED));
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    public static SubLObject setup_inverted_index_query_library_file() {
        classes.subloop_new_class((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym1$INVERTED_INDEX, (SubLObject)inverted_index_query_library.NIL, (SubLObject)inverted_index_query_library.NIL, (SubLObject)inverted_index_query_library.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym5$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym12$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_INSTANC);
        subloop_reserved_initialize_query_template_inverted_index_class((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym13$INITIALIZE, (SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$list14, (SubLObject)inverted_index_query_library.NIL, (SubLObject)inverted_index_query_library.$list15);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym13$INITIALIZE, (SubLObject)inverted_index_query_library.$sym19$QUERY_TEMPLATE_INVERTED_INDEX_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym20$LOOKUP, (SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$list21, (SubLObject)inverted_index_query_library.$list22, (SubLObject)inverted_index_query_library.$list23);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym20$LOOKUP, (SubLObject)inverted_index_query_library.$sym28$QUERY_TEMPLATE_INVERTED_INDEX_LOOKUP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym31$REMOVE_KEY, (SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$list21, (SubLObject)inverted_index_query_library.$list32, (SubLObject)inverted_index_query_library.$list33);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym31$REMOVE_KEY, (SubLObject)inverted_index_query_library.$sym37$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym36$REMOVE_VALUE, (SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$list21, (SubLObject)inverted_index_query_library.$list38, (SubLObject)inverted_index_query_library.$list39);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym36$REMOVE_VALUE, (SubLObject)inverted_index_query_library.$sym42$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_VALUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym43$INDEX_ALL_QUERIES_IN_FOLDER, (SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$list21, (SubLObject)inverted_index_query_library.$list44, (SubLObject)inverted_index_query_library.$list45);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym43$INDEX_ALL_QUERIES_IN_FOLDER, (SubLObject)inverted_index_query_library.$sym50$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_ALL_QUERIES_IN_FOLDER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS, (SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$list21, (SubLObject)inverted_index_query_library.$list52, (SubLObject)inverted_index_query_library.$list53);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym0$QUERY_TEMPLATE_INVERTED_INDEX, (SubLObject)inverted_index_query_library.$sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS, (SubLObject)inverted_index_query_library.$sym57$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_QUERY_WITH_FORMULA_AND_GLOSS_);
        classes.subloop_new_class((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym9$INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.NIL, (SubLObject)inverted_index_query_library.NIL, (SubLObject)inverted_index_query_library.$list58);
        classes.class_set_implements_slot_listeners((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym62$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C);
        classes.subloop_note_instance_initialization_function((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym63$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C);
        subloop_reserved_initialize_query_template_inverted_index_entry_computer_class((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym17$SET_INDEX, (SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$list64, (SubLObject)inverted_index_query_library.$list65, (SubLObject)inverted_index_query_library.$list66);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym17$SET_INDEX, (SubLObject)inverted_index_query_library.$sym69$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym70$SET_GENERATION_MT, (SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$list64, (SubLObject)inverted_index_query_library.$list71, (SubLObject)inverted_index_query_library.$list72);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym70$SET_GENERATION_MT, (SubLObject)inverted_index_query_library.$sym75$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_ME);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym76$SET_GENERATION_DOMAIN_MT, (SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$list64, (SubLObject)inverted_index_query_library.$list71, (SubLObject)inverted_index_query_library.$list77);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym76$SET_GENERATION_DOMAIN_MT, (SubLObject)inverted_index_query_library.$sym79$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAI);
        methods.methods_incorporate_instance_method((SubLObject)inverted_index_query_library.$sym35$COMPUTE_INDEX_ENTRIES, (SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$list64, (SubLObject)inverted_index_query_library.$list80, (SubLObject)inverted_index_query_library.$list81);
        methods.subloop_register_instance_method((SubLObject)inverted_index_query_library.$sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, (SubLObject)inverted_index_query_library.$sym35$COMPUTE_INDEX_ENTRIES, (SubLObject)inverted_index_query_library.$sym85$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIE);
        access_macros.register_external_symbol((SubLObject)inverted_index_query_library.$sym94$DISABLE_QL_IR_SEARCH);
        access_macros.register_external_symbol((SubLObject)inverted_index_query_library.$sym95$ENABLE_QL_IR_SEARCH);
        return (SubLObject)inverted_index_query_library.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inverted_index_query_library_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inverted_index_query_library_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inverted_index_query_library_file();
    }
    
    static {
        me = (SubLFile)new inverted_index_query_library();
        inverted_index_query_library.$query_index_index_generationP$ = null;
        inverted_index_query_library.$ql_search_weight_factor$ = null;
        inverted_index_query_library.$min_query_weight$ = null;
        inverted_index_query_library.$query_template_index$ = null;
        inverted_index_query_library.$ql_ir_search_disabledP$ = null;
        inverted_index_query_library.$ql_build_index_in_memory$ = null;
        $sym0$QUERY_TEMPLATE_INVERTED_INDEX = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX");
        $sym1$INVERTED_INDEX = SubLObjectFactory.makeSymbol("INVERTED-INDEX");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)inverted_index_query_library.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-CLASS");
        $sym6$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym7$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym8$PHYSICAL_INDEX = SubLObjectFactory.makeSymbol("PHYSICAL-INDEX");
        $sym9$INDEX_ENTRY_COMPUTER = SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER");
        $sym10$VALUE_TEST = SubLObjectFactory.makeSymbol("VALUE-TEST");
        $sym11$INDEXED_ITEMS = SubLObjectFactory.makeSymbol("INDEXED-ITEMS");
        $sym12$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_INSTANC = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-INSTANCE");
        $sym13$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)inverted_index_query_library.T);
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)inverted_index_query_library.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INDEXED-ITEMS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IN-MEMORY-EQUALP-INDEX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER");
        $sym17$SET_INDEX = SubLObjectFactory.makeSymbol("SET-INDEX");
        $sym18$IN_MEMORY_EQUALP_INDEX = SubLObjectFactory.makeSymbol("IN-MEMORY-EQUALP-INDEX");
        $sym19$QUERY_TEMPLATE_INVERTED_INDEX_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-INITIALIZE-METHOD");
        $sym20$LOOKUP = SubLObjectFactory.makeSymbol("LOOKUP");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param KEY stringp;\n       @return list; a list of (query weight) lists that are indexed on at least one word in KEY.  In the case of multiple matches,\n                     return queries with more words matching the key first.  Also accepts CycL as the key, in which case it\n                     must be one (not more than one) of the terms in the template's cycl."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-ITEMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-TOKENIZE-VIA-WORDIFY"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("KEY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-ITEM-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-IF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-STOP-WORD?")), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-ITEMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"))), (SubLObject)SubLObjectFactory.makeSymbol("SCORED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-ITEMS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP")), (SubLObject)SubLObjectFactory.makeSymbol("KEY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXISTING-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("DICT"), (SubLObject)SubLObjectFactory.makeSymbol("SUID"), (SubLObject)inverted_index_query_library.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-ENTER"), (SubLObject)SubLObjectFactory.makeSymbol("DICT"), (SubLObject)SubLObjectFactory.makeSymbol("SUID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("EXISTING-COUNT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUID"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)SubLObjectFactory.makeSymbol("DICT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ITEM-FROM-INDEX-SUID"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("SUID")), (SubLObject)SubLObjectFactory.makeSymbol("SCORE")), (SubLObject)SubLObjectFactory.makeSymbol("SCORED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HIGHEST-WEIGHT"), (SubLObject)inverted_index_query_library.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("SCORED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RAW-WEIGHT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED-WEIGHT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-WEIGHT"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-ITEM-COUNT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-WEIGHT"), (SubLObject)SubLObjectFactory.makeSymbol("HIGHEST-WEIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HIGHEST-WEIGHT"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-WEIGHT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM")), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED-WEIGHT")), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-LOW-WEIGHTED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED"), (SubLObject)SubLObjectFactory.makeSymbol("HIGHEST-WEIGHT"), (SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-ITEM-COUNT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol(">")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NORMALIZED")))));
        $sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-METHOD");
        $sym25$QUERY_TEMPLATE_INVERTED_INDEX_STOP_WORD_ = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-STOP-WORD?");
        $sym26$_ = SubLObjectFactory.makeSymbol(">");
        $sym27$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym28$QUERY_TEMPLATE_INVERTED_INDEX_LOOKUP_METHOD = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-LOOKUP-METHOD");
        $float29$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $sym30$NORMALIZED_WEIGHT_TOO_LOW_ = SubLObjectFactory.makeSymbol("NORMALIZED-WEIGHT-TOO-LOW?");
        $sym31$REMOVE_KEY = SubLObjectFactory.makeSymbol("REMOVE-KEY");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-KEY"));
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY-COMPUTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-KEY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-VALUE")), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-METHOD");
        $sym35$COMPUTE_INDEX_ENTRIES = SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES");
        $sym36$REMOVE_VALUE = SubLObjectFactory.makeSymbol("REMOVE-VALUE");
        $sym37$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_KEY_METHOD = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-REMOVE-KEY-METHOD");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY"));
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-METHOD");
        $sym41$REMOVE = SubLObjectFactory.makeSymbol("REMOVE");
        $sym42$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_VALUE_METHOD = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-REMOVE-VALUE-METHOD");
        $sym43$INDEX_ALL_QUERIES_IN_FOLDER = SubLObjectFactory.makeSymbol("INDEX-ALL-QUERIES-IN-FOLDER");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOT-NODE"));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("index all queries in ROOT-NODE folder and its subfolders"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATES-IN-FOLDER"), (SubLObject)SubLObjectFactory.makeSymbol("ROOT-NODE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC")), (SubLObject)inverted_index_query_library.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-PPH-MEMOIZATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-AN-ITEM")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPORT-QL-INDEX-INITIALIZATION-ERROR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)inverted_index_query_library.NIL))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $const46$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym47$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym48$INDEX_AN_ITEM = SubLObjectFactory.makeSymbol("INDEX-AN-ITEM");
        $kw49$NEW = SubLObjectFactory.makeKeyword("NEW");
        $sym50$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_ALL_QUERIES_IN_FOLDER_METHOD = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-INDEX-ALL-QUERIES-IN-FOLDER-METHOD");
        $sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS = SubLObjectFactory.makeSymbol("INDEX-QUERY-WITH-FORMULA-AND-GLOSS");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("index a particular QUERY-TEMPLATE using FORMULA and GLOSS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-FORMULA-ENCAPSULATED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("QUERY-GLOSS"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-AN-ITEM")), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-FORMULA-ENCAPSULATED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $kw54$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $kw55$QUERY_GLOSS = SubLObjectFactory.makeKeyword("QUERY-GLOSS");
        $kw56$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $sym57$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_QUERY_WITH_FORMULA_AND_GLOSS_ = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-INDEX-QUERY-WITH-FORMULA-AND-GLOSS-METHOD");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATION-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATION-DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INDEX-ENTRIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM-TO-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym59$PARENT_INDEX = SubLObjectFactory.makeSymbol("PARENT-INDEX");
        $sym60$GENERATION_DOMAIN_MT = SubLObjectFactory.makeSymbol("GENERATION-DOMAIN-MT");
        $sym61$GENERATION_MT = SubLObjectFactory.makeSymbol("GENERATION-MT");
        $sym62$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-CLASS");
        $sym63$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-INSTANCE");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVERTED-INDEX"));
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-INDEX-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INVERTED-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-METHOD");
        $sym68$INVERTED_INDEX_P = SubLObjectFactory.makeSymbol("INVERTED-INDEX-P");
        $sym69$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD");
        $sym70$SET_GENERATION_MT = SubLObjectFactory.makeSymbol("SET-GENERATION-MT");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATION-MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-METHOD");
        $sym74$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym75$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_ME = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD");
        $sym76$SET_GENERATION_DOMAIN_MT = SubLObjectFactory.makeSymbol("SET-GENERATION-DOMAIN-MT");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATION-DOMAIN-MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-METHOD");
        $sym79$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAI = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE"));
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS")))), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-ENCAPSULATED-P"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("QUERY-GLOSS"), (SubLObject)SubLObjectFactory.makeString(""))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE")))), (SubLObject)ConsesLow.list((SubLObject)inverted_index_query_library.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-AND-GLOSS-FOR-FORMULA-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MY-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAYBE-ADD-NEW-INDEXED-ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-ITEMS"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION-GATHER"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)inverted_index_query_library.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INVERTED-INDEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*QUERY-INDEX-INDEX-GENERATION?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INVERTED-INDEX-ENTRIES-FOR-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-QUESTION"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-QUERY")), (SubLObject)SubLObjectFactory.makeSymbol("MY-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-INVERTED-INDEX-ENTRIES-FOR-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("MY-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))));
        $sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-METHOD");
        $str83$ = SubLObjectFactory.makeString("");
        $sym84$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym85$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIE = SubLObjectFactory.makeSymbol("QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("application.cyc-ir.lucene.ql-index.in-memory"));
        $sym87$_QL_BUILD_INDEX_IN_MEMORY_ = SubLObjectFactory.makeSymbol("*QL-BUILD-INDEX-IN-MEMORY*");
        $kw88$PARAMETER = SubLObjectFactory.makeKeyword("PARAMETER");
        $sym89$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $kw90$INDEXED = SubLObjectFactory.makeKeyword("INDEXED");
        $kw91$INDEX_UNINITIALIZED = SubLObjectFactory.makeKeyword("INDEX-UNINITIALIZED");
        $sym92$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("WEIGHT"));
        $sym94$DISABLE_QL_IR_SEARCH = SubLObjectFactory.makeSymbol("DISABLE-QL-IR-SEARCH");
        $sym95$ENABLE_QL_IR_SEARCH = SubLObjectFactory.makeSymbol("ENABLE-QL-IR-SEARCH");
        $const96$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateFromTestQueryFn"));
        $const97$querySpecificationForFormulaTempl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("querySpecificationForFormulaTemplate"));
        $kw98$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $kw99$REMOVAL_LOOKUP_POS = SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-POS");
        $kw100$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw101$HL = SubLObjectFactory.makeKeyword("HL");
        $kw102$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw103$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)inverted_index_query_library.ONE_INTEGER);
        $kw105$X = SubLObjectFactory.makeKeyword("X");
        $const106$assertedSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence"));
        $const107$comment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment"));
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("X"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)inverted_index_query_library.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)inverted_index_query_library.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS"));
        $const110$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const111$formulaTemplateGloss = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateGloss"));
    }
}

/*

	Total time: 541 ms
	
*/