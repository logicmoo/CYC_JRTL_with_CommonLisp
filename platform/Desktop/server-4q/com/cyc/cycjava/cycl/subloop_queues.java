package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_queues extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subloop_queues";
    public static final String myFingerPrint = "53696b3fae82c466acee4fa2035e7d93a2428d23af00978fb405fff71cb7e8c7";
    private static final SubLSymbol $sym0$QUEUE_ELEMENT_INTERFACE;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$QUEUE_PRIORITIZER_INTERFACE;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$QUEUE_PRIORITIZER_TEMPLATE;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$ORDER_QUEUE;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$QUEUE_SIMPLE_SORTER_TEMPLATE;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$ORDER_QUEUE_INTERNAL;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$BASIC_QUEUE_SIMPLE_SORTER;
    private static final SubLSymbol $sym21$OBJECT;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$ELEMENT_KEY_FUNCTION;
    private static final SubLSymbol $sym25$SORT_PREDICATE;
    private static final SubLString $str26$_ORDER_QUEUE_INTERNAL__S___No_ord;
    private static final SubLSymbol $sym27$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_INTERNAL_METHOD;
    private static final SubLString $str28$_ORDER_QUEUE__S____S_is_not_an_in;
    private static final SubLSymbol $sym29$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_METHOD;
    private static final SubLSymbol $sym30$INSTANCE_COUNT;
    private static final SubLSymbol $sym31$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_CLASS;
    private static final SubLSymbol $sym32$ISOLATED_P;
    private static final SubLSymbol $sym33$INSTANCE_NUMBER;
    private static final SubLSymbol $sym34$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_INSTANCE;
    private static final SubLSymbol $sym35$INITIALIZE;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD;
    private static final SubLSymbol $sym38$BASIC_QUEUE_SIMPLE_SORTER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym39$GET_SORT_PREDICATE;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD;
    private static final SubLSymbol $sym42$BASIC_QUEUE_SIMPLE_SORTER_GET_SORT_PREDICATE_METHOD;
    private static final SubLSymbol $sym43$SET_SORT_PREDICATE;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD;
    private static final SubLSymbol $sym47$BASIC_QUEUE_SIMPLE_SORTER_SET_SORT_PREDICATE_METHOD;
    private static final SubLSymbol $sym48$GET_ELEMENT_KEY;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD;
    private static final SubLSymbol $sym51$BASIC_QUEUE_SIMPLE_SORTER_GET_ELEMENT_KEY_METHOD;
    private static final SubLSymbol $sym52$SET_ELEMENT_KEY;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD;
    private static final SubLSymbol $sym56$BASIC_QUEUE_SIMPLE_SORTER_SET_ELEMENT_KEY_METHOD;
    private static final SubLSymbol $sym57$QUEUE_INTERFACE;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$PRINT;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$ON_ENQUEUE;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$END_POINTER_QUEUE_TEMPLATE;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$EMPTY_P;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$ENQUEUE;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$REMOVE;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$DEQUEUE;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$FIND;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$GET_ELEMENT_COUNT;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$GET_CONTENTS;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$SET_CONTENTS;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$CLEAR;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$REORDER_CONTENTS;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$PEEK;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$ENQUEUED_P;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$BASIC_QUEUE;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$PRIORITIZER;
    private static final SubLSymbol $sym102$LAST_CONS;
    private static final SubLSymbol $sym103$FIRST_CONS;
    private static final SubLSymbol $sym104$IS_PASSIVE;
    private static final SubLInteger $int105$4097;
    private static final SubLSymbol $sym106$BASIC_QUEUE_ENQUEUED_P_METHOD;
    private static final SubLSymbol $sym107$BASIC_QUEUE_PEEK_METHOD;
    private static final SubLSymbol $sym108$BASIC_QUEUE_REORDER_CONTENTS_METHOD;
    private static final SubLSymbol $sym109$BASIC_QUEUE_CLEAR_METHOD;
    private static final SubLSymbol $sym110$BASIC_QUEUE_SET_CONTENTS_METHOD;
    private static final SubLSymbol $sym111$BASIC_QUEUE_GET_CONTENTS_METHOD;
    private static final SubLSymbol $sym112$BASIC_QUEUE_GET_ELEMENT_COUNT_METHOD;
    private static final SubLSymbol $sym113$BASIC_QUEUE_FIND_METHOD;
    private static final SubLSymbol $sym114$DEQUEUE_NOTIFY;
    private static final SubLSymbol $sym115$BASIC_QUEUE_DEQUEUE_METHOD;
    private static final SubLSymbol $sym116$REMOVE_NOTIFY;
    private static final SubLSymbol $sym117$BASIC_QUEUE_REMOVE_METHOD;
    private static final SubLSymbol $sym118$BASIC_QUEUE_ON_ENQUEUE_METHOD;
    private static final SubLSymbol $sym119$ENQUEUE_NOTIFY;
    private static final SubLSymbol $sym120$BASIC_QUEUE_ENQUEUE_METHOD;
    private static final SubLSymbol $sym121$BASIC_QUEUE_EMPTY_P_METHOD;
    private static final SubLString $str122$QUEUE___;
    private static final SubLString $str123$QUEUE___S_;
    private static final SubLString $str124$QUEUE___S;
    private static final SubLString $str125$___S;
    private static final SubLString $str126$_;
    private static final SubLSymbol $sym127$BASIC_QUEUE_PRINT_METHOD;
    private static final SubLSymbol $sym128$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_CLASS;
    private static final SubLSymbol $sym129$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_INSTANCE;
    private static final SubLList $list130;
    private static final SubLSymbol $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD;
    private static final SubLSymbol $sym132$BASIC_QUEUE_INITIALIZE_METHOD;
    private static final SubLSymbol $sym133$GET_FIRST_CONS;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD;
    private static final SubLSymbol $sym136$BASIC_QUEUE_GET_FIRST_CONS_METHOD;
    private static final SubLSymbol $sym137$SET_FIRST_CONS;
    private static final SubLList $list138;
    private static final SubLList $list139;
    private static final SubLSymbol $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD;
    private static final SubLSymbol $sym141$BASIC_QUEUE_SET_FIRST_CONS_METHOD;
    private static final SubLSymbol $sym142$GET_END_POINTER;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD;
    private static final SubLSymbol $sym145$BASIC_QUEUE_GET_END_POINTER_METHOD;
    private static final SubLSymbol $sym146$SET_END_POINTER;
    private static final SubLList $list147;
    private static final SubLList $list148;
    private static final SubLSymbol $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD;
    private static final SubLSymbol $sym150$BASIC_QUEUE_SET_END_POINTER_METHOD;
    private static final SubLSymbol $sym151$GET_PRIORITIZER;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD;
    private static final SubLSymbol $sym154$BASIC_QUEUE_GET_PRIORITIZER_METHOD;
    private static final SubLSymbol $sym155$SET_PRIORITIZER;
    private static final SubLList $list156;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD;
    private static final SubLString $str159$_SET_PRIORITIZER__S____S_is_not_a;
    private static final SubLSymbol $sym160$BASIC_QUEUE_SET_PRIORITIZER_METHOD;
    private static final SubLSymbol $sym161$PASSIVE_P;
    private static final SubLList $list162;
    private static final SubLList $list163;
    private static final SubLSymbol $sym164$BASIC_QUEUE_PASSIVE_P_METHOD;
    private static final SubLSymbol $sym165$SET_PASSIVE;
    private static final SubLList $list166;
    private static final SubLList $list167;
    private static final SubLSymbol $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD;
    private static final SubLSymbol $sym169$BASIC_QUEUE_SET_PASSIVE_METHOD;
    private static final SubLSymbol $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE;
    private static final SubLList $list171;
    private static final SubLSymbol $sym172$INITIALIZE_QUA_DOUBLY_LINKED_QUEUE;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$GET_LIST;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLList $list177;
    private static final SubLList $list178;
    private static final SubLList $list179;
    private static final SubLList $list180;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLList $list183;
    private static final SubLList $list184;
    private static final SubLList $list185;
    private static final SubLList $list186;
    private static final SubLList $list187;
    private static final SubLList $list188;
    private static final SubLList $list189;
    private static final SubLList $list190;
    private static final SubLSymbol $sym191$BASIC_DOUBLY_LINKED_QUEUE;
    private static final SubLList $list192;
    private static final SubLList $list193;
    private static final SubLSymbol $sym194$LIST;
    private static final SubLSymbol $sym195$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUED_P_METHOD;
    private static final SubLSymbol $sym196$BASIC_DOUBLY_LINKED_QUEUE_PEEK_METHOD;
    private static final SubLSymbol $sym197$BASIC_DOUBLY_LINKED_QUEUE_REORDER_CONTENTS_METHOD;
    private static final SubLSymbol $sym198$BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD;
    private static final SubLSymbol $sym199$BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD;
    private static final SubLSymbol $sym200$BASIC_DOUBLY_LINKED_QUEUE_GET_CONTENTS_METHOD;
    private static final SubLSymbol $sym201$BASIC_DOUBLY_LINKED_QUEUE_GET_ELEMENT_COUNT_METHOD;
    private static final SubLSymbol $sym202$ALLOCATE_ENUMERATOR;
    private static final SubLSymbol $sym203$FIRST;
    private static final SubLSymbol $sym204$DEALLOCATE_ENUMERATOR;
    private static final SubLSymbol $sym205$NEXT;
    private static final SubLSymbol $sym206$BASIC_DOUBLY_LINKED_QUEUE_FIND_METHOD;
    private static final SubLSymbol $sym207$BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD;
    private static final SubLSymbol $sym208$BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD;
    private static final SubLSymbol $sym209$BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD;
    private static final SubLSymbol $sym210$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD;
    private static final SubLSymbol $sym211$BASIC_DOUBLY_LINKED_QUEUE_EMPTY_P_METHOD;
    private static final SubLSymbol $sym212$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD;
    private static final SubLSymbol $sym213$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_METHOD;
    private static final SubLString $str214$DL_QUEUE___;
    private static final SubLString $str215$___S_Class_is_not_correctly_imple;
    private static final SubLString $str216$DL_QUEUE___S;
    private static final SubLSymbol $sym217$LAST_P;
    private static final SubLSymbol $sym218$BASIC_DOUBLY_LINKED_QUEUE_PRINT_METHOD;
    private static final SubLSymbol $sym219$BASIC_DOUBLY_LINKED_LIST;
    private static final SubLSymbol $sym220$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_METHOD;
    private static final SubLSymbol $sym221$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_METH;
    private static final SubLSymbol $sym222$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_CLASS;
    private static final SubLSymbol $sym223$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_INSTANCE;
    private static final SubLSymbol $sym224$GET_LIST_INTERNAL;
    private static final SubLList $list225;
    private static final SubLSymbol $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD;
    private static final SubLSymbol $sym227$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_INTERNAL_METHOD;
    private static final SubLSymbol $sym228$SET_LIST_INTERNAL;
    private static final SubLList $list229;
    private static final SubLList $list230;
    private static final SubLSymbol $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD;
    private static final SubLSymbol $sym232$BASIC_DOUBLY_LINKED_QUEUE_SET_LIST_INTERNAL_METHOD;
    private static final SubLSymbol $sym233$GET_PRIORITIZER_INTERNAL;
    private static final SubLSymbol $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD;
    private static final SubLSymbol $sym235$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_INTERNAL_METHOD;
    private static final SubLSymbol $sym236$SET_PRIORITIZER_INTERNAL;
    private static final SubLList $list237;
    private static final SubLSymbol $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD;
    private static final SubLSymbol $sym239$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_INTERNAL_METHOD;
    private static final SubLList $list240;
    private static final SubLSymbol $sym241$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD;
    private static final SubLSymbol $sym242$BASIC_DOUBLY_LINKED_QUEUE_PASSIVE_P_METHOD;
    private static final SubLSymbol $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD;
    private static final SubLSymbol $sym244$BASIC_DOUBLY_LINKED_QUEUE_SET_PASSIVE_METHOD;
    private static final SubLSymbol $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE;
    private static final SubLList $list246;
    private static final SubLSymbol $sym247$LOCK;
    private static final SubLSymbol $sym248$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLAS;
    private static final SubLSymbol $sym249$LOCK_HISTORY;
    private static final SubLSymbol $sym250$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INST;
    private static final SubLList $list251;
    private static final SubLSymbol $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD;
    private static final SubLString $str253$_S;
    private static final SubLSymbol $sym254$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD;
    private static final SubLList $list255;
    private static final SubLList $list256;
    private static final SubLSymbol $sym257$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD;
    private static final SubLList $list258;
    private static final SubLSymbol $kw259$WAITING;
    private static final SubLSymbol $kw260$ENQUEUE;
    private static final SubLSymbol $kw261$LOCKED;
    private static final SubLSymbol $kw262$UNLOCKED;
    private static final SubLSymbol $sym263$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD;
    private static final SubLSymbol $sym264$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD;
    private static final SubLList $list265;
    private static final SubLSymbol $kw266$REMOVE;
    private static final SubLSymbol $sym267$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD;
    private static final SubLList $list268;
    private static final SubLSymbol $kw269$DEQUEUE;
    private static final SubLSymbol $sym270$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD;
    private static final SubLList $list271;
    private static final SubLSymbol $kw272$SET_CONTENTS;
    private static final SubLSymbol $sym273$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD;
    private static final SubLList $list274;
    private static final SubLSymbol $kw275$CLEAR;
    private static final SubLSymbol $sym276$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD;
    private static final SubLSymbol $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE;
    private static final SubLList $list278;
    private static final SubLSymbol $sym279$SEMAPHORE;
    private static final SubLSymbol $sym280$SEMAPHORE_NAME;
    private static final SubLSymbol $sym281$BASE_SUFFIX_COUNTER;
    private static final SubLSymbol $sym282$BASE_NAME;
    private static final SubLString $str283$BASIC_DOUBLY_LINKED_IPC_QUEUE;
    private static final SubLSymbol $sym284$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_CLASS;
    private static final SubLSymbol $sym285$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_INSTANC;
    private static final SubLList $list286;
    private static final SubLSymbol $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD;
    private static final SubLString $str288$_A__S;
    private static final SubLString $str289$Lock_for_Queue_;
    private static final SubLSymbol $sym290$BASIC_DOUBLY_LINKED_IPC_QUEUE_INITIALIZE_METHOD;
    private static final SubLList $list291;
    private static final SubLSymbol $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym293$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_PRIORITIZER_METHOD;
    private static final SubLList $list294;
    private static final SubLSymbol $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym296$BASIC_DOUBLY_LINKED_IPC_QUEUE_ENQUEUE_METHOD;
    private static final SubLList $list297;
    private static final SubLSymbol $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym299$BASIC_DOUBLY_LINKED_IPC_QUEUE_REMOVE_METHOD;
    private static final SubLList $list300;
    private static final SubLSymbol $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym302$BASIC_DOUBLY_LINKED_IPC_QUEUE_DEQUEUE_METHOD;
    private static final SubLList $list303;
    private static final SubLSymbol $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym305$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_CONTENTS_METHOD;
    private static final SubLList $list306;
    private static final SubLSymbol $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym308$BASIC_DOUBLY_LINKED_IPC_QUEUE_CLEAR_METHOD;
    private static final SubLSymbol $sym309$BASIC_IPC_QUEUE;
    private static final SubLList $list310;
    private static final SubLSymbol $sym311$ACTUAL_IPC_QUEUE;
    private static final SubLSymbol $sym312$BASIC_IPC_QUEUE_ON_ENQUEUE_METHOD;
    private static final SubLSymbol $sym313$BASIC_IPC_QUEUE_PRINT_METHOD;
    private static final SubLSymbol $sym314$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_CLASS;
    private static final SubLSymbol $sym315$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_INSTANCE;
    private static final SubLList $list316;
    private static final SubLSymbol $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLString $str318$BASIC_IPC_QUEUE_;
    private static final SubLSymbol $sym319$BASIC_IPC_QUEUE_INITIALIZE_METHOD;
    private static final SubLSymbol $sym320$GET_ACTUAL_IPC_QUEUE;
    private static final SubLList $list321;
    private static final SubLSymbol $sym322$BASIC_IPC_QUEUE_GET_ACTUAL_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym323$SET_ACTUAL_IPC_QUEUE;
    private static final SubLList $list324;
    private static final SubLList $list325;
    private static final SubLSymbol $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLString $str327$_SET_ACTUAL_IPC_QUEUE__S____S_is_;
    private static final SubLSymbol $sym328$BASIC_IPC_QUEUE_SET_ACTUAL_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym330$BASIC_IPC_QUEUE_GET_PRIORITIZER_METHOD;
    private static final SubLSymbol $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym332$BASIC_IPC_QUEUE_SET_PRIORITIZER_METHOD;
    private static final SubLList $list333;
    private static final SubLSymbol $sym334$BASIC_IPC_QUEUE_EMPTY_P_METHOD;
    private static final SubLList $list335;
    private static final SubLSymbol $sym336$BASIC_IPC_QUEUE_ENQUEUE_METHOD;
    private static final SubLList $list337;
    private static final SubLString $str338$Invalid_operation__Cannot_remove_;
    private static final SubLSymbol $sym339$BASIC_IPC_QUEUE_REMOVE_METHOD;
    private static final SubLList $list340;
    private static final SubLSymbol $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym342$BASIC_IPC_QUEUE_DEQUEUE_METHOD;
    private static final SubLList $list343;
    private static final SubLSymbol $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym345$BASIC_IPC_QUEUE_GET_ELEMENT_COUNT_METHOD;
    private static final SubLList $list346;
    private static final SubLSymbol $sym347$BASIC_IPC_QUEUE_GET_CONTENTS_METHOD;
    private static final SubLList $list348;
    private static final SubLString $str349$_SET_CONTENTS__S____S_is_not_a_va;
    private static final SubLSymbol $sym350$BASIC_IPC_QUEUE_SET_CONTENTS_METHOD;
    private static final SubLList $list351;
    private static final SubLSymbol $sym352$BASIC_IPC_QUEUE_CLEAR_METHOD;
    private static final SubLList $list353;
    private static final SubLSymbol $sym354$BASIC_IPC_QUEUE_REORDER_CONTENTS_METHOD;
    private static final SubLList $list355;
    private static final SubLSymbol $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym357$BASIC_IPC_QUEUE_PEEK_METHOD;
    private static final SubLList $list358;
    private static final SubLSymbol $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym360$BASIC_IPC_QUEUE_ENQUEUED_P_METHOD;
    private static final SubLList $list361;
    private static final SubLSymbol $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym363$BASIC_IPC_QUEUE_FIND_METHOD;
    private static final SubLSymbol $sym364$BASIC_IPC_QUEUE_PASSIVE_P_METHOD;
    private static final SubLSymbol $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD;
    private static final SubLSymbol $sym366$BASIC_IPC_QUEUE_SET_PASSIVE_METHOD;
    private static final SubLString $str367$QUEUE_INTERFACE_GET_PRIORITIZER__;
    private static final SubLString $str368$QUEUE_INTERFACE_SET_PRIORITIZER__;
    private static final SubLString $str369$QUEUE_INTERFACE_EMPTY_P___S_is_no;
    private static final SubLString $str370$QUEUE_INTERFACE_ENQUEUE___S_is_no;
    private static final SubLString $str371$QUEUE_INTERFACE_REMOVE___S_is_not;
    private static final SubLString $str372$QUEUE_INTERFACE_DEQUEUE___S_is_no;
    private static final SubLString $str373$QUEUE_INTERFACE_GET_ELEMENT_COUNT;
    private static final SubLString $str374$QUEUE_INTERFACE_GET_CONTENTS___S_;
    private static final SubLString $str375$QUEUE_INTERFACE_SET_CONTENTS___S_;
    private static final SubLString $str376$QUEUE_INTERFACE_CLEAR___S_is_not_;
    private static final SubLString $str377$QUEUE_INTERFACE_REORDER_CONTENTS_;
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 1058L)
    public static SubLObject queue_element_interface_p(final SubLObject queue_element_interface) {
        return interfaces.subloop_instanceof_interface(queue_element_interface, (SubLObject)subloop_queues.$sym0$QUEUE_ELEMENT_INTERFACE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 1350L)
    public static SubLObject queue_prioritizer_interface_p(final SubLObject queue_prioritizer_interface) {
        return interfaces.subloop_instanceof_interface(queue_prioritizer_interface, (SubLObject)subloop_queues.$sym2$QUEUE_PRIORITIZER_INTERFACE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 1546L)
    public static SubLObject queue_prioritizer_template_p(final SubLObject queue_prioritizer_template) {
        return interfaces.subloop_instanceof_interface(queue_prioritizer_template, (SubLObject)subloop_queues.$sym4$QUEUE_PRIORITIZER_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 2279L)
    public static SubLObject queue_simple_sorter_template_p(final SubLObject queue_simple_sorter_template) {
        return interfaces.subloop_instanceof_interface(queue_simple_sorter_template, (SubLObject)subloop_queues.$sym12$QUEUE_SIMPLE_SORTER_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
    public static SubLObject get_basic_queue_simple_sorter_element_key_function(final SubLObject basic_queue_simple_sorter) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue_simple_sorter, (SubLObject)subloop_queues.TWO_INTEGER, (SubLObject)subloop_queues.$sym24$ELEMENT_KEY_FUNCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
    public static SubLObject set_basic_queue_simple_sorter_element_key_function(final SubLObject basic_queue_simple_sorter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue_simple_sorter, value, (SubLObject)subloop_queues.TWO_INTEGER, (SubLObject)subloop_queues.$sym24$ELEMENT_KEY_FUNCTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
    public static SubLObject get_basic_queue_simple_sorter_sort_predicate(final SubLObject basic_queue_simple_sorter) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue_simple_sorter, (SubLObject)subloop_queues.ONE_INTEGER, (SubLObject)subloop_queues.$sym25$SORT_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
    public static SubLObject set_basic_queue_simple_sorter_sort_predicate(final SubLObject basic_queue_simple_sorter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue_simple_sorter, value, (SubLObject)subloop_queues.ONE_INTEGER, (SubLObject)subloop_queues.$sym25$SORT_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
    public static SubLObject basic_queue_simple_sorter_order_queue_internal_method(final SubLObject self, final SubLObject contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_predicate = basic_queue_simple_sorter_get_sort_predicate_method(self);
        SubLObject template_key_function = basic_queue_simple_sorter_get_element_key_method(self);
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == template_predicate) {
            Errors.error((SubLObject)subloop_queues.$str26$_ORDER_QUEUE_INTERNAL__S___No_ord, self);
        }
        if (subloop_queues.NIL == template_key_function) {
            template_key_function = Symbols.symbol_function((SubLObject)subloop_queues.IDENTITY);
        }
        return Sort.sort(contents, template_predicate, template_key_function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
    public static SubLObject basic_queue_simple_sorter_order_queue_method(final SubLObject self, final SubLObject queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue)) {
            Errors.error((SubLObject)subloop_queues.$str28$_ORDER_QUEUE__S____S_is_not_an_in, self, queue);
        }
        final SubLObject template_contents = queue_interface_get_contents(queue);
        if (subloop_queues.NIL != template_contents) {
            final SubLObject template_contents_ordered = basic_queue_simple_sorter_order_queue_internal_method(self, template_contents);
            queue_interface_reorder_contents(queue, template_contents_ordered);
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
    public static SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym30$INSTANCE_COUNT, (SubLObject)subloop_queues.ZERO_INTEGER);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
    public static SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym32$ISOLATED_P, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym33$INSTANCE_NUMBER, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym25$SORT_PREDICATE, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym24$ELEMENT_KEY_FUNCTION, (SubLObject)subloop_queues.NIL);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
    public static SubLObject basic_queue_simple_sorter_p(final SubLObject basic_queue_simple_sorter) {
        return classes.subloop_instanceof_class(basic_queue_simple_sorter, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4082L)
    public static SubLObject basic_queue_simple_sorter_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = (SubLObject)subloop_queues.NIL;
        SubLObject element_key_function = get_basic_queue_simple_sorter_element_key_function(self);
        SubLObject sort_predicate = get_basic_queue_simple_sorter_sort_predicate(self);
        try {
            thread.throwStack.push(subloop_queues.$sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                object.object_initialize_method(self);
                sort_predicate = (SubLObject)subloop_queues.NIL;
                element_key_function = (SubLObject)subloop_queues.NIL;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                    set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4256L)
    public static SubLObject basic_queue_simple_sorter_get_sort_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = (SubLObject)subloop_queues.NIL;
        final SubLObject sort_predicate = get_basic_queue_simple_sorter_sort_predicate(self);
        try {
            thread.throwStack.push(subloop_queues.$sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, sort_predicate);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4360L)
    public static SubLObject basic_queue_simple_sorter_set_sort_predicate_method(final SubLObject self, final SubLObject new_predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = (SubLObject)subloop_queues.NIL;
        SubLObject sort_predicate = get_basic_queue_simple_sorter_sort_predicate(self);
        try {
            thread.throwStack.push(subloop_queues.$sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                sort_predicate = new_predicate;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_predicate);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4515L)
    public static SubLObject basic_queue_simple_sorter_get_element_key_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = (SubLObject)subloop_queues.NIL;
        final SubLObject element_key_function = get_basic_queue_simple_sorter_element_key_function(self);
        try {
            thread.throwStack.push(subloop_queues.$sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, element_key_function);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4622L)
    public static SubLObject basic_queue_simple_sorter_set_element_key_method(final SubLObject self, final SubLObject new_key_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_simple_sorter_method = (SubLObject)subloop_queues.NIL;
        SubLObject element_key_function = get_basic_queue_simple_sorter_element_key_function(self);
        try {
            thread.throwStack.push(subloop_queues.$sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
            try {
                element_key_function = new_key_function;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_key_function);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_simple_sorter_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4789L)
    public static SubLObject queue_interface_p(final SubLObject queue_interface) {
        return interfaces.subloop_instanceof_interface(queue_interface, (SubLObject)subloop_queues.$sym57$QUEUE_INTERFACE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 6561L)
    public static SubLObject end_pointer_queue_template_p(final SubLObject end_pointer_queue_template) {
        return interfaces.subloop_instanceof_interface(end_pointer_queue_template, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject get_basic_queue_prioritizer(final SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, (SubLObject)subloop_queues.THREE_INTEGER, (SubLObject)subloop_queues.$sym101$PRIORITIZER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject set_basic_queue_prioritizer(final SubLObject basic_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, (SubLObject)subloop_queues.THREE_INTEGER, (SubLObject)subloop_queues.$sym101$PRIORITIZER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject get_basic_queue_last_cons(final SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, (SubLObject)subloop_queues.TWO_INTEGER, (SubLObject)subloop_queues.$sym102$LAST_CONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject set_basic_queue_last_cons(final SubLObject basic_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, (SubLObject)subloop_queues.TWO_INTEGER, (SubLObject)subloop_queues.$sym102$LAST_CONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject get_basic_queue_first_cons(final SubLObject basic_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_queue, (SubLObject)subloop_queues.ONE_INTEGER, (SubLObject)subloop_queues.$sym103$FIRST_CONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject set_basic_queue_first_cons(final SubLObject basic_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_queue, value, (SubLObject)subloop_queues.ONE_INTEGER, (SubLObject)subloop_queues.$sym103$FIRST_CONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject get_basic_queue_is_passive(final SubLObject basic_queue) {
        final SubLObject v_class = subloop_structures.instance_class(basic_queue);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_queues.$sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_queue, slot);
        return classes.ldb_test((SubLObject)subloop_queues.$int105$4097, subloop_structures.instance_boolean_slots(basic_queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject set_basic_queue_is_passive(final SubLObject basic_queue, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_queue);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_queues.$sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_queue, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_queue, bytes.dpb((SubLObject)((subloop_queues.NIL != value) ? subloop_queues.ONE_INTEGER : subloop_queues.ZERO_INTEGER), (SubLObject)subloop_queues.$int105$4097, subloop_structures.instance_boolean_slots(basic_queue)));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object) {
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        if (subloop_queues.NIL != conses_high.member(v_object, template_contents, Symbols.symbol_function((SubLObject)subloop_queues.EQUAL), (SubLObject)subloop_queues.UNPROVIDED)) {
            return (SubLObject)subloop_queues.T;
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_peek_method(final SubLObject self) {
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        if (subloop_queues.NIL == template_contents) {
            return (SubLObject)subloop_queues.NIL;
        }
        return template_contents.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents) {
        return basic_queue_set_contents_method(self, ordered_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_clear_method(final SubLObject self) {
        basic_queue_set_first_cons_method(self, (SubLObject)subloop_queues.NIL);
        basic_queue_set_end_pointer_method(self, (SubLObject)subloop_queues.NIL);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLObject template_contents = conses_high.copy_list(new_contents);
        if (subloop_queues.NIL != template_contents) {
            basic_queue_set_first_cons_method(self, template_contents);
            basic_queue_set_end_pointer_method(self, conses_high.last(template_contents, (SubLObject)subloop_queues.UNPROVIDED));
        }
        else {
            basic_queue_set_first_cons_method(self, (SubLObject)subloop_queues.NIL);
            basic_queue_set_end_pointer_method(self, (SubLObject)subloop_queues.NIL);
        }
        return new_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_get_contents_method(final SubLObject self) {
        return basic_queue_get_first_cons_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_get_element_count_method(final SubLObject self) {
        return Sequences.length(basic_queue_get_first_cons_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == subloop_queues.UNPROVIDED) {
            equality_pred = Symbols.symbol_function((SubLObject)subloop_queues.EQL);
        }
        if (key_accessor_function == subloop_queues.UNPROVIDED) {
            key_accessor_function = Symbols.symbol_function((SubLObject)subloop_queues.IDENTITY);
        }
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        if (subloop_queues.NIL != template_contents) {
            final SubLObject template_item = conses_high.member(key_value, template_contents, equality_pred, key_accessor_function);
            if (subloop_queues.NIL != template_item) {
                return template_item;
            }
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_dequeue_method(final SubLObject self) {
        final SubLObject template_prioritizer = basic_queue_get_prioritizer_method(self);
        if (subloop_queues.NIL != template_prioritizer) {
            methods.funcall_instance_method_with_1_args(template_prioritizer, (SubLObject)subloop_queues.$sym8$ORDER_QUEUE, self);
        }
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        if (subloop_queues.NIL == template_contents) {
            return (SubLObject)subloop_queues.NIL;
        }
        if (subloop_queues.NIL == template_contents.rest()) {
            basic_queue_set_first_cons_method(self, (SubLObject)subloop_queues.NIL);
            basic_queue_set_end_pointer_method(self, (SubLObject)subloop_queues.NIL);
            final SubLObject template_result = template_contents.first();
            if (subloop_queues.NIL == basic_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(template_result)) {
                methods.funcall_instance_method_with_1_args(template_result, (SubLObject)subloop_queues.$sym114$DEQUEUE_NOTIFY, self);
            }
            return template_result;
        }
        basic_queue_set_first_cons_method(self, template_contents.rest());
        final SubLObject template_result = template_contents.first();
        if (subloop_queues.NIL == basic_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(template_result)) {
            methods.funcall_instance_method_with_1_args(template_result, (SubLObject)subloop_queues.$sym114$DEQUEUE_NOTIFY, self);
        }
        return template_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_contents = basic_queue_get_first_cons_method(self);
        final SubLObject template_end_pointer = basic_queue_get_end_pointer_method(self);
        if (subloop_queues.NIL == template_contents) {
            return (SubLObject)subloop_queues.NIL;
        }
        if (old_element.eql(template_contents.first())) {
            if (template_contents.eql(template_end_pointer)) {
                basic_queue_set_first_cons_method(self, (SubLObject)subloop_queues.NIL);
                basic_queue_set_end_pointer_method(self, (SubLObject)subloop_queues.NIL);
                if (subloop_queues.NIL == basic_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(old_element)) {
                    methods.funcall_instance_method_with_1_args(old_element, (SubLObject)subloop_queues.$sym116$REMOVE_NOTIFY, self);
                }
                return old_element;
            }
            basic_queue_set_first_cons_method(self, template_contents.rest());
            if (subloop_queues.NIL == basic_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(old_element)) {
                methods.funcall_instance_method_with_1_args(old_element, (SubLObject)subloop_queues.$sym116$REMOVE_NOTIFY, self);
            }
            return old_element;
        }
        else {
            SubLObject template_current_cons;
            for (template_current_cons = template_contents; !template_current_cons.rest().eql(template_end_pointer); template_current_cons = template_current_cons.rest()) {
                if (old_element.eql(conses_high.cadr(template_current_cons))) {
                    ConsesLow.rplacd(template_current_cons, conses_high.cddr(template_current_cons));
                    if (subloop_queues.NIL == basic_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(old_element)) {
                        methods.funcall_instance_method_with_1_args(old_element, (SubLObject)subloop_queues.$sym116$REMOVE_NOTIFY, self);
                    }
                    return old_element;
                }
            }
            if (old_element.eql(conses_high.cadr(template_current_cons))) {
                ConsesLow.rplacd(template_current_cons, (SubLObject)subloop_queues.NIL);
                basic_queue_set_end_pointer_method(self, template_current_cons);
                if (subloop_queues.NIL == basic_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(old_element)) {
                    methods.funcall_instance_method_with_1_args(old_element, (SubLObject)subloop_queues.$sym116$REMOVE_NOTIFY, self);
                }
                return old_element;
            }
            if (subloop_queues.NIL == basic_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(old_element)) {
                methods.funcall_instance_method_with_1_args(old_element, (SubLObject)subloop_queues.$sym116$REMOVE_NOTIFY, self);
            }
            return old_element;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        SubLObject template_contents = basic_queue_get_first_cons_method(self);
        SubLObject template_end_pointer = basic_queue_get_end_pointer_method(self);
        if (subloop_queues.NIL == template_contents) {
            template_contents = (template_end_pointer = (SubLObject)ConsesLow.list(new_element));
        }
        else {
            ConsesLow.rplacd(template_end_pointer, (SubLObject)ConsesLow.list(new_element));
            template_end_pointer = template_end_pointer.rest();
        }
        basic_queue_set_first_cons_method(self, template_contents);
        basic_queue_set_end_pointer_method(self, template_end_pointer);
        if (subloop_queues.NIL == basic_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(new_element)) {
            methods.funcall_instance_method_with_1_args(new_element, (SubLObject)subloop_queues.$sym119$ENQUEUE_NOTIFY, self);
        }
        methods.funcall_instance_method_with_1_args(self, (SubLObject)subloop_queues.$sym62$ON_ENQUEUE, new_element);
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_empty_p_method(final SubLObject self) {
        return Types.sublisp_null(basic_queue_get_first_cons_method(self));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_contents = basic_queue_get_contents_method(self);
        if (subloop_queues.NIL == template_contents) {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str122$QUEUE___);
        }
        else if (subloop_queues.NIL == template_contents.rest()) {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str123$QUEUE___S_, template_contents.first());
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str124$QUEUE___S, template_contents.first());
            SubLObject cdolist_list_var = template_contents.rest();
            SubLObject element = (SubLObject)subloop_queues.NIL;
            element = cdolist_list_var.first();
            while (subloop_queues.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)subloop_queues.$str125$___S, element);
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
            PrintLow.format(stream, (SubLObject)subloop_queues.$str126$_);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject subloop_reserved_initialize_basic_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym30$INSTANCE_COUNT, (SubLObject)subloop_queues.ZERO_INTEGER);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject subloop_reserved_initialize_basic_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym32$ISOLATED_P, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym104$IS_PASSIVE, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym33$INSTANCE_NUMBER, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym103$FIRST_CONS, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym102$LAST_CONS, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym101$PRIORITIZER, (SubLObject)subloop_queues.NIL);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
    public static SubLObject basic_queue_p(final SubLObject basic_queue) {
        return classes.subloop_instanceof_class(basic_queue, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15147L)
    public static SubLObject basic_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject prioritizer = get_basic_queue_prioritizer(self);
        SubLObject last_cons = get_basic_queue_last_cons(self);
        SubLObject first_cons = get_basic_queue_first_cons(self);
        SubLObject is_passive = get_basic_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                object.object_initialize_method(self);
                first_cons = (SubLObject)subloop_queues.NIL;
                last_cons = (SubLObject)subloop_queues.NIL;
                prioritizer = (SubLObject)subloop_queues.NIL;
                is_passive = (SubLObject)subloop_queues.NIL;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_prioritizer(self, prioritizer);
                    set_basic_queue_last_cons(self, last_cons);
                    set_basic_queue_first_cons(self, first_cons);
                    set_basic_queue_is_passive(self, is_passive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15343L)
    public static SubLObject basic_queue_get_first_cons_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject first_cons = get_basic_queue_first_cons(self);
        try {
            thread.throwStack.push(subloop_queues.$sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, first_cons);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_first_cons(self, first_cons);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15428L)
    public static SubLObject basic_queue_set_first_cons_method(final SubLObject self, final SubLObject new_cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject first_cons = get_basic_queue_first_cons(self);
        try {
            thread.throwStack.push(subloop_queues.$sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                first_cons = new_cons;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_cons);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_first_cons(self, first_cons);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15549L)
    public static SubLObject basic_queue_get_end_pointer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject last_cons = get_basic_queue_last_cons(self);
        try {
            thread.throwStack.push(subloop_queues.$sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, last_cons);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_last_cons(self, last_cons);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15631L)
    public static SubLObject basic_queue_set_end_pointer_method(final SubLObject self, final SubLObject new_end_pointer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject last_cons = get_basic_queue_last_cons(self);
        try {
            thread.throwStack.push(subloop_queues.$sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                last_cons = new_end_pointer;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_end_pointer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_last_cons(self, last_cons);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15770L)
    public static SubLObject basic_queue_get_prioritizer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject prioritizer = get_basic_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, prioritizer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_prioritizer(self, prioritizer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15854L)
    public static SubLObject basic_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject prioritizer = get_basic_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL != new_prioritizer && subloop_queues.NIL == queue_prioritizer_interface_p(new_prioritizer)) {
                    Errors.error((SubLObject)subloop_queues.$str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                }
                prioritizer = new_prioritizer;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_prioritizer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_prioritizer(self, prioritizer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 16194L)
    public static SubLObject basic_queue_passive_p_method(final SubLObject self) {
        final SubLObject is_passive = get_basic_queue_is_passive(self);
        return is_passive;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 16282L)
    public static SubLObject basic_queue_set_passive_method(final SubLObject self, final SubLObject flag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject is_passive = get_basic_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
            try {
                is_passive = flag;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, flag);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_queue_is_passive(self, is_passive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 16385L)
    public static SubLObject doubly_linked_queue_template_p(final SubLObject doubly_linked_queue_template) {
        return interfaces.subloop_instanceof_interface(doubly_linked_queue_template, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject get_basic_doubly_linked_queue_prioritizer(final SubLObject basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_queue, (SubLObject)subloop_queues.TWO_INTEGER, (SubLObject)subloop_queues.$sym101$PRIORITIZER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject set_basic_doubly_linked_queue_prioritizer(final SubLObject basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_queue, value, (SubLObject)subloop_queues.TWO_INTEGER, (SubLObject)subloop_queues.$sym101$PRIORITIZER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject get_basic_doubly_linked_queue_list(final SubLObject basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_queue, (SubLObject)subloop_queues.ONE_INTEGER, (SubLObject)subloop_queues.$sym194$LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject set_basic_doubly_linked_queue_list(final SubLObject basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_queue, value, (SubLObject)subloop_queues.ONE_INTEGER, (SubLObject)subloop_queues.$sym194$LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject get_basic_doubly_linked_queue_is_passive(final SubLObject basic_doubly_linked_queue) {
        final SubLObject v_class = subloop_structures.instance_class(basic_doubly_linked_queue);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_queues.$sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_doubly_linked_queue, slot);
        return classes.ldb_test((SubLObject)subloop_queues.$int105$4097, subloop_structures.instance_boolean_slots(basic_doubly_linked_queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject set_basic_doubly_linked_queue_is_passive(final SubLObject basic_doubly_linked_queue, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_doubly_linked_queue);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_queues.$sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_doubly_linked_queue, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_doubly_linked_queue, bytes.dpb((SubLObject)((subloop_queues.NIL != value) ? subloop_queues.ONE_INTEGER : subloop_queues.ZERO_INTEGER), (SubLObject)subloop_queues.$int105$4097, subloop_structures.instance_boolean_slots(basic_doubly_linked_queue)));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (subloop_queues.NIL == template_list) {
            return (SubLObject)subloop_queues.NIL;
        }
        return subloop_collections.basic_doubly_linked_list_member_p_method(template_list, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_peek_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (subloop_queues.NIL == template_list) {
            return (SubLObject)subloop_queues.NIL;
        }
        if (!subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list).numE((SubLObject)subloop_queues.ZERO_INTEGER)) {
            return (SubLObject)subloop_queues.NIL;
        }
        final SubLObject next_item = subloop_collections.basic_doubly_linked_list_nth_method(template_list, (SubLObject)subloop_queues.ZERO_INTEGER);
        return next_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents) {
        final SubLObject resolved_list = basic_doubly_linked_queue_get_list_method(self);
        subloop_collections.basic_doubly_linked_list_set_contents_method(resolved_list, ordered_contents);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_clear_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (subloop_queues.NIL != template_list) {
            final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
            SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
            if (subloop_queues.NIL == basic_doubly_linked_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(template_current_item)) {
                methods.funcall_instance_method_with_0_args(template_current_item, (SubLObject)subloop_queues.$sym114$DEQUEUE_NOTIFY);
            }
            while (subloop_queues.NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                if (subloop_queues.NIL == basic_doubly_linked_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(template_current_item)) {
                    methods.funcall_instance_method_with_0_args(template_current_item, (SubLObject)subloop_queues.$sym114$DEQUEUE_NOTIFY);
                }
            }
            subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
            subloop_collections.basic_doubly_linked_list_clear_method(template_list);
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLObject template_resolved_list = basic_doubly_linked_queue_get_list_method(self);
        final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_resolved_list);
        if (subloop_queues.NIL == subloop_collections.basic_doubly_linked_list_enumerator_empty_p_method(template_enumerator)) {
            SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
            if (subloop_queues.NIL == basic_doubly_linked_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(template_current_item)) {
                methods.funcall_instance_method_with_0_args(template_current_item, (SubLObject)subloop_queues.$sym114$DEQUEUE_NOTIFY);
            }
            while (subloop_queues.NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                if (subloop_queues.NIL == basic_doubly_linked_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(template_current_item)) {
                    methods.funcall_instance_method_with_0_args(template_current_item, (SubLObject)subloop_queues.$sym114$DEQUEUE_NOTIFY);
                }
            }
            subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_resolved_list, template_enumerator);
        }
        if (subloop_queues.NIL != new_contents) {
            subloop_collections.basic_doubly_linked_list_set_contents_method(template_resolved_list, new_contents);
            SubLObject cdolist_list_var = new_contents;
            SubLObject new_item = (SubLObject)subloop_queues.NIL;
            new_item = cdolist_list_var.first();
            while (subloop_queues.NIL != cdolist_list_var) {
                if (subloop_queues.NIL == basic_doubly_linked_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(new_item)) {
                    methods.funcall_instance_method_with_1_args(new_item, (SubLObject)subloop_queues.$sym119$ENQUEUE_NOTIFY, self);
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_item = cdolist_list_var.first();
            }
        }
        return new_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_get_contents_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (subloop_queues.NIL != template_list) {
            return subloop_collections.basic_doubly_linked_list_get_contents_method(template_list);
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_get_element_count_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (subloop_queues.NIL != template_list) {
            return subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list);
        }
        return (SubLObject)subloop_queues.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == subloop_queues.UNPROVIDED) {
            equality_pred = Symbols.symbol_function((SubLObject)subloop_queues.EQL);
        }
        if (key_accessor_function == subloop_queues.UNPROVIDED) {
            key_accessor_function = Symbols.symbol_function((SubLObject)subloop_queues.IDENTITY);
        }
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (subloop_queues.NIL != template_list) {
            final SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(template_list, (SubLObject)subloop_queues.$sym202$ALLOCATE_ENUMERATOR);
            if (subloop_queues.NIL != template_enumerator && subloop_queues.NIL == methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_queues.$sym69$EMPTY_P)) {
                SubLObject template_current_element = methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_queues.$sym203$FIRST);
                if (subloop_queues.NIL != Functions.funcall(equality_pred, key_value, Functions.funcall(key_accessor_function, template_current_element))) {
                    methods.funcall_instance_method_with_1_args(template_list, (SubLObject)subloop_queues.$sym204$DEALLOCATE_ENUMERATOR, template_enumerator);
                    return template_current_element;
                }
                for (template_current_element = methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_queues.$sym205$NEXT); subloop_queues.NIL != template_current_element; template_current_element = methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_queues.$sym205$NEXT)) {
                    if (subloop_queues.NIL != Functions.funcall(equality_pred, key_value, Functions.funcall(key_accessor_function, template_current_element))) {
                        methods.funcall_instance_method_with_1_args(template_list, (SubLObject)subloop_queues.$sym204$DEALLOCATE_ENUMERATOR, template_enumerator);
                        return template_current_element;
                    }
                }
            }
            methods.funcall_instance_method_with_1_args(template_list, (SubLObject)subloop_queues.$sym204$DEALLOCATE_ENUMERATOR, template_enumerator);
            return (SubLObject)subloop_queues.NIL;
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_dequeue_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (subloop_queues.NIL != template_list) {
            final SubLObject template_prioritizer = basic_doubly_linked_queue_get_prioritizer_method(self);
            if (subloop_queues.NIL != template_prioritizer) {
                methods.funcall_instance_method_with_1_args(template_prioritizer, (SubLObject)subloop_queues.$sym8$ORDER_QUEUE, self);
            }
            final SubLObject dequeued_item = subloop_collections.basic_doubly_linked_list_pop_method(template_list);
            if (subloop_queues.NIL == basic_doubly_linked_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(dequeued_item)) {
                methods.funcall_instance_method_with_1_args(dequeued_item, (SubLObject)subloop_queues.$sym114$DEQUEUE_NOTIFY, self);
            }
            return dequeued_item;
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLObject template_resolved_list = basic_doubly_linked_queue_get_list_method(self);
        subloop_collections.basic_doubly_linked_list_remove_method(template_resolved_list, old_element);
        if (subloop_queues.NIL == basic_doubly_linked_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(old_element)) {
            methods.funcall_instance_method_with_1_args(old_element, (SubLObject)subloop_queues.$sym116$REMOVE_NOTIFY, self);
        }
        return old_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject template_resolved_list = basic_doubly_linked_queue_get_list_method(self);
        subloop_collections.basic_doubly_linked_list_add_method(template_resolved_list, new_element);
        if (subloop_queues.NIL == basic_doubly_linked_queue_passive_p_method(self) && subloop_queues.NIL != queue_element_interface_p(new_element)) {
            methods.funcall_instance_method_with_1_args(new_element, (SubLObject)subloop_queues.$sym119$ENQUEUE_NOTIFY, self);
        }
        methods.funcall_instance_method_with_1_args(self, (SubLObject)subloop_queues.$sym62$ON_ENQUEUE, new_element);
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_empty_p_method(final SubLObject self) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        return (SubLObject)SubLObjectFactory.makeBoolean(subloop_queues.NIL == template_list || subloop_queues.NIL != subloop_collections.collection_template_empty_p(template_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == new_prioritizer) {
            basic_doubly_linked_queue_set_prioritizer_internal_method(self, (SubLObject)subloop_queues.NIL);
            return (SubLObject)subloop_queues.NIL;
        }
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_prioritizer_interface_p(new_prioritizer)) {
            Errors.error((SubLObject)subloop_queues.$str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
        }
        basic_doubly_linked_queue_set_prioritizer_internal_method(self, new_prioritizer);
        return new_prioritizer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_get_prioritizer_method(final SubLObject self) {
        return basic_doubly_linked_queue_get_prioritizer_internal_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (subloop_queues.NIL == template_list) {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str214$DL_QUEUE___);
            return self;
        }
        final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
        if (subloop_queues.NIL == template_enumerator) {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str215$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
            return self;
        }
        if (subloop_queues.NIL != methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_queues.$sym69$EMPTY_P)) {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str214$DL_QUEUE___);
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str216$DL_QUEUE___S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_queues.$sym203$FIRST));
            while (subloop_queues.NIL == methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_queues.$sym217$LAST_P)) {
                PrintLow.format(stream, (SubLObject)subloop_queues.$str125$___S, methods.funcall_instance_method_with_0_args(template_enumerator, (SubLObject)subloop_queues.$sym205$NEXT));
            }
            PrintLow.format(stream, (SubLObject)subloop_queues.$str126$_);
        }
        subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_get_list_method(final SubLObject self) {
        SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method(self);
        if (subloop_queues.NIL == basic_doubly_linked_queue_get_list_internal_method(self)) {
            template_list = object.object_new_method((SubLObject)subloop_queues.$sym219$BASIC_DOUBLY_LINKED_LIST);
            basic_doubly_linked_queue_set_list_internal_method(self, template_list);
        }
        return template_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method(final SubLObject self) {
        basic_doubly_linked_queue_set_list_internal_method(self, (SubLObject)subloop_queues.NIL);
        basic_doubly_linked_queue_set_prioritizer_internal_method(self, (SubLObject)subloop_queues.NIL);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym30$INSTANCE_COUNT, (SubLObject)subloop_queues.ZERO_INTEGER);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym32$ISOLATED_P, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym104$IS_PASSIVE, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym33$INSTANCE_NUMBER, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym194$LIST, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym101$PRIORITIZER, (SubLObject)subloop_queues.NIL);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
    public static SubLObject basic_doubly_linked_queue_p(final SubLObject basic_doubly_linked_queue) {
        return classes.subloop_instanceof_class(basic_doubly_linked_queue, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 29885L)
    public static SubLObject basic_doubly_linked_queue_get_list_internal_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject list = get_basic_doubly_linked_queue_list(self);
        try {
            thread.throwStack.push(subloop_queues.$sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, list);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_queue_list(self, list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 29981L)
    public static SubLObject basic_doubly_linked_queue_set_list_internal_method(final SubLObject self, final SubLObject new_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject list = get_basic_doubly_linked_queue_list(self);
        try {
            thread.throwStack.push(subloop_queues.$sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                list = new_list;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_list);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_queue_list(self, list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30113L)
    public static SubLObject basic_doubly_linked_queue_get_prioritizer_internal_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject prioritizer = get_basic_doubly_linked_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, prioritizer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_queue_prioritizer(self, prioritizer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30223L)
    public static SubLObject basic_doubly_linked_queue_set_prioritizer_internal_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject prioritizer = get_basic_doubly_linked_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                prioritizer = new_prioritizer;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_prioritizer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_queue_prioritizer(self, prioritizer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30390L)
    public static SubLObject basic_doubly_linked_queue_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30544L)
    public static SubLObject basic_doubly_linked_queue_passive_p_method(final SubLObject self) {
        final SubLObject is_passive = get_basic_doubly_linked_queue_is_passive(self);
        return is_passive;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30646L)
    public static SubLObject basic_doubly_linked_queue_set_passive_method(final SubLObject self, final SubLObject flag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject is_passive = get_basic_doubly_linked_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                is_passive = flag;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, flag);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_queue_is_passive(self, is_passive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
    public static SubLObject get_asynch_basic_doubly_linked_queue_lock_history(final SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_get_instance_slot(asynch_basic_doubly_linked_queue, (SubLObject)subloop_queues.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
    public static SubLObject set_asynch_basic_doubly_linked_queue_lock_history(final SubLObject asynch_basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_instance_slot(asynch_basic_doubly_linked_queue, value, (SubLObject)subloop_queues.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
    public static SubLObject get_asynch_basic_doubly_linked_queue_lock(final SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_get_access_protected_instance_slot(asynch_basic_doubly_linked_queue, (SubLObject)subloop_queues.THREE_INTEGER, (SubLObject)subloop_queues.$sym247$LOCK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
    public static SubLObject set_asynch_basic_doubly_linked_queue_lock(final SubLObject asynch_basic_doubly_linked_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(asynch_basic_doubly_linked_queue, value, (SubLObject)subloop_queues.THREE_INTEGER, (SubLObject)subloop_queues.$sym247$LOCK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
    public static SubLObject subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym30$INSTANCE_COUNT, (SubLObject)subloop_queues.ZERO_INTEGER);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
    public static SubLObject subloop_reserved_initialize_asynch_basic_doubly_linked_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym32$ISOLATED_P, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym104$IS_PASSIVE, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym33$INSTANCE_NUMBER, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym194$LIST, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym101$PRIORITIZER, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym247$LOCK, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym249$LOCK_HISTORY, (SubLObject)subloop_queues.NIL);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
    public static SubLObject asynch_basic_doubly_linked_queue_p(final SubLObject asynch_basic_doubly_linked_queue) {
        return classes.subloop_instanceof_class(asynch_basic_doubly_linked_queue, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 31385L)
    public static SubLObject asynch_basic_doubly_linked_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_asynch_basic_doubly_linked_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
            try {
                basic_doubly_linked_queue_initialize_method(self);
                lock = Locks.make_lock(PrintLow.format((SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$str253$_S, self));
                lock_history = (SubLObject)subloop_queues.NIL;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
                    set_asynch_basic_doubly_linked_queue_lock(self, lock);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_asynch_basic_doubly_linked_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_asynch_basic_doubly_linked_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 31579L)
    public static SubLObject asynch_basic_doubly_linked_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        SubLObject result = (SubLObject)subloop_queues.NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject release = (SubLObject)subloop_queues.NIL;
        try {
            release = Locks.seize_lock(lock);
            result = basic_doubly_linked_queue_set_prioritizer_method(self, new_prioritizer);
        }
        finally {
            if (subloop_queues.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 31900L)
    public static SubLObject asynch_basic_doubly_linked_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        SubLObject result = (SubLObject)subloop_queues.NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw259$WAITING, (SubLObject)subloop_queues.$kw260$ENQUEUE, new_element), lock_history);
        SubLObject release = (SubLObject)subloop_queues.NIL;
        try {
            release = Locks.seize_lock(lock);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw261$LOCKED, (SubLObject)subloop_queues.$kw260$ENQUEUE, new_element), lock_history);
            result = basic_doubly_linked_queue_enqueue_method(self, new_element);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw262$UNLOCKED, (SubLObject)subloop_queues.$kw260$ENQUEUE, new_element), lock_history);
        }
        finally {
            if (subloop_queues.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 32542L)
    public static SubLObject asynch_basic_doubly_linked_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 32668L)
    public static SubLObject asynch_basic_doubly_linked_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        SubLObject result = (SubLObject)subloop_queues.NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw259$WAITING, (SubLObject)subloop_queues.$kw266$REMOVE, old_element), lock_history);
        SubLObject release = (SubLObject)subloop_queues.NIL;
        try {
            release = Locks.seize_lock(lock);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw261$LOCKED, (SubLObject)subloop_queues.$kw266$REMOVE, old_element), lock_history);
            result = basic_doubly_linked_queue_remove_method(self, old_element);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw262$UNLOCKED, (SubLObject)subloop_queues.$kw266$REMOVE, old_element), lock_history);
            set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        }
        finally {
            if (subloop_queues.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 33378L)
    public static SubLObject asynch_basic_doubly_linked_queue_dequeue_method(final SubLObject self) {
        SubLObject result = (SubLObject)subloop_queues.NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw259$WAITING, (SubLObject)subloop_queues.$kw269$DEQUEUE), lock_history);
        SubLObject release = (SubLObject)subloop_queues.NIL;
        try {
            release = Locks.seize_lock(lock);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw261$LOCKED, (SubLObject)subloop_queues.$kw269$DEQUEUE), lock_history);
            result = basic_doubly_linked_queue_dequeue_method(self);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw262$UNLOCKED, (SubLObject)subloop_queues.$kw269$DEQUEUE, result), lock_history);
        }
        finally {
            if (subloop_queues.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 33958L)
    public static SubLObject asynch_basic_doubly_linked_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        SubLObject result = (SubLObject)subloop_queues.NIL;
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw259$WAITING, (SubLObject)subloop_queues.$kw272$SET_CONTENTS, new_contents), lock_history);
        SubLObject release = (SubLObject)subloop_queues.NIL;
        try {
            release = Locks.seize_lock(lock);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw261$LOCKED, (SubLObject)subloop_queues.$kw272$SET_CONTENTS, new_contents), lock_history);
            result = basic_doubly_linked_queue_set_contents_method(self, new_contents);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw262$UNLOCKED, (SubLObject)subloop_queues.$kw272$SET_CONTENTS, result), lock_history);
        }
        finally {
            if (subloop_queues.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 34613L)
    public static SubLObject asynch_basic_doubly_linked_queue_clear_method(final SubLObject self) {
        final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock(self);
        SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history(self);
        lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw259$WAITING, (SubLObject)subloop_queues.$kw275$CLEAR), lock_history);
        SubLObject release = (SubLObject)subloop_queues.NIL;
        try {
            release = Locks.seize_lock(lock);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw261$LOCKED, (SubLObject)subloop_queues.$kw275$CLEAR), lock_history);
            basic_doubly_linked_queue_clear_method(self);
            lock_history = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)subloop_queues.$kw262$UNLOCKED, (SubLObject)subloop_queues.$kw275$CLEAR), lock_history);
        }
        finally {
            if (subloop_queues.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        set_asynch_basic_doubly_linked_queue_lock_history(self, lock_history);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject get_basic_doubly_linked_ipc_queue_semaphore(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, (SubLObject)subloop_queues.FIVE_INTEGER, (SubLObject)subloop_queues.$sym279$SEMAPHORE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject set_basic_doubly_linked_ipc_queue_semaphore(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, (SubLObject)subloop_queues.FIVE_INTEGER, (SubLObject)subloop_queues.$sym279$SEMAPHORE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject get_basic_doubly_linked_ipc_queue_lock(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, (SubLObject)subloop_queues.FOUR_INTEGER, (SubLObject)subloop_queues.$sym247$LOCK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject set_basic_doubly_linked_ipc_queue_lock(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, (SubLObject)subloop_queues.FOUR_INTEGER, (SubLObject)subloop_queues.$sym247$LOCK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject get_basic_doubly_linked_ipc_queue_semaphore_name(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_doubly_linked_ipc_queue, (SubLObject)subloop_queues.THREE_INTEGER, (SubLObject)subloop_queues.$sym280$SEMAPHORE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject set_basic_doubly_linked_ipc_queue_semaphore_name(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_doubly_linked_ipc_queue, value, (SubLObject)subloop_queues.THREE_INTEGER, (SubLObject)subloop_queues.$sym280$SEMAPHORE_NAME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject get_basic_doubly_linked_ipc_queue_base_suffix_counter(final SubLObject basic_doubly_linked_ipc_queue) {
        final SubLObject v_class = (SubLObject)(basic_doubly_linked_ipc_queue.isSymbol() ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : ((subloop_queues.NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue)) ? basic_doubly_linked_ipc_queue : ((subloop_queues.NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue)) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : subloop_queues.NIL)));
        if (subloop_queues.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)subloop_queues.$sym281$BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)subloop_queues.TWO_INTEGER);
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject set_basic_doubly_linked_ipc_queue_base_suffix_counter(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(basic_doubly_linked_ipc_queue.isSymbol() ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : ((subloop_queues.NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue)) ? basic_doubly_linked_ipc_queue : ((subloop_queues.NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue)) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : subloop_queues.NIL)));
        if (subloop_queues.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)subloop_queues.$sym281$BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)subloop_queues.TWO_INTEGER, value);
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject get_basic_doubly_linked_ipc_queue_base_name(final SubLObject basic_doubly_linked_ipc_queue) {
        final SubLObject v_class = (SubLObject)(basic_doubly_linked_ipc_queue.isSymbol() ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : ((subloop_queues.NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue)) ? basic_doubly_linked_ipc_queue : ((subloop_queues.NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue)) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : subloop_queues.NIL)));
        if (subloop_queues.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)subloop_queues.$sym282$BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)subloop_queues.ONE_INTEGER);
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject set_basic_doubly_linked_ipc_queue_base_name(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(basic_doubly_linked_ipc_queue.isSymbol() ? classes.classes_retrieve_class(basic_doubly_linked_ipc_queue) : ((subloop_queues.NIL != subloop_structures.class_p(basic_doubly_linked_ipc_queue)) ? basic_doubly_linked_ipc_queue : ((subloop_queues.NIL != subloop_structures.instance_p(basic_doubly_linked_ipc_queue)) ? subloop_structures.instance_class(basic_doubly_linked_ipc_queue) : subloop_queues.NIL)));
        if (subloop_queues.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)subloop_queues.$sym282$BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)subloop_queues.ONE_INTEGER, value);
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym30$INSTANCE_COUNT, (SubLObject)subloop_queues.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym282$BASE_NAME, (SubLObject)subloop_queues.$str283$BASIC_DOUBLY_LINKED_IPC_QUEUE);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym281$BASE_SUFFIX_COUNTER, (SubLObject)subloop_queues.ZERO_INTEGER);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym32$ISOLATED_P, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym104$IS_PASSIVE, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym33$INSTANCE_NUMBER, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym194$LIST, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym101$PRIORITIZER, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym280$SEMAPHORE_NAME, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym247$LOCK, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym279$SEMAPHORE, (SubLObject)subloop_queues.NIL);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
    public static SubLObject basic_doubly_linked_ipc_queue_p(final SubLObject basic_doubly_linked_ipc_queue) {
        return classes.subloop_instanceof_class(basic_doubly_linked_ipc_queue, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35863L)
    public static SubLObject basic_doubly_linked_ipc_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject base_suffix_counter = get_basic_doubly_linked_ipc_queue_base_suffix_counter(self);
        final SubLObject base_name = get_basic_doubly_linked_ipc_queue_base_name(self);
        SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        SubLObject semaphore_name = get_basic_doubly_linked_ipc_queue_semaphore_name(self);
        try {
            thread.throwStack.push(subloop_queues.$sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                basic_doubly_linked_queue_initialize_method(self);
                semaphore_name = PrintLow.format((SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$str288$_A__S, base_name, base_suffix_counter);
                base_suffix_counter = Numbers.add(base_suffix_counter, (SubLObject)subloop_queues.ONE_INTEGER);
                lock = Sequences.cconcatenate((SubLObject)subloop_queues.$str289$Lock_for_Queue_, semaphore_name);
                semaphore = Semaphores.new_semaphore(semaphore_name, (SubLObject)subloop_queues.ZERO_INTEGER);
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_base_suffix_counter(self, base_suffix_counter);
                    set_basic_doubly_linked_ipc_queue_base_name(self, base_name);
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    set_basic_doubly_linked_ipc_queue_semaphore_name(self, semaphore_name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 36198L)
    public static SubLObject basic_doubly_linked_ipc_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = (SubLObject)subloop_queues.NIL;
                SubLObject release = (SubLObject)subloop_queues.NIL;
                try {
                    release = Locks.seize_lock(lock);
                    result = basic_doubly_linked_queue_set_prioritizer_method(self, new_prioritizer);
                }
                finally {
                    if (subloop_queues.NIL != release) {
                        Locks.release_lock(lock);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 36425L)
    public static SubLObject basic_doubly_linked_ipc_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = (SubLObject)subloop_queues.NIL;
                semaphores.v_semaphore(semaphore);
                SubLObject release = (SubLObject)subloop_queues.NIL;
                try {
                    release = Locks.seize_lock(lock);
                    result = basic_doubly_linked_queue_enqueue_method(self, new_element);
                }
                finally {
                    if (subloop_queues.NIL != release) {
                        Locks.release_lock(lock);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 36656L)
    public static SubLObject basic_doubly_linked_ipc_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = (SubLObject)subloop_queues.NIL;
                SubLObject release = (SubLObject)subloop_queues.NIL;
                try {
                    release = Locks.seize_lock(lock);
                    result = basic_doubly_linked_queue_remove_method(self, old_element);
                }
                finally {
                    if (subloop_queues.NIL != release) {
                        Locks.release_lock(lock);
                    }
                }
                semaphores.p_semaphore(semaphore);
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 36885L)
    public static SubLObject basic_doubly_linked_ipc_queue_dequeue_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = (SubLObject)subloop_queues.NIL;
                SubLObject release = (SubLObject)subloop_queues.NIL;
                try {
                    release = Locks.seize_lock(lock);
                    result = basic_doubly_linked_queue_dequeue_method(self);
                }
                finally {
                    if (subloop_queues.NIL != release) {
                        Locks.release_lock(lock);
                    }
                }
                semaphores.p_semaphore(semaphore);
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37093L)
    public static SubLObject basic_doubly_linked_ipc_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                SubLObject result = (SubLObject)subloop_queues.NIL;
                SubLObject release = (SubLObject)subloop_queues.NIL;
                try {
                    release = Locks.seize_lock(lock);
                    result = basic_doubly_linked_queue_set_contents_method(self, new_contents);
                }
                finally {
                    if (subloop_queues.NIL != release) {
                        Locks.release_lock(lock);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37308L)
    public static SubLObject basic_doubly_linked_ipc_queue_clear_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore(self);
        final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock(self);
        try {
            thread.throwStack.push(subloop_queues.$sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
            try {
                while (subloop_queues.NIL == basic_doubly_linked_queue_empty_p_method(self)) {
                    semaphores.p_semaphore(semaphore);
                    SubLObject release = (SubLObject)subloop_queues.NIL;
                    try {
                        release = Locks.seize_lock(lock);
                        basic_doubly_linked_ipc_queue_dequeue_method(self);
                    }
                    finally {
                        if (subloop_queues.NIL != release) {
                            Locks.release_lock(lock);
                        }
                    }
                }
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, (SubLObject)subloop_queues.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_doubly_linked_ipc_queue_semaphore(self, semaphore);
                    set_basic_doubly_linked_ipc_queue_lock(self, lock);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_doubly_linked_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject get_basic_ipc_queue_prioritizer(final SubLObject basic_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_ipc_queue, (SubLObject)subloop_queues.TWO_INTEGER, (SubLObject)subloop_queues.$sym101$PRIORITIZER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject set_basic_ipc_queue_prioritizer(final SubLObject basic_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_ipc_queue, value, (SubLObject)subloop_queues.TWO_INTEGER, (SubLObject)subloop_queues.$sym101$PRIORITIZER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject get_basic_ipc_queue_actual_ipc_queue(final SubLObject basic_ipc_queue) {
        return classes.subloop_get_access_protected_instance_slot(basic_ipc_queue, (SubLObject)subloop_queues.ONE_INTEGER, (SubLObject)subloop_queues.$sym311$ACTUAL_IPC_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject set_basic_ipc_queue_actual_ipc_queue(final SubLObject basic_ipc_queue, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(basic_ipc_queue, value, (SubLObject)subloop_queues.ONE_INTEGER, (SubLObject)subloop_queues.$sym311$ACTUAL_IPC_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject get_basic_ipc_queue_is_passive(final SubLObject basic_ipc_queue) {
        final SubLObject v_class = subloop_structures.instance_class(basic_ipc_queue);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_queues.$sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_ipc_queue, slot);
        return classes.ldb_test((SubLObject)subloop_queues.$int105$4097, subloop_structures.instance_boolean_slots(basic_ipc_queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject set_basic_ipc_queue_is_passive(final SubLObject basic_ipc_queue, final SubLObject value) {
        final SubLObject v_class = subloop_structures.instance_class(basic_ipc_queue);
        final SubLObject slot = slots.slot_assoc((SubLObject)subloop_queues.$sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
        instances.instances_access_check_instance_slot(v_class, basic_ipc_queue, slot);
        subloop_structures._csetf_instance_boolean_slots(basic_ipc_queue, bytes.dpb((SubLObject)((subloop_queues.NIL != value) ? subloop_queues.ONE_INTEGER : subloop_queues.ZERO_INTEGER), (SubLObject)subloop_queues.$int105$4097, subloop_structures.instance_boolean_slots(basic_ipc_queue)));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject basic_ipc_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element) {
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject basic_ipc_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLObject template_contents = basic_ipc_queue_get_contents_method(self);
        if (subloop_queues.NIL == template_contents) {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str122$QUEUE___);
        }
        else if (subloop_queues.NIL == template_contents.rest()) {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str123$QUEUE___S_, template_contents.first());
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_queues.$str124$QUEUE___S, template_contents.first());
            SubLObject cdolist_list_var = template_contents.rest();
            SubLObject element = (SubLObject)subloop_queues.NIL;
            element = cdolist_list_var.first();
            while (subloop_queues.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)subloop_queues.$str125$___S, element);
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
            PrintLow.format(stream, (SubLObject)subloop_queues.$str126$_);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject subloop_reserved_initialize_basic_ipc_queue_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym30$INSTANCE_COUNT, (SubLObject)subloop_queues.ZERO_INTEGER);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject subloop_reserved_initialize_basic_ipc_queue_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym32$ISOLATED_P, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym104$IS_PASSIVE, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$sym33$INSTANCE_NUMBER, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym311$ACTUAL_IPC_QUEUE, (SubLObject)subloop_queues.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym101$PRIORITIZER, (SubLObject)subloop_queues.NIL);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
    public static SubLObject basic_ipc_queue_p(final SubLObject basic_ipc_queue) {
        return classes.subloop_instanceof_class(basic_ipc_queue, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 38982L)
    public static SubLObject basic_ipc_queue_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(subloop_queues.$sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                object.object_initialize_method(self);
                actual_ipc_queue = process_utilities.new_ipc_queue(Sequences.cconcatenate((SubLObject)subloop_queues.$str318$BASIC_IPC_QUEUE_, string_utilities.to_string(instance_number)));
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39187L)
    public static SubLObject basic_ipc_queue_get_actual_ipc_queue_method(final SubLObject self) {
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        return actual_ipc_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39296L)
    public static SubLObject basic_ipc_queue_set_actual_ipc_queue_method(final SubLObject self, final SubLObject new_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == process_utilities.ipc_queue_p(new_queue)) {
                    Errors.error((SubLObject)subloop_queues.$str327$_SET_ACTUAL_IPC_QUEUE__S____S_is_, self, new_queue);
                }
                actual_ipc_queue = new_queue;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_queue);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39565L)
    public static SubLObject basic_ipc_queue_get_prioritizer_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject prioritizer = get_basic_ipc_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, prioritizer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_prioritizer(self, prioritizer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39653L)
    public static SubLObject basic_ipc_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject prioritizer = get_basic_ipc_queue_prioritizer(self);
        try {
            thread.throwStack.push(subloop_queues.$sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL != new_prioritizer && subloop_queues.NIL == queue_prioritizer_interface_p(new_prioritizer)) {
                    Errors.error((SubLObject)subloop_queues.$str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                }
                prioritizer = new_prioritizer;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_prioritizer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_prioritizer(self, prioritizer);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39997L)
    public static SubLObject basic_ipc_queue_empty_p_method(final SubLObject self) {
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        return Numbers.zerop(process_utilities.ipc_current_queue_size(actual_ipc_queue));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 40126L)
    public static SubLObject basic_ipc_queue_enqueue_method(final SubLObject self, final SubLObject new_element) {
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        final SubLObject is_passive = get_basic_ipc_queue_is_passive(self);
        process_utilities.ipc_enqueue(new_element, actual_ipc_queue, (SubLObject)subloop_queues.UNPROVIDED);
        if (subloop_queues.NIL == is_passive && subloop_queues.NIL != queue_element_interface_p(new_element)) {
            methods.funcall_instance_method_with_1_args(new_element, (SubLObject)subloop_queues.$sym119$ENQUEUE_NOTIFY, self);
        }
        methods.funcall_instance_method_with_1_args(self, (SubLObject)subloop_queues.$sym62$ON_ENQUEUE, new_element);
        return new_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 40476L)
    public static SubLObject basic_ipc_queue_remove_method(final SubLObject self, final SubLObject old_element) {
        Errors.error((SubLObject)subloop_queues.$str338$Invalid_operation__Cannot_remove_);
        return old_element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 40642L)
    public static SubLObject basic_ipc_queue_dequeue_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        final SubLObject is_passive = get_basic_ipc_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                final SubLObject dequeued_item = process_utilities.ipc_dequeue(actual_ipc_queue, (SubLObject)subloop_queues.UNPROVIDED);
                if (subloop_queues.NIL == is_passive && subloop_queues.NIL != queue_element_interface_p(dequeued_item)) {
                    methods.funcall_instance_method_with_1_args(dequeued_item, (SubLObject)subloop_queues.$sym114$DEQUEUE_NOTIFY, self);
                }
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, dequeued_item);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    set_basic_ipc_queue_is_passive(self, is_passive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 40936L)
    public static SubLObject basic_ipc_queue_get_element_count_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_size(actual_ipc_queue));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41056L)
    public static SubLObject basic_ipc_queue_get_contents_method(final SubLObject self) {
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        return process_utilities.ipc_current_queue_content(actual_ipc_queue);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41185L)
    public static SubLObject basic_ipc_queue_set_contents_method(final SubLObject self, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !new_contents.isList()) {
            Errors.error((SubLObject)subloop_queues.$str349$_SET_CONTENTS__S____S_is_not_a_va, self);
        }
        basic_ipc_queue_clear_method(self);
        SubLObject cdolist_list_var = new_contents;
        SubLObject element = (SubLObject)subloop_queues.NIL;
        element = cdolist_list_var.first();
        while (subloop_queues.NIL != cdolist_list_var) {
            basic_ipc_queue_enqueue_method(self, element);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        return new_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41451L)
    public static SubLObject basic_ipc_queue_clear_method(final SubLObject self) {
        SubLObject element_count;
        SubLObject i;
        for (element_count = basic_ipc_queue_get_element_count_method(self), i = (SubLObject)subloop_queues.NIL, i = (SubLObject)subloop_queues.ZERO_INTEGER; i.numL(element_count); i = Numbers.add(i, (SubLObject)subloop_queues.ONE_INTEGER)) {
            basic_ipc_queue_dequeue_method(self);
        }
        return (SubLObject)subloop_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41638L)
    public static SubLObject basic_ipc_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents) {
        return ordered_contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41748L)
    public static SubLObject basic_ipc_queue_peek_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_content(actual_ipc_queue).first());
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41866L)
    public static SubLObject basic_ipc_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, (SubLObject)((subloop_queues.NIL != Sequences.find(v_object, process_utilities.ipc_current_queue_content(actual_ipc_queue), (SubLObject)subloop_queues.UNPROVIDED, (SubLObject)subloop_queues.UNPROVIDED, (SubLObject)subloop_queues.UNPROVIDED, (SubLObject)subloop_queues.UNPROVIDED)) ? subloop_queues.T : subloop_queues.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42014L)
    public static SubLObject basic_ipc_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == subloop_queues.UNPROVIDED) {
            equality_pred = Symbols.symbol_function((SubLObject)subloop_queues.EQL);
        }
        if (key_accessor_function == subloop_queues.UNPROVIDED) {
            key_accessor_function = Symbols.symbol_function((SubLObject)subloop_queues.IDENTITY);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue(self);
        try {
            thread.throwStack.push(subloop_queues.$sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, Sequences.find(key_value, process_utilities.ipc_current_queue_content(actual_ipc_queue), equality_pred, key_accessor_function, (SubLObject)subloop_queues.UNPROVIDED, (SubLObject)subloop_queues.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_actual_ipc_queue(self, actual_ipc_queue);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42262L)
    public static SubLObject basic_ipc_queue_passive_p_method(final SubLObject self) {
        final SubLObject is_passive = get_basic_ipc_queue_is_passive(self);
        return is_passive;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42354L)
    public static SubLObject basic_ipc_queue_set_passive_method(final SubLObject self, final SubLObject flag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_basic_ipc_queue_method = (SubLObject)subloop_queues.NIL;
        SubLObject is_passive = get_basic_ipc_queue_is_passive(self);
        try {
            thread.throwStack.push(subloop_queues.$sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
            try {
                is_passive = flag;
                Dynamic.sublisp_throw((SubLObject)subloop_queues.$sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, flag);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)subloop_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_basic_ipc_queue_is_passive(self, is_passive);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_basic_ipc_queue_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)subloop_queues.$sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_basic_ipc_queue_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42461L)
    public static SubLObject queue_interface_get_prioritizer(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str367$QUEUE_INTERFACE_GET_PRIORITIZER__, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_prioritizer_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_prioritizer_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_get_prioritizer_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_get_prioritizer_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, (SubLObject)subloop_queues.$sym151$GET_PRIORITIZER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42741L)
    public static SubLObject queue_interface_set_prioritizer(final SubLObject queue_interface, final SubLObject new_prioritizer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str368$QUEUE_INTERFACE_SET_PRIORITIZER__, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_set_prioritizer_method(queue_interface, new_prioritizer);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, (SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, new_prioritizer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 43018L)
    public static SubLObject queue_interface_empty_p(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str369$QUEUE_INTERFACE_EMPTY_P___S_is_no, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_empty_p_method(queue_interface);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_empty_p_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_empty_p_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_empty_p_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_empty_p_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, (SubLObject)subloop_queues.$sym69$EMPTY_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 43264L)
    public static SubLObject queue_interface_enqueue(final SubLObject queue_interface, final SubLObject new_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str370$QUEUE_INTERFACE_ENQUEUE___S_is_no, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_enqueue_method(queue_interface, new_element);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_enqueue_method(queue_interface, new_element);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_enqueue_method(queue_interface, new_element);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_enqueue_method(queue_interface, new_element);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_enqueue_method(queue_interface, new_element);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, (SubLObject)subloop_queues.$sym71$ENQUEUE, new_element);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 43521L)
    public static SubLObject queue_interface_remove(final SubLObject queue_interface, final SubLObject old_element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str371$QUEUE_INTERFACE_REMOVE___S_is_not, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_remove_method(queue_interface, old_element);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_remove_method(queue_interface, old_element);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_remove_method(queue_interface, old_element);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_remove_method(queue_interface, old_element);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_remove_method(queue_interface, old_element);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, (SubLObject)subloop_queues.$sym73$REMOVE, old_element);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 43776L)
    public static SubLObject queue_interface_dequeue(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str372$QUEUE_INTERFACE_DEQUEUE___S_is_no, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_dequeue_method(queue_interface);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_dequeue_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_dequeue_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_dequeue_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_dequeue_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, (SubLObject)subloop_queues.$sym76$DEQUEUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 44022L)
    public static SubLObject queue_interface_get_element_count(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str373$QUEUE_INTERFACE_GET_ELEMENT_COUNT, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_element_count_method(queue_interface);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_element_count_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_element_count_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_get_element_count_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_get_element_count_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, (SubLObject)subloop_queues.$sym81$GET_ELEMENT_COUNT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 44288L)
    public static SubLObject queue_interface_get_contents(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str374$QUEUE_INTERFACE_GET_CONTENTS___S_, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_contents_method(queue_interface);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_contents_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_get_contents_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_get_contents_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_get_contents_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, (SubLObject)subloop_queues.$sym83$GET_CONTENTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 44544L)
    public static SubLObject queue_interface_set_contents(final SubLObject queue_interface, final SubLObject new_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str375$QUEUE_INTERFACE_SET_CONTENTS___S_, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_set_contents_method(queue_interface, new_contents);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_set_contents_method(queue_interface, new_contents);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_set_contents_method(queue_interface, new_contents);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_set_contents_method(queue_interface, new_contents);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_set_contents_method(queue_interface, new_contents);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, (SubLObject)subloop_queues.$sym85$SET_CONTENTS, new_contents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 44812L)
    public static SubLObject queue_interface_clear(final SubLObject queue_interface) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str376$QUEUE_INTERFACE_CLEAR___S_is_not_, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_ipc_queue_clear_method(queue_interface);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return asynch_basic_doubly_linked_queue_clear_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_clear_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_clear_method(queue_interface);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_clear_method(queue_interface);
        }
        return methods.funcall_instance_method_with_0_args(queue_interface, (SubLObject)subloop_queues.$sym88$CLEAR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 45054L)
    public static SubLObject queue_interface_reorder_contents(final SubLObject queue_interface, final SubLObject ordered_contents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && subloop_queues.NIL == queue_interface_p(queue_interface)) {
            Errors.error((SubLObject)subloop_queues.$str377$QUEUE_INTERFACE_REORDER_CONTENTS_, queue_interface);
        }
        if (subloop_queues.NIL != basic_doubly_linked_ipc_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (subloop_queues.NIL != asynch_basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (subloop_queues.NIL != basic_doubly_linked_queue_p(queue_interface)) {
            return basic_doubly_linked_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (subloop_queues.NIL != basic_ipc_queue_p(queue_interface)) {
            return basic_ipc_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        if (subloop_queues.NIL != basic_queue_p(queue_interface)) {
            return basic_queue_reorder_contents_method(queue_interface, ordered_contents);
        }
        return methods.funcall_instance_method_with_1_args(queue_interface, (SubLObject)subloop_queues.$sym90$REORDER_CONTENTS, ordered_contents);
    }
    
    public static SubLObject declare_subloop_queues_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_element_interface_p", "QUEUE-ELEMENT-INTERFACE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_prioritizer_interface_p", "QUEUE-PRIORITIZER-INTERFACE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_prioritizer_template_p", "QUEUE-PRIORITIZER-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_simple_sorter_template_p", "QUEUE-SIMPLE-SORTER-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_queue_simple_sorter_element_key_function", "GET-BASIC-QUEUE-SIMPLE-SORTER-ELEMENT-KEY-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_queue_simple_sorter_element_key_function", "SET-BASIC-QUEUE-SIMPLE-SORTER-ELEMENT-KEY-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_queue_simple_sorter_sort_predicate", "GET-BASIC-QUEUE-SIMPLE-SORTER-SORT-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_queue_simple_sorter_sort_predicate", "SET-BASIC-QUEUE-SIMPLE-SORTER-SORT-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_simple_sorter_order_queue_internal_method", "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-INTERNAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_simple_sorter_order_queue_method", "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_queue_simple_sorter_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_queue_simple_sorter_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_simple_sorter_p", "BASIC-QUEUE-SIMPLE-SORTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_simple_sorter_initialize_method", "BASIC-QUEUE-SIMPLE-SORTER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_simple_sorter_get_sort_predicate_method", "BASIC-QUEUE-SIMPLE-SORTER-GET-SORT-PREDICATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_simple_sorter_set_sort_predicate_method", "BASIC-QUEUE-SIMPLE-SORTER-SET-SORT-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_simple_sorter_get_element_key_method", "BASIC-QUEUE-SIMPLE-SORTER-GET-ELEMENT-KEY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_simple_sorter_set_element_key_method", "BASIC-QUEUE-SIMPLE-SORTER-SET-ELEMENT-KEY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_p", "QUEUE-INTERFACE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "end_pointer_queue_template_p", "END-POINTER-QUEUE-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_queue_prioritizer", "GET-BASIC-QUEUE-PRIORITIZER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_queue_prioritizer", "SET-BASIC-QUEUE-PRIORITIZER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_queue_last_cons", "GET-BASIC-QUEUE-LAST-CONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_queue_last_cons", "SET-BASIC-QUEUE-LAST-CONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_queue_first_cons", "GET-BASIC-QUEUE-FIRST-CONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_queue_first_cons", "SET-BASIC-QUEUE-FIRST-CONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_queue_is_passive", "GET-BASIC-QUEUE-IS-PASSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_queue_is_passive", "SET-BASIC-QUEUE-IS-PASSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_enqueued_p_method", "BASIC-QUEUE-ENQUEUED-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_peek_method", "BASIC-QUEUE-PEEK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_reorder_contents_method", "BASIC-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_clear_method", "BASIC-QUEUE-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_set_contents_method", "BASIC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_get_contents_method", "BASIC-QUEUE-GET-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_get_element_count_method", "BASIC-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_find_method", "BASIC-QUEUE-FIND-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_dequeue_method", "BASIC-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_remove_method", "BASIC-QUEUE-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_on_enqueue_method", "BASIC-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_enqueue_method", "BASIC-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_empty_p_method", "BASIC-QUEUE-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_print_method", "BASIC-QUEUE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_p", "BASIC-QUEUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_initialize_method", "BASIC-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_get_first_cons_method", "BASIC-QUEUE-GET-FIRST-CONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_set_first_cons_method", "BASIC-QUEUE-SET-FIRST-CONS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_get_end_pointer_method", "BASIC-QUEUE-GET-END-POINTER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_set_end_pointer_method", "BASIC-QUEUE-SET-END-POINTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_get_prioritizer_method", "BASIC-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_set_prioritizer_method", "BASIC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_passive_p_method", "BASIC-QUEUE-PASSIVE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_queue_set_passive_method", "BASIC-QUEUE-SET-PASSIVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "doubly_linked_queue_template_p", "DOUBLY-LINKED-QUEUE-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_doubly_linked_queue_prioritizer", "GET-BASIC-DOUBLY-LINKED-QUEUE-PRIORITIZER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_doubly_linked_queue_prioritizer", "SET-BASIC-DOUBLY-LINKED-QUEUE-PRIORITIZER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_doubly_linked_queue_list", "GET-BASIC-DOUBLY-LINKED-QUEUE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_doubly_linked_queue_list", "SET-BASIC-DOUBLY-LINKED-QUEUE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_doubly_linked_queue_is_passive", "GET-BASIC-DOUBLY-LINKED-QUEUE-IS-PASSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_doubly_linked_queue_is_passive", "SET-BASIC-DOUBLY-LINKED-QUEUE-IS-PASSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_enqueued_p_method", "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUED-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_peek_method", "BASIC-DOUBLY-LINKED-QUEUE-PEEK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_reorder_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_clear_method", "BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_set_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_get_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_get_element_count_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_find_method", "BASIC-DOUBLY-LINKED-QUEUE-FIND-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_dequeue_method", "BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_remove_method", "BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_on_enqueue_method", "BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_enqueue_method", "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_empty_p_method", "BASIC-DOUBLY-LINKED-QUEUE-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_set_prioritizer_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_get_prioritizer_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_print_method", "BASIC-DOUBLY-LINKED-QUEUE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_get_list_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method", "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_doubly_linked_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_doubly_linked_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_p", "BASIC-DOUBLY-LINKED-QUEUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_get_list_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-INTERNAL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_set_list_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-LIST-INTERNAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_get_prioritizer_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-INTERNAL-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_set_prioritizer_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-INTERNAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_initialize_method", "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_passive_p_method", "BASIC-DOUBLY-LINKED-QUEUE-PASSIVE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_queue_set_passive_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PASSIVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_asynch_basic_doubly_linked_queue_lock_history", "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_asynch_basic_doubly_linked_queue_lock_history", "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_asynch_basic_doubly_linked_queue_lock", "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_asynch_basic_doubly_linked_queue_lock", "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class", "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_asynch_basic_doubly_linked_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "asynch_basic_doubly_linked_queue_p", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "asynch_basic_doubly_linked_queue_initialize_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "asynch_basic_doubly_linked_queue_set_prioritizer_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "asynch_basic_doubly_linked_queue_enqueue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "asynch_basic_doubly_linked_queue_on_enqueue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "asynch_basic_doubly_linked_queue_remove_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "asynch_basic_doubly_linked_queue_dequeue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "asynch_basic_doubly_linked_queue_set_contents_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "asynch_basic_doubly_linked_queue_clear_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_doubly_linked_ipc_queue_semaphore", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_doubly_linked_ipc_queue_semaphore", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_doubly_linked_ipc_queue_lock", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_doubly_linked_ipc_queue_lock", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_doubly_linked_ipc_queue_semaphore_name", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_doubly_linked_ipc_queue_semaphore_name", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_doubly_linked_ipc_queue_base_suffix_counter", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-SUFFIX-COUNTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_doubly_linked_ipc_queue_base_suffix_counter", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-SUFFIX-COUNTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_doubly_linked_ipc_queue_base_name", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_doubly_linked_ipc_queue_base_name", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_doubly_linked_ipc_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_ipc_queue_p", "BASIC-DOUBLY-LINKED-IPC-QUEUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_ipc_queue_initialize_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_ipc_queue_set_prioritizer_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_ipc_queue_enqueue_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_ipc_queue_remove_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_ipc_queue_dequeue_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_ipc_queue_set_contents_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_doubly_linked_ipc_queue_clear_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_ipc_queue_prioritizer", "GET-BASIC-IPC-QUEUE-PRIORITIZER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_ipc_queue_prioritizer", "SET-BASIC-IPC-QUEUE-PRIORITIZER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_ipc_queue_actual_ipc_queue", "GET-BASIC-IPC-QUEUE-ACTUAL-IPC-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_ipc_queue_actual_ipc_queue", "SET-BASIC-IPC-QUEUE-ACTUAL-IPC-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "get_basic_ipc_queue_is_passive", "GET-BASIC-IPC-QUEUE-IS-PASSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "set_basic_ipc_queue_is_passive", "SET-BASIC-IPC-QUEUE-IS-PASSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_on_enqueue_method", "BASIC-IPC-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_print_method", "BASIC-IPC-QUEUE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_ipc_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "subloop_reserved_initialize_basic_ipc_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_p", "BASIC-IPC-QUEUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_initialize_method", "BASIC-IPC-QUEUE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_get_actual_ipc_queue_method", "BASIC-IPC-QUEUE-GET-ACTUAL-IPC-QUEUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_set_actual_ipc_queue_method", "BASIC-IPC-QUEUE-SET-ACTUAL-IPC-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_get_prioritizer_method", "BASIC-IPC-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_set_prioritizer_method", "BASIC-IPC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_empty_p_method", "BASIC-IPC-QUEUE-EMPTY-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_enqueue_method", "BASIC-IPC-QUEUE-ENQUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_remove_method", "BASIC-IPC-QUEUE-REMOVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_dequeue_method", "BASIC-IPC-QUEUE-DEQUEUE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_get_element_count_method", "BASIC-IPC-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_get_contents_method", "BASIC-IPC-QUEUE-GET-CONTENTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_set_contents_method", "BASIC-IPC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_clear_method", "BASIC-IPC-QUEUE-CLEAR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_reorder_contents_method", "BASIC-IPC-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_peek_method", "BASIC-IPC-QUEUE-PEEK-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_enqueued_p_method", "BASIC-IPC-QUEUE-ENQUEUED-P-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_find_method", "BASIC-IPC-QUEUE-FIND-METHOD", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_passive_p_method", "BASIC-IPC-QUEUE-PASSIVE-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "basic_ipc_queue_set_passive_method", "BASIC-IPC-QUEUE-SET-PASSIVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_get_prioritizer", "QUEUE-INTERFACE-GET-PRIORITIZER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_set_prioritizer", "QUEUE-INTERFACE-SET-PRIORITIZER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_empty_p", "QUEUE-INTERFACE-EMPTY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_enqueue", "QUEUE-INTERFACE-ENQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_remove", "QUEUE-INTERFACE-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_dequeue", "QUEUE-INTERFACE-DEQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_get_element_count", "QUEUE-INTERFACE-GET-ELEMENT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_get_contents", "QUEUE-INTERFACE-GET-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_set_contents", "QUEUE-INTERFACE-SET-CONTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_clear", "QUEUE-INTERFACE-CLEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_queues", "queue_interface_reorder_contents", "QUEUE-INTERFACE-REORDER-CONTENTS", 2, 0, false);
        return (SubLObject)subloop_queues.NIL;
    }
    
    public static SubLObject init_subloop_queues_file() {
        return (SubLObject)subloop_queues.NIL;
    }
    
    public static SubLObject setup_subloop_queues_file() {
        interfaces.new_interface((SubLObject)subloop_queues.$sym0$QUEUE_ELEMENT_INTERFACE, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list1);
        interfaces.new_interface((SubLObject)subloop_queues.$sym2$QUEUE_PRIORITIZER_INTERFACE, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list3);
        interfaces.new_interface((SubLObject)subloop_queues.$sym4$QUEUE_PRIORITIZER_TEMPLATE, (SubLObject)subloop_queues.$list5, (SubLObject)subloop_queues.$list6, (SubLObject)subloop_queues.$list7);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym8$ORDER_QUEUE, (SubLObject)subloop_queues.$sym4$QUEUE_PRIORITIZER_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list10, (SubLObject)subloop_queues.$list11);
        interfaces.new_interface((SubLObject)subloop_queues.$sym12$QUEUE_SIMPLE_SORTER_TEMPLATE, (SubLObject)subloop_queues.$list13, (SubLObject)subloop_queues.$list14, (SubLObject)subloop_queues.$list15);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym16$ORDER_QUEUE_INTERNAL, (SubLObject)subloop_queues.$sym12$QUEUE_SIMPLE_SORTER_TEMPLATE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.$list18, (SubLObject)subloop_queues.$list19);
        classes.subloop_new_class((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$list22, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list23);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym16$ORDER_QUEUE_INTERNAL, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.$list18, (SubLObject)subloop_queues.$list19);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym16$ORDER_QUEUE_INTERNAL, (SubLObject)subloop_queues.$sym27$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym8$ORDER_QUEUE, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list10, (SubLObject)subloop_queues.$list11);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym8$ORDER_QUEUE, (SubLObject)subloop_queues.$sym29$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym31$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym34$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_INSTANCE);
        subloop_reserved_initialize_basic_queue_simple_sorter_class((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list36);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym38$BASIC_QUEUE_SIMPLE_SORTER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym39$GET_SORT_PREDICATE, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list40);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym39$GET_SORT_PREDICATE, (SubLObject)subloop_queues.$sym42$BASIC_QUEUE_SIMPLE_SORTER_GET_SORT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym43$SET_SORT_PREDICATE, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list44, (SubLObject)subloop_queues.$list45);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym43$SET_SORT_PREDICATE, (SubLObject)subloop_queues.$sym47$BASIC_QUEUE_SIMPLE_SORTER_SET_SORT_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym48$GET_ELEMENT_KEY, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list49);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym48$GET_ELEMENT_KEY, (SubLObject)subloop_queues.$sym51$BASIC_QUEUE_SIMPLE_SORTER_GET_ELEMENT_KEY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym52$SET_ELEMENT_KEY, (SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list53, (SubLObject)subloop_queues.$list54);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym20$BASIC_QUEUE_SIMPLE_SORTER, (SubLObject)subloop_queues.$sym52$SET_ELEMENT_KEY, (SubLObject)subloop_queues.$sym56$BASIC_QUEUE_SIMPLE_SORTER_SET_ELEMENT_KEY_METHOD);
        interfaces.new_interface((SubLObject)subloop_queues.$sym57$QUEUE_INTERFACE, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list58);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym59$PRINT, (SubLObject)subloop_queues.$sym57$QUEUE_INTERFACE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list60, (SubLObject)subloop_queues.$list61);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym62$ON_ENQUEUE, (SubLObject)subloop_queues.$sym57$QUEUE_INTERFACE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list64);
        interfaces.new_interface((SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list66, (SubLObject)subloop_queues.$list67, (SubLObject)subloop_queues.$list68);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym69$EMPTY_P, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list70);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list72);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list74, (SubLObject)subloop_queues.$list75);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list77);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym78$FIND, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list79, (SubLObject)subloop_queues.$list80);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym81$GET_ELEMENT_COUNT, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list82);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym83$GET_CONTENTS, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list84);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list86, (SubLObject)subloop_queues.$list87);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list89);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym90$REORDER_CONTENTS, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list91, (SubLObject)subloop_queues.$list92);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym93$PEEK, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list94);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym95$ENQUEUED_P, (SubLObject)subloop_queues.$sym65$END_POINTER_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list96, (SubLObject)subloop_queues.$list97);
        classes.subloop_new_class((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$list99, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list100);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym95$ENQUEUED_P, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list96, (SubLObject)subloop_queues.$list97);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym95$ENQUEUED_P, (SubLObject)subloop_queues.$sym106$BASIC_QUEUE_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym93$PEEK, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list94);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym93$PEEK, (SubLObject)subloop_queues.$sym107$BASIC_QUEUE_PEEK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym90$REORDER_CONTENTS, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list91, (SubLObject)subloop_queues.$list92);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym90$REORDER_CONTENTS, (SubLObject)subloop_queues.$sym108$BASIC_QUEUE_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list89);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym109$BASIC_QUEUE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list86, (SubLObject)subloop_queues.$list87);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym110$BASIC_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym83$GET_CONTENTS, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list84);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym83$GET_CONTENTS, (SubLObject)subloop_queues.$sym111$BASIC_QUEUE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym81$GET_ELEMENT_COUNT, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list82);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym81$GET_ELEMENT_COUNT, (SubLObject)subloop_queues.$sym112$BASIC_QUEUE_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym78$FIND, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list79, (SubLObject)subloop_queues.$list80);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym78$FIND, (SubLObject)subloop_queues.$sym113$BASIC_QUEUE_FIND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list77);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym115$BASIC_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list74, (SubLObject)subloop_queues.$list75);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym117$BASIC_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym62$ON_ENQUEUE, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list64);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym62$ON_ENQUEUE, (SubLObject)subloop_queues.$sym118$BASIC_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list72);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym120$BASIC_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym69$EMPTY_P, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list70);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym69$EMPTY_P, (SubLObject)subloop_queues.$sym121$BASIC_QUEUE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym59$PRINT, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list60, (SubLObject)subloop_queues.$list61);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym59$PRINT, (SubLObject)subloop_queues.$sym127$BASIC_QUEUE_PRINT_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym128$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym129$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_INSTANCE);
        subloop_reserved_initialize_basic_queue_class((SubLObject)subloop_queues.$sym98$BASIC_QUEUE);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list130);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym132$BASIC_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym133$GET_FIRST_CONS, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list134);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym133$GET_FIRST_CONS, (SubLObject)subloop_queues.$sym136$BASIC_QUEUE_GET_FIRST_CONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym137$SET_FIRST_CONS, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.$list138, (SubLObject)subloop_queues.$list139);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym137$SET_FIRST_CONS, (SubLObject)subloop_queues.$sym141$BASIC_QUEUE_SET_FIRST_CONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym142$GET_END_POINTER, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list143);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym142$GET_END_POINTER, (SubLObject)subloop_queues.$sym145$BASIC_QUEUE_GET_END_POINTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym146$SET_END_POINTER, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list147, (SubLObject)subloop_queues.$list148);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym146$SET_END_POINTER, (SubLObject)subloop_queues.$sym150$BASIC_QUEUE_SET_END_POINTER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym151$GET_PRIORITIZER, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list152);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym151$GET_PRIORITIZER, (SubLObject)subloop_queues.$sym154$BASIC_QUEUE_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list156, (SubLObject)subloop_queues.$list157);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym160$BASIC_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym161$PASSIVE_P, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list162, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list163);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym161$PASSIVE_P, (SubLObject)subloop_queues.$sym164$BASIC_QUEUE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym165$SET_PASSIVE, (SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list166, (SubLObject)subloop_queues.$list167);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym98$BASIC_QUEUE, (SubLObject)subloop_queues.$sym165$SET_PASSIVE, (SubLObject)subloop_queues.$sym169$BASIC_QUEUE_SET_PASSIVE_METHOD);
        interfaces.new_interface((SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list66, (SubLObject)subloop_queues.$list67, (SubLObject)subloop_queues.$list171);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym172$INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list173);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym174$GET_LIST, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list175);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym59$PRINT, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list60, (SubLObject)subloop_queues.$list176);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym151$GET_PRIORITIZER, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list177);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list156, (SubLObject)subloop_queues.$list178);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym69$EMPTY_P, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list179);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list180);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list74, (SubLObject)subloop_queues.$list181);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list182);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym78$FIND, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list79, (SubLObject)subloop_queues.$list183);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym81$GET_ELEMENT_COUNT, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list184);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym83$GET_CONTENTS, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list185);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list86, (SubLObject)subloop_queues.$list186);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list187);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym90$REORDER_CONTENTS, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list91, (SubLObject)subloop_queues.$list188);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym93$PEEK, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list189);
        interfaces.interfaces_add_interface_instance_method((SubLObject)subloop_queues.$sym95$ENQUEUED_P, (SubLObject)subloop_queues.$sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list96, (SubLObject)subloop_queues.$list190);
        classes.subloop_new_class((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$list192, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list193);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym95$ENQUEUED_P, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list96, (SubLObject)subloop_queues.$list190);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym95$ENQUEUED_P, (SubLObject)subloop_queues.$sym195$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym93$PEEK, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list189);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym93$PEEK, (SubLObject)subloop_queues.$sym196$BASIC_DOUBLY_LINKED_QUEUE_PEEK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym90$REORDER_CONTENTS, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list91, (SubLObject)subloop_queues.$list188);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym90$REORDER_CONTENTS, (SubLObject)subloop_queues.$sym197$BASIC_DOUBLY_LINKED_QUEUE_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list187);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym198$BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list86, (SubLObject)subloop_queues.$list186);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym199$BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym83$GET_CONTENTS, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list185);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym83$GET_CONTENTS, (SubLObject)subloop_queues.$sym200$BASIC_DOUBLY_LINKED_QUEUE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym81$GET_ELEMENT_COUNT, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list184);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym81$GET_ELEMENT_COUNT, (SubLObject)subloop_queues.$sym201$BASIC_DOUBLY_LINKED_QUEUE_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym78$FIND, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list79, (SubLObject)subloop_queues.$list183);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym78$FIND, (SubLObject)subloop_queues.$sym206$BASIC_DOUBLY_LINKED_QUEUE_FIND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list182);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym207$BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list74, (SubLObject)subloop_queues.$list181);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym208$BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym62$ON_ENQUEUE, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list64);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym62$ON_ENQUEUE, (SubLObject)subloop_queues.$sym209$BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list180);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym210$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym69$EMPTY_P, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list179);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym69$EMPTY_P, (SubLObject)subloop_queues.$sym211$BASIC_DOUBLY_LINKED_QUEUE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list156, (SubLObject)subloop_queues.$list178);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym212$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym151$GET_PRIORITIZER, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list177);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym151$GET_PRIORITIZER, (SubLObject)subloop_queues.$sym213$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym59$PRINT, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list60, (SubLObject)subloop_queues.$list176);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym59$PRINT, (SubLObject)subloop_queues.$sym218$BASIC_DOUBLY_LINKED_QUEUE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym174$GET_LIST, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list175);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym174$GET_LIST, (SubLObject)subloop_queues.$sym220$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym172$INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list173);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym172$INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym221$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_METH);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym222$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym223$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_INSTANCE);
        subloop_reserved_initialize_basic_doubly_linked_queue_class((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym224$GET_LIST_INTERNAL, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list225);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym224$GET_LIST_INTERNAL, (SubLObject)subloop_queues.$sym227$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym228$SET_LIST_INTERNAL, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.$list229, (SubLObject)subloop_queues.$list230);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym228$SET_LIST_INTERNAL, (SubLObject)subloop_queues.$sym232$BASIC_DOUBLY_LINKED_QUEUE_SET_LIST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym233$GET_PRIORITIZER_INTERNAL, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list152);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym233$GET_PRIORITIZER_INTERNAL, (SubLObject)subloop_queues.$sym235$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym236$SET_PRIORITIZER_INTERNAL, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.$list156, (SubLObject)subloop_queues.$list237);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym236$SET_PRIORITIZER_INTERNAL, (SubLObject)subloop_queues.$sym239$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list240);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym241$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym161$PASSIVE_P, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list162, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list163);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym161$PASSIVE_P, (SubLObject)subloop_queues.$sym242$BASIC_DOUBLY_LINKED_QUEUE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym165$SET_PASSIVE, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list166, (SubLObject)subloop_queues.$list167);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym165$SET_PASSIVE, (SubLObject)subloop_queues.$sym244$BASIC_DOUBLY_LINKED_QUEUE_SET_PASSIVE_METHOD);
        classes.subloop_new_class((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list246);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym248$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLAS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym250$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INST);
        subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list251);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym254$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list255, (SubLObject)subloop_queues.$list156, (SubLObject)subloop_queues.$list256);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym257$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list255, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list258);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym263$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym62$ON_ENQUEUE, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list64);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym62$ON_ENQUEUE, (SubLObject)subloop_queues.$sym264$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list255, (SubLObject)subloop_queues.$list74, (SubLObject)subloop_queues.$list265);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym267$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list255, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list268);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym270$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list255, (SubLObject)subloop_queues.$list86, (SubLObject)subloop_queues.$list271);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym273$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$list255, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list274);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym276$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD);
        classes.subloop_new_class((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym191$BASIC_DOUBLY_LINKED_QUEUE, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list278);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym284$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym285$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_INSTANC);
        subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list286);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym290$BASIC_DOUBLY_LINKED_IPC_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list156, (SubLObject)subloop_queues.$list291);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym293$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list294);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym296$BASIC_DOUBLY_LINKED_IPC_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list74, (SubLObject)subloop_queues.$list297);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym299$BASIC_DOUBLY_LINKED_IPC_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list300);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym302$BASIC_DOUBLY_LINKED_IPC_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list86, (SubLObject)subloop_queues.$list303);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym305$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list306);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, (SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym308$BASIC_DOUBLY_LINKED_IPC_QUEUE_CLEAR_METHOD);
        classes.subloop_new_class((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym21$OBJECT, (SubLObject)subloop_queues.$list66, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list310);
        classes.class_set_implements_slot_listeners((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.NIL);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym62$ON_ENQUEUE, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list64);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym62$ON_ENQUEUE, (SubLObject)subloop_queues.$sym312$BASIC_IPC_QUEUE_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym59$PRINT, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list60, (SubLObject)subloop_queues.$list61);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym59$PRINT, (SubLObject)subloop_queues.$sym313$BASIC_IPC_QUEUE_PRINT_METHOD);
        classes.subloop_note_class_initialization_function((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym314$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym315$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_INSTANCE);
        subloop_reserved_initialize_basic_ipc_queue_class((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list17, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list316);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym35$INITIALIZE, (SubLObject)subloop_queues.$sym319$BASIC_IPC_QUEUE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym320$GET_ACTUAL_IPC_QUEUE, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list162, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list321);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym320$GET_ACTUAL_IPC_QUEUE, (SubLObject)subloop_queues.$sym322$BASIC_IPC_QUEUE_GET_ACTUAL_IPC_QUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym323$SET_ACTUAL_IPC_QUEUE, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list324, (SubLObject)subloop_queues.$list325);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym323$SET_ACTUAL_IPC_QUEUE, (SubLObject)subloop_queues.$sym328$BASIC_IPC_QUEUE_SET_ACTUAL_IPC_QUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym151$GET_PRIORITIZER, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list152);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym151$GET_PRIORITIZER, (SubLObject)subloop_queues.$sym330$BASIC_IPC_QUEUE_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list156, (SubLObject)subloop_queues.$list157);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym155$SET_PRIORITIZER, (SubLObject)subloop_queues.$sym332$BASIC_IPC_QUEUE_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym69$EMPTY_P, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list162, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list333);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym69$EMPTY_P, (SubLObject)subloop_queues.$sym334$BASIC_IPC_QUEUE_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list162, (SubLObject)subloop_queues.$list63, (SubLObject)subloop_queues.$list335);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym71$ENQUEUE, (SubLObject)subloop_queues.$sym336$BASIC_IPC_QUEUE_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list74, (SubLObject)subloop_queues.$list337);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym73$REMOVE, (SubLObject)subloop_queues.$sym339$BASIC_IPC_QUEUE_REMOVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list340);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym76$DEQUEUE, (SubLObject)subloop_queues.$sym342$BASIC_IPC_QUEUE_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym81$GET_ELEMENT_COUNT, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list343);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym81$GET_ELEMENT_COUNT, (SubLObject)subloop_queues.$sym345$BASIC_IPC_QUEUE_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym83$GET_CONTENTS, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list162, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list346);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym83$GET_CONTENTS, (SubLObject)subloop_queues.$sym347$BASIC_IPC_QUEUE_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list162, (SubLObject)subloop_queues.$list86, (SubLObject)subloop_queues.$list348);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym85$SET_CONTENTS, (SubLObject)subloop_queues.$sym350$BASIC_IPC_QUEUE_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list162, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list351);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym88$CLEAR, (SubLObject)subloop_queues.$sym352$BASIC_IPC_QUEUE_CLEAR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym90$REORDER_CONTENTS, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list91, (SubLObject)subloop_queues.$list353);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym90$REORDER_CONTENTS, (SubLObject)subloop_queues.$sym354$BASIC_IPC_QUEUE_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym93$PEEK, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list355);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym93$PEEK, (SubLObject)subloop_queues.$sym357$BASIC_IPC_QUEUE_PEEK_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym95$ENQUEUED_P, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list96, (SubLObject)subloop_queues.$list358);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym95$ENQUEUED_P, (SubLObject)subloop_queues.$sym360$BASIC_IPC_QUEUE_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym78$FIND, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list79, (SubLObject)subloop_queues.$list361);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym78$FIND, (SubLObject)subloop_queues.$sym363$BASIC_IPC_QUEUE_FIND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym161$PASSIVE_P, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list162, (SubLObject)subloop_queues.NIL, (SubLObject)subloop_queues.$list163);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym161$PASSIVE_P, (SubLObject)subloop_queues.$sym364$BASIC_IPC_QUEUE_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)subloop_queues.$sym165$SET_PASSIVE, (SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$list9, (SubLObject)subloop_queues.$list166, (SubLObject)subloop_queues.$list167);
        methods.subloop_register_instance_method((SubLObject)subloop_queues.$sym309$BASIC_IPC_QUEUE, (SubLObject)subloop_queues.$sym165$SET_PASSIVE, (SubLObject)subloop_queues.$sym366$BASIC_IPC_QUEUE_SET_PASSIVE_METHOD);
        return (SubLObject)subloop_queues.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_subloop_queues_file();
    }
    
    @Override
	public void initializeVariables() {
        init_subloop_queues_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_subloop_queues_file();
    }
    
    static {
        me = (SubLFile)new subloop_queues();
        $sym0$QUEUE_ELEMENT_INTERFACE = SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE-NOTIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-NOTIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym2$QUEUE_PRIORITIZER_INTERFACE = SubLObjectFactory.makeSymbol("QUEUE-PRIORITIZER-INTERFACE");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER-QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym4$QUEUE_PRIORITIZER_TEMPLATE = SubLObjectFactory.makeSymbol("QUEUE-PRIORITIZER-TEMPLATE");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-PRIORITIZER-INTERFACE"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-PRIORITIZER-INTERFACE")));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER-QUEUE-INTERNAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym8$ORDER_QUEUE = SubLObjectFactory.makeSymbol("ORDER-QUEUE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE"));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)SubLObjectFactory.makeString("(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-INTERFACE-GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-ORDERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDER-QUEUE-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-INTERFACE-REORDER-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS-ORDERED"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $sym12$QUEUE_SIMPLE_SORTER_TEMPLATE = SubLObjectFactory.makeSymbol("QUEUE-SIMPLE-SORTER-TEMPLATE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-PRIORITIZER-TEMPLATE"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-PRIORITIZER-TEMPLATE")));
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SORT-PREDICATE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SORT-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-KEY"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-KEY-FUNCTION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER-QUEUE-INTERNAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym16$ORDER_QUEUE_INTERNAL = SubLObjectFactory.makeSymbol("ORDER-QUEUE-INTERNAL");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"));
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SORT-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-KEY-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREDICATE"), (SubLObject)SubLObjectFactory.makeString("(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer."), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-KEY-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-KEY-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.IDENTITY))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-KEY-FUNCTION")))));
        $sym20$BASIC_QUEUE_SIMPLE_SORTER = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SIMPLE-SORTER");
        $sym21$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-SIMPLE-SORTER-TEMPLATE"));
        $list23 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-KEY-FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SORT-PREDICATE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-SORT-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-KEY"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-KEY-FUNCTION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER-QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER-QUEUE-INTERNAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym24$ELEMENT_KEY_FUNCTION = SubLObjectFactory.makeSymbol("ELEMENT-KEY-FUNCTION");
        $sym25$SORT_PREDICATE = SubLObjectFactory.makeSymbol("SORT-PREDICATE");
        $str26$_ORDER_QUEUE_INTERNAL__S___No_ord = SubLObjectFactory.makeString("(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer.");
        $sym27$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_INTERNAL_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-INTERNAL-METHOD");
        $str28$_ORDER_QUEUE__S____S_is_not_an_in = SubLObjectFactory.makeString("(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE.");
        $sym29$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-METHOD");
        $sym30$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym31$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-CLASS");
        $sym32$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym33$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym34$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-INSTANCE");
        $sym35$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SORT-PREDICATE"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-KEY-FUNCTION"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");
        $sym38$BASIC_QUEUE_SIMPLE_SORTER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-INITIALIZE-METHOD");
        $sym39$GET_SORT_PREDICATE = SubLObjectFactory.makeSymbol("GET-SORT-PREDICATE");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SORT-PREDICATE")));
        $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");
        $sym42$BASIC_QUEUE_SIMPLE_SORTER_GET_SORT_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-GET-SORT-PREDICATE-METHOD");
        $sym43$SET_SORT_PREDICATE = SubLObjectFactory.makeSymbol("SET-SORT-PREDICATE");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE"));
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SORT-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PREDICATE")));
        $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");
        $sym47$BASIC_QUEUE_SIMPLE_SORTER_SET_SORT_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-SET-SORT-PREDICATE-METHOD");
        $sym48$GET_ELEMENT_KEY = SubLObjectFactory.makeSymbol("GET-ELEMENT-KEY");
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-KEY-FUNCTION")));
        $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");
        $sym51$BASIC_QUEUE_SIMPLE_SORTER_GET_ELEMENT_KEY_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-GET-ELEMENT-KEY-METHOD");
        $sym52$SET_ELEMENT_KEY = SubLObjectFactory.makeSymbol("SET-ELEMENT-KEY");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-KEY-FUNCTION"));
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-KEY-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-KEY-FUNCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-KEY-FUNCTION")));
        $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD");
        $sym56$BASIC_QUEUE_SIMPLE_SORTER_SET_ELEMENT_KEY_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SIMPLE-SORTER-SET-ELEMENT-KEY-METHOD");
        $sym57$QUEUE_INTERFACE = SubLObjectFactory.makeSymbol("QUEUE-INTERFACE");
        $list58 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.IDENTITY))), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REORDER-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PEEK"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUED-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PASSIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLAG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym59$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("QUEUE:{}"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("QUEUE:{~S}"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)subloop_queues.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("QUEUE:{~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("<-~S"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("}")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym62$ON_ENQUEUE = SubLObjectFactory.makeSymbol("ON-ENQUEUE");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"));
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $sym65$END_POINTER_QUEUE_TEMPLATE = SubLObjectFactory.makeSymbol("END-POINTER-QUEUE-TEMPLATE");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-INTERFACE"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-INTERFACE")));
        $list68 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-END-POINTER"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.IDENTITY))), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REORDER-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PEEK"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUED-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym69$EMPTY_P = SubLObjectFactory.makeSymbol("EMPTY-P");
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym71$ENQUEUE = SubLObjectFactory.makeSymbol("ENQUEUE");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ENQUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))));
        $sym73$REMOVE = SubLObjectFactory.makeSymbol("REMOVE");
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"));
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_queues.EQ, (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_queues.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)subloop_queues.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-END-POINTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)subloop_queues.EQ, (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CADR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)subloop_queues.EQ, (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CADR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RPLACD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-CONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")))))))));
        $sym76$DEQUEUE = SubLObjectFactory.makeSymbol("DEQUEUE");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESULT")))));
        $sym78$FIND = SubLObjectFactory.makeSymbol("FIND");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.IDENTITY)));
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ITEM")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $sym81$GET_ELEMENT_COUNT = SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT");
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym83$GET_CONTENTS = SubLObjectFactory.makeSymbol("GET-CONTENTS");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym85$SET_CONTENTS = SubLObjectFactory.makeSymbol("SET-CONTENTS");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS"));
        $list87 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS"))));
        $sym88$CLEAR = SubLObjectFactory.makeSymbol("CLEAR");
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $sym90$REORDER_CONTENTS = SubLObjectFactory.makeSymbol("REORDER-CONTENTS");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS"));
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS"))));
        $sym93$PEEK = SubLObjectFactory.makeSymbol("PEEK");
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS")))));
        $sym95$ENQUEUED_P = SubLObjectFactory.makeSymbol("ENQUEUED-P");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL)));
        $sym98$BASIC_QUEUE = SubLObjectFactory.makeSymbol("BASIC-QUEUE");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("END-POINTER-QUEUE-TEMPLATE"));
        $list100 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-CONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-CONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIORITIZER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IS-PASSIVE"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FIRST-CONS"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-FIRST-CONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-END-POINTER"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-END-POINTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PASSIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLAG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.IDENTITY))), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REORDER-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PEEK"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUED-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym101$PRIORITIZER = SubLObjectFactory.makeSymbol("PRIORITIZER");
        $sym102$LAST_CONS = SubLObjectFactory.makeSymbol("LAST-CONS");
        $sym103$FIRST_CONS = SubLObjectFactory.makeSymbol("FIRST-CONS");
        $sym104$IS_PASSIVE = SubLObjectFactory.makeSymbol("IS-PASSIVE");
        $int105$4097 = SubLObjectFactory.makeInteger(4097);
        $sym106$BASIC_QUEUE_ENQUEUED_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-ENQUEUED-P-METHOD");
        $sym107$BASIC_QUEUE_PEEK_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-PEEK-METHOD");
        $sym108$BASIC_QUEUE_REORDER_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-REORDER-CONTENTS-METHOD");
        $sym109$BASIC_QUEUE_CLEAR_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-CLEAR-METHOD");
        $sym110$BASIC_QUEUE_SET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SET-CONTENTS-METHOD");
        $sym111$BASIC_QUEUE_GET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-GET-CONTENTS-METHOD");
        $sym112$BASIC_QUEUE_GET_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-GET-ELEMENT-COUNT-METHOD");
        $sym113$BASIC_QUEUE_FIND_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-FIND-METHOD");
        $sym114$DEQUEUE_NOTIFY = SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY");
        $sym115$BASIC_QUEUE_DEQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-DEQUEUE-METHOD");
        $sym116$REMOVE_NOTIFY = SubLObjectFactory.makeSymbol("REMOVE-NOTIFY");
        $sym117$BASIC_QUEUE_REMOVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-REMOVE-METHOD");
        $sym118$BASIC_QUEUE_ON_ENQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-ON-ENQUEUE-METHOD");
        $sym119$ENQUEUE_NOTIFY = SubLObjectFactory.makeSymbol("ENQUEUE-NOTIFY");
        $sym120$BASIC_QUEUE_ENQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-ENQUEUE-METHOD");
        $sym121$BASIC_QUEUE_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-EMPTY-P-METHOD");
        $str122$QUEUE___ = SubLObjectFactory.makeString("QUEUE:{}");
        $str123$QUEUE___S_ = SubLObjectFactory.makeString("QUEUE:{~S}");
        $str124$QUEUE___S = SubLObjectFactory.makeString("QUEUE:{~S");
        $str125$___S = SubLObjectFactory.makeString("<-~S");
        $str126$_ = SubLObjectFactory.makeString("}");
        $sym127$BASIC_QUEUE_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-PRINT-METHOD");
        $sym128$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-CLASS");
        $sym129$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-INSTANCE");
        $list130 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-CONS"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CONS"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITIZER"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("IS-PASSIVE"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");
        $sym132$BASIC_QUEUE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-INITIALIZE-METHOD");
        $sym133$GET_FIRST_CONS = SubLObjectFactory.makeSymbol("GET-FIRST-CONS");
        $list134 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-CONS")));
        $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");
        $sym136$BASIC_QUEUE_GET_FIRST_CONS_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-GET-FIRST-CONS-METHOD");
        $sym137$SET_FIRST_CONS = SubLObjectFactory.makeSymbol("SET-FIRST-CONS");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONS"));
        $list139 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONS")));
        $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");
        $sym141$BASIC_QUEUE_SET_FIRST_CONS_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SET-FIRST-CONS-METHOD");
        $sym142$GET_END_POINTER = SubLObjectFactory.makeSymbol("GET-END-POINTER");
        $list143 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CONS")));
        $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");
        $sym145$BASIC_QUEUE_GET_END_POINTER_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-GET-END-POINTER-METHOD");
        $sym146$SET_END_POINTER = SubLObjectFactory.makeSymbol("SET-END-POINTER");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER"));
        $list148 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-END-POINTER")));
        $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");
        $sym150$BASIC_QUEUE_SET_END_POINTER_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SET-END-POINTER-METHOD");
        $sym151$GET_PRIORITIZER = SubLObjectFactory.makeSymbol("GET-PRIORITIZER");
        $list152 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITIZER")));
        $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");
        $sym154$BASIC_QUEUE_GET_PRIORITIZER_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-GET-PRIORITIZER-METHOD");
        $sym155$SET_PRIORITIZER = SubLObjectFactory.makeSymbol("SET-PRIORITIZER");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER"));
        $list157 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-PRIORITIZER-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER"))), (SubLObject)SubLObjectFactory.makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITIZER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")));
        $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");
        $str159$_SET_PRIORITIZER__S____S_is_not_a = SubLObjectFactory.makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE.");
        $sym160$BASIC_QUEUE_SET_PRIORITIZER_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SET-PRIORITIZER-METHOD");
        $sym161$PASSIVE_P = SubLObjectFactory.makeSymbol("PASSIVE-P");
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("READ-ONLY"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("IS-PASSIVE")));
        $sym164$BASIC_QUEUE_PASSIVE_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-PASSIVE-P-METHOD");
        $sym165$SET_PASSIVE = SubLObjectFactory.makeSymbol("SET-PASSIVE");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLAG"));
        $list167 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("IS-PASSIVE"), (SubLObject)SubLObjectFactory.makeSymbol("FLAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FLAG")));
        $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-QUEUE-METHOD");
        $sym169$BASIC_QUEUE_SET_PASSIVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-QUEUE-SET-PASSIVE-METHOD");
        $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE = SubLObjectFactory.makeSymbol("DOUBLY-LINKED-QUEUE-TEMPLATE");
        $list171 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LIST-INTERNAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER-INTERNAL"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER-INTERNAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LIST"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.IDENTITY))), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REORDER-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PEEK"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUED-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym172$INITIALIZE_QUA_DOUBLY_LINKED_QUEUE = SubLObjectFactory.makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE");
        $list173 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym174$GET_LIST = SubLObjectFactory.makeSymbol("GET-LIST");
        $list175 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"))));
        $list176 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("DL-QUEUE:{}")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("DL-QUEUE:{}"))), (SubLObject)ConsesLow.list((SubLObject)subloop_queues.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("DL-QUEUE:{~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("<-~S"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("}")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $list177 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-PRIORITIZER-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")));
        $list179 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION-TEMPLATE-EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"))))));
        $list180 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESOLVED-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESOLVED-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ENQUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))));
        $list181 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESOLVED-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESOLVED-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))));
        $list182 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEQUEUED-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POP"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUED-ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUED-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUED-ITEM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $list183 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIRST"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $list184 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.ZERO_INTEGER));
        $list185 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $list186 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESOLVED-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESOLVED-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESOLVED-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-RESOLVED-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")));
        $list187 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-CURRENT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-ENUMERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $list188 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESOLVED-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("RESOLVED-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL)));
        $list189 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST")), (SubLObject)subloop_queues.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)subloop_queues.ZERO_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-ITEM"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $list190 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER-P"), (SubLObject)SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))));
        $sym191$BASIC_DOUBLY_LINKED_QUEUE = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE");
        $list192 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOUBLY-LINKED-QUEUE-TEMPLATE"));
        $list193 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIORITIZER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IS-PASSIVE"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-LIST-INTERNAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER-INTERNAL"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER-INTERNAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PASSIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLAG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LIST"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.IDENTITY))), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REORDER-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PEEK"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUED-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym194$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym195$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUED_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-ENQUEUED-P-METHOD");
        $sym196$BASIC_DOUBLY_LINKED_QUEUE_PEEK_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-PEEK-METHOD");
        $sym197$BASIC_DOUBLY_LINKED_QUEUE_REORDER_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-REORDER-CONTENTS-METHOD");
        $sym198$BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD");
        $sym199$BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD");
        $sym200$BASIC_DOUBLY_LINKED_QUEUE_GET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-CONTENTS-METHOD");
        $sym201$BASIC_DOUBLY_LINKED_QUEUE_GET_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-ELEMENT-COUNT-METHOD");
        $sym202$ALLOCATE_ENUMERATOR = SubLObjectFactory.makeSymbol("ALLOCATE-ENUMERATOR");
        $sym203$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym204$DEALLOCATE_ENUMERATOR = SubLObjectFactory.makeSymbol("DEALLOCATE-ENUMERATOR");
        $sym205$NEXT = SubLObjectFactory.makeSymbol("NEXT");
        $sym206$BASIC_DOUBLY_LINKED_QUEUE_FIND_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-FIND-METHOD");
        $sym207$BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD");
        $sym208$BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD");
        $sym209$BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD");
        $sym210$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD");
        $sym211$BASIC_DOUBLY_LINKED_QUEUE_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-EMPTY-P-METHOD");
        $sym212$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD");
        $sym213$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-METHOD");
        $str214$DL_QUEUE___ = SubLObjectFactory.makeString("DL-QUEUE:{}");
        $str215$___S_Class_is_not_correctly_imple = SubLObjectFactory.makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");
        $str216$DL_QUEUE___S = SubLObjectFactory.makeString("DL-QUEUE:{~S");
        $sym217$LAST_P = SubLObjectFactory.makeSymbol("LAST-P");
        $sym218$BASIC_DOUBLY_LINKED_QUEUE_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-PRINT-METHOD");
        $sym219$BASIC_DOUBLY_LINKED_LIST = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-LIST");
        $sym220$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-METHOD");
        $sym221$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_METH = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD");
        $sym222$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-CLASS");
        $sym223$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE");
        $sym224$GET_LIST_INTERNAL = SubLObjectFactory.makeSymbol("GET-LIST-INTERNAL");
        $list225 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LIST")));
        $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");
        $sym227$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_INTERNAL_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-INTERNAL-METHOD");
        $sym228$SET_LIST_INTERNAL = SubLObjectFactory.makeSymbol("SET-LIST-INTERNAL");
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST"));
        $list230 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-LIST")));
        $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");
        $sym232$BASIC_DOUBLY_LINKED_QUEUE_SET_LIST_INTERNAL_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-LIST-INTERNAL-METHOD");
        $sym233$GET_PRIORITIZER_INTERNAL = SubLObjectFactory.makeSymbol("GET-PRIORITIZER-INTERNAL");
        $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");
        $sym235$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_INTERNAL_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-INTERNAL-METHOD");
        $sym236$SET_PRIORITIZER_INTERNAL = SubLObjectFactory.makeSymbol("SET-PRIORITIZER-INTERNAL");
        $list237 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITIZER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")));
        $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");
        $sym239$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_INTERNAL_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-INTERNAL-METHOD");
        $list240 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym241$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD");
        $sym242$BASIC_DOUBLY_LINKED_QUEUE_PASSIVE_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-PASSIVE-P-METHOD");
        $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD");
        $sym244$BASIC_DOUBLY_LINKED_QUEUE_SET_PASSIVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-SET-PASSIVE-METHOD");
        $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE = SubLObjectFactory.makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE");
        $list246 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym247$LOCK = SubLObjectFactory.makeSymbol("LOCK");
        $sym248$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLAS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLASS");
        $sym249$LOCK_HISTORY = SubLObjectFactory.makeSymbol("LOCK-HISTORY");
        $sym250$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INST = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE");
        $list251 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeString("~S"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-METHOD");
        $str253$_S = SubLObjectFactory.makeString("~S");
        $sym254$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD");
        $list255 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list256 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym257$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD = SubLObjectFactory.makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD");
        $list258 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("WAITING"), (SubLObject)SubLObjectFactory.makeKeyword("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("LOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("UNLOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $kw259$WAITING = SubLObjectFactory.makeKeyword("WAITING");
        $kw260$ENQUEUE = SubLObjectFactory.makeKeyword("ENQUEUE");
        $kw261$LOCKED = SubLObjectFactory.makeKeyword("LOCKED");
        $kw262$UNLOCKED = SubLObjectFactory.makeKeyword("UNLOCKED");
        $sym263$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD = SubLObjectFactory.makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD");
        $sym264$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD = SubLObjectFactory.makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD");
        $list265 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("WAITING"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("LOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("UNLOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $kw266$REMOVE = SubLObjectFactory.makeKeyword("REMOVE");
        $sym267$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD = SubLObjectFactory.makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD");
        $list268 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("WAITING"), (SubLObject)SubLObjectFactory.makeKeyword("DEQUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("LOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("DEQUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("UNLOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $kw269$DEQUEUE = SubLObjectFactory.makeKeyword("DEQUEUE");
        $sym270$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD = SubLObjectFactory.makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD");
        $list271 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("WAITING"), (SubLObject)SubLObjectFactory.makeKeyword("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("LOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("UNLOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $kw272$SET_CONTENTS = SubLObjectFactory.makeKeyword("SET-CONTENTS");
        $sym273$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD");
        $list274 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("WAITING"), (SubLObject)SubLObjectFactory.makeKeyword("CLEAR")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("LOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("CLEAR")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("UNLOCKED"), (SubLObject)SubLObjectFactory.makeKeyword("CLEAR")), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK-HISTORY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL)));
        $kw275$CLEAR = SubLObjectFactory.makeKeyword("CLEAR");
        $sym276$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD = SubLObjectFactory.makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD");
        $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE");
        $list278 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeString("BASIC-DOUBLY-LINKED-IPC-QUEUE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASE-SUFFIX-COUNTER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)subloop_queues.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym279$SEMAPHORE = SubLObjectFactory.makeSymbol("SEMAPHORE");
        $sym280$SEMAPHORE_NAME = SubLObjectFactory.makeSymbol("SEMAPHORE-NAME");
        $sym281$BASE_SUFFIX_COUNTER = SubLObjectFactory.makeSymbol("BASE-SUFFIX-COUNTER");
        $sym282$BASE_NAME = SubLObjectFactory.makeSymbol("BASE-NAME");
        $str283$BASIC_DOUBLY_LINKED_IPC_QUEUE = SubLObjectFactory.makeString("BASIC-DOUBLY-LINKED-IPC-QUEUE");
        $sym284$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-CLASS");
        $sym285$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_INSTANC = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-INSTANCE");
        $list286 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeString("~A-~S"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-SUFFIX-COUNTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("BASE-SUFFIX-COUNTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("Lock for Queue "), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE-NAME"), (SubLObject)subloop_queues.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");
        $str288$_A__S = SubLObjectFactory.makeString("~A-~S");
        $str289$Lock_for_Queue_ = SubLObjectFactory.makeString("Lock for Queue ");
        $sym290$BASIC_DOUBLY_LINKED_IPC_QUEUE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-INITIALIZE-METHOD");
        $list291 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");
        $sym293$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_PRIORITIZER_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-PRIORITIZER-METHOD");
        $list294 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("V-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");
        $sym296$BASIC_DOUBLY_LINKED_IPC_QUEUE_ENQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-ENQUEUE-METHOD");
        $list297 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");
        $sym299$BASIC_DOUBLY_LINKED_IPC_QUEUE_REMOVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-REMOVE-METHOD");
        $list300 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");
        $sym302$BASIC_DOUBLY_LINKED_IPC_QUEUE_DEQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-DEQUEUE-METHOD");
        $list303 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)subloop_queues.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");
        $sym305$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-CONTENTS-METHOD");
        $list306 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-LOCK-HELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD");
        $sym308$BASIC_DOUBLY_LINKED_IPC_QUEUE_CLEAR_METHOD = SubLObjectFactory.makeSymbol("BASIC-DOUBLY-LINKED-IPC-QUEUE-CLEAR-METHOD");
        $sym309$BASIC_IPC_QUEUE = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE");
        $list310 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIORITIZER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IS-PASSIVE"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ACTUAL-IPC-QUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ACTUAL-IPC-QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-QUEUE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRIORITIZER"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PRIORITIZER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRIORITIZER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EMPTY-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENTS"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REORDER-CONTENTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PEEK"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUED-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.EQL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)subloop_queues.IDENTITY))), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PASSIVE-P"), (SubLObject)subloop_queues.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PASSIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLAG")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ENQUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym311$ACTUAL_IPC_QUEUE = SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE");
        $sym312$BASIC_IPC_QUEUE_ON_ENQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-ON-ENQUEUE-METHOD");
        $sym313$BASIC_IPC_QUEUE_PRINT_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-PRINT-METHOD");
        $sym314$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-CLASS");
        $sym315$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-INSTANCE");
        $list316 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-IPC-QUEUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-TO-STRING"), (SubLObject)SubLObjectFactory.makeKeyword("A"), (SubLObject)SubLObjectFactory.makeString("BASIC-IPC-QUEUE-"), (SubLObject)SubLObjectFactory.makeKeyword("D"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $str318$BASIC_IPC_QUEUE_ = SubLObjectFactory.makeString("BASIC-IPC-QUEUE-");
        $sym319$BASIC_IPC_QUEUE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-INITIALIZE-METHOD");
        $sym320$GET_ACTUAL_IPC_QUEUE = SubLObjectFactory.makeSymbol("GET-ACTUAL-IPC-QUEUE");
        $list321 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE")));
        $sym322$BASIC_IPC_QUEUE_GET_ACTUAL_IPC_QUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-GET-ACTUAL-IPC-QUEUE-METHOD");
        $sym323$SET_ACTUAL_IPC_QUEUE = SubLObjectFactory.makeSymbol("SET-ACTUAL-IPC-QUEUE");
        $list324 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-QUEUE"));
        $list325 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-QUEUE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-QUEUE")), (SubLObject)SubLObjectFactory.makeString("(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-QUEUE")));
        $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $str327$_SET_ACTUAL_IPC_QUEUE__S____S_is_ = SubLObjectFactory.makeString("(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct.");
        $sym328$BASIC_IPC_QUEUE_SET_ACTUAL_IPC_QUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-SET-ACTUAL-IPC-QUEUE-METHOD");
        $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $sym330$BASIC_IPC_QUEUE_GET_PRIORITIZER_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-GET-PRIORITIZER-METHOD");
        $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $sym332$BASIC_IPC_QUEUE_SET_PRIORITIZER_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-SET-PRIORITIZER-METHOD");
        $list333 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-CURRENT-QUEUE-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE")))));
        $sym334$BASIC_IPC_QUEUE_EMPTY_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-EMPTY-P-METHOD");
        $list335 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("IS-PASSIVE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ON-ENQUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ELEMENT")));
        $sym336$BASIC_IPC_QUEUE_ENQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-ENQUEUE-METHOD");
        $list337 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Invalid operation: Cannot remove arbitrary item from IPC queue.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-ELEMENT")));
        $str338$Invalid_operation__Cannot_remove_ = SubLObjectFactory.makeString("Invalid operation: Cannot remove arbitrary item from IPC queue.");
        $sym339$BASIC_IPC_QUEUE_REMOVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-REMOVE-METHOD");
        $list340 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEQUEUED-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("IS-PASSIVE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUED-ITEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUED-ITEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE-NOTIFY")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DEQUEUED-ITEM"))));
        $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $sym342$BASIC_IPC_QUEUE_DEQUEUE_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-DEQUEUE-METHOD");
        $list343 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-CURRENT-QUEUE-SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE"))));
        $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $sym345$BASIC_IPC_QUEUE_GET_ELEMENT_COUNT_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-GET-ELEMENT-COUNT-METHOD");
        $list346 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE"))));
        $sym347$BASIC_IPC_QUEUE_GET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-GET-CONTENTS-METHOD");
        $list348 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)SubLObjectFactory.makeString("(SET-CONTENTS ~S): ~S is not a valid list."), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-CONTENTS")));
        $str349$_SET_CONTENTS__S____S_is_not_a_va = SubLObjectFactory.makeString("(SET-CONTENTS ~S): ~S is not a valid list.");
        $sym350$BASIC_IPC_QUEUE_SET_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-SET-CONTENTS-METHOD");
        $list351 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ELEMENT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEQUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)subloop_queues.NIL));
        $sym352$BASIC_IPC_QUEUE_CLEAR_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-CLEAR-METHOD");
        $list353 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ORDERED-CONTENTS")));
        $sym354$BASIC_IPC_QUEUE_REORDER_CONTENTS_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-REORDER-CONTENTS-METHOD");
        $list355 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE")))));
        $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $sym357$BASIC_IPC_QUEUE_PEEK_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-PEEK-METHOD");
        $list358 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE"))), (SubLObject)subloop_queues.T, (SubLObject)subloop_queues.NIL)));
        $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $sym360$BASIC_IPC_QUEUE_ENQUEUED_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-ENQUEUED-P-METHOD");
        $list361 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-CURRENT-QUEUE-CONTENT"), (SubLObject)SubLObjectFactory.makeSymbol("ACTUAL-IPC-QUEUE")), (SubLObject)SubLObjectFactory.makeSymbol("EQUALITY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-ACCESSOR-FUNCTION"))));
        $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $sym363$BASIC_IPC_QUEUE_FIND_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-FIND-METHOD");
        $sym364$BASIC_IPC_QUEUE_PASSIVE_P_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-PASSIVE-P-METHOD");
        $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD");
        $sym366$BASIC_IPC_QUEUE_SET_PASSIVE_METHOD = SubLObjectFactory.makeSymbol("BASIC-IPC-QUEUE-SET-PASSIVE-METHOD");
        $str367$QUEUE_INTERFACE_GET_PRIORITIZER__ = SubLObjectFactory.makeString("QUEUE-INTERFACE-GET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE.");
        $str368$QUEUE_INTERFACE_SET_PRIORITIZER__ = SubLObjectFactory.makeString("QUEUE-INTERFACE-SET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE.");
        $str369$QUEUE_INTERFACE_EMPTY_P___S_is_no = SubLObjectFactory.makeString("QUEUE-INTERFACE-EMPTY-P: ~S is not an instance of QUEUE-INTERFACE.");
        $str370$QUEUE_INTERFACE_ENQUEUE___S_is_no = SubLObjectFactory.makeString("QUEUE-INTERFACE-ENQUEUE: ~S is not an instance of QUEUE-INTERFACE.");
        $str371$QUEUE_INTERFACE_REMOVE___S_is_not = SubLObjectFactory.makeString("QUEUE-INTERFACE-REMOVE: ~S is not an instance of QUEUE-INTERFACE.");
        $str372$QUEUE_INTERFACE_DEQUEUE___S_is_no = SubLObjectFactory.makeString("QUEUE-INTERFACE-DEQUEUE: ~S is not an instance of QUEUE-INTERFACE.");
        $str373$QUEUE_INTERFACE_GET_ELEMENT_COUNT = SubLObjectFactory.makeString("QUEUE-INTERFACE-GET-ELEMENT-COUNT: ~S is not an instance of QUEUE-INTERFACE.");
        $str374$QUEUE_INTERFACE_GET_CONTENTS___S_ = SubLObjectFactory.makeString("QUEUE-INTERFACE-GET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");
        $str375$QUEUE_INTERFACE_SET_CONTENTS___S_ = SubLObjectFactory.makeString("QUEUE-INTERFACE-SET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");
        $str376$QUEUE_INTERFACE_CLEAR___S_is_not_ = SubLObjectFactory.makeString("QUEUE-INTERFACE-CLEAR: ~S is not an instance of QUEUE-INTERFACE.");
        $str377$QUEUE_INTERFACE_REORDER_CONTENTS_ = SubLObjectFactory.makeString("QUEUE-INTERFACE-REORDER-CONTENTS: ~S is not an instance of QUEUE-INTERFACE.");
    }
}

/*

	Total time: 1608 ms
	
*/