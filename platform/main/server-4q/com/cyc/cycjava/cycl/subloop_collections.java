package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.generate_instance_variable_bindings_for_structure_slots;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.charE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class subloop_collections extends SubLTranslatedFile {
    public static final SubLFile me = new subloop_collections();

    public static final String myName = "com.cyc.cycjava.cycl.subloop_collections";

    public static final String myFingerPrint = "9cbe9cd5c19fe05e7ff54f8bd88fc57bd6cfed71b18646fa9f4eed7b3dc3a8a7";

    // defconstant
    private static final SubLSymbol $valid_sequential_directions$ = makeSymbol("*VALID-SEQUENTIAL-DIRECTIONS*");

    // defconstant
    public static final SubLSymbol $dtp_double_link_cell$ = makeSymbol("*DTP-DOUBLE-LINK-CELL*");



    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("BACKWARDS"), makeKeyword("NONE"), makeKeyword("FORWARDS"));

    public static final SubLSymbol SEQUENTIAL_DIRECTION = makeSymbol("SEQUENTIAL-DIRECTION");

    public static final SubLString $str2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    public static final SubLSymbol ENCODE_SEQUENTIAL_DIRECTION = makeSymbol("ENCODE-SEQUENTIAL-DIRECTION");

    public static final SubLString $str4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    public static final SubLSymbol DECODE_SEQUENTIAL_DIRECTION = makeSymbol("DECODE-SEQUENTIAL-DIRECTION");

    public static final SubLString $str6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    public static final SubLSymbol SEQUENTIAL_DIRECTION_P = makeSymbol("SEQUENTIAL-DIRECTION-P");

    public static final SubLSymbol ITERATOR_TEMPLATE = makeSymbol("ITERATOR-TEMPLATE");

    public static final SubLList $list9 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")));

    public static final SubLSymbol ENUMERATOR_TEMPLATE = makeSymbol("ENUMERATOR-TEMPLATE");

    public static final SubLList $list11 = list(makeSymbol("ITERATOR-TEMPLATE"));

    public static final SubLList $list12 = list(makeKeyword("EXTENDS"), list(makeSymbol("ITERATOR-TEMPLATE")));

    public static final SubLList $list13 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("PUBLIC")));

    public static final SubLSymbol COLLECTION_ENUMERATOR_TEMPLATE = makeSymbol("COLLECTION-ENUMERATOR-TEMPLATE");

    public static final SubLList $list15 = list(makeSymbol("ENUMERATOR-TEMPLATE"));

    public static final SubLList $list16 = list(makeKeyword("EXTENDS"), list(makeSymbol("ENUMERATOR-TEMPLATE")));

    public static final SubLList $list17 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STORE-COLLECTION-CONTENTS"), list(makeSymbol("NEW-COLLECTION-CONTENTS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS-POINTER"), list(makeSymbol("SUBCONTENTS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS-POINTER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTION"), list(makeSymbol("NEW-DIRECTION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("PUBLIC")) });



    public static final SubLList $list19 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list20 = list(list(makeSymbol("RET"), list(makeSymbol("NULL"), list(makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), makeSymbol("SELF")))));



    public static final SubLList $list22 = list(list(makeSymbol("RET"), list(makeSymbol("COR"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF")), list(EQ, list(makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), makeSymbol("SELF")), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF"))))));



    public static final SubLList $list24 = list(list(makeSymbol("PIF"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF")), list(makeSymbol("RET"), T), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("RET"), list(makeSymbol("NULL"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS-POINTER")))), list(makeSymbol("RET"), T)))));



    public static final SubLList $list26 = list(list(makeSymbol("PIF"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF")), list(makeSymbol("RET"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("RET"), list(makeSymbol("CAR"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("RET"), NIL)))));



    public static final SubLList $list28 = list(list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("SELF"), list(makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), makeSymbol("SELF"))), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("FORWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF"))));



    public static final SubLList $list30 = list(list(makeSymbol("PIF"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF")), list(makeSymbol("RET"), NIL), list(makeSymbol("PROGN"), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("SELF"), list(makeSymbol("LAST"), list(makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("BACKWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF"))))));



    public static final SubLList $list32 = list(list(makeSymbol("PIF"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF")), list(makeSymbol("RET"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("PCASE"), list(makeSymbol("GET-DIRECTION"), makeSymbol("SELF")), list(makeKeyword("BACKWARDS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), makeSymbol("SELF")))), list(makeKeyword("NONE"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), makeSymbol("SELF"))))), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS-POINTER")), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("FORWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS-POINTER")), list(makeSymbol("RET"), NIL), list(makeSymbol("PROGN"), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS-POINTER"))), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("FORWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF"))))))));



    public static final SubLList $list34 = list(list(makeSymbol("PIF"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF")), list(makeSymbol("RET"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-COLLECTION-CONTENTS"), list(makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("PCASE"), list(makeSymbol("GET-DIRECTION"), makeSymbol("SELF")), list(makeKeyword("FORWARDS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-COLLECTION-CONTENTS")))), list(makeKeyword("NONE"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-COLLECTION-CONTENTS"))))), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS-POINTER")), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("BACKWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-COLLECTION-CONTENTS"), makeSymbol("TEMPLATE-CONTENTS-POINTER")), list(makeSymbol("PROGN"), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("BACKWARDS")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CDOSUBLISTS"), list(makeSymbol("SUBLIST"), makeSymbol("TEMPLATE-COLLECTION-CONTENTS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("CDR"), makeSymbol("SUBLIST")), makeSymbol("TEMPLATE-CONTENTS-POINTER")), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("SELF"), makeSymbol("SUBLIST")), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("BACKWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF")))))))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol PROTECTED_MEMBERSHIP_TEMPLATE = makeSymbol("PROTECTED-MEMBERSHIP-TEMPLATE");

    public static final SubLList $list36 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACCEPTABLE-P"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")));

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR = makeSymbol("BASIC-COLLECTION-ENUMERATOR");



    public static final SubLList $list39 = list(makeSymbol("COLLECTION-ENUMERATOR-TEMPLATE"));

    public static final SubLList $list40 = list(new SubLObject[]{ list(makeSymbol("COLLECTION-CONTENTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTENTS-POINTER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DIRECTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STORE-COLLECTION-CONTENTS"), list(makeSymbol("NEW-COLLECTION-CONTENTS")), makeKeyword("FILE-SCOPE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), NIL, makeKeyword("FILE-SCOPE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS-POINTER"), list(makeSymbol("SUBCONTENTS")), makeKeyword("FILE-SCOPE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS-POINTER"), NIL, makeKeyword("FILE-SCOPE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTION"), NIL, makeKeyword("FILE-SCOPE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTION"), list(makeSymbol("NEW-DIRECTION")), makeKeyword("FILE-SCOPE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });





    public static final SubLSymbol COLLECTION_CONTENTS = makeSymbol("COLLECTION-CONTENTS");







    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_PREVIOUS_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-PREVIOUS-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_NEXT_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-NEXT-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_LAST_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-LAST-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_FIRST_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-FIRST-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_CURRENT_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-CURRENT-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_LAST_P_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-LAST-P-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_FIRST_P_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-FIRST-P-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_EMPTY_P_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-EMPTY-P-METHOD");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-INSTANCE");



    public static final SubLList $list61 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list62 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("COLLECTION-CONTENTS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS-POINTER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("NONE")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_INITIALIZE_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-INITIALIZE-METHOD");

    public static final SubLSymbol STORE_COLLECTION_CONTENTS = makeSymbol("STORE-COLLECTION-CONTENTS");

    public static final SubLList $list66 = list(makeKeyword("FILE-SCOPE"), makeKeyword("PROTECTED"));

    public static final SubLList $list67 = list(makeSymbol("NEW-COLLECTION-CONTENTS"));

    public static final SubLList $list68 = list(list(makeSymbol("CSETQ"), makeSymbol("COLLECTION-CONTENTS"), makeSymbol("NEW-COLLECTION-CONTENTS")), list(makeSymbol("RET"), makeSymbol("NEW-COLLECTION-CONTENTS")));

    public static final SubLSymbol $sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_STORE_COLLECTION_CONTENTS_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-STORE-COLLECTION-CONTENTS-METHOD");



    public static final SubLList $list72 = list(list(makeSymbol("RET"), makeSymbol("COLLECTION-CONTENTS")));

    public static final SubLSymbol $sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_RETRIEVE_COLLECTION_CONTENTS_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-RETRIEVE-COLLECTION-CONTENTS-METHOD");



    public static final SubLList $list76 = list(makeSymbol("SUBCONTENTS"));

    public static final SubLList $list77 = list(list(makeSymbol("CSETQ"), makeSymbol("CONTENTS-POINTER"), makeSymbol("SUBCONTENTS")), list(makeSymbol("RET"), makeSymbol("SUBCONTENTS")));

    public static final SubLSymbol $sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_SET_CONTENTS_POINTER_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-SET-CONTENTS-POINTER-METHOD");



    public static final SubLList $list81 = list(list(makeSymbol("RET"), makeSymbol("CONTENTS-POINTER")));

    public static final SubLSymbol $sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_GET_CONTENTS_POINTER_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-GET-CONTENTS-POINTER-METHOD");



    public static final SubLList $list85 = list(list(makeSymbol("RET"), makeSymbol("DIRECTION")));

    public static final SubLSymbol $sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_GET_DIRECTION_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-GET-DIRECTION-METHOD");



    public static final SubLList $list89 = list(makeSymbol("NEW-DIRECTION"));

    public static final SubLList $list90 = list(list(makeSymbol("MUST"), list(makeSymbol("SEQUENTIAL-DIRECTION-P"), makeSymbol("NEW-DIRECTION")), makeString("(SET-DIRECTION ~S): ~S is not a valid direction.  A direction must be one of: ~S."), makeSymbol("SELF"), makeSymbol("NEW-DIRECTION"), list(makeSymbol("ENUMERATE-VALUES"), list(makeSymbol("QUOTE"), makeSymbol("SEQUENTIAL-DIRECTION")))), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeSymbol("NEW-DIRECTION")), list(makeSymbol("RET"), makeSymbol("NEW-DIRECTION")));

    public static final SubLSymbol $sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");

    public static final SubLString $str92$_SET_DIRECTION__S____S_is_not_a_v = makeString("(SET-DIRECTION ~S): ~S is not a valid direction.  A direction must be one of: ~S.");

    public static final SubLSymbol BASIC_COLLECTION_ENUMERATOR_SET_DIRECTION_METHOD = makeSymbol("BASIC-COLLECTION-ENUMERATOR-SET-DIRECTION-METHOD");

    public static final SubLSymbol COLLECTION_TEMPLATE = makeSymbol("COLLECTION-TEMPLATE");

    public static final SubLList $list95 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELEMENT-EQUAL-P"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("ENUMERATOR")), makeKeyword("PUBLIC")) });



    public static final SubLList $list97 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list98 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[]"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]")))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("RET"), makeSymbol("SELF")));



    public static final SubLList $list100 = list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2"));

    public static final SubLList $list101 = list(list(makeSymbol("RET"), list(EQUAL, makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2"))));



    public static final SubLList $list103 = list(list(makeSymbol("RET"), list(makeSymbol("LENGTH"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))));



    public static final SubLList $list105 = list(list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), NIL));



    public static final SubLList $list107 = list(makeSymbol("NEW-ELEMENT"));

    public static final SubLList $list108 = list(list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("NCONC"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT")))), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT")));



    public static final SubLList $list110 = list(makeSymbol("OLD-ELEMENT"));

    public static final SubLList $list111 = list(list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("DELETE"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")), list(makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), makeSymbol("SELF")))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")));



    public static final SubLList $list113 = list(makeSymbol("ELEMENT"));

    public static final SubLList $list114 = list(list(makeSymbol("RET"), list(makeSymbol("FIF"), list(makeSymbol("MEMBER"), makeSymbol("ELEMENT"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")), list(makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), makeSymbol("SELF"))), T, NIL)));

    public static final SubLList $list115 = list(list(makeSymbol("RET"), list(makeSymbol("NULL"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))));

    public static final SubLSymbol BASIC_COLLECTION = makeSymbol("BASIC-COLLECTION");

    public static final SubLList $list117 = list(makeSymbol("COLLECTION-TEMPLATE"));

    public static final SubLList $list118 = list(new SubLObject[]{ list(makeSymbol("CONTENTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ELEMENT-EQUALITY-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELEMENT-EQUAL-P"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("ENUMERATOR")), makeKeyword("PUBLIC")) });





    public static final SubLSymbol BASIC_COLLECTION_EMPTY_P_METHOD = makeSymbol("BASIC-COLLECTION-EMPTY-P-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_MEMBER_P_METHOD = makeSymbol("BASIC-COLLECTION-MEMBER-P-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_REMOVE_METHOD = makeSymbol("BASIC-COLLECTION-REMOVE-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ADD_METHOD = makeSymbol("BASIC-COLLECTION-ADD-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_CLEAR_METHOD = makeSymbol("BASIC-COLLECTION-CLEAR-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_GET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-COLLECTION-GET-ELEMENT-COUNT-METHOD");

    public static final SubLString $str127$___S_Class_is_not_correctly_imple = makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");

    public static final SubLString $str128$__ = makeString("[]");

    public static final SubLString $str129$__S = makeString("[~S");

    public static final SubLString $str130$___S = makeString(", ~S");

    public static final SubLString $str131$_ = makeString("]");

    public static final SubLSymbol BASIC_COLLECTION_PRINT_METHOD = makeSymbol("BASIC-COLLECTION-PRINT-METHOD");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-INSTANCE");

    public static final SubLList $list135 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-EQUALITY-PREDICATE"), list(makeSymbol("QUOTE"), EQUAL)), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_INITIALIZE_METHOD = makeSymbol("BASIC-COLLECTION-INITIALIZE-METHOD");

    public static final SubLList $list138 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("FAST-FUNCALL-SETQ"), makeSymbol("RESULT"), makeSymbol("ELEMENT-EQUALITY-PREDICATE"), list(EQUAL, EQ, EQL, EQUALP, makeSymbol("STRING-EQUAL"), makeSymbol("CHAR=")), makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol $sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");



    public static final SubLSymbol $sym141$CHAR_ = makeSymbol("CHAR=");

    public static final SubLSymbol BASIC_COLLECTION_ELEMENT_EQUAL_P_METHOD = makeSymbol("BASIC-COLLECTION-ELEMENT-EQUAL-P-METHOD");



    public static final SubLList $list144 = list(list(makeSymbol("RET"), makeSymbol("ELEMENT-EQUALITY-PREDICATE")));

    public static final SubLSymbol $sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_GET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol("BASIC-COLLECTION-GET-ELEMENT-EQUALITY-PREDICATE-METHOD");



    public static final SubLList $list148 = list(makeSymbol("NEW-PREDICATE"));

    public static final SubLList $list149 = list(list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-EQUALITY-PREDICATE"), makeSymbol("NEW-PREDICATE")), list(makeSymbol("RET"), makeSymbol("NEW-PREDICATE")));

    public static final SubLSymbol $sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_SET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol("BASIC-COLLECTION-SET-ELEMENT-EQUALITY-PREDICATE-METHOD");



    public static final SubLList $list153 = list(list(makeSymbol("RET"), makeSymbol("CONTENTS")));

    public static final SubLSymbol $sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_GET_CONTENTS_METHOD = makeSymbol("BASIC-COLLECTION-GET-CONTENTS-METHOD");



    public static final SubLList $list157 = list(makeSymbol("NEW-CONTENTS"));

    public static final SubLList $list158 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): ~S is not a valid list."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), makeSymbol("NEW-CONTENTS")));

    public static final SubLSymbol $sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");

    public static final SubLString $str160$_SET_CONTENTS__S____S_is_not_a_va = makeString("(SET-CONTENTS ~S): ~S is not a valid list.");

    public static final SubLSymbol BASIC_COLLECTION_SET_CONTENTS_METHOD = makeSymbol("BASIC-COLLECTION-SET-CONTENTS-METHOD");



    public static final SubLList $list163 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-COLLECTION-ENUMERATOR")), list(makeSymbol("QUOTE"), makeSymbol("BASIC-COLLECTION-ENUMERATOR"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("STORE-COLLECTION-CONTENTS"), makeSymbol("BASIC-COLLECTION-ENUMERATOR")), makeSymbol("ENUMERATOR"), makeSymbol("CONTENTS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("BASIC-COLLECTION-ENUMERATOR")), makeSymbol("ENUMERATOR"), makeSymbol("CONTENTS")), list(makeSymbol("RET"), makeSymbol("ENUMERATOR"))));

    public static final SubLSymbol $sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");

    public static final SubLSymbol BASIC_COLLECTION_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-COLLECTION-ALLOCATE-ENUMERATOR-METHOD");



    public static final SubLList $list167 = list(makeSymbol("ENUMERATOR"));

    public static final SubLList $list168 = list(list(makeSymbol("PWHEN"), makeSymbol("ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("STORE-COLLECTION-CONTENTS"), makeSymbol("BASIC-COLLECTION-ENUMERATOR")), makeSymbol("ENUMERATOR"), NIL), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("BASIC-COLLECTION-ENUMERATOR")), makeSymbol("ENUMERATOR"), NIL)), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol BASIC_COLLECTION_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-COLLECTION-DEALLOCATE-ENUMERATOR-METHOD");

    public static final SubLSymbol LIST_TEMPLATE = makeSymbol("LIST-TEMPLATE");

    public static final SubLList $list171 = list(makeKeyword("EXTENDS"), list(makeSymbol("COLLECTION-TEMPLATE")));

    public static final SubLList $list172 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NTH"), list(makeSymbol("INDEX")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLList $list173 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("LIST:[]"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("LIST:[~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]")))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("RET"), makeSymbol("SELF")));



    public static final SubLList $list175 = list(list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-ELEMENT"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT")));



    public static final SubLList $list177 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("RET"), NIL)), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("RET"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))));



    public static final SubLList $list179 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("RET"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("CDOSUBLISTS"), list(makeSymbol("TEMPLATE-CONTENTS-SUBLIST"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), list(makeSymbol("CDDR"), makeSymbol("TEMPLATE-CONTENTS-SUBLIST"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("CADR"), makeSymbol("TEMPLATE-CONTENTS-SUBLIST")))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CONTENTS-SUBLIST"), NIL), list(makeSymbol("RET"), makeSymbol("TEMPLATE-RESULT"))))), list(makeSymbol("RET"), NIL)));



    public static final SubLList $list181 = list(makeSymbol("INDEX"));

    public static final SubLList $list182 = list(list(makeSymbol("RET"), list(makeSymbol("NTH"), makeSymbol("INDEX"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))));



    public static final SubLList $list184 = list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT"));

    public static final SubLList $list185 = list(list(makeSymbol("SET-NTH"), makeSymbol("INDEX"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT")));



    public static final SubLList $list187 = list(list(makeSymbol("RET"), list(makeSymbol("POSITION"), makeSymbol("ELEMENT"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")), list(makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), makeSymbol("SELF")))));



    public static final SubLList $list189 = list(makeSymbol("OTHER-LIST"));

    public static final SubLList $list190 = list(list(makeSymbol("PUNLESS"), makeSymbol("OTHER-LIST"), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("MUST"), list(makeSymbol("LIST-TEMPLATE-P"), makeSymbol("OTHER-LIST")), makeString("(APPEND ~S): ~S is not an instance of LIST-TEMPLATE."), makeSymbol("SELF"), makeSymbol("OTHER-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OTHER-LIST"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENTS")))))), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("NCONC"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")), makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"))), list(makeSymbol("RET"), makeSymbol("SELF"))));



    public static final SubLList $list192 = list(list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("REVERSE"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol BASIC_LIST = makeSymbol("BASIC-LIST");

    public static final SubLList $list194 = list(makeSymbol("LIST-TEMPLATE"));

    public static final SubLList $list195 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NTH"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    public static final SubLSymbol BASIC_LIST_EMPTY_P_METHOD = makeSymbol("BASIC-LIST-EMPTY-P-METHOD");

    public static final SubLSymbol BASIC_LIST_REVERSE_METHOD = makeSymbol("BASIC-LIST-REVERSE-METHOD");

    public static final SubLString $str198$_APPEND__S____S_is_not_an_instanc = makeString("(APPEND ~S): ~S is not an instance of LIST-TEMPLATE.");

    public static final SubLSymbol BASIC_LIST_APPEND_METHOD = makeSymbol("BASIC-LIST-APPEND-METHOD");

    public static final SubLSymbol BASIC_LIST_POSITION_METHOD = makeSymbol("BASIC-LIST-POSITION-METHOD");

    public static final SubLSymbol BASIC_LIST_SET_NTH_METHOD = makeSymbol("BASIC-LIST-SET-NTH-METHOD");

    public static final SubLSymbol BASIC_LIST_NTH_METHOD = makeSymbol("BASIC-LIST-NTH-METHOD");

    public static final SubLSymbol BASIC_LIST_BUT_LAST_METHOD = makeSymbol("BASIC-LIST-BUT-LAST-METHOD");

    public static final SubLSymbol BASIC_LIST_POP_METHOD = makeSymbol("BASIC-LIST-POP-METHOD");

    public static final SubLSymbol BASIC_LIST_PUSH_METHOD = makeSymbol("BASIC-LIST-PUSH-METHOD");

    public static final SubLString $str206$LIST___ = makeString("LIST:[]");

    public static final SubLString $str207$LIST___S = makeString("LIST:[~S");

    public static final SubLSymbol BASIC_LIST_PRINT_METHOD = makeSymbol("BASIC-LIST-PRINT-METHOD");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-INSTANCE");

    public static final SubLSymbol END_POINTER_LIST_TEMPLATE = makeSymbol("END-POINTER-LIST-TEMPLATE");

    public static final SubLList $list212 = list(makeKeyword("EXTENDS"), list(makeSymbol("LIST-TEMPLATE")));

    public static final SubLList $list213 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-END-POINTER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-END-POINTER"), list(makeSymbol("NEW-END-POINTER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    public static final SubLList $list214 = list(list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), NIL));

    public static final SubLList $list215 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("GET-END-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-END-POINTER"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PROGN"), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-END-POINTER"))))), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-END-POINTER")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT"))));

    public static final SubLList $list216 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("GET-END-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("RET"), NIL), list(makeSymbol("PIF"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-CONTENTS"), makeSymbol("TEMPLATE-END-POINTER")), list(makeSymbol("PROGN"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-CONS"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")), makeSymbol("TEMPLATE-END-POINTER"))), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("CADR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("PIF"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("CADR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PROGN"), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CURRENT-CONS"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))))))));

    public static final SubLList $list217 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("LIST"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT"))))));

    public static final SubLList $list218 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("RET"), NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("RET"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))));

    public static final SubLList $list219 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-END-POINTER"), list(makeSymbol("GET-END-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("RET"), NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), NIL), list(makeSymbol("RET"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("CDOSUBLISTS"), list(makeSymbol("TEMPLATE-CONTENTS-SUBLIST"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CONTENTS-SUBLIST")), makeSymbol("TEMPLATE-END-POINTER")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESULT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-END-POINTER")))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-CONTENTS-SUBLIST"), NIL), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS-SUBLIST")), list(makeSymbol("RET"), makeSymbol("TEMPLATE-RESULT"))))), list(makeSymbol("RET"), NIL)));

    public static final SubLList $list220 = list(list(makeSymbol("PUNLESS"), makeSymbol("OTHER-LIST"), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("MUST"), list(makeSymbol("LIST-TEMPLATE-P"), makeSymbol("OTHER-LIST")), makeString("(APPEND ~S): ~S is not an instance of LIST-TEMPLATE."), makeSymbol("SELF"), makeSymbol("OTHER-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OTHER-LIST"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENTS")))))), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), list(makeSymbol("NCONC"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")), makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"))), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    public static final SubLList $list221 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-REVERSED"), list(makeSymbol("REVERSE"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))))), list(makeSymbol("SET-CONTENTS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS-REVERSED")), list(makeSymbol("SET-END-POINTER"), makeSymbol("SELF"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-CONTENTS-REVERSED"))), list(makeSymbol("RET"), makeSymbol("SELF"))));



    public static final SubLList $list223 = list(makeSymbol("END-POINTER-LIST-TEMPLATE"));

    public static final SubLList $list224 = list(new SubLObject[]{ list(makeSymbol("END-POINTER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-END-POINTER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-END-POINTER"), list(makeSymbol("NEW-END-POINTER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NTH"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    public static final SubLSymbol END_POINTER = makeSymbol("END-POINTER");

    public static final SubLSymbol BASIC_END_POINTER_LIST_EMPTY_P_METHOD = makeSymbol("BASIC-END-POINTER-LIST-EMPTY-P-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_REVERSE_METHOD = makeSymbol("BASIC-END-POINTER-LIST-REVERSE-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_APPEND_METHOD = makeSymbol("BASIC-END-POINTER-LIST-APPEND-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_POSITION_METHOD = makeSymbol("BASIC-END-POINTER-LIST-POSITION-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_NTH_METHOD = makeSymbol("BASIC-END-POINTER-LIST-NTH-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_BUT_LAST_METHOD = makeSymbol("BASIC-END-POINTER-LIST-BUT-LAST-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_POP_METHOD = makeSymbol("BASIC-END-POINTER-LIST-POP-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_PUSH_METHOD = makeSymbol("BASIC-END-POINTER-LIST-PUSH-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_REMOVE_METHOD = makeSymbol("BASIC-END-POINTER-LIST-REMOVE-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_ADD_METHOD = makeSymbol("BASIC-END-POINTER-LIST-ADD-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_CLEAR_METHOD = makeSymbol("BASIC-END-POINTER-LIST-CLEAR-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_PRINT_METHOD = makeSymbol("BASIC-END-POINTER-LIST-PRINT-METHOD");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-INSTANCE");



    public static final SubLList $list241 = list(list(makeSymbol("RET"), makeSymbol("END-POINTER")));

    public static final SubLSymbol $sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-END-POINTER-LIST-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_GET_END_POINTER_METHOD = makeSymbol("BASIC-END-POINTER-LIST-GET-END-POINTER-METHOD");



    public static final SubLList $list245 = list(makeSymbol("NEW-END-POINTER"));

    public static final SubLList $list246 = list(list(makeSymbol("CSETQ"), makeSymbol("END-POINTER"), makeSymbol("NEW-END-POINTER")), list(makeSymbol("RET"), makeSymbol("NEW-END-POINTER")));

    public static final SubLSymbol $sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-END-POINTER-LIST-METHOD");

    public static final SubLSymbol BASIC_END_POINTER_LIST_SET_END_POINTER_METHOD = makeSymbol("BASIC-END-POINTER-LIST-SET-END-POINTER-METHOD");

    public static final SubLSymbol DOUBLE_LINK_CELL = makeSymbol("DOUBLE-LINK-CELL");



    public static final SubLList $list251 = list(makeSymbol("OWNER"), makeSymbol("CONTENTS"), makeSymbol("PREVIOUS"), makeSymbol("NEXT"));

    public static final SubLList $list252 = list(makeKeyword("OWNER"), makeKeyword("CONTENTS"), makeKeyword("PREVIOUS"), makeKeyword("NEXT"));

    public static final SubLList $list253 = list(makeSymbol("DLC-OWNER"), makeSymbol("DLC-CONTENTS"), makeSymbol("DLC-PREVIOUS"), makeSymbol("DLC-NEXT"));

    public static final SubLList $list254 = list(makeSymbol("_CSETF-DLC-OWNER"), makeSymbol("_CSETF-DLC-CONTENTS"), makeSymbol("_CSETF-DLC-PREVIOUS"), makeSymbol("_CSETF-DLC-NEXT"));



    public static final SubLSymbol DOUBLE_LINK_CELL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DOUBLE-LINK-CELL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list257 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DOUBLE-LINK-CELL-P"));



    private static final SubLSymbol _CSETF_DLC_OWNER = makeSymbol("_CSETF-DLC-OWNER");



    private static final SubLSymbol _CSETF_DLC_CONTENTS = makeSymbol("_CSETF-DLC-CONTENTS");



    private static final SubLSymbol _CSETF_DLC_PREVIOUS = makeSymbol("_CSETF-DLC-PREVIOUS");



    private static final SubLSymbol _CSETF_DLC_NEXT = makeSymbol("_CSETF-DLC-NEXT");









    private static final SubLString $str270$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");









    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DOUBLE_LINK_CELL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DOUBLE-LINK-CELL-METHOD");

    public static final SubLList $list276 = list(makeSymbol("DLC"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $$$dlc = makeString("dlc");

    private static final SubLSymbol DLC_ = makeSymbol("DLC-");



    public static final SubLList $list280 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-LINKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-LINKS"), list(makeSymbol("NEW-PARENT-LINKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARENT-LINK"), list(makeSymbol("NEW-PARENT-LINK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-PARENT-LINK"), list(makeSymbol("OLD-PARENT-LINK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-COLLECTION"), list(makeSymbol("COLLECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSFER-SELF"), list(makeSymbol("CURRENT-COLLECTION"), makeSymbol("NEW-COLLECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("COLLECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COLLECTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("PUBLIC")) });



    public static final SubLList $list282 = list(makeSymbol("NEW-PARENT-LINK"));

    public static final SubLList $list283 = list(list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-PARENT-LINK"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ON-ADD")), list(makeSymbol("DLC-OWNER"), makeSymbol("NEW-PARENT-LINK"))), list(makeSymbol("RET"), makeSymbol("NEW-PARENT-LINK")));



    public static final SubLList $list285 = list(makeSymbol("OLD-PARENT-LINK"));

    public static final SubLList $list286 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ON-DELETE")), list(makeSymbol("DLC-OWNER"), makeSymbol("OLD-PARENT-LINK"))), list(makeSymbol("RET"), makeSymbol("OLD-PARENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))))))), list(makeSymbol("RET"), NIL)));



    public static final SubLList $list288 = list(makeSymbol("COLLECTION"));

    public static final SubLList $list289 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ON-DELETE")), makeSymbol("COLLECTION")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(makeSymbol("RET"), makeSymbol("SELF"))));



    public static final SubLList $list291 = list(makeSymbol("CURRENT-COLLECTION"), makeSymbol("NEW-COLLECTION"));

    private static final SubLList $list292 = list(list(makeSymbol("MUST"), list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("CURRENT-COLLECTION")), makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), makeSymbol("SELF"), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("MUST"), list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("CURRENT-COLLECTION")), makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), makeSymbol("SELF"), makeSymbol("NEW-COLLECTION")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-COLLECTION"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("SELF")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(makeSymbol("RET"), makeSymbol("SELF"))));



    public static final SubLList $list294 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), NIL))), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), NIL)), list(makeSymbol("RET"), makeSymbol("SELF"))));

    private static final SubLList $list295 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(makeSymbol("RET"), T))), list(makeSymbol("RET"), NIL)));



    public static final SubLList $list297 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-COLLECTIONS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS"), makeSymbol("TEMPLATE-COLLECTIONS")), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK"))), list(makeSymbol("RET"), list(makeSymbol("UNIQUE-ELEMENTS"), makeSymbol("TEMPLATE-COLLECTIONS")))));



    private static final SubLList $list299 = list(makeSymbol("PARENT-LIST"));

    public static final SubLList $list300 = list(list(makeSymbol("IGNORE"), makeSymbol("PARENT-LIST")), list(makeSymbol("RET"), NIL));





    private static final SubLList $list303 = list(makeSymbol("ACTION"), makeSymbol("PARAMETERS"));

    private static final SubLList $list304 = list(list(makeSymbol("IGNORE"), makeSymbol("ACTION"), makeSymbol("PARAMETERS")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol BASIC_LIST_ELEMENT = makeSymbol("BASIC-LIST-ELEMENT");

    private static final SubLList $list306 = list(makeSymbol("LIST-ELEMENT-TEMPLATE"));

    private static final SubLList $list307 = list(new SubLObject[]{ list(makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-LINKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-LINKS"), list(makeSymbol("NEW-PARENT-LINKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARENT-LINK"), list(makeSymbol("NEW-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-PARENT-LINK"), list(makeSymbol("OLD-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-COLLECTION"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSFER-SELF"), list(makeSymbol("CURRENT-COLLECTION"), makeSymbol("NEW-COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });





    private static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol BASIC_LIST_ELEMENT_PERFORM_ACTION_METHOD = makeSymbol("BASIC-LIST-ELEMENT-PERFORM-ACTION-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_ON_DELETE_METHOD = makeSymbol("BASIC-LIST-ELEMENT-ON-DELETE-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_ON_ADD_METHOD = makeSymbol("BASIC-LIST-ELEMENT-ON-ADD-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_GET_COLLECTIONS_METHOD = makeSymbol("BASIC-LIST-ELEMENT-GET-COLLECTIONS-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_MEMBER_P_METHOD = makeSymbol("BASIC-LIST-ELEMENT-MEMBER-P-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD = makeSymbol("BASIC-LIST-ELEMENT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD");

    private static final SubLString $str317$_TRANSFER_SELF__S____S_is_not_an_ = makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE.");

    private static final SubLSymbol BASIC_LIST_ELEMENT_TRANSFER_SELF_METHOD = makeSymbol("BASIC-LIST-ELEMENT-TRANSFER-SELF-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_DELETE_SELF_FROM_COLLECTION_METHOD = makeSymbol("BASIC-LIST-ELEMENT-DELETE-SELF-FROM-COLLECTION-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_DELETE_PARENT_LINK_METHOD = makeSymbol("BASIC-LIST-ELEMENT-DELETE-PARENT-LINK-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_ADD_PARENT_LINK_METHOD = makeSymbol("BASIC-LIST-ELEMENT-ADD-PARENT-LINK-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-INSTANCE");

    private static final SubLList $list324 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_INITIALIZE_METHOD = makeSymbol("BASIC-LIST-ELEMENT-INITIALIZE-METHOD");



    private static final SubLList $list328 = list(list(makeSymbol("RET"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS")));

    private static final SubLSymbol $sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_GET_PARENT_LINKS_METHOD = makeSymbol("BASIC-LIST-ELEMENT-GET-PARENT-LINKS-METHOD");



    private static final SubLList $list332 = list(makeSymbol("NEW-PARENT-LINKS"));

    private static final SubLList $list333 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeSymbol("NEW-PARENT-LINKS")), list(makeSymbol("RET"), makeSymbol("NEW-PARENT-LINKS")));

    private static final SubLSymbol $sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_SET_PARENT_LINKS_METHOD = makeSymbol("BASIC-LIST-ELEMENT-SET-PARENT-LINKS-METHOD");



    private static final SubLList $list337 = list(list(makeSymbol("RET"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE")));

    private static final SubLSymbol $sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_GET_SELF_DELETION_MODE_METHOD = makeSymbol("BASIC-LIST-ELEMENT-GET-SELF-DELETION-MODE-METHOD");



    private static final SubLList $list341 = list(makeSymbol("MODE"));

    public static final SubLList $list342 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeSymbol("MODE")), list(makeSymbol("RET"), makeSymbol("MODE")));

    private static final SubLSymbol $sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");

    private static final SubLSymbol BASIC_LIST_ELEMENT_SET_SELF_DELETION_MODE_METHOD = makeSymbol("BASIC-LIST-ELEMENT-SET-SELF-DELETION-MODE-METHOD");



    private static final SubLList $list346 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-COUNT"), list(makeSymbol("NEW-ELEMENT-COUNT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-LINK"), list(makeSymbol("NEW-FIRST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LAST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LAST-LINK"), list(makeSymbol("NEW-LAST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-LINK"), list(makeSymbol("LINK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE-LINK"), list(makeSymbol("LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-LINK"), list(makeSymbol("ELEMENT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-NTH-LINK"), list(makeSymbol("INDEX")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NTH"), list(makeSymbol("INDEX")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SWAP"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("PUBLIC")) });



    private static final SubLList $list348 = list(makeSymbol("LINK"));

    public static final SubLList $list349 = list(list(makeSymbol("MUST"), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("LINK")), makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("LINK")), list(makeSymbol("MUST"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("LINK")), makeSymbol("SELF")), makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S."), makeSymbol("SELF"), makeSymbol("LINK"), makeSymbol("SELF")), list(makeSymbol("DEC-ELEMENT-COUNT"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("CNOT"), makeSymbol("TEMPLATE-LAST-LINK")))), makeString("(DELETE-LINK ~S): Detected inconsistancy in list."), makeSymbol("SELF")), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("LINK")), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-LAST-LINK"), makeSymbol("LINK")), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("RET"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SECOND-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-SECOND-LINK")), NIL), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-SECOND-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(makeSymbol("RET"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK"))))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-LAST-LINK"), makeSymbol("LINK")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SECOND-LINK"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-SECOND-LINK")), NIL), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-SECOND-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(makeSymbol("RET"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BEFORE-LINK"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK"))), list(makeSymbol("TEMPLATE-AFTER-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-BEFORE-LINK")), makeSymbol("TEMPLATE-AFTER-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-AFTER-LINK")), makeSymbol("TEMPLATE-BEFORE-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(makeSymbol("RET"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK"))))))));



    public static final SubLList $list351 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK"))), list(makeSymbol("TEMPLATE-NEXT"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), makeSymbol("TEMPLATE-NEXT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), makeSymbol("TEMPLATE-PREVIOUS")), list(makeSymbol("RET"), makeSymbol("LINK"))));



    public static final SubLList $list353 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("ELEMENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("RET"), makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(makeSymbol("RET"), NIL)));



    public static final SubLList $list355 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("COUNT"), makeSymbol("INDEX")), list(makeSymbol("RET"), makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("CINC"), makeSymbol("COUNT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(makeSymbol("RET"), NIL)));

    public static final SubLList $list356 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), NIL), list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-FIRST-LINK"))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("CPUSH"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-CURRENT-LINK")), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-CURRENT-LINK")))))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("TEMPLATE-CONTENTS")))));

    public static final SubLList $list357 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(makeSymbol("RET"), makeSymbol("NEW-CONTENTS")));

    public static final SubLList $list358 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DLIST[]"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DLIST[~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]")))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLList $list359 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(makeSymbol("RET"), NIL)));

    public static final SubLList $list360 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-LINK"), list(makeSymbol("MAKE-DOUBLE-LINK-CELL"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("SELF")), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LAST-LINK")), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("TEMPLATE-LAST-LINK"))), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-NEW-LINK")))), list(makeSymbol("INC-ELEMENT-COUNT"), makeSymbol("SELF")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT")));

    public static final SubLList $list361 = list(list(makeSymbol("PIF"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("OLD-ELEMENT")), list(makeSymbol("GENERIC-DLLT-DELETE-SELF-FROM-COLLECTION-FUNCTION"), makeSymbol("OLD-ELEMENT"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LINK"))))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")));

    public static final SubLList $list362 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT")))), list(makeSymbol("RET"), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-LINK"), T, NIL))));

    public static final SubLList $list363 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-NEW-LINK"), list(makeSymbol("MAKE-DOUBLE-LINK-CELL")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("SELF")), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-FIRST-LINK")), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("INC-ELEMENT-COUNT"), makeSymbol("SELF")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT"))));

    public static final SubLList $list364 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-FIRST-LINK")))), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("RET"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("RET"), NIL)));

    public static final SubLList $list365 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LAST-LINK")))), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("RET"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("RET"), NIL)));

    private static final SubLList $list366 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-NTH-LINK"), makeSymbol("SELF"), makeSymbol("INDEX")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(makeSymbol("RET"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")))), list(makeSymbol("RET"), NIL)));

    public static final SubLList $list367 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-NTH-LINK"), makeSymbol("SELF"), makeSymbol("INDEX")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("TEMPLATE-CONTENT")), list(makeSymbol("GENERIC-DLLT-DELETE-PARENT-LINK-FUNCTION"), makeSymbol("TEMPLATE-CONTENT"), makeSymbol("TEMPLATE-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-LINK")))), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT")))), list(makeSymbol("RET"), NIL));

    private static final SubLList $list368 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("RET"), NIL)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("ELEMENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("RET"), makeSymbol("COUNT"))), list(makeSymbol("CINC"), makeSymbol("COUNT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(makeSymbol("RET"), NIL)));

    public static final SubLList $list369 = list(list(makeSymbol("PUNLESS"), makeSymbol("OTHER-LIST"), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("OTHER-LIST")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("OTHER-LIST")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("MUST"), list(makeSymbol("LIST-TEMPLATE-P"), makeSymbol("OTHER-LIST")), makeString("(APPEND ~S): Cannot append non list ~S."), makeSymbol("SELF"), makeSymbol("OTHER-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OTHER-LIST"), list(makeSymbol("QUOTE"), makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("FIRST"))))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))))), list(makeSymbol("RET"), makeSymbol("SELF"))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLList $list370 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("RET"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-FIRST-LINK")), makeSymbol("TEMPLATE-NEXT-LINK")), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NEXT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-CURRENT-LINK"))), list(makeSymbol("REVERSE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CURRENT-LINK")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-NEXT-LINK"))), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-FIRST-LINK"))), list(makeSymbol("RET"), makeSymbol("SELF"))));

    private static final SubLList $list371 = list(list(makeSymbol("RET"), list(makeSymbol("NULL"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))));



    private static final SubLList $list373 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), list(makeSymbol("RET"), NIL)), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeString("(SWAP ~S): Cannot swap NIL elements."), makeSymbol("SELF")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LINK1"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT1"))), list(makeSymbol("LINK2"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT2")))), list(makeSymbol("MUST"), makeSymbol("LINK1"), makeString("(SWAP ~S): ~S is not an element of this list."), makeSymbol("SELF"), makeSymbol("ELEMENT1")), list(makeSymbol("MUST"), makeSymbol("LINK2"), makeString("(SWAP ~S): ~S is not an element of this list."), makeSymbol("SELF"), makeSymbol("ELEMENT2")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("ELEMENT1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT1"), list(makeSymbol("QUOTE"), makeSymbol("DELETE-PARENT-LINK")), makeSymbol("LINK1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT1"), list(makeSymbol("QUOTE"), makeSymbol("ADD-PARENT-LINK")), makeSymbol("LINK2"))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("ELEMENT2")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT2"), list(makeSymbol("QUOTE"), makeSymbol("DELETE-PARENT-LINK")), makeSymbol("LINK2")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT2"), list(makeSymbol("QUOTE"), makeSymbol("ADD-PARENT-LINK")), makeSymbol("LINK1"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK1")), makeSymbol("ELEMENT2")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK2")), makeSymbol("ELEMENT1")), list(makeSymbol("RET"), NIL) }));



    private static final SubLList $list375 = list(makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE"));

    private static final SubLList $list376 = list(new SubLObject[]{ list(makeSymbol("ELEMENT-EQUALITY-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ELEMENT-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("FIRST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELEMENT-EQUAL-P"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-COUNT"), list(makeSymbol("NEW-ELEMENT-COUNT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-LINK"), list(makeSymbol("NEW-FIRST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LAST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LAST-LINK"), list(makeSymbol("NEW-LAST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-LINK"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-NTH-LINK"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NTH"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SWAP"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("ENUMERATOR")), makeKeyword("PUBLIC")) });







    private static final SubLString $str380$_SWAP__S___Cannot_swap_NIL_elemen = makeString("(SWAP ~S): Cannot swap NIL elements.");

    private static final SubLString $str381$_SWAP__S____S_is_not_an_element_o = makeString("(SWAP ~S): ~S is not an element of this list.");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_SWAP_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-SWAP-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_EMPTY_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-EMPTY-P-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_REVERSE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-REVERSE-METHOD");

    private static final SubLString $str385$_APPEND__S___Cannot_append_non_li = makeString("(APPEND ~S): Cannot append non list ~S.");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_APPEND_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-APPEND-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_POSITION_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-POSITION-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_SET_NTH_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-NTH-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_NTH_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-NTH-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_BUT_LAST_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-BUT-LAST-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_POP_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-POP-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_PUSH_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-PUSH-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_MEMBER_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-MEMBER-P-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_REMOVE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-REMOVE-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ADD_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ADD-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_CLEAR_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-CLEAR-METHOD");

    private static final SubLString $str397$DLIST__ = makeString("DLIST[]");

    private static final SubLString $str398$DLIST__S = makeString("DLIST[~S");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_PRINT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-PRINT-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_FIND_NTH_LINK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-FIND-NTH-LINK-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_FIND_LINK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-FIND-LINK-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_REVERSE_LINK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-REVERSE-LINK-METHOD");

    private static final SubLString $str403$_DELETE_LINK__S____S_is_not_a_val = makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL.");

    private static final SubLString $str404$_DELETE_LINK__S___Link__S_is_not_ = makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S.");

    private static final SubLString $str405$_DELETE_LINK__S___Detected_incons = makeString("(DELETE-LINK ~S): Detected inconsistancy in list.");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_DELETE_LINK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-DELETE-LINK-METHOD");

    private static final SubLString $str407$_SET_CONTENTS__S___Cannot_set_the = makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list.");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_SET_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_GET_CONTENTS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ELEMENT_EQUAL_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUAL-P-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-INSTANCE");

    private static final SubLSymbol $sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-EQUALITY-PREDICATE-METHOD");

    private static final SubLSymbol $sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-EQUALITY-PREDICATE-METHOD");



    public static final SubLList $list418 = list(makeSymbol("NEW-ELEMENT-COUNT"));

    private static final SubLList $list419 = list(list(makeSymbol("MUST"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-ELEMENT-COUNT")), makeString("(SET-ELEMENT-COUNT ~S): ~S is not a legal element count value.  Expecting an integer."), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), makeSymbol("NEW-ELEMENT-COUNT")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT-COUNT")));

    private static final SubLSymbol $sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLString $str421$_SET_ELEMENT_COUNT__S____S_is_not = makeString("(SET-ELEMENT-COUNT ~S): ~S is not a legal element count value.  Expecting an integer.");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-COUNT-METHOD");



    private static final SubLList $list424 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), ONE_INTEGER), list(makeSymbol("CINC"), makeSymbol("ELEMENT-COUNT"))), list(makeSymbol("RET"), makeSymbol("ELEMENT-COUNT")));

    private static final SubLSymbol $sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_INC_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-INC-ELEMENT-COUNT-METHOD");



    private static final SubLList $list428 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-COUNT"), ZERO_INTEGER), list(makeSymbol("CDEC"), makeSymbol("ELEMENT-COUNT"))), list(makeSymbol("RET"), makeSymbol("ELEMENT-COUNT")));

    private static final SubLSymbol $sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_DEC_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-DEC-ELEMENT-COUNT-METHOD");



    private static final SubLList $list432 = list(list(makeSymbol("RET"), makeSymbol("FIRST-LINK")));

    private static final SubLSymbol $sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_GET_FIRST_LINK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-FIRST-LINK-METHOD");



    public static final SubLList $list436 = list(makeSymbol("NEW-FIRST-LINK"));

    private static final SubLList $list437 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("NEW-FIRST-LINK"))), makeString("(SET-FIRST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-LINK"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("RET"), makeSymbol("NEW-FIRST-LINK")));

    private static final SubLSymbol $sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLString $str439$_SET_FIRST_LINK__S____S_is_not_an = makeString("(SET-FIRST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL.");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_SET_FIRST_LINK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-FIRST-LINK-METHOD");



    private static final SubLList $list442 = list(list(makeSymbol("RET"), makeSymbol("LAST-LINK")));

    private static final SubLSymbol $sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_GET_LAST_LINK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-LAST-LINK-METHOD");



    private static final SubLList $list446 = list(makeSymbol("NEW-LAST-LINK"));

    private static final SubLList $list447 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("NEW-LAST-LINK"))), makeString("(SET-LAST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("LAST-LINK"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("RET"), makeSymbol("NEW-LAST-LINK")));

    private static final SubLSymbol $sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLString $str449$_SET_LAST_LINK__S____S_is_not_an_ = makeString("(SET-LAST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL.");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_SET_LAST_LINK_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-LAST-LINK-METHOD");

    private static final SubLList $list451 = list(list(makeSymbol("RET"), makeSymbol("ELEMENT-COUNT")));

    private static final SubLSymbol $sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-COUNT-METHOD");



    private static final SubLList $list455 = list(new SubLObject[]{ list(makeSymbol("FIRST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DIRECTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISOLATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("PUBLIC")) });



    private static final SubLSymbol $sym457$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CLASS");

    private static final SubLSymbol $sym458$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INSTANCE");

    private static final SubLList $list459 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-LINK"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LAST-LINK"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-LINK"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("NONE")), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_INITIALIZE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INITIALIZE-METHOD");



    private static final SubLList $list463 = list(list(makeSymbol("PWHEN"), makeSymbol("FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-LINK"), makeSymbol("FIRST-LINK")), list(makeSymbol("NEXT-LINK"), NIL)), list(makeSymbol("WHILE"), makeSymbol("CURRENT-LINK"), list(makeSymbol("CSETQ"), makeSymbol("NEXT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("CURRENT-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("CURRENT-LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("CURRENT-LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("CURRENT-LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("CURRENT-LINK")), NIL), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-LINK"), makeSymbol("NEXT-LINK"))))), list(new SubLObject[]{ makeSymbol("CSETQ"), makeSymbol("FIRST-LINK"), NIL, makeSymbol("LAST-LINK"), NIL, makeSymbol("CURRENT-LINK"), NIL, makeSymbol("DIRECTION"), makeKeyword("NONE") }), list(makeSymbol("ISOLATE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_ISOLATE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-ISOLATE-METHOD");



    private static final SubLList $list467 = list(makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK"));

    public static final SubLList $list468 = list(list(makeSymbol("CSETQ"), makeSymbol("FIRST-LINK"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("LAST-LINK"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-LINK"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("FORWARDS")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_SET_INITIAL_STATE_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-SET-INITIAL-STATE-METHOD");

    public static final SubLList $list471 = list(list(makeSymbol("RET"), list(makeSymbol("NULL"), makeSymbol("FIRST-LINK"))));

    public static final SubLSymbol $sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_EMPTY_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-EMPTY-P-METHOD");

    public static final SubLList $list474 = list(list(makeSymbol("RET"), list(EQ, makeSymbol("FIRST-LINK"), makeSymbol("CURRENT-LINK"))));

    public static final SubLSymbol $sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-P-METHOD");

    public static final SubLList $list477 = list(list(makeSymbol("PWHEN"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF")), list(makeSymbol("RET"), T)), list(makeSymbol("PUNLESS"), makeSymbol("CURRENT-LINK"), list(makeSymbol("RET"), T)), list(makeSymbol("RET"), list(makeSymbol("NULL"), list(makeSymbol("DLC-NEXT"), makeSymbol("CURRENT-LINK")))));

    private static final SubLSymbol $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_P_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-P-METHOD");

    public static final SubLList $list480 = list(list(makeSymbol("PUNLESS"), makeSymbol("CURRENT-LINK"), list(makeSymbol("RET"), NIL)), list(makeSymbol("RET"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("CURRENT-LINK"))));

    private static final SubLSymbol $sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_CURRENT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-METHOD");

    private static final SubLList $list483 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    public static final SubLList $list484 = list(list(makeSymbol("CSETQ"), makeSymbol("CURRENT-LINK"), makeSymbol("FIRST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("FORWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF"))));

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-METHOD");

    public static final SubLList $list486 = list(list(makeSymbol("CSETQ"), makeSymbol("CURRENT-LINK"), makeSymbol("LAST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("BACKWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF"))));

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-METHOD");

    private static final SubLList $list488 = list(list(makeSymbol("PUNLESS"), makeSymbol("CURRENT-LINK"), list(makeSymbol("PCASE"), makeSymbol("DIRECTION"), list(makeKeyword("FORWARDS"), list(makeSymbol("RET"), NIL)), list(makeKeyword("BACKWARDS"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-LINK"), makeSymbol("FIRST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("FORWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(makeSymbol("OTHERWISE"), list(makeSymbol("RET"), NIL)))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("CURRENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("FORWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF"))));

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_NEXT_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-NEXT-METHOD");

    private static final SubLList $list490 = list(list(makeSymbol("PUNLESS"), makeSymbol("CURRENT-LINK"), list(makeSymbol("PCASE"), makeSymbol("DIRECTION"), list(makeKeyword("FORWARDS"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-LINK"), makeSymbol("LAST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("BACKWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF")))), list(makeKeyword("BACKWARDS"), list(makeSymbol("RET"), NIL)), list(makeSymbol("OTHERWISE"), list(makeSymbol("RET"), NIL)))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-LINK"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("CURRENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("BACKWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF"))));

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_PREVIOUS_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-PREVIOUS-METHOD");

    public static final SubLList $list492 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), list(makeSymbol("QUOTE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR"))))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("DLC-COPY-LINKS"), makeSymbol("FIRST-LINK"), makeSymbol("NEW-ENUMERATOR")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("NEW-ENUMERATOR"), makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("RET"), makeSymbol("NEW-ENUMERATOR")))));

    private static final SubLSymbol $sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-ALLOCATE-ENUMERATOR-METHOD");

    public static final SubLList $list495 = list(list(makeSymbol("PWHEN"), list(makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-P"), makeSymbol("ENUMERATOR")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ISOLATE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("ENUMERATOR"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol BASIC_DOUBLY_LINKED_LIST_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-DOUBLY-LINKED-LIST-DEALLOCATE-ENUMERATOR-METHOD");

    private static final SubLSymbol PAIR_TEMPLATE = makeSymbol("PAIR-TEMPLATE");

    private static final SubLList $list498 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST"), list(makeSymbol("NEW-FIRST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SECOND"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SECOND"), list(makeSymbol("NEW-SECOND")), makeKeyword("PUBLIC")));

    private static final SubLList $list499 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(~S, ~S)"), list(makeSymbol("GET-FIRST"), makeSymbol("SELF")), list(makeSymbol("GET-SECOND"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol BASIC_PAIR = makeSymbol("BASIC-PAIR");

    private static final SubLList $list501 = list(makeSymbol("PAIR-TEMPLATE"));

    private static final SubLList $list502 = list(list(makeSymbol("FIRST-ELEMENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SECOND-ELEMENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST"), list(makeSymbol("NEW-FIRST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SECOND"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SECOND"), list(makeSymbol("NEW-SECOND")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SECOND_ELEMENT = makeSymbol("SECOND-ELEMENT");



    private static final SubLString $str505$__S___S_ = makeString("(~S, ~S)");

    private static final SubLSymbol BASIC_PAIR_PRINT_METHOD = makeSymbol("BASIC-PAIR-PRINT-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-INSTANCE");

    private static final SubLList $list509 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-ELEMENT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SECOND-ELEMENT"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");

    private static final SubLSymbol BASIC_PAIR_INITIALIZE_METHOD = makeSymbol("BASIC-PAIR-INITIALIZE-METHOD");



    private static final SubLList $list513 = list(list(makeSymbol("RET"), makeSymbol("FIRST-ELEMENT")));

    private static final SubLSymbol $sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");

    private static final SubLSymbol BASIC_PAIR_GET_FIRST_METHOD = makeSymbol("BASIC-PAIR-GET-FIRST-METHOD");



    private static final SubLList $list517 = list(makeSymbol("NEW-FIRST"));

    private static final SubLList $list518 = list(list(makeSymbol("CSETQ"), makeSymbol("FIRST-ELEMENT"), makeSymbol("NEW-FIRST")), list(makeSymbol("RET"), makeSymbol("NEW-FIRST")));

    private static final SubLSymbol $sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");

    private static final SubLSymbol BASIC_PAIR_SET_FIRST_METHOD = makeSymbol("BASIC-PAIR-SET-FIRST-METHOD");



    private static final SubLList $list522 = list(list(makeSymbol("RET"), makeSymbol("SECOND-ELEMENT")));

    private static final SubLSymbol $sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");

    private static final SubLSymbol BASIC_PAIR_GET_SECOND_METHOD = makeSymbol("BASIC-PAIR-GET-SECOND-METHOD");



    public static final SubLList $list526 = list(makeSymbol("NEW-SECOND"));

    public static final SubLList $list527 = list(list(makeSymbol("CSETQ"), makeSymbol("SECOND-ELEMENT"), makeSymbol("NEW-SECOND")), list(makeSymbol("RET"), makeSymbol("NEW-SECOND")));

    private static final SubLSymbol $sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");

    private static final SubLSymbol BASIC_PAIR_SET_SECOND_METHOD = makeSymbol("BASIC-PAIR-SET-SECOND-METHOD");

    private static final SubLSymbol TRIPLET_TEMPLATE = makeSymbol("TRIPLET-TEMPLATE");

    private static final SubLList $list531 = list(makeKeyword("EXTENDS"), list(makeSymbol("PAIR-TEMPLATE")));

    private static final SubLList $list532 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-THIRD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-THIRD"), list(makeSymbol("NEW-THIRD")), makeKeyword("PUBLIC")));

    private static final SubLList $list533 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(~S, ~S, ~S)"), list(makeSymbol("GET-FIRST"), makeSymbol("SELF")), list(makeSymbol("GET-SECOND"), makeSymbol("SELF")), list(makeSymbol("GET-THIRD"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol BASIC_TRIPLET = makeSymbol("BASIC-TRIPLET");

    private static final SubLList $list535 = list(makeSymbol("TRIPLET-TEMPLATE"));

    public static final SubLList $list536 = list(list(makeSymbol("THIRD-ELEMENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-THIRD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-THIRD"), list(makeSymbol("NEW-THIRD")), makeKeyword("PUBLIC")));



    private static final SubLString $str538$__S___S___S_ = makeString("(~S, ~S, ~S)");

    private static final SubLSymbol BASIC_TRIPLET_PRINT_METHOD = makeSymbol("BASIC-TRIPLET-PRINT-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-INSTANCE");

    private static final SubLList $list542 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("THIRD-ELEMENT"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-TRIPLET-METHOD");

    private static final SubLSymbol BASIC_TRIPLET_INITIALIZE_METHOD = makeSymbol("BASIC-TRIPLET-INITIALIZE-METHOD");

    private static final SubLSymbol GET_THIRD = makeSymbol("GET-THIRD");

    private static final SubLList $list546 = list(list(makeSymbol("RET"), makeSymbol("THIRD-ELEMENT")));

    private static final SubLSymbol $sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-TRIPLET-METHOD");

    private static final SubLSymbol BASIC_TRIPLET_GET_THIRD_METHOD = makeSymbol("BASIC-TRIPLET-GET-THIRD-METHOD");

    private static final SubLSymbol SET_THIRD = makeSymbol("SET-THIRD");

    private static final SubLList $list550 = list(makeSymbol("NEW-THIRD"));

    private static final SubLList $list551 = list(list(makeSymbol("CSETQ"), makeSymbol("THIRD-ELEMENT"), makeSymbol("NEW-THIRD")), list(makeSymbol("RET"), makeSymbol("NEW-THIRD")));

    private static final SubLSymbol $sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-TRIPLET-METHOD");

    private static final SubLSymbol BASIC_TRIPLET_SET_THIRD_METHOD = makeSymbol("BASIC-TRIPLET-SET-THIRD-METHOD");



    private static final SubLList $list555 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-INSTANCE");

    public static final SubLList $list558 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("SUBLOOP-PRIVATE-PAIR(~S, ~S)"), list(makeSymbol("GET-FIRST"), makeSymbol("SELF")), list(makeSymbol("GET-SECOND"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLString $str559$SUBLOOP_PRIVATE_PAIR__S___S_ = makeString("SUBLOOP-PRIVATE-PAIR(~S, ~S)");

    private static final SubLSymbol SUBLOOP_PRIVATE_PAIR_PRINT_METHOD = makeSymbol("SUBLOOP-PRIVATE-PAIR-PRINT-METHOD");

    private static final SubLSymbol BAG_ENUMERATOR_TEMPLATE = makeSymbol("BAG-ENUMERATOR-TEMPLATE");

    public static final SubLList $list562 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS-POINTER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS-POINTER"), list(makeSymbol("NEW-POINTER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTION"), list(makeSymbol("NEW-DIRECTION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLList $list563 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("RET"), list(makeSymbol("NULL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER")))), list(makeSymbol("RET"), T))));

    public static final SubLList $list564 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("RET"), list(EQ, makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER")))), list(makeSymbol("RET"), NIL))));

    private static final SubLList $list565 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("CLET"), list(list(makeSymbol("LIST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER")))), list(makeSymbol("PIF"), makeSymbol("LIST"), list(makeSymbol("PIF"), list(makeSymbol("NULL"), list(makeSymbol("CDR"), makeSymbol("LIST"))), list(makeSymbol("CLET"), list(list(makeSymbol("ELEMENT"), list(makeSymbol("CAR"), makeSymbol("LIST")))), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("ELEMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("COUNT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"))), list(makeSymbol("QUANT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("ELEMENT")))), list(makeSymbol("RET"), list(makeSymbol("="), makeSymbol("COUNT"), makeSymbol("QUANT")))), list(makeSymbol("RET"), T))), list(makeSymbol("RET"), NIL)), list(makeSymbol("RET"), NIL))), list(makeSymbol("RET"), NIL))));

    public static final SubLList $list566 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("CLET"), list(list(makeSymbol("LIST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER")))), list(makeSymbol("PWHEN"), makeSymbol("LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("ELEMENT"), list(makeSymbol("CAR"), makeSymbol("LIST")))), list(makeSymbol("PWHEN"), makeSymbol("ELEMENT"), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("ELEMENT")), list(makeSymbol("RET"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("ELEMENT"))), list(makeSymbol("RET"), makeSymbol("ELEMENT")))))))), list(makeSymbol("RET"), NIL)));

    public static final SubLList $list567 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), list(makeSymbol("QUOTE"), makeSymbol("SUBLOOP-PRIVATE-PAIR")))), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS-POINTER"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CONTENTS")))), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), ONE_INTEGER), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), NIL))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), NIL)), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("FORWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF")))));

    private static final SubLList $list568 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), list(makeSymbol("QUOTE"), makeSymbol("SUBLOOP-PRIVATE-PAIR")))), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CONTENTS-POINTER"))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("CLET"), list(list(makeSymbol("LAST-CONS"), list(makeSymbol("LAST"), makeSymbol("TEMPLATE-CONTENTS"))), list(makeSymbol("ELEMENT"), list(makeSymbol("CAR"), makeSymbol("LAST-CONS")))), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("ELEMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("COUNT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("ELEMENT")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), makeSymbol("LAST-CONS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), makeSymbol("COUNT"))), list(makeSymbol("PROGN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), makeSymbol("LAST-CONS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), NIL)))), list(makeSymbol("PROGN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), NIL), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"), NIL))), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("BACKWARDS")), list(makeSymbol("RET"), list(makeSymbol("CURRENT"), makeSymbol("SELF")))));

    private static final SubLList $list569 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DIRECTION"), list(makeSymbol("GET-DIRECTION"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEXT-ELEMENT"), makeSymbol("SUCCESS-P")), list(makeSymbol("SUBLOOP-COLLECTIONS-BAG-ENUM-GET-NEXT"), makeSymbol("TEMPLATE-CONTENTS-POINTER")), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("FORWARDS")), list(makeSymbol("PIF"), makeSymbol("SUCCESS-P"), list(makeSymbol("RET"), makeSymbol("NEXT-ELEMENT")), list(makeSymbol("RET"), NIL))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-DIRECTION"), makeKeyword("FORWARDS")), list(makeSymbol("RET"), NIL), list(makeSymbol("RET"), list(makeSymbol("FIRST"), makeSymbol("SELF")))))));

    private static final SubLList $list570 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-DIRECTION"), list(makeSymbol("GET-DIRECTION"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("GET-CONTENTS-POINTER"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-CONTENTS-POINTER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CONTENTS-POINTER"))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEXT-ELEMENT"), makeSymbol("SUCCESS-P")), list(makeSymbol("SUBLOOP-COLLECTIONS-BACKUP-POINTER"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")), makeSymbol("TEMPLATE-CONTENTS-POINTER")), list(makeSymbol("SET-DIRECTION"), makeSymbol("SELF"), makeKeyword("BACKWARDS")), list(makeSymbol("PIF"), makeSymbol("SUCCESS-P"), list(makeSymbol("RET"), makeSymbol("NEXT-ELEMENT")), list(makeSymbol("RET"), NIL))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-DIRECTION"), makeKeyword("BACKWARDS")), list(makeSymbol("RET"), NIL), list(makeSymbol("RET"), list(makeSymbol("LAST"), makeSymbol("SELF")))))));



    private static final SubLList $list572 = list(makeSymbol("BAG-ENUMERATOR-TEMPLATE"));

    private static final SubLList $list573 = list(new SubLObject[]{ list(makeSymbol("CONTENTS-POINTER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTENTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DIRECTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTANTIATE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS-POINTER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS-POINTER"), list(makeSymbol("NEW-POINTER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTION"), list(makeSymbol("NEW-DIRECTION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIRST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PREVIOUS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_PREVIOUS_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-PREVIOUS-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_NEXT_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-NEXT-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_LAST_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-LAST-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_FIRST_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-FIRST-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_CURRENT_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-CURRENT-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_LAST_P_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-LAST-P-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_FIRST_P_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-FIRST-P-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_EMPTY_P_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-EMPTY-P-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-INSTANCE");

    private static final SubLSymbol INSTANTIATE = makeSymbol("INSTANTIATE");

    public static final SubLList $list585 = list(list(makeSymbol("INSTANTIATE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS-POINTER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), list(makeSymbol("QUOTE"), makeSymbol("SUBLOOP-PRIVATE-PAIR")))), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("NONE")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_INSTANTIATE_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-INSTANTIATE-METHOD");

    private static final SubLSymbol $sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_GET_CONTENTS_POINTER_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-GET-CONTENTS-POINTER-METHOD");

    private static final SubLList $list590 = list(makeSymbol("NEW-POINTER"));

    public static final SubLList $list591 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-POINTER")), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("NEW-POINTER"))), makeString("(SET-CONTENTS-POINTER ~S): ~S is not an instance of SUBLOOP-PRIVATE-PAIR."), makeSymbol("SELF"), makeSymbol("NEW-POINTER")), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS-POINTER"), makeSymbol("NEW-POINTER")), list(makeSymbol("RET"), makeSymbol("NEW-POINTER")));

    public static final SubLSymbol $sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");

    private static final SubLString $str593$_SET_CONTENTS_POINTER__S____S_is_ = makeString("(SET-CONTENTS-POINTER ~S): ~S is not an instance of SUBLOOP-PRIVATE-PAIR.");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_SET_CONTENTS_POINTER_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-SET-CONTENTS-POINTER-METHOD");

    public static final SubLSymbol $sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_GET_CONTENTS_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-GET-CONTENTS-METHOD");

    public static final SubLList $list597 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): ~S is not an instance of LIST."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("RET"), makeSymbol("NEW-CONTENTS")));

    public static final SubLSymbol $sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");

    private static final SubLString $str599$_SET_CONTENTS__S____S_is_not_an_i = makeString("(SET-CONTENTS ~S): ~S is not an instance of LIST.");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_SET_CONTENTS_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-SET-CONTENTS-METHOD");

    private static final SubLSymbol $sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_GET_DIRECTION_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-GET-DIRECTION-METHOD");

    public static final SubLList $list603 = list(list(makeSymbol("MUST"), list(makeSymbol("SEQUENTIAL-DIRECTION-P"), makeSymbol("NEW-DIRECTION")), makeString("(SET-DIRECTION ~S): ~S is not an instance of SEQUANITIAL-DIRECTION."), makeSymbol("SELF"), makeSymbol("NEW-DIRECTION")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeSymbol("NEW-DIRECTION")), list(makeSymbol("RET"), makeSymbol("NEW-DIRECTION")));

    private static final SubLSymbol $sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");

    private static final SubLString $str605$_SET_DIRECTION__S____S_is_not_an_ = makeString("(SET-DIRECTION ~S): ~S is not an instance of SEQUANITIAL-DIRECTION.");

    private static final SubLSymbol BASIC_BAG_ENUMERATOR_SET_DIRECTION_METHOD = makeSymbol("BASIC-BAG-ENUMERATOR-SET-DIRECTION-METHOD");

    private static final SubLSymbol BAG_TEMPLATE = makeSymbol("BAG-TEMPLATE");

    public static final SubLList $list608 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-REPRESENTATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-REPRESENTATION"), list(makeSymbol("NEW-REP")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OCCURENCES"), list(makeSymbol("ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNIQUE-ELEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNIQUE-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLList $list609 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("BAG[]"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("BAG[~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]")))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLList $list610 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BAG-LIST"), list(makeSymbol("GET-INTERNAL-REPRESENTATION"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-COUNT"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-BAG-LIST")), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-COUNT"), list(makeSymbol("+"), makeSymbol("TEMPLATE-COUNT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-ELEMENT")))), list(makeSymbol("CINC"), makeSymbol("TEMPLATE-COUNT")))), list(makeSymbol("RET"), makeSymbol("TEMPLATE-COUNT"))));

    public static final SubLList $list611 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BAG-LIST"), list(makeSymbol("GET-INTERNAL-REPRESENTATION"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-CONTENTS"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-BAG-LIST"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("FIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("SUBLOOP-COLLECTIONS-BAG-TEMPLATE-TRANSLATE-PAIR"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("LIST"), makeSymbol("TEMPLATE-ELEMENT")))), list(makeSymbol("RET"), makeSymbol("TEMPLATE-CONTENTS"))));

    private static final SubLList $list612 = list(list(makeSymbol("SET-INTERNAL-REPRESENTATION"), makeSymbol("SELF"), NIL), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(makeSymbol("RET"), makeSymbol("NEW-CONTENTS")));

    public static final SubLList $list613 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BAG-LIST"), list(makeSymbol("GET-INTERNAL-REPRESENTATION"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-CURRENT-ELEMENT"), NIL)), list(makeSymbol("CDOSUBLISTS"), list(makeSymbol("TEMPLATE-SUBLIST"), makeSymbol("TEMPLATE-BAG-LIST")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLIST"))), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("TEMPLATE-CURRENT-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("+"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT")), ONE_INTEGER)), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-CURRENT-ELEMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-PAIR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), list(makeSymbol("QUOTE"), makeSymbol("SUBLOOP-PRIVATE-PAIR"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-NEW-PAIR"), makeSymbol("TEMPLATE-CURRENT-ELEMENT")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-NEW-PAIR"), TWO_INTEGER), list(makeSymbol("RPLACA"), makeSymbol("TEMPLATE-SUBLIST"), makeSymbol("TEMPLATE-NEW-PAIR")), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT")))))), list(makeSymbol("SET-INTERNAL-REPRESENTATION"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-BAG-LIST"))), list(makeSymbol("RET"), makeSymbol("NEW-ELEMENT"))));

    private static final SubLList $list614 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BAG-LIST"), list(makeSymbol("GET-INTERNAL-REPRESENTATION"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-BAG-LIST")), list(makeSymbol("RET"), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-BAG-LIST")))), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("TEMPLATE-CURRENT-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-COUNT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT")))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("TEMPLATE-COUNT"), TWO_INTEGER), list(makeSymbol("RPLACA"), makeSymbol("TEMPLATE-BAG-LIST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("-"), makeSymbol("TEMPLATE-COUNT"), ONE_INTEGER)), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT"), makeSymbol("TEMPLATE-CURRENT-ELEMENT")), list(makeSymbol("SET-INTERNAL-REPRESENTATION"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-BAG-LIST"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-BAG-LIST")), list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-BAG-LIST")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("TEMPLATE-CURRENT-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-COUNT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT")))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("TEMPLATE-COUNT"), TWO_INTEGER), list(makeSymbol("RPLACA"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-CURRENT-ELEMENT"), list(makeSymbol("-"), makeSymbol("TEMPLATE-COUNT"), ONE_INTEGER)), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT"), makeSymbol("TEMPLATE-CURRENT-ELEMENT")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RET"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS")))), list(makeSymbol("RET"), NIL))))));

    public static final SubLList $list615 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BAG-LIST"), list(makeSymbol("GET-INTERNAL-REPRESENTATION"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-BAG-LIST")), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-ELEMENT")), makeSymbol("ELEMENT")), list(makeSymbol("RET"), T)), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("ELEMENT")), list(makeSymbol("RET"), T)))), list(makeSymbol("RET"), NIL)));

    private static final SubLSymbol OCCURENCES = makeSymbol("OCCURENCES");

    private static final SubLList $list617 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BAG-LIST"), list(makeSymbol("GET-INTERNAL-REPRESENTATION"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-BAG-LIST")), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-ELEMENT")), makeSymbol("ELEMENT")), list(makeSymbol("RET"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SECOND"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-ELEMENT")))), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("ELEMENT")), list(makeSymbol("RET"), ONE_INTEGER)))), list(makeSymbol("RET"), ZERO_INTEGER)));



    public static final SubLList $list619 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-UNIQUE-ELEMENTS"), NIL), list(makeSymbol("TEMPLATE-BAG-LIST"), list(makeSymbol("GET-INTERNAL-REPRESENTATION"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-BAG-LIST")), list(makeSymbol("PIF"), list(makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("CPUSH"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-FIRST"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), makeSymbol("TEMPLATE-ELEMENT")), makeSymbol("TEMPLATE-UNIQUE-ELEMENTS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-UNIQUE-ELEMENTS")))), list(makeSymbol("RET"), makeSymbol("TEMPLATE-UNIQUE-ELEMENTS"))));

    private static final SubLSymbol GET_UNIQUE_ELEMENT_COUNT = makeSymbol("GET-UNIQUE-ELEMENT-COUNT");

    private static final SubLList $list621 = list(list(makeSymbol("RET"), list(makeSymbol("LENGTH"), list(makeSymbol("GET-INTERNAL-REPRESENTATION"), makeSymbol("SELF")))));

    private static final SubLList $list622 = list(list(makeSymbol("RET"), list(makeSymbol("NULL"), list(makeSymbol("GET-INTERNAL-REPRESENTATION"), makeSymbol("SELF")))));



    private static final SubLList $list624 = list(makeSymbol("BAG-TEMPLATE"));

    private static final SubLList $list625 = list(new SubLObject[]{ list(makeSymbol("BAG-REPRESENTATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-REPRESENTATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-REPRESENTATION"), list(makeSymbol("NEW-REP")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OCCURENCES"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNIQUE-ELEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNIQUE-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("ENUMERATOR")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol BAG_REPRESENTATION = makeSymbol("BAG-REPRESENTATION");

    private static final SubLSymbol BASIC_BAG_EMPTY_P_METHOD = makeSymbol("BASIC-BAG-EMPTY-P-METHOD");

    private static final SubLSymbol BASIC_BAG_GET_UNIQUE_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-BAG-GET-UNIQUE-ELEMENT-COUNT-METHOD");

    private static final SubLSymbol BASIC_BAG_GET_UNIQUE_ELEMENTS_METHOD = makeSymbol("BASIC-BAG-GET-UNIQUE-ELEMENTS-METHOD");

    private static final SubLSymbol BASIC_BAG_OCCURENCES_METHOD = makeSymbol("BASIC-BAG-OCCURENCES-METHOD");

    private static final SubLSymbol BASIC_BAG_MEMBER_P_METHOD = makeSymbol("BASIC-BAG-MEMBER-P-METHOD");

    private static final SubLSymbol BASIC_BAG_REMOVE_METHOD = makeSymbol("BASIC-BAG-REMOVE-METHOD");

    private static final SubLSymbol BASIC_BAG_ADD_METHOD = makeSymbol("BASIC-BAG-ADD-METHOD");

    private static final SubLSymbol BASIC_BAG_SET_CONTENTS_METHOD = makeSymbol("BASIC-BAG-SET-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_BAG_GET_CONTENTS_METHOD = makeSymbol("BASIC-BAG-GET-CONTENTS-METHOD");

    private static final SubLSymbol BASIC_BAG_GET_ELEMENT_COUNT_METHOD = makeSymbol("BASIC-BAG-GET-ELEMENT-COUNT-METHOD");

    private static final SubLString $str637$BAG__ = makeString("BAG[]");

    private static final SubLString $str638$BAG__S = makeString("BAG[~S");

    private static final SubLSymbol BASIC_BAG_PRINT_METHOD = makeSymbol("BASIC-BAG-PRINT-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-INSTANCE");

    private static final SubLList $list642 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("BAG-REPRESENTATION"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-METHOD");

    private static final SubLSymbol BASIC_BAG_INITIALIZE_METHOD = makeSymbol("BASIC-BAG-INITIALIZE-METHOD");



    private static final SubLList $list646 = list(list(makeSymbol("RET"), makeSymbol("BAG-REPRESENTATION")));

    private static final SubLSymbol $sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-METHOD");

    private static final SubLSymbol BASIC_BAG_GET_INTERNAL_REPRESENTATION_METHOD = makeSymbol("BASIC-BAG-GET-INTERNAL-REPRESENTATION-METHOD");

    private static final SubLSymbol SET_INTERNAL_REPRESENTATION = makeSymbol("SET-INTERNAL-REPRESENTATION");

    private static final SubLList $list650 = list(makeSymbol("NEW-REP"));

    private static final SubLList $list651 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-REP")), makeString("(SET-INTERNAL-REPRESENTATION ~S): ~S is not a valid bag representation.  Expecting an instance of LIST."), makeSymbol("SELF"), makeSymbol("NEW-REP")), list(makeSymbol("CSETQ"), makeSymbol("BAG-REPRESENTATION"), makeSymbol("NEW-REP")), list(makeSymbol("RET"), makeSymbol("NEW-REP")));

    private static final SubLSymbol $sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-METHOD");

    private static final SubLString $str653$_SET_INTERNAL_REPRESENTATION__S__ = makeString("(SET-INTERNAL-REPRESENTATION ~S): ~S is not a valid bag representation.  Expecting an instance of LIST.");

    private static final SubLSymbol BASIC_BAG_SET_INTERNAL_REPRESENTATION_METHOD = makeSymbol("BASIC-BAG-SET-INTERNAL-REPRESENTATION-METHOD");

    private static final SubLList $list655 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-BAG-ENUMERATOR")), list(makeSymbol("QUOTE"), makeSymbol("BASIC-BAG-ENUMERATOR")))), list(makeSymbol("CONTENTS-POINTER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SUBLOOP-PRIVATE-PAIR")), list(makeSymbol("QUOTE"), makeSymbol("SUBLOOP-PRIVATE-PAIR"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("BASIC-BAG-ENUMERATOR")), makeSymbol("NEW-ENUMERATOR"), makeSymbol("CONTENTS-POINTER")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-BAG-ENUMERATOR")), makeSymbol("NEW-ENUMERATOR"), makeSymbol("BAG-REPRESENTATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-BAG-ENUMERATOR")), makeSymbol("NEW-ENUMERATOR")), list(makeSymbol("RET"), makeSymbol("NEW-ENUMERATOR"))));

    private static final SubLSymbol $sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-METHOD");

    private static final SubLSymbol BASIC_BAG_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-BAG-ALLOCATE-ENUMERATOR-METHOD");

    private static final SubLList $list658 = list(list(makeSymbol("MUST"), list(makeSymbol("BASIC-BAG-ENUMERATOR-P"), makeSymbol("ENUMERATOR")), makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-BAG-ENUMERATOR."), makeSymbol("SELF"), makeSymbol("ENUMERATOR")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS-POINTER"), makeSymbol("BASIC-BAG-ENUMERATOR")), makeSymbol("ENUMERATOR"), NIL), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-BAG-ENUMERATOR")), makeSymbol("ENUMERATOR"), NIL), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ISOLATE"), makeSymbol("BASIC-BAG-ENUMERATOR")), makeSymbol("ENUMERATOR")), list(makeSymbol("RET"), NIL));

    private static final SubLString $str659$_DEALLOCATE_ENUMERATOR__S____S_is = makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-BAG-ENUMERATOR.");

    private static final SubLSymbol BASIC_BAG_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol("BASIC-BAG-DEALLOCATE-ENUMERATOR-METHOD");

    private static final SubLSymbol TEST_LIST_ELEMENT = makeSymbol("TEST-LIST-ELEMENT");

    private static final SubLList $list662 = list(list(makeSymbol("SYMBOLIC-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SYMBOLIC-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SYMBOLIC-NAME"), list(makeSymbol("NEW-SYMBOLIC-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SYMBOLIC_NAME = makeSymbol("SYMBOLIC-NAME");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-INSTANCE");

    private static final SubLList $list666 = list(list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-NAME"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD");

    private static final SubLSymbol TEST_LIST_ELEMENT_INITIALIZE_METHOD = makeSymbol("TEST-LIST-ELEMENT-INITIALIZE-METHOD");

    private static final SubLSymbol GET_SYMBOLIC_NAME = makeSymbol("GET-SYMBOLIC-NAME");

    private static final SubLList $list670 = list(list(makeSymbol("RET"), makeSymbol("SYMBOLIC-NAME")));

    private static final SubLSymbol $sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD");

    private static final SubLSymbol TEST_LIST_ELEMENT_GET_SYMBOLIC_NAME_METHOD = makeSymbol("TEST-LIST-ELEMENT-GET-SYMBOLIC-NAME-METHOD");

    private static final SubLSymbol SET_SYMBOLIC_NAME = makeSymbol("SET-SYMBOLIC-NAME");

    private static final SubLList $list674 = list(makeSymbol("NEW-SYMBOLIC-NAME"));

    private static final SubLList $list675 = list(list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-NAME"), makeSymbol("NEW-SYMBOLIC-NAME")), list(makeSymbol("RET"), makeSymbol("NEW-SYMBOLIC-NAME")));

    private static final SubLSymbol $sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD");

    private static final SubLSymbol TEST_LIST_ELEMENT_SET_SYMBOLIC_NAME_METHOD = makeSymbol("TEST-LIST-ELEMENT-SET-SYMBOLIC-NAME-METHOD");

    private static final SubLList $list678 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(">~S<"), makeSymbol("SYMBOLIC-NAME")), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD");

    private static final SubLString $str680$__S_ = makeString(">~S<");

    private static final SubLSymbol TEST_LIST_ELEMENT_PRINT_METHOD = makeSymbol("TEST-LIST-ELEMENT-PRINT-METHOD");

    private static final SubLSymbol TEST_LIST_ELEMENT_ON_ADD_METHOD = makeSymbol("TEST-LIST-ELEMENT-ON-ADD-METHOD");

    private static final SubLSymbol TEST_LIST_ELEMENT_ON_DELETE_METHOD = makeSymbol("TEST-LIST-ELEMENT-ON-DELETE-METHOD");

    private static final SubLSymbol $test_list_elements$ = makeSymbol("*TEST-LIST-ELEMENTS*");

    private static final SubLString $str685$ENUMERATOR_TEMPLATE_EMPTY_P___S_i = makeString("ENUMERATOR-TEMPLATE-EMPTY-P: ~S is not an instance of ENUMERATOR-TEMPLATE.");

    private static final SubLString $str686$ENUMERATOR_TEMPLATE_LAST_P___S_is = makeString("ENUMERATOR-TEMPLATE-LAST-P: ~S is not an instance of ENUMERATOR-TEMPLATE.");

    private static final SubLString $str687$ENUMERATOR_TEMPLATE_FIRST___S_is_ = makeString("ENUMERATOR-TEMPLATE-FIRST: ~S is not an instance of ENUMERATOR-TEMPLATE.");

    private static final SubLString $str688$ENUMERATOR_TEMPLATE_NEXT___S_is_n = makeString("ENUMERATOR-TEMPLATE-NEXT: ~S is not an instance of ENUMERATOR-TEMPLATE.");

    private static final SubLString $str689$ENUMERATOR_TEMPLATE_CURRENT___S_i = makeString("ENUMERATOR-TEMPLATE-CURRENT: ~S is not an instance of ENUMERATOR-TEMPLATE.");

    private static final SubLString $str690$COLLECTION_TEMPLATE_EMPTY_P___S_i = makeString("COLLECTION-TEMPLATE-EMPTY-P: ~S is not an instance of COLLECTION-TEMPLATE.");

    private static final SubLString $str691$DOUBLY_LINKED_LIST_TEMPLATE_ADD__ = makeString("DOUBLY-LINKED-LIST-TEMPLATE-ADD: ~S is not an instance of DOUBLY-LINKED-LIST-TEMPLATE.");

    private static final SubLString $str692$DOUBLY_LINKED_LIST_TEMPLATE_GET_C = makeString("DOUBLY-LINKED-LIST-TEMPLATE-GET-CONTENTS: ~S is not an instance of DOUBLY-LINKED-LIST-TEMPLATE.");

    public static SubLObject valid_sequential_directions() {
        return $valid_sequential_directions$.getGlobalValue();
    }

    public static SubLObject sequential_direction_p(final SubLObject v_object) {
        return NIL != member(v_object, $valid_sequential_directions$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static SubLObject encode_sequential_direction(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos = position(value, $valid_sequential_directions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == pos)) {
            Errors.error($str2$_S___S_is_not_a_member_of_the__S_, ENCODE_SEQUENTIAL_DIRECTION, value, SEQUENTIAL_DIRECTION);
        }
        return pos;
    }

    public static SubLObject decode_sequential_direction(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject element = nth(value, $valid_sequential_directions$.getGlobalValue());
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == element)) {
            Errors.error($str4$_S___S_is_not_a_valid_encoding_of, DECODE_SEQUENTIAL_DIRECTION, value, SEQUENTIAL_DIRECTION);
        }
        return element;
    }

    public static SubLObject sequential_direction_less_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sequential_direction_p(value1))) {
            Errors.error($str6$_S___S_was_expected_to_be_a_membe, SEQUENTIAL_DIRECTION_P, value1, SEQUENTIAL_DIRECTION);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sequential_direction_p(value2))) {
            Errors.error($str6$_S___S_was_expected_to_be_a_membe, SEQUENTIAL_DIRECTION_P, value2, SEQUENTIAL_DIRECTION);
        }
        SubLObject cdolist_list_var = $valid_sequential_directions$.getGlobalValue();
        SubLObject value3 = NIL;
        value3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (value3.eql(value1)) {
                return makeBoolean(!value3.eql(value2));
            }
            if (value3.eql(value2)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sequential_direction_greater_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sequential_direction_p(value1))) {
            Errors.error($str6$_S___S_was_expected_to_be_a_membe, SEQUENTIAL_DIRECTION_P, value1, SEQUENTIAL_DIRECTION);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sequential_direction_p(value2))) {
            Errors.error($str6$_S___S_was_expected_to_be_a_membe, SEQUENTIAL_DIRECTION_P, value2, SEQUENTIAL_DIRECTION);
        }
        SubLObject cdolist_list_var = $valid_sequential_directions$.getGlobalValue();
        SubLObject value3 = NIL;
        value3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (value3.eql(value2)) {
                return makeBoolean(!value3.eql(value1));
            }
            if (value3.eql(value1)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject iterator_template_p(final SubLObject iterator_template) {
        return interfaces.subloop_instanceof_interface(iterator_template, ITERATOR_TEMPLATE);
    }

    public static SubLObject enumerator_template_p(final SubLObject enumerator_template) {
        return interfaces.subloop_instanceof_interface(enumerator_template, ENUMERATOR_TEMPLATE);
    }

    public static SubLObject collection_enumerator_template_p(final SubLObject collection_enumerator_template) {
        return interfaces.subloop_instanceof_interface(collection_enumerator_template, COLLECTION_ENUMERATOR_TEMPLATE);
    }

    public static SubLObject protected_membership_template_p(final SubLObject protected_membership_template) {
        return interfaces.subloop_instanceof_interface(protected_membership_template, PROTECTED_MEMBERSHIP_TEMPLATE);
    }

    public static SubLObject get_basic_collection_enumerator_direction(final SubLObject basic_collection_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection_enumerator, THREE_INTEGER, DIRECTION);
    }

    public static SubLObject set_basic_collection_enumerator_direction(final SubLObject basic_collection_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection_enumerator, value, THREE_INTEGER, DIRECTION);
    }

    public static SubLObject get_basic_collection_enumerator_contents_pointer(final SubLObject basic_collection_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection_enumerator, TWO_INTEGER, CONTENTS_POINTER);
    }

    public static SubLObject set_basic_collection_enumerator_contents_pointer(final SubLObject basic_collection_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection_enumerator, value, TWO_INTEGER, CONTENTS_POINTER);
    }

    public static SubLObject get_basic_collection_enumerator_collection_contents(final SubLObject basic_collection_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection_enumerator, ONE_INTEGER, COLLECTION_CONTENTS);
    }

    public static SubLObject set_basic_collection_enumerator_collection_contents(final SubLObject basic_collection_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection_enumerator, value, ONE_INTEGER, COLLECTION_CONTENTS);
    }

    public static SubLObject basic_collection_enumerator_previous_method(final SubLObject self) {
        if (NIL != basic_collection_enumerator_empty_p_method(self)) {
            return NIL;
        }
        final SubLObject template_collection_contents = basic_collection_enumerator_retrieve_collection_contents_method(self);
        SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method(self);
        if (NIL == template_contents_pointer) {
            final SubLObject pcase_var = basic_collection_enumerator_get_direction_method(self);
            if (pcase_var.eql($FORWARDS)) {
                template_contents_pointer = last(template_collection_contents, UNPROVIDED);
            } else
                if (pcase_var.eql($NONE)) {
                    template_contents_pointer = last(template_collection_contents, UNPROVIDED);
                }

            basic_collection_enumerator_set_contents_pointer_method(self, template_contents_pointer);
            basic_collection_enumerator_set_direction_method(self, $BACKWARDS);
            return basic_collection_enumerator_current_method(self);
        }
        if (template_collection_contents.eql(template_contents_pointer)) {
            basic_collection_enumerator_set_contents_pointer_method(self, NIL);
            basic_collection_enumerator_set_direction_method(self, $BACKWARDS);
            return NIL;
        }
        SubLObject sublist;
        for (sublist = NIL, sublist = template_collection_contents; NIL != sublist; sublist = sublist.rest()) {
            if (sublist.rest().eql(template_contents_pointer)) {
                basic_collection_enumerator_set_contents_pointer_method(self, sublist);
                basic_collection_enumerator_set_direction_method(self, $BACKWARDS);
                return basic_collection_enumerator_current_method(self);
            }
        }
        return NIL;
    }

    public static SubLObject basic_collection_enumerator_next_method(final SubLObject self) {
        if (NIL != basic_collection_enumerator_empty_p_method(self)) {
            return NIL;
        }
        SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method(self);
        if (NIL == template_contents_pointer) {
            final SubLObject pcase_var = basic_collection_enumerator_get_direction_method(self);
            if (pcase_var.eql($BACKWARDS)) {
                template_contents_pointer = basic_collection_enumerator_retrieve_collection_contents_method(self);
            } else
                if (pcase_var.eql($NONE)) {
                    template_contents_pointer = basic_collection_enumerator_retrieve_collection_contents_method(self);
                }

            basic_collection_enumerator_set_contents_pointer_method(self, template_contents_pointer);
            basic_collection_enumerator_set_direction_method(self, $FORWARDS);
            return basic_collection_enumerator_current_method(self);
        }
        if (NIL == template_contents_pointer) {
            return NIL;
        }
        basic_collection_enumerator_set_contents_pointer_method(self, template_contents_pointer.rest());
        basic_collection_enumerator_set_direction_method(self, $FORWARDS);
        return basic_collection_enumerator_current_method(self);
    }

    public static SubLObject basic_collection_enumerator_last_method(final SubLObject self) {
        if (NIL != basic_collection_enumerator_empty_p_method(self)) {
            return NIL;
        }
        basic_collection_enumerator_set_contents_pointer_method(self, last(basic_collection_enumerator_retrieve_collection_contents_method(self), UNPROVIDED));
        basic_collection_enumerator_set_direction_method(self, $BACKWARDS);
        return basic_collection_enumerator_current_method(self);
    }

    public static SubLObject basic_collection_enumerator_first_method(final SubLObject self) {
        basic_collection_enumerator_set_contents_pointer_method(self, basic_collection_enumerator_retrieve_collection_contents_method(self));
        basic_collection_enumerator_set_direction_method(self, $FORWARDS);
        return basic_collection_enumerator_current_method(self);
    }

    public static SubLObject basic_collection_enumerator_current_method(final SubLObject self) {
        if (NIL != basic_collection_enumerator_empty_p_method(self)) {
            return NIL;
        }
        final SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method(self);
        if (NIL != template_contents_pointer) {
            return basic_collection_enumerator_get_contents_pointer_method(self).first();
        }
        return NIL;
    }

    public static SubLObject basic_collection_enumerator_last_p_method(final SubLObject self) {
        if (NIL != basic_collection_enumerator_empty_p_method(self)) {
            return T;
        }
        final SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method(self);
        if (NIL != template_contents_pointer) {
            return sublisp_null(template_contents_pointer.rest());
        }
        return T;
    }

    public static SubLObject basic_collection_enumerator_first_p_method(final SubLObject self) {
        return makeBoolean((NIL != basic_collection_enumerator_empty_p_method(self)) || basic_collection_enumerator_retrieve_collection_contents_method(self).eql(basic_collection_enumerator_get_contents_pointer_method(self)));
    }

    public static SubLObject basic_collection_enumerator_empty_p_method(final SubLObject self) {
        return sublisp_null(basic_collection_enumerator_retrieve_collection_contents_method(self));
    }

    public static SubLObject subloop_reserved_initialize_basic_collection_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_collection_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION_ENUMERATOR, COLLECTION_CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION_ENUMERATOR, CONTENTS_POINTER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION_ENUMERATOR, DIRECTION, NIL);
        return NIL;
    }

    public static SubLObject basic_collection_enumerator_p(final SubLObject basic_collection_enumerator) {
        return classes.subloop_instanceof_class(basic_collection_enumerator, BASIC_COLLECTION_ENUMERATOR);
    }

    public static SubLObject basic_collection_enumerator_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
        SubLObject direction = get_basic_collection_enumerator_direction(self);
        SubLObject contents_pointer = get_basic_collection_enumerator_contents_pointer(self);
        SubLObject collection_contents = get_basic_collection_enumerator_collection_contents(self);
        try {
            thread.throwStack.push($sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                object.object_initialize_method(self);
                collection_contents = NIL;
                contents_pointer = NIL;
                direction = $NONE;
                sublisp_throw($sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_enumerator_direction(self, direction);
                    set_basic_collection_enumerator_contents_pointer(self, contents_pointer);
                    set_basic_collection_enumerator_collection_contents(self, collection_contents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }

    public static SubLObject basic_collection_enumerator_store_collection_contents_method(final SubLObject self, final SubLObject new_collection_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
        SubLObject collection_contents = get_basic_collection_enumerator_collection_contents(self);
        try {
            thread.throwStack.push($sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                collection_contents = new_collection_contents;
                sublisp_throw($sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, new_collection_contents);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_enumerator_collection_contents(self, collection_contents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }

    public static SubLObject basic_collection_enumerator_retrieve_collection_contents_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
        final SubLObject collection_contents = get_basic_collection_enumerator_collection_contents(self);
        try {
            thread.throwStack.push($sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, collection_contents);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_enumerator_collection_contents(self, collection_contents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }

    public static SubLObject basic_collection_enumerator_set_contents_pointer_method(final SubLObject self, final SubLObject subcontents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
        SubLObject contents_pointer = get_basic_collection_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push($sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                contents_pointer = subcontents;
                sublisp_throw($sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, subcontents);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_enumerator_contents_pointer(self, contents_pointer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }

    public static SubLObject basic_collection_enumerator_get_contents_pointer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
        final SubLObject contents_pointer = get_basic_collection_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push($sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, contents_pointer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_enumerator_contents_pointer(self, contents_pointer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }

    public static SubLObject basic_collection_enumerator_get_direction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
        final SubLObject direction = get_basic_collection_enumerator_direction(self);
        try {
            thread.throwStack.push($sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, direction);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_enumerator_direction(self, direction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }

    public static SubLObject basic_collection_enumerator_set_direction_method(final SubLObject self, final SubLObject new_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
        SubLObject direction = get_basic_collection_enumerator_direction(self);
        try {
            thread.throwStack.push($sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sequential_direction_p(new_direction))) {
                    Errors.error($str92$_SET_DIRECTION__S____S_is_not_a_v, self, new_direction, enumerations.enumerate_values(SEQUENTIAL_DIRECTION));
                }
                direction = new_direction;
                sublisp_throw($sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, new_direction);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_enumerator_direction(self, direction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }

    public static SubLObject collection_template_p(final SubLObject collection_template) {
        return interfaces.subloop_instanceof_interface(collection_template, COLLECTION_TEMPLATE);
    }

    public static SubLObject get_basic_collection_element_equality_predicate(final SubLObject basic_collection) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection, TWO_INTEGER, ELEMENT_EQUALITY_PREDICATE);
    }

    public static SubLObject set_basic_collection_element_equality_predicate(final SubLObject basic_collection, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection, value, TWO_INTEGER, ELEMENT_EQUALITY_PREDICATE);
    }

    public static SubLObject get_basic_collection_contents(final SubLObject basic_collection) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection, ONE_INTEGER, CONTENTS);
    }

    public static SubLObject set_basic_collection_contents(final SubLObject basic_collection, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection, value, ONE_INTEGER, CONTENTS);
    }

    public static SubLObject basic_collection_empty_p_method(final SubLObject self) {
        return sublisp_null(basic_collection_get_contents_method(self));
    }

    public static SubLObject basic_collection_member_p_method(final SubLObject self, final SubLObject element) {
        return NIL != member(element, basic_collection_get_contents_method(self), basic_collection_get_element_equality_predicate_method(self), UNPROVIDED) ? T : NIL;
    }

    public static SubLObject basic_collection_remove_method(final SubLObject self, final SubLObject old_element) {
        basic_collection_set_contents_method(self, delete(old_element, basic_collection_get_contents_method(self), basic_collection_get_element_equality_predicate_method(self), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return old_element;
    }

    public static SubLObject basic_collection_add_method(final SubLObject self, final SubLObject new_element) {
        basic_collection_set_contents_method(self, nconc(basic_collection_get_contents_method(self), list(new_element)));
        return new_element;
    }

    public static SubLObject basic_collection_clear_method(final SubLObject self) {
        basic_collection_set_contents_method(self, NIL);
        return NIL;
    }

    public static SubLObject basic_collection_get_element_count_method(final SubLObject self) {
        return length(basic_collection_get_contents_method(self));
    }

    public static SubLObject basic_collection_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_collection_allocate_enumerator_method(self);
        if (NIL == template_enumerator) {
            format(stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
            format(stream, $str128$__);
        } else {
            format(stream, $str129$__S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
            while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                format(stream, $str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
            } 
            format(stream, $str131$_);
        }
        basic_collection_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }

    public static SubLObject subloop_reserved_initialize_basic_collection_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_collection_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, ELEMENT_EQUALITY_PREDICATE, NIL);
        return NIL;
    }

    public static SubLObject basic_collection_p(final SubLObject basic_collection) {
        return classes.subloop_instanceof_class(basic_collection, BASIC_COLLECTION);
    }

    public static SubLObject basic_collection_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = NIL;
        SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate(self);
        SubLObject contents = get_basic_collection_contents(self);
        try {
            thread.throwStack.push($sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                object.object_initialize_method(self);
                contents = NIL;
                element_equality_predicate = EQUAL;
                sublisp_throw($sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_element_equality_predicate(self, element_equality_predicate);
                    set_basic_collection_contents(self, contents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, $sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }

    public static SubLObject basic_collection_element_equal_p_method(final SubLObject self, final SubLObject element1, final SubLObject element2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = NIL;
        final SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate(self);
        try {
            thread.throwStack.push($sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                SubLObject result = NIL;
                final SubLObject pcase_var = element_equality_predicate;
                if (pcase_var.eql(EQUAL)) {
                    result = equal(element1, element2);
                } else
                    if (pcase_var.eql(EQ)) {
                        result = eq(element1, element2);
                    } else
                        if (pcase_var.eql(EQL)) {
                            result = eql(element1, element2);
                        } else
                            if (pcase_var.eql(EQUALP)) {
                                result = equalp(element1, element2);
                            } else
                                if (pcase_var.eql(STRING_EQUAL)) {
                                    result = Strings.string_equal(element1, element2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($sym141$CHAR_)) {
                                        result = charE(element1, element2);
                                    } else {
                                        result = funcall(element_equality_predicate, element1, element2);
                                    }





                sublisp_throw($sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, result);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_element_equality_predicate(self, element_equality_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }

    public static SubLObject basic_collection_get_element_equality_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = NIL;
        final SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate(self);
        try {
            thread.throwStack.push($sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                sublisp_throw($sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, element_equality_predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_element_equality_predicate(self, element_equality_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, $sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }

    public static SubLObject basic_collection_set_element_equality_predicate_method(final SubLObject self, final SubLObject new_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = NIL;
        SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate(self);
        try {
            thread.throwStack.push($sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                element_equality_predicate = new_predicate;
                sublisp_throw($sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, new_predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_element_equality_predicate(self, element_equality_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, $sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }

    public static SubLObject basic_collection_get_contents_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = NIL;
        final SubLObject contents = get_basic_collection_contents(self);
        try {
            thread.throwStack.push($sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                sublisp_throw($sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, contents);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_contents(self, contents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, $sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }

    public static SubLObject basic_collection_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = NIL;
        SubLObject contents = get_basic_collection_contents(self);
        try {
            thread.throwStack.push($sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_contents.isList())) {
                    Errors.error($str160$_SET_CONTENTS__S____S_is_not_a_va, self, new_contents);
                }
                contents = new_contents;
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_contents(self, contents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, $sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }

    public static SubLObject basic_collection_allocate_enumerator_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = NIL;
        final SubLObject contents = get_basic_collection_contents(self);
        try {
            thread.throwStack.push($sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                final SubLObject enumerator = object.object_new_method(BASIC_COLLECTION_ENUMERATOR);
                basic_collection_enumerator_store_collection_contents_method(enumerator, contents);
                basic_collection_enumerator_set_contents_pointer_method(enumerator, contents);
                sublisp_throw($sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, enumerator);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_collection_contents(self, contents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }

    public static SubLObject basic_collection_deallocate_enumerator_method(final SubLObject self, final SubLObject enumerator) {
        if (NIL != enumerator) {
            basic_collection_enumerator_store_collection_contents_method(enumerator, NIL);
            basic_collection_enumerator_set_contents_pointer_method(enumerator, NIL);
        }
        return NIL;
    }

    public static SubLObject list_template_p(final SubLObject list_template) {
        return interfaces.subloop_instanceof_interface(list_template, LIST_TEMPLATE);
    }

    public static SubLObject basic_list_empty_p_method(final SubLObject self) {
        return sublisp_null(basic_collection_get_contents_method(self));
    }

    public static SubLObject basic_list_reverse_method(final SubLObject self) {
        basic_collection_set_contents_method(self, reverse(basic_collection_get_contents_method(self)));
        return self;
    }

    public static SubLObject basic_list_append_method(final SubLObject self, final SubLObject other_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == other_list) {
            return self;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_template_p(other_list))) {
            Errors.error($str198$_APPEND__S____S_is_not_an_instanc, self, other_list);
        }
        final SubLObject template_other_list_contents = copy_list(methods.funcall_instance_method_with_0_args(other_list, GET_CONTENTS));
        basic_collection_set_contents_method(self, nconc(basic_collection_get_contents_method(self), template_other_list_contents));
        return self;
    }

    public static SubLObject basic_list_position_method(final SubLObject self, final SubLObject element) {
        return position(element, basic_collection_get_contents_method(self), basic_collection_get_element_equality_predicate_method(self), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject basic_list_set_nth_method(final SubLObject self, final SubLObject index, final SubLObject new_element) {
        set_nth(index, basic_collection_get_contents_method(self), new_element);
        return new_element;
    }

    public static SubLObject basic_list_nth_method(final SubLObject self, final SubLObject index) {
        return nth(index, basic_collection_get_contents_method(self));
    }

    public static SubLObject basic_list_but_last_method(final SubLObject self) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        if (NIL == template_contents.rest()) {
            basic_collection_set_contents_method(self, NIL);
            return template_contents.first();
        }
        SubLObject template_contents_sublist;
        SubLObject template_result;
        for (template_contents_sublist = NIL, template_contents_sublist = template_contents; NIL != template_contents_sublist; template_contents_sublist = template_contents_sublist.rest()) {
            if (NIL == cddr(template_contents_sublist)) {
                template_result = cadr(template_contents_sublist);
                rplacd(template_contents_sublist, NIL);
                return template_result;
            }
        }
        return NIL;
    }

    public static SubLObject basic_list_pop_method(final SubLObject self) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        basic_collection_set_contents_method(self, template_contents.rest());
        return template_contents.first();
    }

    public static SubLObject basic_list_push_method(final SubLObject self, final SubLObject new_element) {
        basic_collection_set_contents_method(self, cons(new_element, basic_collection_get_contents_method(self)));
        return new_element;
    }

    public static SubLObject basic_list_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_collection_allocate_enumerator_method(self);
        if (NIL == template_enumerator) {
            format(stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
            format(stream, $str206$LIST___);
        } else {
            format(stream, $str207$LIST___S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
            while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                format(stream, $str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
            } 
            format(stream, $str131$_);
        }
        basic_collection_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }

    public static SubLObject subloop_reserved_initialize_basic_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, ELEMENT_EQUALITY_PREDICATE, NIL);
        return NIL;
    }

    public static SubLObject basic_list_p(final SubLObject basic_list) {
        return classes.subloop_instanceof_class(basic_list, BASIC_LIST);
    }

    public static SubLObject end_pointer_list_template_p(final SubLObject end_pointer_list_template) {
        return interfaces.subloop_instanceof_interface(end_pointer_list_template, END_POINTER_LIST_TEMPLATE);
    }

    public static SubLObject get_basic_end_pointer_list_end_pointer(final SubLObject basic_end_pointer_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_end_pointer_list, THREE_INTEGER, END_POINTER);
    }

    public static SubLObject set_basic_end_pointer_list_end_pointer(final SubLObject basic_end_pointer_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_end_pointer_list, value, THREE_INTEGER, END_POINTER);
    }

    public static SubLObject basic_end_pointer_list_empty_p_method(final SubLObject self) {
        return sublisp_null(basic_collection_get_contents_method(self));
    }

    public static SubLObject basic_end_pointer_list_reverse_method(final SubLObject self) {
        final SubLObject template_contents_reversed = reverse(basic_collection_get_contents_method(self));
        basic_collection_set_contents_method(self, template_contents_reversed);
        basic_end_pointer_list_set_end_pointer_method(self, last(template_contents_reversed, UNPROVIDED));
        return self;
    }

    public static SubLObject basic_end_pointer_list_append_method(final SubLObject self, final SubLObject other_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == other_list) {
            return self;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_template_p(other_list))) {
            Errors.error($str198$_APPEND__S____S_is_not_an_instanc, self, other_list);
        }
        final SubLObject template_other_list_contents = copy_list(methods.funcall_instance_method_with_0_args(other_list, GET_CONTENTS));
        basic_collection_set_contents_method(self, nconc(basic_collection_get_contents_method(self), template_other_list_contents));
        basic_end_pointer_list_set_end_pointer_method(self, last(template_other_list_contents, UNPROVIDED));
        return self;
    }

    public static SubLObject basic_end_pointer_list_position_method(final SubLObject self, final SubLObject element) {
        return position(element, basic_collection_get_contents_method(self), basic_collection_get_element_equality_predicate_method(self), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject basic_end_pointer_list_nth_method(final SubLObject self, final SubLObject index) {
        return nth(index, basic_collection_get_contents_method(self));
    }

    public static SubLObject basic_end_pointer_list_but_last_method(final SubLObject self) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        final SubLObject template_end_pointer = basic_end_pointer_list_get_end_pointer_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        if (NIL == template_contents.rest()) {
            basic_collection_set_contents_method(self, NIL);
            basic_end_pointer_list_set_end_pointer_method(self, NIL);
            return template_contents.first();
        }
        SubLObject template_contents_sublist;
        SubLObject template_result;
        for (template_contents_sublist = NIL, template_contents_sublist = template_contents; NIL != template_contents_sublist; template_contents_sublist = template_contents_sublist.rest()) {
            if (template_contents_sublist.rest().eql(template_end_pointer)) {
                template_result = template_end_pointer.first();
                rplacd(template_contents_sublist, NIL);
                basic_end_pointer_list_set_end_pointer_method(self, template_contents_sublist);
                return template_result;
            }
        }
        return NIL;
    }

    public static SubLObject basic_end_pointer_list_pop_method(final SubLObject self) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        if (NIL == template_contents.rest()) {
            basic_collection_set_contents_method(self, NIL);
            basic_end_pointer_list_set_end_pointer_method(self, NIL);
            return template_contents.first();
        }
        basic_collection_set_contents_method(self, template_contents.rest());
        return template_contents.first();
    }

    public static SubLObject basic_end_pointer_list_push_method(final SubLObject self, final SubLObject new_element) {
        SubLObject template_contents = basic_collection_get_contents_method(self);
        if (NIL == template_contents) {
            template_contents = list(new_element);
            basic_collection_set_contents_method(self, template_contents);
            basic_end_pointer_list_set_end_pointer_method(self, template_contents);
            return new_element;
        }
        basic_collection_set_contents_method(self, cons(new_element, template_contents));
        return new_element;
    }

    public static SubLObject basic_end_pointer_list_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        final SubLObject template_end_pointer = basic_end_pointer_list_get_end_pointer_method(self);
        if (NIL == template_contents) {
            return NIL;
        }
        if (NIL != basic_collection_element_equal_p_method(self, old_element, template_contents.first())) {
            if (template_contents.eql(template_end_pointer)) {
                basic_collection_set_contents_method(self, NIL);
                basic_end_pointer_list_set_end_pointer_method(self, NIL);
                return old_element;
            }
            basic_collection_set_contents_method(self, template_contents.rest());
            return old_element;
        } else {
            SubLObject template_current_cons;
            for (template_current_cons = template_contents; !template_current_cons.rest().eql(template_end_pointer); template_current_cons = template_current_cons.rest()) {
                if (NIL != basic_collection_element_equal_p_method(self, old_element, cadr(template_current_cons))) {
                    rplacd(template_current_cons, cddr(template_current_cons));
                    return old_element;
                }
            }
            if (NIL != basic_collection_element_equal_p_method(self, old_element, cadr(template_current_cons))) {
                rplacd(template_current_cons, NIL);
                basic_end_pointer_list_set_end_pointer_method(self, template_current_cons);
                return old_element;
            }
            return old_element;
        }
    }

    public static SubLObject basic_end_pointer_list_add_method(final SubLObject self, final SubLObject new_element) {
        SubLObject template_contents = basic_collection_get_contents_method(self);
        SubLObject template_end_pointer = basic_end_pointer_list_get_end_pointer_method(self);
        if (NIL == template_contents) {
            template_contents = template_end_pointer = list(new_element);
        } else {
            rplacd(template_end_pointer, list(new_element));
            template_end_pointer = template_end_pointer.rest();
        }
        basic_collection_set_contents_method(self, template_contents);
        basic_end_pointer_list_set_end_pointer_method(self, template_end_pointer);
        return new_element;
    }

    public static SubLObject basic_end_pointer_list_clear_method(final SubLObject self) {
        basic_collection_set_contents_method(self, NIL);
        basic_end_pointer_list_set_end_pointer_method(self, NIL);
        return NIL;
    }

    public static SubLObject basic_end_pointer_list_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_collection_allocate_enumerator_method(self);
        if (NIL == template_enumerator) {
            format(stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
            format(stream, $str206$LIST___);
        } else {
            format(stream, $str207$LIST___S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
            while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                format(stream, $str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
            } 
            format(stream, $str131$_);
        }
        basic_collection_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }

    public static SubLObject subloop_reserved_initialize_basic_end_pointer_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_end_pointer_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_END_POINTER_LIST, END_POINTER, NIL);
        return NIL;
    }

    public static SubLObject basic_end_pointer_list_p(final SubLObject basic_end_pointer_list) {
        return classes.subloop_instanceof_class(basic_end_pointer_list, BASIC_END_POINTER_LIST);
    }

    public static SubLObject basic_end_pointer_list_get_end_pointer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_end_pointer_list_method = NIL;
        final SubLObject end_pointer = get_basic_end_pointer_list_end_pointer(self);
        try {
            thread.throwStack.push($sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD);
            try {
                sublisp_throw($sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD, end_pointer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_end_pointer_list_end_pointer(self, end_pointer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_end_pointer_list_method = Errors.handleThrowable(ccatch_env_var, $sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_end_pointer_list_method;
    }

    public static SubLObject basic_end_pointer_list_set_end_pointer_method(final SubLObject self, final SubLObject new_end_pointer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_end_pointer_list_method = NIL;
        SubLObject end_pointer = get_basic_end_pointer_list_end_pointer(self);
        try {
            thread.throwStack.push($sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD);
            try {
                end_pointer = new_end_pointer;
                sublisp_throw($sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD, new_end_pointer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_end_pointer_list_end_pointer(self, end_pointer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_end_pointer_list_method = Errors.handleThrowable(ccatch_env_var, $sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_end_pointer_list_method;
    }

    public static SubLObject double_link_cell_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject double_link_cell_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$double_link_cell_native.class ? T : NIL;
    }

    public static SubLObject dlc_owner(final SubLObject v_object) {
        assert NIL != double_link_cell_p(v_object) : "subloop_collections.double_link_cell_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject dlc_contents(final SubLObject v_object) {
        assert NIL != double_link_cell_p(v_object) : "subloop_collections.double_link_cell_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject dlc_previous(final SubLObject v_object) {
        assert NIL != double_link_cell_p(v_object) : "subloop_collections.double_link_cell_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject dlc_next(final SubLObject v_object) {
        assert NIL != double_link_cell_p(v_object) : "subloop_collections.double_link_cell_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_dlc_owner(final SubLObject v_object, final SubLObject value) {
        assert NIL != double_link_cell_p(v_object) : "subloop_collections.double_link_cell_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_dlc_contents(final SubLObject v_object, final SubLObject value) {
        assert NIL != double_link_cell_p(v_object) : "subloop_collections.double_link_cell_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_dlc_previous(final SubLObject v_object, final SubLObject value) {
        assert NIL != double_link_cell_p(v_object) : "subloop_collections.double_link_cell_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_dlc_next(final SubLObject v_object, final SubLObject value) {
        assert NIL != double_link_cell_p(v_object) : "subloop_collections.double_link_cell_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_double_link_cell(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $double_link_cell_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($OWNER)) {
                _csetf_dlc_owner(v_new, current_value);
            } else
                if (pcase_var.eql($CONTENTS)) {
                    _csetf_dlc_contents(v_new, current_value);
                } else
                    if (pcase_var.eql($PREVIOUS)) {
                        _csetf_dlc_previous(v_new, current_value);
                    } else
                        if (pcase_var.eql($NEXT)) {
                            _csetf_dlc_next(v_new, current_value);
                        } else {
                            Errors.error($str270$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_double_link_cell(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DOUBLE_LINK_CELL, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $OWNER, dlc_owner(obj));
        funcall(visitor_fn, obj, $SLOT, $CONTENTS, dlc_contents(obj));
        funcall(visitor_fn, obj, $SLOT, $PREVIOUS, dlc_previous(obj));
        funcall(visitor_fn, obj, $SLOT, $NEXT, dlc_next(obj));
        funcall(visitor_fn, obj, $END, MAKE_DOUBLE_LINK_CELL, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_double_link_cell_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_double_link_cell(obj, visitor_fn);
    }

    public static SubLObject with_dlc_read_only(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject dlc = NIL;
        destructuring_bind_must_consp(current, datum, $list276);
        dlc = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject dlc_var = make_symbol($$$dlc);
        return generate_instance_variable_bindings_for_structure_slots(dlc_var, dlc, DLC_, $list251, forms, UNPROVIDED);
    }

    public static SubLObject with_dlc_read_write(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject dlc = NIL;
        destructuring_bind_must_consp(current, datum, $list276);
        dlc = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject dlc_var = make_symbol($$$dlc);
        return generate_instance_variable_bindings_for_structure_slots(dlc_var, dlc, DLC_, $list251, forms, NIL);
    }

    public static SubLObject dlc_copy_links(final SubLObject dlc, final SubLObject new_owner) {
        if (NIL == dlc) {
            return values(NIL, NIL);
        }
        SubLObject current_source = dlc;
        SubLObject first_destin = NIL;
        SubLObject current_destin = NIL;
        SubLObject previous_destin = NIL;
        while (NIL != current_source) {
            current_destin = make_double_link_cell(UNPROVIDED);
            if (NIL == first_destin) {
                first_destin = current_destin;
            }
            _csetf_dlc_owner(current_destin, new_owner);
            _csetf_dlc_contents(current_destin, dlc_contents(current_source));
            _csetf_dlc_previous(current_destin, previous_destin);
            if (NIL != previous_destin) {
                _csetf_dlc_next(previous_destin, current_destin);
            }
            previous_destin = current_destin;
            current_source = dlc_next(current_source);
        } 
        return values(first_destin, current_destin);
    }

    public static SubLObject list_element_template_p(final SubLObject list_element_template) {
        return interfaces.subloop_instanceof_interface(list_element_template, LIST_ELEMENT_TEMPLATE);
    }

    public static SubLObject get_basic_list_element_qua_list_element_parent_links(final SubLObject basic_list_element) {
        return classes.subloop_get_access_protected_instance_slot(basic_list_element, ONE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static SubLObject set_basic_list_element_qua_list_element_parent_links(final SubLObject basic_list_element, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_list_element, value, ONE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static SubLObject get_basic_list_element_qua_list_element_self_deletion_mode(final SubLObject basic_list_element) {
        final SubLObject v_class = subloop_structures.instance_class(basic_list_element);
        final SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_list_element, slot);
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(basic_list_element));
    }

    public static SubLObject set_basic_list_element_qua_list_element_self_deletion_mode(final SubLObject basic_list_element, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_list_element);
        final SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_list_element, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_list_element, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(basic_list_element)));
        return value;
    }

    public static SubLObject basic_list_element_perform_action_method(final SubLObject self, final SubLObject action, final SubLObject parameters) {
        return NIL;
    }

    public static SubLObject basic_list_element_on_delete_method(final SubLObject self, final SubLObject parent_list) {
        return NIL;
    }

    public static SubLObject basic_list_element_on_add_method(final SubLObject self, final SubLObject parent_list) {
        return NIL;
    }

    public static SubLObject basic_list_element_get_collections_method(final SubLObject self) {
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        SubLObject template_collections = NIL;
        final SubLObject list_expression = template_parent_links;
        if (NIL == list_expression) {
            template_collections = NIL;
        } else
            if (list_expression.isAtom()) {
                template_collections = list(list_expression);
            } else
                if (NIL == list_expression.rest()) {
                    final SubLObject template_parent_link = list_expression.first();
                    template_collections = list(dlc_owner(template_parent_link));
                } else {
                    SubLObject tail_cons = NIL;
                    SubLObject result = NIL;
                    final SubLObject template_parent_link2 = list_expression.first();
                    template_collections = tail_cons = list(dlc_owner(template_parent_link2));
                    SubLObject cdolist_list_var = list_expression.rest();
                    SubLObject template_parent_link3 = NIL;
                    template_parent_link3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = list(dlc_owner(template_parent_link3));
                        rplacd(tail_cons, result);
                        tail_cons = result;
                        cdolist_list_var = cdolist_list_var.rest();
                        template_parent_link3 = cdolist_list_var.first();
                    } 
                }


        return list_utilities.unique_elements(template_collections, UNPROVIDED);
    }

    public static SubLObject basic_list_element_member_p_method(final SubLObject self, final SubLObject collection) {
        SubLObject cdolist_list_var;
        final SubLObject template_parent_links = cdolist_list_var = basic_list_element_get_parent_links_method(self);
        SubLObject template_parent_link = NIL;
        template_parent_link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (dlc_owner(template_parent_link).eql(collection)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_parent_link = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject basic_list_element_delete_self_from_all_collections_method(final SubLObject self) {
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        try {
            basic_list_element_set_self_deletion_mode_method(self, T);
            SubLObject cdolist_list_var = template_parent_links;
            SubLObject template_parent_link = NIL;
            template_parent_link = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                generic_dllt_delete_link_function(dlc_owner(template_parent_link), template_parent_link);
                _csetf_dlc_owner(template_parent_link, NIL);
                cdolist_list_var = cdolist_list_var.rest();
                template_parent_link = cdolist_list_var.first();
            } 
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                basic_list_element_set_self_deletion_mode_method(self, NIL);
                basic_list_element_set_parent_links_method(self, NIL);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return self;
    }

    public static SubLObject basic_list_element_transfer_self_method(final SubLObject self, final SubLObject current_collection, final SubLObject new_collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == collection_template_p(current_collection))) {
            Errors.error($str317$_TRANSFER_SELF__S____S_is_not_an_, self, current_collection);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == collection_template_p(current_collection))) {
            Errors.error($str317$_TRANSFER_SELF__S____S_is_not_an_, self, new_collection);
        }
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        SubLObject template_parent_link = NIL;
        SubLObject template_target_link = NIL;
        if (NIL != template_parent_links) {
            if (dlc_owner(template_parent_links.first()).eql(current_collection)) {
                template_target_link = template_parent_links.first();
                basic_list_element_set_parent_links_method(self, template_parent_links.rest());
            } else {
                SubLObject template_previous = template_parent_links;
                SubLObject template_sublinks = template_previous.rest();
                while (NIL != template_sublinks) {
                    template_parent_link = template_sublinks.first();
                    if (dlc_owner(template_parent_link).eql(current_collection)) {
                        template_target_link = template_parent_link;
                        rplacd(template_previous, template_sublinks.rest());
                        template_sublinks = NIL;
                    } else {
                        template_previous = template_sublinks;
                        template_sublinks = template_sublinks.rest();
                    }
                } 
            }
            if (NIL != template_target_link) {
                try {
                    basic_list_element_set_self_deletion_mode_method(self, T);
                    generic_dllt_delete_link_function(dlc_owner(template_target_link), template_target_link);
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        _csetf_dlc_owner(template_target_link, NIL);
                        methods.funcall_instance_method_with_1_args(new_collection, ADD, self);
                        basic_list_element_set_self_deletion_mode_method(self, NIL);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return self;
    }

    public static SubLObject basic_list_element_delete_self_from_collection_method(final SubLObject self, final SubLObject collection) {
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        SubLObject template_parent_link = NIL;
        SubLObject template_target_link = NIL;
        if (NIL != template_parent_links) {
            if (dlc_owner(template_parent_links.first()).eql(collection)) {
                template_target_link = template_parent_links.first();
                basic_list_element_set_parent_links_method(self, template_parent_links.rest());
            } else {
                SubLObject template_previous = template_parent_links;
                SubLObject template_sublinks = template_previous.rest();
                while (NIL != template_sublinks) {
                    template_parent_link = template_sublinks.first();
                    if (dlc_owner(template_parent_link).eql(collection)) {
                        template_target_link = template_parent_link;
                        rplacd(template_previous, template_sublinks.rest());
                        template_sublinks = NIL;
                    } else {
                        template_previous = template_sublinks;
                        template_sublinks = template_sublinks.rest();
                    }
                } 
            }
            if (NIL != template_target_link) {
                try {
                    basic_list_element_set_self_deletion_mode_method(self, T);
                    generic_dllt_delete_link_function(dlc_owner(template_target_link), template_target_link);
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        _csetf_dlc_owner(template_target_link, NIL);
                        methods.funcall_instance_method_with_1_args(self, ON_DELETE, collection);
                        basic_list_element_set_self_deletion_mode_method(self, NIL);
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return self;
    }

    public static SubLObject basic_list_element_delete_parent_link_method(final SubLObject self, final SubLObject old_parent_link) {
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        if (NIL != template_parent_links) {
            if (old_parent_link.eql(template_parent_links)) {
                basic_list_element_set_parent_links_method(self, template_parent_links.rest());
            } else {
                SubLObject template_previous_cons = template_parent_links;
                for (SubLObject template_current_cons = template_parent_links.rest(); NIL != template_current_cons; template_current_cons = template_current_cons.rest()) {
                    if (old_parent_link.eql(template_current_cons.first())) {
                        rplacd(template_previous_cons, template_current_cons.rest());
                        methods.funcall_instance_method_with_1_args(self, ON_DELETE, dlc_owner(old_parent_link));
                        return old_parent_link;
                    }
                    template_previous_cons = template_current_cons;
                }
            }
        }
        return NIL;
    }

    public static SubLObject basic_list_element_add_parent_link_method(final SubLObject self, final SubLObject new_parent_link) {
        basic_list_element_set_parent_links_method(self, cons(new_parent_link, basic_list_element_get_parent_links_method(self)));
        methods.funcall_instance_method_with_1_args(self, ON_ADD, dlc_owner(new_parent_link));
        return new_parent_link;
    }

    public static SubLObject subloop_reserved_initialize_basic_list_element_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_list_element_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_LIST_ELEMENT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_LIST_ELEMENT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        return NIL;
    }

    public static SubLObject basic_list_element_p(final SubLObject basic_list_element) {
        return classes.subloop_instanceof_class(basic_list_element, BASIC_LIST_ELEMENT);
    }

    public static SubLObject basic_list_element_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = NIL;
        SubLObject qua_list_element_parent_links = get_basic_list_element_qua_list_element_parent_links(self);
        SubLObject qua_list_element_self_deletion_mode = get_basic_list_element_qua_list_element_self_deletion_mode(self);
        try {
            thread.throwStack.push($sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                object.object_initialize_method(self);
                qua_list_element_self_deletion_mode = NIL;
                qua_list_element_parent_links = NIL;
                sublisp_throw($sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_list_element_qua_list_element_parent_links(self, qua_list_element_parent_links);
                    set_basic_list_element_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }

    public static SubLObject basic_list_element_get_parent_links_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = NIL;
        final SubLObject qua_list_element_parent_links = get_basic_list_element_qua_list_element_parent_links(self);
        try {
            thread.throwStack.push($sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                sublisp_throw($sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, qua_list_element_parent_links);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_list_element_qua_list_element_parent_links(self, qua_list_element_parent_links);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }

    public static SubLObject basic_list_element_set_parent_links_method(final SubLObject self, final SubLObject new_parent_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = NIL;
        SubLObject qua_list_element_parent_links = get_basic_list_element_qua_list_element_parent_links(self);
        try {
            thread.throwStack.push($sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                qua_list_element_parent_links = new_parent_links;
                sublisp_throw($sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, new_parent_links);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_list_element_qua_list_element_parent_links(self, qua_list_element_parent_links);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }

    public static SubLObject basic_list_element_get_self_deletion_mode_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = NIL;
        final SubLObject qua_list_element_self_deletion_mode = get_basic_list_element_qua_list_element_self_deletion_mode(self);
        try {
            thread.throwStack.push($sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                sublisp_throw($sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, qua_list_element_self_deletion_mode);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_list_element_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }

    public static SubLObject basic_list_element_set_self_deletion_mode_method(final SubLObject self, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = NIL;
        SubLObject qua_list_element_self_deletion_mode = get_basic_list_element_qua_list_element_self_deletion_mode(self);
        try {
            thread.throwStack.push($sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                qua_list_element_self_deletion_mode = mode;
                sublisp_throw($sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, mode);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_list_element_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }

    public static SubLObject doubly_linked_list_template_p(final SubLObject doubly_linked_list_template) {
        return interfaces.subloop_instanceof_interface(doubly_linked_list_template, DOUBLY_LINKED_LIST_TEMPLATE);
    }

    public static SubLObject get_basic_doubly_linked_list_last_link(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list, FOUR_INTEGER, LAST_LINK);
    }

    public static SubLObject set_basic_doubly_linked_list_last_link(final SubLObject basic_doubly_linked_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list, value, FOUR_INTEGER, LAST_LINK);
    }

    public static SubLObject get_basic_doubly_linked_list_first_link(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list, THREE_INTEGER, FIRST_LINK);
    }

    public static SubLObject set_basic_doubly_linked_list_first_link(final SubLObject basic_doubly_linked_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list, value, THREE_INTEGER, FIRST_LINK);
    }

    public static SubLObject get_basic_doubly_linked_list_element_count(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list, TWO_INTEGER, ELEMENT_COUNT);
    }

    public static SubLObject set_basic_doubly_linked_list_element_count(final SubLObject basic_doubly_linked_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list, value, TWO_INTEGER, ELEMENT_COUNT);
    }

    public static SubLObject get_basic_doubly_linked_list_element_equality_predicate(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list, ONE_INTEGER, ELEMENT_EQUALITY_PREDICATE);
    }

    public static SubLObject set_basic_doubly_linked_list_element_equality_predicate(final SubLObject basic_doubly_linked_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list, value, ONE_INTEGER, ELEMENT_EQUALITY_PREDICATE);
    }

    public static SubLObject basic_doubly_linked_list_swap_method(final SubLObject self, final SubLObject element1, final SubLObject element2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (element1.eql(element2)) {
            return NIL;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == element1) || (NIL == element2))) {
            Errors.error($str380$_SWAP__S___Cannot_swap_NIL_elemen, self);
        }
        final SubLObject link1 = basic_doubly_linked_list_find_link_method(self, element1);
        final SubLObject link2 = basic_doubly_linked_list_find_link_method(self, element2);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == link1)) {
            Errors.error($str381$_SWAP__S____S_is_not_an_element_o, self, element1);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == link2)) {
            Errors.error($str381$_SWAP__S____S_is_not_an_element_o, self, element2);
        }
        if (NIL != list_element_template_p(element1)) {
            methods.funcall_instance_method_with_1_args(element1, DELETE_PARENT_LINK, link1);
            methods.funcall_instance_method_with_1_args(element1, ADD_PARENT_LINK, link2);
        }
        if (NIL != list_element_template_p(element2)) {
            methods.funcall_instance_method_with_1_args(element2, DELETE_PARENT_LINK, link2);
            methods.funcall_instance_method_with_1_args(element2, ADD_PARENT_LINK, link1);
        }
        _csetf_dlc_contents(link1, element2);
        _csetf_dlc_contents(link2, element1);
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_empty_p_method(final SubLObject self) {
        return sublisp_null(basic_doubly_linked_list_get_first_link_method(self));
    }

    public static SubLObject basic_doubly_linked_list_reverse_method(final SubLObject self) {
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method(self);
        if (NIL == template_first_link) {
            return self;
        }
        if (template_first_link.eql(template_last_link)) {
            return self;
        }
        for (SubLObject template_current_link = template_first_link, template_next_link = NIL; NIL != template_current_link; template_current_link = template_next_link) {
            template_next_link = dlc_next(template_current_link);
            basic_doubly_linked_list_reverse_link_method(self, template_current_link);
        }
        basic_doubly_linked_list_set_first_link_method(self, template_last_link);
        basic_doubly_linked_list_set_last_link_method(self, template_first_link);
        return self;
    }

    public static SubLObject basic_doubly_linked_list_append_method(final SubLObject self, final SubLObject other_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == other_list) {
            return self;
        }
        if (other_list.isCons()) {
            SubLObject cdolist_list_var = other_list;
            SubLObject template_element = NIL;
            template_element = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                basic_doubly_linked_list_add_method(self, template_element);
                cdolist_list_var = cdolist_list_var.rest();
                template_element = cdolist_list_var.first();
            } 
            return self;
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_template_p(other_list))) {
            Errors.error($str385$_APPEND__S___Cannot_append_non_li, self, other_list);
        }
        final SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(other_list, ALLOCATE_ENUMERATOR);
        if (NIL == template_enumerator) {
            return self;
        }
        if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
            return self;
        }
        for (SubLObject template_element = methods.funcall_instance_method_with_0_args(template_enumerator, FIRST); NIL != template_element; template_element = methods.funcall_instance_method_with_0_args(template_enumerator, NEXT)) {
            basic_doubly_linked_list_add_method(self, template_element);
        }
        return self;
    }

    public static SubLObject basic_doubly_linked_list_position_method(final SubLObject self, final SubLObject element) {
        SubLObject template_links = basic_doubly_linked_list_get_first_link_method(self);
        SubLObject count = ZERO_INTEGER;
        if (NIL == template_links) {
            return NIL;
        }
        while (NIL != template_links) {
            if (NIL != basic_doubly_linked_list_element_equal_p_method(self, element, dlc_contents(template_links))) {
                return count;
            }
            count = add(count, ONE_INTEGER);
            template_links = dlc_next(template_links);
        } 
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_set_nth_method(final SubLObject self, final SubLObject index, final SubLObject new_element) {
        final SubLObject template_link = basic_doubly_linked_list_find_nth_link_method(self, index);
        if (NIL != template_link) {
            final SubLObject template_content = dlc_contents(template_link);
            if (NIL != list_element_template_p(template_content)) {
                generic_dllt_delete_parent_link_function(template_content, template_link);
            }
            _csetf_dlc_contents(template_link, new_element);
            if (NIL != list_element_template_p(new_element)) {
                generic_dllt_add_parent_link_function(new_element, template_link);
            }
            return new_element;
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_nth_method(final SubLObject self, final SubLObject index) {
        final SubLObject template_link = basic_doubly_linked_list_find_nth_link_method(self, index);
        if (NIL != template_link) {
            return dlc_contents(template_link);
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_but_last_method(final SubLObject self) {
        final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method(self);
        if (NIL != template_last_link) {
            final SubLObject template_contents = dlc_contents(template_last_link);
            basic_doubly_linked_list_delete_link_method(self, template_last_link);
            return template_contents;
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_pop_method(final SubLObject self) {
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        if (NIL != template_first_link) {
            final SubLObject template_contents = dlc_contents(template_first_link);
            basic_doubly_linked_list_delete_link_method(self, template_first_link);
            return template_contents;
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_push_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        final SubLObject template_new_link = make_double_link_cell(UNPROVIDED);
        _csetf_dlc_contents(template_new_link, new_element);
        _csetf_dlc_owner(template_new_link, self);
        if (NIL != template_first_link) {
            _csetf_dlc_next(template_new_link, template_first_link);
            _csetf_dlc_previous(template_first_link, template_new_link);
            basic_doubly_linked_list_set_first_link_method(self, template_new_link);
        } else {
            basic_doubly_linked_list_set_first_link_method(self, template_new_link);
            basic_doubly_linked_list_set_last_link_method(self, template_new_link);
        }
        if (NIL != list_element_template_p(new_element)) {
            generic_dllt_add_parent_link_function(new_element, template_new_link);
        }
        basic_doubly_linked_list_inc_element_count_method(self);
        return new_element;
    }

    public static SubLObject basic_doubly_linked_list_member_p_method(final SubLObject self, final SubLObject element) {
        final SubLObject template_link = basic_doubly_linked_list_find_link_method(self, element);
        return NIL != template_link ? T : NIL;
    }

    public static SubLObject basic_doubly_linked_list_remove_method(final SubLObject self, final SubLObject old_element) {
        if (NIL != list_element_template_p(old_element)) {
            generic_dllt_delete_self_from_collection_function(old_element, self);
        } else {
            final SubLObject template_link = basic_doubly_linked_list_find_link_method(self, old_element);
            if (NIL != template_link) {
                basic_doubly_linked_list_delete_link_method(self, template_link);
            }
        }
        return old_element;
    }

    public static SubLObject basic_doubly_linked_list_add_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_new_link = make_double_link_cell(UNPROVIDED);
        final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method(self);
        _csetf_dlc_contents(template_new_link, new_element);
        _csetf_dlc_owner(template_new_link, self);
        if (NIL != template_last_link) {
            _csetf_dlc_next(template_last_link, template_new_link);
            _csetf_dlc_previous(template_new_link, template_last_link);
        } else {
            basic_doubly_linked_list_set_first_link_method(self, template_new_link);
        }
        basic_doubly_linked_list_set_last_link_method(self, template_new_link);
        if (NIL != list_element_template_p(new_element)) {
            generic_dllt_add_parent_link_function(new_element, template_new_link);
        }
        basic_doubly_linked_list_inc_element_count_method(self);
        return new_element;
    }

    public static SubLObject basic_doubly_linked_list_clear_method(final SubLObject self) {
        SubLObject cdolist_list_var;
        final SubLObject template_contents = cdolist_list_var = basic_doubly_linked_list_get_contents_method(self);
        SubLObject template_element = NIL;
        template_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            basic_doubly_linked_list_remove_method(self, template_element);
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_doubly_linked_list_allocate_enumerator_method(self);
        if (NIL == template_enumerator) {
            format(stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
            format(stream, $str397$DLIST__);
        } else {
            format(stream, $str398$DLIST__S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
            while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                format(stream, $str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
            } 
            format(stream, $str131$_);
        }
        basic_doubly_linked_list_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }

    public static SubLObject basic_doubly_linked_list_find_nth_link_method(final SubLObject self, final SubLObject index) {
        SubLObject template_links = basic_doubly_linked_list_get_first_link_method(self);
        SubLObject count = ZERO_INTEGER;
        while (NIL != template_links) {
            if (count.numE(index)) {
                return template_links;
            }
            count = add(count, ONE_INTEGER);
            template_links = dlc_next(template_links);
        } 
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_find_link_method(final SubLObject self, final SubLObject element) {
        for (SubLObject template_links = basic_doubly_linked_list_get_first_link_method(self); NIL != template_links; template_links = dlc_next(template_links)) {
            if (NIL != basic_doubly_linked_list_element_equal_p_method(self, element, dlc_contents(template_links))) {
                return template_links;
            }
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_reverse_link_method(final SubLObject self, final SubLObject link) {
        final SubLObject template_previous = dlc_previous(link);
        final SubLObject template_next = dlc_next(link);
        _csetf_dlc_previous(link, template_next);
        _csetf_dlc_next(link, template_previous);
        return link;
    }

    public static SubLObject basic_doubly_linked_list_delete_link_method(final SubLObject self, final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == double_link_cell_p(link))) {
            Errors.error($str403$_DELETE_LINK__S____S_is_not_a_val, self, link);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!dlc_owner(link).eql(self))) {
            Errors.error($str404$_DELETE_LINK__S___Link__S_is_not_, self, link, self);
        }
        basic_doubly_linked_list_dec_element_count_method(self);
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method(self);
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == template_first_link) || (NIL == template_last_link))) && ((NIL != template_first_link) || (NIL != template_last_link))) {
            Errors.error($str405$_DELETE_LINK__S___Detected_incons, self);
        }
        if (template_first_link.eql(link)) {
            if (template_last_link.eql(link)) {
                basic_doubly_linked_list_set_first_link_method(self, NIL);
                basic_doubly_linked_list_set_last_link_method(self, NIL);
                _csetf_dlc_previous(link, NIL);
                _csetf_dlc_next(link, NIL);
                return dlc_contents(link);
            }
            final SubLObject template_second_link = dlc_next(link);
            _csetf_dlc_previous(template_second_link, NIL);
            basic_doubly_linked_list_set_first_link_method(self, template_second_link);
            _csetf_dlc_next(link, NIL);
            _csetf_dlc_previous(link, NIL);
            return dlc_contents(link);
        } else {
            if (template_last_link.eql(link)) {
                final SubLObject template_second_link = dlc_previous(link);
                _csetf_dlc_next(template_second_link, NIL);
                basic_doubly_linked_list_set_last_link_method(self, template_second_link);
                _csetf_dlc_next(link, NIL);
                _csetf_dlc_previous(link, NIL);
                return dlc_contents(link);
            }
            final SubLObject template_before_link = dlc_previous(link);
            final SubLObject template_after_link = dlc_next(link);
            _csetf_dlc_next(template_before_link, template_after_link);
            _csetf_dlc_previous(template_after_link, template_before_link);
            _csetf_dlc_next(link, NIL);
            _csetf_dlc_previous(link, NIL);
            return dlc_contents(link);
        }
    }

    public static SubLObject basic_doubly_linked_list_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_contents.isList())) {
            Errors.error($str407$_SET_CONTENTS__S___Cannot_set_the, self, new_contents);
        }
        SubLObject cdolist_list_var;
        final SubLObject template_contents = cdolist_list_var = basic_doubly_linked_list_get_contents_method(self);
        SubLObject template_element = NIL;
        template_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            basic_doubly_linked_list_remove_method(self, template_element);
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = new_contents;
        SubLObject template_element2 = NIL;
        template_element2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            basic_doubly_linked_list_add_method(self, template_element2);
            cdolist_list_var2 = cdolist_list_var2.rest();
            template_element2 = cdolist_list_var2.first();
        } 
        return new_contents;
    }

    public static SubLObject basic_doubly_linked_list_get_contents_method(final SubLObject self) {
        SubLObject template_contents = NIL;
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        if (NIL != template_first_link) {
            for (SubLObject template_current_link = template_first_link; NIL != template_current_link; template_current_link = dlc_next(template_current_link)) {
                template_contents = cons(dlc_contents(template_current_link), template_contents);
            }
        }
        return nreverse(template_contents);
    }

    public static SubLObject basic_doubly_linked_list_element_equal_p_method(final SubLObject self, final SubLObject element1, final SubLObject element2) {
        return equal(element1, element2);
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST, LAST_LINK, NIL);
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_p(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_instanceof_class(basic_doubly_linked_list, BASIC_DOUBLY_LINKED_LIST);
    }

    public static SubLObject basic_doubly_linked_list_get_element_equality_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        final SubLObject element_equality_predicate = get_basic_doubly_linked_list_element_equality_predicate(self);
        try {
            thread.throwStack.push($sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                sublisp_throw($sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_equality_predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_element_equality_predicate(self, element_equality_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_set_element_equality_predicate_method(final SubLObject self, final SubLObject new_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        SubLObject element_equality_predicate = get_basic_doubly_linked_list_element_equality_predicate(self);
        try {
            thread.throwStack.push($sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                element_equality_predicate = new_predicate;
                sublisp_throw($sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_element_equality_predicate(self, element_equality_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_set_element_count_method(final SubLObject self, final SubLObject new_element_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        SubLObject element_count = get_basic_doubly_linked_list_element_count(self);
        try {
            thread.throwStack.push($sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_element_count.isInteger())) {
                    Errors.error($str421$_SET_ELEMENT_COUNT__S____S_is_not, self, new_element_count);
                }
                element_count = new_element_count;
                sublisp_throw($sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_element_count);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_element_count(self, element_count);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_inc_element_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        SubLObject element_count = get_basic_doubly_linked_list_element_count(self);
        try {
            thread.throwStack.push($sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if (NIL == element_count) {
                    element_count = ONE_INTEGER;
                } else {
                    element_count = add(element_count, ONE_INTEGER);
                }
                sublisp_throw($sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_count);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_element_count(self, element_count);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_dec_element_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        SubLObject element_count = get_basic_doubly_linked_list_element_count(self);
        try {
            thread.throwStack.push($sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if (NIL == element_count) {
                    element_count = ZERO_INTEGER;
                } else {
                    element_count = subtract(element_count, ONE_INTEGER);
                }
                sublisp_throw($sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_count);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_element_count(self, element_count);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_get_first_link_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        final SubLObject first_link = get_basic_doubly_linked_list_first_link(self);
        try {
            thread.throwStack.push($sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                sublisp_throw($sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, first_link);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_first_link(self, first_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_set_first_link_method(final SubLObject self, final SubLObject new_first_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        SubLObject first_link = get_basic_doubly_linked_list_first_link(self);
        try {
            thread.throwStack.push($sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_first_link)) && (NIL == double_link_cell_p(new_first_link))) {
                    Errors.error($str439$_SET_FIRST_LINK__S____S_is_not_an, self, new_first_link);
                }
                first_link = new_first_link;
                sublisp_throw($sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_first_link);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_first_link(self, first_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_get_last_link_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        final SubLObject last_link = get_basic_doubly_linked_list_last_link(self);
        try {
            thread.throwStack.push($sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                sublisp_throw($sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, last_link);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_last_link(self, last_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_set_last_link_method(final SubLObject self, final SubLObject new_last_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        SubLObject last_link = get_basic_doubly_linked_list_last_link(self);
        try {
            thread.throwStack.push($sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_last_link)) && (NIL == double_link_cell_p(new_last_link))) {
                    Errors.error($str449$_SET_LAST_LINK__S____S_is_not_an_, self, new_last_link);
                }
                last_link = new_last_link;
                sublisp_throw($sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_last_link);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_last_link(self, last_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_get_element_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        final SubLObject element_count = get_basic_doubly_linked_list_element_count(self);
        try {
            thread.throwStack.push($sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                sublisp_throw($sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_count);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_element_count(self, element_count);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject get_basic_doubly_linked_list_enumerator_direction(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list_enumerator, FOUR_INTEGER, DIRECTION);
    }

    public static SubLObject set_basic_doubly_linked_list_enumerator_direction(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list_enumerator, value, FOUR_INTEGER, DIRECTION);
    }

    public static SubLObject get_basic_doubly_linked_list_enumerator_current_link(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list_enumerator, THREE_INTEGER, CURRENT_LINK);
    }

    public static SubLObject set_basic_doubly_linked_list_enumerator_current_link(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list_enumerator, value, THREE_INTEGER, CURRENT_LINK);
    }

    public static SubLObject get_basic_doubly_linked_list_enumerator_last_link(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list_enumerator, TWO_INTEGER, LAST_LINK);
    }

    public static SubLObject set_basic_doubly_linked_list_enumerator_last_link(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list_enumerator, value, TWO_INTEGER, LAST_LINK);
    }

    public static SubLObject get_basic_doubly_linked_list_enumerator_first_link(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list_enumerator, ONE_INTEGER, FIRST_LINK);
    }

    public static SubLObject set_basic_doubly_linked_list_enumerator_first_link(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list_enumerator, value, ONE_INTEGER, FIRST_LINK);
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, CURRENT_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, DIRECTION, NIL);
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_enumerator_p(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_instanceof_class(basic_doubly_linked_list_enumerator, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR);
    }

    public static SubLObject basic_doubly_linked_list_enumerator_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push($sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                object.object_initialize_method(self);
                first_link = NIL;
                last_link = NIL;
                current_link = NIL;
                direction = $NONE;
                sublisp_throw($sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_direction(self, direction);
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    set_basic_doubly_linked_list_enumerator_last_link(self, last_link);
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }

    public static SubLObject basic_doubly_linked_list_enumerator_isolate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push($sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                if (NIL != first_link) {
                    for (SubLObject current_link_$1 = first_link, next_link = NIL; NIL != current_link_$1; current_link_$1 = next_link) {
                        next_link = dlc_next(current_link_$1);
                        _csetf_dlc_contents(current_link_$1, NIL);
                        _csetf_dlc_owner(current_link_$1, NIL);
                        _csetf_dlc_next(current_link_$1, NIL);
                        _csetf_dlc_previous(current_link_$1, NIL);
                    }
                }
                first_link = NIL;
                last_link = NIL;
                current_link = NIL;
                direction = $NONE;
                object.object_isolate_method(self);
                sublisp_throw($sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_direction(self, direction);
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    set_basic_doubly_linked_list_enumerator_last_link(self, last_link);
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }

    public static SubLObject basic_doubly_linked_list_enumerator_set_initial_state_method(final SubLObject self, final SubLObject new_first_link, final SubLObject new_last_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push($sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                first_link = new_first_link;
                last_link = new_last_link;
                current_link = new_first_link;
                direction = $FORWARDS;
                sublisp_throw($sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_direction(self, direction);
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    set_basic_doubly_linked_list_enumerator_last_link(self, last_link);
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }

    public static SubLObject basic_doubly_linked_list_enumerator_empty_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
        final SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push($sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, sublisp_null(first_link));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }

    public static SubLObject basic_doubly_linked_list_enumerator_first_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
        final SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push($sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, eq(first_link, current_link));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }

    public static SubLObject basic_doubly_linked_list_enumerator_last_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
        final SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        try {
            thread.throwStack.push($sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                if (NIL != basic_doubly_linked_list_enumerator_empty_p_method(self)) {
                    sublisp_throw($sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, T);
                }
                if (NIL == current_link) {
                    sublisp_throw($sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, T);
                }
                sublisp_throw($sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, sublisp_null(dlc_next(current_link)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }

    public static SubLObject basic_doubly_linked_list_enumerator_current_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
        final SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        try {
            thread.throwStack.push($sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                if (NIL == current_link) {
                    sublisp_throw($sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, NIL);
                }
                sublisp_throw($sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, dlc_contents(current_link));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }

    public static SubLObject basic_doubly_linked_list_enumerator_first_method(final SubLObject self) {
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject first_link = current_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
        direction = $FORWARDS;
        set_basic_doubly_linked_list_enumerator_direction(self, direction);
        return basic_doubly_linked_list_enumerator_current_method(self);
    }

    public static SubLObject basic_doubly_linked_list_enumerator_last_method(final SubLObject self) {
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject last_link = current_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
        direction = $BACKWARDS;
        set_basic_doubly_linked_list_enumerator_direction(self, direction);
        return basic_doubly_linked_list_enumerator_current_method(self);
    }

    public static SubLObject basic_doubly_linked_list_enumerator_next_method(final SubLObject self) {
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        if (NIL != current_link) {
            current_link = dlc_next(current_link);
            set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
            direction = $FORWARDS;
            set_basic_doubly_linked_list_enumerator_direction(self, direction);
            return basic_doubly_linked_list_enumerator_current_method(self);
        }
        final SubLObject pcase_var = direction;
        if (pcase_var.eql($FORWARDS)) {
            return NIL;
        }
        if (pcase_var.eql($BACKWARDS)) {
            current_link = first_link;
            set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
            direction = $FORWARDS;
            set_basic_doubly_linked_list_enumerator_direction(self, direction);
            return basic_doubly_linked_list_enumerator_current_method(self);
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_enumerator_previous_method(final SubLObject self) {
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        if (NIL != current_link) {
            current_link = dlc_previous(current_link);
            set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
            direction = $BACKWARDS;
            set_basic_doubly_linked_list_enumerator_direction(self, direction);
            return basic_doubly_linked_list_enumerator_current_method(self);
        }
        final SubLObject pcase_var = direction;
        if (pcase_var.eql($FORWARDS)) {
            current_link = last_link;
            set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
            direction = $BACKWARDS;
            set_basic_doubly_linked_list_enumerator_direction(self, direction);
            return basic_doubly_linked_list_enumerator_current_method(self);
        }
        if (pcase_var.eql($BACKWARDS)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject basic_doubly_linked_list_allocate_enumerator_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
        final SubLObject first_link = get_basic_doubly_linked_list_first_link(self);
        try {
            thread.throwStack.push($sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                final SubLObject new_enumerator = object.object_new_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR);
                thread.resetMultipleValues();
                final SubLObject new_first_link = dlc_copy_links(first_link, new_enumerator);
                final SubLObject new_last_link = thread.secondMultipleValue();
                thread.resetMultipleValues();
                basic_doubly_linked_list_enumerator_set_initial_state_method(new_enumerator, new_first_link, new_last_link);
                sublisp_throw($sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_enumerator);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_doubly_linked_list_first_link(self, first_link);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, $sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }

    public static SubLObject basic_doubly_linked_list_deallocate_enumerator_method(final SubLObject self, final SubLObject enumerator) {
        if (NIL != basic_doubly_linked_list_enumerator_p(enumerator)) {
            basic_doubly_linked_list_enumerator_isolate_method(enumerator);
        }
        return NIL;
    }

    public static SubLObject pair_template_p(final SubLObject pair_template) {
        return interfaces.subloop_instanceof_interface(pair_template, PAIR_TEMPLATE);
    }

    public static SubLObject get_basic_pair_second_element(final SubLObject basic_pair) {
        return classes.subloop_get_access_protected_instance_slot(basic_pair, TWO_INTEGER, SECOND_ELEMENT);
    }

    public static SubLObject set_basic_pair_second_element(final SubLObject basic_pair, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_pair, value, TWO_INTEGER, SECOND_ELEMENT);
    }

    public static SubLObject get_basic_pair_first_element(final SubLObject basic_pair) {
        return classes.subloop_get_access_protected_instance_slot(basic_pair, ONE_INTEGER, FIRST_ELEMENT);
    }

    public static SubLObject set_basic_pair_first_element(final SubLObject basic_pair, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_pair, value, ONE_INTEGER, FIRST_ELEMENT);
    }

    public static SubLObject basic_pair_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        format(stream, $str505$__S___S_, basic_pair_get_first_method(self), basic_pair_get_second_method(self));
        return self;
    }

    public static SubLObject subloop_reserved_initialize_basic_pair_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_pair_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_PAIR, FIRST_ELEMENT, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_PAIR, SECOND_ELEMENT, NIL);
        return NIL;
    }

    public static SubLObject basic_pair_p(final SubLObject basic_pair) {
        return classes.subloop_instanceof_class(basic_pair, BASIC_PAIR);
    }

    public static SubLObject basic_pair_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = NIL;
        SubLObject second_element = get_basic_pair_second_element(self);
        SubLObject first_element = get_basic_pair_first_element(self);
        try {
            thread.throwStack.push($sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                object.object_initialize_method(self);
                first_element = NIL;
                second_element = NIL;
                sublisp_throw($sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_pair_second_element(self, second_element);
                    set_basic_pair_first_element(self, first_element);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, $sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }

    public static SubLObject basic_pair_get_first_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = NIL;
        final SubLObject first_element = get_basic_pair_first_element(self);
        try {
            thread.throwStack.push($sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                sublisp_throw($sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, first_element);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_pair_first_element(self, first_element);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, $sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }

    public static SubLObject basic_pair_set_first_method(final SubLObject self, final SubLObject new_first) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = NIL;
        SubLObject first_element = get_basic_pair_first_element(self);
        try {
            thread.throwStack.push($sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                first_element = new_first;
                sublisp_throw($sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, new_first);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_pair_first_element(self, first_element);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, $sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }

    public static SubLObject basic_pair_get_second_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = NIL;
        final SubLObject second_element = get_basic_pair_second_element(self);
        try {
            thread.throwStack.push($sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                sublisp_throw($sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, second_element);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_pair_second_element(self, second_element);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, $sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }

    public static SubLObject basic_pair_set_second_method(final SubLObject self, final SubLObject new_second) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = NIL;
        SubLObject second_element = get_basic_pair_second_element(self);
        try {
            thread.throwStack.push($sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                second_element = new_second;
                sublisp_throw($sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, new_second);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_pair_second_element(self, second_element);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, $sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }

    public static SubLObject triplet_template_p(final SubLObject triplet_template) {
        return interfaces.subloop_instanceof_interface(triplet_template, TRIPLET_TEMPLATE);
    }

    public static SubLObject get_basic_triplet_third_element(final SubLObject basic_triplet) {
        return classes.subloop_get_access_protected_instance_slot(basic_triplet, THREE_INTEGER, THIRD_ELEMENT);
    }

    public static SubLObject set_basic_triplet_third_element(final SubLObject basic_triplet, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_triplet, value, THREE_INTEGER, THIRD_ELEMENT);
    }

    public static SubLObject basic_triplet_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        format(stream, $str538$__S___S___S_, new SubLObject[]{ basic_pair_get_first_method(self), basic_pair_get_second_method(self), basic_triplet_get_third_method(self) });
        return self;
    }

    public static SubLObject subloop_reserved_initialize_basic_triplet_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_triplet_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_PAIR, FIRST_ELEMENT, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_PAIR, SECOND_ELEMENT, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_TRIPLET, THIRD_ELEMENT, NIL);
        return NIL;
    }

    public static SubLObject basic_triplet_p(final SubLObject basic_triplet) {
        return classes.subloop_instanceof_class(basic_triplet, BASIC_TRIPLET);
    }

    public static SubLObject basic_triplet_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_triplet_method = NIL;
        SubLObject third_element = get_basic_triplet_third_element(self);
        try {
            thread.throwStack.push($sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
            try {
                basic_pair_initialize_method(self);
                third_element = NIL;
                sublisp_throw($sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_triplet_third_element(self, third_element);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_triplet_method = Errors.handleThrowable(ccatch_env_var, $sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_triplet_method;
    }

    public static SubLObject basic_triplet_get_third_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_triplet_method = NIL;
        final SubLObject third_element = get_basic_triplet_third_element(self);
        try {
            thread.throwStack.push($sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
            try {
                sublisp_throw($sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD, third_element);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_triplet_third_element(self, third_element);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_triplet_method = Errors.handleThrowable(ccatch_env_var, $sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_triplet_method;
    }

    public static SubLObject basic_triplet_set_third_method(final SubLObject self, final SubLObject new_third) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_triplet_method = NIL;
        SubLObject third_element = get_basic_triplet_third_element(self);
        try {
            thread.throwStack.push($sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
            try {
                third_element = new_third;
                sublisp_throw($sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD, new_third);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_triplet_third_element(self, third_element);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_triplet_method = Errors.handleThrowable(ccatch_env_var, $sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_triplet_method;
    }

    public static SubLObject generic_dllt_add_parent_link_function(final SubLObject list_element, final SubLObject new_parent_link) {
        if (NIL != basic_list_element_p(list_element)) {
            return basic_list_element_add_parent_link_method(list_element, new_parent_link);
        }
        if (NIL != list_element_template_p(list_element)) {
            return methods.funcall_instance_method_with_1_args(list_element, ADD_PARENT_LINK, new_parent_link);
        }
        return NIL;
    }

    public static SubLObject generic_dllt_delete_parent_link_function(final SubLObject list_element, final SubLObject old_parent_link) {
        if (NIL != basic_list_element_p(list_element)) {
            return basic_list_element_delete_parent_link_method(list_element, old_parent_link);
        }
        if (NIL != list_element_template_p(list_element)) {
            return methods.funcall_instance_method_with_1_args(list_element, DELETE_PARENT_LINK, old_parent_link);
        }
        return NIL;
    }

    public static SubLObject generic_dllt_delete_link_function(final SubLObject list, final SubLObject link) {
        if (NIL != basic_doubly_linked_list_p(list)) {
            return basic_doubly_linked_list_delete_link_method(list, link);
        }
        if (NIL != doubly_linked_list_template_p(list)) {
            return methods.funcall_instance_method_with_1_args(list, DELETE_LINK, link);
        }
        return NIL;
    }

    public static SubLObject generic_dllt_delete_self_from_collection_function(final SubLObject list_element, final SubLObject collection) {
        if (NIL != basic_list_element_p(list_element)) {
            return basic_list_element_delete_self_from_collection_method(list_element, collection);
        }
        if (NIL != list_element_template_p(list_element)) {
            return methods.funcall_instance_method_with_1_args(list_element, DELETE_SELF_FROM_COLLECTION, collection);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_subloop_private_pair_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_subloop_private_pair_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_PAIR, FIRST_ELEMENT, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_PAIR, SECOND_ELEMENT, NIL);
        return NIL;
    }

    public static SubLObject subloop_private_pair_p(final SubLObject subloop_private_pair) {
        return classes.subloop_instanceof_class(subloop_private_pair, SUBLOOP_PRIVATE_PAIR);
    }

    public static SubLObject subloop_private_pair_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        format(stream, $str559$SUBLOOP_PRIVATE_PAIR__S___S_, basic_pair_get_first_method(self), basic_pair_get_second_method(self));
        return self;
    }

    public static SubLObject bag_enumerator_template_p(final SubLObject bag_enumerator_template) {
        return interfaces.subloop_instanceof_interface(bag_enumerator_template, BAG_ENUMERATOR_TEMPLATE);
    }

    public static SubLObject subloop_collections_bag_enum_get_next(final SubLObject contents_pointer) {
        final SubLObject list = basic_pair_get_first_method(contents_pointer);
        final SubLObject count = basic_pair_get_second_method(contents_pointer);
        if (NIL == list) {
            return values(NIL, NIL);
        }
        if (!list.isCons()) {
            return values(NIL, NIL);
        }
        final SubLObject element = list.first();
        if (NIL != subloop_private_pair_p(element)) {
            final SubLObject item = basic_pair_get_first_method(element);
            final SubLObject quant = basic_pair_get_second_method(element);
            if (NIL == count) {
                basic_pair_set_second_method(contents_pointer, ONE_INTEGER);
                return values(item, T);
            }
            if (count.numL(quant)) {
                basic_pair_set_second_method(contents_pointer, add(count, ONE_INTEGER));
                return values(item, T);
            }
            final SubLObject sublist = list.rest();
            basic_pair_set_first_method(contents_pointer, sublist);
            if (NIL == sublist) {
                basic_pair_set_second_method(contents_pointer, NIL);
                return values(NIL, NIL);
            }
            final SubLObject sublist_element = sublist.first();
            if (NIL != subloop_private_pair_p(sublist_element)) {
                basic_pair_set_second_method(contents_pointer, ONE_INTEGER);
                return values(basic_pair_get_first_method(sublist_element), T);
            }
            basic_pair_set_second_method(contents_pointer, NIL);
            return values(sublist_element, T);
        } else {
            final SubLObject sublist2 = list.rest();
            basic_pair_set_first_method(contents_pointer, sublist2);
            if (NIL == sublist2) {
                basic_pair_set_second_method(contents_pointer, NIL);
                return values(NIL, NIL);
            }
            final SubLObject sublist_element2 = sublist2.first();
            if (NIL != subloop_private_pair_p(sublist_element2)) {
                basic_pair_set_second_method(contents_pointer, ONE_INTEGER);
                return values(basic_pair_get_first_method(sublist_element2), T);
            }
            basic_pair_set_second_method(contents_pointer, NIL);
            return values(sublist_element2, T);
        }
    }

    public static SubLObject subloop_collections_get_previous_cons(final SubLObject list, final SubLObject sublist) {
        if (NIL == list) {
            return NIL;
        }
        if (list.eql(sublist)) {
            return NIL;
        }
        SubLObject current_sublist;
        for (current_sublist = NIL, current_sublist = list; NIL != current_sublist; current_sublist = current_sublist.rest()) {
            if (current_sublist.rest().eql(sublist)) {
                return current_sublist;
            }
        }
        return NIL;
    }

    public static SubLObject subloop_collections_backup_pointer(final SubLObject contents, final SubLObject contents_pointer) {
        if (NIL == contents_pointer) {
            return values(NIL, NIL);
        }
        if (NIL == subloop_private_pair_p(contents_pointer)) {
            return values(NIL, NIL);
        }
        final SubLObject sublist = basic_pair_get_first_method(contents_pointer);
        if (NIL == sublist) {
            return values(NIL, NIL);
        }
        final SubLObject element = sublist.first();
        if (NIL != subloop_private_pair_p(element)) {
            final SubLObject count = basic_pair_get_second_method(contents_pointer);
            if (!count.numE(ONE_INTEGER)) {
                basic_pair_set_second_method(contents_pointer, subtract(count, ONE_INTEGER));
                return values(basic_pair_get_first_method(element), T);
            }
            final SubLObject previous_cons = subloop_collections_get_previous_cons(contents, sublist);
            if (NIL == previous_cons) {
                basic_pair_set_first_method(contents_pointer, NIL);
                basic_pair_set_second_method(contents_pointer, NIL);
                return values(NIL, NIL);
            }
            final SubLObject previous_element = previous_cons.first();
            if (NIL != subloop_private_pair_p(previous_element)) {
                basic_pair_set_first_method(contents_pointer, previous_cons);
                basic_pair_set_second_method(contents_pointer, basic_pair_get_second_method(previous_element));
                return values(basic_pair_get_first_method(previous_element), T);
            }
            basic_pair_set_first_method(contents_pointer, previous_cons);
            basic_pair_set_second_method(contents_pointer, NIL);
            return values(previous_element, T);
        } else {
            final SubLObject previous_cons2 = subloop_collections_get_previous_cons(contents, sublist);
            if (NIL == previous_cons2) {
                basic_pair_set_first_method(contents_pointer, NIL);
                basic_pair_set_second_method(contents_pointer, NIL);
                return values(NIL, NIL);
            }
            final SubLObject previous_element2 = previous_cons2.first();
            if (NIL != subloop_private_pair_p(previous_element2)) {
                basic_pair_set_first_method(contents_pointer, previous_cons2);
                basic_pair_set_second_method(contents_pointer, basic_pair_get_second_method(previous_element2));
                return values(basic_pair_get_first_method(previous_element2), T);
            }
            basic_pair_set_first_method(contents_pointer, previous_cons2);
            basic_pair_set_second_method(contents_pointer, NIL);
            return values(previous_element2, T);
        }
    }

    public static SubLObject get_basic_bag_enumerator_direction(final SubLObject basic_bag_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_bag_enumerator, THREE_INTEGER, DIRECTION);
    }

    public static SubLObject set_basic_bag_enumerator_direction(final SubLObject basic_bag_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_bag_enumerator, value, THREE_INTEGER, DIRECTION);
    }

    public static SubLObject get_basic_bag_enumerator_contents(final SubLObject basic_bag_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_bag_enumerator, TWO_INTEGER, CONTENTS);
    }

    public static SubLObject set_basic_bag_enumerator_contents(final SubLObject basic_bag_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_bag_enumerator, value, TWO_INTEGER, CONTENTS);
    }

    public static SubLObject get_basic_bag_enumerator_contents_pointer(final SubLObject basic_bag_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_bag_enumerator, ONE_INTEGER, CONTENTS_POINTER);
    }

    public static SubLObject set_basic_bag_enumerator_contents_pointer(final SubLObject basic_bag_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_bag_enumerator, value, ONE_INTEGER, CONTENTS_POINTER);
    }

    public static SubLObject basic_bag_enumerator_previous_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_direction = basic_bag_enumerator_get_direction_method(self);
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if ((NIL != template_contents_pointer) && (NIL != basic_pair_get_first_method(template_contents_pointer))) {
            thread.resetMultipleValues();
            final SubLObject next_element = subloop_collections_backup_pointer(basic_bag_enumerator_get_contents_method(self), template_contents_pointer);
            final SubLObject success_p = thread.secondMultipleValue();
            thread.resetMultipleValues();
            basic_bag_enumerator_set_direction_method(self, $BACKWARDS);
            if (NIL != success_p) {
                return next_element;
            }
            return NIL;
        } else {
            if (template_direction == $BACKWARDS) {
                return NIL;
            }
            return basic_bag_enumerator_last_method(self);
        }
    }

    public static SubLObject basic_bag_enumerator_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_direction = basic_bag_enumerator_get_direction_method(self);
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if ((NIL != template_contents_pointer) && (NIL != basic_pair_get_first_method(template_contents_pointer))) {
            thread.resetMultipleValues();
            final SubLObject next_element = subloop_collections_bag_enum_get_next(template_contents_pointer);
            final SubLObject success_p = thread.secondMultipleValue();
            thread.resetMultipleValues();
            basic_bag_enumerator_set_direction_method(self, $FORWARDS);
            if (NIL != success_p) {
                return next_element;
            }
            return NIL;
        } else {
            if (template_direction == $FORWARDS) {
                return NIL;
            }
            return basic_bag_enumerator_first_method(self);
        }
    }

    public static SubLObject basic_bag_enumerator_last_method(final SubLObject self) {
        SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        final SubLObject template_contents = basic_bag_enumerator_get_contents_method(self);
        if (NIL == template_contents_pointer) {
            template_contents_pointer = object.object_new_method(SUBLOOP_PRIVATE_PAIR);
            basic_bag_enumerator_set_contents_pointer_method(self, template_contents_pointer);
        }
        if (NIL != template_contents) {
            final SubLObject last_cons = last(template_contents, UNPROVIDED);
            final SubLObject element = last_cons.first();
            if (NIL != subloop_private_pair_p(element)) {
                final SubLObject count = basic_pair_get_second_method(element);
                basic_pair_set_first_method(template_contents_pointer, last_cons);
                basic_pair_set_second_method(template_contents_pointer, count);
            } else {
                basic_pair_set_first_method(template_contents_pointer, last_cons);
                basic_pair_set_second_method(template_contents_pointer, NIL);
            }
        } else {
            basic_pair_set_first_method(template_contents_pointer, NIL);
            basic_pair_set_second_method(template_contents_pointer, NIL);
        }
        basic_bag_enumerator_set_direction_method(self, $BACKWARDS);
        return basic_bag_enumerator_current_method(self);
    }

    public static SubLObject basic_bag_enumerator_first_method(final SubLObject self) {
        SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        final SubLObject template_contents = basic_bag_enumerator_get_contents_method(self);
        if (NIL == template_contents_pointer) {
            template_contents_pointer = object.object_new_method(SUBLOOP_PRIVATE_PAIR);
            basic_bag_enumerator_set_contents_pointer_method(self, template_contents_pointer);
        }
        basic_pair_set_first_method(template_contents_pointer, template_contents);
        if (NIL != template_contents) {
            final SubLObject template_element = template_contents.first();
            if (NIL != subloop_private_pair_p(template_element)) {
                basic_pair_set_second_method(template_contents_pointer, ONE_INTEGER);
            } else {
                basic_pair_set_second_method(template_contents_pointer, NIL);
            }
        } else {
            basic_pair_set_second_method(template_contents_pointer, NIL);
        }
        basic_bag_enumerator_set_direction_method(self, $FORWARDS);
        return basic_bag_enumerator_current_method(self);
    }

    public static SubLObject basic_bag_enumerator_current_method(final SubLObject self) {
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if (NIL != template_contents_pointer) {
            final SubLObject list = basic_pair_get_first_method(template_contents_pointer);
            if (NIL != list) {
                final SubLObject element = list.first();
                if (NIL != element) {
                    if (NIL != subloop_private_pair_p(element)) {
                        return basic_pair_get_first_method(element);
                    }
                    return element;
                }
            }
        }
        return NIL;
    }

    public static SubLObject basic_bag_enumerator_last_p_method(final SubLObject self) {
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if (NIL == template_contents_pointer) {
            return NIL;
        }
        final SubLObject list = basic_pair_get_first_method(template_contents_pointer);
        if (NIL == list) {
            return NIL;
        }
        if (NIL != list.rest()) {
            return NIL;
        }
        final SubLObject element = list.first();
        if (NIL != subloop_private_pair_p(element)) {
            final SubLObject count = basic_pair_get_second_method(template_contents_pointer);
            final SubLObject quant = basic_pair_get_second_method(element);
            return numE(count, quant);
        }
        return T;
    }

    public static SubLObject basic_bag_enumerator_first_p_method(final SubLObject self) {
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        final SubLObject template_contents = basic_bag_enumerator_get_contents_method(self);
        if (NIL != template_contents_pointer) {
            return eq(template_contents, basic_pair_get_first_method(template_contents_pointer));
        }
        return NIL;
    }

    public static SubLObject basic_bag_enumerator_empty_p_method(final SubLObject self) {
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if (NIL != template_contents_pointer) {
            return sublisp_null(basic_pair_get_first_method(template_contents_pointer));
        }
        return T;
    }

    public static SubLObject subloop_reserved_initialize_basic_bag_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_bag_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_BAG_ENUMERATOR, CONTENTS_POINTER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_BAG_ENUMERATOR, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_BAG_ENUMERATOR, DIRECTION, NIL);
        return NIL;
    }

    public static SubLObject basic_bag_enumerator_p(final SubLObject basic_bag_enumerator) {
        return classes.subloop_instanceof_class(basic_bag_enumerator, BASIC_BAG_ENUMERATOR);
    }

    public static SubLObject basic_bag_enumerator_instantiate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
        SubLObject direction = get_basic_bag_enumerator_direction(self);
        SubLObject contents = get_basic_bag_enumerator_contents(self);
        SubLObject contents_pointer = get_basic_bag_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push($sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                methods.funcall_instance_super_method_with_0_args(self, INSTANTIATE);
                contents_pointer = object.object_new_method(SUBLOOP_PRIVATE_PAIR);
                contents = NIL;
                direction = $NONE;
                sublisp_throw($sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_enumerator_direction(self, direction);
                    set_basic_bag_enumerator_contents(self, contents);
                    set_basic_bag_enumerator_contents_pointer(self, contents_pointer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }

    public static SubLObject basic_bag_enumerator_get_contents_pointer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
        final SubLObject contents_pointer = get_basic_bag_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push($sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, contents_pointer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_enumerator_contents_pointer(self, contents_pointer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }

    public static SubLObject basic_bag_enumerator_set_contents_pointer_method(final SubLObject self, final SubLObject new_pointer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
        SubLObject contents_pointer = get_basic_bag_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push($sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != new_pointer)) && (NIL == subloop_private_pair_p(new_pointer))) {
                    Errors.error($str593$_SET_CONTENTS_POINTER__S____S_is_, self, new_pointer);
                }
                contents_pointer = new_pointer;
                sublisp_throw($sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, new_pointer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_enumerator_contents_pointer(self, contents_pointer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }

    public static SubLObject basic_bag_enumerator_get_contents_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
        final SubLObject contents = get_basic_bag_enumerator_contents(self);
        try {
            thread.throwStack.push($sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, contents);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_enumerator_contents(self, contents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }

    public static SubLObject basic_bag_enumerator_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
        SubLObject contents = get_basic_bag_enumerator_contents(self);
        try {
            thread.throwStack.push($sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_contents.isList())) {
                    Errors.error($str599$_SET_CONTENTS__S____S_is_not_an_i, self, new_contents);
                }
                contents = new_contents;
                sublisp_throw($sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, new_contents);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_enumerator_contents(self, contents);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }

    public static SubLObject basic_bag_enumerator_get_direction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
        final SubLObject direction = get_basic_bag_enumerator_direction(self);
        try {
            thread.throwStack.push($sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                sublisp_throw($sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, direction);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_enumerator_direction(self, direction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }

    public static SubLObject basic_bag_enumerator_set_direction_method(final SubLObject self, final SubLObject new_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
        SubLObject direction = get_basic_bag_enumerator_direction(self);
        try {
            thread.throwStack.push($sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == sequential_direction_p(new_direction))) {
                    Errors.error($str605$_SET_DIRECTION__S____S_is_not_an_, self, new_direction);
                }
                direction = new_direction;
                sublisp_throw($sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, new_direction);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_enumerator_direction(self, direction);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, $sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }

    public static SubLObject bag_template_p(final SubLObject bag_template) {
        return interfaces.subloop_instanceof_interface(bag_template, BAG_TEMPLATE);
    }

    public static SubLObject subloop_collections_bag_template_translate_pair(final SubLObject subloop_private_pair) {
        final SubLObject element = basic_pair_get_first_method(subloop_private_pair);
        final SubLObject count = basic_pair_get_second_method(subloop_private_pair);
        SubLObject result = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
            result = cons(element, result);
        }
        return result;
    }

    public static SubLObject get_basic_bag_bag_representation(final SubLObject basic_bag) {
        return classes.subloop_get_access_protected_instance_slot(basic_bag, THREE_INTEGER, BAG_REPRESENTATION);
    }

    public static SubLObject set_basic_bag_bag_representation(final SubLObject basic_bag, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_bag, value, THREE_INTEGER, BAG_REPRESENTATION);
    }

    public static SubLObject basic_bag_empty_p_method(final SubLObject self) {
        return sublisp_null(basic_bag_get_internal_representation_method(self));
    }

    public static SubLObject basic_bag_get_unique_element_count_method(final SubLObject self) {
        return length(basic_bag_get_internal_representation_method(self));
    }

    public static SubLObject basic_bag_get_unique_elements_method(final SubLObject self) {
        SubLObject template_unique_elements = NIL;
        SubLObject cdolist_list_var;
        final SubLObject template_bag_list = cdolist_list_var = basic_bag_get_internal_representation_method(self);
        SubLObject template_element = NIL;
        template_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subloop_private_pair_p(template_element)) {
                template_unique_elements = cons(basic_pair_get_first_method(template_element), template_unique_elements);
            } else {
                template_unique_elements = cons(template_element, template_unique_elements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        } 
        return template_unique_elements;
    }

    public static SubLObject basic_bag_occurences_method(final SubLObject self, final SubLObject element) {
        SubLObject cdolist_list_var;
        final SubLObject template_bag_list = cdolist_list_var = basic_bag_get_internal_representation_method(self);
        SubLObject template_element = NIL;
        template_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subloop_private_pair_p(template_element)) {
                if (NIL != basic_collection_element_equal_p_method(self, basic_pair_get_first_method(template_element), element)) {
                    return basic_pair_get_second_method(template_element);
                }
            } else
                if (NIL != basic_collection_element_equal_p_method(self, template_element, element)) {
                    return ONE_INTEGER;
                }

            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        } 
        return ZERO_INTEGER;
    }

    public static SubLObject basic_bag_member_p_method(final SubLObject self, final SubLObject element) {
        SubLObject cdolist_list_var;
        final SubLObject template_bag_list = cdolist_list_var = basic_bag_get_internal_representation_method(self);
        SubLObject template_element = NIL;
        template_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subloop_private_pair_p(template_element)) {
                if (NIL != basic_collection_element_equal_p_method(self, basic_pair_get_first_method(template_element), element)) {
                    return T;
                }
            } else
                if (NIL != basic_collection_element_equal_p_method(self, template_element, element)) {
                    return T;
                }

            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject basic_bag_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_bag_list = basic_bag_get_internal_representation_method(self);
        if (NIL == template_bag_list) {
            return NIL;
        }
        SubLObject template_current_element = template_bag_list.first();
        if (NIL != subloop_private_pair_p(template_current_element)) {
            if (NIL != basic_collection_element_equal_p_method(self, old_element, basic_pair_get_first_method(template_current_element))) {
                final SubLObject template_count = basic_pair_get_second_method(template_current_element);
                if (template_count.numE(TWO_INTEGER)) {
                    rplaca(template_bag_list, basic_pair_get_first_method(template_current_element));
                    return old_element;
                }
                basic_pair_set_second_method(template_current_element, subtract(template_count, ONE_INTEGER));
                return old_element;
            }
        } else
            if (NIL != basic_collection_element_equal_p_method(self, old_element, template_current_element)) {
                basic_bag_set_internal_representation_method(self, template_bag_list.rest());
                return old_element;
            }

        SubLObject template_previous_cons = template_bag_list;
        for (SubLObject template_current_cons = template_bag_list.rest(); NIL != template_current_cons; template_current_cons = template_current_cons.rest()) {
            template_current_element = template_current_cons.first();
            if (NIL != subloop_private_pair_p(template_current_element)) {
                if (NIL != basic_collection_element_equal_p_method(self, old_element, basic_pair_get_first_method(template_current_element))) {
                    final SubLObject template_count2 = basic_pair_get_second_method(template_current_element);
                    if (template_count2.numE(TWO_INTEGER)) {
                        rplaca(template_current_cons, basic_pair_get_first_method(template_current_element));
                        return old_element;
                    }
                    basic_pair_set_second_method(template_current_element, subtract(template_count2, ONE_INTEGER));
                    return old_element;
                }
            } else
                if (NIL != basic_collection_element_equal_p_method(self, old_element, template_current_element)) {
                    rplacd(template_previous_cons, template_current_cons.rest());
                    return old_element;
                }

            template_previous_cons = template_current_cons;
        }
        return NIL;
    }

    public static SubLObject basic_bag_add_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_bag_list = basic_bag_get_internal_representation_method(self);
        SubLObject template_current_element = NIL;
        SubLObject template_sublist;
        SubLObject template_new_pair;
        for (template_sublist = NIL, template_sublist = template_bag_list; NIL != template_sublist; template_sublist = template_sublist.rest()) {
            template_current_element = template_sublist.first();
            if (NIL != subloop_private_pair_p(template_current_element)) {
                if (NIL != basic_collection_element_equal_p_method(self, new_element, basic_pair_get_first_method(template_current_element))) {
                    basic_pair_set_second_method(template_current_element, add(basic_pair_get_second_method(template_current_element), ONE_INTEGER));
                    return new_element;
                }
            } else
                if (NIL != basic_collection_element_equal_p_method(self, new_element, template_current_element)) {
                    template_new_pair = object.object_new_method(SUBLOOP_PRIVATE_PAIR);
                    basic_pair_set_first_method(template_new_pair, template_current_element);
                    basic_pair_set_second_method(template_new_pair, TWO_INTEGER);
                    rplaca(template_sublist, template_new_pair);
                    return new_element;
                }

        }
        basic_bag_set_internal_representation_method(self, cons(new_element, template_bag_list));
        return new_element;
    }

    public static SubLObject basic_bag_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        basic_bag_set_internal_representation_method(self, NIL);
        SubLObject cdolist_list_var = new_contents;
        SubLObject template_element = NIL;
        template_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            basic_bag_add_method(self, template_element);
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        } 
        return new_contents;
    }

    public static SubLObject basic_bag_get_contents_method(final SubLObject self) {
        final SubLObject template_bag_list = basic_bag_get_internal_representation_method(self);
        SubLObject template_contents = NIL;
        final SubLObject list_expression = template_bag_list;
        if (NIL == list_expression) {
            template_contents = NIL;
        } else
            if (list_expression.isAtom()) {
                template_contents = list(list_expression);
            } else
                if (NIL == list_expression.rest()) {
                    final SubLObject template_element = list_expression.first();
                    template_contents = (NIL != subloop_private_pair_p(template_element)) ? subloop_collections_bag_template_translate_pair(template_element) : list(template_element);
                } else {
                    SubLObject tail_cons = NIL;
                    SubLObject result = NIL;
                    template_contents = NIL;
                    SubLObject cdolist_list_var = list_expression;
                    SubLObject template_element2 = NIL;
                    template_element2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = (NIL != subloop_private_pair_p(template_element2)) ? subloop_collections_bag_template_translate_pair(template_element2) : list(template_element2);
                        if (NIL != result) {
                            if (NIL != tail_cons) {
                                rplacd(tail_cons, result);
                                tail_cons = last(result, UNPROVIDED);
                            } else {
                                template_contents = (NIL != subloop_private_pair_p(template_element2)) ? subloop_collections_bag_template_translate_pair(template_element2) : list(template_element2);
                                tail_cons = last(template_contents, UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        template_element2 = cdolist_list_var.first();
                    } 
                }


        return template_contents;
    }

    public static SubLObject basic_bag_get_element_count_method(final SubLObject self) {
        final SubLObject template_bag_list = basic_bag_get_internal_representation_method(self);
        SubLObject template_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = template_bag_list;
        SubLObject template_element = NIL;
        template_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subloop_private_pair_p(template_element)) {
                template_count = add(template_count, basic_pair_get_second_method(template_element));
            } else {
                template_count = add(template_count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        } 
        return template_count;
    }

    public static SubLObject basic_bag_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_bag_allocate_enumerator_method(self);
        if (NIL == template_enumerator) {
            format(stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
            format(stream, $str637$BAG__);
        } else {
            format(stream, $str638$BAG__S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
            while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                format(stream, $str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
            } 
            format(stream, $str131$_);
        }
        basic_bag_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }

    public static SubLObject subloop_reserved_initialize_basic_bag_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_basic_bag_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_BAG, BAG_REPRESENTATION, NIL);
        return NIL;
    }

    public static SubLObject basic_bag_p(final SubLObject basic_bag) {
        return classes.subloop_instanceof_class(basic_bag, BASIC_BAG);
    }

    public static SubLObject basic_bag_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_method = NIL;
        SubLObject bag_representation = get_basic_bag_bag_representation(self);
        try {
            thread.throwStack.push($sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
            try {
                basic_collection_initialize_method(self);
                bag_representation = NIL;
                sublisp_throw($sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_bag_representation(self, bag_representation);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_method = Errors.handleThrowable(ccatch_env_var, $sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_method;
    }

    public static SubLObject basic_bag_get_internal_representation_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_method = NIL;
        final SubLObject bag_representation = get_basic_bag_bag_representation(self);
        try {
            thread.throwStack.push($sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
            try {
                sublisp_throw($sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD, bag_representation);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_bag_representation(self, bag_representation);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_method = Errors.handleThrowable(ccatch_env_var, $sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_method;
    }

    public static SubLObject basic_bag_set_internal_representation_method(final SubLObject self, final SubLObject new_rep) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_method = NIL;
        SubLObject bag_representation = get_basic_bag_bag_representation(self);
        try {
            thread.throwStack.push($sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
            try {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!new_rep.isList())) {
                    Errors.error($str653$_SET_INTERNAL_REPRESENTATION__S__, self, new_rep);
                }
                bag_representation = new_rep;
                sublisp_throw($sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD, new_rep);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_bag_representation(self, bag_representation);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_method = Errors.handleThrowable(ccatch_env_var, $sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_method;
    }

    public static SubLObject basic_bag_allocate_enumerator_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_method = NIL;
        final SubLObject bag_representation = get_basic_bag_bag_representation(self);
        try {
            thread.throwStack.push($sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
            try {
                final SubLObject new_enumerator = object.object_new_method(BASIC_BAG_ENUMERATOR);
                final SubLObject contents_pointer = object.object_new_method(SUBLOOP_PRIVATE_PAIR);
                basic_bag_enumerator_set_contents_pointer_method(new_enumerator, contents_pointer);
                basic_bag_enumerator_set_contents_method(new_enumerator, bag_representation);
                basic_bag_enumerator_first_method(new_enumerator);
                sublisp_throw($sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD, new_enumerator);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_basic_bag_bag_representation(self, bag_representation);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_basic_bag_method = Errors.handleThrowable(ccatch_env_var, $sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_method;
    }

    public static SubLObject basic_bag_deallocate_enumerator_method(final SubLObject self, final SubLObject enumerator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == basic_bag_enumerator_p(enumerator))) {
            Errors.error($str659$_DEALLOCATE_ENUMERATOR__S____S_is, self, enumerator);
        }
        basic_bag_enumerator_set_contents_pointer_method(enumerator, NIL);
        basic_bag_enumerator_set_contents_method(enumerator, NIL);
        object.object_isolate_method(enumerator);
        return NIL;
    }

    public static SubLObject get_test_list_element_symbolic_name(final SubLObject test_list_element) {
        return classes.subloop_get_access_protected_instance_slot(test_list_element, TWO_INTEGER, SYMBOLIC_NAME);
    }

    public static SubLObject set_test_list_element_symbolic_name(final SubLObject test_list_element, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_list_element, value, TWO_INTEGER, SYMBOLIC_NAME);
    }

    public static SubLObject subloop_reserved_initialize_test_list_element_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_test_list_element_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_LIST_ELEMENT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_LIST_ELEMENT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_LIST_ELEMENT, SYMBOLIC_NAME, NIL);
        return NIL;
    }

    public static SubLObject test_list_element_p(final SubLObject test_list_element) {
        return classes.subloop_instanceof_class(test_list_element, TEST_LIST_ELEMENT);
    }

    public static SubLObject test_list_element_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_list_element_method = NIL;
        SubLObject symbolic_name = get_test_list_element_symbolic_name(self);
        try {
            thread.throwStack.push($sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
            try {
                symbolic_name = NIL;
                sublisp_throw($sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_test_list_element_symbolic_name(self, symbolic_name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_test_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_list_element_method;
    }

    public static SubLObject test_list_element_get_symbolic_name_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_list_element_method = NIL;
        final SubLObject symbolic_name = get_test_list_element_symbolic_name(self);
        try {
            thread.throwStack.push($sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
            try {
                sublisp_throw($sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, symbolic_name);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_test_list_element_symbolic_name(self, symbolic_name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_test_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_list_element_method;
    }

    public static SubLObject test_list_element_set_symbolic_name_method(final SubLObject self, final SubLObject new_symbolic_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_list_element_method = NIL;
        SubLObject symbolic_name = get_test_list_element_symbolic_name(self);
        try {
            thread.throwStack.push($sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
            try {
                symbolic_name = new_symbolic_name;
                sublisp_throw($sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, new_symbolic_name);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_test_list_element_symbolic_name(self, symbolic_name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_test_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_list_element_method;
    }

    public static SubLObject test_list_element_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_list_element_method = NIL;
        final SubLObject symbolic_name = get_test_list_element_symbolic_name(self);
        try {
            thread.throwStack.push($sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
            try {
                format(stream, $str680$__S_, symbolic_name);
                sublisp_throw($sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_test_list_element_symbolic_name(self, symbolic_name);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_test_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_list_element_method;
    }

    public static SubLObject test_list_element_on_add_method(final SubLObject self, final SubLObject parent_list) {
        return NIL;
    }

    public static SubLObject test_list_element_on_delete_method(final SubLObject self, final SubLObject parent_list) {
        return NIL;
    }

    public static SubLObject intern_test_list_element(final SubLObject symbolic_name) {
        SubLObject cdolist_list_var = $test_list_elements$.getGlobalValue();
        SubLObject list_element = NIL;
        list_element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (test_list_element_get_symbolic_name_method(list_element).eql(symbolic_name)) {
                return list_element;
            }
            cdolist_list_var = cdolist_list_var.rest();
            list_element = cdolist_list_var.first();
        } 
        final SubLObject new_list_element = object.object_new_method(TEST_LIST_ELEMENT);
        test_list_element_set_symbolic_name_method(new_list_element, symbolic_name);
        $test_list_elements$.setGlobalValue(cons(new_list_element, $test_list_elements$.getGlobalValue()));
        return new_list_element;
    }

    public static SubLObject enumerator_template_empty_p(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumerator_template_p(enumerator_template))) {
            Errors.error($str685$ENUMERATOR_TEMPLATE_EMPTY_P___S_i, enumerator_template);
        }
        if (NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_empty_p_method(enumerator_template);
        }
        if (NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_empty_p_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, EMPTY_P);
    }

    public static SubLObject enumerator_template_last_p(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumerator_template_p(enumerator_template))) {
            Errors.error($str686$ENUMERATOR_TEMPLATE_LAST_P___S_is, enumerator_template);
        }
        if (NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_last_p_method(enumerator_template);
        }
        if (NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_last_p_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, LAST_P);
    }

    public static SubLObject enumerator_template_first(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumerator_template_p(enumerator_template))) {
            Errors.error($str687$ENUMERATOR_TEMPLATE_FIRST___S_is_, enumerator_template);
        }
        if (NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_first_method(enumerator_template);
        }
        if (NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_first_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, FIRST);
    }

    public static SubLObject enumerator_template_next(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumerator_template_p(enumerator_template))) {
            Errors.error($str688$ENUMERATOR_TEMPLATE_NEXT___S_is_n, enumerator_template);
        }
        if (NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_next_method(enumerator_template);
        }
        if (NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_next_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, NEXT);
    }

    public static SubLObject enumerator_template_current(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumerator_template_p(enumerator_template))) {
            Errors.error($str689$ENUMERATOR_TEMPLATE_CURRENT___S_i, enumerator_template);
        }
        if (NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_current_method(enumerator_template);
        }
        if (NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_current_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, CURRENT);
    }

    public static SubLObject collection_template_empty_p(final SubLObject collection_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == collection_template_p(collection_template))) {
            Errors.error($str690$COLLECTION_TEMPLATE_EMPTY_P___S_i, collection_template);
        }
        if (NIL != basic_doubly_linked_list_p(collection_template)) {
            return basic_doubly_linked_list_empty_p_method(collection_template);
        }
        if (NIL != basic_end_pointer_list_p(collection_template)) {
            return basic_end_pointer_list_empty_p_method(collection_template);
        }
        if (NIL != basic_list_p(collection_template)) {
            return basic_list_empty_p_method(collection_template);
        }
        if (NIL != basic_collection_p(collection_template)) {
            return basic_collection_empty_p_method(collection_template);
        }
        return methods.funcall_instance_method_with_0_args(collection_template, EMPTY_P);
    }

    public static SubLObject doubly_linked_list_template_add(final SubLObject doubly_linked_list_template, final SubLObject new_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == doubly_linked_list_template_p(doubly_linked_list_template))) {
            Errors.error($str691$DOUBLY_LINKED_LIST_TEMPLATE_ADD__, doubly_linked_list_template);
        }
        if (NIL != basic_doubly_linked_list_p(doubly_linked_list_template)) {
            return basic_doubly_linked_list_add_method(doubly_linked_list_template, new_element);
        }
        return methods.funcall_instance_method_with_1_args(doubly_linked_list_template, ADD, new_element);
    }

    public static SubLObject doubly_linked_list_template_get_contents(final SubLObject doubly_linked_list_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == doubly_linked_list_template_p(doubly_linked_list_template))) {
            Errors.error($str692$DOUBLY_LINKED_LIST_TEMPLATE_GET_C, doubly_linked_list_template);
        }
        if (NIL != basic_doubly_linked_list_p(doubly_linked_list_template)) {
            return basic_doubly_linked_list_get_contents_method(doubly_linked_list_template);
        }
        return methods.funcall_instance_method_with_0_args(doubly_linked_list_template, GET_CONTENTS);
    }

    public static SubLObject declare_subloop_collections_file() {
        declareFunction(me, "valid_sequential_directions", "VALID-SEQUENTIAL-DIRECTIONS", 0, 0, false);
        declareFunction(me, "sequential_direction_p", "SEQUENTIAL-DIRECTION-P", 1, 0, false);
        declareFunction(me, "encode_sequential_direction", "ENCODE-SEQUENTIAL-DIRECTION", 1, 0, false);
        declareFunction(me, "decode_sequential_direction", "DECODE-SEQUENTIAL-DIRECTION", 1, 0, false);
        declareFunction(me, "sequential_direction_less_p", "SEQUENTIAL-DIRECTION-LESS-P", 2, 0, false);
        declareFunction(me, "sequential_direction_greater_p", "SEQUENTIAL-DIRECTION-GREATER-P", 2, 0, false);
        declareFunction(me, "iterator_template_p", "ITERATOR-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "enumerator_template_p", "ENUMERATOR-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "collection_enumerator_template_p", "COLLECTION-ENUMERATOR-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "protected_membership_template_p", "PROTECTED-MEMBERSHIP-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_collection_enumerator_direction", "GET-BASIC-COLLECTION-ENUMERATOR-DIRECTION", 1, 0, false);
        declareFunction(me, "set_basic_collection_enumerator_direction", "SET-BASIC-COLLECTION-ENUMERATOR-DIRECTION", 2, 0, false);
        declareFunction(me, "get_basic_collection_enumerator_contents_pointer", "GET-BASIC-COLLECTION-ENUMERATOR-CONTENTS-POINTER", 1, 0, false);
        declareFunction(me, "set_basic_collection_enumerator_contents_pointer", "SET-BASIC-COLLECTION-ENUMERATOR-CONTENTS-POINTER", 2, 0, false);
        declareFunction(me, "get_basic_collection_enumerator_collection_contents", "GET-BASIC-COLLECTION-ENUMERATOR-COLLECTION-CONTENTS", 1, 0, false);
        declareFunction(me, "set_basic_collection_enumerator_collection_contents", "SET-BASIC-COLLECTION-ENUMERATOR-COLLECTION-CONTENTS", 2, 0, false);
        declareFunction(me, "basic_collection_enumerator_previous_method", "BASIC-COLLECTION-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_next_method", "BASIC-COLLECTION-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_last_method", "BASIC-COLLECTION-ENUMERATOR-LAST-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_first_method", "BASIC-COLLECTION-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_current_method", "BASIC-COLLECTION-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_last_p_method", "BASIC-COLLECTION-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_first_p_method", "BASIC-COLLECTION-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_empty_p_method", "BASIC-COLLECTION-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_collection_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_collection_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_p", "BASIC-COLLECTION-ENUMERATOR-P", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_initialize_method", "BASIC-COLLECTION-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_store_collection_contents_method", "BASIC-COLLECTION-ENUMERATOR-STORE-COLLECTION-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_collection_enumerator_retrieve_collection_contents_method", "BASIC-COLLECTION-ENUMERATOR-RETRIEVE-COLLECTION-CONTENTS-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_set_contents_pointer_method", "BASIC-COLLECTION-ENUMERATOR-SET-CONTENTS-POINTER-METHOD", 2, 0, false);
        declareFunction(me, "basic_collection_enumerator_get_contents_pointer_method", "BASIC-COLLECTION-ENUMERATOR-GET-CONTENTS-POINTER-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_get_direction_method", "BASIC-COLLECTION-ENUMERATOR-GET-DIRECTION-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_enumerator_set_direction_method", "BASIC-COLLECTION-ENUMERATOR-SET-DIRECTION-METHOD", 2, 0, false);
        declareFunction(me, "collection_template_p", "COLLECTION-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_collection_element_equality_predicate", "GET-BASIC-COLLECTION-ELEMENT-EQUALITY-PREDICATE", 1, 0, false);
        declareFunction(me, "set_basic_collection_element_equality_predicate", "SET-BASIC-COLLECTION-ELEMENT-EQUALITY-PREDICATE", 2, 0, false);
        declareFunction(me, "get_basic_collection_contents", "GET-BASIC-COLLECTION-CONTENTS", 1, 0, false);
        declareFunction(me, "set_basic_collection_contents", "SET-BASIC-COLLECTION-CONTENTS", 2, 0, false);
        declareFunction(me, "basic_collection_empty_p_method", "BASIC-COLLECTION-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_member_p_method", "BASIC-COLLECTION-MEMBER-P-METHOD", 2, 0, false);
        declareFunction(me, "basic_collection_remove_method", "BASIC-COLLECTION-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "basic_collection_add_method", "BASIC-COLLECTION-ADD-METHOD", 2, 0, false);
        declareFunction(me, "basic_collection_clear_method", "BASIC-COLLECTION-CLEAR-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_get_element_count_method", "BASIC-COLLECTION-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_print_method", "BASIC-COLLECTION-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_collection_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_collection_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_collection_p", "BASIC-COLLECTION-P", 1, 0, false);
        declareFunction(me, "basic_collection_initialize_method", "BASIC-COLLECTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_element_equal_p_method", "BASIC-COLLECTION-ELEMENT-EQUAL-P-METHOD", 3, 0, false);
        declareFunction(me, "basic_collection_get_element_equality_predicate_method", "BASIC-COLLECTION-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_set_element_equality_predicate_method", "BASIC-COLLECTION-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false);
        declareFunction(me, "basic_collection_get_contents_method", "BASIC-COLLECTION-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_set_contents_method", "BASIC-COLLECTION-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_collection_allocate_enumerator_method", "BASIC-COLLECTION-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction(me, "basic_collection_deallocate_enumerator_method", "BASIC-COLLECTION-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction(me, "list_template_p", "LIST-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "basic_list_empty_p_method", "BASIC-LIST-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_list_reverse_method", "BASIC-LIST-REVERSE-METHOD", 1, 0, false);
        declareFunction(me, "basic_list_append_method", "BASIC-LIST-APPEND-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_position_method", "BASIC-LIST-POSITION-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_set_nth_method", "BASIC-LIST-SET-NTH-METHOD", 3, 0, false);
        declareFunction(me, "basic_list_nth_method", "BASIC-LIST-NTH-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_but_last_method", "BASIC-LIST-BUT-LAST-METHOD", 1, 0, false);
        declareFunction(me, "basic_list_pop_method", "BASIC-LIST-POP-METHOD", 1, 0, false);
        declareFunction(me, "basic_list_push_method", "BASIC-LIST-PUSH-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_print_method", "BASIC-LIST-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_list_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_list_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_list_p", "BASIC-LIST-P", 1, 0, false);
        declareFunction(me, "end_pointer_list_template_p", "END-POINTER-LIST-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_end_pointer_list_end_pointer", "GET-BASIC-END-POINTER-LIST-END-POINTER", 1, 0, false);
        declareFunction(me, "set_basic_end_pointer_list_end_pointer", "SET-BASIC-END-POINTER-LIST-END-POINTER", 2, 0, false);
        declareFunction(me, "basic_end_pointer_list_empty_p_method", "BASIC-END-POINTER-LIST-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_end_pointer_list_reverse_method", "BASIC-END-POINTER-LIST-REVERSE-METHOD", 1, 0, false);
        declareFunction(me, "basic_end_pointer_list_append_method", "BASIC-END-POINTER-LIST-APPEND-METHOD", 2, 0, false);
        declareFunction(me, "basic_end_pointer_list_position_method", "BASIC-END-POINTER-LIST-POSITION-METHOD", 2, 0, false);
        declareFunction(me, "basic_end_pointer_list_nth_method", "BASIC-END-POINTER-LIST-NTH-METHOD", 2, 0, false);
        declareFunction(me, "basic_end_pointer_list_but_last_method", "BASIC-END-POINTER-LIST-BUT-LAST-METHOD", 1, 0, false);
        declareFunction(me, "basic_end_pointer_list_pop_method", "BASIC-END-POINTER-LIST-POP-METHOD", 1, 0, false);
        declareFunction(me, "basic_end_pointer_list_push_method", "BASIC-END-POINTER-LIST-PUSH-METHOD", 2, 0, false);
        declareFunction(me, "basic_end_pointer_list_remove_method", "BASIC-END-POINTER-LIST-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "basic_end_pointer_list_add_method", "BASIC-END-POINTER-LIST-ADD-METHOD", 2, 0, false);
        declareFunction(me, "basic_end_pointer_list_clear_method", "BASIC-END-POINTER-LIST-CLEAR-METHOD", 1, 0, false);
        declareFunction(me, "basic_end_pointer_list_print_method", "BASIC-END-POINTER-LIST-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_end_pointer_list_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_end_pointer_list_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_end_pointer_list_p", "BASIC-END-POINTER-LIST-P", 1, 0, false);
        declareFunction(me, "basic_end_pointer_list_get_end_pointer_method", "BASIC-END-POINTER-LIST-GET-END-POINTER-METHOD", 1, 0, false);
        declareFunction(me, "basic_end_pointer_list_set_end_pointer_method", "BASIC-END-POINTER-LIST-SET-END-POINTER-METHOD", 2, 0, false);
        declareFunction(me, "double_link_cell_print_function_trampoline", "DOUBLE-LINK-CELL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "double_link_cell_p", "DOUBLE-LINK-CELL-P", 1, 0, false);
        new subloop_collections.$double_link_cell_p$UnaryFunction();
        declareFunction(me, "dlc_owner", "DLC-OWNER", 1, 0, false);
        declareFunction(me, "dlc_contents", "DLC-CONTENTS", 1, 0, false);
        declareFunction(me, "dlc_previous", "DLC-PREVIOUS", 1, 0, false);
        declareFunction(me, "dlc_next", "DLC-NEXT", 1, 0, false);
        declareFunction(me, "_csetf_dlc_owner", "_CSETF-DLC-OWNER", 2, 0, false);
        declareFunction(me, "_csetf_dlc_contents", "_CSETF-DLC-CONTENTS", 2, 0, false);
        declareFunction(me, "_csetf_dlc_previous", "_CSETF-DLC-PREVIOUS", 2, 0, false);
        declareFunction(me, "_csetf_dlc_next", "_CSETF-DLC-NEXT", 2, 0, false);
        declareFunction(me, "make_double_link_cell", "MAKE-DOUBLE-LINK-CELL", 0, 1, false);
        declareFunction(me, "visit_defstruct_double_link_cell", "VISIT-DEFSTRUCT-DOUBLE-LINK-CELL", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_double_link_cell_method", "VISIT-DEFSTRUCT-OBJECT-DOUBLE-LINK-CELL-METHOD", 2, 0, false);
        declareMacro(me, "with_dlc_read_only", "WITH-DLC-READ-ONLY");
        declareMacro(me, "with_dlc_read_write", "WITH-DLC-READ-WRITE");
        declareFunction(me, "dlc_copy_links", "DLC-COPY-LINKS", 2, 0, false);
        declareFunction(me, "list_element_template_p", "LIST-ELEMENT-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_list_element_qua_list_element_parent_links", "GET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false);
        declareFunction(me, "set_basic_list_element_qua_list_element_parent_links", "SET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false);
        declareFunction(me, "get_basic_list_element_qua_list_element_self_deletion_mode", "GET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false);
        declareFunction(me, "set_basic_list_element_qua_list_element_self_deletion_mode", "SET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false);
        declareFunction(me, "basic_list_element_perform_action_method", "BASIC-LIST-ELEMENT-PERFORM-ACTION-METHOD", 3, 0, false);
        declareFunction(me, "basic_list_element_on_delete_method", "BASIC-LIST-ELEMENT-ON-DELETE-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_element_on_add_method", "BASIC-LIST-ELEMENT-ON-ADD-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_element_get_collections_method", "BASIC-LIST-ELEMENT-GET-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction(me, "basic_list_element_member_p_method", "BASIC-LIST-ELEMENT-MEMBER-P-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_element_delete_self_from_all_collections_method", "BASIC-LIST-ELEMENT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction(me, "basic_list_element_transfer_self_method", "BASIC-LIST-ELEMENT-TRANSFER-SELF-METHOD", 3, 0, false);
        declareFunction(me, "basic_list_element_delete_self_from_collection_method", "BASIC-LIST-ELEMENT-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_element_delete_parent_link_method", "BASIC-LIST-ELEMENT-DELETE-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_element_add_parent_link_method", "BASIC-LIST-ELEMENT-ADD-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_list_element_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_list_element_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_list_element_p", "BASIC-LIST-ELEMENT-P", 1, 0, false);
        declareFunction(me, "basic_list_element_initialize_method", "BASIC-LIST-ELEMENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_list_element_get_parent_links_method", "BASIC-LIST-ELEMENT-GET-PARENT-LINKS-METHOD", 1, 0, false);
        declareFunction(me, "basic_list_element_set_parent_links_method", "BASIC-LIST-ELEMENT-SET-PARENT-LINKS-METHOD", 2, 0, false);
        declareFunction(me, "basic_list_element_get_self_deletion_mode_method", "BASIC-LIST-ELEMENT-GET-SELF-DELETION-MODE-METHOD", 1, 0, false);
        declareFunction(me, "basic_list_element_set_self_deletion_mode_method", "BASIC-LIST-ELEMENT-SET-SELF-DELETION-MODE-METHOD", 2, 0, false);
        declareFunction(me, "doubly_linked_list_template_p", "DOUBLY-LINKED-LIST-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_doubly_linked_list_last_link", "GET-BASIC-DOUBLY-LINKED-LIST-LAST-LINK", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_list_last_link", "SET-BASIC-DOUBLY-LINKED-LIST-LAST-LINK", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_list_first_link", "GET-BASIC-DOUBLY-LINKED-LIST-FIRST-LINK", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_list_first_link", "SET-BASIC-DOUBLY-LINKED-LIST-FIRST-LINK", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_list_element_count", "GET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-COUNT", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_list_element_count", "SET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-COUNT", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_list_element_equality_predicate", "GET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUALITY-PREDICATE", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_list_element_equality_predicate", "SET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUALITY-PREDICATE", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_swap_method", "BASIC-DOUBLY-LINKED-LIST-SWAP-METHOD", 3, 0, false);
        declareFunction(me, "basic_doubly_linked_list_empty_p_method", "BASIC-DOUBLY-LINKED-LIST-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_reverse_method", "BASIC-DOUBLY-LINKED-LIST-REVERSE-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_append_method", "BASIC-DOUBLY-LINKED-LIST-APPEND-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_position_method", "BASIC-DOUBLY-LINKED-LIST-POSITION-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_set_nth_method", "BASIC-DOUBLY-LINKED-LIST-SET-NTH-METHOD", 3, 0, false);
        declareFunction(me, "basic_doubly_linked_list_nth_method", "BASIC-DOUBLY-LINKED-LIST-NTH-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_but_last_method", "BASIC-DOUBLY-LINKED-LIST-BUT-LAST-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_pop_method", "BASIC-DOUBLY-LINKED-LIST-POP-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_push_method", "BASIC-DOUBLY-LINKED-LIST-PUSH-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_member_p_method", "BASIC-DOUBLY-LINKED-LIST-MEMBER-P-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_remove_method", "BASIC-DOUBLY-LINKED-LIST-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_add_method", "BASIC-DOUBLY-LINKED-LIST-ADD-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_clear_method", "BASIC-DOUBLY-LINKED-LIST-CLEAR-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_print_method", "BASIC-DOUBLY-LINKED-LIST-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "basic_doubly_linked_list_find_nth_link_method", "BASIC-DOUBLY-LINKED-LIST-FIND-NTH-LINK-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_find_link_method", "BASIC-DOUBLY-LINKED-LIST-FIND-LINK-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_reverse_link_method", "BASIC-DOUBLY-LINKED-LIST-REVERSE-LINK-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_delete_link_method", "BASIC-DOUBLY-LINKED-LIST-DELETE-LINK-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_set_contents_method", "BASIC-DOUBLY-LINKED-LIST-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_get_contents_method", "BASIC-DOUBLY-LINKED-LIST-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_element_equal_p_method", "BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUAL-P-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_doubly_linked_list_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_doubly_linked_list_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_p", "BASIC-DOUBLY-LINKED-LIST-P", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_get_element_equality_predicate_method", "BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_set_element_equality_predicate_method", "BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_set_element_count_method", "BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-COUNT-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_inc_element_count_method", "BASIC-DOUBLY-LINKED-LIST-INC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_dec_element_count_method", "BASIC-DOUBLY-LINKED-LIST-DEC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_get_first_link_method", "BASIC-DOUBLY-LINKED-LIST-GET-FIRST-LINK-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_set_first_link_method", "BASIC-DOUBLY-LINKED-LIST-SET-FIRST-LINK-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_get_last_link_method", "BASIC-DOUBLY-LINKED-LIST-GET-LAST-LINK-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_set_last_link_method", "BASIC-DOUBLY-LINKED-LIST-SET-LAST-LINK-METHOD", 2, 0, false);
        declareFunction(me, "basic_doubly_linked_list_get_element_count_method", "BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "get_basic_doubly_linked_list_enumerator_direction", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-DIRECTION", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_list_enumerator_direction", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-DIRECTION", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_list_enumerator_current_link", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-LINK", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_list_enumerator_current_link", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-LINK", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_list_enumerator_last_link", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-LINK", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_list_enumerator_last_link", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-LINK", 2, 0, false);
        declareFunction(me, "get_basic_doubly_linked_list_enumerator_first_link", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-LINK", 1, 0, false);
        declareFunction(me, "set_basic_doubly_linked_list_enumerator_first_link", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-LINK", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_doubly_linked_list_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_doubly_linked_list_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_p", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-P", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_initialize_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_isolate_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-ISOLATE-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_set_initial_state_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-SET-INITIAL-STATE-METHOD", 3, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_empty_p_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_first_p_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_last_p_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_current_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_first_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_last_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_next_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_enumerator_previous_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_allocate_enumerator_method", "BASIC-DOUBLY-LINKED-LIST-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction(me, "basic_doubly_linked_list_deallocate_enumerator_method", "BASIC-DOUBLY-LINKED-LIST-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction(me, "pair_template_p", "PAIR-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_pair_second_element", "GET-BASIC-PAIR-SECOND-ELEMENT", 1, 0, false);
        declareFunction(me, "set_basic_pair_second_element", "SET-BASIC-PAIR-SECOND-ELEMENT", 2, 0, false);
        declareFunction(me, "get_basic_pair_first_element", "GET-BASIC-PAIR-FIRST-ELEMENT", 1, 0, false);
        declareFunction(me, "set_basic_pair_first_element", "SET-BASIC-PAIR-FIRST-ELEMENT", 2, 0, false);
        declareFunction(me, "basic_pair_print_method", "BASIC-PAIR-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_pair_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_pair_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_pair_p", "BASIC-PAIR-P", 1, 0, false);
        declareFunction(me, "basic_pair_initialize_method", "BASIC-PAIR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_pair_get_first_method", "BASIC-PAIR-GET-FIRST-METHOD", 1, 0, false);
        declareFunction(me, "basic_pair_set_first_method", "BASIC-PAIR-SET-FIRST-METHOD", 2, 0, false);
        declareFunction(me, "basic_pair_get_second_method", "BASIC-PAIR-GET-SECOND-METHOD", 1, 0, false);
        declareFunction(me, "basic_pair_set_second_method", "BASIC-PAIR-SET-SECOND-METHOD", 2, 0, false);
        declareFunction(me, "triplet_template_p", "TRIPLET-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "get_basic_triplet_third_element", "GET-BASIC-TRIPLET-THIRD-ELEMENT", 1, 0, false);
        declareFunction(me, "set_basic_triplet_third_element", "SET-BASIC-TRIPLET-THIRD-ELEMENT", 2, 0, false);
        declareFunction(me, "basic_triplet_print_method", "BASIC-TRIPLET-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_triplet_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_triplet_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_triplet_p", "BASIC-TRIPLET-P", 1, 0, false);
        declareFunction(me, "basic_triplet_initialize_method", "BASIC-TRIPLET-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_triplet_get_third_method", "BASIC-TRIPLET-GET-THIRD-METHOD", 1, 0, false);
        declareFunction(me, "basic_triplet_set_third_method", "BASIC-TRIPLET-SET-THIRD-METHOD", 2, 0, false);
        declareFunction(me, "generic_dllt_add_parent_link_function", "GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION", 2, 0, false);
        declareFunction(me, "generic_dllt_delete_parent_link_function", "GENERIC-DLLT-DELETE-PARENT-LINK-FUNCTION", 2, 0, false);
        declareFunction(me, "generic_dllt_delete_link_function", "GENERIC-DLLT-DELETE-LINK-FUNCTION", 2, 0, false);
        declareFunction(me, "generic_dllt_delete_self_from_collection_function", "GENERIC-DLLT-DELETE-SELF-FROM-COLLECTION-FUNCTION", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_subloop_private_pair_class", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_subloop_private_pair_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-INSTANCE", 1, 0, false);
        declareFunction(me, "subloop_private_pair_p", "SUBLOOP-PRIVATE-PAIR-P", 1, 0, false);
        declareFunction(me, "subloop_private_pair_print_method", "SUBLOOP-PRIVATE-PAIR-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "bag_enumerator_template_p", "BAG-ENUMERATOR-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "subloop_collections_bag_enum_get_next", "SUBLOOP-COLLECTIONS-BAG-ENUM-GET-NEXT", 1, 0, false);
        declareFunction(me, "subloop_collections_get_previous_cons", "SUBLOOP-COLLECTIONS-GET-PREVIOUS-CONS", 2, 0, false);
        declareFunction(me, "subloop_collections_backup_pointer", "SUBLOOP-COLLECTIONS-BACKUP-POINTER", 2, 0, false);
        declareFunction(me, "get_basic_bag_enumerator_direction", "GET-BASIC-BAG-ENUMERATOR-DIRECTION", 1, 0, false);
        declareFunction(me, "set_basic_bag_enumerator_direction", "SET-BASIC-BAG-ENUMERATOR-DIRECTION", 2, 0, false);
        declareFunction(me, "get_basic_bag_enumerator_contents", "GET-BASIC-BAG-ENUMERATOR-CONTENTS", 1, 0, false);
        declareFunction(me, "set_basic_bag_enumerator_contents", "SET-BASIC-BAG-ENUMERATOR-CONTENTS", 2, 0, false);
        declareFunction(me, "get_basic_bag_enumerator_contents_pointer", "GET-BASIC-BAG-ENUMERATOR-CONTENTS-POINTER", 1, 0, false);
        declareFunction(me, "set_basic_bag_enumerator_contents_pointer", "SET-BASIC-BAG-ENUMERATOR-CONTENTS-POINTER", 2, 0, false);
        declareFunction(me, "basic_bag_enumerator_previous_method", "BASIC-BAG-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_next_method", "BASIC-BAG-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_last_method", "BASIC-BAG-ENUMERATOR-LAST-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_first_method", "BASIC-BAG-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_current_method", "BASIC-BAG-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_last_p_method", "BASIC-BAG-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_first_p_method", "BASIC-BAG-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_empty_p_method", "BASIC-BAG-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_bag_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_bag_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_p", "BASIC-BAG-ENUMERATOR-P", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_instantiate_method", "BASIC-BAG-ENUMERATOR-INSTANTIATE-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_get_contents_pointer_method", "BASIC-BAG-ENUMERATOR-GET-CONTENTS-POINTER-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_set_contents_pointer_method", "BASIC-BAG-ENUMERATOR-SET-CONTENTS-POINTER-METHOD", 2, 0, false);
        declareFunction(me, "basic_bag_enumerator_get_contents_method", "BASIC-BAG-ENUMERATOR-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_set_contents_method", "BASIC-BAG-ENUMERATOR-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_bag_enumerator_get_direction_method", "BASIC-BAG-ENUMERATOR-GET-DIRECTION-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_enumerator_set_direction_method", "BASIC-BAG-ENUMERATOR-SET-DIRECTION-METHOD", 2, 0, false);
        declareFunction(me, "bag_template_p", "BAG-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "subloop_collections_bag_template_translate_pair", "SUBLOOP-COLLECTIONS-BAG-TEMPLATE-TRANSLATE-PAIR", 1, 0, false);
        declareFunction(me, "get_basic_bag_bag_representation", "GET-BASIC-BAG-BAG-REPRESENTATION", 1, 0, false);
        declareFunction(me, "set_basic_bag_bag_representation", "SET-BASIC-BAG-BAG-REPRESENTATION", 2, 0, false);
        declareFunction(me, "basic_bag_empty_p_method", "BASIC-BAG-EMPTY-P-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_get_unique_element_count_method", "BASIC-BAG-GET-UNIQUE-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_get_unique_elements_method", "BASIC-BAG-GET-UNIQUE-ELEMENTS-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_occurences_method", "BASIC-BAG-OCCURENCES-METHOD", 2, 0, false);
        declareFunction(me, "basic_bag_member_p_method", "BASIC-BAG-MEMBER-P-METHOD", 2, 0, false);
        declareFunction(me, "basic_bag_remove_method", "BASIC-BAG-REMOVE-METHOD", 2, 0, false);
        declareFunction(me, "basic_bag_add_method", "BASIC-BAG-ADD-METHOD", 2, 0, false);
        declareFunction(me, "basic_bag_set_contents_method", "BASIC-BAG-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction(me, "basic_bag_get_contents_method", "BASIC-BAG-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_get_element_count_method", "BASIC-BAG-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_print_method", "BASIC-BAG-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_bag_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_basic_bag_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-INSTANCE", 1, 0, false);
        declareFunction(me, "basic_bag_p", "BASIC-BAG-P", 1, 0, false);
        declareFunction(me, "basic_bag_initialize_method", "BASIC-BAG-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_get_internal_representation_method", "BASIC-BAG-GET-INTERNAL-REPRESENTATION-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_set_internal_representation_method", "BASIC-BAG-SET-INTERNAL-REPRESENTATION-METHOD", 2, 0, false);
        declareFunction(me, "basic_bag_allocate_enumerator_method", "BASIC-BAG-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction(me, "basic_bag_deallocate_enumerator_method", "BASIC-BAG-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction(me, "get_test_list_element_symbolic_name", "GET-TEST-LIST-ELEMENT-SYMBOLIC-NAME", 1, 0, false);
        declareFunction(me, "set_test_list_element_symbolic_name", "SET-TEST-LIST-ELEMENT-SYMBOLIC-NAME", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_test_list_element_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_test_list_element_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-INSTANCE", 1, 0, false);
        declareFunction(me, "test_list_element_p", "TEST-LIST-ELEMENT-P", 1, 0, false);
        declareFunction(me, "test_list_element_initialize_method", "TEST-LIST-ELEMENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "test_list_element_get_symbolic_name_method", "TEST-LIST-ELEMENT-GET-SYMBOLIC-NAME-METHOD", 1, 0, false);
        declareFunction(me, "test_list_element_set_symbolic_name_method", "TEST-LIST-ELEMENT-SET-SYMBOLIC-NAME-METHOD", 2, 0, false);
        declareFunction(me, "test_list_element_print_method", "TEST-LIST-ELEMENT-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "test_list_element_on_add_method", "TEST-LIST-ELEMENT-ON-ADD-METHOD", 2, 0, false);
        declareFunction(me, "test_list_element_on_delete_method", "TEST-LIST-ELEMENT-ON-DELETE-METHOD", 2, 0, false);
        declareFunction(me, "intern_test_list_element", "INTERN-TEST-LIST-ELEMENT", 1, 0, false);
        declareFunction(me, "enumerator_template_empty_p", "ENUMERATOR-TEMPLATE-EMPTY-P", 1, 0, false);
        declareFunction(me, "enumerator_template_last_p", "ENUMERATOR-TEMPLATE-LAST-P", 1, 0, false);
        declareFunction(me, "enumerator_template_first", "ENUMERATOR-TEMPLATE-FIRST", 1, 0, false);
        declareFunction(me, "enumerator_template_next", "ENUMERATOR-TEMPLATE-NEXT", 1, 0, false);
        declareFunction(me, "enumerator_template_current", "ENUMERATOR-TEMPLATE-CURRENT", 1, 0, false);
        declareFunction(me, "collection_template_empty_p", "COLLECTION-TEMPLATE-EMPTY-P", 1, 0, false);
        declareFunction(me, "doubly_linked_list_template_add", "DOUBLY-LINKED-LIST-TEMPLATE-ADD", 2, 0, false);
        declareFunction(me, "doubly_linked_list_template_get_contents", "DOUBLY-LINKED-LIST-TEMPLATE-GET-CONTENTS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_subloop_collections_file() {
        defconstant("*VALID-SEQUENTIAL-DIRECTIONS*", $list0);
        defconstant("*DTP-DOUBLE-LINK-CELL*", DOUBLE_LINK_CELL);
        deflexical("*TEST-LIST-ELEMENTS*", SubLTrampolineFile.maybeDefault($test_list_elements$, $test_list_elements$, NIL));
        return NIL;
    }

    public static SubLObject setup_subloop_collections_file() {
        enumerations.enumerations_incorporate_definition(SEQUENTIAL_DIRECTION, $list0);
        interfaces.new_interface(ITERATOR_TEMPLATE, NIL, NIL, $list9);
        interfaces.new_interface(ENUMERATOR_TEMPLATE, $list11, $list12, $list13);
        interfaces.new_interface(COLLECTION_ENUMERATOR_TEMPLATE, $list15, $list16, $list17);
        interfaces.interfaces_add_interface_instance_method(EMPTY_P, COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list20);
        interfaces.interfaces_add_interface_instance_method(FIRST_P, COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list22);
        interfaces.interfaces_add_interface_instance_method(LAST_P, COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list24);
        interfaces.interfaces_add_interface_instance_method(CURRENT, COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list26);
        interfaces.interfaces_add_interface_instance_method(FIRST, COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list28);
        interfaces.interfaces_add_interface_instance_method(LAST, COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list30);
        interfaces.interfaces_add_interface_instance_method(NEXT, COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list32);
        interfaces.interfaces_add_interface_instance_method(PREVIOUS, COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list34);
        interfaces.new_interface(PROTECTED_MEMBERSHIP_TEMPLATE, NIL, NIL, $list36);
        classes.subloop_new_class(BASIC_COLLECTION_ENUMERATOR, OBJECT, $list39, NIL, $list40);
        classes.class_set_implements_slot_listeners(BASIC_COLLECTION_ENUMERATOR, NIL);
        methods.methods_incorporate_instance_method(PREVIOUS, BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list34);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, PREVIOUS, BASIC_COLLECTION_ENUMERATOR_PREVIOUS_METHOD);
        methods.methods_incorporate_instance_method(NEXT, BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list32);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, NEXT, BASIC_COLLECTION_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method(LAST, BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list30);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, LAST, BASIC_COLLECTION_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method(FIRST, BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list28);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, FIRST, BASIC_COLLECTION_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method(CURRENT, BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list26);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, CURRENT, BASIC_COLLECTION_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method(LAST_P, BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list24);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, LAST_P, BASIC_COLLECTION_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method(FIRST_P, BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list22);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, FIRST_P, BASIC_COLLECTION_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list20);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, EMPTY_P, BASIC_COLLECTION_ENUMERATOR_EMPTY_P_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_COLLECTION_ENUMERATOR, SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_COLLECTION_ENUMERATOR, SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_INSTANCE);
        subloop_reserved_initialize_basic_collection_enumerator_class(BASIC_COLLECTION_ENUMERATOR);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_COLLECTION_ENUMERATOR, $list61, NIL, $list62);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, INITIALIZE, BASIC_COLLECTION_ENUMERATOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(STORE_COLLECTION_CONTENTS, BASIC_COLLECTION_ENUMERATOR, $list66, $list67, $list68);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, STORE_COLLECTION_CONTENTS, BASIC_COLLECTION_ENUMERATOR_STORE_COLLECTION_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(RETRIEVE_COLLECTION_CONTENTS, BASIC_COLLECTION_ENUMERATOR, $list66, NIL, $list72);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, RETRIEVE_COLLECTION_CONTENTS, BASIC_COLLECTION_ENUMERATOR_RETRIEVE_COLLECTION_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS_POINTER, BASIC_COLLECTION_ENUMERATOR, $list66, $list76, $list77);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, SET_CONTENTS_POINTER, BASIC_COLLECTION_ENUMERATOR_SET_CONTENTS_POINTER_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS_POINTER, BASIC_COLLECTION_ENUMERATOR, $list66, NIL, $list81);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, GET_CONTENTS_POINTER, BASIC_COLLECTION_ENUMERATOR_GET_CONTENTS_POINTER_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECTION, BASIC_COLLECTION_ENUMERATOR, $list66, NIL, $list85);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, GET_DIRECTION, BASIC_COLLECTION_ENUMERATOR_GET_DIRECTION_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECTION, BASIC_COLLECTION_ENUMERATOR, $list66, $list89, $list90);
        methods.subloop_register_instance_method(BASIC_COLLECTION_ENUMERATOR, SET_DIRECTION, BASIC_COLLECTION_ENUMERATOR_SET_DIRECTION_METHOD);
        interfaces.new_interface(COLLECTION_TEMPLATE, NIL, NIL, $list95);
        interfaces.interfaces_add_interface_instance_method(PRINT, COLLECTION_TEMPLATE, $list19, $list97, $list98);
        interfaces.interfaces_add_interface_instance_method(ELEMENT_EQUAL_P, COLLECTION_TEMPLATE, $list19, $list100, $list101);
        interfaces.interfaces_add_interface_instance_method(GET_ELEMENT_COUNT, COLLECTION_TEMPLATE, $list19, NIL, $list103);
        interfaces.interfaces_add_interface_instance_method(CLEAR, COLLECTION_TEMPLATE, $list19, NIL, $list105);
        interfaces.interfaces_add_interface_instance_method(ADD, COLLECTION_TEMPLATE, $list19, $list107, $list108);
        interfaces.interfaces_add_interface_instance_method(REMOVE, COLLECTION_TEMPLATE, $list19, $list110, $list111);
        interfaces.interfaces_add_interface_instance_method(MEMBER_P, COLLECTION_TEMPLATE, $list19, $list113, $list114);
        interfaces.interfaces_add_interface_instance_method(EMPTY_P, COLLECTION_TEMPLATE, $list19, NIL, $list115);
        classes.subloop_new_class(BASIC_COLLECTION, OBJECT, $list117, NIL, $list118);
        classes.class_set_implements_slot_listeners(BASIC_COLLECTION, NIL);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_COLLECTION, $list19, NIL, $list115);
        methods.subloop_register_instance_method(BASIC_COLLECTION, EMPTY_P, BASIC_COLLECTION_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, BASIC_COLLECTION, $list19, $list113, $list114);
        methods.subloop_register_instance_method(BASIC_COLLECTION, MEMBER_P, BASIC_COLLECTION_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, BASIC_COLLECTION, $list19, $list110, $list111);
        methods.subloop_register_instance_method(BASIC_COLLECTION, REMOVE, BASIC_COLLECTION_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ADD, BASIC_COLLECTION, $list19, $list107, $list108);
        methods.subloop_register_instance_method(BASIC_COLLECTION, ADD, BASIC_COLLECTION_ADD_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_COLLECTION, $list19, NIL, $list105);
        methods.subloop_register_instance_method(BASIC_COLLECTION, CLEAR, BASIC_COLLECTION_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, BASIC_COLLECTION, $list19, NIL, $list103);
        methods.subloop_register_instance_method(BASIC_COLLECTION, GET_ELEMENT_COUNT, BASIC_COLLECTION_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_COLLECTION, $list19, $list97, $list98);
        methods.subloop_register_instance_method(BASIC_COLLECTION, PRINT, BASIC_COLLECTION_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_COLLECTION, SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_COLLECTION, SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_INSTANCE);
        subloop_reserved_initialize_basic_collection_class(BASIC_COLLECTION);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_COLLECTION, $list61, NIL, $list135);
        methods.subloop_register_instance_method(BASIC_COLLECTION, INITIALIZE, BASIC_COLLECTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ELEMENT_EQUAL_P, BASIC_COLLECTION, $list19, $list100, $list138);
        methods.subloop_register_instance_method(BASIC_COLLECTION, ELEMENT_EQUAL_P, BASIC_COLLECTION_ELEMENT_EQUAL_P_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_EQUALITY_PREDICATE, BASIC_COLLECTION, $list19, NIL, $list144);
        methods.subloop_register_instance_method(BASIC_COLLECTION, GET_ELEMENT_EQUALITY_PREDICATE, BASIC_COLLECTION_GET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_ELEMENT_EQUALITY_PREDICATE, BASIC_COLLECTION, $list19, $list148, $list149);
        methods.subloop_register_instance_method(BASIC_COLLECTION, SET_ELEMENT_EQUALITY_PREDICATE, BASIC_COLLECTION_SET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_COLLECTION, $list19, NIL, $list153);
        methods.subloop_register_instance_method(BASIC_COLLECTION, GET_CONTENTS, BASIC_COLLECTION_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, BASIC_COLLECTION, $list19, $list157, $list158);
        methods.subloop_register_instance_method(BASIC_COLLECTION, SET_CONTENTS, BASIC_COLLECTION_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, BASIC_COLLECTION, $list19, NIL, $list163);
        methods.subloop_register_instance_method(BASIC_COLLECTION, ALLOCATE_ENUMERATOR, BASIC_COLLECTION_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, BASIC_COLLECTION, $list19, $list167, $list168);
        methods.subloop_register_instance_method(BASIC_COLLECTION, DEALLOCATE_ENUMERATOR, BASIC_COLLECTION_DEALLOCATE_ENUMERATOR_METHOD);
        interfaces.new_interface(LIST_TEMPLATE, $list117, $list171, $list172);
        interfaces.interfaces_add_interface_instance_method(PRINT, LIST_TEMPLATE, $list19, $list97, $list173);
        interfaces.interfaces_add_interface_instance_method(PUSH, LIST_TEMPLATE, $list19, $list107, $list175);
        interfaces.interfaces_add_interface_instance_method(POP, LIST_TEMPLATE, $list19, NIL, $list177);
        interfaces.interfaces_add_interface_instance_method(BUT_LAST, LIST_TEMPLATE, $list19, NIL, $list179);
        interfaces.interfaces_add_interface_instance_method(NTH, LIST_TEMPLATE, $list19, $list181, $list182);
        interfaces.interfaces_add_interface_instance_method(SET_NTH, LIST_TEMPLATE, $list19, $list184, $list185);
        interfaces.interfaces_add_interface_instance_method(POSITION, LIST_TEMPLATE, $list19, $list113, $list187);
        interfaces.interfaces_add_interface_instance_method(APPEND, LIST_TEMPLATE, $list19, $list189, $list190);
        interfaces.interfaces_add_interface_instance_method(REVERSE, LIST_TEMPLATE, $list19, NIL, $list192);
        classes.subloop_new_class(BASIC_LIST, BASIC_COLLECTION, $list194, NIL, $list195);
        classes.class_set_implements_slot_listeners(BASIC_LIST, NIL);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_LIST, $list19, NIL, $list115);
        methods.subloop_register_instance_method(BASIC_LIST, EMPTY_P, BASIC_LIST_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(REVERSE, BASIC_LIST, $list19, NIL, $list192);
        methods.subloop_register_instance_method(BASIC_LIST, REVERSE, BASIC_LIST_REVERSE_METHOD);
        methods.methods_incorporate_instance_method(APPEND, BASIC_LIST, $list19, $list189, $list190);
        methods.subloop_register_instance_method(BASIC_LIST, APPEND, BASIC_LIST_APPEND_METHOD);
        methods.methods_incorporate_instance_method(POSITION, BASIC_LIST, $list19, $list113, $list187);
        methods.subloop_register_instance_method(BASIC_LIST, POSITION, BASIC_LIST_POSITION_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, BASIC_LIST, $list19, $list184, $list185);
        methods.subloop_register_instance_method(BASIC_LIST, SET_NTH, BASIC_LIST_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(NTH, BASIC_LIST, $list19, $list181, $list182);
        methods.subloop_register_instance_method(BASIC_LIST, NTH, BASIC_LIST_NTH_METHOD);
        methods.methods_incorporate_instance_method(BUT_LAST, BASIC_LIST, $list19, NIL, $list179);
        methods.subloop_register_instance_method(BASIC_LIST, BUT_LAST, BASIC_LIST_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method(POP, BASIC_LIST, $list19, NIL, $list177);
        methods.subloop_register_instance_method(BASIC_LIST, POP, BASIC_LIST_POP_METHOD);
        methods.methods_incorporate_instance_method(PUSH, BASIC_LIST, $list19, $list107, $list175);
        methods.subloop_register_instance_method(BASIC_LIST, PUSH, BASIC_LIST_PUSH_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_LIST, $list19, $list97, $list173);
        methods.subloop_register_instance_method(BASIC_LIST, PRINT, BASIC_LIST_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_LIST, SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_LIST, SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_INSTANCE);
        subloop_reserved_initialize_basic_list_class(BASIC_LIST);
        interfaces.new_interface(END_POINTER_LIST_TEMPLATE, $list194, $list212, $list213);
        interfaces.interfaces_add_interface_instance_method(CLEAR, END_POINTER_LIST_TEMPLATE, $list19, NIL, $list214);
        interfaces.interfaces_add_interface_instance_method(ADD, END_POINTER_LIST_TEMPLATE, $list19, $list107, $list215);
        interfaces.interfaces_add_interface_instance_method(REMOVE, END_POINTER_LIST_TEMPLATE, $list19, $list110, $list216);
        interfaces.interfaces_add_interface_instance_method(PUSH, END_POINTER_LIST_TEMPLATE, $list19, $list107, $list217);
        interfaces.interfaces_add_interface_instance_method(POP, END_POINTER_LIST_TEMPLATE, $list19, NIL, $list218);
        interfaces.interfaces_add_interface_instance_method(BUT_LAST, END_POINTER_LIST_TEMPLATE, $list19, NIL, $list219);
        interfaces.interfaces_add_interface_instance_method(APPEND, END_POINTER_LIST_TEMPLATE, $list19, $list189, $list220);
        interfaces.interfaces_add_interface_instance_method(REVERSE, END_POINTER_LIST_TEMPLATE, $list19, NIL, $list221);
        classes.subloop_new_class(BASIC_END_POINTER_LIST, BASIC_LIST, $list223, NIL, $list224);
        classes.class_set_implements_slot_listeners(BASIC_END_POINTER_LIST, NIL);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_END_POINTER_LIST, $list19, NIL, $list115);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, EMPTY_P, BASIC_END_POINTER_LIST_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(REVERSE, BASIC_END_POINTER_LIST, $list19, NIL, $list221);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, REVERSE, BASIC_END_POINTER_LIST_REVERSE_METHOD);
        methods.methods_incorporate_instance_method(APPEND, BASIC_END_POINTER_LIST, $list19, $list189, $list220);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, APPEND, BASIC_END_POINTER_LIST_APPEND_METHOD);
        methods.methods_incorporate_instance_method(POSITION, BASIC_END_POINTER_LIST, $list19, $list113, $list187);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, POSITION, BASIC_END_POINTER_LIST_POSITION_METHOD);
        methods.methods_incorporate_instance_method(NTH, BASIC_END_POINTER_LIST, $list19, $list181, $list182);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, NTH, BASIC_END_POINTER_LIST_NTH_METHOD);
        methods.methods_incorporate_instance_method(BUT_LAST, BASIC_END_POINTER_LIST, $list19, NIL, $list219);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, BUT_LAST, BASIC_END_POINTER_LIST_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method(POP, BASIC_END_POINTER_LIST, $list19, NIL, $list218);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, POP, BASIC_END_POINTER_LIST_POP_METHOD);
        methods.methods_incorporate_instance_method(PUSH, BASIC_END_POINTER_LIST, $list19, $list107, $list217);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, PUSH, BASIC_END_POINTER_LIST_PUSH_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, BASIC_END_POINTER_LIST, $list19, $list110, $list216);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, REMOVE, BASIC_END_POINTER_LIST_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ADD, BASIC_END_POINTER_LIST, $list19, $list107, $list215);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, ADD, BASIC_END_POINTER_LIST_ADD_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_END_POINTER_LIST, $list19, NIL, $list214);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, CLEAR, BASIC_END_POINTER_LIST_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_END_POINTER_LIST, $list19, $list97, $list173);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, PRINT, BASIC_END_POINTER_LIST_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_END_POINTER_LIST, SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_END_POINTER_LIST, SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_INSTANCE);
        subloop_reserved_initialize_basic_end_pointer_list_class(BASIC_END_POINTER_LIST);
        methods.methods_incorporate_instance_method(GET_END_POINTER, BASIC_END_POINTER_LIST, $list19, NIL, $list241);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, GET_END_POINTER, BASIC_END_POINTER_LIST_GET_END_POINTER_METHOD);
        methods.methods_incorporate_instance_method(SET_END_POINTER, BASIC_END_POINTER_LIST, $list19, $list245, $list246);
        methods.subloop_register_instance_method(BASIC_END_POINTER_LIST, SET_END_POINTER, BASIC_END_POINTER_LIST_SET_END_POINTER_METHOD);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_double_link_cell$.getGlobalValue(), symbol_function(DOUBLE_LINK_CELL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list257);
        def_csetf(DLC_OWNER, _CSETF_DLC_OWNER);
        def_csetf(DLC_CONTENTS, _CSETF_DLC_CONTENTS);
        def_csetf(DLC_PREVIOUS, _CSETF_DLC_PREVIOUS);
        def_csetf(DLC_NEXT, _CSETF_DLC_NEXT);
        identity(DOUBLE_LINK_CELL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_double_link_cell$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DOUBLE_LINK_CELL_METHOD));
        interfaces.new_interface(LIST_ELEMENT_TEMPLATE, NIL, NIL, $list280);
        interfaces.interfaces_add_interface_instance_method(ADD_PARENT_LINK, LIST_ELEMENT_TEMPLATE, $list19, $list282, $list283);
        interfaces.interfaces_add_interface_instance_method(DELETE_PARENT_LINK, LIST_ELEMENT_TEMPLATE, $list19, $list285, $list286);
        interfaces.interfaces_add_interface_instance_method(DELETE_SELF_FROM_COLLECTION, LIST_ELEMENT_TEMPLATE, $list19, $list288, $list289);
        interfaces.interfaces_add_interface_instance_method(TRANSFER_SELF, LIST_ELEMENT_TEMPLATE, $list19, $list291, $list292);
        interfaces.interfaces_add_interface_instance_method(DELETE_SELF_FROM_ALL_COLLECTIONS, LIST_ELEMENT_TEMPLATE, $list19, NIL, $list294);
        interfaces.interfaces_add_interface_instance_method(MEMBER_P, LIST_ELEMENT_TEMPLATE, $list19, $list288, $list295);
        interfaces.interfaces_add_interface_instance_method(GET_COLLECTIONS, LIST_ELEMENT_TEMPLATE, $list19, NIL, $list297);
        interfaces.interfaces_add_interface_instance_method(ON_ADD, LIST_ELEMENT_TEMPLATE, $list19, $list299, $list300);
        interfaces.interfaces_add_interface_instance_method(ON_DELETE, LIST_ELEMENT_TEMPLATE, $list19, $list299, $list300);
        interfaces.interfaces_add_interface_instance_method(PERFORM_ACTION, LIST_ELEMENT_TEMPLATE, $list19, $list303, $list304);
        classes.subloop_new_class(BASIC_LIST_ELEMENT, OBJECT, $list306, NIL, $list307);
        classes.class_set_implements_slot_listeners(BASIC_LIST_ELEMENT, NIL);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, BASIC_LIST_ELEMENT, $list19, $list303, $list304);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, PERFORM_ACTION, BASIC_LIST_ELEMENT_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method(ON_DELETE, BASIC_LIST_ELEMENT, $list19, $list299, $list300);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, ON_DELETE, BASIC_LIST_ELEMENT_ON_DELETE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, BASIC_LIST_ELEMENT, $list19, $list299, $list300);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, ON_ADD, BASIC_LIST_ELEMENT_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_COLLECTIONS, BASIC_LIST_ELEMENT, $list19, NIL, $list297);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, GET_COLLECTIONS, BASIC_LIST_ELEMENT_GET_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, BASIC_LIST_ELEMENT, $list19, $list288, $list295);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, MEMBER_P, BASIC_LIST_ELEMENT_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_ALL_COLLECTIONS, BASIC_LIST_ELEMENT, $list19, NIL, $list294);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, DELETE_SELF_FROM_ALL_COLLECTIONS, BASIC_LIST_ELEMENT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(TRANSFER_SELF, BASIC_LIST_ELEMENT, $list19, $list291, $list292);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, TRANSFER_SELF, BASIC_LIST_ELEMENT_TRANSFER_SELF_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_COLLECTION, BASIC_LIST_ELEMENT, $list19, $list288, $list289);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, DELETE_SELF_FROM_COLLECTION, BASIC_LIST_ELEMENT_DELETE_SELF_FROM_COLLECTION_METHOD);
        methods.methods_incorporate_instance_method(DELETE_PARENT_LINK, BASIC_LIST_ELEMENT, $list19, $list285, $list286);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, DELETE_PARENT_LINK, BASIC_LIST_ELEMENT_DELETE_PARENT_LINK_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARENT_LINK, BASIC_LIST_ELEMENT, $list19, $list282, $list283);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, ADD_PARENT_LINK, BASIC_LIST_ELEMENT_ADD_PARENT_LINK_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_LIST_ELEMENT, SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_LIST_ELEMENT, SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_INSTANCE);
        subloop_reserved_initialize_basic_list_element_class(BASIC_LIST_ELEMENT);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_LIST_ELEMENT, $list61, NIL, $list324);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, INITIALIZE, BASIC_LIST_ELEMENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PARENT_LINKS, BASIC_LIST_ELEMENT, $list61, NIL, $list328);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, GET_PARENT_LINKS, BASIC_LIST_ELEMENT_GET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_LINKS, BASIC_LIST_ELEMENT, $list61, $list332, $list333);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, SET_PARENT_LINKS, BASIC_LIST_ELEMENT_SET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_SELF_DELETION_MODE, BASIC_LIST_ELEMENT, $list61, NIL, $list337);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, GET_SELF_DELETION_MODE, BASIC_LIST_ELEMENT_GET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_SELF_DELETION_MODE, BASIC_LIST_ELEMENT, $list61, $list341, $list342);
        methods.subloop_register_instance_method(BASIC_LIST_ELEMENT, SET_SELF_DELETION_MODE, BASIC_LIST_ELEMENT_SET_SELF_DELETION_MODE_METHOD);
        interfaces.new_interface(DOUBLY_LINKED_LIST_TEMPLATE, $list194, $list212, $list346);
        interfaces.interfaces_add_interface_instance_method(DELETE_LINK, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list348, $list349);
        interfaces.interfaces_add_interface_instance_method(REVERSE_LINK, DOUBLY_LINKED_LIST_TEMPLATE, $list61, $list348, $list351);
        interfaces.interfaces_add_interface_instance_method(FIND_LINK, DOUBLY_LINKED_LIST_TEMPLATE, $list61, $list113, $list353);
        interfaces.interfaces_add_interface_instance_method(FIND_NTH_LINK, DOUBLY_LINKED_LIST_TEMPLATE, $list61, $list181, $list355);
        interfaces.interfaces_add_interface_instance_method(GET_CONTENTS, DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list356);
        interfaces.interfaces_add_interface_instance_method(SET_CONTENTS, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list157, $list357);
        interfaces.interfaces_add_interface_instance_method(PRINT, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list97, $list358);
        interfaces.interfaces_add_interface_instance_method(CLEAR, DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list359);
        interfaces.interfaces_add_interface_instance_method(ADD, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list107, $list360);
        interfaces.interfaces_add_interface_instance_method(REMOVE, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list110, $list361);
        interfaces.interfaces_add_interface_instance_method(MEMBER_P, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list113, $list362);
        interfaces.interfaces_add_interface_instance_method(PUSH, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list107, $list363);
        interfaces.interfaces_add_interface_instance_method(POP, DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list364);
        interfaces.interfaces_add_interface_instance_method(BUT_LAST, DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list365);
        interfaces.interfaces_add_interface_instance_method(NTH, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list181, $list366);
        interfaces.interfaces_add_interface_instance_method(SET_NTH, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list184, $list367);
        interfaces.interfaces_add_interface_instance_method(POSITION, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list113, $list368);
        interfaces.interfaces_add_interface_instance_method(APPEND, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list189, $list369);
        interfaces.interfaces_add_interface_instance_method(REVERSE, DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list370);
        interfaces.interfaces_add_interface_instance_method(EMPTY_P, DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list371);
        interfaces.interfaces_add_interface_instance_method(SWAP, DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list100, $list373);
        classes.subloop_new_class(BASIC_DOUBLY_LINKED_LIST, OBJECT, $list375, NIL, $list376);
        classes.class_set_implements_slot_listeners(BASIC_DOUBLY_LINKED_LIST, NIL);
        methods.methods_incorporate_instance_method(SWAP, BASIC_DOUBLY_LINKED_LIST, $list19, $list100, $list373);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, SWAP, BASIC_DOUBLY_LINKED_LIST_SWAP_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list371);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, EMPTY_P, BASIC_DOUBLY_LINKED_LIST_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(REVERSE, BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list370);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, REVERSE, BASIC_DOUBLY_LINKED_LIST_REVERSE_METHOD);
        methods.methods_incorporate_instance_method(APPEND, BASIC_DOUBLY_LINKED_LIST, $list19, $list189, $list369);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, APPEND, BASIC_DOUBLY_LINKED_LIST_APPEND_METHOD);
        methods.methods_incorporate_instance_method(POSITION, BASIC_DOUBLY_LINKED_LIST, $list19, $list113, $list368);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, POSITION, BASIC_DOUBLY_LINKED_LIST_POSITION_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, BASIC_DOUBLY_LINKED_LIST, $list19, $list184, $list367);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, SET_NTH, BASIC_DOUBLY_LINKED_LIST_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(NTH, BASIC_DOUBLY_LINKED_LIST, $list19, $list181, $list366);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, NTH, BASIC_DOUBLY_LINKED_LIST_NTH_METHOD);
        methods.methods_incorporate_instance_method(BUT_LAST, BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list365);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, BUT_LAST, BASIC_DOUBLY_LINKED_LIST_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method(POP, BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list364);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, POP, BASIC_DOUBLY_LINKED_LIST_POP_METHOD);
        methods.methods_incorporate_instance_method(PUSH, BASIC_DOUBLY_LINKED_LIST, $list19, $list107, $list363);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, PUSH, BASIC_DOUBLY_LINKED_LIST_PUSH_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, BASIC_DOUBLY_LINKED_LIST, $list19, $list113, $list362);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, MEMBER_P, BASIC_DOUBLY_LINKED_LIST_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, BASIC_DOUBLY_LINKED_LIST, $list19, $list110, $list361);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, REMOVE, BASIC_DOUBLY_LINKED_LIST_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ADD, BASIC_DOUBLY_LINKED_LIST, $list19, $list107, $list360);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, ADD, BASIC_DOUBLY_LINKED_LIST_ADD_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list359);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, CLEAR, BASIC_DOUBLY_LINKED_LIST_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_DOUBLY_LINKED_LIST, $list19, $list97, $list358);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, PRINT, BASIC_DOUBLY_LINKED_LIST_PRINT_METHOD);
        methods.methods_incorporate_instance_method(FIND_NTH_LINK, BASIC_DOUBLY_LINKED_LIST, $list61, $list181, $list355);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, FIND_NTH_LINK, BASIC_DOUBLY_LINKED_LIST_FIND_NTH_LINK_METHOD);
        methods.methods_incorporate_instance_method(FIND_LINK, BASIC_DOUBLY_LINKED_LIST, $list61, $list113, $list353);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, FIND_LINK, BASIC_DOUBLY_LINKED_LIST_FIND_LINK_METHOD);
        methods.methods_incorporate_instance_method(REVERSE_LINK, BASIC_DOUBLY_LINKED_LIST, $list61, $list348, $list351);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, REVERSE_LINK, BASIC_DOUBLY_LINKED_LIST_REVERSE_LINK_METHOD);
        methods.methods_incorporate_instance_method(DELETE_LINK, BASIC_DOUBLY_LINKED_LIST, $list19, $list348, $list349);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, DELETE_LINK, BASIC_DOUBLY_LINKED_LIST_DELETE_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, BASIC_DOUBLY_LINKED_LIST, $list19, $list157, $list357);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, SET_CONTENTS, BASIC_DOUBLY_LINKED_LIST_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list356);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, GET_CONTENTS, BASIC_DOUBLY_LINKED_LIST_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(ELEMENT_EQUAL_P, BASIC_DOUBLY_LINKED_LIST, $list19, $list100, $list101);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, ELEMENT_EQUAL_P, BASIC_DOUBLY_LINKED_LIST_ELEMENT_EQUAL_P_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_DOUBLY_LINKED_LIST, SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_DOUBLY_LINKED_LIST, SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_INSTANCE);
        subloop_reserved_initialize_basic_doubly_linked_list_class(BASIC_DOUBLY_LINKED_LIST);
        methods.methods_incorporate_instance_method(GET_ELEMENT_EQUALITY_PREDICATE, BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list144);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, GET_ELEMENT_EQUALITY_PREDICATE, BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_ELEMENT_EQUALITY_PREDICATE, BASIC_DOUBLY_LINKED_LIST, $list19, $list148, $list149);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, SET_ELEMENT_EQUALITY_PREDICATE, BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_LIST, $list61, $list418, $list419);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, SET_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(INC_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_LIST, $list61, NIL, $list424);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, INC_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_LIST_INC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(DEC_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_LIST, $list61, NIL, $list428);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, DEC_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_LIST_DEC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_FIRST_LINK, BASIC_DOUBLY_LINKED_LIST, $list61, NIL, $list432);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, GET_FIRST_LINK, BASIC_DOUBLY_LINKED_LIST_GET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_FIRST_LINK, BASIC_DOUBLY_LINKED_LIST, $list61, $list436, $list437);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, SET_FIRST_LINK, BASIC_DOUBLY_LINKED_LIST_SET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_LAST_LINK, BASIC_DOUBLY_LINKED_LIST, $list61, NIL, $list442);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, GET_LAST_LINK, BASIC_DOUBLY_LINKED_LIST_GET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_LAST_LINK, BASIC_DOUBLY_LINKED_LIST, $list61, $list446, $list447);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, SET_LAST_LINK, BASIC_DOUBLY_LINKED_LIST_SET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list451);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, GET_ELEMENT_COUNT, BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_COUNT_METHOD);
        classes.subloop_new_class(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, OBJECT, $list39, NIL, $list455);
        classes.class_set_implements_slot_listeners(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, NIL);
        classes.subloop_note_class_initialization_function(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym457$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_C);
        classes.subloop_note_instance_initialization_function(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym458$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_I);
        subloop_reserved_initialize_basic_doubly_linked_list_enumerator_class(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list61, NIL, $list459);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, INITIALIZE, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ISOLATE, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list463);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, ISOLATE, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, $list467, $list468);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, SET_INITIAL_STATE, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list471);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, EMPTY_P, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(FIRST_P, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list474);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, FIRST_P, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method(LAST_P, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list477);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, LAST_P, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method(CURRENT, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list480);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, CURRENT, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method(FIRST, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list483, NIL, $list484);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, FIRST, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method(LAST, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list483, NIL, $list486);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, LAST, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method(NEXT, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list483, NIL, $list488);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, NEXT, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method(PREVIOUS, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list483, NIL, $list490);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, PREVIOUS, BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_PREVIOUS_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list492);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, ALLOCATE_ENUMERATOR, BASIC_DOUBLY_LINKED_LIST_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, BASIC_DOUBLY_LINKED_LIST, $list19, $list167, $list495);
        methods.subloop_register_instance_method(BASIC_DOUBLY_LINKED_LIST, DEALLOCATE_ENUMERATOR, BASIC_DOUBLY_LINKED_LIST_DEALLOCATE_ENUMERATOR_METHOD);
        interfaces.new_interface(PAIR_TEMPLATE, NIL, NIL, $list498);
        interfaces.interfaces_add_interface_instance_method(PRINT, PAIR_TEMPLATE, $list19, $list97, $list499);
        classes.subloop_new_class(BASIC_PAIR, OBJECT, $list501, NIL, $list502);
        classes.class_set_implements_slot_listeners(BASIC_PAIR, NIL);
        methods.methods_incorporate_instance_method(PRINT, BASIC_PAIR, $list19, $list97, $list499);
        methods.subloop_register_instance_method(BASIC_PAIR, PRINT, BASIC_PAIR_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_PAIR, SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_PAIR, SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_INSTANCE);
        subloop_reserved_initialize_basic_pair_class(BASIC_PAIR);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_PAIR, $list61, NIL, $list509);
        methods.subloop_register_instance_method(BASIC_PAIR, INITIALIZE, BASIC_PAIR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_FIRST, BASIC_PAIR, $list19, NIL, $list513);
        methods.subloop_register_instance_method(BASIC_PAIR, GET_FIRST, BASIC_PAIR_GET_FIRST_METHOD);
        methods.methods_incorporate_instance_method(SET_FIRST, BASIC_PAIR, $list19, $list517, $list518);
        methods.subloop_register_instance_method(BASIC_PAIR, SET_FIRST, BASIC_PAIR_SET_FIRST_METHOD);
        methods.methods_incorporate_instance_method(GET_SECOND, BASIC_PAIR, $list19, NIL, $list522);
        methods.subloop_register_instance_method(BASIC_PAIR, GET_SECOND, BASIC_PAIR_GET_SECOND_METHOD);
        methods.methods_incorporate_instance_method(SET_SECOND, BASIC_PAIR, $list19, $list526, $list527);
        methods.subloop_register_instance_method(BASIC_PAIR, SET_SECOND, BASIC_PAIR_SET_SECOND_METHOD);
        interfaces.new_interface(TRIPLET_TEMPLATE, $list501, $list531, $list532);
        interfaces.interfaces_add_interface_instance_method(PRINT, TRIPLET_TEMPLATE, $list19, $list97, $list533);
        classes.subloop_new_class(BASIC_TRIPLET, BASIC_PAIR, $list535, NIL, $list536);
        classes.class_set_implements_slot_listeners(BASIC_TRIPLET, NIL);
        methods.methods_incorporate_instance_method(PRINT, BASIC_TRIPLET, $list19, $list97, $list533);
        methods.subloop_register_instance_method(BASIC_TRIPLET, PRINT, BASIC_TRIPLET_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_TRIPLET, SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_TRIPLET, SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_INSTANCE);
        subloop_reserved_initialize_basic_triplet_class(BASIC_TRIPLET);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_TRIPLET, $list61, NIL, $list542);
        methods.subloop_register_instance_method(BASIC_TRIPLET, INITIALIZE, BASIC_TRIPLET_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_THIRD, BASIC_TRIPLET, $list19, NIL, $list546);
        methods.subloop_register_instance_method(BASIC_TRIPLET, GET_THIRD, BASIC_TRIPLET_GET_THIRD_METHOD);
        methods.methods_incorporate_instance_method(SET_THIRD, BASIC_TRIPLET, $list19, $list550, $list551);
        methods.subloop_register_instance_method(BASIC_TRIPLET, SET_THIRD, BASIC_TRIPLET_SET_THIRD_METHOD);
        classes.subloop_new_class(SUBLOOP_PRIVATE_PAIR, BASIC_PAIR, NIL, NIL, $list555);
        classes.class_set_implements_slot_listeners(SUBLOOP_PRIVATE_PAIR, NIL);
        classes.subloop_note_class_initialization_function(SUBLOOP_PRIVATE_PAIR, SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_CLASS);
        classes.subloop_note_instance_initialization_function(SUBLOOP_PRIVATE_PAIR, SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_INSTANCE);
        subloop_reserved_initialize_subloop_private_pair_class(SUBLOOP_PRIVATE_PAIR);
        methods.methods_incorporate_instance_method(PRINT, SUBLOOP_PRIVATE_PAIR, $list19, $list97, $list558);
        methods.subloop_register_instance_method(SUBLOOP_PRIVATE_PAIR, PRINT, SUBLOOP_PRIVATE_PAIR_PRINT_METHOD);
        interfaces.new_interface(BAG_ENUMERATOR_TEMPLATE, $list15, $list16, $list562);
        interfaces.interfaces_add_interface_instance_method(EMPTY_P, BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list563);
        interfaces.interfaces_add_interface_instance_method(FIRST_P, BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list564);
        interfaces.interfaces_add_interface_instance_method(LAST_P, BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list565);
        interfaces.interfaces_add_interface_instance_method(CURRENT, BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list566);
        interfaces.interfaces_add_interface_instance_method(FIRST, BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list567);
        interfaces.interfaces_add_interface_instance_method(LAST, BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list568);
        interfaces.interfaces_add_interface_instance_method(NEXT, BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list569);
        interfaces.interfaces_add_interface_instance_method(PREVIOUS, BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list570);
        classes.subloop_new_class(BASIC_BAG_ENUMERATOR, OBJECT, $list572, NIL, $list573);
        classes.class_set_implements_slot_listeners(BASIC_BAG_ENUMERATOR, NIL);
        methods.methods_incorporate_instance_method(PREVIOUS, BASIC_BAG_ENUMERATOR, $list19, NIL, $list570);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, PREVIOUS, BASIC_BAG_ENUMERATOR_PREVIOUS_METHOD);
        methods.methods_incorporate_instance_method(NEXT, BASIC_BAG_ENUMERATOR, $list19, NIL, $list569);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, NEXT, BASIC_BAG_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method(LAST, BASIC_BAG_ENUMERATOR, $list19, NIL, $list568);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, LAST, BASIC_BAG_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method(FIRST, BASIC_BAG_ENUMERATOR, $list19, NIL, $list567);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, FIRST, BASIC_BAG_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method(CURRENT, BASIC_BAG_ENUMERATOR, $list19, NIL, $list566);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, CURRENT, BASIC_BAG_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method(LAST_P, BASIC_BAG_ENUMERATOR, $list19, NIL, $list565);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, LAST_P, BASIC_BAG_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method(FIRST_P, BASIC_BAG_ENUMERATOR, $list19, NIL, $list564);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, FIRST_P, BASIC_BAG_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_BAG_ENUMERATOR, $list19, NIL, $list563);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, EMPTY_P, BASIC_BAG_ENUMERATOR_EMPTY_P_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_BAG_ENUMERATOR, SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_BAG_ENUMERATOR, SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_INSTANCE);
        subloop_reserved_initialize_basic_bag_enumerator_class(BASIC_BAG_ENUMERATOR);
        methods.methods_incorporate_instance_method(INSTANTIATE, BASIC_BAG_ENUMERATOR, $list61, NIL, $list585);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, INSTANTIATE, BASIC_BAG_ENUMERATOR_INSTANTIATE_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS_POINTER, BASIC_BAG_ENUMERATOR, $list61, NIL, $list81);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, GET_CONTENTS_POINTER, BASIC_BAG_ENUMERATOR_GET_CONTENTS_POINTER_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS_POINTER, BASIC_BAG_ENUMERATOR, $list61, $list590, $list591);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, SET_CONTENTS_POINTER, BASIC_BAG_ENUMERATOR_SET_CONTENTS_POINTER_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_BAG_ENUMERATOR, $list61, NIL, $list153);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, GET_CONTENTS, BASIC_BAG_ENUMERATOR_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, BASIC_BAG_ENUMERATOR, $list61, $list157, $list597);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, SET_CONTENTS, BASIC_BAG_ENUMERATOR_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECTION, BASIC_BAG_ENUMERATOR, $list61, NIL, $list85);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, GET_DIRECTION, BASIC_BAG_ENUMERATOR_GET_DIRECTION_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECTION, BASIC_BAG_ENUMERATOR, $list61, $list89, $list603);
        methods.subloop_register_instance_method(BASIC_BAG_ENUMERATOR, SET_DIRECTION, BASIC_BAG_ENUMERATOR_SET_DIRECTION_METHOD);
        interfaces.new_interface(BAG_TEMPLATE, $list117, $list171, $list608);
        interfaces.interfaces_add_interface_instance_method(PRINT, BAG_TEMPLATE, $list19, $list97, $list609);
        interfaces.interfaces_add_interface_instance_method(GET_ELEMENT_COUNT, BAG_TEMPLATE, $list19, NIL, $list610);
        interfaces.interfaces_add_interface_instance_method(GET_CONTENTS, BAG_TEMPLATE, $list19, NIL, $list611);
        interfaces.interfaces_add_interface_instance_method(SET_CONTENTS, BAG_TEMPLATE, $list19, $list157, $list612);
        interfaces.interfaces_add_interface_instance_method(ADD, BAG_TEMPLATE, $list19, $list107, $list613);
        interfaces.interfaces_add_interface_instance_method(REMOVE, BAG_TEMPLATE, $list19, $list110, $list614);
        interfaces.interfaces_add_interface_instance_method(MEMBER_P, BAG_TEMPLATE, $list19, $list113, $list615);
        interfaces.interfaces_add_interface_instance_method(OCCURENCES, BAG_TEMPLATE, $list19, $list113, $list617);
        interfaces.interfaces_add_interface_instance_method(GET_UNIQUE_ELEMENTS, BAG_TEMPLATE, $list19, NIL, $list619);
        interfaces.interfaces_add_interface_instance_method(GET_UNIQUE_ELEMENT_COUNT, BAG_TEMPLATE, $list19, NIL, $list621);
        interfaces.interfaces_add_interface_instance_method(EMPTY_P, BAG_TEMPLATE, $list19, NIL, $list622);
        classes.subloop_new_class(BASIC_BAG, BASIC_COLLECTION, $list624, NIL, $list625);
        classes.class_set_implements_slot_listeners(BASIC_BAG, NIL);
        methods.methods_incorporate_instance_method(EMPTY_P, BASIC_BAG, $list19, NIL, $list622);
        methods.subloop_register_instance_method(BASIC_BAG, EMPTY_P, BASIC_BAG_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(GET_UNIQUE_ELEMENT_COUNT, BASIC_BAG, $list19, NIL, $list621);
        methods.subloop_register_instance_method(BASIC_BAG, GET_UNIQUE_ELEMENT_COUNT, BASIC_BAG_GET_UNIQUE_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_UNIQUE_ELEMENTS, BASIC_BAG, $list19, NIL, $list619);
        methods.subloop_register_instance_method(BASIC_BAG, GET_UNIQUE_ELEMENTS, BASIC_BAG_GET_UNIQUE_ELEMENTS_METHOD);
        methods.methods_incorporate_instance_method(OCCURENCES, BASIC_BAG, $list19, $list113, $list617);
        methods.subloop_register_instance_method(BASIC_BAG, OCCURENCES, BASIC_BAG_OCCURENCES_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, BASIC_BAG, $list19, $list113, $list615);
        methods.subloop_register_instance_method(BASIC_BAG, MEMBER_P, BASIC_BAG_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, BASIC_BAG, $list19, $list110, $list614);
        methods.subloop_register_instance_method(BASIC_BAG, REMOVE, BASIC_BAG_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ADD, BASIC_BAG, $list19, $list107, $list613);
        methods.subloop_register_instance_method(BASIC_BAG, ADD, BASIC_BAG_ADD_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, BASIC_BAG, $list19, $list157, $list612);
        methods.subloop_register_instance_method(BASIC_BAG, SET_CONTENTS, BASIC_BAG_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, BASIC_BAG, $list19, NIL, $list611);
        methods.subloop_register_instance_method(BASIC_BAG, GET_CONTENTS, BASIC_BAG_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, BASIC_BAG, $list19, NIL, $list610);
        methods.subloop_register_instance_method(BASIC_BAG, GET_ELEMENT_COUNT, BASIC_BAG_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(PRINT, BASIC_BAG, $list19, $list97, $list609);
        methods.subloop_register_instance_method(BASIC_BAG, PRINT, BASIC_BAG_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(BASIC_BAG, SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_CLASS);
        classes.subloop_note_instance_initialization_function(BASIC_BAG, SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_INSTANCE);
        subloop_reserved_initialize_basic_bag_class(BASIC_BAG);
        methods.methods_incorporate_instance_method(INITIALIZE, BASIC_BAG, $list61, NIL, $list642);
        methods.subloop_register_instance_method(BASIC_BAG, INITIALIZE, BASIC_BAG_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_REPRESENTATION, BASIC_BAG, $list61, NIL, $list646);
        methods.subloop_register_instance_method(BASIC_BAG, GET_INTERNAL_REPRESENTATION, BASIC_BAG_GET_INTERNAL_REPRESENTATION_METHOD);
        methods.methods_incorporate_instance_method(SET_INTERNAL_REPRESENTATION, BASIC_BAG, $list61, $list650, $list651);
        methods.subloop_register_instance_method(BASIC_BAG, SET_INTERNAL_REPRESENTATION, BASIC_BAG_SET_INTERNAL_REPRESENTATION_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, BASIC_BAG, $list19, NIL, $list655);
        methods.subloop_register_instance_method(BASIC_BAG, ALLOCATE_ENUMERATOR, BASIC_BAG_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, BASIC_BAG, $list19, $list167, $list658);
        methods.subloop_register_instance_method(BASIC_BAG, DEALLOCATE_ENUMERATOR, BASIC_BAG_DEALLOCATE_ENUMERATOR_METHOD);
        classes.subloop_new_class(TEST_LIST_ELEMENT, BASIC_LIST_ELEMENT, NIL, NIL, $list662);
        classes.class_set_implements_slot_listeners(TEST_LIST_ELEMENT, NIL);
        classes.subloop_note_class_initialization_function(TEST_LIST_ELEMENT, SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_LIST_ELEMENT, SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_INSTANCE);
        subloop_reserved_initialize_test_list_element_class(TEST_LIST_ELEMENT);
        methods.methods_incorporate_instance_method(INITIALIZE, TEST_LIST_ELEMENT, $list61, NIL, $list666);
        methods.subloop_register_instance_method(TEST_LIST_ELEMENT, INITIALIZE, TEST_LIST_ELEMENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_SYMBOLIC_NAME, TEST_LIST_ELEMENT, $list19, NIL, $list670);
        methods.subloop_register_instance_method(TEST_LIST_ELEMENT, GET_SYMBOLIC_NAME, TEST_LIST_ELEMENT_GET_SYMBOLIC_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_SYMBOLIC_NAME, TEST_LIST_ELEMENT, $list19, $list674, $list675);
        methods.subloop_register_instance_method(TEST_LIST_ELEMENT, SET_SYMBOLIC_NAME, TEST_LIST_ELEMENT_SET_SYMBOLIC_NAME_METHOD);
        methods.methods_incorporate_instance_method(PRINT, TEST_LIST_ELEMENT, $list19, $list97, $list678);
        methods.subloop_register_instance_method(TEST_LIST_ELEMENT, PRINT, TEST_LIST_ELEMENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, TEST_LIST_ELEMENT, $list19, $list299, $list300);
        methods.subloop_register_instance_method(TEST_LIST_ELEMENT, ON_ADD, TEST_LIST_ELEMENT_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(ON_DELETE, TEST_LIST_ELEMENT, $list19, $list299, $list300);
        methods.subloop_register_instance_method(TEST_LIST_ELEMENT, ON_DELETE, TEST_LIST_ELEMENT_ON_DELETE_METHOD);
        declare_defglobal($test_list_elements$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subloop_collections_file();
    }

    @Override
    public void initializeVariables() {
        init_subloop_collections_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subloop_collections_file();
    }

    

    public static final class $double_link_cell_native extends SubLStructNative {
        public SubLObject $owner;

        public SubLObject $contents;

        public SubLObject $previous;

        public SubLObject $next;

        private static final SubLStructDeclNative structDecl;

        private $double_link_cell_native() {
            this.$owner = Lisp.NIL;
            this.$contents = Lisp.NIL;
            this.$previous = Lisp.NIL;
            this.$next = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$owner;
        }

        @Override
        public SubLObject getField3() {
            return this.$contents;
        }

        @Override
        public SubLObject getField4() {
            return this.$previous;
        }

        @Override
        public SubLObject getField5() {
            return this.$next;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$owner = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$contents = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$previous = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$next = value;
        }

        static {
            structDecl = makeStructDeclNative($double_link_cell_native.class, DOUBLE_LINK_CELL, DOUBLE_LINK_CELL_P, $list251, $list252, new String[]{ "$owner", "$contents", "$previous", "$next" }, $list253, $list254, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $double_link_cell_p$UnaryFunction extends UnaryFunction {
        public $double_link_cell_p$UnaryFunction() {
            super(extractFunctionNamed("DOUBLE-LINK-CELL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return double_link_cell_p(arg1);
        }
    }
}

/**
 * Total time: 4595 ms
 */
