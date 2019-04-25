package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0751 extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.module0751";
    public static final String myFingerPrint = "d67a59bc8000ff55c7bbc3c61bb0ff6da35665869e59d96ac1d43a60bf5ba0a3";
    private static SubLSymbol $g5989$;
    private static SubLSymbol $g5990$;
    private static SubLSymbol $g5991$;
    public static SubLSymbol $g5992$;
    public static SubLSymbol $g5993$;
    public static SubLSymbol $g5994$;
    private static SubLSymbol $g5995$;
    private static SubLSymbol $g5996$;
    private static SubLSymbol $g5997$;
    private static SubLSymbol $g5998$;
    public static SubLSymbol $g5999$;
    private static SubLSymbol $g6000$;
    private static SubLSymbol $g6001$;
    private static SubLSymbol $g6002$;
    private static SubLSymbol $g6003$;
    private static SubLSymbol $g6004$;
    private static SubLSymbol $g6005$;
    private static SubLSymbol $g6006$;
    private static SubLSymbol $g6007$;
    private static SubLSymbol $g6008$;
    private static SubLSymbol $g6009$;
    private static SubLSymbol $g6010$;
    private static SubLSymbol $g6011$;
    private static SubLSymbol $g6012$;
    private static SubLSymbol $g6013$;
    private static SubLSymbol $g6014$;
    private static SubLSymbol $g6015$;
    private static SubLSymbol $g6016$;
    private static SubLSymbol $g6017$;
    private static SubLSymbol $g6018$;
    private static SubLSymbol $g6019$;
    private static SubLSymbol $g6020$;
    private static SubLSymbol $g6021$;
    public static SubLSymbol $g6022$;
    private static SubLSymbol $g6023$;
    private static SubLSymbol $g6024$;
    private static SubLSymbol $g6025$;
    private static SubLSymbol $g6026$;
    private static SubLSymbol $g6027$;
    private static SubLSymbol $g6028$;
    private static SubLSymbol $g6029$;
    private static SubLSymbol $g6030$;
    private static SubLSymbol $g6031$;
    private static SubLSymbol $g6032$;
    private static SubLSymbol $g6033$;
    public static SubLSymbol $g6034$;
    private static SubLSymbol $g6035$;
    private static SubLSymbol $g6036$;
    private static SubLSymbol $g6037$;
    private static SubLSymbol $g6038$;
    private static SubLSymbol $g6039$;
    private static SubLSymbol $g6040$;
    private static SubLSymbol $g6041$;
    private static SubLSymbol $g6042$;
    private static SubLSymbol $g6043$;
    private static SubLSymbol $g6044$;
    private static SubLSymbol $g6045$;
    private static SubLSymbol $g6046$;
    private static SubLSymbol $g6047$;
    private static SubLSymbol $g6048$;
    private static SubLSymbol $g6049$;
    private static SubLSymbol $g6050$;
    private static SubLSymbol $g6051$;
    private static SubLSymbol $g6052$;
    public static SubLSymbol $g6053$;
    public static SubLSymbol $g6054$;
    public static SubLSymbol $g6055$;
    public static SubLSymbol $g6056$;
    private static final SubLList $ic0$;
    private static final SubLList $ic1$;
    private static final SubLList $ic2$;
    private static final SubLObject $ic3$;
    private static final SubLList $ic4$;
    private static final SubLList $ic5$;
    private static final SubLSymbol $ic6$;
    private static final SubLList $ic7$;
    private static final SubLList $ic8$;
    private static final SubLSymbol $ic9$;
    private static final SubLSymbol $ic10$;
    private static final SubLSymbol $ic11$;
    private static final SubLString $ic12$;
    private static final SubLString $ic13$;
    private static final SubLSymbol $ic14$;
    private static final SubLString $ic15$;
    private static final SubLSymbol $ic16$;
    private static final SubLList $ic17$;
    private static final SubLSymbol $ic18$;
    private static final SubLList $ic19$;
    private static final SubLSymbol $ic20$;
    private static final SubLList $ic21$;
    private static final SubLString $ic22$;
    private static final SubLString $ic23$;
    private static final SubLList $ic24$;
    private static final SubLSymbol $ic25$;
    private static final SubLSymbol $ic26$;
    private static final SubLString $ic27$;
    private static final SubLList $ic28$;
    private static final SubLSymbol $ic29$;
    private static final SubLSymbol $ic30$;
    private static final SubLSymbol $ic31$;
    private static final SubLSymbol $ic32$;
    private static final SubLSymbol $ic33$;
    private static final SubLSymbol $ic34$;
    private static final SubLSymbol $ic35$;
    private static final SubLSymbol $ic36$;
    private static final SubLSymbol $ic37$;
    private static final SubLSymbol $ic38$;
    private static final SubLObject $ic39$;
    private static final SubLSymbol $ic40$;
    private static final SubLSymbol $ic41$;
    private static final SubLList $ic42$;
    private static final SubLSymbol $ic43$;
    private static final SubLSymbol $ic44$;
    private static final SubLInteger $ic45$;
    private static final SubLObject $ic46$;
    private static final SubLObject $ic47$;
    private static final SubLObject $ic48$;
    private static final SubLObject $ic49$;
    private static final SubLObject $ic50$;
    private static final SubLSymbol $ic51$;
    private static final SubLObject $ic52$;
    private static final SubLObject $ic53$;
    private static final SubLList $ic54$;
    private static final SubLList $ic55$;
    private static final SubLSymbol $ic56$;
    private static final SubLSymbol $ic57$;
    private static final SubLSymbol $ic58$;
    private static final SubLSymbol $ic59$;
    private static final SubLString $ic60$;
    private static final SubLString $ic61$;
    private static final SubLString $ic62$;
    private static final SubLObject $ic63$;
    private static final SubLString $ic64$;
    private static final SubLList $ic65$;
    private static final SubLSymbol $ic66$;
    private static final SubLSymbol $ic67$;
    private static final SubLString $ic68$;
    private static final SubLSymbol $ic69$;
    private static final SubLString $ic70$;
    private static final SubLSymbol $ic71$;
    private static final SubLString $ic72$;
    private static final SubLString $ic73$;
    private static final SubLString $ic74$;
    private static final SubLString $ic75$;
    private static final SubLString $ic76$;
    private static final SubLString $ic77$;
    private static final SubLString $ic78$;
    private static final SubLString $ic79$;
    private static final SubLSymbol $ic80$;
    private static final SubLString $ic81$;
    private static final SubLString $ic82$;
    private static final SubLString $ic83$;
    private static final SubLList $ic84$;
    private static final SubLList $ic85$;
    private static final SubLSymbol $ic86$;
    private static final SubLList $ic87$;
    private static final SubLSymbol $ic88$;
    private static final SubLString $ic89$;
    private static final SubLString $ic90$;
    private static final SubLSymbol $ic91$;
    private static final SubLSymbol $ic92$;
    private static final SubLString $ic93$;
    private static final SubLSymbol $ic94$;
    private static final SubLSymbol $ic95$;
    private static final SubLString $ic96$;
    private static final SubLSymbol $ic97$;
    private static final SubLSymbol $ic98$;
    private static final SubLString $ic99$;
    private static final SubLSymbol $ic100$;
    private static final SubLSymbol $ic101$;
    private static final SubLString $ic102$;
    private static final SubLSymbol $ic103$;
    private static final SubLSymbol $ic104$;
    private static final SubLString $ic105$;
    private static final SubLSymbol $ic106$;
    private static final SubLSymbol $ic107$;
    private static final SubLString $ic108$;
    private static final SubLSymbol $ic109$;
    private static final SubLSymbol $ic110$;
    private static final SubLString $ic111$;
    private static final SubLSymbol $ic112$;
    private static final SubLSymbol $ic113$;
    private static final SubLString $ic114$;
    private static final SubLSymbol $ic115$;
    private static final SubLSymbol $ic116$;
    private static final SubLString $ic117$;
    private static final SubLSymbol $ic118$;
    private static final SubLObject $ic119$;
    private static final SubLList $ic120$;
    private static final SubLObject $ic121$;
    private static final SubLSymbol $ic122$;
    private static final SubLSymbol $ic123$;
    private static final SubLObject $ic124$;
    private static final SubLObject $ic125$;
    private static final SubLList $ic126$;
    private static final SubLObject $ic127$;
    private static final SubLList $ic128$;
    private static final SubLList $ic129$;
    private static final SubLString $ic130$;
    private static final SubLSymbol $ic131$;
    private static final SubLString $ic132$;
    private static final SubLSymbol $ic133$;
    private static final SubLString $ic134$;
    private static final SubLSymbol $ic135$;
    private static final SubLSymbol $ic136$;
    private static final SubLSymbol $ic137$;
    private static final SubLSymbol $ic138$;
    private static final SubLSymbol $ic139$;
    private static final SubLString $ic140$;
    private static final SubLSymbol $ic141$;
    private static final SubLString $ic142$;
    private static final SubLString $ic143$;
    private static final SubLSymbol $ic144$;
    private static final SubLString $ic145$;
    private static final SubLString $ic146$;
    private static final SubLString $ic147$;
    private static final SubLString $ic148$;
    private static final SubLObject $ic149$;
    private static final SubLString $ic150$;
    private static final SubLObject $ic151$;
    private static final SubLString $ic152$;
    private static final SubLString $ic153$;
    private static final SubLString $ic154$;
    private static final SubLString $ic155$;
    private static final SubLString $ic156$;
    private static final SubLString $ic157$;
    private static final SubLString $ic158$;
    private static final SubLSymbol $ic159$;
    private static final SubLString $ic160$;
    private static final SubLString $ic161$;
    private static final SubLString $ic162$;
    private static final SubLString $ic163$;
    private static final SubLString $ic164$;
    private static final SubLString $ic165$;
    private static final SubLList $ic166$;
    private static final SubLObject $ic167$;
    private static final SubLList $ic168$;
    private static final SubLList $ic169$;
    private static final SubLList $ic170$;
    private static final SubLList $ic171$;
    private static final SubLList $ic172$;
    private static final SubLList $ic173$;
    private static final SubLList $ic174$;
    private static final SubLList $ic175$;
    private static final SubLList $ic176$;
    private static final SubLList $ic177$;
    private static final SubLList $ic178$;
    private static final SubLList $ic179$;
    private static final SubLObject $ic180$;
    private static final SubLObject $ic181$;
    private static final SubLObject $ic182$;
    private static final SubLObject $ic183$;
    private static final SubLObject $ic184$;
    private static final SubLObject $ic185$;
    private static final SubLList $ic186$;
    private static final SubLObject $ic187$;
    private static final SubLObject $ic188$;
    private static final SubLObject $ic189$;
    private static final SubLList $ic190$;
    private static final SubLString $ic191$;
    private static final SubLSymbol $ic192$;
    private static final SubLObject $ic193$;
    private static final SubLString $ic194$;
    private static final SubLObject $ic195$;
    private static final SubLString $ic196$;
    private static final SubLList $ic197$;
    private static final SubLObject $ic198$;
    private static final SubLList $ic199$;
    private static final SubLObject $ic200$;
    private static final SubLList $ic201$;
    private static final SubLSymbol $ic202$;
    private static final SubLSymbol $ic203$;
    private static final SubLSymbol $ic204$;
    private static final SubLSymbol $ic205$;
    private static final SubLSymbol $ic206$;
    private static final SubLList $ic207$;
    private static final SubLSymbol $ic208$;
    private static final SubLSymbol $ic209$;
    private static final SubLList $ic210$;
    private static final SubLSymbol $ic211$;
    private static final SubLSymbol $ic212$;
    private static final SubLSymbol $ic213$;
    private static final SubLSymbol $ic214$;
    private static final SubLSymbol $ic215$;
    private static final SubLString $ic216$;
    private static final SubLString $ic217$;
    private static final SubLSymbol $ic218$;
    private static final SubLSymbol $ic219$;
    private static final SubLInteger $ic220$;
    private static final SubLString $ic221$;
    private static final SubLString $ic222$;
    private static final SubLSymbol $ic223$;
    private static final SubLSymbol $ic224$;
    private static final SubLString $ic225$;
    private static final SubLString $ic226$;
    private static final SubLString $ic227$;
    private static final SubLString $ic228$;
    private static final SubLList $ic229$;
    private static final SubLSymbol $ic230$;
    private static final SubLSymbol $ic231$;
    private static final SubLInteger $ic232$;
    private static final SubLSymbol $ic233$;
    private static final SubLInteger $ic234$;
    private static final SubLList $ic235$;
    private static final SubLSymbol $ic236$;
    private static final SubLSymbol $ic237$;
    private static final SubLSymbol $ic238$;
    private static final SubLString $ic239$;
    private static final SubLSymbol $ic240$;
    private static final SubLSymbol $ic241$;
    private static final SubLString $ic242$;
    private static final SubLSymbol $ic243$;
    private static final SubLSymbol $ic244$;
    private static final SubLString $ic245$;
    private static final SubLSymbol $ic246$;
    private static final SubLList $ic247$;
    private static final SubLList $ic248$;
    private static final SubLSymbol $ic249$;
    private static final SubLSymbol $ic250$;
    private static final SubLSymbol $ic251$;
    private static final SubLSymbol $ic252$;
    private static final SubLSymbol $ic253$;
    private static final SubLSymbol $ic254$;
    private static final SubLObject $ic255$;
    private static final SubLSymbol $ic256$;
    private static final SubLSymbol $ic257$;
    private static final SubLSymbol $ic258$;
    private static final SubLObject $ic259$;
    private static final SubLList $ic260$;
    private static final SubLSymbol $ic261$;
    private static final SubLSymbol $ic262$;
    private static final SubLObject $ic263$;
    private static final SubLObject $ic264$;
    private static final SubLObject $ic265$;
    private static final SubLSymbol $ic266$;
    private static final SubLSymbol $ic267$;
    private static final SubLSymbol $ic268$;
    private static final SubLSymbol $ic269$;
    private static final SubLSymbol $ic270$;
    private static final SubLString $ic271$;
    private static final SubLSymbol $ic272$;
    private static final SubLSymbol $ic273$;
    private static final SubLString $ic274$;
    private static final SubLSymbol $ic275$;
    private static final SubLString $ic276$;
    private static final SubLObject $ic277$;
    private static final SubLString $ic278$;
    private static final SubLString $ic279$;
    private static final SubLList $ic280$;
    private static final SubLString $ic281$;
    private static final SubLSymbol $ic282$;
    private static final SubLSymbol $ic283$;
    private static final SubLSymbol $ic284$;
    private static final SubLList $ic285$;
    private static final SubLObject $ic286$;
    private static final SubLSymbol $ic287$;
    private static final SubLObject $ic288$;
    private static final SubLString $ic289$;
    private static final SubLObject $ic290$;
    private static final SubLObject $ic291$;
    private static final SubLSymbol $ic292$;
    private static final SubLObject $ic293$;
    private static final SubLList $ic294$;
    private static final SubLList $ic295$;
    private static final SubLSymbol $ic296$;
    private static final SubLSymbol $ic297$;
    private static final SubLObject $ic298$;
    private static final SubLObject $ic299$;
    private static final SubLList $ic300$;
    private static final SubLSymbol $ic301$;
    private static final SubLSymbol $ic302$;
    private static final SubLSymbol $ic303$;
    private static final SubLList $ic304$;
    private static final SubLSymbol $ic305$;
    private static final SubLList $ic306$;
    private static final SubLSymbol $ic307$;
    private static final SubLSymbol $ic308$;
    private static final SubLSymbol $ic309$;
    private static final SubLSymbol $ic310$;
    private static final SubLObject $ic311$;
    private static final SubLList $ic312$;
    private static final SubLSymbol $ic313$;
    private static final SubLSymbol $ic314$;
    private static final SubLSymbol $ic315$;
    private static final SubLSymbol $ic316$;
    private static final SubLSymbol $ic317$;
    private static final SubLSymbol $ic318$;
    private static final SubLSymbol $ic319$;
    private static final SubLSymbol $ic320$;
    private static final SubLObject $ic321$;
    private static final SubLString $ic322$;
    private static final SubLSymbol $ic323$;
    private static final SubLObject $ic324$;
    private static final SubLSymbol $ic325$;
    private static final SubLSymbol $ic326$;
    private static final SubLSymbol $ic327$;
    private static final SubLInteger $ic328$;
    private static final SubLObject $ic329$;
    private static final SubLSymbol $ic330$;
    private static final SubLSymbol $ic331$;
    private static final SubLSymbol $ic332$;
    private static final SubLSymbol $ic333$;
    private static final SubLObject $ic334$;
    private static final SubLSymbol $ic335$;
    private static final SubLSymbol $ic336$;
    private static final SubLSymbol $ic337$;
    private static final SubLString $ic338$;
    private static final SubLList $ic339$;
    private static final SubLString $ic340$;
    private static final SubLString $ic341$;
    private static final SubLString $ic342$;
    private static final SubLString $ic343$;
    private static final SubLList $ic344$;
    private static final SubLString $ic345$;
    private static final SubLString $ic346$;
    private static final SubLList $ic347$;
    private static final SubLString $ic348$;
    private static final SubLSymbol $ic349$;
    private static final SubLString $ic350$;
    private static final SubLString $ic351$;
    private static final SubLString $ic352$;
    private static final SubLString $ic353$;
    private static final SubLSymbol $ic354$;
    private static final SubLObject $ic355$;
    private static final SubLObject $ic356$;
    private static final SubLObject $ic357$;
    private static final SubLObject $ic358$;
    private static final SubLObject $ic359$;
    private static final SubLList $ic360$;
    private static final SubLObject $ic361$;
    private static final SubLList $ic362$;
    private static final SubLObject $ic363$;
    private static final SubLObject $ic364$;
    private static final SubLObject $ic365$;
    private static final SubLObject $ic366$;
    private static final SubLObject $ic367$;
    private static final SubLSymbol $ic368$;
    private static final SubLSymbol $ic369$;
    private static final SubLSymbol $ic370$;
    private static final SubLObject $ic371$;
    private static final SubLList $ic372$;
    private static final SubLList $ic373$;
    private static final SubLSymbol $ic374$;
    private static final SubLSymbol $ic375$;
    private static final SubLObject $ic376$;
    private static final SubLList $ic377$;
    private static final SubLObject $ic378$;
    private static final SubLList $ic379$;
    private static final SubLObject $ic380$;
    private static final SubLList $ic381$;
    private static final SubLObject $ic382$;
    private static final SubLObject $ic383$;
    private static final SubLSymbol $ic384$;
    private static final SubLObject $ic385$;
    private static final SubLList $ic386$;
    private static final SubLList $ic387$;
    private static final SubLObject $ic388$;
    private static final SubLList $ic389$;
    private static final SubLObject $ic390$;
    private static final SubLObject $ic391$;
    private static final SubLList $ic392$;
    private static final SubLSymbol $ic393$;
    private static final SubLSymbol $ic394$;
    private static final SubLSymbol $ic395$;
    private static final SubLSymbol $ic396$;
    private static final SubLString $ic397$;
    private static final SubLString $ic398$;
    private static final SubLString $ic399$;
    private static final SubLString $ic400$;
    private static final SubLString $ic401$;
    private static final SubLSymbol $ic402$;
    private static final SubLString $ic403$;
    private static final SubLSymbol $ic404$;
    private static final SubLString $ic405$;
    private static final SubLSymbol $ic406$;
    private static final SubLSymbol $ic407$;
    private static final SubLInteger $ic408$;
    private static final SubLSymbol $ic409$;
    private static final SubLList $ic410$;
    private static final SubLString $ic411$;
    private static final SubLInteger $ic412$;
    private static final SubLSymbol $ic413$;
    private static final SubLString $ic414$;
    private static final SubLObject $ic415$;
    private static final SubLSymbol $ic416$;
    private static final SubLSymbol $ic417$;
    private static final SubLSymbol $ic418$;
    private static final SubLSymbol $ic419$;
    private static final SubLSymbol $ic420$;
    private static final SubLSymbol $ic421$;
    private static final SubLSymbol $ic422$;
    private static final SubLSymbol $ic423$;
    private static final SubLSymbol $ic424$;
    private static final SubLString $ic425$;
    private static final SubLList $ic426$;
    private static final SubLObject $ic427$;
    private static final SubLSymbol $ic428$;
    private static final SubLSymbol $ic429$;
    private static final SubLString $ic430$;
    private static final SubLObject $ic431$;
    private static final SubLInteger $ic432$;
    private static final SubLSymbol $ic433$;
    private static final SubLList $ic434$;
    private static final SubLSymbol $ic435$;
    private static final SubLSymbol $ic436$;
    private static final SubLSymbol $ic437$;
    private static final SubLSymbol $ic438$;
    private static final SubLList $ic439$;
    private static final SubLString $ic440$;
    private static final SubLList $ic441$;
    private static final SubLList $ic442$;
    private static final SubLList $ic443$;
    private static final SubLList $ic444$;
    private static final SubLList $ic445$;
    private static final SubLSymbol $ic446$;
    private static final SubLSymbol $ic447$;
    private static final SubLList $ic448$;
    private static final SubLSymbol $ic449$;
    private static final SubLSymbol $ic450$;
    private static final SubLList $ic451$;
    private static final SubLSymbol $ic452$;
    private static final SubLSymbol $ic453$;
    private static final SubLSymbol $ic454$;
    private static final SubLObject $ic455$;
    private static final SubLSymbol $ic456$;
    private static final SubLString $ic457$;
    private static final SubLString $ic458$;
    private static final SubLString $ic459$;
    private static final SubLSymbol $ic460$;
    private static final SubLSymbol $ic461$;
    private static final SubLSymbol $ic462$;
    private static final SubLSymbol $ic463$;
    private static final SubLSymbol $ic464$;
    private static final SubLSymbol $ic465$;
    private static final SubLSymbol $ic466$;
    private static final SubLSymbol $ic467$;
    private static final SubLSymbol $ic468$;
    private static final SubLSymbol $ic469$;
    private static final SubLSymbol $ic470$;
    private static final SubLSymbol $ic471$;
    private static final SubLSymbol $ic472$;
    private static final SubLString $ic473$;
    private static final SubLSymbol $ic474$;
    private static final SubLObject $ic475$;
    private static final SubLObject $ic476$;
    private static final SubLObject $ic477$;
    private static final SubLObject $ic478$;
    private static final SubLObject $ic479$;
    private static final SubLObject $ic480$;
    private static final SubLList $ic481$;
    private static final SubLList $ic482$;
    private static final SubLList $ic483$;
    private static final SubLList $ic484$;
    private static final SubLString $ic485$;
    private static final SubLSymbol $ic486$;
    private static final SubLSymbol $ic487$;
    private static final SubLString $ic488$;
    private static final SubLSymbol $ic489$;
    private static final SubLList $ic490$;
    private static final SubLString $ic491$;
    private static final SubLString $ic492$;
    private static final SubLSymbol $ic493$;
    private static final SubLString $ic494$;
    private static final SubLString $ic495$;
    private static final SubLString $ic496$;
    private static final SubLString $ic497$;
    private static final SubLString $ic498$;
    private static final SubLSymbol $ic499$;
    private static final SubLSymbol $ic500$;
    private static final SubLList $ic501$;
    private static final SubLSymbol $ic502$;
    private static final SubLSymbol $ic503$;
    private static final SubLSymbol $ic504$;
    private static final SubLSymbol $ic505$;
    private static final SubLSymbol $ic506$;
    private static final SubLSymbol $ic507$;
    private static final SubLSymbol $ic508$;
    private static final SubLSymbol $ic509$;
    private static final SubLSymbol $ic510$;
    private static final SubLSymbol $ic511$;
    private static final SubLSymbol $ic512$;
    private static final SubLList $ic513$;
    private static final SubLList $ic514$;
    private static final SubLList $ic515$;
    private static final SubLList $ic516$;
    private static final SubLSymbol $ic517$;
    private static final SubLSymbol $ic518$;
    private static final SubLSymbol $ic519$;
    private static final SubLSymbol $ic520$;
    private static final SubLSymbol $ic521$;
    private static final SubLString $ic522$;
    private static final SubLObject $ic523$;
    private static final SubLSymbol $ic524$;
    private static final SubLObject $ic525$;
    private static final SubLSymbol $ic526$;
    private static final SubLSymbol $ic527$;
    private static final SubLObject $ic528$;
    private static final SubLObject $ic529$;
    private static final SubLString $ic530$;
    private static final SubLString $ic531$;
    private static final SubLSymbol $ic532$;
    private static final SubLSymbol $ic533$;
    private static final SubLObject $ic534$;
    private static final SubLSymbol $ic535$;
    private static final SubLInteger $ic536$;
    private static final SubLSymbol $ic537$;
    private static final SubLList $ic538$;
    private static final SubLSymbol $ic539$;
    private static final SubLObject $ic540$;
    private static final SubLSymbol $ic541$;
    private static final SubLSymbol $ic542$;
    private static final SubLSymbol $ic543$;
    private static final SubLSymbol $ic544$;
    private static final SubLSymbol $ic545$;
    private static final SubLInteger $ic546$;
    private static final SubLObject $ic547$;
    private static final SubLSymbol $ic548$;
    private static final SubLString $ic549$;
    private static final SubLSymbol $ic550$;
    private static final SubLObject $ic551$;
    private static final SubLObject $ic552$;
    private static final SubLObject $ic553$;
    private static final SubLObject $ic554$;
    private static final SubLSymbol $ic555$;
    private static final SubLList $ic556$;
    private static final SubLObject $ic557$;
    private static final SubLObject $ic558$;
    private static final SubLSymbol $ic559$;
    private static final SubLSymbol $ic560$;
    private static final SubLString $ic561$;
    private static final SubLSymbol $ic562$;
    private static final SubLList $ic563$;
    private static final SubLList $ic564$;
    private static final SubLList $ic565$;
    private static final SubLList $ic566$;
    private static final SubLObject $ic567$;
    private static final SubLSymbol $ic568$;
    private static final SubLObject $ic569$;
    private static final SubLList $ic570$;
    private static final SubLSymbol $ic571$;
    private static final SubLSymbol $ic572$;
    private static final SubLObject $ic573$;
    private static final SubLObject $ic574$;
    private static final SubLObject $ic575$;
    private static final SubLObject $ic576$;
    private static final SubLString $ic577$;
    private static final SubLObject $ic578$;
    private static final SubLObject $ic579$;
    private static final SubLSymbol $ic580$;
    private static final SubLObject $ic581$;
    private static final SubLObject $ic582$;
    private static final SubLObject $ic583$;
    private static final SubLList $ic584$;
    private static final SubLList $ic585$;
    private static final SubLObject $ic586$;
    private static final SubLList $ic587$;
    private static final SubLList $ic588$;
    private static final SubLObject $ic589$;
    private static final SubLSymbol $ic590$;
    private static final SubLSymbol $ic591$;
    private static final SubLSymbol $ic592$;
    private static final SubLInteger $ic593$;
    private static final SubLList $ic594$;
    private static final SubLSymbol $ic595$;
    private static final SubLList $ic596$;
    private static final SubLSymbol $ic597$;
    private static final SubLList $ic598$;
    private static final SubLSymbol $ic599$;
    private static final SubLSymbol $ic600$;
    private static final SubLSymbol $ic601$;
    private static final SubLSymbol $ic602$;
    private static final SubLSymbol $ic603$;
    private static final SubLString $ic604$;
    private static final SubLObject $ic605$;
    private static final SubLSymbol $ic606$;
    private static final SubLSymbol $ic607$;
    private static final SubLInteger $ic608$;
    private static final SubLObject $ic609$;
    private static final SubLObject $ic610$;
    private static final SubLObject $ic611$;
    private static final SubLObject $ic612$;
    private static final SubLObject $ic613$;
    private static final SubLSymbol $ic614$;
    private static final SubLInteger $ic615$;
    private static final SubLSymbol $ic616$;
    private static final SubLSymbol $ic617$;
    private static final SubLSymbol $ic618$;
    private static final SubLInteger $ic619$;
    private static final SubLSymbol $ic620$;
    private static final SubLObject $ic621$;
    private static final SubLObject $ic622$;
    private static final SubLSymbol $ic623$;
    private static final SubLSymbol $ic624$;
    private static final SubLObject $ic625$;
    private static final SubLObject $ic626$;
    private static final SubLSymbol $ic627$;
    private static final SubLSymbol $ic628$;
    private static final SubLList $ic629$;
    private static final SubLList $ic630$;
    private static final SubLList $ic631$;
    private static final SubLList $ic632$;
    private static final SubLSymbol $ic633$;
    private static final SubLSymbol $ic634$;
    private static final SubLList $ic635$;
    private static final SubLSymbol $ic636$;
    private static final SubLSymbol $ic637$;
    private static final SubLSymbol $ic638$;
    private static final SubLSymbol $ic639$;
    private static final SubLSymbol $ic640$;
    private static final SubLSymbol $ic641$;
    private static final SubLString $ic642$;
    private static final SubLSymbol $ic643$;
    private static final SubLSymbol $ic644$;
    private static final SubLSymbol $ic645$;
    private static final SubLSymbol $ic646$;
    private static final SubLSymbol $ic647$;
    private static final SubLString $ic648$;
    private static final SubLString $ic649$;
    private static final SubLString $ic650$;
    private static final SubLInteger $ic651$;
    private static final SubLSymbol $ic652$;
    private static final SubLSymbol $ic653$;
    private static final SubLObject $ic654$;
    private static final SubLObject $ic655$;
    private static final SubLObject $ic656$;
    private static final SubLObject $ic657$;
    private static final SubLSymbol $ic658$;
    private static final SubLSymbol $ic659$;
    private static final SubLSymbol $ic660$;
    private static final SubLSymbol $ic661$;
    private static final SubLSymbol $ic662$;
    private static final SubLObject $ic663$;
    private static final SubLList $ic664$;
    private static final SubLObject $ic665$;
    private static final SubLObject $ic666$;
    private static final SubLObject $ic667$;
    private static final SubLObject $ic668$;
    private static final SubLSymbol $ic669$;
    private static final SubLString $ic670$;
    private static final SubLString $ic671$;
    private static final SubLSymbol $ic672$;
    private static final SubLSymbol $ic673$;
    private static final SubLSymbol $ic674$;
    private static final SubLList $ic675$;
    private static final SubLString $ic676$;
    private static final SubLSymbol $ic677$;
    private static final SubLSymbol $ic678$;
    private static final SubLSymbol $ic679$;
    private static final SubLSymbol $ic680$;
    private static final SubLObject $ic681$;
    private static final SubLSymbol $ic682$;
    private static final SubLObject $ic683$;
    private static final SubLList $ic684$;
    private static final SubLObject $ic685$;
    private static final SubLString $ic686$;
    private static final SubLSymbol $ic687$;
    private static final SubLSymbol $ic688$;
    private static final SubLString $ic689$;
    private static final SubLString $ic690$;
    private static final SubLSymbol $ic691$;
    private static final SubLObject $ic692$;
    private static final SubLObject $ic693$;
    private static final SubLSymbol $ic694$;
    private static final SubLObject $ic695$;
    private static final SubLList $ic696$;
    private static final SubLList $ic697$;
    private static final SubLSymbol $ic698$;
    private static final SubLList $ic699$;
    private static final SubLList $ic700$;
    private static final SubLList $ic701$;
    private static final SubLSymbol $ic702$;
    private static final SubLSymbol $ic703$;
    private static final SubLSymbol $ic704$;
    private static final SubLObject $ic705$;
    private static final SubLString $ic706$;
    private static final SubLString $ic707$;
    private static final SubLList $ic708$;
    private static final SubLList $ic709$;
    private static final SubLString $ic710$;
    private static final SubLSymbol $ic711$;
    private static final SubLList $ic712$;
    private static final SubLString $ic713$;
    private static final SubLString $ic714$;
    private static final SubLString $ic715$;
    private static final SubLSymbol $ic716$;
    private static final SubLSymbol $ic717$;
    private static final SubLList $ic718$;
    private static final SubLSymbol $ic719$;
    private static final SubLList $ic720$;
    private static final SubLSymbol $ic721$;
    private static final SubLObject $ic722$;
    private static final SubLObject $ic723$;
    private static final SubLObject $ic724$;
    private static final SubLSymbol $ic725$;
    private static final SubLObject $ic726$;
    private static final SubLSymbol $ic727$;
    private static final SubLObject $ic728$;
    private static final SubLSymbol $ic729$;
    private static final SubLObject $ic730$;
    private static final SubLInteger $ic731$;
    private static final SubLObject $ic732$;
    private static final SubLString $ic733$;
    private static final SubLSymbol $ic734$;
    private static final SubLList $ic735$;
    private static final SubLObject $ic736$;
    private static final SubLSymbol $ic737$;
    private static final SubLInteger $ic738$;
    private static final SubLInteger $ic739$;
    private static final SubLSymbol $ic740$;
    private static final SubLList $ic741$;
    private static final SubLSymbol $ic742$;
    private static final SubLSymbol $ic743$;
    private static final SubLSymbol $ic744$;
    private static final SubLString $ic745$;
    private static final SubLString $ic746$;
    
    
    public static SubLObject f46588() {
        module0751.$g5997$.setGlobalValue(module0228.f15229((SubLObject)module0751.$ic7$));
        return module0751.$g5997$.getGlobalValue();
    }
    
    public static SubLObject f46589() {
        if (module0751.NIL == module0751.$g5997$.getGlobalValue()) {
            f46588();
        }
        return module0751.$g5997$.getGlobalValue();
    }
    
    public static SubLObject f46590() {
        if (module0751.NIL != module0035.f2370((SubLObject)module0751.$ic9$, module0751.$g5998$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED)) {
            module0131.f8543();
        }
        else {
            module0131.f8544();
        }
        return module0131.f8542();
    }
    
    public static SubLObject f46591(final SubLObject var1) {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0054.f3959(module0751.$g5999$.getDynamicValue(var2))) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic12$, var1, module0751.$g5999$.getDynamicValue(var2));
            }
            module0054.f3973(var1, module0751.$g5999$.getDynamicValue(var2));
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic13$, module0751.$g5999$.getDynamicValue(var2));
            }
        }
        return module0751.$g5999$.getDynamicValue(var2);
    }
    
    public static SubLObject f46592() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0054.f3959(module0751.$g5999$.getDynamicValue(var2))) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic15$, module0751.$g5999$.getDynamicValue(var2));
            }
            module0054.f3974(module0751.$g5999$.getDynamicValue(var2));
            if (module0751.NIL != module0054.f3970(module0751.$g5999$.getDynamicValue(var2))) {
                f46593(module0751.$g5999$.getDynamicValue(var2));
            }
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic13$, module0751.$g5999$.getDynamicValue(var2));
            }
        }
        return module0751.$g5999$.getDynamicValue(var2);
    }
    
    public static SubLObject f46593(final SubLObject var3) {
        module0055.f4021(var3, module0751.$g6000$.getGlobalValue());
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46594() {
        return module0055.f4023(module0751.$g6000$.getGlobalValue());
    }
    
    public static SubLObject f46595() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0054.f3959(module0751.$g5999$.getDynamicValue(var2))) {
            return module0751.$g5999$.getDynamicValue(var2);
        }
        final SubLObject var3 = f46594();
        return (module0751.NIL != var3) ? var3 : module0054.f3968();
    }
    
    public static SubLObject f46596(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic17$);
        var9 = var8.first();
        final SubLObject var10;
        var8 = (var10 = var8.rest());
        return (SubLObject)ConsesLow.list((SubLObject)module0751.$ic18$, (SubLObject)module0751.$ic19$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic10$, var9), reader.bq_cons((SubLObject)module0751.$ic20$, ConsesLow.append(var10, (SubLObject)module0751.$ic21$)));
    }
    
    public static SubLObject f46597(final SubLObject var10) {
        final SubLThread var11 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
            PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic22$, var10, module0751.$g5999$.getDynamicValue(var11));
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0054.f3959(module0751.$g5999$.getDynamicValue(var11)) && module0751.NIL != module0054.f3979(var10, module0751.$g5999$.getDynamicValue(var11), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f46598(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11 == module0751.T || module0751.NIL != module0580.f35533(var11));
    }
    
    public static SubLObject f46599() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0579.$g4254$.getDynamicValue(var2);
    }
    
    public static SubLObject f46600() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0035.sublisp_boolean(module0579.$g4255$.getDynamicValue(var2));
    }
    
    public static SubLObject f46601(final SubLObject var12) {
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic23$, f46599(), var12);
        }
        module0579.$g4254$.setDynamicValue(var12);
        return f46599();
    }
    
    public static SubLObject f46602(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic24$);
        final SubLObject var9 = var8.rest();
        var8 = var8.first();
        SubLObject var10 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic24$);
        var10 = var8.first();
        var8 = var8.rest();
        if (module0751.NIL == var8) {
            final SubLObject var11;
            var8 = (var11 = var9);
            return (SubLObject)ConsesLow.listS((SubLObject)module0751.$ic18$, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0751.$ic25$, var10)), ConsesLow.append(var11, (SubLObject)module0751.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0751.$ic24$);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46603(final SubLObject var17) {
        if (f46599().isList()) {
            SubLObject var18 = (SubLObject)module0751.NIL;
            if (module0751.NIL != module0202.f12590(var17)) {
                SubLObject var19 = f46599();
                SubLObject var20 = (SubLObject)module0751.NIL;
                var20 = var19.first();
                while (module0751.NIL != var19) {
                    if (var20.isInteger()) {
                        SubLObject var18_19 = module0035.f2030(module0303.f20123(var20), var17, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                        SubLObject var21 = (SubLObject)module0751.NIL;
                        var21 = var18_19.first();
                        while (module0751.NIL != var18_19) {
                            var18 = (SubLObject)ConsesLow.cons(var21, var18);
                            var18_19 = var18_19.rest();
                            var21 = var18_19.first();
                        }
                    }
                    else if (var20.isList()) {
                        final SubLObject var22 = var20.first();
                        final SubLObject var23 = var20.rest();
                        SubLObject var18_20 = module0035.f2030(module0303.f20123(var22), var17, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                        SubLObject var24 = (SubLObject)module0751.NIL;
                        var24 = var18_20.first();
                        while (module0751.NIL != var18_20) {
                            if (var24.isCons()) {
                                var18 = (SubLObject)ConsesLow.cons(ConsesLow.append(var24, var23), var18);
                            }
                            else {
                                var18 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var24, var23), var18);
                            }
                            var18_20 = var18_20.rest();
                            var24 = var18_20.first();
                        }
                    }
                    var19 = var19.rest();
                    var20 = var19.first();
                }
            }
            else if (module0751.NIL != Sequences.find(var17, f46599(), (SubLObject)module0751.EQL, (SubLObject)module0751.$ic26$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                var18 = (SubLObject)module0751.T;
            }
            else if (module0751.NIL != module0304.f20296(var17)) {
                SubLObject var19 = f46599();
                SubLObject var20 = (SubLObject)module0751.NIL;
                var20 = var19.first();
                while (module0751.NIL != var19) {
                    if (var20.isList() && var17.eql(f46604(var20))) {
                        final SubLObject var25 = var20.rest();
                        final SubLObject var26 = (module0751.NIL != module0035.f1997(var25)) ? var25.first() : var25;
                        var18 = (SubLObject)ConsesLow.cons(var26, var18);
                    }
                    var19 = var19.rest();
                    var20 = var19.first();
                }
            }
            if (!var18.equal(f46599()) && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic27$, f46599(), var18);
            }
            f46601(var18);
        }
        return f46599();
    }
    
    public static SubLObject f46605() {
        return Equality.eq(f46599(), (SubLObject)module0751.T);
    }
    
    public static SubLObject f46606(final SubLObject var25) {
        if (f46599().isList()) {
            return module0004.f104(var25, f46599(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        return module0035.sublisp_boolean(f46599());
    }
    
    public static SubLObject f46607(final SubLObject var25, SubLObject var26) {
        if (var26 == module0751.UNPROVIDED) {
            var26 = (SubLObject)module0751.NIL;
        }
        final SubLObject var27 = f46599();
        if (var27.isAtom()) {
            return var27;
        }
        if (module0751.NIL == var25) {
            return var27;
        }
        if (module0751.NIL != conses_high.member(var25, var27, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        SubLObject var28 = (SubLObject)module0751.NIL;
        SubLObject var29 = var27;
        SubLObject var30 = (SubLObject)module0751.NIL;
        var30 = var29.first();
        while (module0751.NIL != var29) {
            if (var30.isCons() && var30.first().eql(var25)) {
                final SubLObject var31 = var30.rest();
                var28 = (SubLObject)ConsesLow.cons((module0751.NIL != module0035.f1997(var31)) ? var31.first() : var31, var28);
            }
            var29 = var29.rest();
            var30 = var29.first();
        }
        if (module0751.NIL == var28 && module0751.NIL != var26) {
            var28 = f46608(module0205.f13134(var26, var25, (SubLObject)module0751.UNPROVIDED), module0205.f13207(var26, (SubLObject)module0751.UNPROVIDED));
        }
        return var28;
    }
    
    public static SubLObject f46609(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic28$);
        final SubLObject var9 = var8.rest();
        var8 = var8.first();
        SubLObject var10 = (SubLObject)module0751.NIL;
        SubLObject var11 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic28$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic28$);
        var11 = var8.first();
        var8 = var8.rest();
        if (module0751.NIL == var8) {
            final SubLObject var12;
            var8 = (var12 = var9);
            return (SubLObject)ConsesLow.listS((SubLObject)module0751.$ic29$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic30$, var10, var11), ConsesLow.append(var12, (SubLObject)module0751.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0751.$ic28$);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46608(final SubLObject var32, final SubLObject var33) {
        if (module0751.NIL != module0035.f1993(var33, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.NIL;
        }
        return f46610(f46611(var32), Mapping.mapcar((SubLObject)module0751.$ic31$, var33));
    }
    
    public static SubLObject f46612(final SubLObject var32, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0202.f12590(var32)) {
            SubLObject var35 = (SubLObject)module0751.NIL;
            SubLObject var36 = var33;
            SubLObject var37 = (SubLObject)module0751.NIL;
            var37 = var36.first();
            while (module0751.NIL != var36) {
                if (module0751.NIL != assertion_handles_oc.f11035(var37)) {
                    var37 = f46613(var37);
                }
                if (module0751.NIL != module0202.f12590(var37) && !var37.equal(var32) && module0751.NIL == f46614(var37)) {
                    SubLObject var18_36;
                    final SubLObject var38 = var18_36 = f46615(f46616(var32, var37), var32);
                    SubLObject var39 = (SubLObject)module0751.NIL;
                    var39 = var18_36.first();
                    while (module0751.NIL != var18_36) {
                        var35 = (SubLObject)ConsesLow.cons(var39, var35);
                        var18_36 = var18_36.rest();
                        var39 = var18_36.first();
                    }
                }
                var36 = var36.rest();
                var37 = var36.first();
            }
            var35 = f46617(var35);
            return var35;
        }
        if (module0751.NIL != module0173.f10955(var32)) {
            SubLObject var35 = (SubLObject)module0751.NIL;
            final SubLObject var40 = module0579.$g4259$.currentBinding(var34);
            try {
                module0579.$g4259$.bind((SubLObject)module0751.$ic33$, var34);
                final SubLObject var41 = module0767.f48860(var32, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                var35 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != var41 && module0751.NIL != module0004.f104(module0756.f47713(var41, (SubLObject)module0751.UNPROVIDED), Mapping.mapcar((SubLObject)module0751.$ic34$, module0035.remove_if_not((SubLObject)module0751.$ic35$, Sequences.remove(var32, var33, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)), Symbols.symbol_function((SubLObject)module0751.EQUALP), (SubLObject)module0751.$ic36$));
            }
            finally {
                module0579.$g4259$.rebind(var40, var34);
            }
            return var35;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46610(final SubLObject var32, final SubLObject var33) {
        final SubLThread var34 = SubLProcess.currentSubLThread();
        final SubLObject var35 = module0034.$g879$.getDynamicValue(var34);
        SubLObject var36 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var35) {
            return f46612(var32, var33);
        }
        var36 = module0034.f1857(var35, (SubLObject)module0751.$ic32$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var36) {
            var36 = module0034.f1807(module0034.f1842(var35), (SubLObject)module0751.$ic32$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var35, (SubLObject)module0751.$ic32$, var36);
        }
        final SubLObject var37 = module0034.f1782(var32, var33);
        final SubLObject var38 = module0034.f1814(var36, var37, (SubLObject)module0751.UNPROVIDED);
        if (var38 != module0751.$ic37$) {
            SubLObject var39 = var38;
            SubLObject var40 = (SubLObject)module0751.NIL;
            var40 = var39.first();
            while (module0751.NIL != var39) {
                SubLObject var41 = var40.first();
                final SubLObject var42 = conses_high.second(var40);
                if (var32.equal(var41.first())) {
                    var41 = var41.rest();
                    if (module0751.NIL != var41 && module0751.NIL == var41.rest() && var33.equal(var41.first())) {
                        return module0034.f1959(var42);
                    }
                }
                var39 = var39.rest();
                var40 = var39.first();
            }
        }
        final SubLObject var43 = Values.arg2(var34.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46612(var32, var33)));
        module0034.f1836(var36, var37, var38, var43, (SubLObject)ConsesLow.list(var32, var33));
        return module0034.f1959(var43);
    }
    
    public static SubLObject f46617(final SubLObject var48) {
        SubLObject var49 = (SubLObject)module0751.NIL;
        SubLObject var50 = Sequences.delete_duplicates(var48, Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        SubLObject var51 = (SubLObject)module0751.NIL;
        var51 = var50.first();
        while (module0751.NIL != var50) {
            SubLObject var52 = (SubLObject)module0751.NIL;
            if (module0751.NIL == var52) {
                SubLObject var53 = Sequences.remove(var51, var48, Symbols.symbol_function((SubLObject)module0751.EQL), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                SubLObject var54 = (SubLObject)module0751.NIL;
                var54 = var53.first();
                while (module0751.NIL == var52 && module0751.NIL != var53) {
                    if (module0751.NIL != f46618(var54, var51, (SubLObject)module0751.UNPROVIDED)) {
                        var52 = (SubLObject)module0751.T;
                    }
                    var53 = var53.rest();
                    var54 = var53.first();
                }
            }
            if (module0751.NIL == var52) {
                var49 = (SubLObject)ConsesLow.cons(var51, var49);
            }
            var50 = var50.rest();
            var51 = var50.first();
        }
        return var49;
    }
    
    public static SubLObject f46618(final SubLObject var54, final SubLObject var55, SubLObject var56) {
        if (var56 == module0751.UNPROVIDED) {
            var56 = (SubLObject)module0751.EQL;
        }
        if (var55.isList() && module0751.NIL == var54) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL == module0035.f2014(var54) || module0751.NIL == module0035.f2014(var55)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != module0035.f2004(var54, var55)) {
            return (SubLObject)module0751.NIL;
        }
        SubLObject var57 = (SubLObject)module0751.NIL;
        SubLObject var58 = (SubLObject)module0751.NIL;
        SubLObject var59 = (SubLObject)module0751.NIL;
        SubLObject var60 = (SubLObject)module0751.NIL;
        SubLObject var61 = (SubLObject)module0751.NIL;
        var59 = var54;
        var60 = var59.first();
        for (var61 = (SubLObject)module0751.ZERO_INTEGER; module0751.NIL == var57 && module0751.NIL != var59; var57 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var58), var59 = var59.rest(), var60 = var59.first(), var61 = Numbers.add((SubLObject)module0751.ONE_INTEGER, var61)) {
            final SubLObject var62 = ConsesLow.nth(var61, var55);
            final SubLObject var63 = var56;
            if (var63.eql((SubLObject)module0751.EQ)) {
                var58 = Equality.eq(var60, var62);
            }
            else if (var63.eql((SubLObject)module0751.EQL)) {
                var58 = Equality.eql(var60, var62);
            }
            else if (var63.eql((SubLObject)module0751.EQUAL)) {
                var58 = Equality.equal(var60, var62);
            }
            else if (var63.eql((SubLObject)module0751.EQUALP)) {
                var58 = Equality.equalp(var60, var62);
            }
            else {
                var58 = Functions.funcall(var56, var60, var62);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var57);
    }
    
    public static SubLObject f46619(final SubLObject var64, final SubLObject var20) {
        return var20.isList() ? module0035.f2037(var64, var20, (SubLObject)module0751.UNPROVIDED) : ConsesLow.nth(var20, var64);
    }
    
    public static SubLObject f46620(final SubLObject var64, final SubLObject var20, final SubLObject var24) {
        if (var20.isList()) {
            module0035.f2040(var64, var20, var24);
        }
        else {
            ConsesLow.set_nth(var20, var64, var24);
        }
        return var64;
    }
    
    public static SubLObject f46615(final SubLObject var65, final SubLObject var32) {
        SubLObject var66 = (SubLObject)module0751.NIL;
        SubLObject var67 = (SubLObject)module0751.NIL;
        SubLObject var68 = var65;
        SubLObject var69 = (SubLObject)module0751.NIL;
        var69 = var68.first();
        while (module0751.NIL != var68) {
            final SubLObject var70 = f46619(var32, var69);
            if (module0751.NIL == module0004.f104(var70, var67, Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED)) {
                var67 = (SubLObject)ConsesLow.cons(var70, var67);
                var66 = (SubLObject)ConsesLow.cons(var69, var66);
            }
            var68 = var68.rest();
            var69 = var68.first();
        }
        return Sequences.nreverse(var66);
    }
    
    public static SubLObject f46616(final SubLObject var69, final SubLObject var70) {
        SubLObject var71 = (SubLObject)module0751.NIL;
        SubLObject var72 = (SubLObject)module0751.NIL;
        SubLObject var73 = (SubLObject)module0751.NIL;
        SubLObject var74 = (SubLObject)module0751.NIL;
        var72 = var69;
        var73 = var72.first();
        for (var74 = (SubLObject)module0751.ZERO_INTEGER; module0751.NIL != var72; var72 = var72.rest(), var73 = var72.first(), var74 = Numbers.add((SubLObject)module0751.ONE_INTEGER, var74)) {
            final SubLObject var75 = module0205.f13134(var70, var74, (SubLObject)module0751.UNPROVIDED);
            if (!var73.equal(var75)) {
                if (module0751.NIL != module0202.f12590(var73) && module0751.NIL != module0202.f12590(var75)) {
                    SubLObject var76 = f46616(var73, var75);
                    SubLObject var77 = (SubLObject)module0751.NIL;
                    var77 = var76.first();
                    while (module0751.NIL != var76) {
                        if (var77.isInteger()) {
                            var71 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var74, var77), var71);
                        }
                        else {
                            var71 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var74, var77), var71);
                        }
                        var76 = var76.rest();
                        var77 = var76.first();
                    }
                }
                else {
                    var71 = (SubLObject)ConsesLow.cons(var74, var71);
                }
            }
        }
        return Sequences.nreverse(var71);
    }
    
    public static SubLObject f46621(final SubLObject var26, final SubLObject var76) {
        final SubLThread var77 = SubLProcess.currentSubLThread();
        SubLObject var78 = module0756.f47746();
        SubLObject var79 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var76) {
            var78 = var26;
        }
        else {
            try {
                var77.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var80 = Errors.$error_handler$.currentBinding(var77);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0751.$ic38$, var77);
                    try {
                        var78 = module0205.f13394(module0205.f13144(var26), var76, var78);
                    }
                    catch (Throwable var81) {
                        Errors.handleThrowable(var81, (SubLObject)module0751.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var80, var77);
                }
            }
            catch (Throwable var82) {
                var79 = Errors.handleThrowable(var82, module0003.$g3$.getGlobalValue());
            }
            finally {
                var77.throwStack.pop();
            }
        }
        if (module0751.NIL != var79 && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
            Errors.warn(var79);
        }
        return Values.values(var78, module0035.sublisp_boolean(var79));
    }
    
    public static SubLObject f46622() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (SubLObject)((module0751.NIL != f46606((SubLObject)module0751.ZERO_INTEGER)) ? module0751.ZERO_INTEGER : module0579.$g4280$.getDynamicValue(var2));
    }
    
    public static SubLObject f46623(final SubLObject var80, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        return (SubLObject)((module0751.NIL != module0212.f13762(var80) && module0751.NIL != module0222.f14635(module0751.$ic39$, var80, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED)) ? f46624(var80, var81) : module0751.NIL);
    }
    
    public static SubLObject f46625() {
        final SubLObject var82 = module0751.$g6001$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46626(final SubLObject var80, final SubLObject var81) {
        return module0034.f1829(module0751.$g6001$.getGlobalValue(), (SubLObject)ConsesLow.list(var80, var81), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46627(final SubLObject var80, final SubLObject var81) {
        final SubLObject var82 = (SubLObject)module0751.$ic41$;
        final SubLObject var83 = (SubLObject)module0751.$ic42$;
        final SubLObject var84 = f46628(var82, (SubLObject)ConsesLow.list(module0751.$ic39$, var80, var82), var81, var83);
        return module0549.f33908(var84, (SubLObject)module0751.$ic43$);
    }
    
    public static SubLObject f46624(final SubLObject var80, final SubLObject var81) {
        SubLObject var82 = module0751.$g6001$.getGlobalValue();
        if (module0751.NIL == var82) {
            var82 = module0034.f1934((SubLObject)module0751.$ic40$, (SubLObject)module0751.$ic44$, (SubLObject)module0751.$ic45$, (SubLObject)module0751.EQL, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        final SubLObject var83 = module0034.f1782(var80, var81);
        final SubLObject var84 = module0034.f1814(var82, var83, (SubLObject)module0751.UNPROVIDED);
        if (var84 != module0751.$ic37$) {
            SubLObject var85 = var84;
            SubLObject var86 = (SubLObject)module0751.NIL;
            var86 = var85.first();
            while (module0751.NIL != var85) {
                SubLObject var87 = var86.first();
                final SubLObject var88 = conses_high.second(var86);
                if (var80.eql(var87.first())) {
                    var87 = var87.rest();
                    if (module0751.NIL != var87 && module0751.NIL == var87.rest() && var81.eql(var87.first())) {
                        return module0034.f1959(var88);
                    }
                }
                var85 = var85.rest();
                var86 = var85.first();
            }
        }
        final SubLObject var89 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46627(var80, var81)));
        module0034.f1836(var82, var83, var84, var89, (SubLObject)ConsesLow.list(var80, var81));
        return module0034.f1959(var89);
    }
    
    public static SubLObject f46629(final SubLObject var80, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = (SubLObject)module0751.NIL;
        final SubLObject var84 = module0147.f9540(var81);
        final SubLObject var85 = module0147.$g2095$.currentBinding(var82);
        final SubLObject var86 = module0147.$g2094$.currentBinding(var82);
        final SubLObject var87 = module0147.$g2096$.currentBinding(var82);
        try {
            module0147.$g2095$.bind(module0147.f9545(var84), var82);
            module0147.$g2094$.bind(module0147.f9546(var84), var82);
            module0147.$g2096$.bind(module0147.f9549(var84), var82);
            var83 = module0219.f14510(var80, (SubLObject)module0751.ONE_INTEGER, module0751.$ic46$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var87, var82);
            module0147.$g2094$.rebind(var86, var82);
            module0147.$g2095$.rebind(var85, var82);
        }
        return var83;
    }
    
    public static SubLObject f46630(final SubLObject var68, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = (SubLObject)module0751.NIL;
        final SubLObject var84 = module0147.f9540(var81);
        final SubLObject var85 = module0147.$g2095$.currentBinding(var82);
        final SubLObject var86 = module0147.$g2094$.currentBinding(var82);
        final SubLObject var87 = module0147.$g2096$.currentBinding(var82);
        try {
            module0147.$g2095$.bind(module0147.f9545(var84), var82);
            module0147.$g2094$.bind(module0147.f9546(var84), var82);
            module0147.$g2096$.bind(module0147.f9549(var84), var82);
            var83 = module0219.f14510(var68, (SubLObject)module0751.ONE_INTEGER, module0751.$ic47$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var87, var82);
            module0147.$g2094$.rebind(var86, var82);
            module0147.$g2095$.rebind(var85, var82);
        }
        return var83;
    }
    
    public static SubLObject f46631(final SubLObject var68, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = (SubLObject)module0751.NIL;
        final SubLObject var84 = module0147.f9540(var81);
        final SubLObject var85 = module0147.$g2095$.currentBinding(var82);
        final SubLObject var86 = module0147.$g2094$.currentBinding(var82);
        final SubLObject var87 = module0147.$g2096$.currentBinding(var82);
        try {
            module0147.$g2095$.bind(module0147.f9545(var84), var82);
            module0147.$g2094$.bind(module0147.f9546(var84), var82);
            module0147.$g2096$.bind(module0147.f9549(var84), var82);
            var83 = module0219.f14510(var68, (SubLObject)module0751.ONE_INTEGER, module0751.$ic48$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        finally {
            module0147.$g2096$.rebind(var87, var82);
            module0147.$g2094$.rebind(var86, var82);
            module0147.$g2095$.rebind(var85, var82);
        }
        return var83;
    }
    
    public static SubLObject f46632(final SubLObject var93) {
        return module0220.f14565(var93, module0751.$ic49$, module0732.f44992(module0751.$ic49$), (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46633(final SubLObject var94) {
        return module0754.f47343(var94, module0751.$ic50$, (SubLObject)module0751.$ic51$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46634(final SubLObject var94) {
        return module0754.f47343(var94, module0751.$ic52$, (SubLObject)module0751.$ic51$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46635(final SubLObject var94) {
        return module0754.f47343(var94, module0751.$ic53$, (SubLObject)module0751.$ic51$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46636(final SubLObject var80, final SubLObject var95) {
        if (module0751.NIL == var80) {
            return (SubLObject)module0751.NIL;
        }
        SubLObject var96 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var96) {
            SubLObject var97 = var95;
            SubLObject var98 = (SubLObject)module0751.NIL;
            var98 = var97.first();
            while (module0751.NIL == var96 && module0751.NIL != var97) {
                if (var98.isCons() && module0751.NIL != conses_high.member(var80, module0035.remove_if_not((SubLObject)module0751.$ic56$, var98, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), Symbols.symbol_function((SubLObject)module0751.$ic57$), (SubLObject)module0751.UNPROVIDED)) {
                    var96 = Sequences.find_if(Symbols.symbol_function((SubLObject)module0751.$ic58$), var98, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                    if (module0751.NIL == var96) {
                        var96 = (SubLObject)module0751.$ic59$;
                    }
                }
                var97 = var97.rest();
                var98 = var97.first();
            }
        }
        return (SubLObject)((module0751.NIL != var96) ? ConsesLow.list(var96, (SubLObject)module0751.NIL) : module0751.NIL);
    }
    
    public static SubLObject f46637(final SubLObject var97, final SubLObject var94, SubLObject var80) {
        if (var80 == module0751.UNPROVIDED) {
            var80 = (SubLObject)module0751.NIL;
        }
        if (!var94.isString() || !var97.isCons()) {
            return var94;
        }
        final SubLObject var98 = f46638(var97, var94, var80);
        if (module0751.NIL != var98) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic60$, var98);
            }
        }
        else if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0751.$ic61$, var97);
        }
        return (module0751.NIL != module0038.f2716(var98)) ? var94 : Sequences.cconcatenate(var98, new SubLObject[] { module0751.$ic62$, var94 });
    }
    
    public static SubLObject f46639(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0004.f104(var32, module0751.$g6002$.getDynamicValue(var33), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            var34 = (SubLObject)module0751.T;
        }
        if (module0751.NIL == var34 && module0751.NIL != constant_handles_oc.f8463(var32, (SubLObject)module0751.UNPROVIDED)) {
            if (module0751.NIL != var32 && module0751.NIL != conses_high.member(var32, module0751.$g6003$.getDynamicValue(var33), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                var34 = (SubLObject)module0751.T;
            }
            if (module0751.NIL == var34) {
                final SubLObject var35 = module0147.f9540(module0579.$g4260$.getDynamicValue(var33));
                final SubLObject var36 = module0147.$g2095$.currentBinding(var33);
                final SubLObject var37 = module0147.$g2094$.currentBinding(var33);
                final SubLObject var38 = module0147.$g2096$.currentBinding(var33);
                try {
                    module0147.$g2095$.bind(module0147.f9545(var35), var33);
                    module0147.$g2094$.bind(module0147.f9546(var35), var33);
                    module0147.$g2096$.bind(module0147.f9549(var35), var33);
                    final SubLObject var39 = module0220.f14562(var32, module0751.$ic63$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                    if (module0751.NIL == var34) {
                        SubLObject var40;
                        SubLObject var41;
                        for (var40 = var39, var41 = (SubLObject)module0751.NIL, var41 = var40.first(); module0751.NIL == var34 && module0751.NIL != var40; var34 = f46640(var41, module0751.$ic50$, (SubLObject)module0751.UNPROVIDED), var40 = var40.rest(), var41 = var40.first()) {}
                    }
                }
                finally {
                    module0147.$g2096$.rebind(var38, var33);
                    module0147.$g2094$.rebind(var37, var33);
                    module0147.$g2095$.rebind(var36, var33);
                }
            }
        }
        return var34;
    }
    
    public static SubLObject f46641(final SubLObject var101) {
        return Sequences.find(var101, (SubLObject)module0751.$ic64$, Symbols.symbol_function((SubLObject)module0751.EQUALP), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46642(final SubLObject var101) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0728.f44431(var101) || var101.equalp((SubLObject)Characters.CHAR_y));
    }
    
    public static SubLObject f46643(final SubLObject var94) {
        if (module0751.NIL == module0038.f2653(var94)) {
            return (SubLObject)module0751.NIL;
        }
        final SubLObject var95 = Sequences.position_if(Symbols.symbol_function((SubLObject)module0751.$ic66$), var94, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        SubLObject var96 = Strings.string_downcase(var94, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        SubLObject var97 = (SubLObject)module0751.NIL;
        if (module0751.NIL != var95) {
            var96 = module0038.f2623(var96, var95, (SubLObject)module0751.UNPROVIDED);
        }
        final SubLObject var98 = module0035.position_if_not((SubLObject)module0751.$ic67$, var96, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var99 = (module0751.NIL != var98) ? var98 : Sequences.length(var96);
        if (var99.isPositive()) {
            final SubLObject var100 = reader.read_from_string(module0038.f2623(var96, (SubLObject)module0751.ZERO_INTEGER, var99), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            final SubLObject var101 = (SubLObject)(var100.isInteger() ? module0767.f48919(var100) : module0751.NIL);
            var96 = ((module0751.NIL != var101) ? var101 : var96);
        }
        if (module0751.NIL != module0038.f2685(var96, module0751.$g5989$.getGlobalValue())) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic68$, var96);
            }
            var97 = (SubLObject)module0751.$ic69$;
        }
        else if (module0751.NIL != module0038.f2685(var96, module0751.$g5990$.getGlobalValue())) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic70$, var96);
            }
            var97 = (SubLObject)module0751.$ic71$;
        }
        else if (module0751.NIL != module0038.f2685(var96, module0751.$g5991$.getGlobalValue())) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic72$, var96);
            }
            var97 = (SubLObject)module0751.$ic69$;
        }
        else if (module0751.NIL != module0038.f2684(var96, (SubLObject)module0751.$ic73$) && (module0751.NIL != module0038.f2806(var94) || module0751.NIL != conses_high.member(var96, module0751.$g6004$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED))) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic74$, var96);
            }
            var97 = (SubLObject)module0751.$ic69$;
        }
        if (module0751.NIL == var97) {
            final SubLObject var102 = Strings.sublisp_char(var96, (SubLObject)module0751.ZERO_INTEGER);
            final SubLObject var103 = (SubLObject)((module0751.NIL != module0035.f2002(var94, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED)) ? Strings.sublisp_char(var96, (SubLObject)module0751.ONE_INTEGER) : module0751.NIL);
            if (module0751.NIL != module0035.f2002(var94, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED) && module0751.NIL != module0728.f44427(var102, (SubLObject)module0751.UNPROVIDED)) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic75$, var94, var102);
                }
                var97 = (SubLObject)module0751.$ic71$;
            }
            else if (module0751.NIL == f46641(var102)) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic76$, var94, var102);
                }
                var97 = (SubLObject)module0751.$ic69$;
            }
            else if (module0751.NIL != module0035.f1995(var94, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED)) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic77$, var94, var102);
                }
                var97 = (SubLObject)module0751.$ic71$;
            }
            else if (module0751.NIL == module0728.f44427(var103, (SubLObject)module0751.T) && module0751.NIL == Sequences.find(var102, (SubLObject)module0751.$ic78$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic79$, var94, var103);
                }
                var97 = (SubLObject)module0751.$ic71$;
            }
            else if (module0751.NIL != f46641(var102) && module0751.NIL != f46644(var94) && module0751.NIL != module0035.f2012(f46645(var94, (SubLObject)module0751.NIL, (SubLObject)module0751.$ic80$, (SubLObject)module0751.T))) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic81$, var96, var102);
                }
                var97 = (SubLObject)module0751.$ic71$;
            }
            else {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic82$, var94);
                }
                var97 = (SubLObject)module0751.$ic69$;
            }
        }
        return Equality.eq(var97, (SubLObject)module0751.$ic71$);
    }
    
    public static SubLObject f46644(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = (SubLObject)module0751.NIL;
        final SubLObject var97 = module0580.f35545();
        final SubLObject var98 = module0034.$g879$.currentBinding(var95);
        try {
            module0034.$g879$.bind(var97, var95);
            SubLObject var99 = (SubLObject)module0751.NIL;
            if (module0751.NIL != var97 && module0751.NIL == module0034.f1842(var97)) {
                var99 = module0034.f1869(var97);
                final SubLObject var100 = Threads.current_process();
                if (module0751.NIL == var99) {
                    module0034.f1873(var97, var100);
                }
                else if (!var99.eql(var100)) {
                    Errors.error((SubLObject)module0751.$ic83$);
                }
            }
            try {
                var96 = module0731.f44813(var94, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                final SubLObject var38_114 = Threads.$is_thread_performing_cleanupP$.currentBinding(var95);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var95);
                    if (module0751.NIL != var97 && module0751.NIL == var99) {
                        module0034.f1873(var97, (SubLObject)module0751.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38_114, var95);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var98, var95);
        }
        return var96;
    }
    
    public static SubLObject f46645(final SubLObject var94, SubLObject var115, SubLObject var116, SubLObject var117) {
        if (var115 == module0751.UNPROVIDED) {
            var115 = (SubLObject)module0751.NIL;
        }
        if (var116 == module0751.UNPROVIDED) {
            var116 = (SubLObject)module0751.$ic80$;
        }
        if (var117 == module0751.UNPROVIDED) {
            var117 = (SubLObject)module0751.NIL;
        }
        final SubLThread var118 = SubLProcess.currentSubLThread();
        SubLObject var119 = (SubLObject)module0751.NIL;
        final SubLObject var120 = module0580.f35545();
        final SubLObject var121 = module0034.$g879$.currentBinding(var118);
        try {
            module0034.$g879$.bind(var120, var118);
            SubLObject var122 = (SubLObject)module0751.NIL;
            if (module0751.NIL != var120 && module0751.NIL == module0034.f1842(var120)) {
                var122 = module0034.f1869(var120);
                final SubLObject var123 = Threads.current_process();
                if (module0751.NIL == var122) {
                    module0034.f1873(var120, var123);
                }
                else if (!var122.eql(var123)) {
                    Errors.error((SubLObject)module0751.$ic83$);
                }
            }
            try {
                var119 = module0731.f44783(var94, var115, var116, var117, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                final SubLObject var38_118 = Threads.$is_thread_performing_cleanupP$.currentBinding(var118);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var118);
                    if (module0751.NIL != var120 && module0751.NIL == var122) {
                        module0034.f1873(var120, (SubLObject)module0751.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38_118, var118);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var121, var118);
        }
        return var119;
    }
    
    public static SubLObject f46646(final SubLObject var32) {
        return module0004.f104(var32, module0751.$g6005$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46647(final SubLObject var119) {
        return Equality.eq(var119, (SubLObject)Characters.CHAR_question);
    }
    
    public static SubLObject f46648(final SubLObject var94, SubLObject var120) {
        if (var120 == module0751.UNPROVIDED) {
            var120 = (SubLObject)module0751.NIL;
        }
        final SubLObject var121 = (SubLObject)Characters.CHAR_less;
        final SubLObject var122 = (SubLObject)Characters.CHAR_greater;
        if (module0751.NIL == module0581.f35648(var94) || module0751.NIL == module0581.f35674(var121, var94, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return var94;
        }
        SubLObject var123 = module0581.f35658(var94);
        SubLObject var124 = (SubLObject)module0751.NIL;
        SubLObject var125 = (SubLObject)module0751.ZERO_INTEGER;
        for (SubLObject var126 = var94, var127 = (SubLObject)(var126.isList() ? module0751.NIL : Sequences.length(var126)), var128 = (SubLObject)module0751.ZERO_INTEGER, var129 = module0005.f149(var128, var127, var126); module0751.NIL == var129; var129 = module0005.f149(var128, var127, var126)) {
            final SubLObject var130 = module0005.f150(var128, var126);
            if (!var128.isInteger() || !var128.numL((SubLObject)module0751.ZERO_INTEGER)) {
                if (!module0751.NIL.isInteger() || !var128.isInteger() || !var128.numGE((SubLObject)module0751.NIL)) {
                    final SubLObject var131 = var130.isChar() ? var130 : module0581.f35660(var130);
                    if (module0751.NIL != module0581.f35676(var131, var121) && module0751.NIL != f46649(var94, var128) && (module0751.NIL == var120 || module0751.NIL != f46650(var94, var128))) {
                        var124 = (SubLObject)module0751.T;
                    }
                    else if (module0751.NIL != var124 && module0751.NIL != module0581.f35676(var131, var122)) {
                        var124 = (SubLObject)module0751.NIL;
                    }
                    else if (module0751.NIL == var124) {
                        module0581.f35677(var125, var123, var131, (SubLObject)module0751.NIL);
                        var125 = Numbers.add(var125, (SubLObject)module0751.ONE_INTEGER);
                    }
                }
            }
            var126 = module0005.f151(var126);
            var128 = Numbers.add(var128, (SubLObject)module0751.ONE_INTEGER);
        }
        var123 = module0581.f35679(var123, (SubLObject)module0751.ZERO_INTEGER, var125);
        return var123;
    }
    
    public static SubLObject f46649(final SubLObject var94, final SubLObject var131) {
        final SubLObject var132 = (SubLObject)SubLObjectFactory.makeBoolean(var131.isPositive() && Characters.CHAR_hash.eql(module0581.f35671(var94, module0048.f_1_(var131))));
        final SubLObject var133 = module0581.f35679(var94, var131, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL != var132) {
            return (SubLObject)module0751.NIL;
        }
        SubLObject var134 = module0579.$g4244$.getGlobalValue();
        SubLObject var135 = (SubLObject)module0751.NIL;
        var135 = var134.first();
        while (module0751.NIL != var134) {
            if (module0751.NIL != module0581.f35655(var133, var135, (SubLObject)module0751.UNPROVIDED)) {
                return (SubLObject)module0751.T;
            }
            var134 = var134.rest();
            var135 = var134.first();
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46650(final SubLObject var94, final SubLObject var131) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Strings.sublisp_char(var94, module0048.f_1X(var131)).equalp((SubLObject)Characters.CHAR_a) || Strings.sublisp_char(var94, Numbers.add((SubLObject)module0751.TWO_INTEGER, var131)).equalp((SubLObject)Characters.CHAR_a));
    }
    
    public static SubLObject f46651(SubLObject var94) {
        SubLObject var96;
        final SubLObject var95 = var96 = f46652(var94);
        SubLObject var97 = (SubLObject)module0751.NIL;
        var97 = var96.first();
        while (module0751.NIL != var96) {
            SubLObject var99;
            final SubLObject var98 = var99 = var97;
            SubLObject var100 = (SubLObject)module0751.NIL;
            SubLObject var101 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var99, var98, (SubLObject)module0751.$ic85$);
            var100 = var99.first();
            var99 = (var101 = var99.rest());
            final SubLObject var102 = module0038.f2623(var94, var100, module0048.f_1X(var101));
            var94 = module0038.f2699(module0642.f39017(var102, (SubLObject)module0751.T), var102, var94, (SubLObject)module0751.EQUAL);
            var96 = var96.rest();
            var97 = var96.first();
        }
        return var94;
    }
    
    public static SubLObject f46652(final SubLObject var94) {
        final SubLObject var95 = (SubLObject)Characters.CHAR_less;
        final SubLObject var96 = (SubLObject)Characters.CHAR_greater;
        if (!var94.isString() || module0751.NIL == Sequences.find(var95, var94, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.NIL;
        }
        SubLObject var97 = (SubLObject)module0751.NIL;
        SubLObject var98 = (SubLObject)module0751.NIL;
        for (SubLObject var99 = var94, var100 = (SubLObject)(var99.isList() ? module0751.NIL : Sequences.length(var99)), var101 = (SubLObject)module0751.ZERO_INTEGER, var102 = module0005.f149(var101, var100, var99); module0751.NIL == var102; var102 = module0005.f149(var101, var100, var99)) {
            final SubLObject var103 = module0005.f150(var101, var99);
            if (!var101.isInteger() || !var101.numL((SubLObject)module0751.ZERO_INTEGER)) {
                if (!module0751.NIL.isInteger() || !var101.isInteger() || !var101.numGE((SubLObject)module0751.NIL)) {
                    final SubLObject var104 = var103.isChar() ? var103 : module0581.f35660(var103);
                    if (module0751.NIL != module0581.f35676(var104, var95) && module0751.NIL == f46649(var94, var101)) {
                        var97 = var101;
                    }
                    else if (module0751.NIL != var97 && module0751.NIL != module0581.f35676(var104, var96)) {
                        var98 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var97, var101), var98);
                        var97 = (SubLObject)module0751.NIL;
                    }
                }
            }
            var99 = module0005.f151(var99);
            var101 = Numbers.add(var101, (SubLObject)module0751.ONE_INTEGER);
        }
        return var98;
    }
    
    public static SubLObject f46653(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = var94;
        SubLObject var97 = module0038.$g916$.getGlobalValue();
        if (module0751.NIL != module0581.f35686(var96) && module0581.f35671(var96, (SubLObject)module0751.ZERO_INTEGER).eql((SubLObject)Characters.CHAR_less)) {
            final SubLObject var98 = module0581.f35674((SubLObject)Characters.CHAR_greater, var96, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            if (module0751.NIL != var98) {
                var97 = module0581.f35679(var96, (SubLObject)module0751.ZERO_INTEGER, module0048.f_1X(var98));
                var96 = module0581.f35679(var96, module0048.f_1X(var98), (SubLObject)module0751.UNPROVIDED);
                var95.resetMultipleValues();
                final SubLObject var99 = f46653(var96);
                final SubLObject var100 = var95.secondMultipleValue();
                var95.resetMultipleValues();
                var97 = module0581.f35665(var97, var100);
                var96 = var99;
            }
        }
        return Values.values(var96, var97);
    }
    
    public static SubLObject f46638(final SubLObject var97, final SubLObject var94, final SubLObject var80) {
        SubLObject var98 = Sequences.remove_if((SubLObject)module0751.$ic86$, var94, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var97) {
            return module0038.$g916$.getGlobalValue();
        }
        SubLObject var99 = (SubLObject)module0751.NIL;
        SubLObject var100 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var97, var97, (SubLObject)module0751.$ic87$);
        var99 = var97.first();
        SubLObject var101 = var97.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var101, var97, (SubLObject)module0751.$ic87$);
        var100 = var101.first();
        var101 = var101.rest();
        if (module0751.NIL != var101) {
            cdestructuring_bind.cdestructuring_bind_error(var97, (SubLObject)module0751.$ic87$);
            return (SubLObject)module0751.NIL;
        }
        if (var99 == module0751.$ic59$) {
            return module0038.$g916$.getGlobalValue();
        }
        if (module0751.NIL == var99 || module0751.NIL == module0581.f35686(var98)) {
            return module0038.$g916$.getGlobalValue();
        }
        var98 = module0581.f35688(f46653(var98));
        if (module0751.NIL != f46633(f46654(var98, (SubLObject)module0751.UNPROVIDED))) {
            return module0038.$g916$.getGlobalValue();
        }
        final SubLObject var102 = var99;
        if (var102.eql((SubLObject)module0751.$ic69$) || var102.eql((SubLObject)module0751.$ic71$) || var102.eql((SubLObject)module0751.$ic88$)) {
            return (SubLObject)((module0751.NIL != f46655(var80)) ? ((module0751.NIL != f46643(module0581.f35681(var98, (SubLObject)module0751.UNPROVIDED))) ? module0751.$ic89$ : module0751.$ic90$) : module0038.$g916$.getGlobalValue());
        }
        if (var102.eql((SubLObject)module0751.$ic91$) || var102.eql((SubLObject)module0751.$ic92$)) {
            return (SubLObject)((module0751.NIL != f46656(var98)) ? module0038.$g916$.getGlobalValue() : module0751.$ic93$);
        }
        if (var102.eql((SubLObject)module0751.$ic94$) || var102.eql((SubLObject)module0751.$ic95$)) {
            return (SubLObject)module0751.$ic96$;
        }
        if (var102.eql((SubLObject)module0751.$ic97$) || var102.eql((SubLObject)module0751.$ic98$)) {
            return (SubLObject)module0751.$ic99$;
        }
        if (var102.eql((SubLObject)module0751.$ic100$) || var102.eql((SubLObject)module0751.$ic101$)) {
            return (SubLObject)module0751.$ic102$;
        }
        if (var102.eql((SubLObject)module0751.$ic103$) || var102.eql((SubLObject)module0751.$ic104$)) {
            return (SubLObject)module0751.$ic105$;
        }
        if (var102.eql((SubLObject)module0751.$ic106$) || var102.eql((SubLObject)module0751.$ic107$)) {
            return (SubLObject)module0751.$ic108$;
        }
        if (var102.eql((SubLObject)module0751.$ic109$) || var102.eql((SubLObject)module0751.$ic110$)) {
            return (SubLObject)module0751.$ic111$;
        }
        if (var102.eql((SubLObject)module0751.$ic112$) || var102.eql((SubLObject)module0751.$ic113$)) {
            return (SubLObject)module0751.$ic114$;
        }
        if (var102.eql((SubLObject)module0751.$ic115$) || var102.eql((SubLObject)module0751.$ic116$)) {
            return (SubLObject)module0751.$ic117$;
        }
        if (var102.eql((SubLObject)module0751.$ic118$)) {
            return f46657(var99, var100, var80);
        }
        if (module0751.NIL != module0762.f48200(var99)) {
            return module0731.f44711(var99, module0751.$ic50$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED).first();
        }
        return module0038.$g916$.getGlobalValue();
    }
    
    public static SubLObject f46655(final SubLObject var80) {
        SubLObject var81 = (SubLObject)module0751.T;
        var81 = f46658(var80, module0751.$ic119$, (SubLObject)module0751.UNPROVIDED);
        return var81;
    }
    
    public static SubLObject f46654(final SubLObject var94, SubLObject var154) {
        if (var154 == module0751.UNPROVIDED) {
            var154 = (SubLObject)Characters.CHAR_space;
        }
        final SubLObject var155 = module0581.f35674(var154, var94, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var156 = module0581.f35679(var94, (SubLObject)module0751.ZERO_INTEGER, var155);
        final SubLObject var157 = var155.isInteger() ? module0581.f35679(var94, module0048.f_1X(var155), (SubLObject)module0751.UNPROVIDED) : module0038.$g916$.getGlobalValue();
        return Values.values(var156, var157);
    }
    
    public static SubLObject f46656(final SubLObject var94) {
        final SubLObject var95 = f46654(var94, (SubLObject)module0751.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0731.f44751(var95, (SubLObject)module0751.UNPROVIDED) && module0751.NIL != f46634(var95));
    }
    
    public static SubLObject f46659(final SubLObject var11) {
        return module0004.f104(var11, module0751.$g6006$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46660(final SubLObject var157, final SubLObject var158, SubLObject var159, SubLObject var160) {
        if (var159 == module0751.UNPROVIDED) {
            var159 = module0751.$ic119$;
        }
        if (var160 == module0751.UNPROVIDED) {
            var160 = (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != var158) {}
        if (module0751.NIL == var160) {
            if (module0751.NIL != f46661((SubLObject)module0751.UNPROVIDED) && module0751.NIL != var158 && var157.eql(module0754.f47301())) {
                return f46662(var158);
            }
            if (module0751.NIL != f46661((SubLObject)module0751.UNPROVIDED) && module0751.NIL != var158 && var157.eql(module0751.$ic121$)) {
                final SubLObject var161 = f46663(var158);
                if (module0751.NIL != module0762.f48210(var161)) {
                    return var161;
                }
            }
            else if (module0751.NIL != f46661((SubLObject)module0751.UNPROVIDED) && module0751.NIL != var158 && module0751.NIL != f46664(var157)) {
                final SubLObject var162 = f46665(var158);
                if (module0751.NIL != module0762.f48210(var162)) {
                    return var162;
                }
            }
        }
        if (module0751.NIL != f46605() && module0751.$ic122$ == var158 && module0751.NIL != f46658(module0751.$ic119$, var159, (SubLObject)module0751.UNPROVIDED)) {
            var159 = module0751.$ic119$;
        }
        final SubLObject var163 = (SubLObject)((var158 == module0751.$ic123$) ? module0751.NIL : var158);
        final SubLObject var164 = f46666(var157, var163, var159, var160);
        return f46667(var164, var158);
    }
    
    public static SubLObject f46668(final SubLObject var157, final SubLObject var158, SubLObject var159, SubLObject var160) {
        if (var159 == module0751.UNPROVIDED) {
            var159 = module0751.$ic119$;
        }
        if (var160 == module0751.UNPROVIDED) {
            var160 = (SubLObject)module0751.NIL;
        }
        final SubLThread var161 = SubLProcess.currentSubLThread();
        return (module0751.NIL != f46669(var157, module0751.$ic124$, module0579.$g4262$.getDynamicValue(var161))) ? module0202.f12768(module0751.$ic125$, (SubLObject)module0751.$ic126$, module0202.f12683(module0751.$ic127$, (SubLObject)ConsesLow.list(f46660(var157, var158, var159, var160), (SubLObject)module0751.$ic128$), (SubLObject)module0751.UNPROVIDED)) : module0202.f12768(module0751.$ic125$, (SubLObject)module0751.$ic126$, f46670(var158));
    }
    
    public static SubLObject f46664(final SubLObject var157) {
        return module0004.f104(var157, (SubLObject)module0751.$ic129$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46671(final SubLObject var157, final SubLObject var158, SubLObject var159) {
        if (var159 == module0751.UNPROVIDED) {
            var159 = module0751.$ic119$;
        }
        return f46672(f46660(var157, var158, var159, (SubLObject)module0751.UNPROVIDED), var157);
    }
    
    public static SubLObject f46662(final SubLObject var158) {
        SubLObject var159 = (SubLObject)module0751.NIL;
        if (var158.eql((SubLObject)module0751.$ic122$)) {
            var159 = (SubLObject)module0751.$ic130$;
        }
        else if (var158.eql((SubLObject)module0751.$ic131$)) {
            var159 = (SubLObject)module0751.$ic132$;
        }
        else if (var158.eql((SubLObject)module0751.$ic133$)) {
            var159 = (SubLObject)module0751.$ic134$;
        }
        else if (var158.eql((SubLObject)module0751.$ic135$) || var158.eql((SubLObject)module0751.$ic136$) || var158.eql((SubLObject)module0751.$ic137$)) {
            var159 = (SubLObject)module0751.$ic108$;
        }
        else if (var158.eql((SubLObject)module0751.$ic138$) || var158.eql((SubLObject)module0751.$ic123$) || var158.eql((SubLObject)module0751.$ic139$)) {
            var159 = (SubLObject)module0751.$ic140$;
        }
        else if (var158.eql((SubLObject)module0751.$ic141$)) {
            var159 = (SubLObject)module0751.$ic142$;
        }
        else if (var158.eql((SubLObject)module0751.$ic103$)) {
            var159 = (SubLObject)module0751.$ic143$;
        }
        else if (var158.eql((SubLObject)module0751.$ic144$)) {
            var159 = (SubLObject)module0751.$ic145$;
        }
        else {
            final SubLObject var160 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic148$) });
            module0578.f35476(var160, (SubLObject)ConsesLow.list(var158));
            var159 = (SubLObject)module0751.$ic132$;
        }
        SubLObject var161 = module0202.f12768(module0751.$ic125$, module0751.$ic149$, module0762.f48215(var159));
        final SubLObject var162 = constants_high_oc.f10737((SubLObject)module0751.$ic150$);
        if (module0751.NIL != constant_handles_oc.f8463(var162, (SubLObject)module0751.UNPROVIDED)) {
            var161 = module0202.f12768(var162, module0751.$ic151$, var161);
        }
        return var161;
    }
    
    public static SubLObject f46663(final SubLObject var158) {
        SubLObject var159 = (SubLObject)module0751.NIL;
        if (var158.eql((SubLObject)module0751.$ic122$)) {
            var159 = (SubLObject)module0751.$ic152$;
        }
        else if (var158.eql((SubLObject)module0751.$ic131$)) {
            var159 = (SubLObject)module0751.$ic153$;
        }
        else if (var158.eql((SubLObject)module0751.$ic141$)) {
            var159 = (SubLObject)module0751.$ic154$;
        }
        else if (var158.eql((SubLObject)module0751.$ic103$)) {
            var159 = (SubLObject)module0751.$ic155$;
        }
        else if (var158.eql((SubLObject)module0751.$ic144$)) {
            var159 = (SubLObject)module0751.$ic156$;
        }
        if (module0751.NIL != f46673(var158)) {
            var159 = (SubLObject)module0751.$ic157$;
            return module0202.f12768(module0751.$ic125$, module0751.$ic149$, module0762.f48215(var159));
        }
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0751.$ic158$, var158);
        }
        return (SubLObject)module0751.$ic159$;
    }
    
    public static SubLObject f46665(final SubLObject var158) {
        SubLObject var159 = (SubLObject)module0751.NIL;
        if (var158.eql((SubLObject)module0751.$ic122$)) {
            var159 = (SubLObject)module0751.$ic160$;
        }
        else if (var158.eql((SubLObject)module0751.$ic131$)) {
            var159 = (SubLObject)module0751.$ic161$;
        }
        else if (var158.eql((SubLObject)module0751.$ic141$)) {
            var159 = (SubLObject)module0751.$ic162$;
        }
        else if (var158.eql((SubLObject)module0751.$ic103$)) {
            var159 = (SubLObject)module0751.$ic163$;
        }
        else {
            if (!var158.eql((SubLObject)module0751.$ic144$)) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0751.$ic165$, var158);
                }
                return (SubLObject)module0751.$ic159$;
            }
            var159 = (SubLObject)module0751.$ic164$;
        }
        return module0202.f12768(module0751.$ic125$, module0751.$ic149$, module0762.f48215(var159));
    }
    
    public static SubLObject f46673(final SubLObject var170) {
        return module0004.f104(var170, module0751.$g6007$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46667(final SubLObject var171, final SubLObject var158) {
        if (module0751.NIL != var158) {}
        final SubLObject var172 = f46670(var158);
        return (SubLObject)((module0751.NIL != var172) ? ConsesLow.list(module0751.$ic167$, var172, var171) : var171);
    }
    
    public static SubLObject f46670(final SubLObject var158) {
        if (var158.eql((SubLObject)module0751.$ic122$)) {
            return (SubLObject)module0751.$ic168$;
        }
        if (var158.eql((SubLObject)module0751.$ic131$)) {
            return (SubLObject)module0751.$ic169$;
        }
        if (var158.eql((SubLObject)module0751.$ic133$)) {
            return (SubLObject)module0751.$ic170$;
        }
        if (var158.eql((SubLObject)module0751.$ic144$)) {
            return (SubLObject)module0751.$ic171$;
        }
        if (var158.eql((SubLObject)module0751.$ic141$)) {
            return (SubLObject)module0751.$ic172$;
        }
        if (var158.eql((SubLObject)module0751.$ic103$)) {
            return (SubLObject)module0751.$ic173$;
        }
        if (var158.eql((SubLObject)module0751.$ic135$)) {
            return (SubLObject)module0751.$ic174$;
        }
        if (var158.eql((SubLObject)module0751.$ic136$)) {
            return (SubLObject)module0751.$ic175$;
        }
        if (var158.eql((SubLObject)module0751.$ic137$)) {
            return (SubLObject)module0751.$ic176$;
        }
        if (var158.eql((SubLObject)module0751.$ic138$)) {
            return (SubLObject)module0751.$ic177$;
        }
        if (var158.eql((SubLObject)module0751.$ic123$)) {
            return (SubLObject)module0751.$ic178$;
        }
        if (var158.eql((SubLObject)module0751.$ic139$)) {
            return (SubLObject)module0751.$ic179$;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46674(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        return (module0751.NIL != module0219.f14510(module0751.$ic180$, (SubLObject)module0751.FOUR_INTEGER, module0751.$ic49$, module0579.$g4260$.getDynamicValue(var172), (SubLObject)module0751.UNPROVIDED)) ? module0751.$ic180$ : module0751.$ic181$;
    }
    
    public static SubLObject f46675(final SubLObject var171) {
        final SubLThread var172 = SubLProcess.currentSubLThread();
        return (module0751.NIL != module0219.f14510(module0751.$ic182$, (SubLObject)module0751.FOUR_INTEGER, module0751.$ic49$, module0579.$g4260$.getDynamicValue(var172), (SubLObject)module0751.UNPROVIDED)) ? module0751.$ic182$ : module0751.$ic183$;
    }
    
    public static SubLObject f46676(final SubLObject var68) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0202.f12658(var68) && module0205.f13364(var68).eql(module0751.$ic184$));
    }
    
    public static SubLObject f46677(final SubLObject var172) {
        return module0202.f12643(module0751.$ic184$, var172);
    }
    
    public static SubLObject f46666(final SubLObject var157, SubLObject var158, SubLObject var159, SubLObject var173) {
        if (var158 == module0751.UNPROVIDED) {
            var158 = (SubLObject)module0751.NIL;
        }
        if (var159 == module0751.UNPROVIDED) {
            var159 = module0751.$ic119$;
        }
        if (var173 == module0751.UNPROVIDED) {
            var173 = (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != var158) {}
        final SubLObject var174 = f46678();
        SubLObject var175 = (SubLObject)module0751.NIL;
        if (module0751.NIL != f46605() && module0751.NIL != f46676(var157)) {
            var175 = f46679(var159, var174, var158);
        }
        else if (module0751.NIL != module0201.f12546(var157)) {
            var175 = f46679(var159, var174, var158);
        }
        else if (var158 == module0751.$ic123$) {
            final SubLObject var176 = f46666(var157, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            final SubLObject var177 = f46667(var176, var158);
            final SubLObject var178 = var175 = f46680(var159, var177);
        }
        else {
            var175 = (SubLObject)ConsesLow.list(module0751.$ic185$, var159, var174);
        }
        if (module0751.NIL != var173) {
            var175 = (SubLObject)ConsesLow.list(module0751.$ic127$, (SubLObject)module0751.$ic186$, (SubLObject)ConsesLow.list(module0751.$ic187$, var175));
        }
        return (SubLObject)ConsesLow.list(module0751.$ic125$, (SubLObject)module0751.$ic7$, var175);
    }
    
    public static SubLObject f46681(final SubLObject var157, SubLObject var158, SubLObject var159, SubLObject var173) {
        if (var158 == module0751.UNPROVIDED) {
            var158 = (SubLObject)module0751.NIL;
        }
        if (var159 == module0751.UNPROVIDED) {
            var159 = module0751.$ic119$;
        }
        if (var173 == module0751.UNPROVIDED) {
            var173 = (SubLObject)module0751.NIL;
        }
        return f46672(f46666(var157, var158, var159, var173), var157);
    }
    
    public static SubLObject f46679(SubLObject var159, final SubLObject var157, final SubLObject var158) {
        if (module0751.NIL == f46658(var159, module0751.$ic188$, (SubLObject)module0751.UNPROVIDED)) {
            var159 = module0751.$ic119$;
        }
        return f46680(var159, (SubLObject)ConsesLow.list(module0751.$ic125$, module0751.$ic189$, (SubLObject)ConsesLow.list(module0751.$ic185$, module0751.$ic119$, var157)));
    }
    
    public static SubLObject f46680(final SubLObject var159, final SubLObject var179) {
        return (SubLObject)ConsesLow.list(module0751.$ic127$, (SubLObject)ConsesLow.list(module0751.$ic187$, (SubLObject)ConsesLow.listS(module0751.$ic125$, var159, (SubLObject)module0751.$ic190$)), module0762.f48215((SubLObject)module0751.$ic191$), var179);
    }
    
    public static SubLObject f46657(final SubLObject var97, final SubLObject var153, final SubLObject var80) {
        if (var153 != module0751.$ic192$ || var97 != module0751.$ic118$) {
            return module0038.$g916$.getGlobalValue();
        }
        if (var80.eql(module0751.$ic193$)) {
            return (SubLObject)module0751.$ic194$;
        }
        if (var80.eql(module0751.$ic195$)) {
            return (SubLObject)module0751.$ic196$;
        }
        return module0038.$g916$.getGlobalValue();
    }
    
    public static SubLObject f46682(final SubLObject var180) {
        if (var180.isNumber() && var180.numE((SubLObject)module0751.ONE_INTEGER)) {
            return module0751.$ic119$;
        }
        if (module0751.NIL != module0337.f22630(var180, (SubLObject)module0751.$ic197$)) {
            return module0751.$ic119$;
        }
        return module0751.$ic198$;
    }
    
    public static SubLObject f46683(final SubLObject var180) {
        if (var180.isNumber()) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != module0172.f10917(var180) && module0751.NIL != conses_high.member(module0205.f13276(var180), (SubLObject)module0751.$ic199$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != f46684(var180, module0751.$ic200$, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46685() {
        final SubLObject var82 = module0751.$g6009$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46686() {
        return module0034.f1829(module0751.$g6009$.getGlobalValue(), (SubLObject)ConsesLow.list(module0751.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46687() {
        final SubLObject var181 = module0036.f2531(conses_high.copy_tree(module0751.$g6008$.getGlobalValue()), (SubLObject)module0751.$ic203$, (SubLObject)module0751.$ic204$, (SubLObject)module0751.UNPROVIDED);
        return Sequences.delete((SubLObject)module0751.NIL, var181, Symbols.symbol_function((SubLObject)module0751.EQ), Symbols.symbol_function((SubLObject)module0751.$ic205$), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46688() {
        SubLObject var182 = module0751.$g6009$.getGlobalValue();
        if (module0751.NIL == var182) {
            var182 = module0034.f1934((SubLObject)module0751.$ic202$, (SubLObject)module0751.$ic206$, (SubLObject)module0751.NIL, (SubLObject)module0751.EQL, (SubLObject)module0751.ZERO_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        SubLObject var183 = module0034.f1810(var182, (SubLObject)module0751.UNPROVIDED);
        if (var183 == module0751.$ic37$) {
            var183 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46687()));
            module0034.f1812(var182, var183, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var183);
    }
    
    public static SubLObject f46689(final SubLObject var184) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0751.ONE_INTEGER), f46690(var184, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f46690(final SubLObject var184, SubLObject var185) {
        if (var185 == module0751.UNPROVIDED) {
            var185 = f46691();
        }
        SubLObject var187;
        final SubLObject var186 = var187 = module0205.f13180(var184, (SubLObject)module0751.UNPROVIDED);
        SubLObject var188 = (SubLObject)module0751.NIL;
        SubLObject var189 = (SubLObject)module0751.NIL;
        SubLObject var190 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)module0751.$ic207$);
        var188 = var187.first();
        var187 = var187.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)module0751.$ic207$);
        var189 = var187.first();
        var187 = var187.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var187, var186, (SubLObject)module0751.$ic207$);
        var190 = var187.first();
        var187 = var187.rest();
        if (module0751.NIL == var187) {
            final SubLObject var191 = (SubLObject)((module0751.NIL != f46692(var188, (SubLObject)module0751.UNPROVIDED)) ? module0035.f2294(f46688(), var188, Symbols.symbol_function((SubLObject)module0751.$ic57$), (SubLObject)module0751.NIL) : module0751.NIL);
            final SubLObject var192 = (SubLObject)((module0751.NIL != var191) ? f46672(var191, var190) : module0751.NIL);
            final SubLObject var193 = f46693(var185, (SubLObject)module0751.$ic208$);
            final SubLObject var194 = (SubLObject)((module0751.NIL != var191) ? f46694(var191) : module0751.NIL);
            final SubLObject var195 = f46695(var194, var193);
            return Values.values(var189, var192, var195);
        }
        cdestructuring_bind.cdestructuring_bind_error(var186, (SubLObject)module0751.$ic207$);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46692(final SubLObject var80, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        return module0077.f5320(var80, f46696(var81));
    }
    
    public static SubLObject f46697() {
        final SubLObject var82 = module0751.$g6010$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46698(SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        return module0034.f1829(module0751.$g6010$.getGlobalValue(), (SubLObject)ConsesLow.list(var81), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46699(final SubLObject var81) {
        final SubLObject var82 = module0077.f5313((SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
        SubLObject var83 = f46688();
        SubLObject var84 = (SubLObject)module0751.NIL;
        var84 = var83.first();
        while (module0751.NIL != var83) {
            SubLObject var86;
            final SubLObject var85 = var86 = var84;
            SubLObject var87 = (SubLObject)module0751.NIL;
            SubLObject var88 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var86, var85, (SubLObject)module0751.$ic210$);
            var87 = var86.first();
            var86 = (var88 = var86.rest());
            module0078.f5374(module0260.f17034(var87, var81, (SubLObject)module0751.UNPROVIDED), var82);
            var83 = var83.rest();
            var84 = var83.first();
        }
        return var82;
    }
    
    public static SubLObject f46696(SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        SubLObject var82 = module0751.$g6010$.getGlobalValue();
        if (module0751.NIL == var82) {
            var82 = module0034.f1934((SubLObject)module0751.$ic209$, (SubLObject)module0751.$ic211$, (SubLObject)module0751.EIGHT_INTEGER, (SubLObject)module0751.EQUAL, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
            module0034.f1947((SubLObject)module0751.$ic212$);
        }
        SubLObject var83 = module0034.f1814(var82, var81, (SubLObject)module0751.$ic37$);
        if (var83 == module0751.$ic37$) {
            var83 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46699(var81)));
            module0034.f1816(var82, var81, var83, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var83);
    }
    
    public static SubLObject f46700() {
        final SubLObject var82 = module0751.$g6011$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46701(final SubLObject var198) {
        return module0034.f1829(module0751.$g6011$.getGlobalValue(), (SubLObject)ConsesLow.list(var198), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46702(final SubLObject var198) {
        if (module0751.NIL != f46703(var198)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != module0202.f12590(var198)) {
            return f46704(f46678(), var198, (SubLObject)module0751.UNPROVIDED);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46694(final SubLObject var198) {
        SubLObject var199 = module0751.$g6011$.getGlobalValue();
        if (module0751.NIL == var199) {
            var199 = module0034.f1934((SubLObject)module0751.$ic213$, (SubLObject)module0751.$ic214$, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        SubLObject var200 = module0034.f1814(var199, var198, (SubLObject)module0751.$ic37$);
        if (var200 == module0751.$ic37$) {
            var200 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46702(var198)));
            module0034.f1816(var199, var198, var200, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var200);
    }
    
    public static SubLObject f46704(final SubLObject var10, final SubLObject var180, SubLObject var56) {
        if (var56 == module0751.UNPROVIDED) {
            var56 = Symbols.symbol_function((SubLObject)module0751.EQL);
        }
        final SubLObject var181 = module0205.f13397(var10, var180, var56);
        final SubLObject var182 = (module0751.NIL != var181) ? var181.first() : f46705();
        return var182;
    }
    
    public static SubLObject f46706(final SubLObject var184, SubLObject var83, SubLObject var200) {
        if (var83 == module0751.UNPROVIDED) {
            var83 = (SubLObject)module0751.NIL;
        }
        if (var200 == module0751.UNPROVIDED) {
            var200 = (SubLObject)module0751.$ic215$;
        }
        final SubLThread var201 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0202.f12734(var184, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.UNPROVIDED)) {
            var201.resetMultipleValues();
            final SubLObject var202 = f46690(var184, (SubLObject)module0751.UNPROVIDED);
            final SubLObject var203 = var201.secondMultipleValue();
            final SubLObject var204 = var201.thirdMultipleValue();
            var201.resetMultipleValues();
            return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0201.f12546(var202) && (module0751.NIL == var83 || var202.eql(var83)) && module0751.NIL == module0765.f48631(var202) && module0751.NIL != Functions.funcall(var200, var203));
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46707(final SubLObject var189) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f46708(var189) && module0751.NIL == f46709(var189, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == module0775.f49726(var189, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f46708(final SubLObject var189) {
        return (SubLObject)SubLObjectFactory.makeBoolean((module0751.NIL != module0212.f13762(var189) || module0751.NIL != module0201.f12546(var189) || module0751.NIL != module0210.f13576(var189, (SubLObject)module0751.UNPROVIDED)) && module0751.NIL == module0754.f47357(var189));
    }
    
    public static SubLObject f46710(final SubLObject var202, final SubLObject var203, final SubLObject var94) {
        final SubLObject var204 = Sequences.cconcatenate((SubLObject)module0751.$ic216$, new SubLObject[] { module0006.f203((module0751.NIL != var203) ? var203 : module0765.f48516(var202)), module0751.$ic217$ });
        return Sequences.cconcatenate(var204, var94);
    }
    
    public static SubLObject f46711(final SubLObject var94) {
        if (module0751.NIL != module0581.f35673((SubLObject)module0751.$ic218$, var94)) {
            return f46712(var94);
        }
        return var94;
    }
    
    public static SubLObject f46713(SubLObject var94) {
        SubLObject var95 = (SubLObject)module0751.NIL;
        SubLObject var96 = (SubLObject)module0751.NIL;
        for (SubLObject var97 = var94, var98 = (SubLObject)(var97.isList() ? module0751.NIL : Sequences.length(var97)), var99 = (SubLObject)module0751.ZERO_INTEGER, var100 = module0005.f149(var99, var98, var97); module0751.NIL == var100; var100 = module0005.f149(var99, var98, var97)) {
            final SubLObject var101 = module0005.f150(var99, var97);
            if (!var99.isInteger() || !var99.numL((SubLObject)module0751.ZERO_INTEGER)) {
                if (!module0751.NIL.isInteger() || !var99.isInteger() || !var99.numGE((SubLObject)module0751.NIL)) {
                    final SubLObject var102 = var101.isChar() ? var101 : module0581.f35660(var101);
                    if (module0751.NIL != f46714(var102, var94, var99, var95)) {
                        var96 = (SubLObject)module0751.T;
                    }
                    else {
                        var95 = (SubLObject)ConsesLow.cons(var102, var95);
                    }
                }
            }
            var97 = module0005.f151(var97);
            var99 = Numbers.add(var99, (SubLObject)module0751.ONE_INTEGER);
        }
        if (module0751.NIL != var96) {
            final SubLObject var103 = var94 = module0581.f35667(Sequences.nreverse(var95));
        }
        return var94;
    }
    
    public static SubLObject f46712(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        final SubLObject var96 = module0034.$g879$.getDynamicValue(var95);
        SubLObject var97 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var96) {
            return f46713(var94);
        }
        var97 = module0034.f1857(var96, (SubLObject)module0751.$ic219$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var97) {
            var97 = module0034.f1807(module0034.f1842(var96), (SubLObject)module0751.$ic219$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic220$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var96, (SubLObject)module0751.$ic219$, var97);
        }
        SubLObject var98 = module0034.f1814(var97, var94, (SubLObject)module0751.$ic37$);
        if (var98 == module0751.$ic37$) {
            var98 = Values.arg2(var95.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46713(var94)));
            module0034.f1816(var97, var94, var98, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var98);
    }
    
    public static SubLObject f46714(final SubLObject var119, final SubLObject var94, final SubLObject var144, final SubLObject var211) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var119.eql((SubLObject)Characters.CHAR_space) && (module0751.NIL == var211 || module0751.NIL != f46715(var94, var144) || module0751.NIL != f46716(var94, var144)));
    }
    
    public static SubLObject f46715(final SubLObject var94, final SubLObject var144) {
        final SubLObject var145 = module0048.f_1X(var144);
        return f46717(var94, var145);
    }
    
    public static SubLObject f46717(final SubLObject var94, SubLObject var139) {
        if (var139 == module0751.UNPROVIDED) {
            var139 = (SubLObject)module0751.ZERO_INTEGER;
        }
        SubLObject var140 = module0035.f1995(var94, var139, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL != f46718(var94)) {
            var140 = (SubLObject)module0751.T;
        }
        else if (module0751.NIL == var140 && module0751.NIL == var140) {
            SubLObject var141;
            SubLObject var142;
            SubLObject var143;
            for (var141 = module0751.$g5995$.getGlobalValue(), var142 = (SubLObject)module0751.NIL, var142 = var141.first(); module0751.NIL == var140 && module0751.NIL != var141; var140 = (SubLObject)SubLObjectFactory.makeBoolean(module0038.f2636(var142).eql(module0581.f35671(var94, var139)) && module0751.NIL != module0035.f2000(var94, var143, (SubLObject)module0751.UNPROVIDED) && module0751.NIL != module0581.f35678(var142, var94, Symbols.symbol_function((SubLObject)module0751.EQUAL), var139, var143)), var141 = var141.rest(), var142 = var141.first()) {
                var143 = Numbers.add(var139, Sequences.length(var142));
            }
        }
        return var140;
    }
    
    public static SubLObject f46718(final SubLObject var94) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f46719(var94) || module0751.NIL != f46720(var94));
    }
    
    public static SubLObject f46719(final SubLObject var94) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var94.isString() && module0751.NIL != module0035.f1995(var94, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED) && module0751.NIL != Sequences.find(module0038.f2636(var94), (SubLObject)module0751.$ic221$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f46720(final SubLObject var94) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var94.isString() && module0751.NIL != module0035.f1995(var94, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED) && module0751.NIL != f46721(module0038.f2636(var94)));
    }
    
    public static SubLObject f46721(final SubLObject var119) {
        return Sequences.find(var119, (SubLObject)module0751.$ic222$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46716(final SubLObject var94, final SubLObject var144) {
        SubLObject var145 = (SubLObject)module0751.NIL;
        final SubLObject var146 = module0048.f_1_(var144);
        if (module0751.NIL == var145) {
            SubLObject var147;
            SubLObject var148;
            for (var147 = module0751.$g5996$.getGlobalValue(), var148 = (SubLObject)module0751.NIL, var148 = var147.first(); module0751.NIL == var145 && module0751.NIL != var147; var145 = (SubLObject)SubLObjectFactory.makeBoolean(module0038.f2637(var148).eql(module0581.f35671(var94, var146)) && module0751.NIL != module0581.f35656(module0581.f35679(var94, (SubLObject)module0751.ZERO_INTEGER, var144), var148, (SubLObject)module0751.UNPROVIDED)), var147 = var147.rest(), var148 = var147.first()) {}
        }
        return var145;
    }
    
    public static SubLObject f46722(SubLObject var216, SubLObject var217) {
        if (var217 == module0751.UNPROVIDED) {
            var217 = (SubLObject)module0751.T;
        }
        var216 = module0035.delete_if_not((SubLObject)module0751.$ic223$, var216, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var218 = (module0751.NIL != module0035.f1993(var216, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.UNPROVIDED)) ? var216 : f46723(var216);
        return (module0751.NIL != var217) ? module0581.f35672(var218) : Functions.apply(Symbols.symbol_function((SubLObject)module0751.$ic224$), var218);
    }
    
    public static SubLObject f46723(final SubLObject var216) {
        SubLObject var217 = (SubLObject)module0751.NIL;
        SubLObject var218 = (SubLObject)module0751.NIL;
        SubLObject var219 = var216;
        SubLObject var220 = (SubLObject)module0751.NIL;
        var220 = var219.first();
        while (module0751.NIL != var219) {
            if (module0751.NIL != module0581.f35648(var217) && (module0751.NIL != module0581.f35655(var217, module0015.$g238$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED) || module0751.NIL != module0581.f35656(var220, module0015.$g265$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED) || module0751.NIL != module0581.f35656(var220, module0015.$g263$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED) || module0581.f35669(var220).eql((SubLObject)Characters.CHAR_newline) || module0751.NIL != f46717(f46648(var217, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED))) {
                var217 = module0581.f35665(var220, var217);
            }
            else {
                if (module0751.NIL != module0581.f35648(var217)) {
                    var218 = (SubLObject)ConsesLow.cons(var217, var218);
                }
                var217 = var220;
            }
            var219 = var219.rest();
            var220 = var219.first();
        }
        var218 = (SubLObject)ConsesLow.cons(var217, var218);
        return var218;
    }
    
    public static SubLObject f46724(final SubLObject var94) {
        return f46725(var94, (SubLObject)module0751.$ic225$);
    }
    
    public static SubLObject f46726(final SubLObject var94) {
        return f46725(var94, (SubLObject)module0751.$ic226$);
    }
    
    public static SubLObject f46725(final SubLObject var94, SubLObject var221) {
        if (var221 == module0751.UNPROVIDED) {
            var221 = (SubLObject)module0751.$ic225$;
        }
        if (module0751.NIL != f46727(var94, var221)) {
            return Sequences.cconcatenate(var94, var221);
        }
        return var94;
    }
    
    public static SubLObject f46727(final SubLObject var94, final SubLObject var221) {
        final SubLThread var222 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0581.f35686(var94) && module0751.NIL == module0004.f104(var221, module0579.$g4269$.getDynamicValue(var222), Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED) && (module0751.NIL == module0038.f2681(module0581.f35669(var94)) || module0581.f35669(var94).eql((SubLObject)Characters.CHAR_rparen) || (module0751.NIL != Sequences.find(module0581.f35669(var94), (SubLObject)module0751.$ic227$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && (module0751.NIL == module0035.f2002(var94, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED) || module0751.NIL == f46721(module0581.f35670(var94, (SubLObject)module0751.ONE_INTEGER))))));
    }
    
    public static SubLObject f46728(SubLObject var94) {
        if (!var94.isString() || module0751.NIL == Sequences.find(Strings.sublisp_char(var94, (SubLObject)module0751.ZERO_INTEGER), (SubLObject)module0751.$ic228$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            var94 = module0006.f204(var94);
        }
        return var94;
    }
    
    public static SubLObject f46729(final SubLObject var94) {
        if (module0751.NIL != module0038.f2685(var94, module0751.$g6012$.getGlobalValue())) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46730(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        var95.resetMultipleValues();
        final SubLObject var96 = f46653(var94);
        final SubLObject var97 = var95.secondMultipleValue();
        var95.resetMultipleValues();
        if (module0751.NIL == f46729(var96)) {
            SubLObject var98 = (SubLObject)module0751.NIL;
            final SubLObject var99 = module0038.f2636(module0579.$g4315$.getGlobalValue());
            for (SubLObject var100 = var96, var101 = (SubLObject)(var100.isList() ? module0751.NIL : Sequences.length(var100)), var102 = (SubLObject)module0751.ZERO_INTEGER, var103 = module0005.f149(var102, var101, var100); module0751.NIL == var103 && module0751.NIL == var98; var103 = module0005.f149(var102, var101, var100)) {
                final SubLObject var104 = module0005.f150(var102, var100);
                if (!var102.isInteger() || !var102.numL((SubLObject)module0751.ZERO_INTEGER)) {
                    if (!module0751.NIL.isInteger() || !var102.isInteger() || !var102.numGE((SubLObject)module0751.NIL)) {
                        SubLObject var105 = var104.isChar() ? var104 : module0581.f35660(var104);
                        if (var105.isInteger()) {
                            var105 = Characters.code_char(var105);
                        }
                        if (module0751.NIL != module0038.f2729(var105)) {
                            if (module0751.NIL != Characters.alpha_char_p(var105) && (!var102.numGE((SubLObject)module0751.TWO_INTEGER) || module0751.NIL == module0581.f35663(constant_reader_oc.f8495(), module0581.f35679(var96, Numbers.subtract(var102, (SubLObject)module0751.TWO_INTEGER), var102)))) {
                                module0581.f35687(var96, var102, (SubLObject)module0751.UNPROVIDED);
                            }
                            var98 = (SubLObject)module0751.T;
                        }
                        else if (var105.eql(var99)) {
                            var98 = (SubLObject)module0751.T;
                        }
                    }
                }
                var100 = module0005.f151(var100);
                var102 = Numbers.add(var102, (SubLObject)module0751.ONE_INTEGER);
            }
        }
        return module0581.f35665(var97, var96);
    }
    
    public static SubLObject f46731(final SubLObject var94) {
        assert module0751.NIL != Types.stringp(var94) : var94;
        SubLObject var95 = (SubLObject)module0751.NIL;
        final SubLObject var96 = (SubLObject)module0751.$ic62$;
        SubLObject var97 = (SubLObject)module0751.NIL;
        SubLObject var98 = (SubLObject)module0751.NIL;
        SubLObject var233_234;
        SubLObject var99;
        SubLObject var100;
        SubLObject var101;
        SubLObject var102;
        SubLObject var103;
        for (var99 = (var233_234 = Sequences.length(var94)), var100 = (SubLObject)module0751.NIL, var100 = (SubLObject)module0751.ZERO_INTEGER; !var100.numGE(var233_234); var100 = module0048.f_1X(var100)) {
            var101 = Strings.sublisp_char(var94, var100);
            var102 = Sequences.find(var101, var96, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            if (module0751.NIL == var102) {
                var97 = (SubLObject)ConsesLow.cons(var101, var97);
            }
            else if (module0751.NIL != module0035.f2013(var97)) {
                var103 = f46732(var97, var98);
                var95 = (SubLObject)ConsesLow.cons(var103, var95);
                var95 = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)module0751.ONE_INTEGER, var101), var95);
                var98 = (SubLObject)module0751.T;
                var97 = (SubLObject)module0751.NIL;
            }
            else {
                var95 = (SubLObject)ConsesLow.cons(Strings.make_string((SubLObject)module0751.ONE_INTEGER, var101), var95);
            }
        }
        if (module0751.NIL != module0035.f2013(var97)) {
            final SubLObject var104 = f46732(var97, var98);
            var95 = (SubLObject)ConsesLow.cons(var104, var95);
        }
        return f46730(Functions.apply(Symbols.symbol_function((SubLObject)module0751.$ic224$), Sequences.nreverse(var95)));
    }
    
    public static SubLObject f46732(final SubLObject var229, final SubLObject var230) {
        final SubLObject var231 = module0581.f35667(Sequences.nreverse(var229));
        final SubLObject var232 = (module0751.NIL != var230) ? f46733(var231) : var231;
        return var232;
    }
    
    public static SubLObject f46733(final SubLObject var145) {
        if (module0751.NIL != module0038.f2608(var145)) {
            return var145;
        }
        if (module0751.NIL != Characters.upper_case_p(module0038.f2636(var145))) {
            return var145;
        }
        if (module0751.NIL != module0731.f44751(var145, (SubLObject)module0751.UNPROVIDED)) {
            return var145;
        }
        if (module0751.NIL != f46729(var145)) {
            return var145;
        }
        return f46730(var145);
    }
    
    public static SubLObject f46734(SubLObject var180) {
        SubLObject var181 = f46678();
        if (module0751.NIL != module0202.f12590(var180)) {
            var180 = f46735(var180);
            var181 = f46736(var180);
            if (module0751.NIL == f46703(var181)) {
                var180 = f46672(var181, var180);
            }
        }
        return Values.values(var180, var181);
    }
    
    public static SubLObject f46735(SubLObject var180) {
        if (module0751.NIL != module0202.f12659(var180) && (module0751.NIL != module0212.f13762(module0205.f13276(var180)) || module0751.NIL != module0202.f12659(module0205.f13276(var180)))) {
            var180 = f46737(var180);
        }
        return var180;
    }
    
    public static SubLObject f46738(SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0202.f12659(var180) && (module0751.NIL != module0212.f13762(module0205.f13276(var180)) || module0751.NIL != module0202.f12659(module0205.f13276(var180)))) {
            final SubLObject var182 = module0148.$g2099$.currentBinding(var181);
            try {
                module0148.$g2099$.bind((SubLObject)module0751.$ic231$, var181);
                final SubLObject var183 = module0172.f10921(var180);
                if (module0751.NIL != module0167.f10813(var183)) {
                    var180 = var183;
                }
            }
            finally {
                module0148.$g2099$.rebind(var182, var181);
            }
        }
        return var180;
    }
    
    public static SubLObject f46737(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        final SubLObject var182 = module0034.$g879$.getDynamicValue(var181);
        SubLObject var183 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var182) {
            return f46738(var180);
        }
        var183 = module0034.f1857(var182, (SubLObject)module0751.$ic230$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var183) {
            var183 = module0034.f1807(module0034.f1842(var182), (SubLObject)module0751.$ic230$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic232$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var182, (SubLObject)module0751.$ic230$, var183);
        }
        SubLObject var184 = module0034.f1814(var183, var180, (SubLObject)module0751.$ic37$);
        if (var184 == module0751.$ic37$) {
            var184 = Values.arg2(var181.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46738(var180)));
            module0034.f1816(var183, var180, var184, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var184);
    }
    
    public static SubLObject f46739(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        SubLObject var182 = (SubLObject)module0751.NIL;
        final SubLObject var183 = module0148.$g2099$.currentBinding(var181);
        try {
            module0148.$g2099$.bind((SubLObject)module0751.$ic231$, var181);
            var182 = module0172.f10922(var180);
        }
        finally {
            module0148.$g2099$.rebind(var183, var181);
        }
        return var182;
    }
    
    public static SubLObject f46740(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        final SubLObject var182 = module0034.$g879$.getDynamicValue(var181);
        SubLObject var183 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var182) {
            return f46739(var180);
        }
        var183 = module0034.f1857(var182, (SubLObject)module0751.$ic233$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var183) {
            var183 = module0034.f1807(module0034.f1842(var182), (SubLObject)module0751.$ic233$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic234$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var182, (SubLObject)module0751.$ic233$, var183);
        }
        SubLObject var184 = module0034.f1814(var183, var180, (SubLObject)module0751.$ic37$);
        if (var184 == module0751.$ic37$) {
            var184 = Values.arg2(var181.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46739(var180)));
            module0034.f1816(var183, var180, var184, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var184);
    }
    
    public static SubLObject f46741(final SubLObject var238) {
        final SubLObject var239 = module0756.f47487(var238, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var240 = f46735(var239);
        if (module0751.NIL != module0167.f10813(var240)) {
            module0756.f47465(var238, var240);
        }
        return var238;
    }
    
    public static SubLObject f46742(final SubLObject var238, SubLObject var17, SubLObject var239) {
        if (var17 == module0751.UNPROVIDED) {
            var17 = (SubLObject)module0751.NIL;
        }
        if (var239 == module0751.UNPROVIDED) {
            var239 = (SubLObject)module0751.NIL;
        }
        final SubLThread var240 = SubLProcess.currentSubLThread();
        if (module0751.NIL == module0579.f35498()) {
            module0758.f47899(var238);
            final SubLObject var241 = module0756.f47487(var238, (SubLObject)module0751.UNPROVIDED);
            if (module0751.NIL != module0202.f12590(var241)) {
                if (module0751.NIL == var17) {
                    var240.resetMultipleValues();
                    final SubLObject var242 = f46743(var241);
                    final SubLObject var243 = var240.secondMultipleValue();
                    var240.resetMultipleValues();
                    SubLObject var244 = var243;
                    SubLObject var245 = (SubLObject)module0751.NIL;
                    var245 = var244.first();
                    while (module0751.NIL != var244) {
                        module0756.f47569(var238, var245);
                        var244 = var244.rest();
                        var245 = var244.first();
                    }
                    module0756.f47465(var238, var242);
                    var240.resetMultipleValues();
                    final SubLObject var243_244 = f46736(var242);
                    final SubLObject var245_246 = var240.secondMultipleValue();
                    var240.resetMultipleValues();
                    var17 = var243_244;
                    var239 = var245_246;
                }
                if (module0751.NIL == f46703(var17)) {
                    module0756.f47745(var238, var17);
                    SubLObject var246 = var239;
                    SubLObject var247 = (SubLObject)module0751.NIL;
                    var247 = var246.first();
                    while (module0751.NIL != var246) {
                        module0756.f47569(var238, var247);
                        var246 = var246.rest();
                        var247 = var246.first();
                    }
                }
            }
        }
        return Values.values(module0756.f47487(var238, (SubLObject)module0751.UNPROVIDED), module0756.f47511(var238));
    }
    
    public static SubLObject f46744(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        SubLObject var9 = (SubLObject)module0751.NIL;
        SubLObject var10 = (SubLObject)module0751.NIL;
        SubLObject var11 = (SubLObject)module0751.NIL;
        SubLObject var12 = (SubLObject)module0751.NIL;
        SubLObject var13 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic235$);
        var9 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic235$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic235$);
        var11 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic235$);
        var12 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic235$);
        var13 = var8.first();
        var8 = var8.rest();
        if (module0751.NIL == var8) {
            return (SubLObject)ConsesLow.list((SubLObject)module0751.$ic236$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic237$, var12), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic238$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic239$, var9), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic240$, var9, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic241$, var12, var9)), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic238$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic242$, var9), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic240$, var10, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic241$, var12, var10)), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic240$, var11, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic243$, var11, var13)), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic244$, var11, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic238$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic245$, var11)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0751.$ic235$);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46736(SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        SubLObject var182 = f46678();
        SubLObject var183 = (SubLObject)module0751.NIL;
        var181.resetMultipleValues();
        SubLObject var184 = f46745(var180);
        SubLObject var185 = var181.secondMultipleValue();
        var181.resetMultipleValues();
        if (module0751.NIL == f46703(var184)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic239$, var180);
            }
            var180 = f46672(var184, var180);
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic242$, var180);
            }
            var182 = f46672(var184, var182);
            var183 = ConsesLow.append(var183, var185);
            if (module0751.NIL != var183 && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic245$, var183);
            }
        }
        var181.resetMultipleValues();
        var184 = f46746(var180);
        var185 = var181.secondMultipleValue();
        var181.resetMultipleValues();
        if (module0751.NIL == f46703(var184)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic239$, var180);
            }
            var180 = f46672(var184, var180);
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic242$, var180);
            }
            var182 = f46672(var184, var182);
            var183 = ConsesLow.append(var183, var185);
            if (module0751.NIL != var183 && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic245$, var183);
            }
        }
        if (module0751.NIL != module0202.f12592(var180) && module0751.NIL != module0202.f12595(module0205.f13203(var180, (SubLObject)module0751.UNPROVIDED))) {
            var181.resetMultipleValues();
            var184 = f46747(var180);
            var185 = var181.secondMultipleValue();
            var181.resetMultipleValues();
            if (module0751.NIL == f46703(var184)) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic239$, var180);
                }
                var180 = f46672(var184, var180);
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic242$, var180);
                }
                var182 = f46672(var184, var182);
                var183 = ConsesLow.append(var183, var185);
                if (module0751.NIL != var183 && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic245$, var183);
                }
            }
        }
        var181.resetMultipleValues();
        var184 = f46748(var180);
        var185 = var181.secondMultipleValue();
        var181.resetMultipleValues();
        if (module0751.NIL == f46703(var184)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic239$, var180);
            }
            var180 = f46672(var184, var180);
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic242$, var180);
            }
            var182 = f46672(var184, var182);
            var183 = ConsesLow.append(var183, var185);
            if (module0751.NIL != var183 && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic245$, var183);
            }
        }
        if (module0751.NIL != module0205.f13145((SubLObject)module0751.$ic246$, var180, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            var181.resetMultipleValues();
            var184 = f46749(var180);
            var185 = var181.secondMultipleValue();
            var181.resetMultipleValues();
            if (module0751.NIL == f46703(var184)) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic239$, var180);
                }
                var180 = f46672(var184, var180);
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic242$, var180);
                }
                var182 = f46672(var184, var182);
                var183 = ConsesLow.append(var183, var185);
                if (module0751.NIL != var183 && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic245$, var183);
                }
            }
        }
        return Values.values(var182, var183);
    }
    
    public static SubLObject f46750() {
        return (SubLObject)module0751.$ic247$;
    }
    
    public static SubLObject f46751(final SubLObject var180) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0004.f104(var180, f46750(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) || (module0751.NIL != module0202.f12590(var180) && module0751.NIL != module0337.f22630(var180, (SubLObject)module0751.$ic248$)));
    }
    
    public static SubLObject f46743(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        SubLObject var182 = var180;
        final SubLObject var183 = (SubLObject)module0751.NIL;
        final SubLObject var184 = module0751.$g6013$.currentBinding(var181);
        try {
            module0751.$g6013$.bind(module0077.f5313(Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED), var181);
            var182 = module0205.f13147(var182, (SubLObject)module0751.$ic249$, (SubLObject)module0751.$ic250$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        finally {
            module0751.$g6013$.rebind(var184, var181);
        }
        return Values.values(var182, var183);
    }
    
    public static SubLObject f46752(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == module0077.f5320(var180, module0751.$g6013$.getDynamicValue(var181)) && (module0751.NIL != f46753(var180, (SubLObject)module0751.UNPROVIDED) || module0751.NIL != f46754(var180)));
    }
    
    public static SubLObject f46754(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0579.$g4245$.getDynamicValue(var181) && module0751.NIL != module0612.f37382(var180)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46755(final SubLObject var180) {
        final SubLObject var181 = (module0751.NIL != f46753(var180, (SubLObject)module0751.UNPROVIDED)) ? f46756(var180, (SubLObject)module0751.UNPROVIDED) : var180;
        final SubLObject var182 = (SubLObject)module0751.NIL;
        return Values.values(var181, var182);
    }
    
    public static SubLObject f46753(final SubLObject var180, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        return f46751(var180);
    }
    
    public static SubLObject f46757(SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        SubLObject var182 = f46678();
        SubLObject var183 = (SubLObject)module0751.NIL;
        var181.resetMultipleValues();
        final SubLObject var184 = f46758(var180);
        final SubLObject var185 = var181.secondMultipleValue();
        var181.resetMultipleValues();
        if (module0751.NIL == f46703(var184)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic239$, var180);
            }
            var180 = f46672(var184, var180);
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic242$, var180);
            }
            var182 = f46672(var184, var182);
            var183 = ConsesLow.append(var183, var185);
            if (module0751.NIL != var183 && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic245$, var183);
            }
        }
        if (module0751.NIL == f46703(var182)) {
            var180 = f46672(var182, var180);
        }
        return Values.values(var180, var183);
    }
    
    public static SubLObject f46758(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = f46678();
        SubLObject var35 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0579.$g4245$.getDynamicValue(var33) && module0751.NIL != module0205.f13145((SubLObject)module0751.$ic251$, var32, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            final SubLObject var36 = f46759(var32);
            if (!var36.equal(var32)) {
                var34 = var36;
                var35 = (SubLObject)ConsesLow.list(module0756.f47688((SubLObject)module0751.$ic252$, (SubLObject)module0751.UNPROVIDED));
            }
        }
        return Values.values(var34, var35);
    }
    
    public static SubLObject f46759(final SubLObject var32) {
        if (module0751.NIL != module0612.f37382(var32)) {
            return f46760(var32);
        }
        if (module0751.NIL != module0202.f12590(var32)) {
            return module0202.f12801((SubLObject)module0751.$ic253$, var32, (SubLObject)module0751.UNPROVIDED);
        }
        return var32;
    }
    
    public static SubLObject f46760(final SubLObject var32) {
        final SubLObject var33 = Sequences.find(var32, f46761(), (SubLObject)module0751.$ic254$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var34 = (module0751.NIL != var33) ? var33 : ((module0751.NIL != module0202.f12590(var32)) ? module0202.f12801((SubLObject)module0751.$ic253$, var32, (SubLObject)module0751.UNPROVIDED) : var32);
        return var34;
    }
    
    public static SubLObject f46762(SubLObject var180, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var181 = SubLProcess.currentSubLThread();
        SubLObject var182 = f46678();
        SubLObject var183 = (SubLObject)module0751.NIL;
        var181.resetMultipleValues();
        final SubLObject var184 = f46763(var180, var81);
        final SubLObject var185 = var181.secondMultipleValue();
        var181.resetMultipleValues();
        if (module0751.NIL == f46703(var184)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic239$, var180);
            }
            var180 = f46672(var184, var180);
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic242$, var180);
            }
            var182 = f46672(var184, var182);
            var183 = ConsesLow.append(var183, var185);
            if (module0751.NIL != var183 && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic245$, var183);
            }
        }
        if (module0751.NIL == f46703(var182)) {
            var180 = f46672(var182, var180);
        }
        if (module0751.NIL != module0761.f48134()) {
            var180 = module0205.f13252(module0579.$g4283$.getDynamicValue(var181), module0751.$ic255$, var180, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        return Values.values(var180, var183);
    }
    
    public static SubLObject f46763(final SubLObject var32, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        SubLObject var82 = f46678();
        if (module0751.NIL != module0205.f13145((SubLObject)module0751.$ic256$, var32, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            final SubLObject var83 = f46764(var32, var81);
            if (!var83.equal(var32)) {
                var82 = var83;
            }
        }
        return var82;
    }
    
    public static SubLObject f46764(final SubLObject var32, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        if (module0751.NIL != f46765(var32)) {
            return f46766(var32, var81);
        }
        if (module0751.NIL != module0202.f12590(var32)) {
            SubLObject var83 = (SubLObject)module0751.NIL;
            final SubLObject var84 = module0579.$g4262$.currentBinding(var82);
            try {
                module0579.$g4262$.bind(var81, var82);
                var83 = module0202.f12801((SubLObject)module0751.$ic257$, var32, (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                module0579.$g4262$.rebind(var84, var82);
            }
            return var83;
        }
        return var32;
    }
    
    public static SubLObject f46766(final SubLObject var32, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLObject var83;
        final SubLObject var82 = var83 = f46767(var32, var81);
        return var83;
    }
    
    public static SubLObject f46768(final SubLObject var256) {
        if (module0751.NIL != module0337.f22630(var256, (SubLObject)module0751.$ic248$)) {
            return module0205.f13277(var256, (SubLObject)module0751.UNPROVIDED);
        }
        return var256;
    }
    
    public static SubLObject f46769(final SubLObject var257) {
        final SubLThread var258 = SubLProcess.currentSubLThread();
        SubLObject var259 = var257;
        if (module0751.NIL != f46753(var257, (SubLObject)module0751.UNPROVIDED)) {
            var259 = f46756(var257, (SubLObject)module0751.UNPROVIDED);
        }
        else if (module0751.NIL != f46754(var257)) {
            var259 = f46760(var257);
        }
        if (var259.equal(var257)) {
            module0077.f5326(var257, module0751.$g6013$.getDynamicValue(var258));
        }
        return var259;
    }
    
    public static SubLObject f46756(final SubLObject var256, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLObject var257 = f46768(var256);
        final SubLObject var258 = f46770((SubLObject)module0751.$ic258$, (SubLObject)ConsesLow.listS(module0751.$ic259$, var257, (SubLObject)module0751.$ic260$), var81, (SubLObject)module0751.ZERO_INTEGER, (SubLObject)module0751.ONE_INTEGER).first();
        return var258;
    }
    
    public static SubLObject f46767(final SubLObject var257, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLObject var258 = f46770((SubLObject)module0751.$ic258$, (SubLObject)ConsesLow.listS(module0751.$ic259$, var257, (SubLObject)module0751.$ic260$), var81, (SubLObject)module0751.ZERO_INTEGER, (SubLObject)module0751.ONE_INTEGER).first();
        return var258;
    }
    
    public static SubLObject f46771() {
        final SubLObject var82 = module0751.$g6014$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46772() {
        return module0034.f1829(module0751.$g6014$.getGlobalValue(), (SubLObject)ConsesLow.list(module0751.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46773() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0751.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0751.$ic262$, var2);
            module0147.$g2095$.bind(module0751.$ic263$, var2);
            final SubLObject var6 = module0751.$ic264$;
            final SubLObject var38_261 = module0137.$g1605$.currentBinding(var2);
            final SubLObject var91_262 = module0139.$g1636$.currentBinding(var2);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0751.$ic265$), var2);
                module0139.$g1636$.bind(module0139.f9007(), var2);
                SubLObject var263_264 = var6;
                final SubLObject var7 = (SubLObject)module0751.$ic268$;
                final SubLObject var8 = module0056.f4145(var7);
                final SubLObject var38_262 = module0139.$g1635$.currentBinding(var2);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var2);
                    final SubLObject var9 = (SubLObject)module0751.NIL;
                    final SubLObject var38_263 = module0141.$g1714$.currentBinding(var2);
                    final SubLObject var91_263 = module0141.$g1715$.currentBinding(var2);
                    try {
                        module0141.$g1714$.bind((module0751.NIL != var9) ? var9 : module0141.f9283(), var2);
                        module0141.$g1715$.bind((SubLObject)((module0751.NIL != var9) ? module0751.$ic269$ : module0141.$g1715$.getDynamicValue(var2)), var2);
                        if (module0751.NIL != var9 && module0751.NIL != module0136.f8864() && module0751.NIL == module0141.f9279(var9)) {
                            final SubLObject var10 = module0136.$g1591$.getDynamicValue(var2);
                            if (var10.eql((SubLObject)module0751.$ic270$)) {
                                module0136.f8870((SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic271$, var9, (SubLObject)module0751.$ic272$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                            }
                            else if (var10.eql((SubLObject)module0751.$ic273$)) {
                                module0136.f8871((SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic274$, (SubLObject)module0751.$ic271$, var9, (SubLObject)module0751.$ic272$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                            }
                            else if (var10.eql((SubLObject)module0751.$ic275$)) {
                                Errors.warn((SubLObject)module0751.$ic271$, var9, (SubLObject)module0751.$ic272$);
                            }
                            else {
                                Errors.warn((SubLObject)module0751.$ic276$, module0136.$g1591$.getDynamicValue(var2));
                                Errors.cerror((SubLObject)module0751.$ic274$, (SubLObject)module0751.$ic271$, var9, (SubLObject)module0751.$ic272$);
                            }
                        }
                        final SubLObject var38_264 = module0141.$g1670$.currentBinding(var2);
                        final SubLObject var91_264 = module0141.$g1671$.currentBinding(var2);
                        final SubLObject var11 = module0141.$g1672$.currentBinding(var2);
                        final SubLObject var12 = module0141.$g1674$.currentBinding(var2);
                        final SubLObject var13 = module0137.$g1605$.currentBinding(var2);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0751.$ic265$)), var2);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0751.$ic265$))), var2);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0751.$ic265$))), var2);
                            module0141.$g1674$.bind((SubLObject)module0751.NIL, var2);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0751.$ic265$)), var2);
                            if (module0751.NIL != module0136.f8865() || module0751.NIL != module0244.f15795(var6, module0137.f8955((SubLObject)module0751.UNPROVIDED))) {
                                final SubLObject var38_265 = module0141.$g1677$.currentBinding(var2);
                                final SubLObject var91_265 = module0138.$g1619$.currentBinding(var2);
                                final SubLObject var92_277 = module0141.$g1674$.currentBinding(var2);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var2);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0751.$ic265$))), var2);
                                    module0141.$g1674$.bind((SubLObject)module0751.NIL, var2);
                                    module0249.f16055(var263_264, (SubLObject)module0751.UNPROVIDED);
                                    while (module0751.NIL != var263_264) {
                                        final SubLObject var14 = var263_264;
                                        SubLObject var16;
                                        final SubLObject var15 = var16 = module0200.f12443(module0137.f8955(module0751.$ic265$));
                                        SubLObject var17 = (SubLObject)module0751.NIL;
                                        var17 = var16.first();
                                        while (module0751.NIL != var16) {
                                            final SubLObject var38_266 = module0137.$g1605$.currentBinding(var2);
                                            final SubLObject var91_266 = module0141.$g1674$.currentBinding(var2);
                                            try {
                                                module0137.$g1605$.bind(var17, var2);
                                                module0141.$g1674$.bind((SubLObject)((module0751.NIL != module0141.f9205((SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0751.NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                                final SubLObject var18 = module0228.f15229(var14);
                                                if (module0751.NIL != module0138.f8992(var18)) {
                                                    final SubLObject var19 = module0242.f15664(var18, module0137.f8955((SubLObject)module0751.UNPROVIDED));
                                                    if (module0751.NIL != var19) {
                                                        final SubLObject var20 = module0245.f15834(var19, module0244.f15780(module0137.f8955(module0751.$ic265$)), module0137.f8955((SubLObject)module0751.UNPROVIDED));
                                                        if (module0751.NIL != var20) {
                                                            SubLObject var21;
                                                            for (var21 = module0066.f4838(module0067.f4891(var20)); module0751.NIL == module0066.f4841(var21); var21 = module0066.f4840(var21)) {
                                                                var2.resetMultipleValues();
                                                                final SubLObject var22 = module0066.f4839(var21);
                                                                final SubLObject var23 = var2.secondMultipleValue();
                                                                var2.resetMultipleValues();
                                                                if (module0751.NIL != module0147.f9507(var22)) {
                                                                    final SubLObject var38_267 = module0138.$g1623$.currentBinding(var2);
                                                                    try {
                                                                        module0138.$g1623$.bind(var22, var2);
                                                                        SubLObject var286_290;
                                                                        for (var286_290 = module0066.f4838(module0067.f4891(var23)); module0751.NIL == module0066.f4841(var286_290); var286_290 = module0066.f4840(var286_290)) {
                                                                            var2.resetMultipleValues();
                                                                            final SubLObject var24 = module0066.f4839(var286_290);
                                                                            final SubLObject var25 = var2.secondMultipleValue();
                                                                            var2.resetMultipleValues();
                                                                            if (module0751.NIL != module0141.f9289(var24)) {
                                                                                final SubLObject var38_268 = module0138.$g1624$.currentBinding(var2);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var24, var2);
                                                                                    final SubLObject var26 = var25;
                                                                                    if (module0751.NIL != module0077.f5302(var26)) {
                                                                                        final SubLObject var27 = module0077.f5333(var26);
                                                                                        SubLObject var28;
                                                                                        SubLObject var29;
                                                                                        SubLObject var30;
                                                                                        SubLObject var31;
                                                                                        for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0751.NIL, var29 = module0032.f1742(var28, var27); module0751.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                                                                                            var30 = module0032.f1745(var28, var29);
                                                                                            if (module0751.NIL != module0032.f1746(var29, var30) && module0751.NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                                module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var2));
                                                                                                if (module0751.NIL != module0259.f16854(var30, module0751.$ic277$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                                                                                                    var31 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0751.ONE_INTEGER), f46774(var30));
                                                                                                    if (module0751.NIL != var31 && module0751.NIL == f46775(var31)) {
                                                                                                        var3 = (SubLObject)ConsesLow.cons(var30, var3);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var26.isList()) {
                                                                                        SubLObject var32 = var26;
                                                                                        SubLObject var33 = (SubLObject)module0751.NIL;
                                                                                        var33 = var32.first();
                                                                                        while (module0751.NIL != var32) {
                                                                                            if (module0751.NIL == module0249.f16059(var33, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                                module0249.f16055(var33, module0139.$g1636$.getDynamicValue(var2));
                                                                                                if (module0751.NIL != module0259.f16854(var33, module0751.$ic277$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                                                                                                    final SubLObject var34 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0751.ONE_INTEGER), f46774(var33));
                                                                                                    if (module0751.NIL != var34 && module0751.NIL == f46775(var34)) {
                                                                                                        var3 = (SubLObject)ConsesLow.cons(var33, var3);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            var32 = var32.rest();
                                                                                            var33 = var32.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0751.$ic278$, var26);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var38_268, var2);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var286_290);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var38_267, var2);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var21);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0751.FIVE_INTEGER, (SubLObject)module0751.$ic279$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                                                    }
                                                    if (module0751.NIL != module0200.f12419(var18, module0137.f8955((SubLObject)module0751.UNPROVIDED))) {
                                                        SubLObject var35 = module0248.f15995(var18);
                                                        SubLObject var36 = (SubLObject)module0751.NIL;
                                                        var36 = var35.first();
                                                        while (module0751.NIL != var35) {
                                                            SubLObject var38;
                                                            final SubLObject var37 = var38 = var36;
                                                            SubLObject var39 = (SubLObject)module0751.NIL;
                                                            SubLObject var40 = (SubLObject)module0751.NIL;
                                                            SubLObject var41 = (SubLObject)module0751.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0751.$ic280$);
                                                            var39 = var38.first();
                                                            var38 = var38.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0751.$ic280$);
                                                            var40 = var38.first();
                                                            var38 = var38.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var38, var37, (SubLObject)module0751.$ic280$);
                                                            var41 = var38.first();
                                                            var38 = var38.rest();
                                                            if (module0751.NIL == var38) {
                                                                if (module0751.NIL != module0147.f9507(var40)) {
                                                                    final SubLObject var38_269 = module0138.$g1623$.currentBinding(var2);
                                                                    try {
                                                                        module0138.$g1623$.bind(var40, var2);
                                                                        if (module0751.NIL != module0141.f9289(var41)) {
                                                                            final SubLObject var38_270 = module0138.$g1624$.currentBinding(var2);
                                                                            try {
                                                                                module0138.$g1624$.bind(var41, var2);
                                                                                final SubLObject var26;
                                                                                final SubLObject var42 = var26 = (SubLObject)ConsesLow.list(var39);
                                                                                if (module0751.NIL != module0077.f5302(var26)) {
                                                                                    final SubLObject var27 = module0077.f5333(var26);
                                                                                    SubLObject var28;
                                                                                    SubLObject var29;
                                                                                    SubLObject var30;
                                                                                    SubLObject var31;
                                                                                    for (var28 = module0032.f1741(var27), var29 = (SubLObject)module0751.NIL, var29 = module0032.f1742(var28, var27); module0751.NIL == module0032.f1744(var28, var29); var29 = module0032.f1743(var29)) {
                                                                                        var30 = module0032.f1745(var28, var29);
                                                                                        if (module0751.NIL != module0032.f1746(var29, var30) && module0751.NIL == module0249.f16059(var30, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                            module0249.f16055(var30, module0139.$g1636$.getDynamicValue(var2));
                                                                                            if (module0751.NIL != module0259.f16854(var30, module0751.$ic277$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                                                                                                var31 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0751.ONE_INTEGER), f46774(var30));
                                                                                                if (module0751.NIL != var31 && module0751.NIL == f46775(var31)) {
                                                                                                    var3 = (SubLObject)ConsesLow.cons(var30, var3);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var26.isList()) {
                                                                                    SubLObject var52_307 = var26;
                                                                                    SubLObject var33 = (SubLObject)module0751.NIL;
                                                                                    var33 = var52_307.first();
                                                                                    while (module0751.NIL != var52_307) {
                                                                                        if (module0751.NIL == module0249.f16059(var33, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                            module0249.f16055(var33, module0139.$g1636$.getDynamicValue(var2));
                                                                                            if (module0751.NIL != module0259.f16854(var33, module0751.$ic277$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                                                                                                final SubLObject var34 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0751.ONE_INTEGER), f46774(var33));
                                                                                                if (module0751.NIL != var34 && module0751.NIL == f46775(var34)) {
                                                                                                    var3 = (SubLObject)ConsesLow.cons(var33, var3);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        var52_307 = var52_307.rest();
                                                                                        var33 = var52_307.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0751.$ic278$, var26);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var38_270, var2);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var38_269, var2);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var37, (SubLObject)module0751.$ic280$);
                                                            }
                                                            var35 = var35.rest();
                                                            var36 = var35.first();
                                                        }
                                                    }
                                                }
                                                else if (module0751.NIL != module0155.f9785(var18, (SubLObject)module0751.UNPROVIDED)) {
                                                    SubLObject var18_309;
                                                    final SubLObject var43 = var18_309 = ((module0751.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0751.$ic265$)), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0751.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0751.$ic265$)), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0751.UNPROVIDED)));
                                                    SubLObject var44 = (SubLObject)module0751.NIL;
                                                    var44 = var18_309.first();
                                                    while (module0751.NIL != var18_309) {
                                                        final SubLObject var38_271 = module0138.$g1625$.currentBinding(var2);
                                                        try {
                                                            module0138.$g1625$.bind(var44, var2);
                                                            final SubLObject var46;
                                                            final SubLObject var45 = var46 = Functions.funcall(var44, var18);
                                                            if (module0751.NIL != module0077.f5302(var46)) {
                                                                final SubLObject var47 = module0077.f5333(var46);
                                                                SubLObject var48;
                                                                SubLObject var49;
                                                                SubLObject var50;
                                                                SubLObject var51;
                                                                for (var48 = module0032.f1741(var47), var49 = (SubLObject)module0751.NIL, var49 = module0032.f1742(var48, var47); module0751.NIL == module0032.f1744(var48, var49); var49 = module0032.f1743(var49)) {
                                                                    var50 = module0032.f1745(var48, var49);
                                                                    if (module0751.NIL != module0032.f1746(var49, var50) && module0751.NIL == module0249.f16059(var50, module0139.$g1636$.getDynamicValue(var2))) {
                                                                        module0249.f16055(var50, module0139.$g1636$.getDynamicValue(var2));
                                                                        if (module0751.NIL != module0259.f16854(var50, module0751.$ic277$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                                                                            var51 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0751.ONE_INTEGER), f46774(var50));
                                                                            if (module0751.NIL != var51 && module0751.NIL == f46775(var51)) {
                                                                                var3 = (SubLObject)ConsesLow.cons(var50, var3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            else if (var46.isList()) {
                                                                SubLObject var52 = var46;
                                                                SubLObject var53 = (SubLObject)module0751.NIL;
                                                                var53 = var52.first();
                                                                while (module0751.NIL != var52) {
                                                                    if (module0751.NIL == module0249.f16059(var53, module0139.$g1636$.getDynamicValue(var2))) {
                                                                        module0249.f16055(var53, module0139.$g1636$.getDynamicValue(var2));
                                                                        if (module0751.NIL != module0259.f16854(var53, module0751.$ic277$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                                                                            final SubLObject var54 = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)module0751.ONE_INTEGER), f46774(var53));
                                                                            if (module0751.NIL != var54 && module0751.NIL == f46775(var54)) {
                                                                                var3 = (SubLObject)ConsesLow.cons(var53, var3);
                                                                            }
                                                                        }
                                                                    }
                                                                    var52 = var52.rest();
                                                                    var53 = var52.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0751.$ic278$, var46);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var38_271, var2);
                                                        }
                                                        var18_309 = var18_309.rest();
                                                        var44 = var18_309.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var91_266, var2);
                                                module0137.$g1605$.rebind(var38_266, var2);
                                            }
                                            var16 = var16.rest();
                                            var17 = var16.first();
                                        }
                                        SubLObject var56;
                                        final SubLObject var55 = var56 = module0200.f12443(module0244.f15771(module0137.f8955(module0751.$ic265$)));
                                        SubLObject var57 = (SubLObject)module0751.NIL;
                                        var57 = var56.first();
                                        while (module0751.NIL != var56) {
                                            final SubLObject var38_272 = module0137.$g1605$.currentBinding(var2);
                                            final SubLObject var91_267 = module0141.$g1674$.currentBinding(var2);
                                            try {
                                                module0137.$g1605$.bind(var57, var2);
                                                module0141.$g1674$.bind((SubLObject)((module0751.NIL != module0141.f9205((SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0751.NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                                final SubLObject var58 = module0228.f15229(var263_264);
                                                if (module0751.NIL != module0138.f8992(var58)) {
                                                    final SubLObject var59 = module0242.f15664(var58, module0137.f8955((SubLObject)module0751.UNPROVIDED));
                                                    if (module0751.NIL != var59) {
                                                        final SubLObject var60 = module0245.f15834(var59, module0138.f8979(), module0137.f8955((SubLObject)module0751.UNPROVIDED));
                                                        if (module0751.NIL != var60) {
                                                            SubLObject var61;
                                                            for (var61 = module0066.f4838(module0067.f4891(var60)); module0751.NIL == module0066.f4841(var61); var61 = module0066.f4840(var61)) {
                                                                var2.resetMultipleValues();
                                                                final SubLObject var62 = module0066.f4839(var61);
                                                                final SubLObject var63 = var2.secondMultipleValue();
                                                                var2.resetMultipleValues();
                                                                if (module0751.NIL != module0147.f9507(var62)) {
                                                                    final SubLObject var38_273 = module0138.$g1623$.currentBinding(var2);
                                                                    try {
                                                                        module0138.$g1623$.bind(var62, var2);
                                                                        SubLObject var286_291;
                                                                        for (var286_291 = module0066.f4838(module0067.f4891(var63)); module0751.NIL == module0066.f4841(var286_291); var286_291 = module0066.f4840(var286_291)) {
                                                                            var2.resetMultipleValues();
                                                                            final SubLObject var64 = module0066.f4839(var286_291);
                                                                            final SubLObject var65 = var2.secondMultipleValue();
                                                                            var2.resetMultipleValues();
                                                                            if (module0751.NIL != module0141.f9289(var64)) {
                                                                                final SubLObject var38_274 = module0138.$g1624$.currentBinding(var2);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var64, var2);
                                                                                    final SubLObject var66 = var65;
                                                                                    if (module0751.NIL != module0077.f5302(var66)) {
                                                                                        final SubLObject var67 = module0077.f5333(var66);
                                                                                        SubLObject var68;
                                                                                        SubLObject var69;
                                                                                        SubLObject var70;
                                                                                        for (var68 = module0032.f1741(var67), var69 = (SubLObject)module0751.NIL, var69 = module0032.f1742(var68, var67); module0751.NIL == module0032.f1744(var68, var69); var69 = module0032.f1743(var69)) {
                                                                                            var70 = module0032.f1745(var68, var69);
                                                                                            if (module0751.NIL != module0032.f1746(var69, var70) && module0751.NIL == module0249.f16059(var70, (SubLObject)module0751.UNPROVIDED)) {
                                                                                                module0249.f16055(var70, (SubLObject)module0751.UNPROVIDED);
                                                                                                module0056.f4149(var70, var8);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var66.isList()) {
                                                                                        SubLObject var71 = var66;
                                                                                        SubLObject var72 = (SubLObject)module0751.NIL;
                                                                                        var72 = var71.first();
                                                                                        while (module0751.NIL != var71) {
                                                                                            if (module0751.NIL == module0249.f16059(var72, (SubLObject)module0751.UNPROVIDED)) {
                                                                                                module0249.f16055(var72, (SubLObject)module0751.UNPROVIDED);
                                                                                                module0056.f4149(var72, var8);
                                                                                            }
                                                                                            var71 = var71.rest();
                                                                                            var72 = var71.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0751.$ic278$, var66);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var38_274, var2);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var286_291);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var38_273, var2);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var61);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0751.FIVE_INTEGER, (SubLObject)module0751.$ic279$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0751.NIL != module0155.f9785(var58, (SubLObject)module0751.UNPROVIDED)) {
                                                    SubLObject var18_310;
                                                    final SubLObject var73 = var18_310 = ((module0751.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0751.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0751.UNPROVIDED)));
                                                    SubLObject var74 = (SubLObject)module0751.NIL;
                                                    var74 = var18_310.first();
                                                    while (module0751.NIL != var18_310) {
                                                        final SubLObject var38_275 = module0138.$g1625$.currentBinding(var2);
                                                        try {
                                                            module0138.$g1625$.bind(var74, var2);
                                                            final SubLObject var76;
                                                            final SubLObject var75 = var76 = Functions.funcall(var74, var58);
                                                            if (module0751.NIL != module0077.f5302(var76)) {
                                                                final SubLObject var77 = module0077.f5333(var76);
                                                                SubLObject var78;
                                                                SubLObject var79;
                                                                SubLObject var80;
                                                                for (var78 = module0032.f1741(var77), var79 = (SubLObject)module0751.NIL, var79 = module0032.f1742(var78, var77); module0751.NIL == module0032.f1744(var78, var79); var79 = module0032.f1743(var79)) {
                                                                    var80 = module0032.f1745(var78, var79);
                                                                    if (module0751.NIL != module0032.f1746(var79, var80) && module0751.NIL == module0249.f16059(var80, (SubLObject)module0751.UNPROVIDED)) {
                                                                        module0249.f16055(var80, (SubLObject)module0751.UNPROVIDED);
                                                                        module0056.f4149(var80, var8);
                                                                    }
                                                                }
                                                            }
                                                            else if (var76.isList()) {
                                                                SubLObject var81 = var76;
                                                                SubLObject var82 = (SubLObject)module0751.NIL;
                                                                var82 = var81.first();
                                                                while (module0751.NIL != var81) {
                                                                    if (module0751.NIL == module0249.f16059(var82, (SubLObject)module0751.UNPROVIDED)) {
                                                                        module0249.f16055(var82, (SubLObject)module0751.UNPROVIDED);
                                                                        module0056.f4149(var82, var8);
                                                                    }
                                                                    var81 = var81.rest();
                                                                    var82 = var81.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0751.$ic278$, var76);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var38_275, var2);
                                                        }
                                                        var18_310 = var18_310.rest();
                                                        var74 = var18_310.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var91_267, var2);
                                                module0137.$g1605$.rebind(var38_272, var2);
                                            }
                                            var56 = var56.rest();
                                            var57 = var56.first();
                                        }
                                        var263_264 = module0056.f4150(var8);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var92_277, var2);
                                    module0138.$g1619$.rebind(var91_265, var2);
                                    module0141.$g1677$.rebind(var38_265, var2);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.$ic281$, var6, module0244.f15748(module0137.f8955((SubLObject)module0751.UNPROVIDED)), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var13, var2);
                            module0141.$g1674$.rebind(var12, var2);
                            module0141.$g1672$.rebind(var11, var2);
                            module0141.$g1671$.rebind(var91_264, var2);
                            module0141.$g1670$.rebind(var38_264, var2);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var91_263, var2);
                        module0141.$g1714$.rebind(var38_263, var2);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var2));
                }
                finally {
                    module0139.$g1635$.rebind(var38_262, var2);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var2));
            }
            finally {
                module0139.$g1636$.rebind(var91_262, var2);
                module0137.$g1605$.rebind(var38_261, var2);
            }
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return Sequences.delete_duplicates(var3, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46761() {
        SubLObject var182 = module0751.$g6014$.getGlobalValue();
        if (module0751.NIL == var182) {
            var182 = module0034.f1934((SubLObject)module0751.$ic261$, (SubLObject)module0751.$ic282$, (SubLObject)module0751.NIL, (SubLObject)module0751.EQL, (SubLObject)module0751.ZERO_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        SubLObject var183 = module0034.f1810(var182, (SubLObject)module0751.UNPROVIDED);
        if (var183 == module0751.$ic37$) {
            var183 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46773()));
            module0034.f1812(var182, var183, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var183);
    }
    
    public static SubLObject f46765(final SubLObject var32) {
        return module0004.f104(var32, f46761(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46776(final SubLObject var322, final SubLObject var257) {
        return Equality.equal(var322, f46777(var257));
    }
    
    public static SubLObject f46777(final SubLObject var257) {
        final SubLThread var258 = SubLProcess.currentSubLThread();
        var258.resetMultipleValues();
        SubLObject var259 = f46774(var257);
        final SubLObject var260 = var258.secondMultipleValue();
        var258.resetMultipleValues();
        if (module0751.NIL != f46775(var260)) {
            f46778(var257);
            var259 = f46774(var257);
        }
        return var259;
    }
    
    public static SubLObject f46775(final SubLObject var298) {
        return Numbers.numL(var298, Time.get_universal_time());
    }
    
    public static SubLObject f46779() {
        final SubLObject var82 = module0751.$g6015$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46778(final SubLObject var257) {
        return module0034.f1829(module0751.$g6015$.getGlobalValue(), (SubLObject)ConsesLow.list(var257), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46780(final SubLObject var257) {
        final SubLObject var258 = f46781((SubLObject)module0751.$ic284$, (SubLObject)ConsesLow.listS(module0751.$ic259$, var257, (SubLObject)module0751.$ic285$), module0751.$ic286$, (SubLObject)module0751.UNPROVIDED).first();
        final SubLObject var259 = f46782(var257);
        return Values.values(var258, var259);
    }
    
    public static SubLObject f46774(final SubLObject var257) {
        SubLObject var258 = module0751.$g6015$.getGlobalValue();
        if (module0751.NIL == var258) {
            var258 = module0034.f1934((SubLObject)module0751.$ic283$, (SubLObject)module0751.$ic287$, (SubLObject)module0751.NIL, (SubLObject)module0751.EQL, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        SubLObject var259 = module0034.f1814(var258, var257, (SubLObject)module0751.$ic37$);
        if (var259 == module0751.$ic37$) {
            var259 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46780(var257)));
            module0034.f1816(var258, var257, var259, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var259);
    }
    
    public static SubLObject f46782(final SubLObject var257) {
        if (module0751.NIL != module0259.f16854(var257, module0751.$ic288$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return module0612.f37427(module0612.f37492(module0612.f37528()));
        }
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0751.$ic289$, var257);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46745(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        SubLObject var34 = f46678();
        SubLObject var35 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0202.f12590(var32) && module0751.NIL != module0202.f12658(module0205.f13203(var32, (SubLObject)module0751.UNPROVIDED)) && ((module0751.NIL != module0762.f48206(module0205.f13132(var32)) && module0751.NIL != f46783(module0205.f13204(var32, (SubLObject)module0751.UNPROVIDED))) || module0751.NIL != f46783(module0205.f13136(var32)))) {
            var33.resetMultipleValues();
            final SubLObject var325_326 = f46784(var32);
            final SubLObject var327_328 = var33.secondMultipleValue();
            var33.resetMultipleValues();
            var34 = var325_326;
            var35 = var327_328;
        }
        return Values.values(var34, var35);
    }
    
    public static SubLObject f46785() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        module0077.f5328(module0751.$g6016$.getGlobalValue());
        final SubLObject var3 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var4 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0751.$ic262$, var2);
            module0147.$g2095$.bind(module0751.$ic263$, var2);
            final SubLObject var5 = module0751.$ic290$;
            final SubLObject var38_329 = module0137.$g1605$.currentBinding(var2);
            final SubLObject var91_330 = module0139.$g1636$.currentBinding(var2);
            try {
                module0137.$g1605$.bind(module0137.f8955(module0751.$ic291$), var2);
                module0139.$g1636$.bind(module0139.f9007(), var2);
                SubLObject var263_331 = var5;
                final SubLObject var6 = (SubLObject)module0751.$ic268$;
                final SubLObject var7 = module0056.f4145(var6);
                final SubLObject var38_330 = module0139.$g1635$.currentBinding(var2);
                try {
                    module0139.$g1635$.bind(module0139.f9007(), var2);
                    final SubLObject var8 = (SubLObject)module0751.NIL;
                    final SubLObject var38_331 = module0141.$g1714$.currentBinding(var2);
                    final SubLObject var91_331 = module0141.$g1715$.currentBinding(var2);
                    try {
                        module0141.$g1714$.bind((module0751.NIL != var8) ? var8 : module0141.f9283(), var2);
                        module0141.$g1715$.bind((SubLObject)((module0751.NIL != var8) ? module0751.$ic269$ : module0141.$g1715$.getDynamicValue(var2)), var2);
                        if (module0751.NIL != var8 && module0751.NIL != module0136.f8864() && module0751.NIL == module0141.f9279(var8)) {
                            final SubLObject var9 = module0136.$g1591$.getDynamicValue(var2);
                            if (var9.eql((SubLObject)module0751.$ic270$)) {
                                module0136.f8870((SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic271$, var8, (SubLObject)module0751.$ic272$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                            }
                            else if (var9.eql((SubLObject)module0751.$ic273$)) {
                                module0136.f8871((SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic274$, (SubLObject)module0751.$ic271$, var8, (SubLObject)module0751.$ic272$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                            }
                            else if (var9.eql((SubLObject)module0751.$ic275$)) {
                                Errors.warn((SubLObject)module0751.$ic271$, var8, (SubLObject)module0751.$ic272$);
                            }
                            else {
                                Errors.warn((SubLObject)module0751.$ic276$, module0136.$g1591$.getDynamicValue(var2));
                                Errors.cerror((SubLObject)module0751.$ic274$, (SubLObject)module0751.$ic271$, var8, (SubLObject)module0751.$ic272$);
                            }
                        }
                        final SubLObject var38_332 = module0141.$g1670$.currentBinding(var2);
                        final SubLObject var91_332 = module0141.$g1671$.currentBinding(var2);
                        final SubLObject var10 = module0141.$g1672$.currentBinding(var2);
                        final SubLObject var11 = module0141.$g1674$.currentBinding(var2);
                        final SubLObject var12 = module0137.$g1605$.currentBinding(var2);
                        try {
                            module0141.$g1670$.bind(module0244.f15771(module0137.f8955(module0751.$ic291$)), var2);
                            module0141.$g1671$.bind(module0244.f15739(module0244.f15771(module0137.f8955(module0751.$ic291$))), var2);
                            module0141.$g1672$.bind(module0244.f15746(module0244.f15771(module0137.f8955(module0751.$ic291$))), var2);
                            module0141.$g1674$.bind((SubLObject)module0751.NIL, var2);
                            module0137.$g1605$.bind(module0244.f15771(module0137.f8955(module0751.$ic291$)), var2);
                            if (module0751.NIL != module0136.f8865() || module0751.NIL != module0244.f15795(var5, module0137.f8955((SubLObject)module0751.UNPROVIDED))) {
                                final SubLObject var38_333 = module0141.$g1677$.currentBinding(var2);
                                final SubLObject var91_333 = module0138.$g1619$.currentBinding(var2);
                                final SubLObject var92_339 = module0141.$g1674$.currentBinding(var2);
                                try {
                                    module0141.$g1677$.bind(module0141.f9210(), var2);
                                    module0138.$g1619$.bind(module0244.f15782(module0141.f9210(), module0244.f15771(module0137.f8955(module0751.$ic291$))), var2);
                                    module0141.$g1674$.bind((SubLObject)module0751.NIL, var2);
                                    module0249.f16055(var263_331, (SubLObject)module0751.UNPROVIDED);
                                    while (module0751.NIL != var263_331) {
                                        final SubLObject var13 = var263_331;
                                        SubLObject var15;
                                        final SubLObject var14 = var15 = module0200.f12443(module0137.f8955(module0751.$ic291$));
                                        SubLObject var16 = (SubLObject)module0751.NIL;
                                        var16 = var15.first();
                                        while (module0751.NIL != var15) {
                                            final SubLObject var38_334 = module0137.$g1605$.currentBinding(var2);
                                            final SubLObject var91_334 = module0141.$g1674$.currentBinding(var2);
                                            try {
                                                module0137.$g1605$.bind(var16, var2);
                                                module0141.$g1674$.bind((SubLObject)((module0751.NIL != module0141.f9205((SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0751.NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                                final SubLObject var17 = module0228.f15229(var13);
                                                if (module0751.NIL != module0138.f8992(var17)) {
                                                    final SubLObject var18 = module0242.f15664(var17, module0137.f8955((SubLObject)module0751.UNPROVIDED));
                                                    if (module0751.NIL != var18) {
                                                        final SubLObject var19 = module0245.f15834(var18, module0244.f15780(module0137.f8955(module0751.$ic291$)), module0137.f8955((SubLObject)module0751.UNPROVIDED));
                                                        if (module0751.NIL != var19) {
                                                            SubLObject var20;
                                                            for (var20 = module0066.f4838(module0067.f4891(var19)); module0751.NIL == module0066.f4841(var20); var20 = module0066.f4840(var20)) {
                                                                var2.resetMultipleValues();
                                                                final SubLObject var21 = module0066.f4839(var20);
                                                                final SubLObject var22 = var2.secondMultipleValue();
                                                                var2.resetMultipleValues();
                                                                if (module0751.NIL != module0147.f9507(var21)) {
                                                                    final SubLObject var38_335 = module0138.$g1623$.currentBinding(var2);
                                                                    try {
                                                                        module0138.$g1623$.bind(var21, var2);
                                                                        SubLObject var286_343;
                                                                        for (var286_343 = module0066.f4838(module0067.f4891(var22)); module0751.NIL == module0066.f4841(var286_343); var286_343 = module0066.f4840(var286_343)) {
                                                                            var2.resetMultipleValues();
                                                                            final SubLObject var23 = module0066.f4839(var286_343);
                                                                            final SubLObject var24 = var2.secondMultipleValue();
                                                                            var2.resetMultipleValues();
                                                                            if (module0751.NIL != module0141.f9289(var23)) {
                                                                                final SubLObject var38_336 = module0138.$g1624$.currentBinding(var2);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var23, var2);
                                                                                    final SubLObject var25 = var24;
                                                                                    if (module0751.NIL != module0077.f5302(var25)) {
                                                                                        final SubLObject var26 = module0077.f5333(var25);
                                                                                        SubLObject var27;
                                                                                        SubLObject var28;
                                                                                        SubLObject var29;
                                                                                        for (var27 = module0032.f1741(var26), var28 = (SubLObject)module0751.NIL, var28 = module0032.f1742(var27, var26); module0751.NIL == module0032.f1744(var27, var28); var28 = module0032.f1743(var28)) {
                                                                                            var29 = module0032.f1745(var27, var28);
                                                                                            if (module0751.NIL != module0032.f1746(var28, var29) && module0751.NIL == module0249.f16059(var29, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                                module0249.f16055(var29, module0139.$g1636$.getDynamicValue(var2));
                                                                                                module0077.f5326(var29, module0751.$g6016$.getGlobalValue());
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var25.isList()) {
                                                                                        SubLObject var30 = var25;
                                                                                        SubLObject var31 = (SubLObject)module0751.NIL;
                                                                                        var31 = var30.first();
                                                                                        while (module0751.NIL != var30) {
                                                                                            if (module0751.NIL == module0249.f16059(var31, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                                module0249.f16055(var31, module0139.$g1636$.getDynamicValue(var2));
                                                                                                module0077.f5326(var31, module0751.$g6016$.getGlobalValue());
                                                                                            }
                                                                                            var30 = var30.rest();
                                                                                            var31 = var30.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0751.$ic278$, var25);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var38_336, var2);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var286_343);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var38_335, var2);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var20);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0751.FIVE_INTEGER, (SubLObject)module0751.$ic279$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                                                    }
                                                    if (module0751.NIL != module0200.f12419(var17, module0137.f8955((SubLObject)module0751.UNPROVIDED))) {
                                                        SubLObject var32 = module0248.f15995(var17);
                                                        SubLObject var33 = (SubLObject)module0751.NIL;
                                                        var33 = var32.first();
                                                        while (module0751.NIL != var32) {
                                                            SubLObject var35;
                                                            final SubLObject var34 = var35 = var33;
                                                            SubLObject var36 = (SubLObject)module0751.NIL;
                                                            SubLObject var37 = (SubLObject)module0751.NIL;
                                                            SubLObject var38 = (SubLObject)module0751.NIL;
                                                            cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0751.$ic280$);
                                                            var36 = var35.first();
                                                            var35 = var35.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0751.$ic280$);
                                                            var37 = var35.first();
                                                            var35 = var35.rest();
                                                            cdestructuring_bind.destructuring_bind_must_consp(var35, var34, (SubLObject)module0751.$ic280$);
                                                            var38 = var35.first();
                                                            var35 = var35.rest();
                                                            if (module0751.NIL == var35) {
                                                                if (module0751.NIL != module0147.f9507(var37)) {
                                                                    final SubLObject var38_337 = module0138.$g1623$.currentBinding(var2);
                                                                    try {
                                                                        module0138.$g1623$.bind(var37, var2);
                                                                        if (module0751.NIL != module0141.f9289(var38)) {
                                                                            final SubLObject var38_338 = module0138.$g1624$.currentBinding(var2);
                                                                            try {
                                                                                module0138.$g1624$.bind(var38, var2);
                                                                                final SubLObject var25;
                                                                                final SubLObject var39 = var25 = (SubLObject)ConsesLow.list(var36);
                                                                                if (module0751.NIL != module0077.f5302(var25)) {
                                                                                    final SubLObject var26 = module0077.f5333(var25);
                                                                                    SubLObject var27;
                                                                                    SubLObject var28;
                                                                                    SubLObject var29;
                                                                                    for (var27 = module0032.f1741(var26), var28 = (SubLObject)module0751.NIL, var28 = module0032.f1742(var27, var26); module0751.NIL == module0032.f1744(var27, var28); var28 = module0032.f1743(var28)) {
                                                                                        var29 = module0032.f1745(var27, var28);
                                                                                        if (module0751.NIL != module0032.f1746(var28, var29) && module0751.NIL == module0249.f16059(var29, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                            module0249.f16055(var29, module0139.$g1636$.getDynamicValue(var2));
                                                                                            module0077.f5326(var29, module0751.$g6016$.getGlobalValue());
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (var25.isList()) {
                                                                                    SubLObject var52_349 = var25;
                                                                                    SubLObject var31 = (SubLObject)module0751.NIL;
                                                                                    var31 = var52_349.first();
                                                                                    while (module0751.NIL != var52_349) {
                                                                                        if (module0751.NIL == module0249.f16059(var31, module0139.$g1636$.getDynamicValue(var2))) {
                                                                                            module0249.f16055(var31, module0139.$g1636$.getDynamicValue(var2));
                                                                                            module0077.f5326(var31, module0751.$g6016$.getGlobalValue());
                                                                                        }
                                                                                        var52_349 = var52_349.rest();
                                                                                        var31 = var52_349.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)module0751.$ic278$, var25);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                module0138.$g1624$.rebind(var38_338, var2);
                                                                            }
                                                                        }
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var38_337, var2);
                                                                    }
                                                                }
                                                            }
                                                            else {
                                                                cdestructuring_bind.cdestructuring_bind_error(var34, (SubLObject)module0751.$ic280$);
                                                            }
                                                            var32 = var32.rest();
                                                            var33 = var32.first();
                                                        }
                                                    }
                                                }
                                                else if (module0751.NIL != module0155.f9785(var17, (SubLObject)module0751.UNPROVIDED)) {
                                                    SubLObject var18_350;
                                                    final SubLObject var40 = var18_350 = ((module0751.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0244.f15780(module0137.f8955(module0751.$ic291$)), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0751.UNPROVIDED))) : module0244.f15760(module0244.f15780(module0137.f8955(module0751.$ic291$)), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0751.UNPROVIDED)));
                                                    SubLObject var41 = (SubLObject)module0751.NIL;
                                                    var41 = var18_350.first();
                                                    while (module0751.NIL != var18_350) {
                                                        final SubLObject var38_339 = module0138.$g1625$.currentBinding(var2);
                                                        try {
                                                            module0138.$g1625$.bind(var41, var2);
                                                            final SubLObject var43;
                                                            final SubLObject var42 = var43 = Functions.funcall(var41, var17);
                                                            if (module0751.NIL != module0077.f5302(var43)) {
                                                                final SubLObject var44 = module0077.f5333(var43);
                                                                SubLObject var45;
                                                                SubLObject var46;
                                                                SubLObject var47;
                                                                for (var45 = module0032.f1741(var44), var46 = (SubLObject)module0751.NIL, var46 = module0032.f1742(var45, var44); module0751.NIL == module0032.f1744(var45, var46); var46 = module0032.f1743(var46)) {
                                                                    var47 = module0032.f1745(var45, var46);
                                                                    if (module0751.NIL != module0032.f1746(var46, var47) && module0751.NIL == module0249.f16059(var47, module0139.$g1636$.getDynamicValue(var2))) {
                                                                        module0249.f16055(var47, module0139.$g1636$.getDynamicValue(var2));
                                                                        module0077.f5326(var47, module0751.$g6016$.getGlobalValue());
                                                                    }
                                                                }
                                                            }
                                                            else if (var43.isList()) {
                                                                SubLObject var48 = var43;
                                                                SubLObject var49 = (SubLObject)module0751.NIL;
                                                                var49 = var48.first();
                                                                while (module0751.NIL != var48) {
                                                                    if (module0751.NIL == module0249.f16059(var49, module0139.$g1636$.getDynamicValue(var2))) {
                                                                        module0249.f16055(var49, module0139.$g1636$.getDynamicValue(var2));
                                                                        module0077.f5326(var49, module0751.$g6016$.getGlobalValue());
                                                                    }
                                                                    var48 = var48.rest();
                                                                    var49 = var48.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0751.$ic278$, var43);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var38_339, var2);
                                                        }
                                                        var18_350 = var18_350.rest();
                                                        var41 = var18_350.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var91_334, var2);
                                                module0137.$g1605$.rebind(var38_334, var2);
                                            }
                                            var15 = var15.rest();
                                            var16 = var15.first();
                                        }
                                        SubLObject var51;
                                        final SubLObject var50 = var51 = module0200.f12443(module0244.f15771(module0137.f8955(module0751.$ic291$)));
                                        SubLObject var52 = (SubLObject)module0751.NIL;
                                        var52 = var51.first();
                                        while (module0751.NIL != var51) {
                                            final SubLObject var38_340 = module0137.$g1605$.currentBinding(var2);
                                            final SubLObject var91_335 = module0141.$g1674$.currentBinding(var2);
                                            try {
                                                module0137.$g1605$.bind(var52, var2);
                                                module0141.$g1674$.bind((SubLObject)((module0751.NIL != module0141.f9205((SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(module0751.NIL == module0141.$g1674$.getDynamicValue(var2)) : module0141.$g1674$.getDynamicValue(var2)), var2);
                                                final SubLObject var53 = module0228.f15229(var263_331);
                                                if (module0751.NIL != module0138.f8992(var53)) {
                                                    final SubLObject var54 = module0242.f15664(var53, module0137.f8955((SubLObject)module0751.UNPROVIDED));
                                                    if (module0751.NIL != var54) {
                                                        final SubLObject var55 = module0245.f15834(var54, module0138.f8979(), module0137.f8955((SubLObject)module0751.UNPROVIDED));
                                                        if (module0751.NIL != var55) {
                                                            SubLObject var56;
                                                            for (var56 = module0066.f4838(module0067.f4891(var55)); module0751.NIL == module0066.f4841(var56); var56 = module0066.f4840(var56)) {
                                                                var2.resetMultipleValues();
                                                                final SubLObject var57 = module0066.f4839(var56);
                                                                final SubLObject var58 = var2.secondMultipleValue();
                                                                var2.resetMultipleValues();
                                                                if (module0751.NIL != module0147.f9507(var57)) {
                                                                    final SubLObject var38_341 = module0138.$g1623$.currentBinding(var2);
                                                                    try {
                                                                        module0138.$g1623$.bind(var57, var2);
                                                                        SubLObject var286_344;
                                                                        for (var286_344 = module0066.f4838(module0067.f4891(var58)); module0751.NIL == module0066.f4841(var286_344); var286_344 = module0066.f4840(var286_344)) {
                                                                            var2.resetMultipleValues();
                                                                            final SubLObject var59 = module0066.f4839(var286_344);
                                                                            final SubLObject var60 = var2.secondMultipleValue();
                                                                            var2.resetMultipleValues();
                                                                            if (module0751.NIL != module0141.f9289(var59)) {
                                                                                final SubLObject var38_342 = module0138.$g1624$.currentBinding(var2);
                                                                                try {
                                                                                    module0138.$g1624$.bind(var59, var2);
                                                                                    final SubLObject var61 = var60;
                                                                                    if (module0751.NIL != module0077.f5302(var61)) {
                                                                                        final SubLObject var62 = module0077.f5333(var61);
                                                                                        SubLObject var63;
                                                                                        SubLObject var64;
                                                                                        SubLObject var65;
                                                                                        for (var63 = module0032.f1741(var62), var64 = (SubLObject)module0751.NIL, var64 = module0032.f1742(var63, var62); module0751.NIL == module0032.f1744(var63, var64); var64 = module0032.f1743(var64)) {
                                                                                            var65 = module0032.f1745(var63, var64);
                                                                                            if (module0751.NIL != module0032.f1746(var64, var65) && module0751.NIL == module0249.f16059(var65, (SubLObject)module0751.UNPROVIDED)) {
                                                                                                module0249.f16055(var65, (SubLObject)module0751.UNPROVIDED);
                                                                                                module0056.f4149(var65, var7);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (var61.isList()) {
                                                                                        SubLObject var66 = var61;
                                                                                        SubLObject var67 = (SubLObject)module0751.NIL;
                                                                                        var67 = var66.first();
                                                                                        while (module0751.NIL != var66) {
                                                                                            if (module0751.NIL == module0249.f16059(var67, (SubLObject)module0751.UNPROVIDED)) {
                                                                                                module0249.f16055(var67, (SubLObject)module0751.UNPROVIDED);
                                                                                                module0056.f4149(var67, var7);
                                                                                            }
                                                                                            var66 = var66.rest();
                                                                                            var67 = var66.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)module0751.$ic278$, var61);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    module0138.$g1624$.rebind(var38_342, var2);
                                                                                }
                                                                            }
                                                                        }
                                                                        module0066.f4842(var286_344);
                                                                    }
                                                                    finally {
                                                                        module0138.$g1623$.rebind(var38_341, var2);
                                                                    }
                                                                }
                                                            }
                                                            module0066.f4842(var56);
                                                        }
                                                    }
                                                    else {
                                                        module0136.f8870((SubLObject)module0751.FIVE_INTEGER, (SubLObject)module0751.$ic279$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                                                    }
                                                }
                                                else if (module0751.NIL != module0155.f9785(var53, (SubLObject)module0751.UNPROVIDED)) {
                                                    SubLObject var18_351;
                                                    final SubLObject var68 = var18_351 = ((module0751.NIL != module0138.f8995()) ? module0035.f2097(module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0751.UNPROVIDED))) : module0244.f15760(module0138.f8979(), module0141.$g1714$.getDynamicValue(var2), module0137.f8955((SubLObject)module0751.UNPROVIDED)));
                                                    SubLObject var69 = (SubLObject)module0751.NIL;
                                                    var69 = var18_351.first();
                                                    while (module0751.NIL != var18_351) {
                                                        final SubLObject var38_343 = module0138.$g1625$.currentBinding(var2);
                                                        try {
                                                            module0138.$g1625$.bind(var69, var2);
                                                            final SubLObject var71;
                                                            final SubLObject var70 = var71 = Functions.funcall(var69, var53);
                                                            if (module0751.NIL != module0077.f5302(var71)) {
                                                                final SubLObject var72 = module0077.f5333(var71);
                                                                SubLObject var73;
                                                                SubLObject var74;
                                                                SubLObject var75;
                                                                for (var73 = module0032.f1741(var72), var74 = (SubLObject)module0751.NIL, var74 = module0032.f1742(var73, var72); module0751.NIL == module0032.f1744(var73, var74); var74 = module0032.f1743(var74)) {
                                                                    var75 = module0032.f1745(var73, var74);
                                                                    if (module0751.NIL != module0032.f1746(var74, var75) && module0751.NIL == module0249.f16059(var75, (SubLObject)module0751.UNPROVIDED)) {
                                                                        module0249.f16055(var75, (SubLObject)module0751.UNPROVIDED);
                                                                        module0056.f4149(var75, var7);
                                                                    }
                                                                }
                                                            }
                                                            else if (var71.isList()) {
                                                                SubLObject var76 = var71;
                                                                SubLObject var77 = (SubLObject)module0751.NIL;
                                                                var77 = var76.first();
                                                                while (module0751.NIL != var76) {
                                                                    if (module0751.NIL == module0249.f16059(var77, (SubLObject)module0751.UNPROVIDED)) {
                                                                        module0249.f16055(var77, (SubLObject)module0751.UNPROVIDED);
                                                                        module0056.f4149(var77, var7);
                                                                    }
                                                                    var76 = var76.rest();
                                                                    var77 = var76.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)module0751.$ic278$, var71);
                                                            }
                                                        }
                                                        finally {
                                                            module0138.$g1625$.rebind(var38_343, var2);
                                                        }
                                                        var18_351 = var18_351.rest();
                                                        var69 = var18_351.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                module0141.$g1674$.rebind(var91_335, var2);
                                                module0137.$g1605$.rebind(var38_340, var2);
                                            }
                                            var51 = var51.rest();
                                            var52 = var51.first();
                                        }
                                        var263_331 = module0056.f4150(var7);
                                    }
                                }
                                finally {
                                    module0141.$g1674$.rebind(var92_339, var2);
                                    module0138.$g1619$.rebind(var91_333, var2);
                                    module0141.$g1677$.rebind(var38_333, var2);
                                }
                            }
                            else {
                                module0136.f8872((SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.$ic281$, var5, module0244.f15748(module0137.f8955((SubLObject)module0751.UNPROVIDED)), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                            }
                        }
                        finally {
                            module0137.$g1605$.rebind(var12, var2);
                            module0141.$g1674$.rebind(var11, var2);
                            module0141.$g1672$.rebind(var10, var2);
                            module0141.$g1671$.rebind(var91_332, var2);
                            module0141.$g1670$.rebind(var38_332, var2);
                        }
                    }
                    finally {
                        module0141.$g1715$.rebind(var91_331, var2);
                        module0141.$g1714$.rebind(var38_331, var2);
                    }
                    module0139.f9011(module0139.$g1635$.getDynamicValue(var2));
                }
                finally {
                    module0139.$g1635$.rebind(var38_330, var2);
                }
                module0139.f9011(module0139.$g1636$.getDynamicValue(var2));
            }
            finally {
                module0139.$g1636$.rebind(var91_330, var2);
                module0137.$g1605$.rebind(var38_329, var2);
            }
        }
        finally {
            module0147.$g2095$.rebind(var4, var2);
            module0147.$g2094$.rebind(var3, var2);
        }
        return (SubLObject)module0751.$ic292$;
    }
    
    public static SubLObject f46783(final SubLObject var32) {
        if (module0751.NIL != module0077.f5316(module0751.$g6016$.getGlobalValue())) {
            f46785();
        }
        return module0077.f5320(var32, module0751.$g6016$.getGlobalValue());
    }
    
    public static SubLObject f46784(final SubLObject var359) {
        final SubLObject var360 = module0205.f13203(var359, (SubLObject)module0751.UNPROVIDED);
        SubLObject var361 = f46678();
        SubLObject var362 = (SubLObject)module0751.NIL;
        if (module0205.f13276(var360).eql(module0751.$ic293$)) {
            final SubLObject var363 = f46604((SubLObject)module0751.$ic294$);
            final SubLObject var364 = f46604((SubLObject)module0751.$ic295$);
            if (module0751.NIL != module0762.f48206(module0205.f13132(var359))) {
                var361 = module0202.f12769((SubLObject)module0751.$ic296$, var363, var364, (SubLObject)module0751.$ic297$);
            }
            else {
                var361 = module0202.f12768(var364, var363, (SubLObject)module0751.$ic208$);
            }
        }
        else if (module0205.f13276(var360).eql(module0751.$ic298$) && module0751.NIL != module0202.f12659(module0205.f13277(var360, (SubLObject)module0751.UNPROVIDED)) && module0205.f13276(module0205.f13277(var360, (SubLObject)module0751.UNPROVIDED)).eql(module0751.$ic299$)) {
            var361 = f46604((SubLObject)module0751.$ic300$);
        }
        if (module0751.NIL == f46703(var361)) {
            var362 = (SubLObject)ConsesLow.list(module0756.f47688((SubLObject)module0751.$ic301$, (SubLObject)module0751.UNPROVIDED));
        }
        return Values.values(var361, var362);
    }
    
    public static SubLObject f46786(final SubLObject var83, final SubLObject var26) {
        if (module0751.NIL != f46614(var26)) {
            return (SubLObject)module0751.NIL;
        }
        final SubLObject var84 = module0035.f2031(var83, var26, (SubLObject)module0751.UNPROVIDED);
        return f46604(var84);
    }
    
    public static SubLObject f46787(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0751.NIL == module0579.$g4276$.getDynamicValue(var27)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != f46788(var26)) {
            return (SubLObject)module0751.NIL;
        }
        final SubLObject var28 = module0205.f13183(var26, (SubLObject)module0751.$ic302$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        SubLObject var29 = (SubLObject)module0751.NIL;
        SubLObject var30 = (SubLObject)module0751.NIL;
        SubLObject var31 = var28;
        SubLObject var32 = (SubLObject)module0751.NIL;
        var32 = var31.first();
        while (module0751.NIL != var31) {
            if (module0751.NIL != module0754.f47310(var32)) {
                var30 = (SubLObject)ConsesLow.cons(var32, var30);
            }
            else {
                var29 = (SubLObject)ConsesLow.cons(var32, var29);
            }
            var31 = var31.rest();
            var32 = var31.first();
        }
        return (SubLObject)((module0751.NIL != var29) ? conses_high.intersection(var29, module0754.f47324(var26, var30), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) : module0751.NIL);
    }
    
    public static SubLObject f46748(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0751.NIL == module0202.f12590(var26)) {
            return Values.values(f46678(), (SubLObject)module0751.NIL);
        }
        var27.resetMultipleValues();
        final SubLObject var28 = f46789(var26);
        final SubLObject var29 = var27.secondMultipleValue();
        final SubLObject var30 = var27.thirdMultipleValue();
        var27.resetMultipleValues();
        var27.resetMultipleValues();
        final SubLObject var31 = f46790(var28);
        final SubLObject var32 = var27.secondMultipleValue();
        var27.resetMultipleValues();
        final SubLObject var33 = (module0751.NIL != f46703(var29)) ? var31 : f46672(var31, var29);
        final SubLObject var34 = module0205.f13250(var33, (SubLObject)module0751.$ic303$, var30, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        return Values.values(var34, var32);
    }
    
    public static SubLObject f46791(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic304$);
        final SubLObject var9 = var8.rest();
        var8 = var8.first();
        SubLObject var10 = (SubLObject)module0751.NIL;
        SubLObject var11 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic304$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic304$);
        var11 = var8.first();
        var8 = var8.rest();
        if (module0751.NIL == var8) {
            final SubLObject var12;
            var8 = (var12 = var9);
            final SubLObject var13 = (SubLObject)module0751.$ic305$;
            return (SubLObject)ConsesLow.listS((SubLObject)module0751.$ic18$, (SubLObject)ConsesLow.list(reader.bq_cons(var13, (SubLObject)module0751.$ic306$)), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic307$, (SubLObject)ConsesLow.list(var13, var10, var11), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic308$, var10, var11)), ConsesLow.append(var12, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0751.$ic240$, var11, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic309$, var13, var11)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0751.$ic304$);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46792(SubLObject var26, SubLObject var17) {
        SubLObject var27 = (SubLObject)module0751.NIL;
        while (module0751.NIL != module0202.f12589(var26, module0751.$ic311$)) {
            final SubLObject var28 = f46793((SubLObject)module0751.ZERO_INTEGER, var17);
            final SubLObject var29 = f46793((SubLObject)module0751.ONE_INTEGER, var17);
            var27 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var28, var29), var27);
            var26 = module0205.f13204(var26, (SubLObject)module0751.UNPROVIDED);
            var17 = f46793((SubLObject)module0751.TWO_INTEGER, var17);
        }
        return Values.values(var27, var26, var17);
    }
    
    public static SubLObject f46794(SubLObject var374, SubLObject var17) {
        while (module0751.NIL != var374) {
            SubLObject var376;
            final SubLObject var375 = var376 = var374.first();
            SubLObject var377 = (SubLObject)module0751.NIL;
            SubLObject var378 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var376, var375, (SubLObject)module0751.$ic312$);
            var377 = var376.first();
            var376 = var376.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var376, var375, (SubLObject)module0751.$ic312$);
            var378 = var376.first();
            var376 = var376.rest();
            if (module0751.NIL == var376) {
                var374 = var374.rest();
                var17 = module0202.f12768(var377, var378, var17);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var375, (SubLObject)module0751.$ic312$);
            }
        }
        return var17;
    }
    
    public static SubLObject f46790(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = f46678();
        SubLObject var29 = (SubLObject)module0751.NIL;
        SubLObject var30 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0762.f48177(var26)) {
            SubLObject var31 = (SubLObject)module0751.NIL;
            var27.resetMultipleValues();
            final SubLObject var381_382 = f46792(var26, var28);
            final SubLObject var383_384 = var27.secondMultipleValue();
            final SubLObject var385_386 = var27.thirdMultipleValue();
            var27.resetMultipleValues();
            var31 = var381_382;
            final SubLObject var32 = var383_384;
            var28 = var385_386;
            if (module0751.NIL != module0202.f12590(var32)) {
                SubLObject var33 = f46787(var32);
                SubLObject var34 = (SubLObject)module0751.NIL;
                var34 = var33.first();
                while (module0751.NIL != var33) {
                    final SubLObject var35 = f46786(var34, var26);
                    if (module0751.NIL != var35) {
                        var28 = module0202.f12775(var35, var28);
                        var29 = (SubLObject)ConsesLow.cons(var34, var29);
                    }
                    var33 = var33.rest();
                    var34 = var33.first();
                }
            }
            var30 = (SubLObject)ConsesLow.cons(module0756.f47688((SubLObject)module0751.$ic313$, (SubLObject)ConsesLow.list(var29)), var30);
            var28 = f46794(var31, var28);
        }
        return Values.values(var28, var30);
    }
    
    public static SubLObject f46789(final SubLObject var26) {
        final SubLObject var27 = f46787(var26);
        SubLObject var28 = var26;
        SubLObject var29 = f46678();
        SubLObject var30 = (SubLObject)module0751.$ic303$;
        if (module0751.NIL != module0035.f1997(var27) && (module0751.NIL != module0202.f12595(var26) || module0751.NIL != module0202.f12594(var26))) {
            SubLObject var31 = (SubLObject)module0751.NIL;
            final SubLObject var32 = var27.first();
            SubLObject var33 = (SubLObject)module0751.NIL;
            SubLObject var34 = (SubLObject)module0751.NIL;
            SubLObject var35 = (SubLObject)module0751.ZERO_INTEGER;
            final SubLObject var36 = module0205.f13207(var26, (SubLObject)module0751.$ic314$);
            SubLObject var37;
            SubLObject var38;
            for (var37 = (SubLObject)module0751.NIL, var37 = var36; module0751.NIL == var31 && module0751.NIL != var37; var37 = var37.rest()) {
                var38 = var37.first();
                var35 = Numbers.add(var35, (SubLObject)module0751.ONE_INTEGER);
                if (module0751.NIL != module0004.f104(var32, f46787(var38), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                    if (var33.isInteger()) {
                        var31 = (SubLObject)module0751.T;
                    }
                    else {
                        var33 = var35;
                        var34 = (SubLObject)ConsesLow.cons((SubLObject)module0751.$ic303$, var34);
                    }
                }
                else {
                    var34 = (SubLObject)ConsesLow.cons(f46604((SubLObject)ConsesLow.list(var35)), var34);
                }
            }
            if (var33.isInteger() && module0751.NIL == var31) {
                var28 = module0205.f13134(var26, var33, (SubLObject)module0751.UNPROVIDED);
                var29 = f46604((SubLObject)ConsesLow.list(var33));
                var30 = module0202.f12720((SubLObject)module0751.$ic296$, Sequences.nreverse(var34), (SubLObject)module0751.UNPROVIDED);
            }
        }
        return Values.values(var28, var29, var30);
    }
    
    public static SubLObject f46747(final SubLObject var26) {
        final SubLObject var27 = f46678();
        final SubLObject var28 = (SubLObject)module0751.NIL;
        return Values.values(var27, var28);
    }
    
    public static SubLObject f46749(final SubLObject var26) {
        SubLObject var27 = f46678();
        SubLObject var28 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0202.f12595(var26)) {
            final SubLObject var29 = f46795(module0205.f13207(var26, (SubLObject)module0751.UNPROVIDED));
            SubLObject var30 = f46796(var29);
            var30 = f46797(var30);
            if (module0751.NIL != f46798(var30)) {
                final SubLObject var31 = f46799(var30);
                var27 = module0202.f12683((SubLObject)module0751.$ic296$, var31, (SubLObject)module0751.UNPROVIDED);
                var28 = (SubLObject)ConsesLow.cons(module0756.f47688((SubLObject)module0751.$ic315$, (SubLObject)module0751.UNPROVIDED), var28);
            }
        }
        return Values.values(var27, var28);
    }
    
    public static SubLObject f46796(final SubLObject var397) {
        return Sort.stable_sort(var397, (SubLObject)module0751.$ic316$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46798(final SubLObject var398) {
        SubLObject var399 = (SubLObject)module0751.NIL;
        SubLObject var400 = (SubLObject)module0751.ZERO_INTEGER;
        if (module0751.NIL == var399) {
            SubLObject var401 = var398;
            SubLObject var402 = (SubLObject)module0751.NIL;
            var402 = var401.first();
            while (module0751.NIL == var399 && module0751.NIL != var401) {
                final SubLObject var403 = var402.rest();
                if (var403.numG(var400)) {
                    var400 = var403;
                }
                else {
                    var399 = (SubLObject)module0751.T;
                }
                var401 = var401.rest();
                var402 = var401.first();
            }
        }
        return var399;
    }
    
    public static SubLObject f46795(final SubLObject var404) {
        SubLObject var405 = (SubLObject)module0751.NIL;
        SubLObject var406 = (SubLObject)module0751.NIL;
        SubLObject var407 = (SubLObject)module0751.NIL;
        SubLObject var408 = (SubLObject)module0751.NIL;
        var406 = var404;
        var407 = var406.first();
        for (var408 = (SubLObject)module0751.ZERO_INTEGER; module0751.NIL != var406; var406 = var406.rest(), var407 = var406.first(), var408 = Numbers.add((SubLObject)module0751.ONE_INTEGER, var408)) {
            final SubLObject var409 = module0048.f_1X(var408);
            var405 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(var407, var409), var405);
        }
        return Sequences.nreverse(var405);
    }
    
    public static SubLObject f46800(final SubLObject var406, final SubLObject var407) {
        final SubLObject var408 = var406.first();
        final SubLObject var409 = var407.first();
        if (module0751.NIL != f46801(var409) && module0751.NIL == f46801(var408)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != f46801(var408) && module0751.NIL == f46801(var409)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != f46706(var408, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == f46706(var409, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != f46802(var409) && module0751.NIL == f46802(var408)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46803(final SubLObject var69, final SubLObject var70) {
        final SubLObject var71 = f46804(module0155.f9795(var69, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
        final SubLObject var72 = f46804(module0155.f9795(var70, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
        if (var71.equal(var72)) {
            return (SubLObject)module0751.ZERO_INTEGER;
        }
        if (module0751.NIL != module0035.f2181(var71, var72, (SubLObject)module0751.$ic317$, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.ONE_INTEGER;
        }
        return (SubLObject)module0751.TWO_INTEGER;
    }
    
    public static SubLObject f46804(final SubLObject var412) {
        return Sort.sort(var412, (SubLObject)module0751.$ic317$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46805(final SubLObject var413) {
        return Sort.sort(var413, (SubLObject)module0751.$ic317$, (SubLObject)module0751.$ic318$);
    }
    
    public static SubLObject f46806(final SubLObject var414, final SubLObject var415) {
        return Strings.stringL(print_high.princ_to_string(var414), print_high.princ_to_string(var415), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46807(final SubLObject var416, final SubLObject var417) {
        if (module0751.NIL == var417) {
            return (SubLObject)module0751.NIL;
        }
        SubLObject var418 = var417.first();
        final SubLObject var419 = var418.first();
        SubLObject var420 = f46803(var416.first(), var419);
        SubLObject var421 = var417;
        SubLObject var422 = (SubLObject)module0751.NIL;
        var422 = var421.first();
        while (module0751.NIL != var421) {
            final SubLObject var423 = var422.first();
            final SubLObject var424 = f46803(var416.first(), var423);
            if (var424.numL(var420)) {
                var420 = var424;
                var418 = var422;
            }
            var421 = var421.rest();
            var422 = var421.first();
        }
        return var418;
    }
    
    public static SubLObject f46808(final SubLObject var424) {
        SubLObject var425 = (SubLObject)module0751.NIL;
        SubLObject var426 = var424;
        SubLObject var427 = (SubLObject)module0751.NIL;
        var427 = var426.first();
        while (module0751.NIL != var426) {
            if (module0751.NIL != f46809(var427, var425)) {
                var425 = var427;
            }
            var426 = var426.rest();
            var427 = var426.first();
        }
        return var425;
    }
    
    public static SubLObject f46809(final SubLObject var427, final SubLObject var428) {
        if (module0751.NIL == var428) {
            return (SubLObject)module0751.T;
        }
        final SubLObject var429 = module0205.f13183(var427.first(), (SubLObject)module0751.$ic302$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var430 = module0205.f13183(var428.first(), (SubLObject)module0751.$ic302$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL != module0035.f2012(var430) && module0751.NIL == module0035.f2012(var429)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != Strings.stringL(print_high.princ_to_string(module0035.f2378(var429, Symbols.symbol_function((SubLObject)module0751.$ic319$), Symbols.symbol_function((SubLObject)module0751.$ic320$))), print_high.princ_to_string(module0035.f2378(var430, Symbols.symbol_function((SubLObject)module0751.$ic319$), Symbols.symbol_function((SubLObject)module0751.$ic320$))), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != f46806(module0035.f2378(var429, Symbols.symbol_function((SubLObject)module0751.$ic319$), Symbols.symbol_function((SubLObject)module0751.$ic320$)), module0035.f2378(var430, Symbols.symbol_function((SubLObject)module0751.$ic319$), Symbols.symbol_function((SubLObject)module0751.$ic320$)))) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != module0035.f2010(var429, var430)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46797(final SubLObject var424) {
        if (module0751.NIL == var424) {
            return (SubLObject)module0751.NIL;
        }
        SubLObject var425 = f46808(var424);
        SubLObject var426 = (SubLObject)ConsesLow.list(var425);
        SubLObject var428;
        for (SubLObject var427 = Sequences.remove(var425, var424, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED); module0751.NIL != var427; var427 = Sequences.remove(var428, var427, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), var425 = var428) {
            var428 = f46807(var425, var427);
            var426 = (SubLObject)ConsesLow.cons(var428, var426);
        }
        return Sequences.reverse(var426);
    }
    
    public static SubLObject f46801(final SubLObject var434) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0202.f12590(var434) && module0751.NIL != module0201.f12546(module0205.f13132(var434)));
    }
    
    public static SubLObject f46802(final SubLObject var434) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0202.f12590(var434) && module0751.NIL != f46684(module0205.f13132(var434), module0751.$ic321$, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f46799(final SubLObject var397) {
        SubLObject var398 = (SubLObject)module0751.NIL;
        SubLObject var399 = var397;
        SubLObject var400 = (SubLObject)module0751.NIL;
        var400 = var399.first();
        while (module0751.NIL != var399) {
            final SubLObject var401 = var400.rest();
            final SubLObject var402 = module0303.f20123(var401);
            var398 = (SubLObject)ConsesLow.cons(var402, var398);
            var399 = var399.rest();
            var400 = var399.first();
        }
        return Sequences.nreverse(var398);
    }
    
    public static SubLObject f46746(final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        SubLObject var28 = (SubLObject)module0751.NIL;
        SubLObject var29 = f46678();
        SubLObject var30 = (SubLObject)module0751.NIL;
        if (module0751.NIL != f46606((SubLObject)module0751.ZERO_INTEGER) && module0751.NIL != module0579.$g4270$.getDynamicValue(var27) && module0751.NIL != module0202.f12590(var26)) {
            final SubLObject var31 = module0205.f13328(module0205.f13136(var26));
            if (module0751.NIL != module0212.f13762(var31) && module0751.NIL == module0765.f48561(var31)) {
                var27.resetMultipleValues();
                final SubLObject var440_441 = f46810(var26, (SubLObject)module0751.UNPROVIDED);
                final SubLObject var442_443 = var27.secondMultipleValue();
                var27.resetMultipleValues();
                var29 = var440_441;
                var28 = var442_443;
                if (module0751.NIL == f46703(var29)) {
                    module0579.$g4270$.setDynamicValue((SubLObject)module0751.NIL, var27);
                    if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic322$, var29, var31);
                    }
                    final SubLObject var32 = var28;
                    if (module0751.NIL != var32) {
                        var30 = (SubLObject)ConsesLow.cons(var32, var30);
                    }
                }
            }
        }
        return Values.values(var29, var30);
    }
    
    public static SubLObject f46810(final SubLObject var32, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var82 = SubLProcess.currentSubLThread();
        SubLObject var83 = (SubLObject)module0751.NIL;
        final SubLObject var84 = module0205.f13328(module0205.f13132(var32));
        SubLObject var85 = f46678();
        SubLObject var86 = (SubLObject)module0751.NIL;
        final SubLObject var87 = module0147.f9540(var81);
        final SubLObject var88 = module0147.$g2095$.currentBinding(var82);
        final SubLObject var89 = module0147.$g2094$.currentBinding(var82);
        final SubLObject var90 = module0147.$g2096$.currentBinding(var82);
        final SubLObject var91 = module0148.$g2099$.currentBinding(var82);
        final SubLObject var92 = module0148.$g2097$.currentBinding(var82);
        try {
            module0147.$g2095$.bind(module0147.f9545(var87), var82);
            module0147.$g2094$.bind(module0147.f9546(var87), var82);
            module0147.$g2096$.bind(module0147.f9549(var87), var82);
            module0148.$g2099$.bind((SubLObject)module0751.$ic323$, var82);
            module0148.$g2097$.bind(module0751.$ic324$, var82);
            final SubLObject var93 = (SubLObject)module0751.NIL;
            if (module0751.NIL != module0158.f10010(var84, (SubLObject)module0751.ONE_INTEGER, var93)) {
                final SubLObject var94 = module0158.f10011(var84, (SubLObject)module0751.ONE_INTEGER, var93);
                SubLObject var95 = var86;
                final SubLObject var96 = (SubLObject)module0751.NIL;
                while (module0751.NIL == var95) {
                    final SubLObject var97 = module0052.f3695(var94, var96);
                    final SubLObject var98 = (SubLObject)SubLObjectFactory.makeBoolean(!var96.eql(var97));
                    if (module0751.NIL != var98) {
                        SubLObject var99 = (SubLObject)module0751.NIL;
                        try {
                            var99 = module0158.f10316(var97, (SubLObject)module0751.$ic325$, (SubLObject)module0751.$ic326$, (SubLObject)module0751.NIL);
                            SubLObject var448_453 = var86;
                            final SubLObject var449_454 = (SubLObject)module0751.NIL;
                            while (module0751.NIL == var448_453) {
                                final SubLObject var100 = module0052.f3695(var99, var449_454);
                                final SubLObject var451_456 = (SubLObject)SubLObjectFactory.makeBoolean(!var449_454.eql(var100));
                                if (module0751.NIL != var451_456) {
                                    var85 = f46811(var100);
                                    if (module0751.NIL == f46703(var85)) {
                                        var86 = (SubLObject)module0751.T;
                                        var83 = var100;
                                    }
                                }
                                var448_453 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var451_456 || module0751.NIL != var86);
                            }
                        }
                        finally {
                            final SubLObject var38_457 = Threads.$is_thread_performing_cleanupP$.currentBinding(var82);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var82);
                                if (module0751.NIL != var99) {
                                    module0158.f10319(var99);
                                }
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(var38_457, var82);
                            }
                        }
                    }
                    var95 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var98 || module0751.NIL != var86);
                }
            }
        }
        finally {
            module0148.$g2097$.rebind(var92, var82);
            module0148.$g2099$.rebind(var91, var82);
            module0147.$g2096$.rebind(var90, var82);
            module0147.$g2094$.rebind(var89, var82);
            module0147.$g2095$.rebind(var88, var82);
        }
        return Values.values(var85, var83);
    }
    
    public static SubLObject f46811(final SubLObject var438) {
        final SubLObject var439 = module0178.f11335(var438);
        if (module0751.NIL != f46812(var439)) {
            return f46678();
        }
        return var439;
    }
    
    public static SubLObject f46813(final SubLObject var17) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f46614(var17) || module0751.NIL != f46814(var17));
    }
    
    public static SubLObject f46812(final SubLObject var17) {
        final SubLThread var18 = SubLProcess.currentSubLThread();
        final SubLObject var19 = module0034.$g879$.getDynamicValue(var18);
        SubLObject var20 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var19) {
            return f46813(var17);
        }
        var20 = module0034.f1857(var19, (SubLObject)module0751.$ic327$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var20) {
            var20 = module0034.f1807(module0034.f1842(var19), (SubLObject)module0751.$ic327$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic328$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var19, (SubLObject)module0751.$ic327$, var20);
        }
        SubLObject var21 = module0034.f1814(var20, var17, (SubLObject)module0751.$ic37$);
        if (var21 == module0751.$ic37$) {
            var21 = Values.arg2(var18.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46813(var17)));
            module0034.f1816(var20, var17, var21, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var21);
    }
    
    public static SubLObject f46814(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0202.f12590(var32) && module0751.NIL != f46815(module0205.f13132(var32)));
    }
    
    public static SubLObject f46815(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0269.f17706(var32) && module0751.NIL != f46684(var32, module0751.$ic329$, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f46816(SubLObject var26) {
        if (module0751.NIL != module0202.f12590(var26) && module0751.NIL == f46817(var26) && module0751.NIL != module0035.f2438(Symbols.symbol_function((SubLObject)module0751.$ic330$), var26, (SubLObject)module0751.UNPROVIDED)) {
            final SubLObject var27 = module0205.f13203(var26, (SubLObject)module0751.UNPROVIDED);
            final SubLObject var28 = module0205.f13204(var26, (SubLObject)module0751.UNPROVIDED);
            if (module0751.NIL == f46817(var28)) {
                if (module0751.NIL != module0202.f12597(var26) && module0751.NIL != f46817(var27)) {
                    final SubLObject var29 = module0205.f13203(var27, (SubLObject)module0751.UNPROVIDED);
                    final SubLObject var30 = module0205.f13204(var27, (SubLObject)module0751.UNPROVIDED);
                    var26 = conses_high.subst(var30, var29, var28, Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED);
                }
                else {
                    final SubLObject var31 = module0035.f2399(var26, Symbols.symbol_function((SubLObject)module0751.$ic330$), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                    var26 = module0035.f2260(Symbols.symbol_function((SubLObject)module0751.$ic330$), var26, (SubLObject)module0751.UNPROVIDED);
                    SubLObject var32 = var31;
                    SubLObject var33 = (SubLObject)module0751.NIL;
                    var33 = var32.first();
                    while (module0751.NIL != var32) {
                        final SubLObject var34 = module0205.f13203(var33, (SubLObject)module0751.UNPROVIDED);
                        final SubLObject var35 = module0205.f13204(var33, (SubLObject)module0751.UNPROVIDED);
                        var26 = conses_high.subst(var35, var34, var26, Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED);
                        var32 = var32.rest();
                        var33 = var32.first();
                    }
                    var26 = f46818(var26);
                }
            }
        }
        return var26;
    }
    
    public static SubLObject f46788(final SubLObject var11) {
        return module0035.sublisp_boolean(module0205.f13145((SubLObject)module0751.$ic331$, var11, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f46819(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f46703(var11) || (module0751.NIL != f46820(var11) && module0751.NIL != module0004.f106(module0205.f13277(var11, (SubLObject)module0751.UNPROVIDED)) && module0751.NIL != f46819(module0205.f13368(var11, (SubLObject)module0751.UNPROVIDED))) || module0751.NIL != module0304.f20296(var11));
    }
    
    public static SubLObject f46678() {
        return module0751.$g6017$.getGlobalValue();
    }
    
    public static SubLObject f46703(final SubLObject var11) {
        return Equality.eq(var11, module0751.$g6017$.getGlobalValue());
    }
    
    public static SubLObject f46821() {
        return module0751.$g6018$.getGlobalValue();
    }
    
    public static SubLObject f46822(final SubLObject var11) {
        return Equality.eq(var11, module0751.$g6018$.getGlobalValue());
    }
    
    public static SubLObject f46820(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0202.f12659(var32) && module0205.f13276(var32).eql(module0751.$ic334$));
    }
    
    public static SubLObject f46793(final SubLObject var25, final SubLObject var26) {
        if (module0751.NIL != f46703(var26)) {
            return f46604((SubLObject)ConsesLow.list(var25));
        }
        return module0202.f12768(module0751.$ic334$, var25, var26);
    }
    
    public static SubLObject f46823(final SubLObject var180, SubLObject var461) {
        if (var461 == module0751.UNPROVIDED) {
            var461 = module0751.$g6019$.getDynamicValue();
        }
        final SubLThread var462 = SubLProcess.currentSubLThread();
        if (module0751.NIL != f46820(var180) && (module0751.NIL != var461 || module0751.NIL == f46819(var180))) {
            return f46824(var180, var461);
        }
        if (module0751.NIL != f46819(var180)) {
            return Values.values(var180, (SubLObject)module0751.$ic335$);
        }
        if (var180.isAtom()) {
            return Values.values(var180, (SubLObject)module0751.$ic336$);
        }
        if (module0751.NIL != module0202.f12590(var180)) {
            SubLObject var463 = (SubLObject)module0751.NIL;
            final SubLObject var464 = module0751.$g6019$.currentBinding(var462);
            try {
                module0751.$g6019$.bind(var461, var462);
                var463 = module0202.f12801((SubLObject)module0751.$ic337$, var180, (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                module0751.$g6019$.rebind(var464, var462);
            }
            return Values.values(var463, (SubLObject)module0751.$ic336$);
        }
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0751.$ic338$, var180);
        }
        return var180;
    }
    
    public static SubLObject f46824(final SubLObject var462, SubLObject var461) {
        if (var461 == module0751.UNPROVIDED) {
            var461 = (SubLObject)module0751.T;
        }
        final SubLThread var463 = SubLProcess.currentSubLThread();
        SubLObject var465;
        final SubLObject var464 = var465 = module0205.f13304(var462, (SubLObject)module0751.UNPROVIDED);
        SubLObject var466 = (SubLObject)module0751.NIL;
        SubLObject var467 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var465, var464, (SubLObject)module0751.$ic339$);
        var466 = var465.first();
        var465 = var465.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var465, var464, (SubLObject)module0751.$ic339$);
        var467 = var465.first();
        var465 = var465.rest();
        if (module0751.NIL != var465) {
            cdestructuring_bind.cdestructuring_bind_error(var464, (SubLObject)module0751.$ic339$);
            return (SubLObject)module0751.NIL;
        }
        var463.resetMultipleValues();
        final SubLObject var468 = f46823(var467, var461);
        final SubLObject var469 = var463.secondMultipleValue();
        var463.resetMultipleValues();
        if (var469 == module0751.$ic335$) {
            return Values.values(var462, (SubLObject)module0751.$ic335$);
        }
        if (module0751.NIL == var461 && module0751.NIL != f46819(var468)) {
            final SubLObject var470 = module0202.f12817((SubLObject)module0751.TWO_INTEGER, var468, var462);
            return Values.values(var470, (SubLObject)module0751.$ic335$);
        }
        return Values.values(module0205.f13134(var468, var466, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.$ic336$);
    }
    
    public static SubLObject f46825(final SubLObject var17) {
        if (module0751.NIL != module0304.f20296(var17)) {
            return f46826(var17);
        }
        if (module0751.NIL != f46820(var17)) {
            return f46827(var17);
        }
        if (module0751.NIL != f46703(var17)) {
            return (SubLObject)module0751.NIL;
        }
        return f46705();
    }
    
    public static SubLObject f46828(final SubLObject var10, final SubLObject var26, SubLObject var56) {
        if (var56 == module0751.UNPROVIDED) {
            var56 = Symbols.symbol_function((SubLObject)module0751.EQL);
        }
        SubLObject var57 = module0205.f13397(var10, var26, var56);
        if (var10.equal(var26)) {
            var57 = (SubLObject)ConsesLow.cons((SubLObject)module0751.NIL, var57);
        }
        return Sequences.nreverse(var57);
    }
    
    public static SubLObject f46604(final SubLObject var76) {
        if (module0751.NIL == var76) {
            return f46678();
        }
        if (module0751.NIL != f46829(var76)) {
            return f46821();
        }
        if (var76.isNumber()) {
            return module0303.f20123(var76);
        }
        SubLObject var77;
        SubLObject var78;
        SubLObject var79;
        SubLObject var80;
        for (var77 = (SubLObject)module0751.NIL, var78 = (SubLObject)module0751.NIL, var79 = (SubLObject)module0751.NIL, var80 = (SubLObject)module0751.NIL, var77 = var76, var78 = var77.first(), var79 = conses_high.second(var77), var80 = module0303.f20123(var78); var79.isInteger(); var79 = conses_high.second(var77), var80 = f46793(var78, var80)) {
            var77 = var77.rest();
            var78 = var79;
        }
        if (module0751.NIL != var79) {
            final SubLObject var81 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic340$) });
            module0578.f35476(var81, (SubLObject)ConsesLow.list(var76));
        }
        return var80;
    }
    
    public static SubLObject f46830(final SubLObject var83, final SubLObject var26) {
        final SubLObject var84 = module0035.f2030(var83, var26, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        return (SubLObject)((module0751.NIL != var84) ? f46604(var84.first()) : module0751.NIL);
    }
    
    public static SubLObject f46826(final SubLObject var471) {
        final SubLObject var472 = module0303.f20124(var471);
        return (SubLObject)ConsesLow.list(var472);
    }
    
    public static SubLObject f46827(final SubLObject var462) {
        SubLObject var463 = (SubLObject)module0751.NIL;
        SubLObject var464;
        for (var464 = var462; module0751.NIL != f46820(var464); var464 = module0205.f13368(var464, (SubLObject)module0751.UNPROVIDED)) {
            var463 = (SubLObject)ConsesLow.cons(module0205.f13277(var464, (SubLObject)module0751.UNPROVIDED), var463);
        }
        if (module0751.NIL != f46703(var464)) {
            return var463;
        }
        if (module0751.NIL != module0304.f20296(var464)) {
            var463 = ConsesLow.append(f46826(var464), var463);
            return var463;
        }
        final SubLObject var465 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic341$) });
        module0578.f35476(var465, (SubLObject)ConsesLow.list(module0751.EMPTY_SUBL_OBJECT_ARRAY));
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46831(final SubLObject var17, final SubLObject var475) {
        if (module0751.NIL != module0202.f12590(var17)) {
            return f46832(var17, var475);
        }
        return var17;
    }
    
    public static SubLObject f46832(final SubLObject var17, final SubLObject var475) {
        if (module0751.NIL != f46820(var17)) {
            return var17;
        }
        if (module0751.NIL != f46833(var17, var475)) {
            return f46678();
        }
        return var17;
    }
    
    public static SubLObject f46833(final SubLObject var17, final SubLObject var475) {
        SubLObject var476 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0035.f2014(var17) && module0751.NIL != module0035.f2014(var475) && module0751.NIL != module0035.f2004(var17, var475)) {
            SubLObject var477 = (SubLObject)module0751.NIL;
            if (module0751.NIL == var477) {
                SubLObject var478 = (SubLObject)module0751.NIL;
                SubLObject var479_480 = (SubLObject)module0751.NIL;
                SubLObject var479 = (SubLObject)module0751.NIL;
                SubLObject var482_483 = (SubLObject)module0751.NIL;
                var478 = var17;
                var479_480 = var478.first();
                var479 = var475;
                var482_483 = var479.first();
                while (module0751.NIL == var477 && (module0751.NIL != var479 || module0751.NIL != var478)) {
                    if (!var482_483.equal(f46672(var479_480, var475))) {
                        var477 = (SubLObject)module0751.T;
                    }
                    var478 = var478.rest();
                    var479_480 = var478.first();
                    var479 = var479.rest();
                    var482_483 = var479.first();
                }
            }
            var476 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var477);
        }
        return var476;
    }
    
    public static SubLObject f46672(SubLObject var17, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0751.NIL == f46788(var17)) {
            return var17;
        }
        if (module0751.NIL != f46703(var26)) {
            return var17;
        }
        if (module0751.NIL == var26) {
            final SubLObject var28 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic342$) });
            module0578.f35476(var28, (SubLObject)ConsesLow.list(var17, module0579.$g4317$.getDynamicValue(var27)));
        }
        if (module0751.NIL == var17) {
            final SubLObject var28 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic343$) });
            module0578.f35476(var28, (SubLObject)ConsesLow.list(var26, module0579.$g4317$.getDynamicValue(var27)));
        }
        SubLObject var29 = module0205.f13183(var17, (SubLObject)module0751.$ic302$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        SubLObject var30 = (SubLObject)module0751.NIL;
        var30 = var29.first();
        while (module0751.NIL != var29) {
            if (module0751.NIL != module0205.f13220(var30, var26, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                final SubLObject var31 = f46834(var26, module0201.f12563(var30), (SubLObject)module0751.UNPROVIDED);
                var17 = conses_high.subst(var31, var30, var17, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            }
            var29 = var29.rest();
            var30 = var29.first();
        }
        return (module0751.NIL != f46703(var17)) ? var26 : f46835(var17, var26);
    }
    
    public static SubLObject f46835(final SubLObject var17, SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0751.NIL != f46703(var17)) {
            return var26;
        }
        if (module0751.NIL != f46822(var17)) {
            return f46836(var17, var26);
        }
        if (module0751.NIL != module0756.f47476(var26)) {
            return var17;
        }
        if (module0751.NIL != f46820(var17) && module0751.NIL != f46819(module0205.f13368(var17, (SubLObject)module0751.UNPROVIDED))) {
            SubLObject var29;
            final SubLObject var28 = var29 = module0205.f13304(var17, (SubLObject)module0751.UNPROVIDED);
            SubLObject var30 = (SubLObject)module0751.NIL;
            SubLObject var31 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0751.$ic344$);
            var30 = var29.first();
            var29 = var29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var29, var28, (SubLObject)module0751.$ic344$);
            var31 = var29.first();
            var29 = var29.rest();
            if (module0751.NIL != var29) {
                cdestructuring_bind.cdestructuring_bind_error(var28, (SubLObject)module0751.$ic344$);
                return (SubLObject)module0751.NIL;
            }
            final SubLObject var32 = f46835(var31, var26);
            if (module0751.NIL != f46819(var32)) {
                return f46793(var30, var32);
            }
            if (module0751.NIL != module0205.f13220(module0579.$g4343$.getGlobalValue(), var32, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                return f46793(var30, var32);
            }
            if (module0751.NIL != module0201.f12546(var32)) {
                return f46793(var30, var32);
            }
            if (module0751.NIL != f46837(var32) && module0751.NIL != module0202.f12732(var32, var30, (SubLObject)module0751.UNPROVIDED)) {
                return module0205.f13134(var32, var30, (SubLObject)module0751.UNPROVIDED);
            }
            return f46836(var17, var26);
        }
        else if (module0751.NIL != module0304.f20296(var17)) {
            final SubLObject var33 = module0303.f20124(var17);
            if (module0751.NIL != f46819(var26)) {
                SubLObject var34 = (SubLObject)module0751.NIL;
                while (module0751.NIL != f46820(var26)) {
                    var34 = (SubLObject)ConsesLow.cons(conses_high.butlast(var26, (SubLObject)module0751.UNPROVIDED), var34);
                    var26 = module0035.f2114(var26);
                }
                final SubLObject var25_491 = module0303.f20124(var17);
                SubLObject var35 = var26;
                SubLObject var36 = var34;
                SubLObject var37 = (SubLObject)module0751.NIL;
                var37 = var36.first();
                while (module0751.NIL != var36) {
                    var35 = ConsesLow.append(var37, (SubLObject)ConsesLow.list(var35));
                    var36 = var36.rest();
                    var37 = var36.first();
                }
                return f46793(var25_491, var35);
            }
            if (module0751.NIL != f46837(var26) && (module0751.NIL == f46838(var26) || module0751.NIL != module0202.f12732(var26, var33, (SubLObject)module0751.UNPROVIDED))) {
                return module0205.f13134(var26, var33, (SubLObject)module0751.UNPROVIDED);
            }
            if (module0579.$g4343$.getGlobalValue().eql(var26)) {
                return f46793(var33, var26);
            }
            return f46836(var17, var26);
        }
        else {
            if (var17.equal(var26)) {
                return var26;
            }
            if (module0751.NIL != module0202.f12590(var17)) {
                SubLObject var38 = (SubLObject)module0751.NIL;
                SubLObject var39 = (SubLObject)module0751.NIL;
                final SubLObject var40 = module0579.$g4342$.currentBinding(var27);
                try {
                    module0579.$g4342$.bind((SubLObject)module0751.NIL, var27);
                    var39 = f46835(module0202.f12707(var17, (SubLObject)module0751.UNPROVIDED), var26);
                    SubLObject var36;
                    final SubLObject var41 = var36 = module0205.f13180(var17, (SubLObject)module0751.$ic314$);
                    SubLObject var42 = (SubLObject)module0751.NIL;
                    var42 = var36.first();
                    while (module0751.NIL != var36) {
                        var38 = (SubLObject)ConsesLow.cons(f46835(var42, var26), var38);
                        var36 = var36.rest();
                        var42 = var36.first();
                    }
                }
                finally {
                    module0579.$g4342$.rebind(var40, var27);
                }
                final SubLObject var43 = module0202.f12761(Sequences.nreverse(var38));
                return module0202.f12709(var39, var43);
            }
            return var17;
        }
    }
    
    public static SubLObject f46836(final SubLObject var17, final SubLObject var26) {
        final SubLThread var27 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0579.$g4342$.getDynamicValue(var27)) {
            final SubLObject var28 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic345$) });
            module0578.f35476(var28, (SubLObject)ConsesLow.list(var17, var26));
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
            Errors.warn((SubLObject)module0751.$ic345$, var17, var26);
        }
        SubLObject var29 = (SubLObject)module0751.NIL;
        final SubLObject var30 = module0579.$g4342$.currentBinding(var27);
        try {
            module0579.$g4342$.bind((SubLObject)module0751.T, var27);
            final SubLObject var31 = f46835(var17, module0579.$g4343$.getGlobalValue());
            var29 = module0205.f13250(var26, module0579.$g4343$.getGlobalValue(), var31, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        finally {
            module0579.$g4342$.rebind(var30, var27);
        }
        return var29;
    }
    
    public static SubLObject f46837(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0167.f10813(var32) || module0751.NIL != assertion_handles_oc.f11035(var32) || module0751.NIL != module0202.f12590(var32));
    }
    
    public static SubLObject f46839(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0167.f10813(var32) || module0751.NIL != assertion_handles_oc.f11035(var32) || module0751.NIL != module0202.f12590(var32));
    }
    
    public static SubLObject f46838(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0167.f10813(var32) || module0751.NIL != assertion_handles_oc.f11035(var32) || module0751.NIL != module0202.f12590(var32));
    }
    
    public static SubLObject f46840(final SubLObject var498) {
        final SubLThread var499 = SubLProcess.currentSubLThread();
        SubLObject var500 = conses_high.copy_tree(var498);
        SubLObject var501 = (SubLObject)module0751.NIL;
        SubLObject var502 = (SubLObject)module0751.NIL;
        SubLObject var503 = (SubLObject)module0751.NIL;
        SubLObject var504 = (SubLObject)module0751.NIL;
        var502 = module0035.f2399(var500, (SubLObject)module0751.$ic302$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        var503 = var502.first();
        for (var504 = (SubLObject)module0751.ZERO_INTEGER; module0751.NIL != var502; var502 = var502.rest(), var503 = var502.first(), var504 = Numbers.add((SubLObject)module0751.ONE_INTEGER, var504)) {
            var500 = conses_high.subst(module0193.f12075(var504), var503, var500, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        if (module0751.NIL == var501) {
            SubLObject var505 = var500;
            SubLObject var506 = (SubLObject)module0751.NIL;
            var506 = var505.first();
            while (module0751.NIL == var501 && module0751.NIL != var505) {
                if (module0751.NIL == module0409.f28508(var506, module0579.$g4262$.getDynamicValue(var499), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                    var501 = (SubLObject)module0751.$ic159$;
                }
                var505 = var505.rest();
                var506 = var505.first();
            }
        }
        if (var501 != module0751.$ic159$) {
            var501 = (SubLObject)module0751.$ic326$;
        }
        return var501;
    }
    
    public static SubLObject f46841(final SubLObject var498) {
        final SubLThread var499 = SubLProcess.currentSubLThread();
        if (module0751.NIL == var498) {
            final SubLObject var500 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic346$) });
            module0578.f35476(var500, (SubLObject)ConsesLow.list(module0751.EMPTY_SUBL_OBJECT_ARRAY));
        }
        SubLObject var501 = (SubLObject)module0751.NIL;
        SubLObject var502 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var501) {
            SubLObject var503 = var498;
            SubLObject var504 = (SubLObject)module0751.NIL;
            var504 = var503.first();
            while (module0751.NIL == var501 && module0751.NIL != var503) {
                SubLObject var505 = (SubLObject)module0751.NIL;
                SubLObject var507;
                final SubLObject var506 = var507 = var504;
                SubLObject var508 = (SubLObject)module0751.NIL;
                SubLObject var509 = (SubLObject)module0751.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var507, var506, (SubLObject)module0751.$ic347$);
                var508 = var507.first();
                var507 = var507.rest();
                cdestructuring_bind.destructuring_bind_must_consp(var507, var506, (SubLObject)module0751.$ic347$);
                var509 = var507.first();
                var507 = var507.rest();
                if (module0751.NIL == var507) {
                    if (module0751.NIL == var505) {
                        SubLObject var52_510 = var508;
                        SubLObject var510 = (SubLObject)module0751.NIL;
                        var510 = var52_510.first();
                        while (module0751.NIL == var505 && module0751.NIL != var52_510) {
                            if (module0751.NIL != f46842(var510, (SubLObject)module0751.UNPROVIDED)) {
                                if (module0751.NIL != module0578.f35470((SubLObject)module0751.TWO_INTEGER)) {
                                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic348$, var510, module0579.$g4262$.getDynamicValue(var499));
                                }
                                var505 = (SubLObject)module0751.$ic349$;
                            }
                            var52_510 = var52_510.rest();
                            var510 = var52_510.first();
                        }
                    }
                    if (module0751.NIL == var505) {
                        SubLObject var52_511 = var509;
                        SubLObject var511 = (SubLObject)module0751.NIL;
                        var511 = var52_511.first();
                        while (module0751.NIL == var505 && module0751.NIL != var52_511) {
                            if (module0751.NIL == f46842(var511, (SubLObject)module0751.UNPROVIDED)) {
                                if (module0751.NIL != module0578.f35470((SubLObject)module0751.TWO_INTEGER)) {
                                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic350$, var511, module0579.$g4262$.getDynamicValue(var499));
                                }
                                var505 = (SubLObject)module0751.$ic159$;
                            }
                            var52_511 = var52_511.rest();
                            var511 = var52_511.first();
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(var506, (SubLObject)module0751.$ic347$);
                }
                final SubLObject var512 = var505;
                if (!var512.eql((SubLObject)module0751.$ic349$)) {
                    if (var512.eql((SubLObject)module0751.$ic159$)) {
                        var502 = (SubLObject)module0751.T;
                    }
                    else {
                        var501 = (SubLObject)module0751.$ic326$;
                    }
                }
                var503 = var503.rest();
                var504 = var503.first();
            }
        }
        if (var501 == module0751.$ic326$) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic351$, var498);
            }
            return (SubLObject)module0751.$ic326$;
        }
        if (module0751.NIL != var502) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic352$, var498);
            }
            return (SubLObject)module0751.$ic159$;
        }
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic353$, var498);
        }
        return (SubLObject)module0751.$ic349$;
    }
    
    public static SubLObject f46843(final SubLObject var514, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        SubLObject var515 = f46844(var514, var81);
        if (module0751.NIL == var515) {
            final SubLObject var516 = f46762(var514, var81);
            var515 = (SubLObject)SubLObjectFactory.makeBoolean(!var514.equal(var516) && module0751.NIL != f46844(var516, var81));
        }
        return var515;
    }
    
    public static SubLObject f46842(final SubLObject var514, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var515 = SubLProcess.currentSubLThread();
        final SubLObject var516 = module0034.$g879$.getDynamicValue(var515);
        SubLObject var517 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var516) {
            return f46843(var514, var81);
        }
        var517 = module0034.f1857(var516, (SubLObject)module0751.$ic354$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var517) {
            var517 = module0034.f1807(module0034.f1842(var516), (SubLObject)module0751.$ic354$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var516, (SubLObject)module0751.$ic354$, var517);
        }
        final SubLObject var518 = module0034.f1782(var514, var81);
        final SubLObject var519 = module0034.f1814(var517, var518, (SubLObject)module0751.UNPROVIDED);
        if (var519 != module0751.$ic37$) {
            SubLObject var520 = var519;
            SubLObject var521 = (SubLObject)module0751.NIL;
            var521 = var520.first();
            while (module0751.NIL != var520) {
                SubLObject var522 = var521.first();
                final SubLObject var523 = conses_high.second(var521);
                if (var514.equal(var522.first())) {
                    var522 = var522.rest();
                    if (module0751.NIL != var522 && module0751.NIL == var522.rest() && var81.equal(var522.first())) {
                        return module0034.f1959(var523);
                    }
                }
                var520 = var520.rest();
                var521 = var520.first();
            }
        }
        final SubLObject var524 = Values.arg2(var515.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46843(var514, var81)));
        module0034.f1836(var517, var518, var519, var524, (SubLObject)ConsesLow.list(var514, var81));
        return module0034.f1959(var524);
    }
    
    public static SubLObject f46844(final SubLObject var514, final SubLObject var81) {
        final SubLObject var515 = f46845(var514);
        final SubLObject var516 = f46740(var514);
        if (module0751.$ic326$ == var515) {
            return (SubLObject)module0751.T;
        }
        if (module0751.$ic349$ == var515) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != f46846(var516)) {
            return f46847(var516, var81);
        }
        return f46848(var516, var81, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46845(final SubLObject var514) {
        final SubLThread var515 = SubLProcess.currentSubLThread();
        SubLObject var516 = (SubLObject)module0751.$ic159$;
        final SubLObject var517 = (module0751.NIL != module0762.f48210(module0205.f13387(var514, (SubLObject)module0751.UNPROVIDED))) ? module0579.$g4260$.getDynamicValue(var515) : module0579.$g4262$.getDynamicValue(var515);
        if (module0751.NIL != module0202.f12589(var514, module0751.$ic355$)) {
            var516 = (SubLObject)(module0205.f13203(var514, (SubLObject)module0751.UNPROVIDED).equal(module0205.f13204(var514, (SubLObject)module0751.UNPROVIDED)) ? module0751.$ic326$ : module0751.$ic159$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic291$)) {
            var516 = (SubLObject)((module0751.NIL != f46684(module0205.f13203(var514, (SubLObject)module0751.UNPROVIDED), module0205.f13204(var514, (SubLObject)module0751.UNPROVIDED), var517)) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic356$)) {
            var516 = (SubLObject)((module0751.NIL != f46669(module0205.f13203(var514, (SubLObject)module0751.UNPROVIDED), module0205.f13204(var514, (SubLObject)module0751.UNPROVIDED), var517)) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic357$)) {
            var516 = (SubLObject)((module0751.NIL != f46849(module0205.f13203(var514, (SubLObject)module0751.UNPROVIDED), module0205.f13204(var514, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED)) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic265$)) {
            var516 = (SubLObject)((module0751.NIL != f46850(module0205.f13203(var514, (SubLObject)module0751.UNPROVIDED), module0205.f13204(var514, (SubLObject)module0751.UNPROVIDED))) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic358$)) {
            var516 = (SubLObject)(module0228.f15230(module0205.f13364(module0205.f13203(var514, (SubLObject)module0751.UNPROVIDED))).equal(module0228.f15230(module0205.f13204(var514, (SubLObject)module0751.UNPROVIDED))) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic359$)) {
            var516 = (SubLObject)((module0751.NIL != module0202.f12589(module0205.f13204(var514, (SubLObject)module0751.UNPROVIDED), module0205.f13203(var514, (SubLObject)module0751.UNPROVIDED))) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0337.f22630(var514, (SubLObject)module0751.$ic360$)) {
            var516 = (SubLObject)((module0751.NIL != module0202.f12734(module0205.f13387(var514, (SubLObject)module0751.UNPROVIDED), module0205.f13388(var514, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED)) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic361$)) {
            SubLObject var519;
            final SubLObject var518 = var519 = module0205.f13207(var514, (SubLObject)module0751.UNPROVIDED);
            SubLObject var520 = (SubLObject)module0751.NIL;
            SubLObject var521 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var519, var518, (SubLObject)module0751.$ic362$);
            var520 = var519.first();
            var519 = var519.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var519, var518, (SubLObject)module0751.$ic362$);
            var521 = var519.first();
            var519 = var519.rest();
            if (module0751.NIL == var519) {
                var516 = (SubLObject)((module0751.NIL != f46851(var520, var521)) ? module0751.$ic326$ : ((module0751.NIL != f46851(var521, var520)) ? module0751.$ic349$ : module0751.$ic159$));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(var518, (SubLObject)module0751.$ic362$);
            }
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic363$)) {
            var516 = (SubLObject)((module0751.NIL != f46658(module0756.f47691(module0205.f13203(var514, (SubLObject)module0751.UNPROVIDED)), module0205.f13204(var514, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED)) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic364$)) {
            var516 = (SubLObject)((module0751.NIL != f46640(module0756.f47729(module0205.f13203(var514, (SubLObject)module0751.UNPROVIDED)), module0205.f13204(var514, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED)) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic365$)) {
            var516 = (SubLObject)(f46845(module0205.f13387(var514, (SubLObject)module0751.UNPROVIDED)).eql((SubLObject)module0751.$ic326$) ? module0751.$ic349$ : module0751.$ic326$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic366$)) {
            var516 = (SubLObject)(f46845(module0205.f13387(var514, (SubLObject)module0751.UNPROVIDED)).eql((SubLObject)module0751.$ic349$) ? module0751.$ic326$ : module0751.$ic349$);
        }
        else if (module0751.NIL != module0202.f12589(var514, module0751.$ic367$) && module0751.NIL == conses_high.member((SubLObject)module0751.$ic368$, module0762.f48141(module0205.f13387(var514, (SubLObject)module0751.UNPROVIDED)), Symbols.symbol_function((SubLObject)module0751.EQL), Symbols.symbol_function((SubLObject)module0751.$ic369$))) {
            var516 = (SubLObject)module0751.$ic349$;
        }
        else if (module0751.NIL == module0202.f12691(var514, (SubLObject)module0751.UNPROVIDED) || module0751.NIL == f46852(var514)) {
            var516 = (SubLObject)module0751.$ic349$;
        }
        return var516;
    }
    
    public static SubLObject f46852(final SubLObject var514) {
        final SubLThread var515 = SubLProcess.currentSubLThread();
        SubLObject var516 = (SubLObject)module0751.NIL;
        final SubLObject var517 = module0580.f35545();
        final SubLObject var518 = module0034.$g879$.currentBinding(var515);
        try {
            module0034.$g879$.bind(var517, var515);
            SubLObject var519 = (SubLObject)module0751.NIL;
            if (module0751.NIL != var517 && module0751.NIL == module0034.f1842(var517)) {
                var519 = module0034.f1869(var517);
                final SubLObject var520 = Threads.current_process();
                if (module0751.NIL == var519) {
                    module0034.f1873(var517, var520);
                }
                else if (!var519.eql(var520)) {
                    Errors.error((SubLObject)module0751.$ic83$);
                }
            }
            try {
                var516 = module0552.f34036(var514);
            }
            finally {
                final SubLObject var38_523 = Threads.$is_thread_performing_cleanupP$.currentBinding(var515);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var515);
                    if (module0751.NIL != var517 && module0751.NIL == var519) {
                        module0034.f1873(var517, (SubLObject)module0751.NIL);
                    }
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38_523, var515);
                }
            }
        }
        finally {
            module0034.$g879$.rebind(var518, var515);
        }
        return var516;
    }
    
    public static SubLObject f46853(final SubLObject var56) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0202.f12691(var56, (SubLObject)module0751.UNPROVIDED) || (module0751.NIL != module0202.f12925(var56) && module0751.$ic159$ != f46845(var56)));
    }
    
    public static SubLObject f46846(final SubLObject var514) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == module0205.f13145((SubLObject)module0751.$ic370$, var514, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f46770(final SubLObject var83, final SubLObject var524, SubLObject var81, SubLObject var525, SubLObject var437) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var525 == module0751.UNPROVIDED) {
            var525 = (SubLObject)module0751.NIL;
        }
        if (var437 == module0751.UNPROVIDED) {
            var437 = (SubLObject)module0751.NIL;
        }
        return f46854(var83, var524, var81, var525, var437);
    }
    
    public static SubLObject f46781(final SubLObject var526, final SubLObject var524, SubLObject var81, SubLObject var527) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var527 == module0751.UNPROVIDED) {
            var527 = (SubLObject)module0751.NIL;
        }
        return f46855(var526, var524, var81, var527);
    }
    
    public static SubLObject f46851(final SubLObject var528, final SubLObject var529) {
        final SubLObject var530 = f46856(var528);
        final SubLObject var531 = f46857(var529);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f46847((SubLObject)ConsesLow.list(module0751.$ic371$, var530, var531), module0751.$ic286$) || (module0751.NIL != f46858(var530) && module0751.NIL == f46858(var531)));
    }
    
    public static SubLObject f46858(final SubLObject var532) {
        if (module0751.NIL != module0337.f22630(var532, (SubLObject)module0751.$ic372$)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46856(final SubLObject var532) {
        if (module0751.NIL != module0337.f22630(var532, (SubLObject)module0751.$ic373$)) {
            return f46859(module0205.f13203(var532, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.$ic374$);
        }
        return var532;
    }
    
    public static SubLObject f46857(final SubLObject var532) {
        if (module0751.NIL != module0337.f22630(var532, (SubLObject)module0751.$ic373$)) {
            return f46859(module0205.f13203(var532, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.$ic375$);
        }
        return var532;
    }
    
    public static SubLObject f46859(final SubLObject var533, final SubLObject var534) {
        if (module0751.NIL != module0210.f13576(var533, (SubLObject)module0751.UNPROVIDED)) {
            final SubLObject var535 = module0205.f13364(var533);
            if (var535.eql(module0751.$ic376$)) {
                return (SubLObject)module0751.$ic377$;
            }
            if (var535.eql(module0751.$ic378$)) {
                return (SubLObject)module0751.$ic379$;
            }
            if (var535.eql(module0751.$ic380$)) {
                return (SubLObject)module0751.$ic381$;
            }
            if (var535.eql(module0751.$ic382$) || var535.eql(module0751.$ic383$)) {
                return f46860(var533, var534);
            }
        }
        final SubLObject var536 = (SubLObject)((module0751.NIL != module0210.f13565(var533)) ? f46781((SubLObject)module0751.$ic384$, (SubLObject)ConsesLow.listS(module0751.$ic385$, var533, (SubLObject)module0751.$ic386$), module0751.$ic286$, (SubLObject)module0751.$ic387$) : module0751.NIL);
        return (module0751.NIL != var536) ? var536.first() : module0202.f12643(module0751.$ic388$, var533);
    }
    
    public static SubLObject f46860(final SubLObject var536, final SubLObject var534) {
        SubLObject var537 = (SubLObject)module0751.NIL;
        SubLObject var539;
        final SubLObject var538 = var539 = module0205.f13304(var536, (SubLObject)module0751.UNPROVIDED);
        SubLObject var540 = (SubLObject)module0751.NIL;
        SubLObject var541 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var539, var538, (SubLObject)module0751.$ic389$);
        var540 = var539.first();
        var539 = var539.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var539, var538, (SubLObject)module0751.$ic389$);
        var541 = var539.first();
        var539 = var539.rest();
        if (module0751.NIL == var539) {
            if (var534.eql((SubLObject)module0751.$ic374$)) {
                var540 = f46861(var540);
                var541 = f46862(var541);
            }
            else {
                var540 = f46862(var540);
                var541 = f46861(var541);
            }
            final SubLObject var542 = f46770((SubLObject)module0751.$ic384$, (SubLObject)ConsesLow.list(module0751.$ic390$, (SubLObject)module0751.$ic384$, (SubLObject)ConsesLow.list(module0751.$ic391$, var540, var541)), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED).first();
            if (module0751.NIL != var542) {
                var537 = f46863(var536, var542);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(var538, (SubLObject)module0751.$ic389$);
        }
        return var537;
    }
    
    public static SubLObject f46862(final SubLObject var540) {
        if (module0751.NIL != module0337.f22630(var540, (SubLObject)module0751.$ic392$)) {
            return module0205.f13277(var540, (SubLObject)module0751.UNPROVIDED);
        }
        return var540;
    }
    
    public static SubLObject f46861(final SubLObject var540) {
        if (module0751.NIL != module0337.f22630(var540, (SubLObject)module0751.$ic392$)) {
            return module0205.f13277(var540, (SubLObject)module0751.UNPROVIDED);
        }
        return var540;
    }
    
    public static SubLObject f46863(final SubLObject var536, final SubLObject var539) {
        final SubLObject var540 = module0205.f13276(var536);
        if (var540.eql(module0751.$ic382$)) {
            return f46864(var539);
        }
        if (var540.eql(module0751.$ic383$)) {
            return f46865(var539);
        }
        return var539;
    }
    
    public static SubLObject f46864(final SubLObject var539) {
        if (module0751.NIL != f46866(var539)) {
            return module0202.f12817((SubLObject)module0751.ONE_INTEGER, module0048.f_1X(module0205.f13277(var539, (SubLObject)module0751.UNPROVIDED)), var539);
        }
        return var539;
    }
    
    public static SubLObject f46865(final SubLObject var539) {
        if (module0751.NIL != f46866(var539)) {
            return module0202.f12817((SubLObject)module0751.ONE_INTEGER, module0048.f_1_(module0205.f13277(var539, (SubLObject)module0751.UNPROVIDED)), var539);
        }
        return var539;
    }
    
    public static SubLObject f46866(final SubLObject var539) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0202.f12659(var539) && module0751.NIL != module0202.f12734(var539, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED) && module0205.f13277(var539, (SubLObject)module0751.UNPROVIDED).isInteger());
    }
    
    public static SubLObject f46867(final SubLObject var541, final SubLObject var81, final SubLObject var542, final SubLObject var543) {
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46868(final SubLObject var524, SubLObject var81, SubLObject var542) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var542 == module0751.UNPROVIDED) {
            var542 = (SubLObject)module0751.NIL;
        }
        final SubLThread var543 = SubLProcess.currentSubLThread();
        if (module0751.NIL == module0579.$g4340$.getDynamicValue(var543) && module0751.NIL == module0361.f24109(module0360.f23822(var542)) && module0751.NIL == module0035.f2329(var542, (SubLObject)module0751.$ic394$)) {
            var542 = conses_high.putf(conses_high.copy_list(var542), (SubLObject)module0751.$ic395$, module0580.f35558((SubLObject)module0751.T));
        }
        if (module0751.NIL == conses_high.getf(var542, (SubLObject)module0751.$ic396$, (SubLObject)module0751.NIL)) {
            var542 = conses_high.putf(conses_high.copy_list(var542), (SubLObject)module0751.$ic396$, (SubLObject)module0751.NIL);
        }
        final SubLObject var544 = module0580.f35558((SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == module0361.f24109(var544)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic397$, var524, var544);
            }
        }
        else if (module0361.f24112(var544).isZero() && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic398$, var544);
        }
        SubLObject var545 = (SubLObject)module0751.NIL;
        SubLObject var546 = (SubLObject)module0751.NIL;
        SubLObject var547 = (SubLObject)module0751.NIL;
        final SubLObject var548 = (SubLObject)ConsesLow.list(var524, var81, var542);
        if (module0751.NIL == module0161.f10481(var81)) {
            final SubLObject var549 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic399$) });
            module0578.f35476(var549, (SubLObject)ConsesLow.list(var81));
        }
        if (module0751.NIL != module0054.f3959(module0751.$g6020$.getDynamicValue(var543)) && module0751.NIL != module0054.f3979(var548, module0751.$g6020$.getDynamicValue(var543), Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic400$, var524);
            }
        }
        else if (module0751.NIL != module0054.f3959(module0751.$g6020$.getDynamicValue(var543)) && module0054.f3967(module0751.$g6020$.getDynamicValue(var543)).numG(module0751.$g6021$.getDynamicValue(var543))) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic401$, module0054.f3967(module0751.$g6020$.getDynamicValue(var543)));
            }
        }
        else {
            final SubLObject var550 = module0751.$g6020$.currentBinding(var543);
            try {
                module0751.$g6020$.bind((module0751.NIL != module0054.f3959(module0751.$g6020$.getDynamicValue(var543))) ? module0751.$g6020$.getDynamicValue(var543) : module0054.f3968(), var543);
                SubLObject var551 = (SubLObject)module0751.NIL;
                module0054.f3973(var548, module0751.$g6020$.getDynamicValue(var543));
                final SubLObject var552 = module0580.f35545();
                final SubLObject var38_548 = module0034.$g879$.currentBinding(var543);
                try {
                    module0034.$g879$.bind(var552, var543);
                    SubLObject var553 = (SubLObject)module0751.NIL;
                    if (module0751.NIL != var552 && module0751.NIL == module0034.f1842(var552)) {
                        var553 = module0034.f1869(var552);
                        final SubLObject var554 = Threads.current_process();
                        if (module0751.NIL == var553) {
                            module0034.f1873(var552, var554);
                        }
                        else if (!var553.eql(var554)) {
                            Errors.error((SubLObject)module0751.$ic83$);
                        }
                    }
                    try {
                        final SubLObject var555 = Time.get_internal_real_time();
                        var543.resetMultipleValues();
                        final SubLObject var550_551 = module0409.f28506(var524, var81, var542);
                        final SubLObject var552_553 = var543.secondMultipleValue();
                        var543.resetMultipleValues();
                        var545 = var550_551;
                        var547 = var552_553;
                        var551 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var555), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    finally {
                        final SubLObject var38_549 = Threads.$is_thread_performing_cleanupP$.currentBinding(var543);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var543);
                            if (module0751.NIL != var552 && module0751.NIL == var553) {
                                module0034.f1873(var552, (SubLObject)module0751.NIL);
                            }
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(var38_549, var543);
                        }
                    }
                }
                finally {
                    module0034.$g879$.rebind(var38_548, var543);
                }
                if (module0751.NIL != module0107.f7629(module0751.$g6022$.getDynamicValue(var543))) {
                    module0751.$g6022$.setDynamicValue(Numbers.add(module0751.$g6022$.getDynamicValue(var543), var551), var543);
                }
                f46867(var524, var81, var542, var551);
                var546 = (SubLObject)module0751.T;
                module0054.f3974(module0751.$g6020$.getDynamicValue(var543));
            }
            finally {
                module0751.$g6020$.rebind(var550, var543);
            }
        }
        if (module0751.NIL != var545) {
            return Values.values(var545, var546);
        }
        if (module0751.NIL != module0360.f23871(var547)) {
            final SubLObject var549 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203(module0360.f23876(var547)) });
            module0578.f35476(var549, (SubLObject)ConsesLow.list(module0751.EMPTY_SUBL_OBJECT_ARRAY));
        }
        else if (module0751.$ic402$ == var547) {
            final SubLObject var549 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic403$) });
            module0578.f35476(var549, (SubLObject)ConsesLow.list(var524, var81));
        }
        else if (var547 == module0751.$ic404$) {
            final SubLObject var556 = module0360.f23835(var542);
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic405$, var524, var556);
            }
        }
        return Values.values(var545, var546);
    }
    
    public static SubLObject f46869(final SubLObject var556, final SubLObject var184, SubLObject var81, SubLObject var84) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var84 == module0751.UNPROVIDED) {
            var84 = (SubLObject)module0751.$ic100$;
        }
        final SubLThread var557 = SubLProcess.currentSubLThread();
        SubLObject var558 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0206.f13433(var184)) {
            final SubLObject var559 = module0580.f35545();
            final SubLObject var560 = module0034.$g879$.currentBinding(var557);
            try {
                module0034.$g879$.bind(var559, var557);
                SubLObject var561 = (SubLObject)module0751.NIL;
                if (module0751.NIL != var559 && module0751.NIL == module0034.f1842(var559)) {
                    var561 = module0034.f1869(var559);
                    final SubLObject var562 = Threads.current_process();
                    if (module0751.NIL == var561) {
                        module0034.f1873(var559, var562);
                    }
                    else if (!var561.eql(var562)) {
                        Errors.error((SubLObject)module0751.$ic83$);
                    }
                }
                try {
                    var558 = module0347.f23344(var556, var184, var81, (SubLObject)module0751.$ic326$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic407$, var84));
                }
                finally {
                    final SubLObject var38_557 = Threads.$is_thread_performing_cleanupP$.currentBinding(var557);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var557);
                        if (module0751.NIL != var559 && module0751.NIL == var561) {
                            module0034.f1873(var559, (SubLObject)module0751.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var38_557, var557);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var560, var557);
            }
        }
        return var558;
    }
    
    public static SubLObject f46628(final SubLObject var556, final SubLObject var184, SubLObject var81, SubLObject var84) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var84 == module0751.UNPROVIDED) {
            var84 = (SubLObject)module0751.$ic100$;
        }
        final SubLThread var557 = SubLProcess.currentSubLThread();
        final SubLObject var558 = module0034.$g879$.getDynamicValue(var557);
        SubLObject var559 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var558) {
            return f46869(var556, var184, var81, var84);
        }
        var559 = module0034.f1857(var558, (SubLObject)module0751.$ic406$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var559) {
            var559 = module0034.f1807(module0034.f1842(var558), (SubLObject)module0751.$ic406$, (SubLObject)module0751.FOUR_INTEGER, (SubLObject)module0751.$ic408$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var558, (SubLObject)module0751.$ic406$, var559);
        }
        final SubLObject var560 = module0034.f1780(var556, var184, var81, var84);
        final SubLObject var561 = module0034.f1814(var559, var560, (SubLObject)module0751.UNPROVIDED);
        if (var561 != module0751.$ic37$) {
            SubLObject var562 = var561;
            SubLObject var563 = (SubLObject)module0751.NIL;
            var563 = var562.first();
            while (module0751.NIL != var562) {
                SubLObject var564 = var563.first();
                final SubLObject var565 = conses_high.second(var563);
                if (var556.equal(var564.first())) {
                    var564 = var564.rest();
                    if (var184.equal(var564.first())) {
                        var564 = var564.rest();
                        if (var81.equal(var564.first())) {
                            var564 = var564.rest();
                            if (module0751.NIL != var564 && module0751.NIL == var564.rest() && var84.equal(var564.first())) {
                                return module0034.f1959(var565);
                            }
                        }
                    }
                }
                var562 = var562.rest();
                var563 = var562.first();
            }
        }
        final SubLObject var566 = Values.arg2(var557.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46869(var556, var184, var81, var84)));
        module0034.f1836(var559, var560, var561, var566, (SubLObject)ConsesLow.list(var556, var184, var81, var84));
        return module0034.f1959(var566);
    }
    
    public static SubLObject f46870(SubLObject var514, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var515 = SubLProcess.currentSubLThread();
        final SubLObject var516 = (SubLObject)module0751.$ic410$;
        SubLObject var517 = (SubLObject)module0751.NIL;
        SubLObject var518 = (SubLObject)module0751.NIL;
        SubLObject var519 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0206.f13433(var514)) {
            var514 = module0172.f10922(var514);
            final SubLObject var520 = module0580.f35545();
            final SubLObject var521 = module0034.$g879$.currentBinding(var515);
            try {
                module0034.$g879$.bind(var520, var515);
                SubLObject var522 = (SubLObject)module0751.NIL;
                if (module0751.NIL != var520 && module0751.NIL == module0034.f1842(var520)) {
                    var522 = module0034.f1869(var520);
                    final SubLObject var523 = Threads.current_process();
                    if (module0751.NIL == var522) {
                        module0034.f1873(var520, var523);
                    }
                    else if (!var522.eql(var523)) {
                        Errors.error((SubLObject)module0751.$ic83$);
                    }
                }
                try {
                    final SubLObject var38_558 = module0148.$g2099$.currentBinding(var515);
                    try {
                        module0148.$g2099$.bind((SubLObject)module0751.$ic231$, var515);
                        SubLObject var524 = (SubLObject)module0751.NIL;
                        SubLObject var525 = (SubLObject)module0751.NIL;
                        final SubLObject var526 = Time.get_internal_real_time();
                        try {
                            var515.throwStack.push(module0003.$g3$.getGlobalValue());
                            final SubLObject var38_559 = Errors.$error_handler$.currentBinding(var515);
                            try {
                                Errors.$error_handler$.bind((SubLObject)module0751.$ic38$, var515);
                                try {
                                    var524 = module0347.f23334(var514, var81, (SubLObject)module0751.$ic326$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic407$, var516));
                                }
                                catch (Throwable var527) {
                                    Errors.handleThrowable(var527, (SubLObject)module0751.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(var38_559, var515);
                            }
                        }
                        catch (Throwable var528) {
                            var525 = Errors.handleThrowable(var528, module0003.$g3$.getGlobalValue());
                        }
                        finally {
                            var515.throwStack.pop();
                        }
                        var519 = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), var526), time_high.$internal_time_units_per_second$.getGlobalValue());
                        if (module0751.NIL != var525 && module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                            Errors.warn((SubLObject)module0751.$ic411$, var514, var525);
                        }
                        f46867(var514, var81, (SubLObject)module0751.NIL, var519);
                        var518 = (SubLObject)module0751.T;
                        if (module0751.NIL != module0751.$g6023$.getDynamicValue(var515)) {
                            f46871(var514, var81, var524, var516);
                        }
                        var517 = module0035.sublisp_boolean(var524);
                    }
                    finally {
                        module0148.$g2099$.rebind(var38_558, var515);
                    }
                }
                finally {
                    final SubLObject var38_560 = Threads.$is_thread_performing_cleanupP$.currentBinding(var515);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var515);
                        if (module0751.NIL != var520 && module0751.NIL == var522) {
                            module0034.f1873(var520, (SubLObject)module0751.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var38_560, var515);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var521, var515);
            }
        }
        return Values.values(var517, var518);
    }
    
    public static SubLObject f46847(final SubLObject var514, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var515 = SubLProcess.currentSubLThread();
        final SubLObject var516 = module0034.$g879$.getDynamicValue(var515);
        SubLObject var517 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var516) {
            return f46870(var514, var81);
        }
        var517 = module0034.f1857(var516, (SubLObject)module0751.$ic409$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var517) {
            var517 = module0034.f1807(module0034.f1842(var516), (SubLObject)module0751.$ic409$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.$ic412$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var516, (SubLObject)module0751.$ic409$, var517);
        }
        final SubLObject var518 = module0034.f1782(var514, var81);
        final SubLObject var519 = module0034.f1814(var517, var518, (SubLObject)module0751.UNPROVIDED);
        if (var519 != module0751.$ic37$) {
            SubLObject var520 = var519;
            SubLObject var521 = (SubLObject)module0751.NIL;
            var521 = var520.first();
            while (module0751.NIL != var520) {
                SubLObject var522 = var521.first();
                final SubLObject var523 = conses_high.second(var521);
                if (var514.equal(var522.first())) {
                    var522 = var522.rest();
                    if (module0751.NIL != var522 && module0751.NIL == var522.rest() && var81.equal(var522.first())) {
                        return module0034.f1959(var523);
                    }
                }
                var520 = var520.rest();
                var521 = var520.first();
            }
        }
        final SubLObject var524 = Values.arg2(var515.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46870(var514, var81)));
        module0034.f1836(var517, var518, var519, var524, (SubLObject)ConsesLow.list(var514, var81));
        return module0034.f1959(var524);
    }
    
    public static SubLObject f46871(final SubLObject var514, final SubLObject var81, final SubLObject var559, final SubLObject var84) {
        final SubLObject var560 = f46868(var514, var81, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic413$, (SubLObject)module0751.NIL, (SubLObject)module0751.$ic407$, var84));
        SubLObject var561 = (SubLObject)module0751.NIL;
        var561 = Equality.eq(module0540.f33526(var560), module0035.sublisp_boolean(var559));
        if (module0751.NIL == var561) {
            Errors.sublisp_break((SubLObject)module0751.$ic414$, new SubLObject[] { var514, var559, var560 });
        }
        return var561;
    }
    
    public static SubLObject f46709(final SubLObject var32, SubLObject var563, SubLObject var564) {
        if (var563 == module0751.UNPROVIDED) {
            var563 = (SubLObject)module0751.NIL;
        }
        if (var564 == module0751.UNPROVIDED) {
            var564 = module0579.$g4262$.getDynamicValue();
        }
        final SubLObject var565 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0173.f10955(var32) && module0751.NIL == module0205.f13220(var32, module0202.f12787(var563, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.T, Symbols.symbol_function((SubLObject)module0751.EQ), (SubLObject)module0751.UNPROVIDED) && module0751.NIL != f46847((SubLObject)ConsesLow.list(module0751.$ic415$, var32), (SubLObject)module0751.UNPROVIDED));
        if (module0751.NIL != var565) {}
        return var565;
    }
    
    public static SubLObject f46872(final SubLObject var524, SubLObject var81, SubLObject var566) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var566 == module0751.UNPROVIDED) {
            var566 = (SubLObject)module0751.ZERO_INTEGER;
        }
        final SubLThread var567 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0202.f12883(var524, (SubLObject)module0751.UNPROVIDED)) {
            return f46848(module0205.f13204(var524, (SubLObject)module0751.UNPROVIDED), module0205.f13203(var524, (SubLObject)module0751.UNPROVIDED), var566);
        }
        if (module0751.NIL != module0202.f12595(var524) || module0751.NIL != module0202.f12594(var524) || module0751.NIL != module0202.f12592(var524) || module0751.NIL != module0202.f12925(var524)) {
            SubLObject var568 = (SubLObject)module0751.T;
            final SubLObject var569 = module0763.f48316(var524);
            final SubLObject var570 = module0579.$g4262$.currentBinding(var567);
            try {
                module0579.$g4262$.bind(var81, var567);
                SubLObject var571 = var569;
                SubLObject var572 = (SubLObject)module0751.NIL;
                var572 = var571.first();
                while (module0751.NIL != var571) {
                    SubLObject var573 = (SubLObject)module0751.NIL;
                    SubLObject var574 = (SubLObject)module0751.NIL;
                    if (module0751.NIL == var573) {
                        SubLObject var575 = module0232.f15308(var572);
                        SubLObject var576 = (SubLObject)module0751.NIL;
                        var576 = var575.first();
                        while (module0751.NIL == var573 && module0751.NIL != var575) {
                            final SubLObject var578;
                            final SubLObject var577 = var578 = f46845(var576);
                            if (var578.eql((SubLObject)module0751.$ic326$)) {
                                if (module0751.NIL == var574) {
                                    var574 = (SubLObject)module0751.$ic326$;
                                }
                            }
                            else if (var578.eql((SubLObject)module0751.$ic349$)) {
                                var574 = (SubLObject)module0751.$ic349$;
                                var573 = (SubLObject)module0751.T;
                            }
                            else if (var578.eql((SubLObject)module0751.$ic159$)) {
                                var574 = (SubLObject)module0751.$ic159$;
                            }
                            var575 = var575.rest();
                            var576 = var575.first();
                        }
                    }
                    if (module0751.NIL == var573) {
                        SubLObject var575 = module0232.f15306(var572);
                        SubLObject var576 = (SubLObject)module0751.NIL;
                        var576 = var575.first();
                        while (module0751.NIL == var573 && module0751.NIL != var575) {
                            final SubLObject var578;
                            final SubLObject var577 = var578 = f46845(var576);
                            if (var578.eql((SubLObject)module0751.$ic349$)) {
                                if (module0751.NIL == var574) {
                                    var574 = (SubLObject)module0751.$ic326$;
                                }
                            }
                            else if (var578.eql((SubLObject)module0751.$ic326$)) {
                                var574 = (SubLObject)module0751.$ic349$;
                                var573 = (SubLObject)module0751.T;
                            }
                            else if (var578.eql((SubLObject)module0751.$ic159$)) {
                                var574 = (SubLObject)module0751.$ic159$;
                            }
                            var575 = var575.rest();
                            var576 = var575.first();
                        }
                    }
                    final SubLObject var579 = var574;
                    if (var579.eql((SubLObject)module0751.$ic326$)) {
                        return (SubLObject)module0751.T;
                    }
                    if (var579.eql((SubLObject)module0751.$ic159$)) {
                        var568 = (SubLObject)module0751.NIL;
                    }
                    var571 = var571.rest();
                    var572 = var571.first();
                }
                if (module0751.NIL != var568) {
                    return (SubLObject)module0751.NIL;
                }
            }
            finally {
                module0579.$g4262$.rebind(var570, var567);
            }
        }
        final SubLObject var580 = (SubLObject)ConsesLow.list((SubLObject)module0751.$ic404$, (SubLObject)module0751.THREE_INTEGER, (SubLObject)module0751.$ic418$, var566, (SubLObject)module0751.$ic419$, (SubLObject)module0751.NIL, (SubLObject)module0751.$ic420$, (SubLObject)module0751.ONE_INTEGER);
        return module0540.f33526(f46868(var524, var81, var580));
    }
    
    public static SubLObject f46848(final SubLObject var524, SubLObject var81, SubLObject var566) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var566 == module0751.UNPROVIDED) {
            var566 = (SubLObject)module0751.ZERO_INTEGER;
        }
        final SubLThread var567 = SubLProcess.currentSubLThread();
        final SubLObject var568 = module0034.$g879$.getDynamicValue(var567);
        SubLObject var569 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var568) {
            return f46872(var524, var81, var566);
        }
        var569 = module0034.f1857(var568, (SubLObject)module0751.$ic416$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var569) {
            var569 = module0034.f1807(module0034.f1842(var568), (SubLObject)module0751.$ic416$, (SubLObject)module0751.THREE_INTEGER, (SubLObject)module0751.$ic412$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var568, (SubLObject)module0751.$ic416$, var569);
        }
        final SubLObject var570 = module0034.f1781(var524, var81, var566);
        final SubLObject var571 = module0034.f1814(var569, var570, (SubLObject)module0751.UNPROVIDED);
        if (var571 != module0751.$ic37$) {
            SubLObject var572 = var571;
            SubLObject var573 = (SubLObject)module0751.NIL;
            var573 = var572.first();
            while (module0751.NIL != var572) {
                SubLObject var574 = var573.first();
                final SubLObject var575 = conses_high.second(var573);
                if (var524.equal(var574.first())) {
                    var574 = var574.rest();
                    if (var81.equal(var574.first())) {
                        var574 = var574.rest();
                        if (module0751.NIL != var574 && module0751.NIL == var574.rest() && var566.equal(var574.first())) {
                            return module0034.f1959(var575);
                        }
                    }
                }
                var572 = var572.rest();
                var573 = var572.first();
            }
        }
        final SubLObject var576 = Values.arg2(var567.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46872(var524, var81, var566)));
        module0034.f1836(var569, var570, var571, var576, (SubLObject)ConsesLow.list(var524, var81, var566));
        return module0034.f1959(var576);
    }
    
    public static SubLObject f46873(final SubLObject var524, final SubLObject var81, SubLObject var525, SubLObject var437) {
        if (var525 == module0751.UNPROVIDED) {
            var525 = (SubLObject)module0751.NIL;
        }
        if (var437 == module0751.UNPROVIDED) {
            var437 = (SubLObject)module0751.NIL;
        }
        final SubLObject var526 = module0434.f30570(var525, var437, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        return f46868(var524, var81, var526);
    }
    
    public static SubLObject f46874(final SubLObject var524, final SubLObject var81, SubLObject var525, SubLObject var437) {
        if (var525 == module0751.UNPROVIDED) {
            var525 = (SubLObject)module0751.NIL;
        }
        if (var437 == module0751.UNPROVIDED) {
            var437 = (SubLObject)module0751.NIL;
        }
        final SubLThread var526 = SubLProcess.currentSubLThread();
        final SubLObject var527 = module0034.$g879$.getDynamicValue(var526);
        SubLObject var528 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var527) {
            return f46873(var524, var81, var525, var437);
        }
        var528 = module0034.f1857(var527, (SubLObject)module0751.$ic421$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var528) {
            var528 = module0034.f1807(module0034.f1842(var527), (SubLObject)module0751.$ic421$, (SubLObject)module0751.FOUR_INTEGER, (SubLObject)module0751.$ic328$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var527, (SubLObject)module0751.$ic421$, var528);
        }
        final SubLObject var529 = module0034.f1780(var524, var81, var525, var437);
        final SubLObject var530 = module0034.f1814(var528, var529, (SubLObject)module0751.UNPROVIDED);
        if (var530 != module0751.$ic37$) {
            SubLObject var531 = var530;
            SubLObject var532 = (SubLObject)module0751.NIL;
            var532 = var531.first();
            while (module0751.NIL != var531) {
                SubLObject var533 = var532.first();
                final SubLObject var534 = conses_high.second(var532);
                if (var524.equal(var533.first())) {
                    var533 = var533.rest();
                    if (var81.equal(var533.first())) {
                        var533 = var533.rest();
                        if (var525.equal(var533.first())) {
                            var533 = var533.rest();
                            if (module0751.NIL != var533 && module0751.NIL == var533.rest() && var437.equal(var533.first())) {
                                return module0034.f1959(var534);
                            }
                        }
                    }
                }
                var531 = var531.rest();
                var532 = var531.first();
            }
        }
        final SubLObject var535 = Values.arg2(var526.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46873(var524, var81, var525, var437)));
        module0034.f1836(var528, var529, var530, var535, (SubLObject)ConsesLow.list(var524, var81, var525, var437));
        return module0034.f1959(var535);
    }
    
    public static SubLObject f46854(final SubLObject var17, final SubLObject var524, final SubLObject var81, SubLObject var525, SubLObject var437) {
        if (var525 == module0751.UNPROVIDED) {
            var525 = (SubLObject)module0751.NIL;
        }
        if (var437 == module0751.UNPROVIDED) {
            var437 = (SubLObject)module0751.NIL;
        }
        final SubLObject var526 = module0434.f30570(var525, var437, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        return f46855(var17, var524, var81, var526);
    }
    
    public static SubLObject f46875(final SubLObject var17, final SubLObject var524, SubLObject var81, SubLObject var527) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var527 == module0751.UNPROVIDED) {
            var527 = (SubLObject)module0751.NIL;
        }
        final SubLObject var528 = conses_high.putf(conses_high.copy_list(var527), (SubLObject)module0751.$ic423$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic424$, var17));
        return f46868(var524, var81, var528);
    }
    
    public static SubLObject f46855(final SubLObject var17, final SubLObject var524, SubLObject var81, SubLObject var527) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var527 == module0751.UNPROVIDED) {
            var527 = (SubLObject)module0751.NIL;
        }
        final SubLThread var528 = SubLProcess.currentSubLThread();
        final SubLObject var529 = module0034.$g879$.getDynamicValue(var528);
        SubLObject var530 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var529) {
            return f46875(var17, var524, var81, var527);
        }
        var530 = module0034.f1857(var529, (SubLObject)module0751.$ic422$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var530) {
            var530 = module0034.f1807(module0034.f1842(var529), (SubLObject)module0751.$ic422$, (SubLObject)module0751.FOUR_INTEGER, (SubLObject)module0751.$ic408$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var529, (SubLObject)module0751.$ic422$, var530);
        }
        final SubLObject var531 = module0034.f1780(var17, var524, var81, var527);
        final SubLObject var532 = module0034.f1814(var530, var531, (SubLObject)module0751.UNPROVIDED);
        if (var532 != module0751.$ic37$) {
            SubLObject var533 = var532;
            SubLObject var534 = (SubLObject)module0751.NIL;
            var534 = var533.first();
            while (module0751.NIL != var533) {
                SubLObject var535 = var534.first();
                final SubLObject var536 = conses_high.second(var534);
                if (var17.equal(var535.first())) {
                    var535 = var535.rest();
                    if (var524.equal(var535.first())) {
                        var535 = var535.rest();
                        if (var81.equal(var535.first())) {
                            var535 = var535.rest();
                            if (module0751.NIL != var535 && module0751.NIL == var535.rest() && var527.equal(var535.first())) {
                                return module0034.f1959(var536);
                            }
                        }
                    }
                }
                var533 = var533.rest();
                var534 = var533.first();
            }
        }
        final SubLObject var537 = Values.arg2(var528.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46875(var17, var524, var81, var527)));
        module0034.f1836(var530, var531, var532, var537, (SubLObject)ConsesLow.list(var17, var524, var81, var527));
        return module0034.f1959(var537);
    }
    
    public static SubLObject f46876(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        final SubLObject var182 = module0077.f5313(Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL != module0579.$g4292$.getDynamicValue(var181) && module0751.NIL != module0202.f12590(var180)) {
            SubLObject var183 = (SubLObject)module0751.ZERO_INTEGER;
            SubLObject var185;
            final SubLObject var184 = var185 = module0205.f13207(var180, (SubLObject)module0751.$ic314$);
            SubLObject var186 = (SubLObject)module0751.NIL;
            var186 = var185.first();
            while (module0751.NIL != var185) {
                var183 = Numbers.add(var183, (SubLObject)module0751.ONE_INTEGER);
                if (module0751.NIL != f46877(var186) && module0751.NIL != f46878(var180, var183)) {
                    if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                        PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic425$, new SubLObject[] { var186, var183, var180 });
                    }
                    module0077.f5326((SubLObject)ConsesLow.list(var183), var182);
                }
                final SubLObject var187 = module0077.f5333(f46876(var186));
                SubLObject var188;
                SubLObject var189;
                SubLObject var190;
                for (var188 = module0032.f1741(var187), var189 = (SubLObject)module0751.NIL, var189 = module0032.f1742(var188, var187); module0751.NIL == module0032.f1744(var188, var189); var189 = module0032.f1743(var189)) {
                    var190 = module0032.f1745(var188, var189);
                    if (module0751.NIL != module0032.f1746(var189, var190)) {
                        module0077.f5326((SubLObject)ConsesLow.cons(var183, var190), var182);
                    }
                }
                var185 = var185.rest();
                var186 = var185.first();
            }
        }
        return var182;
    }
    
    public static SubLObject f46878(final SubLObject var26, final SubLObject var25) {
        if (module0751.NIL == module0202.f12590(var26)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != module0765.f48662(module0205.f13132(var26), var25, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != module0337.f22630(var26, (SubLObject)module0751.$ic426$)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(var25.eql((SubLObject)module0751.ONE_INTEGER) && module0751.NIL != module0212.f13762(module0205.f13204(var26, (SubLObject)module0751.UNPROVIDED)) && module0751.NIL != f46669(module0205.f13204(var26, (SubLObject)module0751.UNPROVIDED), module0751.$ic427$, (SubLObject)module0751.UNPROVIDED));
        }
        final SubLObject var27 = (SubLObject)module0751.$ic428$;
        final SubLObject var28 = module0202.f12817(var25, var27, var26);
        final SubLObject var29 = module0754.f47360(var27, var28, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        return module0004.f104(module0751.$ic427$, var29, (SubLObject)module0751.$ic429$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46879(final SubLObject var238) {
        final SubLThread var239 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0077.f5302(module0579.$g4293$.getDynamicValue(var239)) && module0751.NIL != module0077.f5320(module0756.f47817(var238), module0579.$g4293$.getDynamicValue(var239)));
    }
    
    public static SubLObject f46880(final SubLObject var238) {
        if (module0751.NIL != f46879(var238) && module0751.NIL == module0756.f47540(var238)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic430$, module0756.f47487(var238, (SubLObject)module0751.UNPROVIDED));
            }
            if (module0751.NIL != f46881(module0756.f47487(var238, (SubLObject)module0751.UNPROVIDED))) {
                module0756.f47783(var238, module0751.$ic431$, (SubLObject)module0751.UNPROVIDED);
            }
            else {
                module0756.f47542(var238);
            }
        }
        return var238;
    }
    
    public static SubLObject f46882(final SubLObject var26, SubLObject var576, SubLObject var564, SubLObject var577) {
        if (var576 == module0751.UNPROVIDED) {
            var576 = module0579.$g4260$.getDynamicValue();
        }
        if (var564 == module0751.UNPROVIDED) {
            var564 = module0579.$g4262$.getDynamicValue();
        }
        if (var577 == module0751.UNPROVIDED) {
            var577 = (SubLObject)module0751.NIL;
        }
        return f46883(module0202.f12702(var26), var576, var564, var577);
    }
    
    public static SubLObject f46883(SubLObject var26, SubLObject var576, SubLObject var564, SubLObject var577) {
        if (var576 == module0751.UNPROVIDED) {
            var576 = module0579.$g4260$.getDynamicValue();
        }
        if (var564 == module0751.UNPROVIDED) {
            var564 = module0579.$g4262$.getDynamicValue();
        }
        if (var577 == module0751.UNPROVIDED) {
            var577 = (SubLObject)module0751.NIL;
        }
        final SubLThread var578 = SubLProcess.currentSubLThread();
        assert module0751.NIL != module0202.f12590(var26) : var26;
        final SubLObject var579 = module0067.f4880((SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var580 = module0580.$g4361$.currentBinding(var578);
        try {
            module0580.$g4361$.bind((SubLObject)module0751.NIL, var578);
            var578.resetMultipleValues();
            final SubLObject var38_579 = module0580.$g4362$.currentBinding(var578);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var578);
                final SubLObject var581 = var578.secondMultipleValue();
                var578.resetMultipleValues();
                try {
                    var578.resetMultipleValues();
                    final SubLObject var38_580 = module0580.$g4358$.currentBinding(var578);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var578);
                        final SubLObject var582 = var578.secondMultipleValue();
                        var578.resetMultipleValues();
                        final SubLObject var38_581 = module0580.$g4359$.currentBinding(var578);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var578);
                            final SubLObject var583 = module0580.$g4358$.getDynamicValue(var578);
                            final SubLObject var38_582 = module0034.$g879$.currentBinding(var578);
                            try {
                                module0034.$g879$.bind(var583, var578);
                                SubLObject var584 = (SubLObject)module0751.NIL;
                                if (module0751.NIL != var583 && module0751.NIL == module0034.f1842(var583)) {
                                    var584 = module0034.f1869(var583);
                                    final SubLObject var585 = Threads.current_process();
                                    if (module0751.NIL == var584) {
                                        module0034.f1873(var583, var585);
                                    }
                                    else if (!var584.eql(var585)) {
                                        Errors.error((SubLObject)module0751.$ic83$);
                                    }
                                }
                                try {
                                    final SubLObject var38_583 = module0751.$g6024$.currentBinding(var578);
                                    try {
                                        module0751.$g6024$.bind(f46884(var26, var576, var564, var577), var578);
                                        if (module0751.NIL != module0035.f2439(Symbols.symbol_function((SubLObject)module0751.$ic203$), module0751.$g6024$.getDynamicValue(var578), (SubLObject)module0751.UNPROVIDED)) {
                                            SubLObject var586 = module0751.$g6024$.getDynamicValue(var578);
                                            SubLObject var587 = (SubLObject)module0751.NIL;
                                            var587 = var586.first();
                                            while (module0751.NIL != var586) {
                                                SubLObject var589;
                                                final SubLObject var588 = var589 = var587;
                                                SubLObject var590 = (SubLObject)module0751.NIL;
                                                SubLObject var591 = (SubLObject)module0751.NIL;
                                                cdestructuring_bind.destructuring_bind_must_consp(var589, var588, (SubLObject)module0751.$ic434$);
                                                var590 = var589.first();
                                                var589 = (var591 = var589.rest());
                                                if (module0751.NIL != var591) {
                                                    var26 = f46885(var591, var590, var26, var579);
                                                }
                                                var586 = var586.rest();
                                                var587 = var586.first();
                                            }
                                        }
                                    }
                                    finally {
                                        module0751.$g6024$.rebind(var38_583, var578);
                                    }
                                }
                                finally {
                                    final SubLObject var38_584 = Threads.$is_thread_performing_cleanupP$.currentBinding(var578);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var578);
                                        if (module0751.NIL != var583 && module0751.NIL == var584) {
                                            module0034.f1873(var583, (SubLObject)module0751.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var38_584, var578);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var38_582, var578);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var38_581, var578);
                        }
                        if (var582 == module0751.$ic435$ && module0751.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var578))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var578));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var38_580, var578);
                    }
                }
                finally {
                    final SubLObject var38_585 = Threads.$is_thread_performing_cleanupP$.currentBinding(var578);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var578);
                        if (module0751.NIL == var581) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var578));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var38_585, var578);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var38_579, var578);
            }
        }
        finally {
            module0580.$g4361$.rebind(var580, var578);
        }
        return Values.values(var26, module0084.f5780(var579));
    }
    
    public static SubLObject f46884(final SubLObject var26, SubLObject var576, SubLObject var564, SubLObject var577) {
        if (var576 == module0751.UNPROVIDED) {
            var576 = module0579.$g4260$.getDynamicValue();
        }
        if (var564 == module0751.UNPROVIDED) {
            var564 = module0579.$g4262$.getDynamicValue();
        }
        if (var577 == module0751.UNPROVIDED) {
            var577 = (SubLObject)module0751.NIL;
        }
        final SubLThread var578 = SubLProcess.currentSubLThread();
        assert module0751.NIL != module0202.f12590(var26) : var26;
        assert module0751.NIL != module0161.f10499(var576) : var576;
        assert module0751.NIL != module0161.f10499(var564) : var564;
        if (module0751.NIL != var577 && !module0751.areAssertionsDisabledFor(me) && module0751.NIL == module0202.f12590(var577)) {
            throw new AssertionError(var577);
        }
        assert module0751.NIL != module0202.f12590(var26) : var26;
        final SubLObject var579 = f46886(var26, var564, var577);
        SubLObject var580 = Mapping.mapcar((SubLObject)module0751.$ic437$, var579);
        final SubLObject var581 = module0580.$g4361$.currentBinding(var578);
        try {
            module0580.$g4361$.bind((SubLObject)module0751.NIL, var578);
            var578.resetMultipleValues();
            final SubLObject var38_593 = module0580.$g4362$.currentBinding(var578);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var578);
                final SubLObject var582 = var578.secondMultipleValue();
                var578.resetMultipleValues();
                try {
                    var578.resetMultipleValues();
                    final SubLObject var38_594 = module0580.$g4358$.currentBinding(var578);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var578);
                        final SubLObject var583 = var578.secondMultipleValue();
                        var578.resetMultipleValues();
                        final SubLObject var38_595 = module0580.$g4359$.currentBinding(var578);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var578);
                            final SubLObject var584 = module0580.$g4358$.getDynamicValue(var578);
                            final SubLObject var38_596 = module0034.$g879$.currentBinding(var578);
                            try {
                                module0034.$g879$.bind(var584, var578);
                                SubLObject var585 = (SubLObject)module0751.NIL;
                                if (module0751.NIL != var584 && module0751.NIL == module0034.f1842(var584)) {
                                    var585 = module0034.f1869(var584);
                                    final SubLObject var586 = Threads.current_process();
                                    if (module0751.NIL == var585) {
                                        module0034.f1873(var584, var586);
                                    }
                                    else if (!var585.eql(var586)) {
                                        Errors.error((SubLObject)module0751.$ic83$);
                                    }
                                }
                                try {
                                    SubLObject var587 = var579;
                                    SubLObject var588 = (SubLObject)module0751.NIL;
                                    var588 = var587.first();
                                    while (module0751.NIL != var587) {
                                        final SubLObject var589 = f46887(var588, var26, var576, var564, (SubLObject)module0751.UNPROVIDED);
                                        var580 = module0035.f2063(var580, var588, var589, (SubLObject)module0751.UNPROVIDED);
                                        var587 = var587.rest();
                                        var588 = var587.first();
                                    }
                                }
                                finally {
                                    final SubLObject var38_597 = Threads.$is_thread_performing_cleanupP$.currentBinding(var578);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var578);
                                        if (module0751.NIL != var584 && module0751.NIL == var585) {
                                            module0034.f1873(var584, (SubLObject)module0751.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var38_597, var578);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var38_596, var578);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var38_595, var578);
                        }
                        if (var583 == module0751.$ic435$ && module0751.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var578))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var578));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var38_594, var578);
                    }
                }
                finally {
                    final SubLObject var38_598 = Threads.$is_thread_performing_cleanupP$.currentBinding(var578);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var578);
                        if (module0751.NIL == var582) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var578));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var38_598, var578);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var38_593, var578);
            }
        }
        finally {
            module0580.$g4361$.rebind(var581, var578);
        }
        return var580;
    }
    
    public static SubLObject f46886(final SubLObject var26, SubLObject var564, SubLObject var577) {
        if (var564 == module0751.UNPROVIDED) {
            var564 = module0579.$g4262$.getDynamicValue();
        }
        if (var577 == module0751.UNPROVIDED) {
            var577 = (SubLObject)module0751.NIL;
        }
        if (module0751.NIL == var577) {
            return Sequences.nreverse(module0205.f13183(var26, (SubLObject)module0751.$ic302$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
        }
        SubLObject var578 = (SubLObject)module0751.NIL;
        SubLObject var579 = module0205.f13183(var26, (SubLObject)module0751.$ic302$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        SubLObject var580 = (SubLObject)module0751.NIL;
        var580 = var579.first();
        while (module0751.NIL != var579) {
            if (module0751.NIL == module0205.f13220(var580, var577, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                var578 = (SubLObject)ConsesLow.cons(var580, var578);
            }
            else {
                final SubLObject var581 = module0307.f20803(var580, var577, var564, (SubLObject)module0751.UNPROVIDED);
                final SubLObject var582 = module0307.f20803(var580, var26, var564, (SubLObject)module0751.UNPROVIDED);
                final SubLObject var583 = module0307.f20810(var580, var577, var564, (SubLObject)module0751.UNPROVIDED);
                final SubLObject var584 = module0307.f20810(var580, var26, var564, (SubLObject)module0751.UNPROVIDED);
                final SubLObject var585 = conses_high.set_difference(var581, var582, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                final SubLObject var586 = conses_high.set_difference(var582, var581, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                final SubLObject var587 = conses_high.set_difference(var583, var584, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                final SubLObject var588 = conses_high.set_difference(var584, var583, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                if (module0751.NIL != module0256.f16609(var585, var586, var564, (SubLObject)module0751.UNPROVIDED)) {
                    var578 = (SubLObject)ConsesLow.cons(var580, var578);
                }
                else if (module0751.NIL != module0256.f16609(var587, var588, var564, (SubLObject)module0751.UNPROVIDED)) {
                    var578 = (SubLObject)ConsesLow.cons(var580, var578);
                }
            }
            var579 = var579.rest();
            var580 = var579.first();
        }
        return var578;
    }
    
    public static SubLObject f46887(final SubLObject var83, final SubLObject var26, SubLObject var576, SubLObject var564, SubLObject var607) {
        if (var576 == module0751.UNPROVIDED) {
            var576 = module0579.$g4260$.getDynamicValue();
        }
        if (var564 == module0751.UNPROVIDED) {
            var564 = module0579.$g4262$.getDynamicValue();
        }
        if (var607 == module0751.UNPROVIDED) {
            var607 = (SubLObject)module0751.NIL;
        }
        final SubLThread var608 = SubLProcess.currentSubLThread();
        assert module0751.NIL != module0201.f12546(var83) : var83;
        assert module0751.NIL != module0202.f12590(var26) : var26;
        final SubLObject var609 = module0202.f12763(var26);
        SubLObject var610 = (SubLObject)module0751.NIL;
        final SubLObject var611 = module0580.$g4361$.currentBinding(var608);
        try {
            module0580.$g4361$.bind((SubLObject)module0751.NIL, var608);
            var608.resetMultipleValues();
            final SubLObject var38_610 = module0580.$g4362$.currentBinding(var608);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var608);
                final SubLObject var612 = var608.secondMultipleValue();
                var608.resetMultipleValues();
                try {
                    var608.resetMultipleValues();
                    final SubLObject var38_611 = module0580.$g4358$.currentBinding(var608);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var608);
                        final SubLObject var613 = var608.secondMultipleValue();
                        var608.resetMultipleValues();
                        final SubLObject var38_612 = module0580.$g4359$.currentBinding(var608);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var608);
                            final SubLObject var614 = module0580.$g4358$.getDynamicValue(var608);
                            final SubLObject var38_613 = module0034.$g879$.currentBinding(var608);
                            try {
                                module0034.$g879$.bind(var614, var608);
                                SubLObject var615 = (SubLObject)module0751.NIL;
                                if (module0751.NIL != var614 && module0751.NIL == module0034.f1842(var614)) {
                                    var615 = module0034.f1869(var614);
                                    final SubLObject var616 = Threads.current_process();
                                    if (module0751.NIL == var615) {
                                        module0034.f1873(var614, var616);
                                    }
                                    else if (!var615.eql(var616)) {
                                        Errors.error((SubLObject)module0751.$ic83$);
                                    }
                                }
                                try {
                                    var608.resetMultipleValues();
                                    final SubLObject var617 = f46888(var83, var609, var576);
                                    final SubLObject var618 = var608.secondMultipleValue();
                                    var608.resetMultipleValues();
                                    var608.resetMultipleValues();
                                    final SubLObject var619 = f46889(var83, var609, var576, var564, var607);
                                    final SubLObject var620 = var608.secondMultipleValue();
                                    var608.resetMultipleValues();
                                    if (!var617.isString()) {
                                        var610 = var619;
                                    }
                                    else if (!var619.isString()) {
                                        var610 = var617;
                                    }
                                    else if (module0751.NIL != f46890(var618, var620)) {
                                        var610 = var617;
                                    }
                                    else {
                                        var610 = var619;
                                    }
                                }
                                finally {
                                    final SubLObject var38_614 = Threads.$is_thread_performing_cleanupP$.currentBinding(var608);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var608);
                                        if (module0751.NIL != var614 && module0751.NIL == var615) {
                                            module0034.f1873(var614, (SubLObject)module0751.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var38_614, var608);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var38_613, var608);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var38_612, var608);
                        }
                        if (var613 == module0751.$ic435$ && module0751.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var608))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var608));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var38_611, var608);
                    }
                }
                finally {
                    final SubLObject var38_615 = Threads.$is_thread_performing_cleanupP$.currentBinding(var608);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var608);
                        if (module0751.NIL == var612) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var608));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var38_615, var608);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var38_610, var608);
            }
        }
        finally {
            module0580.$g4361$.rebind(var611, var608);
        }
        return (SubLObject)(var610.isString() ? var610 : module0751.NIL);
    }
    
    public static SubLObject f46888(final SubLObject var83, final SubLObject var26, final SubLObject var576) {
        final SubLThread var577 = SubLProcess.currentSubLThread();
        SubLObject var578 = (SubLObject)module0751.NIL;
        SubLObject var579 = (SubLObject)module0751.NIL;
        final SubLObject var580 = module0579.$g4260$.currentBinding(var577);
        try {
            module0579.$g4260$.bind(var576, var577);
            if (module0751.NIL == var578) {
                SubLObject var581 = f46891(var83, var26);
                SubLObject var582 = (SubLObject)module0751.NIL;
                var582 = var581.first();
                while (module0751.NIL == var578 && module0751.NIL != var581) {
                    if (module0751.NIL == f46892(var83, var582, var26)) {
                        SubLObject var584;
                        final SubLObject var583 = var584 = var582;
                        SubLObject var585 = (SubLObject)module0751.NIL;
                        SubLObject var586 = (SubLObject)module0751.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(var584, var583, (SubLObject)module0751.$ic443$);
                        var585 = var584.first();
                        var584 = (var586 = var584.rest());
                        if (module0751.NIL != module0173.f10955(var585) && module0751.NIL != module0269.f17706(var585) && module0751.NIL != module0765.f48638(var586, var585) && module0751.NIL == var578) {
                            SubLObject var52_623 = module0035.f2293(module0765.f48616(var585, (SubLObject)module0751.UNPROVIDED), var586, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                            SubLObject var587 = (SubLObject)module0751.NIL;
                            var587 = var52_623.first();
                            while (module0751.NIL == var578 && module0751.NIL != var52_623) {
                                SubLObject var627_628;
                                final SubLObject var625_626 = var627_628 = var587;
                                SubLObject var588 = (SubLObject)module0751.NIL;
                                SubLObject var589 = (SubLObject)module0751.NIL;
                                SubLObject var590 = (SubLObject)module0751.NIL;
                                SubLObject var591 = (SubLObject)module0751.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(var627_628, var625_626, (SubLObject)module0751.$ic444$);
                                var588 = var627_628.first();
                                var627_628 = var627_628.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var627_628, var625_626, (SubLObject)module0751.$ic444$);
                                var589 = var627_628.first();
                                var627_628 = var627_628.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var627_628, var625_626, (SubLObject)module0751.$ic444$);
                                var590 = var627_628.first();
                                var627_628 = var627_628.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(var627_628, var625_626, (SubLObject)module0751.$ic444$);
                                var591 = var627_628.first();
                                var627_628 = var627_628.rest();
                                if (module0751.NIL == var627_628) {
                                    SubLObject var592 = module0764.f48440(var589, var591, (SubLObject)module0751.$ic445$, var576);
                                    if (var592.isString() && module0751.NIL != module0035.f1994(var592, module0751.$g6025$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED)) {
                                        if (module0751.NIL != module0035.f2013(var588)) {
                                            final SubLObject var593 = Numbers.add(Sequences.length(var592), Functions.apply(Symbols.symbol_function((SubLObject)module0751.$ic446$), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0751.$ic447$), var588)), Sequences.length(var588));
                                            if (var593.numLE(module0751.$g6025$.getGlobalValue())) {
                                                var592 = Sequences.cconcatenate(module0038.f2761(var588, (SubLObject)module0751.UNPROVIDED), new SubLObject[] { module0751.$ic62$, var592 });
                                            }
                                        }
                                        var578 = var592;
                                        var579 = var585;
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(var625_626, (SubLObject)module0751.$ic444$);
                                }
                                var52_623 = var52_623.rest();
                                var587 = var52_623.first();
                            }
                        }
                    }
                    var581 = var581.rest();
                    var582 = var581.first();
                }
            }
        }
        finally {
            module0579.$g4260$.rebind(var580, var577);
        }
        return Values.values(var578, var579);
    }
    
    public static SubLObject f46892(final SubLObject var83, final SubLObject var402, final SubLObject var26) {
        final SubLThread var403 = SubLProcess.currentSubLThread();
        SubLObject var404;
        SubLObject var405;
        SubLObject var406;
        SubLObject var408;
        SubLObject var407;
        SubLObject var409;
        SubLObject var410;
        for (var404 = (SubLObject)module0751.NIL, var405 = (SubLObject)module0751.NIL, var405 = module0751.$g6024$.getDynamicValue(var403); module0751.NIL == var404 && module0751.NIL != var405; var404 = (SubLObject)SubLObjectFactory.makeBoolean(!var83.eql(var409) && module0751.NIL != conses_high.member(var402, f46891(var409, var26), Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED)), var405 = var405.rest()) {
            var406 = var405.first();
            var407 = (var408 = var406);
            var409 = (SubLObject)module0751.NIL;
            var410 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var408, var407, (SubLObject)module0751.$ic448$);
            var409 = var408.first();
            var408 = (var410 = var408.rest());
        }
        return var404;
    }
    
    public static SubLObject f46893(final SubLObject var83, final SubLObject var26) {
        SubLObject var84 = (SubLObject)module0751.NIL;
        SubLObject var85 = module0205.f13397(var83, var26, (SubLObject)module0751.UNPROVIDED);
        SubLObject var86 = (SubLObject)module0751.NIL;
        var86 = var85.first();
        while (module0751.NIL != var85) {
            final SubLObject var87 = module0035.f2114(var86);
            final SubLObject var88 = module0035.f2152(var86, (SubLObject)module0751.ZERO_INTEGER);
            final SubLObject var89 = module0205.f13394(var26, var88, (SubLObject)module0751.UNPROVIDED);
            final SubLObject var90 = (SubLObject)ConsesLow.cons(var89, var87);
            if (module0751.NIL == conses_high.member(var90, var84, Symbols.symbol_function((SubLObject)module0751.EQUAL), Symbols.symbol_function((SubLObject)module0751.IDENTITY))) {
                var84 = (SubLObject)ConsesLow.cons(var90, var84);
            }
            var85 = var85.rest();
            var86 = var85.first();
        }
        return var84;
    }
    
    public static SubLObject f46891(final SubLObject var83, final SubLObject var26) {
        final SubLThread var84 = SubLProcess.currentSubLThread();
        final SubLObject var85 = module0034.$g879$.getDynamicValue(var84);
        SubLObject var86 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var85) {
            return f46893(var83, var26);
        }
        var86 = module0034.f1857(var85, (SubLObject)module0751.$ic449$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var86) {
            var86 = module0034.f1807(module0034.f1842(var85), (SubLObject)module0751.$ic449$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var85, (SubLObject)module0751.$ic449$, var86);
        }
        final SubLObject var87 = module0034.f1782(var83, var26);
        final SubLObject var88 = module0034.f1814(var86, var87, (SubLObject)module0751.UNPROVIDED);
        if (var88 != module0751.$ic37$) {
            SubLObject var89 = var88;
            SubLObject var90 = (SubLObject)module0751.NIL;
            var90 = var89.first();
            while (module0751.NIL != var89) {
                SubLObject var91 = var90.first();
                final SubLObject var92 = conses_high.second(var90);
                if (var83.equal(var91.first())) {
                    var91 = var91.rest();
                    if (module0751.NIL != var91 && module0751.NIL == var91.rest() && var26.equal(var91.first())) {
                        return module0034.f1959(var92);
                    }
                }
                var89 = var89.rest();
                var90 = var89.first();
            }
        }
        final SubLObject var93 = Values.arg2(var84.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46893(var83, var26)));
        module0034.f1836(var86, var87, var88, var93, (SubLObject)ConsesLow.list(var83, var26));
        return module0034.f1959(var93);
    }
    
    public static SubLObject f46889(final SubLObject var83, final SubLObject var26, final SubLObject var576, final SubLObject var564, SubLObject var607) {
        if (var607 == module0751.UNPROVIDED) {
            var607 = (SubLObject)module0751.NIL;
        }
        final SubLThread var608 = SubLProcess.currentSubLThread();
        final SubLObject var609 = f46894(module0754.f47360(var83, var26, var564, (SubLObject)module0751.T, var607, (SubLObject)module0751.$ic450$), var564);
        SubLObject var610 = (SubLObject)module0751.NIL;
        SubLObject var611 = (SubLObject)module0751.NIL;
        SubLObject var612 = (SubLObject)module0751.NIL;
        SubLObject var613 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var610) {
            SubLObject var614 = var609;
            SubLObject var615 = (SubLObject)module0751.NIL;
            var615 = var614.first();
            while (module0751.NIL == var610 && module0751.NIL != var614) {
                SubLObject var616;
                SubLObject var617;
                SubLObject var618;
                SubLObject var620;
                SubLObject var619;
                SubLObject var621;
                SubLObject var622;
                for (var616 = (SubLObject)module0751.NIL, var617 = (SubLObject)module0751.NIL, var617 = module0751.$g6024$.getDynamicValue(var608); module0751.NIL == var616 && module0751.NIL != var617; var616 = (SubLObject)SubLObjectFactory.makeBoolean(!var83.eql(var621) && module0751.NIL != conses_high.member(var615, module0754.f47360(var621, var26, var564, (SubLObject)module0751.T, (SubLObject)module0751.T, (SubLObject)module0751.$ic450$), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)), var617 = var617.rest()) {
                    var618 = var617.first();
                    var619 = (var620 = var618);
                    var621 = (SubLObject)module0751.NIL;
                    var622 = (SubLObject)module0751.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(var620, var619, (SubLObject)module0751.$ic451$);
                    var621 = var620.first();
                    var620 = (var622 = var620.rest());
                }
                if (module0751.NIL != var616) {
                    var612 = (SubLObject)ConsesLow.cons(var615, var612);
                }
                else {
                    var613 = (SubLObject)ConsesLow.cons(var615, var613);
                }
                var614 = var614.rest();
                var615 = var614.first();
            }
        }
        final SubLObject var623 = module0579.$g4262$.currentBinding(var608);
        try {
            module0579.$g4262$.bind(var564, var608);
            final SubLObject var624 = Mapping.mapcan((SubLObject)module0751.$ic452$, var613, module0751.EMPTY_SUBL_OBJECT_ARRAY);
            final SubLObject var625 = f46895(var624);
            if (module0751.NIL == var610) {
                SubLObject var626;
                SubLObject var627;
                for (var626 = var625, var627 = (SubLObject)module0751.NIL, var627 = var626.first(); module0751.NIL == var610 && module0751.NIL != var626; var610 = f46896(var627, var576), var611 = var627, var626 = var626.rest(), var627 = var626.first()) {}
            }
        }
        finally {
            module0579.$g4262$.rebind(var623, var608);
        }
        if (module0751.NIL == var610) {
            SubLObject var614;
            SubLObject var615;
            for (var614 = Sequences.nreverse(var612), var615 = (SubLObject)module0751.NIL, var615 = var614.first(); module0751.NIL == var610 && module0751.NIL != var614; var610 = f46896(var615, var576), var611 = var615, var614 = var614.rest(), var615 = var614.first()) {}
        }
        return Values.values(var610, var611);
    }
    
    public static SubLObject f46897(final SubLObject var68, SubLObject var437, SubLObject var81) {
        if (var437 == module0751.UNPROVIDED) {
            var437 = (SubLObject)module0751.TEN_INTEGER;
        }
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        return f46898(var68, var437, var81, (SubLObject)module0751.NIL, (SubLObject)module0751.NIL);
    }
    
    public static SubLObject f46895(final SubLObject var648) {
        return Sort.sort(var648, (SubLObject)module0751.$ic453$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46899(final SubLObject var649, final SubLObject var650) {
        if (var649.equal(var650)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != f46669(var649, var650, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == f46669(var650, var649, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != f46669(var650, var649, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == f46669(var649, var650, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != module0549.f33910(var649, var650)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != module0549.f33910(var650, var649)) {
            return (SubLObject)module0751.NIL;
        }
        return Strings.stringL(module0213.f13920(var649), module0213.f13920(var650), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46894(SubLObject var640, final SubLObject var564) {
        final SubLThread var641 = SubLProcess.currentSubLThread();
        for (SubLObject var642 = module0257.f16688(var640, var564); module0751.NIL != var642; var642 = module0257.f16688(var640, var564)) {
            final SubLObject var643 = module0147.f9540(var564);
            final SubLObject var644 = module0147.$g2095$.currentBinding(var641);
            final SubLObject var645 = module0147.$g2094$.currentBinding(var641);
            final SubLObject var646 = module0147.$g2096$.currentBinding(var641);
            try {
                module0147.$g2095$.bind(module0147.f9545(var643), var641);
                module0147.$g2094$.bind(module0147.f9546(var643), var641);
                module0147.$g2096$.bind(module0147.f9549(var643), var641);
                final SubLObject var647 = module0256.f16637(var642, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                var640 = conses_high.union(var647, module0035.f2220(var640, var642, Symbols.symbol_function((SubLObject)module0751.EQUAL)), Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var646, var641);
                module0147.$g2094$.rebind(var645, var641);
                module0147.$g2095$.rebind(var644, var641);
            }
        }
        return Sort.sort(var640, (SubLObject)module0751.$ic454$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46896(final SubLObject var643, final SubLObject var576) {
        final SubLThread var644 = SubLProcess.currentSubLThread();
        SubLObject var645 = (SubLObject)module0751.NIL;
        final SubLObject var646 = module0579.$g4260$.currentBinding(var644);
        try {
            module0579.$g4260$.bind(var576, var644);
            final SubLObject var647 = (SubLObject)ConsesLow.list(module0751.$ic455$, (SubLObject)ConsesLow.list(module0751.$ic185$, module0751.$ic3$, var643));
            final SubLObject var648 = module0770.f49050(var647, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            if (module0751.NIL != module0035.f1994(var648, module0751.$g6025$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED)) {
                var645 = var648;
            }
        }
        finally {
            module0579.$g4260$.rebind(var646, var644);
        }
        return var645;
    }
    
    public static SubLObject f46885(final SubLObject var632, final SubLObject var83, SubLObject var26, final SubLObject var578) {
        final SubLThread var633 = SubLProcess.currentSubLThread();
        final SubLObject var634 = f46900(var632);
        final SubLObject var635 = module0201.f12563(var83);
        SubLObject var636 = var83;
        if (var634.isString()) {
            if (!var635.equal(var634)) {
                var633.resetMultipleValues();
                final SubLObject var656_657 = f46901(var83, var26, var634, var578);
                final SubLObject var658_659 = var633.secondMultipleValue();
                var633.resetMultipleValues();
                var26 = var656_657;
                var636 = var658_659;
            }
        }
        return Values.values(var26, var636);
    }
    
    public static SubLObject f46901(final SubLObject var83, SubLObject var26, final SubLObject var654, final SubLObject var578) {
        final SubLThread var655 = SubLProcess.currentSubLThread();
        final SubLObject var656 = Sequences.find(var654, module0205.f13183(var26, (SubLObject)module0751.$ic302$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), Symbols.symbol_function((SubLObject)module0751.EQUALP), (SubLObject)module0751.$ic456$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var657 = module0751.$g6026$.currentBinding(var655);
        try {
            module0751.$g6026$.bind(module0048.f_1X(module0751.$g6026$.getDynamicValue(var655)), var655);
            final SubLObject var658 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != var656 && !var656.eql(var83));
            if (module0751.$g6026$.getDynamicValue(var655).numG((SubLObject)module0751.FIVE_INTEGER)) {
                Errors.sublisp_break((SubLObject)module0751.$ic457$, module0751.EMPTY_SUBL_OBJECT_ARRAY);
            }
            SubLObject var659 = f46834(var26, var654, var658);
            if (module0751.NIL == module0201.f12557(var659)) {
                var659 = var83;
            }
            if (!var83.eql(var659)) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                    PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic458$, var83, var659);
                }
                var26 = module0205.f13251(var659, var83, var26, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                f46902(var83, var659, var578);
            }
        }
        finally {
            module0751.$g6026$.rebind(var657, var655);
        }
        return var26;
    }
    
    public static SubLObject f46902(final SubLObject var663, final SubLObject var485, final SubLObject var578) {
        final SubLObject var664 = module0084.f5806(var578, var663, (SubLObject)module0751.NIL);
        if (module0751.NIL != var664) {
            module0067.f4886(var578, var664, var485);
        }
        else {
            module0067.f4886(var578, var663, var485);
        }
        return var578;
    }
    
    public static SubLObject f46834(final SubLObject var26, SubLObject var665, SubLObject var661) {
        if (var665 == module0751.UNPROVIDED) {
            var665 = (SubLObject)module0751.NIL;
        }
        if (var661 == module0751.UNPROVIDED) {
            var661 = (SubLObject)module0751.NIL;
        }
        if (!var665.isString()) {
            var665 = (SubLObject)module0751.$ic459$;
        }
        final SubLObject var666 = f46903(var26, var665, var661);
        final SubLObject var667 = module0279.f18511(var665, var666);
        return module0201.f12550(var667);
    }
    
    public static SubLObject f46903(final SubLObject var26, final SubLObject var665, final SubLObject var661) {
        final SubLObject var666 = module0205.f13183(var26, (SubLObject)module0751.$ic302$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var667 = module0201.f12548(module0201.f12550(var665));
        SubLObject var668 = Mapping.mapcar((SubLObject)module0751.$ic460$, var666);
        if (module0751.NIL != conses_high.member(var667, var668, Symbols.symbol_function((SubLObject)module0751.EQUALP), (SubLObject)module0751.UNPROVIDED)) {
            final SubLObject var669 = module0279.f18511(var665, (SubLObject)ConsesLow.list(var667));
            if (module0751.NIL == conses_high.member(var669, var668, Symbols.symbol_function((SubLObject)module0751.EQUALP), Symbols.symbol_function((SubLObject)module0751.IDENTITY))) {
                var668 = (SubLObject)ConsesLow.cons(var669, var668);
            }
        }
        if (module0751.NIL != var661) {
            var668 = (SubLObject)ConsesLow.cons(var667, var668);
        }
        return var668;
    }
    
    public static SubLObject f46904(final SubLObject var189) {
        final SubLObject var190 = f46905(var189);
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0173.f10955(var190) && !var190.eql(module0751.$ic151$));
    }
    
    public static SubLObject f46900(final SubLObject var632) {
        return module0202.f12694(var632);
    }
    
    public static SubLObject f46906(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var32.isList() && var32.first().isString() && module0751.NIL != module0035.f2192((SubLObject)module0751.$ic461$, conses_high.second(var32)));
    }
    
    public static SubLObject f46907(final SubLObject var94, final SubLObject var64) {
        assert module0751.NIL != module0035.f2015(var64) : var64;
        SubLObject var95 = var64;
        SubLObject var96 = (SubLObject)module0751.NIL;
        var96 = var95.first();
        while (module0751.NIL != var95) {
            assert module0751.NIL != f46908(var96) : var96;
            var95 = var95.rest();
            var96 = var95.first();
        }
        return (SubLObject)ConsesLow.list(module0581.f35684(var94), var64);
    }
    
    public static SubLObject f46909(final SubLObject var673) {
        return f46907(module0038.f2658(f46910(var673)), Mapping.mapcar((SubLObject)module0751.$ic463$, f46911(var673)));
    }
    
    public static SubLObject f46912(final SubLObject var10) {
        final SubLObject var11 = (SubLObject)ConsesLow.make_list(Sequences.length(var10), (SubLObject)module0751.UNPROVIDED);
        SubLObject var12 = (SubLObject)module0751.NIL;
        SubLObject var13 = (SubLObject)module0751.NIL;
        SubLObject var14 = (SubLObject)module0751.NIL;
        var12 = var10;
        var13 = var12.first();
        for (var14 = (SubLObject)module0751.ZERO_INTEGER; module0751.NIL != var12; var12 = var12.rest(), var13 = var12.first(), var14 = Numbers.add((SubLObject)module0751.ONE_INTEGER, var14)) {
            SubLObject var15 = var13;
            if (var13.isString()) {
                var15 = module0038.f2658(var13);
            }
            else if (var13.isCons()) {
                var15 = conses_high.copy_tree(var13);
            }
            ConsesLow.set_nth(var14, var11, var15);
        }
        return var11;
    }
    
    public static SubLObject f46910(final SubLObject var673) {
        assert module0751.NIL != f46906(var673) : var673;
        return var673.first();
    }
    
    public static SubLObject f46913(SubLObject var673, SubLObject var676) {
        if (var676 == module0751.UNPROVIDED) {
            var676 = (SubLObject)module0751.T;
        }
        assert module0751.NIL != f46906(var673) : var673;
        if (module0751.NIL != var676) {
            var673 = f46914(var673);
        }
        SubLObject var677 = (SubLObject)module0751.NIL;
        SubLObject var678 = (SubLObject)module0751.NIL;
        try {
            var678 = streams_high.make_private_string_output_stream();
            SubLObject var679 = f46915(var673);
            SubLObject var680 = (SubLObject)module0751.NIL;
            var680 = var679.first();
            while (module0751.NIL != var679) {
                print_high.princ(f46916(var680), var678);
                var679 = var679.rest();
                var680 = var679.first();
            }
            var677 = streams_high.get_output_stream_string(var678);
        }
        finally {
            final SubLObject var681 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0751.T);
                streams_high.close(var678, (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var681);
            }
        }
        return var677;
    }
    
    public static SubLObject f46916(final SubLObject var10) {
        assert module0751.NIL != f46908(var10) : var10;
        SubLObject var11 = (SubLObject)module0751.NIL;
        SubLObject var12 = (SubLObject)module0751.NIL;
        try {
            var12 = streams_high.make_private_string_output_stream();
            final SubLObject var13 = f46917(var10);
            if (module0751.NIL != f46918(var10, var13)) {
                print_high.princ(var13, var12);
            }
            print_high.princ(f46919(var10), var12);
            final SubLObject var14 = f46920(var10);
            if (module0751.NIL != f46918(var10, var14)) {
                print_high.princ(var14, var12);
            }
            var11 = streams_high.get_output_stream_string(var12);
        }
        finally {
            final SubLObject var15 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)module0751.T);
                streams_high.close(var12, (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, var15);
            }
        }
        return var11;
    }
    
    public static SubLObject f46918(final SubLObject var10, final SubLObject var134) {
        final SubLThread var135 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(var134.isString() && (module0751.NIL != module0579.$g4304$.getDynamicValue(var135) || module0751.NIL == module0756.f47776(f46921(var10))));
    }
    
    public static SubLObject f46914(final SubLObject var673) {
        SubLObject var674 = (SubLObject)module0751.NIL;
        SubLObject var675 = (SubLObject)module0751.NIL;
        SubLObject var676 = f46915(var673);
        SubLObject var677 = (SubLObject)module0751.NIL;
        var677 = var676.first();
        while (module0751.NIL != var676) {
            if (module0751.NIL != f46922(var677, var675)) {
                var675 = (SubLObject)ConsesLow.cons(var677, var675);
            }
            else {
                var674 = f46923(var674, var675);
                var675 = (SubLObject)ConsesLow.list(var677);
            }
            var676 = var676.rest();
            var677 = var676.first();
        }
        if (module0751.NIL != var675) {
            var674 = f46923(var674, var675);
        }
        return (SubLObject)ConsesLow.list(f46910(var673), Sequences.nreverse(var674));
    }
    
    public static SubLObject f46922(final SubLObject var682, final SubLObject var681) {
        final SubLObject var683 = f46921(var682);
        SubLObject var684 = (SubLObject)module0751.NIL;
        if (module0751.NIL != f46924(var683) && module0751.NIL == var684) {
            SubLObject var685 = var681;
            SubLObject var686 = (SubLObject)module0751.NIL;
            var686 = var685.first();
            while (module0751.NIL == var684 && module0751.NIL != var685) {
                final SubLObject var687 = f46921(var686);
                var684 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f46924(var687) && !conses_high.butlast(var683, (SubLObject)module0751.UNPROVIDED).equal(conses_high.butlast(var687, (SubLObject)module0751.UNPROVIDED)));
                var685 = var685.rest();
                var686 = var685.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var684);
    }
    
    public static SubLObject f46925(final SubLObject var686) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0756.f47776(f46921(var686)) && module0751.NIL != module0269.f17726(f46926(var686)));
    }
    
    public static SubLObject f46923(final SubLObject var680, final SubLObject var681) {
        if (module0751.NIL == Sequences.find_if((SubLObject)module0751.$ic465$, var681, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return ConsesLow.append(var681, var680);
        }
        SubLObject var682 = (SubLObject)module0751.NIL;
        SubLObject var683 = (SubLObject)module0751.NIL;
        SubLObject var684 = (SubLObject)module0751.NIL;
        SubLObject var685 = (SubLObject)module0751.NIL;
        SubLObject var686 = (SubLObject)module0751.NIL;
        SubLObject var687 = var681;
        SubLObject var688 = (SubLObject)module0751.NIL;
        var688 = var687.first();
        while (module0751.NIL != var687) {
            if (module0751.NIL == var685 && module0751.NIL == module0756.f47694(f46926(var688))) {
                var684 = (SubLObject)ConsesLow.cons(var688, var684);
            }
            else {
                var685 = (SubLObject)module0751.T;
                var686 = (SubLObject)ConsesLow.cons(var688, var686);
            }
            var687 = var687.rest();
            var688 = var687.first();
        }
        var684 = Sequences.nreverse(var684);
        var685 = (SubLObject)module0751.NIL;
        var687 = var686;
        SubLObject var689 = (SubLObject)module0751.NIL;
        var689 = var687.first();
        while (module0751.NIL != var687) {
            if (module0751.NIL == var685 && module0751.NIL == module0756.f47694(f46926(var689))) {
                var682 = (SubLObject)ConsesLow.cons(var689, var682);
            }
            else {
                var685 = (SubLObject)module0751.T;
                var683 = (SubLObject)ConsesLow.cons(var689, var683);
            }
            var687 = var687.rest();
            var689 = var687.first();
        }
        final SubLObject var690 = f46927(var683);
        return ConsesLow.append(var684, (SubLObject)ConsesLow.list(var690), var682, var680);
    }
    
    public static SubLObject f46927(SubLObject var688) {
        final SubLThread var689 = SubLProcess.currentSubLThread();
        final SubLObject var690 = Sequences.remove(f46705(), var688, Symbols.symbol_function((SubLObject)module0751.EQL), Symbols.symbol_function((SubLObject)module0751.$ic466$), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var691 = Sort.sort(conses_high.copy_list(var690), (SubLObject)module0751.$ic467$, Symbols.symbol_function((SubLObject)module0751.$ic466$));
        final SubLObject var692 = module0202.f12761(Mapping.mapcar(Symbols.symbol_function((SubLObject)module0751.$ic468$), var691));
        final SubLObject var693 = conses_high.butlast(f46921(var691.first()), (SubLObject)module0751.UNPROVIDED);
        SubLObject var694 = (SubLObject)module0751.NIL;
        var688 = Sequences.nreverse(var688);
        var694 = Functions.apply(Symbols.symbol_function((SubLObject)module0751.$ic224$), Mapping.mapcar(Symbols.symbol_function((SubLObject)module0751.$ic469$), var688));
        final SubLObject var695 = f46928(var688.first());
        SubLObject var696 = (SubLObject)module0751.NIL;
        final SubLObject var697 = module0579.$g4298$.currentBinding(var689);
        final SubLObject var698 = module0579.$g4301$.currentBinding(var689);
        final SubLObject var699 = module0579.$g4302$.currentBinding(var689);
        try {
            module0579.$g4298$.bind((SubLObject)module0751.$ic470$, var689);
            module0579.$g4301$.bind(module0579.$g4301$.getDynamicValue(var689), var689);
            module0579.$g4302$.bind((SubLObject)module0751.$ic471$, var689);
            var689.resetMultipleValues();
            final SubLObject var700 = module0769.f49014(var692);
            final SubLObject var701 = var689.secondMultipleValue();
            var689.resetMultipleValues();
            var696 = f46929(var694, var692, var693, var700, var701, var695);
        }
        finally {
            module0579.$g4302$.rebind(var699, var689);
            module0579.$g4301$.rebind(var698, var689);
            module0579.$g4298$.rebind(var697, var689);
        }
        return var696;
    }
    
    public static SubLObject f46930(final SubLObject var673, final SubLObject var94) {
        return ConsesLow.rplaca(var673, var94);
    }
    
    public static SubLObject f46911(final SubLObject var673) {
        assert module0751.NIL != f46906(var673) : var673;
        return conses_high.copy_list(f46915(var673));
    }
    
    public static SubLObject f46915(final SubLObject var673) {
        return conses_high.second(var673);
    }
    
    public static SubLObject f46931(final SubLObject var673) {
        return module0035.f1997(f46915(var673));
    }
    
    public static SubLObject f46932(final SubLObject var673) {
        assert module0751.NIL != f46931(var673) : var673;
        return f46915(var673).first();
    }
    
    public static SubLObject f46933(final SubLObject var673) {
        return module0035.f2114(f46915(var673));
    }
    
    public static SubLObject f46908(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var32.isList() && module0751.NIL != module0035.f1995(var32, (SubLObject)module0751.SIX_INTEGER, (SubLObject)module0751.UNPROVIDED) && var32.first().isString());
    }
    
    public static SubLObject f46929(final SubLObject var94, final SubLObject var180, final SubLObject var76, final SubLObject var678, final SubLObject var679, final SubLObject var699) {
        return (SubLObject)ConsesLow.list(module0581.f35684(var94), var180, var76, var678, var679, var699);
    }
    
    public static SubLObject f46919(final SubLObject var10) {
        return var10.first();
    }
    
    public static SubLObject f46934(final SubLObject var10, final SubLObject var94) {
        return ConsesLow.rplaca(var10, var94);
    }
    
    public static SubLObject f46926(final SubLObject var10) {
        return conses_high.second(var10);
    }
    
    public static SubLObject f46935(final SubLObject var10, final SubLObject var76) {
        return ConsesLow.set_nth((SubLObject)module0751.ONE_INTEGER, var10, var76);
    }
    
    public static SubLObject f46921(final SubLObject var10) {
        return conses_high.third(var10);
    }
    
    public static SubLObject f46936(final SubLObject var10, final SubLObject var76) {
        return ConsesLow.set_nth((SubLObject)module0751.TWO_INTEGER, var10, var76);
    }
    
    public static SubLObject f46917(final SubLObject var10) {
        return conses_high.fourth(var10);
    }
    
    public static SubLObject f46937(final SubLObject var10, final SubLObject var678) {
        return ConsesLow.set_nth((SubLObject)module0751.THREE_INTEGER, var10, var678);
    }
    
    public static SubLObject f46920(final SubLObject var10) {
        return conses_high.fifth(var10);
    }
    
    public static SubLObject f46938(final SubLObject var10, final SubLObject var679) {
        return ConsesLow.set_nth((SubLObject)module0751.FOUR_INTEGER, var10, var679);
    }
    
    public static SubLObject f46928(final SubLObject var10) {
        return conses_high.sixth(var10);
    }
    
    public static SubLObject f46939(final SubLObject var10, final SubLObject var699) {
        return ConsesLow.set_nth((SubLObject)module0751.FIVE_INTEGER, var10, var699);
    }
    
    public static SubLObject f46940(final SubLObject var673) {
        final SubLObject var674 = f46910(var673);
        final SubLObject var675 = f46941(var673);
        final SubLObject var676 = (SubLObject)((module0751.NIL != var675) ? f46942(var673) : module0751.NIL);
        final SubLObject var677 = (SubLObject)((module0751.NIL != f46943(var676)) ? f46944(var673) : module0751.NIL);
        final SubLObject var678 = (SubLObject)((module0751.NIL == var677 || var677.isString()) ? f46945(var673) : module0751.NIL);
        final SubLObject var679 = (SubLObject)((module0751.NIL == var678 || var678.isString()) ? module0749.f46446(var674, var676, var675, var677, var678, (SubLObject)module0751.UNPROVIDED) : module0751.NIL);
        return var679;
    }
    
    public static SubLObject f46941(final SubLObject var673) {
        SubLObject var674 = (SubLObject)module0751.$ic270$;
        SubLObject var675 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var675) {
            SubLObject var676 = f46915(var673);
            SubLObject var677 = (SubLObject)module0751.NIL;
            var677 = var676.first();
            while (module0751.NIL == var675 && module0751.NIL != var676) {
                if (var674.eql((SubLObject)module0751.$ic270$)) {
                    var674 = f46926(var677);
                }
                else if (!var674.equal(f46926(var677))) {
                    var675 = (SubLObject)module0751.T;
                }
                var676 = var676.rest();
                var677 = var676.first();
            }
        }
        return (SubLObject)((module0751.NIL != var675) ? module0751.$ic270$ : var674);
    }
    
    public static SubLObject f46942(final SubLObject var673) {
        SubLObject var674 = (SubLObject)module0751.$ic270$;
        SubLObject var675 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var675) {
            SubLObject var676 = f46915(var673);
            SubLObject var677 = (SubLObject)module0751.NIL;
            var677 = var676.first();
            while (module0751.NIL == var675 && module0751.NIL != var676) {
                if (var674.eql((SubLObject)module0751.$ic270$)) {
                    var674 = f46921(var677);
                }
                else if (!var674.equal(f46921(var677))) {
                    var675 = (SubLObject)module0751.T;
                }
                var676 = var676.rest();
                var677 = var676.first();
            }
        }
        return (SubLObject)((module0751.NIL != var675) ? module0751.$ic270$ : var674);
    }
    
    public static SubLObject f46944(final SubLObject var673) {
        SubLObject var674 = (SubLObject)module0751.$ic270$;
        SubLObject var675 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var675) {
            SubLObject var676 = f46915(var673);
            SubLObject var677 = (SubLObject)module0751.NIL;
            var677 = var676.first();
            while (module0751.NIL == var675 && module0751.NIL != var676) {
                if (var674.eql((SubLObject)module0751.$ic270$)) {
                    var674 = f46917(var677);
                }
                else if (module0751.NIL != f46917(var677)) {
                    if (!var674.equal(f46917(var677))) {
                        var675 = (SubLObject)module0751.T;
                    }
                }
                var676 = var676.rest();
                var677 = var676.first();
            }
        }
        return (SubLObject)((module0751.NIL != var675) ? module0751.$ic270$ : var674);
    }
    
    public static SubLObject f46945(final SubLObject var673) {
        final SubLObject var674 = f46933(var673);
        final SubLObject var675 = f46920(var674);
        SubLObject var676 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var676) {
            SubLObject var677 = f46915(var673);
            SubLObject var678 = (SubLObject)module0751.NIL;
            var678 = var677.first();
            while (module0751.NIL == var676 && module0751.NIL != var677) {
                if (module0751.NIL != f46920(var678)) {
                    if (!var678.eql(var674)) {
                        if (!var675.equal(f46920(var678))) {
                            var676 = (SubLObject)module0751.T;
                        }
                    }
                }
                var677 = var677.rest();
                var678 = var677.first();
            }
        }
        return (SubLObject)((module0751.NIL != var676) ? module0751.$ic270$ : var675);
    }
    
    public static SubLObject f46946(final SubLObject var703, SubLObject var704) {
        if (var704 == module0751.UNPROVIDED) {
            var704 = (SubLObject)module0751.NIL;
        }
        SubLObject var705 = (SubLObject)module0751.ZERO_INTEGER;
        SubLObject var706 = (SubLObject)module0751.$ic473$;
        SubLObject var707 = (SubLObject)module0751.NIL;
        SubLObject var708 = (SubLObject)module0751.NIL;
        SubLObject var709 = (SubLObject)module0751.NIL;
        SubLObject var710 = (SubLObject)module0751.NIL;
        var708 = var703;
        var709 = var708.first();
        for (var710 = (SubLObject)module0751.ZERO_INTEGER; module0751.NIL != var708; var708 = var708.rest(), var709 = var708.first(), var710 = Numbers.add((SubLObject)module0751.ONE_INTEGER, var710)) {
            var706 = Sequences.cconcatenate(var706, f46910(var709));
            SubLObject var711 = f46911(var709);
            SubLObject var712 = (SubLObject)module0751.NIL;
            var712 = var711.first();
            while (module0751.NIL != var711) {
                f46939(var712, Numbers.add(f46928(var712), var705));
                if (var704 != module0751.$ic100$ && module0751.NIL == conses_high.member(var710, var704, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                    f46936(var712, (SubLObject)module0751.$ic474$);
                }
                var707 = (SubLObject)ConsesLow.cons(var712, var707);
                var711 = var711.rest();
                var712 = var711.first();
            }
            var705 = Numbers.add(var705, Sequences.length(f46910(var709)));
        }
        return f46907(var706, Sequences.nreverse(var707));
    }
    
    public static SubLObject f46947(final SubLObject var673) {
        return module0202.f12768(module0751.$ic475$, f46910(var673), module0202.f12787(f46948(var673), (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f46948(final SubLObject var673) {
        SubLObject var674 = (SubLObject)module0751.NIL;
        SubLObject var675 = f46911(var673);
        SubLObject var676 = (SubLObject)module0751.NIL;
        var676 = var675.first();
        while (module0751.NIL != var675) {
            var674 = (SubLObject)ConsesLow.cons(f46949(var676), var674);
            var675 = var675.rest();
            var676 = var675.first();
        }
        return Sequences.nreverse(var674);
    }
    
    public static SubLObject f46949(final SubLObject var10) {
        if (module0751.NIL != module0756.f47694(f46926(var10))) {
            return module0202.f12683(module0751.$ic476$, (SubLObject)ConsesLow.list(f46919(var10), module0202.f12643(module0751.$ic477$, f46926(var10)), module0202.f12683(module0751.$ic478$, f46921(var10), (SubLObject)module0751.UNPROVIDED), f46950(f46917(var10)), f46950(f46920(var10)), f46928(var10)), (SubLObject)module0751.UNPROVIDED);
        }
        if (module0751.NIL == f46917(var10) && module0751.NIL == f46920(var10)) {
            return module0202.f12768(module0751.$ic479$, f46919(var10), f46928(var10));
        }
        return module0202.f12683(module0751.$ic480$, (SubLObject)ConsesLow.list(f46919(var10), f46928(var10), f46950(f46917(var10)), f46950(f46920(var10))), (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46950(final SubLObject var11) {
        return (module0751.NIL == var11) ? module0038.$g916$.getGlobalValue() : var11;
    }
    
    public static SubLObject f46951(final SubLObject var709) {
        SubLObject var711;
        final SubLObject var710 = var711 = module0205.f13304(var709, (SubLObject)module0751.UNPROVIDED);
        SubLObject var712 = (SubLObject)module0751.NIL;
        SubLObject var713 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var711, var710, (SubLObject)module0751.$ic481$);
        var712 = var711.first();
        var711 = var711.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var711, var710, (SubLObject)module0751.$ic481$);
        var713 = var711.first();
        var711 = var711.rest();
        if (module0751.NIL == var711) {
            SubLObject var714 = (SubLObject)module0751.NIL;
            SubLObject var715 = module0202.f12751(var713);
            SubLObject var716 = (SubLObject)module0751.NIL;
            var716 = var715.first();
            while (module0751.NIL != var715) {
                var714 = (SubLObject)ConsesLow.cons(f46952(var716), var714);
                var715 = var715.rest();
                var716 = var715.first();
            }
            return f46907(var712, Sequences.nreverse(var714));
        }
        cdestructuring_bind.cdestructuring_bind_error(var710, (SubLObject)module0751.$ic481$);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46952(final SubLObject var712) {
        final SubLObject var713 = module0205.f13276(var712);
        if (var713.eql(module0751.$ic476$)) {
            SubLObject var715;
            final SubLObject var714 = var715 = module0205.f13304(var712, (SubLObject)module0751.UNPROVIDED);
            SubLObject var716 = (SubLObject)module0751.NIL;
            SubLObject var717 = (SubLObject)module0751.NIL;
            SubLObject var718 = (SubLObject)module0751.NIL;
            SubLObject var719 = (SubLObject)module0751.NIL;
            SubLObject var720 = (SubLObject)module0751.NIL;
            SubLObject var721 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var715, var714, (SubLObject)module0751.$ic482$);
            var716 = var715.first();
            var715 = var715.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var715, var714, (SubLObject)module0751.$ic482$);
            var717 = var715.first();
            var715 = var715.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var715, var714, (SubLObject)module0751.$ic482$);
            var718 = var715.first();
            var715 = var715.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var715, var714, (SubLObject)module0751.$ic482$);
            var719 = var715.first();
            var715 = var715.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var715, var714, (SubLObject)module0751.$ic482$);
            var720 = var715.first();
            var715 = var715.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var715, var714, (SubLObject)module0751.$ic482$);
            var721 = var715.first();
            var715 = var715.rest();
            if (module0751.NIL == var715) {
                return f46929(var716, module0205.f13277(var717, (SubLObject)module0751.UNPROVIDED), module0205.f13304(var718, (SubLObject)module0751.UNPROVIDED), var719, var720, var721);
            }
            cdestructuring_bind.cdestructuring_bind_error(var714, (SubLObject)module0751.$ic482$);
        }
        else if (var713.eql(module0751.$ic480$)) {
            SubLObject var723;
            final SubLObject var722 = var723 = module0205.f13304(var712, (SubLObject)module0751.UNPROVIDED);
            SubLObject var716 = (SubLObject)module0751.NIL;
            SubLObject var724 = (SubLObject)module0751.NIL;
            SubLObject var725 = (SubLObject)module0751.NIL;
            SubLObject var726 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var723, var722, (SubLObject)module0751.$ic483$);
            var716 = var723.first();
            var723 = var723.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var723, var722, (SubLObject)module0751.$ic483$);
            var724 = var723.first();
            var723 = var723.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var723, var722, (SubLObject)module0751.$ic483$);
            var725 = var723.first();
            var723 = var723.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var723, var722, (SubLObject)module0751.$ic483$);
            var726 = var723.first();
            var723 = var723.rest();
            if (module0751.NIL == var723) {
                return f46929(var716, module0756.f47748(), f46705(), var724, var725, var726);
            }
            cdestructuring_bind.cdestructuring_bind_error(var722, (SubLObject)module0751.$ic483$);
        }
        else if (var713.eql(module0751.$ic479$)) {
            SubLObject var728;
            final SubLObject var727 = var728 = module0205.f13304(var712, (SubLObject)module0751.UNPROVIDED);
            SubLObject var716 = (SubLObject)module0751.NIL;
            SubLObject var729 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var728, var727, (SubLObject)module0751.$ic484$);
            var716 = var728.first();
            var728 = var728.rest();
            cdestructuring_bind.destructuring_bind_must_consp(var728, var727, (SubLObject)module0751.$ic484$);
            var729 = var728.first();
            var728 = var728.rest();
            if (module0751.NIL == var728) {
                return f46929(var716, module0756.f47748(), f46705(), (SubLObject)module0751.NIL, (SubLObject)module0751.NIL, var729);
            }
            cdestructuring_bind.cdestructuring_bind_error(var727, (SubLObject)module0751.$ic484$);
        }
        else {
            Errors.error((SubLObject)module0751.$ic485$, var712);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46953(final SubLObject var722) {
        final SubLThread var723 = SubLProcess.currentSubLThread();
        if (module0751.NIL != module0579.$g4238$.getDynamicValue(var723) && module0751.NIL != module0579.$g4240$.getDynamicValue(var723)) {
            f46954(var722);
        }
        SubLObject var724 = var722;
        SubLObject var725 = (SubLObject)module0751.NIL;
        var725 = var724.first();
        while (module0751.NIL != var724) {
            module0749.f46472(var725, (SubLObject)module0751.NIL);
            var724 = var724.rest();
            var725 = var724.first();
        }
        SubLObject var726 = (SubLObject)module0751.NIL;
        SubLObject var727 = (SubLObject)module0751.NIL;
        SubLObject var728 = (SubLObject)module0751.NIL;
        final SubLObject var729 = module0579.$g4259$.currentBinding(var723);
        try {
            module0579.$g4259$.bind((SubLObject)module0751.$ic33$, var723);
            assert module0751.NIL != module0756.f47600(var722) : var722;
            SubLObject var730 = (SubLObject)module0751.ZERO_INTEGER;
            SubLObject var731 = (SubLObject)module0751.ZERO_INTEGER;
            final SubLObject var732 = module0756.f47713(var722, (SubLObject)module0751.T);
            final SubLObject var733 = f46648(var732, (SubLObject)module0751.NIL);
            final SubLObject var734 = module0749.f46562(var722);
            while (module0751.NIL == module0749.f46563(var734)) {
                final SubLObject var735 = module0749.f46564(var734);
                final SubLObject var736 = module0756.f47721(var735, (SubLObject)module0751.NIL);
                var730 = module0580.f35585(var736, var733, var731);
                if (var730.numG(var731)) {
                    final SubLObject var737 = module0580.f35583(var730, var731);
                    final SubLObject var738 = f46705();
                    final SubLObject var739 = (SubLObject)module0751.NIL;
                    final SubLObject var740 = (SubLObject)module0751.NIL;
                    final SubLObject var741 = module0756.f47748();
                    final SubLObject var742 = module0772.f49212(var737);
                    SubLObject var699_733 = var731;
                    assert module0751.NIL != module0581.f35648(var733) : var733;
                    assert module0751.NIL != module0581.f35648(var737) : var737;
                    var728 = var733;
                    final SubLObject var743 = (SubLObject)((module0751.NIL != module0579.$g4308$.getDynamicValue(var723) || !var737.isString()) ? ConsesLow.list(var737) : module0038.f2738(var737, module0038.f2818(), (SubLObject)module0751.NIL, (SubLObject)module0751.T, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
                    final SubLObject var744 = Sequences.length(var743);
                    SubLObject var745 = (SubLObject)module0751.NIL;
                    SubLObject var746 = (SubLObject)module0751.NIL;
                    SubLObject var747 = (SubLObject)module0751.NIL;
                    var745 = var743;
                    var746 = var745.first();
                    for (var747 = (SubLObject)module0751.ZERO_INTEGER; module0751.NIL != var745; var745 = var745.rest(), var746 = var745.first(), var747 = Numbers.add((SubLObject)module0751.ONE_INTEGER, var747)) {
                        final SubLObject var748 = Equality.eql(var747, (SubLObject)module0751.ZERO_INTEGER);
                        final SubLObject var749 = Equality.eql(var747, module0048.f_1_(var744));
                        if (module0751.NIL == module0038.f2610(var746) || var741.equal(module0038.$g916$.getGlobalValue()) || (module0751.NIL != var748 && module0751.NIL != module0038.f2653(var739)) || (module0751.NIL != var749 && module0751.NIL != module0038.f2653(var740))) {
                            f46955(var733, var699_733, var746);
                            final SubLObject var750 = (SubLObject)((module0751.NIL != var748) ? var739 : module0751.NIL);
                            final SubLObject var751 = (SubLObject)((module0751.NIL != var749) ? var740 : module0751.NIL);
                            final SubLObject var752 = f46929(var746, var741, var738, var750, var751, var699_733);
                            if (module0751.NIL == var727) {
                                var727 = var752;
                            }
                            else {
                                var726 = (SubLObject)ConsesLow.cons(var727, var726);
                                var727 = var752;
                            }
                            var699_733 = Numbers.add(var699_733, Sequences.length(var746));
                        }
                    }
                }
                var731 = module0580.f35582(var730, var736);
                final SubLObject var737 = module0756.f47721(var735, (SubLObject)module0751.NIL);
                final SubLObject var738 = module0749.f46462(var735);
                final SubLObject var739 = module0749.f46474(var735);
                final SubLObject var740 = module0749.f46476(var735);
                final SubLObject var741 = module0749.f46466(var735);
                final SubLObject var742 = var735;
                assert module0751.NIL != module0581.f35648(var733) : var733;
                assert module0751.NIL != module0581.f35648(var737) : var737;
                var728 = var733;
                final SubLObject var753 = (SubLObject)((module0751.NIL != module0579.$g4308$.getDynamicValue(var723) || !var737.isString()) ? ConsesLow.list(var737) : module0038.f2738(var737, module0038.f2818(), (SubLObject)module0751.NIL, (SubLObject)module0751.T, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
                final SubLObject var754 = Sequences.length(var753);
                SubLObject var755 = (SubLObject)module0751.NIL;
                SubLObject var756 = (SubLObject)module0751.NIL;
                SubLObject var757 = (SubLObject)module0751.NIL;
                var755 = var753;
                var756 = var755.first();
                for (var757 = (SubLObject)module0751.ZERO_INTEGER; module0751.NIL != var755; var755 = var755.rest(), var756 = var755.first(), var757 = Numbers.add((SubLObject)module0751.ONE_INTEGER, var757)) {
                    final SubLObject var758 = Equality.eql(var757, (SubLObject)module0751.ZERO_INTEGER);
                    final SubLObject var759 = Equality.eql(var757, module0048.f_1_(var754));
                    if (module0751.NIL == module0038.f2610(var756) || var741.equal(module0038.$g916$.getGlobalValue()) || (module0751.NIL != var758 && module0751.NIL != module0038.f2653(var739)) || (module0751.NIL != var759 && module0751.NIL != module0038.f2653(var740))) {
                        f46955(var733, var730, var756);
                        final SubLObject var760 = (SubLObject)((module0751.NIL != var758) ? var739 : module0751.NIL);
                        final SubLObject var761 = (SubLObject)((module0751.NIL != var759) ? var740 : module0751.NIL);
                        final SubLObject var762 = f46929(var756, var741, var738, var760, var761, var730);
                        if (module0751.NIL == var727) {
                            var727 = var762;
                        }
                        else {
                            var726 = (SubLObject)ConsesLow.cons(var727, var726);
                            var727 = var762;
                        }
                        var730 = Numbers.add(var730, Sequences.length(var756));
                    }
                }
            }
        }
        finally {
            module0579.$g4259$.rebind(var729, var723);
        }
        if (module0751.NIL != var727) {
            var726 = (SubLObject)ConsesLow.cons(var727, var726);
        }
        return f46907(var728, Sequences.nreverse(var726));
    }
    
    public static SubLObject f46955(final SubLObject var727, final SubLObject var699, final SubLObject var739) {
        final SubLObject var740 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0038.f2608(var739) || (module0751.NIL != module0035.f2002(var727, var699, (SubLObject)module0751.UNPROVIDED) && module0581.f35671(var739, (SubLObject)module0751.ZERO_INTEGER).eql(module0581.f35671(var727, var699))));
        if (module0751.NIL == var740) {
            final SubLObject var741 = Sequences.cconcatenate((SubLObject)module0751.$ic146$, new SubLObject[] { module0006.f205((SubLObject)module0751.ONE_INTEGER), module0751.$ic147$, module0006.f203((SubLObject)module0751.$ic488$) });
            module0578.f35476(var741, (SubLObject)ConsesLow.list(var699, var739, var727));
        }
        return var740;
    }
    
    public static SubLObject f46956(final SubLObject var741) {
        return Mapping.mapcar((SubLObject)module0751.$ic489$, var741);
    }
    
    public static SubLObject f46957(final SubLObject var742) {
        SubLObject var743 = (SubLObject)module0751.NIL;
        SubLObject var744 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var742, var742, (SubLObject)module0751.$ic490$);
        var743 = var742.first();
        final SubLObject var745 = var744 = var742.rest();
        final SubLObject var746 = f46958(var743);
        return f46959(var746, var744);
    }
    
    public static SubLObject f46958(final SubLObject var673) {
        if (module0751.NIL != f46931(var673) && module0751.NIL != module0038.f2675(f46910(var673), (SubLObject)module0751.$ic491$, Symbols.symbol_function((SubLObject)module0751.EQUALP))) {
            final SubLObject var674 = f46910(var673);
            final SubLObject var675 = Sequences.cconcatenate(module0038.f2623(var674, (SubLObject)module0751.FOUR_INTEGER, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.$ic492$);
            final SubLObject var676 = conses_high.copy_list(var673);
            f46934(f46932(var676), var675);
            f46930(var676, var675);
            return var676;
        }
        return var673;
    }
    
    public static SubLObject f46954(final SubLObject var722) {
        SubLObject var723 = (SubLObject)module0751.ZERO_INTEGER;
        SubLObject var724 = (SubLObject)module0751.NIL;
        SubLObject var725 = var722;
        SubLObject var726 = (SubLObject)module0751.NIL;
        var726 = var725.first();
        while (module0751.NIL != var725) {
            if (module0751.NIL != f46960(var726)) {
                var723 = Numbers.add(var723, (SubLObject)module0751.ONE_INTEGER);
                var724 = (SubLObject)ConsesLow.cons(f46961(var726), var724);
            }
            else if (module0751.NIL != f46962(var726)) {
                final SubLObject var727 = (SubLObject)module0751.NIL;
                f46963(var726, var723, var724.first(), var727);
            }
            else if (module0751.NIL != f46964(var726)) {
                f46965(var726);
            }
            else if (module0751.NIL != f46966(var726)) {
                var723 = Numbers.subtract(var723, (SubLObject)module0751.ONE_INTEGER);
                var724 = var724.rest();
                f46967(var726);
            }
            var725 = var725.rest();
            var726 = var725.first();
        }
        return var722;
    }
    
    public static SubLObject f46960(final SubLObject var10) {
        final SubLObject var11 = module0749.f46474(var10);
        SubLObject var12 = (SubLObject)module0751.NIL;
        var12 = (SubLObject)SubLObjectFactory.makeBoolean(var11.isString() && (module0751.NIL != Sequences.search(module0015.$g264$.getGlobalValue(), var11, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) || module0751.NIL != Sequences.search(module0015.$g262$.getGlobalValue(), var11, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)));
        return var12;
    }
    
    public static SubLObject f46966(final SubLObject var10) {
        final SubLObject var11 = module0749.f46476(var10);
        SubLObject var12 = (SubLObject)module0751.NIL;
        var12 = (SubLObject)SubLObjectFactory.makeBoolean(var11.isString() && (module0751.NIL != Sequences.search(module0015.$g265$.getGlobalValue(), var11, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) || module0751.NIL != Sequences.search(module0015.$g263$.getGlobalValue(), var11, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)));
        return var12;
    }
    
    public static SubLObject f46964(final SubLObject var10) {
        final SubLObject var11 = module0749.f46476(var10);
        SubLObject var12 = (SubLObject)module0751.NIL;
        var12 = (SubLObject)SubLObjectFactory.makeBoolean(var11.isString() && module0751.NIL != Sequences.search(module0015.$g276$.getGlobalValue(), var11, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
        return var12;
    }
    
    public static SubLObject f46962(final SubLObject var10) {
        final SubLObject var11 = module0749.f46474(var10);
        SubLObject var12 = (SubLObject)module0751.NIL;
        var12 = (SubLObject)SubLObjectFactory.makeBoolean(var11.isString() && module0751.NIL != Sequences.search(module0015.$g275$.getGlobalValue(), var11, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
        return var12;
    }
    
    public static SubLObject f46961(final SubLObject var10) {
        final SubLObject var11 = module0749.f46474(var10);
        final SubLObject var12 = (SubLObject)((module0751.NIL != Sequences.search(module0015.$g264$.getGlobalValue(), var11, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) ? module0751.$ic493$ : f46968(var11));
        module0749.f46479(var10, module0038.$g916$.getGlobalValue(), module0038.$g916$.getGlobalValue());
        return var12;
    }
    
    public static SubLObject f46968(final SubLObject var678) {
        SubLObject var679 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var679) {
            SubLObject var680 = module0015.$g274$.getGlobalValue();
            SubLObject var681 = (SubLObject)module0751.NIL;
            var681 = var680.first();
            while (module0751.NIL == var679 && module0751.NIL != var680) {
                if (module0751.NIL != Sequences.search(module0038.f2638(var681), var678, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                    var679 = var681;
                }
                var680 = var680.rest();
                var681 = var680.first();
            }
        }
        return var679;
    }
    
    public static SubLObject f46967(final SubLObject var10) {
        final SubLObject var11 = module0749.f46455(var10);
        final SubLObject var12 = Strings.make_string((SubLObject)module0751.ONE_INTEGER, (SubLObject)Characters.CHAR_newline);
        module0749.f46457(var10, Sequences.cconcatenate(var12, var11));
        module0749.f46479(var10, module0038.$g916$.getGlobalValue(), module0038.$g916$.getGlobalValue());
        return var10;
    }
    
    public static SubLObject f46963(final SubLObject var10, final SubLObject var749, final SubLObject var752, final SubLObject var751) {
        final SubLObject var753 = module0048.f_1X(var749);
        final SubLObject var754 = Strings.make_string(var753, (SubLObject)Characters.CHAR_tab);
        final SubLObject var755 = f46969(var752, var749, var751);
        module0038.f2743((SubLObject)module0751.ZERO_INTEGER, var754, (SubLObject)Characters.CHAR_newline, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic494$, var749, var10);
        }
        module0749.f46479(var10, module0038.f2667(module0749.f46474(var10), (SubLObject)module0751.$ic495$), module0749.f46476(var10));
        module0749.f46457(var10, Sequences.cconcatenate(var754, var755));
        return var10;
    }
    
    public static SubLObject f46965(final SubLObject var10) {
        module0749.f46479(var10, module0749.f46474(var10), module0038.f2667(module0749.f46476(var10), (SubLObject)module0751.$ic496$));
        return var10;
    }
    
    public static SubLObject f46969(final SubLObject var752, final SubLObject var749, final SubLObject var751) {
        if (var752 != module0751.$ic493$) {
            Errors.warn((SubLObject)module0751.$ic498$);
        }
        final SubLObject var753 = Strings.sublisp_char(module0751.$g6027$.getGlobalValue(), Numbers.mod(module0048.f_1_(var749), Sequences.length(module0751.$g6027$.getGlobalValue())));
        return Strings.make_string((SubLObject)module0751.ONE_INTEGER, var753);
    }
    
    public static SubLObject f46970(final SubLObject var703, final SubLObject var33) {
        SubLObject var704 = (SubLObject)module0751.NIL;
        SubLObject var705 = (SubLObject)module0751.NIL;
        SubLObject var673_762 = (SubLObject)module0751.NIL;
        SubLObject var706 = (SubLObject)module0751.NIL;
        SubLObject var32_764 = (SubLObject)module0751.NIL;
        var705 = var703;
        var673_762 = var705.first();
        var706 = var33;
        var32_764 = var706.first();
        while (module0751.NIL != var706 || module0751.NIL != var705) {
            var704 = (SubLObject)ConsesLow.cons(f46959(var673_762, var32_764), var704);
            var705 = var705.rest();
            var673_762 = var705.first();
            var706 = var706.rest();
            var32_764 = var706.first();
        }
        return Sequences.nreverse(var704);
    }
    
    public static SubLObject f46959(final SubLObject var673, final SubLObject var32) {
        return (SubLObject)ConsesLow.cons(var673, var32);
    }
    
    public static SubLObject f46971(final SubLObject var742) {
        final SubLObject var743 = var742.first();
        final SubLObject var744 = var743.first();
        return var744;
    }
    
    public static SubLObject f46972(final SubLObject var741) {
        SubLObject var742 = (SubLObject)module0751.NIL;
        SubLObject var743 = (SubLObject)module0751.NIL;
        SubLObject var744 = var741;
        SubLObject var745 = (SubLObject)module0751.NIL;
        var745 = var744.first();
        while (module0751.NIL != var744) {
            SubLObject var747;
            final SubLObject var746 = var747 = var745;
            SubLObject var748 = (SubLObject)module0751.NIL;
            SubLObject var749 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var747, var746, (SubLObject)module0751.$ic490$);
            var748 = var747.first();
            var747 = (var749 = var747.rest());
            var742 = (SubLObject)ConsesLow.cons(var748, var742);
            var743 = (SubLObject)ConsesLow.cons(var749, var743);
            var744 = var744.rest();
            var745 = var744.first();
        }
        return Values.values(Sequences.nreverse(var742), Sequences.nreverse(var743));
    }
    
    public static SubLObject f46973(final SubLObject var741, final SubLObject var768) {
        final SubLObject var769 = (module0751.NIL != var768) ? Symbols.symbol_function((SubLObject)module0751.$ic319$) : Symbols.symbol_function((SubLObject)module0751.$ic499$);
        return Sort.sort(var741, var769, Symbols.symbol_function((SubLObject)module0751.$ic500$));
    }
    
    public static SubLObject f46974(final SubLObject var673, final SubLObject var180) {
        return (SubLObject)ConsesLow.list(var180, var673);
    }
    
    public static SubLObject f46975(final SubLObject var769) {
        return var769;
    }
    
    public static SubLObject f46976(final SubLObject var770) {
        return conses_high.second(var770);
    }
    
    public static SubLObject f46977(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic501$);
        final SubLObject var9 = var8.rest();
        var8 = var8.first();
        SubLObject var10 = (SubLObject)module0751.NIL;
        SubLObject var11 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic501$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic501$);
        var11 = var8.first();
        var8 = var8.rest();
        if (module0751.NIL == var8) {
            final SubLObject var12;
            var8 = (var12 = var9);
            return (SubLObject)ConsesLow.listS((SubLObject)module0751.$ic18$, new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)module0751.$ic502$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic503$, (SubLObject)module0751.$ic504$, var10, var11)), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic505$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic503$, (SubLObject)module0751.$ic506$, var10, var11)), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic507$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic503$, (SubLObject)module0751.$ic508$, var10, var11)), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic509$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic503$, (SubLObject)module0751.$ic510$, var10, var11)), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic511$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic503$, (SubLObject)module0751.$ic512$, var10, var11))), module0751.$ic513$, module0751.$ic514$, module0751.$ic515$, module0751.$ic516$, ConsesLow.append(var12, (SubLObject)module0751.NIL) });
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0751.$ic501$);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46978(final SubLObject var32, final SubLObject var774, SubLObject var775) {
        if (var775 == module0751.UNPROVIDED) {
            var775 = (SubLObject)module0751.NIL;
        }
        final SubLThread var776 = SubLProcess.currentSubLThread();
        assert module0751.NIL != module0035.f2327(var774) : var774;
        final SubLObject var777 = module0035.f2349((SubLObject)module0751.$ic504$, var774, var775, (SubLObject)module0751.UNPROVIDED);
        SubLObject var778 = module0035.f2349((SubLObject)module0751.$ic506$, var774, var775, (SubLObject)module0751.UNPROVIDED);
        SubLObject var779 = module0035.f2349((SubLObject)module0751.$ic508$, var774, var775, (SubLObject)module0751.UNPROVIDED);
        SubLObject var780 = module0035.f2349((SubLObject)module0751.$ic510$, var774, var775, (SubLObject)module0751.UNPROVIDED);
        SubLObject var781 = module0035.f2349((SubLObject)module0751.$ic512$, var774, var775, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var778) {
            var778 = (SubLObject)module0751.$ic59$;
        }
        if (module0751.NIL == var779) {
            var779 = module0579.$g4260$.getDynamicValue(var776);
        }
        if (module0751.NIL == var780) {
            var780 = module0579.$g4262$.getDynamicValue(var776);
        }
        if (module0751.NIL == var781) {
            var781 = (SubLObject)module0751.$ic518$;
        }
        return module0770.f49060(var32, var777, var778, var779, var780, var781);
    }
    
    public static SubLObject f46979(final SubLObject var774) {
        final SubLThread var775 = SubLProcess.currentSubLThread();
        final SubLObject var776 = module0035.f2349((SubLObject)module0751.$ic504$, var774, (SubLObject)module0751.NIL, (SubLObject)module0751.UNPROVIDED);
        SubLObject var777 = module0035.f2349((SubLObject)module0751.$ic506$, var774, (SubLObject)module0751.NIL, (SubLObject)module0751.UNPROVIDED);
        SubLObject var778 = module0035.f2349((SubLObject)module0751.$ic508$, var774, (SubLObject)module0751.NIL, (SubLObject)module0751.UNPROVIDED);
        SubLObject var779 = module0035.f2349((SubLObject)module0751.$ic510$, var774, (SubLObject)module0751.NIL, (SubLObject)module0751.UNPROVIDED);
        SubLObject var780 = module0035.f2349((SubLObject)module0751.$ic512$, var774, (SubLObject)module0751.NIL, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var777) {
            var777 = (SubLObject)module0751.$ic59$;
        }
        if (module0751.NIL == var778) {
            var778 = module0579.$g4260$.getDynamicValue(var775);
        }
        if (module0751.NIL == var779) {
            var779 = module0579.$g4262$.getDynamicValue(var775);
        }
        if (module0751.NIL == var780) {
            var780 = (SubLObject)module0751.$ic518$;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((module0751.NIL == var776 || module0751.NIL != f46980(var776)) && (module0751.NIL == var777 || module0751.NIL != module0761.f48130(var777)) && (module0751.NIL == var778 || module0751.NIL != module0161.f10479(var778)) && (module0751.NIL == var779 || module0751.NIL != module0161.f10479(var779)) && (module0751.NIL == var780 || var780.isKeyword()));
    }
    
    public static SubLObject f46981(final SubLObject var673, final SubLObject var185) {
        SubLObject var674 = f46911(var673);
        SubLObject var675 = (SubLObject)module0751.NIL;
        var675 = var674.first();
        while (module0751.NIL != var674) {
            final SubLObject var676 = f46921(var675);
            if (module0751.NIL != f46924(var676)) {
                f46936(var675, f46982(var676, var185));
            }
            var674 = var674.rest();
            var675 = var674.first();
        }
        return var673;
    }
    
    public static SubLObject f46983(final SubLObject var673, final SubLObject var578) {
        SubLObject var674 = f46911(var673);
        SubLObject var675 = (SubLObject)module0751.NIL;
        var675 = var674.first();
        while (module0751.NIL != var674) {
            final SubLObject var676 = f46926(var675);
            if (module0751.NIL != module0201.f12546(var676)) {
                f46935(var675, module0035.f2294(var578, var676, Symbols.symbol_function((SubLObject)module0751.EQL), var676));
            }
            var674 = var674.rest();
            var675 = var674.first();
        }
        return var673;
    }
    
    public static SubLObject f46984() {
        final SubLObject var82 = module0751.$g6028$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46985(final SubLObject var673) {
        return module0034.f1829(module0751.$g6028$.getGlobalValue(), (SubLObject)ConsesLow.list(var673), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46986(final SubLObject var673) {
        return f46987(f46909(var673));
    }
    
    public static SubLObject f46988(final SubLObject var673) {
        SubLObject var674 = module0751.$g6028$.getGlobalValue();
        if (module0751.NIL == var674) {
            var674 = module0034.f1934((SubLObject)module0751.$ic519$, (SubLObject)module0751.$ic520$, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        SubLObject var675 = module0034.f1814(var674, var673, (SubLObject)module0751.$ic37$);
        if (var675 == module0751.$ic37$) {
            var675 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46986(var673)));
            module0034.f1816(var674, var673, var675, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var675);
    }
    
    public static SubLObject f46987(final SubLObject var673) {
        final SubLObject var674 = f46910(var673);
        SubLObject var675 = (SubLObject)module0751.NIL;
        SubLObject var676 = f46911(var673);
        SubLObject var677 = (SubLObject)module0751.NIL;
        var677 = var676.first();
        while (module0751.NIL != var676) {
            final SubLObject var678 = f46926(var677);
            if (module0751.NIL != module0201.f12546(var678) && module0751.NIL != module0035.f1995(module0201.f12563(var678), (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED)) {
                final SubLObject var679 = module0038.f2636(module0201.f12563(var678));
                if (module0751.NIL != Sequences.find(var679, f46919(var677), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                    final SubLObject var680 = module0035.f2294(var675, var678, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                    final SubLObject var681 = (module0751.NIL != var680) ? var680 : module0202.f12703(module0035.f2319(var675), var678);
                    if (!var681.eql(var678)) {
                        final SubLObject var682 = module0201.f12563(var681);
                        f46934(var677, var682);
                        final SubLObject var683 = f46928(var677);
                        final SubLObject var684 = Numbers.add(f46928(var677), Sequences.length(f46919(var677)));
                        Sequences.nsubstitute(module0038.f2636(var682), var679, var674, Symbols.symbol_function((SubLObject)module0751.EQ), Symbols.symbol_function((SubLObject)module0751.IDENTITY), var683, var684, (SubLObject)module0751.UNPROVIDED);
                    }
                    if (module0751.NIL == var680) {
                        var675 = module0035.f2063(var675, var678, var681, (SubLObject)module0751.UNPROVIDED);
                    }
                }
            }
            var676 = var676.rest();
            var677 = var676.first();
        }
        return var673;
    }
    
    public static SubLObject f46989(final SubLObject var238) {
        final SubLObject var239 = module0756.f47648(var238);
        return (SubLObject)((module0751.NIL != module0756.f47732(var239) || module0751.NIL != module0756.f47733(var239)) ? module0751.NIL : module0751.T);
    }
    
    public static SubLObject f46990(final SubLObject var238) {
        final SubLObject var239 = module0749.f46494((SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var240 = module0756.f47648(var238);
        final SubLObject var241 = f46991((SubLObject)module0751.$ic521$, module0756.f47590(var238, (SubLObject)module0751.ZERO_INTEGER));
        if (module0751.NIL == var240) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic522$, var238);
            }
            return (SubLObject)module0751.NIL;
        }
        module0756.f47534(var239, module0749.f46375(module0756.f47482(var240)), (SubLObject)module0751.UNPROVIDED);
        module0756.f47534(var239, var241, (SubLObject)module0751.UNPROVIDED);
        module0756.f47625(var239, module0751.$ic523$);
        module0756.f47465(var239, module0756.f47748());
        module0756.f47534(var240, f46991((SubLObject)module0751.$ic524$, module0751.$ic525$), (SubLObject)module0751.UNPROVIDED);
        module0756.f47782(var240, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var242 = module0756.f47477(var238);
        module0756.f47837(var238, var239, var242);
        module0756.f47533(var238, var242);
        return var238;
    }
    
    public static SubLObject f46992(final SubLObject var788, SubLObject var776, SubLObject var789) {
        if (var776 == module0751.UNPROVIDED) {
            var776 = (SubLObject)module0751.$ic103$;
        }
        if (var789 == module0751.UNPROVIDED) {
            var789 = module0579.$g4287$.getDynamicValue();
        }
        final SubLThread var790 = SubLProcess.currentSubLThread();
        SubLObject var791 = (SubLObject)module0751.NIL;
        var790.resetMultipleValues();
        SubLObject var792 = module0745.f46259(var788, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        SubLObject var793 = var790.secondMultipleValue();
        final SubLObject var794 = var790.thirdMultipleValue();
        SubLObject var795 = var790.fourthMultipleValue();
        var790.resetMultipleValues();
        if (var794.isNumber() && module0751.NIL != module0579.f35496(var794, var789)) {
            var791 = (SubLObject)module0751.T;
        }
        else if (module0751.NIL == f46993(var793, var776)) {
            var791 = (SubLObject)module0751.T;
        }
        if (module0751.NIL != var791) {
            var792 = (SubLObject)module0751.NIL;
            var793 = (SubLObject)module0751.NIL;
            var795 = (SubLObject)module0751.NIL;
        }
        return Values.values(var792, var793, var794, var795);
    }
    
    public static SubLObject f46993(final SubLObject var790, final SubLObject var776) {
        final SubLThread var791 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(var776.eql((SubLObject)module0751.$ic103$) || (module0751.NIL != module0035.f2013(var776) && module0751.NIL != f46658(var790, var776.first(), module0579.$g4260$.getDynamicValue(var791))));
    }
    
    public static SubLObject f46994(final SubLObject var68, SubLObject var81, SubLObject var793) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var793 == module0751.UNPROVIDED) {
            var793 = (SubLObject)module0751.T;
        }
        return f46898(var68, (SubLObject)module0751.ONE_INTEGER, var81, var793, (SubLObject)module0751.UNPROVIDED).first();
    }
    
    public static SubLObject f46898(final SubLObject var68, SubLObject var437, SubLObject var81, SubLObject var793, SubLObject var794) {
        if (var437 == module0751.UNPROVIDED) {
            var437 = (SubLObject)module0751.THREE_INTEGER;
        }
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var793 == module0751.UNPROVIDED) {
            var793 = (SubLObject)module0751.T;
        }
        if (var794 == module0751.UNPROVIDED) {
            var794 = (SubLObject)module0751.T;
        }
        return conses_high.copy_list(f46995(var68, var437, var81, var793, var794));
    }
    
    public static SubLObject f46996(final SubLObject var68, SubLObject var437, SubLObject var81, SubLObject var793, SubLObject var794) {
        if (var437 == module0751.UNPROVIDED) {
            var437 = (SubLObject)module0751.THREE_INTEGER;
        }
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var793 == module0751.UNPROVIDED) {
            var793 = (SubLObject)module0751.T;
        }
        if (var794 == module0751.UNPROVIDED) {
            var794 = (SubLObject)module0751.T;
        }
        SubLObject var795 = (SubLObject)module0751.NIL;
        if (module0751.NIL != f46676(var68)) {
            return Mapping.mapcar((SubLObject)module0751.$ic527$, f46995(f46905(var68), var437, var81, var793, (SubLObject)module0751.UNPROVIDED));
        }
        if (var68.isNumber()) {
            var795 = (SubLObject)ConsesLow.list(module0751.$ic528$);
        }
        else if (var68.isString()) {
            var795 = (SubLObject)ConsesLow.list(module0751.$ic529$);
        }
        else if (module0751.NIL != f46669(var68, module0751.$ic528$, (SubLObject)module0751.UNPROVIDED)) {
            var795 = (SubLObject)ConsesLow.list(module0751.$ic528$);
        }
        else {
            var795 = (SubLObject)ConsesLow.list(module0269.f17701(var68, (SubLObject)module0751.UNPROVIDED));
        }
        return var795;
    }
    
    public static SubLObject f46995(final SubLObject var68, SubLObject var437, SubLObject var81, SubLObject var793, SubLObject var794) {
        if (var437 == module0751.UNPROVIDED) {
            var437 = (SubLObject)module0751.THREE_INTEGER;
        }
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        if (var793 == module0751.UNPROVIDED) {
            var793 = (SubLObject)module0751.T;
        }
        if (var794 == module0751.UNPROVIDED) {
            var794 = (SubLObject)module0751.T;
        }
        final SubLThread var795 = SubLProcess.currentSubLThread();
        final SubLObject var796 = module0034.$g879$.getDynamicValue(var795);
        SubLObject var797 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var796) {
            return f46996(var68, var437, var81, var793, var794);
        }
        var797 = module0034.f1857(var796, (SubLObject)module0751.$ic526$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var797) {
            var797 = module0034.f1807(module0034.f1842(var796), (SubLObject)module0751.$ic526$, (SubLObject)module0751.FIVE_INTEGER, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var796, (SubLObject)module0751.$ic526$, var797);
        }
        final SubLObject var798 = module0034.f1779(var68, var437, var81, var793, var794);
        final SubLObject var799 = module0034.f1814(var797, var798, (SubLObject)module0751.UNPROVIDED);
        if (var799 != module0751.$ic37$) {
            SubLObject var800 = var799;
            SubLObject var801 = (SubLObject)module0751.NIL;
            var801 = var800.first();
            while (module0751.NIL != var800) {
                SubLObject var802 = var801.first();
                final SubLObject var803 = conses_high.second(var801);
                if (var68.equal(var802.first())) {
                    var802 = var802.rest();
                    if (var437.equal(var802.first())) {
                        var802 = var802.rest();
                        if (var81.equal(var802.first())) {
                            var802 = var802.rest();
                            if (var793.equal(var802.first())) {
                                var802 = var802.rest();
                                if (module0751.NIL != var802 && module0751.NIL == var802.rest() && var794.equal(var802.first())) {
                                    return module0034.f1959(var803);
                                }
                            }
                        }
                    }
                }
                var800 = var800.rest();
                var801 = var800.first();
            }
        }
        final SubLObject var804 = Values.arg2(var795.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f46996(var68, var437, var81, var793, var794)));
        module0034.f1836(var797, var798, var799, var804, (SubLObject)ConsesLow.list(var68, var437, var81, var793, var794));
        return module0034.f1959(var804);
    }
    
    public static SubLObject f46997(final SubLObject var94, final SubLObject var68) {
        if (module0751.NIL != module0753.f47261(var94)) {
            if (module0751.NIL != f46605() && module0751.NIL != module0578.f35470((SubLObject)module0751.TWO_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic530$, var94, var68);
            }
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != module0579.f35493(var68, var94)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.TWO_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic531$, var94, var68);
            }
            return (SubLObject)module0751.NIL;
        }
        return (SubLObject)module0751.T;
    }
    
    public static SubLObject f46998(final SubLObject var795) {
        return module0162.f10628(var795);
    }
    
    public static SubLObject f46999(final SubLObject var56, final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var32.isList() && module0751.NIL == module0035.find_if_not(var56, var32, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && (module0751.NIL == conses_high.member((SubLObject)module0751.NIL, var32, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) || module0751.NIL != Functions.funcall(var56, (SubLObject)module0751.NIL)));
    }
    
    public static SubLObject f46611(final SubLObject var11) {
        if (module0751.NIL != assertion_handles_oc.f11035(var11)) {
            return f46613(var11);
        }
        if (module0751.NIL != module0167.f10813(var11)) {
            return module0172.f10920(var11);
        }
        return var11;
    }
    
    public static SubLObject f47000(final SubLObject var796) {
        SubLObject var797 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0178.f11284(var796) && module0178.f11292(var796) == module0751.$ic326$ && module0751.NIL != f47001(var796)) {
            var797 = module0178.f11285(var796);
        }
        else if (module0751.NIL != module0178.f11290(var796) && module0751.NIL != module0035.f2013(module0232.f15308(module0178.f11282(var796))) && module0751.NIL != Sequences.find(module0751.$ic390$, module0232.f15306(module0178.f11282(var796)), Symbols.symbol_function((SubLObject)module0751.EQL), Symbols.symbol_function((SubLObject)module0751.$ic533$), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == Sequences.find(module0751.$ic534$, module0232.f15306(module0178.f11282(var796)), Symbols.symbol_function((SubLObject)module0751.EQL), Symbols.symbol_function((SubLObject)module0751.$ic533$), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == module0035.f2439((SubLObject)module0751.$ic535$, module0178.f11282(var796), (SubLObject)module0751.UNPROVIDED)) {
            var797 = module0538.f33367(var796, (SubLObject)module0751.T);
        }
        else {
            final SubLObject var798 = var797 = f46740(module0289.f19396(var796));
        }
        return var797;
    }
    
    public static SubLObject f46613(final SubLObject var796) {
        final SubLThread var797 = SubLProcess.currentSubLThread();
        final SubLObject var798 = module0034.$g879$.getDynamicValue(var797);
        SubLObject var799 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var798) {
            return f47000(var796);
        }
        var799 = module0034.f1857(var798, (SubLObject)module0751.$ic532$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var799) {
            var799 = module0034.f1807(module0034.f1842(var798), (SubLObject)module0751.$ic532$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic536$, (SubLObject)module0751.EQ, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var798, (SubLObject)module0751.$ic532$, var799);
        }
        SubLObject var800 = module0034.f1814(var799, var796, (SubLObject)module0751.$ic37$);
        if (var800 == module0751.$ic37$) {
            var800 = Values.arg2(var797.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47000(var796)));
            module0034.f1816(var799, var796, var800, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var800);
    }
    
    public static SubLObject f47001(final SubLObject var796) {
        final SubLThread var797 = SubLProcess.currentSubLThread();
        SubLObject var798 = (SubLObject)module0751.NIL;
        final SubLObject var799 = module0147.$g2094$.currentBinding(var797);
        final SubLObject var800 = module0147.$g2095$.currentBinding(var797);
        try {
            module0147.$g2094$.bind((SubLObject)module0751.$ic262$, var797);
            module0147.$g2095$.bind(module0751.$ic263$, var797);
            var798 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == module0205.f13145((SubLObject)module0751.$ic537$, var796, (SubLObject)module0751.T, (SubLObject)module0751.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var800, var797);
            module0147.$g2094$.rebind(var799, var797);
        }
        return var798;
    }
    
    public static SubLObject f47002(final SubLObject var68) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0205.f13155(var68) && module0751.NIL != conses_high.member(var68, module0751.$g6029$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f47003(final SubLObject var796) {
        final SubLThread var797 = SubLProcess.currentSubLThread();
        SubLObject var798 = (SubLObject)module0751.NIL;
        final SubLObject var799 = module0147.$g2094$.currentBinding(var797);
        final SubLObject var800 = module0147.$g2095$.currentBinding(var797);
        try {
            module0147.$g2094$.bind((SubLObject)module0751.$ic262$, var797);
            module0147.$g2095$.bind(module0751.$ic263$, var797);
            var798 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == module0205.f13145((SubLObject)module0751.$ic535$, var796, (SubLObject)module0751.T, (SubLObject)module0751.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var800, var797);
            module0147.$g2094$.rebind(var799, var797);
        }
        return var798;
    }
    
    public static SubLObject f47004() {
        final SubLObject var82 = module0751.$g6030$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47005(SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        return module0034.f1829(module0751.$g6030$.getGlobalValue(), (SubLObject)ConsesLow.list(var81), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47006(final SubLObject var81) {
        return f47007(var81, module0751.$ic540$);
    }
    
    public static SubLObject f46661(SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var82 = module0751.$g6030$.getGlobalValue();
        if (module0751.NIL == var82) {
            var82 = module0034.f1934((SubLObject)module0751.$ic539$, (SubLObject)module0751.$ic541$, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        SubLObject var83 = module0034.f1814(var82, var81, (SubLObject)module0751.$ic37$);
        if (var83 == module0751.$ic37$) {
            var83 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47006(var81)));
            module0034.f1816(var82, var81, var83, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var83);
    }
    
    public static SubLObject f47008(final SubLObject var796) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f46661((SubLObject)module0751.UNPROVIDED) && module0751.NIL != module0767.f48984(module0178.f11287(var796)));
    }
    
    public static SubLObject f47009(final SubLObject var797, SubLObject var798, SubLObject var81) {
        if (var798 == module0751.UNPROVIDED) {
            var798 = Symbols.symbol_function((SubLObject)module0751.IDENTITY);
        }
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var799 = SubLProcess.currentSubLThread();
        SubLObject var800 = (SubLObject)module0751.NIL;
        final SubLObject var801 = module0147.f9540(var81);
        final SubLObject var802 = module0147.$g2095$.currentBinding(var799);
        final SubLObject var803 = module0147.$g2094$.currentBinding(var799);
        final SubLObject var804 = module0147.$g2096$.currentBinding(var799);
        try {
            module0147.$g2095$.bind(module0147.f9545(var801), var799);
            module0147.$g2094$.bind(module0147.f9546(var801), var799);
            module0147.$g2096$.bind(module0147.f9549(var801), var799);
            var800 = Sort.sort(var797, (SubLObject)module0751.$ic542$, var798);
        }
        finally {
            module0147.$g2096$.rebind(var804, var799);
            module0147.$g2094$.rebind(var803, var799);
            module0147.$g2095$.rebind(var802, var799);
        }
        return var800;
    }
    
    public static SubLObject f47010(final SubLObject var797, SubLObject var798, SubLObject var81) {
        if (var798 == module0751.UNPROVIDED) {
            var798 = Symbols.symbol_function((SubLObject)module0751.IDENTITY);
        }
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var799 = SubLProcess.currentSubLThread();
        SubLObject var800 = (SubLObject)module0751.NIL;
        final SubLObject var801 = module0147.f9540(var81);
        final SubLObject var802 = module0147.$g2095$.currentBinding(var799);
        final SubLObject var803 = module0147.$g2094$.currentBinding(var799);
        final SubLObject var804 = module0147.$g2096$.currentBinding(var799);
        try {
            module0147.$g2095$.bind(module0147.f9545(var801), var799);
            module0147.$g2094$.bind(module0147.f9546(var801), var799);
            module0147.$g2096$.bind(module0147.f9549(var801), var799);
            var800 = Sort.stable_sort(var797, (SubLObject)module0751.$ic542$, var798);
        }
        finally {
            module0147.$g2096$.rebind(var804, var799);
            module0147.$g2094$.rebind(var803, var799);
            module0147.$g2095$.rebind(var802, var799);
        }
        return var800;
    }
    
    public static SubLObject f47011() {
        final SubLObject var82 = module0751.$g6031$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47012(final SubLObject var799, final SubLObject var800, SubLObject var576, SubLObject var801, SubLObject var802) {
        if (var576 == module0751.UNPROVIDED) {
            var576 = module0579.$g4260$.getDynamicValue();
        }
        if (var801 == module0751.UNPROVIDED) {
            var801 = f46600();
        }
        if (var802 == module0751.UNPROVIDED) {
            var802 = f46605();
        }
        return module0034.f1829(module0751.$g6031$.getGlobalValue(), (SubLObject)ConsesLow.list(var799, var800, var576, var801, var802), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47013(final SubLObject var799, final SubLObject var800, final SubLObject var576, final SubLObject var801, final SubLObject var802) {
        final SubLThread var803 = SubLProcess.currentSubLThread();
        final SubLObject var804 = (SubLObject)((module0751.NIL != var801) ? module0751.$ic543$ : ((module0751.NIL != var802) ? module0751.$ic544$ : module0751.NIL));
        SubLObject var805 = (SubLObject)module0751.NIL;
        final SubLObject var806 = module0579.$g4260$.currentBinding(var803);
        try {
            module0579.$g4260$.bind(var576, var803);
            final SubLObject var807 = module0147.f9540(module0579.$g4260$.getDynamicValue(var803));
            final SubLObject var38_804 = module0147.$g2095$.currentBinding(var803);
            final SubLObject var808 = module0147.$g2094$.currentBinding(var803);
            final SubLObject var809 = module0147.$g2096$.currentBinding(var803);
            try {
                module0147.$g2095$.bind(module0147.f9545(var807), var803);
                module0147.$g2094$.bind(module0147.f9546(var807), var803);
                module0147.$g2096$.bind(module0147.f9549(var807), var803);
                if (module0751.NIL != f47008(var799) && module0751.NIL == f47008(var800)) {
                    var805 = (SubLObject)module0751.NIL;
                }
                else if (module0751.NIL != f47008(var800) && module0751.NIL == f47008(var799)) {
                    var805 = (SubLObject)module0751.T;
                }
                else if (module0751.NIL != module0730.f44606(var799, var800, var804)) {
                    var805 = (SubLObject)module0751.T;
                }
                else if (module0751.NIL != module0730.f44606(var800, var799, var804)) {
                    var805 = (SubLObject)module0751.NIL;
                }
                else if (module0751.NIL != module0178.f11284(var799) && module0751.NIL != module0178.f11284(var800) && module0751.NIL != conses_high.member(module0178.f11333(var800), module0764.f48454((SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == module0004.f104(module0178.f11333(var799), module0764.f48454((SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                    var805 = (SubLObject)module0751.T;
                }
            }
            finally {
                module0147.$g2096$.rebind(var809, var803);
                module0147.$g2094$.rebind(var808, var803);
                module0147.$g2095$.rebind(var38_804, var803);
            }
        }
        finally {
            module0579.$g4260$.rebind(var806, var803);
        }
        return var805;
    }
    
    public static SubLObject f47014(final SubLObject var799, final SubLObject var800, SubLObject var576, SubLObject var801, SubLObject var802) {
        if (var576 == module0751.UNPROVIDED) {
            var576 = module0579.$g4260$.getDynamicValue();
        }
        if (var801 == module0751.UNPROVIDED) {
            var801 = f46600();
        }
        if (var802 == module0751.UNPROVIDED) {
            var802 = f46605();
        }
        SubLObject var803 = module0751.$g6031$.getGlobalValue();
        if (module0751.NIL == var803) {
            var803 = module0034.f1934((SubLObject)module0751.$ic542$, (SubLObject)module0751.$ic545$, (SubLObject)module0751.$ic546$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.FIVE_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        final SubLObject var804 = module0034.f1779(var799, var800, var576, var801, var802);
        final SubLObject var805 = module0034.f1814(var803, var804, (SubLObject)module0751.UNPROVIDED);
        if (var805 != module0751.$ic37$) {
            SubLObject var806 = var805;
            SubLObject var807 = (SubLObject)module0751.NIL;
            var807 = var806.first();
            while (module0751.NIL != var806) {
                SubLObject var808 = var807.first();
                final SubLObject var809 = conses_high.second(var807);
                if (var799.equal(var808.first())) {
                    var808 = var808.rest();
                    if (var800.equal(var808.first())) {
                        var808 = var808.rest();
                        if (var576.equal(var808.first())) {
                            var808 = var808.rest();
                            if (var801.equal(var808.first())) {
                                var808 = var808.rest();
                                if (module0751.NIL != var808 && module0751.NIL == var808.rest() && var802.equal(var808.first())) {
                                    return module0034.f1959(var809);
                                }
                            }
                        }
                    }
                }
                var806 = var806.rest();
                var807 = var806.first();
            }
        }
        final SubLObject var810 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47013(var799, var800, var576, var801, var802)));
        module0034.f1836(var803, var804, var805, var810, (SubLObject)ConsesLow.list(var799, var800, var576, var801, var802));
        return module0034.f1959(var810);
    }
    
    public static SubLObject f47015(final SubLObject var805, final SubLObject var806) {
        if (module0751.NIL != f47016()) {
            return (module0751.NIL != f46605()) ? f47017(var806, var805) : f47017(var805, var806);
        }
        return (module0751.NIL != f46605()) ? module0035.f2007(var805, var806) : module0035.f2007(var806, var805);
    }
    
    public static SubLObject f47016() {
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47017(final SubLObject var805, final SubLObject var806) {
        final SubLObject var807 = (SubLObject)((module0751.NIL != f46661((SubLObject)module0751.UNPROVIDED)) ? module0751.$ic547$ : module0751.NIL);
        return Numbers.numG(f47018(var805, var807), f47018(var806, var807));
    }
    
    public static SubLObject f47019(final SubLObject var94, SubLObject var807) {
        if (var807 == module0751.UNPROVIDED) {
            var807 = (SubLObject)module0751.NIL;
        }
        return (SubLObject)module0751.ZERO_INTEGER;
    }
    
    public static SubLObject f47018(final SubLObject var94, SubLObject var807) {
        if (var807 == module0751.UNPROVIDED) {
            var807 = (SubLObject)module0751.NIL;
        }
        final SubLThread var808 = SubLProcess.currentSubLThread();
        final SubLObject var809 = module0034.$g879$.getDynamicValue(var808);
        SubLObject var810 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var809) {
            return f47019(var94, var807);
        }
        var810 = module0034.f1857(var809, (SubLObject)module0751.$ic548$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var810) {
            var810 = module0034.f1807(module0034.f1842(var809), (SubLObject)module0751.$ic548$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var809, (SubLObject)module0751.$ic548$, var810);
        }
        final SubLObject var811 = module0034.f1782(var94, var807);
        final SubLObject var812 = module0034.f1814(var810, var811, (SubLObject)module0751.UNPROVIDED);
        if (var812 != module0751.$ic37$) {
            SubLObject var813 = var812;
            SubLObject var814 = (SubLObject)module0751.NIL;
            var814 = var813.first();
            while (module0751.NIL != var813) {
                SubLObject var815 = var814.first();
                final SubLObject var816 = conses_high.second(var814);
                if (var94.equal(var815.first())) {
                    var815 = var815.rest();
                    if (module0751.NIL != var815 && module0751.NIL == var815.rest() && var807.equal(var815.first())) {
                        return module0034.f1959(var816);
                    }
                }
                var813 = var813.rest();
                var814 = var813.first();
            }
        }
        final SubLObject var817 = Values.arg2(var808.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47019(var94, var807)));
        module0034.f1836(var810, var811, var812, var817, (SubLObject)ConsesLow.list(var94, var807));
        return module0034.f1959(var817);
    }
    
    public static SubLObject f47020() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0751.NIL;
        final SubLObject var4 = (SubLObject)module0751.$ic549$;
        final SubLObject var5 = module0173.f10962();
        SubLObject var6 = (SubLObject)module0751.ZERO_INTEGER;
        final SubLObject var7 = module0012.$g75$.currentBinding(var2);
        final SubLObject var8 = module0012.$g76$.currentBinding(var2);
        final SubLObject var9 = module0012.$g77$.currentBinding(var2);
        final SubLObject var10 = module0012.$g78$.currentBinding(var2);
        try {
            module0012.$g75$.bind((SubLObject)module0751.ZERO_INTEGER, var2);
            module0012.$g76$.bind((SubLObject)module0751.NIL, var2);
            module0012.$g77$.bind((SubLObject)module0751.T, var2);
            module0012.$g78$.bind(Time.get_universal_time(), var2);
            module0012.f478(var4);
            SubLObject var11 = module0173.f10961();
            SubLObject var12 = (SubLObject)module0751.NIL;
            var12 = var11.first();
            while (module0751.NIL != var11) {
                final SubLObject var13 = var12;
                if (module0751.NIL == module0065.f4772(var13, (SubLObject)module0751.$ic550$)) {
                    final SubLObject var814_815 = var13;
                    if (module0751.NIL == module0065.f4775(var814_815, (SubLObject)module0751.$ic550$)) {
                        final SubLObject var14 = module0065.f4740(var814_815);
                        final SubLObject var15 = (SubLObject)module0751.NIL;
                        SubLObject var16;
                        SubLObject var17;
                        SubLObject var18;
                        SubLObject var19;
                        for (var16 = Sequences.length(var14), var17 = (SubLObject)module0751.NIL, var17 = (SubLObject)module0751.ZERO_INTEGER; var17.numL(var16); var17 = Numbers.add(var17, (SubLObject)module0751.ONE_INTEGER)) {
                            var18 = ((module0751.NIL != var15) ? Numbers.subtract(var16, var17, (SubLObject)module0751.ONE_INTEGER) : var17);
                            var19 = Vectors.aref(var14, var18);
                            if (module0751.NIL == module0065.f4749(var19) || module0751.NIL == module0065.f4773((SubLObject)module0751.$ic550$)) {
                                if (module0751.NIL != module0065.f4749(var19)) {
                                    var19 = (SubLObject)module0751.$ic550$;
                                }
                                var6 = Numbers.add(var6, (SubLObject)module0751.ONE_INTEGER);
                                module0012.note_percent_progress(var6, var5);
                                if (module0751.NIL != f47021(var19, (SubLObject)module0751.UNPROVIDED)) {
                                    var3 = (SubLObject)ConsesLow.cons(var19, var3);
                                    print_high.print(var19, (SubLObject)module0751.UNPROVIDED);
                                }
                            }
                        }
                    }
                    final SubLObject var821_822 = var13;
                    if (module0751.NIL == module0065.f4777(var821_822) || module0751.NIL == module0065.f4773((SubLObject)module0751.$ic550$)) {
                        final SubLObject var20 = module0065.f4738(var821_822);
                        SubLObject var21 = module0065.f4739(var821_822);
                        final SubLObject var22 = module0065.f4734(var821_822);
                        final SubLObject var23 = (SubLObject)((module0751.NIL != module0065.f4773((SubLObject)module0751.$ic550$)) ? module0751.NIL : module0751.$ic550$);
                        while (var21.numL(var22)) {
                            final SubLObject var24 = Hashtables.gethash_without_values(var21, var20, var23);
                            if (module0751.NIL == module0065.f4773((SubLObject)module0751.$ic550$) || module0751.NIL == module0065.f4749(var24)) {
                                var6 = Numbers.add(var6, (SubLObject)module0751.ONE_INTEGER);
                                module0012.note_percent_progress(var6, var5);
                                if (module0751.NIL != f47021(var24, (SubLObject)module0751.UNPROVIDED)) {
                                    var3 = (SubLObject)ConsesLow.cons(var24, var3);
                                    print_high.print(var24, (SubLObject)module0751.UNPROVIDED);
                                }
                            }
                            var21 = Numbers.add(var21, (SubLObject)module0751.ONE_INTEGER);
                        }
                    }
                }
                var11 = var11.rest();
                var12 = var11.first();
            }
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var10, var2);
            module0012.$g77$.rebind(var9, var2);
            module0012.$g76$.rebind(var8, var2);
            module0012.$g75$.rebind(var7, var2);
        }
        return var3;
    }
    
    public static SubLObject f47021(final SubLObject var788, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var789 = SubLProcess.currentSubLThread();
        SubLObject var790 = (SubLObject)module0751.NIL;
        final SubLObject var791 = module0579.$g4260$.currentBinding(var789);
        try {
            module0579.$g4260$.bind(var81, var789);
            final SubLObject var792 = module0764.f48446(var788, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            final SubLObject var793 = module0147.f9540(var81);
            final SubLObject var38_827 = module0147.$g2095$.currentBinding(var789);
            final SubLObject var794 = module0147.$g2094$.currentBinding(var789);
            final SubLObject var795 = module0147.$g2096$.currentBinding(var789);
            try {
                module0147.$g2095$.bind(module0147.f9545(var793), var789);
                module0147.$g2094$.bind(module0147.f9546(var793), var789);
                module0147.$g2096$.bind(module0147.f9549(var793), var789);
                var790 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0035.f2002(var792, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == module0220.f14544(var788, module0751.$ic47$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == module0220.f14544(var788, module0751.$ic551$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
            }
            finally {
                module0147.$g2096$.rebind(var795, var789);
                module0147.$g2094$.rebind(var794, var789);
                module0147.$g2095$.rebind(var38_827, var789);
            }
        }
        finally {
            module0579.$g4260$.rebind(var791, var789);
        }
        return var790;
    }
    
    public static SubLObject f47022(final SubLObject var828, final SubLObject var829) {
        module0543.f33628((SubLObject)ConsesLow.list(module0751.$ic552$, var828, var829), module0178.f11287(var828), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46881(final SubLObject var180) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f46842((SubLObject)ConsesLow.list(module0751.$ic553$, var180), (SubLObject)module0751.UNPROVIDED) || module0751.NIL != f46847((SubLObject)ConsesLow.list(module0751.$ic554$, (SubLObject)module0751.$ic555$, (SubLObject)ConsesLow.listS(module0751.$ic431$, var180, (SubLObject)module0751.$ic556$)), (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f47023(final SubLObject var830, final SubLObject var831) {
        return module0549.f33910(f46905(var830), f46905(var831));
    }
    
    public static SubLObject f46890(final SubLObject var830, final SubLObject var831) {
        final SubLThread var832 = SubLProcess.currentSubLThread();
        final SubLObject var833 = module0034.$g879$.getDynamicValue(var832);
        SubLObject var834 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var833) {
            return f47023(var830, var831);
        }
        var834 = module0034.f1857(var833, (SubLObject)module0751.$ic454$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var834) {
            var834 = module0034.f1807(module0034.f1842(var833), (SubLObject)module0751.$ic454$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.$ic546$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var833, (SubLObject)module0751.$ic454$, var834);
        }
        final SubLObject var835 = module0034.f1782(var830, var831);
        final SubLObject var836 = module0034.f1814(var834, var835, (SubLObject)module0751.UNPROVIDED);
        if (var836 != module0751.$ic37$) {
            SubLObject var837 = var836;
            SubLObject var838 = (SubLObject)module0751.NIL;
            var838 = var837.first();
            while (module0751.NIL != var837) {
                SubLObject var839 = var838.first();
                final SubLObject var840 = conses_high.second(var838);
                if (var830.equal(var839.first())) {
                    var839 = var839.rest();
                    if (module0751.NIL != var839 && module0751.NIL == var839.rest() && var831.equal(var839.first())) {
                        return module0034.f1959(var840);
                    }
                }
                var837 = var837.rest();
                var838 = var837.first();
            }
        }
        final SubLObject var841 = Values.arg2(var832.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47023(var830, var831)));
        module0034.f1836(var834, var835, var836, var841, (SubLObject)ConsesLow.list(var830, var831));
        return module0034.f1959(var841);
    }
    
    public static SubLObject f46905(final SubLObject var68) {
        return (module0751.NIL != f46676(var68)) ? module0205.f13277(var68, (SubLObject)module0751.UNPROVIDED) : var68;
    }
    
    public static SubLObject f47024(final SubLObject var832, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        if (var832 == module0751.$ic103$) {
            return (SubLObject)module0751.$ic103$;
        }
        if (var832.isList()) {
            return f47025(var832, var81);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47025(final SubLObject var833, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var834 = f47026(var833, var81);
        if (module0751.NIL != f46661((SubLObject)module0751.UNPROVIDED) && module0751.NIL == module0004.f104(module0751.$ic557$, var834, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            SubLObject var835;
            SubLObject var836;
            SubLObject var837;
            for (var835 = (SubLObject)module0751.NIL, var836 = (SubLObject)module0751.NIL, var836 = var834; module0751.NIL == var835 && module0751.NIL != var836; var836 = var836.rest()) {
                var837 = var836.first();
                if (module0751.NIL != module0758.f48001(var837, var81)) {
                    var835 = (SubLObject)module0751.T;
                }
            }
            if (module0751.NIL != var835) {
                var834 = (SubLObject)ConsesLow.cons(module0751.$ic557$, var834);
            }
        }
        if (module0751.NIL == module0004.f104(module0751.$ic558$, var834, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            SubLObject var836;
            SubLObject var837;
            SubLObject var838;
            for (var838 = (SubLObject)module0751.NIL, var836 = (SubLObject)module0751.NIL, var836 = var834; module0751.NIL == var838 && module0751.NIL != var836; var836 = var836.rest()) {
                var837 = var836.first();
                if (module0751.NIL != module0758.f48001(var837, var81)) {
                    var838 = (SubLObject)module0751.T;
                }
            }
            if (module0751.NIL != var838) {
                var834 = (SubLObject)ConsesLow.cons(module0751.$ic558$, var834);
            }
        }
        return var834;
    }
    
    public static SubLObject f47027(final SubLObject var833, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        if (module0751.NIL != module0035.f2012(var833) || var833 == module0751.$ic103$) {
            return (SubLObject)ConsesLow.list(module0751.$g5993$.getGlobalValue());
        }
        SubLObject var834 = (SubLObject)module0751.NIL;
        SubLObject var835 = f47028();
        SubLObject var836 = (SubLObject)module0751.NIL;
        var836 = var835.first();
        while (module0751.NIL != var835) {
            SubLObject var837;
            SubLObject var838;
            SubLObject var839;
            for (var837 = (SubLObject)module0751.NIL, var838 = (SubLObject)module0751.NIL, var838 = var833; module0751.NIL == var837 && module0751.NIL != var838; var838 = var838.rest()) {
                var839 = var838.first();
                if (module0751.NIL != f46658(var839, var836, var81)) {
                    var834 = (SubLObject)ConsesLow.cons(var836, var834);
                    var837 = (SubLObject)module0751.T;
                }
            }
            var835 = var835.rest();
            var836 = var835.first();
        }
        if (module0751.NIL == module0004.f104(module0751.$g5993$.getGlobalValue(), var834, Symbols.symbol_function((SubLObject)module0751.EQ), (SubLObject)module0751.UNPROVIDED) && module0751.NIL != module0035.find_if_not(Symbols.symbol_function((SubLObject)module0751.$ic560$), var833, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            var834 = (SubLObject)ConsesLow.cons(module0751.$g5993$.getGlobalValue(), var834);
        }
        if (module0751.NIL != module0035.f2012(var834)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic561$, var833);
            }
            var834 = var833;
        }
        return var834;
    }
    
    public static SubLObject f47026(final SubLObject var833, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var834 = SubLProcess.currentSubLThread();
        final SubLObject var835 = module0034.$g879$.getDynamicValue(var834);
        SubLObject var836 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var835) {
            return f47027(var833, var81);
        }
        var836 = module0034.f1857(var835, (SubLObject)module0751.$ic559$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var836) {
            var836 = module0034.f1807(module0034.f1842(var835), (SubLObject)module0751.$ic559$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.$ic45$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var835, (SubLObject)module0751.$ic559$, var836);
        }
        final SubLObject var837 = module0034.f1782(var833, var81);
        final SubLObject var838 = module0034.f1814(var836, var837, (SubLObject)module0751.UNPROVIDED);
        if (var838 != module0751.$ic37$) {
            SubLObject var839 = var838;
            SubLObject var840 = (SubLObject)module0751.NIL;
            var840 = var839.first();
            while (module0751.NIL != var839) {
                SubLObject var841 = var840.first();
                final SubLObject var842 = conses_high.second(var840);
                if (var833.equal(var841.first())) {
                    var841 = var841.rest();
                    if (module0751.NIL != var841 && module0751.NIL == var841.rest() && var81.equal(var841.first())) {
                        return module0034.f1959(var842);
                    }
                }
                var839 = var839.rest();
                var840 = var839.first();
            }
        }
        final SubLObject var843 = Values.arg2(var834.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47027(var833, var81)));
        module0034.f1836(var836, var837, var838, var843, (SubLObject)ConsesLow.list(var833, var81));
        return module0034.f1959(var843);
    }
    
    public static SubLObject f47029(final SubLObject var159, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        if (module0751.NIL == f47030(var159)) {
            return module0751.$g5993$.getGlobalValue();
        }
        SubLObject var160 = f47028();
        SubLObject var161 = (SubLObject)module0751.NIL;
        var161 = var160.first();
        while (module0751.NIL != var160) {
            if (module0751.NIL != f46658(var159, var161, var81)) {
                return var161;
            }
            var160 = var160.rest();
            var161 = var160.first();
        }
        return var159;
    }
    
    public static SubLObject f47031(final SubLObject var159, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var160 = SubLProcess.currentSubLThread();
        final SubLObject var161 = module0034.$g879$.getDynamicValue(var160);
        SubLObject var162 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var161) {
            return f47029(var159, var81);
        }
        var162 = module0034.f1857(var161, (SubLObject)module0751.$ic562$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var162) {
            var162 = module0034.f1807(module0034.f1842(var161), (SubLObject)module0751.$ic562$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.$ic45$, (SubLObject)module0751.EQ, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var161, (SubLObject)module0751.$ic562$, var162);
        }
        final SubLObject var163 = module0034.f1782(var159, var81);
        final SubLObject var164 = module0034.f1814(var162, var163, (SubLObject)module0751.UNPROVIDED);
        if (var164 != module0751.$ic37$) {
            SubLObject var165 = var164;
            SubLObject var166 = (SubLObject)module0751.NIL;
            var166 = var165.first();
            while (module0751.NIL != var165) {
                SubLObject var167 = var166.first();
                final SubLObject var168 = conses_high.second(var166);
                if (var159.eql(var167.first())) {
                    var167 = var167.rest();
                    if (module0751.NIL != var167 && module0751.NIL == var167.rest() && var81.eql(var167.first())) {
                        return module0034.f1959(var168);
                    }
                }
                var165 = var165.rest();
                var166 = var165.first();
            }
        }
        final SubLObject var169 = Values.arg2(var160.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47029(var159, var81)));
        module0034.f1836(var162, var163, var164, var169, (SubLObject)ConsesLow.list(var159, var81));
        return module0034.f1959(var169);
    }
    
    public static SubLObject f47028() {
        return (SubLObject)module0751.$ic563$;
    }
    
    public static SubLObject f47032(final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        if ((module0751.NIL != module0202.f12590(var68) || module0751.NIL != assertion_handles_oc.f11035(var68)) && module0751.NIL != module0206.f13425(var68)) {
            return (SubLObject)module0751.$ic564$;
        }
        if (module0751.NIL != assertion_handles_oc.f11035(var68) && module0751.NIL != module0775.f49820(var68)) {
            return (SubLObject)module0751.$ic565$;
        }
        if (module0751.NIL != module0269.f17716(var68)) {
            return (SubLObject)module0751.$ic103$;
        }
        if (module0751.NIL != module0762.f48164(var68)) {
            return (SubLObject)module0751.$ic103$;
        }
        if (module0751.NIL != module0614.f37617(var68)) {
            return (SubLObject)module0751.$ic103$;
        }
        if (module0751.NIL != module0337.f22630(var68, (SubLObject)module0751.$ic566$)) {
            return (SubLObject)module0751.$ic103$;
        }
        if (module0751.NIL != oc_inference_datastructures_inference.f25730(module0579.$g4296$.getDynamicValue(var69))) {
            return f47033(var68);
        }
        if (module0751.NIL != f46684(var68, module0751.$ic567$, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.$ic445$;
        }
        return (SubLObject)module0751.$ic103$;
    }
    
    public static SubLObject f47033(final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        final SubLObject var70 = f47034();
        SubLObject var71 = (SubLObject)module0751.NIL;
        if (module0751.NIL != var70 && module0751.NIL == var71) {
            SubLObject var72 = f46828(var68, var70, Symbols.symbol_function((SubLObject)module0751.EQUAL));
            SubLObject var73 = (SubLObject)module0751.NIL;
            var73 = var72.first();
            while (module0751.NIL == var71 && module0751.NIL != var72) {
                if (module0751.NIL != module0035.f2014(var73)) {
                    final SubLObject var74 = module0205.f13132(f46672(f46604(conses_high.butlast(var73, (SubLObject)module0751.UNPROVIDED)), var70));
                    final SubLObject var75 = f47035(module0035.f2114(var73), var74);
                    if (module0751.NIL != var75) {
                        var71 = (SubLObject)ConsesLow.list(var75);
                    }
                }
                var72 = var72.rest();
                var73 = var72.first();
            }
        }
        if (module0751.NIL == var71) {
            final SubLObject var76 = module0579.$g4296$.currentBinding(var69);
            try {
                module0579.$g4296$.bind((SubLObject)module0751.NIL, var69);
                var71 = f47032(var68);
            }
            finally {
                module0579.$g4296$.rebind(var76, var69);
            }
        }
        return var71;
    }
    
    public static SubLObject f47035(final SubLObject var25, final SubLObject var439) {
        return f46770((SubLObject)module0751.$ic568$, (SubLObject)ConsesLow.listS(module0751.$ic569$, var25, var439, (SubLObject)module0751.$ic570$), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED).first();
    }
    
    public static SubLObject f47034() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0751.NIL;
        if (module0751.NIL != oc_inference_datastructures_inference.f25730(module0579.$g4296$.getDynamicValue(var2))) {
            var3 = oc_inference_datastructures_inference.f25756(module0579.$g4296$.getDynamicValue(var2));
        }
        return var3;
    }
    
    public static SubLObject f47036(final SubLObject var68) {
        if (module0751.NIL != module0201.f12546(var68)) {
            return (SubLObject)module0751.$ic59$;
        }
        if (module0751.NIL != module0206.f13425(var68)) {
            return (SubLObject)module0751.$ic571$;
        }
        return (SubLObject)module0751.$ic59$;
    }
    
    public static SubLObject f47037(final SubLObject var776) {
        final SubLThread var777 = SubLProcess.currentSubLThread();
        SubLObject var778 = (SubLObject)module0751.NIL;
        if (module0751.NIL != f47038(var776)) {
            final SubLObject var779 = module0147.f9540(module0579.$g4260$.getDynamicValue(var777));
            final SubLObject var780 = module0147.$g2095$.currentBinding(var777);
            final SubLObject var781 = module0147.$g2094$.currentBinding(var777);
            final SubLObject var782 = module0147.$g2096$.currentBinding(var777);
            try {
                module0147.$g2095$.bind(module0147.f9545(var779), var777);
                module0147.$g2094$.bind(module0147.f9546(var779), var777);
                module0147.$g2096$.bind(module0147.f9549(var779), var777);
                SubLObject var783 = var776;
                SubLObject var784 = (SubLObject)module0751.NIL;
                var784 = var783.first();
                while (module0751.NIL != var783) {
                    var778 = ConsesLow.append(var778, module0260.f17034(var784, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
                    var783 = var783.rest();
                    var784 = var783.first();
                }
            }
            finally {
                module0147.$g2096$.rebind(var782, var777);
                module0147.$g2094$.rebind(var781, var777);
                module0147.$g2095$.rebind(var780, var777);
            }
        }
        return var778;
    }
    
    public static SubLObject f47039() {
        return module0035.delete_if_not(Symbols.symbol_function((SubLObject)module0751.$ic9$), (SubLObject)ConsesLow.list(f47040(), f47041(), f47042(), module0751.$ic573$, module0751.$ic574$, module0751.$ic575$), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47043() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        final SubLObject var3 = module0034.$g879$.getDynamicValue(var2);
        SubLObject var4 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var3) {
            return f47039();
        }
        var4 = module0034.f1857(var3, (SubLObject)module0751.$ic572$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var4) {
            var4 = module0034.f1807(module0034.f1842(var3), (SubLObject)module0751.$ic572$, (SubLObject)module0751.ZERO_INTEGER, (SubLObject)module0751.NIL, (SubLObject)module0751.EQL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var3, (SubLObject)module0751.$ic572$, var4);
        }
        SubLObject var5 = module0034.f1810(var4, (SubLObject)module0751.UNPROVIDED);
        if (var5 == module0751.$ic37$) {
            var5 = Values.arg2(var2.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47039()));
            module0034.f1812(var4, var5, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var5);
    }
    
    public static SubLObject f47040() {
        return module0751.$ic576$;
    }
    
    public static SubLObject f47044() {
        final SubLObject var838 = constants_high_oc.f10737((SubLObject)module0751.$ic577$);
        return (module0751.NIL != var838) ? var838 : f47040();
    }
    
    public static SubLObject f47041() {
        return module0751.$ic578$;
    }
    
    public static SubLObject f47042() {
        return module0751.$ic579$;
    }
    
    public static SubLObject f47045(final SubLObject var80) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var80.eql(f47040()) || var80.eql(f47041()) || var80.eql(f47042()));
    }
    
    public static SubLObject f47046(final SubLObject var839, SubLObject var322) {
        if (var322 == module0751.UNPROVIDED) {
            var322 = (SubLObject)module0751.NIL;
        }
        final SubLThread var840 = SubLProcess.currentSubLThread();
        SubLObject var841 = (SubLObject)module0751.NIL;
        final SubLObject var842 = (module0751.NIL != var322) ? var322 : module0612.f37426(Time.get_universal_time());
        if (var839.eql(module0751.$ic581$) || var839.eql(module0751.$ic582$)) {
            var841 = f47040();
        }
        else if (var839.eql(module0751.$ic583$)) {
            var841 = f47042();
        }
        else if (module0751.NIL != module0337.f22630(var839, (SubLObject)module0751.$ic584$)) {
            var841 = ((module0751.NIL != module0579.$g4258$.getDynamicValue(var840)) ? f47044() : f47040());
        }
        else if (module0751.NIL != module0337.f22630(var839, (SubLObject)module0751.$ic585$)) {
            final SubLObject var843 = module0205.f13203(var839, (SubLObject)module0751.UNPROVIDED);
            if (module0751.NIL != f46847((SubLObject)ConsesLow.list(module0751.$ic586$, var843, var842), (SubLObject)module0751.UNPROVIDED)) {
                var841 = f47042();
            }
            else if (module0751.NIL != module0579.$g4258$.getDynamicValue(var840)) {
                var841 = f47044();
            }
            else {
                var841 = f47040();
            }
        }
        else if (module0751.NIL != f47047(var839, var842)) {
            var841 = f47040();
        }
        else if (module0751.NIL != f46847((SubLObject)ConsesLow.list(module0751.$ic586$, var839, var842), (SubLObject)module0751.UNPROVIDED)) {
            var841 = f47042();
        }
        else {
            var841 = f47041();
        }
        return var841;
    }
    
    public static SubLObject f47048(final SubLObject var839, SubLObject var322) {
        if (var322 == module0751.UNPROVIDED) {
            var322 = (SubLObject)module0751.NIL;
        }
        final SubLThread var840 = SubLProcess.currentSubLThread();
        final SubLObject var841 = module0034.$g879$.getDynamicValue(var840);
        SubLObject var842 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var841) {
            return f47046(var839, var322);
        }
        var842 = module0034.f1857(var841, (SubLObject)module0751.$ic580$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var842) {
            var842 = module0034.f1807(module0034.f1842(var841), (SubLObject)module0751.$ic580$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var841, (SubLObject)module0751.$ic580$, var842);
        }
        final SubLObject var843 = module0034.f1782(var839, var322);
        final SubLObject var844 = module0034.f1814(var842, var843, (SubLObject)module0751.UNPROVIDED);
        if (var844 != module0751.$ic37$) {
            SubLObject var845 = var844;
            SubLObject var846 = (SubLObject)module0751.NIL;
            var846 = var845.first();
            while (module0751.NIL != var845) {
                SubLObject var847 = var846.first();
                final SubLObject var848 = conses_high.second(var846);
                if (var839.equal(var847.first())) {
                    var847 = var847.rest();
                    if (module0751.NIL != var847 && module0751.NIL == var847.rest() && var322.equal(var847.first())) {
                        return module0034.f1959(var848);
                    }
                }
                var845 = var845.rest();
                var846 = var845.first();
            }
        }
        final SubLObject var849 = Values.arg2(var840.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47046(var839, var322)));
        module0034.f1836(var842, var843, var844, var849, (SubLObject)ConsesLow.list(var839, var322));
        return module0034.f1959(var849);
    }
    
    public static SubLObject f47047(final SubLObject var839, final SubLObject var322) {
        if (module0751.NIL != module0337.f22630(var839, (SubLObject)module0751.$ic587$)) {
            return f47047(module0205.f13203(var839, (SubLObject)module0751.UNPROVIDED), var322);
        }
        if (module0751.NIL != module0337.f22630(var839, (SubLObject)module0751.$ic588$)) {
            return (SubLObject)module0751.NIL;
        }
        return f46847((SubLObject)ConsesLow.list(module0751.$ic589$, var839, var322), (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f46817(final SubLObject var26) {
        return module0202.f12589(var26, module0751.$ic534$);
    }
    
    public static SubLObject f46818(SubLObject var26) {
        SubLObject var28;
        final SubLObject var27 = var28 = module0035.f2257(var26, Symbols.symbol_function((SubLObject)module0751.$ic590$), Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        SubLObject var29 = (SubLObject)module0751.NIL;
        var29 = var28.first();
        while (module0751.NIL != var28) {
            if (module0751.NIL != module0207.f13513(var29)) {
                var26 = conses_high.subst(module0205.f13203(var29, (SubLObject)module0751.UNPROVIDED), var29, var26, Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED);
            }
            var28 = var28.rest();
            var29 = var28.first();
        }
        return var26;
    }
    
    public static SubLObject f47049(final SubLObject var32) {
        final SubLThread var33 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((module0751.NIL != module0751.$g5994$.getGlobalValue() && module0751.NIL != f47050(var32, module0751.$g5994$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED)) || module0751.NIL != conses_high.member(var32, module0751.$g5992$.getDynamicValue(var33), Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f47051(final SubLObject var180, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var181 = SubLProcess.currentSubLThread();
        SubLObject var182 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0173.f10955(var180)) {
            final SubLObject var183 = module0147.f9540(var81);
            final SubLObject var184 = module0147.$g2095$.currentBinding(var181);
            final SubLObject var185 = module0147.$g2094$.currentBinding(var181);
            final SubLObject var186 = module0147.$g2096$.currentBinding(var181);
            try {
                module0147.$g2095$.bind(module0147.f9545(var183), var181);
                module0147.$g2094$.bind(module0147.f9546(var183), var181);
                module0147.$g2096$.bind(module0147.f9549(var183), var181);
                if (module0751.NIL == var182) {
                    SubLObject var187;
                    SubLObject var188;
                    for (var187 = module0767.f48865((SubLObject)module0751.UNPROVIDED), var188 = (SubLObject)module0751.NIL, var188 = var187.first(); module0751.NIL == var182 && module0751.NIL != var187; var182 = module0220.f14544(var180, var188, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), var187 = var187.rest(), var188 = var187.first()) {}
                }
            }
            finally {
                module0147.$g2096$.rebind(var186, var181);
                module0147.$g2094$.rebind(var185, var181);
                module0147.$g2095$.rebind(var184, var181);
            }
        }
        return var182;
    }
    
    public static SubLObject f47052(final SubLObject var180, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        final SubLThread var181 = SubLProcess.currentSubLThread();
        final SubLObject var182 = module0034.$g879$.getDynamicValue(var181);
        SubLObject var183 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var182) {
            return f47051(var180, var81);
        }
        var183 = module0034.f1857(var182, (SubLObject)module0751.$ic591$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var183) {
            var183 = module0034.f1807(module0034.f1842(var182), (SubLObject)module0751.$ic591$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.$ic536$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var182, (SubLObject)module0751.$ic591$, var183);
        }
        final SubLObject var184 = module0034.f1782(var180, var81);
        final SubLObject var185 = module0034.f1814(var183, var184, (SubLObject)module0751.UNPROVIDED);
        if (var185 != module0751.$ic37$) {
            SubLObject var186 = var185;
            SubLObject var187 = (SubLObject)module0751.NIL;
            var187 = var186.first();
            while (module0751.NIL != var186) {
                SubLObject var188 = var187.first();
                final SubLObject var189 = conses_high.second(var187);
                if (var180.equal(var188.first())) {
                    var188 = var188.rest();
                    if (module0751.NIL != var188 && module0751.NIL == var188.rest() && var81.equal(var188.first())) {
                        return module0034.f1959(var189);
                    }
                }
                var186 = var186.rest();
                var187 = var186.first();
            }
        }
        final SubLObject var190 = Values.arg2(var181.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47051(var180, var81)));
        module0034.f1836(var183, var184, var185, var190, (SubLObject)ConsesLow.list(var180, var81));
        return module0034.f1959(var190);
    }
    
    public static SubLObject f47053(final SubLObject var32, final SubLObject var844, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var845 = SubLProcess.currentSubLThread();
        SubLObject var846 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0210.f13565(var32)) {
            final SubLObject var847 = module0147.f9540(var81);
            final SubLObject var848 = module0147.$g2095$.currentBinding(var845);
            final SubLObject var849 = module0147.$g2094$.currentBinding(var845);
            final SubLObject var850 = module0147.$g2096$.currentBinding(var845);
            try {
                module0147.$g2095$.bind(module0147.f9545(var847), var845);
                module0147.$g2094$.bind(module0147.f9546(var847), var845);
                module0147.$g2096$.bind(module0147.f9549(var847), var845);
                var846 = module0259.f16902(var32, var844, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                module0147.$g2096$.rebind(var850, var845);
                module0147.$g2094$.rebind(var849, var845);
                module0147.$g2095$.rebind(var848, var845);
            }
        }
        else if (module0751.NIL == var846) {
            SubLObject var851;
            SubLObject var852;
            for (var851 = var844, var852 = (SubLObject)module0751.NIL, var852 = var851.first(); module0751.NIL == var846 && module0751.NIL != var851; var846 = f46684(var32, var852, var81), var851 = var851.rest(), var852 = var851.first()) {}
        }
        return var846;
    }
    
    public static SubLObject f47050(final SubLObject var32, final SubLObject var844, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var845 = SubLProcess.currentSubLThread();
        final SubLObject var846 = module0034.$g879$.getDynamicValue(var845);
        SubLObject var847 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var846) {
            return f47053(var32, var844, var81);
        }
        var847 = module0034.f1857(var846, (SubLObject)module0751.$ic592$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var847) {
            var847 = module0034.f1807(module0034.f1842(var846), (SubLObject)module0751.$ic592$, (SubLObject)module0751.THREE_INTEGER, (SubLObject)module0751.$ic593$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var846, (SubLObject)module0751.$ic592$, var847);
        }
        final SubLObject var848 = module0034.f1781(var32, var844, var81);
        final SubLObject var849 = module0034.f1814(var847, var848, (SubLObject)module0751.UNPROVIDED);
        if (var849 != module0751.$ic37$) {
            SubLObject var850 = var849;
            SubLObject var851 = (SubLObject)module0751.NIL;
            var851 = var850.first();
            while (module0751.NIL != var850) {
                SubLObject var852 = var851.first();
                final SubLObject var853 = conses_high.second(var851);
                if (var32.equal(var852.first())) {
                    var852 = var852.rest();
                    if (var844.equal(var852.first())) {
                        var852 = var852.rest();
                        if (module0751.NIL != var852 && module0751.NIL == var852.rest() && var81.equal(var852.first())) {
                            return module0034.f1959(var853);
                        }
                    }
                }
                var850 = var850.rest();
                var851 = var850.first();
            }
        }
        final SubLObject var854 = Values.arg2(var845.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47053(var32, var844, var81)));
        module0034.f1836(var847, var848, var849, var854, (SubLObject)ConsesLow.list(var32, var844, var81));
        return module0034.f1959(var854);
    }
    
    public static SubLObject f47054(final SubLObject var845, final SubLObject var846, final SubLObject var81) {
        final SubLThread var847 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0077.f5302(module0751.$g6032$.getDynamicValue(var847)) && module0751.NIL != module0077.f5320((SubLObject)ConsesLow.list(var845, var846, var81), module0751.$g6032$.getDynamicValue(var847)));
    }
    
    public static SubLObject f47055(final SubLObject var5, final SubLObject var6) {
        SubLObject var8;
        final SubLObject var7 = var8 = var5.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic594$);
        final SubLObject var9 = var8.rest();
        var8 = var8.first();
        SubLObject var10 = (SubLObject)module0751.NIL;
        SubLObject var11 = (SubLObject)module0751.NIL;
        SubLObject var12 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic594$);
        var10 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic594$);
        var11 = var8.first();
        var8 = var8.rest();
        cdestructuring_bind.destructuring_bind_must_consp(var8, var7, (SubLObject)module0751.$ic594$);
        var12 = var8.first();
        var8 = var8.rest();
        if (module0751.NIL == var8) {
            final SubLObject var13;
            var8 = (var13 = var9);
            final SubLObject var14 = (SubLObject)module0751.$ic595$;
            return (SubLObject)ConsesLow.list((SubLObject)module0751.$ic18$, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic596$, (SubLObject)ConsesLow.list(var14, (SubLObject)ConsesLow.list((SubLObject)module0751.$ic437$, var10, var11, var12))), (SubLObject)ConsesLow.listS((SubLObject)module0751.$ic597$, var14, (SubLObject)module0751.$ic598$), (SubLObject)ConsesLow.list((SubLObject)module0751.$ic20$, reader.bq_cons((SubLObject)module0751.$ic599$, ConsesLow.append(var13, (SubLObject)module0751.NIL)), (SubLObject)ConsesLow.listS((SubLObject)module0751.$ic600$, var14, (SubLObject)module0751.$ic598$)));
        }
        cdestructuring_bind.cdestructuring_bind_error(var7, (SubLObject)module0751.$ic594$);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47056() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return (module0751.NIL != module0077.f5302(module0751.$g6032$.getDynamicValue(var2))) ? module0751.$g6032$.getDynamicValue(var2) : module0077.f5313(Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47057(final SubLObject var845, final SubLObject var846, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var847 = SubLProcess.currentSubLThread();
        if (module0751.NIL != f47054(var845, var846, var81)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic604$, var845, var846, var81);
            }
            return (SubLObject)module0751.NIL;
        }
        SubLObject var848 = (SubLObject)module0751.NIL;
        final SubLObject var849 = module0751.$g6032$.currentBinding(var847);
        try {
            module0751.$g6032$.bind(f47056(), var847);
            final SubLObject var850 = (SubLObject)ConsesLow.list(var845, var846, var81);
            module0077.f5326(var850, module0751.$g6032$.getDynamicValue(var847));
            try {
                if (module0751.NIL != module0202.f12656(var845) && module0751.NIL != f46684(var845.first(), module0751.$ic605$, var81) && module0751.NIL != module0259.f16892(var845, var846, var81, (SubLObject)module0751.UNPROVIDED)) {
                    var848 = (SubLObject)module0751.T;
                }
                else if (module0751.NIL != module0202.f12656(var845) && module0751.NIL != f46684(var845.first(), module0751.$ic605$, var81) && module0751.NIL != module0257.f16696(module0259.f16824(var845, var81, (SubLObject)module0751.UNPROVIDED), var846, var81, (SubLObject)module0751.UNPROVIDED)) {
                    var848 = (SubLObject)module0751.NIL;
                }
                else if (module0751.NIL != module0201.f12546(var845) && module0751.NIL != module0579.f35510() && module0751.NIL != f46669(module0754.f47312(var845), var846, var81)) {
                    var848 = (SubLObject)module0751.T;
                }
                else if (module0751.NIL != module0201.f12546(var845) && module0751.NIL != f47058(var845, var846, var81)) {
                    var848 = (SubLObject)module0751.T;
                }
                else if (module0751.NIL != module0205.f13155(var845) && module0751.NIL != module0205.f13155(var846)) {
                    var848 = module0259.f16854(var845, var846, var81, (SubLObject)module0751.UNPROVIDED);
                }
                else if (module0751.NIL != module0201.f12546(var845) || module0751.NIL != module0201.f12546(var846)) {
                    var848 = (SubLObject)module0751.NIL;
                }
                else if (var846.eql(module0751.$ic567$)) {
                    var848 = module0269.f17714(var845);
                }
                else {
                    var848 = f46847((SubLObject)ConsesLow.list(module0751.$ic291$, var845, var846), var81);
                }
            }
            finally {
                final SubLObject var38_852 = Threads.$is_thread_performing_cleanupP$.currentBinding(var847);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var847);
                    module0077.f5327(var850, module0751.$g6032$.getDynamicValue(var847));
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(var38_852, var847);
                }
            }
        }
        finally {
            module0751.$g6032$.rebind(var849, var847);
        }
        return var848;
    }
    
    public static SubLObject f46684(final SubLObject var845, final SubLObject var846, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var847 = SubLProcess.currentSubLThread();
        final SubLObject var848 = module0034.$g879$.getDynamicValue(var847);
        SubLObject var849 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var848) {
            return f47057(var845, var846, var81);
        }
        var849 = module0034.f1857(var848, (SubLObject)module0751.$ic603$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var849) {
            var849 = module0034.f1807(module0034.f1842(var848), (SubLObject)module0751.$ic603$, (SubLObject)module0751.THREE_INTEGER, (SubLObject)module0751.$ic412$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var848, (SubLObject)module0751.$ic603$, var849);
        }
        final SubLObject var850 = module0034.f1781(var845, var846, var81);
        final SubLObject var851 = module0034.f1814(var849, var850, (SubLObject)module0751.UNPROVIDED);
        if (var851 != module0751.$ic37$) {
            SubLObject var852 = var851;
            SubLObject var853 = (SubLObject)module0751.NIL;
            var853 = var852.first();
            while (module0751.NIL != var852) {
                SubLObject var854 = var853.first();
                final SubLObject var855 = conses_high.second(var853);
                if (var845.equal(var854.first())) {
                    var854 = var854.rest();
                    if (var846.equal(var854.first())) {
                        var854 = var854.rest();
                        if (module0751.NIL != var854 && module0751.NIL == var854.rest() && var81.equal(var854.first())) {
                            return module0034.f1959(var855);
                        }
                    }
                }
                var852 = var852.rest();
                var853 = var852.first();
            }
        }
        final SubLObject var856 = Values.arg2(var847.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47057(var845, var846, var81)));
        module0034.f1836(var849, var850, var851, var856, (SubLObject)ConsesLow.list(var845, var846, var81));
        return module0034.f1959(var856);
    }
    
    public static SubLObject f47058(final SubLObject var83, final SubLObject var93, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var94 = SubLProcess.currentSubLThread();
        SubLObject var95 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var95) {
            SubLObject var96 = module0579.$g4320$.getDynamicValue(var94);
            SubLObject var97 = (SubLObject)module0751.NIL;
            var97 = var96.first();
            while (module0751.NIL == var95 && module0751.NIL != var96) {
                if (module0751.NIL != module0202.f12590(var97) && module0751.NIL == var95) {
                    SubLObject var52_853;
                    SubLObject var98;
                    for (var52_853 = module0754.f47360(var83, var97, module0147.$g2095$.getDynamicValue(var94), (SubLObject)module0751.T, (SubLObject)module0751.T, (SubLObject)module0751.UNPROVIDED), var98 = (SubLObject)module0751.NIL, var98 = var52_853.first(); module0751.NIL == var95 && module0751.NIL != var52_853; var95 = f46669(var98, var93, var81), var52_853 = var52_853.rest(), var98 = var52_853.first()) {}
                }
                var96 = var96.rest();
                var97 = var96.first();
            }
        }
        return var95;
    }
    
    public static SubLObject f47059(final SubLObject var845, final SubLObject var846) {
        final SubLThread var847 = SubLProcess.currentSubLThread();
        final SubLObject var848 = module0172.f10922(var845);
        if (module0751.NIL != module0173.f10955(var848) && module0751.NIL != conses_high.member(var846, module0220.f14565(var848, module0751.$ic265$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != f47060(var848, var846)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != module0172.f10917(var848)) {
            SubLObject var849 = (SubLObject)module0751.NIL;
            final SubLObject var850 = module0147.$g2094$.currentBinding(var847);
            final SubLObject var851 = module0147.$g2095$.currentBinding(var847);
            try {
                module0147.$g2094$.bind((SubLObject)module0751.$ic607$, var847);
                module0147.$g2095$.bind(module0751.$ic286$, var847);
                var849 = module0004.f104(var846, module0226.f14996(module0205.f13276(var848), (SubLObject)module0751.UNPROVIDED), Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var851, var847);
                module0147.$g2094$.rebind(var850, var847);
            }
            return var849;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46850(final SubLObject var845, final SubLObject var846) {
        final SubLThread var847 = SubLProcess.currentSubLThread();
        final SubLObject var848 = module0034.$g879$.getDynamicValue(var847);
        SubLObject var849 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var848) {
            return f47059(var845, var846);
        }
        var849 = module0034.f1857(var848, (SubLObject)module0751.$ic606$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var849) {
            var849 = module0034.f1807(module0034.f1842(var848), (SubLObject)module0751.$ic606$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.$ic608$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var848, (SubLObject)module0751.$ic606$, var849);
        }
        final SubLObject var850 = module0034.f1782(var845, var846);
        final SubLObject var851 = module0034.f1814(var849, var850, (SubLObject)module0751.UNPROVIDED);
        if (var851 != module0751.$ic37$) {
            SubLObject var852 = var851;
            SubLObject var853 = (SubLObject)module0751.NIL;
            var853 = var852.first();
            while (module0751.NIL != var852) {
                SubLObject var854 = var853.first();
                final SubLObject var855 = conses_high.second(var853);
                if (var845.equal(var854.first())) {
                    var854 = var854.rest();
                    if (module0751.NIL != var854 && module0751.NIL == var854.rest() && var846.equal(var854.first())) {
                        return module0034.f1959(var855);
                    }
                }
                var852 = var852.rest();
                var853 = var852.first();
            }
        }
        final SubLObject var856 = Values.arg2(var847.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47059(var845, var846)));
        module0034.f1836(var849, var850, var851, var856, (SubLObject)ConsesLow.list(var845, var846));
        return module0034.f1959(var856);
    }
    
    public static SubLObject f47060(final SubLObject var855, final SubLObject var189) {
        SubLObject var856 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0212.f13762(var189)) {
            if (module0751.NIL == var856) {
                SubLObject var857 = module0202.f12758(module0220.f14565(var189, module0751.$ic609$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
                SubLObject var858 = (SubLObject)module0751.NIL;
                var858 = var857.first();
                while (module0751.NIL == var856 && module0751.NIL != var857) {
                    if (module0751.NIL != Symbols.fboundp(var858) && module0751.NIL != Functions.funcall(var858, var855)) {
                        var856 = (SubLObject)module0751.T;
                    }
                    var857 = var857.rest();
                    var858 = var857.first();
                }
            }
            if (module0751.NIL == var856 && module0751.NIL == var856) {
                SubLObject var857 = module0202.f12758(module0220.f14565(var189, module0751.$ic610$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
                SubLObject var858 = (SubLObject)module0751.NIL;
                var858 = var857.first();
                while (module0751.NIL == var856 && module0751.NIL != var857) {
                    if (module0751.NIL != Symbols.fboundp(var858) && module0751.NIL != Functions.funcall(var858, var855)) {
                        var856 = (SubLObject)module0751.T;
                    }
                    var857 = var857.rest();
                    var858 = var857.first();
                }
            }
        }
        return var856;
    }
    
    public static SubLObject f47061(final SubLObject var11, final SubLObject var189) {
        SubLObject var190 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0212.f13762(var189)) {
            if (module0751.NIL == var190) {
                SubLObject var191 = module0202.f12758(module0220.f14565(var189, module0751.$ic611$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
                SubLObject var192 = (SubLObject)module0751.NIL;
                var192 = var191.first();
                while (module0751.NIL == var190 && module0751.NIL != var191) {
                    if (module0751.NIL != Symbols.fboundp(var192) && module0751.NIL != Functions.funcall(var192, var11)) {
                        var190 = (SubLObject)module0751.T;
                    }
                    var191 = var191.rest();
                    var192 = var191.first();
                }
            }
            if (module0751.NIL == var190 && module0751.NIL == var190) {
                SubLObject var191 = module0202.f12758(module0220.f14565(var189, module0751.$ic612$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
                SubLObject var192 = (SubLObject)module0751.NIL;
                var192 = var191.first();
                while (module0751.NIL == var190 && module0751.NIL != var191) {
                    if (module0751.NIL != Symbols.fboundp(var192) && module0751.NIL != Functions.funcall(var192, var11)) {
                        var190 = (SubLObject)module0751.T;
                    }
                    var191 = var191.rest();
                    var192 = var191.first();
                }
            }
        }
        return var190;
    }
    
    public static SubLObject f46877(final SubLObject var11) {
        return module0269.f17705(var11);
    }
    
    public static SubLObject f47062(final SubLObject var68) {
        return module0259.f16891(var68, module0751.$ic613$);
    }
    
    public static SubLObject f47063(final SubLObject var649, final SubLObject var650, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        return f46684(var650, var649, var81);
    }
    
    public static SubLObject f47064(final SubLObject var622, final SubLObject var61, final SubLObject var93) {
        final SubLThread var623 = SubLProcess.currentSubLThread();
        final SubLObject var624 = module0226.f14882(var622, var61, module0579.$g4262$.getDynamicValue(var623));
        return conses_high.member(var93, var624, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47065(final SubLObject var649, final SubLObject var650, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        return f46669(var650, var649, var81);
    }
    
    public static SubLObject f47066(final SubLObject var649, final SubLObject var650, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = (SubLObject)module0751.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(!var649.equal(var650) && module0751.NIL != f46669(var650, var649, var81));
    }
    
    public static SubLObject f47067(final SubLObject var649, final SubLObject var650, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var651 = SubLProcess.currentSubLThread();
        SubLObject var652 = (SubLObject)module0751.NIL;
        if (var649.equal(var650)) {
            var652 = (SubLObject)module0751.T;
        }
        else if (module0751.NIL != module0173.f10955(var649) && module0751.NIL != module0173.f10955(var650) && module0751.NIL != module0256.f16576(var649, var650, var81, (SubLObject)module0751.UNPROVIDED)) {
            var652 = (SubLObject)module0751.T;
        }
        else if (module0751.NIL != module0202.f12656(var649) && module0751.NIL != f46684(var649.first(), module0751.$ic605$, var81) && module0751.NIL != module0210.f13565(var650) && module0751.NIL != module0202.f12691(var649, (SubLObject)module0751.UNPROVIDED) && module0751.NIL != module0202.f12691(var650, (SubLObject)module0751.UNPROVIDED)) {
            final SubLObject var653 = module0018.$g666$.currentBinding(var651);
            try {
                module0018.$g666$.bind((SubLObject)module0751.T, var651);
                if (module0751.NIL != module0256.f16599(var649, var650, var81)) {
                    var652 = (SubLObject)module0751.T;
                }
            }
            finally {
                module0018.$g666$.rebind(var653, var651);
            }
        }
        return var652;
    }
    
    public static SubLObject f46669(final SubLObject var649, final SubLObject var650, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        final SubLThread var651 = SubLProcess.currentSubLThread();
        final SubLObject var652 = module0034.$g879$.getDynamicValue(var651);
        SubLObject var653 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var652) {
            return f47067(var649, var650, var81);
        }
        var653 = module0034.f1857(var652, (SubLObject)module0751.$ic614$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var653) {
            var653 = module0034.f1807(module0034.f1842(var652), (SubLObject)module0751.$ic614$, (SubLObject)module0751.THREE_INTEGER, (SubLObject)module0751.$ic615$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var652, (SubLObject)module0751.$ic614$, var653);
        }
        final SubLObject var654 = module0034.f1781(var649, var650, var81);
        final SubLObject var655 = module0034.f1814(var653, var654, (SubLObject)module0751.UNPROVIDED);
        if (var655 != module0751.$ic37$) {
            SubLObject var656 = var655;
            SubLObject var657 = (SubLObject)module0751.NIL;
            var657 = var656.first();
            while (module0751.NIL != var656) {
                SubLObject var658 = var657.first();
                final SubLObject var659 = conses_high.second(var657);
                if (var649.equal(var658.first())) {
                    var658 = var658.rest();
                    if (var650.equal(var658.first())) {
                        var658 = var658.rest();
                        if (module0751.NIL != var658 && module0751.NIL == var658.rest() && var81.equal(var658.first())) {
                            return module0034.f1959(var659);
                        }
                    }
                }
                var656 = var656.rest();
                var657 = var656.first();
            }
        }
        final SubLObject var660 = Values.arg2(var651.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47067(var649, var650, var81)));
        module0034.f1836(var653, var654, var655, var660, (SubLObject)ConsesLow.list(var649, var650, var81));
        return module0034.f1959(var660);
    }
    
    public static SubLObject f47068(final SubLObject var859, final SubLObject var860) {
        final SubLThread var861 = SubLProcess.currentSubLThread();
        SubLObject var862 = (SubLObject)module0751.NIL;
        final SubLObject var863 = module0147.f9540(var859);
        final SubLObject var864 = module0147.$g2095$.currentBinding(var861);
        final SubLObject var865 = module0147.$g2094$.currentBinding(var861);
        final SubLObject var866 = module0147.$g2096$.currentBinding(var861);
        try {
            module0147.$g2095$.bind(module0147.f9545(var863), var861);
            module0147.$g2094$.bind(module0147.f9546(var863), var861);
            module0147.$g2096$.bind(module0147.f9549(var863), var861);
            var862 = module0147.f9507(var860);
        }
        finally {
            module0147.$g2096$.rebind(var866, var861);
            module0147.$g2094$.rebind(var865, var861);
            module0147.$g2095$.rebind(var864, var861);
        }
        return var862;
    }
    
    public static SubLObject f47007(final SubLObject var859, final SubLObject var860) {
        final SubLThread var861 = SubLProcess.currentSubLThread();
        final SubLObject var862 = module0034.$g879$.getDynamicValue(var861);
        SubLObject var863 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var862) {
            return f47068(var859, var860);
        }
        var863 = module0034.f1857(var862, (SubLObject)module0751.$ic616$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var863) {
            var863 = module0034.f1807(module0034.f1842(var862), (SubLObject)module0751.$ic616$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.$ic328$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var862, (SubLObject)module0751.$ic616$, var863);
        }
        final SubLObject var864 = module0034.f1782(var859, var860);
        final SubLObject var865 = module0034.f1814(var863, var864, (SubLObject)module0751.UNPROVIDED);
        if (var865 != module0751.$ic37$) {
            SubLObject var866 = var865;
            SubLObject var867 = (SubLObject)module0751.NIL;
            var867 = var866.first();
            while (module0751.NIL != var866) {
                SubLObject var868 = var867.first();
                final SubLObject var869 = conses_high.second(var867);
                if (var859.equal(var868.first())) {
                    var868 = var868.rest();
                    if (module0751.NIL != var868 && module0751.NIL == var868.rest() && var860.equal(var868.first())) {
                        return module0034.f1959(var869);
                    }
                }
                var866 = var866.rest();
                var867 = var866.first();
            }
        }
        final SubLObject var870 = Values.arg2(var861.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47068(var859, var860)));
        module0034.f1836(var863, var864, var865, var870, (SubLObject)ConsesLow.list(var859, var860));
        return module0034.f1959(var870);
    }
    
    public static SubLObject f47069(final SubLObject var861, final SubLObject var862, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = (SubLObject)module0751.NIL;
        }
        return (module0751.NIL != module0161.f10481(var81)) ? f46849(var862, var861, var81) : f46849(var862, var861, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47070() {
        final SubLObject var82 = module0751.$g6033$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47071(final SubLObject var861, final SubLObject var862, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        return module0034.f1829(module0751.$g6033$.getGlobalValue(), (SubLObject)ConsesLow.list(var861, var862, var81), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47072(final SubLObject var861, final SubLObject var862, final SubLObject var81) {
        final SubLThread var863 = SubLProcess.currentSubLThread();
        final SubLObject var865;
        final SubLObject var864 = var865 = f47073(var861, var862, var81);
        if (var865.eql((SubLObject)module0751.$ic326$)) {
            return (SubLObject)module0751.T;
        }
        if (var865.eql((SubLObject)module0751.$ic349$)) {
            return (SubLObject)module0751.NIL;
        }
        if (var865.eql((SubLObject)module0751.$ic617$)) {
            SubLObject var866 = (SubLObject)module0751.NIL;
            final SubLObject var867 = module0147.$g2094$.currentBinding(var863);
            final SubLObject var868 = module0147.$g2095$.currentBinding(var863);
            try {
                module0147.$g2094$.bind(module0147.f9531(var81), var863);
                module0147.$g2095$.bind(module0147.f9534(var81), var863);
                if (module0751.NIL != module0173.f10955(var861) && module0751.NIL != module0173.f10955(var862)) {
                    var863.resetMultipleValues();
                    final SubLObject var869 = f46847((SubLObject)ConsesLow.list(module0751.$ic357$, var861, var862), var81);
                    final SubLObject var870 = var863.secondMultipleValue();
                    var863.resetMultipleValues();
                    if (module0751.NIL != var870) {
                        var866 = var869;
                    }
                    else {
                        var866 = module0260.f17089(var861, var862, var81, (SubLObject)module0751.UNPROVIDED);
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var868, var863);
                module0147.$g2094$.rebind(var867, var863);
            }
            return var866;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46849(final SubLObject var861, final SubLObject var862, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4262$.getDynamicValue();
        }
        SubLObject var863 = module0751.$g6033$.getGlobalValue();
        if (module0751.NIL == var863) {
            var863 = module0034.f1934((SubLObject)module0751.$ic57$, (SubLObject)module0751.$ic618$, (SubLObject)module0751.$ic619$, (SubLObject)module0751.EQ, (SubLObject)module0751.THREE_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
            module0034.f1947((SubLObject)module0751.$ic620$);
        }
        final SubLObject var864 = module0034.f1781(var861, var862, var81);
        final SubLObject var865 = module0034.f1814(var863, var864, (SubLObject)module0751.UNPROVIDED);
        if (var865 != module0751.$ic37$) {
            SubLObject var866 = var865;
            SubLObject var867 = (SubLObject)module0751.NIL;
            var867 = var866.first();
            while (module0751.NIL != var866) {
                SubLObject var868 = var867.first();
                final SubLObject var869 = conses_high.second(var867);
                if (var861.eql(var868.first())) {
                    var868 = var868.rest();
                    if (var862.eql(var868.first())) {
                        var868 = var868.rest();
                        if (module0751.NIL != var868 && module0751.NIL == var868.rest() && var81.eql(var868.first())) {
                            return module0034.f1959(var869);
                        }
                    }
                }
                var866 = var866.rest();
                var867 = var866.first();
            }
        }
        final SubLObject var870 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47072(var861, var862, var81)));
        module0034.f1836(var863, var864, var865, var870, (SubLObject)ConsesLow.list(var861, var862, var81));
        return module0034.f1959(var870);
    }
    
    public static SubLObject f47073(final SubLObject var861, final SubLObject var862, final SubLObject var81) {
        final SubLThread var863 = SubLProcess.currentSubLThread();
        SubLObject var864 = (SubLObject)(var861.eql(var862) ? module0751.$ic326$ : module0751.$ic617$);
        if (module0751.$ic617$ == var864) {
            final SubLObject var865 = module0147.$g2094$.currentBinding(var863);
            final SubLObject var866 = module0147.$g2095$.currentBinding(var863);
            try {
                module0147.$g2094$.bind(module0147.f9531(var81), var863);
                module0147.$g2095$.bind(module0147.f9534(var81), var863);
                if (module0751.NIL != module0212.f13762(var861)) {
                    final SubLObject var867 = f47074(var861);
                    if (module0751.NIL != module0004.f104(var862, var867, Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED)) {
                        var864 = (SubLObject)module0751.$ic326$;
                    }
                    else {
                        SubLObject var868 = module0035.find_if_not((SubLObject)module0751.$ic35$, var867, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                        if (module0751.NIL == var868) {
                            SubLObject var869;
                            SubLObject var870;
                            for (var869 = var867, var870 = (SubLObject)module0751.NIL, var870 = var869.first(); module0751.NIL == var868 && module0751.NIL != var869; var868 = f47074(var870), var869 = var869.rest(), var870 = var869.first()) {}
                        }
                        if (module0751.NIL == var868) {
                            var864 = (SubLObject)module0751.$ic349$;
                        }
                    }
                }
                if (var864 == module0751.$ic617$ && module0751.NIL != module0212.f13762(var862)) {
                    final SubLObject var871 = f47075(var862);
                    if (module0751.NIL != module0004.f104(var861, var871, Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED)) {
                        var864 = (SubLObject)module0751.$ic326$;
                    }
                    else {
                        SubLObject var868 = module0035.find_if_not((SubLObject)module0751.$ic35$, var871, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                        if (module0751.NIL == var868) {
                            SubLObject var869;
                            SubLObject var872;
                            for (var869 = var871, var872 = (SubLObject)module0751.NIL, var872 = var869.first(); module0751.NIL == var868 && module0751.NIL != var869; var868 = f47075(var872), var869 = var869.rest(), var872 = var869.first()) {}
                        }
                        if (module0751.NIL == var868) {
                            var864 = (SubLObject)module0751.$ic349$;
                        }
                    }
                }
            }
            finally {
                module0147.$g2095$.rebind(var866, var863);
                module0147.$g2094$.rebind(var865, var863);
            }
        }
        return var864;
    }
    
    public static SubLObject f47074(final SubLObject var80) {
        return module0220.f14562(var80, module0751.$ic357$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47075(final SubLObject var80) {
        return module0220.f14562(var80, module0751.$ic357$, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47076(final SubLObject var870, final SubLObject var871) {
        if (module0751.NIL != f46849(var870, var871, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != conses_high.member(var871, f47077(var870), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47078(final SubLObject var11) {
        return module0305.f20438(var11, module0751.$ic621$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47077(final SubLObject var622) {
        final SubLObject var623 = module0228.f15229(var622);
        SubLObject var624 = (SubLObject)module0751.NIL;
        if (module0751.NIL != module0173.f10955(var623)) {
            if (module0751.NIL != module0220.f14544(var623, module0751.$ic622$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
                var624 = module0315.f21275(module0751.$ic622$, var623, (SubLObject)module0751.UNPROVIDED);
            }
            else if (module0751.NIL != module0269.f17715(var623)) {
                var624 = module0260.f17028(var623, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            }
        }
        if (module0751.NIL == conses_high.member(var622, var624, Symbols.symbol_function((SubLObject)module0751.EQL), Symbols.symbol_function((SubLObject)module0751.IDENTITY))) {
            var624 = (SubLObject)ConsesLow.cons(var622, var624);
        }
        return var624;
    }
    
    public static SubLObject f47079(final SubLObject var648, SubLObject var363, SubLObject var81, SubLObject var874) {
        if (var363 == module0751.UNPROVIDED) {
            var363 = (SubLObject)module0751.NIL;
        }
        if (var81 == module0751.UNPROVIDED) {
            var81 = (SubLObject)module0751.NIL;
        }
        if (var874 == module0751.UNPROVIDED) {
            var874 = (SubLObject)module0751.NIL;
        }
        SubLObject var875 = (SubLObject)module0751.NIL;
        SubLObject var876 = (SubLObject)module0751.NIL;
        SubLObject var877 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var876) {
            SubLObject var878 = var648;
            SubLObject var879 = (SubLObject)module0751.NIL;
            var879 = var878.first();
            while (module0751.NIL == var876 && module0751.NIL != var878) {
                if (module0751.NIL != f46676(var879)) {
                    var875 = (SubLObject)ConsesLow.cons(module0205.f13203(var879, (SubLObject)module0751.UNPROVIDED), var875);
                }
                else {
                    var876 = (SubLObject)module0751.T;
                }
                var878 = var878.rest();
                var879 = var878.first();
            }
        }
        if (module0751.NIL != var876) {
            return module0256.f16637(var648, var363, var81, var874);
        }
        SubLObject var880 = module0256.f16637(var875, (SubLObject)module0751.NIL, var81, var874);
        SubLObject var879 = (SubLObject)module0751.NIL;
        var879 = var880.first();
        while (module0751.NIL != var880) {
            var877 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(module0751.$ic184$, var879), var877);
            var880 = var880.rest();
            var879 = var880.first();
        }
        return Sequences.nreverse(var877);
    }
    
    public static SubLObject f47080(final SubLObject var180, SubLObject var878) {
        if (var878 == module0751.UNPROVIDED) {
            var878 = (SubLObject)module0751.NIL;
        }
        return (module0751.NIL != var878) ? f47081(var180) : f47082(var180);
    }
    
    public static SubLObject f47083(final SubLObject var180) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0206.f13497(var180) || module0751.NIL != module0206.f13444(var180));
    }
    
    public static SubLObject f47082(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        final SubLObject var182 = module0034.$g879$.getDynamicValue(var181);
        SubLObject var183 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var182) {
            return f47083(var180);
        }
        var183 = module0034.f1857(var182, (SubLObject)module0751.$ic623$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var183) {
            var183 = module0034.f1807(module0034.f1842(var182), (SubLObject)module0751.$ic623$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic412$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var182, (SubLObject)module0751.$ic623$, var183);
        }
        SubLObject var184 = module0034.f1814(var183, var180, (SubLObject)module0751.$ic37$);
        if (var184 == module0751.$ic37$) {
            var184 = Values.arg2(var181.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47083(var180)));
            module0034.f1816(var183, var180, var184, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var184);
    }
    
    public static SubLObject f47084(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f47082(var180) && (module0751.NIL != module0269.f17706(var180) || module0751.NIL != f46684(var180, module0751.$ic625$, module0579.$g4262$.getDynamicValue(var181)) || module0751.NIL != f46669(var180, module0751.$ic625$, module0579.$g4262$.getDynamicValue(var181))) && module0751.NIL == f46850(var180, module0751.$ic626$));
    }
    
    public static SubLObject f47081(final SubLObject var180) {
        final SubLThread var181 = SubLProcess.currentSubLThread();
        final SubLObject var182 = module0034.$g879$.getDynamicValue(var181);
        SubLObject var183 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var182) {
            return f47084(var180);
        }
        var183 = module0034.f1857(var182, (SubLObject)module0751.$ic624$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var183) {
            var183 = module0034.f1807(module0034.f1842(var182), (SubLObject)module0751.$ic624$, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.$ic412$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var182, (SubLObject)module0751.$ic624$, var183);
        }
        SubLObject var184 = module0034.f1814(var183, var180, (SubLObject)module0751.$ic37$);
        if (var184 == module0751.$ic37$) {
            var184 = Values.arg2(var181.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47084(var180)));
            module0034.f1816(var183, var180, var184, (SubLObject)module0751.UNPROVIDED);
        }
        return module0034.f1959(var184);
    }
    
    public static SubLObject f47085(final SubLObject var879, final SubLObject var677) {
        f47086(var879, var677, (SubLObject)module0751.ZERO_INTEGER);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47087(final SubLObject var879) {
        return (SubLObject)((var879.getClass() == $sX51010_native.class) ? module0751.T : module0751.NIL);
    }
    
    public static SubLObject f47088(final SubLObject var879) {
        assert module0751.NIL != f47087(var879) : var879;
        return var879.getField2();
    }
    
    public static SubLObject f47089(final SubLObject var879) {
        assert module0751.NIL != f47087(var879) : var879;
        return var879.getField3();
    }
    
    public static SubLObject f47090(final SubLObject var879, final SubLObject var880) {
        assert module0751.NIL != f47087(var879) : var879;
        return var879.setField2(var880);
    }
    
    public static SubLObject f47091(final SubLObject var879, final SubLObject var880) {
        assert module0751.NIL != f47087(var879) : var879;
        return var879.setField3(var880);
    }
    
    public static SubLObject f47092(SubLObject var881) {
        if (var881 == module0751.UNPROVIDED) {
            var881 = (SubLObject)module0751.NIL;
        }
        final SubLObject var882 = (SubLObject)new $sX51010_native();
        SubLObject var883;
        SubLObject var884;
        SubLObject var885;
        SubLObject var886;
        for (var883 = (SubLObject)module0751.NIL, var883 = var881; module0751.NIL != var883; var883 = conses_high.cddr(var883)) {
            var884 = var883.first();
            var885 = conses_high.cadr(var883);
            var886 = var884;
            if (var886.eql((SubLObject)module0751.$ic640$)) {
                f47090(var882, var885);
            }
            else if (var886.eql((SubLObject)module0751.$ic641$)) {
                f47091(var882, var885);
            }
            else {
                Errors.error((SubLObject)module0751.$ic642$, var884);
            }
        }
        return var882;
    }
    
    public static SubLObject f47093(final SubLObject var886, final SubLObject var887) {
        Functions.funcall(var887, var886, (SubLObject)module0751.$ic643$, (SubLObject)module0751.$ic644$, (SubLObject)module0751.TWO_INTEGER);
        Functions.funcall(var887, var886, (SubLObject)module0751.$ic645$, (SubLObject)module0751.$ic640$, f47088(var886));
        Functions.funcall(var887, var886, (SubLObject)module0751.$ic645$, (SubLObject)module0751.$ic641$, f47089(var886));
        Functions.funcall(var887, var886, (SubLObject)module0751.$ic646$, (SubLObject)module0751.$ic644$, (SubLObject)module0751.TWO_INTEGER);
        return var886;
    }
    
    public static SubLObject f47094(final SubLObject var886, final SubLObject var887) {
        return f47093(var886, var887);
    }
    
    public static SubLObject f47086(final SubLObject var888, final SubLObject var677, final SubLObject var889) {
        PrintLow.format(var677, (SubLObject)module0751.$ic648$, f47088(var888));
        if (module0751.NIL != f47089(var888)) {
            PrintLow.format(var677, (SubLObject)module0751.$ic649$, f47089(var888));
        }
        PrintLow.format(var677, (SubLObject)module0751.$ic650$);
        return var888;
    }
    
    public static SubLObject f47095(final SubLObject var890, SubLObject var891) {
        if (var891 == module0751.UNPROVIDED) {
            var891 = (SubLObject)module0751.$ic103$;
        }
        if (var891 != module0751.$ic103$) {}
        final SubLObject var892 = f47092((SubLObject)module0751.UNPROVIDED);
        f47090(var892, var890);
        f47091(var892, var891);
        return var892;
    }
    
    public static SubLObject f47096(final SubLObject var888, final SubLObject var890) {
        f47090(var888, var890);
        return var888;
    }
    
    public static SubLObject f47097(final SubLObject var888, final SubLObject var891) {
        if (var891 != module0751.$ic103$) {}
        f47091(var888, var891);
        return var888;
    }
    
    public static SubLObject f47098(final SubLObject var888, final SubLObject var891) {
        f47097(var888, f47099(var891, f47089(var888), (SubLObject)module0751.UNPROVIDED));
        return var888;
    }
    
    public static SubLObject f47100(final SubLObject var32, final SubLObject var677) {
        return f47101(var32, var677);
    }
    
    public static SubLObject f47101(final SubLObject var892, final SubLObject var677) {
        module0021.f1086(module0751.$g6035$.getGlobalValue(), var677);
        module0021.f1038(f47088(var892), var677);
        module0021.f1038(f47089(var892), var677);
        return var892;
    }
    
    public static SubLObject f47102(final SubLObject var677) {
        SubLObject var678 = (SubLObject)module0751.NIL;
        var678 = f47092((SubLObject)module0751.UNPROVIDED);
        f47090(var678, module0021.f1060(var677, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
        f47091(var678, module0021.f1060(var677, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
        return var678;
    }
    
    public static SubLObject f47103() {
        if (module0751.NIL != module0107.f7628(module0751.$g6036$.getGlobalValue())) {
            module0751.$g6036$.setGlobalValue(module0077.f5313((SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
            SubLObject var18 = module0259.f16847(module0751.$ic654$);
            SubLObject var19 = (SubLObject)module0751.NIL;
            var19 = var18.first();
            while (module0751.NIL != var18) {
                module0077.f5326(var19, module0751.$g6036$.getGlobalValue());
                var18 = var18.rest();
                var19 = var18.first();
            }
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47104() {
        module0751.$g6036$.setGlobalValue(module0107.f7627());
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47105(final SubLObject var11, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = (SubLObject)module0751.NIL;
        }
        f47103();
        return module0077.f5320(var11, module0751.$g6036$.getGlobalValue());
    }
    
    public static SubLObject f47106(final SubLObject var893, SubLObject var894) {
        if (var894 == module0751.UNPROVIDED) {
            var894 = (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != assertion_handles_oc.f11035(var893)) {
            return f47106(module0178.f11303(var893), var894);
        }
        if (module0751.NIL == module0202.f12590(var893)) {
            return (SubLObject)module0751.NIL;
        }
        final SubLObject var895 = module0205.f13132(var893);
        SubLObject var896 = (SubLObject)module0751.NIL;
        if (module0751.NIL != f46658(var895, module0751.$ic49$, (SubLObject)module0751.UNPROVIDED)) {
            var896 = module0205.f13204(var893, (SubLObject)module0751.UNPROVIDED);
        }
        else if (module0751.NIL != f46658(var895, module0751.$ic655$, (SubLObject)module0751.UNPROVIDED) || module0751.NIL != f46658(var895, module0751.$ic656$, (SubLObject)module0751.UNPROVIDED)) {
            var896 = module0205.f13205(var893, (SubLObject)module0751.UNPROVIDED);
        }
        else if (module0751.NIL != f46658(var895, module0751.$ic657$, (SubLObject)module0751.UNPROVIDED)) {
            var896 = module0205.f13345(var893, (SubLObject)module0751.UNPROVIDED);
        }
        return (module0751.NIL != var894) ? f46640(var896, var894, (SubLObject)module0751.UNPROVIDED) : var896;
    }
    
    public static SubLObject f47038(final SubLObject var11) {
        if (module0751.NIL == module0035.f2013(var11)) {
            return (SubLObject)module0751.NIL;
        }
        SubLObject var12 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var12) {
            SubLObject var13 = var11;
            SubLObject var14 = (SubLObject)module0751.NIL;
            var14 = var13.first();
            while (module0751.NIL == var12 && module0751.NIL != var13) {
                if (module0751.NIL == f47030(var14) && module0751.NIL == f47107(var14)) {
                    var12 = (SubLObject)module0751.T;
                }
                var13 = var13.rest();
                var14 = var13.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var12);
    }
    
    public static SubLObject f46980(final SubLObject var11) {
        if (var11.eql((SubLObject)module0751.$ic103$) || var11.eql((SubLObject)module0751.$ic658$)) {
            return (SubLObject)module0751.T;
        }
        return f47038(var11);
    }
    
    public static SubLObject f47108(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11 != module0751.$ic658$ && module0751.NIL != f46980(var11));
    }
    
    public static SubLObject f47107(final SubLObject var11) {
        return module0584.f35795(var11);
    }
    
    public static SubLObject f47030(final SubLObject var11) {
        return module0731.f44690(var11, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47109(final SubLObject var11) {
        return module0731.f44656(var11, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47110() {
        final SubLObject var82 = module0751.$g6037$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47111(final SubLObject var898, final SubLObject var899, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        return module0034.f1829(module0751.$g6037$.getGlobalValue(), (SubLObject)ConsesLow.list(var898, var899, var81), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47112(final SubLObject var898, final SubLObject var899, final SubLObject var81) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0205.f13145((SubLObject)module0751.$ic56$, var898, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && module0751.NIL != module0205.f13145((SubLObject)module0751.$ic56$, var899, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) && module0732.f44966(var898, var81).eql(module0732.f44966(var899, var81)) && module0751.NIL != f46640(f47113(var898, var81), f47113(var899, var81), var81));
    }
    
    public static SubLObject f47114(final SubLObject var898, final SubLObject var899, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var900 = module0751.$g6037$.getGlobalValue();
        if (module0751.NIL == var900) {
            var900 = module0034.f1934((SubLObject)module0751.$ic659$, (SubLObject)module0751.$ic660$, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.THREE_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        final SubLObject var901 = module0034.f1781(var898, var899, var81);
        final SubLObject var902 = module0034.f1814(var900, var901, (SubLObject)module0751.UNPROVIDED);
        if (var902 != module0751.$ic37$) {
            SubLObject var903 = var902;
            SubLObject var904 = (SubLObject)module0751.NIL;
            var904 = var903.first();
            while (module0751.NIL != var903) {
                SubLObject var905 = var904.first();
                final SubLObject var906 = conses_high.second(var904);
                if (var898.equal(var905.first())) {
                    var905 = var905.rest();
                    if (var899.equal(var905.first())) {
                        var905 = var905.rest();
                        if (module0751.NIL != var905 && module0751.NIL == var905.rest() && var81.equal(var905.first())) {
                            return module0034.f1959(var906);
                        }
                    }
                }
                var903 = var903.rest();
                var904 = var903.first();
            }
        }
        final SubLObject var907 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47112(var898, var899, var81)));
        module0034.f1836(var900, var901, var902, var907, (SubLObject)ConsesLow.list(var898, var899, var81));
        return module0034.f1959(var907);
    }
    
    public static SubLObject f47115() {
        final SubLObject var82 = module0751.$g6038$.getGlobalValue();
        if (module0751.NIL != var82) {
            module0034.f1818(var82);
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47116(final SubLObject var900, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        return module0034.f1829(module0751.$g6038$.getGlobalValue(), (SubLObject)ConsesLow.list(var900, var81), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47117(final SubLObject var900, final SubLObject var81) {
        return module0732.f44973(var900, var81);
    }
    
    public static SubLObject f47113(final SubLObject var900, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        SubLObject var901 = module0751.$g6038$.getGlobalValue();
        if (module0751.NIL == var901) {
            var901 = module0034.f1934((SubLObject)module0751.$ic661$, (SubLObject)module0751.$ic662$, (SubLObject)module0751.NIL, (SubLObject)module0751.EQUAL, (SubLObject)module0751.TWO_INTEGER, (SubLObject)module0751.ZERO_INTEGER);
        }
        final SubLObject var902 = module0034.f1782(var900, var81);
        final SubLObject var903 = module0034.f1814(var901, var902, (SubLObject)module0751.UNPROVIDED);
        if (var903 != module0751.$ic37$) {
            SubLObject var904 = var903;
            SubLObject var905 = (SubLObject)module0751.NIL;
            var905 = var904.first();
            while (module0751.NIL != var904) {
                SubLObject var906 = var905.first();
                final SubLObject var907 = conses_high.second(var905);
                if (var900.equal(var906.first())) {
                    var906 = var906.rest();
                    if (module0751.NIL != var906 && module0751.NIL == var906.rest() && var81.equal(var906.first())) {
                        return module0034.f1959(var907);
                    }
                }
                var904 = var904.rest();
                var905 = var904.first();
            }
        }
        final SubLObject var908 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47117(var900, var81)));
        module0034.f1836(var901, var902, var903, var908, (SubLObject)ConsesLow.list(var900, var81));
        return module0034.f1959(var908);
    }
    
    public static SubLObject f46640(SubLObject var901, SubLObject var902, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        var901 = f46735(var901);
        var902 = f46735(var902);
        if (module0751.NIL != module0212.f13762(var901) && module0751.NIL != module0212.f13762(var902)) {
            return module0731.f44713(var901, var902, var81);
        }
        return f46669(var901, var902, var81);
    }
    
    public static SubLObject f47118() {
        return module0751.$g6039$.getGlobalValue();
    }
    
    public static SubLObject f47119(final SubLObject var903) {
        if (module0751.NIL == var903) {
            return (SubLObject)module0751.NIL;
        }
        if (var903.eql(f47118())) {
            return (SubLObject)module0751.T;
        }
        if (var903.isKeyword()) {
            return (SubLObject)module0751.NIL;
        }
        if (module0732.f44966(var903, (SubLObject)module0751.UNPROVIDED).eql((SubLObject)module0751.TWO_INTEGER) && module0751.NIL != f46640(f47113(var903, (SubLObject)module0751.UNPROVIDED), module0751.$ic663$, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != module0004.f104(var903, (SubLObject)module0751.$ic664$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47120(final SubLObject var903) {
        if (module0751.NIL == var903) {
            return (SubLObject)module0751.NIL;
        }
        if (var903.eql(module0751.$ic665$)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47121(final SubLObject var903) {
        if (module0751.NIL == var903) {
            return (SubLObject)module0751.NIL;
        }
        if (var903.eql(module0751.$ic666$)) {
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != f46640(var903, module0751.$ic666$, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47122() {
        return module0751.$g6040$.getGlobalValue();
    }
    
    public static SubLObject f47123(final SubLObject var903) {
        if (module0751.NIL == var903) {
            return (SubLObject)module0751.NIL;
        }
        if (var903.eql(f47122())) {
            return (SubLObject)module0751.T;
        }
        if (var903.isKeyword()) {
            return (SubLObject)module0751.NIL;
        }
        if (module0732.f44966(var903, (SubLObject)module0751.UNPROVIDED).eql((SubLObject)module0751.TWO_INTEGER) && module0751.NIL != f46640(f47113(var903, (SubLObject)module0751.UNPROVIDED), module0751.$ic668$, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47124(final SubLObject var900) {
        final SubLThread var901 = SubLProcess.currentSubLThread();
        return f47114(var900, module0751.$ic665$, module0579.$g4260$.getDynamicValue(var901));
    }
    
    public static SubLObject f47125() {
        return module0172.f10921((SubLObject)module0751.$ic7$);
    }
    
    public static SubLObject f47126(final SubLObject var900) {
        return module0731.f44892(var900);
    }
    
    public static SubLObject f47127(final SubLObject var861, final SubLObject var862, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = (SubLObject)module0751.NIL;
        }
        return f46658(var862, var861, var81);
    }
    
    public static SubLObject f46658(final SubLObject var861, final SubLObject var862, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = (SubLObject)module0751.NIL;
        }
        final SubLThread var863 = SubLProcess.currentSubLThread();
        if (module0751.NIL == var81) {
            var81 = module0579.$g4260$.getDynamicValue(var863);
        }
        return module0731.f44702(var861, var862, var81);
    }
    
    public static SubLObject f47099(final SubLObject var904, final SubLObject var905, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        if (module0751.$ic103$ == var904) {
            return var905;
        }
        if (module0751.$ic103$ == var905) {
            return var904;
        }
        if (module0751.NIL != module0035.f1997(var904) && module0751.NIL != module0035.f1997(var905)) {
            return f47128(var904.first(), var905.first(), var81);
        }
        return f47129(var904, var905, var81, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47130(final SubLObject var904, final SubLObject var905, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        if (module0751.$ic103$ == var904) {
            return var905;
        }
        if (module0751.$ic103$ == var905) {
            return var904;
        }
        if (module0751.NIL != module0035.f1997(var904) && module0751.NIL != module0035.f1997(var905)) {
            return f47128(var904.first(), var905.first(), var81);
        }
        return f47129(var904, var905, var81, (SubLObject)module0751.NIL);
    }
    
    public static SubLObject f47131(final SubLObject var80, final SubLObject var833) {
        final SubLThread var834 = SubLProcess.currentSubLThread();
        SubLObject var835 = Equality.eq((SubLObject)module0751.$ic103$, var833);
        if (module0751.NIL != module0035.f2014(var833)) {
            final SubLObject var836 = module0147.f9540(module0579.$g4260$.getDynamicValue(var834));
            final SubLObject var837 = module0147.$g2095$.currentBinding(var834);
            final SubLObject var838 = module0147.$g2094$.currentBinding(var834);
            final SubLObject var839 = module0147.$g2096$.currentBinding(var834);
            try {
                module0147.$g2095$.bind(module0147.f9545(var836), var834);
                module0147.$g2094$.bind(module0147.f9546(var836), var834);
                module0147.$g2096$.bind(module0147.f9549(var836), var834);
                if (module0751.NIL == var835) {
                    SubLObject var840;
                    SubLObject var841;
                    for (var840 = var833, var841 = (SubLObject)module0751.NIL, var841 = var840.first(); module0751.NIL == var835 && module0751.NIL != var840; var835 = f47132(var80, var841, (SubLObject)module0751.UNPROVIDED), var840 = var840.rest(), var841 = var840.first()) {}
                }
            }
            finally {
                module0147.$g2096$.rebind(var839, var834);
                module0147.$g2094$.rebind(var838, var834);
                module0147.$g2095$.rebind(var837, var834);
            }
        }
        return var835;
    }
    
    public static SubLObject f47132(final SubLObject var907, final SubLObject var908, SubLObject var81) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(var907.eql(var908) || module0751.NIL != conses_high.member(var907, f47128(var907, var908, var81), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f47133(final SubLObject var861, final SubLObject var862, final SubLObject var81) {
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
            PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic670$, var861, var862);
        }
        final SubLObject var863 = module0732.f44943(var861, var862, var81);
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
            PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic671$, var863);
        }
        return var863;
    }
    
    public static SubLObject f47128(final SubLObject var861, final SubLObject var862, final SubLObject var81) {
        final SubLThread var863 = SubLProcess.currentSubLThread();
        final SubLObject var864 = module0034.$g879$.getDynamicValue(var863);
        SubLObject var865 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var864) {
            return f47133(var861, var862, var81);
        }
        var865 = module0034.f1857(var864, (SubLObject)module0751.$ic669$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var865) {
            var865 = module0034.f1807(module0034.f1842(var864), (SubLObject)module0751.$ic669$, (SubLObject)module0751.THREE_INTEGER, (SubLObject)module0751.$ic232$, (SubLObject)module0751.EQL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var864, (SubLObject)module0751.$ic669$, var865);
        }
        final SubLObject var866 = module0034.f1781(var861, var862, var81);
        final SubLObject var867 = module0034.f1814(var865, var866, (SubLObject)module0751.UNPROVIDED);
        if (var867 != module0751.$ic37$) {
            SubLObject var868 = var867;
            SubLObject var869 = (SubLObject)module0751.NIL;
            var869 = var868.first();
            while (module0751.NIL != var868) {
                SubLObject var870 = var869.first();
                final SubLObject var871 = conses_high.second(var869);
                if (var861.eql(var870.first())) {
                    var870 = var870.rest();
                    if (var862.eql(var870.first())) {
                        var870 = var870.rest();
                        if (module0751.NIL != var870 && module0751.NIL == var870.rest() && var81.eql(var870.first())) {
                            return module0034.f1959(var871);
                        }
                    }
                }
                var868 = var868.rest();
                var869 = var868.first();
            }
        }
        final SubLObject var872 = Values.arg2(var863.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47133(var861, var862, var81)));
        module0034.f1836(var865, var866, var867, var872, (SubLObject)ConsesLow.list(var861, var862, var81));
        return module0034.f1959(var872);
    }
    
    public static SubLObject f47134(final SubLObject var904, final SubLObject var905, final SubLObject var81, SubLObject var910) {
        if (var910 == module0751.UNPROVIDED) {
            var910 = (SubLObject)module0751.T;
        }
        final SubLObject var911 = module0732.f44942(var904, var905, var81, var910);
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.THREE_INTEGER)) {
            PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic671$, var911);
        }
        return var911;
    }
    
    public static SubLObject f47129(final SubLObject var904, final SubLObject var905, final SubLObject var81, SubLObject var910) {
        if (var910 == module0751.UNPROVIDED) {
            var910 = (SubLObject)module0751.T;
        }
        final SubLThread var911 = SubLProcess.currentSubLThread();
        final SubLObject var912 = module0034.$g879$.getDynamicValue(var911);
        SubLObject var913 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var912) {
            return f47134(var904, var905, var81, var910);
        }
        var913 = module0034.f1857(var912, (SubLObject)module0751.$ic672$, (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL == var913) {
            var913 = module0034.f1807(module0034.f1842(var912), (SubLObject)module0751.$ic672$, (SubLObject)module0751.FOUR_INTEGER, (SubLObject)module0751.$ic232$, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED);
            module0034.f1860(var912, (SubLObject)module0751.$ic672$, var913);
        }
        final SubLObject var914 = module0034.f1780(var904, var905, var81, var910);
        final SubLObject var915 = module0034.f1814(var913, var914, (SubLObject)module0751.UNPROVIDED);
        if (var915 != module0751.$ic37$) {
            SubLObject var916 = var915;
            SubLObject var917 = (SubLObject)module0751.NIL;
            var917 = var916.first();
            while (module0751.NIL != var916) {
                SubLObject var918 = var917.first();
                final SubLObject var919 = conses_high.second(var917);
                if (var904.equal(var918.first())) {
                    var918 = var918.rest();
                    if (var905.equal(var918.first())) {
                        var918 = var918.rest();
                        if (var81.equal(var918.first())) {
                            var918 = var918.rest();
                            if (module0751.NIL != var918 && module0751.NIL == var918.rest() && var910.equal(var918.first())) {
                                return module0034.f1959(var919);
                            }
                        }
                    }
                }
                var916 = var916.rest();
                var917 = var916.first();
            }
        }
        final SubLObject var920 = Values.arg2(var911.resetMultipleValues(), (SubLObject)Values.multiple_value_list(f47134(var904, var905, var81, var910)));
        module0034.f1836(var913, var914, var915, var920, (SubLObject)ConsesLow.list(var904, var905, var81, var910));
        return module0034.f1959(var920);
    }
    
    public static SubLObject f47135(final SubLObject var193, SubLObject var81, SubLObject var911) {
        if (var81 == module0751.UNPROVIDED) {
            var81 = module0579.$g4260$.getDynamicValue();
        }
        if (var911 == module0751.UNPROVIDED) {
            var911 = (SubLObject)module0751.T;
        }
        final SubLThread var912 = SubLProcess.currentSubLThread();
        SubLObject var913 = (SubLObject)module0751.NIL;
        var913 = module0731.f44683(var193, var81);
        if (module0751.NIL != var911) {
            final SubLObject var914 = module0147.$g2095$.currentBinding(var912);
            try {
                module0147.$g2095$.bind(var81, var912);
                var913 = Sort.sort(var913, Symbols.symbol_function((SubLObject)module0751.$ic673$), (SubLObject)module0751.UNPROVIDED);
            }
            finally {
                module0147.$g2095$.rebind(var914, var912);
            }
        }
        return var913;
    }
    
    public static SubLObject f47136(final SubLObject var904, final SubLObject var905) {
        if (module0751.$ic103$ == var904) {
            return (SubLObject)module0751.$ic103$;
        }
        if (module0751.$ic103$ == var905) {
            return (SubLObject)module0751.$ic103$;
        }
        return Sequences.delete_duplicates(ConsesLow.append(var904, var905), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47137(final SubLObject var193) {
        final SubLObject var194 = f47135(var193, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var195 = module0035.f2467(var194, (SubLObject)module0751.$ic674$, (SubLObject)module0751.UNPROVIDED);
        return (SubLObject)((module0751.NIL != module0035.f1997(var195)) ? var195.first() : module0751.NIL);
    }
    
    public static SubLObject f47138(final SubLObject var861, final SubLObject var862) {
        final SubLObject var863 = f47137((SubLObject)ConsesLow.list(var861, var862));
        return (module0751.NIL != var863) ? var863 : var861;
    }
    
    public static SubLObject f47139(SubLObject var776) {
        if (var776.isList()) {
            var776 = Sequences.cconcatenate(var776, module0751.$g6041$.getGlobalValue());
        }
        return var776;
    }
    
    public static SubLObject f47140() {
        SubLObject var916 = module0751.$g6042$.getGlobalValue();
        if (module0751.NIL == var916) {
            final SubLObject var917 = constants_high_oc.f10737((SubLObject)module0751.$ic676$);
            if (module0751.NIL != constant_handles_oc.f8463(var917, (SubLObject)module0751.UNPROVIDED)) {
                var916 = var917;
            }
        }
        return var916;
    }
    
    public static SubLObject f47141(final SubLObject var918, SubLObject var576) {
        if (var576 == module0751.UNPROVIDED) {
            var576 = module0579.$g4260$.getDynamicValue();
        }
        final SubLObject var919 = f47140();
        final SubLObject var920 = (SubLObject)((module0751.NIL != var919) ? f46628((SubLObject)module0751.$ic677$, module0202.f12768(var919, var918, (SubLObject)module0751.$ic677$), var576, (SubLObject)module0751.UNPROVIDED).first() : module0751.NIL);
        return (SubLObject)((module0751.NIL != var920) ? module0202.f12751(var920) : module0751.$ic445$);
    }
    
    public static SubLObject f47142(final SubLObject var32, SubLObject var777, SubLObject var576, SubLObject var564) {
        if (var777 == module0751.UNPROVIDED) {
            var777 = (SubLObject)module0751.$ic59$;
        }
        if (var576 == module0751.UNPROVIDED) {
            var576 = module0579.$g4260$.getDynamicValue();
        }
        if (var564 == module0751.UNPROVIDED) {
            var564 = module0579.$g4262$.getDynamicValue();
        }
        final SubLObject var778 = var777;
        if (var778.eql((SubLObject)module0751.$ic678$) || var778.eql((SubLObject)module0751.$ic679$)) {
            return module0772.f49139();
        }
        return f47032(var32);
    }
    
    public static SubLObject f47143(final SubLObject var32, SubLObject var776) {
        final SubLObject var777 = f47144(var32);
        if (module0751.NIL != f47145(var777)) {
            SubLObject var778 = f47146(var777, var776, (SubLObject)module0751.UNPROVIDED);
            if (module0751.NIL == f47108(var778)) {
                var778 = (SubLObject)module0751.$ic103$;
            }
            var776 = var778;
        }
        return var776;
    }
    
    public static SubLObject f47147(final SubLObject var922) {
        final SubLThread var923 = SubLProcess.currentSubLThread();
        final SubLObject var924 = f47148(var922);
        return (module0751.NIL != var924) ? module0579.f35516(var924) : module0579.$g4260$.getDynamicValue(var923);
    }
    
    public static SubLObject f47148(final SubLObject var922) {
        final SubLObject var923 = module0732.f45160(var922);
        final SubLObject var924 = (SubLObject)((module0751.NIL != var923) ? f46628((SubLObject)module0751.$ic680$, (SubLObject)ConsesLow.list(module0751.$ic681$, (SubLObject)module0751.$ic680$, var923), module0751.$ic286$, (SubLObject)module0751.UNPROVIDED).first() : module0751.NIL);
        if (module0751.NIL != var924) {
            return var924;
        }
        final SubLObject var925 = f46628((SubLObject)module0751.$ic682$, (SubLObject)ConsesLow.listS(module0751.$ic683$, var923, (SubLObject)module0751.$ic684$), module0751.$ic286$, (SubLObject)module0751.UNPROVIDED);
        return (SubLObject)((module0751.NIL != module0035.f2012(var925)) ? module0751.NIL : module0162.f10628(module0202.f12683(module0751.$ic685$, var925, (SubLObject)module0751.UNPROVIDED)));
    }
    
    public static SubLObject f47149(final SubLObject var94) {
        final SubLObject var95 = (module0751.NIL != module0728.f44502(var94)) ? module0751.$ic198$ : module0751.$ic3$;
        if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
            PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic686$, var95);
        }
        return var95;
    }
    
    public static SubLObject f47150(final SubLObject var927) {
        final SubLObject var928 = conses_high.subst((SubLObject)module0751.$ic687$, (SubLObject)module0751.$ic688$, var927, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var929 = conses_high.subst((SubLObject)module0751.$ic688$, (SubLObject)module0751.$ic208$, var928, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        final SubLObject var930 = conses_high.subst((SubLObject)module0751.$ic208$, (SubLObject)module0751.$ic687$, var929, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        return var930;
    }
    
    public static SubLObject f47151(final SubLObject var828, final SubLObject var65) {
        if (module0751.NIL != module0178.f11284(var828)) {
            final SubLObject var829 = module0178.f11335(var828);
            final SubLObject var830 = module0178.f11336(var828);
            final SubLObject var831 = ConsesLow.nth(Numbers.subtract(var829, (SubLObject)module0751.ONE_INTEGER), var65);
            return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == module0206.f13438(var831) && module0751.NIL != module0279.f18551(var830, var831, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47152(final SubLObject var26) {
        if (module0751.NIL != module0763.f48385(var26)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic689$, var26);
            }
            return (SubLObject)module0751.T;
        }
        if (module0751.NIL != module0763.f48366(var26)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER)) {
                PrintLow.format((SubLObject)module0751.T, (SubLObject)module0751.$ic690$, var26);
            }
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f46614(final SubLObject var26) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0202.f12590(var26) && module0751.NIL != module0205.f13215((SubLObject)module0751.$ic691$, var26, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
    }
    
    public static SubLObject f47153(final SubLObject var933, final SubLObject var95) {
        if (module0751.NIL == var95) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != module0035.f2014(var95)) {
            return Mapping.mapcar(var933, var95);
        }
        return module0035.f2022(Mapping.mapcar(var933, module0035.f2019(var95)));
    }
    
    public static SubLObject f47154(final SubLObject var622) {
        final SubLThread var623 = SubLProcess.currentSubLThread();
        SubLObject var624 = (SubLObject)module0751.NIL;
        final SubLObject var625 = module0147.$g2094$.currentBinding(var623);
        final SubLObject var626 = module0147.$g2095$.currentBinding(var623);
        try {
            module0147.$g2094$.bind((SubLObject)module0751.$ic262$, var623);
            module0147.$g2095$.bind(module0751.$ic263$, var623);
            var624 = ((module0751.NIL != module0269.f17706(var622)) ? module0220.f14562(var622, module0751.$ic692$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED) : module0220.f14562(var622, module0751.$ic693$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var626, var623);
            module0147.$g2094$.rebind(var625, var623);
        }
        return var624;
    }
    
    public static SubLObject f47155(final SubLObject var622) {
        final SubLObject var623 = module0225.f14739(var622);
        return (SubLObject)((module0751.NIL != var623) ? var623 : ((module0751.NIL != module0206.f13444(var622)) ? f46781((SubLObject)module0751.$ic694$, (SubLObject)ConsesLow.listS(module0751.$ic695$, var622, (SubLObject)module0751.$ic696$), module0751.$ic286$, (SubLObject)module0751.$ic697$).first() : module0751.NIL));
    }
    
    public static SubLObject f47156(final SubLObject var622, SubLObject var935) {
        if (var935 == module0751.UNPROVIDED) {
            var935 = (SubLObject)module0751.NIL;
        }
        SubLObject var936 = (SubLObject)module0751.NIL;
        final SubLObject var937 = f47155(var622);
        final SubLObject var938 = module0225.f14755(var622);
        final SubLObject var939 = module0225.f14767(var622);
        SubLObject var940 = (SubLObject)module0751.NIL;
        if (var937.isInteger()) {
            var940 = var937;
        }
        else if (var939.isInteger()) {
            var940 = var939;
        }
        else if (var938.isInteger()) {
            var940 = module0048.f3381((SubLObject)ConsesLow.list(var938, (SubLObject)module0751.TWO_INTEGER), (SubLObject)module0751.UNPROVIDED);
        }
        if (var940.isInteger()) {
            SubLObject var941;
            SubLObject var942;
            SubLObject var943;
            for (var941 = (SubLObject)module0751.NIL, var941 = (SubLObject)module0751.ZERO_INTEGER; var941.numL(var940); var941 = Numbers.add(var941, (SubLObject)module0751.ONE_INTEGER)) {
                var942 = module0303.f20123(module0048.f_1X(var941));
                var943 = module0201.f12550(Symbols.symbol_name(var942));
                var936 = (SubLObject)ConsesLow.cons(var943, var936);
            }
        }
        SubLObject var944 = module0202.f12683(var622, Sequences.nreverse(var936), (SubLObject)module0751.UNPROVIDED);
        if (module0751.NIL != var935) {
            var944 = module0202.f12696(var944, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        return module0205.f13233(var944, (SubLObject)module0751.$ic302$, (SubLObject)module0751.$ic698$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47157(final SubLObject var500) {
        return Symbols.make_keyword(module0201.f12563(var500));
    }
    
    public static SubLObject f47158(final SubLObject var11) {
        return module0004.f104(var11, module0751.$g6043$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47159(final SubLObject var11) {
        return module0004.f104(var11, module0751.$g6044$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47160(final SubLObject var11) {
        return module0004.f104(var11, module0751.$g6045$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47161(final SubLObject var11) {
        return module0004.f104(var11, module0751.$g6046$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47162() {
        return module0751.$g6046$.getGlobalValue();
    }
    
    public static SubLObject f46991(final SubLObject var189, final SubLObject var941) {
        return (SubLObject)ConsesLow.cons(var189, var941);
    }
    
    public static SubLObject f47163() {
        return f46991((SubLObject)module0751.$ic702$, (SubLObject)module0751.NIL);
    }
    
    public static SubLObject f47164() {
        return f46991((SubLObject)module0751.$ic703$, (SubLObject)module0751.NIL);
    }
    
    public static SubLObject f47165(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11.isCons() && module0751.NIL != f47158(var11.first()));
    }
    
    public static SubLObject f47166(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11.isCons() && module0751.NIL != f47159(var11.first()));
    }
    
    public static SubLObject f47167(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11.isCons() && module0751.NIL != f47160(var11.first()));
    }
    
    public static SubLObject f47168(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11 == module0751.NIL || (var11.isCons() && module0751.NIL != f47161(var11.first())));
    }
    
    public static SubLObject f47169(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11.isCons() && f47170(var11) == module0751.$ic702$);
    }
    
    public static SubLObject f47171(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11.isCons() && f47170(var11) == module0751.$ic703$);
    }
    
    public static SubLObject f47172(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11.isCons() && f47170(var11) == module0751.$ic704$);
    }
    
    public static SubLObject f47170(final SubLObject var942) {
        return var942.first();
    }
    
    public static SubLObject f47173(final SubLObject var942) {
        return var942.rest();
    }
    
    public static SubLObject f47174(final SubLObject var942, final SubLObject var941) {
        ConsesLow.rplacd(var942, var941);
        return var942;
    }
    
    public static SubLObject f47175(final SubLObject var942, final SubLObject var189) {
        ConsesLow.rplaca(var942, var189);
        return var189;
    }
    
    public static SubLObject f47176(final SubLObject var942, SubLObject var943) {
        if (var943 == module0751.UNPROVIDED) {
            var943 = (SubLObject)module0751.NIL;
        }
        return f46991(f47170(var942), f47177(f47173(var942), var943));
    }
    
    public static SubLObject f47177(final SubLObject var944, SubLObject var943) {
        if (var943 == module0751.UNPROVIDED) {
            var943 = (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != f47087(var944)) {
            return f47095(f47088(var944), f47089(var944));
        }
        if (module0751.NIL != module0756.f47497(var944, (SubLObject)module0751.UNPROVIDED)) {
            return module0756.f47493(var944, var943, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        return var944;
    }
    
    public static SubLObject f47178(final SubLObject var11) {
        final SubLThread var12 = SubLProcess.currentSubLThread();
        return module0259.f16854(var11, module0751.$ic705$, module0579.$g4260$.getDynamicValue(var12), (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47179() {
        return module0751.$g6047$.getGlobalValue();
    }
    
    public static SubLObject f47180() {
        return module0751.$g6048$.getGlobalValue();
    }
    
    public static SubLObject f47181() {
        if (module0751.$ic159$ == module0751.$g6049$.getGlobalValue()) {
            module0751.$g6049$.setGlobalValue((SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0024.f1250() && module0751.NIL != f47182()));
        }
        return module0751.$g6049$.getGlobalValue();
    }
    
    public static SubLObject f47182() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0751.NIL;
        SubLObject var4 = (SubLObject)module0751.NIL;
        final SubLObject var5 = (SubLObject)module0751.$ic708$;
        final SubLObject var6 = (SubLObject)module0751.$ic709$;
        SubLObject var7 = (SubLObject)module0751.NIL;
        try {
            var2.throwStack.push(module0003.$g3$.getGlobalValue());
            final SubLObject var8 = Errors.$error_handler$.currentBinding(var2);
            try {
                Errors.$error_handler$.bind((SubLObject)module0751.$ic38$, var2);
                try {
                    var7 = Eval.eval(var5);
                }
                catch (Throwable var9) {
                    Errors.handleThrowable(var9, (SubLObject)module0751.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(var8, var2);
            }
        }
        catch (Throwable var10) {
            var4 = Errors.handleThrowable(var10, module0003.$g3$.getGlobalValue());
        }
        finally {
            var2.throwStack.pop();
        }
        if (var4.isString()) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn(var4);
            }
        }
        else if (!var7.equal(var6)) {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic710$, var5, var7, var6);
            }
        }
        else {
            var3 = (SubLObject)module0751.T;
        }
        return var3;
    }
    
    public static SubLObject f47183(final SubLObject var121, final SubLObject var122) {
        final SubLThread var123 = SubLProcess.currentSubLThread();
        SubLObject var124 = (SubLObject)module0751.NIL;
        if (module0751.NIL != f47181()) {
            SubLObject var125 = (SubLObject)module0751.NIL;
            SubLObject var126 = (SubLObject)module0751.NIL;
            var123.resetMultipleValues();
            final SubLObject var949_950 = f47184(var121);
            final SubLObject var951_952 = var123.secondMultipleValue();
            var123.resetMultipleValues();
            var125 = var949_950;
            var124 = var951_952;
            if (module0751.NIL == var124) {
                var123.resetMultipleValues();
                final SubLObject var953_954 = f47185(var122);
                final SubLObject var955_956 = var123.secondMultipleValue();
                var123.resetMultipleValues();
                var126 = var953_954;
                var124 = var955_956;
                if (module0751.NIL == var124) {
                    var124 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == module0035.f2004(var125, var126));
                    if (module0751.NIL == var124) {
                        SubLObject var127 = var125;
                        SubLObject var128 = (SubLObject)module0751.NIL;
                        var128 = var127.first();
                        while (module0751.NIL == var124 && module0751.NIL != var127) {
                            if (module0751.NIL == module0004.f104(var128, var126, (SubLObject)module0751.$ic711$, (SubLObject)module0751.UNPROVIDED)) {
                                var124 = (SubLObject)module0751.T;
                            }
                            var127 = var127.rest();
                            var128 = var127.first();
                        }
                    }
                }
            }
        }
        else {
            var124 = (SubLObject)module0751.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var124);
    }
    
    public static SubLObject f47184(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = (SubLObject)module0751.NIL;
        SubLObject var97 = (SubLObject)module0751.NIL;
        final SubLObject var98 = f47179();
        if (module0751.NIL != module0024.f1249(var98)) {
            SubLObject var99 = (SubLObject)module0751.NIL;
            try {
                var95.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var100 = Errors.$error_handler$.currentBinding(var95);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0751.$ic38$, var95);
                    try {
                        var96 = module0045.f3138(var98, var94, (SubLObject)module0751.$ic712$, (SubLObject)module0751.UNPROVIDED);
                    }
                    catch (Throwable var101) {
                        Errors.handleThrowable(var101, (SubLObject)module0751.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var100, var95);
                }
            }
            catch (Throwable var102) {
                var99 = Errors.handleThrowable(var102, module0003.$g3$.getGlobalValue());
            }
            finally {
                var95.throwStack.pop();
            }
            if (module0751.NIL != var99) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0751.$ic713$, var99);
                }
                var97 = (SubLObject)module0751.T;
            }
        }
        else {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic714$);
            }
            var97 = (SubLObject)module0751.T;
        }
        return Values.values(var96, var97);
    }
    
    public static SubLObject f47185(final SubLObject var94) {
        final SubLThread var95 = SubLProcess.currentSubLThread();
        SubLObject var96 = (SubLObject)module0751.NIL;
        SubLObject var97 = (SubLObject)module0751.NIL;
        final SubLObject var98 = f47180();
        if (module0751.NIL != module0024.f1249(var98)) {
            SubLObject var99 = (SubLObject)module0751.NIL;
            try {
                var95.throwStack.push(module0003.$g3$.getGlobalValue());
                final SubLObject var100 = Errors.$error_handler$.currentBinding(var95);
                try {
                    Errors.$error_handler$.bind((SubLObject)module0751.$ic38$, var95);
                    try {
                        var96 = module0045.f3138(var98, var94, (SubLObject)module0751.$ic712$, (SubLObject)module0751.UNPROVIDED);
                    }
                    catch (Throwable var101) {
                        Errors.handleThrowable(var101, (SubLObject)module0751.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(var100, var95);
                }
            }
            catch (Throwable var102) {
                var99 = Errors.handleThrowable(var102, module0003.$g3$.getGlobalValue());
            }
            finally {
                var95.throwStack.pop();
            }
            if (module0751.NIL != var99) {
                if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                    Errors.warn((SubLObject)module0751.$ic715$, var99);
                }
                var97 = (SubLObject)module0751.T;
            }
        }
        else {
            if (module0751.NIL != module0578.f35470((SubLObject)module0751.ONE_INTEGER) && module0751.NIL == module0578.f35477()) {
                Errors.warn((SubLObject)module0751.$ic714$);
            }
            var97 = (SubLObject)module0751.T;
        }
        return Values.values(var96, var97);
    }
    
    public static SubLObject f47186(final SubLObject var121, final SubLObject var122) {
        final SubLObject var123 = module0048.f3382(Sequences.remove((SubLObject)module0751.NIL, (SubLObject)ConsesLow.list(Sequences.position((SubLObject)Characters.CHAR_space, var121, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), Sequences.position((SubLObject)Characters.CHAR_greater, var121, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED);
        final SubLObject var124 = module0048.f3382(Sequences.remove((SubLObject)module0751.NIL, (SubLObject)ConsesLow.list(Sequences.position((SubLObject)Characters.CHAR_space, var122, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), Sequences.position((SubLObject)Characters.CHAR_greater, var122, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), (SubLObject)module0751.UNPROVIDED);
        return Sequences.search(var121, var122, Symbols.symbol_function((SubLObject)module0751.EQUALP), Symbols.symbol_function((SubLObject)module0751.IDENTITY), (SubLObject)module0751.ONE_INTEGER, var123, (SubLObject)module0751.ONE_INTEGER, var124);
    }
    
    public static SubLObject f46943(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f46829(var11) || module0751.NIL != f46924(var11));
    }
    
    public static SubLObject f46924(final SubLObject var11) {
        return f46999(Symbols.symbol_function((SubLObject)module0751.$ic716$), var11);
    }
    
    public static SubLObject f46705() {
        return module0751.$g6050$.getGlobalValue();
    }
    
    public static SubLObject f46829(final SubLObject var11) {
        return Equality.eq(var11, module0751.$g6050$.getGlobalValue());
    }
    
    public static SubLObject f47187(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var11 || module0751.NIL != f46943(var11));
    }
    
    public static SubLObject f47188(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var11.isCons() && module0751.NIL != f46943(var11.first()) && module0751.NIL != f46943(var11.rest()));
    }
    
    public static SubLObject f46691() {
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47189(final SubLObject var11) {
        return Types.sublisp_null(var11);
    }
    
    public static SubLObject f47190(SubLObject var770, final SubLObject var963, final SubLObject var964) {
        if (module0751.NIL == f47191(var770, var963)) {
            var770 = module0035.f2063(var770, var963, var964, Symbols.symbol_function((SubLObject)module0751.EQUAL));
        }
        return var770;
    }
    
    public static SubLObject f47191(final SubLObject var770, final SubLObject var963) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == f46829(f46982(var963, var770)));
    }
    
    public static SubLObject f47192(final SubLObject var965, final SubLObject var966) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == f47193(var965, var966));
    }
    
    public static SubLObject f47193(final SubLObject var965, final SubLObject var966) {
        if (module0751.NIL != module0035.f2007(var966, var965)) {
            return (SubLObject)module0751.T;
        }
        if (var965.equal(var966)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != f47194(var966, var965, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.T;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47195(final SubLObject var11) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != f47196(var11) && module0751.NIL != module0035.f1997(var11) && module0751.NIL == conses_high.caar(var11));
    }
    
    public static SubLObject f47197(final SubLObject var964) {
        return f47190(f46691(), (SubLObject)module0751.NIL, var964);
    }
    
    public static SubLObject f47198() {
        if (module0751.$g6051$.getGlobalValue().isKeyword()) {
            module0751.$g6051$.setGlobalValue(f47197((SubLObject)module0751.NIL));
        }
        return module0751.$g6051$.getGlobalValue();
    }
    
    public static SubLObject f47199(final SubLObject var11) {
        return Equality.equal(var11, f47198());
    }
    
    public static SubLObject f47200() {
        return f47201(f47198());
    }
    
    public static SubLObject f47202(final SubLObject var770) {
        return var770.first().rest();
    }
    
    public static SubLObject f47196(final SubLObject var11) {
        if (module0751.NIL == module0035.f2292(var11)) {
            return (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != Sequences.find_if(Symbols.symbol_function((SubLObject)module0751.$ic717$), var11, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            return (SubLObject)module0751.NIL;
        }
        SubLObject var12 = var11;
        SubLObject var13 = (SubLObject)module0751.NIL;
        var13 = var12.first();
        while (module0751.NIL != var12) {
            SubLObject var15;
            final SubLObject var14 = var15 = var13;
            SubLObject var16 = (SubLObject)module0751.NIL;
            SubLObject var17 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var15, var14, (SubLObject)module0751.$ic718$);
            var16 = var15.first();
            var15 = (var17 = var15.rest());
            if (module0751.NIL == f47187(var16) || module0751.NIL == f47187(var17)) {
                return (SubLObject)module0751.NIL;
            }
            var12 = var12.rest();
            var13 = var12.first();
        }
        return (SubLObject)module0751.T;
    }
    
    public static SubLObject f47201(final SubLObject var969) {
        return conses_high.copy_list(var969);
    }
    
    public static SubLObject f46693(final SubLObject var969, final SubLObject var17) {
        if (module0751.NIL != f47189(var969)) {
            return var969;
        }
        if (module0751.NIL != f46819(var17)) {
            final SubLObject var970 = f46825(var17);
            if (module0751.NIL != f47195(var969)) {
                return f47197(ConsesLow.append(f47202(var969), var970));
            }
            SubLObject var971 = f46691();
            SubLObject var972 = var969;
            SubLObject var973 = (SubLObject)module0751.NIL;
            var973 = var972.first();
            while (module0751.NIL != var972) {
                SubLObject var975;
                final SubLObject var974 = var975 = var973;
                SubLObject var976 = (SubLObject)module0751.NIL;
                SubLObject var977 = (SubLObject)module0751.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var975, var974, (SubLObject)module0751.$ic718$);
                var976 = var975.first();
                var975 = (var977 = var975.rest());
                if (var976.equal(var970)) {
                    return f47197(var977);
                }
                if (module0751.NIL != f47194(var976, var970, (SubLObject)module0751.UNPROVIDED)) {
                    final SubLObject var978 = conses_high.nthcdr(Sequences.length(var970), var976);
                    var971 = f47190(var971, var978, var977);
                }
                else if (module0751.NIL != f47194(var970, var976, (SubLObject)module0751.UNPROVIDED)) {
                    final SubLObject var979 = f46982(var970, var969);
                    if (module0751.NIL != var979) {
                        var971 = f47190(var971, (SubLObject)module0751.NIL, var979);
                    }
                }
                var972 = var972.rest();
                var973 = var972.first();
            }
            return var971;
        }
        else {
            if (module0751.NIL == module0035.f2014(var17)) {
                return (SubLObject)module0751.NIL;
            }
            SubLObject var980 = (SubLObject)module0751.NIL;
            SubLObject var981 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == f47199(var969));
            SubLObject var982 = (SubLObject)module0751.NIL;
            SubLObject var983 = (SubLObject)module0751.NIL;
            SubLObject var984 = (SubLObject)module0751.NIL;
            var982 = var17;
            var983 = var982.first();
            for (var984 = (SubLObject)module0751.ZERO_INTEGER; module0751.NIL != var982; var982 = var982.rest(), var983 = var982.first(), var984 = Numbers.add((SubLObject)module0751.ONE_INTEGER, var984)) {
                if (module0751.NIL != module0035.f2439((SubLObject)module0751.$ic331$, var983, (SubLObject)module0751.UNPROVIDED)) {
                    final SubLObject var985 = (SubLObject)ConsesLow.list(var984);
                    final SubLObject var986 = f46693(var969, var983);
                    var980 = (SubLObject)ConsesLow.cons(f46695(var985, var986), var980);
                    if (module0751.NIL == var981 && !var985.equal(f46825(var983))) {
                        var981 = (SubLObject)module0751.T;
                    }
                }
                else {
                    var981 = (SubLObject)module0751.T;
                }
            }
            if (module0751.NIL != var981) {
                return f47203(var980);
            }
            return var969;
        }
    }
    
    public static SubLObject f47203(final SubLObject var979) {
        SubLObject var980 = f46691();
        SubLObject var981 = var979;
        SubLObject var982 = (SubLObject)module0751.NIL;
        var982 = var981.first();
        while (module0751.NIL != var981) {
            SubLObject var18_980 = var982;
            SubLObject var983 = (SubLObject)module0751.NIL;
            var983 = var18_980.first();
            while (module0751.NIL != var18_980) {
                SubLObject var985;
                final SubLObject var984 = var985 = var983;
                SubLObject var986 = (SubLObject)module0751.NIL;
                SubLObject var987 = (SubLObject)module0751.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(var985, var984, (SubLObject)module0751.$ic718$);
                var986 = var985.first();
                var985 = (var987 = var985.rest());
                var980 = f47190(var980, var986, var987);
                var18_980 = var18_980.rest();
                var983 = var18_980.first();
            }
            var981 = var981.rest();
            var982 = var981.first();
        }
        return var980;
    }
    
    public static SubLObject f46695(final SubLObject var983, final SubLObject var770) {
        if (module0751.NIL != f47195(var770)) {
            return f47190(f46691(), var983, f47202(var770));
        }
        SubLObject var984 = f46691();
        SubLObject var985 = var770;
        SubLObject var986 = (SubLObject)module0751.NIL;
        var986 = var985.first();
        while (module0751.NIL != var985) {
            SubLObject var988;
            final SubLObject var987 = var988 = var986;
            SubLObject var989 = (SubLObject)module0751.NIL;
            SubLObject var990 = (SubLObject)module0751.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(var988, var987, (SubLObject)module0751.$ic718$);
            var989 = var988.first();
            var988 = (var990 = var988.rest());
            var984 = f47190(var984, f47204(var983, var989), var990);
            var985 = var985.rest();
            var986 = var985.first();
        }
        return var984;
    }
    
    public static SubLObject f47204(final SubLObject var983, final SubLObject var76) {
        if (module0751.NIL != f46829(var76)) {
            return var76;
        }
        return ConsesLow.append(var983, var76);
    }
    
    public static SubLObject f47205(final SubLObject var983, final SubLObject var732) {
        final SubLObject var984 = module0749.f46462(var732);
        final SubLObject var985 = f47204(var983, var984);
        module0749.f46464(var732, var985);
        return var732;
    }
    
    public static SubLObject f47206(final SubLObject var987, final SubLObject var988) {
        SubLObject var989 = (SubLObject)module0751.NIL;
        SubLObject var990_991 = (SubLObject)module0751.NIL;
        SubLObject var990 = (SubLObject)module0751.NIL;
        SubLObject var993_994 = (SubLObject)module0751.NIL;
        var989 = var987;
        var990_991 = var989.first();
        var990 = var988;
        var993_994 = var990.first();
        while (module0751.NIL != var990 || module0751.NIL != var989) {
            if (var990_991.numL(var993_994)) {
                return (SubLObject)module0751.T;
            }
            if (var993_994.numL(var990_991)) {
                return (SubLObject)module0751.NIL;
            }
            var989 = var989.rest();
            var990_991 = var989.first();
            var990 = var990.rest();
            var993_994 = var990.first();
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47194(final SubLObject var995, final SubLObject var996, SubLObject var997) {
        if (var997 == module0751.UNPROVIDED) {
            var997 = (SubLObject)module0751.NIL;
        }
        if (module0751.NIL != f46829(var995) || module0751.NIL != f46829(var996)) {
            return (SubLObject)module0751.NIL;
        }
        SubLObject var998 = (SubLObject)module0751.NIL;
        SubLObject var999_1000 = (SubLObject)module0751.NIL;
        SubLObject var999 = (SubLObject)module0751.NIL;
        SubLObject var1002_1003 = (SubLObject)module0751.NIL;
        var998 = var995;
        var999_1000 = var998.first();
        var999 = var996;
        var1002_1003 = var999.first();
        while (module0751.NIL != var999 || module0751.NIL != var998) {
            if (var999_1000.eql(var1002_1003)) {
                var998 = var998.rest();
                var999_1000 = var998.first();
                var999 = var999.rest();
                var1002_1003 = var999.first();
            }
            else {
                if (module0751.NIL == var1002_1003) {
                    return (SubLObject)module0751.T;
                }
                return (SubLObject)module0751.NIL;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var997);
    }
    
    public static SubLObject f47207(final SubLObject var10) {
        final SubLObject var11 = var10.rest();
        return (module0751.NIL != module0035.f1997(var11)) ? var11.first() : var11;
    }
    
    public static SubLObject f46982(final SubLObject var779, final SubLObject var770) {
        final SubLObject var780 = f47208(var779, var770);
        if (module0751.NIL == var780) {
            return f46705();
        }
        SubLObject var782;
        final SubLObject var781 = var782 = var780;
        SubLObject var783 = (SubLObject)module0751.NIL;
        SubLObject var784 = (SubLObject)module0751.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var782, var781, (SubLObject)module0751.$ic718$);
        var783 = var782.first();
        var782 = (var784 = var782.rest());
        return f47209(var784, f47210(var783, var779));
    }
    
    public static SubLObject f47211(final SubLObject var770) {
        return f46982((SubLObject)module0751.NIL, var770);
    }
    
    public static SubLObject f47208(final SubLObject var779, final SubLObject var770) {
        return conses_high.assoc(var779, var770, (SubLObject)module0751.$ic719$, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47210(final SubLObject var1008, final SubLObject var76) {
        return conses_high.nthcdr(Sequences.length(var1008), var76);
    }
    
    public static SubLObject f47209(final SubLObject var1008, final SubLObject var76) {
        return ConsesLow.append(var1008, var76);
    }
    
    public static SubLObject f47212(final SubLObject var94) {
        SubLObject var95 = (SubLObject)module0751.NIL;
        if (module0751.NIL != f46643(var94)) {
            var95 = (SubLObject)module0751.$ic89$;
        }
        if (module0751.NIL == var95 && module0751.NIL == module0038.f2684(var94, (SubLObject)module0751.$ic93$)) {
            var95 = (SubLObject)module0751.$ic90$;
        }
        return (SubLObject)ConsesLow.list(var95, var94);
    }
    
    public static SubLObject f47213(final SubLObject var32) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0202.f12590(var32) && module0751.NIL != f47214(module0205.f13132(var32)));
    }
    
    public static SubLObject f47214(final SubLObject var32) {
        return module0004.f104(var32, module0751.$g6052$.getGlobalValue(), (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47145(final SubLObject var1009) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0035.f2013(var1009) && module0751.NIL == f47215(var1009));
    }
    
    public static SubLObject f47216() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        return module0751.$g6053$.getDynamicValue(var2);
    }
    
    public static SubLObject f47215(final SubLObject var1009) {
        final SubLThread var1010 = SubLProcess.currentSubLThread();
        return Equality.eql(var1009, module0751.$g6053$.getDynamicValue(var1010));
    }
    
    public static SubLObject f47144(final SubLObject var26) {
        if (module0751.NIL != f47213(var26)) {
            SubLObject var27 = f47216();
            final SubLObject var28 = module0205.f13203(var26, (SubLObject)module0751.UNPROVIDED);
            final SubLObject var29 = module0205.f13132(var28);
            if (module0751.NIL != module0269.f17731(var28)) {
                var27 = (SubLObject)ConsesLow.list(var28);
            }
            else if (module0751.NIL != module0259.f16896(var29, module0751.$ic722$, (SubLObject)module0751.UNPROVIDED)) {
                var27 = (SubLObject)ConsesLow.list(var28);
            }
            else if (module0751.NIL != module0259.f16896(var29, module0751.$ic723$, (SubLObject)module0751.UNPROVIDED)) {
                var27 = module0205.f13207(var28, (SubLObject)module0751.UNPROVIDED);
            }
            else if (module0751.NIL != module0259.f16896(var29, module0751.$ic724$, (SubLObject)module0751.UNPROVIDED)) {
                var27 = (SubLObject)ConsesLow.list(var28);
            }
            if (!var27.eql(f47216())) {
                var27 = module0035.remove_if_not((SubLObject)module0751.$ic725$, var27, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            }
            return var27;
        }
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47146(final SubLObject var920, SubLObject var776, SubLObject var1011) {
        if (var776 == module0751.UNPROVIDED) {
            var776 = (SubLObject)module0751.$ic103$;
        }
        if (var1011 == module0751.UNPROVIDED) {
            var1011 = (SubLObject)module0751.NIL;
        }
        SubLObject var1012 = (SubLObject)module0751.NIL;
        if (module0751.NIL == var1012) {
            SubLObject var1013 = var920;
            SubLObject var1014 = (SubLObject)module0751.NIL;
            var1014 = var1013.first();
            while (module0751.NIL == var1012 && module0751.NIL != var1013) {
                if (module0751.NIL != f46684(var1014, module0751.$ic726$, (SubLObject)module0751.UNPROVIDED)) {
                    var1012 = f47048(var1014, var1011);
                }
                else if (module0751.NIL != f46684(var1014, module0751.$ic722$, (SubLObject)module0751.UNPROVIDED)) {
                    var1012 = f47048(module0205.f13203(var1014, (SubLObject)module0751.UNPROVIDED), var1011);
                }
                var1013 = var1013.rest();
                var1014 = var1013.first();
            }
        }
        return f47099((SubLObject)((module0751.NIL != var1012) ? ConsesLow.list(var1012) : module0751.$ic103$), var776, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47217(final SubLObject var100) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var100.isKeyword() || module0751.NIL != module0161.f10499(var100));
    }
    
    public static SubLObject f47218(final SubLObject var100) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var100 || var100.isString());
    }
    
    public static SubLObject f47219(final SubLObject var100) {
        return (SubLObject)SubLObjectFactory.makeBoolean(var100.isKeyword() || module0751.NIL == var100);
    }
    
    public static SubLObject f47220(final SubLObject var100) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL != module0269.f17706(var100) || module0751.NIL == var100);
    }
    
    public static SubLObject f47221(final SubLObject var100) {
        return (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var100 || module0751.NIL != module0004.f106(var100));
    }
    
    public static SubLObject f47222(final SubLObject var68) {
        if (module0751.NIL != f47223()) {
            return module0220.f14565(var68, module0751.$ic728$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        return f47224(var68);
    }
    
    public static SubLObject f47225(final SubLObject var68) {
        if (module0751.NIL != f47223()) {
            return module0220.f14556(var68, module0751.$ic730$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        }
        return f47226(var68, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
    }
    
    public static SubLObject f47223() {
        final SubLThread var2 = SubLProcess.currentSubLThread();
        SubLObject var3 = (SubLObject)module0751.NIL;
        final SubLObject var4 = module0147.$g2094$.currentBinding(var2);
        final SubLObject var5 = module0147.$g2095$.currentBinding(var2);
        try {
            module0147.$g2094$.bind((SubLObject)module0751.$ic262$, var2);
            module0147.$g2095$.bind(module0751.$ic263$, var2);
            var3 = Numbers.numL((SubLObject)module0751.$ic731$, module0217.f14247(module0751.$ic728$, (SubLObject)module0751.UNPROVIDED));
        }
        finally {
            module0147.$g2095$.rebind(var5, var2);
            module0147.$g2094$.rebind(var4, var2);
        }
        return var3;
    }
    
    public static SubLObject f47227(final SubLObject var788, SubLObject var1012, SubLObject var1013, SubLObject var776) {
        if (var1012 == module0751.UNPROVIDED) {
            var1012 = module0751.$ic540$;
        }
        if (var1013 == module0751.UNPROVIDED) {
            var1013 = module0751.$ic732$;
        }
        if (var776 == module0751.UNPROVIDED) {
            var776 = (SubLObject)module0751.$ic445$;
        }
        final SubLObject var1014 = module0083.f5708((SubLObject)module0751.UNPROVIDED);
        SubLObject var1015 = (SubLObject)module0751.ZERO_INTEGER;
        f47228(var788, var1014, var1012, var1013, var776);
        SubLObject var1016 = module0083.f5700(var1014, (SubLObject)module0751.T);
        SubLObject var1017 = (SubLObject)module0751.NIL;
        var1017 = var1016.first();
        while (module0751.NIL != var1016) {
            module0540.f33517(var1017, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            var1015 = Numbers.add(var1015, (SubLObject)module0751.ONE_INTEGER);
            var1016 = var1016.rest();
            var1017 = var1016.first();
        }
        return var1015;
    }
    
    public static SubLObject f47229(final SubLObject var1016, final SubLObject var1014, SubLObject var1017, SubLObject var1018, SubLObject var1012, SubLObject var1013, SubLObject var776) {
        if (var1017 == module0751.UNPROVIDED) {
            var1017 = (SubLObject)module0751.$ic733$;
        }
        if (var1018 == module0751.UNPROVIDED) {
            var1018 = module0173.f10962();
        }
        if (var1012 == module0751.UNPROVIDED) {
            var1012 = module0751.$ic540$;
        }
        if (var1013 == module0751.UNPROVIDED) {
            var1013 = module0751.$ic732$;
        }
        if (var776 == module0751.UNPROVIDED) {
            var776 = (SubLObject)module0751.$ic445$;
        }
        final SubLThread var1019 = SubLProcess.currentSubLThread();
        SubLObject var1020 = (SubLObject)module0751.ZERO_INTEGER;
        final SubLObject var1021 = module0012.$g75$.currentBinding(var1019);
        final SubLObject var1022 = module0012.$g76$.currentBinding(var1019);
        final SubLObject var1023 = module0012.$g77$.currentBinding(var1019);
        final SubLObject var1024 = module0012.$g78$.currentBinding(var1019);
        try {
            module0012.$g75$.bind((SubLObject)module0751.ZERO_INTEGER, var1019);
            module0012.$g76$.bind((SubLObject)module0751.NIL, var1019);
            module0012.$g77$.bind((SubLObject)module0751.T, var1019);
            module0012.$g78$.bind(Time.get_universal_time(), var1019);
            module0012.f478(var1017);
            final SubLObject var1026;
            final SubLObject var1025 = var1026 = module0034.f1888();
            final SubLObject var38_1021 = module0034.$g879$.currentBinding(var1019);
            try {
                module0034.$g879$.bind(var1026, var1019);
                SubLObject var1027 = (SubLObject)module0751.NIL;
                if (module0751.NIL != var1026 && module0751.NIL == module0034.f1842(var1026)) {
                    var1027 = module0034.f1869(var1026);
                    final SubLObject var1028 = Threads.current_process();
                    if (module0751.NIL == var1027) {
                        module0034.f1873(var1026, var1028);
                    }
                    else if (!var1027.eql(var1028)) {
                        Errors.error((SubLObject)module0751.$ic83$);
                    }
                }
                try {
                    final SubLObject var1029 = module0139.$g1630$.getDynamicValue(var1019);
                    final SubLObject var38_1022 = module0139.$g1631$.currentBinding(var1019);
                    final SubLObject var91_1024 = module0139.$g1632$.currentBinding(var1019);
                    final SubLObject var92_1025 = module0139.$g1630$.currentBinding(var1019);
                    try {
                        module0139.$g1631$.bind(module0139.f9015(var1029, (SubLObject)module0751.SIX_INTEGER), var1019);
                        module0139.$g1632$.bind(module0139.f9016(var1029), var1019);
                        module0139.$g1630$.bind((SubLObject)module0751.T, var1019);
                        SubLObject var1032;
                        for (SubLObject var1030 = (SubLObject)module0751.NIL; module0751.NIL == var1030; var1030 = (SubLObject)SubLObjectFactory.makeBoolean(module0751.NIL == var1032)) {
                            var1019.resetMultipleValues();
                            final SubLObject var1031 = module0052.f3693(var1016);
                            var1032 = var1019.secondMultipleValue();
                            var1019.resetMultipleValues();
                            if (module0751.NIL != var1032) {
                                f47228(var1031, var1014, var1012, var1013, var776);
                                if (!var1020.numGE(var1018)) {
                                    var1020 = Numbers.add(var1020, (SubLObject)module0751.ONE_INTEGER);
                                    module0012.note_percent_progress(var1020, var1018);
                                }
                            }
                        }
                    }
                    finally {
                        module0139.$g1630$.rebind(var92_1025, var1019);
                        module0139.$g1632$.rebind(var91_1024, var1019);
                        module0139.$g1631$.rebind(var38_1022, var1019);
                    }
                }
                finally {
                    final SubLObject var38_1023 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1019);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var1019);
                        if (module0751.NIL != var1026 && module0751.NIL == var1027) {
                            module0034.f1873(var1026, (SubLObject)module0751.NIL);
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var38_1023, var1019);
                    }
                }
            }
            finally {
                module0034.$g879$.rebind(var38_1021, var1019);
            }
            module0012.note_percent_progress(var1018, var1018);
            module0012.f479();
        }
        finally {
            module0012.$g78$.rebind(var1024, var1019);
            module0012.$g77$.rebind(var1023, var1019);
            module0012.$g76$.rebind(var1022, var1019);
            module0012.$g75$.rebind(var1021, var1019);
        }
        return var1014;
    }
    
    public static SubLObject f47228(final SubLObject var788, final SubLObject var1014, SubLObject var1012, SubLObject var1013, SubLObject var776) {
        if (var1012 == module0751.UNPROVIDED) {
            var1012 = module0751.$ic540$;
        }
        if (var1013 == module0751.UNPROVIDED) {
            var1013 = module0751.$ic732$;
        }
        if (var776 == module0751.UNPROVIDED) {
            var776 = (SubLObject)module0751.$ic445$;
        }
        final SubLThread var1015 = SubLProcess.currentSubLThread();
        assert module0751.NIL != module0083.f5676(var1014) : var1014;
        final SubLObject var1016 = module0580.$g4361$.currentBinding(var1015);
        try {
            module0580.$g4361$.bind((SubLObject)module0751.NIL, var1015);
            var1015.resetMultipleValues();
            final SubLObject var38_1029 = module0580.$g4362$.currentBinding(var1015);
            try {
                module0580.$g4362$.bind(module0580.f35560(), var1015);
                final SubLObject var1017 = var1015.secondMultipleValue();
                var1015.resetMultipleValues();
                try {
                    var1015.resetMultipleValues();
                    final SubLObject var38_1030 = module0580.$g4358$.currentBinding(var1015);
                    try {
                        module0580.$g4358$.bind(module0580.f35544(), var1015);
                        final SubLObject var1018 = var1015.secondMultipleValue();
                        var1015.resetMultipleValues();
                        final SubLObject var38_1031 = module0580.$g4359$.currentBinding(var1015);
                        try {
                            module0580.$g4359$.bind(module0580.f35545(), var1015);
                            final SubLObject var1019 = module0580.$g4358$.getDynamicValue(var1015);
                            final SubLObject var38_1032 = module0034.$g879$.currentBinding(var1015);
                            try {
                                module0034.$g879$.bind(var1019, var1015);
                                SubLObject var1020 = (SubLObject)module0751.NIL;
                                if (module0751.NIL != var1019 && module0751.NIL == module0034.f1842(var1019)) {
                                    var1020 = module0034.f1869(var1019);
                                    final SubLObject var1021 = Threads.current_process();
                                    if (module0751.NIL == var1020) {
                                        module0034.f1873(var1019, var1021);
                                    }
                                    else if (!var1020.eql(var1021)) {
                                        Errors.error((SubLObject)module0751.$ic83$);
                                    }
                                }
                                try {
                                    SubLObject var1022 = f47224(var788);
                                    final SubLObject var1023 = f47226(var788, var1013, var776);
                                    if (module0751.NIL != module0038.f2611(var1023)) {
                                        module0083.f5698(var1014, (SubLObject)ConsesLow.list(module0751.$ic311$, var1012, (SubLObject)ConsesLow.list(module0751.$ic730$, var788, var1023)));
                                        var1022 = Sequences.remove(var1023, var1022, (SubLObject)module0751.EQUAL, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
                                    }
                                    SubLObject var1024 = var1022;
                                    SubLObject var1025 = (SubLObject)module0751.NIL;
                                    var1025 = var1024.first();
                                    while (module0751.NIL != var1024) {
                                        module0083.f5698(var1014, (SubLObject)ConsesLow.list(module0751.$ic311$, var1012, (SubLObject)ConsesLow.list(module0751.$ic728$, var788, var1025)));
                                        var1024 = var1024.rest();
                                        var1025 = var1024.first();
                                    }
                                }
                                finally {
                                    final SubLObject var38_1033 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1015);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var1015);
                                        if (module0751.NIL != var1019 && module0751.NIL == var1020) {
                                            module0034.f1873(var1019, (SubLObject)module0751.NIL);
                                        }
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(var38_1033, var1015);
                                    }
                                }
                            }
                            finally {
                                module0034.$g879$.rebind(var38_1032, var1015);
                            }
                        }
                        finally {
                            module0580.$g4359$.rebind(var38_1031, var1015);
                        }
                        if (var1018 == module0751.$ic435$ && module0751.NIL != module0034.f1839(module0580.$g4358$.getDynamicValue(var1015))) {
                            module0034.f1891(module0580.$g4358$.getDynamicValue(var1015));
                        }
                    }
                    finally {
                        module0580.$g4358$.rebind(var38_1030, var1015);
                    }
                }
                finally {
                    final SubLObject var38_1034 = Threads.$is_thread_performing_cleanupP$.currentBinding(var1015);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var1015);
                        if (module0751.NIL == var1017) {
                            module0580.f35554(module0580.$g4362$.getDynamicValue(var1015));
                        }
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var38_1034, var1015);
                    }
                }
            }
            finally {
                module0580.$g4362$.rebind(var38_1029, var1015);
            }
        }
        finally {
            module0580.$g4361$.rebind(var1016, var1015);
        }
        return var1014;
    }
    
    public static SubLObject f47226(final SubLObject var68, SubLObject var1013, SubLObject var776) {
        if (var1013 == module0751.UNPROVIDED) {
            var1013 = module0751.$ic732$;
        }
        if (var776 == module0751.UNPROVIDED) {
            var776 = (SubLObject)module0751.$ic445$;
        }
        final SubLThread var1014 = SubLProcess.currentSubLThread();
        SubLObject var1015 = (SubLObject)module0751.NIL;
        final SubLObject var1016 = module0579.$g4246$.currentBinding(var1014);
        final SubLObject var1017 = module0579.$g4322$.currentBinding(var1014);
        final SubLObject var1018 = module0579.$g4287$.currentBinding(var1014);
        try {
            module0579.$g4246$.bind((SubLObject)module0751.$ic735$, var1014);
            module0579.$g4322$.bind((SubLObject)module0751.NIL, var1014);
            module0579.$g4287$.bind((SubLObject)module0751.TWO_INTEGER, var1014);
            var1015 = module0770.f49050(var68, var776, (SubLObject)module0751.NIL, var1013, module0751.$ic286$, (SubLObject)module0751.$ic33$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            if (module0751.NIL == var1015 && module0751.NIL != f46684(var68, module0751.$ic736$, (SubLObject)module0751.UNPROVIDED) && module0751.NIL == module0762.f48211(var68, (SubLObject)module0751.UNPROVIDED)) {
                var1015 = f47230(var68, var1013, var776);
            }
        }
        finally {
            module0579.$g4287$.rebind(var1018, var1014);
            module0579.$g4322$.rebind(var1017, var1014);
            module0579.$g4246$.rebind(var1016, var1014);
        }
        return var1015;
    }
    
    public static SubLObject f47230(final SubLObject var68, final SubLObject var1013, final SubLObject var776) {
        SubLObject var1014 = (SubLObject)module0751.NIL;
        SubLObject var1015 = f47156(var68, (SubLObject)module0751.NIL);
        SubLObject var1016 = module0205.f13183(var1015, (SubLObject)module0751.$ic737$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
        SubLObject var1017 = (SubLObject)module0751.NIL;
        var1017 = var1016.first();
        while (module0751.NIL != var1016) {
            var1015 = module0205.f13250(module0579.$g4315$.getGlobalValue(), var1017, var1015, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED);
            var1016 = var1016.rest();
            var1017 = var1016.first();
        }
        final SubLObject var1018 = f47226(var1015, var1013, var776);
        if (!module0038.f2784(var1018, (SubLObject)Characters.CHAR_quotation).equal(module0579.$g4315$.getGlobalValue()) && module0751.NIL != module0038.f2611(var1018) && module0751.NIL == Sequences.search(constant_reader_oc.f8495(), var1018, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED)) {
            var1014 = var1018;
        }
        return var1014;
    }
    
    public static SubLObject f47224(final SubLObject var68) {
        final SubLThread var69 = SubLProcess.currentSubLThread();
        SubLObject var70 = (SubLObject)module0751.NIL;
        SubLObject var71 = (SubLObject)module0751.NIL;
        SubLObject var72 = (SubLObject)module0751.NIL;
        final SubLObject var73 = module0003.f61();
        try {
            var69.throwStack.push(var73);
            final SubLObject var74 = module0003.$g4$.currentBinding(var69);
            try {
                module0003.$g4$.bind((SubLObject)module0751.T, var69);
                SubLObject var75 = (SubLObject)module0751.NIL;
                try {
                    final SubLObject var38_1045 = module0003.$g5$.currentBinding(var69);
                    try {
                        module0003.$g5$.bind(Numbers.add((SubLObject)module0751.ONE_INTEGER, module0003.$g5$.getDynamicValue(var69)), var69);
                        var75 = module0003.f62(module0751.$g6055$.getDynamicValue(var69), var73);
                        final SubLObject var38_1046 = module0580.$g4371$.currentBinding(var69);
                        final SubLObject var76 = module0580.$g4369$.currentBinding(var69);
                        final SubLObject var77 = module0580.$g4370$.currentBinding(var69);
                        try {
                            module0580.$g4371$.bind((SubLObject)module0751.ZERO_INTEGER, var69);
                            module0580.$g4369$.bind(module0580.f35598(module0751.$g6054$.getDynamicValue(var69)), var69);
                            module0580.$g4370$.bind(module0580.$g4370$.getDynamicValue(var69), var69);
                            module0580.$g4370$.setDynamicValue(module0580.f35596(), var69);
                            if (module0751.NIL == module0580.$g4370$.getDynamicValue(var69)) {
                                final SubLObject var38_1047 = module0579.$g4287$.currentBinding(var69);
                                final SubLObject var91_1048 = module0584.$g4392$.currentBinding(var69);
                                final SubLObject var92_1049 = module0584.$g4393$.currentBinding(var69);
                                final SubLObject var78 = module0584.$g4394$.currentBinding(var69);
                                final SubLObject var79 = module0584.$g4395$.currentBinding(var69);
                                try {
                                    module0579.$g4287$.bind((SubLObject)module0751.TWO_INTEGER, var69);
                                    module0584.$g4392$.bind(module0004.f104((SubLObject)module0751.$ic740$, (SubLObject)module0751.$ic741$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), var69);
                                    module0584.$g4393$.bind(module0004.f104((SubLObject)module0751.$ic742$, (SubLObject)module0751.$ic741$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), var69);
                                    module0584.$g4394$.bind(module0004.f104((SubLObject)module0751.$ic743$, (SubLObject)module0751.$ic741$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), var69);
                                    module0584.$g4395$.bind(module0004.f104((SubLObject)module0751.$ic744$, (SubLObject)module0751.$ic741$, (SubLObject)module0751.UNPROVIDED, (SubLObject)module0751.UNPROVIDED), var69);
                                    var70 = module0035.f2124(module0751.$g6056$.getDynamicValue(var69), module0764.f48457(var68, (SubLObject)module0751.$ic100$, (SubLObject)module0751.NIL, (SubLObject)module0751.$ic33$, (SubLObject)module0751.NIL, (SubLObject)module0751.NIL, (SubLObject)module0751.NIL, module0751.$g6056$.getDynamicValue(var69)));
                                }
                                finally {
                                    module0584.$g4395$.rebind(var79, var69);
                                    module0584.$g4394$.rebind(var78, var69);
                                    module0584.$g4393$.rebind(var92_1049, var69);
                                    module0584.$g4392$.rebind(var91_1048, var69);
                                    module0579.$g4287$.rebind(var38_1047, var69);
                                }
                            }
                            var72 = module0580.f35596();
                        }
                        finally {
                            module0580.$g4370$.rebind(var77, var69);
                            module0580.$g4369$.rebind(var76, var69);
                            module0580.$g4371$.rebind(var38_1046, var69);
                        }
                    }
                    finally {
                        module0003.$g5$.rebind(var38_1045, var69);
                    }
                }
                finally {
                    final SubLObject var38_1048 = Threads.$is_thread_performing_cleanupP$.currentBinding(var69);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)module0751.T, var69);
                        module0003.f64(var75);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(var38_1048, var69);
                    }
                }
            }
            finally {
                module0003.$g4$.rebind(var74, var69);
            }
        }
        catch (Throwable var80) {
            var71 = Errors.handleThrowable(var80, var73);
        }
        finally {
            var69.throwStack.pop();
        }
        if (module0751.NIL != var71) {
            Errors.warn((SubLObject)module0751.$ic745$, module0751.$g6055$.getDynamicValue(var69), var68);
        }
        else if (module0751.NIL != var72) {
            Errors.warn((SubLObject)module0751.$ic746$, module0751.$g6054$.getDynamicValue(var69), var68);
        }
        return var70;
    }
    
    public static SubLObject f47231() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46588", "S#38930", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46589", "S#51017", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46590", "S#41515", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46591", "S#51018", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46592", "S#51019", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46593", "S#51020", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46594", "S#51021", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46595", "S#51022", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0751", "f46596", "S#51023");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46597", "S#51024", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46598", "PPH-PRECISION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46599", "S#51025", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46600", "S#49149", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46601", "S#51026", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0751", "f46602", "S#51027");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46603", "S#51028", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46605", "S#49148", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46606", "S#51029", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46607", "S#51030", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0751", "f46609", "S#51031");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46608", "S#51032", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46612", "S#51033", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46610", "S#51034", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46617", "S#51035", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46618", "S#51036", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46619", "S#51037", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46620", "S#51038", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46615", "S#51039", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46616", "S#51040", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46621", "S#51041", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46622", "S#50703", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46623", "S#51042", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46625", "S#51043", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46626", "S#51044", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46627", "S#51045", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46624", "S#51046", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46629", "S#51047", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46630", "S#51048", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46631", "S#51049", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46632", "S#51050", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46633", "S#51051", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46634", "S#51052", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46635", "S#51053", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46636", "S#51054", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46637", "S#51055", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46639", "S#51056", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46641", "S#51057", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46642", "S#51058", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46643", "S#51059", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46644", "S#51060", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46645", "S#51061", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46646", "S#51062", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46647", "S#50946", 1, 0, false);
        new $f46647$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46648", "S#39071", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46649", "S#51063", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46650", "S#51064", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46651", "S#51065", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46652", "S#51066", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46653", "S#51067", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46638", "S#51068", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46655", "S#51069", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46654", "S#51070", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46656", "S#51071", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46659", "S#51072", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46660", "S#51073", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46668", "S#51074", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46664", "S#51075", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46671", "S#51076", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46662", "S#51077", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46663", "S#51078", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46665", "S#51079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46673", "S#51080", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46667", "S#51081", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46670", "S#51082", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46674", "S#51083", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46675", "S#51084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46676", "S#44567", 1, 0, false);
        new $f46676$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46677", "S#51085", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46666", "S#51086", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46681", "S#51087", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46679", "S#51088", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46680", "S#51089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46657", "S#51090", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46682", "S#51091", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46683", "S#51092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46685", "S#51093", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46686", "S#51094", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46687", "S#51095", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46688", "S#51096", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46689", "S#51097", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46690", "S#51098", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46692", "S#51099", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46697", "S#51100", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46698", "S#51101", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46699", "S#51102", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46696", "S#51103", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46700", "S#51104", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46701", "S#51105", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46702", "S#51106", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46694", "S#51107", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46704", "S#51108", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46706", "S#51109", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46707", "S#51110", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46708", "S#50953", 1, 0, false);
        new $f46708$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46710", "S#51111", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46711", "S#51112", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46713", "S#51113", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46712", "S#51114", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46714", "S#51115", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46715", "S#51116", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46717", "S#51117", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46718", "S#51118", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46719", "S#51119", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46720", "S#51120", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46721", "S#51121", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46716", "S#51122", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46722", "S#51123", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46723", "S#51124", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46724", "S#51125", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46726", "S#51126", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46725", "S#51127", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46727", "S#51128", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46728", "S#51129", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46729", "S#51130", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46730", "S#51131", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46731", "S#47814", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46732", "S#51132", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46733", "S#51133", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46734", "S#51134", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46735", "S#51135", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46738", "S#51136", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46737", "S#51137", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46739", "S#51138", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46740", "S#51139", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46741", "S#51140", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46742", "S#51141", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0751", "f46744", "S#51142");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46736", "S#51143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46750", "S#51144", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46751", "S#51145", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46743", "S#51146", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46752", "S#50958", 1, 0, false);
        new $f46752$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46754", "S#51147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46755", "S#51148", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46753", "S#51149", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46757", "S#51150", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46758", "S#51151", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46759", "S#50960", 1, 0, false);
        new $f46759$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46760", "S#51152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46762", "S#51153", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46763", "S#51154", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46764", "S#51155", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46766", "S#51156", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46768", "S#51157", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46769", "S#51158", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46756", "S#51159", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46767", "S#51160", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46771", "S#51161", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46772", "S#51162", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46773", "S#51163", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46761", "S#51164", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46765", "S#50962", 1, 0, false);
        new $f46765$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46776", "S#50963", 2, 0, false);
        new $f46776$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46777", "S#51165", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46775", "S#51166", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46779", "S#51167", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46778", "S#51168", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46780", "S#51169", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46774", "S#51170", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46782", "S#51171", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46745", "S#51172", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46785", "S#51173", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46783", "S#51174", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46784", "S#51175", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46786", "S#51176", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46787", "S#51177", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46748", "S#51178", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0751", "f46791", "S#51179");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46792", "S#51180", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46794", "S#51181", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46790", "S#51182", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46789", "S#51183", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46747", "S#51184", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46749", "S#51185", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46796", "S#51186", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46798", "S#51187", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46795", "S#51188", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46800", "S#51189", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46803", "S#51190", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46804", "S#51191", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46805", "S#51192", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46806", "S#51193", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46807", "S#51194", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46808", "S#51195", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46809", "S#51196", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46797", "S#51197", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46801", "S#51198", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46802", "S#51199", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46799", "S#51200", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46746", "S#51201", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46810", "S#51202", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46811", "S#51203", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46813", "S#51204", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46812", "S#51205", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46814", "S#51206", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46815", "S#51207", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46816", "S#51208", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46788", "S#51209", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46819", "S#50969", 1, 0, false);
        new $f46819$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46678", "S#51210", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46703", "S#50970", 1, 0, false);
        new $f46703$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46821", "S#51211", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46822", "S#51212", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46820", "S#51213", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46793", "S#51214", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46823", "S#51215", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46824", "S#51216", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46825", "S#51217", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46828", "S#51218", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46604", "S#39087", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46830", "S#51219", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46826", "S#51220", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46827", "S#51221", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46831", "S#51222", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46832", "S#51223", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46833", "S#51224", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46672", "S#51225", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46835", "S#51226", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46836", "S#51227", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46837", "S#51228", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46839", "S#51229", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46838", "S#51230", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46840", "S#51231", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46841", "S#51232", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46843", "S#51233", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46842", "S#51234", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46844", "S#51235", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46845", "S#51236", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46852", "S#51237", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46853", "S#51238", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46846", "S#51239", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46770", "S#51240", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46781", "S#51241", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46851", "S#51242", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46858", "S#51243", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46856", "S#51244", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46857", "S#51245", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46859", "S#51246", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46860", "S#51247", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46862", "S#51248", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46861", "S#51249", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46863", "S#51250", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46864", "S#51251", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46865", "S#51252", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46866", "S#51253", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46867", "S#51254", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46868", "S#51255", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46869", "S#51256", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46628", "S#51257", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46870", "S#51258", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46847", "S#51259", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46871", "S#51260", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46709", "S#51261", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46872", "S#51262", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46848", "S#51263", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46873", "S#51264", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46874", "S#51265", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46854", "S#51266", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46875", "S#51267", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46855", "S#51268", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46876", "S#51269", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46878", "S#51270", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46879", "S#51271", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46880", "S#51272", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46882", "S#15493", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46883", "S#15494", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46884", "PPH-OPTIMIZED-NAMES-FOR-VARIABLES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46886", "S#51273", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46887", "S#15495", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46888", "S#51274", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46892", "S#51275", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46893", "S#51276", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46891", "S#51277", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46889", "S#51278", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46897", "S#51279", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46895", "S#51280", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46899", "S#51281", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46894", "S#51282", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46896", "S#51283", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46885", "S#51284", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46901", "S#51285", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46902", "S#51286", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46834", "S#51287", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46903", "S#51288", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46904", "S#51289", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46900", "S#51290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46906", "S#50666", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46907", "S#51291", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46909", "S#51292", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46912", "S#51293", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46910", "S#50651", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46913", "S#50654", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46916", "S#50653", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46918", "S#51294", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46914", "S#51295", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46922", "S#51296", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46925", "S#51297", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46923", "S#51298", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46927", "S#51299", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46930", "S#51300", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46911", "S#50655", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46915", "S#39282", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46931", "S#51301", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46932", "S#51302", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46933", "S#51303", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46908", "S#50649", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46929", "S#49545", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46919", "S#50650", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46934", "S#51304", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46926", "S#50656", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46935", "S#51305", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46921", "S#50658", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46936", "S#51306", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46917", "S#51307", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46937", "S#51308", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46920", "S#51309", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46938", "S#51310", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46928", "S#50657", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46939", "S#51311", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46940", "S#51312", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46941", "S#51313", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46942", "S#51314", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46944", "S#51315", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46945", "S#51316", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46946", "S#51317", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46947", "S#39915", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46948", "S#51318", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46949", "S#51319", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46950", "S#51320", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46951", "S#51321", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46952", "S#51322", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46953", "S#39079", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46955", "S#51323", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46956", "S#51324", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46957", "S#51325", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46958", "S#51326", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46954", "S#51327", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46960", "S#51328", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46966", "S#51329", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46964", "S#51330", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46962", "S#51331", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46961", "S#51332", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46968", "S#51333", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46967", "S#51334", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46963", "S#51335", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46965", "S#51336", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46969", "S#51337", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46970", "S#51338", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46959", "S#51339", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46971", "S#51340", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46972", "S#51341", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46973", "S#51342", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46974", "S#50647", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46975", "S#51343", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46976", "S#50652", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0751", "f46977", "S#51344");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46978", "S#51345", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46979", "S#42147", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46981", "S#51346", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46983", "S#51347", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46984", "S#51348", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46985", "S#51349", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46986", "S#51350", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46988", "S#51351", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46987", "S#51352", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46989", "S#51353", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46990", "S#51354", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46992", "S#51355", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46993", "S#51356", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46994", "S#51357", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46898", "S#51358", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46996", "S#51359", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46995", "S#51360", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46997", "S#51361", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46998", "S#39290", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46999", "S#51362", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46611", "S#51363", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47000", "S#51364", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46613", "S#51365", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47001", "S#51366", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47002", "S#51367", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47003", "S#51368", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47004", "S#51369", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47005", "S#51370", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47006", "S#51371", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46661", "S#51372", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47008", "S#51373", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47009", "S#51374", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47010", "S#51375", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47011", "S#51376", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47012", "S#51377", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47013", "S#51378", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47014", "S#51000", 2, 3, false);
        new $f47014$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47015", "S#51379", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47016", "S#51380", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47017", "S#51381", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47019", "S#51382", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47018", "S#51383", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47020", "S#51384", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47021", "S#51385", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47022", "S#51386", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46881", "S#51387", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47023", "S#51388", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46890", "S#51389", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46905", "S#51390", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47024", "S#51391", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47025", "S#51392", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47027", "S#51393", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47026", "S#51394", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47029", "S#51395", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47031", "S#51396", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47028", "S#51397", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47032", "S#51398", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47033", "S#51399", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47035", "S#51400", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47034", "S#51401", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47036", "S#50645", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47037", "S#51402", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47039", "S#51403", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47043", "S#51404", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47040", "S#51405", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47044", "S#51406", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47041", "S#51407", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47042", "S#51408", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47045", "S#51409", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47046", "S#51410", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47048", "S#51411", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47047", "S#39106", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46817", "S#51005", 1, 0, false);
        new $f46817$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46818", "S#51412", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47049", "S#51413", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47051", "S#51414", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47052", "S#51415", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47053", "S#51416", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47050", "S#51417", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47054", "S#51418", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.module0751", "f47055", "S#51419");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47056", "S#51420", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47057", "S#51421", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46684", "S#39104", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47058", "S#51422", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47059", "S#51423", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46850", "S#51424", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47060", "S#51425", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47061", "S#51426", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46877", "S#51427", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47062", "S#51428", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47063", "S#51429", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47064", "S#51430", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47065", "S#51007", 2, 1, false);
        new $f47065$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47066", "S#51431", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47067", "S#51432", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46669", "S#51433", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47068", "S#51434", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47007", "S#51435", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47069", "S#51008", 2, 1, false);
        new $f47069$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47070", "S#51436", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47071", "S#51437", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47072", "S#51438", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46849", "S#51009", 2, 1, false);
        new $f46849$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47073", "S#51439", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47074", "S#51440", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47075", "S#51441", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47076", "S#51442", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47078", "S#51443", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47077", "S#51444", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47079", "S#51445", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47080", "S#51446", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47083", "S#51447", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47082", "S#51448", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47084", "S#51449", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47081", "S#51450", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47085", "S#51451", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47087", "S#51011", 1, 0, false);
        new $f47087$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47088", "S#51452", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47089", "S#51453", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47090", "S#51454", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47091", "S#51455", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47092", "S#51456", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47093", "S#51457", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47094", "S#51458", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47086", "S#51459", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47095", "S#51460", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47096", "S#51461", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47097", "S#51462", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47098", "S#51463", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47100", "S#51464", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47101", "S#51465", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47102", "S#51466", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47103", "S#51467", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47104", "S#51468", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47105", "S#51469", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47106", "S#51470", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47038", "S#51471", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46980", "S#39395", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47108", "S#51472", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47107", "S#51473", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47030", "S#49143", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47109", "S#51474", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47110", "S#51475", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47111", "S#51476", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47112", "S#51477", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47114", "S#51478", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47115", "S#51479", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47116", "S#51480", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47117", "S#51481", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47113", "S#51482", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46640", "S#51483", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47118", "S#51484", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47119", "S#51485", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47120", "S#51486", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47121", "S#51487", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47122", "S#51488", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47123", "S#51489", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47124", "S#51490", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47125", "S#51491", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47126", "S#51492", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47127", "S#51493", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46658", "S#51494", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47099", "S#49150", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47130", "S#51495", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47131", "S#51496", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47132", "S#51012", 2, 1, false);
        new $f47132$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47133", "S#51497", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47128", "S#51498", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47134", "S#51499", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47129", "S#51500", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47135", "S#49144", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47136", "S#51501", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47137", "S#51502", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47138", "S#51503", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47139", "S#51504", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47140", "S#51505", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47141", "S#51506", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47142", "S#51507", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47143", "S#39089", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47147", "S#51508", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47148", "S#51509", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47149", "S#51510", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47150", "S#51511", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47151", "S#51512", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47152", "S#51513", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46614", "S#51514", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47153", "S#51515", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47154", "S#51516", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47155", "S#51517", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47156", "S#45586", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47157", "S#51518", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47158", "S#51519", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47159", "S#51520", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47160", "S#51521", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47161", "S#51522", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47162", "S#51523", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46991", "S#50684", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47163", "S#50682", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47164", "S#51524", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47165", "S#50679", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47166", "S#51525", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47167", "S#51526", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47168", "S#51527", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47169", "S#50683", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47171", "S#51528", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47172", "S#51529", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47170", "S#50681", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47173", "S#50680", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47174", "S#51530", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47175", "S#51531", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47176", "S#51532", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47177", "S#51533", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47178", "S#51534", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47179", "S#51535", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47180", "S#51536", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47181", "S#51537", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47182", "S#51538", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47183", "S#51539", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47184", "S#51540", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47185", "S#51541", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47186", "S#51542", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46943", "S#51543", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46924", "S#51544", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46705", "S#39273", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46829", "S#51545", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47187", "S#51546", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47188", "S#51547", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46691", "S#39083", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47189", "S#51548", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47190", "S#51549", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47191", "S#51550", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47192", "S#51551", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47193", "S#51552", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47195", "S#51553", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47197", "S#51554", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47198", "S#50660", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47199", "S#51555", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47200", "S#39103", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47202", "S#51556", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47196", "S#51557", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47201", "S#51558", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46693", "S#39108", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47203", "S#51559", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46695", "S#51560", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47204", "S#51561", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47205", "S#51562", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47206", "S#51563", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47194", "S#51016", 2, 1, false);
        new $f47194$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47207", "S#51564", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f46982", "S#51565", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47211", "S#50659", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47208", "S#51566", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47210", "S#51567", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47209", "S#51568", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47212", "S#51569", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47213", "S#39084", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47214", "S#51570", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47145", "S#39095", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47216", "S#51571", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47215", "S#51572", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47144", "S#39092", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47146", "S#51573", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47217", "S#51574", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47218", "S#51575", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47219", "S#42152", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47220", "S#51576", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47221", "S#51577", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47222", "GET-ALL-PRETTY-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47225", "GET-PRETTY-STRING-CANONICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47223", "S#51578", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47227", "S#51579", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47229", "S#37973", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47228", "S#51580", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47226", "S#51581", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47230", "S#51582", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.module0751", "f47224", "S#51583", 1, 0, false);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47232() {
        module0751.$g5989$ = SubLFiles.defconstant("S#51584", (SubLObject)module0751.$ic0$);
        module0751.$g5990$ = SubLFiles.defconstant("S#51585", (SubLObject)module0751.$ic1$);
        module0751.$g5991$ = SubLFiles.defconstant("S#51586", (SubLObject)module0751.$ic2$);
        module0751.$g5992$ = SubLFiles.defvar("S#51587", (SubLObject)module0751.NIL);
        module0751.$g5993$ = SubLFiles.defconstant("S#51588", module0751.$ic3$);
        module0751.$g5994$ = SubLFiles.defconstant("S#51589", (SubLObject)module0751.NIL);
        module0751.$g5995$ = SubLFiles.defconstant("S#51590", (SubLObject)module0751.$ic4$);
        module0751.$g5996$ = SubLFiles.defconstant("S#51591", (SubLObject)module0751.$ic5$);
        module0751.$g5997$ = SubLFiles.deflexical("S#51592", (SubLObject)((module0751.NIL != Symbols.boundp((SubLObject)module0751.$ic6$)) ? module0751.$g5997$.getGlobalValue() : module0751.NIL));
        module0751.$g5998$ = SubLFiles.deflexical("S#51593", (SubLObject)module0751.$ic8$);
        module0751.$g5999$ = SubLFiles.defparameter("S#51594", (SubLObject)module0751.NIL);
        module0751.$g6000$ = SubLFiles.deflexical("S#51595", module0055.f4017());
        module0751.$g6001$ = SubLFiles.deflexical("S#51596", (SubLObject)module0751.NIL);
        module0751.$g6002$ = SubLFiles.defparameter("S#51597", (SubLObject)module0751.$ic54$);
        module0751.$g6003$ = SubLFiles.defparameter("S#51598", (SubLObject)module0751.$ic55$);
        module0751.$g6004$ = SubLFiles.deflexical("S#51599", (SubLObject)module0751.$ic65$);
        module0751.$g6005$ = SubLFiles.defconstant("S#51600", (SubLObject)module0751.$ic84$);
        module0751.$g6006$ = SubLFiles.defconstant("S#51601", (SubLObject)module0751.$ic120$);
        module0751.$g6007$ = SubLFiles.defconstant("S#51602", (SubLObject)module0751.$ic166$);
        module0751.$g6008$ = SubLFiles.deflexical("S#51603", (SubLObject)module0751.$ic201$);
        module0751.$g6009$ = SubLFiles.deflexical("S#51604", (SubLObject)module0751.NIL);
        module0751.$g6010$ = SubLFiles.deflexical("S#51605", (SubLObject)module0751.NIL);
        module0751.$g6011$ = SubLFiles.deflexical("S#51606", (SubLObject)module0751.NIL);
        module0751.$g6012$ = SubLFiles.defconstant("S#51607", (SubLObject)module0751.$ic229$);
        module0751.$g6013$ = SubLFiles.defparameter("S#51608", module0077.f5313(Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.UNPROVIDED));
        module0751.$g6014$ = SubLFiles.deflexical("S#51609", (SubLObject)module0751.NIL);
        module0751.$g6015$ = SubLFiles.deflexical("S#51610", (SubLObject)module0751.NIL);
        module0751.$g6016$ = SubLFiles.deflexical("S#51611", module0077.f5313(Symbols.symbol_function((SubLObject)module0751.EQUAL), (SubLObject)module0751.FOUR_INTEGER));
        module0751.$g6017$ = SubLFiles.defconstant("S#51612", (SubLObject)module0751.$ic332$);
        module0751.$g6018$ = SubLFiles.defconstant("S#51613", (SubLObject)module0751.$ic333$);
        module0751.$g6019$ = SubLFiles.defparameter("S#51614", (SubLObject)module0751.T);
        module0751.$g6020$ = SubLFiles.defparameter("S#51615", (SubLObject)module0751.$ic393$);
        module0751.$g6021$ = SubLFiles.defparameter("S#51616", (SubLObject)module0751.FOUR_INTEGER);
        module0751.$g6022$ = SubLFiles.defparameter("S#51617", module0107.f7627());
        module0751.$g6023$ = SubLFiles.defparameter("S#51618", (SubLObject)module0751.NIL);
        module0751.$g6024$ = SubLFiles.defparameter("S#51619", (SubLObject)module0751.NIL);
        module0751.$g6025$ = SubLFiles.deflexical("S#51620", (SubLObject)module0751.$ic432$);
        module0751.$g6026$ = SubLFiles.defparameter("S#51621", (SubLObject)module0751.ZERO_INTEGER);
        module0751.$g6027$ = SubLFiles.defconstant("S#51622", (SubLObject)module0751.$ic497$);
        module0751.$g6028$ = SubLFiles.deflexical("S#51623", (SubLObject)module0751.NIL);
        module0751.$g6029$ = SubLFiles.defconstant("S#51624", (SubLObject)module0751.$ic538$);
        module0751.$g6030$ = SubLFiles.deflexical("S#51625", (SubLObject)module0751.NIL);
        module0751.$g6031$ = SubLFiles.deflexical("S#51626", (SubLObject)module0751.NIL);
        module0751.$g6032$ = SubLFiles.defparameter("S#51627", (SubLObject)module0751.NIL);
        module0751.$g6033$ = SubLFiles.deflexical("S#51628", (SubLObject)module0751.NIL);
        module0751.$g6034$ = SubLFiles.defconstant("S#51629", (SubLObject)module0751.$ic627$);
        module0751.$g6035$ = SubLFiles.defconstant("S#51630", (SubLObject)module0751.$ic651$);
        module0751.$g6036$ = SubLFiles.deflexical("S#51631", module0107.f7627());
        module0751.$g6037$ = SubLFiles.deflexical("S#51632", (SubLObject)module0751.NIL);
        module0751.$g6038$ = SubLFiles.deflexical("S#51633", (SubLObject)module0751.NIL);
        module0751.$g6039$ = SubLFiles.defconstant("S#51634", module0751.$ic189$);
        module0751.$g6040$ = SubLFiles.defconstant("S#51635", module0751.$ic667$);
        module0751.$g6041$ = SubLFiles.defconstant("S#51636", (SubLObject)module0751.$ic675$);
        module0751.$g6042$ = SubLFiles.deflexical("S#51637", (SubLObject)module0751.NIL);
        module0751.$g6043$ = SubLFiles.defconstant("S#51638", (SubLObject)module0751.$ic699$);
        module0751.$g6044$ = SubLFiles.defconstant("S#51639", (SubLObject)module0751.$ic700$);
        module0751.$g6045$ = SubLFiles.defconstant("S#51640", (SubLObject)module0751.$ic700$);
        module0751.$g6046$ = SubLFiles.defconstant("S#51641", (SubLObject)module0751.$ic701$);
        module0751.$g6047$ = SubLFiles.defconstant("S#51642", (SubLObject)module0751.$ic706$);
        module0751.$g6048$ = SubLFiles.defconstant("S#51643", (SubLObject)module0751.$ic707$);
        module0751.$g6049$ = SubLFiles.deflexical("S#51644", (SubLObject)module0751.$ic159$);
        module0751.$g6050$ = SubLFiles.defconstant("S#51645", (SubLObject)module0751.$ic474$);
        module0751.$g6051$ = SubLFiles.deflexical("S#51646", (SubLObject)module0751.$ic393$);
        module0751.$g6052$ = SubLFiles.defconstant("S#51647", (SubLObject)module0751.$ic720$);
        module0751.$g6053$ = SubLFiles.defparameter("S#51648", (SubLObject)module0751.$ic721$);
        module0751.$g6054$ = SubLFiles.defparameter("S#51649", (SubLObject)module0751.$ic738$);
        module0751.$g6055$ = SubLFiles.defparameter("S#51650", (SubLObject)module0751.$ic739$);
        module0751.$g6056$ = SubLFiles.defparameter("S#51651", (SubLObject)module0751.TWENTY_INTEGER);
        return (SubLObject)module0751.NIL;
    }
    
    public static SubLObject f47233() {
        module0003.f57((SubLObject)module0751.$ic6$);
        module0002.f50((SubLObject)module0751.$ic10$, (SubLObject)module0751.$ic11$);
        module0002.f50((SubLObject)module0751.$ic14$, (SubLObject)module0751.$ic11$);
        module0002.f50((SubLObject)module0751.$ic16$, (SubLObject)module0751.$ic11$);
        module0034.f1895((SubLObject)module0751.$ic32$);
        module0034.f1909((SubLObject)module0751.$ic40$);
        module0034.f1909((SubLObject)module0751.$ic202$);
        module0034.f1909((SubLObject)module0751.$ic209$);
        module0034.f1909((SubLObject)module0751.$ic213$);
        module0034.f1895((SubLObject)module0751.$ic219$);
        module0034.f1895((SubLObject)module0751.$ic230$);
        module0034.f1895((SubLObject)module0751.$ic233$);
        module0034.f1909((SubLObject)module0751.$ic261$);
        module0034.f1909((SubLObject)module0751.$ic283$);
        module0002.f50((SubLObject)module0751.$ic308$, (SubLObject)module0751.$ic310$);
        module0002.f50((SubLObject)module0751.$ic309$, (SubLObject)module0751.$ic310$);
        module0034.f1895((SubLObject)module0751.$ic327$);
        module0034.f1895((SubLObject)module0751.$ic354$);
        module0034.f1895((SubLObject)module0751.$ic406$);
        module0034.f1895((SubLObject)module0751.$ic409$);
        module0034.f1895((SubLObject)module0751.$ic416$);
        module0034.f1895((SubLObject)module0751.$ic421$);
        module0034.f1895((SubLObject)module0751.$ic422$);
        module0012.f368((SubLObject)module0751.$ic438$, (SubLObject)module0751.$ic439$, (SubLObject)module0751.$ic440$, (SubLObject)module0751.$ic441$, (SubLObject)module0751.$ic442$);
        module0034.f1895((SubLObject)module0751.$ic449$);
        module0034.f1909((SubLObject)module0751.$ic519$);
        module0034.f1895((SubLObject)module0751.$ic526$);
        module0034.f1895((SubLObject)module0751.$ic532$);
        module0034.f1909((SubLObject)module0751.$ic539$);
        module0034.f1909((SubLObject)module0751.$ic542$);
        module0034.f1895((SubLObject)module0751.$ic548$);
        module0034.f1895((SubLObject)module0751.$ic454$);
        module0034.f1895((SubLObject)module0751.$ic559$);
        module0034.f1895((SubLObject)module0751.$ic562$);
        module0034.f1895((SubLObject)module0751.$ic572$);
        module0034.f1895((SubLObject)module0751.$ic580$);
        module0034.f1895((SubLObject)module0751.$ic591$);
        module0034.f1895((SubLObject)module0751.$ic592$);
        module0002.f50((SubLObject)module0751.$ic601$, (SubLObject)module0751.$ic602$);
        module0034.f1895((SubLObject)module0751.$ic603$);
        module0034.f1895((SubLObject)module0751.$ic606$);
        module0034.f1895((SubLObject)module0751.$ic614$);
        module0034.f1895((SubLObject)module0751.$ic616$);
        module0034.f1909((SubLObject)module0751.$ic57$);
        module0034.f1895((SubLObject)module0751.$ic623$);
        module0034.f1895((SubLObject)module0751.$ic624$);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), module0751.$g6034$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0751.$ic634$));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)module0751.$ic635$);
        Structures.def_csetf((SubLObject)module0751.$ic636$, (SubLObject)module0751.$ic637$);
        Structures.def_csetf((SubLObject)module0751.$ic638$, (SubLObject)module0751.$ic639$);
        Equality.identity((SubLObject)module0751.$ic627$);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), module0751.$g6034$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0751.$ic647$));
        module0021.f1098(module0751.$g6035$.getGlobalValue(), (SubLObject)module0751.$ic652$);
        Structures.register_method(module0021.$g749$.getGlobalValue(), module0751.$g6034$.getGlobalValue(), Symbols.symbol_function((SubLObject)module0751.$ic653$));
        module0034.f1909((SubLObject)module0751.$ic659$);
        module0034.f1909((SubLObject)module0751.$ic661$);
        module0034.f1895((SubLObject)module0751.$ic669$);
        module0034.f1895((SubLObject)module0751.$ic672$);
        module0002.f38((SubLObject)module0751.$ic727$);
        module0002.f38((SubLObject)module0751.$ic729$);
        return (SubLObject)module0751.NIL;
    }
    
    public void declareFunctions() {
        f47231();
    }
    
    public void initializeVariables() {
        f47232();
    }
    
    public void runTopLevelForms() {
        f47233();
    }
    
    static {
        me = (SubLFile)new module0751();
        module0751.$g5989$ = null;
        module0751.$g5990$ = null;
        module0751.$g5991$ = null;
        module0751.$g5992$ = null;
        module0751.$g5993$ = null;
        module0751.$g5994$ = null;
        module0751.$g5995$ = null;
        module0751.$g5996$ = null;
        module0751.$g5997$ = null;
        module0751.$g5998$ = null;
        module0751.$g5999$ = null;
        module0751.$g6000$ = null;
        module0751.$g6001$ = null;
        module0751.$g6002$ = null;
        module0751.$g6003$ = null;
        module0751.$g6004$ = null;
        module0751.$g6005$ = null;
        module0751.$g6006$ = null;
        module0751.$g6007$ = null;
        module0751.$g6008$ = null;
        module0751.$g6009$ = null;
        module0751.$g6010$ = null;
        module0751.$g6011$ = null;
        module0751.$g6012$ = null;
        module0751.$g6013$ = null;
        module0751.$g6014$ = null;
        module0751.$g6015$ = null;
        module0751.$g6016$ = null;
        module0751.$g6017$ = null;
        module0751.$g6018$ = null;
        module0751.$g6019$ = null;
        module0751.$g6020$ = null;
        module0751.$g6021$ = null;
        module0751.$g6022$ = null;
        module0751.$g6023$ = null;
        module0751.$g6024$ = null;
        module0751.$g6025$ = null;
        module0751.$g6026$ = null;
        module0751.$g6027$ = null;
        module0751.$g6028$ = null;
        module0751.$g6029$ = null;
        module0751.$g6030$ = null;
        module0751.$g6031$ = null;
        module0751.$g6032$ = null;
        module0751.$g6033$ = null;
        module0751.$g6034$ = null;
        module0751.$g6035$ = null;
        module0751.$g6036$ = null;
        module0751.$g6037$ = null;
        module0751.$g6038$ = null;
        module0751.$g6039$ = null;
        module0751.$g6040$ = null;
        module0751.$g6041$ = null;
        module0751.$g6042$ = null;
        module0751.$g6043$ = null;
        module0751.$g6044$ = null;
        module0751.$g6045$ = null;
        module0751.$g6046$ = null;
        module0751.$g6047$ = null;
        module0751.$g6048$ = null;
        module0751.$g6049$ = null;
        module0751.$g6050$ = null;
        module0751.$g6051$ = null;
        module0751.$g6052$ = null;
        module0751.$g6053$ = null;
        module0751.$g6054$ = null;
        module0751.$g6055$ = null;
        module0751.$g6056$ = null;
        $ic0$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("herbi"), (SubLObject)SubLObjectFactory.makeString("mcd"));
        $ic1$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("herb"), (SubLObject)SubLObjectFactory.makeString("su-"), (SubLObject)SubLObjectFactory.makeString("unide"), (SubLObject)SubLObjectFactory.makeString("unin"), (SubLObject)SubLObjectFactory.makeString("hono"), (SubLObject)SubLObjectFactory.makeString("hour"), (SubLObject)SubLObjectFactory.makeString("ush"), (SubLObject)SubLObjectFactory.makeString("oner"));
        $ic2$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("rhy"), SubLObjectFactory.makeString("rha"), SubLObjectFactory.makeString("rhi"), SubLObjectFactory.makeString("rhe"), SubLObjectFactory.makeString("rho"), SubLObjectFactory.makeString("uni"), SubLObjectFactory.makeString("una"), SubLObjectFactory.makeString("us"), SubLObjectFactory.makeString("uti"), SubLObjectFactory.makeString("ute"), SubLObjectFactory.makeString("utop"), SubLObjectFactory.makeString("uri"), SubLObjectFactory.makeString("ura"), SubLObjectFactory.makeString("eu"), SubLObjectFactory.makeString("one"), SubLObjectFactory.makeString("u."), SubLObjectFactory.makeString("ub") });
        $ic3$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $ic4$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(","), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeString("]"), (SubLObject)SubLObjectFactory.makeString("'s"), (SubLObject)SubLObjectFactory.makeString("%"));
        $ic5$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("["));
        $ic6$ = SubLObjectFactory.makeSymbol("S#51592", "CYC");
        $ic7$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Noun")));
        $ic8$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genTemplate")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genFormat")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ParaphraseMt")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("generateQuantOverArg")));
        $ic9$ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $ic10$ = SubLObjectFactory.makeSymbol("S#51018", "CYC");
        $ic11$ = SubLObjectFactory.makeSymbol("S#51023", "CYC");
        $ic12$ = SubLObjectFactory.makeString("~&Pushing ~S onto ENVIRONMENT: ~S -> ");
        $ic13$ = SubLObjectFactory.makeString("~S~%");
        $ic14$ = SubLObjectFactory.makeSymbol("S#51019", "CYC");
        $ic15$ = SubLObjectFactory.makeString("~&Popping ENVIRONMENT: ~S -> ");
        $ic16$ = SubLObjectFactory.makeSymbol("S#51022", "CYC");
        $ic17$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic18$ = SubLObjectFactory.makeSymbol("CLET");
        $ic19$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51594", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51022", "CYC"))));
        $ic20$ = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $ic21$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51019", "CYC")));
        $ic22$ = SubLObjectFactory.makeString("~&Checking environment for ~S: ~S~%");
        $ic23$ = SubLObjectFactory.makeString("~&Changing paraphrase precision from ~S to ~S.~%");
        $ic24$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51652", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic25$ = SubLObjectFactory.makeSymbol("*PARAPHRASE-PRECISION*");
        $ic26$ = SubLObjectFactory.makeSymbol("S#20510", "CYC");
        $ic27$ = SubLObjectFactory.makeString("~&Changing precision from ~S to ~S.~%");
        $ic28$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic29$ = SubLObjectFactory.makeSymbol("WITH-PARAPHRASE-PRECISION");
        $ic30$ = SubLObjectFactory.makeSymbol("S#51030", "CYC");
        $ic31$ = SubLObjectFactory.makeSymbol("S#51363", "CYC");
        $ic32$ = SubLObjectFactory.makeSymbol("S#51034", "CYC");
        $ic33$ = SubLObjectFactory.makeKeyword("TEXT");
        $ic34$ = SubLObjectFactory.makeSymbol("S#49151", "CYC");
        $ic35$ = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $ic36$ = SubLObjectFactory.makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING");
        $ic37$ = SubLObjectFactory.makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
        $ic38$ = SubLObjectFactory.makeSymbol("S#38", "CYC");
        $ic39$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("typedGenlPreds"));
        $ic40$ = SubLObjectFactory.makeSymbol("S#51046", "CYC");
        $ic41$ = SubLObjectFactory.makeSymbol("?TGP");
        $ic42$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-REFLEXIVE-ONE-ARG"));
        $ic43$ = SubLObjectFactory.makeKeyword("ASCENDING");
        $ic44$ = SubLObjectFactory.makeSymbol("S#51596", "CYC");
        $ic45$ = SubLObjectFactory.makeInteger(64);
        $ic46$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genFormat"));
        $ic47$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("preferredGenUnit"));
        $ic48$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genPhrase"));
        $ic49$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("denotation"));
        $ic50$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $ic51$ = SubLObjectFactory.makeKeyword("NEVER");
        $ic52$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Determiner-Definite"));
        $ic53$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Determiner-Indefinite"));
        $ic54$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("A"), SubLObjectFactory.makeKeyword("AN"), SubLObjectFactory.makeKeyword("A-THE-WORD"), SubLObjectFactory.makeKeyword("EIN"), SubLObjectFactory.makeKeyword("THE"), SubLObjectFactory.makeKeyword("THE-THE-WORD"), SubLObjectFactory.makeKeyword("ALL"), SubLObjectFactory.makeKeyword("ALL-THE-WORD"), SubLObjectFactory.makeKeyword("SOME"), SubLObjectFactory.makeKeyword("SOME-THE-WORD"), SubLObjectFactory.makeKeyword("EVERY"), SubLObjectFactory.makeKeyword("EVERY-THE-WORD"), SubLObjectFactory.makeKeyword("ANY"), SubLObjectFactory.makeKeyword("ANY-THE-WORD"), SubLObjectFactory.makeKeyword("THAT"), SubLObjectFactory.makeKeyword("THAT-THE-WORD"), SubLObjectFactory.makeKeyword("THIS"), SubLObjectFactory.makeKeyword("THIS-THE-WORD"), SubLObjectFactory.makeKeyword("THESE"), SubLObjectFactory.makeKeyword("THESE-THE-WORD"), SubLObjectFactory.makeKeyword("THOSE"), SubLObjectFactory.makeKeyword("THOSE-THE-WORD") });
        $ic55$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("A-TheWord")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("The-TheWord")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("All-TheWord")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Some-TheWord")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Every-TheWord")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Any-TheWord")));
        $ic56$ = SubLObjectFactory.makeSymbol("FORT-P");
        $ic57$ = SubLObjectFactory.makeSymbol("S#51009", "CYC");
        $ic58$ = SubLObjectFactory.makeSymbol("S#51056", "CYC");
        $ic59$ = SubLObjectFactory.makeKeyword("NONE");
        $ic60$ = SubLObjectFactory.makeString("~&Adding determiner ~S.~%");
        $ic61$ = SubLObjectFactory.makeString("~&Couldn't find a determiner for ~S.~%");
        $ic62$ = SubLObjectFactory.makeString(" ");
        $ic63$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("posForms"));
        $ic64$ = SubLObjectFactory.makeString("aefhilmnorsx");
        $ic65$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("uaa"), SubLObjectFactory.makeString("uab"), SubLObjectFactory.makeString("uae"), SubLObjectFactory.makeString("uam"), SubLObjectFactory.makeString("uapb"), SubLObjectFactory.makeString("uav"), SubLObjectFactory.makeString("ublf"), SubLObjectFactory.makeString("uc"), SubLObjectFactory.makeString("uca"), SubLObjectFactory.makeString("ucaa"), SubLObjectFactory.makeString("ucf"), SubLObjectFactory.makeString("ucla"), SubLObjectFactory.makeString("uco"), SubLObjectFactory.makeString("ucsc"), SubLObjectFactory.makeString("uda"), SubLObjectFactory.makeString("udp"), SubLObjectFactory.makeString("uff"), SubLObjectFactory.makeString("ufo"), SubLObjectFactory.makeString("ufop"), SubLObjectFactory.makeString("ufs"), SubLObjectFactory.makeString("uga"), SubLObjectFactory.makeString("ugb"), SubLObjectFactory.makeString("ugi"), SubLObjectFactory.makeString("uh"), SubLObjectFactory.makeString("uhl"), SubLObjectFactory.makeString("ui"), SubLObjectFactory.makeString("uia"), SubLObjectFactory.makeString("uid"), SubLObjectFactory.makeString("uiu"), SubLObjectFactory.makeString("uiuc"), SubLObjectFactory.makeString("uk"), SubLObjectFactory.makeString("uka"), SubLObjectFactory.makeString("ukc"), SubLObjectFactory.makeString("uklf"), SubLObjectFactory.makeString("ulfa"), SubLObjectFactory.makeString("ull"), SubLObjectFactory.makeString("ulm"), SubLObjectFactory.makeString("ulv"), SubLObjectFactory.makeString("umac"), SubLObjectFactory.makeString("umb"), SubLObjectFactory.makeString("umbc"), SubLObjectFactory.makeString("umd"), SubLObjectFactory.makeString("umda"), SubLObjectFactory.makeString("umhb"), SubLObjectFactory.makeString("uml"), SubLObjectFactory.makeString("umms"), SubLObjectFactory.makeString("un"), SubLObjectFactory.makeString("una"), SubLObjectFactory.makeString("unc"), SubLObjectFactory.makeString("unclos"), SubLObjectFactory.makeString("unctad"), SubLObjectFactory.makeString("und"), SubLObjectFactory.makeString("unesco"), SubLObjectFactory.makeString("unfccc"), SubLObjectFactory.makeString("unficyp"), SubLObjectFactory.makeString("unh"), SubLObjectFactory.makeString("unhcr"), SubLObjectFactory.makeString("uni"), SubLObjectFactory.makeString("unicef"), SubLObjectFactory.makeString("unido"), SubLObjectFactory.makeString("unifil"), SubLObjectFactory.makeString("unikom"), SubLObjectFactory.makeString("unita"), SubLObjectFactory.makeString("unitar"), SubLObjectFactory.makeString("unk"), SubLObjectFactory.makeString("unlv"), SubLObjectFactory.makeString("unm"), SubLObjectFactory.makeString("unmibh"), SubLObjectFactory.makeString("unmih"), SubLObjectFactory.makeString("uno"), SubLObjectFactory.makeString("unomil"), SubLObjectFactory.makeString("unomoz"), SubLObjectFactory.makeString("unosom"), SubLObjectFactory.makeString("unprofor"), SubLObjectFactory.makeString("unsc"), SubLObjectFactory.makeString("unscom"), SubLObjectFactory.makeString("untso"), SubLObjectFactory.makeString("unu"), SubLObjectFactory.makeString("upds"), SubLObjectFactory.makeString("upi"), SubLObjectFactory.makeString("upn"), SubLObjectFactory.makeString("ups"), SubLObjectFactory.makeString("upu"), SubLObjectFactory.makeString("ur"), SubLObjectFactory.makeString("ura"), SubLObjectFactory.makeString("uri"), SubLObjectFactory.makeString("url"), SubLObjectFactory.makeString("usacap"), SubLObjectFactory.makeString("usace"), SubLObjectFactory.makeString("usaf"), SubLObjectFactory.makeString("usafe"), SubLObjectFactory.makeString("usah"), SubLObjectFactory.makeString("usaid"), SubLObjectFactory.makeString("usar"), SubLObjectFactory.makeString("usarak"), SubLObjectFactory.makeString("usc"), SubLObjectFactory.makeString("uscga"), SubLObjectFactory.makeString("usd"), SubLObjectFactory.makeString("usda"), SubLObjectFactory.makeString("usda fs"), SubLObjectFactory.makeString("usdafs"), SubLObjectFactory.makeString("usdol"), SubLObjectFactory.makeString("usdot"), SubLObjectFactory.makeString("usf"), SubLObjectFactory.makeString("usfs"), SubLObjectFactory.makeString("usfws"), SubLObjectFactory.makeString("usgs"), SubLObjectFactory.makeString("usmc"), SubLObjectFactory.makeString("usno"), SubLObjectFactory.makeString("uspacom"), SubLObjectFactory.makeString("usps"), SubLObjectFactory.makeString("uss"), SubLObjectFactory.makeString("usstratcom"), SubLObjectFactory.makeString("ust"), SubLObjectFactory.makeString("usu"), SubLObjectFactory.makeString("ut"), SubLObjectFactory.makeString("uta"), SubLObjectFactory.makeString("utep"), SubLObjectFactory.makeString("uti"), SubLObjectFactory.makeString("utn"), SubLObjectFactory.makeString("uto"), SubLObjectFactory.makeString("uvf"), SubLObjectFactory.makeString("uwa"), SubLObjectFactory.makeString("uwec"), SubLObjectFactory.makeString("uwg"), SubLObjectFactory.makeString("uwlax"), SubLObjectFactory.makeString("uwlc"), SubLObjectFactory.makeString("uwo"), SubLObjectFactory.makeString("uwp"), SubLObjectFactory.makeString("uwrf"), SubLObjectFactory.makeString("uws"), SubLObjectFactory.makeString("uwsp"), SubLObjectFactory.makeString("uww"), SubLObjectFactory.makeString("ulfbv") });
        $ic66$ = SubLObjectFactory.makeSymbol("S#4061", "CYC");
        $ic67$ = SubLObjectFactory.makeSymbol("S#4078", "CYC");
        $ic68$ = SubLObjectFactory.makeString("Using \"a\". ~S starts with one of *FORCE-PREFIX-WITH-A*");
        $ic69$ = SubLObjectFactory.makeKeyword("A");
        $ic70$ = SubLObjectFactory.makeString("Using \"an\". ~S starts with one of *PREFIX-WITH-AN*");
        $ic71$ = SubLObjectFactory.makeKeyword("AN");
        $ic72$ = SubLObjectFactory.makeString("Using \"a\". ~S starts with one of *PREFIX-WITH-A*");
        $ic73$ = SubLObjectFactory.makeString("u");
        $ic74$ = SubLObjectFactory.makeString("Using \"a\". ~S is an acronym starting with \"u\".");
        $ic75$ = SubLObjectFactory.makeString("Using \"an\". ~S starts with a vowel: ~S.");
        $ic76$ = SubLObjectFactory.makeString("Using \"a\". ~S starts with a non-vowel-sounding consonant: ~S.");
        $ic77$ = SubLObjectFactory.makeString("Using \"an\". ~S is one character long and starts with a vowel-sounding consonant: ~S.");
        $ic78$ = SubLObjectFactory.makeString("sf");
        $ic79$ = SubLObjectFactory.makeString("Using \"an\". ~S starts with a vowel-sounding consonant, and the second character is not a vowel: ~S.");
        $ic80$ = SubLObjectFactory.makeKeyword("DENOT");
        $ic81$ = SubLObjectFactory.makeString("Using \"an\". ~S is an acronym starting with ~S.");
        $ic82$ = SubLObjectFactory.makeString("Defaulting to \"a\" for ~S.");
        $ic83$ = SubLObjectFactory.makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
        $ic84$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOMINATIVE"), (SubLObject)SubLObjectFactory.makeKeyword("ACCUSATIVE"));
        $ic85$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic86$ = SubLObjectFactory.makeSymbol("S#50946", "CYC");
        $ic87$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51653", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("CASE"));
        $ic88$ = SubLObjectFactory.makeKeyword("A-THE-WORD");
        $ic89$ = SubLObjectFactory.makeString("an");
        $ic90$ = SubLObjectFactory.makeString("a");
        $ic91$ = SubLObjectFactory.makeKeyword("THE");
        $ic92$ = SubLObjectFactory.makeKeyword("THE-THE-WORD");
        $ic93$ = SubLObjectFactory.makeString("the");
        $ic94$ = SubLObjectFactory.makeKeyword("EVERY");
        $ic95$ = SubLObjectFactory.makeKeyword("EVERY-THE-WORD");
        $ic96$ = SubLObjectFactory.makeString("every");
        $ic97$ = SubLObjectFactory.makeKeyword("SOME");
        $ic98$ = SubLObjectFactory.makeKeyword("SOME-THE-WORD");
        $ic99$ = SubLObjectFactory.makeString("some");
        $ic100$ = SubLObjectFactory.makeKeyword("ALL");
        $ic101$ = SubLObjectFactory.makeKeyword("ALL-THE-WORD");
        $ic102$ = SubLObjectFactory.makeString("all");
        $ic103$ = SubLObjectFactory.makeKeyword("ANY");
        $ic104$ = SubLObjectFactory.makeKeyword("ANY-THE-WORD");
        $ic105$ = SubLObjectFactory.makeString("any");
        $ic106$ = SubLObjectFactory.makeKeyword("THAT");
        $ic107$ = SubLObjectFactory.makeKeyword("THAT-THE-WORD");
        $ic108$ = SubLObjectFactory.makeString("that");
        $ic109$ = SubLObjectFactory.makeKeyword("THIS");
        $ic110$ = SubLObjectFactory.makeKeyword("THIS-THE-WORD");
        $ic111$ = SubLObjectFactory.makeString("this");
        $ic112$ = SubLObjectFactory.makeKeyword("THESE");
        $ic113$ = SubLObjectFactory.makeKeyword("THESE-THE-WORD");
        $ic114$ = SubLObjectFactory.makeString("these");
        $ic115$ = SubLObjectFactory.makeKeyword("THOSE");
        $ic116$ = SubLObjectFactory.makeKeyword("THOSE-THE-WORD");
        $ic117$ = SubLObjectFactory.makeString("those");
        $ic118$ = SubLObjectFactory.makeKeyword("EIN");
        $ic119$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $ic120$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("UNIVERSAL"), SubLObjectFactory.makeKeyword("INDEFINITE"), SubLObjectFactory.makeKeyword("DEFINITE"), SubLObjectFactory.makeKeyword("NO"), SubLObjectFactory.makeKeyword("ANY"), SubLObjectFactory.makeKeyword("DEMONSTRATIVE-CLASSA"), SubLObjectFactory.makeKeyword("DEMONSTRATIVE-CLASSB"), SubLObjectFactory.makeKeyword("DEMONSTRATIVE-CLASSC"), SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSA"), SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSB"), SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSC"), SubLObjectFactory.makeKeyword("WHAT") });
        $ic121$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Place"));
        $ic122$ = SubLObjectFactory.makeKeyword("UNIVERSAL");
        $ic123$ = SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSB");
        $ic124$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ScalarInterval"));
        $ic125$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFormFn"));
        $ic126$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Determiner")));
        $ic127$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ConcatenatePhrasesFn"));
        $ic128$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestNLWordFormOfLexemeFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Of-TheWord")));
        $ic129$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Agent-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Person")));
        $ic130$ = SubLObjectFactory.makeString("everything");
        $ic131$ = SubLObjectFactory.makeKeyword("INDEFINITE");
        $ic132$ = SubLObjectFactory.makeString("something");
        $ic133$ = SubLObjectFactory.makeKeyword("DEFINITE");
        $ic134$ = SubLObjectFactory.makeString("it");
        $ic135$ = SubLObjectFactory.makeKeyword("DEMONSTRATIVE-CLASSA");
        $ic136$ = SubLObjectFactory.makeKeyword("DEMONSTRATIVE-CLASSB");
        $ic137$ = SubLObjectFactory.makeKeyword("DEMONSTRATIVE-CLASSC");
        $ic138$ = SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSA");
        $ic139$ = SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSC");
        $ic140$ = SubLObjectFactory.makeString("that thing");
        $ic141$ = SubLObjectFactory.makeKeyword("NO");
        $ic142$ = SubLObjectFactory.makeString("nothing");
        $ic143$ = SubLObjectFactory.makeString("anything");
        $ic144$ = SubLObjectFactory.makeKeyword("WHAT");
        $ic145$ = SubLObjectFactory.makeString("what");
        $ic146$ = SubLObjectFactory.makeString("(PPH error level ");
        $ic147$ = SubLObjectFactory.makeString(") ");
        $ic148$ = SubLObjectFactory.makeString("Don't know how to make thing string from ~S. Using 'something'.");
        $ic149$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular"));
        $ic150$ = SubLObjectFactory.makeString("PhraseCycLFn");
        $ic151$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Thing"));
        $ic152$ = SubLObjectFactory.makeString("everyplace");
        $ic153$ = SubLObjectFactory.makeString("someplace");
        $ic154$ = SubLObjectFactory.makeString("nowhere");
        $ic155$ = SubLObjectFactory.makeString("anywhere");
        $ic156$ = SubLObjectFactory.makeString("what places");
        $ic157$ = SubLObjectFactory.makeString("that place");
        $ic158$ = SubLObjectFactory.makeString("Don't know how to make place string from ~S.");
        $ic159$ = SubLObjectFactory.makeKeyword("UNKNOWN");
        $ic160$ = SubLObjectFactory.makeString("everyone");
        $ic161$ = SubLObjectFactory.makeString("someone");
        $ic162$ = SubLObjectFactory.makeString("noone");
        $ic163$ = SubLObjectFactory.makeString("anyone");
        $ic164$ = SubLObjectFactory.makeString("who");
        $ic165$ = SubLObjectFactory.makeString("Don't know how to make an agent string from ~S.");
        $ic166$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFINITE"), (SubLObject)SubLObjectFactory.makeKeyword("DEMONSTRATIVE-CLASSA"), (SubLObject)SubLObjectFactory.makeKeyword("DEMONSTRATIVE-CLASSB"), (SubLObject)SubLObjectFactory.makeKeyword("DEMONSTRATIVE-CLASSC"), (SubLObject)SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSA"), (SubLObject)SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSB"), (SubLObject)SubLObjectFactory.makeKeyword("BACKREFERENCE-CLASSC"));
        $ic167$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestDetNbarFn"));
        $ic168$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Every-NLAttr")));
        $ic169$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Some-NLAttr")));
        $ic170$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr")));
        $ic171$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestNLPhraseOfStringFn")), (SubLObject)SubLObjectFactory.makeString("what"));
        $ic172$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("No-NLAttr")));
        $ic173$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Any-NLAttr")));
        $ic174$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Demonstrative-ClassA-NLAttr")));
        $ic175$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Demonstrative-ClassB-NLAttr")));
        $ic176$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Demonstrative-ClassC-NLAttr")));
        $ic177$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Backreference-ClassA-NLAttr")));
        $ic178$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Backreference-ClassB-NLAttr")));
        $ic179$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Backreference-ClassC-NLAttr")));
        $ic180$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Demonstrative-ClassC-NLAttr"));
        $ic181$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Demonstrative-ClassB-NLAttr"));
        $ic182$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Backreference-ClassC-NLAttr"));
        $ic183$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Backreference-ClassB-NLAttr"));
        $ic184$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SpecsFn"));
        $ic185$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TermParaphraseFn-Constrained"));
        $ic186$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestNLPhraseOfStringFn")), (SubLObject)SubLObjectFactory.makeString("other"));
        $ic187$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("HeadWordOfPhraseFn"));
        $ic188$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("simpleNounStrings"));
        $ic189$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $ic190$ = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("BestNLWordFormOfLexemeFn-Constrained")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CountNoun")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Instance-TheWord"))));
        $ic191$ = SubLObjectFactory.makeString("of");
        $ic192$ = SubLObjectFactory.makeKeyword("NOMINATIVE");
        $ic193$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular-Feminine"));
        $ic194$ = SubLObjectFactory.makeString("eine");
        $ic195$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("singular-Masculine"));
        $ic196$ = SubLObjectFactory.makeString("ein");
        $ic197$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMinFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMaxFn"))), (SubLObject)module0751.ONE_INTEGER);
        $ic198$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $ic199$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMinFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalMaxFn")));
        $ic200$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NumericInterval"));
        $ic201$ = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("SELF")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("rdf-type")), (SubLObject)SubLObjectFactory.makeKeyword("SELF")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SpecsFn")), (SubLObject)SubLObjectFactory.makeKeyword("SELF")));
        $ic202$ = SubLObjectFactory.makeSymbol("S#51096", "CYC");
        $ic203$ = SubLObjectFactory.makeSymbol("STRINGP");
        $ic204$ = SubLObjectFactory.makeSymbol("FIND-CONSTANT");
        $ic205$ = SubLObjectFactory.makeSymbol("CAR");
        $ic206$ = SubLObjectFactory.makeSymbol("S#51604", "CYC");
        $ic207$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51654", "CYC"));
        $ic208$ = SubLObjectFactory.makeKeyword("ARG2");
        $ic209$ = SubLObjectFactory.makeSymbol("S#51103", "CYC");
        $ic210$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#155", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1069245"));
        $ic211$ = SubLObjectFactory.makeSymbol("S#51605", "CYC");
        $ic212$ = SubLObjectFactory.makeSymbol("S#51100", "CYC");
        $ic213$ = SubLObjectFactory.makeSymbol("S#51107", "CYC");
        $ic214$ = SubLObjectFactory.makeSymbol("S#51606", "CYC");
        $ic215$ = SubLObjectFactory.makeSymbol("S#50953", "CYC");
        $ic216$ = SubLObjectFactory.makeString("for any ");
        $ic217$ = SubLObjectFactory.makeString(", it is the case that ");
        $ic218$ = SubLObjectFactory.makeSymbol("S#3951", "CYC");
        $ic219$ = SubLObjectFactory.makeSymbol("S#51114", "CYC");
        $ic220$ = SubLObjectFactory.makeInteger(250);
        $ic221$ = SubLObjectFactory.makeString(",;%");
        $ic222$ = SubLObjectFactory.makeString("?.");
        $ic223$ = SubLObjectFactory.makeSymbol("S#39357", "CYC");
        $ic224$ = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $ic225$ = SubLObjectFactory.makeString(".");
        $ic226$ = SubLObjectFactory.makeString("?");
        $ic227$ = SubLObjectFactory.makeString("'\"");
        $ic228$ = SubLObjectFactory.makeString("\"'");
        $ic229$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("pH"), (SubLObject)SubLObjectFactory.makeString("pOH"));
        $ic230$ = SubLObjectFactory.makeSymbol("S#51137", "CYC");
        $ic231$ = SubLObjectFactory.makeSymbol("S#12343", "CYC");
        $ic232$ = SubLObjectFactory.makeInteger(128);
        $ic233$ = SubLObjectFactory.makeSymbol("S#51139", "CYC");
        $ic234$ = SubLObjectFactory.makeInteger(32);
        $ic235$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#42702", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33867", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#28818", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51655", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51656", "CYC"));
        $ic236$ = SubLObjectFactory.makeSymbol("PUNLESS");
        $ic237$ = SubLObjectFactory.makeSymbol("S#50970", "CYC");
        $ic238$ = SubLObjectFactory.makeSymbol("S#38908", "CYC");
        $ic239$ = SubLObjectFactory.makeString("~&Rephrasing ~S.~%");
        $ic240$ = SubLObjectFactory.makeSymbol("CSETQ");
        $ic241$ = SubLObjectFactory.makeSymbol("S#51225", "CYC");
        $ic242$ = SubLObjectFactory.makeString("New CycL: ~S.~%");
        $ic243$ = SubLObjectFactory.makeSymbol("APPEND");
        $ic244$ = SubLObjectFactory.makeSymbol("PWHEN");
        $ic245$ = SubLObjectFactory.makeString("Justifications: ~S.~%");
        $ic246$ = SubLObjectFactory.makeSymbol("S#13276", "CYC");
        $ic247$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheUser")));
        $ic248$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IndexicalReferentFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic249$ = SubLObjectFactory.makeSymbol("S#50958", "CYC");
        $ic250$ = SubLObjectFactory.makeSymbol("S#51158", "CYC");
        $ic251$ = SubLObjectFactory.makeSymbol("S#24728", "CYC");
        $ic252$ = SubLObjectFactory.makeKeyword("INDEXICAL-DATE");
        $ic253$ = SubLObjectFactory.makeSymbol("S#50960", "CYC");
        $ic254$ = SubLObjectFactory.makeSymbol("S#50963", "CYC");
        $ic255$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Addressee"));
        $ic256$ = SubLObjectFactory.makeSymbol("S#50962", "CYC");
        $ic257$ = SubLObjectFactory.makeSymbol("S#51155", "CYC");
        $ic258$ = SubLObjectFactory.makeSymbol("?ABSOLUTE");
        $ic259$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $ic260$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ABSOLUTE"));
        $ic261$ = SubLObjectFactory.makeSymbol("S#51164", "CYC");
        $ic262$ = SubLObjectFactory.makeSymbol("S#12274", "CYC");
        $ic263$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $ic264$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IndexicalFirstOrderTerm"));
        $ic265$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $ic266$ = SubLObjectFactory.makeKeyword("BREADTH");
        $ic267$ = SubLObjectFactory.makeKeyword("QUEUE");
        $ic268$ = SubLObjectFactory.makeKeyword("STACK");
        $ic269$ = SubLObjectFactory.makeSymbol("S#11450", "CYC");
        $ic270$ = SubLObjectFactory.makeKeyword("ERROR");
        $ic271$ = SubLObjectFactory.makeString("~A is not a ~A");
        $ic272$ = SubLObjectFactory.makeSymbol("S#11592", "CYC");
        $ic273$ = SubLObjectFactory.makeKeyword("CERROR");
        $ic274$ = SubLObjectFactory.makeString("continue anyway");
        $ic275$ = SubLObjectFactory.makeKeyword("WARN");
        $ic276$ = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $ic277$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Date"));
        $ic278$ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $ic279$ = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $ic280$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("US#4D5E436"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1526883"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#15AA083"));
        $ic281$ = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $ic282$ = SubLObjectFactory.makeSymbol("S#51609", "CYC");
        $ic283$ = SubLObjectFactory.makeSymbol("S#51170", "CYC");
        $ic284$ = SubLObjectFactory.makeSymbol("?DATE");
        $ic285$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DATE"));
        $ic286$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $ic287$ = SubLObjectFactory.makeSymbol("S#51610", "CYC");
        $ic288$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CalendarDay"));
        $ic289$ = SubLObjectFactory.makeString("Don't know expiration date for ~S.");
        $ic290$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubjectRolePredicate"));
        $ic291$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa"));
        $ic292$ = SubLObjectFactory.makeKeyword("INITIALIZED");
        $ic293$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheVPParse"));
        $ic294$ = ConsesLow.list((SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.ONE_INTEGER);
        $ic295$ = ConsesLow.list((SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.TWO_INTEGER);
        $ic296$ = SubLObjectFactory.makeKeyword("ARG0");
        $ic297$ = SubLObjectFactory.makeKeyword("ARG3");
        $ic298$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SomeFn"));
        $ic299$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("StateFn"));
        $ic300$ = ConsesLow.list((SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.ONE_INTEGER, (SubLObject)module0751.ONE_INTEGER);
        $ic301$ = SubLObjectFactory.makeSymbol("S#51172", "CYC");
        $ic302$ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $ic303$ = SubLObjectFactory.makeKeyword("CORE");
        $ic304$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#33867", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic305$ = SubLObjectFactory.makeUninternedSymbol("US#37C68E1");
        $ic306$ = ConsesLow.list((SubLObject)module0751.NIL);
        $ic307$ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $ic308$ = SubLObjectFactory.makeSymbol("S#51180", "CYC");
        $ic309$ = SubLObjectFactory.makeSymbol("S#51181", "CYC");
        $ic310$ = SubLObjectFactory.makeSymbol("S#51179", "CYC");
        $ic311$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist"));
        $ic312$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51657", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51658", "CYC"));
        $ic313$ = SubLObjectFactory.makeSymbol("S#51659", "CYC");
        $ic314$ = SubLObjectFactory.makeKeyword("IGNORE");
        $ic315$ = SubLObjectFactory.makeSymbol("S#51660", "CYC");
        $ic316$ = SubLObjectFactory.makeSymbol("S#51189", "CYC");
        $ic317$ = SubLObjectFactory.makeSymbol("S#51193", "CYC");
        $ic318$ = SubLObjectFactory.makeSymbol("S#18076", "CYC");
        $ic319$ = SubLObjectFactory.makeSymbol("STRING<");
        $ic320$ = SubLObjectFactory.makeSymbol("PRINC-TO-STRING");
        $ic321$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("OrderingPredicate"));
        $ic322$ = SubLObjectFactory.makeString("~&Using expansion ~S for ~S~%");
        $ic323$ = SubLObjectFactory.makeSymbol("S#12344", "CYC");
        $ic324$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("expansion"));
        $ic325$ = SubLObjectFactory.makeKeyword("GAF");
        $ic326$ = SubLObjectFactory.makeKeyword("TRUE");
        $ic327$ = SubLObjectFactory.makeSymbol("S#51205", "CYC");
        $ic328$ = SubLObjectFactory.makeInteger(24);
        $ic329$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ModalOperator"));
        $ic330$ = SubLObjectFactory.makeSymbol("S#51005", "CYC");
        $ic331$ = SubLObjectFactory.makeSymbol("S#50969", "CYC");
        $ic332$ = SubLObjectFactory.makeKeyword("SELF");
        $ic333$ = SubLObjectFactory.makeKeyword("PPH-IMPOSSIBLE-TEMPLATE");
        $ic334$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgFn"));
        $ic335$ = SubLObjectFactory.makeKeyword("OPAQUE");
        $ic336$ = SubLObjectFactory.makeKeyword("TRANSPARENT");
        $ic337$ = SubLObjectFactory.makeSymbol("S#51215", "CYC");
        $ic338$ = SubLObjectFactory.makeString("Don't know how to resolve formula-arg nauts in ~S");
        $ic339$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34615", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"));
        $ic340$ = SubLObjectFactory.makeString("Arg-position contains non-integer: ~S");
        $ic341$ = SubLObjectFactory.makeString("~&Problem in PPH-ARG-POSITION-FROM-FORMULA-ARG-NAUT.~%");
        $ic342$ = SubLObjectFactory.makeString("Applying template ~S to NIL.~%Current phrase: ~S");
        $ic343$ = SubLObjectFactory.makeString("Applying null template to ~S.~%Current phrase: ~S");
        $ic344$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15200", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51661", "CYC"));
        $ic345$ = SubLObjectFactory.makeString("Can't apply ~S to ~S.~%");
        $ic346$ = SubLObjectFactory.makeString("PPH-TEST-DNF passed NIL.");
        $ic347$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $ic348$ = SubLObjectFactory.makeString("~S was required to be false, but is true in ~S.");
        $ic349$ = SubLObjectFactory.makeKeyword("FALSE");
        $ic350$ = SubLObjectFactory.makeString("~S is not known to be true in ~S.");
        $ic351$ = SubLObjectFactory.makeString("~&Condition passed: ~S");
        $ic352$ = SubLObjectFactory.makeString("~&Condition not known true, so failed: ~S");
        $ic353$ = SubLObjectFactory.makeString("~&Condition failed: ~S");
        $ic354$ = SubLObjectFactory.makeSymbol("S#51234", "CYC");
        $ic355$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("equals"));
        $ic356$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genls"));
        $ic357$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $ic358$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("natFunction"));
        $ic359$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("operatorFormulas"));
        $ic360$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("lengthOfList")), (SubLObject)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P")));
        $ic361$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("longerDurationThan"));
        $ic362$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51662", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51663", "CYC"));
        $ic363$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("posPredOfConstituent"));
        $ic364$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("posOfPhrase"));
        $ic365$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $ic366$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("not"));
        $ic367$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("generatesAsFirstOrder"));
        $ic368$ = SubLObjectFactory.makeSymbol("S#51664", "CYC");
        $ic369$ = SubLObjectFactory.makeSymbol("FIRST");
        $ic370$ = SubLObjectFactory.makeSymbol("S#12585", "CYC");
        $ic371$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("greaterThan"));
        $ic372$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DurationFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval")), (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))));
        $ic373$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DurationFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic374$ = SubLObjectFactory.makeKeyword("MIN");
        $ic375$ = SubLObjectFactory.makeKeyword("MAX");
        $ic376$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DayFn"));
        $ic377$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)module0751.ONE_INTEGER);
        $ic378$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonthFn"));
        $ic379$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MonthsDuration")), (SubLObject)module0751.ONE_INTEGER);
        $ic380$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("YearFn"));
        $ic381$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("YearsDuration")), (SubLObject)module0751.ONE_INTEGER);
        $ic382$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $ic383$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalBetweenFn"));
        $ic384$ = SubLObjectFactory.makeSymbol("?DUR");
        $ic385$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("duration"));
        $ic386$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DUR"));
        $ic387$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)module0751.ONE_INTEGER);
        $ic388$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("DurationFn"));
        $ic389$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#124", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#125", "CYC"));
        $ic390$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $ic391$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeElapsedFn"));
        $ic392$ = (SubLList)ConsesLow.cons(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic393$ = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $ic394$ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROPERTY-P");
        $ic395$ = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $ic396$ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $ic397$ = SubLObjectFactory.makeString("Asking ~S without a valid cached PPH problem store: ~S");
        $ic398$ = SubLObjectFactory.makeString("Using ~S for query.");
        $ic399$ = SubLObjectFactory.makeString("Bad mt to PPH-QUERY: ~S");
        $ic400$ = SubLObjectFactory.makeString("Recursive call to PPH-QUERY on formula ~S");
        $ic401$ = SubLObjectFactory.makeString("Too many nested calls to PPH-QUERY: ~S.");
        $ic402$ = SubLObjectFactory.makeKeyword("ILL-FORMED");
        $ic403$ = SubLObjectFactory.makeString("Ill-formed PPH query:~% ~S~% in ~S");
        $ic404$ = SubLObjectFactory.makeKeyword("MAX-TIME");
        $ic405$ = SubLObjectFactory.makeString("Couldn't resolve ~S in ~S seconds.~%");
        $ic406$ = SubLObjectFactory.makeSymbol("S#51257", "CYC");
        $ic407$ = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $ic408$ = SubLObjectFactory.makeInteger(100);
        $ic409$ = SubLObjectFactory.makeSymbol("S#51259", "CYC");
        $ic410$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI")));
        $ic411$ = SubLObjectFactory.makeString("Inference Error while asking ~S:~% ~S");
        $ic412$ = SubLObjectFactory.makeInteger(1000);
        $ic413$ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $ic414$ = SubLObjectFactory.makeString("Inconsistent removal ask results for~% ~S~%REMOVAL-ASK: ~S~%PPH-QUERY: ~S~%");
        $ic415$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("keIrrelevantTerm"));
        $ic416$ = SubLObjectFactory.makeSymbol("S#51263", "CYC");
        $ic417$ = SubLObjectFactory.makeSymbol("S#5859", "CYC");
        $ic418$ = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $ic419$ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $ic420$ = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $ic421$ = SubLObjectFactory.makeSymbol("S#51265", "CYC");
        $ic422$ = SubLObjectFactory.makeSymbol("S#51268", "CYC");
        $ic423$ = SubLObjectFactory.makeKeyword("RETURN");
        $ic424$ = SubLObjectFactory.makeKeyword("TEMPLATE");
        $ic425$ = SubLObjectFactory.makeString("Recording ~S as a type-level violation:~% arg ~S of ~S");
        $ic426$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic427$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Individual"));
        $ic428$ = SubLObjectFactory.makeSymbol("??TERM");
        $ic429$ = SubLObjectFactory.makeSymbol("S#51007", "CYC");
        $ic430$ = SubLObjectFactory.makeString("Paraphrasing ~S as a type-level violation.");
        $ic431$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameString"));
        $ic432$ = SubLObjectFactory.makeInteger(30);
        $ic433$ = SubLObjectFactory.makeSymbol("S#12753", "CYC");
        $ic434$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VAR", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13498", "CYC"));
        $ic435$ = SubLObjectFactory.makeKeyword("NEW");
        $ic436$ = SubLObjectFactory.makeSymbol("S#13265", "CYC");
        $ic437$ = SubLObjectFactory.makeSymbol("LIST");
        $ic438$ = SubLObjectFactory.makeSymbol("PPH-OPTIMIZED-NAMES-FOR-VARIABLES");
        $ic439$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*")), (SubLObject)SubLObjectFactory.makeSymbol("S#51666", "CYC"));
        $ic440$ = SubLObjectFactory.makeString("returns an association-list mapping between variables in FORMULA and natural-language strings that \n   should be good representations of the argument-types for the variable.");
        $ic441$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#6061", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12753", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13265", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#13265", "CYC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51666", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#664", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#12753", "CYC"))));
        $ic442$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $ic443$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#12457", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34615", "CYC"));
        $ic444$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51667", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#49996", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51668", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#20618", "CYC"));
        $ic445$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")));
        $ic446$ = SubLObjectFactory.makeSymbol("+");
        $ic447$ = SubLObjectFactory.makeSymbol("LENGTH");
        $ic448$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#51669", "CYC"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("US#1069245"));
        $ic449$ = SubLObjectFactory.makeSymbol("S#51277", "CYC");
        $ic450$ = SubLObjectFactory.makeSymbol("S#51289", "CYC");
        $ic451$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#51669", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51670", "CYC"));
        $ic452$ = SubLObjectFactory.makeSymbol("S#51279", "CYC");
        $ic453$ = SubLObjectFactory.makeSymbol("S#51281", "CYC");
        $ic454$ = SubLObjectFactory.makeSymbol("S#51389", "CYC");
        $ic455$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TerseParaphraseFn"));
        $ic456$ = SubLObjectFactory.makeSymbol("S#15451", "CYC");
        $ic457$ = SubLObjectFactory.makeString("Too deep.");
        $ic458$ = SubLObjectFactory.makeString("Variable optimized:~% ~S -> ~S");
        $ic459$ = SubLObjectFactory.makeString("X");
        $ic460$ = SubLObjectFactory.makeSymbol("S#14106", "CYC");
        $ic461$ = SubLObjectFactory.makeSymbol("S#50649", "CYC");
        $ic462$ = SubLObjectFactory.makeSymbol("S#747", "CYC");
        $ic463$ = SubLObjectFactory.makeSymbol("S#51293", "CYC");
        $ic464$ = SubLObjectFactory.makeSymbol("S#50666", "CYC");
        $ic465$ = SubLObjectFactory.makeSymbol("S#51297", "CYC");
        $ic466$ = SubLObjectFactory.makeSymbol("S#50658", "CYC");
        $ic467$ = SubLObjectFactory.makeSymbol("S#51563", "CYC");
        $ic468$ = SubLObjectFactory.makeSymbol("S#50656", "CYC");
        $ic469$ = SubLObjectFactory.makeSymbol("S#50650", "CYC");
        $ic470$ = SubLObjectFactory.makeSymbol("CB-NAUT-FRAME");
        $ic471$ = SubLObjectFactory.makeSymbol("S#51671", "CYC");
        $ic472$ = SubLObjectFactory.makeSymbol("S#51301", "CYC");
        $ic473$ = SubLObjectFactory.makeString("");
        $ic474$ = SubLObjectFactory.makeKeyword("PPH-UNKNOWN-ARG-POSITION");
        $ic475$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("StructuredParaphraseFn"));
        $ic476$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SubParaphraseFn"));
        $ic477$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Quote"));
        $ic478$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("FormulaArgPositionFn"));
        $ic479$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnlinkedSubParaphraseFn"));
        $ic480$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnlinkedSubParaphraseWithHTMLFn"));
        $ic481$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#51672", "CYC"));
        $ic482$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#51673", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51674", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51676", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35177", "CYC"));
        $ic483$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#51675", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51676", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#35177", "CYC"));
        $ic484$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("S#35177", "CYC"));
        $ic485$ = SubLObjectFactory.makeString("Can't interpret ~S");
        $ic486$ = SubLObjectFactory.makeSymbol("S#39267", "CYC");
        $ic487$ = SubLObjectFactory.makeSymbol("S#39070", "CYC");
        $ic488$ = SubLObjectFactory.makeString("~&START-CHAR ~S is off for ~S~% in ~S.~%");
        $ic489$ = SubLObjectFactory.makeSymbol("S#51325", "CYC");
        $ic490$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#51677", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT", "CYC"));
        $ic491$ = SubLObjectFactory.makeString("the ");
        $ic492$ = SubLObjectFactory.makeString(", the");
        $ic493$ = SubLObjectFactory.makeKeyword("UNORDERED");
        $ic494$ = SubLObjectFactory.makeString("Adding ~S tabs to bulleted list item ~S");
        $ic495$ = SubLObjectFactory.makeString("<li>");
        $ic496$ = SubLObjectFactory.makeString("</li>");
        $ic497$ = SubLObjectFactory.makeString("*=-+");
        $ic498$ = SubLObjectFactory.makeString("Don't know how to make ordered list bullets yet.");
        $ic499$ = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $ic500$ = SubLObjectFactory.makeSymbol("S#51340", "CYC");
        $ic501$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#8569", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51678", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic502$ = SubLObjectFactory.makeSymbol("S#39308", "CYC");
        $ic503$ = SubLObjectFactory.makeSymbol("S#3648", "CYC");
        $ic504$ = SubLObjectFactory.makeKeyword("NL-PREDS");
        $ic505$ = SubLObjectFactory.makeSymbol("S#51679", "CYC");
        $ic506$ = SubLObjectFactory.makeKeyword("FORCE");
        $ic507$ = SubLObjectFactory.makeSymbol("S#51665", "CYC");
        $ic508$ = SubLObjectFactory.makeKeyword("LANGUAGE-MT");
        $ic509$ = SubLObjectFactory.makeSymbol("S#15402", "CYC");
        $ic510$ = SubLObjectFactory.makeKeyword("DOMAIN-MT");
        $ic511$ = SubLObjectFactory.makeSymbol("S#4785", "CYC");
        $ic512$ = SubLObjectFactory.makeKeyword("MODE");
        $ic513$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#51679", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#51679", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("NONE")));
        $ic514$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#51665", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*")));
        $ic515$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#15402", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*")));
        $ic516$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("S#4785", "CYC"), (SubLObject)SubLObjectFactory.makeKeyword("HTML")));
        $ic517$ = SubLObjectFactory.makeSymbol("S#748", "CYC");
        $ic518$ = SubLObjectFactory.makeKeyword("HTML");
        $ic519$ = SubLObjectFactory.makeSymbol("S#51351", "CYC");
        $ic520$ = SubLObjectFactory.makeSymbol("S#51623", "CYC");
        $ic521$ = SubLObjectFactory.makeKeyword("SUBJECT-VERB");
        $ic522$ = SubLObjectFactory.makeString("Trying to add do support but no head dtr in phrase ~S~%");
        $ic523$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Do-TheWord"));
        $ic524$ = SubLObjectFactory.makeKeyword("POS-PRED");
        $ic525$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("infinitive"));
        $ic526$ = SubLObjectFactory.makeSymbol("S#51360", "CYC");
        $ic527$ = SubLObjectFactory.makeSymbol("S#51085", "CYC");
        $ic528$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Number-General"));
        $ic529$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CharacterString"));
        $ic530$ = SubLObjectFactory.makeString("~S does not unambiguously denote ~S");
        $ic531$ = SubLObjectFactory.makeString("~S is a forbidden paraphrase for ~S");
        $ic532$ = SubLObjectFactory.makeSymbol("S#51365", "CYC");
        $ic533$ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE-PREDICATE");
        $ic534$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $ic535$ = SubLObjectFactory.makeSymbol("SKOLEM-FUNCTION-P");
        $ic536$ = SubLObjectFactory.makeInteger(500);
        $ic537$ = SubLObjectFactory.makeSymbol("S#51367", "CYC");
        $ic538$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("abnormal")));
        $ic539$ = SubLObjectFactory.makeSymbol("S#51372", "CYC");
        $ic540$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $ic541$ = SubLObjectFactory.makeSymbol("S#51625", "CYC");
        $ic542$ = SubLObjectFactory.makeSymbol("S#51000", "CYC");
        $ic543$ = SubLObjectFactory.makeKeyword("TERSE");
        $ic544$ = SubLObjectFactory.makeKeyword("PRECISE");
        $ic545$ = SubLObjectFactory.makeSymbol("S#51626", "CYC");
        $ic546$ = SubLObjectFactory.makeInteger(200);
        $ic547$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EnglishLanguage"));
        $ic548$ = SubLObjectFactory.makeSymbol("S#51383", "CYC");
        $ic549$ = SubLObjectFactory.makeString("Finding forts with multiple possible paraphrase assertions");
        $ic550$ = SubLObjectFactory.makeKeyword("SKIP");
        $ic551$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genStringAssertion"));
        $ic552$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("webFrequencyForLexicalAssertion"));
        $ic553$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nameableCollection"));
        $ic554$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $ic555$ = SubLObjectFactory.makeSymbol("?NAME");
        $ic556$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?NAME"));
        $ic557$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("adjStrings"));
        $ic558$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("untensed"));
        $ic559$ = SubLObjectFactory.makeSymbol("S#51394", "CYC");
        $ic560$ = SubLObjectFactory.makeSymbol("S#49143", "CYC");
        $ic561$ = SubLObjectFactory.makeString("Failed to find peer agr for ~S.");
        $ic562$ = SubLObjectFactory.makeSymbol("S#51396", "CYC");
        $ic563$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("plural-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("tensed")));
        $ic564$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("tensed")));
        $ic565$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("presentTense-Generic")));
        $ic566$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("CCF-SDB-Bnode-CMLS")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic567$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Collection"));
        $ic568$ = SubLObjectFactory.makeSymbol("?PRED");
        $ic569$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("generateArgOfRelnWithForm"));
        $ic570$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"));
        $ic571$ = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $ic572$ = SubLObjectFactory.makeSymbol("S#51404", "CYC");
        $ic573$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("presentPerfect-Generic"));
        $ic574$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pastPerfect-Generic"));
        $ic575$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("futurePerfect-Generic"));
        $ic576$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("presentTense-Generic"));
        $ic577$ = SubLObjectFactory.makeString("presentPerfect-Generic");
        $ic578$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("pastTense-Generic"));
        $ic579$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("futureTense-Generic"));
        $ic580$ = SubLObjectFactory.makeSymbol("S#51411", "CYC");
        $ic581$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Now"));
        $ic582$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $ic583$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Tomorrow-Indexical"));
        $ic584$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalBetweenFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Now")));
        $ic585$ = (SubLList)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic586$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("startsAfterEndingOf"));
        $ic587$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic588$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("STIB")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("STIF")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EarlyPartFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("LatePartFn"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $ic589$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $ic590$ = SubLObjectFactory.makeSymbol("S#15541", "CYC");
        $ic591$ = SubLObjectFactory.makeSymbol("S#51415", "CYC");
        $ic592$ = SubLObjectFactory.makeSymbol("S#51417", "CYC");
        $ic593$ = SubLObjectFactory.makeInteger(300);
        $ic594$ = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#34613", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#34614", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#11445", "CYC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("S#5", "CYC"));
        $ic595$ = SubLObjectFactory.makeUninternedSymbol("US#5386ECA");
        $ic596$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51627", "CYC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51420", "CYC")));
        $ic597$ = SubLObjectFactory.makeSymbol("SET-ADD");
        $ic598$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51627", "CYC"));
        $ic599$ = SubLObjectFactory.makeSymbol("PROGN");
        $ic600$ = SubLObjectFactory.makeSymbol("S#6942", "CYC");
        $ic601$ = SubLObjectFactory.makeSymbol("S#51420", "CYC");
        $ic602$ = SubLObjectFactory.makeSymbol("S#51419", "CYC");
        $ic603$ = SubLObjectFactory.makeSymbol("S#39104", "CYC");
        $ic604$ = SubLObjectFactory.makeString("Nested call: (PPH-ISA? ~S ~S ~S)");
        $ic605$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $ic606$ = SubLObjectFactory.makeSymbol("S#51424", "CYC");
        $ic607$ = SubLObjectFactory.makeSymbol("S#12275", "CYC");
        $ic608$ = SubLObjectFactory.makeInteger(256);
        $ic609$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnSufficient"));
        $ic610$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("quotedDefnIff"));
        $ic611$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("defnSufficient"));
        $ic612$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("defnIff"));
        $ic613$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IntermediateVocabTerm"));
        $ic614$ = SubLObjectFactory.makeSymbol("S#51433", "CYC");
        $ic615$ = SubLObjectFactory.makeInteger(50000);
        $ic616$ = SubLObjectFactory.makeSymbol("S#51435", "CYC");
        $ic617$ = SubLObjectFactory.makeKeyword("NOT-SURE");
        $ic618$ = SubLObjectFactory.makeSymbol("S#51628", "CYC");
        $ic619$ = SubLObjectFactory.makeInteger(1024);
        $ic620$ = SubLObjectFactory.makeSymbol("S#51436", "CYC");
        $ic621$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Relation"));
        $ic622$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("genlFunctions"));
        $ic623$ = SubLObjectFactory.makeSymbol("S#51448", "CYC");
        $ic624$ = SubLObjectFactory.makeSymbol("S#51450", "CYC");
        $ic625$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("SomethingExisting"));
        $ic626$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm"));
        $ic627$ = SubLObjectFactory.makeSymbol("S#51010", "CYC");
        $ic628$ = SubLObjectFactory.makeSymbol("S#51011", "CYC");
        $ic629$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#1993", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51680", "CYC"));
        $ic630$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTRAINTS"));
        $ic631$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51452", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51453", "CYC"));
        $ic632$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#51454", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#51455", "CYC"));
        $ic633$ = SubLObjectFactory.makeSymbol("S#51459", "CYC");
        $ic634$ = SubLObjectFactory.makeSymbol("S#51451", "CYC");
        $ic635$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("S#51011", "CYC"));
        $ic636$ = SubLObjectFactory.makeSymbol("S#51452", "CYC");
        $ic637$ = SubLObjectFactory.makeSymbol("S#51454", "CYC");
        $ic638$ = SubLObjectFactory.makeSymbol("S#51453", "CYC");
        $ic639$ = SubLObjectFactory.makeSymbol("S#51455", "CYC");
        $ic640$ = SubLObjectFactory.makeKeyword("NUM");
        $ic641$ = SubLObjectFactory.makeKeyword("CONSTRAINTS");
        $ic642$ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $ic643$ = SubLObjectFactory.makeKeyword("BEGIN");
        $ic644$ = SubLObjectFactory.makeSymbol("S#51456", "CYC");
        $ic645$ = SubLObjectFactory.makeKeyword("SLOT");
        $ic646$ = SubLObjectFactory.makeKeyword("END");
        $ic647$ = SubLObjectFactory.makeSymbol("S#51458", "CYC");
        $ic648$ = SubLObjectFactory.makeString("#<PPH-NTH-PHRASE: ~S");
        $ic649$ = SubLObjectFactory.makeString(" ~S");
        $ic650$ = SubLObjectFactory.makeString(">");
        $ic651$ = SubLObjectFactory.makeInteger(75);
        $ic652$ = SubLObjectFactory.makeSymbol("S#51466", "CYC");
        $ic653$ = SubLObjectFactory.makeSymbol("S#51464", "CYC");
        $ic654$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLGenerationPredicate"));
        $ic655$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("multiWordString"));
        $ic656$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("compoundString"));
        $ic657$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("headMedialString"));
        $ic658$ = SubLObjectFactory.makeKeyword("DEFAULT");
        $ic659$ = SubLObjectFactory.makeSymbol("S#51478", "CYC");
        $ic660$ = SubLObjectFactory.makeSymbol("S#51632", "CYC");
        $ic661$ = SubLObjectFactory.makeSymbol("S#51482", "CYC");
        $ic662$ = SubLObjectFactory.makeSymbol("S#51633", "CYC");
        $ic663$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Noun"));
        $ic664$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Pronoun")), (SubLObject)ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Pronoun"))));
        $ic665$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLSentence"));
        $ic666$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Verb"));
        $ic667$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PrepositionalPhrase"));
        $ic668$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Preposition"));
        $ic669$ = SubLObjectFactory.makeSymbol("S#51498", "CYC");
        $ic670$ = SubLObjectFactory.makeString("~&Filtering preds ~S and ~S.~%");
        $ic671$ = SubLObjectFactory.makeString("~&max-floor preds: ~S.~%");
        $ic672$ = SubLObjectFactory.makeSymbol("S#51500", "CYC");
        $ic673$ = SubLObjectFactory.makeSymbol("S#51681", "CYC");
        $ic674$ = SubLObjectFactory.makeSymbol("S#51493", "CYC");
        $ic675$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("wordStrings")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("properNameStrings")));
        $ic676$ = SubLObjectFactory.makeString("defaultAgreementPredsForInstanceList");
        $ic677$ = SubLObjectFactory.makeSymbol("?PREDS");
        $ic678$ = SubLObjectFactory.makeKeyword("QUESTION");
        $ic679$ = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $ic680$ = SubLObjectFactory.makeSymbol("?ROOT-MT");
        $ic681$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("paraphraseRootMtForLanguage"));
        $ic682$ = SubLObjectFactory.makeSymbol("?MT");
        $ic683$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("validatedLexicalMtsForLanguage"));
        $ic684$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?MT"));
        $ic685$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $ic686$ = SubLObjectFactory.makeString("~&Based on morphology, using new agr pred: ~S.");
        $ic687$ = SubLObjectFactory.makeKeyword("ASDF");
        $ic688$ = SubLObjectFactory.makeKeyword("ARG1");
        $ic689$ = SubLObjectFactory.makeString("~&#$genTemplate-Constrained is available for~% ~S.~%");
        $ic690$ = SubLObjectFactory.makeString("~&#$genFormat-ArgFixed is available for~% ~S.~%");
        $ic691$ = SubLObjectFactory.makeSymbol("S#15497", "CYC");
        $ic692$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("examplePredSentences"));
        $ic693$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("exampleNATs"));
        $ic694$ = SubLObjectFactory.makeSymbol("?ARITY");
        $ic695$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("arity"));
        $ic696$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ARITY"));
        $ic697$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), (SubLObject)module0751.NIL);
        $ic698$ = SubLObjectFactory.makeSymbol("S#51518", "CYC");
        $ic699$ = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SUBJECT-VERB"), SubLObjectFactory.makeKeyword("DET-NBAR"), SubLObjectFactory.makeKeyword("POS-PRED"), SubLObjectFactory.makeKeyword("CLARIFYING"), SubLObjectFactory.makeKeyword("NL-PREDS"), SubLObjectFactory.makeKeyword("PEER"), SubLObjectFactory.makeKeyword("TENSE"), SubLObjectFactory.makeKeyword("DONT-CARE"), SubLObjectFactory.makeKeyword("IMPOSSIBLE") });
        $ic700$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POS-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("NL-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("DONT-CARE"), (SubLObject)SubLObjectFactory.makeKeyword("IMPOSSIBLE"));
        $ic701$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUBJECT-VERB"), (SubLObject)SubLObjectFactory.makeKeyword("DET-NBAR"), (SubLObject)SubLObjectFactory.makeKeyword("PEER"), (SubLObject)SubLObjectFactory.makeKeyword("TENSE"), (SubLObject)SubLObjectFactory.makeKeyword("CLARIFYING"));
        $ic702$ = SubLObjectFactory.makeKeyword("DONT-CARE");
        $ic703$ = SubLObjectFactory.makeKeyword("IMPOSSIBLE");
        $ic704$ = SubLObjectFactory.makeKeyword("PEER");
        $ic705$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("NLIndexAttribute"));
        $ic706$ = SubLObjectFactory.makeString("<[a-z]+[^>]*>");
        $ic707$ = SubLObjectFactory.makeString("</[a-z]+[^>]*>");
        $ic708$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("a"));
        $ic709$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("a"));
        $ic710$ = SubLObjectFactory.makeString("Regex is not behaving as expected.~% ~S~% returned ~S instead of ~S~%");
        $ic711$ = SubLObjectFactory.makeSymbol("S#51542", "CYC");
        $ic712$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASELESS"));
        $ic713$ = SubLObjectFactory.makeString("Regex error finding open tags:~% ~A");
        $ic714$ = SubLObjectFactory.makeString("Don't have valid grep patterns for html tags.");
        $ic715$ = SubLObjectFactory.makeString("Regex error finding close tags:~% ~A");
        $ic716$ = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $ic717$ = SubLObjectFactory.makeSymbol("ATOM");
        $ic718$ = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("S#39248", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39249", "CYC"));
        $ic719$ = SubLObjectFactory.makeSymbol("S#51016", "CYC");
        $ic720$ = ConsesLow.list(constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist")), constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("ist-Intermediate")));
        $ic721$ = SubLObjectFactory.makeKeyword("PPH-NULL-MT-SCOPE");
        $ic722$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TemporalMicrotheory"));
        $ic723$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("PolyadicMicrotheory"));
        $ic724$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $ic725$ = SubLObjectFactory.makeSymbol("EL-WFT?");
        $ic726$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("TimeInterval"));
        $ic727$ = SubLObjectFactory.makeSymbol("GET-ALL-PRETTY-STRINGS");
        $ic728$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("prettyString"));
        $ic729$ = SubLObjectFactory.makeSymbol("GET-PRETTY-STRING-CANONICAL");
        $ic730$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("prettyString-Canonical"));
        $ic731$ = SubLObjectFactory.makeInteger(100000);
        $ic732$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt"));
        $ic733$ = SubLObjectFactory.makeString("Generating pretty strings...");
        $ic734$ = SubLObjectFactory.makeSymbol("S#7310", "CYC");
        $ic735$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#50606", "CYC"));
        $ic736$ = constant_handles_oc.f8479((SubLObject)SubLObjectFactory.makeString("UnaryFunction"));
        $ic737$ = SubLObjectFactory.makeSymbol("KEYWORDP");
        $ic738$ = SubLObjectFactory.makeInteger(60);
        $ic739$ = SubLObjectFactory.makeInteger(120);
        $ic740$ = SubLObjectFactory.makeSymbol("S#39488", "CYC");
        $ic741$ = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S#39489", "CYC"), (SubLObject)SubLObjectFactory.makeSymbol("S#39488", "CYC"));
        $ic742$ = SubLObjectFactory.makeSymbol("S#39489", "CYC");
        $ic743$ = SubLObjectFactory.makeSymbol("S#39490", "CYC");
        $ic744$ = SubLObjectFactory.makeSymbol("S#39491", "CYC");
        $ic745$ = SubLObjectFactory.makeString("Hit hard timeout of ~D seconds generating pretty strings for~% ~S");
        $ic746$ = SubLObjectFactory.makeString("Hit soft timeout of ~D seconds generating pretty strings for~% ~S");
    }
    
    public static final class $f46647$UnaryFunction extends UnaryFunction
    {
        public $f46647$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50946"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f46647(var72);
        }
    }
    
    public static final class $f46676$UnaryFunction extends UnaryFunction
    {
        public $f46676$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#44567"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f46676(var72);
        }
    }
    
    public static final class $f46708$UnaryFunction extends UnaryFunction
    {
        public $f46708$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50953"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f46708(var72);
        }
    }
    
    public static final class $f46752$UnaryFunction extends UnaryFunction
    {
        public $f46752$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50958"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f46752(var72);
        }
    }
    
    public static final class $f46759$UnaryFunction extends UnaryFunction
    {
        public $f46759$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50960"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f46759(var72);
        }
    }
    
    public static final class $f46765$UnaryFunction extends UnaryFunction
    {
        public $f46765$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50962"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f46765(var72);
        }
    }
    
    public static final class $f46776$BinaryFunction extends BinaryFunction
    {
        public $f46776$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50963"));
        }
        
        public SubLObject processItem(final SubLObject var72, final SubLObject var74) {
            return module0751.f46776(var72, var74);
        }
    }
    
    public static final class $f46819$UnaryFunction extends UnaryFunction
    {
        public $f46819$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50969"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f46819(var72);
        }
    }
    
    public static final class $f46703$UnaryFunction extends UnaryFunction
    {
        public $f46703$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#50970"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f46703(var72);
        }
    }
    
    public static final class $f47014$BinaryFunction extends BinaryFunction
    {
        public $f47014$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51000"));
        }
        
        public SubLObject processItem(final SubLObject var72, final SubLObject var74) {
            return module0751.f47014(var72, var74, (SubLObject)$f47014$BinaryFunction.UNPROVIDED, (SubLObject)$f47014$BinaryFunction.UNPROVIDED, (SubLObject)$f47014$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f46817$UnaryFunction extends UnaryFunction
    {
        public $f46817$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51005"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f46817(var72);
        }
    }
    
    public static final class $f47065$BinaryFunction extends BinaryFunction
    {
        public $f47065$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51007"));
        }
        
        public SubLObject processItem(final SubLObject var72, final SubLObject var74) {
            return module0751.f47065(var72, var74, (SubLObject)$f47065$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f47069$BinaryFunction extends BinaryFunction
    {
        public $f47069$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51008"));
        }
        
        public SubLObject processItem(final SubLObject var72, final SubLObject var74) {
            return module0751.f47069(var72, var74, (SubLObject)$f47069$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f46849$BinaryFunction extends BinaryFunction
    {
        public $f46849$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51009"));
        }
        
        public SubLObject processItem(final SubLObject var72, final SubLObject var74) {
            return module0751.f46849(var72, var74, (SubLObject)$f46849$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $sX51010_native extends SubLStructNative
    {
        public SubLObject $num;
        public SubLObject $constraints;
        private static final SubLStructDeclNative structDecl;
        
        public $sX51010_native() {
            this.$num = (SubLObject)CommonSymbols.NIL;
            this.$constraints = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sX51010_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$num;
        }
        
        public SubLObject getField3() {
            return this.$constraints;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$num = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$constraints = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sX51010_native.class, module0751.$ic627$, module0751.$ic628$, module0751.$ic629$, module0751.$ic630$, new String[] { "$num", "$constraints" }, module0751.$ic631$, module0751.$ic632$, module0751.$ic633$);
        }
    }
    
    public static final class $f47087$UnaryFunction extends UnaryFunction
    {
        public $f47087$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51011"));
        }
        
        public SubLObject processItem(final SubLObject var72) {
            return module0751.f47087(var72);
        }
    }
    
    public static final class $f47132$BinaryFunction extends BinaryFunction
    {
        public $f47132$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51012"));
        }
        
        public SubLObject processItem(final SubLObject var72, final SubLObject var74) {
            return module0751.f47132(var72, var74, (SubLObject)$f47132$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $f47194$BinaryFunction extends BinaryFunction
    {
        public $f47194$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("S#51016"));
        }
        
        public SubLObject processItem(final SubLObject var72, final SubLObject var74) {
            return module0751.f47194(var72, var74, (SubLObject)$f47194$BinaryFunction.UNPROVIDED);
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/cycjava/cycl/module0751.class
	Total time: 7639 ms
	 synthetic 
	Decompiled with Procyon 0.5.32.
*/