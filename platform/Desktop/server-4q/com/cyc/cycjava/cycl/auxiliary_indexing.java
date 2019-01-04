package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class auxiliary_indexing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.auxiliary_indexing";
    public static final String myFingerPrint = "c9a53c067c7bd733fcdb193caff972d40438e64a4c85e3c038e3f323a066623c";
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 999L)
    private static SubLSymbol $auxiliary_indices$;
    private static final SubLSymbol $sym0$SYMBOLP;
    private static final SubLSymbol $sym1$STRINGP;
    private static final SubLSymbol $kw2$INDEX_NAME;
    private static final SubLSymbol $kw3$INDEX;
    private static final SubLSymbol $kw4$UNBOUND_RULE_INDEX;
    private static final SubLString $str5$Unbound_Rule_Index;
    private static final SubLSymbol $kw6$UNBOUND_RULE_INDEX_POS;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$UNBOUND_RULE_INDEX_NEG;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$RELEVANT_MT_;
    private static final SubLSymbol $sym11$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym12$SENSE_P;
    private static final SubLSymbol $kw13$MAPPING_DONE;
    private static final SubLSymbol $kw14$RULE;
    private static final SubLSymbol $sym15$HLMT_P;
    private static final SubLSymbol $kw16$POS;
    private static final SubLSymbol $sym17$UNBOUND_PREDICATE_LITERAL;
    private static final SubLString $str18$Rebuilding_unbound_rule_index_str;
    private static final SubLSymbol $kw19$SKIP;
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1111L)
    public static SubLObject auxiliary_indices() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.copy_list(auxiliary_indexing.$auxiliary_indices$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1182L)
    public static SubLObject declare_auxiliary_index(final SubLObject aux_index, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert auxiliary_indexing.NIL != Types.symbolp(aux_index) : aux_index;
        assert auxiliary_indexing.NIL != Types.stringp(name) : name;
        if (auxiliary_indexing.NIL == conses_high.member(aux_index, auxiliary_indexing.$auxiliary_indices$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)auxiliary_indexing.EQL), Symbols.symbol_function((SubLObject)auxiliary_indexing.IDENTITY))) {
            auxiliary_indexing.$auxiliary_indices$.setDynamicValue((SubLObject)ConsesLow.cons(aux_index, auxiliary_indexing.$auxiliary_indices$.getDynamicValue(thread)), thread);
        }
        Symbols.put(aux_index, (SubLObject)auxiliary_indexing.$kw2$INDEX_NAME, name);
        return aux_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1398L)
    public static SubLObject auxiliary_index_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, auxiliary_indexing.$auxiliary_indices$.getDynamicValue(thread), (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1480L)
    public static SubLObject get_auxiliary_index(final SubLObject aux_index) {
        return Symbols.get(aux_index, (SubLObject)auxiliary_indexing.$kw3$INDEX, (SubLObject)auxiliary_indexing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1557L)
    public static SubLObject auxiliary_index_swapped_inP(final SubLObject aux_index) {
        return (SubLObject)auxiliary_indexing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1684L)
    public static SubLObject reset_auxiliary_index(final SubLObject aux_index, final SubLObject new_index) {
        if (auxiliary_indexing.NIL != new_index) {
            Symbols.put(aux_index, (SubLObject)auxiliary_indexing.$kw3$INDEX, new_index);
        }
        else {
            Symbols.remprop(aux_index, (SubLObject)auxiliary_indexing.$kw3$INDEX);
        }
        return aux_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1848L)
    public static SubLObject clear_auxiliary_index(final SubLObject aux_index) {
        return reset_auxiliary_index(aux_index, kb_indexing_datastructures.new_simple_index());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 1953L)
    public static SubLObject auxiliary_index_name(final SubLObject aux_index) {
        return Symbols.get(aux_index, (SubLObject)auxiliary_indexing.$kw2$INDEX_NAME, (SubLObject)auxiliary_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 3441L)
    public static SubLObject num_unbound_rule_index(SubLObject sense, SubLObject mt, SubLObject direction) {
        if (sense == auxiliary_indexing.UNPROVIDED) {
            sense = (SubLObject)auxiliary_indexing.NIL;
        }
        if (mt == auxiliary_indexing.UNPROVIDED) {
            mt = (SubLObject)auxiliary_indexing.NIL;
        }
        if (direction == auxiliary_indexing.UNPROVIDED) {
            direction = (SubLObject)auxiliary_indexing.NIL;
        }
        if (auxiliary_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(unbound_rule_index())) {
            SubLObject count = (SubLObject)auxiliary_indexing.ZERO_INTEGER;
            SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(unbound_rule_index());
            SubLObject ass = (SubLObject)auxiliary_indexing.NIL;
            ass = cdolist_list_var.first();
            while (auxiliary_indexing.NIL != cdolist_list_var) {
                if (auxiliary_indexing.NIL != simple_indexing.matches_unbound_rule_index(ass, sense, mt, direction)) {
                    count = Numbers.add(count, (SubLObject)auxiliary_indexing.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
            return count;
        }
        if (auxiliary_indexing.NIL == sense) {
            SubLObject count = (SubLObject)auxiliary_indexing.ZERO_INTEGER;
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$1 = (SubLObject)auxiliary_indexing.NIL;
            sense_$1 = cdolist_list_var.first();
            while (auxiliary_indexing.NIL != cdolist_list_var) {
                count = Numbers.add(count, num_unbound_rule_index(sense_$1, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                sense_$1 = cdolist_list_var.first();
            }
            return count;
        }
        final SubLObject unbound_rule_subindex = get_unbound_rule_subindex(sense, mt, direction);
        return (SubLObject)((auxiliary_indexing.NIL != unbound_rule_subindex) ? kb_indexing_datastructures.subindex_leaf_count(unbound_rule_subindex) : auxiliary_indexing.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 4174L)
    public static SubLObject relevant_num_unbound_rule_index(SubLObject sense) {
        if (sense == auxiliary_indexing.UNPROVIDED) {
            sense = (SubLObject)auxiliary_indexing.NIL;
        }
        SubLObject count = (SubLObject)auxiliary_indexing.ZERO_INTEGER;
        if (auxiliary_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(unbound_rule_index())) {
            SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(unbound_rule_index());
            SubLObject ass = (SubLObject)auxiliary_indexing.NIL;
            ass = cdolist_list_var.first();
            while (auxiliary_indexing.NIL != cdolist_list_var) {
                if (auxiliary_indexing.NIL != simple_indexing.matches_unbound_rule_index(ass, sense, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED) && auxiliary_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
                    count = Numbers.add(count, (SubLObject)auxiliary_indexing.ONE_INTEGER);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
        }
        else if (auxiliary_indexing.NIL == sense) {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$2 = (SubLObject)auxiliary_indexing.NIL;
            sense_$2 = cdolist_list_var.first();
            while (auxiliary_indexing.NIL != cdolist_list_var) {
                count = Numbers.add(count, relevant_num_unbound_rule_index(sense_$2));
                cdolist_list_var = cdolist_list_var.rest();
                sense_$2 = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var2;
            final SubLObject mts = cdolist_list_var2 = key_unbound_rule_index(sense, (SubLObject)auxiliary_indexing.UNPROVIDED);
            SubLObject mt = (SubLObject)auxiliary_indexing.NIL;
            mt = cdolist_list_var2.first();
            while (auxiliary_indexing.NIL != cdolist_list_var2) {
                if (auxiliary_indexing.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                    count = Numbers.add(count, num_unbound_rule_index(sense, mt, (SubLObject)auxiliary_indexing.UNPROVIDED));
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt = cdolist_list_var2.first();
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 4956L)
    public static SubLObject key_unbound_rule_index(SubLObject sense, SubLObject mt) {
        if (sense == auxiliary_indexing.UNPROVIDED) {
            sense = (SubLObject)auxiliary_indexing.NIL;
        }
        if (mt == auxiliary_indexing.UNPROVIDED) {
            mt = (SubLObject)auxiliary_indexing.NIL;
        }
        if (auxiliary_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(unbound_rule_index())) {
            SubLObject v_answer = (SubLObject)auxiliary_indexing.NIL;
            SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(unbound_rule_index());
            SubLObject ass = (SubLObject)auxiliary_indexing.NIL;
            ass = cdolist_list_var.first();
            while (auxiliary_indexing.NIL != cdolist_list_var) {
                v_answer = simple_indexing.simple_key_unbound_rule_index(ass, v_answer, sense, mt);
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
            return v_answer;
        }
        if (auxiliary_indexing.NIL == sense) {
            SubLObject keys = (SubLObject)auxiliary_indexing.NIL;
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$3 = (SubLObject)auxiliary_indexing.NIL;
            sense_$3 = cdolist_list_var.first();
            while (auxiliary_indexing.NIL != cdolist_list_var) {
                if (num_unbound_rule_index(sense_$3, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED).isPositive()) {
                    keys = (SubLObject)ConsesLow.cons(sense_$3, keys);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$3 = cdolist_list_var.first();
            }
            return keys;
        }
        final SubLObject subindex = get_unbound_rule_subindex(sense, mt, (SubLObject)auxiliary_indexing.UNPROVIDED);
        return (SubLObject)((auxiliary_indexing.NIL != kb_indexing_datastructures.intermediate_index_p(subindex)) ? kb_indexing_datastructures.intermediate_index_keys(subindex) : auxiliary_indexing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 5691L)
    public static SubLObject relevant_key_unbound_rule_index(SubLObject sense) {
        if (sense == auxiliary_indexing.UNPROVIDED) {
            sense = (SubLObject)auxiliary_indexing.NIL;
        }
        if (auxiliary_indexing.NIL != kb_indexing_datastructures.simple_indexed_term_p(unbound_rule_index())) {
            SubLObject keys = (SubLObject)auxiliary_indexing.NIL;
            SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(unbound_rule_index());
            SubLObject ass = (SubLObject)auxiliary_indexing.NIL;
            ass = cdolist_list_var.first();
            while (auxiliary_indexing.NIL != cdolist_list_var) {
                if (auxiliary_indexing.NIL != simple_indexing.matches_unbound_rule_index(ass, sense, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED) && auxiliary_indexing.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass))) {
                    keys = simple_indexing.simple_key_unbound_rule_index(ass, keys, sense, (SubLObject)auxiliary_indexing.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
            return keys;
        }
        if (auxiliary_indexing.NIL == sense) {
            SubLObject keys = (SubLObject)auxiliary_indexing.NIL;
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_$4 = (SubLObject)auxiliary_indexing.NIL;
            sense_$4 = cdolist_list_var.first();
            while (auxiliary_indexing.NIL != cdolist_list_var) {
                if (relevant_num_unbound_rule_index(sense_$4).isPositive()) {
                    keys = (SubLObject)ConsesLow.cons(sense_$4, keys);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense_$4 = cdolist_list_var.first();
            }
            return keys;
        }
        return list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)auxiliary_indexing.$sym10$RELEVANT_MT_), key_unbound_rule_index(sense, (SubLObject)auxiliary_indexing.UNPROVIDED), (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 6463L)
    public static SubLObject add_unbound_rule_index(final SubLObject sense, final SubLObject mt, final SubLObject direction, final SubLObject assertion) {
        return kb_indexing.term_add_indexing_leaf(unbound_rule_index(), (SubLObject)ConsesLow.list(sense, mt, direction), assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 6639L)
    public static SubLObject rem_unbound_rule_index(final SubLObject sense, final SubLObject mt, final SubLObject direction, final SubLObject assertion) {
        return kb_indexing.term_rem_indexing_leaf(unbound_rule_index(), (SubLObject)ConsesLow.list(sense, mt, direction), assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 6801L)
    public static SubLObject get_unbound_rule_subindex(final SubLObject sense, SubLObject mt, SubLObject direction) {
        if (mt == auxiliary_indexing.UNPROVIDED) {
            mt = (SubLObject)auxiliary_indexing.NIL;
        }
        if (direction == auxiliary_indexing.UNPROVIDED) {
            direction = (SubLObject)auxiliary_indexing.NIL;
        }
        return kb_indexing.get_subindex(unbound_rule_index(), (SubLObject)ConsesLow.list(sense, mt, direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 6992L)
    public static SubLObject map_unbound_rule_index(final SubLObject function, final SubLObject sense, SubLObject direction) {
        if (direction == auxiliary_indexing.UNPROVIDED) {
            direction = (SubLObject)auxiliary_indexing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert auxiliary_indexing.NIL != Types.function_spec_p(function) : function;
        assert auxiliary_indexing.NIL != enumeration_types.sense_p(sense) : sense;
        SubLObject catch_var = (SubLObject)auxiliary_indexing.NIL;
        try {
            thread.throwStack.push(auxiliary_indexing.$kw13$MAPPING_DONE);
            if (auxiliary_indexing.NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
                SubLObject done_var = (SubLObject)auxiliary_indexing.NIL;
                final SubLObject token_var = (SubLObject)auxiliary_indexing.NIL;
                while (auxiliary_indexing.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (auxiliary_indexing.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)auxiliary_indexing.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)auxiliary_indexing.$kw14$RULE, (SubLObject)auxiliary_indexing.NIL, direction);
                            SubLObject done_var_$5 = (SubLObject)auxiliary_indexing.NIL;
                            final SubLObject token_var_$6 = (SubLObject)auxiliary_indexing.NIL;
                            while (auxiliary_indexing.NIL == done_var_$5) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(ass));
                                if (auxiliary_indexing.NIL != valid_$7 && auxiliary_indexing.NIL != simple_indexing.matches_unbound_rule_index(ass, sense, (SubLObject)auxiliary_indexing.NIL, direction)) {
                                    Functions.funcall(function, ass);
                                }
                                done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(auxiliary_indexing.NIL == valid_$7);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)auxiliary_indexing.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (auxiliary_indexing.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(auxiliary_indexing.NIL == valid);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)auxiliary_indexing.$kw13$MAPPING_DONE);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 7363L)
    public static SubLObject map_unbound_rule_mt_index(final SubLObject function, final SubLObject sense, final SubLObject mt, SubLObject direction) {
        if (direction == auxiliary_indexing.UNPROVIDED) {
            direction = (SubLObject)auxiliary_indexing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert auxiliary_indexing.NIL != Types.function_spec_p(function) : function;
        assert auxiliary_indexing.NIL != enumeration_types.sense_p(sense) : sense;
        assert auxiliary_indexing.NIL != hlmt.hlmt_p(mt) : mt;
        SubLObject catch_var = (SubLObject)auxiliary_indexing.NIL;
        try {
            thread.throwStack.push(auxiliary_indexing.$kw13$MAPPING_DONE);
            if (auxiliary_indexing.NIL != kb_mapping_macros.do_unbound_predicate_rule_index_key_validator(sense, direction)) {
                final SubLObject iterator_var = kb_mapping_macros.new_unbound_predicate_rule_final_index_spec_iterator(sense, direction);
                SubLObject done_var = (SubLObject)auxiliary_indexing.NIL;
                final SubLObject token_var = (SubLObject)auxiliary_indexing.NIL;
                while (auxiliary_indexing.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (auxiliary_indexing.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)auxiliary_indexing.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)auxiliary_indexing.$kw14$RULE, (SubLObject)auxiliary_indexing.NIL, direction);
                            SubLObject done_var_$8 = (SubLObject)auxiliary_indexing.NIL;
                            final SubLObject token_var_$9 = (SubLObject)auxiliary_indexing.NIL;
                            while (auxiliary_indexing.NIL == done_var_$8) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                final SubLObject valid_$10 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$9.eql(ass));
                                if (auxiliary_indexing.NIL != valid_$10 && auxiliary_indexing.NIL != simple_indexing.matches_unbound_rule_index(ass, sense, mt, direction)) {
                                    Functions.funcall(function, ass);
                                }
                                done_var_$8 = (SubLObject)SubLObjectFactory.makeBoolean(auxiliary_indexing.NIL == valid_$10);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)auxiliary_indexing.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (auxiliary_indexing.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(auxiliary_indexing.NIL == valid);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)auxiliary_indexing.$kw13$MAPPING_DONE);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 7752L)
    public static SubLObject unbound_rule_index() {
        return (SubLObject)auxiliary_indexing.$kw4$UNBOUND_RULE_INDEX;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 7826L)
    public static SubLObject add_unbound_rule_indices(final SubLObject assertion) {
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense = (SubLObject)auxiliary_indexing.NIL;
        sense = cdolist_list_var.first();
        while (auxiliary_indexing.NIL != cdolist_list_var) {
            if (auxiliary_indexing.NIL != some_unbound_predicate_literal(cnf, sense)) {
                add_unbound_rule_index(sense, mt, direction, assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense = cdolist_list_var.first();
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8161L)
    public static SubLObject rem_unbound_rule_indices(final SubLObject assertion) {
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense = (SubLObject)auxiliary_indexing.NIL;
        sense = cdolist_list_var.first();
        while (auxiliary_indexing.NIL != cdolist_list_var) {
            if (auxiliary_indexing.NIL != some_unbound_predicate_literal(cnf, sense)) {
                rem_unbound_rule_index(sense, mt, direction, assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense = cdolist_list_var.first();
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8496L)
    public static SubLObject unbound_predicate_rule_p(final SubLObject v_object) {
        return unbound_rule_assertion_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8589L)
    public static SubLObject clear_unbound_rule_index() {
        clear_auxiliary_index(unbound_rule_index());
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8706L)
    public static SubLObject unbound_rule_assertion_p(final SubLObject assertion) {
        if (auxiliary_indexing.NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense = (SubLObject)auxiliary_indexing.NIL;
            sense = cdolist_list_var.first();
            while (auxiliary_indexing.NIL != cdolist_list_var) {
                if (auxiliary_indexing.NIL != some_unbound_predicate_literal(cnf, sense)) {
                    return (SubLObject)auxiliary_indexing.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                sense = cdolist_list_var.first();
            }
        }
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 8946L)
    public static SubLObject unbound_predicate_literal(final SubLObject literal) {
        return (SubLObject)SubLObjectFactory.makeBoolean(literal.isCons() && auxiliary_indexing.NIL != variables.variable_p(el_utilities.literal_predicate(literal, (SubLObject)auxiliary_indexing.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 9080L)
    public static SubLObject some_unbound_predicate_literal(final SubLObject clause, final SubLObject sense) {
        final SubLObject literals = (sense == auxiliary_indexing.$kw16$POS) ? clauses.pos_lits(clause) : clauses.neg_lits(clause);
        return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function((SubLObject)auxiliary_indexing.$sym17$UNBOUND_PREDICATE_LITERAL), literals, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 9291L)
    public static SubLObject reconstruct_auxiliary_indices() {
        reconstruct_unbound_rule_indices();
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 9537L)
    public static SubLObject reconstruct_unbound_rule_indices() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_unbound_rule_index();
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)auxiliary_indexing.$str18$Rebuilding_unbound_rule_index_str;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)auxiliary_indexing.ZERO_INTEGER;
        assert auxiliary_indexing.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)auxiliary_indexing.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)auxiliary_indexing.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)auxiliary_indexing.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$11 = idx;
                if (auxiliary_indexing.NIL == id_index.id_index_objects_empty_p(idx_$11, (SubLObject)auxiliary_indexing.$kw19$SKIP)) {
                    final SubLObject idx_$12 = idx_$11;
                    if (auxiliary_indexing.NIL == id_index.id_index_dense_objects_empty_p(idx_$12, (SubLObject)auxiliary_indexing.$kw19$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$12);
                        final SubLObject backwardP_var = (SubLObject)auxiliary_indexing.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        SubLObject _prev_bind_0_$13;
                        SubLObject _prev_bind_1_$14;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)auxiliary_indexing.NIL, v_iteration = (SubLObject)auxiliary_indexing.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)auxiliary_indexing.ONE_INTEGER)) {
                            a_id = ((auxiliary_indexing.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)auxiliary_indexing.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (auxiliary_indexing.NIL == id_index.id_index_tombstone_p(a_handle) || auxiliary_indexing.NIL == id_index.id_index_skip_tombstones_p((SubLObject)auxiliary_indexing.$kw19$SKIP)) {
                                if (auxiliary_indexing.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)auxiliary_indexing.$kw19$SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (auxiliary_indexing.NIL != unbound_rule_assertion_p(assertion)) {
                                    _prev_bind_0_$13 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.currentBinding(thread);
                                    _prev_bind_1_$14 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding(thread);
                                    try {
                                        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind((SubLObject)auxiliary_indexing.T, thread);
                                        simple_indexing.$terms_to_toggle_indexing_mode$.bind((SubLObject)auxiliary_indexing.NIL, thread);
                                        add_unbound_rule_indices(assertion);
                                        if (auxiliary_indexing.NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread)) {
                                            simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
                                        }
                                    }
                                    finally {
                                        simple_indexing.$terms_to_toggle_indexing_mode$.rebind(_prev_bind_1_$14, thread);
                                        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)auxiliary_indexing.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$13 = idx_$11;
                    if (auxiliary_indexing.NIL == id_index.id_index_sparse_objects_empty_p(idx_$13) || auxiliary_indexing.NIL == id_index.id_index_skip_tombstones_p((SubLObject)auxiliary_indexing.$kw19$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$13);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$13);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$13);
                        final SubLObject v_default = (SubLObject)((auxiliary_indexing.NIL != id_index.id_index_skip_tombstones_p((SubLObject)auxiliary_indexing.$kw19$SKIP)) ? auxiliary_indexing.NIL : auxiliary_indexing.$kw19$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (auxiliary_indexing.NIL == id_index.id_index_skip_tombstones_p((SubLObject)auxiliary_indexing.$kw19$SKIP) || auxiliary_indexing.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (auxiliary_indexing.NIL != unbound_rule_assertion_p(assertion2)) {
                                    final SubLObject _prev_bind_0_$14 = simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$15 = simple_indexing.$terms_to_toggle_indexing_mode$.currentBinding(thread);
                                    try {
                                        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.bind((SubLObject)auxiliary_indexing.T, thread);
                                        simple_indexing.$terms_to_toggle_indexing_mode$.bind((SubLObject)auxiliary_indexing.NIL, thread);
                                        add_unbound_rule_indices(assertion2);
                                        if (auxiliary_indexing.NIL != simple_indexing.$terms_to_toggle_indexing_mode$.getDynamicValue(thread)) {
                                            simple_indexing.noting_terms_to_toggle_indexing_mode_internal();
                                        }
                                    }
                                    finally {
                                        simple_indexing.$terms_to_toggle_indexing_mode$.rebind(_prev_bind_1_$15, thread);
                                        simple_indexing.$within_noting_terms_to_toggle_indexing_mode$.rebind(_prev_bind_0_$14, thread);
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)auxiliary_indexing.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)auxiliary_indexing.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)auxiliary_indexing.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return num_unbound_rule_index((SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 10045L)
    public static SubLObject dump_auxiliary_indices(final SubLObject stream) {
        dump_unbound_rule_index(stream);
        cfasl.cfasl_output((SubLObject)auxiliary_indexing.NIL, stream);
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 10337L)
    public static SubLObject load_auxiliary_indices(final SubLObject stream) {
        load_unbound_rule_index(stream);
        cfasl.cfasl_input(stream, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED);
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 10622L)
    public static SubLObject dump_unbound_rule_index(final SubLObject stream) {
        cfasl.cfasl_output(get_auxiliary_index(unbound_rule_index()), stream);
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auxiliary-indexing.lisp", position = 10764L)
    public static SubLObject load_unbound_rule_index(final SubLObject stream) {
        reset_auxiliary_index(unbound_rule_index(), cfasl.cfasl_input(stream, (SubLObject)auxiliary_indexing.UNPROVIDED, (SubLObject)auxiliary_indexing.UNPROVIDED));
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    public static SubLObject declare_auxiliary_indexing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "auxiliary_indices", "AUXILIARY-INDICES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "declare_auxiliary_index", "DECLARE-AUXILIARY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "auxiliary_index_p", "AUXILIARY-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "get_auxiliary_index", "GET-AUXILIARY-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "auxiliary_index_swapped_inP", "AUXILIARY-INDEX-SWAPPED-IN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "reset_auxiliary_index", "RESET-AUXILIARY-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "clear_auxiliary_index", "CLEAR-AUXILIARY-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "auxiliary_index_name", "AUXILIARY-INDEX-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "num_unbound_rule_index", "NUM-UNBOUND-RULE-INDEX", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "relevant_num_unbound_rule_index", "RELEVANT-NUM-UNBOUND-RULE-INDEX", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "key_unbound_rule_index", "KEY-UNBOUND-RULE-INDEX", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "relevant_key_unbound_rule_index", "RELEVANT-KEY-UNBOUND-RULE-INDEX", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "add_unbound_rule_index", "ADD-UNBOUND-RULE-INDEX", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "rem_unbound_rule_index", "REM-UNBOUND-RULE-INDEX", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "get_unbound_rule_subindex", "GET-UNBOUND-RULE-SUBINDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "map_unbound_rule_index", "MAP-UNBOUND-RULE-INDEX", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "map_unbound_rule_mt_index", "MAP-UNBOUND-RULE-MT-INDEX", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "unbound_rule_index", "UNBOUND-RULE-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "add_unbound_rule_indices", "ADD-UNBOUND-RULE-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "rem_unbound_rule_indices", "REM-UNBOUND-RULE-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "unbound_predicate_rule_p", "UNBOUND-PREDICATE-RULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "clear_unbound_rule_index", "CLEAR-UNBOUND-RULE-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "unbound_rule_assertion_p", "UNBOUND-RULE-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "unbound_predicate_literal", "UNBOUND-PREDICATE-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "some_unbound_predicate_literal", "SOME-UNBOUND-PREDICATE-LITERAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "reconstruct_auxiliary_indices", "RECONSTRUCT-AUXILIARY-INDICES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "reconstruct_unbound_rule_indices", "RECONSTRUCT-UNBOUND-RULE-INDICES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "dump_auxiliary_indices", "DUMP-AUXILIARY-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "load_auxiliary_indices", "LOAD-AUXILIARY-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "dump_unbound_rule_index", "DUMP-UNBOUND-RULE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auxiliary_indexing", "load_unbound_rule_index", "LOAD-UNBOUND-RULE-INDEX", 1, 0, false);
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    public static SubLObject init_auxiliary_indexing_file() {
        auxiliary_indexing.$auxiliary_indices$ = SubLFiles.defparameter("*AUXILIARY-INDICES*", (SubLObject)auxiliary_indexing.NIL);
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    public static SubLObject setup_auxiliary_indexing_file() {
        declare_auxiliary_index((SubLObject)auxiliary_indexing.$kw4$UNBOUND_RULE_INDEX, (SubLObject)auxiliary_indexing.$str5$Unbound_Rule_Index);
        kb_indexing_declarations.declare_index((SubLObject)auxiliary_indexing.$kw6$UNBOUND_RULE_INDEX_POS, (SubLObject)auxiliary_indexing.$list7);
        kb_indexing_declarations.declare_index((SubLObject)auxiliary_indexing.$kw8$UNBOUND_RULE_INDEX_NEG, (SubLObject)auxiliary_indexing.$list9);
        return (SubLObject)auxiliary_indexing.NIL;
    }
    
    public void declareFunctions() {
        declare_auxiliary_indexing_file();
    }
    
    public void initializeVariables() {
        init_auxiliary_indexing_file();
    }
    
    public void runTopLevelForms() {
        setup_auxiliary_indexing_file();
    }
    
    static {
        me = (SubLFile)new auxiliary_indexing();
        auxiliary_indexing.$auxiliary_indices$ = null;
        $sym0$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym1$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw2$INDEX_NAME = SubLObjectFactory.makeKeyword("INDEX-NAME");
        $kw3$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw4$UNBOUND_RULE_INDEX = SubLObjectFactory.makeKeyword("UNBOUND-RULE-INDEX");
        $str5$Unbound_Rule_Index = SubLObjectFactory.makeString("Unbound Rule Index");
        $kw6$UNBOUND_RULE_INDEX_POS = SubLObjectFactory.makeKeyword("UNBOUND-RULE-INDEX-POS");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Unbound positive rule index"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("AUXILIARY-INDEX-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)auxiliary_indexing.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), auxiliary_indexing.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), auxiliary_indexing.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)auxiliary_indexing.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a pos-lit with a variable in the predicate position.")) });
        $kw8$UNBOUND_RULE_INDEX_NEG = SubLObjectFactory.makeKeyword("UNBOUND-RULE-INDEX-NEG");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("Unbound negative rule index"), SubLObjectFactory.makeKeyword("DOMAIN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("term"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("AUXILIARY-INDEX-P")), SubLObjectFactory.makeKeyword("TOP-LEVEL-KEY"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("KEYS"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("sense"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)auxiliary_indexing.EQ), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("mt"), SubLObjectFactory.makeKeyword("MT?"), auxiliary_indexing.T, SubLObjectFactory.makeKeyword("VALIDITY-TEST"), SubLObjectFactory.makeSymbol("HLMT-P"), SubLObjectFactory.makeKeyword("RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("RELEVANT-MT?"), SubLObjectFactory.makeKeyword("EQUAL-TEST"), auxiliary_indexing.EQUAL }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("direction"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION-P"), (SubLObject)SubLObjectFactory.makeKeyword("EQUAL-TEST"), (SubLObject)auxiliary_indexing.EQ)), SubLObjectFactory.makeKeyword("RANGE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("rule"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ASSERTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a neg-lit with a variable in the predicate position.")) });
        $sym10$RELEVANT_MT_ = SubLObjectFactory.makeSymbol("RELEVANT-MT?");
        $sym11$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym12$SENSE_P = SubLObjectFactory.makeSymbol("SENSE-P");
        $kw13$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $kw14$RULE = SubLObjectFactory.makeKeyword("RULE");
        $sym15$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $kw16$POS = SubLObjectFactory.makeKeyword("POS");
        $sym17$UNBOUND_PREDICATE_LITERAL = SubLObjectFactory.makeSymbol("UNBOUND-PREDICATE-LITERAL");
        $str18$Rebuilding_unbound_rule_index_str = SubLObjectFactory.makeString("Rebuilding unbound rule index structure");
        $kw19$SKIP = SubLObjectFactory.makeKeyword("SKIP");
    }
}

/*

	Total time: 350 ms
	
*/