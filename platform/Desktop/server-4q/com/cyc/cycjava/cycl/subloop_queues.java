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

public final class subloop_queues
    extends
      SubLTranslatedFile
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
  public static SubLObject queue_element_interface_p(final SubLObject queue_element_interface)
  {
    return interfaces.subloop_instanceof_interface( queue_element_interface, $sym0$QUEUE_ELEMENT_INTERFACE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 1350L)
  public static SubLObject queue_prioritizer_interface_p(final SubLObject queue_prioritizer_interface)
  {
    return interfaces.subloop_instanceof_interface( queue_prioritizer_interface, $sym2$QUEUE_PRIORITIZER_INTERFACE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 1546L)
  public static SubLObject queue_prioritizer_template_p(final SubLObject queue_prioritizer_template)
  {
    return interfaces.subloop_instanceof_interface( queue_prioritizer_template, $sym4$QUEUE_PRIORITIZER_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 2279L)
  public static SubLObject queue_simple_sorter_template_p(final SubLObject queue_simple_sorter_template)
  {
    return interfaces.subloop_instanceof_interface( queue_simple_sorter_template, $sym12$QUEUE_SIMPLE_SORTER_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
  public static SubLObject get_basic_queue_simple_sorter_element_key_function(final SubLObject basic_queue_simple_sorter)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_queue_simple_sorter, TWO_INTEGER, $sym24$ELEMENT_KEY_FUNCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
  public static SubLObject set_basic_queue_simple_sorter_element_key_function(final SubLObject basic_queue_simple_sorter, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_queue_simple_sorter, value, TWO_INTEGER, $sym24$ELEMENT_KEY_FUNCTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
  public static SubLObject get_basic_queue_simple_sorter_sort_predicate(final SubLObject basic_queue_simple_sorter)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_queue_simple_sorter, ONE_INTEGER, $sym25$SORT_PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
  public static SubLObject set_basic_queue_simple_sorter_sort_predicate(final SubLObject basic_queue_simple_sorter, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_queue_simple_sorter, value, ONE_INTEGER, $sym25$SORT_PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
  public static SubLObject basic_queue_simple_sorter_order_queue_internal_method(final SubLObject self, final SubLObject contents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject template_predicate = basic_queue_simple_sorter_get_sort_predicate_method( self );
    SubLObject template_key_function = basic_queue_simple_sorter_get_element_key_method( self );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == template_predicate )
    {
      Errors.error( $str26$_ORDER_QUEUE_INTERNAL__S___No_ord, self );
    }
    if( NIL == template_key_function )
    {
      template_key_function = Symbols.symbol_function( IDENTITY );
    }
    return Sort.sort( contents, template_predicate, template_key_function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
  public static SubLObject basic_queue_simple_sorter_order_queue_method(final SubLObject self, final SubLObject queue)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue ) )
    {
      Errors.error( $str28$_ORDER_QUEUE__S____S_is_not_an_in, self, queue );
    }
    final SubLObject template_contents = queue_interface_get_contents( queue );
    if( NIL != template_contents )
    {
      final SubLObject template_contents_ordered = basic_queue_simple_sorter_order_queue_internal_method( self, template_contents );
      queue_interface_reorder_contents( queue, template_contents_ordered );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
  public static SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym30$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
  public static SubLObject subloop_reserved_initialize_basic_queue_simple_sorter_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym32$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym33$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym25$SORT_PREDICATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym24$ELEMENT_KEY_FUNCTION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 3280L)
  public static SubLObject basic_queue_simple_sorter_p(final SubLObject basic_queue_simple_sorter)
  {
    return classes.subloop_instanceof_class( basic_queue_simple_sorter, $sym20$BASIC_QUEUE_SIMPLE_SORTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4082L)
  public static SubLObject basic_queue_simple_sorter_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
    SubLObject element_key_function = get_basic_queue_simple_sorter_element_key_function( self );
    SubLObject sort_predicate = get_basic_queue_simple_sorter_sort_predicate( self );
    try
    {
      thread.throwStack.push( $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
      try
      {
        object.object_initialize_method( self );
        sort_predicate = NIL;
        element_key_function = NIL;
        Dynamic.sublisp_throw( $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_simple_sorter_element_key_function( self, element_key_function );
          set_basic_queue_simple_sorter_sort_predicate( self, sort_predicate );
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
      catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable( ccatch_env_var, $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_simple_sorter_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4256L)
  public static SubLObject basic_queue_simple_sorter_get_sort_predicate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
    final SubLObject sort_predicate = get_basic_queue_simple_sorter_sort_predicate( self );
    try
    {
      thread.throwStack.push( $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, sort_predicate );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_simple_sorter_sort_predicate( self, sort_predicate );
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
      catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable( ccatch_env_var, $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_simple_sorter_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4360L)
  public static SubLObject basic_queue_simple_sorter_set_sort_predicate_method(final SubLObject self, final SubLObject new_predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
    SubLObject sort_predicate = get_basic_queue_simple_sorter_sort_predicate( self );
    try
    {
      thread.throwStack.push( $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
      try
      {
        sort_predicate = new_predicate;
        Dynamic.sublisp_throw( $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_predicate );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_simple_sorter_sort_predicate( self, sort_predicate );
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
      catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable( ccatch_env_var, $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_simple_sorter_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4515L)
  public static SubLObject basic_queue_simple_sorter_get_element_key_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
    final SubLObject element_key_function = get_basic_queue_simple_sorter_element_key_function( self );
    try
    {
      thread.throwStack.push( $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, element_key_function );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_simple_sorter_element_key_function( self, element_key_function );
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
      catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable( ccatch_env_var, $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_simple_sorter_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4622L)
  public static SubLObject basic_queue_simple_sorter_set_element_key_method(final SubLObject self, final SubLObject new_key_function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_simple_sorter_method = NIL;
    SubLObject element_key_function = get_basic_queue_simple_sorter_element_key_function( self );
    try
    {
      thread.throwStack.push( $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
      try
      {
        element_key_function = new_key_function;
        Dynamic.sublisp_throw( $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD, new_key_function );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_simple_sorter_element_key_function( self, element_key_function );
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
      catch_var_for_basic_queue_simple_sorter_method = Errors.handleThrowable( ccatch_env_var, $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_simple_sorter_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 4789L)
  public static SubLObject queue_interface_p(final SubLObject queue_interface)
  {
    return interfaces.subloop_instanceof_interface( queue_interface, $sym57$QUEUE_INTERFACE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 6561L)
  public static SubLObject end_pointer_queue_template_p(final SubLObject end_pointer_queue_template)
  {
    return interfaces.subloop_instanceof_interface( end_pointer_queue_template, $sym65$END_POINTER_QUEUE_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject get_basic_queue_prioritizer(final SubLObject basic_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_queue, THREE_INTEGER, $sym101$PRIORITIZER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject set_basic_queue_prioritizer(final SubLObject basic_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_queue, value, THREE_INTEGER, $sym101$PRIORITIZER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject get_basic_queue_last_cons(final SubLObject basic_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_queue, TWO_INTEGER, $sym102$LAST_CONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject set_basic_queue_last_cons(final SubLObject basic_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_queue, value, TWO_INTEGER, $sym102$LAST_CONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject get_basic_queue_first_cons(final SubLObject basic_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_queue, ONE_INTEGER, $sym103$FIRST_CONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject set_basic_queue_first_cons(final SubLObject basic_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_queue, value, ONE_INTEGER, $sym103$FIRST_CONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject get_basic_queue_is_passive(final SubLObject basic_queue)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_queue );
    final SubLObject slot = slots.slot_assoc( $sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_queue, slot );
    return classes.ldb_test( $int105$4097, subloop_structures.instance_boolean_slots( basic_queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject set_basic_queue_is_passive(final SubLObject basic_queue, final SubLObject value)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_queue );
    final SubLObject slot = slots.slot_assoc( $sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_queue, slot );
    subloop_structures._csetf_instance_boolean_slots( basic_queue, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, $int105$4097, subloop_structures.instance_boolean_slots( basic_queue ) ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLObject template_contents = basic_queue_get_first_cons_method( self );
    if( NIL != conses_high.member( v_object, template_contents, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_peek_method(final SubLObject self)
  {
    final SubLObject template_contents = basic_queue_get_first_cons_method( self );
    if( NIL == template_contents )
    {
      return NIL;
    }
    return template_contents.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents)
  {
    return basic_queue_set_contents_method( self, ordered_contents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_clear_method(final SubLObject self)
  {
    basic_queue_set_first_cons_method( self, NIL );
    basic_queue_set_end_pointer_method( self, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_set_contents_method(final SubLObject self, final SubLObject new_contents)
  {
    final SubLObject template_contents = conses_high.copy_list( new_contents );
    if( NIL != template_contents )
    {
      basic_queue_set_first_cons_method( self, template_contents );
      basic_queue_set_end_pointer_method( self, conses_high.last( template_contents, UNPROVIDED ) );
    }
    else
    {
      basic_queue_set_first_cons_method( self, NIL );
      basic_queue_set_end_pointer_method( self, NIL );
    }
    return new_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_get_contents_method(final SubLObject self)
  {
    return basic_queue_get_first_cons_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_get_element_count_method(final SubLObject self)
  {
    return Sequences.length( basic_queue_get_first_cons_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function)
  {
    if( equality_pred == UNPROVIDED )
    {
      equality_pred = Symbols.symbol_function( EQL );
    }
    if( key_accessor_function == UNPROVIDED )
    {
      key_accessor_function = Symbols.symbol_function( IDENTITY );
    }
    final SubLObject template_contents = basic_queue_get_first_cons_method( self );
    if( NIL != template_contents )
    {
      final SubLObject template_item = conses_high.member( key_value, template_contents, equality_pred, key_accessor_function );
      if( NIL != template_item )
      {
        return template_item;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_dequeue_method(final SubLObject self)
  {
    final SubLObject template_prioritizer = basic_queue_get_prioritizer_method( self );
    if( NIL != template_prioritizer )
    {
      methods.funcall_instance_method_with_1_args( template_prioritizer, $sym8$ORDER_QUEUE, self );
    }
    final SubLObject template_contents = basic_queue_get_first_cons_method( self );
    if( NIL == template_contents )
    {
      return NIL;
    }
    if( NIL == template_contents.rest() )
    {
      basic_queue_set_first_cons_method( self, NIL );
      basic_queue_set_end_pointer_method( self, NIL );
      final SubLObject template_result = template_contents.first();
      if( NIL == basic_queue_passive_p_method( self ) && NIL != queue_element_interface_p( template_result ) )
      {
        methods.funcall_instance_method_with_1_args( template_result, $sym114$DEQUEUE_NOTIFY, self );
      }
      return template_result;
    }
    basic_queue_set_first_cons_method( self, template_contents.rest() );
    final SubLObject template_result = template_contents.first();
    if( NIL == basic_queue_passive_p_method( self ) && NIL != queue_element_interface_p( template_result ) )
    {
      methods.funcall_instance_method_with_1_args( template_result, $sym114$DEQUEUE_NOTIFY, self );
    }
    return template_result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_remove_method(final SubLObject self, final SubLObject old_element)
  {
    final SubLObject template_contents = basic_queue_get_first_cons_method( self );
    final SubLObject template_end_pointer = basic_queue_get_end_pointer_method( self );
    if( NIL == template_contents )
    {
      return NIL;
    }
    if( old_element.eql( template_contents.first() ) )
    {
      if( template_contents.eql( template_end_pointer ) )
      {
        basic_queue_set_first_cons_method( self, NIL );
        basic_queue_set_end_pointer_method( self, NIL );
        if( NIL == basic_queue_passive_p_method( self ) && NIL != queue_element_interface_p( old_element ) )
        {
          methods.funcall_instance_method_with_1_args( old_element, $sym116$REMOVE_NOTIFY, self );
        }
        return old_element;
      }
      basic_queue_set_first_cons_method( self, template_contents.rest() );
      if( NIL == basic_queue_passive_p_method( self ) && NIL != queue_element_interface_p( old_element ) )
      {
        methods.funcall_instance_method_with_1_args( old_element, $sym116$REMOVE_NOTIFY, self );
      }
      return old_element;
    }
    else
    {
      SubLObject template_current_cons;
      for( template_current_cons = template_contents; !template_current_cons.rest().eql( template_end_pointer ); template_current_cons = template_current_cons.rest() )
      {
        if( old_element.eql( conses_high.cadr( template_current_cons ) ) )
        {
          ConsesLow.rplacd( template_current_cons, conses_high.cddr( template_current_cons ) );
          if( NIL == basic_queue_passive_p_method( self ) && NIL != queue_element_interface_p( old_element ) )
          {
            methods.funcall_instance_method_with_1_args( old_element, $sym116$REMOVE_NOTIFY, self );
          }
          return old_element;
        }
      }
      if( old_element.eql( conses_high.cadr( template_current_cons ) ) )
      {
        ConsesLow.rplacd( template_current_cons, NIL );
        basic_queue_set_end_pointer_method( self, template_current_cons );
        if( NIL == basic_queue_passive_p_method( self ) && NIL != queue_element_interface_p( old_element ) )
        {
          methods.funcall_instance_method_with_1_args( old_element, $sym116$REMOVE_NOTIFY, self );
        }
        return old_element;
      }
      if( NIL == basic_queue_passive_p_method( self ) && NIL != queue_element_interface_p( old_element ) )
      {
        methods.funcall_instance_method_with_1_args( old_element, $sym116$REMOVE_NOTIFY, self );
      }
      return old_element;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_enqueue_method(final SubLObject self, final SubLObject new_element)
  {
    SubLObject template_contents = basic_queue_get_first_cons_method( self );
    SubLObject template_end_pointer = basic_queue_get_end_pointer_method( self );
    if( NIL == template_contents )
    {
      template_contents = ( template_end_pointer = ConsesLow.list( new_element ) );
    }
    else
    {
      ConsesLow.rplacd( template_end_pointer, ConsesLow.list( new_element ) );
      template_end_pointer = template_end_pointer.rest();
    }
    basic_queue_set_first_cons_method( self, template_contents );
    basic_queue_set_end_pointer_method( self, template_end_pointer );
    if( NIL == basic_queue_passive_p_method( self ) && NIL != queue_element_interface_p( new_element ) )
    {
      methods.funcall_instance_method_with_1_args( new_element, $sym119$ENQUEUE_NOTIFY, self );
    }
    methods.funcall_instance_method_with_1_args( self, $sym62$ON_ENQUEUE, new_element );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_empty_p_method(final SubLObject self)
  {
    return Types.sublisp_null( basic_queue_get_first_cons_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject template_contents = basic_queue_get_contents_method( self );
    if( NIL == template_contents )
    {
      PrintLow.format( stream, $str122$QUEUE___ );
    }
    else if( NIL == template_contents.rest() )
    {
      PrintLow.format( stream, $str123$QUEUE___S_, template_contents.first() );
    }
    else
    {
      PrintLow.format( stream, $str124$QUEUE___S, template_contents.first() );
      SubLObject cdolist_list_var = template_contents.rest();
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str125$___S, element );
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
      PrintLow.format( stream, $str126$_ );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject subloop_reserved_initialize_basic_queue_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym30$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject subloop_reserved_initialize_basic_queue_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym32$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym98$BASIC_QUEUE, $sym104$IS_PASSIVE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym33$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym98$BASIC_QUEUE, $sym103$FIRST_CONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym98$BASIC_QUEUE, $sym102$LAST_CONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym98$BASIC_QUEUE, $sym101$PRIORITIZER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 13207L)
  public static SubLObject basic_queue_p(final SubLObject basic_queue)
  {
    return classes.subloop_instanceof_class( basic_queue, $sym98$BASIC_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15147L)
  public static SubLObject basic_queue_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_method = NIL;
    SubLObject prioritizer = get_basic_queue_prioritizer( self );
    SubLObject last_cons = get_basic_queue_last_cons( self );
    SubLObject first_cons = get_basic_queue_first_cons( self );
    SubLObject is_passive = get_basic_queue_is_passive( self );
    try
    {
      thread.throwStack.push( $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
      try
      {
        object.object_initialize_method( self );
        first_cons = NIL;
        last_cons = NIL;
        prioritizer = NIL;
        is_passive = NIL;
        Dynamic.sublisp_throw( $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_prioritizer( self, prioritizer );
          set_basic_queue_last_cons( self, last_cons );
          set_basic_queue_first_cons( self, first_cons );
          set_basic_queue_is_passive( self, is_passive );
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
      catch_var_for_basic_queue_method = Errors.handleThrowable( ccatch_env_var, $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15343L)
  public static SubLObject basic_queue_get_first_cons_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_method = NIL;
    final SubLObject first_cons = get_basic_queue_first_cons( self );
    try
    {
      thread.throwStack.push( $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, first_cons );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_first_cons( self, first_cons );
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
      catch_var_for_basic_queue_method = Errors.handleThrowable( ccatch_env_var, $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15428L)
  public static SubLObject basic_queue_set_first_cons_method(final SubLObject self, final SubLObject new_cons)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_method = NIL;
    SubLObject first_cons = get_basic_queue_first_cons( self );
    try
    {
      thread.throwStack.push( $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
      try
      {
        first_cons = new_cons;
        Dynamic.sublisp_throw( $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_cons );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_first_cons( self, first_cons );
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
      catch_var_for_basic_queue_method = Errors.handleThrowable( ccatch_env_var, $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15549L)
  public static SubLObject basic_queue_get_end_pointer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_method = NIL;
    final SubLObject last_cons = get_basic_queue_last_cons( self );
    try
    {
      thread.throwStack.push( $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, last_cons );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_last_cons( self, last_cons );
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
      catch_var_for_basic_queue_method = Errors.handleThrowable( ccatch_env_var, $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15631L)
  public static SubLObject basic_queue_set_end_pointer_method(final SubLObject self, final SubLObject new_end_pointer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_method = NIL;
    SubLObject last_cons = get_basic_queue_last_cons( self );
    try
    {
      thread.throwStack.push( $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
      try
      {
        last_cons = new_end_pointer;
        Dynamic.sublisp_throw( $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_end_pointer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_last_cons( self, last_cons );
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
      catch_var_for_basic_queue_method = Errors.handleThrowable( ccatch_env_var, $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15770L)
  public static SubLObject basic_queue_get_prioritizer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_method = NIL;
    final SubLObject prioritizer = get_basic_queue_prioritizer( self );
    try
    {
      thread.throwStack.push( $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, prioritizer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_prioritizer( self, prioritizer );
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
      catch_var_for_basic_queue_method = Errors.handleThrowable( ccatch_env_var, $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 15854L)
  public static SubLObject basic_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_method = NIL;
    SubLObject prioritizer = get_basic_queue_prioritizer( self );
    try
    {
      thread.throwStack.push( $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_prioritizer && NIL == queue_prioritizer_interface_p( new_prioritizer ) )
        {
          Errors.error( $str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer );
        }
        prioritizer = new_prioritizer;
        Dynamic.sublisp_throw( $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, new_prioritizer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_prioritizer( self, prioritizer );
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
      catch_var_for_basic_queue_method = Errors.handleThrowable( ccatch_env_var, $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 16194L)
  public static SubLObject basic_queue_passive_p_method(final SubLObject self)
  {
    final SubLObject is_passive = get_basic_queue_is_passive( self );
    return is_passive;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 16282L)
  public static SubLObject basic_queue_set_passive_method(final SubLObject self, final SubLObject flag)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_queue_method = NIL;
    SubLObject is_passive = get_basic_queue_is_passive( self );
    try
    {
      thread.throwStack.push( $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
      try
      {
        is_passive = flag;
        Dynamic.sublisp_throw( $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD, flag );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_queue_is_passive( self, is_passive );
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
      catch_var_for_basic_queue_method = Errors.handleThrowable( ccatch_env_var, $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 16385L)
  public static SubLObject doubly_linked_queue_template_p(final SubLObject doubly_linked_queue_template)
  {
    return interfaces.subloop_instanceof_interface( doubly_linked_queue_template, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject get_basic_doubly_linked_queue_prioritizer(final SubLObject basic_doubly_linked_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_queue, TWO_INTEGER, $sym101$PRIORITIZER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject set_basic_doubly_linked_queue_prioritizer(final SubLObject basic_doubly_linked_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_queue, value, TWO_INTEGER, $sym101$PRIORITIZER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject get_basic_doubly_linked_queue_list(final SubLObject basic_doubly_linked_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_queue, ONE_INTEGER, $sym194$LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject set_basic_doubly_linked_queue_list(final SubLObject basic_doubly_linked_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_queue, value, ONE_INTEGER, $sym194$LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject get_basic_doubly_linked_queue_is_passive(final SubLObject basic_doubly_linked_queue)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_doubly_linked_queue );
    final SubLObject slot = slots.slot_assoc( $sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_doubly_linked_queue, slot );
    return classes.ldb_test( $int105$4097, subloop_structures.instance_boolean_slots( basic_doubly_linked_queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject set_basic_doubly_linked_queue_is_passive(final SubLObject basic_doubly_linked_queue, final SubLObject value)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_doubly_linked_queue );
    final SubLObject slot = slots.slot_assoc( $sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_doubly_linked_queue, slot );
    subloop_structures._csetf_instance_boolean_slots( basic_doubly_linked_queue, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, $int105$4097, subloop_structures.instance_boolean_slots(
        basic_doubly_linked_queue ) ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    if( NIL == template_list )
    {
      return NIL;
    }
    return subloop_collections.basic_doubly_linked_list_member_p_method( template_list, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_peek_method(final SubLObject self)
  {
    final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    if( NIL == template_list )
    {
      return NIL;
    }
    if( !subloop_collections.basic_doubly_linked_list_get_element_count_method( template_list ).numE( ZERO_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject next_item = subloop_collections.basic_doubly_linked_list_nth_method( template_list, ZERO_INTEGER );
    return next_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents)
  {
    final SubLObject resolved_list = basic_doubly_linked_queue_get_list_method( self );
    subloop_collections.basic_doubly_linked_list_set_contents_method( resolved_list, ordered_contents );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_clear_method(final SubLObject self)
  {
    final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    if( NIL != template_list )
    {
      final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method( template_list );
      SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method( template_enumerator );
      if( NIL == basic_doubly_linked_queue_passive_p_method( self ) && NIL != queue_element_interface_p( template_current_item ) )
      {
        methods.funcall_instance_method_with_0_args( template_current_item, $sym114$DEQUEUE_NOTIFY );
      }
      while ( NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method( template_enumerator ))
      {
        template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method( template_enumerator );
        if( NIL == basic_doubly_linked_queue_passive_p_method( self ) && NIL != queue_element_interface_p( template_current_item ) )
        {
          methods.funcall_instance_method_with_0_args( template_current_item, $sym114$DEQUEUE_NOTIFY );
        }
      }
      subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method( template_list, template_enumerator );
      subloop_collections.basic_doubly_linked_list_clear_method( template_list );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_set_contents_method(final SubLObject self, final SubLObject new_contents)
  {
    final SubLObject template_resolved_list = basic_doubly_linked_queue_get_list_method( self );
    final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method( template_resolved_list );
    if( NIL == subloop_collections.basic_doubly_linked_list_enumerator_empty_p_method( template_enumerator ) )
    {
      SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method( template_enumerator );
      if( NIL == basic_doubly_linked_queue_passive_p_method( self ) && NIL != queue_element_interface_p( template_current_item ) )
      {
        methods.funcall_instance_method_with_0_args( template_current_item, $sym114$DEQUEUE_NOTIFY );
      }
      while ( NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method( template_enumerator ))
      {
        template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method( template_enumerator );
        if( NIL == basic_doubly_linked_queue_passive_p_method( self ) && NIL != queue_element_interface_p( template_current_item ) )
        {
          methods.funcall_instance_method_with_0_args( template_current_item, $sym114$DEQUEUE_NOTIFY );
        }
      }
      subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method( template_resolved_list, template_enumerator );
    }
    if( NIL != new_contents )
    {
      subloop_collections.basic_doubly_linked_list_set_contents_method( template_resolved_list, new_contents );
      SubLObject cdolist_list_var = new_contents;
      SubLObject new_item = NIL;
      new_item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == basic_doubly_linked_queue_passive_p_method( self ) && NIL != queue_element_interface_p( new_item ) )
        {
          methods.funcall_instance_method_with_1_args( new_item, $sym119$ENQUEUE_NOTIFY, self );
        }
        cdolist_list_var = cdolist_list_var.rest();
        new_item = cdolist_list_var.first();
      }
    }
    return new_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_get_contents_method(final SubLObject self)
  {
    final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    if( NIL != template_list )
    {
      return subloop_collections.basic_doubly_linked_list_get_contents_method( template_list );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_get_element_count_method(final SubLObject self)
  {
    final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    if( NIL != template_list )
    {
      return subloop_collections.basic_doubly_linked_list_get_element_count_method( template_list );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function)
  {
    if( equality_pred == UNPROVIDED )
    {
      equality_pred = Symbols.symbol_function( EQL );
    }
    if( key_accessor_function == UNPROVIDED )
    {
      key_accessor_function = Symbols.symbol_function( IDENTITY );
    }
    final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    if( NIL != template_list )
    {
      final SubLObject template_enumerator = methods.funcall_instance_method_with_0_args( template_list, $sym202$ALLOCATE_ENUMERATOR );
      if( NIL != template_enumerator && NIL == methods.funcall_instance_method_with_0_args( template_enumerator, $sym69$EMPTY_P ) )
      {
        SubLObject template_current_element = methods.funcall_instance_method_with_0_args( template_enumerator, $sym203$FIRST );
        if( NIL != Functions.funcall( equality_pred, key_value, Functions.funcall( key_accessor_function, template_current_element ) ) )
        {
          methods.funcall_instance_method_with_1_args( template_list, $sym204$DEALLOCATE_ENUMERATOR, template_enumerator );
          return template_current_element;
        }
        for( template_current_element = methods.funcall_instance_method_with_0_args( template_enumerator, $sym205$NEXT ); NIL != template_current_element; template_current_element = methods
            .funcall_instance_method_with_0_args( template_enumerator, $sym205$NEXT ) )
        {
          if( NIL != Functions.funcall( equality_pred, key_value, Functions.funcall( key_accessor_function, template_current_element ) ) )
          {
            methods.funcall_instance_method_with_1_args( template_list, $sym204$DEALLOCATE_ENUMERATOR, template_enumerator );
            return template_current_element;
          }
        }
      }
      methods.funcall_instance_method_with_1_args( template_list, $sym204$DEALLOCATE_ENUMERATOR, template_enumerator );
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_dequeue_method(final SubLObject self)
  {
    final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    if( NIL != template_list )
    {
      final SubLObject template_prioritizer = basic_doubly_linked_queue_get_prioritizer_method( self );
      if( NIL != template_prioritizer )
      {
        methods.funcall_instance_method_with_1_args( template_prioritizer, $sym8$ORDER_QUEUE, self );
      }
      final SubLObject dequeued_item = subloop_collections.basic_doubly_linked_list_pop_method( template_list );
      if( NIL == basic_doubly_linked_queue_passive_p_method( self ) && NIL != queue_element_interface_p( dequeued_item ) )
      {
        methods.funcall_instance_method_with_1_args( dequeued_item, $sym114$DEQUEUE_NOTIFY, self );
      }
      return dequeued_item;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_remove_method(final SubLObject self, final SubLObject old_element)
  {
    final SubLObject template_resolved_list = basic_doubly_linked_queue_get_list_method( self );
    subloop_collections.basic_doubly_linked_list_remove_method( template_resolved_list, old_element );
    if( NIL == basic_doubly_linked_queue_passive_p_method( self ) && NIL != queue_element_interface_p( old_element ) )
    {
      methods.funcall_instance_method_with_1_args( old_element, $sym116$REMOVE_NOTIFY, self );
    }
    return old_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_enqueue_method(final SubLObject self, final SubLObject new_element)
  {
    final SubLObject template_resolved_list = basic_doubly_linked_queue_get_list_method( self );
    subloop_collections.basic_doubly_linked_list_add_method( template_resolved_list, new_element );
    if( NIL == basic_doubly_linked_queue_passive_p_method( self ) && NIL != queue_element_interface_p( new_element ) )
    {
      methods.funcall_instance_method_with_1_args( new_element, $sym119$ENQUEUE_NOTIFY, self );
    }
    methods.funcall_instance_method_with_1_args( self, $sym62$ON_ENQUEUE, new_element );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_empty_p_method(final SubLObject self)
  {
    final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    return makeBoolean( NIL == template_list || NIL != subloop_collections.collection_template_empty_p( template_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == new_prioritizer )
    {
      basic_doubly_linked_queue_set_prioritizer_internal_method( self, NIL );
      return NIL;
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_prioritizer_interface_p( new_prioritizer ) )
    {
      Errors.error( $str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer );
    }
    basic_doubly_linked_queue_set_prioritizer_internal_method( self, new_prioritizer );
    return new_prioritizer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_get_prioritizer_method(final SubLObject self)
  {
    return basic_doubly_linked_queue_get_prioritizer_internal_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    if( NIL == template_list )
    {
      PrintLow.format( stream, $str214$DL_QUEUE___ );
      return self;
    }
    final SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method( template_list );
    if( NIL == template_enumerator )
    {
      PrintLow.format( stream, $str215$___S_Class_is_not_correctly_imple, object.object_class_of_method( self ) );
      return self;
    }
    if( NIL != methods.funcall_instance_method_with_0_args( template_enumerator, $sym69$EMPTY_P ) )
    {
      PrintLow.format( stream, $str214$DL_QUEUE___ );
    }
    else
    {
      PrintLow.format( stream, $str216$DL_QUEUE___S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym203$FIRST ) );
      while ( NIL == methods.funcall_instance_method_with_0_args( template_enumerator, $sym217$LAST_P ))
      {
        PrintLow.format( stream, $str125$___S, methods.funcall_instance_method_with_0_args( template_enumerator, $sym205$NEXT ) );
      }
      PrintLow.format( stream, $str126$_ );
    }
    subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method( template_list, template_enumerator );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_get_list_method(final SubLObject self)
  {
    SubLObject template_list = basic_doubly_linked_queue_get_list_internal_method( self );
    if( NIL == basic_doubly_linked_queue_get_list_internal_method( self ) )
    {
      template_list = object.object_new_method( $sym219$BASIC_DOUBLY_LINKED_LIST );
      basic_doubly_linked_queue_set_list_internal_method( self, template_list );
    }
    return template_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method(final SubLObject self)
  {
    basic_doubly_linked_queue_set_list_internal_method( self, NIL );
    basic_doubly_linked_queue_set_prioritizer_internal_method( self, NIL );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject subloop_reserved_initialize_basic_doubly_linked_queue_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym30$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject subloop_reserved_initialize_basic_doubly_linked_queue_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym32$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym104$IS_PASSIVE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym33$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym194$LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym101$PRIORITIZER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 27700L)
  public static SubLObject basic_doubly_linked_queue_p(final SubLObject basic_doubly_linked_queue)
  {
    return classes.subloop_instanceof_class( basic_doubly_linked_queue, $sym191$BASIC_DOUBLY_LINKED_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 29885L)
  public static SubLObject basic_doubly_linked_queue_get_list_internal_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
    final SubLObject list = get_basic_doubly_linked_queue_list( self );
    try
    {
      thread.throwStack.push( $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, list );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_queue_list( self, list );
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
      catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable( ccatch_env_var, $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 29981L)
  public static SubLObject basic_doubly_linked_queue_set_list_internal_method(final SubLObject self, final SubLObject new_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
    SubLObject list = get_basic_doubly_linked_queue_list( self );
    try
    {
      thread.throwStack.push( $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
      try
      {
        list = new_list;
        Dynamic.sublisp_throw( $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_list );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_queue_list( self, list );
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
      catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable( ccatch_env_var, $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30113L)
  public static SubLObject basic_doubly_linked_queue_get_prioritizer_internal_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
    final SubLObject prioritizer = get_basic_doubly_linked_queue_prioritizer( self );
    try
    {
      thread.throwStack.push( $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, prioritizer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_queue_prioritizer( self, prioritizer );
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
      catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable( ccatch_env_var, $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30223L)
  public static SubLObject basic_doubly_linked_queue_set_prioritizer_internal_method(final SubLObject self, final SubLObject new_prioritizer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
    SubLObject prioritizer = get_basic_doubly_linked_queue_prioritizer( self );
    try
    {
      thread.throwStack.push( $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
      try
      {
        prioritizer = new_prioritizer;
        Dynamic.sublisp_throw( $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, new_prioritizer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_queue_prioritizer( self, prioritizer );
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
      catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable( ccatch_env_var, $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30390L)
  public static SubLObject basic_doubly_linked_queue_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30544L)
  public static SubLObject basic_doubly_linked_queue_passive_p_method(final SubLObject self)
  {
    final SubLObject is_passive = get_basic_doubly_linked_queue_is_passive( self );
    return is_passive;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30646L)
  public static SubLObject basic_doubly_linked_queue_set_passive_method(final SubLObject self, final SubLObject flag)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_queue_method = NIL;
    SubLObject is_passive = get_basic_doubly_linked_queue_is_passive( self );
    try
    {
      thread.throwStack.push( $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
      try
      {
        is_passive = flag;
        Dynamic.sublisp_throw( $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD, flag );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_queue_is_passive( self, is_passive );
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
      catch_var_for_basic_doubly_linked_queue_method = Errors.handleThrowable( ccatch_env_var, $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
  public static SubLObject get_asynch_basic_doubly_linked_queue_lock_history(final SubLObject asynch_basic_doubly_linked_queue)
  {
    return classes.subloop_get_instance_slot( asynch_basic_doubly_linked_queue, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
  public static SubLObject set_asynch_basic_doubly_linked_queue_lock_history(final SubLObject asynch_basic_doubly_linked_queue, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( asynch_basic_doubly_linked_queue, value, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
  public static SubLObject get_asynch_basic_doubly_linked_queue_lock(final SubLObject asynch_basic_doubly_linked_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( asynch_basic_doubly_linked_queue, THREE_INTEGER, $sym247$LOCK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
  public static SubLObject set_asynch_basic_doubly_linked_queue_lock(final SubLObject asynch_basic_doubly_linked_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( asynch_basic_doubly_linked_queue, value, THREE_INTEGER, $sym247$LOCK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
  public static SubLObject subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym30$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
  public static SubLObject subloop_reserved_initialize_asynch_basic_doubly_linked_queue_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym32$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym104$IS_PASSIVE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym33$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym194$LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym101$PRIORITIZER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym247$LOCK, NIL );
    classes.subloop_initialize_slot( new_instance, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym249$LOCK_HISTORY, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 30763L)
  public static SubLObject asynch_basic_doubly_linked_queue_p(final SubLObject asynch_basic_doubly_linked_queue)
  {
    return classes.subloop_instanceof_class( asynch_basic_doubly_linked_queue, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 31385L)
  public static SubLObject asynch_basic_doubly_linked_queue_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_asynch_basic_doubly_linked_queue_method = NIL;
    SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history( self );
    SubLObject lock = get_asynch_basic_doubly_linked_queue_lock( self );
    try
    {
      thread.throwStack.push( $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
      try
      {
        basic_doubly_linked_queue_initialize_method( self );
        lock = Locks.make_lock( PrintLow.format( NIL, $str253$_S, self ) );
        lock_history = NIL;
        Dynamic.sublisp_throw( $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_asynch_basic_doubly_linked_queue_lock_history( self, lock_history );
          set_asynch_basic_doubly_linked_queue_lock( self, lock );
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
      catch_var_for_asynch_basic_doubly_linked_queue_method = Errors.handleThrowable( ccatch_env_var, $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_asynch_basic_doubly_linked_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 31579L)
  public static SubLObject asynch_basic_doubly_linked_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer)
  {
    SubLObject result = NIL;
    final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock( self );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      result = basic_doubly_linked_queue_set_prioritizer_method( self, new_prioritizer );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 31900L)
  public static SubLObject asynch_basic_doubly_linked_queue_enqueue_method(final SubLObject self, final SubLObject new_element)
  {
    SubLObject result = NIL;
    final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock( self );
    SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history( self );
    lock_history = ConsesLow.cons( ConsesLow.list( $kw259$WAITING, $kw260$ENQUEUE, new_element ), lock_history );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw261$LOCKED, $kw260$ENQUEUE, new_element ), lock_history );
      result = basic_doubly_linked_queue_enqueue_method( self, new_element );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw262$UNLOCKED, $kw260$ENQUEUE, new_element ), lock_history );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    set_asynch_basic_doubly_linked_queue_lock_history( self, lock_history );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 32542L)
  public static SubLObject asynch_basic_doubly_linked_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 32668L)
  public static SubLObject asynch_basic_doubly_linked_queue_remove_method(final SubLObject self, final SubLObject old_element)
  {
    SubLObject result = NIL;
    final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock( self );
    SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history( self );
    lock_history = ConsesLow.cons( ConsesLow.list( $kw259$WAITING, $kw266$REMOVE, old_element ), lock_history );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw261$LOCKED, $kw266$REMOVE, old_element ), lock_history );
      result = basic_doubly_linked_queue_remove_method( self, old_element );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw262$UNLOCKED, $kw266$REMOVE, old_element ), lock_history );
      set_asynch_basic_doubly_linked_queue_lock_history( self, lock_history );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    set_asynch_basic_doubly_linked_queue_lock_history( self, lock_history );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 33378L)
  public static SubLObject asynch_basic_doubly_linked_queue_dequeue_method(final SubLObject self)
  {
    SubLObject result = NIL;
    final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock( self );
    SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history( self );
    lock_history = ConsesLow.cons( ConsesLow.list( $kw259$WAITING, $kw269$DEQUEUE ), lock_history );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw261$LOCKED, $kw269$DEQUEUE ), lock_history );
      result = basic_doubly_linked_queue_dequeue_method( self );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw262$UNLOCKED, $kw269$DEQUEUE, result ), lock_history );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    set_asynch_basic_doubly_linked_queue_lock_history( self, lock_history );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 33958L)
  public static SubLObject asynch_basic_doubly_linked_queue_set_contents_method(final SubLObject self, final SubLObject new_contents)
  {
    SubLObject result = NIL;
    final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock( self );
    SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history( self );
    lock_history = ConsesLow.cons( ConsesLow.list( $kw259$WAITING, $kw272$SET_CONTENTS, new_contents ), lock_history );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw261$LOCKED, $kw272$SET_CONTENTS, new_contents ), lock_history );
      result = basic_doubly_linked_queue_set_contents_method( self, new_contents );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw262$UNLOCKED, $kw272$SET_CONTENTS, result ), lock_history );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    set_asynch_basic_doubly_linked_queue_lock_history( self, lock_history );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 34613L)
  public static SubLObject asynch_basic_doubly_linked_queue_clear_method(final SubLObject self)
  {
    final SubLObject lock = get_asynch_basic_doubly_linked_queue_lock( self );
    SubLObject lock_history = get_asynch_basic_doubly_linked_queue_lock_history( self );
    lock_history = ConsesLow.cons( ConsesLow.list( $kw259$WAITING, $kw275$CLEAR ), lock_history );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw261$LOCKED, $kw275$CLEAR ), lock_history );
      basic_doubly_linked_queue_clear_method( self );
      lock_history = ConsesLow.cons( ConsesLow.list( $kw262$UNLOCKED, $kw275$CLEAR ), lock_history );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    set_asynch_basic_doubly_linked_queue_lock_history( self, lock_history );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject get_basic_doubly_linked_ipc_queue_semaphore(final SubLObject basic_doubly_linked_ipc_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_ipc_queue, FIVE_INTEGER, $sym279$SEMAPHORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject set_basic_doubly_linked_ipc_queue_semaphore(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_ipc_queue, value, FIVE_INTEGER, $sym279$SEMAPHORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject get_basic_doubly_linked_ipc_queue_lock(final SubLObject basic_doubly_linked_ipc_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_ipc_queue, FOUR_INTEGER, $sym247$LOCK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject set_basic_doubly_linked_ipc_queue_lock(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_ipc_queue, value, FOUR_INTEGER, $sym247$LOCK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject get_basic_doubly_linked_ipc_queue_semaphore_name(final SubLObject basic_doubly_linked_ipc_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_doubly_linked_ipc_queue, THREE_INTEGER, $sym280$SEMAPHORE_NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject set_basic_doubly_linked_ipc_queue_semaphore_name(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_doubly_linked_ipc_queue, value, THREE_INTEGER, $sym280$SEMAPHORE_NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject get_basic_doubly_linked_ipc_queue_base_suffix_counter(final SubLObject basic_doubly_linked_ipc_queue)
  {
    final SubLObject v_class = basic_doubly_linked_ipc_queue.isSymbol() ? classes.classes_retrieve_class( basic_doubly_linked_ipc_queue )
        : ( ( NIL != subloop_structures.class_p( basic_doubly_linked_ipc_queue ) ) ? basic_doubly_linked_ipc_queue
            : ( ( NIL != subloop_structures.instance_p( basic_doubly_linked_ipc_queue ) ) ? subloop_structures.instance_class( basic_doubly_linked_ipc_queue ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym281$BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject set_basic_doubly_linked_ipc_queue_base_suffix_counter(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value)
  {
    final SubLObject v_class = basic_doubly_linked_ipc_queue.isSymbol() ? classes.classes_retrieve_class( basic_doubly_linked_ipc_queue )
        : ( ( NIL != subloop_structures.class_p( basic_doubly_linked_ipc_queue ) ) ? basic_doubly_linked_ipc_queue
            : ( ( NIL != subloop_structures.instance_p( basic_doubly_linked_ipc_queue ) ) ? subloop_structures.instance_class( basic_doubly_linked_ipc_queue ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym281$BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject get_basic_doubly_linked_ipc_queue_base_name(final SubLObject basic_doubly_linked_ipc_queue)
  {
    final SubLObject v_class = basic_doubly_linked_ipc_queue.isSymbol() ? classes.classes_retrieve_class( basic_doubly_linked_ipc_queue )
        : ( ( NIL != subloop_structures.class_p( basic_doubly_linked_ipc_queue ) ) ? basic_doubly_linked_ipc_queue
            : ( ( NIL != subloop_structures.instance_p( basic_doubly_linked_ipc_queue ) ) ? subloop_structures.instance_class( basic_doubly_linked_ipc_queue ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym282$BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject set_basic_doubly_linked_ipc_queue_base_name(final SubLObject basic_doubly_linked_ipc_queue, final SubLObject value)
  {
    final SubLObject v_class = basic_doubly_linked_ipc_queue.isSymbol() ? classes.classes_retrieve_class( basic_doubly_linked_ipc_queue )
        : ( ( NIL != subloop_structures.class_p( basic_doubly_linked_ipc_queue ) ) ? basic_doubly_linked_ipc_queue
            : ( ( NIL != subloop_structures.instance_p( basic_doubly_linked_ipc_queue ) ) ? subloop_structures.instance_class( basic_doubly_linked_ipc_queue ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym282$BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym30$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym282$BASE_NAME, $str283$BASIC_DOUBLY_LINKED_IPC_QUEUE );
    classes.subloop_initialize_slot( new_instance, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym281$BASE_SUFFIX_COUNTER, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject subloop_reserved_initialize_basic_doubly_linked_ipc_queue_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym32$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym104$IS_PASSIVE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym33$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym194$LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym101$PRIORITIZER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym280$SEMAPHORE_NAME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym247$LOCK, NIL );
    classes.subloop_initialize_slot( new_instance, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym279$SEMAPHORE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35142L)
  public static SubLObject basic_doubly_linked_ipc_queue_p(final SubLObject basic_doubly_linked_ipc_queue)
  {
    return classes.subloop_instanceof_class( basic_doubly_linked_ipc_queue, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 35863L)
  public static SubLObject basic_doubly_linked_ipc_queue_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
    SubLObject base_suffix_counter = get_basic_doubly_linked_ipc_queue_base_suffix_counter( self );
    final SubLObject base_name = get_basic_doubly_linked_ipc_queue_base_name( self );
    SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore( self );
    SubLObject lock = get_basic_doubly_linked_ipc_queue_lock( self );
    SubLObject semaphore_name = get_basic_doubly_linked_ipc_queue_semaphore_name( self );
    try
    {
      thread.throwStack.push( $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
      try
      {
        basic_doubly_linked_queue_initialize_method( self );
        semaphore_name = PrintLow.format( NIL, $str288$_A__S, base_name, base_suffix_counter );
        base_suffix_counter = Numbers.add( base_suffix_counter, ONE_INTEGER );
        lock = Sequences.cconcatenate( $str289$Lock_for_Queue_, semaphore_name );
        semaphore = Semaphores.new_semaphore( semaphore_name, ZERO_INTEGER );
        Dynamic.sublisp_throw( $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_ipc_queue_base_suffix_counter( self, base_suffix_counter );
          set_basic_doubly_linked_ipc_queue_base_name( self, base_name );
          set_basic_doubly_linked_ipc_queue_semaphore( self, semaphore );
          set_basic_doubly_linked_ipc_queue_lock( self, lock );
          set_basic_doubly_linked_ipc_queue_semaphore_name( self, semaphore_name );
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
      catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 36198L)
  public static SubLObject basic_doubly_linked_ipc_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
    final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock( self );
    try
    {
      thread.throwStack.push( $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
      try
      {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( lock );
          result = basic_doubly_linked_queue_set_prioritizer_method( self, new_prioritizer );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( lock );
          }
        }
        Dynamic.sublisp_throw( $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_ipc_queue_lock( self, lock );
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
      catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 36425L)
  public static SubLObject basic_doubly_linked_ipc_queue_enqueue_method(final SubLObject self, final SubLObject new_element)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
    final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore( self );
    final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock( self );
    try
    {
      thread.throwStack.push( $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
      try
      {
        SubLObject result = NIL;
        semaphores.v_semaphore( semaphore );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( lock );
          result = basic_doubly_linked_queue_enqueue_method( self, new_element );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( lock );
          }
        }
        Dynamic.sublisp_throw( $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_ipc_queue_semaphore( self, semaphore );
          set_basic_doubly_linked_ipc_queue_lock( self, lock );
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
      catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 36656L)
  public static SubLObject basic_doubly_linked_ipc_queue_remove_method(final SubLObject self, final SubLObject old_element)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
    final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore( self );
    final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock( self );
    try
    {
      thread.throwStack.push( $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
      try
      {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( lock );
          result = basic_doubly_linked_queue_remove_method( self, old_element );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( lock );
          }
        }
        semaphores.p_semaphore( semaphore );
        Dynamic.sublisp_throw( $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_ipc_queue_semaphore( self, semaphore );
          set_basic_doubly_linked_ipc_queue_lock( self, lock );
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
      catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 36885L)
  public static SubLObject basic_doubly_linked_ipc_queue_dequeue_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
    final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore( self );
    final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock( self );
    try
    {
      thread.throwStack.push( $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
      try
      {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( lock );
          result = basic_doubly_linked_queue_dequeue_method( self );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( lock );
          }
        }
        semaphores.p_semaphore( semaphore );
        Dynamic.sublisp_throw( $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_ipc_queue_semaphore( self, semaphore );
          set_basic_doubly_linked_ipc_queue_lock( self, lock );
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
      catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37093L)
  public static SubLObject basic_doubly_linked_ipc_queue_set_contents_method(final SubLObject self, final SubLObject new_contents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
    final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock( self );
    try
    {
      thread.throwStack.push( $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
      try
      {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( lock );
          result = basic_doubly_linked_queue_set_contents_method( self, new_contents );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( lock );
          }
        }
        Dynamic.sublisp_throw( $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_ipc_queue_lock( self, lock );
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
      catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37308L)
  public static SubLObject basic_doubly_linked_ipc_queue_clear_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_doubly_linked_ipc_queue_method = NIL;
    final SubLObject semaphore = get_basic_doubly_linked_ipc_queue_semaphore( self );
    final SubLObject lock = get_basic_doubly_linked_ipc_queue_lock( self );
    try
    {
      thread.throwStack.push( $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
      try
      {
        while ( NIL == basic_doubly_linked_queue_empty_p_method( self ))
        {
          semaphores.p_semaphore( semaphore );
          SubLObject release = NIL;
          try
          {
            release = Locks.seize_lock( lock );
            basic_doubly_linked_ipc_queue_dequeue_method( self );
          }
          finally
          {
            if( NIL != release )
            {
              Locks.release_lock( lock );
            }
          }
        }
        Dynamic.sublisp_throw( $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_doubly_linked_ipc_queue_semaphore( self, semaphore );
          set_basic_doubly_linked_ipc_queue_lock( self, lock );
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
      catch_var_for_basic_doubly_linked_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_doubly_linked_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject get_basic_ipc_queue_prioritizer(final SubLObject basic_ipc_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_ipc_queue, TWO_INTEGER, $sym101$PRIORITIZER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject set_basic_ipc_queue_prioritizer(final SubLObject basic_ipc_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_ipc_queue, value, TWO_INTEGER, $sym101$PRIORITIZER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject get_basic_ipc_queue_actual_ipc_queue(final SubLObject basic_ipc_queue)
  {
    return classes.subloop_get_access_protected_instance_slot( basic_ipc_queue, ONE_INTEGER, $sym311$ACTUAL_IPC_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject set_basic_ipc_queue_actual_ipc_queue(final SubLObject basic_ipc_queue, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( basic_ipc_queue, value, ONE_INTEGER, $sym311$ACTUAL_IPC_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject get_basic_ipc_queue_is_passive(final SubLObject basic_ipc_queue)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_ipc_queue );
    final SubLObject slot = slots.slot_assoc( $sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_ipc_queue, slot );
    return classes.ldb_test( $int105$4097, subloop_structures.instance_boolean_slots( basic_ipc_queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject set_basic_ipc_queue_is_passive(final SubLObject basic_ipc_queue, final SubLObject value)
  {
    final SubLObject v_class = subloop_structures.instance_class( basic_ipc_queue );
    final SubLObject slot = slots.slot_assoc( $sym104$IS_PASSIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist( v_class ) );
    instances.instances_access_check_instance_slot( v_class, basic_ipc_queue, slot );
    subloop_structures._csetf_instance_boolean_slots( basic_ipc_queue, bytes.dpb( ( NIL != value ) ? ONE_INTEGER : ZERO_INTEGER, $int105$4097, subloop_structures.instance_boolean_slots( basic_ipc_queue ) ) );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject basic_ipc_queue_on_enqueue_method(final SubLObject self, final SubLObject new_element)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject basic_ipc_queue_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject template_contents = basic_ipc_queue_get_contents_method( self );
    if( NIL == template_contents )
    {
      PrintLow.format( stream, $str122$QUEUE___ );
    }
    else if( NIL == template_contents.rest() )
    {
      PrintLow.format( stream, $str123$QUEUE___S_, template_contents.first() );
    }
    else
    {
      PrintLow.format( stream, $str124$QUEUE___S, template_contents.first() );
      SubLObject cdolist_list_var = template_contents.rest();
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str125$___S, element );
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
      PrintLow.format( stream, $str126$_ );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject subloop_reserved_initialize_basic_ipc_queue_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym30$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject subloop_reserved_initialize_basic_ipc_queue_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym32$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym309$BASIC_IPC_QUEUE, $sym104$IS_PASSIVE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym21$OBJECT, $sym33$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym309$BASIC_IPC_QUEUE, $sym311$ACTUAL_IPC_QUEUE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym309$BASIC_IPC_QUEUE, $sym101$PRIORITIZER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 37501L)
  public static SubLObject basic_ipc_queue_p(final SubLObject basic_ipc_queue)
  {
    return classes.subloop_instanceof_class( basic_ipc_queue, $sym309$BASIC_IPC_QUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 38982L)
  public static SubLObject basic_ipc_queue_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        object.object_initialize_method( self );
        actual_ipc_queue = process_utilities.new_ipc_queue( Sequences.cconcatenate( $str318$BASIC_IPC_QUEUE_, string_utilities.to_string( instance_number ) ) );
        Dynamic.sublisp_throw( $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_actual_ipc_queue( self, actual_ipc_queue );
          object.set_object_instance_number( self, instance_number );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39187L)
  public static SubLObject basic_ipc_queue_get_actual_ipc_queue_method(final SubLObject self)
  {
    final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    return actual_ipc_queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39296L)
  public static SubLObject basic_ipc_queue_set_actual_ipc_queue_method(final SubLObject self, final SubLObject new_queue)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    try
    {
      thread.throwStack.push( $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == process_utilities.ipc_queue_p( new_queue ) )
        {
          Errors.error( $str327$_SET_ACTUAL_IPC_QUEUE__S____S_is_, self, new_queue );
        }
        actual_ipc_queue = new_queue;
        Dynamic.sublisp_throw( $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_queue );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_actual_ipc_queue( self, actual_ipc_queue );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39565L)
  public static SubLObject basic_ipc_queue_get_prioritizer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    final SubLObject prioritizer = get_basic_ipc_queue_prioritizer( self );
    try
    {
      thread.throwStack.push( $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, prioritizer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_prioritizer( self, prioritizer );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39653L)
  public static SubLObject basic_ipc_queue_set_prioritizer_method(final SubLObject self, final SubLObject new_prioritizer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    SubLObject prioritizer = get_basic_ipc_queue_prioritizer( self );
    try
    {
      thread.throwStack.push( $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != new_prioritizer && NIL == queue_prioritizer_interface_p( new_prioritizer ) )
        {
          Errors.error( $str159$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer );
        }
        prioritizer = new_prioritizer;
        Dynamic.sublisp_throw( $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, new_prioritizer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_prioritizer( self, prioritizer );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 39997L)
  public static SubLObject basic_ipc_queue_empty_p_method(final SubLObject self)
  {
    final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    return Numbers.zerop( process_utilities.ipc_current_queue_size( actual_ipc_queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 40126L)
  public static SubLObject basic_ipc_queue_enqueue_method(final SubLObject self, final SubLObject new_element)
  {
    final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    final SubLObject is_passive = get_basic_ipc_queue_is_passive( self );
    process_utilities.ipc_enqueue( new_element, actual_ipc_queue, UNPROVIDED );
    if( NIL == is_passive && NIL != queue_element_interface_p( new_element ) )
    {
      methods.funcall_instance_method_with_1_args( new_element, $sym119$ENQUEUE_NOTIFY, self );
    }
    methods.funcall_instance_method_with_1_args( self, $sym62$ON_ENQUEUE, new_element );
    return new_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 40476L)
  public static SubLObject basic_ipc_queue_remove_method(final SubLObject self, final SubLObject old_element)
  {
    Errors.error( $str338$Invalid_operation__Cannot_remove_ );
    return old_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 40642L)
  public static SubLObject basic_ipc_queue_dequeue_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    final SubLObject is_passive = get_basic_ipc_queue_is_passive( self );
    try
    {
      thread.throwStack.push( $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        final SubLObject dequeued_item = process_utilities.ipc_dequeue( actual_ipc_queue, UNPROVIDED );
        if( NIL == is_passive && NIL != queue_element_interface_p( dequeued_item ) )
        {
          methods.funcall_instance_method_with_1_args( dequeued_item, $sym114$DEQUEUE_NOTIFY, self );
        }
        Dynamic.sublisp_throw( $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, dequeued_item );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_actual_ipc_queue( self, actual_ipc_queue );
          set_basic_ipc_queue_is_passive( self, is_passive );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 40936L)
  public static SubLObject basic_ipc_queue_get_element_count_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    try
    {
      thread.throwStack.push( $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_size( actual_ipc_queue ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_actual_ipc_queue( self, actual_ipc_queue );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41056L)
  public static SubLObject basic_ipc_queue_get_contents_method(final SubLObject self)
  {
    final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    return process_utilities.ipc_current_queue_content( actual_ipc_queue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41185L)
  public static SubLObject basic_ipc_queue_set_contents_method(final SubLObject self, final SubLObject new_contents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !new_contents.isList() )
    {
      Errors.error( $str349$_SET_CONTENTS__S____S_is_not_a_va, self );
    }
    basic_ipc_queue_clear_method( self );
    SubLObject cdolist_list_var = new_contents;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      basic_ipc_queue_enqueue_method( self, element );
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return new_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41451L)
  public static SubLObject basic_ipc_queue_clear_method(final SubLObject self)
  {
    SubLObject element_count;
    SubLObject i;
    for( element_count = basic_ipc_queue_get_element_count_method( self ), i = NIL, i = ZERO_INTEGER; i.numL( element_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      basic_ipc_queue_dequeue_method( self );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41638L)
  public static SubLObject basic_ipc_queue_reorder_contents_method(final SubLObject self, final SubLObject ordered_contents)
  {
    return ordered_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41748L)
  public static SubLObject basic_ipc_queue_peek_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    try
    {
      thread.throwStack.push( $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, process_utilities.ipc_current_queue_content( actual_ipc_queue ).first() );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_actual_ipc_queue( self, actual_ipc_queue );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 41866L)
  public static SubLObject basic_ipc_queue_enqueued_p_method(final SubLObject self, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    try
    {
      thread.throwStack.push( $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, ( NIL != Sequences.find( v_object, process_utilities.ipc_current_queue_content( actual_ipc_queue ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED ) ) ? T : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_actual_ipc_queue( self, actual_ipc_queue );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42014L)
  public static SubLObject basic_ipc_queue_find_method(final SubLObject self, final SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function)
  {
    if( equality_pred == UNPROVIDED )
    {
      equality_pred = Symbols.symbol_function( EQL );
    }
    if( key_accessor_function == UNPROVIDED )
    {
      key_accessor_function = Symbols.symbol_function( IDENTITY );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    final SubLObject actual_ipc_queue = get_basic_ipc_queue_actual_ipc_queue( self );
    try
    {
      thread.throwStack.push( $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, Sequences.find( key_value, process_utilities.ipc_current_queue_content( actual_ipc_queue ), equality_pred, key_accessor_function, UNPROVIDED,
            UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_actual_ipc_queue( self, actual_ipc_queue );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42262L)
  public static SubLObject basic_ipc_queue_passive_p_method(final SubLObject self)
  {
    final SubLObject is_passive = get_basic_ipc_queue_is_passive( self );
    return is_passive;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42354L)
  public static SubLObject basic_ipc_queue_set_passive_method(final SubLObject self, final SubLObject flag)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_basic_ipc_queue_method = NIL;
    SubLObject is_passive = get_basic_ipc_queue_is_passive( self );
    try
    {
      thread.throwStack.push( $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
      try
      {
        is_passive = flag;
        Dynamic.sublisp_throw( $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD, flag );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_basic_ipc_queue_is_passive( self, is_passive );
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
      catch_var_for_basic_ipc_queue_method = Errors.handleThrowable( ccatch_env_var, $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_basic_ipc_queue_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42461L)
  public static SubLObject queue_interface_get_prioritizer(final SubLObject queue_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str367$QUEUE_INTERFACE_GET_PRIORITIZER__, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_get_prioritizer_method( queue_interface );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_get_prioritizer_method( queue_interface );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_get_prioritizer_method( queue_interface );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_get_prioritizer_method( queue_interface );
    }
    return methods.funcall_instance_method_with_0_args( queue_interface, $sym151$GET_PRIORITIZER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 42741L)
  public static SubLObject queue_interface_set_prioritizer(final SubLObject queue_interface, final SubLObject new_prioritizer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str368$QUEUE_INTERFACE_SET_PRIORITIZER__, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_ipc_queue_set_prioritizer_method( queue_interface, new_prioritizer );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return asynch_basic_doubly_linked_queue_set_prioritizer_method( queue_interface, new_prioritizer );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_set_prioritizer_method( queue_interface, new_prioritizer );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_set_prioritizer_method( queue_interface, new_prioritizer );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_set_prioritizer_method( queue_interface, new_prioritizer );
    }
    return methods.funcall_instance_method_with_1_args( queue_interface, $sym155$SET_PRIORITIZER, new_prioritizer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 43018L)
  public static SubLObject queue_interface_empty_p(final SubLObject queue_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str369$QUEUE_INTERFACE_EMPTY_P___S_is_no, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_empty_p_method( queue_interface );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_empty_p_method( queue_interface );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_empty_p_method( queue_interface );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_empty_p_method( queue_interface );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_empty_p_method( queue_interface );
    }
    return methods.funcall_instance_method_with_0_args( queue_interface, $sym69$EMPTY_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 43264L)
  public static SubLObject queue_interface_enqueue(final SubLObject queue_interface, final SubLObject new_element)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str370$QUEUE_INTERFACE_ENQUEUE___S_is_no, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_ipc_queue_enqueue_method( queue_interface, new_element );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return asynch_basic_doubly_linked_queue_enqueue_method( queue_interface, new_element );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_enqueue_method( queue_interface, new_element );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_enqueue_method( queue_interface, new_element );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_enqueue_method( queue_interface, new_element );
    }
    return methods.funcall_instance_method_with_1_args( queue_interface, $sym71$ENQUEUE, new_element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 43521L)
  public static SubLObject queue_interface_remove(final SubLObject queue_interface, final SubLObject old_element)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str371$QUEUE_INTERFACE_REMOVE___S_is_not, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_ipc_queue_remove_method( queue_interface, old_element );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return asynch_basic_doubly_linked_queue_remove_method( queue_interface, old_element );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_remove_method( queue_interface, old_element );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_remove_method( queue_interface, old_element );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_remove_method( queue_interface, old_element );
    }
    return methods.funcall_instance_method_with_1_args( queue_interface, $sym73$REMOVE, old_element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 43776L)
  public static SubLObject queue_interface_dequeue(final SubLObject queue_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str372$QUEUE_INTERFACE_DEQUEUE___S_is_no, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_ipc_queue_dequeue_method( queue_interface );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return asynch_basic_doubly_linked_queue_dequeue_method( queue_interface );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_dequeue_method( queue_interface );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_dequeue_method( queue_interface );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_dequeue_method( queue_interface );
    }
    return methods.funcall_instance_method_with_0_args( queue_interface, $sym76$DEQUEUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 44022L)
  public static SubLObject queue_interface_get_element_count(final SubLObject queue_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str373$QUEUE_INTERFACE_GET_ELEMENT_COUNT, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_get_element_count_method( queue_interface );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_get_element_count_method( queue_interface );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_get_element_count_method( queue_interface );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_get_element_count_method( queue_interface );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_get_element_count_method( queue_interface );
    }
    return methods.funcall_instance_method_with_0_args( queue_interface, $sym81$GET_ELEMENT_COUNT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 44288L)
  public static SubLObject queue_interface_get_contents(final SubLObject queue_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str374$QUEUE_INTERFACE_GET_CONTENTS___S_, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_get_contents_method( queue_interface );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_get_contents_method( queue_interface );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_get_contents_method( queue_interface );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_get_contents_method( queue_interface );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_get_contents_method( queue_interface );
    }
    return methods.funcall_instance_method_with_0_args( queue_interface, $sym83$GET_CONTENTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 44544L)
  public static SubLObject queue_interface_set_contents(final SubLObject queue_interface, final SubLObject new_contents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str375$QUEUE_INTERFACE_SET_CONTENTS___S_, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_ipc_queue_set_contents_method( queue_interface, new_contents );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return asynch_basic_doubly_linked_queue_set_contents_method( queue_interface, new_contents );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_set_contents_method( queue_interface, new_contents );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_set_contents_method( queue_interface, new_contents );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_set_contents_method( queue_interface, new_contents );
    }
    return methods.funcall_instance_method_with_1_args( queue_interface, $sym85$SET_CONTENTS, new_contents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 44812L)
  public static SubLObject queue_interface_clear(final SubLObject queue_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str376$QUEUE_INTERFACE_CLEAR___S_is_not_, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_ipc_queue_clear_method( queue_interface );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return asynch_basic_doubly_linked_queue_clear_method( queue_interface );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_clear_method( queue_interface );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_clear_method( queue_interface );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_clear_method( queue_interface );
    }
    return methods.funcall_instance_method_with_0_args( queue_interface, $sym88$CLEAR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subloop-queues.lisp", position = 45054L)
  public static SubLObject queue_interface_reorder_contents(final SubLObject queue_interface, final SubLObject ordered_contents)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == queue_interface_p( queue_interface ) )
    {
      Errors.error( $str377$QUEUE_INTERFACE_REORDER_CONTENTS_, queue_interface );
    }
    if( NIL != basic_doubly_linked_ipc_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_reorder_contents_method( queue_interface, ordered_contents );
    }
    if( NIL != asynch_basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_reorder_contents_method( queue_interface, ordered_contents );
    }
    if( NIL != basic_doubly_linked_queue_p( queue_interface ) )
    {
      return basic_doubly_linked_queue_reorder_contents_method( queue_interface, ordered_contents );
    }
    if( NIL != basic_ipc_queue_p( queue_interface ) )
    {
      return basic_ipc_queue_reorder_contents_method( queue_interface, ordered_contents );
    }
    if( NIL != basic_queue_p( queue_interface ) )
    {
      return basic_queue_reorder_contents_method( queue_interface, ordered_contents );
    }
    return methods.funcall_instance_method_with_1_args( queue_interface, $sym90$REORDER_CONTENTS, ordered_contents );
  }

  public static SubLObject declare_subloop_queues_file()
  {
    SubLFiles.declareFunction( me, "queue_element_interface_p", "QUEUE-ELEMENT-INTERFACE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_prioritizer_interface_p", "QUEUE-PRIORITIZER-INTERFACE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_prioritizer_template_p", "QUEUE-PRIORITIZER-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_simple_sorter_template_p", "QUEUE-SIMPLE-SORTER-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_queue_simple_sorter_element_key_function", "GET-BASIC-QUEUE-SIMPLE-SORTER-ELEMENT-KEY-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_queue_simple_sorter_element_key_function", "SET-BASIC-QUEUE-SIMPLE-SORTER-ELEMENT-KEY-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_queue_simple_sorter_sort_predicate", "GET-BASIC-QUEUE-SIMPLE-SORTER-SORT-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_queue_simple_sorter_sort_predicate", "SET-BASIC-QUEUE-SIMPLE-SORTER-SORT-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_simple_sorter_order_queue_internal_method", "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-INTERNAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_simple_sorter_order_queue_method", "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_queue_simple_sorter_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_queue_simple_sorter_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_simple_sorter_p", "BASIC-QUEUE-SIMPLE-SORTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_simple_sorter_initialize_method", "BASIC-QUEUE-SIMPLE-SORTER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_simple_sorter_get_sort_predicate_method", "BASIC-QUEUE-SIMPLE-SORTER-GET-SORT-PREDICATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_simple_sorter_set_sort_predicate_method", "BASIC-QUEUE-SIMPLE-SORTER-SET-SORT-PREDICATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_simple_sorter_get_element_key_method", "BASIC-QUEUE-SIMPLE-SORTER-GET-ELEMENT-KEY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_simple_sorter_set_element_key_method", "BASIC-QUEUE-SIMPLE-SORTER-SET-ELEMENT-KEY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_p", "QUEUE-INTERFACE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "end_pointer_queue_template_p", "END-POINTER-QUEUE-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_queue_prioritizer", "GET-BASIC-QUEUE-PRIORITIZER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_queue_prioritizer", "SET-BASIC-QUEUE-PRIORITIZER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_queue_last_cons", "GET-BASIC-QUEUE-LAST-CONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_queue_last_cons", "SET-BASIC-QUEUE-LAST-CONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_queue_first_cons", "GET-BASIC-QUEUE-FIRST-CONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_queue_first_cons", "SET-BASIC-QUEUE-FIRST-CONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_queue_is_passive", "GET-BASIC-QUEUE-IS-PASSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_queue_is_passive", "SET-BASIC-QUEUE-IS-PASSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_enqueued_p_method", "BASIC-QUEUE-ENQUEUED-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_peek_method", "BASIC-QUEUE-PEEK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_reorder_contents_method", "BASIC-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_clear_method", "BASIC-QUEUE-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_set_contents_method", "BASIC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_get_contents_method", "BASIC-QUEUE-GET-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_get_element_count_method", "BASIC-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_find_method", "BASIC-QUEUE-FIND-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "basic_queue_dequeue_method", "BASIC-QUEUE-DEQUEUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_remove_method", "BASIC-QUEUE-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_on_enqueue_method", "BASIC-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_enqueue_method", "BASIC-QUEUE-ENQUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_empty_p_method", "BASIC-QUEUE-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_print_method", "BASIC-QUEUE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_p", "BASIC-QUEUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_initialize_method", "BASIC-QUEUE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_get_first_cons_method", "BASIC-QUEUE-GET-FIRST-CONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_set_first_cons_method", "BASIC-QUEUE-SET-FIRST-CONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_get_end_pointer_method", "BASIC-QUEUE-GET-END-POINTER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_set_end_pointer_method", "BASIC-QUEUE-SET-END-POINTER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_get_prioritizer_method", "BASIC-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_set_prioritizer_method", "BASIC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_passive_p_method", "BASIC-QUEUE-PASSIVE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_queue_set_passive_method", "BASIC-QUEUE-SET-PASSIVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "doubly_linked_queue_template_p", "DOUBLY-LINKED-QUEUE-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_queue_prioritizer", "GET-BASIC-DOUBLY-LINKED-QUEUE-PRIORITIZER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_queue_prioritizer", "SET-BASIC-DOUBLY-LINKED-QUEUE-PRIORITIZER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_queue_list", "GET-BASIC-DOUBLY-LINKED-QUEUE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_queue_list", "SET-BASIC-DOUBLY-LINKED-QUEUE-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_queue_is_passive", "GET-BASIC-DOUBLY-LINKED-QUEUE-IS-PASSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_queue_is_passive", "SET-BASIC-DOUBLY-LINKED-QUEUE-IS-PASSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_enqueued_p_method", "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUED-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_peek_method", "BASIC-DOUBLY-LINKED-QUEUE-PEEK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_reorder_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_clear_method", "BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_set_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_get_contents_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_get_element_count_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_find_method", "BASIC-DOUBLY-LINKED-QUEUE-FIND-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_dequeue_method", "BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_remove_method", "BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_on_enqueue_method", "BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_enqueue_method", "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_empty_p_method", "BASIC-DOUBLY-LINKED-QUEUE-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_set_prioritizer_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_get_prioritizer_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_print_method", "BASIC-DOUBLY-LINKED-QUEUE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_get_list_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_initialize_qua_doubly_linked_queue_method", "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_doubly_linked_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_doubly_linked_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_p", "BASIC-DOUBLY-LINKED-QUEUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_get_list_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-INTERNAL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_set_list_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-LIST-INTERNAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_get_prioritizer_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-INTERNAL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_set_prioritizer_internal_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-INTERNAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_initialize_method", "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_passive_p_method", "BASIC-DOUBLY-LINKED-QUEUE-PASSIVE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_queue_set_passive_method", "BASIC-DOUBLY-LINKED-QUEUE-SET-PASSIVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_asynch_basic_doubly_linked_queue_lock_history", "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_asynch_basic_doubly_linked_queue_lock_history", "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_asynch_basic_doubly_linked_queue_lock", "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_asynch_basic_doubly_linked_queue_lock", "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class", "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_asynch_basic_doubly_linked_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "asynch_basic_doubly_linked_queue_p", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "asynch_basic_doubly_linked_queue_initialize_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "asynch_basic_doubly_linked_queue_set_prioritizer_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "asynch_basic_doubly_linked_queue_enqueue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "asynch_basic_doubly_linked_queue_on_enqueue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "asynch_basic_doubly_linked_queue_remove_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "asynch_basic_doubly_linked_queue_dequeue_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "asynch_basic_doubly_linked_queue_set_contents_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "asynch_basic_doubly_linked_queue_clear_method", "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_ipc_queue_semaphore", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_ipc_queue_semaphore", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_ipc_queue_lock", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_ipc_queue_lock", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_ipc_queue_semaphore_name", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_ipc_queue_semaphore_name", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-SEMAPHORE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_ipc_queue_base_suffix_counter", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-SUFFIX-COUNTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_ipc_queue_base_suffix_counter", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-SUFFIX-COUNTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_doubly_linked_ipc_queue_base_name", "GET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_doubly_linked_ipc_queue_base_name", "SET-BASIC-DOUBLY-LINKED-IPC-QUEUE-BASE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_doubly_linked_ipc_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_ipc_queue_p", "BASIC-DOUBLY-LINKED-IPC-QUEUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_ipc_queue_initialize_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_ipc_queue_set_prioritizer_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_ipc_queue_enqueue_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-ENQUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_ipc_queue_remove_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_ipc_queue_dequeue_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-DEQUEUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_ipc_queue_set_contents_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_doubly_linked_ipc_queue_clear_method", "BASIC-DOUBLY-LINKED-IPC-QUEUE-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_basic_ipc_queue_prioritizer", "GET-BASIC-IPC-QUEUE-PRIORITIZER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_ipc_queue_prioritizer", "SET-BASIC-IPC-QUEUE-PRIORITIZER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_ipc_queue_actual_ipc_queue", "GET-BASIC-IPC-QUEUE-ACTUAL-IPC-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_ipc_queue_actual_ipc_queue", "SET-BASIC-IPC-QUEUE-ACTUAL-IPC-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_basic_ipc_queue_is_passive", "GET-BASIC-IPC-QUEUE-IS-PASSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_basic_ipc_queue_is_passive", "SET-BASIC-IPC-QUEUE-IS-PASSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_on_enqueue_method", "BASIC-IPC-QUEUE-ON-ENQUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_print_method", "BASIC-IPC-QUEUE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_ipc_queue_class", "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_basic_ipc_queue_instance", "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_p", "BASIC-IPC-QUEUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_initialize_method", "BASIC-IPC-QUEUE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_get_actual_ipc_queue_method", "BASIC-IPC-QUEUE-GET-ACTUAL-IPC-QUEUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_set_actual_ipc_queue_method", "BASIC-IPC-QUEUE-SET-ACTUAL-IPC-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_get_prioritizer_method", "BASIC-IPC-QUEUE-GET-PRIORITIZER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_set_prioritizer_method", "BASIC-IPC-QUEUE-SET-PRIORITIZER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_empty_p_method", "BASIC-IPC-QUEUE-EMPTY-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_enqueue_method", "BASIC-IPC-QUEUE-ENQUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_remove_method", "BASIC-IPC-QUEUE-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_dequeue_method", "BASIC-IPC-QUEUE-DEQUEUE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_get_element_count_method", "BASIC-IPC-QUEUE-GET-ELEMENT-COUNT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_get_contents_method", "BASIC-IPC-QUEUE-GET-CONTENTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_set_contents_method", "BASIC-IPC-QUEUE-SET-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_clear_method", "BASIC-IPC-QUEUE-CLEAR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_reorder_contents_method", "BASIC-IPC-QUEUE-REORDER-CONTENTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_peek_method", "BASIC-IPC-QUEUE-PEEK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_enqueued_p_method", "BASIC-IPC-QUEUE-ENQUEUED-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_find_method", "BASIC-IPC-QUEUE-FIND-METHOD", 2, 2, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_passive_p_method", "BASIC-IPC-QUEUE-PASSIVE-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "basic_ipc_queue_set_passive_method", "BASIC-IPC-QUEUE-SET-PASSIVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_get_prioritizer", "QUEUE-INTERFACE-GET-PRIORITIZER", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_set_prioritizer", "QUEUE-INTERFACE-SET-PRIORITIZER", 2, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_empty_p", "QUEUE-INTERFACE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_enqueue", "QUEUE-INTERFACE-ENQUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_remove", "QUEUE-INTERFACE-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_dequeue", "QUEUE-INTERFACE-DEQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_get_element_count", "QUEUE-INTERFACE-GET-ELEMENT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_get_contents", "QUEUE-INTERFACE-GET-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_set_contents", "QUEUE-INTERFACE-SET-CONTENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_clear", "QUEUE-INTERFACE-CLEAR", 1, 0, false );
    SubLFiles.declareFunction( me, "queue_interface_reorder_contents", "QUEUE-INTERFACE-REORDER-CONTENTS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_subloop_queues_file()
  {
    return NIL;
  }

  public static SubLObject setup_subloop_queues_file()
  {
    interfaces.new_interface( $sym0$QUEUE_ELEMENT_INTERFACE, NIL, NIL, $list1 );
    interfaces.new_interface( $sym2$QUEUE_PRIORITIZER_INTERFACE, NIL, NIL, $list3 );
    interfaces.new_interface( $sym4$QUEUE_PRIORITIZER_TEMPLATE, $list5, $list6, $list7 );
    interfaces.interfaces_add_interface_instance_method( $sym8$ORDER_QUEUE, $sym4$QUEUE_PRIORITIZER_TEMPLATE, $list9, $list10, $list11 );
    interfaces.new_interface( $sym12$QUEUE_SIMPLE_SORTER_TEMPLATE, $list13, $list14, $list15 );
    interfaces.interfaces_add_interface_instance_method( $sym16$ORDER_QUEUE_INTERNAL, $sym12$QUEUE_SIMPLE_SORTER_TEMPLATE, $list17, $list18, $list19 );
    classes.subloop_new_class( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym21$OBJECT, $list22, NIL, $list23 );
    classes.class_set_implements_slot_listeners( $sym20$BASIC_QUEUE_SIMPLE_SORTER, NIL );
    methods.methods_incorporate_instance_method( $sym16$ORDER_QUEUE_INTERNAL, $sym20$BASIC_QUEUE_SIMPLE_SORTER, $list17, $list18, $list19 );
    methods.subloop_register_instance_method( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym16$ORDER_QUEUE_INTERNAL, $sym27$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_INTERNAL_METHOD );
    methods.methods_incorporate_instance_method( $sym8$ORDER_QUEUE, $sym20$BASIC_QUEUE_SIMPLE_SORTER, $list9, $list10, $list11 );
    methods.subloop_register_instance_method( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym8$ORDER_QUEUE, $sym29$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_METHOD );
    classes.subloop_note_class_initialization_function( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym31$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym34$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_INSTANCE );
    subloop_reserved_initialize_basic_queue_simple_sorter_class( $sym20$BASIC_QUEUE_SIMPLE_SORTER );
    methods.methods_incorporate_instance_method( $sym35$INITIALIZE, $sym20$BASIC_QUEUE_SIMPLE_SORTER, $list17, NIL, $list36 );
    methods.subloop_register_instance_method( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym35$INITIALIZE, $sym38$BASIC_QUEUE_SIMPLE_SORTER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym39$GET_SORT_PREDICATE, $sym20$BASIC_QUEUE_SIMPLE_SORTER, $list9, NIL, $list40 );
    methods.subloop_register_instance_method( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym39$GET_SORT_PREDICATE, $sym42$BASIC_QUEUE_SIMPLE_SORTER_GET_SORT_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym43$SET_SORT_PREDICATE, $sym20$BASIC_QUEUE_SIMPLE_SORTER, $list9, $list44, $list45 );
    methods.subloop_register_instance_method( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym43$SET_SORT_PREDICATE, $sym47$BASIC_QUEUE_SIMPLE_SORTER_SET_SORT_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym48$GET_ELEMENT_KEY, $sym20$BASIC_QUEUE_SIMPLE_SORTER, $list9, NIL, $list49 );
    methods.subloop_register_instance_method( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym48$GET_ELEMENT_KEY, $sym51$BASIC_QUEUE_SIMPLE_SORTER_GET_ELEMENT_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym52$SET_ELEMENT_KEY, $sym20$BASIC_QUEUE_SIMPLE_SORTER, $list9, $list53, $list54 );
    methods.subloop_register_instance_method( $sym20$BASIC_QUEUE_SIMPLE_SORTER, $sym52$SET_ELEMENT_KEY, $sym56$BASIC_QUEUE_SIMPLE_SORTER_SET_ELEMENT_KEY_METHOD );
    interfaces.new_interface( $sym57$QUEUE_INTERFACE, NIL, NIL, $list58 );
    interfaces.interfaces_add_interface_instance_method( $sym59$PRINT, $sym57$QUEUE_INTERFACE, $list9, $list60, $list61 );
    interfaces.interfaces_add_interface_instance_method( $sym62$ON_ENQUEUE, $sym57$QUEUE_INTERFACE, $list9, $list63, $list64 );
    interfaces.new_interface( $sym65$END_POINTER_QUEUE_TEMPLATE, $list66, $list67, $list68 );
    interfaces.interfaces_add_interface_instance_method( $sym69$EMPTY_P, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list70 );
    interfaces.interfaces_add_interface_instance_method( $sym71$ENQUEUE, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, $list63, $list72 );
    interfaces.interfaces_add_interface_instance_method( $sym73$REMOVE, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, $list74, $list75 );
    interfaces.interfaces_add_interface_instance_method( $sym76$DEQUEUE, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list77 );
    interfaces.interfaces_add_interface_instance_method( $sym78$FIND, $sym65$END_POINTER_QUEUE_TEMPLATE, NIL, $list79, $list80 );
    interfaces.interfaces_add_interface_instance_method( $sym81$GET_ELEMENT_COUNT, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list82 );
    interfaces.interfaces_add_interface_instance_method( $sym83$GET_CONTENTS, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list84 );
    interfaces.interfaces_add_interface_instance_method( $sym85$SET_CONTENTS, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, $list86, $list87 );
    interfaces.interfaces_add_interface_instance_method( $sym88$CLEAR, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list89 );
    interfaces.interfaces_add_interface_instance_method( $sym90$REORDER_CONTENTS, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, $list91, $list92 );
    interfaces.interfaces_add_interface_instance_method( $sym93$PEEK, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, NIL, $list94 );
    interfaces.interfaces_add_interface_instance_method( $sym95$ENQUEUED_P, $sym65$END_POINTER_QUEUE_TEMPLATE, $list9, $list96, $list97 );
    classes.subloop_new_class( $sym98$BASIC_QUEUE, $sym21$OBJECT, $list99, NIL, $list100 );
    classes.class_set_implements_slot_listeners( $sym98$BASIC_QUEUE, NIL );
    methods.methods_incorporate_instance_method( $sym95$ENQUEUED_P, $sym98$BASIC_QUEUE, $list9, $list96, $list97 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym95$ENQUEUED_P, $sym106$BASIC_QUEUE_ENQUEUED_P_METHOD );
    methods.methods_incorporate_instance_method( $sym93$PEEK, $sym98$BASIC_QUEUE, $list9, NIL, $list94 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym93$PEEK, $sym107$BASIC_QUEUE_PEEK_METHOD );
    methods.methods_incorporate_instance_method( $sym90$REORDER_CONTENTS, $sym98$BASIC_QUEUE, $list9, $list91, $list92 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym90$REORDER_CONTENTS, $sym108$BASIC_QUEUE_REORDER_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym88$CLEAR, $sym98$BASIC_QUEUE, $list9, NIL, $list89 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym88$CLEAR, $sym109$BASIC_QUEUE_CLEAR_METHOD );
    methods.methods_incorporate_instance_method( $sym85$SET_CONTENTS, $sym98$BASIC_QUEUE, $list9, $list86, $list87 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym85$SET_CONTENTS, $sym110$BASIC_QUEUE_SET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym83$GET_CONTENTS, $sym98$BASIC_QUEUE, $list9, NIL, $list84 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym83$GET_CONTENTS, $sym111$BASIC_QUEUE_GET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym81$GET_ELEMENT_COUNT, $sym98$BASIC_QUEUE, $list9, NIL, $list82 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym81$GET_ELEMENT_COUNT, $sym112$BASIC_QUEUE_GET_ELEMENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym78$FIND, $sym98$BASIC_QUEUE, NIL, $list79, $list80 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym78$FIND, $sym113$BASIC_QUEUE_FIND_METHOD );
    methods.methods_incorporate_instance_method( $sym76$DEQUEUE, $sym98$BASIC_QUEUE, $list9, NIL, $list77 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym76$DEQUEUE, $sym115$BASIC_QUEUE_DEQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym73$REMOVE, $sym98$BASIC_QUEUE, $list9, $list74, $list75 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym73$REMOVE, $sym117$BASIC_QUEUE_REMOVE_METHOD );
    methods.methods_incorporate_instance_method( $sym62$ON_ENQUEUE, $sym98$BASIC_QUEUE, $list9, $list63, $list64 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym62$ON_ENQUEUE, $sym118$BASIC_QUEUE_ON_ENQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym71$ENQUEUE, $sym98$BASIC_QUEUE, $list9, $list63, $list72 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym71$ENQUEUE, $sym120$BASIC_QUEUE_ENQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym69$EMPTY_P, $sym98$BASIC_QUEUE, $list9, NIL, $list70 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym69$EMPTY_P, $sym121$BASIC_QUEUE_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym59$PRINT, $sym98$BASIC_QUEUE, $list9, $list60, $list61 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym59$PRINT, $sym127$BASIC_QUEUE_PRINT_METHOD );
    classes.subloop_note_class_initialization_function( $sym98$BASIC_QUEUE, $sym128$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym98$BASIC_QUEUE, $sym129$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_INSTANCE );
    subloop_reserved_initialize_basic_queue_class( $sym98$BASIC_QUEUE );
    methods.methods_incorporate_instance_method( $sym35$INITIALIZE, $sym98$BASIC_QUEUE, $list17, NIL, $list130 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym35$INITIALIZE, $sym132$BASIC_QUEUE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym133$GET_FIRST_CONS, $sym98$BASIC_QUEUE, $list17, NIL, $list134 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym133$GET_FIRST_CONS, $sym136$BASIC_QUEUE_GET_FIRST_CONS_METHOD );
    methods.methods_incorporate_instance_method( $sym137$SET_FIRST_CONS, $sym98$BASIC_QUEUE, $list17, $list138, $list139 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym137$SET_FIRST_CONS, $sym141$BASIC_QUEUE_SET_FIRST_CONS_METHOD );
    methods.methods_incorporate_instance_method( $sym142$GET_END_POINTER, $sym98$BASIC_QUEUE, $list9, NIL, $list143 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym142$GET_END_POINTER, $sym145$BASIC_QUEUE_GET_END_POINTER_METHOD );
    methods.methods_incorporate_instance_method( $sym146$SET_END_POINTER, $sym98$BASIC_QUEUE, $list9, $list147, $list148 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym146$SET_END_POINTER, $sym150$BASIC_QUEUE_SET_END_POINTER_METHOD );
    methods.methods_incorporate_instance_method( $sym151$GET_PRIORITIZER, $sym98$BASIC_QUEUE, $list9, NIL, $list152 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym151$GET_PRIORITIZER, $sym154$BASIC_QUEUE_GET_PRIORITIZER_METHOD );
    methods.methods_incorporate_instance_method( $sym155$SET_PRIORITIZER, $sym98$BASIC_QUEUE, $list9, $list156, $list157 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym155$SET_PRIORITIZER, $sym160$BASIC_QUEUE_SET_PRIORITIZER_METHOD );
    methods.methods_incorporate_instance_method( $sym161$PASSIVE_P, $sym98$BASIC_QUEUE, $list162, NIL, $list163 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym161$PASSIVE_P, $sym164$BASIC_QUEUE_PASSIVE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym165$SET_PASSIVE, $sym98$BASIC_QUEUE, $list9, $list166, $list167 );
    methods.subloop_register_instance_method( $sym98$BASIC_QUEUE, $sym165$SET_PASSIVE, $sym169$BASIC_QUEUE_SET_PASSIVE_METHOD );
    interfaces.new_interface( $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list66, $list67, $list171 );
    interfaces.interfaces_add_interface_instance_method( $sym172$INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list17, NIL, $list173 );
    interfaces.interfaces_add_interface_instance_method( $sym174$GET_LIST, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list17, NIL, $list175 );
    interfaces.interfaces_add_interface_instance_method( $sym59$PRINT, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list60, $list176 );
    interfaces.interfaces_add_interface_instance_method( $sym151$GET_PRIORITIZER, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list177 );
    interfaces.interfaces_add_interface_instance_method( $sym155$SET_PRIORITIZER, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list156, $list178 );
    interfaces.interfaces_add_interface_instance_method( $sym69$EMPTY_P, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list179 );
    interfaces.interfaces_add_interface_instance_method( $sym71$ENQUEUE, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list63, $list180 );
    interfaces.interfaces_add_interface_instance_method( $sym73$REMOVE, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list74, $list181 );
    interfaces.interfaces_add_interface_instance_method( $sym76$DEQUEUE, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list182 );
    interfaces.interfaces_add_interface_instance_method( $sym78$FIND, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list79, $list183 );
    interfaces.interfaces_add_interface_instance_method( $sym81$GET_ELEMENT_COUNT, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list184 );
    interfaces.interfaces_add_interface_instance_method( $sym83$GET_CONTENTS, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list185 );
    interfaces.interfaces_add_interface_instance_method( $sym85$SET_CONTENTS, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list86, $list186 );
    interfaces.interfaces_add_interface_instance_method( $sym88$CLEAR, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list187 );
    interfaces.interfaces_add_interface_instance_method( $sym90$REORDER_CONTENTS, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list91, $list188 );
    interfaces.interfaces_add_interface_instance_method( $sym93$PEEK, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, NIL, $list189 );
    interfaces.interfaces_add_interface_instance_method( $sym95$ENQUEUED_P, $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE, $list9, $list96, $list190 );
    classes.subloop_new_class( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym21$OBJECT, $list192, NIL, $list193 );
    classes.class_set_implements_slot_listeners( $sym191$BASIC_DOUBLY_LINKED_QUEUE, NIL );
    methods.methods_incorporate_instance_method( $sym95$ENQUEUED_P, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list96, $list190 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym95$ENQUEUED_P, $sym195$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUED_P_METHOD );
    methods.methods_incorporate_instance_method( $sym93$PEEK, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list189 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym93$PEEK, $sym196$BASIC_DOUBLY_LINKED_QUEUE_PEEK_METHOD );
    methods.methods_incorporate_instance_method( $sym90$REORDER_CONTENTS, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list91, $list188 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym90$REORDER_CONTENTS, $sym197$BASIC_DOUBLY_LINKED_QUEUE_REORDER_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym88$CLEAR, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list187 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym88$CLEAR, $sym198$BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD );
    methods.methods_incorporate_instance_method( $sym85$SET_CONTENTS, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list86, $list186 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym85$SET_CONTENTS, $sym199$BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym83$GET_CONTENTS, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list185 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym83$GET_CONTENTS, $sym200$BASIC_DOUBLY_LINKED_QUEUE_GET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym81$GET_ELEMENT_COUNT, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list184 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym81$GET_ELEMENT_COUNT, $sym201$BASIC_DOUBLY_LINKED_QUEUE_GET_ELEMENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym78$FIND, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list79, $list183 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym78$FIND, $sym206$BASIC_DOUBLY_LINKED_QUEUE_FIND_METHOD );
    methods.methods_incorporate_instance_method( $sym76$DEQUEUE, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list182 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym76$DEQUEUE, $sym207$BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym73$REMOVE, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list74, $list181 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym73$REMOVE, $sym208$BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD );
    methods.methods_incorporate_instance_method( $sym62$ON_ENQUEUE, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list63, $list64 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym62$ON_ENQUEUE, $sym209$BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym71$ENQUEUE, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list63, $list180 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym71$ENQUEUE, $sym210$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym69$EMPTY_P, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list179 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym69$EMPTY_P, $sym211$BASIC_DOUBLY_LINKED_QUEUE_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym155$SET_PRIORITIZER, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list156, $list178 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym155$SET_PRIORITIZER, $sym212$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD );
    methods.methods_incorporate_instance_method( $sym151$GET_PRIORITIZER, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, NIL, $list177 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym151$GET_PRIORITIZER, $sym213$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_METHOD );
    methods.methods_incorporate_instance_method( $sym59$PRINT, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list60, $list176 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym59$PRINT, $sym218$BASIC_DOUBLY_LINKED_QUEUE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym174$GET_LIST, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list175 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym174$GET_LIST, $sym220$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_METHOD );
    methods.methods_incorporate_instance_method( $sym172$INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list173 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym172$INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, $sym221$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_METH );
    classes.subloop_note_class_initialization_function( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym222$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym223$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_INSTANCE );
    subloop_reserved_initialize_basic_doubly_linked_queue_class( $sym191$BASIC_DOUBLY_LINKED_QUEUE );
    methods.methods_incorporate_instance_method( $sym224$GET_LIST_INTERNAL, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list225 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym224$GET_LIST_INTERNAL, $sym227$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_INTERNAL_METHOD );
    methods.methods_incorporate_instance_method( $sym228$SET_LIST_INTERNAL, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list17, $list229, $list230 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym228$SET_LIST_INTERNAL, $sym232$BASIC_DOUBLY_LINKED_QUEUE_SET_LIST_INTERNAL_METHOD );
    methods.methods_incorporate_instance_method( $sym233$GET_PRIORITIZER_INTERNAL, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list152 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym233$GET_PRIORITIZER_INTERNAL, $sym235$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_INTERNAL_METHOD );
    methods.methods_incorporate_instance_method( $sym236$SET_PRIORITIZER_INTERNAL, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list17, $list156, $list237 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym236$SET_PRIORITIZER_INTERNAL, $sym239$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_INTERNAL_METHOD );
    methods.methods_incorporate_instance_method( $sym35$INITIALIZE, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list240 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym35$INITIALIZE, $sym241$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym161$PASSIVE_P, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list162, NIL, $list163 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym161$PASSIVE_P, $sym242$BASIC_DOUBLY_LINKED_QUEUE_PASSIVE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym165$SET_PASSIVE, $sym191$BASIC_DOUBLY_LINKED_QUEUE, $list9, $list166, $list167 );
    methods.subloop_register_instance_method( $sym191$BASIC_DOUBLY_LINKED_QUEUE, $sym165$SET_PASSIVE, $sym244$BASIC_DOUBLY_LINKED_QUEUE_SET_PASSIVE_METHOD );
    classes.subloop_new_class( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym191$BASIC_DOUBLY_LINKED_QUEUE, NIL, NIL, $list246 );
    classes.class_set_implements_slot_listeners( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, NIL );
    classes.subloop_note_class_initialization_function( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym248$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLAS );
    classes.subloop_note_instance_initialization_function( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym250$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INST );
    subloop_reserved_initialize_asynch_basic_doubly_linked_queue_class( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE );
    methods.methods_incorporate_instance_method( $sym35$INITIALIZE, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list17, NIL, $list251 );
    methods.subloop_register_instance_method( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym35$INITIALIZE, $sym254$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym155$SET_PRIORITIZER, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, $list156, $list256 );
    methods.subloop_register_instance_method( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym155$SET_PRIORITIZER, $sym257$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD );
    methods.methods_incorporate_instance_method( $sym71$ENQUEUE, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, $list63, $list258 );
    methods.subloop_register_instance_method( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym71$ENQUEUE, $sym263$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym62$ON_ENQUEUE, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list9, $list63, $list64 );
    methods.subloop_register_instance_method( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym62$ON_ENQUEUE, $sym264$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym73$REMOVE, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, $list74, $list265 );
    methods.subloop_register_instance_method( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym73$REMOVE, $sym267$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD );
    methods.methods_incorporate_instance_method( $sym76$DEQUEUE, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, NIL, $list268 );
    methods.subloop_register_instance_method( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym76$DEQUEUE, $sym270$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym85$SET_CONTENTS, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, $list86, $list271 );
    methods.subloop_register_instance_method( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym85$SET_CONTENTS, $sym273$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym88$CLEAR, $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $list255, NIL, $list274 );
    methods.subloop_register_instance_method( $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE, $sym88$CLEAR, $sym276$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD );
    classes.subloop_new_class( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym191$BASIC_DOUBLY_LINKED_QUEUE, NIL, NIL, $list278 );
    classes.class_set_implements_slot_listeners( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, NIL );
    classes.subloop_note_class_initialization_function( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym284$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym285$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_INSTANC );
    subloop_reserved_initialize_basic_doubly_linked_ipc_queue_class( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE );
    methods.methods_incorporate_instance_method( $sym35$INITIALIZE, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $list17, NIL, $list286 );
    methods.subloop_register_instance_method( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym35$INITIALIZE, $sym290$BASIC_DOUBLY_LINKED_IPC_QUEUE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym155$SET_PRIORITIZER, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, $list156, $list291 );
    methods.subloop_register_instance_method( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym155$SET_PRIORITIZER, $sym293$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_PRIORITIZER_METHOD );
    methods.methods_incorporate_instance_method( $sym71$ENQUEUE, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, $list63, $list294 );
    methods.subloop_register_instance_method( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym71$ENQUEUE, $sym296$BASIC_DOUBLY_LINKED_IPC_QUEUE_ENQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym73$REMOVE, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, $list74, $list297 );
    methods.subloop_register_instance_method( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym73$REMOVE, $sym299$BASIC_DOUBLY_LINKED_IPC_QUEUE_REMOVE_METHOD );
    methods.methods_incorporate_instance_method( $sym76$DEQUEUE, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, NIL, $list300 );
    methods.subloop_register_instance_method( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym76$DEQUEUE, $sym302$BASIC_DOUBLY_LINKED_IPC_QUEUE_DEQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym85$SET_CONTENTS, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, $list86, $list303 );
    methods.subloop_register_instance_method( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym85$SET_CONTENTS, $sym305$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym88$CLEAR, $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $list9, NIL, $list306 );
    methods.subloop_register_instance_method( $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE, $sym88$CLEAR, $sym308$BASIC_DOUBLY_LINKED_IPC_QUEUE_CLEAR_METHOD );
    classes.subloop_new_class( $sym309$BASIC_IPC_QUEUE, $sym21$OBJECT, $list66, NIL, $list310 );
    classes.class_set_implements_slot_listeners( $sym309$BASIC_IPC_QUEUE, NIL );
    methods.methods_incorporate_instance_method( $sym62$ON_ENQUEUE, $sym309$BASIC_IPC_QUEUE, $list9, $list63, $list64 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym62$ON_ENQUEUE, $sym312$BASIC_IPC_QUEUE_ON_ENQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym59$PRINT, $sym309$BASIC_IPC_QUEUE, $list9, $list60, $list61 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym59$PRINT, $sym313$BASIC_IPC_QUEUE_PRINT_METHOD );
    classes.subloop_note_class_initialization_function( $sym309$BASIC_IPC_QUEUE, $sym314$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym309$BASIC_IPC_QUEUE, $sym315$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_INSTANCE );
    subloop_reserved_initialize_basic_ipc_queue_class( $sym309$BASIC_IPC_QUEUE );
    methods.methods_incorporate_instance_method( $sym35$INITIALIZE, $sym309$BASIC_IPC_QUEUE, $list17, NIL, $list316 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym35$INITIALIZE, $sym319$BASIC_IPC_QUEUE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym320$GET_ACTUAL_IPC_QUEUE, $sym309$BASIC_IPC_QUEUE, $list162, NIL, $list321 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym320$GET_ACTUAL_IPC_QUEUE, $sym322$BASIC_IPC_QUEUE_GET_ACTUAL_IPC_QUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym323$SET_ACTUAL_IPC_QUEUE, $sym309$BASIC_IPC_QUEUE, $list9, $list324, $list325 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym323$SET_ACTUAL_IPC_QUEUE, $sym328$BASIC_IPC_QUEUE_SET_ACTUAL_IPC_QUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym151$GET_PRIORITIZER, $sym309$BASIC_IPC_QUEUE, $list9, NIL, $list152 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym151$GET_PRIORITIZER, $sym330$BASIC_IPC_QUEUE_GET_PRIORITIZER_METHOD );
    methods.methods_incorporate_instance_method( $sym155$SET_PRIORITIZER, $sym309$BASIC_IPC_QUEUE, $list9, $list156, $list157 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym155$SET_PRIORITIZER, $sym332$BASIC_IPC_QUEUE_SET_PRIORITIZER_METHOD );
    methods.methods_incorporate_instance_method( $sym69$EMPTY_P, $sym309$BASIC_IPC_QUEUE, $list162, NIL, $list333 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym69$EMPTY_P, $sym334$BASIC_IPC_QUEUE_EMPTY_P_METHOD );
    methods.methods_incorporate_instance_method( $sym71$ENQUEUE, $sym309$BASIC_IPC_QUEUE, $list162, $list63, $list335 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym71$ENQUEUE, $sym336$BASIC_IPC_QUEUE_ENQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym73$REMOVE, $sym309$BASIC_IPC_QUEUE, $list9, $list74, $list337 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym73$REMOVE, $sym339$BASIC_IPC_QUEUE_REMOVE_METHOD );
    methods.methods_incorporate_instance_method( $sym76$DEQUEUE, $sym309$BASIC_IPC_QUEUE, $list9, NIL, $list340 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym76$DEQUEUE, $sym342$BASIC_IPC_QUEUE_DEQUEUE_METHOD );
    methods.methods_incorporate_instance_method( $sym81$GET_ELEMENT_COUNT, $sym309$BASIC_IPC_QUEUE, $list9, NIL, $list343 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym81$GET_ELEMENT_COUNT, $sym345$BASIC_IPC_QUEUE_GET_ELEMENT_COUNT_METHOD );
    methods.methods_incorporate_instance_method( $sym83$GET_CONTENTS, $sym309$BASIC_IPC_QUEUE, $list162, NIL, $list346 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym83$GET_CONTENTS, $sym347$BASIC_IPC_QUEUE_GET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym85$SET_CONTENTS, $sym309$BASIC_IPC_QUEUE, $list162, $list86, $list348 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym85$SET_CONTENTS, $sym350$BASIC_IPC_QUEUE_SET_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym88$CLEAR, $sym309$BASIC_IPC_QUEUE, $list162, NIL, $list351 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym88$CLEAR, $sym352$BASIC_IPC_QUEUE_CLEAR_METHOD );
    methods.methods_incorporate_instance_method( $sym90$REORDER_CONTENTS, $sym309$BASIC_IPC_QUEUE, $list9, $list91, $list353 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym90$REORDER_CONTENTS, $sym354$BASIC_IPC_QUEUE_REORDER_CONTENTS_METHOD );
    methods.methods_incorporate_instance_method( $sym93$PEEK, $sym309$BASIC_IPC_QUEUE, $list9, NIL, $list355 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym93$PEEK, $sym357$BASIC_IPC_QUEUE_PEEK_METHOD );
    methods.methods_incorporate_instance_method( $sym95$ENQUEUED_P, $sym309$BASIC_IPC_QUEUE, $list9, $list96, $list358 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym95$ENQUEUED_P, $sym360$BASIC_IPC_QUEUE_ENQUEUED_P_METHOD );
    methods.methods_incorporate_instance_method( $sym78$FIND, $sym309$BASIC_IPC_QUEUE, $list9, $list79, $list361 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym78$FIND, $sym363$BASIC_IPC_QUEUE_FIND_METHOD );
    methods.methods_incorporate_instance_method( $sym161$PASSIVE_P, $sym309$BASIC_IPC_QUEUE, $list162, NIL, $list163 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym161$PASSIVE_P, $sym364$BASIC_IPC_QUEUE_PASSIVE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym165$SET_PASSIVE, $sym309$BASIC_IPC_QUEUE, $list9, $list166, $list167 );
    methods.subloop_register_instance_method( $sym309$BASIC_IPC_QUEUE, $sym165$SET_PASSIVE, $sym366$BASIC_IPC_QUEUE_SET_PASSIVE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subloop_queues_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subloop_queues_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subloop_queues_file();
  }
  static
  {
    me = new subloop_queues();
    $sym0$QUEUE_ELEMENT_INTERFACE = makeSymbol( "QUEUE-ELEMENT-INTERFACE" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUE-NOTIFY" ), ConsesLow.list( makeSymbol( "QUEUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "DEQUEUE-NOTIFY" ), ConsesLow.list( makeSymbol( "QUEUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE-NOTIFY" ),
            ConsesLow.list( makeSymbol( "QUEUE" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym2$QUEUE_PRIORITIZER_INTERFACE = makeSymbol( "QUEUE-PRIORITIZER-INTERFACE" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ORDER-QUEUE" ), ConsesLow.list( makeSymbol( "QUEUE" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym4$QUEUE_PRIORITIZER_TEMPLATE = makeSymbol( "QUEUE-PRIORITIZER-TEMPLATE" );
    $list5 = ConsesLow.list( makeSymbol( "QUEUE-PRIORITIZER-INTERFACE" ) );
    $list6 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "QUEUE-PRIORITIZER-INTERFACE" ) ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ORDER-QUEUE-INTERNAL" ), ConsesLow.list( makeSymbol( "CONTENTS" ) ), makeKeyword( "PROTECTED" ) ) );
    $sym8$ORDER_QUEUE = makeSymbol( "ORDER-QUEUE" );
    $list9 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list10 = ConsesLow.list( makeSymbol( "QUEUE" ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "QUEUE-INTERFACE-P" ), makeSymbol( "QUEUE" ) ), makeString( "(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE." ),
        makeSymbol( "SELF" ), makeSymbol( "QUEUE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol(
            "QUEUE-INTERFACE-GET-CONTENTS" ), makeSymbol( "QUEUE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                makeSymbol( "TEMPLATE-CONTENTS-ORDERED" ), ConsesLow.list( makeSymbol( "ORDER-QUEUE-INTERNAL" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol(
                    "QUEUE-INTERFACE-REORDER-CONTENTS" ), makeSymbol( "QUEUE" ), makeSymbol( "TEMPLATE-CONTENTS-ORDERED" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym12$QUEUE_SIMPLE_SORTER_TEMPLATE = makeSymbol( "QUEUE-SIMPLE-SORTER-TEMPLATE" );
    $list13 = ConsesLow.list( makeSymbol( "QUEUE-PRIORITIZER-TEMPLATE" ) );
    $list14 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "QUEUE-PRIORITIZER-TEMPLATE" ) ) );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-SORT-PREDICATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "SET-SORT-PREDICATE" ), ConsesLow.list( makeSymbol( "NEW-PREDICATE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-KEY" ), NIL, makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-ELEMENT-KEY" ), ConsesLow.list( makeSymbol( "NEW-KEY-FUNCTION" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "ORDER-QUEUE-INTERNAL" ), ConsesLow.list( makeSymbol( "CONTENTS" ) ), makeKeyword( "PROTECTED" ) ) );
    $sym16$ORDER_QUEUE_INTERNAL = makeSymbol( "ORDER-QUEUE-INTERNAL" );
    $list17 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list18 = ConsesLow.list( makeSymbol( "CONTENTS" ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PREDICATE" ), ConsesLow.list( makeSymbol( "GET-SORT-PREDICATE" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "TEMPLATE-KEY-FUNCTION" ), ConsesLow.list( makeSymbol( "GET-ELEMENT-KEY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "MUST" ), makeSymbol( "TEMPLATE-PREDICATE" ),
            makeString( "(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer." ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol(
                "TEMPLATE-KEY-FUNCTION" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-KEY-FUNCTION" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                    ConsesLow.list( makeSymbol( "SORT" ), makeSymbol( "CONTENTS" ), makeSymbol( "TEMPLATE-PREDICATE" ), makeSymbol( "TEMPLATE-KEY-FUNCTION" ) ) ) ) );
    $sym20$BASIC_QUEUE_SIMPLE_SORTER = makeSymbol( "BASIC-QUEUE-SIMPLE-SORTER" );
    $sym21$OBJECT = makeSymbol( "OBJECT" );
    $list22 = ConsesLow.list( makeSymbol( "QUEUE-SIMPLE-SORTER-TEMPLATE" ) );
    $list23 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "SORT-PREDICATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ELEMENT-KEY-FUNCTION" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "GET-SORT-PREDICATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-SORT-PREDICATE" ), ConsesLow.list( makeSymbol( "NEW-PREDICATE" ) ),
                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-KEY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                    makeSymbol( "SET-ELEMENT-KEY" ), ConsesLow.list( makeSymbol( "NEW-KEY-FUNCTION" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ORDER-QUEUE" ),
                        ConsesLow.list( makeSymbol( "QUEUE" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "ORDER-QUEUE-INTERNAL" ), ConsesLow.list( makeSymbol( "CONTENTS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) )
    } );
    $sym24$ELEMENT_KEY_FUNCTION = makeSymbol( "ELEMENT-KEY-FUNCTION" );
    $sym25$SORT_PREDICATE = makeSymbol( "SORT-PREDICATE" );
    $str26$_ORDER_QUEUE_INTERNAL__S___No_ord = makeString( "(ORDER-QUEUE-INTERNAL ~S): No ordering predicate has been associated with this prioritizer." );
    $sym27$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_INTERNAL_METHOD = makeSymbol( "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-INTERNAL-METHOD" );
    $str28$_ORDER_QUEUE__S____S_is_not_an_in = makeString( "(ORDER-QUEUE ~S): ~S is not an instance of QUEUE-INTERFACE." );
    $sym29$BASIC_QUEUE_SIMPLE_SORTER_ORDER_QUEUE_METHOD = makeSymbol( "BASIC-QUEUE-SIMPLE-SORTER-ORDER-QUEUE-METHOD" );
    $sym30$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym31$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-CLASS" );
    $sym32$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym33$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym34$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_SIMPLE_SORTER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-SIMPLE-SORTER-INSTANCE" );
    $sym35$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SORT-PREDICATE" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "ELEMENT-KEY-FUNCTION" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym37$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD" );
    $sym38$BASIC_QUEUE_SIMPLE_SORTER_INITIALIZE_METHOD = makeSymbol( "BASIC-QUEUE-SIMPLE-SORTER-INITIALIZE-METHOD" );
    $sym39$GET_SORT_PREDICATE = makeSymbol( "GET-SORT-PREDICATE" );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SORT-PREDICATE" ) ) );
    $sym41$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD" );
    $sym42$BASIC_QUEUE_SIMPLE_SORTER_GET_SORT_PREDICATE_METHOD = makeSymbol( "BASIC-QUEUE-SIMPLE-SORTER-GET-SORT-PREDICATE-METHOD" );
    $sym43$SET_SORT_PREDICATE = makeSymbol( "SET-SORT-PREDICATE" );
    $list44 = ConsesLow.list( makeSymbol( "NEW-PREDICATE" ) );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SORT-PREDICATE" ), makeSymbol( "NEW-PREDICATE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-PREDICATE" ) ) );
    $sym46$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD" );
    $sym47$BASIC_QUEUE_SIMPLE_SORTER_SET_SORT_PREDICATE_METHOD = makeSymbol( "BASIC-QUEUE-SIMPLE-SORTER-SET-SORT-PREDICATE-METHOD" );
    $sym48$GET_ELEMENT_KEY = makeSymbol( "GET-ELEMENT-KEY" );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ELEMENT-KEY-FUNCTION" ) ) );
    $sym50$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD" );
    $sym51$BASIC_QUEUE_SIMPLE_SORTER_GET_ELEMENT_KEY_METHOD = makeSymbol( "BASIC-QUEUE-SIMPLE-SORTER-GET-ELEMENT-KEY-METHOD" );
    $sym52$SET_ELEMENT_KEY = makeSymbol( "SET-ELEMENT-KEY" );
    $list53 = ConsesLow.list( makeSymbol( "NEW-KEY-FUNCTION" ) );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ELEMENT-KEY-FUNCTION" ), makeSymbol( "NEW-KEY-FUNCTION" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-KEY-FUNCTION" ) ) );
    $sym55$OUTER_CATCH_FOR_BASIC_QUEUE_SIMPLE_SORTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-SIMPLE-SORTER-METHOD" );
    $sym56$BASIC_QUEUE_SIMPLE_SORTER_SET_ELEMENT_KEY_METHOD = makeSymbol( "BASIC-QUEUE-SIMPLE-SORTER-SET-ELEMENT-KEY-METHOD" );
    $sym57$QUEUE_INTERFACE = makeSymbol( "QUEUE-INTERFACE" );
    $list58 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PRIORITIZER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "SET-PRIORITIZER" ), ConsesLow.list( makeSymbol( "NEW-PRIORITIZER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUE" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEQUEUE" ),
                    NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND" ), ConsesLow.list( makeSymbol( "KEY-VALUE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list(
                        makeSymbol( "EQUALITY-PRED" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ), ConsesLow.list( makeSymbol( "KEY-ACCESSOR-FUNCTION" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) ),
                        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list(
                                makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REORDER-CONTENTS" ), ConsesLow.list( makeSymbol( "ORDERED-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "PEEK" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUED-P" ), ConsesLow.list(
                                            makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PASSIVE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                                                .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PASSIVE" ), ConsesLow.list( makeSymbol( "FLAG" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-ENQUEUE" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym59$PRINT = makeSymbol( "PRINT" );
    $list60 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list(
        makeSymbol( "GET-CONTENTS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list(
            makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "QUEUE:{}" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ),
                ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "QUEUE:{~S}" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( T, ConsesLow.list(
                    makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "QUEUE:{~S" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                        ConsesLow.list( makeSymbol( "ELEMENT" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString(
                            "<-~S" ), makeSymbol( "ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "}" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ) );
    $sym62$ON_ENQUEUE = makeSymbol( "ON-ENQUEUE" );
    $list63 = ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym65$END_POINTER_QUEUE_TEMPLATE = makeSymbol( "END-POINTER-QUEUE-TEMPLATE" );
    $list66 = ConsesLow.list( makeSymbol( "QUEUE-INTERFACE" ) );
    $list67 = ConsesLow.list( makeKeyword( "EXTENDS" ), ConsesLow.list( makeSymbol( "QUEUE-INTERFACE" ) ) );
    $list68 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FIRST-CONS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-FIRST-CONS" ), ConsesLow.list( makeSymbol( "NEW-CONS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "GET-END-POINTER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-END-POINTER" ), ConsesLow.list( makeSymbol( "NEW-END-POINTER" ) ), makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUE" ),
                    ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ),
                        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEQUEUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                            makeSymbol( "FIND" ), ConsesLow.list( makeSymbol( "KEY-VALUE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "EQUALITY-PRED" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ),
                                ConsesLow.list( makeSymbol( "KEY-ACCESSOR-FUNCTION" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL,
                                        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword(
                                            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                makeSymbol( "REORDER-CONTENTS" ), ConsesLow.list( makeSymbol( "ORDERED-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                    makeSymbol( "PEEK" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUED-P" ), ConsesLow.list( makeSymbol(
                                                        "OBJECT" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym69$EMPTY_P = makeSymbol( "EMPTY-P" );
    $list70 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "GET-FIRST-CONS" ), makeSymbol( "SELF" ) ) ) ) );
    $sym71$ENQUEUE = makeSymbol( "ENQUEUE" );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-FIRST-CONS" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-END-POINTER" ), ConsesLow.list( makeSymbol( "GET-END-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
            "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-ELEMENT" ) ) ),
                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-END-POINTER" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "RPLACD" ),
                    makeSymbol( "TEMPLATE-END-POINTER" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-END-POINTER" ), ConsesLow
                        .list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-END-POINTER" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-FIRST-CONS" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list(
                            makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-END-POINTER" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                                makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "NEW-ELEMENT" ) ) ),
                                ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "NEW-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ENQUEUE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ON-ENQUEUE" ) ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol(
            "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ) );
    $sym73$REMOVE = makeSymbol( "REMOVE" );
    $list74 = ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) );
    $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-FIRST-CONS" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-END-POINTER" ), ConsesLow.list( makeSymbol( "GET-END-POINTER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol(
            "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol(
                "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQ, makeSymbol( "TEMPLATE-CONTENTS" ), makeSymbol( "TEMPLATE-END-POINTER" ) ), ConsesLow.list( makeSymbol( "PROGN" ),
                    ConsesLow.list( makeSymbol( "SET-FIRST-CONS" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "PWHEN" ),
                        ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                            "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                makeSymbol( "REMOVE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list(
                                    makeSymbol( "SET-FIRST-CONS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                        makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                                            "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "OLD-ELEMENT" ), ConsesLow.list(
                                                makeSymbol( "QUOTE" ), makeSymbol( "REMOVE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ) ), ConsesLow.list(
                                                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-CONS" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol(
                                                        "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ), makeSymbol(
                                                            "TEMPLATE-END-POINTER" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQ, makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "CADR" ),
                                                                makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ), ConsesLow.list( makeSymbol( "RPLACD" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ), ConsesLow.list( makeSymbol(
                                                                    "CDDR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                                                                        makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                                                                            "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                                                                                "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REMOVE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list(
                                                                                    makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ),
                                                                                        ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow
                                                                                            .list( EQ, makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "CADR" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ) ),
                                                                                            ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "RPLACD" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ), NIL ),
                                                                                                ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-CURRENT-CONS" ) ), ConsesLow
                                                                                                    .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow
                                                                                                        .list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                            "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                    "REMOVE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                                                                                        "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                                                                                                            ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
                                                                                                                                makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                    "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list(
                                                                                                                                        makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "OLD-ELEMENT" ), ConsesLow
                                                                                                                                            .list( makeSymbol( "QUOTE" ), makeSymbol( "REMOVE-NOTIFY" ) ), makeSymbol(
                                                                                                                                                "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                                                                                                                    "OLD-ELEMENT" ) ) ) ) ) ) ) ) );
    $sym76$DEQUEUE = makeSymbol( "DEQUEUE" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PRIORITIZER" ), ConsesLow.list( makeSymbol( "GET-PRIORITIZER" ), makeSymbol( "SELF" ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-PRIORITIZER" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-PRIORITIZER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "ORDER-QUEUE" ) ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol(
                "GET-FIRST-CONS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol(
                    "PUNLESS" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "SET-FIRST-CONS" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol(
                        "SET-END-POINTER" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-RESULT" ), ConsesLow.list( makeSymbol( "CAR" ),
                            makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol(
                                "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "TEMPLATE-RESULT" ) ) ), ConsesLow.list( makeSymbol(
                                    "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-RESULT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEQUEUE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list(
                                        makeSymbol( "RET" ), makeSymbol( "TEMPLATE-RESULT" ) ) ) ), ConsesLow.list( makeSymbol( "SET-FIRST-CONS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CDR" ), makeSymbol(
                                            "TEMPLATE-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-RESULT" ), ConsesLow.list( makeSymbol( "CAR" ),
                                                makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
                                                    makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "TEMPLATE-RESULT" ) ) ), ConsesLow.list(
                                                        makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-RESULT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEQUEUE-NOTIFY" ) ), makeSymbol(
                                                            "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-RESULT" ) ) ) ) );
    $sym78$FIND = makeSymbol( "FIND" );
    $list79 = ConsesLow.list( makeSymbol( "KEY-VALUE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "EQUALITY-PRED" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ), ConsesLow.list( makeSymbol(
        "KEY-ACCESSOR-FUNCTION" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) );
    $list80 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-FIRST-CONS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ITEM" ), ConsesLow.list( makeSymbol( "MEMBER" ),
            makeSymbol( "KEY-VALUE" ), makeSymbol( "TEMPLATE-CONTENTS" ), makeSymbol( "EQUALITY-PRED" ), makeSymbol( "KEY-ACCESSOR-FUNCTION" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-ITEM" ),
                ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-ITEM" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym81$GET_ELEMENT_COUNT = makeSymbol( "GET-ELEMENT-COUNT" );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "GET-FIRST-CONS" ), makeSymbol( "SELF" ) ) ) ) );
    $sym83$GET_CONTENTS = makeSymbol( "GET-CONTENTS" );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-FIRST-CONS" ), makeSymbol( "SELF" ) ) ) );
    $sym85$SET_CONTENTS = makeSymbol( "SET-CONTENTS" );
    $list86 = ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) );
    $list87 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), makeSymbol( "NEW-CONTENTS" ) ) ) ),
        ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "SET-FIRST-CONS" ), makeSymbol( "SELF" ), makeSymbol(
            "TEMPLATE-CONTENTS" ) ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "LAST" ), makeSymbol( "TEMPLATE-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol(
                "PROGN" ), ConsesLow.list( makeSymbol( "SET-FIRST-CONS" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), NIL ) ) ), ConsesLow.list( makeSymbol(
                    "RET" ), makeSymbol( "NEW-CONTENTS" ) ) ) );
    $sym88$CLEAR = makeSymbol( "CLEAR" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-FIRST-CONS" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-END-POINTER" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol(
        "RET" ), NIL ) );
    $sym90$REORDER_CONTENTS = makeSymbol( "REORDER-CONTENTS" );
    $list91 = ConsesLow.list( makeSymbol( "ORDERED-CONTENTS" ) );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SELF" ), makeSymbol( "ORDERED-CONTENTS" ) ) ) );
    $sym93$PEEK = makeSymbol( "PEEK" );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-FIRST-CONS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol(
            "TEMPLATE-CONTENTS" ) ) ) ) );
    $sym95$ENQUEUED_P = makeSymbol( "ENQUEUED-P" );
    $list96 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "GET-FIRST-CONS" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "OBJECT" ), makeSymbol( "TEMPLATE-CONTENTS" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ), ConsesLow.list( makeSymbol(
            "RET" ), T ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym98$BASIC_QUEUE = makeSymbol( "BASIC-QUEUE" );
    $list99 = ConsesLow.list( makeSymbol( "END-POINTER-QUEUE-TEMPLATE" ) );
    $list100 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "FIRST-CONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LAST-CONS" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PRIORITIZER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "IS-PASSIVE" ), makeKeyword( "BOOLEAN" ),
            makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FIRST-CONS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-FIRST-CONS" ), ConsesLow.list( makeSymbol(
                    "NEW-CONS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-END-POINTER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-END-POINTER" ), ConsesLow.list( makeSymbol( "NEW-END-POINTER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                            makeSymbol( "GET-PRIORITIZER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PRIORITIZER" ), ConsesLow.list( makeSymbol(
                                "NEW-PRIORITIZER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PASSIVE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PASSIVE" ), ConsesLow.list( makeSymbol( "FLAG" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "ENQUEUE" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-ENQUEUE" ),
              ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list(
                  makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEQUEUE" ), NIL, makeKeyword(
                      "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND" ), ConsesLow.list( makeSymbol( "KEY-VALUE" ), makeSymbol( "&OPTIONAL" ),
                          ConsesLow.list( makeSymbol( "EQUALITY-PRED" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ), ConsesLow.list( makeSymbol( "KEY-ACCESSOR-FUNCTION" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
                              IDENTITY ) ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword(
                                  "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ),
                                      makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword(
                                          "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ),
                                              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REORDER-CONTENTS" ), ConsesLow.list( makeSymbol( "ORDERED-CONTENTS" ) ),
                                                  makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PEEK" ), NIL, makeKeyword(
                                                      "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUED-P" ), ConsesLow.list( makeSymbol(
                                                          "OBJECT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym101$PRIORITIZER = makeSymbol( "PRIORITIZER" );
    $sym102$LAST_CONS = makeSymbol( "LAST-CONS" );
    $sym103$FIRST_CONS = makeSymbol( "FIRST-CONS" );
    $sym104$IS_PASSIVE = makeSymbol( "IS-PASSIVE" );
    $int105$4097 = makeInteger( 4097 );
    $sym106$BASIC_QUEUE_ENQUEUED_P_METHOD = makeSymbol( "BASIC-QUEUE-ENQUEUED-P-METHOD" );
    $sym107$BASIC_QUEUE_PEEK_METHOD = makeSymbol( "BASIC-QUEUE-PEEK-METHOD" );
    $sym108$BASIC_QUEUE_REORDER_CONTENTS_METHOD = makeSymbol( "BASIC-QUEUE-REORDER-CONTENTS-METHOD" );
    $sym109$BASIC_QUEUE_CLEAR_METHOD = makeSymbol( "BASIC-QUEUE-CLEAR-METHOD" );
    $sym110$BASIC_QUEUE_SET_CONTENTS_METHOD = makeSymbol( "BASIC-QUEUE-SET-CONTENTS-METHOD" );
    $sym111$BASIC_QUEUE_GET_CONTENTS_METHOD = makeSymbol( "BASIC-QUEUE-GET-CONTENTS-METHOD" );
    $sym112$BASIC_QUEUE_GET_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-QUEUE-GET-ELEMENT-COUNT-METHOD" );
    $sym113$BASIC_QUEUE_FIND_METHOD = makeSymbol( "BASIC-QUEUE-FIND-METHOD" );
    $sym114$DEQUEUE_NOTIFY = makeSymbol( "DEQUEUE-NOTIFY" );
    $sym115$BASIC_QUEUE_DEQUEUE_METHOD = makeSymbol( "BASIC-QUEUE-DEQUEUE-METHOD" );
    $sym116$REMOVE_NOTIFY = makeSymbol( "REMOVE-NOTIFY" );
    $sym117$BASIC_QUEUE_REMOVE_METHOD = makeSymbol( "BASIC-QUEUE-REMOVE-METHOD" );
    $sym118$BASIC_QUEUE_ON_ENQUEUE_METHOD = makeSymbol( "BASIC-QUEUE-ON-ENQUEUE-METHOD" );
    $sym119$ENQUEUE_NOTIFY = makeSymbol( "ENQUEUE-NOTIFY" );
    $sym120$BASIC_QUEUE_ENQUEUE_METHOD = makeSymbol( "BASIC-QUEUE-ENQUEUE-METHOD" );
    $sym121$BASIC_QUEUE_EMPTY_P_METHOD = makeSymbol( "BASIC-QUEUE-EMPTY-P-METHOD" );
    $str122$QUEUE___ = makeString( "QUEUE:{}" );
    $str123$QUEUE___S_ = makeString( "QUEUE:{~S}" );
    $str124$QUEUE___S = makeString( "QUEUE:{~S" );
    $str125$___S = makeString( "<-~S" );
    $str126$_ = makeString( "}" );
    $sym127$BASIC_QUEUE_PRINT_METHOD = makeSymbol( "BASIC-QUEUE-PRINT-METHOD" );
    $sym128$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-CLASS" );
    $sym129$SUBLOOP_RESERVED_INITIALIZE_BASIC_QUEUE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-QUEUE-INSTANCE" );
    $list130 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIRST-CONS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "LAST-CONS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRIORITIZER" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "IS-PASSIVE" ), NIL ), ConsesLow.list( makeSymbol(
            "RET" ), makeSymbol( "SELF" ) ) );
    $sym131$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-METHOD" );
    $sym132$BASIC_QUEUE_INITIALIZE_METHOD = makeSymbol( "BASIC-QUEUE-INITIALIZE-METHOD" );
    $sym133$GET_FIRST_CONS = makeSymbol( "GET-FIRST-CONS" );
    $list134 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "FIRST-CONS" ) ) );
    $sym135$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-METHOD" );
    $sym136$BASIC_QUEUE_GET_FIRST_CONS_METHOD = makeSymbol( "BASIC-QUEUE-GET-FIRST-CONS-METHOD" );
    $sym137$SET_FIRST_CONS = makeSymbol( "SET-FIRST-CONS" );
    $list138 = ConsesLow.list( makeSymbol( "NEW-CONS" ) );
    $list139 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FIRST-CONS" ), makeSymbol( "NEW-CONS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-CONS" ) ) );
    $sym140$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-METHOD" );
    $sym141$BASIC_QUEUE_SET_FIRST_CONS_METHOD = makeSymbol( "BASIC-QUEUE-SET-FIRST-CONS-METHOD" );
    $sym142$GET_END_POINTER = makeSymbol( "GET-END-POINTER" );
    $list143 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LAST-CONS" ) ) );
    $sym144$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-METHOD" );
    $sym145$BASIC_QUEUE_GET_END_POINTER_METHOD = makeSymbol( "BASIC-QUEUE-GET-END-POINTER-METHOD" );
    $sym146$SET_END_POINTER = makeSymbol( "SET-END-POINTER" );
    $list147 = ConsesLow.list( makeSymbol( "NEW-END-POINTER" ) );
    $list148 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LAST-CONS" ), makeSymbol( "NEW-END-POINTER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-END-POINTER" ) ) );
    $sym149$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-METHOD" );
    $sym150$BASIC_QUEUE_SET_END_POINTER_METHOD = makeSymbol( "BASIC-QUEUE-SET-END-POINTER-METHOD" );
    $sym151$GET_PRIORITIZER = makeSymbol( "GET-PRIORITIZER" );
    $list152 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PRIORITIZER" ) ) );
    $sym153$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-METHOD" );
    $sym154$BASIC_QUEUE_GET_PRIORITIZER_METHOD = makeSymbol( "BASIC-QUEUE-GET-PRIORITIZER-METHOD" );
    $sym155$SET_PRIORITIZER = makeSymbol( "SET-PRIORITIZER" );
    $list156 = ConsesLow.list( makeSymbol( "NEW-PRIORITIZER" ) );
    $list157 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "NEW-PRIORITIZER" ) ), ConsesLow.list( makeSymbol(
        "QUEUE-PRIORITIZER-INTERFACE-P" ), makeSymbol( "NEW-PRIORITIZER" ) ) ), makeString( "(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE." ), makeSymbol( "SELF" ), makeSymbol(
            "NEW-PRIORITIZER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRIORITIZER" ), makeSymbol( "NEW-PRIORITIZER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-PRIORITIZER" ) ) );
    $sym158$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-METHOD" );
    $str159$_SET_PRIORITIZER__S____S_is_not_a = makeString( "(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE." );
    $sym160$BASIC_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol( "BASIC-QUEUE-SET-PRIORITIZER-METHOD" );
    $sym161$PASSIVE_P = makeSymbol( "PASSIVE-P" );
    $list162 = ConsesLow.list( makeKeyword( "READ-ONLY" ), makeKeyword( "PUBLIC" ) );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "IS-PASSIVE" ) ) );
    $sym164$BASIC_QUEUE_PASSIVE_P_METHOD = makeSymbol( "BASIC-QUEUE-PASSIVE-P-METHOD" );
    $sym165$SET_PASSIVE = makeSymbol( "SET-PASSIVE" );
    $list166 = ConsesLow.list( makeSymbol( "FLAG" ) );
    $list167 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "IS-PASSIVE" ), makeSymbol( "FLAG" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "FLAG" ) ) );
    $sym168$OUTER_CATCH_FOR_BASIC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-QUEUE-METHOD" );
    $sym169$BASIC_QUEUE_SET_PASSIVE_METHOD = makeSymbol( "BASIC-QUEUE-SET-PASSIVE-METHOD" );
    $sym170$DOUBLY_LINKED_QUEUE_TEMPLATE = makeSymbol( "DOUBLY-LINKED-QUEUE-TEMPLATE" );
    $list171 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LIST-INTERNAL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LIST-INTERNAL" ), ConsesLow.list( makeSymbol( "NEW-LIST" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "GET-PRIORITIZER-INTERNAL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PRIORITIZER-INTERNAL" ), ConsesLow.list( makeSymbol(
                "NEW-PRIORITIZER" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE-QUA-DOUBLY-LINKED-QUEUE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow
                    .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-LIST" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list(
                        makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PRIORITIZER" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PRIORITIZER" ), ConsesLow.list( makeSymbol( "NEW-PRIORITIZER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUE" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ),
              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                  "DEF-INSTANCE-METHOD" ), makeSymbol( "DEQUEUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND" ), ConsesLow.list( makeSymbol( "KEY-VALUE" ),
                      makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "EQUALITY-PRED" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ), ConsesLow.list( makeSymbol( "KEY-ACCESSOR-FUNCTION" ), ConsesLow.list(
                          makeSymbol( "FUNCTION" ), IDENTITY ) ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list(
          makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "REORDER-CONTENTS" ), ConsesLow.list( makeSymbol( "ORDERED-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                  "PEEK" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUED-P" ), ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym172$INITIALIZE_QUA_DOUBLY_LINKED_QUEUE = makeSymbol( "INITIALIZE-QUA-DOUBLY-LINKED-QUEUE" );
    $list173 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-LIST-INTERNAL" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol( "SET-PRIORITIZER-INTERNAL" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym174$GET_LIST = makeSymbol( "GET-LIST" );
    $list175 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol(
            "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ) ) ), ConsesLow.list(
                makeSymbol( "SET-LIST-INTERNAL" ), makeSymbol( "SELF" ), makeSymbol( "TEMPLATE-LIST" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-LIST" ) ) ) );
    $list176 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list(
        makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString(
            "DL-QUEUE:{}" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list(
                makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ALLOCATE-ENUMERATOR" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ),
                    ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString(
                        "#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>" ), ConsesLow.list( makeSymbol( "CLASS-OF" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                            "SELF" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EMPTY-P" ) ) ),
                                ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "DL-QUEUE:{}" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
                                    makeString( "DL-QUEUE:{~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "FIRST" ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                                            "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LAST-P" ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString(
                                                "<-~S" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ) ) ),
                                    ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "}" ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                                        "DEALLOCATE-ENUMERATOR" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ) ), ConsesLow.list( makeSymbol(
                                            "RET" ), makeSymbol( "SELF" ) ) );
    $list177 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-PRIORITIZER-INTERNAL" ), makeSymbol( "SELF" ) ) ) );
    $list178 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "NEW-PRIORITIZER" ), ConsesLow.list( makeSymbol( "SET-PRIORITIZER-INTERNAL" ), makeSymbol( "SELF" ), NIL ), ConsesLow.list( makeSymbol(
        "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "QUEUE-PRIORITIZER-INTERFACE-P" ), makeSymbol( "NEW-PRIORITIZER" ) ), makeString(
            "(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE." ), makeSymbol( "SELF" ), makeSymbol( "NEW-PRIORITIZER" ) ), ConsesLow.list( makeSymbol( "SET-PRIORITIZER-INTERNAL" ), makeSymbol(
                "SELF" ), makeSymbol( "NEW-PRIORITIZER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-PRIORITIZER" ) ) );
    $list179 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "TEMPLATE-LIST" ) ), ConsesLow.list( makeSymbol( "COLLECTION-TEMPLATE-EMPTY-P" ), makeSymbol(
            "TEMPLATE-LIST" ) ) ) ) ) );
    $list180 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-RESOLVED-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-RESOLVED-LIST" ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list(
            makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "NEW-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "ENQUEUE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ON-ENQUEUE" ) ),
                        makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-ELEMENT" ) ) ) );
    $list181 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-RESOLVED-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-RESOLVED-LIST" ), makeSymbol( "OLD-ELEMENT" ) ), ConsesLow.list(
            makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "OLD-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "REMOVE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "OLD-ELEMENT" ) ) ) );
    $list182 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-PRIORITIZER" ), ConsesLow.list( makeSymbol(
            "GET-PRIORITIZER" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-PRIORITIZER" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                "TEMPLATE-PRIORITIZER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ORDER-QUEUE" ) ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                    makeSymbol( "DEQUEUED-ITEM" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "POP" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ) ) ) ),
                    ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list(
                        makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "DEQUEUED-ITEM" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "DEQUEUED-ITEM" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "DEQUEUE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DEQUEUED-ITEM" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list183 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ALLOCATE-ENUMERATOR" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "EMPTY-P" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                        makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIRST" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FUNCALL" ),
                            makeSymbol( "EQUALITY-PRED" ), makeSymbol( "KEY-VALUE" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "KEY-ACCESSOR-FUNCTION" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ) ),
                            ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEALLOCATE-ENUMERATOR" ) ), makeSymbol(
                                "TEMPLATE-ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                    "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "NEXT" ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FUNCALL" ),
                                            makeSymbol( "EQUALITY-PRED" ), makeSymbol( "KEY-VALUE" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "KEY-ACCESSOR-FUNCTION" ), makeSymbol(
                                                "TEMPLATE-CURRENT-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                    "DEALLOCATE-ENUMERATOR" ) ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ) ) ), ConsesLow.list(
                                                        makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CURRENT-ELEMENT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-ENUMERATOR" ),
                                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEXT" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                                                                "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEALLOCATE-ENUMERATOR" ) ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ), ConsesLow.list(
                                                                    makeSymbol( "RET" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list184 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-ELEMENT-COUNT" ), makeSymbol(
            "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ZERO_INTEGER ) );
    $list185 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-CONTENTS" ), makeSymbol(
            "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list186 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-RESOLVED-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST" ), makeSymbol( "SELF" ) ) ), ConsesLow
        .list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ALLOCATE-ENUMERATOR" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol(
            "TEMPLATE-RESOLVED-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol(
                "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-ITEM" ), ConsesLow
                    .list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ) ), ConsesLow.list(
                        makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                            "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "TEMPLATE-CURRENT-ITEM" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-CURRENT-ITEM" ), ConsesLow.list(
                                makeSymbol( "QUOTE" ), makeSymbol( "DEQUEUE-NOTIFY" ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
                                    ConsesLow.list( makeSymbol( "LAST-P" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                        makeSymbol( "TEMPLATE-CURRENT-ITEM" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEXT" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ),
                                            makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
                                                makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "TEMPLATE-CURRENT-ITEM" ) ) ), ConsesLow.list(
                                                    makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-CURRENT-ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEQUEUE-NOTIFY" ) ) ) ) ) ),
                ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "DEALLOCATE-ENUMERATOR" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-RESOLVED-LIST" ), makeSymbol(
                    "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "NEW-CONTENTS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ),
                        makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-RESOLVED-LIST" ), makeSymbol( "NEW-CONTENTS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                            "NEW-ITEM" ), makeSymbol( "NEW-CONTENTS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol(
                                "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "NEW-ITEM" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                                    makeSymbol( "NEW-ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ENQUEUE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                        "NEW-CONTENTS" ) ) );
    $list187 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-ENUMERATOR" ), ConsesLow.list( makeSymbol(
            "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ALLOCATE-ENUMERATOR" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                ConsesLow.list( makeSymbol( "TEMPLATE-CURRENT-ITEM" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ),
                    makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ),
                        makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "TEMPLATE-CURRENT-ITEM" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                            "TEMPLATE-CURRENT-ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEQUEUE-NOTIFY" ) ) ) ), ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow
                                .list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "LAST-P" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow
                                    .list( makeSymbol( "CSETQ" ), makeSymbol( "TEMPLATE-CURRENT-ITEM" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEXT" ), makeSymbol(
                                        "BASIC-DOUBLY-LINKED-LIST-ENUMERATOR" ) ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list(
                                            makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "PASSIVE-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol(
                                                "TEMPLATE-CURRENT-ITEM" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEMPLATE-CURRENT-ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                    makeSymbol( "DEQUEUE-NOTIFY" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "DEALLOCATE-ENUMERATOR" ), makeSymbol(
                                                        "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ), makeSymbol( "TEMPLATE-ENUMERATOR" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow
                                                            .list( makeSymbol( "CLEAR" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list188 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESOLVED-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
        makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "RESOLVED-LIST" ), makeSymbol( "ORDERED-CONTENTS" ) ), ConsesLow.list(
            makeSymbol( "RET" ), NIL ) ) );
    $list189 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PWHEN" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
            "GET-ELEMENT-COUNT" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ),
                ConsesLow.list( ConsesLow.list( makeSymbol( "NEXT-ITEM" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NTH" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol(
                    "TEMPLATE-LIST" ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEXT-ITEM" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $list190 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "GET-LIST-INTERNAL" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), makeSymbol( "TEMPLATE-LIST" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
            makeSymbol( "MEMBER-P" ), makeSymbol( "BASIC-DOUBLY-LINKED-LIST" ) ), makeSymbol( "TEMPLATE-LIST" ), makeSymbol( "OBJECT" ) ) ) ) );
    $sym191$BASIC_DOUBLY_LINKED_QUEUE = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE" );
    $list192 = ConsesLow.list( makeSymbol( "DOUBLY-LINKED-QUEUE-TEMPLATE" ) );
    $list193 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PRIORITIZER" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "IS-PASSIVE" ), makeKeyword( "BOOLEAN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
            makeSymbol( "GET-LIST-INTERNAL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-LIST-INTERNAL" ), ConsesLow.list( makeSymbol( "NEW-LIST" ) ),
                makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PRIORITIZER-INTERNAL" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PRIORITIZER-INTERNAL" ), ConsesLow.list( makeSymbol( "NEW-PRIORITIZER" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                        makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PASSIVE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PASSIVE" ), ConsesLow.list( makeSymbol( "FLAG" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                makeSymbol( "INITIALIZE-QUA-DOUBLY-LINKED-QUEUE" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                    makeSymbol( "GET-LIST" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ),
                                        ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PRIORITIZER" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PRIORITIZER" ), ConsesLow.list( makeSymbol( "NEW-PRIORITIZER" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword(
                                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUE" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
          makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-ENQUEUE" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ), makeKeyword( "INSTANTIATE-TEMPLATE" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                  "DEF-INSTANCE-METHOD" ), makeSymbol( "DEQUEUE" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND" ),
                      ConsesLow.list( makeSymbol( "KEY-VALUE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "EQUALITY-PRED" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ), ConsesLow.list( makeSymbol(
                          "KEY-ACCESSOR-FUNCTION" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) ), makeKeyword( "PUBLIC" ), makeKeyword( "INSTANTIATE-TEMPLATE" ) ), ConsesLow.list( makeSymbol(
                              "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                  makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ),
                                      ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                          "CLEAR" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REORDER-CONTENTS" ), ConsesLow
                                              .list( makeSymbol( "ORDERED-CONTENTS" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                  "PEEK" ), NIL, makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUED-P" ),
                                                      ConsesLow.list( makeSymbol( "OBJECT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym194$LIST = makeSymbol( "LIST" );
    $sym195$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUED_P_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUED-P-METHOD" );
    $sym196$BASIC_DOUBLY_LINKED_QUEUE_PEEK_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-PEEK-METHOD" );
    $sym197$BASIC_DOUBLY_LINKED_QUEUE_REORDER_CONTENTS_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-REORDER-CONTENTS-METHOD" );
    $sym198$BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD" );
    $sym199$BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD" );
    $sym200$BASIC_DOUBLY_LINKED_QUEUE_GET_CONTENTS_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-GET-CONTENTS-METHOD" );
    $sym201$BASIC_DOUBLY_LINKED_QUEUE_GET_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-GET-ELEMENT-COUNT-METHOD" );
    $sym202$ALLOCATE_ENUMERATOR = makeSymbol( "ALLOCATE-ENUMERATOR" );
    $sym203$FIRST = makeSymbol( "FIRST" );
    $sym204$DEALLOCATE_ENUMERATOR = makeSymbol( "DEALLOCATE-ENUMERATOR" );
    $sym205$NEXT = makeSymbol( "NEXT" );
    $sym206$BASIC_DOUBLY_LINKED_QUEUE_FIND_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-FIND-METHOD" );
    $sym207$BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD" );
    $sym208$BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD" );
    $sym209$BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD" );
    $sym210$BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD" );
    $sym211$BASIC_DOUBLY_LINKED_QUEUE_EMPTY_P_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-EMPTY-P-METHOD" );
    $sym212$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD" );
    $sym213$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-METHOD" );
    $str214$DL_QUEUE___ = makeString( "DL-QUEUE:{}" );
    $str215$___S_Class_is_not_correctly_imple = makeString( "#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>" );
    $str216$DL_QUEUE___S = makeString( "DL-QUEUE:{~S" );
    $sym217$LAST_P = makeSymbol( "LAST-P" );
    $sym218$BASIC_DOUBLY_LINKED_QUEUE_PRINT_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-PRINT-METHOD" );
    $sym219$BASIC_DOUBLY_LINKED_LIST = makeSymbol( "BASIC-DOUBLY-LINKED-LIST" );
    $sym220$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-METHOD" );
    $sym221$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_METH = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD" );
    $sym222$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-CLASS" );
    $sym223$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_QUEUE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE" );
    $sym224$GET_LIST_INTERNAL = makeSymbol( "GET-LIST-INTERNAL" );
    $list225 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "LIST" ) ) );
    $sym226$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD" );
    $sym227$BASIC_DOUBLY_LINKED_QUEUE_GET_LIST_INTERNAL_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-GET-LIST-INTERNAL-METHOD" );
    $sym228$SET_LIST_INTERNAL = makeSymbol( "SET-LIST-INTERNAL" );
    $list229 = ConsesLow.list( makeSymbol( "NEW-LIST" ) );
    $list230 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LIST" ), makeSymbol( "NEW-LIST" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-LIST" ) ) );
    $sym231$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD" );
    $sym232$BASIC_DOUBLY_LINKED_QUEUE_SET_LIST_INTERNAL_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-SET-LIST-INTERNAL-METHOD" );
    $sym233$GET_PRIORITIZER_INTERNAL = makeSymbol( "GET-PRIORITIZER-INTERNAL" );
    $sym234$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD" );
    $sym235$BASIC_DOUBLY_LINKED_QUEUE_GET_PRIORITIZER_INTERNAL_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-GET-PRIORITIZER-INTERNAL-METHOD" );
    $sym236$SET_PRIORITIZER_INTERNAL = makeSymbol( "SET-PRIORITIZER-INTERNAL" );
    $list237 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRIORITIZER" ), makeSymbol( "NEW-PRIORITIZER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-PRIORITIZER" ) ) );
    $sym238$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD" );
    $sym239$BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_INTERNAL_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-INTERNAL-METHOD" );
    $list240 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "INITIALIZE-QUA-DOUBLY-LINKED-QUEUE" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
        "RET" ), makeSymbol( "SELF" ) ) );
    $sym241$BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD" );
    $sym242$BASIC_DOUBLY_LINKED_QUEUE_PASSIVE_P_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-PASSIVE-P-METHOD" );
    $sym243$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-QUEUE-METHOD" );
    $sym244$BASIC_DOUBLY_LINKED_QUEUE_SET_PASSIVE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-QUEUE-SET-PASSIVE-METHOD" );
    $sym245$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE = makeSymbol( "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE" );
    $list246 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LOCK" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LOCK-HISTORY" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "SET-PRIORITIZER" ), ConsesLow.list( makeSymbol( "NEW-PRIORITIZER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUE" ), ConsesLow.list( makeSymbol(
                "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-ENQUEUE" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "DEQUEUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword(
              "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym247$LOCK = makeSymbol( "LOCK" );
    $sym248$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLAS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLASS" );
    $sym249$LOCK_HISTORY = makeSymbol( "LOCK-HISTORY" );
    $sym250$SUBLOOP_RESERVED_INITIALIZE_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INST = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INSTANCE" );
    $list251 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LOCK" ), ConsesLow.list( makeSymbol( "MAKE-LOCK" ), ConsesLow.list(
        makeSymbol( "FORMAT" ), NIL, makeString( "~S" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LOCK-HISTORY" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
            "SELF" ) ) );
    $sym252$OUTER_CATCH_FOR_ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-METHOD" );
    $str253$_S = makeString( "~S" );
    $sym254$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_INITIALIZE_METHOD = makeSymbol( "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-INITIALIZE-METHOD" );
    $list255 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PUBLIC" ) );
    $list256 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ), ConsesLow.list( makeSymbol( "LOCK" ), ConsesLow.list( makeSymbol(
        "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol( "LOCK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
            makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "SET-PRIORITIZER" ), makeSymbol( "SUPER" ), makeSymbol( "NEW-PRIORITIZER" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym257$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol( "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-PRIORITIZER-METHOD" );
    $list258 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ), ConsesLow.list( makeSymbol( "LOCK" ), ConsesLow.list( makeSymbol(
        "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "LOCK-HISTORY" ), ConsesLow.list( makeSymbol( "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ),
            makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "WAITING" ), makeKeyword( "ENQUEUE" ), makeSymbol( "NEW-ELEMENT" ) ), makeSymbol(
                "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol( "LOCK" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword(
                    "LOCKED" ), makeKeyword( "ENQUEUE" ), makeSymbol( "NEW-ELEMENT" ) ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol(
                        "ENQUEUE" ), makeSymbol( "SUPER" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "UNLOCKED" ), makeKeyword(
                            "ENQUEUE" ), makeSymbol( "NEW-ELEMENT" ) ), makeSymbol( "LOCK-HISTORY" ) ) ), ConsesLow.list( makeSymbol( "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ), makeSymbol( "SELF" ),
                                makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $kw259$WAITING = makeKeyword( "WAITING" );
    $kw260$ENQUEUE = makeKeyword( "ENQUEUE" );
    $kw261$LOCKED = makeKeyword( "LOCKED" );
    $kw262$UNLOCKED = makeKeyword( "UNLOCKED" );
    $sym263$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ENQUEUE_METHOD = makeSymbol( "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ENQUEUE-METHOD" );
    $sym264$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_ON_ENQUEUE_METHOD = makeSymbol( "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-ON-ENQUEUE-METHOD" );
    $list265 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ), ConsesLow.list( makeSymbol( "LOCK" ), ConsesLow.list( makeSymbol(
        "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "LOCK-HISTORY" ), ConsesLow.list( makeSymbol( "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ),
            makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "WAITING" ), makeKeyword( "REMOVE" ), makeSymbol( "OLD-ELEMENT" ) ), makeSymbol(
                "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol( "LOCK" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword(
                    "LOCKED" ), makeKeyword( "REMOVE" ), makeSymbol( "OLD-ELEMENT" ) ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol(
                        "REMOVE" ), makeSymbol( "SUPER" ), makeSymbol( "OLD-ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "UNLOCKED" ), makeKeyword( "REMOVE" ),
                            makeSymbol( "OLD-ELEMENT" ) ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ), makeSymbol( "SELF" ), makeSymbol(
                                "LOCK-HISTORY" ) ) ), ConsesLow.list( makeSymbol( "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ), makeSymbol( "SELF" ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol(
                                    "RET" ), makeSymbol( "RESULT" ) ) ) );
    $kw266$REMOVE = makeKeyword( "REMOVE" );
    $sym267$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_REMOVE_METHOD = makeSymbol( "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-REMOVE-METHOD" );
    $list268 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ), ConsesLow.list( makeSymbol( "LOCK" ), ConsesLow.list( makeSymbol(
        "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "LOCK-HISTORY" ), ConsesLow.list( makeSymbol( "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ),
            makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "WAITING" ), makeKeyword( "DEQUEUE" ) ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list(
                makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol( "LOCK" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "LOCKED" ), makeKeyword( "DEQUEUE" ) ),
                    makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "DEQUEUE" ), makeSymbol( "SUPER" ) ) ), ConsesLow.list( makeSymbol(
                        "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "UNLOCKED" ), makeKeyword( "DEQUEUE" ), makeSymbol( "RESULT" ) ), makeSymbol( "LOCK-HISTORY" ) ) ), ConsesLow.list( makeSymbol(
                            "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ), makeSymbol( "SELF" ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $kw269$DEQUEUE = makeKeyword( "DEQUEUE" );
    $sym270$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_DEQUEUE_METHOD = makeSymbol( "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-DEQUEUE-METHOD" );
    $list271 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ), ConsesLow.list( makeSymbol( "LOCK" ), ConsesLow.list( makeSymbol(
        "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "LOCK-HISTORY" ), ConsesLow.list( makeSymbol( "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ),
            makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "WAITING" ), makeKeyword( "SET-CONTENTS" ), makeSymbol( "NEW-CONTENTS" ) ), makeSymbol(
                "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol( "LOCK" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword(
                    "LOCKED" ), makeKeyword( "SET-CONTENTS" ), makeSymbol( "NEW-CONTENTS" ) ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol(
                        "SET-CONTENTS" ), makeSymbol( "SUPER" ), makeSymbol( "NEW-CONTENTS" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "UNLOCKED" ), makeKeyword(
                            "SET-CONTENTS" ), makeSymbol( "RESULT" ) ), makeSymbol( "LOCK-HISTORY" ) ) ), ConsesLow.list( makeSymbol( "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ), makeSymbol( "SELF" ),
                                makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $kw272$SET_CONTENTS = makeKeyword( "SET-CONTENTS" );
    $sym273$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_SET_CONTENTS_METHOD = makeSymbol( "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-SET-CONTENTS-METHOD" );
    $list274 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LOCK" ), ConsesLow.list( makeSymbol( "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK" ), makeSymbol(
        "SELF" ) ) ), ConsesLow.list( makeSymbol( "LOCK-HISTORY" ), ConsesLow.list( makeSymbol( "GET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
            ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "WAITING" ), makeKeyword( "CLEAR" ) ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol(
                "LOCK" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "LOCKED" ), makeKeyword( "CLEAR" ) ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol(
                    "CLEAR" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "UNLOCKED" ), makeKeyword( "CLEAR" ) ), makeSymbol( "LOCK-HISTORY" ) ) ),
        ConsesLow.list( makeSymbol( "SET-ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-LOCK-HISTORY" ), makeSymbol( "SELF" ), makeSymbol( "LOCK-HISTORY" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $kw275$CLEAR = makeKeyword( "CLEAR" );
    $sym276$ASYNCH_BASIC_DOUBLY_LINKED_QUEUE_CLEAR_METHOD = makeSymbol( "ASYNCH-BASIC-DOUBLY-LINKED-QUEUE-CLEAR-METHOD" );
    $sym277$BASIC_DOUBLY_LINKED_IPC_QUEUE = makeSymbol( "BASIC-DOUBLY-LINKED-IPC-QUEUE" );
    $list278 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "BASE-NAME" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), makeString( "BASIC-DOUBLY-LINKED-IPC-QUEUE" ) ),
      ConsesLow.list( makeSymbol( "BASE-SUFFIX-COUNTER" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "SEMAPHORE-NAME" ), makeKeyword(
          "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LOCK" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SEMAPHORE" ), makeKeyword( "INSTANCE" ),
              makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                  makeSymbol( "SET-PRIORITIZER" ), ConsesLow.list( makeSymbol( "NEW-PRIORITIZER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUE" ), ConsesLow
                      .list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ),
                          makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEQUEUE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                              makeSymbol( "SET-CONTENTS" ), ConsesLow.list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL,
                                  makeKeyword( "PUBLIC" ) )
    } );
    $sym279$SEMAPHORE = makeSymbol( "SEMAPHORE" );
    $sym280$SEMAPHORE_NAME = makeSymbol( "SEMAPHORE-NAME" );
    $sym281$BASE_SUFFIX_COUNTER = makeSymbol( "BASE-SUFFIX-COUNTER" );
    $sym282$BASE_NAME = makeSymbol( "BASE-NAME" );
    $str283$BASIC_DOUBLY_LINKED_IPC_QUEUE = makeString( "BASIC-DOUBLY-LINKED-IPC-QUEUE" );
    $sym284$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-CLASS" );
    $sym285$SUBLOOP_RESERVED_INITIALIZE_BASIC_DOUBLY_LINKED_IPC_QUEUE_INSTANC = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-DOUBLY-LINKED-IPC-QUEUE-INSTANCE" );
    $list286 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEMAPHORE-NAME" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL,
        makeString( "~A-~S" ), makeSymbol( "BASE-NAME" ), makeSymbol( "BASE-SUFFIX-COUNTER" ) ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "BASE-SUFFIX-COUNTER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
            makeSymbol( "LOCK" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "Lock for Queue " ), makeSymbol( "SEMAPHORE-NAME" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SEMAPHORE" ),
                ConsesLow.list( makeSymbol( "NEW-SEMAPHORE" ), makeSymbol( "SEMAPHORE-NAME" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym287$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD" );
    $str288$_A__S = makeString( "~A-~S" );
    $str289$Lock_for_Queue_ = makeString( "Lock for Queue " );
    $sym290$BASIC_DOUBLY_LINKED_IPC_QUEUE_INITIALIZE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-IPC-QUEUE-INITIALIZE-METHOD" );
    $list291 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol(
        "LOCK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "SET-PRIORITIZER" ), makeSymbol( "SUPER" ), makeSymbol( "NEW-PRIORITIZER" ) ) ) ), ConsesLow.list(
            makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym292$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD" );
    $sym293$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-PRIORITIZER-METHOD" );
    $list294 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ) ), ConsesLow.list( makeSymbol( "V-SEMAPHORE" ), makeSymbol( "SEMAPHORE" ) ), ConsesLow
        .list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol( "LOCK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "ENQUEUE" ), makeSymbol( "SUPER" ),
            makeSymbol( "NEW-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym295$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD" );
    $sym296$BASIC_DOUBLY_LINKED_IPC_QUEUE_ENQUEUE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-IPC-QUEUE-ENQUEUE-METHOD" );
    $list297 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol(
        "LOCK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "SUPER" ), makeSymbol( "OLD-ELEMENT" ) ) ) ), ConsesLow.list( makeSymbol(
            "P-SEMAPHORE" ), makeSymbol( "SEMAPHORE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym298$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD" );
    $sym299$BASIC_DOUBLY_LINKED_IPC_QUEUE_REMOVE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-IPC-QUEUE-REMOVE-METHOD" );
    $list300 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol(
        "LOCK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "DEQUEUE" ), makeSymbol( "SUPER" ) ) ) ), ConsesLow.list( makeSymbol( "P-SEMAPHORE" ), makeSymbol(
            "SEMAPHORE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym301$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD" );
    $sym302$BASIC_DOUBLY_LINKED_IPC_QUEUE_DEQUEUE_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-IPC-QUEUE-DEQUEUE-METHOD" );
    $list303 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), NIL ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol(
        "LOCK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "SET-CONTENTS" ), makeSymbol( "SUPER" ), makeSymbol( "NEW-CONTENTS" ) ) ) ), ConsesLow.list( makeSymbol(
            "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym304$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD" );
    $sym305$BASIC_DOUBLY_LINKED_IPC_QUEUE_SET_CONTENTS_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-IPC-QUEUE-SET-CONTENTS-METHOD" );
    $list306 = ConsesLow.list( ConsesLow.list( makeSymbol( "WHILE" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "EMPTY-P" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "P-SEMAPHORE" ),
        makeSymbol( "SEMAPHORE" ) ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol( "LOCK" ) ), ConsesLow.list( makeSymbol( "DEQUEUE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
            makeSymbol( "RET" ), NIL ) );
    $sym307$OUTER_CATCH_FOR_BASIC_DOUBLY_LINKED_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-DOUBLY-LINKED-IPC-QUEUE-METHOD" );
    $sym308$BASIC_DOUBLY_LINKED_IPC_QUEUE_CLEAR_METHOD = makeSymbol( "BASIC-DOUBLY-LINKED-IPC-QUEUE-CLEAR-METHOD" );
    $sym309$BASIC_IPC_QUEUE = makeSymbol( "BASIC-IPC-QUEUE" );
    $list310 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "ACTUAL-IPC-QUEUE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PRIORITIZER" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "IS-PASSIVE" ), makeKeyword( "BOOLEAN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ACTUAL-IPC-QUEUE" ), NIL, makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-ACTUAL-IPC-QUEUE" ), ConsesLow.list( makeSymbol( "NEW-QUEUE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PRIORITIZER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PRIORITIZER" ), ConsesLow.list(
                        makeSymbol( "NEW-PRIORITIZER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EMPTY-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUE" ), ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                makeSymbol( "REMOVE" ), ConsesLow.list( makeSymbol( "OLD-ELEMENT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEQUEUE" ), NIL,
                                    makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ELEMENT-COUNT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENTS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-CONTENTS" ), ConsesLow
                                            .list( makeSymbol( "NEW-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEAR" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REORDER-CONTENTS" ), ConsesLow.list( makeSymbol( "ORDERED-CONTENTS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "PEEK" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ENQUEUED-P" ), ConsesLow.list( makeSymbol( "OBJECT" ) ),
              makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND" ), ConsesLow.list( makeSymbol( "KEY-VALUE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol(
                  "EQUALITY-PRED" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQL ) ), ConsesLow.list( makeSymbol( "KEY-ACCESSOR-FUNCTION" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) ), makeKeyword(
                      "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PASSIVE-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                          "SET-PASSIVE" ), ConsesLow.list( makeSymbol( "FLAG" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol(
                              "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ON-ENQUEUE" ),
                                  ConsesLow.list( makeSymbol( "NEW-ELEMENT" ) ), makeKeyword( "INSTANTIATE-TEMPLATE" ), makeKeyword( "PUBLIC" ) )
    } );
    $sym311$ACTUAL_IPC_QUEUE = makeSymbol( "ACTUAL-IPC-QUEUE" );
    $sym312$BASIC_IPC_QUEUE_ON_ENQUEUE_METHOD = makeSymbol( "BASIC-IPC-QUEUE-ON-ENQUEUE-METHOD" );
    $sym313$BASIC_IPC_QUEUE_PRINT_METHOD = makeSymbol( "BASIC-IPC-QUEUE-PRINT-METHOD" );
    $sym314$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-CLASS" );
    $sym315$SUBLOOP_RESERVED_INITIALIZE_BASIC_IPC_QUEUE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-BASIC-IPC-QUEUE-INSTANCE" );
    $list316 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ACTUAL-IPC-QUEUE" ), ConsesLow.list( makeSymbol( "NEW-IPC-QUEUE" ),
        ConsesLow.list( makeSymbol( "FORMAT-TO-STRING" ), makeKeyword( "A" ), makeString( "BASIC-IPC-QUEUE-" ), makeKeyword( "D" ), makeSymbol( "INSTANCE-NUMBER" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
            "SELF" ) ) );
    $sym317$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $str318$BASIC_IPC_QUEUE_ = makeString( "BASIC-IPC-QUEUE-" );
    $sym319$BASIC_IPC_QUEUE_INITIALIZE_METHOD = makeSymbol( "BASIC-IPC-QUEUE-INITIALIZE-METHOD" );
    $sym320$GET_ACTUAL_IPC_QUEUE = makeSymbol( "GET-ACTUAL-IPC-QUEUE" );
    $list321 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ACTUAL-IPC-QUEUE" ) ) );
    $sym322$BASIC_IPC_QUEUE_GET_ACTUAL_IPC_QUEUE_METHOD = makeSymbol( "BASIC-IPC-QUEUE-GET-ACTUAL-IPC-QUEUE-METHOD" );
    $sym323$SET_ACTUAL_IPC_QUEUE = makeSymbol( "SET-ACTUAL-IPC-QUEUE" );
    $list324 = ConsesLow.list( makeSymbol( "NEW-QUEUE" ) );
    $list325 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "IPC-QUEUE-P" ), makeSymbol( "NEW-QUEUE" ) ), makeString(
        "(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct." ), makeSymbol( "SELF" ), makeSymbol( "NEW-QUEUE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ACTUAL-IPC-QUEUE" ),
            makeSymbol( "NEW-QUEUE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-QUEUE" ) ) );
    $sym326$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $str327$_SET_ACTUAL_IPC_QUEUE__S____S_is_ = makeString( "(SET-ACTUAL-IPC-QUEUE ~S): ~S is not an instance of the IPC-QUEUE struct." );
    $sym328$BASIC_IPC_QUEUE_SET_ACTUAL_IPC_QUEUE_METHOD = makeSymbol( "BASIC-IPC-QUEUE-SET-ACTUAL-IPC-QUEUE-METHOD" );
    $sym329$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $sym330$BASIC_IPC_QUEUE_GET_PRIORITIZER_METHOD = makeSymbol( "BASIC-IPC-QUEUE-GET-PRIORITIZER-METHOD" );
    $sym331$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $sym332$BASIC_IPC_QUEUE_SET_PRIORITIZER_METHOD = makeSymbol( "BASIC-IPC-QUEUE-SET-PRIORITIZER-METHOD" );
    $list333 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ZEROP" ), ConsesLow.list( makeSymbol( "IPC-CURRENT-QUEUE-SIZE" ), makeSymbol( "ACTUAL-IPC-QUEUE" ) ) ) ) );
    $sym334$BASIC_IPC_QUEUE_EMPTY_P_METHOD = makeSymbol( "BASIC-IPC-QUEUE-EMPTY-P-METHOD" );
    $list335 = ConsesLow.list( ConsesLow.list( makeSymbol( "IPC-ENQUEUE" ), makeSymbol( "NEW-ELEMENT" ), makeSymbol( "ACTUAL-IPC-QUEUE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
        ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "IS-PASSIVE" ) ), ConsesLow.list( makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ), makeSymbol( "NEW-ELEMENT" ) ) ), ConsesLow.list( makeSymbol(
            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "NEW-ELEMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ENQUEUE-NOTIFY" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol(
                "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ON-ENQUEUE" ) ), makeSymbol( "NEW-ELEMENT" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                    "NEW-ELEMENT" ) ) );
    $sym336$BASIC_IPC_QUEUE_ENQUEUE_METHOD = makeSymbol( "BASIC-IPC-QUEUE-ENQUEUE-METHOD" );
    $list337 = ConsesLow.list( ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Invalid operation: Cannot remove arbitrary item from IPC queue." ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
        "OLD-ELEMENT" ) ) );
    $str338$Invalid_operation__Cannot_remove_ = makeString( "Invalid operation: Cannot remove arbitrary item from IPC queue." );
    $sym339$BASIC_IPC_QUEUE_REMOVE_METHOD = makeSymbol( "BASIC-IPC-QUEUE-REMOVE-METHOD" );
    $list340 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DEQUEUED-ITEM" ), ConsesLow.list( makeSymbol( "IPC-DEQUEUE" ), makeSymbol( "ACTUAL-IPC-QUEUE" ) ) ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "IS-PASSIVE" ) ), ConsesLow.list( makeSymbol( "QUEUE-ELEMENT-INTERFACE-P" ),
            makeSymbol( "DEQUEUED-ITEM" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "DEQUEUED-ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEQUEUE-NOTIFY" ) ), makeSymbol(
                "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DEQUEUED-ITEM" ) ) ) );
    $sym341$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $sym342$BASIC_IPC_QUEUE_DEQUEUE_METHOD = makeSymbol( "BASIC-IPC-QUEUE-DEQUEUE-METHOD" );
    $list343 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "IPC-CURRENT-QUEUE-SIZE" ), makeSymbol( "ACTUAL-IPC-QUEUE" ) ) ) );
    $sym344$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $sym345$BASIC_IPC_QUEUE_GET_ELEMENT_COUNT_METHOD = makeSymbol( "BASIC-IPC-QUEUE-GET-ELEMENT-COUNT-METHOD" );
    $list346 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "IPC-CURRENT-QUEUE-CONTENT" ), makeSymbol( "ACTUAL-IPC-QUEUE" ) ) ) );
    $sym347$BASIC_IPC_QUEUE_GET_CONTENTS_METHOD = makeSymbol( "BASIC-IPC-QUEUE-GET-CONTENTS-METHOD" );
    $list348 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "NEW-CONTENTS" ) ), makeString( "(SET-CONTENTS ~S): ~S is not a valid list." ), makeSymbol(
        "SELF" ) ), ConsesLow.list( makeSymbol( "CLEAR" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ELEMENT" ), makeSymbol( "NEW-CONTENTS" ) ), ConsesLow.list(
            makeSymbol( "ENQUEUE" ), makeSymbol( "SELF" ), makeSymbol( "ELEMENT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-CONTENTS" ) ) );
    $str349$_SET_CONTENTS__S____S_is_not_a_va = makeString( "(SET-CONTENTS ~S): ~S is not a valid list." );
    $sym350$BASIC_IPC_QUEUE_SET_CONTENTS_METHOD = makeSymbol( "BASIC-IPC-QUEUE-SET-CONTENTS-METHOD" );
    $list351 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ELEMENT-COUNT" ), ConsesLow.list( makeSymbol( "GET-ELEMENT-COUNT" ), makeSymbol( "SELF" ) ) ) ), ConsesLow
        .list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), makeSymbol( "ELEMENT-COUNT" ) ), ConsesLow.list( makeSymbol( "DEQUEUE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
            NIL ) );
    $sym352$BASIC_IPC_QUEUE_CLEAR_METHOD = makeSymbol( "BASIC-IPC-QUEUE-CLEAR-METHOD" );
    $list353 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ORDERED-CONTENTS" ) ) );
    $sym354$BASIC_IPC_QUEUE_REORDER_CONTENTS_METHOD = makeSymbol( "BASIC-IPC-QUEUE-REORDER-CONTENTS-METHOD" );
    $list355 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "IPC-CURRENT-QUEUE-CONTENT" ), makeSymbol( "ACTUAL-IPC-QUEUE" ) ) ) ) );
    $sym356$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $sym357$BASIC_IPC_QUEUE_PEEK_METHOD = makeSymbol( "BASIC-IPC-QUEUE-PEEK-METHOD" );
    $list358 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "FIND" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol(
        "IPC-CURRENT-QUEUE-CONTENT" ), makeSymbol( "ACTUAL-IPC-QUEUE" ) ) ), T, NIL ) ) );
    $sym359$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $sym360$BASIC_IPC_QUEUE_ENQUEUED_P_METHOD = makeSymbol( "BASIC-IPC-QUEUE-ENQUEUED-P-METHOD" );
    $list361 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIND" ), makeSymbol( "KEY-VALUE" ), ConsesLow.list( makeSymbol( "IPC-CURRENT-QUEUE-CONTENT" ), makeSymbol(
        "ACTUAL-IPC-QUEUE" ) ), makeSymbol( "EQUALITY-PRED" ), makeSymbol( "KEY-ACCESSOR-FUNCTION" ) ) ) );
    $sym362$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $sym363$BASIC_IPC_QUEUE_FIND_METHOD = makeSymbol( "BASIC-IPC-QUEUE-FIND-METHOD" );
    $sym364$BASIC_IPC_QUEUE_PASSIVE_P_METHOD = makeSymbol( "BASIC-IPC-QUEUE-PASSIVE-P-METHOD" );
    $sym365$OUTER_CATCH_FOR_BASIC_IPC_QUEUE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-BASIC-IPC-QUEUE-METHOD" );
    $sym366$BASIC_IPC_QUEUE_SET_PASSIVE_METHOD = makeSymbol( "BASIC-IPC-QUEUE-SET-PASSIVE-METHOD" );
    $str367$QUEUE_INTERFACE_GET_PRIORITIZER__ = makeString( "QUEUE-INTERFACE-GET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE." );
    $str368$QUEUE_INTERFACE_SET_PRIORITIZER__ = makeString( "QUEUE-INTERFACE-SET-PRIORITIZER: ~S is not an instance of QUEUE-INTERFACE." );
    $str369$QUEUE_INTERFACE_EMPTY_P___S_is_no = makeString( "QUEUE-INTERFACE-EMPTY-P: ~S is not an instance of QUEUE-INTERFACE." );
    $str370$QUEUE_INTERFACE_ENQUEUE___S_is_no = makeString( "QUEUE-INTERFACE-ENQUEUE: ~S is not an instance of QUEUE-INTERFACE." );
    $str371$QUEUE_INTERFACE_REMOVE___S_is_not = makeString( "QUEUE-INTERFACE-REMOVE: ~S is not an instance of QUEUE-INTERFACE." );
    $str372$QUEUE_INTERFACE_DEQUEUE___S_is_no = makeString( "QUEUE-INTERFACE-DEQUEUE: ~S is not an instance of QUEUE-INTERFACE." );
    $str373$QUEUE_INTERFACE_GET_ELEMENT_COUNT = makeString( "QUEUE-INTERFACE-GET-ELEMENT-COUNT: ~S is not an instance of QUEUE-INTERFACE." );
    $str374$QUEUE_INTERFACE_GET_CONTENTS___S_ = makeString( "QUEUE-INTERFACE-GET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE." );
    $str375$QUEUE_INTERFACE_SET_CONTENTS___S_ = makeString( "QUEUE-INTERFACE-SET-CONTENTS: ~S is not an instance of QUEUE-INTERFACE." );
    $str376$QUEUE_INTERFACE_CLEAR___S_is_not_ = makeString( "QUEUE-INTERFACE-CLEAR: ~S is not an instance of QUEUE-INTERFACE." );
    $str377$QUEUE_INTERFACE_REORDER_CONTENTS_ = makeString( "QUEUE-INTERFACE-REORDER-CONTENTS: ~S is not an instance of QUEUE-INTERFACE." );
  }
}
/*
 * 
 * Total time: 1608 ms
 * 
 */