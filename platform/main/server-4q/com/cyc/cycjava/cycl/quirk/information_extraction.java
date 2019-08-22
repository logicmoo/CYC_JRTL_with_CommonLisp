package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.nl_trie_accessors;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class information_extraction extends SubLTranslatedFile {
    public static final SubLFile me = new information_extraction();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.information_extraction";

    public static final String myFingerPrint = "21aa4a9da8a124b9b89ee6b092981ef91e926c360d467381a74a8737c2c657b6";

    // Internal Constants
    public static final SubLSymbol INFORMATION_EXTRACTION_NODE = makeSymbol("INFORMATION-EXTRACTION-NODE");

    public static final SubLSymbol GRAPH_NODE = makeSymbol("GRAPH-NODE");

    public static final SubLList $list2 = list(list(makeSymbol("CYCL-DENOTATIONS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-CYCL-DENOTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT-CYCL"), list(makeSymbol("FILTERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));







    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-CLASS");











    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-INSTANCE");



    public static final SubLList $list14 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list15 = list(makeString("@return information-extraction-node-p\n   Crates a new information-extraction-node object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol INFORMATION_EXTRACTION_NODE_INITIALIZE_METHOD = makeSymbol("INFORMATION-EXTRACTION-NODE-INITIALIZE-METHOD");

    public static final SubLSymbol CYCL_DENOTS = makeSymbol("CYCL-DENOTS");

    public static final SubLList $list18 = list(makeString("@return listp\n   Returns a list of Cyc denotations of the label of this node, if any."), list(makeSymbol("PWHEN"), makeSymbol("CYCL-DENOTATIONS"), list(makeSymbol("RET"), makeSymbol("CYCL-DENOTATIONS"))), list(makeSymbol("PWHEN"), makeSymbol("LABEL"), list(makeSymbol("CSETQ"), makeSymbol("CYCL-DENOTATIONS"), list(makeSymbol("NL-TRIE-ALL-DENOTS-OF-STRING"), makeSymbol("LABEL")))), list(makeSymbol("RET"), makeSymbol("CYCL-DENOTATIONS")));

    public static final SubLSymbol $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD");

    public static final SubLSymbol INFORMATION_EXTRACTION_NODE_CYCL_DENOTS_METHOD = makeSymbol("INFORMATION-EXTRACTION-NODE-CYCL-DENOTS-METHOD");

    public static final SubLSymbol EXTRACT_CYCL = makeSymbol("EXTRACT-CYCL");

    public static final SubLList $list22 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list23 = list(makeSymbol("&OPTIONAL"), makeSymbol("FILTERS"));

    public static final SubLList $list24 = list(makeString("@param FILTERS listp, expected to be a list of fort-p\n   @return listp\n   Returns all the elements of this node\'s cycl-denotations slot which are subsumed\n   by all the elements of FILTERS."), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("FILTERS"), makeSymbol("LISTP")), list(makeSymbol("PUNLESS"), makeSymbol("FILTERS"), list(makeSymbol("RET"), makeSymbol("CYCL-DENOTATIONS"))), list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TERM"), makeSymbol("CYCL-DENOTATIONS")), list(makeSymbol("CLET"), list(makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("FILTER"), makeSymbol("FILTERS"), makeSymbol("FAIL")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(makeSymbol("CNOT"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), makeSymbol("FILTER"))))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("TERM"), makeSymbol("FILTERED"))))), list(makeSymbol("RET"), makeSymbol("FILTERED"))));

    public static final SubLSymbol $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD");



    public static final SubLSymbol INFORMATION_EXTRACTION_NODE_EXTRACT_CYCL_METHOD = makeSymbol("INFORMATION-EXTRACTION-NODE-EXTRACT-CYCL-METHOD");



    public static final SubLList $list29 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list30 = list(makeString("@param STREAM streamp\n   @param DEPTH integerp\n   Prints this INFORMATION-EXTRACTION-NODE to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<IEN: "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("LABEL"), makeSymbol("STREAM")), list(makeSymbol("PWHEN"), makeSymbol("CYCL-DENOTATIONS"), list(makeSymbol("WRITE-STRING"), makeString(" -> "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), list(makeSymbol("PRIN1-TO-STRING"), makeSymbol("CYCL-DENOTATIONS")), makeSymbol("STREAM"))), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")));

    public static final SubLSymbol $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD");

    public static final SubLString $str32$__IEN__ = makeString("#<IEN: ");

    public static final SubLString $str33$____ = makeString(" -> ");

    public static final SubLString $str34$_ = makeString(">");

    public static final SubLSymbol INFORMATION_EXTRACTION_NODE_PRINT_METHOD = makeSymbol("INFORMATION-EXTRACTION-NODE-PRINT-METHOD");



    public static final SubLSymbol SET_LABEL = makeSymbol("SET-LABEL");

    public static final SubLSymbol SET_ID = makeSymbol("SET-ID");

    public static final SubLSymbol INFORMATION_EXTRACTION_GRAPH = makeSymbol("INFORMATION-EXTRACTION-GRAPH");



    public static final SubLList $list41 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACCEPT-NODE"), list(makeSymbol("NEW-NODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-CLASS");



    public static final SubLSymbol INTEGER_SEQUENCE_GENERATOR = makeSymbol("INTEGER-SEQUENCE-GENERATOR");

    public static final SubLSymbol LABEL_NODE_MAP = makeSymbol("LABEL-NODE-MAP");



    public static final SubLSymbol LABEL_EDGE_MAP = makeSymbol("LABEL-EDGE-MAP");





    public static final SubLSymbol CORE_NODE_MAP = makeSymbol("CORE-NODE-MAP");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-INSTANCE");

    public static final SubLList $list52 = list(makeString("@return information-extraction-graph-p\n   Returns a new information-extraction-graph object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol INFORMATION_EXTRACTION_GRAPH_INITIALIZE_METHOD = makeSymbol("INFORMATION-EXTRACTION-GRAPH-INITIALIZE-METHOD");

    public static final SubLSymbol ACCEPT_NODE = makeSymbol("ACCEPT-NODE");

    public static final SubLList $list55 = list(makeSymbol("NEW-NODE"));

    public static final SubLList $list56 = list(makeString("@param NEW-NODE information-extraction-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph, NIL otherwise."), list(makeSymbol("RET"), list(makeSymbol("INFORMATION-EXTRACTION-NODE-P"), makeSymbol("NEW-NODE"))));

    public static final SubLSymbol INFORMATION_EXTRACTION_GRAPH_ACCEPT_NODE_METHOD = makeSymbol("INFORMATION-EXTRACTION-GRAPH-ACCEPT-NODE-METHOD");

    public static final SubLSymbol FIND_EVENTS = makeSymbol("FIND-EVENTS");

    public static final SubLList $list59 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EVENTS"), NIL)), list(makeSymbol("DO-GRAPH-NODES"), list(makeSymbol("NODE"), makeSymbol("SELF")), list(makeSymbol("CPUSHNEW"), list(makeSymbol("FIM"), makeSymbol("NODE"), list(makeSymbol("QUOTE"), makeSymbol("EXTRACT-CYCL")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Event"))))), makeSymbol("EVENTS"))), list(makeSymbol("RET"), makeSymbol("EVENTS"))));

    public static final SubLList $list60 = list(reader_make_constant_shell(makeString("Event")));

    public static final SubLSymbol INFORMATION_EXTRACTION_GRAPH_FIND_EVENTS_METHOD = makeSymbol("INFORMATION-EXTRACTION-GRAPH-FIND-EVENTS-METHOD");

    public static final SubLSymbol GET_NODE_BY_LABEL = makeSymbol("GET-NODE-BY-LABEL");

    public static final SubLSymbol ADD_NODE = makeSymbol("ADD-NODE");

    public static final SubLSymbol ADD_EDGE = makeSymbol("ADD-EDGE");

    public static final SubLSymbol GRAPH_EDGE = makeSymbol("GRAPH-EDGE");

    public static final SubLSymbol MAKE_EDGE = makeSymbol("MAKE-EDGE");

    public static final SubLSymbol IE_MARKET_POSITION = makeSymbol("IE-MARKET-POSITION");

    public static final SubLList $list68 = list(list(makeSymbol("ON-SALE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SOUGHT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("FUNDS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("BINDER"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SUPPORTS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")));



    public static final SubLSymbol BINDER = makeSymbol("BINDER");

    public static final SubLSymbol FUNDS = makeSymbol("FUNDS");

    public static final SubLSymbol SOUGHT = makeSymbol("SOUGHT");

    public static final SubLSymbol ON_SALE = makeSymbol("ON-SALE");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-INSTANCE");

    public static final SubLSymbol VARIABLE_DICTIONARY = makeSymbol("VARIABLE-DICTIONARY");

    public static final SubLList $list77 = list(list(makeSymbol("DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-INSTANCE");

    public static final SubLList $list81 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol VARIABLE_DICTIONARY_INITIALIZE_METHOD = makeSymbol("VARIABLE-DICTIONARY-INITIALIZE-METHOD");



    public static final SubLList $list84 = list(list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-KEYS"), makeSymbol("DICTIONARY"))));

    public static final SubLSymbol $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD");

    public static final SubLSymbol VARIABLE_DICTIONARY_KEYS_METHOD = makeSymbol("VARIABLE-DICTIONARY-KEYS-METHOD");

    public static final SubLSymbol FIND_VARIABLE_TAXONOMIC_PRED = makeSymbol("FIND-VARIABLE-TAXONOMIC-PRED");

    public static final SubLList $list88 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list89 = list(makeSymbol("VAR"), makeSymbol("TAXPRED"));

    public static final SubLList $list90 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("HL-VAR?"), makeSymbol("VAR")), list(makeSymbol("EL-VAR?"), makeSymbol("VAR"))), makeString("~%~S is not a variable!"), makeSymbol("VAR")), list(makeSymbol("MUST"), list(makeSymbol("MEMBER"), makeSymbol("TAXPRED"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls"))))), makeString("~%~S is not a taxonomic predicate!"), makeSymbol("TAXPRED")), list(makeSymbol("CLET"), list(list(makeSymbol("LITERALS"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY"), makeSymbol("VAR"))), list(makeSymbol("TYPES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("LITERAL"), makeSymbol("LITERALS")), list(makeSymbol("CLET"), list(list(makeSymbol("PRED"), list(makeSymbol("LITERAL-ARG0"), makeSymbol("LITERAL"))), makeSymbol("TYPE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(EQL, makeSymbol("TAXPRED"), makeSymbol("PRED")), list(EQL, makeSymbol("VAR"), list(makeSymbol("LITERAL-ARG1"), makeSymbol("LITERAL")))), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), list(makeSymbol("LITERAL-ARG2"), makeSymbol("LITERAL")))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("HL-VAR?"), makeSymbol("TYPE")), list(makeSymbol("EL-VAR?"), makeSymbol("TYPE"))), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FIND-VARIABLE-TAXONOMIC-PRED")), makeSymbol("TYPE"), reader_make_constant_shell(makeString("genls"))))), list(makeSymbol("PWHEN"), makeSymbol("TYPE"), list(makeSymbol("CPUSHNEW"), makeSymbol("TYPE"), makeSymbol("TYPES"))))), list(makeSymbol("RET"), makeSymbol("TYPES"))));

    public static final SubLSymbol $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD");

    public static final SubLString $str92$___S_is_not_a_variable_ = makeString("~%~S is not a variable!");

    public static final SubLList $list93 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));

    public static final SubLString $str94$___S_is_not_a_taxonomic_predicate = makeString("~%~S is not a taxonomic predicate!");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLSymbol VARIABLE_DICTIONARY_FIND_VARIABLE_TAXONOMIC_PRED_METHOD = makeSymbol("VARIABLE-DICTIONARY-FIND-VARIABLE-TAXONOMIC-PRED-METHOD");

    public static final SubLSymbol PPRINT = makeSymbol("PPRINT");

    public static final SubLList $list98 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T));

    public static final SubLList $list99 = list(list(makeSymbol("PRINT-DICTIONARY-CONTENTS"), makeSymbol("DICTIONARY"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD");

    public static final SubLSymbol VARIABLE_DICTIONARY_PPRINT_METHOD = makeSymbol("VARIABLE-DICTIONARY-PPRINT-METHOD");





    public static final SubLString $$$index = makeString("index");

    public static final SubLSymbol GET_PATH_LABELS = makeSymbol("GET-PATH-LABELS");

    public static SubLObject get_information_extraction_node_cycl_denotations(final SubLObject information_extraction_node) {
        return classes.subloop_get_access_protected_instance_slot(information_extraction_node, FOUR_INTEGER, CYCL_DENOTATIONS);
    }

    public static SubLObject set_information_extraction_node_cycl_denotations(final SubLObject information_extraction_node, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(information_extraction_node, value, FOUR_INTEGER, CYCL_DENOTATIONS);
    }

    public static SubLObject subloop_reserved_initialize_information_extraction_node_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_information_extraction_node_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, CORE, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, ID, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, LABEL, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_EXTRACTION_NODE, CYCL_DENOTATIONS, NIL);
        return NIL;
    }

    public static SubLObject information_extraction_node_p(final SubLObject information_extraction_node) {
        return classes.subloop_instanceof_class(information_extraction_node, INFORMATION_EXTRACTION_NODE);
    }

    public static SubLObject information_extraction_node_initialize_method(final SubLObject self) {
        graph.graph_node_initialize_method(self);
        return self;
    }

    public static SubLObject information_extraction_node_cycl_denots_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_information_extraction_node_method = NIL;
        SubLObject cycl_denotations = get_information_extraction_node_cycl_denotations(self);
        final SubLObject label = graph.get_graph_node_label(self);
        try {
            thread.throwStack.push($sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
            try {
                if (NIL != cycl_denotations) {
                    sublisp_throw($sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations);
                }
                if (NIL != label) {
                    cycl_denotations = nl_trie_accessors.nl_trie_all_denots_of_string(label, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                sublisp_throw($sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_information_extraction_node_cycl_denotations(self, cycl_denotations);
                    graph.set_graph_node_label(self, label);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_information_extraction_node_method = Errors.handleThrowable(ccatch_env_var, $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_information_extraction_node_method;
    }

    public static SubLObject information_extraction_node_extract_cycl_method(final SubLObject self, SubLObject filters) {
        if (filters == UNPROVIDED) {
            filters = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_information_extraction_node_method = NIL;
        final SubLObject cycl_denotations = get_information_extraction_node_cycl_denotations(self);
        try {
            thread.throwStack.push($sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
            try {
                if (((NIL != filters) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == listp(filters))) {
                    throw new AssertionError(filters);
                }
                if (NIL == filters) {
                    sublisp_throw($sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations);
                }
                SubLObject filtered = NIL;
                SubLObject cdolist_list_var = cycl_denotations;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject fail = NIL;
                    if (NIL == fail) {
                        SubLObject csome_list_var;
                        SubLObject filter;
                        for (csome_list_var = filters, filter = NIL, filter = csome_list_var.first(); (NIL == fail) && (NIL != csome_list_var); fail = makeBoolean(NIL == at_utilities.more_specific_p(v_term, filter, UNPROVIDED)) , csome_list_var = csome_list_var.rest() , filter = csome_list_var.first()) {
                        }
                    }
                    if (NIL == fail) {
                        filtered = cons(v_term, filtered);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
                sublisp_throw($sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, filtered);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_information_extraction_node_cycl_denotations(self, cycl_denotations);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_information_extraction_node_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_information_extraction_node_method;
    }

    public static SubLObject information_extraction_node_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_information_extraction_node_method = NIL;
        final SubLObject cycl_denotations = get_information_extraction_node_cycl_denotations(self);
        final SubLObject label = graph.get_graph_node_label(self);
        try {
            thread.throwStack.push($sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
            try {
                write_string($str32$__IEN__, stream, UNPROVIDED, UNPROVIDED);
                write_string(label, stream, UNPROVIDED, UNPROVIDED);
                if (NIL != cycl_denotations) {
                    write_string($str33$____, stream, UNPROVIDED, UNPROVIDED);
                    write_string(prin1_to_string(cycl_denotations), stream, UNPROVIDED, UNPROVIDED);
                }
                write_string($str34$_, stream, UNPROVIDED, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_information_extraction_node_cycl_denotations(self, cycl_denotations);
                    graph.set_graph_node_label(self, label);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_information_extraction_node_method = Errors.handleThrowable(ccatch_env_var, $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_information_extraction_node_method;
    }

    public static SubLObject new_information_extraction_node(final SubLObject label, SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        assert NIL != stringp(label) : "Types.stringp(label) " + "CommonSymbols.NIL != Types.stringp(label) " + label;
        final SubLObject node = object.new_class_instance(INFORMATION_EXTRACTION_NODE);
        methods.funcall_instance_method_with_1_args(node, SET_LABEL, label);
        methods.funcall_instance_method_with_0_args(node, CYCL_DENOTS);
        if (NIL != id) {
            methods.funcall_instance_method_with_1_args(node, SET_ID, id);
        }
        return node;
    }

    public static SubLObject subloop_reserved_initialize_information_extraction_graph_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_information_extraction_graph_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH, INTEGER_SEQUENCE_GENERATOR, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH, LABEL_NODE_MAP, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH, NODES, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH, LABEL_EDGE_MAP, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH, EDGES_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH, EDGES_TARGET, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH, CORE_NODE_MAP, NIL);
        return NIL;
    }

    public static SubLObject information_extraction_graph_p(final SubLObject information_extraction_graph) {
        return classes.subloop_instanceof_class(information_extraction_graph, INFORMATION_EXTRACTION_GRAPH);
    }

    public static SubLObject information_extraction_graph_initialize_method(final SubLObject self) {
        graph.graph_initialize_method(self);
        return self;
    }

    public static SubLObject information_extraction_graph_accept_node_method(final SubLObject self, final SubLObject new_node) {
        return information_extraction_node_p(new_node);
    }

    public static SubLObject information_extraction_graph_find_events_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject events = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(instances.get_slot(self, NODES))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject node = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject item_var = methods.funcall_instance_method_with_1_args(node, EXTRACT_CYCL, $list60);
            if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                events = cons(item_var, events);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return events;
    }

    public static SubLObject new_information_extraction_graph(final SubLObject list) {
        final SubLObject ieg = object.new_class_instance(INFORMATION_EXTRACTION_GRAPH);
        SubLObject cdolist_list_var = list;
        SubLObject node_list = NIL;
        node_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject from_string = node_list.first();
            SubLObject from_node = methods.funcall_instance_method_with_1_args(ieg, GET_NODE_BY_LABEL, from_string);
            final SubLObject to_strings = node_list.rest();
            if (NIL == from_node) {
                from_node = new_information_extraction_node(from_string, UNPROVIDED);
                methods.funcall_instance_method_with_1_args(ieg, ADD_NODE, from_node);
            }
            SubLObject cdolist_list_var_$1 = to_strings;
            SubLObject to_string = NIL;
            to_string = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                SubLObject to_node = methods.funcall_instance_method_with_1_args(ieg, GET_NODE_BY_LABEL, to_string);
                if (NIL == to_node) {
                    to_node = new_information_extraction_node(to_string, UNPROVIDED);
                    methods.funcall_instance_method_with_1_args(ieg, ADD_NODE, to_node);
                }
                methods.funcall_instance_method_with_1_args(ieg, ADD_EDGE, methods.funcall_class_method_with_2_args(GRAPH_EDGE, MAKE_EDGE, from_node, to_node));
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                to_string = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            node_list = cdolist_list_var.first();
        } 
        return ieg;
    }

    public static SubLObject get_ie_market_position_supports(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, FIVE_INTEGER, SUPPORTS);
    }

    public static SubLObject set_ie_market_position_supports(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, FIVE_INTEGER, SUPPORTS);
    }

    public static SubLObject get_ie_market_position_binder(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, FOUR_INTEGER, BINDER);
    }

    public static SubLObject set_ie_market_position_binder(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, FOUR_INTEGER, BINDER);
    }

    public static SubLObject get_ie_market_position_funds(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, THREE_INTEGER, FUNDS);
    }

    public static SubLObject set_ie_market_position_funds(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, THREE_INTEGER, FUNDS);
    }

    public static SubLObject get_ie_market_position_sought(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, TWO_INTEGER, SOUGHT);
    }

    public static SubLObject set_ie_market_position_sought(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, TWO_INTEGER, SOUGHT);
    }

    public static SubLObject get_ie_market_position_on_sale(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, ONE_INTEGER, ON_SALE);
    }

    public static SubLObject set_ie_market_position_on_sale(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, ONE_INTEGER, ON_SALE);
    }

    public static SubLObject subloop_reserved_initialize_ie_market_position_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_ie_market_position_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, ON_SALE, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, SOUGHT, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, FUNDS, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, BINDER, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, SUPPORTS, NIL);
        return NIL;
    }

    public static SubLObject ie_market_position_p(final SubLObject ie_market_position) {
        return classes.subloop_instanceof_class(ie_market_position, IE_MARKET_POSITION);
    }

    public static SubLObject get_variable_dictionary_dictionary(final SubLObject variable_dictionary) {
        return classes.subloop_get_access_protected_instance_slot(variable_dictionary, ONE_INTEGER, DICTIONARY);
    }

    public static SubLObject set_variable_dictionary_dictionary(final SubLObject variable_dictionary, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(variable_dictionary, value, ONE_INTEGER, DICTIONARY);
    }

    public static SubLObject subloop_reserved_initialize_variable_dictionary_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_variable_dictionary_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, VARIABLE_DICTIONARY, DICTIONARY, NIL);
        return NIL;
    }

    public static SubLObject variable_dictionary_p(final SubLObject variable_dictionary) {
        return classes.subloop_instanceof_class(variable_dictionary, VARIABLE_DICTIONARY);
    }

    public static SubLObject variable_dictionary_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static SubLObject variable_dictionary_keys_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_variable_dictionary_method = NIL;
        final SubLObject v_dictionary = get_variable_dictionary_dictionary(self);
        try {
            thread.throwStack.push($sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
            try {
                sublisp_throw($sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, dictionary.dictionary_keys(v_dictionary));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_variable_dictionary_dictionary(self, v_dictionary);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_variable_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_variable_dictionary_method;
    }

    public static SubLObject variable_dictionary_find_variable_taxonomic_pred_method(final SubLObject self, final SubLObject var, final SubLObject taxpred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_variable_dictionary_method = NIL;
        final SubLObject v_dictionary = get_variable_dictionary_dictionary(self);
        try {
            thread.throwStack.push($sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cycl_variables.hl_varP(var))) && (NIL == cycl_variables.el_varP(var))) {
                    Errors.error($str92$___S_is_not_a_variable_, var);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(taxpred, $list93, UNPROVIDED, UNPROVIDED))) {
                    Errors.error($str94$___S_is_not_a_taxonomic_predicate, taxpred);
                }
                final SubLObject literals = dictionary.dictionary_lookup(v_dictionary, var, UNPROVIDED);
                SubLObject types = NIL;
                SubLObject cdolist_list_var = literals;
                SubLObject literal = NIL;
                literal = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pred = literal_arg0(literal, UNPROVIDED);
                    SubLObject type = NIL;
                    if (taxpred.eql(pred) && var.eql(literal_arg1(literal, UNPROVIDED))) {
                        type = literal_arg2(literal, UNPROVIDED);
                    }
                    if ((NIL != cycl_variables.hl_varP(type)) || (NIL != cycl_variables.el_varP(type))) {
                        type = methods.funcall_instance_method_with_2_args(self, FIND_VARIABLE_TAXONOMIC_PRED, type, $$genls);
                    }
                    if (NIL != type) {
                        final SubLObject item_var = type;
                        if (NIL == member(item_var, types, symbol_function(EQL), symbol_function(IDENTITY))) {
                            types = cons(item_var, types);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    literal = cdolist_list_var.first();
                } 
                sublisp_throw($sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, types);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_variable_dictionary_dictionary(self, v_dictionary);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_variable_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_variable_dictionary_method;
    }

    public static SubLObject variable_dictionary_pprint_method(final SubLObject self, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_variable_dictionary_method = NIL;
        final SubLObject v_dictionary = get_variable_dictionary_dictionary(self);
        try {
            thread.throwStack.push($sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
            try {
                dictionary_utilities.print_dictionary_contents(v_dictionary, stream);
                sublisp_throw($sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_variable_dictionary_dictionary(self, v_dictionary);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_variable_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_variable_dictionary_method;
    }

    public static SubLObject new_variable_dictionary(final SubLObject formula) {
        final SubLObject v_new = object.new_class_instance(VARIABLE_DICTIONARY);
        final SubLObject literals = apply(APPEND, assertions_high.assertion_cnf(formula));
        final SubLObject variables_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = literal_terms(literal, UNPROVIDED);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                if ((NIL != cycl_variables.hl_varP(v_term)) || (NIL != cycl_variables.el_varP(v_term))) {
                    dictionary_utilities.dictionary_push(variables_dict, v_term, literal);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                v_term = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        instances.set_slot(v_new, DICTIONARY, variables_dict);
        return v_new;
    }

    public static SubLObject get_word_graph_connected_path_terms(final SubLObject content_terms, SubLObject corpus) {
        if (corpus == UNPROVIDED) {
            corpus = NIL;
        }
        assert NIL != consp(content_terms) : "Types.consp(content_terms) " + "CommonSymbols.NIL != Types.consp(content_terms) " + content_terms;
        assert NIL != stringp(corpus) : "Types.stringp(corpus) " + "CommonSymbols.NIL != Types.stringp(corpus) " + corpus;
        return methods.funcall_instance_method_with_1_args(graph.make_graph_from_string_lists(external_interfaces.get_word_graph(content_terms, list(list($$$index, corpus)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), GET_PATH_LABELS, content_terms);
    }

    public static SubLObject declare_information_extraction_file() {
        declareFunction(me, "get_information_extraction_node_cycl_denotations", "GET-INFORMATION-EXTRACTION-NODE-CYCL-DENOTATIONS", 1, 0, false);
        declareFunction(me, "set_information_extraction_node_cycl_denotations", "SET-INFORMATION-EXTRACTION-NODE-CYCL-DENOTATIONS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_information_extraction_node_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_information_extraction_node_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-INSTANCE", 1, 0, false);
        declareFunction(me, "information_extraction_node_p", "INFORMATION-EXTRACTION-NODE-P", 1, 0, false);
        declareFunction(me, "information_extraction_node_initialize_method", "INFORMATION-EXTRACTION-NODE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "information_extraction_node_cycl_denots_method", "INFORMATION-EXTRACTION-NODE-CYCL-DENOTS-METHOD", 1, 0, false);
        declareFunction(me, "information_extraction_node_extract_cycl_method", "INFORMATION-EXTRACTION-NODE-EXTRACT-CYCL-METHOD", 1, 1, false);
        declareFunction(me, "information_extraction_node_print_method", "INFORMATION-EXTRACTION-NODE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "new_information_extraction_node", "NEW-INFORMATION-EXTRACTION-NODE", 1, 1, false);
        declareFunction(me, "subloop_reserved_initialize_information_extraction_graph_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_information_extraction_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-INSTANCE", 1, 0, false);
        declareFunction(me, "information_extraction_graph_p", "INFORMATION-EXTRACTION-GRAPH-P", 1, 0, false);
        declareFunction(me, "information_extraction_graph_initialize_method", "INFORMATION-EXTRACTION-GRAPH-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "information_extraction_graph_accept_node_method", "INFORMATION-EXTRACTION-GRAPH-ACCEPT-NODE-METHOD", 2, 0, false);
        declareFunction(me, "information_extraction_graph_find_events_method", "INFORMATION-EXTRACTION-GRAPH-FIND-EVENTS-METHOD", 1, 0, false);
        declareFunction(me, "new_information_extraction_graph", "NEW-INFORMATION-EXTRACTION-GRAPH", 1, 0, false);
        declareFunction(me, "get_ie_market_position_supports", "GET-IE-MARKET-POSITION-SUPPORTS", 1, 0, false);
        declareFunction(me, "set_ie_market_position_supports", "SET-IE-MARKET-POSITION-SUPPORTS", 2, 0, false);
        declareFunction(me, "get_ie_market_position_binder", "GET-IE-MARKET-POSITION-BINDER", 1, 0, false);
        declareFunction(me, "set_ie_market_position_binder", "SET-IE-MARKET-POSITION-BINDER", 2, 0, false);
        declareFunction(me, "get_ie_market_position_funds", "GET-IE-MARKET-POSITION-FUNDS", 1, 0, false);
        declareFunction(me, "set_ie_market_position_funds", "SET-IE-MARKET-POSITION-FUNDS", 2, 0, false);
        declareFunction(me, "get_ie_market_position_sought", "GET-IE-MARKET-POSITION-SOUGHT", 1, 0, false);
        declareFunction(me, "set_ie_market_position_sought", "SET-IE-MARKET-POSITION-SOUGHT", 2, 0, false);
        declareFunction(me, "get_ie_market_position_on_sale", "GET-IE-MARKET-POSITION-ON-SALE", 1, 0, false);
        declareFunction(me, "set_ie_market_position_on_sale", "SET-IE-MARKET-POSITION-ON-SALE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_ie_market_position_class", "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_ie_market_position_instance", "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-INSTANCE", 1, 0, false);
        declareFunction(me, "ie_market_position_p", "IE-MARKET-POSITION-P", 1, 0, false);
        declareFunction(me, "get_variable_dictionary_dictionary", "GET-VARIABLE-DICTIONARY-DICTIONARY", 1, 0, false);
        declareFunction(me, "set_variable_dictionary_dictionary", "SET-VARIABLE-DICTIONARY-DICTIONARY", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_variable_dictionary_class", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_variable_dictionary_instance", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-INSTANCE", 1, 0, false);
        declareFunction(me, "variable_dictionary_p", "VARIABLE-DICTIONARY-P", 1, 0, false);
        declareFunction(me, "variable_dictionary_initialize_method", "VARIABLE-DICTIONARY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "variable_dictionary_keys_method", "VARIABLE-DICTIONARY-KEYS-METHOD", 1, 0, false);
        declareFunction(me, "variable_dictionary_find_variable_taxonomic_pred_method", "VARIABLE-DICTIONARY-FIND-VARIABLE-TAXONOMIC-PRED-METHOD", 3, 0, false);
        declareFunction(me, "variable_dictionary_pprint_method", "VARIABLE-DICTIONARY-PPRINT-METHOD", 1, 1, false);
        declareFunction(me, "new_variable_dictionary", "NEW-VARIABLE-DICTIONARY", 1, 0, false);
        declareFunction(me, "get_word_graph_connected_path_terms", "GET-WORD-GRAPH-CONNECTED-PATH-TERMS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_information_extraction_file() {
        return NIL;
    }

    public static SubLObject setup_information_extraction_file() {
        classes.subloop_new_class(INFORMATION_EXTRACTION_NODE, GRAPH_NODE, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(INFORMATION_EXTRACTION_NODE, NIL);
        classes.subloop_note_class_initialization_function(INFORMATION_EXTRACTION_NODE, SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_CLASS);
        classes.subloop_note_instance_initialization_function(INFORMATION_EXTRACTION_NODE, SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_INSTANCE);
        subloop_reserved_initialize_information_extraction_node_class(INFORMATION_EXTRACTION_NODE);
        methods.methods_incorporate_instance_method(INITIALIZE, INFORMATION_EXTRACTION_NODE, $list14, NIL, $list15);
        methods.subloop_register_instance_method(INFORMATION_EXTRACTION_NODE, INITIALIZE, INFORMATION_EXTRACTION_NODE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CYCL_DENOTS, INFORMATION_EXTRACTION_NODE, $list14, NIL, $list18);
        methods.subloop_register_instance_method(INFORMATION_EXTRACTION_NODE, CYCL_DENOTS, INFORMATION_EXTRACTION_NODE_CYCL_DENOTS_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT_CYCL, INFORMATION_EXTRACTION_NODE, $list22, $list23, $list24);
        methods.subloop_register_instance_method(INFORMATION_EXTRACTION_NODE, EXTRACT_CYCL, INFORMATION_EXTRACTION_NODE_EXTRACT_CYCL_METHOD);
        methods.methods_incorporate_instance_method(PRINT, INFORMATION_EXTRACTION_NODE, $list14, $list29, $list30);
        methods.subloop_register_instance_method(INFORMATION_EXTRACTION_NODE, PRINT, INFORMATION_EXTRACTION_NODE_PRINT_METHOD);
        classes.subloop_new_class(INFORMATION_EXTRACTION_GRAPH, GRAPH, NIL, NIL, $list41);
        classes.class_set_implements_slot_listeners(INFORMATION_EXTRACTION_GRAPH, NIL);
        classes.subloop_note_class_initialization_function(INFORMATION_EXTRACTION_GRAPH, SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_CLASS);
        classes.subloop_note_instance_initialization_function(INFORMATION_EXTRACTION_GRAPH, SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_INSTANCE);
        subloop_reserved_initialize_information_extraction_graph_class(INFORMATION_EXTRACTION_GRAPH);
        methods.methods_incorporate_instance_method(INITIALIZE, INFORMATION_EXTRACTION_GRAPH, $list14, NIL, $list52);
        methods.subloop_register_instance_method(INFORMATION_EXTRACTION_GRAPH, INITIALIZE, INFORMATION_EXTRACTION_GRAPH_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ACCEPT_NODE, INFORMATION_EXTRACTION_GRAPH, $list14, $list55, $list56);
        methods.subloop_register_instance_method(INFORMATION_EXTRACTION_GRAPH, ACCEPT_NODE, INFORMATION_EXTRACTION_GRAPH_ACCEPT_NODE_METHOD);
        methods.methods_incorporate_instance_method(FIND_EVENTS, INFORMATION_EXTRACTION_GRAPH, $list14, NIL, $list59);
        methods.subloop_register_instance_method(INFORMATION_EXTRACTION_GRAPH, FIND_EVENTS, INFORMATION_EXTRACTION_GRAPH_FIND_EVENTS_METHOD);
        classes.subloop_new_class(IE_MARKET_POSITION, OBJECT, NIL, NIL, $list68);
        classes.class_set_implements_slot_listeners(IE_MARKET_POSITION, NIL);
        classes.subloop_note_class_initialization_function(IE_MARKET_POSITION, SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_CLASS);
        classes.subloop_note_instance_initialization_function(IE_MARKET_POSITION, SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_INSTANCE);
        subloop_reserved_initialize_ie_market_position_class(IE_MARKET_POSITION);
        classes.subloop_new_class(VARIABLE_DICTIONARY, OBJECT, NIL, NIL, $list77);
        classes.class_set_implements_slot_listeners(VARIABLE_DICTIONARY, NIL);
        classes.subloop_note_class_initialization_function(VARIABLE_DICTIONARY, SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_CLASS);
        classes.subloop_note_instance_initialization_function(VARIABLE_DICTIONARY, SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_INSTANCE);
        subloop_reserved_initialize_variable_dictionary_class(VARIABLE_DICTIONARY);
        methods.methods_incorporate_instance_method(INITIALIZE, VARIABLE_DICTIONARY, $list14, NIL, $list81);
        methods.subloop_register_instance_method(VARIABLE_DICTIONARY, INITIALIZE, VARIABLE_DICTIONARY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(KEYS, VARIABLE_DICTIONARY, $list22, NIL, $list84);
        methods.subloop_register_instance_method(VARIABLE_DICTIONARY, KEYS, VARIABLE_DICTIONARY_KEYS_METHOD);
        methods.methods_incorporate_instance_method(FIND_VARIABLE_TAXONOMIC_PRED, VARIABLE_DICTIONARY, $list88, $list89, $list90);
        methods.subloop_register_instance_method(VARIABLE_DICTIONARY, FIND_VARIABLE_TAXONOMIC_PRED, VARIABLE_DICTIONARY_FIND_VARIABLE_TAXONOMIC_PRED_METHOD);
        methods.methods_incorporate_instance_method(PPRINT, VARIABLE_DICTIONARY, $list22, $list98, $list99);
        methods.subloop_register_instance_method(VARIABLE_DICTIONARY, PPRINT, VARIABLE_DICTIONARY_PPRINT_METHOD);
        return NIL;
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

    
}

/**
 * Total time: 285 ms synthetic
 */
