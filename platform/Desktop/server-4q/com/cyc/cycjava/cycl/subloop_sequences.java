package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class subloop_sequences extends SubLTranslatedFile
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
    public static SubLObject sequence_element_template_p(final SubLObject sequence_element_template) {
        return interfaces.subloop_instanceof_interface(sequence_element_template, (SubLObject)subloop_sequences.$sym0$SEQUENCE_ELEMENT_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 1585L)
    public static SubLObject sequence_p(final SubLObject sequence) {
        return interfaces.subloop_instanceof_interface(sequence, (SubLObject)subloop_sequences.$sym2$SEQUENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 2570L)
    public static SubLObject sequence_template_p(final SubLObject sequence_template) {
        return interfaces.subloop_instanceof_interface(sequence_template, (SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
    public static SubLObject get_basic_sequence_enumerator_current_index(final SubLObject basic_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence_enumerator, (SubLObject)subloop_sequences.THREE_INTEGER, (SubLObject)subloop_sequences.$sym36$CURRENT_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
    public static SubLObject set_basic_sequence_enumerator_current_index(final SubLObject basic_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence_enumerator, value, (SubLObject)subloop_sequences.THREE_INTEGER, (SubLObject)subloop_sequences.$sym36$CURRENT_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
    public static SubLObject get_basic_sequence_enumerator_length(final SubLObject basic_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence_enumerator, (SubLObject)subloop_sequences.TWO_INTEGER, (SubLObject)subloop_sequences.$sym37$LENGTH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
    public static SubLObject set_basic_sequence_enumerator_length(final SubLObject basic_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence_enumerator, value, (SubLObject)subloop_sequences.TWO_INTEGER, (SubLObject)subloop_sequences.$sym37$LENGTH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
    public static SubLObject get_basic_sequence_enumerator_shared_storage(final SubLObject basic_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence_enumerator, (SubLObject)subloop_sequences.ONE_INTEGER, (SubLObject)subloop_sequences.$sym38$SHARED_STORAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
    public static SubLObject set_basic_sequence_enumerator_shared_storage(final SubLObject basic_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence_enumerator, value, (SubLObject)subloop_sequences.ONE_INTEGER, (SubLObject)subloop_sequences.$sym38$SHARED_STORAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
    public static SubLObject subloop_reserved_initialize_basic_sequence_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym39$INSTANCE_COUNT, (SubLObject)subloop_sequences.ZERO_INTEGER);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
    public static SubLObject subloop_reserved_initialize_basic_sequence_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym41$ISOLATED_P, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym42$INSTANCE_NUMBER, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym38$SHARED_STORAGE, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym37$LENGTH, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym36$CURRENT_INDEX, (SubLObject)subloop_sequences.NIL);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6241L)
    public static SubLObject basic_sequence_enumerator_p(final SubLObject basic_sequence_enumerator) {
        return classes.subloop_instanceof_class(basic_sequence_enumerator, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 6925L)
    public static SubLObject basic_sequence_enumerator_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        SubLObject length = get_basic_sequence_enumerator_length(self);
        SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                object.object_initialize_method(self);
                shared_storage = (SubLObject)subloop_sequences.NIL;
                length = (SubLObject)subloop_sequences.MINUS_ONE_INTEGER;
                current_index = (SubLObject)subloop_sequences.ZERO_INTEGER;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7109L)
    public static SubLObject basic_sequence_enumerator_set_shared_storage_method(final SubLObject self, final SubLObject new_shared_storage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        SubLObject length = get_basic_sequence_enumerator_length(self);
        SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !new_shared_storage.isList()) {
                    Errors.error((SubLObject)subloop_sequences.$str53$_SET_SHARED_STORAGE__S____S_is_no, self, new_shared_storage);
                }
                shared_storage = new_shared_storage;
                current_index = (SubLObject)subloop_sequences.ZERO_INTEGER;
                length = Sequences.length(shared_storage);
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, new_shared_storage);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7459L)
    public static SubLObject basic_sequence_enumerator_empty_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, Numbers.numLE(length, (SubLObject)subloop_sequences.ZERO_INTEGER));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_enumerator_length(self, length);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7551L)
    public static SubLObject basic_sequence_enumerator_first_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE(current_index, (SubLObject)subloop_sequences.ZERO_INTEGER));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7649L)
    public static SubLObject basic_sequence_enumerator_last_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE(current_index, Numbers.subtract(length, (SubLObject)subloop_sequences.ONE_INTEGER)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7757L)
    public static SubLObject basic_sequence_enumerator_current_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        final SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (current_index.numGE((SubLObject)subloop_sequences.ZERO_INTEGER) && current_index.numL(length)) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, ConsesLow.nth(current_index, shared_storage));
                }
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 7947L)
    public static SubLObject basic_sequence_enumerator_first_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        final SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (length.numGE((SubLObject)subloop_sequences.ZERO_INTEGER)) {
                    current_index = (SubLObject)subloop_sequences.ZERO_INTEGER;
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, ConsesLow.nth((SubLObject)subloop_sequences.ZERO_INTEGER, shared_storage));
                }
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8112L)
    public static SubLObject basic_sequence_enumerator_last_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        final SubLObject shared_storage = get_basic_sequence_enumerator_shared_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (length.numGE((SubLObject)subloop_sequences.ZERO_INTEGER)) {
                    current_index = Numbers.subtract(length, (SubLObject)subloop_sequences.ONE_INTEGER);
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, ConsesLow.nth(current_index, shared_storage));
                }
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_enumerator_current_index(self, current_index);
                    set_basic_sequence_enumerator_length(self, length);
                    set_basic_sequence_enumerator_shared_storage(self, shared_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8299L)
    public static SubLObject basic_sequence_enumerator_next_method(final SubLObject self) {
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        final SubLObject length = get_basic_sequence_enumerator_length(self);
        if (current_index.numGE(length)) {
            return (SubLObject)subloop_sequences.NIL;
        }
        current_index = Numbers.add(current_index, (SubLObject)subloop_sequences.ONE_INTEGER);
        set_basic_sequence_enumerator_current_index(self, current_index);
        return basic_sequence_enumerator_current_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8471L)
    public static SubLObject basic_sequence_enumerator_previous_method(final SubLObject self) {
        SubLObject current_index = get_basic_sequence_enumerator_current_index(self);
        if (current_index.numLE((SubLObject)subloop_sequences.ZERO_INTEGER)) {
            return (SubLObject)subloop_sequences.NIL;
        }
        current_index = Numbers.subtract(current_index, (SubLObject)subloop_sequences.ONE_INTEGER);
        set_basic_sequence_enumerator_current_index(self, current_index);
        return basic_sequence_enumerator_current_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject get_basic_sequence_sequence_class(final SubLObject basic_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence, (SubLObject)subloop_sequences.TWO_INTEGER, (SubLObject)subloop_sequences.$sym89$SEQUENCE_CLASS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject set_basic_sequence_sequence_class(final SubLObject basic_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence, value, (SubLObject)subloop_sequences.TWO_INTEGER, (SubLObject)subloop_sequences.$sym89$SEQUENCE_CLASS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject get_basic_sequence_internal_storage(final SubLObject basic_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_sequence, (SubLObject)subloop_sequences.ONE_INTEGER, (SubLObject)subloop_sequences.$sym90$INTERNAL_STORAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject set_basic_sequence_internal_storage(final SubLObject basic_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_sequence, value, (SubLObject)subloop_sequences.ONE_INTEGER, (SubLObject)subloop_sequences.$sym90$INTERNAL_STORAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_deallocate_enumerator_method(final SubLObject self, final SubLObject old_enumerator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_sequences.NIL == basic_sequence_enumerator_p(old_enumerator)) {
            Errors.error((SubLObject)subloop_sequences.$str91$_DEALLOCATE_ENUMERATOR__S____S_is, self, old_enumerator);
        }
        basic_sequence_enumerator_set_shared_storage_method(old_enumerator, (SubLObject)subloop_sequences.NIL);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_allocate_enumerator_method(final SubLObject self) {
        final SubLObject template_internal_storage = basic_sequence_get_internal_storage_method(self);
        if (subloop_sequences.NIL != template_internal_storage) {
            final SubLObject template_enumerator = object.new_class_instance((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR);
            basic_sequence_enumerator_set_shared_storage_method(template_enumerator, template_internal_storage);
            return template_enumerator;
        }
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_get_contents_method(final SubLObject self) {
        SubLObject list_of_contents = (SubLObject)subloop_sequences.NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        for (cdotimes_end_var = basic_sequence_get_length_method(self), index = (SubLObject)subloop_sequences.NIL, index = (SubLObject)subloop_sequences.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)subloop_sequences.ONE_INTEGER)) {
            list_of_contents = (SubLObject)ConsesLow.cons(basic_sequence_get_nth_method(self, index, (SubLObject)subloop_sequences.UNPROVIDED), list_of_contents);
        }
        return Sequences.nreverse(list_of_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_add_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_internal_storage = basic_sequence_get_internal_storage_method(self);
        if (subloop_sequences.NIL == template_internal_storage) {
            basic_sequence_set_internal_storage_method(self, (SubLObject)ConsesLow.list(new_element));
            return new_element;
        }
        final SubLObject template_last_cons = conses_high.last(template_internal_storage, (SubLObject)subloop_sequences.UNPROVIDED);
        ConsesLow.rplacd(template_last_cons, (SubLObject)ConsesLow.list(new_element));
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_get_subsequence_method(final SubLObject self, final SubLObject start_index, SubLObject end_index) {
        if (end_index == subloop_sequences.UNPROVIDED) {
            end_index = (SubLObject)subloop_sequences.NIL;
        }
        final SubLObject template_class = basic_sequence_get_sequence_class_method(self);
        final SubLObject template_instance = object.new_object_instance(template_class);
        final SubLObject template_sublist = conses_high.nthcdr(start_index, basic_sequence_get_internal_storage_method(self));
        if (subloop_sequences.NIL != end_index) {
            SubLObject template_new_storage = (SubLObject)subloop_sequences.NIL;
            SubLObject template_pointer = template_sublist;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.subtract(end_index, start_index), i = (SubLObject)subloop_sequences.NIL, i = (SubLObject)subloop_sequences.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)subloop_sequences.ONE_INTEGER)) {
                template_new_storage = (SubLObject)ConsesLow.cons(template_pointer.first(), template_new_storage);
                template_pointer = template_pointer.rest();
            }
            methods.funcall_instance_method_with_1_args(template_instance, (SubLObject)subloop_sequences.$sym96$SET_INTERNAL_STORAGE, Sequences.nreverse(template_new_storage));
        }
        else {
            methods.funcall_instance_method_with_1_args(template_instance, (SubLObject)subloop_sequences.$sym96$SET_INTERNAL_STORAGE, conses_high.copy_list(template_sublist));
        }
        return template_instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_set_nth_method(final SubLObject self, final SubLObject n, final SubLObject new_value) {
        ConsesLow.set_nth(n, basic_sequence_get_internal_storage_method(self), new_value);
        return new_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_get_nth_method(final SubLObject self, final SubLObject n, SubLObject out_of_range_value) {
        if (out_of_range_value == subloop_sequences.UNPROVIDED) {
            out_of_range_value = (SubLObject)subloop_sequences.NIL;
        }
        if (n.numL((SubLObject)subloop_sequences.ZERO_INTEGER)) {
            return out_of_range_value;
        }
        SubLObject template_current_cons = basic_sequence_get_internal_storage_method(self);
        SubLObject template_index = (SubLObject)subloop_sequences.ZERO_INTEGER;
        while (subloop_sequences.NIL != template_current_cons) {
            if (n.numE(template_index)) {
                return template_current_cons.first();
            }
            template_index = Numbers.add(template_index, (SubLObject)subloop_sequences.ONE_INTEGER);
            template_current_cons = template_current_cons.rest();
        }
        return out_of_range_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_get_length_method(final SubLObject self) {
        return Sequences.length(basic_sequence_get_internal_storage_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_clear_method(final SubLObject self) {
        basic_sequence_set_internal_storage_method(self, (SubLObject)subloop_sequences.NIL);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject subloop_reserved_initialize_basic_sequence_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym39$INSTANCE_COUNT, (SubLObject)subloop_sequences.ZERO_INTEGER);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject subloop_reserved_initialize_basic_sequence_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym41$ISOLATED_P, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym42$INSTANCE_NUMBER, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym90$INTERNAL_STORAGE, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym89$SEQUENCE_CLASS, (SubLObject)subloop_sequences.NIL);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 8642L)
    public static SubLObject basic_sequence_p(final SubLObject basic_sequence) {
        return classes.subloop_instanceof_class(basic_sequence, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 9907L)
    public static SubLObject basic_sequence_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject sequence_class = get_basic_sequence_sequence_class(self);
        SubLObject internal_storage = get_basic_sequence_internal_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                object.object_initialize_method(self);
                internal_storage = (SubLObject)subloop_sequences.NIL;
                sequence_class = (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_sequence_class(self, sequence_class);
                    set_basic_sequence_internal_storage(self, internal_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10078L)
    public static SubLObject basic_sequence_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject internal_storage = get_basic_sequence_internal_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == internal_storage) {
                    PrintLow.format(stream, (SubLObject)subloop_sequences.$str111$__);
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
                }
                if (subloop_sequences.NIL == internal_storage.rest()) {
                    PrintLow.format(stream, (SubLObject)subloop_sequences.$str112$__S_, internal_storage.first());
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
                }
                PrintLow.format(stream, (SubLObject)subloop_sequences.$str113$__S, internal_storage.first());
                SubLObject cdolist_list_var = internal_storage.rest();
                SubLObject element = (SubLObject)subloop_sequences.NIL;
                element = cdolist_list_var.first();
                while (subloop_sequences.NIL != cdolist_list_var) {
                    PrintLow.format(stream, (SubLObject)subloop_sequences.$str114$___S, element);
                    cdolist_list_var = cdolist_list_var.rest();
                    element = cdolist_list_var.first();
                }
                PrintLow.format(stream, (SubLObject)subloop_sequences.$str115$_);
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_internal_storage(self, internal_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10505L)
    public static SubLObject basic_sequence_get_internal_storage_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject internal_storage = get_basic_sequence_internal_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, internal_storage);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_internal_storage(self, internal_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10605L)
    public static SubLObject basic_sequence_set_internal_storage_method(final SubLObject self, final SubLObject new_internal_storage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject internal_storage = get_basic_sequence_internal_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !new_internal_storage.isList()) {
                    Errors.error((SubLObject)subloop_sequences.$str124$_SET_INTERNAL_STORAGE__S____S_is_, self, new_internal_storage);
                }
                internal_storage = new_internal_storage;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, new_internal_storage);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_internal_storage(self, internal_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10896L)
    public static SubLObject basic_sequence_get_sequence_class_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject sequence_class = get_basic_sequence_sequence_class(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, sequence_class);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_sequence_class(self, sequence_class);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 10989L)
    public static SubLObject basic_sequence_set_sequence_class_method(final SubLObject self, final SubLObject new_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject sequence_class = get_basic_sequence_sequence_class(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_sequences.NIL != new_class && (!new_class.isSymbol() || subloop_sequences.NIL == classes.subclassp(new_class, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE))) {
                    Errors.error((SubLObject)subloop_sequences.$str134$_SET_SEQUENCE_CLASS__S____S_is_no, self, new_class);
                }
                sequence_class = new_class;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD, new_class);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_sequence_sequence_class(self, sequence_class);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 11319L)
    public static SubLObject variable_length_sequence_p(final SubLObject variable_length_sequence) {
        return interfaces.subloop_instanceof_interface(variable_length_sequence, (SubLObject)subloop_sequences.$sym136$VARIABLE_LENGTH_SEQUENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 11637L)
    public static SubLObject variable_length_sequence_template_p(final SubLObject variable_length_sequence_template) {
        return interfaces.subloop_instanceof_interface(variable_length_sequence_template, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
    public static SubLObject get_basic_variable_length_sequence_enumerator_current_index(final SubLObject basic_variable_length_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence_enumerator, (SubLObject)subloop_sequences.TWO_INTEGER, (SubLObject)subloop_sequences.$sym36$CURRENT_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
    public static SubLObject set_basic_variable_length_sequence_enumerator_current_index(final SubLObject basic_variable_length_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence_enumerator, value, (SubLObject)subloop_sequences.TWO_INTEGER, (SubLObject)subloop_sequences.$sym36$CURRENT_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
    public static SubLObject get_basic_variable_length_sequence_enumerator_sequence(final SubLObject basic_variable_length_sequence_enumerator) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence_enumerator, (SubLObject)subloop_sequences.ONE_INTEGER, (SubLObject)subloop_sequences.$sym2$SEQUENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
    public static SubLObject set_basic_variable_length_sequence_enumerator_sequence(final SubLObject basic_variable_length_sequence_enumerator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence_enumerator, value, (SubLObject)subloop_sequences.ONE_INTEGER, (SubLObject)subloop_sequences.$sym2$SEQUENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
    public static SubLObject get_basic_variable_length_sequence_enumerator_ignore_null_values(final SubLObject basic_variable_length_sequence_enumerator) {
        final SubLObject v_class = subloop_structures.instance_class(basic_variable_length_sequence_enumerator);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_sequences.$sym160$IGNORE_NULL_VALUES, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_variable_length_sequence_enumerator, slot);
        return classes.ldb_test((SubLObject)subloop_sequences.$int161$4097, subloop_structures.instance_boolean_slots(basic_variable_length_sequence_enumerator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
    public static SubLObject set_basic_variable_length_sequence_enumerator_ignore_null_values(final SubLObject basic_variable_length_sequence_enumerator, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_variable_length_sequence_enumerator);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_sequences.$sym160$IGNORE_NULL_VALUES, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_variable_length_sequence_enumerator, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_variable_length_sequence_enumerator, bytes.dpb((SubLObject)((subloop_sequences.NIL != value) ? subloop_sequences.ONE_INTEGER : subloop_sequences.ZERO_INTEGER), (SubLObject)subloop_sequences.$int161$4097, subloop_structures.instance_boolean_slots(basic_variable_length_sequence_enumerator)));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
    public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym39$INSTANCE_COUNT, (SubLObject)subloop_sequences.ZERO_INTEGER);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
    public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_enumerator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym41$ISOLATED_P, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym160$IGNORE_NULL_VALUES, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym42$INSTANCE_NUMBER, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym2$SEQUENCE, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym36$CURRENT_INDEX, (SubLObject)subloop_sequences.NIL);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 18648L)
    public static SubLObject basic_variable_length_sequence_enumerator_p(final SubLObject basic_variable_length_sequence_enumerator) {
        return classes.subloop_instanceof_class(basic_variable_length_sequence_enumerator, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 19597L)
    public static SubLObject basic_variable_length_sequence_enumerator_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                object.object_initialize_method(self);
                sequence = (SubLObject)subloop_sequences.NIL;
                current_index = (SubLObject)subloop_sequences.ZERO_INTEGER;
                ignore_null_values = (SubLObject)subloop_sequences.T;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 19803L)
    public static SubLObject basic_variable_length_sequence_enumerator_seek_non_null_forward_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                final SubLObject current_length = methods.funcall_instance_method_with_0_args(sequence, (SubLObject)subloop_sequences.$sym37$LENGTH);
                if (current_index.numGE(current_length)) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
                }
                for (SubLObject index = current_index; index.numL(current_length); index = Numbers.add(index, (SubLObject)subloop_sequences.ONE_INTEGER)) {
                    if (subloop_sequences.NIL != methods.funcall_instance_method_with_1_args(sequence, (SubLObject)subloop_sequences.$sym15$GET_NTH, index)) {
                        current_index = index;
                        Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.T);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 20244L)
    public static SubLObject basic_variable_length_sequence_enumerator_seek_non_null_backward_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (current_index.numE((SubLObject)subloop_sequences.ZERO_INTEGER)) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
                }
                for (SubLObject index = current_index; index.numGE((SubLObject)subloop_sequences.ZERO_INTEGER); index = Numbers.subtract(index, (SubLObject)subloop_sequences.ONE_INTEGER)) {
                    if (subloop_sequences.NIL != methods.funcall_instance_method_with_1_args(sequence, (SubLObject)subloop_sequences.$sym15$GET_NTH, index)) {
                        current_index = index;
                        Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.T);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 20585L)
    public static SubLObject basic_variable_length_sequence_enumerator_set_sequence_method(final SubLObject self, final SubLObject new_sequence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_sequences.NIL != new_sequence && subloop_sequences.NIL == variable_length_sequence_template_p(new_sequence)) {
                    Errors.error((SubLObject)subloop_sequences.$str179$_SET_SEQUENCE__S____S_is_not_an_i, self, new_sequence);
                }
                sequence = new_sequence;
                current_index = (SubLObject)subloop_sequences.ZERO_INTEGER;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 20982L)
    public static SubLObject basic_variable_length_sequence_enumerator_get_ignore_null_values_method(final SubLObject self) {
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        return ignore_null_values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 21121L)
    public static SubLObject basic_variable_length_sequence_enumerator_set_ignore_null_values_method(final SubLObject self, final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                ignore_null_values = (SubLObject)((subloop_sequences.NIL != new_value) ? subloop_sequences.T : subloop_sequences.NIL);
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, ignore_null_values);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 21309L)
    public static SubLObject basic_variable_length_sequence_enumerator_empty_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (subloop_sequences.NIL == sequence) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.T);
                }
                if (subloop_sequences.NIL != ignore_null_values) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, methods.funcall_instance_method_with_0_args(sequence, (SubLObject)subloop_sequences.$sym151$ALL_NULL_P));
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE(methods.funcall_instance_method_with_0_args(sequence, (SubLObject)subloop_sequences.$sym13$GET_LENGTH), (SubLObject)subloop_sequences.ZERO_INTEGER));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 21577L)
    public static SubLObject basic_variable_length_sequence_enumerator_first_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (subloop_sequences.NIL == sequence) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
                }
                if (subloop_sequences.NIL != ignore_null_values) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE(current_index, methods.funcall_instance_method_with_1_args(sequence, (SubLObject)subloop_sequences.$sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, (SubLObject)subloop_sequences.ZERO_INTEGER)));
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE(current_index, (SubLObject)subloop_sequences.ZERO_INTEGER));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 21853L)
    public static SubLObject basic_variable_length_sequence_enumerator_last_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (subloop_sequences.NIL == sequence) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
                }
                final SubLObject length = methods.funcall_instance_method_with_0_args(sequence, (SubLObject)subloop_sequences.$sym13$GET_LENGTH);
                if (subloop_sequences.NIL != ignore_null_values) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE(current_index, methods.funcall_instance_method_with_1_args(sequence, (SubLObject)subloop_sequences.$sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, length)));
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, Numbers.numE(current_index, Numbers.subtract(length, (SubLObject)subloop_sequences.ONE_INTEGER)));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    set_basic_variable_length_sequence_enumerator_ignore_null_values(self, ignore_null_values);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 22207L)
    public static SubLObject basic_variable_length_sequence_enumerator_current_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_enumerator_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
            try {
                if (subloop_sequences.NIL == sequence) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
                }
                final SubLObject length = methods.funcall_instance_method_with_0_args(sequence, (SubLObject)subloop_sequences.$sym13$GET_LENGTH);
                if (current_index.numGE((SubLObject)subloop_sequences.ZERO_INTEGER) && current_index.numL(length)) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, methods.funcall_instance_method_with_1_args(sequence, (SubLObject)subloop_sequences.$sym15$GET_NTH, current_index));
                }
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD, (SubLObject)subloop_sequences.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
                    set_basic_variable_length_sequence_enumerator_sequence(self, sequence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_enumerator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_enumerator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 22538L)
    public static SubLObject basic_variable_length_sequence_enumerator_first_method(final SubLObject self) {
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        if (subloop_sequences.NIL == ignore_null_values) {
            current_index = (SubLObject)subloop_sequences.ZERO_INTEGER;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        final SubLObject first_index = methods.funcall_instance_method_with_1_args(sequence, (SubLObject)subloop_sequences.$sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, (SubLObject)subloop_sequences.ZERO_INTEGER);
        if (subloop_sequences.NIL != first_index) {
            current_index = first_index;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 22943L)
    public static SubLObject basic_variable_length_sequence_enumerator_last_method(final SubLObject self) {
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        if (subloop_sequences.NIL == sequence) {
            return (SubLObject)subloop_sequences.NIL;
        }
        final SubLObject length = methods.funcall_instance_method_with_0_args(sequence, (SubLObject)subloop_sequences.$sym13$GET_LENGTH);
        if (subloop_sequences.NIL == ignore_null_values) {
            current_index = Numbers.subtract(length, (SubLObject)subloop_sequences.ONE_INTEGER);
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        final SubLObject last_index = methods.funcall_instance_method_with_1_args(sequence, (SubLObject)subloop_sequences.$sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, length);
        if (subloop_sequences.NIL != last_index) {
            current_index = last_index;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 23446L)
    public static SubLObject basic_variable_length_sequence_enumerator_next_method(final SubLObject self) {
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        if (subloop_sequences.NIL == sequence) {
            return (SubLObject)subloop_sequences.NIL;
        }
        final SubLObject length = methods.funcall_instance_method_with_0_args(sequence, (SubLObject)subloop_sequences.$sym13$GET_LENGTH);
        if (current_index.numGE(length)) {
            return (SubLObject)subloop_sequences.NIL;
        }
        if (subloop_sequences.NIL == ignore_null_values) {
            current_index = Numbers.add(current_index, (SubLObject)subloop_sequences.ONE_INTEGER);
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        final SubLObject next_index = methods.funcall_instance_method_with_1_args(sequence, (SubLObject)subloop_sequences.$sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, Numbers.add(current_index, (SubLObject)subloop_sequences.ONE_INTEGER));
        if (subloop_sequences.NIL != next_index) {
            current_index = next_index;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24005L)
    public static SubLObject basic_variable_length_sequence_enumerator_previous_method(final SubLObject self) {
        SubLObject current_index = get_basic_variable_length_sequence_enumerator_current_index(self);
        final SubLObject sequence = get_basic_variable_length_sequence_enumerator_sequence(self);
        final SubLObject ignore_null_values = get_basic_variable_length_sequence_enumerator_ignore_null_values(self);
        if (subloop_sequences.NIL == sequence) {
            return (SubLObject)subloop_sequences.NIL;
        }
        if (current_index.numLE((SubLObject)subloop_sequences.ZERO_INTEGER)) {
            return (SubLObject)subloop_sequences.NIL;
        }
        if (subloop_sequences.NIL == ignore_null_values) {
            current_index = Numbers.subtract(current_index, (SubLObject)subloop_sequences.ONE_INTEGER);
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        final SubLObject previous_index = methods.funcall_instance_method_with_1_args(sequence, (SubLObject)subloop_sequences.$sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, Numbers.subtract(current_index, (SubLObject)subloop_sequences.ONE_INTEGER));
        if (subloop_sequences.NIL != previous_index) {
            current_index = previous_index;
            set_basic_variable_length_sequence_enumerator_current_index(self, current_index);
            return basic_variable_length_sequence_enumerator_current_method(self);
        }
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject get_basic_variable_length_sequence_sequence_class(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, (SubLObject)subloop_sequences.SIX_INTEGER, (SubLObject)subloop_sequences.$sym89$SEQUENCE_CLASS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject set_basic_variable_length_sequence_sequence_class(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, (SubLObject)subloop_sequences.SIX_INTEGER, (SubLObject)subloop_sequences.$sym89$SEQUENCE_CLASS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject get_basic_variable_length_sequence_growth_factor(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, (SubLObject)subloop_sequences.FIVE_INTEGER, (SubLObject)subloop_sequences.$sym213$GROWTH_FACTOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject set_basic_variable_length_sequence_growth_factor(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, (SubLObject)subloop_sequences.FIVE_INTEGER, (SubLObject)subloop_sequences.$sym213$GROWTH_FACTOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject get_basic_variable_length_sequence_default_value(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, (SubLObject)subloop_sequences.FOUR_INTEGER, (SubLObject)subloop_sequences.$sym214$DEFAULT_VALUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject set_basic_variable_length_sequence_default_value(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, (SubLObject)subloop_sequences.FOUR_INTEGER, (SubLObject)subloop_sequences.$sym214$DEFAULT_VALUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject get_basic_variable_length_sequence_largest_index(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, (SubLObject)subloop_sequences.THREE_INTEGER, (SubLObject)subloop_sequences.$sym215$LARGEST_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject set_basic_variable_length_sequence_largest_index(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, (SubLObject)subloop_sequences.THREE_INTEGER, (SubLObject)subloop_sequences.$sym215$LARGEST_INDEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject get_basic_variable_length_sequence_storage_size(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, (SubLObject)subloop_sequences.TWO_INTEGER, (SubLObject)subloop_sequences.$sym216$STORAGE_SIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject set_basic_variable_length_sequence_storage_size(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, (SubLObject)subloop_sequences.TWO_INTEGER, (SubLObject)subloop_sequences.$sym216$STORAGE_SIZE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject get_basic_variable_length_sequence_internal_storage(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_get_access_protected_instance_slot(basic_variable_length_sequence, (SubLObject)subloop_sequences.ONE_INTEGER, (SubLObject)subloop_sequences.$sym90$INTERNAL_STORAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject set_basic_variable_length_sequence_internal_storage(final SubLObject basic_variable_length_sequence, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_variable_length_sequence, value, (SubLObject)subloop_sequences.ONE_INTEGER, (SubLObject)subloop_sequences.$sym90$INTERNAL_STORAGE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_index_of_previous_non_nil_element_method(final SubLObject self, SubLObject start_index) {
        final SubLObject template_internal_storage = basic_variable_length_sequence_get_internal_storage_method(self);
        if (subloop_sequences.NIL == template_internal_storage) {
            return (SubLObject)subloop_sequences.NIL;
        }
        final SubLObject template_length = basic_variable_length_sequence_get_length_method(self);
        if (template_length.isZero()) {
            return (SubLObject)subloop_sequences.NIL;
        }
        SubLObject template_index;
        for (start_index = (template_index = Numbers.min(Numbers.max(start_index, (SubLObject)subloop_sequences.ZERO_INTEGER), Numbers.subtract(template_length, (SubLObject)subloop_sequences.ONE_INTEGER))); template_index.numGE((SubLObject)subloop_sequences.ZERO_INTEGER); template_index = Numbers.subtract(template_index, (SubLObject)subloop_sequences.ONE_INTEGER)) {
            if (subloop_sequences.NIL != Vectors.aref(template_internal_storage, template_index)) {
                return template_index;
            }
        }
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_index_of_next_non_nil_element_method(final SubLObject self, SubLObject start_index) {
        final SubLObject template_internal_storage = basic_variable_length_sequence_get_internal_storage_method(self);
        if (subloop_sequences.NIL == template_internal_storage) {
            return (SubLObject)subloop_sequences.NIL;
        }
        final SubLObject template_length = basic_variable_length_sequence_get_length_method(self);
        if (template_length.isZero()) {
            return (SubLObject)subloop_sequences.NIL;
        }
        if (start_index.numGE(template_length)) {
            return (SubLObject)subloop_sequences.NIL;
        }
        SubLObject template_index;
        for (start_index = (template_index = Numbers.min(Numbers.max(start_index, (SubLObject)subloop_sequences.ZERO_INTEGER), Numbers.subtract(template_length, (SubLObject)subloop_sequences.ONE_INTEGER))); template_index.numL(template_length); template_index = Numbers.add(template_index, (SubLObject)subloop_sequences.ONE_INTEGER)) {
            if (subloop_sequences.NIL != Vectors.aref(template_internal_storage, template_index)) {
                return template_index;
            }
        }
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_all_null_p_method(final SubLObject self) {
        final SubLObject template_storage = basic_variable_length_sequence_get_internal_storage_method(self);
        SubLObject template_length;
        SubLObject template_index;
        for (template_length = basic_variable_length_sequence_get_length_method(self), template_index = (SubLObject)subloop_sequences.NIL, template_index = (SubLObject)subloop_sequences.ZERO_INTEGER; template_index.numL(template_length); template_index = Numbers.add(template_index, (SubLObject)subloop_sequences.ONE_INTEGER)) {
            if (subloop_sequences.NIL != Vectors.aref(template_storage, template_index)) {
                return (SubLObject)subloop_sequences.NIL;
            }
        }
        return (SubLObject)subloop_sequences.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_deallocate_enumerator_method(final SubLObject self, final SubLObject old_enumerator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_sequences.NIL == basic_variable_length_sequence_enumerator_p(old_enumerator)) {
            Errors.error((SubLObject)subloop_sequences.$str220$_DEALLOCATE_ENUMERATOR__S____S_is, self, old_enumerator);
        }
        basic_variable_length_sequence_enumerator_set_sequence_method(old_enumerator, (SubLObject)subloop_sequences.NIL);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_allocate_enumerator_method(final SubLObject self) {
        final SubLObject template_enumerator = object.new_class_instance((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR);
        basic_variable_length_sequence_enumerator_set_sequence_method(template_enumerator, self);
        return template_enumerator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_add_method(final SubLObject self, final SubLObject new_element) {
        return basic_variable_length_sequence_set_nth_method(self, Numbers.add(basic_variable_length_sequence_get_largest_index_method(self), (SubLObject)subloop_sequences.ONE_INTEGER), new_element);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_get_subsequence_method(final SubLObject self, final SubLObject start_index, SubLObject end_index) {
        if (end_index == subloop_sequences.UNPROVIDED) {
            end_index = (SubLObject)subloop_sequences.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !start_index.numGE((SubLObject)subloop_sequences.ZERO_INTEGER)) {
            Errors.error((SubLObject)subloop_sequences.$str224$_GET_SUBSEQUENCE__S___Index__S_is, self, start_index);
        }
        final SubLObject template_length = basic_variable_length_sequence_get_length_method(self);
        if (subloop_sequences.NIL == end_index) {
            end_index = template_length;
        }
        if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !end_index.numLE(template_length)) {
            Errors.error((SubLObject)subloop_sequences.$str225$_GET_SUBSEQUENCE__S___End_index__, end_index, template_length);
        }
        final SubLObject template_class = basic_variable_length_sequence_get_sequence_class_method(self);
        final SubLObject template_instance = object.new_object_instance(template_class);
        SubLObject template_original_index = start_index;
        SubLObject template_index_count;
        SubLObject template_index;
        for (template_index_count = Numbers.subtract(end_index, start_index), template_index = (SubLObject)subloop_sequences.NIL, template_index = (SubLObject)subloop_sequences.ZERO_INTEGER; template_index.numL(template_index_count); template_index = Numbers.add(template_index, (SubLObject)subloop_sequences.ONE_INTEGER)) {
            methods.funcall_instance_method_with_2_args(template_instance, (SubLObject)subloop_sequences.$sym18$SET_NTH, template_index, basic_variable_length_sequence_get_nth_method(self, template_original_index, (SubLObject)subloop_sequences.UNPROVIDED));
            template_original_index = Numbers.add(template_original_index, (SubLObject)subloop_sequences.ONE_INTEGER);
        }
        return template_instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_set_nth_method(final SubLObject self, final SubLObject n, final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !n.numGE((SubLObject)subloop_sequences.ZERO_INTEGER)) {
            Errors.error((SubLObject)subloop_sequences.$str227$_SET_NTH__S___Index__S_is_less_th, self, n);
        }
        final SubLObject template_largest_index = basic_variable_length_sequence_get_largest_index_method(self);
        final SubLObject template_storage_size = basic_variable_length_sequence_get_storage_size_method(self);
        if (n.numGE(template_storage_size)) {
            final SubLObject template_new_storage_size = Numbers.multiply(basic_variable_length_sequence_get_growth_factor_method(self), n);
            final SubLObject template_old_storage = basic_variable_length_sequence_get_internal_storage_method(self);
            final SubLObject template_default_value = basic_variable_length_sequence_get_default_value_method(self);
            final SubLObject template_new_storage = Vectors.make_vector(template_new_storage_size, template_default_value);
            SubLObject cdotimes_end_var;
            SubLObject template_index;
            for (cdotimes_end_var = Numbers.add(template_largest_index, (SubLObject)subloop_sequences.ONE_INTEGER), template_index = (SubLObject)subloop_sequences.NIL, template_index = (SubLObject)subloop_sequences.ZERO_INTEGER; template_index.numL(cdotimes_end_var); template_index = Numbers.add(template_index, (SubLObject)subloop_sequences.ONE_INTEGER)) {
                Vectors.set_aref(template_new_storage, template_index, Vectors.aref(template_old_storage, template_index));
            }
            basic_variable_length_sequence_record_index_method(self, n);
            basic_variable_length_sequence_set_internal_storage_method(self, template_new_storage);
            basic_variable_length_sequence_set_storage_size_method(self, template_new_storage_size);
            Vectors.set_aref(template_new_storage, n, new_value);
        }
        else {
            basic_variable_length_sequence_record_index_method(self, n);
            Vectors.set_aref(basic_variable_length_sequence_get_internal_storage_method(self), n, new_value);
        }
        return new_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_get_nth_method(final SubLObject self, final SubLObject n, SubLObject out_of_range_value) {
        if (out_of_range_value == subloop_sequences.UNPROVIDED) {
            out_of_range_value = (SubLObject)subloop_sequences.NIL;
        }
        if (n.numL((SubLObject)subloop_sequences.ZERO_INTEGER) || n.numG(basic_variable_length_sequence_get_largest_index_method(self))) {
            return out_of_range_value;
        }
        return Vectors.aref(basic_variable_length_sequence_get_internal_storage_method(self), n);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_get_length_method(final SubLObject self) {
        return Numbers.add(basic_variable_length_sequence_get_largest_index_method(self), (SubLObject)subloop_sequences.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_clear_method(final SubLObject self) {
        final SubLObject template_storage = basic_variable_length_sequence_get_internal_storage_method(self);
        final SubLObject template_size = basic_variable_length_sequence_get_storage_size_method(self);
        final SubLObject template_default_value = basic_variable_length_sequence_get_default_value_method(self);
        SubLObject template_index;
        for (template_index = (SubLObject)subloop_sequences.NIL, template_index = (SubLObject)subloop_sequences.ZERO_INTEGER; template_index.numL(template_size); template_index = Numbers.add(template_index, (SubLObject)subloop_sequences.ONE_INTEGER)) {
            Vectors.set_aref(template_storage, template_index, template_default_value);
        }
        basic_variable_length_sequence_set_largest_index_method(self, (SubLObject)subloop_sequences.MINUS_ONE_INTEGER);
        return template_default_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym39$INSTANCE_COUNT, (SubLObject)subloop_sequences.ZERO_INTEGER);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject subloop_reserved_initialize_basic_variable_length_sequence_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym41$ISOLATED_P, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$sym42$INSTANCE_NUMBER, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym90$INTERNAL_STORAGE, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym216$STORAGE_SIZE, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym215$LARGEST_INDEX, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym214$DEFAULT_VALUE, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym213$GROWTH_FACTOR, (SubLObject)subloop_sequences.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym89$SEQUENCE_CLASS, (SubLObject)subloop_sequences.NIL);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 24515L)
    public static SubLObject basic_variable_length_sequence_p(final SubLObject basic_variable_length_sequence) {
        return classes.subloop_instanceof_class(basic_variable_length_sequence, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 26770L)
    public static SubLObject basic_variable_length_sequence_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject sequence_class = get_basic_variable_length_sequence_sequence_class(self);
        SubLObject growth_factor = get_basic_variable_length_sequence_growth_factor(self);
        SubLObject default_value = get_basic_variable_length_sequence_default_value(self);
        SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        SubLObject storage_size = get_basic_variable_length_sequence_storage_size(self);
        SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                object.object_initialize_method(self);
                internal_storage = Vectors.make_vector((SubLObject)subloop_sequences.TEN_INTEGER, (SubLObject)subloop_sequences.NIL);
                storage_size = (SubLObject)subloop_sequences.TEN_INTEGER;
                largest_index = (SubLObject)subloop_sequences.MINUS_ONE_INTEGER;
                default_value = (SubLObject)subloop_sequences.NIL;
                growth_factor = (SubLObject)subloop_sequences.TWO_INTEGER;
                sequence_class = (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_sequence_class(self, sequence_class);
                    set_basic_variable_length_sequence_growth_factor(self, growth_factor);
                    set_basic_variable_length_sequence_default_value(self, default_value);
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    set_basic_variable_length_sequence_storage_size(self, storage_size);
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 27097L)
    public static SubLObject basic_variable_length_sequence_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        final SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == largest_index) {
                    PrintLow.format(stream, (SubLObject)subloop_sequences.$str239$__BASIC_VARIABLE_LENGTH_SEQUENCE_);
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                }
                if (largest_index.numE((SubLObject)subloop_sequences.MINUS_ONE_INTEGER)) {
                    PrintLow.format(stream, (SubLObject)subloop_sequences.$str111$__);
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                }
                final SubLObject length = Numbers.add(largest_index, (SubLObject)subloop_sequences.ONE_INTEGER);
                if (length.numE((SubLObject)subloop_sequences.ZERO_INTEGER)) {
                    PrintLow.format(stream, (SubLObject)subloop_sequences.$str111$__);
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                }
                if (length.numE((SubLObject)subloop_sequences.ONE_INTEGER)) {
                    PrintLow.format(stream, (SubLObject)subloop_sequences.$str112$__S_, Vectors.aref(internal_storage, (SubLObject)subloop_sequences.ZERO_INTEGER));
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
                }
                PrintLow.format(stream, (SubLObject)subloop_sequences.$str113$__S, Vectors.aref(internal_storage, (SubLObject)subloop_sequences.ZERO_INTEGER));
                SubLObject i;
                for (i = (SubLObject)subloop_sequences.NIL, i = (SubLObject)subloop_sequences.ZERO_INTEGER; i.numL(largest_index); i = Numbers.add(i, (SubLObject)subloop_sequences.ONE_INTEGER)) {
                    PrintLow.format(stream, (SubLObject)subloop_sequences.$str114$___S, Vectors.aref(internal_storage, Numbers.add(i, (SubLObject)subloop_sequences.ONE_INTEGER)));
                }
                PrintLow.format(stream, (SubLObject)subloop_sequences.$str115$_);
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 27747L)
    public static SubLObject basic_variable_length_sequence_get_internal_storage_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, internal_storage);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 27863L)
    public static SubLObject basic_variable_length_sequence_get_contents_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == internal_storage) {
                    Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, (SubLObject)subloop_sequences.NIL);
                }
                final SubLObject length = basic_variable_length_sequence_get_length_method(self);
                SubLObject element = (SubLObject)subloop_sequences.NIL;
                SubLObject contents = (SubLObject)subloop_sequences.NIL;
                SubLObject i;
                for (i = (SubLObject)subloop_sequences.NIL, i = (SubLObject)subloop_sequences.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)subloop_sequences.ONE_INTEGER)) {
                    element = Vectors.aref(internal_storage, i);
                    if (subloop_sequences.NIL != element) {
                        contents = (SubLObject)ConsesLow.cons(element, contents);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, Sequences.nreverse(contents));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 28204L)
    public static SubLObject basic_variable_length_sequence_set_internal_storage_method(final SubLObject self, final SubLObject new_internal_storage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject internal_storage = get_basic_variable_length_sequence_internal_storage(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !new_internal_storage.isVector()) {
                    Errors.error((SubLObject)subloop_sequences.$str248$_SET_INTERNAL_STORAGE__S____S_is_, self, new_internal_storage);
                }
                internal_storage = new_internal_storage;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_internal_storage);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_internal_storage(self, internal_storage);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 28511L)
    public static SubLObject basic_variable_length_sequence_get_storage_size_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject storage_size = get_basic_variable_length_sequence_storage_size(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, storage_size);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_storage_size(self, storage_size);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 28619L)
    public static SubLObject basic_variable_length_sequence_set_storage_size_method(final SubLObject self, final SubLObject new_storage_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject storage_size = get_basic_variable_length_sequence_storage_size(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!new_storage_size.isInteger() || !new_storage_size.numGE((SubLObject)subloop_sequences.ZERO_INTEGER))) {
                    Errors.error((SubLObject)subloop_sequences.$str258$_SET_STORAGE_SIZE__S____S_is_not_, self, new_storage_size);
                }
                storage_size = new_storage_size;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_storage_size);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_storage_size(self, storage_size);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 28980L)
    public static SubLObject basic_variable_length_sequence_get_largest_index_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, largest_index);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29090L)
    public static SubLObject basic_variable_length_sequence_set_largest_index_method(final SubLObject self, final SubLObject new_largest_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                largest_index = new_largest_index;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_largest_index);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29263L)
    public static SubLObject basic_variable_length_sequence_record_index_method(final SubLObject self, final SubLObject current_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject largest_index = get_basic_variable_length_sequence_largest_index(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!current_index.isInteger() || !current_index.numGE((SubLObject)subloop_sequences.ZERO_INTEGER))) {
                    Errors.error((SubLObject)subloop_sequences.$str273$_RECORD_INDEX__S____S_is_not_a_va, self, current_index);
                }
                largest_index = Numbers.max(largest_index, current_index);
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, largest_index);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_largest_index(self, largest_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29612L)
    public static SubLObject basic_variable_length_sequence_get_default_value_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject default_value = get_basic_variable_length_sequence_default_value(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, default_value);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_default_value(self, default_value);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29719L)
    public static SubLObject basic_variable_length_sequence_set_default_value_method(final SubLObject self, final SubLObject new_default_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject default_value = get_basic_variable_length_sequence_default_value(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                default_value = new_default_value;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_default_value);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_default_value(self, default_value);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29889L)
    public static SubLObject basic_variable_length_sequence_get_growth_factor_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject growth_factor = get_basic_variable_length_sequence_growth_factor(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, growth_factor);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_growth_factor(self, growth_factor);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 29996L)
    public static SubLObject basic_variable_length_sequence_set_growth_factor_method(final SubLObject self, final SubLObject new_growth_factor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject growth_factor = get_basic_variable_length_sequence_growth_factor(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!new_growth_factor.isNumber() || !new_growth_factor.numG((SubLObject)subloop_sequences.$float292$1_0))) {
                    Errors.error((SubLObject)subloop_sequences.$str293$_SET_GROWTH_FACTOR__S____S_is_not, self, new_growth_factor);
                }
                growth_factor = new_growth_factor;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_growth_factor);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_growth_factor(self, growth_factor);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 30369L)
    public static SubLObject basic_variable_length_sequence_get_sequence_class_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        final SubLObject sequence_class = get_basic_variable_length_sequence_sequence_class(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, sequence_class);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_sequence_class(self, sequence_class);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 30478L)
    public static SubLObject basic_variable_length_sequence_set_sequence_class_method(final SubLObject self, final SubLObject new_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_variable_length_sequence_method = (SubLObject)subloop_sequences.NIL;
        SubLObject sequence_class = get_basic_variable_length_sequence_sequence_class(self);
        try {
            thread.throwStack.push(subloop_sequences.$sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
            try {
                if (subloop_sequences.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_sequences.NIL != new_class && (!new_class.isSymbol() || subloop_sequences.NIL == classes.subclassp(new_class, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE))) {
                    Errors.error((SubLObject)subloop_sequences.$str299$_SET_SEQUENCE_CLASS__S____S_is_no, self, new_class);
                }
                sequence_class = new_class;
                Dynamic.sublisp_throw((SubLObject)subloop_sequences.$sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD, new_class);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_sequences.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_variable_length_sequence_sequence_class(self, sequence_class);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_variable_length_sequence_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_sequences.$sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_variable_length_sequence_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-sequences.lisp", position = 30856L)
    public static SubLObject fixed_length_sequence_p(final SubLObject fixed_length_sequence) {
        return interfaces.subloop_instanceof_interface(fixed_length_sequence, (SubLObject)subloop_sequences.$sym301$FIXED_LENGTH_SEQUENCE);
    }
    
    public static SubLObject declare_subloop_sequences_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "sequence_element_template_p", "SEQUENCE-ELEMENT-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "sequence_p", "SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "sequence_template_p", "SEQUENCE-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_sequence_enumerator_current_index", "GET-BASIC-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_sequence_enumerator_current_index", "SET-BASIC-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_sequence_enumerator_length", "GET-BASIC-SEQUENCE-ENUMERATOR-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_sequence_enumerator_length", "SET-BASIC-SEQUENCE-ENUMERATOR-LENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_sequence_enumerator_shared_storage", "GET-BASIC-SEQUENCE-ENUMERATOR-SHARED-STORAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_sequence_enumerator_shared_storage", "SET-BASIC-SEQUENCE-ENUMERATOR-SHARED-STORAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "subloop_reserved_initialize_basic_sequence_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "subloop_reserved_initialize_basic_sequence_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_p", "BASIC-SEQUENCE-ENUMERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_initialize_method", "BASIC-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_set_shared_storage_method", "BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_empty_p_method", "BASIC-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_first_p_method", "BASIC-SEQUENCE-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_last_p_method", "BASIC-SEQUENCE-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_current_method", "BASIC-SEQUENCE-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_first_method", "BASIC-SEQUENCE-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_last_method", "BASIC-SEQUENCE-ENUMERATOR-LAST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_next_method", "BASIC-SEQUENCE-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_enumerator_previous_method", "BASIC-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_sequence_sequence_class", "GET-BASIC-SEQUENCE-SEQUENCE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_sequence_sequence_class", "SET-BASIC-SEQUENCE-SEQUENCE-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_sequence_internal_storage", "GET-BASIC-SEQUENCE-INTERNAL-STORAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_sequence_internal_storage", "SET-BASIC-SEQUENCE-INTERNAL-STORAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_deallocate_enumerator_method", "BASIC-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_allocate_enumerator_method", "BASIC-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_get_contents_method", "BASIC-SEQUENCE-GET-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_add_method", "BASIC-SEQUENCE-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_get_subsequence_method", "BASIC-SEQUENCE-GET-SUBSEQUENCE-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_set_nth_method", "BASIC-SEQUENCE-SET-NTH-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_get_nth_method", "BASIC-SEQUENCE-GET-NTH-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_get_length_method", "BASIC-SEQUENCE-GET-LENGTH-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_clear_method", "BASIC-SEQUENCE-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "subloop_reserved_initialize_basic_sequence_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "subloop_reserved_initialize_basic_sequence_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_p", "BASIC-SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_initialize_method", "BASIC-SEQUENCE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_print_method", "BASIC-SEQUENCE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_get_internal_storage_method", "BASIC-SEQUENCE-GET-INTERNAL-STORAGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_set_internal_storage_method", "BASIC-SEQUENCE-SET-INTERNAL-STORAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_get_sequence_class_method", "BASIC-SEQUENCE-GET-SEQUENCE-CLASS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_sequence_set_sequence_class_method", "BASIC-SEQUENCE-SET-SEQUENCE-CLASS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "variable_length_sequence_p", "VARIABLE-LENGTH-SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "variable_length_sequence_template_p", "VARIABLE-LENGTH-SEQUENCE-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_variable_length_sequence_enumerator_current_index", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_variable_length_sequence_enumerator_current_index", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_variable_length_sequence_enumerator_sequence", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEQUENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_variable_length_sequence_enumerator_sequence", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEQUENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_variable_length_sequence_enumerator_ignore_null_values", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-IGNORE-NULL-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_variable_length_sequence_enumerator_ignore_null_values", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-IGNORE-NULL-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "subloop_reserved_initialize_basic_variable_length_sequence_enumerator_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_p", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_initialize_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_seek_non_null_forward_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-FORWARD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_seek_non_null_backward_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-BACKWARD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_set_sequence_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_get_ignore_null_values_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-GET-IGNORE-NULL-VALUES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_set_ignore_null_values_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-IGNORE-NULL-VALUES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_empty_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_first_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_last_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_current_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_first_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_last_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_next_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_enumerator_previous_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_variable_length_sequence_sequence_class", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-SEQUENCE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_variable_length_sequence_sequence_class", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-SEQUENCE-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_variable_length_sequence_growth_factor", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-GROWTH-FACTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_variable_length_sequence_growth_factor", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-GROWTH-FACTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_variable_length_sequence_default_value", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-DEFAULT-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_variable_length_sequence_default_value", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-DEFAULT-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_variable_length_sequence_largest_index", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-LARGEST-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_variable_length_sequence_largest_index", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-LARGEST-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_variable_length_sequence_storage_size", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-STORAGE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_variable_length_sequence_storage_size", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-STORAGE-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "get_basic_variable_length_sequence_internal_storage", "GET-BASIC-VARIABLE-LENGTH-SEQUENCE-INTERNAL-STORAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "set_basic_variable_length_sequence_internal_storage", "SET-BASIC-VARIABLE-LENGTH-SEQUENCE-INTERNAL-STORAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_index_of_previous_non_nil_element_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-PREVIOUS-NON-NIL-ELEMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_index_of_next_non_nil_element_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-NEXT-NON-NIL-ELEMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_all_null_p_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ALL-NULL-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_deallocate_enumerator_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_allocate_enumerator_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_add_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-ADD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_subsequence_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SUBSEQUENCE-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_set_nth_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-NTH-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_nth_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-NTH-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_length_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LENGTH-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_clear_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "subloop_reserved_initialize_basic_variable_length_sequence_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "subloop_reserved_initialize_basic_variable_length_sequence_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_p", "BASIC-VARIABLE-LENGTH-SEQUENCE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_initialize_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_print_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_internal_storage_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-INTERNAL-STORAGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_contents_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_set_internal_storage_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-INTERNAL-STORAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_storage_size_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-STORAGE-SIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_set_storage_size_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-STORAGE-SIZE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_largest_index_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LARGEST-INDEX-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_set_largest_index_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-LARGEST-INDEX-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_record_index_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-RECORD-INDEX-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_default_value_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-DEFAULT-VALUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_set_default_value_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-DEFAULT-VALUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_growth_factor_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-GROWTH-FACTOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_set_growth_factor_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-GROWTH-FACTOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_get_sequence_class_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SEQUENCE-CLASS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "basic_variable_length_sequence_set_sequence_class_method", "BASIC-VARIABLE-LENGTH-SEQUENCE-SET-SEQUENCE-CLASS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_sequences", "fixed_length_sequence_p", "FIXED-LENGTH-SEQUENCE-P", 1, 0, false);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    public static SubLObject init_subloop_sequences_file() {
        return (SubLObject)subloop_sequences.NIL;
    }
    
    public static SubLObject setup_subloop_sequences_file() {
        interfaces.new_interface((SubLObject)subloop_sequences.$sym0$SEQUENCE_ELEMENT_TEMPLATE, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list1);
        interfaces.new_interface((SubLObject)subloop_sequences.$sym2$SEQUENCE, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list3);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym4$GET_CONTENTS, (SubLObject)subloop_sequences.$sym2$SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list6);
        interfaces.new_interface((SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list8, (SubLObject)subloop_sequences.$list9, (SubLObject)subloop_sequences.$list10);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym11$CLEAR, (SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list12);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym13$GET_LENGTH, (SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list14);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym15$GET_NTH, (SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list16, (SubLObject)subloop_sequences.$list17);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym18$SET_NTH, (SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list19, (SubLObject)subloop_sequences.$list20);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym21$GET_SUBSEQUENCE, (SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list22, (SubLObject)subloop_sequences.$list23);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym24$ADD, (SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list25, (SubLObject)subloop_sequences.$list26);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym27$ALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list28);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym29$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym7$SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list30, (SubLObject)subloop_sequences.$list31);
        classes.subloop_new_class((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$list34, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list35);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym40$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym43$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_INSTANCE);
        subloop_reserved_initialize_basic_sequence_enumerator_class((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym44$INITIALIZE, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list46);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym44$INITIALIZE, (SubLObject)subloop_sequences.$sym48$BASIC_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym49$SET_SHARED_STORAGE, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list50, (SubLObject)subloop_sequences.$list51);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym49$SET_SHARED_STORAGE, (SubLObject)subloop_sequences.$sym54$BASIC_SEQUENCE_ENUMERATOR_SET_SHARED_STORAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym55$EMPTY_P, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list56);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym55$EMPTY_P, (SubLObject)subloop_sequences.$sym58$BASIC_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym59$FIRST_P, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list60);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym59$FIRST_P, (SubLObject)subloop_sequences.$sym62$BASIC_SEQUENCE_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym63$LAST_P, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list64);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym63$LAST_P, (SubLObject)subloop_sequences.$sym66$BASIC_SEQUENCE_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym67$CURRENT, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list68);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym67$CURRENT, (SubLObject)subloop_sequences.$sym70$BASIC_SEQUENCE_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym71$FIRST, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list72);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym71$FIRST, (SubLObject)subloop_sequences.$sym74$BASIC_SEQUENCE_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym75$LAST, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list76);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym75$LAST, (SubLObject)subloop_sequences.$sym78$BASIC_SEQUENCE_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym79$NEXT, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list80, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list81);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym79$NEXT, (SubLObject)subloop_sequences.$sym82$BASIC_SEQUENCE_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym83$PREVIOUS, (SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list80, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list84);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym32$BASIC_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym83$PREVIOUS, (SubLObject)subloop_sequences.$sym85$BASIC_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD);
        classes.subloop_new_class((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$list87, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list88);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym29$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list30, (SubLObject)subloop_sequences.$list31);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym29$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym92$BASIC_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym27$ALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list28);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym27$ALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym93$BASIC_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym4$GET_CONTENTS, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list6);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym4$GET_CONTENTS, (SubLObject)subloop_sequences.$sym94$BASIC_SEQUENCE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym24$ADD, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list25, (SubLObject)subloop_sequences.$list26);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym24$ADD, (SubLObject)subloop_sequences.$sym95$BASIC_SEQUENCE_ADD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym21$GET_SUBSEQUENCE, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list22, (SubLObject)subloop_sequences.$list23);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym21$GET_SUBSEQUENCE, (SubLObject)subloop_sequences.$sym97$BASIC_SEQUENCE_GET_SUBSEQUENCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym18$SET_NTH, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list19, (SubLObject)subloop_sequences.$list20);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym18$SET_NTH, (SubLObject)subloop_sequences.$sym98$BASIC_SEQUENCE_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym15$GET_NTH, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list16, (SubLObject)subloop_sequences.$list17);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym15$GET_NTH, (SubLObject)subloop_sequences.$sym99$BASIC_SEQUENCE_GET_NTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym13$GET_LENGTH, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list14);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym13$GET_LENGTH, (SubLObject)subloop_sequences.$sym100$BASIC_SEQUENCE_GET_LENGTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym11$CLEAR, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list12);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym11$CLEAR, (SubLObject)subloop_sequences.$sym101$BASIC_SEQUENCE_CLEAR_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym102$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym103$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_INSTANCE);
        subloop_reserved_initialize_basic_sequence_class((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym44$INITIALIZE, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list104);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym44$INITIALIZE, (SubLObject)subloop_sequences.$sym106$BASIC_SEQUENCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym107$PRINT, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list108, (SubLObject)subloop_sequences.$list109);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym107$PRINT, (SubLObject)subloop_sequences.$sym116$BASIC_SEQUENCE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym117$GET_INTERNAL_STORAGE, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list118);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym117$GET_INTERNAL_STORAGE, (SubLObject)subloop_sequences.$sym120$BASIC_SEQUENCE_GET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym96$SET_INTERNAL_STORAGE, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.$list121, (SubLObject)subloop_sequences.$list122);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym96$SET_INTERNAL_STORAGE, (SubLObject)subloop_sequences.$sym125$BASIC_SEQUENCE_SET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym126$GET_SEQUENCE_CLASS, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list127);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym126$GET_SEQUENCE_CLASS, (SubLObject)subloop_sequences.$sym129$BASIC_SEQUENCE_GET_SEQUENCE_CLASS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym130$SET_SEQUENCE_CLASS, (SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list131, (SubLObject)subloop_sequences.$list132);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym86$BASIC_SEQUENCE, (SubLObject)subloop_sequences.$sym130$SET_SEQUENCE_CLASS, (SubLObject)subloop_sequences.$sym135$BASIC_SEQUENCE_SET_SEQUENCE_CLASS_METHOD);
        interfaces.new_interface((SubLObject)subloop_sequences.$sym136$VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list8, (SubLObject)subloop_sequences.$list9, (SubLObject)subloop_sequences.$list137);
        interfaces.new_interface((SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list139, (SubLObject)subloop_sequences.$list140, (SubLObject)subloop_sequences.$list141);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym11$CLEAR, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list142);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym13$GET_LENGTH, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list143);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym15$GET_NTH, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list144, (SubLObject)subloop_sequences.$list145);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym18$SET_NTH, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list19, (SubLObject)subloop_sequences.$list146);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym21$GET_SUBSEQUENCE, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list22, (SubLObject)subloop_sequences.$list147);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym24$ADD, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list25, (SubLObject)subloop_sequences.$list148);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym27$ALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list149);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym29$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list30, (SubLObject)subloop_sequences.$list150);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym151$ALL_NULL_P, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list152);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list154, (SubLObject)subloop_sequences.$list155);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_sequences.$sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, (SubLObject)subloop_sequences.$sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list154, (SubLObject)subloop_sequences.$list157);
        classes.subloop_new_class((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$list34, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list159);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym162$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym163$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER);
        subloop_reserved_initialize_basic_variable_length_sequence_enumerator_class((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym44$INITIALIZE, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list164);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym44$INITIALIZE, (SubLObject)subloop_sequences.$sym166$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym167$SEEK_NON_NULL_FORWARD, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list168);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym167$SEEK_NON_NULL_FORWARD, (SubLObject)subloop_sequences.$sym170$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_FORWARD_M);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym171$SEEK_NON_NULL_BACKWARD, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list172);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym171$SEEK_NON_NULL_BACKWARD, (SubLObject)subloop_sequences.$sym174$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_BACKWARD_);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym175$SET_SEQUENCE, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list176, (SubLObject)subloop_sequences.$list177);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym175$SET_SEQUENCE, (SubLObject)subloop_sequences.$sym180$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_SEQUENCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym181$GET_IGNORE_NULL_VALUES, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list182, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list183);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym181$GET_IGNORE_NULL_VALUES, (SubLObject)subloop_sequences.$sym184$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_GET_IGNORE_NULL_VALUES_);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym185$SET_IGNORE_NULL_VALUES, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list186, (SubLObject)subloop_sequences.$list187);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym185$SET_IGNORE_NULL_VALUES, (SubLObject)subloop_sequences.$sym189$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_IGNORE_NULL_VALUES_);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym55$EMPTY_P, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list190);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym55$EMPTY_P, (SubLObject)subloop_sequences.$sym192$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym59$FIRST_P, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list193);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym59$FIRST_P, (SubLObject)subloop_sequences.$sym195$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym63$LAST_P, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list196);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym63$LAST_P, (SubLObject)subloop_sequences.$sym198$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym67$CURRENT, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list199);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym67$CURRENT, (SubLObject)subloop_sequences.$sym201$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_CURRENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym71$FIRST, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list80, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list202);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym71$FIRST, (SubLObject)subloop_sequences.$sym203$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym75$LAST, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list80, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list204);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym75$LAST, (SubLObject)subloop_sequences.$sym205$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym79$NEXT, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list80, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list206);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym79$NEXT, (SubLObject)subloop_sequences.$sym207$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_NEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym83$PREVIOUS, (SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$list80, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list208);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR, (SubLObject)subloop_sequences.$sym83$PREVIOUS, (SubLObject)subloop_sequences.$sym209$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD);
        classes.subloop_new_class((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym33$OBJECT, (SubLObject)subloop_sequences.$list211, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list212);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list154, (SubLObject)subloop_sequences.$list157);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT, (SubLObject)subloop_sequences.$sym217$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_PREVIOUS_NON_NIL_ELEMENT_);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list154, (SubLObject)subloop_sequences.$list155);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT, (SubLObject)subloop_sequences.$sym218$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_NEXT_NON_NIL_ELEMENT_METH);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym151$ALL_NULL_P, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list152);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym151$ALL_NULL_P, (SubLObject)subloop_sequences.$sym219$BASIC_VARIABLE_LENGTH_SEQUENCE_ALL_NULL_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym29$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list30, (SubLObject)subloop_sequences.$list150);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym29$DEALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym221$BASIC_VARIABLE_LENGTH_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym27$ALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list149);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym27$ALLOCATE_ENUMERATOR, (SubLObject)subloop_sequences.$sym222$BASIC_VARIABLE_LENGTH_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym24$ADD, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list25, (SubLObject)subloop_sequences.$list148);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym24$ADD, (SubLObject)subloop_sequences.$sym223$BASIC_VARIABLE_LENGTH_SEQUENCE_ADD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym21$GET_SUBSEQUENCE, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list22, (SubLObject)subloop_sequences.$list147);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym21$GET_SUBSEQUENCE, (SubLObject)subloop_sequences.$sym226$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SUBSEQUENCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym18$SET_NTH, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list19, (SubLObject)subloop_sequences.$list146);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym18$SET_NTH, (SubLObject)subloop_sequences.$sym228$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym15$GET_NTH, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list144, (SubLObject)subloop_sequences.$list145);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym15$GET_NTH, (SubLObject)subloop_sequences.$sym229$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_NTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym13$GET_LENGTH, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list143);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym13$GET_LENGTH, (SubLObject)subloop_sequences.$sym230$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LENGTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym11$CLEAR, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list142);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym11$CLEAR, (SubLObject)subloop_sequences.$sym231$BASIC_VARIABLE_LENGTH_SEQUENCE_CLEAR_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym232$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym233$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_INSTAN);
        subloop_reserved_initialize_basic_variable_length_sequence_class((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym44$INITIALIZE, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list234);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym44$INITIALIZE, (SubLObject)subloop_sequences.$sym236$BASIC_VARIABLE_LENGTH_SEQUENCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym107$PRINT, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list108, (SubLObject)subloop_sequences.$list237);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym107$PRINT, (SubLObject)subloop_sequences.$sym240$BASIC_VARIABLE_LENGTH_SEQUENCE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym117$GET_INTERNAL_STORAGE, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list118);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym117$GET_INTERNAL_STORAGE, (SubLObject)subloop_sequences.$sym242$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym4$GET_CONTENTS, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list243);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym4$GET_CONTENTS, (SubLObject)subloop_sequences.$sym245$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym96$SET_INTERNAL_STORAGE, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.$list121, (SubLObject)subloop_sequences.$list246);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym96$SET_INTERNAL_STORAGE, (SubLObject)subloop_sequences.$sym249$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_INTERNAL_STORAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym250$GET_STORAGE_SIZE, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list251);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym250$GET_STORAGE_SIZE, (SubLObject)subloop_sequences.$sym253$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_STORAGE_SIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym254$SET_STORAGE_SIZE, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.$list255, (SubLObject)subloop_sequences.$list256);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym254$SET_STORAGE_SIZE, (SubLObject)subloop_sequences.$sym259$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_STORAGE_SIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym260$GET_LARGEST_INDEX, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list261);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym260$GET_LARGEST_INDEX, (SubLObject)subloop_sequences.$sym263$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LARGEST_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym264$SET_LARGEST_INDEX, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.$list265, (SubLObject)subloop_sequences.$list266);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym264$SET_LARGEST_INDEX, (SubLObject)subloop_sequences.$sym268$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_LARGEST_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym269$RECORD_INDEX, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list45, (SubLObject)subloop_sequences.$list270, (SubLObject)subloop_sequences.$list271);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym269$RECORD_INDEX, (SubLObject)subloop_sequences.$sym274$BASIC_VARIABLE_LENGTH_SEQUENCE_RECORD_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym275$GET_DEFAULT_VALUE, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list276);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym275$GET_DEFAULT_VALUE, (SubLObject)subloop_sequences.$sym278$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_DEFAULT_VALUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym279$SET_DEFAULT_VALUE, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list280, (SubLObject)subloop_sequences.$list281);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym279$SET_DEFAULT_VALUE, (SubLObject)subloop_sequences.$sym283$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_DEFAULT_VALUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym284$GET_GROWTH_FACTOR, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list285);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym284$GET_GROWTH_FACTOR, (SubLObject)subloop_sequences.$sym287$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_GROWTH_FACTOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym288$SET_GROWTH_FACTOR, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list289, (SubLObject)subloop_sequences.$list290);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym288$SET_GROWTH_FACTOR, (SubLObject)subloop_sequences.$sym294$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_GROWTH_FACTOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym126$GET_SEQUENCE_CLASS, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.NIL, (SubLObject)subloop_sequences.$list127);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym126$GET_SEQUENCE_CLASS, (SubLObject)subloop_sequences.$sym296$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SEQUENCE_CLASS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_sequences.$sym130$SET_SEQUENCE_CLASS, (SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list5, (SubLObject)subloop_sequences.$list131, (SubLObject)subloop_sequences.$list297);
        methods.subloop_register_instance_method((SubLObject)subloop_sequences.$sym210$BASIC_VARIABLE_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$sym130$SET_SEQUENCE_CLASS, (SubLObject)subloop_sequences.$sym300$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_SEQUENCE_CLASS_METHOD);
        interfaces.new_interface((SubLObject)subloop_sequences.$sym301$FIXED_LENGTH_SEQUENCE, (SubLObject)subloop_sequences.$list8, (SubLObject)subloop_sequences.$list9, (SubLObject)subloop_sequences.$list302);
        return (SubLObject)subloop_sequences.NIL;
    }
    
    public void declareFunctions() {
        declare_subloop_sequences_file();
    }
    
    public void initializeVariables() {
        init_subloop_sequences_file();
    }
    
    public void runTopLevelForms() {
        setup_subloop_sequences_file();
    }
    
    static {
        me = (SubLFile)new subloop_sequences();
        $sym0$SEQUENCE_ELEMENT_TEMPLATE = SubLObjectFactory.makeSymbol("SEQUENCE-ELEMENT-TEMPLATE");
        $list1 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SELF-DELETION-MODE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SELF-DELETION-MODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-SELF-FROM-SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSFER-SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-SEQUENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SEQUENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-SELF-FROM-ALL-SEQUENCES"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEQUENCES"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-SEQUENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-DELETE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-SEQUENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PERFORM-ACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("PARAMETERS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym2$SEQUENCE = SubLObjectFactory.makeSymbol("SEQUENCE");
        $list3 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE"), (SubLObject)subloop_sequences.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBSEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)subloop_sequences.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEQUENCE-CLASS"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SEQUENCE-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym4$GET_CONTENTS = SubLObjectFactory.makeSymbol("GET-CONTENTS");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-CONTENTS"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("LIST-OF-CONTENTS")))));
        $sym7$SEQUENCE_TEMPLATE = SubLObjectFactory.makeSymbol("SEQUENCE-TEMPLATE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE")));
        $list10 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE"))), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INSERT-AT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBSEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)subloop_sequences.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym11$CLEAR = SubLObjectFactory.makeSymbol("CLEAR");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_sequences.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL));
        $sym13$GET_LENGTH = SubLObjectFactory.makeSymbol("GET-LENGTH");
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym15$GET_NTH = SubLObjectFactory.makeSymbol("GET-NTH");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE")));
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE"))));
        $sym18$SET_NTH = SubLObjectFactory.makeSymbol("SET-NTH");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"));
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")));
        $sym21$GET_SUBSEQUENCE = SubLObjectFactory.makeSymbol("GET-SUBSEQUENCE");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)subloop_sequences.NIL));
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SEQUENCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-OBJECT-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CLASS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTHCDR"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE"), (SubLObject)subloop_sequences.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-POINTER")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-POINTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SUBLIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INSTANCE"))));
        $sym24$ADD = SubLObjectFactory.makeSymbol("ADD");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"));
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LAST-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))))));
        $sym27$ALLOCATE_ENUMERATOR = SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL));
        $sym29$DEALLOCATE_ENUMERATOR = SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR"));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-P"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-SEQUENCE-ENUMERATOR."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR"), (SubLObject)subloop_sequences.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL));
        $sym32$BASIC_SEQUENCE_ENUMERATOR = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR");
        $sym33$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATOR-TEMPLATE"));
        $list35 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHARED-STORAGE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SHARED-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SHARED-STORAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-P"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym36$CURRENT_INDEX = SubLObjectFactory.makeSymbol("CURRENT-INDEX");
        $sym37$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $sym38$SHARED_STORAGE = SubLObjectFactory.makeSymbol("SHARED-STORAGE");
        $sym39$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym40$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-CLASS");
        $sym41$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym42$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym43$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_ENUMERATOR_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-ENUMERATOR-INSTANCE");
        $sym44$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SHARED-STORAGE"), (SubLObject)subloop_sequences.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.MINUS_ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL));
        $sym47$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");
        $sym48$BASIC_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD");
        $sym49$SET_SHARED_STORAGE = SubLObjectFactory.makeSymbol("SET-SHARED-STORAGE");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SHARED-STORAGE"));
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SHARED-STORAGE")), (SubLObject)SubLObjectFactory.makeString("(SET-SHARED-STORAGE ~S): ~S is not a list."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SHARED-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SHARED-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SHARED-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SHARED-STORAGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SHARED-STORAGE")));
        $sym52$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");
        $str53$_SET_SHARED_STORAGE__S____S_is_no = SubLObjectFactory.makeString("(SET-SHARED-STORAGE ~S): ~S is not a list.");
        $sym54$BASIC_SEQUENCE_ENUMERATOR_SET_SHARED_STORAGE_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-SET-SHARED-STORAGE-METHOD");
        $sym55$EMPTY_P = SubLObjectFactory.makeSymbol("EMPTY-P");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<="), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.ZERO_INTEGER)));
        $sym57$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");
        $sym58$BASIC_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD");
        $sym59$FIRST_P = SubLObjectFactory.makeSymbol("FIRST-P");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER)));
        $sym61$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");
        $sym62$BASIC_SEQUENCE_ENUMERATOR_FIRST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-FIRST-P-METHOD");
        $sym63$LAST_P = SubLObjectFactory.makeSymbol("LAST-P");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.ONE_INTEGER))));
        $sym65$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");
        $sym66$BASIC_SEQUENCE_ENUMERATOR_LAST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-LAST-P-METHOD");
        $sym67$CURRENT = SubLObjectFactory.makeSymbol("CURRENT");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SHARED-STORAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL));
        $sym69$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");
        $sym70$BASIC_SEQUENCE_ENUMERATOR_CURRENT_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-CURRENT-METHOD");
        $sym71$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)subloop_sequences.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("SHARED-STORAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL));
        $sym73$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");
        $sym74$BASIC_SEQUENCE_ENUMERATOR_FIRST_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-FIRST-METHOD");
        $sym75$LAST = SubLObjectFactory.makeSymbol("LAST");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SHARED-STORAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL));
        $sym77$OUTER_CATCH_FOR_BASIC_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-ENUMERATOR-METHOD");
        $sym78$BASIC_SEQUENCE_ENUMERATOR_LAST_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-LAST-METHOD");
        $sym79$NEXT = SubLObjectFactory.makeSymbol("NEXT");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym82$BASIC_SEQUENCE_ENUMERATOR_NEXT_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-NEXT-METHOD");
        $sym83$PREVIOUS = SubLObjectFactory.makeSymbol("PREVIOUS");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym85$BASIC_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD");
        $sym86$BASIC_SEQUENCE = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE-TEMPLATE"));
        $list88 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE-CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE"))), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBSEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)subloop_sequences.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEQUENCE-CLASS"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SEQUENCE-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym89$SEQUENCE_CLASS = SubLObjectFactory.makeSymbol("SEQUENCE-CLASS");
        $sym90$INTERNAL_STORAGE = SubLObjectFactory.makeSymbol("INTERNAL-STORAGE");
        $str91$_DEALLOCATE_ENUMERATOR__S____S_is = SubLObjectFactory.makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance of BASIC-SEQUENCE-ENUMERATOR.");
        $sym92$BASIC_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD");
        $sym93$BASIC_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD");
        $sym94$BASIC_SEQUENCE_GET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-GET-CONTENTS-METHOD");
        $sym95$BASIC_SEQUENCE_ADD_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-ADD-METHOD");
        $sym96$SET_INTERNAL_STORAGE = SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE");
        $sym97$BASIC_SEQUENCE_GET_SUBSEQUENCE_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-GET-SUBSEQUENCE-METHOD");
        $sym98$BASIC_SEQUENCE_SET_NTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-SET-NTH-METHOD");
        $sym99$BASIC_SEQUENCE_GET_NTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-GET-NTH-METHOD");
        $sym100$BASIC_SEQUENCE_GET_LENGTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-GET-LENGTH-METHOD");
        $sym101$BASIC_SEQUENCE_CLEAR_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-CLEAR-METHOD");
        $sym102$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-CLASS");
        $sym103$SUBLOOP_RESERVED_INITIALIZE_BASIC_SEQUENCE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-SEQUENCE-INSTANCE");
        $list104 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)subloop_sequences.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SEQUENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym105$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");
        $sym106$BASIC_SEQUENCE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-INITIALIZE-METHOD");
        $sym107$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list109 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("[]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("[~S]"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("[~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString(", ~S"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym110$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");
        $str111$__ = SubLObjectFactory.makeString("[]");
        $str112$__S_ = SubLObjectFactory.makeString("[~S]");
        $str113$__S = SubLObjectFactory.makeString("[~S");
        $str114$___S = SubLObjectFactory.makeString(", ~S");
        $str115$_ = SubLObjectFactory.makeString("]");
        $sym116$BASIC_SEQUENCE_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-PRINT-METHOD");
        $sym117$GET_INTERNAL_STORAGE = SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE");
        $list118 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE")));
        $sym119$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");
        $sym120$BASIC_SEQUENCE_GET_INTERNAL_STORAGE_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-GET-INTERNAL-STORAGE-METHOD");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE"));
        $list122 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)SubLObjectFactory.makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a LIST."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")));
        $sym123$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");
        $str124$_SET_INTERNAL_STORAGE__S____S_is_ = SubLObjectFactory.makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a LIST.");
        $sym125$BASIC_SEQUENCE_SET_INTERNAL_STORAGE_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-SET-INTERNAL-STORAGE-METHOD");
        $sym126$GET_SEQUENCE_CLASS = SubLObjectFactory.makeSymbol("GET-SEQUENCE-CLASS");
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE-CLASS")));
        $sym128$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");
        $sym129$BASIC_SEQUENCE_GET_SEQUENCE_CLASS_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-GET-SEQUENCE-CLASS-METHOD");
        $sym130$SET_SEQUENCE_CLASS = SubLObjectFactory.makeSymbol("SET-SEQUENCE-CLASS");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS"));
        $list132 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCLASSP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-SEQUENCE"))))), (SubLObject)SubLObjectFactory.makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-SEQUENCE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")));
        $sym133$OUTER_CATCH_FOR_BASIC_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-SEQUENCE-METHOD");
        $str134$_SET_SEQUENCE_CLASS__S____S_is_no = SubLObjectFactory.makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-SEQUENCE.");
        $sym135$BASIC_SEQUENCE_SET_SEQUENCE_CLASS_METHOD = SubLObjectFactory.makeSymbol("BASIC-SEQUENCE-SET-SEQUENCE-CLASS-METHOD");
        $sym136$VARIABLE_LENGTH_SEQUENCE = SubLObjectFactory.makeSymbol("VARIABLE-LENGTH-SEQUENCE");
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DEFAULT-VALUE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DEFAULT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DEFAULT-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GROWTH-FACTOR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-GROWTH-FACTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GROWTH-FACTOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym138$VARIABLE_LENGTH_SEQUENCE_TEMPLATE = SubLObjectFactory.makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-LENGTH-SEQUENCE"));
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-LENGTH-SEQUENCE")));
        $list141 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE"), (SubLObject)subloop_sequences.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBSEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)subloop_sequences.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STORAGE-SIZE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-STORAGE-SIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STORAGE-SIZE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LARGEST-INDEX"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LARGEST-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LARGEST-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DEFAULT-VALUE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DEFAULT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DEFAULT-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GROWTH-FACTOR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-GROWTH-FACTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GROWTH-FACTOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-NULL-P"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $list142 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STORAGE-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-DEFAULT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DEFAULT-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-SIZE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-AREF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-DEFAULT-VALUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-LARGEST-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_sequences.MINUS_ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-DEFAULT-VALUE"))));
        $list143 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LARGEST-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)subloop_sequences.ONE_INTEGER)));
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE"), (SubLObject)subloop_sequences.NIL));
        $list145 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LARGEST-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("N"))));
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeString("(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LARGEST-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LARGEST-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-STORAGE-SIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STORAGE-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-STORAGE-SIZE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE-SIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-GROWTH-FACTOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("N"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-OLD-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-DEFAULT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DEFAULT-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-DEFAULT-VALUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LARGEST-INDEX"), (SubLObject)subloop_sequences.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-AREF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-OLD-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORD-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-STORAGE-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE-SIZE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-AREF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-NEW-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RECORD-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-AREF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"))));
        $list147 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeString("(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<="), (SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH")), (SubLObject)SubLObjectFactory.makeString("(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence."), (SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SEQUENCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-OBJECT-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CLASS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ORIGINAL-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ORIGINAL-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ORIGINAL-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INSTANCE")))));
        $list148 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LARGEST-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)subloop_sequences.ONE_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))));
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))));
        $list150 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-P"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR"), (SubLObject)subloop_sequences.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL));
        $sym151$ALL_NULL_P = SubLObjectFactory.makeSymbol("ALL-NULL-P");
        $list152 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.T)));
        $sym153$INDEX_OF_NEXT_NON_NIL_ELEMENT = SubLObjectFactory.makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT");
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"));
        $list155 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH"), (SubLObject)subloop_sequences.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)))));
        $sym156$INDEX_OF_PREVIOUS_NON_NIL_ELEMENT = SubLObjectFactory.makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT");
        $list157 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LENGTH"), (SubLObject)subloop_sequences.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)))));
        $sym158$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR");
        $list159 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEEK-NON-NULL-FORWARD"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEEK-NON-NULL-BACKWARD"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SEQUENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-IGNORE-NULL-VALUES"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-IGNORE-NULL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-P"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym160$IGNORE_NULL_VALUES = SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES");
        $int161$4097 = SubLObjectFactory.makeInteger(4097);
        $sym162$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CLASS");
        $sym163$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMER = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INSTANCE");
        $list164 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)subloop_sequences.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)subloop_sequences.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym165$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");
        $sym166$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-INITIALIZE-METHOD");
        $sym167$SEEK_NON_NULL_FORWARD = SubLObjectFactory.makeSymbol("SEEK-NON-NULL-FORWARD");
        $list168 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NTH")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL))));
        $sym169$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");
        $sym170$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_FORWARD_M = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-FORWARD-METHOD");
        $sym171$SEEK_NON_NULL_BACKWARD = SubLObjectFactory.makeSymbol("SEEK-NON-NULL-BACKWARD");
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NTH")), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)));
        $sym173$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");
        $sym174$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SEEK_NON_NULL_BACKWARD_ = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SEEK-NON-NULL-BACKWARD-METHOD");
        $sym175$SET_SEQUENCE = SubLObjectFactory.makeSymbol("SET-SEQUENCE");
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SEQUENCE"));
        $list177 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SEQUENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SEQUENCE"))), (SubLObject)SubLObjectFactory.makeString("(SET-SEQUENCE ~S): ~S is not an instance of a class that implements VARIABLE-LENGTH-SEQUENCE-TEMPLATE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SEQUENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SEQUENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym178$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");
        $str179$_SET_SEQUENCE__S____S_is_not_an_i = SubLObjectFactory.makeString("(SET-SEQUENCE ~S): ~S is not an instance of a class that implements VARIABLE-LENGTH-SEQUENCE-TEMPLATE.");
        $sym180$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_SEQUENCE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-SEQUENCE-METHOD");
        $sym181$GET_IGNORE_NULL_VALUES = SubLObjectFactory.makeSymbol("GET-IGNORE-NULL-VALUES");
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("READ-ONLY"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list183 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES")));
        $sym184$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_GET_IGNORE_NULL_VALUES_ = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-GET-IGNORE-NULL-VALUES-METHOD");
        $sym185$SET_IGNORE_NULL_VALUES = SubLObjectFactory.makeSymbol("SET-IGNORE-NULL-VALUES");
        $list186 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"));
        $list187 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"), (SubLObject)subloop_sequences.T, (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES")));
        $sym188$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");
        $sym189$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_SET_IGNORE_NULL_VALUES_ = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-SET-IGNORE-NULL-VALUES-METHOD");
        $list190 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-NULL-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"))), (SubLObject)subloop_sequences.ZERO_INTEGER))));
        $sym191$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");
        $sym192$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-EMPTY-P-METHOD");
        $list193 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT")), (SubLObject)subloop_sequences.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER))));
        $sym194$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");
        $sym195$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-P-METHOD");
        $list196 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.ONE_INTEGER))))));
        $sym197$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");
        $sym198$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-P-METHOD");
        $list199 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NTH")), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL));
        $sym200$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-METHOD");
        $sym201$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_CURRENT_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-CURRENT-METHOD");
        $list202 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT")), (SubLObject)subloop_sequences.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))));
        $sym203$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_FIRST_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-FIRST-METHOD");
        $list204 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))))));
        $sym205$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_LAST_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-LAST-METHOD");
        $list206 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ONE_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))))));
        $sym207$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_NEXT_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-NEXT-METHOD");
        $list208 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-NULL-VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ONE_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))));
        $sym209$BASIC_VARIABLE_LENGTH_SEQUENCE_ENUMERATOR_PREVIOUS_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR-PREVIOUS-METHOD");
        $sym210$BASIC_VARIABLE_LENGTH_SEQUENCE = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE");
        $list211 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-LENGTH-SEQUENCE-TEMPLATE"));
        $list212 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORAGE-SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROWTH-FACTOR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE-CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUT-OF-RANGE-VALUE"), (SubLObject)subloop_sequences.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBSEQUENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-INDEX"), (SubLObject)subloop_sequences.NIL)), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-STORAGE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STORAGE-SIZE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-STORAGE-SIZE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STORAGE-SIZE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LARGEST-INDEX"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LARGEST-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LARGEST-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RECORD-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DEFAULT-VALUE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DEFAULT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DEFAULT-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-GROWTH-FACTOR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-GROWTH-FACTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GROWTH-FACTOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEQUENCE-CLASS"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SEQUENCE-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-NULL-P"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-NEXT-NON-NIL-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-OF-PREVIOUS-NON-NIL-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-INDEX")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym213$GROWTH_FACTOR = SubLObjectFactory.makeSymbol("GROWTH-FACTOR");
        $sym214$DEFAULT_VALUE = SubLObjectFactory.makeSymbol("DEFAULT-VALUE");
        $sym215$LARGEST_INDEX = SubLObjectFactory.makeSymbol("LARGEST-INDEX");
        $sym216$STORAGE_SIZE = SubLObjectFactory.makeSymbol("STORAGE-SIZE");
        $sym217$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_PREVIOUS_NON_NIL_ELEMENT_ = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-PREVIOUS-NON-NIL-ELEMENT-METHOD");
        $sym218$BASIC_VARIABLE_LENGTH_SEQUENCE_INDEX_OF_NEXT_NON_NIL_ELEMENT_METH = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-INDEX-OF-NEXT-NON-NIL-ELEMENT-METHOD");
        $sym219$BASIC_VARIABLE_LENGTH_SEQUENCE_ALL_NULL_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ALL-NULL-P-METHOD");
        $str220$_DEALLOCATE_ENUMERATOR__S____S_is = SubLObjectFactory.makeString("(DEALLOCATE-ENUMERATOR ~S): ~S is not an instance BASIC-VARIABLE-LENGTH-SEQUENCE-ENUMERATOR.");
        $sym221$BASIC_VARIABLE_LENGTH_SEQUENCE_DEALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-DEALLOCATE-ENUMERATOR-METHOD");
        $sym222$BASIC_VARIABLE_LENGTH_SEQUENCE_ALLOCATE_ENUMERATOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ALLOCATE-ENUMERATOR-METHOD");
        $sym223$BASIC_VARIABLE_LENGTH_SEQUENCE_ADD_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-ADD-METHOD");
        $str224$_GET_SUBSEQUENCE__S___Index__S_is = SubLObjectFactory.makeString("(GET-SUBSEQUENCE ~S): Index ~S is less than zero.  Only non-negative indices are accepted.");
        $str225$_GET_SUBSEQUENCE__S___End_index__ = SubLObjectFactory.makeString("(GET-SUBSEQUENCE ~S): End index ~S exceeds the length ~S of this sequence.");
        $sym226$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SUBSEQUENCE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SUBSEQUENCE-METHOD");
        $str227$_SET_NTH__S___Index__S_is_less_th = SubLObjectFactory.makeString("(SET-NTH ~S): Index ~S is less than zero.  Only non-negative indices are accepted.");
        $sym228$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_NTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-NTH-METHOD");
        $sym229$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_NTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-NTH-METHOD");
        $sym230$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LENGTH_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LENGTH-METHOD");
        $sym231$BASIC_VARIABLE_LENGTH_SEQUENCE_CLEAR_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-CLEAR-METHOD");
        $sym232$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-CLASS");
        $sym233$SUBLOOP_RESERVED_INITIALIZE_BASIC_VARIABLE_LENGTH_SEQUENCE_INSTAN = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-VARIABLE-LENGTH-SEQUENCE-INSTANCE");
        $list234 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-VECTOR"), (SubLObject)subloop_sequences.TEN_INTEGER, (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STORAGE-SIZE"), (SubLObject)subloop_sequences.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX"), (SubLObject)subloop_sequences.MINUS_ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-VALUE"), (SubLObject)subloop_sequences.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GROWTH-FACTOR"), (SubLObject)subloop_sequences.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym235$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym236$BASIC_VARIABLE_LENGTH_SEQUENCE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-INITIALIZE-METHOD");
        $list237 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<BASIC-VARIABLE-LENGTH-SEQUENCE: UNINITIALIZED>")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX"), (SubLObject)subloop_sequences.MINUS_ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("[]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX"), (SubLObject)subloop_sequences.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("[]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)subloop_sequences.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("[~S]"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)subloop_sequences.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("[~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)subloop_sequences.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString(", ~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)subloop_sequences.ONE_INTEGER)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("]"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym238$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $str239$__BASIC_VARIABLE_LENGTH_SEQUENCE_ = SubLObjectFactory.makeString("#<BASIC-VARIABLE-LENGTH-SEQUENCE: UNINITIALIZED>");
        $sym240$BASIC_VARIABLE_LENGTH_SEQUENCE_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-PRINT-METHOD");
        $sym241$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym242$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_INTERNAL_STORAGE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-INTERNAL-STORAGE-METHOD");
        $list243 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)subloop_sequences.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)subloop_sequences.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AREF"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS")))));
        $sym244$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym245$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-CONTENTS-METHOD");
        $list246 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTORP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)SubLObjectFactory.makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a vector."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-INTERNAL-STORAGE")));
        $sym247$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $str248$_SET_INTERNAL_STORAGE__S____S_is_ = SubLObjectFactory.makeString("(SET-INTERNAL-STORAGE ~S): ~S is not a vector.");
        $sym249$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_INTERNAL_STORAGE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-INTERNAL-STORAGE-METHOD");
        $sym250$GET_STORAGE_SIZE = SubLObjectFactory.makeSymbol("GET-STORAGE-SIZE");
        $list251 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STORAGE-SIZE")));
        $sym252$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym253$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_STORAGE_SIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-STORAGE-SIZE-METHOD");
        $sym254$SET_STORAGE_SIZE = SubLObjectFactory.makeSymbol("SET-STORAGE-SIZE");
        $list255 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STORAGE-SIZE"));
        $list256 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STORAGE-SIZE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STORAGE-SIZE"), (SubLObject)subloop_sequences.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeString("(SET-STORAGE-SIZE ~S): ~S is not a valid storage size.  A non-negative integer was expected."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STORAGE-SIZE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STORAGE-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STORAGE-SIZE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STORAGE-SIZE")));
        $sym257$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $str258$_SET_STORAGE_SIZE__S____S_is_not_ = SubLObjectFactory.makeString("(SET-STORAGE-SIZE ~S): ~S is not a valid storage size.  A non-negative integer was expected.");
        $sym259$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_STORAGE_SIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-STORAGE-SIZE-METHOD");
        $sym260$GET_LARGEST_INDEX = SubLObjectFactory.makeSymbol("GET-LARGEST-INDEX");
        $list261 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX")));
        $sym262$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym263$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_LARGEST_INDEX_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-LARGEST-INDEX-METHOD");
        $sym264$SET_LARGEST_INDEX = SubLObjectFactory.makeSymbol("SET-LARGEST-INDEX");
        $list265 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LARGEST-INDEX"));
        $list266 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LARGEST-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LARGEST-INDEX")));
        $sym267$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym268$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_LARGEST_INDEX_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-LARGEST-INDEX-METHOD");
        $sym269$RECORD_INDEX = SubLObjectFactory.makeSymbol("RECORD-INDEX");
        $list270 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"));
        $list271 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"), (SubLObject)subloop_sequences.ZERO_INTEGER)), (SubLObject)SubLObjectFactory.makeString("(RECORD-INDEX ~S): ~S is not a valid index.  A non-negative integer was expected."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-INDEX"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LARGEST-INDEX")));
        $sym272$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $str273$_RECORD_INDEX__S____S_is_not_a_va = SubLObjectFactory.makeString("(RECORD-INDEX ~S): ~S is not a valid index.  A non-negative integer was expected.");
        $sym274$BASIC_VARIABLE_LENGTH_SEQUENCE_RECORD_INDEX_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-RECORD-INDEX-METHOD");
        $sym275$GET_DEFAULT_VALUE = SubLObjectFactory.makeSymbol("GET-DEFAULT-VALUE");
        $list276 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-VALUE")));
        $sym277$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym278$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_DEFAULT_VALUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-DEFAULT-VALUE-METHOD");
        $sym279$SET_DEFAULT_VALUE = SubLObjectFactory.makeSymbol("SET-DEFAULT-VALUE");
        $list280 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DEFAULT-VALUE"));
        $list281 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DEFAULT-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DEFAULT-VALUE")));
        $sym282$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym283$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_DEFAULT_VALUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-DEFAULT-VALUE-METHOD");
        $sym284$GET_GROWTH_FACTOR = SubLObjectFactory.makeSymbol("GET-GROWTH-FACTOR");
        $list285 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("GROWTH-FACTOR")));
        $sym286$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym287$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_GROWTH_FACTOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-GROWTH-FACTOR-METHOD");
        $sym288$SET_GROWTH_FACTOR = SubLObjectFactory.makeSymbol("SET-GROWTH-FACTOR");
        $list289 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GROWTH-FACTOR"));
        $list290 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-GROWTH-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-GROWTH-FACTOR"), (SubLObject)SubLObjectFactory.makeDouble(1.0))), (SubLObject)SubLObjectFactory.makeString("(SET-GROWTH-FACTOR ~S): ~S is not a valid growth factor.  The growth factor must be a number > 1.0."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-GROWTH-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GROWTH-FACTOR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-GROWTH-FACTOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-GROWTH-FACTOR")));
        $sym291$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $float292$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $str293$_SET_GROWTH_FACTOR__S____S_is_not = SubLObjectFactory.makeString("(SET-GROWTH-FACTOR ~S): ~S is not a valid growth factor.  The growth factor must be a number > 1.0.");
        $sym294$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_GROWTH_FACTOR_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-GROWTH-FACTOR-METHOD");
        $sym295$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $sym296$BASIC_VARIABLE_LENGTH_SEQUENCE_GET_SEQUENCE_CLASS_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-GET-SEQUENCE-CLASS-METHOD");
        $list297 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBCLASSP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE"))))), (SubLObject)SubLObjectFactory.makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-VARIABLE-LENGTH-SEQUENCE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS")));
        $sym298$OUTER_CATCH_FOR_BASIC_VARIABLE_LENGTH_SEQUENCE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-VARIABLE-LENGTH-SEQUENCE-METHOD");
        $str299$_SET_SEQUENCE_CLASS__S____S_is_no = SubLObjectFactory.makeString("(SET-SEQUENCE-CLASS ~S): ~S is not a subclass of BASIC-VARIABLE-LENGTH-SEQUENCE.");
        $sym300$BASIC_VARIABLE_LENGTH_SEQUENCE_SET_SEQUENCE_CLASS_METHOD = SubLObjectFactory.makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE-SET-SEQUENCE-CLASS-METHOD");
        $sym301$FIXED_LENGTH_SEQUENCE = SubLObjectFactory.makeSymbol("FIXED-LENGTH-SEQUENCE");
        $list302 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LENGTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DEFAULT-VALUE"), (SubLObject)subloop_sequences.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DEFAULT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DEFAULT-VALUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
    }
}

/*

	Total time: 1378 ms
	
*/