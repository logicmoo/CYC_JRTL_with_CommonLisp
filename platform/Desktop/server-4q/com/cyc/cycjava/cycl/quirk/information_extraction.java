package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.nl_trie_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class information_extraction extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.information_extraction";
    public static final String myFingerPrint = "21aa4a9da8a124b9b89ee6b092981ef91e926c360d467381a74a8737c2c657b6";
    private static final SubLSymbol $sym0$INFORMATION_EXTRACTION_NODE;
    private static final SubLSymbol $sym1$GRAPH_NODE;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CYCL_DENOTATIONS;
    private static final SubLSymbol $sym4$OBJECT;
    private static final SubLSymbol $sym5$INSTANCE_COUNT;
    private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_CLASS;
    private static final SubLSymbol $sym7$ISOLATED_P;
    private static final SubLSymbol $sym8$INSTANCE_NUMBER;
    private static final SubLSymbol $sym9$CORE;
    private static final SubLSymbol $sym10$ID;
    private static final SubLSymbol $sym11$LABEL;
    private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_INSTANCE;
    private static final SubLSymbol $sym13$INITIALIZE;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$INFORMATION_EXTRACTION_NODE_INITIALIZE_METHOD;
    private static final SubLSymbol $sym17$CYCL_DENOTS;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD;
    private static final SubLSymbol $sym20$INFORMATION_EXTRACTION_NODE_CYCL_DENOTS_METHOD;
    private static final SubLSymbol $sym21$EXTRACT_CYCL;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD;
    private static final SubLSymbol $sym26$LISTP;
    private static final SubLSymbol $sym27$INFORMATION_EXTRACTION_NODE_EXTRACT_CYCL_METHOD;
    private static final SubLSymbol $sym28$PRINT;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD;
    private static final SubLString $str32$__IEN__;
    private static final SubLString $str33$____;
    private static final SubLString $str34$_;
    private static final SubLSymbol $sym35$INFORMATION_EXTRACTION_NODE_PRINT_METHOD;
    private static final SubLSymbol $sym36$STRINGP;
    private static final SubLSymbol $sym37$SET_LABEL;
    private static final SubLSymbol $sym38$SET_ID;
    private static final SubLSymbol $sym39$INFORMATION_EXTRACTION_GRAPH;
    private static final SubLSymbol $sym40$GRAPH;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_CLASS;
    private static final SubLSymbol $sym43$NAME;
    private static final SubLSymbol $sym44$INTEGER_SEQUENCE_GENERATOR;
    private static final SubLSymbol $sym45$LABEL_NODE_MAP;
    private static final SubLSymbol $sym46$NODES;
    private static final SubLSymbol $sym47$LABEL_EDGE_MAP;
    private static final SubLSymbol $sym48$EDGES_SOURCE;
    private static final SubLSymbol $sym49$EDGES_TARGET;
    private static final SubLSymbol $sym50$CORE_NODE_MAP;
    private static final SubLSymbol $sym51$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_INSTANCE;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$INFORMATION_EXTRACTION_GRAPH_INITIALIZE_METHOD;
    private static final SubLSymbol $sym54$ACCEPT_NODE;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$INFORMATION_EXTRACTION_GRAPH_ACCEPT_NODE_METHOD;
    private static final SubLSymbol $sym58$FIND_EVENTS;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$INFORMATION_EXTRACTION_GRAPH_FIND_EVENTS_METHOD;
    private static final SubLSymbol $sym62$GET_NODE_BY_LABEL;
    private static final SubLSymbol $sym63$ADD_NODE;
    private static final SubLSymbol $sym64$ADD_EDGE;
    private static final SubLSymbol $sym65$GRAPH_EDGE;
    private static final SubLSymbol $sym66$MAKE_EDGE;
    private static final SubLSymbol $sym67$IE_MARKET_POSITION;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$SUPPORTS;
    private static final SubLSymbol $sym70$BINDER;
    private static final SubLSymbol $sym71$FUNDS;
    private static final SubLSymbol $sym72$SOUGHT;
    private static final SubLSymbol $sym73$ON_SALE;
    private static final SubLSymbol $sym74$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_CLASS;
    private static final SubLSymbol $sym75$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_INSTANCE;
    private static final SubLSymbol $sym76$VARIABLE_DICTIONARY;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$DICTIONARY;
    private static final SubLSymbol $sym79$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_CLASS;
    private static final SubLSymbol $sym80$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_INSTANCE;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$VARIABLE_DICTIONARY_INITIALIZE_METHOD;
    private static final SubLSymbol $sym83$KEYS;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD;
    private static final SubLSymbol $sym86$VARIABLE_DICTIONARY_KEYS_METHOD;
    private static final SubLSymbol $sym87$FIND_VARIABLE_TAXONOMIC_PRED;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD;
    private static final SubLString $str92$___S_is_not_a_variable_;
    private static final SubLList $list93;
    private static final SubLString $str94$___S_is_not_a_taxonomic_predicate;
    private static final SubLObject $const95$genls;
    private static final SubLSymbol $sym96$VARIABLE_DICTIONARY_FIND_VARIABLE_TAXONOMIC_PRED_METHOD;
    private static final SubLSymbol $sym97$PPRINT;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD;
    private static final SubLSymbol $sym101$VARIABLE_DICTIONARY_PPRINT_METHOD;
    private static final SubLSymbol $sym102$APPEND;
    private static final SubLSymbol $sym103$CONSP;
    private static final SubLString $str104$index;
    private static final SubLSymbol $sym105$GET_PATH_LABELS;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
    public static SubLObject get_information_extraction_node_cycl_denotations(final SubLObject information_extraction_node) {
        return classes.subloop_get_access_protected_instance_slot(information_extraction_node, (SubLObject)information_extraction.FOUR_INTEGER, (SubLObject)information_extraction.$sym3$CYCL_DENOTATIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
    public static SubLObject set_information_extraction_node_cycl_denotations(final SubLObject information_extraction_node, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(information_extraction_node, value, (SubLObject)information_extraction.FOUR_INTEGER, (SubLObject)information_extraction.$sym3$CYCL_DENOTATIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
    public static SubLObject subloop_reserved_initialize_information_extraction_node_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym5$INSTANCE_COUNT, (SubLObject)information_extraction.ZERO_INTEGER);
        return (SubLObject)information_extraction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
    public static SubLObject subloop_reserved_initialize_information_extraction_node_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym7$ISOLATED_P, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym8$INSTANCE_NUMBER, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym1$GRAPH_NODE, (SubLObject)information_extraction.$sym9$CORE, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym1$GRAPH_NODE, (SubLObject)information_extraction.$sym10$ID, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym1$GRAPH_NODE, (SubLObject)information_extraction.$sym11$LABEL, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$sym3$CYCL_DENOTATIONS, (SubLObject)information_extraction.NIL);
        return (SubLObject)information_extraction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 1931L)
    public static SubLObject information_extraction_node_p(final SubLObject information_extraction_node) {
        return classes.subloop_instanceof_class(information_extraction_node, (SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 2325L)
    public static SubLObject information_extraction_node_initialize_method(final SubLObject self) {
        graph.graph_node_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 2532L)
    public static SubLObject information_extraction_node_cycl_denots_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_information_extraction_node_method = (SubLObject)information_extraction.NIL;
        SubLObject cycl_denotations = get_information_extraction_node_cycl_denotations(self);
        final SubLObject label = graph.get_graph_node_label(self);
        try {
            thread.throwStack.push(information_extraction.$sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
            try {
                if (information_extraction.NIL != cycl_denotations) {
                    Dynamic.sublisp_throw((SubLObject)information_extraction.$sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations);
                }
                if (information_extraction.NIL != label) {
                    cycl_denotations = nl_trie_accessors.nl_trie_all_denots_of_string(label, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED);
                }
                Dynamic.sublisp_throw((SubLObject)information_extraction.$sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)information_extraction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_information_extraction_node_cycl_denotations(self, cycl_denotations);
                    graph.set_graph_node_label(self, label);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_information_extraction_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)information_extraction.$sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_information_extraction_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 2854L)
    public static SubLObject information_extraction_node_extract_cycl_method(final SubLObject self, SubLObject filters) {
        if (filters == information_extraction.UNPROVIDED) {
            filters = (SubLObject)information_extraction.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_information_extraction_node_method = (SubLObject)information_extraction.NIL;
        final SubLObject cycl_denotations = get_information_extraction_node_cycl_denotations(self);
        try {
            thread.throwStack.push(information_extraction.$sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
            try {
                if (information_extraction.NIL != filters && !information_extraction.assertionsDisabledInClass && information_extraction.NIL == Types.listp(filters)) {
                    throw new AssertionError(filters);
                }
                if (information_extraction.NIL == filters) {
                    Dynamic.sublisp_throw((SubLObject)information_extraction.$sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations);
                }
                SubLObject filtered = (SubLObject)information_extraction.NIL;
                SubLObject cdolist_list_var = cycl_denotations;
                SubLObject v_term = (SubLObject)information_extraction.NIL;
                v_term = cdolist_list_var.first();
                while (information_extraction.NIL != cdolist_list_var) {
                    SubLObject fail = (SubLObject)information_extraction.NIL;
                    if (information_extraction.NIL == fail) {
                        SubLObject csome_list_var;
                        SubLObject filter;
                        for (csome_list_var = filters, filter = (SubLObject)information_extraction.NIL, filter = csome_list_var.first(); information_extraction.NIL == fail && information_extraction.NIL != csome_list_var; fail = (SubLObject)SubLObjectFactory.makeBoolean(information_extraction.NIL == at_utilities.more_specific_p(v_term, filter, (SubLObject)information_extraction.UNPROVIDED)), csome_list_var = csome_list_var.rest(), filter = csome_list_var.first()) {}
                    }
                    if (information_extraction.NIL == fail) {
                        filtered = (SubLObject)ConsesLow.cons(v_term, filtered);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)information_extraction.$sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, filtered);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)information_extraction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_information_extraction_node_cycl_denotations(self, cycl_denotations);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_information_extraction_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)information_extraction.$sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_information_extraction_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 3450L)
    public static SubLObject information_extraction_node_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_information_extraction_node_method = (SubLObject)information_extraction.NIL;
        final SubLObject cycl_denotations = get_information_extraction_node_cycl_denotations(self);
        final SubLObject label = graph.get_graph_node_label(self);
        try {
            thread.throwStack.push(information_extraction.$sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
            try {
                streams_high.write_string((SubLObject)information_extraction.$str32$__IEN__, stream, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED);
                streams_high.write_string(label, stream, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED);
                if (information_extraction.NIL != cycl_denotations) {
                    streams_high.write_string((SubLObject)information_extraction.$str33$____, stream, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED);
                    streams_high.write_string(print_high.prin1_to_string(cycl_denotations), stream, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED);
                }
                streams_high.write_string((SubLObject)information_extraction.$str34$_, stream, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)information_extraction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_information_extraction_node_cycl_denotations(self, cycl_denotations);
                    graph.set_graph_node_label(self, label);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_information_extraction_node_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)information_extraction.$sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_information_extraction_node_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 3890L)
    public static SubLObject new_information_extraction_node(final SubLObject label, SubLObject id) {
        if (id == information_extraction.UNPROVIDED) {
            id = (SubLObject)information_extraction.NIL;
        }
        assert information_extraction.NIL != Types.stringp(label) : label;
        final SubLObject node = object.new_class_instance((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE);
        methods.funcall_instance_method_with_1_args(node, (SubLObject)information_extraction.$sym37$SET_LABEL, label);
        methods.funcall_instance_method_with_0_args(node, (SubLObject)information_extraction.$sym17$CYCL_DENOTS);
        if (information_extraction.NIL != id) {
            methods.funcall_instance_method_with_1_args(node, (SubLObject)information_extraction.$sym38$SET_ID, id);
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4307L)
    public static SubLObject subloop_reserved_initialize_information_extraction_graph_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym5$INSTANCE_COUNT, (SubLObject)information_extraction.ZERO_INTEGER);
        return (SubLObject)information_extraction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4307L)
    public static SubLObject subloop_reserved_initialize_information_extraction_graph_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym7$ISOLATED_P, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym8$INSTANCE_NUMBER, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym40$GRAPH, (SubLObject)information_extraction.$sym43$NAME, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym40$GRAPH, (SubLObject)information_extraction.$sym44$INTEGER_SEQUENCE_GENERATOR, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym40$GRAPH, (SubLObject)information_extraction.$sym45$LABEL_NODE_MAP, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym40$GRAPH, (SubLObject)information_extraction.$sym46$NODES, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym40$GRAPH, (SubLObject)information_extraction.$sym47$LABEL_EDGE_MAP, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym40$GRAPH, (SubLObject)information_extraction.$sym48$EDGES_SOURCE, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym40$GRAPH, (SubLObject)information_extraction.$sym49$EDGES_TARGET, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym40$GRAPH, (SubLObject)information_extraction.$sym50$CORE_NODE_MAP, (SubLObject)information_extraction.NIL);
        return (SubLObject)information_extraction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4307L)
    public static SubLObject information_extraction_graph_p(final SubLObject information_extraction_graph) {
        return classes.subloop_instanceof_class(information_extraction_graph, (SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4543L)
    public static SubLObject information_extraction_graph_initialize_method(final SubLObject self) {
        graph.graph_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 4752L)
    public static SubLObject information_extraction_graph_accept_node_method(final SubLObject self, final SubLObject new_node) {
        return information_extraction_node_p(new_node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 5018L)
    public static SubLObject information_extraction_graph_find_events_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject events = (SubLObject)information_extraction.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(instances.get_slot(self, (SubLObject)information_extraction.$sym46$NODES))); information_extraction.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject node = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject item_var = methods.funcall_instance_method_with_1_args(node, (SubLObject)information_extraction.$sym21$EXTRACT_CYCL, (SubLObject)information_extraction.$list60);
            if (information_extraction.NIL == conses_high.member(item_var, events, Symbols.symbol_function((SubLObject)information_extraction.EQL), Symbols.symbol_function((SubLObject)information_extraction.IDENTITY))) {
                events = (SubLObject)ConsesLow.cons(item_var, events);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return events;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 5232L)
    public static SubLObject new_information_extraction_graph(final SubLObject list) {
        final SubLObject ieg = object.new_class_instance((SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH);
        SubLObject cdolist_list_var = list;
        SubLObject node_list = (SubLObject)information_extraction.NIL;
        node_list = cdolist_list_var.first();
        while (information_extraction.NIL != cdolist_list_var) {
            final SubLObject from_string = node_list.first();
            SubLObject from_node = methods.funcall_instance_method_with_1_args(ieg, (SubLObject)information_extraction.$sym62$GET_NODE_BY_LABEL, from_string);
            final SubLObject to_strings = node_list.rest();
            if (information_extraction.NIL == from_node) {
                from_node = new_information_extraction_node(from_string, (SubLObject)information_extraction.UNPROVIDED);
                methods.funcall_instance_method_with_1_args(ieg, (SubLObject)information_extraction.$sym63$ADD_NODE, from_node);
            }
            SubLObject cdolist_list_var_$1 = to_strings;
            SubLObject to_string = (SubLObject)information_extraction.NIL;
            to_string = cdolist_list_var_$1.first();
            while (information_extraction.NIL != cdolist_list_var_$1) {
                SubLObject to_node = methods.funcall_instance_method_with_1_args(ieg, (SubLObject)information_extraction.$sym62$GET_NODE_BY_LABEL, to_string);
                if (information_extraction.NIL == to_node) {
                    to_node = new_information_extraction_node(to_string, (SubLObject)information_extraction.UNPROVIDED);
                    methods.funcall_instance_method_with_1_args(ieg, (SubLObject)information_extraction.$sym63$ADD_NODE, to_node);
                }
                methods.funcall_instance_method_with_1_args(ieg, (SubLObject)information_extraction.$sym64$ADD_EDGE, methods.funcall_class_method_with_2_args((SubLObject)information_extraction.$sym65$GRAPH_EDGE, (SubLObject)information_extraction.$sym66$MAKE_EDGE, from_node, to_node));
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                to_string = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            node_list = cdolist_list_var.first();
        }
        return ieg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject get_ie_market_position_supports(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, (SubLObject)information_extraction.FIVE_INTEGER, (SubLObject)information_extraction.$sym69$SUPPORTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject set_ie_market_position_supports(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, (SubLObject)information_extraction.FIVE_INTEGER, (SubLObject)information_extraction.$sym69$SUPPORTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject get_ie_market_position_binder(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, (SubLObject)information_extraction.FOUR_INTEGER, (SubLObject)information_extraction.$sym70$BINDER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject set_ie_market_position_binder(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, (SubLObject)information_extraction.FOUR_INTEGER, (SubLObject)information_extraction.$sym70$BINDER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject get_ie_market_position_funds(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, (SubLObject)information_extraction.THREE_INTEGER, (SubLObject)information_extraction.$sym71$FUNDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject set_ie_market_position_funds(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, (SubLObject)information_extraction.THREE_INTEGER, (SubLObject)information_extraction.$sym71$FUNDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject get_ie_market_position_sought(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, (SubLObject)information_extraction.TWO_INTEGER, (SubLObject)information_extraction.$sym72$SOUGHT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject set_ie_market_position_sought(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, (SubLObject)information_extraction.TWO_INTEGER, (SubLObject)information_extraction.$sym72$SOUGHT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject get_ie_market_position_on_sale(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, (SubLObject)information_extraction.ONE_INTEGER, (SubLObject)information_extraction.$sym73$ON_SALE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject set_ie_market_position_on_sale(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, (SubLObject)information_extraction.ONE_INTEGER, (SubLObject)information_extraction.$sym73$ON_SALE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject subloop_reserved_initialize_ie_market_position_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym5$INSTANCE_COUNT, (SubLObject)information_extraction.ZERO_INTEGER);
        return (SubLObject)information_extraction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject subloop_reserved_initialize_ie_market_position_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym7$ISOLATED_P, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym8$INSTANCE_NUMBER, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym67$IE_MARKET_POSITION, (SubLObject)information_extraction.$sym73$ON_SALE, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym67$IE_MARKET_POSITION, (SubLObject)information_extraction.$sym72$SOUGHT, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym67$IE_MARKET_POSITION, (SubLObject)information_extraction.$sym71$FUNDS, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym67$IE_MARKET_POSITION, (SubLObject)information_extraction.$sym70$BINDER, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym67$IE_MARKET_POSITION, (SubLObject)information_extraction.$sym69$SUPPORTS, (SubLObject)information_extraction.NIL);
        return (SubLObject)information_extraction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6257L)
    public static SubLObject ie_market_position_p(final SubLObject ie_market_position) {
        return classes.subloop_instanceof_class(ie_market_position, (SubLObject)information_extraction.$sym67$IE_MARKET_POSITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
    public static SubLObject get_variable_dictionary_dictionary(final SubLObject variable_dictionary) {
        return classes.subloop_get_access_protected_instance_slot(variable_dictionary, (SubLObject)information_extraction.ONE_INTEGER, (SubLObject)information_extraction.$sym78$DICTIONARY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
    public static SubLObject set_variable_dictionary_dictionary(final SubLObject variable_dictionary, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(variable_dictionary, value, (SubLObject)information_extraction.ONE_INTEGER, (SubLObject)information_extraction.$sym78$DICTIONARY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
    public static SubLObject subloop_reserved_initialize_variable_dictionary_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym5$INSTANCE_COUNT, (SubLObject)information_extraction.ZERO_INTEGER);
        return (SubLObject)information_extraction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
    public static SubLObject subloop_reserved_initialize_variable_dictionary_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym7$ISOLATED_P, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.$sym8$INSTANCE_NUMBER, (SubLObject)information_extraction.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$sym78$DICTIONARY, (SubLObject)information_extraction.NIL);
        return (SubLObject)information_extraction.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6464L)
    public static SubLObject variable_dictionary_p(final SubLObject variable_dictionary) {
        return classes.subloop_instanceof_class(variable_dictionary, (SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6607L)
    public static SubLObject variable_dictionary_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6711L)
    public static SubLObject variable_dictionary_keys_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_variable_dictionary_method = (SubLObject)information_extraction.NIL;
        final SubLObject v_dictionary = get_variable_dictionary_dictionary(self);
        try {
            thread.throwStack.push(information_extraction.$sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)information_extraction.$sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, dictionary.dictionary_keys(v_dictionary));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)information_extraction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_variable_dictionary_dictionary(self, v_dictionary);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_variable_dictionary_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)information_extraction.$sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_variable_dictionary_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 6809L)
    public static SubLObject variable_dictionary_find_variable_taxonomic_pred_method(final SubLObject self, final SubLObject var, final SubLObject taxpred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_variable_dictionary_method = (SubLObject)information_extraction.NIL;
        final SubLObject v_dictionary = get_variable_dictionary_dictionary(self);
        try {
            thread.throwStack.push(information_extraction.$sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
            try {
                if (information_extraction.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && information_extraction.NIL == cycl_variables.hl_varP(var) && information_extraction.NIL == cycl_variables.el_varP(var)) {
                    Errors.error((SubLObject)information_extraction.$str92$___S_is_not_a_variable_, var);
                }
                if (information_extraction.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && information_extraction.NIL == conses_high.member(taxpred, (SubLObject)information_extraction.$list93, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED)) {
                    Errors.error((SubLObject)information_extraction.$str94$___S_is_not_a_taxonomic_predicate, taxpred);
                }
                final SubLObject literals = dictionary.dictionary_lookup(v_dictionary, var, (SubLObject)information_extraction.UNPROVIDED);
                SubLObject types = (SubLObject)information_extraction.NIL;
                SubLObject cdolist_list_var = literals;
                SubLObject literal = (SubLObject)information_extraction.NIL;
                literal = cdolist_list_var.first();
                while (information_extraction.NIL != cdolist_list_var) {
                    final SubLObject pred = el_utilities.literal_arg0(literal, (SubLObject)information_extraction.UNPROVIDED);
                    SubLObject type = (SubLObject)information_extraction.NIL;
                    if (taxpred.eql(pred) && var.eql(el_utilities.literal_arg1(literal, (SubLObject)information_extraction.UNPROVIDED))) {
                        type = el_utilities.literal_arg2(literal, (SubLObject)information_extraction.UNPROVIDED);
                    }
                    if (information_extraction.NIL != cycl_variables.hl_varP(type) || information_extraction.NIL != cycl_variables.el_varP(type)) {
                        type = methods.funcall_instance_method_with_2_args(self, (SubLObject)information_extraction.$sym87$FIND_VARIABLE_TAXONOMIC_PRED, type, information_extraction.$const95$genls);
                    }
                    if (information_extraction.NIL != type) {
                        final SubLObject item_var = type;
                        if (information_extraction.NIL == conses_high.member(item_var, types, Symbols.symbol_function((SubLObject)information_extraction.EQL), Symbols.symbol_function((SubLObject)information_extraction.IDENTITY))) {
                            types = (SubLObject)ConsesLow.cons(item_var, types);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    literal = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)information_extraction.$sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, types);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)information_extraction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_variable_dictionary_dictionary(self, v_dictionary);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_variable_dictionary_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)information_extraction.$sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_variable_dictionary_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 7502L)
    public static SubLObject variable_dictionary_pprint_method(final SubLObject self, SubLObject stream) {
        if (stream == information_extraction.UNPROVIDED) {
            stream = (SubLObject)information_extraction.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_variable_dictionary_method = (SubLObject)information_extraction.NIL;
        final SubLObject v_dictionary = get_variable_dictionary_dictionary(self);
        try {
            thread.throwStack.push(information_extraction.$sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
            try {
                dictionary_utilities.print_dictionary_contents(v_dictionary, stream);
                Dynamic.sublisp_throw((SubLObject)information_extraction.$sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)information_extraction.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_variable_dictionary_dictionary(self, v_dictionary);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_variable_dictionary_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)information_extraction.$sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_variable_dictionary_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 7646L)
    public static SubLObject new_variable_dictionary(final SubLObject formula) {
        final SubLObject v_new = object.new_class_instance((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY);
        final SubLObject literals = Functions.apply((SubLObject)information_extraction.$sym102$APPEND, assertions_high.assertion_cnf(formula));
        final SubLObject variables_dict = dictionary.new_dictionary((SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED);
        SubLObject cdolist_list_var = literals;
        SubLObject literal = (SubLObject)information_extraction.NIL;
        literal = cdolist_list_var.first();
        while (information_extraction.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = el_utilities.literal_terms(literal, (SubLObject)information_extraction.UNPROVIDED);
            SubLObject v_term = (SubLObject)information_extraction.NIL;
            v_term = cdolist_list_var_$2.first();
            while (information_extraction.NIL != cdolist_list_var_$2) {
                if (information_extraction.NIL != cycl_variables.hl_varP(v_term) || information_extraction.NIL != cycl_variables.el_varP(v_term)) {
                    dictionary_utilities.dictionary_push(variables_dict, v_term, literal);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                v_term = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        instances.set_slot(v_new, (SubLObject)information_extraction.$sym78$DICTIONARY, variables_dict);
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/information-extraction.lisp", position = 8081L)
    public static SubLObject get_word_graph_connected_path_terms(final SubLObject content_terms, SubLObject corpus) {
        if (corpus == information_extraction.UNPROVIDED) {
            corpus = (SubLObject)information_extraction.NIL;
        }
        assert information_extraction.NIL != Types.consp(content_terms) : content_terms;
        assert information_extraction.NIL != Types.stringp(corpus) : corpus;
        return methods.funcall_instance_method_with_1_args(graph.make_graph_from_string_lists(external_interfaces.get_word_graph(content_terms, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)information_extraction.$str104$index, corpus)), (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED, (SubLObject)information_extraction.UNPROVIDED)), (SubLObject)information_extraction.$sym105$GET_PATH_LABELS, content_terms);
    }
    
    public static SubLObject declare_information_extraction_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "get_information_extraction_node_cycl_denotations", "GET-INFORMATION-EXTRACTION-NODE-CYCL-DENOTATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "set_information_extraction_node_cycl_denotations", "SET-INFORMATION-EXTRACTION-NODE-CYCL-DENOTATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "subloop_reserved_initialize_information_extraction_node_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "subloop_reserved_initialize_information_extraction_node_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "information_extraction_node_p", "INFORMATION-EXTRACTION-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "information_extraction_node_initialize_method", "INFORMATION-EXTRACTION-NODE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "information_extraction_node_cycl_denots_method", "INFORMATION-EXTRACTION-NODE-CYCL-DENOTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "information_extraction_node_extract_cycl_method", "INFORMATION-EXTRACTION-NODE-EXTRACT-CYCL-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "information_extraction_node_print_method", "INFORMATION-EXTRACTION-NODE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "new_information_extraction_node", "NEW-INFORMATION-EXTRACTION-NODE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "subloop_reserved_initialize_information_extraction_graph_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "subloop_reserved_initialize_information_extraction_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "information_extraction_graph_p", "INFORMATION-EXTRACTION-GRAPH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "information_extraction_graph_initialize_method", "INFORMATION-EXTRACTION-GRAPH-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "information_extraction_graph_accept_node_method", "INFORMATION-EXTRACTION-GRAPH-ACCEPT-NODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "information_extraction_graph_find_events_method", "INFORMATION-EXTRACTION-GRAPH-FIND-EVENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "new_information_extraction_graph", "NEW-INFORMATION-EXTRACTION-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "get_ie_market_position_supports", "GET-IE-MARKET-POSITION-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "set_ie_market_position_supports", "SET-IE-MARKET-POSITION-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "get_ie_market_position_binder", "GET-IE-MARKET-POSITION-BINDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "set_ie_market_position_binder", "SET-IE-MARKET-POSITION-BINDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "get_ie_market_position_funds", "GET-IE-MARKET-POSITION-FUNDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "set_ie_market_position_funds", "SET-IE-MARKET-POSITION-FUNDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "get_ie_market_position_sought", "GET-IE-MARKET-POSITION-SOUGHT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "set_ie_market_position_sought", "SET-IE-MARKET-POSITION-SOUGHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "get_ie_market_position_on_sale", "GET-IE-MARKET-POSITION-ON-SALE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "set_ie_market_position_on_sale", "SET-IE-MARKET-POSITION-ON-SALE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "subloop_reserved_initialize_ie_market_position_class", "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "subloop_reserved_initialize_ie_market_position_instance", "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "ie_market_position_p", "IE-MARKET-POSITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "get_variable_dictionary_dictionary", "GET-VARIABLE-DICTIONARY-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "set_variable_dictionary_dictionary", "SET-VARIABLE-DICTIONARY-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "subloop_reserved_initialize_variable_dictionary_class", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "subloop_reserved_initialize_variable_dictionary_instance", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "variable_dictionary_p", "VARIABLE-DICTIONARY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "variable_dictionary_initialize_method", "VARIABLE-DICTIONARY-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "variable_dictionary_keys_method", "VARIABLE-DICTIONARY-KEYS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "variable_dictionary_find_variable_taxonomic_pred_method", "VARIABLE-DICTIONARY-FIND-VARIABLE-TAXONOMIC-PRED-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "variable_dictionary_pprint_method", "VARIABLE-DICTIONARY-PPRINT-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "new_variable_dictionary", "NEW-VARIABLE-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.information_extraction", "get_word_graph_connected_path_terms", "GET-WORD-GRAPH-CONNECTED-PATH-TERMS", 1, 1, false);
        return (SubLObject)information_extraction.NIL;
    }
    
    public static SubLObject init_information_extraction_file() {
        return (SubLObject)information_extraction.NIL;
    }
    
    public static SubLObject setup_information_extraction_file() {
        classes.subloop_new_class((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$sym1$GRAPH_NODE, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$sym6$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$sym12$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_INSTANCE);
        subloop_reserved_initialize_information_extraction_node_class((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym13$INITIALIZE, (SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$list14, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list15);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$sym13$INITIALIZE, (SubLObject)information_extraction.$sym16$INFORMATION_EXTRACTION_NODE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym17$CYCL_DENOTS, (SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$list14, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list18);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$sym17$CYCL_DENOTS, (SubLObject)information_extraction.$sym20$INFORMATION_EXTRACTION_NODE_CYCL_DENOTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym21$EXTRACT_CYCL, (SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$list22, (SubLObject)information_extraction.$list23, (SubLObject)information_extraction.$list24);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$sym21$EXTRACT_CYCL, (SubLObject)information_extraction.$sym27$INFORMATION_EXTRACTION_NODE_EXTRACT_CYCL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym28$PRINT, (SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$list14, (SubLObject)information_extraction.$list29, (SubLObject)information_extraction.$list30);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym0$INFORMATION_EXTRACTION_NODE, (SubLObject)information_extraction.$sym28$PRINT, (SubLObject)information_extraction.$sym35$INFORMATION_EXTRACTION_NODE_PRINT_METHOD);
        classes.subloop_new_class((SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.$sym40$GRAPH, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list41);
        classes.class_set_implements_slot_listeners((SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.$sym42$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.$sym51$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_INSTANCE);
        subloop_reserved_initialize_information_extraction_graph_class((SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym13$INITIALIZE, (SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.$list14, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list52);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.$sym13$INITIALIZE, (SubLObject)information_extraction.$sym53$INFORMATION_EXTRACTION_GRAPH_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym54$ACCEPT_NODE, (SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.$list14, (SubLObject)information_extraction.$list55, (SubLObject)information_extraction.$list56);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.$sym54$ACCEPT_NODE, (SubLObject)information_extraction.$sym57$INFORMATION_EXTRACTION_GRAPH_ACCEPT_NODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym58$FIND_EVENTS, (SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.$list14, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list59);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym39$INFORMATION_EXTRACTION_GRAPH, (SubLObject)information_extraction.$sym58$FIND_EVENTS, (SubLObject)information_extraction.$sym61$INFORMATION_EXTRACTION_GRAPH_FIND_EVENTS_METHOD);
        classes.subloop_new_class((SubLObject)information_extraction.$sym67$IE_MARKET_POSITION, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list68);
        classes.class_set_implements_slot_listeners((SubLObject)information_extraction.$sym67$IE_MARKET_POSITION, (SubLObject)information_extraction.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)information_extraction.$sym67$IE_MARKET_POSITION, (SubLObject)information_extraction.$sym74$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)information_extraction.$sym67$IE_MARKET_POSITION, (SubLObject)information_extraction.$sym75$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_INSTANCE);
        subloop_reserved_initialize_ie_market_position_class((SubLObject)information_extraction.$sym67$IE_MARKET_POSITION);
        classes.subloop_new_class((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$sym4$OBJECT, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list77);
        classes.class_set_implements_slot_listeners((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$sym79$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$sym80$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_INSTANCE);
        subloop_reserved_initialize_variable_dictionary_class((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym13$INITIALIZE, (SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$list14, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list81);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$sym13$INITIALIZE, (SubLObject)information_extraction.$sym82$VARIABLE_DICTIONARY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym83$KEYS, (SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$list22, (SubLObject)information_extraction.NIL, (SubLObject)information_extraction.$list84);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$sym83$KEYS, (SubLObject)information_extraction.$sym86$VARIABLE_DICTIONARY_KEYS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym87$FIND_VARIABLE_TAXONOMIC_PRED, (SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$list88, (SubLObject)information_extraction.$list89, (SubLObject)information_extraction.$list90);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$sym87$FIND_VARIABLE_TAXONOMIC_PRED, (SubLObject)information_extraction.$sym96$VARIABLE_DICTIONARY_FIND_VARIABLE_TAXONOMIC_PRED_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)information_extraction.$sym97$PPRINT, (SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$list22, (SubLObject)information_extraction.$list98, (SubLObject)information_extraction.$list99);
        methods.subloop_register_instance_method((SubLObject)information_extraction.$sym76$VARIABLE_DICTIONARY, (SubLObject)information_extraction.$sym97$PPRINT, (SubLObject)information_extraction.$sym101$VARIABLE_DICTIONARY_PPRINT_METHOD);
        return (SubLObject)information_extraction.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_information_extraction_file();
    }
    
    @Override
	public void initializeVariables() {
        init_information_extraction_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_information_extraction_file();
    }
    
    static {
        me = (SubLFile)new information_extraction();
        $sym0$INFORMATION_EXTRACTION_NODE = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-NODE");
        $sym1$GRAPH_NODE = SubLObjectFactory.makeSymbol("GRAPH-NODE");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPUTE-CYCL-DENOTS"), (SubLObject)information_extraction.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-CYCL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)information_extraction.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym3$CYCL_DENOTATIONS = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS");
        $sym4$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym5$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym6$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-CLASS");
        $sym7$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym8$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym9$CORE = SubLObjectFactory.makeSymbol("CORE");
        $sym10$ID = SubLObjectFactory.makeSymbol("ID");
        $sym11$LABEL = SubLObjectFactory.makeSymbol("LABEL");
        $sym12$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-INSTANCE");
        $sym13$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return information-extraction-node-p\n   Crates a new information-extraction-node object"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym16$INFORMATION_EXTRACTION_NODE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-NODE-INITIALIZE-METHOD");
        $sym17$CYCL_DENOTS = SubLObjectFactory.makeSymbol("CYCL-DENOTS");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp\n   Returns a list of Cyc denotations of the label of this node, if any."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ALL-DENOTS-OF-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS")));
        $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD");
        $sym20$INFORMATION_EXTRACTION_NODE_CYCL_DENOTS_METHOD = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-NODE-CYCL-DENOTS-METHOD");
        $sym21$EXTRACT_CYCL = SubLObjectFactory.makeSymbol("EXTRACT-CYCL");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERS"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param FILTERS listp, expected to be a list of fort-p\n   @return listp\n   Returns all the elements of this node's cycl-denotations slot which are subsumed\n   by all the elements of FILTERS."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE-IF-PRESENT"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED"), (SubLObject)information_extraction.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MORE-SPECIFIC-P"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("FILTER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED"))));
        $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD");
        $sym26$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym27$INFORMATION_EXTRACTION_NODE_EXTRACT_CYCL_METHOD = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-NODE-EXTRACT-CYCL-METHOD");
        $sym28$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STREAM streamp\n   @param DEPTH integerp\n   Prints this INFORMATION-EXTRACTION-NODE to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<IEN: "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(" -> "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-DENOTATIONS")), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(">"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")));
        $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD");
        $str32$__IEN__ = SubLObjectFactory.makeString("#<IEN: ");
        $str33$____ = SubLObjectFactory.makeString(" -> ");
        $str34$_ = SubLObjectFactory.makeString(">");
        $sym35$INFORMATION_EXTRACTION_NODE_PRINT_METHOD = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-NODE-PRINT-METHOD");
        $sym36$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym37$SET_LABEL = SubLObjectFactory.makeSymbol("SET-LABEL");
        $sym38$SET_ID = SubLObjectFactory.makeSymbol("SET-ID");
        $sym39$INFORMATION_EXTRACTION_GRAPH = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-GRAPH");
        $sym40$GRAPH = SubLObjectFactory.makeSymbol("GRAPH");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPT-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)information_extraction.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym42$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-CLASS");
        $sym43$NAME = SubLObjectFactory.makeSymbol("NAME");
        $sym44$INTEGER_SEQUENCE_GENERATOR = SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR");
        $sym45$LABEL_NODE_MAP = SubLObjectFactory.makeSymbol("LABEL-NODE-MAP");
        $sym46$NODES = SubLObjectFactory.makeSymbol("NODES");
        $sym47$LABEL_EDGE_MAP = SubLObjectFactory.makeSymbol("LABEL-EDGE-MAP");
        $sym48$EDGES_SOURCE = SubLObjectFactory.makeSymbol("EDGES-SOURCE");
        $sym49$EDGES_TARGET = SubLObjectFactory.makeSymbol("EDGES-TARGET");
        $sym50$CORE_NODE_MAP = SubLObjectFactory.makeSymbol("CORE-NODE-MAP");
        $sym51$SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-INSTANCE");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return information-extraction-graph-p\n   Returns a new information-extraction-graph object"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym53$INFORMATION_EXTRACTION_GRAPH_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-GRAPH-INITIALIZE-METHOD");
        $sym54$ACCEPT_NODE = SubLObjectFactory.makeSymbol("ACCEPT-NODE");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-NODE information-extraction-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph, NIL otherwise."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-NODE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"))));
        $sym57$INFORMATION_EXTRACTION_GRAPH_ACCEPT_NODE_METHOD = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-GRAPH-ACCEPT-NODE-METHOD");
        $sym58$FIND_EVENTS = SubLObjectFactory.makeSymbol("FIND-EVENTS");
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVENTS"), (SubLObject)information_extraction.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-GRAPH-NODES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-CYCL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Event"))))), (SubLObject)SubLObjectFactory.makeSymbol("EVENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("EVENTS"))));
        $list60 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Event")));
        $sym61$INFORMATION_EXTRACTION_GRAPH_FIND_EVENTS_METHOD = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-GRAPH-FIND-EVENTS-METHOD");
        $sym62$GET_NODE_BY_LABEL = SubLObjectFactory.makeSymbol("GET-NODE-BY-LABEL");
        $sym63$ADD_NODE = SubLObjectFactory.makeSymbol("ADD-NODE");
        $sym64$ADD_EDGE = SubLObjectFactory.makeSymbol("ADD-EDGE");
        $sym65$GRAPH_EDGE = SubLObjectFactory.makeSymbol("GRAPH-EDGE");
        $sym66$MAKE_EDGE = SubLObjectFactory.makeSymbol("MAKE-EDGE");
        $sym67$IE_MARKET_POSITION = SubLObjectFactory.makeSymbol("IE-MARKET-POSITION");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ON-SALE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOUGHT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNDS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym69$SUPPORTS = SubLObjectFactory.makeSymbol("SUPPORTS");
        $sym70$BINDER = SubLObjectFactory.makeSymbol("BINDER");
        $sym71$FUNDS = SubLObjectFactory.makeSymbol("FUNDS");
        $sym72$SOUGHT = SubLObjectFactory.makeSymbol("SOUGHT");
        $sym73$ON_SALE = SubLObjectFactory.makeSymbol("ON-SALE");
        $sym74$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-CLASS");
        $sym75$SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-INSTANCE");
        $sym76$VARIABLE_DICTIONARY = SubLObjectFactory.makeSymbol("VARIABLE-DICTIONARY");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)information_extraction.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym78$DICTIONARY = SubLObjectFactory.makeSymbol("DICTIONARY");
        $sym79$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-CLASS");
        $sym80$SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-INSTANCE");
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym82$VARIABLE_DICTIONARY_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("VARIABLE-DICTIONARY-INITIALIZE-METHOD");
        $sym83$KEYS = SubLObjectFactory.makeSymbol("KEYS");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"))));
        $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD");
        $sym86$VARIABLE_DICTIONARY_KEYS_METHOD = SubLObjectFactory.makeSymbol("VARIABLE-DICTIONARY-KEYS-METHOD");
        $sym87$FIND_VARIABLE_TAXONOMIC_PRED = SubLObjectFactory.makeSymbol("FIND-VARIABLE-TAXONOMIC-PRED");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TAXPRED"));
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-VAR?"), (SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"))), (SubLObject)SubLObjectFactory.makeString("~%~S is not a variable!"), (SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TAXPRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))))), (SubLObject)SubLObjectFactory.makeString("~%~S is not a taxonomic predicate!"), (SubLObject)SubLObjectFactory.makeSymbol("TAXPRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPES"), (SubLObject)information_extraction.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL-ARG0"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)information_extraction.EQL, (SubLObject)SubLObjectFactory.makeSymbol("TAXPRED"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)information_extraction.EQL, (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-VAR?"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR?"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-VARIABLE-TAXONOMIC-PRED")), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TYPES"))));
        $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD");
        $str92$___S_is_not_a_variable_ = SubLObjectFactory.makeString("~%~S is not a variable!");
        $list93 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $str94$___S_is_not_a_taxonomic_predicate = SubLObjectFactory.makeString("~%~S is not a taxonomic predicate!");
        $const95$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym96$VARIABLE_DICTIONARY_FIND_VARIABLE_TAXONOMIC_PRED_METHOD = SubLObjectFactory.makeSymbol("VARIABLE-DICTIONARY-FIND-VARIABLE-TAXONOMIC-PRED-METHOD");
        $sym97$PPRINT = SubLObjectFactory.makeSymbol("PPRINT");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)information_extraction.T));
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT-DICTIONARY-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD");
        $sym101$VARIABLE_DICTIONARY_PPRINT_METHOD = SubLObjectFactory.makeSymbol("VARIABLE-DICTIONARY-PPRINT-METHOD");
        $sym102$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym103$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $str104$index = SubLObjectFactory.makeString("index");
        $sym105$GET_PATH_LABELS = SubLObjectFactory.makeSymbol("GET-PATH-LABELS");
    }
}

/*

	Total time: 285 ms
	 synthetic 
*/