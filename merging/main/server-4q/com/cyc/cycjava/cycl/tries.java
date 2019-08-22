/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.list_utilities.delete_first;
import static com.cyc.cycjava.cycl.list_utilities.lengthE;
import static com.cyc.cycjava.cycl.utilities_macros.$structure_resourcing_enabled$;
import static com.cyc.cycjava.cycl.utilities_macros.$structure_resourcing_make_static$;
import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_downcase;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_lessp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_not_greaterp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      TRIES
 * source file: /cyc/top/cycl/tries.lisp
 * created:     2019/07/03 17:37:14
 */
public final class tries extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new tries();

 public static final String myName = "com.cyc.cycjava.cycl.tries";


    // defparameter
    @LispMethod(comment = "Special variable used when gathering objects from a TRIE\ndefparameter")
    public static final SubLSymbol $trie_objects$ = makeSymbol("*TRIE-OBJECTS*");

    // defparameter
    @LispMethod(comment = "Special variable used while walking over relevant portions of a multi-trie\ndefparameter")
    public static final SubLSymbol $trie_relevant_marks$ = makeSymbol("*TRIE-RELEVANT-MARKS*");

    // defparameter
    @LispMethod(comment = "Special variable used to control whether we bother to track the ancestor path in a trie.\ndefparameter")
    public static final SubLSymbol $trie_ancestor_tracking$ = makeSymbol("*TRIE-ANCESTOR-TRACKING*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_trie$ = makeSymbol("*DTP-TRIE*");

    // deflexical
    // Free list for TRIE objects
    /**
     * Free list for TRIE objects
     */
    @LispMethod(comment = "Free list for TRIE objects\ndeflexical")
    private static final SubLSymbol $trie_free_list$ = makeSymbol("*TRIE-FREE-LIST*");

    // deflexical
    // Lock for TRIE object free list
    /**
     * Lock for TRIE object free list
     */
    @LispMethod(comment = "Lock for TRIE object free list\ndeflexical")
    private static final SubLSymbol $trie_free_lock$ = makeSymbol("*TRIE-FREE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $trie_maximum_search_size$ = makeSymbol("*TRIE-MAXIMUM-SEARCH-SIZE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $trie_ancestor_tracking_resource$ = makeSymbol("*TRIE-ANCESTOR-TRACKING-RESOURCE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $trie_ancestor_tracking_lock$ = makeSymbol("*TRIE-ANCESTOR-TRACKING-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $trie_ancestor_tracking_vector_size$ = makeSymbol("*TRIE-ANCESTOR-TRACKING-VECTOR-SIZE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $trie_ancestor_vector$ = makeSymbol("*TRIE-ANCESTOR-VECTOR*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $trie_ancestor_next$ = makeSymbol("*TRIE-ANCESTOR-NEXT*");

    private static final SubLSymbol TRIE_P = makeSymbol("TRIE-P");

    static private final SubLList $list3 = list(makeSymbol("NAME"), makeSymbol("TOP-NODE"), makeSymbol("UNIQUE"), makeSymbol("CASE-SENSITIVE"), makeSymbol("ENTRY-TEST-FUNC"), makeSymbol("MULTI"), makeSymbol("MULTI-KEYS"), makeSymbol("MULTI-KEY-FUNC"));

    static private final SubLList $list4 = list($NAME, makeKeyword("TOP-NODE"), makeKeyword("UNIQUE"), makeKeyword("CASE-SENSITIVE"), makeKeyword("ENTRY-TEST-FUNC"), makeKeyword("MULTI"), makeKeyword("MULTI-KEYS"), makeKeyword("MULTI-KEY-FUNC"));

    static private final SubLList $list5 = list(makeSymbol("TRIE-NAME"), makeSymbol("TRIE-TOP-NODE"), makeSymbol("TRIE-UNIQUE"), makeSymbol("TRIE-CASE-SENSITIVE"), makeSymbol("TRIE-ENTRY-TEST-FUNC"), makeSymbol("TRIE-MULTI"), makeSymbol("TRIE-MULTI-KEYS"), makeSymbol("TRIE-MULTI-KEY-FUNC"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-TRIE-NAME"), makeSymbol("_CSETF-TRIE-TOP-NODE"), makeSymbol("_CSETF-TRIE-UNIQUE"), makeSymbol("_CSETF-TRIE-CASE-SENSITIVE"), makeSymbol("_CSETF-TRIE-ENTRY-TEST-FUNC"), makeSymbol("_CSETF-TRIE-MULTI"), makeSymbol("_CSETF-TRIE-MULTI-KEYS"), makeSymbol("_CSETF-TRIE-MULTI-KEY-FUNC"));

    private static final SubLSymbol PRINT_TRIE = makeSymbol("PRINT-TRIE");

    private static final SubLSymbol TRIE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRIE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TRIE-P"));

    private static final SubLSymbol TRIE_NAME = makeSymbol("TRIE-NAME");

    private static final SubLSymbol _CSETF_TRIE_NAME = makeSymbol("_CSETF-TRIE-NAME");

    private static final SubLSymbol TRIE_TOP_NODE = makeSymbol("TRIE-TOP-NODE");

    private static final SubLSymbol _CSETF_TRIE_TOP_NODE = makeSymbol("_CSETF-TRIE-TOP-NODE");

    private static final SubLSymbol TRIE_UNIQUE = makeSymbol("TRIE-UNIQUE");

    private static final SubLSymbol _CSETF_TRIE_UNIQUE = makeSymbol("_CSETF-TRIE-UNIQUE");

    private static final SubLSymbol TRIE_CASE_SENSITIVE = makeSymbol("TRIE-CASE-SENSITIVE");

    private static final SubLSymbol _CSETF_TRIE_CASE_SENSITIVE = makeSymbol("_CSETF-TRIE-CASE-SENSITIVE");

    private static final SubLSymbol TRIE_ENTRY_TEST_FUNC = makeSymbol("TRIE-ENTRY-TEST-FUNC");

    private static final SubLSymbol _CSETF_TRIE_ENTRY_TEST_FUNC = makeSymbol("_CSETF-TRIE-ENTRY-TEST-FUNC");

    private static final SubLSymbol TRIE_MULTI = makeSymbol("TRIE-MULTI");

    private static final SubLSymbol _CSETF_TRIE_MULTI = makeSymbol("_CSETF-TRIE-MULTI");

    private static final SubLSymbol TRIE_MULTI_KEYS = makeSymbol("TRIE-MULTI-KEYS");

    private static final SubLSymbol _CSETF_TRIE_MULTI_KEYS = makeSymbol("_CSETF-TRIE-MULTI-KEYS");

    private static final SubLSymbol TRIE_MULTI_KEY_FUNC = makeSymbol("TRIE-MULTI-KEY-FUNC");

    private static final SubLSymbol _CSETF_TRIE_MULTI_KEY_FUNC = makeSymbol("_CSETF-TRIE-MULTI-KEY-FUNC");

    private static final SubLSymbol $ENTRY_TEST_FUNC = makeKeyword("ENTRY-TEST-FUNC");

    private static final SubLSymbol $MULTI_KEY_FUNC = makeKeyword("MULTI-KEY-FUNC");

    private static final SubLString $str34$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TRIE = makeSymbol("MAKE-TRIE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TRIE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TRIE-METHOD");

    private static final SubLString $str40$__TRIE = makeString("#<TRIE");

    private static final SubLString $str41$__A = makeString(" ~A");

    private static final SubLString $$$_UNIQUE = makeString(" UNIQUE");

    private static final SubLString $$$_SENSITIVE = makeString(" SENSITIVE");

    private static final SubLString $$$_INSENSITIVE = makeString(" INSENSITIVE");

    private static final SubLString $str45$__S = makeString(" ~S");

    private static final SubLString $str46$_ = makeString(">");

    private static final SubLString $$$TRIE_resource_lock = makeString("TRIE resource lock");

    private static final SubLString $str50$_m___S = makeString("<m> ~S");

    private static final SubLString $str51$_____S = makeString(" :  ~S");

    private static final SubLString $str53$There_is_already_an_object__S_not = makeString("There is already an object ~S not ~S to ~S in the trie!");

    private static final SubLString $$$Remove_it_anyway = makeString("Remove it anyway");

    private static final SubLString $str55$The_object_found_in_trie_for__S_i = makeString("The object found in trie for ~S is ~S, not ~S");

    private static final SubLString $str56$TRIE__S_does_not_have_unique_entr = makeString("TRIE ~S does not have unique entries");

    private static final SubLString $str58$_S_will_result_in_a_search_that_i = makeString("~S will result in a search that is larger than the maximum search size of ~S");

    private static final SubLList $list60 = list(list(makeSymbol("OBJECT"), makeSymbol("TRIE"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list61 = list($DONE, makeKeyword("FORWARD"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym65$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLSymbol NEW_TRIE_ITERATOR = makeSymbol("NEW-TRIE-ITERATOR");

    private static final SubLSymbol TRIE_ITERATOR_DONE = makeSymbol("TRIE-ITERATOR-DONE");

    private static final SubLSymbol TRIE_ITERATOR_NEXT = makeSymbol("TRIE-ITERATOR-NEXT");

    private static final SubLSymbol TRIE_ITERATOR_FINALIZE = makeSymbol("TRIE-ITERATOR-FINALIZE");

    private static final SubLString $$$Ancestor_Tracking_Resource = makeString("Ancestor Tracking Resource");

    private static final SubLSymbol MULTI_TRIE_P = makeSymbol("MULTI-TRIE-P");

    private static final SubLList $list76 = cons(makeSymbol("KEY"), makeSymbol("SUBTRIE"));

    private static final SubLString $str77$_A__A = makeString("~A:~A");

    private static final SubLList $list79 = cons(makeSymbol("MARK"), makeSymbol("SUBTRIE"));

    private static final SubLString $str80$___S_sub_tries = makeString("~%~S sub-tries");

    private static final SubLString $str81$____Sub_Trie__S = makeString("~%~%Sub-Trie ~S");

    private static final SubLSymbol TRIE_LEAF_NODE_P = makeSymbol("TRIE-LEAF-NODE-P");

    public static final SubLObject trie_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_trie(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject trie_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_trie(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject trie_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.tries.$trie_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject trie_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.tries.$trie_native.class ? T : NIL;
    }

    public static final SubLObject trie_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.getField2();
    }

    public static SubLObject trie_name(final SubLObject v_object) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject trie_top_node_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.getField3();
    }

    public static SubLObject trie_top_node(final SubLObject v_object) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject trie_unique_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.getField4();
    }

    public static SubLObject trie_unique(final SubLObject v_object) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject trie_case_sensitive_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.getField5();
    }

    public static SubLObject trie_case_sensitive(final SubLObject v_object) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject trie_entry_test_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.getField6();
    }

    public static SubLObject trie_entry_test_func(final SubLObject v_object) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject trie_multi_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.getField7();
    }

    public static SubLObject trie_multi(final SubLObject v_object) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject trie_multi_keys_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.getField8();
    }

    public static SubLObject trie_multi_keys(final SubLObject v_object) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject trie_multi_key_func_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.getField9();
    }

    public static SubLObject trie_multi_key_func(final SubLObject v_object) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject _csetf_trie_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_trie_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_trie_top_node_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_trie_top_node(final SubLObject v_object, final SubLObject value) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_trie_unique_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_trie_unique(final SubLObject v_object, final SubLObject value) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_trie_case_sensitive_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_trie_case_sensitive(final SubLObject v_object, final SubLObject value) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_trie_entry_test_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_trie_entry_test_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_trie_multi_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_trie_multi(final SubLObject v_object, final SubLObject value) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_trie_multi_keys_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_trie_multi_keys(final SubLObject v_object, final SubLObject value) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_trie_multi_key_func_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_trie_multi_key_func(final SubLObject v_object, final SubLObject value) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject make_trie_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.tries.$trie_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_trie_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TOP_NODE)) {
                            _csetf_trie_top_node(v_new, current_value);
                        } else {
                            if (pcase_var.eql($UNIQUE)) {
                                _csetf_trie_unique(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CASE_SENSITIVE)) {
                                    _csetf_trie_case_sensitive(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ENTRY_TEST_FUNC)) {
                                        _csetf_trie_entry_test_func(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($MULTI)) {
                                            _csetf_trie_multi(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($MULTI_KEYS)) {
                                                _csetf_trie_multi_keys(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($MULTI_KEY_FUNC)) {
                                                    _csetf_trie_multi_key_func(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt33$Invalid_slot__S_for_construction_, current_arg);
                                                }
                                            }
                                        }
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

    public static SubLObject make_trie(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.tries.$trie_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_trie_name(v_new, current_value);
            } else
                if (pcase_var.eql($TOP_NODE)) {
                    _csetf_trie_top_node(v_new, current_value);
                } else
                    if (pcase_var.eql($UNIQUE)) {
                        _csetf_trie_unique(v_new, current_value);
                    } else
                        if (pcase_var.eql($CASE_SENSITIVE)) {
                            _csetf_trie_case_sensitive(v_new, current_value);
                        } else
                            if (pcase_var.eql($ENTRY_TEST_FUNC)) {
                                _csetf_trie_entry_test_func(v_new, current_value);
                            } else
                                if (pcase_var.eql($MULTI)) {
                                    _csetf_trie_multi(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MULTI_KEYS)) {
                                        _csetf_trie_multi_keys(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($MULTI_KEY_FUNC)) {
                                            _csetf_trie_multi_key_func(v_new, current_value);
                                        } else {
                                            Errors.error($str34$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_trie(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TRIE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, trie_name(obj));
        funcall(visitor_fn, obj, $SLOT, $TOP_NODE, trie_top_node(obj));
        funcall(visitor_fn, obj, $SLOT, $UNIQUE, trie_unique(obj));
        funcall(visitor_fn, obj, $SLOT, $CASE_SENSITIVE, trie_case_sensitive(obj));
        funcall(visitor_fn, obj, $SLOT, $ENTRY_TEST_FUNC, trie_entry_test_func(obj));
        funcall(visitor_fn, obj, $SLOT, $MULTI, trie_multi(obj));
        funcall(visitor_fn, obj, $SLOT, $MULTI_KEYS, trie_multi_keys(obj));
        funcall(visitor_fn, obj, $SLOT, $MULTI_KEY_FUNC, trie_multi_key_func(obj));
        funcall(visitor_fn, obj, $END, MAKE_TRIE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_trie_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_trie(obj, visitor_fn);
    }

    public static final SubLObject print_trie_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject name = trie_name(v_object);
            format(stream, $str_alt34$__TRIE);
            if (NIL != name) {
                format(stream, $str_alt35$__A, name);
            } else {
                {
                    SubLObject unique = trie_unique(v_object);
                    SubLObject entry_test_func = trie_entry_test_func(v_object);
                    SubLObject case_sensitive = trie_case_sensitive(v_object);
                    SubLObject multiP = trie_multi(v_object);
                    if (NIL != unique) {
                        format(stream, $str_alt36$_UNIQUE);
                    }
                    format(stream, $str_alt35$__A, entry_test_func);
                    if (NIL != case_sensitive) {
                        format(stream, $str_alt37$_SENSITIVE);
                    } else {
                        format(stream, $str_alt38$_INSENSITIVE);
                    }
                    if (NIL != multiP) {
                        format(stream, $str_alt39$__S, trie_multi_keys(v_object));
                    }
                }
            }
            format(stream, $str_alt40$_);
        }
        return v_object;
    }

    public static SubLObject print_trie(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = trie_name(v_object);
        format(stream, $str40$__TRIE);
        if (NIL != name) {
            format(stream, $str41$__A, name);
        } else {
            final SubLObject unique = trie_unique(v_object);
            final SubLObject entry_test_func = trie_entry_test_func(v_object);
            final SubLObject case_sensitive = trie_case_sensitive(v_object);
            final SubLObject multiP = trie_multi(v_object);
            if (NIL != unique) {
                format(stream, $$$_UNIQUE);
            }
            format(stream, $str41$__A, entry_test_func);
            if (NIL != case_sensitive) {
                format(stream, $$$_SENSITIVE);
            } else {
                format(stream, $$$_INSENSITIVE);
            }
            if (NIL != multiP) {
                format(stream, $str45$__S, trie_multi_keys(v_object));
            }
        }
        format(stream, $str46$_);
        return v_object;
    }

    /**
     * Make a new TRIE in the static area
     */
    @LispMethod(comment = "Make a new TRIE in the static area")
    public static final SubLObject make_static_trie_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = NIL;
                {
                    SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
                    try {
                        Storage.$current_area$.bind(Storage.get_static_area(), thread);
                        v_object = make_trie(UNPROVIDED);
                    } finally {
                        Storage.$current_area$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_object;
            }
        }
    }

    /**
     * Make a new TRIE in the static area
     */
    @LispMethod(comment = "Make a new TRIE in the static area")
    public static SubLObject make_static_trie() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_object = NIL;
        final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
        try {
            Storage.$current_area$.bind(Storage.get_static_area(), thread);
            v_object = make_trie(UNPROVIDED);
        } finally {
            Storage.$current_area$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }

    /**
     * Initialize a TRIE for use
     */
    @LispMethod(comment = "Initialize a TRIE for use")
    public static final SubLObject init_trie_alt(SubLObject trie) {
        _csetf_trie_name(trie, NIL);
        _csetf_trie_top_node(trie, NIL);
        _csetf_trie_unique(trie, NIL);
        _csetf_trie_case_sensitive(trie, NIL);
        _csetf_trie_entry_test_func(trie, NIL);
        _csetf_trie_multi(trie, NIL);
        _csetf_trie_multi_keys(trie, NIL);
        _csetf_trie_multi_key_func(trie, NIL);
        return trie;
    }

    /**
     * Initialize a TRIE for use
     */
    @LispMethod(comment = "Initialize a TRIE for use")
    public static SubLObject init_trie(final SubLObject trie) {
        _csetf_trie_name(trie, NIL);
        _csetf_trie_top_node(trie, NIL);
        _csetf_trie_unique(trie, NIL);
        _csetf_trie_case_sensitive(trie, NIL);
        _csetf_trie_entry_test_func(trie, NIL);
        _csetf_trie_multi(trie, NIL);
        _csetf_trie_multi_keys(trie, NIL);
        _csetf_trie_multi_key_func(trie, NIL);
        return trie;
    }

    /**
     * Check if OBJECT is a TRIE that has been explicitly freed
     */
    @LispMethod(comment = "Check if OBJECT is a TRIE that has been explicitly freed")
    public static final SubLObject free_trie_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != trie_p(v_object)) && (trie_top_node(v_object) == $FREE));
    }

    /**
     * Check if OBJECT is a TRIE that has been explicitly freed
     */
    @LispMethod(comment = "Check if OBJECT is a TRIE that has been explicitly freed")
    public static SubLObject free_trie_p(final SubLObject v_object) {
        return makeBoolean((NIL != trie_p(v_object)) && (trie_top_node(v_object) == $FREE));
    }

    /**
     * Place a TRIE onto the free list
     */
    @LispMethod(comment = "Place a TRIE onto the free list")
    public static final SubLObject free_trie_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TRIE_P);
        if (NIL == free_trie_p(v_object)) {
            v_object = init_trie(v_object);
            _csetf_trie_top_node(v_object, $FREE);
            if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
                {
                    SubLObject lock = $trie_free_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        _csetf_trie_name(v_object, $trie_free_list$.getGlobalValue());
                        $trie_free_list$.setGlobalValue(v_object);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Place a TRIE onto the free list
     */
    @LispMethod(comment = "Place a TRIE onto the free list")
    public static SubLObject free_trie(SubLObject v_object) {
        assert NIL != trie_p(v_object) : "! tries.trie_p(v_object) " + "tries.trie_p error :" + v_object;
        if (NIL == free_trie_p(v_object)) {
            v_object = init_trie(v_object);
            _csetf_trie_top_node(v_object, $FREE);
            if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
                SubLObject release = NIL;
                try {
                    release = seize_lock($trie_free_lock$.getGlobalValue());
                    _csetf_trie_name(v_object, $trie_free_list$.getGlobalValue());
                    $trie_free_list$.setGlobalValue(v_object);
                } finally {
                    if (NIL != release) {
                        release_lock($trie_free_lock$.getGlobalValue());
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Get a TRIE from the free list, or make a new one if needed
     */
    @LispMethod(comment = "Get a TRIE from the free list, or make a new one if needed")
    public static final SubLObject get_trie_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $structure_resourcing_enabled$.getGlobalValue()) {
                if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                    return init_trie(make_static_trie());
                } else {
                    return init_trie(make_trie(UNPROVIDED));
                }
            }
            {
                SubLObject v_object = NIL;
                SubLObject found = NIL;
                SubLObject lock = $trie_free_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    v_object = $trie_free_list$.getGlobalValue();
                    for (; !((NIL != found) || (NIL == v_object));) {
                        if (NIL != free_trie_p(v_object)) {
                            $trie_free_list$.setGlobalValue(trie_name(v_object));
                            found = T;
                        } else {
                            v_object = trie_name(v_object);
                        }
                    }
                    if (NIL == found) {
                        if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                            v_object = make_static_trie();
                        } else {
                            v_object = make_trie(UNPROVIDED);
                        }
                        $trie_free_list$.setGlobalValue(NIL);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return init_trie(v_object);
            }
        }
    }

    /**
     * Get a TRIE from the free list, or make a new one if needed
     */
    @LispMethod(comment = "Get a TRIE from the free list, or make a new one if needed")
    public static SubLObject get_trie() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $structure_resourcing_enabled$.getGlobalValue()) {
            SubLObject v_object = NIL;
            SubLObject found = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock($trie_free_lock$.getGlobalValue());
                v_object = $trie_free_list$.getGlobalValue();
                while ((NIL == found) && (NIL != v_object)) {
                    if (NIL != free_trie_p(v_object)) {
                        $trie_free_list$.setGlobalValue(trie_name(v_object));
                        found = T;
                    } else {
                        v_object = trie_name(v_object);
                    }
                } 
                if (NIL == found) {
                    if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
                        v_object = make_static_trie();
                    } else {
                        v_object = make_trie(UNPROVIDED);
                    }
                    $trie_free_list$.setGlobalValue(NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock($trie_free_lock$.getGlobalValue());
                }
            }
            return init_trie(v_object);
        }
        if (NIL != $structure_resourcing_make_static$.getDynamicValue(thread)) {
            return init_trie(make_static_trie());
        }
        return init_trie(make_trie(UNPROVIDED));
    }

    public static final SubLObject trie_node_key_alt(SubLObject node) {
        {
            SubLObject car = node.first();
            return car.isAtom() ? ((SubLObject) (car)) : car.first();
        }
    }

    public static SubLObject trie_node_key(final SubLObject node) {
        final SubLObject car = node.first();
        return car.isAtom() ? car : car.first();
    }

    public static final SubLObject trie_node_data_alt(SubLObject node) {
        return node.rest();
    }

    public static SubLObject trie_node_data(final SubLObject node) {
        return node.rest();
    }

    public static final SubLObject trie_node_subnodes_alt(SubLObject node) {
        return node.rest();
    }

    public static SubLObject trie_node_subnodes(final SubLObject node) {
        return node.rest();
    }

    public static final SubLObject trie_leaf_node_p_alt(SubLObject node) {
        return eq(trie_node_key(node), $END);
    }

    public static SubLObject trie_leaf_node_p(final SubLObject node) {
        return eq(trie_node_key(node), $END);
    }

    public static final SubLObject new_trie_terminal_node_alt(SubLObject v_object, SubLObject uniqueP) {
        return NIL != uniqueP ? ((SubLObject) (cons($END, v_object))) : list($END, v_object);
    }

    public static SubLObject new_trie_terminal_node(final SubLObject v_object, final SubLObject uniqueP) {
        return NIL != uniqueP ? cons($END, v_object) : list($END, v_object);
    }

    public static final SubLObject new_trie_nonterminal_node_alt(SubLObject v_char, SubLObject case_sensitive) {
        return cons(NIL != case_sensitive ? ((SubLObject) (v_char)) : char_downcase(v_char), NIL);
    }

    public static SubLObject new_trie_nonterminal_node(final SubLObject v_char, final SubLObject case_sensitive) {
        return cons(NIL != case_sensitive ? v_char : char_downcase(v_char), NIL);
    }

    public static final SubLObject trie_key_E_alt(SubLObject key1, SubLObject key2, SubLObject case_sensitive) {
        return NIL != case_sensitive ? ((SubLObject) (charE(key1, key2))) : char_equal(key1, key2);
    }

    public static SubLObject trie_key_E(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return NIL != case_sensitive ? charE(key1, key2) : char_equal(key1, key2);
    }

    public static final SubLObject trie_key_L_alt(SubLObject key1, SubLObject key2, SubLObject case_sensitive) {
        return NIL != case_sensitive ? ((SubLObject) (charL(key1, key2))) : char_lessp(key1, key2);
    }

    public static SubLObject trie_key_L(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return NIL != case_sensitive ? charL(key1, key2) : char_lessp(key1, key2);
    }

    public static final SubLObject trie_key_LE_alt(SubLObject key1, SubLObject key2, SubLObject case_sensitive) {
        return NIL != case_sensitive ? ((SubLObject) (charLE(key1, key2))) : char_not_greaterp(key1, key2);
    }

    public static SubLObject trie_key_LE(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return NIL != case_sensitive ? charLE(key1, key2) : char_not_greaterp(key1, key2);
    }

    public static final SubLObject trie_key_G_alt(SubLObject key1, SubLObject key2, SubLObject case_sensitive) {
        return trie_key_L(key2, key1, case_sensitive);
    }

    public static SubLObject trie_key_G(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return trie_key_L(key2, key1, case_sensitive);
    }

    public static final SubLObject trie_key_GE_alt(SubLObject key1, SubLObject key2, SubLObject case_sensitive) {
        return trie_key_LE(key2, key1, case_sensitive);
    }

    public static SubLObject trie_key_GE(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive) {
        return trie_key_LE(key2, key1, case_sensitive);
    }

    public static final SubLObject add_trie_subnode_alt(SubLObject node, SubLObject subnode, SubLObject case_sensitive) {
        {
            SubLObject data = trie_node_subnodes(node);
            SubLObject subkey = trie_node_key(subnode);
            SubLObject back = NIL;
            SubLObject next = NIL;
            SubLObject key = NIL;
            for (back = node, next = data, key = trie_node_key(next.first()); !(((NIL == next) || (subkey == $END)) || ((key != $END) && (NIL == trie_key_L(key, subkey, case_sensitive)))); back = next , next = next.rest() , key = trie_node_key(next.first())) {
            }
            rplacd(back, cons(subnode, next));
        }
        return NIL;
    }

    public static SubLObject add_trie_subnode(final SubLObject node, final SubLObject subnode, final SubLObject case_sensitive) {
        final SubLObject data = trie_node_subnodes(node);
        final SubLObject subkey = trie_node_key(subnode);
        SubLObject back = NIL;
        SubLObject next = NIL;
        SubLObject key = NIL;
        back = node;
        for (next = data, key = trie_node_key(next.first()); ((NIL != next) && (subkey != $END)) && ((key == $END) || (NIL != trie_key_L(key, subkey, case_sensitive))); next = next.rest() , key = trie_node_key(next.first())) {
            back = next;
        }
        rplacd(back, cons(subnode, next));
        return NIL;
    }

    /**
     * Return a new TRIE datastructure
     */
    @LispMethod(comment = "Return a new TRIE datastructure")
    public static final SubLObject create_trie_alt(SubLObject unique, SubLObject name, SubLObject case_sensitive, SubLObject test) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (case_sensitive == UNPROVIDED) {
            case_sensitive = T;
        }
        if (test == UNPROVIDED) {
            test = EQL;
        }
        {
            SubLObject trie = get_trie();
            _csetf_trie_name(trie, name);
            _csetf_trie_top_node(trie, listS($TOP, NIL));
            _csetf_trie_unique(trie, unique);
            _csetf_trie_case_sensitive(trie, case_sensitive);
            _csetf_trie_entry_test_func(trie, test);
            _csetf_trie_multi(trie, NIL);
            return trie;
        }
    }

    /**
     * Return a new TRIE datastructure
     */
    @LispMethod(comment = "Return a new TRIE datastructure")
    public static SubLObject create_trie(final SubLObject unique, SubLObject name, SubLObject case_sensitive, SubLObject test) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (case_sensitive == UNPROVIDED) {
            case_sensitive = T;
        }
        if (test == UNPROVIDED) {
            test = EQL;
        }
        final SubLObject trie = get_trie();
        _csetf_trie_name(trie, name);
        _csetf_trie_top_node(trie, listS($TOP, NIL));
        _csetf_trie_unique(trie, unique);
        _csetf_trie_case_sensitive(trie, case_sensitive);
        _csetf_trie_entry_test_func(trie, test);
        _csetf_trie_multi(trie, NIL);
        return trie;
    }

    /**
     * Use STRINGS to seed a new trie. If SAVE-STRINGS, then the string
     * is used as the data in the trie instead of T.
     */
    @LispMethod(comment = "Use STRINGS to seed a new trie. If SAVE-STRINGS, then the string\r\nis used as the data in the trie instead of T.\nUse STRINGS to seed a new trie. If SAVE-STRINGS, then the string\nis used as the data in the trie instead of T.")
    public static final SubLObject trie_from_strings_alt(SubLObject strings, SubLObject unique, SubLObject case_sensitive, SubLObject test, SubLObject save_strings) {
        if (case_sensitive == UNPROVIDED) {
            case_sensitive = T;
        }
        if (test == UNPROVIDED) {
            test = NIL;
        }
        if (save_strings == UNPROVIDED) {
            save_strings = NIL;
        }
        if (NIL == test) {
            if (NIL != save_strings) {
                test = (NIL != case_sensitive) ? ((SubLObject) (EQUAL)) : EQUALP;
            } else {
                test = EQL;
            }
        }
        {
            SubLObject trie = create_trie(unique, NIL, case_sensitive, test);
            SubLObject cdolist_list_var = strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                trie_insert(trie, string, NIL != save_strings ? ((SubLObject) (string)) : T, UNPROVIDED, UNPROVIDED);
            }
            return trie;
        }
    }

    /**
     * Use STRINGS to seed a new trie. If SAVE-STRINGS, then the string
     * is used as the data in the trie instead of T.
     */
    @LispMethod(comment = "Use STRINGS to seed a new trie. If SAVE-STRINGS, then the string\r\nis used as the data in the trie instead of T.\nUse STRINGS to seed a new trie. If SAVE-STRINGS, then the string\nis used as the data in the trie instead of T.")
    public static SubLObject trie_from_strings(final SubLObject strings, final SubLObject unique, SubLObject case_sensitive, SubLObject test, SubLObject save_strings) {
        if (case_sensitive == UNPROVIDED) {
            case_sensitive = T;
        }
        if (test == UNPROVIDED) {
            test = NIL;
        }
        if (save_strings == UNPROVIDED) {
            save_strings = NIL;
        }
        if (NIL == test) {
            if (NIL != save_strings) {
                test = (NIL != case_sensitive) ? EQUAL : EQUALP;
            } else {
                test = EQL;
            }
        }
        final SubLObject trie = create_trie(unique, NIL, case_sensitive, test);
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            trie_insert(trie, string, NIL != save_strings ? string : T, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return trie;
    }

    /**
     * Clear TRIE as a side-effect and return it
     */
    @LispMethod(comment = "Clear TRIE as a side-effect and return it")
    public static final SubLObject clear_trie_alt(SubLObject trie) {
        SubLTrampolineFile.checkType(trie, TRIE_P);
        {
            SubLObject top_node = trie_top_node(trie);
            rplacd(top_node, NIL);
            if (NIL != trie_multi(trie)) {
                {
                    SubLObject top_node_marks = trie_node_marks(top_node);
                    SubLObject trie_marks = trie_multi_keys(trie);
                    {
                        SubLObject cdolist_list_var = top_node_marks;
                        SubLObject mark = NIL;
                        for (mark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mark = cdolist_list_var.first()) {
                            rem_trie_node_mark(top_node, mark);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = trie_marks;
                        SubLObject mark = NIL;
                        for (mark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mark = cdolist_list_var.first()) {
                            add_trie_node_mark(top_node, mark);
                        }
                    }
                }
            }
        }
        return trie;
    }

    /**
     * Clear TRIE as a side-effect and return it
     */
    @LispMethod(comment = "Clear TRIE as a side-effect and return it")
    public static SubLObject clear_trie(final SubLObject trie) {
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        final SubLObject top_node = trie_top_node(trie);
        rplacd(top_node, NIL);
        if (NIL != trie_multi(trie)) {
            final SubLObject top_node_marks = trie_node_marks(top_node);
            final SubLObject trie_marks = trie_multi_keys(trie);
            SubLObject cdolist_list_var = top_node_marks;
            SubLObject mark = NIL;
            mark = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                rem_trie_node_mark(top_node, mark);
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            } 
            cdolist_list_var = trie_marks;
            mark = NIL;
            mark = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                add_trie_node_mark(top_node, mark);
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            } 
        }
        return trie;
    }

    /**
     * Return T iff TRIE is empty
     */
    @LispMethod(comment = "Return T iff TRIE is empty")
    public static final SubLObject trie_emptyP_alt(SubLObject trie) {
        SubLTrampolineFile.checkType(trie, TRIE_P);
        return sublisp_null(trie_top_node(trie).rest());
    }

    /**
     * Return T iff TRIE is empty
     */
    @LispMethod(comment = "Return T iff TRIE is empty")
    public static SubLObject trie_emptyP(final SubLObject trie) {
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        return sublisp_null(trie_top_node(trie).rest());
    }

    /**
     * Return the number of data items stored in TRIE
     */
    @LispMethod(comment = "Return the number of data items stored in TRIE")
    public static final SubLObject trie_count_alt(SubLObject trie) {
        return trie_node_count(trie_top_node(trie), trie_unique(trie));
    }

    /**
     * Return the number of data items stored in TRIE
     */
    @LispMethod(comment = "Return the number of data items stored in TRIE")
    public static SubLObject trie_count(final SubLObject trie) {
        return trie_node_count(trie_top_node(trie), trie_unique(trie));
    }

    /**
     * Internal function for TRIE-COUNT
     */
    @LispMethod(comment = "Internal function for TRIE-COUNT")
    public static final SubLObject trie_node_count_alt(SubLObject node, SubLObject uniqueP) {
        {
            SubLObject total = ZERO_INTEGER;
            if (NIL != node) {
                if (NIL != trie_leaf_node_p(node)) {
                    if (NIL != uniqueP) {
                        total = add(total, ONE_INTEGER);
                    } else {
                        total = add(total, length(trie_node_data(node)));
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = trie_node_subnodes(node);
                        SubLObject subnode = NIL;
                        for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                            total = add(total, trie_node_count(subnode, uniqueP));
                        }
                    }
                }
            }
            return total;
        }
    }

    /**
     * Internal function for TRIE-COUNT
     */
    @LispMethod(comment = "Internal function for TRIE-COUNT")
    public static SubLObject trie_node_count(final SubLObject node, final SubLObject uniqueP) {
        SubLObject total = ZERO_INTEGER;
        if (NIL != node) {
            if (NIL != trie_leaf_node_p(node)) {
                if (NIL != uniqueP) {
                    total = add(total, ONE_INTEGER);
                } else {
                    total = add(total, length(trie_node_data(node)));
                }
            } else {
                SubLObject cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                subnode = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    total = add(total, trie_node_count(subnode, uniqueP));
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                } 
            }
        }
        return total;
    }

    /**
     * Show the contents of TRIE to STREAM
     */
    @LispMethod(comment = "Show the contents of TRIE to STREAM")
    public static final SubLObject show_trie_alt(SubLObject trie, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        terpri(stream);
        show_trie_node(trie_top_node(trie), stream, ZERO_INTEGER, NIL);
        return NIL;
    }

    /**
     * Show the contents of TRIE to STREAM
     */
    @LispMethod(comment = "Show the contents of TRIE to STREAM")
    public static SubLObject show_trie(final SubLObject trie, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        terpri(stream);
        show_trie_node(trie_top_node(trie), stream, ZERO_INTEGER, NIL);
        return NIL;
    }

    /**
     * Internal function for SHOW-TRIE
     */
    @LispMethod(comment = "Internal function for SHOW-TRIE")
    public static final SubLObject show_trie_node_alt(SubLObject node, SubLObject stream, SubLObject depth, SubLObject indent) {
        if (NIL != indent) {
            terpri(stream);
            string_utilities.indent(stream, depth);
        }
        {
            SubLObject key = trie_node_key(node);
            SubLObject marks = trie_node_marks(node);
            if (key.isChar()) {
                {
                    SubLObject subnodes = trie_node_subnodes(node);
                    if (NIL != subnodes) {
                        princ(key, UNPROVIDED);
                        if (NIL != marks) {
                            format(stream, $str_alt45$_m___S, marks);
                        }
                        show_trie_node(subnodes.first(), stream, add(depth, ONE_INTEGER), marks);
                        {
                            SubLObject cdolist_list_var = subnodes.rest();
                            SubLObject subnode = NIL;
                            for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                                show_trie_node(subnode, stream, add(depth, ONE_INTEGER), T);
                            }
                        }
                    }
                }
            } else {
                if (key == $END) {
                    format(stream, $str_alt46$_____S, trie_node_data(node));
                } else {
                    if (key == $TOP) {
                        if (NIL != marks) {
                            format(stream, $str_alt45$_m___S, marks);
                        }
                        {
                            SubLObject subnodes = trie_node_subnodes(node);
                            if (NIL != subnodes) {
                                show_trie_node(subnodes.first(), stream, ZERO_INTEGER, marks);
                                {
                                    SubLObject cdolist_list_var = subnodes.rest();
                                    SubLObject subnode = NIL;
                                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                                        show_trie_node(subnode, stream, ZERO_INTEGER, T);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Internal function for SHOW-TRIE
     */
    @LispMethod(comment = "Internal function for SHOW-TRIE")
    public static SubLObject show_trie_node(final SubLObject node, final SubLObject stream, final SubLObject depth, final SubLObject indent) {
        if (NIL != indent) {
            terpri(stream);
            string_utilities.indent(stream, depth);
        }
        final SubLObject key = trie_node_key(node);
        final SubLObject marks = trie_node_marks(node);
        if (key.isChar()) {
            final SubLObject subnodes = trie_node_subnodes(node);
            if (NIL != subnodes) {
                princ(key, UNPROVIDED);
                if (NIL != marks) {
                    format(stream, $str50$_m___S, marks);
                }
                show_trie_node(subnodes.first(), stream, add(depth, ONE_INTEGER), marks);
                SubLObject cdolist_list_var = subnodes.rest();
                SubLObject subnode = NIL;
                subnode = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    show_trie_node(subnode, stream, add(depth, ONE_INTEGER), T);
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                } 
            }
        } else
            if (key == $END) {
                format(stream, $str51$_____S, trie_node_data(node));
            } else
                if (key == $TOP) {
                    if (NIL != marks) {
                        format(stream, $str50$_m___S, marks);
                    }
                    final SubLObject subnodes = trie_node_subnodes(node);
                    if (NIL != subnodes) {
                        show_trie_node(subnodes.first(), stream, ZERO_INTEGER, marks);
                        SubLObject cdolist_list_var = subnodes.rest();
                        SubLObject subnode = NIL;
                        subnode = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            show_trie_node(subnode, stream, ZERO_INTEGER, T);
                            cdolist_list_var = cdolist_list_var.rest();
                            subnode = cdolist_list_var.first();
                        } 
                    }
                }


        return NIL;
    }

    /**
     * Add index to OBJECT via STRING in TRIE.
     * START and END delimit the relevant portion of STRING.
     */
    @LispMethod(comment = "Add index to OBJECT via STRING in TRIE.\r\nSTART and END delimit the relevant portion of STRING.\nAdd index to OBJECT via STRING in TRIE.\nSTART and END delimit the relevant portion of STRING.")
    public static final SubLObject trie_insert_alt(SubLObject trie, SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == UNPROVIDED) {
            v_object = string;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(trie, TRIE_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject unique = trie_unique(trie);
            SubLObject case_sensitive = trie_case_sensitive(trie);
            SubLObject test = trie_entry_test_func(trie);
            SubLObject max = (NIL != end) ? ((SubLObject) (end)) : length(string);
            SubLObject node = trie_top_node(trie);
            SubLObject existing_terminal = NIL;
            SubLObject ch = NIL;
            initialize_trie_ancestor_tracking(node);
            {
                SubLObject next_node = NIL;
                SubLObject index = NIL;
                for (next_node = NIL, index = start; !index.numE(max); next_node = NIL , index = add(index, ONE_INTEGER)) {
                    ch = Strings.sublisp_char(string, index);
                    if (NIL == next_node) {
                        {
                            SubLObject csome_list_var = trie_node_subnodes(node);
                            SubLObject subnode = NIL;
                            for (subnode = csome_list_var.first(); !((NIL != next_node) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subnode = csome_list_var.first()) {
                                {
                                    SubLObject subkey = trie_node_key(subnode);
                                    if (subkey.isChar() && (NIL != trie_key_E(ch, subkey, case_sensitive))) {
                                        next_node = subnode;
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != next_node) {
                        node = next_node;
                    } else {
                        {
                            SubLObject new_node = new_trie_nonterminal_node(ch, case_sensitive);
                            add_trie_subnode(node, new_node, case_sensitive);
                            node = new_node;
                        }
                    }
                    trie_ancestor_tracking_descend(node);
                }
                if (NIL == existing_terminal) {
                    {
                        SubLObject csome_list_var = trie_node_subnodes(node);
                        SubLObject subnode = NIL;
                        for (subnode = csome_list_var.first(); !((NIL != existing_terminal) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subnode = csome_list_var.first()) {
                            if (NIL != trie_leaf_node_p(subnode)) {
                                existing_terminal = subnode;
                            }
                        }
                    }
                }
                if (NIL != existing_terminal) {
                    trie_ancestor_tracking_descend(existing_terminal);
                    if (NIL != unique) {
                        if (NIL == funcall(test, v_object, trie_node_data(existing_terminal))) {
                            Errors.error($str_alt48$There_is_already_an_object__S_not, trie_node_data(existing_terminal), test, v_object);
                        }
                    } else {
                        {
                            SubLObject old_data = trie_node_data(existing_terminal);
                            if (NIL == subl_promotions.memberP(v_object, old_data, test, UNPROVIDED)) {
                                multi_trie_existing_insert_mark(trie, v_object);
                                {
                                    SubLObject new_data = cons(v_object, old_data);
                                    rplacd(existing_terminal, new_data);
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject new_terminal = new_trie_terminal_node(v_object, unique);
                        multi_trie_new_insert_mark(trie, v_object);
                        add_trie_subnode(node, new_terminal, case_sensitive);
                    }
                }
                finish_trie_ancestor_tracking();
                return trie;
            }
        }
    }

    /**
     * Add index to OBJECT via STRING in TRIE.
     * START and END delimit the relevant portion of STRING.
     */
    @LispMethod(comment = "Add index to OBJECT via STRING in TRIE.\r\nSTART and END delimit the relevant portion of STRING.\nAdd index to OBJECT via STRING in TRIE.\nSTART and END delimit the relevant portion of STRING.")
    public static SubLObject trie_insert(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == UNPROVIDED) {
            v_object = string;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject unique = trie_unique(trie);
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        final SubLObject test = trie_entry_test_func(trie);
        final SubLObject max = (NIL != end) ? end : length(string);
        SubLObject node = trie_top_node(trie);
        SubLObject existing_terminal = NIL;
        SubLObject ch = NIL;
        initialize_trie_ancestor_tracking(node);
        SubLObject next_node = NIL;
        SubLObject index = NIL;
        next_node = NIL;
        for (index = start; !index.numE(max); index = add(index, ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, index);
            if (NIL == next_node) {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                subnode = csome_list_var.first();
                while ((NIL == next_node) && (NIL != csome_list_var)) {
                    final SubLObject subkey = trie_node_key(subnode);
                    if (subkey.isChar() && (NIL != trie_key_E(ch, subkey, case_sensitive))) {
                        next_node = subnode;
                    }
                    csome_list_var = csome_list_var.rest();
                    subnode = csome_list_var.first();
                } 
            }
            if (NIL != next_node) {
                node = next_node;
            } else {
                final SubLObject new_node = new_trie_nonterminal_node(ch, case_sensitive);
                add_trie_subnode(node, new_node, case_sensitive);
                node = new_node;
            }
            trie_ancestor_tracking_descend(node);
            next_node = NIL;
        }
        if (NIL == existing_terminal) {
            SubLObject csome_list_var = trie_node_subnodes(node);
            SubLObject subnode = NIL;
            subnode = csome_list_var.first();
            while ((NIL == existing_terminal) && (NIL != csome_list_var)) {
                if (NIL != trie_leaf_node_p(subnode)) {
                    existing_terminal = subnode;
                }
                csome_list_var = csome_list_var.rest();
                subnode = csome_list_var.first();
            } 
        }
        if (NIL != existing_terminal) {
            trie_ancestor_tracking_descend(existing_terminal);
            if (NIL != unique) {
                if (NIL == funcall(test, v_object, trie_node_data(existing_terminal))) {
                    Errors.error($str53$There_is_already_an_object__S_not, trie_node_data(existing_terminal), test, v_object);
                }
            } else {
                final SubLObject old_data = trie_node_data(existing_terminal);
                if (NIL == subl_promotions.memberP(v_object, old_data, test, UNPROVIDED)) {
                    multi_trie_existing_insert_mark(trie, v_object);
                    final SubLObject new_data = cons(v_object, old_data);
                    rplacd(existing_terminal, new_data);
                }
            }
        } else {
            final SubLObject new_terminal = new_trie_terminal_node(v_object, unique);
            multi_trie_new_insert_mark(trie, v_object);
            add_trie_subnode(node, new_terminal, case_sensitive);
        }
        finish_trie_ancestor_tracking();
        return trie;
    }

    /**
     * Remove index to OBJECT via STRING in TRIE.
     * START and END delimit the relevant portion of STRING.
     */
    @LispMethod(comment = "Remove index to OBJECT via STRING in TRIE.\r\nSTART and END delimit the relevant portion of STRING.\nRemove index to OBJECT via STRING in TRIE.\nSTART and END delimit the relevant portion of STRING.")
    public static final SubLObject trie_remove_alt(SubLObject trie, SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == UNPROVIDED) {
            v_object = string;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(trie, TRIE_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject unique = trie_unique(trie);
            SubLObject case_sensitive = trie_case_sensitive(trie);
            SubLObject test = trie_entry_test_func(trie);
            SubLObject max = (NIL != end) ? ((SubLObject) (end)) : length(string);
            SubLObject node = trie_top_node(trie);
            SubLObject last_branching_node = NIL;
            SubLObject end_node = NIL;
            SubLObject last_branch = NIL;
            SubLObject ch = NIL;
            initialize_trie_ancestor_tracking(node);
            {
                SubLObject next_node = NIL;
                SubLObject index = NIL;
                for (next_node = NIL, index = start; !index.numE(max); next_node = NIL , index = add(index, ONE_INTEGER)) {
                    ch = Strings.sublisp_char(string, index);
                    if (NIL == next_node) {
                        {
                            SubLObject csome_list_var = trie_node_subnodes(node);
                            SubLObject subnode = NIL;
                            for (subnode = csome_list_var.first(); !((NIL != next_node) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subnode = csome_list_var.first()) {
                                {
                                    SubLObject subkey = trie_node_key(subnode);
                                    if (subkey.isChar() && (NIL != trie_key_E(ch, subkey, case_sensitive))) {
                                        next_node = subnode;
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != next_node) {
                        if (NIL != trie_node_subnodes(node).rest()) {
                            last_branching_node = node;
                            last_branch = next_node;
                        }
                        node = next_node;
                    } else {
                        finish_trie_ancestor_tracking();
                        return trie;
                    }
                    trie_ancestor_tracking_descend(node);
                }
                if (NIL == end_node) {
                    {
                        SubLObject csome_list_var = trie_node_subnodes(node);
                        SubLObject subnode = NIL;
                        for (subnode = csome_list_var.first(); !((NIL != end_node) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subnode = csome_list_var.first()) {
                            if (NIL != trie_leaf_node_p(subnode)) {
                                trie_ancestor_tracking_descend(subnode);
                                end_node = subnode;
                            }
                        }
                    }
                }
                if (NIL == end_node) {
                    finish_trie_ancestor_tracking();
                    return trie;
                }
                if (NIL != unique) {
                    if (NIL == funcall(test, v_object, trie_node_data(end_node))) {
                        Errors.cerror($$$Remove_it_anyway, $str_alt50$The_object_found_in_trie_for__S_i, string, trie_node_data(end_node));
                    }
                } else {
                    {
                        SubLObject old_data = trie_node_data(end_node);
                        SubLObject new_data = delete(v_object, old_data, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (old_data != new_data) {
                            rplacd(end_node, new_data);
                        }
                        if (NIL != new_data) {
                            multi_trie_remove_mark(trie, v_object);
                            finish_trie_ancestor_tracking();
                            return trie;
                        }
                    }
                }
                multi_trie_remove_mark(trie, v_object);
                if (NIL != trie_node_subnodes(node).rest()) {
                    rplacd(node, delete(end_node, trie_node_subnodes(node), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } else {
                    if ((NIL != last_branch) && (NIL != last_branching_node)) {
                        last_branching_node = delete(last_branch, last_branching_node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        clear_trie(trie);
                    }
                }
                finish_trie_ancestor_tracking();
                return trie;
            }
        }
    }

    @LispMethod(comment = "Remove index to OBJECT via STRING in TRIE.\r\nSTART and END delimit the relevant portion of STRING.\nRemove index to OBJECT via STRING in TRIE.\nSTART and END delimit the relevant portion of STRING.")
    public static SubLObject trie_remove(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == UNPROVIDED) {
            v_object = string;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject unique = trie_unique(trie);
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        final SubLObject test = trie_entry_test_func(trie);
        final SubLObject max = (NIL != end) ? end : length(string);
        SubLObject node = trie_top_node(trie);
        SubLObject last_branching_node = NIL;
        SubLObject end_node = NIL;
        SubLObject last_branch = NIL;
        SubLObject ch = NIL;
        initialize_trie_ancestor_tracking(node);
        SubLObject next_node = NIL;
        SubLObject index = NIL;
        next_node = NIL;
        for (index = start; !index.numE(max); index = add(index, ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, index);
            if (NIL == next_node) {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                subnode = csome_list_var.first();
                while ((NIL == next_node) && (NIL != csome_list_var)) {
                    final SubLObject subkey = trie_node_key(subnode);
                    if (subkey.isChar() && (NIL != trie_key_E(ch, subkey, case_sensitive))) {
                        next_node = subnode;
                    }
                    csome_list_var = csome_list_var.rest();
                    subnode = csome_list_var.first();
                } 
            }
            if (NIL == next_node) {
                finish_trie_ancestor_tracking();
                return trie;
            }
            if (NIL != trie_node_subnodes(node).rest()) {
                last_branching_node = node;
                last_branch = next_node;
            }
            node = next_node;
            trie_ancestor_tracking_descend(node);
            next_node = NIL;
        }
        if (NIL == end_node) {
            SubLObject csome_list_var = trie_node_subnodes(node);
            SubLObject subnode = NIL;
            subnode = csome_list_var.first();
            while ((NIL == end_node) && (NIL != csome_list_var)) {
                if (NIL != trie_leaf_node_p(subnode)) {
                    trie_ancestor_tracking_descend(subnode);
                    end_node = subnode;
                }
                csome_list_var = csome_list_var.rest();
                subnode = csome_list_var.first();
            } 
        }
        if (NIL == end_node) {
            finish_trie_ancestor_tracking();
            return trie;
        }
        if (NIL != unique) {
            if (NIL == funcall(test, v_object, trie_node_data(end_node))) {
                Errors.cerror($$$Remove_it_anyway, $str55$The_object_found_in_trie_for__S_i, string, trie_node_data(end_node), v_object);
            }
        } else {
            final SubLObject old_data = trie_node_data(end_node);
            final SubLObject new_data = delete(v_object, old_data, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!old_data.eql(new_data)) {
                rplacd(end_node, new_data);
            }
            if (NIL != new_data) {
                multi_trie_remove_mark(trie, v_object);
                finish_trie_ancestor_tracking();
                return trie;
            }
        }
        multi_trie_remove_mark(trie, v_object);
        if (NIL != trie_node_subnodes(node).rest()) {
            rplacd(node, delete(end_node, trie_node_subnodes(node), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else
            if ((NIL != last_branch) && (NIL != last_branching_node)) {
                last_branching_node = delete(last_branch, last_branching_node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                clear_trie(trie);
            }

        finish_trie_ancestor_tracking();
        return trie;
    }

    /**
     * Remove all objects indexed via a prefix of STRING in TRIE.
     * START and END delimit the relevant portion of STRING.
     */
    @LispMethod(comment = "Remove all objects indexed via a prefix of STRING in TRIE.\r\nSTART and END delimit the relevant portion of STRING.\nRemove all objects indexed via a prefix of STRING in TRIE.\nSTART and END delimit the relevant portion of STRING.")
    public static final SubLObject trie_remove_all_alt(SubLObject trie, SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(trie, TRIE_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject case_sensitive = trie_case_sensitive(trie);
            SubLObject max = (NIL != end) ? ((SubLObject) (end)) : length(string);
            SubLObject node = trie_top_node(trie);
            SubLObject last_branching_node = NIL;
            SubLObject last_branch = NIL;
            SubLObject ch = NIL;
            SubLObject total = ZERO_INTEGER;
            initialize_trie_ancestor_tracking(node);
            {
                SubLObject next_node = NIL;
                SubLObject index = NIL;
                for (next_node = NIL, index = start; !index.numE(max); next_node = NIL , index = add(index, ONE_INTEGER)) {
                    ch = Strings.sublisp_char(string, index);
                    if (NIL == next_node) {
                        {
                            SubLObject csome_list_var = trie_node_subnodes(node);
                            SubLObject subnode = NIL;
                            for (subnode = csome_list_var.first(); !((NIL != next_node) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subnode = csome_list_var.first()) {
                                {
                                    SubLObject subkey = trie_node_key(subnode);
                                    if (subkey.isChar() && (NIL != trie_key_E(ch, subkey, case_sensitive))) {
                                        next_node = subnode;
                                    }
                                }
                            }
                        }
                    }
                    if (NIL != next_node) {
                        if (NIL != trie_node_subnodes(node).rest()) {
                            last_branching_node = node;
                            last_branch = next_node;
                        }
                        node = next_node;
                    } else {
                        finish_trie_ancestor_tracking();
                        return total;
                    }
                    trie_ancestor_tracking_descend(node);
                }
                if ((NIL != last_branch) && (NIL != last_branching_node)) {
                    total = trie_node_count(node, trie_unique(trie));
                    multi_trie_remove_all_mark(trie);
                    last_branching_node = delete(last_branch, last_branching_node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    total = trie_count(trie);
                    clear_trie(trie);
                }
                finish_trie_ancestor_tracking();
                return total;
            }
        }
    }

    @LispMethod(comment = "Remove all objects indexed via a prefix of STRING in TRIE.\r\nSTART and END delimit the relevant portion of STRING.\nRemove all objects indexed via a prefix of STRING in TRIE.\nSTART and END delimit the relevant portion of STRING.")
    public static SubLObject trie_remove_all(final SubLObject trie, final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        final SubLObject max = (NIL != end) ? end : length(string);
        SubLObject node = trie_top_node(trie);
        SubLObject last_branching_node = NIL;
        SubLObject last_branch = NIL;
        SubLObject ch = NIL;
        SubLObject total = ZERO_INTEGER;
        initialize_trie_ancestor_tracking(node);
        SubLObject next_node = NIL;
        SubLObject index = NIL;
        next_node = NIL;
        for (index = start; !index.numE(max); index = add(index, ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, index);
            if (NIL == next_node) {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                subnode = csome_list_var.first();
                while ((NIL == next_node) && (NIL != csome_list_var)) {
                    final SubLObject subkey = trie_node_key(subnode);
                    if (subkey.isChar() && (NIL != trie_key_E(ch, subkey, case_sensitive))) {
                        next_node = subnode;
                    }
                    csome_list_var = csome_list_var.rest();
                    subnode = csome_list_var.first();
                } 
            }
            if (NIL == next_node) {
                finish_trie_ancestor_tracking();
                return total;
            }
            if (NIL != trie_node_subnodes(node).rest()) {
                last_branching_node = node;
                last_branch = next_node;
            }
            node = next_node;
            trie_ancestor_tracking_descend(node);
            next_node = NIL;
        }
        if ((NIL != last_branch) && (NIL != last_branching_node)) {
            total = trie_node_count(node, trie_unique(trie));
            multi_trie_remove_all_mark(trie);
            last_branching_node = delete(last_branch, last_branching_node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            total = trie_count(trie);
            clear_trie(trie);
        }
        finish_trie_ancestor_tracking();
        return total;
    }

    /**
     * Return the unique object indexed by STRING in TRIE.
     * If CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.
     * START and END determine the relevant portion of STRING.
     */
    @LispMethod(comment = "Return the unique object indexed by STRING in TRIE.\r\nIf CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.\r\nSTART and END determine the relevant portion of STRING.\nReturn the unique object indexed by STRING in TRIE.\nIf CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.\nSTART and END determine the relevant portion of STRING.")
    public static final SubLObject trie_exact_alt(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(trie, TRIE_P);
            SubLTrampolineFile.checkType(string, STRINGP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == trie_unique(trie)) {
                    Errors.error($str_alt51$TRIE__S_does_not_have_unique_entr, trie);
                }
            }
            case_sensitiveP = makeBoolean((NIL != case_sensitiveP) && (NIL != trie_case_sensitive(trie)));
            {
                SubLObject node = trie_top_node(trie);
                SubLObject v_char = NIL;
                SubLObject v_answer = NIL;
                SubLObject stop = (NIL != end) ? ((SubLObject) (end)) : length(string);
                initialize_trie_ancestor_tracking(node);
                {
                    SubLObject i = NIL;
                    SubLObject next_node = NIL;
                    for (i = start, next_node = NIL; !(i.numE(stop) || (i.numG(ZERO_INTEGER) && (NIL == node))); i = add(i, ONE_INTEGER) , next_node = NIL) {
                        v_char = Strings.sublisp_char(string, i);
                        if (NIL == next_node) {
                            {
                                SubLObject csome_list_var = trie_node_subnodes(node);
                                SubLObject subnode = NIL;
                                for (subnode = csome_list_var.first(); !((NIL != next_node) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subnode = csome_list_var.first()) {
                                    {
                                        SubLObject subkey = trie_node_key(subnode);
                                        if (subkey.isChar() && (NIL != trie_key_E(v_char, subkey, case_sensitiveP))) {
                                            next_node = subnode;
                                        }
                                    }
                                }
                            }
                        }
                        node = next_node;
                        trie_ancestor_tracking_descend(node);
                    }
                    if (NIL != node) {
                        if (NIL == v_answer) {
                            {
                                SubLObject csome_list_var = trie_node_subnodes(node);
                                SubLObject subnode = NIL;
                                for (subnode = csome_list_var.first(); !((NIL != v_answer) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subnode = csome_list_var.first()) {
                                    if (NIL != trie_leaf_node_p(subnode)) {
                                        trie_ancestor_tracking_descend(subnode);
                                        if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                            {
                                                SubLObject v_object = trie_node_data(subnode);
                                                if (NIL != trie_relevant_object(trie, v_object)) {
                                                    v_answer = v_object;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                finish_trie_ancestor_tracking();
                return v_answer;
            }
        }
    }

    @LispMethod(comment = "Return the unique object indexed by STRING in TRIE.\r\nIf CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.\r\nSTART and END determine the relevant portion of STRING.\nReturn the unique object indexed by STRING in TRIE.\nIf CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.\nSTART and END determine the relevant portion of STRING.")
    public static SubLObject trie_exact(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == trie_unique(trie))) {
            Errors.error($str56$TRIE__S_does_not_have_unique_entr, trie);
        }
        case_sensitiveP = makeBoolean((NIL != case_sensitiveP) && (NIL != trie_case_sensitive(trie)));
        SubLObject node = trie_top_node(trie);
        SubLObject v_char = NIL;
        SubLObject v_answer = NIL;
        final SubLObject stop = (NIL != end) ? end : length(string);
        initialize_trie_ancestor_tracking(node);
        SubLObject i = NIL;
        SubLObject next_node = NIL;
        i = start;
        next_node = NIL;
        while ((!i.numE(stop)) && ((!i.numG(ZERO_INTEGER)) || (NIL != node))) {
            v_char = Strings.sublisp_char(string, i);
            if (NIL == next_node) {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                subnode = csome_list_var.first();
                while ((NIL == next_node) && (NIL != csome_list_var)) {
                    final SubLObject subkey = trie_node_key(subnode);
                    if (subkey.isChar() && (NIL != trie_key_E(v_char, subkey, case_sensitiveP))) {
                        next_node = subnode;
                    }
                    csome_list_var = csome_list_var.rest();
                    subnode = csome_list_var.first();
                } 
            }
            node = next_node;
            trie_ancestor_tracking_descend(node);
            i = add(i, ONE_INTEGER);
            next_node = NIL;
        } 
        if ((NIL != node) && (NIL == v_answer)) {
            SubLObject csome_list_var = trie_node_subnodes(node);
            SubLObject subnode = NIL;
            subnode = csome_list_var.first();
            while ((NIL == v_answer) && (NIL != csome_list_var)) {
                if (NIL != trie_leaf_node_p(subnode)) {
                    trie_ancestor_tracking_descend(subnode);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        final SubLObject v_object = trie_node_data(subnode);
                        if (NIL != trie_relevant_object(trie, v_object)) {
                            v_answer = v_object;
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                subnode = csome_list_var.first();
            } 
        }
        finish_trie_ancestor_tracking();
        return v_answer;
    }

    /**
     * Return a list of all objects indexed in TRIE where STRING is a prefix of the index.
     * If CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.
     * IF EXACT-LENGTH? is non-null, then the index must match STRING exactly.
     * START and END determine the relevant portion of STRING.
     */
    @LispMethod(comment = "Return a list of all objects indexed in TRIE where STRING is a prefix of the index.\r\nIf CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.\r\nIF EXACT-LENGTH? is non-null, then the index must match STRING exactly.\r\nSTART and END determine the relevant portion of STRING.\nReturn a list of all objects indexed in TRIE where STRING is a prefix of the index.\nIf CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.\nIF EXACT-LENGTH? is non-null, then the index must match STRING exactly.\nSTART and END determine the relevant portion of STRING.")
    public static final SubLObject trie_prefix_alt(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (exact_lengthP == UNPROVIDED) {
            exact_lengthP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if ((NIL != case_sensitiveP) || (NIL == trie_case_sensitive(trie))) {
            return trie_prefix_iterative(trie, string, exact_lengthP, start, end);
        } else {
            return trie_prefix_recursive(trie, string, exact_lengthP, start, end);
        }
    }

    @LispMethod(comment = "Return a list of all objects indexed in TRIE where STRING is a prefix of the index.\r\nIf CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.\r\nIF EXACT-LENGTH? is non-null, then the index must match STRING exactly.\r\nSTART and END determine the relevant portion of STRING.\nReturn a list of all objects indexed in TRIE where STRING is a prefix of the index.\nIf CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.\nIF EXACT-LENGTH? is non-null, then the index must match STRING exactly.\nSTART and END determine the relevant portion of STRING.")
    public static SubLObject trie_prefix(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (exact_lengthP == UNPROVIDED) {
            exact_lengthP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if ((NIL != case_sensitiveP) || (NIL == trie_case_sensitive(trie))) {
            return trie_prefix_iterative(trie, string, exact_lengthP, start, end);
        }
        return trie_prefix_recursive(trie, string, exact_lengthP, start, end);
    }

    /**
     * Internal to TRIE-PREFIX
     */
    @LispMethod(comment = "Internal to TRIE-PREFIX")
    public static final SubLObject trie_prefix_iterative_alt(SubLObject trie, SubLObject string, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(trie, TRIE_P);
            SubLTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $trie_objects$.currentBinding(thread);
                    try {
                        $trie_objects$.bind(NIL, thread);
                        {
                            SubLObject case_sensitive = trie_case_sensitive(trie);
                            SubLObject stop = (NIL != end) ? ((SubLObject) (end)) : length(string);
                            SubLObject v_char = NIL;
                            SubLObject terminal = NIL;
                            SubLObject uniqueP = trie_unique(trie);
                            SubLObject node = trie_top_node(trie);
                            initialize_trie_ancestor_tracking(node);
                            {
                                SubLObject i = NIL;
                                SubLObject next_node = NIL;
                                for (i = start, next_node = NIL; !(i.numE(stop) || (i.numG(ZERO_INTEGER) && (NIL == node))); i = add(i, ONE_INTEGER) , next_node = NIL) {
                                    v_char = Strings.sublisp_char(string, i);
                                    if (NIL == next_node) {
                                        {
                                            SubLObject csome_list_var = trie_node_subnodes(node);
                                            SubLObject subnode = NIL;
                                            for (subnode = csome_list_var.first(); !((NIL != next_node) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subnode = csome_list_var.first()) {
                                                {
                                                    SubLObject subkey = trie_node_key(subnode);
                                                    if (subkey.isChar() && (NIL != trie_key_E(v_char, subkey, case_sensitive))) {
                                                        next_node = subnode;
                                                    }
                                                }
                                                node = next_node;
                                                trie_ancestor_tracking_descend(node);
                                            }
                                        }
                                    }
                                }
                                if (NIL != node) {
                                    if (NIL != exact_lengthP) {
                                        if (NIL == terminal) {
                                            {
                                                SubLObject csome_list_var = trie_node_subnodes(node);
                                                SubLObject subnode = NIL;
                                                for (subnode = csome_list_var.first(); !((NIL != terminal) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , subnode = csome_list_var.first()) {
                                                    if (NIL != trie_leaf_node_p(subnode)) {
                                                        terminal = subnode;
                                                        trie_ancestor_tracking_descend(subnode);
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL != terminal) {
                                            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                                {
                                                    SubLObject v_object = trie_node_data(terminal);
                                                    if (NIL != uniqueP) {
                                                        if (NIL != trie_relevant_object(trie, v_object)) {
                                                            $trie_objects$.setDynamicValue(list(v_object), thread);
                                                        }
                                                    } else {
                                                        $trie_objects$.setDynamicValue(trie_relevant_objects(trie, v_object), thread);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        all_trie_objects_under_node(trie, node, uniqueP);
                                    }
                                }
                            }
                            ans = $trie_objects$.getDynamicValue(thread);
                        }
                    } finally {
                        $trie_objects$.rebind(_prev_bind_0, thread);
                    }
                }
                finish_trie_ancestor_tracking();
                return nreverse(ans);
            }
        }
    }

    /**
     * Internal to TRIE-PREFIX
     */
    @LispMethod(comment = "Internal to TRIE-PREFIX")
    public static SubLObject trie_prefix_iterative(final SubLObject trie, final SubLObject string, final SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $trie_objects$.currentBinding(thread);
        try {
            $trie_objects$.bind(NIL, thread);
            final SubLObject case_sensitive = trie_case_sensitive(trie);
            final SubLObject stop = (NIL != end) ? end : length(string);
            SubLObject v_char = NIL;
            SubLObject terminal = NIL;
            final SubLObject uniqueP = trie_unique(trie);
            SubLObject node = trie_top_node(trie);
            initialize_trie_ancestor_tracking(node);
            SubLObject i = NIL;
            SubLObject next_node = NIL;
            i = start;
            next_node = NIL;
            while ((!i.numE(stop)) && ((!i.numG(ZERO_INTEGER)) || (NIL != node))) {
                v_char = Strings.sublisp_char(string, i);
                if (NIL == next_node) {
                    SubLObject csome_list_var = trie_node_subnodes(node);
                    SubLObject subnode = NIL;
                    subnode = csome_list_var.first();
                    while ((NIL == next_node) && (NIL != csome_list_var)) {
                        final SubLObject subkey = trie_node_key(subnode);
                        if (subkey.isChar() && (NIL != trie_key_E(v_char, subkey, case_sensitive))) {
                            next_node = subnode;
                        }
                        node = next_node;
                        trie_ancestor_tracking_descend(node);
                        csome_list_var = csome_list_var.rest();
                        subnode = csome_list_var.first();
                    } 
                }
                i = add(i, ONE_INTEGER);
                next_node = NIL;
            } 
            if (NIL != node) {
                if (NIL != exact_lengthP) {
                    if (NIL == terminal) {
                        SubLObject csome_list_var = trie_node_subnodes(node);
                        SubLObject subnode = NIL;
                        subnode = csome_list_var.first();
                        while ((NIL == terminal) && (NIL != csome_list_var)) {
                            if (NIL != trie_leaf_node_p(subnode)) {
                                terminal = subnode;
                                trie_ancestor_tracking_descend(subnode);
                            }
                            csome_list_var = csome_list_var.rest();
                            subnode = csome_list_var.first();
                        } 
                    }
                    if ((NIL != terminal) && (NIL != trie_relevant_ancestor_pathP(trie))) {
                        final SubLObject v_object = trie_node_data(terminal);
                        if (NIL != uniqueP) {
                            if (NIL != trie_relevant_object(trie, v_object)) {
                                $trie_objects$.setDynamicValue(list(v_object), thread);
                            }
                        } else {
                            $trie_objects$.setDynamicValue(trie_relevant_objects(trie, v_object), thread);
                        }
                    }
                } else {
                    all_trie_objects_under_node(trie, node, uniqueP);
                }
            }
            ans = $trie_objects$.getDynamicValue(thread);
        } finally {
            $trie_objects$.rebind(_prev_bind_0, thread);
        }
        finish_trie_ancestor_tracking();
        return nreverse(ans);
    }

    /**
     * Internal to TRIE-PREFIX
     */
    @LispMethod(comment = "Internal to TRIE-PREFIX")
    public static final SubLObject trie_prefix_recursive_alt(SubLObject trie, SubLObject string, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(trie, TRIE_P);
            SubLTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $trie_objects$.currentBinding(thread);
                    try {
                        $trie_objects$.bind(NIL, thread);
                        {
                            SubLObject top_node = trie_top_node(trie);
                            initialize_trie_ancestor_tracking(top_node);
                            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                {
                                    SubLObject cdolist_list_var = trie_node_subnodes(top_node);
                                    SubLObject subnode = NIL;
                                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                                        trie_ancestor_tracking_descend(subnode);
                                        if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                            trie_prefix_recursive_int(trie, subnode, string, start, NIL != end ? ((SubLObject) (end)) : length(string), exact_lengthP, trie_unique(trie));
                                        }
                                        trie_ancestor_tracking_ascend();
                                    }
                                }
                            }
                            ans = $trie_objects$.getDynamicValue(thread);
                            finish_trie_ancestor_tracking();
                        }
                    } finally {
                        $trie_objects$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(ans);
            }
        }
    }

    @LispMethod(comment = "Internal to TRIE-PREFIX")
    public static SubLObject trie_prefix_recursive(final SubLObject trie, final SubLObject string, final SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $trie_objects$.currentBinding(thread);
        try {
            $trie_objects$.bind(NIL, thread);
            final SubLObject top_node = trie_top_node(trie);
            initialize_trie_ancestor_tracking(top_node);
            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                SubLObject cdolist_list_var = trie_node_subnodes(top_node);
                SubLObject subnode = NIL;
                subnode = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(subnode);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        trie_prefix_recursive_int(trie, subnode, string, start, NIL != end ? end : length(string), exact_lengthP, trie_unique(trie));
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                } 
            }
            ans = $trie_objects$.getDynamicValue(thread);
            finish_trie_ancestor_tracking();
        } finally {
            $trie_objects$.rebind(_prev_bind_0, thread);
        }
        return nreverse(ans);
    }/**
     * Internal to TRIE-PREFIX
     */


    /**
     * Internal to TRIE-PREFIX-RECURSIVE
     */
    @LispMethod(comment = "Internal to TRIE-PREFIX-RECURSIVE")
    public static final SubLObject trie_prefix_recursive_int_alt(SubLObject trie, SubLObject node, SubLObject string, SubLObject index, SubLObject stop, SubLObject exact_lengthP, SubLObject uniqueP) {
        if (index.numE(stop)) {
            if (NIL != exact_lengthP) {
                if (NIL != trie_leaf_node_p(node)) {
                    all_trie_objects_in_leaf_node(trie, node, uniqueP);
                }
            } else {
                all_trie_objects_under_node(trie, node, uniqueP);
            }
        } else {
            {
                SubLObject key = trie_node_key(node);
                if (key.isChar() && (NIL != char_equal(Strings.sublisp_char(string, index), key))) {
                    {
                        SubLObject cdolist_list_var = trie_node_subnodes(node);
                        SubLObject subnode = NIL;
                        for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                            trie_ancestor_tracking_descend(subnode);
                            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                trie_prefix_recursive_int(trie, subnode, string, add(index, ONE_INTEGER), stop, exact_lengthP, uniqueP);
                            }
                            trie_ancestor_tracking_ascend();
                        }
                    }
                } else {
                    return NIL;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Internal to TRIE-PREFIX-RECURSIVE")
    public static SubLObject trie_prefix_recursive_int(final SubLObject trie, final SubLObject node, final SubLObject string, final SubLObject index, final SubLObject stop, final SubLObject exact_lengthP, final SubLObject uniqueP) {
        if (index.numE(stop)) {
            if (NIL != exact_lengthP) {
                if (NIL != trie_leaf_node_p(node)) {
                    all_trie_objects_in_leaf_node(trie, node, uniqueP);
                }
            } else {
                all_trie_objects_under_node(trie, node, uniqueP);
            }
        } else {
            final SubLObject key = trie_node_key(node);
            if ((!key.isChar()) || (NIL == char_equal(Strings.sublisp_char(string, index), key))) {
                return NIL;
            }
            SubLObject cdolist_list_var = trie_node_subnodes(node);
            SubLObject subnode = NIL;
            subnode = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                trie_ancestor_tracking_descend(subnode);
                if (NIL != trie_relevant_ancestor_pathP(trie)) {
                    trie_prefix_recursive_int(trie, subnode, string, add(index, ONE_INTEGER), stop, exact_lengthP, uniqueP);
                }
                trie_ancestor_tracking_ascend();
                cdolist_list_var = cdolist_list_var.rest();
                subnode = cdolist_list_var.first();
            } 
        }
        return NIL;
    }/**
     * Internal to TRIE-PREFIX-RECURSIVE
     */


    public static final SubLObject all_trie_objects_under_node_alt(SubLObject trie, SubLObject node, SubLObject uniqueP) {
        if (NIL != node) {
            if (NIL != trie_leaf_node_p(node)) {
                all_trie_objects_in_leaf_node(trie, node, uniqueP);
            } else {
                {
                    SubLObject cdolist_list_var = trie_node_subnodes(node);
                    SubLObject subnode = NIL;
                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                        trie_ancestor_tracking_descend(subnode);
                        if (NIL != trie_relevant_ancestor_pathP(trie)) {
                            all_trie_objects_under_node(trie, subnode, uniqueP);
                        }
                        trie_ancestor_tracking_ascend();
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject all_trie_objects_under_node(final SubLObject trie, final SubLObject node, final SubLObject uniqueP) {
        if (NIL != node) {
            if (NIL != trie_leaf_node_p(node)) {
                all_trie_objects_in_leaf_node(trie, node, uniqueP);
            } else {
                SubLObject cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                subnode = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(subnode);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        all_trie_objects_under_node(trie, subnode, uniqueP);
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject all_trie_objects_in_leaf_node_alt(SubLObject trie, SubLObject node, SubLObject uniqueP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject data = trie_node_data(node);
                if (NIL != uniqueP) {
                    if (NIL != trie_relevant_object(trie, data)) {
                        $trie_objects$.setDynamicValue(cons(data, $trie_objects$.getDynamicValue(thread)), thread);
                    }
                } else {
                    data = trie_relevant_objects(trie, data);
                    $trie_objects$.setDynamicValue(append(data, $trie_objects$.getDynamicValue(thread)), thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject all_trie_objects_in_leaf_node(final SubLObject trie, final SubLObject node, final SubLObject uniqueP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = trie_node_data(node);
        if (NIL != uniqueP) {
            if (NIL != trie_relevant_object(trie, data)) {
                $trie_objects$.setDynamicValue(cons(data, $trie_objects$.getDynamicValue(thread)), thread);
            }
        } else {
            data = trie_relevant_objects(trie, data);
            $trie_objects$.setDynamicValue(append(data, $trie_objects$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static final SubLObject trie_search_alt(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(trie, TRIE_P);
            SubLTrampolineFile.checkType(string, STRINGP);
            case_sensitiveP = makeBoolean((NIL != case_sensitiveP) && (NIL != trie_case_sensitive(trie)));
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $trie_objects$.currentBinding(thread);
                    try {
                        $trie_objects$.bind(NIL, thread);
                        {
                            SubLObject uniqueP = trie_unique(trie);
                            SubLObject stack = Strings.make_string($trie_maximum_search_size$.getDynamicValue(thread), UNPROVIDED);
                            SubLObject stack_index = ZERO_INTEGER;
                            SubLObject string_max = subtract(NIL != end ? ((SubLObject) (end)) : length(string), ONE_INTEGER);
                            SubLObject top_node = trie_top_node(trie);
                            initialize_trie_ancestor_tracking(top_node);
                            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                {
                                    SubLObject cdolist_list_var = trie_node_subnodes(top_node);
                                    SubLObject node = NIL;
                                    for (node = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , node = cdolist_list_var.first()) {
                                        trie_ancestor_tracking_descend(node);
                                        if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                            trie_search_internal(trie, node, string, start, string_max, stack, stack_index, case_sensitiveP, uniqueP);
                                        }
                                        trie_ancestor_tracking_ascend();
                                    }
                                }
                            }
                            ans = $trie_objects$.getDynamicValue(thread);
                            finish_trie_ancestor_tracking();
                        }
                    } finally {
                        $trie_objects$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(ans);
            }
        }
    }

    public static SubLObject trie_search(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        case_sensitiveP = makeBoolean((NIL != case_sensitiveP) && (NIL != trie_case_sensitive(trie)));
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $trie_objects$.currentBinding(thread);
        try {
            $trie_objects$.bind(NIL, thread);
            final SubLObject uniqueP = trie_unique(trie);
            final SubLObject stack = Strings.make_string($trie_maximum_search_size$.getDynamicValue(thread), UNPROVIDED);
            final SubLObject stack_index = ZERO_INTEGER;
            final SubLObject string_max = subtract(NIL != end ? end : length(string), ONE_INTEGER);
            final SubLObject top_node = trie_top_node(trie);
            initialize_trie_ancestor_tracking(top_node);
            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                SubLObject cdolist_list_var = trie_node_subnodes(top_node);
                SubLObject node = NIL;
                node = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(node);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        trie_search_internal(trie, node, string, start, string_max, stack, stack_index, case_sensitiveP, uniqueP);
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                } 
            }
            ans = $trie_objects$.getDynamicValue(thread);
            finish_trie_ancestor_tracking();
        } finally {
            $trie_objects$.rebind(_prev_bind_0, thread);
        }
        return nreverse(ans);
    }

    public static final SubLObject trie_search_internal_alt(SubLObject trie, SubLObject node, SubLObject string, SubLObject string_min, SubLObject string_max, SubLObject stack, SubLObject stack_index, SubLObject case_sensitiveP, SubLObject uniqueP) {
        {
            SubLObject key = trie_node_key(node);
            if (key.isChar()) {
                Strings.set_char(stack, stack_index, key);
                if (NIL != trie_match(string, string_min, string_max, stack, stack_index, case_sensitiveP)) {
                    all_trie_objects_under_node(trie, node, uniqueP);
                } else {
                    stack_index = add(stack_index, ONE_INTEGER);
                    {
                        SubLObject cdolist_list_var = trie_node_subnodes(node);
                        SubLObject subnode = NIL;
                        for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                            trie_ancestor_tracking_descend(subnode);
                            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                trie_search_internal(trie, subnode, string, string_min, string_max, stack, stack_index, case_sensitiveP, uniqueP);
                            }
                            trie_ancestor_tracking_ascend();
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject trie_search_internal(final SubLObject trie, final SubLObject node, final SubLObject string, final SubLObject string_min, final SubLObject string_max, final SubLObject stack, SubLObject stack_index, final SubLObject case_sensitiveP, final SubLObject uniqueP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject key = trie_node_key(node);
        if (NIL != list_utilities.lengthLE(stack, stack_index, UNPROVIDED)) {
            Errors.error($str58$_S_will_result_in_a_search_that_i, stack, $trie_maximum_search_size$.getDynamicValue(thread));
        }
        if (key.isChar()) {
            Strings.set_char(stack, stack_index, key);
            if (NIL != trie_match(string, string_min, string_max, stack, stack_index, case_sensitiveP)) {
                all_trie_objects_under_node(trie, node, uniqueP);
            } else {
                stack_index = add(stack_index, ONE_INTEGER);
                SubLObject cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                subnode = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(subnode);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        trie_search_internal(trie, subnode, string, string_min, string_max, stack, stack_index, case_sensitiveP, uniqueP);
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static final SubLObject trie_match_alt(SubLObject string, SubLObject string_min, SubLObject string_max, SubLObject array, SubLObject array_max, SubLObject case_sensitiveP) {
        if (array_max.numGE(subtract(string_max, string_min))) {
            {
                SubLObject i = NIL;
                SubLObject i2 = NIL;
                for (i = string_max, i2 = array_max; !(i.numL(string_min) || i2.isNegative()); i = subtract(i, ONE_INTEGER) , i2 = subtract(i2, ONE_INTEGER)) {
                    {
                        SubLObject s_char = Strings.sublisp_char(string, i);
                        SubLObject a_char = Strings.sublisp_char(array, i2);
                        if (NIL == (NIL != case_sensitiveP ? ((SubLObject) (charE(s_char, a_char))) : char_equal(s_char, a_char))) {
                            return NIL;
                        }
                    }
                }
                return T;
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject trie_match(final SubLObject string, final SubLObject string_min, final SubLObject string_max, final SubLObject array, final SubLObject array_max, final SubLObject case_sensitiveP) {
        if (array_max.numGE(subtract(string_max, string_min))) {
            SubLObject i;
            SubLObject i2;
            SubLObject s_char;
            SubLObject a_char;
            for (i = NIL, i2 = NIL, i = string_max, i2 = array_max; (!i.numL(string_min)) && (!i2.isNegative()); i = subtract(i, ONE_INTEGER) , i2 = subtract(i2, ONE_INTEGER)) {
                s_char = Strings.sublisp_char(string, i);
                a_char = Strings.sublisp_char(array, i2);
                if (NIL == (NIL != case_sensitiveP ? charE(s_char, a_char) : char_equal(s_char, a_char))) {
                    return NIL;
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     * Call FUNCTION on each object stored in TRIE
     */
    @LispMethod(comment = "Call FUNCTION on each object stored in TRIE")
    public static final SubLObject map_trie_data_alt(SubLObject function, SubLObject trie) {
        SubLTrampolineFile.checkType(trie, TRIE_P);
        {
            SubLObject top_node = trie_top_node(trie);
            initialize_trie_ancestor_tracking(top_node);
            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                {
                    SubLObject catch_var = NIL;
                    try {
                        map_trie_data_internal(function, trie, top_node, trie_unique(trie));
                    } catch (Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                    }
                }
            }
            finish_trie_ancestor_tracking();
        }
        return NIL;
    }

    @LispMethod(comment = "Call FUNCTION on each object stored in TRIE")
    public static SubLObject map_trie_data(final SubLObject function, final SubLObject trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        final SubLObject top_node = trie_top_node(trie);
        initialize_trie_ancestor_tracking(top_node);
        if (NIL != trie_relevant_ancestor_pathP(trie)) {
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($MAPPING_DONE);
                map_trie_data_internal(function, trie, top_node, trie_unique(trie));
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            } finally {
                thread.throwStack.pop();
            }
        }
        finish_trie_ancestor_tracking();
        return NIL;
    }/**
     * Call FUNCTION on each object stored in TRIE
     */


    public static final SubLObject map_trie_data_internal_alt(SubLObject function, SubLObject trie, SubLObject node, SubLObject uniqueP) {
        if (NIL != trie_leaf_node_p(node)) {
            {
                SubLObject data = trie_node_data(node);
                if (NIL != uniqueP) {
                    if (NIL != trie_relevant_object(trie, data)) {
                        funcall(function, data);
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = data;
                        SubLObject item = NIL;
                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                            if (NIL != trie_relevant_object(trie, item)) {
                                funcall(function, item);
                            }
                        }
                    }
                }
            }
        } else {
            {
                SubLObject cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                    trie_ancestor_tracking_descend(subnode);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        map_trie_data_internal(function, trie, subnode, uniqueP);
                    }
                    trie_ancestor_tracking_ascend();
                }
            }
        }
        return NIL;
    }

    public static SubLObject map_trie_data_internal(final SubLObject function, final SubLObject trie, final SubLObject node, final SubLObject uniqueP) {
        if (NIL != trie_leaf_node_p(node)) {
            final SubLObject data = trie_node_data(node);
            if (NIL != uniqueP) {
                if (NIL != trie_relevant_object(trie, data)) {
                    funcall(function, data);
                }
            } else {
                SubLObject cdolist_list_var = data;
                SubLObject item = NIL;
                item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != trie_relevant_object(trie, item)) {
                        funcall(function, item);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    item = cdolist_list_var.first();
                } 
            }
        } else {
            SubLObject cdolist_list_var2 = trie_node_subnodes(node);
            SubLObject subnode = NIL;
            subnode = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                trie_ancestor_tracking_descend(subnode);
                if (NIL != trie_relevant_ancestor_pathP(trie)) {
                    map_trie_data_internal(function, trie, subnode, uniqueP);
                }
                trie_ancestor_tracking_ascend();
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode = cdolist_list_var2.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject map_trie_data_direction_alt(SubLObject function, SubLObject trie, SubLObject string, SubLObject start, SubLObject end, SubLObject v_forward) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        SubLTrampolineFile.checkType(trie, TRIE_P);
        SubLTrampolineFile.checkType(string, STRINGP);
        if (NIL == end) {
            end = length(string);
        }
        {
            SubLObject top_node = trie_top_node(trie);
            SubLObject unique = trie_unique(trie);
            SubLObject case_sensitive = trie_case_sensitive(trie);
            initialize_trie_ancestor_tracking(top_node);
            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                if (NIL != v_forward) {
                    map_trie_data_forward(function, trie, top_node, unique, case_sensitive, string, start, end);
                } else {
                    map_trie_data_backward(function, trie, top_node, unique, case_sensitive, string, start, end);
                }
            }
            finish_trie_ancestor_tracking();
        }
        return NIL;
    }

    public static SubLObject map_trie_data_direction(final SubLObject function, final SubLObject trie, final SubLObject string, SubLObject start, SubLObject end, SubLObject v_forward) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL == end) {
            end = length(string);
        }
        final SubLObject top_node = trie_top_node(trie);
        final SubLObject unique = trie_unique(trie);
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        initialize_trie_ancestor_tracking(top_node);
        if (NIL != trie_relevant_ancestor_pathP(trie)) {
            if (NIL != v_forward) {
                map_trie_data_forward(function, trie, top_node, unique, case_sensitive, string, start, end);
            } else {
                map_trie_data_backward(function, trie, top_node, unique, case_sensitive, string, start, end);
            }
        }
        finish_trie_ancestor_tracking();
        return NIL;
    }

    public static final SubLObject map_trie_data_forward_alt(SubLObject function, SubLObject trie, SubLObject node, SubLObject unique, SubLObject case_sensitive, SubLObject string, SubLObject char_index, SubLObject end_index) {
        if (NIL != string) {
            if (char_index.numE(end_index)) {
                map_trie_data_forward(function, trie, node, unique, case_sensitive, NIL, NIL, NIL);
            } else {
                {
                    SubLObject v_char = Strings.sublisp_char(string, char_index);
                    SubLObject cdolist_list_var = trie_node_subnodes(node);
                    SubLObject subnode = NIL;
                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                        trie_ancestor_tracking_descend(subnode);
                        if (NIL != trie_relevant_ancestor_pathP(trie)) {
                            {
                                SubLObject subkey = trie_node_key(subnode);
                                if (subkey == $END) {
                                } else {
                                    if (NIL != trie_key_L(subkey, v_char, case_sensitive)) {
                                    } else {
                                        if (NIL != trie_key_E(subkey, v_char, case_sensitive)) {
                                            map_trie_data_forward(function, trie, subnode, unique, case_sensitive, string, add(char_index, ONE_INTEGER), end_index);
                                        } else {
                                            map_trie_data_forward(function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL);
                                        }
                                    }
                                }
                            }
                        }
                        trie_ancestor_tracking_ascend();
                    }
                }
            }
        } else {
            if (NIL != trie_leaf_node_p(node)) {
                {
                    SubLObject data = trie_node_data(node);
                    if (NIL != unique) {
                        if (NIL != trie_relevant_object(trie, data)) {
                            funcall(function, data);
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var = data;
                            SubLObject datum = NIL;
                            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                                if (NIL != trie_relevant_object(trie, datum)) {
                                    funcall(function, datum);
                                }
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject cdolist_list_var = trie_node_subnodes(node);
                    SubLObject subnode = NIL;
                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                        trie_ancestor_tracking_descend(subnode);
                        if (NIL != trie_relevant_ancestor_pathP(trie)) {
                            map_trie_data_forward(function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL);
                        }
                        trie_ancestor_tracking_ascend();
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject map_trie_data_forward(final SubLObject function, final SubLObject trie, final SubLObject node, final SubLObject unique, final SubLObject case_sensitive, final SubLObject string, final SubLObject char_index, final SubLObject end_index) {
        if (NIL != string) {
            if (char_index.numE(end_index)) {
                map_trie_data_forward(function, trie, node, unique, case_sensitive, NIL, NIL, NIL);
            } else {
                final SubLObject v_char = Strings.sublisp_char(string, char_index);
                SubLObject cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                subnode = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    trie_ancestor_tracking_descend(subnode);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        final SubLObject subkey = trie_node_key(subnode);
                        if (subkey != $END) {
                            if (NIL == trie_key_L(subkey, v_char, case_sensitive)) {
                                if (NIL != trie_key_E(subkey, v_char, case_sensitive)) {
                                    map_trie_data_forward(function, trie, subnode, unique, case_sensitive, string, add(char_index, ONE_INTEGER), end_index);
                                } else {
                                    map_trie_data_forward(function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL);
                                }
                            }
                        }
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                } 
            }
        } else
            if (NIL != trie_leaf_node_p(node)) {
                final SubLObject data = trie_node_data(node);
                if (NIL != unique) {
                    if (NIL != trie_relevant_object(trie, data)) {
                        funcall(function, data);
                    }
                } else {
                    SubLObject cdolist_list_var = data;
                    SubLObject datum = NIL;
                    datum = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != trie_relevant_object(trie, datum)) {
                            funcall(function, datum);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        datum = cdolist_list_var.first();
                    } 
                }
            } else {
                SubLObject cdolist_list_var2 = trie_node_subnodes(node);
                SubLObject subnode2 = NIL;
                subnode2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    trie_ancestor_tracking_descend(subnode2);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        map_trie_data_forward(function, trie, subnode2, unique, case_sensitive, NIL, NIL, NIL);
                    }
                    trie_ancestor_tracking_ascend();
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    subnode2 = cdolist_list_var2.first();
                } 
            }

        return NIL;
    }

    public static final SubLObject map_trie_data_backward_alt(SubLObject function, SubLObject trie, SubLObject node, SubLObject unique, SubLObject case_sensitive, SubLObject string, SubLObject char_index, SubLObject end_index) {
        if (NIL != string) {
            if (char_index.numE(end_index)) {
            } else {
                {
                    SubLObject v_char = Strings.sublisp_char(string, char_index);
                    SubLObject subnodes = trie_node_subnodes(node);
                    SubLObject length = length(subnodes);
                    SubLObject index_from_end = NIL;
                    for (index_from_end = ZERO_INTEGER; index_from_end.numL(length); index_from_end = add(index_from_end, ONE_INTEGER)) {
                        {
                            SubLObject node_index = subtract(length, index_from_end, ONE_INTEGER);
                            SubLObject subnode = nth(node_index, subnodes);
                            SubLObject subkey = trie_node_key(subnode);
                            trie_ancestor_tracking_descend(subnode);
                            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                if (subkey == $END) {
                                    map_trie_data_backward(function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL);
                                } else {
                                    if (NIL != trie_key_L(subkey, v_char, case_sensitive)) {
                                        map_trie_data_backward(function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL);
                                    } else {
                                        if (NIL != trie_key_E(subkey, v_char, case_sensitive)) {
                                            map_trie_data_backward(function, trie, subnode, unique, case_sensitive, string, add(char_index, ONE_INTEGER), end_index);
                                        }
                                    }
                                }
                            }
                            trie_ancestor_tracking_ascend();
                        }
                    }
                }
            }
        } else {
            if (NIL != trie_leaf_node_p(node)) {
                {
                    SubLObject data = trie_node_data(node);
                    if (NIL != unique) {
                        if (NIL != trie_relevant_object(trie, data)) {
                            funcall(function, data);
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var = data;
                            SubLObject datum = NIL;
                            for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                                if (NIL != trie_relevant_object(trie, datum)) {
                                    funcall(function, datum);
                                }
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject subnodes = trie_node_subnodes(node);
                    SubLObject length = length(subnodes);
                    SubLObject index_from_end = NIL;
                    for (index_from_end = ZERO_INTEGER; index_from_end.numL(length); index_from_end = add(index_from_end, ONE_INTEGER)) {
                        {
                            SubLObject node_index = subtract(length, index_from_end, ONE_INTEGER);
                            SubLObject subnode = nth(node_index, subnodes);
                            trie_ancestor_tracking_descend(subnode);
                            if (NIL != trie_relevant_ancestor_pathP(trie)) {
                                map_trie_data_backward(function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL);
                            }
                            trie_ancestor_tracking_ascend();
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject map_trie_data_backward(final SubLObject function, final SubLObject trie, final SubLObject node, final SubLObject unique, final SubLObject case_sensitive, final SubLObject string, final SubLObject char_index, final SubLObject end_index) {
        if (NIL != string) {
            if (!char_index.numE(end_index)) {
                final SubLObject v_char = Strings.sublisp_char(string, char_index);
                final SubLObject subnodes = trie_node_subnodes(node);
                SubLObject length;
                SubLObject index_from_end;
                SubLObject node_index;
                SubLObject subnode;
                SubLObject subkey;
                for (length = length(subnodes), index_from_end = NIL, index_from_end = ZERO_INTEGER; index_from_end.numL(length); index_from_end = add(index_from_end, ONE_INTEGER)) {
                    node_index = subtract(length, index_from_end, ONE_INTEGER);
                    subnode = nth(node_index, subnodes);
                    subkey = trie_node_key(subnode);
                    trie_ancestor_tracking_descend(subnode);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        if (subkey == $END) {
                            map_trie_data_backward(function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL);
                        } else
                            if (NIL != trie_key_L(subkey, v_char, case_sensitive)) {
                                map_trie_data_backward(function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL);
                            } else
                                if (NIL != trie_key_E(subkey, v_char, case_sensitive)) {
                                    map_trie_data_backward(function, trie, subnode, unique, case_sensitive, string, add(char_index, ONE_INTEGER), end_index);
                                }


                    }
                    trie_ancestor_tracking_ascend();
                }
            }
        } else
            if (NIL != trie_leaf_node_p(node)) {
                final SubLObject data = trie_node_data(node);
                if (NIL != unique) {
                    if (NIL != trie_relevant_object(trie, data)) {
                        funcall(function, data);
                    }
                } else {
                    SubLObject cdolist_list_var = data;
                    SubLObject datum = NIL;
                    datum = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != trie_relevant_object(trie, datum)) {
                            funcall(function, datum);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        datum = cdolist_list_var.first();
                    } 
                }
            } else {
                final SubLObject subnodes2 = trie_node_subnodes(node);
                SubLObject length2;
                SubLObject index_from_end2;
                SubLObject node_index2;
                SubLObject subnode2;
                for (length2 = length(subnodes2), index_from_end2 = NIL, index_from_end2 = ZERO_INTEGER; index_from_end2.numL(length2); index_from_end2 = add(index_from_end2, ONE_INTEGER)) {
                    node_index2 = subtract(length2, index_from_end2, ONE_INTEGER);
                    subnode2 = nth(node_index2, subnodes2);
                    trie_ancestor_tracking_descend(subnode2);
                    if (NIL != trie_relevant_ancestor_pathP(trie)) {
                        map_trie_data_backward(function, trie, subnode2, unique, case_sensitive, NIL, NIL, NIL);
                    }
                    trie_ancestor_tracking_ascend();
                }
            }

        return NIL;
    }

    public static final SubLObject do_objects_in_trie_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt54);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject v_object = NIL;
                    SubLObject trie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    v_object = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt54);
                    trie = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt54);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt54);
                            if (NIL == member(current_1, $list_alt55, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt54);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            SubLObject forward_tail = property_list_member($FORWARD, current);
                            SubLObject v_forward = (NIL != forward_tail) ? ((SubLObject) (cadr(forward_tail))) : T;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject iterator = $sym59$ITERATOR;
                                return list(CLET, list(list(iterator, list(NEW_TRIE_ITERATOR, trie, v_forward))), listS(DO_ITERATOR, list(v_object, iterator, $DONE, done), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_objects_in_trie(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_object = NIL;
        SubLObject trie = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        trie = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list60);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list60);
            if (NIL == member(current_$1, $list61, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list60);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject forward_tail = property_list_member($FORWARD, current);
        final SubLObject v_forward = (NIL != forward_tail) ? cadr(forward_tail) : T;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym65$ITERATOR;
        return list(CLET, list(list(iterator, list(NEW_TRIE_ITERATOR, trie, v_forward))), listS(DO_ITERATOR, list(v_object, iterator, $DONE, done), append(body, NIL)));
    }

    public static final SubLObject new_trie_iterator_alt(SubLObject trie, SubLObject forwardP) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        {
            SubLObject state = new_trie_iterator_state(trie, forwardP);
            return iteration.new_iterator(state, TRIE_ITERATOR_DONE, TRIE_ITERATOR_NEXT, TRIE_ITERATOR_FINALIZE);
        }
    }

    public static SubLObject new_trie_iterator(final SubLObject trie, SubLObject forwardP) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        final SubLObject state = new_trie_iterator_state(trie, forwardP);
        return iteration.new_iterator(state, TRIE_ITERATOR_DONE, TRIE_ITERATOR_NEXT, TRIE_ITERATOR_FINALIZE);
    }

    public static final SubLObject new_trie_iterator_state_alt(SubLObject trie, SubLObject forwardP) {
        {
            SubLObject state = make_vector(FIVE_INTEGER, NIL);
            set_aref(state, ZERO_INTEGER, trie);
            set_aref(state, ONE_INTEGER, trie_top_node(trie));
            set_aref(state, TWO_INTEGER, forwardP);
            set_aref(state, THREE_INTEGER, NIL != trie_unique(trie) ? ((SubLObject) (NIL)) : queues.create_queue());
            set_aref(state, FOUR_INTEGER, stacks.create_stack());
            return state;
        }
    }

    public static SubLObject new_trie_iterator_state(final SubLObject trie, final SubLObject forwardP) {
        final SubLObject state = make_vector(FIVE_INTEGER, NIL);
        set_aref(state, ZERO_INTEGER, trie);
        set_aref(state, ONE_INTEGER, trie_top_node(trie));
        set_aref(state, TWO_INTEGER, forwardP);
        set_aref(state, THREE_INTEGER, NIL != trie_unique(trie) ? NIL : queues.create_queue(UNPROVIDED));
        set_aref(state, FOUR_INTEGER, stacks.create_stack());
        return state;
    }

    public static final SubLObject trie_iterator_done_alt(SubLObject state) {
        return makeBoolean(((NIL != trie_iterator_done_node(aref(state, ONE_INTEGER))) && (NIL != trie_iterator_done_queue(aref(state, THREE_INTEGER)))) && (NIL != trie_iterator_done_stack(aref(state, FOUR_INTEGER))));
    }

    public static SubLObject trie_iterator_done(final SubLObject state) {
        return makeBoolean(((NIL != trie_iterator_done_node(aref(state, ONE_INTEGER))) && (NIL != trie_iterator_done_queue(aref(state, THREE_INTEGER)))) && (NIL != trie_iterator_done_stack(aref(state, FOUR_INTEGER))));
    }

    public static final SubLObject trie_iterator_done_node_alt(SubLObject node) {
        return sublisp_null(node);
    }

    public static SubLObject trie_iterator_done_node(final SubLObject node) {
        return sublisp_null(node);
    }

    public static final SubLObject trie_iterator_done_queue_alt(SubLObject possibly_queue) {
        return makeBoolean((NIL == queues.queue_p(possibly_queue)) || (NIL != queues.queue_empty_p(possibly_queue)));
    }

    public static SubLObject trie_iterator_done_queue(final SubLObject possibly_queue) {
        return makeBoolean((NIL == queues.queue_p(possibly_queue)) || (NIL != queues.queue_empty_p(possibly_queue)));
    }

    public static final SubLObject trie_iterator_done_stack_alt(SubLObject stack) {
        return stacks.stack_empty_p(stack);
    }

    public static SubLObject trie_iterator_done_stack(final SubLObject stack) {
        return stacks.stack_empty_p(stack);
    }

    public static final SubLObject trie_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject trie = aref(state, ZERO_INTEGER);
                SubLObject node = aref(state, ONE_INTEGER);
                SubLObject forwardP = aref(state, TWO_INTEGER);
                SubLObject queue = aref(state, THREE_INTEGER);
                SubLObject stack = aref(state, FOUR_INTEGER);
                thread.resetMultipleValues();
                {
                    SubLObject next = (NIL != queues.queue_p(queue)) ? ((SubLObject) (trie_iterator_next_non_unique(trie, node, forwardP, queue, stack))) : trie_iterator_next_unique(trie, node, forwardP, stack);
                    SubLObject invalidP = thread.secondMultipleValue();
                    SubLObject new_node = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != invalidP) {
                        set_aref(state, ONE_INTEGER, NIL);
                        set_aref(state, THREE_INTEGER, NIL);
                        stacks.clear_stack(stack);
                    } else {
                        set_aref(state, ONE_INTEGER, new_node);
                    }
                    return values(next, state, invalidP);
                }
            }
        }
    }

    public static SubLObject trie_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject trie = aref(state, ZERO_INTEGER);
        final SubLObject node = aref(state, ONE_INTEGER);
        final SubLObject forwardP = aref(state, TWO_INTEGER);
        final SubLObject queue = aref(state, THREE_INTEGER);
        final SubLObject stack = aref(state, FOUR_INTEGER);
        thread.resetMultipleValues();
        final SubLObject next = (NIL != queues.queue_p(queue)) ? trie_iterator_next_non_unique(trie, node, forwardP, queue, stack) : trie_iterator_next_unique(trie, node, forwardP, stack);
        final SubLObject invalidP = thread.secondMultipleValue();
        final SubLObject new_node = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != invalidP) {
            set_aref(state, ONE_INTEGER, NIL);
            set_aref(state, THREE_INTEGER, NIL);
            stacks.clear_stack(stack);
        } else {
            set_aref(state, ONE_INTEGER, new_node);
        }
        return values(next, state, invalidP);
    }

    public static final SubLObject trie_iterator_next_unique_alt(SubLObject trie, SubLObject node, SubLObject forwardP, SubLObject stack) {
        {
            SubLObject next = NIL;
            SubLObject invalidP = NIL;
            while (!((NIL != next) || (NIL != invalidP))) {
                if (NIL != trie_leaf_node_p(node)) {
                    {
                        SubLObject data = trie_node_data(node);
                        if (NIL != trie_relevant_object(trie, data)) {
                            next = data;
                        }
                    }
                } else {
                    {
                        SubLObject subnodes = trie_node_subnodes(node);
                        if (NIL != forwardP) {
                            {
                                SubLObject cdolist_list_var = reverse(subnodes);
                                SubLObject subnode = NIL;
                                for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                                    stacks.stack_push(subnode, stack);
                                }
                            }
                        } else {
                            {
                                SubLObject cdolist_list_var = subnodes;
                                SubLObject subnode = NIL;
                                for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                                    stacks.stack_push(subnode, stack);
                                }
                            }
                        }
                    }
                }
                node = stacks.stack_pop(stack);
                if (((NIL == next) && (NIL == node)) && (NIL != stacks.stack_empty_p(stack))) {
                    invalidP = T;
                }
            } 
            return values(next, invalidP, node);
        }
    }

    public static SubLObject trie_iterator_next_unique(final SubLObject trie, SubLObject node, final SubLObject forwardP, final SubLObject stack) {
        SubLObject next;
        SubLObject invalidP;
        for (next = NIL, invalidP = NIL; (NIL == next) && (NIL == invalidP); invalidP = T) {
            if (NIL != trie_leaf_node_p(node)) {
                final SubLObject data = trie_node_data(node);
                if (NIL != trie_relevant_object(trie, data)) {
                    next = data;
                }
            } else {
                final SubLObject subnodes = trie_node_subnodes(node);
                if (NIL != forwardP) {
                    SubLObject cdolist_list_var = reverse(subnodes);
                    SubLObject subnode = NIL;
                    subnode = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        stacks.stack_push(subnode, stack);
                        cdolist_list_var = cdolist_list_var.rest();
                        subnode = cdolist_list_var.first();
                    } 
                } else {
                    SubLObject cdolist_list_var = subnodes;
                    SubLObject subnode = NIL;
                    subnode = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        stacks.stack_push(subnode, stack);
                        cdolist_list_var = cdolist_list_var.rest();
                        subnode = cdolist_list_var.first();
                    } 
                }
            }
            node = stacks.stack_pop(stack);
            if (((NIL == next) && (NIL == node)) && (NIL != stacks.stack_empty_p(stack))) {
            }
        }
        return values(next, invalidP, node);
    }

    public static final SubLObject trie_iterator_next_non_unique_alt(SubLObject trie, SubLObject node, SubLObject forwardP, SubLObject queue, SubLObject stack) {
        {
            SubLObject next = NIL;
            SubLObject invalidP = NIL;
            while (!((NIL != next) || (NIL != invalidP))) {
                if (NIL != queues.queue_empty_p(queue)) {
                    if (NIL != trie_leaf_node_p(node)) {
                        {
                            SubLObject data = trie_node_data(node);
                            SubLObject cdolist_list_var = data;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                if (NIL != trie_relevant_object(trie, item)) {
                                    queues.enqueue(item, queue);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject subnodes = trie_node_subnodes(node);
                            if (NIL != forwardP) {
                                {
                                    SubLObject cdolist_list_var = reverse(subnodes);
                                    SubLObject subnode = NIL;
                                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                                        stacks.stack_push(subnode, stack);
                                    }
                                }
                            } else {
                                {
                                    SubLObject cdolist_list_var = subnodes;
                                    SubLObject subnode = NIL;
                                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                                        stacks.stack_push(subnode, stack);
                                    }
                                }
                            }
                        }
                    }
                    node = stacks.stack_pop(stack);
                } else {
                    next = queues.dequeue(queue);
                }
                if ((((NIL == next) && (NIL == node)) && (NIL != stacks.stack_empty_p(stack))) && (NIL != queues.queue_empty_p(queue))) {
                    invalidP = T;
                }
            } 
            return values(next, invalidP, node);
        }
    }

    public static SubLObject trie_iterator_next_non_unique(final SubLObject trie, SubLObject node, final SubLObject forwardP, final SubLObject queue, final SubLObject stack) {
        SubLObject next;
        SubLObject invalidP;
        for (next = NIL, invalidP = NIL; (NIL == next) && (NIL == invalidP); invalidP = T) {
            if (NIL != queues.queue_empty_p(queue)) {
                if (NIL != trie_leaf_node_p(node)) {
                    SubLObject cdolist_list_var;
                    final SubLObject data = cdolist_list_var = trie_node_data(node);
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != trie_relevant_object(trie, item)) {
                            queues.enqueue(item, queue);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                } else {
                    final SubLObject subnodes = trie_node_subnodes(node);
                    if (NIL != forwardP) {
                        SubLObject cdolist_list_var = reverse(subnodes);
                        SubLObject subnode = NIL;
                        subnode = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            stacks.stack_push(subnode, stack);
                            cdolist_list_var = cdolist_list_var.rest();
                            subnode = cdolist_list_var.first();
                        } 
                    } else {
                        SubLObject cdolist_list_var = subnodes;
                        SubLObject subnode = NIL;
                        subnode = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            stacks.stack_push(subnode, stack);
                            cdolist_list_var = cdolist_list_var.rest();
                            subnode = cdolist_list_var.first();
                        } 
                    }
                }
                node = stacks.stack_pop(stack);
            } else {
                next = queues.dequeue(queue);
            }
            if ((((NIL == next) && (NIL == node)) && (NIL != stacks.stack_empty_p(stack))) && (NIL != queues.queue_empty_p(queue))) {
            }
        }
        return values(next, invalidP, node);
    }

    public static final SubLObject trie_iterator_finalize_alt(SubLObject state) {
        if (NIL != queues.queue_p(aref(state, THREE_INTEGER))) {
            queues.clear_queue(aref(state, THREE_INTEGER));
        }
        stacks.clear_stack(aref(state, FOUR_INTEGER));
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(FIVE_INTEGER); i = add(i, ONE_INTEGER)) {
                set_aref(state, i, NIL);
            }
        }
        state = NIL;
        return T;
    }

    public static SubLObject trie_iterator_finalize(SubLObject state) {
        if (NIL != queues.queue_p(aref(state, THREE_INTEGER))) {
            queues.clear_queue(aref(state, THREE_INTEGER));
        }
        stacks.clear_stack(aref(state, FOUR_INTEGER));
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(FIVE_INTEGER); i = add(i, ONE_INTEGER)) {
            set_aref(state, i, NIL);
        }
        state = NIL;
        return T;
    }

    public static final SubLObject new_directed_trie_iterator_alt(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        {
            SubLObject state = new_directed_trie_iterator_state(trie, string, case_sensitiveP, start, end, forwardP, strictP);
            return iteration.new_iterator(state, TRIE_ITERATOR_DONE, TRIE_ITERATOR_NEXT, TRIE_ITERATOR_FINALIZE);
        }
    }

    public static SubLObject new_directed_trie_iterator(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        final SubLObject state = new_directed_trie_iterator_state(trie, string, case_sensitiveP, start, end, forwardP, strictP);
        return iteration.new_iterator(state, TRIE_ITERATOR_DONE, TRIE_ITERATOR_NEXT, TRIE_ITERATOR_FINALIZE);
    }

    public static final SubLObject new_directed_trie_iterator_state_alt(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP) {
        {
            SubLObject state = make_vector(FIVE_INTEGER, NIL);
            SubLObject stack = directed_trie_iterator_generate_stack(trie, string, case_sensitiveP, start, end, forwardP, strictP);
            SubLObject node = stacks.stack_pop(stack);
            set_aref(state, ZERO_INTEGER, trie);
            set_aref(state, ONE_INTEGER, node);
            set_aref(state, TWO_INTEGER, forwardP);
            set_aref(state, THREE_INTEGER, NIL != trie_unique(trie) ? ((SubLObject) (NIL)) : queues.create_queue());
            set_aref(state, FOUR_INTEGER, stack);
            return state;
        }
    }

    public static SubLObject new_directed_trie_iterator_state(final SubLObject trie, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject forwardP, final SubLObject strictP) {
        final SubLObject state = make_vector(FIVE_INTEGER, NIL);
        final SubLObject stack = directed_trie_iterator_generate_stack(trie, string, case_sensitiveP, start, end, forwardP, strictP);
        final SubLObject node = stacks.stack_pop(stack);
        set_aref(state, ZERO_INTEGER, trie);
        set_aref(state, ONE_INTEGER, node);
        set_aref(state, TWO_INTEGER, forwardP);
        set_aref(state, THREE_INTEGER, NIL != trie_unique(trie) ? NIL : queues.create_queue(UNPROVIDED));
        set_aref(state, FOUR_INTEGER, stack);
        return state;
    }

    public static final SubLObject directed_trie_iterator_generate_stack_alt(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP) {
        {
            SubLObject start_node = trie_top_node(trie);
            SubLObject start_string = subseq(string, start, end);
            SubLObject stack = stacks.create_stack();
            if (NIL != forwardP) {
                forward_trie_iterator_generate_stack_recursive(start_node, stack, start_string, case_sensitiveP, strictP);
            } else {
                backward_trie_iterator_generate_stack_recursive(start_node, stack, start_string, case_sensitiveP, strictP);
            }
            return stack;
        }
    }

    public static SubLObject directed_trie_iterator_generate_stack(final SubLObject trie, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject forwardP, final SubLObject strictP) {
        final SubLObject start_node = trie_top_node(trie);
        final SubLObject start_string = subseq(string, start, end);
        final SubLObject stack = stacks.create_stack();
        if (NIL != forwardP) {
            forward_trie_iterator_generate_stack_recursive(start_node, stack, start_string, case_sensitiveP, strictP);
        } else {
            backward_trie_iterator_generate_stack_recursive(start_node, stack, start_string, case_sensitiveP, strictP);
        }
        return stack;
    }

    public static final SubLObject forward_trie_iterator_generate_stack_recursive_alt(SubLObject node, SubLObject stack, SubLObject string, SubLObject case_sensitiveP, SubLObject strictly_forwardP) {
        if (NIL != lengthE(string, ZERO_INTEGER, UNPROVIDED)) {
            if (NIL == strictly_forwardP) {
                {
                    SubLObject subnodes = trie_node_subnodes(node);
                    SubLObject cdolist_list_var = reverse(subnodes);
                    SubLObject subnode = NIL;
                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                        stacks.stack_push(subnode, stack);
                    }
                }
            }
        } else {
            {
                SubLObject subnodes = trie_node_subnodes(node);
                SubLObject v_char = elt(string, ZERO_INTEGER);
                SubLObject equal_nodes = NIL;
                {
                    SubLObject cdolist_list_var = reverse(subnodes);
                    SubLObject subnode = NIL;
                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                        {
                            SubLObject key = trie_node_key(subnode);
                            if (key == $END) {
                            } else {
                                if (NIL != trie_key_L(key, v_char, case_sensitiveP)) {
                                } else {
                                    if (NIL != trie_key_E(key, v_char, case_sensitiveP)) {
                                        equal_nodes = cons(subnode, equal_nodes);
                                    } else {
                                        stacks.stack_push(subnode, stack);
                                    }
                                }
                            }
                        }
                    }
                }
                equal_nodes = nreverse(equal_nodes);
                {
                    SubLObject cdolist_list_var = equal_nodes;
                    SubLObject subnode = NIL;
                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                        forward_trie_iterator_generate_stack_recursive(subnode, stack, subseq(string, ONE_INTEGER, UNPROVIDED), case_sensitiveP, strictly_forwardP);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject forward_trie_iterator_generate_stack_recursive(final SubLObject node, final SubLObject stack, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject strictly_forwardP) {
        if (NIL != list_utilities.lengthE(string, ZERO_INTEGER, UNPROVIDED)) {
            if (NIL == strictly_forwardP) {
                final SubLObject subnodes = trie_node_subnodes(node);
                SubLObject cdolist_list_var = reverse(subnodes);
                SubLObject subnode = NIL;
                subnode = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    stacks.stack_push(subnode, stack);
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                } 
            }
        } else {
            final SubLObject subnodes = trie_node_subnodes(node);
            final SubLObject v_char = elt(string, ZERO_INTEGER);
            SubLObject equal_nodes = NIL;
            SubLObject cdolist_list_var2 = reverse(subnodes);
            SubLObject subnode2 = NIL;
            subnode2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject key = trie_node_key(subnode2);
                if (key != $END) {
                    if (NIL == trie_key_L(key, v_char, case_sensitiveP)) {
                        if (NIL != trie_key_E(key, v_char, case_sensitiveP)) {
                            equal_nodes = cons(subnode2, equal_nodes);
                        } else {
                            stacks.stack_push(subnode2, stack);
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode2 = cdolist_list_var2.first();
            } 
            equal_nodes = cdolist_list_var2 = nreverse(equal_nodes);
            subnode2 = NIL;
            subnode2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                forward_trie_iterator_generate_stack_recursive(subnode2, stack, subseq(string, ONE_INTEGER, UNPROVIDED), case_sensitiveP, strictly_forwardP);
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode2 = cdolist_list_var2.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject backward_trie_iterator_generate_stack_recursive_alt(SubLObject node, SubLObject stack, SubLObject string, SubLObject case_sensitiveP, SubLObject strictly_backwardP) {
        if (NIL != lengthE(string, ZERO_INTEGER, UNPROVIDED)) {
            if (NIL == strictly_backwardP) {
                {
                    SubLObject subnodes = trie_node_subnodes(node);
                    SubLObject cdolist_list_var = subnodes;
                    SubLObject subnode = NIL;
                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                        stacks.stack_push(subnode, stack);
                    }
                }
            }
        } else {
            {
                SubLObject subnodes = trie_node_subnodes(node);
                SubLObject v_char = elt(string, ZERO_INTEGER);
                SubLObject equal_nodes = NIL;
                {
                    SubLObject cdolist_list_var = subnodes;
                    SubLObject subnode = NIL;
                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                        {
                            SubLObject key = trie_node_key(subnode);
                            if (key == $END) {
                                stacks.stack_push(subnode, stack);
                            } else {
                                if (NIL != trie_key_L(key, v_char, case_sensitiveP)) {
                                    stacks.stack_push(subnode, stack);
                                } else {
                                    if (NIL != trie_key_E(key, v_char, case_sensitiveP)) {
                                        equal_nodes = cons(subnode, equal_nodes);
                                    }
                                }
                            }
                        }
                    }
                }
                equal_nodes = nreverse(equal_nodes);
                {
                    SubLObject cdolist_list_var = equal_nodes;
                    SubLObject subnode = NIL;
                    for (subnode = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subnode = cdolist_list_var.first()) {
                        backward_trie_iterator_generate_stack_recursive(subnode, stack, subseq(string, ONE_INTEGER, UNPROVIDED), case_sensitiveP, strictly_backwardP);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject backward_trie_iterator_generate_stack_recursive(final SubLObject node, final SubLObject stack, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject strictly_backwardP) {
        if (NIL != list_utilities.lengthE(string, ZERO_INTEGER, UNPROVIDED)) {
            if (NIL == strictly_backwardP) {
                SubLObject cdolist_list_var;
                final SubLObject subnodes = cdolist_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                subnode = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    stacks.stack_push(subnode, stack);
                    cdolist_list_var = cdolist_list_var.rest();
                    subnode = cdolist_list_var.first();
                } 
            }
        } else {
            final SubLObject subnodes = trie_node_subnodes(node);
            final SubLObject v_char = elt(string, ZERO_INTEGER);
            SubLObject equal_nodes = NIL;
            SubLObject cdolist_list_var2 = subnodes;
            SubLObject subnode2 = NIL;
            subnode2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject key = trie_node_key(subnode2);
                if (key == $END) {
                    stacks.stack_push(subnode2, stack);
                } else
                    if (NIL != trie_key_L(key, v_char, case_sensitiveP)) {
                        stacks.stack_push(subnode2, stack);
                    } else
                        if (NIL != trie_key_E(key, v_char, case_sensitiveP)) {
                            equal_nodes = cons(subnode2, equal_nodes);
                        }


                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode2 = cdolist_list_var2.first();
            } 
            equal_nodes = cdolist_list_var2 = nreverse(equal_nodes);
            subnode2 = NIL;
            subnode2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                backward_trie_iterator_generate_stack_recursive(subnode2, stack, subseq(string, ONE_INTEGER, UNPROVIDED), case_sensitiveP, strictly_backwardP);
                cdolist_list_var2 = cdolist_list_var2.rest();
                subnode2 = cdolist_list_var2.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject new_trie_ancestor_tracking_vector_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return make_vector($trie_ancestor_tracking_vector_size$.getDynamicValue(thread), NIL);
        }
    }

    public static SubLObject new_trie_ancestor_tracking_vector() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return make_vector($trie_ancestor_tracking_vector_size$.getDynamicValue(thread), NIL);
    }

    public static final SubLObject get_trie_ancestor_tracking_vector_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $trie_ancestor_tracking_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != $trie_ancestor_tracking_resource$.getDynamicValue(thread)) {
                        {
                            SubLObject resource = $trie_ancestor_tracking_resource$.getDynamicValue(thread);
                            $trie_ancestor_tracking_resource$.setDynamicValue(aref(resource, ZERO_INTEGER), thread);
                            set_aref(resource, ZERO_INTEGER, NIL);
                            ans = resource;
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                if (NIL == ans) {
                    ans = new_trie_ancestor_tracking_vector();
                }
                return ans;
            }
        }
    }

    public static SubLObject get_trie_ancestor_tracking_vector() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($trie_ancestor_tracking_lock$.getDynamicValue(thread));
            if (NIL != $trie_ancestor_tracking_resource$.getDynamicValue(thread)) {
                final SubLObject resource = $trie_ancestor_tracking_resource$.getDynamicValue(thread);
                $trie_ancestor_tracking_resource$.setDynamicValue(aref(resource, ZERO_INTEGER), thread);
                set_aref(resource, ZERO_INTEGER, NIL);
                ans = resource;
            }
        } finally {
            if (NIL != release) {
                release_lock($trie_ancestor_tracking_lock$.getDynamicValue(thread));
            }
        }
        if (NIL == ans) {
            ans = new_trie_ancestor_tracking_vector();
        }
        return ans;
    }

    public static final SubLObject free_trie_ancestor_tracking_vector_alt(SubLObject vector) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (vector.isVector()) {
                {
                    SubLObject lock = $trie_ancestor_tracking_lock$.getDynamicValue(thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        set_aref(vector, ZERO_INTEGER, $trie_ancestor_tracking_resource$.getDynamicValue(thread));
                        $trie_ancestor_tracking_resource$.setDynamicValue(vector, thread);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject free_trie_ancestor_tracking_vector(final SubLObject vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (vector.isVector()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($trie_ancestor_tracking_lock$.getDynamicValue(thread));
                set_aref(vector, ZERO_INTEGER, $trie_ancestor_tracking_resource$.getDynamicValue(thread));
                $trie_ancestor_tracking_resource$.setDynamicValue(vector, thread);
            } finally {
                if (NIL != release) {
                    release_lock($trie_ancestor_tracking_lock$.getDynamicValue(thread));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject initialize_trie_ancestor_tracking_alt(SubLObject top_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $trie_ancestor_tracking$.getDynamicValue(thread)) {
                $trie_ancestor_vector$.setDynamicValue(get_trie_ancestor_tracking_vector(), thread);
                $trie_ancestor_next$.setDynamicValue(ZERO_INTEGER, thread);
                trie_ancestor_tracking_descend(top_node);
            }
            return NIL;
        }
    }

    public static SubLObject initialize_trie_ancestor_tracking(final SubLObject top_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trie_ancestor_tracking$.getDynamicValue(thread)) {
            $trie_ancestor_vector$.setDynamicValue(get_trie_ancestor_tracking_vector(), thread);
            $trie_ancestor_next$.setDynamicValue(ZERO_INTEGER, thread);
            trie_ancestor_tracking_descend(top_node);
        }
        return NIL;
    }

    public static final SubLObject finish_trie_ancestor_tracking_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $trie_ancestor_tracking$.getDynamicValue(thread)) {
                free_trie_ancestor_tracking_vector($trie_ancestor_vector$.getDynamicValue(thread));
                $trie_ancestor_next$.setDynamicValue(ZERO_INTEGER, thread);
                $trie_ancestor_vector$.setDynamicValue(NIL, thread);
            }
            return NIL;
        }
    }

    public static SubLObject finish_trie_ancestor_tracking() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trie_ancestor_tracking$.getDynamicValue(thread)) {
            free_trie_ancestor_tracking_vector($trie_ancestor_vector$.getDynamicValue(thread));
            $trie_ancestor_next$.setDynamicValue(ZERO_INTEGER, thread);
            $trie_ancestor_vector$.setDynamicValue(NIL, thread);
        }
        return NIL;
    }

    public static final SubLObject trie_ancestor_tracking_descend_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $trie_ancestor_tracking$.getDynamicValue(thread)) {
                if ($trie_ancestor_next$.getDynamicValue(thread).numGE(length($trie_ancestor_vector$.getDynamicValue(thread)))) {
                    $trie_ancestor_vector$.setDynamicValue(vector_utilities.grow_vector($trie_ancestor_vector$.getDynamicValue(thread), NIL, TWO_INTEGER), thread);
                }
                set_aref($trie_ancestor_vector$.getDynamicValue(thread), $trie_ancestor_next$.getDynamicValue(thread), node);
                $trie_ancestor_next$.setDynamicValue(add($trie_ancestor_next$.getDynamicValue(thread), ONE_INTEGER), thread);
            }
            return NIL;
        }
    }

    public static SubLObject trie_ancestor_tracking_descend(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trie_ancestor_tracking$.getDynamicValue(thread)) {
            if ($trie_ancestor_next$.getDynamicValue(thread).numGE(length($trie_ancestor_vector$.getDynamicValue(thread)))) {
                $trie_ancestor_vector$.setDynamicValue(vector_utilities.grow_vector($trie_ancestor_vector$.getDynamicValue(thread), NIL, TWO_INTEGER), thread);
            }
            set_aref($trie_ancestor_vector$.getDynamicValue(thread), $trie_ancestor_next$.getDynamicValue(thread), node);
            $trie_ancestor_next$.setDynamicValue(add($trie_ancestor_next$.getDynamicValue(thread), ONE_INTEGER), thread);
        }
        return NIL;
    }

    public static final SubLObject trie_ancestor_tracking_ascend_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $trie_ancestor_tracking$.getDynamicValue(thread)) {
                $trie_ancestor_next$.setDynamicValue(subtract($trie_ancestor_next$.getDynamicValue(thread), ONE_INTEGER), thread);
                set_aref($trie_ancestor_vector$.getDynamicValue(thread), $trie_ancestor_next$.getDynamicValue(thread), NIL);
            }
            return NIL;
        }
    }

    public static SubLObject trie_ancestor_tracking_ascend() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $trie_ancestor_tracking$.getDynamicValue(thread)) {
            $trie_ancestor_next$.setDynamicValue(subtract($trie_ancestor_next$.getDynamicValue(thread), ONE_INTEGER), thread);
            set_aref($trie_ancestor_vector$.getDynamicValue(thread), $trie_ancestor_next$.getDynamicValue(thread), NIL);
        }
        return NIL;
    }

    public static final SubLObject trie_ancestor_path_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return values($trie_ancestor_vector$.getDynamicValue(thread), $trie_ancestor_next$.getDynamicValue(thread));
        }
    }

    public static SubLObject trie_ancestor_path() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return values($trie_ancestor_vector$.getDynamicValue(thread), $trie_ancestor_next$.getDynamicValue(thread));
    }

    public static final SubLObject no_more_ancestors_alt(SubLObject ancestor_index) {
        return numE(ancestor_index, ZERO_INTEGER);
    }

    public static SubLObject no_more_ancestors(final SubLObject ancestor_index) {
        return numE(ancestor_index, ZERO_INTEGER);
    }

    public static final SubLObject first_ancestor_alt(SubLObject ancestor_vector, SubLObject ancestor_index) {
        if (NIL != no_more_ancestors(ancestor_index)) {
            return NIL;
        } else {
            return aref(ancestor_vector, subtract(ancestor_index, ONE_INTEGER));
        }
    }

    public static SubLObject first_ancestor(final SubLObject ancestor_vector, final SubLObject ancestor_index) {
        if (NIL != no_more_ancestors(ancestor_index)) {
            return NIL;
        }
        return aref(ancestor_vector, subtract(ancestor_index, ONE_INTEGER));
    }

    public static final SubLObject parent_ancestor_alt(SubLObject ancestor_vector, SubLObject ancestor_index) {
        return first_ancestor(ancestor_vector, ancestor_index);
    }

    public static SubLObject parent_ancestor(final SubLObject ancestor_vector, final SubLObject ancestor_index) {
        return first_ancestor(ancestor_vector, ancestor_index);
    }

    public static final SubLObject next_generation_alt(SubLObject ancestor_index) {
        return subtract(ancestor_index, ONE_INTEGER);
    }

    public static SubLObject next_generation(final SubLObject ancestor_index) {
        return subtract(ancestor_index, ONE_INTEGER);
    }

    /**
     * return T iff somewhere up the ancestors is a node which explicitly has MARK
     */
    @LispMethod(comment = "return T iff somewhere up the ancestors is a node which explicitly has MARK")
    public static final SubLObject multi_trie_some_ancestor_marked_alt(SubLObject ancestor_index, SubLObject ancestor_vector, SubLObject mark) {
        {
            SubLObject some_ancestor_marked = NIL;
            SubLObject catch_var = NIL;
            try {
                {
                    SubLObject cdotimes_end_var = subtract(ancestor_index, ONE_INTEGER);
                    SubLObject index = NIL;
                    for (index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                        {
                            SubLObject ancestor = aref(ancestor_vector, index);
                            if (NIL != trie_node_has_mark(ancestor, mark)) {
                                some_ancestor_marked = T;
                                mapping_finished();
                            }
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
            return some_ancestor_marked;
        }
    }

    @LispMethod(comment = "return T iff somewhere up the ancestors is a node which explicitly has MARK")
    public static SubLObject multi_trie_some_ancestor_marked(final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject some_ancestor_marked = NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            SubLObject cdotimes_end_var;
            SubLObject index;
            SubLObject ancestor;
            for (cdotimes_end_var = subtract(ancestor_index, ONE_INTEGER), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                ancestor = aref(ancestor_vector, index);
                if (NIL != trie_node_has_mark(ancestor, mark)) {
                    some_ancestor_marked = T;
                    mapping_finished();
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return some_ancestor_marked;
    }/**
     * return T iff somewhere up the ancestors is a node which explicitly has MARK
     */


    /**
     * Return a new MULTI-TRIE datastructure
     */
    @LispMethod(comment = "Return a new MULTI-TRIE datastructure")
    public static final SubLObject create_multi_trie_alt(SubLObject unique, SubLObject multi_key_func, SubLObject name, SubLObject case_sensitive, SubLObject test) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (case_sensitive == UNPROVIDED) {
            case_sensitive = T;
        }
        if (test == UNPROVIDED) {
            test = EQL;
        }
        {
            SubLObject trie = create_trie(unique, name, case_sensitive, test);
            _csetf_trie_top_node(trie, $ERROR);
            _csetf_trie_multi(trie, T);
            _csetf_trie_multi_key_func(trie, multi_key_func);
            _csetf_trie_multi_keys(trie, NIL);
            return trie;
        }
    }

    @LispMethod(comment = "Return a new MULTI-TRIE datastructure")
    public static SubLObject create_multi_trie(final SubLObject unique, final SubLObject multi_key_func, SubLObject name, SubLObject case_sensitive, SubLObject test) {
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (case_sensitive == UNPROVIDED) {
            case_sensitive = T;
        }
        if (test == UNPROVIDED) {
            test = EQL;
        }
        final SubLObject trie = create_trie(unique, name, case_sensitive, test);
        _csetf_trie_top_node(trie, $ERROR);
        _csetf_trie_multi(trie, T);
        _csetf_trie_multi_key_func(trie, multi_key_func);
        _csetf_trie_multi_keys(trie, NIL);
        return trie;
    }/**
     * Return a new MULTI-TRIE datastructure
     */


    public static final SubLObject multi_trie_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != trie_p(v_object)) && (NIL != trie_multi(v_object)));
    }

    public static SubLObject multi_trie_p(final SubLObject v_object) {
        return makeBoolean((NIL != trie_p(v_object)) && (NIL != trie_multi(v_object)));
    }

    public static final SubLObject clear_multi_trie_alt(SubLObject trie, SubLObject clear_keys) {
        if (clear_keys == UNPROVIDED) {
            clear_keys = NIL;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        _csetf_trie_top_node(trie, $ERROR);
        if (NIL != clear_keys) {
            _csetf_trie_multi_keys(trie, NIL);
        } else {
            {
                SubLObject cdolist_list_var = trie_multi_keys(trie);
                SubLObject info = NIL;
                for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                    {
                        SubLObject datum = info;
                        SubLObject current = datum;
                        SubLObject key = NIL;
                        SubLObject subtrie = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt70);
                        key = current.first();
                        current = current.rest();
                        subtrie = current;
                        clear_trie(subtrie);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject clear_multi_trie(final SubLObject trie, SubLObject clear_keys) {
        if (clear_keys == UNPROVIDED) {
            clear_keys = NIL;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        _csetf_trie_top_node(trie, $ERROR);
        if (NIL != clear_keys) {
            _csetf_trie_multi_keys(trie, NIL);
        } else {
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            info = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = info;
                SubLObject key = NIL;
                SubLObject subtrie = NIL;
                destructuring_bind_must_consp(current, datum, $list76);
                key = current.first();
                current = subtrie = current.rest();
                clear_trie(subtrie);
                cdolist_list_var = cdolist_list_var.rest();
                info = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject add_multi_trie_key_alt(SubLObject trie, SubLObject mark) {
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject unique = trie_unique(trie);
            SubLObject name = trie_name(trie);
            SubLObject case_sensitive = trie_case_sensitive(trie);
            SubLObject test = trie_entry_test_func(trie);
            SubLObject sub_name = format(NIL, $str_alt71$_A__A, name, mark);
            SubLObject sub_trie = create_trie(unique, sub_name, case_sensitive, test);
            _csetf_trie_multi_keys(trie, cons(cons(mark, sub_trie), trie_multi_keys(trie)));
        }
        return mark;
    }

    public static SubLObject add_multi_trie_key(final SubLObject trie, final SubLObject mark) {
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        final SubLObject unique = trie_unique(trie);
        final SubLObject name = trie_name(trie);
        final SubLObject case_sensitive = trie_case_sensitive(trie);
        final SubLObject test = trie_entry_test_func(trie);
        final SubLObject sub_name = format(NIL, $str77$_A__A, name, mark);
        final SubLObject sub_trie = create_trie(unique, sub_name, case_sensitive, test);
        _csetf_trie_multi_keys(trie, cons(cons(mark, sub_trie), trie_multi_keys(trie)));
        return mark;
    }

    public static final SubLObject rem_multi_trie_key_alt(SubLObject trie, SubLObject mark) {
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        _csetf_trie_multi_keys(trie, delete(mark, trie_multi_keys(trie), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return mark;
    }

    public static SubLObject rem_multi_trie_key(final SubLObject trie, final SubLObject mark) {
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        _csetf_trie_multi_keys(trie, delete(mark, trie_multi_keys(trie), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return mark;
    }

    /**
     * Return T iff MULTI-TRIE is empty
     */
    @LispMethod(comment = "Return T iff MULTI-TRIE is empty")
    public static final SubLObject multi_trie_emptyP_alt(SubLObject trie) {
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject some_non_empty = NIL;
            if (NIL == some_non_empty) {
                {
                    SubLObject csome_list_var = trie_multi_keys(trie);
                    SubLObject info = NIL;
                    for (info = csome_list_var.first(); !((NIL != some_non_empty) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , info = csome_list_var.first()) {
                        {
                            SubLObject datum = info;
                            SubLObject current = datum;
                            SubLObject mark = NIL;
                            SubLObject subtrie = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt73);
                            mark = current.first();
                            current = current.rest();
                            subtrie = current;
                            some_non_empty = makeBoolean(NIL == trie_emptyP(subtrie));
                        }
                    }
                }
            }
            return makeBoolean(NIL == some_non_empty);
        }
    }

    @LispMethod(comment = "Return T iff MULTI-TRIE is empty")
    public static SubLObject multi_trie_emptyP(final SubLObject trie) {
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        SubLObject some_non_empty = NIL;
        if (NIL == some_non_empty) {
            SubLObject csome_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            info = csome_list_var.first();
            while ((NIL == some_non_empty) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = info;
                SubLObject mark = NIL;
                SubLObject subtrie = NIL;
                destructuring_bind_must_consp(current, datum, $list79);
                mark = current.first();
                current = subtrie = current.rest();
                some_non_empty = makeBoolean(NIL == trie_emptyP(subtrie));
                csome_list_var = csome_list_var.rest();
                info = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == some_non_empty);
    }/**
     * Return T iff MULTI-TRIE is empty
     */


    /**
     * Return the number of data items stored in MULTI-TRIE
     */
    @LispMethod(comment = "Return the number of data items stored in MULTI-TRIE")
    public static final SubLObject multi_trie_count_alt(SubLObject trie) {
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject total_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject mark = NIL;
                    SubLObject subtrie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    mark = current.first();
                    current = current.rest();
                    subtrie = current;
                    total_count = add(total_count, trie_count(subtrie));
                }
            }
            return total_count;
        }
    }

    @LispMethod(comment = "Return the number of data items stored in MULTI-TRIE")
    public static SubLObject multi_trie_count(final SubLObject trie) {
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        SubLObject total_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = NIL;
            SubLObject subtrie = NIL;
            destructuring_bind_must_consp(current, datum, $list79);
            mark = current.first();
            current = subtrie = current.rest();
            total_count = add(total_count, trie_count(subtrie));
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return total_count;
    }/**
     * Return the number of data items stored in MULTI-TRIE
     */


    /**
     * Show the contents of MULTI-TRIE to STREAM
     */
    @LispMethod(comment = "Show the contents of MULTI-TRIE to STREAM")
    public static final SubLObject show_multi_trie_alt(SubLObject trie, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        format(stream, $str_alt74$___S_sub_tries, length(trie_multi_keys(trie)));
        {
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject mark = NIL;
                    SubLObject subtrie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    mark = current.first();
                    current = current.rest();
                    subtrie = current;
                    format(stream, $str_alt75$____Sub_Trie__S, mark);
                    show_trie(subtrie, stream);
                }
            }
        }
        return trie;
    }

    @LispMethod(comment = "Show the contents of MULTI-TRIE to STREAM")
    public static SubLObject show_multi_trie(final SubLObject trie, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        format(stream, $str80$___S_sub_tries, length(trie_multi_keys(trie)));
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = NIL;
            SubLObject subtrie = NIL;
            destructuring_bind_must_consp(current, datum, $list79);
            mark = current.first();
            current = subtrie = current.rest();
            format(stream, $str81$____Sub_Trie__S, mark);
            show_trie(subtrie, stream);
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return trie;
    }/**
     * Show the contents of MULTI-TRIE to STREAM
     */


    public static final SubLObject multi_trie_insert_alt(SubLObject trie, SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == UNPROVIDED) {
            v_object = string;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject key_func = trie_multi_key_func(trie);
            SubLObject mark = funcall(key_func, v_object);
            SubLObject subtrie = assoc(mark, trie_multi_keys(trie), UNPROVIDED, UNPROVIDED).rest();
            if (NIL != trie_p(subtrie)) {
                trie_insert(subtrie, string, v_object, start, end);
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject multi_trie_insert(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == UNPROVIDED) {
            v_object = string;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        final SubLObject key_func = trie_multi_key_func(trie);
        final SubLObject mark = funcall(key_func, v_object);
        final SubLObject subtrie = assoc(mark, trie_multi_keys(trie), UNPROVIDED, UNPROVIDED).rest();
        if (NIL != trie_p(subtrie)) {
            trie_insert(subtrie, string, v_object, start, end);
            return T;
        }
        return NIL;
    }

    public static final SubLObject multi_trie_remove_alt(SubLObject trie, SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == UNPROVIDED) {
            v_object = string;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject key_func = trie_multi_key_func(trie);
            SubLObject mark = funcall(key_func, v_object);
            SubLObject subtrie = assoc(mark, trie_multi_keys(trie), UNPROVIDED, UNPROVIDED).rest();
            if (NIL != trie_p(subtrie)) {
                trie_remove(subtrie, string, v_object, start, end);
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject multi_trie_remove(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end) {
        if (v_object == UNPROVIDED) {
            v_object = string;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        final SubLObject key_func = trie_multi_key_func(trie);
        final SubLObject mark = funcall(key_func, v_object);
        final SubLObject subtrie = assoc(mark, trie_multi_keys(trie), UNPROVIDED, UNPROVIDED).rest();
        if (NIL != trie_p(subtrie)) {
            trie_remove(subtrie, string, v_object, start, end);
            return T;
        }
        return NIL;
    }

    public static final SubLObject multi_trie_remove_all_alt(SubLObject trie, SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject mark = NIL;
                    SubLObject subtrie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    mark = current.first();
                    current = current.rest();
                    subtrie = current;
                    total = add(total, trie_remove_all(subtrie, string, start, end));
                }
            }
            return total;
        }
    }

    public static SubLObject multi_trie_remove_all(final SubLObject trie, final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = NIL;
            SubLObject subtrie = NIL;
            destructuring_bind_must_consp(current, datum, $list79);
            mark = current.first();
            current = subtrie = current.rest();
            total = add(total, trie_remove_all(subtrie, string, start, end));
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return total;
    }

    public static final SubLObject multi_trie_exact_alt(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject relevant_marks, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject mark = NIL;
                    SubLObject subtrie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    mark = current.first();
                    current = current.rest();
                    subtrie = current;
                    if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                        {
                            SubLObject sub_ans = trie_exact(subtrie, string, case_sensitiveP, start, end);
                            if (NIL != sub_ans) {
                                ans = cons(sub_ans, ans);
                            }
                        }
                    }
                }
            }
            return nreverse(ans);
        }
    }

    public static SubLObject multi_trie_exact(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject relevant_marks, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = NIL;
            SubLObject subtrie = NIL;
            destructuring_bind_must_consp(current, datum, $list79);
            mark = current.first();
            current = subtrie = current.rest();
            if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                final SubLObject sub_ans = trie_exact(subtrie, string, case_sensitiveP, start, end);
                if (NIL != sub_ans) {
                    ans = cons(sub_ans, ans);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static final SubLObject multi_trie_prefix_alt(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject relevant_marks, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (exact_lengthP == UNPROVIDED) {
            exact_lengthP = NIL;
        }
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject mark = NIL;
                    SubLObject subtrie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    mark = current.first();
                    current = current.rest();
                    subtrie = current;
                    if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                        {
                            SubLObject sub_ans = trie_prefix(subtrie, string, case_sensitiveP, exact_lengthP, start, end);
                            ans = append(sub_ans, ans);
                        }
                    }
                }
            }
            return nreverse(ans);
        }
    }

    public static SubLObject multi_trie_prefix(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject relevant_marks, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (exact_lengthP == UNPROVIDED) {
            exact_lengthP = NIL;
        }
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = NIL;
            SubLObject subtrie = NIL;
            destructuring_bind_must_consp(current, datum, $list79);
            mark = current.first();
            current = subtrie = current.rest();
            if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                final SubLObject sub_ans = trie_prefix(subtrie, string, case_sensitiveP, exact_lengthP, start, end);
                ans = append(sub_ans, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static final SubLObject multi_trie_search_alt(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject relevant_marks, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject mark = NIL;
                    SubLObject subtrie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    mark = current.first();
                    current = current.rest();
                    subtrie = current;
                    if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                        {
                            SubLObject sub_ans = trie_search(subtrie, string, case_sensitiveP, start, end);
                            ans = append(sub_ans, ans);
                        }
                    }
                }
            }
            return nreverse(ans);
        }
    }

    public static SubLObject multi_trie_search(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject relevant_marks, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = NIL;
            SubLObject subtrie = NIL;
            destructuring_bind_must_consp(current, datum, $list79);
            mark = current.first();
            current = subtrie = current.rest();
            if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                final SubLObject sub_ans = trie_search(subtrie, string, case_sensitiveP, start, end);
                ans = append(sub_ans, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    /**
     * Call FUNCTION on each item with relevant marks in multi-trie TRIE
     */
    @LispMethod(comment = "Call FUNCTION on each item with relevant marks in multi-trie TRIE")
    public static final SubLObject map_multi_trie_data_alt(SubLObject function, SubLObject trie, SubLObject relevant_marks) {
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject mark = NIL;
                    SubLObject subtrie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    mark = current.first();
                    current = current.rest();
                    subtrie = current;
                    if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                        map_trie_data(function, subtrie);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Call FUNCTION on each item with relevant marks in multi-trie TRIE")
    public static SubLObject map_multi_trie_data(final SubLObject function, final SubLObject trie, SubLObject relevant_marks) {
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = NIL;
            SubLObject subtrie = NIL;
            destructuring_bind_must_consp(current, datum, $list79);
            mark = current.first();
            current = subtrie = current.rest();
            if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                map_trie_data(function, subtrie);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Call FUNCTION on each item with relevant marks in multi-trie TRIE
     */


    /**
     * Call FUNCTION on each item with MARK in multi-trie TRIE
     */
    @LispMethod(comment = "Call FUNCTION on each item with MARK in multi-trie TRIE")
    public static final SubLObject map_multi_trie_data_mark_alt(SubLObject function, SubLObject trie, SubLObject mark) {
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject subtrie = assoc(mark, trie_multi_keys(trie), UNPROVIDED, UNPROVIDED).rest();
            if (NIL != trie_p(subtrie)) {
                map_trie_data(function, subtrie);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Call FUNCTION on each item with MARK in multi-trie TRIE")
    public static SubLObject map_multi_trie_data_mark(final SubLObject function, final SubLObject trie, final SubLObject mark) {
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        final SubLObject subtrie = assoc(mark, trie_multi_keys(trie), UNPROVIDED, UNPROVIDED).rest();
        if (NIL != trie_p(subtrie)) {
            map_trie_data(function, subtrie);
        }
        return NIL;
    }/**
     * Call FUNCTION on each item with MARK in multi-trie TRIE
     */


    public static final SubLObject map_multi_trie_data_direction_alt(SubLObject function, SubLObject trie, SubLObject string, SubLObject relevant_marks, SubLObject start, SubLObject end, SubLObject v_forward) {
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject cdolist_list_var = trie_multi_keys(trie);
            SubLObject info = NIL;
            for (info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , info = cdolist_list_var.first()) {
                {
                    SubLObject datum = info;
                    SubLObject current = datum;
                    SubLObject mark = NIL;
                    SubLObject subtrie = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    mark = current.first();
                    current = current.rest();
                    subtrie = current;
                    if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                        map_trie_data_direction(function, subtrie, string, start, end, v_forward);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject map_multi_trie_data_direction(final SubLObject function, final SubLObject trie, final SubLObject string, SubLObject relevant_marks, SubLObject start, SubLObject end, SubLObject v_forward) {
        if (relevant_marks == UNPROVIDED) {
            relevant_marks = $ALL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        SubLObject cdolist_list_var = trie_multi_keys(trie);
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = info;
            SubLObject mark = NIL;
            SubLObject subtrie = NIL;
            destructuring_bind_must_consp(current, datum, $list79);
            mark = current.first();
            current = subtrie = current.rest();
            if ((relevant_marks == $ALL) || (NIL != member(mark, relevant_marks, UNPROVIDED, UNPROVIDED))) {
                map_trie_data_direction(function, subtrie, string, start, end, v_forward);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject map_multi_trie_data_direction_mark_alt(SubLObject function, SubLObject trie, SubLObject string, SubLObject mark, SubLObject start, SubLObject end, SubLObject v_forward) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        SubLTrampolineFile.checkType(trie, MULTI_TRIE_P);
        {
            SubLObject subtrie = assoc(mark, trie_multi_keys(trie), UNPROVIDED, UNPROVIDED).rest();
            if (NIL != trie_p(subtrie)) {
                map_trie_data_direction(function, subtrie, string, start, end, v_forward);
            }
        }
        return NIL;
    }

    public static SubLObject map_multi_trie_data_direction_mark(final SubLObject function, final SubLObject trie, final SubLObject string, final SubLObject mark, SubLObject start, SubLObject end, SubLObject v_forward) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        assert NIL != multi_trie_p(trie) : "! tries.multi_trie_p(trie) " + ("tries.multi_trie_p(trie) " + "CommonSymbols.NIL != tries.multi_trie_p(trie) ") + trie;
        final SubLObject subtrie = assoc(mark, trie_multi_keys(trie), UNPROVIDED, UNPROVIDED).rest();
        if (NIL != trie_p(subtrie)) {
            map_trie_data_direction(function, subtrie, string, start, end, v_forward);
        }
        return NIL;
    }

    public static final SubLObject trie_relevant_ancestor_pathP_alt(SubLObject trie) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == trie_multi(trie)) {
                return T;
            } else {
                if (NIL == $trie_relevant_marks$.getDynamicValue(thread)) {
                    return NIL;
                } else {
                    if ($trie_relevant_marks$.getDynamicValue(thread).isAtom()) {
                        return T;
                    } else {
                        {
                            SubLObject some_mark_not_on_any_ancestor = NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject ancestor_vector = trie_ancestor_path();
                                SubLObject ancestor_end_index = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL == some_mark_not_on_any_ancestor) {
                                    {
                                        SubLObject csome_list_var = $trie_relevant_marks$.getDynamicValue(thread);
                                        SubLObject mark = NIL;
                                        for (mark = csome_list_var.first(); !((NIL != some_mark_not_on_any_ancestor) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mark = csome_list_var.first()) {
                                            {
                                                SubLObject mark_on_ancestor = NIL;
                                                SubLObject catch_var = NIL;
                                                try {
                                                    {
                                                        SubLObject index = NIL;
                                                        for (index = ZERO_INTEGER; index.numL(ancestor_end_index); index = add(index, ONE_INTEGER)) {
                                                            {
                                                                SubLObject ancestor = aref(ancestor_vector, index);
                                                                if (NIL != (NIL != trie_leaf_node_p(ancestor) ? ((SubLObject) (trie_leaf_has_implicit_mark(trie, ancestor, mark))) : trie_node_has_mark(ancestor, mark))) {
                                                                    mark_on_ancestor = T;
                                                                    mapping_finished();
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable ccatch_env_var) {
                                                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                                                }
                                                if (NIL == mark_on_ancestor) {
                                                    some_mark_not_on_any_ancestor = T;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return some_mark_not_on_any_ancestor;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject trie_relevant_ancestor_pathP(final SubLObject trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == trie_multi(trie)) {
            return T;
        }
        if (NIL == $trie_relevant_marks$.getDynamicValue(thread)) {
            return NIL;
        }
        if ($trie_relevant_marks$.getDynamicValue(thread).isAtom()) {
            return T;
        }
        SubLObject some_mark_not_on_any_ancestor = NIL;
        thread.resetMultipleValues();
        final SubLObject ancestor_vector = trie_ancestor_path();
        final SubLObject ancestor_end_index = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == some_mark_not_on_any_ancestor) {
            SubLObject csome_list_var = $trie_relevant_marks$.getDynamicValue(thread);
            SubLObject mark = NIL;
            mark = csome_list_var.first();
            while ((NIL == some_mark_not_on_any_ancestor) && (NIL != csome_list_var)) {
                SubLObject mark_on_ancestor = NIL;
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($MAPPING_DONE);
                    SubLObject index;
                    SubLObject ancestor;
                    for (index = NIL, index = ZERO_INTEGER; index.numL(ancestor_end_index); index = add(index, ONE_INTEGER)) {
                        ancestor = aref(ancestor_vector, index);
                        if (NIL != (NIL != trie_leaf_node_p(ancestor) ? trie_leaf_has_implicit_mark(trie, ancestor, mark) : trie_node_has_mark(ancestor, mark))) {
                            mark_on_ancestor = T;
                            mapping_finished();
                        }
                    }
                } catch (final Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL == mark_on_ancestor) {
                    some_mark_not_on_any_ancestor = T;
                }
                csome_list_var = csome_list_var.rest();
                mark = csome_list_var.first();
            } 
        }
        return some_mark_not_on_any_ancestor;
    }

    public static final SubLObject trie_relevant_object_alt(SubLObject trie, SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == trie_multi(trie)) {
                return T;
            } else {
                if (NIL == $trie_relevant_marks$.getDynamicValue(thread)) {
                    return NIL;
                } else {
                    if ($trie_relevant_marks$.getDynamicValue(thread).isAtom()) {
                        return T;
                    } else {
                        {
                            SubLObject object_mark = funcall(trie_multi_key_func(trie), v_object);
                            return member(object_mark, $trie_relevant_marks$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject trie_relevant_object(final SubLObject trie, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == trie_multi(trie)) {
            return T;
        }
        if (NIL == $trie_relevant_marks$.getDynamicValue(thread)) {
            return NIL;
        }
        if ($trie_relevant_marks$.getDynamicValue(thread).isAtom()) {
            return T;
        }
        final SubLObject object_mark = funcall(trie_multi_key_func(trie), v_object);
        return member(object_mark, $trie_relevant_marks$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject trie_relevant_objects_alt(SubLObject trie, SubLObject objects) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = NIL;
            for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                if (NIL != trie_relevant_object(trie, v_object)) {
                    ans = cons(v_object, ans);
                }
            }
            return ans;
        }
    }

    public static SubLObject trie_relevant_objects(final SubLObject trie, final SubLObject objects) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != trie_relevant_object(trie, v_object)) {
                ans = cons(v_object, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        } 
        return ans;
    }

    /**
     * Remove MARK from the set of marks being managed in TRIE
     */
    @LispMethod(comment = "Remove MARK from the set of marks being managed in TRIE")
    public static final SubLObject add_trie_mark_alt(SubLObject trie, SubLObject mark) {
        SubLTrampolineFile.checkType(trie, TRIE_P);
        if (NIL != trie_multi(trie)) {
            {
                SubLObject marks = trie_multi_keys(trie);
                if (NIL == find(mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    _csetf_trie_multi_keys(trie, cons(mark, marks));
                    add_trie_node_mark(trie_top_node(trie), mark);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Remove MARK from the set of marks being managed in TRIE")
    public static SubLObject add_trie_mark(final SubLObject trie, final SubLObject mark) {
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        if (NIL != trie_multi(trie)) {
            final SubLObject marks = trie_multi_keys(trie);
            if (NIL == find(mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                _csetf_trie_multi_keys(trie, cons(mark, marks));
                add_trie_node_mark(trie_top_node(trie), mark);
            }
        }
        return NIL;
    }/**
     * Remove MARK from the set of marks being managed in TRIE
     */


    /**
     * Remove MARK from the set of marks being managed in TRIE
     */
    @LispMethod(comment = "Remove MARK from the set of marks being managed in TRIE")
    public static final SubLObject rem_trie_mark_alt(SubLObject trie, SubLObject mark) {
        SubLTrampolineFile.checkType(trie, TRIE_P);
        if (NIL != trie_multi(trie)) {
            {
                SubLObject marks = trie_multi_keys(trie);
                if (NIL != find(mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    _csetf_trie_multi_keys(trie, delete_first(mark, marks, UNPROVIDED));
                    rem_trie_node_mark(trie_top_node(trie), mark);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Remove MARK from the set of marks being managed in TRIE")
    public static SubLObject rem_trie_mark(final SubLObject trie, final SubLObject mark) {
        assert NIL != trie_p(trie) : "! tries.trie_p(trie) " + ("tries.trie_p(trie) " + "CommonSymbols.NIL != tries.trie_p(trie) ") + trie;
        if (NIL != trie_multi(trie)) {
            final SubLObject marks = trie_multi_keys(trie);
            if (NIL != find(mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                _csetf_trie_multi_keys(trie, list_utilities.delete_first(mark, marks, UNPROVIDED));
                rem_trie_node_mark(trie_top_node(trie), mark);
            }
        }
        return NIL;
    }/**
     * Remove MARK from the set of marks being managed in TRIE
     */


    /**
     * Return the explicit marks at NODE
     */
    @LispMethod(comment = "Return the explicit marks at NODE")
    public static final SubLObject trie_node_marks_alt(SubLObject node) {
        {
            SubLObject car = node.first();
            if (car.isCons()) {
                return car.rest();
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Return the explicit marks at NODE")
    public static SubLObject trie_node_marks(final SubLObject node) {
        final SubLObject car = node.first();
        if (car.isCons()) {
            return car.rest();
        }
        return NIL;
    }/**
     * Return the explicit marks at NODE
     */


    /**
     * Return T iff MARK is one of NODE's explicit marks
     */
    @LispMethod(comment = "Return T iff MARK is one of NODE\'s explicit marks")
    public static final SubLObject trie_node_has_mark_alt(SubLObject node, SubLObject mark) {
        return find(mark, trie_node_marks(node), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Return T iff MARK is one of NODE\'s explicit marks")
    public static SubLObject trie_node_has_mark(final SubLObject node, final SubLObject mark) {
        return find(mark, trie_node_marks(node), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Return T iff MARK is one of NODE's explicit marks
     */


    /**
     * Set the explicit marks for NODE to MARKS
     */
    @LispMethod(comment = "Set the explicit marks for NODE to MARKS")
    public static final SubLObject set_trie_node_marks_alt(SubLObject node, SubLObject marks) {
        {
            SubLObject key = trie_node_key(node);
            if (key != $END) {
                if (NIL == marks) {
                    rplaca(node, key);
                } else {
                    {
                        SubLObject car = node.first();
                        if (car.isCons()) {
                            rplacd(car, marks);
                        } else {
                            rplaca(node, cons(key, marks));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Set the explicit marks for NODE to MARKS")
    public static SubLObject set_trie_node_marks(final SubLObject node, final SubLObject marks) {
        final SubLObject key = trie_node_key(node);
        if (key != $END) {
            if (NIL == marks) {
                rplaca(node, key);
            } else {
                final SubLObject car = node.first();
                if (car.isCons()) {
                    rplacd(car, marks);
                } else {
                    rplaca(node, cons(key, marks));
                }
            }
        }
        return NIL;
    }/**
     * Set the explicit marks for NODE to MARKS
     */


    public static final SubLObject trie_leaf_has_implicit_mark_alt(SubLObject trie, SubLObject leaf_node, SubLObject mark) {
        {
            SubLObject data = trie_node_data(leaf_node);
            SubLObject mark_func = trie_multi_key_func(trie);
            if (NIL != trie_unique(trie)) {
                return makeBoolean(mark != funcall(mark_func, data));
            } else {
                {
                    SubLObject cdolist_list_var = data;
                    SubLObject datum = NIL;
                    for (datum = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datum = cdolist_list_var.first()) {
                        if (mark == funcall(mark_func, datum)) {
                            return NIL;
                        }
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject trie_leaf_has_implicit_mark(final SubLObject trie, final SubLObject leaf_node, final SubLObject mark) {
        final SubLObject data = trie_node_data(leaf_node);
        final SubLObject mark_func = trie_multi_key_func(trie);
        if (NIL != trie_unique(trie)) {
            return makeBoolean(!mark.eql(funcall(mark_func, data)));
        }
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (mark.eql(funcall(mark_func, datum))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return T;
    }

    /**
     * Add MARK to the explicit marks for NODE
     */
    @LispMethod(comment = "Add MARK to the explicit marks for NODE")
    public static final SubLObject add_trie_node_mark_alt(SubLObject node, SubLObject mark) {
        if (NIL == trie_leaf_node_p(node)) {
            {
                SubLObject marks = trie_node_marks(node);
                if (NIL == find(mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    set_trie_node_marks(node, cons(mark, marks));
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Add MARK to the explicit marks for NODE")
    public static SubLObject add_trie_node_mark(final SubLObject node, final SubLObject mark) {
        if (NIL == trie_leaf_node_p(node)) {
            final SubLObject marks = trie_node_marks(node);
            if (NIL == find(mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                set_trie_node_marks(node, cons(mark, marks));
            }
        }
        return NIL;
    }/**
     * Add MARK to the explicit marks for NODE
     */


    /**
     * Remove MARK from the explicit marks for NODE
     */
    @LispMethod(comment = "Remove MARK from the explicit marks for NODE")
    public static final SubLObject rem_trie_node_mark_alt(SubLObject node, SubLObject mark) {
        if (NIL == trie_leaf_node_p(node)) {
            {
                SubLObject marks = trie_node_marks(node);
                if (NIL != find(mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    set_trie_node_marks(node, delete_first(mark, marks, UNPROVIDED));
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Remove MARK from the explicit marks for NODE")
    public static SubLObject rem_trie_node_mark(final SubLObject node, final SubLObject mark) {
        if (NIL == trie_leaf_node_p(node)) {
            final SubLObject marks = trie_node_marks(node);
            if (NIL != find(mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                set_trie_node_marks(node, list_utilities.delete_first(mark, marks, UNPROVIDED));
            }
        }
        return NIL;
    }/**
     * Remove MARK from the explicit marks for NODE
     */


    public static final SubLObject trie_node_mark_present_recursive_alt(SubLObject trie, SubLObject ancestor_index, SubLObject ancestor_vector, SubLObject mark) {
        {
            SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
            ancestor_index = next_generation(ancestor_index);
            if (NIL != trie_node_has_mark(node, mark)) {
                return rem_trie_node_mark(node, mark);
            } else {
                {
                    SubLObject parent = parent_ancestor(ancestor_vector, ancestor_index);
                    SubLObject siblings = trie_node_subnodes(parent);
                    SubLObject cdolist_list_var = siblings;
                    SubLObject sibling = NIL;
                    for (sibling = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling = cdolist_list_var.first()) {
                        if (node != sibling) {
                            if (NIL == trie_leaf_node_p(sibling)) {
                                add_trie_node_mark(sibling, mark);
                            }
                        }
                    }
                    return trie_node_mark_present_recursive(trie, ancestor_index, ancestor_vector, mark);
                }
            }
        }
    }

    public static SubLObject trie_node_mark_present_recursive(final SubLObject trie, SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
        ancestor_index = next_generation(ancestor_index);
        if (NIL != trie_node_has_mark(node, mark)) {
            return rem_trie_node_mark(node, mark);
        }
        final SubLObject parent = parent_ancestor(ancestor_vector, ancestor_index);
        SubLObject cdolist_list_var;
        final SubLObject siblings = cdolist_list_var = trie_node_subnodes(parent);
        SubLObject sibling = NIL;
        sibling = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!node.eql(sibling)) && (NIL == trie_leaf_node_p(sibling))) {
                add_trie_node_mark(sibling, mark);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling = cdolist_list_var.first();
        } 
        return trie_node_mark_present_recursive(trie, ancestor_index, ancestor_vector, mark);
    }

    public static final SubLObject trie_node_mark_not_present_recursive_alt(SubLObject trie, SubLObject ancestor_index, SubLObject ancestor_vector, SubLObject mark) {
        {
            SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
            ancestor_index = next_generation(ancestor_index);
            if (NIL != no_more_ancestors(ancestor_index)) {
                return add_trie_node_mark(node, mark);
            } else {
                {
                    SubLObject parent = parent_ancestor(ancestor_vector, ancestor_index);
                    SubLObject siblings = trie_node_subnodes(parent);
                    {
                        SubLObject cdolist_list_var = siblings;
                        SubLObject sibling = NIL;
                        for (sibling = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling = cdolist_list_var.first()) {
                            if (node != sibling) {
                                if (NIL != trie_leaf_node_p(sibling)) {
                                    if (NIL == trie_leaf_has_implicit_mark(trie, sibling, mark)) {
                                        return add_trie_node_mark(node, mark);
                                    }
                                } else {
                                    if (NIL == trie_node_has_mark(sibling, mark)) {
                                        return add_trie_node_mark(node, mark);
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = siblings;
                        SubLObject sibling = NIL;
                        for (sibling = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling = cdolist_list_var.first()) {
                            if (node != sibling) {
                                if (NIL == trie_leaf_node_p(sibling)) {
                                    rem_trie_node_mark(sibling, mark);
                                }
                            }
                        }
                    }
                    return trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
                }
            }
        }
    }

    public static SubLObject trie_node_mark_not_present_recursive(final SubLObject trie, SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
        ancestor_index = next_generation(ancestor_index);
        if (NIL != no_more_ancestors(ancestor_index)) {
            return add_trie_node_mark(node, mark);
        }
        final SubLObject parent = parent_ancestor(ancestor_vector, ancestor_index);
        SubLObject cdolist_list_var;
        final SubLObject siblings = cdolist_list_var = trie_node_subnodes(parent);
        SubLObject sibling = NIL;
        sibling = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!node.eql(sibling)) {
                if (NIL != trie_leaf_node_p(sibling)) {
                    if (NIL == trie_leaf_has_implicit_mark(trie, sibling, mark)) {
                        return add_trie_node_mark(node, mark);
                    }
                } else
                    if (NIL == trie_node_has_mark(sibling, mark)) {
                        return add_trie_node_mark(node, mark);
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling = cdolist_list_var.first();
        } 
        cdolist_list_var = siblings;
        sibling = NIL;
        sibling = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!node.eql(sibling)) && (NIL == trie_leaf_node_p(sibling))) {
                rem_trie_node_mark(sibling, mark);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling = cdolist_list_var.first();
        } 
        return trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
    }

    public static final SubLObject multi_trie_existing_insert_mark_alt(SubLObject trie, SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != trie_multi(trie)) {
                thread.resetMultipleValues();
                {
                    SubLObject ancestor_vector = trie_ancestor_path();
                    SubLObject ancestor_index = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject object_mark = funcall(trie_multi_key_func(trie), v_object);
                        SubLObject trie_marks = trie_multi_keys(trie);
                        SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
                        SubLTrampolineFile.checkType(node, TRIE_LEAF_NODE_P);
                        {
                            SubLObject cdolist_list_var = trie_marks;
                            SubLObject mark = NIL;
                            for (mark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mark = cdolist_list_var.first()) {
                                if (mark == object_mark) {
                                    multi_trie_existing_insert_mark_present(trie, ancestor_index, ancestor_vector, mark);
                                } else {
                                    multi_trie_existing_insert_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject multi_trie_existing_insert_mark(final SubLObject trie, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != trie_multi(trie)) {
            thread.resetMultipleValues();
            final SubLObject ancestor_vector = trie_ancestor_path();
            final SubLObject ancestor_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject object_mark = funcall(trie_multi_key_func(trie), v_object);
            final SubLObject trie_marks = trie_multi_keys(trie);
            final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
            assert NIL != trie_leaf_node_p(node) : "! tries.trie_leaf_node_p(node) " + ("tries.trie_leaf_node_p(node) " + "CommonSymbols.NIL != tries.trie_leaf_node_p(node) ") + node;
            SubLObject cdolist_list_var = trie_marks;
            SubLObject mark = NIL;
            mark = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (mark.eql(object_mark)) {
                    multi_trie_existing_insert_mark_present(trie, ancestor_index, ancestor_vector, mark);
                } else {
                    multi_trie_existing_insert_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Note that mark is present as a result of an insert at existing node in trie
     */
    @LispMethod(comment = "Note that mark is present as a result of an insert at existing node in trie")
    public static final SubLObject multi_trie_existing_insert_mark_present_alt(SubLObject trie, SubLObject ancestor_index, SubLObject ancestor_vector, SubLObject mark) {
        {
            SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
            if (NIL != some_ancestor_marked) {
                trie_node_mark_present_recursive(trie, ancestor_index, ancestor_vector, mark);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Note that mark is present as a result of an insert at existing node in trie")
    public static SubLObject multi_trie_existing_insert_mark_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (NIL != some_ancestor_marked) {
            trie_node_mark_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        }
        return NIL;
    }/**
     * Note that mark is present as a result of an insert at existing node in trie
     */


    /**
     * Note that mark is NOT present as a result of an insert at existing node in trie
     */
    @LispMethod(comment = "Note that mark is NOT present as a result of an insert at existing node in trie")
    public static final SubLObject multi_trie_existing_insert_mark_not_present_alt(SubLObject trie, SubLObject ancestor_index, SubLObject ancestor_vector, SubLObject mark) {
        {
            SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
            if (NIL != some_ancestor_marked) {
                return NIL;
            }
            {
                SubLObject leaf_node = first_ancestor(ancestor_vector, ancestor_index);
                if (NIL == trie_leaf_has_implicit_mark(trie, leaf_node, mark)) {
                    return NIL;
                }
            }
            trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
            return NIL;
        }
    }

    @LispMethod(comment = "Note that mark is NOT present as a result of an insert at existing node in trie")
    public static SubLObject multi_trie_existing_insert_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (NIL != some_ancestor_marked) {
            return NIL;
        }
        final SubLObject leaf_node = first_ancestor(ancestor_vector, ancestor_index);
        if (NIL == trie_leaf_has_implicit_mark(trie, leaf_node, mark)) {
            return NIL;
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return NIL;
    }/**
     * Note that mark is NOT present as a result of an insert at existing node in trie
     */


    public static final SubLObject multi_trie_new_insert_mark_alt(SubLObject trie, SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != trie_multi(trie)) {
                thread.resetMultipleValues();
                {
                    SubLObject ancestor_vector = trie_ancestor_path();
                    SubLObject ancestor_index = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject object_mark = funcall(trie_multi_key_func(trie), v_object);
                        SubLObject trie_marks = trie_multi_keys(trie);
                        SubLObject cdolist_list_var = trie_marks;
                        SubLObject mark = NIL;
                        for (mark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mark = cdolist_list_var.first()) {
                            if (mark == object_mark) {
                                multi_trie_new_insert_mark_present(trie, ancestor_index, ancestor_vector, mark);
                            } else {
                                multi_trie_new_insert_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject multi_trie_new_insert_mark(final SubLObject trie, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != trie_multi(trie)) {
            thread.resetMultipleValues();
            final SubLObject ancestor_vector = trie_ancestor_path();
            final SubLObject ancestor_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject object_mark = funcall(trie_multi_key_func(trie), v_object);
            SubLObject cdolist_list_var;
            final SubLObject trie_marks = cdolist_list_var = trie_multi_keys(trie);
            SubLObject mark = NIL;
            mark = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (mark.eql(object_mark)) {
                    multi_trie_new_insert_mark_present(trie, ancestor_index, ancestor_vector, mark);
                } else {
                    multi_trie_new_insert_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Note that mark will be present as a result of an insert below current parent node in trie
     */
    @LispMethod(comment = "Note that mark will be present as a result of an insert below current parent node in trie")
    public static final SubLObject multi_trie_new_insert_mark_present_alt(SubLObject trie, SubLObject ancestor_index, SubLObject ancestor_vector, SubLObject mark) {
        {
            SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
            if (NIL != some_ancestor_marked) {
                return trie_node_mark_present_recursive(trie, ancestor_index, ancestor_vector, mark);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Note that mark will be present as a result of an insert below current parent node in trie")
    public static SubLObject multi_trie_new_insert_mark_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (NIL != some_ancestor_marked) {
            return trie_node_mark_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        }
        return NIL;
    }/**
     * Note that mark will be present as a result of an insert below current parent node in trie
     */


    public static final SubLObject multi_trie_new_insert_mark_not_present_alt(SubLObject trie, SubLObject ancestor_index, SubLObject ancestor_vector, SubLObject mark) {
        {
            SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
            if (NIL != some_ancestor_marked) {
                return NIL;
            }
        }
        {
            SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
            if (NIL != trie_node_subnodes(node)) {
                return NIL;
            }
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return NIL;
    }

    public static SubLObject multi_trie_new_insert_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (NIL != some_ancestor_marked) {
            return NIL;
        }
        final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
        if (NIL != trie_node_subnodes(node)) {
            return NIL;
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return NIL;
    }

    public static final SubLObject multi_trie_remove_mark_alt(SubLObject trie, SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != trie_multi(trie)) {
                thread.resetMultipleValues();
                {
                    SubLObject ancestor_vector = trie_ancestor_path();
                    SubLObject ancestor_index = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject mark = funcall(trie_multi_key_func(trie), v_object);
                        SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
                        SubLTrampolineFile.checkType(node, TRIE_LEAF_NODE_P);
                        if (NIL != trie_leaf_has_implicit_mark(trie, node, mark)) {
                            multi_trie_remove_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject multi_trie_remove_mark(final SubLObject trie, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != trie_multi(trie)) {
            thread.resetMultipleValues();
            final SubLObject ancestor_vector = trie_ancestor_path();
            final SubLObject ancestor_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mark = funcall(trie_multi_key_func(trie), v_object);
            final SubLObject node = first_ancestor(ancestor_vector, ancestor_index);
            assert NIL != trie_leaf_node_p(node) : "! tries.trie_leaf_node_p(node) " + ("tries.trie_leaf_node_p(node) " + "CommonSymbols.NIL != tries.trie_leaf_node_p(node) ") + node;
            if (NIL != trie_leaf_has_implicit_mark(trie, node, mark)) {
                multi_trie_remove_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
            }
        }
        return NIL;
    }

    public static final SubLObject multi_trie_remove_mark_not_present_alt(SubLObject trie, SubLObject ancestor_index, SubLObject ancestor_vector, SubLObject mark) {
        {
            SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
            if (NIL != some_ancestor_marked) {
                return NIL;
            }
            trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
            return NIL;
        }
    }

    public static SubLObject multi_trie_remove_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (NIL != some_ancestor_marked) {
            return NIL;
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return NIL;
    }

    public static final SubLObject multi_trie_remove_all_mark_alt(SubLObject trie) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != trie_multi(trie)) {
                thread.resetMultipleValues();
                {
                    SubLObject ancestor_vector = trie_ancestor_path();
                    SubLObject ancestor_index = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject trie_marks = trie_multi_keys(trie);
                        SubLObject cdolist_list_var = trie_marks;
                        SubLObject mark = NIL;
                        for (mark = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mark = cdolist_list_var.first()) {
                            multi_trie_remove_all_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject multi_trie_remove_all_mark(final SubLObject trie) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != trie_multi(trie)) {
            thread.resetMultipleValues();
            final SubLObject ancestor_vector = trie_ancestor_path();
            final SubLObject ancestor_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var;
            final SubLObject trie_marks = cdolist_list_var = trie_multi_keys(trie);
            SubLObject mark = NIL;
            mark = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                multi_trie_remove_all_mark_not_present(trie, ancestor_index, ancestor_vector, mark);
                cdolist_list_var = cdolist_list_var.rest();
                mark = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject multi_trie_remove_all_mark_not_present_alt(SubLObject trie, SubLObject ancestor_index, SubLObject ancestor_vector, SubLObject mark) {
        {
            SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
            if (NIL != some_ancestor_marked) {
                return NIL;
            }
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return NIL;
    }

    public static SubLObject multi_trie_remove_all_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark) {
        final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked(ancestor_index, ancestor_vector, mark);
        if (NIL != some_ancestor_marked) {
            return NIL;
        }
        trie_node_mark_not_present_recursive(trie, ancestor_index, ancestor_vector, mark);
        return NIL;
    }

    public static SubLObject declare_tries_file() {
        declareFunction("trie_print_function_trampoline", "TRIE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("trie_p", "TRIE-P", 1, 0, false);
        new tries.$trie_p$UnaryFunction();
        declareFunction("trie_name", "TRIE-NAME", 1, 0, false);
        declareFunction("trie_top_node", "TRIE-TOP-NODE", 1, 0, false);
        declareFunction("trie_unique", "TRIE-UNIQUE", 1, 0, false);
        declareFunction("trie_case_sensitive", "TRIE-CASE-SENSITIVE", 1, 0, false);
        declareFunction("trie_entry_test_func", "TRIE-ENTRY-TEST-FUNC", 1, 0, false);
        declareFunction("trie_multi", "TRIE-MULTI", 1, 0, false);
        declareFunction("trie_multi_keys", "TRIE-MULTI-KEYS", 1, 0, false);
        declareFunction("trie_multi_key_func", "TRIE-MULTI-KEY-FUNC", 1, 0, false);
        declareFunction("_csetf_trie_name", "_CSETF-TRIE-NAME", 2, 0, false);
        declareFunction("_csetf_trie_top_node", "_CSETF-TRIE-TOP-NODE", 2, 0, false);
        declareFunction("_csetf_trie_unique", "_CSETF-TRIE-UNIQUE", 2, 0, false);
        declareFunction("_csetf_trie_case_sensitive", "_CSETF-TRIE-CASE-SENSITIVE", 2, 0, false);
        declareFunction("_csetf_trie_entry_test_func", "_CSETF-TRIE-ENTRY-TEST-FUNC", 2, 0, false);
        declareFunction("_csetf_trie_multi", "_CSETF-TRIE-MULTI", 2, 0, false);
        declareFunction("_csetf_trie_multi_keys", "_CSETF-TRIE-MULTI-KEYS", 2, 0, false);
        declareFunction("_csetf_trie_multi_key_func", "_CSETF-TRIE-MULTI-KEY-FUNC", 2, 0, false);
        declareFunction("make_trie", "MAKE-TRIE", 0, 1, false);
        declareFunction("visit_defstruct_trie", "VISIT-DEFSTRUCT-TRIE", 2, 0, false);
        declareFunction("visit_defstruct_object_trie_method", "VISIT-DEFSTRUCT-OBJECT-TRIE-METHOD", 2, 0, false);
        declareFunction("print_trie", "PRINT-TRIE", 3, 0, false);
        declareFunction("make_static_trie", "MAKE-STATIC-TRIE", 0, 0, false);
        declareFunction("init_trie", "INIT-TRIE", 1, 0, false);
        declareFunction("free_trie_p", "FREE-TRIE-P", 1, 0, false);
        declareFunction("free_trie", "FREE-TRIE", 1, 0, false);
        declareFunction("get_trie", "GET-TRIE", 0, 0, false);
        declareFunction("trie_node_key", "TRIE-NODE-KEY", 1, 0, false);
        declareFunction("trie_node_data", "TRIE-NODE-DATA", 1, 0, false);
        declareFunction("trie_node_subnodes", "TRIE-NODE-SUBNODES", 1, 0, false);
        declareFunction("trie_leaf_node_p", "TRIE-LEAF-NODE-P", 1, 0, false);
        declareFunction("new_trie_terminal_node", "NEW-TRIE-TERMINAL-NODE", 2, 0, false);
        declareFunction("new_trie_nonterminal_node", "NEW-TRIE-NONTERMINAL-NODE", 2, 0, false);
        declareFunction("trie_key_E", "TRIE-KEY-=", 3, 0, false);
        declareFunction("trie_key_L", "TRIE-KEY-<", 3, 0, false);
        declareFunction("trie_key_LE", "TRIE-KEY-<=", 3, 0, false);
        declareFunction("trie_key_G", "TRIE-KEY->", 3, 0, false);
        declareFunction("trie_key_GE", "TRIE-KEY->=", 3, 0, false);
        declareFunction("add_trie_subnode", "ADD-TRIE-SUBNODE", 3, 0, false);
        declareFunction("create_trie", "CREATE-TRIE", 1, 3, false);
        declareFunction("trie_from_strings", "TRIE-FROM-STRINGS", 2, 3, false);
        declareFunction("clear_trie", "CLEAR-TRIE", 1, 0, false);
        declareFunction("trie_emptyP", "TRIE-EMPTY?", 1, 0, false);
        declareFunction("trie_count", "TRIE-COUNT", 1, 0, false);
        declareFunction("trie_node_count", "TRIE-NODE-COUNT", 2, 0, false);
        declareFunction("show_trie", "SHOW-TRIE", 1, 1, false);
        declareFunction("show_trie_node", "SHOW-TRIE-NODE", 4, 0, false);
        declareFunction("trie_insert", "TRIE-INSERT", 2, 3, false);
        declareFunction("trie_remove", "TRIE-REMOVE", 2, 3, false);
        declareFunction("trie_remove_all", "TRIE-REMOVE-ALL", 2, 2, false);
        declareFunction("trie_exact", "TRIE-EXACT", 2, 3, false);
        declareFunction("trie_prefix", "TRIE-PREFIX", 2, 4, false);
        declareFunction("trie_prefix_iterative", "TRIE-PREFIX-ITERATIVE", 3, 2, false);
        declareFunction("trie_prefix_recursive", "TRIE-PREFIX-RECURSIVE", 3, 2, false);
        declareFunction("trie_prefix_recursive_int", "TRIE-PREFIX-RECURSIVE-INT", 7, 0, false);
        declareFunction("all_trie_objects_under_node", "ALL-TRIE-OBJECTS-UNDER-NODE", 3, 0, false);
        declareFunction("all_trie_objects_in_leaf_node", "ALL-TRIE-OBJECTS-IN-LEAF-NODE", 3, 0, false);
        declareFunction("trie_search", "TRIE-SEARCH", 2, 3, false);
        declareFunction("trie_search_internal", "TRIE-SEARCH-INTERNAL", 9, 0, false);
        declareFunction("trie_match", "TRIE-MATCH", 6, 0, false);
        declareFunction("map_trie_data", "MAP-TRIE-DATA", 2, 0, false);
        declareFunction("map_trie_data_internal", "MAP-TRIE-DATA-INTERNAL", 4, 0, false);
        declareFunction("map_trie_data_direction", "MAP-TRIE-DATA-DIRECTION", 3, 3, false);
        declareFunction("map_trie_data_forward", "MAP-TRIE-DATA-FORWARD", 8, 0, false);
        declareFunction("map_trie_data_backward", "MAP-TRIE-DATA-BACKWARD", 8, 0, false);
        declareMacro("do_objects_in_trie", "DO-OBJECTS-IN-TRIE");
        declareFunction("new_trie_iterator", "NEW-TRIE-ITERATOR", 1, 1, false);
        declareFunction("new_trie_iterator_state", "NEW-TRIE-ITERATOR-STATE", 2, 0, false);
        declareFunction("trie_iterator_done", "TRIE-ITERATOR-DONE", 1, 0, false);
        declareFunction("trie_iterator_done_node", "TRIE-ITERATOR-DONE-NODE", 1, 0, false);
        declareFunction("trie_iterator_done_queue", "TRIE-ITERATOR-DONE-QUEUE", 1, 0, false);
        declareFunction("trie_iterator_done_stack", "TRIE-ITERATOR-DONE-STACK", 1, 0, false);
        declareFunction("trie_iterator_next", "TRIE-ITERATOR-NEXT", 1, 0, false);
        declareFunction("trie_iterator_next_unique", "TRIE-ITERATOR-NEXT-UNIQUE", 4, 0, false);
        declareFunction("trie_iterator_next_non_unique", "TRIE-ITERATOR-NEXT-NON-UNIQUE", 5, 0, false);
        declareFunction("trie_iterator_finalize", "TRIE-ITERATOR-FINALIZE", 1, 0, false);
        declareFunction("new_directed_trie_iterator", "NEW-DIRECTED-TRIE-ITERATOR", 2, 5, false);
        declareFunction("new_directed_trie_iterator_state", "NEW-DIRECTED-TRIE-ITERATOR-STATE", 7, 0, false);
        declareFunction("directed_trie_iterator_generate_stack", "DIRECTED-TRIE-ITERATOR-GENERATE-STACK", 7, 0, false);
        declareFunction("forward_trie_iterator_generate_stack_recursive", "FORWARD-TRIE-ITERATOR-GENERATE-STACK-RECURSIVE", 5, 0, false);
        declareFunction("backward_trie_iterator_generate_stack_recursive", "BACKWARD-TRIE-ITERATOR-GENERATE-STACK-RECURSIVE", 5, 0, false);
        declareFunction("new_trie_ancestor_tracking_vector", "NEW-TRIE-ANCESTOR-TRACKING-VECTOR", 0, 0, false);
        declareFunction("get_trie_ancestor_tracking_vector", "GET-TRIE-ANCESTOR-TRACKING-VECTOR", 0, 0, false);
        declareFunction("free_trie_ancestor_tracking_vector", "FREE-TRIE-ANCESTOR-TRACKING-VECTOR", 1, 0, false);
        declareFunction("initialize_trie_ancestor_tracking", "INITIALIZE-TRIE-ANCESTOR-TRACKING", 1, 0, false);
        declareFunction("finish_trie_ancestor_tracking", "FINISH-TRIE-ANCESTOR-TRACKING", 0, 0, false);
        declareFunction("trie_ancestor_tracking_descend", "TRIE-ANCESTOR-TRACKING-DESCEND", 1, 0, false);
        declareFunction("trie_ancestor_tracking_ascend", "TRIE-ANCESTOR-TRACKING-ASCEND", 0, 0, false);
        declareFunction("trie_ancestor_path", "TRIE-ANCESTOR-PATH", 0, 0, false);
        declareFunction("no_more_ancestors", "NO-MORE-ANCESTORS", 1, 0, false);
        declareFunction("first_ancestor", "FIRST-ANCESTOR", 2, 0, false);
        declareFunction("parent_ancestor", "PARENT-ANCESTOR", 2, 0, false);
        declareFunction("next_generation", "NEXT-GENERATION", 1, 0, false);
        declareFunction("multi_trie_some_ancestor_marked", "MULTI-TRIE-SOME-ANCESTOR-MARKED", 3, 0, false);
        declareFunction("create_multi_trie", "CREATE-MULTI-TRIE", 2, 3, false);
        declareFunction("multi_trie_p", "MULTI-TRIE-P", 1, 0, false);
        declareFunction("clear_multi_trie", "CLEAR-MULTI-TRIE", 1, 1, false);
        declareFunction("add_multi_trie_key", "ADD-MULTI-TRIE-KEY", 2, 0, false);
        declareFunction("rem_multi_trie_key", "REM-MULTI-TRIE-KEY", 2, 0, false);
        declareFunction("multi_trie_emptyP", "MULTI-TRIE-EMPTY?", 1, 0, false);
        declareFunction("multi_trie_count", "MULTI-TRIE-COUNT", 1, 0, false);
        declareFunction("show_multi_trie", "SHOW-MULTI-TRIE", 1, 1, false);
        declareFunction("multi_trie_insert", "MULTI-TRIE-INSERT", 2, 3, false);
        declareFunction("multi_trie_remove", "MULTI-TRIE-REMOVE", 2, 3, false);
        declareFunction("multi_trie_remove_all", "MULTI-TRIE-REMOVE-ALL", 2, 2, false);
        declareFunction("multi_trie_exact", "MULTI-TRIE-EXACT", 2, 4, false);
        declareFunction("multi_trie_prefix", "MULTI-TRIE-PREFIX", 2, 5, false);
        declareFunction("multi_trie_search", "MULTI-TRIE-SEARCH", 2, 4, false);
        declareFunction("map_multi_trie_data", "MAP-MULTI-TRIE-DATA", 2, 1, false);
        declareFunction("map_multi_trie_data_mark", "MAP-MULTI-TRIE-DATA-MARK", 3, 0, false);
        declareFunction("map_multi_trie_data_direction", "MAP-MULTI-TRIE-DATA-DIRECTION", 3, 4, false);
        declareFunction("map_multi_trie_data_direction_mark", "MAP-MULTI-TRIE-DATA-DIRECTION-MARK", 4, 3, false);
        declareFunction("trie_relevant_ancestor_pathP", "TRIE-RELEVANT-ANCESTOR-PATH?", 1, 0, false);
        declareFunction("trie_relevant_object", "TRIE-RELEVANT-OBJECT", 2, 0, false);
        declareFunction("trie_relevant_objects", "TRIE-RELEVANT-OBJECTS", 2, 0, false);
        declareFunction("add_trie_mark", "ADD-TRIE-MARK", 2, 0, false);
        declareFunction("rem_trie_mark", "REM-TRIE-MARK", 2, 0, false);
        declareFunction("trie_node_marks", "TRIE-NODE-MARKS", 1, 0, false);
        declareFunction("trie_node_has_mark", "TRIE-NODE-HAS-MARK", 2, 0, false);
        declareFunction("set_trie_node_marks", "SET-TRIE-NODE-MARKS", 2, 0, false);
        declareFunction("trie_leaf_has_implicit_mark", "TRIE-LEAF-HAS-IMPLICIT-MARK", 3, 0, false);
        declareFunction("add_trie_node_mark", "ADD-TRIE-NODE-MARK", 2, 0, false);
        declareFunction("rem_trie_node_mark", "REM-TRIE-NODE-MARK", 2, 0, false);
        declareFunction("trie_node_mark_present_recursive", "TRIE-NODE-MARK-PRESENT-RECURSIVE", 4, 0, false);
        declareFunction("trie_node_mark_not_present_recursive", "TRIE-NODE-MARK-NOT-PRESENT-RECURSIVE", 4, 0, false);
        declareFunction("multi_trie_existing_insert_mark", "MULTI-TRIE-EXISTING-INSERT-MARK", 2, 0, false);
        declareFunction("multi_trie_existing_insert_mark_present", "MULTI-TRIE-EXISTING-INSERT-MARK-PRESENT", 4, 0, false);
        declareFunction("multi_trie_existing_insert_mark_not_present", "MULTI-TRIE-EXISTING-INSERT-MARK-NOT-PRESENT", 4, 0, false);
        declareFunction("multi_trie_new_insert_mark", "MULTI-TRIE-NEW-INSERT-MARK", 2, 0, false);
        declareFunction("multi_trie_new_insert_mark_present", "MULTI-TRIE-NEW-INSERT-MARK-PRESENT", 4, 0, false);
        declareFunction("multi_trie_new_insert_mark_not_present", "MULTI-TRIE-NEW-INSERT-MARK-NOT-PRESENT", 4, 0, false);
        declareFunction("multi_trie_remove_mark", "MULTI-TRIE-REMOVE-MARK", 2, 0, false);
        declareFunction("multi_trie_remove_mark_not_present", "MULTI-TRIE-REMOVE-MARK-NOT-PRESENT", 4, 0, false);
        declareFunction("multi_trie_remove_all_mark", "MULTI-TRIE-REMOVE-ALL-MARK", 1, 0, false);
        declareFunction("multi_trie_remove_all_mark_not_present", "MULTI-TRIE-REMOVE-ALL-MARK-NOT-PRESENT", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_tries_file() {
        defparameter("*TRIE-OBJECTS*", NIL);
        defparameter("*TRIE-RELEVANT-MARKS*", $ALL);
        defparameter("*TRIE-ANCESTOR-TRACKING*", NIL);
        defconstant("*DTP-TRIE*", TRIE);
        deflexical("*TRIE-FREE-LIST*", NIL);
        deflexical("*TRIE-FREE-LOCK*", make_lock($$$TRIE_resource_lock));
        defparameter("*TRIE-MAXIMUM-SEARCH-SIZE*", $int$1000);
        defparameter("*TRIE-ANCESTOR-TRACKING-RESOURCE*", NIL);
        defparameter("*TRIE-ANCESTOR-TRACKING-LOCK*", make_lock($$$Ancestor_Tracking_Resource));
        defparameter("*TRIE-ANCESTOR-TRACKING-VECTOR-SIZE*", $int$100);
        defparameter("*TRIE-ANCESTOR-VECTOR*", NIL);
        defparameter("*TRIE-ANCESTOR-NEXT*", NIL);
        return NIL;
    }

    public static SubLObject setup_tries_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_trie$.getGlobalValue(), symbol_function(TRIE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(TRIE_NAME, _CSETF_TRIE_NAME);
        def_csetf(TRIE_TOP_NODE, _CSETF_TRIE_TOP_NODE);
        def_csetf(TRIE_UNIQUE, _CSETF_TRIE_UNIQUE);
        def_csetf(TRIE_CASE_SENSITIVE, _CSETF_TRIE_CASE_SENSITIVE);
        def_csetf(TRIE_ENTRY_TEST_FUNC, _CSETF_TRIE_ENTRY_TEST_FUNC);
        def_csetf(TRIE_MULTI, _CSETF_TRIE_MULTI);
        def_csetf(TRIE_MULTI_KEYS, _CSETF_TRIE_MULTI_KEYS);
        def_csetf(TRIE_MULTI_KEY_FUNC, _CSETF_TRIE_MULTI_KEY_FUNC);
        identity(TRIE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_trie$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TRIE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_tries_file();
    }

    @Override
    public void initializeVariables() {
        init_tries_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tries_file();
    }

    

    public static final class $trie_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $top_node;

        public SubLObject $unique;

        public SubLObject $case_sensitive;

        public SubLObject $entry_test_func;

        public SubLObject $multi;

        public SubLObject $multi_keys;

        public SubLObject $multi_key_func;

        private static final SubLStructDeclNative structDecl;

        public $trie_native() {
            tries.$trie_native.this.$name = Lisp.NIL;
            tries.$trie_native.this.$top_node = Lisp.NIL;
            tries.$trie_native.this.$unique = Lisp.NIL;
            tries.$trie_native.this.$case_sensitive = Lisp.NIL;
            tries.$trie_native.this.$entry_test_func = Lisp.NIL;
            tries.$trie_native.this.$multi = Lisp.NIL;
            tries.$trie_native.this.$multi_keys = Lisp.NIL;
            tries.$trie_native.this.$multi_key_func = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return tries.$trie_native.this.$name;
        }

        @Override
        public SubLObject getField3() {
            return tries.$trie_native.this.$top_node;
        }

        @Override
        public SubLObject getField4() {
            return tries.$trie_native.this.$unique;
        }

        @Override
        public SubLObject getField5() {
            return tries.$trie_native.this.$case_sensitive;
        }

        @Override
        public SubLObject getField6() {
            return tries.$trie_native.this.$entry_test_func;
        }

        @Override
        public SubLObject getField7() {
            return tries.$trie_native.this.$multi;
        }

        @Override
        public SubLObject getField8() {
            return tries.$trie_native.this.$multi_keys;
        }

        @Override
        public SubLObject getField9() {
            return tries.$trie_native.this.$multi_key_func;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return tries.$trie_native.this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return tries.$trie_native.this.$top_node = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return tries.$trie_native.this.$unique = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return tries.$trie_native.this.$case_sensitive = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return tries.$trie_native.this.$entry_test_func = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return tries.$trie_native.this.$multi = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return tries.$trie_native.this.$multi_keys = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return tries.$trie_native.this.$multi_key_func = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.tries.$trie_native.class, TRIE, TRIE_P, $list3, $list4, new String[]{ "$name", "$top_node", "$unique", "$case_sensitive", "$entry_test_func", "$multi", "$multi_keys", "$multi_key_func" }, $list5, $list6, PRINT_TRIE);
        }
    }

    public static final class $trie_p$UnaryFunction extends UnaryFunction {
        public $trie_p$UnaryFunction() {
            super(extractFunctionNamed("TRIE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return trie_p(arg1);
        }
    }

    static private final SubLList $list_alt3 = list(makeSymbol("NAME"), makeSymbol("TOP-NODE"), makeSymbol("UNIQUE"), makeSymbol("CASE-SENSITIVE"), makeSymbol("ENTRY-TEST-FUNC"), makeSymbol("MULTI"), makeSymbol("MULTI-KEYS"), makeSymbol("MULTI-KEY-FUNC"));

    static private final SubLList $list_alt4 = list($NAME, makeKeyword("TOP-NODE"), makeKeyword("UNIQUE"), makeKeyword("CASE-SENSITIVE"), makeKeyword("ENTRY-TEST-FUNC"), makeKeyword("MULTI"), makeKeyword("MULTI-KEYS"), makeKeyword("MULTI-KEY-FUNC"));

    static private final SubLList $list_alt5 = list(makeSymbol("TRIE-NAME"), makeSymbol("TRIE-TOP-NODE"), makeSymbol("TRIE-UNIQUE"), makeSymbol("TRIE-CASE-SENSITIVE"), makeSymbol("TRIE-ENTRY-TEST-FUNC"), makeSymbol("TRIE-MULTI"), makeSymbol("TRIE-MULTI-KEYS"), makeSymbol("TRIE-MULTI-KEY-FUNC"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-TRIE-NAME"), makeSymbol("_CSETF-TRIE-TOP-NODE"), makeSymbol("_CSETF-TRIE-UNIQUE"), makeSymbol("_CSETF-TRIE-CASE-SENSITIVE"), makeSymbol("_CSETF-TRIE-ENTRY-TEST-FUNC"), makeSymbol("_CSETF-TRIE-MULTI"), makeSymbol("_CSETF-TRIE-MULTI-KEYS"), makeSymbol("_CSETF-TRIE-MULTI-KEY-FUNC"));

    static private final SubLString $str_alt33$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt34$__TRIE = makeString("#<TRIE");

    static private final SubLString $str_alt35$__A = makeString(" ~A");

    static private final SubLString $str_alt36$_UNIQUE = makeString(" UNIQUE");

    static private final SubLString $str_alt37$_SENSITIVE = makeString(" SENSITIVE");

    static private final SubLString $str_alt38$_INSENSITIVE = makeString(" INSENSITIVE");

    static private final SubLString $str_alt39$__S = makeString(" ~S");

    static private final SubLString $str_alt40$_ = makeString(">");

    static private final SubLString $str_alt45$_m___S = makeString("<m> ~S");

    static private final SubLString $str_alt46$_____S = makeString(" :  ~S");

    static private final SubLString $str_alt48$There_is_already_an_object__S_not = makeString("There is already an object ~S not ~S to ~S in the trie!");

    static private final SubLString $str_alt50$The_object_found_in_trie_for__S_i = makeString("The object found in trie for ~S is ~S, not ~S");

    static private final SubLString $str_alt51$TRIE__S_does_not_have_unique_entr = makeString("TRIE ~S does not have unique entries");

    static private final SubLList $list_alt54 = list(list(makeSymbol("OBJECT"), makeSymbol("TRIE"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt55 = list($DONE, makeKeyword("FORWARD"));

    static private final SubLSymbol $sym59$ITERATOR = makeUninternedSymbol("ITERATOR");

    static private final SubLList $list_alt70 = cons(makeSymbol("KEY"), makeSymbol("SUBTRIE"));

    static private final SubLString $str_alt71$_A__A = makeString("~A:~A");

    static private final SubLList $list_alt73 = cons(makeSymbol("MARK"), makeSymbol("SUBTRIE"));

    static private final SubLString $str_alt74$___S_sub_tries = makeString("~%~S sub-tries");

    static private final SubLString $str_alt75$____Sub_Trie__S = makeString("~%~%Sub-Trie ~S");
}

/**
 * Total time: 658 ms
 */
