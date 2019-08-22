package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.term;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class graph extends SubLTranslatedFile {
    public static final SubLFile me = new graph();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.graph";

    public static final String myFingerPrint = "18095250d0f9b0e28d79bf844eb9fda36ae5ce517cab88c63dc5f44e0e5487a1";

    // Internal Constants
    public static final SubLSymbol GRAPH_NODE = makeSymbol("GRAPH-NODE");



    public static final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("CORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LABEL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ID"), list(makeSymbol("NUM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CORE"), list(makeSymbol("OBJ")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LABEL"), list(makeSymbol("STR")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LABEL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CORE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ID"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PROTECTED")) });









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-INSTANCE");



    public static final SubLList $list12 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list13 = list(makeString("@return a new GRAPH-NODE"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol GRAPH_NODE_INITIALIZE_METHOD = makeSymbol("GRAPH-NODE-INITIALIZE-METHOD");

    public static final SubLSymbol SET_ID = makeSymbol("SET-ID");

    public static final SubLList $list16 = list(makeSymbol("NUM"));

    public static final SubLList $list17 = list(makeString("@param NUM integerp\n   @return graph-node-p\n   Sets the id of this object to NUM"), list(makeSymbol("CHECK-TYPE"), makeSymbol("NUM"), makeSymbol("INTEGERP")), list(makeSymbol("CSETQ"), makeSymbol("ID"), makeSymbol("NUM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");



    public static final SubLSymbol GRAPH_NODE_SET_ID_METHOD = makeSymbol("GRAPH-NODE-SET-ID-METHOD");

    public static final SubLSymbol SET_CORE = makeSymbol("SET-CORE");

    public static final SubLList $list22 = list(makeSymbol("OBJECT"), makeSymbol("&OPTIONAL"), makeSymbol("GRAPH"));

    public static final SubLList $list23 = list(makeString("@param OBJECT anything atall\n   @return graph-node-p\n   Sets the core of this object to OBJECT"), list(makeSymbol("CSETQ"), makeSymbol("CORE"), makeSymbol("OBJECT")), list(makeSymbol("PWHEN"), list(makeSymbol("GRAPH-P"), makeSymbol("GRAPH")), list(makeSymbol("DICTIONARY-ENTER"), list(makeSymbol("GET-SLOT"), makeSymbol("GRAPH"), list(makeSymbol("QUOTE"), makeSymbol("CORE-NODE-MAP"))), makeSymbol("CORE"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");

    public static final SubLSymbol CORE_NODE_MAP = makeSymbol("CORE-NODE-MAP");

    public static final SubLSymbol GRAPH_NODE_SET_CORE_METHOD = makeSymbol("GRAPH-NODE-SET-CORE-METHOD");

    public static final SubLSymbol SET_LABEL = makeSymbol("SET-LABEL");

    public static final SubLList $list28 = list(makeSymbol("STRING"));

    public static final SubLList $list29 = list(makeString("@param STRING stringp\n   @return graph-node-p\n   Sets the label of this object to STRING"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("LABEL"), makeSymbol("STRING")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");



    public static final SubLSymbol GRAPH_NODE_SET_LABEL_METHOD = makeSymbol("GRAPH-NODE-SET-LABEL-METHOD");

    public static final SubLSymbol GET_LABEL = makeSymbol("GET-LABEL");

    public static final SubLList $list34 = list(makeString("@return stringp\n   Returns the label of this object if it has one, otherwise the empty string."), list(makeSymbol("PIF"), makeSymbol("LABEL"), list(makeSymbol("RET"), makeSymbol("LABEL")), list(makeSymbol("RET"), makeString(""))));

    public static final SubLSymbol $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");

    public static final SubLString $str36$ = makeString("");

    public static final SubLSymbol GRAPH_NODE_GET_LABEL_METHOD = makeSymbol("GRAPH-NODE-GET-LABEL-METHOD");

    public static final SubLSymbol GET_CORE = makeSymbol("GET-CORE");

    public static final SubLList $list39 = list(makeString("@return anything\n   Returns the core of this object if it has one, otherwise nil"), list(makeSymbol("RET"), makeSymbol("CORE")));

    public static final SubLSymbol $sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");

    public static final SubLSymbol GRAPH_NODE_GET_CORE_METHOD = makeSymbol("GRAPH-NODE-GET-CORE-METHOD");



    public static final SubLList $list43 = list(makeString("@return integerp\n   Returns the id of this object if it has one, otherwise nil"), list(makeSymbol("RET"), makeSymbol("ID")));

    public static final SubLSymbol $sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");

    public static final SubLSymbol GRAPH_NODE_GET_ID_METHOD = makeSymbol("GRAPH-NODE-GET-ID-METHOD");



    public static final SubLList $list47 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list48 = list(makeString("Prints GRAPH-NODE to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("STREAM")), list(makeSymbol("PWHEN"), list(makeSymbol("NUMBERP"), makeSymbol("ID")), list(makeSymbol("WRITE-STRING"), list(makeSymbol("CCONCATENATE"), makeString("-"), list(makeSymbol("FORMAT"), NIL, makeString("~D"), makeSymbol("ID"))), makeSymbol("STREAM"))), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeSymbol("LABEL"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")));

    public static final SubLSymbol $sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-NODE-METHOD");

    public static final SubLString $str50$__ = makeString("#<");

    public static final SubLString $str51$_ = makeString("-");

    public static final SubLString $str52$_D = makeString("~D");

    public static final SubLString $str53$__ = makeString(": ");

    public static final SubLString $str54$_ = makeString(">");

    public static final SubLSymbol GRAPH_NODE_PRINT_METHOD = makeSymbol("GRAPH-NODE-PRINT-METHOD");

    public static final SubLSymbol GRAPH_EDGE = makeSymbol("GRAPH-EDGE");

    public static final SubLList $list57 = list(new SubLObject[]{ list(makeSymbol("FROM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LABEL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("MAKE-EDGE"), list(makeSymbol("FROM-NODE"), makeSymbol("TO-NODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FROM"), list(makeSymbol("NUM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TO"), list(makeSymbol("NUM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TO"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LABEL"), list(makeSymbol("STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LABEL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), NIL, makeKeyword("PUBLIC")) });





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-INSTANCE");

    public static final SubLSymbol MAKE_EDGE = makeSymbol("MAKE-EDGE");

    public static final SubLList $list63 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list64 = list(makeSymbol("FROM-NODE"), makeSymbol("TO-NODE"));

    public static final SubLList $list65 = list(makeString("@param TO-NODE graph-node-p\n   @param FROM-NODE graph-node-p\n   @return graph-edge-p if both nodes have appropriate ids and NIL otherwise.\n   Creates an edge object connecting TO-NODE to FROM-NODE"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TO-NODE"), makeSymbol("GRAPH-NODE-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("FROM-NODE"), makeSymbol("GRAPH-NODE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("FID"), list(makeSymbol("GET-SLOT"), makeSymbol("FROM-NODE"), list(makeSymbol("QUOTE"), makeSymbol("ID")))), list(makeSymbol("TID"), list(makeSymbol("GET-SLOT"), makeSymbol("TO-NODE"), list(makeSymbol("QUOTE"), makeSymbol("ID")))), list(makeSymbol("NEW-EDGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("FID")), list(makeSymbol("NUMBERP"), makeSymbol("TID"))), list(makeSymbol("FIM"), makeSymbol("NEW-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("SET-FROM")), makeSymbol("FID")), list(makeSymbol("FIM"), makeSymbol("NEW-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("SET-TO")), makeSymbol("TID")), list(makeSymbol("RET"), makeSymbol("NEW-EDGE")))));



    public static final SubLSymbol SET_FROM = makeSymbol("SET-FROM");

    public static final SubLSymbol SET_TO = makeSymbol("SET-TO");

    public static final SubLSymbol GRAPH_EDGE_MAKE_EDGE_METHOD = makeSymbol("GRAPH-EDGE-MAKE-EDGE-METHOD");

    public static final SubLList $list70 = list(makeString("@return a new graph-edge object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol GRAPH_EDGE_INITIALIZE_METHOD = makeSymbol("GRAPH-EDGE-INITIALIZE-METHOD");

    public static final SubLList $list72 = list(makeString("@param NUM integerp\n   @return graph-edge-p\n   Sets the \'from\' slot of this object to NUM"), list(makeSymbol("CHECK-TYPE"), makeSymbol("NUM"), makeSymbol("INTEGERP")), list(makeSymbol("CSETQ"), makeSymbol("FROM"), makeSymbol("NUM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");

    public static final SubLSymbol GRAPH_EDGE_SET_FROM_METHOD = makeSymbol("GRAPH-EDGE-SET-FROM-METHOD");

    public static final SubLList $list75 = list(makeString("@param NUM integerp\n   @return graph-edge-p\n   Sets the \'to\' slot of this object to NUM"), list(makeSymbol("CHECK-TYPE"), makeSymbol("NUM"), makeSymbol("INTEGERP")), list(makeSymbol("CSETQ"), makeSymbol("TO"), makeSymbol("NUM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");

    public static final SubLSymbol GRAPH_EDGE_SET_TO_METHOD = makeSymbol("GRAPH-EDGE-SET-TO-METHOD");

    public static final SubLSymbol GET_FROM = makeSymbol("GET-FROM");

    public static final SubLList $list79 = list(makeString("@return integer-p; the id of the node at from-end of this edge"), list(makeSymbol("RET"), makeSymbol("FROM")));

    public static final SubLSymbol $sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");

    public static final SubLSymbol GRAPH_EDGE_GET_FROM_METHOD = makeSymbol("GRAPH-EDGE-GET-FROM-METHOD");

    public static final SubLSymbol GET_TO = makeSymbol("GET-TO");

    public static final SubLList $list83 = list(makeString("@return integer-p; the id of the node at to-end of this edge"), list(makeSymbol("RET"), makeSymbol("TO")));

    public static final SubLSymbol $sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");

    public static final SubLSymbol GRAPH_EDGE_GET_TO_METHOD = makeSymbol("GRAPH-EDGE-GET-TO-METHOD");

    public static final SubLList $list86 = list(makeString("@param STRING stringp\n   @return graph-edge-p\n   Sets the label slot of this object to STRING"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CSETQ"), makeSymbol("LABEL"), makeSymbol("STRING")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");

    public static final SubLSymbol GRAPH_EDGE_SET_LABEL_METHOD = makeSymbol("GRAPH-EDGE-SET-LABEL-METHOD");

    public static final SubLSymbol $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");

    public static final SubLSymbol GRAPH_EDGE_GET_LABEL_METHOD = makeSymbol("GRAPH-EDGE-GET-LABEL-METHOD");

    public static final SubLList $list91 = list(new SubLObject[]{ makeString("@param STREAM streamp\n   @param DEPTH integerp\n   Prints this GRAPH-EDGE to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("PRIN1-TO-STRING"), makeSymbol("FROM")), makeString("--")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), list(makeSymbol("FORMAT"), NIL, makeString("~A"), makeSymbol("LABEL")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), list(makeSymbol("CCONCATENATE"), makeString("->"), list(makeSymbol("PRIN1-TO-STRING"), makeSymbol("TO"))), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")) });

    public static final SubLSymbol $sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-EDGE-METHOD");

    public static final SubLString $str93$__ = makeString("--");

    public static final SubLString $str94$_A = makeString("~A");

    public static final SubLString $str95$__ = makeString("->");

    public static final SubLSymbol GRAPH_EDGE_PRINT_METHOD = makeSymbol("GRAPH-EDGE-PRINT-METHOD");



    public static final SubLList $list98 = list(new SubLObject[]{ list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LABEL-NODE-MAP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NODES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LABEL-EDGE-MAP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EDGES-SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EDGES-TARGET"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CORE-NODE-MAP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACCEPT-NODE"), list(makeSymbol("NEW-NODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACCEPT-EDGE"), list(makeSymbol("NEW-NODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-NODE"), list(makeSymbol("NEW-NODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EDGE"), list(makeSymbol("EDGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-EDGE"), list(makeSymbol("EDGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EDGES-FROM"), list(makeSymbol("ID")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EDGES-TO"), list(makeSymbol("ID")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EDGES-FROM-NODE"), list(makeSymbol("NODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EDGES-TO-NODE"), list(makeSymbol("NODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PATH-LABELS"), list(makeSymbol("TERMS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COLLECT-ASCENDING"), list(makeSymbol("NODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COLLECT-ALL-ASCENDING"), list(makeSymbol("NODE-LIST")), makeKeyword("PUBLIC")) });





    public static final SubLSymbol LABEL_EDGE_MAP = makeSymbol("LABEL-EDGE-MAP");



    public static final SubLSymbol LABEL_NODE_MAP = makeSymbol("LABEL-NODE-MAP");

    public static final SubLSymbol INTEGER_SEQUENCE_GENERATOR = makeSymbol("INTEGER-SEQUENCE-GENERATOR");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GRAPH_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GRAPH_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GRAPH-INSTANCE");

    public static final SubLList $list108 = list(new SubLObject[]{ makeString("@return a new graph object"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTEGER-SEQUENCE-GENERATOR"), list(makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("NODES"), list(makeSymbol("NEW-DICTIONARY"))), list(makeSymbol("CSETQ"), makeSymbol("EDGES-SOURCE"), list(makeSymbol("NEW-DICTIONARY"))), list(makeSymbol("CSETQ"), makeSymbol("EDGES-TARGET"), list(makeSymbol("NEW-DICTIONARY"))), list(makeSymbol("CSETQ"), makeSymbol("LABEL-NODE-MAP"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUAL))), list(makeSymbol("CSETQ"), makeSymbol("LABEL-EDGE-MAP"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUAL))), list(makeSymbol("CSETQ"), makeSymbol("CORE-NODE-MAP"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUALP))), list(makeSymbol("RET"), makeSymbol("SELF")) });

    public static final SubLSymbol $sym109$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_INITIALIZE_METHOD = makeSymbol("GRAPH-INITIALIZE-METHOD");

    public static final SubLSymbol ACCEPT_NODE = makeSymbol("ACCEPT-NODE");

    public static final SubLList $list112 = list(makeSymbol("NEW-NODE"));

    public static final SubLList $list113 = list(makeString("@param NEW-NODE graph-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph object, NIL otherwise"), list(makeSymbol("RET"), list(makeSymbol("GRAPH-NODE-P"), makeSymbol("NEW-NODE"))));

    public static final SubLSymbol GRAPH_ACCEPT_NODE_METHOD = makeSymbol("GRAPH-ACCEPT-NODE-METHOD");

    public static final SubLSymbol ACCEPT_EDGE = makeSymbol("ACCEPT-EDGE");

    public static final SubLList $list116 = list(makeSymbol("NEW-EDGE"));

    public static final SubLList $list117 = list(makeString("@param NEW-EDGE graph-edge-p\n   @return boolean, T if NEW-EDGE is acceptable for this graph object, NIL otherwise"), list(makeSymbol("RET"), list(makeSymbol("GRAPH-EDGE-P"), makeSymbol("NEW-EDGE"))));

    public static final SubLSymbol GRAPH_ACCEPT_EDGE_METHOD = makeSymbol("GRAPH-ACCEPT-EDGE-METHOD");

    public static final SubLSymbol ADD_NODE = makeSymbol("ADD-NODE");

    public static final SubLList $list120 = list(makeString("@param NEW-NODE graph-node-p\n   @return graph-p\n   Adds NEW-NODE to this graph object"), list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ACCEPT-NODE")), makeSymbol("NEW-NODE")), list(makeSymbol("WARN"), makeString("~%Cannot add node ~S"), makeSymbol("NEW-NODE")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("NODE-ID"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-NODE"), list(makeSymbol("QUOTE"), makeSymbol("ID")))), list(makeSymbol("NODE-LABEL"), list(makeSymbol("FIM"), makeSymbol("NEW-NODE"), list(makeSymbol("QUOTE"), makeSymbol("GET-LABEL")))), list(makeSymbol("NODE-CORE"), list(makeSymbol("FIM"), makeSymbol("NEW-NODE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORE"))))), list(makeSymbol("PUNLESS"), makeSymbol("NODE-ID"), list(makeSymbol("CSETQ"), makeSymbol("NODE-ID"), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-NEXT"), makeSymbol("INTEGER-SEQUENCE-GENERATOR"))), list(makeSymbol("FIM"), makeSymbol("NEW-NODE"), list(makeSymbol("QUOTE"), makeSymbol("SET-ID")), makeSymbol("NODE-ID"))), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("NODES"), makeSymbol("NODE-ID"), makeSymbol("NEW-NODE")), list(makeSymbol("PWHEN"), makeSymbol("NODE-LABEL"), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("LABEL-NODE-MAP"), makeSymbol("NODE-LABEL"), makeSymbol("NEW-NODE"))), list(makeSymbol("PWHEN"), makeSymbol("NODE-CORE"), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("CORE-NODE-MAP"), makeSymbol("NODE-CORE"), makeSymbol("NEW-NODE")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym121$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLString $str122$__Cannot_add_node__S = makeString("~%Cannot add node ~S");

    public static final SubLSymbol GRAPH_ADD_NODE_METHOD = makeSymbol("GRAPH-ADD-NODE-METHOD");

    public static final SubLSymbol GET_NODE_BY_ID = makeSymbol("GET-NODE-BY-ID");

    public static final SubLList $list125 = list(makeSymbol("ID"));

    public static final SubLList $list126 = list(makeString("@param ID integerp\n   @return graph-node-p\n   Returns the node in this graph which has ID as its id, if any."), list(makeSymbol("CHECK-TYPE"), makeSymbol("ID"), makeSymbol("INTEGERP")), list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("NODES"), makeSymbol("ID"))));

    public static final SubLSymbol $sym127$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_GET_NODE_BY_ID_METHOD = makeSymbol("GRAPH-GET-NODE-BY-ID-METHOD");

    public static final SubLSymbol GET_NODE_BY_LABEL = makeSymbol("GET-NODE-BY-LABEL");

    public static final SubLList $list130 = list(makeString("@param STRING stringp\n   @return graph-node-p\n   Returns the node in this graph which has STRING as its label, if any."), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("LABEL-NODE-MAP"), makeSymbol("STRING"))));

    public static final SubLSymbol $sym131$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_GET_NODE_BY_LABEL_METHOD = makeSymbol("GRAPH-GET-NODE-BY-LABEL-METHOD");

    public static final SubLSymbol GET_NODE_BY_CORE = makeSymbol("GET-NODE-BY-CORE");

    public static final SubLList $list134 = list(makeSymbol("OBJECT"));

    public static final SubLList $list135 = list(makeString("@param OBJECT\n   @return graph-node-p\n   Returns the node in this graph which has OBJECT as its core, if any."), list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("CORE-NODE-MAP"), makeSymbol("OBJECT"))));

    public static final SubLSymbol $sym136$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_GET_NODE_BY_CORE_METHOD = makeSymbol("GRAPH-GET-NODE-BY-CORE-METHOD");

    public static final SubLSymbol ADD_EDGE = makeSymbol("ADD-EDGE");

    public static final SubLList $list139 = list(makeString("@param NEW-EDGE graph-edge-p\n   @return graph-p\n   Adds NEW-EDGE to this "), list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ACCEPT-EDGE")), makeSymbol("NEW-EDGE")), list(makeSymbol("WARN"), makeString("~%Cannot add edge ~S"), makeSymbol("NEW-EDGE")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("LABEL"), list(makeSymbol("FIM"), makeSymbol("NEW-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-LABEL")))), list(makeSymbol("SOURCE"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("FROM")))), list(makeSymbol("TARGET"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("TO"))))), list(makeSymbol("DICTIONARY-PUSH"), makeSymbol("EDGES-SOURCE"), makeSymbol("SOURCE"), makeSymbol("NEW-EDGE")), list(makeSymbol("DICTIONARY-PUSH"), makeSymbol("EDGES-TARGET"), makeSymbol("TARGET"), makeSymbol("NEW-EDGE")), list(makeSymbol("PUNLESS"), list(makeSymbol("EMPTY-STRING-P"), makeSymbol("LABEL")), list(makeSymbol("DICTIONARY-PUSH"), makeSymbol("LABEL-EDGE-MAP"), makeSymbol("LABEL"), makeSymbol("NEW-EDGE")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym140$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLString $str141$__Cannot_add_edge__S = makeString("~%Cannot add edge ~S");

    public static final SubLSymbol GRAPH_ADD_EDGE_METHOD = makeSymbol("GRAPH-ADD-EDGE-METHOD");

    public static final SubLSymbol REMOVE_EDGE = makeSymbol("REMOVE-EDGE");

    public static final SubLList $list144 = list(makeSymbol("EDGE"));

    public static final SubLList $list145 = list(makeString("@param EDGE graph-edge-p\n   @return graph-p\n   Removes EDGE from this "), list(makeSymbol("CHECK-TYPE"), makeSymbol("EDGE"), makeSymbol("GRAPH-EDGE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("LABEL"), list(makeSymbol("FIM"), makeSymbol("EDGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-LABEL")))), list(makeSymbol("SOURCE"), list(makeSymbol("GET-SLOT"), makeSymbol("EDGE"), list(makeSymbol("QUOTE"), makeSymbol("FROM")))), list(makeSymbol("TARGET"), list(makeSymbol("GET-SLOT"), makeSymbol("EDGE"), list(makeSymbol("QUOTE"), makeSymbol("TO"))))), list(makeSymbol("DICTIONARY-REMOVE"), makeSymbol("EDGES-SOURCE"), makeSymbol("SOURCE")), list(makeSymbol("DICTIONARY-REMOVE"), makeSymbol("EDGES-TARGET"), makeSymbol("TARGET")), list(makeSymbol("DICTIONARY-REMOVE"), makeSymbol("LABEL-EDGE-MAP"), makeSymbol("LABEL"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym146$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_EDGE_P = makeSymbol("GRAPH-EDGE-P");

    public static final SubLSymbol GRAPH_REMOVE_EDGE_METHOD = makeSymbol("GRAPH-REMOVE-EDGE-METHOD");

    public static final SubLSymbol GET_EDGES_FROM = makeSymbol("GET-EDGES-FROM");

    public static final SubLList $list150 = list(makeString("@param ID integerp\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph starting at node with id ID"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ID"), makeSymbol("INTEGERP")), list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EDGES-SOURCE"), makeSymbol("ID"))));

    public static final SubLSymbol $sym151$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_GET_EDGES_FROM_METHOD = makeSymbol("GRAPH-GET-EDGES-FROM-METHOD");

    public static final SubLSymbol GET_EDGES_TO = makeSymbol("GET-EDGES-TO");

    public static final SubLList $list154 = list(makeString("@param ID integerp\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph pointing at node with id ID"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ID"), makeSymbol("INTEGERP")), list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EDGES-TARGET"), makeSymbol("ID"))));

    public static final SubLSymbol $sym155$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_GET_EDGES_TO_METHOD = makeSymbol("GRAPH-GET-EDGES-TO-METHOD");

    public static final SubLSymbol GET_EDGES_FROM_NODE = makeSymbol("GET-EDGES-FROM-NODE");

    public static final SubLList $list158 = list(makeSymbol("NODE"));

    public static final SubLList $list159 = list(makeString("@param NODE graph-node-p\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph starting at node with id ID"), list(makeSymbol("CHECK-TYPE"), makeSymbol("NODE"), makeSymbol("GRAPH-NODE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("NODE-ID"), list(makeSymbol("FIM"), makeSymbol("NODE"), list(makeSymbol("QUOTE"), makeSymbol("GET-ID"))))), list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EDGES-SOURCE"), makeSymbol("NODE-ID")))));

    public static final SubLSymbol $sym160$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_GET_EDGES_FROM_NODE_METHOD = makeSymbol("GRAPH-GET-EDGES-FROM-NODE-METHOD");

    public static final SubLSymbol GET_EDGES_TO_NODE = makeSymbol("GET-EDGES-TO-NODE");

    public static final SubLList $list163 = list(makeString("@param ID integerp\n   @return listp of graph-edge-p\n   Returns the list of all the edges of this graph pointing at node with id ID"), list(makeSymbol("CHECK-TYPE"), makeSymbol("NODE"), makeSymbol("GRAPH-NODE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("NODE-ID"), list(makeSymbol("FIM"), makeSymbol("NODE"), list(makeSymbol("QUOTE"), makeSymbol("GET-ID"))))), list(makeSymbol("RET"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EDGES-TARGET"), makeSymbol("NODE-ID")))));

    public static final SubLSymbol $sym164$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_GET_EDGES_TO_NODE_METHOD = makeSymbol("GRAPH-GET-EDGES-TO-NODE-METHOD");

    public static final SubLSymbol GET_NODES_FROM_NODE = makeSymbol("GET-NODES-FROM-NODE");

    public static final SubLList $list167 = list(makeString("@param NODE graph-node-p\n   @return listp of graph-edge-p\n   Returns the list of all the child-nodes of this graph starting at node with id ID"), list(makeSymbol("CHECK-TYPE"), makeSymbol("NODE"), makeSymbol("GRAPH-NODE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("EDGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-EDGES-FROM-NODE")), makeSymbol("NODE"))), list(makeSymbol("CLET"), list(list(makeSymbol("NODE-ID"), list(makeSymbol("FIM"), makeSymbol("EDGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-TO"))))), list(makeSymbol("CPUSH"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("NODES"), makeSymbol("NODE-ID")), makeSymbol("RESULT")))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym168$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_GET_NODES_FROM_NODE_METHOD = makeSymbol("GRAPH-GET-NODES-FROM-NODE-METHOD");

    public static final SubLSymbol GET_NODES_TO_NODE = makeSymbol("GET-NODES-TO-NODE");

    public static final SubLList $list171 = list(makeString("@param NODE graph-node-p\n   @return listp of graph-edge-p\n   Returns the list of all the parent nodes of this graph starting at node with id ID"), list(makeSymbol("CHECK-TYPE"), makeSymbol("NODE"), makeSymbol("GRAPH-NODE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("EDGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-EDGES-TO-NODE")))), list(makeSymbol("CLET"), list(list(makeSymbol("NODE-ID"), list(makeSymbol("FIM"), makeSymbol("EDGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-TO"))))), list(makeSymbol("CPUSH"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("NODES"), makeSymbol("NODE-ID")), makeSymbol("RESULT")))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym172$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_GET_NODES_TO_NODE_METHOD = makeSymbol("GRAPH-GET-NODES-TO-NODE-METHOD");

    public static final SubLSymbol GET_PATH_LABELS = makeSymbol("GET-PATH-LABELS");

    public static final SubLList $list175 = list(makeSymbol("TERMS"));

    public static final SubLList $list176 = list(makeString("@param TERMS listp; a list of strings whose connecting graph labels are to be returned\n   @return listp; the list of strings that connect TERMS in this graph"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TERMS"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-NODES"), NIL), list(makeSymbol("ASCENDING-LABELS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TERM"), makeSymbol("TERMS")), list(makeSymbol("CDOLIST"), list(makeSymbol("TOKEN"), list(makeSymbol("SPLIT-STRING"), makeSymbol("TERM"))), list(makeSymbol("CLET"), list(list(makeSymbol("NODE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-NODE-BY-LABEL")), makeSymbol("TOKEN")))), list(makeSymbol("PWHEN"), list(makeSymbol("GRAPH-NODE-P"), makeSymbol("NODE")), list(makeSymbol("CPUSH"), makeSymbol("NODE"), makeSymbol("TARGET-NODES")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ASCENDING"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("COLLECT-ALL-ASCENDING")), makeSymbol("TARGET-NODES"))), list(makeSymbol("CPUSH"), list(makeSymbol("GET-SLOT"), makeSymbol("ASCENDING"), list(makeSymbol("QUOTE"), makeSymbol("LABEL"))), makeSymbol("ASCENDING-LABELS"))), list(makeSymbol("RET"), makeSymbol("ASCENDING-LABELS"))));



    public static final SubLSymbol COLLECT_ALL_ASCENDING = makeSymbol("COLLECT-ALL-ASCENDING");

    public static final SubLSymbol GRAPH_GET_PATH_LABELS_METHOD = makeSymbol("GRAPH-GET-PATH-LABELS-METHOD");

    public static final SubLSymbol COLLECT_ASCENDING = makeSymbol("COLLECT-ASCENDING");

    public static final SubLList $list181 = list(makeString("@param NODE graph-node-p\n   @return list of graph-node-p\n   Returns the list of all nodes in this graph from which NODE can be reached\n   following the graph\'s edges."), list(makeSymbol("CHECK-TYPE"), makeSymbol("NODE"), makeSymbol("GRAPH-NODE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("MARKS"), list(makeSymbol("MAKE-HASH-TABLE"), EIGHT_INTEGER)), list(makeSymbol("NODE-ID"), list(makeSymbol("GET-SLOT"), makeSymbol("NODE"), list(makeSymbol("QUOTE"), makeSymbol("ID")))), list(makeSymbol("EDGES"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EDGES-TARGET"), makeSymbol("NODE-ID"))), makeSymbol("COLLECTED-NODES")), list(makeSymbol("SETHASH"), makeSymbol("NODE-ID"), makeSymbol("MARKS"), T), list(makeSymbol("WHILE"), makeSymbol("EDGES"), list(makeSymbol("CLET"), list(list(makeSymbol("TOP-EDGE"), list(makeSymbol("CAR"), makeSymbol("EDGES"))), list(makeSymbol("OTHER-EDGES"), list(makeSymbol("CDR"), makeSymbol("EDGES"))), list(makeSymbol("FROM-NODE-ID"), list(makeSymbol("GET-SLOT"), makeSymbol("TOP-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("FROM"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("GETHASH"), makeSymbol("FROM-NODE-ID"), makeSymbol("MARKS")), list(makeSymbol("CSETQ"), makeSymbol("EDGES"), makeSymbol("OTHER-EDGES"))), list(T, list(makeSymbol("SETHASH"), makeSymbol("FROM-NODE-ID"), makeSymbol("MARKS"), T), list(makeSymbol("CSETQ"), makeSymbol("EDGES"), list(makeSymbol("APPEND"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EDGES-TARGET"), makeSymbol("FROM-NODE-ID")), makeSymbol("OTHER-EDGES"))))))), list(makeSymbol("CDOHASH"), list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("MARKS")), list(makeSymbol("IGNORE"), makeSymbol("VALUE")), list(makeSymbol("CPUSH"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("NODES"), makeSymbol("KEY")), makeSymbol("COLLECTED-NODES"))), list(makeSymbol("RET"), makeSymbol("COLLECTED-NODES"))));

    public static final SubLSymbol $sym182$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_COLLECT_ASCENDING_METHOD = makeSymbol("GRAPH-COLLECT-ASCENDING-METHOD");

    public static final SubLList $list184 = list(makeSymbol("NODE-LIST"));

    public static final SubLList $list185 = list(makeString("@param NODE-LIST listp of graph-node-p\n   @return list of graph-node-p\n   Returns the list of all nodes in this graph from which any NODE in NODE-LIST can be reached\n   following the graph\'s edges."), list(makeSymbol("CHECK-TYPE"), makeSymbol("NODE-LIST"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("MARKS"), list(makeSymbol("MAKE-HASH-TABLE"), EIGHT_INTEGER)), list(makeSymbol("EDGES"), NIL), list(makeSymbol("COLLECTED-NODES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("NODE"), makeSymbol("NODE-LIST")), list(makeSymbol("PWHEN"), list(makeSymbol("GRAPH-NODE-P"), makeSymbol("NODE")), list(makeSymbol("CLET"), list(list(makeSymbol("NODE-ID"), list(makeSymbol("GET-SLOT"), makeSymbol("NODE"), list(makeSymbol("QUOTE"), makeSymbol("ID"))))), list(makeSymbol("CSETQ"), makeSymbol("EDGES"), list(makeSymbol("APPEND"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EDGES-TARGET"), makeSymbol("NODE-ID")), makeSymbol("EDGES"))), list(makeSymbol("SETHASH"), makeSymbol("NODE-ID"), makeSymbol("MARKS"), T)))), list(makeSymbol("WHILE"), makeSymbol("EDGES"), list(makeSymbol("CLET"), list(list(makeSymbol("TOP-EDGE"), list(makeSymbol("CAR"), makeSymbol("EDGES"))), list(makeSymbol("OTHER-EDGES"), list(makeSymbol("CDR"), makeSymbol("EDGES"))), list(makeSymbol("FROM-NODE-ID"), list(makeSymbol("GET-SLOT"), makeSymbol("TOP-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("FROM"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("GETHASH"), makeSymbol("FROM-NODE-ID"), makeSymbol("MARKS")), list(makeSymbol("CSETQ"), makeSymbol("EDGES"), makeSymbol("OTHER-EDGES"))), list(T, list(makeSymbol("SETHASH"), makeSymbol("FROM-NODE-ID"), makeSymbol("MARKS"), T), list(makeSymbol("CSETQ"), makeSymbol("EDGES"), list(makeSymbol("APPEND"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EDGES-TARGET"), makeSymbol("FROM-NODE-ID")), makeSymbol("OTHER-EDGES"))))))), list(makeSymbol("CDOHASH"), list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("MARKS")), list(makeSymbol("IGNORE"), makeSymbol("VALUE")), list(makeSymbol("CPUSH"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("NODES"), makeSymbol("KEY")), makeSymbol("COLLECTED-NODES"))), list(makeSymbol("RET"), makeSymbol("COLLECTED-NODES"))));

    public static final SubLSymbol $sym186$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLSymbol GRAPH_COLLECT_ALL_ASCENDING_METHOD = makeSymbol("GRAPH-COLLECT-ALL-ASCENDING-METHOD");

    public static final SubLList $list188 = list(makeString("@param STREAM streamp\n   @param DEPTH integerp\n   Prints this GRAPH to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), list(makeSymbol("PRIN1-TO-STRING"), list(makeSymbol("DICTIONARY-LENGTH"), makeSymbol("NODES"))), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" nodes"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")));

    public static final SubLSymbol $sym189$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLString $$$_nodes = makeString(" nodes");

    public static final SubLSymbol GRAPH_PRINT_METHOD = makeSymbol("GRAPH-PRINT-METHOD");

    public static final SubLSymbol PPRINT = makeSymbol("PPRINT");

    public static final SubLList $list193 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STREAM"), T));

    public static final SubLList $list194 = list(makeString("@param STREAM streamp\n   Pretty prints this GRAPH to STREAM, showing the contents of its nodes\n   and how they link to one another."), list(makeSymbol("WRITE-STRING"), makeString("#<"), makeSymbol("STREAM")), list(makeSymbol("PRINC"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("STREAM")), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("KEY"), makeSymbol("NODE-FROM"), makeSymbol("NODES")), list(makeSymbol("WRITE-STRING"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("STREAM")), list(makeSymbol("FIM"), makeSymbol("NODE-FROM"), list(makeSymbol("QUOTE"), makeSymbol("PRINT")), makeSymbol("STREAM"), NIL), list(makeSymbol("WRITE-STRING"), list(makeSymbol("CCONCATENATE"), makeSymbol("*NEW-LINE-STRING*"), makeString("   ")), makeSymbol("STREAM")), list(makeSymbol("CLET"), list(list(makeSymbol("EDGES"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("EDGES-SOURCE"), makeSymbol("KEY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("EDGE"), makeSymbol("EDGES")), list(makeSymbol("CLET"), list(list(makeSymbol("NODE-TO"), list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("NODES"), list(makeSymbol("GET-SLOT"), makeSymbol("EDGE"), list(makeSymbol("QUOTE"), makeSymbol("TO")))))), list(makeSymbol("WRITE-STRING"), makeString(" "), makeSymbol("STREAM")), list(makeSymbol("FIM"), makeSymbol("NODE-TO"), list(makeSymbol("QUOTE"), makeSymbol("PRINT")), makeSymbol("STREAM"), NIL))))), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")));

    public static final SubLSymbol $sym195$OUTER_CATCH_FOR_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GRAPH-METHOD");

    public static final SubLString $$$___ = makeString("   ");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLSymbol GRAPH_PPRINT_METHOD = makeSymbol("GRAPH-PPRINT-METHOD");

    public static final SubLList $list199 = list(list(makeSymbol("NODE"), makeSymbol("GRAPH"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym200$GRAPH_VAR = makeUninternedSymbol("GRAPH-VAR");









    public static final SubLList $list205 = list(list(makeSymbol("QUOTE"), makeSymbol("NODES")));

    public static final SubLList $list206 = list(makeSymbol("IGNORE"), makeSymbol("KEY"));

    public static final SubLSymbol CYC_GRAPH_NODE = makeSymbol("CYC-GRAPH-NODE");

    public static final SubLList $list208 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("MAKE-NODE"), list(makeSymbol("CYC-TERM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-PHRASE"), NIL, makeKeyword("PROTECTED")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-INSTANCE");

    public static final SubLSymbol MAKE_NODE = makeSymbol("MAKE-NODE");

    public static final SubLList $list212 = list(makeSymbol("CYC-TERM"));

    public static final SubLList $list213 = list(makeString("@param CYC-TERM a Cyc term\n   @return cyc-graph-node-p, a node with CYC-TERM as its core"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-NODE"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("FIM"), makeSymbol("NEW-NODE"), list(makeSymbol("QUOTE"), makeSymbol("SET-CORE")), makeSymbol("CYC-TERM")), list(makeSymbol("FIM"), makeSymbol("NEW-NODE"), list(makeSymbol("QUOTE"), makeSymbol("SET-LABEL")), list(makeSymbol("FIM"), makeSymbol("NEW-NODE"), list(makeSymbol("QUOTE"), makeSymbol("GENERATE-PHRASE")))), list(makeSymbol("RET"), makeSymbol("NEW-NODE"))));



    public static final SubLSymbol CYC_GRAPH_NODE_MAKE_NODE_METHOD = makeSymbol("CYC-GRAPH-NODE-MAKE-NODE-METHOD");

    public static final SubLList $list216 = list(makeSymbol("CYC-TERM"), makeSymbol("&OPTIONAL"), makeSymbol("GRAPH"));

    public static final SubLList $list217 = list(makeString("@param CYC-TERM a Cyc term\n   @return cyc-graph-node-p, a node with CYC-TERM as its core"), list(makeSymbol("CHECK-TYPE"), makeSymbol("CYC-TERM"), makeSymbol("CLOSED-TERM?")), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SET-CORE")), makeSymbol("CYC-TERM"), makeSymbol("GRAPH"))));

    public static final SubLSymbol $sym218$CLOSED_TERM_ = makeSymbol("CLOSED-TERM?");

    public static final SubLSymbol CYC_GRAPH_NODE_SET_CORE_METHOD = makeSymbol("CYC-GRAPH-NODE-SET-CORE-METHOD");

    public static final SubLList $list220 = list(makeString("@return stringp, an English string denoting the concept at the core\n   of this node."), list(makeSymbol("RET"), list(makeSymbol("GENERATE-PHRASE"), makeSymbol("CORE"))));

    public static final SubLSymbol $sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-GRAPH-NODE-METHOD");

    public static final SubLSymbol CYC_GRAPH_NODE_GENERATE_PHRASE_METHOD = makeSymbol("CYC-GRAPH-NODE-GENERATE-PHRASE-METHOD");

    public static final SubLSymbol CYC_GRAPH_EDGE = makeSymbol("CYC-GRAPH-EDGE");

    public static final SubLList $list224 = list(list(makeSymbol("PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("MAKE-EDGE"), list(makeSymbol("FROM-NODE"), makeSymbol("TO-NODE"), makeSymbol("PRED")), makeKeyword("PUBLIC")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-INSTANCE");

    public static final SubLList $list228 = list(makeSymbol("FROM-NODE"), makeSymbol("TO-NODE"), makeSymbol("&OPTIONAL"), list(makeSymbol("PRED"), reader_make_constant_shell(makeString("genls"))));

    public static final SubLList $list229 = list(makeString("@param TO-NODE cyc-graph-node-p\n   @param FROM-NODE cyc-graph-node-p\n   @param PREDICATE predicate-p, the CycL predicate that represents the semantics\n   of this edge\n   @return graph-edge-p if both nodes have appropriate ids and NIL otherwise.\n   Creates an edge object connecting TO-NODE to FROM-NODE"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TO-NODE"), makeSymbol("CYC-GRAPH-NODE-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("FROM-NODE"), makeSymbol("CYC-GRAPH-NODE-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("PRED"), makeSymbol("PREDICATE?")), list(makeSymbol("CLET"), list(list(makeSymbol("FID"), list(makeSymbol("GET-SLOT"), makeSymbol("FROM-NODE"), list(makeSymbol("QUOTE"), makeSymbol("ID")))), list(makeSymbol("TID"), list(makeSymbol("GET-SLOT"), makeSymbol("TO-NODE"), list(makeSymbol("QUOTE"), makeSymbol("ID")))), list(makeSymbol("NEW-EDGE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("CYC-GRAPH-EDGE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("FID")), list(makeSymbol("NUMBERP"), makeSymbol("TID"))), list(makeSymbol("FIM"), makeSymbol("NEW-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("SET-FROM")), makeSymbol("FID")), list(makeSymbol("FIM"), makeSymbol("NEW-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("SET-TO")), makeSymbol("TID")), list(makeSymbol("FIM"), makeSymbol("NEW-EDGE"), list(makeSymbol("QUOTE"), makeSymbol("SET-PREDICATE")), makeSymbol("PRED")), list(makeSymbol("RET"), makeSymbol("NEW-EDGE")))));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLSymbol CYC_GRAPH_NODE_P = makeSymbol("CYC-GRAPH-NODE-P");

    public static final SubLSymbol $sym232$PREDICATE_ = makeSymbol("PREDICATE?");

    public static final SubLSymbol SET_PREDICATE = makeSymbol("SET-PREDICATE");

    public static final SubLSymbol CYC_GRAPH_EDGE_MAKE_EDGE_METHOD = makeSymbol("CYC-GRAPH-EDGE-MAKE-EDGE-METHOD");

    public static final SubLList $list235 = list(makeSymbol("PRED"));

    public static final SubLList $list236 = list(makeString("@param PRED a predicate?\n   @return cyc-graph-edge-p\n   sets the predicate of this edge"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PRED"), makeSymbol("PREDICATE?")), list(makeSymbol("CSETQ"), makeSymbol("PREDICATE"), makeSymbol("PRED")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-GRAPH-EDGE-METHOD");

    public static final SubLSymbol CYC_GRAPH_EDGE_SET_PREDICATE_METHOD = makeSymbol("CYC-GRAPH-EDGE-SET-PREDICATE-METHOD");

    public static final SubLSymbol CYC_GRAPH = makeSymbol("CYC-GRAPH");

    public static final SubLList $list240 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERPOLATE-NODE"), list(makeSymbol("NEW-NODE"), makeSymbol("&OPTIONAL"), list(makeSymbol("PREDICATE"), reader_make_constant_shell(makeString("genls")))), makeKeyword("PUBLIC")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-INSTANCE");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list244 = list(makeString("@param NEW-NODE cyc-graph-node-p\n   @return boolean, T if NEW-NODE is acceptable for this graph object, NIL otherwise"), list(makeSymbol("RET"), list(makeSymbol("CYC-GRAPH-NODE-P"), makeSymbol("NEW-NODE"))));

    public static final SubLSymbol CYC_GRAPH_ACCEPT_NODE_METHOD = makeSymbol("CYC-GRAPH-ACCEPT-NODE-METHOD");

    public static final SubLList $list246 = list(makeString("@param NEW-EDGE graph-edge-p\n   @return boolean, T if NEW-EDGE is acceptable for this graph object, NIL otherwise"), list(makeSymbol("RET"), list(makeSymbol("CYC-GRAPH-EDGE-P"), makeSymbol("NEW-EDGE"))));

    public static final SubLSymbol CYC_GRAPH_ACCEPT_EDGE_METHOD = makeSymbol("CYC-GRAPH-ACCEPT-EDGE-METHOD");

    public static final SubLSymbol INTERPOLATE_NODE = makeSymbol("INTERPOLATE-NODE");

    public static final SubLList $list249 = list(makeSymbol("NEW-NODE"), makeSymbol("&OPTIONAL"), list(makeSymbol("PREDICATE"), reader_make_constant_shell(makeString("genls"))));

    public static final SubLList $list250 = list(makeString("@param NEW-NODE, cyc-graph-node-p\n   @param PREDICATE, predicate?\n   @return cyc-graph-p\n   Finds all nodes of this graph whose cores are immediate ancestors of the core \n   of NEW-NODE and creates an edge from them to NEW-NODE. Finds all nodes of this \n   graph whose cores are immediate specs of the core of NEW-NODE and creates an \n   edge from NEW-NODE to them. Removes all edges from ancestors to specs that can\n   now be accounted by edges that run through NEW-NODE. The notion of ancestor is\n   parameterized by PREDICATE."), list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-NODE-BY-CORE")), list(makeSymbol("FIM"), makeSymbol("NEW-NODE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORE")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD-NODE")), makeSymbol("NEW-NODE")), list(makeSymbol("CLET"), list(list(makeSymbol("ADOPTED-CHILDREN"), NIL), list(makeSymbol("MOST-SPECIFIC-ANCESTORS"), NIL), list(makeSymbol("PRUNING-PRED"), list(makeSymbol("GET-CYC-GRAPH-ANCESTOR-PRUNING-PREDICATE"), makeSymbol("PREDICATE")))), list(makeSymbol("DO-DICTIONARY"), list(makeSymbol("KEY"), makeSymbol("OLD-NODE"), makeSymbol("NODES")), list(makeSymbol("IGNORE"), makeSymbol("KEY")), list(makeSymbol("PUNLESS"), list(EQL, makeSymbol("OLD-NODE"), makeSymbol("NEW-NODE")), list(makeSymbol("CLET"), list(list(makeSymbol("ARG-OLD"), list(makeSymbol("FIM"), makeSymbol("OLD-NODE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORE")))), list(makeSymbol("ARG-NEW"), list(makeSymbol("FIM"), makeSymbol("NEW-NODE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CORE")))), list(makeSymbol("CANDIDATE-ANCESTOR"), list(makeSymbol("FWHEN"), list(makeSymbol("CYC-QUERY"), list(makeSymbol("BQ-LIST"), makeSymbol("PREDICATE"), makeSymbol("ARG-NEW"), makeSymbol("ARG-OLD")), reader_make_constant_shell(makeString("EverythingPSC"))), makeSymbol("ARG-OLD"))), list(makeSymbol("CANDIDATE-ADOPTEE"), list(makeSymbol("FWHEN"), list(makeSymbol("CYC-QUERY"), list(makeSymbol("BQ-LIST"), makeSymbol("PREDICATE"), makeSymbol("ARG-OLD"), makeSymbol("ARG-NEW")), reader_make_constant_shell(makeString("EverythingPSC"))), makeSymbol("ARG-OLD")))), list(makeSymbol("CSETQ"), makeSymbol("MOST-SPECIFIC-ANCESTORS"), list(makeSymbol("CHALLENGE-SET-WRT-PREDICATE"), makeSymbol("MOST-SPECIFIC-ANCESTORS"), makeSymbol("CANDIDATE-ANCESTOR"), makeSymbol("PRUNING-PRED"))), list(makeSymbol("CSETQ"), makeSymbol("ADOPTED-CHILDREN"), list(makeSymbol("CHALLENGE-SET-WRT-PREDICATE"), makeSymbol("ADOPTED-CHILDREN"), makeSymbol("CANDIDATE-ADOPTEE"), makeSymbol("PRUNING-PRED"), NIL))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), makeSymbol("MOST-SPECIFIC-ANCESTORS")), list(makeSymbol("CDOLIST"), list(makeSymbol("EDGE-FROM-ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-EDGES-FROM-NODE")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-NODE-BY-CORE")), makeSymbol("ANCESTOR")))), list(makeSymbol("CLET"), list(list(makeSymbol("TO-ID"), list(makeSymbol("FIM"), makeSymbol("EDGE-FROM-ANCESTOR"), list(makeSymbol("QUOTE"), makeSymbol("GET-TO")))), makeSymbol("MATCH")), list(makeSymbol("CSOME"), list(makeSymbol("ADOPTEE"), makeSymbol("ADOPTED-CHILDREN"), makeSymbol("MATCH")), list(makeSymbol("CSETQ"), makeSymbol("MATCH"), list(makeSymbol("="), makeSymbol("TO-ID"), list(makeSymbol("GET-SLOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-NODE-BY-CORE")), makeSymbol("ADOPTEE")), list(makeSymbol("QUOTE"), makeSymbol("ID")))))), list(makeSymbol("PWHEN"), makeSymbol("MATCH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("REMOVE-EDGE")), makeSymbol("EDGE-FROM-ANCESTOR")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), makeSymbol("MOST-SPECIFIC-ANCESTORS")), list(makeSymbol("CLET"), list(list(makeSymbol("ANCESTOR-NODE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-NODE-BY-CORE")), makeSymbol("ANCESTOR")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD-EDGE")), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("CYC-GRAPH-EDGE")), list(makeSymbol("QUOTE"), makeSymbol("MAKE-EDGE")), makeSymbol("ANCESTOR-NODE"), makeSymbol("NEW-NODE"), makeSymbol("PREDICATE"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ADOPTEE"), makeSymbol("ADOPTED-CHILDREN")), list(makeSymbol("CLET"), list(list(makeSymbol("ADOPTEE-NODE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-NODE-BY-CORE")), makeSymbol("ADOPTEE")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD-EDGE")), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("CYC-GRAPH-EDGE")), list(makeSymbol("QUOTE"), makeSymbol("MAKE-EDGE")), makeSymbol("NEW-NODE"), makeSymbol("ADOPTEE-NODE"), makeSymbol("PREDICATE"))))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYC-GRAPH-METHOD");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLSymbol CYC_GRAPH_INTERPOLATE_NODE_METHOD = makeSymbol("CYC-GRAPH-INTERPOLATE-NODE-METHOD");

    public static final SubLSymbol INTERPOLATE_CYC_TERM = makeSymbol("INTERPOLATE-CYC-TERM");

    public static final SubLList $list255 = list(makeSymbol("CYC-TERM"), makeSymbol("&OPTIONAL"), list(makeSymbol("PREDICATE"), reader_make_constant_shell(makeString("genls"))));

    public static final SubLList $list256 = list(makeString("@param CYC-TERM, closed-term?\n   @param PREDICATE, predicate?\n   @return cyc-graph-p\n   Given CYC-TERM, creates a new cyc-graph-node-p with it at its core and\n   interpolates the new node in the graph according to the relationship\n   specified in PREDICATE."), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-NODE"), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("CYC-GRAPH-NODE")), list(makeSymbol("QUOTE"), makeSymbol("MAKE-NODE")), makeSymbol("CYC-TERM")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("INTERPOLATE-NODE")), makeSymbol("NEW-NODE"), makeSymbol("PREDICATE")), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLSymbol CYC_GRAPH_INTERPOLATE_CYC_TERM_METHOD = makeSymbol("CYC-GRAPH-INTERPOLATE-CYC-TERM-METHOD");

    public static SubLObject get_graph_node_label(final SubLObject graph_node) {
        return classes.subloop_get_access_protected_instance_slot(graph_node, THREE_INTEGER, LABEL);
    }

    public static SubLObject set_graph_node_label(final SubLObject graph_node, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_node, value, THREE_INTEGER, LABEL);
    }

    public static SubLObject get_graph_node_id(final SubLObject graph_node) {
        return classes.subloop_get_access_protected_instance_slot(graph_node, TWO_INTEGER, ID);
    }

    public static SubLObject set_graph_node_id(final SubLObject graph_node, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_node, value, TWO_INTEGER, ID);
    }

    public static SubLObject get_graph_node_core(final SubLObject graph_node) {
        return classes.subloop_get_access_protected_instance_slot(graph_node, ONE_INTEGER, CORE);
    }

    public static SubLObject set_graph_node_core(final SubLObject graph_node, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_node, value, ONE_INTEGER, CORE);
    }

    public static SubLObject subloop_reserved_initialize_graph_node_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_graph_node_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, CORE, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, ID, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, LABEL, NIL);
        return NIL;
    }

    public static SubLObject graph_node_p(final SubLObject graph_node) {
        return classes.subloop_instanceof_class(graph_node, GRAPH_NODE);
    }

    public static SubLObject graph_node_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static SubLObject graph_node_set_id_method(final SubLObject self, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = NIL;
        SubLObject id = get_graph_node_id(self);
        try {
            thread.throwStack.push($sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                assert NIL != integerp(num) : "Types.integerp(num) " + "CommonSymbols.NIL != Types.integerp(num) " + num;
                id = num;
                sublisp_throw($sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_node_id(self, id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, $sym18$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }

    public static SubLObject graph_node_set_core_method(final SubLObject self, final SubLObject v_object, SubLObject v_graph) {
        if (v_graph == UNPROVIDED) {
            v_graph = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = NIL;
        SubLObject v_core = get_graph_node_core(self);
        try {
            thread.throwStack.push($sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                v_core = v_object;
                if (NIL != graph_p(v_graph)) {
                    dictionary.dictionary_enter(instances.get_slot(v_graph, CORE_NODE_MAP), v_core, self);
                }
                sublisp_throw($sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_node_core(self, v_core);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, $sym24$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }

    public static SubLObject graph_node_set_label_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = NIL;
        SubLObject label = get_graph_node_label(self);
        try {
            thread.throwStack.push($sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                label = string;
                sublisp_throw($sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_node_label(self, label);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, $sym30$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }

    public static SubLObject graph_node_get_label_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = NIL;
        final SubLObject label = get_graph_node_label(self);
        try {
            thread.throwStack.push($sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                if (NIL != label) {
                    sublisp_throw($sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, label);
                } else {
                    sublisp_throw($sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, $str36$);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_node_label(self, label);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, $sym35$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }

    public static SubLObject graph_node_get_core_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = NIL;
        final SubLObject v_core = get_graph_node_core(self);
        try {
            thread.throwStack.push($sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                sublisp_throw($sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, v_core);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_node_core(self, v_core);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, $sym40$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }

    public static SubLObject graph_node_get_id_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = NIL;
        final SubLObject id = get_graph_node_id(self);
        try {
            thread.throwStack.push($sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                sublisp_throw($sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD, id);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_node_id(self, id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, $sym44$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }

    public static SubLObject graph_node_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_node_method = NIL;
        final SubLObject label = get_graph_node_label(self);
        final SubLObject id = get_graph_node_id(self);
        try {
            thread.throwStack.push($sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
            try {
                write_string($str50$__, stream, UNPROVIDED, UNPROVIDED);
                princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                if (id.isNumber()) {
                    write_string(cconcatenate($str51$_, format(NIL, $str52$_D, id)), stream, UNPROVIDED, UNPROVIDED);
                }
                write_string($str53$__, stream, UNPROVIDED, UNPROVIDED);
                write_string(label, stream, UNPROVIDED, UNPROVIDED);
                write_string($str54$_, stream, UNPROVIDED, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_node_label(self, label);
                    set_graph_node_id(self, id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_node_method = Errors.handleThrowable(ccatch_env_var, $sym49$OUTER_CATCH_FOR_GRAPH_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_node_method;
    }

    public static SubLObject get_graph_edge_label(final SubLObject graph_edge) {
        return classes.subloop_get_access_protected_instance_slot(graph_edge, THREE_INTEGER, LABEL);
    }

    public static SubLObject set_graph_edge_label(final SubLObject graph_edge, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_edge, value, THREE_INTEGER, LABEL);
    }

    public static SubLObject get_graph_edge_to(final SubLObject graph_edge) {
        return classes.subloop_get_access_protected_instance_slot(graph_edge, TWO_INTEGER, TO);
    }

    public static SubLObject set_graph_edge_to(final SubLObject graph_edge, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_edge, value, TWO_INTEGER, TO);
    }

    public static SubLObject get_graph_edge_from(final SubLObject graph_edge) {
        return classes.subloop_get_access_protected_instance_slot(graph_edge, ONE_INTEGER, FROM);
    }

    public static SubLObject set_graph_edge_from(final SubLObject graph_edge, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(graph_edge, value, ONE_INTEGER, FROM);
    }

    public static SubLObject subloop_reserved_initialize_graph_edge_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_graph_edge_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_EDGE, FROM, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_EDGE, TO, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_EDGE, LABEL, NIL);
        return NIL;
    }

    public static SubLObject graph_edge_p(final SubLObject graph_edge) {
        return classes.subloop_instanceof_class(graph_edge, GRAPH_EDGE);
    }

    public static SubLObject graph_edge_make_edge_method(final SubLObject self, final SubLObject from_node, final SubLObject to_node) {
        assert NIL != graph_node_p(to_node) : "graph.graph_node_p(to_node) " + "CommonSymbols.NIL != graph.graph_node_p(to_node) " + to_node;
        assert NIL != graph_node_p(from_node) : "graph.graph_node_p(from_node) " + "CommonSymbols.NIL != graph.graph_node_p(from_node) " + from_node;
        final SubLObject fid = instances.get_slot(from_node, ID);
        final SubLObject tid = instances.get_slot(to_node, ID);
        final SubLObject new_edge = object.new_class_instance(self);
        if (fid.isNumber() && tid.isNumber()) {
            methods.funcall_instance_method_with_1_args(new_edge, SET_FROM, fid);
            methods.funcall_instance_method_with_1_args(new_edge, SET_TO, tid);
            return new_edge;
        }
        return NIL;
    }

    public static SubLObject graph_edge_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static SubLObject graph_edge_set_from_method(final SubLObject self, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = NIL;
        SubLObject from = get_graph_edge_from(self);
        try {
            thread.throwStack.push($sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                assert NIL != integerp(num) : "Types.integerp(num) " + "CommonSymbols.NIL != Types.integerp(num) " + num;
                from = num;
                sublisp_throw($sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edge_from(self, from);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }

    public static SubLObject graph_edge_set_to_method(final SubLObject self, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = NIL;
        SubLObject to = get_graph_edge_to(self);
        try {
            thread.throwStack.push($sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                assert NIL != integerp(num) : "Types.integerp(num) " + "CommonSymbols.NIL != Types.integerp(num) " + num;
                to = num;
                sublisp_throw($sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edge_to(self, to);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, $sym76$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }

    public static SubLObject graph_edge_get_from_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = NIL;
        final SubLObject from = get_graph_edge_from(self);
        try {
            thread.throwStack.push($sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                sublisp_throw($sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, from);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edge_from(self, from);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, $sym80$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }

    public static SubLObject graph_edge_get_to_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = NIL;
        final SubLObject to = get_graph_edge_to(self);
        try {
            thread.throwStack.push($sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                sublisp_throw($sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, to);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edge_to(self, to);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }

    public static SubLObject graph_edge_set_label_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = NIL;
        SubLObject label = get_graph_edge_label(self);
        try {
            thread.throwStack.push($sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                label = string;
                sublisp_throw($sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edge_label(self, label);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }

    public static SubLObject graph_edge_get_label_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = NIL;
        final SubLObject label = get_graph_edge_label(self);
        try {
            thread.throwStack.push($sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                if (NIL != label) {
                    sublisp_throw($sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, label);
                } else {
                    sublisp_throw($sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD, $str36$);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edge_label(self, label);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, $sym89$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }

    public static SubLObject graph_edge_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_edge_method = NIL;
        final SubLObject label = get_graph_edge_label(self);
        final SubLObject to = get_graph_edge_to(self);
        final SubLObject from = get_graph_edge_from(self);
        try {
            thread.throwStack.push($sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
            try {
                write_string($str50$__, stream, UNPROVIDED, UNPROVIDED);
                princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                write_string($str53$__, stream, UNPROVIDED, UNPROVIDED);
                write_string(cconcatenate(prin1_to_string(from), $str93$__), stream, UNPROVIDED, UNPROVIDED);
                write_string(format(NIL, $str94$_A, label), stream, UNPROVIDED, UNPROVIDED);
                write_string(cconcatenate($str95$__, prin1_to_string(to)), stream, UNPROVIDED, UNPROVIDED);
                write_string($str54$_, stream, UNPROVIDED, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edge_label(self, label);
                    set_graph_edge_to(self, to);
                    set_graph_edge_from(self, from);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_edge_method = Errors.handleThrowable(ccatch_env_var, $sym92$OUTER_CATCH_FOR_GRAPH_EDGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_edge_method;
    }

    public static SubLObject get_graph_core_node_map(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, EIGHT_INTEGER, CORE_NODE_MAP);
    }

    public static SubLObject set_graph_core_node_map(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, EIGHT_INTEGER, CORE_NODE_MAP);
    }

    public static SubLObject get_graph_edges_target(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, SEVEN_INTEGER, EDGES_TARGET);
    }

    public static SubLObject set_graph_edges_target(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, SEVEN_INTEGER, EDGES_TARGET);
    }

    public static SubLObject get_graph_edges_source(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, SIX_INTEGER, EDGES_SOURCE);
    }

    public static SubLObject set_graph_edges_source(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, SIX_INTEGER, EDGES_SOURCE);
    }

    public static SubLObject get_graph_label_edge_map(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, FIVE_INTEGER, LABEL_EDGE_MAP);
    }

    public static SubLObject set_graph_label_edge_map(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, FIVE_INTEGER, LABEL_EDGE_MAP);
    }

    public static SubLObject get_graph_nodes(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, FOUR_INTEGER, NODES);
    }

    public static SubLObject set_graph_nodes(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, FOUR_INTEGER, NODES);
    }

    public static SubLObject get_graph_label_node_map(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, THREE_INTEGER, LABEL_NODE_MAP);
    }

    public static SubLObject set_graph_label_node_map(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, THREE_INTEGER, LABEL_NODE_MAP);
    }

    public static SubLObject get_graph_integer_sequence_generator(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, TWO_INTEGER, INTEGER_SEQUENCE_GENERATOR);
    }

    public static SubLObject set_graph_integer_sequence_generator(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, TWO_INTEGER, INTEGER_SEQUENCE_GENERATOR);
    }

    public static SubLObject get_graph_name(final SubLObject v_graph) {
        return classes.subloop_get_access_protected_instance_slot(v_graph, ONE_INTEGER, NAME);
    }

    public static SubLObject set_graph_name(final SubLObject v_graph, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_graph, value, ONE_INTEGER, NAME);
    }

    public static SubLObject subloop_reserved_initialize_graph_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_graph_instance(final SubLObject new_instance) {
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

    public static SubLObject graph_p(final SubLObject v_graph) {
        return classes.subloop_instanceof_class(v_graph, GRAPH);
    }

    public static SubLObject new_graph(final SubLObject name) {
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        final SubLObject v_graph = object.new_class_instance(GRAPH);
        instances.set_slot(v_graph, NAME, name);
        return v_graph;
    }

    public static SubLObject graph_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        SubLObject core_node_map = get_graph_core_node_map(self);
        SubLObject edges_target = get_graph_edges_target(self);
        SubLObject edges_source = get_graph_edges_source(self);
        SubLObject label_edge_map = get_graph_label_edge_map(self);
        SubLObject nodes = get_graph_nodes(self);
        SubLObject label_node_map = get_graph_label_node_map(self);
        SubLObject v_integer_sequence_generator = get_graph_integer_sequence_generator(self);
        try {
            thread.throwStack.push($sym109$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                object.object_initialize_method(self);
                v_integer_sequence_generator = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                nodes = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                edges_source = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                edges_target = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                label_node_map = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                label_edge_map = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                core_node_map = dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED);
                sublisp_throw($sym109$OUTER_CATCH_FOR_GRAPH_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_core_node_map(self, core_node_map);
                    set_graph_edges_target(self, edges_target);
                    set_graph_edges_source(self, edges_source);
                    set_graph_label_edge_map(self, label_edge_map);
                    set_graph_nodes(self, nodes);
                    set_graph_label_node_map(self, label_node_map);
                    set_graph_integer_sequence_generator(self, v_integer_sequence_generator);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym109$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_accept_node_method(final SubLObject self, final SubLObject new_node) {
        return graph_node_p(new_node);
    }

    public static SubLObject graph_accept_edge_method(final SubLObject self, final SubLObject new_edge) {
        return graph_edge_p(new_edge);
    }

    public static SubLObject graph_add_node_method(final SubLObject self, final SubLObject new_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject core_node_map = get_graph_core_node_map(self);
        final SubLObject nodes = get_graph_nodes(self);
        final SubLObject label_node_map = get_graph_label_node_map(self);
        final SubLObject v_integer_sequence_generator = get_graph_integer_sequence_generator(self);
        try {
            thread.throwStack.push($sym121$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                if (NIL == methods.funcall_instance_method_with_1_args(self, ACCEPT_NODE, new_node)) {
                    Errors.warn($str122$__Cannot_add_node__S, new_node);
                    sublisp_throw($sym121$OUTER_CATCH_FOR_GRAPH_METHOD, NIL);
                }
                SubLObject node_id = instances.get_slot(new_node, ID);
                final SubLObject node_label = methods.funcall_instance_method_with_0_args(new_node, GET_LABEL);
                final SubLObject node_core = methods.funcall_instance_method_with_0_args(new_node, GET_CORE);
                if (NIL == node_id) {
                    node_id = integer_sequence_generator.integer_sequence_generator_next(v_integer_sequence_generator);
                    methods.funcall_instance_method_with_1_args(new_node, SET_ID, node_id);
                }
                dictionary.dictionary_enter(nodes, node_id, new_node);
                if (NIL != node_label) {
                    dictionary.dictionary_enter(label_node_map, node_label, new_node);
                }
                if (NIL != node_core) {
                    dictionary.dictionary_enter(core_node_map, node_core, new_node);
                }
                sublisp_throw($sym121$OUTER_CATCH_FOR_GRAPH_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_core_node_map(self, core_node_map);
                    set_graph_nodes(self, nodes);
                    set_graph_label_node_map(self, label_node_map);
                    set_graph_integer_sequence_generator(self, v_integer_sequence_generator);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym121$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_node_by_id_method(final SubLObject self, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push($sym127$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
                sublisp_throw($sym127$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(nodes, id, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym127$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_node_by_label_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject label_node_map = get_graph_label_node_map(self);
        try {
            thread.throwStack.push($sym131$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                sublisp_throw($sym131$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(label_node_map, string, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_label_node_map(self, label_node_map);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym131$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_node_by_core_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject core_node_map = get_graph_core_node_map(self);
        try {
            thread.throwStack.push($sym136$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                sublisp_throw($sym136$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(core_node_map, v_object, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_core_node_map(self, core_node_map);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym136$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_add_edge_method(final SubLObject self, final SubLObject new_edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        final SubLObject edges_source = get_graph_edges_source(self);
        final SubLObject label_edge_map = get_graph_label_edge_map(self);
        try {
            thread.throwStack.push($sym140$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                if (NIL == methods.funcall_instance_method_with_1_args(self, ACCEPT_EDGE, new_edge)) {
                    Errors.warn($str141$__Cannot_add_edge__S, new_edge);
                    sublisp_throw($sym140$OUTER_CATCH_FOR_GRAPH_METHOD, NIL);
                }
                final SubLObject label = methods.funcall_instance_method_with_0_args(new_edge, GET_LABEL);
                final SubLObject source = instances.get_slot(new_edge, FROM);
                final SubLObject target = instances.get_slot(new_edge, TO);
                dictionary_utilities.dictionary_push(edges_source, source, new_edge);
                dictionary_utilities.dictionary_push(edges_target, target, new_edge);
                if (NIL == string_utilities.empty_string_p(label)) {
                    dictionary_utilities.dictionary_push(label_edge_map, label, new_edge);
                }
                sublisp_throw($sym140$OUTER_CATCH_FOR_GRAPH_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    set_graph_edges_source(self, edges_source);
                    set_graph_label_edge_map(self, label_edge_map);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_remove_edge_method(final SubLObject self, final SubLObject edge) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        final SubLObject edges_source = get_graph_edges_source(self);
        final SubLObject label_edge_map = get_graph_label_edge_map(self);
        try {
            thread.throwStack.push($sym146$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != graph_edge_p(edge) : "graph.graph_edge_p(edge) " + "CommonSymbols.NIL != graph.graph_edge_p(edge) " + edge;
                final SubLObject label = methods.funcall_instance_method_with_0_args(edge, GET_LABEL);
                final SubLObject source = instances.get_slot(edge, FROM);
                final SubLObject target = instances.get_slot(edge, TO);
                dictionary.dictionary_remove(edges_source, source);
                dictionary.dictionary_remove(edges_target, target);
                dictionary.dictionary_remove(label_edge_map, label);
                sublisp_throw($sym146$OUTER_CATCH_FOR_GRAPH_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    set_graph_edges_source(self, edges_source);
                    set_graph_label_edge_map(self, label_edge_map);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym146$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_edges_from_method(final SubLObject self, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject edges_source = get_graph_edges_source(self);
        try {
            thread.throwStack.push($sym151$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
                sublisp_throw($sym151$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(edges_source, id, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edges_source(self, edges_source);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym151$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_edges_to_method(final SubLObject self, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        try {
            thread.throwStack.push($sym155$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
                sublisp_throw($sym155$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(edges_target, id, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym155$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_edges_from_node_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject edges_source = get_graph_edges_source(self);
        try {
            thread.throwStack.push($sym160$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != graph_node_p(node) : "graph.graph_node_p(node) " + "CommonSymbols.NIL != graph.graph_node_p(node) " + node;
                final SubLObject node_id = methods.funcall_instance_method_with_0_args(node, GET_ID);
                sublisp_throw($sym160$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(edges_source, node_id, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edges_source(self, edges_source);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_edges_to_node_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        try {
            thread.throwStack.push($sym164$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != graph_node_p(node) : "graph.graph_node_p(node) " + "CommonSymbols.NIL != graph.graph_node_p(node) " + node;
                final SubLObject node_id = methods.funcall_instance_method_with_0_args(node, GET_ID);
                sublisp_throw($sym164$OUTER_CATCH_FOR_GRAPH_METHOD, dictionary.dictionary_lookup(edges_target, node_id, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_nodes_from_node_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push($sym168$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != graph_node_p(node) : "graph.graph_node_p(node) " + "CommonSymbols.NIL != graph.graph_node_p(node) " + node;
                SubLObject result = NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, GET_EDGES_FROM_NODE, node);
                SubLObject edge = NIL;
                edge = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject node_id = methods.funcall_instance_method_with_0_args(edge, GET_TO);
                    result = cons(dictionary.dictionary_lookup(nodes, node_id, UNPROVIDED), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    edge = cdolist_list_var.first();
                } 
                sublisp_throw($sym168$OUTER_CATCH_FOR_GRAPH_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym168$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_nodes_to_node_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push($sym172$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != graph_node_p(node) : "graph.graph_node_p(node) " + "CommonSymbols.NIL != graph.graph_node_p(node) " + node;
                SubLObject result = NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_EDGES_TO_NODE);
                SubLObject edge = NIL;
                edge = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject node_id = methods.funcall_instance_method_with_0_args(edge, GET_TO);
                    result = cons(dictionary.dictionary_lookup(nodes, node_id, UNPROVIDED), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    edge = cdolist_list_var.first();
                } 
                sublisp_throw($sym172$OUTER_CATCH_FOR_GRAPH_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym172$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_get_path_labels_method(final SubLObject self, final SubLObject terms) {
        assert NIL != listp(terms) : "Types.listp(terms) " + "CommonSymbols.NIL != Types.listp(terms) " + terms;
        SubLObject target_nodes = NIL;
        SubLObject ascending_labels = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = string_utilities.split_string(v_term, UNPROVIDED);
            SubLObject token = NIL;
            token = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject node = methods.funcall_instance_method_with_1_args(self, GET_NODE_BY_LABEL, token);
                if (NIL != graph_node_p(node)) {
                    target_nodes = cons(node, target_nodes);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                token = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        cdolist_list_var = methods.funcall_instance_method_with_1_args(self, COLLECT_ALL_ASCENDING, target_nodes);
        SubLObject ascending = NIL;
        ascending = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ascending_labels = cons(instances.get_slot(ascending, LABEL), ascending_labels);
            cdolist_list_var = cdolist_list_var.rest();
            ascending = cdolist_list_var.first();
        } 
        return ascending_labels;
    }

    public static SubLObject graph_collect_ascending_method(final SubLObject self, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push($sym182$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != graph_node_p(node) : "graph.graph_node_p(node) " + "CommonSymbols.NIL != graph.graph_node_p(node) " + node;
                final SubLObject marks = make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED);
                final SubLObject node_id = instances.get_slot(node, ID);
                SubLObject edges = dictionary.dictionary_lookup(edges_target, node_id, UNPROVIDED);
                SubLObject collected_nodes = NIL;
                sethash(node_id, marks, T);
                while (NIL != edges) {
                    final SubLObject top_edge = edges.first();
                    final SubLObject other_edges = edges.rest();
                    final SubLObject from_node_id = instances.get_slot(top_edge, FROM);
                    if (NIL != gethash(from_node_id, marks, UNPROVIDED)) {
                        edges = other_edges;
                    } else {
                        sethash(from_node_id, marks, T);
                        edges = append(dictionary.dictionary_lookup(edges_target, from_node_id, UNPROVIDED), other_edges);
                    }
                } 
                SubLObject key = NIL;
                SubLObject value = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(marks);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        collected_nodes = cons(dictionary.dictionary_lookup(nodes, key, UNPROVIDED), collected_nodes);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                sublisp_throw($sym182$OUTER_CATCH_FOR_GRAPH_METHOD, collected_nodes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    set_graph_nodes(self, nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym182$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_collect_all_ascending_method(final SubLObject self, final SubLObject node_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject edges_target = get_graph_edges_target(self);
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push($sym186$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                assert NIL != listp(node_list) : "Types.listp(node_list) " + "CommonSymbols.NIL != Types.listp(node_list) " + node_list;
                final SubLObject marks = make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED);
                SubLObject edges = NIL;
                SubLObject collected_nodes = NIL;
                SubLObject cdolist_list_var = node_list;
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != graph_node_p(node)) {
                        final SubLObject node_id = instances.get_slot(node, ID);
                        edges = append(dictionary.dictionary_lookup(edges_target, node_id, UNPROVIDED), edges);
                        sethash(node_id, marks, T);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
                while (NIL != edges) {
                    final SubLObject top_edge = edges.first();
                    final SubLObject other_edges = edges.rest();
                    final SubLObject from_node_id = instances.get_slot(top_edge, FROM);
                    if (NIL != gethash(from_node_id, marks, UNPROVIDED)) {
                        edges = other_edges;
                    } else {
                        sethash(from_node_id, marks, T);
                        edges = append(dictionary.dictionary_lookup(edges_target, from_node_id, UNPROVIDED), other_edges);
                    }
                } 
                SubLObject key = NIL;
                SubLObject value = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(marks);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        value = getEntryValue(cdohash_entry);
                        collected_nodes = cons(dictionary.dictionary_lookup(nodes, key, UNPROVIDED), collected_nodes);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                sublisp_throw($sym186$OUTER_CATCH_FOR_GRAPH_METHOD, collected_nodes);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edges_target(self, edges_target);
                    set_graph_nodes(self, nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym186$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push($sym189$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                write_string($str50$__, stream, UNPROVIDED, UNPROVIDED);
                princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                write_string($str53$__, stream, UNPROVIDED, UNPROVIDED);
                write_string(prin1_to_string(dictionary.dictionary_length(nodes)), stream, UNPROVIDED, UNPROVIDED);
                write_string($$$_nodes, stream, UNPROVIDED, UNPROVIDED);
                write_string($str54$_, stream, UNPROVIDED, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym189$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject graph_pprint_method(final SubLObject self, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_graph_method = NIL;
        final SubLObject edges_source = get_graph_edges_source(self);
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push($sym195$OUTER_CATCH_FOR_GRAPH_METHOD);
            try {
                write_string($str50$__, stream, UNPROVIDED, UNPROVIDED);
                princ(subloop_structures.class_name(subloop_structures.instance_class(self)), stream);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(nodes)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject node_from = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    write_string(string_utilities.$new_line_string$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED);
                    methods.funcall_instance_method_with_2_args(node_from, PRINT, stream, NIL);
                    write_string(cconcatenate(string_utilities.$new_line_string$.getGlobalValue(), $$$___), stream, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var;
                    final SubLObject edges = cdolist_list_var = dictionary.dictionary_lookup(edges_source, key, UNPROVIDED);
                    SubLObject edge = NIL;
                    edge = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject node_to = dictionary.dictionary_lookup(nodes, instances.get_slot(edge, TO), UNPROVIDED);
                        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
                        methods.funcall_instance_method_with_2_args(node_to, PRINT, stream, NIL);
                        cdolist_list_var = cdolist_list_var.rest();
                        edge = cdolist_list_var.first();
                    } 
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                write_string($str54$_, stream, UNPROVIDED, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_edges_source(self, edges_source);
                    set_graph_nodes(self, nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_graph_method = Errors.handleThrowable(ccatch_env_var, $sym195$OUTER_CATCH_FOR_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_graph_method;
    }

    public static SubLObject make_graph_from_string_lists(final SubLObject list) {
        final SubLObject v_graph = object.new_class_instance(GRAPH);
        SubLObject cdolist_list_var = list;
        SubLObject node_list = NIL;
        node_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject from_string = node_list.first();
            SubLObject from_node = methods.funcall_instance_method_with_1_args(v_graph, GET_NODE_BY_LABEL, from_string);
            final SubLObject to_strings = node_list.rest();
            if (NIL == from_node) {
                from_node = object.new_class_instance(GRAPH_NODE);
                methods.funcall_instance_method_with_1_args(from_node, SET_LABEL, from_string);
            }
            methods.funcall_instance_method_with_1_args(v_graph, ADD_NODE, from_node);
            SubLObject cdolist_list_var_$2 = to_strings;
            SubLObject to_string = NIL;
            to_string = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                SubLObject to_node = methods.funcall_instance_method_with_1_args(v_graph, GET_NODE_BY_LABEL, to_string);
                if (NIL == to_node) {
                    to_node = object.new_class_instance(GRAPH_NODE);
                    methods.funcall_instance_method_with_1_args(to_node, SET_LABEL, to_string);
                }
                methods.funcall_instance_method_with_1_args(v_graph, ADD_NODE, to_node);
                methods.funcall_instance_method_with_1_args(v_graph, ADD_EDGE, methods.funcall_class_method_with_2_args(GRAPH_EDGE, MAKE_EDGE, from_node, to_node));
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                to_string = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            node_list = cdolist_list_var.first();
        } 
        return v_graph;
    }

    public static SubLObject do_graph_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list199);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node = NIL;
        SubLObject v_graph = NIL;
        destructuring_bind_must_consp(current, datum, $list199);
        node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list199);
        v_graph = current.first();
        current = current.rest();
        final SubLObject done = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list199);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject graph_var = $sym200$GRAPH_VAR;
            return list(CLET, list(list(graph_var, v_graph)), listS(DO_DICTIONARY, list(KEY, node, listS(GET_SLOT, graph_var, $list205), done), $list206, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list199);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_graph_node_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_graph_node_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, CORE, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, ID, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_NODE, LABEL, NIL);
        return NIL;
    }

    public static SubLObject cyc_graph_node_p(final SubLObject cyc_graph_node) {
        return classes.subloop_instanceof_class(cyc_graph_node, CYC_GRAPH_NODE);
    }

    public static SubLObject cyc_graph_node_make_node_method(final SubLObject self, final SubLObject cyc_term) {
        final SubLObject new_node = object.new_class_instance(self);
        methods.funcall_instance_method_with_1_args(new_node, SET_CORE, cyc_term);
        methods.funcall_instance_method_with_1_args(new_node, SET_LABEL, methods.funcall_instance_method_with_0_args(new_node, GENERATE_PHRASE));
        return new_node;
    }

    public static SubLObject cyc_graph_node_set_core_method(final SubLObject self, final SubLObject cyc_term, SubLObject v_graph) {
        if (v_graph == UNPROVIDED) {
            v_graph = NIL;
        }
        assert NIL != term.closed_termP(cyc_term, UNPROVIDED) : "term.closed_termP(cyc_term, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != term.closed_termP(cyc_term, CommonSymbols.UNPROVIDED) " + cyc_term;
        return methods.funcall_instance_super_method_with_2_args(self, SET_CORE, cyc_term, v_graph);
    }

    public static SubLObject cyc_graph_node_generate_phrase_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_graph_node_method = NIL;
        final SubLObject v_core = get_graph_node_core(self);
        try {
            thread.throwStack.push($sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD);
            try {
                sublisp_throw($sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD, pph_main.generate_phrase(v_core, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_node_core(self, v_core);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_graph_node_method = Errors.handleThrowable(ccatch_env_var, $sym221$OUTER_CATCH_FOR_CYC_GRAPH_NODE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_graph_node_method;
    }

    public static SubLObject get_cyc_graph_edge_predicate(final SubLObject cyc_graph_edge) {
        return classes.subloop_get_access_protected_instance_slot(cyc_graph_edge, FOUR_INTEGER, PREDICATE);
    }

    public static SubLObject set_cyc_graph_edge_predicate(final SubLObject cyc_graph_edge, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyc_graph_edge, value, FOUR_INTEGER, PREDICATE);
    }

    public static SubLObject subloop_reserved_initialize_cyc_graph_edge_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_graph_edge_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_EDGE, FROM, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_EDGE, TO, NIL);
        classes.subloop_initialize_slot(new_instance, GRAPH_EDGE, LABEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYC_GRAPH_EDGE, PREDICATE, NIL);
        return NIL;
    }

    public static SubLObject cyc_graph_edge_p(final SubLObject cyc_graph_edge) {
        return classes.subloop_instanceof_class(cyc_graph_edge, CYC_GRAPH_EDGE);
    }

    public static SubLObject cyc_graph_edge_make_edge_method(final SubLObject self, final SubLObject from_node, final SubLObject to_node, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = $$genls;
        }
        assert NIL != cyc_graph_node_p(to_node) : "graph.cyc_graph_node_p(to_node) " + "CommonSymbols.NIL != graph.cyc_graph_node_p(to_node) " + to_node;
        assert NIL != cyc_graph_node_p(from_node) : "graph.cyc_graph_node_p(from_node) " + "CommonSymbols.NIL != graph.cyc_graph_node_p(from_node) " + from_node;
        assert NIL != fort_types_interface.predicateP(pred) : "fort_types_interface.predicateP(pred) " + "CommonSymbols.NIL != fort_types_interface.predicateP(pred) " + pred;
        final SubLObject fid = instances.get_slot(from_node, ID);
        final SubLObject tid = instances.get_slot(to_node, ID);
        final SubLObject new_edge = object.new_class_instance(CYC_GRAPH_EDGE);
        if (fid.isNumber() && tid.isNumber()) {
            methods.funcall_instance_method_with_1_args(new_edge, SET_FROM, fid);
            methods.funcall_instance_method_with_1_args(new_edge, SET_TO, tid);
            methods.funcall_instance_method_with_1_args(new_edge, SET_PREDICATE, pred);
            return new_edge;
        }
        return NIL;
    }

    public static SubLObject cyc_graph_edge_set_predicate_method(final SubLObject self, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_graph_edge_method = NIL;
        SubLObject predicate = get_cyc_graph_edge_predicate(self);
        try {
            thread.throwStack.push($sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD);
            try {
                assert NIL != fort_types_interface.predicateP(pred) : "fort_types_interface.predicateP(pred) " + "CommonSymbols.NIL != fort_types_interface.predicateP(pred) " + pred;
                predicate = pred;
                sublisp_throw($sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_cyc_graph_edge_predicate(self, predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_graph_edge_method = Errors.handleThrowable(ccatch_env_var, $sym237$OUTER_CATCH_FOR_CYC_GRAPH_EDGE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_graph_edge_method;
    }

    public static SubLObject subloop_reserved_initialize_cyc_graph_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cyc_graph_instance(final SubLObject new_instance) {
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

    public static SubLObject cyc_graph_p(final SubLObject cyc_graph) {
        return classes.subloop_instanceof_class(cyc_graph, CYC_GRAPH);
    }

    public static SubLObject new_cyc_graph(final SubLObject name) {
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        final SubLObject v_graph = object.new_class_instance(CYC_GRAPH);
        instances.set_slot(v_graph, NAME, name);
        return v_graph;
    }

    public static SubLObject get_cyc_graph_ancestor_pruning_predicate(final SubLObject predicate) {
        assert NIL != fort_types_interface.predicateP(predicate) : "fort_types_interface.predicateP(predicate) " + "CommonSymbols.NIL != fort_types_interface.predicateP(predicate) " + predicate;
        if (predicate.eql($$genls)) {
            return $$genls;
        }
        if (predicate.eql($$isa)) {
            return $$genls;
        }
        return NIL;
    }

    public static SubLObject cyc_graph_accept_node_method(final SubLObject self, final SubLObject new_node) {
        return cyc_graph_node_p(new_node);
    }

    public static SubLObject cyc_graph_accept_edge_method(final SubLObject self, final SubLObject new_edge) {
        return cyc_graph_edge_p(new_edge);
    }

    public static SubLObject cyc_graph_interpolate_node_method(final SubLObject self, final SubLObject new_node, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = $$genls;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_cyc_graph_method = NIL;
        final SubLObject nodes = get_graph_nodes(self);
        try {
            thread.throwStack.push($sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD);
            try {
                if (NIL == methods.funcall_instance_method_with_1_args(self, GET_NODE_BY_CORE, methods.funcall_instance_method_with_0_args(new_node, GET_CORE))) {
                    methods.funcall_instance_method_with_1_args(self, ADD_NODE, new_node);
                    SubLObject adopted_children = NIL;
                    SubLObject most_specific_ancestors = NIL;
                    final SubLObject pruning_pred = get_cyc_graph_ancestor_pruning_predicate(predicate);
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(nodes)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject old_node = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (!old_node.eql(new_node)) {
                            final SubLObject arg_old = methods.funcall_instance_method_with_0_args(old_node, GET_CORE);
                            final SubLObject arg_new = methods.funcall_instance_method_with_0_args(new_node, GET_CORE);
                            final SubLObject candidate_ancestor = (NIL != cyc_kernel.cyc_query(list(predicate, arg_new, arg_old), $$EverythingPSC, UNPROVIDED)) ? arg_old : NIL;
                            final SubLObject candidate_adoptee = (NIL != cyc_kernel.cyc_query(list(predicate, arg_old, arg_new), $$EverythingPSC, UNPROVIDED)) ? arg_old : NIL;
                            most_specific_ancestors = challenge_set_wrt_predicate(most_specific_ancestors, candidate_ancestor, pruning_pred, UNPROVIDED);
                            adopted_children = challenge_set_wrt_predicate(adopted_children, candidate_adoptee, pruning_pred, NIL);
                        }
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    SubLObject cdolist_list_var = most_specific_ancestors;
                    SubLObject ancestor = NIL;
                    ancestor = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_1_args(self, GET_EDGES_FROM_NODE, methods.funcall_instance_method_with_1_args(self, GET_NODE_BY_CORE, ancestor));
                        SubLObject edge_from_ancestor = NIL;
                        edge_from_ancestor = cdolist_list_var_$3.first();
                        while (NIL != cdolist_list_var_$3) {
                            final SubLObject to_id = methods.funcall_instance_method_with_0_args(edge_from_ancestor, GET_TO);
                            SubLObject match = NIL;
                            if (NIL == match) {
                                SubLObject csome_list_var;
                                SubLObject adoptee;
                                for (csome_list_var = adopted_children, adoptee = NIL, adoptee = csome_list_var.first(); (NIL == match) && (NIL != csome_list_var); match = numE(to_id, instances.get_slot(methods.funcall_instance_method_with_1_args(self, GET_NODE_BY_CORE, adoptee), ID)) , csome_list_var = csome_list_var.rest() , adoptee = csome_list_var.first()) {
                                }
                            }
                            if (NIL != match) {
                                methods.funcall_instance_method_with_1_args(self, REMOVE_EDGE, edge_from_ancestor);
                            }
                            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                            edge_from_ancestor = cdolist_list_var_$3.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        ancestor = cdolist_list_var.first();
                    } 
                    cdolist_list_var = most_specific_ancestors;
                    ancestor = NIL;
                    ancestor = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject ancestor_node = methods.funcall_instance_method_with_1_args(self, GET_NODE_BY_CORE, ancestor);
                        methods.funcall_instance_method_with_1_args(self, ADD_EDGE, methods.funcall_class_method_with_3_args(CYC_GRAPH_EDGE, MAKE_EDGE, ancestor_node, new_node, predicate));
                        cdolist_list_var = cdolist_list_var.rest();
                        ancestor = cdolist_list_var.first();
                    } 
                    cdolist_list_var = adopted_children;
                    SubLObject adoptee2 = NIL;
                    adoptee2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject adoptee_node = methods.funcall_instance_method_with_1_args(self, GET_NODE_BY_CORE, adoptee2);
                        methods.funcall_instance_method_with_1_args(self, ADD_EDGE, methods.funcall_class_method_with_3_args(CYC_GRAPH_EDGE, MAKE_EDGE, new_node, adoptee_node, predicate));
                        cdolist_list_var = cdolist_list_var.rest();
                        adoptee2 = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_graph_nodes(self, nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_cyc_graph_method = Errors.handleThrowable(ccatch_env_var, $sym251$OUTER_CATCH_FOR_CYC_GRAPH_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_cyc_graph_method;
    }

    public static SubLObject cyc_graph_interpolate_cyc_term_method(final SubLObject self, final SubLObject cyc_term, SubLObject predicate) {
        if (predicate == UNPROVIDED) {
            predicate = $$genls;
        }
        final SubLObject new_node = methods.funcall_class_method_with_1_args(CYC_GRAPH_NODE, MAKE_NODE, cyc_term);
        methods.funcall_instance_method_with_2_args(self, INTERPOLATE_NODE, new_node, predicate);
        return self;
    }

    public static SubLObject challenge_set_wrt_predicate(final SubLObject incumbents, final SubLObject challenger, final SubLObject predicate, SubLObject entrant_arg1P) {
        if (entrant_arg1P == UNPROVIDED) {
            entrant_arg1P = T;
        }
        if (NIL == challenger) {
            return incumbents;
        }
        if (NIL == incumbents) {
            return list(challenger);
        }
        final SubLObject head = incumbents.first();
        final SubLObject tail = incumbents.rest();
        final SubLObject queries = list(list(predicate, challenger, head), list(predicate, head, challenger));
        final SubLObject new_head_query = (NIL != entrant_arg1P) ? queries.first() : second(queries);
        final SubLObject survivor_query = (NIL != entrant_arg1P) ? second(queries) : queries.first();
        final SubLObject new_head = (NIL != cyc_kernel.cyc_query(new_head_query, $$EverythingPSC, UNPROVIDED)) ? challenger : head;
        final SubLObject survivor = (NIL != cyc_kernel.cyc_query(survivor_query, $$EverythingPSC, UNPROVIDED)) ? NIL : challenger;
        return remove_duplicates(cons(new_head, challenge_set_wrt_predicate(tail, survivor, predicate, entrant_arg1P)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_graph_file() {
        declareFunction(me, "get_graph_node_label", "GET-GRAPH-NODE-LABEL", 1, 0, false);
        declareFunction(me, "set_graph_node_label", "SET-GRAPH-NODE-LABEL", 2, 0, false);
        declareFunction(me, "get_graph_node_id", "GET-GRAPH-NODE-ID", 1, 0, false);
        declareFunction(me, "set_graph_node_id", "SET-GRAPH-NODE-ID", 2, 0, false);
        declareFunction(me, "get_graph_node_core", "GET-GRAPH-NODE-CORE", 1, 0, false);
        declareFunction(me, "set_graph_node_core", "SET-GRAPH-NODE-CORE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_graph_node_class", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_graph_node_instance", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-NODE-INSTANCE", 1, 0, false);
        declareFunction(me, "graph_node_p", "GRAPH-NODE-P", 1, 0, false);
        declareFunction(me, "graph_node_initialize_method", "GRAPH-NODE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "graph_node_set_id_method", "GRAPH-NODE-SET-ID-METHOD", 2, 0, false);
        declareFunction(me, "graph_node_set_core_method", "GRAPH-NODE-SET-CORE-METHOD", 2, 1, false);
        declareFunction(me, "graph_node_set_label_method", "GRAPH-NODE-SET-LABEL-METHOD", 2, 0, false);
        declareFunction(me, "graph_node_get_label_method", "GRAPH-NODE-GET-LABEL-METHOD", 1, 0, false);
        declareFunction(me, "graph_node_get_core_method", "GRAPH-NODE-GET-CORE-METHOD", 1, 0, false);
        declareFunction(me, "graph_node_get_id_method", "GRAPH-NODE-GET-ID-METHOD", 1, 0, false);
        declareFunction(me, "graph_node_print_method", "GRAPH-NODE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "get_graph_edge_label", "GET-GRAPH-EDGE-LABEL", 1, 0, false);
        declareFunction(me, "set_graph_edge_label", "SET-GRAPH-EDGE-LABEL", 2, 0, false);
        declareFunction(me, "get_graph_edge_to", "GET-GRAPH-EDGE-TO", 1, 0, false);
        declareFunction(me, "set_graph_edge_to", "SET-GRAPH-EDGE-TO", 2, 0, false);
        declareFunction(me, "get_graph_edge_from", "GET-GRAPH-EDGE-FROM", 1, 0, false);
        declareFunction(me, "set_graph_edge_from", "SET-GRAPH-EDGE-FROM", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_graph_edge_class", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_graph_edge_instance", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-EDGE-INSTANCE", 1, 0, false);
        declareFunction(me, "graph_edge_p", "GRAPH-EDGE-P", 1, 0, false);
        declareFunction(me, "graph_edge_make_edge_method", "GRAPH-EDGE-MAKE-EDGE-METHOD", 3, 0, false);
        declareFunction(me, "graph_edge_initialize_method", "GRAPH-EDGE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "graph_edge_set_from_method", "GRAPH-EDGE-SET-FROM-METHOD", 2, 0, false);
        declareFunction(me, "graph_edge_set_to_method", "GRAPH-EDGE-SET-TO-METHOD", 2, 0, false);
        declareFunction(me, "graph_edge_get_from_method", "GRAPH-EDGE-GET-FROM-METHOD", 1, 0, false);
        declareFunction(me, "graph_edge_get_to_method", "GRAPH-EDGE-GET-TO-METHOD", 1, 0, false);
        declareFunction(me, "graph_edge_set_label_method", "GRAPH-EDGE-SET-LABEL-METHOD", 2, 0, false);
        declareFunction(me, "graph_edge_get_label_method", "GRAPH-EDGE-GET-LABEL-METHOD", 1, 0, false);
        declareFunction(me, "graph_edge_print_method", "GRAPH-EDGE-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "get_graph_core_node_map", "GET-GRAPH-CORE-NODE-MAP", 1, 0, false);
        declareFunction(me, "set_graph_core_node_map", "SET-GRAPH-CORE-NODE-MAP", 2, 0, false);
        declareFunction(me, "get_graph_edges_target", "GET-GRAPH-EDGES-TARGET", 1, 0, false);
        declareFunction(me, "set_graph_edges_target", "SET-GRAPH-EDGES-TARGET", 2, 0, false);
        declareFunction(me, "get_graph_edges_source", "GET-GRAPH-EDGES-SOURCE", 1, 0, false);
        declareFunction(me, "set_graph_edges_source", "SET-GRAPH-EDGES-SOURCE", 2, 0, false);
        declareFunction(me, "get_graph_label_edge_map", "GET-GRAPH-LABEL-EDGE-MAP", 1, 0, false);
        declareFunction(me, "set_graph_label_edge_map", "SET-GRAPH-LABEL-EDGE-MAP", 2, 0, false);
        declareFunction(me, "get_graph_nodes", "GET-GRAPH-NODES", 1, 0, false);
        declareFunction(me, "set_graph_nodes", "SET-GRAPH-NODES", 2, 0, false);
        declareFunction(me, "get_graph_label_node_map", "GET-GRAPH-LABEL-NODE-MAP", 1, 0, false);
        declareFunction(me, "set_graph_label_node_map", "SET-GRAPH-LABEL-NODE-MAP", 2, 0, false);
        declareFunction(me, "get_graph_integer_sequence_generator", "GET-GRAPH-INTEGER-SEQUENCE-GENERATOR", 1, 0, false);
        declareFunction(me, "set_graph_integer_sequence_generator", "SET-GRAPH-INTEGER-SEQUENCE-GENERATOR", 2, 0, false);
        declareFunction(me, "get_graph_name", "GET-GRAPH-NAME", 1, 0, false);
        declareFunction(me, "set_graph_name", "SET-GRAPH-NAME", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_graph_class", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-GRAPH-INSTANCE", 1, 0, false);
        declareFunction(me, "graph_p", "GRAPH-P", 1, 0, false);
        declareFunction(me, "new_graph", "NEW-GRAPH", 1, 0, false);
        declareFunction(me, "graph_initialize_method", "GRAPH-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "graph_accept_node_method", "GRAPH-ACCEPT-NODE-METHOD", 2, 0, false);
        declareFunction(me, "graph_accept_edge_method", "GRAPH-ACCEPT-EDGE-METHOD", 2, 0, false);
        declareFunction(me, "graph_add_node_method", "GRAPH-ADD-NODE-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_node_by_id_method", "GRAPH-GET-NODE-BY-ID-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_node_by_label_method", "GRAPH-GET-NODE-BY-LABEL-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_node_by_core_method", "GRAPH-GET-NODE-BY-CORE-METHOD", 2, 0, false);
        declareFunction(me, "graph_add_edge_method", "GRAPH-ADD-EDGE-METHOD", 2, 0, false);
        declareFunction(me, "graph_remove_edge_method", "GRAPH-REMOVE-EDGE-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_edges_from_method", "GRAPH-GET-EDGES-FROM-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_edges_to_method", "GRAPH-GET-EDGES-TO-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_edges_from_node_method", "GRAPH-GET-EDGES-FROM-NODE-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_edges_to_node_method", "GRAPH-GET-EDGES-TO-NODE-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_nodes_from_node_method", "GRAPH-GET-NODES-FROM-NODE-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_nodes_to_node_method", "GRAPH-GET-NODES-TO-NODE-METHOD", 2, 0, false);
        declareFunction(me, "graph_get_path_labels_method", "GRAPH-GET-PATH-LABELS-METHOD", 2, 0, false);
        declareFunction(me, "graph_collect_ascending_method", "GRAPH-COLLECT-ASCENDING-METHOD", 2, 0, false);
        declareFunction(me, "graph_collect_all_ascending_method", "GRAPH-COLLECT-ALL-ASCENDING-METHOD", 2, 0, false);
        declareFunction(me, "graph_print_method", "GRAPH-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "graph_pprint_method", "GRAPH-PPRINT-METHOD", 1, 1, false);
        declareFunction(me, "make_graph_from_string_lists", "MAKE-GRAPH-FROM-STRING-LISTS", 1, 0, false);
        declareMacro(me, "do_graph_nodes", "DO-GRAPH-NODES");
        declareFunction(me, "subloop_reserved_initialize_cyc_graph_node_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cyc_graph_node_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-NODE-INSTANCE", 1, 0, false);
        declareFunction(me, "cyc_graph_node_p", "CYC-GRAPH-NODE-P", 1, 0, false);
        declareFunction(me, "cyc_graph_node_make_node_method", "CYC-GRAPH-NODE-MAKE-NODE-METHOD", 2, 0, false);
        declareFunction(me, "cyc_graph_node_set_core_method", "CYC-GRAPH-NODE-SET-CORE-METHOD", 2, 1, false);
        declareFunction(me, "cyc_graph_node_generate_phrase_method", "CYC-GRAPH-NODE-GENERATE-PHRASE-METHOD", 1, 0, false);
        declareFunction(me, "get_cyc_graph_edge_predicate", "GET-CYC-GRAPH-EDGE-PREDICATE", 1, 0, false);
        declareFunction(me, "set_cyc_graph_edge_predicate", "SET-CYC-GRAPH-EDGE-PREDICATE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cyc_graph_edge_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cyc_graph_edge_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-EDGE-INSTANCE", 1, 0, false);
        declareFunction(me, "cyc_graph_edge_p", "CYC-GRAPH-EDGE-P", 1, 0, false);
        declareFunction(me, "cyc_graph_edge_make_edge_method", "CYC-GRAPH-EDGE-MAKE-EDGE-METHOD", 3, 1, false);
        declareFunction(me, "cyc_graph_edge_set_predicate_method", "CYC-GRAPH-EDGE-SET-PREDICATE-METHOD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cyc_graph_class", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_cyc_graph_instance", "SUBLOOP-RESERVED-INITIALIZE-CYC-GRAPH-INSTANCE", 1, 0, false);
        declareFunction(me, "cyc_graph_p", "CYC-GRAPH-P", 1, 0, false);
        declareFunction(me, "new_cyc_graph", "NEW-CYC-GRAPH", 1, 0, false);
        declareFunction(me, "get_cyc_graph_ancestor_pruning_predicate", "GET-CYC-GRAPH-ANCESTOR-PRUNING-PREDICATE", 1, 0, false);
        declareFunction(me, "cyc_graph_accept_node_method", "CYC-GRAPH-ACCEPT-NODE-METHOD", 2, 0, false);
        declareFunction(me, "cyc_graph_accept_edge_method", "CYC-GRAPH-ACCEPT-EDGE-METHOD", 2, 0, false);
        declareFunction(me, "cyc_graph_interpolate_node_method", "CYC-GRAPH-INTERPOLATE-NODE-METHOD", 2, 1, false);
        declareFunction(me, "cyc_graph_interpolate_cyc_term_method", "CYC-GRAPH-INTERPOLATE-CYC-TERM-METHOD", 2, 1, false);
        declareFunction(me, "challenge_set_wrt_predicate", "CHALLENGE-SET-WRT-PREDICATE", 3, 1, false);
        return NIL;
    }

    public static SubLObject init_graph_file() {
        return NIL;
    }

    public static SubLObject setup_graph_file() {
        classes.subloop_new_class(GRAPH_NODE, OBJECT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(GRAPH_NODE, NIL);
        classes.subloop_note_class_initialization_function(GRAPH_NODE, SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_CLASS);
        classes.subloop_note_instance_initialization_function(GRAPH_NODE, SUBLOOP_RESERVED_INITIALIZE_GRAPH_NODE_INSTANCE);
        subloop_reserved_initialize_graph_node_class(GRAPH_NODE);
        methods.methods_incorporate_instance_method(INITIALIZE, GRAPH_NODE, $list12, NIL, $list13);
        methods.subloop_register_instance_method(GRAPH_NODE, INITIALIZE, GRAPH_NODE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_ID, GRAPH_NODE, $list12, $list16, $list17);
        methods.subloop_register_instance_method(GRAPH_NODE, SET_ID, GRAPH_NODE_SET_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_CORE, GRAPH_NODE, $list12, $list22, $list23);
        methods.subloop_register_instance_method(GRAPH_NODE, SET_CORE, GRAPH_NODE_SET_CORE_METHOD);
        methods.methods_incorporate_instance_method(SET_LABEL, GRAPH_NODE, $list12, $list28, $list29);
        methods.subloop_register_instance_method(GRAPH_NODE, SET_LABEL, GRAPH_NODE_SET_LABEL_METHOD);
        methods.methods_incorporate_instance_method(GET_LABEL, GRAPH_NODE, $list12, NIL, $list34);
        methods.subloop_register_instance_method(GRAPH_NODE, GET_LABEL, GRAPH_NODE_GET_LABEL_METHOD);
        methods.methods_incorporate_instance_method(GET_CORE, GRAPH_NODE, $list12, NIL, $list39);
        methods.subloop_register_instance_method(GRAPH_NODE, GET_CORE, GRAPH_NODE_GET_CORE_METHOD);
        methods.methods_incorporate_instance_method(GET_ID, GRAPH_NODE, $list12, NIL, $list43);
        methods.subloop_register_instance_method(GRAPH_NODE, GET_ID, GRAPH_NODE_GET_ID_METHOD);
        methods.methods_incorporate_instance_method(PRINT, GRAPH_NODE, $list12, $list47, $list48);
        methods.subloop_register_instance_method(GRAPH_NODE, PRINT, GRAPH_NODE_PRINT_METHOD);
        classes.subloop_new_class(GRAPH_EDGE, OBJECT, NIL, NIL, $list57);
        classes.class_set_implements_slot_listeners(GRAPH_EDGE, NIL);
        classes.subloop_note_class_initialization_function(GRAPH_EDGE, SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_CLASS);
        classes.subloop_note_instance_initialization_function(GRAPH_EDGE, SUBLOOP_RESERVED_INITIALIZE_GRAPH_EDGE_INSTANCE);
        subloop_reserved_initialize_graph_edge_class(GRAPH_EDGE);
        methods.methods_incorporate_class_method(MAKE_EDGE, GRAPH_EDGE, $list63, $list64, $list65);
        methods.subloop_register_class_method(GRAPH_EDGE, MAKE_EDGE, GRAPH_EDGE_MAKE_EDGE_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, GRAPH_EDGE, $list12, NIL, $list70);
        methods.subloop_register_instance_method(GRAPH_EDGE, INITIALIZE, GRAPH_EDGE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_FROM, GRAPH_EDGE, $list12, $list16, $list72);
        methods.subloop_register_instance_method(GRAPH_EDGE, SET_FROM, GRAPH_EDGE_SET_FROM_METHOD);
        methods.methods_incorporate_instance_method(SET_TO, GRAPH_EDGE, $list12, $list16, $list75);
        methods.subloop_register_instance_method(GRAPH_EDGE, SET_TO, GRAPH_EDGE_SET_TO_METHOD);
        methods.methods_incorporate_instance_method(GET_FROM, GRAPH_EDGE, $list12, NIL, $list79);
        methods.subloop_register_instance_method(GRAPH_EDGE, GET_FROM, GRAPH_EDGE_GET_FROM_METHOD);
        methods.methods_incorporate_instance_method(GET_TO, GRAPH_EDGE, $list12, NIL, $list83);
        methods.subloop_register_instance_method(GRAPH_EDGE, GET_TO, GRAPH_EDGE_GET_TO_METHOD);
        methods.methods_incorporate_instance_method(SET_LABEL, GRAPH_EDGE, $list12, $list28, $list86);
        methods.subloop_register_instance_method(GRAPH_EDGE, SET_LABEL, GRAPH_EDGE_SET_LABEL_METHOD);
        methods.methods_incorporate_instance_method(GET_LABEL, GRAPH_EDGE, $list12, NIL, $list34);
        methods.subloop_register_instance_method(GRAPH_EDGE, GET_LABEL, GRAPH_EDGE_GET_LABEL_METHOD);
        methods.methods_incorporate_instance_method(PRINT, GRAPH_EDGE, $list12, $list47, $list91);
        methods.subloop_register_instance_method(GRAPH_EDGE, PRINT, GRAPH_EDGE_PRINT_METHOD);
        classes.subloop_new_class(GRAPH, OBJECT, NIL, NIL, $list98);
        classes.class_set_implements_slot_listeners(GRAPH, NIL);
        classes.subloop_note_class_initialization_function(GRAPH, SUBLOOP_RESERVED_INITIALIZE_GRAPH_CLASS);
        classes.subloop_note_instance_initialization_function(GRAPH, SUBLOOP_RESERVED_INITIALIZE_GRAPH_INSTANCE);
        subloop_reserved_initialize_graph_class(GRAPH);
        methods.methods_incorporate_instance_method(INITIALIZE, GRAPH, $list12, NIL, $list108);
        methods.subloop_register_instance_method(GRAPH, INITIALIZE, GRAPH_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ACCEPT_NODE, GRAPH, $list12, $list112, $list113);
        methods.subloop_register_instance_method(GRAPH, ACCEPT_NODE, GRAPH_ACCEPT_NODE_METHOD);
        methods.methods_incorporate_instance_method(ACCEPT_EDGE, GRAPH, $list12, $list116, $list117);
        methods.subloop_register_instance_method(GRAPH, ACCEPT_EDGE, GRAPH_ACCEPT_EDGE_METHOD);
        methods.methods_incorporate_instance_method(ADD_NODE, GRAPH, $list63, $list112, $list120);
        methods.subloop_register_instance_method(GRAPH, ADD_NODE, GRAPH_ADD_NODE_METHOD);
        methods.methods_incorporate_instance_method(GET_NODE_BY_ID, GRAPH, $list63, $list125, $list126);
        methods.subloop_register_instance_method(GRAPH, GET_NODE_BY_ID, GRAPH_GET_NODE_BY_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_NODE_BY_LABEL, GRAPH, $list63, $list28, $list130);
        methods.subloop_register_instance_method(GRAPH, GET_NODE_BY_LABEL, GRAPH_GET_NODE_BY_LABEL_METHOD);
        methods.methods_incorporate_instance_method(GET_NODE_BY_CORE, GRAPH, $list63, $list134, $list135);
        methods.subloop_register_instance_method(GRAPH, GET_NODE_BY_CORE, GRAPH_GET_NODE_BY_CORE_METHOD);
        methods.methods_incorporate_instance_method(ADD_EDGE, GRAPH, $list63, $list116, $list139);
        methods.subloop_register_instance_method(GRAPH, ADD_EDGE, GRAPH_ADD_EDGE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_EDGE, GRAPH, $list63, $list144, $list145);
        methods.subloop_register_instance_method(GRAPH, REMOVE_EDGE, GRAPH_REMOVE_EDGE_METHOD);
        methods.methods_incorporate_instance_method(GET_EDGES_FROM, GRAPH, $list63, $list125, $list150);
        methods.subloop_register_instance_method(GRAPH, GET_EDGES_FROM, GRAPH_GET_EDGES_FROM_METHOD);
        methods.methods_incorporate_instance_method(GET_EDGES_TO, GRAPH, $list63, $list125, $list154);
        methods.subloop_register_instance_method(GRAPH, GET_EDGES_TO, GRAPH_GET_EDGES_TO_METHOD);
        methods.methods_incorporate_instance_method(GET_EDGES_FROM_NODE, GRAPH, $list63, $list158, $list159);
        methods.subloop_register_instance_method(GRAPH, GET_EDGES_FROM_NODE, GRAPH_GET_EDGES_FROM_NODE_METHOD);
        methods.methods_incorporate_instance_method(GET_EDGES_TO_NODE, GRAPH, $list63, $list158, $list163);
        methods.subloop_register_instance_method(GRAPH, GET_EDGES_TO_NODE, GRAPH_GET_EDGES_TO_NODE_METHOD);
        methods.methods_incorporate_instance_method(GET_NODES_FROM_NODE, GRAPH, $list63, $list158, $list167);
        methods.subloop_register_instance_method(GRAPH, GET_NODES_FROM_NODE, GRAPH_GET_NODES_FROM_NODE_METHOD);
        methods.methods_incorporate_instance_method(GET_NODES_TO_NODE, GRAPH, $list63, $list158, $list171);
        methods.subloop_register_instance_method(GRAPH, GET_NODES_TO_NODE, GRAPH_GET_NODES_TO_NODE_METHOD);
        methods.methods_incorporate_instance_method(GET_PATH_LABELS, GRAPH, $list63, $list175, $list176);
        methods.subloop_register_instance_method(GRAPH, GET_PATH_LABELS, GRAPH_GET_PATH_LABELS_METHOD);
        methods.methods_incorporate_instance_method(COLLECT_ASCENDING, GRAPH, $list63, $list158, $list181);
        methods.subloop_register_instance_method(GRAPH, COLLECT_ASCENDING, GRAPH_COLLECT_ASCENDING_METHOD);
        methods.methods_incorporate_instance_method(COLLECT_ALL_ASCENDING, GRAPH, $list63, $list184, $list185);
        methods.subloop_register_instance_method(GRAPH, COLLECT_ALL_ASCENDING, GRAPH_COLLECT_ALL_ASCENDING_METHOD);
        methods.methods_incorporate_instance_method(PRINT, GRAPH, $list12, $list47, $list188);
        methods.subloop_register_instance_method(GRAPH, PRINT, GRAPH_PRINT_METHOD);
        methods.methods_incorporate_instance_method(PPRINT, GRAPH, $list63, $list193, $list194);
        methods.subloop_register_instance_method(GRAPH, PPRINT, GRAPH_PPRINT_METHOD);
        classes.subloop_new_class(CYC_GRAPH_NODE, GRAPH_NODE, NIL, NIL, $list208);
        classes.class_set_implements_slot_listeners(CYC_GRAPH_NODE, NIL);
        classes.subloop_note_class_initialization_function(CYC_GRAPH_NODE, SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_CLASS);
        classes.subloop_note_instance_initialization_function(CYC_GRAPH_NODE, SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_NODE_INSTANCE);
        subloop_reserved_initialize_cyc_graph_node_class(CYC_GRAPH_NODE);
        methods.methods_incorporate_class_method(MAKE_NODE, CYC_GRAPH_NODE, $list63, $list212, $list213);
        methods.subloop_register_class_method(CYC_GRAPH_NODE, MAKE_NODE, CYC_GRAPH_NODE_MAKE_NODE_METHOD);
        methods.methods_incorporate_instance_method(SET_CORE, CYC_GRAPH_NODE, $list63, $list216, $list217);
        methods.subloop_register_instance_method(CYC_GRAPH_NODE, SET_CORE, CYC_GRAPH_NODE_SET_CORE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_PHRASE, CYC_GRAPH_NODE, $list63, NIL, $list220);
        methods.subloop_register_instance_method(CYC_GRAPH_NODE, GENERATE_PHRASE, CYC_GRAPH_NODE_GENERATE_PHRASE_METHOD);
        classes.subloop_new_class(CYC_GRAPH_EDGE, GRAPH_EDGE, NIL, NIL, $list224);
        classes.class_set_implements_slot_listeners(CYC_GRAPH_EDGE, NIL);
        classes.subloop_note_class_initialization_function(CYC_GRAPH_EDGE, SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_CLASS);
        classes.subloop_note_instance_initialization_function(CYC_GRAPH_EDGE, SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_EDGE_INSTANCE);
        subloop_reserved_initialize_cyc_graph_edge_class(CYC_GRAPH_EDGE);
        methods.methods_incorporate_class_method(MAKE_EDGE, CYC_GRAPH_EDGE, $list63, $list228, $list229);
        methods.subloop_register_class_method(CYC_GRAPH_EDGE, MAKE_EDGE, CYC_GRAPH_EDGE_MAKE_EDGE_METHOD);
        methods.methods_incorporate_instance_method(SET_PREDICATE, CYC_GRAPH_EDGE, $list63, $list235, $list236);
        methods.subloop_register_instance_method(CYC_GRAPH_EDGE, SET_PREDICATE, CYC_GRAPH_EDGE_SET_PREDICATE_METHOD);
        classes.subloop_new_class(CYC_GRAPH, GRAPH, NIL, NIL, $list240);
        classes.class_set_implements_slot_listeners(CYC_GRAPH, NIL);
        classes.subloop_note_class_initialization_function(CYC_GRAPH, SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_CLASS);
        classes.subloop_note_instance_initialization_function(CYC_GRAPH, SUBLOOP_RESERVED_INITIALIZE_CYC_GRAPH_INSTANCE);
        subloop_reserved_initialize_cyc_graph_class(CYC_GRAPH);
        methods.methods_incorporate_instance_method(ACCEPT_NODE, CYC_GRAPH, $list12, $list112, $list244);
        methods.subloop_register_instance_method(CYC_GRAPH, ACCEPT_NODE, CYC_GRAPH_ACCEPT_NODE_METHOD);
        methods.methods_incorporate_instance_method(ACCEPT_EDGE, CYC_GRAPH, $list12, $list116, $list246);
        methods.subloop_register_instance_method(CYC_GRAPH, ACCEPT_EDGE, CYC_GRAPH_ACCEPT_EDGE_METHOD);
        methods.methods_incorporate_instance_method(INTERPOLATE_NODE, CYC_GRAPH, $list63, $list249, $list250);
        methods.subloop_register_instance_method(CYC_GRAPH, INTERPOLATE_NODE, CYC_GRAPH_INTERPOLATE_NODE_METHOD);
        methods.methods_incorporate_instance_method(INTERPOLATE_CYC_TERM, CYC_GRAPH, $list63, $list255, $list256);
        methods.subloop_register_instance_method(CYC_GRAPH, INTERPOLATE_CYC_TERM, CYC_GRAPH_INTERPOLATE_CYC_TERM_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_graph_file();
    }

    @Override
    public void initializeVariables() {
        init_graph_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_graph_file();
    }

    
}

/**
 * Total time: 1617 ms
 */
