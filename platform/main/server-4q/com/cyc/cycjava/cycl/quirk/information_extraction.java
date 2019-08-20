/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_terms;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class information_extraction extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new information_extraction();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol INFORMATION_EXTRACTION_NODE = makeSymbol("INFORMATION-EXTRACTION-NODE");

    private static final SubLSymbol GRAPH_NODE = makeSymbol("GRAPH-NODE");

    static private final SubLList $list2 = list(list(makeSymbol("CYCL-DENOTATIONS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-CYCL-DENOTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT-CYCL"), list(makeSymbol("FILTERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_NODE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-INSTANCE");

    static private final SubLList $list14 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list15 = list(makeString("@return information-extraction-node-p\n   Crates a new information-extraction-node object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol INFORMATION_EXTRACTION_NODE_INITIALIZE_METHOD = makeSymbol("INFORMATION-EXTRACTION-NODE-INITIALIZE-METHOD");

    private static final SubLSymbol CYCL_DENOTS = makeSymbol("CYCL-DENOTS");

    static private final SubLList $list18 = list(makeString("@return listp\n   Returns a list of Cyc denotations of the label of this node, if any."), list(makeSymbol("PWHEN"), makeSymbol("CYCL-DENOTATIONS"), list(RET, makeSymbol("CYCL-DENOTATIONS"))), list(makeSymbol("PWHEN"), makeSymbol("LABEL"), list(makeSymbol("CSETQ"), makeSymbol("CYCL-DENOTATIONS"), list(makeSymbol("NL-TRIE-ALL-DENOTS-OF-STRING"), makeSymbol("LABEL")))), list(RET, makeSymbol("CYCL-DENOTATIONS")));

    static private final SubLSymbol $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD");

    private static final SubLSymbol INFORMATION_EXTRACTION_NODE_CYCL_DENOTS_METHOD = makeSymbol("INFORMATION-EXTRACTION-NODE-CYCL-DENOTS-METHOD");

    private static final SubLSymbol EXTRACT_CYCL = makeSymbol("EXTRACT-CYCL");

    static private final SubLList $list22 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list23 = list(makeSymbol("&OPTIONAL"), makeSymbol("FILTERS"));

    static private final SubLList $list24 = list(makeString("@param FILTERS listp, expected to be a list of fort-p\n   @return listp\n   Returns all the elements of this node\'s cycl-denotations slot which are subsumed\n   by all the elements of FILTERS."), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("FILTERS"), makeSymbol("LISTP")), list(makeSymbol("PUNLESS"), makeSymbol("FILTERS"), list(RET, makeSymbol("CYCL-DENOTATIONS"))), list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TERM"), makeSymbol("CYCL-DENOTATIONS")), list(makeSymbol("CLET"), list(makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("FILTER"), makeSymbol("FILTERS"), makeSymbol("FAIL")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(makeSymbol("CNOT"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), makeSymbol("FILTER"))))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("TERM"), makeSymbol("FILTERED"))))), list(RET, makeSymbol("FILTERED"))));

    static private final SubLSymbol $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD");

    private static final SubLSymbol INFORMATION_EXTRACTION_NODE_EXTRACT_CYCL_METHOD = makeSymbol("INFORMATION-EXTRACTION-NODE-EXTRACT-CYCL-METHOD");

    static private final SubLList $list29 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list30 = list(makeString("@param STREAM streamp\n   @param DEPTH integerp\n   Prints this INFORMATION-EXTRACTION-NODE to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<IEN: "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("LABEL"), makeSymbol("STREAM")), list(makeSymbol("PWHEN"), makeSymbol("CYCL-DENOTATIONS"), list(makeSymbol("WRITE-STRING"), makeString(" -> "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), list(makeSymbol("PRIN1-TO-STRING"), makeSymbol("CYCL-DENOTATIONS")), makeSymbol("STREAM"))), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")));

    static private final SubLSymbol $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INFORMATION-EXTRACTION-NODE-METHOD");

    static private final SubLString $str32$__IEN__ = makeString("#<IEN: ");

    static private final SubLString $str33$____ = makeString(" -> ");

    static private final SubLString $str34$_ = makeString(">");

    private static final SubLSymbol INFORMATION_EXTRACTION_NODE_PRINT_METHOD = makeSymbol("INFORMATION-EXTRACTION-NODE-PRINT-METHOD");

    private static final SubLSymbol SET_LABEL = makeSymbol("SET-LABEL");

    private static final SubLSymbol SET_ID = makeSymbol("SET-ID");

    private static final SubLSymbol INFORMATION_EXTRACTION_GRAPH = makeSymbol("INFORMATION-EXTRACTION-GRAPH");

    static private final SubLList $list41 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACCEPT-NODE"), list(makeSymbol("NEW-NODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-CLASS");

    private static final SubLSymbol INTEGER_SEQUENCE_GENERATOR = makeSymbol("INTEGER-SEQUENCE-GENERATOR");

    private static final SubLSymbol LABEL_NODE_MAP = makeSymbol("LABEL-NODE-MAP");

    private static final SubLSymbol LABEL_EDGE_MAP = makeSymbol("LABEL-EDGE-MAP");

    private static final SubLSymbol CORE_NODE_MAP = makeSymbol("CORE-NODE-MAP");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INFORMATION_EXTRACTION_GRAPH_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-INSTANCE");

    static private final SubLList $list52 = list(makeString("@return information-extraction-graph-p\n   Returns a new information-extraction-graph object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol INFORMATION_EXTRACTION_GRAPH_INITIALIZE_METHOD = makeSymbol("INFORMATION-EXTRACTION-GRAPH-INITIALIZE-METHOD");

    private static final SubLSymbol ACCEPT_NODE = makeSymbol("ACCEPT-NODE");

    static private final SubLList $list55 = list(makeSymbol("NEW-NODE"));

    static private final SubLList $list56 = list(makeString("@param NEW-NODE information-extraction-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph, NIL otherwise."), list(RET, list(makeSymbol("INFORMATION-EXTRACTION-NODE-P"), makeSymbol("NEW-NODE"))));

    private static final SubLSymbol INFORMATION_EXTRACTION_GRAPH_ACCEPT_NODE_METHOD = makeSymbol("INFORMATION-EXTRACTION-GRAPH-ACCEPT-NODE-METHOD");

    private static final SubLSymbol FIND_EVENTS = makeSymbol("FIND-EVENTS");

    static private final SubLList $list59 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EVENTS"), NIL)), list(makeSymbol("DO-GRAPH-NODES"), list(makeSymbol("NODE"), makeSymbol("SELF")), list(makeSymbol("CPUSHNEW"), list(makeSymbol("FIM"), makeSymbol("NODE"), list(QUOTE, makeSymbol("EXTRACT-CYCL")), list(QUOTE, list(reader_make_constant_shell("Event")))), makeSymbol("EVENTS"))), list(RET, makeSymbol("EVENTS"))));

    static private final SubLList $list60 = list(reader_make_constant_shell("Event"));

    private static final SubLSymbol INFORMATION_EXTRACTION_GRAPH_FIND_EVENTS_METHOD = makeSymbol("INFORMATION-EXTRACTION-GRAPH-FIND-EVENTS-METHOD");

    private static final SubLSymbol GET_NODE_BY_LABEL = makeSymbol("GET-NODE-BY-LABEL");

    private static final SubLSymbol ADD_NODE = makeSymbol("ADD-NODE");

    private static final SubLSymbol ADD_EDGE = makeSymbol("ADD-EDGE");

    private static final SubLSymbol GRAPH_EDGE = makeSymbol("GRAPH-EDGE");

    private static final SubLSymbol MAKE_EDGE = makeSymbol("MAKE-EDGE");

    private static final SubLSymbol IE_MARKET_POSITION = makeSymbol("IE-MARKET-POSITION");

    static private final SubLList $list68 = list(list(makeSymbol("ON-SALE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SOUGHT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("FUNDS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("BINDER"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SUPPORTS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")));

    private static final SubLSymbol BINDER = makeSymbol("BINDER");

    private static final SubLSymbol FUNDS = makeSymbol("FUNDS");

    private static final SubLSymbol SOUGHT = makeSymbol("SOUGHT");

    private static final SubLSymbol ON_SALE = makeSymbol("ON-SALE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_IE_MARKET_POSITION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-INSTANCE");

    private static final SubLSymbol VARIABLE_DICTIONARY = makeSymbol("VARIABLE-DICTIONARY");

    static private final SubLList $list77 = list(list(makeSymbol("DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VARIABLE_DICTIONARY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-INSTANCE");

    static private final SubLList $list81 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol VARIABLE_DICTIONARY_INITIALIZE_METHOD = makeSymbol("VARIABLE-DICTIONARY-INITIALIZE-METHOD");

    static private final SubLList $list84 = list(list(RET, list(makeSymbol("DICTIONARY-KEYS"), makeSymbol("DICTIONARY"))));

    static private final SubLSymbol $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD");

    private static final SubLSymbol VARIABLE_DICTIONARY_KEYS_METHOD = makeSymbol("VARIABLE-DICTIONARY-KEYS-METHOD");

    private static final SubLSymbol FIND_VARIABLE_TAXONOMIC_PRED = makeSymbol("FIND-VARIABLE-TAXONOMIC-PRED");

    static private final SubLList $list88 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list89 = list(makeSymbol("VAR"), makeSymbol("TAXPRED"));

    static private final SubLList $list90 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("HL-VAR?"), makeSymbol("VAR")), list(makeSymbol("EL-VAR?"), makeSymbol("VAR"))), makeString("~%~S is not a variable!"), makeSymbol("VAR")), list(makeSymbol("MUST"), list(makeSymbol("MEMBER"), makeSymbol("TAXPRED"), list(QUOTE, list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls")))), makeString("~%~S is not a taxonomic predicate!"), makeSymbol("TAXPRED")), list(makeSymbol("CLET"), list(list(makeSymbol("LITERALS"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY"), makeSymbol("VAR"))), list(makeSymbol("TYPES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("LITERAL"), makeSymbol("LITERALS")), list(makeSymbol("CLET"), list(list(makeSymbol("PRED"), list(makeSymbol("LITERAL-ARG0"), makeSymbol("LITERAL"))), makeSymbol("TYPE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(EQL, makeSymbol("TAXPRED"), makeSymbol("PRED")), list(EQL, makeSymbol("VAR"), list(makeSymbol("LITERAL-ARG1"), makeSymbol("LITERAL")))), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), list(makeSymbol("LITERAL-ARG2"), makeSymbol("LITERAL")))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("HL-VAR?"), makeSymbol("TYPE")), list(makeSymbol("EL-VAR?"), makeSymbol("TYPE"))), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-VARIABLE-TAXONOMIC-PRED")), makeSymbol("TYPE"), reader_make_constant_shell("genls")))), list(makeSymbol("PWHEN"), makeSymbol("TYPE"), list(makeSymbol("CPUSHNEW"), makeSymbol("TYPE"), makeSymbol("TYPES"))))), list(RET, makeSymbol("TYPES"))));

    static private final SubLSymbol $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD");

    static private final SubLString $str92$___S_is_not_a_variable_ = makeString("~%~S is not a variable!");

    static private final SubLList $list93 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLString $str94$___S_is_not_a_taxonomic_predicate = makeString("~%~S is not a taxonomic predicate!");



    private static final SubLSymbol VARIABLE_DICTIONARY_FIND_VARIABLE_TAXONOMIC_PRED_METHOD = makeSymbol("VARIABLE-DICTIONARY-FIND-VARIABLE-TAXONOMIC-PRED-METHOD");

    private static final SubLSymbol PPRINT = makeSymbol("PPRINT");

    static private final SubLList $list98 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T));

    static private final SubLList $list99 = list(list(makeSymbol("PRINT-DICTIONARY-CONTENTS"), makeSymbol("DICTIONARY"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VARIABLE-DICTIONARY-METHOD");

    private static final SubLSymbol VARIABLE_DICTIONARY_PPRINT_METHOD = makeSymbol("VARIABLE-DICTIONARY-PPRINT-METHOD");

    static private final SubLString $$$index = makeString("index");

    private static final SubLSymbol GET_PATH_LABELS = makeSymbol("GET-PATH-LABELS");

    // Definitions
    public static final SubLObject get_information_extraction_node_cycl_denotations_alt(SubLObject information_extraction_node) {
        return classes.subloop_get_access_protected_instance_slot(information_extraction_node, FOUR_INTEGER, CYCL_DENOTATIONS);
    }

    // Definitions
    public static SubLObject get_information_extraction_node_cycl_denotations(final SubLObject information_extraction_node) {
        return classes.subloop_get_access_protected_instance_slot(information_extraction_node, FOUR_INTEGER, CYCL_DENOTATIONS);
    }

    public static final SubLObject set_information_extraction_node_cycl_denotations_alt(SubLObject information_extraction_node, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(information_extraction_node, value, FOUR_INTEGER, CYCL_DENOTATIONS);
    }

    public static SubLObject set_information_extraction_node_cycl_denotations(final SubLObject information_extraction_node, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(information_extraction_node, value, FOUR_INTEGER, CYCL_DENOTATIONS);
    }

    public static final SubLObject subloop_reserved_initialize_information_extraction_node_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_information_extraction_node_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_information_extraction_node_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, CORE, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, ID, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, LABEL, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_EXTRACTION_NODE, CYCL_DENOTATIONS, NIL);
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

    public static final SubLObject information_extraction_node_p_alt(SubLObject information_extraction_node) {
        return classes.subloop_instanceof_class(information_extraction_node, INFORMATION_EXTRACTION_NODE);
    }

    public static SubLObject information_extraction_node_p(final SubLObject information_extraction_node) {
        return classes.subloop_instanceof_class(information_extraction_node, INFORMATION_EXTRACTION_NODE);
    }

    /**
     *
     *
     * @return information-extraction-node-p
    Crates a new information-extraction-node object
     */
    @LispMethod(comment = "@return information-extraction-node-p\r\nCrates a new information-extraction-node object")
    public static final SubLObject information_extraction_node_initialize_method_alt(SubLObject self) {
        graph.graph_node_initialize_method(self);
        return self;
    }

    /**
     *
     *
     * @return information-extraction-node-p
    Crates a new information-extraction-node object
     */
    @LispMethod(comment = "@return information-extraction-node-p\r\nCrates a new information-extraction-node object")
    public static SubLObject information_extraction_node_initialize_method(final SubLObject self) {
        graph.graph_node_initialize_method(self);
        return self;
    }

    /**
     *
     *
     * @return listp
    Returns a list of Cyc denotations of the label of this node, if any.
     */
    @LispMethod(comment = "@return listp\r\nReturns a list of Cyc denotations of the label of this node, if any.")
    public static final SubLObject information_extraction_node_cycl_denots_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_information_extraction_node_method = NIL;
            SubLObject cycl_denotations = com.cyc.cycjava.cycl.quirk.information_extraction.get_information_extraction_node_cycl_denotations(self);
            SubLObject label = graph.get_graph_node_label(self);
            try {
                try {
                    if (NIL != cycl_denotations) {
                        sublisp_throw($sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations);
                    }
                    if (NIL != label) {
                        cycl_denotations = nl_trie_accessors.nl_trie_all_denots_of_string(label, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    sublisp_throw($sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.information_extraction.set_information_extraction_node_cycl_denotations(self, cycl_denotations);
                            graph.set_graph_node_label(self, label);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_information_extraction_node_method = Errors.handleThrowable(ccatch_env_var, $sym19$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
            }
            return catch_var_for_information_extraction_node_method;
        }
    }

    /**
     *
     *
     * @return listp
    Returns a list of Cyc denotations of the label of this node, if any.
     */
    @LispMethod(comment = "@return listp\r\nReturns a list of Cyc denotations of the label of this node, if any.")
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

    /**
     *
     *
     * @param FILTERS
     * 		listp, expected to be a list of fort-p
     * @return listp
    Returns all the elements of this node's cycl-denotations slot which are subsumed
    by all the elements of FILTERS.
     */
    @LispMethod(comment = "@param FILTERS\r\n\t\tlistp, expected to be a list of fort-p\r\n@return listp\r\nReturns all the elements of this node\'s cycl-denotations slot which are subsumed\r\nby all the elements of FILTERS.")
    public static final SubLObject information_extraction_node_extract_cycl_method_alt(SubLObject self, SubLObject filters) {
        if (filters == UNPROVIDED) {
            filters = NIL;
        }
        {
            SubLObject catch_var_for_information_extraction_node_method = NIL;
            SubLObject cycl_denotations = com.cyc.cycjava.cycl.quirk.information_extraction.get_information_extraction_node_cycl_denotations(self);
            try {
                try {
                    if (NIL != filters) {
                        SubLTrampolineFile.checkType(filters, LISTP);
                    }
                    if (NIL == filters) {
                        sublisp_throw($sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, cycl_denotations);
                    }
                    {
                        SubLObject filtered = NIL;
                        SubLObject cdolist_list_var = cycl_denotations;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                            {
                                SubLObject fail = NIL;
                                if (NIL == fail) {
                                    {
                                        SubLObject csome_list_var = filters;
                                        SubLObject filter = NIL;
                                        for (filter = csome_list_var.first(); !((NIL != fail) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , filter = csome_list_var.first()) {
                                            fail = makeBoolean(NIL == at_utilities.more_specific_p(v_term, filter, UNPROVIDED));
                                        }
                                    }
                                }
                                if (NIL == fail) {
                                    filtered = cons(v_term, filtered);
                                }
                            }
                        }
                        sublisp_throw($sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD, filtered);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.information_extraction.set_information_extraction_node_cycl_denotations(self, cycl_denotations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_information_extraction_node_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
            }
            return catch_var_for_information_extraction_node_method;
        }
    }

    /**
     *
     *
     * @param FILTERS
     * 		listp, expected to be a list of fort-p
     * @return listp
    Returns all the elements of this node's cycl-denotations slot which are subsumed
    by all the elements of FILTERS.
     */
    @LispMethod(comment = "@param FILTERS\r\n\t\tlistp, expected to be a list of fort-p\r\n@return listp\r\nReturns all the elements of this node\'s cycl-denotations slot which are subsumed\r\nby all the elements of FILTERS.")
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

    /**
     *
     *
     * @param STREAM
    streamp
     * 		
     * @param DEPTH
     * 		integerp
     * 		Prints this INFORMATION-EXTRACTION-NODE to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "@param STREAM\nstreamp\r\n\t\t\r\n@param DEPTH\r\n\t\tintegerp\r\n\t\tPrints this INFORMATION-EXTRACTION-NODE to STREAM, ignoring DEPTH")
    public static final SubLObject information_extraction_node_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_information_extraction_node_method = NIL;
            SubLObject cycl_denotations = com.cyc.cycjava.cycl.quirk.information_extraction.get_information_extraction_node_cycl_denotations(self);
            SubLObject label = graph.get_graph_node_label(self);
            try {
                try {
                    write_string($str_alt32$__IEN__, stream, UNPROVIDED, UNPROVIDED);
                    write_string(label, stream, UNPROVIDED, UNPROVIDED);
                    if (NIL != cycl_denotations) {
                        write_string($str_alt33$____, stream, UNPROVIDED, UNPROVIDED);
                        write_string(prin1_to_string(cycl_denotations), stream, UNPROVIDED, UNPROVIDED);
                    }
                    write_string($str_alt34$_, stream, UNPROVIDED, UNPROVIDED);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.information_extraction.set_information_extraction_node_cycl_denotations(self, cycl_denotations);
                            graph.set_graph_node_label(self, label);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_information_extraction_node_method = Errors.handleThrowable(ccatch_env_var, $sym31$OUTER_CATCH_FOR_INFORMATION_EXTRACTION_NODE_METHOD);
            }
            return catch_var_for_information_extraction_node_method;
        }
    }

    /**
     *
     *
     * @param STREAM
    streamp
     * 		
     * @param DEPTH
     * 		integerp
     * 		Prints this INFORMATION-EXTRACTION-NODE to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "@param STREAM\nstreamp\r\n\t\t\r\n@param DEPTH\r\n\t\tintegerp\r\n\t\tPrints this INFORMATION-EXTRACTION-NODE to STREAM, ignoring DEPTH")
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

    /**
     *
     *
     * @param LABEL
    stringp
     * 		
     * @return information-extraction-node-p
    Creates a new information-extraction-node object with label LABEL
     */
    @LispMethod(comment = "@param LABEL\nstringp\r\n\t\t\r\n@return information-extraction-node-p\r\nCreates a new information-extraction-node object with label LABEL")
    public static final SubLObject new_information_extraction_node_alt(SubLObject label, SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        SubLTrampolineFile.checkType(label, STRINGP);
        {
            SubLObject node = object.new_class_instance(INFORMATION_EXTRACTION_NODE);
            methods.funcall_instance_method_with_1_args(node, SET_LABEL, label);
            methods.funcall_instance_method_with_0_args(node, CYCL_DENOTS);
            if (NIL != id) {
                methods.funcall_instance_method_with_1_args(node, SET_ID, id);
            }
            return node;
        }
    }

    /**
     *
     *
     * @param LABEL
    stringp
     * 		
     * @return information-extraction-node-p
    Creates a new information-extraction-node object with label LABEL
     */
    @LispMethod(comment = "@param LABEL\nstringp\r\n\t\t\r\n@return information-extraction-node-p\r\nCreates a new information-extraction-node object with label LABEL")
    public static SubLObject new_information_extraction_node(final SubLObject label, SubLObject id) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        assert NIL != stringp(label) : "! stringp(label) " + ("Types.stringp(label) " + "CommonSymbols.NIL != Types.stringp(label) ") + label;
        final SubLObject node = object.new_class_instance(INFORMATION_EXTRACTION_NODE);
        methods.funcall_instance_method_with_1_args(node, SET_LABEL, label);
        methods.funcall_instance_method_with_0_args(node, CYCL_DENOTS);
        if (NIL != id) {
            methods.funcall_instance_method_with_1_args(node, SET_ID, id);
        }
        return node;
    }

    public static final SubLObject subloop_reserved_initialize_information_extraction_graph_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_information_extraction_graph_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_information_extraction_graph_instance_alt(SubLObject new_instance) {
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

    public static final SubLObject information_extraction_graph_p_alt(SubLObject information_extraction_graph) {
        return classes.subloop_instanceof_class(information_extraction_graph, INFORMATION_EXTRACTION_GRAPH);
    }

    public static SubLObject information_extraction_graph_p(final SubLObject information_extraction_graph) {
        return classes.subloop_instanceof_class(information_extraction_graph, INFORMATION_EXTRACTION_GRAPH);
    }

    /**
     *
     *
     * @return information-extraction-graph-p
    Returns a new information-extraction-graph object
     */
    @LispMethod(comment = "@return information-extraction-graph-p\r\nReturns a new information-extraction-graph object")
    public static final SubLObject information_extraction_graph_initialize_method_alt(SubLObject self) {
        graph.graph_initialize_method(self);
        return self;
    }

    /**
     *
     *
     * @return information-extraction-graph-p
    Returns a new information-extraction-graph object
     */
    @LispMethod(comment = "@return information-extraction-graph-p\r\nReturns a new information-extraction-graph object")
    public static SubLObject information_extraction_graph_initialize_method(final SubLObject self) {
        graph.graph_initialize_method(self);
        return self;
    }

    /**
     *
     *
     * @param NEW-NODE
    information-extraction-node-p
     * 		
     * @return boolean, T if NEW-NODE is acceptable for this graph, NIL otherwise.
     */
    @LispMethod(comment = "@param NEW-NODE\ninformation-extraction-node-p\r\n\t\t\r\n@return boolean, T if NEW-NODE is acceptable for this graph, NIL otherwise.")
    public static final SubLObject information_extraction_graph_accept_node_method_alt(SubLObject self, SubLObject new_node) {
        return com.cyc.cycjava.cycl.quirk.information_extraction.information_extraction_node_p(new_node);
    }

    /**
     *
     *
     * @param NEW-NODE
    information-extraction-node-p
     * 		
     * @return boolean, T if NEW-NODE is acceptable for this graph, NIL otherwise.
     */
    @LispMethod(comment = "@param NEW-NODE\ninformation-extraction-node-p\r\n\t\t\r\n@return boolean, T if NEW-NODE is acceptable for this graph, NIL otherwise.")
    public static SubLObject information_extraction_graph_accept_node_method(final SubLObject self, final SubLObject new_node) {
        return information_extraction_node_p(new_node);
    }

    public static final SubLObject information_extraction_graph_find_events_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject events = NIL;
                SubLObject graph_var = self;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(instances.get_slot(graph_var, NODES)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject node = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject item_var = methods.funcall_instance_method_with_1_args(node, EXTRACT_CYCL, $list_alt60);
                            if (NIL == member(item_var, events, symbol_function(EQL), symbol_function(IDENTITY))) {
                                events = cons(item_var, events);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return events;
            }
        }
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

    /**
     *
     *
     * @param LIST
     * 		listp, LIST is expected to be of the form (L-1 ... L-n) where
     * 		each of the L-i is a list of strings (from-node to-node-1 ... to-node-n).
     * @return information-extraction-graph-p
    Creates a new information-extraction-graph object with the nodes/edges in LIST as its
    content.
     */
    @LispMethod(comment = "@param LIST\r\n\t\tlistp, LIST is expected to be of the form (L-1 ... L-n) where\r\n\t\teach of the L-i is a list of strings (from-node to-node-1 ... to-node-n).\r\n@return information-extraction-graph-p\r\nCreates a new information-extraction-graph object with the nodes/edges in LIST as its\r\ncontent.")
    public static final SubLObject new_information_extraction_graph_alt(SubLObject list) {
        {
            SubLObject ieg = object.new_class_instance(INFORMATION_EXTRACTION_GRAPH);
            SubLObject cdolist_list_var = list;
            SubLObject node_list = NIL;
            for (node_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node_list = cdolist_list_var.first()) {
                {
                    SubLObject from_string = node_list.first();
                    SubLObject from_node = methods.funcall_instance_method_with_1_args(ieg, GET_NODE_BY_LABEL, from_string);
                    SubLObject to_strings = node_list.rest();
                    if (NIL == from_node) {
                        from_node = com.cyc.cycjava.cycl.quirk.information_extraction.new_information_extraction_node(from_string, UNPROVIDED);
                        methods.funcall_instance_method_with_1_args(ieg, ADD_NODE, from_node);
                    }
                    {
                        SubLObject cdolist_list_var_1 = to_strings;
                        SubLObject to_string = NIL;
                        for (to_string = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , to_string = cdolist_list_var_1.first()) {
                            {
                                SubLObject to_node = methods.funcall_instance_method_with_1_args(ieg, GET_NODE_BY_LABEL, to_string);
                                if (NIL == to_node) {
                                    to_node = com.cyc.cycjava.cycl.quirk.information_extraction.new_information_extraction_node(to_string, UNPROVIDED);
                                    methods.funcall_instance_method_with_1_args(ieg, ADD_NODE, to_node);
                                }
                                methods.funcall_instance_method_with_1_args(ieg, ADD_EDGE, methods.funcall_class_method_with_2_args(GRAPH_EDGE, MAKE_EDGE, from_node, to_node));
                            }
                        }
                    }
                }
            }
            return ieg;
        }
    }

    /**
     *
     *
     * @param LIST
     * 		listp, LIST is expected to be of the form (L-1 ... L-n) where
     * 		each of the L-i is a list of strings (from-node to-node-1 ... to-node-n).
     * @return information-extraction-graph-p
    Creates a new information-extraction-graph object with the nodes/edges in LIST as its
    content.
     */
    @LispMethod(comment = "@param LIST\r\n\t\tlistp, LIST is expected to be of the form (L-1 ... L-n) where\r\n\t\teach of the L-i is a list of strings (from-node to-node-1 ... to-node-n).\r\n@return information-extraction-graph-p\r\nCreates a new information-extraction-graph object with the nodes/edges in LIST as its\r\ncontent.")
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

    public static final SubLObject get_ie_market_position_supports_alt(SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, FIVE_INTEGER, SUPPORTS);
    }

    public static SubLObject get_ie_market_position_supports(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, FIVE_INTEGER, SUPPORTS);
    }

    public static final SubLObject set_ie_market_position_supports_alt(SubLObject ie_market_position, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, FIVE_INTEGER, SUPPORTS);
    }

    public static SubLObject set_ie_market_position_supports(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, FIVE_INTEGER, SUPPORTS);
    }

    public static final SubLObject get_ie_market_position_binder_alt(SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, FOUR_INTEGER, BINDER);
    }

    public static SubLObject get_ie_market_position_binder(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, FOUR_INTEGER, BINDER);
    }

    public static final SubLObject set_ie_market_position_binder_alt(SubLObject ie_market_position, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, FOUR_INTEGER, BINDER);
    }

    public static SubLObject set_ie_market_position_binder(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, FOUR_INTEGER, BINDER);
    }

    public static final SubLObject get_ie_market_position_funds_alt(SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, THREE_INTEGER, FUNDS);
    }

    public static SubLObject get_ie_market_position_funds(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, THREE_INTEGER, FUNDS);
    }

    public static final SubLObject set_ie_market_position_funds_alt(SubLObject ie_market_position, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, THREE_INTEGER, FUNDS);
    }

    public static SubLObject set_ie_market_position_funds(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, THREE_INTEGER, FUNDS);
    }

    public static final SubLObject get_ie_market_position_sought_alt(SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, TWO_INTEGER, SOUGHT);
    }

    public static SubLObject get_ie_market_position_sought(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, TWO_INTEGER, SOUGHT);
    }

    public static final SubLObject set_ie_market_position_sought_alt(SubLObject ie_market_position, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, TWO_INTEGER, SOUGHT);
    }

    public static SubLObject set_ie_market_position_sought(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, TWO_INTEGER, SOUGHT);
    }

    public static final SubLObject get_ie_market_position_on_sale_alt(SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, ONE_INTEGER, ON_SALE);
    }

    public static SubLObject get_ie_market_position_on_sale(final SubLObject ie_market_position) {
        return classes.subloop_get_access_protected_instance_slot(ie_market_position, ONE_INTEGER, ON_SALE);
    }

    public static final SubLObject set_ie_market_position_on_sale_alt(SubLObject ie_market_position, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, ONE_INTEGER, ON_SALE);
    }

    public static SubLObject set_ie_market_position_on_sale(final SubLObject ie_market_position, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(ie_market_position, value, ONE_INTEGER, ON_SALE);
    }

    public static final SubLObject subloop_reserved_initialize_ie_market_position_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_ie_market_position_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_ie_market_position_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, ON_SALE, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, SOUGHT, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, FUNDS, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, BINDER, NIL);
        classes.subloop_initialize_slot(new_instance, IE_MARKET_POSITION, SUPPORTS, NIL);
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

    public static final SubLObject ie_market_position_p_alt(SubLObject ie_market_position) {
        return classes.subloop_instanceof_class(ie_market_position, IE_MARKET_POSITION);
    }

    public static SubLObject ie_market_position_p(final SubLObject ie_market_position) {
        return classes.subloop_instanceof_class(ie_market_position, IE_MARKET_POSITION);
    }

    public static final SubLObject get_variable_dictionary_dictionary_alt(SubLObject variable_dictionary) {
        return classes.subloop_get_access_protected_instance_slot(variable_dictionary, ONE_INTEGER, DICTIONARY);
    }

    public static SubLObject get_variable_dictionary_dictionary(final SubLObject variable_dictionary) {
        return classes.subloop_get_access_protected_instance_slot(variable_dictionary, ONE_INTEGER, DICTIONARY);
    }

    public static final SubLObject set_variable_dictionary_dictionary_alt(SubLObject variable_dictionary, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(variable_dictionary, value, ONE_INTEGER, DICTIONARY);
    }

    public static SubLObject set_variable_dictionary_dictionary(final SubLObject variable_dictionary, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(variable_dictionary, value, ONE_INTEGER, DICTIONARY);
    }

    public static final SubLObject subloop_reserved_initialize_variable_dictionary_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_variable_dictionary_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_variable_dictionary_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, VARIABLE_DICTIONARY, DICTIONARY, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_variable_dictionary_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, VARIABLE_DICTIONARY, DICTIONARY, NIL);
        return NIL;
    }

    public static final SubLObject variable_dictionary_p_alt(SubLObject variable_dictionary) {
        return classes.subloop_instanceof_class(variable_dictionary, VARIABLE_DICTIONARY);
    }

    public static SubLObject variable_dictionary_p(final SubLObject variable_dictionary) {
        return classes.subloop_instanceof_class(variable_dictionary, VARIABLE_DICTIONARY);
    }

    public static final SubLObject variable_dictionary_initialize_method_alt(SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static SubLObject variable_dictionary_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static final SubLObject variable_dictionary_keys_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_variable_dictionary_method = NIL;
            SubLObject v_dictionary = com.cyc.cycjava.cycl.quirk.information_extraction.get_variable_dictionary_dictionary(self);
            try {
                try {
                    sublisp_throw($sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, dictionary.dictionary_keys(v_dictionary));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.information_extraction.set_variable_dictionary_dictionary(self, v_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_variable_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
            }
            return catch_var_for_variable_dictionary_method;
        }
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

    public static final SubLObject variable_dictionary_find_variable_taxonomic_pred_method_alt(SubLObject self, SubLObject var, SubLObject taxpred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_variable_dictionary_method = NIL;
                SubLObject v_dictionary = com.cyc.cycjava.cycl.quirk.information_extraction.get_variable_dictionary_dictionary(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL != cycl_variables.hl_varP(var)) || (NIL != cycl_variables.el_varP(var)))) {
                                Errors.error($str_alt92$___S_is_not_a_variable_, var);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == member(taxpred, $list_alt93, UNPROVIDED, UNPROVIDED)) {
                                Errors.error($str_alt94$___S_is_not_a_taxonomic_predicate, taxpred);
                            }
                        }
                        {
                            SubLObject literals = dictionary.dictionary_lookup(v_dictionary, var, UNPROVIDED);
                            SubLObject types = NIL;
                            SubLObject cdolist_list_var = literals;
                            SubLObject literal = NIL;
                            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                                {
                                    SubLObject pred = literal_arg0(literal, UNPROVIDED);
                                    SubLObject type = NIL;
                                    if (taxpred.eql(pred) && var.eql(literal_arg1(literal, UNPROVIDED))) {
                                        type = literal_arg2(literal, UNPROVIDED);
                                    }
                                    if ((NIL != cycl_variables.hl_varP(type)) || (NIL != cycl_variables.el_varP(type))) {
                                        type = methods.funcall_instance_method_with_2_args(self, FIND_VARIABLE_TAXONOMIC_PRED, type, $$genls);
                                    }
                                    if (NIL != type) {
                                        {
                                            SubLObject item_var = type;
                                            if (NIL == member(item_var, types, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                types = cons(item_var, types);
                                            }
                                        }
                                    }
                                }
                            }
                            sublisp_throw($sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, types);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.quirk.information_extraction.set_variable_dictionary_dictionary(self, v_dictionary);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_variable_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
                }
                return catch_var_for_variable_dictionary_method;
            }
        }
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

    public static final SubLObject variable_dictionary_pprint_method_alt(SubLObject self, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject catch_var_for_variable_dictionary_method = NIL;
            SubLObject v_dictionary = com.cyc.cycjava.cycl.quirk.information_extraction.get_variable_dictionary_dictionary(self);
            try {
                try {
                    dictionary_utilities.print_dictionary_contents(v_dictionary, stream);
                    sublisp_throw($sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.information_extraction.set_variable_dictionary_dictionary(self, v_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_variable_dictionary_method = Errors.handleThrowable(ccatch_env_var, $sym100$OUTER_CATCH_FOR_VARIABLE_DICTIONARY_METHOD);
            }
            return catch_var_for_variable_dictionary_method;
        }
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

    public static final SubLObject new_variable_dictionary_alt(SubLObject formula) {
        {
            SubLObject v_new = object.new_class_instance(VARIABLE_DICTIONARY);
            SubLObject literals = apply(APPEND, assertions_high.assertion_cnf(formula));
            SubLObject variables_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = literals;
            SubLObject literal = NIL;
            for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_2 = literal_terms(literal, UNPROVIDED);
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , v_term = cdolist_list_var_2.first()) {
                        if ((NIL != cycl_variables.hl_varP(v_term)) || (NIL != cycl_variables.el_varP(v_term))) {
                            dictionary_utilities.dictionary_push(variables_dict, v_term, literal);
                        }
                    }
                }
            }
            instances.set_slot(v_new, DICTIONARY, variables_dict);
            return v_new;
        }
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

    static private final SubLList $list_alt2 = list(list(makeSymbol("CYCL-DENOTATIONS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPUTE-CYCL-DENOTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT-CYCL"), list(makeSymbol("FILTERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    /**
     * An implementation of an Information Retrieval technique known as pseudo-relevance
     * feedback. See page 566 of 'Foundations of Statistical Natural Language Processing'
     * by Manning and Schuetze, MIT Press 1999.
     *
     * @param CONTENT-TERMS
     * 		a list of stringp, representing terms of interest for
     * 		a query to an Information Retrieval engine.
     * @param CORPUS
     * 		a stringp determining which corpus should be target for collecting
     * 		the statistics which will be used to augment the set of CONTENT-TERMS
     * @return a listp of stringp. These are intended to be strings that have a better
    chance at retrieving documents relevant to the query in CONTENT-TERMS than that
    query itself.
     * @unknown bertolo
     */
    @LispMethod(comment = "An implementation of an Information Retrieval technique known as pseudo-relevance\r\nfeedback. See page 566 of \'Foundations of Statistical Natural Language Processing\'\r\nby Manning and Schuetze, MIT Press 1999.\r\n\r\n@param CONTENT-TERMS\r\n\t\ta list of stringp, representing terms of interest for\r\n\t\ta query to an Information Retrieval engine.\r\n@param CORPUS\r\n\t\ta stringp determining which corpus should be target for collecting\r\n\t\tthe statistics which will be used to augment the set of CONTENT-TERMS\r\n@return a listp of stringp. These are intended to be strings that have a better\r\nchance at retrieving documents relevant to the query in CONTENT-TERMS than that\r\nquery itself.\r\n@unknown bertolo\nAn implementation of an Information Retrieval technique known as pseudo-relevance\nfeedback. See page 566 of \'Foundations of Statistical Natural Language Processing\'\nby Manning and Schuetze, MIT Press 1999.")
    public static final SubLObject get_word_graph_connected_path_terms_alt(SubLObject content_terms, SubLObject corpus) {
        if (corpus == UNPROVIDED) {
            corpus = NIL;
        }
        SubLTrampolineFile.checkType(content_terms, CONSP);
        SubLTrampolineFile.checkType(corpus, STRINGP);
        return methods.funcall_instance_method_with_1_args(graph.make_graph_from_string_lists(external_interfaces.get_word_graph(content_terms, list(list($$$index, corpus)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), GET_PATH_LABELS, content_terms);
    }

    /**
     * An implementation of an Information Retrieval technique known as pseudo-relevance
     * feedback. See page 566 of 'Foundations of Statistical Natural Language Processing'
     * by Manning and Schuetze, MIT Press 1999.
     *
     * @param CONTENT-TERMS
     * 		a list of stringp, representing terms of interest for
     * 		a query to an Information Retrieval engine.
     * @param CORPUS
     * 		a stringp determining which corpus should be target for collecting
     * 		the statistics which will be used to augment the set of CONTENT-TERMS
     * @return a listp of stringp. These are intended to be strings that have a better
    chance at retrieving documents relevant to the query in CONTENT-TERMS than that
    query itself.
     * @unknown bertolo
     */
    @LispMethod(comment = "An implementation of an Information Retrieval technique known as pseudo-relevance\r\nfeedback. See page 566 of \'Foundations of Statistical Natural Language Processing\'\r\nby Manning and Schuetze, MIT Press 1999.\r\n\r\n@param CONTENT-TERMS\r\n\t\ta list of stringp, representing terms of interest for\r\n\t\ta query to an Information Retrieval engine.\r\n@param CORPUS\r\n\t\ta stringp determining which corpus should be target for collecting\r\n\t\tthe statistics which will be used to augment the set of CONTENT-TERMS\r\n@return a listp of stringp. These are intended to be strings that have a better\r\nchance at retrieving documents relevant to the query in CONTENT-TERMS than that\r\nquery itself.\r\n@unknown bertolo\nAn implementation of an Information Retrieval technique known as pseudo-relevance\nfeedback. See page 566 of \'Foundations of Statistical Natural Language Processing\'\nby Manning and Schuetze, MIT Press 1999.")
    public static SubLObject get_word_graph_connected_path_terms(final SubLObject content_terms, SubLObject corpus) {
        if (corpus == UNPROVIDED) {
            corpus = NIL;
        }
        assert NIL != consp(content_terms) : "! consp(content_terms) " + ("Types.consp(content_terms) " + "CommonSymbols.NIL != Types.consp(content_terms) ") + content_terms;
        assert NIL != stringp(corpus) : "! stringp(corpus) " + ("Types.stringp(corpus) " + "CommonSymbols.NIL != Types.stringp(corpus) ") + corpus;
        return methods.funcall_instance_method_with_1_args(graph.make_graph_from_string_lists(external_interfaces.get_word_graph(content_terms, list(list($$$index, corpus)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), GET_PATH_LABELS, content_terms);
    }

    static private final SubLList $list_alt14 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt15 = list(makeString("@return information-extraction-node-p\n   Crates a new information-extraction-node object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    public static SubLObject declare_information_extraction_file() {
        declareFunction("get_information_extraction_node_cycl_denotations", "GET-INFORMATION-EXTRACTION-NODE-CYCL-DENOTATIONS", 1, 0, false);
        declareFunction("set_information_extraction_node_cycl_denotations", "SET-INFORMATION-EXTRACTION-NODE-CYCL-DENOTATIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_information_extraction_node_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_information_extraction_node_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-NODE-INSTANCE", 1, 0, false);
        declareFunction("information_extraction_node_p", "INFORMATION-EXTRACTION-NODE-P", 1, 0, false);
        declareFunction("information_extraction_node_initialize_method", "INFORMATION-EXTRACTION-NODE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("information_extraction_node_cycl_denots_method", "INFORMATION-EXTRACTION-NODE-CYCL-DENOTS-METHOD", 1, 0, false);
        declareFunction("information_extraction_node_extract_cycl_method", "INFORMATION-EXTRACTION-NODE-EXTRACT-CYCL-METHOD", 1, 1, false);
        declareFunction("information_extraction_node_print_method", "INFORMATION-EXTRACTION-NODE-PRINT-METHOD", 3, 0, false);
        declareFunction("new_information_extraction_node", "NEW-INFORMATION-EXTRACTION-NODE", 1, 1, false);
        declareFunction("subloop_reserved_initialize_information_extraction_graph_class", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_information_extraction_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-INFORMATION-EXTRACTION-GRAPH-INSTANCE", 1, 0, false);
        declareFunction("information_extraction_graph_p", "INFORMATION-EXTRACTION-GRAPH-P", 1, 0, false);
        declareFunction("information_extraction_graph_initialize_method", "INFORMATION-EXTRACTION-GRAPH-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("information_extraction_graph_accept_node_method", "INFORMATION-EXTRACTION-GRAPH-ACCEPT-NODE-METHOD", 2, 0, false);
        declareFunction("information_extraction_graph_find_events_method", "INFORMATION-EXTRACTION-GRAPH-FIND-EVENTS-METHOD", 1, 0, false);
        declareFunction("new_information_extraction_graph", "NEW-INFORMATION-EXTRACTION-GRAPH", 1, 0, false);
        declareFunction("get_ie_market_position_supports", "GET-IE-MARKET-POSITION-SUPPORTS", 1, 0, false);
        declareFunction("set_ie_market_position_supports", "SET-IE-MARKET-POSITION-SUPPORTS", 2, 0, false);
        declareFunction("get_ie_market_position_binder", "GET-IE-MARKET-POSITION-BINDER", 1, 0, false);
        declareFunction("set_ie_market_position_binder", "SET-IE-MARKET-POSITION-BINDER", 2, 0, false);
        declareFunction("get_ie_market_position_funds", "GET-IE-MARKET-POSITION-FUNDS", 1, 0, false);
        declareFunction("set_ie_market_position_funds", "SET-IE-MARKET-POSITION-FUNDS", 2, 0, false);
        declareFunction("get_ie_market_position_sought", "GET-IE-MARKET-POSITION-SOUGHT", 1, 0, false);
        declareFunction("set_ie_market_position_sought", "SET-IE-MARKET-POSITION-SOUGHT", 2, 0, false);
        declareFunction("get_ie_market_position_on_sale", "GET-IE-MARKET-POSITION-ON-SALE", 1, 0, false);
        declareFunction("set_ie_market_position_on_sale", "SET-IE-MARKET-POSITION-ON-SALE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_ie_market_position_class", "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_ie_market_position_instance", "SUBLOOP-RESERVED-INITIALIZE-IE-MARKET-POSITION-INSTANCE", 1, 0, false);
        declareFunction("ie_market_position_p", "IE-MARKET-POSITION-P", 1, 0, false);
        declareFunction("get_variable_dictionary_dictionary", "GET-VARIABLE-DICTIONARY-DICTIONARY", 1, 0, false);
        declareFunction("set_variable_dictionary_dictionary", "SET-VARIABLE-DICTIONARY-DICTIONARY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_variable_dictionary_class", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_variable_dictionary_instance", "SUBLOOP-RESERVED-INITIALIZE-VARIABLE-DICTIONARY-INSTANCE", 1, 0, false);
        declareFunction("variable_dictionary_p", "VARIABLE-DICTIONARY-P", 1, 0, false);
        declareFunction("variable_dictionary_initialize_method", "VARIABLE-DICTIONARY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("variable_dictionary_keys_method", "VARIABLE-DICTIONARY-KEYS-METHOD", 1, 0, false);
        declareFunction("variable_dictionary_find_variable_taxonomic_pred_method", "VARIABLE-DICTIONARY-FIND-VARIABLE-TAXONOMIC-PRED-METHOD", 3, 0, false);
        declareFunction("variable_dictionary_pprint_method", "VARIABLE-DICTIONARY-PPRINT-METHOD", 1, 1, false);
        declareFunction("new_variable_dictionary", "NEW-VARIABLE-DICTIONARY", 1, 0, false);
        declareFunction("get_word_graph_connected_path_terms", "GET-WORD-GRAPH-CONNECTED-PATH-TERMS", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt18 = list(makeString("@return listp\n   Returns a list of Cyc denotations of the label of this node, if any."), list(makeSymbol("PWHEN"), makeSymbol("CYCL-DENOTATIONS"), list(RET, makeSymbol("CYCL-DENOTATIONS"))), list(makeSymbol("PWHEN"), makeSymbol("LABEL"), list(makeSymbol("CSETQ"), makeSymbol("CYCL-DENOTATIONS"), list(makeSymbol("NL-TRIE-ALL-DENOTS-OF-STRING"), makeSymbol("LABEL")))), list(RET, makeSymbol("CYCL-DENOTATIONS")));

    static private final SubLList $list_alt22 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt23 = list(makeSymbol("&OPTIONAL"), makeSymbol("FILTERS"));

    static private final SubLList $list_alt24 = list(makeString("@param FILTERS listp, expected to be a list of fort-p\n   @return listp\n   Returns all the elements of this node\'s cycl-denotations slot which are subsumed\n   by all the elements of FILTERS."), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("FILTERS"), makeSymbol("LISTP")), list(makeSymbol("PUNLESS"), makeSymbol("FILTERS"), list(RET, makeSymbol("CYCL-DENOTATIONS"))), list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TERM"), makeSymbol("CYCL-DENOTATIONS")), list(makeSymbol("CLET"), list(makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("FILTER"), makeSymbol("FILTERS"), makeSymbol("FAIL")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), list(makeSymbol("CNOT"), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("TERM"), makeSymbol("FILTER"))))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CPUSH"), makeSymbol("TERM"), makeSymbol("FILTERED"))))), list(RET, makeSymbol("FILTERED"))));

    static private final SubLList $list_alt29 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt30 = list(makeString("@param STREAM streamp\n   @param DEPTH integerp\n   Prints this INFORMATION-EXTRACTION-NODE to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<IEN: "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("LABEL"), makeSymbol("STREAM")), list(makeSymbol("PWHEN"), makeSymbol("CYCL-DENOTATIONS"), list(makeSymbol("WRITE-STRING"), makeString(" -> "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), list(makeSymbol("PRIN1-TO-STRING"), makeSymbol("CYCL-DENOTATIONS")), makeSymbol("STREAM"))), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")));

    static private final SubLString $str_alt32$__IEN__ = makeString("#<IEN: ");

    static private final SubLString $str_alt33$____ = makeString(" -> ");

    static private final SubLString $str_alt34$_ = makeString(">");

    static private final SubLList $list_alt41 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACCEPT-NODE"), list(makeSymbol("NEW-NODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    public static SubLObject init_information_extraction_file() {
        return NIL;
    }

    static private final SubLList $list_alt52 = list(makeString("@return information-extraction-graph-p\n   Returns a new information-extraction-graph object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

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

    static private final SubLList $list_alt55 = list(makeSymbol("NEW-NODE"));

    static private final SubLList $list_alt56 = list(makeString("@param NEW-NODE information-extraction-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph, NIL otherwise."), list(RET, list(makeSymbol("INFORMATION-EXTRACTION-NODE-P"), makeSymbol("NEW-NODE"))));

    static private final SubLList $list_alt59 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EVENTS"), NIL)), list(makeSymbol("DO-GRAPH-NODES"), list(makeSymbol("NODE"), makeSymbol("SELF")), list(makeSymbol("CPUSHNEW"), list(makeSymbol("FIM"), makeSymbol("NODE"), list(QUOTE, makeSymbol("EXTRACT-CYCL")), list(QUOTE, list(reader_make_constant_shell("Event")))), makeSymbol("EVENTS"))), list(RET, makeSymbol("EVENTS"))));

    static private final SubLList $list_alt60 = list(reader_make_constant_shell("Event"));

    static private final SubLList $list_alt68 = list(list(makeSymbol("ON-SALE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SOUGHT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("FUNDS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("BINDER"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("SUPPORTS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")));

    static private final SubLList $list_alt77 = list(list(makeSymbol("DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    static private final SubLList $list_alt81 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt84 = list(list(RET, list(makeSymbol("DICTIONARY-KEYS"), makeSymbol("DICTIONARY"))));

    static private final SubLList $list_alt88 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list_alt89 = list(makeSymbol("VAR"), makeSymbol("TAXPRED"));

    static private final SubLList $list_alt90 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("HL-VAR?"), makeSymbol("VAR")), list(makeSymbol("EL-VAR?"), makeSymbol("VAR"))), makeString("~%~S is not a variable!"), makeSymbol("VAR")), list(makeSymbol("MUST"), list(makeSymbol("MEMBER"), makeSymbol("TAXPRED"), list(QUOTE, list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls")))), makeString("~%~S is not a taxonomic predicate!"), makeSymbol("TAXPRED")), list(makeSymbol("CLET"), list(list(makeSymbol("LITERALS"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("DICTIONARY"), makeSymbol("VAR"))), list(makeSymbol("TYPES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("LITERAL"), makeSymbol("LITERALS")), list(makeSymbol("CLET"), list(list(makeSymbol("PRED"), list(makeSymbol("LITERAL-ARG0"), makeSymbol("LITERAL"))), makeSymbol("TYPE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(EQL, makeSymbol("TAXPRED"), makeSymbol("PRED")), list(EQL, makeSymbol("VAR"), list(makeSymbol("LITERAL-ARG1"), makeSymbol("LITERAL")))), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), list(makeSymbol("LITERAL-ARG2"), makeSymbol("LITERAL")))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("HL-VAR?"), makeSymbol("TYPE")), list(makeSymbol("EL-VAR?"), makeSymbol("TYPE"))), list(makeSymbol("CSETQ"), makeSymbol("TYPE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FIND-VARIABLE-TAXONOMIC-PRED")), makeSymbol("TYPE"), reader_make_constant_shell("genls")))), list(makeSymbol("PWHEN"), makeSymbol("TYPE"), list(makeSymbol("CPUSHNEW"), makeSymbol("TYPE"), makeSymbol("TYPES"))))), list(RET, makeSymbol("TYPES"))));

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
    }

    static private final SubLString $str_alt92$___S_is_not_a_variable_ = makeString("~%~S is not a variable!");

    static private final SubLList $list_alt93 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"));

    static private final SubLString $str_alt94$___S_is_not_a_taxonomic_predicate = makeString("~%~S is not a taxonomic predicate!");

    static private final SubLList $list_alt98 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T));

    static private final SubLList $list_alt99 = list(list(makeSymbol("PRINT-DICTIONARY-CONTENTS"), makeSymbol("DICTIONARY"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));
}

/**
 * Total time: 285 ms synthetic
 */
