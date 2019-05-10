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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class subloop_collections
    extends
      SubLTranslatedFile
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
  public static SubLObject valid_sequential_directions()
  {
    return $valid_sequential_directions$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
  public static SubLObject sequential_direction_p(final SubLObject v_object)
  {
    return ( NIL != conses_high.member( v_object, $valid_sequential_directions$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
  public static SubLObject encode_sequential_direction(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos = Sequences.position( value, $valid_sequential_directions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == pos )
    {
      Errors.error( $str2$_S___S_is_not_a_member_of_the__S_, $sym3$ENCODE_SEQUENTIAL_DIRECTION, value, $sym1$SEQUENTIAL_DIRECTION );
    }
    return pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
  public static SubLObject decode_sequential_direction(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject element = ConsesLow.nth( value, $valid_sequential_directions$.getGlobalValue() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == element )
    {
      Errors.error( $str4$_S___S_is_not_a_valid_encoding_of, $sym5$DECODE_SEQUENTIAL_DIRECTION, value, $sym1$SEQUENTIAL_DIRECTION );
    }
    return element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
  public static SubLObject sequential_direction_less_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == sequential_direction_p( value1 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$SEQUENTIAL_DIRECTION_P, value1, $sym1$SEQUENTIAL_DIRECTION );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == sequential_direction_p( value2 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$SEQUENTIAL_DIRECTION_P, value2, $sym1$SEQUENTIAL_DIRECTION );
    }
    SubLObject cdolist_list_var = $valid_sequential_directions$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value1 ) )
      {
        return makeBoolean( !value3.eql( value2 ) );
      }
      if( value3.eql( value2 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 1661L)
  public static SubLObject sequential_direction_greater_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == sequential_direction_p( value1 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$SEQUENTIAL_DIRECTION_P, value1, $sym1$SEQUENTIAL_DIRECTION );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == sequential_direction_p( value2 ) )
    {
      Errors.error( $str6$_S___S_was_expected_to_be_a_membe, $sym7$SEQUENTIAL_DIRECTION_P, value2, $sym1$SEQUENTIAL_DIRECTION );
    }
    SubLObject cdolist_list_var = $valid_sequential_directions$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value2 ) )
      {
        return makeBoolean( !value3.eql( value1 ) );
      }
      if( value3.eql( value1 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 2028L)
  public static SubLObject iterator_template_p(final SubLObject iterator_template)
  {
    return interfaces.subloop_instanceof_interface( iterator_template, $sym8$ITERATOR_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 2187L)
  public static SubLObject enumerator_template_p(final SubLObject enumerator_template)
  {
    return interfaces.subloop_instanceof_interface( enumerator_template, $sym10$ENUMERATOR_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 2662L)
  public static SubLObject collection_enumerator_template_p(final SubLObject collection_enumerator_template)
  {
    return interfaces.subloop_instanceof_interface( collection_enumerator_template, $sym14$COLLECTION_ENUMERATOR_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8060L)
  public static SubLObject protected_membership_template_p(final SubLObject protected_membership_template)
  {
    return interfaces.subloop_instanceof_interface( protected_membership_template, $sym35$PROTECTED_MEMBERSHIP_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject get_basic_collection_enumerator_direction(final SubLObject basic_collection_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_collection_enumerator, THREE_INTEGER, $sym41$DIRECTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject set_basic_collection_enumerator_direction(final SubLObject basic_collection_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_collection_enumerator, value, THREE_INTEGER, $sym41$DIRECTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject get_basic_collection_enumerator_contents_pointer(final SubLObject basic_collection_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_collection_enumerator, TWO_INTEGER, $sym42$CONTENTS_POINTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject set_basic_collection_enumerator_contents_pointer(final SubLObject basic_collection_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_collection_enumerator, value, TWO_INTEGER, $sym42$CONTENTS_POINTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject get_basic_collection_enumerator_collection_contents(final SubLObject basic_collection_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_collection_enumerator, ONE_INTEGER, $sym43$COLLECTION_CONTENTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject set_basic_collection_enumerator_collection_contents(final SubLObject basic_collection_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_collection_enumerator, value, ONE_INTEGER, $sym43$COLLECTION_CONTENTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject basic_collection_enumerator_previous_method(final SubLObject self)
  {
    if( NIL != basic_collection_enumerator_empty_p_method( self ) )
    {
      return NIL;
    }
    final SubLObject template_collection_contents = basic_collection_enumerator_retrieve_collection_contents_method( self );
    SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method( self );
    if( NIL == template_contents_pointer )
    {
      final SubLObject pcase_var = basic_collection_enumerator_get_direction_method( self );
      if( pcase_var.eql( $kw44$FORWARDS ) )
      {
        template_contents_pointer = conses_high.last( template_collection_contents, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw45$NONE ) )
      {
        template_contents_pointer = conses_high.last( template_collection_contents, UNPROVIDED );
      }
      basic_collection_enumerator_set_contents_pointer_method( self, template_contents_pointer );
      basic_collection_enumerator_set_direction_method( self, $kw46$BACKWARDS );
      return basic_collection_enumerator_current_method( self );
    }
    if( template_collection_contents.eql( template_contents_pointer ) )
    {
      basic_collection_enumerator_set_contents_pointer_method( self, NIL );
      basic_collection_enumerator_set_direction_method( self, $kw46$BACKWARDS );
      return NIL;
    }
    SubLObject sublist;
    for( sublist = NIL, sublist = template_collection_contents; NIL != sublist; sublist = sublist.rest() )
    {
      if( sublist.rest().eql( template_contents_pointer ) )
      {
        basic_collection_enumerator_set_contents_pointer_method( self, sublist );
        basic_collection_enumerator_set_direction_method( self, $kw46$BACKWARDS );
        return basic_collection_enumerator_current_method( self );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject basic_collection_enumerator_next_method(final SubLObject self)
  {
    if( NIL != basic_collection_enumerator_empty_p_method( self ) )
    {
      return NIL;
    }
    SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method( self );
    if( NIL == template_contents_pointer )
    {
      final SubLObject pcase_var = basic_collection_enumerator_get_direction_method( self );
      if( pcase_var.eql( $kw46$BACKWARDS ) )
      {
        template_contents_pointer = basic_collection_enumerator_retrieve_collection_contents_method( self );
      }
      else if( pcase_var.eql( $kw45$NONE ) )
      {
        template_contents_pointer = basic_collection_enumerator_retrieve_collection_contents_method( self );
      }
      basic_collection_enumerator_set_contents_pointer_method( self, template_contents_pointer );
      basic_collection_enumerator_set_direction_method( self, $kw44$FORWARDS );
      return basic_collection_enumerator_current_method( self );
    }
    if( NIL == template_contents_pointer )
    {
      return NIL;
    }
    basic_collection_enumerator_set_contents_pointer_method( self, template_contents_pointer.rest() );
    basic_collection_enumerator_set_direction_method( self, $kw44$FORWARDS );
    return basic_collection_enumerator_current_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject basic_collection_enumerator_last_method(final SubLObject self)
  {
    if( NIL != basic_collection_enumerator_empty_p_method( self ) )
    {
      return NIL;
    }
    basic_collection_enumerator_set_contents_pointer_method( self, conses_high.last( basic_collection_enumerator_retrieve_collection_contents_method( self ), UNPROVIDED ) );
    basic_collection_enumerator_set_direction_method( self, $kw46$BACKWARDS );
    return basic_collection_enumerator_current_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject basic_collection_enumerator_first_method(final SubLObject self)
  {
    basic_collection_enumerator_set_contents_pointer_method( self, basic_collection_enumerator_retrieve_collection_contents_method( self ) );
    basic_collection_enumerator_set_direction_method( self, $kw44$FORWARDS );
    return basic_collection_enumerator_current_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject basic_collection_enumerator_current_method(final SubLObject self)
  {
    if( NIL != basic_collection_enumerator_empty_p_method( self ) )
    {
      return NIL;
    }
    final SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method( self );
    if( NIL != template_contents_pointer )
    {
      return basic_collection_enumerator_get_contents_pointer_method( self ).first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject basic_collection_enumerator_last_p_method(final SubLObject self)
  {
    if( NIL != basic_collection_enumerator_empty_p_method( self ) )
    {
      return T;
    }
    final SubLObject template_contents_pointer = basic_collection_enumerator_get_contents_pointer_method( self );
    if( NIL != template_contents_pointer )
    {
      return Types.sublisp_null( template_contents_pointer.rest() );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject basic_collection_enumerator_first_p_method(final SubLObject self)
  {
    return makeBoolean( NIL != basic_collection_enumerator_empty_p_method( self ) || basic_collection_enumerator_retrieve_collection_contents_method( self ).eql( basic_collection_enumerator_get_contents_pointer_method(
        self ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject basic_collection_enumerator_empty_p_method(final SubLObject self)
  {
    return Types.sublisp_null( basic_collection_enumerator_retrieve_collection_contents_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject subloop_reserved_initialize_basic_collection_enumerator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject subloop_reserved_initialize_basic_collection_enumerator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym37$BASIC_COLLECTION_ENUMERATOR, $sym43$COLLECTION_CONTENTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym37$BASIC_COLLECTION_ENUMERATOR, $sym42$CONTENTS_POINTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym37$BASIC_COLLECTION_ENUMERATOR, $sym41$DIRECTION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 8705L)
  public static SubLObject basic_collection_enumerator_p(final SubLObject basic_collection_enumerator)
  {
    return classes.subloop_instanceof_class( basic_collection_enumerator, $sym37$BASIC_COLLECTION_ENUMERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11165L)
  public static SubLObject basic_collection_enumerator_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
    SubLObject direction = get_basic_collection_enumerator_direction( self );
    SubLObject contents_pointer = get_basic_collection_enumerator_contents_pointer( self );
    SubLObject collection_contents = get_basic_collection_enumerator_collection_contents( self );
    try
    {
      thread.throwStack.push( $sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
      try
      {
        object.object_initialize_method( self );
        collection_contents = NIL;
        contents_pointer = NIL;
        direction = $kw45$NONE;
        Dynamic.sublisp_throw( $sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_enumerator_direction( self, direction );
          set_basic_collection_enumerator_contents_pointer( self, contents_pointer );
          set_basic_collection_enumerator_collection_contents( self, collection_contents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11368L)
  public static SubLObject basic_collection_enumerator_store_collection_contents_method(final SubLObject self, final SubLObject new_collection_contents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
    SubLObject collection_contents = get_basic_collection_enumerator_collection_contents( self );
    try
    {
      thread.throwStack.push( $sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
      try
      {
        collection_contents = new_collection_contents;
        Dynamic.sublisp_throw( $sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, new_collection_contents );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_enumerator_collection_contents( self, collection_contents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11586L)
  public static SubLObject basic_collection_enumerator_retrieve_collection_contents_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
    final SubLObject collection_contents = get_basic_collection_enumerator_collection_contents( self );
    try
    {
      thread.throwStack.push( $sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, collection_contents );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_enumerator_collection_contents( self, collection_contents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11722L)
  public static SubLObject basic_collection_enumerator_set_contents_pointer_method(final SubLObject self, final SubLObject subcontents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
    SubLObject contents_pointer = get_basic_collection_enumerator_contents_pointer( self );
    try
    {
      thread.throwStack.push( $sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
      try
      {
        contents_pointer = subcontents;
        Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, subcontents );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_enumerator_contents_pointer( self, contents_pointer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 11892L)
  public static SubLObject basic_collection_enumerator_get_contents_pointer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
    final SubLObject contents_pointer = get_basic_collection_enumerator_contents_pointer( self );
    try
    {
      thread.throwStack.push( $sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, contents_pointer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_enumerator_contents_pointer( self, contents_pointer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 12017L)
  public static SubLObject basic_collection_enumerator_get_direction_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
    final SubLObject direction = get_basic_collection_enumerator_direction( self );
    try
    {
      thread.throwStack.push( $sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, direction );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_enumerator_direction( self, direction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 12128L)
  public static SubLObject basic_collection_enumerator_set_direction_method(final SubLObject self, final SubLObject new_direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_enumerator_method = NIL;
    SubLObject direction = get_basic_collection_enumerator_direction( self );
    try
    {
      thread.throwStack.push( $sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == sequential_direction_p( new_direction ) )
        {
          Errors.error( $str92$_SET_DIRECTION__S____S_is_not_a_v, self, new_direction, enumerations.enumerate_values( $sym1$SEQUENTIAL_DIRECTION ) );
        }
        direction = new_direction;
        Dynamic.sublisp_throw( $sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD, new_direction );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_enumerator_direction( self, direction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 12490L)
  public static SubLObject collection_template_p(final SubLObject collection_template)
  {
    return interfaces.subloop_instanceof_interface( collection_template, $sym94$COLLECTION_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject get_basic_collection_element_equality_predicate(final SubLObject basic_collection)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_collection, TWO_INTEGER, $sym119$ELEMENT_EQUALITY_PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject set_basic_collection_element_equality_predicate(final SubLObject basic_collection, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_collection, value, TWO_INTEGER, $sym119$ELEMENT_EQUALITY_PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject get_basic_collection_contents(final SubLObject basic_collection)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_collection, ONE_INTEGER, $sym120$CONTENTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject set_basic_collection_contents(final SubLObject basic_collection, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_collection, value, ONE_INTEGER, $sym120$CONTENTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject basic_collection_empty_p_method(final SubLObject self)
  {
    return Types.sublisp_null( basic_collection_get_contents_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject basic_collection_member_p_method(final SubLObject self, final SubLObject element)
  {
    return ( NIL != conses_high.member( element, basic_collection_get_contents_method( self ), basic_collection_get_element_equality_predicate_method( self ), UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject basic_collection_remove_method(final SubLObject self, final SubLObject old_element)
  {
    basic_collection_set_contents_method( self, Sequences.delete( old_element, basic_collection_get_contents_method( self ), basic_collection_get_element_equality_predicate_method( self ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) );
    return old_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject basic_collection_add_method(final SubLObject self, final SubLObject new_element)
  {
    basic_collection_set_contents_method( self, ConsesLow.nconc( basic_collection_get_contents_method( self ), ConsesLow.list( new_element ) ) );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject basic_collection_clear_method(final SubLObject self)
  {
    basic_collection_set_contents_method( self, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject basic_collection_get_element_count_method(final SubLObject self)
  {
    return Sequences.length( basic_collection_get_contents_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject basic_collection_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject template_enumerator = basic_collection_allocate_enumerator_method( self );
    if( NIL == template_enumerator )
    {
      PrintLow.format( stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method( self ) );
      return self;
    }
    if( NIL != methods.funcall_instance_method_with_0_args( template_enumerator, $sym18$EMPTY_P ) )
    {
      PrintLow.format( stream, $str128$__ );
    }
    else
    {
      PrintLow.format( stream, $str129$__S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym27$FIRST ) );
      while ( NIL == methods.funcall_instance_method_with_0_args( template_enumerator, $sym23$LAST_P ))
      {
        PrintLow.format( stream, $str130$___S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym31$NEXT ) );
      }
      PrintLow.format( stream, $str131$_ );
    }
    basic_collection_deallocate_enumerator_method( self, template_enumerator );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject subloop_reserved_initialize_basic_collection_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject subloop_reserved_initialize_basic_collection_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym116$BASIC_COLLECTION, $sym120$CONTENTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym116$BASIC_COLLECTION, $sym119$ELEMENT_EQUALITY_PREDICATE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 15937L)
  public static SubLObject basic_collection_p(final SubLObject basic_collection)
  {
    return classes.subloop_instanceof_class( basic_collection, $sym116$BASIC_COLLECTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18040L)
  public static SubLObject basic_collection_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_method = NIL;
    SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate( self );
    SubLObject contents = get_basic_collection_contents( self );
    try
    {
      thread.throwStack.push( $sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
      try
      {
        object.object_initialize_method( self );
        contents = NIL;
        element_equality_predicate = EQUAL;
        Dynamic.sublisp_throw( $sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_element_equality_predicate( self, element_equality_predicate );
          set_basic_collection_contents( self, contents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_method = Errors.handleThrowable( ccatch_env_var, $sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18208L)
  public static SubLObject basic_collection_element_equal_p_method(final SubLObject self, final SubLObject element1, final SubLObject element2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_method = NIL;
    final SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate( self );
    try
    {
      thread.throwStack.push( $sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
      try
      {
        SubLObject result = NIL;
        final SubLObject pcase_var = element_equality_predicate;
        if( pcase_var.eql( EQUAL ) )
        {
          result = Equality.equal( element1, element2 );
        }
        else if( pcase_var.eql( EQ ) )
        {
          result = Equality.eq( element1, element2 );
        }
        else if( pcase_var.eql( EQL ) )
        {
          result = Equality.eql( element1, element2 );
        }
        else if( pcase_var.eql( EQUALP ) )
        {
          result = Equality.equalp( element1, element2 );
        }
        else if( pcase_var.eql( $sym140$STRING_EQUAL ) )
        {
          result = Strings.string_equal( element1, element2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else if( pcase_var.eql( $sym141$CHAR_ ) )
        {
          result = Characters.charE( element1, element2 );
        }
        else
        {
          result = Functions.funcall( element_equality_predicate, element1, element2 );
        }
        Dynamic.sublisp_throw( $sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_element_equality_predicate( self, element_equality_predicate );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_method = Errors.handleThrowable( ccatch_env_var, $sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18470L)
  public static SubLObject basic_collection_get_element_equality_predicate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_method = NIL;
    final SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate( self );
    try
    {
      thread.throwStack.push( $sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, element_equality_predicate );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_element_equality_predicate( self, element_equality_predicate );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_method = Errors.handleThrowable( ccatch_env_var, $sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18589L)
  public static SubLObject basic_collection_set_element_equality_predicate_method(final SubLObject self, final SubLObject new_predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_method = NIL;
    SubLObject element_equality_predicate = get_basic_collection_element_equality_predicate( self );
    try
    {
      thread.throwStack.push( $sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
      try
      {
        element_equality_predicate = new_predicate;
        Dynamic.sublisp_throw( $sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, new_predicate );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_element_equality_predicate( self, element_equality_predicate );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_method = Errors.handleThrowable( ccatch_env_var, $sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18759L)
  public static SubLObject basic_collection_get_contents_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_method = NIL;
    final SubLObject contents = get_basic_collection_contents( self );
    try
    {
      thread.throwStack.push( $sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, contents );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_contents( self, contents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_method = Errors.handleThrowable( ccatch_env_var, $sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 18842L)
  public static SubLObject basic_collection_set_contents_method(final SubLObject self, final SubLObject new_contents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_method = NIL;
    SubLObject contents = get_basic_collection_contents( self );
    try
    {
      thread.throwStack.push( $sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !new_contents.isList() )
        {
          Errors.error( $str160$_SET_CONTENTS__S____S_is_not_a_va, self, new_contents );
        }
        contents = new_contents;
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_contents( self, contents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_method = Errors.handleThrowable( ccatch_env_var, $sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 19053L)
  public static SubLObject basic_collection_allocate_enumerator_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_collection_method = NIL;
    final SubLObject contents = get_basic_collection_contents( self );
    try
    {
      thread.throwStack.push( $sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
      try
      {
        final SubLObject enumerator = object.object_new_method( $sym37$BASIC_COLLECTION_ENUMERATOR );
        basic_collection_enumerator_store_collection_contents_method( enumerator, contents );
        basic_collection_enumerator_set_contents_pointer_method( enumerator, contents );
        Dynamic.sublisp_throw( $sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD, enumerator );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_collection_contents( self, contents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_collection_method = Errors.handleThrowable( ccatch_env_var, $sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_collection_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 19450L)
  public static SubLObject basic_collection_deallocate_enumerator_method(final SubLObject self, final SubLObject enumerator)
  {
    if( NIL != enumerator )
    {
      basic_collection_enumerator_store_collection_contents_method( enumerator, NIL );
      basic_collection_enumerator_set_contents_pointer_method( enumerator, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 19755L)
  public static SubLObject list_template_p(final SubLObject list_template)
  {
    return interfaces.subloop_instanceof_interface( list_template, $sym170$LIST_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_empty_p_method(final SubLObject self)
  {
    return Types.sublisp_null( basic_collection_get_contents_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_reverse_method(final SubLObject self)
  {
    basic_collection_set_contents_method( self, Sequences.reverse( basic_collection_get_contents_method( self ) ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_append_method(final SubLObject self, final SubLObject other_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == other_list )
    {
      return self;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_template_p( other_list ) )
    {
      Errors.error( $str198$_APPEND__S____S_is_not_an_instanc, self, other_list );
    }
    final SubLObject template_other_list_contents = conses_high.copy_list( methods.funcall_instance_method_with_0_args( other_list, $sym152$GET_CONTENTS ) );
    basic_collection_set_contents_method( self, ConsesLow.nconc( basic_collection_get_contents_method( self ), template_other_list_contents ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_position_method(final SubLObject self, final SubLObject element)
  {
    return Sequences.position( element, basic_collection_get_contents_method( self ), basic_collection_get_element_equality_predicate_method( self ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_set_nth_method(final SubLObject self, final SubLObject index, final SubLObject new_element)
  {
    ConsesLow.set_nth( index, basic_collection_get_contents_method( self ), new_element );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_nth_method(final SubLObject self, final SubLObject index)
  {
    return ConsesLow.nth( index, basic_collection_get_contents_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_but_last_method(final SubLObject self)
  {
    final SubLObject template_contents = basic_collection_get_contents_method( self );
    if( NIL == template_contents )
    {
      return NIL;
    }
    if( NIL == template_contents.rest() )
    {
      basic_collection_set_contents_method( self, NIL );
      return template_contents.first();
    }
    SubLObject template_contents_sublist;
    SubLObject template_result;
    for( template_contents_sublist = NIL, template_contents_sublist = template_contents; NIL != template_contents_sublist; template_contents_sublist = template_contents_sublist.rest() )
    {
      if( NIL == conses_high.cddr( template_contents_sublist ) )
      {
        template_result = conses_high.cadr( template_contents_sublist );
        ConsesLow.rplacd( template_contents_sublist, NIL );
        return template_result;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_pop_method(final SubLObject self)
  {
    final SubLObject template_contents = basic_collection_get_contents_method( self );
    if( NIL == template_contents )
    {
      return NIL;
    }
    basic_collection_set_contents_method( self, template_contents.rest() );
    return template_contents.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_push_method(final SubLObject self, final SubLObject new_element)
  {
    basic_collection_set_contents_method( self, ConsesLow.cons( new_element, basic_collection_get_contents_method( self ) ) );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject template_enumerator = basic_collection_allocate_enumerator_method( self );
    if( NIL == template_enumerator )
    {
      PrintLow.format( stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method( self ) );
      return self;
    }
    if( NIL != methods.funcall_instance_method_with_0_args( template_enumerator, $sym18$EMPTY_P ) )
    {
      PrintLow.format( stream, $str206$LIST___ );
    }
    else
    {
      PrintLow.format( stream, $str207$LIST___S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym27$FIRST ) );
      while ( NIL == methods.funcall_instance_method_with_0_args( template_enumerator, $sym23$LAST_P ))
      {
        PrintLow.format( stream, $str130$___S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym31$NEXT ) );
      }
      PrintLow.format( stream, $str131$_ );
    }
    basic_collection_deallocate_enumerator_method( self, template_enumerator );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject subloop_reserved_initialize_basic_list_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject subloop_reserved_initialize_basic_list_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym116$BASIC_COLLECTION, $sym120$CONTENTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym116$BASIC_COLLECTION, $sym119$ELEMENT_EQUALITY_PREDICATE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 23478L)
  public static SubLObject basic_list_p(final SubLObject basic_list)
  {
    return classes.subloop_instanceof_class( basic_list, $sym193$BASIC_LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 24266L)
  public static SubLObject end_pointer_list_template_p(final SubLObject end_pointer_list_template)
  {
    return interfaces.subloop_instanceof_interface( end_pointer_list_template, $sym211$END_POINTER_LIST_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject get_basic_end_pointer_list_end_pointer(final SubLObject basic_end_pointer_list)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_end_pointer_list, THREE_INTEGER, $sym225$END_POINTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject set_basic_end_pointer_list_end_pointer(final SubLObject basic_end_pointer_list, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_end_pointer_list, value, THREE_INTEGER, $sym225$END_POINTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_empty_p_method(final SubLObject self)
  {
    return Types.sublisp_null( basic_collection_get_contents_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_reverse_method(final SubLObject self)
  {
    final SubLObject template_contents_reversed = Sequences.reverse( basic_collection_get_contents_method( self ) );
    basic_collection_set_contents_method( self, template_contents_reversed );
    basic_end_pointer_list_set_end_pointer_method( self, conses_high.last( template_contents_reversed, UNPROVIDED ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_append_method(final SubLObject self, final SubLObject other_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == other_list )
    {
      return self;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_template_p( other_list ) )
    {
      Errors.error( $str198$_APPEND__S____S_is_not_an_instanc, self, other_list );
    }
    final SubLObject template_other_list_contents = conses_high.copy_list( methods.funcall_instance_method_with_0_args( other_list, $sym152$GET_CONTENTS ) );
    basic_collection_set_contents_method( self, ConsesLow.nconc( basic_collection_get_contents_method( self ), template_other_list_contents ) );
    basic_end_pointer_list_set_end_pointer_method( self, conses_high.last( template_other_list_contents, UNPROVIDED ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_position_method(final SubLObject self, final SubLObject element)
  {
    return Sequences.position( element, basic_collection_get_contents_method( self ), basic_collection_get_element_equality_predicate_method( self ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_nth_method(final SubLObject self, final SubLObject index)
  {
    return ConsesLow.nth( index, basic_collection_get_contents_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_but_last_method(final SubLObject self)
  {
    final SubLObject template_contents = basic_collection_get_contents_method( self );
    final SubLObject template_end_pointer = basic_end_pointer_list_get_end_pointer_method( self );
    if( NIL == template_contents )
    {
      return NIL;
    }
    if( NIL == template_contents.rest() )
    {
      basic_collection_set_contents_method( self, NIL );
      basic_end_pointer_list_set_end_pointer_method( self, NIL );
      return template_contents.first();
    }
    SubLObject template_contents_sublist;
    SubLObject template_result;
    for( template_contents_sublist = NIL, template_contents_sublist = template_contents; NIL != template_contents_sublist; template_contents_sublist = template_contents_sublist.rest() )
    {
      if( template_contents_sublist.rest().eql( template_end_pointer ) )
      {
        template_result = template_end_pointer.first();
        ConsesLow.rplacd( template_contents_sublist, NIL );
        basic_end_pointer_list_set_end_pointer_method( self, template_contents_sublist );
        return template_result;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_pop_method(final SubLObject self)
  {
    final SubLObject template_contents = basic_collection_get_contents_method( self );
    if( NIL == template_contents )
    {
      return NIL;
    }
    if( NIL == template_contents.rest() )
    {
      basic_collection_set_contents_method( self, NIL );
      basic_end_pointer_list_set_end_pointer_method( self, NIL );
      return template_contents.first();
    }
    basic_collection_set_contents_method( self, template_contents.rest() );
    return template_contents.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_push_method(final SubLObject self, final SubLObject new_element)
  {
    SubLObject template_contents = basic_collection_get_contents_method( self );
    if( NIL == template_contents )
    {
      template_contents = ConsesLow.list( new_element );
      basic_collection_set_contents_method( self, template_contents );
      basic_end_pointer_list_set_end_pointer_method( self, template_contents );
      return new_element;
    }
    basic_collection_set_contents_method( self, ConsesLow.cons( new_element, template_contents ) );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_remove_method(final SubLObject self, final SubLObject old_element)
  {
    final SubLObject template_contents = basic_collection_get_contents_method( self );
    final SubLObject template_end_pointer = basic_end_pointer_list_get_end_pointer_method( self );
    if( NIL == template_contents )
    {
      return NIL;
    }
    if( NIL != basic_collection_element_equal_p_method( self, old_element, template_contents.first() ) )
    {
      if( template_contents.eql( template_end_pointer ) )
      {
        basic_collection_set_contents_method( self, NIL );
        basic_end_pointer_list_set_end_pointer_method( self, NIL );
        return old_element;
      }
      basic_collection_set_contents_method( self, template_contents.rest() );
      return old_element;
    }
    else
    {
      SubLObject template_current_cons;
      for( template_current_cons = template_contents; !template_current_cons.rest().eql( template_end_pointer ); template_current_cons = template_current_cons.rest() )
      {
        if( NIL != basic_collection_element_equal_p_method( self, old_element, conses_high.cadr( template_current_cons ) ) )
        {
          ConsesLow.rplacd( template_current_cons, conses_high.cddr( template_current_cons ) );
          return old_element;
        }
      }
      if( NIL != basic_collection_element_equal_p_method( self, old_element, conses_high.cadr( template_current_cons ) ) )
      {
        ConsesLow.rplacd( template_current_cons, NIL );
        basic_end_pointer_list_set_end_pointer_method( self, template_current_cons );
        return old_element;
      }
      return old_element;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_add_method(final SubLObject self, final SubLObject new_element)
  {
    SubLObject template_contents = basic_collection_get_contents_method( self );
    SubLObject template_end_pointer = basic_end_pointer_list_get_end_pointer_method( self );
    if( NIL == template_contents )
    {
      template_contents = ( template_end_pointer = ConsesLow.list( new_element ) );
    }
    else
    {
      ConsesLow.rplacd( template_end_pointer, ConsesLow.list( new_element ) );
      template_end_pointer = template_end_pointer.rest();
    }
    basic_collection_set_contents_method( self, template_contents );
    basic_end_pointer_list_set_end_pointer_method( self, template_end_pointer );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_clear_method(final SubLObject self)
  {
    basic_collection_set_contents_method( self, NIL );
    basic_end_pointer_list_set_end_pointer_method( self, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject template_enumerator = basic_collection_allocate_enumerator_method( self );
    if( NIL == template_enumerator )
    {
      PrintLow.format( stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method( self ) );
      return self;
    }
    if( NIL != methods.funcall_instance_method_with_0_args( template_enumerator, $sym18$EMPTY_P ) )
    {
      PrintLow.format( stream, $str206$LIST___ );
    }
    else
    {
      PrintLow.format( stream, $str207$LIST___S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym27$FIRST ) );
      while ( NIL == methods.funcall_instance_method_with_0_args( template_enumerator, $sym23$LAST_P ))
      {
        PrintLow.format( stream, $str130$___S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym31$NEXT ) );
      }
      PrintLow.format( stream, $str131$_ );
    }
    basic_collection_deallocate_enumerator_method( self, template_enumerator );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject subloop_reserved_initialize_basic_end_pointer_list_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject subloop_reserved_initialize_basic_end_pointer_list_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym116$BASIC_COLLECTION, $sym120$CONTENTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym116$BASIC_COLLECTION, $sym119$ELEMENT_EQUALITY_PREDICATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym222$BASIC_END_POINTER_LIST, $sym225$END_POINTER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 29133L)
  public static SubLObject basic_end_pointer_list_p(final SubLObject basic_end_pointer_list)
  {
    return classes.subloop_instanceof_class( basic_end_pointer_list, $sym222$BASIC_END_POINTER_LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30232L)
  public static SubLObject basic_end_pointer_list_get_end_pointer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_end_pointer_list_method = NIL;
    final SubLObject end_pointer = get_basic_end_pointer_list_end_pointer( self );
    try
    {
      thread.throwStack.push( $sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD, end_pointer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_end_pointer_list_end_pointer( self, end_pointer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_end_pointer_list_method = Errors.handleThrowable( ccatch_env_var, $sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_end_pointer_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30327L)
  public static SubLObject basic_end_pointer_list_set_end_pointer_method(final SubLObject self, final SubLObject new_end_pointer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_end_pointer_list_method = NIL;
    SubLObject end_pointer = get_basic_end_pointer_list_end_pointer( self );
    try
    {
      thread.throwStack.push( $sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD );
      try
      {
        end_pointer = new_end_pointer;
        Dynamic.sublisp_throw( $sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD, new_end_pointer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_end_pointer_list_end_pointer( self, end_pointer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_end_pointer_list_method = Errors.handleThrowable( ccatch_env_var, $sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_end_pointer_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject double_link_cell_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject double_link_cell_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $double_link_cell_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject dlc_owner(final SubLObject v_object)
  {
    assert NIL != double_link_cell_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject dlc_contents(final SubLObject v_object)
  {
    assert NIL != double_link_cell_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject dlc_previous(final SubLObject v_object)
  {
    assert NIL != double_link_cell_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject dlc_next(final SubLObject v_object)
  {
    assert NIL != double_link_cell_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject _csetf_dlc_owner(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != double_link_cell_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject _csetf_dlc_contents(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != double_link_cell_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject _csetf_dlc_previous(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != double_link_cell_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject _csetf_dlc_next(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != double_link_cell_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject make_double_link_cell(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $double_link_cell_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw266$OWNER ) )
      {
        _csetf_dlc_owner( v_new, current_value );
      }
      else if( pcase_var.eql( $kw267$CONTENTS ) )
      {
        _csetf_dlc_contents( v_new, current_value );
      }
      else if( pcase_var.eql( $kw268$PREVIOUS ) )
      {
        _csetf_dlc_previous( v_new, current_value );
      }
      else if( pcase_var.eql( $kw269$NEXT ) )
      {
        _csetf_dlc_next( v_new, current_value );
      }
      else
      {
        Errors.error( $str270$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject visit_defstruct_double_link_cell(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw271$BEGIN, $sym272$MAKE_DOUBLE_LINK_CELL, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw273$SLOT, $kw266$OWNER, dlc_owner( obj ) );
    Functions.funcall( visitor_fn, obj, $kw273$SLOT, $kw267$CONTENTS, dlc_contents( obj ) );
    Functions.funcall( visitor_fn, obj, $kw273$SLOT, $kw268$PREVIOUS, dlc_previous( obj ) );
    Functions.funcall( visitor_fn, obj, $kw273$SLOT, $kw269$NEXT, dlc_next( obj ) );
    Functions.funcall( visitor_fn, obj, $kw274$END, $sym272$MAKE_DOUBLE_LINK_CELL, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30479L)
  public static SubLObject visit_defstruct_object_double_link_cell_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_double_link_cell( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30717L)
  public static SubLObject with_dlc_read_only(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject dlc = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    dlc = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject dlc_var = Symbols.make_symbol( $str277$dlc );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( dlc_var, dlc, $sym278$DLC_, $list251, forms, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 30962L)
  public static SubLObject with_dlc_read_write(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject dlc = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list276 );
    dlc = current.first();
    final SubLObject forms;
    current = ( forms = current.rest() );
    final SubLObject dlc_var = Symbols.make_symbol( $str277$dlc );
    return utilities_macros.generate_instance_variable_bindings_for_structure_slots( dlc_var, dlc, $sym278$DLC_, $list251, forms, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 31190L)
  public static SubLObject dlc_copy_links(final SubLObject dlc, final SubLObject new_owner)
  {
    if( NIL == dlc )
    {
      return Values.values( NIL, NIL );
    }
    SubLObject current_source = dlc;
    SubLObject first_destin = NIL;
    SubLObject current_destin = NIL;
    SubLObject previous_destin = NIL;
    while ( NIL != current_source)
    {
      current_destin = make_double_link_cell( UNPROVIDED );
      if( NIL == first_destin )
      {
        first_destin = current_destin;
      }
      _csetf_dlc_owner( current_destin, new_owner );
      _csetf_dlc_contents( current_destin, dlc_contents( current_source ) );
      _csetf_dlc_previous( current_destin, previous_destin );
      if( NIL != previous_destin )
      {
        _csetf_dlc_next( previous_destin, current_destin );
      }
      previous_destin = current_destin;
      current_source = dlc_next( current_source );
    }
    return Values.values( first_destin, current_destin );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 31938L)
  public static SubLObject list_element_template_p(final SubLObject list_element_template)
  {
    return interfaces.subloop_instanceof_interface( list_element_template, $sym279$LIST_ELEMENT_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject get_basic_list_element_qua_list_element_parent_links(final SubLObject basic_list_element)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_list_element, ONE_INTEGER, $sym308$QUA_LIST_ELEMENT_PARENT_LINKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject set_basic_list_element_qua_list_element_parent_links(final SubLObject basic_list_element, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_list_element, value, ONE_INTEGER, $sym308$QUA_LIST_ELEMENT_PARENT_LINKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject get_basic_list_element_qua_list_element_self_deletion_mode(final SubLObject basic_list_element)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_list_element );
    final SubLObject slot = slots.slot_assoc( $sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_list_element, slot );
    return classes.ldb_test( $int310$4097, subloop_structures.instance_boolean_slots( basic_list_element ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject set_basic_list_element_qua_list_element_self_deletion_mode(final SubLObject basic_list_element, final SubLObject value)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_list_element );
    final SubLObject slot = slots.slot_assoc( $sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_list_element, slot );
    subloop_structures._csetf_instance_boolean_slots( basic_list_element, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, $int310$4097, subloop_structures.instance_boolean_slots( basic_list_element ) ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_perform_action_method(final SubLObject self, final SubLObject action, final SubLObject parameters)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_on_delete_method(final SubLObject self, final SubLObject parent_list)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_on_add_method(final SubLObject self, final SubLObject parent_list)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_get_collections_method(final SubLObject self)
  {
    final SubLObject template_parent_links = basic_list_element_get_parent_links_method( self );
    SubLObject template_collections = NIL;
    final SubLObject list_expression = template_parent_links;
    if( NIL == list_expression )
    {
      template_collections = NIL;
    }
    else if( list_expression.isAtom() )
    {
      template_collections = ConsesLow.list( list_expression );
    }
    else if( NIL == list_expression.rest() )
    {
      final SubLObject template_parent_link = list_expression.first();
      template_collections = ConsesLow.list( dlc_owner( template_parent_link ) );
    }
    else
    {
      SubLObject tail_cons = NIL;
      SubLObject result = NIL;
      final SubLObject template_parent_link2 = list_expression.first();
      template_collections = ( tail_cons = ConsesLow.list( dlc_owner( template_parent_link2 ) ) );
      SubLObject cdolist_list_var = list_expression.rest();
      SubLObject template_parent_link3 = NIL;
      template_parent_link3 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.list( dlc_owner( template_parent_link3 ) );
        ConsesLow.rplacd( tail_cons, result );
        tail_cons = result;
        cdolist_list_var = cdolist_list_var.rest();
        template_parent_link3 = cdolist_list_var.first();
      }
    }
    return list_utilities.unique_elements( template_collections, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_member_p_method(final SubLObject self, final SubLObject collection)
  {
    SubLObject cdolist_list_var;
    final SubLObject template_parent_links = cdolist_list_var = basic_list_element_get_parent_links_method( self );
    SubLObject template_parent_link = NIL;
    template_parent_link = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( dlc_owner( template_parent_link ).eql( collection ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      template_parent_link = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_delete_self_from_all_collections_method(final SubLObject self)
  {
    final SubLObject template_parent_links = basic_list_element_get_parent_links_method( self );
    try
    {
      basic_list_element_set_self_deletion_mode_method( self, T );
      SubLObject cdolist_list_var = template_parent_links;
      SubLObject template_parent_link = NIL;
      template_parent_link = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        generic_dllt_delete_link_function( dlc_owner( template_parent_link ), template_parent_link );
        _csetf_dlc_owner( template_parent_link, NIL );
        cdolist_list_var = cdolist_list_var.rest();
        template_parent_link = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        basic_list_element_set_self_deletion_mode_method( self, NIL );
        basic_list_element_set_parent_links_method( self, NIL );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_transfer_self_method(final SubLObject self, final SubLObject current_collection, final SubLObject new_collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == collection_template_p( current_collection ) )
    {
      Errors.error( $str317$_TRANSFER_SELF__S____S_is_not_an_, self, current_collection );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == collection_template_p( current_collection ) )
    {
      Errors.error( $str317$_TRANSFER_SELF__S____S_is_not_an_, self, new_collection );
    }
    final SubLObject template_parent_links = basic_list_element_get_parent_links_method( self );
    SubLObject template_parent_link = NIL;
    SubLObject template_target_link = NIL;
    if( NIL != template_parent_links )
    {
      if( dlc_owner( template_parent_links.first() ).eql( current_collection ) )
      {
        template_target_link = template_parent_links.first();
        basic_list_element_set_parent_links_method( self, template_parent_links.rest() );
      }
      else
      {
        SubLObject template_previous = template_parent_links;
        SubLObject template_sublinks = template_previous.rest();
        while ( NIL != template_sublinks)
        {
          template_parent_link = template_sublinks.first();
          if( dlc_owner( template_parent_link ).eql( current_collection ) )
          {
            template_target_link = template_parent_link;
            ConsesLow.rplacd( template_previous, template_sublinks.rest() );
            template_sublinks = NIL;
          }
          else
          {
            template_previous = template_sublinks;
            template_sublinks = template_sublinks.rest();
          }
        }
      }
      if( NIL != template_target_link )
      {
        try
        {
          basic_list_element_set_self_deletion_mode_method( self, T );
          generic_dllt_delete_link_function( dlc_owner( template_target_link ), template_target_link );
        }
        finally
        {
          final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            _csetf_dlc_owner( template_target_link, NIL );
            methods.funcall_instance_method_with_1_args( new_collection, $sym106$ADD, self );
            basic_list_element_set_self_deletion_mode_method( self, NIL );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_delete_self_from_collection_method(final SubLObject self, final SubLObject collection)
  {
    final SubLObject template_parent_links = basic_list_element_get_parent_links_method( self );
    SubLObject template_parent_link = NIL;
    SubLObject template_target_link = NIL;
    if( NIL != template_parent_links )
    {
      if( dlc_owner( template_parent_links.first() ).eql( collection ) )
      {
        template_target_link = template_parent_links.first();
        basic_list_element_set_parent_links_method( self, template_parent_links.rest() );
      }
      else
      {
        SubLObject template_previous = template_parent_links;
        SubLObject template_sublinks = template_previous.rest();
        while ( NIL != template_sublinks)
        {
          template_parent_link = template_sublinks.first();
          if( dlc_owner( template_parent_link ).eql( collection ) )
          {
            template_target_link = template_parent_link;
            ConsesLow.rplacd( template_previous, template_sublinks.rest() );
            template_sublinks = NIL;
          }
          else
          {
            template_previous = template_sublinks;
            template_sublinks = template_sublinks.rest();
          }
        }
      }
      if( NIL != template_target_link )
      {
        try
        {
          basic_list_element_set_self_deletion_mode_method( self, T );
          generic_dllt_delete_link_function( dlc_owner( template_target_link ), template_target_link );
        }
        finally
        {
          final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
          try
          {
            Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
            final SubLObject _values = Values.getValuesAsVector();
            _csetf_dlc_owner( template_target_link, NIL );
            methods.funcall_instance_method_with_1_args( self, $sym301$ON_DELETE, collection );
            basic_list_element_set_self_deletion_mode_method( self, NIL );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
          }
        }
      }
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_delete_parent_link_method(final SubLObject self, final SubLObject old_parent_link)
  {
    final SubLObject template_parent_links = basic_list_element_get_parent_links_method( self );
    if( NIL != template_parent_links )
    {
      if( old_parent_link.eql( template_parent_links ) )
      {
        basic_list_element_set_parent_links_method( self, template_parent_links.rest() );
      }
      else
      {
        SubLObject template_previous_cons = template_parent_links;
        for( SubLObject template_current_cons = template_parent_links.rest(); NIL != template_current_cons; template_current_cons = template_current_cons.rest() )
        {
          if( old_parent_link.eql( template_current_cons.first() ) )
          {
            ConsesLow.rplacd( template_previous_cons, template_current_cons.rest() );
            methods.funcall_instance_method_with_1_args( self, $sym301$ON_DELETE, dlc_owner( old_parent_link ) );
            return old_parent_link;
          }
          template_previous_cons = template_current_cons;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_add_parent_link_method(final SubLObject self, final SubLObject new_parent_link)
  {
    basic_list_element_set_parent_links_method( self, ConsesLow.cons( new_parent_link, basic_list_element_get_parent_links_method( self ) ) );
    methods.funcall_instance_method_with_1_args( self, $sym298$ON_ADD, dlc_owner( new_parent_link ) );
    return new_parent_link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject subloop_reserved_initialize_basic_list_element_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject subloop_reserved_initialize_basic_list_element_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym305$BASIC_LIST_ELEMENT, $sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym305$BASIC_LIST_ELEMENT, $sym308$QUA_LIST_ELEMENT_PARENT_LINKS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 38946L)
  public static SubLObject basic_list_element_p(final SubLObject basic_list_element)
  {
    return classes.subloop_instanceof_class( basic_list_element, $sym305$BASIC_LIST_ELEMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40341L)
  public static SubLObject basic_list_element_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_list_element_method = NIL;
    SubLObject qua_list_element_parent_links = get_basic_list_element_qua_list_element_parent_links( self );
    SubLObject qua_list_element_self_deletion_mode = get_basic_list_element_qua_list_element_self_deletion_mode( self );
    try
    {
      thread.throwStack.push( $sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
      try
      {
        object.object_initialize_method( self );
        qua_list_element_self_deletion_mode = NIL;
        qua_list_element_parent_links = NIL;
        Dynamic.sublisp_throw( $sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_list_element_qua_list_element_parent_links( self, qua_list_element_parent_links );
          set_basic_list_element_qua_list_element_self_deletion_mode( self, qua_list_element_self_deletion_mode );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_list_element_method = Errors.handleThrowable( ccatch_env_var, $sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_list_element_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40538L)
  public static SubLObject basic_list_element_get_parent_links_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_list_element_method = NIL;
    final SubLObject qua_list_element_parent_links = get_basic_list_element_qua_list_element_parent_links( self );
    try
    {
      thread.throwStack.push( $sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, qua_list_element_parent_links );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_list_element_qua_list_element_parent_links( self, qua_list_element_parent_links );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_list_element_method = Errors.handleThrowable( ccatch_env_var, $sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_list_element_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40651L)
  public static SubLObject basic_list_element_set_parent_links_method(final SubLObject self, final SubLObject new_parent_links)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_list_element_method = NIL;
    SubLObject qua_list_element_parent_links = get_basic_list_element_qua_list_element_parent_links( self );
    try
    {
      thread.throwStack.push( $sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
      try
      {
        qua_list_element_parent_links = new_parent_links;
        Dynamic.sublisp_throw( $sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, new_parent_links );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_list_element_qua_list_element_parent_links( self, qua_list_element_parent_links );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_list_element_method = Errors.handleThrowable( ccatch_env_var, $sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_list_element_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40824L)
  public static SubLObject basic_list_element_get_self_deletion_mode_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_list_element_method = NIL;
    final SubLObject qua_list_element_self_deletion_mode = get_basic_list_element_qua_list_element_self_deletion_mode( self );
    try
    {
      thread.throwStack.push( $sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, qua_list_element_self_deletion_mode );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_list_element_qua_list_element_self_deletion_mode( self, qua_list_element_self_deletion_mode );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_list_element_method = Errors.handleThrowable( ccatch_env_var, $sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_list_element_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 40949L)
  public static SubLObject basic_list_element_set_self_deletion_mode_method(final SubLObject self, final SubLObject mode)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_list_element_method = NIL;
    SubLObject qua_list_element_self_deletion_mode = get_basic_list_element_qua_list_element_self_deletion_mode( self );
    try
    {
      thread.throwStack.push( $sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
      try
      {
        qua_list_element_self_deletion_mode = mode;
        Dynamic.sublisp_throw( $sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD, mode );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_list_element_qua_list_element_self_deletion_mode( self, qua_list_element_self_deletion_mode );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_list_element_method = Errors.handleThrowable( ccatch_env_var, $sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_list_element_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 41098L)
  public static SubLObject doubly_linked_list_template_p(final SubLObject doubly_linked_list_template)
  {
    return interfaces.subloop_instanceof_interface( doubly_linked_list_template, $sym345$DOUBLY_LINKED_LIST_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject get_basic_doubly_linked_list_last_link(final SubLObject basic_doubly_linked_list)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_list, FOUR_INTEGER, $sym377$LAST_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject set_basic_doubly_linked_list_last_link(final SubLObject basic_doubly_linked_list, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_list, value, FOUR_INTEGER, $sym377$LAST_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject get_basic_doubly_linked_list_first_link(final SubLObject basic_doubly_linked_list)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_list, THREE_INTEGER, $sym378$FIRST_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject set_basic_doubly_linked_list_first_link(final SubLObject basic_doubly_linked_list, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_list, value, THREE_INTEGER, $sym378$FIRST_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject get_basic_doubly_linked_list_element_count(final SubLObject basic_doubly_linked_list)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_list, TWO_INTEGER, $sym379$ELEMENT_COUNT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject set_basic_doubly_linked_list_element_count(final SubLObject basic_doubly_linked_list, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_list, value, TWO_INTEGER, $sym379$ELEMENT_COUNT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject get_basic_doubly_linked_list_element_equality_predicate(final SubLObject basic_doubly_linked_list)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_list, ONE_INTEGER, $sym119$ELEMENT_EQUALITY_PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject set_basic_doubly_linked_list_element_equality_predicate(final SubLObject basic_doubly_linked_list, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_list, value, ONE_INTEGER, $sym119$ELEMENT_EQUALITY_PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_swap_method(final SubLObject self, final SubLObject element1, final SubLObject element2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( element1.eql( element2 ) )
    {
      return NIL;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == element1 || NIL == element2 ) )
    {
      Errors.error( $str380$_SWAP__S___Cannot_swap_NIL_elemen, self );
    }
    final SubLObject link1 = basic_doubly_linked_list_find_link_method( self, element1 );
    final SubLObject link2 = basic_doubly_linked_list_find_link_method( self, element2 );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == link1 )
    {
      Errors.error( $str381$_SWAP__S____S_is_not_an_element_o, self, element1 );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == link2 )
    {
      Errors.error( $str381$_SWAP__S____S_is_not_an_element_o, self, element2 );
    }
    if( NIL != list_element_template_p( element1 ) )
    {
      methods.funcall_instance_method_with_1_args( element1, $sym284$DELETE_PARENT_LINK, link1 );
      methods.funcall_instance_method_with_1_args( element1, $sym281$ADD_PARENT_LINK, link2 );
    }
    if( NIL != list_element_template_p( element2 ) )
    {
      methods.funcall_instance_method_with_1_args( element2, $sym284$DELETE_PARENT_LINK, link2 );
      methods.funcall_instance_method_with_1_args( element2, $sym281$ADD_PARENT_LINK, link1 );
    }
    _csetf_dlc_contents( link1, element2 );
    _csetf_dlc_contents( link2, element1 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_empty_p_method(final SubLObject self)
  {
    return Types.sublisp_null( basic_doubly_linked_list_get_first_link_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_reverse_method(final SubLObject self)
  {
    final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method( self );
    final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method( self );
    if( NIL == template_first_link )
    {
      return self;
    }
    if( template_first_link.eql( template_last_link ) )
    {
      return self;
    }
    for( SubLObject template_current_link = template_first_link, template_next_link = NIL; NIL != template_current_link; template_current_link = template_next_link )
    {
      template_next_link = dlc_next( template_current_link );
      basic_doubly_linked_list_reverse_link_method( self, template_current_link );
    }
    basic_doubly_linked_list_set_first_link_method( self, template_last_link );
    basic_doubly_linked_list_set_last_link_method( self, template_first_link );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_append_method(final SubLObject self, final SubLObject other_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == other_list )
    {
      return self;
    }
    if( other_list.isCons() )
    {
      SubLObject cdolist_list_var = other_list;
      SubLObject template_element = NIL;
      template_element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        basic_doubly_linked_list_add_method( self, template_element );
        cdolist_list_var = cdolist_list_var.rest();
        template_element = cdolist_list_var.first();
      }
      return self;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_template_p( other_list ) )
    {
      Errors.error( $str385$_APPEND__S___Cannot_append_non_li, self, other_list );
    }
    final SubLObject template_enumerator = methods.funcall_instance_method_with_0_args( other_list, $sym162$ALLOCATE_ENUMERATOR );
    if( NIL == template_enumerator )
    {
      return self;
    }
    if( NIL != methods.funcall_instance_method_with_0_args( template_enumerator, $sym18$EMPTY_P ) )
    {
      return self;
    }
    for( SubLObject template_element = methods.funcall_instance_method_with_0_args( template_enumerator, $sym27$FIRST ); NIL != template_element; template_element = methods.funcall_instance_method_with_0_args(
        template_enumerator, $sym31$NEXT ) )
    {
      basic_doubly_linked_list_add_method( self, template_element );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_position_method(final SubLObject self, final SubLObject element)
  {
    SubLObject template_links = basic_doubly_linked_list_get_first_link_method( self );
    SubLObject count = ZERO_INTEGER;
    if( NIL == template_links )
    {
      return NIL;
    }
    while ( NIL != template_links)
    {
      if( NIL != basic_doubly_linked_list_element_equal_p_method( self, element, dlc_contents( template_links ) ) )
      {
        return count;
      }
      count = Numbers.add( count, ONE_INTEGER );
      template_links = dlc_next( template_links );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_set_nth_method(final SubLObject self, final SubLObject index, final SubLObject new_element)
  {
    final SubLObject template_link = basic_doubly_linked_list_find_nth_link_method( self, index );
    if( NIL != template_link )
    {
      final SubLObject template_content = dlc_contents( template_link );
      if( NIL != list_element_template_p( template_content ) )
      {
        generic_dllt_delete_parent_link_function( template_content, template_link );
      }
      _csetf_dlc_contents( template_link, new_element );
      if( NIL != list_element_template_p( new_element ) )
      {
        generic_dllt_add_parent_link_function( new_element, template_link );
      }
      return new_element;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_nth_method(final SubLObject self, final SubLObject index)
  {
    final SubLObject template_link = basic_doubly_linked_list_find_nth_link_method( self, index );
    if( NIL != template_link )
    {
      return dlc_contents( template_link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_but_last_method(final SubLObject self)
  {
    final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method( self );
    if( NIL != template_last_link )
    {
      final SubLObject template_contents = dlc_contents( template_last_link );
      basic_doubly_linked_list_delete_link_method( self, template_last_link );
      return template_contents;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_pop_method(final SubLObject self)
  {
    final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method( self );
    if( NIL != template_first_link )
    {
      final SubLObject template_contents = dlc_contents( template_first_link );
      basic_doubly_linked_list_delete_link_method( self, template_first_link );
      return template_contents;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_push_method(final SubLObject self, final SubLObject new_element)
  {
    final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method( self );
    final SubLObject template_new_link = make_double_link_cell( UNPROVIDED );
    _csetf_dlc_contents( template_new_link, new_element );
    _csetf_dlc_owner( template_new_link, self );
    if( NIL != template_first_link )
    {
      _csetf_dlc_next( template_new_link, template_first_link );
      _csetf_dlc_previous( template_first_link, template_new_link );
      basic_doubly_linked_list_set_first_link_method( self, template_new_link );
    }
    else
    {
      basic_doubly_linked_list_set_first_link_method( self, template_new_link );
      basic_doubly_linked_list_set_last_link_method( self, template_new_link );
    }
    if( NIL != list_element_template_p( new_element ) )
    {
      generic_dllt_add_parent_link_function( new_element, template_new_link );
    }
    basic_doubly_linked_list_inc_element_count_method( self );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_member_p_method(final SubLObject self, final SubLObject element)
  {
    final SubLObject template_link = basic_doubly_linked_list_find_link_method( self, element );
    return ( NIL != template_link ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_remove_method(final SubLObject self, final SubLObject old_element)
  {
    if( NIL != list_element_template_p( old_element ) )
    {
      generic_dllt_delete_self_from_collection_function( old_element, self );
    }
    else
    {
      final SubLObject template_link = basic_doubly_linked_list_find_link_method( self, old_element );
      if( NIL != template_link )
      {
        basic_doubly_linked_list_delete_link_method( self, template_link );
      }
    }
    return old_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_add_method(final SubLObject self, final SubLObject new_element)
  {
    final SubLObject template_new_link = make_double_link_cell( UNPROVIDED );
    final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method( self );
    _csetf_dlc_contents( template_new_link, new_element );
    _csetf_dlc_owner( template_new_link, self );
    if( NIL != template_last_link )
    {
      _csetf_dlc_next( template_last_link, template_new_link );
      _csetf_dlc_previous( template_new_link, template_last_link );
    }
    else
    {
      basic_doubly_linked_list_set_first_link_method( self, template_new_link );
    }
    basic_doubly_linked_list_set_last_link_method( self, template_new_link );
    if( NIL != list_element_template_p( new_element ) )
    {
      generic_dllt_add_parent_link_function( new_element, template_new_link );
    }
    basic_doubly_linked_list_inc_element_count_method( self );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_clear_method(final SubLObject self)
  {
    SubLObject cdolist_list_var;
    final SubLObject template_contents = cdolist_list_var = basic_doubly_linked_list_get_contents_method( self );
    SubLObject template_element = NIL;
    template_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      basic_doubly_linked_list_remove_method( self, template_element );
      cdolist_list_var = cdolist_list_var.rest();
      template_element = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject template_enumerator = basic_doubly_linked_list_allocate_enumerator_method( self );
    if( NIL == template_enumerator )
    {
      PrintLow.format( stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method( self ) );
      return self;
    }
    if( NIL != methods.funcall_instance_method_with_0_args( template_enumerator, $sym18$EMPTY_P ) )
    {
      PrintLow.format( stream, $str397$DLIST__ );
    }
    else
    {
      PrintLow.format( stream, $str398$DLIST__S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym27$FIRST ) );
      while ( NIL == methods.funcall_instance_method_with_0_args( template_enumerator, $sym23$LAST_P ))
      {
        PrintLow.format( stream, $str130$___S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym31$NEXT ) );
      }
      PrintLow.format( stream, $str131$_ );
    }
    basic_doubly_linked_list_deallocate_enumerator_method( self, template_enumerator );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_find_nth_link_method(final SubLObject self, final SubLObject index)
  {
    SubLObject template_links = basic_doubly_linked_list_get_first_link_method( self );
    SubLObject count = ZERO_INTEGER;
    while ( NIL != template_links)
    {
      if( count.numE( index ) )
      {
        return template_links;
      }
      count = Numbers.add( count, ONE_INTEGER );
      template_links = dlc_next( template_links );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_find_link_method(final SubLObject self, final SubLObject element)
  {
    for( SubLObject template_links = basic_doubly_linked_list_get_first_link_method( self ); NIL != template_links; template_links = dlc_next( template_links ) )
    {
      if( NIL != basic_doubly_linked_list_element_equal_p_method( self, element, dlc_contents( template_links ) ) )
      {
        return template_links;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_reverse_link_method(final SubLObject self, final SubLObject link)
  {
    final SubLObject template_previous = dlc_previous( link );
    final SubLObject template_next = dlc_next( link );
    _csetf_dlc_previous( link, template_next );
    _csetf_dlc_next( link, template_previous );
    return link;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_delete_link_method(final SubLObject self, final SubLObject link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == double_link_cell_p( link ) )
    {
      Errors.error( $str403$_DELETE_LINK__S____S_is_not_a_val, self, link );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !dlc_owner( link ).eql( self ) )
    {
      Errors.error( $str404$_DELETE_LINK__S___Link__S_is_not_, self, link, self );
    }
    basic_doubly_linked_list_dec_element_count_method( self );
    final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method( self );
    final SubLObject template_last_link = basic_doubly_linked_list_get_last_link_method( self );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == template_first_link || NIL == template_last_link ) && ( NIL != template_first_link || NIL != template_last_link ) )
    {
      Errors.error( $str405$_DELETE_LINK__S___Detected_incons, self );
    }
    if( template_first_link.eql( link ) )
    {
      if( template_last_link.eql( link ) )
      {
        basic_doubly_linked_list_set_first_link_method( self, NIL );
        basic_doubly_linked_list_set_last_link_method( self, NIL );
        _csetf_dlc_previous( link, NIL );
        _csetf_dlc_next( link, NIL );
        return dlc_contents( link );
      }
      final SubLObject template_second_link = dlc_next( link );
      _csetf_dlc_previous( template_second_link, NIL );
      basic_doubly_linked_list_set_first_link_method( self, template_second_link );
      _csetf_dlc_next( link, NIL );
      _csetf_dlc_previous( link, NIL );
      return dlc_contents( link );
    }
    else
    {
      if( template_last_link.eql( link ) )
      {
        final SubLObject template_second_link = dlc_previous( link );
        _csetf_dlc_next( template_second_link, NIL );
        basic_doubly_linked_list_set_last_link_method( self, template_second_link );
        _csetf_dlc_next( link, NIL );
        _csetf_dlc_previous( link, NIL );
        return dlc_contents( link );
      }
      final SubLObject template_before_link = dlc_previous( link );
      final SubLObject template_after_link = dlc_next( link );
      _csetf_dlc_next( template_before_link, template_after_link );
      _csetf_dlc_previous( template_after_link, template_before_link );
      _csetf_dlc_next( link, NIL );
      _csetf_dlc_previous( link, NIL );
      return dlc_contents( link );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_set_contents_method(final SubLObject self, final SubLObject new_contents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !new_contents.isList() )
    {
      Errors.error( $str407$_SET_CONTENTS__S___Cannot_set_the, self, new_contents );
    }
    SubLObject cdolist_list_var;
    final SubLObject template_contents = cdolist_list_var = basic_doubly_linked_list_get_contents_method( self );
    SubLObject template_element = NIL;
    template_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      basic_doubly_linked_list_remove_method( self, template_element );
      cdolist_list_var = cdolist_list_var.rest();
      template_element = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2 = new_contents;
    SubLObject template_element2 = NIL;
    template_element2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      basic_doubly_linked_list_add_method( self, template_element2 );
      cdolist_list_var2 = cdolist_list_var2.rest();
      template_element2 = cdolist_list_var2.first();
    }
    return new_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_get_contents_method(final SubLObject self)
  {
    SubLObject template_contents = NIL;
    final SubLObject template_first_link = basic_doubly_linked_list_get_first_link_method( self );
    if( NIL != template_first_link )
    {
      for( SubLObject template_current_link = template_first_link; NIL != template_current_link; template_current_link = dlc_next( template_current_link ) )
      {
        template_contents = ConsesLow.cons( dlc_contents( template_current_link ), template_contents );
      }
    }
    return Sequences.nreverse( template_contents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_element_equal_p_method(final SubLObject self, final SubLObject element1, final SubLObject element2)
  {
    return Equality.equal( element1, element2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym374$BASIC_DOUBLY_LINKED_LIST, $sym119$ELEMENT_EQUALITY_PREDICATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym374$BASIC_DOUBLY_LINKED_LIST, $sym379$ELEMENT_COUNT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym374$BASIC_DOUBLY_LINKED_LIST, $sym378$FIRST_LINK, NIL );
    classes.subloop_initialize_slot( new_instance, $sym374$BASIC_DOUBLY_LINKED_LIST, $sym377$LAST_LINK, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 53986L)
  public static SubLObject basic_doubly_linked_list_p(final SubLObject basic_doubly_linked_list)
  {
    return classes.subloop_instanceof_class( basic_doubly_linked_list, $sym374$BASIC_DOUBLY_LINKED_LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 56630L)
  public static SubLObject basic_doubly_linked_list_get_element_equality_predicate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    final SubLObject element_equality_predicate = get_basic_doubly_linked_list_element_equality_predicate( self );
    try
    {
      thread.throwStack.push( $sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_equality_predicate );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_element_equality_predicate( self, element_equality_predicate );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 56757L)
  public static SubLObject basic_doubly_linked_list_set_element_equality_predicate_method(final SubLObject self, final SubLObject new_predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    SubLObject element_equality_predicate = get_basic_doubly_linked_list_element_equality_predicate( self );
    try
    {
      thread.throwStack.push( $sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        element_equality_predicate = new_predicate;
        Dynamic.sublisp_throw( $sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_predicate );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_element_equality_predicate( self, element_equality_predicate );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 56935L)
  public static SubLObject basic_doubly_linked_list_set_element_count_method(final SubLObject self, final SubLObject new_element_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    SubLObject element_count = get_basic_doubly_linked_list_element_count( self );
    try
    {
      thread.throwStack.push( $sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !new_element_count.isInteger() )
        {
          Errors.error( $str421$_SET_ELEMENT_COUNT__S____S_is_not, self, new_element_count );
        }
        element_count = new_element_count;
        Dynamic.sublisp_throw( $sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_element_count );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_element_count( self, element_count );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 57259L)
  public static SubLObject basic_doubly_linked_list_inc_element_count_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    SubLObject element_count = get_basic_doubly_linked_list_element_count( self );
    try
    {
      thread.throwStack.push( $sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        if( NIL == element_count )
        {
          element_count = ONE_INTEGER;
        }
        else
        {
          element_count = Numbers.add( element_count, ONE_INTEGER );
        }
        Dynamic.sublisp_throw( $sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_count );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_element_count( self, element_count );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 57451L)
  public static SubLObject basic_doubly_linked_list_dec_element_count_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    SubLObject element_count = get_basic_doubly_linked_list_element_count( self );
    try
    {
      thread.throwStack.push( $sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        if( NIL == element_count )
        {
          element_count = ZERO_INTEGER;
        }
        else
        {
          element_count = Numbers.subtract( element_count, ONE_INTEGER );
        }
        Dynamic.sublisp_throw( $sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_count );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_element_count( self, element_count );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 57643L)
  public static SubLObject basic_doubly_linked_list_get_first_link_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    final SubLObject first_link = get_basic_doubly_linked_list_first_link( self );
    try
    {
      thread.throwStack.push( $sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, first_link );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_first_link( self, first_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 57741L)
  public static SubLObject basic_doubly_linked_list_set_first_link_method(final SubLObject self, final SubLObject new_first_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    SubLObject first_link = get_basic_doubly_linked_list_first_link( self );
    try
    {
      thread.throwStack.push( $sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_first_link && NIL == double_link_cell_p( new_first_link ) )
        {
          Errors.error( $str439$_SET_FIRST_LINK__S____S_is_not_an, self, new_first_link );
        }
        first_link = new_first_link;
        Dynamic.sublisp_throw( $sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_first_link );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_first_link( self, first_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58060L)
  public static SubLObject basic_doubly_linked_list_get_last_link_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    final SubLObject last_link = get_basic_doubly_linked_list_last_link( self );
    try
    {
      thread.throwStack.push( $sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, last_link );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_last_link( self, last_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58156L)
  public static SubLObject basic_doubly_linked_list_set_last_link_method(final SubLObject self, final SubLObject new_last_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    SubLObject last_link = get_basic_doubly_linked_list_last_link( self );
    try
    {
      thread.throwStack.push( $sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_last_link && NIL == double_link_cell_p( new_last_link ) )
        {
          Errors.error( $str449$_SET_LAST_LINK__S____S_is_not_an_, self, new_last_link );
        }
        last_link = new_last_link;
        Dynamic.sublisp_throw( $sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_last_link );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_last_link( self, last_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58466L)
  public static SubLObject basic_doubly_linked_list_get_element_count_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    final SubLObject element_count = get_basic_doubly_linked_list_element_count( self );
    try
    {
      thread.throwStack.push( $sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, element_count );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_element_count( self, element_count );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject get_basic_doubly_linked_list_enumerator_direction(final SubLObject basic_doubly_linked_list_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_list_enumerator, FOUR_INTEGER, $sym41$DIRECTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject set_basic_doubly_linked_list_enumerator_direction(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_list_enumerator, value, FOUR_INTEGER, $sym41$DIRECTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject get_basic_doubly_linked_list_enumerator_current_link(final SubLObject basic_doubly_linked_list_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_list_enumerator, THREE_INTEGER, $sym456$CURRENT_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject set_basic_doubly_linked_list_enumerator_current_link(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_list_enumerator, value, THREE_INTEGER, $sym456$CURRENT_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject get_basic_doubly_linked_list_enumerator_last_link(final SubLObject basic_doubly_linked_list_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_list_enumerator, TWO_INTEGER, $sym377$LAST_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject set_basic_doubly_linked_list_enumerator_last_link(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_list_enumerator, value, TWO_INTEGER, $sym377$LAST_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject get_basic_doubly_linked_list_enumerator_first_link(final SubLObject basic_doubly_linked_list_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_list_enumerator, ONE_INTEGER, $sym378$FIRST_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject set_basic_doubly_linked_list_enumerator_first_link(final SubLObject basic_doubly_linked_list_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_list_enumerator, value, ONE_INTEGER, $sym378$FIRST_LINK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_enumerator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject subloop_reserved_initialize_basic_doubly_linked_list_enumerator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym378$FIRST_LINK, NIL );
    classes.subloop_initialize_slot( new_instance, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym377$LAST_LINK, NIL );
    classes.subloop_initialize_slot( new_instance, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym456$CURRENT_LINK, NIL );
    classes.subloop_initialize_slot( new_instance, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym41$DIRECTION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 58567L)
  public static SubLObject basic_doubly_linked_list_enumerator_p(final SubLObject basic_doubly_linked_list_enumerator)
  {
    return classes.subloop_instanceof_class( basic_doubly_linked_list_enumerator, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 59794L)
  public static SubLObject basic_doubly_linked_list_enumerator_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
    SubLObject direction = get_basic_doubly_linked_list_enumerator_direction( self );
    SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link( self );
    SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link( self );
    try
    {
      thread.throwStack.push( $sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
      try
      {
        object.object_initialize_method( self );
        first_link = NIL;
        last_link = NIL;
        current_link = NIL;
        direction = $kw45$NONE;
        Dynamic.sublisp_throw( $sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_enumerator_direction( self, direction );
          set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
          set_basic_doubly_linked_list_enumerator_last_link( self, last_link );
          set_basic_doubly_linked_list_enumerator_first_link( self, first_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 60016L)
  public static SubLObject basic_doubly_linked_list_enumerator_isolate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
    SubLObject direction = get_basic_doubly_linked_list_enumerator_direction( self );
    SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link( self );
    SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link( self );
    try
    {
      thread.throwStack.push( $sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
      try
      {
        if( NIL != first_link )
        {
          for( SubLObject current_link_$1 = first_link, next_link = NIL; NIL != current_link_$1; current_link_$1 = next_link )
          {
            next_link = dlc_next( current_link_$1 );
            _csetf_dlc_contents( current_link_$1, NIL );
            _csetf_dlc_owner( current_link_$1, NIL );
            _csetf_dlc_next( current_link_$1, NIL );
            _csetf_dlc_previous( current_link_$1, NIL );
          }
        }
        first_link = NIL;
        last_link = NIL;
        current_link = NIL;
        direction = $kw45$NONE;
        object.object_isolate_method( self );
        Dynamic.sublisp_throw( $sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_enumerator_direction( self, direction );
          set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
          set_basic_doubly_linked_list_enumerator_last_link( self, last_link );
          set_basic_doubly_linked_list_enumerator_first_link( self, first_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 60544L)
  public static SubLObject basic_doubly_linked_list_enumerator_set_initial_state_method(final SubLObject self, final SubLObject new_first_link, final SubLObject new_last_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
    SubLObject direction = get_basic_doubly_linked_list_enumerator_direction( self );
    SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link( self );
    SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link( self );
    try
    {
      thread.throwStack.push( $sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
      try
      {
        first_link = new_first_link;
        last_link = new_last_link;
        current_link = new_first_link;
        direction = $kw44$FORWARDS;
        Dynamic.sublisp_throw( $sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_enumerator_direction( self, direction );
          set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
          set_basic_doubly_linked_list_enumerator_last_link( self, last_link );
          set_basic_doubly_linked_list_enumerator_first_link( self, first_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 60817L)
  public static SubLObject basic_doubly_linked_list_enumerator_empty_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
    final SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link( self );
    try
    {
      thread.throwStack.push( $sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, Types.sublisp_null( first_link ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_enumerator_first_link( self, first_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 60923L)
  public static SubLObject basic_doubly_linked_list_enumerator_first_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
    final SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    final SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link( self );
    try
    {
      thread.throwStack.push( $sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, Equality.eq( first_link, current_link ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
          set_basic_doubly_linked_list_enumerator_first_link( self, first_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61040L)
  public static SubLObject basic_doubly_linked_list_enumerator_last_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
    final SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    try
    {
      thread.throwStack.push( $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
      try
      {
        if( NIL != basic_doubly_linked_list_enumerator_empty_p_method( self ) )
        {
          Dynamic.sublisp_throw( $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, T );
        }
        if( NIL == current_link )
        {
          Dynamic.sublisp_throw( $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, T );
        }
        Dynamic.sublisp_throw( $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, Types.sublisp_null( dlc_next( current_link ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61224L)
  public static SubLObject basic_doubly_linked_list_enumerator_current_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_enumerator_method = NIL;
    final SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    try
    {
      thread.throwStack.push( $sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
      try
      {
        if( NIL == current_link )
        {
          Dynamic.sublisp_throw( $sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, NIL );
        }
        Dynamic.sublisp_throw( $sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD, dlc_contents( current_link ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61375L)
  public static SubLObject basic_doubly_linked_list_enumerator_first_method(final SubLObject self)
  {
    SubLObject direction = get_basic_doubly_linked_list_enumerator_direction( self );
    SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    final SubLObject first_link = current_link = get_basic_doubly_linked_list_enumerator_first_link( self );
    set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
    direction = $kw44$FORWARDS;
    set_basic_doubly_linked_list_enumerator_direction( self, direction );
    return basic_doubly_linked_list_enumerator_current_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61553L)
  public static SubLObject basic_doubly_linked_list_enumerator_last_method(final SubLObject self)
  {
    SubLObject direction = get_basic_doubly_linked_list_enumerator_direction( self );
    SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    final SubLObject last_link = current_link = get_basic_doubly_linked_list_enumerator_last_link( self );
    set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
    direction = $kw46$BACKWARDS;
    set_basic_doubly_linked_list_enumerator_direction( self, direction );
    return basic_doubly_linked_list_enumerator_current_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 61730L)
  public static SubLObject basic_doubly_linked_list_enumerator_next_method(final SubLObject self)
  {
    SubLObject direction = get_basic_doubly_linked_list_enumerator_direction( self );
    SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    final SubLObject first_link = get_basic_doubly_linked_list_enumerator_first_link( self );
    if( NIL != current_link )
    {
      current_link = dlc_next( current_link );
      set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
      direction = $kw44$FORWARDS;
      set_basic_doubly_linked_list_enumerator_direction( self, direction );
      return basic_doubly_linked_list_enumerator_current_method( self );
    }
    final SubLObject pcase_var = direction;
    if( pcase_var.eql( $kw44$FORWARDS ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw46$BACKWARDS ) )
    {
      current_link = first_link;
      set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
      direction = $kw44$FORWARDS;
      set_basic_doubly_linked_list_enumerator_direction( self, direction );
      return basic_doubly_linked_list_enumerator_current_method( self );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 62131L)
  public static SubLObject basic_doubly_linked_list_enumerator_previous_method(final SubLObject self)
  {
    SubLObject direction = get_basic_doubly_linked_list_enumerator_direction( self );
    SubLObject current_link = get_basic_doubly_linked_list_enumerator_current_link( self );
    final SubLObject last_link = get_basic_doubly_linked_list_enumerator_last_link( self );
    if( NIL != current_link )
    {
      current_link = dlc_previous( current_link );
      set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
      direction = $kw46$BACKWARDS;
      set_basic_doubly_linked_list_enumerator_direction( self, direction );
      return basic_doubly_linked_list_enumerator_current_method( self );
    }
    final SubLObject pcase_var = direction;
    if( pcase_var.eql( $kw44$FORWARDS ) )
    {
      current_link = last_link;
      set_basic_doubly_linked_list_enumerator_current_link( self, current_link );
      direction = $kw46$BACKWARDS;
      set_basic_doubly_linked_list_enumerator_direction( self, direction );
      return basic_doubly_linked_list_enumerator_current_method( self );
    }
    if( pcase_var.eql( $kw46$BACKWARDS ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 62539L)
  public static SubLObject basic_doubly_linked_list_allocate_enumerator_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_list_method = NIL;
    final SubLObject first_link = get_basic_doubly_linked_list_first_link( self );
    try
    {
      thread.throwStack.push( $sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
      try
      {
        final SubLObject new_enumerator = object.object_new_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR );
        thread.resetMultipleValues();
        final SubLObject new_first_link = dlc_copy_links( first_link, new_enumerator );
        final SubLObject new_last_link = thread.secondMultipleValue();
        thread.resetMultipleValues();
        basic_doubly_linked_list_enumerator_set_initial_state_method( new_enumerator, new_first_link, new_last_link );
        Dynamic.sublisp_throw( $sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD, new_enumerator );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_list_first_link( self, first_link );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_doubly_linked_list_method = Errors.handleThrowable( ccatch_env_var, $sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_list_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63155L)
  public static SubLObject basic_doubly_linked_list_deallocate_enumerator_method(final SubLObject self, final SubLObject enumerator)
  {
    if( NIL != basic_doubly_linked_list_enumerator_p( enumerator ) )
    {
      basic_doubly_linked_list_enumerator_isolate_method( enumerator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63398L)
  public static SubLObject pair_template_p(final SubLObject pair_template)
  {
    return interfaces.subloop_instanceof_interface( pair_template, $sym497$PAIR_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
  public static SubLObject get_basic_pair_second_element(final SubLObject basic_pair)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_pair, TWO_INTEGER, $sym503$SECOND_ELEMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
  public static SubLObject set_basic_pair_second_element(final SubLObject basic_pair, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_pair, value, TWO_INTEGER, $sym503$SECOND_ELEMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
  public static SubLObject get_basic_pair_first_element(final SubLObject basic_pair)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_pair, ONE_INTEGER, $sym504$FIRST_ELEMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
  public static SubLObject set_basic_pair_first_element(final SubLObject basic_pair, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_pair, value, ONE_INTEGER, $sym504$FIRST_ELEMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
  public static SubLObject basic_pair_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str505$__S___S_, basic_pair_get_first_method( self ), basic_pair_get_second_method( self ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
  public static SubLObject subloop_reserved_initialize_basic_pair_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
  public static SubLObject subloop_reserved_initialize_basic_pair_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym500$BASIC_PAIR, $sym504$FIRST_ELEMENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym500$BASIC_PAIR, $sym503$SECOND_ELEMENT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 63859L)
  public static SubLObject basic_pair_p(final SubLObject basic_pair)
  {
    return classes.subloop_instanceof_class( basic_pair, $sym500$BASIC_PAIR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64347L)
  public static SubLObject basic_pair_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_pair_method = NIL;
    SubLObject second_element = get_basic_pair_second_element( self );
    SubLObject first_element = get_basic_pair_first_element( self );
    try
    {
      thread.throwStack.push( $sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
      try
      {
        object.object_initialize_method( self );
        first_element = NIL;
        second_element = NIL;
        Dynamic.sublisp_throw( $sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_pair_second_element( self, second_element );
          set_basic_pair_first_element( self, first_element );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_pair_method = Errors.handleThrowable( ccatch_env_var, $sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_pair_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64499L)
  public static SubLObject basic_pair_get_first_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_pair_method = NIL;
    final SubLObject first_element = get_basic_pair_first_element( self );
    try
    {
      thread.throwStack.push( $sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, first_element );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_pair_first_element( self, first_element );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_pair_method = Errors.handleThrowable( ccatch_env_var, $sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_pair_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64578L)
  public static SubLObject basic_pair_set_first_method(final SubLObject self, final SubLObject new_first)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_pair_method = NIL;
    SubLObject first_element = get_basic_pair_first_element( self );
    try
    {
      thread.throwStack.push( $sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
      try
      {
        first_element = new_first;
        Dynamic.sublisp_throw( $sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, new_first );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_pair_first_element( self, first_element );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_pair_method = Errors.handleThrowable( ccatch_env_var, $sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_pair_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64696L)
  public static SubLObject basic_pair_get_second_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_pair_method = NIL;
    final SubLObject second_element = get_basic_pair_second_element( self );
    try
    {
      thread.throwStack.push( $sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, second_element );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_pair_second_element( self, second_element );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_pair_method = Errors.handleThrowable( ccatch_env_var, $sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_pair_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64777L)
  public static SubLObject basic_pair_set_second_method(final SubLObject self, final SubLObject new_second)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_pair_method = NIL;
    SubLObject second_element = get_basic_pair_second_element( self );
    try
    {
      thread.throwStack.push( $sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
      try
      {
        second_element = new_second;
        Dynamic.sublisp_throw( $sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD, new_second );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_pair_second_element( self, second_element );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_pair_method = Errors.handleThrowable( ccatch_env_var, $sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_pair_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 64900L)
  public static SubLObject triplet_template_p(final SubLObject triplet_template)
  {
    return interfaces.subloop_instanceof_interface( triplet_template, $sym530$TRIPLET_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
  public static SubLObject get_basic_triplet_third_element(final SubLObject basic_triplet)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_triplet, THREE_INTEGER, $sym537$THIRD_ELEMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
  public static SubLObject set_basic_triplet_third_element(final SubLObject basic_triplet, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_triplet, value, THREE_INTEGER, $sym537$THIRD_ELEMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
  public static SubLObject basic_triplet_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str538$__S___S___S_, new SubLObject[] { basic_pair_get_first_method( self ), basic_pair_get_second_method( self ), basic_triplet_get_third_method( self )
    } );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
  public static SubLObject subloop_reserved_initialize_basic_triplet_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
  public static SubLObject subloop_reserved_initialize_basic_triplet_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym500$BASIC_PAIR, $sym504$FIRST_ELEMENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym500$BASIC_PAIR, $sym503$SECOND_ELEMENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym534$BASIC_TRIPLET, $sym537$THIRD_ELEMENT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65258L)
  public static SubLObject basic_triplet_p(final SubLObject basic_triplet)
  {
    return classes.subloop_instanceof_class( basic_triplet, $sym534$BASIC_TRIPLET );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65614L)
  public static SubLObject basic_triplet_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_triplet_method = NIL;
    SubLObject third_element = get_basic_triplet_third_element( self );
    try
    {
      thread.throwStack.push( $sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD );
      try
      {
        basic_pair_initialize_method( self );
        third_element = NIL;
        Dynamic.sublisp_throw( $sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_triplet_third_element( self, third_element );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_triplet_method = Errors.handleThrowable( ccatch_env_var, $sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_triplet_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65740L)
  public static SubLObject basic_triplet_get_third_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_triplet_method = NIL;
    final SubLObject third_element = get_basic_triplet_third_element( self );
    try
    {
      thread.throwStack.push( $sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD, third_element );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_triplet_third_element( self, third_element );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_triplet_method = Errors.handleThrowable( ccatch_env_var, $sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_triplet_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65822L)
  public static SubLObject basic_triplet_set_third_method(final SubLObject self, final SubLObject new_third)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_triplet_method = NIL;
    SubLObject third_element = get_basic_triplet_third_element( self );
    try
    {
      thread.throwStack.push( $sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD );
      try
      {
        third_element = new_third;
        Dynamic.sublisp_throw( $sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD, new_third );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_triplet_third_element( self, third_element );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_triplet_method = Errors.handleThrowable( ccatch_env_var, $sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_triplet_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 65943L)
  public static SubLObject generic_dllt_add_parent_link_function(final SubLObject list_element, final SubLObject new_parent_link)
  {
    if( NIL != basic_list_element_p( list_element ) )
    {
      return basic_list_element_add_parent_link_method( list_element, new_parent_link );
    }
    if( NIL != list_element_template_p( list_element ) )
    {
      return methods.funcall_instance_method_with_1_args( list_element, $sym281$ADD_PARENT_LINK, new_parent_link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 66420L)
  public static SubLObject generic_dllt_delete_parent_link_function(final SubLObject list_element, final SubLObject old_parent_link)
  {
    if( NIL != basic_list_element_p( list_element ) )
    {
      return basic_list_element_delete_parent_link_method( list_element, old_parent_link );
    }
    if( NIL != list_element_template_p( list_element ) )
    {
      return methods.funcall_instance_method_with_1_args( list_element, $sym284$DELETE_PARENT_LINK, old_parent_link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 66851L)
  public static SubLObject generic_dllt_delete_link_function(final SubLObject list, final SubLObject link)
  {
    if( NIL != basic_doubly_linked_list_p( list ) )
    {
      return basic_doubly_linked_list_delete_link_method( list, link );
    }
    if( NIL != doubly_linked_list_template_p( list ) )
    {
      return methods.funcall_instance_method_with_1_args( list, $sym347$DELETE_LINK, link );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67212L)
  public static SubLObject generic_dllt_delete_self_from_collection_function(final SubLObject list_element, final SubLObject collection)
  {
    if( NIL != basic_list_element_p( list_element ) )
    {
      return basic_list_element_delete_self_from_collection_method( list_element, collection );
    }
    if( NIL != list_element_template_p( list_element ) )
    {
      return methods.funcall_instance_method_with_1_args( list_element, $sym287$DELETE_SELF_FROM_COLLECTION, collection );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67655L)
  public static SubLObject subloop_reserved_initialize_subloop_private_pair_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67655L)
  public static SubLObject subloop_reserved_initialize_subloop_private_pair_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym500$BASIC_PAIR, $sym504$FIRST_ELEMENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym500$BASIC_PAIR, $sym503$SECOND_ELEMENT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67655L)
  public static SubLObject subloop_private_pair_p(final SubLObject subloop_private_pair)
  {
    return classes.subloop_instanceof_class( subloop_private_pair, $sym554$SUBLOOP_PRIVATE_PAIR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67792L)
  public static SubLObject subloop_private_pair_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str559$SUBLOOP_PRIVATE_PAIR__S___S_, basic_pair_get_first_method( self ), basic_pair_get_second_method( self ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 67981L)
  public static SubLObject bag_enumerator_template_p(final SubLObject bag_enumerator_template)
  {
    return interfaces.subloop_instanceof_interface( bag_enumerator_template, $sym561$BAG_ENUMERATOR_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 72969L)
  public static SubLObject subloop_collections_bag_enum_get_next(final SubLObject contents_pointer)
  {
    final SubLObject list = basic_pair_get_first_method( contents_pointer );
    final SubLObject count = basic_pair_get_second_method( contents_pointer );
    if( NIL == list )
    {
      return Values.values( NIL, NIL );
    }
    if( !list.isCons() )
    {
      return Values.values( NIL, NIL );
    }
    final SubLObject element = list.first();
    if( NIL != subloop_private_pair_p( element ) )
    {
      final SubLObject item = basic_pair_get_first_method( element );
      final SubLObject quant = basic_pair_get_second_method( element );
      if( NIL == count )
      {
        basic_pair_set_second_method( contents_pointer, ONE_INTEGER );
        return Values.values( item, T );
      }
      if( count.numL( quant ) )
      {
        basic_pair_set_second_method( contents_pointer, Numbers.add( count, ONE_INTEGER ) );
        return Values.values( item, T );
      }
      final SubLObject sublist = list.rest();
      basic_pair_set_first_method( contents_pointer, sublist );
      if( NIL == sublist )
      {
        basic_pair_set_second_method( contents_pointer, NIL );
        return Values.values( NIL, NIL );
      }
      final SubLObject sublist_element = sublist.first();
      if( NIL != subloop_private_pair_p( sublist_element ) )
      {
        basic_pair_set_second_method( contents_pointer, ONE_INTEGER );
        return Values.values( basic_pair_get_first_method( sublist_element ), T );
      }
      basic_pair_set_second_method( contents_pointer, NIL );
      return Values.values( sublist_element, T );
    }
    else
    {
      final SubLObject sublist2 = list.rest();
      basic_pair_set_first_method( contents_pointer, sublist2 );
      if( NIL == sublist2 )
      {
        basic_pair_set_second_method( contents_pointer, NIL );
        return Values.values( NIL, NIL );
      }
      final SubLObject sublist_element2 = sublist2.first();
      if( NIL != subloop_private_pair_p( sublist_element2 ) )
      {
        basic_pair_set_second_method( contents_pointer, ONE_INTEGER );
        return Values.values( basic_pair_get_first_method( sublist_element2 ), T );
      }
      basic_pair_set_second_method( contents_pointer, NIL );
      return Values.values( sublist_element2, T );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 75788L)
  public static SubLObject subloop_collections_get_previous_cons(final SubLObject list, final SubLObject sublist)
  {
    if( NIL == list )
    {
      return NIL;
    }
    if( list.eql( sublist ) )
    {
      return NIL;
    }
    SubLObject current_sublist;
    for( current_sublist = NIL, current_sublist = list; NIL != current_sublist; current_sublist = current_sublist.rest() )
    {
      if( current_sublist.rest().eql( sublist ) )
      {
        return current_sublist;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 76082L)
  public static SubLObject subloop_collections_backup_pointer(final SubLObject contents, final SubLObject contents_pointer)
  {
    if( NIL == contents_pointer )
    {
      return Values.values( NIL, NIL );
    }
    if( NIL == subloop_private_pair_p( contents_pointer ) )
    {
      return Values.values( NIL, NIL );
    }
    final SubLObject sublist = basic_pair_get_first_method( contents_pointer );
    if( NIL == sublist )
    {
      return Values.values( NIL, NIL );
    }
    final SubLObject element = sublist.first();
    if( NIL != subloop_private_pair_p( element ) )
    {
      final SubLObject count = basic_pair_get_second_method( contents_pointer );
      if( !count.numE( ONE_INTEGER ) )
      {
        basic_pair_set_second_method( contents_pointer, Numbers.subtract( count, ONE_INTEGER ) );
        return Values.values( basic_pair_get_first_method( element ), T );
      }
      final SubLObject previous_cons = subloop_collections_get_previous_cons( contents, sublist );
      if( NIL == previous_cons )
      {
        basic_pair_set_first_method( contents_pointer, NIL );
        basic_pair_set_second_method( contents_pointer, NIL );
        return Values.values( NIL, NIL );
      }
      final SubLObject previous_element = previous_cons.first();
      if( NIL != subloop_private_pair_p( previous_element ) )
      {
        basic_pair_set_first_method( contents_pointer, previous_cons );
        basic_pair_set_second_method( contents_pointer, basic_pair_get_second_method( previous_element ) );
        return Values.values( basic_pair_get_first_method( previous_element ), T );
      }
      basic_pair_set_first_method( contents_pointer, previous_cons );
      basic_pair_set_second_method( contents_pointer, NIL );
      return Values.values( previous_element, T );
    }
    else
    {
      final SubLObject previous_cons2 = subloop_collections_get_previous_cons( contents, sublist );
      if( NIL == previous_cons2 )
      {
        basic_pair_set_first_method( contents_pointer, NIL );
        basic_pair_set_second_method( contents_pointer, NIL );
        return Values.values( NIL, NIL );
      }
      final SubLObject previous_element2 = previous_cons2.first();
      if( NIL != subloop_private_pair_p( previous_element2 ) )
      {
        basic_pair_set_first_method( contents_pointer, previous_cons2 );
        basic_pair_set_second_method( contents_pointer, basic_pair_get_second_method( previous_element2 ) );
        return Values.values( basic_pair_get_first_method( previous_element2 ), T );
      }
      basic_pair_set_first_method( contents_pointer, previous_cons2 );
      basic_pair_set_second_method( contents_pointer, NIL );
      return Values.values( previous_element2, T );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject get_basic_bag_enumerator_direction(final SubLObject basic_bag_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_bag_enumerator, THREE_INTEGER, $sym41$DIRECTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject set_basic_bag_enumerator_direction(final SubLObject basic_bag_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_bag_enumerator, value, THREE_INTEGER, $sym41$DIRECTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject get_basic_bag_enumerator_contents(final SubLObject basic_bag_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_bag_enumerator, TWO_INTEGER, $sym120$CONTENTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject set_basic_bag_enumerator_contents(final SubLObject basic_bag_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_bag_enumerator, value, TWO_INTEGER, $sym120$CONTENTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject get_basic_bag_enumerator_contents_pointer(final SubLObject basic_bag_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_bag_enumerator, ONE_INTEGER, $sym42$CONTENTS_POINTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject set_basic_bag_enumerator_contents_pointer(final SubLObject basic_bag_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_bag_enumerator, value, ONE_INTEGER, $sym42$CONTENTS_POINTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject basic_bag_enumerator_previous_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject template_direction = basic_bag_enumerator_get_direction_method( self );
    final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method( self );
    if( NIL != template_contents_pointer && NIL != basic_pair_get_first_method( template_contents_pointer ) )
    {
      thread.resetMultipleValues();
      final SubLObject next_element = subloop_collections_backup_pointer( basic_bag_enumerator_get_contents_method( self ), template_contents_pointer );
      final SubLObject success_p = thread.secondMultipleValue();
      thread.resetMultipleValues();
      basic_bag_enumerator_set_direction_method( self, $kw46$BACKWARDS );
      if( NIL != success_p )
      {
        return next_element;
      }
      return NIL;
    }
    else
    {
      if( template_direction == $kw46$BACKWARDS )
      {
        return NIL;
      }
      return basic_bag_enumerator_last_method( self );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject basic_bag_enumerator_next_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject template_direction = basic_bag_enumerator_get_direction_method( self );
    final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method( self );
    if( NIL != template_contents_pointer && NIL != basic_pair_get_first_method( template_contents_pointer ) )
    {
      thread.resetMultipleValues();
      final SubLObject next_element = subloop_collections_bag_enum_get_next( template_contents_pointer );
      final SubLObject success_p = thread.secondMultipleValue();
      thread.resetMultipleValues();
      basic_bag_enumerator_set_direction_method( self, $kw44$FORWARDS );
      if( NIL != success_p )
      {
        return next_element;
      }
      return NIL;
    }
    else
    {
      if( template_direction == $kw44$FORWARDS )
      {
        return NIL;
      }
      return basic_bag_enumerator_first_method( self );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject basic_bag_enumerator_last_method(final SubLObject self)
  {
    SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method( self );
    final SubLObject template_contents = basic_bag_enumerator_get_contents_method( self );
    if( NIL == template_contents_pointer )
    {
      template_contents_pointer = object.object_new_method( $sym554$SUBLOOP_PRIVATE_PAIR );
      basic_bag_enumerator_set_contents_pointer_method( self, template_contents_pointer );
    }
    if( NIL != template_contents )
    {
      final SubLObject last_cons = conses_high.last( template_contents, UNPROVIDED );
      final SubLObject element = last_cons.first();
      if( NIL != subloop_private_pair_p( element ) )
      {
        final SubLObject count = basic_pair_get_second_method( element );
        basic_pair_set_first_method( template_contents_pointer, last_cons );
        basic_pair_set_second_method( template_contents_pointer, count );
      }
      else
      {
        basic_pair_set_first_method( template_contents_pointer, last_cons );
        basic_pair_set_second_method( template_contents_pointer, NIL );
      }
    }
    else
    {
      basic_pair_set_first_method( template_contents_pointer, NIL );
      basic_pair_set_second_method( template_contents_pointer, NIL );
    }
    basic_bag_enumerator_set_direction_method( self, $kw46$BACKWARDS );
    return basic_bag_enumerator_current_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject basic_bag_enumerator_first_method(final SubLObject self)
  {
    SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method( self );
    final SubLObject template_contents = basic_bag_enumerator_get_contents_method( self );
    if( NIL == template_contents_pointer )
    {
      template_contents_pointer = object.object_new_method( $sym554$SUBLOOP_PRIVATE_PAIR );
      basic_bag_enumerator_set_contents_pointer_method( self, template_contents_pointer );
    }
    basic_pair_set_first_method( template_contents_pointer, template_contents );
    if( NIL != template_contents )
    {
      final SubLObject template_element = template_contents.first();
      if( NIL != subloop_private_pair_p( template_element ) )
      {
        basic_pair_set_second_method( template_contents_pointer, ONE_INTEGER );
      }
      else
      {
        basic_pair_set_second_method( template_contents_pointer, NIL );
      }
    }
    else
    {
      basic_pair_set_second_method( template_contents_pointer, NIL );
    }
    basic_bag_enumerator_set_direction_method( self, $kw44$FORWARDS );
    return basic_bag_enumerator_current_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject basic_bag_enumerator_current_method(final SubLObject self)
  {
    final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method( self );
    if( NIL != template_contents_pointer )
    {
      final SubLObject list = basic_pair_get_first_method( template_contents_pointer );
      if( NIL != list )
      {
        final SubLObject element = list.first();
        if( NIL != element )
        {
          if( NIL != subloop_private_pair_p( element ) )
          {
            return basic_pair_get_first_method( element );
          }
          return element;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject basic_bag_enumerator_last_p_method(final SubLObject self)
  {
    final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method( self );
    if( NIL == template_contents_pointer )
    {
      return NIL;
    }
    final SubLObject list = basic_pair_get_first_method( template_contents_pointer );
    if( NIL == list )
    {
      return NIL;
    }
    if( NIL != list.rest() )
    {
      return NIL;
    }
    final SubLObject element = list.first();
    if( NIL != subloop_private_pair_p( element ) )
    {
      final SubLObject count = basic_pair_get_second_method( template_contents_pointer );
      final SubLObject quant = basic_pair_get_second_method( element );
      return Numbers.numE( count, quant );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject basic_bag_enumerator_first_p_method(final SubLObject self)
  {
    final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method( self );
    final SubLObject template_contents = basic_bag_enumerator_get_contents_method( self );
    if( NIL != template_contents_pointer )
    {
      return Equality.eq( template_contents, basic_pair_get_first_method( template_contents_pointer ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject basic_bag_enumerator_empty_p_method(final SubLObject self)
  {
    final SubLObject template_contents_pointer = basic_bag_enumerator_get_contents_pointer_method( self );
    if( NIL != template_contents_pointer )
    {
      return Types.sublisp_null( basic_pair_get_first_method( template_contents_pointer ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject subloop_reserved_initialize_basic_bag_enumerator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject subloop_reserved_initialize_basic_bag_enumerator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym571$BASIC_BAG_ENUMERATOR, $sym42$CONTENTS_POINTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym571$BASIC_BAG_ENUMERATOR, $sym120$CONTENTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym571$BASIC_BAG_ENUMERATOR, $sym41$DIRECTION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 79641L)
  public static SubLObject basic_bag_enumerator_p(final SubLObject basic_bag_enumerator)
  {
    return classes.subloop_instanceof_class( basic_bag_enumerator, $sym571$BASIC_BAG_ENUMERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 80790L)
  public static SubLObject basic_bag_enumerator_instantiate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
    SubLObject direction = get_basic_bag_enumerator_direction( self );
    SubLObject contents = get_basic_bag_enumerator_contents( self );
    SubLObject contents_pointer = get_basic_bag_enumerator_contents_pointer( self );
    try
    {
      thread.throwStack.push( $sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
      try
      {
        methods.funcall_instance_super_method_with_0_args( self, $sym584$INSTANTIATE );
        contents_pointer = object.object_new_method( $sym554$SUBLOOP_PRIVATE_PAIR );
        contents = NIL;
        direction = $kw45$NONE;
        Dynamic.sublisp_throw( $sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_enumerator_direction( self, direction );
          set_basic_bag_enumerator_contents( self, contents );
          set_basic_bag_enumerator_contents_pointer( self, contents_pointer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81038L)
  public static SubLObject basic_bag_enumerator_get_contents_pointer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
    final SubLObject contents_pointer = get_basic_bag_enumerator_contents_pointer( self );
    try
    {
      thread.throwStack.push( $sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, contents_pointer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_enumerator_contents_pointer( self, contents_pointer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81144L)
  public static SubLObject basic_bag_enumerator_set_contents_pointer_method(final SubLObject self, final SubLObject new_pointer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
    SubLObject contents_pointer = get_basic_bag_enumerator_contents_pointer( self );
    try
    {
      thread.throwStack.push( $sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_pointer && NIL == subloop_private_pair_p( new_pointer ) )
        {
          Errors.error( $str593$_SET_CONTENTS_POINTER__S____S_is_, self, new_pointer );
        }
        contents_pointer = new_pointer;
        Dynamic.sublisp_throw( $sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, new_pointer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_enumerator_contents_pointer( self, contents_pointer );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81467L)
  public static SubLObject basic_bag_enumerator_get_contents_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
    final SubLObject contents = get_basic_bag_enumerator_contents( self );
    try
    {
      thread.throwStack.push( $sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, contents );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_enumerator_contents( self, contents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81557L)
  public static SubLObject basic_bag_enumerator_set_contents_method(final SubLObject self, final SubLObject new_contents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
    SubLObject contents = get_basic_bag_enumerator_contents( self );
    try
    {
      thread.throwStack.push( $sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !new_contents.isList() )
        {
          Errors.error( $str599$_SET_CONTENTS__S____S_is_not_an_i, self, new_contents );
        }
        contents = new_contents;
        Dynamic.sublisp_throw( $sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, new_contents );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_enumerator_contents( self, contents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81803L)
  public static SubLObject basic_bag_enumerator_get_direction_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
    final SubLObject direction = get_basic_bag_enumerator_direction( self );
    try
    {
      thread.throwStack.push( $sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, direction );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_enumerator_direction( self, direction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 81897L)
  public static SubLObject basic_bag_enumerator_set_direction_method(final SubLObject self, final SubLObject new_direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_enumerator_method = NIL;
    SubLObject direction = get_basic_bag_enumerator_direction( self );
    try
    {
      thread.throwStack.push( $sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == sequential_direction_p( new_direction ) )
        {
          Errors.error( $str605$_SET_DIRECTION__S____S_is_not_an_, self, new_direction );
        }
        direction = new_direction;
        Dynamic.sublisp_throw( $sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD, new_direction );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_enumerator_direction( self, direction );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 82185L)
  public static SubLObject bag_template_p(final SubLObject bag_template)
  {
    return interfaces.subloop_instanceof_interface( bag_template, $sym607$BAG_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 84573L)
  public static SubLObject subloop_collections_bag_template_translate_pair(final SubLObject subloop_private_pair)
  {
    final SubLObject element = basic_pair_get_first_method( subloop_private_pair );
    final SubLObject count = basic_pair_get_second_method( subloop_private_pair );
    SubLObject result = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      result = ConsesLow.cons( element, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject get_basic_bag_bag_representation(final SubLObject basic_bag)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_bag, THREE_INTEGER, $sym626$BAG_REPRESENTATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject set_basic_bag_bag_representation(final SubLObject basic_bag, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_bag, value, THREE_INTEGER, $sym626$BAG_REPRESENTATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_empty_p_method(final SubLObject self)
  {
    return Types.sublisp_null( basic_bag_get_internal_representation_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_get_unique_element_count_method(final SubLObject self)
  {
    return Sequences.length( basic_bag_get_internal_representation_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_get_unique_elements_method(final SubLObject self)
  {
    SubLObject template_unique_elements = NIL;
    SubLObject cdolist_list_var;
    final SubLObject template_bag_list = cdolist_list_var = basic_bag_get_internal_representation_method( self );
    SubLObject template_element = NIL;
    template_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subloop_private_pair_p( template_element ) )
      {
        template_unique_elements = ConsesLow.cons( basic_pair_get_first_method( template_element ), template_unique_elements );
      }
      else
      {
        template_unique_elements = ConsesLow.cons( template_element, template_unique_elements );
      }
      cdolist_list_var = cdolist_list_var.rest();
      template_element = cdolist_list_var.first();
    }
    return template_unique_elements;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_occurences_method(final SubLObject self, final SubLObject element)
  {
    SubLObject cdolist_list_var;
    final SubLObject template_bag_list = cdolist_list_var = basic_bag_get_internal_representation_method( self );
    SubLObject template_element = NIL;
    template_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subloop_private_pair_p( template_element ) )
      {
        if( NIL != basic_collection_element_equal_p_method( self, basic_pair_get_first_method( template_element ), element ) )
        {
          return basic_pair_get_second_method( template_element );
        }
      }
      else if( NIL != basic_collection_element_equal_p_method( self, template_element, element ) )
      {
        return ONE_INTEGER;
      }
      cdolist_list_var = cdolist_list_var.rest();
      template_element = cdolist_list_var.first();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_member_p_method(final SubLObject self, final SubLObject element)
  {
    SubLObject cdolist_list_var;
    final SubLObject template_bag_list = cdolist_list_var = basic_bag_get_internal_representation_method( self );
    SubLObject template_element = NIL;
    template_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subloop_private_pair_p( template_element ) )
      {
        if( NIL != basic_collection_element_equal_p_method( self, basic_pair_get_first_method( template_element ), element ) )
        {
          return T;
        }
      }
      else if( NIL != basic_collection_element_equal_p_method( self, template_element, element ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      template_element = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_remove_method(final SubLObject self, final SubLObject old_element)
  {
    final SubLObject template_bag_list = basic_bag_get_internal_representation_method( self );
    if( NIL == template_bag_list )
    {
      return NIL;
    }
    SubLObject template_current_element = template_bag_list.first();
    if( NIL != subloop_private_pair_p( template_current_element ) )
    {
      if( NIL != basic_collection_element_equal_p_method( self, old_element, basic_pair_get_first_method( template_current_element ) ) )
      {
        final SubLObject template_count = basic_pair_get_second_method( template_current_element );
        if( template_count.numE( TWO_INTEGER ) )
        {
          ConsesLow.rplaca( template_bag_list, basic_pair_get_first_method( template_current_element ) );
          return old_element;
        }
        basic_pair_set_second_method( template_current_element, Numbers.subtract( template_count, ONE_INTEGER ) );
        return old_element;
      }
    }
    else if( NIL != basic_collection_element_equal_p_method( self, old_element, template_current_element ) )
    {
      basic_bag_set_internal_representation_method( self, template_bag_list.rest() );
      return old_element;
    }
    SubLObject template_previous_cons = template_bag_list;
    for( SubLObject template_current_cons = template_bag_list.rest(); NIL != template_current_cons; template_current_cons = template_current_cons.rest() )
    {
      template_current_element = template_current_cons.first();
      if( NIL != subloop_private_pair_p( template_current_element ) )
      {
        if( NIL != basic_collection_element_equal_p_method( self, old_element, basic_pair_get_first_method( template_current_element ) ) )
        {
          final SubLObject template_count2 = basic_pair_get_second_method( template_current_element );
          if( template_count2.numE( TWO_INTEGER ) )
          {
            ConsesLow.rplaca( template_current_cons, basic_pair_get_first_method( template_current_element ) );
            return old_element;
          }
          basic_pair_set_second_method( template_current_element, Numbers.subtract( template_count2, ONE_INTEGER ) );
          return old_element;
        }
      }
      else if( NIL != basic_collection_element_equal_p_method( self, old_element, template_current_element ) )
      {
        ConsesLow.rplacd( template_previous_cons, template_current_cons.rest() );
        return old_element;
      }
      template_previous_cons = template_current_cons;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_add_method(final SubLObject self, final SubLObject new_element)
  {
    final SubLObject template_bag_list = basic_bag_get_internal_representation_method( self );
    SubLObject template_current_element = NIL;
    SubLObject template_sublist;
    SubLObject template_new_pair;
    for( template_sublist = NIL, template_sublist = template_bag_list; NIL != template_sublist; template_sublist = template_sublist.rest() )
    {
      template_current_element = template_sublist.first();
      if( NIL != subloop_private_pair_p( template_current_element ) )
      {
        if( NIL != basic_collection_element_equal_p_method( self, new_element, basic_pair_get_first_method( template_current_element ) ) )
        {
          basic_pair_set_second_method( template_current_element, Numbers.add( basic_pair_get_second_method( template_current_element ), ONE_INTEGER ) );
          return new_element;
        }
      }
      else if( NIL != basic_collection_element_equal_p_method( self, new_element, template_current_element ) )
      {
        template_new_pair = object.object_new_method( $sym554$SUBLOOP_PRIVATE_PAIR );
        basic_pair_set_first_method( template_new_pair, template_current_element );
        basic_pair_set_second_method( template_new_pair, TWO_INTEGER );
        ConsesLow.rplaca( template_sublist, template_new_pair );
        return new_element;
      }
    }
    basic_bag_set_internal_representation_method( self, ConsesLow.cons( new_element, template_bag_list ) );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_set_contents_method(final SubLObject self, final SubLObject new_contents)
  {
    basic_bag_set_internal_representation_method( self, NIL );
    SubLObject cdolist_list_var = new_contents;
    SubLObject template_element = NIL;
    template_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      basic_bag_add_method( self, template_element );
      cdolist_list_var = cdolist_list_var.rest();
      template_element = cdolist_list_var.first();
    }
    return new_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_get_contents_method(final SubLObject self)
  {
    final SubLObject template_bag_list = basic_bag_get_internal_representation_method( self );
    SubLObject template_contents = NIL;
    final SubLObject list_expression = template_bag_list;
    if( NIL == list_expression )
    {
      template_contents = NIL;
    }
    else if( list_expression.isAtom() )
    {
      template_contents = ConsesLow.list( list_expression );
    }
    else if( NIL == list_expression.rest() )
    {
      final SubLObject template_element = list_expression.first();
      template_contents = ( NIL != subloop_private_pair_p( template_element ) ) ? subloop_collections_bag_template_translate_pair( template_element ) : ConsesLow.list( template_element );
    }
    else
    {
      SubLObject tail_cons = NIL;
      SubLObject result = NIL;
      template_contents = NIL;
      SubLObject cdolist_list_var = list_expression;
      SubLObject template_element2 = NIL;
      template_element2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ( NIL != subloop_private_pair_p( template_element2 ) ) ? subloop_collections_bag_template_translate_pair( template_element2 ) : ConsesLow.list( template_element2 );
        if( NIL != result )
        {
          if( NIL != tail_cons )
          {
            ConsesLow.rplacd( tail_cons, result );
            tail_cons = conses_high.last( result, UNPROVIDED );
          }
          else
          {
            template_contents = ( NIL != subloop_private_pair_p( template_element2 ) ) ? subloop_collections_bag_template_translate_pair( template_element2 ) : ConsesLow.list( template_element2 );
            tail_cons = conses_high.last( template_contents, UNPROVIDED );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        template_element2 = cdolist_list_var.first();
      }
    }
    return template_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_get_element_count_method(final SubLObject self)
  {
    final SubLObject template_bag_list = basic_bag_get_internal_representation_method( self );
    SubLObject template_count = ZERO_INTEGER;
    SubLObject cdolist_list_var = template_bag_list;
    SubLObject template_element = NIL;
    template_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subloop_private_pair_p( template_element ) )
      {
        template_count = Numbers.add( template_count, basic_pair_get_second_method( template_element ) );
      }
      else
      {
        template_count = Numbers.add( template_count, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      template_element = cdolist_list_var.first();
    }
    return template_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject template_enumerator = basic_bag_allocate_enumerator_method( self );
    if( NIL == template_enumerator )
    {
      PrintLow.format( stream, $str127$___S_Class_is_not_correctly_imple, object.object_class_of_method( self ) );
      return self;
    }
    if( NIL != methods.funcall_instance_method_with_0_args( template_enumerator, $sym18$EMPTY_P ) )
    {
      PrintLow.format( stream, $str637$BAG__ );
    }
    else
    {
      PrintLow.format( stream, $str638$BAG__S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym27$FIRST ) );
      while ( NIL == methods.funcall_instance_method_with_0_args( template_enumerator, $sym23$LAST_P ))
      {
        PrintLow.format( stream, $str130$___S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym31$NEXT ) );
      }
      PrintLow.format( stream, $str131$_ );
    }
    basic_bag_deallocate_enumerator_method( self, template_enumerator );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject subloop_reserved_initialize_basic_bag_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject subloop_reserved_initialize_basic_bag_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym116$BASIC_COLLECTION, $sym120$CONTENTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym116$BASIC_COLLECTION, $sym119$ELEMENT_EQUALITY_PREDICATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym623$BASIC_BAG, $sym626$BAG_REPRESENTATION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 90634L)
  public static SubLObject basic_bag_p(final SubLObject basic_bag)
  {
    return classes.subloop_instanceof_class( basic_bag, $sym623$BASIC_BAG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 91906L)
  public static SubLObject basic_bag_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_method = NIL;
    SubLObject bag_representation = get_basic_bag_bag_representation( self );
    try
    {
      thread.throwStack.push( $sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD );
      try
      {
        basic_collection_initialize_method( self );
        bag_representation = NIL;
        Dynamic.sublisp_throw( $sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_bag_representation( self, bag_representation );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_method = Errors.handleThrowable( ccatch_env_var, $sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 92033L)
  public static SubLObject basic_bag_get_internal_representation_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_method = NIL;
    final SubLObject bag_representation = get_basic_bag_bag_representation( self );
    try
    {
      thread.throwStack.push( $sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD, bag_representation );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_bag_representation( self, bag_representation );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_method = Errors.handleThrowable( ccatch_env_var, $sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 92137L)
  public static SubLObject basic_bag_set_internal_representation_method(final SubLObject self, final SubLObject new_rep)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_method = NIL;
    SubLObject bag_representation = get_basic_bag_bag_representation( self );
    try
    {
      thread.throwStack.push( $sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !new_rep.isList() )
        {
          Errors.error( $str653$_SET_INTERNAL_REPRESENTATION__S__, self, new_rep );
        }
        bag_representation = new_rep;
        Dynamic.sublisp_throw( $sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD, new_rep );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_bag_representation( self, bag_representation );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_method = Errors.handleThrowable( ccatch_env_var, $sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 92426L)
  public static SubLObject basic_bag_allocate_enumerator_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_bag_method = NIL;
    final SubLObject bag_representation = get_basic_bag_bag_representation( self );
    try
    {
      thread.throwStack.push( $sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD );
      try
      {
        final SubLObject new_enumerator = object.object_new_method( $sym571$BASIC_BAG_ENUMERATOR );
        final SubLObject contents_pointer = object.object_new_method( $sym554$SUBLOOP_PRIVATE_PAIR );
        basic_bag_enumerator_set_contents_pointer_method( new_enumerator, contents_pointer );
        basic_bag_enumerator_set_contents_method( new_enumerator, bag_representation );
        basic_bag_enumerator_first_method( new_enumerator );
        Dynamic.sublisp_throw( $sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD, new_enumerator );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_bag_bag_representation( self, bag_representation );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_basic_bag_method = Errors.handleThrowable( ccatch_env_var, $sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_bag_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 92952L)
  public static SubLObject basic_bag_deallocate_enumerator_method(final SubLObject self, final SubLObject enumerator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == basic_bag_enumerator_p( enumerator ) )
    {
      Errors.error( $str659$_DEALLOCATE_ENUMERATOR__S____S_is, self, enumerator );
    }
    basic_bag_enumerator_set_contents_pointer_method( enumerator, NIL );
    basic_bag_enumerator_set_contents_method( enumerator, NIL );
    object.object_isolate_method( enumerator );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
  public static SubLObject get_test_list_element_symbolic_name(final SubLObject test_list_element)
  {
    return classes.subloop_get_access_protected_instance_slot( test_list_element, TWO_INTEGER, $sym663$SYMBOLIC_NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
  public static SubLObject set_test_list_element_symbolic_name(final SubLObject test_list_element, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( test_list_element, value, TWO_INTEGER, $sym663$SYMBOLIC_NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
  public static SubLObject subloop_reserved_initialize_test_list_element_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym55$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
  public static SubLObject subloop_reserved_initialize_test_list_element_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym57$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym305$BASIC_LIST_ELEMENT, $sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym38$OBJECT, $sym58$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym305$BASIC_LIST_ELEMENT, $sym308$QUA_LIST_ELEMENT_PARENT_LINKS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym661$TEST_LIST_ELEMENT, $sym663$SYMBOLIC_NAME, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93394L)
  public static SubLObject test_list_element_p(final SubLObject test_list_element)
  {
    return classes.subloop_instanceof_class( test_list_element, $sym661$TEST_LIST_ELEMENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93854L)
  public static SubLObject test_list_element_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_test_list_element_method = NIL;
    SubLObject symbolic_name = get_test_list_element_symbolic_name( self );
    try
    {
      thread.throwStack.push( $sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD );
      try
      {
        symbolic_name = NIL;
        Dynamic.sublisp_throw( $sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_test_list_element_symbolic_name( self, symbolic_name );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_test_list_element_method = Errors.handleThrowable( ccatch_env_var, $sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_test_list_element_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 93963L)
  public static SubLObject test_list_element_get_symbolic_name_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_test_list_element_method = NIL;
    final SubLObject symbolic_name = get_test_list_element_symbolic_name( self );
    try
    {
      thread.throwStack.push( $sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, symbolic_name );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_test_list_element_symbolic_name( self, symbolic_name );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_test_list_element_method = Errors.handleThrowable( ccatch_env_var, $sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_test_list_element_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94057L)
  public static SubLObject test_list_element_set_symbolic_name_method(final SubLObject self, final SubLObject new_symbolic_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_test_list_element_method = NIL;
    SubLObject symbolic_name = get_test_list_element_symbolic_name( self );
    try
    {
      thread.throwStack.push( $sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD );
      try
      {
        symbolic_name = new_symbolic_name;
        Dynamic.sublisp_throw( $sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, new_symbolic_name );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_test_list_element_symbolic_name( self, symbolic_name );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_test_list_element_method = Errors.handleThrowable( ccatch_env_var, $sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_test_list_element_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94214L)
  public static SubLObject test_list_element_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_test_list_element_method = NIL;
    final SubLObject symbolic_name = get_test_list_element_symbolic_name( self );
    try
    {
      thread.throwStack.push( $sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD );
      try
      {
        PrintLow.format( stream, $str680$__S_, symbolic_name );
        Dynamic.sublisp_throw( $sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_test_list_element_symbolic_name( self, symbolic_name );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_test_list_element_method = Errors.handleThrowable( ccatch_env_var, $sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_test_list_element_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94355L)
  public static SubLObject test_list_element_on_add_method(final SubLObject self, final SubLObject parent_list)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94462L)
  public static SubLObject test_list_element_on_delete_method(final SubLObject self, final SubLObject parent_list)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 94618L)
  public static SubLObject intern_test_list_element(final SubLObject symbolic_name)
  {
    SubLObject cdolist_list_var = $test_list_elements$.getGlobalValue();
    SubLObject list_element = NIL;
    list_element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( test_list_element_get_symbolic_name_method( list_element ).eql( symbolic_name ) )
      {
        return list_element;
      }
      cdolist_list_var = cdolist_list_var.rest();
      list_element = cdolist_list_var.first();
    }
    final SubLObject new_list_element = object.object_new_method( $sym661$TEST_LIST_ELEMENT );
    test_list_element_set_symbolic_name_method( new_list_element, symbolic_name );
    $test_list_elements$.setGlobalValue( ConsesLow.cons( new_list_element, $test_list_elements$.getGlobalValue() ) );
    return new_list_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95116L)
  public static SubLObject enumerator_template_empty_p(final SubLObject enumerator_template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumerator_template_p( enumerator_template ) )
    {
      Errors.error( $str685$ENUMERATOR_TEMPLATE_EMPTY_P___S_i, enumerator_template );
    }
    if( NIL != basic_doubly_linked_list_enumerator_p( enumerator_template ) )
    {
      return basic_doubly_linked_list_enumerator_empty_p_method( enumerator_template );
    }
    if( NIL != basic_collection_enumerator_p( enumerator_template ) )
    {
      return basic_collection_enumerator_empty_p_method( enumerator_template );
    }
    return methods.funcall_instance_method_with_0_args( enumerator_template, $sym18$EMPTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95356L)
  public static SubLObject enumerator_template_last_p(final SubLObject enumerator_template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumerator_template_p( enumerator_template ) )
    {
      Errors.error( $str686$ENUMERATOR_TEMPLATE_LAST_P___S_is, enumerator_template );
    }
    if( NIL != basic_doubly_linked_list_enumerator_p( enumerator_template ) )
    {
      return basic_doubly_linked_list_enumerator_last_p_method( enumerator_template );
    }
    if( NIL != basic_collection_enumerator_p( enumerator_template ) )
    {
      return basic_collection_enumerator_last_p_method( enumerator_template );
    }
    return methods.funcall_instance_method_with_0_args( enumerator_template, $sym23$LAST_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95539L)
  public static SubLObject enumerator_template_first(final SubLObject enumerator_template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumerator_template_p( enumerator_template ) )
    {
      Errors.error( $str687$ENUMERATOR_TEMPLATE_FIRST___S_is_, enumerator_template );
    }
    if( NIL != basic_doubly_linked_list_enumerator_p( enumerator_template ) )
    {
      return basic_doubly_linked_list_enumerator_first_method( enumerator_template );
    }
    if( NIL != basic_collection_enumerator_p( enumerator_template ) )
    {
      return basic_collection_enumerator_first_method( enumerator_template );
    }
    return methods.funcall_instance_method_with_0_args( enumerator_template, $sym27$FIRST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95720L)
  public static SubLObject enumerator_template_next(final SubLObject enumerator_template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumerator_template_p( enumerator_template ) )
    {
      Errors.error( $str688$ENUMERATOR_TEMPLATE_NEXT___S_is_n, enumerator_template );
    }
    if( NIL != basic_doubly_linked_list_enumerator_p( enumerator_template ) )
    {
      return basic_doubly_linked_list_enumerator_next_method( enumerator_template );
    }
    if( NIL != basic_collection_enumerator_p( enumerator_template ) )
    {
      return basic_collection_enumerator_next_method( enumerator_template );
    }
    return methods.funcall_instance_method_with_0_args( enumerator_template, $sym31$NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 95899L)
  public static SubLObject enumerator_template_current(final SubLObject enumerator_template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == enumerator_template_p( enumerator_template ) )
    {
      Errors.error( $str689$ENUMERATOR_TEMPLATE_CURRENT___S_i, enumerator_template );
    }
    if( NIL != basic_doubly_linked_list_enumerator_p( enumerator_template ) )
    {
      return basic_doubly_linked_list_enumerator_current_method( enumerator_template );
    }
    if( NIL != basic_collection_enumerator_p( enumerator_template ) )
    {
      return basic_collection_enumerator_current_method( enumerator_template );
    }
    return methods.funcall_instance_method_with_0_args( enumerator_template, $sym25$CURRENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 96084L)
  public static SubLObject collection_template_empty_p(final SubLObject collection_template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == collection_template_p( collection_template ) )
    {
      Errors.error( $str690$COLLECTION_TEMPLATE_EMPTY_P___S_i, collection_template );
    }
    if( NIL != basic_doubly_linked_list_p( collection_template ) )
    {
      return basic_doubly_linked_list_empty_p_method( collection_template );
    }
    if( NIL != basic_end_pointer_list_p( collection_template ) )
    {
      return basic_end_pointer_list_empty_p_method( collection_template );
    }
    if( NIL != basic_list_p( collection_template ) )
    {
      return basic_list_empty_p_method( collection_template );
    }
    if( NIL != basic_collection_p( collection_template ) )
    {
      return basic_collection_empty_p_method( collection_template );
    }
    return methods.funcall_instance_method_with_0_args( collection_template, $sym18$EMPTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 96281L)
  public static SubLObject doubly_linked_list_template_add(final SubLObject doubly_linked_list_template, final SubLObject new_element)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == doubly_linked_list_template_p( doubly_linked_list_template ) )
    {
      Errors.error( $str691$DOUBLY_LINKED_LIST_TEMPLATE_ADD__, doubly_linked_list_template );
    }
    if( NIL != basic_doubly_linked_list_p( doubly_linked_list_template ) )
    {
      return basic_doubly_linked_list_add_method( doubly_linked_list_template, new_element );
    }
    return methods.funcall_instance_method_with_1_args( doubly_linked_list_template, $sym106$ADD, new_element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-collections.lisp", position = 96446L)
  public static SubLObject doubly_linked_list_template_get_contents(final SubLObject doubly_linked_list_template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == doubly_linked_list_template_p( doubly_linked_list_template ) )
    {
      Errors.error( $str692$DOUBLY_LINKED_LIST_TEMPLATE_GET_C, doubly_linked_list_template );
    }
    if( NIL != basic_doubly_linked_list_p( doubly_linked_list_template ) )
    {
      return basic_doubly_linked_list_get_contents_method( doubly_linked_list_template );
    }
    return methods.funcall_instance_method_with_0_args( doubly_linked_list_template, $sym152$GET_CONTENTS );
  }

  public static SubLObject declare_subloop_collections_file()
  {
    SubLFiles.declareFunction( me, "valid_sequential_directions", "VALID-SEQUENTIAL-DIRECTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "sequential_direction_p", "SEQUENTIAL-DIRECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_sequential_direction", "ENCODE-SEQUENTIAL-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_sequential_direction", "DECODE-SEQUENTIAL-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sequential_direction_less_p", "SEQUENTIAL-DIRECTION-LESS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "sequential_direction_greater_p", "SEQUENTIAL-DIRECTION-GREATER-P", 2, 0, false );
    SubLFiles.declareFunction( me, "iterator_template_p", "ITERATOR-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerator_template_p", "ENUMERATOR-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_enumerator_template_p", "COLLECTION-ENUMERATOR-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "protected_membership_template_p", "PROTECTED-MEMBERSHIP-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_collection_enumerator_direction", "GET-BASIC-COLLECTION-ENUMERATOR-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_collection_enumerator_direction", "SET-BASIC-COLLECTION-ENUMERATOR-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_collection_enumerator_contents_pointer", "GET-BASIC-COLLECTION-ENUMERATOR-CONTENTS-POINTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_collection_enumerator_contents_pointer", "SET-BASIC-COLLECTION-ENUMERATOR-CONTENTS-POINTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_collection_enumerator_collection_contents", "GET-BASIC-COLLECTION-ENUMERATOR-COLLECTION-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_collection_enumerator_collection_contents", "SET-BASIC-COLLECTION-ENUMERATOR-COLLECTION-CONTENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_previous_method", "BASIC-COLLECTION-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_next_method", "BASIC-COLLECTION-ENUMERATOR-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_last_method", "BASIC-COLLECTION-ENUMERATOR-LAST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_first_method", "BASIC-COLLECTION-ENUMERATOR-FIRST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_current_method", "BASIC-COLLECTION-ENUMERATOR-CURRENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_last_p_method", "BASIC-COLLECTION-ENUMERATOR-LAST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_first_p_method", "BASIC-COLLECTION-ENUMERATOR-FIRST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_empty_p_method", "BASIC-COLLECTION-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_collection_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_collection_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_p", "BASIC-COLLECTION-ENUMERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_initialize_method", "BASIC-COLLECTION-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_store_collection_contents_method", "BASIC-COLLECTION-ENUMERATOR-STORE-COLLECTION-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_retrieve_collection_contents_method", "BASIC-COLLECTION-ENUMERATOR-RETRIEVE-COLLECTION-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_set_contents_pointer_method", "BASIC-COLLECTION-ENUMERATOR-SET-CONTENTS-POINTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_get_contents_pointer_method", "BASIC-COLLECTION-ENUMERATOR-GET-CONTENTS-POINTER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_get_direction_method", "BASIC-COLLECTION-ENUMERATOR-GET-DIRECTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_enumerator_set_direction_method", "BASIC-COLLECTION-ENUMERATOR-SET-DIRECTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "collection_template_p", "COLLECTION-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_collection_element_equality_predicate", "GET-BASIC-COLLECTION-ELEMENT-EQUALITY-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_collection_element_equality_predicate", "SET-BASIC-COLLECTION-ELEMENT-EQUALITY-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_collection_contents", "GET-BASIC-COLLECTION-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_collection_contents", "SET-BASIC-COLLECTION-CONTENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_empty_p_method", "BASIC-COLLECTION-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_member_p_method", "BASIC-COLLECTION-MEMBER-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_remove_method", "BASIC-COLLECTION-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_add_method", "BASIC-COLLECTION-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_clear_method", "BASIC-COLLECTION-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_get_element_count_method", "BASIC-COLLECTION-GET-ELEMENT-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_print_method", "BASIC-COLLECTION-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_collection_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_collection_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_p", "BASIC-COLLECTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_initialize_method", "BASIC-COLLECTION-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_element_equal_p_method", "BASIC-COLLECTION-ELEMENT-EQUAL-P-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_get_element_equality_predicate_method", "BASIC-COLLECTION-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_set_element_equality_predicate_method", "BASIC-COLLECTION-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_get_contents_method", "BASIC-COLLECTION-GET-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_set_contents_method", "BASIC-COLLECTION-SET-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_allocate_enumerator_method", "BASIC-COLLECTION-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_collection_deallocate_enumerator_method", "BASIC-COLLECTION-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "list_template_p", "LIST-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_empty_p_method", "BASIC-LIST-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_reverse_method", "BASIC-LIST-REVERSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_append_method", "BASIC-LIST-APPEND-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_position_method", "BASIC-LIST-POSITION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_set_nth_method", "BASIC-LIST-SET-NTH-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_list_nth_method", "BASIC-LIST-NTH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_but_last_method", "BASIC-LIST-BUT-LAST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_pop_method", "BASIC-LIST-POP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_push_method", "BASIC-LIST-PUSH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_print_method", "BASIC-LIST-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_list_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_list_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_p", "BASIC-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "end_pointer_list_template_p", "END-POINTER-LIST-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_end_pointer_list_end_pointer", "GET-BASIC-END-POINTER-LIST-END-POINTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_end_pointer_list_end_pointer", "SET-BASIC-END-POINTER-LIST-END-POINTER", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_empty_p_method", "BASIC-END-POINTER-LIST-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_reverse_method", "BASIC-END-POINTER-LIST-REVERSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_append_method", "BASIC-END-POINTER-LIST-APPEND-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_position_method", "BASIC-END-POINTER-LIST-POSITION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_nth_method", "BASIC-END-POINTER-LIST-NTH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_but_last_method", "BASIC-END-POINTER-LIST-BUT-LAST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_pop_method", "BASIC-END-POINTER-LIST-POP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_push_method", "BASIC-END-POINTER-LIST-PUSH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_remove_method", "BASIC-END-POINTER-LIST-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_add_method", "BASIC-END-POINTER-LIST-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_clear_method", "BASIC-END-POINTER-LIST-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_print_method", "BASIC-END-POINTER-LIST-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_end_pointer_list_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_end_pointer_list_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_p", "BASIC-END-POINTER-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_get_end_pointer_method", "BASIC-END-POINTER-LIST-GET-END-POINTER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_end_pointer_list_set_end_pointer_method", "BASIC-END-POINTER-LIST-SET-END-POINTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "double_link_cell_print_function_trampoline", "DOUBLE-LINK-CELL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "double_link_cell_p", "DOUBLE-LINK-CELL-P", 1, 0, false );
    new $double_link_cell_p$UnaryFunction();
    SubLFiles.declareFunction( me, "dlc_owner", "DLC-OWNER", 1, 0, false );
    SubLFiles.declareFunction( me, "dlc_contents", "DLC-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "dlc_previous", "DLC-PREVIOUS", 1, 0, false );
    SubLFiles.declareFunction( me, "dlc_next", "DLC-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dlc_owner", "_CSETF-DLC-OWNER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dlc_contents", "_CSETF-DLC-CONTENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dlc_previous", "_CSETF-DLC-PREVIOUS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_dlc_next", "_CSETF-DLC-NEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_double_link_cell", "MAKE-DOUBLE-LINK-CELL", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_double_link_cell", "VISIT-DEFSTRUCT-DOUBLE-LINK-CELL", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_double_link_cell_method", "VISIT-DEFSTRUCT-OBJECT-DOUBLE-LINK-CELL-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "with_dlc_read_only", "WITH-DLC-READ-ONLY" );
    SubLFiles.declareMacro( me, "with_dlc_read_write", "WITH-DLC-READ-WRITE" );
    SubLFiles.declareFunction( me, "dlc_copy_links", "DLC-COPY-LINKS", 2, 0, false );
    SubLFiles.declareFunction( me, "list_element_template_p", "LIST-ELEMENT-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_list_element_qua_list_element_parent_links", "GET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_list_element_qua_list_element_parent_links", "SET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_list_element_qua_list_element_self_deletion_mode", "GET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_list_element_qua_list_element_self_deletion_mode", "SET-BASIC-LIST-ELEMENT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_perform_action_method", "BASIC-LIST-ELEMENT-PERFORM-ACTION-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_on_delete_method", "BASIC-LIST-ELEMENT-ON-DELETE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_on_add_method", "BASIC-LIST-ELEMENT-ON-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_get_collections_method", "BASIC-LIST-ELEMENT-GET-COLLECTIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_member_p_method", "BASIC-LIST-ELEMENT-MEMBER-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_delete_self_from_all_collections_method", "BASIC-LIST-ELEMENT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_transfer_self_method", "BASIC-LIST-ELEMENT-TRANSFER-SELF-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_delete_self_from_collection_method", "BASIC-LIST-ELEMENT-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_delete_parent_link_method", "BASIC-LIST-ELEMENT-DELETE-PARENT-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_add_parent_link_method", "BASIC-LIST-ELEMENT-ADD-PARENT-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_list_element_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_list_element_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_p", "BASIC-LIST-ELEMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_initialize_method", "BASIC-LIST-ELEMENT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_get_parent_links_method", "BASIC-LIST-ELEMENT-GET-PARENT-LINKS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_set_parent_links_method", "BASIC-LIST-ELEMENT-SET-PARENT-LINKS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_get_self_deletion_mode_method", "BASIC-LIST-ELEMENT-GET-SELF-DELETION-MODE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_list_element_set_self_deletion_mode_method", "BASIC-LIST-ELEMENT-SET-SELF-DELETION-MODE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "doubly_linked_list_template_p", "DOUBLY-LINKED-LIST-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_list_last_link", "GET-BASIC-DOUBLY-LINKED-LIST-LAST-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_list_last_link", "SET-BASIC-DOUBLY-LINKED-LIST-LAST-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_list_first_link", "GET-BASIC-DOUBLY-LINKED-LIST-FIRST-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_list_first_link", "SET-BASIC-DOUBLY-LINKED-LIST-FIRST-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_list_element_count", "GET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_list_element_count", "SET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_list_element_equality_predicate", "GET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUALITY-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_list_element_equality_predicate", "SET-BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUALITY-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_swap_method", "BASIC-DOUBLY-LINKED-LIST-SWAP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_empty_p_method", "BASIC-DOUBLY-LINKED-LIST-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_reverse_method", "BASIC-DOUBLY-LINKED-LIST-REVERSE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_append_method", "BASIC-DOUBLY-LINKED-LIST-APPEND-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_position_method", "BASIC-DOUBLY-LINKED-LIST-POSITION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_set_nth_method", "BASIC-DOUBLY-LINKED-LIST-SET-NTH-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_nth_method", "BASIC-DOUBLY-LINKED-LIST-NTH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_but_last_method", "BASIC-DOUBLY-LINKED-LIST-BUT-LAST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_pop_method", "BASIC-DOUBLY-LINKED-LIST-POP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_push_method", "BASIC-DOUBLY-LINKED-LIST-PUSH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_member_p_method", "BASIC-DOUBLY-LINKED-LIST-MEMBER-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_remove_method", "BASIC-DOUBLY-LINKED-LIST-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_add_method", "BASIC-DOUBLY-LINKED-LIST-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_clear_method", "BASIC-DOUBLY-LINKED-LIST-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_print_method", "BASIC-DOUBLY-LINKED-LIST-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_find_nth_link_method", "BASIC-DOUBLY-LINKED-LIST-FIND-NTH-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_find_link_method", "BASIC-DOUBLY-LINKED-LIST-FIND-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_reverse_link_method", "BASIC-DOUBLY-LINKED-LIST-REVERSE-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_delete_link_method", "BASIC-DOUBLY-LINKED-LIST-DELETE-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_set_contents_method", "BASIC-DOUBLY-LINKED-LIST-SET-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_get_contents_method", "BASIC-DOUBLY-LINKED-LIST-GET-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_element_equal_p_method", "BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUAL-P-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_doubly_linked_list_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_doubly_linked_list_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_p", "BASIC-DOUBLY-LINKED-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_get_element_equality_predicate_method", "BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_set_element_equality_predicate_method", "BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_set_element_count_method", "BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-COUNT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_inc_element_count_method", "BASIC-DOUBLY-LINKED-LIST-INC-ELEMENT-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_dec_element_count_method", "BASIC-DOUBLY-LINKED-LIST-DEC-ELEMENT-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_get_first_link_method", "BASIC-DOUBLY-LINKED-LIST-GET-FIRST-LINK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_set_first_link_method", "BASIC-DOUBLY-LINKED-LIST-SET-FIRST-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_get_last_link_method", "BASIC-DOUBLY-LINKED-LIST-GET-LAST-LINK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_set_last_link_method", "BASIC-DOUBLY-LINKED-LIST-SET-LAST-LINK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_get_element_count_method", "BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_list_enumerator_direction", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_list_enumerator_direction", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_list_enumerator_current_link", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_list_enumerator_current_link", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_list_enumerator_last_link", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_list_enumerator_last_link", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_list_enumerator_first_link", "GET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_list_enumerator_first_link", "SET-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-LINK", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_doubly_linked_list_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_doubly_linked_list_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_p", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_initialize_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_isolate_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-ISOLATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_set_initial_state_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-SET-INITIAL-STATE-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_empty_p_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_first_p_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_last_p_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_current_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_first_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_last_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_next_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_enumerator_previous_method", "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_allocate_enumerator_method", "BASIC-DOUBLY-LINKED-LIST-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_list_deallocate_enumerator_method", "BASIC-DOUBLY-LINKED-LIST-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "pair_template_p", "PAIR-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_pair_second_element", "GET-BASIC-PAIR-SECOND-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_pair_second_element", "SET-BASIC-PAIR-SECOND-ELEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_pair_first_element", "GET-BASIC-PAIR-FIRST-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_pair_first_element", "SET-BASIC-PAIR-FIRST-ELEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_pair_print_method", "BASIC-PAIR-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_pair_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_pair_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_pair_p", "BASIC-PAIR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_pair_initialize_method", "BASIC-PAIR-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_pair_get_first_method", "BASIC-PAIR-GET-FIRST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_pair_set_first_method", "BASIC-PAIR-SET-FIRST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_pair_get_second_method", "BASIC-PAIR-GET-SECOND-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_pair_set_second_method", "BASIC-PAIR-SET-SECOND-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "triplet_template_p", "TRIPLET-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_triplet_third_element", "GET-BASIC-TRIPLET-THIRD-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_triplet_third_element", "SET-BASIC-TRIPLET-THIRD-ELEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_triplet_print_method", "BASIC-TRIPLET-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_triplet_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_triplet_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_triplet_p", "BASIC-TRIPLET-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_triplet_initialize_method", "BASIC-TRIPLET-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_triplet_get_third_method", "BASIC-TRIPLET-GET-THIRD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_triplet_set_third_method", "BASIC-TRIPLET-SET-THIRD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "generic_dllt_add_parent_link_function", "GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "generic_dllt_delete_parent_link_function", "GENERIC-DLLT-DELETE-PARENT-LINK-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "generic_dllt_delete_link_function", "GENERIC-DLLT-DELETE-LINK-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "generic_dllt_delete_self_from_collection_function", "GENERIC-DLLT-DELETE-SELF-FROM-COLLECTION-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_subloop_private_pair_class", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_subloop_private_pair_instance", "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_private_pair_p", "SUBLOOP-PRIVATE-PAIR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_private_pair_print_method", "SUBLOOP-PRIVATE-PAIR-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "bag_enumerator_template_p", "BAG-ENUMERATOR-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_collections_bag_enum_get_next", "SUBLOOP-COLLECTIONS-BAG-ENUM-GET-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_collections_get_previous_cons", "SUBLOOP-COLLECTIONS-GET-PREVIOUS-CONS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_collections_backup_pointer", "SUBLOOP-COLLECTIONS-BACKUP-POINTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_bag_enumerator_direction", "GET-BASIC-BAG-ENUMERATOR-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_bag_enumerator_direction", "SET-BASIC-BAG-ENUMERATOR-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_bag_enumerator_contents", "GET-BASIC-BAG-ENUMERATOR-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_bag_enumerator_contents", "SET-BASIC-BAG-ENUMERATOR-CONTENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_bag_enumerator_contents_pointer", "GET-BASIC-BAG-ENUMERATOR-CONTENTS-POINTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_bag_enumerator_contents_pointer", "SET-BASIC-BAG-ENUMERATOR-CONTENTS-POINTER", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_previous_method", "BASIC-BAG-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_next_method", "BASIC-BAG-ENUMERATOR-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_last_method", "BASIC-BAG-ENUMERATOR-LAST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_first_method", "BASIC-BAG-ENUMERATOR-FIRST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_current_method", "BASIC-BAG-ENUMERATOR-CURRENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_last_p_method", "BASIC-BAG-ENUMERATOR-LAST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_first_p_method", "BASIC-BAG-ENUMERATOR-FIRST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_empty_p_method", "BASIC-BAG-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_bag_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_bag_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_p", "BASIC-BAG-ENUMERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_instantiate_method", "BASIC-BAG-ENUMERATOR-INSTANTIATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_get_contents_pointer_method", "BASIC-BAG-ENUMERATOR-GET-CONTENTS-POINTER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_set_contents_pointer_method", "BASIC-BAG-ENUMERATOR-SET-CONTENTS-POINTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_get_contents_method", "BASIC-BAG-ENUMERATOR-GET-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_set_contents_method", "BASIC-BAG-ENUMERATOR-SET-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_get_direction_method", "BASIC-BAG-ENUMERATOR-GET-DIRECTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_enumerator_set_direction_method", "BASIC-BAG-ENUMERATOR-SET-DIRECTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "bag_template_p", "BAG-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_collections_bag_template_translate_pair", "SUBLOOP-COLLECTIONS-BAG-TEMPLATE-TRANSLATE-PAIR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_bag_bag_representation", "GET-BASIC-BAG-BAG-REPRESENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_bag_bag_representation", "SET-BASIC-BAG-BAG-REPRESENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_empty_p_method", "BASIC-BAG-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_get_unique_element_count_method", "BASIC-BAG-GET-UNIQUE-ELEMENT-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_get_unique_elements_method", "BASIC-BAG-GET-UNIQUE-ELEMENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_occurences_method", "BASIC-BAG-OCCURENCES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_member_p_method", "BASIC-BAG-MEMBER-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_remove_method", "BASIC-BAG-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_add_method", "BASIC-BAG-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_set_contents_method", "BASIC-BAG-SET-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_get_contents_method", "BASIC-BAG-GET-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_get_element_count_method", "BASIC-BAG-GET-ELEMENT-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_print_method", "BASIC-BAG-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_bag_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_bag_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_p", "BASIC-BAG-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_initialize_method", "BASIC-BAG-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_get_internal_representation_method", "BASIC-BAG-GET-INTERNAL-REPRESENTATION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_set_internal_representation_method", "BASIC-BAG-SET-INTERNAL-REPRESENTATION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_allocate_enumerator_method", "BASIC-BAG-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_bag_deallocate_enumerator_method", "BASIC-BAG-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_test_list_element_symbolic_name", "GET-TEST-LIST-ELEMENT-SYMBOLIC-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_test_list_element_symbolic_name", "SET-TEST-LIST-ELEMENT-SYMBOLIC-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_test_list_element_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_test_list_element_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "test_list_element_p", "TEST-LIST-ELEMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "test_list_element_initialize_method", "TEST-LIST-ELEMENT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "test_list_element_get_symbolic_name_method", "TEST-LIST-ELEMENT-GET-SYMBOLIC-NAME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "test_list_element_set_symbolic_name_method", "TEST-LIST-ELEMENT-SET-SYMBOLIC-NAME-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "test_list_element_print_method", "TEST-LIST-ELEMENT-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "test_list_element_on_add_method", "TEST-LIST-ELEMENT-ON-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "test_list_element_on_delete_method", "TEST-LIST-ELEMENT-ON-DELETE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "intern_test_list_element", "INTERN-TEST-LIST-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerator_template_empty_p", "ENUMERATOR-TEMPLATE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerator_template_last_p", "ENUMERATOR-TEMPLATE-LAST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerator_template_first", "ENUMERATOR-TEMPLATE-FIRST", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerator_template_next", "ENUMERATOR-TEMPLATE-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "enumerator_template_current", "ENUMERATOR-TEMPLATE-CURRENT", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_template_empty_p", "COLLECTION-TEMPLATE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "doubly_linked_list_template_add", "DOUBLY-LINKED-LIST-TEMPLATE-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "doubly_linked_list_template_get_contents", "DOUBLY-LINKED-LIST-TEMPLATE-GET-CONTENTS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_subloop_collections_file()
  {
    $valid_sequential_directions$ = SubLFiles.defconstant( "*VALID-SEQUENTIAL-DIRECTIONS*", $list0 );
    $dtp_double_link_cell$ = SubLFiles.defconstant( "*DTP-DOUBLE-LINK-CELL*", $sym249$DOUBLE_LINK_CELL );
    $test_list_elements$ = SubLFiles.deflexical( "*TEST-LIST-ELEMENTS*", ( maybeDefault( $sym684$_TEST_LIST_ELEMENTS_, $test_list_elements$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_subloop_collections_file()
  {
    enumerations.enumerations_incorporate_definition( $sym1$SEQUENTIAL_DIRECTION, $list0 );
    interfaces.new_interface( $sym8$ITERATOR_TEMPLATE, NIL, NIL, $list9 );
    interfaces.new_interface( $sym10$ENUMERATOR_TEMPLATE, $list11, $list12, $list13 );
    interfaces.new_interface( $sym14$COLLECTION_ENUMERATOR_TEMPLATE, $list15, $list16, $list17 );
    interfaces.interfaces_add_interface_instance_method( $sym18$EMPTY_P, $sym14$COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list20 );
    interfaces.interfaces_add_interface_instance_method( $sym21$FIRST_P, $sym14$COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list22 );
    interfaces.interfaces_add_interface_instance_method( $sym23$LAST_P, $sym14$COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list24 );
    interfaces.interfaces_add_interface_instance_method( $sym25$CURRENT, $sym14$COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list26 );
    interfaces.interfaces_add_interface_instance_method( $sym27$FIRST, $sym14$COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list28 );
    interfaces.interfaces_add_interface_instance_method( $sym29$LAST, $sym14$COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list30 );
    interfaces.interfaces_add_interface_instance_method( $sym31$NEXT, $sym14$COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list32 );
    interfaces.interfaces_add_interface_instance_method( $sym33$PREVIOUS, $sym14$COLLECTION_ENUMERATOR_TEMPLATE, $list19, NIL, $list34 );
    interfaces.new_interface( $sym35$PROTECTED_MEMBERSHIP_TEMPLATE, NIL, NIL, $list36 );
    classes.subloop_new_class( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym38$OBJECT, $list39, NIL, $list40 );
    classes.class_set_implements_slot_listeners( $sym37$BASIC_COLLECTION_ENUMERATOR, NIL );
    methods.methods_incorporate_instance_method( $sym33$PREVIOUS, $sym37$BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list34 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym33$PREVIOUS, $sym47$BASIC_COLLECTION_ENUMERATOR_PREVIOUS_METHOD );
    methods.methods_incorporate_instance_method( $sym31$NEXT, $sym37$BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list32 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym31$NEXT, $sym48$BASIC_COLLECTION_ENUMERATOR_NEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym29$LAST, $sym37$BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list30 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym29$LAST, $sym49$BASIC_COLLECTION_ENUMERATOR_LAST_METHOD );
    methods.methods_incorporate_instance_method( $sym27$FIRST, $sym37$BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list28 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym27$FIRST, $sym50$BASIC_COLLECTION_ENUMERATOR_FIRST_METHOD );
    methods.methods_incorporate_instance_method( $sym25$CURRENT, $sym37$BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list26 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym25$CURRENT, $sym51$BASIC_COLLECTION_ENUMERATOR_CURRENT_METHOD );
    methods.methods_incorporate_instance_method( $sym23$LAST_P, $sym37$BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list24 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym23$LAST_P, $sym52$BASIC_COLLECTION_ENUMERATOR_LAST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym21$FIRST_P, $sym37$BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list22 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym21$FIRST_P, $sym53$BASIC_COLLECTION_ENUMERATOR_FIRST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym18$EMPTY_P, $sym37$BASIC_COLLECTION_ENUMERATOR, $list19, NIL, $list20 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym18$EMPTY_P, $sym54$BASIC_COLLECTION_ENUMERATOR_EMPTY_P_METHOD );
    classes.subloop_note_class_initialization_function( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym56$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym59$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_INSTANCE );
    subloop_reserved_initialize_basic_collection_enumerator_class( $sym37$BASIC_COLLECTION_ENUMERATOR );
    methods.methods_incorporate_instance_method( $sym60$INITIALIZE, $sym37$BASIC_COLLECTION_ENUMERATOR, $list61, NIL, $list62 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym60$INITIALIZE, $sym64$BASIC_COLLECTION_ENUMERATOR_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym65$STORE_COLLECTION_CONTENTS, $sym37$BASIC_COLLECTION_ENUMERATOR, $list66, $list67, $list68 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym65$STORE_COLLECTION_CONTENTS, $sym70$BASIC_COLLECTION_ENUMERATOR_STORE_COLLECTION_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym71$RETRIEVE_COLLECTION_CONTENTS, $sym37$BASIC_COLLECTION_ENUMERATOR, $list66, NIL, $list72 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym71$RETRIEVE_COLLECTION_CONTENTS, $sym74$BASIC_COLLECTION_ENUMERATOR_RETRIEVE_COLLECTION_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym75$SET_CONTENTS_POINTER, $sym37$BASIC_COLLECTION_ENUMERATOR, $list66, $list76, $list77 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym75$SET_CONTENTS_POINTER, $sym79$BASIC_COLLECTION_ENUMERATOR_SET_CONTENTS_POINTER_METHOD );
    methods.methods_incorporate_instance_method( $sym80$GET_CONTENTS_POINTER, $sym37$BASIC_COLLECTION_ENUMERATOR, $list66, NIL, $list81 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym80$GET_CONTENTS_POINTER, $sym83$BASIC_COLLECTION_ENUMERATOR_GET_CONTENTS_POINTER_METHOD );
    methods.methods_incorporate_instance_method( $sym84$GET_DIRECTION, $sym37$BASIC_COLLECTION_ENUMERATOR, $list66, NIL, $list85 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym84$GET_DIRECTION, $sym87$BASIC_COLLECTION_ENUMERATOR_GET_DIRECTION_METHOD );
    methods.methods_incorporate_instance_method( $sym88$SET_DIRECTION, $sym37$BASIC_COLLECTION_ENUMERATOR, $list66, $list89, $list90 );
    methods.subloop_register_instance_method( $sym37$BASIC_COLLECTION_ENUMERATOR, $sym88$SET_DIRECTION, $sym93$BASIC_COLLECTION_ENUMERATOR_SET_DIRECTION_METHOD );
    interfaces.new_interface( $sym94$COLLECTION_TEMPLATE, NIL, NIL, $list95 );
    interfaces.interfaces_add_interface_instance_method( $sym96$PRINT, $sym94$COLLECTION_TEMPLATE, $list19, $list97, $list98 );
    interfaces.interfaces_add_interface_instance_method( $sym99$ELEMENT_EQUAL_P, $sym94$COLLECTION_TEMPLATE, $list19, $list100, $list101 );
    interfaces.interfaces_add_interface_instance_method( $sym102$GET_ELEMENT_COUNT, $sym94$COLLECTION_TEMPLATE, $list19, NIL, $list103 );
    interfaces.interfaces_add_interface_instance_method( $sym104$CLEAR, $sym94$COLLECTION_TEMPLATE, $list19, NIL, $list105 );
    interfaces.interfaces_add_interface_instance_method( $sym106$ADD, $sym94$COLLECTION_TEMPLATE, $list19, $list107, $list108 );
    interfaces.interfaces_add_interface_instance_method( $sym109$REMOVE, $sym94$COLLECTION_TEMPLATE, $list19, $list110, $list111 );
    interfaces.interfaces_add_interface_instance_method( $sym112$MEMBER_P, $sym94$COLLECTION_TEMPLATE, $list19, $list113, $list114 );
    interfaces.interfaces_add_interface_instance_method( $sym18$EMPTY_P, $sym94$COLLECTION_TEMPLATE, $list19, NIL, $list115 );
    classes.subloop_new_class( $sym116$BASIC_COLLECTION, $sym38$OBJECT, $list117, NIL, $list118 );
    classes.class_set_implements_slot_listeners( $sym116$BASIC_COLLECTION, NIL );
    methods.methods_incorporate_instance_method( $sym18$EMPTY_P, $sym116$BASIC_COLLECTION, $list19, NIL, $list115 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym18$EMPTY_P, $sym121$BASIC_COLLECTION_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym112$MEMBER_P, $sym116$BASIC_COLLECTION, $list19, $list113, $list114 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym112$MEMBER_P, $sym122$BASIC_COLLECTION_MEMBER_P_METHOD );
    methods.methods_incorporate_instance_method( $sym109$REMOVE, $sym116$BASIC_COLLECTION, $list19, $list110, $list111 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym109$REMOVE, $sym123$BASIC_COLLECTION_REMOVE_METHOD );
    methods.methods_incorporate_instance_method( $sym106$ADD, $sym116$BASIC_COLLECTION, $list19, $list107, $list108 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym106$ADD, $sym124$BASIC_COLLECTION_ADD_METHOD );
    methods.methods_incorporate_instance_method( $sym104$CLEAR, $sym116$BASIC_COLLECTION, $list19, NIL, $list105 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym104$CLEAR, $sym125$BASIC_COLLECTION_CLEAR_METHOD );
    methods.methods_incorporate_instance_method( $sym102$GET_ELEMENT_COUNT, $sym116$BASIC_COLLECTION, $list19, NIL, $list103 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym102$GET_ELEMENT_COUNT, $sym126$BASIC_COLLECTION_GET_ELEMENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym96$PRINT, $sym116$BASIC_COLLECTION, $list19, $list97, $list98 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym96$PRINT, $sym132$BASIC_COLLECTION_PRINT_METHOD );
    classes.subloop_note_class_initialization_function( $sym116$BASIC_COLLECTION, $sym133$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym116$BASIC_COLLECTION, $sym134$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_INSTANCE );
    subloop_reserved_initialize_basic_collection_class( $sym116$BASIC_COLLECTION );
    methods.methods_incorporate_instance_method( $sym60$INITIALIZE, $sym116$BASIC_COLLECTION, $list61, NIL, $list135 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym60$INITIALIZE, $sym137$BASIC_COLLECTION_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym99$ELEMENT_EQUAL_P, $sym116$BASIC_COLLECTION, $list19, $list100, $list138 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym99$ELEMENT_EQUAL_P, $sym142$BASIC_COLLECTION_ELEMENT_EQUAL_P_METHOD );
    methods.methods_incorporate_instance_method( $sym143$GET_ELEMENT_EQUALITY_PREDICATE, $sym116$BASIC_COLLECTION, $list19, NIL, $list144 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym143$GET_ELEMENT_EQUALITY_PREDICATE, $sym146$BASIC_COLLECTION_GET_ELEMENT_EQUALITY_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym147$SET_ELEMENT_EQUALITY_PREDICATE, $sym116$BASIC_COLLECTION, $list19, $list148, $list149 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym147$SET_ELEMENT_EQUALITY_PREDICATE, $sym151$BASIC_COLLECTION_SET_ELEMENT_EQUALITY_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym152$GET_CONTENTS, $sym116$BASIC_COLLECTION, $list19, NIL, $list153 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym152$GET_CONTENTS, $sym155$BASIC_COLLECTION_GET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym156$SET_CONTENTS, $sym116$BASIC_COLLECTION, $list19, $list157, $list158 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym156$SET_CONTENTS, $sym161$BASIC_COLLECTION_SET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym162$ALLOCATE_ENUMERATOR, $sym116$BASIC_COLLECTION, $list19, NIL, $list163 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym162$ALLOCATE_ENUMERATOR, $sym165$BASIC_COLLECTION_ALLOCATE_ENUMERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym166$DEALLOCATE_ENUMERATOR, $sym116$BASIC_COLLECTION, $list19, $list167, $list168 );
    methods.subloop_register_instance_method( $sym116$BASIC_COLLECTION, $sym166$DEALLOCATE_ENUMERATOR, $sym169$BASIC_COLLECTION_DEALLOCATE_ENUMERATOR_METHOD );
    interfaces.new_interface( $sym170$LIST_TEMPLATE, $list117, $list171, $list172 );
    interfaces.interfaces_add_interface_instance_method( $sym96$PRINT, $sym170$LIST_TEMPLATE, $list19, $list97, $list173 );
    interfaces.interfaces_add_interface_instance_method( $sym174$PUSH, $sym170$LIST_TEMPLATE, $list19, $list107, $list175 );
    interfaces.interfaces_add_interface_instance_method( $sym176$POP, $sym170$LIST_TEMPLATE, $list19, NIL, $list177 );
    interfaces.interfaces_add_interface_instance_method( $sym178$BUT_LAST, $sym170$LIST_TEMPLATE, $list19, NIL, $list179 );
    interfaces.interfaces_add_interface_instance_method( $sym180$NTH, $sym170$LIST_TEMPLATE, $list19, $list181, $list182 );
    interfaces.interfaces_add_interface_instance_method( $sym183$SET_NTH, $sym170$LIST_TEMPLATE, $list19, $list184, $list185 );
    interfaces.interfaces_add_interface_instance_method( $sym186$POSITION, $sym170$LIST_TEMPLATE, $list19, $list113, $list187 );
    interfaces.interfaces_add_interface_instance_method( $sym188$APPEND, $sym170$LIST_TEMPLATE, $list19, $list189, $list190 );
    interfaces.interfaces_add_interface_instance_method( $sym191$REVERSE, $sym170$LIST_TEMPLATE, $list19, NIL, $list192 );
    classes.subloop_new_class( $sym193$BASIC_LIST, $sym116$BASIC_COLLECTION, $list194, NIL, $list195 );
    classes.class_set_implements_slot_listeners( $sym193$BASIC_LIST, NIL );
    methods.methods_incorporate_instance_method( $sym18$EMPTY_P, $sym193$BASIC_LIST, $list19, NIL, $list115 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym18$EMPTY_P, $sym196$BASIC_LIST_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym191$REVERSE, $sym193$BASIC_LIST, $list19, NIL, $list192 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym191$REVERSE, $sym197$BASIC_LIST_REVERSE_METHOD );
    methods.methods_incorporate_instance_method( $sym188$APPEND, $sym193$BASIC_LIST, $list19, $list189, $list190 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym188$APPEND, $sym199$BASIC_LIST_APPEND_METHOD );
    methods.methods_incorporate_instance_method( $sym186$POSITION, $sym193$BASIC_LIST, $list19, $list113, $list187 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym186$POSITION, $sym200$BASIC_LIST_POSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym183$SET_NTH, $sym193$BASIC_LIST, $list19, $list184, $list185 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym183$SET_NTH, $sym201$BASIC_LIST_SET_NTH_METHOD );
    methods.methods_incorporate_instance_method( $sym180$NTH, $sym193$BASIC_LIST, $list19, $list181, $list182 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym180$NTH, $sym202$BASIC_LIST_NTH_METHOD );
    methods.methods_incorporate_instance_method( $sym178$BUT_LAST, $sym193$BASIC_LIST, $list19, NIL, $list179 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym178$BUT_LAST, $sym203$BASIC_LIST_BUT_LAST_METHOD );
    methods.methods_incorporate_instance_method( $sym176$POP, $sym193$BASIC_LIST, $list19, NIL, $list177 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym176$POP, $sym204$BASIC_LIST_POP_METHOD );
    methods.methods_incorporate_instance_method( $sym174$PUSH, $sym193$BASIC_LIST, $list19, $list107, $list175 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym174$PUSH, $sym205$BASIC_LIST_PUSH_METHOD );
    methods.methods_incorporate_instance_method( $sym96$PRINT, $sym193$BASIC_LIST, $list19, $list97, $list173 );
    methods.subloop_register_instance_method( $sym193$BASIC_LIST, $sym96$PRINT, $sym208$BASIC_LIST_PRINT_METHOD );
    classes.subloop_note_class_initialization_function( $sym193$BASIC_LIST, $sym209$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_CLASS );
    classes.subloop_note_instance_initialization_function( $sym193$BASIC_LIST, $sym210$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_INSTANCE );
    subloop_reserved_initialize_basic_list_class( $sym193$BASIC_LIST );
    interfaces.new_interface( $sym211$END_POINTER_LIST_TEMPLATE, $list194, $list212, $list213 );
    interfaces.interfaces_add_interface_instance_method( $sym104$CLEAR, $sym211$END_POINTER_LIST_TEMPLATE, $list19, NIL, $list214 );
    interfaces.interfaces_add_interface_instance_method( $sym106$ADD, $sym211$END_POINTER_LIST_TEMPLATE, $list19, $list107, $list215 );
    interfaces.interfaces_add_interface_instance_method( $sym109$REMOVE, $sym211$END_POINTER_LIST_TEMPLATE, $list19, $list110, $list216 );
    interfaces.interfaces_add_interface_instance_method( $sym174$PUSH, $sym211$END_POINTER_LIST_TEMPLATE, $list19, $list107, $list217 );
    interfaces.interfaces_add_interface_instance_method( $sym176$POP, $sym211$END_POINTER_LIST_TEMPLATE, $list19, NIL, $list218 );
    interfaces.interfaces_add_interface_instance_method( $sym178$BUT_LAST, $sym211$END_POINTER_LIST_TEMPLATE, $list19, NIL, $list219 );
    interfaces.interfaces_add_interface_instance_method( $sym188$APPEND, $sym211$END_POINTER_LIST_TEMPLATE, $list19, $list189, $list220 );
    interfaces.interfaces_add_interface_instance_method( $sym191$REVERSE, $sym211$END_POINTER_LIST_TEMPLATE, $list19, NIL, $list221 );
    classes.subloop_new_class( $sym222$BASIC_END_POINTER_LIST, $sym193$BASIC_LIST, $list223, NIL, $list224 );
    classes.class_set_implements_slot_listeners( $sym222$BASIC_END_POINTER_LIST, NIL );
    methods.methods_incorporate_instance_method( $sym18$EMPTY_P, $sym222$BASIC_END_POINTER_LIST, $list19, NIL, $list115 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym18$EMPTY_P, $sym226$BASIC_END_POINTER_LIST_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym191$REVERSE, $sym222$BASIC_END_POINTER_LIST, $list19, NIL, $list221 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym191$REVERSE, $sym227$BASIC_END_POINTER_LIST_REVERSE_METHOD );
    methods.methods_incorporate_instance_method( $sym188$APPEND, $sym222$BASIC_END_POINTER_LIST, $list19, $list189, $list220 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym188$APPEND, $sym228$BASIC_END_POINTER_LIST_APPEND_METHOD );
    methods.methods_incorporate_instance_method( $sym186$POSITION, $sym222$BASIC_END_POINTER_LIST, $list19, $list113, $list187 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym186$POSITION, $sym229$BASIC_END_POINTER_LIST_POSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym180$NTH, $sym222$BASIC_END_POINTER_LIST, $list19, $list181, $list182 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym180$NTH, $sym230$BASIC_END_POINTER_LIST_NTH_METHOD );
    methods.methods_incorporate_instance_method( $sym178$BUT_LAST, $sym222$BASIC_END_POINTER_LIST, $list19, NIL, $list219 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym178$BUT_LAST, $sym231$BASIC_END_POINTER_LIST_BUT_LAST_METHOD );
    methods.methods_incorporate_instance_method( $sym176$POP, $sym222$BASIC_END_POINTER_LIST, $list19, NIL, $list218 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym176$POP, $sym232$BASIC_END_POINTER_LIST_POP_METHOD );
    methods.methods_incorporate_instance_method( $sym174$PUSH, $sym222$BASIC_END_POINTER_LIST, $list19, $list107, $list217 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym174$PUSH, $sym233$BASIC_END_POINTER_LIST_PUSH_METHOD );
    methods.methods_incorporate_instance_method( $sym109$REMOVE, $sym222$BASIC_END_POINTER_LIST, $list19, $list110, $list216 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym109$REMOVE, $sym234$BASIC_END_POINTER_LIST_REMOVE_METHOD );
    methods.methods_incorporate_instance_method( $sym106$ADD, $sym222$BASIC_END_POINTER_LIST, $list19, $list107, $list215 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym106$ADD, $sym235$BASIC_END_POINTER_LIST_ADD_METHOD );
    methods.methods_incorporate_instance_method( $sym104$CLEAR, $sym222$BASIC_END_POINTER_LIST, $list19, NIL, $list214 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym104$CLEAR, $sym236$BASIC_END_POINTER_LIST_CLEAR_METHOD );
    methods.methods_incorporate_instance_method( $sym96$PRINT, $sym222$BASIC_END_POINTER_LIST, $list19, $list97, $list173 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym96$PRINT, $sym237$BASIC_END_POINTER_LIST_PRINT_METHOD );
    classes.subloop_note_class_initialization_function( $sym222$BASIC_END_POINTER_LIST, $sym238$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_CLASS );
    classes.subloop_note_instance_initialization_function( $sym222$BASIC_END_POINTER_LIST, $sym239$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_INSTANCE );
    subloop_reserved_initialize_basic_end_pointer_list_class( $sym222$BASIC_END_POINTER_LIST );
    methods.methods_incorporate_instance_method( $sym240$GET_END_POINTER, $sym222$BASIC_END_POINTER_LIST, $list19, NIL, $list241 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym240$GET_END_POINTER, $sym243$BASIC_END_POINTER_LIST_GET_END_POINTER_METHOD );
    methods.methods_incorporate_instance_method( $sym244$SET_END_POINTER, $sym222$BASIC_END_POINTER_LIST, $list19, $list245, $list246 );
    methods.subloop_register_instance_method( $sym222$BASIC_END_POINTER_LIST, $sym244$SET_END_POINTER, $sym248$BASIC_END_POINTER_LIST_SET_END_POINTER_METHOD );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_double_link_cell$.getGlobalValue(), Symbols.symbol_function( $sym256$DOUBLE_LINK_CELL_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list257 );
    Structures.def_csetf( $sym258$DLC_OWNER, $sym259$_CSETF_DLC_OWNER );
    Structures.def_csetf( $sym260$DLC_CONTENTS, $sym261$_CSETF_DLC_CONTENTS );
    Structures.def_csetf( $sym262$DLC_PREVIOUS, $sym263$_CSETF_DLC_PREVIOUS );
    Structures.def_csetf( $sym264$DLC_NEXT, $sym265$_CSETF_DLC_NEXT );
    Equality.identity( $sym249$DOUBLE_LINK_CELL );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_double_link_cell$.getGlobalValue(), Symbols.symbol_function(
        $sym275$VISIT_DEFSTRUCT_OBJECT_DOUBLE_LINK_CELL_METHOD ) );
    interfaces.new_interface( $sym279$LIST_ELEMENT_TEMPLATE, NIL, NIL, $list280 );
    interfaces.interfaces_add_interface_instance_method( $sym281$ADD_PARENT_LINK, $sym279$LIST_ELEMENT_TEMPLATE, $list19, $list282, $list283 );
    interfaces.interfaces_add_interface_instance_method( $sym284$DELETE_PARENT_LINK, $sym279$LIST_ELEMENT_TEMPLATE, $list19, $list285, $list286 );
    interfaces.interfaces_add_interface_instance_method( $sym287$DELETE_SELF_FROM_COLLECTION, $sym279$LIST_ELEMENT_TEMPLATE, $list19, $list288, $list289 );
    interfaces.interfaces_add_interface_instance_method( $sym290$TRANSFER_SELF, $sym279$LIST_ELEMENT_TEMPLATE, $list19, $list291, $list292 );
    interfaces.interfaces_add_interface_instance_method( $sym293$DELETE_SELF_FROM_ALL_COLLECTIONS, $sym279$LIST_ELEMENT_TEMPLATE, $list19, NIL, $list294 );
    interfaces.interfaces_add_interface_instance_method( $sym112$MEMBER_P, $sym279$LIST_ELEMENT_TEMPLATE, $list19, $list288, $list295 );
    interfaces.interfaces_add_interface_instance_method( $sym296$GET_COLLECTIONS, $sym279$LIST_ELEMENT_TEMPLATE, $list19, NIL, $list297 );
    interfaces.interfaces_add_interface_instance_method( $sym298$ON_ADD, $sym279$LIST_ELEMENT_TEMPLATE, $list19, $list299, $list300 );
    interfaces.interfaces_add_interface_instance_method( $sym301$ON_DELETE, $sym279$LIST_ELEMENT_TEMPLATE, $list19, $list299, $list300 );
    interfaces.interfaces_add_interface_instance_method( $sym302$PERFORM_ACTION, $sym279$LIST_ELEMENT_TEMPLATE, $list19, $list303, $list304 );
    classes.subloop_new_class( $sym305$BASIC_LIST_ELEMENT, $sym38$OBJECT, $list306, NIL, $list307 );
    classes.class_set_implements_slot_listeners( $sym305$BASIC_LIST_ELEMENT, NIL );
    methods.methods_incorporate_instance_method( $sym302$PERFORM_ACTION, $sym305$BASIC_LIST_ELEMENT, $list19, $list303, $list304 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym302$PERFORM_ACTION, $sym311$BASIC_LIST_ELEMENT_PERFORM_ACTION_METHOD );
    methods.methods_incorporate_instance_method( $sym301$ON_DELETE, $sym305$BASIC_LIST_ELEMENT, $list19, $list299, $list300 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym301$ON_DELETE, $sym312$BASIC_LIST_ELEMENT_ON_DELETE_METHOD );
    methods.methods_incorporate_instance_method( $sym298$ON_ADD, $sym305$BASIC_LIST_ELEMENT, $list19, $list299, $list300 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym298$ON_ADD, $sym313$BASIC_LIST_ELEMENT_ON_ADD_METHOD );
    methods.methods_incorporate_instance_method( $sym296$GET_COLLECTIONS, $sym305$BASIC_LIST_ELEMENT, $list19, NIL, $list297 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym296$GET_COLLECTIONS, $sym314$BASIC_LIST_ELEMENT_GET_COLLECTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym112$MEMBER_P, $sym305$BASIC_LIST_ELEMENT, $list19, $list288, $list295 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym112$MEMBER_P, $sym315$BASIC_LIST_ELEMENT_MEMBER_P_METHOD );
    methods.methods_incorporate_instance_method( $sym293$DELETE_SELF_FROM_ALL_COLLECTIONS, $sym305$BASIC_LIST_ELEMENT, $list19, NIL, $list294 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym293$DELETE_SELF_FROM_ALL_COLLECTIONS, $sym316$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym290$TRANSFER_SELF, $sym305$BASIC_LIST_ELEMENT, $list19, $list291, $list292 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym290$TRANSFER_SELF, $sym318$BASIC_LIST_ELEMENT_TRANSFER_SELF_METHOD );
    methods.methods_incorporate_instance_method( $sym287$DELETE_SELF_FROM_COLLECTION, $sym305$BASIC_LIST_ELEMENT, $list19, $list288, $list289 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym287$DELETE_SELF_FROM_COLLECTION, $sym319$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_COLLECTION_METHOD );
    methods.methods_incorporate_instance_method( $sym284$DELETE_PARENT_LINK, $sym305$BASIC_LIST_ELEMENT, $list19, $list285, $list286 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym284$DELETE_PARENT_LINK, $sym320$BASIC_LIST_ELEMENT_DELETE_PARENT_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym281$ADD_PARENT_LINK, $sym305$BASIC_LIST_ELEMENT, $list19, $list282, $list283 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym281$ADD_PARENT_LINK, $sym321$BASIC_LIST_ELEMENT_ADD_PARENT_LINK_METHOD );
    classes.subloop_note_class_initialization_function( $sym305$BASIC_LIST_ELEMENT, $sym322$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym305$BASIC_LIST_ELEMENT, $sym323$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_INSTANCE );
    subloop_reserved_initialize_basic_list_element_class( $sym305$BASIC_LIST_ELEMENT );
    methods.methods_incorporate_instance_method( $sym60$INITIALIZE, $sym305$BASIC_LIST_ELEMENT, $list61, NIL, $list324 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym60$INITIALIZE, $sym326$BASIC_LIST_ELEMENT_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym327$GET_PARENT_LINKS, $sym305$BASIC_LIST_ELEMENT, $list61, NIL, $list328 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym327$GET_PARENT_LINKS, $sym330$BASIC_LIST_ELEMENT_GET_PARENT_LINKS_METHOD );
    methods.methods_incorporate_instance_method( $sym331$SET_PARENT_LINKS, $sym305$BASIC_LIST_ELEMENT, $list61, $list332, $list333 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym331$SET_PARENT_LINKS, $sym335$BASIC_LIST_ELEMENT_SET_PARENT_LINKS_METHOD );
    methods.methods_incorporate_instance_method( $sym336$GET_SELF_DELETION_MODE, $sym305$BASIC_LIST_ELEMENT, $list61, NIL, $list337 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym336$GET_SELF_DELETION_MODE, $sym339$BASIC_LIST_ELEMENT_GET_SELF_DELETION_MODE_METHOD );
    methods.methods_incorporate_instance_method( $sym340$SET_SELF_DELETION_MODE, $sym305$BASIC_LIST_ELEMENT, $list61, $list341, $list342 );
    methods.subloop_register_instance_method( $sym305$BASIC_LIST_ELEMENT, $sym340$SET_SELF_DELETION_MODE, $sym344$BASIC_LIST_ELEMENT_SET_SELF_DELETION_MODE_METHOD );
    interfaces.new_interface( $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list194, $list212, $list346 );
    interfaces.interfaces_add_interface_instance_method( $sym347$DELETE_LINK, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list348, $list349 );
    interfaces.interfaces_add_interface_instance_method( $sym350$REVERSE_LINK, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list61, $list348, $list351 );
    interfaces.interfaces_add_interface_instance_method( $sym352$FIND_LINK, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list61, $list113, $list353 );
    interfaces.interfaces_add_interface_instance_method( $sym354$FIND_NTH_LINK, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list61, $list181, $list355 );
    interfaces.interfaces_add_interface_instance_method( $sym152$GET_CONTENTS, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list356 );
    interfaces.interfaces_add_interface_instance_method( $sym156$SET_CONTENTS, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list157, $list357 );
    interfaces.interfaces_add_interface_instance_method( $sym96$PRINT, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list97, $list358 );
    interfaces.interfaces_add_interface_instance_method( $sym104$CLEAR, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list359 );
    interfaces.interfaces_add_interface_instance_method( $sym106$ADD, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list107, $list360 );
    interfaces.interfaces_add_interface_instance_method( $sym109$REMOVE, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list110, $list361 );
    interfaces.interfaces_add_interface_instance_method( $sym112$MEMBER_P, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list113, $list362 );
    interfaces.interfaces_add_interface_instance_method( $sym174$PUSH, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list107, $list363 );
    interfaces.interfaces_add_interface_instance_method( $sym176$POP, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list364 );
    interfaces.interfaces_add_interface_instance_method( $sym178$BUT_LAST, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list365 );
    interfaces.interfaces_add_interface_instance_method( $sym180$NTH, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list181, $list366 );
    interfaces.interfaces_add_interface_instance_method( $sym183$SET_NTH, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list184, $list367 );
    interfaces.interfaces_add_interface_instance_method( $sym186$POSITION, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list113, $list368 );
    interfaces.interfaces_add_interface_instance_method( $sym188$APPEND, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list189, $list369 );
    interfaces.interfaces_add_interface_instance_method( $sym191$REVERSE, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list370 );
    interfaces.interfaces_add_interface_instance_method( $sym18$EMPTY_P, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, NIL, $list371 );
    interfaces.interfaces_add_interface_instance_method( $sym372$SWAP, $sym345$DOUBLY_LINKED_LIST_TEMPLATE, $list19, $list100, $list373 );
    classes.subloop_new_class( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym38$OBJECT, $list375, NIL, $list376 );
    classes.class_set_implements_slot_listeners( $sym374$BASIC_DOUBLY_LINKED_LIST, NIL );
    methods.methods_incorporate_instance_method( $sym372$SWAP, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list100, $list373 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym372$SWAP, $sym382$BASIC_DOUBLY_LINKED_LIST_SWAP_METHOD );
    methods.methods_incorporate_instance_method( $sym18$EMPTY_P, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list371 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym18$EMPTY_P, $sym383$BASIC_DOUBLY_LINKED_LIST_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym191$REVERSE, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list370 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym191$REVERSE, $sym384$BASIC_DOUBLY_LINKED_LIST_REVERSE_METHOD );
    methods.methods_incorporate_instance_method( $sym188$APPEND, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list189, $list369 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym188$APPEND, $sym386$BASIC_DOUBLY_LINKED_LIST_APPEND_METHOD );
    methods.methods_incorporate_instance_method( $sym186$POSITION, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list113, $list368 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym186$POSITION, $sym387$BASIC_DOUBLY_LINKED_LIST_POSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym183$SET_NTH, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list184, $list367 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym183$SET_NTH, $sym388$BASIC_DOUBLY_LINKED_LIST_SET_NTH_METHOD );
    methods.methods_incorporate_instance_method( $sym180$NTH, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list181, $list366 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym180$NTH, $sym389$BASIC_DOUBLY_LINKED_LIST_NTH_METHOD );
    methods.methods_incorporate_instance_method( $sym178$BUT_LAST, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list365 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym178$BUT_LAST, $sym390$BASIC_DOUBLY_LINKED_LIST_BUT_LAST_METHOD );
    methods.methods_incorporate_instance_method( $sym176$POP, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list364 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym176$POP, $sym391$BASIC_DOUBLY_LINKED_LIST_POP_METHOD );
    methods.methods_incorporate_instance_method( $sym174$PUSH, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list107, $list363 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym174$PUSH, $sym392$BASIC_DOUBLY_LINKED_LIST_PUSH_METHOD );
    methods.methods_incorporate_instance_method( $sym112$MEMBER_P, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list113, $list362 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym112$MEMBER_P, $sym393$BASIC_DOUBLY_LINKED_LIST_MEMBER_P_METHOD );
    methods.methods_incorporate_instance_method( $sym109$REMOVE, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list110, $list361 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym109$REMOVE, $sym394$BASIC_DOUBLY_LINKED_LIST_REMOVE_METHOD );
    methods.methods_incorporate_instance_method( $sym106$ADD, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list107, $list360 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym106$ADD, $sym395$BASIC_DOUBLY_LINKED_LIST_ADD_METHOD );
    methods.methods_incorporate_instance_method( $sym104$CLEAR, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list359 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym104$CLEAR, $sym396$BASIC_DOUBLY_LINKED_LIST_CLEAR_METHOD );
    methods.methods_incorporate_instance_method( $sym96$PRINT, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list97, $list358 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym96$PRINT, $sym399$BASIC_DOUBLY_LINKED_LIST_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym354$FIND_NTH_LINK, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, $list181, $list355 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym354$FIND_NTH_LINK, $sym400$BASIC_DOUBLY_LINKED_LIST_FIND_NTH_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym352$FIND_LINK, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, $list113, $list353 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym352$FIND_LINK, $sym401$BASIC_DOUBLY_LINKED_LIST_FIND_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym350$REVERSE_LINK, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, $list348, $list351 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym350$REVERSE_LINK, $sym402$BASIC_DOUBLY_LINKED_LIST_REVERSE_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym347$DELETE_LINK, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list348, $list349 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym347$DELETE_LINK, $sym406$BASIC_DOUBLY_LINKED_LIST_DELETE_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym156$SET_CONTENTS, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list157, $list357 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym156$SET_CONTENTS, $sym408$BASIC_DOUBLY_LINKED_LIST_SET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym152$GET_CONTENTS, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list356 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym152$GET_CONTENTS, $sym409$BASIC_DOUBLY_LINKED_LIST_GET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym99$ELEMENT_EQUAL_P, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list100, $list101 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym99$ELEMENT_EQUAL_P, $sym410$BASIC_DOUBLY_LINKED_LIST_ELEMENT_EQUAL_P_METHOD );
    classes.subloop_note_class_initialization_function( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym411$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_CLASS );
    classes.subloop_note_instance_initialization_function( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym412$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_INSTANCE );
    subloop_reserved_initialize_basic_doubly_linked_list_class( $sym374$BASIC_DOUBLY_LINKED_LIST );
    methods.methods_incorporate_instance_method( $sym143$GET_ELEMENT_EQUALITY_PREDICATE, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list144 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym143$GET_ELEMENT_EQUALITY_PREDICATE, $sym414$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_EQUALITY_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym147$SET_ELEMENT_EQUALITY_PREDICATE, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list148, $list149 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym147$SET_ELEMENT_EQUALITY_PREDICATE, $sym416$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_EQUALITY_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym417$SET_ELEMENT_COUNT, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, $list418, $list419 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym417$SET_ELEMENT_COUNT, $sym422$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym423$INC_ELEMENT_COUNT, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, NIL, $list424 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym423$INC_ELEMENT_COUNT, $sym426$BASIC_DOUBLY_LINKED_LIST_INC_ELEMENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym427$DEC_ELEMENT_COUNT, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, NIL, $list428 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym427$DEC_ELEMENT_COUNT, $sym430$BASIC_DOUBLY_LINKED_LIST_DEC_ELEMENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym431$GET_FIRST_LINK, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, NIL, $list432 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym431$GET_FIRST_LINK, $sym434$BASIC_DOUBLY_LINKED_LIST_GET_FIRST_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym435$SET_FIRST_LINK, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, $list436, $list437 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym435$SET_FIRST_LINK, $sym440$BASIC_DOUBLY_LINKED_LIST_SET_FIRST_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym441$GET_LAST_LINK, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, NIL, $list442 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym441$GET_LAST_LINK, $sym444$BASIC_DOUBLY_LINKED_LIST_GET_LAST_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym445$SET_LAST_LINK, $sym374$BASIC_DOUBLY_LINKED_LIST, $list61, $list446, $list447 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym445$SET_LAST_LINK, $sym450$BASIC_DOUBLY_LINKED_LIST_SET_LAST_LINK_METHOD );
    methods.methods_incorporate_instance_method( $sym102$GET_ELEMENT_COUNT, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list451 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym102$GET_ELEMENT_COUNT, $sym453$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_COUNT_METHOD );
    classes.subloop_new_class( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym38$OBJECT, $list39, NIL, $list455 );
    classes.class_set_implements_slot_listeners( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, NIL );
    classes.subloop_note_class_initialization_function( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym457$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_C );
    classes.subloop_note_instance_initialization_function( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym458$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_I );
    subloop_reserved_initialize_basic_doubly_linked_list_enumerator_class( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR );
    methods.methods_incorporate_instance_method( $sym60$INITIALIZE, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list61, NIL, $list459 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym60$INITIALIZE, $sym461$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym462$ISOLATE, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list463 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym462$ISOLATE, $sym465$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_ISOLATE_METHOD );
    methods.methods_incorporate_instance_method( $sym466$SET_INITIAL_STATE, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, $list467, $list468 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym466$SET_INITIAL_STATE, $sym470$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_SET_INITIAL_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym18$EMPTY_P, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list471 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym18$EMPTY_P, $sym473$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym21$FIRST_P, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list474 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym21$FIRST_P, $sym476$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym23$LAST_P, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list477 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym23$LAST_P, $sym479$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym25$CURRENT, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list19, NIL, $list480 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym25$CURRENT, $sym482$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_CURRENT_METHOD );
    methods.methods_incorporate_instance_method( $sym27$FIRST, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list483, NIL, $list484 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym27$FIRST, $sym485$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_METHOD );
    methods.methods_incorporate_instance_method( $sym29$LAST, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list483, NIL, $list486 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym29$LAST, $sym487$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_METHOD );
    methods.methods_incorporate_instance_method( $sym31$NEXT, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list483, NIL, $list488 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym31$NEXT, $sym489$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_NEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym33$PREVIOUS, $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $list483, NIL, $list490 );
    methods.subloop_register_instance_method( $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR, $sym33$PREVIOUS, $sym491$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_PREVIOUS_METHOD );
    methods.methods_incorporate_instance_method( $sym162$ALLOCATE_ENUMERATOR, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, NIL, $list492 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym162$ALLOCATE_ENUMERATOR, $sym494$BASIC_DOUBLY_LINKED_LIST_ALLOCATE_ENUMERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym166$DEALLOCATE_ENUMERATOR, $sym374$BASIC_DOUBLY_LINKED_LIST, $list19, $list167, $list495 );
    methods.subloop_register_instance_method( $sym374$BASIC_DOUBLY_LINKED_LIST, $sym166$DEALLOCATE_ENUMERATOR, $sym496$BASIC_DOUBLY_LINKED_LIST_DEALLOCATE_ENUMERATOR_METHOD );
    interfaces.new_interface( $sym497$PAIR_TEMPLATE, NIL, NIL, $list498 );
    interfaces.interfaces_add_interface_instance_method( $sym96$PRINT, $sym497$PAIR_TEMPLATE, $list19, $list97, $list499 );
    classes.subloop_new_class( $sym500$BASIC_PAIR, $sym38$OBJECT, $list501, NIL, $list502 );
    classes.class_set_implements_slot_listeners( $sym500$BASIC_PAIR, NIL );
    methods.methods_incorporate_instance_method( $sym96$PRINT, $sym500$BASIC_PAIR, $list19, $list97, $list499 );
    methods.subloop_register_instance_method( $sym500$BASIC_PAIR, $sym96$PRINT, $sym506$BASIC_PAIR_PRINT_METHOD );
    classes.subloop_note_class_initialization_function( $sym500$BASIC_PAIR, $sym507$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym500$BASIC_PAIR, $sym508$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_INSTANCE );
    subloop_reserved_initialize_basic_pair_class( $sym500$BASIC_PAIR );
    methods.methods_incorporate_instance_method( $sym60$INITIALIZE, $sym500$BASIC_PAIR, $list61, NIL, $list509 );
    methods.subloop_register_instance_method( $sym500$BASIC_PAIR, $sym60$INITIALIZE, $sym511$BASIC_PAIR_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym512$GET_FIRST, $sym500$BASIC_PAIR, $list19, NIL, $list513 );
    methods.subloop_register_instance_method( $sym500$BASIC_PAIR, $sym512$GET_FIRST, $sym515$BASIC_PAIR_GET_FIRST_METHOD );
    methods.methods_incorporate_instance_method( $sym516$SET_FIRST, $sym500$BASIC_PAIR, $list19, $list517, $list518 );
    methods.subloop_register_instance_method( $sym500$BASIC_PAIR, $sym516$SET_FIRST, $sym520$BASIC_PAIR_SET_FIRST_METHOD );
    methods.methods_incorporate_instance_method( $sym521$GET_SECOND, $sym500$BASIC_PAIR, $list19, NIL, $list522 );
    methods.subloop_register_instance_method( $sym500$BASIC_PAIR, $sym521$GET_SECOND, $sym524$BASIC_PAIR_GET_SECOND_METHOD );
    methods.methods_incorporate_instance_method( $sym525$SET_SECOND, $sym500$BASIC_PAIR, $list19, $list526, $list527 );
    methods.subloop_register_instance_method( $sym500$BASIC_PAIR, $sym525$SET_SECOND, $sym529$BASIC_PAIR_SET_SECOND_METHOD );
    interfaces.new_interface( $sym530$TRIPLET_TEMPLATE, $list501, $list531, $list532 );
    interfaces.interfaces_add_interface_instance_method( $sym96$PRINT, $sym530$TRIPLET_TEMPLATE, $list19, $list97, $list533 );
    classes.subloop_new_class( $sym534$BASIC_TRIPLET, $sym500$BASIC_PAIR, $list535, NIL, $list536 );
    classes.class_set_implements_slot_listeners( $sym534$BASIC_TRIPLET, NIL );
    methods.methods_incorporate_instance_method( $sym96$PRINT, $sym534$BASIC_TRIPLET, $list19, $list97, $list533 );
    methods.subloop_register_instance_method( $sym534$BASIC_TRIPLET, $sym96$PRINT, $sym539$BASIC_TRIPLET_PRINT_METHOD );
    classes.subloop_note_class_initialization_function( $sym534$BASIC_TRIPLET, $sym540$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_CLASS );
    classes.subloop_note_instance_initialization_function( $sym534$BASIC_TRIPLET, $sym541$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_INSTANCE );
    subloop_reserved_initialize_basic_triplet_class( $sym534$BASIC_TRIPLET );
    methods.methods_incorporate_instance_method( $sym60$INITIALIZE, $sym534$BASIC_TRIPLET, $list61, NIL, $list542 );
    methods.subloop_register_instance_method( $sym534$BASIC_TRIPLET, $sym60$INITIALIZE, $sym544$BASIC_TRIPLET_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym545$GET_THIRD, $sym534$BASIC_TRIPLET, $list19, NIL, $list546 );
    methods.subloop_register_instance_method( $sym534$BASIC_TRIPLET, $sym545$GET_THIRD, $sym548$BASIC_TRIPLET_GET_THIRD_METHOD );
    methods.methods_incorporate_instance_method( $sym549$SET_THIRD, $sym534$BASIC_TRIPLET, $list19, $list550, $list551 );
    methods.subloop_register_instance_method( $sym534$BASIC_TRIPLET, $sym549$SET_THIRD, $sym553$BASIC_TRIPLET_SET_THIRD_METHOD );
    classes.subloop_new_class( $sym554$SUBLOOP_PRIVATE_PAIR, $sym500$BASIC_PAIR, NIL, NIL, $list555 );
    classes.class_set_implements_slot_listeners( $sym554$SUBLOOP_PRIVATE_PAIR, NIL );
    classes.subloop_note_class_initialization_function( $sym554$SUBLOOP_PRIVATE_PAIR, $sym556$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym554$SUBLOOP_PRIVATE_PAIR, $sym557$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_INSTANCE );
    subloop_reserved_initialize_subloop_private_pair_class( $sym554$SUBLOOP_PRIVATE_PAIR );
    methods.methods_incorporate_instance_method( $sym96$PRINT, $sym554$SUBLOOP_PRIVATE_PAIR, $list19, $list97, $list558 );
    methods.subloop_register_instance_method( $sym554$SUBLOOP_PRIVATE_PAIR, $sym96$PRINT, $sym560$SUBLOOP_PRIVATE_PAIR_PRINT_METHOD );
    interfaces.new_interface( $sym561$BAG_ENUMERATOR_TEMPLATE, $list15, $list16, $list562 );
    interfaces.interfaces_add_interface_instance_method( $sym18$EMPTY_P, $sym561$BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list563 );
    interfaces.interfaces_add_interface_instance_method( $sym21$FIRST_P, $sym561$BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list564 );
    interfaces.interfaces_add_interface_instance_method( $sym23$LAST_P, $sym561$BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list565 );
    interfaces.interfaces_add_interface_instance_method( $sym25$CURRENT, $sym561$BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list566 );
    interfaces.interfaces_add_interface_instance_method( $sym27$FIRST, $sym561$BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list567 );
    interfaces.interfaces_add_interface_instance_method( $sym29$LAST, $sym561$BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list568 );
    interfaces.interfaces_add_interface_instance_method( $sym31$NEXT, $sym561$BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list569 );
    interfaces.interfaces_add_interface_instance_method( $sym33$PREVIOUS, $sym561$BAG_ENUMERATOR_TEMPLATE, $list19, NIL, $list570 );
    classes.subloop_new_class( $sym571$BASIC_BAG_ENUMERATOR, $sym38$OBJECT, $list572, NIL, $list573 );
    classes.class_set_implements_slot_listeners( $sym571$BASIC_BAG_ENUMERATOR, NIL );
    methods.methods_incorporate_instance_method( $sym33$PREVIOUS, $sym571$BASIC_BAG_ENUMERATOR, $list19, NIL, $list570 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym33$PREVIOUS, $sym574$BASIC_BAG_ENUMERATOR_PREVIOUS_METHOD );
    methods.methods_incorporate_instance_method( $sym31$NEXT, $sym571$BASIC_BAG_ENUMERATOR, $list19, NIL, $list569 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym31$NEXT, $sym575$BASIC_BAG_ENUMERATOR_NEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym29$LAST, $sym571$BASIC_BAG_ENUMERATOR, $list19, NIL, $list568 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym29$LAST, $sym576$BASIC_BAG_ENUMERATOR_LAST_METHOD );
    methods.methods_incorporate_instance_method( $sym27$FIRST, $sym571$BASIC_BAG_ENUMERATOR, $list19, NIL, $list567 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym27$FIRST, $sym577$BASIC_BAG_ENUMERATOR_FIRST_METHOD );
    methods.methods_incorporate_instance_method( $sym25$CURRENT, $sym571$BASIC_BAG_ENUMERATOR, $list19, NIL, $list566 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym25$CURRENT, $sym578$BASIC_BAG_ENUMERATOR_CURRENT_METHOD );
    methods.methods_incorporate_instance_method( $sym23$LAST_P, $sym571$BASIC_BAG_ENUMERATOR, $list19, NIL, $list565 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym23$LAST_P, $sym579$BASIC_BAG_ENUMERATOR_LAST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym21$FIRST_P, $sym571$BASIC_BAG_ENUMERATOR, $list19, NIL, $list564 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym21$FIRST_P, $sym580$BASIC_BAG_ENUMERATOR_FIRST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym18$EMPTY_P, $sym571$BASIC_BAG_ENUMERATOR, $list19, NIL, $list563 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym18$EMPTY_P, $sym581$BASIC_BAG_ENUMERATOR_EMPTY_P_METHOD );
    classes.subloop_note_class_initialization_function( $sym571$BASIC_BAG_ENUMERATOR, $sym582$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym571$BASIC_BAG_ENUMERATOR, $sym583$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_INSTANCE );
    subloop_reserved_initialize_basic_bag_enumerator_class( $sym571$BASIC_BAG_ENUMERATOR );
    methods.methods_incorporate_instance_method( $sym584$INSTANTIATE, $sym571$BASIC_BAG_ENUMERATOR, $list61, NIL, $list585 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym584$INSTANTIATE, $sym587$BASIC_BAG_ENUMERATOR_INSTANTIATE_METHOD );
    methods.methods_incorporate_instance_method( $sym80$GET_CONTENTS_POINTER, $sym571$BASIC_BAG_ENUMERATOR, $list61, NIL, $list81 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym80$GET_CONTENTS_POINTER, $sym589$BASIC_BAG_ENUMERATOR_GET_CONTENTS_POINTER_METHOD );
    methods.methods_incorporate_instance_method( $sym75$SET_CONTENTS_POINTER, $sym571$BASIC_BAG_ENUMERATOR, $list61, $list590, $list591 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym75$SET_CONTENTS_POINTER, $sym594$BASIC_BAG_ENUMERATOR_SET_CONTENTS_POINTER_METHOD );
    methods.methods_incorporate_instance_method( $sym152$GET_CONTENTS, $sym571$BASIC_BAG_ENUMERATOR, $list61, NIL, $list153 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym152$GET_CONTENTS, $sym596$BASIC_BAG_ENUMERATOR_GET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym156$SET_CONTENTS, $sym571$BASIC_BAG_ENUMERATOR, $list61, $list157, $list597 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym156$SET_CONTENTS, $sym600$BASIC_BAG_ENUMERATOR_SET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym84$GET_DIRECTION, $sym571$BASIC_BAG_ENUMERATOR, $list61, NIL, $list85 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym84$GET_DIRECTION, $sym602$BASIC_BAG_ENUMERATOR_GET_DIRECTION_METHOD );
    methods.methods_incorporate_instance_method( $sym88$SET_DIRECTION, $sym571$BASIC_BAG_ENUMERATOR, $list61, $list89, $list603 );
    methods.subloop_register_instance_method( $sym571$BASIC_BAG_ENUMERATOR, $sym88$SET_DIRECTION, $sym606$BASIC_BAG_ENUMERATOR_SET_DIRECTION_METHOD );
    interfaces.new_interface( $sym607$BAG_TEMPLATE, $list117, $list171, $list608 );
    interfaces.interfaces_add_interface_instance_method( $sym96$PRINT, $sym607$BAG_TEMPLATE, $list19, $list97, $list609 );
    interfaces.interfaces_add_interface_instance_method( $sym102$GET_ELEMENT_COUNT, $sym607$BAG_TEMPLATE, $list19, NIL, $list610 );
    interfaces.interfaces_add_interface_instance_method( $sym152$GET_CONTENTS, $sym607$BAG_TEMPLATE, $list19, NIL, $list611 );
    interfaces.interfaces_add_interface_instance_method( $sym156$SET_CONTENTS, $sym607$BAG_TEMPLATE, $list19, $list157, $list612 );
    interfaces.interfaces_add_interface_instance_method( $sym106$ADD, $sym607$BAG_TEMPLATE, $list19, $list107, $list613 );
    interfaces.interfaces_add_interface_instance_method( $sym109$REMOVE, $sym607$BAG_TEMPLATE, $list19, $list110, $list614 );
    interfaces.interfaces_add_interface_instance_method( $sym112$MEMBER_P, $sym607$BAG_TEMPLATE, $list19, $list113, $list615 );
    interfaces.interfaces_add_interface_instance_method( $sym616$OCCURENCES, $sym607$BAG_TEMPLATE, $list19, $list113, $list617 );
    interfaces.interfaces_add_interface_instance_method( $sym618$GET_UNIQUE_ELEMENTS, $sym607$BAG_TEMPLATE, $list19, NIL, $list619 );
    interfaces.interfaces_add_interface_instance_method( $sym620$GET_UNIQUE_ELEMENT_COUNT, $sym607$BAG_TEMPLATE, $list19, NIL, $list621 );
    interfaces.interfaces_add_interface_instance_method( $sym18$EMPTY_P, $sym607$BAG_TEMPLATE, $list19, NIL, $list622 );
    classes.subloop_new_class( $sym623$BASIC_BAG, $sym116$BASIC_COLLECTION, $list624, NIL, $list625 );
    classes.class_set_implements_slot_listeners( $sym623$BASIC_BAG, NIL );
    methods.methods_incorporate_instance_method( $sym18$EMPTY_P, $sym623$BASIC_BAG, $list19, NIL, $list622 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym18$EMPTY_P, $sym627$BASIC_BAG_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym620$GET_UNIQUE_ELEMENT_COUNT, $sym623$BASIC_BAG, $list19, NIL, $list621 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym620$GET_UNIQUE_ELEMENT_COUNT, $sym628$BASIC_BAG_GET_UNIQUE_ELEMENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym618$GET_UNIQUE_ELEMENTS, $sym623$BASIC_BAG, $list19, NIL, $list619 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym618$GET_UNIQUE_ELEMENTS, $sym629$BASIC_BAG_GET_UNIQUE_ELEMENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym616$OCCURENCES, $sym623$BASIC_BAG, $list19, $list113, $list617 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym616$OCCURENCES, $sym630$BASIC_BAG_OCCURENCES_METHOD );
    methods.methods_incorporate_instance_method( $sym112$MEMBER_P, $sym623$BASIC_BAG, $list19, $list113, $list615 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym112$MEMBER_P, $sym631$BASIC_BAG_MEMBER_P_METHOD );
    methods.methods_incorporate_instance_method( $sym109$REMOVE, $sym623$BASIC_BAG, $list19, $list110, $list614 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym109$REMOVE, $sym632$BASIC_BAG_REMOVE_METHOD );
    methods.methods_incorporate_instance_method( $sym106$ADD, $sym623$BASIC_BAG, $list19, $list107, $list613 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym106$ADD, $sym633$BASIC_BAG_ADD_METHOD );
    methods.methods_incorporate_instance_method( $sym156$SET_CONTENTS, $sym623$BASIC_BAG, $list19, $list157, $list612 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym156$SET_CONTENTS, $sym634$BASIC_BAG_SET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym152$GET_CONTENTS, $sym623$BASIC_BAG, $list19, NIL, $list611 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym152$GET_CONTENTS, $sym635$BASIC_BAG_GET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym102$GET_ELEMENT_COUNT, $sym623$BASIC_BAG, $list19, NIL, $list610 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym102$GET_ELEMENT_COUNT, $sym636$BASIC_BAG_GET_ELEMENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym96$PRINT, $sym623$BASIC_BAG, $list19, $list97, $list609 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym96$PRINT, $sym639$BASIC_BAG_PRINT_METHOD );
    classes.subloop_note_class_initialization_function( $sym623$BASIC_BAG, $sym640$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_CLASS );
    classes.subloop_note_instance_initialization_function( $sym623$BASIC_BAG, $sym641$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_INSTANCE );
    subloop_reserved_initialize_basic_bag_class( $sym623$BASIC_BAG );
    methods.methods_incorporate_instance_method( $sym60$INITIALIZE, $sym623$BASIC_BAG, $list61, NIL, $list642 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym60$INITIALIZE, $sym644$BASIC_BAG_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym645$GET_INTERNAL_REPRESENTATION, $sym623$BASIC_BAG, $list61, NIL, $list646 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym645$GET_INTERNAL_REPRESENTATION, $sym648$BASIC_BAG_GET_INTERNAL_REPRESENTATION_METHOD );
    methods.methods_incorporate_instance_method( $sym649$SET_INTERNAL_REPRESENTATION, $sym623$BASIC_BAG, $list61, $list650, $list651 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym649$SET_INTERNAL_REPRESENTATION, $sym654$BASIC_BAG_SET_INTERNAL_REPRESENTATION_METHOD );
    methods.methods_incorporate_instance_method( $sym162$ALLOCATE_ENUMERATOR, $sym623$BASIC_BAG, $list19, NIL, $list655 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym162$ALLOCATE_ENUMERATOR, $sym657$BASIC_BAG_ALLOCATE_ENUMERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym166$DEALLOCATE_ENUMERATOR, $sym623$BASIC_BAG, $list19, $list167, $list658 );
    methods.subloop_register_instance_method( $sym623$BASIC_BAG, $sym166$DEALLOCATE_ENUMERATOR, $sym660$BASIC_BAG_DEALLOCATE_ENUMERATOR_METHOD );
    classes.subloop_new_class( $sym661$TEST_LIST_ELEMENT, $sym305$BASIC_LIST_ELEMENT, NIL, NIL, $list662 );
    classes.class_set_implements_slot_listeners( $sym661$TEST_LIST_ELEMENT, NIL );
    classes.subloop_note_class_initialization_function( $sym661$TEST_LIST_ELEMENT, $sym664$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym661$TEST_LIST_ELEMENT, $sym665$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_INSTANCE );
    subloop_reserved_initialize_test_list_element_class( $sym661$TEST_LIST_ELEMENT );
    methods.methods_incorporate_instance_method( $sym60$INITIALIZE, $sym661$TEST_LIST_ELEMENT, $list61, NIL, $list666 );
    methods.subloop_register_instance_method( $sym661$TEST_LIST_ELEMENT, $sym60$INITIALIZE, $sym668$TEST_LIST_ELEMENT_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym669$GET_SYMBOLIC_NAME, $sym661$TEST_LIST_ELEMENT, $list19, NIL, $list670 );
    methods.subloop_register_instance_method( $sym661$TEST_LIST_ELEMENT, $sym669$GET_SYMBOLIC_NAME, $sym672$TEST_LIST_ELEMENT_GET_SYMBOLIC_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym673$SET_SYMBOLIC_NAME, $sym661$TEST_LIST_ELEMENT, $list19, $list674, $list675 );
    methods.subloop_register_instance_method( $sym661$TEST_LIST_ELEMENT, $sym673$SET_SYMBOLIC_NAME, $sym677$TEST_LIST_ELEMENT_SET_SYMBOLIC_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym96$PRINT, $sym661$TEST_LIST_ELEMENT, $list19, $list97, $list678 );
    methods.subloop_register_instance_method( $sym661$TEST_LIST_ELEMENT, $sym96$PRINT, $sym681$TEST_LIST_ELEMENT_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym298$ON_ADD, $sym661$TEST_LIST_ELEMENT, $list19, $list299, $list300 );
    methods.subloop_register_instance_method( $sym661$TEST_LIST_ELEMENT, $sym298$ON_ADD, $sym682$TEST_LIST_ELEMENT_ON_ADD_METHOD );
    methods.methods_incorporate_instance_method( $sym301$ON_DELETE, $sym661$TEST_LIST_ELEMENT, $list19, $list299, $list300 );
    methods.subloop_register_instance_method( $sym661$TEST_LIST_ELEMENT, $sym301$ON_DELETE, $sym683$TEST_LIST_ELEMENT_ON_DELETE_METHOD );
    subl_macro_promotions.declare_defglobal( $sym684$_TEST_LIST_ELEMENTS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subloop_collections_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subloop_collections_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subloop_collections_file();
  }
  static
  {
    me = new subloop_collections();
    $valid_sequential_directions$ = null;
    $dtp_double_link_cell$ = null;
    $test_list_elements$ = null;
    $list0 = ConsesLow.list( makeKeyword( "BACKWARDS" ), makeKeyword( "NONE" ), makeKeyword( "FORWARDS" ) );
    $sym1$SEQUENTIAL_DIRECTION = makeSymbol( "SEQUENTIAL-DIRECTION" );
    $str2$_S___S_is_not_a_member_of_the__S_ = makeString( "~S: ~S is not a member of the ~S enumeration." );
    $sym3$ENCODE_SEQUENTIAL_DIRECTION = makeSymbol( "ENCODE-SEQUENTIAL-DIRECTION" );
    $str4$_S___S_is_not_a_valid_encoding_of = makeString( "~S: ~S is not a valid encoding of the ~S enumeration." );
    $sym5$DECODE_SEQUENTIAL_DIRECTION = makeSymbol( "DECODE-SEQUENTIAL-DIRECTION" );
    $str6$_S___S_was_expected_to_be_a_membe = makeString( "~S: ~S was expected to be a member of the enumeration ~S." );
    $sym7$SEQUENTIAL_DIRECTION_P = makeSymbol( "SEQUENTIAL-DIRECTION-P" );
    $sym8$ITERATOR_TEMPLATE = makeSymbol( "ITERATOR-TEMPLATE" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym10$ENUMERATOR_TEMPLATE = makeSymbol( "ENUMERATOR-TEMPLATE" );
    $list11 = ConsesLow.list( makeSymbol( "ITERATOR-TEMPLATE" ) );
    $list12 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "ITERATOR-TEMPLATE" ) ) );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST-P" ),
        NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "CURRENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                makeSymbol( "LAST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PREVIOUS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym14$COLLECTION_ENUMERATOR_TEMPLATE = makeSymbol( "COLLECTION-ENUMERATOR-TEMPLATE" );
    $list15 = ConsesLow.list( makeSymbol( "ENUMERATOR-TEMPLATE" ) );
    $list16 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "ENUMERATOR-TEMPLATE" ) ) );
    $list17 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "STORE-COLLECTION-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-COLLECTION-CONTENTS" ) ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RETRIEVE-COLLECTION-CONTENTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "SET-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "SUBCONTENTS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS-POINTER" ),
                NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECTION" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DIRECTION" ), ConsesLow.list( makeSymbol( "NEW-DIRECTION" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                        "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CURRENT" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PREVIOUS" ), NIL, makeKeyword(
          "PUBLIC" ) )
    } );
    $sym18$EMPTY_P = makeSymbol( "EMPTY-P" );
    $list19 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "RETRIEVE-COLLECTION-CONTENTS" ), makeSymbol( "SELF" ) ) ) ) );
    $sym21$FIRST_P = makeSymbol( "FIRST-P" );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol(
        "RETRIEVE-COLLECTION-CONTENTS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol( "SELF" ) ) ) ) ) );
    $sym23$LAST_P = makeSymbol( "LAST-P" );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
            "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), T ) ) ) ) );
    $sym25$CURRENT = makeSymbol( "CURRENT" );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
            "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAR" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), NIL ) ) ) ) );
    $sym27$FIRST = makeSymbol( "FIRST" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "RETRIEVE-COLLECTION-CONTENTS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list(
        makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "FORWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) );
    $sym29$LAST = makeSymbol( "LAST" );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "PROGN" ),
        ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "LAST" ), ConsesLow.list( makeSymbol( "RETRIEVE-COLLECTION-CONTENTS" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "BACKWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ) ) );
    $sym31$NEXT = makeSymbol( "NEXT" );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol(
            "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "PCASE" ), ConsesLow.list( makeSymbol( "GET-DIRECTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeKeyword( "BACKWARDS" ), ConsesLow.list(
                makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "RETRIEVE-COLLECTION-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeKeyword( "NONE" ), ConsesLow
                    .list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "RETRIEVE-COLLECTION-CONTENTS" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol(
                        "SET-CONTENTS-POINTER" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ), ConsesLow.list( makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "FORWARDS" ) ),
            ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
                "TEMPLATE-CONTENTS-POINTER" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ), makeSymbol( "SELF" ), ConsesLow
                    .list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ) ), ConsesLow.list( makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "FORWARDS" ) ), ConsesLow.list( makeSymbol(
                        "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ) ) ) ) );
    $sym33$PREVIOUS = makeSymbol( "PREVIOUS" );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-COLLECTION-CONTENTS" ), ConsesLow.list( makeSymbol( "RETRIEVE-COLLECTION-CONTENTS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
            "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow
                .list( makeSymbol( "PCASE" ), ConsesLow.list( makeSymbol( "GET-DIRECTION" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeKeyword( "FORWARDS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                    "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "LAST" ), makeSymbol( "TEMPLATE-COLLECTION-CONTENTS" ) ) ) ), ConsesLow.list( makeKeyword( "NONE" ), ConsesLow.list( makeSymbol( "CSETQ" ),
                        makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "LAST" ), makeSymbol( "TEMPLATE-COLLECTION-CONTENTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ),
                            makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ), ConsesLow.list( makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "BACKWARDS" ) ), ConsesLow.list(
                                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol(
                                    "TEMPLATE-COLLECTION-CONTENTS" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ), makeSymbol(
                                        "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "BACKWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list(
                                            makeSymbol( "CDOSUBLISTS" ), ConsesLow.list( makeSymbol( "SUBLIST" ), makeSymbol( "TEMPLATE-COLLECTION-CONTENTS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ,
                                                ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "SUBLIST" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ),
                                                    makeSymbol( "SELF" ), makeSymbol( "SUBLIST" ) ), ConsesLow.list( makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "BACKWARDS" ) ), ConsesLow.list(
                                                        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym35$PROTECTED_MEMBERSHIP_TEMPLATE = makeSymbol( "PROTECTED-MEMBERSHIP-TEMPLATE" );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ACCEPTABLE-P" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym37$BASIC_COLLECTION_ENUMERATOR = makeSymbol( "BASIC-COLLECTION-ENUMERATOR" );
    $sym38$OBJECT = makeSymbol( "OBJECT" );
    $list39 = ConsesLow.list( makeSymbol( "COLLECTION-ENUMERATOR-TEMPLATE" ) );
    $list40 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "COLLECTION-CONTENTS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONTENTS-POINTER" ),
        makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DIRECTION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "STORE-COLLECTION-CONTENTS" ), ConsesLow.list( makeSymbol(
                "NEW-COLLECTION-CONTENTS" ) ), makeKeyword( "FILE-SCOPE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RETRIEVE-COLLECTION-CONTENTS" ), NIL,
                    makeKeyword( "FILE-SCOPE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "SUBCONTENTS" ) ),
                        makeKeyword( "FILE-SCOPE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS-POINTER" ), NIL, makeKeyword( "FILE-SCOPE" ), makeKeyword(
                            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECTION" ), NIL, makeKeyword( "FILE-SCOPE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DIRECTION" ), ConsesLow.list( makeSymbol( "NEW-DIRECTION" ) ), makeKeyword( "FILE-SCOPE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                            makeSymbol( "LAST-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CURRENT" ),
                                                NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST" ), NIL, makeKeyword(
                                                    "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST" ), NIL, makeKeyword(
                                                        "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL, makeKeyword(
                                                            "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PREVIOUS" ), NIL, makeKeyword(
                                                                "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym41$DIRECTION = makeSymbol( "DIRECTION" );
    $sym42$CONTENTS_POINTER = makeSymbol( "CONTENTS-POINTER" );
    $sym43$COLLECTION_CONTENTS = makeSymbol( "COLLECTION-CONTENTS" );
    $kw44$FORWARDS = makeKeyword( "FORWARDS" );
    $kw45$NONE = makeKeyword( "NONE" );
    $kw46$BACKWARDS = makeKeyword( "BACKWARDS" );
    $sym47$BASIC_COLLECTION_ENUMERATOR_PREVIOUS_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-PREVIOUS-METHOD" );
    $sym48$BASIC_COLLECTION_ENUMERATOR_NEXT_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-NEXT-METHOD" );
    $sym49$BASIC_COLLECTION_ENUMERATOR_LAST_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-LAST-METHOD" );
    $sym50$BASIC_COLLECTION_ENUMERATOR_FIRST_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-FIRST-METHOD" );
    $sym51$BASIC_COLLECTION_ENUMERATOR_CURRENT_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-CURRENT-METHOD" );
    $sym52$BASIC_COLLECTION_ENUMERATOR_LAST_P_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-LAST-P-METHOD" );
    $sym53$BASIC_COLLECTION_ENUMERATOR_FIRST_P_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-FIRST-P-METHOD" );
    $sym54$BASIC_COLLECTION_ENUMERATOR_EMPTY_P_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-EMPTY-P-METHOD" );
    $sym55$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym56$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-CLASS" );
    $sym57$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym58$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym59$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_ENUMERATOR_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-ENUMERATOR-INSTANCE" );
    $sym60$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list61 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COLLECTION-CONTENTS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "CONTENTS-POINTER" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword( "NONE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym63$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD" );
    $sym64$BASIC_COLLECTION_ENUMERATOR_INITIALIZE_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-INITIALIZE-METHOD" );
    $sym65$STORE_COLLECTION_CONTENTS = makeSymbol( "STORE-COLLECTION-CONTENTS" );
    $list66 = ConsesLow.list( makeKeyword( "FILE-SCOPE" ), makeKeyword( "PROTECTED" ) );
    $list67 = ConsesLow.list( makeSymbol( "NEW-COLLECTION-CONTENTS" ) );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COLLECTION-CONTENTS" ), makeSymbol( "NEW-COLLECTION-CONTENTS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
        "NEW-COLLECTION-CONTENTS" ) ) );
    $sym69$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD" );
    $sym70$BASIC_COLLECTION_ENUMERATOR_STORE_COLLECTION_CONTENTS_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-STORE-COLLECTION-CONTENTS-METHOD" );
    $sym71$RETRIEVE_COLLECTION_CONTENTS = makeSymbol( "RETRIEVE-COLLECTION-CONTENTS" );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "COLLECTION-CONTENTS" ) ) );
    $sym73$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD" );
    $sym74$BASIC_COLLECTION_ENUMERATOR_RETRIEVE_COLLECTION_CONTENTS_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-RETRIEVE-COLLECTION-CONTENTS-METHOD" );
    $sym75$SET_CONTENTS_POINTER = makeSymbol( "SET-CONTENTS-POINTER" );
    $list76 = ConsesLow.list( makeSymbol( "SUBCONTENTS" ) );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONTENTS-POINTER" ), makeSymbol( "SUBCONTENTS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SUBCONTENTS" ) ) );
    $sym78$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD" );
    $sym79$BASIC_COLLECTION_ENUMERATOR_SET_CONTENTS_POINTER_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-SET-CONTENTS-POINTER-METHOD" );
    $sym80$GET_CONTENTS_POINTER = makeSymbol( "GET-CONTENTS-POINTER" );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONTENTS-POINTER" ) ) );
    $sym82$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD" );
    $sym83$BASIC_COLLECTION_ENUMERATOR_GET_CONTENTS_POINTER_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-GET-CONTENTS-POINTER-METHOD" );
    $sym84$GET_DIRECTION = makeSymbol( "GET-DIRECTION" );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DIRECTION" ) ) );
    $sym86$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD" );
    $sym87$BASIC_COLLECTION_ENUMERATOR_GET_DIRECTION_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-GET-DIRECTION-METHOD" );
    $sym88$SET_DIRECTION = makeSymbol( "SET-DIRECTION" );
    $list89 = ConsesLow.list( makeSymbol( "NEW-DIRECTION" ) );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SEQUENTIAL-DIRECTION-P" ), makeSymbol( "NEW-DIRECTION" ) ), makeString(
        "(SET-DIRECTION ~S): ~S is not a valid direction.  A direction must be one of: ~S." ), makeSymbol( "SELF" ), makeSymbol( "NEW-DIRECTION" ), ConsesLow.list( makeSymbol( "ENUMERATE-VALUES" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "SEQUENTIAL-DIRECTION" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeSymbol( "NEW-DIRECTION" ) ), ConsesLow.list( makeSymbol( "RET" ),
                makeSymbol( "NEW-DIRECTION" ) ) );
    $sym91$OUTER_CATCH_FOR_BASIC_COLLECTION_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-ENUMERATOR-METHOD" );
    $str92$_SET_DIRECTION__S____S_is_not_a_v = makeString( "(SET-DIRECTION ~S): ~S is not a valid direction.  A direction must be one of: ~S." );
    $sym93$BASIC_COLLECTION_ENUMERATOR_SET_DIRECTION_METHOD = makeSymbol( "BASIC-COLLECTION-ENUMERATOR-SET-DIRECTION-METHOD" );
    $sym94$COLLECTION_TEMPLATE = makeSymbol( "COLLECTION-TEMPLATE" );
    $list95 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-EQUALITY-PREDICATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "SET-ELEMENT-EQUALITY-PREDICATE" ), ConsesLow.list( makeSymbol( "NEW-PREDICATE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ELEMENT-EQUAL-P" ), ConsesLow
              .list( makeSymbol( "ELEMENT1" ), makeSymbol( "ELEMENT2" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword(
                  "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                      "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword(
                          "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                              "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                  "MEMBER-P" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword(
                                      "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ALLOCATE-ENUMERATOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                          "DEF-INSTANCE-METHOD" ), makeSymbol( "DEALLOCATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "ENUMERATOR" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym96$PRINT = makeSymbol( "PRINT" );
    $list97 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list(
        makeSymbol( "ALLOCATE-ENUMERATOR" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ), ConsesLow.list(
            makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>" ), ConsesLow.list( makeSymbol( "CLASS-OF" ), makeSymbol( "SELF" ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "[]" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol(
                    "STREAM" ), makeString( "[~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIRST" ) ) ) ),
                    ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "LAST-P" ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( ", ~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                            "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "]" ) ) ) ), ConsesLow
                                .list( makeSymbol( "DEALLOCATE-ENUMERATOR" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym99$ELEMENT_EQUAL_P = makeSymbol( "ELEMENT-EQUAL-P" );
    $list100 = ConsesLow.list( makeSymbol( "ELEMENT1" ), makeSymbol( "ELEMENT2" ) );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( EQUAL, makeSymbol( "ELEMENT1" ), makeSymbol( "ELEMENT2" ) ) ) );
    $sym102$GET_ELEMENT_COUNT = makeSymbol( "GET-ELEMENT-COUNT" );
    $list103 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ) );
    $sym104$CLEAR = makeSymbol( "CLEAR" );
    $list105 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym106$ADD = makeSymbol( "ADD" );
    $list107 = ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) );
    $list108 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "NCONC" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ), ConsesLow
        .list( makeSymbol( "LIST" ), makeSymbol( "NEW-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) );
    $sym109$REMOVE = makeSymbol( "REMOVE" );
    $list110 = ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) );
    $list111 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "DELETE" ), makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ),
        makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "GET-ELEMENT-EQUALITY-PREDICATE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) );
    $sym112$MEMBER_P = makeSymbol( "MEMBER-P" );
    $list113 = ConsesLow.list( makeSymbol( "ELEMENT" ) );
    $list114 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ),
        makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "GET-ELEMENT-EQUALITY-PREDICATE" ), makeSymbol( "SELF" ) ) ), T, NIL ) ) );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ) );
    $sym116$BASIC_COLLECTION = makeSymbol( "BASIC-COLLECTION" );
    $list117 = ConsesLow.list( makeSymbol( "COLLECTION-TEMPLATE" ) );
    $list118 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "CONTENTS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ELEMENT-EQUALITY-PREDICATE" ),
        makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "ELEMENT-EQUAL-P" ), ConsesLow.list( makeSymbol( "ELEMENT1" ), makeSymbol( "ELEMENT2" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-EQUALITY-PREDICATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                        "SET-ELEMENT-EQUALITY-PREDICATE" ), ConsesLow.list( makeSymbol( "NEW-PREDICATE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "GET-ELEMENT-COUNT" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL,
                                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow
              .list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MEMBER-P" ), ConsesLow.list(
                  makeSymbol( "ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword(
                      "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ALLOCATE-ENUMERATOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                          makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEALLOCATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "ENUMERATOR" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym119$ELEMENT_EQUALITY_PREDICATE = makeSymbol( "ELEMENT-EQUALITY-PREDICATE" );
    $sym120$CONTENTS = makeSymbol( "CONTENTS" );
    $sym121$BASIC_COLLECTION_EMPTY_P_METHOD = makeSymbol( "BASIC-COLLECTION-EMPTY-P-METHOD" );
    $sym122$BASIC_COLLECTION_MEMBER_P_METHOD = makeSymbol( "BASIC-COLLECTION-MEMBER-P-METHOD" );
    $sym123$BASIC_COLLECTION_REMOVE_METHOD = makeSymbol( "BASIC-COLLECTION-REMOVE-METHOD" );
    $sym124$BASIC_COLLECTION_ADD_METHOD = makeSymbol( "BASIC-COLLECTION-ADD-METHOD" );
    $sym125$BASIC_COLLECTION_CLEAR_METHOD = makeSymbol( "BASIC-COLLECTION-CLEAR-METHOD" );
    $sym126$BASIC_COLLECTION_GET_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-COLLECTION-GET-ELEMENT-COUNT-METHOD" );
    $str127$___S_Class_is_not_correctly_imple = makeString( "#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>" );
    $str128$__ = makeString( "[]" );
    $str129$__S = makeString( "[~S" );
    $str130$___S = makeString( ", ~S" );
    $str131$_ = makeString( "]" );
    $sym132$BASIC_COLLECTION_PRINT_METHOD = makeSymbol( "BASIC-COLLECTION-PRINT-METHOD" );
    $sym133$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-CLASS" );
    $sym134$SUBLOOP_RESERVED_INITIALIZE_BASIC_COLLECTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-COLLECTION-INSTANCE" );
    $list135 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONTENTS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "ELEMENT-EQUALITY-PREDICATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym136$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD" );
    $sym137$BASIC_COLLECTION_INITIALIZE_METHOD = makeSymbol( "BASIC-COLLECTION-INITIALIZE-METHOD" );
    $list138 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ) ), ConsesLow.list( makeSymbol( "FAST-FUNCALL-SETQ" ), makeSymbol( "RESULT" ), makeSymbol(
        "ELEMENT-EQUALITY-PREDICATE" ), ConsesLow.list( EQUAL, EQ, EQL, EQUALP, makeSymbol( "STRING-EQUAL" ), makeSymbol( "CHAR=" ) ), makeSymbol( "ELEMENT1" ), makeSymbol( "ELEMENT2" ) ), ConsesLow.list( makeSymbol(
            "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym139$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD" );
    $sym140$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $sym141$CHAR_ = makeSymbol( "CHAR=" );
    $sym142$BASIC_COLLECTION_ELEMENT_EQUAL_P_METHOD = makeSymbol( "BASIC-COLLECTION-ELEMENT-EQUAL-P-METHOD" );
    $sym143$GET_ELEMENT_EQUALITY_PREDICATE = makeSymbol( "GET-ELEMENT-EQUALITY-PREDICATE" );
    $list144 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ELEMENT-EQUALITY-PREDICATE" ) ) );
    $sym145$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD" );
    $sym146$BASIC_COLLECTION_GET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol( "BASIC-COLLECTION-GET-ELEMENT-EQUALITY-PREDICATE-METHOD" );
    $sym147$SET_ELEMENT_EQUALITY_PREDICATE = makeSymbol( "SET-ELEMENT-EQUALITY-PREDICATE" );
    $list148 = ConsesLow.list( makeSymbol( "NEW-PREDICATE" ) );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ELEMENT-EQUALITY-PREDICATE" ), makeSymbol( "NEW-PREDICATE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-PREDICATE" ) ) );
    $sym150$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD" );
    $sym151$BASIC_COLLECTION_SET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol( "BASIC-COLLECTION-SET-ELEMENT-EQUALITY-PREDICATE-METHOD" );
    $sym152$GET_CONTENTS = makeSymbol( "GET-CONTENTS" );
    $list153 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONTENTS" ) ) );
    $sym154$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD" );
    $sym155$BASIC_COLLECTION_GET_CONTENTS_METHOD = makeSymbol( "BASIC-COLLECTION-GET-CONTENTS-METHOD" );
    $sym156$SET_CONTENTS = makeSymbol( "SET-CONTENTS" );
    $list157 = ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) );
    $list158 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "NEW-CONTENTS" ) ), makeString( "(SET-CONTENTS ~S): ~S is not a valid list." ), makeSymbol(
        "SELF" ), makeSymbol( "NEW-CONTENTS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONTENTS" ), makeSymbol( "NEW-CONTENTS" ) ) );
    $sym159$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD" );
    $str160$_SET_CONTENTS__S____S_is_not_a_va = makeString( "(SET-CONTENTS ~S): ~S is not a valid list." );
    $sym161$BASIC_COLLECTION_SET_CONTENTS_METHOD = makeSymbol( "BASIC-COLLECTION-SET-CONTENTS-METHOD" );
    $sym162$ALLOCATE_ENUMERATOR = makeSymbol( "ALLOCATE-ENUMERATOR" );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ENUMERATOR" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
        makeSymbol( "BASIC-COLLECTION-ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-COLLECTION-ENUMERATOR" ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
            makeSymbol( "STORE-COLLECTION-CONTENTS" ), makeSymbol( "BASIC-COLLECTION-ENUMERATOR" ) ), makeSymbol( "ENUMERATOR" ), makeSymbol( "CONTENTS" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                makeSymbol( "SET-CONTENTS-POINTER" ), makeSymbol( "BASIC-COLLECTION-ENUMERATOR" ) ), makeSymbol( "ENUMERATOR" ), makeSymbol( "CONTENTS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                    "ENUMERATOR" ) ) ) );
    $sym164$OUTER_CATCH_FOR_BASIC_COLLECTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-COLLECTION-METHOD" );
    $sym165$BASIC_COLLECTION_ALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-COLLECTION-ALLOCATE-ENUMERATOR-METHOD" );
    $sym166$DEALLOCATE_ENUMERATOR = makeSymbol( "DEALLOCATE-ENUMERATOR" );
    $list167 = ConsesLow.list( makeSymbol( "ENUMERATOR" ) );
    $list168 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ENUMERATOR" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "STORE-COLLECTION-CONTENTS" ), makeSymbol(
        "BASIC-COLLECTION-ENUMERATOR" ) ), makeSymbol( "ENUMERATOR" ), NIL ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ), makeSymbol(
            "BASIC-COLLECTION-ENUMERATOR" ) ), makeSymbol( "ENUMERATOR" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym169$BASIC_COLLECTION_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-COLLECTION-DEALLOCATE-ENUMERATOR-METHOD" );
    $sym170$LIST_TEMPLATE = makeSymbol( "LIST-TEMPLATE" );
    $list171 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "COLLECTION-TEMPLATE" ) ) );
    $list172 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PUSH" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "POP" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "BUT-LAST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
              makeSymbol( "NTH" ), ConsesLow.list( makeSymbol( "INDEX" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-NTH" ), ConsesLow.list( makeSymbol( "INDEX" ),
                  makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POSITION" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword(
                      "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "OTHER-LIST" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                          "DEF-INSTANCE-METHOD" ), makeSymbol( "REVERSE" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $list173 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list(
        makeSymbol( "ALLOCATE-ENUMERATOR" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ), ConsesLow.list(
            makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>" ), ConsesLow.list( makeSymbol( "CLASS-OF" ), makeSymbol( "SELF" ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "LIST:[]" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol(
                    "STREAM" ), makeString( "LIST:[~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIRST" ) ) ) ),
                    ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "LAST-P" ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( ", ~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                            "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "]" ) ) ) ), ConsesLow
                                .list( makeSymbol( "DEALLOCATE-ENUMERATOR" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym174$PUSH = makeSymbol( "PUSH" );
    $list175 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-ELEMENT" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ),
        makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) );
    $sym176$POP = makeSymbol( "POP" );
    $list177 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "CDR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ) );
    $sym178$BUT_LAST = makeSymbol( "BUT-LAST" );
    $list179 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list(
            makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAR" ),
                makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOSUBLISTS" ), ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-SUBLIST" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list(
                    makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "CDDR" ), makeSymbol( "TEMPLATE-CONTENTS-SUBLIST" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                        ConsesLow.list( makeSymbol( "TEMPLATE-RESULT" ), ConsesLow.list( makeSymbol( "CADR" ), makeSymbol( "TEMPLATE-CONTENTS-SUBLIST" ) ) ) ), ConsesLow.list( makeSymbol( "RPLACD" ), makeSymbol(
                            "TEMPLATE-CONTENTS-SUBLIST" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-RESULT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym180$NTH = makeSymbol( "NTH" );
    $list181 = ConsesLow.list( makeSymbol( "INDEX" ) );
    $list182 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NTH" ), makeSymbol( "INDEX" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ) );
    $sym183$SET_NTH = makeSymbol( "SET-NTH" );
    $list184 = ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "NEW-ELEMENT" ) );
    $list185 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-NTH" ), makeSymbol( "INDEX" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) );
    $sym186$POSITION = makeSymbol( "POSITION" );
    $list187 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "POSITION" ), makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "GET-ELEMENT-EQUALITY-PREDICATE" ), makeSymbol( "SELF" ) ) ) ) );
    $sym188$APPEND = makeSymbol( "APPEND" );
    $list189 = ConsesLow.list( makeSymbol( "OTHER-LIST" ) );
    $list190 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "OTHER-LIST" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list(
        makeSymbol( "LIST-TEMPLATE-P" ), makeSymbol( "OTHER-LIST" ) ), makeString( "(APPEND ~S): ~S is not an instance of LIST-TEMPLATE." ), makeSymbol( "SELF" ), makeSymbol( "OTHER-LIST" ) ), ConsesLow.list( makeSymbol(
            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-OTHER-LIST-CONTENTS" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                "OTHER-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENTS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "NCONC" ),
                    ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ), makeSymbol( "TEMPLATE-OTHER-LIST-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym191$REVERSE = makeSymbol( "REVERSE" );
    $list192 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "REVERSE" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym193$BASIC_LIST = makeSymbol( "BASIC-LIST" );
    $list194 = ConsesLow.list( makeSymbol( "LIST-TEMPLATE" ) );
    $list195 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword(
        "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PUSH" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword(
            "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POP" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow
                .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "BUT-LAST" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                    makeSymbol( "NTH" ), ConsesLow.list( makeSymbol( "INDEX" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                        "SET-NTH" ), ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "POSITION" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "OTHER-LIST" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "REVERSE" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                        makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym196$BASIC_LIST_EMPTY_P_METHOD = makeSymbol( "BASIC-LIST-EMPTY-P-METHOD" );
    $sym197$BASIC_LIST_REVERSE_METHOD = makeSymbol( "BASIC-LIST-REVERSE-METHOD" );
    $str198$_APPEND__S____S_is_not_an_instanc = makeString( "(APPEND ~S): ~S is not an instance of LIST-TEMPLATE." );
    $sym199$BASIC_LIST_APPEND_METHOD = makeSymbol( "BASIC-LIST-APPEND-METHOD" );
    $sym200$BASIC_LIST_POSITION_METHOD = makeSymbol( "BASIC-LIST-POSITION-METHOD" );
    $sym201$BASIC_LIST_SET_NTH_METHOD = makeSymbol( "BASIC-LIST-SET-NTH-METHOD" );
    $sym202$BASIC_LIST_NTH_METHOD = makeSymbol( "BASIC-LIST-NTH-METHOD" );
    $sym203$BASIC_LIST_BUT_LAST_METHOD = makeSymbol( "BASIC-LIST-BUT-LAST-METHOD" );
    $sym204$BASIC_LIST_POP_METHOD = makeSymbol( "BASIC-LIST-POP-METHOD" );
    $sym205$BASIC_LIST_PUSH_METHOD = makeSymbol( "BASIC-LIST-PUSH-METHOD" );
    $str206$LIST___ = makeString( "LIST:[]" );
    $str207$LIST___S = makeString( "LIST:[~S" );
    $sym208$BASIC_LIST_PRINT_METHOD = makeSymbol( "BASIC-LIST-PRINT-METHOD" );
    $sym209$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-CLASS" );
    $sym210$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-INSTANCE" );
    $sym211$END_POINTER_LIST_TEMPLATE = makeSymbol( "END-POINTER-LIST-TEMPLATE" );
    $list212 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "LIST-TEMPLATE" ) ) );
    $list213 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-END-POINTER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "SET-END-POINTER" ), ConsesLow.list( makeSymbol( "NEW-END-POINTER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PUSH" ),
                    ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POP" ), NIL,
                        makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "BUT-LAST" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ),
                            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "OTHER-LIST" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REVERSE" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                    makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $list214 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "RET" ),
        NIL ) );
    $list215 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-END-POINTER" ), ConsesLow.list( makeSymbol( "GET-END-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
            "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-ELEMENT" ) ) ),
                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-END-POINTER" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "RPLACD" ),
                    makeSymbol( "TEMPLATE-END-POINTER" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-END-POINTER" ), ConsesLow
                        .list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-END-POINTER" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list(
                            makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-END-POINTER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ) );
    $list216 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-END-POINTER" ), ConsesLow.list( makeSymbol( "GET-END-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
            "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "OLD-ELEMENT" ),
                ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol( "TEMPLATE-CONTENTS" ), makeSymbol(
                    "TEMPLATE-END-POINTER" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ),
                        makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol(
                            "SELF" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol(
                                "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-CONS" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol(
                                    "CNOT" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ), makeSymbol( "TEMPLATE-END-POINTER" ) ) ), ConsesLow.list( makeSymbol(
                                        "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "CADR" ), makeSymbol(
                                            "TEMPLATE-CURRENT-CONS" ) ) ), ConsesLow.list( makeSymbol( "RPLACD" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ), ConsesLow.list( makeSymbol( "CDDR" ), makeSymbol(
                                                "TEMPLATE-CURRENT-CONS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                    "TEMPLATE-CURRENT-CONS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list(
                                                        makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "CADR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ),
                                                        ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "RPLACD" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ), NIL ), ConsesLow.list( makeSymbol(
                                                            "SET-END-POINTER" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ),
                                                        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ) ) ) ) ) );
    $list217 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow
                .list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol(
                    "PROGN" ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-ELEMENT" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list(
                        makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ) ) ) );
    $list218 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
            "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol(
                "RET" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                    "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ) );
    $list219 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-END-POINTER" ), ConsesLow.list( makeSymbol( "GET-END-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow
            .list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ),
                makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol(
                    "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOSUBLISTS" ), ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-SUBLIST" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol(
                        "PWHEN" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS-SUBLIST" ) ), makeSymbol( "TEMPLATE-END-POINTER" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                            ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-RESULT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-END-POINTER" ) ) ) ), ConsesLow.list( makeSymbol( "RPLACD" ),
                                makeSymbol( "TEMPLATE-CONTENTS-SUBLIST" ), NIL ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CONTENTS-SUBLIST" ) ), ConsesLow.list(
                                    makeSymbol( "RET" ), makeSymbol( "TEMPLATE-RESULT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $list220 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "OTHER-LIST" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list(
        makeSymbol( "LIST-TEMPLATE-P" ), makeSymbol( "OTHER-LIST" ) ), makeString( "(APPEND ~S): ~S is not an instance of LIST-TEMPLATE." ), makeSymbol( "SELF" ), makeSymbol( "OTHER-LIST" ) ), ConsesLow.list( makeSymbol(
            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-OTHER-LIST-CONTENTS" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                "OTHER-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENTS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "NCONC" ),
                    ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ), makeSymbol( "TEMPLATE-OTHER-LIST-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), ConsesLow
                        .list( makeSymbol( "LAST" ), makeSymbol( "TEMPLATE-OTHER-LIST-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $list221 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-REVERSED" ), ConsesLow.list( makeSymbol( "REVERSE" ), ConsesLow.list( makeSymbol(
        "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CONTENTS-REVERSED" ) ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ),
            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "LAST" ), makeSymbol( "TEMPLATE-CONTENTS-REVERSED" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym222$BASIC_END_POINTER_LIST = makeSymbol( "BASIC-END-POINTER-LIST" );
    $list223 = ConsesLow.list( makeSymbol( "END-POINTER-LIST-TEMPLATE" ) );
    $list224 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "END-POINTER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-END-POINTER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-END-POINTER" ), ConsesLow.list( makeSymbol( "NEW-END-POINTER" ) ), makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "PUSH" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "POP" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                    "BUT-LAST" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NTH" ), ConsesLow.list(
                                        makeSymbol( "INDEX" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POSITION" ), ConsesLow
                                            .list( makeSymbol( "ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPEND" ),
                                                ConsesLow.list( makeSymbol( "OTHER-LIST" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                    makeSymbol( "REVERSE" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                        "EMPTY-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym225$END_POINTER = makeSymbol( "END-POINTER" );
    $sym226$BASIC_END_POINTER_LIST_EMPTY_P_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-EMPTY-P-METHOD" );
    $sym227$BASIC_END_POINTER_LIST_REVERSE_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-REVERSE-METHOD" );
    $sym228$BASIC_END_POINTER_LIST_APPEND_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-APPEND-METHOD" );
    $sym229$BASIC_END_POINTER_LIST_POSITION_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-POSITION-METHOD" );
    $sym230$BASIC_END_POINTER_LIST_NTH_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-NTH-METHOD" );
    $sym231$BASIC_END_POINTER_LIST_BUT_LAST_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-BUT-LAST-METHOD" );
    $sym232$BASIC_END_POINTER_LIST_POP_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-POP-METHOD" );
    $sym233$BASIC_END_POINTER_LIST_PUSH_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-PUSH-METHOD" );
    $sym234$BASIC_END_POINTER_LIST_REMOVE_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-REMOVE-METHOD" );
    $sym235$BASIC_END_POINTER_LIST_ADD_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-ADD-METHOD" );
    $sym236$BASIC_END_POINTER_LIST_CLEAR_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-CLEAR-METHOD" );
    $sym237$BASIC_END_POINTER_LIST_PRINT_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-PRINT-METHOD" );
    $sym238$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-CLASS" );
    $sym239$SUBLOOP_RESERVED_INITIALIZE_BASIC_END_POINTER_LIST_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-END-POINTER-LIST-INSTANCE" );
    $sym240$GET_END_POINTER = makeSymbol( "GET-END-POINTER" );
    $list241 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "END-POINTER" ) ) );
    $sym242$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-END-POINTER-LIST-METHOD" );
    $sym243$BASIC_END_POINTER_LIST_GET_END_POINTER_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-GET-END-POINTER-METHOD" );
    $sym244$SET_END_POINTER = makeSymbol( "SET-END-POINTER" );
    $list245 = ConsesLow.list( makeSymbol( "NEW-END-POINTER" ) );
    $list246 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "END-POINTER" ), makeSymbol( "NEW-END-POINTER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-END-POINTER" ) ) );
    $sym247$OUTER_CATCH_FOR_BASIC_END_POINTER_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-END-POINTER-LIST-METHOD" );
    $sym248$BASIC_END_POINTER_LIST_SET_END_POINTER_METHOD = makeSymbol( "BASIC-END-POINTER-LIST-SET-END-POINTER-METHOD" );
    $sym249$DOUBLE_LINK_CELL = makeSymbol( "DOUBLE-LINK-CELL" );
    $sym250$DOUBLE_LINK_CELL_P = makeSymbol( "DOUBLE-LINK-CELL-P" );
    $list251 = ConsesLow.list( makeSymbol( "OWNER" ), makeSymbol( "CONTENTS" ), makeSymbol( "PREVIOUS" ), makeSymbol( "NEXT" ) );
    $list252 = ConsesLow.list( makeKeyword( "OWNER" ), makeKeyword( "CONTENTS" ), makeKeyword( "PREVIOUS" ), makeKeyword( "NEXT" ) );
    $list253 = ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "DLC-CONTENTS" ), makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "DLC-NEXT" ) );
    $list254 = ConsesLow.list( makeSymbol( "_CSETF-DLC-OWNER" ), makeSymbol( "_CSETF-DLC-CONTENTS" ), makeSymbol( "_CSETF-DLC-PREVIOUS" ), makeSymbol( "_CSETF-DLC-NEXT" ) );
    $sym255$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym256$DOUBLE_LINK_CELL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "DOUBLE-LINK-CELL-PRINT-FUNCTION-TRAMPOLINE" );
    $list257 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "DOUBLE-LINK-CELL-P" ) );
    $sym258$DLC_OWNER = makeSymbol( "DLC-OWNER" );
    $sym259$_CSETF_DLC_OWNER = makeSymbol( "_CSETF-DLC-OWNER" );
    $sym260$DLC_CONTENTS = makeSymbol( "DLC-CONTENTS" );
    $sym261$_CSETF_DLC_CONTENTS = makeSymbol( "_CSETF-DLC-CONTENTS" );
    $sym262$DLC_PREVIOUS = makeSymbol( "DLC-PREVIOUS" );
    $sym263$_CSETF_DLC_PREVIOUS = makeSymbol( "_CSETF-DLC-PREVIOUS" );
    $sym264$DLC_NEXT = makeSymbol( "DLC-NEXT" );
    $sym265$_CSETF_DLC_NEXT = makeSymbol( "_CSETF-DLC-NEXT" );
    $kw266$OWNER = makeKeyword( "OWNER" );
    $kw267$CONTENTS = makeKeyword( "CONTENTS" );
    $kw268$PREVIOUS = makeKeyword( "PREVIOUS" );
    $kw269$NEXT = makeKeyword( "NEXT" );
    $str270$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw271$BEGIN = makeKeyword( "BEGIN" );
    $sym272$MAKE_DOUBLE_LINK_CELL = makeSymbol( "MAKE-DOUBLE-LINK-CELL" );
    $kw273$SLOT = makeKeyword( "SLOT" );
    $kw274$END = makeKeyword( "END" );
    $sym275$VISIT_DEFSTRUCT_OBJECT_DOUBLE_LINK_CELL_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-DOUBLE-LINK-CELL-METHOD" );
    $list276 = ConsesLow.list( makeSymbol( "DLC" ), makeSymbol( "&BODY" ), makeSymbol( "FORMS" ) );
    $str277$dlc = makeString( "dlc" );
    $sym278$DLC_ = makeSymbol( "DLC-" );
    $sym279$LIST_ELEMENT_TEMPLATE = makeSymbol( "LIST-ELEMENT-TEMPLATE" );
    $list280 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PARENT-LINKS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PARENT-LINKS" ), ConsesLow.list( makeSymbol( "NEW-PARENT-LINKS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "ADD-PARENT-LINK" ), ConsesLow.list( makeSymbol( "NEW-PARENT-LINK" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-PARENT-LINK" ), ConsesLow.list(
                makeSymbol( "OLD-PARENT-LINK" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SELF-DELETION-MODE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow
                    .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-SELF-DELETION-MODE" ), ConsesLow.list( makeSymbol( "MODE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-SELF-FROM-COLLECTION" ), ConsesLow.list( makeSymbol( "COLLECTION" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                            makeSymbol( "TRANSFER-SELF" ), ConsesLow.list( makeSymbol( "CURRENT-COLLECTION" ), makeSymbol( "NEW-COLLECTION" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-SELF-FROM-ALL-COLLECTIONS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MEMBER-P" ),
                                    ConsesLow.list( makeSymbol( "COLLECTION" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COLLECTIONS" ), NIL, makeKeyword(
                                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-ADD" ), ConsesLow.list( makeSymbol( "PARENT-LIST" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-DELETE" ), ConsesLow.list( makeSymbol( "PARENT-LIST" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "PERFORM-ACTION" ), ConsesLow.list( makeSymbol( "ACTION" ), makeSymbol( "PARAMETERS" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym281$ADD_PARENT_LINK = makeSymbol( "ADD-PARENT-LINK" );
    $list282 = ConsesLow.list( makeSymbol( "NEW-PARENT-LINK" ) );
    $list283 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-PARENT-LINKS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-PARENT-LINK" ), ConsesLow.list( makeSymbol(
        "GET-PARENT-LINKS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ON-ADD" ) ), ConsesLow.list(
            makeSymbol( "DLC-OWNER" ), makeSymbol( "NEW-PARENT-LINK" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-PARENT-LINK" ) ) );
    $sym284$DELETE_PARENT_LINK = makeSymbol( "DELETE-PARENT-LINK" );
    $list285 = ConsesLow.list( makeSymbol( "OLD-PARENT-LINK" ) );
    $list286 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINKS" ), ConsesLow.list( makeSymbol( "GET-PARENT-LINKS" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol( "OLD-PARENT-LINK" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ),
            ConsesLow.list( makeSymbol( "SET-PARENT-LINKS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                ConsesLow.list( makeSymbol( "TEMPLATE-PREVIOUS-CONS" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ), ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-CONS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                    "TEMPLATE-PARENT-LINKS" ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol(
                        "OLD-PARENT-LINK" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ), ConsesLow.list( makeSymbol( "RPLACD" ), makeSymbol( "TEMPLATE-PREVIOUS-CONS" ), ConsesLow.list(
                            makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                makeSymbol( "ON-DELETE" ) ), ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "OLD-PARENT-LINK" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-PARENT-LINK" ) ) ),
                        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-PREVIOUS-CONS" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                            "TEMPLATE-CURRENT-CONS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym287$DELETE_SELF_FROM_COLLECTION = makeSymbol( "DELETE-SELF-FROM-COLLECTION" );
    $list288 = ConsesLow.list( makeSymbol( "COLLECTION" ) );
    $list289 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINKS" ), ConsesLow.list( makeSymbol( "GET-PARENT-LINKS" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINK" ), NIL ), ConsesLow.list( makeSymbol( "TEMPLATE-TARGET-LINK" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ), ConsesLow
            .list( makeSymbol( "PIF" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "DLC-OWNER" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ) ), makeSymbol( "COLLECTION" ) ),
                ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-TARGET-LINK" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ) ),
                    ConsesLow.list( makeSymbol( "SET-PARENT-LINKS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                        ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PREVIOUS" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ), ConsesLow.list( makeSymbol( "TEMPLATE-SUBLINKS" ), ConsesLow.list( makeSymbol( "CDR" ),
                            makeSymbol( "TEMPLATE-PREVIOUS" ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-SUBLINKS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-PARENT-LINK" ),
                                ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-SUBLINKS" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol(
                                    "TEMPLATE-PARENT-LINK" ) ), makeSymbol( "COLLECTION" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-TARGET-LINK" ),
                                        makeSymbol( "TEMPLATE-PARENT-LINK" ) ), ConsesLow.list( makeSymbol( "RPLACD" ), makeSymbol( "TEMPLATE-PREVIOUS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                                            "TEMPLATE-SUBLINKS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-SUBLINKS" ), NIL ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol(
                                                "CSETQ" ), makeSymbol( "TEMPLATE-PREVIOUS" ), makeSymbol( "TEMPLATE-SUBLINKS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-SUBLINKS" ), ConsesLow.list(
                                                    makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-SUBLINKS" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-TARGET-LINK" ), ConsesLow.list(
                                                        makeSymbol( "CUNWIND-PROTECT" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "SET-SELF-DELETION-MODE" ), makeSymbol( "SELF" ), T ), ConsesLow
                                                            .list( makeSymbol( "GENERIC-DLLT-DELETE-LINK-FUNCTION" ), ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-TARGET-LINK" ) ), makeSymbol(
                                                                "TEMPLATE-TARGET-LINK" ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-TARGET-LINK" ) ),
                                                                    NIL ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                        "ON-DELETE" ) ), makeSymbol( "COLLECTION" ) ), ConsesLow.list( makeSymbol( "SET-SELF-DELETION-MODE" ), makeSymbol( "SELF" ), NIL ) ) ) ), ConsesLow
                                                                            .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym290$TRANSFER_SELF = makeSymbol( "TRANSFER-SELF" );
    $list291 = ConsesLow.list( makeSymbol( "CURRENT-COLLECTION" ), makeSymbol( "NEW-COLLECTION" ) );
    $list292 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COLLECTION-TEMPLATE-P" ), makeSymbol( "CURRENT-COLLECTION" ) ), makeString(
        "(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE." ), makeSymbol( "SELF" ), makeSymbol( "CURRENT-COLLECTION" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol(
            "COLLECTION-TEMPLATE-P" ), makeSymbol( "CURRENT-COLLECTION" ) ), makeString( "(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE." ), makeSymbol( "SELF" ), makeSymbol( "NEW-COLLECTION" ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINKS" ), ConsesLow.list( makeSymbol( "GET-PARENT-LINKS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
            "TEMPLATE-PARENT-LINK" ), NIL ), ConsesLow.list( makeSymbol( "TEMPLATE-TARGET-LINK" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ), ConsesLow.list( makeSymbol(
                "PIF" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "DLC-OWNER" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ) ), makeSymbol( "CURRENT-COLLECTION" ) ), ConsesLow
                    .list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-TARGET-LINK" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ) ), ConsesLow
                        .list( makeSymbol( "SET-PARENT-LINKS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                            .list( ConsesLow.list( makeSymbol( "TEMPLATE-PREVIOUS" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ), ConsesLow.list( makeSymbol( "TEMPLATE-SUBLINKS" ), ConsesLow.list( makeSymbol( "CDR" ),
                                makeSymbol( "TEMPLATE-PREVIOUS" ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-SUBLINKS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                    "TEMPLATE-PARENT-LINK" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-SUBLINKS" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, ConsesLow.list(
                                        makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-PARENT-LINK" ) ), makeSymbol( "CURRENT-COLLECTION" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol(
                                            "CSETQ" ), makeSymbol( "TEMPLATE-TARGET-LINK" ), makeSymbol( "TEMPLATE-PARENT-LINK" ) ), ConsesLow.list( makeSymbol( "RPLACD" ), makeSymbol( "TEMPLATE-PREVIOUS" ), ConsesLow
                                                .list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-SUBLINKS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-SUBLINKS" ), NIL ) ), ConsesLow.list(
                                                    makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-PREVIOUS" ), makeSymbol( "TEMPLATE-SUBLINKS" ) ), ConsesLow.list( makeSymbol(
                                                        "CSETQ" ), makeSymbol( "TEMPLATE-SUBLINKS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-SUBLINKS" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                            "PWHEN" ), makeSymbol( "TEMPLATE-TARGET-LINK" ), ConsesLow.list( makeSymbol( "CUNWIND-PROTECT" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list(
                                                                makeSymbol( "SET-SELF-DELETION-MODE" ), makeSymbol( "SELF" ), T ), ConsesLow.list( makeSymbol( "GENERIC-DLLT-DELETE-LINK-FUNCTION" ), ConsesLow.list(
                                                                    makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-TARGET-LINK" ) ), makeSymbol( "TEMPLATE-TARGET-LINK" ) ) ), ConsesLow.list( makeSymbol( "CSETF" ),
                                                                        ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-TARGET-LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                                                                            makeSymbol( "NEW-COLLECTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD" ) ), makeSymbol( "SELF" ) ), ConsesLow.list(
                                                                                makeSymbol( "SET-SELF-DELETION-MODE" ), makeSymbol( "SELF" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym293$DELETE_SELF_FROM_ALL_COLLECTIONS = makeSymbol( "DELETE-SELF-FROM-ALL-COLLECTIONS" );
    $list294 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINKS" ), ConsesLow.list( makeSymbol( "GET-PARENT-LINKS" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "CUNWIND-PROTECT" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "SET-SELF-DELETION-MODE" ), makeSymbol( "SELF" ), T ), ConsesLow.list( makeSymbol( "CDOLIST" ),
            ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINK" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ), ConsesLow.list( makeSymbol( "GENERIC-DLLT-DELETE-LINK-FUNCTION" ), ConsesLow.list( makeSymbol( "DLC-OWNER" ),
                makeSymbol( "TEMPLATE-PARENT-LINK" ) ), makeSymbol( "TEMPLATE-PARENT-LINK" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-PARENT-LINK" ) ),
                    NIL ) ) ), ConsesLow.list( makeSymbol( "SET-SELF-DELETION-MODE" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-PARENT-LINKS" ), makeSymbol( "SELF" ), NIL ) ), ConsesLow.list(
                        makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $list295 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINKS" ), ConsesLow.list( makeSymbol( "GET-PARENT-LINKS" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINK" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, ConsesLow.list(
            makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-PARENT-LINK" ) ), makeSymbol( "COLLECTION" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym296$GET_COLLECTIONS = makeSymbol( "GET-COLLECTIONS" );
    $list297 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINKS" ), ConsesLow.list( makeSymbol( "GET-PARENT-LINKS" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "TEMPLATE-COLLECTIONS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST-COLLECTING" ), ConsesLow.list( makeSymbol( "TEMPLATE-PARENT-LINK" ), makeSymbol( "TEMPLATE-PARENT-LINKS" ),
            makeSymbol( "TEMPLATE-COLLECTIONS" ) ), ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-PARENT-LINK" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                "UNIQUE-ELEMENTS" ), makeSymbol( "TEMPLATE-COLLECTIONS" ) ) ) ) );
    $sym298$ON_ADD = makeSymbol( "ON-ADD" );
    $list299 = ConsesLow.list( makeSymbol( "PARENT-LIST" ) );
    $list300 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "PARENT-LIST" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym301$ON_DELETE = makeSymbol( "ON-DELETE" );
    $sym302$PERFORM_ACTION = makeSymbol( "PERFORM-ACTION" );
    $list303 = ConsesLow.list( makeSymbol( "ACTION" ), makeSymbol( "PARAMETERS" ) );
    $list304 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "ACTION" ), makeSymbol( "PARAMETERS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym305$BASIC_LIST_ELEMENT = makeSymbol( "BASIC-LIST-ELEMENT" );
    $list306 = ConsesLow.list( makeSymbol( "LIST-ELEMENT-TEMPLATE" ) );
    $list307 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "QUA-LIST-ELEMENT-SELF-DELETION-MODE" ), makeKeyword( "INSTANCE" ), makeKeyword( "BOOLEAN" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
        makeSymbol( "QUA-LIST-ELEMENT-PARENT-LINKS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PARENT-LINKS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "SET-PARENT-LINKS" ), ConsesLow.list( makeSymbol( "NEW-PARENT-LINKS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-PARENT-LINK" ), ConsesLow
                    .list( makeSymbol( "NEW-PARENT-LINK" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-PARENT-LINK" ),
                        ConsesLow.list( makeSymbol( "OLD-PARENT-LINK" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "GET-SELF-DELETION-MODE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-SELF-DELETION-MODE" ), ConsesLow.list( makeSymbol(
                                "MODE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-SELF-FROM-COLLECTION" ), ConsesLow.list( makeSymbol( "COLLECTION" ) ),
                                    makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "TRANSFER-SELF" ), ConsesLow.list( makeSymbol(
                                        "CURRENT-COLLECTION" ), makeSymbol( "NEW-COLLECTION" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                            makeSymbol( "DELETE-SELF-FROM-ALL-COLLECTIONS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                makeSymbol( "MEMBER-P" ), ConsesLow.list( makeSymbol( "COLLECTION" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-COLLECTIONS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-ADD" ), ConsesLow.list( makeSymbol( "PARENT-LIST" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-DELETE" ), ConsesLow.list( makeSymbol( "PARENT-LIST" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
          makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PERFORM-ACTION" ), ConsesLow.list( makeSymbol( "ACTION" ), makeSymbol( "PARAMETERS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym308$QUA_LIST_ELEMENT_PARENT_LINKS = makeSymbol( "QUA-LIST-ELEMENT-PARENT-LINKS" );
    $sym309$QUA_LIST_ELEMENT_SELF_DELETION_MODE = makeSymbol( "QUA-LIST-ELEMENT-SELF-DELETION-MODE" );
    $int310$4097 = makeInteger( 4097 );
    $sym311$BASIC_LIST_ELEMENT_PERFORM_ACTION_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-PERFORM-ACTION-METHOD" );
    $sym312$BASIC_LIST_ELEMENT_ON_DELETE_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-ON-DELETE-METHOD" );
    $sym313$BASIC_LIST_ELEMENT_ON_ADD_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-ON-ADD-METHOD" );
    $sym314$BASIC_LIST_ELEMENT_GET_COLLECTIONS_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-GET-COLLECTIONS-METHOD" );
    $sym315$BASIC_LIST_ELEMENT_MEMBER_P_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-MEMBER-P-METHOD" );
    $sym316$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD" );
    $str317$_TRANSFER_SELF__S____S_is_not_an_ = makeString( "(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE." );
    $sym318$BASIC_LIST_ELEMENT_TRANSFER_SELF_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-TRANSFER-SELF-METHOD" );
    $sym319$BASIC_LIST_ELEMENT_DELETE_SELF_FROM_COLLECTION_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-DELETE-SELF-FROM-COLLECTION-METHOD" );
    $sym320$BASIC_LIST_ELEMENT_DELETE_PARENT_LINK_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-DELETE-PARENT-LINK-METHOD" );
    $sym321$BASIC_LIST_ELEMENT_ADD_PARENT_LINK_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-ADD-PARENT-LINK-METHOD" );
    $sym322$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-CLASS" );
    $sym323$SUBLOOP_RESERVED_INITIALIZE_BASIC_LIST_ELEMENT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-LIST-ELEMENT-INSTANCE" );
    $list324 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUA-LIST-ELEMENT-SELF-DELETION-MODE" ), NIL ), ConsesLow.list(
        makeSymbol( "CSETQ" ), makeSymbol( "QUA-LIST-ELEMENT-PARENT-LINKS" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym325$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD" );
    $sym326$BASIC_LIST_ELEMENT_INITIALIZE_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-INITIALIZE-METHOD" );
    $sym327$GET_PARENT_LINKS = makeSymbol( "GET-PARENT-LINKS" );
    $list328 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "QUA-LIST-ELEMENT-PARENT-LINKS" ) ) );
    $sym329$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD" );
    $sym330$BASIC_LIST_ELEMENT_GET_PARENT_LINKS_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-GET-PARENT-LINKS-METHOD" );
    $sym331$SET_PARENT_LINKS = makeSymbol( "SET-PARENT-LINKS" );
    $list332 = ConsesLow.list( makeSymbol( "NEW-PARENT-LINKS" ) );
    $list333 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUA-LIST-ELEMENT-PARENT-LINKS" ), makeSymbol( "NEW-PARENT-LINKS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
        "NEW-PARENT-LINKS" ) ) );
    $sym334$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD" );
    $sym335$BASIC_LIST_ELEMENT_SET_PARENT_LINKS_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-SET-PARENT-LINKS-METHOD" );
    $sym336$GET_SELF_DELETION_MODE = makeSymbol( "GET-SELF-DELETION-MODE" );
    $list337 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "QUA-LIST-ELEMENT-SELF-DELETION-MODE" ) ) );
    $sym338$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD" );
    $sym339$BASIC_LIST_ELEMENT_GET_SELF_DELETION_MODE_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-GET-SELF-DELETION-MODE-METHOD" );
    $sym340$SET_SELF_DELETION_MODE = makeSymbol( "SET-SELF-DELETION-MODE" );
    $list341 = ConsesLow.list( makeSymbol( "MODE" ) );
    $list342 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUA-LIST-ELEMENT-SELF-DELETION-MODE" ), makeSymbol( "MODE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MODE" ) ) );
    $sym343$OUTER_CATCH_FOR_BASIC_LIST_ELEMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-LIST-ELEMENT-METHOD" );
    $sym344$BASIC_LIST_ELEMENT_SET_SELF_DELETION_MODE_METHOD = makeSymbol( "BASIC-LIST-ELEMENT-SET-SELF-DELETION-MODE-METHOD" );
    $sym345$DOUBLY_LINKED_LIST_TEMPLATE = makeSymbol( "DOUBLY-LINKED-LIST-TEMPLATE" );
    $list346 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-ELEMENT-COUNT" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT-COUNT" ) ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INC-ELEMENT-COUNT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEC-ELEMENT-COUNT" ),
          NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FIRST-LINK" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
              makeSymbol( "SET-FIRST-LINK" ), ConsesLow.list( makeSymbol( "NEW-FIRST-LINK" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LAST-LINK" ), NIL,
                  makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LAST-LINK" ), ConsesLow.list( makeSymbol( "NEW-LAST-LINK" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow
                      .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-LINK" ), ConsesLow.list( makeSymbol( "LINK" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                          makeSymbol( "REVERSE-LINK" ), ConsesLow.list( makeSymbol( "LINK" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND-LINK" ), ConsesLow
                              .list( makeSymbol( "ELEMENT" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND-NTH-LINK" ), ConsesLow.list( makeSymbol( "INDEX" ) ),
                                  makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                      "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                          makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                              makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MEMBER-P" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ),
              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PUSH" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                  "DEF-INSTANCE-METHOD" ), makeSymbol( "POP" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "BUT-LAST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                      .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NTH" ), ConsesLow.list( makeSymbol( "INDEX" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                          "SET-NTH" ), ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POSITION" ),
                              ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol(
                                  "OTHER-LIST" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REVERSE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                      "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SWAP" ), ConsesLow.list(
                                          makeSymbol( "ELEMENT1" ), makeSymbol( "ELEMENT2" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym347$DELETE_LINK = makeSymbol( "DELETE-LINK" );
    $list348 = ConsesLow.list( makeSymbol( "LINK" ) );
    $list349 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "DOUBLE-LINK-CELL-P" ), makeSymbol( "LINK" ) ), makeString(
        "(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL." ), makeSymbol( "SELF" ), makeSymbol( "LINK" ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( EQ, ConsesLow.list(
            makeSymbol( "DLC-OWNER" ), makeSymbol( "LINK" ) ), makeSymbol( "SELF" ) ), makeString( "(DELETE-LINK ~S): Link ~S is not owned by list ~S." ), makeSymbol( "SELF" ), makeSymbol( "LINK" ), makeSymbol(
                "SELF" ) ), ConsesLow.list( makeSymbol( "DEC-ELEMENT-COUNT" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-FIRST-LINK" ), ConsesLow
                    .list( makeSymbol( "GET-FIRST-LINK" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-LAST-LINK" ), ConsesLow.list( makeSymbol( "GET-LAST-LINK" ), makeSymbol( "SELF" ) ) ) ),
                    ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "TEMPLATE-FIRST-LINK" ), makeSymbol( "TEMPLATE-LAST-LINK" ) ), ConsesLow
                        .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "TEMPLATE-FIRST-LINK" ) ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "TEMPLATE-LAST-LINK" ) ) ) ),
                        makeString( "(DELETE-LINK ~S): Detected inconsistancy in list." ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol( "TEMPLATE-FIRST-LINK" ), makeSymbol(
                            "LINK" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol( "TEMPLATE-LAST-LINK" ), makeSymbol( "LINK" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list(
                                makeSymbol( "SET-FIRST-LINK" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-LAST-LINK" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow
                                    .list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "LINK" ) ), NIL ),
                                ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DLC-CONTENTS" ), makeSymbol( "LINK" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                                    makeSymbol( "TEMPLATE-SECOND-LINK" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "LINK" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol(
                                        "DLC-PREVIOUS" ), makeSymbol( "TEMPLATE-SECOND-LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "SET-FIRST-LINK" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-SECOND-LINK" ) ),
                                    ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol(
                                        "DLC-PREVIOUS" ), makeSymbol( "LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DLC-CONTENTS" ), makeSymbol( "LINK" ) ) ) ) ), ConsesLow.list(
                                            makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol( "TEMPLATE-LAST-LINK" ), makeSymbol( "LINK" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                                                makeSymbol( "TEMPLATE-SECOND-LINK" ), ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "LINK" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list(
                                                    makeSymbol( "DLC-NEXT" ), makeSymbol( "TEMPLATE-SECOND-LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "SET-LAST-LINK" ), makeSymbol( "SELF" ), makeSymbol(
                                                        "TEMPLATE-SECOND-LINK" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "LINK" ) ), NIL ), ConsesLow.list(
                                                            makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                                                makeSymbol( "DLC-CONTENTS" ), makeSymbol( "LINK" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                                    "TEMPLATE-BEFORE-LINK" ), ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "LINK" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-AFTER-LINK" ),
                                                                        ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "LINK" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol(
                                                                            "DLC-NEXT" ), makeSymbol( "TEMPLATE-BEFORE-LINK" ) ), makeSymbol( "TEMPLATE-AFTER-LINK" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow
                                                                                .list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "TEMPLATE-AFTER-LINK" ) ), makeSymbol( "TEMPLATE-BEFORE-LINK" ) ), ConsesLow.list(
                                                                                    makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "CSETF" ),
                                                                                        ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                                                                            makeSymbol( "DLC-CONTENTS" ), makeSymbol( "LINK" ) ) ) ) ) ) ) );
    $sym350$REVERSE_LINK = makeSymbol( "REVERSE-LINK" );
    $list351 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PREVIOUS" ), ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "LINK" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-NEXT" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "LINK" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol(
            "LINK" ) ), makeSymbol( "TEMPLATE-NEXT" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "LINK" ) ), makeSymbol( "TEMPLATE-PREVIOUS" ) ), ConsesLow.list(
                makeSymbol( "RET" ), makeSymbol( "LINK" ) ) ) );
    $sym352$FIND_LINK = makeSymbol( "FIND-LINK" );
    $list353 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "GET-FIRST-LINK" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "ELEMENT" ), ConsesLow.list(
            makeSymbol( "DLC-CONTENTS" ), makeSymbol( "TEMPLATE-LINKS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-LINKS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "TEMPLATE-LINKS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym354$FIND_NTH_LINK = makeSymbol( "FIND-NTH-LINK" );
    $list355 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "GET-FIRST-LINK" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "COUNT" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol(
            "COUNT" ), makeSymbol( "INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-LINKS" ) ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "COUNT" ) ), ConsesLow.list( makeSymbol(
                "CSETQ" ), makeSymbol( "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "TEMPLATE-LINKS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $list356 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), NIL ), ConsesLow.list( makeSymbol( "TEMPLATE-FIRST-LINK" ), ConsesLow.list(
        makeSymbol( "GET-FIRST-LINK" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-FIRST-LINK" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
            makeSymbol( "TEMPLATE-CURRENT-LINK" ), makeSymbol( "TEMPLATE-FIRST-LINK" ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-CURRENT-LINK" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                .list( makeSymbol( "DLC-CONTENTS" ), makeSymbol( "TEMPLATE-CURRENT-LINK" ) ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CURRENT-LINK" ), ConsesLow
                    .list( makeSymbol( "DLC-NEXT" ), makeSymbol( "TEMPLATE-CURRENT-LINK" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol(
                        "TEMPLATE-CONTENTS" ) ) ) ) );
    $list357 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "NEW-CONTENTS" ) ), makeString(
        "(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list." ), makeSymbol( "SELF" ), makeSymbol( "NEW-CONTENTS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
            .list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ),
                makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                    makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "NEW-CONTENTS" ) ), ConsesLow.list( makeSymbol( "ADD" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                        makeSymbol( "NEW-CONTENTS" ) ) );
    $list358 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list(
        makeSymbol( "ALLOCATE-ENUMERATOR" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ), ConsesLow.list(
            makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>" ), ConsesLow.list( makeSymbol( "CLASS-OF" ), makeSymbol( "SELF" ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "DLIST[]" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol(
                    "STREAM" ), makeString( "DLIST[~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIRST" ) ) ) ),
                    ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "LAST-P" ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( ", ~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                            "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "]" ) ) ) ), ConsesLow
                                .list( makeSymbol( "DEALLOCATE-ENUMERATOR" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $list359 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "SELF" ), makeSymbol(
            "TEMPLATE-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $list360 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-NEW-LINK" ), ConsesLow.list( makeSymbol( "MAKE-DOUBLE-LINK-CELL" ) ) ), ConsesLow.list(
        makeSymbol( "TEMPLATE-LAST-LINK" ), ConsesLow.list( makeSymbol( "GET-LAST-LINK" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-CONTENTS" ), makeSymbol(
            "TEMPLATE-NEW-LINK" ) ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-NEW-LINK" ) ), makeSymbol( "SELF" ) ), ConsesLow
                .list( makeSymbol( "PIF" ), makeSymbol( "TEMPLATE-LAST-LINK" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol(
                    "TEMPLATE-LAST-LINK" ) ), makeSymbol( "TEMPLATE-NEW-LINK" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "TEMPLATE-NEW-LINK" ) ), makeSymbol(
                        "TEMPLATE-LAST-LINK" ) ) ), ConsesLow.list( makeSymbol( "SET-FIRST-LINK" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-NEW-LINK" ) ) ), ConsesLow.list( makeSymbol( "SET-LAST-LINK" ), makeSymbol(
                            "SELF" ), makeSymbol( "TEMPLATE-NEW-LINK" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LIST-ELEMENT-TEMPLATE-P" ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list(
                                makeSymbol( "GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION" ), makeSymbol( "NEW-ELEMENT" ), makeSymbol( "TEMPLATE-NEW-LINK" ) ) ) ), ConsesLow.list( makeSymbol( "INC-ELEMENT-COUNT" ), makeSymbol(
                                    "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) );
    $list361 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "LIST-ELEMENT-TEMPLATE-P" ), makeSymbol( "OLD-ELEMENT" ) ), ConsesLow.list( makeSymbol(
        "GENERIC-DLLT-DELETE-SELF-FROM-COLLECTION-FUNCTION" ), makeSymbol( "OLD-ELEMENT" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LINK" ),
            ConsesLow.list( makeSymbol( "FIND-LINK" ), makeSymbol( "SELF" ), makeSymbol( "OLD-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LINK" ), ConsesLow.list( makeSymbol(
                "DELETE-LINK" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-LINK" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) );
    $list362 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LINK" ), ConsesLow.list( makeSymbol( "FIND-LINK" ), makeSymbol( "SELF" ), makeSymbol(
        "ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "TEMPLATE-LINK" ), T, NIL ) ) ) );
    $list363 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-FIRST-LINK" ), ConsesLow.list( makeSymbol( "GET-FIRST-LINK" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "TEMPLATE-NEW-LINK" ), ConsesLow.list( makeSymbol( "MAKE-DOUBLE-LINK-CELL" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-CONTENTS" ), makeSymbol(
            "TEMPLATE-NEW-LINK" ) ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "TEMPLATE-NEW-LINK" ) ), makeSymbol( "SELF" ) ), ConsesLow
                .list( makeSymbol( "PIF" ), makeSymbol( "TEMPLATE-FIRST-LINK" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol(
                    "TEMPLATE-NEW-LINK" ) ), makeSymbol( "TEMPLATE-FIRST-LINK" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "TEMPLATE-FIRST-LINK" ) ), makeSymbol(
                        "TEMPLATE-NEW-LINK" ) ), ConsesLow.list( makeSymbol( "SET-FIRST-LINK" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-NEW-LINK" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list(
                            makeSymbol( "SET-FIRST-LINK" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-NEW-LINK" ) ), ConsesLow.list( makeSymbol( "SET-LAST-LINK" ), makeSymbol( "SELF" ), makeSymbol(
                                "TEMPLATE-NEW-LINK" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LIST-ELEMENT-TEMPLATE-P" ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol(
                                    "GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION" ), makeSymbol( "NEW-ELEMENT" ), makeSymbol( "TEMPLATE-NEW-LINK" ) ) ), ConsesLow.list( makeSymbol( "INC-ELEMENT-COUNT" ), makeSymbol(
                                        "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ) );
    $list364 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-FIRST-LINK" ), ConsesLow.list( makeSymbol( "GET-FIRST-LINK" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-FIRST-LINK" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol(
            "DLC-CONTENTS" ), makeSymbol( "TEMPLATE-FIRST-LINK" ) ) ) ), ConsesLow.list( makeSymbol( "DELETE-LINK" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-FIRST-LINK" ) ), ConsesLow.list( makeSymbol( "RET" ),
                makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $list365 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LAST-LINK" ), ConsesLow.list( makeSymbol( "GET-LAST-LINK" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LAST-LINK" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol(
            "DLC-CONTENTS" ), makeSymbol( "TEMPLATE-LAST-LINK" ) ) ) ), ConsesLow.list( makeSymbol( "DELETE-LINK" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-LAST-LINK" ) ), ConsesLow.list( makeSymbol( "RET" ),
                makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $list366 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LINK" ), ConsesLow.list( makeSymbol( "FIND-NTH-LINK" ), makeSymbol( "SELF" ), makeSymbol(
        "INDEX" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LINK" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DLC-CONTENTS" ), makeSymbol( "TEMPLATE-LINK" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $list367 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LINK" ), ConsesLow.list( makeSymbol( "FIND-NTH-LINK" ), makeSymbol( "SELF" ), makeSymbol(
        "INDEX" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LINK" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENT" ), ConsesLow.list(
            makeSymbol( "DLC-CONTENTS" ), makeSymbol( "TEMPLATE-LINK" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LIST-ELEMENT-TEMPLATE-P" ), makeSymbol( "TEMPLATE-CONTENT" ) ), ConsesLow
                .list( makeSymbol( "GENERIC-DLLT-DELETE-PARENT-LINK-FUNCTION" ), makeSymbol( "TEMPLATE-CONTENT" ), makeSymbol( "TEMPLATE-LINK" ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol(
                    "DLC-CONTENTS" ), makeSymbol( "TEMPLATE-LINK" ) ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LIST-ELEMENT-TEMPLATE-P" ), makeSymbol(
                        "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol( "GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION" ), makeSymbol( "NEW-ELEMENT" ), makeSymbol( "TEMPLATE-LINK" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                            makeSymbol( "NEW-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list368 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "GET-FIRST-LINK" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "COUNT" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "WHILE" ),
            makeSymbol( "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol(
                "DLC-CONTENTS" ), makeSymbol( "TEMPLATE-LINKS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "COUNT" ) ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "COUNT" ) ), ConsesLow.list(
                    makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-LINKS" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "TEMPLATE-LINKS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $list369 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "OTHER-LIST" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
        makeSymbol( "CONSP" ), makeSymbol( "OTHER-LIST" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "OTHER-LIST" ) ), ConsesLow.list( makeSymbol( "ADD" ),
            makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol(
                "LIST-TEMPLATE-P" ), makeSymbol( "OTHER-LIST" ) ), makeString( "(APPEND ~S): Cannot append non list ~S." ), makeSymbol( "SELF" ), makeSymbol( "OTHER-LIST" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                    ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "OTHER-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                        makeSymbol( "ALLOCATE-ENUMERATOR" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                "SELF" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                                    "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIRST" ) ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-ELEMENT" ), ConsesLow.list(
                                        makeSymbol( "ADD" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ELEMENT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-ELEMENT" ), ConsesLow.list( makeSymbol(
                                            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $list370 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-FIRST-LINK" ), ConsesLow.list( makeSymbol( "GET-FIRST-LINK" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "TEMPLATE-LAST-LINK" ), ConsesLow.list( makeSymbol( "GET-LAST-LINK" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-FIRST-LINK" ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "TEMPLATE-FIRST-LINK" ), makeSymbol( "TEMPLATE-LAST-LINK" ) ), ConsesLow
                .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-LINK" ), makeSymbol( "TEMPLATE-FIRST-LINK" ) ),
                    makeSymbol( "TEMPLATE-NEXT-LINK" ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-CURRENT-LINK" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-NEXT-LINK" ), ConsesLow
                        .list( makeSymbol( "DLC-NEXT" ), makeSymbol( "TEMPLATE-CURRENT-LINK" ) ) ), ConsesLow.list( makeSymbol( "REVERSE-LINK" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CURRENT-LINK" ) ), ConsesLow
                            .list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CURRENT-LINK" ), makeSymbol( "TEMPLATE-NEXT-LINK" ) ) ), ConsesLow.list( makeSymbol( "SET-FIRST-LINK" ), makeSymbol( "SELF" ), makeSymbol(
                                "TEMPLATE-LAST-LINK" ) ), ConsesLow.list( makeSymbol( "SET-LAST-LINK" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-FIRST-LINK" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                    "SELF" ) ) ) );
    $list371 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "GET-FIRST-LINK" ), makeSymbol( "SELF" ) ) ) ) );
    $sym372$SWAP = makeSymbol( "SWAP" );
    $list373 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "ELEMENT1" ), makeSymbol( "ELEMENT2" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol(
        "MUST" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "ELEMENT1" ), makeSymbol( "ELEMENT2" ) ), makeString( "(SWAP ~S): Cannot swap NIL elements." ), makeSymbol( "SELF" ) ), ConsesLow.list( new SubLObject[]
        { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LINK1" ), ConsesLow.list( makeSymbol( "FIND-LINK" ), makeSymbol( "SELF" ), makeSymbol( "ELEMENT1" ) ) ), ConsesLow.list( makeSymbol( "LINK2" ),
            ConsesLow.list( makeSymbol( "FIND-LINK" ), makeSymbol( "SELF" ), makeSymbol( "ELEMENT2" ) ) ) ), ConsesLow.list( makeSymbol( "MUST" ), makeSymbol( "LINK1" ), makeString(
                "(SWAP ~S): ~S is not an element of this list." ), makeSymbol( "SELF" ), makeSymbol( "ELEMENT1" ) ), ConsesLow.list( makeSymbol( "MUST" ), makeSymbol( "LINK2" ), makeString(
                    "(SWAP ~S): ~S is not an element of this list." ), makeSymbol( "SELF" ), makeSymbol( "ELEMENT2" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LIST-ELEMENT-TEMPLATE-P" ),
                        makeSymbol( "ELEMENT1" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ELEMENT1" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DELETE-PARENT-LINK" ) ),
                            makeSymbol( "LINK1" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ELEMENT1" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD-PARENT-LINK" ) ),
                                makeSymbol( "LINK2" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LIST-ELEMENT-TEMPLATE-P" ), makeSymbol( "ELEMENT2" ) ), ConsesLow.list( makeSymbol(
                                    "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ELEMENT2" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DELETE-PARENT-LINK" ) ), makeSymbol( "LINK2" ) ), ConsesLow.list( makeSymbol(
                                        "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "ELEMENT2" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD-PARENT-LINK" ) ), makeSymbol( "LINK1" ) ) ), ConsesLow.list(
                                            makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-CONTENTS" ), makeSymbol( "LINK1" ) ), makeSymbol( "ELEMENT2" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list(
                                                makeSymbol( "DLC-CONTENTS" ), makeSymbol( "LINK2" ) ), makeSymbol( "ELEMENT1" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL )
    } ) );
    $sym374$BASIC_DOUBLY_LINKED_LIST = makeSymbol( "BASIC-DOUBLY-LINKED-LIST" );
    $list375 = ConsesLow.list( makeSymbol( "DOUBLY-LINKED-LIST-TEMPLATE" ) );
    $list376 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "ELEMENT-EQUALITY-PREDICATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ELEMENT-COUNT" ),
        makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "FIRST-LINK" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LAST-LINK" ),
            makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-EQUALITY-PREDICATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-ELEMENT-EQUALITY-PREDICATE" ), ConsesLow.list( makeSymbol( "NEW-PREDICATE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "ELEMENT-EQUAL-P" ), ConsesLow.list( makeSymbol( "ELEMENT1" ), makeSymbol( "ELEMENT2" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
              "SET-ELEMENT-COUNT" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT-COUNT" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INC-ELEMENT-COUNT" ), NIL,
                  makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEC-ELEMENT-COUNT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                      "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FIRST-LINK" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-FIRST-LINK" ), ConsesLow.list(
                          makeSymbol( "NEW-FIRST-LINK" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LAST-LINK" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow
                              .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LAST-LINK" ), ConsesLow.list( makeSymbol( "NEW-LAST-LINK" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                  "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-LINK" ), ConsesLow.list( makeSymbol( "LINK" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                      makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REVERSE-LINK" ), ConsesLow.list( makeSymbol( "LINK" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND-LINK" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
          makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND-NTH-LINK" ), ConsesLow.list( makeSymbol( "INDEX" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                  "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword(
                      "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword(
                          "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword(
                              "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MEMBER-P" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword(
                                  "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PUSH" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ),
                                      makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POP" ), NIL, makeKeyword(
                                          "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "BUT-LAST" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ),
                                              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NTH" ), ConsesLow.list( makeSymbol( "INDEX" ) ), makeKeyword(
                                                  "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-NTH" ), ConsesLow.list( makeSymbol( "INDEX" ),
                                                      makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                          "POSITION" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                              "DEF-INSTANCE-METHOD" ), makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "OTHER-LIST" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword(
                                                                  "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REVERSE" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword(
                                                                      "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword(
                                                                          "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SWAP" ), ConsesLow.list( makeSymbol( "ELEMENT1" ), makeSymbol(
                                                                              "ELEMENT2" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                                                  makeSymbol( "ALLOCATE-ENUMERATOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                                      "DEALLOCATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "ENUMERATOR" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym377$LAST_LINK = makeSymbol( "LAST-LINK" );
    $sym378$FIRST_LINK = makeSymbol( "FIRST-LINK" );
    $sym379$ELEMENT_COUNT = makeSymbol( "ELEMENT-COUNT" );
    $str380$_SWAP__S___Cannot_swap_NIL_elemen = makeString( "(SWAP ~S): Cannot swap NIL elements." );
    $str381$_SWAP__S____S_is_not_an_element_o = makeString( "(SWAP ~S): ~S is not an element of this list." );
    $sym382$BASIC_DOUBLY_LINKED_LIST_SWAP_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-SWAP-METHOD" );
    $sym383$BASIC_DOUBLY_LINKED_LIST_EMPTY_P_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-EMPTY-P-METHOD" );
    $sym384$BASIC_DOUBLY_LINKED_LIST_REVERSE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-REVERSE-METHOD" );
    $str385$_APPEND__S___Cannot_append_non_li = makeString( "(APPEND ~S): Cannot append non list ~S." );
    $sym386$BASIC_DOUBLY_LINKED_LIST_APPEND_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-APPEND-METHOD" );
    $sym387$BASIC_DOUBLY_LINKED_LIST_POSITION_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-POSITION-METHOD" );
    $sym388$BASIC_DOUBLY_LINKED_LIST_SET_NTH_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-SET-NTH-METHOD" );
    $sym389$BASIC_DOUBLY_LINKED_LIST_NTH_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-NTH-METHOD" );
    $sym390$BASIC_DOUBLY_LINKED_LIST_BUT_LAST_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-BUT-LAST-METHOD" );
    $sym391$BASIC_DOUBLY_LINKED_LIST_POP_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-POP-METHOD" );
    $sym392$BASIC_DOUBLY_LINKED_LIST_PUSH_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-PUSH-METHOD" );
    $sym393$BASIC_DOUBLY_LINKED_LIST_MEMBER_P_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-MEMBER-P-METHOD" );
    $sym394$BASIC_DOUBLY_LINKED_LIST_REMOVE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-REMOVE-METHOD" );
    $sym395$BASIC_DOUBLY_LINKED_LIST_ADD_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ADD-METHOD" );
    $sym396$BASIC_DOUBLY_LINKED_LIST_CLEAR_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-CLEAR-METHOD" );
    $str397$DLIST__ = makeString( "DLIST[]" );
    $str398$DLIST__S = makeString( "DLIST[~S" );
    $sym399$BASIC_DOUBLY_LINKED_LIST_PRINT_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-PRINT-METHOD" );
    $sym400$BASIC_DOUBLY_LINKED_LIST_FIND_NTH_LINK_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-FIND-NTH-LINK-METHOD" );
    $sym401$BASIC_DOUBLY_LINKED_LIST_FIND_LINK_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-FIND-LINK-METHOD" );
    $sym402$BASIC_DOUBLY_LINKED_LIST_REVERSE_LINK_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-REVERSE-LINK-METHOD" );
    $str403$_DELETE_LINK__S____S_is_not_a_val = makeString( "(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL." );
    $str404$_DELETE_LINK__S___Link__S_is_not_ = makeString( "(DELETE-LINK ~S): Link ~S is not owned by list ~S." );
    $str405$_DELETE_LINK__S___Detected_incons = makeString( "(DELETE-LINK ~S): Detected inconsistancy in list." );
    $sym406$BASIC_DOUBLY_LINKED_LIST_DELETE_LINK_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-DELETE-LINK-METHOD" );
    $str407$_SET_CONTENTS__S___Cannot_set_the = makeString( "(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list." );
    $sym408$BASIC_DOUBLY_LINKED_LIST_SET_CONTENTS_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-SET-CONTENTS-METHOD" );
    $sym409$BASIC_DOUBLY_LINKED_LIST_GET_CONTENTS_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-GET-CONTENTS-METHOD" );
    $sym410$BASIC_DOUBLY_LINKED_LIST_ELEMENT_EQUAL_P_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ELEMENT-EQUAL-P-METHOD" );
    $sym411$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-CLASS" );
    $sym412$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-INSTANCE" );
    $sym413$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $sym414$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-EQUALITY-PREDICATE-METHOD" );
    $sym415$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $sym416$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-EQUALITY-PREDICATE-METHOD" );
    $sym417$SET_ELEMENT_COUNT = makeSymbol( "SET-ELEMENT-COUNT" );
    $list418 = ConsesLow.list( makeSymbol( "NEW-ELEMENT-COUNT" ) );
    $list419 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol( "NEW-ELEMENT-COUNT" ) ), makeString(
        "(SET-ELEMENT-COUNT ~S): ~S is not a legal element count value.  Expecting an integer." ), makeSymbol( "SELF" ), makeSymbol( "NEW-ELEMENT-COUNT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "ELEMENT-COUNT" ), makeSymbol( "NEW-ELEMENT-COUNT" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT-COUNT" ) ) );
    $sym420$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $str421$_SET_ELEMENT_COUNT__S____S_is_not = makeString( "(SET-ELEMENT-COUNT ~S): ~S is not a legal element count value.  Expecting an integer." );
    $sym422$BASIC_DOUBLY_LINKED_LIST_SET_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-SET-ELEMENT-COUNT-METHOD" );
    $sym423$INC_ELEMENT_COUNT = makeSymbol( "INC-ELEMENT-COUNT" );
    $list424 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "ELEMENT-COUNT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ELEMENT-COUNT" ),
        ONE_INTEGER ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "ELEMENT-COUNT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ELEMENT-COUNT" ) ) );
    $sym425$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $sym426$BASIC_DOUBLY_LINKED_LIST_INC_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-INC-ELEMENT-COUNT-METHOD" );
    $sym427$DEC_ELEMENT_COUNT = makeSymbol( "DEC-ELEMENT-COUNT" );
    $list428 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "ELEMENT-COUNT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ELEMENT-COUNT" ),
        ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CDEC" ), makeSymbol( "ELEMENT-COUNT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ELEMENT-COUNT" ) ) );
    $sym429$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $sym430$BASIC_DOUBLY_LINKED_LIST_DEC_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-DEC-ELEMENT-COUNT-METHOD" );
    $sym431$GET_FIRST_LINK = makeSymbol( "GET-FIRST-LINK" );
    $list432 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "FIRST-LINK" ) ) );
    $sym433$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $sym434$BASIC_DOUBLY_LINKED_LIST_GET_FIRST_LINK_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-GET-FIRST-LINK-METHOD" );
    $sym435$SET_FIRST_LINK = makeSymbol( "SET-FIRST-LINK" );
    $list436 = ConsesLow.list( makeSymbol( "NEW-FIRST-LINK" ) );
    $list437 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEW-FIRST-LINK" ) ), ConsesLow.list( makeSymbol(
        "DOUBLE-LINK-CELL-P" ), makeSymbol( "NEW-FIRST-LINK" ) ) ), makeString( "(SET-FIRST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL." ), makeSymbol( "SELF" ), makeSymbol( "NEW-FIRST-LINK" ) ), ConsesLow.list(
            makeSymbol( "CSETQ" ), makeSymbol( "FIRST-LINK" ), makeSymbol( "NEW-FIRST-LINK" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-FIRST-LINK" ) ) );
    $sym438$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $str439$_SET_FIRST_LINK__S____S_is_not_an = makeString( "(SET-FIRST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL." );
    $sym440$BASIC_DOUBLY_LINKED_LIST_SET_FIRST_LINK_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-SET-FIRST-LINK-METHOD" );
    $sym441$GET_LAST_LINK = makeSymbol( "GET-LAST-LINK" );
    $list442 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LAST-LINK" ) ) );
    $sym443$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $sym444$BASIC_DOUBLY_LINKED_LIST_GET_LAST_LINK_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-GET-LAST-LINK-METHOD" );
    $sym445$SET_LAST_LINK = makeSymbol( "SET-LAST-LINK" );
    $list446 = ConsesLow.list( makeSymbol( "NEW-LAST-LINK" ) );
    $list447 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEW-LAST-LINK" ) ), ConsesLow.list( makeSymbol(
        "DOUBLE-LINK-CELL-P" ), makeSymbol( "NEW-LAST-LINK" ) ) ), makeString( "(SET-LAST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL." ), makeSymbol( "SELF" ), makeSymbol( "NEW-LAST-LINK" ) ), ConsesLow.list(
            makeSymbol( "CSETQ" ), makeSymbol( "LAST-LINK" ), makeSymbol( "NEW-LAST-LINK" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-LAST-LINK" ) ) );
    $sym448$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $str449$_SET_LAST_LINK__S____S_is_not_an_ = makeString( "(SET-LAST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL." );
    $sym450$BASIC_DOUBLY_LINKED_LIST_SET_LAST_LINK_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-SET-LAST-LINK-METHOD" );
    $list451 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ELEMENT-COUNT" ) ) );
    $sym452$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $sym453$BASIC_DOUBLY_LINKED_LIST_GET_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-GET-ELEMENT-COUNT-METHOD" );
    $sym454$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" );
    $list455 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "FIRST-LINK" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LAST-LINK" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CURRENT-LINK" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DIRECTION" ), makeKeyword( "INSTANCE" ),
            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                makeSymbol( "ISOLATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INITIAL-STATE" ), ConsesLow.list( makeSymbol( "NEW-FIRST-LINK" ), makeSymbol(
                    "NEW-LAST-LINK" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST-P" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CURRENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST" ), NIL, makeKeyword(
          "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL,
              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PREVIOUS" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym456$CURRENT_LINK = makeSymbol( "CURRENT-LINK" );
    $sym457$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_C = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CLASS" );
    $sym458$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_I = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INSTANCE" );
    $list459 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIRST-LINK" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "LAST-LINK" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-LINK" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword( "NONE" ) ), ConsesLow
            .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym460$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD" );
    $sym461$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_INITIALIZE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-INITIALIZE-METHOD" );
    $sym462$ISOLATE = makeSymbol( "ISOLATE" );
    $list463 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "FIRST-LINK" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-LINK" ), makeSymbol(
        "FIRST-LINK" ) ), ConsesLow.list( makeSymbol( "NEXT-LINK" ), NIL ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "CURRENT-LINK" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEXT-LINK" ),
            ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol( "CURRENT-LINK" ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-CONTENTS" ), makeSymbol( "CURRENT-LINK" ) ), NIL ),
            ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-OWNER" ), makeSymbol( "CURRENT-LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ),
                makeSymbol( "CURRENT-LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol( "CURRENT-LINK" ) ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
                    makeSymbol( "CURRENT-LINK" ), makeSymbol( "NEXT-LINK" ) ) ) ) ), ConsesLow.list( new SubLObject[]
                    { makeSymbol( "CSETQ" ), makeSymbol( "FIRST-LINK" ), NIL, makeSymbol( "LAST-LINK" ), NIL, makeSymbol( "CURRENT-LINK" ), NIL, makeSymbol( "DIRECTION" ), makeKeyword( "NONE" )
    } ), ConsesLow.list( makeSymbol( "ISOLATE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym464$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD" );
    $sym465$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_ISOLATE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-ISOLATE-METHOD" );
    $sym466$SET_INITIAL_STATE = makeSymbol( "SET-INITIAL-STATE" );
    $list467 = ConsesLow.list( makeSymbol( "NEW-FIRST-LINK" ), makeSymbol( "NEW-LAST-LINK" ) );
    $list468 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIRST-LINK" ), makeSymbol( "NEW-FIRST-LINK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LAST-LINK" ), makeSymbol(
        "NEW-LAST-LINK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-LINK" ), makeSymbol( "NEW-FIRST-LINK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword(
            "FORWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym469$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD" );
    $sym470$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_SET_INITIAL_STATE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-SET-INITIAL-STATE-METHOD" );
    $list471 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "FIRST-LINK" ) ) ) );
    $sym472$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD" );
    $sym473$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_EMPTY_P_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-EMPTY-P-METHOD" );
    $list474 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( EQ, makeSymbol( "FIRST-LINK" ), makeSymbol( "CURRENT-LINK" ) ) ) );
    $sym475$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD" );
    $sym476$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_P_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-P-METHOD" );
    $list477 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
        makeSymbol( "CURRENT-LINK" ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol(
            "CURRENT-LINK" ) ) ) ) );
    $sym478$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD" );
    $sym479$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_P_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-P-METHOD" );
    $list480 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "CURRENT-LINK" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "DLC-CONTENTS" ), makeSymbol( "CURRENT-LINK" ) ) ) );
    $sym481$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-METHOD" );
    $sym482$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_CURRENT_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-CURRENT-METHOD" );
    $list483 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PUBLIC" ) );
    $list484 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-LINK" ), makeSymbol( "FIRST-LINK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword(
        "FORWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) );
    $sym485$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_FIRST_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-FIRST-METHOD" );
    $list486 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-LINK" ), makeSymbol( "LAST-LINK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword(
        "BACKWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) );
    $sym487$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_LAST_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-LAST-METHOD" );
    $list488 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "CURRENT-LINK" ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "DIRECTION" ), ConsesLow.list( makeKeyword( "FORWARDS" ), ConsesLow
        .list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeKeyword( "BACKWARDS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-LINK" ), makeSymbol( "FIRST-LINK" ) ), ConsesLow.list( makeSymbol(
            "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword( "FORWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol(
                "OTHERWISE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-LINK" ), ConsesLow.list( makeSymbol( "DLC-NEXT" ), makeSymbol(
                    "CURRENT-LINK" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword( "FORWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ),
                        makeSymbol( "SELF" ) ) ) );
    $sym489$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_NEXT_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-NEXT-METHOD" );
    $list490 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "CURRENT-LINK" ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "DIRECTION" ), ConsesLow.list( makeKeyword( "FORWARDS" ), ConsesLow
        .list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-LINK" ), makeSymbol( "LAST-LINK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword( "BACKWARDS" ) ), ConsesLow.list( makeSymbol(
            "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeKeyword( "BACKWARDS" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol(
                "OTHERWISE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-LINK" ), ConsesLow.list( makeSymbol( "DLC-PREVIOUS" ), makeSymbol(
                    "CURRENT-LINK" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword( "BACKWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ),
                        makeSymbol( "SELF" ) ) ) );
    $sym491$BASIC_DOUBLY_LINKED_LIST_ENUMERATOR_PREVIOUS_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-PREVIOUS-METHOD" );
    $list492 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-ENUMERATOR" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
        makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ) ) ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ),
            ConsesLow.list( makeSymbol( "NEW-FIRST-LINK" ), makeSymbol( "NEW-LAST-LINK" ) ), ConsesLow.list( makeSymbol( "DLC-COPY-LINKS" ), makeSymbol( "FIRST-LINK" ), makeSymbol( "NEW-ENUMERATOR" ) ), ConsesLow.list(
                makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-INITIAL-STATE" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ), makeSymbol( "NEW-ENUMERATOR" ), makeSymbol( "NEW-FIRST-LINK" ),
                makeSymbol( "NEW-LAST-LINK" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ENUMERATOR" ) ) ) ) );
    $sym493$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_LIST_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-LIST-METHOD" );
    $sym494$BASIC_DOUBLY_LINKED_LIST_ALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ALLOCATE-ENUMERATOR-METHOD" );
    $list495 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-P" ), makeSymbol( "ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
        ConsesLow.list( makeSymbol( "ISOLATE" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ), makeSymbol( "ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym496$BASIC_DOUBLY_LINKED_LIST_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-LIST-DEALLOCATE-ENUMERATOR-METHOD" );
    $sym497$PAIR_TEMPLATE = makeSymbol( "PAIR-TEMPLATE" );
    $list498 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FIRST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-FIRST" ), ConsesLow.list( makeSymbol(
            "NEW-FIRST" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SECOND" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-SECOND" ), ConsesLow.list( makeSymbol( "NEW-SECOND" ) ), makeKeyword( "PUBLIC" ) ) );
    $list499 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "(~S, ~S)" ), ConsesLow.list( makeSymbol(
        "GET-FIRST" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym500$BASIC_PAIR = makeSymbol( "BASIC-PAIR" );
    $list501 = ConsesLow.list( makeSymbol( "PAIR-TEMPLATE" ) );
    $list502 = ConsesLow.list( ConsesLow.list( makeSymbol( "FIRST-ELEMENT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SECOND-ELEMENT" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "GET-FIRST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-FIRST" ), ConsesLow.list( makeSymbol( "NEW-FIRST" ) ), makeKeyword( "PUBLIC" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SECOND" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-SECOND" ), ConsesLow.list(
            makeSymbol( "NEW-SECOND" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym503$SECOND_ELEMENT = makeSymbol( "SECOND-ELEMENT" );
    $sym504$FIRST_ELEMENT = makeSymbol( "FIRST-ELEMENT" );
    $str505$__S___S_ = makeString( "(~S, ~S)" );
    $sym506$BASIC_PAIR_PRINT_METHOD = makeSymbol( "BASIC-PAIR-PRINT-METHOD" );
    $sym507$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-CLASS" );
    $sym508$SUBLOOP_RESERVED_INITIALIZE_BASIC_PAIR_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-PAIR-INSTANCE" );
    $list509 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIRST-ELEMENT" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "SECOND-ELEMENT" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym510$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-PAIR-METHOD" );
    $sym511$BASIC_PAIR_INITIALIZE_METHOD = makeSymbol( "BASIC-PAIR-INITIALIZE-METHOD" );
    $sym512$GET_FIRST = makeSymbol( "GET-FIRST" );
    $list513 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "FIRST-ELEMENT" ) ) );
    $sym514$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-PAIR-METHOD" );
    $sym515$BASIC_PAIR_GET_FIRST_METHOD = makeSymbol( "BASIC-PAIR-GET-FIRST-METHOD" );
    $sym516$SET_FIRST = makeSymbol( "SET-FIRST" );
    $list517 = ConsesLow.list( makeSymbol( "NEW-FIRST" ) );
    $list518 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIRST-ELEMENT" ), makeSymbol( "NEW-FIRST" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-FIRST" ) ) );
    $sym519$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-PAIR-METHOD" );
    $sym520$BASIC_PAIR_SET_FIRST_METHOD = makeSymbol( "BASIC-PAIR-SET-FIRST-METHOD" );
    $sym521$GET_SECOND = makeSymbol( "GET-SECOND" );
    $list522 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SECOND-ELEMENT" ) ) );
    $sym523$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-PAIR-METHOD" );
    $sym524$BASIC_PAIR_GET_SECOND_METHOD = makeSymbol( "BASIC-PAIR-GET-SECOND-METHOD" );
    $sym525$SET_SECOND = makeSymbol( "SET-SECOND" );
    $list526 = ConsesLow.list( makeSymbol( "NEW-SECOND" ) );
    $list527 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SECOND-ELEMENT" ), makeSymbol( "NEW-SECOND" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-SECOND" ) ) );
    $sym528$OUTER_CATCH_FOR_BASIC_PAIR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-PAIR-METHOD" );
    $sym529$BASIC_PAIR_SET_SECOND_METHOD = makeSymbol( "BASIC-PAIR-SET-SECOND-METHOD" );
    $sym530$TRIPLET_TEMPLATE = makeSymbol( "TRIPLET-TEMPLATE" );
    $list531 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "PAIR-TEMPLATE" ) ) );
    $list532 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-THIRD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "SET-THIRD" ), ConsesLow.list( makeSymbol( "NEW-THIRD" ) ), makeKeyword( "PUBLIC" ) ) );
    $list533 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "(~S, ~S, ~S)" ), ConsesLow.list( makeSymbol(
        "GET-FIRST" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "GET-THIRD" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "SELF" ) ) );
    $sym534$BASIC_TRIPLET = makeSymbol( "BASIC-TRIPLET" );
    $list535 = ConsesLow.list( makeSymbol( "TRIPLET-TEMPLATE" ) );
    $list536 = ConsesLow.list( ConsesLow.list( makeSymbol( "THIRD-ELEMENT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL,
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ),
            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-THIRD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "SET-THIRD" ), ConsesLow.list( makeSymbol( "NEW-THIRD" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym537$THIRD_ELEMENT = makeSymbol( "THIRD-ELEMENT" );
    $str538$__S___S___S_ = makeString( "(~S, ~S, ~S)" );
    $sym539$BASIC_TRIPLET_PRINT_METHOD = makeSymbol( "BASIC-TRIPLET-PRINT-METHOD" );
    $sym540$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-CLASS" );
    $sym541$SUBLOOP_RESERVED_INITIALIZE_BASIC_TRIPLET_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-TRIPLET-INSTANCE" );
    $list542 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "THIRD-ELEMENT" ), NIL ), ConsesLow.list( makeSymbol( "RET" ),
        makeSymbol( "SELF" ) ) );
    $sym543$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-TRIPLET-METHOD" );
    $sym544$BASIC_TRIPLET_INITIALIZE_METHOD = makeSymbol( "BASIC-TRIPLET-INITIALIZE-METHOD" );
    $sym545$GET_THIRD = makeSymbol( "GET-THIRD" );
    $list546 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "THIRD-ELEMENT" ) ) );
    $sym547$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-TRIPLET-METHOD" );
    $sym548$BASIC_TRIPLET_GET_THIRD_METHOD = makeSymbol( "BASIC-TRIPLET-GET-THIRD-METHOD" );
    $sym549$SET_THIRD = makeSymbol( "SET-THIRD" );
    $list550 = ConsesLow.list( makeSymbol( "NEW-THIRD" ) );
    $list551 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "THIRD-ELEMENT" ), makeSymbol( "NEW-THIRD" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-THIRD" ) ) );
    $sym552$OUTER_CATCH_FOR_BASIC_TRIPLET_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-TRIPLET-METHOD" );
    $sym553$BASIC_TRIPLET_SET_THIRD_METHOD = makeSymbol( "BASIC-TRIPLET-SET-THIRD-METHOD" );
    $sym554$SUBLOOP_PRIVATE_PAIR = makeSymbol( "SUBLOOP-PRIVATE-PAIR" );
    $list555 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym556$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-CLASS" );
    $sym557$SUBLOOP_RESERVED_INITIALIZE_SUBLOOP_PRIVATE_PAIR_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SUBLOOP-PRIVATE-PAIR-INSTANCE" );
    $list558 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "SUBLOOP-PRIVATE-PAIR(~S, ~S)" ), ConsesLow
        .list( makeSymbol( "GET-FIRST" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $str559$SUBLOOP_PRIVATE_PAIR__S___S_ = makeString( "SUBLOOP-PRIVATE-PAIR(~S, ~S)" );
    $sym560$SUBLOOP_PRIVATE_PAIR_PRINT_METHOD = makeSymbol( "SUBLOOP-PRIVATE-PAIR-PRINT-METHOD" );
    $sym561$BAG_ENUMERATOR_TEMPLATE = makeSymbol( "BAG-ENUMERATOR-TEMPLATE" );
    $list562 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS-POINTER" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "NEW-POINTER" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "GET-CONTENTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword(
                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECTION" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "SET-DIRECTION" ), ConsesLow.list( makeSymbol( "NEW-DIRECTION" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword(
                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "LAST-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CURRENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PREVIOUS" ), NIL, makeKeyword(
          "PUBLIC" ) )
    } );
    $list563 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol(
            "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ) );
    $list564 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol(
        "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
            "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( EQ, makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) );
    $list565 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
            makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ),
                makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "LIST" ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                    ConsesLow.list( ConsesLow.list( makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "LIST" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol(
                        "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "ELEMENT" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "COUNT" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
                            ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ) ), ConsesLow.list( makeSymbol( "QUANT" ), ConsesLow.list(
                                makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                    ConsesLow.list( makeSymbol( "=" ), makeSymbol( "COUNT" ), makeSymbol( "QUANT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ),
                ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) );
    $list566 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
            makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "LIST" ) ) ) ), ConsesLow.list(
                    makeSymbol( "PWHEN" ), makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "ELEMENT" ) ), ConsesLow.list( makeSymbol(
                        "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "ELEMENT" ) ) ), ConsesLow.list( makeSymbol(
                            "RET" ), makeSymbol( "ELEMENT" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $list567 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol(
        "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol(
            "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol(
                "SUBLOOP-PRIVATE-PAIR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ), makeSymbol( "SELF" ), makeSymbol(
                    "TEMPLATE-CONTENTS-POINTER" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                        "TEMPLATE-CONTENTS-POINTER" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                            ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol(
                                "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "TEMPLATE-ELEMENT" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-SECOND" ), makeSymbol(
                                    "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-SECOND" ),
                                        makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), NIL ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                                            "SET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), NIL ) ), ConsesLow.list( makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ),
                                                makeKeyword( "FORWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ) );
    $list568 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol(
        "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol(
            "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol(
                "SUBLOOP-PRIVATE-PAIR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ) ) ), ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ), makeSymbol( "SELF" ), makeSymbol(
                    "TEMPLATE-CONTENTS-POINTER" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                        "LAST-CONS" ), ConsesLow.list( makeSymbol( "LAST" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol(
                            "LAST-CONS" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "ELEMENT" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                .list( ConsesLow.list( makeSymbol( "COUNT" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                                    "ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                                        "TEMPLATE-CONTENTS-POINTER" ), makeSymbol( "LAST-CONS" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-SECOND" ), makeSymbol(
                                            "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), makeSymbol( "COUNT" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol(
                                                "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), makeSymbol(
                                                    "LAST-CONS" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                                                        "TEMPLATE-CONTENTS-POINTER" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                                                            "SET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), NIL ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
                                                                ConsesLow.list( makeSymbol( "SET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), NIL ) ) ), ConsesLow.list(
                                                                    makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "BACKWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                                                        "CURRENT" ), makeSymbol( "SELF" ) ) ) ) );
    $list569 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-DIRECTION" ), ConsesLow.list( makeSymbol( "GET-DIRECTION" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "CAND" ),
            makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                "TEMPLATE-CONTENTS-POINTER" ) ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "NEXT-ELEMENT" ), makeSymbol( "SUCCESS-P" ) ), ConsesLow.list( makeSymbol(
                    "SUBLOOP-COLLECTIONS-BAG-ENUM-GET-NEXT" ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ), ConsesLow.list( makeSymbol( "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "FORWARDS" ) ), ConsesLow
                        .list( makeSymbol( "PIF" ), makeSymbol( "SUCCESS-P" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEXT-ELEMENT" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list(
                            makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol( "TEMPLATE-DIRECTION" ), makeKeyword( "FORWARDS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "RET" ),
                                ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "SELF" ) ) ) ) ) ) );
    $list570 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-DIRECTION" ), ConsesLow.list( makeSymbol( "GET-DIRECTION" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "CAND" ),
            makeSymbol( "TEMPLATE-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                "TEMPLATE-CONTENTS-POINTER" ) ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "NEXT-ELEMENT" ), makeSymbol( "SUCCESS-P" ) ), ConsesLow.list( makeSymbol(
                    "SUBLOOP-COLLECTIONS-BACKUP-POINTER" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ), makeSymbol( "TEMPLATE-CONTENTS-POINTER" ) ), ConsesLow.list( makeSymbol(
                        "SET-DIRECTION" ), makeSymbol( "SELF" ), makeKeyword( "BACKWARDS" ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "SUCCESS-P" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                            "NEXT-ELEMENT" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol( "TEMPLATE-DIRECTION" ), makeKeyword( "BACKWARDS" ) ),
                                ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LAST" ), makeSymbol( "SELF" ) ) ) ) ) ) );
    $sym571$BASIC_BAG_ENUMERATOR = makeSymbol( "BASIC-BAG-ENUMERATOR" );
    $list572 = ConsesLow.list( makeSymbol( "BAG-ENUMERATOR-TEMPLATE" ) );
    $list573 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "CONTENTS-POINTER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONTENTS" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DIRECTION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "INSTANTIATE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS-POINTER" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "NEW-POINTER" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "GET-CONTENTS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword(
                        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DIRECTION" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                            makeSymbol( "SET-DIRECTION" ), ConsesLow.list( makeSymbol( "NEW-DIRECTION" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL,
                                makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ),
                                    makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow
                                        .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CURRENT" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                makeSymbol( "LAST" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL,
                                                    makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PREVIOUS" ), NIL, makeKeyword(
                                                        "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym574$BASIC_BAG_ENUMERATOR_PREVIOUS_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-PREVIOUS-METHOD" );
    $sym575$BASIC_BAG_ENUMERATOR_NEXT_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-NEXT-METHOD" );
    $sym576$BASIC_BAG_ENUMERATOR_LAST_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-LAST-METHOD" );
    $sym577$BASIC_BAG_ENUMERATOR_FIRST_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-FIRST-METHOD" );
    $sym578$BASIC_BAG_ENUMERATOR_CURRENT_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-CURRENT-METHOD" );
    $sym579$BASIC_BAG_ENUMERATOR_LAST_P_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-LAST-P-METHOD" );
    $sym580$BASIC_BAG_ENUMERATOR_FIRST_P_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-FIRST-P-METHOD" );
    $sym581$BASIC_BAG_ENUMERATOR_EMPTY_P_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-EMPTY-P-METHOD" );
    $sym582$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-CLASS" );
    $sym583$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_ENUMERATOR_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-ENUMERATOR-INSTANCE" );
    $sym584$INSTANTIATE = makeSymbol( "INSTANTIATE" );
    $list585 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANTIATE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONTENTS-POINTER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
        ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "CONTENTS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeKeyword( "NONE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym586$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD" );
    $sym587$BASIC_BAG_ENUMERATOR_INSTANTIATE_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-INSTANTIATE-METHOD" );
    $sym588$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD" );
    $sym589$BASIC_BAG_ENUMERATOR_GET_CONTENTS_POINTER_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-GET-CONTENTS-POINTER-METHOD" );
    $list590 = ConsesLow.list( makeSymbol( "NEW-POINTER" ) );
    $list591 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEW-POINTER" ) ), ConsesLow.list( makeSymbol(
        "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "NEW-POINTER" ) ) ), makeString( "(SET-CONTENTS-POINTER ~S): ~S is not an instance of SUBLOOP-PRIVATE-PAIR." ), makeSymbol( "SELF" ), makeSymbol( "NEW-POINTER" ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONTENTS-POINTER" ), makeSymbol( "NEW-POINTER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-POINTER" ) ) );
    $sym592$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD" );
    $str593$_SET_CONTENTS_POINTER__S____S_is_ = makeString( "(SET-CONTENTS-POINTER ~S): ~S is not an instance of SUBLOOP-PRIVATE-PAIR." );
    $sym594$BASIC_BAG_ENUMERATOR_SET_CONTENTS_POINTER_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-SET-CONTENTS-POINTER-METHOD" );
    $sym595$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD" );
    $sym596$BASIC_BAG_ENUMERATOR_GET_CONTENTS_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-GET-CONTENTS-METHOD" );
    $list597 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "NEW-CONTENTS" ) ), makeString( "(SET-CONTENTS ~S): ~S is not an instance of LIST." ), makeSymbol(
        "SELF" ), makeSymbol( "NEW-CONTENTS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONTENTS" ), makeSymbol( "NEW-CONTENTS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-CONTENTS" ) ) );
    $sym598$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD" );
    $str599$_SET_CONTENTS__S____S_is_not_an_i = makeString( "(SET-CONTENTS ~S): ~S is not an instance of LIST." );
    $sym600$BASIC_BAG_ENUMERATOR_SET_CONTENTS_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-SET-CONTENTS-METHOD" );
    $sym601$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD" );
    $sym602$BASIC_BAG_ENUMERATOR_GET_DIRECTION_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-GET-DIRECTION-METHOD" );
    $list603 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SEQUENTIAL-DIRECTION-P" ), makeSymbol( "NEW-DIRECTION" ) ), makeString(
        "(SET-DIRECTION ~S): ~S is not an instance of SEQUANITIAL-DIRECTION." ), makeSymbol( "SELF" ), makeSymbol( "NEW-DIRECTION" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DIRECTION" ), makeSymbol(
            "NEW-DIRECTION" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-DIRECTION" ) ) );
    $sym604$OUTER_CATCH_FOR_BASIC_BAG_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-ENUMERATOR-METHOD" );
    $str605$_SET_DIRECTION__S____S_is_not_an_ = makeString( "(SET-DIRECTION ~S): ~S is not an instance of SEQUANITIAL-DIRECTION." );
    $sym606$BASIC_BAG_ENUMERATOR_SET_DIRECTION_METHOD = makeSymbol( "BASIC-BAG-ENUMERATOR-SET-DIRECTION-METHOD" );
    $sym607$BAG_TEMPLATE = makeSymbol( "BAG-TEMPLATE" );
    $list608 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INTERNAL-REPRESENTATION" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INTERNAL-REPRESENTATION" ), ConsesLow.list( makeSymbol( "NEW-REP" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                    "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol(
                        "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MEMBER-P" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "OCCURENCES" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-UNIQUE-ELEMENTS" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-UNIQUE-ELEMENT-COUNT" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $list609 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list(
        makeSymbol( "ALLOCATE-ENUMERATOR" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ), ConsesLow.list(
            makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>" ), ConsesLow.list( makeSymbol( "CLASS-OF" ), makeSymbol( "SELF" ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "BAG[]" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol(
                    "STREAM" ), makeString( "BAG[~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIRST" ) ) ) ),
                    ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "LAST-P" ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( ", ~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                            "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "]" ) ) ) ), ConsesLow
                                .list( makeSymbol( "DEALLOCATE-ENUMERATOR" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $list610 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-BAG-LIST" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REPRESENTATION" ), makeSymbol(
        "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-COUNT" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "TEMPLATE-BAG-LIST" ) ),
            ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "TEMPLATE-ELEMENT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-COUNT" ),
                ConsesLow.list( makeSymbol( "+" ), makeSymbol( "TEMPLATE-COUNT" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ),
                    makeSymbol( "TEMPLATE-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "TEMPLATE-COUNT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-COUNT" ) ) ) );
    $list611 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-BAG-LIST" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REPRESENTATION" ), makeSymbol(
        "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST-APPENDING" ), ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "TEMPLATE-BAG-LIST" ),
            makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "TEMPLATE-ELEMENT" ) ), ConsesLow.list( makeSymbol(
                "SUBLOOP-COLLECTIONS-BAG-TEMPLATE-TRANSLATE-PAIR" ), makeSymbol( "TEMPLATE-ELEMENT" ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "TEMPLATE-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                    makeSymbol( "TEMPLATE-CONTENTS" ) ) ) );
    $list612 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-INTERNAL-REPRESENTATION" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ),
        makeSymbol( "NEW-CONTENTS" ) ), ConsesLow.list( makeSymbol( "ADD" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-CONTENTS" ) ) );
    $list613 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-BAG-LIST" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REPRESENTATION" ), makeSymbol(
        "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOSUBLISTS" ), ConsesLow.list( makeSymbol( "TEMPLATE-SUBLIST" ), makeSymbol( "TEMPLATE-BAG-LIST" ) ),
            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-SUBLIST" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list(
                makeSymbol( "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ),
                    makeSymbol( "NEW-ELEMENT" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                        "TEMPLATE-CURRENT-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                            "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow.list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol(
                                "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol(
                                    "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "NEW-ELEMENT" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ), ConsesLow.list( makeSymbol(
                                        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-NEW-PAIR" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol(
                                            "SUBLOOP-PRIVATE-PAIR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                                                makeSymbol( "SET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-NEW-PAIR" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ), ConsesLow.list(
                                                    makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-NEW-PAIR" ), TWO_INTEGER ),
                                        ConsesLow.list( makeSymbol( "RPLACA" ), makeSymbol( "TEMPLATE-SUBLIST" ), makeSymbol( "TEMPLATE-NEW-PAIR" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                            "NEW-ELEMENT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-INTERNAL-REPRESENTATION" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-ELEMENT" ),
                                                makeSymbol( "TEMPLATE-BAG-LIST" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ) );
    $list614 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-BAG-LIST" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REPRESENTATION" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-BAG-LIST" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "CLET" ),
            ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-BAG-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list(
                makeSymbol( "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ),
                    makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                        "TEMPLATE-CURRENT-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-COUNT" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow
                            .list( makeSymbol( "GET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                "=" ), makeSymbol( "TEMPLATE-COUNT" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "RPLACA" ), makeSymbol( "TEMPLATE-BAG-LIST" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow
                                    .list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                        "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                                            "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "TEMPLATE-COUNT" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                "OLD-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "OLD-ELEMENT" ),
                                                    makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ), ConsesLow.list( makeSymbol( "SET-INTERNAL-REPRESENTATION" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CDR" ),
                                                        makeSymbol( "TEMPLATE-BAG-LIST" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                                            ConsesLow.list( makeSymbol( "TEMPLATE-PREVIOUS-CONS" ), makeSymbol( "TEMPLATE-BAG-LIST" ) ), ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-CONS" ), ConsesLow
                                                                .list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-BAG-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ), ConsesLow
                                                                    .list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ),
                                                                    ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ), ConsesLow.list(
                                                                        makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "OLD-ELEMENT" ), ConsesLow.list(
                                                                            makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol(
                                                                                "TEMPLATE-CURRENT-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-COUNT" ),
                                                                                    ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ),
                                                                                        makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ),
                                                                                            makeSymbol( "TEMPLATE-COUNT" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "RPLACA" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ),
                                                                                                ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol(
                                                                                                    "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                                                                        makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                                                                                                            "SET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow
                                                                                                                .list( makeSymbol( "-" ), makeSymbol( "TEMPLATE-COUNT" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol(
                                                                                                                    "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                                                                                                        makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "OLD-ELEMENT" ), makeSymbol(
                                                                                                                            "TEMPLATE-CURRENT-ELEMENT" ) ), ConsesLow.list( makeSymbol( "RPLACD" ), makeSymbol(
                                                                                                                                "TEMPLATE-PREVIOUS-CONS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                                                                                                                                    "TEMPLATE-CURRENT-CONS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                                                                                                        "OLD-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                                                                                                            "TEMPLATE-PREVIOUS-CONS" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ), ConsesLow
                                                                                                                                                .list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ),
                                                                                                                                                    ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                                                                                                                                                        "TEMPLATE-CURRENT-CONS" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                            "RET" ), NIL ) ) ) ) ) );
    $list615 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-BAG-LIST" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REPRESENTATION" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "TEMPLATE-BAG-LIST" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol(
            "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "TEMPLATE-ELEMENT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-ELEMENT" ) ), makeSymbol( "ELEMENT" ) ), ConsesLow.list( makeSymbol( "RET" ),
                    T ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "ELEMENT" ) ), ConsesLow.list(
                        makeSymbol( "RET" ), T ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym616$OCCURENCES = makeSymbol( "OCCURENCES" );
    $list617 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-BAG-LIST" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REPRESENTATION" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "TEMPLATE-BAG-LIST" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol(
            "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "TEMPLATE-ELEMENT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-ELEMENT" ) ), makeSymbol( "ELEMENT" ) ), ConsesLow.list( makeSymbol( "RET" ),
                    ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-SECOND" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol(
                        "PWHEN" ), ConsesLow.list( makeSymbol( "ELEMENT-EQUAL-P" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "ELEMENT" ) ), ConsesLow.list( makeSymbol( "RET" ),
                            ONE_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ZERO_INTEGER ) ) );
    $sym618$GET_UNIQUE_ELEMENTS = makeSymbol( "GET-UNIQUE-ELEMENTS" );
    $list619 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-UNIQUE-ELEMENTS" ), NIL ), ConsesLow.list( makeSymbol( "TEMPLATE-BAG-LIST" ), ConsesLow.list(
        makeSymbol( "GET-INTERNAL-REPRESENTATION" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "TEMPLATE-BAG-LIST" ) ), ConsesLow
            .list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "SUBLOOP-PRIVATE-PAIR-P" ), makeSymbol( "TEMPLATE-ELEMENT" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
                ConsesLow.list( makeSymbol( "GET-FIRST" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), makeSymbol( "TEMPLATE-ELEMENT" ) ), makeSymbol( "TEMPLATE-UNIQUE-ELEMENTS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                    makeSymbol( "TEMPLATE-ELEMENT" ), makeSymbol( "TEMPLATE-UNIQUE-ELEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-UNIQUE-ELEMENTS" ) ) ) );
    $sym620$GET_UNIQUE_ELEMENT_COUNT = makeSymbol( "GET-UNIQUE-ELEMENT-COUNT" );
    $list621 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REPRESENTATION" ), makeSymbol( "SELF" ) ) ) ) );
    $list622 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REPRESENTATION" ), makeSymbol( "SELF" ) ) ) ) );
    $sym623$BASIC_BAG = makeSymbol( "BASIC-BAG" );
    $list624 = ConsesLow.list( makeSymbol( "BAG-TEMPLATE" ) );
    $list625 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "BAG-REPRESENTATION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INTERNAL-REPRESENTATION" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list(
            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INTERNAL-REPRESENTATION" ), ConsesLow.list( makeSymbol( "NEW-REP" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                        "GET-CONTENTS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list(
                            makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list(
                                makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow
                                    .list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MEMBER-P" ),
                                        ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                            "OCCURENCES" ), ConsesLow.list( makeSymbol( "ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-UNIQUE-ELEMENTS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-UNIQUE-ELEMENT-COUNT" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "ALLOCATE-ENUMERATOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                "DEALLOCATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "ENUMERATOR" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym626$BAG_REPRESENTATION = makeSymbol( "BAG-REPRESENTATION" );
    $sym627$BASIC_BAG_EMPTY_P_METHOD = makeSymbol( "BASIC-BAG-EMPTY-P-METHOD" );
    $sym628$BASIC_BAG_GET_UNIQUE_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-BAG-GET-UNIQUE-ELEMENT-COUNT-METHOD" );
    $sym629$BASIC_BAG_GET_UNIQUE_ELEMENTS_METHOD = makeSymbol( "BASIC-BAG-GET-UNIQUE-ELEMENTS-METHOD" );
    $sym630$BASIC_BAG_OCCURENCES_METHOD = makeSymbol( "BASIC-BAG-OCCURENCES-METHOD" );
    $sym631$BASIC_BAG_MEMBER_P_METHOD = makeSymbol( "BASIC-BAG-MEMBER-P-METHOD" );
    $sym632$BASIC_BAG_REMOVE_METHOD = makeSymbol( "BASIC-BAG-REMOVE-METHOD" );
    $sym633$BASIC_BAG_ADD_METHOD = makeSymbol( "BASIC-BAG-ADD-METHOD" );
    $sym634$BASIC_BAG_SET_CONTENTS_METHOD = makeSymbol( "BASIC-BAG-SET-CONTENTS-METHOD" );
    $sym635$BASIC_BAG_GET_CONTENTS_METHOD = makeSymbol( "BASIC-BAG-GET-CONTENTS-METHOD" );
    $sym636$BASIC_BAG_GET_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-BAG-GET-ELEMENT-COUNT-METHOD" );
    $str637$BAG__ = makeString( "BAG[]" );
    $str638$BAG__S = makeString( "BAG[~S" );
    $sym639$BASIC_BAG_PRINT_METHOD = makeSymbol( "BASIC-BAG-PRINT-METHOD" );
    $sym640$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-CLASS" );
    $sym641$SUBLOOP_RESERVED_INITIALIZE_BASIC_BAG_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-BAG-INSTANCE" );
    $list642 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "BAG-REPRESENTATION" ), NIL ), ConsesLow.list( makeSymbol( "RET" ),
        makeSymbol( "SELF" ) ) );
    $sym643$OUTER_CATCH_FOR_BASIC_BAG_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-METHOD" );
    $sym644$BASIC_BAG_INITIALIZE_METHOD = makeSymbol( "BASIC-BAG-INITIALIZE-METHOD" );
    $sym645$GET_INTERNAL_REPRESENTATION = makeSymbol( "GET-INTERNAL-REPRESENTATION" );
    $list646 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "BAG-REPRESENTATION" ) ) );
    $sym647$OUTER_CATCH_FOR_BASIC_BAG_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-METHOD" );
    $sym648$BASIC_BAG_GET_INTERNAL_REPRESENTATION_METHOD = makeSymbol( "BASIC-BAG-GET-INTERNAL-REPRESENTATION-METHOD" );
    $sym649$SET_INTERNAL_REPRESENTATION = makeSymbol( "SET-INTERNAL-REPRESENTATION" );
    $list650 = ConsesLow.list( makeSymbol( "NEW-REP" ) );
    $list651 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "NEW-REP" ) ), makeString(
        "(SET-INTERNAL-REPRESENTATION ~S): ~S is not a valid bag representation.  Expecting an instance of LIST." ), makeSymbol( "SELF" ), makeSymbol( "NEW-REP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "BAG-REPRESENTATION" ), makeSymbol( "NEW-REP" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-REP" ) ) );
    $sym652$OUTER_CATCH_FOR_BASIC_BAG_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-METHOD" );
    $str653$_SET_INTERNAL_REPRESENTATION__S__ = makeString( "(SET-INTERNAL-REPRESENTATION ~S): ~S is not a valid bag representation.  Expecting an instance of LIST." );
    $sym654$BASIC_BAG_SET_INTERNAL_REPRESENTATION_METHOD = makeSymbol( "BASIC-BAG-SET-INTERNAL-REPRESENTATION-METHOD" );
    $list655 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-ENUMERATOR" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
        makeSymbol( "BASIC-BAG-ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-BAG-ENUMERATOR" ) ) ) ), ConsesLow.list( makeSymbol( "CONTENTS-POINTER" ), ConsesLow.list( makeSymbol(
            "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBLOOP-PRIVATE-PAIR" ) ) ) ) ), ConsesLow.list( makeSymbol(
                "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-CONTENTS-POINTER" ), makeSymbol( "BASIC-BAG-ENUMERATOR" ) ), makeSymbol( "NEW-ENUMERATOR" ), makeSymbol( "CONTENTS-POINTER" ) ), ConsesLow.list(
                    makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "BASIC-BAG-ENUMERATOR" ) ), makeSymbol( "NEW-ENUMERATOR" ), makeSymbol( "BAG-REPRESENTATION" ) ), ConsesLow
                        .list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "BASIC-BAG-ENUMERATOR" ) ), makeSymbol( "NEW-ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "RET" ),
                            makeSymbol( "NEW-ENUMERATOR" ) ) ) );
    $sym656$OUTER_CATCH_FOR_BASIC_BAG_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-BAG-METHOD" );
    $sym657$BASIC_BAG_ALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-BAG-ALLOCATE-ENUMERATOR-METHOD" );
    $list658 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "BASIC-BAG-ENUMERATOR-P" ), makeSymbol( "ENUMERATOR" ) ), makeString(
        "(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-BAG-ENUMERATOR." ), makeSymbol( "SELF" ), makeSymbol( "ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
            "SET-CONTENTS-POINTER" ), makeSymbol( "BASIC-BAG-ENUMERATOR" ) ), makeSymbol( "ENUMERATOR" ), NIL ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol(
                "BASIC-BAG-ENUMERATOR" ) ), makeSymbol( "ENUMERATOR" ), NIL ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ISOLATE" ), makeSymbol( "BASIC-BAG-ENUMERATOR" ) ), makeSymbol(
                    "ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str659$_DEALLOCATE_ENUMERATOR__S____S_is = makeString( "(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-BAG-ENUMERATOR." );
    $sym660$BASIC_BAG_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-BAG-DEALLOCATE-ENUMERATOR-METHOD" );
    $sym661$TEST_LIST_ELEMENT = makeSymbol( "TEST-LIST-ELEMENT" );
    $list662 = ConsesLow.list( ConsesLow.list( makeSymbol( "SYMBOLIC-NAME" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL,
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SYMBOLIC-NAME" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "SET-SYMBOLIC-NAME" ), ConsesLow.list( makeSymbol( "NEW-SYMBOLIC-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list(
                makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-ADD" ), ConsesLow.list( makeSymbol( "PARENT-LIST" ) ),
                    makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-DELETE" ), ConsesLow.list( makeSymbol( "PARENT-LIST" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym663$SYMBOLIC_NAME = makeSymbol( "SYMBOLIC-NAME" );
    $sym664$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-CLASS" );
    $sym665$SUBLOOP_RESERVED_INITIALIZE_TEST_LIST_ELEMENT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEST-LIST-ELEMENT-INSTANCE" );
    $list666 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SYMBOLIC-NAME" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym667$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD" );
    $sym668$TEST_LIST_ELEMENT_INITIALIZE_METHOD = makeSymbol( "TEST-LIST-ELEMENT-INITIALIZE-METHOD" );
    $sym669$GET_SYMBOLIC_NAME = makeSymbol( "GET-SYMBOLIC-NAME" );
    $list670 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SYMBOLIC-NAME" ) ) );
    $sym671$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD" );
    $sym672$TEST_LIST_ELEMENT_GET_SYMBOLIC_NAME_METHOD = makeSymbol( "TEST-LIST-ELEMENT-GET-SYMBOLIC-NAME-METHOD" );
    $sym673$SET_SYMBOLIC_NAME = makeSymbol( "SET-SYMBOLIC-NAME" );
    $list674 = ConsesLow.list( makeSymbol( "NEW-SYMBOLIC-NAME" ) );
    $list675 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SYMBOLIC-NAME" ), makeSymbol( "NEW-SYMBOLIC-NAME" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-SYMBOLIC-NAME" ) ) );
    $sym676$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD" );
    $sym677$TEST_LIST_ELEMENT_SET_SYMBOLIC_NAME_METHOD = makeSymbol( "TEST-LIST-ELEMENT-SET-SYMBOLIC-NAME-METHOD" );
    $list678 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( ">~S<" ), makeSymbol( "SYMBOLIC-NAME" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym679$OUTER_CATCH_FOR_TEST_LIST_ELEMENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEST-LIST-ELEMENT-METHOD" );
    $str680$__S_ = makeString( ">~S<" );
    $sym681$TEST_LIST_ELEMENT_PRINT_METHOD = makeSymbol( "TEST-LIST-ELEMENT-PRINT-METHOD" );
    $sym682$TEST_LIST_ELEMENT_ON_ADD_METHOD = makeSymbol( "TEST-LIST-ELEMENT-ON-ADD-METHOD" );
    $sym683$TEST_LIST_ELEMENT_ON_DELETE_METHOD = makeSymbol( "TEST-LIST-ELEMENT-ON-DELETE-METHOD" );
    $sym684$_TEST_LIST_ELEMENTS_ = makeSymbol( "*TEST-LIST-ELEMENTS*" );
    $str685$ENUMERATOR_TEMPLATE_EMPTY_P___S_i = makeString( "ENUMERATOR-TEMPLATE-EMPTY-P: ~S is not an instance of ENUMERATOR-TEMPLATE." );
    $str686$ENUMERATOR_TEMPLATE_LAST_P___S_is = makeString( "ENUMERATOR-TEMPLATE-LAST-P: ~S is not an instance of ENUMERATOR-TEMPLATE." );
    $str687$ENUMERATOR_TEMPLATE_FIRST___S_is_ = makeString( "ENUMERATOR-TEMPLATE-FIRST: ~S is not an instance of ENUMERATOR-TEMPLATE." );
    $str688$ENUMERATOR_TEMPLATE_NEXT___S_is_n = makeString( "ENUMERATOR-TEMPLATE-NEXT: ~S is not an instance of ENUMERATOR-TEMPLATE." );
    $str689$ENUMERATOR_TEMPLATE_CURRENT___S_i = makeString( "ENUMERATOR-TEMPLATE-CURRENT: ~S is not an instance of ENUMERATOR-TEMPLATE." );
    $str690$COLLECTION_TEMPLATE_EMPTY_P___S_i = makeString( "COLLECTION-TEMPLATE-EMPTY-P: ~S is not an instance of COLLECTION-TEMPLATE." );
    $str691$DOUBLY_LINKED_LIST_TEMPLATE_ADD__ = makeString( "DOUBLY-LINKED-LIST-TEMPLATE-ADD: ~S is not an instance of DOUBLY-LINKED-LIST-TEMPLATE." );
    $str692$DOUBLY_LINKED_LIST_TEMPLATE_GET_C = makeString( "DOUBLY-LINKED-LIST-TEMPLATE-GET-CONTENTS: ~S is not an instance of DOUBLY-LINKED-LIST-TEMPLATE." );
  }

  public static final class $double_link_cell_native
      extends
        SubLStructNative
  {
    public SubLObject $owner;
    public SubLObject $contents;
    public SubLObject $previous;
    public SubLObject $next;
    private static final SubLStructDeclNative structDecl;

    public $double_link_cell_native()
    {
      this.$owner = CommonSymbols.NIL;
      this.$contents = CommonSymbols.NIL;
      this.$previous = CommonSymbols.NIL;
      this.$next = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $double_link_cell_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$owner;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$contents;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$previous;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$next;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$owner = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$contents = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$previous = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$next = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $double_link_cell_native.class, $sym249$DOUBLE_LINK_CELL, $sym250$DOUBLE_LINK_CELL_P, $list251, $list252, new String[] { "$owner", "$contents", "$previous", "$next"
      }, $list253, $list254, $sym255$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $double_link_cell_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $double_link_cell_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DOUBLE-LINK-CELL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return double_link_cell_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 4595 ms
 * 
 */