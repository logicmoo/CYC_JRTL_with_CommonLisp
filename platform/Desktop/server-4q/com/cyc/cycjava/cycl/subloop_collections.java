package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_collections extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subloop_collections";
    public static final String myFingerPrint = "9cbe9cd5c19fe05e7ff54f8bd88fc57bd6cfed71b18646fa9f4eed7b3dc3a8a7";
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
    private static SubLSymbol $valid_sequential_directions$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLSymbol $dtp_double_link_cell$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94572L)
    private static SubLSymbol $test_list_elements$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$SEQUENTIAL_DIRECTION;
    private static final SubLString $str2$_S___S_is_not_a_member_of_the__S_;
    private static final SubLSymbol $sym3$ENCODE_SEQUENTIAL_DIRECTION;
    private static final SubLString $str4$_S___S_is_not_a_valid_encoding_of;
    private static final SubLSymbol $sym5$DECODE_SEQUENTIAL_DIRECTION;
    private static final SubLString $str6$_S___S_was_expected_to_be_a_membe;
    private static final SubLSymbol $sym7$SEQUENTIAL_DIRECTION_P;
    private static final SubLSymbol $sym8$ITERATOR_TEMPLATE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$ENUMERATOR_TEMPLATE;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$COLLECTION_ENUMERATOR_TEMPLATE;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$EMPTY_P;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$FIRST_P;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$LAST_P;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$CURRENT;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$FIRST;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$LAST;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$NEXT;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$PREVIOUS;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$PROTECTED_MEMBERSHIP_TEMPLATE;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$BASIC_COLLECTION_ENUMERATOR;
    private static final SubLSymbol $sym38$OBJECT;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$DIRECTION;
    private static final SubLSymbol $sym42$CONTENTS_POINTER;
    private static final SubLSymbol $sym43$COLLECTION_CONTENTS;
    private static final SubLSymbol $kw44$FORWARDS;
    private static final SubLSymbol $kw45$NONE;
    private static final SubLSymbol $kw46$BACKWARDS;
    private static final SubLSymbol $sym47$BASIC_COLLECTION_ENUMERATOR_PREVIOUS_METHOD;
    private static final SubLSymbol $sym48$BASIC_COLLECTION_ENUMERATOR_NEXT_METHOD;
    private static final SubLSymbol $sym49$BASIC_COLLECTION_ENUMERATOR_LAST_METHOD;
    private static final SubLSymbol $sym50$BASIC_COLLECTION_ENUMERATOR_FIRST_METHOD;
    private static final SubLSymbol $sym51$BASIC_COLLECTION_ENUMERATOR_CURRENT_METHOD;
    private static final SubLSymbol $sym52$BASIC_COLLECTION_ENUMERATOR_LAST_P_METHOD;
    private static final SubLSymbol $sym53$BASIC_COLLECTION_ENUMERATOR_FIRST_P_METHOD;
    private static final SubLSymbol $sym54$BASIC_COLLECTION_ENUMERATOR_EMPTY_P_METHOD;
    private static final SubLSymbol $sym55$INSTANCE_COUNT;
    private static final SubLSymbol $sym56$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_CLASS;
    private static final SubLSymbol $sym57$ISOLATED_P;
    private static final SubLSymbol $sym58$INSTANCE_NUMBER;
    private static final SubLSymbol $sym59$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_INSTANCE;
    private static final SubLSymbol $sym60$INITIALIZE;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym64$BASIC_COLLECTION_ENUMERATOR_INITIALIZE_METHOD;
    private static final SubLSymbol $sym65$STORE_COLLECTION_CONTENTS;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym70$BASIC_COLLECTION_ENUMERATOR_STORE_COLLECTION_CONTENTS_METHOD;
    private static final SubLSymbol $sym71$RETRIEVE_COLLECTION_CONTENTS;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym74$BASIC_COLLECTION_ENUMERATOR_RETRIEVE_COLLECTION_CONTENTS_METHOD;
    private static final SubLSymbol $sym75$SET_CONTENTS_POINTER;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym79$BASIC_COLLECTION_ENUMERATOR_SET_CONTENTS_POINTER_METHOD;
    private static final SubLSymbol $sym80$GET_CONTENTS_POINTER;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym83$BASIC_COLLECTION_ENUMERATOR_GET_CONTENTS_POINTER_METHOD;
    private static final SubLSymbol $sym84$GET_DIRECTION;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym87$BASIC_COLLECTION_ENUMERATOR_GET_DIRECTION_METHOD;
    private static final SubLSymbol $sym88$SET_DIRECTION;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD;
    private static final SubLString $str92$_SET_DIRECTION__S____S_is_not_a_v;
    private static final SubLSymbol $sym93$BASIC_COLLECTION_ENUMERATOR_SET_DIRECTION_METHOD;
    private static final SubLSymbol $sym94$COLLECTION_TEMPLATE;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$PRINT;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$ELEMENT_EQUAL_P;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$GET_ELEMENT_COUNT;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$CLEAR;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$ADD;
    private static final SubLList $list107;
    private static final SubLList $list108;
    private static final SubLSymbol $sym109$REMOVE;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$MEMBER_P;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$BASIC_COLLECTION;
    private static final SubLList $list117;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$ELEMENT_EQUALITY_PREDICATE;
    private static final SubLSymbol $sym120$CONTENTS;
    private static final SubLSymbol $sym121$BASIC_COLLECTION_EMPTY_P_METHOD;
    private static final SubLSymbol $sym122$BASIC_COLLECTION_MEMBER_P_METHOD;
    private static final SubLSymbol $sym123$BASIC_COLLECTION_REMOVE_METHOD;
    private static final SubLSymbol $sym124$BASIC_COLLECTION_ADD_METHOD;
    private static final SubLSymbol $sym125$BASIC_COLLECTION_CLEAR_METHOD;
    private static final SubLSymbol $sym126$BASIC_COLLECTION_GET_ELEMENT_COUNT_METHOD;
    private static final SubLString $str127$___S_Class_is_not_correctly_imple;
    private static final SubLString $str128$__;
    private static final SubLString $str129$__S;
    private static final SubLString $str130$___S;
    private static final SubLString $str131$_;
    private static final SubLSymbol $sym132$BASIC_COLLECTION_PRINT_METHOD;
    private static final SubLSymbol $sym133$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_CLASS;
    private static final SubLSymbol $sym134$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_INSTANCE;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD;
    private static final SubLSymbol $sym137$BASIC_COLLECTION_INITIALIZE_METHOD;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD;
    private static final SubLSymbol $sym140$STRING_EQUAL;
    private static final SubLSymbol $sym141$CHAR_;
    private static final SubLSymbol $sym142$BASIC_COLLECTION_ELEMENT_EQUAL_P_METHOD;
    private static final SubLSymbol $sym143$GET_ELEMENT_EQUALITY_PREDICATE;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD;
    private static final SubLSymbol $sym146$BASIC_COLLECTION_GET_ELEMENT_EQUALITY_PREDICATE_METHOD;
    private static final SubLSymbol $sym147$SET_ELEMENT_EQUALITY_PREDICATE;
    private static final SubLList $list148;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD;
    private static final SubLSymbol $sym151$BASIC_COLLECTION_SET_ELEMENT_EQUALITY_PREDICATE_METHOD;
    private static final SubLSymbol $sym152$GET_CONTENTS;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD;
    private static final SubLSymbol $sym155$BASIC_COLLECTION_GET_CONTENTS_METHOD;
    private static final SubLSymbol $sym156$SET_CONTENTS;
    private static final SubLList $list157;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD;
    private static final SubLString $str160$_SET_CONTENTS__S____S_is_not_a_va;
    private static final SubLSymbol $sym161$BASIC_COLLECTION_SET_CONTENTS_METHOD;
    private static final SubLSymbol $sym162$ALLOCATE_ENUMERATOR;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD;
    private static final SubLSymbol $sym165$BASIC_COLLECTION_ALLOCATE_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym166$DEALLOCATE_ENUMERATOR;
    private static final SubLList $list167;
    private static final SubLList $list168;
    private static final SubLSymbol $sym169$BASIC_COLLECTION_DEALLOCATE_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym170$LIST_TEMPLATE;
    private static final SubLList $list171;
    private static final SubLList $list172;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$PUSH;
    private static final SubLList $list175;
    private static final SubLSymbol $sym176$POP;
    private static final SubLList $list177;
    private static final SubLSymbol $sym178$BUT_LAST;
    private static final SubLList $list179;
    private static final SubLSymbol $sym180$NTH;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLSymbol $sym183$SET_NTH;
    private static final SubLList $list184;
    private static final SubLList $list185;
    private static final SubLSymbol $sym186$POSITION;
    private static final SubLList $list187;
    private static final SubLSymbol $sym188$APPEND;
    private static final SubLList $list189;
    private static final SubLList $list190;
    private static final SubLSymbol $sym191$REVERSE;
    private static final SubLList $list192;
    private static final SubLSymbol $sym193$BASIC_LIST;
    private static final SubLList $list194;
    private static final SubLList $list195;
    private static final SubLSymbol $sym196$BASIC_LIST_EMPTY_P_METHOD;
    private static final SubLSymbol $sym197$BASIC_LIST_REVERSE_METHOD;
    private static final SubLString $str198$_APPEND__S____S_is_not_an_instanc;
    private static final SubLSymbol $sym199$BASIC_LIST_APPEND_METHOD;
    private static final SubLSymbol $sym200$BASIC_LIST_POSITION_METHOD;
    private static final SubLSymbol $sym201$BASIC_LIST_SET_NTH_METHOD;
    private static final SubLSymbol $sym202$BASIC_LIST_NTH_METHOD;
    private static final SubLSymbol $sym203$BASIC_LIST_BUT_LAST_METHOD;
    private static final SubLSymbol $sym204$BASIC_LIST_POP_METHOD;
    private static final SubLSymbol $sym205$BASIC_LIST_PUSH_METHOD;
    private static final SubLString $str206$LIST___;
    private static final SubLString $str207$LIST___S;
    private static final SubLSymbol $sym208$BASIC_LIST_PRINT_METHOD;
    private static final SubLSymbol $sym209$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_CLASS;
    private static final SubLSymbol $sym210$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_INSTANCE;
    private static final SubLSymbol $sym211$END_POINTER_LIST_TEMPLATE;
    private static final SubLList $list212;
    private static final SubLList $list213;
    private static final SubLList $list214;
    private static final SubLList $list215;
    private static final SubLList $list216;
    private static final SubLList $list217;
    private static final SubLList $list218;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLList $list221;
    private static final SubLSymbol $sym222$BASIC_END_POINTER_LIST;
    private static final SubLList $list223;
    private static final SubLList $list224;
    private static final SubLSymbol $sym225$END_POINTER;
    private static final SubLSymbol $sym226$BASIC_END_POINTER_LIST_EMPTY_P_METHOD;
    private static final SubLSymbol $sym227$BASIC_END_POINTER_LIST_REVERSE_METHOD;
    private static final SubLSymbol $sym228$BASIC_END_POINTER_LIST_APPEND_METHOD;
    private static final SubLSymbol $sym229$BASIC_END_POINTER_LIST_POSITION_METHOD;
    private static final SubLSymbol $sym230$BASIC_END_POINTER_LIST_NTH_METHOD;
    private static final SubLSymbol $sym231$BASIC_END_POINTER_LIST_BUT_LAST_METHOD;
    private static final SubLSymbol $sym232$BASIC_END_POINTER_LIST_POP_METHOD;
    private static final SubLSymbol $sym233$BASIC_END_POINTER_LIST_PUSH_METHOD;
    private static final SubLSymbol $sym234$BASIC_END_POINTER_LIST_REMOVE_METHOD;
    private static final SubLSymbol $sym235$BASIC_END_POINTER_LIST_ADD_METHOD;
    private static final SubLSymbol $sym236$BASIC_END_POINTER_LIST_CLEAR_METHOD;
    private static final SubLSymbol $sym237$BASIC_END_POINTER_LIST_PRINT_METHOD;
    private static final SubLSymbol $sym238$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_CLASS;
    private static final SubLSymbol $sym239$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_INSTANCE;
    private static final SubLSymbol $sym240$GET_END_POINTER;
    private static final SubLList $list241;
    private static final SubLSymbol $sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD;
    private static final SubLSymbol $sym243$BASIC_END_POINTER_LIST_GET_END_POINTER_METHOD;
    private static final SubLSymbol $sym244$SET_END_POINTER;
    private static final SubLList $list245;
    private static final SubLList $list246;
    private static final SubLSymbol $sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD;
    private static final SubLSymbol $sym248$BASIC_END_POINTER_LIST_SET_END_POINTER_METHOD;
    private static final SubLSymbol $sym249$DOUBLE_LINK_CELL;
    private static final SubLSymbol $sym250$DOUBLE_LINK_CELL_P;
    private static final SubLList $list251;
    private static final SubLList $list252;
    private static final SubLList $list253;
    private static final SubLList $list254;
    private static final SubLSymbol $sym255$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym256$DOUBLE_LINK_CELL_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list257;
    private static final SubLSymbol $sym258$DLC_OWNER;
    private static final SubLSymbol $sym259$_CSETF_DLC_OWNER;
    private static final SubLSymbol $sym260$DLC_CONTENTS;
    private static final SubLSymbol $sym261$_CSETF_DLC_CONTENTS;
    private static final SubLSymbol $sym262$DLC_PREVIOUS;
    private static final SubLSymbol $sym263$_CSETF_DLC_PREVIOUS;
    private static final SubLSymbol $sym264$DLC_NEXT;
    private static final SubLSymbol $sym265$_CSETF_DLC_NEXT;
    private static final SubLSymbol $kw266$OWNER;
    private static final SubLSymbol $kw267$CONTENTS;
    private static final SubLSymbol $kw268$PREVIOUS;
    private static final SubLSymbol $kw269$NEXT;
    private static final SubLString $str270$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw271$BEGIN;
    private static final SubLSymbol $sym272$MAKE_DOUBLE_LINK_CELL;
    private static final SubLSymbol $kw273$SLOT;
    private static final SubLSymbol $kw274$END;
    private static final SubLSymbol $sym275$VISIT_DEFSTRUCT_OBJECT_DOUBLE_LINK_CELL_METHOD;
    private static final SubLList $list276;
    private static final SubLString $str277$dlc;
    private static final SubLSymbol $sym278$DLC_;
    private static final SubLSymbol $sym279$LIST_ELEMENT_TEMPLATE;
    private static final SubLList $list280;
    private static final SubLSymbol $sym281$ADD_PARENT_LINK;
    private static final SubLList $list282;
    private static final SubLList $list283;
    private static final SubLSymbol $sym284$DELETE_PARENT_LINK;
    private static final SubLList $list285;
    private static final SubLList $list286;
    private static final SubLSymbol $sym287$DELETE_SELF_FROM_COLLECTION;
    private static final SubLList $list288;
    private static final SubLList $list289;
    private static final SubLSymbol $sym290$TRANSFER_SELF;
    private static final SubLList $list291;
    private static final SubLList $list292;
    private static final SubLSymbol $sym293$DELETE_SELF_FROM_ALL_COLLECTIONS;
    private static final SubLList $list294;
    private static final SubLList $list295;
    private static final SubLSymbol $sym296$GET_COLLECTIONS;
    private static final SubLList $list297;
    private static final SubLSymbol $sym298$ON_ADD;
    private static final SubLList $list299;
    private static final SubLList $list300;
    private static final SubLSymbol $sym301$ON_DELETE;
    private static final SubLSymbol $sym302$PERFORM_ACTION;
    private static final SubLList $list303;
    private static final SubLList $list304;
    private static final SubLSymbol $sym305$BASIC_LIST_ELEMENT;
    private static final SubLList $list306;
    private static final SubLList $list307;
    private static final SubLSymbol $sym308$QUA_LIST_ELEMENT_PARENT_LINKS;
    private static final SubLSymbol $sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE;
    private static final SubLInteger $int310$4097;
    private static final SubLSymbol $sym311$BASIC_LIST_ELEMENT_PERFORM_ACTION_METHOD;
    private static final SubLSymbol $sym312$BASIC_LIST_ELEMENT_ON_DELETE_METHOD;
    private static final SubLSymbol $sym313$BASIC_LIST_ELEMENT_ON_ADD_METHOD;
    private static final SubLSymbol $sym314$BASIC_LIST_ELEMENT_GET_COLLECTIONS_METHOD;
    private static final SubLSymbol $sym315$BASIC_LIST_ELEMENT_MEMBER_P_METHOD;
    private static final SubLSymbol $sym316$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD;
    private static final SubLString $str317$_TRANSFER_SELF__S____S_is_not_an_;
    private static final SubLSymbol $sym318$BASIC_LIST_ELEMENT_TRANSFER_SELF_METHOD;
    private static final SubLSymbol $sym319$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_COLLECTION_METHOD;
    private static final SubLSymbol $sym320$BASIC_LIST_ELEMENT_DELETE_PARENT_LINK_METHOD;
    private static final SubLSymbol $sym321$BASIC_LIST_ELEMENT_ADD_PARENT_LINK_METHOD;
    private static final SubLSymbol $sym322$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_CLASS;
    private static final SubLSymbol $sym323$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_INSTANCE;
    private static final SubLList $list324;
    private static final SubLSymbol $sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD;
    private static final SubLSymbol $sym326$BASIC_LIST_ELEMENT_INITIALIZE_METHOD;
    private static final SubLSymbol $sym327$GET_PARENT_LINKS;
    private static final SubLList $list328;
    private static final SubLSymbol $sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD;
    private static final SubLSymbol $sym330$BASIC_LIST_ELEMENT_GET_PARENT_LINKS_METHOD;
    private static final SubLSymbol $sym331$SET_PARENT_LINKS;
    private static final SubLList $list332;
    private static final SubLList $list333;
    private static final SubLSymbol $sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD;
    private static final SubLSymbol $sym335$BASIC_LIST_ELEMENT_SET_PARENT_LINKS_METHOD;
    private static final SubLSymbol $sym336$GET_SELF_DELETION_MODE;
    private static final SubLList $list337;
    private static final SubLSymbol $sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD;
    private static final SubLSymbol $sym339$BASIC_LIST_ELEMENT_GET_SELF_DELETION_MODE_METHOD;
    private static final SubLSymbol $sym340$SET_SELF_DELETION_MODE;
    private static final SubLList $list341;
    private static final SubLList $list342;
    private static final SubLSymbol $sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD;
    private static final SubLSymbol $sym344$BASIC_LIST_ELEMENT_SET_SELF_DELETION_MODE_METHOD;
    private static final SubLSymbol $sym345$DOUBLY_LINKED_LIST_TEMPLATE;
    private static final SubLList $list346;
    private static final SubLSymbol $sym347$DELETE_LINK;
    private static final SubLList $list348;
    private static final SubLList $list349;
    private static final SubLSymbol $sym350$REVERSE_LINK;
    private static final SubLList $list351;
    private static final SubLSymbol $sym352$FIND_LINK;
    private static final SubLList $list353;
    private static final SubLSymbol $sym354$FIND_NTH_LINK;
    private static final SubLList $list355;
    private static final SubLList $list356;
    private static final SubLList $list357;
    private static final SubLList $list358;
    private static final SubLList $list359;
    private static final SubLList $list360;
    private static final SubLList $list361;
    private static final SubLList $list362;
    private static final SubLList $list363;
    private static final SubLList $list364;
    private static final SubLList $list365;
    private static final SubLList $list366;
    private static final SubLList $list367;
    private static final SubLList $list368;
    private static final SubLList $list369;
    private static final SubLList $list370;
    private static final SubLList $list371;
    private static final SubLSymbol $sym372$SWAP;
    private static final SubLList $list373;
    private static final SubLSymbol $sym374$BASIC_DOUBLY_LINKED_LIST;
    private static final SubLList $list375;
    private static final SubLList $list376;
    private static final SubLSymbol $sym377$LAST_LINK;
    private static final SubLSymbol $sym378$FIRST_LINK;
    private static final SubLSymbol $sym379$ELEMENT_COUNT;
    private static final SubLString $str380$_SWAP__S___Cannot_swap_NIL_elemen;
    private static final SubLString $str381$_SWAP__S____S_is_not_an_element_o;
    private static final SubLSymbol $sym382$BASIC_DOUBLY_LINKED_LIST_SWAP_METHOD;
    private static final SubLSymbol $sym383$BASIC_DOUBLY_LINKED_LIST_EMPTY_P_METHOD;
    private static final SubLSymbol $sym384$BASIC_DOUBLY_LINKED_LIST_REVERSE_METHOD;
    private static final SubLString $str385$_APPEND__S___Cannot_append_non_li;
    private static final SubLSymbol $sym386$BASIC_DOUBLY_LINKED_LIST_APPEND_METHOD;
    private static final SubLSymbol $sym387$BASIC_DOUBLY_LINKED_LIST_POSITION_METHOD;
    private static final SubLSymbol $sym388$BASIC_DOUBLY_LINKED_LIST_SET_NTH_METHOD;
    private static final SubLSymbol $sym389$BASIC_DOUBLY_LINKED_LIST_NTH_METHOD;
    private static final SubLSymbol $sym390$BASIC_DOUBLY_LINKED_LIST_BUT_LAST_METHOD;
    private static final SubLSymbol $sym391$BASIC_DOUBLY_LINKED_LIST_POP_METHOD;
    private static final SubLSymbol $sym392$BASIC_DOUBLY_LINKED_LIST_PUSH_METHOD;
    private static final SubLSymbol $sym393$BASIC_DOUBLY_LINKED_LIST_MEMBER_P_METHOD;
    private static final SubLSymbol $sym394$BASIC_DOUBLY_LINKED_LIST_REMOVE_METHOD;
    private static final SubLSymbol $sym395$BASIC_DOUBLY_LINKED_LIST_ADD_METHOD;
    private static final SubLSymbol $sym396$BASIC_DOUBLY_LINKED_LIST_CLEAR_METHOD;
    private static final SubLString $str397$DLIST__;
    private static final SubLString $str398$DLIST__S;
    private static final SubLSymbol $sym399$BASIC_DOUBLY_LINKED_LIST_PRINT_METHOD;
    private static final SubLSymbol $sym400$BASIC_DOUBLY_LINKED_LIST_FIND_NTH_LINK_METHOD;
    private static final SubLSymbol $sym401$BASIC_DOUBLY_LINKED_LIST_FIND_LINK_METHOD;
    private static final SubLSymbol $sym402$BASIC_DOUBLY_LINKED_LIST_REVERSE_LINK_METHOD;
    private static final SubLString $str403$_DELETE_LINK__S____S_is_not_a_val;
    private static final SubLString $str404$_DELETE_LINK__S___Link__S_is_not_;
    private static final SubLString $str405$_DELETE_LINK__S___Detected_incons;
    private static final SubLSymbol $sym406$BASIC_DOUBLY_LINKED_LIST_DELETE_LINK_METHOD;
    private static final SubLString $str407$_SET_CONTENTS__S___Cannot_set_the;
    private static final SubLSymbol $sym408$BASIC_DOUBLY_LINKED_LIST_SET_CONTENTS_METHOD;
    private static final SubLSymbol $sym409$BASIC_DOUBLY_LINKED_LIST_GET_CONTENTS_METHOD;
    private static final SubLSymbol $sym410$BASIC_DOUBLY_LINKED_LIST_ELEMENT_EQUAL_P_METHOD;
    private static final SubLSymbol $sym411$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_CLASS;
    private static final SubLSymbol $sym412$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_INSTANCE;
    private static final SubLSymbol $sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLSymbol $sym414$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_EQUALITY_PREDICATE_METHOD;
    private static final SubLSymbol $sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLSymbol $sym416$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_EQUALITY_PREDICATE_METHOD;
    private static final SubLSymbol $sym417$SET_ELEMENT_COUNT;
    private static final SubLList $list418;
    private static final SubLList $list419;
    private static final SubLSymbol $sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLString $str421$_SET_ELEMENT_COUNT__S____S_is_not;
    private static final SubLSymbol $sym422$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_COUNT_METHOD;
    private static final SubLSymbol $sym423$INC_ELEMENT_COUNT;
    private static final SubLList $list424;
    private static final SubLSymbol $sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLSymbol $sym426$BASIC_DOUBLY_LINKED_LIST_INC_ELEMENT_COUNT_METHOD;
    private static final SubLSymbol $sym427$DEC_ELEMENT_COUNT;
    private static final SubLList $list428;
    private static final SubLSymbol $sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLSymbol $sym430$BASIC_DOUBLY_LINKED_LIST_DEC_ELEMENT_COUNT_METHOD;
    private static final SubLSymbol $sym431$GET_FIRST_LINK;
    private static final SubLList $list432;
    private static final SubLSymbol $sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLSymbol $sym434$BASIC_DOUBLY_LINKED_LIST_GET_FIRST_LINK_METHOD;
    private static final SubLSymbol $sym435$SET_FIRST_LINK;
    private static final SubLList $list436;
    private static final SubLList $list437;
    private static final SubLSymbol $sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLString $str439$_SET_FIRST_LINK__S____S_is_not_an;
    private static final SubLSymbol $sym440$BASIC_DOUBLY_LINKED_LIST_SET_FIRST_LINK_METHOD;
    private static final SubLSymbol $sym441$GET_LAST_LINK;
    private static final SubLList $list442;
    private static final SubLSymbol $sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLSymbol $sym444$BASIC_DOUBLY_LINKED_LIST_GET_LAST_LINK_METHOD;
    private static final SubLSymbol $sym445$SET_LAST_LINK;
    private static final SubLList $list446;
    private static final SubLList $list447;
    private static final SubLSymbol $sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLString $str449$_SET_LAST_LINK__S____S_is_not_an_;
    private static final SubLSymbol $sym450$BASIC_DOUBLY_LINKED_LIST_SET_LAST_LINK_METHOD;
    private static final SubLList $list451;
    private static final SubLSymbol $sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLSymbol $sym453$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_COUNT_METHOD;
    private static final SubLSymbol $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR;
    private static final SubLList $list455;
    private static final SubLSymbol $sym456$CURRENT_LINK;
    private static final SubLSymbol $sym457$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_C;
    private static final SubLSymbol $sym458$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_I;
    private static final SubLList $list459;
    private static final SubLSymbol $sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym461$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_INITIALIZE_METHOD;
    private static final SubLSymbol $sym462$ISOLATE;
    private static final SubLList $list463;
    private static final SubLSymbol $sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym465$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_ISOLATE_METHOD;
    private static final SubLSymbol $sym466$SET_INITIAL_STATE;
    private static final SubLList $list467;
    private static final SubLList $list468;
    private static final SubLSymbol $sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym470$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_SET_INITIAL_STATE_METHOD;
    private static final SubLList $list471;
    private static final SubLSymbol $sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym473$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_EMPTY_P_METHOD;
    private static final SubLList $list474;
    private static final SubLSymbol $sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym476$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_P_METHOD;
    private static final SubLList $list477;
    private static final SubLSymbol $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym479$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_P_METHOD;
    private static final SubLList $list480;
    private static final SubLSymbol $sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym482$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_CURRENT_METHOD;
    private static final SubLList $list483;
    private static final SubLList $list484;
    private static final SubLSymbol $sym485$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_METHOD;
    private static final SubLList $list486;
    private static final SubLSymbol $sym487$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_METHOD;
    private static final SubLList $list488;
    private static final SubLSymbol $sym489$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_NEXT_METHOD;
    private static final SubLList $list490;
    private static final SubLSymbol $sym491$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_PREVIOUS_METHOD;
    private static final SubLList $list492;
    private static final SubLSymbol $sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD;
    private static final SubLSymbol $sym494$BASIC_DOUBLY_LINKED_LIST_ALLOCATE_ENUMERATOR_METHOD;
    private static final SubLList $list495;
    private static final SubLSymbol $sym496$BASIC_DOUBLY_LINKED_LIST_DEALLOCATE_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym497$PAIR_TEMPLATE;
    private static final SubLList $list498;
    private static final SubLList $list499;
    private static final SubLSymbol $sym500$BASIC_PAIR;
    private static final SubLList $list501;
    private static final SubLList $list502;
    private static final SubLSymbol $sym503$SECOND_ELEMENT;
    private static final SubLSymbol $sym504$FIRST_ELEMENT;
    private static final SubLString $str505$__S___S_;
    private static final SubLSymbol $sym506$BASIC_PAIR_PRINT_METHOD;
    private static final SubLSymbol $sym507$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_CLASS;
    private static final SubLSymbol $sym508$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_INSTANCE;
    private static final SubLList $list509;
    private static final SubLSymbol $sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD;
    private static final SubLSymbol $sym511$BASIC_PAIR_INITIALIZE_METHOD;
    private static final SubLSymbol $sym512$GET_FIRST;
    private static final SubLList $list513;
    private static final SubLSymbol $sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD;
    private static final SubLSymbol $sym515$BASIC_PAIR_GET_FIRST_METHOD;
    private static final SubLSymbol $sym516$SET_FIRST;
    private static final SubLList $list517;
    private static final SubLList $list518;
    private static final SubLSymbol $sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD;
    private static final SubLSymbol $sym520$BASIC_PAIR_SET_FIRST_METHOD;
    private static final SubLSymbol $sym521$GET_SECOND;
    private static final SubLList $list522;
    private static final SubLSymbol $sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD;
    private static final SubLSymbol $sym524$BASIC_PAIR_GET_SECOND_METHOD;
    private static final SubLSymbol $sym525$SET_SECOND;
    private static final SubLList $list526;
    private static final SubLList $list527;
    private static final SubLSymbol $sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD;
    private static final SubLSymbol $sym529$BASIC_PAIR_SET_SECOND_METHOD;
    private static final SubLSymbol $sym530$TRIPLET_TEMPLATE;
    private static final SubLList $list531;
    private static final SubLList $list532;
    private static final SubLList $list533;
    private static final SubLSymbol $sym534$BASIC_TRIPLET;
    private static final SubLList $list535;
    private static final SubLList $list536;
    private static final SubLSymbol $sym537$THIRD_ELEMENT;
    private static final SubLString $str538$__S___S___S_;
    private static final SubLSymbol $sym539$BASIC_TRIPLET_PRINT_METHOD;
    private static final SubLSymbol $sym540$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_CLASS;
    private static final SubLSymbol $sym541$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_INSTANCE;
    private static final SubLList $list542;
    private static final SubLSymbol $sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD;
    private static final SubLSymbol $sym544$BASIC_TRIPLET_INITIALIZE_METHOD;
    private static final SubLSymbol $sym545$GET_THIRD;
    private static final SubLList $list546;
    private static final SubLSymbol $sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD;
    private static final SubLSymbol $sym548$BASIC_TRIPLET_GET_THIRD_METHOD;
    private static final SubLSymbol $sym549$SET_THIRD;
    private static final SubLList $list550;
    private static final SubLList $list551;
    private static final SubLSymbol $sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD;
    private static final SubLSymbol $sym553$BASIC_TRIPLET_SET_THIRD_METHOD;
    private static final SubLSymbol $sym554$SUBLOOP_PRIVATE_PAIR;
    private static final SubLList $list555;
    private static final SubLSymbol $sym556$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_CLASS;
    private static final SubLSymbol $sym557$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_INSTANCE;
    private static final SubLList $list558;
    private static final SubLString $str559$SUBLOOP_PRIVATE_PAIR__S___S_;
    private static final SubLSymbol $sym560$SUBLOOP_PRIVATE_PAIR_PRINT_METHOD;
    private static final SubLSymbol $sym561$BAG_ENUMERATOR_TEMPLATE;
    private static final SubLList $list562;
    private static final SubLList $list563;
    private static final SubLList $list564;
    private static final SubLList $list565;
    private static final SubLList $list566;
    private static final SubLList $list567;
    private static final SubLList $list568;
    private static final SubLList $list569;
    private static final SubLList $list570;
    private static final SubLSymbol $sym571$BASIC_BAG_ENUMERATOR;
    private static final SubLList $list572;
    private static final SubLList $list573;
    private static final SubLSymbol $sym574$BASIC_BAG_ENUMERATOR_PREVIOUS_METHOD;
    private static final SubLSymbol $sym575$BASIC_BAG_ENUMERATOR_NEXT_METHOD;
    private static final SubLSymbol $sym576$BASIC_BAG_ENUMERATOR_LAST_METHOD;
    private static final SubLSymbol $sym577$BASIC_BAG_ENUMERATOR_FIRST_METHOD;
    private static final SubLSymbol $sym578$BASIC_BAG_ENUMERATOR_CURRENT_METHOD;
    private static final SubLSymbol $sym579$BASIC_BAG_ENUMERATOR_LAST_P_METHOD;
    private static final SubLSymbol $sym580$BASIC_BAG_ENUMERATOR_FIRST_P_METHOD;
    private static final SubLSymbol $sym581$BASIC_BAG_ENUMERATOR_EMPTY_P_METHOD;
    private static final SubLSymbol $sym582$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_CLASS;
    private static final SubLSymbol $sym583$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_INSTANCE;
    private static final SubLSymbol $sym584$INSTANTIATE;
    private static final SubLList $list585;
    private static final SubLSymbol $sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym587$BASIC_BAG_ENUMERATOR_INSTANTIATE_METHOD;
    private static final SubLSymbol $sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym589$BASIC_BAG_ENUMERATOR_GET_CONTENTS_POINTER_METHOD;
    private static final SubLList $list590;
    private static final SubLList $list591;
    private static final SubLSymbol $sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD;
    private static final SubLString $str593$_SET_CONTENTS_POINTER__S____S_is_;
    private static final SubLSymbol $sym594$BASIC_BAG_ENUMERATOR_SET_CONTENTS_POINTER_METHOD;
    private static final SubLSymbol $sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym596$BASIC_BAG_ENUMERATOR_GET_CONTENTS_METHOD;
    private static final SubLList $list597;
    private static final SubLSymbol $sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD;
    private static final SubLString $str599$_SET_CONTENTS__S____S_is_not_an_i;
    private static final SubLSymbol $sym600$BASIC_BAG_ENUMERATOR_SET_CONTENTS_METHOD;
    private static final SubLSymbol $sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym602$BASIC_BAG_ENUMERATOR_GET_DIRECTION_METHOD;
    private static final SubLList $list603;
    private static final SubLSymbol $sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD;
    private static final SubLString $str605$_SET_DIRECTION__S____S_is_not_an_;
    private static final SubLSymbol $sym606$BASIC_BAG_ENUMERATOR_SET_DIRECTION_METHOD;
    private static final SubLSymbol $sym607$BAG_TEMPLATE;
    private static final SubLList $list608;
    private static final SubLList $list609;
    private static final SubLList $list610;
    private static final SubLList $list611;
    private static final SubLList $list612;
    private static final SubLList $list613;
    private static final SubLList $list614;
    private static final SubLList $list615;
    private static final SubLSymbol $sym616$OCCURENCES;
    private static final SubLList $list617;
    private static final SubLSymbol $sym618$GET_UNIQUE_ELEMENTS;
    private static final SubLList $list619;
    private static final SubLSymbol $sym620$GET_UNIQUE_ELEMENT_COUNT;
    private static final SubLList $list621;
    private static final SubLList $list622;
    private static final SubLSymbol $sym623$BASIC_BAG;
    private static final SubLList $list624;
    private static final SubLList $list625;
    private static final SubLSymbol $sym626$BAG_REPRESENTATION;
    private static final SubLSymbol $sym627$BASIC_BAG_EMPTY_P_METHOD;
    private static final SubLSymbol $sym628$BASIC_BAG_GET_UNIQUE_ELEMENT_COUNT_METHOD;
    private static final SubLSymbol $sym629$BASIC_BAG_GET_UNIQUE_ELEMENTS_METHOD;
    private static final SubLSymbol $sym630$BASIC_BAG_OCCURENCES_METHOD;
    private static final SubLSymbol $sym631$BASIC_BAG_MEMBER_P_METHOD;
    private static final SubLSymbol $sym632$BASIC_BAG_REMOVE_METHOD;
    private static final SubLSymbol $sym633$BASIC_BAG_ADD_METHOD;
    private static final SubLSymbol $sym634$BASIC_BAG_SET_CONTENTS_METHOD;
    private static final SubLSymbol $sym635$BASIC_BAG_GET_CONTENTS_METHOD;
    private static final SubLSymbol $sym636$BASIC_BAG_GET_ELEMENT_COUNT_METHOD;
    private static final SubLString $str637$BAG__;
    private static final SubLString $str638$BAG__S;
    private static final SubLSymbol $sym639$BASIC_BAG_PRINT_METHOD;
    private static final SubLSymbol $sym640$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_CLASS;
    private static final SubLSymbol $sym641$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_INSTANCE;
    private static final SubLList $list642;
    private static final SubLSymbol $sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD;
    private static final SubLSymbol $sym644$BASIC_BAG_INITIALIZE_METHOD;
    private static final SubLSymbol $sym645$GET_INTERNAL_REPRESENTATION;
    private static final SubLList $list646;
    private static final SubLSymbol $sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD;
    private static final SubLSymbol $sym648$BASIC_BAG_GET_INTERNAL_REPRESENTATION_METHOD;
    private static final SubLSymbol $sym649$SET_INTERNAL_REPRESENTATION;
    private static final SubLList $list650;
    private static final SubLList $list651;
    private static final SubLSymbol $sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD;
    private static final SubLString $str653$_SET_INTERNAL_REPRESENTATION__S__;
    private static final SubLSymbol $sym654$BASIC_BAG_SET_INTERNAL_REPRESENTATION_METHOD;
    private static final SubLList $list655;
    private static final SubLSymbol $sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD;
    private static final SubLSymbol $sym657$BASIC_BAG_ALLOCATE_ENUMERATOR_METHOD;
    private static final SubLList $list658;
    private static final SubLString $str659$_DEALLOCATE_ENUMERATOR__S____S_is;
    private static final SubLSymbol $sym660$BASIC_BAG_DEALLOCATE_ENUMERATOR_METHOD;
    private static final SubLSymbol $sym661$TEST_LIST_ELEMENT;
    private static final SubLList $list662;
    private static final SubLSymbol $sym663$SYMBOLIC_NAME;
    private static final SubLSymbol $sym664$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_CLASS;
    private static final SubLSymbol $sym665$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_INSTANCE;
    private static final SubLList $list666;
    private static final SubLSymbol $sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD;
    private static final SubLSymbol $sym668$TEST_LIST_ELEMENT_INITIALIZE_METHOD;
    private static final SubLSymbol $sym669$GET_SYMBOLIC_NAME;
    private static final SubLList $list670;
    private static final SubLSymbol $sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD;
    private static final SubLSymbol $sym672$TEST_LIST_ELEMENT_GET_SYMBOLIC_NAME_METHOD;
    private static final SubLSymbol $sym673$SET_SYMBOLIC_NAME;
    private static final SubLList $list674;
    private static final SubLList $list675;
    private static final SubLSymbol $sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD;
    private static final SubLSymbol $sym677$TEST_LIST_ELEMENT_SET_SYMBOLIC_NAME_METHOD;
    private static final SubLList $list678;
    private static final SubLSymbol $sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD;
    private static final SubLString $str680$__S_;
    private static final SubLSymbol $sym681$TEST_LIST_ELEMENT_PRINT_METHOD;
    private static final SubLSymbol $sym682$TEST_LIST_ELEMENT_ON_ADD_METHOD;
    private static final SubLSymbol $sym683$TEST_LIST_ELEMENT_ON_DELETE_METHOD;
    private static final SubLSymbol $sym684$_TEST_LIST_ELEMENTS_;
    private static final SubLString $str685$ENUMERATOR_TEMPLATE_EMPTY_P___S_i;
    private static final SubLString $str686$ENUMERATOR_TEMPLATE_LAST_P___S_is;
    private static final SubLString $str687$ENUMERATOR_TEMPLATE_FIRST___S_is_;
    private static final SubLString $str688$ENUMERATOR_TEMPLATE_NEXT___S_is_n;
    private static final SubLString $str689$ENUMERATOR_TEMPLATE_CURRENT___S_i;
    private static final SubLString $str690$COLLECTION_TEMPLATE_EMPTY_P___S_i;
    private static final SubLString $str691$DOUBLY_LINKED_LIST_TEMPLATE_ADD__;
    private static final SubLString $str692$DOUBLY_LINKED_LIST_TEMPLATE_GET_C;
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
    public static SubLObject valid_sequential_directions() {
        return subloop_collections.$valid_sequential_directions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
    public static SubLObject sequential_direction_p(final SubLObject v_object) {
        return (SubLObject)((subloop_collections.NIL != conses_high.member(v_object, subloop_collections.$valid_sequential_directions$.getGlobalValue(), (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED)) ? subloop_collections.T : subloop_collections.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
    public static SubLObject encode_sequential_direction(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos = Sequences.position(value, subloop_collections.$valid_sequential_directions$.getGlobalValue(), (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED);
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == pos) {
            Errors.error((SubLObject)subloop_collections.$str2$_S___S_is_not_a_member_of_the__S_, (SubLObject)subloop_collections.$sym3$ENCODE_SEQUENTIAL_DIRECTION, value, (SubLObject)subloop_collections.$sym1$SEQUENTIAL_DIRECTION);
        }
        return pos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
    public static SubLObject decode_sequential_direction(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject element = ConsesLow.nth(value, subloop_collections.$valid_sequential_directions$.getGlobalValue());
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == element) {
            Errors.error((SubLObject)subloop_collections.$str4$_S___S_is_not_a_valid_encoding_of, (SubLObject)subloop_collections.$sym5$DECODE_SEQUENTIAL_DIRECTION, value, (SubLObject)subloop_collections.$sym1$SEQUENTIAL_DIRECTION);
        }
        return element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
    public static SubLObject sequential_direction_less_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == sequential_direction_p(value1)) {
            Errors.error((SubLObject)subloop_collections.$str6$_S___S_was_expected_to_be_a_membe, (SubLObject)subloop_collections.$sym7$SEQUENTIAL_DIRECTION_P, value1, (SubLObject)subloop_collections.$sym1$SEQUENTIAL_DIRECTION);
        }
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == sequential_direction_p(value2)) {
            Errors.error((SubLObject)subloop_collections.$str6$_S___S_was_expected_to_be_a_membe, (SubLObject)subloop_collections.$sym7$SEQUENTIAL_DIRECTION_P, value2, (SubLObject)subloop_collections.$sym1$SEQUENTIAL_DIRECTION);
        }
        SubLObject cdolist_list_var = subloop_collections.$valid_sequential_directions$.getGlobalValue();
        SubLObject value3 = (SubLObject)subloop_collections.NIL;
        value3 = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            if (value3.eql(value1)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value2));
            }
            if (value3.eql(value2)) {
                return (SubLObject)subloop_collections.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
    public static SubLObject sequential_direction_greater_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == sequential_direction_p(value1)) {
            Errors.error((SubLObject)subloop_collections.$str6$_S___S_was_expected_to_be_a_membe, (SubLObject)subloop_collections.$sym7$SEQUENTIAL_DIRECTION_P, value1, (SubLObject)subloop_collections.$sym1$SEQUENTIAL_DIRECTION);
        }
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == sequential_direction_p(value2)) {
            Errors.error((SubLObject)subloop_collections.$str6$_S___S_was_expected_to_be_a_membe, (SubLObject)subloop_collections.$sym7$SEQUENTIAL_DIRECTION_P, value2, (SubLObject)subloop_collections.$sym1$SEQUENTIAL_DIRECTION);
        }
        SubLObject cdolist_list_var = subloop_collections.$valid_sequential_directions$.getGlobalValue();
        SubLObject value3 = (SubLObject)subloop_collections.NIL;
        value3 = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            if (value3.eql(value2)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value1));
            }
            if (value3.eql(value1)) {
                return (SubLObject)subloop_collections.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 2028L)
    public static SubLObject iterator_template_p(final SubLObject iterator_template) {
        return interfaces.subloop_instanceof_interface(iterator_template, (SubLObject)subloop_collections.$sym8$ITERATOR_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 2187L)
    public static SubLObject enumerator_template_p(final SubLObject enumerator_template) {
        return interfaces.subloop_instanceof_interface(enumerator_template, (SubLObject)subloop_collections.$sym10$ENUMERATOR_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 2662L)
    public static SubLObject collection_enumerator_template_p(final SubLObject collection_enumerator_template) {
        return interfaces.subloop_instanceof_interface(collection_enumerator_template, (SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8060L)
    public static SubLObject protected_membership_template_p(final SubLObject protected_membership_template) {
        return interfaces.subloop_instanceof_interface(protected_membership_template, (SubLObject)subloop_collections.$sym35$PROTECTED_MEMBERSHIP_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject get_basic_collection_enumerator_direction(final SubLObject basic_collection_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection_enumerator, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym41$DIRECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject set_basic_collection_enumerator_direction(final SubLObject basic_collection_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection_enumerator, value, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym41$DIRECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject get_basic_collection_enumerator_contents_pointer(final SubLObject basic_collection_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection_enumerator, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym42$CONTENTS_POINTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject set_basic_collection_enumerator_contents_pointer(final SubLObject basic_collection_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection_enumerator, value, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym42$CONTENTS_POINTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject get_basic_collection_enumerator_collection_contents(final SubLObject basic_collection_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection_enumerator, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym43$COLLECTION_CONTENTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject set_basic_collection_enumerator_collection_contents(final SubLObject basic_collection_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection_enumerator, value, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym43$COLLECTION_CONTENTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject basic_collection_enumerator_previous_method(final SubLObject self) {
        if (subloop_collections.NIL != basic_collection_enumerator_empty_p_method(self)) {
            return (SubLObject)subloop_collections.NIL;
        }
        final SubLObject template_collection_contents = basic_collection_enumerator_retrieve_collection_contents_method(self);
        SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method(self);
        if (subloop_collections.NIL == template_contents_pointer) {
            final SubLObject pcase_var = basic_collection_enumerator_get_direction_method(self);
            if (pcase_var.eql((SubLObject)subloop_collections.$kw44$FORWARDS)) {
                template_contents_pointer = conses_high.last(template_collection_contents, (SubLObject)subloop_collections.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)subloop_collections.$kw45$NONE)) {
                template_contents_pointer = conses_high.last(template_collection_contents, (SubLObject)subloop_collections.UNPROVIDED);
            }
            basic_collection_enumerator_set_contents_pointer_method(self, template_contents_pointer);
            basic_collection_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw46$BACKWARDS);
            return basic_collection_enumerator_current_method(self);
        }
        if (template_collection_contents.eql(template_contents_pointer)) {
            basic_collection_enumerator_set_contents_pointer_method(self, (SubLObject)subloop_collections.NIL);
            basic_collection_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw46$BACKWARDS);
            return (SubLObject)subloop_collections.NIL;
        }
        SubLObject sublist;
        for (sublist = (SubLObject)subloop_collections.NIL, sublist = template_collection_contents; subloop_collections.NIL != sublist; sublist = sublist.rest()) {
            if (sublist.rest().eql(template_contents_pointer)) {
                basic_collection_enumerator_set_contents_pointer_method(self, sublist);
                basic_collection_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw46$BACKWARDS);
                return basic_collection_enumerator_current_method(self);
            }
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject basic_collection_enumerator_next_method(final SubLObject self) {
        if (subloop_collections.NIL != basic_collection_enumerator_empty_p_method(self)) {
            return (SubLObject)subloop_collections.NIL;
        }
        SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method(self);
        if (subloop_collections.NIL == template_contents_pointer) {
            final SubLObject pcase_var = basic_collection_enumerator_get_direction_method(self);
            if (pcase_var.eql((SubLObject)subloop_collections.$kw46$BACKWARDS)) {
                template_contents_pointer = basic_collection_enumerator_retrieve_collection_contents_method(self);
            }
            else if (pcase_var.eql((SubLObject)subloop_collections.$kw45$NONE)) {
                template_contents_pointer = basic_collection_enumerator_retrieve_collection_contents_method(self);
            }
            basic_collection_enumerator_set_contents_pointer_method(self, template_contents_pointer);
            basic_collection_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw44$FORWARDS);
            return basic_collection_enumerator_current_method(self);
        }
        if (subloop_collections.NIL == template_contents_pointer) {
            return (SubLObject)subloop_collections.NIL;
        }
        basic_collection_enumerator_set_contents_pointer_method(self, template_contents_pointer.rest());
        basic_collection_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw44$FORWARDS);
        return basic_collection_enumerator_current_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject basic_collection_enumerator_last_method(final SubLObject self) {
        if (subloop_collections.NIL != basic_collection_enumerator_empty_p_method(self)) {
            return (SubLObject)subloop_collections.NIL;
        }
        basic_collection_enumerator_set_contents_pointer_method(self, conses_high.last(basic_collection_enumerator_retrieve_collection_contents_method(self), (SubLObject)subloop_collections.UNPROVIDED));
        basic_collection_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw46$BACKWARDS);
        return basic_collection_enumerator_current_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject basic_collection_enumerator_first_method(final SubLObject self) {
        basic_collection_enumerator_set_contents_pointer_method(self, basic_collection_enumerator_retrieve_collection_contents_method(self));
        basic_collection_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw44$FORWARDS);
        return basic_collection_enumerator_current_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject basic_collection_enumerator_current_method(final SubLObject self) {
        if (subloop_collections.NIL != basic_collection_enumerator_empty_p_method(self)) {
            return (SubLObject)subloop_collections.NIL;
        }
        final SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method(self);
        if (subloop_collections.NIL != template_contents_pointer) {
            return basic_collection_enumerator_get_contents_pointer_method(self).first();
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject basic_collection_enumerator_last_p_method(final SubLObject self) {
        if (subloop_collections.NIL != basic_collection_enumerator_empty_p_method(self)) {
            return (SubLObject)subloop_collections.T;
        }
        final SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method(self);
        if (subloop_collections.NIL != template_contents_pointer) {
            return Types.sublisp_null(template_contents_pointer.rest());
        }
        return (SubLObject)subloop_collections.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject basic_collection_enumerator_first_p_method(final SubLObject self) {
        return (SubLObject)SubLObjectFactory.makeBoolean(subloop_collections.NIL != basic_collection_enumerator_empty_p_method(self) || basic_collection_enumerator_retrieve_collection_contents_method(self).eql(basic_collection_enumerator_get_contents_pointer_method(self)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject basic_collection_enumerator_empty_p_method(final SubLObject self) {
        return Types.sublisp_null(basic_collection_enumerator_retrieve_collection_contents_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject subloop_reserved_initialize_basic_collection_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject subloop_reserved_initialize_basic_collection_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym43$COLLECTION_CONTENTS, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym42$CONTENTS_POINTER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym41$DIRECTION, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
    public static SubLObject basic_collection_enumerator_p(final SubLObject basic_collection_enumerator) {
        return classes.subloop_instanceof_class(basic_collection_enumerator, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11165L)
    public static SubLObject basic_collection_enumerator_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject direction = get_basic_collection_enumerator_direction(self);
        SubLObject contents_pointer = get_basic_collection_enumerator_contents_pointer(self);
        SubLObject collection_contents = get_basic_collection_enumerator_collection_contents(self);
        try {
            thread.throwStack.push(subloop_collections.$sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                object.object_initialize_method(self);
                collection_contents = (SubLObject)subloop_collections.NIL;
                contents_pointer = (SubLObject)subloop_collections.NIL;
                direction = (SubLObject)subloop_collections.$kw45$NONE;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_enumerator_direction(self, direction);
                    set_basic_collection_enumerator_contents_pointer(self, contents_pointer);
                    set_basic_collection_enumerator_collection_contents(self, collection_contents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11368L)
    public static SubLObject basic_collection_enumerator_store_collection_contents_method(final SubLObject self, final SubLObject new_collection_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject collection_contents = get_basic_collection_enumerator_collection_contents(self);
        try {
            thread.throwStack.push(subloop_collections.$sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                collection_contents = new_collection_contents;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, new_collection_contents);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_enumerator_collection_contents(self, collection_contents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11586L)
    public static SubLObject basic_collection_enumerator_retrieve_collection_contents_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject collection_contents = get_basic_collection_enumerator_collection_contents(self);
        try {
            thread.throwStack.push(subloop_collections.$sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, collection_contents);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_enumerator_collection_contents(self, collection_contents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11722L)
    public static SubLObject basic_collection_enumerator_set_contents_pointer_method(final SubLObject self, final SubLObject subcontents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject contents_pointer = get_basic_collection_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push(subloop_collections.$sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                contents_pointer = subcontents;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, subcontents);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_enumerator_contents_pointer(self, contents_pointer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11892L)
    public static SubLObject basic_collection_enumerator_get_contents_pointer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject contents_pointer = get_basic_collection_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push(subloop_collections.$sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, contents_pointer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_enumerator_contents_pointer(self, contents_pointer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 12017L)
    public static SubLObject basic_collection_enumerator_get_direction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject direction = get_basic_collection_enumerator_direction(self);
        try {
            thread.throwStack.push(subloop_collections.$sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, direction);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_enumerator_direction(self, direction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 12128L)
    public static SubLObject basic_collection_enumerator_set_direction_method(final SubLObject self, final SubLObject new_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject direction = get_basic_collection_enumerator_direction(self);
        try {
            thread.throwStack.push(subloop_collections.$sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
            try {
                if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == sequential_direction_p(new_direction)) {
                    Errors.error((SubLObject)subloop_collections.$str92$_SET_DIRECTION__S____S_is_not_a_v, self, new_direction, enumerations.enumerate_values((SubLObject)subloop_collections.$sym1$SEQUENTIAL_DIRECTION));
                }
                direction = new_direction;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, new_direction);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_enumerator_direction(self, direction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 12490L)
    public static SubLObject collection_template_p(final SubLObject collection_template) {
        return interfaces.subloop_instanceof_interface(collection_template, (SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject get_basic_collection_element_equality_predicate(final SubLObject basic_collection) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym119$ELEMENT_EQUALITY_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject set_basic_collection_element_equality_predicate(final SubLObject basic_collection, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection, value, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym119$ELEMENT_EQUALITY_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject get_basic_collection_contents(final SubLObject basic_collection) {
        return classes.subloop_get_access_protected_instance_slot(basic_collection, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym120$CONTENTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject set_basic_collection_contents(final SubLObject basic_collection, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_collection, value, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym120$CONTENTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject basic_collection_empty_p_method(final SubLObject self) {
        return Types.sublisp_null(basic_collection_get_contents_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject basic_collection_member_p_method(final SubLObject self, final SubLObject element) {
        return (SubLObject)((subloop_collections.NIL != conses_high.member(element, basic_collection_get_contents_method(self), basic_collection_get_element_equality_predicate_method(self), (SubLObject)subloop_collections.UNPROVIDED)) ? subloop_collections.T : subloop_collections.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject basic_collection_remove_method(final SubLObject self, final SubLObject old_element) {
        basic_collection_set_contents_method(self, Sequences.delete(old_element, basic_collection_get_contents_method(self), basic_collection_get_element_equality_predicate_method(self), (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED));
        return old_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject basic_collection_add_method(final SubLObject self, final SubLObject new_element) {
        basic_collection_set_contents_method(self, ConsesLow.nconc(basic_collection_get_contents_method(self), (SubLObject)ConsesLow.list(new_element)));
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject basic_collection_clear_method(final SubLObject self) {
        basic_collection_set_contents_method(self, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject basic_collection_get_element_count_method(final SubLObject self) {
        return Sequences.length(basic_collection_get_contents_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject basic_collection_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_collection_allocate_enumerator_method(self);
        if (subloop_collections.NIL == template_enumerator) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (subloop_collections.NIL != methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym18$EMPTY_P)) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str128$__);
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str129$__S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym27$FIRST));
            while (subloop_collections.NIL == methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym23$LAST_P)) {
                PrintLow.format(stream, (SubLObject)subloop_collections.$str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym31$NEXT));
            }
            PrintLow.format(stream, (SubLObject)subloop_collections.$str131$_);
        }
        basic_collection_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject subloop_reserved_initialize_basic_collection_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject subloop_reserved_initialize_basic_collection_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym120$CONTENTS, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym119$ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
    public static SubLObject basic_collection_p(final SubLObject basic_collection) {
        return classes.subloop_instanceof_class(basic_collection, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18040L)
    public static SubLObject basic_collection_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = (SubLObject)subloop_collections.NIL;
        SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate(self);
        SubLObject contents = get_basic_collection_contents(self);
        try {
            thread.throwStack.push(subloop_collections.$sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                object.object_initialize_method(self);
                contents = (SubLObject)subloop_collections.NIL;
                element_equality_predicate = (SubLObject)subloop_collections.EQUAL;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_element_equality_predicate(self, element_equality_predicate);
                    set_basic_collection_contents(self, contents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18208L)
    public static SubLObject basic_collection_element_equal_p_method(final SubLObject self, final SubLObject element1, final SubLObject element2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = (SubLObject)subloop_collections.NIL;
        final SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate(self);
        try {
            thread.throwStack.push(subloop_collections.$sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                SubLObject result = (SubLObject)subloop_collections.NIL;
                final SubLObject pcase_var = element_equality_predicate;
                if (pcase_var.eql((SubLObject)subloop_collections.EQUAL)) {
                    result = Equality.equal(element1, element2);
                }
                else if (pcase_var.eql((SubLObject)subloop_collections.EQ)) {
                    result = Equality.eq(element1, element2);
                }
                else if (pcase_var.eql((SubLObject)subloop_collections.EQL)) {
                    result = Equality.eql(element1, element2);
                }
                else if (pcase_var.eql((SubLObject)subloop_collections.EQUALP)) {
                    result = Equality.equalp(element1, element2);
                }
                else if (pcase_var.eql((SubLObject)subloop_collections.$sym140$STRING_EQUAL)) {
                    result = Strings.string_equal(element1, element2, (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)subloop_collections.$sym141$CHAR_)) {
                    result = Characters.charE(element1, element2);
                }
                else {
                    result = Functions.funcall(element_equality_predicate, element1, element2);
                }
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_element_equality_predicate(self, element_equality_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18470L)
    public static SubLObject basic_collection_get_element_equality_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = (SubLObject)subloop_collections.NIL;
        final SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate(self);
        try {
            thread.throwStack.push(subloop_collections.$sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, element_equality_predicate);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_element_equality_predicate(self, element_equality_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18589L)
    public static SubLObject basic_collection_set_element_equality_predicate_method(final SubLObject self, final SubLObject new_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = (SubLObject)subloop_collections.NIL;
        SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate(self);
        try {
            thread.throwStack.push(subloop_collections.$sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                element_equality_predicate = new_predicate;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, new_predicate);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_element_equality_predicate(self, element_equality_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18759L)
    public static SubLObject basic_collection_get_contents_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = (SubLObject)subloop_collections.NIL;
        final SubLObject contents = get_basic_collection_contents(self);
        try {
            thread.throwStack.push(subloop_collections.$sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, contents);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_contents(self, contents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18842L)
    public static SubLObject basic_collection_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = (SubLObject)subloop_collections.NIL;
        SubLObject contents = get_basic_collection_contents(self);
        try {
            thread.throwStack.push(subloop_collections.$sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !new_contents.isList()) {
                    Errors.error((SubLObject)subloop_collections.$str160$_SET_CONTENTS__S____S_is_not_a_va, self, new_contents);
                }
                contents = new_contents;
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_contents(self, contents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 19053L)
    public static SubLObject basic_collection_allocate_enumerator_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_collection_method = (SubLObject)subloop_collections.NIL;
        final SubLObject contents = get_basic_collection_contents(self);
        try {
            thread.throwStack.push(subloop_collections.$sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
            try {
                final SubLObject enumerator = object.object_new_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR);
                basic_collection_enumerator_store_collection_contents_method(enumerator, contents);
                basic_collection_enumerator_set_contents_pointer_method(enumerator, contents);
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, enumerator);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_collection_contents(self, contents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_collection_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_collection_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 19450L)
    public static SubLObject basic_collection_deallocate_enumerator_method(final SubLObject self, final SubLObject enumerator) {
        if (subloop_collections.NIL != enumerator) {
            basic_collection_enumerator_store_collection_contents_method(enumerator, (SubLObject)subloop_collections.NIL);
            basic_collection_enumerator_set_contents_pointer_method(enumerator, (SubLObject)subloop_collections.NIL);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 19755L)
    public static SubLObject list_template_p(final SubLObject list_template) {
        return interfaces.subloop_instanceof_interface(list_template, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_empty_p_method(final SubLObject self) {
        return Types.sublisp_null(basic_collection_get_contents_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_reverse_method(final SubLObject self) {
        basic_collection_set_contents_method(self, Sequences.reverse(basic_collection_get_contents_method(self)));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_append_method(final SubLObject self, final SubLObject other_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == other_list) {
            return self;
        }
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == list_template_p(other_list)) {
            Errors.error((SubLObject)subloop_collections.$str198$_APPEND__S____S_is_not_an_instanc, self, other_list);
        }
        final SubLObject template_other_list_contents = conses_high.copy_list(methods.funcall_instance_method_with_0_args(other_list, (SubLObject)subloop_collections.$sym152$GET_CONTENTS));
        basic_collection_set_contents_method(self, ConsesLow.nconc(basic_collection_get_contents_method(self), template_other_list_contents));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_position_method(final SubLObject self, final SubLObject element) {
        return Sequences.position(element, basic_collection_get_contents_method(self), basic_collection_get_element_equality_predicate_method(self), (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_set_nth_method(final SubLObject self, final SubLObject index, final SubLObject new_element) {
        ConsesLow.set_nth(index, basic_collection_get_contents_method(self), new_element);
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_nth_method(final SubLObject self, final SubLObject index) {
        return ConsesLow.nth(index, basic_collection_get_contents_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_but_last_method(final SubLObject self) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        if (subloop_collections.NIL == template_contents) {
            return (SubLObject)subloop_collections.NIL;
        }
        if (subloop_collections.NIL == template_contents.rest()) {
            basic_collection_set_contents_method(self, (SubLObject)subloop_collections.NIL);
            return template_contents.first();
        }
        SubLObject template_contents_sublist;
        SubLObject template_result;
        for (template_contents_sublist = (SubLObject)subloop_collections.NIL, template_contents_sublist = template_contents; subloop_collections.NIL != template_contents_sublist; template_contents_sublist = template_contents_sublist.rest()) {
            if (subloop_collections.NIL == conses_high.cddr(template_contents_sublist)) {
                template_result = conses_high.cadr(template_contents_sublist);
                ConsesLow.rplacd(template_contents_sublist, (SubLObject)subloop_collections.NIL);
                return template_result;
            }
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_pop_method(final SubLObject self) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        if (subloop_collections.NIL == template_contents) {
            return (SubLObject)subloop_collections.NIL;
        }
        basic_collection_set_contents_method(self, template_contents.rest());
        return template_contents.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_push_method(final SubLObject self, final SubLObject new_element) {
        basic_collection_set_contents_method(self, (SubLObject)ConsesLow.cons(new_element, basic_collection_get_contents_method(self)));
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_collection_allocate_enumerator_method(self);
        if (subloop_collections.NIL == template_enumerator) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (subloop_collections.NIL != methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym18$EMPTY_P)) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str206$LIST___);
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str207$LIST___S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym27$FIRST));
            while (subloop_collections.NIL == methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym23$LAST_P)) {
                PrintLow.format(stream, (SubLObject)subloop_collections.$str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym31$NEXT));
            }
            PrintLow.format(stream, (SubLObject)subloop_collections.$str131$_);
        }
        basic_collection_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject subloop_reserved_initialize_basic_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject subloop_reserved_initialize_basic_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym120$CONTENTS, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym119$ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
    public static SubLObject basic_list_p(final SubLObject basic_list) {
        return classes.subloop_instanceof_class(basic_list, (SubLObject)subloop_collections.$sym193$BASIC_LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 24266L)
    public static SubLObject end_pointer_list_template_p(final SubLObject end_pointer_list_template) {
        return interfaces.subloop_instanceof_interface(end_pointer_list_template, (SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject get_basic_end_pointer_list_end_pointer(final SubLObject basic_end_pointer_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_end_pointer_list, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym225$END_POINTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject set_basic_end_pointer_list_end_pointer(final SubLObject basic_end_pointer_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_end_pointer_list, value, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym225$END_POINTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_empty_p_method(final SubLObject self) {
        return Types.sublisp_null(basic_collection_get_contents_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_reverse_method(final SubLObject self) {
        final SubLObject template_contents_reversed = Sequences.reverse(basic_collection_get_contents_method(self));
        basic_collection_set_contents_method(self, template_contents_reversed);
        basic_end_pointer_list_set_end_pointer_method(self, conses_high.last(template_contents_reversed, (SubLObject)subloop_collections.UNPROVIDED));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_append_method(final SubLObject self, final SubLObject other_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == other_list) {
            return self;
        }
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == list_template_p(other_list)) {
            Errors.error((SubLObject)subloop_collections.$str198$_APPEND__S____S_is_not_an_instanc, self, other_list);
        }
        final SubLObject template_other_list_contents = conses_high.copy_list(methods.funcall_instance_method_with_0_args(other_list, (SubLObject)subloop_collections.$sym152$GET_CONTENTS));
        basic_collection_set_contents_method(self, ConsesLow.nconc(basic_collection_get_contents_method(self), template_other_list_contents));
        basic_end_pointer_list_set_end_pointer_method(self, conses_high.last(template_other_list_contents, (SubLObject)subloop_collections.UNPROVIDED));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_position_method(final SubLObject self, final SubLObject element) {
        return Sequences.position(element, basic_collection_get_contents_method(self), basic_collection_get_element_equality_predicate_method(self), (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED, (SubLObject)subloop_collections.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_nth_method(final SubLObject self, final SubLObject index) {
        return ConsesLow.nth(index, basic_collection_get_contents_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_but_last_method(final SubLObject self) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        final SubLObject template_end_pointer = basic_end_pointer_list_get_end_pointer_method(self);
        if (subloop_collections.NIL == template_contents) {
            return (SubLObject)subloop_collections.NIL;
        }
        if (subloop_collections.NIL == template_contents.rest()) {
            basic_collection_set_contents_method(self, (SubLObject)subloop_collections.NIL);
            basic_end_pointer_list_set_end_pointer_method(self, (SubLObject)subloop_collections.NIL);
            return template_contents.first();
        }
        SubLObject template_contents_sublist;
        SubLObject template_result;
        for (template_contents_sublist = (SubLObject)subloop_collections.NIL, template_contents_sublist = template_contents; subloop_collections.NIL != template_contents_sublist; template_contents_sublist = template_contents_sublist.rest()) {
            if (template_contents_sublist.rest().eql(template_end_pointer)) {
                template_result = template_end_pointer.first();
                ConsesLow.rplacd(template_contents_sublist, (SubLObject)subloop_collections.NIL);
                basic_end_pointer_list_set_end_pointer_method(self, template_contents_sublist);
                return template_result;
            }
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_pop_method(final SubLObject self) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        if (subloop_collections.NIL == template_contents) {
            return (SubLObject)subloop_collections.NIL;
        }
        if (subloop_collections.NIL == template_contents.rest()) {
            basic_collection_set_contents_method(self, (SubLObject)subloop_collections.NIL);
            basic_end_pointer_list_set_end_pointer_method(self, (SubLObject)subloop_collections.NIL);
            return template_contents.first();
        }
        basic_collection_set_contents_method(self, template_contents.rest());
        return template_contents.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_push_method(final SubLObject self, final SubLObject new_element) {
        SubLObject template_contents = basic_collection_get_contents_method(self);
        if (subloop_collections.NIL == template_contents) {
            template_contents = (SubLObject)ConsesLow.list(new_element);
            basic_collection_set_contents_method(self, template_contents);
            basic_end_pointer_list_set_end_pointer_method(self, template_contents);
            return new_element;
        }
        basic_collection_set_contents_method(self, (SubLObject)ConsesLow.cons(new_element, template_contents));
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_contents = basic_collection_get_contents_method(self);
        final SubLObject template_end_pointer = basic_end_pointer_list_get_end_pointer_method(self);
        if (subloop_collections.NIL == template_contents) {
            return (SubLObject)subloop_collections.NIL;
        }
        if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, old_element, template_contents.first())) {
            if (template_contents.eql(template_end_pointer)) {
                basic_collection_set_contents_method(self, (SubLObject)subloop_collections.NIL);
                basic_end_pointer_list_set_end_pointer_method(self, (SubLObject)subloop_collections.NIL);
                return old_element;
            }
            basic_collection_set_contents_method(self, template_contents.rest());
            return old_element;
        }
        else {
            SubLObject template_current_cons;
            for (template_current_cons = template_contents; !template_current_cons.rest().eql(template_end_pointer); template_current_cons = template_current_cons.rest()) {
                if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, old_element, conses_high.cadr(template_current_cons))) {
                    ConsesLow.rplacd(template_current_cons, conses_high.cddr(template_current_cons));
                    return old_element;
                }
            }
            if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, old_element, conses_high.cadr(template_current_cons))) {
                ConsesLow.rplacd(template_current_cons, (SubLObject)subloop_collections.NIL);
                basic_end_pointer_list_set_end_pointer_method(self, template_current_cons);
                return old_element;
            }
            return old_element;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_add_method(final SubLObject self, final SubLObject new_element) {
        SubLObject template_contents = basic_collection_get_contents_method(self);
        SubLObject template_end_pointer = basic_end_pointer_list_get_end_pointer_method(self);
        if (subloop_collections.NIL == template_contents) {
            template_contents = (template_end_pointer = (SubLObject)ConsesLow.list(new_element));
        }
        else {
            ConsesLow.rplacd(template_end_pointer, (SubLObject)ConsesLow.list(new_element));
            template_end_pointer = template_end_pointer.rest();
        }
        basic_collection_set_contents_method(self, template_contents);
        basic_end_pointer_list_set_end_pointer_method(self, template_end_pointer);
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_clear_method(final SubLObject self) {
        basic_collection_set_contents_method(self, (SubLObject)subloop_collections.NIL);
        basic_end_pointer_list_set_end_pointer_method(self, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_collection_allocate_enumerator_method(self);
        if (subloop_collections.NIL == template_enumerator) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (subloop_collections.NIL != methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym18$EMPTY_P)) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str206$LIST___);
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str207$LIST___S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym27$FIRST));
            while (subloop_collections.NIL == methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym23$LAST_P)) {
                PrintLow.format(stream, (SubLObject)subloop_collections.$str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym31$NEXT));
            }
            PrintLow.format(stream, (SubLObject)subloop_collections.$str131$_);
        }
        basic_collection_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject subloop_reserved_initialize_basic_end_pointer_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject subloop_reserved_initialize_basic_end_pointer_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym120$CONTENTS, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym119$ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym225$END_POINTER, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
    public static SubLObject basic_end_pointer_list_p(final SubLObject basic_end_pointer_list) {
        return classes.subloop_instanceof_class(basic_end_pointer_list, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30232L)
    public static SubLObject basic_end_pointer_list_get_end_pointer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_end_pointer_list_method = (SubLObject)subloop_collections.NIL;
        final SubLObject end_pointer = get_basic_end_pointer_list_end_pointer(self);
        try {
            thread.throwStack.push(subloop_collections.$sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD, end_pointer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_end_pointer_list_end_pointer(self, end_pointer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_end_pointer_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_end_pointer_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30327L)
    public static SubLObject basic_end_pointer_list_set_end_pointer_method(final SubLObject self, final SubLObject new_end_pointer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_end_pointer_list_method = (SubLObject)subloop_collections.NIL;
        SubLObject end_pointer = get_basic_end_pointer_list_end_pointer(self);
        try {
            thread.throwStack.push(subloop_collections.$sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD);
            try {
                end_pointer = new_end_pointer;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD, new_end_pointer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_end_pointer_list_end_pointer(self, end_pointer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_end_pointer_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_end_pointer_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject double_link_cell_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject double_link_cell_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $double_link_cell_native.class) ? subloop_collections.T : subloop_collections.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject dlc_owner(final SubLObject v_object) {
        assert subloop_collections.NIL != double_link_cell_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject dlc_contents(final SubLObject v_object) {
        assert subloop_collections.NIL != double_link_cell_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject dlc_previous(final SubLObject v_object) {
        assert subloop_collections.NIL != double_link_cell_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject dlc_next(final SubLObject v_object) {
        assert subloop_collections.NIL != double_link_cell_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject _csetf_dlc_owner(final SubLObject v_object, final SubLObject value) {
        assert subloop_collections.NIL != double_link_cell_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject _csetf_dlc_contents(final SubLObject v_object, final SubLObject value) {
        assert subloop_collections.NIL != double_link_cell_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject _csetf_dlc_previous(final SubLObject v_object, final SubLObject value) {
        assert subloop_collections.NIL != double_link_cell_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject _csetf_dlc_next(final SubLObject v_object, final SubLObject value) {
        assert subloop_collections.NIL != double_link_cell_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject make_double_link_cell(SubLObject arglist) {
        if (arglist == subloop_collections.UNPROVIDED) {
            arglist = (SubLObject)subloop_collections.NIL;
        }
        final SubLObject v_new = (SubLObject)new $double_link_cell_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_collections.NIL, next = arglist; subloop_collections.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_collections.$kw266$OWNER)) {
                _csetf_dlc_owner(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_collections.$kw267$CONTENTS)) {
                _csetf_dlc_contents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_collections.$kw268$PREVIOUS)) {
                _csetf_dlc_previous(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_collections.$kw269$NEXT)) {
                _csetf_dlc_next(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_collections.$str270$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject visit_defstruct_double_link_cell(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_collections.$kw271$BEGIN, (SubLObject)subloop_collections.$sym272$MAKE_DOUBLE_LINK_CELL, (SubLObject)subloop_collections.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_collections.$kw273$SLOT, (SubLObject)subloop_collections.$kw266$OWNER, dlc_owner(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_collections.$kw273$SLOT, (SubLObject)subloop_collections.$kw267$CONTENTS, dlc_contents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_collections.$kw273$SLOT, (SubLObject)subloop_collections.$kw268$PREVIOUS, dlc_previous(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_collections.$kw273$SLOT, (SubLObject)subloop_collections.$kw269$NEXT, dlc_next(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_collections.$kw274$END, (SubLObject)subloop_collections.$sym272$MAKE_DOUBLE_LINK_CELL, (SubLObject)subloop_collections.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
    public static SubLObject visit_defstruct_object_double_link_cell_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_double_link_cell(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30717L)
    public static SubLObject with_dlc_read_only(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject dlc = (SubLObject)subloop_collections.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_collections.$list276);
        dlc = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject dlc_var = Symbols.make_symbol((SubLObject)subloop_collections.$str277$dlc);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(dlc_var, dlc, (SubLObject)subloop_collections.$sym278$DLC_, (SubLObject)subloop_collections.$list251, forms, (SubLObject)subloop_collections.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30962L)
    public static SubLObject with_dlc_read_write(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject dlc = (SubLObject)subloop_collections.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_collections.$list276);
        dlc = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject dlc_var = Symbols.make_symbol((SubLObject)subloop_collections.$str277$dlc);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(dlc_var, dlc, (SubLObject)subloop_collections.$sym278$DLC_, (SubLObject)subloop_collections.$list251, forms, (SubLObject)subloop_collections.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 31190L)
    public static SubLObject dlc_copy_links(final SubLObject dlc, final SubLObject new_owner) {
        if (subloop_collections.NIL == dlc) {
            return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
        }
        SubLObject current_source = dlc;
        SubLObject first_destin = (SubLObject)subloop_collections.NIL;
        SubLObject current_destin = (SubLObject)subloop_collections.NIL;
        SubLObject previous_destin = (SubLObject)subloop_collections.NIL;
        while (subloop_collections.NIL != current_source) {
            current_destin = make_double_link_cell((SubLObject)subloop_collections.UNPROVIDED);
            if (subloop_collections.NIL == first_destin) {
                first_destin = current_destin;
            }
            _csetf_dlc_owner(current_destin, new_owner);
            _csetf_dlc_contents(current_destin, dlc_contents(current_source));
            _csetf_dlc_previous(current_destin, previous_destin);
            if (subloop_collections.NIL != previous_destin) {
                _csetf_dlc_next(previous_destin, current_destin);
            }
            previous_destin = current_destin;
            current_source = dlc_next(current_source);
        }
        return Values.values(first_destin, current_destin);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 31938L)
    public static SubLObject list_element_template_p(final SubLObject list_element_template) {
        return interfaces.subloop_instanceof_interface(list_element_template, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject get_basic_list_element_qua_list_element_parent_links(final SubLObject basic_list_element) {
        return classes.subloop_get_access_protected_instance_slot(basic_list_element, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym308$QUA_LIST_ELEMENT_PARENT_LINKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject set_basic_list_element_qua_list_element_parent_links(final SubLObject basic_list_element, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_list_element, value, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym308$QUA_LIST_ELEMENT_PARENT_LINKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject get_basic_list_element_qua_list_element_self_deletion_mode(final SubLObject basic_list_element) {
        final SubLObject v_class = subloop_structures.instance_class(basic_list_element);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_collections.$sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_list_element, slot);
        return classes.ldb_test((SubLObject)subloop_collections.$int310$4097, subloop_structures.instance_boolean_slots(basic_list_element));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject set_basic_list_element_qua_list_element_self_deletion_mode(final SubLObject basic_list_element, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_list_element);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_collections.$sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_list_element, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_list_element, bytes.dpb((SubLObject)((subloop_collections.NIL != value) ? subloop_collections.ONE_INTEGER : subloop_collections.ZERO_INTEGER), (SubLObject)subloop_collections.$int310$4097, subloop_structures.instance_boolean_slots(basic_list_element)));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_perform_action_method(final SubLObject self, final SubLObject action, final SubLObject parameters) {
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_on_delete_method(final SubLObject self, final SubLObject parent_list) {
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_on_add_method(final SubLObject self, final SubLObject parent_list) {
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_get_collections_method(final SubLObject self) {
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        SubLObject template_collections = (SubLObject)subloop_collections.NIL;
        final SubLObject list_expression = template_parent_links;
        if (subloop_collections.NIL == list_expression) {
            template_collections = (SubLObject)subloop_collections.NIL;
        }
        else if (list_expression.isAtom()) {
            template_collections = (SubLObject)ConsesLow.list(list_expression);
        }
        else if (subloop_collections.NIL == list_expression.rest()) {
            final SubLObject template_parent_link = list_expression.first();
            template_collections = (SubLObject)ConsesLow.list(dlc_owner(template_parent_link));
        }
        else {
            SubLObject tail_cons = (SubLObject)subloop_collections.NIL;
            SubLObject result = (SubLObject)subloop_collections.NIL;
            final SubLObject template_parent_link2 = list_expression.first();
            template_collections = (tail_cons = (SubLObject)ConsesLow.list(dlc_owner(template_parent_link2)));
            SubLObject cdolist_list_var = list_expression.rest();
            SubLObject template_parent_link3 = (SubLObject)subloop_collections.NIL;
            template_parent_link3 = cdolist_list_var.first();
            while (subloop_collections.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.list(dlc_owner(template_parent_link3));
                ConsesLow.rplacd(tail_cons, result);
                tail_cons = result;
                cdolist_list_var = cdolist_list_var.rest();
                template_parent_link3 = cdolist_list_var.first();
            }
        }
        return list_utilities.unique_elements(template_collections, (SubLObject)subloop_collections.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_member_p_method(final SubLObject self, final SubLObject collection) {
        SubLObject cdolist_list_var;
        final SubLObject template_parent_links = cdolist_list_var = basic_list_element_get_parent_links_method(self);
        SubLObject template_parent_link = (SubLObject)subloop_collections.NIL;
        template_parent_link = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            if (dlc_owner(template_parent_link).eql(collection)) {
                return (SubLObject)subloop_collections.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_parent_link = cdolist_list_var.first();
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_delete_self_from_all_collections_method(final SubLObject self) {
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        try {
            basic_list_element_set_self_deletion_mode_method(self, (SubLObject)subloop_collections.T);
            SubLObject cdolist_list_var = template_parent_links;
            SubLObject template_parent_link = (SubLObject)subloop_collections.NIL;
            template_parent_link = cdolist_list_var.first();
            while (subloop_collections.NIL != cdolist_list_var) {
                generic_dllt_delete_link_function(dlc_owner(template_parent_link), template_parent_link);
                _csetf_dlc_owner(template_parent_link, (SubLObject)subloop_collections.NIL);
                cdolist_list_var = cdolist_list_var.rest();
                template_parent_link = cdolist_list_var.first();
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)subloop_collections.T);
                final SubLObject _values = Values.getValuesAsVector();
                basic_list_element_set_self_deletion_mode_method(self, (SubLObject)subloop_collections.NIL);
                basic_list_element_set_parent_links_method(self, (SubLObject)subloop_collections.NIL);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_transfer_self_method(final SubLObject self, final SubLObject current_collection, final SubLObject new_collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == collection_template_p(current_collection)) {
            Errors.error((SubLObject)subloop_collections.$str317$_TRANSFER_SELF__S____S_is_not_an_, self, current_collection);
        }
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == collection_template_p(current_collection)) {
            Errors.error((SubLObject)subloop_collections.$str317$_TRANSFER_SELF__S____S_is_not_an_, self, new_collection);
        }
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        SubLObject template_parent_link = (SubLObject)subloop_collections.NIL;
        SubLObject template_target_link = (SubLObject)subloop_collections.NIL;
        if (subloop_collections.NIL != template_parent_links) {
            if (dlc_owner(template_parent_links.first()).eql(current_collection)) {
                template_target_link = template_parent_links.first();
                basic_list_element_set_parent_links_method(self, template_parent_links.rest());
            }
            else {
                SubLObject template_previous = template_parent_links;
                SubLObject template_sublinks = template_previous.rest();
                while (subloop_collections.NIL != template_sublinks) {
                    template_parent_link = template_sublinks.first();
                    if (dlc_owner(template_parent_link).eql(current_collection)) {
                        template_target_link = template_parent_link;
                        ConsesLow.rplacd(template_previous, template_sublinks.rest());
                        template_sublinks = (SubLObject)subloop_collections.NIL;
                    }
                    else {
                        template_previous = template_sublinks;
                        template_sublinks = template_sublinks.rest();
                    }
                }
            }
            if (subloop_collections.NIL != template_target_link) {
                try {
                    basic_list_element_set_self_deletion_mode_method(self, (SubLObject)subloop_collections.T);
                    generic_dllt_delete_link_function(dlc_owner(template_target_link), template_target_link);
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        _csetf_dlc_owner(template_target_link, (SubLObject)subloop_collections.NIL);
                        methods.funcall_instance_method_with_1_args(new_collection, (SubLObject)subloop_collections.$sym106$ADD, self);
                        basic_list_element_set_self_deletion_mode_method(self, (SubLObject)subloop_collections.NIL);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_delete_self_from_collection_method(final SubLObject self, final SubLObject collection) {
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        SubLObject template_parent_link = (SubLObject)subloop_collections.NIL;
        SubLObject template_target_link = (SubLObject)subloop_collections.NIL;
        if (subloop_collections.NIL != template_parent_links) {
            if (dlc_owner(template_parent_links.first()).eql(collection)) {
                template_target_link = template_parent_links.first();
                basic_list_element_set_parent_links_method(self, template_parent_links.rest());
            }
            else {
                SubLObject template_previous = template_parent_links;
                SubLObject template_sublinks = template_previous.rest();
                while (subloop_collections.NIL != template_sublinks) {
                    template_parent_link = template_sublinks.first();
                    if (dlc_owner(template_parent_link).eql(collection)) {
                        template_target_link = template_parent_link;
                        ConsesLow.rplacd(template_previous, template_sublinks.rest());
                        template_sublinks = (SubLObject)subloop_collections.NIL;
                    }
                    else {
                        template_previous = template_sublinks;
                        template_sublinks = template_sublinks.rest();
                    }
                }
            }
            if (subloop_collections.NIL != template_target_link) {
                try {
                    basic_list_element_set_self_deletion_mode_method(self, (SubLObject)subloop_collections.T);
                    generic_dllt_delete_link_function(dlc_owner(template_target_link), template_target_link);
                }
                finally {
                    final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)subloop_collections.T);
                        final SubLObject _values = Values.getValuesAsVector();
                        _csetf_dlc_owner(template_target_link, (SubLObject)subloop_collections.NIL);
                        methods.funcall_instance_method_with_1_args(self, (SubLObject)subloop_collections.$sym301$ON_DELETE, collection);
                        basic_list_element_set_self_deletion_mode_method(self, (SubLObject)subloop_collections.NIL);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_delete_parent_link_method(final SubLObject self, final SubLObject old_parent_link) {
        final SubLObject template_parent_links = basic_list_element_get_parent_links_method(self);
        if (subloop_collections.NIL != template_parent_links) {
            if (old_parent_link.eql(template_parent_links)) {
                basic_list_element_set_parent_links_method(self, template_parent_links.rest());
            }
            else {
                SubLObject template_previous_cons = template_parent_links;
                for (SubLObject template_current_cons = template_parent_links.rest(); subloop_collections.NIL != template_current_cons; template_current_cons = template_current_cons.rest()) {
                    if (old_parent_link.eql(template_current_cons.first())) {
                        ConsesLow.rplacd(template_previous_cons, template_current_cons.rest());
                        methods.funcall_instance_method_with_1_args(self, (SubLObject)subloop_collections.$sym301$ON_DELETE, dlc_owner(old_parent_link));
                        return old_parent_link;
                    }
                    template_previous_cons = template_current_cons;
                }
            }
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_add_parent_link_method(final SubLObject self, final SubLObject new_parent_link) {
        basic_list_element_set_parent_links_method(self, (SubLObject)ConsesLow.cons(new_parent_link, basic_list_element_get_parent_links_method(self)));
        methods.funcall_instance_method_with_1_args(self, (SubLObject)subloop_collections.$sym298$ON_ADD, dlc_owner(new_parent_link));
        return new_parent_link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject subloop_reserved_initialize_basic_list_element_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject subloop_reserved_initialize_basic_list_element_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym308$QUA_LIST_ELEMENT_PARENT_LINKS, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
    public static SubLObject basic_list_element_p(final SubLObject basic_list_element) {
        return classes.subloop_instanceof_class(basic_list_element, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40341L)
    public static SubLObject basic_list_element_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = (SubLObject)subloop_collections.NIL;
        SubLObject qua_list_element_parent_links = get_basic_list_element_qua_list_element_parent_links(self);
        SubLObject qua_list_element_self_deletion_mode = get_basic_list_element_qua_list_element_self_deletion_mode(self);
        try {
            thread.throwStack.push(subloop_collections.$sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                object.object_initialize_method(self);
                qua_list_element_self_deletion_mode = (SubLObject)subloop_collections.NIL;
                qua_list_element_parent_links = (SubLObject)subloop_collections.NIL;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_list_element_qua_list_element_parent_links(self, qua_list_element_parent_links);
                    set_basic_list_element_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40538L)
    public static SubLObject basic_list_element_get_parent_links_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = (SubLObject)subloop_collections.NIL;
        final SubLObject qua_list_element_parent_links = get_basic_list_element_qua_list_element_parent_links(self);
        try {
            thread.throwStack.push(subloop_collections.$sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, qua_list_element_parent_links);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_list_element_qua_list_element_parent_links(self, qua_list_element_parent_links);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40651L)
    public static SubLObject basic_list_element_set_parent_links_method(final SubLObject self, final SubLObject new_parent_links) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = (SubLObject)subloop_collections.NIL;
        SubLObject qua_list_element_parent_links = get_basic_list_element_qua_list_element_parent_links(self);
        try {
            thread.throwStack.push(subloop_collections.$sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                qua_list_element_parent_links = new_parent_links;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, new_parent_links);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_list_element_qua_list_element_parent_links(self, qua_list_element_parent_links);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40824L)
    public static SubLObject basic_list_element_get_self_deletion_mode_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = (SubLObject)subloop_collections.NIL;
        final SubLObject qua_list_element_self_deletion_mode = get_basic_list_element_qua_list_element_self_deletion_mode(self);
        try {
            thread.throwStack.push(subloop_collections.$sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, qua_list_element_self_deletion_mode);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_list_element_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40949L)
    public static SubLObject basic_list_element_set_self_deletion_mode_method(final SubLObject self, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_list_element_method = (SubLObject)subloop_collections.NIL;
        SubLObject qua_list_element_self_deletion_mode = get_basic_list_element_qua_list_element_self_deletion_mode(self);
        try {
            thread.throwStack.push(subloop_collections.$sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
            try {
                qua_list_element_self_deletion_mode = mode;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, mode);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_list_element_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_list_element_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_list_element_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 41098L)
    public static SubLObject doubly_linked_list_template_p(final SubLObject doubly_linked_list_template) {
        return interfaces.subloop_instanceof_interface(doubly_linked_list_template, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject get_basic_doubly_linked_list_last_link(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list, (SubLObject)subloop_collections.FOUR_INTEGER, (SubLObject)subloop_collections.$sym377$LAST_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject set_basic_doubly_linked_list_last_link(final SubLObject basic_doubly_linked_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list, value, (SubLObject)subloop_collections.FOUR_INTEGER, (SubLObject)subloop_collections.$sym377$LAST_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject get_basic_doubly_linked_list_first_link(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym378$FIRST_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject set_basic_doubly_linked_list_first_link(final SubLObject basic_doubly_linked_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list, value, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym378$FIRST_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject get_basic_doubly_linked_list_element_count(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym379$ELEMENT_COUNT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject set_basic_doubly_linked_list_element_count(final SubLObject basic_doubly_linked_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list, value, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym379$ELEMENT_COUNT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject get_basic_doubly_linked_list_element_equality_predicate(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym119$ELEMENT_EQUALITY_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject set_basic_doubly_linked_list_element_equality_predicate(final SubLObject basic_doubly_linked_list, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list, value, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym119$ELEMENT_EQUALITY_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_swap_method(final SubLObject self, final SubLObject element1, final SubLObject element2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (element1.eql(element2)) {
            return (SubLObject)subloop_collections.NIL;
        }
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (subloop_collections.NIL == element1 || subloop_collections.NIL == element2)) {
            Errors.error((SubLObject)subloop_collections.$str380$_SWAP__S___Cannot_swap_NIL_elemen, self);
        }
        final SubLObject link1 = basic_doubly_linked_list_find_link_method(self, element1);
        final SubLObject link2 = basic_doubly_linked_list_find_link_method(self, element2);
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == link1) {
            Errors.error((SubLObject)subloop_collections.$str381$_SWAP__S____S_is_not_an_element_o, self, element1);
        }
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == link2) {
            Errors.error((SubLObject)subloop_collections.$str381$_SWAP__S____S_is_not_an_element_o, self, element2);
        }
        if (subloop_collections.NIL != list_element_template_p(element1)) {
            methods.funcall_instance_method_with_1_args(element1, (SubLObject)subloop_collections.$sym284$DELETE_PARENT_LINK, link1);
            methods.funcall_instance_method_with_1_args(element1, (SubLObject)subloop_collections.$sym281$ADD_PARENT_LINK, link2);
        }
        if (subloop_collections.NIL != list_element_template_p(element2)) {
            methods.funcall_instance_method_with_1_args(element2, (SubLObject)subloop_collections.$sym284$DELETE_PARENT_LINK, link2);
            methods.funcall_instance_method_with_1_args(element2, (SubLObject)subloop_collections.$sym281$ADD_PARENT_LINK, link1);
        }
        _csetf_dlc_contents(link1, element2);
        _csetf_dlc_contents(link2, element1);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_empty_p_method(final SubLObject self) {
        return Types.sublisp_null(basic_doubly_linked_list_get_first_link_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_reverse_method(final SubLObject self) {
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method(self);
        if (subloop_collections.NIL == template_first_link) {
            return self;
        }
        if (template_first_link.eql(template_last_link)) {
            return self;
        }
        for (SubLObject template_current_link = template_first_link, template_next_link = (SubLObject)subloop_collections.NIL; subloop_collections.NIL != template_current_link; template_current_link = template_next_link) {
            template_next_link = dlc_next(template_current_link);
            basic_doubly_linked_list_reverse_link_method(self, template_current_link);
        }
        basic_doubly_linked_list_set_first_link_method(self, template_last_link);
        basic_doubly_linked_list_set_last_link_method(self, template_first_link);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_append_method(final SubLObject self, final SubLObject other_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == other_list) {
            return self;
        }
        if (other_list.isCons()) {
            SubLObject cdolist_list_var = other_list;
            SubLObject template_element = (SubLObject)subloop_collections.NIL;
            template_element = cdolist_list_var.first();
            while (subloop_collections.NIL != cdolist_list_var) {
                basic_doubly_linked_list_add_method(self, template_element);
                cdolist_list_var = cdolist_list_var.rest();
                template_element = cdolist_list_var.first();
            }
            return self;
        }
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == list_template_p(other_list)) {
            Errors.error((SubLObject)subloop_collections.$str385$_APPEND__S___Cannot_append_non_li, self, other_list);
        }
        final SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(other_list, (SubLObject)subloop_collections.$sym162$ALLOCATE_ENUMERATOR);
        if (subloop_collections.NIL == template_enumerator) {
            return self;
        }
        if (subloop_collections.NIL != methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym18$EMPTY_P)) {
            return self;
        }
        for (SubLObject template_element = methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym27$FIRST); subloop_collections.NIL != template_element; template_element = methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym31$NEXT)) {
            basic_doubly_linked_list_add_method(self, template_element);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_position_method(final SubLObject self, final SubLObject element) {
        SubLObject template_links = basic_doubly_linked_list_get_first_link_method(self);
        SubLObject count = (SubLObject)subloop_collections.ZERO_INTEGER;
        if (subloop_collections.NIL == template_links) {
            return (SubLObject)subloop_collections.NIL;
        }
        while (subloop_collections.NIL != template_links) {
            if (subloop_collections.NIL != basic_doubly_linked_list_element_equal_p_method(self, element, dlc_contents(template_links))) {
                return count;
            }
            count = Numbers.add(count, (SubLObject)subloop_collections.ONE_INTEGER);
            template_links = dlc_next(template_links);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_set_nth_method(final SubLObject self, final SubLObject index, final SubLObject new_element) {
        final SubLObject template_link = basic_doubly_linked_list_find_nth_link_method(self, index);
        if (subloop_collections.NIL != template_link) {
            final SubLObject template_content = dlc_contents(template_link);
            if (subloop_collections.NIL != list_element_template_p(template_content)) {
                generic_dllt_delete_parent_link_function(template_content, template_link);
            }
            _csetf_dlc_contents(template_link, new_element);
            if (subloop_collections.NIL != list_element_template_p(new_element)) {
                generic_dllt_add_parent_link_function(new_element, template_link);
            }
            return new_element;
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_nth_method(final SubLObject self, final SubLObject index) {
        final SubLObject template_link = basic_doubly_linked_list_find_nth_link_method(self, index);
        if (subloop_collections.NIL != template_link) {
            return dlc_contents(template_link);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_but_last_method(final SubLObject self) {
        final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method(self);
        if (subloop_collections.NIL != template_last_link) {
            final SubLObject template_contents = dlc_contents(template_last_link);
            basic_doubly_linked_list_delete_link_method(self, template_last_link);
            return template_contents;
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_pop_method(final SubLObject self) {
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        if (subloop_collections.NIL != template_first_link) {
            final SubLObject template_contents = dlc_contents(template_first_link);
            basic_doubly_linked_list_delete_link_method(self, template_first_link);
            return template_contents;
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_push_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        final SubLObject template_new_link = make_double_link_cell((SubLObject)subloop_collections.UNPROVIDED);
        _csetf_dlc_contents(template_new_link, new_element);
        _csetf_dlc_owner(template_new_link, self);
        if (subloop_collections.NIL != template_first_link) {
            _csetf_dlc_next(template_new_link, template_first_link);
            _csetf_dlc_previous(template_first_link, template_new_link);
            basic_doubly_linked_list_set_first_link_method(self, template_new_link);
        }
        else {
            basic_doubly_linked_list_set_first_link_method(self, template_new_link);
            basic_doubly_linked_list_set_last_link_method(self, template_new_link);
        }
        if (subloop_collections.NIL != list_element_template_p(new_element)) {
            generic_dllt_add_parent_link_function(new_element, template_new_link);
        }
        basic_doubly_linked_list_inc_element_count_method(self);
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_member_p_method(final SubLObject self, final SubLObject element) {
        final SubLObject template_link = basic_doubly_linked_list_find_link_method(self, element);
        return (SubLObject)((subloop_collections.NIL != template_link) ? subloop_collections.T : subloop_collections.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_remove_method(final SubLObject self, final SubLObject old_element) {
        if (subloop_collections.NIL != list_element_template_p(old_element)) {
            generic_dllt_delete_self_from_collection_function(old_element, self);
        }
        else {
            final SubLObject template_link = basic_doubly_linked_list_find_link_method(self, old_element);
            if (subloop_collections.NIL != template_link) {
                basic_doubly_linked_list_delete_link_method(self, template_link);
            }
        }
        return old_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_add_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_new_link = make_double_link_cell((SubLObject)subloop_collections.UNPROVIDED);
        final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method(self);
        _csetf_dlc_contents(template_new_link, new_element);
        _csetf_dlc_owner(template_new_link, self);
        if (subloop_collections.NIL != template_last_link) {
            _csetf_dlc_next(template_last_link, template_new_link);
            _csetf_dlc_previous(template_new_link, template_last_link);
        }
        else {
            basic_doubly_linked_list_set_first_link_method(self, template_new_link);
        }
        basic_doubly_linked_list_set_last_link_method(self, template_new_link);
        if (subloop_collections.NIL != list_element_template_p(new_element)) {
            generic_dllt_add_parent_link_function(new_element, template_new_link);
        }
        basic_doubly_linked_list_inc_element_count_method(self);
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_clear_method(final SubLObject self) {
        SubLObject cdolist_list_var;
        final SubLObject template_contents = cdolist_list_var = basic_doubly_linked_list_get_contents_method(self);
        SubLObject template_element = (SubLObject)subloop_collections.NIL;
        template_element = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            basic_doubly_linked_list_remove_method(self, template_element);
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_doubly_linked_list_allocate_enumerator_method(self);
        if (subloop_collections.NIL == template_enumerator) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (subloop_collections.NIL != methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym18$EMPTY_P)) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str397$DLIST__);
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str398$DLIST__S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym27$FIRST));
            while (subloop_collections.NIL == methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym23$LAST_P)) {
                PrintLow.format(stream, (SubLObject)subloop_collections.$str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym31$NEXT));
            }
            PrintLow.format(stream, (SubLObject)subloop_collections.$str131$_);
        }
        basic_doubly_linked_list_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_find_nth_link_method(final SubLObject self, final SubLObject index) {
        SubLObject template_links = basic_doubly_linked_list_get_first_link_method(self);
        SubLObject count = (SubLObject)subloop_collections.ZERO_INTEGER;
        while (subloop_collections.NIL != template_links) {
            if (count.numE(index)) {
                return template_links;
            }
            count = Numbers.add(count, (SubLObject)subloop_collections.ONE_INTEGER);
            template_links = dlc_next(template_links);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_find_link_method(final SubLObject self, final SubLObject element) {
        for (SubLObject template_links = basic_doubly_linked_list_get_first_link_method(self); subloop_collections.NIL != template_links; template_links = dlc_next(template_links)) {
            if (subloop_collections.NIL != basic_doubly_linked_list_element_equal_p_method(self, element, dlc_contents(template_links))) {
                return template_links;
            }
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_reverse_link_method(final SubLObject self, final SubLObject link) {
        final SubLObject template_previous = dlc_previous(link);
        final SubLObject template_next = dlc_next(link);
        _csetf_dlc_previous(link, template_next);
        _csetf_dlc_next(link, template_previous);
        return link;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_delete_link_method(final SubLObject self, final SubLObject link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == double_link_cell_p(link)) {
            Errors.error((SubLObject)subloop_collections.$str403$_DELETE_LINK__S____S_is_not_a_val, self, link);
        }
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !dlc_owner(link).eql(self)) {
            Errors.error((SubLObject)subloop_collections.$str404$_DELETE_LINK__S___Link__S_is_not_, self, link, self);
        }
        basic_doubly_linked_list_dec_element_count_method(self);
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method(self);
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (subloop_collections.NIL == template_first_link || subloop_collections.NIL == template_last_link) && (subloop_collections.NIL != template_first_link || subloop_collections.NIL != template_last_link)) {
            Errors.error((SubLObject)subloop_collections.$str405$_DELETE_LINK__S___Detected_incons, self);
        }
        if (template_first_link.eql(link)) {
            if (template_last_link.eql(link)) {
                basic_doubly_linked_list_set_first_link_method(self, (SubLObject)subloop_collections.NIL);
                basic_doubly_linked_list_set_last_link_method(self, (SubLObject)subloop_collections.NIL);
                _csetf_dlc_previous(link, (SubLObject)subloop_collections.NIL);
                _csetf_dlc_next(link, (SubLObject)subloop_collections.NIL);
                return dlc_contents(link);
            }
            final SubLObject template_second_link = dlc_next(link);
            _csetf_dlc_previous(template_second_link, (SubLObject)subloop_collections.NIL);
            basic_doubly_linked_list_set_first_link_method(self, template_second_link);
            _csetf_dlc_next(link, (SubLObject)subloop_collections.NIL);
            _csetf_dlc_previous(link, (SubLObject)subloop_collections.NIL);
            return dlc_contents(link);
        }
        else {
            if (template_last_link.eql(link)) {
                final SubLObject template_second_link = dlc_previous(link);
                _csetf_dlc_next(template_second_link, (SubLObject)subloop_collections.NIL);
                basic_doubly_linked_list_set_last_link_method(self, template_second_link);
                _csetf_dlc_next(link, (SubLObject)subloop_collections.NIL);
                _csetf_dlc_previous(link, (SubLObject)subloop_collections.NIL);
                return dlc_contents(link);
            }
            final SubLObject template_before_link = dlc_previous(link);
            final SubLObject template_after_link = dlc_next(link);
            _csetf_dlc_next(template_before_link, template_after_link);
            _csetf_dlc_previous(template_after_link, template_before_link);
            _csetf_dlc_next(link, (SubLObject)subloop_collections.NIL);
            _csetf_dlc_previous(link, (SubLObject)subloop_collections.NIL);
            return dlc_contents(link);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !new_contents.isList()) {
            Errors.error((SubLObject)subloop_collections.$str407$_SET_CONTENTS__S___Cannot_set_the, self, new_contents);
        }
        SubLObject cdolist_list_var;
        final SubLObject template_contents = cdolist_list_var = basic_doubly_linked_list_get_contents_method(self);
        SubLObject template_element = (SubLObject)subloop_collections.NIL;
        template_element = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            basic_doubly_linked_list_remove_method(self, template_element);
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2 = new_contents;
        SubLObject template_element2 = (SubLObject)subloop_collections.NIL;
        template_element2 = cdolist_list_var2.first();
        while (subloop_collections.NIL != cdolist_list_var2) {
            basic_doubly_linked_list_add_method(self, template_element2);
            cdolist_list_var2 = cdolist_list_var2.rest();
            template_element2 = cdolist_list_var2.first();
        }
        return new_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_get_contents_method(final SubLObject self) {
        SubLObject template_contents = (SubLObject)subloop_collections.NIL;
        final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method(self);
        if (subloop_collections.NIL != template_first_link) {
            for (SubLObject template_current_link = template_first_link; subloop_collections.NIL != template_current_link; template_current_link = dlc_next(template_current_link)) {
                template_contents = (SubLObject)ConsesLow.cons(dlc_contents(template_current_link), template_contents);
            }
        }
        return Sequences.nreverse(template_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_element_equal_p_method(final SubLObject self, final SubLObject element1, final SubLObject element2) {
        return Equality.equal(element1, element2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym119$ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym379$ELEMENT_COUNT, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym378$FIRST_LINK, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym377$LAST_LINK, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
    public static SubLObject basic_doubly_linked_list_p(final SubLObject basic_doubly_linked_list) {
        return classes.subloop_instanceof_class(basic_doubly_linked_list, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 56630L)
    public static SubLObject basic_doubly_linked_list_get_element_equality_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        final SubLObject element_equality_predicate = get_basic_doubly_linked_list_element_equality_predicate(self);
        try {
            thread.throwStack.push(subloop_collections.$sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_equality_predicate);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_element_equality_predicate(self, element_equality_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 56757L)
    public static SubLObject basic_doubly_linked_list_set_element_equality_predicate_method(final SubLObject self, final SubLObject new_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        SubLObject element_equality_predicate = get_basic_doubly_linked_list_element_equality_predicate(self);
        try {
            thread.throwStack.push(subloop_collections.$sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                element_equality_predicate = new_predicate;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_predicate);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_element_equality_predicate(self, element_equality_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 56935L)
    public static SubLObject basic_doubly_linked_list_set_element_count_method(final SubLObject self, final SubLObject new_element_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        SubLObject element_count = get_basic_doubly_linked_list_element_count(self);
        try {
            thread.throwStack.push(subloop_collections.$sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !new_element_count.isInteger()) {
                    Errors.error((SubLObject)subloop_collections.$str421$_SET_ELEMENT_COUNT__S____S_is_not, self, new_element_count);
                }
                element_count = new_element_count;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_element_count);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_element_count(self, element_count);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 57259L)
    public static SubLObject basic_doubly_linked_list_inc_element_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        SubLObject element_count = get_basic_doubly_linked_list_element_count(self);
        try {
            thread.throwStack.push(subloop_collections.$sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if (subloop_collections.NIL == element_count) {
                    element_count = (SubLObject)subloop_collections.ONE_INTEGER;
                }
                else {
                    element_count = Numbers.add(element_count, (SubLObject)subloop_collections.ONE_INTEGER);
                }
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_count);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_element_count(self, element_count);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 57451L)
    public static SubLObject basic_doubly_linked_list_dec_element_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        SubLObject element_count = get_basic_doubly_linked_list_element_count(self);
        try {
            thread.throwStack.push(subloop_collections.$sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if (subloop_collections.NIL == element_count) {
                    element_count = (SubLObject)subloop_collections.ZERO_INTEGER;
                }
                else {
                    element_count = Numbers.subtract(element_count, (SubLObject)subloop_collections.ONE_INTEGER);
                }
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_count);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_element_count(self, element_count);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 57643L)
    public static SubLObject basic_doubly_linked_list_get_first_link_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        final SubLObject first_link = get_basic_doubly_linked_list_first_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, first_link);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_first_link(self, first_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 57741L)
    public static SubLObject basic_doubly_linked_list_set_first_link_method(final SubLObject self, final SubLObject new_first_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        SubLObject first_link = get_basic_doubly_linked_list_first_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL != new_first_link && subloop_collections.NIL == double_link_cell_p(new_first_link)) {
                    Errors.error((SubLObject)subloop_collections.$str439$_SET_FIRST_LINK__S____S_is_not_an, self, new_first_link);
                }
                first_link = new_first_link;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_first_link);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_first_link(self, first_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58060L)
    public static SubLObject basic_doubly_linked_list_get_last_link_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        final SubLObject last_link = get_basic_doubly_linked_list_last_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, last_link);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_last_link(self, last_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58156L)
    public static SubLObject basic_doubly_linked_list_set_last_link_method(final SubLObject self, final SubLObject new_last_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        SubLObject last_link = get_basic_doubly_linked_list_last_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL != new_last_link && subloop_collections.NIL == double_link_cell_p(new_last_link)) {
                    Errors.error((SubLObject)subloop_collections.$str449$_SET_LAST_LINK__S____S_is_not_an_, self, new_last_link);
                }
                last_link = new_last_link;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_last_link);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_last_link(self, last_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58466L)
    public static SubLObject basic_doubly_linked_list_get_element_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        final SubLObject element_count = get_basic_doubly_linked_list_element_count(self);
        try {
            thread.throwStack.push(subloop_collections.$sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_count);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_element_count(self, element_count);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject get_basic_doubly_linked_list_enumerator_direction(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list_enumerator, (SubLObject)subloop_collections.FOUR_INTEGER, (SubLObject)subloop_collections.$sym41$DIRECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject set_basic_doubly_linked_list_enumerator_direction(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list_enumerator, value, (SubLObject)subloop_collections.FOUR_INTEGER, (SubLObject)subloop_collections.$sym41$DIRECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject get_basic_doubly_linked_list_enumerator_current_link(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list_enumerator, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym456$CURRENT_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject set_basic_doubly_linked_list_enumerator_current_link(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list_enumerator, value, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym456$CURRENT_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject get_basic_doubly_linked_list_enumerator_last_link(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list_enumerator, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym377$LAST_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject set_basic_doubly_linked_list_enumerator_last_link(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list_enumerator, value, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym377$LAST_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject get_basic_doubly_linked_list_enumerator_first_link(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_list_enumerator, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym378$FIRST_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject set_basic_doubly_linked_list_enumerator_first_link(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_list_enumerator, value, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym378$FIRST_LINK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym378$FIRST_LINK, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym377$LAST_LINK, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym456$CURRENT_LINK, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym41$DIRECTION, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
    public static SubLObject basic_doubly_linked_list_enumerator_p(final SubLObject basic_doubly_linked_list_enumerator) {
        return classes.subloop_instanceof_class(basic_doubly_linked_list_enumerator, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 59794L)
    public static SubLObject basic_doubly_linked_list_enumerator_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                object.object_initialize_method(self);
                first_link = (SubLObject)subloop_collections.NIL;
                last_link = (SubLObject)subloop_collections.NIL;
                current_link = (SubLObject)subloop_collections.NIL;
                direction = (SubLObject)subloop_collections.$kw45$NONE;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_direction(self, direction);
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    set_basic_doubly_linked_list_enumerator_last_link(self, last_link);
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 60016L)
    public static SubLObject basic_doubly_linked_list_enumerator_isolate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                if (subloop_collections.NIL != first_link) {
                    for (SubLObject current_link_$1 = first_link, next_link = (SubLObject)subloop_collections.NIL; subloop_collections.NIL != current_link_$1; current_link_$1 = next_link) {
                        next_link = dlc_next(current_link_$1);
                        _csetf_dlc_contents(current_link_$1, (SubLObject)subloop_collections.NIL);
                        _csetf_dlc_owner(current_link_$1, (SubLObject)subloop_collections.NIL);
                        _csetf_dlc_next(current_link_$1, (SubLObject)subloop_collections.NIL);
                        _csetf_dlc_previous(current_link_$1, (SubLObject)subloop_collections.NIL);
                    }
                }
                first_link = (SubLObject)subloop_collections.NIL;
                last_link = (SubLObject)subloop_collections.NIL;
                current_link = (SubLObject)subloop_collections.NIL;
                direction = (SubLObject)subloop_collections.$kw45$NONE;
                object.object_isolate_method(self);
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_direction(self, direction);
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    set_basic_doubly_linked_list_enumerator_last_link(self, last_link);
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 60544L)
    public static SubLObject basic_doubly_linked_list_enumerator_set_initial_state_method(final SubLObject self, final SubLObject new_first_link, final SubLObject new_last_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                first_link = new_first_link;
                last_link = new_last_link;
                current_link = new_first_link;
                direction = (SubLObject)subloop_collections.$kw44$FORWARDS;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_direction(self, direction);
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    set_basic_doubly_linked_list_enumerator_last_link(self, last_link);
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 60817L)
    public static SubLObject basic_doubly_linked_list_enumerator_empty_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, Types.sublisp_null(first_link));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 60923L)
    public static SubLObject basic_doubly_linked_list_enumerator_first_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, Equality.eq(first_link, current_link));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    set_basic_doubly_linked_list_enumerator_first_link(self, first_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61040L)
    public static SubLObject basic_doubly_linked_list_enumerator_last_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                if (subloop_collections.NIL != basic_doubly_linked_list_enumerator_empty_p_method(self)) {
                    Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, (SubLObject)subloop_collections.T);
                }
                if (subloop_collections.NIL == current_link) {
                    Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, (SubLObject)subloop_collections.T);
                }
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, Types.sublisp_null(dlc_next(current_link)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61224L)
    public static SubLObject basic_doubly_linked_list_enumerator_current_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
            try {
                if (subloop_collections.NIL == current_link) {
                    Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, (SubLObject)subloop_collections.NIL);
                }
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, dlc_contents(current_link));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61375L)
    public static SubLObject basic_doubly_linked_list_enumerator_first_method(final SubLObject self) {
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject first_link = current_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
        direction = (SubLObject)subloop_collections.$kw44$FORWARDS;
        set_basic_doubly_linked_list_enumerator_direction(self, direction);
        return basic_doubly_linked_list_enumerator_current_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61553L)
    public static SubLObject basic_doubly_linked_list_enumerator_last_method(final SubLObject self) {
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject last_link = current_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
        direction = (SubLObject)subloop_collections.$kw46$BACKWARDS;
        set_basic_doubly_linked_list_enumerator_direction(self, direction);
        return basic_doubly_linked_list_enumerator_current_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61730L)
    public static SubLObject basic_doubly_linked_list_enumerator_next_method(final SubLObject self) {
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link(self);
        if (subloop_collections.NIL != current_link) {
            current_link = dlc_next(current_link);
            set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
            direction = (SubLObject)subloop_collections.$kw44$FORWARDS;
            set_basic_doubly_linked_list_enumerator_direction(self, direction);
            return basic_doubly_linked_list_enumerator_current_method(self);
        }
        final SubLObject pcase_var = direction;
        if (pcase_var.eql((SubLObject)subloop_collections.$kw44$FORWARDS)) {
            return (SubLObject)subloop_collections.NIL;
        }
        if (pcase_var.eql((SubLObject)subloop_collections.$kw46$BACKWARDS)) {
            current_link = first_link;
            set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
            direction = (SubLObject)subloop_collections.$kw44$FORWARDS;
            set_basic_doubly_linked_list_enumerator_direction(self, direction);
            return basic_doubly_linked_list_enumerator_current_method(self);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 62131L)
    public static SubLObject basic_doubly_linked_list_enumerator_previous_method(final SubLObject self) {
        SubLObject direction = get_basic_doubly_linked_list_enumerator_direction(self);
        SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link(self);
        final SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link(self);
        if (subloop_collections.NIL != current_link) {
            current_link = dlc_previous(current_link);
            set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
            direction = (SubLObject)subloop_collections.$kw46$BACKWARDS;
            set_basic_doubly_linked_list_enumerator_direction(self, direction);
            return basic_doubly_linked_list_enumerator_current_method(self);
        }
        final SubLObject pcase_var = direction;
        if (pcase_var.eql((SubLObject)subloop_collections.$kw44$FORWARDS)) {
            current_link = last_link;
            set_basic_doubly_linked_list_enumerator_current_link(self, current_link);
            direction = (SubLObject)subloop_collections.$kw46$BACKWARDS;
            set_basic_doubly_linked_list_enumerator_direction(self, direction);
            return basic_doubly_linked_list_enumerator_current_method(self);
        }
        if (pcase_var.eql((SubLObject)subloop_collections.$kw46$BACKWARDS)) {
            return (SubLObject)subloop_collections.NIL;
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 62539L)
    public static SubLObject basic_doubly_linked_list_allocate_enumerator_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_list_method = (SubLObject)subloop_collections.NIL;
        final SubLObject first_link = get_basic_doubly_linked_list_first_link(self);
        try {
            thread.throwStack.push(subloop_collections.$sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
            try {
                final SubLObject new_enumerator = object.object_new_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR);
                thread.resetMultipleValues();
                final SubLObject new_first_link = dlc_copy_links(first_link, new_enumerator);
                final SubLObject new_last_link = thread.secondMultipleValue();
                thread.resetMultipleValues();
                basic_doubly_linked_list_enumerator_set_initial_state_method(new_enumerator, new_first_link, new_last_link);
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_enumerator);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_list_first_link(self, first_link);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_list_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63155L)
    public static SubLObject basic_doubly_linked_list_deallocate_enumerator_method(final SubLObject self, final SubLObject enumerator) {
        if (subloop_collections.NIL != basic_doubly_linked_list_enumerator_p(enumerator)) {
            basic_doubly_linked_list_enumerator_isolate_method(enumerator);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63398L)
    public static SubLObject pair_template_p(final SubLObject pair_template) {
        return interfaces.subloop_instanceof_interface(pair_template, (SubLObject)subloop_collections.$sym497$PAIR_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
    public static SubLObject get_basic_pair_second_element(final SubLObject basic_pair) {
        return classes.subloop_get_access_protected_instance_slot(basic_pair, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym503$SECOND_ELEMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
    public static SubLObject set_basic_pair_second_element(final SubLObject basic_pair, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_pair, value, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym503$SECOND_ELEMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
    public static SubLObject get_basic_pair_first_element(final SubLObject basic_pair) {
        return classes.subloop_get_access_protected_instance_slot(basic_pair, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym504$FIRST_ELEMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
    public static SubLObject set_basic_pair_first_element(final SubLObject basic_pair, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_pair, value, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym504$FIRST_ELEMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
    public static SubLObject basic_pair_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)subloop_collections.$str505$__S___S_, basic_pair_get_first_method(self), basic_pair_get_second_method(self));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
    public static SubLObject subloop_reserved_initialize_basic_pair_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
    public static SubLObject subloop_reserved_initialize_basic_pair_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym504$FIRST_ELEMENT, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym503$SECOND_ELEMENT, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
    public static SubLObject basic_pair_p(final SubLObject basic_pair) {
        return classes.subloop_instanceof_class(basic_pair, (SubLObject)subloop_collections.$sym500$BASIC_PAIR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64347L)
    public static SubLObject basic_pair_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = (SubLObject)subloop_collections.NIL;
        SubLObject second_element = get_basic_pair_second_element(self);
        SubLObject first_element = get_basic_pair_first_element(self);
        try {
            thread.throwStack.push(subloop_collections.$sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                object.object_initialize_method(self);
                first_element = (SubLObject)subloop_collections.NIL;
                second_element = (SubLObject)subloop_collections.NIL;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_pair_second_element(self, second_element);
                    set_basic_pair_first_element(self, first_element);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64499L)
    public static SubLObject basic_pair_get_first_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = (SubLObject)subloop_collections.NIL;
        final SubLObject first_element = get_basic_pair_first_element(self);
        try {
            thread.throwStack.push(subloop_collections.$sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, first_element);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_pair_first_element(self, first_element);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64578L)
    public static SubLObject basic_pair_set_first_method(final SubLObject self, final SubLObject new_first) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = (SubLObject)subloop_collections.NIL;
        SubLObject first_element = get_basic_pair_first_element(self);
        try {
            thread.throwStack.push(subloop_collections.$sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                first_element = new_first;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, new_first);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_pair_first_element(self, first_element);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64696L)
    public static SubLObject basic_pair_get_second_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = (SubLObject)subloop_collections.NIL;
        final SubLObject second_element = get_basic_pair_second_element(self);
        try {
            thread.throwStack.push(subloop_collections.$sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, second_element);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_pair_second_element(self, second_element);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64777L)
    public static SubLObject basic_pair_set_second_method(final SubLObject self, final SubLObject new_second) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_pair_method = (SubLObject)subloop_collections.NIL;
        SubLObject second_element = get_basic_pair_second_element(self);
        try {
            thread.throwStack.push(subloop_collections.$sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
            try {
                second_element = new_second;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, new_second);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_pair_second_element(self, second_element);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_pair_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_pair_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64900L)
    public static SubLObject triplet_template_p(final SubLObject triplet_template) {
        return interfaces.subloop_instanceof_interface(triplet_template, (SubLObject)subloop_collections.$sym530$TRIPLET_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
    public static SubLObject get_basic_triplet_third_element(final SubLObject basic_triplet) {
        return classes.subloop_get_access_protected_instance_slot(basic_triplet, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym537$THIRD_ELEMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
    public static SubLObject set_basic_triplet_third_element(final SubLObject basic_triplet, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_triplet, value, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym537$THIRD_ELEMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
    public static SubLObject basic_triplet_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)subloop_collections.$str538$__S___S___S_, new SubLObject[] { basic_pair_get_first_method(self), basic_pair_get_second_method(self), basic_triplet_get_third_method(self) });
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
    public static SubLObject subloop_reserved_initialize_basic_triplet_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
    public static SubLObject subloop_reserved_initialize_basic_triplet_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym504$FIRST_ELEMENT, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym503$SECOND_ELEMENT, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$sym537$THIRD_ELEMENT, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
    public static SubLObject basic_triplet_p(final SubLObject basic_triplet) {
        return classes.subloop_instanceof_class(basic_triplet, (SubLObject)subloop_collections.$sym534$BASIC_TRIPLET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65614L)
    public static SubLObject basic_triplet_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_triplet_method = (SubLObject)subloop_collections.NIL;
        SubLObject third_element = get_basic_triplet_third_element(self);
        try {
            thread.throwStack.push(subloop_collections.$sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
            try {
                basic_pair_initialize_method(self);
                third_element = (SubLObject)subloop_collections.NIL;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_triplet_third_element(self, third_element);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_triplet_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_triplet_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65740L)
    public static SubLObject basic_triplet_get_third_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_triplet_method = (SubLObject)subloop_collections.NIL;
        final SubLObject third_element = get_basic_triplet_third_element(self);
        try {
            thread.throwStack.push(subloop_collections.$sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD, third_element);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_triplet_third_element(self, third_element);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_triplet_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_triplet_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65822L)
    public static SubLObject basic_triplet_set_third_method(final SubLObject self, final SubLObject new_third) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_triplet_method = (SubLObject)subloop_collections.NIL;
        SubLObject third_element = get_basic_triplet_third_element(self);
        try {
            thread.throwStack.push(subloop_collections.$sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
            try {
                third_element = new_third;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD, new_third);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_triplet_third_element(self, third_element);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_triplet_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_triplet_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65943L)
    public static SubLObject generic_dllt_add_parent_link_function(final SubLObject list_element, final SubLObject new_parent_link) {
        if (subloop_collections.NIL != basic_list_element_p(list_element)) {
            return basic_list_element_add_parent_link_method(list_element, new_parent_link);
        }
        if (subloop_collections.NIL != list_element_template_p(list_element)) {
            return methods.funcall_instance_method_with_1_args(list_element, (SubLObject)subloop_collections.$sym281$ADD_PARENT_LINK, new_parent_link);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 66420L)
    public static SubLObject generic_dllt_delete_parent_link_function(final SubLObject list_element, final SubLObject old_parent_link) {
        if (subloop_collections.NIL != basic_list_element_p(list_element)) {
            return basic_list_element_delete_parent_link_method(list_element, old_parent_link);
        }
        if (subloop_collections.NIL != list_element_template_p(list_element)) {
            return methods.funcall_instance_method_with_1_args(list_element, (SubLObject)subloop_collections.$sym284$DELETE_PARENT_LINK, old_parent_link);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 66851L)
    public static SubLObject generic_dllt_delete_link_function(final SubLObject list, final SubLObject link) {
        if (subloop_collections.NIL != basic_doubly_linked_list_p(list)) {
            return basic_doubly_linked_list_delete_link_method(list, link);
        }
        if (subloop_collections.NIL != doubly_linked_list_template_p(list)) {
            return methods.funcall_instance_method_with_1_args(list, (SubLObject)subloop_collections.$sym347$DELETE_LINK, link);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67212L)
    public static SubLObject generic_dllt_delete_self_from_collection_function(final SubLObject list_element, final SubLObject collection) {
        if (subloop_collections.NIL != basic_list_element_p(list_element)) {
            return basic_list_element_delete_self_from_collection_method(list_element, collection);
        }
        if (subloop_collections.NIL != list_element_template_p(list_element)) {
            return methods.funcall_instance_method_with_1_args(list_element, (SubLObject)subloop_collections.$sym287$DELETE_SELF_FROM_COLLECTION, collection);
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67655L)
    public static SubLObject subloop_reserved_initialize_subloop_private_pair_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67655L)
    public static SubLObject subloop_reserved_initialize_subloop_private_pair_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym504$FIRST_ELEMENT, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym503$SECOND_ELEMENT, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67655L)
    public static SubLObject subloop_private_pair_p(final SubLObject subloop_private_pair) {
        return classes.subloop_instanceof_class(subloop_private_pair, (SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67792L)
    public static SubLObject subloop_private_pair_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)subloop_collections.$str559$SUBLOOP_PRIVATE_PAIR__S___S_, basic_pair_get_first_method(self), basic_pair_get_second_method(self));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67981L)
    public static SubLObject bag_enumerator_template_p(final SubLObject bag_enumerator_template) {
        return interfaces.subloop_instanceof_interface(bag_enumerator_template, (SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 72969L)
    public static SubLObject subloop_collections_bag_enum_get_next(final SubLObject contents_pointer) {
        final SubLObject list = basic_pair_get_first_method(contents_pointer);
        final SubLObject count = basic_pair_get_second_method(contents_pointer);
        if (subloop_collections.NIL == list) {
            return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
        }
        if (!list.isCons()) {
            return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
        }
        final SubLObject element = list.first();
        if (subloop_collections.NIL != subloop_private_pair_p(element)) {
            final SubLObject item = basic_pair_get_first_method(element);
            final SubLObject quant = basic_pair_get_second_method(element);
            if (subloop_collections.NIL == count) {
                basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.ONE_INTEGER);
                return Values.values(item, (SubLObject)subloop_collections.T);
            }
            if (count.numL(quant)) {
                basic_pair_set_second_method(contents_pointer, Numbers.add(count, (SubLObject)subloop_collections.ONE_INTEGER));
                return Values.values(item, (SubLObject)subloop_collections.T);
            }
            final SubLObject sublist = list.rest();
            basic_pair_set_first_method(contents_pointer, sublist);
            if (subloop_collections.NIL == sublist) {
                basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.NIL);
                return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
            }
            final SubLObject sublist_element = sublist.first();
            if (subloop_collections.NIL != subloop_private_pair_p(sublist_element)) {
                basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.ONE_INTEGER);
                return Values.values(basic_pair_get_first_method(sublist_element), (SubLObject)subloop_collections.T);
            }
            basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.NIL);
            return Values.values(sublist_element, (SubLObject)subloop_collections.T);
        }
        else {
            final SubLObject sublist2 = list.rest();
            basic_pair_set_first_method(contents_pointer, sublist2);
            if (subloop_collections.NIL == sublist2) {
                basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.NIL);
                return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
            }
            final SubLObject sublist_element2 = sublist2.first();
            if (subloop_collections.NIL != subloop_private_pair_p(sublist_element2)) {
                basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.ONE_INTEGER);
                return Values.values(basic_pair_get_first_method(sublist_element2), (SubLObject)subloop_collections.T);
            }
            basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.NIL);
            return Values.values(sublist_element2, (SubLObject)subloop_collections.T);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 75788L)
    public static SubLObject subloop_collections_get_previous_cons(final SubLObject list, final SubLObject sublist) {
        if (subloop_collections.NIL == list) {
            return (SubLObject)subloop_collections.NIL;
        }
        if (list.eql(sublist)) {
            return (SubLObject)subloop_collections.NIL;
        }
        SubLObject current_sublist;
        for (current_sublist = (SubLObject)subloop_collections.NIL, current_sublist = list; subloop_collections.NIL != current_sublist; current_sublist = current_sublist.rest()) {
            if (current_sublist.rest().eql(sublist)) {
                return current_sublist;
            }
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 76082L)
    public static SubLObject subloop_collections_backup_pointer(final SubLObject contents, final SubLObject contents_pointer) {
        if (subloop_collections.NIL == contents_pointer) {
            return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
        }
        if (subloop_collections.NIL == subloop_private_pair_p(contents_pointer)) {
            return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
        }
        final SubLObject sublist = basic_pair_get_first_method(contents_pointer);
        if (subloop_collections.NIL == sublist) {
            return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
        }
        final SubLObject element = sublist.first();
        if (subloop_collections.NIL != subloop_private_pair_p(element)) {
            final SubLObject count = basic_pair_get_second_method(contents_pointer);
            if (!count.numE((SubLObject)subloop_collections.ONE_INTEGER)) {
                basic_pair_set_second_method(contents_pointer, Numbers.subtract(count, (SubLObject)subloop_collections.ONE_INTEGER));
                return Values.values(basic_pair_get_first_method(element), (SubLObject)subloop_collections.T);
            }
            final SubLObject previous_cons = subloop_collections_get_previous_cons(contents, sublist);
            if (subloop_collections.NIL == previous_cons) {
                basic_pair_set_first_method(contents_pointer, (SubLObject)subloop_collections.NIL);
                basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.NIL);
                return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
            }
            final SubLObject previous_element = previous_cons.first();
            if (subloop_collections.NIL != subloop_private_pair_p(previous_element)) {
                basic_pair_set_first_method(contents_pointer, previous_cons);
                basic_pair_set_second_method(contents_pointer, basic_pair_get_second_method(previous_element));
                return Values.values(basic_pair_get_first_method(previous_element), (SubLObject)subloop_collections.T);
            }
            basic_pair_set_first_method(contents_pointer, previous_cons);
            basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.NIL);
            return Values.values(previous_element, (SubLObject)subloop_collections.T);
        }
        else {
            final SubLObject previous_cons2 = subloop_collections_get_previous_cons(contents, sublist);
            if (subloop_collections.NIL == previous_cons2) {
                basic_pair_set_first_method(contents_pointer, (SubLObject)subloop_collections.NIL);
                basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.NIL);
                return Values.values((SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL);
            }
            final SubLObject previous_element2 = previous_cons2.first();
            if (subloop_collections.NIL != subloop_private_pair_p(previous_element2)) {
                basic_pair_set_first_method(contents_pointer, previous_cons2);
                basic_pair_set_second_method(contents_pointer, basic_pair_get_second_method(previous_element2));
                return Values.values(basic_pair_get_first_method(previous_element2), (SubLObject)subloop_collections.T);
            }
            basic_pair_set_first_method(contents_pointer, previous_cons2);
            basic_pair_set_second_method(contents_pointer, (SubLObject)subloop_collections.NIL);
            return Values.values(previous_element2, (SubLObject)subloop_collections.T);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject get_basic_bag_enumerator_direction(final SubLObject basic_bag_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_bag_enumerator, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym41$DIRECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject set_basic_bag_enumerator_direction(final SubLObject basic_bag_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_bag_enumerator, value, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym41$DIRECTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject get_basic_bag_enumerator_contents(final SubLObject basic_bag_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_bag_enumerator, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym120$CONTENTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject set_basic_bag_enumerator_contents(final SubLObject basic_bag_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_bag_enumerator, value, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym120$CONTENTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject get_basic_bag_enumerator_contents_pointer(final SubLObject basic_bag_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_bag_enumerator, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym42$CONTENTS_POINTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject set_basic_bag_enumerator_contents_pointer(final SubLObject basic_bag_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_bag_enumerator, value, (SubLObject)subloop_collections.ONE_INTEGER, (SubLObject)subloop_collections.$sym42$CONTENTS_POINTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject basic_bag_enumerator_previous_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_direction = basic_bag_enumerator_get_direction_method(self);
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if (subloop_collections.NIL != template_contents_pointer && subloop_collections.NIL != basic_pair_get_first_method(template_contents_pointer)) {
            thread.resetMultipleValues();
            final SubLObject next_element = subloop_collections_backup_pointer(basic_bag_enumerator_get_contents_method(self), template_contents_pointer);
            final SubLObject success_p = thread.secondMultipleValue();
            thread.resetMultipleValues();
            basic_bag_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw46$BACKWARDS);
            if (subloop_collections.NIL != success_p) {
                return next_element;
            }
            return (SubLObject)subloop_collections.NIL;
        }
        else {
            if (template_direction == subloop_collections.$kw46$BACKWARDS) {
                return (SubLObject)subloop_collections.NIL;
            }
            return basic_bag_enumerator_last_method(self);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject basic_bag_enumerator_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_direction = basic_bag_enumerator_get_direction_method(self);
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if (subloop_collections.NIL != template_contents_pointer && subloop_collections.NIL != basic_pair_get_first_method(template_contents_pointer)) {
            thread.resetMultipleValues();
            final SubLObject next_element = subloop_collections_bag_enum_get_next(template_contents_pointer);
            final SubLObject success_p = thread.secondMultipleValue();
            thread.resetMultipleValues();
            basic_bag_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw44$FORWARDS);
            if (subloop_collections.NIL != success_p) {
                return next_element;
            }
            return (SubLObject)subloop_collections.NIL;
        }
        else {
            if (template_direction == subloop_collections.$kw44$FORWARDS) {
                return (SubLObject)subloop_collections.NIL;
            }
            return basic_bag_enumerator_first_method(self);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject basic_bag_enumerator_last_method(final SubLObject self) {
        SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        final SubLObject template_contents = basic_bag_enumerator_get_contents_method(self);
        if (subloop_collections.NIL == template_contents_pointer) {
            template_contents_pointer = object.object_new_method((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR);
            basic_bag_enumerator_set_contents_pointer_method(self, template_contents_pointer);
        }
        if (subloop_collections.NIL != template_contents) {
            final SubLObject last_cons = conses_high.last(template_contents, (SubLObject)subloop_collections.UNPROVIDED);
            final SubLObject element = last_cons.first();
            if (subloop_collections.NIL != subloop_private_pair_p(element)) {
                final SubLObject count = basic_pair_get_second_method(element);
                basic_pair_set_first_method(template_contents_pointer, last_cons);
                basic_pair_set_second_method(template_contents_pointer, count);
            }
            else {
                basic_pair_set_first_method(template_contents_pointer, last_cons);
                basic_pair_set_second_method(template_contents_pointer, (SubLObject)subloop_collections.NIL);
            }
        }
        else {
            basic_pair_set_first_method(template_contents_pointer, (SubLObject)subloop_collections.NIL);
            basic_pair_set_second_method(template_contents_pointer, (SubLObject)subloop_collections.NIL);
        }
        basic_bag_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw46$BACKWARDS);
        return basic_bag_enumerator_current_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject basic_bag_enumerator_first_method(final SubLObject self) {
        SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        final SubLObject template_contents = basic_bag_enumerator_get_contents_method(self);
        if (subloop_collections.NIL == template_contents_pointer) {
            template_contents_pointer = object.object_new_method((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR);
            basic_bag_enumerator_set_contents_pointer_method(self, template_contents_pointer);
        }
        basic_pair_set_first_method(template_contents_pointer, template_contents);
        if (subloop_collections.NIL != template_contents) {
            final SubLObject template_element = template_contents.first();
            if (subloop_collections.NIL != subloop_private_pair_p(template_element)) {
                basic_pair_set_second_method(template_contents_pointer, (SubLObject)subloop_collections.ONE_INTEGER);
            }
            else {
                basic_pair_set_second_method(template_contents_pointer, (SubLObject)subloop_collections.NIL);
            }
        }
        else {
            basic_pair_set_second_method(template_contents_pointer, (SubLObject)subloop_collections.NIL);
        }
        basic_bag_enumerator_set_direction_method(self, (SubLObject)subloop_collections.$kw44$FORWARDS);
        return basic_bag_enumerator_current_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject basic_bag_enumerator_current_method(final SubLObject self) {
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if (subloop_collections.NIL != template_contents_pointer) {
            final SubLObject list = basic_pair_get_first_method(template_contents_pointer);
            if (subloop_collections.NIL != list) {
                final SubLObject element = list.first();
                if (subloop_collections.NIL != element) {
                    if (subloop_collections.NIL != subloop_private_pair_p(element)) {
                        return basic_pair_get_first_method(element);
                    }
                    return element;
                }
            }
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject basic_bag_enumerator_last_p_method(final SubLObject self) {
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if (subloop_collections.NIL == template_contents_pointer) {
            return (SubLObject)subloop_collections.NIL;
        }
        final SubLObject list = basic_pair_get_first_method(template_contents_pointer);
        if (subloop_collections.NIL == list) {
            return (SubLObject)subloop_collections.NIL;
        }
        if (subloop_collections.NIL != list.rest()) {
            return (SubLObject)subloop_collections.NIL;
        }
        final SubLObject element = list.first();
        if (subloop_collections.NIL != subloop_private_pair_p(element)) {
            final SubLObject count = basic_pair_get_second_method(template_contents_pointer);
            final SubLObject quant = basic_pair_get_second_method(element);
            return Numbers.numE(count, quant);
        }
        return (SubLObject)subloop_collections.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject basic_bag_enumerator_first_p_method(final SubLObject self) {
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        final SubLObject template_contents = basic_bag_enumerator_get_contents_method(self);
        if (subloop_collections.NIL != template_contents_pointer) {
            return Equality.eq(template_contents, basic_pair_get_first_method(template_contents_pointer));
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject basic_bag_enumerator_empty_p_method(final SubLObject self) {
        final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method(self);
        if (subloop_collections.NIL != template_contents_pointer) {
            return Types.sublisp_null(basic_pair_get_first_method(template_contents_pointer));
        }
        return (SubLObject)subloop_collections.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject subloop_reserved_initialize_basic_bag_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject subloop_reserved_initialize_basic_bag_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym42$CONTENTS_POINTER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym120$CONTENTS, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym41$DIRECTION, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
    public static SubLObject basic_bag_enumerator_p(final SubLObject basic_bag_enumerator) {
        return classes.subloop_instanceof_class(basic_bag_enumerator, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 80790L)
    public static SubLObject basic_bag_enumerator_instantiate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject direction = get_basic_bag_enumerator_direction(self);
        SubLObject contents = get_basic_bag_enumerator_contents(self);
        SubLObject contents_pointer = get_basic_bag_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push(subloop_collections.$sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                methods.funcall_instance_super_method_with_0_args(self, (SubLObject)subloop_collections.$sym584$INSTANTIATE);
                contents_pointer = object.object_new_method((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR);
                contents = (SubLObject)subloop_collections.NIL;
                direction = (SubLObject)subloop_collections.$kw45$NONE;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_enumerator_direction(self, direction);
                    set_basic_bag_enumerator_contents(self, contents);
                    set_basic_bag_enumerator_contents_pointer(self, contents_pointer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81038L)
    public static SubLObject basic_bag_enumerator_get_contents_pointer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject contents_pointer = get_basic_bag_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push(subloop_collections.$sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, contents_pointer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_enumerator_contents_pointer(self, contents_pointer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81144L)
    public static SubLObject basic_bag_enumerator_set_contents_pointer_method(final SubLObject self, final SubLObject new_pointer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject contents_pointer = get_basic_bag_enumerator_contents_pointer(self);
        try {
            thread.throwStack.push(subloop_collections.$sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL != new_pointer && subloop_collections.NIL == subloop_private_pair_p(new_pointer)) {
                    Errors.error((SubLObject)subloop_collections.$str593$_SET_CONTENTS_POINTER__S____S_is_, self, new_pointer);
                }
                contents_pointer = new_pointer;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, new_pointer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_enumerator_contents_pointer(self, contents_pointer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81467L)
    public static SubLObject basic_bag_enumerator_get_contents_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject contents = get_basic_bag_enumerator_contents(self);
        try {
            thread.throwStack.push(subloop_collections.$sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, contents);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_enumerator_contents(self, contents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81557L)
    public static SubLObject basic_bag_enumerator_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject contents = get_basic_bag_enumerator_contents(self);
        try {
            thread.throwStack.push(subloop_collections.$sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !new_contents.isList()) {
                    Errors.error((SubLObject)subloop_collections.$str599$_SET_CONTENTS__S____S_is_not_an_i, self, new_contents);
                }
                contents = new_contents;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, new_contents);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_enumerator_contents(self, contents);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81803L)
    public static SubLObject basic_bag_enumerator_get_direction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = (SubLObject)subloop_collections.NIL;
        final SubLObject direction = get_basic_bag_enumerator_direction(self);
        try {
            thread.throwStack.push(subloop_collections.$sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, direction);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_enumerator_direction(self, direction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81897L)
    public static SubLObject basic_bag_enumerator_set_direction_method(final SubLObject self, final SubLObject new_direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_enumerator_method = (SubLObject)subloop_collections.NIL;
        SubLObject direction = get_basic_bag_enumerator_direction(self);
        try {
            thread.throwStack.push(subloop_collections.$sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
            try {
                if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == sequential_direction_p(new_direction)) {
                    Errors.error((SubLObject)subloop_collections.$str605$_SET_DIRECTION__S____S_is_not_an_, self, new_direction);
                }
                direction = new_direction;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, new_direction);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_enumerator_direction(self, direction);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 82185L)
    public static SubLObject bag_template_p(final SubLObject bag_template) {
        return interfaces.subloop_instanceof_interface(bag_template, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 84573L)
    public static SubLObject subloop_collections_bag_template_translate_pair(final SubLObject subloop_private_pair) {
        final SubLObject element = basic_pair_get_first_method(subloop_private_pair);
        final SubLObject count = basic_pair_get_second_method(subloop_private_pair);
        SubLObject result = (SubLObject)subloop_collections.NIL;
        SubLObject i;
        for (i = (SubLObject)subloop_collections.NIL, i = (SubLObject)subloop_collections.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)subloop_collections.ONE_INTEGER)) {
            result = (SubLObject)ConsesLow.cons(element, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject get_basic_bag_bag_representation(final SubLObject basic_bag) {
        return classes.subloop_get_access_protected_instance_slot(basic_bag, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym626$BAG_REPRESENTATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject set_basic_bag_bag_representation(final SubLObject basic_bag, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_bag, value, (SubLObject)subloop_collections.THREE_INTEGER, (SubLObject)subloop_collections.$sym626$BAG_REPRESENTATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_empty_p_method(final SubLObject self) {
        return Types.sublisp_null(basic_bag_get_internal_representation_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_get_unique_element_count_method(final SubLObject self) {
        return Sequences.length(basic_bag_get_internal_representation_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_get_unique_elements_method(final SubLObject self) {
        SubLObject template_unique_elements = (SubLObject)subloop_collections.NIL;
        SubLObject cdolist_list_var;
        final SubLObject template_bag_list = cdolist_list_var = basic_bag_get_internal_representation_method(self);
        SubLObject template_element = (SubLObject)subloop_collections.NIL;
        template_element = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            if (subloop_collections.NIL != subloop_private_pair_p(template_element)) {
                template_unique_elements = (SubLObject)ConsesLow.cons(basic_pair_get_first_method(template_element), template_unique_elements);
            }
            else {
                template_unique_elements = (SubLObject)ConsesLow.cons(template_element, template_unique_elements);
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        }
        return template_unique_elements;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_occurences_method(final SubLObject self, final SubLObject element) {
        SubLObject cdolist_list_var;
        final SubLObject template_bag_list = cdolist_list_var = basic_bag_get_internal_representation_method(self);
        SubLObject template_element = (SubLObject)subloop_collections.NIL;
        template_element = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            if (subloop_collections.NIL != subloop_private_pair_p(template_element)) {
                if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, basic_pair_get_first_method(template_element), element)) {
                    return basic_pair_get_second_method(template_element);
                }
            }
            else if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, template_element, element)) {
                return (SubLObject)subloop_collections.ONE_INTEGER;
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        }
        return (SubLObject)subloop_collections.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_member_p_method(final SubLObject self, final SubLObject element) {
        SubLObject cdolist_list_var;
        final SubLObject template_bag_list = cdolist_list_var = basic_bag_get_internal_representation_method(self);
        SubLObject template_element = (SubLObject)subloop_collections.NIL;
        template_element = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            if (subloop_collections.NIL != subloop_private_pair_p(template_element)) {
                if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, basic_pair_get_first_method(template_element), element)) {
                    return (SubLObject)subloop_collections.T;
                }
            }
            else if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, template_element, element)) {
                return (SubLObject)subloop_collections.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_bag_list = basic_bag_get_internal_representation_method(self);
        if (subloop_collections.NIL == template_bag_list) {
            return (SubLObject)subloop_collections.NIL;
        }
        SubLObject template_current_element = template_bag_list.first();
        if (subloop_collections.NIL != subloop_private_pair_p(template_current_element)) {
            if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, old_element, basic_pair_get_first_method(template_current_element))) {
                final SubLObject template_count = basic_pair_get_second_method(template_current_element);
                if (template_count.numE((SubLObject)subloop_collections.TWO_INTEGER)) {
                    ConsesLow.rplaca(template_bag_list, basic_pair_get_first_method(template_current_element));
                    return old_element;
                }
                basic_pair_set_second_method(template_current_element, Numbers.subtract(template_count, (SubLObject)subloop_collections.ONE_INTEGER));
                return old_element;
            }
        }
        else if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, old_element, template_current_element)) {
            basic_bag_set_internal_representation_method(self, template_bag_list.rest());
            return old_element;
        }
        SubLObject template_previous_cons = template_bag_list;
        for (SubLObject template_current_cons = template_bag_list.rest(); subloop_collections.NIL != template_current_cons; template_current_cons = template_current_cons.rest()) {
            template_current_element = template_current_cons.first();
            if (subloop_collections.NIL != subloop_private_pair_p(template_current_element)) {
                if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, old_element, basic_pair_get_first_method(template_current_element))) {
                    final SubLObject template_count2 = basic_pair_get_second_method(template_current_element);
                    if (template_count2.numE((SubLObject)subloop_collections.TWO_INTEGER)) {
                        ConsesLow.rplaca(template_current_cons, basic_pair_get_first_method(template_current_element));
                        return old_element;
                    }
                    basic_pair_set_second_method(template_current_element, Numbers.subtract(template_count2, (SubLObject)subloop_collections.ONE_INTEGER));
                    return old_element;
                }
            }
            else if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, old_element, template_current_element)) {
                ConsesLow.rplacd(template_previous_cons, template_current_cons.rest());
                return old_element;
            }
            template_previous_cons = template_current_cons;
        }
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_add_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_bag_list = basic_bag_get_internal_representation_method(self);
        SubLObject template_current_element = (SubLObject)subloop_collections.NIL;
        SubLObject template_sublist;
        SubLObject template_new_pair;
        for (template_sublist = (SubLObject)subloop_collections.NIL, template_sublist = template_bag_list; subloop_collections.NIL != template_sublist; template_sublist = template_sublist.rest()) {
            template_current_element = template_sublist.first();
            if (subloop_collections.NIL != subloop_private_pair_p(template_current_element)) {
                if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, new_element, basic_pair_get_first_method(template_current_element))) {
                    basic_pair_set_second_method(template_current_element, Numbers.add(basic_pair_get_second_method(template_current_element), (SubLObject)subloop_collections.ONE_INTEGER));
                    return new_element;
                }
            }
            else if (subloop_collections.NIL != basic_collection_element_equal_p_method(self, new_element, template_current_element)) {
                template_new_pair = object.object_new_method((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR);
                basic_pair_set_first_method(template_new_pair, template_current_element);
                basic_pair_set_second_method(template_new_pair, (SubLObject)subloop_collections.TWO_INTEGER);
                ConsesLow.rplaca(template_sublist, template_new_pair);
                return new_element;
            }
        }
        basic_bag_set_internal_representation_method(self, (SubLObject)ConsesLow.cons(new_element, template_bag_list));
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        basic_bag_set_internal_representation_method(self, (SubLObject)subloop_collections.NIL);
        SubLObject cdolist_list_var = new_contents;
        SubLObject template_element = (SubLObject)subloop_collections.NIL;
        template_element = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            basic_bag_add_method(self, template_element);
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        }
        return new_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_get_contents_method(final SubLObject self) {
        final SubLObject template_bag_list = basic_bag_get_internal_representation_method(self);
        SubLObject template_contents = (SubLObject)subloop_collections.NIL;
        final SubLObject list_expression = template_bag_list;
        if (subloop_collections.NIL == list_expression) {
            template_contents = (SubLObject)subloop_collections.NIL;
        }
        else if (list_expression.isAtom()) {
            template_contents = (SubLObject)ConsesLow.list(list_expression);
        }
        else if (subloop_collections.NIL == list_expression.rest()) {
            final SubLObject template_element = list_expression.first();
            template_contents = (SubLObject)((subloop_collections.NIL != subloop_private_pair_p(template_element)) ? subloop_collections_bag_template_translate_pair(template_element) : ConsesLow.list(template_element));
        }
        else {
            SubLObject tail_cons = (SubLObject)subloop_collections.NIL;
            SubLObject result = (SubLObject)subloop_collections.NIL;
            template_contents = (SubLObject)subloop_collections.NIL;
            SubLObject cdolist_list_var = list_expression;
            SubLObject template_element2 = (SubLObject)subloop_collections.NIL;
            template_element2 = cdolist_list_var.first();
            while (subloop_collections.NIL != cdolist_list_var) {
                result = (SubLObject)((subloop_collections.NIL != subloop_private_pair_p(template_element2)) ? subloop_collections_bag_template_translate_pair(template_element2) : ConsesLow.list(template_element2));
                if (subloop_collections.NIL != result) {
                    if (subloop_collections.NIL != tail_cons) {
                        ConsesLow.rplacd(tail_cons, result);
                        tail_cons = conses_high.last(result, (SubLObject)subloop_collections.UNPROVIDED);
                    }
                    else {
                        template_contents = (SubLObject)((subloop_collections.NIL != subloop_private_pair_p(template_element2)) ? subloop_collections_bag_template_translate_pair(template_element2) : ConsesLow.list(template_element2));
                        tail_cons = conses_high.last(template_contents, (SubLObject)subloop_collections.UNPROVIDED);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                template_element2 = cdolist_list_var.first();
            }
        }
        return template_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_get_element_count_method(final SubLObject self) {
        final SubLObject template_bag_list = basic_bag_get_internal_representation_method(self);
        SubLObject template_count = (SubLObject)subloop_collections.ZERO_INTEGER;
        SubLObject cdolist_list_var = template_bag_list;
        SubLObject template_element = (SubLObject)subloop_collections.NIL;
        template_element = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            if (subloop_collections.NIL != subloop_private_pair_p(template_element)) {
                template_count = Numbers.add(template_count, basic_pair_get_second_method(template_element));
            }
            else {
                template_count = Numbers.add(template_count, (SubLObject)subloop_collections.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            template_element = cdolist_list_var.first();
        }
        return template_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_enumerator = basic_bag_allocate_enumerator_method(self);
        if (subloop_collections.NIL == template_enumerator) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str127$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (subloop_collections.NIL != methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym18$EMPTY_P)) {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str637$BAG__);
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_collections.$str638$BAG__S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym27$FIRST));
            while (subloop_collections.NIL == methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym23$LAST_P)) {
                PrintLow.format(stream, (SubLObject)subloop_collections.$str130$___S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_collections.$sym31$NEXT));
            }
            PrintLow.format(stream, (SubLObject)subloop_collections.$str131$_);
        }
        basic_bag_deallocate_enumerator_method(self, template_enumerator);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject subloop_reserved_initialize_basic_bag_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject subloop_reserved_initialize_basic_bag_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym120$CONTENTS, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym119$ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym626$BAG_REPRESENTATION, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
    public static SubLObject basic_bag_p(final SubLObject basic_bag) {
        return classes.subloop_instanceof_class(basic_bag, (SubLObject)subloop_collections.$sym623$BASIC_BAG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 91906L)
    public static SubLObject basic_bag_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_method = (SubLObject)subloop_collections.NIL;
        SubLObject bag_representation = get_basic_bag_bag_representation(self);
        try {
            thread.throwStack.push(subloop_collections.$sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
            try {
                basic_collection_initialize_method(self);
                bag_representation = (SubLObject)subloop_collections.NIL;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_bag_representation(self, bag_representation);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 92033L)
    public static SubLObject basic_bag_get_internal_representation_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_method = (SubLObject)subloop_collections.NIL;
        final SubLObject bag_representation = get_basic_bag_bag_representation(self);
        try {
            thread.throwStack.push(subloop_collections.$sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD, bag_representation);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_bag_representation(self, bag_representation);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 92137L)
    public static SubLObject basic_bag_set_internal_representation_method(final SubLObject self, final SubLObject new_rep) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_method = (SubLObject)subloop_collections.NIL;
        SubLObject bag_representation = get_basic_bag_bag_representation(self);
        try {
            thread.throwStack.push(subloop_collections.$sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
            try {
                if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !new_rep.isList()) {
                    Errors.error((SubLObject)subloop_collections.$str653$_SET_INTERNAL_REPRESENTATION__S__, self, new_rep);
                }
                bag_representation = new_rep;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD, new_rep);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_bag_representation(self, bag_representation);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 92426L)
    public static SubLObject basic_bag_allocate_enumerator_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_bag_method = (SubLObject)subloop_collections.NIL;
        final SubLObject bag_representation = get_basic_bag_bag_representation(self);
        try {
            thread.throwStack.push(subloop_collections.$sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
            try {
                final SubLObject new_enumerator = object.object_new_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR);
                final SubLObject contents_pointer = object.object_new_method((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR);
                basic_bag_enumerator_set_contents_pointer_method(new_enumerator, contents_pointer);
                basic_bag_enumerator_set_contents_method(new_enumerator, bag_representation);
                basic_bag_enumerator_first_method(new_enumerator);
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD, new_enumerator);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_bag_bag_representation(self, bag_representation);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_bag_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_bag_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 92952L)
    public static SubLObject basic_bag_deallocate_enumerator_method(final SubLObject self, final SubLObject enumerator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == basic_bag_enumerator_p(enumerator)) {
            Errors.error((SubLObject)subloop_collections.$str659$_DEALLOCATE_ENUMERATOR__S____S_is, self, enumerator);
        }
        basic_bag_enumerator_set_contents_pointer_method(enumerator, (SubLObject)subloop_collections.NIL);
        basic_bag_enumerator_set_contents_method(enumerator, (SubLObject)subloop_collections.NIL);
        object.object_isolate_method(enumerator);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
    public static SubLObject get_test_list_element_symbolic_name(final SubLObject test_list_element) {
        return classes.subloop_get_access_protected_instance_slot(test_list_element, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym663$SYMBOLIC_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
    public static SubLObject set_test_list_element_symbolic_name(final SubLObject test_list_element, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_list_element, value, (SubLObject)subloop_collections.TWO_INTEGER, (SubLObject)subloop_collections.$sym663$SYMBOLIC_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
    public static SubLObject subloop_reserved_initialize_test_list_element_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym55$INSTANCE_COUNT, (SubLObject)subloop_collections.ZERO_INTEGER);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
    public static SubLObject subloop_reserved_initialize_test_list_element_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym57$ISOLATED_P, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$sym58$INSTANCE_NUMBER, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym308$QUA_LIST_ELEMENT_PARENT_LINKS, (SubLObject)subloop_collections.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym663$SYMBOLIC_NAME, (SubLObject)subloop_collections.NIL);
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
    public static SubLObject test_list_element_p(final SubLObject test_list_element) {
        return classes.subloop_instanceof_class(test_list_element, (SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93854L)
    public static SubLObject test_list_element_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_list_element_method = (SubLObject)subloop_collections.NIL;
        SubLObject symbolic_name = get_test_list_element_symbolic_name(self);
        try {
            thread.throwStack.push(subloop_collections.$sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
            try {
                symbolic_name = (SubLObject)subloop_collections.NIL;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_test_list_element_symbolic_name(self, symbolic_name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_test_list_element_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_list_element_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93963L)
    public static SubLObject test_list_element_get_symbolic_name_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_list_element_method = (SubLObject)subloop_collections.NIL;
        final SubLObject symbolic_name = get_test_list_element_symbolic_name(self);
        try {
            thread.throwStack.push(subloop_collections.$sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, symbolic_name);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_test_list_element_symbolic_name(self, symbolic_name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_test_list_element_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_list_element_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94057L)
    public static SubLObject test_list_element_set_symbolic_name_method(final SubLObject self, final SubLObject new_symbolic_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_list_element_method = (SubLObject)subloop_collections.NIL;
        SubLObject symbolic_name = get_test_list_element_symbolic_name(self);
        try {
            thread.throwStack.push(subloop_collections.$sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
            try {
                symbolic_name = new_symbolic_name;
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, new_symbolic_name);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_test_list_element_symbolic_name(self, symbolic_name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_test_list_element_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_list_element_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94214L)
    public static SubLObject test_list_element_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_test_list_element_method = (SubLObject)subloop_collections.NIL;
        final SubLObject symbolic_name = get_test_list_element_symbolic_name(self);
        try {
            thread.throwStack.push(subloop_collections.$sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
            try {
                PrintLow.format(stream, (SubLObject)subloop_collections.$str680$__S_, symbolic_name);
                Dynamic.sublisp_throw((SubLObject)subloop_collections.$sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_collections.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_test_list_element_symbolic_name(self, symbolic_name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_test_list_element_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_collections.$sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_test_list_element_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94355L)
    public static SubLObject test_list_element_on_add_method(final SubLObject self, final SubLObject parent_list) {
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94462L)
    public static SubLObject test_list_element_on_delete_method(final SubLObject self, final SubLObject parent_list) {
        return (SubLObject)subloop_collections.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94618L)
    public static SubLObject intern_test_list_element(final SubLObject symbolic_name) {
        SubLObject cdolist_list_var = subloop_collections.$test_list_elements$.getGlobalValue();
        SubLObject list_element = (SubLObject)subloop_collections.NIL;
        list_element = cdolist_list_var.first();
        while (subloop_collections.NIL != cdolist_list_var) {
            if (test_list_element_get_symbolic_name_method(list_element).eql(symbolic_name)) {
                return list_element;
            }
            cdolist_list_var = cdolist_list_var.rest();
            list_element = cdolist_list_var.first();
        }
        final SubLObject new_list_element = object.object_new_method((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT);
        test_list_element_set_symbolic_name_method(new_list_element, symbolic_name);
        subloop_collections.$test_list_elements$.setGlobalValue((SubLObject)ConsesLow.cons(new_list_element, subloop_collections.$test_list_elements$.getGlobalValue()));
        return new_list_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95116L)
    public static SubLObject enumerator_template_empty_p(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == enumerator_template_p(enumerator_template)) {
            Errors.error((SubLObject)subloop_collections.$str685$ENUMERATOR_TEMPLATE_EMPTY_P___S_i, enumerator_template);
        }
        if (subloop_collections.NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_empty_p_method(enumerator_template);
        }
        if (subloop_collections.NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_empty_p_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, (SubLObject)subloop_collections.$sym18$EMPTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95356L)
    public static SubLObject enumerator_template_last_p(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == enumerator_template_p(enumerator_template)) {
            Errors.error((SubLObject)subloop_collections.$str686$ENUMERATOR_TEMPLATE_LAST_P___S_is, enumerator_template);
        }
        if (subloop_collections.NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_last_p_method(enumerator_template);
        }
        if (subloop_collections.NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_last_p_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, (SubLObject)subloop_collections.$sym23$LAST_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95539L)
    public static SubLObject enumerator_template_first(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == enumerator_template_p(enumerator_template)) {
            Errors.error((SubLObject)subloop_collections.$str687$ENUMERATOR_TEMPLATE_FIRST___S_is_, enumerator_template);
        }
        if (subloop_collections.NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_first_method(enumerator_template);
        }
        if (subloop_collections.NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_first_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, (SubLObject)subloop_collections.$sym27$FIRST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95720L)
    public static SubLObject enumerator_template_next(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == enumerator_template_p(enumerator_template)) {
            Errors.error((SubLObject)subloop_collections.$str688$ENUMERATOR_TEMPLATE_NEXT___S_is_n, enumerator_template);
        }
        if (subloop_collections.NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_next_method(enumerator_template);
        }
        if (subloop_collections.NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_next_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, (SubLObject)subloop_collections.$sym31$NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95899L)
    public static SubLObject enumerator_template_current(final SubLObject enumerator_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == enumerator_template_p(enumerator_template)) {
            Errors.error((SubLObject)subloop_collections.$str689$ENUMERATOR_TEMPLATE_CURRENT___S_i, enumerator_template);
        }
        if (subloop_collections.NIL != basic_doubly_linked_list_enumerator_p(enumerator_template)) {
            return basic_doubly_linked_list_enumerator_current_method(enumerator_template);
        }
        if (subloop_collections.NIL != basic_collection_enumerator_p(enumerator_template)) {
            return basic_collection_enumerator_current_method(enumerator_template);
        }
        return methods.funcall_instance_method_with_0_args(enumerator_template, (SubLObject)subloop_collections.$sym25$CURRENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 96084L)
    public static SubLObject collection_template_empty_p(final SubLObject collection_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == collection_template_p(collection_template)) {
            Errors.error((SubLObject)subloop_collections.$str690$COLLECTION_TEMPLATE_EMPTY_P___S_i, collection_template);
        }
        if (subloop_collections.NIL != basic_doubly_linked_list_p(collection_template)) {
            return basic_doubly_linked_list_empty_p_method(collection_template);
        }
        if (subloop_collections.NIL != basic_end_pointer_list_p(collection_template)) {
            return basic_end_pointer_list_empty_p_method(collection_template);
        }
        if (subloop_collections.NIL != basic_list_p(collection_template)) {
            return basic_list_empty_p_method(collection_template);
        }
        if (subloop_collections.NIL != basic_collection_p(collection_template)) {
            return basic_collection_empty_p_method(collection_template);
        }
        return methods.funcall_instance_method_with_0_args(collection_template, (SubLObject)subloop_collections.$sym18$EMPTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 96281L)
    public static SubLObject doubly_linked_list_template_add(final SubLObject doubly_linked_list_template, final SubLObject new_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == doubly_linked_list_template_p(doubly_linked_list_template)) {
            Errors.error((SubLObject)subloop_collections.$str691$DOUBLY_LINKED_LIST_TEMPLATE_ADD__, doubly_linked_list_template);
        }
        if (subloop_collections.NIL != basic_doubly_linked_list_p(doubly_linked_list_template)) {
            return basic_doubly_linked_list_add_method(doubly_linked_list_template, new_element);
        }
        return methods.funcall_instance_method_with_1_args(doubly_linked_list_template, (SubLObject)subloop_collections.$sym106$ADD, new_element);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 96446L)
    public static SubLObject doubly_linked_list_template_get_contents(final SubLObject doubly_linked_list_template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_collections.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_collections.NIL == doubly_linked_list_template_p(doubly_linked_list_template)) {
            Errors.error((SubLObject)subloop_collections.$str692$DOUBLY_LINKED_LIST_TEMPLATE_GET_C, doubly_linked_list_template);
        }
        if (subloop_collections.NIL != basic_doubly_linked_list_p(doubly_linked_list_template)) {
            return basic_doubly_linked_list_get_contents_method(doubly_linked_list_template);
        }
        return methods.funcall_instance_method_with_0_args(doubly_linked_list_template, (SubLObject)subloop_collections.$sym152$GET_CONTENTS);
    }
    
    public static SubLObject declare_subloop_collections_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "valid_sequential_directions", "VALID-SEQUENTIAL-DIRECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "sequential_direction_p", "SEQUENTIAL-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "encode_sequential_direction", "ENCODE-SEQUENTIAL-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "decode_sequential_direction", "DECODE-SEQUENTIAL-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "sequential_direction_less_p", "SEQUENTIAL-DIRECTION-LESS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "sequential_direction_greater_p", "SEQUENTIAL-DIRECTION-GREATER-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "iterator_template_p", "ITERATOR-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "enumerator_template_p", "ENUMERATOR-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "collection_enumerator_template_p", "COLLECTION-ENUMERATOR-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "protected_membership_template_p", "PROTECTED-MEMBERSHIP-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_collection_enumerator_direction", "GET-BASIC-COLLECTION-ENUMERATOR-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_collection_enumerator_direction", "SET-BASIC-COLLECTION-ENUMERATOR-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_collection_enumerator_contents_pointer", "GET-BASIC-COLLECTION-ENUMERATOR-CONTENTS-POINTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_collection_enumerator_contents_pointer", "SET-BASIC-COLLECTION-ENUMERATOR-CONTENTS-POINTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_collection_enumerator_collection_contents", "GET-BASIC-COLLECTION-ENUMERATOR-COLLECTION-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_collection_enumerator_collection_contents", "SET-BASIC-COLLECTION-ENUMERATOR-COLLECTION-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_previous_method", "BASIC-COLLECTION-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_next_method", "BASIC-COLLECTION-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_last_method", "BASIC-COLLECTION-ENUMERATOR-LAST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_first_method", "BASIC-COLLECTION-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_current_method", "BASIC-COLLECTION-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_last_p_method", "BASIC-COLLECTION-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_first_p_method", "BASIC-COLLECTION-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_empty_p_method", "BASIC-COLLECTION-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_collection_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_collection_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_p", "BASIC-COLLECTION-ENUMERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_initialize_method", "BASIC-COLLECTION-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_store_collection_contents_method", "BASIC-COLLECTION-ENUMERATOR-STORE-COLLECTION-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_retrieve_collection_contents_method", "BASIC-COLLECTION-ENUMERATOR-RETRIEVE-COLLECTION-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_set_contents_pointer_method", "BASIC-COLLECTION-ENUMERATOR-SET-CONTENTS-POINTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_get_contents_pointer_method", "BASIC-COLLECTION-ENUMERATOR-GET-CONTENTS-POINTER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_get_direction_method", "BASIC-COLLECTION-ENUMERATOR-GET-DIRECTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_enumerator_set_direction_method", "BASIC-COLLECTION-ENUMERATOR-SET-DIRECTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "collection_template_p", "COLLECTION-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_collection_element_equality_predicate", "GET-BASIC-COLLECTION-ELEMENT-EQUALITY-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_collection_element_equality_predicate", "SET-BASIC-COLLECTION-ELEMENT-EQUALITY-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_collection_contents", "GET-BASIC-COLLECTION-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_collection_contents", "SET-BASIC-COLLECTION-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_empty_p_method", "BASIC-COLLECTION-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_member_p_method", "BASIC-COLLECTION-MEMBER-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_remove_method", "BASIC-COLLECTION-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_add_method", "BASIC-COLLECTION-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_clear_method", "BASIC-COLLECTION-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_get_element_count_method", "BASIC-COLLECTION-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_print_method", "BASIC-COLLECTION-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_collection_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_collection_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_p", "BASIC-COLLECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_initialize_method", "BASIC-COLLECTION-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_element_equal_p_method", "BASIC-COLLECTION-ELEMENT-EQUAL-P-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_get_element_equality_predicate_method", "BASIC-COLLECTION-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_set_element_equality_predicate_method", "BASIC-COLLECTION-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_get_contents_method", "BASIC-COLLECTION-GET-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_set_contents_method", "BASIC-COLLECTION-SET-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_allocate_enumerator_method", "BASIC-COLLECTION-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_collection_deallocate_enumerator_method", "BASIC-COLLECTION-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "list_template_p", "LIST-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_empty_p_method", "BASIC-LIST-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_reverse_method", "BASIC-LIST-REVERSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_append_method", "BASIC-LIST-APPEND-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_position_method", "BASIC-LIST-POSITION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_set_nth_method", "BASIC-LIST-SET-NTH-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_nth_method", "BASIC-LIST-NTH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_but_last_method", "BASIC-LIST-BUT-LAST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_pop_method", "BASIC-LIST-POP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_push_method", "BASIC-LIST-PUSH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_print_method", "BASIC-LIST-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_list_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_list_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_p", "BASIC-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "end_pointer_list_template_p", "END-POINTER-LIST-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_end_pointer_list_end_pointer", "GET-BASIC-END-POINTER-LIST-END-POINTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_end_pointer_list_end_pointer", "SET-BASIC-END-POINTER-LIST-END-POINTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_empty_p_method", "BASIC-END-POINTER-LIST-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_reverse_method", "BASIC-END-POINTER-LIST-REVERSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_append_method", "BASIC-END-POINTER-LIST-APPEND-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_position_method", "BASIC-END-POINTER-LIST-POSITION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_nth_method", "BASIC-END-POINTER-LIST-NTH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_but_last_method", "BASIC-END-POINTER-LIST-BUT-LAST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_pop_method", "BASIC-END-POINTER-LIST-POP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_push_method", "BASIC-END-POINTER-LIST-PUSH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_remove_method", "BASIC-END-POINTER-LIST-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_add_method", "BASIC-END-POINTER-LIST-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_clear_method", "BASIC-END-POINTER-LIST-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_print_method", "BASIC-END-POINTER-LIST-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_end_pointer_list_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_end_pointer_list_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_p", "BASIC-END-POINTER-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_get_end_pointer_method", "BASIC-END-POINTER-LIST-GET-END-POINTER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_end_pointer_list_set_end_pointer_method", "BASIC-END-POINTER-LIST-SET-END-POINTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "double_link_cell_print_function_trampoline", "DOUBLE-LINK-CELL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "double_link_cell_p", "DOUBLE-LINK-CELL-P", 1, 0, false);
        new $double_link_cell_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "dlc_owner", "DLC-OWNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "dlc_contents", "DLC-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "dlc_previous", "DLC-PREVIOUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "dlc_next", "DLC-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "_csetf_dlc_owner", "_CSETF-DLC-OWNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "_csetf_dlc_contents", "_CSETF-DLC-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "_csetf_dlc_previous", "_CSETF-DLC-PREVIOUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "_csetf_dlc_next", "_CSETF-DLC-NEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "make_double_link_cell", "MAKE-DOUBLE-LINK-CELL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "visit_defstruct_double_link_cell", "VISIT-DEFSTRUCT-DOUBLE-LINK-CELL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "visit_defstruct_object_double_link_cell_method", "VISIT-DEFSTRUCT-OBJECT-DOUBLE-LINK-CELL-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_collections", "with_dlc_read_only", "WITH-DLC-READ-ONLY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_collections", "with_dlc_read_write", "WITH-DLC-READ-WRITE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "dlc_copy_links", "DLC-COPY-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "list_element_template_p", "LIST-ELEMENT-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_list_element_qua_list_element_parent_links", "GET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_list_element_qua_list_element_parent_links", "SET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_list_element_qua_list_element_self_deletion_mode", "GET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_list_element_qua_list_element_self_deletion_mode", "SET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_perform_action_method", "BASIC-LIST-ELEMENT-PERFORM-ACTION-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_on_delete_method", "BASIC-LIST-ELEMENT-ON-DELETE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_on_add_method", "BASIC-LIST-ELEMENT-ON-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_get_collections_method", "BASIC-LIST-ELEMENT-GET-COLLECTIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_member_p_method", "BASIC-LIST-ELEMENT-MEMBER-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_delete_self_from_all_collections_method", "BASIC-LIST-ELEMENT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_transfer_self_method", "BASIC-LIST-ELEMENT-TRANSFER-SELF-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_delete_self_from_collection_method", "BASIC-LIST-ELEMENT-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_delete_parent_link_method", "BASIC-LIST-ELEMENT-DELETE-PARENT-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_add_parent_link_method", "BASIC-LIST-ELEMENT-ADD-PARENT-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_list_element_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_list_element_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_p", "BASIC-LIST-ELEMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_initialize_method", "BASIC-LIST-ELEMENT-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_get_parent_links_method", "BASIC-LIST-ELEMENT-GET-PARENT-LINKS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_set_parent_links_method", "BASIC-LIST-ELEMENT-SET-PARENT-LINKS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_get_self_deletion_mode_method", "BASIC-LIST-ELEMENT-GET-SELF-DELETION-MODE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_list_element_set_self_deletion_mode_method", "BASIC-LIST-ELEMENT-SET-SELF-DELETION-MODE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "doubly_linked_list_template_p", "DOUBLY-LINKED-LIST-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_doubly_linked_list_last_link", "GET-BASIC-DOUBLY-LINKED-LIST-LAST-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_doubly_linked_list_last_link", "SET-BASIC-DOUBLY-LINKED-LIST-LAST-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_doubly_linked_list_first_link", "GET-BASIC-DOUBLY-LINKED-LIST-FIRST-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_doubly_linked_list_first_link", "SET-BASIC-DOUBLY-LINKED-LIST-FIRST-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_doubly_linked_list_element_count", "GET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_doubly_linked_list_element_count", "SET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_doubly_linked_list_element_equality_predicate", "GET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUALITY-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_doubly_linked_list_element_equality_predicate", "SET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUALITY-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_swap_method", "BASIC-DOUBLY-LINKED-LIST-SWAP-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_empty_p_method", "BASIC-DOUBLY-LINKED-LIST-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_reverse_method", "BASIC-DOUBLY-LINKED-LIST-REVERSE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_append_method", "BASIC-DOUBLY-LINKED-LIST-APPEND-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_position_method", "BASIC-DOUBLY-LINKED-LIST-POSITION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_set_nth_method", "BASIC-DOUBLY-LINKED-LIST-SET-NTH-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_nth_method", "BASIC-DOUBLY-LINKED-LIST-NTH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_but_last_method", "BASIC-DOUBLY-LINKED-LIST-BUT-LAST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_pop_method", "BASIC-DOUBLY-LINKED-LIST-POP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_push_method", "BASIC-DOUBLY-LINKED-LIST-PUSH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_member_p_method", "BASIC-DOUBLY-LINKED-LIST-MEMBER-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_remove_method", "BASIC-DOUBLY-LINKED-LIST-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_add_method", "BASIC-DOUBLY-LINKED-LIST-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_clear_method", "BASIC-DOUBLY-LINKED-LIST-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_print_method", "BASIC-DOUBLY-LINKED-LIST-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_find_nth_link_method", "BASIC-DOUBLY-LINKED-LIST-FIND-NTH-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_find_link_method", "BASIC-DOUBLY-LINKED-LIST-FIND-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_reverse_link_method", "BASIC-DOUBLY-LINKED-LIST-REVERSE-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_delete_link_method", "BASIC-DOUBLY-LINKED-LIST-DELETE-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_set_contents_method", "BASIC-DOUBLY-LINKED-LIST-SET-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_get_contents_method", "BASIC-DOUBLY-LINKED-LIST-GET-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_element_equal_p_method", "BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUAL-P-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_doubly_linked_list_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_doubly_linked_list_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_p", "BASIC-DOUBLY-LINKED-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_get_element_equality_predicate_method", "BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_set_element_equality_predicate_method", "BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_set_element_count_method", "BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-COUNT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_inc_element_count_method", "BASIC-DOUBLY-LINKED-LIST-INC-ELEMENT-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_dec_element_count_method", "BASIC-DOUBLY-LINKED-LIST-DEC-ELEMENT-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_get_first_link_method", "BASIC-DOUBLY-LINKED-LIST-GET-FIRST-LINK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_set_first_link_method", "BASIC-DOUBLY-LINKED-LIST-SET-FIRST-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_get_last_link_method", "BASIC-DOUBLY-LINKED-LIST-GET-LAST-LINK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_set_last_link_method", "BASIC-DOUBLY-LINKED-LIST-SET-LAST-LINK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_get_element_count_method", "BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_doubly_linked_list_enumerator_direction", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_doubly_linked_list_enumerator_direction", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_doubly_linked_list_enumerator_current_link", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_doubly_linked_list_enumerator_current_link", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_doubly_linked_list_enumerator_last_link", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_doubly_linked_list_enumerator_last_link", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_doubly_linked_list_enumerator_first_link", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_doubly_linked_list_enumerator_first_link", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-LINK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_doubly_linked_list_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_doubly_linked_list_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_p", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_initialize_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_isolate_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-ISOLATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_set_initial_state_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-SET-INITIAL-STATE-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_empty_p_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_first_p_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_last_p_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_current_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_first_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_last_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_next_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_enumerator_previous_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_allocate_enumerator_method", "BASIC-DOUBLY-LINKED-LIST-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_doubly_linked_list_deallocate_enumerator_method", "BASIC-DOUBLY-LINKED-LIST-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "pair_template_p", "PAIR-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_pair_second_element", "GET-BASIC-PAIR-SECOND-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_pair_second_element", "SET-BASIC-PAIR-SECOND-ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_pair_first_element", "GET-BASIC-PAIR-FIRST-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_pair_first_element", "SET-BASIC-PAIR-FIRST-ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_pair_print_method", "BASIC-PAIR-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_pair_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_pair_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_pair_p", "BASIC-PAIR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_pair_initialize_method", "BASIC-PAIR-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_pair_get_first_method", "BASIC-PAIR-GET-FIRST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_pair_set_first_method", "BASIC-PAIR-SET-FIRST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_pair_get_second_method", "BASIC-PAIR-GET-SECOND-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_pair_set_second_method", "BASIC-PAIR-SET-SECOND-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "triplet_template_p", "TRIPLET-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_triplet_third_element", "GET-BASIC-TRIPLET-THIRD-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_triplet_third_element", "SET-BASIC-TRIPLET-THIRD-ELEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_triplet_print_method", "BASIC-TRIPLET-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_triplet_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_triplet_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_triplet_p", "BASIC-TRIPLET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_triplet_initialize_method", "BASIC-TRIPLET-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_triplet_get_third_method", "BASIC-TRIPLET-GET-THIRD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_triplet_set_third_method", "BASIC-TRIPLET-SET-THIRD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "generic_dllt_add_parent_link_function", "GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "generic_dllt_delete_parent_link_function", "GENERIC-DLLT-DELETE-PARENT-LINK-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "generic_dllt_delete_link_function", "GENERIC-DLLT-DELETE-LINK-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "generic_dllt_delete_self_from_collection_function", "GENERIC-DLLT-DELETE-SELF-FROM-COLLECTION-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_subloop_private_pair_class", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_subloop_private_pair_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_private_pair_p", "SUBLOOP-PRIVATE-PAIR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_private_pair_print_method", "SUBLOOP-PRIVATE-PAIR-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "bag_enumerator_template_p", "BAG-ENUMERATOR-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_collections_bag_enum_get_next", "SUBLOOP-COLLECTIONS-BAG-ENUM-GET-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_collections_get_previous_cons", "SUBLOOP-COLLECTIONS-GET-PREVIOUS-CONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_collections_backup_pointer", "SUBLOOP-COLLECTIONS-BACKUP-POINTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_bag_enumerator_direction", "GET-BASIC-BAG-ENUMERATOR-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_bag_enumerator_direction", "SET-BASIC-BAG-ENUMERATOR-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_bag_enumerator_contents", "GET-BASIC-BAG-ENUMERATOR-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_bag_enumerator_contents", "SET-BASIC-BAG-ENUMERATOR-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_bag_enumerator_contents_pointer", "GET-BASIC-BAG-ENUMERATOR-CONTENTS-POINTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_bag_enumerator_contents_pointer", "SET-BASIC-BAG-ENUMERATOR-CONTENTS-POINTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_previous_method", "BASIC-BAG-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_next_method", "BASIC-BAG-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_last_method", "BASIC-BAG-ENUMERATOR-LAST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_first_method", "BASIC-BAG-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_current_method", "BASIC-BAG-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_last_p_method", "BASIC-BAG-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_first_p_method", "BASIC-BAG-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_empty_p_method", "BASIC-BAG-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_bag_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_bag_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_p", "BASIC-BAG-ENUMERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_instantiate_method", "BASIC-BAG-ENUMERATOR-INSTANTIATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_get_contents_pointer_method", "BASIC-BAG-ENUMERATOR-GET-CONTENTS-POINTER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_set_contents_pointer_method", "BASIC-BAG-ENUMERATOR-SET-CONTENTS-POINTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_get_contents_method", "BASIC-BAG-ENUMERATOR-GET-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_set_contents_method", "BASIC-BAG-ENUMERATOR-SET-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_get_direction_method", "BASIC-BAG-ENUMERATOR-GET-DIRECTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_enumerator_set_direction_method", "BASIC-BAG-ENUMERATOR-SET-DIRECTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "bag_template_p", "BAG-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_collections_bag_template_translate_pair", "SUBLOOP-COLLECTIONS-BAG-TEMPLATE-TRANSLATE-PAIR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_basic_bag_bag_representation", "GET-BASIC-BAG-BAG-REPRESENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_basic_bag_bag_representation", "SET-BASIC-BAG-BAG-REPRESENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_empty_p_method", "BASIC-BAG-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_get_unique_element_count_method", "BASIC-BAG-GET-UNIQUE-ELEMENT-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_get_unique_elements_method", "BASIC-BAG-GET-UNIQUE-ELEMENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_occurences_method", "BASIC-BAG-OCCURENCES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_member_p_method", "BASIC-BAG-MEMBER-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_remove_method", "BASIC-BAG-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_add_method", "BASIC-BAG-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_set_contents_method", "BASIC-BAG-SET-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_get_contents_method", "BASIC-BAG-GET-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_get_element_count_method", "BASIC-BAG-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_print_method", "BASIC-BAG-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_bag_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_basic_bag_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_p", "BASIC-BAG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_initialize_method", "BASIC-BAG-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_get_internal_representation_method", "BASIC-BAG-GET-INTERNAL-REPRESENTATION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_set_internal_representation_method", "BASIC-BAG-SET-INTERNAL-REPRESENTATION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_allocate_enumerator_method", "BASIC-BAG-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "basic_bag_deallocate_enumerator_method", "BASIC-BAG-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "get_test_list_element_symbolic_name", "GET-TEST-LIST-ELEMENT-SYMBOLIC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "set_test_list_element_symbolic_name", "SET-TEST-LIST-ELEMENT-SYMBOLIC-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_test_list_element_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "subloop_reserved_initialize_test_list_element_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "test_list_element_p", "TEST-LIST-ELEMENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "test_list_element_initialize_method", "TEST-LIST-ELEMENT-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "test_list_element_get_symbolic_name_method", "TEST-LIST-ELEMENT-GET-SYMBOLIC-NAME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "test_list_element_set_symbolic_name_method", "TEST-LIST-ELEMENT-SET-SYMBOLIC-NAME-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "test_list_element_print_method", "TEST-LIST-ELEMENT-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "test_list_element_on_add_method", "TEST-LIST-ELEMENT-ON-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "test_list_element_on_delete_method", "TEST-LIST-ELEMENT-ON-DELETE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "intern_test_list_element", "INTERN-TEST-LIST-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "enumerator_template_empty_p", "ENUMERATOR-TEMPLATE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "enumerator_template_last_p", "ENUMERATOR-TEMPLATE-LAST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "enumerator_template_first", "ENUMERATOR-TEMPLATE-FIRST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "enumerator_template_next", "ENUMERATOR-TEMPLATE-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "enumerator_template_current", "ENUMERATOR-TEMPLATE-CURRENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "collection_template_empty_p", "COLLECTION-TEMPLATE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "doubly_linked_list_template_add", "DOUBLY-LINKED-LIST-TEMPLATE-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_collections", "doubly_linked_list_template_get_contents", "DOUBLY-LINKED-LIST-TEMPLATE-GET-CONTENTS", 1, 0, false);
        return (SubLObject)subloop_collections.NIL;
    }
    
    public static SubLObject init_subloop_collections_file() {
        subloop_collections.$valid_sequential_directions$ = SubLFiles.defconstant("*VALID-SEQUENTIAL-DIRECTIONS*", (SubLObject)subloop_collections.$list0);
        subloop_collections.$dtp_double_link_cell$ = SubLFiles.defconstant("*DTP-DOUBLE-LINK-CELL*", (SubLObject)subloop_collections.$sym249$DOUBLE_LINK_CELL);
        subloop_collections.$test_list_elements$ = SubLFiles.deflexical("*TEST-LIST-ELEMENTS*", (SubLObject)(maybeDefault((SubLObject)subloop_collections.$sym684$_TEST_LIST_ELEMENTS_, subloop_collections.$test_list_elements$, subloop_collections.NIL)));
        return (SubLObject)subloop_collections.NIL;
    }
    
    public static SubLObject setup_subloop_collections_file() {
        enumerations.enumerations_incorporate_definition((SubLObject)subloop_collections.$sym1$SEQUENTIAL_DIRECTION, (SubLObject)subloop_collections.$list0);
        interfaces.new_interface((SubLObject)subloop_collections.$sym8$ITERATOR_TEMPLATE, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list9);
        interfaces.new_interface((SubLObject)subloop_collections.$sym10$ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list11, (SubLObject)subloop_collections.$list12, (SubLObject)subloop_collections.$list13);
        interfaces.new_interface((SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list15, (SubLObject)subloop_collections.$list16, (SubLObject)subloop_collections.$list17);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list20);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym21$FIRST_P, (SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list22);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym23$LAST_P, (SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list24);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym25$CURRENT, (SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list26);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym27$FIRST, (SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list28);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym29$LAST, (SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list30);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym31$NEXT, (SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list32);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym33$PREVIOUS, (SubLObject)subloop_collections.$sym14$COLLECTION_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list34);
        interfaces.new_interface((SubLObject)subloop_collections.$sym35$PROTECTED_MEMBERSHIP_TEMPLATE, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list36);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$list39, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list40);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym33$PREVIOUS, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list34);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym33$PREVIOUS, (SubLObject)subloop_collections.$sym47$BASIC_COLLECTION_ENUMERATOR_PREVIOUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym31$NEXT, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list32);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym31$NEXT, (SubLObject)subloop_collections.$sym48$BASIC_COLLECTION_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym29$LAST, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list30);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym29$LAST, (SubLObject)subloop_collections.$sym49$BASIC_COLLECTION_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym27$FIRST, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list28);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym27$FIRST, (SubLObject)subloop_collections.$sym50$BASIC_COLLECTION_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym25$CURRENT, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list26);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym25$CURRENT, (SubLObject)subloop_collections.$sym51$BASIC_COLLECTION_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym23$LAST_P, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list24);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym23$LAST_P, (SubLObject)subloop_collections.$sym52$BASIC_COLLECTION_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym21$FIRST_P, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list22);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym21$FIRST_P, (SubLObject)subloop_collections.$sym53$BASIC_COLLECTION_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list20);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym54$BASIC_COLLECTION_ENUMERATOR_EMPTY_P_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym56$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym59$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_INSTANCE);
        subloop_reserved_initialize_basic_collection_enumerator_class((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list62);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym64$BASIC_COLLECTION_ENUMERATOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym65$STORE_COLLECTION_CONTENTS, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list66, (SubLObject)subloop_collections.$list67, (SubLObject)subloop_collections.$list68);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym65$STORE_COLLECTION_CONTENTS, (SubLObject)subloop_collections.$sym70$BASIC_COLLECTION_ENUMERATOR_STORE_COLLECTION_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym71$RETRIEVE_COLLECTION_CONTENTS, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list66, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list72);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym71$RETRIEVE_COLLECTION_CONTENTS, (SubLObject)subloop_collections.$sym74$BASIC_COLLECTION_ENUMERATOR_RETRIEVE_COLLECTION_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym75$SET_CONTENTS_POINTER, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list66, (SubLObject)subloop_collections.$list76, (SubLObject)subloop_collections.$list77);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym75$SET_CONTENTS_POINTER, (SubLObject)subloop_collections.$sym79$BASIC_COLLECTION_ENUMERATOR_SET_CONTENTS_POINTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym80$GET_CONTENTS_POINTER, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list66, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list81);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym80$GET_CONTENTS_POINTER, (SubLObject)subloop_collections.$sym83$BASIC_COLLECTION_ENUMERATOR_GET_CONTENTS_POINTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym84$GET_DIRECTION, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list66, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list85);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym84$GET_DIRECTION, (SubLObject)subloop_collections.$sym87$BASIC_COLLECTION_ENUMERATOR_GET_DIRECTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym88$SET_DIRECTION, (SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$list66, (SubLObject)subloop_collections.$list89, (SubLObject)subloop_collections.$list90);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym37$BASIC_COLLECTION_ENUMERATOR, (SubLObject)subloop_collections.$sym88$SET_DIRECTION, (SubLObject)subloop_collections.$sym93$BASIC_COLLECTION_ENUMERATOR_SET_DIRECTION_METHOD);
        interfaces.new_interface((SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list95);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list98);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym99$ELEMENT_EQUAL_P, (SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list100, (SubLObject)subloop_collections.$list101);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym102$GET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list103);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym104$CLEAR, (SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list105);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list108);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list110, (SubLObject)subloop_collections.$list111);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list114);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym94$COLLECTION_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list115);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$list117, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list118);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list115);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym121$BASIC_COLLECTION_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list114);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym122$BASIC_COLLECTION_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list110, (SubLObject)subloop_collections.$list111);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym123$BASIC_COLLECTION_REMOVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list108);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym124$BASIC_COLLECTION_ADD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym104$CLEAR, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list105);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym104$CLEAR, (SubLObject)subloop_collections.$sym125$BASIC_COLLECTION_CLEAR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym102$GET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list103);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym102$GET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym126$BASIC_COLLECTION_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list98);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym132$BASIC_COLLECTION_PRINT_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym133$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym134$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_INSTANCE);
        subloop_reserved_initialize_basic_collection_class((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list135);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym137$BASIC_COLLECTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym99$ELEMENT_EQUAL_P, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list100, (SubLObject)subloop_collections.$list138);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym99$ELEMENT_EQUAL_P, (SubLObject)subloop_collections.$sym142$BASIC_COLLECTION_ELEMENT_EQUAL_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym143$GET_ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list144);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym143$GET_ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.$sym146$BASIC_COLLECTION_GET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym147$SET_ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list148, (SubLObject)subloop_collections.$list149);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym147$SET_ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.$sym151$BASIC_COLLECTION_SET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list153);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym155$BASIC_COLLECTION_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list157, (SubLObject)subloop_collections.$list158);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym161$BASIC_COLLECTION_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym162$ALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list163);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym162$ALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym165$BASIC_COLLECTION_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym166$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list167, (SubLObject)subloop_collections.$list168);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$sym166$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym169$BASIC_COLLECTION_DEALLOCATE_ENUMERATOR_METHOD);
        interfaces.new_interface((SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list117, (SubLObject)subloop_collections.$list171, (SubLObject)subloop_collections.$list172);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list173);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym174$PUSH, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list175);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym176$POP, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list177);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym178$BUT_LAST, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list179);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym180$NTH, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list181, (SubLObject)subloop_collections.$list182);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym183$SET_NTH, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list184, (SubLObject)subloop_collections.$list185);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym186$POSITION, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list187);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym188$APPEND, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list189, (SubLObject)subloop_collections.$list190);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym191$REVERSE, (SubLObject)subloop_collections.$sym170$LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list192);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list194, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list195);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list115);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym196$BASIC_LIST_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym191$REVERSE, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list192);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym191$REVERSE, (SubLObject)subloop_collections.$sym197$BASIC_LIST_REVERSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym188$APPEND, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list189, (SubLObject)subloop_collections.$list190);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym188$APPEND, (SubLObject)subloop_collections.$sym199$BASIC_LIST_APPEND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym186$POSITION, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list187);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym186$POSITION, (SubLObject)subloop_collections.$sym200$BASIC_LIST_POSITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym183$SET_NTH, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list184, (SubLObject)subloop_collections.$list185);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym183$SET_NTH, (SubLObject)subloop_collections.$sym201$BASIC_LIST_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym180$NTH, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list181, (SubLObject)subloop_collections.$list182);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym180$NTH, (SubLObject)subloop_collections.$sym202$BASIC_LIST_NTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym178$BUT_LAST, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list179);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym178$BUT_LAST, (SubLObject)subloop_collections.$sym203$BASIC_LIST_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym176$POP, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list177);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym176$POP, (SubLObject)subloop_collections.$sym204$BASIC_LIST_POP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym174$PUSH, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list175);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym174$PUSH, (SubLObject)subloop_collections.$sym205$BASIC_LIST_PUSH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list173);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym208$BASIC_LIST_PRINT_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym209$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$sym210$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_INSTANCE);
        subloop_reserved_initialize_basic_list_class((SubLObject)subloop_collections.$sym193$BASIC_LIST);
        interfaces.new_interface((SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE, (SubLObject)subloop_collections.$list194, (SubLObject)subloop_collections.$list212, (SubLObject)subloop_collections.$list213);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym104$CLEAR, (SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list214);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list215);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list110, (SubLObject)subloop_collections.$list216);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym174$PUSH, (SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list217);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym176$POP, (SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list218);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym178$BUT_LAST, (SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list219);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym188$APPEND, (SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list189, (SubLObject)subloop_collections.$list220);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym191$REVERSE, (SubLObject)subloop_collections.$sym211$END_POINTER_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list221);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym193$BASIC_LIST, (SubLObject)subloop_collections.$list223, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list224);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list115);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym226$BASIC_END_POINTER_LIST_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym191$REVERSE, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list221);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym191$REVERSE, (SubLObject)subloop_collections.$sym227$BASIC_END_POINTER_LIST_REVERSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym188$APPEND, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list189, (SubLObject)subloop_collections.$list220);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym188$APPEND, (SubLObject)subloop_collections.$sym228$BASIC_END_POINTER_LIST_APPEND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym186$POSITION, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list187);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym186$POSITION, (SubLObject)subloop_collections.$sym229$BASIC_END_POINTER_LIST_POSITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym180$NTH, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list181, (SubLObject)subloop_collections.$list182);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym180$NTH, (SubLObject)subloop_collections.$sym230$BASIC_END_POINTER_LIST_NTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym178$BUT_LAST, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list219);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym178$BUT_LAST, (SubLObject)subloop_collections.$sym231$BASIC_END_POINTER_LIST_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym176$POP, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list218);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym176$POP, (SubLObject)subloop_collections.$sym232$BASIC_END_POINTER_LIST_POP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym174$PUSH, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list217);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym174$PUSH, (SubLObject)subloop_collections.$sym233$BASIC_END_POINTER_LIST_PUSH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list110, (SubLObject)subloop_collections.$list216);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym234$BASIC_END_POINTER_LIST_REMOVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list215);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym235$BASIC_END_POINTER_LIST_ADD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym104$CLEAR, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list214);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym104$CLEAR, (SubLObject)subloop_collections.$sym236$BASIC_END_POINTER_LIST_CLEAR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list173);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym237$BASIC_END_POINTER_LIST_PRINT_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym238$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym239$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_INSTANCE);
        subloop_reserved_initialize_basic_end_pointer_list_class((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym240$GET_END_POINTER, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list241);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym240$GET_END_POINTER, (SubLObject)subloop_collections.$sym243$BASIC_END_POINTER_LIST_GET_END_POINTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym244$SET_END_POINTER, (SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list245, (SubLObject)subloop_collections.$list246);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym222$BASIC_END_POINTER_LIST, (SubLObject)subloop_collections.$sym244$SET_END_POINTER, (SubLObject)subloop_collections.$sym248$BASIC_END_POINTER_LIST_SET_END_POINTER_METHOD);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_collections.$dtp_double_link_cell$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_collections.$sym256$DOUBLE_LINK_CELL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_collections.$list257);
        Structures.def_csetf((SubLObject)subloop_collections.$sym258$DLC_OWNER, (SubLObject)subloop_collections.$sym259$_CSETF_DLC_OWNER);
        Structures.def_csetf((SubLObject)subloop_collections.$sym260$DLC_CONTENTS, (SubLObject)subloop_collections.$sym261$_CSETF_DLC_CONTENTS);
        Structures.def_csetf((SubLObject)subloop_collections.$sym262$DLC_PREVIOUS, (SubLObject)subloop_collections.$sym263$_CSETF_DLC_PREVIOUS);
        Structures.def_csetf((SubLObject)subloop_collections.$sym264$DLC_NEXT, (SubLObject)subloop_collections.$sym265$_CSETF_DLC_NEXT);
        Equality.identity((SubLObject)subloop_collections.$sym249$DOUBLE_LINK_CELL);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_collections.$dtp_double_link_cell$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_collections.$sym275$VISIT_DEFSTRUCT_OBJECT_DOUBLE_LINK_CELL_METHOD));
        interfaces.new_interface((SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list280);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym281$ADD_PARENT_LINK, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list282, (SubLObject)subloop_collections.$list283);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym284$DELETE_PARENT_LINK, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list285, (SubLObject)subloop_collections.$list286);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym287$DELETE_SELF_FROM_COLLECTION, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list288, (SubLObject)subloop_collections.$list289);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym290$TRANSFER_SELF, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list291, (SubLObject)subloop_collections.$list292);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym293$DELETE_SELF_FROM_ALL_COLLECTIONS, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list294);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list288, (SubLObject)subloop_collections.$list295);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym296$GET_COLLECTIONS, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list297);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym298$ON_ADD, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list299, (SubLObject)subloop_collections.$list300);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym301$ON_DELETE, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list299, (SubLObject)subloop_collections.$list300);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym302$PERFORM_ACTION, (SubLObject)subloop_collections.$sym279$LIST_ELEMENT_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list303, (SubLObject)subloop_collections.$list304);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$list306, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list307);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym302$PERFORM_ACTION, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list303, (SubLObject)subloop_collections.$list304);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym302$PERFORM_ACTION, (SubLObject)subloop_collections.$sym311$BASIC_LIST_ELEMENT_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym301$ON_DELETE, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list299, (SubLObject)subloop_collections.$list300);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym301$ON_DELETE, (SubLObject)subloop_collections.$sym312$BASIC_LIST_ELEMENT_ON_DELETE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym298$ON_ADD, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list299, (SubLObject)subloop_collections.$list300);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym298$ON_ADD, (SubLObject)subloop_collections.$sym313$BASIC_LIST_ELEMENT_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym296$GET_COLLECTIONS, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list297);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym296$GET_COLLECTIONS, (SubLObject)subloop_collections.$sym314$BASIC_LIST_ELEMENT_GET_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list288, (SubLObject)subloop_collections.$list295);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym315$BASIC_LIST_ELEMENT_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym293$DELETE_SELF_FROM_ALL_COLLECTIONS, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list294);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym293$DELETE_SELF_FROM_ALL_COLLECTIONS, (SubLObject)subloop_collections.$sym316$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym290$TRANSFER_SELF, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list291, (SubLObject)subloop_collections.$list292);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym290$TRANSFER_SELF, (SubLObject)subloop_collections.$sym318$BASIC_LIST_ELEMENT_TRANSFER_SELF_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym287$DELETE_SELF_FROM_COLLECTION, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list288, (SubLObject)subloop_collections.$list289);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym287$DELETE_SELF_FROM_COLLECTION, (SubLObject)subloop_collections.$sym319$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_COLLECTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym284$DELETE_PARENT_LINK, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list285, (SubLObject)subloop_collections.$list286);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym284$DELETE_PARENT_LINK, (SubLObject)subloop_collections.$sym320$BASIC_LIST_ELEMENT_DELETE_PARENT_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym281$ADD_PARENT_LINK, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list282, (SubLObject)subloop_collections.$list283);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym281$ADD_PARENT_LINK, (SubLObject)subloop_collections.$sym321$BASIC_LIST_ELEMENT_ADD_PARENT_LINK_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym322$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym323$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_INSTANCE);
        subloop_reserved_initialize_basic_list_element_class((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list324);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym326$BASIC_LIST_ELEMENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym327$GET_PARENT_LINKS, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list328);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym327$GET_PARENT_LINKS, (SubLObject)subloop_collections.$sym330$BASIC_LIST_ELEMENT_GET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym331$SET_PARENT_LINKS, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list332, (SubLObject)subloop_collections.$list333);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym331$SET_PARENT_LINKS, (SubLObject)subloop_collections.$sym335$BASIC_LIST_ELEMENT_SET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym336$GET_SELF_DELETION_MODE, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list337);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym336$GET_SELF_DELETION_MODE, (SubLObject)subloop_collections.$sym339$BASIC_LIST_ELEMENT_GET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym340$SET_SELF_DELETION_MODE, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list341, (SubLObject)subloop_collections.$list342);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.$sym340$SET_SELF_DELETION_MODE, (SubLObject)subloop_collections.$sym344$BASIC_LIST_ELEMENT_SET_SELF_DELETION_MODE_METHOD);
        interfaces.new_interface((SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list194, (SubLObject)subloop_collections.$list212, (SubLObject)subloop_collections.$list346);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym347$DELETE_LINK, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list348, (SubLObject)subloop_collections.$list349);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym350$REVERSE_LINK, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list348, (SubLObject)subloop_collections.$list351);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym352$FIND_LINK, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list353);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym354$FIND_NTH_LINK, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list181, (SubLObject)subloop_collections.$list355);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list356);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list157, (SubLObject)subloop_collections.$list357);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list358);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym104$CLEAR, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list359);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list360);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list110, (SubLObject)subloop_collections.$list361);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list362);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym174$PUSH, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list363);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym176$POP, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list364);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym178$BUT_LAST, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list365);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym180$NTH, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list181, (SubLObject)subloop_collections.$list366);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym183$SET_NTH, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list184, (SubLObject)subloop_collections.$list367);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym186$POSITION, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list368);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym188$APPEND, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list189, (SubLObject)subloop_collections.$list369);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym191$REVERSE, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list370);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list371);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym372$SWAP, (SubLObject)subloop_collections.$sym345$DOUBLY_LINKED_LIST_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list100, (SubLObject)subloop_collections.$list373);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$list375, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list376);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym372$SWAP, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list100, (SubLObject)subloop_collections.$list373);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym372$SWAP, (SubLObject)subloop_collections.$sym382$BASIC_DOUBLY_LINKED_LIST_SWAP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list371);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym383$BASIC_DOUBLY_LINKED_LIST_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym191$REVERSE, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list370);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym191$REVERSE, (SubLObject)subloop_collections.$sym384$BASIC_DOUBLY_LINKED_LIST_REVERSE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym188$APPEND, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list189, (SubLObject)subloop_collections.$list369);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym188$APPEND, (SubLObject)subloop_collections.$sym386$BASIC_DOUBLY_LINKED_LIST_APPEND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym186$POSITION, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list368);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym186$POSITION, (SubLObject)subloop_collections.$sym387$BASIC_DOUBLY_LINKED_LIST_POSITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym183$SET_NTH, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list184, (SubLObject)subloop_collections.$list367);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym183$SET_NTH, (SubLObject)subloop_collections.$sym388$BASIC_DOUBLY_LINKED_LIST_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym180$NTH, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list181, (SubLObject)subloop_collections.$list366);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym180$NTH, (SubLObject)subloop_collections.$sym389$BASIC_DOUBLY_LINKED_LIST_NTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym178$BUT_LAST, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list365);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym178$BUT_LAST, (SubLObject)subloop_collections.$sym390$BASIC_DOUBLY_LINKED_LIST_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym176$POP, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list364);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym176$POP, (SubLObject)subloop_collections.$sym391$BASIC_DOUBLY_LINKED_LIST_POP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym174$PUSH, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list363);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym174$PUSH, (SubLObject)subloop_collections.$sym392$BASIC_DOUBLY_LINKED_LIST_PUSH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list362);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym393$BASIC_DOUBLY_LINKED_LIST_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list110, (SubLObject)subloop_collections.$list361);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym394$BASIC_DOUBLY_LINKED_LIST_REMOVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list360);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym395$BASIC_DOUBLY_LINKED_LIST_ADD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym104$CLEAR, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list359);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym104$CLEAR, (SubLObject)subloop_collections.$sym396$BASIC_DOUBLY_LINKED_LIST_CLEAR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list358);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym399$BASIC_DOUBLY_LINKED_LIST_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym354$FIND_NTH_LINK, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list181, (SubLObject)subloop_collections.$list355);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym354$FIND_NTH_LINK, (SubLObject)subloop_collections.$sym400$BASIC_DOUBLY_LINKED_LIST_FIND_NTH_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym352$FIND_LINK, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list353);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym352$FIND_LINK, (SubLObject)subloop_collections.$sym401$BASIC_DOUBLY_LINKED_LIST_FIND_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym350$REVERSE_LINK, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list348, (SubLObject)subloop_collections.$list351);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym350$REVERSE_LINK, (SubLObject)subloop_collections.$sym402$BASIC_DOUBLY_LINKED_LIST_REVERSE_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym347$DELETE_LINK, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list348, (SubLObject)subloop_collections.$list349);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym347$DELETE_LINK, (SubLObject)subloop_collections.$sym406$BASIC_DOUBLY_LINKED_LIST_DELETE_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list157, (SubLObject)subloop_collections.$list357);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym408$BASIC_DOUBLY_LINKED_LIST_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list356);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym409$BASIC_DOUBLY_LINKED_LIST_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym99$ELEMENT_EQUAL_P, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list100, (SubLObject)subloop_collections.$list101);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym99$ELEMENT_EQUAL_P, (SubLObject)subloop_collections.$sym410$BASIC_DOUBLY_LINKED_LIST_ELEMENT_EQUAL_P_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym411$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym412$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_INSTANCE);
        subloop_reserved_initialize_basic_doubly_linked_list_class((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym143$GET_ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list144);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym143$GET_ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.$sym414$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym147$SET_ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list148, (SubLObject)subloop_collections.$list149);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym147$SET_ELEMENT_EQUALITY_PREDICATE, (SubLObject)subloop_collections.$sym416$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym417$SET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list418, (SubLObject)subloop_collections.$list419);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym417$SET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym422$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym423$INC_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list424);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym423$INC_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym426$BASIC_DOUBLY_LINKED_LIST_INC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym427$DEC_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list428);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym427$DEC_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym430$BASIC_DOUBLY_LINKED_LIST_DEC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym431$GET_FIRST_LINK, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list432);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym431$GET_FIRST_LINK, (SubLObject)subloop_collections.$sym434$BASIC_DOUBLY_LINKED_LIST_GET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym435$SET_FIRST_LINK, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list436, (SubLObject)subloop_collections.$list437);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym435$SET_FIRST_LINK, (SubLObject)subloop_collections.$sym440$BASIC_DOUBLY_LINKED_LIST_SET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym441$GET_LAST_LINK, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list442);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym441$GET_LAST_LINK, (SubLObject)subloop_collections.$sym444$BASIC_DOUBLY_LINKED_LIST_GET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym445$SET_LAST_LINK, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list446, (SubLObject)subloop_collections.$list447);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym445$SET_LAST_LINK, (SubLObject)subloop_collections.$sym450$BASIC_DOUBLY_LINKED_LIST_SET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym102$GET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list451);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym102$GET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym453$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_COUNT_METHOD);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$list39, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list455);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym457$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_C);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym458$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_I);
        subloop_reserved_initialize_basic_doubly_linked_list_enumerator_class((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list459);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym461$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym462$ISOLATE, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list463);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym462$ISOLATE, (SubLObject)subloop_collections.$sym465$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym466$SET_INITIAL_STATE, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list467, (SubLObject)subloop_collections.$list468);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym466$SET_INITIAL_STATE, (SubLObject)subloop_collections.$sym470$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list471);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym473$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym21$FIRST_P, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list474);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym21$FIRST_P, (SubLObject)subloop_collections.$sym476$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym23$LAST_P, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list477);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym23$LAST_P, (SubLObject)subloop_collections.$sym479$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym25$CURRENT, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list480);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym25$CURRENT, (SubLObject)subloop_collections.$sym482$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym27$FIRST, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list483, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list484);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym27$FIRST, (SubLObject)subloop_collections.$sym485$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym29$LAST, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list483, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list486);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym29$LAST, (SubLObject)subloop_collections.$sym487$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym31$NEXT, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list483, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list488);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym31$NEXT, (SubLObject)subloop_collections.$sym489$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym33$PREVIOUS, (SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$list483, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list490);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, (SubLObject)subloop_collections.$sym33$PREVIOUS, (SubLObject)subloop_collections.$sym491$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_PREVIOUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym162$ALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list492);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym162$ALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym494$BASIC_DOUBLY_LINKED_LIST_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym166$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list167, (SubLObject)subloop_collections.$list495);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym374$BASIC_DOUBLY_LINKED_LIST, (SubLObject)subloop_collections.$sym166$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym496$BASIC_DOUBLY_LINKED_LIST_DEALLOCATE_ENUMERATOR_METHOD);
        interfaces.new_interface((SubLObject)subloop_collections.$sym497$PAIR_TEMPLATE, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list498);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym497$PAIR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list499);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$list501, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list502);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list499);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym506$BASIC_PAIR_PRINT_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym507$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym508$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_INSTANCE);
        subloop_reserved_initialize_basic_pair_class((SubLObject)subloop_collections.$sym500$BASIC_PAIR);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list509);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym511$BASIC_PAIR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym512$GET_FIRST, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list513);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym512$GET_FIRST, (SubLObject)subloop_collections.$sym515$BASIC_PAIR_GET_FIRST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym516$SET_FIRST, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list517, (SubLObject)subloop_collections.$list518);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym516$SET_FIRST, (SubLObject)subloop_collections.$sym520$BASIC_PAIR_SET_FIRST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym521$GET_SECOND, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list522);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym521$GET_SECOND, (SubLObject)subloop_collections.$sym524$BASIC_PAIR_GET_SECOND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym525$SET_SECOND, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list526, (SubLObject)subloop_collections.$list527);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$sym525$SET_SECOND, (SubLObject)subloop_collections.$sym529$BASIC_PAIR_SET_SECOND_METHOD);
        interfaces.new_interface((SubLObject)subloop_collections.$sym530$TRIPLET_TEMPLATE, (SubLObject)subloop_collections.$list501, (SubLObject)subloop_collections.$list531, (SubLObject)subloop_collections.$list532);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym530$TRIPLET_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list533);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.$list535, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list536);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list533);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym539$BASIC_TRIPLET_PRINT_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$sym540$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$sym541$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_INSTANCE);
        subloop_reserved_initialize_basic_triplet_class((SubLObject)subloop_collections.$sym534$BASIC_TRIPLET);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list542);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym544$BASIC_TRIPLET_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym545$GET_THIRD, (SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list546);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$sym545$GET_THIRD, (SubLObject)subloop_collections.$sym548$BASIC_TRIPLET_GET_THIRD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym549$SET_THIRD, (SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list550, (SubLObject)subloop_collections.$list551);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym534$BASIC_TRIPLET, (SubLObject)subloop_collections.$sym549$SET_THIRD, (SubLObject)subloop_collections.$sym553$BASIC_TRIPLET_SET_THIRD_METHOD);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR, (SubLObject)subloop_collections.$sym500$BASIC_PAIR, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list555);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR, (SubLObject)subloop_collections.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR, (SubLObject)subloop_collections.$sym556$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR, (SubLObject)subloop_collections.$sym557$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_INSTANCE);
        subloop_reserved_initialize_subloop_private_pair_class((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list558);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym554$SUBLOOP_PRIVATE_PAIR, (SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym560$SUBLOOP_PRIVATE_PAIR_PRINT_METHOD);
        interfaces.new_interface((SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list15, (SubLObject)subloop_collections.$list16, (SubLObject)subloop_collections.$list562);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list563);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym21$FIRST_P, (SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list564);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym23$LAST_P, (SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list565);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym25$CURRENT, (SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list566);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym27$FIRST, (SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list567);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym29$LAST, (SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list568);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym31$NEXT, (SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list569);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym33$PREVIOUS, (SubLObject)subloop_collections.$sym561$BAG_ENUMERATOR_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list570);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym38$OBJECT, (SubLObject)subloop_collections.$list572, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list573);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym33$PREVIOUS, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list570);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym33$PREVIOUS, (SubLObject)subloop_collections.$sym574$BASIC_BAG_ENUMERATOR_PREVIOUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym31$NEXT, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list569);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym31$NEXT, (SubLObject)subloop_collections.$sym575$BASIC_BAG_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym29$LAST, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list568);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym29$LAST, (SubLObject)subloop_collections.$sym576$BASIC_BAG_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym27$FIRST, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list567);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym27$FIRST, (SubLObject)subloop_collections.$sym577$BASIC_BAG_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym25$CURRENT, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list566);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym25$CURRENT, (SubLObject)subloop_collections.$sym578$BASIC_BAG_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym23$LAST_P, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list565);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym23$LAST_P, (SubLObject)subloop_collections.$sym579$BASIC_BAG_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym21$FIRST_P, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list564);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym21$FIRST_P, (SubLObject)subloop_collections.$sym580$BASIC_BAG_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list563);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym581$BASIC_BAG_ENUMERATOR_EMPTY_P_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym582$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym583$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_INSTANCE);
        subloop_reserved_initialize_basic_bag_enumerator_class((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym584$INSTANTIATE, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list585);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym584$INSTANTIATE, (SubLObject)subloop_collections.$sym587$BASIC_BAG_ENUMERATOR_INSTANTIATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym80$GET_CONTENTS_POINTER, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list81);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym80$GET_CONTENTS_POINTER, (SubLObject)subloop_collections.$sym589$BASIC_BAG_ENUMERATOR_GET_CONTENTS_POINTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym75$SET_CONTENTS_POINTER, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list590, (SubLObject)subloop_collections.$list591);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym75$SET_CONTENTS_POINTER, (SubLObject)subloop_collections.$sym594$BASIC_BAG_ENUMERATOR_SET_CONTENTS_POINTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list153);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym596$BASIC_BAG_ENUMERATOR_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list157, (SubLObject)subloop_collections.$list597);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym600$BASIC_BAG_ENUMERATOR_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym84$GET_DIRECTION, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list85);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym84$GET_DIRECTION, (SubLObject)subloop_collections.$sym602$BASIC_BAG_ENUMERATOR_GET_DIRECTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym88$SET_DIRECTION, (SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list89, (SubLObject)subloop_collections.$list603);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym571$BASIC_BAG_ENUMERATOR, (SubLObject)subloop_collections.$sym88$SET_DIRECTION, (SubLObject)subloop_collections.$sym606$BASIC_BAG_ENUMERATOR_SET_DIRECTION_METHOD);
        interfaces.new_interface((SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list117, (SubLObject)subloop_collections.$list171, (SubLObject)subloop_collections.$list608);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list609);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym102$GET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list610);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list611);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list157, (SubLObject)subloop_collections.$list612);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list613);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list110, (SubLObject)subloop_collections.$list614);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list615);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym616$OCCURENCES, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list617);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym618$GET_UNIQUE_ELEMENTS, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list619);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym620$GET_UNIQUE_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list621);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym607$BAG_TEMPLATE, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list622);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym116$BASIC_COLLECTION, (SubLObject)subloop_collections.$list624, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list625);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list622);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym18$EMPTY_P, (SubLObject)subloop_collections.$sym627$BASIC_BAG_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym620$GET_UNIQUE_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list621);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym620$GET_UNIQUE_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym628$BASIC_BAG_GET_UNIQUE_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym618$GET_UNIQUE_ELEMENTS, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list619);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym618$GET_UNIQUE_ELEMENTS, (SubLObject)subloop_collections.$sym629$BASIC_BAG_GET_UNIQUE_ELEMENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym616$OCCURENCES, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list617);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym616$OCCURENCES, (SubLObject)subloop_collections.$sym630$BASIC_BAG_OCCURENCES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list113, (SubLObject)subloop_collections.$list615);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym112$MEMBER_P, (SubLObject)subloop_collections.$sym631$BASIC_BAG_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list110, (SubLObject)subloop_collections.$list614);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym109$REMOVE, (SubLObject)subloop_collections.$sym632$BASIC_BAG_REMOVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list107, (SubLObject)subloop_collections.$list613);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym106$ADD, (SubLObject)subloop_collections.$sym633$BASIC_BAG_ADD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list157, (SubLObject)subloop_collections.$list612);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym156$SET_CONTENTS, (SubLObject)subloop_collections.$sym634$BASIC_BAG_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list611);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym152$GET_CONTENTS, (SubLObject)subloop_collections.$sym635$BASIC_BAG_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym102$GET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list610);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym102$GET_ELEMENT_COUNT, (SubLObject)subloop_collections.$sym636$BASIC_BAG_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list609);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym639$BASIC_BAG_PRINT_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym640$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym641$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_INSTANCE);
        subloop_reserved_initialize_basic_bag_class((SubLObject)subloop_collections.$sym623$BASIC_BAG);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list642);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym644$BASIC_BAG_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym645$GET_INTERNAL_REPRESENTATION, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list646);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym645$GET_INTERNAL_REPRESENTATION, (SubLObject)subloop_collections.$sym648$BASIC_BAG_GET_INTERNAL_REPRESENTATION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym649$SET_INTERNAL_REPRESENTATION, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.$list650, (SubLObject)subloop_collections.$list651);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym649$SET_INTERNAL_REPRESENTATION, (SubLObject)subloop_collections.$sym654$BASIC_BAG_SET_INTERNAL_REPRESENTATION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym162$ALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list655);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym162$ALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym657$BASIC_BAG_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym166$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list167, (SubLObject)subloop_collections.$list658);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym623$BASIC_BAG, (SubLObject)subloop_collections.$sym166$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_collections.$sym660$BASIC_BAG_DEALLOCATE_ENUMERATOR_METHOD);
        classes.subloop_new_class((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym305$BASIC_LIST_ELEMENT, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list662);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym664$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym665$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_INSTANCE);
        subloop_reserved_initialize_test_list_element_class((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$list61, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list666);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym60$INITIALIZE, (SubLObject)subloop_collections.$sym668$TEST_LIST_ELEMENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym669$GET_SYMBOLIC_NAME, (SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.NIL, (SubLObject)subloop_collections.$list670);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym669$GET_SYMBOLIC_NAME, (SubLObject)subloop_collections.$sym672$TEST_LIST_ELEMENT_GET_SYMBOLIC_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym673$SET_SYMBOLIC_NAME, (SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list674, (SubLObject)subloop_collections.$list675);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym673$SET_SYMBOLIC_NAME, (SubLObject)subloop_collections.$sym677$TEST_LIST_ELEMENT_SET_SYMBOLIC_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list97, (SubLObject)subloop_collections.$list678);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym96$PRINT, (SubLObject)subloop_collections.$sym681$TEST_LIST_ELEMENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym298$ON_ADD, (SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list299, (SubLObject)subloop_collections.$list300);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym298$ON_ADD, (SubLObject)subloop_collections.$sym682$TEST_LIST_ELEMENT_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_collections.$sym301$ON_DELETE, (SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$list19, (SubLObject)subloop_collections.$list299, (SubLObject)subloop_collections.$list300);
        methods.subloop_register_instance_method((SubLObject)subloop_collections.$sym661$TEST_LIST_ELEMENT, (SubLObject)subloop_collections.$sym301$ON_DELETE, (SubLObject)subloop_collections.$sym683$TEST_LIST_ELEMENT_ON_DELETE_METHOD);
        subl_macro_promotions.declare_defglobal((SubLObject)subloop_collections.$sym684$_TEST_LIST_ELEMENTS_);
        return (SubLObject)subloop_collections.NIL;
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
    
    static {
        me = (SubLFile)new subloop_collections();
        subloop_collections.$valid_sequential_directions$ = null;
        subloop_collections.$dtp_double_link_cell$ = null;
        subloop_collections.$test_list_elements$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS"), (SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS"));
        $sym1$SEQUENTIAL_DIRECTION = SubLObjectFactory.makeSymbol("SEQUENTIAL-DIRECTION");
        $str2$_S___S_is_not_a_member_of_the__S_ = SubLObjectFactory.makeString("~S: ~S is not a member of the ~S enumeration.");
        $sym3$ENCODE_SEQUENTIAL_DIRECTION = SubLObjectFactory.makeSymbol("ENCODE-SEQUENTIAL-DIRECTION");
        $str4$_S___S_is_not_a_valid_encoding_of = SubLObjectFactory.makeString("~S: ~S is not a valid encoding of the ~S enumeration.");
        $sym5$DECODE_SEQUENTIAL_DIRECTION = SubLObjectFactory.makeSymbol("DECODE-SEQUENTIAL-DIRECTION");
        $str6$_S___S_was_expected_to_be_a_membe = SubLObjectFactory.makeString("~S: ~S was expected to be a member of the enumeration ~S.");
        $sym7$SEQUENTIAL_DIRECTION_P = SubLObjectFactory.makeSymbol("SEQUENTIAL-DIRECTION-P");
        $sym8$ITERATOR_TEMPLATE = SubLObjectFactory.makeSymbol("ITERATOR-TEMPLATE");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym10$ENUMERATOR_TEMPLATE = SubLObjectFactory.makeSymbol("ENUMERATOR-TEMPLATE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATOR-TEMPLATE"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATOR-TEMPLATE")));
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym14$COLLECTION_ENUMERATOR_TEMPLATE = SubLObjectFactory.makeSymbol("COLLECTION-ENUMERATOR-TEMPLATE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR-TEMPLATE"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR-TEMPLATE")));
        $list17 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STORE-COLLECTION-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTION"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym18$EMPTY_P = SubLObjectFactory.makeSymbol("EMPTY-P");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym21$FIRST_P = SubLObjectFactory.makeSymbol("FIRST-P");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))));
        $sym23$LAST_P = SubLObjectFactory.makeSymbol("LAST-P");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.T)))));
        $sym25$CURRENT = SubLObjectFactory.makeSymbol("CURRENT");
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)))));
        $sym27$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym29$LAST = SubLObjectFactory.makeSymbol("LAST");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))));
        $sym31$NEXT = SubLObjectFactory.makeSymbol("NEXT");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))))));
        $sym33$PREVIOUS = SubLObjectFactory.makeSymbol("PREVIOUS");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COLLECTION-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COLLECTION-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COLLECTION-CONTENTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOSUBLISTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COLLECTION-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL));
        $sym35$PROTECTED_MEMBERSHIP_TEMPLATE = SubLObjectFactory.makeSymbol("PROTECTED-MEMBERSHIP-TEMPLATE");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ACCEPTABLE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym37$BASIC_COLLECTION_ENUMERATOR = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR");
        $sym38$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-ENUMERATOR-TEMPLATE"));
        $list40 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STORE-COLLECTION-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("FILE-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("FILE-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("FILE-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("FILE-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTION"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("FILE-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")), (SubLObject)SubLObjectFactory.makeKeyword("FILE-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym41$DIRECTION = SubLObjectFactory.makeSymbol("DIRECTION");
        $sym42$CONTENTS_POINTER = SubLObjectFactory.makeSymbol("CONTENTS-POINTER");
        $sym43$COLLECTION_CONTENTS = SubLObjectFactory.makeSymbol("COLLECTION-CONTENTS");
        $kw44$FORWARDS = SubLObjectFactory.makeKeyword("FORWARDS");
        $kw45$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw46$BACKWARDS = SubLObjectFactory.makeKeyword("BACKWARDS");
        $sym47$BASIC_COLLECTION_ENUMERATOR_PREVIOUS_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-PREVIOUS-METHOD");
        $sym48$BASIC_COLLECTION_ENUMERATOR_NEXT_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-NEXT-METHOD");
        $sym49$BASIC_COLLECTION_ENUMERATOR_LAST_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-LAST-METHOD");
        $sym50$BASIC_COLLECTION_ENUMERATOR_FIRST_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-FIRST-METHOD");
        $sym51$BASIC_COLLECTION_ENUMERATOR_CURRENT_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-CURRENT-METHOD");
        $sym52$BASIC_COLLECTION_ENUMERATOR_LAST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-LAST-P-METHOD");
        $sym53$BASIC_COLLECTION_ENUMERATOR_FIRST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-FIRST-P-METHOD");
        $sym54$BASIC_COLLECTION_ENUMERATOR_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-EMPTY-P-METHOD");
        $sym55$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym56$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-CLASS");
        $sym57$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym58$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym59$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-INSTANCE");
        $sym60$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-CONTENTS"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");
        $sym64$BASIC_COLLECTION_ENUMERATOR_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-INITIALIZE-METHOD");
        $sym65$STORE_COLLECTION_CONTENTS = SubLObjectFactory.makeSymbol("STORE-COLLECTION-CONTENTS");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILE-SCOPE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION-CONTENTS"));
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION-CONTENTS")));
        $sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");
        $sym70$BASIC_COLLECTION_ENUMERATOR_STORE_COLLECTION_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-STORE-COLLECTION-CONTENTS-METHOD");
        $sym71$RETRIEVE_COLLECTION_CONTENTS = SubLObjectFactory.makeSymbol("RETRIEVE-COLLECTION-CONTENTS");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-CONTENTS")));
        $sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");
        $sym74$BASIC_COLLECTION_ENUMERATOR_RETRIEVE_COLLECTION_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-RETRIEVE-COLLECTION-CONTENTS-METHOD");
        $sym75$SET_CONTENTS_POINTER = SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCONTENTS"));
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCONTENTS")));
        $sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");
        $sym79$BASIC_COLLECTION_ENUMERATOR_SET_CONTENTS_POINTER_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-SET-CONTENTS-POINTER-METHOD");
        $sym80$GET_CONTENTS_POINTER = SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER");
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-POINTER")));
        $sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");
        $sym83$BASIC_COLLECTION_ENUMERATOR_GET_CONTENTS_POINTER_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-GET-CONTENTS-POINTER-METHOD");
        $sym84$GET_DIRECTION = SubLObjectFactory.makeSymbol("GET-DIRECTION");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION")));
        $sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");
        $sym87$BASIC_COLLECTION_ENUMERATOR_GET_DIRECTION_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-GET-DIRECTION-METHOD");
        $sym88$SET_DIRECTION = SubLObjectFactory.makeSymbol("SET-DIRECTION");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION"));
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENTIAL-DIRECTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")), (SubLObject)SubLObjectFactory.makeString("(SET-DIRECTION ~S): ~S is not a valid direction.  A direction must be one of: ~S."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATE-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENTIAL-DIRECTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")));
        $sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD");
        $str92$_SET_DIRECTION__S____S_is_not_a_v = SubLObjectFactory.makeString("(SET-DIRECTION ~S): ~S is not a valid direction.  A direction must be one of: ~S.");
        $sym93$BASIC_COLLECTION_ENUMERATOR_SET_DIRECTION_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR-SET-DIRECTION-METHOD");
        $sym94$COLLECTION_TEMPLATE = SubLObjectFactory.makeSymbol("COLLECTION-TEMPLATE");
        $list95 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym96$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("[]"))), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("[~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString(", ~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("]")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym99$ELEMENT_EQUAL_P = SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2"));
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2"))));
        $sym102$GET_ELEMENT_COUNT = SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT");
        $list103 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym104$CLEAR = SubLObjectFactory.makeSymbol("CLEAR");
        $list105 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL));
        $sym106$ADD = SubLObjectFactory.makeSymbol("ADD");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"));
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")));
        $sym109$REMOVE = SubLObjectFactory.makeSymbol("REMOVE");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"));
        $list111 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")));
        $sym112$MEMBER_P = SubLObjectFactory.makeSymbol("MEMBER-P");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"));
        $list114 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)subloop_collections.T, (SubLObject)subloop_collections.NIL)));
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym116$BASIC_COLLECTION = SubLObjectFactory.makeSymbol("BASIC-COLLECTION");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-TEMPLATE"));
        $list118 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUALITY-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym119$ELEMENT_EQUALITY_PREDICATE = SubLObjectFactory.makeSymbol("ELEMENT-EQUALITY-PREDICATE");
        $sym120$CONTENTS = SubLObjectFactory.makeSymbol("CONTENTS");
        $sym121$BASIC_COLLECTION_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-EMPTY-P-METHOD");
        $sym122$BASIC_COLLECTION_MEMBER_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-MEMBER-P-METHOD");
        $sym123$BASIC_COLLECTION_REMOVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-REMOVE-METHOD");
        $sym124$BASIC_COLLECTION_ADD_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ADD-METHOD");
        $sym125$BASIC_COLLECTION_CLEAR_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-CLEAR-METHOD");
        $sym126$BASIC_COLLECTION_GET_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-GET-ELEMENT-COUNT-METHOD");
        $str127$___S_Class_is_not_correctly_imple = SubLObjectFactory.makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");
        $str128$__ = SubLObjectFactory.makeString("[]");
        $str129$__S = SubLObjectFactory.makeString("[~S");
        $str130$___S = SubLObjectFactory.makeString(", ~S");
        $str131$_ = SubLObjectFactory.makeString("]");
        $sym132$BASIC_COLLECTION_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-PRINT-METHOD");
        $sym133$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-CLASS");
        $sym134$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-INSTANCE");
        $list135 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUALITY-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)subloop_collections.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");
        $sym137$BASIC_COLLECTION_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-INITIALIZE-METHOD");
        $list138 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FAST-FUNCALL-SETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUALITY-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQUAL, (SubLObject)subloop_collections.EQ, (SubLObject)subloop_collections.EQL, (SubLObject)subloop_collections.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("STRING-EQUAL"), (SubLObject)SubLObjectFactory.makeSymbol("CHAR=")), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");
        $sym140$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $sym141$CHAR_ = SubLObjectFactory.makeSymbol("CHAR=");
        $sym142$BASIC_COLLECTION_ELEMENT_EQUAL_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ELEMENT-EQUAL-P-METHOD");
        $sym143$GET_ELEMENT_EQUALITY_PREDICATE = SubLObjectFactory.makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE");
        $list144 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUALITY-PREDICATE")));
        $sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");
        $sym146$BASIC_COLLECTION_GET_ELEMENT_EQUALITY_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-GET-ELEMENT-EQUALITY-PREDICATE-METHOD");
        $sym147$SET_ELEMENT_EQUALITY_PREDICATE = SubLObjectFactory.makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE");
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE"));
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUALITY-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE")));
        $sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");
        $sym151$BASIC_COLLECTION_SET_ELEMENT_EQUALITY_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-SET-ELEMENT-EQUALITY-PREDICATE-METHOD");
        $sym152$GET_CONTENTS = SubLObjectFactory.makeSymbol("GET-CONTENTS");
        $list153 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS")));
        $sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");
        $sym155$BASIC_COLLECTION_GET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-GET-CONTENTS-METHOD");
        $sym156$SET_CONTENTS = SubLObjectFactory.makeSymbol("SET-CONTENTS");
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS"));
        $list158 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeString("(SET-CONTENTS ~S): ~S is not a valid list."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")));
        $sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");
        $str160$_SET_CONTENTS__S____S_is_not_a_va = SubLObjectFactory.makeString("(SET-CONTENTS ~S): ~S is not a valid list.");
        $sym161$BASIC_COLLECTION_SET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-SET-CONTENTS-METHOD");
        $sym162$ALLOCATE_ENUMERATOR = SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR");
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"))));
        $sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD");
        $sym165$BASIC_COLLECTION_ALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ALLOCATE-ENUMERATOR-METHOD");
        $sym166$DEALLOCATE_ENUMERATOR = SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"));
        $list168 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE-COLLECTION-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-COLLECTION-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL));
        $sym169$BASIC_COLLECTION_DEALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-COLLECTION-DEALLOCATE-ENUMERATOR-METHOD");
        $sym170$LIST_TEMPLATE = SubLObjectFactory.makeSymbol("LIST-TEMPLATE");
        $list171 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-TEMPLATE")));
        $list172 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POP"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BUT-LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $list173 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("LIST:[]"))), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("LIST:[~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString(", ~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("]")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym174$PUSH = SubLObjectFactory.makeSymbol("PUSH");
        $list175 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")));
        $sym176$POP = SubLObjectFactory.makeSymbol("POP");
        $list177 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))));
        $sym178$BUT_LAST = SubLObjectFactory.makeSymbol("BUT-LAST");
        $list179 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOSUBLISTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-SUBLIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-SUBLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CADR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-SUBLIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-SUBLIST"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $sym180$NTH = SubLObjectFactory.makeSymbol("NTH");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"));
        $list182 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym183$SET_NTH = SubLObjectFactory.makeSymbol("SET-NTH");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"));
        $list185 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")));
        $sym186$POSITION = SubLObjectFactory.makeSymbol("POSITION");
        $list187 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym188$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST"));
        $list190 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)SubLObjectFactory.makeString("(APPEND ~S): ~S is not an instance of LIST-TEMPLATE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym191$REVERSE = SubLObjectFactory.makeSymbol("REVERSE");
        $list192 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym193$BASIC_LIST = SubLObjectFactory.makeSymbol("BASIC-LIST");
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-TEMPLATE"));
        $list195 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POP"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BUT-LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym196$BASIC_LIST_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-EMPTY-P-METHOD");
        $sym197$BASIC_LIST_REVERSE_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-REVERSE-METHOD");
        $str198$_APPEND__S____S_is_not_an_instanc = SubLObjectFactory.makeString("(APPEND ~S): ~S is not an instance of LIST-TEMPLATE.");
        $sym199$BASIC_LIST_APPEND_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-APPEND-METHOD");
        $sym200$BASIC_LIST_POSITION_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-POSITION-METHOD");
        $sym201$BASIC_LIST_SET_NTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-SET-NTH-METHOD");
        $sym202$BASIC_LIST_NTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-NTH-METHOD");
        $sym203$BASIC_LIST_BUT_LAST_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-BUT-LAST-METHOD");
        $sym204$BASIC_LIST_POP_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-POP-METHOD");
        $sym205$BASIC_LIST_PUSH_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-PUSH-METHOD");
        $str206$LIST___ = SubLObjectFactory.makeString("LIST:[]");
        $str207$LIST___S = SubLObjectFactory.makeString("LIST:[~S");
        $sym208$BASIC_LIST_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-PRINT-METHOD");
        $sym209$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-CLASS");
        $sym210$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-INSTANCE");
        $sym211$END_POINTER_LIST_TEMPLATE = SubLObjectFactory.makeSymbol("END-POINTER-LIST-TEMPLATE");
        $list212 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-TEMPLATE")));
        $list213 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-END-POINTER"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POP"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BUT-LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $list214 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL));
        $list215 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))));
        $list216 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CADR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CADR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))))))));
        $list217 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))))));
        $list218 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))));
        $list219 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOSUBLISTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-SUBLIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-SUBLIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-SUBLIST"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-SUBLIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $list220 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)SubLObjectFactory.makeString("(APPEND ~S): ~S is not an instance of LIST-TEMPLATE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NCONC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-OTHER-LIST-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $list221 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-REVERSED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-REVERSED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-REVERSED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym222$BASIC_END_POINTER_LIST = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST");
        $list223 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-POINTER-LIST-TEMPLATE"));
        $list224 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-END-POINTER"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POP"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BUT-LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym225$END_POINTER = SubLObjectFactory.makeSymbol("END-POINTER");
        $sym226$BASIC_END_POINTER_LIST_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-EMPTY-P-METHOD");
        $sym227$BASIC_END_POINTER_LIST_REVERSE_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-REVERSE-METHOD");
        $sym228$BASIC_END_POINTER_LIST_APPEND_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-APPEND-METHOD");
        $sym229$BASIC_END_POINTER_LIST_POSITION_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-POSITION-METHOD");
        $sym230$BASIC_END_POINTER_LIST_NTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-NTH-METHOD");
        $sym231$BASIC_END_POINTER_LIST_BUT_LAST_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-BUT-LAST-METHOD");
        $sym232$BASIC_END_POINTER_LIST_POP_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-POP-METHOD");
        $sym233$BASIC_END_POINTER_LIST_PUSH_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-PUSH-METHOD");
        $sym234$BASIC_END_POINTER_LIST_REMOVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-REMOVE-METHOD");
        $sym235$BASIC_END_POINTER_LIST_ADD_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-ADD-METHOD");
        $sym236$BASIC_END_POINTER_LIST_CLEAR_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-CLEAR-METHOD");
        $sym237$BASIC_END_POINTER_LIST_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-PRINT-METHOD");
        $sym238$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-CLASS");
        $sym239$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-INSTANCE");
        $sym240$GET_END_POINTER = SubLObjectFactory.makeSymbol("GET-END-POINTER");
        $list241 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("END-POINTER")));
        $sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-END-POINTER-LIST-METHOD");
        $sym243$BASIC_END_POINTER_LIST_GET_END_POINTER_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-GET-END-POINTER-METHOD");
        $sym244$SET_END_POINTER = SubLObjectFactory.makeSymbol("SET-END-POINTER");
        $list245 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER"));
        $list246 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER")));
        $sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-END-POINTER-LIST-METHOD");
        $sym248$BASIC_END_POINTER_LIST_SET_END_POINTER_METHOD = SubLObjectFactory.makeSymbol("BASIC-END-POINTER-LIST-SET-END-POINTER-METHOD");
        $sym249$DOUBLE_LINK_CELL = SubLObjectFactory.makeSymbol("DOUBLE-LINK-CELL");
        $sym250$DOUBLE_LINK_CELL_P = SubLObjectFactory.makeSymbol("DOUBLE-LINK-CELL-P");
        $list251 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"));
        $list252 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OWNER"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENTS"), (SubLObject)SubLObjectFactory.makeKeyword("PREVIOUS"), (SubLObject)SubLObjectFactory.makeKeyword("NEXT"));
        $list253 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"));
        $list254 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-DLC-NEXT"));
        $sym255$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym256$DOUBLE_LINK_CELL_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("DOUBLE-LINK-CELL-PRINT-FUNCTION-TRAMPOLINE");
        $list257 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("DOUBLE-LINK-CELL-P"));
        $sym258$DLC_OWNER = SubLObjectFactory.makeSymbol("DLC-OWNER");
        $sym259$_CSETF_DLC_OWNER = SubLObjectFactory.makeSymbol("_CSETF-DLC-OWNER");
        $sym260$DLC_CONTENTS = SubLObjectFactory.makeSymbol("DLC-CONTENTS");
        $sym261$_CSETF_DLC_CONTENTS = SubLObjectFactory.makeSymbol("_CSETF-DLC-CONTENTS");
        $sym262$DLC_PREVIOUS = SubLObjectFactory.makeSymbol("DLC-PREVIOUS");
        $sym263$_CSETF_DLC_PREVIOUS = SubLObjectFactory.makeSymbol("_CSETF-DLC-PREVIOUS");
        $sym264$DLC_NEXT = SubLObjectFactory.makeSymbol("DLC-NEXT");
        $sym265$_CSETF_DLC_NEXT = SubLObjectFactory.makeSymbol("_CSETF-DLC-NEXT");
        $kw266$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw267$CONTENTS = SubLObjectFactory.makeKeyword("CONTENTS");
        $kw268$PREVIOUS = SubLObjectFactory.makeKeyword("PREVIOUS");
        $kw269$NEXT = SubLObjectFactory.makeKeyword("NEXT");
        $str270$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw271$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym272$MAKE_DOUBLE_LINK_CELL = SubLObjectFactory.makeSymbol("MAKE-DOUBLE-LINK-CELL");
        $kw273$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw274$END = SubLObjectFactory.makeKeyword("END");
        $sym275$VISIT_DEFSTRUCT_OBJECT_DOUBLE_LINK_CELL_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-DOUBLE-LINK-CELL-METHOD");
        $list276 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str277$dlc = SubLObjectFactory.makeString("dlc");
        $sym278$DLC_ = SubLObjectFactory.makeSymbol("DLC-");
        $sym279$LIST_ELEMENT_TEMPLATE = SubLObjectFactory.makeSymbol("LIST-ELEMENT-TEMPLATE");
        $list280 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARENT-LINKS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINKS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PARENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-PARENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SELF-DELETION-MODE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-SELF-FROM-COLLECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COLLECTIONS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-DELETE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-ACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym281$ADD_PARENT_LINK = SubLObjectFactory.makeSymbol("ADD-PARENT-LINK");
        $list282 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINK"));
        $list283 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ADD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINK")));
        $sym284$DELETE_PARENT_LINK = SubLObjectFactory.makeSymbol("DELETE-PARENT-LINK");
        $list285 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-PARENT-LINK"));
        $list286 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("OLD-PARENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("OLD-PARENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ON-DELETE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-PARENT-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-PARENT-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $sym287$DELETE_SELF_FROM_COLLECTION = SubLObjectFactory.makeSymbol("DELETE-SELF-FROM-COLLECTION");
        $list288 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"));
        $list289 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"))), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUNWIND-PROTECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ON-DELETE")), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym290$TRANSFER_SELF = SubLObjectFactory.makeSymbol("TRANSFER-SELF");
        $list291 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION"));
        $list292 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-COLLECTION")), (SubLObject)SubLObjectFactory.makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-COLLECTION")), (SubLObject)SubLObjectFactory.makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"))), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLINKS")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUNWIND-PROTECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-TARGET-LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym293$DELETE_SELF_FROM_ALL_COLLECTIONS = SubLObjectFactory.makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS");
        $list294 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUNWIND-PROTECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK")), (SubLObject)subloop_collections.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $list295 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $sym296$GET_COLLECTIONS = SubLObjectFactory.makeSymbol("GET-COLLECTIONS");
        $list297 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COLLECTIONS"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-COLLECTING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COLLECTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PARENT-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIQUE-ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COLLECTIONS")))));
        $sym298$ON_ADD = SubLObjectFactory.makeSymbol("ON-ADD");
        $list299 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-LIST"));
        $list300 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL));
        $sym301$ON_DELETE = SubLObjectFactory.makeSymbol("ON-DELETE");
        $sym302$PERFORM_ACTION = SubLObjectFactory.makeSymbol("PERFORM-ACTION");
        $list303 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS"));
        $list304 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL));
        $sym305$BASIC_LIST_ELEMENT = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT");
        $list306 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-ELEMENT-TEMPLATE"));
        $list307 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARENT-LINKS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PARENT-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINKS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PARENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-PARENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SELF-DELETION-MODE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-SELF-FROM-COLLECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COLLECTIONS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-DELETE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-ACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym308$QUA_LIST_ELEMENT_PARENT_LINKS = SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS");
        $sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE = SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE");
        $int310$4097 = SubLObjectFactory.makeInteger(4097);
        $sym311$BASIC_LIST_ELEMENT_PERFORM_ACTION_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-PERFORM-ACTION-METHOD");
        $sym312$BASIC_LIST_ELEMENT_ON_DELETE_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-ON-DELETE-METHOD");
        $sym313$BASIC_LIST_ELEMENT_ON_ADD_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-ON-ADD-METHOD");
        $sym314$BASIC_LIST_ELEMENT_GET_COLLECTIONS_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-GET-COLLECTIONS-METHOD");
        $sym315$BASIC_LIST_ELEMENT_MEMBER_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-MEMBER-P-METHOD");
        $sym316$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD");
        $str317$_TRANSFER_SELF__S____S_is_not_an_ = SubLObjectFactory.makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE.");
        $sym318$BASIC_LIST_ELEMENT_TRANSFER_SELF_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-TRANSFER-SELF-METHOD");
        $sym319$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_COLLECTION_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-DELETE-SELF-FROM-COLLECTION-METHOD");
        $sym320$BASIC_LIST_ELEMENT_DELETE_PARENT_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-DELETE-PARENT-LINK-METHOD");
        $sym321$BASIC_LIST_ELEMENT_ADD_PARENT_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-ADD-PARENT-LINK-METHOD");
        $sym322$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-CLASS");
        $sym323$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-INSTANCE");
        $list324 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");
        $sym326$BASIC_LIST_ELEMENT_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-INITIALIZE-METHOD");
        $sym327$GET_PARENT_LINKS = SubLObjectFactory.makeSymbol("GET-PARENT-LINKS");
        $list328 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS")));
        $sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");
        $sym330$BASIC_LIST_ELEMENT_GET_PARENT_LINKS_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-GET-PARENT-LINKS-METHOD");
        $sym331$SET_PARENT_LINKS = SubLObjectFactory.makeSymbol("SET-PARENT-LINKS");
        $list332 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINKS"));
        $list333 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PARENT-LINKS")));
        $sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");
        $sym335$BASIC_LIST_ELEMENT_SET_PARENT_LINKS_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-SET-PARENT-LINKS-METHOD");
        $sym336$GET_SELF_DELETION_MODE = SubLObjectFactory.makeSymbol("GET-SELF-DELETION-MODE");
        $list337 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE")));
        $sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");
        $sym339$BASIC_LIST_ELEMENT_GET_SELF_DELETION_MODE_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-GET-SELF-DELETION-MODE-METHOD");
        $sym340$SET_SELF_DELETION_MODE = SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE");
        $list341 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"));
        $list342 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), (SubLObject)SubLObjectFactory.makeSymbol("MODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MODE")));
        $sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD");
        $sym344$BASIC_LIST_ELEMENT_SET_SELF_DELETION_MODE_METHOD = SubLObjectFactory.makeSymbol("BASIC-LIST-ELEMENT-SET-SELF-DELETION-MODE-METHOD");
        $sym345$DOUBLY_LINKED_LIST_TEMPLATE = SubLObjectFactory.makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE");
        $list346 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT-COUNT")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INC-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEC-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LAST-LINK"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LAST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-NTH-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POP"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BUT-LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SWAP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym347$DELETE_LINK = SubLObjectFactory.makeSymbol("DELETE-LINK");
        $list348 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK"));
        $list349 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOUBLE-LINK-CELL-P"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEC-ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK")))), (SubLObject)SubLObjectFactory.makeString("(DELETE-LINK ~S): Detected inconsistancy in list."), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SECOND-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SECOND-LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SECOND-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SECOND-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SECOND-LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SECOND-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BEFORE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-AFTER-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BEFORE-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-AFTER-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-AFTER-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BEFORE-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"))))))));
        $sym350$REVERSE_LINK = SubLObjectFactory.makeSymbol("REVERSE-LINK");
        $list351 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEXT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"))));
        $sym352$FIND_LINK = SubLObjectFactory.makeSymbol("FIND-LINK");
        $list353 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $sym354$FIND_NTH_LINK = SubLObjectFactory.makeSymbol("FIND-NTH-LINK");
        $list355 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)subloop_collections.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $list356 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))));
        $list357 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")));
        $list358 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("DLIST[]"))), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("DLIST[~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString(", ~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("]")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $list359 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $list360 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-DOUBLE-LINK-CELL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-ELEMENT-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INC-ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")));
        $list361 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-ELEMENT-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-DLLT-DELETE-SELF-FROM-COLLECTION-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")));
        $list362 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"), (SubLObject)subloop_collections.T, (SubLObject)subloop_collections.NIL))));
        $list363 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-DOUBLE-LINK-CELL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-ELEMENT-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INC-ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))));
        $list364 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $list365 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $list366 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-NTH-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $list367 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-NTH-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-ELEMENT-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-DLLT-DELETE-PARENT-LINK-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-ELEMENT-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL));
        $list368 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)subloop_collections.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LINKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $list369 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)SubLObjectFactory.makeString("(APPEND ~S): Cannot append non list ~S."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $list370 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEXT-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEXT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEXT-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FIRST-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $list371 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym372$SWAP = SubLObjectFactory.makeSymbol("SWAP");
        $list373 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), (SubLObject)SubLObjectFactory.makeString("(SWAP ~S): Cannot swap NIL elements."), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)SubLObjectFactory.makeSymbol("LINK1"), (SubLObject)SubLObjectFactory.makeString("(SWAP ~S): ~S is not an element of this list."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)SubLObjectFactory.makeSymbol("LINK2"), (SubLObject)SubLObjectFactory.makeString("(SWAP ~S): ~S is not an element of this list."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-ELEMENT-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("LINK1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("LINK2"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-ELEMENT-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("LINK2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-PARENT-LINK")), (SubLObject)SubLObjectFactory.makeSymbol("LINK1"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK1")), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("LINK2")), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL) }));
        $sym374$BASIC_DOUBLY_LINKED_LIST = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST");
        $list375 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE"));
        $list376 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUALITY-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-LINK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT-COUNT")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INC-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEC-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-LINK"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LAST-LINK"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LAST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-NTH-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POP"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("BUT-LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SWAP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT1"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT2")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym377$LAST_LINK = SubLObjectFactory.makeSymbol("LAST-LINK");
        $sym378$FIRST_LINK = SubLObjectFactory.makeSymbol("FIRST-LINK");
        $sym379$ELEMENT_COUNT = SubLObjectFactory.makeSymbol("ELEMENT-COUNT");
        $str380$_SWAP__S___Cannot_swap_NIL_elemen = SubLObjectFactory.makeString("(SWAP ~S): Cannot swap NIL elements.");
        $str381$_SWAP__S____S_is_not_an_element_o = SubLObjectFactory.makeString("(SWAP ~S): ~S is not an element of this list.");
        $sym382$BASIC_DOUBLY_LINKED_LIST_SWAP_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-SWAP-METHOD");
        $sym383$BASIC_DOUBLY_LINKED_LIST_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-EMPTY-P-METHOD");
        $sym384$BASIC_DOUBLY_LINKED_LIST_REVERSE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-REVERSE-METHOD");
        $str385$_APPEND__S___Cannot_append_non_li = SubLObjectFactory.makeString("(APPEND ~S): Cannot append non list ~S.");
        $sym386$BASIC_DOUBLY_LINKED_LIST_APPEND_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-APPEND-METHOD");
        $sym387$BASIC_DOUBLY_LINKED_LIST_POSITION_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-POSITION-METHOD");
        $sym388$BASIC_DOUBLY_LINKED_LIST_SET_NTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-NTH-METHOD");
        $sym389$BASIC_DOUBLY_LINKED_LIST_NTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-NTH-METHOD");
        $sym390$BASIC_DOUBLY_LINKED_LIST_BUT_LAST_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-BUT-LAST-METHOD");
        $sym391$BASIC_DOUBLY_LINKED_LIST_POP_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-POP-METHOD");
        $sym392$BASIC_DOUBLY_LINKED_LIST_PUSH_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-PUSH-METHOD");
        $sym393$BASIC_DOUBLY_LINKED_LIST_MEMBER_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-MEMBER-P-METHOD");
        $sym394$BASIC_DOUBLY_LINKED_LIST_REMOVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-REMOVE-METHOD");
        $sym395$BASIC_DOUBLY_LINKED_LIST_ADD_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ADD-METHOD");
        $sym396$BASIC_DOUBLY_LINKED_LIST_CLEAR_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-CLEAR-METHOD");
        $str397$DLIST__ = SubLObjectFactory.makeString("DLIST[]");
        $str398$DLIST__S = SubLObjectFactory.makeString("DLIST[~S");
        $sym399$BASIC_DOUBLY_LINKED_LIST_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-PRINT-METHOD");
        $sym400$BASIC_DOUBLY_LINKED_LIST_FIND_NTH_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-FIND-NTH-LINK-METHOD");
        $sym401$BASIC_DOUBLY_LINKED_LIST_FIND_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-FIND-LINK-METHOD");
        $sym402$BASIC_DOUBLY_LINKED_LIST_REVERSE_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-REVERSE-LINK-METHOD");
        $str403$_DELETE_LINK__S____S_is_not_a_val = SubLObjectFactory.makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL.");
        $str404$_DELETE_LINK__S___Link__S_is_not_ = SubLObjectFactory.makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S.");
        $str405$_DELETE_LINK__S___Detected_incons = SubLObjectFactory.makeString("(DELETE-LINK ~S): Detected inconsistancy in list.");
        $sym406$BASIC_DOUBLY_LINKED_LIST_DELETE_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-DELETE-LINK-METHOD");
        $str407$_SET_CONTENTS__S___Cannot_set_the = SubLObjectFactory.makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list.");
        $sym408$BASIC_DOUBLY_LINKED_LIST_SET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-CONTENTS-METHOD");
        $sym409$BASIC_DOUBLY_LINKED_LIST_GET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-CONTENTS-METHOD");
        $sym410$BASIC_DOUBLY_LINKED_LIST_ELEMENT_EQUAL_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUAL-P-METHOD");
        $sym411$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-CLASS");
        $sym412$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-INSTANCE");
        $sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $sym414$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_EQUALITY_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-EQUALITY-PREDICATE-METHOD");
        $sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $sym416$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_EQUALITY_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-EQUALITY-PREDICATE-METHOD");
        $sym417$SET_ELEMENT_COUNT = SubLObjectFactory.makeSymbol("SET-ELEMENT-COUNT");
        $list418 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT-COUNT"));
        $list419 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT-COUNT")), (SubLObject)SubLObjectFactory.makeString("(SET-ELEMENT-COUNT ~S): ~S is not a legal element count value.  Expecting an integer."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT-COUNT")));
        $sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $str421$_SET_ELEMENT_COUNT__S____S_is_not = SubLObjectFactory.makeString("(SET-ELEMENT-COUNT ~S): ~S is not a legal element count value.  Expecting an integer.");
        $sym422$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-COUNT-METHOD");
        $sym423$INC_ELEMENT_COUNT = SubLObjectFactory.makeSymbol("INC-ELEMENT-COUNT");
        $list424 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"), (SubLObject)subloop_collections.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT")));
        $sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $sym426$BASIC_DOUBLY_LINKED_LIST_INC_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-INC-ELEMENT-COUNT-METHOD");
        $sym427$DEC_ELEMENT_COUNT = SubLObjectFactory.makeSymbol("DEC-ELEMENT-COUNT");
        $list428 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"), (SubLObject)subloop_collections.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT")));
        $sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $sym430$BASIC_DOUBLY_LINKED_LIST_DEC_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-DEC-ELEMENT-COUNT-METHOD");
        $sym431$GET_FIRST_LINK = SubLObjectFactory.makeSymbol("GET-FIRST-LINK");
        $list432 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK")));
        $sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $sym434$BASIC_DOUBLY_LINKED_LIST_GET_FIRST_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-FIRST-LINK-METHOD");
        $sym435$SET_FIRST_LINK = SubLObjectFactory.makeSymbol("SET-FIRST-LINK");
        $list436 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK"));
        $list437 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOUBLE-LINK-CELL-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK"))), (SubLObject)SubLObjectFactory.makeString("(SET-FIRST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK")));
        $sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $str439$_SET_FIRST_LINK__S____S_is_not_an = SubLObjectFactory.makeString("(SET-FIRST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL.");
        $sym440$BASIC_DOUBLY_LINKED_LIST_SET_FIRST_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-FIRST-LINK-METHOD");
        $sym441$GET_LAST_LINK = SubLObjectFactory.makeSymbol("GET-LAST-LINK");
        $list442 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-LINK")));
        $sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $sym444$BASIC_DOUBLY_LINKED_LIST_GET_LAST_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-LAST-LINK-METHOD");
        $sym445$SET_LAST_LINK = SubLObjectFactory.makeSymbol("SET-LAST-LINK");
        $list446 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK"));
        $list447 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOUBLE-LINK-CELL-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK"))), (SubLObject)SubLObjectFactory.makeString("(SET-LAST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")));
        $sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $str449$_SET_LAST_LINK__S____S_is_not_an_ = SubLObjectFactory.makeString("(SET-LAST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL.");
        $sym450$BASIC_DOUBLY_LINKED_LIST_SET_LAST_LINK_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-SET-LAST-LINK-METHOD");
        $list451 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT")));
        $sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $sym453$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-COUNT-METHOD");
        $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR");
        $list455 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-LINK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INITIAL-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym456$CURRENT_LINK = SubLObjectFactory.makeSymbol("CURRENT-LINK");
        $sym457$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_C = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CLASS");
        $sym458$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_I = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INSTANCE");
        $list459 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-LINK"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");
        $sym461$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INITIALIZE-METHOD");
        $sym462$ISOLATE = SubLObjectFactory.makeSymbol("ISOLATE");
        $list463 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-LINK"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-OWNER"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK")), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-LINK"))))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("FIRST-LINK"), subloop_collections.NIL, SubLObjectFactory.makeSymbol("LAST-LINK"), subloop_collections.NIL, SubLObjectFactory.makeSymbol("CURRENT-LINK"), subloop_collections.NIL, SubLObjectFactory.makeSymbol("DIRECTION"), SubLObjectFactory.makeKeyword("NONE") }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");
        $sym465$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_ISOLATE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-ISOLATE-METHOD");
        $sym466$SET_INITIAL_STATE = SubLObjectFactory.makeSymbol("SET-INITIAL-STATE");
        $list467 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK"));
        $list468 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");
        $sym470$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_SET_INITIAL_STATE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-SET-INITIAL-STATE-METHOD");
        $list471 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK"))));
        $sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");
        $sym473$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-EMPTY-P-METHOD");
        $list474 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"))));
        $sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");
        $sym476$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-P-METHOD");
        $list477 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK")))));
        $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");
        $sym479$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-P-METHOD");
        $list480 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"))));
        $sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD");
        $sym482$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_CURRENT_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-METHOD");
        $list483 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list484 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym485$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-METHOD");
        $list486 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym487$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-METHOD");
        $list488 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym489$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_NEXT_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-NEXT-METHOD");
        $list490 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-PREVIOUS"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym491$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_PREVIOUS_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-PREVIOUS-METHOD");
        $list492 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DLC-COPY-LINKS"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-INITIAL-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LAST-LINK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ENUMERATOR")))));
        $sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD");
        $sym494$BASIC_DOUBLY_LINKED_LIST_ALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ALLOCATE-ENUMERATOR-METHOD");
        $list495 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-P"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL));
        $sym496$BASIC_DOUBLY_LINKED_LIST_DEALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-DEALLOCATE-ENUMERATOR-METHOD");
        $sym497$PAIR_TEMPLATE = SubLObjectFactory.makeSymbol("PAIR-TEMPLATE");
        $list498 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SECOND")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $list499 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("(~S, ~S)"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym500$BASIC_PAIR = SubLObjectFactory.makeSymbol("BASIC-PAIR");
        $list501 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PAIR-TEMPLATE"));
        $list502 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-ELEMENT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND-ELEMENT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SECOND")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym503$SECOND_ELEMENT = SubLObjectFactory.makeSymbol("SECOND-ELEMENT");
        $sym504$FIRST_ELEMENT = SubLObjectFactory.makeSymbol("FIRST-ELEMENT");
        $str505$__S___S_ = SubLObjectFactory.makeString("(~S, ~S)");
        $sym506$BASIC_PAIR_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-PAIR-PRINT-METHOD");
        $sym507$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-CLASS");
        $sym508$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-INSTANCE");
        $list509 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-ELEMENT"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-ELEMENT"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");
        $sym511$BASIC_PAIR_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-PAIR-INITIALIZE-METHOD");
        $sym512$GET_FIRST = SubLObjectFactory.makeSymbol("GET-FIRST");
        $list513 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-ELEMENT")));
        $sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");
        $sym515$BASIC_PAIR_GET_FIRST_METHOD = SubLObjectFactory.makeSymbol("BASIC-PAIR-GET-FIRST-METHOD");
        $sym516$SET_FIRST = SubLObjectFactory.makeSymbol("SET-FIRST");
        $list517 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST"));
        $list518 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-FIRST")));
        $sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");
        $sym520$BASIC_PAIR_SET_FIRST_METHOD = SubLObjectFactory.makeSymbol("BASIC-PAIR-SET-FIRST-METHOD");
        $sym521$GET_SECOND = SubLObjectFactory.makeSymbol("GET-SECOND");
        $list522 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-ELEMENT")));
        $sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");
        $sym524$BASIC_PAIR_GET_SECOND_METHOD = SubLObjectFactory.makeSymbol("BASIC-PAIR-GET-SECOND-METHOD");
        $sym525$SET_SECOND = SubLObjectFactory.makeSymbol("SET-SECOND");
        $list526 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SECOND"));
        $list527 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SECOND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SECOND")));
        $sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-PAIR-METHOD");
        $sym529$BASIC_PAIR_SET_SECOND_METHOD = SubLObjectFactory.makeSymbol("BASIC-PAIR-SET-SECOND-METHOD");
        $sym530$TRIPLET_TEMPLATE = SubLObjectFactory.makeSymbol("TRIPLET-TEMPLATE");
        $list531 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PAIR-TEMPLATE")));
        $list532 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-THIRD"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-THIRD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-THIRD")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $list533 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("(~S, ~S, ~S)"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-THIRD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym534$BASIC_TRIPLET = SubLObjectFactory.makeSymbol("BASIC-TRIPLET");
        $list535 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRIPLET-TEMPLATE"));
        $list536 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIRD-ELEMENT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-THIRD"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-THIRD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-THIRD")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym537$THIRD_ELEMENT = SubLObjectFactory.makeSymbol("THIRD-ELEMENT");
        $str538$__S___S___S_ = SubLObjectFactory.makeString("(~S, ~S, ~S)");
        $sym539$BASIC_TRIPLET_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-TRIPLET-PRINT-METHOD");
        $sym540$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-CLASS");
        $sym541$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-INSTANCE");
        $list542 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("THIRD-ELEMENT"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-TRIPLET-METHOD");
        $sym544$BASIC_TRIPLET_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-TRIPLET-INITIALIZE-METHOD");
        $sym545$GET_THIRD = SubLObjectFactory.makeSymbol("GET-THIRD");
        $list546 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("THIRD-ELEMENT")));
        $sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-TRIPLET-METHOD");
        $sym548$BASIC_TRIPLET_GET_THIRD_METHOD = SubLObjectFactory.makeSymbol("BASIC-TRIPLET-GET-THIRD-METHOD");
        $sym549$SET_THIRD = SubLObjectFactory.makeSymbol("SET-THIRD");
        $list550 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-THIRD"));
        $list551 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("THIRD-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-THIRD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-THIRD")));
        $sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-TRIPLET-METHOD");
        $sym553$BASIC_TRIPLET_SET_THIRD_METHOD = SubLObjectFactory.makeSymbol("BASIC-TRIPLET-SET-THIRD-METHOD");
        $sym554$SUBLOOP_PRIVATE_PAIR = SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR");
        $list555 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym556$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-CLASS");
        $sym557$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-INSTANCE");
        $list558 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("SUBLOOP-PRIVATE-PAIR(~S, ~S)"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $str559$SUBLOOP_PRIVATE_PAIR__S___S_ = SubLObjectFactory.makeString("SUBLOOP-PRIVATE-PAIR(~S, ~S)");
        $sym560$SUBLOOP_PRIVATE_PAIR_PRINT_METHOD = SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-PRINT-METHOD");
        $sym561$BAG_ENUMERATOR_TEMPLATE = SubLObjectFactory.makeSymbol("BAG-ENUMERATOR-TEMPLATE");
        $list562 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-POINTER")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTION"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $list563 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.T))));
        $list564 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL))));
        $list565 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUANT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("QUANT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL))));
        $list566 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $list567 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)subloop_collections.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $list568 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $list569 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-COLLECTIONS-BAG-ENUM-GET-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))))));
        $list570 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-COLLECTIONS-BACKUP-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("BACKWARDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))))));
        $sym571$BASIC_BAG_ENUMERATOR = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR");
        $list572 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAG-ENUMERATOR-TEMPLATE"));
        $list573 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS-POINTER"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-POINTER")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DIRECTION"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym574$BASIC_BAG_ENUMERATOR_PREVIOUS_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-PREVIOUS-METHOD");
        $sym575$BASIC_BAG_ENUMERATOR_NEXT_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-NEXT-METHOD");
        $sym576$BASIC_BAG_ENUMERATOR_LAST_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-LAST-METHOD");
        $sym577$BASIC_BAG_ENUMERATOR_FIRST_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-FIRST-METHOD");
        $sym578$BASIC_BAG_ENUMERATOR_CURRENT_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-CURRENT-METHOD");
        $sym579$BASIC_BAG_ENUMERATOR_LAST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-LAST-P-METHOD");
        $sym580$BASIC_BAG_ENUMERATOR_FIRST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-FIRST-P-METHOD");
        $sym581$BASIC_BAG_ENUMERATOR_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-EMPTY-P-METHOD");
        $sym582$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-CLASS");
        $sym583$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-INSTANCE");
        $sym584$INSTANTIATE = SubLObjectFactory.makeSymbol("INSTANTIATE");
        $list585 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANTIATE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");
        $sym587$BASIC_BAG_ENUMERATOR_INSTANTIATE_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-INSTANTIATE-METHOD");
        $sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");
        $sym589$BASIC_BAG_ENUMERATOR_GET_CONTENTS_POINTER_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-GET-CONTENTS-POINTER-METHOD");
        $list590 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-POINTER"));
        $list591 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-POINTER"))), (SubLObject)SubLObjectFactory.makeString("(SET-CONTENTS-POINTER ~S): ~S is not an instance of SUBLOOP-PRIVATE-PAIR."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-POINTER")));
        $sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");
        $str593$_SET_CONTENTS_POINTER__S____S_is_ = SubLObjectFactory.makeString("(SET-CONTENTS-POINTER ~S): ~S is not an instance of SUBLOOP-PRIVATE-PAIR.");
        $sym594$BASIC_BAG_ENUMERATOR_SET_CONTENTS_POINTER_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-SET-CONTENTS-POINTER-METHOD");
        $sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");
        $sym596$BASIC_BAG_ENUMERATOR_GET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-GET-CONTENTS-METHOD");
        $list597 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeString("(SET-CONTENTS ~S): ~S is not an instance of LIST."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")));
        $sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");
        $str599$_SET_CONTENTS__S____S_is_not_an_i = SubLObjectFactory.makeString("(SET-CONTENTS ~S): ~S is not an instance of LIST.");
        $sym600$BASIC_BAG_ENUMERATOR_SET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-SET-CONTENTS-METHOD");
        $sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");
        $sym602$BASIC_BAG_ENUMERATOR_GET_DIRECTION_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-GET-DIRECTION-METHOD");
        $list603 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENTIAL-DIRECTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")), (SubLObject)SubLObjectFactory.makeString("(SET-DIRECTION ~S): ~S is not an instance of SEQUANITIAL-DIRECTION."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DIRECTION")));
        $sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD");
        $str605$_SET_DIRECTION__S____S_is_not_an_ = SubLObjectFactory.makeString("(SET-DIRECTION ~S): ~S is not an instance of SEQUANITIAL-DIRECTION.");
        $sym606$BASIC_BAG_ENUMERATOR_SET_DIRECTION_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-SET-DIRECTION-METHOD");
        $sym607$BAG_TEMPLATE = SubLObjectFactory.makeSymbol("BAG-TEMPLATE");
        $list608 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-REPRESENTATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-REP")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OCCURENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-UNIQUE-ELEMENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-UNIQUE-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $list609 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("BAG[]"))), (SubLObject)ConsesLow.list((SubLObject)subloop_collections.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("BAG[~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString(", ~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("]")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $list610 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"), (SubLObject)subloop_collections.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"))));
        $list611 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-APPENDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-COLLECTIONS-BAG-TEMPLATE-TRANSLATE-PAIR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))));
        $list612 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")));
        $list613 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)subloop_collections.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOSUBLISTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")), (SubLObject)subloop_collections.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-PAIR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-PAIR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-PAIR"), (SubLObject)subloop_collections.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACA"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-PAIR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))));
        $list614 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"), (SubLObject)subloop_collections.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACA"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"), (SubLObject)subloop_collections.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"), (SubLObject)subloop_collections.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACA"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-COUNT"), (SubLObject)subloop_collections.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREVIOUS-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL))))));
        $list615 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.T)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL)));
        $sym616$OCCURENCES = SubLObjectFactory.makeSymbol("OCCURENCES");
        $list617 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-EQUAL-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.ONE_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.ZERO_INTEGER)));
        $sym618$GET_UNIQUE_ELEMENTS = SubLObjectFactory.makeSymbol("GET-UNIQUE-ELEMENTS");
        $list619 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-UNIQUE-ELEMENTS"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-BAG-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-UNIQUE-ELEMENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-UNIQUE-ELEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-UNIQUE-ELEMENTS"))));
        $sym620$GET_UNIQUE_ELEMENT_COUNT = SubLObjectFactory.makeSymbol("GET-UNIQUE-ELEMENT-COUNT");
        $list621 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $list622 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym623$BASIC_BAG = SubLObjectFactory.makeSymbol("BASIC-BAG");
        $list624 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAG-TEMPLATE"));
        $list625 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAG-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-REPRESENTATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-REP")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OCCURENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-UNIQUE-ELEMENTS"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-UNIQUE-ELEMENT-COUNT"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym626$BAG_REPRESENTATION = SubLObjectFactory.makeSymbol("BAG-REPRESENTATION");
        $sym627$BASIC_BAG_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-EMPTY-P-METHOD");
        $sym628$BASIC_BAG_GET_UNIQUE_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-GET-UNIQUE-ELEMENT-COUNT-METHOD");
        $sym629$BASIC_BAG_GET_UNIQUE_ELEMENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-GET-UNIQUE-ELEMENTS-METHOD");
        $sym630$BASIC_BAG_OCCURENCES_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-OCCURENCES-METHOD");
        $sym631$BASIC_BAG_MEMBER_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-MEMBER-P-METHOD");
        $sym632$BASIC_BAG_REMOVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-REMOVE-METHOD");
        $sym633$BASIC_BAG_ADD_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ADD-METHOD");
        $sym634$BASIC_BAG_SET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-SET-CONTENTS-METHOD");
        $sym635$BASIC_BAG_GET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-GET-CONTENTS-METHOD");
        $sym636$BASIC_BAG_GET_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-GET-ELEMENT-COUNT-METHOD");
        $str637$BAG__ = SubLObjectFactory.makeString("BAG[]");
        $str638$BAG__S = SubLObjectFactory.makeString("BAG[~S");
        $sym639$BASIC_BAG_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-PRINT-METHOD");
        $sym640$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-CLASS");
        $sym641$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-INSTANCE");
        $list642 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-REPRESENTATION"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-METHOD");
        $sym644$BASIC_BAG_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-INITIALIZE-METHOD");
        $sym645$GET_INTERNAL_REPRESENTATION = SubLObjectFactory.makeSymbol("GET-INTERNAL-REPRESENTATION");
        $list646 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-REPRESENTATION")));
        $sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-METHOD");
        $sym648$BASIC_BAG_GET_INTERNAL_REPRESENTATION_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-GET-INTERNAL-REPRESENTATION-METHOD");
        $sym649$SET_INTERNAL_REPRESENTATION = SubLObjectFactory.makeSymbol("SET-INTERNAL-REPRESENTATION");
        $list650 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-REP"));
        $list651 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-REP")), (SubLObject)SubLObjectFactory.makeString("(SET-INTERNAL-REPRESENTATION ~S): ~S is not a valid bag representation.  Expecting an instance of LIST."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-REP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-REPRESENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-REP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-REP")));
        $sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-METHOD");
        $str653$_SET_INTERNAL_REPRESENTATION__S__ = SubLObjectFactory.makeString("(SET-INTERNAL-REPRESENTATION ~S): ~S is not a valid bag representation.  Expecting an instance of LIST.");
        $sym654$BASIC_BAG_SET_INTERNAL_REPRESENTATION_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-SET-INTERNAL-REPRESENTATION-METHOD");
        $list655 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBLOOP-PRIVATE-PAIR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("BAG-REPRESENTATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ENUMERATOR"))));
        $sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-BAG-METHOD");
        $sym657$BASIC_BAG_ALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-ALLOCATE-ENUMERATOR-METHOD");
        $list658 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR-P"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)SubLObjectFactory.makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-BAG-ENUMERATOR."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISOLATE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-BAG-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_collections.NIL));
        $str659$_DEALLOCATE_ENUMERATOR__S____S_is = SubLObjectFactory.makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-BAG-ENUMERATOR.");
        $sym660$BASIC_BAG_DEALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-BAG-DEALLOCATE-ENUMERATOR-METHOD");
        $sym661$TEST_LIST_ELEMENT = SubLObjectFactory.makeSymbol("TEST-LIST-ELEMENT");
        $list662 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLIC-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SYMBOLIC-NAME"), (SubLObject)subloop_collections.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SYMBOLIC-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SYMBOLIC-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-DELETE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym663$SYMBOLIC_NAME = SubLObjectFactory.makeSymbol("SYMBOLIC-NAME");
        $sym664$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-CLASS");
        $sym665$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-INSTANCE");
        $list666 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLIC-NAME"), (SubLObject)subloop_collections.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD");
        $sym668$TEST_LIST_ELEMENT_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("TEST-LIST-ELEMENT-INITIALIZE-METHOD");
        $sym669$GET_SYMBOLIC_NAME = SubLObjectFactory.makeSymbol("GET-SYMBOLIC-NAME");
        $list670 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLIC-NAME")));
        $sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD");
        $sym672$TEST_LIST_ELEMENT_GET_SYMBOLIC_NAME_METHOD = SubLObjectFactory.makeSymbol("TEST-LIST-ELEMENT-GET-SYMBOLIC-NAME-METHOD");
        $sym673$SET_SYMBOLIC_NAME = SubLObjectFactory.makeSymbol("SET-SYMBOLIC-NAME");
        $list674 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SYMBOLIC-NAME"));
        $list675 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLIC-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SYMBOLIC-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SYMBOLIC-NAME")));
        $sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD");
        $sym677$TEST_LIST_ELEMENT_SET_SYMBOLIC_NAME_METHOD = SubLObjectFactory.makeSymbol("TEST-LIST-ELEMENT-SET-SYMBOLIC-NAME-METHOD");
        $list678 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString(">~S<"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOLIC-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD");
        $str680$__S_ = SubLObjectFactory.makeString(">~S<");
        $sym681$TEST_LIST_ELEMENT_PRINT_METHOD = SubLObjectFactory.makeSymbol("TEST-LIST-ELEMENT-PRINT-METHOD");
        $sym682$TEST_LIST_ELEMENT_ON_ADD_METHOD = SubLObjectFactory.makeSymbol("TEST-LIST-ELEMENT-ON-ADD-METHOD");
        $sym683$TEST_LIST_ELEMENT_ON_DELETE_METHOD = SubLObjectFactory.makeSymbol("TEST-LIST-ELEMENT-ON-DELETE-METHOD");
        $sym684$_TEST_LIST_ELEMENTS_ = SubLObjectFactory.makeSymbol("*TEST-LIST-ELEMENTS*");
        $str685$ENUMERATOR_TEMPLATE_EMPTY_P___S_i = SubLObjectFactory.makeString("ENUMERATOR-TEMPLATE-EMPTY-P: ~S is not an instance of ENUMERATOR-TEMPLATE.");
        $str686$ENUMERATOR_TEMPLATE_LAST_P___S_is = SubLObjectFactory.makeString("ENUMERATOR-TEMPLATE-LAST-P: ~S is not an instance of ENUMERATOR-TEMPLATE.");
        $str687$ENUMERATOR_TEMPLATE_FIRST___S_is_ = SubLObjectFactory.makeString("ENUMERATOR-TEMPLATE-FIRST: ~S is not an instance of ENUMERATOR-TEMPLATE.");
        $str688$ENUMERATOR_TEMPLATE_NEXT___S_is_n = SubLObjectFactory.makeString("ENUMERATOR-TEMPLATE-NEXT: ~S is not an instance of ENUMERATOR-TEMPLATE.");
        $str689$ENUMERATOR_TEMPLATE_CURRENT___S_i = SubLObjectFactory.makeString("ENUMERATOR-TEMPLATE-CURRENT: ~S is not an instance of ENUMERATOR-TEMPLATE.");
        $str690$COLLECTION_TEMPLATE_EMPTY_P___S_i = SubLObjectFactory.makeString("COLLECTION-TEMPLATE-EMPTY-P: ~S is not an instance of COLLECTION-TEMPLATE.");
        $str691$DOUBLY_LINKED_LIST_TEMPLATE_ADD__ = SubLObjectFactory.makeString("DOUBLY-LINKED-LIST-TEMPLATE-ADD: ~S is not an instance of DOUBLY-LINKED-LIST-TEMPLATE.");
        $str692$DOUBLY_LINKED_LIST_TEMPLATE_GET_C = SubLObjectFactory.makeString("DOUBLY-LINKED-LIST-TEMPLATE-GET-CONTENTS: ~S is not an instance of DOUBLY-LINKED-LIST-TEMPLATE.");
    }
    
    public static final class $double_link_cell_native extends SubLStructNative
    {
        public SubLObject $owner;
        public SubLObject $contents;
        public SubLObject $previous;
        public SubLObject $next;
        private static final SubLStructDeclNative structDecl;
        
        public $double_link_cell_native() {
            this.$owner = (SubLObject)CommonSymbols.NIL;
            this.$contents = (SubLObject)CommonSymbols.NIL;
            this.$previous = (SubLObject)CommonSymbols.NIL;
            this.$next = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$double_link_cell_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$double_link_cell_native.class, subloop_collections.$sym249$DOUBLE_LINK_CELL, subloop_collections.$sym250$DOUBLE_LINK_CELL_P, subloop_collections.$list251, subloop_collections.$list252, new String[] { "$owner", "$contents", "$previous", "$next" }, subloop_collections.$list253, subloop_collections.$list254, subloop_collections.$sym255$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $double_link_cell_p$UnaryFunction extends UnaryFunction
    {
        public $double_link_cell_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DOUBLE-LINK-CELL-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_collections.double_link_cell_p(arg1);
        }
    }
}

/*

	Total time: 4595 ms
	
*/