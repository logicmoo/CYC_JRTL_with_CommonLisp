package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_sequences
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subloop_sequences";
  public static final String myFingerPrint = "676e4da44199e1b3e532e45a5b4982d6c9c6dcbd50efbf4d17510002b190d93c";
  private static final SubLSymbol $sym0$SEQUENCE_ELEMENT_TEMPLATE;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$SEQUENCE;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$GET_CONTENTS;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$SEQUENCE_TEMPLATE;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$CLEAR;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$GET_LENGTH;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$GET_NTH;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$SET_NTH;
  private static final SubLList $list19;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$GET_SUBSEQUENCE;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$ADD;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$ALLOCATE_ENUMERATOR;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$DEALLOCATE_ENUMERATOR;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$BASIC_SEQUENCE_ENUMERATOR;
  private static final SubLSymbol $sym33$OBJECT;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$CURRENT_INDEX;
  private static final SubLSymbol $sym37$LENGTH;
  private static final SubLSymbol $sym38$SHARED_STORAGE;
  private static final SubLSymbol $sym39$INSTANCE_COUNT;
  private static final SubLSymbol $sym40$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_CLASS;
  private static final SubLSymbol $sym41$ISOLATED_P;
  private static final SubLSymbol $sym42$INSTANCE_NUMBER;
  private static final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_INSTANCE;
  private static final SubLSymbol $sym44$INITIALIZE;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym48$BASIC_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD;
  private static final SubLSymbol $sym49$SET_SHARED_STORAGE;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLString $str53$_SET_SHARED_STORAGE__S____S_is_no;
  private static final SubLSymbol $sym54$BASIC_SEQUENCE_ENUMERATOR_SET_SHARED_STORAGE_METHOD;
  private static final SubLSymbol $sym55$EMPTY_P;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym58$BASIC_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD;
  private static final SubLSymbol $sym59$FIRST_P;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym62$BASIC_SEQUENCE_ENUMERATOR_FIRST_P_METHOD;
  private static final SubLSymbol $sym63$LAST_P;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym66$BASIC_SEQUENCE_ENUMERATOR_LAST_P_METHOD;
  private static final SubLSymbol $sym67$CURRENT;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym70$BASIC_SEQUENCE_ENUMERATOR_CURRENT_METHOD;
  private static final SubLSymbol $sym71$FIRST;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym74$BASIC_SEQUENCE_ENUMERATOR_FIRST_METHOD;
  private static final SubLSymbol $sym75$LAST;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym78$BASIC_SEQUENCE_ENUMERATOR_LAST_METHOD;
  private static final SubLSymbol $sym79$NEXT;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$BASIC_SEQUENCE_ENUMERATOR_NEXT_METHOD;
  private static final SubLSymbol $sym83$PREVIOUS;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$BASIC_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD;
  private static final SubLSymbol $sym86$BASIC_SEQUENCE;
  private static final SubLList $list87;
  private static final SubLList $list88;
  private static final SubLSymbol $sym89$SEQUENCE_CLASS;
  private static final SubLSymbol $sym90$INTERNAL_STORAGE;
  private static final SubLString $str91$_DEALLOCATE_ENUMERATOR__S____S_is;
  private static final SubLSymbol $sym92$BASIC_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym93$BASIC_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym94$BASIC_SEQUENCE_GET_CONTENTS_METHOD;
  private static final SubLSymbol $sym95$BASIC_SEQUENCE_ADD_METHOD;
  private static final SubLSymbol $sym96$SET_INTERNAL_STORAGE;
  private static final SubLSymbol $sym97$BASIC_SEQUENCE_GET_SUBSEQUENCE_METHOD;
  private static final SubLSymbol $sym98$BASIC_SEQUENCE_SET_NTH_METHOD;
  private static final SubLSymbol $sym99$BASIC_SEQUENCE_GET_NTH_METHOD;
  private static final SubLSymbol $sym100$BASIC_SEQUENCE_GET_LENGTH_METHOD;
  private static final SubLSymbol $sym101$BASIC_SEQUENCE_CLEAR_METHOD;
  private static final SubLSymbol $sym102$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_CLASS;
  private static final SubLSymbol $sym103$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_INSTANCE;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD;
  private static final SubLSymbol $sym106$BASIC_SEQUENCE_INITIALIZE_METHOD;
  private static final SubLSymbol $sym107$PRINT;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD;
  private static final SubLString $str111$__;
  private static final SubLString $str112$__S_;
  private static final SubLString $str113$__S;
  private static final SubLString $str114$___S;
  private static final SubLString $str115$_;
  private static final SubLSymbol $sym116$BASIC_SEQUENCE_PRINT_METHOD;
  private static final SubLSymbol $sym117$GET_INTERNAL_STORAGE;
  private static final SubLList $list118;
  private static final SubLSymbol $sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD;
  private static final SubLSymbol $sym120$BASIC_SEQUENCE_GET_INTERNAL_STORAGE_METHOD;
  private static final SubLList $list121;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD;
  private static final SubLString $str124$_SET_INTERNAL_STORAGE__S____S_is_;
  private static final SubLSymbol $sym125$BASIC_SEQUENCE_SET_INTERNAL_STORAGE_METHOD;
  private static final SubLSymbol $sym126$GET_SEQUENCE_CLASS;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD;
  private static final SubLSymbol $sym129$BASIC_SEQUENCE_GET_SEQUENCE_CLASS_METHOD;
  private static final SubLSymbol $sym130$SET_SEQUENCE_CLASS;
  private static final SubLList $list131;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD;
  private static final SubLString $str134$_SET_SEQUENCE_CLASS__S____S_is_no;
  private static final SubLSymbol $sym135$BASIC_SEQUENCE_SET_SEQUENCE_CLASS_METHOD;
  private static final SubLSymbol $sym136$VARIABLE_LENGTH_SEQUENCE;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE;
  private static final SubLList $list139;
  private static final SubLList $list140;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLList $list143;
  private static final SubLList $list144;
  private static final SubLList $list145;
  private static final SubLList $list146;
  private static final SubLList $list147;
  private static final SubLList $list148;
  private static final SubLList $list149;
  private static final SubLList $list150;
  private static final SubLSymbol $sym151$ALL_NULL_P;
  private static final SubLList $list152;
  private static final SubLSymbol $sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT;
  private static final SubLList $list154;
  private static final SubLList $list155;
  private static final SubLSymbol $sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT;
  private static final SubLList $list157;
  private static final SubLSymbol $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$IGNORE_NULL_VALUES;
  private static final SubLInteger $int161$4097;
  private static final SubLSymbol $sym162$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER;
  private static final SubLSymbol $sym163$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER;
  private static final SubLList $list164;
  private static final SubLSymbol $sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym166$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD;
  private static final SubLSymbol $sym167$SEEK_NON_NULL_FORWARD;
  private static final SubLList $list168;
  private static final SubLSymbol $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym170$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_FORWARD_M;
  private static final SubLSymbol $sym171$SEEK_NON_NULL_BACKWARD;
  private static final SubLList $list172;
  private static final SubLSymbol $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym174$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_BACKWARD_;
  private static final SubLSymbol $sym175$SET_SEQUENCE;
  private static final SubLList $list176;
  private static final SubLList $list177;
  private static final SubLSymbol $sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLString $str179$_SET_SEQUENCE__S____S_is_not_an_i;
  private static final SubLSymbol $sym180$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_SEQUENCE_METHOD;
  private static final SubLSymbol $sym181$GET_IGNORE_NULL_VALUES;
  private static final SubLList $list182;
  private static final SubLList $list183;
  private static final SubLSymbol $sym184$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_GET_IGNORE_NULL_VALUES_;
  private static final SubLSymbol $sym185$SET_IGNORE_NULL_VALUES;
  private static final SubLList $list186;
  private static final SubLList $list187;
  private static final SubLSymbol $sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym189$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_IGNORE_NULL_VALUES_;
  private static final SubLList $list190;
  private static final SubLSymbol $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym192$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD;
  private static final SubLList $list193;
  private static final SubLSymbol $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym195$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_P_METHOD;
  private static final SubLList $list196;
  private static final SubLSymbol $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym198$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_P_METHOD;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym201$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_CURRENT_METHOD;
  private static final SubLList $list202;
  private static final SubLSymbol $sym203$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_METHOD;
  private static final SubLList $list204;
  private static final SubLSymbol $sym205$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_METHOD;
  private static final SubLList $list206;
  private static final SubLSymbol $sym207$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_NEXT_METHOD;
  private static final SubLList $list208;
  private static final SubLSymbol $sym209$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD;
  private static final SubLSymbol $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE;
  private static final SubLList $list211;
  private static final SubLList $list212;
  private static final SubLSymbol $sym213$GROWTH_FACTOR;
  private static final SubLSymbol $sym214$DEFAULT_VALUE;
  private static final SubLSymbol $sym215$LARGEST_INDEX;
  private static final SubLSymbol $sym216$STORAGE_SIZE;
  private static final SubLSymbol $sym217$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_PREVIOUS_NON_NIL_ELEMENT_;
  private static final SubLSymbol $sym218$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_NEXT_NON_NIL_ELEMENT_METH;
  private static final SubLSymbol $sym219$BASIC_VARIABLE_LENGTH_SEQUENCE_ALL_NULL_P_METHOD;
  private static final SubLString $str220$_DEALLOCATE_ENUMERATOR__S____S_is;
  private static final SubLSymbol $sym221$BASIC_VARIABLE_LENGTH_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym222$BASIC_VARIABLE_LENGTH_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD;
  private static final SubLSymbol $sym223$BASIC_VARIABLE_LENGTH_SEQUENCE_ADD_METHOD;
  private static final SubLString $str224$_GET_SUBSEQUENCE__S___Index__S_is;
  private static final SubLString $str225$_GET_SUBSEQUENCE__S___End_index__;
  private static final SubLSymbol $sym226$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SUBSEQUENCE_METHOD;
  private static final SubLString $str227$_SET_NTH__S___Index__S_is_less_th;
  private static final SubLSymbol $sym228$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_NTH_METHOD;
  private static final SubLSymbol $sym229$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_NTH_METHOD;
  private static final SubLSymbol $sym230$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LENGTH_METHOD;
  private static final SubLSymbol $sym231$BASIC_VARIABLE_LENGTH_SEQUENCE_CLEAR_METHOD;
  private static final SubLSymbol $sym232$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_CLASS;
  private static final SubLSymbol $sym233$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_INSTAN;
  private static final SubLList $list234;
  private static final SubLSymbol $sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym236$BASIC_VARIABLE_LENGTH_SEQUENCE_INITIALIZE_METHOD;
  private static final SubLList $list237;
  private static final SubLSymbol $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLString $str239$__BASIC_VARIABLE_LENGTH_SEQUENCE_;
  private static final SubLSymbol $sym240$BASIC_VARIABLE_LENGTH_SEQUENCE_PRINT_METHOD;
  private static final SubLSymbol $sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym242$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_INTERNAL_STORAGE_METHOD;
  private static final SubLList $list243;
  private static final SubLSymbol $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym245$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_CONTENTS_METHOD;
  private static final SubLList $list246;
  private static final SubLSymbol $sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLString $str248$_SET_INTERNAL_STORAGE__S____S_is_;
  private static final SubLSymbol $sym249$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_INTERNAL_STORAGE_METHOD;
  private static final SubLSymbol $sym250$GET_STORAGE_SIZE;
  private static final SubLList $list251;
  private static final SubLSymbol $sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym253$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_STORAGE_SIZE_METHOD;
  private static final SubLSymbol $sym254$SET_STORAGE_SIZE;
  private static final SubLList $list255;
  private static final SubLList $list256;
  private static final SubLSymbol $sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLString $str258$_SET_STORAGE_SIZE__S____S_is_not_;
  private static final SubLSymbol $sym259$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_STORAGE_SIZE_METHOD;
  private static final SubLSymbol $sym260$GET_LARGEST_INDEX;
  private static final SubLList $list261;
  private static final SubLSymbol $sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym263$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LARGEST_INDEX_METHOD;
  private static final SubLSymbol $sym264$SET_LARGEST_INDEX;
  private static final SubLList $list265;
  private static final SubLList $list266;
  private static final SubLSymbol $sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym268$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_LARGEST_INDEX_METHOD;
  private static final SubLSymbol $sym269$RECORD_INDEX;
  private static final SubLList $list270;
  private static final SubLList $list271;
  private static final SubLSymbol $sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLString $str273$_RECORD_INDEX__S____S_is_not_a_va;
  private static final SubLSymbol $sym274$BASIC_VARIABLE_LENGTH_SEQUENCE_RECORD_INDEX_METHOD;
  private static final SubLSymbol $sym275$GET_DEFAULT_VALUE;
  private static final SubLList $list276;
  private static final SubLSymbol $sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym278$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_DEFAULT_VALUE_METHOD;
  private static final SubLSymbol $sym279$SET_DEFAULT_VALUE;
  private static final SubLList $list280;
  private static final SubLList $list281;
  private static final SubLSymbol $sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym283$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_DEFAULT_VALUE_METHOD;
  private static final SubLSymbol $sym284$GET_GROWTH_FACTOR;
  private static final SubLList $list285;
  private static final SubLSymbol $sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym287$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_GROWTH_FACTOR_METHOD;
  private static final SubLSymbol $sym288$SET_GROWTH_FACTOR;
  private static final SubLList $list289;
  private static final SubLList $list290;
  private static final SubLSymbol $sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLFloat $float292$1_0;
  private static final SubLString $str293$_SET_GROWTH_FACTOR__S____S_is_not;
  private static final SubLSymbol $sym294$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_GROWTH_FACTOR_METHOD;
  private static final SubLSymbol $sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLSymbol $sym296$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SEQUENCE_CLASS_METHOD;
  private static final SubLList $list297;
  private static final SubLSymbol $sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD;
  private static final SubLString $str299$_SET_SEQUENCE_CLASS__S____S_is_no;
  private static final SubLSymbol $sym300$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_SEQUENCE_CLASS_METHOD;
  private static final SubLSymbol $sym301$FIXED_LENGTH_SEQUENCE;
  private static final SubLList $list302;

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 789L)
  public static SubLObject sequence_element_template_p(final SubLObject sequence_element_template)
  {
    return interfaces.subloop_instanceof_interface( sequence_element_template, $sym0$SEQUENCE_ELEMENT_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 1585L)
  public static SubLObject sequence_p(final SubLObject sequence)
  {
    return interfaces.subloop_instanceof_interface( sequence, $sym2$SEQUENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 2570L)
  public static SubLObject sequence_template_p(final SubLObject sequence_template)
  {
    return interfaces.subloop_instanceof_interface( sequence_template, $sym7$SEQUENCE_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
  public static SubLObject get_basic_sequence_enumerator_current_index(final SubLObject basic_sequence_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_sequence_enumerator, THREE_INTEGER, $sym36$CURRENT_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
  public static SubLObject set_basic_sequence_enumerator_current_index(final SubLObject basic_sequence_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_sequence_enumerator, value, THREE_INTEGER, $sym36$CURRENT_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
  public static SubLObject get_basic_sequence_enumerator_length(final SubLObject basic_sequence_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_sequence_enumerator, TWO_INTEGER, $sym37$LENGTH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
  public static SubLObject set_basic_sequence_enumerator_length(final SubLObject basic_sequence_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_sequence_enumerator, value, TWO_INTEGER, $sym37$LENGTH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
  public static SubLObject get_basic_sequence_enumerator_shared_storage(final SubLObject basic_sequence_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_sequence_enumerator, ONE_INTEGER, $sym38$SHARED_STORAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
  public static SubLObject set_basic_sequence_enumerator_shared_storage(final SubLObject basic_sequence_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_sequence_enumerator, value, ONE_INTEGER, $sym38$SHARED_STORAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
  public static SubLObject subloop_reserved_initialize_basic_sequence_enumerator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym39$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
  public static SubLObject subloop_reserved_initialize_basic_sequence_enumerator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym41$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym42$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym38$SHARED_STORAGE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym37$LENGTH, NIL );
    classes.subloop_initialize_slot( new_instance, $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym36$CURRENT_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
  public static SubLObject basic_sequence_enumerator_p(final SubLObject basic_sequence_enumerator)
  {
    return classes.subloop_instanceof_class( basic_sequence_enumerator, $sym32$BASIC_SEQUENCE_ENUMERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6925L)
  public static SubLObject basic_sequence_enumerator_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
    SubLObject current_index = get_basic_sequence_enumerator_current_index( self );
    SubLObject length = get_basic_sequence_enumerator_length( self );
    SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage( self );
    try
    {
      thread.throwStack.push( $sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        object.object_initialize_method( self );
        shared_storage = NIL;
        length = MINUS_ONE_INTEGER;
        current_index = ZERO_INTEGER;
        Dynamic.sublisp_throw( $sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_enumerator_current_index( self, current_index );
          set_basic_sequence_enumerator_length( self, length );
          set_basic_sequence_enumerator_shared_storage( self, shared_storage );
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
      catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7109L)
  public static SubLObject basic_sequence_enumerator_set_shared_storage_method(final SubLObject self, final SubLObject new_shared_storage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
    SubLObject current_index = get_basic_sequence_enumerator_current_index( self );
    SubLObject length = get_basic_sequence_enumerator_length( self );
    SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage( self );
    try
    {
      thread.throwStack.push( $sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !new_shared_storage.isList() )
        {
          Errors.error( $str53$_SET_SHARED_STORAGE__S____S_is_no, self, new_shared_storage );
        }
        shared_storage = new_shared_storage;
        current_index = ZERO_INTEGER;
        length = Sequences.length( shared_storage );
        Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, new_shared_storage );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_enumerator_current_index( self, current_index );
          set_basic_sequence_enumerator_length( self, length );
          set_basic_sequence_enumerator_shared_storage( self, shared_storage );
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
      catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7459L)
  public static SubLObject basic_sequence_enumerator_empty_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
    final SubLObject length = get_basic_sequence_enumerator_length( self );
    try
    {
      thread.throwStack.push( $sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, Numbers.numLE( length, ZERO_INTEGER ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_enumerator_length( self, length );
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
      catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7551L)
  public static SubLObject basic_sequence_enumerator_first_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
    final SubLObject current_index = get_basic_sequence_enumerator_current_index( self );
    try
    {
      thread.throwStack.push( $sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE( current_index, ZERO_INTEGER ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_enumerator_current_index( self, current_index );
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
      catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7649L)
  public static SubLObject basic_sequence_enumerator_last_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
    final SubLObject current_index = get_basic_sequence_enumerator_current_index( self );
    final SubLObject length = get_basic_sequence_enumerator_length( self );
    try
    {
      thread.throwStack.push( $sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE( current_index, Numbers.subtract( length, ONE_INTEGER ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_enumerator_current_index( self, current_index );
          set_basic_sequence_enumerator_length( self, length );
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
      catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7757L)
  public static SubLObject basic_sequence_enumerator_current_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
    final SubLObject current_index = get_basic_sequence_enumerator_current_index( self );
    final SubLObject length = get_basic_sequence_enumerator_length( self );
    final SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage( self );
    try
    {
      thread.throwStack.push( $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( current_index.numGE( ZERO_INTEGER ) && current_index.numL( length ) )
        {
          Dynamic.sublisp_throw( $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, ConsesLow.nth( current_index, shared_storage ) );
        }
        Dynamic.sublisp_throw( $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_enumerator_current_index( self, current_index );
          set_basic_sequence_enumerator_length( self, length );
          set_basic_sequence_enumerator_shared_storage( self, shared_storage );
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
      catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7947L)
  public static SubLObject basic_sequence_enumerator_first_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
    SubLObject current_index = get_basic_sequence_enumerator_current_index( self );
    final SubLObject length = get_basic_sequence_enumerator_length( self );
    final SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage( self );
    try
    {
      thread.throwStack.push( $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( length.numGE( ZERO_INTEGER ) )
        {
          current_index = ZERO_INTEGER;
          Dynamic.sublisp_throw( $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, ConsesLow.nth( ZERO_INTEGER, shared_storage ) );
        }
        Dynamic.sublisp_throw( $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_enumerator_current_index( self, current_index );
          set_basic_sequence_enumerator_length( self, length );
          set_basic_sequence_enumerator_shared_storage( self, shared_storage );
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
      catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8112L)
  public static SubLObject basic_sequence_enumerator_last_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_enumerator_method = NIL;
    SubLObject current_index = get_basic_sequence_enumerator_current_index( self );
    final SubLObject length = get_basic_sequence_enumerator_length( self );
    final SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage( self );
    try
    {
      thread.throwStack.push( $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( length.numGE( ZERO_INTEGER ) )
        {
          current_index = Numbers.subtract( length, ONE_INTEGER );
          Dynamic.sublisp_throw( $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, ConsesLow.nth( current_index, shared_storage ) );
        }
        Dynamic.sublisp_throw( $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_enumerator_current_index( self, current_index );
          set_basic_sequence_enumerator_length( self, length );
          set_basic_sequence_enumerator_shared_storage( self, shared_storage );
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
      catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8299L)
  public static SubLObject basic_sequence_enumerator_next_method(final SubLObject self)
  {
    SubLObject current_index = get_basic_sequence_enumerator_current_index( self );
    final SubLObject length = get_basic_sequence_enumerator_length( self );
    if( current_index.numGE( length ) )
    {
      return NIL;
    }
    current_index = Numbers.add( current_index, ONE_INTEGER );
    set_basic_sequence_enumerator_current_index( self, current_index );
    return basic_sequence_enumerator_current_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8471L)
  public static SubLObject basic_sequence_enumerator_previous_method(final SubLObject self)
  {
    SubLObject current_index = get_basic_sequence_enumerator_current_index( self );
    if( current_index.numLE( ZERO_INTEGER ) )
    {
      return NIL;
    }
    current_index = Numbers.subtract( current_index, ONE_INTEGER );
    set_basic_sequence_enumerator_current_index( self, current_index );
    return basic_sequence_enumerator_current_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject get_basic_sequence_sequence_class(final SubLObject basic_sequence)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_sequence, TWO_INTEGER, $sym89$SEQUENCE_CLASS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject set_basic_sequence_sequence_class(final SubLObject basic_sequence, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_sequence, value, TWO_INTEGER, $sym89$SEQUENCE_CLASS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject get_basic_sequence_internal_storage(final SubLObject basic_sequence)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_sequence, ONE_INTEGER, $sym90$INTERNAL_STORAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject set_basic_sequence_internal_storage(final SubLObject basic_sequence, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_sequence, value, ONE_INTEGER, $sym90$INTERNAL_STORAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_deallocate_enumerator_method(final SubLObject self, final SubLObject old_enumerator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == basic_sequence_enumerator_p( old_enumerator ) )
    {
      Errors.error( $str91$_DEALLOCATE_ENUMERATOR__S____S_is, self, old_enumerator );
    }
    basic_sequence_enumerator_set_shared_storage_method( old_enumerator, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_allocate_enumerator_method(final SubLObject self)
  {
    final SubLObject template_internal_storage = basic_sequence_get_internal_storage_method( self );
    if( NIL != template_internal_storage )
    {
      final SubLObject template_enumerator = object.new_class_instance( $sym32$BASIC_SEQUENCE_ENUMERATOR );
      basic_sequence_enumerator_set_shared_storage_method( template_enumerator, template_internal_storage );
      return template_enumerator;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_get_contents_method(final SubLObject self)
  {
    SubLObject list_of_contents = NIL;
    SubLObject cdotimes_end_var;
    SubLObject index;
    for( cdotimes_end_var = basic_sequence_get_length_method( self ), index = NIL, index = ZERO_INTEGER; index.numL( cdotimes_end_var ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      list_of_contents = ConsesLow.cons( basic_sequence_get_nth_method( self, index, UNPROVIDED ), list_of_contents );
    }
    return Sequences.nreverse( list_of_contents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_add_method(final SubLObject self, final SubLObject new_element)
  {
    final SubLObject template_internal_storage = basic_sequence_get_internal_storage_method( self );
    if( NIL == template_internal_storage )
    {
      basic_sequence_set_internal_storage_method( self, ConsesLow.list( new_element ) );
      return new_element;
    }
    final SubLObject template_last_cons = conses_high.last( template_internal_storage, UNPROVIDED );
    ConsesLow.rplacd( template_last_cons, ConsesLow.list( new_element ) );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_get_subsequence_method(final SubLObject self, final SubLObject start_index, SubLObject end_index)
  {
    if( end_index == UNPROVIDED )
    {
      end_index = NIL;
    }
    final SubLObject template_class = basic_sequence_get_sequence_class_method( self );
    final SubLObject template_instance = object.new_object_instance( template_class );
    final SubLObject template_sublist = conses_high.nthcdr( start_index, basic_sequence_get_internal_storage_method( self ) );
    if( NIL != end_index )
    {
      SubLObject template_new_storage = NIL;
      SubLObject template_pointer = template_sublist;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.subtract( end_index, start_index ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        template_new_storage = ConsesLow.cons( template_pointer.first(), template_new_storage );
        template_pointer = template_pointer.rest();
      }
      methods.funcall_instance_method_with_1_args( template_instance, $sym96$SET_INTERNAL_STORAGE, Sequences.nreverse( template_new_storage ) );
    }
    else
    {
      methods.funcall_instance_method_with_1_args( template_instance, $sym96$SET_INTERNAL_STORAGE, conses_high.copy_list( template_sublist ) );
    }
    return template_instance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_set_nth_method(final SubLObject self, final SubLObject n, final SubLObject new_value)
  {
    ConsesLow.set_nth( n, basic_sequence_get_internal_storage_method( self ), new_value );
    return new_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_get_nth_method(final SubLObject self, final SubLObject n, SubLObject out_of_range_value)
  {
    if( out_of_range_value == UNPROVIDED )
    {
      out_of_range_value = NIL;
    }
    if( n.numL( ZERO_INTEGER ) )
    {
      return out_of_range_value;
    }
    SubLObject template_current_cons = basic_sequence_get_internal_storage_method( self );
    SubLObject template_index = ZERO_INTEGER;
    while ( NIL != template_current_cons)
    {
      if( n.numE( template_index ) )
      {
        return template_current_cons.first();
      }
      template_index = Numbers.add( template_index, ONE_INTEGER );
      template_current_cons = template_current_cons.rest();
    }
    return out_of_range_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_get_length_method(final SubLObject self)
  {
    return Sequences.length( basic_sequence_get_internal_storage_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_clear_method(final SubLObject self)
  {
    basic_sequence_set_internal_storage_method( self, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject subloop_reserved_initialize_basic_sequence_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym39$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject subloop_reserved_initialize_basic_sequence_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym41$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym42$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym86$BASIC_SEQUENCE, $sym90$INTERNAL_STORAGE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym86$BASIC_SEQUENCE, $sym89$SEQUENCE_CLASS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
  public static SubLObject basic_sequence_p(final SubLObject basic_sequence)
  {
    return classes.subloop_instanceof_class( basic_sequence, $sym86$BASIC_SEQUENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 9907L)
  public static SubLObject basic_sequence_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_method = NIL;
    SubLObject sequence_class = get_basic_sequence_sequence_class( self );
    SubLObject internal_storage = get_basic_sequence_internal_storage( self );
    try
    {
      thread.throwStack.push( $sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
      try
      {
        object.object_initialize_method( self );
        internal_storage = NIL;
        sequence_class = $sym86$BASIC_SEQUENCE;
        Dynamic.sublisp_throw( $sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_sequence_class( self, sequence_class );
          set_basic_sequence_internal_storage( self, internal_storage );
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
      catch_var_for_basic_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10078L)
  public static SubLObject basic_sequence_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_method = NIL;
    final SubLObject internal_storage = get_basic_sequence_internal_storage( self );
    try
    {
      thread.throwStack.push( $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
      try
      {
        if( NIL == internal_storage )
        {
          PrintLow.format( stream, $str111$__ );
          Dynamic.sublisp_throw( $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self );
        }
        if( NIL == internal_storage.rest() )
        {
          PrintLow.format( stream, $str112$__S_, internal_storage.first() );
          Dynamic.sublisp_throw( $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self );
        }
        PrintLow.format( stream, $str113$__S, internal_storage.first() );
        SubLObject cdolist_list_var = internal_storage.rest();
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( stream, $str114$___S, element );
          cdolist_list_var = cdolist_list_var.rest();
          element = cdolist_list_var.first();
        }
        PrintLow.format( stream, $str115$_ );
        Dynamic.sublisp_throw( $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_internal_storage( self, internal_storage );
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
      catch_var_for_basic_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10505L)
  public static SubLObject basic_sequence_get_internal_storage_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_method = NIL;
    final SubLObject internal_storage = get_basic_sequence_internal_storage( self );
    try
    {
      thread.throwStack.push( $sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, internal_storage );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_internal_storage( self, internal_storage );
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
      catch_var_for_basic_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10605L)
  public static SubLObject basic_sequence_set_internal_storage_method(final SubLObject self, final SubLObject new_internal_storage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_method = NIL;
    SubLObject internal_storage = get_basic_sequence_internal_storage( self );
    try
    {
      thread.throwStack.push( $sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !new_internal_storage.isList() )
        {
          Errors.error( $str124$_SET_INTERNAL_STORAGE__S____S_is_, self, new_internal_storage );
        }
        internal_storage = new_internal_storage;
        Dynamic.sublisp_throw( $sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, new_internal_storage );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_internal_storage( self, internal_storage );
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
      catch_var_for_basic_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10896L)
  public static SubLObject basic_sequence_get_sequence_class_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_method = NIL;
    final SubLObject sequence_class = get_basic_sequence_sequence_class( self );
    try
    {
      thread.throwStack.push( $sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, sequence_class );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_sequence_class( self, sequence_class );
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
      catch_var_for_basic_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10989L)
  public static SubLObject basic_sequence_set_sequence_class_method(final SubLObject self, final SubLObject new_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_sequence_method = NIL;
    SubLObject sequence_class = get_basic_sequence_sequence_class( self );
    try
    {
      thread.throwStack.push( $sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_class && ( !new_class.isSymbol() || NIL == classes.subclassp( new_class, $sym86$BASIC_SEQUENCE ) ) )
        {
          Errors.error( $str134$_SET_SEQUENCE_CLASS__S____S_is_no, self, new_class );
        }
        sequence_class = new_class;
        Dynamic.sublisp_throw( $sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, new_class );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_sequence_sequence_class( self, sequence_class );
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
      catch_var_for_basic_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 11319L)
  public static SubLObject variable_length_sequence_p(final SubLObject variable_length_sequence)
  {
    return interfaces.subloop_instanceof_interface( variable_length_sequence, $sym136$VARIABLE_LENGTH_SEQUENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 11637L)
  public static SubLObject variable_length_sequence_template_p(final SubLObject variable_length_sequence_template)
  {
    return interfaces.subloop_instanceof_interface( variable_length_sequence_template, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
  public static SubLObject get_basic_variable_length_sequence_enumerator_current_index(final SubLObject basic_variable_length_sequence_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_variable_length_sequence_enumerator, TWO_INTEGER, $sym36$CURRENT_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
  public static SubLObject set_basic_variable_length_sequence_enumerator_current_index(final SubLObject basic_variable_length_sequence_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_variable_length_sequence_enumerator, value, TWO_INTEGER, $sym36$CURRENT_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
  public static SubLObject get_basic_variable_length_sequence_enumerator_sequence(final SubLObject basic_variable_length_sequence_enumerator)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_variable_length_sequence_enumerator, ONE_INTEGER, $sym2$SEQUENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
  public static SubLObject set_basic_variable_length_sequence_enumerator_sequence(final SubLObject basic_variable_length_sequence_enumerator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_variable_length_sequence_enumerator, value, ONE_INTEGER, $sym2$SEQUENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
  public static SubLObject get_basic_variable_length_sequence_enumerator_ignore_null_values(final SubLObject basic_variable_length_sequence_enumerator)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_variable_length_sequence_enumerator );
    final SubLObject slot = slots.slot_assoc( $sym160$IGNORE_NULL_VALUES, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_variable_length_sequence_enumerator, slot );
    return classes.ldb_test( $int161$4097, subloop_structures.instance_boolean_slots( basic_variable_length_sequence_enumerator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
  public static SubLObject set_basic_variable_length_sequence_enumerator_ignore_null_values(final SubLObject basic_variable_length_sequence_enumerator, final SubLObject value)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_variable_length_sequence_enumerator );
    final SubLObject slot = slots.slot_assoc( $sym160$IGNORE_NULL_VALUES, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_variable_length_sequence_enumerator, slot );
    subloop_structures._csetf_instance_boolean_slots( basic_variable_length_sequence_enumerator, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, $int161$4097, subloop_structures.instance_boolean_slots(
        basic_variable_length_sequence_enumerator ) ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
  public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym39$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
  public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_enumerator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym41$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym160$IGNORE_NULL_VALUES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym42$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym2$SEQUENCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym36$CURRENT_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
  public static SubLObject basic_variable_length_sequence_enumerator_p(final SubLObject basic_variable_length_sequence_enumerator)
  {
    return classes.subloop_instanceof_class( basic_variable_length_sequence_enumerator, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 19597L)
  public static SubLObject basic_variable_length_sequence_enumerator_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
    SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    try
    {
      thread.throwStack.push( $sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        object.object_initialize_method( self );
        sequence = NIL;
        current_index = ZERO_INTEGER;
        ignore_null_values = T;
        Dynamic.sublisp_throw( $sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
          set_basic_variable_length_sequence_enumerator_sequence( self, sequence );
          set_basic_variable_length_sequence_enumerator_ignore_null_values( self, ignore_null_values );
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
      catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 19803L)
  public static SubLObject basic_variable_length_sequence_enumerator_seek_non_null_forward_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
    SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    try
    {
      thread.throwStack.push( $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        final SubLObject current_length = methods.funcall_instance_method_with_0_args( sequence, $sym37$LENGTH );
        if( current_index.numGE( current_length ) )
        {
          Dynamic.sublisp_throw( $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL );
        }
        for( SubLObject index = current_index; index.numL( current_length ); index = Numbers.add( index, ONE_INTEGER ) )
        {
          if( NIL != methods.funcall_instance_method_with_1_args( sequence, $sym15$GET_NTH, index ) )
          {
            current_index = index;
            Dynamic.sublisp_throw( $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, T );
          }
        }
        Dynamic.sublisp_throw( $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
          set_basic_variable_length_sequence_enumerator_sequence( self, sequence );
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
      catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 20244L)
  public static SubLObject basic_variable_length_sequence_enumerator_seek_non_null_backward_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
    SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    try
    {
      thread.throwStack.push( $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( current_index.numE( ZERO_INTEGER ) )
        {
          Dynamic.sublisp_throw( $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL );
        }
        for( SubLObject index = current_index; index.numGE( ZERO_INTEGER ); index = Numbers.subtract( index, ONE_INTEGER ) )
        {
          if( NIL != methods.funcall_instance_method_with_1_args( sequence, $sym15$GET_NTH, index ) )
          {
            current_index = index;
            Dynamic.sublisp_throw( $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, T );
          }
        }
        Dynamic.sublisp_throw( $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
          set_basic_variable_length_sequence_enumerator_sequence( self, sequence );
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
      catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 20585L)
  public static SubLObject basic_variable_length_sequence_enumerator_set_sequence_method(final SubLObject self, final SubLObject new_sequence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
    SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    try
    {
      thread.throwStack.push( $sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_sequence && NIL == variable_length_sequence_template_p( new_sequence ) )
        {
          Errors.error( $str179$_SET_SEQUENCE__S____S_is_not_an_i, self, new_sequence );
        }
        sequence = new_sequence;
        current_index = ZERO_INTEGER;
        Dynamic.sublisp_throw( $sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
          set_basic_variable_length_sequence_enumerator_sequence( self, sequence );
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
      catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 20982L)
  public static SubLObject basic_variable_length_sequence_enumerator_get_ignore_null_values_method(final SubLObject self)
  {
    final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    return ignore_null_values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 21121L)
  public static SubLObject basic_variable_length_sequence_enumerator_set_ignore_null_values_method(final SubLObject self, final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
    SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    try
    {
      thread.throwStack.push( $sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        ignore_null_values = ( NIL != new_value ) ? T : NIL;
        Dynamic.sublisp_throw( $sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, ignore_null_values );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_enumerator_ignore_null_values( self, ignore_null_values );
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
      catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 21309L)
  public static SubLObject basic_variable_length_sequence_enumerator_empty_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    try
    {
      thread.throwStack.push( $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( NIL == sequence )
        {
          Dynamic.sublisp_throw( $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, T );
        }
        if( NIL != ignore_null_values )
        {
          Dynamic.sublisp_throw( $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, methods.funcall_instance_method_with_0_args( sequence, $sym151$ALL_NULL_P ) );
        }
        else
        {
          Dynamic.sublisp_throw( $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE( methods.funcall_instance_method_with_0_args( sequence, $sym13$GET_LENGTH ), ZERO_INTEGER ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_enumerator_sequence( self, sequence );
          set_basic_variable_length_sequence_enumerator_ignore_null_values( self, ignore_null_values );
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
      catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 21577L)
  public static SubLObject basic_variable_length_sequence_enumerator_first_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
    final SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    try
    {
      thread.throwStack.push( $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( NIL == sequence )
        {
          Dynamic.sublisp_throw( $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL );
        }
        if( NIL != ignore_null_values )
        {
          Dynamic.sublisp_throw( $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE( current_index, methods.funcall_instance_method_with_1_args( sequence,
              $sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, ZERO_INTEGER ) ) );
        }
        else
        {
          Dynamic.sublisp_throw( $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE( current_index, ZERO_INTEGER ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
          set_basic_variable_length_sequence_enumerator_sequence( self, sequence );
          set_basic_variable_length_sequence_enumerator_ignore_null_values( self, ignore_null_values );
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
      catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 21853L)
  public static SubLObject basic_variable_length_sequence_enumerator_last_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
    final SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    try
    {
      thread.throwStack.push( $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( NIL == sequence )
        {
          Dynamic.sublisp_throw( $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL );
        }
        final SubLObject length = methods.funcall_instance_method_with_0_args( sequence, $sym13$GET_LENGTH );
        if( NIL != ignore_null_values )
        {
          Dynamic.sublisp_throw( $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE( current_index, methods.funcall_instance_method_with_1_args( sequence,
              $sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, length ) ) );
        }
        else
        {
          Dynamic.sublisp_throw( $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE( current_index, Numbers.subtract( length, ONE_INTEGER ) ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
          set_basic_variable_length_sequence_enumerator_sequence( self, sequence );
          set_basic_variable_length_sequence_enumerator_ignore_null_values( self, ignore_null_values );
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
      catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 22207L)
  public static SubLObject basic_variable_length_sequence_enumerator_current_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = NIL;
    final SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    try
    {
      thread.throwStack.push( $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
      try
      {
        if( NIL == sequence )
        {
          Dynamic.sublisp_throw( $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL );
        }
        final SubLObject length = methods.funcall_instance_method_with_0_args( sequence, $sym13$GET_LENGTH );
        if( current_index.numGE( ZERO_INTEGER ) && current_index.numL( length ) )
        {
          Dynamic.sublisp_throw( $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, methods.funcall_instance_method_with_1_args( sequence, $sym15$GET_NTH, current_index ) );
        }
        Dynamic.sublisp_throw( $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
          set_basic_variable_length_sequence_enumerator_sequence( self, sequence );
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
      catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable( ccatch_env_var, $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_enumerator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 22538L)
  public static SubLObject basic_variable_length_sequence_enumerator_first_method(final SubLObject self)
  {
    SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    if( NIL == ignore_null_values )
    {
      current_index = ZERO_INTEGER;
      set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
      return basic_variable_length_sequence_enumerator_current_method( self );
    }
    final SubLObject first_index = methods.funcall_instance_method_with_1_args( sequence, $sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, ZERO_INTEGER );
    if( NIL != first_index )
    {
      current_index = first_index;
      set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
      return basic_variable_length_sequence_enumerator_current_method( self );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 22943L)
  public static SubLObject basic_variable_length_sequence_enumerator_last_method(final SubLObject self)
  {
    SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    if( NIL == sequence )
    {
      return NIL;
    }
    final SubLObject length = methods.funcall_instance_method_with_0_args( sequence, $sym13$GET_LENGTH );
    if( NIL == ignore_null_values )
    {
      current_index = Numbers.subtract( length, ONE_INTEGER );
      set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
      return basic_variable_length_sequence_enumerator_current_method( self );
    }
    final SubLObject last_index = methods.funcall_instance_method_with_1_args( sequence, $sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, length );
    if( NIL != last_index )
    {
      current_index = last_index;
      set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
      return basic_variable_length_sequence_enumerator_current_method( self );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 23446L)
  public static SubLObject basic_variable_length_sequence_enumerator_next_method(final SubLObject self)
  {
    SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    if( NIL == sequence )
    {
      return NIL;
    }
    final SubLObject length = methods.funcall_instance_method_with_0_args( sequence, $sym13$GET_LENGTH );
    if( current_index.numGE( length ) )
    {
      return NIL;
    }
    if( NIL == ignore_null_values )
    {
      current_index = Numbers.add( current_index, ONE_INTEGER );
      set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
      return basic_variable_length_sequence_enumerator_current_method( self );
    }
    final SubLObject next_index = methods.funcall_instance_method_with_1_args( sequence, $sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, Numbers.add( current_index, ONE_INTEGER ) );
    if( NIL != next_index )
    {
      current_index = next_index;
      set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
      return basic_variable_length_sequence_enumerator_current_method( self );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24005L)
  public static SubLObject basic_variable_length_sequence_enumerator_previous_method(final SubLObject self)
  {
    SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index( self );
    final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence( self );
    final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values( self );
    if( NIL == sequence )
    {
      return NIL;
    }
    if( current_index.numLE( ZERO_INTEGER ) )
    {
      return NIL;
    }
    if( NIL == ignore_null_values )
    {
      current_index = Numbers.subtract( current_index, ONE_INTEGER );
      set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
      return basic_variable_length_sequence_enumerator_current_method( self );
    }
    final SubLObject previous_index = methods.funcall_instance_method_with_1_args( sequence, $sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, Numbers.subtract( current_index, ONE_INTEGER ) );
    if( NIL != previous_index )
    {
      current_index = previous_index;
      set_basic_variable_length_sequence_enumerator_current_index( self, current_index );
      return basic_variable_length_sequence_enumerator_current_method( self );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject get_basic_variable_length_sequence_sequence_class(final SubLObject basic_variable_length_sequence)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_variable_length_sequence, SIX_INTEGER, $sym89$SEQUENCE_CLASS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject set_basic_variable_length_sequence_sequence_class(final SubLObject basic_variable_length_sequence, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_variable_length_sequence, value, SIX_INTEGER, $sym89$SEQUENCE_CLASS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject get_basic_variable_length_sequence_growth_factor(final SubLObject basic_variable_length_sequence)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_variable_length_sequence, FIVE_INTEGER, $sym213$GROWTH_FACTOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject set_basic_variable_length_sequence_growth_factor(final SubLObject basic_variable_length_sequence, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_variable_length_sequence, value, FIVE_INTEGER, $sym213$GROWTH_FACTOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject get_basic_variable_length_sequence_default_value(final SubLObject basic_variable_length_sequence)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_variable_length_sequence, FOUR_INTEGER, $sym214$DEFAULT_VALUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject set_basic_variable_length_sequence_default_value(final SubLObject basic_variable_length_sequence, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_variable_length_sequence, value, FOUR_INTEGER, $sym214$DEFAULT_VALUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject get_basic_variable_length_sequence_largest_index(final SubLObject basic_variable_length_sequence)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_variable_length_sequence, THREE_INTEGER, $sym215$LARGEST_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject set_basic_variable_length_sequence_largest_index(final SubLObject basic_variable_length_sequence, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_variable_length_sequence, value, THREE_INTEGER, $sym215$LARGEST_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject get_basic_variable_length_sequence_storage_size(final SubLObject basic_variable_length_sequence)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_variable_length_sequence, TWO_INTEGER, $sym216$STORAGE_SIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject set_basic_variable_length_sequence_storage_size(final SubLObject basic_variable_length_sequence, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_variable_length_sequence, value, TWO_INTEGER, $sym216$STORAGE_SIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject get_basic_variable_length_sequence_internal_storage(final SubLObject basic_variable_length_sequence)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_variable_length_sequence, ONE_INTEGER, $sym90$INTERNAL_STORAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject set_basic_variable_length_sequence_internal_storage(final SubLObject basic_variable_length_sequence, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_variable_length_sequence, value, ONE_INTEGER, $sym90$INTERNAL_STORAGE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_index_of_previous_non_nil_element_method(final SubLObject self, SubLObject start_index)
  {
    final SubLObject template_internal_storage = basic_variable_length_sequence_get_internal_storage_method( self );
    if( NIL == template_internal_storage )
    {
      return NIL;
    }
    final SubLObject template_length = basic_variable_length_sequence_get_length_method( self );
    if( template_length.isZero() )
    {
      return NIL;
    }
    SubLObject template_index;
    for( start_index = ( template_index = Numbers.min( Numbers.max( start_index, ZERO_INTEGER ), Numbers.subtract( template_length, ONE_INTEGER ) ) ); template_index.numGE( ZERO_INTEGER ); template_index = Numbers
        .subtract( template_index, ONE_INTEGER ) )
    {
      if( NIL != Vectors.aref( template_internal_storage, template_index ) )
      {
        return template_index;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_index_of_next_non_nil_element_method(final SubLObject self, SubLObject start_index)
  {
    final SubLObject template_internal_storage = basic_variable_length_sequence_get_internal_storage_method( self );
    if( NIL == template_internal_storage )
    {
      return NIL;
    }
    final SubLObject template_length = basic_variable_length_sequence_get_length_method( self );
    if( template_length.isZero() )
    {
      return NIL;
    }
    if( start_index.numGE( template_length ) )
    {
      return NIL;
    }
    SubLObject template_index;
    for( start_index = ( template_index = Numbers.min( Numbers.max( start_index, ZERO_INTEGER ), Numbers.subtract( template_length, ONE_INTEGER ) ) ); template_index.numL( template_length ); template_index = Numbers.add(
        template_index, ONE_INTEGER ) )
    {
      if( NIL != Vectors.aref( template_internal_storage, template_index ) )
      {
        return template_index;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_all_null_p_method(final SubLObject self)
  {
    final SubLObject template_storage = basic_variable_length_sequence_get_internal_storage_method( self );
    SubLObject template_length;
    SubLObject template_index;
    for( template_length = basic_variable_length_sequence_get_length_method( self ), template_index = NIL, template_index = ZERO_INTEGER; template_index.numL( template_length ); template_index = Numbers.add(
        template_index, ONE_INTEGER ) )
    {
      if( NIL != Vectors.aref( template_storage, template_index ) )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_deallocate_enumerator_method(final SubLObject self, final SubLObject old_enumerator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == basic_variable_length_sequence_enumerator_p( old_enumerator ) )
    {
      Errors.error( $str220$_DEALLOCATE_ENUMERATOR__S____S_is, self, old_enumerator );
    }
    basic_variable_length_sequence_enumerator_set_sequence_method( old_enumerator, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_allocate_enumerator_method(final SubLObject self)
  {
    final SubLObject template_enumerator = object.new_class_instance( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR );
    basic_variable_length_sequence_enumerator_set_sequence_method( template_enumerator, self );
    return template_enumerator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_add_method(final SubLObject self, final SubLObject new_element)
  {
    return basic_variable_length_sequence_set_nth_method( self, Numbers.add( basic_variable_length_sequence_get_largest_index_method( self ), ONE_INTEGER ), new_element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_get_subsequence_method(final SubLObject self, final SubLObject start_index, SubLObject end_index)
  {
    if( end_index == UNPROVIDED )
    {
      end_index = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !start_index.numGE( ZERO_INTEGER ) )
    {
      Errors.error( $str224$_GET_SUBSEQUENCE__S___Index__S_is, self, start_index );
    }
    final SubLObject template_length = basic_variable_length_sequence_get_length_method( self );
    if( NIL == end_index )
    {
      end_index = template_length;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !end_index.numLE( template_length ) )
    {
      Errors.error( $str225$_GET_SUBSEQUENCE__S___End_index__, end_index, template_length );
    }
    final SubLObject template_class = basic_variable_length_sequence_get_sequence_class_method( self );
    final SubLObject template_instance = object.new_object_instance( template_class );
    SubLObject template_original_index = start_index;
    SubLObject template_index_count;
    SubLObject template_index;
    for( template_index_count = Numbers.subtract( end_index, start_index ), template_index = NIL, template_index = ZERO_INTEGER; template_index.numL( template_index_count ); template_index = Numbers.add( template_index,
        ONE_INTEGER ) )
    {
      methods.funcall_instance_method_with_2_args( template_instance, $sym18$SET_NTH, template_index, basic_variable_length_sequence_get_nth_method( self, template_original_index, UNPROVIDED ) );
      template_original_index = Numbers.add( template_original_index, ONE_INTEGER );
    }
    return template_instance;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_set_nth_method(final SubLObject self, final SubLObject n, final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !n.numGE( ZERO_INTEGER ) )
    {
      Errors.error( $str227$_SET_NTH__S___Index__S_is_less_th, self, n );
    }
    final SubLObject template_largest_index = basic_variable_length_sequence_get_largest_index_method( self );
    final SubLObject template_storage_size = basic_variable_length_sequence_get_storage_size_method( self );
    if( n.numGE( template_storage_size ) )
    {
      final SubLObject template_new_storage_size = Numbers.multiply( basic_variable_length_sequence_get_growth_factor_method( self ), n );
      final SubLObject template_old_storage = basic_variable_length_sequence_get_internal_storage_method( self );
      final SubLObject template_default_value = basic_variable_length_sequence_get_default_value_method( self );
      final SubLObject template_new_storage = Vectors.make_vector( template_new_storage_size, template_default_value );
      SubLObject cdotimes_end_var;
      SubLObject template_index;
      for( cdotimes_end_var = Numbers.add( template_largest_index, ONE_INTEGER ), template_index = NIL, template_index = ZERO_INTEGER; template_index.numL( cdotimes_end_var ); template_index = Numbers.add(
          template_index, ONE_INTEGER ) )
      {
        Vectors.set_aref( template_new_storage, template_index, Vectors.aref( template_old_storage, template_index ) );
      }
      basic_variable_length_sequence_record_index_method( self, n );
      basic_variable_length_sequence_set_internal_storage_method( self, template_new_storage );
      basic_variable_length_sequence_set_storage_size_method( self, template_new_storage_size );
      Vectors.set_aref( template_new_storage, n, new_value );
    }
    else
    {
      basic_variable_length_sequence_record_index_method( self, n );
      Vectors.set_aref( basic_variable_length_sequence_get_internal_storage_method( self ), n, new_value );
    }
    return new_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_get_nth_method(final SubLObject self, final SubLObject n, SubLObject out_of_range_value)
  {
    if( out_of_range_value == UNPROVIDED )
    {
      out_of_range_value = NIL;
    }
    if( n.numL( ZERO_INTEGER ) || n.numG( basic_variable_length_sequence_get_largest_index_method( self ) ) )
    {
      return out_of_range_value;
    }
    return Vectors.aref( basic_variable_length_sequence_get_internal_storage_method( self ), n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_get_length_method(final SubLObject self)
  {
    return Numbers.add( basic_variable_length_sequence_get_largest_index_method( self ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_clear_method(final SubLObject self)
  {
    final SubLObject template_storage = basic_variable_length_sequence_get_internal_storage_method( self );
    final SubLObject template_size = basic_variable_length_sequence_get_storage_size_method( self );
    final SubLObject template_default_value = basic_variable_length_sequence_get_default_value_method( self );
    SubLObject template_index;
    for( template_index = NIL, template_index = ZERO_INTEGER; template_index.numL( template_size ); template_index = Numbers.add( template_index, ONE_INTEGER ) )
    {
      Vectors.set_aref( template_storage, template_index, template_default_value );
    }
    basic_variable_length_sequence_set_largest_index_method( self, MINUS_ONE_INTEGER );
    return template_default_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym39$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym41$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym33$OBJECT, $sym42$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym90$INTERNAL_STORAGE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym216$STORAGE_SIZE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym215$LARGEST_INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym214$DEFAULT_VALUE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym213$GROWTH_FACTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym89$SEQUENCE_CLASS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
  public static SubLObject basic_variable_length_sequence_p(final SubLObject basic_variable_length_sequence)
  {
    return classes.subloop_instanceof_class( basic_variable_length_sequence, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 26770L)
  public static SubLObject basic_variable_length_sequence_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    SubLObject sequence_class = get_basic_variable_length_sequence_sequence_class( self );
    SubLObject growth_factor = get_basic_variable_length_sequence_growth_factor( self );
    SubLObject default_value = get_basic_variable_length_sequence_default_value( self );
    SubLObject largest_index = get_basic_variable_length_sequence_largest_index( self );
    SubLObject storage_size = get_basic_variable_length_sequence_storage_size( self );
    SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage( self );
    try
    {
      thread.throwStack.push( $sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        object.object_initialize_method( self );
        internal_storage = Vectors.make_vector( TEN_INTEGER, NIL );
        storage_size = TEN_INTEGER;
        largest_index = MINUS_ONE_INTEGER;
        default_value = NIL;
        growth_factor = TWO_INTEGER;
        sequence_class = $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE;
        Dynamic.sublisp_throw( $sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_sequence_class( self, sequence_class );
          set_basic_variable_length_sequence_growth_factor( self, growth_factor );
          set_basic_variable_length_sequence_default_value( self, default_value );
          set_basic_variable_length_sequence_largest_index( self, largest_index );
          set_basic_variable_length_sequence_storage_size( self, storage_size );
          set_basic_variable_length_sequence_internal_storage( self, internal_storage );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 27097L)
  public static SubLObject basic_variable_length_sequence_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    final SubLObject largest_index = get_basic_variable_length_sequence_largest_index( self );
    final SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage( self );
    try
    {
      thread.throwStack.push( $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        if( NIL == largest_index )
        {
          PrintLow.format( stream, $str239$__BASIC_VARIABLE_LENGTH_SEQUENCE_ );
          Dynamic.sublisp_throw( $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self );
        }
        if( largest_index.numE( MINUS_ONE_INTEGER ) )
        {
          PrintLow.format( stream, $str111$__ );
          Dynamic.sublisp_throw( $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self );
        }
        final SubLObject length = Numbers.add( largest_index, ONE_INTEGER );
        if( length.numE( ZERO_INTEGER ) )
        {
          PrintLow.format( stream, $str111$__ );
          Dynamic.sublisp_throw( $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self );
        }
        if( length.numE( ONE_INTEGER ) )
        {
          PrintLow.format( stream, $str112$__S_, Vectors.aref( internal_storage, ZERO_INTEGER ) );
          Dynamic.sublisp_throw( $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self );
        }
        PrintLow.format( stream, $str113$__S, Vectors.aref( internal_storage, ZERO_INTEGER ) );
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( largest_index ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          PrintLow.format( stream, $str114$___S, Vectors.aref( internal_storage, Numbers.add( i, ONE_INTEGER ) ) );
        }
        PrintLow.format( stream, $str115$_ );
        Dynamic.sublisp_throw( $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_largest_index( self, largest_index );
          set_basic_variable_length_sequence_internal_storage( self, internal_storage );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 27747L)
  public static SubLObject basic_variable_length_sequence_get_internal_storage_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    final SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage( self );
    try
    {
      thread.throwStack.push( $sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, internal_storage );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_internal_storage( self, internal_storage );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 27863L)
  public static SubLObject basic_variable_length_sequence_get_contents_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    final SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage( self );
    try
    {
      thread.throwStack.push( $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        if( NIL == internal_storage )
        {
          Dynamic.sublisp_throw( $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, NIL );
        }
        final SubLObject length = basic_variable_length_sequence_get_length_method( self );
        SubLObject element = NIL;
        SubLObject contents = NIL;
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( length ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          element = Vectors.aref( internal_storage, i );
          if( NIL != element )
          {
            contents = ConsesLow.cons( element, contents );
          }
        }
        Dynamic.sublisp_throw( $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, Sequences.nreverse( contents ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_internal_storage( self, internal_storage );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 28204L)
  public static SubLObject basic_variable_length_sequence_set_internal_storage_method(final SubLObject self, final SubLObject new_internal_storage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage( self );
    try
    {
      thread.throwStack.push( $sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !new_internal_storage.isVector() )
        {
          Errors.error( $str248$_SET_INTERNAL_STORAGE__S____S_is_, self, new_internal_storage );
        }
        internal_storage = new_internal_storage;
        Dynamic.sublisp_throw( $sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_internal_storage );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_internal_storage( self, internal_storage );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 28511L)
  public static SubLObject basic_variable_length_sequence_get_storage_size_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    final SubLObject storage_size = get_basic_variable_length_sequence_storage_size( self );
    try
    {
      thread.throwStack.push( $sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, storage_size );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_storage_size( self, storage_size );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 28619L)
  public static SubLObject basic_variable_length_sequence_set_storage_size_method(final SubLObject self, final SubLObject new_storage_size)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    SubLObject storage_size = get_basic_variable_length_sequence_storage_size( self );
    try
    {
      thread.throwStack.push( $sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !new_storage_size.isInteger() || !new_storage_size.numGE( ZERO_INTEGER ) ) )
        {
          Errors.error( $str258$_SET_STORAGE_SIZE__S____S_is_not_, self, new_storage_size );
        }
        storage_size = new_storage_size;
        Dynamic.sublisp_throw( $sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_storage_size );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_storage_size( self, storage_size );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 28980L)
  public static SubLObject basic_variable_length_sequence_get_largest_index_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    final SubLObject largest_index = get_basic_variable_length_sequence_largest_index( self );
    try
    {
      thread.throwStack.push( $sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, largest_index );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_largest_index( self, largest_index );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29090L)
  public static SubLObject basic_variable_length_sequence_set_largest_index_method(final SubLObject self, final SubLObject new_largest_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    SubLObject largest_index = get_basic_variable_length_sequence_largest_index( self );
    try
    {
      thread.throwStack.push( $sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        largest_index = new_largest_index;
        Dynamic.sublisp_throw( $sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_largest_index );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_largest_index( self, largest_index );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29263L)
  public static SubLObject basic_variable_length_sequence_record_index_method(final SubLObject self, final SubLObject current_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    SubLObject largest_index = get_basic_variable_length_sequence_largest_index( self );
    try
    {
      thread.throwStack.push( $sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !current_index.isInteger() || !current_index.numGE( ZERO_INTEGER ) ) )
        {
          Errors.error( $str273$_RECORD_INDEX__S____S_is_not_a_va, self, current_index );
        }
        largest_index = Numbers.max( largest_index, current_index );
        Dynamic.sublisp_throw( $sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, largest_index );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_largest_index( self, largest_index );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29612L)
  public static SubLObject basic_variable_length_sequence_get_default_value_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    final SubLObject default_value = get_basic_variable_length_sequence_default_value( self );
    try
    {
      thread.throwStack.push( $sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, default_value );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_default_value( self, default_value );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29719L)
  public static SubLObject basic_variable_length_sequence_set_default_value_method(final SubLObject self, final SubLObject new_default_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    SubLObject default_value = get_basic_variable_length_sequence_default_value( self );
    try
    {
      thread.throwStack.push( $sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        default_value = new_default_value;
        Dynamic.sublisp_throw( $sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_default_value );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_default_value( self, default_value );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29889L)
  public static SubLObject basic_variable_length_sequence_get_growth_factor_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    final SubLObject growth_factor = get_basic_variable_length_sequence_growth_factor( self );
    try
    {
      thread.throwStack.push( $sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, growth_factor );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_growth_factor( self, growth_factor );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29996L)
  public static SubLObject basic_variable_length_sequence_set_growth_factor_method(final SubLObject self, final SubLObject new_growth_factor)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    SubLObject growth_factor = get_basic_variable_length_sequence_growth_factor( self );
    try
    {
      thread.throwStack.push( $sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !new_growth_factor.isNumber() || !new_growth_factor.numG( $float292$1_0 ) ) )
        {
          Errors.error( $str293$_SET_GROWTH_FACTOR__S____S_is_not, self, new_growth_factor );
        }
        growth_factor = new_growth_factor;
        Dynamic.sublisp_throw( $sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_growth_factor );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_growth_factor( self, growth_factor );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 30369L)
  public static SubLObject basic_variable_length_sequence_get_sequence_class_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    final SubLObject sequence_class = get_basic_variable_length_sequence_sequence_class( self );
    try
    {
      thread.throwStack.push( $sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, sequence_class );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_sequence_class( self, sequence_class );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 30478L)
  public static SubLObject basic_variable_length_sequence_set_sequence_class_method(final SubLObject self, final SubLObject new_class)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_variable_length_sequence_method = NIL;
    SubLObject sequence_class = get_basic_variable_length_sequence_sequence_class( self );
    try
    {
      thread.throwStack.push( $sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_class && ( !new_class.isSymbol() || NIL == classes.subclassp( new_class, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE ) ) )
        {
          Errors.error( $str299$_SET_SEQUENCE_CLASS__S____S_is_no, self, new_class );
        }
        sequence_class = new_class;
        Dynamic.sublisp_throw( $sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_class );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_variable_length_sequence_sequence_class( self, sequence_class );
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
      catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable( ccatch_env_var, $sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_variable_length_sequence_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 30856L)
  public static SubLObject fixed_length_sequence_p(final SubLObject fixed_length_sequence)
  {
    return interfaces.subloop_instanceof_interface( fixed_length_sequence, $sym301$FIXED_LENGTH_SEQUENCE );
  }

  public static SubLObject declare_subloop_sequences_file()
  {
    SubLFiles.declareFunction( me, "sequence_element_template_p", "SEQUENCE-ELEMENT-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sequence_p", "SEQUENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sequence_template_p", "SEQUENCE-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_sequence_enumerator_current_index", "GET-BASIC-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_sequence_enumerator_current_index", "SET-BASIC-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_sequence_enumerator_length", "GET-BASIC-SEQUENCE-ENUMERATOR-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_sequence_enumerator_length", "SET-BASIC-SEQUENCE-ENUMERATOR-LENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_sequence_enumerator_shared_storage", "GET-BASIC-SEQUENCE-ENUMERATOR-SHARED-STORAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_sequence_enumerator_shared_storage", "SET-BASIC-SEQUENCE-ENUMERATOR-SHARED-STORAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_sequence_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_sequence_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_p", "BASIC-SEQUENCE-ENUMERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_initialize_method", "BASIC-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_set_shared_storage_method", "BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_empty_p_method", "BASIC-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_first_p_method", "BASIC-SEQUENCE-ENUMERATOR-FIRST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_last_p_method", "BASIC-SEQUENCE-ENUMERATOR-LAST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_current_method", "BASIC-SEQUENCE-ENUMERATOR-CURRENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_first_method", "BASIC-SEQUENCE-ENUMERATOR-FIRST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_last_method", "BASIC-SEQUENCE-ENUMERATOR-LAST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_next_method", "BASIC-SEQUENCE-ENUMERATOR-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_enumerator_previous_method", "BASIC-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_sequence_sequence_class", "GET-BASIC-SEQUENCE-SEQUENCE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_sequence_sequence_class", "SET-BASIC-SEQUENCE-SEQUENCE-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_sequence_internal_storage", "GET-BASIC-SEQUENCE-INTERNAL-STORAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_sequence_internal_storage", "SET-BASIC-SEQUENCE-INTERNAL-STORAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_deallocate_enumerator_method", "BASIC-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_allocate_enumerator_method", "BASIC-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_get_contents_method", "BASIC-SEQUENCE-GET-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_add_method", "BASIC-SEQUENCE-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_get_subsequence_method", "BASIC-SEQUENCE-GET-SUBSEQUENCE-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "basic_sequence_set_nth_method", "BASIC-SEQUENCE-SET-NTH-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_get_nth_method", "BASIC-SEQUENCE-GET-NTH-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "basic_sequence_get_length_method", "BASIC-SEQUENCE-GET-LENGTH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_clear_method", "BASIC-SEQUENCE-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_sequence_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_sequence_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_p", "BASIC-SEQUENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_initialize_method", "BASIC-SEQUENCE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_print_method", "BASIC-SEQUENCE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_get_internal_storage_method", "BASIC-SEQUENCE-GET-INTERNAL-STORAGE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_set_internal_storage_method", "BASIC-SEQUENCE-SET-INTERNAL-STORAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_get_sequence_class_method", "BASIC-SEQUENCE-GET-SEQUENCE-CLASS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_sequence_set_sequence_class_method", "BASIC-SEQUENCE-SET-SEQUENCE-CLASS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "variable_length_sequence_p", "VARIABLE-LENGTH-SEQUENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_length_sequence_template_p", "VARIABLE-LENGTH-SEQUENCE-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_variable_length_sequence_enumerator_current_index", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_variable_length_sequence_enumerator_current_index", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_variable_length_sequence_enumerator_sequence", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEQUENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_variable_length_sequence_enumerator_sequence", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEQUENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_variable_length_sequence_enumerator_ignore_null_values", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-IGNORE-NULL-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_variable_length_sequence_enumerator_ignore_null_values", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-IGNORE-NULL-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_variable_length_sequence_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_p", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_initialize_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_seek_non_null_forward_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-FORWARD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_seek_non_null_backward_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-BACKWARD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_set_sequence_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_get_ignore_null_values_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-GET-IGNORE-NULL-VALUES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_set_ignore_null_values_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-IGNORE-NULL-VALUES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_empty_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_first_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_last_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_current_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_first_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_last_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_next_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_enumerator_previous_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_variable_length_sequence_sequence_class", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-SEQUENCE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_variable_length_sequence_sequence_class", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-SEQUENCE-CLASS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_variable_length_sequence_growth_factor", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-GROWTH-FACTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_variable_length_sequence_growth_factor", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-GROWTH-FACTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_variable_length_sequence_default_value", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-DEFAULT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_variable_length_sequence_default_value", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-DEFAULT-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_variable_length_sequence_largest_index", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-LARGEST-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_variable_length_sequence_largest_index", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-LARGEST-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_variable_length_sequence_storage_size", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-STORAGE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_variable_length_sequence_storage_size", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-STORAGE-SIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_variable_length_sequence_internal_storage", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-INTERNAL-STORAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_variable_length_sequence_internal_storage", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-INTERNAL-STORAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_index_of_previous_non_nil_element_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-PREVIOUS-NON-NIL-ELEMENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_index_of_next_non_nil_element_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-NEXT-NON-NIL-ELEMENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_all_null_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ALL-NULL-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_deallocate_enumerator_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_allocate_enumerator_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_add_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ADD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_subsequence_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SUBSEQUENCE-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_set_nth_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-NTH-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_nth_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-NTH-METHOD", 2, 1, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_length_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LENGTH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_clear_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_variable_length_sequence_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_variable_length_sequence_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_p", "BASIC-VARIABLE-LENGTH-SEQUENCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_initialize_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_print_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_internal_storage_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-INTERNAL-STORAGE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_contents_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_set_internal_storage_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-INTERNAL-STORAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_storage_size_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-STORAGE-SIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_set_storage_size_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-STORAGE-SIZE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_largest_index_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LARGEST-INDEX-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_set_largest_index_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-LARGEST-INDEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_record_index_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-RECORD-INDEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_default_value_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-DEFAULT-VALUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_set_default_value_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-DEFAULT-VALUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_growth_factor_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-GROWTH-FACTOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_set_growth_factor_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-GROWTH-FACTOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_get_sequence_class_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SEQUENCE-CLASS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_variable_length_sequence_set_sequence_class_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-SEQUENCE-CLASS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "fixed_length_sequence_p", "FIXED-LENGTH-SEQUENCE-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_subloop_sequences_file()
  {
    return NIL;
  }

  public static SubLObject setup_subloop_sequences_file()
  {
    interfaces.new_interface( $sym0$SEQUENCE_ELEMENT_TEMPLATE, NIL, NIL, $list1 );
    interfaces.new_interface( $sym2$SEQUENCE, NIL, NIL, $list3 );
    interfaces.interfaces_add_interface_instance_method( $sym4$GET_CONTENTS, $sym2$SEQUENCE, $list5, NIL, $list6 );
    interfaces.new_interface( $sym7$SEQUENCE_TEMPLATE, $list8, $list9, $list10 );
    interfaces.interfaces_add_interface_instance_method( $sym11$CLEAR, $sym7$SEQUENCE_TEMPLATE, $list5, NIL, $list12 );
    interfaces.interfaces_add_interface_instance_method( $sym13$GET_LENGTH, $sym7$SEQUENCE_TEMPLATE, $list5, NIL, $list14 );
    interfaces.interfaces_add_interface_instance_method( $sym15$GET_NTH, $sym7$SEQUENCE_TEMPLATE, $list5, $list16, $list17 );
    interfaces.interfaces_add_interface_instance_method( $sym18$SET_NTH, $sym7$SEQUENCE_TEMPLATE, $list5, $list19, $list20 );
    interfaces.interfaces_add_interface_instance_method( $sym21$GET_SUBSEQUENCE, $sym7$SEQUENCE_TEMPLATE, $list5, $list22, $list23 );
    interfaces.interfaces_add_interface_instance_method( $sym24$ADD, $sym7$SEQUENCE_TEMPLATE, $list5, $list25, $list26 );
    interfaces.interfaces_add_interface_instance_method( $sym27$ALLOCATE_ENUMERATOR, $sym7$SEQUENCE_TEMPLATE, $list5, NIL, $list28 );
    interfaces.interfaces_add_interface_instance_method( $sym29$DEALLOCATE_ENUMERATOR, $sym7$SEQUENCE_TEMPLATE, $list5, $list30, $list31 );
    classes.subloop_new_class( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym33$OBJECT, $list34, NIL, $list35 );
    classes.class_set_implements_slot_listeners( $sym32$BASIC_SEQUENCE_ENUMERATOR, NIL );
    classes.subloop_note_class_initialization_function( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym40$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym43$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_INSTANCE );
    subloop_reserved_initialize_basic_sequence_enumerator_class( $sym32$BASIC_SEQUENCE_ENUMERATOR );
    methods.methods_incorporate_instance_method( $sym44$INITIALIZE, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list45, NIL, $list46 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym44$INITIALIZE, $sym48$BASIC_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym49$SET_SHARED_STORAGE, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list5, $list50, $list51 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym49$SET_SHARED_STORAGE, $sym54$BASIC_SEQUENCE_ENUMERATOR_SET_SHARED_STORAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym55$EMPTY_P, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list56 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym55$EMPTY_P, $sym58$BASIC_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym59$FIRST_P, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list60 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym59$FIRST_P, $sym62$BASIC_SEQUENCE_ENUMERATOR_FIRST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym63$LAST_P, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list64 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym63$LAST_P, $sym66$BASIC_SEQUENCE_ENUMERATOR_LAST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym67$CURRENT, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list68 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym67$CURRENT, $sym70$BASIC_SEQUENCE_ENUMERATOR_CURRENT_METHOD );
    methods.methods_incorporate_instance_method( $sym71$FIRST, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list72 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym71$FIRST, $sym74$BASIC_SEQUENCE_ENUMERATOR_FIRST_METHOD );
    methods.methods_incorporate_instance_method( $sym75$LAST, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list5, NIL, $list76 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym75$LAST, $sym78$BASIC_SEQUENCE_ENUMERATOR_LAST_METHOD );
    methods.methods_incorporate_instance_method( $sym79$NEXT, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list80, NIL, $list81 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym79$NEXT, $sym82$BASIC_SEQUENCE_ENUMERATOR_NEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym83$PREVIOUS, $sym32$BASIC_SEQUENCE_ENUMERATOR, $list80, NIL, $list84 );
    methods.subloop_register_instance_method( $sym32$BASIC_SEQUENCE_ENUMERATOR, $sym83$PREVIOUS, $sym85$BASIC_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD );
    classes.subloop_new_class( $sym86$BASIC_SEQUENCE, $sym33$OBJECT, $list87, NIL, $list88 );
    classes.class_set_implements_slot_listeners( $sym86$BASIC_SEQUENCE, NIL );
    methods.methods_incorporate_instance_method( $sym29$DEALLOCATE_ENUMERATOR, $sym86$BASIC_SEQUENCE, $list5, $list30, $list31 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym29$DEALLOCATE_ENUMERATOR, $sym92$BASIC_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym27$ALLOCATE_ENUMERATOR, $sym86$BASIC_SEQUENCE, $list5, NIL, $list28 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym27$ALLOCATE_ENUMERATOR, $sym93$BASIC_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym4$GET_CONTENTS, $sym86$BASIC_SEQUENCE, $list5, NIL, $list6 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym4$GET_CONTENTS, $sym94$BASIC_SEQUENCE_GET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym24$ADD, $sym86$BASIC_SEQUENCE, $list5, $list25, $list26 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym24$ADD, $sym95$BASIC_SEQUENCE_ADD_METHOD );
    methods.methods_incorporate_instance_method( $sym21$GET_SUBSEQUENCE, $sym86$BASIC_SEQUENCE, $list5, $list22, $list23 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym21$GET_SUBSEQUENCE, $sym97$BASIC_SEQUENCE_GET_SUBSEQUENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym18$SET_NTH, $sym86$BASIC_SEQUENCE, $list5, $list19, $list20 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym18$SET_NTH, $sym98$BASIC_SEQUENCE_SET_NTH_METHOD );
    methods.methods_incorporate_instance_method( $sym15$GET_NTH, $sym86$BASIC_SEQUENCE, $list5, $list16, $list17 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym15$GET_NTH, $sym99$BASIC_SEQUENCE_GET_NTH_METHOD );
    methods.methods_incorporate_instance_method( $sym13$GET_LENGTH, $sym86$BASIC_SEQUENCE, $list5, NIL, $list14 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym13$GET_LENGTH, $sym100$BASIC_SEQUENCE_GET_LENGTH_METHOD );
    methods.methods_incorporate_instance_method( $sym11$CLEAR, $sym86$BASIC_SEQUENCE, $list5, NIL, $list12 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym11$CLEAR, $sym101$BASIC_SEQUENCE_CLEAR_METHOD );
    classes.subloop_note_class_initialization_function( $sym86$BASIC_SEQUENCE, $sym102$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym86$BASIC_SEQUENCE, $sym103$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_INSTANCE );
    subloop_reserved_initialize_basic_sequence_class( $sym86$BASIC_SEQUENCE );
    methods.methods_incorporate_instance_method( $sym44$INITIALIZE, $sym86$BASIC_SEQUENCE, $list45, NIL, $list104 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym44$INITIALIZE, $sym106$BASIC_SEQUENCE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym107$PRINT, $sym86$BASIC_SEQUENCE, $list5, $list108, $list109 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym107$PRINT, $sym116$BASIC_SEQUENCE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym117$GET_INTERNAL_STORAGE, $sym86$BASIC_SEQUENCE, $list45, NIL, $list118 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym117$GET_INTERNAL_STORAGE, $sym120$BASIC_SEQUENCE_GET_INTERNAL_STORAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym96$SET_INTERNAL_STORAGE, $sym86$BASIC_SEQUENCE, $list45, $list121, $list122 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym96$SET_INTERNAL_STORAGE, $sym125$BASIC_SEQUENCE_SET_INTERNAL_STORAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym126$GET_SEQUENCE_CLASS, $sym86$BASIC_SEQUENCE, $list5, NIL, $list127 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym126$GET_SEQUENCE_CLASS, $sym129$BASIC_SEQUENCE_GET_SEQUENCE_CLASS_METHOD );
    methods.methods_incorporate_instance_method( $sym130$SET_SEQUENCE_CLASS, $sym86$BASIC_SEQUENCE, $list5, $list131, $list132 );
    methods.subloop_register_instance_method( $sym86$BASIC_SEQUENCE, $sym130$SET_SEQUENCE_CLASS, $sym135$BASIC_SEQUENCE_SET_SEQUENCE_CLASS_METHOD );
    interfaces.new_interface( $sym136$VARIABLE_LENGTH_SEQUENCE, $list8, $list9, $list137 );
    interfaces.new_interface( $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list139, $list140, $list141 );
    interfaces.interfaces_add_interface_instance_method( $sym11$CLEAR, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, NIL, $list142 );
    interfaces.interfaces_add_interface_instance_method( $sym13$GET_LENGTH, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, NIL, $list143 );
    interfaces.interfaces_add_interface_instance_method( $sym15$GET_NTH, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list144, $list145 );
    interfaces.interfaces_add_interface_instance_method( $sym18$SET_NTH, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list19, $list146 );
    interfaces.interfaces_add_interface_instance_method( $sym21$GET_SUBSEQUENCE, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list22, $list147 );
    interfaces.interfaces_add_interface_instance_method( $sym24$ADD, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list25, $list148 );
    interfaces.interfaces_add_interface_instance_method( $sym27$ALLOCATE_ENUMERATOR, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, NIL, $list149 );
    interfaces.interfaces_add_interface_instance_method( $sym29$DEALLOCATE_ENUMERATOR, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list30, $list150 );
    interfaces.interfaces_add_interface_instance_method( $sym151$ALL_NULL_P, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, NIL, $list152 );
    interfaces.interfaces_add_interface_instance_method( $sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list154, $list155 );
    interfaces.interfaces_add_interface_instance_method( $sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, $list5, $list154, $list157 );
    classes.subloop_new_class( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym33$OBJECT, $list34, NIL, $list159 );
    classes.class_set_implements_slot_listeners( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, NIL );
    classes.subloop_note_class_initialization_function( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym162$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER );
    classes.subloop_note_instance_initialization_function( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym163$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER );
    subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR );
    methods.methods_incorporate_instance_method( $sym44$INITIALIZE, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list45, NIL, $list164 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym44$INITIALIZE, $sym166$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym167$SEEK_NON_NULL_FORWARD, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list45, NIL, $list168 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym167$SEEK_NON_NULL_FORWARD, $sym170$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_FORWARD_M );
    methods.methods_incorporate_instance_method( $sym171$SEEK_NON_NULL_BACKWARD, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list45, NIL, $list172 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym171$SEEK_NON_NULL_BACKWARD, $sym174$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_BACKWARD_ );
    methods.methods_incorporate_instance_method( $sym175$SET_SEQUENCE, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, $list176, $list177 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym175$SET_SEQUENCE, $sym180$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_SEQUENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym181$GET_IGNORE_NULL_VALUES, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list182, NIL, $list183 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym181$GET_IGNORE_NULL_VALUES, $sym184$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_GET_IGNORE_NULL_VALUES_ );
    methods.methods_incorporate_instance_method( $sym185$SET_IGNORE_NULL_VALUES, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, $list186, $list187 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym185$SET_IGNORE_NULL_VALUES, $sym189$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_IGNORE_NULL_VALUES_ );
    methods.methods_incorporate_instance_method( $sym55$EMPTY_P, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, NIL, $list190 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym55$EMPTY_P, $sym192$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym59$FIRST_P, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, NIL, $list193 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym59$FIRST_P, $sym195$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym63$LAST_P, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, NIL, $list196 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym63$LAST_P, $sym198$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_P_METHOD );
    methods.methods_incorporate_instance_method( $sym67$CURRENT, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list5, NIL, $list199 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym67$CURRENT, $sym201$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_CURRENT_METHOD );
    methods.methods_incorporate_instance_method( $sym71$FIRST, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list80, NIL, $list202 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym71$FIRST, $sym203$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_METHOD );
    methods.methods_incorporate_instance_method( $sym75$LAST, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list80, NIL, $list204 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym75$LAST, $sym205$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_METHOD );
    methods.methods_incorporate_instance_method( $sym79$NEXT, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list80, NIL, $list206 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym79$NEXT, $sym207$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_NEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym83$PREVIOUS, $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $list80, NIL, $list208 );
    methods.subloop_register_instance_method( $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, $sym83$PREVIOUS, $sym209$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD );
    classes.subloop_new_class( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym33$OBJECT, $list211, NIL, $list212 );
    classes.class_set_implements_slot_listeners( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, NIL );
    methods.methods_incorporate_instance_method( $sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list154, $list157 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, $sym217$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_PREVIOUS_NON_NIL_ELEMENT_ );
    methods.methods_incorporate_instance_method( $sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list154, $list155 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, $sym218$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_NEXT_NON_NIL_ELEMENT_METH );
    methods.methods_incorporate_instance_method( $sym151$ALL_NULL_P, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list152 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym151$ALL_NULL_P, $sym219$BASIC_VARIABLE_LENGTH_SEQUENCE_ALL_NULL_P_METHOD );
    methods.methods_incorporate_instance_method( $sym29$DEALLOCATE_ENUMERATOR, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list30, $list150 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym29$DEALLOCATE_ENUMERATOR, $sym221$BASIC_VARIABLE_LENGTH_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym27$ALLOCATE_ENUMERATOR, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list149 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym27$ALLOCATE_ENUMERATOR, $sym222$BASIC_VARIABLE_LENGTH_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym24$ADD, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list25, $list148 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym24$ADD, $sym223$BASIC_VARIABLE_LENGTH_SEQUENCE_ADD_METHOD );
    methods.methods_incorporate_instance_method( $sym21$GET_SUBSEQUENCE, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list22, $list147 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym21$GET_SUBSEQUENCE, $sym226$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SUBSEQUENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym18$SET_NTH, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list19, $list146 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym18$SET_NTH, $sym228$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_NTH_METHOD );
    methods.methods_incorporate_instance_method( $sym15$GET_NTH, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list144, $list145 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym15$GET_NTH, $sym229$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_NTH_METHOD );
    methods.methods_incorporate_instance_method( $sym13$GET_LENGTH, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list143 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym13$GET_LENGTH, $sym230$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LENGTH_METHOD );
    methods.methods_incorporate_instance_method( $sym11$CLEAR, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list142 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym11$CLEAR, $sym231$BASIC_VARIABLE_LENGTH_SEQUENCE_CLEAR_METHOD );
    classes.subloop_note_class_initialization_function( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym232$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym233$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_INSTAN );
    subloop_reserved_initialize_basic_variable_length_sequence_class( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE );
    methods.methods_incorporate_instance_method( $sym44$INITIALIZE, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, NIL, $list234 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym44$INITIALIZE, $sym236$BASIC_VARIABLE_LENGTH_SEQUENCE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym107$PRINT, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list108, $list237 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym107$PRINT, $sym240$BASIC_VARIABLE_LENGTH_SEQUENCE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym117$GET_INTERNAL_STORAGE, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, NIL, $list118 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym117$GET_INTERNAL_STORAGE, $sym242$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_INTERNAL_STORAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym4$GET_CONTENTS, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list243 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym4$GET_CONTENTS, $sym245$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym96$SET_INTERNAL_STORAGE, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, $list121, $list246 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym96$SET_INTERNAL_STORAGE, $sym249$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_INTERNAL_STORAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym250$GET_STORAGE_SIZE, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, NIL, $list251 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym250$GET_STORAGE_SIZE, $sym253$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_STORAGE_SIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym254$SET_STORAGE_SIZE, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, $list255, $list256 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym254$SET_STORAGE_SIZE, $sym259$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_STORAGE_SIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym260$GET_LARGEST_INDEX, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, NIL, $list261 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym260$GET_LARGEST_INDEX, $sym263$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LARGEST_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym264$SET_LARGEST_INDEX, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, $list265, $list266 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym264$SET_LARGEST_INDEX, $sym268$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_LARGEST_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym269$RECORD_INDEX, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list45, $list270, $list271 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym269$RECORD_INDEX, $sym274$BASIC_VARIABLE_LENGTH_SEQUENCE_RECORD_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym275$GET_DEFAULT_VALUE, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list276 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym275$GET_DEFAULT_VALUE, $sym278$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_DEFAULT_VALUE_METHOD );
    methods.methods_incorporate_instance_method( $sym279$SET_DEFAULT_VALUE, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list280, $list281 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym279$SET_DEFAULT_VALUE, $sym283$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_DEFAULT_VALUE_METHOD );
    methods.methods_incorporate_instance_method( $sym284$GET_GROWTH_FACTOR, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list285 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym284$GET_GROWTH_FACTOR, $sym287$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_GROWTH_FACTOR_METHOD );
    methods.methods_incorporate_instance_method( $sym288$SET_GROWTH_FACTOR, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list289, $list290 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym288$SET_GROWTH_FACTOR, $sym294$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_GROWTH_FACTOR_METHOD );
    methods.methods_incorporate_instance_method( $sym126$GET_SEQUENCE_CLASS, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, NIL, $list127 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym126$GET_SEQUENCE_CLASS, $sym296$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SEQUENCE_CLASS_METHOD );
    methods.methods_incorporate_instance_method( $sym130$SET_SEQUENCE_CLASS, $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $list5, $list131, $list297 );
    methods.subloop_register_instance_method( $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, $sym130$SET_SEQUENCE_CLASS, $sym300$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_SEQUENCE_CLASS_METHOD );
    interfaces.new_interface( $sym301$FIXED_LENGTH_SEQUENCE, $list8, $list9, $list302 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subloop_sequences_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subloop_sequences_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subloop_sequences_file();
  }
  static
  {
    me = new subloop_sequences();
    $sym0$SEQUENCE_ELEMENT_TEMPLATE = makeSymbol( "SEQUENCE-ELEMENT-TEMPLATE" );
    $list1 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SELF-DELETION-MODE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-SELF-DELETION-MODE" ), ConsesLow.list( makeSymbol( "MODE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "GET-INDEX" ), ConsesLow.list( makeSymbol( "SEQUENCE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INDEX" ), ConsesLow.list( makeSymbol(
                "SEQUENCE" ), makeSymbol( "INDEX" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-SELF-FROM-SEQUENCE" ), ConsesLow.list( makeSymbol(
                    "SEQUENCE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "TRANSFER-SELF" ), ConsesLow.list( makeSymbol( "CURRENT-SEQUENCE" ), makeSymbol(
                        "NEW-SEQUENCE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-SELF-FROM-ALL-SEQUENCES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MEMBER-P" ), ConsesLow.list( makeSymbol( "SEQUENCE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                makeSymbol( "GET-SEQUENCES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-ADD" ), ConsesLow.list( makeSymbol(
                                    "PARENT-SEQUENCE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-DELETE" ), ConsesLow.list( makeSymbol( "PARENT-SEQUENCE" ) ),
                                        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PERFORM-ACTION" ), ConsesLow.list( makeSymbol( "ACTION" ), makeSymbol(
                                            "PARAMETERS" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym2$SEQUENCE = makeSymbol( "SEQUENCE" );
    $list3 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-LENGTH" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list(
            makeSymbol( "OUT-OF-RANGE-VALUE" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol(
                "NEW-VALUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SUBSEQUENCE" ), ConsesLow.list( makeSymbol( "START-INDEX" ), makeSymbol( "&OPTIONAL" ),
                    ConsesLow.list( makeSymbol( "END-INDEX" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ),
                        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEQUENCE-CLASS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-SEQUENCE-CLASS" ), ConsesLow.list( makeSymbol( "NEW-CLASS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ALLOCATE-ENUMERATOR" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEALLOCATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "OLD-ENUMERATOR" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym4$GET_CONTENTS = makeSymbol( "GET-CONTENTS" );
    $list5 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LIST-OF-CONTENTS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol(
        "INDEX" ), ConsesLow.list( makeSymbol( "GET-LENGTH" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "GET-NTH" ), makeSymbol( "SELF" ), makeSymbol( "INDEX" ) ),
            makeSymbol( "LIST-OF-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "LIST-OF-CONTENTS" ) ) ) ) );
    $sym7$SEQUENCE_TEMPLATE = makeSymbol( "SEQUENCE-TEMPLATE" );
    $list8 = ConsesLow.list( makeSymbol( "SEQUENCE" ) );
    $list9 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "SEQUENCE" ) ) );
    $list10 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INTERNAL-STORAGE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "NEW-INTERNAL-STORAGE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "CLEAR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LENGTH" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "OUT-OF-RANGE-VALUE" ) ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
                    .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "NEW-VALUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "INSERT-AT" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "NEW-VALUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                            makeSymbol( "GET-SUBSEQUENCE" ), ConsesLow.list( makeSymbol( "START-INDEX" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "END-INDEX" ), NIL ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "ALLOCATE-ENUMERATOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEALLOCATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "OLD-ENUMERATOR" ) ),
              makeKeyword( "PUBLIC" ) )
    } );
    $sym11$CLEAR = makeSymbol( "CLEAR" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym13$GET_LENGTH = makeSymbol( "GET-LENGTH" );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ) ) ) ) );
    $sym15$GET_NTH = makeSymbol( "GET-NTH" );
    $list16 = ConsesLow.list( makeSymbol( "N" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "OUT-OF-RANGE-VALUE" ) ) );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "N" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OUT-OF-RANGE-VALUE" ) ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-CONS" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list(
            makeSymbol( "TEMPLATE-INDEX" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ),
                makeSymbol( "N" ), makeSymbol( "TEMPLATE-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ) ), ConsesLow.list( makeSymbol(
                    "CINC" ), makeSymbol( "TEMPLATE-INDEX" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                        "TEMPLATE-CURRENT-CONS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OUT-OF-RANGE-VALUE" ) ) ) );
    $sym18$SET_NTH = makeSymbol( "SET-NTH" );
    $list19 = ConsesLow.list( makeSymbol( "N" ), makeSymbol( "NEW-VALUE" ) );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-NTH" ), makeSymbol( "N" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ) ), makeSymbol( "NEW-VALUE" ) ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "NEW-VALUE" ) ) );
    $sym21$GET_SUBSEQUENCE = makeSymbol( "GET-SUBSEQUENCE" );
    $list22 = ConsesLow.list( makeSymbol( "START-INDEX" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "END-INDEX" ), NIL ) );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CLASS" ), ConsesLow.list( makeSymbol( "GET-SEQUENCE-CLASS" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-INSTANCE" ), ConsesLow.list( makeSymbol( "NEW-OBJECT-INSTANCE" ), makeSymbol( "TEMPLATE-CLASS" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-SUBLIST" ), ConsesLow.list( makeSymbol(
            "NTHCDR" ), makeSymbol( "START-INDEX" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "END-INDEX" ), ConsesLow.list(
                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-NEW-STORAGE" ), NIL ), ConsesLow.list( makeSymbol( "TEMPLATE-POINTER" ), makeSymbol( "TEMPLATE-SUBLIST" ) ) ), ConsesLow.list(
                    makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "END-INDEX" ), makeSymbol( "START-INDEX" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                        ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-POINTER" ) ), makeSymbol( "TEMPLATE-NEW-STORAGE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-POINTER" ), ConsesLow
                            .list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-POINTER" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-INSTANCE" ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), makeSymbol( "SET-INTERNAL-STORAGE" ) ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "TEMPLATE-NEW-STORAGE" ) ) ) ), ConsesLow.list( makeSymbol(
                                    "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-INTERNAL-STORAGE" ) ), ConsesLow.list( makeSymbol(
                                        "COPY-LIST" ), makeSymbol( "TEMPLATE-SUBLIST" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-INSTANCE" ) ) ) );
    $sym24$ADD = makeSymbol( "ADD" );
    $list25 = ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol(
            "SET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list(
                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LAST-CONS" ), ConsesLow.list( makeSymbol( "LAST" ), makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ) ) ) ), ConsesLow.list( makeSymbol(
                    "RPLACD" ), makeSymbol( "TEMPLATE-LAST-CONS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ) ) ) );
    $sym27$ALLOCATE_ENUMERATOR = makeSymbol( "ALLOCATE-ENUMERATOR" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ),
            ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-SEQUENCE-ENUMERATOR" ) ) ) ) ), ConsesLow.list( makeSymbol(
                "BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                    "TEMPLATE-ENUMERATOR" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym29$DEALLOCATE_ENUMERATOR = makeSymbol( "DEALLOCATE-ENUMERATOR" );
    $list30 = ConsesLow.list( makeSymbol( "OLD-ENUMERATOR" ) );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-P" ), makeSymbol( "OLD-ENUMERATOR" ) ), makeString(
        "(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-SEQUENCE-ENUMERATOR." ), makeSymbol( "SELF" ), makeSymbol( "OLD-ENUMERATOR" ) ), ConsesLow.list( makeSymbol(
            "BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD" ), makeSymbol( "OLD-ENUMERATOR" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym32$BASIC_SEQUENCE_ENUMERATOR = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR" );
    $sym33$OBJECT = makeSymbol( "OBJECT" );
    $list34 = ConsesLow.list( makeSymbol( "ENUMERATOR-TEMPLATE" ) );
    $list35 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "SHARED-STORAGE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LENGTH" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CURRENT-INDEX" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-SHARED-STORAGE" ), ConsesLow.list( makeSymbol( "NEW-SHARED-STORAGE" ) ), makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST-P" ),
                    NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                        makeSymbol( "CURRENT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PREVIOUS" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym36$CURRENT_INDEX = makeSymbol( "CURRENT-INDEX" );
    $sym37$LENGTH = makeSymbol( "LENGTH" );
    $sym38$SHARED_STORAGE = makeSymbol( "SHARED-STORAGE" );
    $sym39$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym40$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-CLASS" );
    $sym41$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym42$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym43$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-INSTANCE" );
    $sym44$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list45 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SHARED-STORAGE" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "LENGTH" ), MINUS_ONE_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD" );
    $sym48$BASIC_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD" );
    $sym49$SET_SHARED_STORAGE = makeSymbol( "SET-SHARED-STORAGE" );
    $list50 = ConsesLow.list( makeSymbol( "NEW-SHARED-STORAGE" ) );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "NEW-SHARED-STORAGE" ) ), makeString( "(SET-SHARED-STORAGE ~S): ~S is not a list." ), makeSymbol(
        "SELF" ), makeSymbol( "NEW-SHARED-STORAGE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SHARED-STORAGE" ), makeSymbol( "NEW-SHARED-STORAGE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "CURRENT-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "SHARED-STORAGE" ) ) ), ConsesLow.list( makeSymbol(
                "RET" ), makeSymbol( "NEW-SHARED-STORAGE" ) ) );
    $sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD" );
    $str53$_SET_SHARED_STORAGE__S____S_is_no = makeString( "(SET-SHARED-STORAGE ~S): ~S is not a list." );
    $sym54$BASIC_SEQUENCE_ENUMERATOR_SET_SHARED_STORAGE_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD" );
    $sym55$EMPTY_P = makeSymbol( "EMPTY-P" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "<=" ), makeSymbol( "LENGTH" ), ZERO_INTEGER ) ) );
    $sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD" );
    $sym58$BASIC_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD" );
    $sym59$FIRST_P = makeSymbol( "FIRST-P" );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ) ) );
    $sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD" );
    $sym62$BASIC_SEQUENCE_ENUMERATOR_FIRST_P_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-FIRST-P-METHOD" );
    $sym63$LAST_P = makeSymbol( "LAST-P" );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "CURRENT-INDEX" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "LENGTH" ), ONE_INTEGER ) ) ) );
    $sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD" );
    $sym66$BASIC_SEQUENCE_ENUMERATOR_LAST_P_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-LAST-P-METHOD" );
    $sym67$CURRENT = makeSymbol( "CURRENT" );
    $list68 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
        "<" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "LENGTH" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NTH" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "SHARED-STORAGE" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD" );
    $sym70$BASIC_SEQUENCE_ENUMERATOR_CURRENT_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-CURRENT-METHOD" );
    $sym71$FIRST = makeSymbol( "FIRST" );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "LENGTH" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ),
        ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NTH" ), ZERO_INTEGER, makeSymbol( "SHARED-STORAGE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD" );
    $sym74$BASIC_SEQUENCE_ENUMERATOR_FIRST_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-FIRST-METHOD" );
    $sym75$LAST = makeSymbol( "LAST" );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "LENGTH" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ),
        ConsesLow.list( makeSymbol( "-" ), makeSymbol( "LENGTH" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NTH" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol(
            "SHARED-STORAGE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD" );
    $sym78$BASIC_SEQUENCE_ENUMERATOR_LAST_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-LAST-METHOD" );
    $sym79$NEXT = makeSymbol( "NEXT" );
    $list80 = ConsesLow.list( makeKeyword( "AUTO-UPDATE" ), makeKeyword( "PUBLIC" ) );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "LENGTH" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow
        .list( makeSymbol( "CINC" ), makeSymbol( "CURRENT-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) );
    $sym82$BASIC_SEQUENCE_ENUMERATOR_NEXT_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-NEXT-METHOD" );
    $sym83$PREVIOUS = makeSymbol( "PREVIOUS" );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "<=" ), makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list(
        makeSymbol( "CDEC" ), makeSymbol( "CURRENT-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) );
    $sym85$BASIC_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD = makeSymbol( "BASIC-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD" );
    $sym86$BASIC_SEQUENCE = makeSymbol( "BASIC-SEQUENCE" );
    $list87 = ConsesLow.list( makeSymbol( "SEQUENCE-TEMPLATE" ) );
    $list88 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "INTERNAL-STORAGE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SEQUENCE-CLASS" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INTERNAL-STORAGE" ),
                NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "NEW-INTERNAL-STORAGE" ) ), makeKeyword(
                    "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LENGTH" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "GET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "OUT-OF-RANGE-VALUE" ) ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword(
                                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "NEW-VALUE" ) ), makeKeyword(
                                    "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SUBSEQUENCE" ), ConsesLow.list( makeSymbol( "START-INDEX" ),
                                        makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "END-INDEX" ), NIL ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SEQUENCE-CLASS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                        "SET-SEQUENCE-CLASS" ), ConsesLow.list( makeSymbol( "NEW-CLASS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                            "ALLOCATE-ENUMERATOR" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                "DEALLOCATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "OLD-ENUMERATOR" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym89$SEQUENCE_CLASS = makeSymbol( "SEQUENCE-CLASS" );
    $sym90$INTERNAL_STORAGE = makeSymbol( "INTERNAL-STORAGE" );
    $str91$_DEALLOCATE_ENUMERATOR__S____S_is = makeString( "(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-SEQUENCE-ENUMERATOR." );
    $sym92$BASIC_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD" );
    $sym93$BASIC_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD" );
    $sym94$BASIC_SEQUENCE_GET_CONTENTS_METHOD = makeSymbol( "BASIC-SEQUENCE-GET-CONTENTS-METHOD" );
    $sym95$BASIC_SEQUENCE_ADD_METHOD = makeSymbol( "BASIC-SEQUENCE-ADD-METHOD" );
    $sym96$SET_INTERNAL_STORAGE = makeSymbol( "SET-INTERNAL-STORAGE" );
    $sym97$BASIC_SEQUENCE_GET_SUBSEQUENCE_METHOD = makeSymbol( "BASIC-SEQUENCE-GET-SUBSEQUENCE-METHOD" );
    $sym98$BASIC_SEQUENCE_SET_NTH_METHOD = makeSymbol( "BASIC-SEQUENCE-SET-NTH-METHOD" );
    $sym99$BASIC_SEQUENCE_GET_NTH_METHOD = makeSymbol( "BASIC-SEQUENCE-GET-NTH-METHOD" );
    $sym100$BASIC_SEQUENCE_GET_LENGTH_METHOD = makeSymbol( "BASIC-SEQUENCE-GET-LENGTH-METHOD" );
    $sym101$BASIC_SEQUENCE_CLEAR_METHOD = makeSymbol( "BASIC-SEQUENCE-CLEAR-METHOD" );
    $sym102$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-CLASS" );
    $sym103$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-INSTANCE" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INTERNAL-STORAGE" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "SEQUENCE-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-SEQUENCE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD" );
    $sym106$BASIC_SEQUENCE_INITIALIZE_METHOD = makeSymbol( "BASIC-SEQUENCE-INITIALIZE-METHOD" );
    $sym107$PRINT = makeSymbol( "PRINT" );
    $list108 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list109 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "INTERNAL-STORAGE" ) ), ConsesLow
        .list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "[]" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
            "NULL" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "INTERNAL-STORAGE" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "[~S]" ), ConsesLow.list( makeSymbol( "CAR" ),
                makeSymbol( "INTERNAL-STORAGE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "[~S" ), ConsesLow.list(
                    makeSymbol( "CAR" ), makeSymbol( "INTERNAL-STORAGE" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                        "INTERNAL-STORAGE" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( ", ~S" ), makeSymbol( "ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol(
                            "STREAM" ), makeString( "]" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD" );
    $str111$__ = makeString( "[]" );
    $str112$__S_ = makeString( "[~S]" );
    $str113$__S = makeString( "[~S" );
    $str114$___S = makeString( ", ~S" );
    $str115$_ = makeString( "]" );
    $sym116$BASIC_SEQUENCE_PRINT_METHOD = makeSymbol( "BASIC-SEQUENCE-PRINT-METHOD" );
    $sym117$GET_INTERNAL_STORAGE = makeSymbol( "GET-INTERNAL-STORAGE" );
    $list118 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INTERNAL-STORAGE" ) ) );
    $sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD" );
    $sym120$BASIC_SEQUENCE_GET_INTERNAL_STORAGE_METHOD = makeSymbol( "BASIC-SEQUENCE-GET-INTERNAL-STORAGE-METHOD" );
    $list121 = ConsesLow.list( makeSymbol( "NEW-INTERNAL-STORAGE" ) );
    $list122 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "NEW-INTERNAL-STORAGE" ) ), makeString( "(SET-INTERNAL-STORAGE ~S): ~S is not a LIST." ),
        makeSymbol( "SELF" ), makeSymbol( "NEW-INTERNAL-STORAGE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INTERNAL-STORAGE" ), makeSymbol( "NEW-INTERNAL-STORAGE" ) ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "NEW-INTERNAL-STORAGE" ) ) );
    $sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD" );
    $str124$_SET_INTERNAL_STORAGE__S____S_is_ = makeString( "(SET-INTERNAL-STORAGE ~S): ~S is not a LIST." );
    $sym125$BASIC_SEQUENCE_SET_INTERNAL_STORAGE_METHOD = makeSymbol( "BASIC-SEQUENCE-SET-INTERNAL-STORAGE-METHOD" );
    $sym126$GET_SEQUENCE_CLASS = makeSymbol( "GET-SEQUENCE-CLASS" );
    $list127 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SEQUENCE-CLASS" ) ) );
    $sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD" );
    $sym129$BASIC_SEQUENCE_GET_SEQUENCE_CLASS_METHOD = makeSymbol( "BASIC-SEQUENCE-GET-SEQUENCE-CLASS-METHOD" );
    $sym130$SET_SEQUENCE_CLASS = makeSymbol( "SET-SEQUENCE-CLASS" );
    $list131 = ConsesLow.list( makeSymbol( "NEW-CLASS" ) );
    $list132 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEW-CLASS" ) ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow
        .list( makeSymbol( "SYMBOLP" ), makeSymbol( "NEW-CLASS" ) ), ConsesLow.list( makeSymbol( "SUBCLASSP" ), makeSymbol( "NEW-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-SEQUENCE" ) ) ) ) ),
        makeString( "(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-SEQUENCE." ), makeSymbol( "SELF" ), makeSymbol( "NEW-CLASS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEQUENCE-CLASS" ),
            makeSymbol( "NEW-CLASS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-CLASS" ) ) );
    $sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD" );
    $str134$_SET_SEQUENCE_CLASS__S____S_is_no = makeString( "(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-SEQUENCE." );
    $sym135$BASIC_SEQUENCE_SET_SEQUENCE_CLASS_METHOD = makeSymbol( "BASIC-SEQUENCE-SET-SEQUENCE-CLASS-METHOD" );
    $sym136$VARIABLE_LENGTH_SEQUENCE = makeSymbol( "VARIABLE-LENGTH-SEQUENCE" );
    $list137 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DEFAULT-VALUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "SET-DEFAULT-VALUE" ), ConsesLow.list( makeSymbol( "NEW-DEFAULT-VALUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-GROWTH-FACTOR" ), NIL, makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-GROWTH-FACTOR" ), ConsesLow.list( makeSymbol( "NEW-GROWTH-FACTOR" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE = makeSymbol( "VARIABLE-LENGTH-SEQUENCE-TEMPLATE" );
    $list139 = ConsesLow.list( makeSymbol( "VARIABLE-LENGTH-SEQUENCE" ) );
    $list140 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "VARIABLE-LENGTH-SEQUENCE" ) ) );
    $list141 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "GET-LENGTH" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "&OPTIONAL" ), ConsesLow
            .list( makeSymbol( "OUT-OF-RANGE-VALUE" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol(
                "NEW-VALUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SUBSEQUENCE" ), ConsesLow.list( makeSymbol( "START-INDEX" ), makeSymbol( "&OPTIONAL" ),
                    ConsesLow.list( makeSymbol( "END-INDEX" ), NIL ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ),
                        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INTERNAL-STORAGE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "NEW-INTERNAL-STORAGE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STORAGE-SIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-STORAGE-SIZE" ),
                                    ConsesLow.list( makeSymbol( "NEW-STORAGE-SIZE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LARGEST-INDEX" ), NIL,
                                        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LARGEST-INDEX" ), ConsesLow.list( makeSymbol( "NEW-LARGEST-INDEX" ) ),
                                            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RECORD-INDEX" ), ConsesLow.list( makeSymbol( "CURRENT-INDEX" ) ), makeKeyword(
                                                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DEFAULT-VALUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DEFAULT-VALUE" ), ConsesLow.list( makeSymbol( "NEW-DEFAULT-VALUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-GROWTH-FACTOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                            "SET-GROWTH-FACTOR" ), ConsesLow.list( makeSymbol( "NEW-GROWTH-FACTOR" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                                makeSymbol( "ALLOCATE-ENUMERATOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                    "DEALLOCATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "OLD-ENUMERATOR" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "ALL-NULL-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                                            makeSymbol( "INDEX-OF-NEXT-NON-NIL-ELEMENT" ), ConsesLow.list( makeSymbol( "START-INDEX" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                                                                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INDEX-OF-PREVIOUS-NON-NIL-ELEMENT" ), ConsesLow.list( makeSymbol( "START-INDEX" ) ),
                                                                                makeKeyword( "PUBLIC" ) )
    } );
    $list142 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-STORAGE" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "TEMPLATE-SIZE" ), ConsesLow.list( makeSymbol( "GET-STORAGE-SIZE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-DEFAULT-VALUE" ), ConsesLow.list( makeSymbol(
            "GET-DEFAULT-VALUE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "TEMPLATE-INDEX" ), makeSymbol( "TEMPLATE-SIZE" ) ), ConsesLow.list( makeSymbol(
                "SET-AREF" ), makeSymbol( "TEMPLATE-STORAGE" ), makeSymbol( "TEMPLATE-INDEX" ), makeSymbol( "TEMPLATE-DEFAULT-VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-LARGEST-INDEX" ), makeSymbol( "SELF" ),
                    MINUS_ONE_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-DEFAULT-VALUE" ) ) ) );
    $list143 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "GET-LARGEST-INDEX" ), makeSymbol( "SELF" ) ), ONE_INTEGER ) ) );
    $list144 = ConsesLow.list( makeSymbol( "N" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "OUT-OF-RANGE-VALUE" ), NIL ) );
    $list145 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "N" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( ">" ),
        makeSymbol( "N" ), ConsesLow.list( makeSymbol( "GET-LARGEST-INDEX" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OUT-OF-RANGE-VALUE" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
            ConsesLow.list( makeSymbol( "AREF" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ) ), makeSymbol( "N" ) ) ) );
    $list146 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "N" ), ZERO_INTEGER ), makeString(
        "(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted." ), makeSymbol( "SELF" ), makeSymbol( "N" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
            "TEMPLATE-LARGEST-INDEX" ), ConsesLow.list( makeSymbol( "GET-LARGEST-INDEX" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-STORAGE-SIZE" ), ConsesLow.list( makeSymbol(
                "GET-STORAGE-SIZE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "N" ), makeSymbol( "TEMPLATE-STORAGE-SIZE" ) ), ConsesLow.list(
                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-NEW-STORAGE-SIZE" ), ConsesLow.list( makeSymbol( "*" ), ConsesLow.list( makeSymbol( "GET-GROWTH-FACTOR" ), makeSymbol(
                        "SELF" ) ), makeSymbol( "N" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-OLD-STORAGE" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                            "TEMPLATE-DEFAULT-VALUE" ), ConsesLow.list( makeSymbol( "GET-DEFAULT-VALUE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-NEW-STORAGE" ), ConsesLow.list( makeSymbol(
                                "MAKE-VECTOR" ), makeSymbol( "TEMPLATE-NEW-STORAGE-SIZE" ), makeSymbol( "TEMPLATE-DEFAULT-VALUE" ) ) ) ), ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol(
                                    "TEMPLATE-INDEX" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "TEMPLATE-LARGEST-INDEX" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "SET-AREF" ), makeSymbol(
                                        "TEMPLATE-NEW-STORAGE" ), makeSymbol( "TEMPLATE-INDEX" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "TEMPLATE-OLD-STORAGE" ), makeSymbol( "TEMPLATE-INDEX" ) ) ) ),
                    ConsesLow.list( makeSymbol( "RECORD-INDEX" ), makeSymbol( "SELF" ), makeSymbol( "N" ) ), ConsesLow.list( makeSymbol( "SET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ), makeSymbol(
                        "TEMPLATE-NEW-STORAGE" ) ), ConsesLow.list( makeSymbol( "SET-STORAGE-SIZE" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-NEW-STORAGE-SIZE" ) ), ConsesLow.list( makeSymbol( "SET-AREF" ),
                            makeSymbol( "TEMPLATE-NEW-STORAGE" ), makeSymbol( "N" ), makeSymbol( "NEW-VALUE" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "RECORD-INDEX" ), makeSymbol(
                                "SELF" ), makeSymbol( "N" ) ), ConsesLow.list( makeSymbol( "SET-AREF" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ) ), makeSymbol( "N" ), makeSymbol(
                                    "NEW-VALUE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-VALUE" ) ) ) );
    $list147 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "START-INDEX" ), ZERO_INTEGER ), makeString(
        "(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted." ), makeSymbol( "SELF" ), makeSymbol( "START-INDEX" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
            .list( makeSymbol( "TEMPLATE-LENGTH" ), ConsesLow.list( makeSymbol( "GET-LENGTH" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "END-INDEX" ), ConsesLow.list( makeSymbol(
                "CSETQ" ), makeSymbol( "END-INDEX" ), makeSymbol( "TEMPLATE-LENGTH" ) ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "<=" ), makeSymbol( "END-INDEX" ), makeSymbol(
                    "TEMPLATE-LENGTH" ) ), makeString( "(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence." ), makeSymbol( "END-INDEX" ), makeSymbol( "TEMPLATE-LENGTH" ) ), ConsesLow.list(
                        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CLASS" ), ConsesLow.list( makeSymbol( "GET-SEQUENCE-CLASS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                            "TEMPLATE-INSTANCE" ), ConsesLow.list( makeSymbol( "NEW-OBJECT-INSTANCE" ), makeSymbol( "TEMPLATE-CLASS" ) ) ), ConsesLow.list( makeSymbol( "TEMPLATE-ORIGINAL-INDEX" ), makeSymbol(
                                "START-INDEX" ) ), ConsesLow.list( makeSymbol( "TEMPLATE-INDEX-COUNT" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "END-INDEX" ), makeSymbol( "START-INDEX" ) ) ) ), ConsesLow.list(
                                    makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "TEMPLATE-INDEX" ), makeSymbol( "TEMPLATE-INDEX-COUNT" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                                        "TEMPLATE-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-NTH" ) ), makeSymbol( "TEMPLATE-INDEX" ), ConsesLow.list( makeSymbol( "GET-NTH" ), makeSymbol(
                                            "SELF" ), makeSymbol( "TEMPLATE-ORIGINAL-INDEX" ) ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "TEMPLATE-ORIGINAL-INDEX" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                makeSymbol( "TEMPLATE-INSTANCE" ) ) ) ) );
    $list148 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-NTH" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "GET-LARGEST-INDEX" ),
        makeSymbol( "SELF" ) ), ONE_INTEGER ), makeSymbol( "NEW-ELEMENT" ) ) ) );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR" ) ) ) ) ), ConsesLow.list( makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ),
            makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ) );
    $list150 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-P" ), makeSymbol( "OLD-ENUMERATOR" ) ), makeString(
        "(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR." ), makeSymbol( "SELF" ), makeSymbol( "OLD-ENUMERATOR" ) ), ConsesLow.list( makeSymbol(
            "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD" ), makeSymbol( "OLD-ENUMERATOR" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym151$ALL_NULL_P = makeSymbol( "ALL-NULL-P" );
    $list152 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-STORAGE" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "TEMPLATE-LENGTH" ), ConsesLow.list( makeSymbol( "GET-LENGTH" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "TEMPLATE-INDEX" ),
            makeSymbol( "TEMPLATE-LENGTH" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "TEMPLATE-STORAGE" ), makeSymbol( "TEMPLATE-INDEX" ) ), ConsesLow.list( makeSymbol(
                "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT = makeSymbol( "INDEX-OF-NEXT-NON-NIL-ELEMENT" );
    $list154 = ConsesLow.list( makeSymbol( "START-INDEX" ) );
    $list155 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
            .list( makeSymbol( "TEMPLATE-LENGTH" ), ConsesLow.list( makeSymbol( "GET-LENGTH" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ZEROP" ), makeSymbol(
                "TEMPLATE-LENGTH" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "START-INDEX" ), makeSymbol(
                    "TEMPLATE-LENGTH" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "START-INDEX" ), ConsesLow.list( makeSymbol( "MIN" ), ConsesLow.list(
                        makeSymbol( "MAX" ), makeSymbol( "START-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "TEMPLATE-LENGTH" ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                            ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-INDEX" ), makeSymbol( "START-INDEX" ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol(
                                "TEMPLATE-INDEX" ), makeSymbol( "TEMPLATE-LENGTH" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ), makeSymbol(
                                    "TEMPLATE-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-INDEX" ) ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "TEMPLATE-INDEX" ) ) ), ConsesLow.list(
                                        makeSymbol( "RET" ), NIL ) ) ) ) );
    $sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT = makeSymbol( "INDEX-OF-PREVIOUS-NON-NIL-ELEMENT" );
    $list157 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-STORAGE" ), makeSymbol(
        "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
            .list( makeSymbol( "TEMPLATE-LENGTH" ), ConsesLow.list( makeSymbol( "GET-LENGTH" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ZEROP" ), makeSymbol(
                "TEMPLATE-LENGTH" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "START-INDEX" ), ConsesLow.list( makeSymbol( "MIN" ), ConsesLow.list( makeSymbol(
                    "MAX" ), makeSymbol( "START-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "TEMPLATE-LENGTH" ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                        ConsesLow.list( makeSymbol( "TEMPLATE-INDEX" ), makeSymbol( "START-INDEX" ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "TEMPLATE-INDEX" ),
                            ZERO_INTEGER ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "TEMPLATE-INTERNAL-STORAGE" ), makeSymbol( "TEMPLATE-INDEX" ) ), ConsesLow.list(
                                makeSymbol( "RET" ), makeSymbol( "TEMPLATE-INDEX" ) ) ), ConsesLow.list( makeSymbol( "CDEC" ), makeSymbol( "TEMPLATE-INDEX" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ) );
    $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR" );
    $list159 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "SEQUENCE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CURRENT-INDEX" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "IGNORE-NULL-VALUES" ), makeKeyword( "BOOLEAN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SEEK-NON-NULL-FORWARD" ), NIL, makeKeyword(
                "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SEEK-NON-NULL-BACKWARD" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                    makeSymbol( "SET-SEQUENCE" ), ConsesLow.list( makeSymbol( "NEW-SEQUENCE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-IGNORE-NULL-VALUES" ),
                        NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-IGNORE-NULL-VALUES" ), ConsesLow.list( makeSymbol( "NEW-VALUE" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST-P" ), NIL, makeKeyword(
          "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LAST-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CURRENT" ), NIL,
              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIRST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                  "LAST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                      makeSymbol( "PREVIOUS" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym160$IGNORE_NULL_VALUES = makeSymbol( "IGNORE-NULL-VALUES" );
    $int161$4097 = makeInteger( 4097 );
    $sym162$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CLASS" );
    $sym163$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INSTANCE" );
    $list164 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEQUENCE" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "IGNORE-NULL-VALUES" ), T ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD" );
    $sym166$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD" );
    $sym167$SEEK_NON_NULL_FORWARD = makeSymbol( "SEEK-NON-NULL-FORWARD" );
    $list168 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-LENGTH" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LENGTH" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "CURRENT-LENGTH" ) ),
            ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "CURRENT-INDEX" ) ) ), ConsesLow.list( makeSymbol(
                "WHILE" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "INDEX" ), makeSymbol( "CURRENT-LENGTH" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                    makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NTH" ) ), makeSymbol( "INDEX" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol(
                        "INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "INDEX" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) );
    $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD" );
    $sym170$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_FORWARD_M = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-FORWARD-METHOD" );
    $sym171$SEEK_NON_NULL_BACKWARD = makeSymbol( "SEEK-NON-NULL-BACKWARD" );
    $list172 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INDEX" ), makeSymbol( "CURRENT-INDEX" ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "INDEX" ),
            ZERO_INTEGER ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-NTH" ) ),
                makeSymbol( "INDEX" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "CDEC" ),
                    makeSymbol( "INDEX" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD" );
    $sym174$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_BACKWARD_ = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-BACKWARD-METHOD" );
    $sym175$SET_SEQUENCE = makeSymbol( "SET-SEQUENCE" );
    $list176 = ConsesLow.list( makeSymbol( "NEW-SEQUENCE" ) );
    $list177 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEW-SEQUENCE" ) ), ConsesLow.list( makeSymbol(
        "VARIABLE-LENGTH-SEQUENCE-TEMPLATE-P" ), makeSymbol( "NEW-SEQUENCE" ) ) ), makeString( "(SET-SEQUENCE ~S): ~S is not an instance of a class that implements VARIABLE-LENGTH-SEQUENCE-TEMPLATE." ), makeSymbol(
            "SELF" ), makeSymbol( "NEW-SEQUENCE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEQUENCE" ), makeSymbol( "NEW-SEQUENCE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ),
                ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD" );
    $str179$_SET_SEQUENCE__S____S_is_not_an_i = makeString( "(SET-SEQUENCE ~S): ~S is not an instance of a class that implements VARIABLE-LENGTH-SEQUENCE-TEMPLATE." );
    $sym180$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_SEQUENCE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD" );
    $sym181$GET_IGNORE_NULL_VALUES = makeSymbol( "GET-IGNORE-NULL-VALUES" );
    $list182 = ConsesLow.list( makeKeyword( "READ-ONLY" ), makeKeyword( "PUBLIC" ) );
    $list183 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "IGNORE-NULL-VALUES" ) ) );
    $sym184$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_GET_IGNORE_NULL_VALUES_ = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-GET-IGNORE-NULL-VALUES-METHOD" );
    $sym185$SET_IGNORE_NULL_VALUES = makeSymbol( "SET-IGNORE-NULL-VALUES" );
    $list186 = ConsesLow.list( makeSymbol( "NEW-VALUE" ) );
    $list187 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "IGNORE-NULL-VALUES" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "NEW-VALUE" ), T, NIL ) ), ConsesLow.list( makeSymbol( "RET" ),
        makeSymbol( "IGNORE-NULL-VALUES" ) ) );
    $sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD" );
    $sym189$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_IGNORE_NULL_VALUES_ = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-IGNORE-NULL-VALUES-METHOD" );
    $list190 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "IGNORE-NULL-VALUES" ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ALL-NULL-P" ) ) ) ), ConsesLow.list(
            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-LENGTH" ) ) ), ZERO_INTEGER ) ) ) );
    $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD" );
    $sym192$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD" );
    $list193 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "IGNORE-NULL-VALUES" ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "CURRENT-INDEX" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "INDEX-OF-NEXT-NON-NIL-ELEMENT" ) ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "CURRENT-INDEX" ),
                ZERO_INTEGER ) ) ) );
    $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD" );
    $sym195$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_P_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-P-METHOD" );
    $list196 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LENGTH" ) ) ) ) ), ConsesLow.list( makeSymbol(
            "PIF" ), makeSymbol( "IGNORE-NULL-VALUES" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "CURRENT-INDEX" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INDEX-OF-PREVIOUS-NON-NIL-ELEMENT" ) ), makeSymbol( "LENGTH" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                    makeSymbol( "=" ), makeSymbol( "CURRENT-INDEX" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "LENGTH" ), ONE_INTEGER ) ) ) ) ) );
    $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD" );
    $sym198$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_P_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-P-METHOD" );
    $list199 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LENGTH" ) ) ) ) ), ConsesLow.list( makeSymbol(
            "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "CURRENT-INDEX" ),
                makeSymbol( "LENGTH" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "GET-NTH" ) ), makeSymbol( "CURRENT-INDEX" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD" );
    $sym201$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_CURRENT_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-METHOD" );
    $list202 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "IGNORE-NULL-VALUES" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIRST-INDEX" ), ConsesLow.list(
        makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INDEX-OF-NEXT-NON-NIL-ELEMENT" ) ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PIF" ),
            makeSymbol( "FIRST-INDEX" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "FIRST-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ),
                ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ),
                    makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ) ) );
    $sym203$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-METHOD" );
    $list204 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LENGTH" ) ) ) ) ), ConsesLow.list( makeSymbol(
            "PIF" ), makeSymbol( "IGNORE-NULL-VALUES" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LAST-INDEX" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INDEX-OF-PREVIOUS-NON-NIL-ELEMENT" ) ), makeSymbol( "LENGTH" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
                    "LAST-INDEX" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "LAST-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ),
                        ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ),
                            makeSymbol( "CURRENT-INDEX" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "LENGTH" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ),
                                makeSymbol( "SELF" ) ) ) ) ) ) );
    $sym205$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-METHOD" );
    $list206 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LENGTH" ) ) ) ) ), ConsesLow.list( makeSymbol(
            "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "LENGTH" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
                "IGNORE-NULL-VALUES" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEXT-INDEX" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INDEX-OF-NEXT-NON-NIL-ELEMENT" ) ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "CURRENT-INDEX" ), ONE_INTEGER ) ) ) ), ConsesLow.list(
                        makeSymbol( "PIF" ), makeSymbol( "NEXT-INDEX" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "NEXT-INDEX" ) ),
                            ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "PROGN" ),
                                ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "CURRENT-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ) ) ) );
    $sym207$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_NEXT_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-NEXT-METHOD" );
    $list208 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "<=" ),
        makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "IGNORE-NULL-VALUES" ), ConsesLow.list( makeSymbol( "CLET" ),
            ConsesLow.list( ConsesLow.list( makeSymbol( "PREVIOUS-INDEX" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SEQUENCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "INDEX-OF-PREVIOUS-NON-NIL-ELEMENT" ) ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "CURRENT-INDEX" ), ONE_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "PREVIOUS-INDEX" ),
                    ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CURRENT-INDEX" ), makeSymbol( "PREVIOUS-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                        makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CDEC" ), makeSymbol(
                            "CURRENT-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "SELF" ) ) ) ) ) );
    $sym209$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD" );
    $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE" );
    $list211 = ConsesLow.list( makeSymbol( "VARIABLE-LENGTH-SEQUENCE-TEMPLATE" ) );
    $list212 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "INTERNAL-STORAGE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "STORAGE-SIZE" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "LARGEST-INDEX" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEFAULT-VALUE" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "GROWTH-FACTOR" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "SEQUENCE-CLASS" ), makeKeyword(
                "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                        makeSymbol( "CLEAR" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LENGTH" ), NIL, makeKeyword(
                            "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "&OPTIONAL" ),
                                ConsesLow.list( makeSymbol( "OUT-OF-RANGE-VALUE" ), NIL ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                    makeSymbol( "SET-NTH" ), ConsesLow.list( makeSymbol( "N" ), makeSymbol( "NEW-VALUE" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SUBSEQUENCE" ), ConsesLow.list( makeSymbol( "START-INDEX" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "END-INDEX" ),
                                            NIL ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD" ), ConsesLow.list( makeSymbol(
                                                "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL,
                                                    makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INTERNAL-STORAGE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                                                        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "NEW-INTERNAL-STORAGE" ) ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STORAGE-SIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-STORAGE-SIZE" ),
          ConsesLow.list( makeSymbol( "NEW-STORAGE-SIZE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LARGEST-INDEX" ), NIL, makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LARGEST-INDEX" ), ConsesLow.list( makeSymbol( "NEW-LARGEST-INDEX" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "RECORD-INDEX" ), ConsesLow.list( makeSymbol( "CURRENT-INDEX" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
              "GET-DEFAULT-VALUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DEFAULT-VALUE" ), ConsesLow.list( makeSymbol( "NEW-DEFAULT-VALUE" ) ),
                  makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-GROWTH-FACTOR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                      makeSymbol( "SET-GROWTH-FACTOR" ), ConsesLow.list( makeSymbol( "NEW-GROWTH-FACTOR" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                          "GET-SEQUENCE-CLASS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-SEQUENCE-CLASS" ), ConsesLow.list( makeSymbol( "NEW-CLASS" ) ),
                              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ALLOCATE-ENUMERATOR" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEALLOCATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "OLD-ENUMERATOR" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ALL-NULL-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "INDEX-OF-NEXT-NON-NIL-ELEMENT" ), ConsesLow.list( makeSymbol( "START-INDEX" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "INDEX-OF-PREVIOUS-NON-NIL-ELEMENT" ), ConsesLow.list( makeSymbol( "START-INDEX" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym213$GROWTH_FACTOR = makeSymbol( "GROWTH-FACTOR" );
    $sym214$DEFAULT_VALUE = makeSymbol( "DEFAULT-VALUE" );
    $sym215$LARGEST_INDEX = makeSymbol( "LARGEST-INDEX" );
    $sym216$STORAGE_SIZE = makeSymbol( "STORAGE-SIZE" );
    $sym217$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_PREVIOUS_NON_NIL_ELEMENT_ = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-PREVIOUS-NON-NIL-ELEMENT-METHOD" );
    $sym218$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_NEXT_NON_NIL_ELEMENT_METH = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-NEXT-NON-NIL-ELEMENT-METHOD" );
    $sym219$BASIC_VARIABLE_LENGTH_SEQUENCE_ALL_NULL_P_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ALL-NULL-P-METHOD" );
    $str220$_DEALLOCATE_ENUMERATOR__S____S_is = makeString( "(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR." );
    $sym221$BASIC_VARIABLE_LENGTH_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD" );
    $sym222$BASIC_VARIABLE_LENGTH_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD" );
    $sym223$BASIC_VARIABLE_LENGTH_SEQUENCE_ADD_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-ADD-METHOD" );
    $str224$_GET_SUBSEQUENCE__S___Index__S_is = makeString( "(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted." );
    $str225$_GET_SUBSEQUENCE__S___End_index__ = makeString( "(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence." );
    $sym226$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SUBSEQUENCE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SUBSEQUENCE-METHOD" );
    $str227$_SET_NTH__S___Index__S_is_less_th = makeString( "(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted." );
    $sym228$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_NTH_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-NTH-METHOD" );
    $sym229$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_NTH_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-NTH-METHOD" );
    $sym230$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LENGTH_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LENGTH-METHOD" );
    $sym231$BASIC_VARIABLE_LENGTH_SEQUENCE_CLEAR_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-CLEAR-METHOD" );
    $sym232$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-CLASS" );
    $sym233$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_INSTAN = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-INSTANCE" );
    $list234 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "MAKE-VECTOR" ),
        TEN_INTEGER, NIL ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STORAGE-SIZE" ), TEN_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LARGEST-INDEX" ), MINUS_ONE_INTEGER ), ConsesLow.list(
            makeSymbol( "CSETQ" ), makeSymbol( "DEFAULT-VALUE" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GROWTH-FACTOR" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "SEQUENCE-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym236$BASIC_VARIABLE_LENGTH_SEQUENCE_INITIALIZE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-INITIALIZE-METHOD" );
    $list237 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "LARGEST-INDEX" ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol(
        "STREAM" ), makeString( "#<BASIC-VARIABLE-LENGTH-SEQUENCE: UNINITIALIZED>" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
            "=" ), makeSymbol( "LARGEST-INDEX" ), MINUS_ONE_INTEGER ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "[]" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "LARGEST-INDEX" ), ONE_INTEGER ) ) ), ConsesLow.list( makeSymbol(
            "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "LENGTH" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "[]" ) ), ConsesLow.list( makeSymbol( "RET" ),
                makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), makeSymbol( "LENGTH" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
                    makeString( "[~S]" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "INTERNAL-STORAGE" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list(
                        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "[~S" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol( "INTERNAL-STORAGE" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol(
                            "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), makeSymbol( "LARGEST-INDEX" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( ", ~S" ), ConsesLow.list(
                                makeSymbol( "AREF" ), makeSymbol( "INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "I" ), ONE_INTEGER ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol(
                                    "STREAM" ), makeString( "]" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $str239$__BASIC_VARIABLE_LENGTH_SEQUENCE_ = makeString( "#<BASIC-VARIABLE-LENGTH-SEQUENCE: UNINITIALIZED>" );
    $sym240$BASIC_VARIABLE_LENGTH_SEQUENCE_PRINT_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-PRINT-METHOD" );
    $sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym242$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_INTERNAL_STORAGE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-INTERNAL-STORAGE-METHOD" );
    $list243 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "INTERNAL-STORAGE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
        .list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "GET-LENGTH" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "ELEMENT" ), NIL ), ConsesLow.list( makeSymbol( "CONTENTS" ), NIL ) ), ConsesLow
            .list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), makeSymbol( "LENGTH" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "AREF" ), makeSymbol(
                "INTERNAL-STORAGE" ), makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ELEMENT" ), makeSymbol( "CONTENTS" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "CONTENTS" ) ) ) ) );
    $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym245$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_CONTENTS_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-CONTENTS-METHOD" );
    $list246 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "VECTORP" ), makeSymbol( "NEW-INTERNAL-STORAGE" ) ), makeString( "(SET-INTERNAL-STORAGE ~S): ~S is not a vector." ),
        makeSymbol( "SELF" ), makeSymbol( "NEW-INTERNAL-STORAGE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INTERNAL-STORAGE" ), makeSymbol( "NEW-INTERNAL-STORAGE" ) ), ConsesLow.list( makeSymbol( "RET" ),
            makeSymbol( "NEW-INTERNAL-STORAGE" ) ) );
    $sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $str248$_SET_INTERNAL_STORAGE__S____S_is_ = makeString( "(SET-INTERNAL-STORAGE ~S): ~S is not a vector." );
    $sym249$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_INTERNAL_STORAGE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-INTERNAL-STORAGE-METHOD" );
    $sym250$GET_STORAGE_SIZE = makeSymbol( "GET-STORAGE-SIZE" );
    $list251 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STORAGE-SIZE" ) ) );
    $sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym253$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_STORAGE_SIZE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-STORAGE-SIZE-METHOD" );
    $sym254$SET_STORAGE_SIZE = makeSymbol( "SET-STORAGE-SIZE" );
    $list255 = ConsesLow.list( makeSymbol( "NEW-STORAGE-SIZE" ) );
    $list256 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol( "NEW-STORAGE-SIZE" ) ), ConsesLow.list( makeSymbol( ">=" ),
        makeSymbol( "NEW-STORAGE-SIZE" ), ZERO_INTEGER ) ), makeString( "(SET-STORAGE-SIZE ~S): ~S is not a valid storage size.  A non-negative integer was expected." ), makeSymbol( "SELF" ), makeSymbol(
            "NEW-STORAGE-SIZE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STORAGE-SIZE" ), makeSymbol( "NEW-STORAGE-SIZE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-STORAGE-SIZE" ) ) );
    $sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $str258$_SET_STORAGE_SIZE__S____S_is_not_ = makeString( "(SET-STORAGE-SIZE ~S): ~S is not a valid storage size.  A non-negative integer was expected." );
    $sym259$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_STORAGE_SIZE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-STORAGE-SIZE-METHOD" );
    $sym260$GET_LARGEST_INDEX = makeSymbol( "GET-LARGEST-INDEX" );
    $list261 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LARGEST-INDEX" ) ) );
    $sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym263$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LARGEST_INDEX_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LARGEST-INDEX-METHOD" );
    $sym264$SET_LARGEST_INDEX = makeSymbol( "SET-LARGEST-INDEX" );
    $list265 = ConsesLow.list( makeSymbol( "NEW-LARGEST-INDEX" ) );
    $list266 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LARGEST-INDEX" ), makeSymbol( "NEW-LARGEST-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-LARGEST-INDEX" ) ) );
    $sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym268$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_LARGEST_INDEX_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-LARGEST-INDEX-METHOD" );
    $sym269$RECORD_INDEX = makeSymbol( "RECORD-INDEX" );
    $list270 = ConsesLow.list( makeSymbol( "CURRENT-INDEX" ) );
    $list271 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "INTEGERP" ), makeSymbol( "CURRENT-INDEX" ) ), ConsesLow.list( makeSymbol( ">=" ),
        makeSymbol( "CURRENT-INDEX" ), ZERO_INTEGER ) ), makeString( "(RECORD-INDEX ~S): ~S is not a valid index.  A non-negative integer was expected." ), makeSymbol( "SELF" ), makeSymbol( "CURRENT-INDEX" ) ), ConsesLow
            .list( makeSymbol( "CSETQ" ), makeSymbol( "LARGEST-INDEX" ), ConsesLow.list( makeSymbol( "MAX" ), makeSymbol( "LARGEST-INDEX" ), makeSymbol( "CURRENT-INDEX" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                makeSymbol( "LARGEST-INDEX" ) ) );
    $sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $str273$_RECORD_INDEX__S____S_is_not_a_va = makeString( "(RECORD-INDEX ~S): ~S is not a valid index.  A non-negative integer was expected." );
    $sym274$BASIC_VARIABLE_LENGTH_SEQUENCE_RECORD_INDEX_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-RECORD-INDEX-METHOD" );
    $sym275$GET_DEFAULT_VALUE = makeSymbol( "GET-DEFAULT-VALUE" );
    $list276 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DEFAULT-VALUE" ) ) );
    $sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym278$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_DEFAULT_VALUE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-DEFAULT-VALUE-METHOD" );
    $sym279$SET_DEFAULT_VALUE = makeSymbol( "SET-DEFAULT-VALUE" );
    $list280 = ConsesLow.list( makeSymbol( "NEW-DEFAULT-VALUE" ) );
    $list281 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEFAULT-VALUE" ), makeSymbol( "NEW-DEFAULT-VALUE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-DEFAULT-VALUE" ) ) );
    $sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym283$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_DEFAULT_VALUE_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-DEFAULT-VALUE-METHOD" );
    $sym284$GET_GROWTH_FACTOR = makeSymbol( "GET-GROWTH-FACTOR" );
    $list285 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "GROWTH-FACTOR" ) ) );
    $sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym287$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_GROWTH_FACTOR_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-GROWTH-FACTOR-METHOD" );
    $sym288$SET_GROWTH_FACTOR = makeSymbol( "SET-GROWTH-FACTOR" );
    $list289 = ConsesLow.list( makeSymbol( "NEW-GROWTH-FACTOR" ) );
    $list290 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeSymbol( "NEW-GROWTH-FACTOR" ) ), ConsesLow.list( makeSymbol( ">" ),
        makeSymbol( "NEW-GROWTH-FACTOR" ), makeDouble( 1.0 ) ) ), makeString( "(SET-GROWTH-FACTOR ~S): ~S is not a valid growth factor.  The growth factor must be a number > 1.0." ), makeSymbol( "SELF" ), makeSymbol(
            "NEW-GROWTH-FACTOR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GROWTH-FACTOR" ), makeSymbol( "NEW-GROWTH-FACTOR" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-GROWTH-FACTOR" ) ) );
    $sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $float292$1_0 = makeDouble( 1.0 );
    $str293$_SET_GROWTH_FACTOR__S____S_is_not = makeString( "(SET-GROWTH-FACTOR ~S): ~S is not a valid growth factor.  The growth factor must be a number > 1.0." );
    $sym294$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_GROWTH_FACTOR_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-GROWTH-FACTOR-METHOD" );
    $sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $sym296$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SEQUENCE_CLASS_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SEQUENCE-CLASS-METHOD" );
    $list297 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEW-CLASS" ) ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow
        .list( makeSymbol( "SYMBOLP" ), makeSymbol( "NEW-CLASS" ) ), ConsesLow.list( makeSymbol( "SUBCLASSP" ), makeSymbol( "NEW-CLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "BASIC-VARIABLE-LENGTH-SEQUENCE" ) ) ) ) ), makeString( "(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-VARIABLE-LENGTH-SEQUENCE." ), makeSymbol( "SELF" ), makeSymbol( "NEW-CLASS" ) ), ConsesLow.list(
                makeSymbol( "CSETQ" ), makeSymbol( "SEQUENCE-CLASS" ), makeSymbol( "NEW-CLASS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-CLASS" ) ) );
    $sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD" );
    $str299$_SET_SEQUENCE_CLASS__S____S_is_no = makeString( "(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-VARIABLE-LENGTH-SEQUENCE." );
    $sym300$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_SEQUENCE_CLASS_METHOD = makeSymbol( "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-SEQUENCE-CLASS-METHOD" );
    $sym301$FIXED_LENGTH_SEQUENCE = makeSymbol( "FIXED-LENGTH-SEQUENCE" );
    $list302 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LENGTH" ), ConsesLow.list( makeSymbol( "NEW-LENGTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DEFAULT-VALUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DEFAULT-VALUE" ), ConsesLow.list( makeSymbol(
            "NEW-DEFAULT-VALUE" ) ), makeKeyword( "PUBLIC" ) ) );
  }
}
/*
 * 
 * Total time: 1378 ms
 * 
 */